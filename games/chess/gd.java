/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gd {
    static ci field_b;
    static String field_d;
    static boolean field_e;
    private lc field_h;
    private lc field_a;
    static String field_f;
    private int field_c;
    private int field_g;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
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
          if (param2 != 59) {
            gd.a(118);
          }
          var5 = this.field_a;
          synchronized (var5) {
            if (0 <= param3 &&
              this.field_c >= param3) {
              var6 = this.a(param1, param0, true, param3, 68) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param1, param0, false, param3, 82) ? 1 : 0;
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
          stackIn_14_1 = new StringBuilder().append("gd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
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
          Object stackIn_15_0 = null;
          Object stackIn_23_0 = null;
          byte[] stackIn_51_0 = null;
          Object stackIn_54_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = Chess.field_G;
          var3_ref = this.field_a;
          synchronized (var3_ref) {
            try {
              if (this.field_h.c((byte) 109) < (long)(6 + 6 * param0)) {
                return null;
              }
              this.field_h.a((long)(param0 * 6), 0);
              this.field_h.a(jg.field_O, -19616, 0, 6);
              var4_int = ((jg.field_O[0] & 255) << 16) - (-(65280 & jg.field_O[1] << 8) - (255 & jg.field_O[2]));
              var5 = (jg.field_O[5] & 255) + ((jg.field_O[3] & 255) << 16) + (65280 & jg.field_O[4] << 8);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_c) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_a.c((byte) 109) / 520L < (long)var5) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              if (param1 < 92) {
                var19 = (byte[]) null;
                this.a(-51, (byte[]) null, (byte) -18, -53);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_a.a((long)(var5 * 520), 0);
                var9 = var4_int - var7;
                if (param0 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_a.a(jg.field_O, -19616, 0, var14 + var9);
                  var13 = jg.field_O[9] & 255;
                  var12 = (65280 & jg.field_O[7] << 8) + (((jg.field_O[6] & 255) << 16) + (255 & jg.field_O[8]));
                  var10 = ((255 & jg.field_O[2]) << 8) + (jg.field_O[0] << 24 & -16777216) + ((jg.field_O[1] & 255) << 16) + (jg.field_O[3] & 255);
                  var11 = (jg.field_O[4] << 8 & 65280) + (255 & jg.field_O[5]);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_a.a(jg.field_O, -19616, 0, var9 + var14);
                  var12 = (jg.field_O[6] & 255) + ((jg.field_O[4] << 16 & 16711680) + (65280 & jg.field_O[5] << 8));
                  var13 = 255 & jg.field_O[7];
                  var10 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 8);
                  var11 = (65280 & jg.field_O[2] << 8) + (255 & jg.field_O[3]);
                }
                if (param0 != var10) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_g) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_a.c((byte) 109) / 520L < (long)var12) {
                  return null;
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = jg.field_O[var16];
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

    public final String toString() {
        return "" + this.field_g;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
          nk var4 = null;
          nk var5 = null;
          if (null == tl.field_Gb) {
            tl.field_Gb = re.field_n.a(am.field_d, false, qh.field_a);
          }
          if (0 == tl.field_Gb.field_f) {
            return false;
          }
          if (param0 != 68) {
            gd.a((byte) -72, false);
          }
          long dupTemp$0 = ud.a(param0 ^ 70);
          ta.field_t = dupTemp$0;
          ml.field_d = dupTemp$0;
          if (tl.field_Gb.field_f != 1) {
            tb.field_f = gh.field_c;
          } else {
            try {
              lj.field_a = new hn((java.net.Socket) (tl.field_Gb.field_b), re.field_n);
              qn.field_U.field_l = 0;
              var4 = tk.field_h;
              var5 = var4;
              lf.field_T = param1 ? -2 : -1;
              wc.field_u = param1 ? -2 : -1;
              hh.field_o = param1 ? -2 : -1;
              var5.field_l = 0;
              tb.field_f = ca.field_h;
              dh.a(fn.field_b, 11, cm.field_u, ub.field_e, qn.field_U);
              vh.a(-1, (byte) -35);
            } catch (IOException iOException) {
              tb.field_f = gh.field_c;
            }
          }
          tl.field_Gb = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 != 5) {
          return -100;
        }
        return -ai.field_j + ca.field_j;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = Chess.field_G;
          try {
            var6 = this.field_a;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + param1 * 6) > this.field_h.c((byte) 109)) {
                    return false;
                  }
                  this.field_h.a((long)(param1 * 6), 0);
                  this.field_h.a(jg.field_O, -19616, 0, 6);
                  var7_int = (255 & jg.field_O[5]) + ((16711680 & jg.field_O[3] << 16) + ((jg.field_O[4] & 255) << 8));
                  if (0 >= var7_int ||
                    !((long)var7_int <= (this.field_a.c((byte) 109) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_a.c((byte) 109)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                jg.field_O[5] = (byte)var7_int;
                jg.field_O[3] = (byte)(var7_int >> 16);
                jg.field_O[4] = (byte)(var7_int >> 8);
                var8 = -43 / ((param4 + 55) / 57);
                jg.field_O[0] = (byte)(param3 >> 16);
                jg.field_O[2] = (byte)param3;
                jg.field_O[1] = (byte)(param3 >> 8);
                this.field_h.a((long)(param1 * 6), 0);
                this.field_h.a(0, 6, -1, jg.field_O);
                var9 = 0;
                var10 = 0;
                L3: while (true) {
                  if (param3 > var9) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (param2) {
                      this.field_a.a((long)(520 * var7_int), 0);
                      if (param1 <= 65535) {
                        try {
                          this.field_a.a(jg.field_O, -19616, 0, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var14 = 255 & jg.field_O[7];
                        var11 = (jg.field_O[6] & 255) + (((255 & jg.field_O[4]) << 16) + (jg.field_O[5] << 8 & 65280));
                        var12 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 8);
                        var13 = (255 & jg.field_O[3]) + ((jg.field_O[2] & 255) << 8);
                      } else {
                        try {
                          this.field_a.a(jg.field_O, -19616, 0, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = (255 & jg.field_O[8]) + ((16711680 & jg.field_O[6] << 16) + (jg.field_O[7] << 8 & 65280));
                        var14 = jg.field_O[9] & 255;
                        var13 = (jg.field_O[4] << 8 & 65280) + (255 & jg.field_O[5]);
                        var12 = (jg.field_O[3] & 255) + ((jg.field_O[2] & 255) << 8) + ((16711680 & jg.field_O[1] << 16) + ((jg.field_O[0] & 255) << 24));
                      }
                      if ((param1 == var12 &&
                        var13 == var10 &&
                        var14 == this.field_g) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !(this.field_a.c((byte) 109) / 520L >= (long)var11)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var11 == 0) {
                      var11 = (int)((this.field_a.c((byte) 109) + 519L) / 520L);
                      param2 = false;
                      if (var11 == 0) {
                        var11++;
                      }
                      if (var7_int == var11) {
                        var11++;
                      }
                    }
                    if (-var9 + param3 <= 512) {
                      var11 = 0;
                    }
                    if (65535 >= param1) {
                      jg.field_O[7] = (byte)this.field_g;
                      jg.field_O[0] = (byte)(param1 >> 8);
                      jg.field_O[6] = (byte)var11;
                      jg.field_O[2] = (byte)(var10 >> 8);
                      jg.field_O[1] = (byte)param1;
                      jg.field_O[5] = (byte)(var11 >> 8);
                      jg.field_O[3] = (byte)var10;
                      jg.field_O[4] = (byte)(var11 >> 16);
                      this.field_a.a((long)(520 * var7_int), 0);
                      this.field_a.a(0, 8, -1, jg.field_O);
                      var12 = param3 - var9;
                      if (var12 > 512) {
                        var12 = 512;
                      }
                      this.field_a.a(var9, var12, -1, param0);
                      var9 = var9 + var12;
                    } else {
                      jg.field_O[6] = (byte)(var11 >> 16);
                      jg.field_O[7] = (byte)(var11 >> 8);
                      jg.field_O[0] = (byte)(param1 >> 24);
                      jg.field_O[4] = (byte)(var10 >> 8);
                      jg.field_O[2] = (byte)(param1 >> 8);
                      jg.field_O[8] = (byte)var11;
                      jg.field_O[5] = (byte)var10;
                      jg.field_O[1] = (byte)(param1 >> 16);
                      jg.field_O[9] = (byte)this.field_g;
                      jg.field_O[3] = (byte)param1;
                      this.field_a.a((long)(var7_int * 520), 0);
                      this.field_a.a(0, 10, -1, jg.field_O);
                      var12 = -var9 + param3;
                      if (var12 > 510) {
                        var12 = 510;
                      }
                      this.field_a.a(var9, var12, -1, param0);
                      var9 = var9 + var12;
                    }
                    var7_int = var11;
                    var10++;
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
            stackIn_70_1 = new StringBuilder().append("gd.C(");
            if (param0 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        int var1 = 62 % ((-52 - param0) / 40);
    }

    gd(int param0, lc param1, lc param2, int param3) {
        this.field_h = null;
        this.field_c = 65000;
        this.field_a = null;
        try {
          this.field_h = param2;
          this.field_c = param3;
          this.field_g = param0;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "gd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_d = "Show chat (<%0> unread messages)";
        field_f = "Play free version";
    }
}
