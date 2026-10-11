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
        if (param0 >= 59) {
          this.field_H = null;
          this.field_j = null;
          this.field_q = null;
          this.field_K = null;
          return;
        }
        field_l = (String) null;
        this.field_H = null;
        this.field_j = null;
        this.field_q = null;
        this.field_K = null;
    }

    final static int d(int param0) {
        if (param0 == -31137) {
          return (int)(1000000000L / ji.field_U);
        }
        String var2 = (String) null;
        qd.a((byte) 82, (String) null);
        return (int)(1000000000L / ji.field_U);
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = cc.field_A.equals(ad.a(var3, param0 - 15));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          field_I = (String) null;
          return tf.field_o - vh.field_g;
        }
        return tf.field_o - vh.field_g;
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 == 27265) {
          field_I = null;
          field_G = null;
          field_l = null;
          field_w = null;
          return;
        }
        qd.a(true);
        field_I = null;
        field_G = null;
        field_l = null;
        field_w = null;
    }

    final static void a(int param0, String param1, boolean param2) {
        ag.field_e = param2;
        if (param0 != -1845) {
          return;
        }
        try {
          cf.field_Nb = true;
          ua.field_d = new vn(jh.field_e, tk.field_a, param1, dk.field_g, ag.field_e);
          jh.field_e.b(ua.field_d, (byte) -27);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "qd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    qd() {
    }

    static {
        field_w = null;
        field_I = "Play the game without logging in just yet";
        field_l = "You must play 1 more rated game before playing with the current options.";
        field_G = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_m = new tk();
    }
}
