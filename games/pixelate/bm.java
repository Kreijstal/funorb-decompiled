/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends jj {
    static String field_r;
    static String field_t;
    static boolean field_o;
    static String field_n;
    private lp[] field_p;
    private int field_s;
    static String field_m;
    static boolean field_q;
    static tf field_u;

    private final void a(int param0, int param1) {
        param0 = (16711935 + -(param0 & 16711935) & 133695482) >> -261682461 | (65280 + -(65280 & param0) & 522245) >> 1861692835;
        int var3 = (16711680 & param0) >> -1038271376;
        int var4 = (param0 & 65280) >> -1902746200;
        if (!(0 != var4)) {
            var4 = 1;
        }
        if (var3 == param1) {
            var3 = 1;
        }
        int var5 = param0 & 255;
        if (0 == var5) {
            var5 = 1;
        }
        uj.field_Ob = -param0;
        int var6 = this.a(255 / var4, 255 / var3, 255 / var5, param1 + 3);
        od.field_Gb = var6 * uj.field_Ob + 16777215;
        pl.field_O = 3 * uj.field_Ob + 16777215;
    }

    final void a(boolean param0) {
        int discarded$3 = 0;
        int incrementValue$4 = 0;
        int var2 = 0;
        lp[] var3_ref_lp__ = null;
        int var3 = 0;
        int var4 = 0;
        lp var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -307201) {
            var3_ref_lp__ = this.field_p;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_ref_lp__.length) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= t.field_k.length) {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        discarded$3 = this.a(-32, -63, -42, -97);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    if (pl.field_O < t.field_k[var3]) {
                      t.field_k[var3] = 16777215;
                      var3++;
                      continue L2;
                    } else {
                      if (od.field_Gb > t.field_k[var3]) {
                        t.field_k[var3] = od.field_Gb;
                        var3++;
                        continue L2;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var5 = var3_ref_lp__[var4];
                var5.a();
                var4++;
                continue L1;
              }
            }
          } else {
            incrementValue$4 = var2;
            var2++;
            t.field_k[incrementValue$4] = 16777215;
            continue L0;
          }
        }
    }

    final static short[] a(short[] param0, byte param1, pc param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        short[] stackOut_9_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4_int = param2.c(param3, (byte) -34);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              if (param1 <= -127) {
                L3: {
                  var5 = param2.c(4, (byte) -34);
                  var6 = (short)param2.c(16, (byte) -34);
                  if ((var5 ^ -1) >= -1) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (short)(param2.c(var5, (byte) -34) + var6);
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) (param0);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_9_0 = (short[]) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("bm.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (param1 < param0) {
            if (!(param1 >= param2)) {
                return param1;
            }
        }
        if (param3 != 3) {
            return 32;
        }
        return param0 < param2 ? param0 : param2;
    }

    public static void d(int param0) {
        field_u = null;
        field_r = null;
        if (param0 != 0) {
            field_t = (String) null;
        }
        field_t = null;
        field_n = null;
        field_m = null;
    }

    bm(String param0, tf[] param1) {
        super(param0, param1);
        int var3_int = 0;
        this.field_s = 0;
        try {
            this.field_p = new lp[500];
            for (var3_int = 0; this.field_p.length > var3_int; var3_int++) {
                this.field_p[var3_int] = new lp();
            }
            this.a(this.field_s, 0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var3 = 0;
        lp var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        lp[] var6 = this.field_p;
        lp[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.b(-126);
        }
        int fieldTemp$0 = this.field_s + 1;
        this.field_s = this.field_s + 1;
        if (fieldTemp$0 >= am.field_i.length) {
            this.field_s = 0;
        }
        this.a(am.field_i[this.field_s], 0);
    }

    static {
        field_r = "Please remove <%0> from your ignore list first.";
        field_t = "Set up new game";
        field_n = "Loading sound effects";
        field_m = "Show all game chat";
    }
}
