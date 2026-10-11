/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends lh {
    ie field_m;
    static dd[] field_k;
    int field_j;
    static String field_i;
    static int field_l;
    lh field_n;

    final static ob a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ob var5 = null;
        ob stackIn_4_0 = null;
        ob stackIn_9_0 = null;
        ob stackIn_12_0 = null;
        ob stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            if (param0 > -69) {
              field_l = -22;
            }
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_9_0 = tf.field_H;
              return stackIn_9_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = jk.a(var3, (byte) 113);
            if (var5 == null) {
              stackIn_14_0 = id.a(var4, 31592);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = tf.field_G;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != -89) {
          pd.a((byte) 62);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param1) {
          gb.g(0, 0, gb.field_d, gb.field_k, 0, 192);
          kb.a(param2, param1);
          return;
        }
        gb.c();
        kb.a(param2, param1);
    }

    final static n a(byte[] param0, boolean param1) {
        n var2 = null;
        RuntimeException var2_ref = null;
        n stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (!param1) {
            field_i = (String) null;
          }
          var2 = new n(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, rd.field_d, of.field_d);
          c.o(-28210);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pd.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    pd(ie param0, lh param1) {
        try {
          this.field_m = param0;
          this.field_j = param0.g();
          this.field_n = param1;
          this.field_m.h(this.field_j * gf.field_d + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Level score: <%0>";
    }
}
