/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ta {
    private int field_e;
    static long[] field_d;
    private v field_f;
    private v field_a;
    private int field_c;
    static String[] field_b;

    final byte[] a(int param0, byte param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_15_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_37_0 = null;
          Object stackIn_43_0 = null;
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
          var18 = BachelorFridge.field_y;
          var3 = this.field_f;
          synchronized (var3) {
            try {
              if (this.field_a.b(-1) < (long)(6 * param0 + 6)) {
                return null;
              }
              this.field_a.a((long)(6 * param0), (byte) -91);
              this.field_a.a(6, 0, param1 ^ 4, rda.field_b);
              var4_int = (rda.field_b[0] << 16 & 16711680) + ((rda.field_b[1] & 255) << 8) + (255 & rda.field_b[2]);
              var5 = ((255 & rda.field_b[3]) << 16) + (65280 & rda.field_b[4] << 8) + (255 & rda.field_b[5]);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_e < var4_int) {
                return null;
              }
              if (0 >= var5) {
                return null;
              }
              if (this.field_f.b(-1) / 520L < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var4_int <= var7) {
                  if (param1 != -5) {
                    this.a(42, (byte) -46);
                  }
                  stackIn_52_0 = var6;
                  return stackIn_52_0;
                }
                if (var5 == 0) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_f.a((long)(var5 * 520), (byte) -108);
                var9 = var4_int - var7;
                if (65535 >= param0) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_f.a(var14 + var9, 0, -1, rda.field_b);
                  var12 = (rda.field_b[4] << 16 & 16711680) + ((255 & rda.field_b[5]) << 8) + (255 & rda.field_b[6]);
                  var10 = ((255 & rda.field_b[0]) << 8) + (rda.field_b[1] & 255);
                  var11 = ((rda.field_b[2] & 255) << 8) + (255 & rda.field_b[3]);
                  var13 = rda.field_b[7] & 255;
                } else {
                  if (510 < var9) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_f.a(var9 + var14, 0, -1, rda.field_b);
                  var12 = ((rda.field_b[6] & 255) << 16) + ((255 & rda.field_b[7]) << 8) + (rda.field_b[8] & 255);
                  var11 = ((255 & rda.field_b[4]) << 8) + (rda.field_b[5] & 255);
                  var13 = 255 & rda.field_b[9];
                  var10 = (255 & rda.field_b[3]) + ((rda.field_b[0] & 255) << 24) + ((rda.field_b[1] << 16 & 16711680) + ((rda.field_b[2] & 255) << 8));
                }
                if (param0 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_c) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (0 > var12) {
                  return null;
                }
                if ((long)var12 > this.field_f.b(-1) / 520L) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                var15 = var14 + var9;
                var8++;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = rda.field_b[var16];
                }
                var5 = var12;
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

    public static void a(int param0) {
        field_b = null;
        if (param0 != 255) {
          lu var2 = (lu) null;
          ta.a(-123, (lu) null);
        }
        field_d = null;
    }

    final static pp a(int param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        pea stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 80 % ((-13 - param0) / 38);
          stackIn_1_0 = new pea(qi.a(param1, (byte) 24), param1.b(16711935), param1.b(16711935));
          return (pp) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte[] param1, int param2, int param3) {
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
          var5 = this.field_f;
          synchronized (var5) {
            if (param3 <= param0 &&
              param0 <= this.field_e) {
              var6 = this.a(param2, true, -15, param0, param1) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, false, -31, param0, param1) ? 1 : 0;
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
          stackIn_13_1 = new StringBuilder().append("ta.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return "" + this.field_c;
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, byte[] param4) {
        try {
          RuntimeException stackIn_70_0 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          Object var7 = null;
          int var8_int = 0;
          IOException var8 = null;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = BachelorFridge.field_y;
          try {
            var6_int = -119 % ((param2 + 91) / 35);
            var7 = this.field_f;
            synchronized (var7) {
              try {
                if (param1) {
                  if (this.field_a.b(-1) < (long)(6 * param0 + 6)) {
                    return false;
                  }
                  this.field_a.a((long)(param0 * 6), (byte) -121);
                  this.field_a.a(6, 0, -1, rda.field_b);
                  var8_int = (rda.field_b[3] << 16 & 16711680) + ((rda.field_b[4] & 255) << 8) + (rda.field_b[5] & 255);
                  if (var8_int <= 0 ||
                    !(this.field_f.b(-1) / 520L >= (long)var8_int)) {
                    return false;
                  }
                } else {
                  var8_int = (int)((519L + this.field_f.b(-1)) / 520L);
                  if (0 == var8_int) {
                    var8_int = 1;
                  }
                }
                rda.field_b[4] = (byte)(var8_int >> 8);
                rda.field_b[2] = (byte)param3;
                rda.field_b[3] = (byte)(var8_int >> 16);
                rda.field_b[0] = (byte)(param3 >> 16);
                rda.field_b[1] = (byte)(param3 >> 8);
                rda.field_b[5] = (byte)var8_int;
                this.field_a.a((long)(6 * param0), (byte) -124);
                this.field_a.a(-117, 0, rda.field_b, 6);
                var9 = 0;
                var10 = 0;
                L3: while (true) {
                  if (var9 < param3) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (param1) {
                      this.field_f.a((long)(var8_int * 520), (byte) -91);
                      if (param0 <= 65535) {
                        try {
                          this.field_f.a(8, 0, -1, rda.field_b);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var14 = 255 & rda.field_b[7];
                        var12 = ((rda.field_b[0] & 255) << 8) + (rda.field_b[1] & 255);
                        var13 = (rda.field_b[2] << 8 & 65280) + (255 & rda.field_b[3]);
                        var11 = ((rda.field_b[5] & 255) << 8) + (rda.field_b[4] << 16 & 16711680) + (255 & rda.field_b[6]);
                      } else {
                        try {
                          this.field_f.a(10, 0, -1, rda.field_b);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = (16711680 & rda.field_b[6] << 16) - (-(65280 & rda.field_b[7] << 8) - (rda.field_b[8] & 255));
                        var12 = (rda.field_b[3] & 255) + (((rda.field_b[2] & 255) << 8) + (16711680 & rda.field_b[1] << 16) + ((rda.field_b[0] & 255) << 24));
                        var13 = (65280 & rda.field_b[4] << 8) + (255 & rda.field_b[5]);
                        var14 = rda.field_b[9] & 255;
                      }
                      if ((var12 == param0 &&
                        var13 == var10 &&
                        this.field_c == var14) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !((this.field_f.b(-1) / 520L) >= (long)var11)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var11) {
                      var11 = (int)((519L + this.field_f.b(-1)) / 520L);
                      param1 = false;
                      if (var11 == 0) {
                        var11++;
                      }
                      if (var11 == var8_int) {
                        var11++;
                      }
                    }
                    if (-var9 + param3 <= 512) {
                      var11 = 0;
                    }
                    if (param0 <= 65535) {
                      rda.field_b[5] = (byte)(var11 >> 8);
                      rda.field_b[4] = (byte)(var11 >> 16);
                      rda.field_b[7] = (byte)this.field_c;
                      rda.field_b[6] = (byte)var11;
                      rda.field_b[2] = (byte)(var10 >> 8);
                      rda.field_b[3] = (byte)var10;
                      rda.field_b[1] = (byte)param0;
                      rda.field_b[0] = (byte)(param0 >> 8);
                      this.field_f.a((long)(var8_int * 520), (byte) -125);
                      this.field_f.a(-64, 0, rda.field_b, 8);
                      var12 = -var9 + param3;
                      if (var12 > 512) {
                        var12 = 512;
                      }
                      this.field_f.a(-79, var9, param4, var12);
                      var9 = var9 + var12;
                    } else {
                      rda.field_b[6] = (byte)(var11 >> 16);
                      rda.field_b[7] = (byte)(var11 >> 8);
                      rda.field_b[8] = (byte)var11;
                      rda.field_b[0] = (byte)(param0 >> 24);
                      rda.field_b[9] = (byte)this.field_c;
                      rda.field_b[3] = (byte)param0;
                      rda.field_b[2] = (byte)(param0 >> 8);
                      rda.field_b[4] = (byte)(var10 >> 8);
                      rda.field_b[1] = (byte)(param0 >> 16);
                      rda.field_b[5] = (byte)var10;
                      this.field_f.a((long)(var8_int * 520), (byte) -110);
                      this.field_f.a(-84, 0, rda.field_b, 10);
                      var12 = -var9 + param3;
                      if (var12 > 510) {
                        var12 = 510;
                      }
                      this.field_f.a(-59, var9, param4, var12);
                      var9 = var9 + var12;
                    }
                    var10++;
                    var8_int = var11;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var8 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_70_0 = var6;
            stackIn_70_1 = new StringBuilder().append("ta.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ta(int param0, v param1, v param2, int param3) {
        this.field_e = 65000;
        this.field_f = null;
        this.field_a = null;
        try {
          this.field_a = param2;
          this.field_f = param1;
          this.field_e = param3;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = new long[32];
    }
}
