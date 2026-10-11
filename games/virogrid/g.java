/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static eh field_a;
    static tn field_b;
    static boolean field_c;
    static String field_d;

    final static void a(int param0) {
        if (param0 != 13984) {
          field_c = false;
          qc.field_h = true;
          sd.field_e = 0;
          return;
        }
        qc.field_h = true;
        sd.field_e = 0;
    }

    final static void a(byte param0, u param1) {
        if (param0 < 60) {
          return;
        }
        try {
          param1.field_w = new int[]{-1};
          param1.field_r = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "g.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 > -18) {
          u var2 = (u) null;
          g.a((byte) 15, (u) null);
        }
    }

    final static void a(byte param0) {
        kf.a(4, -1);
        if (param0 != -33) {
          g.b((byte) 71);
        }
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        hg var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!dm.a(var6, -1478)) {
            stackIn_2_0 = sa.field_l;
            return stackIn_2_0;
          }
          if (param1 > -127) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (jc.a(param0, true)) {
            stackIn_9_0 = ql.field_k;
            return stackIn_9_0;
          }
          if (oa.field_q != 2) {
            stackIn_12_0 = sa.field_p;
            return stackIn_12_0;
          }
          if (fm.a(param0, -1369854352)) {
            stackIn_15_0 = oi.a(new String[]{param0}, lc.field_d, 2);
            return stackIn_15_0;
          }
          if (mj.field_z >= 100) {
            stackIn_18_0 = ig.field_a;
            return stackIn_18_0;
          }
          if (ch.a(param0, (byte) -73)) {
            stackIn_21_0 = oi.a(new String[]{param0}, o.field_c, 2);
            return stackIn_21_0;
          }
          var5 = gk.field_g;
          var5.g(param2, 8);
          var5.field_l = var5.field_l + 1;
          var4 = var5.field_l;
          var5.a(2, 76);
          var5.a(param0, (byte) -96);
          var5.b(var5.field_l - var4, -1);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("g.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new tn(1);
        field_d = "This game option is not available in rated games.";
        field_c = false;
    }
}
