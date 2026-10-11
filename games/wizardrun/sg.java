/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    private si field_d;
    private int field_a;
    static int field_f;
    private si field_c;
    private int field_e;
    static o[][] field_b;

    final byte[] a(boolean param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_9_0 = null;
          byte[] stackIn_52_0 = null;
          Object stackIn_55_0 = null;
          Throwable decompiledCaughtException = null;
          Object var3 = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var18 = 0;
          var18 = wizardrun.field_H;
          var3 = this.field_c;
          synchronized (var3) {
            try {
              if ((long)(param1 * 6 + 6) > this.field_d.b((byte) 79)) {
                return null;
              }
              this.field_d.a((long)(6 * param1), (byte) 125);
              this.field_d.a(0, wizardrun.field_O, 6, (byte) 47);
              var4_int = (wizardrun.field_O[2] & 255) + (((255 & wizardrun.field_O[1]) << 8) + (wizardrun.field_O[0] << 16 & 16711680));
              var5 = (255 & wizardrun.field_O[5]) + (((255 & wizardrun.field_O[4]) << 8) + (16711680 & wizardrun.field_O[3] << 16));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_e < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > (this.field_c.b((byte) 79) / 520L)) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              if (!param0) {
                this.field_e = 12;
              }
              var8 = 0;
              while (true) {
                if (var4_int <= var7) {
                  stackIn_52_0 = var6;
                  return stackIn_52_0;
                }
                if (0 == var5) {
                  return null;
                }
                this.field_c.a((long)(520 * var5), (byte) -99);
                var9 = -var7 + var4_int;
                if (param1 <= 65535) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_c.a(0, wizardrun.field_O, var14 + var9, (byte) 47);
                  var12 = (65280 & wizardrun.field_O[5] << 8) + (((255 & wizardrun.field_O[4]) << 16) + (wizardrun.field_O[6] & 255));
                  var13 = wizardrun.field_O[7] & 255;
                  var11 = (wizardrun.field_O[3] & 255) + (65280 & wizardrun.field_O[2] << 8);
                  var10 = (255 & wizardrun.field_O[1]) + (65280 & wizardrun.field_O[0] << 8);
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_c.a(0, wizardrun.field_O, var9 + var14, (byte) 47);
                  var10 = ((255 & wizardrun.field_O[0]) << 24) + (((255 & wizardrun.field_O[1]) << 16) - (-(65280 & wizardrun.field_O[2] << 8) - (255 & wizardrun.field_O[3])));
                  var11 = (wizardrun.field_O[5] & 255) + ((255 & wizardrun.field_O[4]) << 8);
                  var12 = (wizardrun.field_O[8] & 255) + (((wizardrun.field_O[6] & 255) << 16) + ((wizardrun.field_O[7] & 255) << 8));
                  var13 = 255 & wizardrun.field_O[9];
                }
                if (param1 != var10) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_a) {
                  return null;
                }
                if (0 > var12) {
                  return null;
                }
                if ((long)var12 > this.field_c.b((byte) 79) / 520L) {
                  return null;
                }
                var15 = var14 + var9;
                var8++;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = wizardrun.field_O[var16];
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_55_0 = null;
              return (byte[]) (stackIn_55_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_7_0 = null;
          Object stackIn_12_0 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = wizardrun.field_H;
          try {
            try {
              var3 = (String) (cl.a(param1, -3264, "getcookies"));
              var4 = tj.a(var3, -22710, ';');
              for (var5 = param2; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_7_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_12_0 = null;
            return (String) (stackIn_12_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("sg.C(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final static void a(byte param0) {
        if (param0 != 64) {
          sg.a((byte) -126);
        }
        ec.field_a = null;
        f.field_b = null;
        ke.field_t = null;
        lb.field_f = null;
        eb.field_a = false;
    }

    public static void b(byte param0) {
        if (param0 != 111) {
          field_b = (o[][]) null;
        }
        field_b = (o[][]) null;
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, boolean param4) {
        try {
          RuntimeException stackIn_72_0 = null;
          StringBuilder stackIn_72_1 = null;
          String stackIn_73_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          byte[] var17 = null;
          var16 = wizardrun.field_H;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (!param4) {
                  var17 = (byte[]) null;
                  this.a((byte[]) null, 123, -51, -120);
                }
                if (param3) {
                  if ((long)(6 + 6 * param0) > this.field_d.b((byte) 79)) {
                    return false;
                  }
                  this.field_d.a((long)(6 * param0), (byte) 120);
                  this.field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                  var7_int = (255 & wizardrun.field_O[5]) + (wizardrun.field_O[3] << 16 & 16711680) + (65280 & wizardrun.field_O[4] << 8);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_c.b((byte) 79) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_c.b((byte) 79)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                wizardrun.field_O[3] = (byte)(var7_int >> 16);
                wizardrun.field_O[5] = (byte)var7_int;
                wizardrun.field_O[2] = (byte)param2;
                wizardrun.field_O[4] = (byte)(var7_int >> 8);
                wizardrun.field_O[0] = (byte)(param2 >> 16);
                wizardrun.field_O[1] = (byte)(param2 >> 8);
                this.field_d.a((long)(param0 * 6), (byte) 67);
                this.field_d.a(18729, wizardrun.field_O, 6, 0);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param2 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_c.a((long)(520 * var7_int), (byte) -119);
                      if (65535 < param0) {
                        try {
                          this.field_c.a(0, wizardrun.field_O, 10, (byte) 47);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var13 = wizardrun.field_O[9] & 255;
                        var10 = (wizardrun.field_O[6] << 16 & 16711680) + ((wizardrun.field_O[7] << 8 & 65280) + (wizardrun.field_O[8] & 255));
                        var12 = ((255 & wizardrun.field_O[4]) << 8) + (wizardrun.field_O[5] & 255);
                        var11 = ((wizardrun.field_O[0] & 255) << 24) - (-(16711680 & wizardrun.field_O[1] << 16) - (wizardrun.field_O[2] << 8 & 65280)) + (wizardrun.field_O[3] & 255);
                      } else {
                        try {
                          this.field_c.a(0, wizardrun.field_O, 8, (byte) 47);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = (255 & wizardrun.field_O[6]) + (65280 & wizardrun.field_O[5] << 8) + (16711680 & wizardrun.field_O[4] << 16);
                        var11 = (65280 & wizardrun.field_O[0] << 8) + (wizardrun.field_O[1] & 255);
                        var12 = (wizardrun.field_O[3] & 255) + ((wizardrun.field_O[2] & 255) << 8);
                        var13 = wizardrun.field_O[7] & 255;
                      }
                      if ((param0 == var11 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_c.b((byte) 79) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      param3 = false;
                      var10 = (int)((this.field_c.b((byte) 79) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (param2 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param0 > 65535) {
                      wizardrun.field_O[4] = (byte)(var9 >> 8);
                      wizardrun.field_O[0] = (byte)(param0 >> 24);
                      wizardrun.field_O[2] = (byte)(param0 >> 8);
                      wizardrun.field_O[3] = (byte)param0;
                      wizardrun.field_O[7] = (byte)(var10 >> 8);
                      wizardrun.field_O[1] = (byte)(param0 >> 16);
                      wizardrun.field_O[6] = (byte)(var10 >> 16);
                      wizardrun.field_O[8] = (byte)var10;
                      wizardrun.field_O[9] = (byte)this.field_a;
                      wizardrun.field_O[5] = (byte)var9;
                      this.field_c.a((long)(520 * var7_int), (byte) 47);
                      this.field_c.a(18729, wizardrun.field_O, 10, 0);
                      var11 = param2 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a(18729, param1, var11, var8);
                      var8 = var8 + var11;
                    } else {
                      wizardrun.field_O[7] = (byte)this.field_a;
                      wizardrun.field_O[0] = (byte)(param0 >> 8);
                      wizardrun.field_O[5] = (byte)(var10 >> 8);
                      wizardrun.field_O[6] = (byte)var10;
                      wizardrun.field_O[3] = (byte)var9;
                      wizardrun.field_O[4] = (byte)(var10 >> 16);
                      wizardrun.field_O[2] = (byte)(var9 >> 8);
                      wizardrun.field_O[1] = (byte)param0;
                      this.field_c.a((long)(var7_int * 520), (byte) -61);
                      this.field_c.a(18729, wizardrun.field_O, 8, 0);
                      var11 = param2 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.a(18729, param1, var11, var8);
                      var8 = var8 + var11;
                    }
                    var7_int = var10;
                    var9++;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_c;
          synchronized (var5) {
            if (param2 <= param3 &&
              param3 <= this.field_e) {
              var6 = this.a(param1, param0, param3, true, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param1, param0, param3, false, true) ? 1 : 0;
              }
              stackIn_8_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("sg.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    sg(int param0, si param1, si param2, int param3) {
        this.field_d = null;
        this.field_c = null;
        this.field_e = 65000;
        try {
          this.field_c = param1;
          this.field_e = param3;
          this.field_d = param2;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "sg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
