/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends ch implements vo {
    static pf field_I;
    private pn field_K;
    static java.awt.Font field_L;
    static int[] field_N;
    private String[] field_Q;
    static String field_J;
    static pi field_O;
    private qm[] field_P;
    static String field_M;

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_Q.length) {
                L2: {
                  if (this.field_P[this.field_Q.length] != param0) {
                    break L2;
                  } else {
                    this.field_K.a((byte) 41);
                    break L2;
                  }
                }
                L3: {
                  if (param2 == 11) {
                    break L3;
                  } else {
                    this.field_Q = (String[]) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_P[var6_int] != param0) {
                    break L4;
                  } else {
                    this.field_K.a(this.field_Q[var6_int], (byte) -104);
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("a.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 16) {
            a.a(true, -63);
        }
        field_M = null;
        field_N = null;
        field_L = null;
        field_I = null;
        field_J = null;
        field_O = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int discarded$0 = 0;
        super.a(param0, param1, param2, (byte) -79);
        if (param1 != 0) {
            return;
        }
        int var5 = 118 / ((param3 - 70) / 49);
        jl var6 = he.field_d;
        if (null != this.field_Q) {
            discarded$0 = var6.a(ok.field_c, param2 + this.field_z, param0 - -this.field_p, this.field_E, 20, 16777215, -1, 0, 0, var6.field_w + var6.field_z);
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param0) {
                if (-100 == (param0 ^ -1)) {
                  stackOut_9_0 = this.b(10, param2);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a(0, param2);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("a.G(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (!(null == ri.field_f)) {
            if (ri.field_f.b(-85, param0)) {
                ri.field_f = null;
            }
        }
        if (param1 <= 56) {
            field_O = (pi) null;
        }
    }

    final static void a(byte param0, int param1) {
        int discarded$3 = jg.l(84);
        if (param0 >= -103) {
            field_M = (String) null;
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ia var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_F.e(81);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  if (param0 < -83) {
                    var3_int = param1.length;
                    this.field_Q = new String[var3_int];
                    var4_int = 0;
                    L2: while (true) {
                      if (var3_int <= var4_int) {
                        var4 = new ia(he.field_d, 0, 1);
                        this.field_P = new qm[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            this.field_P[var3_int] = new qm(d.field_d, (fn) (this));
                            this.field_P[var3_int].field_y = (eb) ((Object) var4);
                            this.field_P[var3_int].a(100, (byte) 102, 16 + (16 * var3_int + 20), 0, 15);
                            this.b(this.field_P[var3_int], 80);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_P[var5] = new qm(this.field_Q[var5], (fn) (this));
                            this.field_P[var5].field_y = (eb) ((Object) var4);
                            this.field_P[var5].field_l = io.field_a;
                            this.field_P[var5].a(80, (byte) 63, 20 + 16 * var5, 0, 15);
                            this.b(this.field_P[var5], 80);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        this.field_Q[var4_int] = ng.a((CharSequence) ((Object) param1[var4_int]), -1).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_Q = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("a.D(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void l(int param0) {
        String var2 = (String) null;
        al.a(nk.field_b, -116, (String) null);
        if (param0 != 20700) {
            a.a((byte) -98, -12);
        }
    }

    a(pn param0) {
        super(0, 0, 0, 0, (eb) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new int[4];
        field_J = "Friends";
        field_M = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
