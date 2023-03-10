import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.beans.JavaBean;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Albums implements Serializable {
    private int id;
    private String artist;
    private String album_name;
    private int release_date;
    private double sales;
    private String genre;

}


//        id
//        artist
//        album_name
//        release_date
//        sales
//        genre