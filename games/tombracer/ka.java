/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static float[] field_b;
    boolean field_a;
    private static String[] field_c;

    abstract void FA(int param0);

    abstract void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -11) {
          ka.a((byte) -43);
        }
    }

    abstract void b();

    abstract void O(int param0, int param1, int param2);

    final static pr a(byte param0, byte[] param1, int param2, kda param3) {
        Object stackIn_14_0 = null;
        pr stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        byte[] var11 = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1.length == 0) {
            return null;
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
          jaggl.OpenGL.glShaderSourceRawARB(var4_long, param1);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          var6 = 35 / ((param0 + 29) / 46);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, ita.field_a, 0);
          if (ita.field_a[0] == 0) {
            if (ita.field_a[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, ita.field_a, 1);
            if (ita.field_a[1] > 1) {
              var11 = new byte[ita.field_a[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, ita.field_a[1], ita.field_a, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (ita.field_a[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_14_0 = null;
              return (pr) (stackIn_14_0);
            }
          }
          stackIn_16_0 = new pr(param3, var4_long, param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ka.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    abstract void a(gda param0, el param1, int param2);

    abstract ka a(byte param0, int param1, boolean param2);

    abstract void a();

    abstract void a(gda param0, el param1, int param2, int param3);

    private final void a(int[] param0, int param1, int param2, int[] param3, boolean param4, int param5, int param6, int param7, int param8, byte param9) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        el var13 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param1 != 1) {
            if (param1 != 2) {
              if (param1 == 3) {
                if (0 != param2 &&
                  param2 != 1) {
                  if (param2 == 3) {
                    var11_int = param7;
                    param7 = param6;
                    param6 = var11_int;
                  } else {
                    if ((param2 == 2)) {
                      var11_int = param7;
                      param7 = param6 & 16383;
                      param6 = -var11_int & 16383;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var11_int = param7;
                  param7 = -param6;
                  param6 = var11_int;
                }
              }
            } else {
              if (param2 != 0 &&
                param2 != 1) {
                if ((param2 == 2)) {
                  param6 = 16383 & -param6;
                  param7 = 16383 & -param7;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                param7 = -param7;
                param6 = -param6;
              }
            }
          } else {
            if (0 != param2 &&
              param2 != 1) {
              if (param2 == 3) {
                var11_int = param7;
                param7 = param6;
                param6 = var11_int;
              } else {
                if ((param2 == 2)) {
                  var11_int = param7;
                  param7 = 16383 & -param6;
                  param6 = 16383 & var11_int;
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var11_int = -param7;
              param7 = param6;
              param6 = var11_int;
            }
          }
          if (param9 <= 81) {
            var13 = (el) null;
            this.a((gda) null, (el) null, -114);
          }
          if (param5 != 65535) {
            this.I(param2, param0, param7, param8, param6, param4, param5, param3);
          } else {
            this.a(param2, param0, param7, param8, param6, param1, param4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_35_0 = var11;
          stackIn_35_1 = new StringBuilder().append("ka.EA(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, boolean param2, rq param3, int param4, int[] param5, int param6, nk param7, rq param8, int param9, boolean[] param10, boolean param11) {
        int stackIn_10_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          if (param8 != null &&
            0 != param0) {
            var37 = 0;
            var13_int = var37;
            var38 = 0;
            var14 = var38;
            var39 = 0;
            var15 = var39;
            if (param11) {
              this.field_a = true;
            }
            while (var39 < param7.field_j) {
              var16 = 0;
              if (param3.field_i > var37 &&
                var39 == param3.field_m[var37]) {
                var16 = 1;
              }
              var17 = 0;
              if (param8.field_i > var38 &&
                var39 == param8.field_m[var38]) {
                var17 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var16 != 0 ||
                var17 != 0) {
                if (param10 != null) {
                  stackIn_39_0 = (param10[var39]) ? 0 : 1;
                  if (param1) {
                    stackIn_42_1 = 0;
                  } else {
                    stackIn_42_1 = 1;
                  }
                  if (stackIn_39_0 != stackIn_42_1 &&
                    param7.field_h[var39] != 0) {
                    if (var16 != 0) {
                      var37++;
                    }
                    if ((var17 != 0)) {
                      var38++;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var18 = 0;
                  var19 = param7.field_h[var39];
                  if (3 == var19 ||
                    var19 == 10) {
                    var18 = 128;
                  }
                  if (var16 != 0) {
                    var20 = param3.field_l[var37];
                    var21 = param3.field_k[var37];
                    var22 = param3.field_d[var37];
                    var23 = param3.field_j[var37];
                    var24 = param3.field_a[var37];
                    var37++;
                  } else {
                    var20 = var18;
                    var24 = 0;
                    var22 = var18;
                    var23 = -1;
                    var21 = var18;
                  }
                  if (var17 != 0) {
                    var26 = param8.field_k[var38];
                    var28 = param8.field_j[var38];
                    var27 = param8.field_d[var38];
                    var25 = param8.field_l[var38];
                    var29 = param8.field_a[var38];
                    var38++;
                  } else {
                    var27 = var18;
                    var25 = var18;
                    var29 = 0;
                    var26 = var18;
                    var28 = -1;
                  }
                  if (-1 == var23) {
                    if (-1 != var28) {
                      this.a(param7.field_f[var28], param4, 0, param5, param2, param7.field_i[var28] & param6, 0, 0, 0, (byte) 85);
                    }
                  } else {
                    this.a(param7.field_f[var23], param4, 0, param5, param2, param7.field_i[var23] & param6, 0, 0, 0, (byte) 103);
                  }
                  if ((var24 & 2) == 0 &&
                    (var29 & 1) == 0) {
                    switch (var19) {
                      case 2:
                        var33 = 16383 & -var20 + var25;
                        var34 = var26 - var21 & 16383;
                        if (var33 >= 8192) {
                          var33 -= 16384;
                        }
                        if (var34 >= 8192) {
                          var34 -= 16384;
                        }
                        var35 = 16383 & var27 - var22;
                        var30 = 16383 & param0 * var33 / param9 + var20;
                        var31 = var21 + param0 * var34 / param9 & 16383;
                        if (var35 >= 8192) {
                          var35 -= 16384;
                        }
                        var32 = var22 + param0 * var35 / param9 & 16383;
                        break;
                      case 9:
                        var33 = 16383 & -var20 + var25;
                        if (8192 <= var33) {
                          var33 -= 16384;
                        }
                        var30 = var20 + param0 * var33 / param9 & 16383;
                        var31 = 0;
                        var32 = 0;
                        break;
                      default:
                        var31 = var21 + (-var21 + var26) * param0 / param9;
                        var30 = (var25 - var20) * param0 / param9 + var20;
                        var32 = param0 * (var27 - var22) / param9 + var22;
                        break;
                      case 7:
                        var33 = 63 & -var20 + var25;
                        if (var33 >= 32) {
                          var33 -= 64;
                        }
                        var30 = var20 + param0 * var33 / param9 & 63;
                        var32 = var22 + (var27 - var22) * param0 / param9;
                        var31 = var21 + param0 * (-var21 + var26) / param9;
                        break;
                    }
                  } else {
                    var32 = var22;
                    var31 = var21;
                    var30 = var20;
                  }
                  this.a(param7.field_f[var39], param4, var19, param5, param2, param6 & param7.field_i[var39], var32, var30, var31, (byte) 114);
                }
              }
              var39++;
            }
            return;
          }
          for (var13_int = 0; param3.field_i > var13_int; var13_int++) {
            var14 = param3.field_m[var13_int];
            boolean decompiledSharedTail0 = (param10 == null);
            if (!decompiledSharedTail0) {
              stackIn_10_0 = (param1) ? 0 : 1;
              if (param10[var14]) {
                stackIn_13_1 = 0;
              } else {
                stackIn_13_1 = 1;
              }
              decompiledSharedTail0 = (stackIn_10_0 == stackIn_13_1 ||
                param7.field_h[var14] == 0);
            }
            if (decompiledSharedTail0) {
              var15 = param3.field_j[var13_int];
              if (-1 != var15) {
                this.a(param7.field_f[var15], param4, 0, param5, param2, param7.field_i[var15] & param6, 0, 0, 0, (byte) 96);
              }
              this.a(param7.field_f[var14], param4, param7.field_h[var14], param5, param2, param7.field_i[var14] & param6, (int) param3.field_d[var13_int], (int) param3.field_l[var13_int], (int) param3.field_k[var13_int], (byte) 90);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_95_0 = var13;
          stackIn_95_1 = new StringBuilder().append("ka.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
          if (param8 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param11).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2, int param3);

    abstract void H(int param0, int param1, int param2);

    final void a(int param0, ena param1, int param2, int param3, int param4, ena param5, int param6, boolean param7, int param8) {
        rq var14 = null;
        nk var11 = null;
        Object var12 = null;
        rq var15 = null;
        if (-1 == param3) {
          return;
        }
        this.a();
        if (!this.NA()) {
          this.b();
          return;
        }
        try {
          var14 = param1.field_o[param3];
          var11 = var14.field_f;
          var12 = null;
          if (param5 != null) {
            var15 = param5.field_o[param2];
            var12 = var15;
            if (var11 != var15.field_f) {
              var12 = null;
            }
          }
          int var13 = -124 / ((-85 - param0) / 35);
          this.a(param4, false, param7, var14, param8, (int[]) null, 65535, var11, (rq) (var12), param6, (boolean[]) null, false);
          this.wa();
          this.b();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ka.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    abstract void wa();

    final static void a(byte param0) {
        if (param0 != -33) {
          ka.a((byte) 65);
        }
        if (ci.field_l != null) {
          ci.field_l.i((byte) -7);
        }
        md.field_F = new efa();
        um.field_l.a(100, md.field_F);
    }

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    protected ka() {
        this.field_a = false;
    }

    abstract boolean NA();

    static {
        int var0 = 0;
        field_b = new float[4];
        field_c = new String[4];
        for (var0 = 0; var0 < 4; var0++) {
          field_c[var0] = "Test Model " + (var0 + 1);
        }
    }
}
