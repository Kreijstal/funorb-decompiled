/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fo {
    private int field_d;
    private int field_a;
    private gdb field_c;
    private gdb field_b;

    private final boolean a(byte[] param0, byte param1, boolean param2, int param3, int param4) {
        try {
          RuntimeException stackIn_74_0 = null;
          StringBuilder stackIn_74_1 = null;
          String stackIn_75_2 = null;
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
          var16 = VoidHunters.field_G;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(param4 * 6 + 6) > this.field_b.b(0)) {
                    return false;
                  }
                  this.field_b.a(0, (long)(6 * param4));
                  this.field_b.a(hbb.field_N, 6, 0, -30541);
                  var7_int = (hbb.field_N[5] & 255) + (65280 & hbb.field_N[4] << 8) + ((255 & hbb.field_N[3]) << 16);
                  if (var7_int <= 0 ||
                    !((this.field_c.b(0) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_c.b(0) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                hbb.field_N[0] = (byte)(param3 >> 16);
                hbb.field_N[5] = (byte)var7_int;
                hbb.field_N[2] = (byte)param3;
                hbb.field_N[1] = (byte)(param3 >> 8);
                hbb.field_N[3] = (byte)(var7_int >> 16);
                hbb.field_N[4] = (byte)(var7_int >> 8);
                this.field_b.a(0, (long)(param4 * 6));
                this.field_b.a(6, 0, (byte) -117, hbb.field_N);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param3) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_c.a(0, (long)(520 * var7_int));
                      if (param4 <= 65535) {
                        try {
                          this.field_c.a(hbb.field_N, 8, 0, -30541);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var11 = ((hbb.field_N[0] & 255) << 8) + (255 & hbb.field_N[1]);
                        var10 = (255 & hbb.field_N[6]) + ((hbb.field_N[4] << 16 & 16711680) + (hbb.field_N[5] << 8 & 65280));
                        var13 = 255 & hbb.field_N[7];
                        var12 = ((hbb.field_N[2] & 255) << 8) + (255 & hbb.field_N[3]);
                      } else {
                        try {
                          this.field_c.a(hbb.field_N, 10, 0, -30541);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = hbb.field_N[9] & 255;
                        var12 = (255 & hbb.field_N[5]) + (hbb.field_N[4] << 8 & 65280);
                        var10 = (hbb.field_N[6] << 16 & 16711680) - (-(65280 & hbb.field_N[7] << 8) - (hbb.field_N[8] & 255));
                        var11 = (hbb.field_N[3] & 255) + ((255 & hbb.field_N[1]) << 16) + (hbb.field_N[0] << 24 & -16777216) + ((hbb.field_N[2] & 255) << 8);
                      }
                      if ((var11 == param4 &&
                        var12 == var9 &&
                        var13 == this.field_d) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_c.b(0) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_c.b(0)) / 520L);
                      param2 = false;
                      if (0 == var10) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (512 >= -var8 + param3) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      hbb.field_N[8] = (byte)var10;
                      hbb.field_N[7] = (byte)(var10 >> 8);
                      hbb.field_N[5] = (byte)var9;
                      hbb.field_N[0] = (byte)(param4 >> 24);
                      hbb.field_N[6] = (byte)(var10 >> 16);
                      hbb.field_N[9] = (byte)this.field_d;
                      hbb.field_N[4] = (byte)(var9 >> 8);
                      hbb.field_N[1] = (byte)(param4 >> 16);
                      hbb.field_N[2] = (byte)(param4 >> 8);
                      hbb.field_N[3] = (byte)param4;
                      this.field_c.a(0, (long)(var7_int * 520));
                      this.field_c.a(10, 0, (byte) -120, hbb.field_N);
                      var11 = -var8 + param3;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a(var11, var8, (byte) -106, param0);
                      var8 = var8 + var11;
                    } else {
                      hbb.field_N[3] = (byte)var9;
                      hbb.field_N[6] = (byte)var10;
                      hbb.field_N[0] = (byte)(param4 >> 8);
                      hbb.field_N[4] = (byte)(var10 >> 16);
                      hbb.field_N[5] = (byte)(var10 >> 8);
                      hbb.field_N[7] = (byte)this.field_d;
                      hbb.field_N[1] = (byte)param4;
                      hbb.field_N[2] = (byte)(var9 >> 8);
                      this.field_c.a(0, (long)(520 * var7_int));
                      this.field_c.a(8, 0, (byte) -114, hbb.field_N);
                      var11 = param3 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.a(var11, var8, (byte) -102, param0);
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
                if (param1 > -62) {
                  this.field_a = 31;
                }
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_74_0 = var6_ref;
            stackIn_74_1 = new StringBuilder().append("fo.B(");
            if (param0 == null) {
              stackIn_75_2 = "null";
            } else {
              stackIn_75_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          var5 = this.field_c;
          synchronized (var5) {
            if (0 <= param3 &&
              param3 <= this.field_a) {
              if (param1 != 520) {
                this.a((byte) -30, -43);
              }
              var6 = this.a(param2, (byte) -93, true, param3, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, (byte) -112, false, param3, param0) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("fo.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return "" + this.field_d;
    }

    final byte[] a(byte param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
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
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_3_0 = null;
          byte[] stackIn_19_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = VoidHunters.field_G;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param1 * 6) > this.field_b.b(0)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_b.a(0, (long)(6 * param1));
              this.field_b.a(hbb.field_N, 6, 0, -30541);
              var4_int = (255 & hbb.field_N[2]) + (((255 & hbb.field_N[0]) << 16) + ((255 & hbb.field_N[1]) << 8));
              var5 = (hbb.field_N[3] << 16 & 16711680) + (hbb.field_N[4] << 8 & 65280) + (hbb.field_N[5] & 255);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_a < var4_int) {
                return null;
              }
              if (0 >= var5) {
                return null;
              }
              if ((this.field_c.b(0) / 520L) < (long)var5) {
                return null;
              }
              var6 = new byte[var4_int];
              if (param0 <= 13) {
                stackIn_19_0 = (byte[]) null;
                return stackIn_19_0;
              }
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_c.a(0, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (65535 < param1) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_c.a(hbb.field_N, var9 + var14, 0, -30541);
                  var10 = (255 & hbb.field_N[3]) + (((hbb.field_N[2] & 255) << 8) + ((hbb.field_N[0] & 255) << 24) + ((255 & hbb.field_N[1]) << 16));
                  var12 = ((hbb.field_N[7] & 255) << 8) + (16711680 & hbb.field_N[6] << 16) + (hbb.field_N[8] & 255);
                  var13 = hbb.field_N[9] & 255;
                  var11 = (255 & hbb.field_N[5]) + (65280 & hbb.field_N[4] << 8);
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_c.a(hbb.field_N, var14 + var9, 0, -30541);
                  var13 = hbb.field_N[7] & 255;
                  var11 = (255 & hbb.field_N[3]) + ((hbb.field_N[2] & 255) << 8);
                  var12 = (255 & hbb.field_N[6]) + ((255 & hbb.field_N[4]) << 16) + (65280 & hbb.field_N[5] << 8);
                  var10 = (hbb.field_N[1] & 255) + (65280 & hbb.field_N[0] << 8);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_d != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_c.b(0) / 520L < (long)var12) {
                  return null;
                }
                var15 = var14 + var9;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = hbb.field_N[var16];
                }
                var8++;
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

    fo(int param0, gdb param1, gdb param2, int param3) {
        this.field_a = 65000;
        this.field_c = null;
        this.field_b = null;
        try {
          this.field_d = param0;
          this.field_a = param3;
          this.field_b = param2;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
