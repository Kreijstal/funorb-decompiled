/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hkb implements ntb {
    private pe field_a;

    public final void b(faa param0, int param1) {
        if (!(vq.a(param0, 81, ((hkb) this).field_a == null ? true : false))) {
            ((hkb) this).field_a.b(param0, -120);
        }
        if (param1 >= -109) {
            ((hkb) this).field_a = null;
        }
    }

    final static boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$2 = hkb.b(36);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ar.field_d) {
              break L2;
            } else {
              if (!fda.e((byte) 103)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        hkb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = -104 % ((22 - param0) / 59);
          var4 = (hkb) (Object) param1;
          if (null != var4.field_a) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (null != var4.field_a) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          L3: {
            if ((stackIn_6_0 ^ stackIn_6_1) != 0) {
              break L3;
            } else {
              L4: {
                if (var4.field_a == null) {
                  break L4;
                } else {
                  if (!var4.field_a.a((byte) 96, (tv) (Object) var4.field_a)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L2;
        }
        return stackIn_12_0 != 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = hkb.b(29);
        }
        return ((hkb) this).field_a.d(false);
    }

    public final void a(faa param0, boolean param1) {
        if (!kv.a(param1, param0)) {
            ((hkb) this).field_a = null;
        } else {
            if (!(null != ((hkb) this).field_a)) {
                ((hkb) this).field_a = new pe();
            }
            ((hkb) this).field_a.a(param0, false);
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 <= 54) {
            return;
        }
        hkb var3 = (hkb) (Object) param1;
        if (null != var3.field_a) {
            if (!(null != var3.field_a)) {
                var3.field_a = new pe();
            }
            var3.field_a.b((byte) 108, (tv) (Object) var3.field_a);
        } else {
            var3.field_a = null;
        }
    }

    public final void a(tv param0, int param1) {
        hkb var6 = (hkb) (Object) param0;
        if (param1 > -19) {
            Object var5 = null;
            ((hkb) this).a((tv) null, 5);
        }
        if (var6.field_a != null) {
            if (var6.field_a != null) {
                var6.field_a.a((tv) (Object) var6.field_a, -32);
            }
        }
        int var4 = 0;
        if (((var6.field_a == null ? 1 : 0) ^ (var6.field_a == null ? 1 : 0)) == 0) {
            // ifnull L183
            // ifne L135
        } else {
            var4 = 1;
            System.out.println("World saved_state has changed. before=" + var6.field_a + ", now=" + var6.field_a);
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of Mission has changed");
        }
    }

    final void a(boolean param0, rsb param1, int param2) {
        sg[] var5_ref_sg__ = null;
        sg[] var6_ref_sg__ = null;
        int var7 = 0;
        sg var8 = null;
        tfa var9 = null;
        int var10 = VoidHunters.field_G;
        pe var11 = param1.field_g;
        if (!(!param0)) {
            var5_ref_sg__ = var11.d(1000);
            var6_ref_sg__ = var5_ref_sg__;
            for (var7 = 0; (var7 ^ -1) > (var6_ref_sg__.length ^ -1); var7++) {
                var8 = var6_ref_sg__[var7];
                if (var8 != null) {
                    if (-1 >= (var8.o((byte) -117) ^ -1)) {
                        if (!(var8.l((byte) -10))) {
                            if (qv.field_o == 0) {
                                var8.h(17704, 2);
                            }
                            var9 = param1.a(var8.o((byte) -117), (byte) 59);
                            if (!(null != var9.field_g)) {
                                var9.field_g = new sg();
                            }
                            var8.b((byte) 92, (tv) (Object) var9.field_g);
                            var9.field_g.u(-14);
                        }
                    }
                }
            }
        }
        int var5 = var11.f(24797);
        ((hkb) this).field_a.b((byte) 58, (tv) (Object) var11);
        int var6 = -74 / ((param2 - 66) / 59);
        var11.b(-123, false);
        var11.a(0, var5);
    }

    hkb() {
    }

    hkb(pe param0) {
        ((hkb) this).field_a = param0;
    }

    static {
    }
}
