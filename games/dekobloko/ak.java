/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static ud field_b;
    static String field_g;
    static String field_e;
    tc field_h;
    static String field_c;
    static String field_f;
    static String field_a;
    static int field_d;
    static String field_i;

    final static int a(int param0, int param1, byte param2) {
        if (!(c.field_i != null)) {
            return -1;
        }
        if (dm.field_a <= param0) {
            if (c.field_i.field_I + dm.field_a > param0) {
                if (sk.field_k <= param1) {
                    if (param1 < sk.field_k + c.field_i.field_H) {
                        return 0;
                    }
                }
            }
        }
        if (sk.field_e <= param0) {
            if (c.field_i.field_I + sk.field_e > param0) {
                if (param1 >= dg.field_b) {
                    if (c.field_i.field_H + dg.field_b > param1) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          c.field_i.c(param0, param1);
          if (param2) {
            L1: {
              var4 = rb.field_b % c.field_i.field_I * 2;
              if (c.field_i.field_I <= var4) {
                var4 = c.field_i.field_I - (var4 + -c.field_i.field_I);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var4 < 10) {
                var4 = 10;
                break L2;
              } else {
                if (var4 <= -40 + c.field_i.field_I) {
                  break L2;
                } else {
                  var4 = c.field_i.field_I - 40;
                  break L2;
                }
              }
            }
            sh.a(0, 80, 25547, param0, 30, 0, var4, c.field_i, param1);
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param3 == 40) {
            break L3;
          } else {
            ak.a(43, 33, true, -46);
            break L3;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_i = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((ak) this).field_h.a(param0, param4, param1, var7, var6, param2, -53);
        if (param3 < 97) {
            ak.a(127, 8, false, -33);
        }
        jc.field_c.a(tb.field_c.field_mb, 0, 0, kf.field_O, 0);
        tc.field_Ub.a(-2 + -vh.field_e + (tb.field_c.field_mb + -80) - 2, 0, kf.field_O + 2, 18, 0);
        cf.field_d.a(vh.field_e + 82, 0, 2 + kf.field_O, 18, -80 + -vh.field_e + (tb.field_c.field_mb - 2));
        k.field_b.a(0, 1, -kf.field_O + (tb.field_c.field_N - 22), kf.field_O - -22, vh.field_e, 2, tb.field_c.field_mb, 20);
        ge.field_f.a(vh.field_e, 20, 2, 16);
    }

    ak(String param0, w param1) {
        String[] var3 = null;
        w[] var4 = null;
        try {
            var3 = new String[]{param0, al.field_a, tl.field_s};
            var4 = new w[]{param1, tb.field_c, (w) (Object) ge.field_f};
            ((ak) this).field_h = new tc(0L, ec.field_i, var3, fb.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static dc[] a(byte param0, fd param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        dc[] var4 = null;
        int var5 = 0;
        dc var6 = null;
        int var7 = 0;
        mh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        dc[] stackIn_3_0 = null;
        dc[] stackIn_10_0 = null;
        dc[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        dc[] stackOut_9_0 = null;
        dc[] stackOut_14_0 = null;
        dc[] stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1.b(-86)) {
              var8 = param1.a((byte) 123);
              L1: while (true) {
                if (var8.field_c != 0) {
                  if (var8.field_c == 2) {
                    stackOut_9_0 = new dc[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var12 = (int[]) var8.field_b;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new dc[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_14_0 = (dc[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new dc();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 2];
                        var6.field_j = var3[1 + (var5 << 2)];
                        var6.field_h = var3[(var5 << 2) - -2];
                        var6.field_a = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  ua.a(10L, -128);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new dc[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("ak.E(").append(-109).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Stamina Highscores";
        field_g = "Connection lost - attempting to reconnect";
        field_a = "Rating";
        field_i = "Playing";
        field_c = "Press 'SPACE' or 'ENTER' to continue";
        field_f = "This entry doesn't match";
    }
}
