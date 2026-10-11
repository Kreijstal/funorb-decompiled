/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_c;
    static ph field_g;
    static boolean field_d;
    static long field_e;
    static int field_a;
    vh field_b;
    int field_f;

    final static void a(int param0) {
        if (param0 != 96) {
          return;
        }
        if (null != ub.field_n) {
          ub.field_n.c();
          if (null != hm.field_n) {
            hm.field_n.c();
            return;
          }
          return;
        }
        if (null == hm.field_n) {
          return;
        }
        hm.field_n.c();
    }

    public static void b(int param0) {
        if (param0 != 96) {
          return;
        }
        field_c = null;
        field_g = null;
    }

    wh(vh param0, int param1) {
        try {
          this.field_f = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static gp a(byte[] param0, byte param1) {
        gp var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        gp stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -122) {
            wh.b(-53);
          }
          if (param0 == null) {
            stackIn_4_0 = null;
            return (gp) (stackIn_4_0);
          }
          var2 = new gp(param0, hg.field_t, fe.field_g, jc.field_f, jn.field_k, ub.field_q);
          sb.a(500);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("wh.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 96;
        field_c = "Select rooms to place from the panel on the left";
    }
}
