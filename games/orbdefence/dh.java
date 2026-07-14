/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class dh extends hl implements ai {
    private kc field_db;
    private dg field_ab;
    static tl field_bb;
    static hj field_X;
    static int field_Z;
    private boolean field_cb;
    private boolean field_eb;
    private boolean field_W;
    private boolean field_Y;

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (param3 != 0) {
            return true;
        }
        if (!((param1 ^ -1) != -14)) {
            ((dh) this).q(4210752);
            return true;
        }
        return super.a(param0, param1, param2, 0);
    }

    public static void e(byte param0) {
        if (param0 != -94) {
            field_Z = 63;
        }
        field_bb = null;
        field_X = null;
    }

    final static String a(int param0, long param1) {
        qc.field_c.setTime(new Date(param1));
        int var3 = qc.field_c.get(7);
        int var4 = qc.field_c.get(5);
        int var5 = qc.field_c.get(2);
        int var6 = qc.field_c.get(1);
        int var7 = qc.field_c.get(11);
        int var8 = qc.field_c.get(12);
        int var9 = qc.field_c.get(13);
        if (param0 != -15591) {
            field_bb = null;
        }
        return te.field_N[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void d(byte param0) {
        ((dh) this).field_ab.a(16711422, 2121792, 4210752);
        int var2 = 96 % ((param0 - 8) / 44);
        ec var3 = new ec((dh) this, ((dh) this).field_db, oa.field_e);
        var3.a(il.field_d, 15, -15858);
        ((dh) this).a(false, (pj) (Object) var3);
    }

    final void q(int param0) {
        if (param0 != 4210752) {
            Object var3 = null;
            ((dh) this).a((byte) 120, -34, 27, (s) null, 96);
        }
        if (!((dh) this).field_A) {
            return;
        }
        ((dh) this).field_A = false;
        if (((dh) this).field_W) {
            jk.a(121);
        } else {
            if (!(!((dh) this).field_cb)) {
                rf.d(false);
            }
        }
    }

    final static e a(String param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param1 < 63) {
            return null;
        }
        int var2 = param0.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (57 < var4) {
                return null;
            }
        }
        return ba.field_a;
    }

    final void a(int param0, int param1, String param2) {
        ec var4 = null;
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ec stackIn_10_0 = null;
        ec stackIn_11_0 = null;
        ec stackIn_12_0 = null;
        String stackIn_12_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ec stackOut_9_0 = null;
        ec stackOut_11_0 = null;
        String stackOut_11_1 = null;
        ec stackOut_10_0 = null;
        String stackOut_10_1 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (((dh) this).field_Y) {
          return;
        } else {
          L0: {
            ((dh) this).field_Y = true;
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if ((param1 ^ -1) != -257) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((dh) this).field_eb = stackIn_6_1 != 0;
            ((dh) this).field_ab.a(16711422, 8405024, 4210752);
            var7 = new ec((dh) this, ((dh) this).field_db, param2);
            var4 = var7;
            var5 = -74 % ((param0 - 43) / 46);
            if (param1 == -6) {
              var7.a(vc.field_n, 11, -15858);
              var7.a(ld.field_d, 17, -15858);
              break L1;
            } else {
              if (-257 != param1) {
                L2: {
                  stackOut_9_0 = (ec) var7;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((dh) this).field_W) {
                    stackOut_11_0 = (ec) (Object) stackIn_11_0;
                    stackOut_11_1 = tk.field_l;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = (ec) (Object) stackIn_10_0;
                    stackOut_10_1 = vc.field_i;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((ec) (Object) stackIn_12_0).a(stackIn_12_1, -1, -15858);
                break L1;
              } else {
                s discarded$21 = var7.a(tk.field_l, -34, (ag) this);
                break L1;
              }
            }
          }
          L3: {
            if (-4 != (param1 ^ -1)) {
              if ((param1 ^ -1) == -5) {
                var7.a(l.field_a, 8, -15858);
                break L3;
              } else {
                if (param1 != 6) {
                  if ((param1 ^ -1) != -10) {
                    break L3;
                  } else {
                    s discarded$22 = var7.a(fk.field_d, -34, (ag) this);
                    break L3;
                  }
                } else {
                  var7.a(qf.field_k, 9, -15858);
                  break L3;
                }
              }
            } else {
              var7.a(vk.field_y, 7, -15858);
              break L3;
            }
          }
          ((dh) this).a(false, (pj) (Object) var7);
          return;
        }
    }

    dh(sk param0, kc param1, String param2, boolean param3, boolean param4) {
        super(param0, (pj) (Object) new ec((dh) null, param1, param2), 77, 10, 10);
        ((dh) this).field_eb = false;
        ((dh) this).field_Y = false;
        ((dh) this).field_db = param1;
        ((dh) this).field_W = param3 ? true : false;
        ((dh) this).field_cb = param4 ? true : false;
        ((dh) this).field_ab = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((dh) this).field_ab.field_z = true;
        ((dh) this).a((pj) (Object) ((dh) this).field_ab, (byte) 74);
    }

    public void a(byte param0, int param1, int param2, s param3, int param4) {
        if (!((dh) this).field_eb) {
            jj.a("tochangedisplayname.ws", (byte) -93, uj.b((byte) -120));
        } else {
            il.a(3, 0);
            ((dh) this).q(4210752);
        }
        int var6 = -39 % ((-3 - param0) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = 0;
    }
}
