/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    static String field_h;
    private int field_n;
    static int[] field_m;
    private int field_k;
    private sd field_e;
    static int[] field_d;
    static ll field_j;
    static boolean field_g;
    static String field_i;
    static String field_a;
    static kc field_b;
    static int field_f;
    private sd field_c;
    static kc field_l;

    final boolean a(byte[] param0, boolean param1, int param2, int param3) {
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
          var5 = this.field_c;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_n) {
              var6 = this.a(param3, param1, param2, (byte) -114, param0) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param3, false, param2, (byte) -114, param0) ? 1 : 0;
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
          stackIn_13_1 = new StringBuilder().append("be.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
          byte[] var19 = null;
          Object stackIn_3_0 = null;
          Object stackIn_17_0 = null;
          Object stackIn_38_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = ArcanistsMulti.field_G ? 1 : 0;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if (this.field_e.b((byte) -30) < (long)(6 + param0 * 6)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_e.a((long)(6 * param0), -116);
              if (param1 >= -56) {
                var19 = (byte[]) null;
                this.a((byte[]) null, true, -34, -67);
              }
              this.field_e.a(6, ae.field_c, (byte) -39, 0);
              var4_int = (255 & ae.field_c[2]) + (16711680 & ae.field_c[0] << 16) + ((ae.field_c[1] & 255) << 8);
              var5 = (255 & ae.field_c[5]) + (((255 & ae.field_c[3]) << 16) + ((ae.field_c[4] & 255) << 8));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_n) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_c.b((byte) -30) / 520L) < (long)var5) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (0 == var5) {
                  return null;
                }
                this.field_c.a((long)(520 * var5), -86);
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_c.a(var9 + var14, ae.field_c, (byte) -39, 0);
                  var10 = (ae.field_c[3] & 255) + (((ae.field_c[0] & 255) << 24) - (-(ae.field_c[1] << 16 & 16711680) - (ae.field_c[2] << 8 & 65280)));
                  var13 = ae.field_c[9] & 255;
                  var11 = ((ae.field_c[4] & 255) << 8) + (ae.field_c[5] & 255);
                  var12 = (ae.field_c[7] << 8 & 65280) + ((ae.field_c[6] << 16 & 16711680) + (255 & ae.field_c[8]));
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_c.a(var14 + var9, ae.field_c, (byte) -39, 0);
                  var12 = (ae.field_c[5] << 8 & 65280) + (((255 & ae.field_c[4]) << 16) + (ae.field_c[6] & 255));
                  var10 = (ae.field_c[1] & 255) + (65280 & ae.field_c[0] << 8);
                  var11 = (255 & ae.field_c[3]) + ((ae.field_c[2] & 255) << 8);
                  var13 = ae.field_c[7] & 255;
                }
                if (param0 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_k != var13) {
                  stackIn_38_0 = null;
                  return (byte[]) (stackIn_38_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_c.b((byte) -30) / 520L < (long)var12) {
                  return null;
                }
                var15 = var14 + var9;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ae.field_c[var16];
                }
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

    public final String toString() {
        return "" + this.field_k;
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_h = null;
        field_b = null;
        field_l = null;
        field_d = null;
        int var1 = 6 % ((param0 - 5) / 37);
        field_m = null;
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 1497225488) {
          return -32;
        }
        return hg.field_b;
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
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              if (param3 >= -73) {
                this.field_e = (sd) null;
              }
              try {
                if (param1) {
                  if (this.field_e.b((byte) -30) < (long)(6 * param0 + 6)) {
                    return false;
                  }
                  this.field_e.a((long)(6 * param0), -111);
                  this.field_e.a(6, ae.field_c, (byte) -39, 0);
                  var7_int = (ae.field_c[5] & 255) + (((ae.field_c[3] & 255) << 16) + (65280 & ae.field_c[4] << 8));
                  if (var7_int <= 0 ||
                    !(this.field_c.b((byte) -30) / 520L >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_c.b((byte) -30) + 519L) / 520L);
                  if (0 == var7_int) {
                    var7_int = 1;
                  }
                }
                ae.field_c[0] = (byte)(param2 >> 16);
                ae.field_c[3] = (byte)(var7_int >> 16);
                ae.field_c[1] = (byte)(param2 >> 8);
                ae.field_c[4] = (byte)(var7_int >> 8);
                ae.field_c[5] = (byte)var7_int;
                ae.field_c[2] = (byte)param2;
                this.field_e.a((long)(param0 * 6), -104);
                this.field_e.a((byte) -53, 0, ae.field_c, 6);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param2 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_c.a((long)(520 * var7_int), -88);
                      if (param0 > 65535) {
                        try {
                          this.field_c.a(10, ae.field_c, (byte) -39, 0);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var12 = (255 & ae.field_c[5]) + (ae.field_c[4] << 8 & 65280);
                        var10 = (65280 & ae.field_c[7] << 8) + ((255 & ae.field_c[6]) << 16) + (ae.field_c[8] & 255);
                        var11 = (ae.field_c[3] & 255) + ((-16777216 & ae.field_c[0] << 24) - (-((255 & ae.field_c[1]) << 16) - ((ae.field_c[2] & 255) << 8)));
                        var13 = 255 & ae.field_c[9];
                      } else {
                        try {
                          this.field_c.a(8, ae.field_c, (byte) -39, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = (65280 & ae.field_c[5] << 8) + (((255 & ae.field_c[4]) << 16) + (255 & ae.field_c[6]));
                        var11 = (ae.field_c[1] & 255) + ((255 & ae.field_c[0]) << 8);
                        var13 = 255 & ae.field_c[7];
                        var12 = (255 & ae.field_c[3]) + ((255 & ae.field_c[2]) << 8);
                      }
                      if ((var11 == param0 &&
                        var12 == var9 &&
                        var13 == this.field_k) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_c.b((byte) -30) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_c.b((byte) -30)) / 520L);
                      param1 = false;
                      if (0 == var10) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (512 >= param2 - var8) {
                      var10 = 0;
                    }
                    if (param0 <= 65535) {
                      ae.field_c[6] = (byte)var10;
                      ae.field_c[5] = (byte)(var10 >> 8);
                      ae.field_c[3] = (byte)var9;
                      ae.field_c[0] = (byte)(param0 >> 8);
                      ae.field_c[4] = (byte)(var10 >> 16);
                      ae.field_c[2] = (byte)(var9 >> 8);
                      ae.field_c[7] = (byte)this.field_k;
                      ae.field_c[1] = (byte)param0;
                      this.field_c.a((long)(520 * var7_int), -112);
                      this.field_c.a((byte) -53, 0, ae.field_c, 8);
                      var11 = -var8 + param2;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.a((byte) -53, var8, param4, var11);
                      var8 = var8 + var11;
                    } else {
                      ae.field_c[7] = (byte)(var10 >> 8);
                      ae.field_c[6] = (byte)(var10 >> 16);
                      ae.field_c[0] = (byte)(param0 >> 24);
                      ae.field_c[4] = (byte)(var9 >> 8);
                      ae.field_c[3] = (byte)param0;
                      ae.field_c[2] = (byte)(param0 >> 8);
                      ae.field_c[9] = (byte)this.field_k;
                      ae.field_c[5] = (byte)var9;
                      ae.field_c[1] = (byte)(param0 >> 16);
                      ae.field_c[8] = (byte)var10;
                      this.field_c.a((long)(var7_int * 520), -88);
                      this.field_c.a((byte) -53, 0, ae.field_c, 10);
                      var11 = -var8 + param2;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a((byte) -53, var8, param4, var11);
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
            stackIn_71_1 = new StringBuilder().append("be.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, vd param1, String param2, dj param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param4 != 35) {
            return;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = param1.field_f[0] + (var5_int >> 8) + param3.b(param2.substring(0, var7));
            }
            if (var6 != -1) {
              param1.field_f[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param0;
              }
              param1.field_f[var7] = (var5_int >> 8) + param1.field_f[0] - (-param3.b(param2.substring(0, var7 + 1)) + param3.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("be.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1) {
            be.a(-40);
          }
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              90 >= var6) {
              var2_long = var2_long + (long)(-65 + (var6 + 1));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(var6 + 1 - 97);
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("be.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    be(int param0, sd param1, sd param2, int param3) {
        this.field_e = null;
        this.field_n = 65000;
        this.field_c = null;
        try {
          this.field_n = param3;
          this.field_c = param1;
          this.field_k = param0;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "be.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = "MOST SKILLFUL - ";
        field_m = new int[8192];
        field_h = "Only two targets left! You have no control over the direction that the attack comes in at, so be careful if you are too close.";
        field_i = "Elements Expansion";
        field_f = 0;
    }
}
