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

    final static void a(int param0, boolean param1, int param2, ic param3, pn param4, java.awt.Component param5, int param6, int param7) {
        try {
            tb.a(param2, param1, 10);
            fc.field_a = tb.a(param4, param5, 0, param0);
            cm.field_j = tb.a(param4, param5, 1, param6);
            ll.field_e = new wg();
            ej.field_B = param6 * 1000 / param2;
            cm.field_j.a(ll.field_e);
            if (param7 > -71) {
                field_g = 'ﾓ';
            }
            q.field_f = param3;
            q.field_f.a(ll.field_q, 1000000);
            fc.field_a.a(q.field_f);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "v.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(int param0) {
        this.field_a = mm.a(param0 ^ 17297);
        if (param0 != -17382) {
            field_c = (String) null;
        }
    }

    public final vd a(byte param0) {
        if (!this.b(true)) {
          if ((mm.a(114) ^ -1L) > (this.field_a + 350L ^ -1L)) {
            return nh.field_J;
          } else {
            if (param0 != 21) {
              return (vd) null;
            } else {
              return this.b(param0 + -32013);
            }
          }
        } else {
          return ka.field_S;
        }
    }

    public final String a(boolean param0) {
        if (!this.b(param0)) {
          if (mm.a(85) < this.field_a + 350L) {
            return null;
          } else {
            return this.b((byte) -42);
          }
        } else {
          return null;
        }
    }

    abstract vd b(int param0);

    public static void c(boolean param0) {
        java.awt.Component var2;
        field_b = null;
        if (!param0) {
          var2 = (java.awt.Component) null;
          v.a(-71, false, 92, (ic) null, (pn) null, (java.awt.Component) null, -72, -65);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    abstract String b(byte param0);

    final static void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ji.field_i = param0;
              in.field_i = bg.field_G;
              if (param2 == 10) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("v.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    static {
        field_f = "MISSION <%0> <%1>";
        field_b = new int[]{4};
        field_d = "Orb coins: ";
        field_g = '/';
        field_c = "components:</col>";
    }
}
