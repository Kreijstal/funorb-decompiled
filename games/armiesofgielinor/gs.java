/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements kh {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        ds.field_a = new wk[op.field_c[0].length];
        if (param0) {
            field_a = true;
        }
        le.field_c = new wk[op.field_c[0].length];
        rq.a((byte) -56);
        for (var1 = 0; var1 < op.field_c[0].length; var1++) {
            ds.field_a[var1] = new wk(vo.field_d.field_y, vo.field_d.field_v);
            le.field_c[var1] = new wk(im.field_y.field_y, im.field_y.field_v);
            ds.field_a[var1].b();
            vo.field_d.d(0, 0, op.field_c[0][var1]);
            le.field_c[var1].b();
            im.field_y.b(0, 0, op.field_c[0][var1]);
        }
        rf.b(-18862);
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.field_q = var2.field_q + 1;
        int var3 = var2.field_q;
        var2.b(1, 2);
        var2.a(ln.field_d, 0, ln.field_d.length, 113);
        var2.b(1, nh.field_E);
        var2.b(1, sm.field_b);
        var2.a(tg.field_d, 0, tg.field_d.length, -72);
        if (param1 != -8006) {
            field_b = -111;
        }
        var2.e(-var3 + var2.field_q, 5930);
    }

    final static void a(int param0) {
        double var3 = 0.0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        tm.a();
        hg.field_a = new int[260];
        fn.field_M = 11;
        int var1 = 0;
        int var2 = -93 / ((-68 - param0) / 57);
        while (256 > var1) {
            var3 = 15.0;
            hg.field_a[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var3) * 255.0);
            var1++;
        }
        int var6 = 256;
        var1 = var6;
        while (var6 < hg.field_a.length) {
            hg.field_a[var6] = 255;
            var6++;
        }
    }

    public static void a(byte param0) {
        int var1 = -29 / ((13 - param0) / 56);
        field_c = null;
    }

    final static tu a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5 = param1.a(param0, 106);
        int var6 = param1.a((byte) -65, var5, param4);
        if (param3 != -53) {
            field_a = true;
        }
        return cc.a(param1, var5, param2, true, var6);
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 > param0.field_w) {
            L1: {
              var6 = 1;
              if (param2 <= -79) {
                break L1;
              } else {
                var11 = null;
                boolean discarded$1 = gs.a((byte) -58, (int[]) null);
                break L1;
              }
            }
            L2: while (true) {
              if (5 < var6) {
                return;
              } else {
                L3: {
                  var7 = var6 + (-5 + (param1 + param0.field_B)) + (param0.field_l + -(param0.field_l >> -1259089151));
                  var8 = -(var6 * 2) + (param0.field_l >> 1935787873);
                  var9 = var6 + (param4 + (param0.field_p + (-4 + param0.field_w >> 1633679809)));
                  if (var9 < qn.field_a) {
                    break L3;
                  } else {
                    if (qn.field_f <= var9) {
                      break L3;
                    } else {
                      L4: {
                        if (qn.field_j >= var7) {
                          break L4;
                        } else {
                          qn.field_d[var9 * qn.field_l - (-var7 - -1)] = rn.a(qn.field_d[-1 + (var7 + qn.field_l * var9)], 16711422) >> 388280961;
                          break L4;
                        }
                      }
                      if (var8 + var7 >= qn.field_e) {
                        break L3;
                      } else {
                        qn.field_d[qn.field_l * var9 + (var7 - -var8)] = rn.a(16711422, qn.field_d[qn.field_l * var9 + var7 + var8]) >> -236939711;
                        break L3;
                      }
                    }
                  }
                }
                qn.e(var7, var9, var8, 0);
                var6++;
                continue L2;
              }
            }
          } else {
            var7 = 152 - -(var6 * 48 / param0.field_w);
            var8 = var7 | (var7 << -351955376 | var7 << 66422888);
            qn.e(param0.field_B + param1, var6 + param4 - -param0.field_p, param0.field_l, var8);
            var6++;
            continue L0;
          }
        }
    }

    final static boolean a(byte param0, int[] param1) {
        long var2 = 0L;
        qu var4_ref_qu = null;
        int var4 = 0;
        int var5_int = 0;
        qu var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 42) {
          if (ov.field_g != kl.field_k) {
            return false;
          } else {
            L0: {
              var2 = vi.b(126);
              if (dq.field_c == 0) {
                break L0;
              } else {
                if (0 > mg.field_f) {
                  var4_ref_qu = (qu) (Object) vj.field_b.e((byte) 127);
                  if (var4_ref_qu == null) {
                    break L0;
                  } else {
                    if ((var2 ^ -1L) < (var4_ref_qu.field_l ^ -1L)) {
                      var4_ref_qu.d(-111);
                      fk.field_b = var4_ref_qu.field_m.length;
                      mg.field_e.field_q = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (fk.field_b <= var5_int) {
                          me.field_c = ba.field_F;
                          ba.field_F = sj.field_e;
                          sj.field_e = nm.field_o;
                          nm.field_o = var4_ref_qu.field_o;
                          return true;
                        } else {
                          mg.field_e.field_o[var5_int] = var4_ref_qu.field_m[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (mg.field_f < 0) {
                  mg.field_e.field_q = 0;
                  if (es.a(param0 ^ -83, 1)) {
                    mg.field_f = mg.field_e.m(255);
                    mg.field_e.field_q = 0;
                    fk.field_b = param1[mg.field_f];
                    break L3;
                  } else {
                    return false;
                  }
                } else {
                  break L3;
                }
              }
              if (!jh.g(2)) {
                return false;
              } else {
                if (dq.field_c == 0) {
                  me.field_c = ba.field_F;
                  ba.field_F = sj.field_e;
                  sj.field_e = nm.field_o;
                  nm.field_o = mg.field_f;
                  mg.field_f = -1;
                  return true;
                } else {
                  L4: {
                    var4 = dq.field_c;
                    if (0.0 == sp.field_e) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + iq.field_e.nextGaussian() * sp.field_e);
                      if (0 > var4) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = new qu(var2 + (long)var4, mg.field_f, new byte[fk.field_b]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= fk.field_b) {
                      vj.field_b.a((byte) -119, (tc) (Object) var5);
                      mg.field_f = -1;
                      continue L2;
                    } else {
                      var5.field_m[var6] = mg.field_e.field_o[var6];
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }
}
