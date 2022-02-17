package com.keyflare.podlodkacompose.data

import android.net.Uri
import com.keyflare.podlodkacompose.domain.Comment
import com.keyflare.podlodkacompose.domain.GameDetails
import com.keyflare.podlodkacompose.domain.Gameplay
import com.keyflare.podlodkacompose.domain.Rating

object Repository {

    private val dota = GameDetails(
        cover = Uri.parse("https://lh3.googleusercontent.com/0nfIC1VWk_s5_bke9o9SOcjJoyUQbLyWvruVhjtIJ1ThVYwksOcurXzCmA5szXiWn-VE5Oi70LMBJ_kbYDOu93JSZE9PaL-Pl1hEW_oXhKG5sZgcgKaN6ajNXVB9gg-DPPRy9vK-NaMFtXDWGrhcKXhhclUlr6-iu5YA_CUig7berWJy5eHo8mOJSEqGt3hY2e6qCpMyEX4VUNj55_jtVLFBzpKOiLQNM_5j3B-xEIzJjU_ZfBq6LG26yfwi1VSb0gd69j81wqD169gqChDup4e1wVKcX9gbhcjizg7vF39j6FC4KISjeiL7h4ide0CD48TLWPhthU45hpS6wxos0TxFmYp3qjIZRTz5VkKqBeghvAMNsVNWnLvOiozIuGEyRGA6xo6DQW0zNHNzKHbJfkSWCG3zRzb8WhSoqJuqfIR3jw6ljo_Fk5wbX4IULp2PnuXhoM3_KV3HE4_8YKOqLnTEbdkECKoR2whR4d96ULGSVlTSstnQymdEqPTELDNqq_SBdrEhaOJva6YaRujqP8szsRMW_eKBnM2CyVR3-vEn8ISlA5t1rvu_eEqjNUVBqNmppuhYDr2uAFnn_5BjRa5OJu7NxbhExyw6PQBbeZdeY8QekrqCslJtVwsjRGDOOxF6xeKqjydL_6TQFQotWFjpNgkhj1SMLRYMLCw0dhkS2tv9VqP_8IzxgPwdJzY7lm-lYQbbIRIiX4eSPlSXFIVg=w2196-h1914-no?authuser=0"),
        icon = Uri.parse("https://lh3.googleusercontent.com/OeM-gwU4WfV453uXyaWfq56wInX8e1MCDLfrvLl85eXn1-5EvAVd5QzUqbrnP-Ok2_0h_56dnSexjaqk4ZM9GMh-raWpR_Iex6g-eieKzW4PGrZmstoJjWn7aDtkOnM7Iz5I-Sm0uWvOqXVYUf7DjZJBwN2aU_cxRBnN0XljCUmyyLuUKBzV80yoKcvXiCa1sjXT-XxdlOpcMg0pTG5kbVy4BoHSg1X6qz7tfZ4E3XkbfBo9xnQhcOl2SZeF_bYSCZFZcOh-WxgD9cJ0m7o514v2BsJgho2YiYEnVFm3CSY-mM4oTRDvqgMb7YtjIYOSGWZqDJjEtBQuQOIqXKfxvhaM4wJAK8Qo6lQYySuGDKHU4V6UVPT4TUchgIrJqAfiCr9ahAhAY_QFa4DZ-Mn2gS98oeDVNZUPqG_IEml3R6Jm5WuK7b4sny0ngRmnO1yxMAo4ME78DynZJcvN01Lqc-H8wSJRg7YjKyNsn2sDRlckjgCXWULrNN0_kn8b0z5hi95-QkGIipjUFIl6OjqBTn9tbvviqo0BlCuTxtjNP0W1lOJa1WBwxjrY-pEn42Zul37sr8pqsfJuGFr4-YT1fD8zDH0r82_CS5CScjhPsMogjvnvTy4f8Dxl9bgsRuCO2AvtpT1i_zHPJI6UnYhiOSBsCQaCloxXB5mRbg19a469qWa8Q9qN3PwW0ghGxlUr0PjbWttfL9J0yXhP1eKqVP1c=s324-no?authuser=0"),
        title = "DoTA 2",
        rating = Rating(
            value = 4.9f,
            reviewersNumber = "70M"
        ),
        tags = listOf("moba", "multiplayer", "strategy"),
        description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        gameplay = Gameplay(
            Uri.EMPTY,
            listOf(
                Uri.parse("https://lh3.googleusercontent.com/0nfIC1VWk_s5_bke9o9SOcjJoyUQbLyWvruVhjtIJ1ThVYwksOcurXzCmA5szXiWn-VE5Oi70LMBJ_kbYDOu93JSZE9PaL-Pl1hEW_oXhKG5sZgcgKaN6ajNXVB9gg-DPPRy9vK-NaMFtXDWGrhcKXhhclUlr6-iu5YA_CUig7berWJy5eHo8mOJSEqGt3hY2e6qCpMyEX4VUNj55_jtVLFBzpKOiLQNM_5j3B-xEIzJjU_ZfBq6LG26yfwi1VSb0gd69j81wqD169gqChDup4e1wVKcX9gbhcjizg7vF39j6FC4KISjeiL7h4ide0CD48TLWPhthU45hpS6wxos0TxFmYp3qjIZRTz5VkKqBeghvAMNsVNWnLvOiozIuGEyRGA6xo6DQW0zNHNzKHbJfkSWCG3zRzb8WhSoqJuqfIR3jw6ljo_Fk5wbX4IULp2PnuXhoM3_KV3HE4_8YKOqLnTEbdkECKoR2whR4d96ULGSVlTSstnQymdEqPTELDNqq_SBdrEhaOJva6YaRujqP8szsRMW_eKBnM2CyVR3-vEn8ISlA5t1rvu_eEqjNUVBqNmppuhYDr2uAFnn_5BjRa5OJu7NxbhExyw6PQBbeZdeY8QekrqCslJtVwsjRGDOOxF6xeKqjydL_6TQFQotWFjpNgkhj1SMLRYMLCw0dhkS2tv9VqP_8IzxgPwdJzY7lm-lYQbbIRIiX4eSPlSXFIVg=w2196-h1914-no?authuser=0"),
                Uri.parse("https://lh3.googleusercontent.com/0nfIC1VWk_s5_bke9o9SOcjJoyUQbLyWvruVhjtIJ1ThVYwksOcurXzCmA5szXiWn-VE5Oi70LMBJ_kbYDOu93JSZE9PaL-Pl1hEW_oXhKG5sZgcgKaN6ajNXVB9gg-DPPRy9vK-NaMFtXDWGrhcKXhhclUlr6-iu5YA_CUig7berWJy5eHo8mOJSEqGt3hY2e6qCpMyEX4VUNj55_jtVLFBzpKOiLQNM_5j3B-xEIzJjU_ZfBq6LG26yfwi1VSb0gd69j81wqD169gqChDup4e1wVKcX9gbhcjizg7vF39j6FC4KISjeiL7h4ide0CD48TLWPhthU45hpS6wxos0TxFmYp3qjIZRTz5VkKqBeghvAMNsVNWnLvOiozIuGEyRGA6xo6DQW0zNHNzKHbJfkSWCG3zRzb8WhSoqJuqfIR3jw6ljo_Fk5wbX4IULp2PnuXhoM3_KV3HE4_8YKOqLnTEbdkECKoR2whR4d96ULGSVlTSstnQymdEqPTELDNqq_SBdrEhaOJva6YaRujqP8szsRMW_eKBnM2CyVR3-vEn8ISlA5t1rvu_eEqjNUVBqNmppuhYDr2uAFnn_5BjRa5OJu7NxbhExyw6PQBbeZdeY8QekrqCslJtVwsjRGDOOxF6xeKqjydL_6TQFQotWFjpNgkhj1SMLRYMLCw0dhkS2tv9VqP_8IzxgPwdJzY7lm-lYQbbIRIiX4eSPlSXFIVg=w2196-h1914-no?authuser=0"),
                Uri.parse("https://lh3.googleusercontent.com/0nfIC1VWk_s5_bke9o9SOcjJoyUQbLyWvruVhjtIJ1ThVYwksOcurXzCmA5szXiWn-VE5Oi70LMBJ_kbYDOu93JSZE9PaL-Pl1hEW_oXhKG5sZgcgKaN6ajNXVB9gg-DPPRy9vK-NaMFtXDWGrhcKXhhclUlr6-iu5YA_CUig7berWJy5eHo8mOJSEqGt3hY2e6qCpMyEX4VUNj55_jtVLFBzpKOiLQNM_5j3B-xEIzJjU_ZfBq6LG26yfwi1VSb0gd69j81wqD169gqChDup4e1wVKcX9gbhcjizg7vF39j6FC4KISjeiL7h4ide0CD48TLWPhthU45hpS6wxos0TxFmYp3qjIZRTz5VkKqBeghvAMNsVNWnLvOiozIuGEyRGA6xo6DQW0zNHNzKHbJfkSWCG3zRzb8WhSoqJuqfIR3jw6ljo_Fk5wbX4IULp2PnuXhoM3_KV3HE4_8YKOqLnTEbdkECKoR2whR4d96ULGSVlTSstnQymdEqPTELDNqq_SBdrEhaOJva6YaRujqP8szsRMW_eKBnM2CyVR3-vEn8ISlA5t1rvu_eEqjNUVBqNmppuhYDr2uAFnn_5BjRa5OJu7NxbhExyw6PQBbeZdeY8QekrqCslJtVwsjRGDOOxF6xeKqjydL_6TQFQotWFjpNgkhj1SMLRYMLCw0dhkS2tv9VqP_8IzxgPwdJzY7lm-lYQbbIRIiX4eSPlSXFIVg=w2196-h1914-no?authuser=0"),
                Uri.parse("https://lh3.googleusercontent.com/0nfIC1VWk_s5_bke9o9SOcjJoyUQbLyWvruVhjtIJ1ThVYwksOcurXzCmA5szXiWn-VE5Oi70LMBJ_kbYDOu93JSZE9PaL-Pl1hEW_oXhKG5sZgcgKaN6ajNXVB9gg-DPPRy9vK-NaMFtXDWGrhcKXhhclUlr6-iu5YA_CUig7berWJy5eHo8mOJSEqGt3hY2e6qCpMyEX4VUNj55_jtVLFBzpKOiLQNM_5j3B-xEIzJjU_ZfBq6LG26yfwi1VSb0gd69j81wqD169gqChDup4e1wVKcX9gbhcjizg7vF39j6FC4KISjeiL7h4ide0CD48TLWPhthU45hpS6wxos0TxFmYp3qjIZRTz5VkKqBeghvAMNsVNWnLvOiozIuGEyRGA6xo6DQW0zNHNzKHbJfkSWCG3zRzb8WhSoqJuqfIR3jw6ljo_Fk5wbX4IULp2PnuXhoM3_KV3HE4_8YKOqLnTEbdkECKoR2whR4d96ULGSVlTSstnQymdEqPTELDNqq_SBdrEhaOJva6YaRujqP8szsRMW_eKBnM2CyVR3-vEn8ISlA5t1rvu_eEqjNUVBqNmppuhYDr2uAFnn_5BjRa5OJu7NxbhExyw6PQBbeZdeY8QekrqCslJtVwsjRGDOOxF6xeKqjydL_6TQFQotWFjpNgkhj1SMLRYMLCw0dhkS2tv9VqP_8IzxgPwdJzY7lm-lYQbbIRIiX4eSPlSXFIVg=w2196-h1914-no?authuser=0"),
            )
        ),
        comments = listOf(
            Comment(
                avatar = Uri.parse("https://lh3.googleusercontent.com/C2BXkWdd5fweOaMKhaTVSU2T7Bk4I9uFR22ycpiFvMDnG-mxLQIUpdSLazBFk7fQJ5EKjC54Ocwf_Kw9QNH7PdqYoaIZ3KH3u5aFmX-UvodQnOhxBM0I_54gDJ6ZeRJ0-t5wxPmPw5LeHzMfx3Tuekf0QxB7jaDQqD8jJhH6sYnFZ4An8TvWLNPqM5c-Z8oiXkXvV7X_kif-X3-AdDVcVkMsmuNcfmcEBYw1ug2E6DoZdisGO9f8rlx_lB7QzsBR3CwNt0siQwgN4Nfrip_w8p7drca-3qZUymZjMho9V5AQrzgoWRZt9NsyszhlQabV0Ya0-c2MRULzLvghr4SlHY2H3hm4v5DB_b5yvE7495s93t_1LUSc-9iPjNgtIevJxgnF-z2qunMg6jrYLhu1iKvBQR2Wtr010Zbr0Nh9q_XXb3a3UBsubQ6av6RTB4bq2eMtqbxtIQc6RWvS97EhSLXncsAg6jnv9jir_kj9v6cmNmXhuoycUJpi0UeW_CQlm0gNdfZvwiO7z5At0R5HvwXj4g6JVmYxEmGpvvX9EH2glvdb9Od_Y_L2q6lL2AWJqpGCdFoyHGgq6hlHSUCvFAfCw7S8Y4PbP2Mdc1a6kIyIfgxplGGvLVsC6mx8THfIfhXNquzmNHn5nr4VSt2nrkD5wtPsK81W9CpHZMtlxUrzzwga1U0fZ2H1_EAgh6K7GN9EldmBH-RN5T8K1rbwR13Y=s225-no?authuser=0"),
                name = "John Johnovich",
                date = "February 14, 2021",
                comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            ),
            Comment(
                avatar = Uri.parse("https://lh3.googleusercontent.com/ht2d20zjzif0ARY8YTffSS7ky1qVqCIWqJ42ytMWFAqY128qefxwgJB_c8qM9U24mmgb1BOjmPNXHnGXGLQxHRw1ZURDoVnZJ9Q1BMOgZSpkccHDrm_bXne9uhwPsvA9XrOhz6gb8mcxitYMYkwS-doSfFVIek_TDS4mr_dluofpzExFARukopV3Eu8YMjsbA2ZtEsU9WZHhm_P_ySbpR1OGNPK6INrHJqe2mwX7TtR97xl989oIskesH3t5Wrd0JMCK7gF4DoJk_If6fAXpbWYJTevSYlWedSOAtEuyAADh6oKHYoQsZBSyKiLXbmIs92VHkkim7lYzGbQujARl9wIGDtjlDEM6DlJYG1nl-PGvyQP9lIe9mNCjL4DXr8f1NN53jOegqwmlD1yl4idR07gu1QmhUs8HJPAM1sdellG9fcu0-wXKiYxhMEmKMbYnywjPK0tNUkT30gtU_ZwAiNFceUAI0ZYosF6_m_5Qd4BZkU4kgY0IneOegT6uS8TaaTus1hQUJXNRq0NBWNFrLmJEVYiS_XgXe2SK1DL1BjKJwVxm0sYe5phLyUV9Nsbt4IHLkg-PS2hGylY5kWO47VA7LbodicXZQMFLP5A-rx6G1Q-irtunvC0oKocZ_JpRZ9uHJTXzUbSTXxJOXqK7sU0xGtIMt7rH9nvXtsS0IgrC-qRGkCADyZy9R6YDI1osa_XFFnJT-5CSLIEBvy3SEjS3=w228-h221-no?authuser=0"),
                name = "Mary Marinovna",
                date = "February 15, 2021",
                comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            )
        )
    )

    fun loadGame() = dota
}
