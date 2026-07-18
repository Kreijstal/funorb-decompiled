/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private sg field_d;
    private int field_b;
    static nh field_c;
    pj field_a;

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ai var4_ref_ai = null;
        int var4 = 0;
        int var5_int = 0;
        ai var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = Torquing.field_u;
        try {
          if (ef.field_a == w.field_cb) {
            var2_long = km.b(-1);
            L0: {
              L1: {
                if (wh.field_x == 0) {
                  break L1;
                } else {
                  if (im.field_E < 0) {
                    L2: {
                      var4_ref_ai = (ai) (Object) qe.field_c.b(0);
                      if (var4_ref_ai == null) {
                        break L2;
                      } else {
                        if (var4_ref_ai.field_n >= var2_long) {
                          break L2;
                        } else {
                          var4_ref_ai.f(0);
                          oo.field_a = var4_ref_ai.field_k.length;
                          kj.field_d.field_n = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= oo.field_a) {
                              mm.field_d = eb.field_f;
                              eb.field_f = wk.field_h;
                              wk.field_h = fa.field_e;
                              fa.field_e = var4_ref_ai.field_j;
                              stackOut_14_0 = 1;
                              stackIn_15_0 = stackOut_14_0;
                              return stackIn_15_0 != 0;
                            } else {
                              kj.field_d.field_j[var5_int] = var4_ref_ai.field_k[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_17_0 = im.field_E;
                    stackIn_19_0 = stackOut_17_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_16_0 = im.field_E;
              stackIn_19_0 = stackOut_16_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_19_0 >= 0) {
                  break L5;
                } else {
                  kj.field_d.field_n = 0;
                  if (no.a(1, 0)) {
                    im.field_E = kj.field_d.a(true);
                    kj.field_d.field_n = 0;
                    oo.field_a = param0[im.field_E];
                    break L5;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                }
              }
              if (ah.a(2)) {
                if (wh.field_x != 0) {
                  L6: {
                    var4 = wh.field_x;
                    if (0.0 == u.field_s) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + sa.field_d.nextGaussian() * u.field_s);
                      if (var4 < 0) {
                        var4 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = new ai((long)var4 + var2_long, im.field_E, new byte[oo.field_a]);
                  var6 = 0;
                  L7: while (true) {
                    if (~oo.field_a >= ~var6) {
                      qe.field_c.a((byte) 54, (q) (Object) var5);
                      im.field_E = -1;
                      stackOut_18_0 = im.field_E;
                      stackIn_19_0 = stackOut_18_0;
                      continue L4;
                    } else {
                      var5.field_k[var6] = kj.field_d.field_j[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  mm.field_d = eb.field_f;
                  eb.field_f = wk.field_h;
                  wk.field_h = fa.field_e;
                  fa.field_e = im.field_E;
                  im.field_E = -1;
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0 != 0;
                }
              } else {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                return stackIn_26_0 != 0;
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("kg.C(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + 21 + ')');
        }
    }

    final static void a(int param0) {
        ul.field_e = new ei();
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
        rm var4 = null;
        kh var5 = null;
        try {
            ((kg) this).field_b = param1;
            ((kg) this).field_d = param0;
            var4 = new rm(1, 1, 0);
            int discarded$0 = var4.a(0, 0, 0);
            int discarded$1 = var4.a(0, 0, 0, (byte) 0, (byte) 0, (short)param2, (short) -1);
            ((kg) this).field_a = (pj) (Object) var4.a(80, 1365, -1, -12, 12);
            ((kg) this).field_a.field_z[0] = (short)param2;
            var5 = new kh();
            var5.field_k = ((kg) this).field_a;
            param0.a(param1, var5);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a() {
        if (b.field_x >= 2) {
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
                        if (!kb.field_a.c(-19375)) {
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
          return 100;
        } else {
          return 0;
        }
    }

    public static void b() {
        field_c = null;
    }

    static {
    }
}
