import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {

    private int id;
    private String content;

    private Author author;
}

//          id
//        author
//        content