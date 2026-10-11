/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    int field_i;
    private int field_b;
    static String field_h;
    static lr[] field_g;
    static int field_c;
    static int field_a;
    static kv field_f;
    String field_d;
    String field_e;

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = BachelorFridge.field_y;
        try {
          if (iba.field_s == kaa.field_m) {
            return;
          }
          if (tn.a(iba.field_s, 124)) {
            eg.field_p[iba.field_s].j(-5);
          }
          ip.a((byte) 22, kaa.field_m);
          iba.field_s = kaa.field_m;
          vla.field_w = sia.field_h;
          tma.field_v = 0;
          if (kaa.field_m != 1 &&
            kaa.field_m != -3) {
            ct.c(0, -114);
          }
          if (!param0) {
            field_h = (String) null;
          }
          if (nu.field_b) {
            nu.field_b = false;
            gs.field_f = null;
            dj.field_c = null;
            sna.field_fb = null;
            baa.e(17035);
            iba.d(34);
          }
          if (ai.field_c) {
            tla.field_q = new eaa();
            var9 = sg.field_q;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
              var9[var2] = 0;
            }
            var10 = nga.field_i;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (var6 < 8) {
              var10[var6] = 0;
              var6++;
            }
            ai.field_c = false;
          }
          if (ge.field_D) {
            ih.d((byte) -109);
            oga.e(46);
            eo.c(106);
            ge.field_D = false;
          }
          if (iba.field_s == 12) {
            tla.d(-89);
          } else {
            if (iba.field_s == 0) {
              tla.d(-89);
            } else {
              if (iba.field_s == -2) {
                tla.d(-89);
              }
            }
          }
          if (iba.field_s != 0 &&
            kaa.field_m == -3 &&
            iba.field_s != 12) {
            ena.a((byte) -44, wha.field_a);
            return;
          }
          if (kaa.field_m == -1) {
            hba.a(true, wha.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "rs.D(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_6_0 = (null != pja.field_e) && (null != pja.field_e.h(0));
        return stackIn_6_0;
    }

    final static vr a(int param0, boolean param1, int param2, boolean param3, int param4) {
        if (param2 != 0) {
          rs.a(false);
        }
        return qma.a(param3, 2097152, false, param0, param1, param4);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 2) {
          rs.b(true);
        }
        field_g = null;
        field_h = null;
    }

    rs(int param0, int param1) {
        this.field_i = param1;
        this.field_b = param0;
        this.field_d = kna.field_g[this.field_b];
        this.field_e = c.field_k[this.field_b];
    }

    static {
        field_h = "You can spectate this game";
    }
}
