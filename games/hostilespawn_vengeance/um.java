/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class um {
    static boolean field_f;
    static boolean field_d;
    static int field_e;
    private bn field_c;
    static String field_h;
    private int field_b;
    private bn field_g;
    private int field_a;

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, int param4) {
        try {
          RuntimeException stackIn_75_0 = null;
          StringBuilder stackIn_75_1 = null;
          String stackIn_76_2 = null;
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
          var16 = HostileSpawn.field_I ? 1 : 0;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (param1) {
                  if ((long)(6 + 6 * param4) > this.field_g.d(105)) {
                    return false;
                  }
                  this.field_g.a((long)(param4 * 6), (byte) 115);
                  this.field_g.a(ec.field_d, (byte) -87, 0, 6);
                  var7_int = ((255 & ec.field_d[3]) << 16) + (ec.field_d[4] << 8 & 65280) + (ec.field_d[5] & 255);
                  if (0 >= var7_int ||
                    !((long)var7_int <= (this.field_c.d(120) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_c.d(-42) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ec.field_d[0] = (byte)(param3 >> 16);
                ec.field_d[2] = (byte)param3;
                if (param2 > -50) {
                  return true;
                }
                ec.field_d[1] = (byte)(param3 >> 8);
                ec.field_d[4] = (byte)(var7_int >> 8);
                ec.field_d[3] = (byte)(var7_int >> 16);
                ec.field_d[5] = (byte)var7_int;
                this.field_g.a((long)(6 * param4), (byte) 118);
                this.field_g.a(6, 0, ec.field_d, (byte) 39);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param3) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_c.a((long)(520 * var7_int), (byte) 121);
                      if (param4 > 65535) {
                        try {
                          this.field_c.a(ec.field_d, (byte) -116, 0, 10);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (ec.field_d[5] & 255) + ((ec.field_d[4] & 255) << 8);
                        var11 = ((255 & ec.field_d[2]) << 8) + ((ec.field_d[0] & 255) << 24) - (-(ec.field_d[1] << 16 & 16711680) - (ec.field_d[3] & 255));
                        var10 = ((ec.field_d[7] & 255) << 8) + (((255 & ec.field_d[6]) << 16) + (255 & ec.field_d[8]));
                        var13 = ec.field_d[9] & 255;
                      } else {
                        try {
                          this.field_c.a(ec.field_d, (byte) -121, 0, 8);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var12 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 8);
                        var11 = (ec.field_d[1] & 255) + (ec.field_d[0] << 8 & 65280);
                        var10 = (ec.field_d[5] << 8 & 65280) + ((16711680 & ec.field_d[4] << 16) + (255 & ec.field_d[6]));
                        var13 = 255 & ec.field_d[7];
                      }
                      if ((var11 == param4 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_c.d(121) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param1 = false;
                      var10 = (int)((519L + this.field_c.d(-86)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param3 <= 512) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      ec.field_d[3] = (byte)param4;
                      ec.field_d[7] = (byte)(var10 >> 8);
                      ec.field_d[5] = (byte)var9;
                      ec.field_d[8] = (byte)var10;
                      ec.field_d[9] = (byte)this.field_a;
                      ec.field_d[1] = (byte)(param4 >> 16);
                      ec.field_d[6] = (byte)(var10 >> 16);
                      ec.field_d[2] = (byte)(param4 >> 8);
                      ec.field_d[4] = (byte)(var9 >> 8);
                      ec.field_d[0] = (byte)(param4 >> 24);
                      this.field_c.a((long)(520 * var7_int), (byte) 104);
                      this.field_c.a(10, 0, ec.field_d, (byte) 79);
                      var11 = -var8 + param3;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a(var11, var8, param0, (byte) 122);
                      var8 = var8 + var11;
                    } else {
                      ec.field_d[3] = (byte)var9;
                      ec.field_d[7] = (byte)this.field_a;
                      ec.field_d[2] = (byte)(var9 >> 8);
                      ec.field_d[0] = (byte)(param4 >> 8);
                      ec.field_d[5] = (byte)(var10 >> 8);
                      ec.field_d[1] = (byte)param4;
                      ec.field_d[6] = (byte)var10;
                      ec.field_d[4] = (byte)(var10 >> 16);
                      this.field_c.a((long)(var7_int * 520), (byte) 98);
                      this.field_c.a(8, 0, ec.field_d, (byte) 42);
                      var11 = param3 - var8;
                      if (512 < var11) {
                        var11 = 512;
                      }
                      this.field_c.a(var11, var8, param0, (byte) 77);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
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
            stackIn_75_0 = var6_ref;
            stackIn_75_1 = new StringBuilder().append("um.E(");
            if (param0 == null) {
              stackIn_76_2 = "null";
            } else {
              stackIn_76_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != -24) {
            um.a(-93, -47, -15);
          }
          var5 = this.field_c;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_b) {
              var6 = this.a(param1, true, param0 ^ 125, param2, param3) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param1, false, -62, param2, param3) ? 1 : 0;
              }
              stackIn_9_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("um.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 255) {
          um.a(-80);
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10179) {
          field_e = 24;
        }
        int var3 = param1 >>> 31;
        return (var3 + param1) / param0 - var3;
    }

    final byte[] a(int param0, int param1) {
        try {
          int var17 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          int var6 = 0;
          byte[] var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var16 = 0;
          Throwable var18 = null;
          int var19 = 0;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_37_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          var19 = HostileSpawn.field_I ? 1 : 0;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + 6 * param0) > this.field_g.d(-47)) {
                return null;
              }
              this.field_g.a((long)(6 * param0), (byte) 103);
              this.field_g.a(ec.field_d, (byte) -39, 0, 6);
              var4_int = (65280 & ec.field_d[1] << 8) + (16711680 & ec.field_d[0] << 16) + (ec.field_d[2] & 255);
              var5 = (255 & ec.field_d[5]) + (65280 & ec.field_d[4] << 8) + ((255 & ec.field_d[3]) << 16);
              var6 = -13 % ((param1 + 80) / 43);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_b) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (0 >= var5) {
                return null;
              }
              if (this.field_c.d(2) / 520L < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var7 = new byte[var4_int];
              var8 = 0;
              var9 = 0;
              while (var8 < var4_int) {
                if (var5 == 0) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_c.a((long)(520 * var5), (byte) 96);
                var10 = -var8 + var4_int;
                if (param0 <= 65535) {
                  if (var10 > 512) {
                    var10 = 512;
                  }
                  var15 = 8;
                  this.field_c.a(ec.field_d, (byte) -61, 0, var15 + var10);
                  var12 = ((255 & ec.field_d[2]) << 8) + (ec.field_d[3] & 255);
                  var13 = (ec.field_d[6] & 255) + (((ec.field_d[4] & 255) << 16) + ((ec.field_d[5] & 255) << 8));
                  var11 = ((255 & ec.field_d[0]) << 8) + (255 & ec.field_d[1]);
                  var14 = 255 & ec.field_d[7];
                } else {
                  var15 = 10;
                  if (var10 > 510) {
                    var10 = 510;
                  }
                  this.field_c.a(ec.field_d, (byte) -39, 0, var10 + var15);
                  var11 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 8) + (((255 & ec.field_d[1]) << 16) + ((ec.field_d[0] & 255) << 24));
                  var12 = (ec.field_d[4] << 8 & 65280) + (255 & ec.field_d[5]);
                  var13 = (ec.field_d[8] & 255) + (ec.field_d[7] << 8 & 65280) + (ec.field_d[6] << 16 & 16711680);
                  var14 = ec.field_d[9] & 255;
                }
                if (var11 != param0) {
                  return null;
                }
                if (var12 != var9) {
                  return null;
                }
                if (var14 != this.field_a) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (var13 < 0) {
                  return null;
                }
                if ((long)var13 > (this.field_c.d(-94) / 520L)) {
                  return null;
                }
                var16 = var15 + var10;
                var9++;
                for (var17 = var15; var16 > var17; var17++) {
                  incrementValue$2 = var8;
                  var8++;
                  var7[incrementValue$2] = ec.field_d[var17];
                }
                var5 = var13;
              }
              stackIn_50_0 = var7;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_53_0 = null;
              return (byte[]) (stackIn_53_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    um(int param0, bn param1, bn param2, int param3) {
        this.field_c = null;
        this.field_g = null;
        this.field_b = 65000;
        try {
          this.field_b = param3;
          this.field_c = param1;
          this.field_a = param0;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "um.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = false;
        field_h = "Confirm Password: ";
        field_f = false;
    }
}
