/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends java.awt.Canvas implements java.awt.event.FocusListener {
    static long field_f;
    static String field_j;
    static String field_k;
    static String field_e;
    static int[] field_c;
    static String field_i;
    static boolean field_d;
    volatile boolean field_b;
    java.awt.Frame field_g;
    static tg field_a;
    static float field_h;

    final void a(jk param0, int param1) {
        try {
          wf.a(this.field_g, param0, param1 ^ -103);
          if (param1 != -3) {
            a.a((byte) 81, 'O', -12);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "a.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(int param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          if (!ed.a(var6, 21257)) {
            stackIn_3_0 = qj.field_a;
            return stackIn_3_0;
          }
          if (qd.a((byte) 13, param1)) {
            stackIn_6_0 = ed.field_a;
            return stackIn_6_0;
          }
          if (ld.field_g != 2) {
            stackIn_9_0 = td.field_j;
            return stackIn_9_0;
          }
          if (va.a(param1, -19554)) {
            stackIn_13_0 = oc.a(dh.field_g, new String[]{param1}, (byte) -94);
            return stackIn_13_0;
          }
          if (wc.field_v >= 100) {
            stackIn_16_0 = nb.field_Hb;
            return stackIn_16_0;
          }
          if (ah.a(param1, -52)) {
            stackIn_19_0 = oc.a(mf.field_B, new String[]{param1}, (byte) -85);
            return stackIn_19_0;
          }
          if (param2 != 64) {
            stackIn_22_0 = (String) null;
            return stackIn_22_0;
          }
          var5 = qn.field_U;
          var5.f(param0, param2 - 165);
          var5.field_l = var5.field_l + 1;
          var4 = var5.field_l;
          var5.c(2, (byte) 68);
          var5.a(-121, param1);
          var5.a(-var4 + var5.field_l, -1);
          stackIn_24_0 = null;
          return (String) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("a.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    final static aj a(String[] args, int param1) {
        aj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        aj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new aj(false);
          var3 = -37 / ((-21 - param1) / 51);
          var2.field_a = args;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("a.C(");
          if (args == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_c = null;
        if (param0 == -9) {
          field_a = null;
          return;
        }
        String var2 = (String) null;
        a.a(19, (String) null, (byte) 40);
        field_a = null;
    }

    final static java.awt.Container a(byte param0) {
        if (param0 != -110) {
          return (java.awt.Container) null;
        }
        if (lk.field_a != null) {
          return (java.awt.Container) ((Object) lk.field_a);
        }
        return (java.awt.Container) ((Object) bh.i(81));
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String[] var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3) {
            stackIn_2_0 = uj.field_o;
            return stackIn_2_0;
          }
          if (param0 == 6) {
            stackIn_5_0 = hk.field_L;
            return stackIn_5_0;
          }
          if (param0 == 7) {
            stackIn_9_0 = jf.field_g;
            return stackIn_9_0;
          }
          if (param0 == 8) {
            stackIn_13_0 = lf.field_P;
            return stackIn_13_0;
          }
          if (param0 == 9) {
            stackIn_17_0 = ma.field_F;
            return stackIn_17_0;
          }
          if (param0 == 10) {
            stackIn_21_0 = dj.field_q;
            return stackIn_21_0;
          }
          if (param0 == 11) {
            stackIn_25_0 = hk.field_N;
            return stackIn_25_0;
          }
          if (param0 == 14) {
            stackIn_28_0 = oc.a(hn.field_b, new String[]{param1}, (byte) -119);
            return stackIn_28_0;
          }
          if (param2 == -3) {
            return null;
          }
          var4 = (String[]) null;
          a.a((String[]) null, -18);
          stackIn_32_0 = null;
          return (String) (stackIn_32_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("a.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          int var2_int = 15 / ((param0 - 36) / 59);
          param1.addKeyListener(lg.field_d);
          param1.addFocusListener(lg.field_d);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "a.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "a.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    a() {
    }

    final static String a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Chess.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; param2 > var4; var4++) {
          var6[var4] = param1;
        }
        if (param0 >= 55) {
          return new String(var3);
        }
        field_k = (String) null;
        return new String(var3);
    }

    static {
        field_e = "Chat is currently disabled.";
        field_i = "Enter name of friend to delete from list";
        field_k = "Private";
        field_j = "You are invited to <%0>'s game.";
    }
}
