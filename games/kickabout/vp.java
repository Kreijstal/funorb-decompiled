/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp implements hc {
    private int field_i;
    static String field_d;
    static sj field_j;
    static String field_n;
    static ff field_o;
    static int field_f;
    static int field_c;
    static int field_a;
    static int field_h;
    static String field_e;
    static String field_l;
    static String field_b;
    static int field_k;
    static String field_g;
    static String field_p;
    static String field_m;

    final static void a(int param0, int param1) {
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nm var6 = null;
        nm var7 = null;
        int var8 = 0;
        int var11 = 0;
        dd var12 = null;
        int var4Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (param1 == wr.field_l) {
            return;
          }
          hq.field_a = false;
          wr.field_l = param1;
          var12 = new dd();
          Runtime.getRuntime().freeMemory();
          if (wr.field_l != 0 &&
            wr.field_l != 1) {
            vf.field_K = new byte[5][][][];
            cb.field_b = new byte[5][][];
            var3 = 5;
            for (var4 = 0; var4 < 5; var4++) {
              var3 = var3 + pv.field_I[var4][5].field_e.length / 3;
            }
            var4Lifetime1 = 0;
            if (param0 != -4121) {
              vp.c(9);
            }
            for (var5 = 0; var5 < 5; var5++) {
              var6 = pv.field_I[var5][5];
              var7 = pv.field_I[var5][3];
              var12.a(var7, (byte) -107);
              cb.field_b[var5] = new byte[8][];
              for (var8 = 0; var8 < 8; var8++) {
                kh.a(var5, var12, var8 << 8, false, 2150);
                cb.field_b[var5][var8] = ge.a(16, vf.field_F);
              }
              var12.a(var6, (byte) -107);
              var8Lifetime1 = (2 + var6.field_e.length) / 3;
              vf.field_K[var5] = new byte[var8Lifetime1][8][];
              for (var9 = 0; var9 < var8Lifetime1; var9++) {
                var12.a(var9 * 3, -39);
                for (var10 = 0; var10 < 8; var10++) {
                  kh.a(var5, var12, var10 << 8, false, 2150);
                  vf.field_K[var5][var9][var10] = ge.a(16, vf.field_F);
                }
                var4Lifetime1++;
                jm.a(var3, param0 + 13984, var4Lifetime1);
              }
            }
            hq.field_a = true;
            return;
          }
          hq.field_a = true;
          vf.field_K = (byte[][][][]) null;
          cb.field_b = (byte[][][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "vp.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 8) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (od.field_n && (sf.c(-1, param0 - 9) ||
          sf.c(-2, param0 - 9))) {
          stackIn_8_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = false;
        }
        return stackIn_8_0;
    }

    final static int a(int param0, int param1, byte param2) {
        if (null == td.field_c) {
          return -1;
        }
        if (param1 >= ik.field_D &&
          ik.field_D + td.field_c.field_q > param1 &&
          rp.field_w <= param0 &&
          param0 < rp.field_w + td.field_c.field_w) {
          return 0;
        }
        if (ha.field_G <= param1 &&
          ha.field_G + td.field_c.field_q > param1 &&
          param0 >= lr.field_q &&
          param0 < td.field_c.field_w + lr.field_q) {
          return 1;
        }
        if (param2 < 0) {
          field_b = (String) null;
        }
        return -1;
    }

    vp() {
        this.field_i = 0;
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != lw.field_e) {
          var1 = lw.field_e;
          synchronized (var1) {
            lw.field_e = null;
          }
        }
        if (param0 > -103) {
          field_b = (String) null;
        }
    }

    public final void a(int param0, boolean param1) {
        String var4;
        pe.b(0);
        var4 = (String) null;
        vc.a((String) null, -1);
        if (param0 != -25) {
          field_a = -18;
        }
        if (this.b(8)) {
          if (sr.field_l == null) {
            if (um.field_e != null &&
              um.field_e.field_A && (!um.field_e.e(param0 ^ 25) ||
              um.field_e.b(-21660))) {
              ui.h(param0 ^ 15419);
              vc.a(wn.field_h, param0 ^ 24);
              jh.a(6356832, (byte) -25);
            }
          } else {
            ui.h(-15396);
            vc.a(qr.field_g, -1);
            jh.a(6356832, (byte) -25);
          }
          this.field_i = this.field_i + 1;
          ul.a(true, 300, 320, param1);
        }
    }

    public final boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 63) {
          vp.b((byte) 99);
        }
        stackIn_6_0 = (this.b(8)) && (vg.field_Wb);
        return stackIn_6_0;
    }

    public final boolean a(int param0, int param1, char param2) {
        boolean stackIn_6_0 = false;
        if (param0 != 11516) {
          return true;
        }
        stackIn_6_0 = (this.b(param0 ^ 11508)) && (ud.a(13, 12, 17860, 15));
        return stackIn_6_0;
    }

    public final void a(int param0) {
        int var2 = 83 % ((50 - param0) / 45);
        if (this.a((byte) 87)) {
          ei.a((this.field_i & 8) == 0 ? true : false, false);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        if (param0 < 77) {
          field_a = 64;
        }
        field_l = null;
        field_e = null;
        field_b = null;
        field_n = null;
        field_p = null;
        field_d = null;
        field_o = null;
        field_g = null;
        field_j = null;
    }

    static {
        field_n = "Play rated game";
        field_d = "tournament lobby";
        field_o = new ff(8, 0, 4, 1);
        de.b(50, (byte) -110);
        field_l = "Loading animations";
        field_g = "Public chat is unavailable while setting up a rated game.";
        field_b = "Quick Chat Help";
        field_m = "Report <%0> for abuse";
    }
}
