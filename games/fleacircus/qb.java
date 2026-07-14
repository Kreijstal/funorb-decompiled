/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int field_a;

    final static void a(int param0, byte param1, ql param2) {
        int var4 = 0;
        ih var5 = null;
        var5 = ud.field_b;
        var5.e(8, param0);
        var5.field_i = var5.field_i + 1;
        var4 = var5.field_i;
        var5.a(-11, 1);
        var5.a(-11, param2.field_i);
        if (param1 < 43) {
          return;
        } else {
          var5.b(-24213, param2.field_m);
          var5.a(param2.field_r, (byte) -24);
          var5.a(param2.field_n, (byte) -120);
          var5.a(param2.field_p, (byte) -18);
          var5.a(param2.field_q, (byte) -60);
          int discarded$1 = var5.c(var4, -30532);
          var5.c((byte) -111, -var4 + var5.field_i);
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          var2 = param0.length();
          if (var2 > 20) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        if (param1 >= -13) {
          return null;
        } else {
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var8);
            } else {
              L2: {
                var5 = param0.charAt(var4);
                if (var5 < 65) {
                  break L2;
                } else {
                  if (var5 <= 90) {
                    var3[var4] = (char)(var5 + 32);
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  if (var5 < 97) {
                    break L4;
                  } else {
                    if (var5 <= 122) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (48 > var5) {
                    break L5;
                  } else {
                    if (var5 <= 57) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L1;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 < 90) {
            return;
        }
        na.field_f = 1000000000L / (long)param0;
    }

    static {
    }
}
