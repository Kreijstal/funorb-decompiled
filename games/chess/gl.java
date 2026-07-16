/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    static pf field_b;
    static String field_a;

    final static String[] a(byte param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Chess.field_G;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = sg.a(var10, (byte) 124, param1);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        if (param0 != -118) {
            gl.a((byte) -53);
        }
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2.charAt(var8) != param1; var8++) {
            }
            int incrementValue$0 = var5;
            var5++;
            var4[incrementValue$0] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    public static void a(byte param0) {
        int var1 = 30 / ((param0 - -17) / 62);
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() < ig.field_c) {
              break L0;
            } else {
              if (param1.length() <= td.field_k) {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_b = null;
                    break L1;
                  }
                }
                return false;
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Offer draw";
    }
}
