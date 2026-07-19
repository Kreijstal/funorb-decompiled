/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends w {
    static byte[][] field_Nb;
    private w field_Vb;
    static w field_Ub;
    private w[] field_Rb;
    static ck field_Tb;
    static String field_Qb;
    int field_Pb;
    private w[] field_Sb;
    static w field_Ob;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (this.field_Rb.length <= var2) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a(-26, true, -12);
                break L1;
              }
            }
            return;
          } else {
            if (var2 != this.field_Pb) {
              if (0 != this.field_Rb[var2].field_ob) {
                this.field_Rb[this.field_Pb].field_ab = false;
                this.field_Sb[this.field_Pb].field_vb = this.field_Sb[this.field_Pb].field_vb + 10000;
                this.field_Pb = var2;
                this.field_Rb[var2].field_ab = true;
                this.field_Sb[var2].field_vb = this.field_Sb[var2].field_vb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void h(byte param0) {
        field_Nb = (byte[][]) null;
        field_Ob = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
    }

    tc(long param0, w param1, String[] param2, w param3, w[] param4, int param5) {
        super(param0, (w) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        w var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            this.field_Rb = new w[param2.length];
            this.field_Vb = new w(0L, param3);
            this.field_Sb = param4;
            var8_int = 0;
            L1: while (true) {
              if (param2.length <= var8_int) {
                this.a(this.field_Vb, -16834);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    this.field_Pb = param5;
                    this.field_Rb[param5].field_ab = true;
                    break L0;
                  } else {
                    this.field_Vb.a(param4[var11], -16834);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new w(0L, param1);
                var9.field_Y = param2[var8_int];
                this.field_Rb[var8_int] = var9;
                this.a(var9, -16834);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var8);
            stackOut_9_1 = new StringBuilder().append("tc.<init>(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = client.field_A ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_Rb.length) {
            this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= this.field_Sb.length) {
                return;
              } else {
                this.field_Sb[var8].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                if (var8 != this.field_Pb) {
                  this.field_Sb[var8].field_vb = this.field_Sb[var8].field_vb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * this.field_mb / this.field_Rb.length;
            var6 = this.field_mb * (var4 - -1) / this.field_Rb.length;
            this.field_Rb[var4].field_vb = var5;
            this.field_Rb[var4].field_Ib = 0;
            this.field_Rb[var4].field_mb = var6 + -var5;
            this.field_Rb[var4].field_N = param2;
            var4++;
            continue L0;
          }
        }
    }

    final static w g(byte param0) {
        return dm.a((byte) 108);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= -44) {
            this.a(4, true, -41);
        }
        this.field_N = param0;
        this.field_mb = param2;
        this.field_vb = param5;
        this.field_Ib = param1;
        this.a(param3, true, param4);
    }

    final static int a(int param0, hl param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ij.field_c;
              if (param1.field_m == 2) {
                if (!param1.field_j) {
                  L2: {
                    if (param1.field_i != 0) {
                      break L2;
                    } else {
                      if (param1.field_n == 0) {
                        var2_int = tl.field_q[param1.field_m];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = ul.field_c[param1.field_m];
                  break L1;
                } else {
                  var2_int = ij.field_c;
                  break L1;
                }
              } else {
                if (4 != param1.field_m) {
                  if (param1.field_r != uc.field_g) {
                    var2_int = ul.field_c[param1.field_m];
                    break L1;
                  } else {
                    var2_int = tl.field_q[param1.field_m];
                    break L1;
                  }
                } else {
                  var2_int = ul.field_c[param1.field_m];
                  break L1;
                }
              }
            }
            stackOut_14_0 = var2_int;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("tc.C(").append(4636).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
    }
}
