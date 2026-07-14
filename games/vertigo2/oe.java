/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends fj implements ij {
    private boolean field_ub;
    static String field_rb;
    private boolean field_nb;
    static ee field_qb;
    static String field_sb;
    static tr field_pb;
    private mk field_tb;
    static int[][] field_ob;
    static String field_vb;

    final static byte[] a(int param0, byte[] param1, int param2, mi param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var4 = param3.c((byte) -96, param2);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param3.c((byte) -118, 3);
            if (param0 == 12635) {
              break L2;
            } else {
              field_qb = null;
              break L2;
            }
          }
          L3: {
            var6 = (byte)param3.c((byte) -101, 8);
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)(param3.c((byte) -125, var5) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    public static void p(int param0) {
        field_qb = null;
        field_sb = null;
        field_vb = null;
        field_pb = null;
        field_ob = null;
        if (param0 != 12705) {
            oe.p(83);
        }
        field_rb = null;
    }

    final static boolean q(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 59) {
            break L0;
          } else {
            field_rb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lo.field_k) {
              break L2;
            } else {
              if (bm.field_I != rg.field_d) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void o(int param0) {
        this.a(fn.a(248, true, af.field_J), true, -120);
        if (param0 != 16614) {
            boolean discarded$0 = oe.q(56);
        }
    }

    final boolean j(int param0) {
        ch var2 = null;
        if (param0 != 17) {
            ((oe) this).field_ub = false;
        }
        if (((oe) this).field_I) {
            if (!((oe) this).field_nb) {
                var2 = ar.b(param0 ^ 17);
                if (!(var2 == null)) {
                    this.a(var2, false, param0 ^ -64);
                }
            }
        }
        return super.j(17);
    }

    private final void a(ch param0, boolean param1, int param2) {
        String var4 = null;
        rh var5 = null;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          ((oe) this).field_nb = true;
          if (param2 < -45) {
            break L0;
          } else {
            field_pb = null;
            break L0;
          }
        }
        L1: {
          if (!param0.field_a) {
            if (param0.field_b == null) {
              var4 = param0.field_j;
              if (param0.field_h == 248) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    mr.a(false);
                    break L2;
                  }
                }
                ((oe) this).field_ub = true;
                var4 = af.field_J;
                break L1;
              } else {
                break L1;
              }
            } else {
              var4 = wa.field_g;
              if (((oe) this).field_tb != null) {
                ((oe) this).field_tb.a(-4384);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            var4 = dh.field_c;
            break L1;
          }
        }
        L3: {
          var5 = new rh((fj) this, sg.field_a, var4);
          if (!param0.field_a) {
            L4: {
              if (!((oe) this).field_ub) {
                if ((param0.field_h ^ -1) != -6) {
                  var5.a(ap.field_f, -1, -61);
                  break L4;
                } else {
                  var5.a(jb.field_A, 11, -123);
                  var5.a(jd.field_b, 17, -50);
                  break L4;
                }
              } else {
                d discarded$2 = var5.a(vi.field_x, (uf) this, -116);
                break L4;
              }
            }
            if (param0.field_h == 3) {
              var5.a(hb.field_o, 7, -33);
              ((oe) this).a(false, (iq) (Object) var5);
              break L3;
            } else {
              if (param0.field_h == 6) {
                var5.a(hm.field_H, 9, -26);
                ((oe) this).a(false, (iq) (Object) var5);
                break L3;
              } else {
                ((oe) this).a(false, (iq) (Object) var5);
                break L3;
              }
            }
          } else {
            if (!param0.field_i) {
              d discarded$3 = var5.a(vi.field_x, (uf) this, -110);
              var5.a(hb.field_o, 7, -33);
              break L3;
            } else {
              ((oe) this).a(false, (iq) (Object) new ue((oe) this));
              return;
            }
          }
        }
    }

    oe(sd param0, mk param1) {
        super(param0, sg.field_a, ac.field_L, false, false);
        ((oe) this).field_tb = param1;
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (((oe) this).field_ub) {
            ak.a(true, false, 3);
            return;
        }
        fj.g((byte) -127);
        ((oe) this).h((byte) 57);
        int var6 = 112 % ((-63 - param2) / 51);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = "TAB - hide chat temporarily";
        field_ob = null;
        field_sb = "Unpacking sound effects";
        field_qb = new ee();
        field_vb = "Instructions";
    }
}
