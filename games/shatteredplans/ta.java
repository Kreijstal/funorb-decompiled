/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static qr field_d;
    static pf field_b;
    static bi field_a;
    static String field_c;
    static String field_e;

    final static void a(String param0, ha param1, int param2, int param3, nq param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 27329) {
                break L1;
              } else {
                mj discarded$1 = ta.a(62, -55L);
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (param0.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param0.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> 8) + (param1.field_b[0] - -param4.c(param0.substring(0, var7)));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 != -1) {
                    param1.field_b[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param1.field_b[var7] = (var5_int >> 8) - (-param1.field_b[0] + (-param4.c(param0.substring(0, var7 - -1)) - -param4.a((char) var8)));
                    break L4;
                  }
                }
                L6: {
                  if (62 == var8) {
                    var6 = -1;
                    var7++;
                    break L6;
                  } else {
                    var7++;
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ta.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final static void a(boolean param0) {
        L0: {
          if (!ol.a(-104)) {
            break L0;
          } else {
            param0 = false;
            break L0;
          }
        }
        di.a(false, param0);
        if (f.field_C) {
          gf.h(n.field_h.field_d.field_hb, n.field_h.field_d.field_db, n.field_h.field_d.field_K, n.field_h.field_d.field_mb);
          n.field_h.field_d.b(param0, -68);
          ml.a((byte) 99, param0);
          return;
        } else {
          ml.a((byte) 99, param0);
          return;
        }
    }

    final static nk c() {
        nk var1 = new nk(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], hd.field_q[0], eo.field_fb);
        pd.a(0);
        return var1;
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static boolean a(int param0) {
        int var1 = 94;
        return fj.field_s == ue.field_a ? true : false;
    }

    final static void b() {
        byte[] var1 = null;
        byte[] var2 = null;
        int discarded$12 = 1;
        if (w.d()) {
          return;
        } else {
          if (de.field_j != -1) {
            if (de.field_j == uc.field_A) {
              return;
            } else {
              var2 = new byte[2];
              var1 = var2;
              var2[0] = (byte) 0;
              var2[1] = (byte)de.field_j;
              int discarded$13 = 6;
              int discarded$14 = -78;
              fk discarded$15 = r.a(var2);
              uc.field_A = de.field_j;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static mj a(int param0, long param1) {
        int var3 = -91 % ((59 - param0) / 56);
        return (mj) (Object) ShatteredPlansClient.field_H.a(65280, param1);
    }

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param1 == gr.field_o) {
          return;
        } else {
          gr.field_o = param1;
          br.field_m = param0;
          if (nh.a((byte) -94, vr.field_c)) {
            L0: {
              mj.field_Hb[vr.field_c].a(-30492, gr.field_o);
              if (!nh.a((byte) -73, gr.field_o)) {
                break L0;
              } else {
                L1: {
                  var4 = 0;
                  if (11 != gr.field_o) {
                    break L1;
                  } else {
                    var4 = -1;
                    break L1;
                  }
                }
                mj.field_Hb[gr.field_o].a(var4, (byte) 27, param3);
                break L0;
              }
            }
            eh.field_Q = 0;
            return;
          } else {
            L2: {
              if (!nh.a((byte) -73, gr.field_o)) {
                break L2;
              } else {
                L3: {
                  var4 = 0;
                  if (11 != gr.field_o) {
                    break L3;
                  } else {
                    var4 = -1;
                    break L3;
                  }
                }
                mj.field_Hb[gr.field_o].a(var4, (byte) 27, param3);
                break L2;
              }
            }
            eh.field_Q = 0;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new pf();
        field_e = "Percentage of battles won in friendly space.";
        field_c = "Join <%0>'s game";
    }
}
