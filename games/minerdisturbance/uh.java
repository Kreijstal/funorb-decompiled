/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uh {
    private me field_d;
    static boolean field_e;
    static String field_f;
    private me field_b;
    private int field_g;
    static String field_c;
    private int field_a;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param2 < 60) {
            return true;
          }
          var5 = this.field_b;
          synchronized (var5) {
            if (0 <= param0 &&
              param0 <= this.field_g) {
              var6 = this.a(param0, true, param3, (byte) -55, param1) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, false, param3, (byte) -50, param1) ? 1 : 0;
              }
              stackIn_11_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var5_ref;
          stackIn_16_1 = new StringBuilder().append("uh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return "" + this.field_a;
    }

    private final boolean a(int param0, boolean param1, int param2, byte param3, byte[] param4) {
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
          var16 = MinerDisturbance.field_ab;
          try {
            var6 = this.field_b;
            synchronized (var6) {
              try {
                if (param1) {
                  if ((long)(6 * param2 + 6) > this.field_d.a((byte) -109)) {
                    return false;
                  }
                  this.field_d.a((byte) 120, (long)(6 * param2));
                  this.field_d.a(ri.field_c, 0, 6, -1);
                  var7_int = (255 & ri.field_c[5]) + (((255 & ri.field_c[4]) << 8) + (ri.field_c[3] << 16 & 16711680));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_b.a((byte) -96) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_b.a((byte) -47) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ri.field_c[2] = (byte)param0;
                ri.field_c[4] = (byte)(var7_int >> 8);
                ri.field_c[3] = (byte)(var7_int >> 16);
                ri.field_c[5] = (byte)var7_int;
                ri.field_c[1] = (byte)(param0 >> 8);
                ri.field_c[0] = (byte)(param0 >> 16);
                this.field_d.a((byte) 116, (long)(6 * param2));
                this.field_d.a(ri.field_c, 6, 0, true);
                var8 = 0;
                if (param3 >= -35) {
                  uh.a((byte) -43);
                }
                var9 = 0;
                L4: while (true) {
                  if (var8 < param0) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_b.a((byte) 125, (long)(520 * var7_int));
                      if (65535 >= param2) {
                        try {
                          this.field_b.a(ri.field_c, 0, 8, -1);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var13 = ri.field_c[7] & 255;
                        var12 = (65280 & ri.field_c[2] << 8) + (255 & ri.field_c[3]);
                        var10 = (ri.field_c[4] << 16 & 16711680) - (-((255 & ri.field_c[5]) << 8) - (ri.field_c[6] & 255));
                        var11 = (ri.field_c[1] & 255) + ((ri.field_c[0] & 255) << 8);
                      } else {
                        try {
                          this.field_b.a(ri.field_c, 0, 10, -1);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var11 = (ri.field_c[3] & 255) + ((ri.field_c[0] & 255) << 24) + ((ri.field_c[1] << 16 & 16711680) + ((255 & ri.field_c[2]) << 8));
                        var12 = ((ri.field_c[4] & 255) << 8) + (255 & ri.field_c[5]);
                        var10 = (ri.field_c[8] & 255) + (ri.field_c[6] << 16 & 16711680) + ((255 & ri.field_c[7]) << 8);
                        var13 = 255 & ri.field_c[9];
                      }
                      if ((param2 == var11 &&
                        var12 == var9 &&
                        this.field_a == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_b.a((byte) -70) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param1 = false;
                      var10 = (int)((this.field_b.a((byte) -74) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (param0 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param2 <= 65535) {
                      ri.field_c[0] = (byte)(param2 >> 8);
                      ri.field_c[4] = (byte)(var10 >> 16);
                      ri.field_c[1] = (byte)param2;
                      ri.field_c[5] = (byte)(var10 >> 8);
                      ri.field_c[6] = (byte)var10;
                      ri.field_c[7] = (byte)this.field_a;
                      ri.field_c[3] = (byte)var9;
                      ri.field_c[2] = (byte)(var9 >> 8);
                      this.field_b.a((byte) 111, (long)(var7_int * 520));
                      this.field_b.a(ri.field_c, 8, 0, true);
                      var11 = -var8 + param0;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_b.a(param4, var11, var8, true);
                      var8 = var8 + var11;
                    } else {
                      ri.field_c[8] = (byte)var10;
                      ri.field_c[4] = (byte)(var9 >> 8);
                      ri.field_c[0] = (byte)(param2 >> 24);
                      ri.field_c[3] = (byte)param2;
                      ri.field_c[7] = (byte)(var10 >> 8);
                      ri.field_c[9] = (byte)this.field_a;
                      ri.field_c[5] = (byte)var9;
                      ri.field_c[6] = (byte)(var10 >> 16);
                      ri.field_c[1] = (byte)(param2 >> 16);
                      ri.field_c[2] = (byte)(param2 >> 8);
                      this.field_b.a((byte) 123, (long)(520 * var7_int));
                      this.field_b.a(ri.field_c, 10, 0, true);
                      var11 = -var8 + param0;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_b.a(param4, var11, var8, true);
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
            stackIn_71_0 = var6_ref;
            stackIn_71_1 = new StringBuilder().append("uh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
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
          Object stackIn_42_0 = null;
          byte[] stackIn_48_0 = null;
          Object stackIn_51_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = MinerDisturbance.field_ab;
          var3_ref = this.field_b;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + 6 * param1) > this.field_d.a((byte) -72)) {
                return null;
              }
              this.field_d.a((byte) 126, (long)(6 * param1));
              this.field_d.a(ri.field_c, 0, 6, -1);
              var4_int = (param0 & ri.field_c[2]) + ((ri.field_c[1] & 255) << 8) + ((ri.field_c[0] & 255) << 16);
              var5 = (65280 & ri.field_c[4] << 8) + (((255 & ri.field_c[3]) << 16) + (ri.field_c[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_g < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_b.a((byte) -95) / 520L) < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (0 == var5) {
                  return null;
                }
                this.field_b.a((byte) 121, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_b.a(ri.field_c, 0, var14 + var9, -1);
                  var11 = ((255 & ri.field_c[2]) << 8) + (ri.field_c[3] & 255);
                  var10 = (255 & ri.field_c[1]) + ((255 & ri.field_c[0]) << 8);
                  var12 = (255 & ri.field_c[6]) + (16711680 & ri.field_c[4] << 16) + (ri.field_c[5] << 8 & 65280);
                  var13 = ri.field_c[7] & 255;
                } else {
                  if (510 < var9) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_b.a(ri.field_c, 0, var14 + var9, param0 - 256);
                  var12 = (ri.field_c[8] & 255) + ((ri.field_c[7] & 255) << 8) + (16711680 & ri.field_c[6] << 16);
                  var13 = ri.field_c[9] & 255;
                  var10 = (ri.field_c[2] << 8 & 65280) + (ri.field_c[1] << 16 & 16711680) + (((ri.field_c[0] & 255) << 24) + (255 & ri.field_c[3]));
                  var11 = (255 & ri.field_c[5]) + (ri.field_c[4] << 8 & 65280);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_a != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.field_b.a((byte) -95) / 520L)) {
                  stackIn_42_0 = null;
                  return (byte[]) (stackIn_42_0);
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ri.field_c[var16];
                }
              }
              stackIn_48_0 = var6;
              return stackIn_48_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_51_0 = null;
              return (byte[]) (stackIn_51_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          try {
            if (!vf.field_j.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param1.length() > var3; var3++) {
              if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            if (param0 <= 7) {
              uh.a((byte) -75);
            }
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("uh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        if (param0 >= -103) {
          String var2 = (String) null;
          uh.a((byte) -78, (String) null);
        }
    }

    uh(int param0, me param1, me param2, int param3) {
        this.field_d = null;
        this.field_b = null;
        this.field_g = 65000;
        try {
          this.field_g = param3;
          this.field_a = param0;
          this.field_b = param1;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "uh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = true;
        field_f = "MULTIPLIER <times> <%0>";
        field_c = "<%0> <times> 100 = <%1>";
    }
}
