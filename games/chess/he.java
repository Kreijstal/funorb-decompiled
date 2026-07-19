/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ci {
    static ci field_Hb;
    static String field_Jb;
    private ci field_Ib;
    static String field_Eb;
    static int[] field_Gb;
    static String field_Lb;
    static int[] field_Fb;
    private ci field_Kb;

    final static void a(o param0, o param1, boolean param2) {
        try {
            if (null != param0.field_c) {
                param0.c(-2193);
            }
            param0.field_h = param1;
            if (!param2) {
                field_Gb = (int[]) null;
            }
            param0.field_c = param1.field_c;
            param0.field_c.field_h = param0;
            param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "he.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        this.a(param1, param4, -2147483648, param0, param5);
        int var7 = 7 / ((param2 - 94) / 32);
        this.a(param3, (byte) -3);
    }

    private final void a(int param0, byte param1) {
        int discarded$1 = 0;
        int var3 = 0;
        this.field_Ib.a(0, this.field_Ib.e((byte) -101), -2147483648, this.field_pb, 0);
        if (param1 != -3) {
          discarded$1 = this.a((byte) 94, -58);
          var3 = this.field_Ib.field_M + param0;
          this.field_Kb.a(var3, -var3 + this.field_M, param1 + -2147483645, this.field_pb, 0);
          return;
        } else {
          var3 = this.field_Ib.field_M + param0;
          this.field_Kb.a(var3, -var3 + this.field_M, param1 + -2147483645, this.field_pb, 0);
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.addMouseListener(bj.field_cb);
            param1.addMouseMotionListener(bj.field_cb);
            int var2_int = 101 / ((-38 - param0) / 46);
            param1.addFocusListener(bj.field_cb);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "he.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_Jb = null;
        field_Hb = null;
        field_Fb = null;
        field_Lb = null;
        field_Eb = null;
        if (param0) {
            return;
        }
        field_Gb = null;
    }

    he(long param0, he param1, String param2) {
        this(param0, param1.field_Ib, param1.field_Kb, param2);
    }

    final int a(byte param0, int param1) {
        java.awt.Component var4 = null;
        if (param0 < 101) {
          var4 = (java.awt.Component) null;
          he.a(-34, (java.awt.Component) null);
          return param1 + (this.field_Ib.e((byte) 118) - -this.field_Kb.e((byte) 76));
        } else {
          return param1 + (this.field_Ib.e((byte) 118) - -this.field_Kb.e((byte) 76));
        }
    }

    he(long param0, km param1, km param2, int param3, ci param4, String param5) {
        this(param0, (ci) null, param4, param5);
        try {
            this.field_Ib.field_sb = param1;
            this.field_Ib.field_cb = param3;
            this.field_Ib.field_jb = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "he.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private he(long param0, ci param1, ci param2, String param3) {
        super(param0, (ci) null);
        try {
            this.field_Ib = new ci(0L, param1);
            this.field_Kb = new ci(0L, param2);
            this.field_Kb.field_db = param3;
            this.a((byte) 123, this.field_Ib);
            this.a((byte) 124, this.field_Kb);
            this.h(0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "he.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Gb = new int[8192];
        field_Eb = "Black wins!";
        field_Jb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_Lb = "<%0> has been removed.";
    }
}
