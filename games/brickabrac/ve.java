/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ve {
    private jg field_d;
    static String field_e;
    private int field_c;
    private int field_b;
    private jg field_a;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 47) {
          field_e = (String) null;
        }
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5_ref = this.field_d;
          synchronized (var5_ref) {
            if (param2 >= 0 &&
              this.field_b >= param2) {
              if (param0 > -116) {
                return true;
              }
              var6 = this.a(param1, param3, true, true, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param1, param3, false, true, param2) ? 1 : 0;
              }
              stackIn_12_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var5_ref2;
          stackIn_17_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != -21835160) {
          ve.b(-54);
        }
        return LevelSelectScreen.a(qn.field_n, kb.field_Qb, 21);
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (lj.field_j != null) {
          var1 = lj.field_j;
          synchronized (var1) {
            lj.field_j = null;
          }
        }
        if (param0 != 5) {
          field_e = (String) null;
        }
    }

    public final String toString() {
        return "" + this.field_c;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
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
          var16 = BrickABrac.field_J ? 1 : 0;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + param1 * 6) > this.field_a.a((byte) 115)) {
                    return false;
                  }
                  this.field_a.a(0, (long)(param1 * 6));
                  this.field_a.a(6, 0, 120, tf.field_b);
                  var7_int = (255 & tf.field_b[5]) + ((255 & tf.field_b[3]) << 16) + (65280 & tf.field_b[4] << 8);
                  if (0 >= var7_int ||
                    !((long)var7_int <= this.field_d.a((byte) 71) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_d.a((byte) 62)) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                tf.field_b[0] = (byte)(param4 >> 16);
                tf.field_b[4] = (byte)(var7_int >> 8);
                tf.field_b[5] = (byte)var7_int;
                tf.field_b[2] = (byte)param4;
                if (!param3) {
                  ve.a((byte) 8);
                }
                tf.field_b[1] = (byte)(param4 >> 8);
                tf.field_b[3] = (byte)(var7_int >> 16);
                this.field_a.a(0, (long)(param1 * 6));
                this.field_a.a(tf.field_b, 0, 6, -1);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  if (param4 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_d.a(0, (long)(520 * var7_int));
                      if (65535 >= param1) {
                        try {
                          this.field_d.a(8, 0, 121, tf.field_b);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var13 = 255 & tf.field_b[7];
                        var12 = (tf.field_b[2] << 8 & 65280) + (255 & tf.field_b[3]);
                        var10 = ((255 & tf.field_b[5]) << 8) + ((tf.field_b[4] & 255) << 16) + (tf.field_b[6] & 255);
                        var11 = ((255 & tf.field_b[0]) << 8) + (255 & tf.field_b[1]);
                      } else {
                        try {
                          this.field_d.a(10, 0, 119, tf.field_b);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var11 = ((tf.field_b[2] & 255) << 8) + ((16711680 & tf.field_b[1] << 16) + (-16777216 & tf.field_b[0] << 24)) + (tf.field_b[3] & 255);
                        var10 = (255 & tf.field_b[8]) + ((tf.field_b[6] << 16 & 16711680) + (tf.field_b[7] << 8 & 65280));
                        var12 = (255 & tf.field_b[5]) + ((255 & tf.field_b[4]) << 8);
                        var13 = tf.field_b[9] & 255;
                      }
                      if ((param1 == var11 &&
                        var12 == var9 &&
                        this.field_c == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_d.a((byte) 29) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_d.a((byte) 85)) / 520L);
                      param2 = false;
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
                    if (param1 <= 65535) {
                      tf.field_b[6] = (byte)var10;
                      tf.field_b[1] = (byte)param1;
                      tf.field_b[5] = (byte)(var10 >> 8);
                      tf.field_b[0] = (byte)(param1 >> 8);
                      tf.field_b[3] = (byte)var9;
                      tf.field_b[2] = (byte)(var9 >> 8);
                      tf.field_b[7] = (byte)this.field_c;
                      tf.field_b[4] = (byte)(var10 >> 16);
                      this.field_d.a(0, (long)(520 * var7_int));
                      this.field_d.a(tf.field_b, 0, 8, -1);
                      var11 = param4 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_d.a(param0, var8, var11, -1);
                      var8 = var8 + var11;
                    } else {
                      tf.field_b[5] = (byte)var9;
                      tf.field_b[8] = (byte)var10;
                      tf.field_b[1] = (byte)(param1 >> 16);
                      tf.field_b[6] = (byte)(var10 >> 16);
                      tf.field_b[0] = (byte)(param1 >> 24);
                      tf.field_b[9] = (byte)this.field_c;
                      tf.field_b[7] = (byte)(var10 >> 8);
                      tf.field_b[2] = (byte)(param1 >> 8);
                      tf.field_b[3] = (byte)param1;
                      tf.field_b[4] = (byte)(var9 >> 8);
                      this.field_d.a(0, (long)(520 * var7_int));
                      this.field_d.a(tf.field_b, 0, 10, -1);
                      var11 = param4 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_d.a(param0, var8, var11, -1);
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
            stackIn_71_1 = new StringBuilder().append("ve.D(");
            if (param0 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          Object stackIn_3_0 = null;
          Object stackIn_37_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = BrickABrac.field_J ? 1 : 0;
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param1 + 6) > this.field_a.a((byte) 53)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_a.a(0, (long)(param1 * 6));
              this.field_a.a(6, 0, 127, tf.field_b);
              var4_int = (tf.field_b[2] & 255) + ((tf.field_b[1] & 255) << 8) + (16711680 & tf.field_b[0] << 16);
              var5 = (tf.field_b[5] & 255) + (tf.field_b[3] << 16 & 16711680) + ((tf.field_b[4] & 255) << 8);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_b < var4_int) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_d.a((byte) 66) / 520L)) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = param0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_d.a(0, (long)(520 * var5));
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_d.a(var9 + var14, 0, 126, tf.field_b);
                  var10 = ((tf.field_b[0] & 255) << 8) + (tf.field_b[1] & 255);
                  var13 = tf.field_b[7] & 255;
                  var11 = (tf.field_b[3] & 255) + ((tf.field_b[2] & 255) << 8);
                  var12 = ((tf.field_b[4] & 255) << 16) - (-((255 & tf.field_b[5]) << 8) - (tf.field_b[6] & 255));
                } else {
                  var14 = 10;
                  if (510 < var9) {
                    var9 = 510;
                  }
                  this.field_d.a(var14 + var9, 0, param0 ^ 117, tf.field_b);
                  var11 = ((255 & tf.field_b[4]) << 8) + (255 & tf.field_b[5]);
                  var13 = tf.field_b[9] & 255;
                  var12 = ((255 & tf.field_b[7]) << 8) + ((tf.field_b[6] & 255) << 16) + (tf.field_b[8] & 255);
                  var10 = (tf.field_b[3] & 255) + (((tf.field_b[1] & 255) << 16) + (tf.field_b[0] << 24 & -16777216) + (tf.field_b[2] << 8 & 65280));
                }
                if (param1 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_c) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_d.a((byte) 70) / 520L) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                var15 = var14 + var9;
                var8++;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = tf.field_b[var16];
                }
                var5 = var12;
              }
              stackIn_50_0 = var6;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_53_0 = null;
              return (byte[]) (stackIn_53_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ve(int param0, jg param1, jg param2, int param3) {
        this.field_d = null;
        this.field_b = 65000;
        this.field_a = null;
        try {
          this.field_b = param3;
          this.field_c = param0;
          this.field_a = param2;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ve.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "This option cannot be combined with the current settings for:  ";
    }
}
