/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private sg field_d;
    private int field_b;
    static nh field_c;
    pj field_a;

    final static boolean a(int[] param0, byte param1) {
        long var2 = 0L;
        ai var4_ref_ai = null;
        int var4 = 0;
        int var5_int = 0;
        ai var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        if (ef.field_a == w.field_cb) {
          var2 = km.b(-1);
          if (param1 == 21) {
            L0: {
              if ((wh.field_x ^ -1) == -1) {
                break L0;
              } else {
                if (-1 < (im.field_E ^ -1)) {
                  L1: {
                    var4_ref_ai = (ai) (Object) qe.field_c.b(param1 + -21);
                    if (var4_ref_ai == null) {
                      break L1;
                    } else {
                      if (var4_ref_ai.field_n >= var2) {
                        break L1;
                      } else {
                        var4_ref_ai.f(0);
                        oo.field_a = var4_ref_ai.field_k.length;
                        kj.field_d.field_n = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= oo.field_a) {
                            mm.field_d = eb.field_f;
                            eb.field_f = wk.field_h;
                            wk.field_h = fa.field_e;
                            fa.field_e = var4_ref_ai.field_j;
                            return true;
                          } else {
                            kj.field_d.field_j[var5_int] = var4_ref_ai.field_k[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L3: while (true) {
              L4: {
                if ((im.field_E ^ -1) <= -1) {
                  break L4;
                } else {
                  kj.field_d.field_n = 0;
                  if (no.a(1, param1 + -21)) {
                    im.field_E = kj.field_d.a(true);
                    kj.field_d.field_n = 0;
                    oo.field_a = param0[im.field_E];
                    break L4;
                  } else {
                    return false;
                  }
                }
              }
              if (ah.a(param1 ^ 23)) {
                if ((wh.field_x ^ -1) != -1) {
                  L5: {
                    var4 = wh.field_x;
                    if (0.0 == u.field_s) {
                      break L5;
                    } else {
                      var4 = (int)((double)var4 + sa.field_d.nextGaussian() * u.field_s);
                      if (-1 < (var4 ^ -1)) {
                        var4 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5 = new ai((long)var4 + var2, im.field_E, new byte[oo.field_a]);
                  var6 = 0;
                  L6: while (true) {
                    if ((oo.field_a ^ -1) >= (var6 ^ -1)) {
                      qe.field_c.a((byte) 54, (q) (Object) var5);
                      im.field_E = -1;
                      continue L3;
                    } else {
                      var5.field_k[var6] = kj.field_d.field_j[var6];
                      var6++;
                      continue L6;
                    }
                  }
                } else {
                  mm.field_d = eb.field_f;
                  eb.field_f = wk.field_h;
                  wk.field_h = fa.field_e;
                  fa.field_e = im.field_E;
                  im.field_E = -1;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0) {
        ul.field_e = new ei();
        if (param0 < 81) {
            field_c = null;
        }
    }

    final void a(boolean param0) {
        if (!(((kg) this).field_a == null)) {
            ((kg) this).field_a.field_z[0] = (short)(((kg) this).field_a.field_z[0] + 1);
            if (!((short)(((kg) this).field_a.field_z[0] + 1) % 16 != 0)) {
                ((kg) this).field_a = null;
                ((kg) this).field_d.d(((kg) this).field_b);
            }
        }
        if (!param0) {
            field_c = null;
        }
    }

    kg(sg param0, int param1, int param2) {
        ((kg) this).field_b = param1;
        ((kg) this).field_d = param0;
        rm var4 = new rm(1, 1, 0);
        int discarded$0 = var4.a(0, 0, 0);
        int discarded$1 = var4.a(0, 0, 0, (byte) 0, (byte) 0, (short)param2, (short) -1);
        ((kg) this).field_a = (pj) (Object) var4.a(80, 1365, -1, -12, 12);
        ((kg) this).field_a.field_z[0] = (short)param2;
        kh var5 = new kh();
        var5.field_k = ((kg) this).field_a;
        param0.a(param1, var5);
    }

    final static int a(byte param0) {
        if (-3 >= (b.field_x ^ -1)) {
          L0: {
            if (0 == sn.field_i) {
              if (!lp.field_a.a(-12749)) {
                return 20;
              } else {
                if (!lp.field_a.a(true, "commonui")) {
                  return 40;
                } else {
                  if (eg.field_v.a(-12749)) {
                    if (eg.field_v.a(true, "commonui")) {
                      if (kb.field_a.a(-12749)) {
                        if (kb.field_a.c(-19375)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              }
            } else {
              L1: {
                if (je.field_f != null) {
                  if (je.field_f.a(-12749)) {
                    if (!je.field_f.b((byte) -37, "")) {
                      return 29;
                    } else {
                      if (je.field_f.a(true, "")) {
                        break L1;
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!lp.field_a.a(-12749)) {
                return 43;
              } else {
                if (lp.field_a.a(true, "commonui")) {
                  if (!eg.field_v.a(-12749)) {
                    return 71;
                  } else {
                    if (eg.field_v.a(true, "commonui")) {
                      if (!kb.field_a.a(-12749)) {
                        return 82;
                      } else {
                        if (!kb.field_a.c(param0 + -19424)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                } else {
                  return 57;
                }
              }
            }
          }
          L2: {
            if (param0 == 49) {
              break L2;
            } else {
              kg.a(49);
              break L2;
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    public static void b(byte param0) {
        if (param0 != -64) {
            Object var2 = null;
            boolean discarded$0 = kg.a((int[]) null, (byte) 104);
        }
        field_c = null;
    }

    static {
    }
}
