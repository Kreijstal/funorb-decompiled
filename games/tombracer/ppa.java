/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ppa {
    private int field_d;
    private ph field_c;
    private int field_e;
    private ph field_b;
    static String field_a;

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
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
          var5 = this.field_c;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_e) {
              var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, param2, param1, true, param0) ? 1 : 0;
              }
              if (param3 < 112) {
                this.field_d = -66;
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
          stackIn_16_1 = new StringBuilder().append("ppa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1551894744) {
          field_a = (String) null;
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var17 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          int var5 = 0;
          int var6 = 0;
          byte[] var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var16 = 0;
          int var19 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_37_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var19 = TombRacer.field_G ? 1 : 0;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if (this.field_b.b(true) < (long)(6 + 6 * param0)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_b.a((byte) 20, (long)(6 * param0));
              this.field_b.a(wfa.field_F, 6, 0, (byte) -64);
              var6 = -2 / ((param1 + 40) / 57);
              var4_int = (255 & wfa.field_F[2]) + (((255 & wfa.field_F[1]) << 8) + (wfa.field_F[0] << 16 & 16711680));
              var5 = (16711680 & wfa.field_F[3] << 16) - (-((wfa.field_F[4] & 255) << 8) - (wfa.field_F[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_c.b(true) / 520L) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var7 = new byte[var4_int];
              var8 = 0;
              var9 = 0;
              while (var8 < var4_int) {
                if (0 == var5) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_c.a((byte) 67, (long)(520 * var5));
                var10 = var4_int - var8;
                if (65535 < param0) {
                  var15 = 10;
                  if (510 < var10) {
                    var10 = 510;
                  }
                  this.field_c.a(wfa.field_F, var10 + var15, 0, (byte) -28);
                  var12 = (255 & wfa.field_F[5]) + (wfa.field_F[4] << 8 & 65280);
                  var13 = ((255 & wfa.field_F[6]) << 16) + ((65280 & wfa.field_F[7] << 8) + (wfa.field_F[8] & 255));
                  var11 = (16711680 & wfa.field_F[1] << 16) + (-16777216 & wfa.field_F[0] << 24) - (-(wfa.field_F[2] << 8 & 65280) - (255 & wfa.field_F[3]));
                  var14 = wfa.field_F[9] & 255;
                } else {
                  if (var10 > 512) {
                    var10 = 512;
                  }
                  var15 = 8;
                  this.field_c.a(wfa.field_F, var15 + var10, 0, (byte) -30);
                  var12 = ((wfa.field_F[2] & 255) << 8) + (wfa.field_F[3] & 255);
                  var14 = 255 & wfa.field_F[7];
                  var13 = (255 & wfa.field_F[6]) + ((255 & wfa.field_F[4]) << 16) + (65280 & wfa.field_F[5] << 8);
                  var11 = (255 & wfa.field_F[1]) + ((wfa.field_F[0] & 255) << 8);
                }
                if (param0 != var11) {
                  return null;
                }
                if (var12 != var9) {
                  return null;
                }
                if (var14 != this.field_d) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (var13 < 0) {
                  return null;
                }
                if ((this.field_c.b(true) / 520L) < (long)var13) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                var16 = var15 + var10;
                var9++;
                var5 = var13;
                for (var17 = var15; var16 > var17; var17++) {
                  incrementValue$2 = var8;
                  var8++;
                  var7[incrementValue$2] = wfa.field_F[var17];
                }
              }
              stackIn_49_0 = var7;
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

    private final boolean a(boolean param0, int param1, byte[] param2, boolean param3, int param4) {
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
          var16 = TombRacer.field_G ? 1 : 0;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (param0) {
                  if (this.field_b.b(true) < (long)(6 * param4 + 6)) {
                    return false;
                  }
                  this.field_b.a((byte) -124, (long)(6 * param4));
                  this.field_b.a(wfa.field_F, 6, 0, (byte) -34);
                  var7_int = (wfa.field_F[3] << 16 & 16711680) + ((255 & wfa.field_F[4]) << 8) + (255 & wfa.field_F[5]);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_c.b(true) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_c.b(true)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                wfa.field_F[5] = (byte)var7_int;
                wfa.field_F[1] = (byte)(param1 >> 8);
                wfa.field_F[0] = (byte)(param1 >> 16);
                wfa.field_F[2] = (byte)param1;
                wfa.field_F[3] = (byte)(var7_int >> 16);
                wfa.field_F[4] = (byte)(var7_int >> 8);
                this.field_b.a((byte) -118, (long)(param4 * 6));
                this.field_b.a(wfa.field_F, 0, (byte) -17, 6);
                if (!param3) {
                  this.a(58, 109);
                }
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_c.a((byte) 91, (long)(var7_int * 520));
                      if (param4 <= 65535) {
                        try {
                          this.field_c.a(wfa.field_F, 8, 0, (byte) -115);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var12 = (255 & wfa.field_F[3]) + ((255 & wfa.field_F[2]) << 8);
                        var11 = (65280 & wfa.field_F[0] << 8) + (wfa.field_F[1] & 255);
                        var10 = (255 & wfa.field_F[6]) + (wfa.field_F[4] << 16 & 16711680) + (wfa.field_F[5] << 8 & 65280);
                        var13 = wfa.field_F[7] & 255;
                      } else {
                        try {
                          this.field_c.a(wfa.field_F, 10, 0, (byte) -33);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var12 = ((255 & wfa.field_F[4]) << 8) + (255 & wfa.field_F[5]);
                        var11 = (wfa.field_F[0] << 24 & -16777216) + ((255 & wfa.field_F[1]) << 16) - (-((255 & wfa.field_F[2]) << 8) - (255 & wfa.field_F[3]));
                        var13 = 255 & wfa.field_F[9];
                        var10 = (255 & wfa.field_F[8]) + (((255 & wfa.field_F[7]) << 8) + ((255 & wfa.field_F[6]) << 16));
                      }
                      if ((var11 == param4 &&
                        var9 == var12 &&
                        this.field_d == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((long)var10 <= this.field_c.b(true) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_c.b(true) + 519L) / 520L);
                      param0 = false;
                      if (0 == var10) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param1 <= 512) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      wfa.field_F[7] = (byte)(var10 >> 8);
                      wfa.field_F[5] = (byte)var9;
                      wfa.field_F[1] = (byte)(param4 >> 16);
                      wfa.field_F[3] = (byte)param4;
                      wfa.field_F[0] = (byte)(param4 >> 24);
                      wfa.field_F[6] = (byte)(var10 >> 16);
                      wfa.field_F[4] = (byte)(var9 >> 8);
                      wfa.field_F[9] = (byte)this.field_d;
                      wfa.field_F[8] = (byte)var10;
                      wfa.field_F[2] = (byte)(param4 >> 8);
                      this.field_c.a((byte) 36, (long)(520 * var7_int));
                      this.field_c.a(wfa.field_F, 0, (byte) -17, 10);
                      var11 = param1 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a(param2, var8, (byte) -17, var11);
                      var8 = var8 + var11;
                    } else {
                      wfa.field_F[4] = (byte)(var10 >> 16);
                      wfa.field_F[2] = (byte)(var9 >> 8);
                      wfa.field_F[6] = (byte)var10;
                      wfa.field_F[3] = (byte)var9;
                      wfa.field_F[0] = (byte)(param4 >> 8);
                      wfa.field_F[5] = (byte)(var10 >> 8);
                      wfa.field_F[1] = (byte)param4;
                      wfa.field_F[7] = (byte)this.field_d;
                      this.field_c.a((byte) -109, (long)(var7_int * 520));
                      this.field_c.a(wfa.field_F, 0, (byte) -17, 8);
                      var11 = param1 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.a(param2, var8, (byte) -17, var11);
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
            stackIn_70_1 = new StringBuilder().append("ppa.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(la param0, int param1, ff param2) {
        if (vpa.a(112) ||
          param2.k(-25319)) {
          return;
        }
        if (!(param0.q((byte) -82) >= 0)) {
          return;
        }
        try {
          ql.field_k.k(99, -2988);
          ql.field_k.f(-1477662136, param0.q((byte) -82));
          ql.field_k.f(-1477662136, param0.a((byte) 107));
          int var3_int = 79 / ((param1 - 9) / 53);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ppa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "" + this.field_d;
    }

    ppa(int param0, ph param1, ph param2, int param3) {
        this.field_c = null;
        this.field_b = null;
        this.field_e = 65000;
        try {
          this.field_d = param0;
          this.field_c = param1;
          this.field_b = param2;
          this.field_e = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ppa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Username: ";
    }
}
