/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static cn field_b;
    static ng field_c;
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 19807) {
            Object var6 = null;
            String discarded$0 = rd.a((byte) -74, (String) null);
        }
        hf.a(108);
        em.h(param1, param4, param0, param2);
    }

    final static String a(byte param0, String param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        L0: {
          var7 = EscapeVector.field_A;
          if (param0 == 72) {
            break L0;
          } else {
            rd.a(111, -86, -93, -27, 95);
            break L0;
          }
        }
        var10 = param1.toCharArray();
        var8 = var10;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L1: while (true) {
          L2: {
            if (var4_int >= var10.length) {
              break L2;
            } else {
              if (var4_int < -var3 + -1 + var10.length) {
                var5 = var10[var4_int];
                if (Character.isSpaceChar((char) var5)) {
                  var3++;
                  var6 = 1 + var4_int;
                  L3: while (true) {
                    if (var10.length > var6) {
                      var2[-1 + var6] = var10[var6];
                      var6++;
                      continue L3;
                    } else {
                      var4_int++;
                      continue L1;
                    }
                  }
                } else {
                  var4_int++;
                  continue L1;
                }
              } else {
                break L2;
              }
            }
          }
          var11 = new char[var10.length - var3];
          var9 = var11;
          var4 = var9;
          qg.a(var2, 0, var4, 0, var11.length);
          return new String(var11);
        }
    }

    public static void a(int param0) {
        int var1 = -2 % ((param0 - 10) / 48);
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new cn();
    }
}
