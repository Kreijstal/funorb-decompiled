/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wf {
    static int field_m;
    static sh field_u;
    static sh field_p;
    static long field_k;
    private int field_q;
    static int field_r;
    static cc[] field_o;
    private pe field_n;
    static int field_t;
    static db[] field_l;
    static int field_s;

    final int i(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != -76) {
          field_u = (sh) null;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$4] - this.field_n.c(0) & 255;
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$5] - this.field_n.c(0) & 255;
        }
    }

    final void f(int param0) {
        this.field_h = (this.field_q - -7) / param0;
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param0 >= 56) {
              L1: {
                if (null == bg.field_b) {
                  break L1;
                } else {
                  bg.field_b.field_C.a(param1, false);
                  break L1;
                }
              }
              L2: {
                if (null == hd.field_a) {
                  break L2;
                } else {
                  hd.field_a.field_F.a(param1, false);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("th.G(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 + this.field_n.c(param1));
    }

    final void e(int param0) {
        if (param0 != 10) {
            return;
        }
        this.field_q = 8 * this.field_h;
    }

    final int g(int param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var3 = this.field_q >> 558169987;
        if (param1 == 26527) {
          var4 = -(7 & this.field_q) + 8;
          var5 = 0;
          this.field_q = this.field_q + param0;
          L0: while (true) {
            if (param0 > var4) {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((bd.field_j[var4] & this.field_j[incrementValue$2]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (param0 != var4) {
                    break L2;
                  } else {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          field_r = 53;
          var4 = -(7 & this.field_q) + 8;
          var5 = 0;
          this.field_q = this.field_q + param0;
          L3: while (true) {
            if (param0 > var4) {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((bd.field_j[var4] & this.field_j[incrementValue$3]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L3;
              } else {
                var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                return var5;
              }
            } else {
              L4: {
                L5: {
                  if (param0 != var4) {
                    break L5;
                  } else {
                    var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
                break L4;
              }
              return var5;
            }
          }
        }
    }

    th(byte[] param0) {
        super(param0);
    }

    final static int a(CharSequence param0, int param1, int param2) {
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
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 8) {
              stackOut_3_0 = ti.a(param2, param0, 18, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 116;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("th.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void j(byte param0) {
        field_l = null;
        field_u = null;
        field_o = null;
        field_p = null;
        int var1 = -42 % ((-6 - param0) / 50);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = -69 % ((-4 - param2) / 32);
            var6 = 0;
            L1: while (true) {
              if (param0 <= var6) {
                break L0;
              } else {
                fieldTemp$5 = this.field_h;
                this.field_h = this.field_h + 1;
                param3[var6 - -param1] = (byte)(this.field_j[fieldTemp$5] + -this.field_n.c(0));
                var6++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("th.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(int[] param0, int param1) {
        try {
            int var3_int = 18 / ((param1 - -36) / 50);
            this.field_n = new pe(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "th.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    th(int param0) {
        super(param0);
    }

    static {
        field_o = new cc[10];
    }
}
