/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ac extends ff {
    static gk field_v;
    static int field_s;
    static String[] field_r;
    static ff field_t;
    static int[] field_w;
    static int field_u;

    ac(m param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_o, -1, 2147483647, false);
    }

    ac(int param0) {
        this(ng.field_F, param0);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        if (param3) {
            ik.a(param0 + param4.field_v, param4.field_h, param4.field_m + param2, param4.field_r, -1540604944);
        }
        if (param1 > -5) {
            field_t = null;
        }
        super.a(param0, -11, param2, param3, param4);
    }

    final static sl a(int param0, String[] param1) {
        if (param0 != 28) {
            return null;
        }
        sl var2 = new sl(false);
        var2.field_a = param1;
        return var2;
    }

    final static boolean a(byte param0, pk param1) {
        if (param0 < 6) {
            ac.a((byte) -125);
        }
        return 1 == param1.e((byte) -17, 1) ? true : false;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        L0: {
          var14 = Geoblox.field_C;
          var3 = 160;
          var4 = 190;
          if (!param0) {
            var4 -= 10;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param1) {
            stackOut_5_0 = vl.field_p;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ug.field_c;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_6_0;
          var6 = 0;
          var7 = a.field_e;
          var8 = 0;
          var9 = 0;
          if (param1) {
            var10 = 16;
            L3: while (true) {
              if (var10 < 0) {
                break L2;
              } else {
                L4: {
                  if (da.a(0, -100)) {
                    break L4;
                  } else {
                    if (var10 != 16) {
                      break L4;
                    } else {
                      var10--;
                      continue L3;
                    }
                  }
                }
                if (-1 == (1 << var10 & var5 ^ -1)) {
                  var9++;
                  var8 += 20;
                  var10--;
                  continue L3;
                } else {
                  var10--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (8 > var9) {
            break L5;
          } else {
            var3 = var3 + (-160 + var8);
            break L5;
          }
        }
        var10 = 0;
        L6: while (true) {
          if (var10 >= pg.field_a.length) {
            L7: {
              stackOut_54_0 = 190;
              stackIn_56_0 = stackOut_54_0;
              stackIn_55_0 = stackOut_54_0;
              if (!param0) {
                stackOut_56_0 = stackIn_56_0;
                stackOut_56_1 = -20;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                break L7;
              } else {
                stackOut_55_0 = stackIn_55_0;
                stackOut_55_1 = -2;
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                break L7;
              }
            }
            L8: {
              var10 = stackIn_57_0 + stackIn_57_1;
              if ((var7 ^ -1) == 0) {
                fi.field_d.b(w.field_a, 315, var10, 0, -1);
                if (fh.c(-94)) {
                  int discarded$1 = dd.field_G.a(ni.field_C, 125, 350, 395, 100, 0, -1, 1, 0, 26);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                L9: {
                  fi.field_d.b(pg.field_a[var7], 315, var10, 0, -1);
                  var11 = -fi.field_d.field_q + fi.field_d.field_o;
                  var12 = 280;
                  if (0 != (1 << var7 & var5)) {
                    sl.field_f[var7].b(160, var12);
                    var12 += 30;
                    dd.field_G.a(kd.field_a, 318, var12, 0, -1);
                    break L9;
                  } else {
                    am.field_b.b(160, var12);
                    var12 += 30;
                    dd.field_G.field_K[0][wf.field_p] = 15488514;
                    dd.field_G.a(ib.field_d, 318, var12, 0, -1);
                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                    break L9;
                  }
                }
                var12 = var12 + (fi.field_d.a(ri.field_b[var7], 318, var12, 190, 200, 0, -1, 0, 0, 16) * var11 + var11);
                var12 += 10;
                fi.field_d.a(wj.a(sl.field_h, new String[1], (byte) -50), 318, 360, 0, -1);
                var13 = 0;
                L10: while (true) {
                  if (var13 >= kk.field_s[var7]) {
                    var12 = var12 + var11;
                    break L8;
                  } else {
                    uk.field_m.f(318 + 10 * var13, 370);
                    var13++;
                    continue L10;
                  }
                }
              }
            }
            L11: {
              if (param2 <= -61) {
                break L11;
              } else {
                field_u = 108;
                break L11;
              }
            }
            return;
          } else {
            L12: {
              if (da.a(0, -119)) {
                break L12;
              } else {
                if (-17 != (var10 ^ -1)) {
                  break L12;
                } else {
                  if (qi.d(105)) {
                    break L12;
                  } else {
                    var10++;
                    continue L6;
                  }
                }
              }
            }
            L13: {
              L14: {
                if (0 != (1 << var10 & var5)) {
                  break L14;
                } else {
                  if (param1) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (qa.field_a < var3) {
                break L13;
              } else {
                if (32 + var3 < qa.field_a) {
                  break L13;
                } else {
                  if (var4 > ue.field_e) {
                    break L13;
                  } else {
                    if (32 + var4 < ue.field_e) {
                      break L13;
                    } else {
                      L15: {
                        vb.c(var3, var4, 32, 32, 2, 16689938);
                        if (-1 < (var7 ^ -1)) {
                          var7 = var10;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      vb.a(2 + var3, var4 + 2, 28, 28, 2, 16777215);
                      break L13;
                    }
                  }
                }
              }
            }
            L16: {
              if (var10 == a.field_e) {
                vb.c(var3, var4, 32, 32, 2, 15488514);
                vb.a(var3 - -2, var4 - -2, 28, 28, 2, 16777215);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if ((var5 & 1 << var10) == 0) {
                if (!param1) {
                  am.field_b.f(var3, var4);
                  break L17;
                } else {
                  var10++;
                  continue L6;
                }
              } else {
                sl.field_f[var10].f(var3, var4);
                break L17;
              }
            }
            var6++;
            if ((var6 ^ -1) == -8) {
              L18: {
                var4 += 40;
                var3 = 160;
                if (!param0) {
                  var4 += 5;
                  break L18;
                } else {
                  break L18;
                }
              }
              if (param1) {
                if ((var9 ^ -1) > -9) {
                  var3 = var3 + var8;
                  var10++;
                  continue L6;
                } else {
                  var10++;
                  continue L6;
                }
              } else {
                var10++;
                continue L6;
              }
            } else {
              var3 += 40;
              var10++;
              continue L6;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 < 62) {
            field_s = -128;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new gk();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_w = new int[8192];
        field_u = 11;
    }
}
