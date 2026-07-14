/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ml {
    private String field_n;
    private boolean field_o;
    static boolean[] field_r;
    static vr field_s;
    static int field_q;
    static long field_p;
    static String[] field_v;
    static String field_t;
    static String field_u;

    final static void a(int param0, int[] param1, int param2) {
        qg.field_p[param2] = param1;
        if (param0 != -1) {
            field_t = null;
        }
        mj.field_Hb[param2] = new sm(param2);
    }

    final u b(int param0, String param1) {
        kj var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        u stackIn_14_0 = null;
        u stackOut_13_0 = null;
        u stackOut_12_0 = null;
        var5 = (CharSequence) (Object) param1;
        if (!vg.a(var5, (byte) -89)) {
          return tj.field_b;
        } else {
          L0: {
            if (param1.equals((Object) (Object) ((ec) this).field_n)) {
              break L0;
            } else {
              L1: {
                var3 = ji.a(param0 + 3780, param1);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.field_g == null) {
                    ((ec) this).field_o = var3.field_h;
                    ((ec) this).field_n = param1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return lm.field_d;
            }
          }
          L2: {
            if (param0 == -11196) {
              break L2;
            } else {
              var4 = null;
              ec.a(30, (int[]) null, 29);
              break L2;
            }
          }
          L3: {
            if (!((ec) this).field_o) {
              stackOut_13_0 = tj.field_b;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = p.field_g;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          return stackIn_14_0;
        }
    }

    final static void e(byte param0) {
        mj var3 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        he.field_p = null;
        np.field_a = null;
        k.field_i = false;
        if (!(null == gr.field_p)) {
            gr.field_p.a(param0 + 66);
            gr.field_p = null;
        }
        if (param0 != -66) {
            field_v = null;
        }
        ShatteredPlansClient.field_H = null;
        if (null != kj.field_a) {
            kj.field_a.a(param0 + 66);
            kj.field_a = null;
        }
        ea.field_b = null;
        if (uo.field_a != null) {
            uo.field_a.a(0);
            uo.field_a = null;
        }
        qp.field_w = null;
        if (ShatteredPlansClient.field_H != null) {
            var3 = (mj) (Object) ShatteredPlansClient.field_H.c((byte) -102);
            while (var3 != null) {
                var3.a(16);
                var3 = (mj) (Object) ShatteredPlansClient.field_H.b((byte) -107);
            }
            ShatteredPlansClient.field_H = null;
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        field_s = null;
        if (!param0) {
            bi discarded$0 = ec.a(-25, -13, false);
        }
        field_t = null;
        field_v = null;
        field_r = null;
    }

    final static bi a(int param0, int param1, boolean param2) {
        int var3 = 0;
        bi var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = (-(3 * d.field_b[param0].field_z / 4) + 130) * param1 / 5;
          if (var3 > 0) {
            break L0;
          } else {
            var3 = 1;
            break L0;
          }
        }
        var4 = new bi(var3, -6 + d.field_b[param0].field_w);
        ra.a(-104);
        var4.e();
        var5 = 0;
        L1: while (true) {
          if (var4.field_z <= var5) {
            var5 = 0;
            L2: while (true) {
              if (-1 + var4.field_z <= var5) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4.field_w) {
                    L4: {
                      var4.field_B[var4.field_z * var4.field_w - 1] = ui.a(0, var4.field_B[-1 + var4.field_w * var4.field_z], -85, 190);
                      cg.i(0);
                      if (param2) {
                        break L4;
                      } else {
                        field_r = null;
                        break L4;
                      }
                    }
                    return var4;
                  } else {
                    var4.field_B[var4.field_z - 1 - -(var5 * var4.field_z)] = ui.a(0, var4.field_B[var5 * var4.field_z + (-1 + var4.field_z)], -86, 128);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var4.field_B[var5] = ui.a(0, var4.field_B[var5], -92, 128);
                var4.field_B[var4.field_z * (var4.field_w - 1) + var5] = ui.a(0, var4.field_B[var4.field_z * (var4.field_w + -1) + var5], -118, 64);
                var5++;
                continue L2;
              }
            }
          } else {
            gf.j(var5, 0, var4.field_w, ui.a(0, gm.field_k[param0], -81, 128 - -(128 * var5 / var4.field_z)));
            var5++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = 0;
          if (param0 == -1) {
            break L0;
          } else {
            field_p = -46L;
            break L0;
          }
        }
        L1: {
          var3 = js.field_j;
          if (-6 < (var3 ^ -1)) {
            var2 = 8192 * var3 * var3 / 1100;
            break L1;
          } else {
            if (105 <= var3) {
              if ((var3 ^ -1) <= -121) {
                break L1;
              } else {
                var3 = 120 + -var3;
                var2 = 8192 + -(var3 * var3 * 8192 / 3300);
                break L1;
              }
            } else {
              var2 = (-40960 + var3 * 16384) / 220;
              break L1;
            }
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (-2 == (param1 ^ -1)) {
            var5 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 != param1) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (4 != param1) {
            break L4;
          } else {
            var4 = 1;
            var5 = 1;
            break L4;
          }
        }
        L5: {
          if (5 != param1) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (-7 == (param1 ^ -1)) {
            var4 = 1;
            var5 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if ((param1 ^ -1) == -8) {
              break L8;
            } else {
              if ((param1 ^ -1) == -9) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param1 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param1 == 12) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-14 != param1) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (14 != param1) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (-16 != param1) {
            break L13;
          } else {
            var5 = 1;
            var4 = 1;
            break L13;
          }
        }
        ib.field_a = mq.a(var4 * var2, (byte) 80, var5 * var2);
    }

    ec(go param0) {
        super(param0);
        ((ec) this).field_o = false;
    }

    final void d(int param0) {
        ((ec) this).field_n = null;
        if (param0 != 0) {
            Object var3 = null;
            ec.a(-117, (int[]) null, 13);
        }
    }

    final static sr a(sl param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param0.b((byte) 126, 8);
        if (var2 > 0) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = ng.a(param0, (byte) -95) ? 1 : 0;
            var4 = ng.a(param0, (byte) -95) ? 1 : 0;
            var5 = new sr();
            var5.field_x = (short)param0.b((byte) 115, 16);
            var5.field_w = tm.a((byte) 39, param0, 16, var5.field_w);
            var5.field_z = tm.a((byte) 39, param0, 16, var5.field_z);
            var5.field_f = tm.a((byte) 39, param0, 16, var5.field_f);
            var5.field_u = (short)param0.b((byte) 99, 16);
            var5.field_s = tm.a((byte) 39, param0, 16, var5.field_s);
            var6 = 99 % ((-48 - param1) / 42);
            var5.field_i = tm.a((byte) 39, param0, 16, var5.field_i);
            var5.field_B = tm.a((byte) 39, param0, 16, var5.field_B);
            if (var3 == 0) {
              break L0;
            } else {
              var5.field_e = (short)param0.b((byte) 82, 16);
              var5.field_I = tm.a((byte) 39, param0, 16, var5.field_I);
              var5.field_y = tm.a((byte) 39, param0, 16, var5.field_y);
              var5.field_v = tm.a((byte) 39, param0, 16, var5.field_v);
              var5.field_M = tm.a((byte) 39, param0, 16, var5.field_M);
              var5.field_P = tm.a((byte) 39, param0, 16, var5.field_P);
              var5.field_n = tm.a((byte) 39, param0, 16, var5.field_n);
              break L0;
            }
          }
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              int discarded$1 = param0.b((byte) 98, 16);
              var5.field_C = tm.a((byte) 39, param0, 16, var5.field_C);
              var5.field_g = tm.a((byte) 39, param0, 16, var5.field_g);
              var5.field_L = tm.a((byte) 39, param0, 16, var5.field_L);
              var5.field_J = tm.a((byte) 39, param0, 16, var5.field_J);
              var5.field_G = tm.a((byte) 39, param0, 16, var5.field_G);
              break L1;
            }
          }
          L2: {
            if (ng.a(param0, (byte) -95)) {
              var5.field_b = tm.a((byte) 39, param0, 16, var5.field_b);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!ng.a(param0, (byte) -95)) {
              break L3;
            } else {
              var5.field_p = df.a(16, false, param0, var5.field_p);
              var7 = 0;
              var8 = 0;
              L4: while (true) {
                if (var5.field_p.length <= var8) {
                  if (var7 == 0) {
                    var5.field_p = null;
                    break L3;
                  } else {
                    var5.field_o = (byte)(1 + var7);
                    break L3;
                  }
                } else {
                  if ((255 & var5.field_p[var8]) > var7) {
                    var7 = 255 & var5.field_p[var8];
                    var8++;
                    continue L4;
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    final static void b(int param0, int param1) {
        if (param0 != -8) {
            ec.e((byte) 84);
        }
        if (!(-51 == (param1 ^ -1))) {
            throw new IllegalArgumentException();
        }
    }

    final String a(boolean param0, String param1) {
        kj var4 = null;
        if (param0) {
            ((ec) this).field_n = null;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = im.a(var5, (byte) -123);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((ec) this).field_n)) {
            var4 = ji.a(-7416, param1);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_g) {
                return null;
            }
            ((ec) this).field_n = param1;
            ((ec) this).field_o = var4.field_h;
        }
        if (!((ec) this).field_o) {
            return lr.field_d;
        }
        return ck.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 480;
        field_t = "Animations speed is normal. Click to double.";
        field_s = new vr(true, true, false, true, false, false, false, 0);
        field_u = "Confirm Email:";
    }
}
