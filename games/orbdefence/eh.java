/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private int field_f;
    private dj field_b;
    static int field_a;
    private dj field_d;
    private int field_e;
    static volatile int field_c;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
          if (param1 != 255) {
            this.field_d = (dj) null;
          }
          var5 = this.field_d;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_e) {
              var6 = this.a(param0, true, param3, true, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, true, param3, false, param2) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("eh.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte[] param0, boolean param1, int param2, boolean param3, int param4) {
        try {
          dj stackIn_54_0 = null;
          boolean stackIn_55_1 = false;
          dj stackIn_61_0 = null;
          boolean stackIn_62_1 = false;
          dj stackIn_67_0 = null;
          boolean stackIn_68_1 = false;
          boolean stackIn_71_0 = false;
          RuntimeException stackIn_79_0 = null;
          StringBuilder stackIn_79_1 = null;
          String stackIn_80_2 = null;
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
          var16 = OrbDefence.field_D ? 1 : 0;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param3) {
                  if ((long)(6 + 6 * param2) > this.field_b.b(-34)) {
                    return false;
                  }
                  this.field_b.a((long)(param2 * 6), -1);
                  this.field_b.a(0, (byte) -119, 6, bi.field_c);
                  var7_int = (bi.field_c[4] << 8 & 65280) + ((bi.field_c[3] << 16 & 16711680) + (bi.field_c[5] & 255));
                  if (0 >= var7_int ||
                    !((long)var7_int <= (this.field_d.b(-103) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_d.b(-107)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                bi.field_c[3] = (byte)(var7_int >> 16);
                bi.field_c[1] = (byte)(param4 >> 8);
                bi.field_c[4] = (byte)(var7_int >> 8);
                bi.field_c[0] = (byte)(param4 >> 16);
                bi.field_c[5] = (byte)var7_int;
                bi.field_c[2] = (byte)param4;
                this.field_b.a((long)(6 * param2), -1);
                this.field_b.a(false, bi.field_c, 6, 0);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param4) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_d.a((long)(var7_int * 520), -1);
                      if (param2 <= 65535) {
                        try {
                          this.field_d.a(0, (byte) 81, 8, bi.field_c);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var10 = (255 & bi.field_c[6]) + (((255 & bi.field_c[4]) << 16) + (65280 & bi.field_c[5] << 8));
                        var13 = 255 & bi.field_c[7];
                        var12 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 8);
                        var11 = ((255 & bi.field_c[0]) << 8) + (255 & bi.field_c[1]);
                      } else {
                        try {
                          this.field_d.a(0, (byte) -128, 10, bi.field_c);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var10 = ((255 & bi.field_c[6]) << 16) + (65280 & bi.field_c[7] << 8) + (255 & bi.field_c[8]);
                        var12 = ((bi.field_c[4] & 255) << 8) + (bi.field_c[5] & 255);
                        var13 = bi.field_c[9] & 255;
                        var11 = (bi.field_c[3] & 255) + (((255 & bi.field_c[1]) << 16) + (((255 & bi.field_c[0]) << 24) + ((255 & bi.field_c[2]) << 8)));
                      }
                      if ((var11 == param2 &&
                        var9 == var12 &&
                        this.field_f == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_d.b(114) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_d.b(123) + 519L) / 520L);
                      param3 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (param4 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      bi.field_c[4] = (byte)(var9 >> 8);
                      bi.field_c[9] = (byte)this.field_f;
                      bi.field_c[1] = (byte)(param2 >> 16);
                      bi.field_c[0] = (byte)(param2 >> 24);
                      bi.field_c[5] = (byte)var9;
                      bi.field_c[6] = (byte)(var10 >> 16);
                      bi.field_c[2] = (byte)(param2 >> 8);
                      bi.field_c[8] = (byte)var10;
                      bi.field_c[7] = (byte)(var10 >> 8);
                      bi.field_c[3] = (byte)param2;
                      this.field_d.a((long)(520 * var7_int), -1);
                      stackIn_61_0 = this.field_d;
                      stackIn_62_1 = !(param1);
                      ((dj) (Object) stackIn_61_0).a(stackIn_62_1, bi.field_c, 10, 0);
                      var11 = param4 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      stackIn_67_0 = this.field_d;
                      stackIn_68_1 = !(param1);
                      ((dj) (Object) stackIn_67_0).a(stackIn_68_1, param0, var11, var8);
                      var8 = var8 + var11;
                    } else {
                      bi.field_c[2] = (byte)(var9 >> 8);
                      bi.field_c[5] = (byte)(var10 >> 8);
                      bi.field_c[6] = (byte)var10;
                      bi.field_c[7] = (byte)this.field_f;
                      bi.field_c[0] = (byte)(param2 >> 8);
                      bi.field_c[1] = (byte)param2;
                      bi.field_c[4] = (byte)(var10 >> 16);
                      bi.field_c[3] = (byte)var9;
                      this.field_d.a((long)(var7_int * 520), -1);
                      stackIn_54_0 = this.field_d;
                      stackIn_55_1 = !(param1);
                      ((dj) (Object) stackIn_54_0).a(stackIn_55_1, bi.field_c, 8, 0);
                      var11 = -var8 + param4;
                      if (512 < var11) {
                        var11 = 512;
                      }
                      this.field_d.a(false, param0, var11, var8);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
                    continue;
                  }
                  break;
                }
                stackIn_71_0 = param1;
                return stackIn_71_0;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_79_0 = var6_ref;
            stackIn_79_1 = new StringBuilder().append("eh.B(");
            if (param0 == null) {
              stackIn_80_2 = "null";
            } else {
              stackIn_80_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          byte[] stackIn_19_0 = null;
          byte[] stackIn_53_0 = null;
          Object stackIn_56_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = OrbDefence.field_D ? 1 : 0;
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param1 + 6) > this.field_b.b(126)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_b.a((long)(param1 * 6), -1);
              this.field_b.a(0, (byte) -18, 6, bi.field_c);
              var4_int = ((255 & bi.field_c[0]) << 16) + (bi.field_c[1] << 8 & 65280) + (bi.field_c[2] & 255);
              var5 = (bi.field_c[3] << 16 & 16711680) - (-((bi.field_c[4] & 255) << 8) - (bi.field_c[5] & 255));
              if (0 > var4_int) {
                return null;
              }
              if (this.field_e < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_d.b(107) / 520L) < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              if (param0 != 520) {
                stackIn_19_0 = (byte[]) null;
                return stackIn_19_0;
              }
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_d.a((long)(var5 * 520), -1);
                var9 = var4_int - var7;
                if (65535 < param1) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_d.a(0, (byte) -111, var9 + var14, bi.field_c);
                  var11 = ((bi.field_c[4] & 255) << 8) + (bi.field_c[5] & 255);
                  var10 = (bi.field_c[3] & 255) + (bi.field_c[0] << 24 & -16777216) + (bi.field_c[1] << 16 & 16711680) + ((bi.field_c[2] & 255) << 8);
                  var13 = bi.field_c[9] & 255;
                  var12 = (255 & bi.field_c[8]) + ((bi.field_c[6] << 16 & 16711680) + ((bi.field_c[7] & 255) << 8));
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_d.a(0, (byte) -125, var14 + var9, bi.field_c);
                  var12 = (65280 & bi.field_c[5] << 8) + ((bi.field_c[4] & 255) << 16) + (bi.field_c[6] & 255);
                  var13 = 255 & bi.field_c[7];
                  var11 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 8);
                  var10 = (bi.field_c[1] & 255) + ((255 & bi.field_c[0]) << 8);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_f != var13) {
                  return null;
                }
                if (0 > var12) {
                  return null;
                }
                if (this.field_d.b(param0 ^ -587) / 520L < (long)var12) {
                  return null;
                }
                var15 = var14 + var9;
                var8++;
                var5 = var12;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = bi.field_c[var16];
                }
              }
              stackIn_53_0 = var6;
              return stackIn_53_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_56_0 = null;
              return (byte[]) (stackIn_56_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    eh(int param0, dj param1, dj param2, int param3) {
        this.field_e = 65000;
        this.field_d = null;
        this.field_b = null;
        try {
          this.field_d = param1;
          this.field_b = param2;
          this.field_f = param0;
          this.field_e = param3;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "eh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = 0;
    }
}
