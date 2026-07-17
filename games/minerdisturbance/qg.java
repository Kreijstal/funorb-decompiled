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
        try {
            ((qg) this).field_j = param3;
            ((qg) this).field_c = param0;
            ((qg) this).field_k = param4;
            ((qg) this).field_h = param2;
            ((qg) this).field_a = param6;
            ((qg) this).field_i = param1;
            ((qg) this).field_m = param7;
            ((qg) this).field_l = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        s var14 = null;
        fe stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 instanceof s) {
                stackOut_2_0 = (fe) param2;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (fe) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (s) (Object) stackIn_3_0;
              eh.e(param1 - -param2.field_u, param3 + param2.field_t, param2.field_v, param2.field_q, ((qg) this).field_m);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param1 - (-param2.field_u + -var14.field_M);
              var8 = var14.field_R + param2.field_t + param3;
              eh.c(var7, var8, var14.field_J, ((qg) this).field_l);
              if (var14.field_K == -1) {
                break L3;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_K) / (double)var14.field_N;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
                var12 = (int)(Math.cos(var9) * (double)var14.field_J);
                eh.c(var11 + var7, var12 + var8, 1, ((qg) this).field_a);
                break L3;
              }
            }
            L4: {
              eh.c(var7, var8, 2, 1);
              var9 = (double)var14.field_S * 3.141592653589793 * 2.0 / (double)var14.field_N;
              if (param0 == 12088) {
                break L4;
              } else {
                qg.a(-31);
                break L4;
              }
            }
            L5: {
              var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
              var12 = (int)(Math.cos(var9) * (double)var14.field_J);
              eh.d(var7, var8, var7 + var11, var12 + var8, 1);
              if (null == ((qg) this).field_c) {
                break L5;
              } else {
                var13 = var14.field_M + var14.field_J + ((qg) this).field_i;
                int discarded$1 = ((qg) this).field_c.a(param2.field_s, param2.field_u + param1 - -var13, ((qg) this).field_h + param3 + param2.field_t, param2.field_v + -((qg) this).field_i + -var13, param2.field_q + -(((qg) this).field_i << 1), ((qg) this).field_j, ((qg) this).field_k, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("qg.B(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static hn a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        oc stackIn_5_0 = null;
        tl stackIn_8_0 = null;
        pc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_4_0 = null;
        pc stackOut_9_0 = null;
        tl stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                qg.a(-13);
                break L1;
              }
            }
            L2: {
              if (param0 != 0L) {
                break L2;
              } else {
                if (param3 == null) {
                  break L2;
                } else {
                  stackOut_4_0 = new oc(param3, param1);
                  stackIn_5_0 = stackOut_4_0;
                  return (hn) (Object) stackIn_5_0;
                }
              }
            }
            if (!param4) {
              stackOut_9_0 = new pc(param0, param1);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = new tl(param0, param1);
              stackIn_8_0 = stackOut_7_0;
              return (hn) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("qg.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
        return (hn) (Object) stackIn_10_0;
    }

    final static void a(vf param0, int param1, int param2, int param3, int param4, long param5, int param6, String param7, boolean param8, int param9, boolean param10, boolean param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
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
                  {
                    L2: {
                      w.field_W = new me(mm.field_b.field_i, 64, 0);
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) var15_ref;
                stackOut_14_1 = new StringBuilder().append("qg.D(");
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param0 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L3;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L3;
                }
              }
              L4: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param7 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L4;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 41);
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
