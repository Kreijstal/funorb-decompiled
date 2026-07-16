/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class te {
    static un field_a;

    final static boolean a(byte param0, boolean param1) {
        L0: {
          if (vj.field_b != null) {
            break L0;
          } else {
            vj.field_b = gf.field_b.a(fe.field_j, false, df.field_a);
            break L0;
          }
        }
        if (vj.field_b.field_a != 0) {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              field_a = null;
              break L1;
            }
          }
          L2: {
            long dupTemp$2 = lo.a((byte) -29);
            mp.field_p = dupTemp$2;
            wg.field_y = dupTemp$2;
            if ((vj.field_b.field_a ^ -1) != -2) {
              break L2;
            } else {
              break L2;
            }
          }
          gj.field_k = tp.field_c;
          vj.field_b = null;
          return true;
        } else {
          return false;
        }
    }

    abstract void b(int param0);

    abstract te b(byte param0);

    te() {
        Object var2 = null;
        um.a(0, (String) null, (byte) 120);
    }

    void a(int param0) {
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static void a(bh param0, int param1, String param2, byte param3, vc param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = CrazyCrystals.field_B;
          var5 = 0;
          var6 = -1;
          if (param3 == -95) {
            break L0;
          } else {
            te.a((byte) -90);
            break L0;
          }
        }
        var7 = 1;
        L1: while (true) {
          if (var7 >= param2.length()) {
            return;
          } else {
            L2: {
              var8 = param2.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = (var5 >> 360677960) - (-param0.field_e[0] + -param4.a(param2.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if (-1 == var6) {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param1;
                    break L4;
                  }
                }
                param0.field_e[var7] = (var5 >> -1771219320) - (-param0.field_e[0] + -param4.a(param2.substring(0, var7 + 1))) - param4.a((char) var8);
                break L3;
              } else {
                param0.field_e[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 127 % ((param0 - 26) / 59);
        field_a = null;
    }

    static {
    }
}
