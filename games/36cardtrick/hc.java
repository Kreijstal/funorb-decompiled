/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    private tk field_g;
    static int field_f;
    static fe field_h;
    private int field_i;
    static String field_a;
    private tk field_d;
    private int field_c;
    static nc field_b;
    static String field_e;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Main.field_T;
        try {
          if (bk.field_c != null) {
            return;
          }
          bk.field_c = new String[22];
          bk.field_c[3] = td.field_a;
          bk.field_c[0] = tj.field_J;
          bk.field_c[5] = field_e;
          bk.field_c[15] = bl.field_g;
          bk.field_c[12] = ii.field_f;
          bk.field_c[9] = field_a;
          bk.field_c[13] = dd.field_e;
          bk.field_c[1] = sg.field_e;
          bk.field_c[14] = gg.field_c;
          bk.field_c[16] = q.field_f;
          bk.field_c[17] = db.field_b;
          bk.field_c[10] = tf.field_m;
          if (!param0) {
            return;
          }
          bk.field_c[2] = rf.field_e;
          bk.field_c[4] = lf.field_d;
          bk.field_c[11] = Main.field_y;
          bk.field_c[8] = pg.field_b;
          bk.field_c[7] = id.field_f;
          bk.field_c[6] = n.field_D;
          bk.field_c[20] = jk.field_d[2];
          bk.field_c[19] = jk.field_d[1];
          bk.field_c[21] = n.field_D;
          bk.field_c[18] = jk.field_d[0];
          for (var1_int = 0; bk.field_c.length > var1_int; var1_int++) {
            bk.field_c[var1_int] = bk.field_c[var1_int].toUpperCase();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "hc.B(" + param0 + ')');
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5_ref = this.field_d;
          synchronized (var5_ref) {
            if (0 <= param2 &&
              param2 <= this.field_i) {
              if (param1 < 51) {
                return false;
              }
              var6 = this.a(true, param0, param3, param2, (byte) 2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(false, param0, param3, param2, (byte) 2) ? 1 : 0;
              }
              stackIn_11_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var5_ref2;
          stackIn_16_1 = new StringBuilder().append("hc.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static wb[] a(int param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        wb[] var1 = new wb[cf.field_c];
        for (var2 = 0; var2 < cf.field_c; var2++) {
          var1[var2] = new wb(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], rd.field_k[var2], jf.field_i);
        }
        rh.d(param0 ^ -3343315);
        if (param0 != 3343272) {
          return (wb[]) null;
        }
        return var1;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -127) {
            var3 = (String) null;
            hc.a((String) null, (byte) 7);
          }
          stackIn_3_0 = gk.field_d.a((byte) 7, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hc.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(byte param0, int param1) {
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
          byte[] stackIn_7_0 = null;
          Object stackIn_19_0 = null;
          Object stackIn_25_0 = null;
          Object stackIn_48_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Main.field_T;
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + 6 * param1) > this.field_g.b((byte) -95)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_g.a((long)(param1 * 6), 79);
              this.field_g.a((byte) -118, fb.field_e, 0, 6);
              if (param0 != 19) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              var4_int = (255 & fb.field_e[2]) + (((fb.field_e[0] & 255) << 16) + (fb.field_e[1] << 8 & 65280));
              var5 = (255 & fb.field_e[5]) + ((255 & fb.field_e[3]) << 16) + ((255 & fb.field_e[4]) << 8);
              if (var4_int < 0) {
                return null;
              }
              if (this.field_i < var4_int) {
                return null;
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > (this.field_d.b((byte) -95) / 520L)) {
                stackIn_19_0 = null;
                return (byte[]) (stackIn_19_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                this.field_d.a((long)(520 * var5), 55);
                var9 = var4_int - var7;
                if (param1 <= 65535) {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_d.a((byte) -118, fb.field_e, 0, var14 + var9);
                  var12 = ((fb.field_e[4] & 255) << 16) + ((255 & fb.field_e[5]) << 8) + (fb.field_e[6] & 255);
                  var11 = (fb.field_e[2] << 8 & 65280) + (fb.field_e[3] & 255);
                  var13 = fb.field_e[7] & 255;
                  var10 = (fb.field_e[1] & 255) + ((255 & fb.field_e[0]) << 8);
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_d.a((byte) -118, fb.field_e, 0, var9 + var14);
                  var10 = (255 & fb.field_e[3]) + ((fb.field_e[0] & 255) << 24) - (-((fb.field_e[1] & 255) << 16) - (65280 & fb.field_e[2] << 8));
                  var13 = fb.field_e[9] & 255;
                  var12 = (16711680 & fb.field_e[6] << 16) + ((fb.field_e[7] << 8 & 65280) + (fb.field_e[8] & 255));
                  var11 = (255 & fb.field_e[5]) + (65280 & fb.field_e[4] << 8);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_c) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_d.b((byte) -95) / 520L) {
                  stackIn_48_0 = null;
                  return (byte[]) (stackIn_48_0);
                }
                var15 = var14 + var9;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = fb.field_e[var16];
                }
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

    public final String toString() {
        return "" + this.field_c;
    }

    hc(int param0, tk param1, tk param2, int param3) {
        this.field_g = null;
        this.field_d = null;
        this.field_i = 65000;
        try {
          this.field_c = param0;
          this.field_g = param2;
          this.field_i = param3;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_a = (String) null;
        }
        field_a = null;
        field_h = null;
        field_b = null;
        field_e = null;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, byte param4) {
        try {
          RuntimeException stackIn_74_0 = null;
          StringBuilder stackIn_74_1 = null;
          String stackIn_75_2 = null;
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
          var16 = Main.field_T;
          try {
            var6 = this.field_d;
            synchronized (var6) {
              try {
                if (param0) {
                  if (this.field_g.b((byte) -95) < (long)(6 + param2 * 6)) {
                    return false;
                  }
                  this.field_g.a((long)(param2 * 6), -65);
                  this.field_g.a((byte) -118, fb.field_e, 0, 6);
                  var7_int = (fb.field_e[3] << 16 & 16711680) + ((255 & fb.field_e[4]) << 8) + (255 & fb.field_e[5]);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_d.b((byte) -95) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_d.b((byte) -95) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                fb.field_e[2] = (byte)param3;
                fb.field_e[5] = (byte)var7_int;
                fb.field_e[1] = (byte)(param3 >> 8);
                fb.field_e[0] = (byte)(param3 >> 16);
                fb.field_e[3] = (byte)(var7_int >> 16);
                fb.field_e[4] = (byte)(var7_int >> 8);
                this.field_g.a((long)(6 * param2), -76);
                this.field_g.a(fb.field_e, 0, 6, -1);
                if (param4 != 2) {
                  return false;
                }
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param3 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param0) {
                      this.field_d.a((long)(var7_int * 520), -98);
                      if (param2 > 65535) {
                        try {
                          this.field_d.a((byte) -118, fb.field_e, 0, 10);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var10 = (16711680 & fb.field_e[6] << 16) + (fb.field_e[7] << 8 & 65280) + (fb.field_e[8] & 255);
                        var13 = 255 & fb.field_e[9];
                        var12 = (fb.field_e[5] & 255) + ((fb.field_e[4] & 255) << 8);
                        var11 = ((255 & fb.field_e[1]) << 16) + ((255 & fb.field_e[0]) << 24) - (-(fb.field_e[2] << 8 & 65280) - (fb.field_e[3] & 255));
                      } else {
                        try {
                          this.field_d.a((byte) -118, fb.field_e, 0, 8);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = ((255 & fb.field_e[0]) << 8) + (fb.field_e[1] & 255);
                        var12 = ((255 & fb.field_e[2]) << 8) + (255 & fb.field_e[3]);
                        var13 = fb.field_e[7] & 255;
                        var10 = (fb.field_e[6] & 255) + ((fb.field_e[5] << 8 & 65280) + (16711680 & fb.field_e[4] << 16));
                      }
                      if ((var11 == param2 &&
                        var12 == var9 &&
                        this.field_c == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_d.b((byte) -95) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_d.b((byte) -95) + 519L) / 520L);
                      param0 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (-var8 + param3 <= 512) {
                      var10 = 0;
                    }
                    if (65535 >= param2) {
                      fb.field_e[4] = (byte)(var10 >> 16);
                      fb.field_e[5] = (byte)(var10 >> 8);
                      fb.field_e[3] = (byte)var9;
                      fb.field_e[6] = (byte)var10;
                      fb.field_e[7] = (byte)this.field_c;
                      fb.field_e[1] = (byte)param2;
                      fb.field_e[0] = (byte)(param2 >> 8);
                      fb.field_e[2] = (byte)(var9 >> 8);
                      this.field_d.a((long)(520 * var7_int), 23);
                      this.field_d.a(fb.field_e, 0, 8, param4 ^ -3);
                      var11 = param3 - var8;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_d.a(param1, var8, var11, -1);
                      var8 = var8 + var11;
                    } else {
                      fb.field_e[5] = (byte)var9;
                      fb.field_e[2] = (byte)(param2 >> 8);
                      fb.field_e[9] = (byte)this.field_c;
                      fb.field_e[3] = (byte)param2;
                      fb.field_e[1] = (byte)(param2 >> 16);
                      fb.field_e[4] = (byte)(var9 >> 8);
                      fb.field_e[8] = (byte)var10;
                      fb.field_e[7] = (byte)(var10 >> 8);
                      fb.field_e[6] = (byte)(var10 >> 16);
                      fb.field_e[0] = (byte)(param2 >> 24);
                      this.field_d.a((long)(var7_int * 520), 108);
                      this.field_d.a(fb.field_e, 0, 10, -1);
                      var11 = param3 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_d.a(param1, var8, var11, -1);
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
            stackIn_74_0 = var6_ref;
            stackIn_74_1 = new StringBuilder().append("hc.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_75_2 = "null";
            } else {
              stackIn_75_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Achievements";
        field_f = -1;
        field_h = new fe(2);
        field_b = new nc();
        field_e = "Instructions";
    }
}
