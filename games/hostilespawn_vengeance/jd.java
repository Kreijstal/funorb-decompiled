/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends am {
    int field_u;
    int field_p;
    static bd field_h;
    int field_t;
    static String field_x;
    static bd[] field_o;
    static int field_l;
    static int field_q;
    int field_r;
    static vm field_s;
    int field_j;
    static String[] field_v;
    int field_m;
    int[] field_w;
    static String field_i;
    long field_k;
    int field_n;

    final static int[] a(int param0, int param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3 = ni.a(param1, param2 ^ -8114);
        int var4 = of.a((byte) 75, param1);
        int var5 = ni.a(param0, 8191);
        int var6 = of.a((byte) -81, param0);
        if (param2 == -79) {
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        field_l = -78;
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var6 * (long)var3 >> 16);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(int param0, int param1) {
        am var2 = null;
        int var3 = 0;
        String var4 = null;
        m var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = (m) (wk.field_g.g(-107));
          while (var5 != null) {
            fj.a(param0, var5, true);
            var5 = (m) (wk.field_g.a(12684));
          }
          if (param1 != 65535) {
            var4 = (String) null;
            jd.a((byte) 125, (String) null, (gb) null, (String) null);
          }
          var2 = ve.field_b.g(-68);
          while (var2 != null) {
            pe.a((byte) 51, param0);
            var2 = ve.field_b.a(param1 ^ 52851);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "jd.D(" + param0 + ',' + param1 + ')');
        }
    }

    jd(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_n = param3;
          this.field_t = param0;
          this.field_r = param2;
          this.field_j = param1;
          this.field_m = param5;
          this.field_w = param6;
          this.field_p = param4;
          fieldTemp$0 = tf.field_c;
          tf.field_c = tf.field_c + 1;
          this.field_u = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "jd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static bd[] a(byte param0, String param1, gb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 33) {
            jd.c(45);
          }
          var4_int = param2.a((byte) -2, param1);
          var5 = param2.a(var4_int, param3, -1);
          stackIn_3_0 = mg.a(param2, var4_int, var5, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        field_x = null;
        field_s = null;
        field_o = null;
        if (param0 == 0) {
          field_v = null;
          return;
        }
        field_q = -13;
        field_v = null;
    }

    static {
        field_i = "Mouse over an icon for details";
        field_x = "CLICK TO SKIP";
    }
}
