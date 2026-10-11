/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pb {
    private int field_a;
    private o field_d;
    static int field_e;
    static String field_c;
    private int field_b;
    private o field_f;
    static String field_g;

    public final String toString() {
        return "" + this.field_a;
    }

    private final boolean a(boolean param0, int param1, byte[] param2, byte param3, int param4) {
        try {
          RuntimeException stackIn_68_0 = null;
          StringBuilder stackIn_68_1 = null;
          String stackIn_69_2 = null;
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
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = Torquing.field_u;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param0) {
                  if (this.field_f.b(true) < (long)(6 + 6 * param1)) {
                    return false;
                  }
                  this.field_f.a(false, (long)(6 * param1));
                  this.field_f.a(0, aa.field_X, 6, -80);
                  var7_int = (aa.field_X[3] << 16 & 16711680) + (aa.field_X[4] << 8 & 65280) + (255 & aa.field_X[5]);
                  if (var7_int <= 0 ||
                    !((this.field_d.b(true) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_d.b(true)) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                aa.field_X[0] = (byte)(param4 >> 16);
                aa.field_X[1] = (byte)(param4 >> 8);
                aa.field_X[2] = (byte)param4;
                aa.field_X[3] = (byte)(var7_int >> 16);
                aa.field_X[4] = (byte)(var7_int >> 8);
                aa.field_X[5] = (byte)var7_int;
                this.field_f.a(false, (long)(6 * param1));
                this.field_f.a(-1, 6, 0, aa.field_X);
                var9 = 120 % ((-33 - param3) / 62);
                var8 = 0;
                var10 = 0;
                L3: while (true) {
                  if (param4 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (param0) {
                      this.field_d.a(false, (long)(var7_int * 520));
                      if (65535 >= param1) {
                        try {
                          this.field_d.a(0, aa.field_X, 8, -108);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var11 = (255 & aa.field_X[6]) + (65280 & aa.field_X[5] << 8) + ((255 & aa.field_X[4]) << 16);
                        var14 = aa.field_X[7] & 255;
                        var12 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << 8);
                        var13 = (255 & aa.field_X[3]) + ((aa.field_X[2] & 255) << 8);
                      } else {
                        try {
                          this.field_d.a(0, aa.field_X, 10, -89);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = (aa.field_X[7] << 8 & 65280) + ((aa.field_X[6] & 255) << 16) + (255 & aa.field_X[8]);
                        var12 = (255 & aa.field_X[3]) + ((65280 & aa.field_X[2] << 8) + ((aa.field_X[0] & 255) << 24)) + ((aa.field_X[1] & 255) << 16);
                        var14 = aa.field_X[9] & 255;
                        var13 = (aa.field_X[4] << 8 & 65280) + (255 & aa.field_X[5]);
                      }
                      if ((var12 == param1 &&
                        var13 == var10 &&
                        var14 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !((long)var11 <= (this.field_d.b(true) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var11 == 0) {
                      param0 = false;
                      var11 = (int)((this.field_d.b(true) + 519L) / 520L);
                      if (0 == var11) {
                        var11++;
                      }
                      if (var7_int == var11) {
                        var11++;
                      }
                    }
                    if (512 >= param4 - var8) {
                      var11 = 0;
                    }
                    if (param1 <= 65535) {
                      aa.field_X[6] = (byte)var11;
                      aa.field_X[0] = (byte)(param1 >> 8);
                      aa.field_X[2] = (byte)(var10 >> 8);
                      aa.field_X[3] = (byte)var10;
                      aa.field_X[1] = (byte)param1;
                      aa.field_X[5] = (byte)(var11 >> 8);
                      aa.field_X[4] = (byte)(var11 >> 16);
                      aa.field_X[7] = (byte)this.field_a;
                      this.field_d.a(false, (long)(var7_int * 520));
                      this.field_d.a(-1, 8, 0, aa.field_X);
                      var12 = -var8 + param4;
                      if (512 < var12) {
                        var12 = 512;
                      }
                      this.field_d.a(-1, var12, var8, param2);
                      var8 = var8 + var12;
                    } else {
                      aa.field_X[5] = (byte)var10;
                      aa.field_X[8] = (byte)var11;
                      aa.field_X[4] = (byte)(var10 >> 8);
                      aa.field_X[1] = (byte)(param1 >> 16);
                      aa.field_X[9] = (byte)this.field_a;
                      aa.field_X[0] = (byte)(param1 >> 24);
                      aa.field_X[7] = (byte)(var11 >> 8);
                      aa.field_X[6] = (byte)(var11 >> 16);
                      aa.field_X[3] = (byte)param1;
                      aa.field_X[2] = (byte)(param1 >> 8);
                      this.field_d.a(false, (long)(520 * var7_int));
                      this.field_d.a(-1, 10, 0, aa.field_X);
                      var12 = param4 - var8;
                      if (var12 > 510) {
                        var12 = 510;
                      }
                      this.field_d.a(-1, var12, var8, param2);
                      var8 = var8 + var12;
                    }
                    var10++;
                    var7_int = var11;
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
            stackIn_68_0 = var6_ref;
            stackIn_68_1 = new StringBuilder().append("pb.E(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    final byte[] a(int param0, byte param1) {
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
          Object stackIn_3_0 = null;
          byte[] stackIn_7_0 = null;
          Object stackIn_25_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Torquing.field_u;
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            try {
              if (this.field_f.b(true) < (long)(6 + 6 * param0)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_f.a(false, (long)(param0 * 6));
              this.field_f.a(0, aa.field_X, 6, param1 + 25);
              var4_int = ((aa.field_X[0] & 255) << 16) + ((255 & aa.field_X[1]) << 8) + (255 & aa.field_X[2]);
              if (param1 != 85) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              var5 = ((aa.field_X[3] & 255) << 16) + ((255 & aa.field_X[4]) << 8) + (255 & aa.field_X[5]);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_b < var4_int) {
                return null;
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > (this.field_d.b(true) / 520L)) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                this.field_d.a(false, (long)(520 * var5));
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_d.a(0, aa.field_X, var9 + var14, -76);
                  var11 = (aa.field_X[5] & 255) + (aa.field_X[4] << 8 & 65280);
                  var13 = aa.field_X[9] & 255;
                  var10 = (aa.field_X[3] & 255) + ((aa.field_X[0] << 24 & -16777216) + ((16711680 & aa.field_X[1] << 16) + (aa.field_X[2] << 8 & 65280)));
                  var12 = (255 & aa.field_X[8]) + (((255 & aa.field_X[6]) << 16) + ((255 & aa.field_X[7]) << 8));
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_d.a(0, aa.field_X, var9 + var14, -113);
                  var10 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << 8);
                  var13 = 255 & aa.field_X[7];
                  var11 = ((aa.field_X[2] & 255) << 8) + (aa.field_X[3] & 255);
                  var12 = (255 & aa.field_X[6]) + (aa.field_X[4] << 16 & 16711680) + (aa.field_X[5] << 8 & 65280);
                }
                if (var10 != param0) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_a) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.field_d.b(true) / 520L)) {
                  return null;
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = aa.field_X[var16];
                }
              }
              stackIn_54_0 = var6;
              return stackIn_54_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_57_0 = null;
              return (byte[]) (stackIn_57_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param1 != 10282) {
            return false;
          }
          var5 = this.field_d;
          synchronized (var5) {
            if (param3 >= 0 &&
              this.field_b >= param3) {
              var6 = this.a(true, param0, param2, (byte) -122, param3) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, param0, param2, (byte) -123, param3) ? 1 : 0;
              }
              stackIn_10_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static t[] a(String param0, int param1, String param2, la param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        t[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param1, param2);
          var5 = param3.a(param0, param1 - 103, var4_int);
          stackIn_1_0 = mi.a(var4_int, param3, var5, 482809644);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pb.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    pb(int param0, o param1, o param2, int param3) {
        this.field_d = null;
        this.field_b = 65000;
        this.field_f = null;
        try {
          this.field_a = param0;
          this.field_f = param2;
          this.field_b = param3;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = -1;
        field_c = "Unpacking music";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
