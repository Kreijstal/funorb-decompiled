/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ql {
    private v field_k;
    private oc[] field_r;
    private v field_i;
    private v field_v;
    private v field_H;
    private oc field_l;
    private v field_t;
    private oc field_h;
    private oc field_g;
    private oc field_o;
    private v field_d;
    private oc field_A;
    private v field_D;
    private v field_q;
    private v field_y;
    private oj field_x;
    private oc field_u;
    private oc field_z;
    private v field_p;
    private int field_f;
    private v field_w;
    private oc field_j;
    static vi field_s;
    static bd field_C;
    private oc field_G;
    static boolean field_n;
    private v field_m;
    private oc field_F;
    static int[] field_e;
    static String field_E;
    static pg[] field_B;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (var3 >= el.field_j) {
              break L1;
            } else {
              if (mm.field_m[var3] != null) {
                if (mm.field_m[var3].field_i == 27) {
                  var2 = 1;
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
          L2: {
            if (var2 == 0) {
              ti.a(229, (byte) -118, 26);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        int var3 = 0;
        oc var4 = null;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          var4 = mm.field_m[0].field_j;
          if (0 == ((ob) this).field_D.field_a) {
            if (kh.field_Q[5]) {
              ((ob) this).field_D.field_a = 2;
              break L0;
            } else {
              if (ih.a(var4, (byte) -97, ((ob) this).field_l) < 2) {
                ((ob) this).field_D.field_a = 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (null == ((ob) this).field_x) {
            break L1;
          } else {
            if (((ob) this).field_x.field_I <= 0) {
              ((ob) this).field_D.field_a = 2;
              ((ob) this).field_x = null;
              ((ob) this).field_H.field_a = 2;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((ob) this).field_H.field_a == param0) {
            if (!kh.field_Q[5]) {
              break L2;
            } else {
              ((ob) this).field_H.field_a = 1;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (-1 == ((ob) this).field_q.field_a) {
            if (ih.a(var4, (byte) -117, ((ob) this).field_F) < 2) {
              ((ob) this).field_q.field_a = 1;
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (((ob) this).field_v.field_a != 0) {
            break L4;
          } else {
            if (ih.a(var4, (byte) -76, ((ob) this).field_j) >= 2) {
              break L4;
            } else {
              ((ob) this).field_v.field_a = 1;
              break L4;
            }
          }
        }
        L5: {
          if (((ob) this).field_m.field_a == 0) {
            if (ih.a(var4, (byte) -97, ((ob) this).field_z) < 2) {
              ((ob) this).field_m.field_a = 1;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (((ob) this).field_t.field_a != 0) {
            break L6;
          } else {
            if (2 <= ih.a(var4, (byte) -125, ((ob) this).field_u)) {
              break L6;
            } else {
              L7: {
                ((ob) this).field_t.field_a = 1;
                ((ob) this).field_p.field_a = 1;
                if (kh.field_Q[5]) {
                  break L7;
                } else {
                  if (!kh.field_Q[7]) {
                    ((ob) this).field_t.field_a = 2;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((ob) this).field_p.field_a = 2;
              break L6;
            }
          }
        }
        L8: {
          if (-1 == ((ob) this).field_w.field_a) {
            if (-3 <= ih.a(var4, (byte) -73, ((ob) this).field_g)) {
              break L8;
            } else {
              ((ob) this).field_w.field_a = 1;
              break L8;
            }
          } else {
            break L8;
          }
        }
        L9: {
          if (((ob) this).field_k.field_a == 0) {
            if (2 > ih.a(var4, (byte) -127, ((ob) this).field_r[0])) {
              ((ob) this).field_k.field_a = 1;
              ((ob) this).field_k.field_d = ((ob) this).field_r[0].field_g * 24;
              ((ob) this).field_k.field_l = 24 * (((ob) this).field_r[0].field_e + 2);
              break L9;
            } else {
              if (2 <= ih.a(var4, (byte) -107, ((ob) this).field_r[1])) {
                break L9;
              } else {
                ((ob) this).field_k.field_l = -((ob) this).field_k.field_m + 24 * (-2 + ((ob) this).field_r[1].field_e);
                ((ob) this).field_k.field_a = 1;
                ((ob) this).field_k.field_d = (((ob) this).field_r[1].field_g - 2) * 24 - ((ob) this).field_k.field_h;
                break L9;
              }
            }
          } else {
            break L9;
          }
        }
        L10: {
          if (((ob) this).field_i.field_a != 0) {
            break L10;
          } else {
            if (2 > ih.a(var4, (byte) -110, ((ob) this).field_G)) {
              ((ob) this).field_i.field_a = 1;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (((ob) this).field_y.field_a == 0) {
            if (ih.a(var4, (byte) -88, ((ob) this).field_h) < 2) {
              ((ob) this).field_y.field_a = 1;
              break L11;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L12: {
          if ((ng.field_u & 15) != 0) {
            break L12;
          } else {
            if (null != ((ob) this).field_x) {
              boolean discarded$1 = ((ob) this).a(((ob) this).field_A, -1);
              break L12;
            } else {
              break L12;
            }
          }
        }
        super.d(param0);
    }

    final static int c() {
        return 1;
    }

    final void a(int param0, oj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        oc var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ob) this).field_f = ((ob) this).field_f - 1;
              if (((ob) this).field_f == 1) {
                var5 = mm.field_m[0].field_j;
                ((ob) this).field_d.field_a = 1;
                if (var5.field_g < 40) {
                  ((ob) this).field_d.field_l = 1968;
                  ((ob) this).field_d.field_d = 552;
                  break L1;
                } else {
                  if (var5.field_e < 48) {
                    ((ob) this).field_d.field_l = 360;
                    ((ob) this).field_d.field_d = 1536;
                    break L1;
                  } else {
                    ((ob) this).field_d.field_l = 1776;
                    ((ob) this).field_d.field_d = 2136;
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((ob) this).field_f == 0) {
                r.field_a = 0;
                le.field_D = 500;
                tb.field_N = le.field_D;
                break L2;
              } else {
                r.field_a = 1;
                pm.field_d = pm.field_d - 7;
                tb.field_N = 150;
                break L2;
              }
            }
            var3_int = -76 % ((23 - param0) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ob.J(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void e(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          ((ob) this).field_f = 3;
          var10 = ln.field_a.field_v;
          var9 = var10;
          var8 = var9;
          var7 = var8;
          var5 = var7;
          var2 = var5;
          ((ob) this).field_o = new oc(var10[2], var10[3]);
          ((ob) this).field_l = new oc(var10[4], var10[5]);
          ((ob) this).field_F = new oc(var10[10], var10[11]);
          ((ob) this).field_j = new oc(var10[16], var10[17]);
          ((ob) this).field_z = new oc(var10[12], var10[13]);
          ((ob) this).field_g = new oc(var10[18], var10[19]);
          ((ob) this).field_G = new oc(var10[14], var10[15]);
          ((ob) this).field_h = new oc(var10[22], var10[23]);
          ((ob) this).field_u = new oc(var10[24], var10[25]);
          ((ob) this).field_r[0] = new oc(var10[28], var10[29]);
          ((ob) this).field_r[1] = new oc(var10[30], var10[31]);
          ((ob) this).field_D = new v(td.field_p, 48 + 24 * ((ob) this).field_l.field_e, -20 + 24 * (((ob) this).field_l.field_g + -3));
          ((ob) this).field_H = new v(sa.field_e, 24 * var10[6], -30 + (-96 + var10[7] * 24), 150);
          ((ob) this).field_q = new v(sa.field_b, 0, 48 + 24 * ((ob) this).field_F.field_g);
          ((ob) this).field_q.field_l = -((ob) this).field_q.field_m + (((ob) this).field_F.field_e - 3) * 24;
          ((ob) this).field_v = new v(u.field_b, 24 * ((ob) this).field_j.field_e + -24, 48 + ((ob) this).field_j.field_g * 24);
          ((ob) this).field_m = new v(bj.field_h, ((ob) this).field_z.field_e * 24, -96 + ((ob) this).field_z.field_g * 24 - 30);
          ((ob) this).field_t = new v(ui.field_f, 0, ((ob) this).field_u.field_g * 24);
          ((ob) this).field_t.field_l = 48 + 24 * ((ob) this).field_u.field_e;
          ((ob) this).field_p = new v(m.field_p, 0, ((ob) this).field_u.field_g * 24);
          ((ob) this).field_p.field_l = (2 + ((ob) this).field_u.field_e) * 24;
          ((ob) this).field_w = new v(m.field_j, ((ob) this).field_g.field_e * 24, 24 * ((ob) this).field_g.field_g - 102);
          ((ob) this).field_k = new v(bi.field_e, 0, 0);
          ((ob) this).field_i = new v(eg.field_p, 0, 24 * (((ob) this).field_G.field_g - -2));
          ((ob) this).field_i.field_l = 24 * (((ob) this).field_G.field_e - -2);
          ((ob) this).field_y = new v(qa.field_a, 0, (((ob) this).field_h.field_g - -2) * 24);
          ((ob) this).field_y.field_l = 48 + 24 * ((ob) this).field_h.field_e;
          if (kh.field_Q[5]) {
            ((ob) this).field_D.field_a = 2;
            ((ob) this).field_H.field_a = 2;
            break L0;
          } else {
            break L0;
          }
        }
        ((ob) this).field_A = new oc();
        var3 = 0;
        L1: while (true) {
          L2: {
            if (ll.field_a <= var3) {
              break L2;
            } else {
              if (wh.field_b[var3] != null) {
                if (wh.field_b[var3].field_i == 0) {
                  if (wh.field_b[var3].field_h == 4) {
                    ((ob) this).field_A.a((byte) 46, wh.field_b[var3].field_j);
                    break L2;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
          var6 = 0;
          var3 = var6;
          L3: while (true) {
            L4: {
              if (el.field_j <= var6) {
                break L4;
              } else {
                if (null != mm.field_m[var6]) {
                  if (mm.field_m[var6].field_i == -21) {
                    if (-9 > ih.a(mm.field_m[var6].field_j, (byte) -87, ((ob) this).field_l)) {
                      ((ob) this).field_x = mm.field_m[var6];
                      break L4;
                    } else {
                      var6++;
                      continue L3;
                    }
                  } else {
                    var6++;
                    continue L3;
                  }
                } else {
                  var6++;
                  continue L3;
                }
              }
            }
            ((ob) this).field_d = new v(e.field_k, 0, 0);
            kd.a(param0, param0 ^ 1);
            nh.field_E.a((byte) 46, ((ob) this).field_o);
            return;
          }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        oc var4 = null;
        L0: {
          var3 = -77 % ((param0 - -48) / 38);
          var4 = mm.field_m[0].field_j;
          ((ob) this).field_D.e(-115);
          ((ob) this).field_H.e(-114);
          if (((ob) this).field_H.field_a != 1) {
            ((ob) this).field_q.e(-126);
            if (((ob) this).field_q.field_a != 1) {
              break L0;
            } else {
              if (((ob) this).field_q.field_l + ((ob) this).field_q.field_m <= 24 * var4.field_e) {
                break L0;
              } else {
                ((ob) this).field_q.field_a = 2;
                break L0;
              }
            }
          } else {
            ((ob) this).field_q.e(-126);
            if (((ob) this).field_q.field_a != 1) {
              break L0;
            } else {
              if (((ob) this).field_q.field_l + ((ob) this).field_q.field_m <= 24 * var4.field_e) {
                break L0;
              } else {
                ((ob) this).field_q.field_a = 2;
                break L0;
              }
            }
          }
        }
        ((ob) this).field_v.e(-119);
        ((ob) this).field_i.e(-114);
        ((ob) this).field_y.e(-111);
        ((ob) this).field_m.e(-127);
        ((ob) this).field_t.e(-128);
        ((ob) this).field_p.e(-107);
        ((ob) this).field_w.e(-106);
        ((ob) this).field_k.e(-120);
        ((ob) this).field_d.e(-125);
    }

    public static void d() {
        field_s = null;
        field_C = null;
        field_e = null;
        field_B = null;
        field_E = null;
    }

    final String a(boolean param0) {
        if (param0) {
            field_e = null;
        }
        return bj.field_i;
    }

    public ob() {
        ((ob) this).field_r = new oc[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new vi(256);
        field_e = new int[]{24, 27, 5};
        field_E = "Achievements";
    }
}
