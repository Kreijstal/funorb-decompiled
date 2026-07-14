/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class di extends oh {
    int field_l;
    int field_n;
    static String field_j;
    static String field_q;
    static bi[] field_i;
    int field_h;
    static String field_k;
    int field_o;
    static boolean[] field_p;
    static int field_m;

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        sk var4_ref_sk = null;
        int var4 = 0;
        int var5_int = 0;
        sk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (cs.field_j == ih.field_f) {
          L0: {
            var2 = pr.a(14274);
            if (0 == jc.field_o) {
              break L0;
            } else {
              if (-1 < (ar.field_b ^ -1)) {
                var4_ref_sk = (sk) (Object) oe.field_h.d(0);
                if (var4_ref_sk == null) {
                  break L0;
                } else {
                  if ((var4_ref_sk.field_l ^ -1L) <= (var2 ^ -1L)) {
                    break L0;
                  } else {
                    var4_ref_sk.b((byte) -61);
                    rr.field_t = var4_ref_sk.field_h.length;
                    sa.field_a.field_j = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (rr.field_t <= var5_int) {
                        rm.field_e = tp.field_g;
                        tp.field_g = kp.field_n;
                        kp.field_n = ej.field_e;
                        ej.field_e = var4_ref_sk.field_j;
                        return true;
                      } else {
                        sa.field_a.field_h[var5_int] = var4_ref_sk.field_h[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (param1 == 1) {
              break L2;
            } else {
              field_i = null;
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if (ar.field_b < 0) {
                sa.field_a.field_j = 0;
                if (!es.a(param1 ^ -73, 1)) {
                  return false;
                } else {
                  ar.field_b = sa.field_a.h((byte) 126);
                  sa.field_a.field_j = 0;
                  rr.field_t = param0[ar.field_b];
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!uc.d((byte) -50)) {
              return false;
            } else {
              if (jc.field_o == 0) {
                rm.field_e = tp.field_g;
                tp.field_g = kp.field_n;
                kp.field_n = ej.field_e;
                ej.field_e = ar.field_b;
                ar.field_b = -1;
                return true;
              } else {
                L5: {
                  var4 = jc.field_o;
                  if (0.0 != aq.field_h) {
                    var4 = (int)((double)var4 + na.field_u.nextGaussian() * aq.field_h);
                    if (var4 >= 0) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var5 = new sk(var2 - -(long)var4, ar.field_b, new byte[rr.field_t]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= rr.field_t) {
                    oe.field_h.a((byte) -113, (oh) (Object) var5);
                    ar.field_b = -1;
                    continue L3;
                  } else {
                    var5.field_h[var6] = sa.field_a.field_h[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final static ve a(String param0, int param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (sl.field_m != null) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = ji.a(var6, true);
            if (param1 > 115) {
              break L0;
            } else {
              di.c(false);
              break L0;
            }
          }
          L1: {
            if (var2 == null) {
              var2 = param0;
              break L1;
            } else {
              break L1;
            }
          }
          var3 = (ve) (Object) sl.field_m.a(65280, (long)var2.hashCode());
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var7 = (CharSequence) (Object) var3.field_Ab;
                var4 = ji.a(var7, true);
                if (var4 == null) {
                  var4 = var3.field_Ab;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var4.equals((Object) (Object) var2)) {
                return var3;
              } else {
                var3 = (ve) (Object) sl.field_m.d((byte) -116);
                continue L2;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(ln param0, boolean param1, ob param2) {
        param2.c(param0 == null ? -1 : param0.field_p, (byte) -57);
        if (param1) {
            di.c(true);
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        field_k = null;
        field_q = null;
        field_i = null;
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final static void a(boolean param0, boolean param1) {
        qr stackIn_5_0 = null;
        qr stackIn_6_0 = null;
        qr stackIn_7_0 = null;
        qr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qr stackIn_9_0 = null;
        qr stackIn_10_0 = null;
        qr stackIn_11_0 = null;
        qr stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qr stackIn_22_0 = null;
        qr stackIn_23_0 = null;
        qr stackIn_24_0 = null;
        qr stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        qr stackIn_26_0 = null;
        qr stackIn_27_0 = null;
        qr stackIn_28_0 = null;
        qr stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        qr stackOut_4_0 = null;
        qr stackOut_5_0 = null;
        qr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qr stackOut_8_0 = null;
        qr stackOut_9_0 = null;
        qr stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qr stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        qr stackOut_21_0 = null;
        qr stackOut_22_0 = null;
        qr stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        qr stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        qr stackOut_25_0 = null;
        qr stackOut_26_0 = null;
        qr stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        qr stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          ke.a(-6187, gf.field_b - -640 >> -778030335, gf.field_k, 0, -640 + gf.field_b >> -587007327);
          if (-1 <= (qa.field_t ^ -1)) {
            break L0;
          } else {
            L1: {
              if (gn.field_y != null) {
                gn.field_y.c(ia.field_j.field_hb, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_4_0 = ia.field_j;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_5_0 = (qr) (Object) stackIn_5_0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (on.field_b) {
                    break L3;
                  } else {
                    stackOut_6_0 = (qr) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (qr) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              L5: {
                ((qr) (Object) stackIn_8_0).b(stackIn_8_1 != 0, 102);
                stackOut_8_0 = se.field_i;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_9_0 = (qr) (Object) stackIn_9_0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (on.field_b) {
                    break L5;
                  } else {
                    stackOut_10_0 = (qr) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (qr) (Object) stackIn_11_0;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L4;
            }
            ((qr) (Object) stackIn_12_0).b(stackIn_12_1 != 0, 119);
            break L0;
          }
        }
        L6: {
          if (!param0) {
            break L6;
          } else {
            field_p = null;
            break L6;
          }
        }
        L7: {
          L8: {
            if (bc.field_b > 0) {
              break L8;
            } else {
              if ((ee.field_k ^ -1) >= -1) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (null != gn.field_y) {
              gn.field_y.c(am.field_xb.field_hb, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            L11: {
              stackOut_21_0 = am.field_xb;
              stackIn_24_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param1) {
                break L11;
              } else {
                stackOut_22_0 = (qr) (Object) stackIn_22_0;
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (ti.field_e) {
                  break L11;
                } else {
                  stackOut_23_0 = (qr) (Object) stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L10;
                }
              }
            }
            stackOut_24_0 = (qr) (Object) stackIn_24_0;
            stackOut_24_1 = 0;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            break L10;
          }
          L12: {
            L13: {
              ((qr) (Object) stackIn_25_0).b(stackIn_25_1 != 0, 123);
              stackOut_25_0 = pf.field_g;
              stackIn_28_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param1) {
                break L13;
              } else {
                stackOut_26_0 = (qr) (Object) stackIn_26_0;
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (ti.field_e) {
                  break L13;
                } else {
                  stackOut_27_0 = (qr) (Object) stackIn_27_0;
                  stackOut_27_1 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L12;
                }
              }
            }
            stackOut_28_0 = (qr) (Object) stackIn_28_0;
            stackOut_28_1 = 0;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            break L12;
          }
          ((qr) (Object) stackIn_29_0).b(stackIn_29_1 != 0, 115);
          break L7;
        }
        ln.f((byte) 123);
    }

    di() {
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        pf var4 = null;
        ve var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        fc var16 = null;
        fc var17 = null;
        ub stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ub stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        ub stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        ub stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        qr stackOut_17_0 = null;
        qr stackOut_19_0 = null;
        String stackOut_19_1 = null;
        qr stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == -7904) {
          L0: {
            stackOut_2_0 = wg.field_a.field_Db;
            stackOut_2_1 = param2 * ((cr.field_c - -2) * 3);
            stackOut_2_2 = 2 + cr.field_c;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_4_2 = stackOut_2_2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            if (wg.field_a.field_Db != hp.field_l) {
              stackOut_4_0 = (ub) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = stackIn_4_2;
              stackOut_4_3 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              break L0;
            } else {
              stackOut_3_0 = (ub) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              break L0;
            }
          }
          L1: {
            L2: {
              var3 = ((ub) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3 != 0, -76, param1, 2) ? 1 : 0;
              var4 = wg.field_a.field_Eb.field_M;
              if (2 == po.field_b) {
                break L2;
              } else {
                if (1 == po.field_b) {
                  break L2;
                } else {
                  wg.field_a.field_s = false;
                  wg.field_a.field_Db.field_zb.field_z = tb.field_c;
                  fj.a(false, wg.field_a.field_Eb);
                  break L1;
                }
              }
            }
            wg.field_a.field_Db.field_zb.field_z = null;
            wg.field_a.field_s = true;
            var5 = null;
            var6 = (ve) (Object) var4.d(param0 ^ -7904);
            L3: while (true) {
              if (var6 == null) {
                L4: {
                  if (-1 == (wg.field_a.field_Fb.field_rb ^ -1)) {
                    break L4;
                  } else {
                    lg.field_e = new jp(wg.field_a.field_Fb.field_B, wg.field_a.field_Fb.field_N, wg.field_a.field_Fb.field_K, wg.field_a.field_Fb.field_mb, ob.field_l, h.field_v, ii.field_u, ii.field_u);
                    ia.field_b = 2;
                    break L4;
                  }
                }
                if (wg.field_a.field_yb.field_rb == 0) {
                  break L1;
                } else {
                  lg.field_e = new jp(wg.field_a.field_yb.field_B, wg.field_a.field_yb.field_N, wg.field_a.field_yb.field_K, wg.field_a.field_yb.field_mb, ln.field_E, h.field_v, ii.field_u, ii.field_u);
                  ia.field_b = 3;
                  break L1;
                }
              } else {
                L5: {
                  var7 = 0;
                  if (null != var6.field_M) {
                    break L5;
                  } else {
                    var6.field_Cb = new qr(0L, ek.field_E);
                    var6.a(param0 ^ -7900, var6.field_Cb);
                    var6.field_Db = new qr(0L, ek.field_E);
                    var6.a(4, var6.field_Db);
                    var7 = 1;
                    var6.e((byte) -123);
                    break L5;
                  }
                }
                L6: {
                  var6.field_K = wg.field_a.field_Eb.field_K;
                  var6.field_Cb.a(var6.field_K, cr.field_c, (byte) 78, 0, 0);
                  var8 = 0;
                  if (var6.field_Bb == null) {
                    break L6;
                  } else {
                    if (var6.field_Bb.equals((Object) (Object) "")) {
                      break L6;
                    } else {
                      var6.field_Db.field_jb = 16737894;
                      var6.field_Db.field_pb = ke.field_i;
                      var8 = 1;
                      var6.field_Db.a(3 + ke.field_i.field_o, cr.field_c, (byte) 126, 0, 0);
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = 0;
                  var10 = var6.field_K;
                  if (var8 == 0) {
                    break L7;
                  } else {
                    var9 = ke.field_i.field_o - -3;
                    var10 = var10 - var9;
                    break L7;
                  }
                }
                L8: {
                  stackOut_17_0 = var6.field_Cb;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (0 < var10) {
                    stackOut_19_0 = (qr) (Object) stackIn_19_0;
                    stackOut_19_1 = nq.a(var6.field_Cb.field_nb, var6.field_Ab, var10);
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L8;
                  } else {
                    stackOut_18_0 = (qr) (Object) stackIn_18_0;
                    stackOut_18_1 = var6.field_Ab;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L8;
                  }
                }
                L9: {
                  stackIn_20_0.field_z = stackIn_20_1;
                  if (var6.field_Cb.field_z.equals((Object) (Object) var6.field_Ab)) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L9;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L9;
                  }
                }
                L10: {
                  var11 = stackIn_23_0;
                  var6.field_Cb.a(var10, cr.field_c, (byte) 39, 0, var9);
                  if (var3 != 0) {
                    break L10;
                  } else {
                    var6.field_gb = cr.field_c + -var6.field_mb;
                    break L10;
                  }
                }
                L11: {
                  if (var7 != 0) {
                    wg.field_a.field_Eb.a(2, (qr) (Object) var5, (qr) (Object) var6, (byte) 55);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var6.field_Db == null) {
                    L13: {
                      if (var6.field_Cb.field_L) {
                        break L13;
                      } else {
                        if (!var6.field_Cb.field_L) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var11 == 0) {
                      break L12;
                    } else {
                      dn.field_k = var6.field_Ab;
                      break L12;
                    }
                  } else {
                    if (!var6.field_Cb.field_L) {
                      break L12;
                    } else {
                      if (var11 == 0) {
                        break L12;
                      } else {
                        dn.field_k = var6.field_Ab;
                        break L12;
                      }
                    }
                  }
                }
                L14: {
                  var5 = var6;
                  if (0 != var6.field_rb) {
                    tp.a((int[]) null, 0L, var6.field_Ab, var6.field_Eb, param0 + 8197, wg.field_a.field_Db, (qr) (Object) var6, -1, -1);
                    var16 = hp.field_m;
                    var13_ref = qg.field_o;
                    var16.field_j.a(1, 7, var13_ref);
                    var17 = hp.field_m;
                    var13 = nh.field_p;
                    var14 = td.field_P;
                    var17.field_j.b(0, 0, 0, var13, var14);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var6 = (ve) (Object) var4.a((byte) -71);
                continue L3;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Owner";
        field_k = "Public chat is unavailable while setting up a rated game.";
        field_p = new boolean[112];
    }
}
