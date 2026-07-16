/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qg implements ad {
    static int[] field_n;
    static dm field_d;
    private int field_i;
    private int field_j;
    private int field_k;
    private int field_h;
    static String field_e;
    static String field_g;
    private we field_c;
    static rc field_b;
    private int field_a;
    private int field_m;
    private int field_l;
    static int field_f;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_g = null;
        field_n = null;
        field_d = null;
    }

    qg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((qg) this).field_j = param3;
        ((qg) this).field_c = param0;
        ((qg) this).field_k = param4;
        ((qg) this).field_h = param2;
        ((qg) this).field_a = param6;
        ((qg) this).field_i = param1;
        ((qg) this).field_m = param7;
        ((qg) this).field_l = param5;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        s var14 = null;
        fe stackIn_3_0 = null;
        fe stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param2 instanceof s) {
            stackOut_2_0 = (fe) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (fe) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (s) (Object) stackIn_3_0;
          eh.e(param1 - -param2.field_u, param3 + param2.field_t, param2.field_v, param2.field_q, ((qg) this).field_m);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = param1 - (-param2.field_u + -var14.field_M);
          var8 = var14.field_R + param2.field_t + param3;
          eh.c(var7, var8, var14.field_J, ((qg) this).field_l);
          if ((var14.field_K ^ -1) == 0) {
            break L2;
          } else {
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_K) / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            eh.c(var11 + var7, var12 + var8, 1, ((qg) this).field_a);
            break L2;
          }
        }
        L3: {
          eh.c(var7, var8, 2, 1);
          var9 = (double)var14.field_S * 3.141592653589793 * 2.0 / (double)var14.field_N;
          if (param0 == 12088) {
            break L3;
          } else {
            qg.a(-31);
            break L3;
          }
        }
        L4: {
          var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
          var12 = (int)(Math.cos(var9) * (double)var14.field_J);
          eh.d(var7, var8, var7 + var11, var12 + var8, 1);
          if (null == ((qg) this).field_c) {
            break L4;
          } else {
            var13 = var14.field_M + var14.field_J + ((qg) this).field_i;
            int discarded$1 = ((qg) this).field_c.a(param2.field_s, param2.field_u + param1 - -var13, ((qg) this).field_h + param3 + param2.field_t, param2.field_v + -((qg) this).field_i + -var13, param2.field_q + -(((qg) this).field_i << -1417758591), ((qg) this).field_j, ((qg) this).field_k, 1, 1, 0);
            break L4;
          }
        }
    }

    final static hn a(long param0, String param1, int param2, String param3, boolean param4) {
        if (param2 == 0) {
          if (-1L == (param0 ^ -1L)) {
            if (param3 == null) {
              if (param4) {
                return (hn) (Object) new tl(param0, param1);
              } else {
                return (hn) (Object) new pc(param0, param1);
              }
            } else {
              return (hn) (Object) new oc(param3, param1);
            }
          } else {
            if (param4) {
              return (hn) (Object) new tl(param0, param1);
            } else {
              return (hn) (Object) new pc(param0, param1);
            }
          }
        } else {
          qg.a(-13);
          if (-1L == (param0 ^ -1L)) {
            if (param3 == null) {
              if (param4) {
                return (hn) (Object) new tl(param0, param1);
              } else {
                return (hn) (Object) new pc(param0, param1);
              }
            } else {
              return (hn) (Object) new oc(param3, param1);
            }
          } else {
            if (param4) {
              return (hn) (Object) new tl(param0, param1);
            } else {
              return (hn) (Object) new pc(param0, param1);
            }
          }
        }
    }

    final static void a(vf param0, int param1, int param2, int param3, int param4, long param5, int param6, String param7, boolean param8, int param9, boolean param10, boolean param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              kj.field_a = new ld(param9);
              sn.field_c = new ld(param12);
              ic.field_h = param6;
              cm.field_q = param3;
              if (!param11) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              ei.field_L = stackIn_3_0 != 0;
              sj.field_c = param13;
              mm.field_b = param0;
              wf.field_U = param7;
              ii.field_a = param1;
              if (!param8) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            v.field_e = stackIn_6_0 != 0;
            if (param10) {
              bj.field_a = param5;
              jc.field_E = param4;
              mh.field_c = param2;
              if (mm.field_b.field_i != null) {
                try {
                  L2: {
                    w.field_W = new me(mm.field_b.field_i, 64, 0);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var15 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var15.toString());
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_e = "Unpacking graphics";
        field_g = "You have 1 unread message!";
        field_f = 0;
    }
}
