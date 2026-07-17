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
        RuntimeException var2_ref = null;
        bg[] var3 = null;
        int var4 = 0;
        bg var5 = null;
        int var6 = 0;
        Object var7 = null;
        bg stackIn_4_0 = null;
        bg stackIn_10_0 = null;
        bg stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_3_0 = null;
        bg stackOut_14_0 = null;
        bg stackOut_9_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = rp.a(false, "jagex-last-login-method", param0);
            if (var2 == null) {
              stackOut_3_0 = mj.field_Rb;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3 = oh.c((byte) -90);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  L2: {
                    if (param1) {
                      break L2;
                    } else {
                      var7 = null;
                      bg discarded$2 = jc.a((java.applet.Applet) null, false);
                      break L2;
                    }
                  }
                  stackOut_14_0 = mj.field_Rb;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a((byte) 80, var2)) {
                    stackOut_9_0 = (bg) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("jc.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0;
    }

    final static void a(int param0, bc param1) {
        fd var2 = null;
        try {
            fd.b(param1.a(true, "", "headers.packvorbis"));
            var2 = fd.a(param1, "jagex logo2.packvorbis", "");
            kk discarded$0 = var2.b();
            int var3 = 38 / ((param0 - 28) / 50);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jc.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean f(int param0) {
        if (gm.field_i < 10) {
            return false;
        }
        if (eh.field_P) {
            return false;
        }
        return !cb.b((byte) -119) ? true : false;
    }

    final static void a(int param0, bi param1) {
        ra.a(-117);
        pc.field_n = new bi(128, 128);
        pc.field_n.e();
        if (param0 <= 12) {
            return;
        }
        try {
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
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jc.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
