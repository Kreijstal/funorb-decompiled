/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ef field_f;
    static String field_c;
    static String field_e;
    static gh field_b;
    static int field_h;
    static String field_g;
    static String field_a;
    static int[] field_d;

    final static void a(boolean param0) {
        if (!param0) {
          field_h = 85;
          if (null == qi.field_d) {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          }
          return;
        }
        if (null != qi.field_d) {
          return;
        }
        qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
    }

    final static void a(int param0, pn param1, int param2, ic param3, boolean param4, java.awt.Component param5) {
        try {
          int var6_int = 23 / ((-76 - param0) / 40);
          v.a(param2, param4, param2, param3, param1, param5, 1024, -98);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ah var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = wi.a(param1, (byte) 122);
          if (param0 != -31) {
            field_h = 51;
          }
          if (var4 != null &&
            null != var4.field_ac) {
            return true;
          }
          stackIn_11_0 = (null != nf.field_b) && (kh.a(false, param2) != null);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("qm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 == 20272) {
          if (null != ch.field_O) {
            ch.field_O.m(param0 ^ 20312);
          }
          nm.field_o = new qc();
          ci.field_a.c(nm.field_o, param0 - 22929007);
          return;
        }
        field_e = (String) null;
        if (null != ch.field_O) {
          ch.field_O.m(param0 ^ 20312);
        }
        nm.field_o = new qc();
        ci.field_a.c(nm.field_o, param0 - 22929007);
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        int var1 = 3 / ((param0 + 55) / 62);
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_f = new ef();
        field_e = "<br><br><col=ffffff>This sentinel uses the following ";
        field_h = -1;
        field_c = "RMB <img=26>: Scroll view";
        field_g = "Show private chat from my friends and opponents";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = new int[]{108, -1, 30, 28, 29, -1, -1, -1, -1, -1, -1};
    }
}
