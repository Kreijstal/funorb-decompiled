/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk implements kh {
    private ka field_g;
    private int field_e;
    private int field_l;
    private int field_i;
    private int field_h;
    private int field_k;
    private int field_j;
    private int field_d;
    private int field_a;
    private int field_b;
    private int field_m;
    static boolean[] field_f;
    private int field_c;

    final static kl a(int param0, boolean param1, int param2, boolean param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            bm var8 = null;
            Object stackIn_2_0 = null;
            kl stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            kl stackOut_16_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                if (param2 == 1) {
                  L1: {
                    var6 = null;
                    if (null != vq.field_c.field_r) {
                      rg.field_b = new ue(vq.field_c.field_r, 5200, 0);
                      vq.field_c.field_r = null;
                      var6 = (Object) (Object) new bc(255, rg.field_b, new ue(vq.field_c.field_d, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var7 = null;
                    if (null != rg.field_b) {
                      L3: {
                        if (mu.field_b != null) {
                          break L3;
                        } else {
                          mu.field_b = new ue[vq.field_c.field_c.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (mu.field_b[param0] != null) {
                          break L4;
                        } else {
                          mu.field_b[param0] = new ue(vq.field_c.field_c[param0], 12000, 0);
                          vq.field_c.field_c[param0] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new bc(param0, rg.field_b, mu.field_b[param0], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = oi.field_c.a(param3, (bc) var7, param0, 0, (bc) var6);
                    if (param4) {
                      var8.c(31637);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  stackOut_16_0 = new kl((ew) (Object) var8, param1, param5);
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (kl) (Object) stackIn_2_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vu var11 = null;
        kb stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof vu) {
                stackOut_2_0 = (kb) param0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (kb) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (vu) (Object) stackIn_3_0;
              if (var11 != null) {
                param3 = param3 & var11.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 < -79) {
                break L3;
              } else {
                ((tk) this).field_e = -101;
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              qn.f(param1 - -param0.field_B, param0.field_p + param4, param0.field_l, param0.field_w, ((tk) this).field_l);
              if (!param3) {
                break L4;
              } else {
                var7 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = ((tk) this).field_i + (param1 + param0.field_B);
              var9 = param0.field_p + (param4 - -((tk) this).field_m);
              qn.g(var8, var9, ((tk) this).field_h, ((tk) this).field_j, 5592405);
              qn.f(var8, var9, ((tk) this).field_h, ((tk) this).field_j, var7);
              if (var11.field_K) {
                qn.h(var8, var9, ((tk) this).field_h + var8, ((tk) this).field_j + var9, 1);
                qn.h(var8 - -((tk) this).field_h, var9, var8, ((tk) this).field_j + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((tk) this).field_g == null) {
                break L6;
              } else {
                var10 = ((tk) this).field_a + ((tk) this).field_h + ((tk) this).field_i;
                int discarded$1 = ((tk) this).field_g.a(param0.field_v, param1 - -param0.field_B + var10, param0.field_p + param4 + ((tk) this).field_k, -((tk) this).field_a - var10 + param0.field_l, param0.field_w - (((tk) this).field_a << 1), ((tk) this).field_b, ((tk) this).field_c, ((tk) this).field_d, ((tk) this).field_e, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("tk.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    tk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((tk) this).field_e = 1;
        ((tk) this).field_d = 1;
        try {
            ((tk) this).field_i = param5;
            ((tk) this).field_b = param3;
            ((tk) this).field_c = param4;
            ((tk) this).field_j = param7;
            ((tk) this).field_k = param2;
            ((tk) this).field_a = param1;
            ((tk) this).field_m = param6;
            ((tk) this).field_h = param8;
            ((tk) this).field_g = param0;
            ((tk) this).field_l = param9;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[64];
    }
}
