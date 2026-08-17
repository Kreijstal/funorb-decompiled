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
        if (dm.field_a <= param0 && c.field_i.field_I + dm.field_a > param0 && sk.field_k <= param1 && param1 < sk.field_k + c.field_i.field_H) {
            return 0;
        }
        if (param2 != 7) {
            ak.a(32, 49, false, -4);
        }
        if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
            return 1;
        }
        return -1;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
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
        if (param0 != -112) {
            ak.a(-56, -90, (byte) -84);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_h.a(param0, param4, param1, var7, var6, param2, -53);
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
            var4 = new w[]{param1, tb.field_c, (w) ((Object) ge.field_f)};
            this.field_h = new tc(0L, ec.field_i, var3, fb.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static dc[] a(byte param0, fd param1) {
        dc[] stackIn_3_0 = null;
        dc[] stackIn_10_0 = null;
        dc[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        dc[] var4 = null;
        int var5 = 0;
        dc var6 = null;
        int var7 = 0;
        mh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1.b(-86)) {
              var8 = param1.a((byte) 123);
              L1: while (true) {
                if (var8.field_c != 0) {
                  if ((var8.field_c ^ -1) == -3) {
                    stackIn_10_0 = new dc[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_b);
                    var9 = var10;
                    var3 = var9;
                    var4 = new dc[var10.length >> 465277314];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        L3: {
                          if (param0 == -109) {
                            break L3;
                          } else {
                            ak.a(94, -113, true, 89);
                            break L3;
                          }
                        }
                        stackIn_17_0 = (dc[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new dc();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 789348322];
                        var6.field_j = var3[1 + (var5 << -1273691358)];
                        var6.field_h = var3[(var5 << -330762750) - -2];
                        var6.field_a = var3[3 + (var5 << 1002693154)];
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
              stackIn_3_0 = new dc[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ak.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_e = "Stamina Highscores";
        field_g = "Connection lost - attempting to reconnect";
        field_a = "Rating";
        field_i = "Playing";
        field_c = "Press 'SPACE' or 'ENTER' to continue";
        field_f = "This entry doesn't match";
    }
}
