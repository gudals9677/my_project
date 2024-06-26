package kr.co.springboard.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDTO {

    private Integer no;
    private Integer parent;
    private Integer comment;
    private String cate;
    private String title;
    private String content;
    private Integer file;
    private Integer hit;
    private String writer;
    private String regip;
    private LocalDateTime rdate;

    private List<MultipartFile> files;
    private List<FileDTO> fileList;

    private UserDTO user;

}
