/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int field_h;
    int field_b;
    static String field_c;
    int field_f;
    static int[] field_g;
    int field_d;
    int field_j;
    static int[] field_e;
    int field_i;
    String field_a;

    final static void a(int param0) {
        bn.c(0);
        vf.a((byte) -117, 4);
        if (param0 != 1849965346) {
          bd.b(51);
        }
    }

    final static void a(kg param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          qg.field_h = param0.a((byte) 25) << 5;
          var2_int = param0.c(32);
          eh.field_R = (7 & var2_int) << 18;
          qg.field_h = qg.field_h + (var2_int >> 3);
          eh.field_R = eh.field_R + (param0.a((byte) 25) << 2);
          var2_intLifetime1 = param0.c(32);
          eh.field_R = eh.field_R + (var2_intLifetime1 >> 6);
          ll.field_d = var2_intLifetime1 << 15 & 2064384;
          ll.field_d = ll.field_d + (param0.c(32) << 7);
          var2_intLifetime2 = param0.c(32);
          ll.field_d = ll.field_d + (var2_intLifetime2 >> 1);
          dj.field_gb = var2_intLifetime2 << 16 & 65536;
          dj.field_gb = dj.field_gb + param0.a((byte) 25);
          if (param1 == -45) {
            return;
          }
          bd.b(112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("bd.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          field_c = (String) null;
        }
    }

    bd(int param0, String param1, ok param2) {
        try {
          this.field_d = param0;
          this.field_a = param1;
          this.field_f = 100 + param2.c(this.field_a);
          this.field_i = 30;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        qm.field_z = null;
        if (param0 != -4487) {
          return;
        }
        gh.field_f = null;
    }

    static {
        field_c = "Loading extra data";
        field_g = new int[128];
    }
}
