/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends hp implements oa, hh, ri {
    private ic field_M;
    private an field_H;
    private ic field_P;
    private ic field_N;
    private hm field_J;
    kn field_I;
    private an field_L;
    static sd field_F;
    private ic field_G;
    private ic field_R;
    static vn field_K;
    private ic field_Q;
    private fm field_O;

    private final boolean f(byte param0) {
        if (!this.j(40)) {
            return false;
        }
        int var2 = -1;
        if (param0 >= -108) {
            return true;
        }
        try {
            var2 = Integer.parseInt(((fk) this).field_R.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return kl.a(((fk) this).field_P.field_o, 640, (fk) this, ((fk) this).field_N.field_o, var2, ((fk) this).field_G.field_o, ((fk) this).field_O.field_x);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(-120, param1, param2, param3)) {
              var5_int = 61 / ((-83 - param0) / 32);
              if (98 != param1) {
                if (99 == param1) {
                  stackOut_8_0 = ((fk) this).a(1, param2);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((fk) this).b((byte) 119, param2);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("fk.I(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    public final void a(int param0) {
        int var2 = 107 / ((39 - param0) / 49);
        ((ql) (Object) ((fk) this).field_N.a(0)).e(-28769);
    }

    private final boolean j(int param0) {
        if (this.a((byte) 77, (mi) (Object) ((fk) this).field_N)) {
          if (this.a((byte) 77, (mi) (Object) ((fk) this).field_G)) {
            if (this.a((byte) 77, (mi) (Object) ((fk) this).field_M)) {
              if (this.a((byte) 77, (mi) (Object) ((fk) this).field_P)) {
                if (this.a((byte) 77, (mi) (Object) ((fk) this).field_Q)) {
                  if (!this.a((byte) 77, (mi) (Object) ((fk) this).field_R)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final String i(int param0) {
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(String param0, int param1, ga param2, int param3, int param4) {
        q var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6 = new q(20, param3, 170 + param1, 25, param2, false, 120, 3, ia.field_e, 16777215, param0);
            ((fk) this).a((ga) (Object) var6, 10);
            stackOut_0_0 = var6.field_n;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("fk.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + 170 + 41);
        }
        return stackIn_1_0;
    }

    private final int a(int param0, int param1, int param2, String param3, ga param4) {
        RuntimeException var6 = null;
        np var7 = null;
        q var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var8 = new q(20, param1, param2 + 120, 25, param4, false, 120, 3, ia.field_e, 16777215, param3);
              ((fk) this).a((ga) (Object) var8, 10);
              var7 = new np(((mi) (Object) param4).a(0));
              ((fk) this).a((ga) (Object) var7, 10);
              if (param0 <= -44) {
                break L1;
              } else {
                boolean discarded$2 = this.f((byte) -123);
                break L1;
              }
            }
            var7.a(76, (-15 + var8.field_n >> 1) + var8.field_j, 3 + var8.field_k - -var8.field_i, 15, 15);
            stackOut_2_0 = var8.field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("fk.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void e(byte param0) {
        field_K = null;
        field_F = null;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, (byte) -92, param2, param3);
            int var5_int = 40 % ((46 - param1) / 42);
            ((fk) this).field_L.field_C = this.j(40);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fk.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(hm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == 120) {
                break L1;
              } else {
                ((fk) this).field_Q = null;
                break L1;
              }
            }
            if (param2 != 0) {
              if (param2 != 1) {
                if (2 == param2) {
                  nf.a(12, "conduct.ws");
                  break L0;
                } else {
                  return;
                }
              } else {
                nf.a(12, "privacy.ws");
                return;
              }
            } else {
              nf.a(12, "terms.ws");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fk.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == -6) {
              if (param2 != ((fk) this).field_H) {
                if (param2 != ((fk) this).field_L) {
                  break L0;
                } else {
                  boolean discarded$2 = this.f((byte) -125);
                  return;
                }
              } else {
                ZombieDawn.q(-10401);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("fk.K(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(int param0, ga param1, String param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == -24519) {
                break L1;
              } else {
                var8 = null;
                ((fk) this).a((byte) 41, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param1, 0, param0, param2, 35, 170, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("fk.M(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 44 + 170 + 41);
        }
        return stackIn_3_0;
    }

    private final int a(ga param0, int param1, int param2, String param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        wf var9 = null;
        q var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new q(20, param2, 120 + param5, 25, param0, false, 120, 3, ia.field_e, 16777215, param6);
            ((fk) this).a((ga) (Object) var10, 10);
            var9 = new wf(((mi) (Object) param0).a(param1 ^ param1), param3, 126, param2 + var10.field_n, param5 + 50, param4);
            var9.field_v = (sk) this;
            ((fk) this).a((ga) (Object) var9, 10);
            stackOut_0_0 = var9.field_n + var10.field_n;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("fk.R(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    private final String h(int param0) {
        return "</col></u>";
    }

    public final void a(byte param0, String param1) {
        ic var3 = null;
        String var4 = null;
        try {
            int var5 = 81 / ((param0 - -40) / 48);
            var3 = ((fk) this).field_N;
            var4 = param1;
            ((tb) (Object) var3).a(false, false, var4);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fk.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public fk() {
        super(0, 0, 496, 0, (io) null);
        ((fk) this).field_N = new ic("", (sk) null, 12);
        ((fk) this).field_G = new ic("", (sk) null, 100);
        ((fk) this).field_M = new ic("", (sk) null, 100);
        ((fk) this).field_P = new ic("", (sk) null, 20);
        ((fk) this).field_Q = new ic("", (sk) null, 20);
        ((fk) this).field_R = new ic("", (sk) null, 3);
        int var1 = 1;
        ((fk) this).field_O = new fm("", (sk) null, var1 != 0);
        ((fk) this).field_L = new an(al.field_c, (sk) null);
        ((fk) this).field_H = new an(vl.field_f, (sk) null);
        ((fk) this).field_N.field_s = sn.field_d;
        ((fk) this).field_G.field_s = c.field_a;
        ((fk) this).field_M.field_s = hi.field_pb;
        ((fk) this).field_P.field_s = gm.field_f;
        ((fk) this).field_Q.field_s = qo.field_t;
        ((fk) this).field_R.field_s = lm.field_D;
        ((fk) this).field_O.field_s = kf.field_V;
        ((fk) this).field_N.a(-73, (vc) (Object) new ql((tb) (Object) ((fk) this).field_N));
        ((fk) this).field_G.a(127, (vc) (Object) new mc((tb) (Object) ((fk) this).field_G));
        ((fk) this).field_M.a(-110, (vc) (Object) new lk((tb) (Object) ((fk) this).field_M, (tb) (Object) ((fk) this).field_G));
        ((fk) this).field_P.a(79, (vc) (Object) new kg((tb) (Object) ((fk) this).field_P, (tb) (Object) ((fk) this).field_N, (tb) (Object) ((fk) this).field_G));
        ((fk) this).field_Q.a(24, (vc) (Object) new fj((tb) (Object) ((fk) this).field_Q, (tb) (Object) ((fk) this).field_P));
        ((fk) this).field_R.a(-87, (vc) (Object) new kb((tb) (Object) ((fk) this).field_R));
        ((fk) this).field_L.field_C = false;
        ((fk) this).field_L.field_h = (io) (Object) new vm();
        ((fk) this).field_H.field_h = (io) (Object) new dp();
        ((fk) this).field_N.field_h = (io) (Object) new tc(10000536);
        tc dupTemp$0 = new tc(10000536);
        ((fk) this).field_M.field_h = (io) (Object) dupTemp$0;
        ((fk) this).field_G.field_h = (io) (Object) dupTemp$0;
        ((fk) this).field_R.field_h = (io) (Object) new tc(10000536);
        ((fk) this).field_O.field_h = (io) (Object) new jb();
        jm dupTemp$1 = new jm(10000536);
        ((fk) this).field_Q.field_h = (io) (Object) dupTemp$1;
        ((fk) this).field_P.field_h = (io) (Object) dupTemp$1;
        String var2 = s.a(1938762664, jb.field_d, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(dk.field_Vb, 120, (ga) (Object) ((fk) this).field_G, var3, 170);
        var3 = var3 + (5 + this.a((ga) (Object) ((fk) this).field_M, 0, var3, "", 20, 170, aa.field_g));
        var3 = var3 + this.a(ui.field_c, 120, (ga) (Object) ((fk) this).field_P, var3, 170);
        var3 = var3 + (this.a(var3, (ga) (Object) ((fk) this).field_Q, jj.field_J, gk.field_I, -24519, 170) - -5);
        var3 = var3 + (this.a(var3, (ga) (Object) ((fk) this).field_N, a.field_l, b.field_i, -24519, 170) + 5);
        var3 = var3 + this.a(-55, var3, 170, bp.field_j, (ga) (Object) ((fk) this).field_R);
        q var4 = new q(46, var3, ((fk) this).field_i + -90, 25, (ga) (Object) ((fk) this).field_O, true, ((fk) this).field_i - 120, 5, ii.field_a, 11579568, ji.field_d);
        ((fk) this).a((ga) (Object) var4, 10);
        var3 = var3 + var4.field_n;
        vf var5 = new vf(ia.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ia.field_e.field_I, -1, 2147483647, true);
        ((fk) this).field_J = new hm(var2, (io) (Object) var5);
        ((fk) this).field_J.field_s = "";
        ((fk) this).field_J.a(0, -21423, sm.field_b);
        ((fk) this).field_J.a(1, -21423, sm.field_b);
        ((fk) this).field_J.field_v = (sk) this;
        ((fk) this).field_J.a(46, var3, true, -90 + ((fk) this).field_i);
        var3 = var3 + (15 + ((fk) this).field_J.field_n);
        ((fk) this).a((ga) (Object) ((fk) this).field_J, 10);
        int var6 = 4;
        int var7 = 200;
        ((fk) this).field_L.a(57, var3, 496 - var7 >> 1, var7, 40);
        ((fk) this).field_H.a(35, 15 + var3, var6 + 3, 60, 40);
        ((fk) this).field_H.field_v = (sk) this;
        ((fk) this).field_L.field_v = (sk) this;
        ((fk) this).a((ga) (Object) ((fk) this).field_L, 10);
        ((fk) this).a((ga) (Object) ((fk) this).field_H, 10);
        ((fk) this).field_I = new kn((ri) this);
        ((fk) this).field_I.a(36, 20 + ((fk) this).field_N.field_j, 60 + ((fk) this).field_N.field_i + ((fk) this).field_N.field_k, ((fk) this).field_i + (-((fk) this).field_N.field_k + -((fk) this).field_N.field_i - 60), 150);
        ((fk) this).a((ga) (Object) ((fk) this).field_I, 10);
        ((fk) this).a(35, 0, 0, 496, 55 + var3 - -var6);
    }

    final static void b(boolean param0) {
        int fieldTemp$2 = oo.field_R;
        oo.field_R = oo.field_R - 1;
        if (fieldTemp$2 <= 0) {
          dj.field_e.field_R.a(0, (le) (Object) new hk());
          oo.field_R = pb.a(so.field_a, 40, 1) - -40;
          fk.b(false);
          return;
        } else {
          fk.b(false);
          return;
        }
    }

    private final boolean a(byte param0, mi param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        rh var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var3 = param1.a(0);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var4 = var3.a((byte) -89);
              if (var4 == uc.field_b) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (param0 == 77) {
                  if (se.field_l == var4) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    if (var4 != di.field_L) {
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("fk.E(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    static {
    }
}
