/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bq {
    static int[] field_g;
    private int field_h;
    static String field_f;
    private of field_b;
    static boolean field_c;
    static ao field_i;
    private of field_d;
    static ja field_a;
    private int field_e;

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
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
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_38_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = ZombieDawnMulti.field_E ? 1 : 0;
          var3_ref = this.field_b;
          synchronized (var3_ref) {
            try {
              if (this.field_d.c(param0 ^ -2) < (long)(6 * param1 + 6)) {
                return null;
              }
              this.field_d.a((long)(param1 * 6), (byte) -70);
              this.field_d.a(6, 0, la.field_g, 47);
              var4_int = (la.field_g[2] & 255) + (((la.field_g[param0] & 255) << 8) + ((255 & la.field_g[0]) << 16));
              var5 = ((255 & la.field_g[3]) << 16) + (la.field_g[4] << 8 & 65280) + (la.field_g[5] & 255);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_e < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_b.c(-1) / 520L < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  return null;
                }
                this.field_b.a((long)(520 * var5), (byte) -70);
                var9 = var4_int - var7;
                if (param1 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_b.a(var9 + var14, 0, la.field_g, param0 - 96);
                  var12 = (la.field_g[8] & 255) + ((16711680 & la.field_g[6] << 16) + (65280 & la.field_g[7] << 8));
                  var11 = (la.field_g[5] & 255) + (la.field_g[4] << 8 & 65280);
                  var13 = 255 & la.field_g[9];
                  var10 = (65280 & la.field_g[2] << 8) + ((255 & la.field_g[1]) << 16) + (((255 & la.field_g[0]) << 24) + (la.field_g[3] & 255));
                } else {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_b.a(var14 + var9, 0, la.field_g, 68);
                  var12 = (la.field_g[6] & 255) + ((255 & la.field_g[5]) << 8) + (la.field_g[4] << 16 & 16711680);
                  var13 = la.field_g[7] & 255;
                  var10 = (65280 & la.field_g[0] << 8) + (la.field_g[1] & 255);
                  var11 = (255 & la.field_g[3]) + (65280 & la.field_g[2] << 8);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_h) {
                  stackIn_38_0 = null;
                  return (byte[]) (stackIn_38_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((this.field_b.c(-1) / 520L) < (long)var12) {
                  return null;
                }
                var15 = var9 + var14;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = la.field_g[var16];
                }
              }
              stackIn_50_0 = var6;
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

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_i = null;
        if (param0 <= 29) {
          field_a = (ja) null;
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
          var5 = this.field_b;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_e) {
              var6 = this.a(true, param1, (byte) 49, param2, param3) ? 1 : 0;
              if (param0 != 118) {
                this.field_b = (of) null;
              }
              if (var6 == 0) {
                var6 = this.a(false, param1, (byte) 49, param2, param3) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("bq.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    private final boolean a(boolean param0, byte[] param1, byte param2, int param3, int param4) {
        try {
          RuntimeException stackIn_73_0 = null;
          StringBuilder stackIn_73_1 = null;
          String stackIn_74_2 = null;
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
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            var6 = this.field_b;
            synchronized (var6) {
              if (param2 != 49) {
                return false;
              }
              try {
                if (param0) {
                  if ((long)(6 * param4 + 6) > this.field_d.c(-1)) {
                    return false;
                  }
                  this.field_d.a((long)(param4 * 6), (byte) -70);
                  this.field_d.a(6, 0, la.field_g, -128);
                  var7_int = (la.field_g[5] & 255) + ((255 & la.field_g[4]) << 8) + (16711680 & la.field_g[3] << 16);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_b.c(-1) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_b.c(-1) + 519L) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                la.field_g[1] = (byte)(param3 >> 8);
                la.field_g[2] = (byte)param3;
                la.field_g[0] = (byte)(param3 >> 16);
                la.field_g[3] = (byte)(var7_int >> 16);
                la.field_g[5] = (byte)var7_int;
                la.field_g[4] = (byte)(var7_int >> 8);
                this.field_d.a((long)(param4 * 6), (byte) -70);
                this.field_d.a(param2 ^ -50, 6, 0, la.field_g);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param3 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_b.a((long)(520 * var7_int), (byte) -70);
                      if (65535 >= param4) {
                        try {
                          this.field_b.a(8, 0, la.field_g, -126);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var10 = ((255 & la.field_g[4]) << 16) - (-(65280 & la.field_g[5] << 8) - (la.field_g[6] & 255));
                        var12 = (65280 & la.field_g[2] << 8) + (255 & la.field_g[3]);
                        var11 = (la.field_g[1] & 255) + ((la.field_g[0] & 255) << 8);
                        var13 = la.field_g[7] & 255;
                      } else {
                        try {
                          this.field_b.a(10, 0, la.field_g, -103);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = 255 & la.field_g[9];
                        var11 = (la.field_g[3] & 255) + (((la.field_g[2] & 255) << 8) + ((la.field_g[0] & 255) << 24)) + (16711680 & la.field_g[1] << 16);
                        var12 = ((255 & la.field_g[4]) << 8) + (255 & la.field_g[5]);
                        var10 = (65280 & la.field_g[7] << 8) + ((255 & la.field_g[6]) << 16) + (la.field_g[8] & 255);
                      }
                      if ((var11 == param4 &&
                        var9 == var12 &&
                        this.field_h == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((long)var10 <= this.field_b.c(-1) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((519L + this.field_b.c(-1)) / 520L);
                      param0 = false;
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
                    if (param4 <= 65535) {
                      la.field_g[6] = (byte)var10;
                      la.field_g[0] = (byte)(param4 >> 8);
                      la.field_g[4] = (byte)(var10 >> 16);
                      la.field_g[2] = (byte)(var9 >> 8);
                      la.field_g[3] = (byte)var9;
                      la.field_g[5] = (byte)(var10 >> 8);
                      la.field_g[7] = (byte)this.field_h;
                      la.field_g[1] = (byte)param4;
                      this.field_b.a((long)(var7_int * 520), (byte) -70);
                      this.field_b.a(param2 ^ -50, 8, 0, la.field_g);
                      var11 = param3 - var8;
                      if (512 < var11) {
                        var11 = 512;
                      }
                      this.field_b.a(-1, var11, var8, param1);
                      var8 = var8 + var11;
                    } else {
                      la.field_g[3] = (byte)param4;
                      la.field_g[5] = (byte)var9;
                      la.field_g[1] = (byte)(param4 >> 16);
                      la.field_g[2] = (byte)(param4 >> 8);
                      la.field_g[8] = (byte)var10;
                      la.field_g[9] = (byte)this.field_h;
                      la.field_g[0] = (byte)(param4 >> 24);
                      la.field_g[7] = (byte)(var10 >> 8);
                      la.field_g[6] = (byte)(var10 >> 16);
                      la.field_g[4] = (byte)(var9 >> 8);
                      this.field_b.a((long)(520 * var7_int), (byte) -70);
                      this.field_b.a(-1, 10, 0, la.field_g);
                      var11 = param3 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_b.a(-1, var11, var8, param1);
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
            stackIn_73_0 = var6_ref;
            stackIn_73_1 = new StringBuilder().append("bq.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_74_2 = "null";
            } else {
              stackIn_74_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    bq(int param0, of param1, of param2, int param3) {
        this.field_d = null;
        this.field_b = null;
        this.field_e = 65000;
        try {
          this.field_e = param3;
          this.field_h = param0;
          this.field_b = param1;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_g = new int[8192];
        field_i = new ao(8, 0, 4, 1);
    }
}
