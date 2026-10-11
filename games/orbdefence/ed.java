/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static bl field_h;
    int[] field_g;
    int field_f;
    static pi field_b;
    static String field_e;
    static int field_a;
    static String field_d;
    int field_c;

    final static void a(String param0, int param1, String param2) {
        if (param1 != 0) {
          return;
        }
        try {
          if (oj.field_q != null) {
            oj.field_q.q(param1 + 4210752);
          }
          ig.field_ib = new pk(param2, param0, false, true, true);
          kg.field_j.a(false, ig.field_ib);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ed.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          field_h = (bl) null;
          if (this.field_g != null) {
            return this.field_g.length == 0 ? 0 : this.field_g[this.field_g.length - 1];
          }
          return 0;
        }
        if (this.field_g == null) {
          return 0;
        }
        if (this.field_g.length != 0) {
          return this.field_g[this.field_g.length - 1];
        }
        return 0;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -1) {
          String var2 = (String) null;
          ed.a((String) null, (ki) null, -31, (String) null, (String) null);
        }
    }

    final static long b(int param0) {
        if (param0 != -1) {
          return -60L;
        }
        return -of.field_L + ji.b(-96);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (null == this.field_g) {
          return 0;
        }
        if (this.field_g.length == 0) {
          return 0;
        }
        if (param1 != -1052047551) {
          return -104;
        }
        for (var3 = 1; this.field_g.length > var3; var3++) {
          if (param0 < this.field_g[var3] + this.field_g[-1 + var3] >> 1) {
            return var3 - 1;
          }
        }
        return -1 + this.field_g.length;
    }

    final static String a(String param0, ki param1, int param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -14416) {
            field_d = (String) null;
          }
          if (param1.b(param2 ^ 14415)) {
            stackIn_6_0 = param0 + " - " + param1.a((byte) 102, param4) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ed.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    ed(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_c = param1;
        this.field_g = new int[param2 + 1];
    }

    static {
        field_e = "Range";
        field_a = 640;
        field_d = "Not upgradable";
    }
}
