/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class wv extends mu implements vh {
    static int field_ib;
    private boolean field_db;
    private boolean field_cb;
    private boolean field_gb;
    private ou field_jb;
    private boolean field_hb;
    static r field_fb;
    private hu field_eb;
    static String field_bb;

    final static void a(byte param0, int param1, tf param2, java.awt.Point[] param3) {
        int var4 = 0;
        java.awt.Point var5 = null;
        java.awt.Point var6 = null;
        int var7 = Kickabout.field_G;
        for (var4 = 0; var4 < param3.length; var4++) {
            var5 = param3[var4];
            var6 = param3[(var4 - -1) % param3.length];
            nm.a(var6.x, param1, var6.y, var5.y, var5.x, param2, (byte) -109);
        }
        if (param0 != -108) {
            field_bb = null;
        }
    }

    public static void j(byte param0) {
        field_bb = null;
        field_fb = null;
        int var1 = -48 % ((-50 - param0) / 51);
    }

    final void q(int param0) {
        if (!((wv) this).field_C) {
          return;
        } else {
          L0: {
            ((wv) this).field_C = false;
            if (((wv) this).field_gb) {
              uj.b(true);
              break L0;
            } else {
              if (!((wv) this).field_db) {
                break L0;
              } else {
                vr.c(-3);
                break L0;
              }
            }
          }
          L1: {
            if (param0 < -75) {
              break L1;
            } else {
              field_ib = -91;
              break L1;
            }
          }
          return;
        }
    }

    public void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (param3 <= 64) {
            Object var7 = null;
            ((wv) this).a(-123, (wi) null, 56, (byte) 64, 43);
        }
        if (((wv) this).field_cb) {
            qd.b(38, 3);
            ((wv) this).q(-97);
        } else {
            im.a(so.a(-79), 126, "tochangedisplayname.ws");
        }
    }

    final void r(int param0) {
        ((wv) this).field_jb.a((byte) 21, 4210752, param0);
        qp var2 = new qp((wv) this, ((wv) this).field_eb, ii.field_m);
        var2.a((byte) 99, 15, ta.field_E);
        ((wv) this).a((byte) -124, (fd) (Object) var2);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (param1 >= -60) {
            wv.j((byte) 84);
        }
        if (!((param3 ^ -1) != -14)) {
            ((wv) this).q(-115);
            return true;
        }
        return super.a(param0, (byte) -94, param2, param3);
    }

    final void a(int param0, int param1, String param2) {
        qp var4 = null;
        int var5 = 0;
        Object var6 = null;
        qp var7 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        qp stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        qp stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        qp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        String stackIn_10_3 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qp stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        qp stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        String stackOut_9_3 = null;
        qp stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        String stackOut_8_3 = null;
        var5 = Kickabout.field_G;
        if (!((wv) this).field_hb) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param0 != 256) {
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
            ((wv) this).field_cb = stackIn_5_1 != 0;
            ((wv) this).field_hb = true;
            ((wv) this).field_jb.a((byte) 21, 4210752, 8405024);
            var7 = new qp((wv) this, ((wv) this).field_eb, param2);
            var4 = var7;
            if (param0 == 5) {
              var7.a((byte) 72, 11, ql.field_d);
              var7.a((byte) 104, 17, bv.field_o);
              break L1;
            } else {
              if (-257 == (param0 ^ -1)) {
                wi discarded$2 = var7.a(bt.field_d, (jv) this, (byte) 79);
                break L1;
              } else {
                L2: {
                  stackOut_7_0 = (qp) var7;
                  stackOut_7_1 = 111;
                  stackOut_7_2 = -1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  if (((wv) this).field_gb) {
                    stackOut_9_0 = (qp) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = bt.field_d;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    break L2;
                  } else {
                    stackOut_8_0 = (qp) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = is.field_f;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    break L2;
                  }
                }
                ((qp) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, stackIn_10_3);
                break L1;
              }
            }
          }
          L3: {
            if ((param0 ^ -1) != -4) {
              if ((param0 ^ -1) == -5) {
                var7.a((byte) 96, 8, ra.field_O);
                break L3;
              } else {
                if ((param0 ^ -1) == -7) {
                  var7.a((byte) 92, 9, bv.field_p);
                  break L3;
                } else {
                  if (9 != param0) {
                    break L3;
                  } else {
                    wi discarded$3 = var7.a(ir.field_C, (jv) this, (byte) 79);
                    break L3;
                  }
                }
              }
            } else {
              var7.a((byte) 54, 7, ha.field_J);
              break L3;
            }
          }
          L4: {
            if (param1 >= 96) {
              break L4;
            } else {
              var6 = null;
              wv.a((byte) -60, 109, (tf) null, (java.awt.Point[]) null);
              break L4;
            }
          }
          ((wv) this).a((byte) -120, (fd) (Object) var7);
          return;
        } else {
          return;
        }
    }

    wv(se param0, hu param1, String param2, boolean param3, boolean param4) {
        super(param0, (fd) (Object) new qp((wv) null, param1, param2), 77, 10, 10);
        ((wv) this).field_cb = false;
        ((wv) this).field_eb = param1;
        ((wv) this).field_hb = false;
        ((wv) this).field_db = param4 ? true : false;
        ((wv) this).field_gb = param3 ? true : false;
        ((wv) this).field_jb = new ou(13, 50, 274, 30, 15, 2113632, 4210752);
        ((wv) this).field_jb.field_w = true;
        ((wv) this).a(-42, (fd) (Object) ((wv) this).field_jb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "This game option has not yet been unlocked for use.";
        field_fb = new r();
    }
}
