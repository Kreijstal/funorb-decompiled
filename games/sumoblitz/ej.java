/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends rq {
    static String field_g;
    private boolean field_e;
    private sk field_f;
    private boolean field_h;
    private oh field_j;
    static hr field_i;

    final boolean b(byte param0) {
        if (param0 > -8) {
          return false;
        }
        return this.field_e;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (this.field_h) {
          var4 = 1 << (3 & param2);
          var5 = (float)(1 << ((61 & param2) >> 3)) / 32.0f;
          var6 = param1 & 65535;
          var7 = (float)((param1 & 213452) >> 16) / 8.0f;
          var8 = this.field_j.field_d;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_b.field_kc % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (param0 != 34023) {
          int[] var10 = (int[]) null;
          ej.a(-97, -68, (byte[]) null, (byte[][]) null, (int[]) null, (byte) 113, (byte[][]) null, (int[]) null);
        }
    }

    public static void d(boolean param0) {
        if (param0) {
          field_g = (String) null;
        }
        field_g = null;
        field_i = null;
    }

    ej(on param0, ki param1, sk param2) {
        super(param0);
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj var4 = null;
        RuntimeException var4_ref = null;
        qj var5 = null;
        qj var6 = null;
        try {
          this.field_f = param2;
          if (param1 != null &&
            param0.field_Jc &&
            param0.field_Mc) {
            var6 = su.a(35633, param0, param1.a("environment_mapped_water_v", "gl", -1), -124);
            var4 = var6;
            var5 = su.a(35632, param0, param1.a("environment_mapped_water_f", "gl", -1), -115);
            this.field_j = ht.a(new qj[]{var6, var5}, param0, (byte) 109);
            stackIn_9_1 = (this.field_j != null) && (this.field_f.a(-128));
            this.field_e = stackIn_9_1;
            return;
          }
          this.field_e = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("ej.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
          this.a(false, 82);
        }
    }

    final void a(int param0, int param1, ed param2) {
        String var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (!this.field_h) {
            this.field_b.a(param2, param1 ^ 18943);
            this.field_b.h(122, param0);
          }
          if (param1 != 18834) {
            var5 = (String) null;
            ej.a((java.net.URL) null, (String) null, -103, (String) null, 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ej.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        long var4 = 0L;
        ef var3 = this.field_b.d((byte) 122);
        if (param1 != 20186) {
          String var6 = (String) null;
          ej.a((java.net.URL) null, (String) null, -110, (String) null, 111);
        }
        if (this.field_e &&
          var3 != null) {
          this.field_b.g(1, param1 ^ -20137);
          this.field_b.a(var3, 122);
          this.field_b.g(0, -125);
          this.field_b.a(this.field_f.field_e, 127);
          var4 = this.field_j.field_d;
          jaggl.OpenGL.glUseProgramObjectARB(var4);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_G[0], -this.field_b.field_G[1], -this.field_b.field_G[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_J, this.field_b.field_jb, this.field_b.field_Xb, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + Math.abs(this.field_b.field_G[1]) * 928.0f);
          this.field_h = true;
        }
    }

    final void c(boolean param0) {
        if (param0) {
          this.field_j = (oh) null;
        }
        if (this.field_h) {
          this.field_b.g(1, -124);
          this.field_b.a((ed) null, 106);
          this.field_b.g(0, -109);
          this.field_b.a((ed) null, 98);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_h = false;
        }
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_39_0 = null;
          java.net.URL stackIn_41_0 = null;
          RuntimeException stackIn_44_0 = null;
          StringBuilder stackIn_44_1 = null;
          String stackIn_45_2 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = Sumoblitz.field_L ? 1 : 0;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param2 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(0 <= var7_int);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 <= var7_int) {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param1 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param4 > ~param2) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param2));
                    }
                    if (param3 != null &&
                      param3.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param3);
                    }
                    if (param1 != null &&
                      param1.length() > 0) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param1);
                    }
                    if (var5.length() > var6) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                    } else {
                      discarded$8 = var7.append('/');
                    }
                    try {
                      stackIn_39_0 = new java.net.URL(param0, var7.toString());
                      return stackIn_39_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_41_0 = (java.net.URL) (param0);
                      return stackIn_41_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_44_0 = var5_ref;
            stackIn_44_1 = new StringBuilder().append("ej.N(");
            if (param0 == null) {
              stackIn_45_2 = "null";
            } else {
              stackIn_45_2 = "{...}";
            }
            stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte[] param2, byte[][] param3, int[] param4, byte param5, byte[][] param6, int[] param7) {
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8_int = param4[param0];
          var9 = var8_int + param7[param0];
          var10 = param4[param1];
          if (param5 != -75) {
            ej.d(false);
          }
          var11 = param7[param1] + var10;
          var12 = var8_int;
          if (var10 > var8_int) {
            var12 = var10;
          }
          var13 = var9;
          if (var9 > var11) {
            var13 = var11;
          }
          var14 = 255 & param2[param0];
          if ((param2[param1] & 255) < var14) {
            var14 = param2[param1] & 255;
          }
          var15 = param6[param0];
          var16 = param3[param1];
          var17 = -var8_int + var12;
          var18 = var12 - var10;
          for (var19 = var12; var19 < var13; var19++) {
            incrementValue$0 = var17;
            var17++;
            incrementValue$1 = var18;
            var18++;
            var20 = var15[incrementValue$0] + var16[incrementValue$1];
            if (var14 > var20) {
              var14 = var20;
            }
          }
          stackIn_18_0 = -var14;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ej.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_g = "Login: ";
    }
}
