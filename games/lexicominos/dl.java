/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl {
    private be field_a;
    private int field_f;
    private be field_c;
    static boolean field_g;
    static volatile boolean field_b;
    private int field_e;
    static sh field_d;

    final static cd a(int param0, sh param1, byte param2, sh param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        cd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nb.a(param0, param4, (byte) -4, param1)) {
            stackIn_2_0 = null;
            return (cd) (stackIn_2_0);
          }
          if (param2 > -28) {
            dl.a(-62);
          }
          stackIn_6_0 = vi.a(param3.a(param0, -27493, param4), (byte) 107);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
          var16 = Lexicominos.field_L ? 1 : 0;
          try {
            var6 = this.field_a;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + param4 * 6) > this.field_c.a((byte) -122)) {
                    return false;
                  }
                  this.field_c.a((byte) 40, (long)(param4 * 6));
                  this.field_c.a(0, ra.field_a, 6, -1);
                  var7_int = (65280 & ra.field_a[4] << 8) + (ra.field_a[3] << 16 & 16711680) + (255 & ra.field_a[5]);
                  if (var7_int <= 0 ||
                    !((this.field_a.a((byte) -122) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_a.a((byte) -122)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ra.field_a[1] = (byte)(param3 >> 8);
                ra.field_a[2] = (byte)param3;
                ra.field_a[0] = (byte)(param3 >> 16);
                ra.field_a[4] = (byte)(var7_int >> 8);
                ra.field_a[3] = (byte)(var7_int >> 16);
                ra.field_a[5] = (byte)var7_int;
                if (param1 != 17699) {
                  this.field_c = (be) null;
                }
                this.field_c.a((byte) 40, (long)(param4 * 6));
                this.field_c.b(0, ra.field_a, 6, -31593);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param3 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_a.a((byte) 40, (long)(var7_int * 520));
                      if (param4 > 65535) {
                        try {
                          this.field_a.a(0, ra.field_a, 10, -1);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var11 = (ra.field_a[2] << 8 & 65280) + ((ra.field_a[1] << 16 & 16711680) + (-16777216 & ra.field_a[0] << 24) + (ra.field_a[3] & 255));
                        var12 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 8);
                        var10 = ((ra.field_a[6] & 255) << 16) - (-((ra.field_a[7] & 255) << 8) - (ra.field_a[8] & 255));
                        var13 = 255 & ra.field_a[9];
                      } else {
                        try {
                          this.field_a.a(0, ra.field_a, 8, -1);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = ((255 & ra.field_a[5]) << 8) + (((ra.field_a[4] & 255) << 16) + (ra.field_a[6] & 255));
                        var11 = (255 & ra.field_a[1]) + (65280 & ra.field_a[0] << 8);
                        var13 = 255 & ra.field_a[7];
                        var12 = ((ra.field_a[2] & 255) << 8) + (255 & ra.field_a[3]);
                      }
                      if ((param4 == var11 &&
                        var9 == var12 &&
                        this.field_f == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_a.a((byte) -122) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_a.a((byte) -122) + 519L) / 520L);
                      param2 = false;
                      if (0 == var10) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param3 <= 512) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      ra.field_a[8] = (byte)var10;
                      ra.field_a[3] = (byte)param4;
                      ra.field_a[2] = (byte)(param4 >> 8);
                      ra.field_a[9] = (byte)this.field_f;
                      ra.field_a[5] = (byte)var9;
                      ra.field_a[1] = (byte)(param4 >> 16);
                      ra.field_a[4] = (byte)(var9 >> 8);
                      ra.field_a[7] = (byte)(var10 >> 8);
                      ra.field_a[6] = (byte)(var10 >> 16);
                      ra.field_a[0] = (byte)(param4 >> 24);
                      this.field_a.a((byte) 40, (long)(520 * var7_int));
                      this.field_a.b(0, ra.field_a, 10, -31593);
                      var11 = param3 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_a.b(var8, param0, var11, -31593);
                      var8 = var8 + var11;
                    } else {
                      ra.field_a[5] = (byte)(var10 >> 8);
                      ra.field_a[6] = (byte)var10;
                      ra.field_a[1] = (byte)param4;
                      ra.field_a[3] = (byte)var9;
                      ra.field_a[2] = (byte)(var9 >> 8);
                      ra.field_a[7] = (byte)this.field_f;
                      ra.field_a[0] = (byte)(param4 >> 8);
                      ra.field_a[4] = (byte)(var10 >> 16);
                      this.field_a.a((byte) 40, (long)(520 * var7_int));
                      this.field_a.b(0, ra.field_a, 8, -31593);
                      var11 = param3 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_a.b(var8, param0, var11, -31593);
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
            stackIn_73_0 = var6_ref;
            stackIn_73_1 = new StringBuilder().append("dl.E(");
            if (param0 == null) {
              stackIn_74_2 = "null";
            } else {
              stackIn_74_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          var5 = this.field_a;
          synchronized (var5) {
            if (~param1 <= param3 &&
              this.field_e >= param1) {
              var6 = this.a(param0, 17699, true, param1, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, param3 + 17700, false, param1, param2) ? 1 : 0;
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
          stackIn_13_1 = new StringBuilder().append("dl.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
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
          Object stackIn_5_0 = null;
          Object stackIn_17_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Lexicominos.field_L ? 1 : 0;
          var3_ref = this.field_a;
          synchronized (var3_ref) {
            try {
              if (param1 != -65536) {
                this.toString();
              }
              if ((long)(param0 * 6 + 6) > this.field_c.a((byte) -122)) {
                stackIn_5_0 = null;
                return (byte[]) (stackIn_5_0);
              }
              this.field_c.a((byte) 40, (long)(6 * param0));
              this.field_c.a(0, ra.field_a, 6, -1);
              var4_int = (255 & ra.field_a[2]) + ((255 & ra.field_a[0]) << 16) + ((ra.field_a[1] & 255) << 8);
              var5 = (ra.field_a[5] & 255) + ((ra.field_a[3] & 255) << 16) + (65280 & ra.field_a[4] << 8);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_e < var4_int) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_a.a((byte) -122) / 520L) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_a.a((byte) 40, (long)(520 * var5));
                var9 = -var7 + var4_int;
                if (param0 <= 65535) {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_a.a(0, ra.field_a, var14 + var9, -1);
                  var12 = (255 & ra.field_a[6]) + ((ra.field_a[5] & 255) << 8) + ((ra.field_a[4] & 255) << 16);
                  var11 = ((255 & ra.field_a[2]) << 8) + (ra.field_a[3] & 255);
                  var10 = (ra.field_a[0] << 8 & 65280) + (255 & ra.field_a[1]);
                  var13 = 255 & ra.field_a[7];
                } else {
                  var14 = 10;
                  if (510 < var9) {
                    var9 = 510;
                  }
                  this.field_a.a(0, ra.field_a, var9 + var14, -1);
                  var12 = (255 & ra.field_a[8]) + ((255 & ra.field_a[6]) << 16) + ((ra.field_a[7] & 255) << 8);
                  var10 = (255 & ra.field_a[3]) + ((ra.field_a[2] & 255) << 8) + (((255 & ra.field_a[1]) << 16) + ((255 & ra.field_a[0]) << 24));
                  var11 = (ra.field_a[5] & 255) + (65280 & ra.field_a[4] << 8);
                  var13 = 255 & ra.field_a[9];
                }
                if (var10 != param0) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_f) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_a.a((byte) -122) / 520L < (long)var12) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ra.field_a[var16];
                }
                var5 = var12;
                var8++;
              }
              stackIn_51_0 = var6;
              return stackIn_51_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_54_0 = null;
              return (byte[]) (stackIn_54_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_f;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 7) {
          field_b = false;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Lexicominos.field_L ? 1 : 0;
        int var1_intLifetime1;
        try {
          bg.field_a.a((byte) 50);
          if (param0 != 5) {
            dl.b(114);
          }
          for (var1_int = 0; 32 > var1_int; var1_int++) {
            kj.field_q[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            f.field_i[var1_intLifetime1] = 0L;
          }
          jj.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "dl.C(" + param0 + ')');
        }
    }

    dl(int param0, be param1, be param2, int param3) {
        this.field_a = null;
        this.field_c = null;
        this.field_e = 65000;
        try {
          this.field_a = param1;
          this.field_c = param2;
          this.field_f = param0;
          this.field_e = param3;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = true;
    }
}
