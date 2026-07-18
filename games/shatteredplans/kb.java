/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kb extends vd {
    private int field_D;
    private boolean field_B;
    private int field_u;
    static bi field_v;
    private bi field_C;
    private String field_z;
    static int field_x;
    static int field_A;
    static bi field_y;
    static om field_w;

    final static void f(int param0) {
        ln.field_o = sa.field_a.e(-1);
        if (param0 >= -82) {
            return;
        }
        CharSequence var2 = (CharSequence) (Object) ln.field_o;
        ci.field_d = ji.a(var2, true);
    }

    kb(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6) {
        super(param0, param1, param2, rs.field_Cb.field_J);
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var11 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param6) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((kb) this).field_B = stackIn_4_1 != 0;
            ((kb) this).field_D = param3;
            ((kb) this).field_u = param5;
            ((kb) this).field_z = param4;
            ((kb) this).field_C = new bi(((kb) this).field_m, ((kb) this).field_i);
            ra.a(-111);
            ((kb) this).field_C.e();
            var8_int = 0;
            L2: while (true) {
              if (((kb) this).field_C.field_w <= var8_int) {
                var11 = 0;
                var8_int = var11;
                L3: while (true) {
                  if (var11 >= ((kb) this).field_C.field_w) {
                    gf.a(1, 1, ui.a(0, ((kb) this).field_C.field_B[1 + ((kb) this).field_C.field_z], -93, 128));
                    gf.a(2, 1, ui.a(0, ((kb) this).field_C.field_B[((kb) this).field_C.field_z + 2], -113, 192));
                    gf.a(1, 2, ui.a(0, ((kb) this).field_C.field_B[1 + ((kb) this).field_C.field_z * 2], -87, 192));
                    gf.a(1, ((kb) this).field_C.field_w + -2, ui.a(0, ((kb) this).field_C.field_B[1 + ((kb) this).field_C.field_z * (-2 + ((kb) this).field_C.field_w)], -90, 128));
                    gf.a(2, -2 + ((kb) this).field_C.field_w, ui.a(0, ((kb) this).field_C.field_B[2 + (-2 + ((kb) this).field_C.field_w) * ((kb) this).field_C.field_z], -82, 192));
                    gf.a(1, ((kb) this).field_C.field_w - 3, ui.a(0, ((kb) this).field_C.field_B[1 + ((kb) this).field_C.field_z * (-3 + ((kb) this).field_C.field_w)], -78, 192));
                    gf.a(-2 + ((kb) this).field_C.field_z, 1, ui.a(0, ((kb) this).field_C.field_B[2 * ((kb) this).field_C.field_z - 2], -99, 128));
                    gf.a(-3 + ((kb) this).field_C.field_z, 1, ui.a(0, ((kb) this).field_C.field_B[-3 + ((kb) this).field_C.field_z * 2], -85, 192));
                    gf.a(((kb) this).field_C.field_z - 2, 2, ui.a(0, ((kb) this).field_C.field_B[-2 + 3 * ((kb) this).field_C.field_z], -124, 192));
                    gf.a(((kb) this).field_C.field_z + -2, ((kb) this).field_C.field_w + -2, ui.a(0, ((kb) this).field_C.field_B[-2 + ((kb) this).field_C.field_z * (((kb) this).field_C.field_w - 1)], -88, 128));
                    gf.a(-3 + ((kb) this).field_C.field_z, -2 + ((kb) this).field_C.field_w, ui.a(0, ((kb) this).field_C.field_B[-3 + (((kb) this).field_C.field_w - 1) * ((kb) this).field_C.field_z], -83, 192));
                    gf.a(-2 + ((kb) this).field_C.field_z, ((kb) this).field_C.field_w - 3, ui.a(0, ((kb) this).field_C.field_B[-2 + (((kb) this).field_C.field_w - 2) * ((kb) this).field_C.field_z], -94, 192));
                    cg.i(0);
                    break L0;
                  } else {
                    gf.a(0, var11, ui.a(0, ((kb) this).field_C.field_B[var11 * ((kb) this).field_C.field_z], -105, 128));
                    gf.a(-1 + ((kb) this).field_C.field_z, var11, ui.a(0, ((kb) this).field_C.field_B[-1 + ((kb) this).field_C.field_z * (1 + var11)], -112, 128));
                    var11++;
                    continue L3;
                  }
                }
              } else {
                var9 = (((kb) this).field_C.field_w / 2 - var8_int) * (((kb) this).field_C.field_w / 2 + -var8_int);
                gf.f(0, var8_int, ((kb) this).field_C.field_z, ui.a(0, ((kb) this).field_D, -80, -(256 * var9 / (((kb) this).field_C.field_w / 2 * (((kb) this).field_C.field_w / 2))) + 256));
                var8_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("kb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              na.field_r = param3;
              k.field_b = true;
              var11 = param4;
              if (param2) {
                stackOut_3_0 = lq.field_p;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = jm.field_s;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (na.field_r == 0) {
                var7 = db.a(480, lq.field_k, var11, ks.field_b, 3);
                var8 = 3 - -var7;
                t.field_c = new String[var8];
                pr.field_d = new int[var8];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var8) {
                    fs.field_y = new int[2];
                    var9 = 0;
                    L4: while (true) {
                      if (var9 >= var7) {
                        t.field_c[var8 + -3] = "";
                        t.field_c[-2 + var8] = var6;
                        pr.field_d[var8 - 2] = 0;
                        fs.field_y[0] = 1;
                        t.field_c[-1 + var8] = nf.field_i;
                        pr.field_d[-1 + var8] = 1;
                        fs.field_y[1] = 2;
                        break L2;
                      } else {
                        t.field_c[var9] = ks.field_b[var9];
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    pr.field_d[var9] = -1;
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (1 != na.field_r) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = db.a(480, lq.field_k, var11, ks.field_b, 3);
                  var8 = var7 + 2;
                  t.field_c = new String[var8];
                  pr.field_d = new int[var8];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var8) {
                      fs.field_y = new int[1];
                      var9 = 0;
                      L6: while (true) {
                        if (var9 >= var7) {
                          t.field_c[-2 + var8] = "";
                          t.field_c[var8 - 1] = nf.field_i;
                          pr.field_d[-1 + var8] = 0;
                          fs.field_y[0] = 2;
                          break L2;
                        } else {
                          t.field_c[var9] = ks.field_b[var9];
                          var9++;
                          continue L6;
                        }
                      }
                    } else {
                      pr.field_d[var9] = -1;
                      var9++;
                      continue L5;
                    }
                  }
                }
              }
            }
            ns.field_nb.field_b = fs.field_y.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (t.field_c.length <= var8) {
                ah.field_R = -(var7 >> 1) + var7 + ol.field_e;
                ld.field_j = -(var7 >> 1) + ol.field_e;
                rn.field_b = (js.field_e + uo.field_g << 1) * ns.field_nb.field_b;
                var8 = 0;
                L8: while (true) {
                  if (var8 >= t.field_c.length) {
                    vo.field_b = ri.field_O - (rn.field_b >> 1);
                    ns.field_nb.a(ch.a(-15073, bb.field_b, pd.field_k), 0, param0, 123);
                    break L0;
                  } else {
                    L9: {
                      stackOut_35_0 = rn.field_b;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (pr.field_d[var8] >= 0) {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = vh.field_b;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L9;
                      } else {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = fe.field_A;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L9;
                      }
                    }
                    rn.field_b = stackIn_38_0 + stackIn_38_1;
                    var8++;
                    continue L8;
                  }
                }
              } else {
                L10: {
                  if (pr.field_d[var8] < 0) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L10;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L10;
                  }
                }
                L11: {
                  var9 = or.a(stackIn_26_0 != 0, t.field_c[var8], true);
                  if (pr.field_d[var8] != -1) {
                    var9 = var9 + 2 * js.field_g;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var7 < var9) {
                    var7 = var9;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(true).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param4 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
    }

    public static void d(boolean param0) {
        field_w = null;
        field_v = null;
        field_y = null;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        if (param0 <= 54) {
            kb.f(112);
        }
        var2.h(param1, 255);
        var2.c(2, (byte) -59);
        var2.c(4, (byte) -84);
        var2.c(mr.a(0), (byte) -76);
    }

    final void a(int param0) {
        if (!(((kb) this).field_s)) {
            return;
        }
        int[] var12 = new int[4];
        int[] var10 = var12;
        int[] var8 = var10;
        int[] var6 = var8;
        int[] var5 = var6;
        int[] var13 = var5;
        gf.a(var12);
        gf.i(((kb) this).field_k, ((kb) this).field_t, ((kb) this).field_m + ((kb) this).field_k, ((kb) this).field_i + ((kb) this).field_t);
        int var3 = rs.field_Cb.field_J;
        int var4 = -24 / ((param0 - 67) / 47);
        ((kb) this).field_C.f(((kb) this).field_k, ((kb) this).field_t);
        if (((kb) this).field_z != null) {
            if (((kb) this).field_B) {
                rs.field_Cb.c(((kb) this).field_z, 1 + (((kb) this).field_k + ((kb) this).field_m / 2), (rs.field_Cb.field_J + rs.field_Cb.field_q) / 2 + (3 + ((kb) this).field_t), ((kb) this).field_u, -1);
            } else {
                rs.field_Cb.d(((kb) this).field_z, ((kb) this).field_k + var3 / 2, (rs.field_Cb.field_q + rs.field_Cb.field_J) / 2 + ((kb) this).field_t - -3, ((kb) this).field_u, -1);
            }
        }
        gf.b(var13);
    }

    static {
    }
}
