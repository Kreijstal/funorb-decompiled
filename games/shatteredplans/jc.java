/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc extends df {
    static int field_o;
    static String field_s;
    static int field_p;
    boolean field_q;
    boolean field_t;
    static int field_r;
    volatile boolean field_u;

    final static void a(int param0, byte param1) {
        int var2 = -92 % ((78 - param1) / 44);
        kc.field_i = param0;
        p.field_n = true;
        if (!(param0 != 1)) {
            jo.a(32767, sf.field_d, true, 476);
        }
    }

    public static void g(int param0) {
        if (param0 != -18301) {
            return;
        }
        field_s = null;
    }

    abstract byte[] e(byte param0);

    abstract int e(int param0);

    final static bg a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        bg[] var3 = null;
        int var4 = 0;
        bg var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = rp.a(false, "jagex-last-login-method", param0);
        if (var2 == null) {
          return mj.field_Rb;
        } else {
          var3 = oh.c((byte) -90);
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              if (!param1) {
                var7 = null;
                bg discarded$2 = jc.a((java.applet.Applet) null, false);
                return mj.field_Rb;
              } else {
                return mj.field_Rb;
              }
            } else {
              var5 = var3[var4];
              if (var5.a((byte) 80, var2)) {
                return var5;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, bc param1) {
        fd.b(param1.a(true, "", "headers.packvorbis"));
        fd var2 = fd.a(param1, "jagex logo2.packvorbis", "");
        kk discarded$0 = var2.b();
        int var3 = 38 / ((param0 - 28) / 50);
    }

    final static boolean f(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -11) {
          if ((gm.field_i ^ -1) <= -11) {
            if (eh.field_P) {
              return false;
            } else {
              L0: {
                if (cb.b((byte) -119)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_s = null;
          if ((gm.field_i ^ -1) <= -11) {
            if (eh.field_P) {
              return false;
            } else {
              L1: {
                if (cb.b((byte) -119)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, bi param1) {
        ra.a(-117);
        pc.field_n = new bi(128, 128);
        pc.field_n.e();
        if (param0 <= 12) {
          return;
        } else {
          param1.f(0, 0);
          ks.field_h = new bi(256, 256);
          ks.field_h.e();
          pc.field_n.b(0, 0, 256, 256);
          gf.b(3, 3, 0, 0, 256, 256);
          lq.field_o = new bi(32, 32);
          lq.field_o.e();
          pc.field_n.g(0, 0);
          n.field_k = new bi(256, 256);
          n.field_k.e();
          pc.field_n.f(64, 64);
          gf.b(12, 12, 0, 0, 256, 256);
          ed.field_b = new bi(64, 64);
          ed.field_b.e();
          lq.field_o.f(16, 16);
          gf.b(3, 3, 0, 0, 64, 64);
          cg.i(0);
          return;
        }
    }

    jc() {
        ((jc) this).field_u = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
