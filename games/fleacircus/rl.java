/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rl {
    private long field_f;
    static sf field_g;
    static mk field_b;
    static int[] field_e;
    static rh field_d;
    private long field_a;
    private RandomAccessFile field_c;

    final void a(long param0, byte param1) throws IOException {
        this.field_c.seek(param0);
        this.field_f = param0;
        if (param1 > -112) {
          rh var5 = (rh) null;
          rl.a((rh) null, -27);
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          field_g = (sf) null;
        }
        return !uc.field_c.a(-19) ? true : false;
    }

    protected final void finalize() throws Throwable {
        if (this.field_c != null) {
          System.out.println("");
          this.b(-1);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ah.field_c = false;
          fk.field_D = false;
          if (param2 < 85) {
            return;
          }
          if (null != ok.field_x) {
            if (!ok.field_x.field_G) {
              return;
            }
            var3_int = 1;
            if (8 == param1) {
              if (!jg.field_d) {
                param0 = o.field_g;
              } else {
                param0 = me.field_c;
              }
              param1 = 2;
              lg.field_b.a((byte) -102, aa.field_s);
            }
            if (param1 == 10) {
              l.a(0);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (fk.field_D) {
                param0 = db.a(ud.field_a, new String[]{param0}, true);
              }
              if (ud.field_c) {
                param0 = k.field_e;
              }
              ok.field_x.a((byte) -97, param1, param0);
            }
            if (param1 != 256) {
              if (param1 == 10) {
                return;
              }
              if (!jg.field_d) {
                lg.field_b.a(-41);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("rl.G(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.field_a = -79L;
          }
          var5_int = this.field_c.read(param0, param1, param3);
          if (var5_int > 0) {
            this.field_f = this.field_f + (long)var5_int;
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rl.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(rh param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var3 = (int[]) null;
            rl.a(21, -126, (int[]) null, -68, -71, 30, -52, -14, (byte) 65);
          }
          stackIn_3_0 = param0.a(-77);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rl.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -930374320) {
          int[] var2 = (int[]) null;
          rl.a(111, -12, (int[]) null, 28, 28, 35, 6, -36, (byte) -75);
        }
        field_b = null;
        field_d = null;
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 < 87) {
          return;
        }
        try {
          if (this.field_a < (long)param1 + this.field_f) {
            this.field_c.seek(this.field_a);
            this.field_c.write(1);
            throw new EOFException();
          }
          this.field_c.write(param3, param2, param1);
          this.field_f = this.field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != -1) {
          return;
        }
        if (null != this.field_c) {
          this.field_c.close();
          this.field_c = null;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != 1) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = new byte[var2_int];
          dm.a(param1, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static java.applet.Applet a(byte param0) {
        if (null != sd.field_j) {
          return sd.field_j;
        }
        if (param0 > -49) {
          field_d = (rh) null;
        }
        return (java.applet.Applet) ((Object) pf.field_c);
    }

    final long c(int param0) throws IOException {
        if (param0 != 2049105808) {
          rh var3 = (rh) null;
          rl.a((rh) null, -61);
        }
        return this.field_c.length();
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var19 = fleas.field_A ? 1 : 0;
        try {
          if (param7 >= 0 &&
            bl.field_i > param1) {
            if (param0 < 0 &&
              param6 < 0 &&
              param3 < 0) {
              return;
            }
            if (bl.field_f <= param0 &&
              bl.field_f <= param6 &&
              bl.field_f <= param3) {
              return;
            }
            if (param8 != -115) {
              rl.a(125);
            }
            var14 = param7 - param1;
            if (param4 != param1) {
              var10 = param0 << 16;
              var9_int = param0 << 16;
              var15 = -param1 + param4;
              var11 = (-param0 + param6 << 16) / var15;
              var12 = (param3 - param0 << 16) / var14;
              if (var11 >= var12) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param1 < 0) {
                if (0 > param4) {
                  param1 = param4 - param1;
                  var10 = var10 + param1 * var12;
                  var9_int = var9_int + var11 * param1;
                  param1 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param1 = -param1;
                  var9_int = var9_int + var11 * param1;
                  var10 = var10 + param1 * var12;
                  param1 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = bl.field_b[param1];
                while (param1 < param4) {
                  var17 = var9_int >> 16;
                  if (var17 < bl.field_f) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (var18 + var17 >= bl.field_f) {
                        var18 = -1 + (-var17 + bl.field_f);
                      }
                      if (var17 < 0) {
                        rh.a(param5, var17 + var18, var16Lifetime2, param2, (byte) -68);
                      } else {
                        rh.a(param5, var18, var17 + var16Lifetime2, param2, (byte) -84);
                      }
                    } else {
                      if (var17 >= 0 &&
                        bl.field_f > var17) {
                        rh.a(param5, var18, var17 + var16Lifetime2, param2, (byte) -122);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= bl.field_i) {
                    return;
                  }
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + gb.field_d;
                }
              }
              var16Lifetime3 = param7 - param4;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                if (var13 == 0) {
                  var9_int = param6 << 16;
                } else {
                  var10 = param6 << 16;
                }
                var17Lifetime2 = param3 << 16;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            } else {
              if (param7 != param1) {
                var15 = -param4 + param7;
                if (param6 <= param0) {
                  var10 = param0 << 16;
                  var9_int = param6 << 16;
                  var12 = (-param0 + param3 << 16) / var14;
                  var11 = (param3 - param6 << 16) / var15;
                } else {
                  var10 = param6 << 16;
                  var11 = (param3 - param0 << 16) / var14;
                  var9_int = param0 << 16;
                  var12 = (param3 - param6 << 16) / var15;
                }
              } else {
                var11 = 0;
                var12 = 0;
                var9_int = param0 << 16;
                var10 = param6 << 16;
              }
              var13 = 0;
              if (param1 < 0) {
                param1 = Math.min(-param1, -param1 + param4);
                var10 = var10 + var12 * param1;
                var9_int = var9_int + param1 * var11;
                param1 = 0;
              }
            }
            if (0 > param1) {
              param1 = -param1;
              var9_int = var9_int + param1 * var11;
              var10 = var10 + param1 * var12;
              param1 = 0;
            }
            var15Lifetime1 = bl.field_b[param1];
            while (param1 < param7) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < bl.field_f) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < bl.field_f) {
                    rh.a(param5, var17Lifetime1, var15Lifetime1 + var16Lifetime1, param2, (byte) -120);
                  }
                } else {
                  if (bl.field_f <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -1 - var16Lifetime1 + bl.field_f;
                  }
                  if (var16Lifetime1 < 0) {
                    rh.a(param5, var16Lifetime1 + var17Lifetime1, var15Lifetime1, param2, (byte) -113);
                  } else {
                    rh.a(param5, var17Lifetime1, var16Lifetime1 + var15Lifetime1, param2, (byte) -98);
                  }
                }
              }
              param1++;
              if (bl.field_i <= param1) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + gb.field_d;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("rl.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    rl(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_c = new RandomAccessFile(param0, param1);
          this.field_a = param2;
          this.field_f = 0L;
          var5_int = this.field_c.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_c.seek(0L);
            this.field_c.write(var5_int);
          }
          this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
