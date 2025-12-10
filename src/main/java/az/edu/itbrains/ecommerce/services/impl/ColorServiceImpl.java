package az.edu.itbrains.ecommerce.services.impl;

import az.edu.itbrains.ecommerce.dtos.color.ColorDto;
import az.edu.itbrains.ecommerce.model.Color;
import az.edu.itbrains.ecommerce.repositories.ColorRepository;
import az.edu.itbrains.ecommerce.services.ColorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<ColorDto> getAllColors() {
        List<Color>colors=colorRepository.findAll();
        if(!colors.isEmpty()){
            return colors.stream().map(color -> modelMapper.map(color,ColorDto.class)).toList();
        }
        return List.of();
    }
}
