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
        try {
            int discarded$14 = 37;
            ub.a(md.field_d, (lr) (Object) ol.field_c, cq.field_d, iq.field_f, uo.field_Lb, ei.field_A, pa.field_M, i.field_l, param0, kq.field_a, ag.field_f);
            if (param1) {
                Object var5 = null;
                jk.a(true, true, (di) null, (di) null);
            }
            sg.field_M = aj.a(0, "lobby", param2, "chatfilter");
            nk.field_i[1] = cl.field_i;
            nk.field_i[2] = rj.field_j;
            nk.field_i[0] = fq.field_Db;
            c.a((lr) (Object) ae.field_a, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "jk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(eg param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        eg var3_ref = null;
        int var4 = 0;
        eg var5_ref_eg = null;
        int var5 = 0;
        int var6_int = 0;
        eg var6 = null;
        int var7_int = 0;
        eg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            int discarded$3 = 1;
            nn.a(param0);
            int discarded$4 = 5;
            eg discarded$5 = gn.a(param0);
            param0.e();
            L1: while (true) {
              if (1500 <= -param0.field_V + param0.field_x) {
                L2: {
                  var13 = new int[3];
                  ln.a(var13, 0, param0);
                  ((jk) this).field_b = new eg[2];
                  if (param1 <= -96) {
                    break L2;
                  } else {
                    ((jk) this).field_m = null;
                    break L2;
                  }
                }
                ((jk) this).field_m = new nc[((jk) this).field_b.length];
                ((jk) this).field_e = new double[((jk) this).field_b.length];
                ((jk) this).field_d = new int[((jk) this).field_b.length][3];
                var3_ref = param0;
                var4 = 0;
                L3: while (true) {
                  if (var4 >= ((jk) this).field_b.length) {
                    break L0;
                  } else {
                    L4: {
                      if (var4 >= -1 + ((jk) this).field_b.length) {
                        ((jk) this).field_b[var4] = var3_ref;
                        break L4;
                      } else {
                        ((jk) this).field_b[var4] = hq.b((byte) 121);
                        var5_ref_eg = hq.b((byte) 124);
                        var6_int = (-param0.field_V + param0.field_x) * (1 + var4) / ((jk) this).field_b.length + param0.field_V;
                        ej.a(0, ((jk) this).field_b[var4], 0, false, var6_int, 0, 0, 1, var5_ref_eg, var3_ref);
                        var3_ref = var5_ref_eg;
                        break L4;
                      }
                    }
                    ((jk) this).field_b[var4].a();
                    ((jk) this).field_b[var4].e();
                    var6 = ((jk) this).field_b[var4];
                    d.a(var6, -23109);
                    var5 = (var6.field_V + var6.field_x) / 2;
                    var7_int = 0;
                    L5: while (true) {
                      if (var6.field_q.length <= var7_int) {
                        L6: {
                          var6.a();
                          ((jk) this).field_e[var4] = (double)rj.e(-((jk) this).field_b[0].field_V + var5, 3);
                          if (var4 > 0) {
                            var7 = ((jk) this).field_b[var4 + -1];
                            var7.d();
                            var8 = var7.field_V + var7.field_x >> 1;
                            var7.a((um) (Object) var6, 0, 0, -var8 + var5, false);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var4++;
                        continue L3;
                      } else {
                        var6.field_q[var7_int] = var6.field_q[var7_int] - var5;
                        var7_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var3_int = 0;
                L7: while (true) {
                  if (param0.field_B <= var3_int) {
                    param0.a();
                    param0.e();
                    continue L1;
                  } else {
                    param0.field_g[var3_int] = param0.field_g[var3_int] << 1;
                    param0.field_Y[var3_int] = param0.field_Y[var3_int] << 1;
                    param0.field_q[var3_int] = param0.field_q[var3_int] << 1;
                    var3_int++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("jk.I(");
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final static void a(long param0, int param1) {
        oq var4 = ej.field_j;
        var4.b(false, param1);
        var4.field_v = var4.field_v + 1;
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
            for (var13 = 0; var13 < 8; var13++) {
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((jk) this).field_m.length) {
                L2: {
                  if (param0 == 32624) {
                    break L2;
                  } else {
                    ((jk) this).field_e = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                ((jk) this).field_l[0] = ((jk) this).field_d[var3_int][0];
                ((jk) this).field_l[1] = ((jk) this).field_d[var3_int][1];
                ((jk) this).field_l[2] = ((jk) this).field_d[var3_int][2];
                ((jk) this).field_m[var3_int].a(param1, ((jk) this).field_l);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static void a(boolean param0) {
        vh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        vh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        vh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        vh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        vh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        vh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        vh stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        vh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        vh stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        vh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        vh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        vh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        vh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        vh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        vh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        vh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        vh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        vh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        vh stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        vh stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        vh stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        L0: {
          wh.a(-640 + qh.field_l >> 1, 0, qh.field_l - -640 >> 1, (byte) -88, qh.field_f);
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
                stackOut_4_0 = ir.field_a;
                stackOut_4_1 = -79;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (!param0) {
                  break L3;
                } else {
                  stackOut_5_0 = (vh) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (tf.field_d) {
                    break L3;
                  } else {
                    stackOut_6_0 = (vh) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (vh) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            }
            L4: {
              L5: {
                ((vh) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2 != 0);
                stackOut_8_0 = oi.field_n;
                stackOut_8_1 = -79;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (!param0) {
                  break L5;
                } else {
                  stackOut_9_0 = (vh) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (tf.field_d) {
                    break L5;
                  } else {
                    stackOut_10_0 = (vh) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (vh) (Object) stackIn_11_0;
              stackOut_11_1 = stackIn_11_1;
              stackOut_11_2 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            }
            ((vh) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2 != 0);
            break L0;
          }
        }
        L6: {
          L7: {
            if (uf.field_z > 0) {
              break L7;
            } else {
              if (nj.field_b > 0) {
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
              stackOut_19_0 = so.field_k;
              stackOut_19_1 = -79;
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              if (!param0) {
                break L10;
              } else {
                stackOut_20_0 = (vh) (Object) stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (nr.field_bb) {
                  break L10;
                } else {
                  stackOut_21_0 = (vh) (Object) stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L9;
                }
              }
            }
            stackOut_22_0 = (vh) (Object) stackIn_22_0;
            stackOut_22_1 = stackIn_22_1;
            stackOut_22_2 = 0;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            stackIn_23_2 = stackOut_22_2;
            break L9;
          }
          L11: {
            L12: {
              ((vh) (Object) stackIn_23_0).a((byte) stackIn_23_1, stackIn_23_2 != 0);
              stackOut_23_0 = uq.field_f;
              stackOut_23_1 = -79;
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              if (!param0) {
                break L12;
              } else {
                stackOut_24_0 = (vh) (Object) stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (nr.field_bb) {
                  break L12;
                } else {
                  stackOut_25_0 = (vh) (Object) stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
            }
            stackOut_26_0 = (vh) (Object) stackIn_26_0;
            stackOut_26_1 = stackIn_26_1;
            stackOut_26_2 = 0;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            stackIn_27_2 = stackOut_26_2;
            break L11;
          }
          ((vh) (Object) stackIn_27_0).a((byte) stackIn_27_1, stackIn_27_2 != 0);
          break L6;
        }
        oc.a(114);
    }

    public static void b() {
        field_i = null;
        field_c = null;
        field_k = null;
        field_f = null;
        field_a = null;
        field_j = null;
        field_h = null;
    }

    final static void a(int param0, qp param1) {
        if (param0 <= 106) {
            return;
        }
        if (!(param1 != null)) {
            return;
        }
        try {
            im.field_Ub = param1;
            e.field_a.field_T.d((byte) 53);
            e.field_a.a(-112, (vh) (Object) im.field_Ub);
            fm.field_H = true;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "jk.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, uf param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$4 = 95;
              this.a(param1);
              int discarded$5 = 112;
              this.a();
              ((jk) this).field_g = false;
              if (param0 == 0) {
                break L1;
              } else {
                var4 = null;
                ((jk) this).a(-44, (int[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(uf param0) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        double var12 = 0.0;
        int var14 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            var3_double = Math.sin((double)param0.field_G.field_k * 3.141592653589793 / 1024.0);
            var5 = Math.cos(3.141592653589793 * (double)param0.field_G.field_k / 1024.0);
            var7 = Math.sin((double)param0.field_G.field_h * 3.141592653589793 / 1024.0);
            var9 = Math.cos(3.141592653589793 * (double)param0.field_G.field_h / 1024.0);
            param0.field_I.a(((jk) this).field_l, param0.field_G.field_k, (byte) 49, param0.field_G.field_h, param0.field_G.field_e, param0.field_G.field_d);
            var11 = 0;
            L1: while (true) {
              if (var11 >= ((jk) this).field_e.length) {
                break L0;
              } else {
                var12 = ((jk) this).field_e[var11] + (double)param0.field_f;
                ((jk) this).field_d[var11][0] = (((jk) this).field_l[0] >> 13) - -cr.a(4885, var9 * (var3_double * var12));
                ((jk) this).field_d[var11][1] = (((jk) this).field_l[1] >> 13) + cr.a(4885, var12 * var3_double * var7);
                ((jk) this).field_d[var11][2] = (((jk) this).field_l[2] >> 13) - -cr.a(4885, var12 * var5);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jk.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 95 + ')');
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = Pool.field_O;
        for (var2 = 0; ((jk) this).field_b.length > var2; var2++) {
            ((jk) this).field_m[var2] = (nc) (Object) kh.field_gc.a(((jk) this).field_l, ((jk) this).field_b[var2], -72);
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
