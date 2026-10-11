/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb extends ll {
    static String field_q;
    static boolean field_p;
    static kl field_r;
    static String field_s;

    public static void b(int param0) {
        if (param0 == -1) {
          field_r = null;
          field_s = null;
          field_q = null;
          return;
        }
        qb.a((byte) 59, 86);
        field_r = null;
        field_s = null;
        field_q = null;
    }

    qb(vd param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_M, -1, 2147483647, false);
    }

    final static uh a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        uh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -82) {
            qb.a((byte) -117, -79);
          }
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf('@') != -1) {
            var6 = param3;
          } else {
            var7 = (CharSequence) ((Object) param3);
            var4_long = sb.a((byte) 124, var7);
          }
          stackIn_6_0 = uk.a((String) (var6), 8355711, var4_long, param1, param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qb.V(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        try {
          if (param4) {
            pe.a(param2.field_n, (byte) -14, param1 + param2.field_l, param2.field_r, param0 + param2.field_o);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        r.field_e = 3 & param1 >> 4;
        if (!(2 >= r.field_e)) {
          r.field_e = 2;
        }
        if (param0 != 52) {
          qb.b(73);
          ff.field_J = param1 >> 2 & 3;
          if (!(ff.field_J <= 2)) {
            ff.field_J = 2;
          }
          di.field_e = 3 & param1;
          if (di.field_e > 2) {
            di.field_e = 2;
            return;
          }
          return;
        }
        ff.field_J = param1 >> 2 & 3;
        if (!(ff.field_J <= 2)) {
          ff.field_J = 2;
        }
        di.field_e = 3 & param1;
        if (di.field_e <= 2) {
          return;
        }
        di.field_e = 2;
    }

    qb(int param0) {
        this(gh.field_b, param0);
    }

    static {
        field_q = "Waiting for graphics";
        field_s = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_p = true;
    }
}
