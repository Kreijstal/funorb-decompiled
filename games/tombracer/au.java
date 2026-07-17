/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au extends aa {
    qk field_d;

    final static void b(boolean param0) {
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          L0: {
            if (nla.field_a != ub.field_c) {
              if (vb.field_i == ub.field_c) {
                L1: {
                  if (!vpa.a(23)) {
                    L2: {
                      if (qv.field_o != null) {
                        su.a(qv.field_o, (byte) -108, 3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    qfa.a(-116);
                    if (kpa.field_c) {
                      kpa.field_c = false;
                      in.a(-30600, false);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                ub.field_c = nn.field_c;
                break L0;
              } else {
                if (ub.field_c == nn.field_c) {
                  int fieldTemp$27 = lpa.field_o;
                  lpa.field_o = lpa.field_o - 1;
                  if (fieldTemp$27 > 0) {
                    break L0;
                  } else {
                    ub.field_c = ub.field_h;
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            } else {
              int fieldTemp$28 = lpa.field_o;
              lpa.field_o = lpa.field_o + 1;
              if (fieldTemp$28 < 16) {
                break L0;
              } else {
                L3: {
                  if (!dd.field_a) {
                    int discarded$29 = 1;
                    tta.e();
                    break L3;
                  } else {
                    pg.b(param0);
                    break L3;
                  }
                }
                ub.field_c = vb.field_i;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private au() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        kh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        bna var12 = null;
        cga var13 = null;
        kh var14 = null;
        bna var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = vc.field_q;
              var2 = var14.h(255);
              if (var2 != 0) {
                if (var2 == 1) {
                  var13 = (cga) (Object) aba.field_a.f(-80);
                  if (var13 == null) {
                    int discarded$6 = 60;
                    dea.a();
                    return;
                  } else {
                    var13.p(35);
                    break L1;
                  }
                } else {
                  if (var2 != 2) {
                    ssa.a("A1: " + kk.a(32), (byte) 116, (Throwable) null);
                    int discarded$7 = 60;
                    dea.a();
                    break L1;
                  } else {
                    var15 = (bna) (Object) tca.field_N.f(-80);
                    if (var15 != null) {
                      int discarded$8 = 1;
                      var15.field_f = fqa.e();
                      var15.field_g = true;
                      var15.p(42);
                      break L1;
                    } else {
                      int discarded$9 = 60;
                      dea.a();
                      return;
                    }
                  }
                }
              } else {
                int discarded$10 = 1;
                var11 = fqa.e();
                var3 = var11;
                var10 = var11;
                var4 = var10;
                var5 = var14;
                var6 = ((uia) (Object) var5).h(255);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var12 = (bna) (Object) tca.field_N.f(-80);
                    if (var12 != null) {
                      var12.field_f = var3;
                      var12.field_g = true;
                      var12.p(83);
                      break L1;
                    } else {
                      int discarded$11 = 60;
                      dea.a();
                      return;
                    }
                  } else {
                    var10[var7] = ((uia) (Object) var5).e(99);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "au.A(" + 3 + 41);
        }
    }

    static {
    }
}
