/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_c;
    static String field_b;
    static String field_d;
    static String field_e;
    static String field_f;
    static String[] field_a;

    final static void a(um param0, boolean param1, um param2, byte param3) {
        try {
          da.a(fi.field_b, r.field_Tb, ic.field_c, bj.field_eb, ia.field_o, qn.field_P, af.field_o, tk.field_d, param1, false, sj.field_k, pk.field_a);
          el.field_z = ao.a(param2, "chatfilter", 2993, "lobby");
          nk.field_x[2] = ii.field_K;
          nk.field_x[1] = gg.field_g;
          if (param3 <= 70) {
            um var5 = (um) null;
            ij.a((um) null, false, (um) null, (byte) 17);
          }
          nk.field_x[0] = fm.field_Q;
          dm.a(v.field_k, param0, 1513239);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ij.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0 == 255) {
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
        ij.a(28);
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static void a(int param0) {
        i.a(true, oc.field_o, -5136, ih.field_Q);
        if (param0 > -127) {
          field_d = (String) null;
          ag.field_e = true;
          return;
        }
        ag.field_e = true;
    }

    final static kf a(int param0, int param1, um param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        kf stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        kf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -23) {
            stackIn_2_0 = (kf) null;
            return stackIn_2_0;
          }
          var4 = param2.b((byte) -74, param1);
          var3 = var4;
          if (var4 != null) {
            stackIn_7_0 = new kf(var4);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (kf) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ij.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "The '<%0>' setting needs to be changed.";
        field_f = "Black's move";
        field_e = "Public";
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = "Instructions";
    }
}
