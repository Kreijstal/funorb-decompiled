/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends tfa implements gf {
    static fta field_m;
    static String field_k;
    private int field_l;
    private int field_n;

    final static String[] a(uia param0, byte param1) {
        RuntimeException var2 = null;
        int var3_int = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        vna var6 = null;
        vna var7 = null;
        String[] stackIn_3_0 = null;
        uia stackIn_6_0 = null;
        boolean stackIn_8_0 = false;
        int stackIn_14_0 = 0;
        String[] stackIn_17_0 = null;
        String[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uia stackOut_4_0 = null;
        boolean stackOut_7_0 = false;
        uia stackOut_5_0 = null;
        int stackOut_13_0 = 0;
        String[] stackOut_16_0 = null;
        String[] stackOut_19_0 = null;
        String[] stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6 = new vna();
            var7 = var6;
            if (param1 >= 32) {
              stackOut_4_0 = (uia) (param0);
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (stackIn_6_0.field_h >= param0.field_g.length) {
                      break L3;
                    } else {
                      var3_int = w.a(param0, -58, var7);
                      stackOut_7_0 = qqa.a(param0, mga.field_j, var3_int, true);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_8_0) {
                            break L4;
                          } else {
                            param0.field_h = param0.field_h + (mga.field_j.length - 1);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var5 == 0) {
                          stackOut_5_0 = (uia) (param0);
                          stackIn_6_0 = stackOut_5_0;
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var7.a((byte) -16);
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                var3 = new String[stackIn_14_0];
                var4 = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var3.length <= var4) {
                        break L7;
                      } else {
                        stackOut_16_0 = (String[]) (var3);
                        stackIn_20_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var5 != 0) {
                          break L6;
                        } else {
                          stackIn_17_0[var4] = ((gka) ((Object) var6.c(-103))).field_h;
                          var4++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_19_0 = (String[]) (var3);
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (String[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("pe.K(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    pe(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
            this.field_l = param3;
            this.field_n = param4;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(78), param3, param4, 0, waa.a(this.field_f, 1383), lr.a(this.field_a, 5126), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, byte param6) {
        goa var7 = null;
        RuntimeException var7_ref = null;
        goa var8 = null;
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
              var7 = new goa(param4);
              var8 = new goa(param2);
              if (param6 == 53) {
                break L1;
              } else {
                field_m = (fta) null;
                break L1;
              }
            }
            stackOut_2_0 = fja.a(var8, param5, param0, param1, var7, param6 + 48, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7_ref);
            stackOut_4_1 = new StringBuilder().append("pe.J(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, hs param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        if (param0 != -7070) {
            this.a((byte) -45, true, false);
            return this.field_l;
        }
        return this.field_l;
    }

    pe(kda param0, ft param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_g, param2 * param3, false);
        try {
            this.field_n = param3;
            this.field_l = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(125), param2, param3, 0, waa.a(this.field_f, 1383), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            return -1.0163322687149048f;
        }
        return param1;
    }

    pe(kda param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, gpa.field_a, una.field_g, param1 * param2, false);
        try {
            this.field_l = param1;
            this.field_n = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(this.field_i, 0, 6408, this.field_l, this.field_n, 0, 32993, this.field_j.field_od, param3, param4 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int a(byte param0) {
        if (param0 > 0) {
            return -120;
        }
        return this.field_n;
    }

    public final void b(byte param0) {
        if (param0 <= 32) {
            field_k = (String) null;
            super.b((byte) 72);
            return;
        }
        super.b((byte) 72);
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        if (param0 <= -60) {
            return;
        }
        boolean discarded$0 = this.a(96);
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        field_m = (fta) null;
    }

    pe(kda param0, ft param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_h, param2 * param3, false);
        try {
            this.field_n = param3;
            this.field_l = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(this.field_i, 0, this.d(75), param2, param3, 0, waa.a(this.field_f, 1383), 5126, param4, 4 * param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            field_m = (fta) null;
            return false;
        }
        return false;
    }

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
            return 1.619486927986145f;
        }
        return param0;
    }

    static {
        field_k = "Enter name of player to add to list";
        field_m = new fta();
    }
}
