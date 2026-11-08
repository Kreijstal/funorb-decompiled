/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameUiSupport {
    static long field_c;
    static boolean field_e;
    static String field_d;
    static String field_b;
    static TrinketSlot field_a;

    final static int approximateSquareRootFixed8(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = Kickabout.field_G;
        if (param0 == 0) {
          return 0;
        }
        if (param1 == -524289) {
          if (0 > param0) {
            throw new IllegalArgumentException("");
          }
          if (param0 < 32768) {
            if (param0 >= 128) {
              if (param0 < 2048) {
                var2 = (param0 >= 512) ? 3 : 4;
              } else {
                var2 = (param0 >= 8192) ? 1 : 2;
              }
            } else {
              if (param0 >= 8) {
                var2 = (32 > param0) ? 6 : 5;
              } else {
                if (param0 < 2) {
                  return 256;
                }
                var2 = 7;
              }
            }
            param0 = param0 << (var2 << 1);
            return MenuSelection.field_f[param0 - 32768] >> var2;
          }
          if (131072 > param0) {
            return MenuSelection.field_f[-32768 + param0];
          }
          if (param0 >= 33554432) {
            if (param0 >= 536870912) {
              var2Lifetime3 = 7;
            } else {
              var2Lifetime3 = (134217728 <= param0) ? 6 : 5;
            }
          } else {
            if (param0 < 2097152) {
              var2Lifetime3 = (param0 < 524288) ? 1 : 2;
            } else {
              var2Lifetime3 = (8388608 > param0) ? 3 : 4;
            }
          }
          param0 = param0 >> (var2Lifetime3 << 1);
          return MenuSelection.field_f[param0 - 32768] << var2Lifetime3;
        }
        field_a = (TrinketSlot) null;
        if (0 > param0) {
          throw new IllegalArgumentException("");
        }
        if (param0 >= 32768) {
          if (131072 > param0) {
            return MenuSelection.field_f[-32768 + param0];
          }
          if (param0 >= 33554432) {
            if (param0 >= 536870912) {
              var2Lifetime1 = 7;
            } else {
              var2Lifetime1 = (134217728 > param0) ? 5 : 6;
            }
          } else {
            if (param0 < 2097152) {
              var2Lifetime1 = (param0 >= 524288) ? 2 : 1;
            } else {
              var2Lifetime1 = (8388608 <= param0) ? 4 : 3;
            }
          }
          param0 = param0 >> (var2Lifetime1 << 1);
          return MenuSelection.field_f[param0 - 32768] << var2Lifetime1;
        }
        if (param0 < 128) {
          if (param0 < 8) {
            if (param0 < 2) {
              return 256;
            }
            var2Lifetime2 = 7;
          } else {
            var2Lifetime2 = (32 <= param0) ? 5 : 6;
          }
        } else {
          if (param0 < 2048) {
            var2Lifetime2 = (param0 >= 512) ? 3 : 4;
          } else {
            var2Lifetime2 = (param0 >= 8192) ? 1 : 2;
          }
        }
        param0 = param0 << (var2Lifetime2 << 1);
        return MenuSelection.field_f[param0 - 32768] >> var2Lifetime2;
    }

    public static void releaseStatics(int param0) {
        if (param0 == -13827) {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_e = true;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0) {
        WidgetTheme.a((byte) -44, AppletContextSupport.getActiveApplet(param0 ^ -536871029));
        if (param0 != 536870912) {
          DisplayNameUiSupport.a(36);
        }
    }

    final static void showDisplayNameForm(byte param0) {
        if (WorldSpriteSequence.field_f != null) {
          WorldSpriteSequence.field_f.closeDialog(-85);
          PlayerInputEvent.field_n = new DisplayNameForm();
          if (param0 > -8) {
            DisplayNameUiSupport.showDisplayNameForm((byte) -11);
            ClientUiUpdateSupport.field_a.a((byte) -124, (UiWidget) (PlayerInputEvent.field_n));
            return;
          }
          ClientUiUpdateSupport.field_a.a((byte) -124, (UiWidget) (PlayerInputEvent.field_n));
          return;
        }
        PlayerInputEvent.field_n = new DisplayNameForm();
        if (param0 <= -8) {
          ClientUiUpdateSupport.field_a.a((byte) -124, (UiWidget) (PlayerInputEvent.field_n));
          return;
        }
        DisplayNameUiSupport.showDisplayNameForm((byte) -11);
        ClientUiUpdateSupport.field_a.a((byte) -124, (UiWidget) (PlayerInputEvent.field_n));
    }

    static {
        field_e = false;
        field_d = "Player";
        field_b = "Match by...";
    }
}
