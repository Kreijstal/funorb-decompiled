/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteFrame {
    static String field_a;
    private Sprite[] field_f;
    static String field_h;
    static String field_e;
    static SceneWidget field_d;
    static PairedSceneWidget field_g;
    static String field_b;
    static String field_c;
    static Sprite[] field_i;

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        NineSliceHelpers.drawNineSliceFrame(param4, param0, -27327, param3, this.field_f, param1);
        if (param2 >= -85) {
          field_d = (SceneWidget) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 != 0) {
          field_g = (PairedSceneWidget) null;
        }
        field_h = null;
        field_c = null;
        field_i = null;
        field_b = null;
        field_a = null;
    }

    final static void pushClipState(int param0) {
        ClipState var1 = (ClipState) (NameCheckRequest.field_a.removeLast(true));
        if (var1 == null) {
          var1 = new ClipState();
        }
        if (param0 != 65280) {
          return;
        }
        var1.set(SoftwareRasterizer.field_c, SoftwareRasterizer.field_l, (byte) 27, SoftwareRasterizer.field_k, SoftwareRasterizer.field_h, SoftwareRasterizer.field_j, SoftwareRasterizer.field_e, SoftwareRasterizer.field_i);
        Js5Transport.field_j.addLast(var1, -1);
    }

    final static void applyColourTheme(byte[] param0, byte param1) {
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$20 = 0;
        int incrementValue$19 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int incrementValue$5 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 == null) {
            return;
          }
          if (34 == param0.length) {
            var2_int = 0;
            QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[0];
            QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[0];
            QuickChatCategoryCache.field_d[1] = GameApplet.field_z[0];
            QuickChatCategoryCache.field_d[3] = ViewControllerHelpers.field_b[0];
            incrementValue$7 = var2_int;
            var2_int++;
            incrementValue$8 = var2_int;
            var2_int++;
            incrementValue$9 = var2_int;
            var2_int++;
            var3 = (param0[incrementValue$7] << 16 & 16711680) - (-(param0[incrementValue$8] << 8 & 65280) - (param0[incrementValue$9] & 255));
            for (var4 = 0; AlternateUsernameCredentials.field_n.length > var4; var4++) {
              if (~(AlternateUsernameCredentials.field_n[var4][0] << 16) == ~(var3 & 16711680) &&
                AlternateUsernameCredentials.field_n[var4][1] << 8 == (65280 & var3) &&
                (var3 & 255) == AlternateUsernameCredentials.field_n[var4][2]) {
                QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[var4];
              }
            }
            incrementValue$10 = var2_int;
            var2_int++;
            incrementValue$11 = var2_int;
            var2_int++;
            incrementValue$12 = var2_int;
            var2_int++;
            var3 = ((255 & param0[incrementValue$10]) << 16) + (((param0[incrementValue$11] & 255) << 8) + (param0[incrementValue$12] & 255));
            for (var4 = 0; var4 < GameApplet.field_z.length; var4++) {
              if ((16711680 & var3) == GameApplet.field_z[var4][0] << 16 &&
                (var3 & 65280) == GameApplet.field_z[var4][1] << 8 &&
                (var3 & 255) == GameApplet.field_z[var4][2]) {
                QuickChatCategoryCache.field_d[1] = GameApplet.field_z[var4];
              }
            }
            incrementValue$13 = var2_int;
            var2_int++;
            incrementValue$14 = var2_int;
            var2_int++;
            incrementValue$15 = var2_int;
            var2_int++;
            var3 = ((255 & param0[incrementValue$13]) << 16) - (-(param0[incrementValue$14] << 8 & 65280) - (255 & param0[incrementValue$15]));
            for (var4 = 0; IsaacCipher.field_d.length > var4; var4++) {
              if (~(IsaacCipher.field_d[var4][0] << 16) == ~(var3 & 16711680) &&
                IsaacCipher.field_d[var4][1] << 8 == (65280 & var3) &&
                IsaacCipher.field_d[var4][2] == (var3 & 255)) {
                QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[var4];
              }
            }
            incrementValue$16 = var2_int;
            var2_int++;
            incrementValue$17 = var2_int;
            var2_int++;
            incrementValue$18 = var2_int;
            var2_int++;
            var3 = ((param0[incrementValue$16] & 255) << 16) + ((255 & param0[incrementValue$17]) << 8) + (255 & param0[incrementValue$18]);
            for (var4 = 0; ViewControllerHelpers.field_b.length > var4; var4++) {
              if (~(ViewControllerHelpers.field_b[var4][0] << 16) == ~(var3 & 16711680) &&
                ViewControllerHelpers.field_b[var4][1] << 8 == (var3 & 65280) &&
                (var3 & 255) == ViewControllerHelpers.field_b[var4][2]) {
                QuickChatCategoryCache.field_d[3] = ViewControllerHelpers.field_b[var4];
              }
            }
            for (var4 = 0; var4 < 6; var4++) {
              incrementValue$20 = var2_int;
              var2_int++;
              MenuInputState.field_c[var4] = param0[incrementValue$20];
            }
            for (var4 = 0; var4 < 16; var4++) {
              incrementValue$19 = var2_int;
              var2_int++;
              ThrowableFormatHelpers.field_f[var4] = NameValidator.bitAnd((int) param0[incrementValue$19], 255);
              if (255 != ThrowableFormatHelpers.field_f[var4]) {
                if (0 > ThrowableFormatHelpers.field_f[var4]) {
                  ThrowableFormatHelpers.field_f[var4] = NameValidator.bitAnd(ThrowableFormatHelpers.field_f[var4], 255);
                } else {
                  if (6 > ThrowableFormatHelpers.field_f[var4]) {
                    if (ThrowableFormatHelpers.field_f[var4] == 1) {
                      ThrowableFormatHelpers.field_f[var4] = 2;
                    } else {
                      if (2 != ThrowableFormatHelpers.field_f[var4]) {
                        if (ThrowableFormatHelpers.field_f[var4] == 3) {
                          ThrowableFormatHelpers.field_f[var4] = 6;
                        } else {
                          if (ThrowableFormatHelpers.field_f[var4] != 4) {
                            if (ThrowableFormatHelpers.field_f[var4] == 5) {
                              ThrowableFormatHelpers.field_f[var4] = 8;
                            }
                          } else {
                            ThrowableFormatHelpers.field_f[var4] = 10;
                          }
                        }
                      } else {
                        ThrowableFormatHelpers.field_f[var4] = 4;
                      }
                    }
                  } else {
                    ThrowableFormatHelpers.field_f[var4] = ThrowableFormatHelpers.field_f[var4] + 6;
                  }
                }
              } else {
                ThrowableFormatHelpers.field_f[var4] = -1;
              }
            }
          } else {
            var2_int = 0;
            var3 = param0[var2_int++];
            if (var3 > 0) {
              return;
            }
            if (var3 >= 0) {
              incrementValue$1 = var2_int;
              var2_int++;
              QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[NameValidator.bitAnd((int) param0[incrementValue$1], 255)];
              incrementValue$2 = var2_int;
              var2_int++;
              QuickChatCategoryCache.field_d[1] = GameApplet.field_z[NameValidator.bitAnd(255, (int) param0[incrementValue$2])];
              incrementValue$3 = var2_int;
              var2_int++;
              QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[NameValidator.bitAnd((int) param0[incrementValue$3], 255)];
              incrementValue$4 = var2_int;
              var2_int++;
              QuickChatCategoryCache.field_d[3] = ViewControllerHelpers.field_b[NameValidator.bitAnd(255, (int) param0[incrementValue$4])];
              for (var4 = 0; var4 < 6; var4++) {
                incrementValue$6 = var2_int;
                var2_int++;
                MenuInputState.field_c[var4] = param0[incrementValue$6];
              }
              for (var4 = 0; 16 > var4; var4++) {
                incrementValue$5 = var2_int;
                var2_int++;
                ThrowableFormatHelpers.field_f[var4] = NameValidator.bitAnd(255, (int) param0[incrementValue$5]);
                if (ThrowableFormatHelpers.field_f[var4] == 255) {
                  ThrowableFormatHelpers.field_f[var4] = -1;
                }
              }
            }
          }
          if (param1 > -38) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_79_0 = var2;
          stackIn_79_1 = new StringBuilder().append("ec.B(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(')').toString());
        }
    }

    SpriteFrame(Sprite[] param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Join <%0>'s game";
        field_h = "This is the Book of Storm. Storm spells focus on direct attacks and powerful wind effects. You require 5 wands to purchase this spellbook; you currently have ";
        field_e = "That name is not available";
        field_b = "Game";
    }
}
