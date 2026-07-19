/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa extends ds {
    private int field_k;
    private int field_i;
    private dq field_j;

    final void a(int param0, int param1, int param2) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        param1 = param1 & uta.field_q[param2];
        L0: while (true) {
          if (this.field_k >= param2) {
            L1: {
              if (this.field_k == param2) {
                fieldTemp$4 = this.field_e;
                this.field_e = this.field_e + 1;
                this.field_h[fieldTemp$4] = (byte)(this.field_h[fieldTemp$4] + param1);
                this.field_h[this.field_e] = (byte) 0;
                this.field_k = 8;
                break L1;
              } else {
                this.field_k = this.field_k - param2;
                this.field_h[this.field_e] = (byte)(this.field_h[this.field_e] + (param1 << this.field_k));
                break L1;
              }
            }
            if (param0 != -632) {
              this.field_k = -63;
              return;
            } else {
              return;
            }
          } else {
            param2 = param2 - this.field_k;
            fieldTemp$5 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_h[fieldTemp$5] = (byte)(this.field_h[fieldTemp$5] + (param1 >>> param2));
            this.field_h[this.field_e] = (byte) 0;
            this.field_k = 8;
            continue L0;
          }
        }
    }

    final void f(byte param0) {
        this.field_e = (this.field_i - -7) / 8;
        if (param0 > -31) {
            this.field_j = (dq) null;
        }
    }

    final int o(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 255) {
          this.f((byte) -108);
          fieldTemp$4 = this.field_e;
          this.field_e = this.field_e + 1;
          return 255 & this.field_h[fieldTemp$4] + -this.field_j.a((byte) -41);
        } else {
          fieldTemp$5 = this.field_e;
          this.field_e = this.field_e + 1;
          return 255 & this.field_h[fieldTemp$5] + -this.field_j.a((byte) -41);
        }
    }

    final static vab a(byte param0, qfa param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vab stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        vab stackIn_8_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        vab stackOut_7_0 = null;
        vab stackOut_1_0 = null;
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
        try {
          L0: {
            if (param0 == 115) {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param2, var4_int);
              jaggl.OpenGL.glProgramStringARB(param2, 34933, param3);
              jaggl.OpenGL.glGetIntegerv(34379, lp.field_b, 0);
              if (lp.field_b[0] != -1) {
                jaggl.OpenGL.glBindProgramARB(param2, 0);
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                jaggl.OpenGL.glBindProgramARB(param2, 0);
                stackOut_7_0 = new vab(param1, param2, var4_int);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (vab) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("faa.A(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vab) ((Object) stackIn_6_0);
          } else {
            return stackIn_8_0;
          }
        }
    }

    final int i(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = VoidHunters.field_G;
        int var3 = this.field_i >> 535624387;
        int var4 = 8 + -(7 & this.field_i);
        int var5 = param0;
        this.field_i = this.field_i + param1;
        while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_h[incrementValue$0] & uta.field_q[var4]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (this.field_h[var3] >> -param1 + var4 & uta.field_q[param1]);
        } else {
            var5 = var5 + (this.field_h[var3] & uta.field_q[var4]);
        }
        return var5;
    }

    faa(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 24335) {
          this.field_j = (dq) null;
          fieldTemp$4 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$4] = (byte)(param1 + this.field_j.a((byte) -41));
          return;
        } else {
          fieldTemp$5 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$5] = (byte)(param1 + this.field_j.a((byte) -41));
          return;
        }
    }

    faa(int param0) {
        super(param0);
    }

    final void r(int param0) {
        L0: {
          if (-9 < (this.field_k ^ -1)) {
            this.field_e = this.field_e + 1;
            this.field_k = 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 32712) {
          this.field_j = (dq) null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_j = new dq(param1);
              if (param0 == 18794) {
                break L1;
              } else {
                this.r(-43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("faa.DB(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void p(int param0) {
        this.field_i = 8 * this.field_e;
        if (param0 != -23497) {
            this.r(-90);
        }
    }

    final void q(int param0) {
        this.field_h[this.field_e] = (byte) 0;
        if (param0 > -66) {
            return;
        }
        this.field_k = 8;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int discarded$7 = 0;
        int fieldTemp$8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == -50) {
                break L1;
              } else {
                discarded$7 = this.o(39);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                fieldTemp$8 = this.field_e;
                this.field_e = this.field_e + 1;
                param3[var5_int - -param1] = (byte)(this.field_h[fieldTemp$8] + -this.field_j.a((byte) -41));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("faa.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
    }
}
