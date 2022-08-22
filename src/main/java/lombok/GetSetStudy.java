package lombok;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class GetSetStudy {

    private int id;

    private String loginId;

    private String emailId;

    private boolean isActive;


}
