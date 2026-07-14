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

    final static int d(int param0) {
        Object var2 = null;
        if (param0 != -31137) {
          var2 = null;
          boolean discarded$2 = qd.a((byte) 82, (String) null);
          return (int)(1000000000L / ji.field_U);
        } else {
          return (int)(1000000000L / ji.field_U);
        }
    }

    final static boolean a(byte param0, String param1) {
        if (param0 != 13) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return cc.field_A.equals((Object) (Object) ad.a(var3, param0 + -15));
    }

    final static int a(boolean param0) {
        if (param0) {
            field_I = null;
            return tf.field_o - vh.field_g;
        }
        return tf.field_o - vh.field_g;
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 27265) {
          int discarded$2 = qd.a(true);
          field_I = null;
          field_G = null;
          field_l = null;
          field_w = null;
          return;
        } else {
          field_I = null;
          field_G = null;
          field_l = null;
          field_w = null;
          return;
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ag.field_e = stackIn_3_0 != 0;
        if (param0 != -1845) {
          return;
        } else {
          cf.field_Nb = true;
          ua.field_d = new vn(jh.field_e, tk.field_a, param1, dk.field_g, ag.field_e);
          jh.field_e.b((mf) (Object) ua.field_d, (byte) -27);
          return;
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
