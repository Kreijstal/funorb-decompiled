/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static int field_e;
    private jf field_b;
    private int field_c;
    private int field_a;
    static String field_g;
    static String field_d;
    private jf field_f;

    public final String toString() {
        return "" + this.field_a;
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_11_0 = null;
          Object stackIn_23_0 = null;
          Object stackIn_40_0 = null;
          byte[] stackIn_53_0 = null;
          Object stackIn_56_0 = null;
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
          byte[] var19 = null;
          var18 = Bounce.field_N;
          var3 = this.field_b;
          synchronized (var3) {
            try {
              if ((long)(param1 * 6 + 6) > this.field_f.c(true)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_f.a((byte) 57, (long)(param1 * 6));
              this.field_f.b(0, fk.field_c, 6, 11842);
              if (param0 < 98) {
                var19 = (byte[]) null;
                this.a(117, (byte) -44, 30, (byte[]) null);
              }
              var4_int = ((255 & fk.field_c[0]) << 16) + ((fk.field_c[1] & 255) << 8) + (255 & fk.field_c[2]);
              var5 = ((fk.field_c[4] & 255) << 8) + ((fk.field_c[3] << 16 & 16711680) + (255 & fk.field_c[5]));
              if (0 > var4_int) {
                return null;
              }
              if (this.field_c < var4_int) {
                stackIn_11_0 = null;
                return (byte[]) (stackIn_11_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_b.c(true) / 520L) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var7 >= var4_int) {
                  stackIn_53_0 = var6;
                  return stackIn_53_0;
                }
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_b.a((byte) 57, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_b.b(0, fk.field_c, var9 + var14, 11842);
                  var12 = (fk.field_c[5] << 8 & 65280) + (((fk.field_c[4] & 255) << 16) + (255 & fk.field_c[6]));
                  var10 = (fk.field_c[1] & 255) + (65280 & fk.field_c[0] << 8);
                  var13 = 255 & fk.field_c[7];
                  var11 = ((255 & fk.field_c[2]) << 8) + (fk.field_c[3] & 255);
                } else {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_b.b(0, fk.field_c, var14 + var9, 11842);
                  var11 = (65280 & fk.field_c[4] << 8) + (fk.field_c[5] & 255);
                  var12 = (fk.field_c[8] & 255) + ((255 & fk.field_c[6]) << 16) + (fk.field_c[7] << 8 & 65280);
                  var13 = 255 & fk.field_c[9];
                  var10 = (65280 & fk.field_c[2] << 8) + ((255 & fk.field_c[1]) << 16) + ((fk.field_c[0] << 24 & -16777216) + (fk.field_c[3] & 255));
                }
                if (var10 != param1) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_a != var13) {
                  stackIn_40_0 = null;
                  return (byte[]) (stackIn_40_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((this.field_b.c(true) / 520L) < (long)var12) {
                  return null;
                }
                var15 = var9 + var14;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = fk.field_c[var16];
                }
                var8++;
                var5 = var12;
              }
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

    final boolean a(int param0, byte param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_b;
          synchronized (var5) {
            if (param0 >= 0 &&
              param0 <= this.field_c) {
              var6 = this.a(0, param3, param0, true, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(0, param3, param0, false, param2) ? 1 : 0;
              }
              var7 = -102 % ((param1 - 59) / 45);
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
          stackIn_14_1 = new StringBuilder().append("vh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_e = -88;
          }
          if (param0) {
            stackIn_6_0 = jc.field_h.b(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = ba.field_E.b(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
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
          var16 = Bounce.field_N;
          try {
            var6 = this.field_b;
            synchronized (var6) {
              try {
                if (param3) {
                  if ((long)(param4 * 6 + 6) > this.field_f.c(true)) {
                    return false;
                  }
                  this.field_f.a((byte) 57, (long)(6 * param4));
                  this.field_f.b(0, fk.field_c, 6, param0 + 11842);
                  var7_int = (16711680 & fk.field_c[3] << 16) + ((65280 & fk.field_c[4] << 8) + (255 & fk.field_c[5]));
                  if (var7_int <= 0 ||
                    !((this.field_b.c(true) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_b.c(true) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                fk.field_c[3] = (byte)(var7_int >> 16);
                fk.field_c[2] = (byte)param2;
                fk.field_c[4] = (byte)(var7_int >> 8);
                fk.field_c[1] = (byte)(param2 >> 8);
                fk.field_c[0] = (byte)(param2 >> 16);
                fk.field_c[5] = (byte)var7_int;
                this.field_f.a((byte) 57, (long)(param4 * 6));
                this.field_f.a(0, fk.field_c, 6, 0);
                var8 = 0;
                var9 = param0;
                L3: while (true) {
                  if (var8 < param2) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_b.a((byte) 57, (long)(var7_int * 520));
                      if (param4 > 65535) {
                        try {
                          this.field_b.b(0, fk.field_c, 10, 11842);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var13 = 255 & fk.field_c[9];
                        var12 = (fk.field_c[5] & 255) + ((fk.field_c[4] & 255) << 8);
                        var11 = ((fk.field_c[2] & 255) << 8) + (-16777216 & fk.field_c[0] << 24) + (((255 & fk.field_c[1]) << 16) + (255 & fk.field_c[3]));
                        var10 = ((255 & fk.field_c[6]) << 16) + (65280 & fk.field_c[7] << 8) + (255 & fk.field_c[8]);
                      } else {
                        try {
                          this.field_b.b(0, fk.field_c, 8, 11842);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var10 = (fk.field_c[5] << 8 & 65280) + (fk.field_c[4] << 16 & 16711680) + (255 & fk.field_c[6]);
                        var12 = ((fk.field_c[2] & 255) << 8) + (fk.field_c[3] & 255);
                        var11 = (65280 & fk.field_c[0] << 8) + (255 & fk.field_c[1]);
                        var13 = 255 & fk.field_c[7];
                      }
                      if ((var11 == param4 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((this.field_b.c(true) / 520L) >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param3 = false;
                      var10 = (int)((this.field_b.c(true) + 519L) / 520L);
                      if (0 == var10) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param2 <= 512) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      fk.field_c[4] = (byte)(var9 >> 8);
                      fk.field_c[7] = (byte)(var10 >> 8);
                      fk.field_c[3] = (byte)param4;
                      fk.field_c[9] = (byte)this.field_a;
                      fk.field_c[0] = (byte)(param4 >> 24);
                      fk.field_c[1] = (byte)(param4 >> 16);
                      fk.field_c[2] = (byte)(param4 >> 8);
                      fk.field_c[8] = (byte)var10;
                      fk.field_c[6] = (byte)(var10 >> 16);
                      fk.field_c[5] = (byte)var9;
                      this.field_b.a((byte) 57, (long)(520 * var7_int));
                      this.field_b.a(param0 ^ 0, fk.field_c, 10, 0);
                      var11 = param2 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_b.a(0, param1, var11, var8);
                      var8 = var8 + var11;
                    } else {
                      fk.field_c[7] = (byte)this.field_a;
                      fk.field_c[0] = (byte)(param4 >> 8);
                      fk.field_c[4] = (byte)(var10 >> 16);
                      fk.field_c[1] = (byte)param4;
                      fk.field_c[2] = (byte)(var9 >> 8);
                      fk.field_c[3] = (byte)var9;
                      fk.field_c[5] = (byte)(var10 >> 8);
                      fk.field_c[6] = (byte)var10;
                      this.field_b.a((byte) 57, (long)(var7_int * 520));
                      this.field_b.a(param0 ^ 0, fk.field_c, 8, 0);
                      var11 = param2 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_b.a(0, param1, var11, var8);
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
            stackIn_71_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != 11826) {
          field_e = -24;
        }
        field_d = null;
        field_g = null;
    }

    final static tg[] a(gk param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        tg[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 122 % ((param2 - 59) / 46);
          var4_int = param0.a(param1, false);
          var5 = param0.a(var4_int, param3, 95);
          stackIn_1_0 = kf.a(var4_int, var5, param0, false);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("vh.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 32459) {
          vh.a(-44, (byte) -81);
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != 88) {
          field_e = 93;
        }
        if (param0 == -1) {
          return true;
        }
        return (1 << param0 & ck.field_a) != 0 ? true : false;
    }

    vh(int param0, jf param1, jf param2, int param3) {
        this.field_b = null;
        this.field_c = 65000;
        this.field_f = null;
        try {
          this.field_a = param0;
          this.field_f = param2;
          this.field_c = param3;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = 0;
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
