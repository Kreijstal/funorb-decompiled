/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve {
    private Random field_l;
    static String field_a;
    private int[] field_c;
    private double field_h;
    int field_k;
    private double field_f;
    private double field_e;
    private int field_d;
    private int field_i;
    private double field_g;
    private double field_j;
    static ja field_b;

    final static void a(long param0, int param1, String param2, tq param3, String param4, cj param5, int param6, int[] param7, int param8) {
        try {
            vc.field_d = param3;
            if (param1 != 196) {
                ve.a((byte) 2);
            }
            pk.field_b = new jb(param5, param0, param4, param2, param8, param6, param7);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ve.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ve) this).field_l.setSeed((long)((ve) this).field_k);
        var8 = (65454 & param0) >> 8;
        var7 = param0 >> 16;
        var9 = 255 & param0;
        if (param5 == -1963) {
          var10 = 0;
          L0: while (true) {
            if (var10 >= 255) {
              L1: {
                if (param2) {
                  oo.a(param1 << 4, param3 << 4, ((ve) this).field_i * 2 << 4, 254, ((ve) this).field_c);
                  break L1;
                } else {
                  break L1;
                }
              }
              var10 = 0;
              L2: while (true) {
                if (var10 >= ((ve) this).field_d) {
                  return;
                } else {
                  L3: {
                    if (!param2) {
                      break L3;
                    } else {
                      oo.a(param1 << 4, param3 << 4, ((ve) this).field_i * var10 << 4, 254 / (var10 + 1), ((ve) this).field_c);
                      break L3;
                    }
                  }
                  L4: {
                    if (param2) {
                      oo.a(param1 << 4, param3 << 4, ((ve) this).field_i * var10 << 4, 196 / (1 + var10), ((ve) this).field_c);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.a(param2, param0, ((ve) this).field_i, ((ve) this).field_j + (-0.5 + this.a(true)) * ((ve) this).field_h, param3, param4, param1, (byte) -69, 0);
                  var10++;
                  continue L2;
                }
              }
            } else {
              var11 = (int)(Math.pow((double)var10, 1.5) / 16.0);
              ((ve) this).field_c[var10] = cr.b(cr.b(var11 * var8 >> 8 << 8, var11 * var7 >> 8 << 16), var9 * var11 >> 8);
              var10++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final double a(boolean param0) {
        return (double)hp.a((byte) 115, ((ve) this).field_l, 1000) / 1000.0;
    }

    private final void a(boolean param0, int param1, int param2, double param3, int param4, int param5, int param6, byte param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param8 > 5) {
            break L0;
          } else {
            if (param2 < 1) {
              break L0;
            } else {
              L1: {
                var11 = param6 + (int)(nm.a(0, param3) * (double)param2);
                var12 = param4 + (int)((double)param2 * gh.a(param3, (byte) 19));
                var13 = hp.a((byte) -86, ((ve) this).field_l, (int)(2.0 * ((ve) this).field_g));
                var14 = param2 * 126 / ((ve) this).field_i + 60;
                if (!param0) {
                  break L1;
                } else {
                  oo.a(var11 << 4, var12 << 4, param2 << 4, var14, ((ve) this).field_c);
                  oo.a(var11 << 4, var12 << 4, param2 << 3, var14 / 2, ((ve) this).field_c);
                  break L1;
                }
              }
              L2: {
                if (param7 == -69) {
                  break L2;
                } else {
                  ((ve) this).field_g = 0.8709670644428569;
                  break L2;
                }
              }
              oo.g(param6, param4, var11, var12, param5);
              oo.g(param6 - -1, param4, var11, var12, param5);
              oo.g(param6, 1 + param4, var11, var12, param5);
              var15 = 0;
              L3: while (true) {
                if (var15 >= var13) {
                  return;
                } else {
                  this.a(param0, param1, (int)((double)param2 * ((ve) this).field_e), (-0.5 + this.a(true)) * ((ve) this).field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                  var15++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
            return;
        }
        field_b = null;
    }

    ve(int param0, int param1, int param2, double param3, double param4, double param5, int param6, double param7, double param8, int param9) {
        ((ve) this).field_l = new Random();
        ((ve) this).field_c = new int[255];
        ((ve) this).field_k = param9;
        ((ve) this).field_e = param8;
        ((ve) this).field_h = param4;
        ((ve) this).field_i = param2;
        ((ve) this).field_f = param5;
        ((ve) this).field_d = param6;
        ((ve) this).field_g = param7;
        ((ve) this).field_j = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Powerups and Modifiers";
    }
}
