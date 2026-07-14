/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class wa extends n implements sg {
    static String field_qb;
    private eg field_yb;
    static boolean[] field_pb;
    static ge field_xb;
    static int[] field_rb;
    static int[] field_sb;
    private boolean field_ub;
    private boolean field_ob;
    private boolean field_wb;
    private ek field_vb;
    private boolean field_tb;

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 <= 9) {
            return false;
        }
        if (!(param0 != 13)) {
            ((wa) this).o(77);
            return true;
        }
        return super.a(param0, param1, (byte) 80, param3);
    }

    final void o(int param0) {
        if (((wa) this).field_K) {
          ((wa) this).field_K = false;
          if (param0 == 77) {
            if (!((wa) this).field_tb) {
              if (((wa) this).field_ob) {
                al.c(false);
                return;
              } else {
                return;
              }
            } else {
              n.g((byte) -118);
              return;
            }
          } else {
            ((wa) this).field_wb = true;
            if (!((wa) this).field_tb) {
              if (!((wa) this).field_ob) {
                return;
              } else {
                al.c(false);
                return;
              }
            } else {
              n.g((byte) -118);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void m(int param0) {
        sj var2 = null;
        Object var3 = null;
        ((wa) this).field_vb.b(23927, 2121792, 4210752);
        var2 = new sj((wa) this, ((wa) this).field_yb, bk.field_n);
        var2.a(15, param0 + 2070, kj.field_E);
        if (param0 != 13) {
          var3 = null;
          ((wa) this).a((ng) null, -19, -53, 4, true);
          ((wa) this).c(0, (ee) (Object) var2);
          return;
        } else {
          ((wa) this).c(0, (ee) (Object) var2);
          return;
        }
    }

    public void a(ng param0, int param1, int param2, int param3, boolean param4) {
        Object var7 = null;
        if (!param4) {
          if (!((wa) this).field_wb) {
            ob.a("tochangedisplayname.ws", gi.b(12476), (byte) 43);
            return;
          } else {
            fk.a(true, 3);
            ((wa) this).o(77);
            return;
          }
        } else {
          var7 = null;
          ((wa) this).a((ng) null, -14, -19, -46, true);
          if (!((wa) this).field_wb) {
            ob.a("tochangedisplayname.ws", gi.b(12476), (byte) 43);
            return;
          } else {
            fk.a(true, 3);
            ((wa) this).o(77);
            return;
          }
        }
    }

    public static void n(int param0) {
        int var1 = -93 / ((param0 - -20) / 44);
        field_pb = null;
        field_qb = null;
        field_xb = null;
        field_sb = null;
        field_rb = null;
    }

    final void a(boolean param0, String param1, int param2) {
        sj var4 = null;
        int var5 = 0;
        sj var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        sj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        sj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        String stackIn_13_3 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        sj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        String stackOut_12_3 = null;
        sj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        String stackOut_11_3 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!((wa) this).field_ub) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          L1: {
            ((wa) this).field_ub = stackIn_5_1 != 0;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (256 != param2) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          ((wa) this).field_wb = stackIn_8_1 != 0;
          ((wa) this).field_vb.b(23927, 8405024, 4210752);
          var6 = new sj((wa) this, ((wa) this).field_yb, param1);
          var4 = var6;
          if (param2 == 5) {
            var6.a(11, 2083, te.field_c);
            var6.a(17, 2083, ph.field_f);
            if (param2 != 3) {
              if (-5 != param2) {
                if (-7 == param2) {
                  var6.a(9, 2083, qc.field_b);
                  ((wa) this).c(0, (ee) (Object) var6);
                  return;
                } else {
                  if (-10 == (param2 ^ -1)) {
                    ng discarded$4 = var6.a((byte) 46, (gg) this, vj.field_e);
                    ((wa) this).c(0, (ee) (Object) var6);
                    return;
                  } else {
                    ((wa) this).c(0, (ee) (Object) var6);
                    return;
                  }
                }
              } else {
                var6.a(8, 2083, le.field_d);
                ((wa) this).c(0, (ee) (Object) var6);
                return;
              }
            } else {
              var6.a(7, 2083, aj.field_a);
              ((wa) this).c(0, (ee) (Object) var6);
              return;
            }
          } else {
            if (-257 == (param2 ^ -1)) {
              ng discarded$5 = var6.a((byte) 46, (gg) this, qb.field_e);
              if (param2 != 3) {
                if (-5 != param2) {
                  if (-7 == param2) {
                    var6.a(9, 2083, qc.field_b);
                    ((wa) this).c(0, (ee) (Object) var6);
                    return;
                  } else {
                    if (-10 == (param2 ^ -1)) {
                      ng discarded$6 = var6.a((byte) 46, (gg) this, vj.field_e);
                      ((wa) this).c(0, (ee) (Object) var6);
                      return;
                    } else {
                      ((wa) this).c(0, (ee) (Object) var6);
                      return;
                    }
                  }
                } else {
                  var6.a(8, 2083, le.field_d);
                  ((wa) this).c(0, (ee) (Object) var6);
                  return;
                }
              } else {
                var6.a(7, 2083, aj.field_a);
                ((wa) this).c(0, (ee) (Object) var6);
                return;
              }
            } else {
              L2: {
                stackOut_10_0 = (sj) var6;
                stackOut_10_1 = -1;
                stackOut_10_2 = 2083;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (((wa) this).field_tb) {
                  stackOut_12_0 = (sj) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = qb.field_e;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L2;
                } else {
                  stackOut_11_0 = (sj) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = b.field_R;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L2;
                }
              }
              ((sj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3);
              if (param2 != 3) {
                if (-5 != param2) {
                  if (-7 == param2) {
                    var6.a(9, 2083, qc.field_b);
                    ((wa) this).c(0, (ee) (Object) var6);
                    return;
                  } else {
                    if (-10 == (param2 ^ -1)) {
                      ng discarded$7 = var6.a((byte) 46, (gg) this, vj.field_e);
                      ((wa) this).c(0, (ee) (Object) var6);
                      return;
                    } else {
                      ((wa) this).c(0, (ee) (Object) var6);
                      return;
                    }
                  }
                } else {
                  var6.a(8, 2083, le.field_d);
                  ((wa) this).c(0, (ee) (Object) var6);
                  return;
                }
              } else {
                var6.a(7, 2083, aj.field_a);
                ((wa) this).c(0, (ee) (Object) var6);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    wa(si param0, eg param1, String param2, boolean param3, boolean param4) {
        super(param0, (ee) (Object) new sj((wa) null, param1, param2), 77, 10, 10);
        ((wa) this).field_tb = param3 ? true : false;
        ((wa) this).field_ob = param4 ? true : false;
        ((wa) this).field_wb = false;
        ((wa) this).field_yb = param1;
        ((wa) this).field_ub = false;
        ((wa) this).field_vb = new ek(13, 50, 274, 30, 15, 2113632, 4210752);
        ((wa) this).field_vb.field_L = true;
        ((wa) this).a(0, (ee) (Object) ((wa) this).field_vb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = null;
        field_qb = "Waiting for extra data";
        field_sb = new int[6];
        field_rb = new int[4];
    }
}
