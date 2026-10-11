/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends wf {
    static java.awt.Canvas field_k;
    int field_h;
    int field_g;
    static pd field_l;
    int field_i;
    int field_p;
    int field_o;
    int field_j;
    static int[] field_n;
    static int field_m;

    public static void d(int param0) {
        if (param0 > 35) {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
        field_n = (int[]) null;
        field_k = null;
        field_n = null;
        field_l = null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          a.a(37, (java.awt.Component) ((Object) param0));
          kc.a((byte) 104, (java.awt.Component) ((Object) param0));
          if (ga.field_a != null) {
            ga.field_a.a((byte) -88, (java.awt.Component) ((Object) param0));
          }
          if (param1 >= 95) {
            return;
          }
          field_k = (java.awt.Canvas) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gd.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param0 < -80) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param2) {
            var4 += 2;
          }
          if (param1) {
            var4++;
          }
          return ba.field_l[var4];
        }
        gd.$cfr$intArgs$a$c7de0d339b2a(-80, false, false, false);
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param2) {
          var4Lifetime1 += 2;
        }
        if (param1) {
          var4Lifetime1++;
        }
        return ba.field_l[var4Lifetime1];
    }

    gd(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param4;
        this.field_j = param2;
        this.field_i = param3;
        this.field_o = param1;
        this.field_h = param0;
        this.field_g = param5;
    }

    static {
        field_l = new pd();
        field_n = new int[]{3620, 2775, 2145, 1670, 1315, 1050, 850, 700, 587, 500, 440, 392, 357, 330, 310};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param0 < -80) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param2) {
            var4 += 2;
          }
          if (param1) {
            var4++;
          }
          return ba.field_l[var4];
        }
        gd.$cfr$intArgs$a$c7de0d339b2a(-80, false, false, false);
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param2) {
          var4Lifetime1 += 2;
        }
        if (param1) {
          var4Lifetime1++;
        }
        return ba.field_l[var4Lifetime1];
    }
}
