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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 27329) {
                break L1;
              } else {
                ta.a(62, -55L);
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
                    var6 = (var5_int >> -48007992) + (param1.field_b[0] - -param4.c(param0.substring(0, var7)));
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
                    param1.field_b[var7] = (var5_int >> 2073302472) - (-param1.field_b[0] + (-param4.c(param0.substring(0, var7 - -1)) - -param4.a((char) var8)));
                    break L4;
                  }
                }
                L6: {
                  if (62 == var8) {
                    var6 = -1;
                    break L6;
                  } else {
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
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ta.G(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (!ol.a(-104)) {
            break L0;
          } else {
            param0 = false;
            break L0;
          }
        }
        di.a(false, param0);
        if (!f.field_C) {
          ml.a((byte) 99, param0);
          if (param1 < 38) {
            field_c = (String) null;
            return;
          } else {
            return;
          }
        } else {
          gf.h(n.field_h.field_d.field_hb, n.field_h.field_d.field_db, n.field_h.field_d.field_K, n.field_h.field_d.field_mb);
          n.field_h.field_d.b(param0, -68);
          ml.a((byte) 99, param0);
          if (param1 >= 38) {
            return;
          } else {
            field_c = (String) null;
            return;
          }
        }
    }

    final static nk c(byte param0) {
        nk var1;
        var1 = new nk(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], hd.field_q[0], eo.field_fb);
        pd.a(0);
        if (param0 <= 82) {
          ta.a(113);
          return var1;
        } else {
          return var1;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 < 110) {
            field_c = (String) null;
        }
    }

    final static boolean a(int param0) {
        int var1 = 94 / ((param0 - -29) / 49);
        return fj.field_s == ue.field_a ? true : false;
    }

    final static void b(byte param0) {
        byte[] var1;
        byte[] var2;
        if (param0 == -69) {
          if (w.d(true)) {
            return;
          } else {
            if ((de.field_j ^ -1) != 0) {
              if (de.field_j == uc.field_A) {
                return;
              } else {
                var2 = new byte[2];
                var1 = var2;
                var2[0] = (byte) 0;
                var2[1] = (byte)de.field_j;
                r.a(var2, (byte) -78, 6);
                uc.field_A = de.field_j;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ta.a(true, -56);
          if (w.d(true)) {
            return;
          } else {
            if ((de.field_j ^ -1) != 0) {
              if (de.field_j == uc.field_A) {
                return;
              } else {
                var2 = new byte[2];
                var1 = var2;
                var2[0] = (byte) 0;
                var2[1] = (byte)de.field_j;
                r.a(var2, (byte) -78, 6);
                uc.field_A = de.field_j;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static mj a(int param0, long param1) {
        int var3 = -91 % ((59 - param0) / 56);
        return (mj) ((Object) ShatteredPlansClient.field_H.a(65280, param1));
    }

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4;
        if (param1 == gr.field_o) {
          return;
        } else {
          gr.field_o = param1;
          br.field_m = param0;
          if (!nh.a((byte) -94, vr.field_c)) {
            L0: {
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
            if (param2 != 96) {
              ta.b((byte) 9);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              mj.field_Hb[vr.field_c].a(-30492, gr.field_o);
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
            if (param2 == 96) {
              return;
            } else {
              ta.b((byte) 9);
              return;
            }
          }
        }
    }

    static {
        field_b = new pf();
        field_e = "Percentage of battles won in friendly space.";
        field_c = "Join <%0>'s game";
    }
}
