/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static vh field_d;
    static dd field_k;
    static int field_h;
    static dd field_m;
    static int field_g;
    static java.awt.Font field_c;
    static String field_i;
    static int field_e;
    static boolean field_f;
    static String field_l;
    static String field_a;
    static String field_b;
    static String field_j;
    static String field_n;

    final static boolean a(int param0, vh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.field_sb;
          if (param0 != 1) {
            field_n = (String) null;
          }
          var3 = param1.field_ib;
          stackIn_8_0 = (wn.field_i >= var2_int) && (var2_int + param1.field_gb > wn.field_i) && (var3 <= gg.field_f) && (var3 + param1.field_Db > gg.field_f);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        field_a = null;
        field_n = null;
        field_l = null;
        if (param0 <= -43) {
          field_b = null;
          field_m = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static wl a(byte[] param0, boolean param1) {
        wl var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        wl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (wl) (stackIn_2_0);
          }
          var2 = new wl(param0, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
          sh.h(-1);
          if (!param1) {
            field_j = (String) null;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("cl.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        td.field_c.setLength(0);
        hn.field_b = 0;
        if (param0 != 14851) {
          field_n = (String) null;
        }
    }

    final static void a(int param0, int param1, int[] param2, float[] param3, float[] param4) {
        if (!am.a((byte) 107, param2, param3)) {
          return;
        }
        if (!am.a((byte) 127, param2, param4)) {
          return;
        }
        try {
          qh.d((int)param3[0], (int)param3[param1], (int)param4[0], (int)param4[1], param0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_l = "Public chat is unavailable while setting up a rated game.";
        field_b = "Click";
        field_a = "Only show lobby chat from my friends";
        field_j = "Please wait...";
        field_i = "Friends";
        field_n = "Members only";
    }
}
