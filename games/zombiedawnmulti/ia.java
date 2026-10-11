/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends un {
    static cj field_t;
    static ja field_y;
    private pm field_q;
    static String field_u;
    static String field_w;
    static boolean field_r;
    static String field_v;
    private pm field_z;
    static int field_s;
    static hn[] field_x;

    final static void a(int param0, int param1, boolean param2, int param3) {
        jl.a(jk.field_f, (byte) -97, jo.field_f, param2, param1, param0, nj.field_h);
        if (param3 != 0) {
          String var5 = (String) null;
          ia.a(-113, (String) null, (String) null);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_z.field_j.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (gn.b((byte) 62, var5)) {
            stackIn_5_0 = jb.field_k;
            return stackIn_5_0;
          }
          if (ol.a(var5, false)) {
            stackIn_9_0 = bi.field_c;
            return stackIn_9_0;
          }
          if (qa.a((byte) -125, var5)) {
            stackIn_12_0 = gi.field_g;
            return stackIn_12_0;
          }
          if (param1 != -1276425040) {
            stackIn_15_0 = (String) null;
            return stackIn_15_0;
          }
          if (this.b(param0, -1)) {
            stackIn_18_0 = oq.field_z;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_32_0 = eb.field_y;
            return stackIn_32_0;
          }
          if (cr.a(var6, var5, param1 + 1276425039)) {
            stackIn_22_0 = kc.field_b;
            return stackIn_22_0;
          }
          if (a.a(var5, var6, (byte) -86)) {
            stackIn_26_0 = tq.field_Hb;
            return stackIn_26_0;
          }
          if (!ia.a(101, var6, var5)) {
            return jb.field_k;
          }
          stackIn_30_0 = kc.field_b;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("ia.C(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    ia(pm param0, pm param1, pm param2) {
        super(param0);
        try {
          this.field_q = param2;
          this.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 <= 91) {
            return false;
          }
          param1 = ee.a('_', "", param1, -40);
          var3 = qc.b((byte) -32, param1);
          stackIn_8_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ia.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_q.field_j.toLowerCase();
          var4 = param0.toLowerCase();
          if (~var3.length() < param1 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
              if (var3.length() - 1 <= var5) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (0 <= var4.indexOf(var7)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ia.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 == 0) {
          field_u = null;
          field_x = null;
          field_t = null;
          return;
        }
        field_v = (String) null;
        field_u = null;
        field_x = null;
        field_t = null;
    }

    final re a(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        re stackIn_5_0 = null;
        re stackIn_9_0 = null;
        re stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_w = (String) null;
          }
          var3 = this.field_z.field_j.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = jq.field_b;
            return stackIn_5_0;
          }
          if (!lb.a(var3, var4, (byte) -10)) {
            stackIn_9_0 = jq.field_b;
            return stackIn_9_0;
          }
          if (!this.b(param1, -1)) {
            return db.field_b;
          }
          stackIn_13_0 = jq.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ia.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_u = "";
        field_w = "Player Name: ";
        field_v = "Please enter a year between <%0> and <%1>";
        field_x = new hn[]{};
    }
}
