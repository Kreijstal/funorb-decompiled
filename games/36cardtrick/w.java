/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends pb {
    private int field_o;
    private hg field_l;
    static String field_m;
    static int field_n;

    w(int param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        try {
          this.field_l = new hg(param0);
          if (param1 != 8) {
            int[] var4 = (int[]) null;
            this.b((int[]) null, 66);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "w.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        this.field_i = (7 + this.field_o) / param0;
    }

    final void f(boolean param0) {
        if (!param0) {
          field_m = (String) null;
        }
        this.field_o = this.field_i * 8;
    }

    final int g(byte param0) {
        int var2 = 118 % ((39 - param0) / 51);
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_g[fieldTemp$0] - this.field_l.b(-1427) & 255;
    }

    final void b(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          for (var5_int = 0; var5_int < param3; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            param1[var5_int + param0] = (byte)(this.field_g[fieldTemp$0] - this.field_l.b(-1427));
          }
          if (param2 != 28040) {
            this.field_l = (hg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("w.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Main.field_T;
        try {
          if (param8 >= 0 &&
            param7 < jb.field_c) {
            if (param3 < 0 &&
              param5 < 0 &&
              param6 < 0) {
              return;
            }
            if (jb.field_i <= param3 &&
              jb.field_i <= param5 &&
              param6 >= jb.field_i) {
              return;
            }
            var14 = -param7 + param8;
            if (param7 != param2) {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = -param7 + param2;
              var11 = (-param3 + param5 << 16) / var15;
              var12 = (param6 - param3 << 16) / var14;
              if (var12 <= var11) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param2 < 0) {
                  param7 = -param7 + param2;
                  var9_int = var9_int + var11 * param7;
                  var10 = var10 + param7 * var12;
                  param7 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var10 = var10 + param7 * var12;
                  var9_int = var9_int + param7 * var11;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = jb.field_e[param7];
                while (param2 > param7) {
                  var17 = var9_int >> 16;
                  if (jb.field_i > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (0 != var18) {
                      if (jb.field_i <= var18 + var17) {
                        var18 = -var17 + (jb.field_i - 1);
                      }
                      if (var17 >= 0) {
                        a.a(var16Lifetime2 + var17, param1, var18, param0, -1483723263);
                      } else {
                        a.a(var16Lifetime2, param1, var17 + var18, param0, -1483723263);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < jb.field_i) {
                        a.a(var16Lifetime2 + var17, param1, var18, param0, -1483723263);
                      }
                    }
                  }
                  param7++;
                  if (param7 >= jb.field_c) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + vj.field_l;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param2 + param8;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param6 << 16;
                if (var13 == 0) {
                  var9_int = param5 << 16;
                } else {
                  var10 = param5 << 16;
                }
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            } else {
              if (param8 != param7) {
                var15 = -param2 + param8;
                if (param5 <= param3) {
                  var11 = (param6 - param5 << 16) / var15;
                  var12 = (param6 - param3 << 16) / var14;
                  var10 = param3 << 16;
                  var9_int = param5 << 16;
                } else {
                  var12 = (param6 - param5 << 16) / var15;
                  var11 = (-param3 + param6 << 16) / var14;
                  var10 = param5 << 16;
                  var9_int = param3 << 16;
                }
              } else {
                var10 = param5 << 16;
                var9_int = param3 << 16;
                var11 = 0;
                var12 = 0;
              }
              if (param7 < 0) {
                param7 = Math.min(-param7, -param7 + param2);
                var9_int = var9_int + param7 * var11;
                var10 = var10 + var12 * param7;
                param7 = 0;
              }
              var13 = 0;
            }
            if (param7 < 0) {
              param7 = -param7;
              var10 = var10 + param7 * var12;
              var9_int = var9_int + param7 * var11;
              param7 = 0;
            }
            var15Lifetime1 = jb.field_e[param7];
            if (!param4) {
              return;
            }
            while (param7 < param8) {
              var16Lifetime1 = var9_int >> 16;
              if (jb.field_i > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (jb.field_i <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (jb.field_i - var16Lifetime1);
                  }
                  if (0 <= var16Lifetime1) {
                    a.a(var15Lifetime1 + var16Lifetime1, param1, var17Lifetime1, param0, -1483723263);
                  } else {
                    a.a(var15Lifetime1, param1, var17Lifetime1 + var16Lifetime1, param0, -1483723263);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < jb.field_i) {
                    a.a(var16Lifetime1 + var15Lifetime1, param1, var17Lifetime1, param0, -1483723263);
                  }
                }
              }
              param7++;
              if (param7 >= jb.field_c) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + vj.field_l;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("w.PA(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void h(int param0, int param1) {
        if (param1 != 0) {
          return;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 + this.field_l.b(-1427));
    }

    public static void h(int param0) {
        field_m = null;
        if (param0 <= 18) {
          w.a((int[]) null, -109, -96, -41, true, 32, 55, -64, -115);
        }
    }

    w(byte[] param0) {
        super(param0);
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Main.field_T;
        if (param1 != -1) {
          return 42;
        }
        int var3 = this.field_o >> 3;
        int var4 = 8 - (this.field_o & 7);
        this.field_o = this.field_o + param0;
        int var5 = 0;
        while (var4 < param0) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_g[incrementValue$0] & sg.field_g[var4]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 != param0) {
          var5 = var5 + (this.field_g[var3] >> -param0 + var4 & sg.field_g[param0]);
        } else {
          var5 = var5 + (this.field_g[var3] & sg.field_g[var4]);
        }
        return var5;
    }

    static {
        field_m = "Play the game without logging in just yet";
    }
}
