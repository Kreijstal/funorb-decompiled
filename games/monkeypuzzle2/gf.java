/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gf {
    private int field_a;
    private ch field_d;
    private ch field_f;
    static ad field_b;
    static hb field_c;
    private int field_e;

    public final String toString() {
        return "" + this.field_a;
    }

    final byte[] a(int param0, byte param1) {
        try {
          int var17 = 0;
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
          int var16 = 0;
          Throwable var18 = null;
          int var19 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_36_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          var19 = MonkeyPuzzle2.field_F ? 1 : 0;
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            try {
              if ((long)(param0 * 6 + 6) > this.field_d.c((byte) -72)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_d.a((byte) 116, (long)(6 * param0));
              this.field_d.a(od.field_m, 6, 0, (byte) 41);
              var4_int = (255 & od.field_m[2]) + ((255 & od.field_m[1]) << 8) + (16711680 & od.field_m[0] << 16);
              var5 = (16711680 & od.field_m[3] << 16) + ((od.field_m[4] & 255) << 8) + (od.field_m[5] & 255);
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
              if ((long)var5 > this.field_f.c((byte) -107) / 520L) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var9 = 61 % ((param1 - 41) / 50);
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  return null;
                }
                this.field_f.a((byte) 121, (long)(var5 * 520));
                var10 = var4_int - var7;
                if (65535 >= param0) {
                  if (var10 > 512) {
                    var10 = 512;
                  }
                  var15 = 8;
                  this.field_f.a(od.field_m, var10 + var15, 0, (byte) 93);
                  var14 = 255 & od.field_m[7];
                  var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 8);
                  var11 = (od.field_m[0] << 8 & 65280) + (od.field_m[1] & 255);
                  var13 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 16) + (65280 & od.field_m[5] << 8);
                } else {
                  if (var10 > 510) {
                    var10 = 510;
                  }
                  var15 = 10;
                  this.field_f.a(od.field_m, var15 + var10, 0, (byte) 123);
                  var14 = od.field_m[9] & 255;
                  var12 = ((255 & od.field_m[4]) << 8) + (od.field_m[5] & 255);
                  var13 = (255 & od.field_m[8]) + (((255 & od.field_m[6]) << 16) + (65280 & od.field_m[7] << 8));
                  var11 = (od.field_m[3] & 255) + (od.field_m[2] << 8 & 65280) + ((od.field_m[1] & 255) << 16) + (-16777216 & od.field_m[0] << 24);
                }
                if (var11 != param0) {
                  return null;
                }
                if (var12 != var8) {
                  return null;
                }
                if (this.field_a != var14) {
                  stackIn_36_0 = null;
                  return (byte[]) (stackIn_36_0);
                }
                if (var13 < 0) {
                  return null;
                }
                if ((long)var13 > this.field_f.c((byte) -120) / 520L) {
                  return null;
                }
                var16 = var15 + var10;
                for (var17 = var15; var17 < var16; var17++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = od.field_m[var17];
                }
                var8++;
                var5 = var13;
              }
              stackIn_49_0 = var6;
              return stackIn_49_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_52_0 = null;
              return (byte[]) (stackIn_52_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -4435) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
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
          var5 = this.field_f;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_e) {
              var6 = this.a(param3, param1, false, param2, true) ? 1 : 0;
              if (param0 != 5) {
                this.field_a = -112;
              }
              if (var6 == 0) {
                var6 = this.a(param3, param1, false, param2, false) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("gf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, boolean param4) {
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
          var16 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param4) {
                  if ((long)(6 + param1 * 6) > this.field_d.c((byte) -104)) {
                    return false;
                  }
                  this.field_d.a((byte) 118, (long)(param1 * 6));
                  this.field_d.a(od.field_m, 6, 0, (byte) 65);
                  var7_int = (od.field_m[4] << 8 & 65280) + (((255 & od.field_m[3]) << 16) + (255 & od.field_m[5]));
                  if (0 >= var7_int ||
                    !(this.field_f.c((byte) -111) / 520L >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_f.c((byte) -128) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                od.field_m[3] = (byte)(var7_int >> 16);
                od.field_m[4] = (byte)(var7_int >> 8);
                od.field_m[0] = (byte)(param3 >> 16);
                if (param2) {
                  this.field_e = -65;
                }
                od.field_m[2] = (byte)param3;
                od.field_m[1] = (byte)(param3 >> 8);
                od.field_m[5] = (byte)var7_int;
                this.field_d.a((byte) 91, (long)(param1 * 6));
                this.field_d.a(od.field_m, 0, (byte) 44, 6);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param3 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_f.a((byte) 123, (long)(520 * var7_int));
                      if (param1 <= 65535) {
                        try {
                          this.field_f.a(od.field_m, 8, 0, (byte) 27);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 8);
                        var11 = (65280 & od.field_m[0] << 8) + (255 & od.field_m[1]);
                        var13 = 255 & od.field_m[7];
                        var10 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 16) + (od.field_m[5] << 8 & 65280);
                      } else {
                        try {
                          this.field_f.a(od.field_m, 10, 0, (byte) 121);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var12 = (od.field_m[5] & 255) + ((od.field_m[4] & 255) << 8);
                        var13 = 255 & od.field_m[9];
                        var11 = (65280 & od.field_m[2] << 8) + (od.field_m[0] << 24 & -16777216) - (-(16711680 & od.field_m[1] << 16) - (od.field_m[3] & 255));
                        var10 = (od.field_m[8] & 255) + ((od.field_m[7] << 8 & 65280) + (od.field_m[6] << 16 & 16711680));
                      }
                      if ((var11 == param1 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_f.c((byte) -98) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      param4 = false;
                      var10 = (int)((this.field_f.c((byte) -69) + 519L) / 520L);
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
                    if (65535 < param1) {
                      od.field_m[9] = (byte)this.field_a;
                      od.field_m[7] = (byte)(var10 >> 8);
                      od.field_m[2] = (byte)(param1 >> 8);
                      od.field_m[1] = (byte)(param1 >> 16);
                      od.field_m[0] = (byte)(param1 >> 24);
                      od.field_m[3] = (byte)param1;
                      od.field_m[6] = (byte)(var10 >> 16);
                      od.field_m[4] = (byte)(var9 >> 8);
                      od.field_m[8] = (byte)var10;
                      od.field_m[5] = (byte)var9;
                      this.field_f.a((byte) 86, (long)(var7_int * 520));
                      this.field_f.a(od.field_m, 0, (byte) 112, 10);
                      var11 = param3 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_f.a(param0, var8, (byte) 100, var11);
                      var8 = var8 + var11;
                    } else {
                      od.field_m[4] = (byte)(var10 >> 16);
                      od.field_m[2] = (byte)(var9 >> 8);
                      od.field_m[1] = (byte)param1;
                      od.field_m[7] = (byte)this.field_a;
                      od.field_m[5] = (byte)(var10 >> 8);
                      od.field_m[6] = (byte)var10;
                      od.field_m[0] = (byte)(param1 >> 8);
                      od.field_m[3] = (byte)var9;
                      this.field_f.a((byte) 118, (long)(var7_int * 520));
                      this.field_f.a(od.field_m, 0, (byte) 122, 8);
                      var11 = param3 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_f.a(param0, var8, (byte) 100, var11);
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
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("gf.D(");
            if (param0 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    gf(int param0, ch param1, ch param2, int param3) {
        this.field_d = null;
        this.field_f = null;
        this.field_e = 65000;
        try {
          this.field_f = param1;
          this.field_a = param0;
          this.field_e = param3;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
