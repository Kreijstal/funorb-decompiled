/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends l {
    static boolean field_n;
    static he field_h;
    static int field_k;
    static String field_i;
    static int field_l;
    static int field_g;
    int field_o;
    static String field_m;
    int field_j;

    final static void a(int param0, eh param1) {
        gj var2 = null;
        if (param0 != 1048576) {
          return;
        }
        try {
          gj.a(param1.a("headers.packvorbis", 100, ""));
          var2 = gj.a(param1, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= 45) {
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        }
        field_g = 115;
        field_h = null;
        field_i = null;
        field_m = null;
    }

    final static void a(int param0, int param1, boolean param2, sc param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (null != wc.field_f) {
            wl.a(1048576, param0 - 10509, param1, param3, param2);
          }
          if (param0 != -1) {
            return;
          }
          if (vg.field_B == null) {
            return;
          }
          var4 = ae.field_g;
          synchronized (var4) {
            vg.field_B.a(param1, true, -1);
            if (param3 == qi.field_b) {
              return;
            }
            vg.field_B.c(false);
            ae.field_g.h();
            qi.field_b = param3;
            if (null != qi.field_b) {
              vg.field_B.a(param2, 37, qi.field_b);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) (stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        we.field_c.a(param1, 24960);
        ab var2 = fh.field_c;
        if (param0 < -60) {
          if (var2 != null) {
            var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
          }
          return;
        }
        sc var3 = (sc) null;
        la.a(22, -99, true, (sc) null);
        if (var2 != null) {
          var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
        }
    }

    private la() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Ask to join <%0>'s game";
        field_n = false;
        field_m = "Hide game chat";
        field_g = 0;
    }
}
