/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends nm {
    static wp field_m;
    int field_i;
    kl field_j;
    static volatile int field_l;
    static String field_k;
    nm field_n;

    final static void a(int param0, int param1, pb param2, int param3, int param4, jp param5) {
        try {
          fc.a(-89, param2.field_p);
          la.a(param5, (-param5.field_x + param2.field_i) / 2, -param5.field_z + (param0 + param2.field_q), ab.field_C[param3]);
          sc.b(-95);
          if (param1 != 26746) {
            jp var7 = (jp) null;
            l.a(-125, 69, (pb) null, 30, 70, (jp) null);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "l.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static oh a(int param0) {
        if (ik.field_g == ej.field_P) {
          throw new IllegalStateException();
        }
        if (ik.field_g == up.field_v) {
          ik.field_g = ej.field_P;
          return ni.field_Rb;
        }
        if (param0 <= 17) {
          return (oh) null;
        }
        return null;
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 <= 22) {
          field_m = (wp) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (1 == param2) {
            stackIn_2_0 = rd.a(lm.field_d, new String[]{param1}, (byte) 103);
            return stackIn_2_0;
          }
          if (param2 == 2) {
            stackIn_5_0 = rd.a(md.field_w, new String[]{param1}, (byte) 103);
            return stackIn_5_0;
          }
          if (param2 == 3) {
            stackIn_9_0 = rd.a(ug.field_K, new String[]{param1}, (byte) 103);
            return stackIn_9_0;
          }
          if (param2 == 4) {
            stackIn_13_0 = rd.a(fi.field_v, new String[]{param1}, (byte) 103);
            return stackIn_13_0;
          }
          if (5 == param2) {
            stackIn_17_0 = rd.a(on.field_z, new String[]{param1}, (byte) 103);
            return stackIn_17_0;
          }
          if (param2 == 6) {
            stackIn_20_0 = rd.a(mn.field_B, new String[]{param1}, (byte) 103);
            return stackIn_20_0;
          }
          if (param2 == 7) {
            stackIn_23_0 = rd.a(bm.field_e, new String[]{param1}, (byte) 103);
            return stackIn_23_0;
          }
          if (8 == param2) {
            stackIn_27_0 = rd.a(of.field_h, new String[]{param1}, (byte) 103);
            return stackIn_27_0;
          }
          if (param0 != -110) {
            field_k = (String) null;
          }
          if (param2 == 11) {
            stackIn_33_0 = rd.a(rd.field_c, new String[]{param1}, (byte) 103);
            return stackIn_33_0;
          }
          if (param2 == 12) {
            stackIn_36_0 = rd.a(nc.field_f, new String[]{param1}, (byte) 103);
            return stackIn_36_0;
          }
          if (param2 != 13) {
            return null;
          }
          stackIn_40_0 = rd.a(gr.field_b, new String[]{param1}, (byte) 103);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    l(kl param0, nm param1) {
        try {
          this.field_j = param0;
          this.field_i = param0.g();
          this.field_n = param1;
          this.field_j.e(128 + this.field_i * ki.field_d >> 8);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
        field_k = "Password is valid";
    }
}
