/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends ai {
    static String field_l;
    int field_j;
    static boolean field_p;
    int field_o;
    static String field_m;
    int field_h;
    int field_k;
    int field_i;
    static String field_n;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (param2) {
          if (10 <= sa.field_k) {
            if (tk.c(250)) {
              if (mh.field_U != 0) {
                i.a(param0, 0);
                return;
              } else {
                of.a(false, param1, (byte) -48);
                qi.a(param0, 0, 0, -25971);
                return;
              }
            } else {
              na.a();
              pc.a(240, (byte) -66, 320);
              qi.a(param0, 0, 0, -25971);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!ae.field_b) {
                break L0;
              } else {
                ae.field_b = false;
                var3 = 1;
                break L0;
              }
            }
            ai.a(var3 != 0, da.field_d, -24, mj.b((byte) -26), jk.a((byte) -105));
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        Object var3 = null;
        param0--;
        if (param1 != 24636) {
          var3 = null;
          ke.a((java.awt.Canvas) null, false, false);
          param0 = param0 | param0 >>> -1847409343;
          param0 = param0 | param0 >>> -179264062;
          param0 = param0 | param0 >>> -1748058652;
          param0 = param0 | param0 >>> -265561336;
          param0 = param0 | param0 >>> -1536370896;
          return param0 - -1;
        } else {
          param0 = param0 | param0 >>> -1847409343;
          param0 = param0 | param0 >>> -179264062;
          param0 = param0 | param0 >>> -1748058652;
          param0 = param0 | param0 >>> -265561336;
          param0 = param0 | param0 >>> -1536370896;
          return param0 - -1;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -196) {
          var2 = null;
          ke.a((java.awt.Canvas) null, true, false);
          field_m = null;
          field_l = null;
          field_n = null;
          return;
        } else {
          field_m = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    ke(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ke) this).field_k = param3;
        ((ke) this).field_j = param4;
        ((ke) this).field_g = param0;
        ((ke) this).field_i = param1;
        ((ke) this).field_h = param2;
        ((ke) this).field_o = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please check if address is correct";
        field_n = "Waiting for music";
    }
}
