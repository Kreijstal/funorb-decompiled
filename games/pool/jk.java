/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private nc[] field_m;
    private eg[] field_b;
    boolean field_g;
    static hj field_i;
    private double[] field_e;
    static String field_k;
    static String field_j;
    int[] field_l;
    static String field_f;
    private int[][] field_d;
    static String field_a;
    static int[] field_h;
    static String field_c;

    final static void a(boolean param0, boolean param1, di param2, di param3) {
        ub.a(md.field_d, (lr) (Object) ol.field_c, cq.field_d, iq.field_f, uo.field_Lb, ei.field_A, pa.field_M, i.field_l, param0, kq.field_a, ag.field_f, (byte) 37);
        if (param1) {
            Object var5 = null;
            jk.a(true, true, (di) null, (di) null);
        }
        sg.field_M = aj.a(0, "lobby", param2, "chatfilter");
        nk.field_i[1] = cl.field_i;
        nk.field_i[2] = rj.field_j;
        nk.field_i[0] = fq.field_Db;
        c.a((lr) (Object) ae.field_a, param1, param3);
    }

    final void a(eg param0, byte param1) {
        int var3_int = 0;
        eg var3 = null;
        int var4 = 0;
        eg var5_ref = null;
        int var5 = 0;
        int var6_int = 0;
        eg var6 = null;
        int var7_int = 0;
        eg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        var9 = Pool.field_O;
        nn.a(param0, true);
        eg discarded$1 = gn.a(param0, 5);
        param0.e();
        L0: while (true) {
          if (1500 <= -param0.field_V + param0.field_x) {
            L1: {
              var13 = new int[3];
              ln.a(var13, 0, param0);
              ((jk) this).field_b = new eg[2];
              if (param1 <= -96) {
                break L1;
              } else {
                ((jk) this).field_m = null;
                break L1;
              }
            }
            ((jk) this).field_m = new nc[((jk) this).field_b.length];
            ((jk) this).field_e = new double[((jk) this).field_b.length];
            ((jk) this).field_d = new int[((jk) this).field_b.length][3];
            var3 = param0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((jk) this).field_b.length) {
                return;
              } else {
                L3: {
                  if (var4 >= -1 + ((jk) this).field_b.length) {
                    ((jk) this).field_b[var4] = var3;
                    break L3;
                  } else {
                    ((jk) this).field_b[var4] = hq.b((byte) 121);
                    var5_ref = hq.b((byte) 124);
                    var6_int = (-param0.field_V + param0.field_x) * (1 + var4) / ((jk) this).field_b.length + param0.field_V;
                    ej.a(0, ((jk) this).field_b[var4], 0, false, var6_int, 0, 0, 1, var5_ref, var3);
                    var3 = var5_ref;
                    break L3;
                  }
                }
                ((jk) this).field_b[var4].a();
                ((jk) this).field_b[var4].e();
                var6 = ((jk) this).field_b[var4];
                d.a(var6, -23109);
                var5 = (var6.field_V + var6.field_x) / 2;
                var7_int = 0;
                L4: while (true) {
                  if (var6.field_q.length <= var7_int) {
                    var6.a();
                    ((jk) this).field_e[var4] = (double)rj.e(-((jk) this).field_b[0].field_V + var5, 3);
                    if ((var4 ^ -1) < -1) {
                      var7 = ((jk) this).field_b[var4 + -1];
                      var7.d();
                      var8 = var7.field_V + var7.field_x >> 291075233;
                      var7.a((um) (Object) var6, 0, 0, -var8 + var5, false);
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  } else {
                    var6.field_q[var7_int] = var6.field_q[var7_int] - var5;
                    var7_int++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var3_int = 0;
            L5: while (true) {
              if (param0.field_B <= var3_int) {
                param0.a();
                param0.e();
                continue L0;
              } else {
                param0.field_g[var3_int] = param0.field_g[var3_int] << 1;
                param0.field_Y[var3_int] = param0.field_Y[var3_int] << 1;
                param0.field_q[var3_int] = param0.field_q[var3_int] << 1;
                var3_int++;
                continue L5;
              }
            }
          }
        }
    }

    final static void a(long param0, int param1, int param2) {
        oq var4 = ej.field_j;
        var4.b(false, param1);
        var4.field_v = var4.field_v + 1;
        if (param2 != 0) {
            field_c = null;
        }
        int var5 = var4.field_v;
        var4.a(7, false);
        var4.a(param0, (byte) -119);
        var4.b(var4.field_v - var5, true);
    }

    final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = Pool.field_O;
        int var2 = (int)Math.ceil((double)((float)cr.a(4885, 688.5) / (float)nc.field_Y.length));
        ((jk) this).field_b = new eg[var2];
        if (param0 != 2) {
            return;
        }
        ((jk) this).field_m = new nc[((jk) this).field_b.length];
        ((jk) this).field_e = new double[((jk) this).field_b.length];
        for (var3 = 0; var3 < var2; var3++) {
            ((jk) this).field_b[var3] = new eg(16, 16, 0);
            var4 = var3 - -1;
            var5 = (double)var3 * 456.0 / (double)var2;
            var7 = (double)var4 * 470.25 / (double)var2;
            var9 = (var7 + var5) / 2.0;
            var11 = (float)var3 * 3.0f / (float)var2 + ((float)var2 - (float)var3) * 1.0f / (float)var2;
            var12 = (float)var4 * 3.0f / (float)var2 + ((float)var2 - (float)var4) * 1.0f / (float)var2;
            for (var13 = 0; -9 < (var13 ^ -1); var13++) {
                var14 = 1 + var13;
                var15 = ((jk) this).field_b[var3].a(cr.a(param0 ^ 4887, Math.cos((double)var13 * 3.141592653589793 * 2.0 / 8.0) * (double)var11), cr.a(4885, (double)var11 * Math.sin(3.141592653589793 * (double)var13 * 2.0 / 8.0)), cr.a(4885, var5 - var9));
                var16 = ((jk) this).field_b[var3].a(cr.a(param0 ^ 4887, Math.cos((double)var14 * 3.141592653589793 * 2.0 / 8.0) * (double)var11), cr.a(4885, Math.sin(3.141592653589793 * (double)var14 * 2.0 / 8.0) * (double)var11), cr.a(4885, var5 - var9));
                var17 = ((jk) this).field_b[var3].a(cr.a(4885, Math.cos((double)var13 * 3.141592653589793 * 2.0 / 8.0) * (double)var12 * 1.03125), cr.a(param0 ^ 4887, Math.sin(2.0 * ((double)var13 * 3.141592653589793) / 8.0) * (double)var12 * 1.03125), cr.a(4885, var7 - var9));
                var18 = ((jk) this).field_b[var3].a(cr.a(4885, Math.cos((double)var14 * 3.141592653589793 * 2.0 / 8.0) * (double)var12 * 1.03125), cr.a(4885, Math.sin(2.0 * (3.141592653589793 * (double)var14) / 8.0) * (double)var12 * 1.03125), cr.a(4885, var7 - var9));
                int discarded$0 = ((jk) this).field_b[var3].a(var15, var16, var17, (byte) 1, hh.a((byte) 95, 10053171), (byte) 0);
                int discarded$1 = ((jk) this).field_b[var3].a(var18, var17, var16, (byte) 1, hh.a((byte) -1, 10053171), (byte) 0);
            }
            ((jk) this).field_e[var3] = var9;
            ((jk) this).field_b[var3].e();
        }
        ((jk) this).field_d = new int[((jk) this).field_e.length][3];
    }

    final void a(int param0, int[] param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        for (var3 = 0; var3 < ((jk) this).field_m.length; var3++) {
            ((jk) this).field_l[0] = ((jk) this).field_d[var3][0];
            ((jk) this).field_l[1] = ((jk) this).field_d[var3][1];
            ((jk) this).field_l[2] = ((jk) this).field_d[var3][2];
            ((jk) this).field_m[var3].a(param1, ((jk) this).field_l);
        }
        if (param0 != 32624) {
            ((jk) this).field_e = null;
        }
    }

    final static void a(boolean param0, int param1) {
        vh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        vh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        vh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        vh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        vh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        vh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        vh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        vh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        vh stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        vh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        vh stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        vh stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        vh stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        vh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        vh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        vh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        vh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        vh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        vh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        vh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        vh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        vh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        vh stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        vh stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        vh stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        vh stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        vh stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        wh.a(-640 + qh.field_l >> 1771585601, 0, qh.field_l - -640 >> -453745375, (byte) -88, qh.field_f);
        if (param1 > 116) {
          L0: {
            if (hb.field_a <= 0) {
              break L0;
            } else {
              L1: {
                if (null != ac.field_n) {
                  ac.field_n.a(ir.field_a.field_qb, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  stackOut_6_0 = ir.field_a;
                  stackOut_6_1 = -79;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (!param0) {
                    break L3;
                  } else {
                    stackOut_7_0 = (vh) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (tf.field_d) {
                      break L3;
                    } else {
                      stackOut_8_0 = (vh) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = (vh) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L2;
              }
              L4: {
                L5: {
                  ((vh) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2 != 0);
                  stackOut_10_0 = oi.field_n;
                  stackOut_10_1 = -79;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!param0) {
                    break L5;
                  } else {
                    stackOut_11_0 = (vh) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (tf.field_d) {
                      break L5;
                    } else {
                      stackOut_12_0 = (vh) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      break L4;
                    }
                  }
                }
                stackOut_13_0 = (vh) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L4;
              }
              ((vh) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2 != 0);
              break L0;
            }
          }
          L6: {
            L7: {
              if (uf.field_z > 0) {
                break L7;
              } else {
                if ((nj.field_b ^ -1) < -1) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (null != ac.field_n) {
                ac.field_n.a(so.field_k.field_qb, 0);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                stackOut_21_0 = so.field_k;
                stackOut_21_1 = -79;
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (!param0) {
                  break L10;
                } else {
                  stackOut_22_0 = (vh) (Object) stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  if (nr.field_bb) {
                    break L10;
                  } else {
                    stackOut_23_0 = (vh) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    break L9;
                  }
                }
              }
              stackOut_24_0 = (vh) (Object) stackIn_24_0;
              stackOut_24_1 = stackIn_24_1;
              stackOut_24_2 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            }
            L11: {
              L12: {
                ((vh) (Object) stackIn_25_0).a((byte) stackIn_25_1, stackIn_25_2 != 0);
                stackOut_25_0 = uq.field_f;
                stackOut_25_1 = -79;
                stackIn_28_0 = stackOut_25_0;
                stackIn_28_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (!param0) {
                  break L12;
                } else {
                  stackOut_26_0 = (vh) (Object) stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if (nr.field_bb) {
                    break L12;
                  } else {
                    stackOut_27_0 = (vh) (Object) stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    break L11;
                  }
                }
              }
              stackOut_28_0 = (vh) (Object) stackIn_28_0;
              stackOut_28_1 = stackIn_28_1;
              stackOut_28_2 = 0;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            }
            ((vh) (Object) stackIn_29_0).a((byte) stackIn_29_1, stackIn_29_2 != 0);
            break L6;
          }
          oc.a(114);
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_c = null;
        field_k = null;
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 > -60) {
            field_j = null;
        }
        field_h = null;
    }

    final static void a(int param0, qp param1) {
        if (param0 <= 106) {
            return;
        }
        if (!(param1 != null)) {
            return;
        }
        im.field_Ub = param1;
        e.field_a.field_T.d((byte) 53);
        e.field_a.a(-112, (vh) (Object) im.field_Ub);
        fm.field_H = true;
    }

    final void a(int param0, uf param1) {
        this.a(param1, (byte) 95);
        this.a((byte) 112);
        ((jk) this).field_g = false;
        if (param0 != 0) {
            Object var4 = null;
            ((jk) this).a(-44, (int[]) null);
        }
    }

    private final void a(uf param0, byte param1) {
        int var11 = 0;
        double var12 = 0.0;
        int var14 = Pool.field_O;
        double var3 = Math.sin((double)param0.field_G.field_k * 3.141592653589793 / 1024.0);
        double var5 = Math.cos(3.141592653589793 * (double)param0.field_G.field_k / 1024.0);
        double var7 = Math.sin((double)param0.field_G.field_h * 3.141592653589793 / 1024.0);
        double var9 = Math.cos(3.141592653589793 * (double)param0.field_G.field_h / 1024.0);
        param0.field_I.a(((jk) this).field_l, param0.field_G.field_k, (byte) 49, param0.field_G.field_h, param0.field_G.field_e, param0.field_G.field_d);
        for (var11 = 0; var11 < ((jk) this).field_e.length; var11++) {
            var12 = ((jk) this).field_e[var11] + (double)param0.field_f;
            ((jk) this).field_d[var11][0] = (((jk) this).field_l[0] >> 1411911885) - -cr.a(4885, var9 * (var3 * var12));
            ((jk) this).field_d[var11][1] = (((jk) this).field_l[1] >> -1081309651) + cr.a(4885, var12 * var3 * var7);
            ((jk) this).field_d[var11][2] = (((jk) this).field_l[2] >> 777990157) - -cr.a(4885, var12 * var5);
        }
        if (param1 < 11) {
            this.a((byte) 65);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        for (var2 = 0; ((jk) this).field_b.length > var2; var2++) {
            ((jk) this).field_m[var2] = (nc) (Object) kh.field_gc.a(((jk) this).field_l, ((jk) this).field_b[var2], -72);
        }
        if (param0 <= 84) {
            ((jk) this).field_l = null;
        }
    }

    public jk() {
        ((jk) this).field_g = true;
        ((jk) this).field_l = new int[12];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "hh:mm:ss";
        field_f = "You<%0> all want to draw.";
        field_j = "You lost 2 lives!";
        field_i = new hj(7, 0, 1, 1);
        field_a = "Back";
        field_c = "<%0> lost 1 life!";
    }
}
