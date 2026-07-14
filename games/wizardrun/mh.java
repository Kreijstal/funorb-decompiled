/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class mh extends gf implements qd {
    private boolean field_mb;
    static String[] field_sb;
    static java.awt.Font field_ob;
    private boolean field_rb;
    static volatile int field_pb;
    static kl field_jb;
    static String field_lb;
    private vd field_qb;
    static int field_tb;
    private hd field_ub;
    private boolean field_kb;
    private boolean field_nb;

    final void n(int param0) {
        if (param0 != 8) {
            field_tb = 105;
        }
        ((mh) this).field_ub.a(2121792, -1028717695, 4210752);
        vc var2 = new vc((mh) this, ((mh) this).field_qb, sh.field_d);
        var2.a((byte) -31, ud.field_a, 15);
        ((mh) this).c((ub) (Object) var2, param0 + -119);
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (!(13 != param1)) {
            ((mh) this).l(-27697);
            return true;
        }
        if (param2 > -96) {
            return false;
        }
        return super.a(param0, param1, (byte) -99, param3);
    }

    final static le a(byte param0, mg param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var2 = param1.g(8, -11719);
        if (var2 <= 0) {
          L0: {
            var3 = oe.a((byte) -55, param1) ? 1 : 0;
            if (param0 == -117) {
              break L0;
            } else {
              field_ob = null;
              break L0;
            }
          }
          L1: {
            var4 = oe.a((byte) -55, param1) ? 1 : 0;
            var5 = new le();
            var5.field_L = (short)param1.g(16, param0 ^ 11698);
            var5.field_P = sa.a(16, (byte) -48, param1, var5.field_P);
            var5.field_a = sa.a(16, (byte) -48, param1, var5.field_a);
            var5.field_w = sa.a(16, (byte) -48, param1, var5.field_w);
            var5.field_N = (short)param1.g(16, -11719);
            var5.field_p = sa.a(16, (byte) -48, param1, var5.field_p);
            var5.field_C = sa.a(16, (byte) -48, param1, var5.field_C);
            var5.field_I = sa.a(16, (byte) -48, param1, var5.field_I);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_y = (short)param1.g(16, -11719);
              var5.field_k = sa.a(16, (byte) -48, param1, var5.field_k);
              var5.field_R = sa.a(16, (byte) -48, param1, var5.field_R);
              var5.field_o = sa.a(16, (byte) -48, param1, var5.field_o);
              var5.field_c = sa.a(16, (byte) -48, param1, var5.field_c);
              var5.field_Q = sa.a(16, (byte) -48, param1, var5.field_Q);
              var5.field_d = sa.a(16, (byte) -48, param1, var5.field_d);
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param1.g(16, -11719);
              var5.field_G = sa.a(16, (byte) -48, param1, var5.field_G);
              var5.field_H = sa.a(16, (byte) -48, param1, var5.field_H);
              var5.field_m = sa.a(16, (byte) -48, param1, var5.field_m);
              var5.field_z = sa.a(16, (byte) -48, param1, var5.field_z);
              var5.field_v = sa.a(16, (byte) -48, param1, var5.field_v);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (oe.a((byte) -55, param1)) {
              var5.field_O = sa.a(16, (byte) -48, param1, var5.field_O);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!oe.a((byte) -55, param1)) {
              break L4;
            } else {
              var5.field_x = sd.a(param1, var5.field_x, 16, (byte) 11);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_x.length) {
                  if (-1 == (var6 ^ -1)) {
                    var5.field_x = null;
                    break L4;
                  } else {
                    var5.field_n = (byte)(var6 - -1);
                    break L4;
                  }
                } else {
                  if (var6 < (var5.field_x[var7] & 255)) {
                    var6 = 255 & var5.field_x[var7];
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final static int[] m(int param0) {
        if (param0 != -26421) {
            return null;
        }
        return new int[8];
    }

    public static void e(boolean param0) {
        field_lb = null;
        field_ob = null;
        field_jb = null;
        field_sb = null;
        if (!param0) {
            Object var2 = null;
            le discarded$0 = mh.a((byte) -60, (mg) null);
        }
    }

    public void a(int param0, pl param1, int param2, int param3, int param4) {
        if (((mh) this).field_mb) {
            jc.a((byte) 115, 3);
            ((mh) this).l(-27697);
        } else {
            rb.a("tochangedisplayname.ws", -1926289535, jg.f(param0 + 18906));
        }
        if (param0 != -18905) {
            ((mh) this).field_mb = true;
        }
    }

    final static int a(byte param0, int param1) {
        int var4 = wizardrun.field_H;
        wc.field_k = 0;
        hb.field_k = null;
        si.field_q = null;
        int var2 = nf.field_b;
        nf.field_b = kj.field_a;
        ii.field_f.field_k = ii.field_f.field_k + 1;
        kj.field_a = var2;
        if (-52 == (param1 ^ -1)) {
            ii.field_f.field_n = 2;
        } else {
            if (param1 != 50) {
                ii.field_f.field_n = 1;
            } else {
                ii.field_f.field_n = 5;
            }
        }
        if (2 <= ii.field_f.field_k) {
            if (!(param1 != -52)) {
                return 2;
            }
        }
        if (2 <= ii.field_f.field_k) {
            if (-51 == param1) {
                return 5;
            }
        }
        if (ii.field_f.field_k >= 4) {
            return 1;
        }
        int var3 = -105 % ((param0 - 34) / 47);
        return -1;
    }

    final void a(String param0, int param1, int param2) {
        vc var4 = null;
        int var5 = 0;
        vc var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        vc stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vc stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vc stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        vc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        vc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        var5 = wizardrun.field_H;
        if (!((mh) this).field_kb) {
          L0: {
            ((mh) this).field_kb = true;
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (-257 != (param2 ^ -1)) {
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
            ((mh) this).field_mb = stackIn_5_1 != 0;
            ((mh) this).field_ub.a(8405024, -1028717695, 4210752);
            var6 = new vc((mh) this, ((mh) this).field_qb, param0);
            var4 = var6;
            if (-6 != (param2 ^ -1)) {
              if (256 != param2) {
                L2: {
                  stackOut_9_0 = (vc) var6;
                  stackOut_9_1 = -31;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (((mh) this).field_rb) {
                    stackOut_11_0 = (vc) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = me.field_a;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L2;
                  } else {
                    stackOut_10_0 = (vc) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = ti.field_h;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L2;
                  }
                }
                ((vc) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, -1);
                break L1;
              } else {
                pl discarded$153 = var6.a(0, me.field_a, (ce) this);
                break L1;
              }
            } else {
              var6.a((byte) -31, da.field_j, 11);
              var6.a((byte) -31, pk.field_q, 17);
              break L1;
            }
          }
          L3: {
            if (param1 > 12) {
              break L3;
            } else {
              int[] discarded$154 = mh.m(-64);
              break L3;
            }
          }
          L4: {
            if ((param2 ^ -1) == -4) {
              var6.a((byte) -31, vl.field_g, 7);
              break L4;
            } else {
              if (param2 == 4) {
                var6.a((byte) -31, wh.field_b, 8);
                break L4;
              } else {
                if ((param2 ^ -1) == -7) {
                  var6.a((byte) -31, ka.field_h, 9);
                  break L4;
                } else {
                  if (param2 != 9) {
                    break L4;
                  } else {
                    pl discarded$155 = var6.a(0, de.field_a, (ce) this);
                    break L4;
                  }
                }
              }
            }
          }
          ((mh) this).c((ub) (Object) var6, -116);
          return;
        } else {
          return;
        }
    }

    final void l(int param0) {
        if (param0 != -27697) {
            field_sb = null;
        }
        if (!(((mh) this).field_H)) {
            return;
        }
        ((mh) this).field_H = false;
        if (!((mh) this).field_rb) {
            // ifeq L67
            me.a(param0 ^ -27704);
        } else {
            uk.a(19702);
        }
    }

    mh(wi param0, vd param1, String param2, boolean param3, boolean param4) {
        super(param0, (ub) (Object) new vc((mh) null, param1, param2), 77, 10, 10);
        ((mh) this).field_qb = param1;
        ((mh) this).field_mb = false;
        ((mh) this).field_rb = param3 ? true : false;
        ((mh) this).field_kb = false;
        ((mh) this).field_nb = param4 ? true : false;
        ((mh) this).field_ub = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
        ((mh) this).field_ub.field_I = true;
        ((mh) this).a((ub) (Object) ((mh) this).field_ub, (byte) 127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = new String[]{"Complete the game", "Capture and pop all creatures in world 1", "Complete world 1", "Reach world 4 from world 1 without losing a life", "Reach world 6 from world 1 without losing a life", "Kill the Giant Spider on world 1, losing no lives", "Kill the Pygmy Boss on world 2, losing no lives", "Kill the Pirate Captain on world 3, losing no lives", "Kill the Troll Ancient on world 4, losing no lives", "Kill the Ice Dragon on world 5, losing no lives", "Kill the Harpy King on world 6, losing no lives", "Collect 100 pumpkins in world 6 during halloween"};
        field_pb = 0;
        field_lb = "Fullscreen";
    }
}
