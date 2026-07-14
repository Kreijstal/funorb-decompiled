/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String field_e;
    static al[][] field_b;
    static pt field_a;
    static ep field_f;
    static String field_c;
    static int field_d;

    public static void a(byte param0) {
        int var1 = 16 % ((15 - param0) / 50);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = (al[][]) null;
        field_f = null;
    }

    final static void a(int param0) {
        lr var1 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        L0: {
          if (wl.field_r != null) {
            break L0;
          } else {
            var1 = new lr();
            var3 = var1.a(128, 128, (byte) -120, 16);
            wl.field_r = sf.a(false, -137, var3);
            break L0;
          }
        }
        if (param0 > -50) {
          L1: {
            field_e = (String) null;
            if (null != lg.field_l) {
              break L1;
            } else {
              var1 = (lr) (Object) new ah();
              var4 = ((ah) (Object) var1).a(128, 16, 128, (byte) 118);
              lg.field_l = sf.a(false, -137, var4);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != lg.field_l) {
              break L2;
            } else {
              var1 = (lr) (Object) new ah();
              var4 = ((ah) (Object) var1).a(128, 16, 128, (byte) 118);
              lg.field_l = sf.a(false, -137, var4);
              break L2;
            }
          }
          return;
        }
    }

    final static boolean a(String param0, byte param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 != -6) {
          field_c = (String) null;
          var3 = (CharSequence) param0;
          return cf.field_h.equals((Object) (Object) vu.a(127, var3));
        } else {
          var4 = (CharSequence) param0;
          return cf.field_h.equals((Object) (Object) vu.a(127, var4));
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = 1;
        L0: while (true) {
          if (-2 <= (param2 ^ -1)) {
            if (param2 == param0) {
              return var3 * param1;
            } else {
              return var3;
            }
          } else {
            L1: {
              if ((param2 & 1) != 0) {
                var3 = var3 * param1;
                break L1;
              } else {
                break L1;
              }
            }
            param1 = param1 * param1;
            param2 = param2 >> 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please check if address is correct";
        field_a = new pt();
        field_c = "Score";
    }
}
