/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class cn implements nn, mi {
    int field_b;
    int field_j;
    static byte[][] field_m;
    int field_a;
    static String field_c;
    int field_o;
    int field_n;
    vm field_g;
    int field_q;
    int field_i;
    static bd field_h;
    int field_d;
    static int[] field_e;
    private int field_f;
    int field_p;
    int field_k;
    static int field_r;
    private boolean field_l;

    public final int a(int param0, ag param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(-1, param1, 0, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cn.T(").append(param0).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, int param2, ag param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            ce discarded$7 = ((cn) this).a(param3, 1);
            if (param2 <= -68) {
              stackOut_3_0 = param3.field_l.a(83, param5 - ((cn) this).a(-1, param3, param4), param1 - ((cn) this).a(param0, -1, param3));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -96;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("cn.R(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(ag param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param3 == -26318) {
                break L1;
              } else {
                ((cn) this).field_p = -119;
                break L1;
              }
            }
            stackOut_2_0 = param0.field_v + param1 - (-((cn) this).field_q - param0.field_q) + param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("cn.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    private final int a(int param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            stackOut_2_0 = -((cn) this).field_i + (param1.field_x - ((cn) this).field_n);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.G(").append(-4).append(44);
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    String c(ag param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 3) {
              stackOut_3_0 = param0.field_n;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cn.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, boolean param1, int param2, ag param3) {
        try {
            int discarded$0 = 94;
            this.a(param3, ((cn) this).field_f, 0, param0, 0, ((cn) this).field_j, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "cn.H(" + param0 + 44 + 0 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final int a(int param0, ag param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            stackOut_2_0 = param1.field_m + param3 - -((cn) this).field_n + param1.field_o;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("cn.F(").append(-1).append(44);
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, vm param1, int param2, vm param3) {
        try {
            cg.field_a = param2;
            lj.field_u = param1;
            na.field_c = param3;
            if (param0 <= 125) {
                cn.a(122);
            }
            int discarded$0 = -1;
            wc.a(si.field_e / 2, si.field_k / 2);
            int discarded$1 = -127;
            ub.a(param1.field_F + param1.field_N, param3.field_F + param3.field_N, param3.field_N, param1.field_N);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "cn.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public final ce a(ag param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        ce stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_8_0 = null;
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
              if (null == param0.field_l) {
                param0.field_l = (ce) (Object) new mb();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 1) {
                break L2;
              } else {
                var4 = null;
                int discarded$5 = ((cn) this).b((ag) null, (byte) 124);
                break L2;
              }
            }
            L3: {
              if (((cn) this).field_l) {
                ((mb) (Object) param0.field_l).a(0, this.a(-4, param0), ((cn) this).a(param0, (byte) 67), ((cn) this).field_b, ((cn) this).field_g, ((cn) this).c(param0, 3), ((cn) this).field_k, ((cn) this).field_a);
                break L3;
              } else {
                int discarded$6 = 3;
                this.b(param0);
                break L3;
              }
            }
            stackOut_8_0 = param0.field_l;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cn.N(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    public final int a(int param0, int param1, ag param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                var5 = null;
                int discarded$2 = ((cn) this).a(false, (ag) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, param0, 0, -26318);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cn.M(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, cn param1) {
        try {
            param1.field_k = ((cn) this).field_k;
            if (param0 > -32) {
                ((cn) this).field_p = -18;
            }
            param1.field_o = ((cn) this).field_o;
            param1.field_q = ((cn) this).field_q;
            param1.field_l = ((cn) this).field_l;
            param1.field_n = ((cn) this).field_n;
            param1.field_j = ((cn) this).field_j;
            param1.field_p = ((cn) this).field_p;
            param1.field_i = ((cn) this).field_i;
            param1.field_d = ((cn) this).field_d;
            param1.field_f = ((cn) this).field_f;
            param1.field_a = ((cn) this).field_a;
            param1.field_g = ((cn) this).field_g;
            param1.field_b = ((cn) this).field_b;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "cn.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int a(boolean param0, ag param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = null;
                cn.a(114, (vm) null, 6, (vm) null);
                break L1;
              }
            }
            ce discarded$2 = ((cn) this).a(param1, 1);
            stackOut_2_0 = param1.field_l.a(3915) + ((cn) this).field_q - -((cn) this).field_p;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.K(").append(param0).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final int b(ag param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              ce discarded$7 = ((cn) this).a(param0, 1);
              if (param1 < -58) {
                break L1;
              } else {
                cn.a(false, (byte) -4);
                break L1;
              }
            }
            stackOut_2_0 = param0.field_l.a(true) + (((cn) this).field_n - -((cn) this).field_i);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cn.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_m = null;
        field_e = null;
        field_c = null;
        if (param0 < 14) {
            return;
        }
        field_h = null;
    }

    public void a(int param0, int param1, int param2, ag param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (null != ((cn) this).field_g) {
              L1: {
                this.a(param0, false, param1, param3);
                if (param2 == 15430) {
                  break L1;
                } else {
                  ((cn) this).field_n = 13;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("cn.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 41);
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
            ((cn) this).field_d = 10;
        }
        return ((cn) this).field_g.field_F + ((cn) this).field_g.field_y;
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (wb.field_S <= 0) {
            if (ta.p(3)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null != ie.field_c) {
                wa.field_q = ie.field_c.d(16776960);
                int discarded$21 = 0;
                int discarded$22 = 2;
                sd.a();
                break L1;
              } else {
                int discarded$23 = 0;
                wa.field_q = jg.a(640, (byte) -114, gf.field_b, 0, 480);
                break L1;
              }
            }
            if (wa.field_q != null) {
              ea.a((java.awt.Canvas) (Object) wa.field_q, 0);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        if (param1 > 76) {
          L2: {
            if (null != ie.field_c) {
              break L2;
            } else {
              if (!pm.field_e) {
                break L2;
              } else {
                hh.a(5, var2, param0);
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, ag param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        pm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ce var14 = null;
        ce var15 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                var13 = null;
                ((cn) this).a(-73, (cn) null);
                break L1;
              }
            }
            L2: {
              if (param1.g(param3 + -9015)) {
                L3: {
                  var14 = ((cn) this).a(param1, 1);
                  var15 = var14;
                  var7 = var15.a(param2, 0);
                  var8 = var14.field_d[var7];
                  var9 = var15.b(param2, 0);
                  var10 = this.a(param1, param4, var9, param3 + -26318);
                  var11 = ((cn) this).a(-1, param1, param0) - -Math.max(0, var8.field_i);
                  stackOut_4_0 = ((cn) this).a(-1, param1, param0);
                  stackOut_4_1 = this.a(-4, param1);
                  stackOut_4_2 = var8.field_f;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  if (var15.field_d.length > var7 - -1) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = var14.field_d[1 + var7].field_i;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    break L3;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = stackIn_5_2;
                    stackOut_5_3 = var8.field_f;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    break L3;
                  }
                }
                var12 = stackIn_7_0 - -Math.min(stackIn_7_1, Math.min(stackIn_7_2, stackIn_7_3));
                int discarded$2 = 1;
                sf.a(param1.field_v + (param4 - -param1.field_s), param1.field_m + param0, param1.field_x + (param0 + param1.field_m), param1.field_v + param4);
                gf.field_e.a(1077952576, var10, var12, var10, ((cn) this).field_o, var11);
                int discarded$3 = 0;
                eh.b();
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("cn.E(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(ag param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$3 = 1;
              sf.a(param6 + param0.field_v + param0.field_s, param0.field_m + param3, param0.field_m + (param3 + param0.field_x), param6 + param0.field_v);
              var9_int = ((cn) this).a(param0, (byte) 69);
              var10 = this.a(-4, param0);
              if (!((cn) this).field_l) {
                L2: {
                  var12 = ((cn) this).field_b;
                  if (var12 == 0) {
                    var11 = ((cn) this).field_g.field_y;
                    break L2;
                  } else {
                    if (var12 != 2) {
                      L3: {
                        if (var12 == 3) {
                          break L3;
                        } else {
                          if (var12 != 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var11 = ((cn) this).field_g.field_y + (-((cn) this).field_g.field_y + var10 - ((cn) this).field_g.field_F >> 1);
                      break L2;
                    } else {
                      var11 = var10 + -((cn) this).field_g.field_F;
                      break L2;
                    }
                  }
                }
                L4: {
                  var12 = ((cn) this).field_k;
                  if (var12 != 0) {
                    if (var12 != 3) {
                      if (var12 != 1) {
                        if (var12 == 2) {
                          ((cn) this).field_g.a(((cn) this).c(param0, 3), this.a(param0, param6, 0, -26318) - -var9_int, this.a(-1, param0, 0, param3) - -var11, param5, param1);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        ((cn) this).field_g.b(((cn) this).c(param0, 3), this.a(param0, param6, 0, -26318) + (var9_int >> 1), var11 + this.a(-1, param0, 0, param3), param5, param1);
                        break L1;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                ((cn) this).field_g.c(((cn) this).c(param0, 3), this.a(param0, param6, 0, -26318), this.a(-1, param0, 0, param3) + var11, param5, param1);
                break L1;
              } else {
                int discarded$4 = ((cn) this).field_g.a(((cn) this).c(param0, 3), this.a(param0, param6, 0, -26318), this.a(-1, param0, 0, param3), var9_int, var10, param5, param1, ((cn) this).field_k, ((cn) this).field_b, ((cn) this).field_a);
                break L1;
              }
            }
            int discarded$5 = 0;
            eh.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var9;
            stackOut_25_1 = new StringBuilder().append("cn.O(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + 0 + 44 + param3 + 44 + 0 + 44 + param5 + 44 + param6 + 44 + 94 + 41);
        }
    }

    private final void b(ag param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_l != null) {
                break L1;
              } else {
                param0.field_l = (ce) (Object) new mb();
                break L1;
              }
            }
            L2: {
              var3_int = ((cn) this).a(param0, (byte) 85);
              var4 = this.a(-4, param0);
              var6 = ((cn) this).field_b;
              if (var6 == 0) {
                var5 = ((cn) this).field_g.field_y;
                break L2;
              } else {
                if (var6 != 2) {
                  L3: {
                    if (3 != var6) {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = ((cn) this).field_g.field_y - -(var4 + (-((cn) this).field_g.field_y + -((cn) this).field_g.field_F) >> 1);
                  break L2;
                } else {
                  var5 = -((cn) this).field_g.field_F + var4;
                  break L2;
                }
              }
            }
            L4: {
              L5: {
                var6 = ((cn) this).field_k;
                if (var6 != 0) {
                  if (var6 != 3) {
                    L6: {
                      if (1 != var6) {
                        if (var6 != 2) {
                          break L6;
                        } else {
                          if (param0.field_l instanceof mb) {
                            ((mb) (Object) param0.field_l).a(((cn) this).field_g, var5, -1002333144, var3_int, ((cn) this).c(param0, 3));
                            break L6;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        if (!(param0.field_l instanceof mb)) {
                          break L6;
                        } else {
                          ((mb) (Object) param0.field_l).a(var5, ((cn) this).c(param0, 3), var3_int >> 1, 28916, ((cn) this).field_g);
                          break L4;
                        }
                      }
                    }
                    break L4;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              if (param0.field_l instanceof mb) {
                ((mb) (Object) param0.field_l).a(var5, 0, ((cn) this).c(param0, 3), ((cn) this).field_g, (byte) -2);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("cn.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 3 + 41);
        }
    }

    public final int a(ag param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 > 12) {
              stackOut_3_0 = param0.field_s - (((cn) this).field_q - -((cn) this).field_p);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 104;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cn.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public final void a(int param0, byte param1, int param2, ag param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pm var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ce var17 = null;
        ce var18 = null;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 41) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            if (param5 == param2) {
              return;
            } else {
              L2: {
                if (param3.g(param1 + -9056)) {
                  L3: {
                    var17 = ((cn) this).a(param3, param1 ^ 40);
                    var18 = var17;
                    if (param5 > param2) {
                      var8 = param2;
                      var9 = param5;
                      break L3;
                    } else {
                      var9 = param2;
                      var8 = param5;
                      break L3;
                    }
                  }
                  var10 = var18.a(var8, 0);
                  var11 = var18.a(var9, param1 + -41);
                  int discarded$2 = 1;
                  sf.a(param3.field_s + (param0 + param3.field_v), param4 - -param3.field_m, param3.field_x + (param3.field_m + param4), param0 - -param3.field_v);
                  var12 = var10;
                  L4: while (true) {
                    if (var11 < var12) {
                      int discarded$3 = 0;
                      eh.b();
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_d[var12];
                        if (var10 == var12) {
                          stackOut_15_0 = var18.b(var8, 0);
                          stackIn_16_0 = stackOut_15_0;
                          break L5;
                        } else {
                          stackOut_14_0 = var13.field_b[0];
                          stackIn_16_0 = stackOut_14_0;
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_16_0;
                        if (var12 == var11) {
                          stackOut_20_0 = var18.b(var9, param1 ^ 41);
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          if (var13 == null) {
                            stackOut_19_0 = 0;
                            stackIn_21_0 = stackOut_19_0;
                            break L6;
                          } else {
                            stackOut_18_0 = var13.field_b[var13.field_b.length + -1];
                            stackIn_21_0 = stackOut_18_0;
                            break L6;
                          }
                        }
                      }
                      var15 = stackIn_21_0;
                      gf.field_e.a(this.a(param3, param0, var14, -26318), var15 - var14, ((cn) this).field_d >>> 24, ((cn) this).field_d, var13.field_f, ((cn) this).field_n + param3.field_m + (param4 + (param3.field_o - -var13.field_i)), 11776);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("cn.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    cn(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected cn() {
    }

    cn(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            ((cn) this).field_f = param6;
            ((cn) this).field_i = param4;
            ((cn) this).field_a = param9;
            ((cn) this).field_j = param5;
            ((cn) this).field_g = param0;
            ((cn) this).field_b = param8;
            ((cn) this).field_p = param2;
            ((cn) this).field_n = param3;
            ((cn) this).field_o = param10;
            ((cn) this).field_k = param7;
            ((cn) this).field_d = param11;
            ((cn) this).field_l = param12 ? true : false;
            ((cn) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "cn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_m = new byte[50][];
        field_c = "Find and exterminate the spawn queen, then exit via the lift.";
        field_e = new int[255];
        for (var0 = 0; var0 < 255; var0++) {
            var1 = 3 * (var0 - 128);
            if (255 < var1) {
                var1 = 255;
            }
            if (var1 < 0) {
                var1 = 0;
            }
            field_e[var0] = 255 + 256 * var0;
        }
    }
}
