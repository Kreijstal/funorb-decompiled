/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements tl {
    static int[] field_b;
    static int field_e;
    static String field_f;
    static String field_d;
    static char field_g;
    static String field_c;
    private long field_a;

    final static void a(int param0, boolean param1, int param2, ic param3, pn param4, java.awt.Component param5) {
        try {
            tb.a(22050, true, 10);
            fc.field_a = tb.a(param4, param5, 0, 22050);
            cm.field_j = tb.a(param4, param5, 1, 1024);
            ll.field_e = new wg();
            ej.field_B = 46;
            cm.field_j.a((we) (Object) ll.field_e);
            q.field_f = param3;
            q.field_f.a(ll.field_q, 1000000);
            fc.field_a.a((we) (Object) q.field_f);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "v.V(" + 22050 + ',' + true + ',' + 22050 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + 1024 + ',' + -98 + ')');
        }
    }

    public final void a(int param0) {
        ((v) this).field_a = mm.a(param0 ^ 17297);
        if (param0 != -17382) {
            field_c = null;
        }
    }

    public final vd a(byte param0) {
        if (!((v) this).b(true)) {
          if (~mm.a(114) > ~(((v) this).field_a + 350L)) {
            return nh.field_J;
          } else {
            if (param0 != 21) {
              return null;
            } else {
              return ((v) this).b(param0 + -32013);
            }
          }
        } else {
          return ka.field_S;
        }
    }

    public final String a(boolean param0) {
        if (!((v) this).b(param0)) {
          if (mm.a(85) < ((v) this).field_a + 350L) {
            return null;
          } else {
            return ((v) this).b((byte) -42);
          }
        } else {
          return null;
        }
    }

    abstract vd b(int param0);

    public static void c(boolean param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract String b(byte param0);

    final static void a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ji.field_i = param0;
          in.field_i = bg.field_G;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("v.AA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 10 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "MISSION <%0> <%1>";
        field_b = new int[]{4};
        field_d = "Orb coins: ";
        field_g = '/';
        field_c = "components:</col>";
    }
}
