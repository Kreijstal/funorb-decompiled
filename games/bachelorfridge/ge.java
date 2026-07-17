/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class ge extends hfa {
    private po field_G;
    static int field_I;
    private boolean field_M;
    private int field_J;
    static ee field_K;
    private String field_C;
    static long field_F;
    static boolean field_D;
    static boolean field_L;
    private int field_E;
    private int field_H;

    ge(int param0, int param1, int param2, int param3, wj param4, boolean param5, int param6, int param7, po param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qda) null, (pl) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((ge) this).field_J = param9;
              ((ge) this).field_E = param7;
              ((ge) this).field_H = param6;
              ((ge) this).field_G = param8;
              ((ge) this).field_A = param4;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ge) this).field_M = stackIn_4_1 != 0;
              ((ge) this).field_C = param10;
              var12_int = -((ge) this).field_E + ((ge) this).field_H;
              var13 = ((ge) this).field_G.a(param10, var12_int, ((ge) this).field_G.field_u) + ((ge) this).field_E * 2;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                ((ge) this).a(param0, var13, (byte) 59, param2, param1);
                break L2;
              }
            }
            L3: {
              if (((ge) this).field_M) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ((ge) this).field_E * 2 + ((ge) this).field_H;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((ge) this).field_A.a(var14, param3 + -(((ge) this).field_E * 2), (byte) 59, -((ge) this).field_H + param2 - ((ge) this).field_E * 3, (-param3 + var13 >> 1) + ((ge) this).field_E);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("ge.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            pf var4 = null;
            pf var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (null == aw.field_x) {
                aw.field_x = cc.field_e.a((byte) 121, oca.field_p, kn.field_h);
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == aw.field_x.field_f) {
              return false;
            } else {
              long dupTemp$2 = f.b((byte) 73);
              vla.field_v = dupTemp$2;
              pk.field_c = dupTemp$2;
              if (aw.field_x.field_f == 1) {
                try {
                  L1: {
                    L2: {
                      dma.field_b = new pj((java.net.Socket) aw.field_x.field_e, cc.field_e);
                      var4 = ig.field_m;
                      var5 = var4;
                      sja.field_fb.field_g = 0;
                      if (!param1) {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = -2;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    f.field_b = stackIn_11_0;
                    ef.field_l = stackIn_11_0;
                    bd.field_j = stackIn_11_0;
                    eia.field_a = rga.field_c;
                    var5.field_g = 0;
                    cca.a((lu) (Object) sja.field_fb, fl.field_q, (byte) -106, mfa.field_a, kha.field_k);
                    hna.a(-1, 117);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  eia.field_a = mk.field_o;
                  aw.field_x = null;
                  return true;
                }
                aw.field_x = null;
                return true;
              } else {
                eia.field_a = mk.field_o;
                aw.field_x = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_K = null;
        if (param0 >= -30) {
            ge.e((byte) 35);
        }
    }

    final String c(byte param0) {
        int var2 = ((ge) this).field_A.field_t ? 1 : 0;
        ((ge) this).field_A.field_t = ((ge) this).field_t;
        String var3 = ((ge) this).field_A.c(param0);
        ((ge) this).field_A.field_t = var2 != 0 ? true : false;
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        po stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        po stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        po stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        po stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        po stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        po stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = param3 + ((ge) this).field_s;
        var6 = param1 + ((ge) this).field_v;
        var7 = 44 % ((-20 - param0) / 54);
        super.a((byte) 123, param1, param2, param3);
        if (0 != param2) {
          return;
        } else {
          L0: {
            if (!((ge) this).field_M) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = -((ge) this).field_H + ((ge) this).field_p - ((ge) this).field_E * 2;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var8 = stackIn_4_0;
            stackOut_4_0 = ((ge) this).field_G;
            stackOut_4_1 = ((ge) this).field_C;
            stackOut_4_2 = var5 - (-var8 + -((ge) this).field_E);
            stackOut_4_3 = var6 + ((ge) this).field_E;
            stackOut_4_4 = -((ge) this).field_E + ((ge) this).field_H;
            stackOut_4_5 = -(((ge) this).field_E * 2) + ((ge) this).field_q;
            stackOut_4_6 = ((ge) this).field_J;
            stackOut_4_7 = -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            stackIn_6_7 = stackOut_4_7;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            stackIn_5_5 = stackOut_4_5;
            stackIn_5_6 = stackOut_4_6;
            stackIn_5_7 = stackOut_4_7;
            if (((ge) this).field_M) {
              stackOut_6_0 = (po) (Object) stackIn_6_0;
              stackOut_6_1 = (String) (Object) stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              stackIn_7_8 = stackOut_6_8;
              break L1;
            } else {
              stackOut_5_0 = (po) (Object) stackIn_5_0;
              stackOut_5_1 = (String) (Object) stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 2;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_7_8 = stackOut_5_8;
              break L1;
            }
          }
          int discarded$1 = ((po) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((ge) this).field_G.field_u);
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, po param3, int param4, int param5, int param6, kv[] param7, int param8, byte param9, int param10, kv[] param11) {
        try {
            vr.a(param8, param3, param6, param6, 240, param7, 320, param3, 2, 8, param2, param11, 8, param8, 480);
            int var12_int = 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ge.B(" + 320 + 44 + 8 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + 2 + 44 + 8 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 44 + 91 + 44 + 240 + 44 + (param11 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
