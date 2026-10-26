/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends cq implements qi {
    private int field_j;
    private int field_k;
    static int rendererJustificationRemainderQ8;

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        String stackIn_6_2 = null;
        try {
          int var9_int = -48 / ((-58 - param0) / 45);
          this.field_g.a((jj) (this), -9135);
          jaggl.OpenGL.glPixelStorei(3314, param3);
          jaggl.OpenGL.glTexSubImage2Di(this.field_e, 0, param2, param6, param4, param5, 32993, this.field_g.field_Bc, param7, param1);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ed.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, byte[] param5, hd param6, int param7, int param8) {
        String stackIn_6_2 = null;
        String stackIn_10_2 = null;
        try {
          this.field_g.a((jj) (this), -9135);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          int var10_int = 49 % ((param4 - 67) / 37);
          jaggl.OpenGL.glPixelStorei(3314, param8);
          jaggl.OpenGL.glTexSubImage2Dub(this.field_e, 0, param7, param0, param1, param3, gq.a(param6, -29824), 5121, param5, param2);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ed.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(float[] param0, byte param1, int param2, int param3, int param4, int param5, int param6, hd param7, int param8) {
        String stackIn_6_2 = null;
        String stackIn_10_2 = null;
        try {
          this.field_g.a((jj) (this), -9135);
          int var10_int = 25 % ((param1 + 57) / 57);
          jaggl.OpenGL.glPixelStorei(3314, param5);
          jaggl.OpenGL.glTexSubImage2Df(this.field_e, 0, param3, param2, param8, param6, gq.a(param7, -29824), 5121, param0, param4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ed.T(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param8).append(')').toString());
        }
    }

    ed(jc param0, hd param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, la.field_h, param2 * param3, param4);
        String stackIn_17_2 = null;
        String stackIn_21_2 = null;
        String stackIn_25_2 = null;
        try {
          this.field_j = param2;
          this.field_k = param3;
          this.field_g.a((jj) (this), -9135);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (!param4 ||
            param7 != 0 ||
            param6 != 0) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          if (param4 &&
            param7 == 0 &&
            param6 == 0 || AceOfSkies.obfuscationControl) {
            this.a(this.field_e, param3, param5, param2, (byte) 107);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var9;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ed.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(int param0) {
        try {
          if (param0 > 56) {
            int stackIn_4_0 = this.field_j;
            return stackIn_4_0;
          }
          int stackIn_2_0 = 92;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.Q(" + param0 + ')');
        }
    }

    public final void a(boolean param0, boolean param1, byte param2) {
        int stackIn_7_2 = 0;
        int stackIn_11_2 = 0;
        try {
          if (param2 != -127) {
            this.field_k = 119;
          }
          this.field_g.a((jj) (this), -9135);
          int stackIn_6_0 = this.field_e;
          int stackIn_6_1 = 10242;
          stackIn_7_2 = (!param1) ? (33071) : (10497);
          jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_7_2);
          int stackIn_10_0 = this.field_e;
          int stackIn_10_1 = 10243;
          stackIn_11_2 = (!param0) ? (33071) : (10497);
          jaggl.OpenGL.glTexParameteri(stackIn_10_0, stackIn_10_1, stackIn_11_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "ed.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ed(jc param0, hd param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, la.field_i, param3 * param2, param4);
        String stackIn_16_2 = null;
        String stackIn_20_2 = null;
        String stackIn_24_2 = null;
        try {
          this.field_k = param3;
          this.field_j = param2;
          this.field_g.a((jj) (this), -9135);
          if (param4 ||
            param7 != 0 ||
            0 != param6) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5126, param5, 4 * param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            if (!AceOfSkies.obfuscationControl) {
              return;
            }
          }
          this.a(param5, true, param2, param3, this.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_15_0 = runtimeException;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ed.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    ed(jc param0, hd param1, la param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param3 * param4, false);
        String stackIn_7_2 = null;
        String stackIn_11_2 = null;
        String stackIn_15_2 = null;
        try {
          this.field_k = param4;
          this.field_j = param3;
          this.field_g.a((jj) (this), -9135);
          jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param3, param4, 0, gq.a(this.field_h, -29824), kk.a(this.field_c, (byte) -96), (byte[]) null, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ed.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(ke param0, int param1) {
        String stackIn_6_2 = null;
        try {
          super.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ed.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public final float a(float param0, byte param1) {
        try {
          if (param1 != -32) {
            this.field_k = -67;
          }
          float stackIn_4_0 = param0 / (float)this.field_k;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "ed.P(" + param0 + ',' + param1 + ')');
        }
    }

    public final float a(int param0, float param1) {
        try {
          if (param0 > 65) {
            float stackIn_4_0 = param1 / (float)this.field_j;
            return stackIn_4_0;
          }
          float stackIn_2_0 = -0.6172323226928711f;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "ed.N(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(byte param0) {
        try {
          super.a(param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ed.C(" + param0 + ')');
        }
    }

    final static void a(int param0, wu param1, byte param2, int param3, boolean param4) {
        int stackIn_34_2 = 0;
        int stackIn_53_0 = 0;
        String stackIn_70_2 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var5_int = ek.a((byte) 103, (-param0 + param3) * 3);
          int var6 = param0 * 3;
          pl.a(0);
          if (param2 >= -60) {
            ed.a(-54, (wu) null, (byte) -49, -81, true);
          }
          int var7 = var5_int - 10;
          if (param1.field_f > 0 &&
            param1.field_x != null) {
            dt.b(8);
          }
          AircraftDefinition.field_k = 0;
          int var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.field_K > var8)))) {
            int var9 = param1.field_I[var8];
            int var10 = param1.field_t[var8];
            int var11 = param1.field_m[var8];
            boolean stackOut_12_0 = param4;
            stackIn_53_0 = stackOut_12_0 ? 1 : 0;
            boolean stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                int var12 = qj.field_t[var9];
                int var13 = ro.field_t[var9];
                var14 = -var12 + qj.field_t[var10];
                var15 = qj.field_t[var11] - var12;
                var16 = -var13 + ro.field_t[var10];
                var17 = ro.field_t[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(-(var16 * var15) + var14 * var17 >= 0)) {
                int var12Lifetime1 = lp.field_d[var9];
                if (var12Lifetime1 != -2147483648) {
                  int var13Lifetime1 = lp.field_d[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = lp.field_d[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + var13Lifetime1 + (var12Lifetime1 + var14);
                      int stackIn_33_0 = -1;
                      int stackIn_33_1 = gi.field_i.length;
                      stackIn_34_2 = (var7 < 0) ? (var15 << -var7) : (var15 >> var7);
                      var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_34_2);
                      var17 = gi.field_i[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          int stackIn_44_0 = 0;
                          int stackIn_44_1 = var16;
                          if (stackIn_44_0 > stackIn_44_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = gi.field_i[var16];
                          continue;
                        }
                        int stackIn_44_0Lifetime1 = var16 << 4;
                        int stackIn_44_1Lifetime1 = -var17;
                        int var18 = stackIn_44_0Lifetime1 - stackIn_44_1Lifetime1;
                        jr.field_n[var18] = var8;
                        gi.field_i[var16] = var17 + 1;
                        if (0 < param1.field_f &&
                          null != param1.field_x) {
                          byte dupTemp$0 = param1.field_x[var8];
                          hs.field_a[dupTemp$0] = hs.field_a[dupTemp$0] + 1;
                        }
                        AircraftDefinition.field_k = AircraftDefinition.field_k + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_53_0 = 0;
          }
          if (stackIn_53_0 < param1.field_f &&
            null != param1.field_x) {
            int var8Lifetime1 = 0;
            int var9Lifetime1 = 0;
            while (!(hs.field_a.length <= var9Lifetime1)) {
              int var10Lifetime1 = hs.field_a[var9Lifetime1];
              hs.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_69_0 = var5;
          StringBuilder stackIn_69_1 = new StringBuilder().append("ed.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int b(byte param0) {
        try {
          if (param0 <= 2) {
            ed.a(125, (wu) null, (byte) -44, -22, true);
          }
          int stackIn_4_0 = this.field_k;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.M(" + param0 + ')');
        }
    }

    ed(jc param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, lc.field_g, la.field_h, param1 * param2, param3);
        String stackIn_16_2 = null;
        String stackIn_20_2 = null;
        try {
          this.field_j = param1;
          this.field_k = param2;
          this.field_g.a((jj) (this), -9135);
          if (!param3 ||
            0 != param6 ||
            param5 != 0) {
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Di(this.field_e, 0, 6408, this.field_j, this.field_k, 0, 32993, this.field_g.field_Bc, param4, 4 * param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            if (!AceOfSkies.obfuscationControl) {
              return;
            }
          }
          this.a((byte) -110, param2, param1, param4, this.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_15_0 = runtimeException;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ed.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final boolean c(byte param0) {
        try {
          if (param0 >= -104) {
            this.field_j = 49;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.L(" + param0 + ')');
        }
    }

    static {
        rendererJustificationRemainderQ8 = 0;
    }
}
