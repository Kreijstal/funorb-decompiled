/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        CharSequence var2 = (CharSequence) ((Object) ln.field_o);
        ci.field_d = ji.a(var2, true);
    }

    kb(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6) {
        super(param0, param1, param2, rs.field_Cb.field_J);
        int var9 = 0;
        int var11 = 0;
        int var8_int = 0;
        try {
            this.field_B = param6 ? true : false;
            this.field_D = param3;
            this.field_u = param5;
            this.field_z = param4;
            this.field_C = new bi(this.field_m, this.field_i);
            ra.a(-111);
            this.field_C.e();
            for (var8_int = 0; this.field_C.field_w > var8_int; var8_int++) {
                var9 = (this.field_C.field_w / 2 - var8_int) * (this.field_C.field_w / 2 + -var8_int);
                gf.f(0, var8_int, this.field_C.field_z, ui.a(0, this.field_D, -80, -(256 * var9 / (this.field_C.field_w / 2 * (this.field_C.field_w / 2))) + 256));
            }
            var11 = 0;
            var8_int = var11;
            while (var11 < this.field_C.field_w) {
                gf.a(0, var11, ui.a(0, this.field_C.field_B[var11 * this.field_C.field_z], -105, 128));
                gf.a(-1 + this.field_C.field_z, var11, ui.a(0, this.field_C.field_B[-1 + this.field_C.field_z * (1 + var11)], -112, 128));
                var11++;
            }
            gf.a(1, 1, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z], -93, 128));
            gf.a(2, 1, ui.a(0, this.field_C.field_B[this.field_C.field_z + 2], -113, 192));
            gf.a(1, 2, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * 2], -87, 192));
            gf.a(1, this.field_C.field_w + -2, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * (-2 + this.field_C.field_w)], -90, 128));
            gf.a(2, -2 + this.field_C.field_w, ui.a(0, this.field_C.field_B[2 + (-2 + this.field_C.field_w) * this.field_C.field_z], -82, 192));
            gf.a(1, this.field_C.field_w - 3, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * (-3 + this.field_C.field_w)], -78, 192));
            gf.a(-2 + this.field_C.field_z, 1, ui.a(0, this.field_C.field_B[2 * this.field_C.field_z - 2], -99, 128));
            gf.a(-3 + this.field_C.field_z, 1, ui.a(0, this.field_C.field_B[-3 + this.field_C.field_z * 2], -85, 192));
            gf.a(this.field_C.field_z - 2, 2, ui.a(0, this.field_C.field_B[-2 + 3 * this.field_C.field_z], -124, 192));
            gf.a(this.field_C.field_z + -2, this.field_C.field_w + -2, ui.a(0, this.field_C.field_B[-2 + this.field_C.field_z * (this.field_C.field_w - 1)], -88, 128));
            gf.a(-3 + this.field_C.field_z, -2 + this.field_C.field_w, ui.a(0, this.field_C.field_B[-3 + (this.field_C.field_w - 1) * this.field_C.field_z], -83, 192));
            gf.a(-2 + this.field_C.field_z, this.field_C.field_w - 3, ui.a(0, this.field_C.field_B[-2 + (this.field_C.field_w - 2) * this.field_C.field_z], -94, 192));
            cg.i(0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, String param4) {
        int stackIn_4_0 = 0;
        String stackIn_7_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              na.field_r = param3;
              if (!param1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              k.field_b = stackIn_4_0 != 0;
              var11 = param4;
              if (param2) {
                stackIn_7_0 = lq.field_p;
                break L2;
              } else {
                stackIn_7_0 = jm.field_s;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_7_0;
              if (-1 == (na.field_r ^ -1)) {
                var7 = db.a(480, lq.field_k, var11, ks.field_b, 3);
                var8 = 3 - -var7;
                t.field_c = new String[var8];
                pr.field_d = new int[var8];
                var9 = 0;
                L4: while (true) {
                  if (var9 >= var8) {
                    fs.field_y = new int[2];
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= var7) {
                        t.field_c[var8 + -3] = "";
                        t.field_c[-2 + var8] = var6;
                        pr.field_d[var8 - 2] = 0;
                        fs.field_y[0] = 1;
                        t.field_c[-1 + var8] = nf.field_i;
                        pr.field_d[-1 + var8] = 1;
                        fs.field_y[1] = 2;
                        break L3;
                      } else {
                        t.field_c[var9] = ks.field_b[var9];
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    pr.field_d[var9] = -1;
                    var9++;
                    continue L4;
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
                  L6: while (true) {
                    if (var9 >= var8) {
                      fs.field_y = new int[1];
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= var7) {
                          t.field_c[-2 + var8] = "";
                          t.field_c[var8 - 1] = nf.field_i;
                          pr.field_d[-1 + var8] = 0;
                          fs.field_y[0] = 2;
                          break L3;
                        } else {
                          t.field_c[var9] = ks.field_b[var9];
                          var9++;
                          continue L7;
                        }
                      }
                    } else {
                      pr.field_d[var9] = -1;
                      var9++;
                      continue L6;
                    }
                  }
                }
              }
            }
            ns.field_nb.field_b = fs.field_y.length;
            var7 = 0;
            var8 = 0;
            L8: while (true) {
              if (t.field_c.length <= var8) {
                ah.field_R = -(var7 >> -1093517663) + var7 + ol.field_e;
                ld.field_j = -(var7 >> -1014775807) + ol.field_e;
                rn.field_b = (js.field_e + uo.field_g << 302303809) * ns.field_nb.field_b;
                var8 = 0;
                L9: while (true) {
                  if (var8 >= t.field_c.length) {
                    vo.field_b = ri.field_O - (rn.field_b >> 1105002305);
                    ns.field_nb.a(ch.a(-15073, bb.field_b, pd.field_k), 0, param0, 123);
                    break L0;
                  } else {
                    L10: {
                      stackIn_40_0 = rn.field_b;

                      if (-1 >= (pr.field_d[var8] ^ -1)) {
                        stackIn_41_0 = stackIn_40_0;
                        stackIn_41_1 = vh.field_b;
                        break L10;
                      } else {
                        stackIn_41_0 = stackIn_40_0;
                        stackIn_41_1 = fe.field_A;
                        break L10;
                      }
                    }
                    rn.field_b = stackIn_41_0 + stackIn_41_1;
                    var8++;
                    continue L9;
                  }
                }
              } else {
                L11: {
                  if (-1 < (pr.field_d[var8] ^ -1)) {
                    stackIn_29_0 = 0;
                    break L11;
                  } else {
                    stackIn_29_0 = 1;
                    break L11;
                  }
                }
                L12: {
                  var9 = or.a(stackIn_29_0 != 0, t.field_c[var8], true);
                  if ((pr.field_d[var8] ^ -1) != 0) {
                    var9 = var9 + 2 * js.field_g;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var7 < var9) {
                    var7 = var9;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var8++;
                continue L8;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5);

            stackIn_46_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L14;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L14;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            kb.f(-97);
        }
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
        if (!(this.field_s)) {
            return;
        }
        int[] var8 = new int[4];
        int[] var6 = var8;
        int[] var5 = var6;
        int[] var11 = var5;
        gf.a(var8);
        gf.i(this.field_k, this.field_t, this.field_m + this.field_k, this.field_i + this.field_t);
        int var3 = rs.field_Cb.field_J;
        int var4 = -24 / ((param0 - 67) / 47);
        this.field_C.f(this.field_k, this.field_t);
        if (this.field_z != null) {
            if (this.field_B) {
                rs.field_Cb.c(this.field_z, 1 + (this.field_k + this.field_m / 2), (rs.field_Cb.field_J + rs.field_Cb.field_q) / 2 + (3 + this.field_t), this.field_u, -1);
            } else {
                rs.field_Cb.d(this.field_z, this.field_k + var3 / 2, (rs.field_Cb.field_q + rs.field_Cb.field_J) / 2 + this.field_t - -3, this.field_u, -1);
            }
        }
        gf.b(var11);
    }

    static {
    }
}
