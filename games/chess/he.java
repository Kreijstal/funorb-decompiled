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
            param0.field_c = param1.field_c;
            param0.field_c.field_h = param0;
            param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "he.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        ((he) this).a(param1, param4, -2147483648, param0, param5);
        int var7 = 7 / ((param2 - 94) / 32);
        this.a(param3, (byte) -3);
    }

    private final void a(int param0, byte param1) {
        ((he) this).field_Ib.a(0, ((he) this).field_Ib.e((byte) -101), -2147483648, ((he) this).field_pb, 0);
        int var3 = ((he) this).field_Ib.field_M + param0;
        ((he) this).field_Kb.a(var3, -var3 + ((he) this).field_M, -2147483648, ((he) this).field_pb, 0);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) bj.field_cb);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) bj.field_cb);
            int var2_int = 101 / ((-38 - param0) / 46);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) bj.field_cb);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "he.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_Jb = null;
        field_Hb = null;
        field_Fb = null;
        field_Lb = null;
        field_Eb = null;
        field_Gb = null;
    }

    he(long param0, he param1, String param2) {
        this(param0, param1.field_Ib, param1.field_Kb, param2);
    }

    final int a(byte param0, int param1) {
        Object var4 = null;
        if (param0 < 101) {
          var4 = null;
          he.a(-34, (java.awt.Component) null);
          return param1 + (((he) this).field_Ib.e((byte) 118) - -((he) this).field_Kb.e((byte) 76));
        } else {
          return param1 + (((he) this).field_Ib.e((byte) 118) - -((he) this).field_Kb.e((byte) 76));
        }
    }

    he(long param0, km param1, km param2, int param3, ci param4, String param5) {
        this(param0, (ci) null, param4, param5);
        try {
            ((he) this).field_Ib.field_sb = param1;
            ((he) this).field_Ib.field_cb = param3;
            ((he) this).field_Ib.field_jb = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "he.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private he(long param0, ci param1, ci param2, String param3) {
        super(param0, (ci) null);
        try {
            ((he) this).field_Ib = new ci(0L, param1);
            ((he) this).field_Kb = new ci(0L, param2);
            ((he) this).field_Kb.field_db = param3;
            ((he) this).a((byte) 123, ((he) this).field_Ib);
            ((he) this).a((byte) 124, ((he) this).field_Kb);
            ((he) this).h(0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "he.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = new int[8192];
        field_Eb = "Black wins!";
        field_Jb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_Lb = "<%0> has been removed.";
    }
}
