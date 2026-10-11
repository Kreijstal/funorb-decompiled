/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na {
    private int field_e;
    private sf field_a;
    private int field_d;
    static int field_f;
    private sf field_b;
    static byte[] field_c;

    private final boolean a(int param0, boolean param1, byte[] param2, int param3, int param4) {
        try {
          RuntimeException stackIn_71_0 = null;
          StringBuilder stackIn_71_1 = null;
          String stackIn_72_2 = null;
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
          var16 = ZombieDawn.field_J;
          try {
            var6 = this.field_a;
            synchronized (var6) {
              try {
                if (param3 != 109242696) {
                  return true;
                }
                if (param1) {
                  if (this.field_b.a(param3 - 109242697) < (long)(6 + 6 * param0)) {
                    return false;
                  }
                  this.field_b.a(param3 ^ 109242696, (long)(param0 * 6));
                  this.field_b.a(6, false, 0, cg.field_c);
                  var7_int = (255 & cg.field_c[5]) + ((cg.field_c[3] & 255) << 16) + ((cg.field_c[4] & 255) << 8);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_a.a(-1) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_a.a(param3 - 109242697) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                cg.field_c[0] = (byte)(param4 >> 16);
                cg.field_c[4] = (byte)(var7_int >> 8);
                cg.field_c[2] = (byte)param4;
                cg.field_c[5] = (byte)var7_int;
                cg.field_c[1] = (byte)(param4 >> 8);
                cg.field_c[3] = (byte)(var7_int >> 16);
                this.field_b.a(0, (long)(param0 * 6));
                this.field_b.a(param3 ^ 109242722, cg.field_c, 0, 6);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param4) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_a.a(0, (long)(var7_int * 520));
                      if (65535 >= param0) {
                        try {
                          this.field_a.a(8, false, 0, cg.field_c);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (65280 & cg.field_c[2] << 8) + (255 & cg.field_c[3]);
                        var13 = 255 & cg.field_c[7];
                        var11 = ((cg.field_c[0] & 255) << 8) + (255 & cg.field_c[1]);
                        var10 = (65280 & cg.field_c[5] << 8) + (16711680 & cg.field_c[4] << 16) + (255 & cg.field_c[6]);
                      } else {
                        try {
                          this.field_a.a(10, false, 0, cg.field_c);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = 255 & cg.field_c[9];
                        var12 = (cg.field_c[5] & 255) + (cg.field_c[4] << 8 & 65280);
                        var11 = (65280 & cg.field_c[2] << 8) + ((cg.field_c[1] & 255) << 16) + (((cg.field_c[0] & 255) << 24) + (cg.field_c[3] & 255));
                        var10 = (16711680 & cg.field_c[6] << 16) + (((cg.field_c[7] & 255) << 8) + (cg.field_c[8] & 255));
                      }
                      if ((param0 == var11 &&
                        var9 == var12 &&
                        var13 == this.field_d) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_a.a(-1) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param1 = false;
                      var10 = (int)((519L + this.field_a.a(-1)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param4 <= 512) {
                      var10 = 0;
                    }
                    if (param0 > 65535) {
                      cg.field_c[1] = (byte)(param0 >> 16);
                      cg.field_c[4] = (byte)(var9 >> 8);
                      cg.field_c[3] = (byte)param0;
                      cg.field_c[5] = (byte)var9;
                      cg.field_c[9] = (byte)this.field_d;
                      cg.field_c[7] = (byte)(var10 >> 8);
                      cg.field_c[8] = (byte)var10;
                      cg.field_c[0] = (byte)(param0 >> 24);
                      cg.field_c[6] = (byte)(var10 >> 16);
                      cg.field_c[2] = (byte)(param0 >> 8);
                      this.field_a.a(0, (long)(var7_int * 520));
                      this.field_a.a(param3 - 109242651, cg.field_c, 0, 10);
                      var11 = -var8 + param4;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_a.a(106, param2, var8, var11);
                      var8 = var8 + var11;
                    } else {
                      cg.field_c[7] = (byte)this.field_d;
                      cg.field_c[2] = (byte)(var9 >> 8);
                      cg.field_c[0] = (byte)(param0 >> 8);
                      cg.field_c[4] = (byte)(var10 >> 16);
                      cg.field_c[3] = (byte)var9;
                      cg.field_c[6] = (byte)var10;
                      cg.field_c[1] = (byte)param0;
                      cg.field_c[5] = (byte)(var10 >> 8);
                      this.field_a.a(0, (long)(520 * var7_int));
                      this.field_a.a(120, cg.field_c, 0, 8);
                      var11 = -var8 + param4;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_a.a(110, param2, var8, var11);
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
            stackIn_71_0 = var6_ref;
            stackIn_71_1 = new StringBuilder().append("na.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          Object stackIn_11_0 = null;
          Object stackIn_17_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_38_0 = null;
          Object stackIn_44_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = ZombieDawn.field_J;
          var3_ref = this.field_a;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param1 + 6) > this.field_b.a(param0 ^ 65535)) {
                return null;
              }
              this.field_b.a(0, (long)(param1 * 6));
              if (param0 != -65536) {
                this.a(36, 125);
              }
              this.field_b.a(6, false, 0, cg.field_c);
              var4_int = ((255 & cg.field_c[0]) << 16) + (cg.field_c[1] << 8 & 65280) + (cg.field_c[2] & 255);
              var5 = (cg.field_c[3] << 16 & 16711680) - (-(cg.field_c[4] << 8 & 65280) - (cg.field_c[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                stackIn_11_0 = null;
                return (byte[]) (stackIn_11_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_a.a(-1) / 520L) < (long)var5) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (0 == var5) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_a.a(0, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (param1 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_a.a(var9 + var14, false, 0, cg.field_c);
                  var10 = ((255 & cg.field_c[1]) << 16) + ((cg.field_c[0] & 255) << 24) + ((65280 & cg.field_c[2] << 8) + (cg.field_c[3] & 255));
                  var11 = ((cg.field_c[4] & 255) << 8) + (cg.field_c[5] & 255);
                  var13 = 255 & cg.field_c[9];
                  var12 = (255 & cg.field_c[8]) + ((cg.field_c[6] & 255) << 16) + ((cg.field_c[7] & 255) << 8);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_a.a(var14 + var9, false, 0, cg.field_c);
                  var12 = (cg.field_c[6] & 255) + (((cg.field_c[4] & 255) << 16) + (cg.field_c[5] << 8 & 65280));
                  var11 = ((cg.field_c[2] & 255) << 8) + (cg.field_c[3] & 255);
                  var13 = 255 & cg.field_c[7];
                  var10 = (cg.field_c[0] << 8 & 65280) + (255 & cg.field_c[1]);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_d != var13) {
                  stackIn_38_0 = null;
                  return (byte[]) (stackIn_38_0);
                }
                if (0 > var12) {
                  return null;
                }
                if ((long)var12 > this.field_a.a(-1) / 520L) {
                  stackIn_44_0 = null;
                  return (byte[]) (stackIn_44_0);
                }
                var15 = var9 + var14;
                var8++;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = cg.field_c[var16];
                }
                var5 = var12;
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
        return "" + this.field_d;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 79) {
          na.a(113, '}');
        }
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
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
          var5 = this.field_a;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_e) {
              var6 = this.a(param0, true, param1, 109242696, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, false, param1, 109242696, param2) ? 1 : 0;
              }
              if (param3 != -96) {
                this.field_d = -60;
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
          stackIn_15_1 = new StringBuilder().append("na.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          if ((param1 <= param0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 != 0) {
              var6 = fj.field_h;
              var2 = var6;
              for (var3 = 0; var6.length > var3; var3++) {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "na.B(" + param0 + ',' + param1 + ')');
        }
    }

    na(int param0, sf param1, sf param2, int param3) {
        this.field_e = 65000;
        this.field_b = null;
        this.field_a = null;
        try {
          this.field_b = param2;
          this.field_a = param1;
          this.field_d = param0;
          this.field_e = param3;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
