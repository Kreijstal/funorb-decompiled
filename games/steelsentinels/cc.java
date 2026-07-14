/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends gh {
    boolean field_Zb;
    int field_dc;
    long field_ec;
    static boolean field_lc;
    int field_qc;
    static String[] field_ic;
    static String field_Xb;
    int field_ac;
    int field_jc;
    String field_Vb;
    static int field_gc;
    boolean field_kc;
    gh field_Yb;
    String field_mc;
    gh field_hc;
    boolean field_nc;
    static String field_Tb;
    static ek[] field_pc;
    gh field_cc;
    gh field_oc;
    long field_fc;
    int field_Ub;
    gh field_Sb;
    static gh field_bc;
    int field_Wb;

    final static void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var3 = -68 / ((-30 - param1) / 54);
        if (!(null == n.field_x)) {
            var4 = n.field_x.a(param2, -95);
            if (!(var4 == -2)) {
                if (!(0 == (var4 ^ -1))) {
                    var5 = n.field_x.d((byte) 63) ? 1 : 0;
                    wc.a(0, var5 != 0, n.field_x.field_hc, var4, n.field_x.b(true), param0);
                }
                n.field_x = null;
                rh.a(false);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 == 0) {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                if (null == nf.field_b) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            vb.field_c = false;
            break L0;
          }
          L2: {
            if (!param0) {
              if (null != nf.field_b) {
                if (0 < je.field_t) {
                  je.field_t = je.field_t - 1;
                  break L2;
                } else {
                  if (-1 > (bd.field_c ^ -1)) {
                    bd.field_c = bd.field_c - 1;
                    break L2;
                  } else {
                    if (fj.field_f < an.field_h) {
                      L3: {
                        if (fj.field_f == 0) {
                          nj.a(false, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      fj.field_f = fj.field_f + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (ni.field_a != null) {
                  if ((je.field_t ^ -1) >= -1) {
                    if (0 >= fj.field_f) {
                      if (an.field_h <= bd.field_c) {
                        break L2;
                      } else {
                        L4: {
                          if (0 != bd.field_c) {
                            break L4;
                          } else {
                            nj.a(true, true);
                            break L4;
                          }
                        }
                        bd.field_c = bd.field_c + 1;
                        break L2;
                      }
                    } else {
                      fj.field_f = fj.field_f - 1;
                      break L2;
                    }
                  } else {
                    je.field_t = je.field_t - 1;
                    break L2;
                  }
                } else {
                  vb.field_c = false;
                  if (0 >= bd.field_c) {
                    if (fj.field_f > 0) {
                      fj.field_f = fj.field_f - 1;
                      break L2;
                    } else {
                      if (je.field_t < an.field_h) {
                        bf.m(854);
                        je.field_t = je.field_t + 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    bd.field_c = bd.field_c - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (-1 > (je.field_t ^ -1)) {
                je.field_t = je.field_t - 1;
                break L2;
              } else {
                if (0 < bd.field_c) {
                  bd.field_c = bd.field_c - 1;
                  break L2;
                } else {
                  if (fj.field_f > 0) {
                    fj.field_f = fj.field_f - 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void k(int param0) {
        field_Xb = null;
        field_Tb = null;
        field_ic = null;
        if (param0 < 73) {
            cc.a(24, (byte) -21, true);
        }
        field_bc = null;
        field_pc = null;
    }

    final boolean d(byte param0) {
        if (param0 != -36) {
            cc.a(-73, (byte) -40, false);
        }
        return !((cc) this).a((byte) 30) ? true : false;
    }

    cc(String param0, String param1, long param2) {
        super(0L, (gh) null);
        ((cc) this).field_mc = param0;
        ((cc) this).field_ec = param2;
        ((cc) this).field_Vb = param1;
        CharSequence var6 = (CharSequence) (Object) ((cc) this).field_mc;
        String discarded$0 = ui.a(1, var6);
    }

    final boolean a(cc param0, int param1) {
        if ((!param0.field_kc ? 1 : 0) == (((cc) this).field_kc ? 1 : 0)) {
            return ((cc) this).field_kc;
        }
        if (param1 >= -35) {
            Object var4 = null;
            boolean discarded$0 = ((cc) this).a((cc) null, 15);
        }
        if (!(param0.field_Zb == ((cc) this).field_Zb)) {
            return ((cc) this).field_Zb;
        }
        return ((cc) this).field_fc < param0.field_fc ? true : false;
    }

    final static void j(int param0) {
        int var1 = 0;
        int var2 = SteelSentinels.field_G;
        gd.field_qb.c((byte) -118);
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            bm.field_T[var1] = 0L;
        }
        for (var1 = param0; 32 > var1; var1++) {
            hg.field_c[var1] = 0L;
        }
        di.field_a = 0;
    }

    final void a(int param0, String param1, String param2) {
        ((cc) this).field_mc = param1;
        ((cc) this).field_Vb = param2;
        CharSequence var5 = (CharSequence) (Object) ((cc) this).field_mc;
        String discarded$0 = ui.a(1, var5);
        int var4 = -54 / ((54 - param0) / 38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ic = new String[]{"TRAINING", "ILOLIAN INCIDENT", "SOLARITE WAR"};
        field_Tb = "<%1> was damaged by <%0>";
        field_lc = false;
    }
}
