package fr.valarep.mars.classes;

import fr.valarep.mars.interfaces.IVehicule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;

class PlayTest {

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void executeRoverNoInstructionShouldReturn00() {
        // Arrange
        IVehicule vehicule = Mockito.mock(Rover.class);
        String[] instructions = new String[0];
        Play play = new Play(vehicule, instructions);

        // Act
        play.execute();

        // Assert
        assertThat(vehicule.getX()).isEqualTo(0);
        assertThat(vehicule.getY()).isEqualTo(0);

    }
}
