/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends je {
    static String field_Ib;
    static int[] field_Jb;
    private je field_Kb;

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 102) {
          ((hk) this).a(true, true);
          if (tr.field_A == 0) {
            if (((hk) this).field_Kb.field_yb != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (-1 != (((hk) this).field_yb ^ -1)) {
              L0: {
                if (((hk) this).field_Kb.field_yb == 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          hk.k(-40);
          ((hk) this).a(true, true);
          if (tr.field_A != 0) {
            if (-1 == (((hk) this).field_yb ^ -1)) {
              return true;
            } else {
              L1: {
                if (((hk) this).field_Kb.field_yb == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (((hk) this).field_Kb.field_yb == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void k(int param0) {
        te var1 = null;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        l.field_a.d();
        mt.field_e.d();
        qu.field_p = qu.field_p - 1;
        if (param0 == 128) {
          L0: {
            if (-1 != (qu.field_p ^ -1)) {
              break L0;
            } else {
              qu.field_p = 200;
              var1 = (te) (Object) bl.field_h.e((byte) 118);
              L1: while (true) {
                if (var1 == null) {
                  if (null == ts.field_e) {
                    break L0;
                  } else {
                    var1 = (te) (Object) ts.field_e.e((byte) 120);
                    L2: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L3: {
                          if (!var1.field_k.c(65280)) {
                            var1.d(-126);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var1 = (te) (Object) ts.field_e.a((byte) 123);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (!var1.field_k.c(param0 ^ 65408)) {
                      var1.d(param0 ^ 247);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1 = (te) (Object) bl.field_h.a((byte) 123);
                  continue L1;
                }
              }
            }
          }
          L5: {
            if (au.field_Kb == null) {
              break L5;
            } else {
              if (au.field_Kb.g(param0 + 11771)) {
                break L5;
              } else {
                lo.field_u = null;
                return;
              }
            }
          }
          return;
        } else {
          hk.k(94);
          if (-1 == (qu.field_p ^ -1)) {
            qu.field_p = 200;
            var1 = (te) (Object) bl.field_h.e((byte) 118);
            L6: while (true) {
              if (var1 == null) {
                if (null != ts.field_e) {
                  var1 = (te) (Object) ts.field_e.e((byte) 120);
                  L7: while (true) {
                    if (var1 == null) {
                      L8: {
                        if (au.field_Kb == null) {
                          break L8;
                        } else {
                          if (au.field_Kb.g(param0 + 11771)) {
                            break L8;
                          } else {
                            lo.field_u = null;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L9: {
                        if (!var1.field_k.c(65280)) {
                          var1.d(-126);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var1 = (te) (Object) ts.field_e.a((byte) 123);
                      continue L7;
                    }
                  }
                } else {
                  if (au.field_Kb != null) {
                    if (!au.field_Kb.g(param0 + 11771)) {
                      lo.field_u = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L10: {
                  if (!var1.field_k.c(param0 ^ 65408)) {
                    var1.d(param0 ^ 247);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var1 = (te) (Object) bl.field_h.a((byte) 123);
                continue L6;
              }
            }
          } else {
            if (au.field_Kb != null) {
              if (!au.field_Kb.g(param0 + 11771)) {
                lo.field_u = null;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void l(int param0) {
        if (param0 >= -103) {
            return;
        }
        field_Jb = null;
        field_Ib = null;
    }

    hk(je param0, je param1, je param2, je param3, je param4, je param5) {
        int var12 = 0;
        je var13 = null;
        je var14 = null;
        int var15 = 0;
        je var17 = new je(0L, param1, oj.field_x.toUpperCase());
        var17.field_Eb = 1;
        ((hk) this).field_Kb = new je(0L, param2);
        je var8 = new je(0L, param3);
        je var9 = new je(0L, param3, co.field_j);
        var9.field_Eb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; cl.field_z.length > var12; var12++) {
            var13 = new je(0L, param3, bt.field_c[var12]);
            var14 = new je(0L, param3, cl.field_z[var12]);
            var15 = param3.field_Z.a(cl.field_z[var12]);
            if (var11 < var15) {
                var11 = var15;
            }
            var13.a(15, -20500, 65, var10, 20);
            var14.a(15, -20500, 640, var10, 90);
            var8.a(var13, 124);
            var8.a(var14, 122);
            var10 += 30;
        }
        var10 += 15;
        var17.a(24, -20500, var11 + 110, 0, 0);
        ((hk) this).a(var10 + var17.field_ob, -20500, var17.field_gb, 100, 100);
        ((hk) this).field_Kb.a(15, -20500, 15, 5, -20 + var17.field_gb);
        var8.a(-var17.field_ob + ((hk) this).field_ob, -20500, ((hk) this).field_gb, var17.field_ob, 0);
        var9.a(15, -20500, ((hk) this).field_gb, 20, 0);
        var8.field_G = tq.a(11579568, false, var8.field_ob, 2105376, 3, 8421504);
        var17.a(((hk) this).field_Kb, 64);
        var8.a(var9, 111);
        ((hk) this).a(var17, 98);
        ((hk) this).a(var8, 42);
        ((hk) this).field_S = -(((hk) this).field_gb >> -643698719) + 320;
        var10 = 240 + -(((hk) this).field_ob >> 420524033);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "Email address is unavailable";
        field_Jb = new int[]{128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 64, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 96, 128, 96, 128, 96, 96, 128, 96, 128, 128, 256, 128, 128, 128, 128, 128, 128, 128, 128, 96, 96, 96, 128, 96, 96, 128, 96, 64, 64, 160, 128, 96, 128, 128, 128, 128, 128, 128, 96, 64, 64, 64, 128, 0, 0, 0, 64, 128, 128, 128, 128, 128, 128, 96, 128};
    }
}
