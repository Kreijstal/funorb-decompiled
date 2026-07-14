/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends oj {
    int field_y;
    int field_D;
    private boolean field_z;
    static wk field_A;
    private boolean field_B;

    final static void a(li param0, int param1, int param2) {
        int var4 = 0;
        bv var5 = null;
        var5 = vl.field_n;
        var5.h(32161, param1);
        var5.field_q = var5.field_q + 1;
        var4 = var5.field_q;
        var5.b(1, 1);
        if (null == param0.field_l) {
          var5.b(param2 + -25521, 0);
          int discarded$4 = var5.b((byte) -39, var4);
          var5.field_q = var5.field_q - 4;
          param0.field_o = var5.i(param2 ^ 25523);
          var5.e(-var4 + var5.field_q, 5930);
          if (param2 == 25522) {
            return;
          } else {
            field_A = null;
            return;
          }
        } else {
          var5.b(1, param0.field_l.length);
          var5.a(param0.field_l, 0, param0.field_l.length, 86);
          int discarded$5 = var5.b((byte) -39, var4);
          var5.field_q = var5.field_q - 4;
          param0.field_o = var5.i(param2 ^ 25523);
          var5.e(-var4 + var5.field_q, 5930);
          if (param2 == 25522) {
            return;
          } else {
            field_A = null;
            return;
          }
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 >= -80) {
            field_A = null;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        Object var5 = null;
        nn stackIn_4_0 = null;
        nn stackIn_5_0 = null;
        nn stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        nn stackIn_11_0 = null;
        nn stackIn_12_0 = null;
        nn stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        nn stackOut_10_0 = null;
        nn stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        nn stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        nn stackOut_3_0 = null;
        nn stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        nn stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ((hp) this).a(param2.field_xb, -26661);
        if (param1 > -84) {
          L0: {
            var5 = null;
            wk discarded$1 = hp.a((int[]) null, (int[]) null, (String) null, 40);
            if (param2.field_T != null) {
              L1: {
                stackOut_10_0 = param2.field_vb;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (null != param2.field_oc) {
                  stackOut_12_0 = (nn) (Object) stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L1;
                } else {
                  stackOut_11_0 = (nn) (Object) stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L1;
                }
              }
              ((nn) (Object) stackIn_13_0).a(stackIn_13_1 != 0, 32, param2.field_q, param2.field_T, param2.field_vb.field_y, param2.field_vb.field_p);
              break L0;
            } else {
              break L0;
            }
          }
          return ((hp) this).a((byte) -39, param2, param0, true);
        } else {
          L2: {
            if (param2.field_T != null) {
              L3: {
                stackOut_3_0 = param2.field_vb;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (null != param2.field_oc) {
                  stackOut_5_0 = (nn) (Object) stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = (nn) (Object) stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((nn) (Object) stackIn_6_0).a(stackIn_6_1 != 0, 32, param2.field_q, param2.field_T, param2.field_vb.field_y, param2.field_vb.field_p);
              break L2;
            } else {
              break L2;
            }
          }
          return ((hp) this).a((byte) -39, param2, param0, true);
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        if (param1) {
          System.out.println("Death event debug");
          System.out.println("Unit at " + ((hp) this).field_y + "," + ((hp) this).field_D);
          if (!((hp) this).field_z) {
            var3 = 58 / ((53 - param0) / 51);
            var4 = "EventDeath: pos: (" + ((hp) this).field_y + "," + ((hp) this).field_D + ")";
            return var4;
          } else {
            System.out.println("Bones devoured");
            var3 = 58 / ((53 - param0) / 51);
            var4 = "EventDeath: pos: (" + ((hp) this).field_y + "," + ((hp) this).field_D + ")";
            return var4;
          }
        } else {
          var3 = 58 / ((53 - param0) / 51);
          var4 = "EventDeath: pos: (" + ((hp) this).field_y + "," + ((hp) this).field_D + ")";
          return var4;
        }
    }

    hp(int param0, int param1) {
        ((hp) this).field_B = false;
        ((hp) this).field_z = false;
        ((hp) this).field_y = param0;
        ((hp) this).field_D = param1;
        ((hp) this).field_m = 10;
        ((hp) this).field_w = null;
    }

    final static wk a(int[] param0, int[] param1, String param2, int param3) {
        no.field_P.field_v = qn.field_g;
        no.field_P.field_B = qn.field_d;
        no.field_P.field_y = qn.field_l;
        ku.field_J.b();
        qn.b();
        int discarded$19 = dm.a(-1, -1, param1, -1, false, param0, -1, false, 0, false, 0, param2);
        no.field_P.b();
        if (param3 != 17813) {
          return null;
        } else {
          return (wk) (Object) ew.a((byte) 107, ku.field_J);
        }
    }

    hp(jd param0) {
        ((hp) this).field_B = false;
        ((hp) this).field_D = param0.field_w;
        ((hp) this).field_y = param0.field_J;
        ((hp) this).field_w = param0;
        ((hp) this).field_m = 10;
        ((hp) this).field_z = false;
    }

    final void a(ha param0, int param1) {
        jd stackIn_7_0 = null;
        jd stackIn_8_0 = null;
        jd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jd stackOut_6_0 = null;
        jd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (!((hp) this).field_B) {
          L0: {
            ((hp) this).field_B = true;
            if (null == ((hp) this).field_w) {
              ((hp) this).field_w = param0.c(((hp) this).field_D, true, ((hp) this).field_y);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((hp) this).field_w == null) {
              break L1;
            } else {
              L2: {
                stackOut_6_0 = ((hp) this).field_w;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (((hp) this).field_z) {
                  stackOut_8_0 = (jd) (Object) stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = (jd) (Object) stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              ((jd) (Object) stackIn_9_0).a(stackIn_9_1 != 0, (byte) 105);
              break L1;
            }
          }
          hf.a(param0, (byte) 9, true);
          if (param1 != -26661) {
            field_A = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    hp(jd param0, boolean param1) {
        ((hp) this).field_B = false;
        ((hp) this).field_z = param1 ? true : false;
        ((hp) this).field_m = 10;
        ((hp) this).field_D = param0.field_w;
        ((hp) this).field_y = param0.field_J;
        ((hp) this).field_w = param0;
    }

    static {
    }
}
