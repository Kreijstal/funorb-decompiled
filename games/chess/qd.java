/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends o {
    int field_C;
    int field_y;
    int field_p;
    lm field_H;
    int field_o;
    int field_v;
    static String field_I;
    int field_t;
    int field_n;
    static qe field_w;
    int field_F;
    int field_k;
    static tk field_m;
    int field_D;
    int field_J;
    static int field_r;
    int field_B;
    int field_E;
    na field_j;
    int field_x;
    int field_z;
    static String field_l;
    static int field_u;
    int field_s;
    int field_A;
    kf field_q;
    dl field_K;
    static String field_G;

    final void c(byte param0) {
        if (param0 < 59) {
          field_l = null;
          ((qd) this).field_H = null;
          ((qd) this).field_j = null;
          ((qd) this).field_q = null;
          ((qd) this).field_K = null;
          return;
        } else {
          ((qd) this).field_H = null;
          ((qd) this).field_j = null;
          ((qd) this).field_q = null;
          ((qd) this).field_K = null;
          return;
        }
    }

    final static int d() {
        return (int)(1000000000L / ji.field_U);
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            stackOut_2_0 = cc.field_A.equals((Object) (Object) ad.a(var3, -2));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qd.F(").append(13).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0) {
        return tf.field_o - vh.field_g;
    }

    public static void a() {
        field_m = null;
        field_I = null;
        field_G = null;
        field_l = null;
        field_w = null;
    }

    final static void a(int param0, String param1, boolean param2) {
        ag.field_e = param2;
        try {
            cf.field_Nb = true;
            ua.field_d = new vn(jh.field_e, tk.field_a, param1, dk.field_g, ag.field_e);
            jh.field_e.b((mf) (Object) ua.field_d, (byte) -27);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "qd.B(" + -1845 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    qd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = null;
        field_I = "Play the game without logging in just yet";
        field_l = "You must play 1 more rated game before playing with the current options.";
        field_G = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_m = new tk();
    }
}
