/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eha {
    private vna field_a;
    private vna field_b;

    final void a(bs param0, hca param1, boolean param2) {
        ((eha) this).field_b.b((byte) -96, (vg) (Object) new dda(param1, param0));
        if (!param2) {
            Object var5 = null;
            ((eha) this).a(-124, (la) null);
        }
    }

    final static int a(int param0, int param1, int param2, int param3, pc param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var7 = -(param0 / param6) + param5;
        var8 = -(param3 / 2) + param2;
        if (!ab.a(var8, param4.field_d, var8 + param3, param4.field_k, param0 + var7, var7, 112)) {
          var9 = hm.a(param4.field_a, (byte) -15, var7, var7 - -param0, var8 - -param3, param1, param4.field_e, param4.field_k, param4.field_d, var8);
          if (var9 >= -1) {
            return var9;
          } else {
            System.out.println("Uh oh, collide.lineseg_box returned " + var9);
            System.out.println("collide.lineseg_box(" + param4.field_d + ", " + param4.field_k + ", " + param4.field_e + ", " + param4.field_a + ", " + var7 + ", " + var8 + ", " + (param0 + var7) + ", " + (var8 - -param3) + ", " + param1 + ")");
            var9 = 0;
            return var9;
          }
        } else {
          var9 = 0;
          return var9;
        }
    }

    abstract void a(int param0, int param1, hca param2, fsa param3);

    abstract void a(fsa param0, int param1);

    final void a(dt param0, int param1, int param2) {
        if (param2 <= 52) {
          L0: {
            ((eha) this).field_a = null;
            if (param0.h(126)) {
              this.a((byte) -27, param0);
              param0.a(-1, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0.h(126)) {
              this.a((byte) -27, param0);
              param0.a(-1, param1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        rfa.field_B = bha.field_B + " <b>" + vc.field_s + "</b> " + cq.field_c + " <b>" + mha.field_F + "</b> " + kka.field_p + "<br>" + "<br>" + wg.field_k;
        if (param0 != -27) {
            Object var2 = null;
            int discarded$0 = eha.a(-114, -20, 86, 69, (pc) null, -36, 11);
        }
    }

    abstract void a(int param0, la param1);

    abstract void a(int param0, hca param1, la param2);

    final void a(dt param0, pi param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        pi var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!param2) {
          if (!param1.a(param0.field_g.r(-108), 3)) {
            var7 = (pi) (Object) ((eha) this).field_a.f(-80);
            L0: while (true) {
              if (var7 != null) {
                if (var7.a(param1, 0)) {
                  return;
                } else {
                  var7 = (pi) (Object) ((eha) this).field_a.e(107);
                  continue L0;
                }
              } else {
                ((eha) this).field_a.b((byte) -82, (vg) (Object) param1);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          ((eha) this).a(-16, -102, (hca) null, (fsa) null);
          if (!param1.a(param0.field_g.r(-108), 3)) {
            var7 = (pi) (Object) ((eha) this).field_a.f(-80);
            L1: while (true) {
              if (var7 != null) {
                if (var7.a(param1, 0)) {
                  return;
                } else {
                  var7 = (pi) (Object) ((eha) this).field_a.e(107);
                  continue L1;
                }
              } else {
                ((eha) this).field_a.b((byte) -82, (vg) (Object) param1);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        if (param0 > -111) {
            return;
        }
        ((eha) this).field_b.d(8);
    }

    abstract void a(int param0, hca param1, int param2, la param3, int param4, int param5);

    final dda a(int param0) {
        if (param0 < 99) {
            return null;
        }
        return (dda) (Object) ((eha) this).field_b.c(23);
    }

    abstract void a(hca param0, la param1, boolean param2);

    protected eha() {
        ((eha) this).field_b = new vna();
        ((eha) this).field_a = new vna();
    }

    private final void a(byte param0, dt param1) {
        int var3 = 0;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = param1.field_c;
        var4 = param1.field_g.r(-102);
        if (param0 == -27) {
          var5 = (pi) (Object) ((eha) this).field_a.f(param0 + -53);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              L1: {
                if (!var5.a(var3, -1, var4)) {
                  if (var5.c(var3, 113)) {
                    var5.a(param1, var5.b(var3, -87), param0 + 27);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var5.a(param1, -102);
                  var5.p(40);
                  break L1;
                }
              }
              var5 = (pi) (Object) ((eha) this).field_a.e(122);
              continue L0;
            }
          }
        } else {
          var7 = null;
          ((eha) this).a(84, 86, (hca) null, (fsa) null);
          var5 = (pi) (Object) ((eha) this).field_a.f(param0 + -53);
          L2: while (true) {
            if (var5 == null) {
              return;
            } else {
              L3: {
                if (!var5.a(var3, -1, var4)) {
                  if (var5.c(var3, 113)) {
                    var5.a(param1, var5.b(var3, -87), param0 + 27);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(param1, -102);
                  var5.p(40);
                  break L3;
                }
              }
              var5 = (pi) (Object) ((eha) this).field_a.e(122);
              continue L2;
            }
          }
        }
    }

    static {
    }
}
