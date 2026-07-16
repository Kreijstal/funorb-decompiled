/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vl implements io {
    private int field_l;
    private int field_i;
    private int field_q;
    private int field_h;
    static vk field_m;
    private int field_j;
    static String[] field_p;
    private rb field_d;
    private int field_n;
    private int field_g;
    static int field_r;
    private int field_e;
    static hi field_b;
    private int field_a;
    static String field_k;
    private int field_c;
    private int field_o;
    static String field_f;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fm var11 = null;
        ga stackIn_3_0 = null;
        ga stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof fm) {
            stackOut_2_0 = (ga) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ga) (Object) stackOut_1_0;
            break L0;
          }
        }
        var11 = (fm) (Object) stackIn_3_0;
        if (param0 == 16777215) {
          L1: {
            if (var11 == null) {
              break L1;
            } else {
              param1 = param1 & var11.field_C;
              break L1;
            }
          }
          L2: {
            var7 = 5592405;
            if (!param1) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          bi.b(param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, ((vl) this).field_e);
          var8 = ((vl) this).field_h + param4 + param3.field_k;
          var9 = param2 - (-param3.field_j - ((vl) this).field_c);
          bi.f(var8, var9, ((vl) this).field_l, ((vl) this).field_n, 5592405);
          bi.b(var8, var9, ((vl) this).field_l, ((vl) this).field_n, var7);
          if (var11.field_x) {
            L3: {
              bi.e(var8, var9, ((vl) this).field_l + var8, ((vl) this).field_n + var9, 1);
              bi.e(((vl) this).field_l + var8, var9, var8, var9 - -((vl) this).field_n, 1);
              if (null == ((vl) this).field_d) {
                break L3;
              } else {
                var10 = ((vl) this).field_l + ((vl) this).field_h + ((vl) this).field_q;
                int discarded$2 = ((vl) this).field_d.a(param3.field_o, param3.field_k + param4 + var10, param2 - -param3.field_j - -((vl) this).field_j, param3.field_i - (((vl) this).field_q + var10), param3.field_n + -(((vl) this).field_q << 1486012001), ((vl) this).field_i, ((vl) this).field_g, ((vl) this).field_o, ((vl) this).field_a, 0);
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null == ((vl) this).field_d) {
                break L4;
              } else {
                var10 = ((vl) this).field_l + ((vl) this).field_h + ((vl) this).field_q;
                int discarded$3 = ((vl) this).field_d.a(param3.field_o, param3.field_k + param4 + var10, param2 - -param3.field_j - -((vl) this).field_j, param3.field_i - (((vl) this).field_q + var10), param3.field_n + -(((vl) this).field_q << 1486012001), ((vl) this).field_i, ((vl) this).field_g, ((vl) this).field_o, ((vl) this).field_a, 0);
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            if (param0 == -46) {
              L0: {
                if (sn.field_c == null) {
                  break L0;
                } else {
                  L1: {
                    if (-1 >= param1) {
                      if (df.field_j != ic.field_T) {
                        break L0;
                      } else {
                        if (-1 != (dp.field_e.field_j ^ -1)) {
                          break L1;
                        } else {
                          if ((pd.a(-22826) ^ -1L) >= (10000L + hm.field_N ^ -1L)) {
                            break L1;
                          } else {
                            dp.field_e.j(11, param1);
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (-1 != dp.field_e.field_j) {
                        break L1;
                      } else {
                        if ((pd.a(-22826) ^ -1L) >= (10000L + hm.field_N ^ -1L)) {
                          break L1;
                        } else {
                          dp.field_e.j(11, param1);
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if (0 < dp.field_e.field_j) {
                      try {
                        L3: {
                          sn.field_c.a(dp.field_e.field_j, true, 0, dp.field_e.field_h);
                          hm.field_N = pd.a(-22826);
                          break L3;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          p.a(1);
                          break L4;
                        }
                      }
                      dp.field_e.field_j = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              }
              dp.field_e.field_j = 0;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_p = null;
        field_b = null;
        field_k = null;
        if (param0 != -51) {
          field_b = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(wk param0, ub param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        ac.field_m = ac.field_m + 1;
        if (param2 <= -73) {
          var3 = sh.field_e;
          if (-1 != (var3 ^ -1)) {
            if ((var3 ^ -1) == -2) {
              pn.a(param0, 152, param1);
              return;
            } else {
              return;
            }
          } else {
            s.a((byte) 80, param0, param1);
            return;
          }
        } else {
          return;
        }
    }

    vl(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vl) this).field_a = 1;
        ((vl) this).field_o = 1;
        ((vl) this).field_e = param9;
        ((vl) this).field_h = param5;
        ((vl) this).field_c = param6;
        ((vl) this).field_g = param4;
        ((vl) this).field_n = param7;
        ((vl) this).field_d = param0;
        ((vl) this).field_q = param1;
        ((vl) this).field_l = param8;
        ((vl) this).field_j = param2;
        ((vl) this).field_i = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = new vk();
        field_k = "Achievements This Game";
        field_f = "Go Back";
    }
}
