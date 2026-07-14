/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ob {
    static ko field_H;
    static ie field_K;
    static kb field_J;
    static String field_I;

    final static Object a(boolean param0, int param1, byte[] param2) {
        hi var3 = null;
        if (param1 >= -26) {
            field_K = null;
        }
        if (param2 == null) {
            return null;
        }
        if (!(-137 <= (param2.length ^ -1))) {
            var3 = new hi();
            ((mb) (Object) var3).a(param2, (byte) 2);
            return (Object) (Object) var3;
        }
        if (param0) {
            return (Object) (Object) jj.a(param2, (byte) 91);
        }
        return (Object) (Object) param2;
    }

    final static void a(boolean param0, re param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          Pool.field_L[0] = lc.field_P.nextInt();
          Pool.field_L[1] = lc.field_P.nextInt();
          Pool.field_L[2] = (int)(Pool.field_Q >> -98300704);
          Pool.field_L[3] = (int)Pool.field_Q;
          bc.field_b.field_v = 0;
          bc.field_b.a(true, Pool.field_L[0]);
          bc.field_b.a(true, Pool.field_L[1]);
          bc.field_b.a(true, Pool.field_L[2]);
          bc.field_b.a(true, Pool.field_L[3]);
          be.a(bc.field_b, 0);
          bc.field_b.a((byte) -81, param4);
          param1.a((byte) 121, bc.field_b);
          ej.field_j.field_v = 0;
          if (param0) {
            ej.field_j.a(18, false);
            break L0;
          } else {
            ej.field_j.a(16, false);
            break L0;
          }
        }
        L1: {
          ej.field_j.field_v = ej.field_j.field_v + 2;
          var5 = ej.field_j.field_v;
          ej.field_j.a(true, im.field_ec);
          ej.field_j.a(kn.field_j, (byte) -80);
          var6 = 0;
          if (bf.field_g) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (hk.field_s) {
            var6 = var6 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param2) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (ri.field_N == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          ej.field_j.a(var6, false);
          var7 = eq.a(hk.d(90), (byte) 120);
          if (var7 == null) {
            var7 = "";
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          ej.field_j.a(-9946, var7);
          if (null != ri.field_N) {
            ej.field_j.a(false, ri.field_N);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, (ge) (Object) ej.field_j);
          ej.field_j.c(ej.field_j.field_v + -var5, (byte) -92);
          de.a(-1, 0);
          if (param3 == -98300704) {
            break L7;
          } else {
            pj.b(false);
            break L7;
          }
        }
    }

    pj(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        super.c(46);
        if (param0 <= 36) {
            return;
        }
        ((pj) this).a((lr) (Object) mc.field_e, new int[1], 100, -16097, ng.field_B, 320, 4);
        ((pj) this).b(100, false);
    }

    public static void b(boolean param0) {
        field_I = null;
        field_H = null;
        if (param0) {
            return;
        }
        field_K = null;
        field_J = null;
    }

    final static void f(int param0) {
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        var4 = Pool.field_O;
        qh.b(243, 197, 369, 143, 16777215);
        qh.f(244, 198, 367, 141, 0);
        if (nf.field_V != null) {
          L0: {
            var6 = nf.field_V[rj.field_f];
            if (param0 == -1) {
              break L0;
            } else {
              field_K = null;
              break L0;
            }
          }
          L1: {
            if (var6 != null) {
              var6.c(245, 199);
              break L1;
            } else {
              if (so.field_h != null) {
                int discarded$3 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (ug.field_u >= hj.field_l) {
              break L2;
            } else {
              var7 = nf.field_V[cf.field_b];
              if (var7 != null) {
                var2_int = (var7.field_w + 60) * ug.field_u / hj.field_l;
                var3 = var2_int - 30;
                if (!b.field_K) {
                  ml.a(var3 * -256 / 30, (byte) 63, 245, 199, var7, (var7.field_w + -var3) * 256 / 30);
                  break L2;
                } else {
                  ml.a((-var3 + var7.field_w) * 256 / 30, (byte) 117, 245, 199, var7, var3 * -256 / 30);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (so.field_h == null) {
              break L3;
            } else {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if (var5 >= nf.field_V.length) {
                  if (var2 == null) {
                    break L3;
                  } else {
                    int discarded$4 = so.field_h.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L3;
                  }
                } else {
                  var8 = nf.field_V[var5];
                  if (var8 != null) {
                    L5: {
                      if (365 != var8.field_w) {
                        break L5;
                      } else {
                        if ((var8.field_y ^ -1) != -140) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    if (var2 != null) {
                      var2 = var2 + ", " + var5;
                      var5++;
                      continue L4;
                    } else {
                      var2 = Integer.toString(var5);
                      var5++;
                      continue L4;
                    }
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
          return;
        } else {
          L6: {
            if (null != so.field_h) {
              int discarded$5 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ko();
        field_K = new ie();
        field_I = null;
    }
}
