/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends gd {
    private nk field_m;
    static int[] field_i;
    static long field_l;
    static float[] field_k;
    static int field_j;

    final static void a(ei param0, vj param1, int param2, int param3, int param4, vj param5, int param6, ei param7) {
        int var10_int = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        lb var14 = null;
        lb var15 = null;
        Object var16 = null;
        Object var17 = null;
        gj var17_ref = null;
        Object var18 = null;
        gj var18_ref = null;
        Object var19 = null;
        gj var19_ref = null;
        lb var20 = null;
        L0: {
          var18 = null;
          var17 = null;
          var19 = null;
          var16 = null;
          var13 = HoldTheLine.field_D;
          if (param1.field_k - param5.field_k > 1) {
            break L0;
          } else {
            if ((param1.field_k - param5.field_k ^ -1) > 0) {
              break L0;
            } else {
              L1: {
                if (param1 instanceof lb) {
                  var15 = (lb) (Object) param1;
                  if (param5 instanceof lb) {
                    var20 = (lb) (Object) param5;
                    if (!th.a(-1, var15, var20)) {
                      break L1;
                    } else {
                      var10 = mm.field_d + (float)param4;
                      var11 = (float)param6 + lk.field_b;
                      oe.a(var11, param2, param7, (byte) 63, var10, param0);
                      break L1;
                    }
                  } else {
                    L2: {
                      var19_ref = (gj) (Object) param5;
                      var10_int = ba.a(var15, 0, var19_ref);
                      if (var10_int >= 1) {
                        var11 = (float)param4 + mm.field_d;
                        var12 = (float)param6 + var19_ref.b(lk.field_b, param3 ^ 7518);
                        oe.a(var12, param2, param7, (byte) 113, var11, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if ((var10_int ^ -1) != -3) {
                      break L1;
                    } else {
                      var11 = rb.field_g + (float)param4;
                      var12 = var19_ref.b(cj.field_G, -7517) + (float)param6;
                      oe.a(var12, param2, param7, (byte) 127, var11, param0);
                      break L1;
                    }
                  }
                } else {
                  var18_ref = (gj) (Object) param1;
                  if (param5 instanceof lb) {
                    L3: {
                      var14 = (lb) (Object) param5;
                      var10_int = ba.a(var14, 0, var18_ref);
                      if (var10_int < 1) {
                        break L3;
                      } else {
                        var11 = (float)param4 + var18_ref.b(lk.field_b, -7517);
                        var12 = mm.field_d + (float)param6;
                        oe.a(var12, param2, param7, (byte) 62, var11, param0);
                        break L3;
                      }
                    }
                    if (var10_int == 2) {
                      var11 = var18_ref.b(cj.field_G, -7517) + (float)param4;
                      var12 = rb.field_g + (float)param6;
                      oe.a(var12, param2, param7, (byte) 78, var11, param0);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L4: {
                      var17_ref = (gj) (Object) param5;
                      var10_int = i.a(var17_ref, var18_ref, -6218);
                      if (-2 >= (var10_int ^ -1)) {
                        var11 = var18_ref.b(mm.field_d, -7517) + (float)param4;
                        var12 = var17_ref.b(lk.field_b, param3 ^ 7518) + (float)param6;
                        oe.a(var12, param2, param7, (byte) 110, var11, param0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (-3 != (var10_int ^ -1)) {
                      break L1;
                    } else {
                      var11 = (float)param4 + var18_ref.b(rb.field_g, param3 ^ 7518);
                      var12 = (float)param6 + var17_ref.b(cj.field_G, param3 ^ 7518);
                      oe.a(var12, param2, param7, (byte) 91, var11, param0);
                      break L1;
                    }
                  }
                }
              }
              L5: {
                if (param3 == -3) {
                  break L5;
                } else {
                  field_i = null;
                  break L5;
                }
              }
              return;
            }
          }
        }
    }

    qf(nk param0, nk param1) {
        super(param0);
        ((qf) this).field_m = param1;
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        if (!(pj.b((byte) 80))) {
            wm.a(param3, false, param0);
            return;
        }
        ej.field_b = param0;
        if (ej.field_b == dg.field_c) {
            return;
        }
        lm.field_a = dg.field_c;
        if (param2 != 3865) {
            field_j = 35;
            if (dg.field_c != -14) {
                if (!(0 == dg.field_c)) {
                    ((ti) (Object) l.field_a[dg.field_c]).i(param2 ^ 3923);
                }
                vg.field_G = 1;
                gg.field_L = param1 ? true : false;
                return;
            }
            ((ec) (Object) l.field_a[dg.field_c]).d((byte) -126);
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        if ((dg.field_c ^ -1) == -14) {
            ((ec) (Object) l.field_a[dg.field_c]).d((byte) -126);
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        if (0 == (dg.field_c ^ -1)) {
            vg.field_G = 1;
            gg.field_L = param1 ? true : false;
            return;
        }
        ((ti) (Object) l.field_a[dg.field_c]).i(param2 ^ 3923);
        vg.field_G = 1;
        gg.field_L = param1 ? true : false;
    }

    final static void a(int param0, int param1, byte[] param2) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var3 = 256;
        int[] var4 = new int[256];
        for (var5 = 0; -257 < (var5 ^ -1); var5++) {
            var3++;
            var4[var5] = pk.a((int) param2[var3], 255);
        }
        // wide iinc 3 256
        int var7 = param0;
        var5 = var7;
        while (var7 < 256) {
            param2[var3] = (byte)(param2[var3] + -param1);
            var3 = var3 + var4[var7];
            var7++;
        }
    }

    final fd a(String param0, byte param1) {
        ia var4 = null;
        if (param1 < 52) {
            field_k = null;
            if (!(((qf) this).field_m instanceof wk)) {
                return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
            }
            var4 = ((wk) (Object) ((qf) this).field_m).a(1);
            if (var4 == null) {
                return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
            }
            if (var4.b(-7447) == tg.field_d) {
                return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
            }
            return g.field_k;
        }
        if (!(((qf) this).field_m instanceof wk)) {
            return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
        }
        ia var5 = ((wk) (Object) ((qf) this).field_m).a(1);
        if (var5 != null) {
            if (var5.b(-7447) == tg.field_d) {
                return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
            }
            return g.field_k;
        }
        return param0.equals((Object) (Object) ((qf) this).field_m.field_q) ? tg.field_d : g.field_k;
    }

    final static void a(boolean param0) {
        ja.a(-1848651292, en.a(95));
        if (!param0) {
            qf.g(33);
        }
    }

    public static void g(int param0) {
        field_k = null;
        if (param0 != -14) {
            return;
        }
        field_i = null;
    }

    final static ui a(int param0, el param1) {
        if (param0 != 293) {
            field_i = null;
            return lg.a(db.a(param1, 100, 96), (byte) -68);
        }
        return lg.a(db.a(param1, 100, 96), (byte) -68);
    }

    final static boolean a(byte param0, ee param1, ee param2) {
        if (!param1.field_z) {
          return false;
        } else {
          if (param2.field_z) {
            if (param0 < -60) {
              L0: {
                if ((param1.field_q + -param2.field_q ^ -1) < -2) {
                  break L0;
                } else {
                  if ((param1.field_q + -param2.field_q ^ -1) > 0) {
                    break L0;
                  } else {
                    if ((param2.field_A.field_f - param1.field_A.field_f) * (param2.field_A.field_f + -param1.field_A.field_f) + (-param1.field_A.field_h + param2.field_A.field_h) * (-param1.field_A.field_h + param2.field_A.field_h) <= (param2.field_B + param1.field_B) * (param2.field_B + param1.field_B)) {
                      L1: {
                        if (!param1.field_p) {
                          break L1;
                        } else {
                          if (!param2.field_p) {
                            break L1;
                          } else {
                            return jf.a(param1.field_w, param1.field_A, param2.field_i, param1.field_k, param2.field_w, param2.field_k, param1.field_i, param2.field_A, 7527);
                          }
                        }
                      }
                      if (param1.field_p) {
                        return ck.a(param2.field_B, true, param1.field_i, param2.field_A, param1.field_A, param1.field_k, param1.field_w);
                      } else {
                        if (!param2.field_p) {
                          return true;
                        } else {
                          return ca.a(param1.field_A, param2.field_i, param2.field_A, param1.field_B, param2.field_w, param2.field_k, 110);
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final String a(String param0, boolean param1) {
        ia var3 = null;
        if (((qf) this).field_m instanceof wk) {
            var3 = ((wk) (Object) ((qf) this).field_m).a(1);
            if (var3 == null) {
                if (!(param0.equals((Object) (Object) ((qf) this).field_m.field_q))) {
                    return jd.field_L;
                }
                if (param1) {
                    return null;
                }
                field_l = 24L;
                return null;
            }
            if (var3.b(-7447) != tg.field_d) {
                return var3.b((byte) -59);
            }
            if (param0.equals((Object) (Object) ((qf) this).field_m.field_q)) {
                return var3.b((byte) -59);
            }
            return jd.field_L;
        }
        if (!(param0.equals((Object) (Object) ((qf) this).field_m.field_q))) {
            return jd.field_L;
        }
        if (param1) {
            return null;
        }
        field_l = 24L;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new float[]{1.5f, 1.25f, 1.0f};
    }
}
