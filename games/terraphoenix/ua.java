/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua {
    static ci field_b;
    private int field_a;
    private ak field_i;
    private int field_h;
    static og field_d;
    private ak field_f;
    static int field_e;
    static String[] field_c;
    static char field_g;

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
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
          var16 = Terraphoenix.field_V;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param0) {
                  if ((long)(6 * param1 + 6) > this.field_i.a((byte) -118)) {
                    return false;
                  }
                  this.field_i.a(false, (long)(param1 * 6));
                  this.field_i.a(ad.field_m, (byte) -127, 0, 6);
                  var7_int = ((ad.field_m[3] & 255) << 16) + (((255 & ad.field_m[4]) << 8) + (ad.field_m[5] & 255));
                  if (var7_int <= 0 ||
                    !((this.field_f.a((byte) 127) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_f.a((byte) -122) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ad.field_m[1] = (byte)(param4 >> 8);
                ad.field_m[3] = (byte)(var7_int >> 16);
                ad.field_m[4] = (byte)(var7_int >> 8);
                ad.field_m[2] = (byte)param4;
                ad.field_m[5] = (byte)var7_int;
                ad.field_m[0] = (byte)(param4 >> 16);
                this.field_i.a(false, (long)(param1 * 6));
                this.field_i.a(-1, 6, ad.field_m, 0);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param4 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_f.a(false, (long)(var7_int * 520));
                      if (param1 > 65535) {
                        try {
                          this.field_f.a(ad.field_m, (byte) -127, 0, 10);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var11 = (ad.field_m[3] & 255) + ((-16777216 & ad.field_m[0] << 24) + ((255 & ad.field_m[1]) << 16)) + (65280 & ad.field_m[2] << 8);
                        var13 = ad.field_m[9] & 255;
                        var10 = (255 & ad.field_m[8]) + (ad.field_m[6] << 16 & 16711680) + (ad.field_m[7] << 8 & 65280);
                        var12 = (255 & ad.field_m[5]) + ((ad.field_m[4] & 255) << 8);
                      } else {
                        try {
                          this.field_f.a(ad.field_m, (byte) -126, 0, 8);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var12 = (255 & ad.field_m[3]) + (ad.field_m[2] << 8 & 65280);
                        var11 = ((255 & ad.field_m[0]) << 8) + (255 & ad.field_m[1]);
                        var13 = 255 & ad.field_m[7];
                        var10 = (255 & ad.field_m[6]) + (((ad.field_m[5] & 255) << 8) + (16711680 & ad.field_m[4] << 16));
                      }
                      if ((var11 == param1 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_f.a((byte) -110) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_f.a((byte) 89)) / 520L);
                      param0 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (512 >= param4 - var8) {
                      var10 = 0;
                    }
                    if (param1 <= 65535) {
                      ad.field_m[5] = (byte)(var10 >> 8);
                      ad.field_m[0] = (byte)(param1 >> 8);
                      ad.field_m[1] = (byte)param1;
                      ad.field_m[2] = (byte)(var9 >> 8);
                      ad.field_m[3] = (byte)var9;
                      ad.field_m[6] = (byte)var10;
                      ad.field_m[4] = (byte)(var10 >> 16);
                      ad.field_m[7] = (byte)this.field_a;
                      this.field_f.a(false, (long)(520 * var7_int));
                      this.field_f.a(-1, 8, ad.field_m, 0);
                      var11 = -var8 + param4;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_f.a(-1, var11, param3, var8);
                      var8 = var8 + var11;
                    } else {
                      ad.field_m[6] = (byte)(var10 >> 16);
                      ad.field_m[2] = (byte)(param1 >> 8);
                      ad.field_m[0] = (byte)(param1 >> 24);
                      ad.field_m[7] = (byte)(var10 >> 8);
                      ad.field_m[1] = (byte)(param1 >> 16);
                      ad.field_m[4] = (byte)(var9 >> 8);
                      ad.field_m[8] = (byte)var10;
                      ad.field_m[3] = (byte)param1;
                      ad.field_m[9] = (byte)this.field_a;
                      ad.field_m[5] = (byte)var9;
                      this.field_f.a(false, (long)(520 * var7_int));
                      this.field_f.a(-1, 10, ad.field_m, 0);
                      var11 = param4 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_f.a(param2 ^ -1589174833, var11, param3, var8);
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
                if (param2 != 1589174832) {
                  this.toString();
                }
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
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

    public static void a(int param0) {
        if (param0 != 8) {
          field_d = (og) null;
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final boolean a(int param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_f;
          synchronized (var5) {
            if (param3 >= param2 &&
              this.field_h >= param3) {
              var6 = this.a(true, param0, 1589174832, param1, param3) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, param0, 1589174832, param1, param3) ? 1 : 0;
              }
              stackIn_7_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ua.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ua(int param0, ak param1, ak param2, int param3) {
        this.field_i = null;
        this.field_f = null;
        this.field_h = 65000;
        try {
          this.field_a = param0;
          this.field_f = param1;
          this.field_i = param2;
          this.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ua.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

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
          Object stackIn_17_0 = null;
          Object stackIn_38_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Terraphoenix.field_V;
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            try {
              if (this.field_i.a((byte) 54) < (long)(6 * param1 + 6)) {
                return null;
              }
              this.field_i.a(false, (long)(6 * param1));
              this.field_i.a(ad.field_m, (byte) 71, 0, 6);
              var4_int = (ad.field_m[1] << 8 & 65280) + (((ad.field_m[0] & 255) << 16) + (255 & ad.field_m[2]));
              var5 = (ad.field_m[5] & 255) + ((ad.field_m[3] << 16 & 16711680) + ((255 & ad.field_m[4]) << 8));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_h < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (param0 != -18342) {
                this.field_h = -111;
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > this.field_f.a((byte) -113) / 520L) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_f.a(false, (long)(520 * var5));
                var9 = var4_int - var7;
                if (65535 < param1) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_f.a(ad.field_m, (byte) -127, 0, var9 + var14);
                  var10 = ((255 & ad.field_m[0]) << 24) - (-(16711680 & ad.field_m[1] << 16) - ((ad.field_m[2] & 255) << 8) - (ad.field_m[3] & 255));
                  var11 = (ad.field_m[5] & 255) + ((255 & ad.field_m[4]) << 8);
                  var12 = (ad.field_m[7] << 8 & 65280) + ((255 & ad.field_m[6]) << 16) + (ad.field_m[8] & 255);
                  var13 = 255 & ad.field_m[9];
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_f.a(ad.field_m, (byte) -125, 0, var9 + var14);
                  var12 = (255 & ad.field_m[6]) + (16711680 & ad.field_m[4] << 16) + ((255 & ad.field_m[5]) << 8);
                  var11 = ((ad.field_m[2] & 255) << 8) + (ad.field_m[3] & 255);
                  var10 = ((ad.field_m[0] & 255) << 8) + (255 & ad.field_m[1]);
                  var13 = ad.field_m[7] & 255;
                }
                if (param1 != var10) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_a != var13) {
                  stackIn_38_0 = null;
                  return (byte[]) (stackIn_38_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_f.a((byte) -127) / 520L < (long)var12) {
                  return null;
                }
                var15 = var9 + var14;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ad.field_m[var16];
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

    static {
        field_e = 128;
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_d = new og();
    }
}
