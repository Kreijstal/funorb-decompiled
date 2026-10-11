/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gi {
    private int field_b;
    private pc field_d;
    static int field_c;
    static int field_f;
    static int field_g;
    private pc field_e;
    private int field_a;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param2 != 5) {
            return true;
          }
          var5 = this.field_e;
          synchronized (var5) {
            if (param1 >= 0 &&
              param1 <= this.field_a) {
              var6 = this.a(param3, param1, true, param2 - 5, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param3, param1, false, 0, param0) ? 1 : 0;
              }
              stackIn_12_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("gi.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(boolean param0, int param1) {
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
          Object stackIn_9_0 = null;
          byte[] stackIn_19_0 = null;
          Object stackIn_25_0 = null;
          Object stackIn_41_0 = null;
          Object stackIn_47_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = stellarshard.field_B;
          var3_ref = this.field_e;
          synchronized (var3_ref) {
            try {
              if (this.field_d.c(117) < (long)(6 * param1 + 6)) {
                return null;
              }
              this.field_d.a((long)(6 * param1), 0);
              this.field_d.a(6, (byte) -93, 0, gg.field_e);
              var4_int = (gg.field_e[0] << 16 & 16711680) + ((gg.field_e[1] & 255) << 8) + (255 & gg.field_e[2]);
              var5 = (gg.field_e[5] & 255) + ((255 & gg.field_e[3]) << 16) + ((gg.field_e[4] & 255) << 8);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_a) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_e.c(70) / 520L) {
                return null;
              }
              if (!param0) {
                stackIn_19_0 = (byte[]) null;
                return stackIn_19_0;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                this.field_e.a((long)(520 * var5), 0);
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_e.a(var14 + var9, (byte) -93, 0, gg.field_e);
                  var10 = ((255 & gg.field_e[0]) << 8) + (255 & gg.field_e[1]);
                  var12 = (16711680 & gg.field_e[4] << 16) + (65280 & gg.field_e[5] << 8) + (255 & gg.field_e[6]);
                  var11 = (255 & gg.field_e[3]) + (gg.field_e[2] << 8 & 65280);
                  var13 = gg.field_e[7] & 255;
                } else {
                  if (510 < var9) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_e.a(var9 + var14, (byte) -93, 0, gg.field_e);
                  var13 = 255 & gg.field_e[9];
                  var12 = (255 & gg.field_e[8]) + (((255 & gg.field_e[6]) << 16) + (65280 & gg.field_e[7] << 8));
                  var10 = (gg.field_e[3] & 255) + ((65280 & gg.field_e[2] << 8) + (((gg.field_e[0] & 255) << 24) + ((255 & gg.field_e[1]) << 16)));
                  var11 = (255 & gg.field_e[5]) + ((255 & gg.field_e[4]) << 8);
                }
                if (param1 != var10) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_b != var13) {
                  stackIn_41_0 = null;
                  return (byte[]) (stackIn_41_0);
                }
                if (0 > var12) {
                  return null;
                }
                if (this.field_e.c(108) / 520L < (long)var12) {
                  stackIn_47_0 = null;
                  return (byte[]) (stackIn_47_0);
                }
                var15 = var9 + var14;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = gg.field_e[var16];
                }
                var5 = var12;
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

    private final boolean a(int param0, int param1, boolean param2, int param3, byte[] param4) {
        try {
          RuntimeException stackIn_70_0 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
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
          var16 = stellarshard.field_B;
          try {
            var6 = this.field_e;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + 6 * param0) > this.field_d.c(61)) {
                    return false;
                  }
                  this.field_d.a((long)(6 * param0), param3 + 0);
                  this.field_d.a(6, (byte) -93, 0, gg.field_e);
                  var7_int = (gg.field_e[5] & 255) + ((65280 & gg.field_e[4] << 8) + (16711680 & gg.field_e[3] << 16));
                  if (0 >= var7_int ||
                    !((long)var7_int <= this.field_e.c(110) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_e.c(param3 + 98) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                gg.field_e[5] = (byte)var7_int;
                gg.field_e[4] = (byte)(var7_int >> 8);
                gg.field_e[3] = (byte)(var7_int >> 16);
                gg.field_e[2] = (byte)param1;
                gg.field_e[1] = (byte)(param1 >> 8);
                gg.field_e[param3] = (byte)(param1 >> 16);
                this.field_d.a((long)(param0 * 6), 0);
                this.field_d.a(6, 0, -1, gg.field_e);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param1 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_e.a((long)(520 * var7_int), 0);
                      if (65535 >= param0) {
                        try {
                          this.field_e.a(8, (byte) -93, 0, gg.field_e);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var13 = gg.field_e[7] & 255;
                        var10 = (255 & gg.field_e[6]) + (((gg.field_e[4] & 255) << 16) + ((255 & gg.field_e[5]) << 8));
                        var11 = ((gg.field_e[0] & 255) << 8) + (gg.field_e[1] & 255);
                        var12 = (65280 & gg.field_e[2] << 8) + (255 & gg.field_e[3]);
                      } else {
                        try {
                          this.field_e.a(10, (byte) -93, 0, gg.field_e);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var12 = (gg.field_e[5] & 255) + ((255 & gg.field_e[4]) << 8);
                        var13 = gg.field_e[9] & 255;
                        var11 = ((255 & gg.field_e[2]) << 8) + ((gg.field_e[0] & 255) << 24) + ((gg.field_e[1] << 16 & 16711680) + (255 & gg.field_e[3]));
                        var10 = (255 & gg.field_e[8]) + (((gg.field_e[7] & 255) << 8) + (gg.field_e[6] << 16 & 16711680));
                      }
                      if ((param0 == var11 &&
                        var12 == var9 &&
                        this.field_b == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_e.c(102) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((this.field_e.c(127) + 519L) / 520L);
                      param2 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (512 >= -var8 + param1) {
                      var10 = 0;
                    }
                    if (param0 <= 65535) {
                      gg.field_e[0] = (byte)(param0 >> 8);
                      gg.field_e[5] = (byte)(var10 >> 8);
                      gg.field_e[1] = (byte)param0;
                      gg.field_e[6] = (byte)var10;
                      gg.field_e[3] = (byte)var9;
                      gg.field_e[4] = (byte)(var10 >> 16);
                      gg.field_e[7] = (byte)this.field_b;
                      gg.field_e[2] = (byte)(var9 >> 8);
                      this.field_e.a((long)(520 * var7_int), param3 + 0);
                      this.field_e.a(8, 0, ~param3, gg.field_e);
                      var11 = -var8 + param1;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_e.a(var11, var8, ~param3, param4);
                      var8 = var8 + var11;
                    } else {
                      gg.field_e[6] = (byte)(var10 >> 16);
                      gg.field_e[3] = (byte)param0;
                      gg.field_e[5] = (byte)var9;
                      gg.field_e[2] = (byte)(param0 >> 8);
                      gg.field_e[0] = (byte)(param0 >> 24);
                      gg.field_e[7] = (byte)(var10 >> 8);
                      gg.field_e[4] = (byte)(var9 >> 8);
                      gg.field_e[1] = (byte)(param0 >> 16);
                      gg.field_e[9] = (byte)this.field_b;
                      gg.field_e[8] = (byte)var10;
                      this.field_e.a((long)(520 * var7_int), 0);
                      this.field_e.a(10, 0, -1, gg.field_e);
                      var11 = param1 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_e.a(var11, var8, -1, param4);
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
            stackIn_70_0 = var6_ref;
            stackIn_70_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    gi(int param0, pc param1, pc param2, int param3) {
        this.field_d = null;
        this.field_e = null;
        this.field_a = 65000;
        try {
          this.field_a = param3;
          this.field_d = param2;
          this.field_b = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
