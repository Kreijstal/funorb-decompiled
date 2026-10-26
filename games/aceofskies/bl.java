/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static int field_c;
    private int field_a;
    private int field_e;
    static String field_g;
    private gh field_f;
    private gh field_d;
    static RenderSprite[] explosionSprites;

    public static void d(int param0) {
        if (param0 >= -121) {
          field_g = (String) null;
        }
        explosionSprites = null;
        field_g = null;
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final static void c(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            if (param0 != -18535) {
              field_g = (String) null;
            }
            if (null != ul.field_r) {
              ul.field_r.b((byte) -108);
            }
            if (ii.field_m != null) {
              ii.field_m.a((byte) -85);
            }
            if (null != eq.field_e) {
              try {
                eq.field_e.a((byte) 106);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != wb.field_i) {
              for (var1_int = 0; wb.field_i.length > var1_int; var1_int++) {
                if (wb.field_i[var1_int] != null) {
                  try {
                    wb.field_i[var1_int].a((byte) 106);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw pn.a((Throwable) ((Object) var1), "bl.A(" + param0 + ')');
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
          Object stackIn_21_0 = null;
          Object stackIn_38_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = AceOfSkies.obfuscationControl ? 1 : 0;
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param0 + 6) > this.field_d.c(param1 ^ -149)) {
                return null;
              }
              this.field_d.a(true, (long)(param0 * 6));
              this.field_d.a(param1 - 255, 6, s.field_i, 0);
              var4_int = (param1 & s.field_i[2]) + ((65280 & s.field_i[1] << 8) + (s.field_i[0] << 16 & 16711680));
              var5 = (255 & s.field_i[5]) + (((255 & s.field_i[3]) << 16) + ((255 & s.field_i[4]) << 8));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_f.c(-93) / 520L < (long)var5) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_f.a(true, (long)(var5 * 520));
                var9 = -var7 + var4_int;
                if (param0 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_f.a(param1 ^ 255, var9 + var14, s.field_i, 0);
                  var11 = (255 & s.field_i[5]) + (65280 & s.field_i[4] << 8);
                  var10 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << 8) + (((255 & s.field_i[0]) << 24) + (s.field_i[1] << 16 & 16711680));
                  var13 = s.field_i[9] & 255;
                  var12 = (255 & s.field_i[8]) + ((s.field_i[6] << 16 & 16711680) + (s.field_i[7] << 8 & 65280));
                } else {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_f.a(0, var14 + var9, s.field_i, 0);
                  var10 = (255 & s.field_i[1]) + ((s.field_i[0] & 255) << 8);
                  var11 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << 8);
                  var13 = s.field_i[7] & 255;
                  var12 = (s.field_i[4] << 16 & 16711680) + (((s.field_i[5] & 255) << 8) + (255 & s.field_i[6]));
                }
                if (param0 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_a) {
                  stackIn_38_0 = null;
                  return (byte[]) (stackIn_38_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_f.c(-92) / 520L) {
                  return null;
                }
                var15 = var9 + var14;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = s.field_i[var16];
                }
                var5 = var12;
                var8++;
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

    final static int a(int param0) {
        if (param0 <= 55) {
          bl.d(54);
        }
        return (int)(1000000000L / ld.field_b);
    }

    bl(int param0, gh param1, gh param2, int param3) {
        this.field_f = null;
        this.field_e = 65000;
        this.field_d = null;
        try {
          this.field_f = param1;
          this.field_e = param3;
          this.field_a = param0;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        byte[] var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param1 != 255) {
            var8 = (byte[]) null;
            this.a(75, 38, -78, (byte[]) null);
          }
          var5 = this.field_f;
          synchronized (var5) {
            if (param0 >= 0 &&
              param0 <= this.field_e) {
              var6 = this.a(param2, param0, true, param3, 2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, param0, false, param3, 2) ? 1 : 0;
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
          stackIn_15_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static ll[] b(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        ll[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        var1 = new ll[to.field_t];
        for (var2 = 0; to.field_t > var2; var2++) {
          var3 = ji.field_b[var2] * ee.field_e[var2];
          var21 = fk.field_a[var2];
          if (!q.field_k[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = ud.field_e[pg.a((int) var21[var6], 255)];
            }
            var1[var2] = new ll(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var22);
          } else {
            var15 = ql.field_p[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = vo.a(pg.a(-16777216, var15[var7] << 24), ud.field_e[pg.a(255, (int) var21[var7])]);
            }
            var1[var2] = (ll) ((Object) new rd(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var17));
          }
        }
        if (param0 > -79) {
          return (ll[]) null;
        }
        kf.f(1);
        return var1;
    }

    final static wp a(byte param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -89) {
            bl.a(63);
          }
          if (tn.a(param2, (byte) -127, param1, param3)) {
            return sq.a(15636);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3, int param4) {
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
          var16 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param2) {
                  if (this.field_d.c(param4 + 79) < (long)(param0 * 6 + 6)) {
                    return false;
                  }
                  this.field_d.a(true, (long)(6 * param0));
                  this.field_d.a(0, 6, s.field_i, 0);
                  var7_int = (255 & s.field_i[5]) + (65280 & s.field_i[4] << 8) + (s.field_i[3] << 16 & 16711680);
                  if (0 >= var7_int ||
                    !((this.field_f.c(116) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_f.c(param4 - 109)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                s.field_i[4] = (byte)(var7_int >> 8);
                s.field_i[0] = (byte)(param1 >> 16);
                s.field_i[1] = (byte)(param1 >> 8);
                s.field_i[3] = (byte)(var7_int >> 16);
                s.field_i[param4] = (byte)param1;
                s.field_i[5] = (byte)var7_int;
                this.field_d.a(true, (long)(6 * param0));
                this.field_d.a(6, s.field_i, 0, 120);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  if (param1 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_f.a(true, (long)(var7_int * 520));
                      if (param0 > 65535) {
                        try {
                          this.field_f.a(0, 10, s.field_i, 0);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var10 = ((s.field_i[6] & 255) << 16) + (((s.field_i[7] & 255) << 8) + (s.field_i[8] & 255));
                        var12 = (s.field_i[4] << 8 & 65280) + (255 & s.field_i[5]);
                        var13 = s.field_i[9] & 255;
                        var11 = (-16777216 & s.field_i[0] << 24) + ((255 & s.field_i[1]) << 16) - (-(s.field_i[2] << 8 & 65280) - (255 & s.field_i[3]));
                      } else {
                        try {
                          this.field_f.a(0, 8, s.field_i, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var12 = (65280 & s.field_i[2] << 8) + (255 & s.field_i[3]);
                        var13 = s.field_i[7] & 255;
                        var10 = (s.field_i[6] & 255) + ((s.field_i[4] & 255) << 16) + (65280 & s.field_i[5] << 8);
                        var11 = (65280 & s.field_i[0] << 8) + (s.field_i[1] & 255);
                      }
                      if ((param0 == var11 &&
                        var9 == var12 &&
                        var13 == this.field_a) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= this.field_f.c(121) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      var10 = (int)((519L + this.field_f.c(64)) / 520L);
                      param2 = false;
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (512 >= param1 - var8) {
                      var10 = 0;
                    }
                    if (65535 < param0) {
                      s.field_i[8] = (byte)var10;
                      s.field_i[0] = (byte)(param0 >> 24);
                      s.field_i[5] = (byte)var9;
                      s.field_i[7] = (byte)(var10 >> 8);
                      s.field_i[2] = (byte)(param0 >> 8);
                      s.field_i[3] = (byte)param0;
                      s.field_i[6] = (byte)(var10 >> 16);
                      s.field_i[4] = (byte)(var9 >> 8);
                      s.field_i[1] = (byte)(param0 >> 16);
                      s.field_i[9] = (byte)this.field_a;
                      this.field_f.a(true, (long)(var7_int * 520));
                      this.field_f.a(10, s.field_i, 0, 108);
                      var11 = param1 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_f.a(var11, param3, var8, 105);
                      var8 = var8 + var11;
                    } else {
                      s.field_i[1] = (byte)param0;
                      s.field_i[2] = (byte)(var9 >> 8);
                      s.field_i[4] = (byte)(var10 >> 16);
                      s.field_i[0] = (byte)(param0 >> 8);
                      s.field_i[6] = (byte)var10;
                      s.field_i[5] = (byte)(var10 >> 8);
                      s.field_i[7] = (byte)this.field_a;
                      s.field_i[3] = (byte)var9;
                      this.field_f.a(true, (long)(520 * var7_int));
                      this.field_f.a(8, s.field_i, 0, 84);
                      var11 = -var8 + param1;
                      if (512 < var11) {
                        var11 = 512;
                      }
                      this.field_f.a(var11, param3, var8, param4 ^ 101);
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
            stackIn_71_1 = new StringBuilder().append("bl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
