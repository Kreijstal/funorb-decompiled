/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hob extends ksa {
    int field_j;
    static String field_l;
    static String field_e;
    hob field_f;
    int field_i;
    static int field_d;
    int field_h;
    int field_k;
    int field_g;

    final static tv[] a(ij param0, int param1) {
        ksa[] var2 = null;
        tv[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ksa[] var6 = null;
        var5 = VoidHunters.field_G;
        if (param0 != null) {
          var6 = param0.f(-4872);
          var2 = var6;
          var3 = new tv[var6.length];
          if (param1 != 210377952) {
            int discarded$2 = hob.a(-49, (byte) -17);
            var4 = 0;
            L0: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var3[var4] = (tv) (Object) var6[var4];
                var4++;
                continue L0;
              }
            }
          } else {
            var4 = 0;
            L1: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var3[var4] = (tv) (Object) var6[var4];
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, asb param1) {
        phb var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new phb(param1.a("", true, "final_frame.jpg"), (java.awt.Component) (Object) igb.field_a);
        if (param0 <= 23) {
          return;
        } else {
          var3 = var2.field_q;
          var4 = var2.field_p;
          vbb.e(3);
          cg.field_o = new phb(var3, 3 * var4 / 4);
          cg.field_o.b();
          var2.c(0, 0);
          reb.field_a = new phb(var3, var4 - cg.field_o.field_p);
          reb.field_a.b();
          var2.c(0, -cg.field_o.field_p);
          reb.field_a.field_l = cg.field_o.field_p;
          bia.a((byte) 124);
          return;
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_l = null;
        int var1 = 101 % ((param0 - 66) / 34);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= -121) {
          if ((param0 ^ -1) > -1) {
            if (65535 < (param0 ^ -1)) {
              return -2048 + tfb.field_o[134217728 / -param0];
            } else {
              return -tfb.field_o[-param0 >> -447471291];
            }
          } else {
            if ((param0 ^ -1) >= -65537) {
              return tfb.field_o[param0 >> -529346267];
            } else {
              return 2048 + -tfb.field_o[134217728 / param0];
            }
          }
        } else {
          field_e = null;
          if ((param0 ^ -1) > -1) {
            if (65535 < (param0 ^ -1)) {
              return -2048 + tfb.field_o[134217728 / -param0];
            } else {
              return -tfb.field_o[-param0 >> -447471291];
            }
          } else {
            if ((param0 ^ -1) >= -65537) {
              return tfb.field_o[param0 >> -529346267];
            } else {
              return 2048 + -tfb.field_o[134217728 / param0];
            }
          }
        }
    }

    final static int a(Random param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (0 < param1) {
          if (bd.a(param1, (byte) -95)) {
            return (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 210377952);
          } else {
            if (param2 < 115) {
              field_d = -117;
              var3 = -(int)(4294967296L % (long)param1) + -2147483648;
              L0: while (true) {
                var4 = param0.nextInt();
                if (var3 > var4) {
                  return lva.b(var4, param1, -103);
                } else {
                  continue L0;
                }
              }
            } else {
              var3 = -(int)(4294967296L % (long)param1) + -2147483648;
              L1: while (true) {
                var4 = param0.nextInt();
                if (var3 > var4) {
                  return lva.b(var4, param1, -103);
                } else {
                  continue L1;
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    hob(int param0, int param1, int param2, int param3, int param4) {
        ((hob) this).field_h = param1;
        ((hob) this).field_k = param2;
        ((hob) this).field_g = param3;
        ((hob) this).field_i = param0;
        ((hob) this).field_j = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Scale up map width";
    }
}
