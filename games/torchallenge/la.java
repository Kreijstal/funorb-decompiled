/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class la {
    private rk field_c;
    private int field_b;
    static oe field_f;
    private rk field_e;
    static kb field_a;
    static fj field_d;
    private int field_g;

    private final boolean a(int param0, int param1, int param2, byte[] param3, boolean param4) {
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
          var16 = TorChallenge.field_F ? 1 : 0;
          try {
            var6 = this.field_c;
            synchronized (var6) {
              try {
                if (param4) {
                  if (this.field_e.a(3) < (long)(6 * param2 + 6)) {
                    return false;
                  }
                  this.field_e.a((long)(6 * param2), 0);
                  this.field_e.a(0, 6, (byte) 72, wi.field_c);
                  var7_int = (65280 & wi.field_c[4] << 8) + (((wi.field_c[3] & 255) << 16) + (255 & wi.field_c[5]));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_c.a(param1 ^ -20) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_c.a(-124) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                wi.field_c[2] = (byte)param0;
                wi.field_c[4] = (byte)(var7_int >> 8);
                wi.field_c[1] = (byte)(param0 >> 8);
                wi.field_c[0] = (byte)(param0 >> 16);
                wi.field_c[3] = (byte)(var7_int >> 16);
                wi.field_c[5] = (byte)var7_int;
                this.field_e.a((long)(param2 * 6), 0);
                this.field_e.a(-4573, 0, wi.field_c, 6);
                var8 = 0;
                if (param1 != -6) {
                  return false;
                }
                var9 = 0;
                L3: while (true) {
                  if (var8 < param0) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_c.a((long)(520 * var7_int), 0);
                      if (param2 <= 65535) {
                        try {
                          this.field_c.a(0, 8, (byte) 29, wi.field_c);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (wi.field_c[2] << 8 & 65280) + (255 & wi.field_c[3]);
                        var13 = 255 & wi.field_c[7];
                        var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 8);
                        var10 = (16711680 & wi.field_c[4] << 16) + (wi.field_c[5] << 8 & 65280) + (255 & wi.field_c[6]);
                      } else {
                        try {
                          this.field_c.a(0, 10, (byte) 68, wi.field_c);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var10 = (65280 & wi.field_c[7] << 8) + ((255 & wi.field_c[6]) << 16) + (255 & wi.field_c[8]);
                        var11 = (255 & wi.field_c[3]) + ((wi.field_c[2] & 255) << 8) + (wi.field_c[0] << 24 & -16777216) + (16711680 & wi.field_c[1] << 16);
                        var12 = (wi.field_c[5] & 255) + (65280 & wi.field_c[4] << 8);
                        var13 = wi.field_c[9] & 255;
                      }
                      if ((param2 == var11 &&
                        var9 == var12 &&
                        this.field_b == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((long)var10 <= this.field_c.a(-112) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      param4 = false;
                      var10 = (int)((this.field_c.a(-14) + 519L) / 520L);
                      if (0 == var10) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (param0 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      wi.field_c[5] = (byte)var9;
                      wi.field_c[6] = (byte)(var10 >> 16);
                      wi.field_c[7] = (byte)(var10 >> 8);
                      wi.field_c[4] = (byte)(var9 >> 8);
                      wi.field_c[8] = (byte)var10;
                      wi.field_c[9] = (byte)this.field_b;
                      wi.field_c[2] = (byte)(param2 >> 8);
                      wi.field_c[3] = (byte)param2;
                      wi.field_c[0] = (byte)(param2 >> 24);
                      wi.field_c[1] = (byte)(param2 >> 16);
                      this.field_c.a((long)(var7_int * 520), 0);
                      this.field_c.a(-4573, 0, wi.field_c, 10);
                      var11 = -var8 + param0;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_c.a(-4573, var8, param3, var11);
                      var8 = var8 + var11;
                    } else {
                      wi.field_c[3] = (byte)var9;
                      wi.field_c[1] = (byte)param2;
                      wi.field_c[5] = (byte)(var10 >> 8);
                      wi.field_c[2] = (byte)(var9 >> 8);
                      wi.field_c[7] = (byte)this.field_b;
                      wi.field_c[6] = (byte)var10;
                      wi.field_c[4] = (byte)(var10 >> 16);
                      wi.field_c[0] = (byte)(param2 >> 8);
                      this.field_c.a((long)(var7_int * 520), 0);
                      this.field_c.a(param1 ^ 4569, 0, wi.field_c, 8);
                      var11 = -var8 + param0;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_c.a(-4573, var8, param3, var11);
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
            stackIn_74_0 = var6_ref;
            stackIn_74_1 = new StringBuilder().append("la.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_75_2 = "null";
            } else {
              stackIn_75_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          Object stackIn_9_0 = null;
          Object stackIn_37_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var19 = TorChallenge.field_F ? 1 : 0;
          var3_ref = this.field_c;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + 6 * param0) > this.field_e.a(-114)) {
                return null;
              }
              this.field_e.a((long)(6 * param0), 0);
              this.field_e.a(0, 6, (byte) 46, wi.field_c);
              var4_int = (wi.field_c[2] & 255) + ((wi.field_c[0] & 255) << 16) + ((wi.field_c[1] & 255) << 8);
              var5 = (wi.field_c[5] & 255) + ((255 & wi.field_c[4]) << 8) + ((255 & wi.field_c[3]) << 16);
              var6 = -54 % ((-63 - param1) / 40);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_g) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((this.field_c.a(-117) / 520L) < (long)var5) {
                return null;
              }
              var7 = new byte[var4_int];
              var8 = 0;
              var9 = 0;
              while (var4_int > var8) {
                if (0 == var5) {
                  return null;
                }
                this.field_c.a((long)(var5 * 520), 0);
                var10 = var4_int - var8;
                if (param0 > 65535) {
                  var15 = 10;
                  if (var10 > 510) {
                    var10 = 510;
                  }
                  this.field_c.a(0, var10 + var15, (byte) 69, wi.field_c);
                  var12 = ((255 & wi.field_c[4]) << 8) + (255 & wi.field_c[5]);
                  var14 = 255 & wi.field_c[9];
                  var11 = ((wi.field_c[2] & 255) << 8) + (((255 & wi.field_c[1]) << 16) + ((wi.field_c[0] & 255) << 24)) + (255 & wi.field_c[3]);
                  var13 = (wi.field_c[8] & 255) + (65280 & wi.field_c[7] << 8) + (16711680 & wi.field_c[6] << 16);
                } else {
                  if (512 < var10) {
                    var10 = 512;
                  }
                  var15 = 8;
                  this.field_c.a(0, var15 + var10, (byte) 98, wi.field_c);
                  var12 = (255 & wi.field_c[3]) + (65280 & wi.field_c[2] << 8);
                  var13 = (255 & wi.field_c[6]) + (((wi.field_c[4] & 255) << 16) + (wi.field_c[5] << 8 & 65280));
                  var14 = wi.field_c[7] & 255;
                  var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 8);
                }
                if (var11 != param0) {
                  return null;
                }
                if (var9 != var12) {
                  return null;
                }
                if (var14 != this.field_b) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (var13 < 0) {
                  return null;
                }
                if (this.field_c.a(23) / 520L < (long)var13) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                var16 = var10 + var15;
                var9++;
                var5 = var13;
                for (var17 = var15; var16 > var17; var17++) {
                  incrementValue$2 = var8;
                  var8++;
                  var7[incrementValue$2] = wi.field_c[var17];
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

    final static int a(qe param0, int param1) {
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        int var11 = 0;
        int var14 = 0;
        int var15 = 0;
        int var7Lifetime1;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 >= param0.field_G) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var2_int = 0;
          if (param0.field_Q > 0) {
            var2_int = 1;
          }
          if (param0.field_Q < 0) {
            var2_int = -1;
          }
          var3 = param0.field_B + param0.field_Q;
          var4 = param0.field_o;
          var5 = 89 / ((11 - param1) / 56);
          while (256 < var3 * var2_int) {
            var4 = var4 + var2_int;
            var3 = var3 + var2_int * -256;
          }
          var6 = (-param0.field_o + var4) * var2_int;
          if (var4 >= 64) {
            var4 -= 64;
          }
          if (0 > var4) {
            var4 += 64;
          }
          var11 = 0;
          for (var12 = 0; var6 > var12; var12++) {
            var7 = var2_int * var12 + param0.field_o;
            var15 = var7 % 64;
            var7Lifetime1 = var15;
            if (var15 < 0) {
              var15 += 64;
            }
            if (null != n.field_kb[var15][param0.field_H]) {
              for (var13 = 0; n.field_kb[var15][param0.field_H].length > var13; var13++) {
                if (var13 >= 0) {
                  var8 = var13;
                  if (eh.a(var2_int, -30917, n.field_kb[var15][param0.field_H], var8, param0)) {
                    if (var11 == 0) {
                      param0.field_Q = 8 * param0.field_Q / 10;
                      var11 = 1;
                    }
                    if (n.field_kb[var15][param0.field_H][var8] < ea.field_g.length) {
                      var9 = ea.field_g[n.field_kb[var15][param0.field_H][var8]];
                      if (var9 != null) {
                        var9.field_Q = param0.field_Q;
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_38_0 = 1;
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("la.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
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
          if (param3 < 116) {
            this.toString();
          }
          var5 = this.field_c;
          synchronized (var5) {
            if (param2 >= 0 &&
              param2 <= this.field_g) {
              var6 = this.a(param2, -6, param0, param1, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, -6, param0, param1, false) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("la.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_f = null;
        if (param0 != -64) {
          la.b((byte) -70);
        }
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pa var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        rd var12 = null;
        pa var13 = null;
        int[] var14 = null;
        ql var15 = null;
        Object var16 = null;
        ql var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var13 = id.field_b;
          if (param0 >= -29) {
            la.a((byte) 70);
          }
          var2 = var13.j(-126);
          if (var2 == 0) {
            var11 = jj.b((byte) -24);
            var17 = var11;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((uf) ((Object) var5)).j(-95);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((uf) ((Object) var5)).i(38);
            }
            var15 = (ql) (ji.field_q.c((byte) 119));
            if (var15 == null) {
              ob.b(-100);
              return;
            }
            var15.field_m = var17[0];
            var15.field_o = var3;
            var15.field_i = true;
            var15.a(true);
            return;
          }
          if (1 != var2) {
            if (var2 != 2) {
              td.a("A1: " + ck.a(-13299), (Throwable) null, (byte) -74);
              ob.b(-87);
            } else {
              var16_ref = (ql) (ji.field_q.c((byte) 125));
              if (var16_ref == null) {
                ob.b(-107);
                return;
              }
              var16_ref.field_o = jj.b((byte) -24);
              var16_ref.field_i = true;
              var16_ref.field_m = var16_ref.field_o[0];
              var16_ref.a(true);
            }
          } else {
            var12 = (rd) (bb.field_d.c((byte) 113));
            if (var12 == null) {
              ob.b(-93);
              return;
            }
            var12.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "la.F(" + param0 + ')');
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    final static String a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param0 < 75) {
          field_a = (kb) null;
        }
        for (var4 = 0; param1 > var4; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    la(int param0, rk param1, rk param2, int param3) {
        this.field_c = null;
        this.field_e = null;
        this.field_g = 65000;
        try {
          this.field_g = param3;
          this.field_b = param0;
          this.field_e = param2;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "la.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
