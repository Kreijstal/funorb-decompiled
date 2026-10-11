/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_f;
    static int[][] field_e;
    private int field_a;
    static boolean field_g;
    private int field_b;
    static byte[] field_d;
    static String field_c;
    private im field_h;
    private im field_i;

    public static void c(int param0) {
        field_e = (int[][]) null;
        field_c = null;
        field_d = null;
        if (param0 <= 46) {
          qh.c(126);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, byte param3) {
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
          var5 = this.field_h;
          synchronized (var5) {
            if (0 <= param0 &&
              this.field_a >= param0) {
              var6 = this.a(true, param2, 255, param1, param0) ? 1 : 0;
              if (param3 != -84) {
                this.a(-6, -73);
              }
              if (var6 == 0) {
                var6 = this.a(false, param2, 255, param1, param0) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("qh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
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
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_23_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Vertigo2.field_L ? 1 : 0;
          var3_ref = this.field_h;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param0 + 6) > this.field_i.c(-1)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_i.a(-23669, (long)(param0 * 6));
              this.field_i.a(-128, 0, lf.field_D, 6);
              var4_int = (255 & lf.field_D[2]) + ((lf.field_D[0] << 16 & 16711680) + (lf.field_D[1] << 8 & 65280));
              var5 = (255 & lf.field_D[5]) + ((16711680 & lf.field_D[3] << 16) + (lf.field_D[4] << 8 & 65280));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_a < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (param1 != 27176) {
                field_g = true;
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > (this.field_h.c(-1) / 520L)) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_h.a(-23669, (long)(var5 * 520));
                var9 = -var7 + var4_int;
                if (param0 <= 65535) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_h.a(-127, 0, lf.field_D, var9 + var14);
                  var12 = (255 & lf.field_D[6]) + (lf.field_D[5] << 8 & 65280) + ((255 & lf.field_D[4]) << 16);
                  var13 = 255 & lf.field_D[7];
                  var10 = (255 & lf.field_D[1]) + ((lf.field_D[0] & 255) << 8);
                  var11 = ((255 & lf.field_D[2]) << 8) + (255 & lf.field_D[3]);
                } else {
                  var14 = 10;
                  if (510 < var9) {
                    var9 = 510;
                  }
                  this.field_h.a(-121, 0, lf.field_D, var9 + var14);
                  var12 = (255 & lf.field_D[8]) + ((255 & lf.field_D[7]) << 8) + (16711680 & lf.field_D[6] << 16);
                  var10 = (255 & lf.field_D[3]) + (lf.field_D[2] << 8 & 65280) + ((lf.field_D[1] << 16 & 16711680) + (-16777216 & lf.field_D[0] << 24));
                  var11 = (255 & lf.field_D[5]) + ((255 & lf.field_D[4]) << 8);
                  var13 = lf.field_D[9] & 255;
                }
                if (param0 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_b != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_h.c(-1) / 520L) {
                  return null;
                }
                var15 = var14 + var9;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = lf.field_D[var16];
                }
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

    final static void a(int param0) {
        if (param0 == -32739) {
          if (ce.field_b != ro.field_g.field_d) {
            tc.field_b = tc.field_b + (ro.field_g.field_d - ce.field_b);
            ce.field_b = ro.field_g.field_d;
          }
          if (!(da.field_i <= 0)) {
            da.field_i = da.field_i - 1;
          }
          if (da.field_i > 0) {
            kg.c((byte) 82);
          }
          return;
        }
    }

    final static int b(int param0) {
        int var1 = 15 / ((-32 - param0) / 63);
        pd.field_c.d(115);
        if (kb.field_e.d(-3599)) {
          return 0;
        }
        return f.g(0);
    }

    final static String d(int param0) {
        if (param0 != 0) {
          field_c = (String) null;
        }
        return lr.field_S;
    }

    public final String toString() {
        return "" + this.field_b;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, int param4) {
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
          var16 = Vertigo2.field_L ? 1 : 0;
          try {
            var6 = this.field_h;
            synchronized (var6) {
              try {
                if (param2 != 255) {
                  field_f = false;
                }
                if (param0) {
                  if ((long)(6 + param3 * 6) > this.field_i.c(param2 - 256)) {
                    return false;
                  }
                  this.field_i.a(-23669, (long)(6 * param3));
                  this.field_i.a(-113, 0, lf.field_D, 6);
                  var7_int = (255 & lf.field_D[5]) + (((255 & lf.field_D[4]) << 8) + (16711680 & lf.field_D[3] << 16));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_h.c(-1) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_h.c(param2 ^ -256) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                lf.field_D[1] = (byte)(param4 >> 8);
                lf.field_D[0] = (byte)(param4 >> 16);
                lf.field_D[5] = (byte)var7_int;
                lf.field_D[4] = (byte)(var7_int >> 8);
                lf.field_D[3] = (byte)(var7_int >> 16);
                lf.field_D[2] = (byte)param4;
                this.field_i.a(-23669, (long)(param3 * 6));
                this.field_i.a(param2 - 255, 6, 0, lf.field_D);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (var8 < param4) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_h.a(-23669, (long)(var7_int * 520));
                      if (param3 <= 65535) {
                        try {
                          this.field_h.a(-122, 0, lf.field_D, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var13 = lf.field_D[7] & 255;
                        var11 = (255 & lf.field_D[1]) + (65280 & lf.field_D[0] << 8);
                        var12 = (255 & lf.field_D[3]) + ((255 & lf.field_D[2]) << 8);
                        var10 = ((lf.field_D[5] & 255) << 8) + (((255 & lf.field_D[4]) << 16) + (255 & lf.field_D[6]));
                      } else {
                        try {
                          this.field_h.a(param2 ^ -162, 0, lf.field_D, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var12 = (lf.field_D[5] & 255) + ((lf.field_D[4] & 255) << 8);
                        var13 = lf.field_D[9] & 255;
                        var11 = (255 & lf.field_D[3]) + ((lf.field_D[2] & 255) << 8) + (((lf.field_D[1] & 255) << 16) + ((lf.field_D[0] & 255) << 24));
                        var10 = ((255 & lf.field_D[7]) << 8) + ((16711680 & lf.field_D[6] << 16) + (255 & lf.field_D[8]));
                      }
                      if ((var11 == param3 &&
                        var9 == var12 &&
                        this.field_b == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_h.c(-1) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param0 = false;
                      var10 = (int)((this.field_h.c(-1) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param4 <= 512) {
                      var10 = 0;
                    }
                    if (param3 <= 65535) {
                      lf.field_D[7] = (byte)this.field_b;
                      lf.field_D[5] = (byte)(var10 >> 8);
                      lf.field_D[2] = (byte)(var9 >> 8);
                      lf.field_D[3] = (byte)var9;
                      lf.field_D[4] = (byte)(var10 >> 16);
                      lf.field_D[1] = (byte)param3;
                      lf.field_D[6] = (byte)var10;
                      lf.field_D[0] = (byte)(param3 >> 8);
                      this.field_h.a(-23669, (long)(var7_int * 520));
                      this.field_h.a(param2 - 255, 8, 0, lf.field_D);
                      var11 = param4 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_h.a(0, var11, var8, param1);
                      var8 = var8 + var11;
                    } else {
                      lf.field_D[2] = (byte)(param3 >> 8);
                      lf.field_D[5] = (byte)var9;
                      lf.field_D[3] = (byte)param3;
                      lf.field_D[4] = (byte)(var9 >> 8);
                      lf.field_D[0] = (byte)(param3 >> 24);
                      lf.field_D[9] = (byte)this.field_b;
                      lf.field_D[1] = (byte)(param3 >> 16);
                      lf.field_D[6] = (byte)(var10 >> 16);
                      lf.field_D[8] = (byte)var10;
                      lf.field_D[7] = (byte)(var10 >> 8);
                      this.field_h.a(-23669, (long)(520 * var7_int));
                      this.field_h.a(param2 ^ 255, 10, 0, lf.field_D);
                      var11 = param4 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_h.a(param2 ^ 255, var11, var8, param1);
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
            stackIn_70_0 = var6_ref;
            stackIn_70_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qh(int param0, im param1, im param2, int param3) {
        this.field_h = null;
        this.field_i = null;
        this.field_a = 65000;
        try {
          this.field_i = param2;
          this.field_h = param1;
          this.field_b = param0;
          this.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Level <%0> of <%1>";
    }
}
