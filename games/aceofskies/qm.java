/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qm implements ir, et {
    int field_b;
    private boolean field_c;
    int field_d;
    int field_a;
    int field_e;
    private int field_h;
    int field_j;
    int field_g;
    BitmapFont field_i;
    int field_m;
    int field_k;
    int field_f;
    int field_l;

    private final void a(int param0, byte param1, int param2, ea param3) {
        try {
          int var5_int = 119 / ((param1 - 54) / 62);
          this.a(param2, param0, -28524415, 0, this.field_h, 0, param3, this.field_m);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qm.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, ea param6, int param7) {
        String stackIn_30_2 = null;
        int var11 = 0;
        int var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          fp.a((byte) 39, param6.field_h + param0, param6.field_n + (param0 + param6.field_h), param6.field_q + param1 + param6.field_p, param6.field_p + param1);
          if (param2 != -28524415) {
            this.field_g = -12;
          }
          int var9_int = this.b(param6, -90);
          int var10 = this.a(param6, false);
          if (this.field_c) {
            this.field_i.drawParagraph(this.d(param6, param2 + 28524453), this.a(param6, 123, param1, param5), this.a((byte) -24, param3, param0, param6), var9_int, var10, param7, param4, this.field_e, this.field_f, this.field_k);
          } else {
            int var12 = this.field_f;
            if (0 == var12) {
              var11 = this.field_i.maxAscent;
            } else if (2 != var12) {
              if (var12 != 3 &&
                var12 == 1) {
              }
              var11 = this.field_i.maxAscent + (var10 + (-this.field_i.maxAscent - this.field_i.maxDescent) >> 1);
            } else {
              var11 = -this.field_i.maxDescent + var10;
            }
            int var12Lifetime1 = this.field_e;
            if (0 != var12Lifetime1 &&
              3 != var12Lifetime1) {
              if (var12Lifetime1 == 1) {
                this.field_i.drawCenteredText(this.d(param6, 57), (var9_int >> 1) + this.a(param6, 113, param1, param5), this.a((byte) -24, param3, param0, param6) + var11, param7, param4);
              } else if (var12Lifetime1 == 2) {
                this.field_i.drawRightAlignedText(this.d(param6, -115), this.a(param6, 108, param1, param5) + var9_int, var11 + this.a((byte) -24, param3, param0, param6), param7, param4);
              }
              boolean decompiledFrameRemainder0 = false;
            }
            else {
              this.field_i.drawText(this.d(param6, -99), this.a(param6, 103, param1, param5), var11 + this.a((byte) -24, param3, param0, param6), param7, param4);
            }
          }
          sl.c(2765);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_29_0 = var9;
          StringBuilder stackIn_29_1 = new StringBuilder().append("qm.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 != -4) {
          return 104;
        }
        return this.field_i.maxDescent + this.field_i.maxAscent;
    }

    public final int a(int param0, ea param1, byte param2) {
        String stackIn_7_2 = null;
        try {
          if (param2 >= -34) {
            this.field_d = 74;
          }
          int stackIn_3_0 = this.a(param1, 106, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    String d(ea param0, int param1) {
        String stackIn_5_2 = null;
        try {
          int var3_int = -78 % ((3 - param1) / 35);
          String stackIn_1_0 = param0.field_f;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("qm.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(ea param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 <= 103) {
            this.field_a = 122;
          }
          this.a((byte) 118, param0);
          int stackIn_3_0 = param0.field_m.a((byte) 24) + this.field_b + this.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        ji.field_a = pb.field_b[param0];
        gm.field_w = du.field_o[param0];
        if (param1 != -44) {
          return;
        }
        dt.field_b = ng.field_J[param0];
    }

    public final int b(ea param0, int param1) {
        String stackIn_5_2 = null;
        try {
          int var3_int = 72 % ((55 - param1) / 43);
          int stackIn_1_0 = -this.field_b + param0.field_q - this.field_l;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("qm.K(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, ea param4) {
        int stackIn_7_3;
        String stackIn_12_2 = null;
        try {
          if (param0 != 71) {
            this.field_f = -24;
          }
          if (!param4.e(param0 ^ 28595)) {
            return;
          }
          pp var13 = this.a((byte) 88, param4);
          pp var14 = var13;
          int var7 = var14.a(param0 ^ 70, param3);
          co var8 = var13.field_b[var7];
          int var9 = var14.b(param3, param0 ^ -45);
          int var10 = this.a(param4, param0 ^ 48, param1, var9);
          int var11 = this.a(param2, false, param4) + Math.max(0, var8.field_f);
          int stackIn_6_0 = this.a(param2, false, param4);
          int stackIn_6_1 = this.a(param4, false);
          int stackIn_6_2 = var8.field_d;
          if (var14.field_b.length <= 1 + var7) {
            stackIn_7_3 = var8.field_d;
          } else {
            stackIn_7_3 = var13.field_b[var7 + 1].field_f;
          }
          int var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
          fp.a((byte) 108, param2 + param4.field_h, param4.field_h + param2 + param4.field_n, param4.field_q + (param1 + param4.field_p), param4.field_p + param1);
          ag.field_n.a(this.field_d, var11, var10, var10, 13053, var12);
          sl.c(2765);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var6;
          StringBuilder stackIn_11_1 = new StringBuilder().append("qm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, int param2, ea param3) {
        String stackIn_8_2 = null;
        try {
          if (param0 == -24) {
            int stackIn_4_0 = param1 + param3.field_l + (param3.field_h + (param2 + this.field_a));
            return stackIn_4_0;
          }
          int stackIn_2_0 = 80;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("qm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int a(ea param0, int param1, int param2, int param3) {
        String stackIn_7_2 = null;
        try {
          if (param1 <= 91) {
            this.field_a = 122;
          }
          int stackIn_3_0 = param0.field_j + this.field_b + param0.field_p + (param2 + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        int stackIn_25_0 = 0;
        int var14 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param4 <= param6) {
            return;
          }
          if (1 + param6 >= param5) {
            return;
          }
          if (param5 > 5 + param6 &&
            param0 != param2) {
            int var7_int = (param0 >> 1) + (param2 >> 1) + (param2 & param0 & 1);
            int var8 = param6;
            int var9 = param0;
            int var10 = param2;
            for (int var11 = param6; param5 > var11; var11++) {
              int var12 = uf.field_d[var11];
              if (param3) {
                stackIn_25_0 = js.field_c[var12];
              } else {
                stackIn_25_0 = ai.field_a[var12];
              }
              int var13 = stackIn_25_0;
              if (var13 > var7_int) {
                uf.field_d[var11] = uf.field_d[var8];
                int incrementValue$0 = var8;
                var8++;
                uf.field_d[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else if (var13 > var10) {
                var10 = var13;
              }
            }
            if (param1 > -3) {
              return;
            }
            qm.a(param0, (byte) -125, var9, param3, param4, var8, param6);
            qm.a(var10, (byte) -101, param2, param3, param4, param5, var8);
            return;
          }
          for (int var7_intLifetime1 = -1 + param5; var7_intLifetime1 > param6; var7_intLifetime1--) {
            for (int var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              int var9Lifetime1 = uf.field_d[var8Lifetime1];
              int var10Lifetime1 = uf.field_d[var8Lifetime1 + 1];
              if (jf.a(var10Lifetime1, param3, (byte) 67, var9Lifetime1)) {
                uf.field_d[var8Lifetime1] = var10Lifetime1;
                uf.field_d[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var7), "qm.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void c(ea param0, int param1) {
        String stackIn_33_2 = null;
        int var5 = 0;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -1) {
            ea var8 = (ea) null;
            this.a((ea) null, 73);
          }
          if (null == param0.field_m) {
            param0.field_m = (pp) ((Object) new vg());
          }
          int var3_int = this.b(param0, 117);
          int var4 = this.a(param0, false);
          int var6 = this.field_f;
          if (var6 == 0) {
            var5 = this.field_i.maxAscent;
          } else if (2 != var6) {
            if (var6 != 3 &&
              var6 != 1) {
            }
            var5 = this.field_i.maxAscent + (-this.field_i.maxDescent + (-this.field_i.maxAscent + var4) >> 1);
          } else {
            var5 = -this.field_i.maxDescent + var4;
          }
          int var6Lifetime1 = this.field_e;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param0.field_m instanceof vg)) {
                return;
              }
              ((vg) (param0.field_m)).a(108, this.field_i, var3_int >> 1, this.d(param0, -32), var5);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param0.field_m instanceof vg)) {
              return;
            }
            ((vg) (param0.field_m)).a(2137, this.d(param0, -41), var3_int, var5, this.field_i);
            return;
          }
          if (param0.field_m instanceof vg) {
            ((vg) (param0.field_m)).a(this.d(param0, param1 - 123), 0, var5, this.field_i, (byte) -54);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var3;
          StringBuilder stackIn_32_1 = new StringBuilder().append("qm.T(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, ea param1) {
        String stackIn_7_2 = null;
        try {
          this.a((byte) 98, param1);
          if (param0 != 2147483647) {
            this.field_b = 46;
          }
          int stackIn_3_0 = param1.field_m.a(param0 - 2147483647) + this.field_a + this.field_g;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final pp a(byte param0, ea param1) {
        String stackIn_13_2 = null;
        try {
          if (null == param1.field_m) {
            param1.field_m = (pp) ((Object) new vg());
          }
          if (param0 < 65) {
            pp stackIn_4_0 = (pp) null;
            return stackIn_4_0;
          }
          if (!this.field_c) {
            this.c(param1, -1);
          } else {
            ((vg) (param1.field_m)).a(this.d(param1, 114), this.field_i, this.field_f, 127395681, this.b(param1, 109), this.a(param1, false), this.field_e, this.field_k);
          }
          pp stackIn_9_0 = param1.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("qm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    qm(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(ea param0, boolean param1) {
        String stackIn_7_2 = null;
        try {
          if (param1) {
            ea var4 = (ea) null;
            this.a(97, (ea) null);
          }
          int stackIn_3_0 = param0.field_n + (-this.field_a - this.field_g);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        String stackIn_11_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param3 > 0) {
            byte[] var8 = new byte[param1];
            var4 = var8;
            for (int var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param2[param3 + var5_int];
            }
          } else {
            var4 = param2;
          }
          wb var5 = new wb();
          var5.b((byte) 0);
          var5.a(8, var4, (long)(param1 * 8));
          byte[] var6 = new byte[64];
          var5.a(var6, (byte) 82, param0);
          byte[] stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("qm.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, int param2, ea param3, int param4) {
        if (param1 != -7592) {
          this.field_d = 53;
        }
        if (null == this.field_i) {
          return;
        }
        try {
          this.a(param2, (byte) 126, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(ea param0, int param1, int param2, int param3, int param4, int param5) {
        String stackIn_7_2 = null;
        try {
          if (param4 != 3) {
            qm.a(-34, (byte) -121, -65, false, -128, 106, -121);
          }
          this.a((byte) 94, param0);
          int stackIn_3_0 = param0.field_m.a(param5 - this.a(param1, param0, (byte) -128), (byte) 102, -this.a(param2, false, param0) + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qm.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_2 = null;
        int var9 = 0;
        int var10 = 0;
        int var17 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var7_int = -96 % ((param5 + 83) / 34);
          if (param0 == param1) {
            return;
          }
          if (param4.e(28660)) {
            pp var8 = this.a((byte) 110, param4);
            if (param1 <= param0) {
              var10 = param0;
              var9 = param1;
            } else {
              var9 = param0;
              var10 = param1;
            }
            int var11 = var8.a(1, var9);
            int var12 = var8.a(1, var10);
            fp.a((byte) 73, param4.field_h + param2, param4.field_n + (param2 + param4.field_h), param4.field_q + param3 + param4.field_p, param4.field_p + param3);
            for (int var13 = var11; var12 >= var13; var13++) {
              co var14 = var8.field_b[var13];
              if (var13 == var11) {
                stackIn_13_0 = var8.b(var9, -126);
              } else {
                stackIn_13_0 = var14.field_h[0];
              }
              int var15 = stackIn_13_0;
              if (var12 == var13) {
                stackIn_18_0 = var8.b(var10, -128);
              } else if (var14 != null) {
                stackIn_18_0 = var14.field_h[var14.field_h.length - 1];
              } else {
                stackIn_18_0 = 0;
              }
              int var16 = stackIn_18_0;
              ag.field_n.a(var16 - var15, var14.field_f + this.field_a + (param4.field_h + param2 + param4.field_l), this.field_j, this.a(param4, 95, param3, var15), this.field_j >>> 24, (byte) -54, var14.field_d);
            }
            sl.c(2765);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var7;
          StringBuilder stackIn_23_1 = new StringBuilder().append("qm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    protected qm() {
    }

    final void a(qm param0, int param1) {
        try {
          param0.field_l = this.field_l;
          param0.field_d = this.field_d;
          param0.field_c = this.field_c;
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_k = this.field_k;
          param0.field_b = this.field_b;
          if (param1 != 27529) {
            this.field_l = 60;
          }
          param0.field_m = this.field_m;
          param0.field_j = this.field_j;
          param0.field_g = this.field_g;
          param0.field_i = this.field_i;
          param0.field_f = this.field_f;
          param0.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qm.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(int param0, boolean param1, ea param2) {
        String stackIn_8_2 = null;
        try {
          if (!param1) {
            int stackIn_4_0 = this.a((byte) -24, 0, param0, param2);
            return stackIn_4_0;
          }
          int stackIn_2_0 = -23;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("qm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    qm(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_f = param8;
          this.field_i = param0;
          this.field_d = param10;
          this.field_k = param9;
          this.field_g = param4;
          this.field_l = param2;
          this.field_c = param12 ? true : false;
          this.field_m = param5;
          this.field_e = param7;
          this.field_h = param6;
          this.field_j = param11;
          this.field_a = param3;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
