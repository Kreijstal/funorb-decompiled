/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends w {
    w field_Tb;
    static boolean field_Qb;
    static int field_Ob;
    static String[][] field_Pb;
    static int field_Rb;
    static boolean field_Nb;
    private w field_Sb;

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == 9328) {
          var4 = -param0;
          if (null != this.field_Sb) {
            var4 = this.field_Sb.a(true);
          }
          var5 = -param0;
          if (null != this.field_Tb) {
            var5 = this.field_Tb.a((byte) 84, -var4 - param2 + this.field_mb - (param0 + param2));
          }
          var6 = param2 + (var5 + param0) + (param2 + var4);
          if (var6 > this.field_mb) {
            var5 = var5 + (this.field_mb - var6);
            var6 = this.field_mb;
          }
          if (this.field_X == 1) {
            param2 = param2 + (-var6 + this.field_mb) / 2;
          }
          if (this.field_X == 2) {
            param2 = param2 + (-var6 + this.field_mb);
          }
          if (this.field_Sb != null) {
            this.field_Sb.a(var4, 0, 0, this.field_N, param2);
            this.field_Sb.field_W = this.field_W;
          }
          if (null == this.field_Tb) {
            return;
          }
          this.field_Tb.a(var5, 0, 0, this.field_N, param2 - (-var4 - param0));
          if (this.field_Sb != null) {
            this.field_Tb.field_X = 0;
          } else {
            this.field_Tb.field_X = this.field_X;
          }
          this.field_Tb.field_W = this.field_W;
          return;
        }
        field_Pb = (String[][]) null;
        var4Lifetime1 = -param0;
        if (null != this.field_Sb) {
          var4Lifetime1 = this.field_Sb.a(true);
        }
        var5Lifetime1 = -param0;
        if (null != this.field_Tb) {
          var5Lifetime1 = this.field_Tb.a((byte) 84, -var4Lifetime1 - param2 + this.field_mb - (param0 + param2));
        }
        var6Lifetime1 = param2 + (var5Lifetime1 + param0) + (param2 + var4Lifetime1);
        if (var6Lifetime1 > this.field_mb) {
          var5Lifetime1 = var5Lifetime1 + (this.field_mb - var6Lifetime1);
          var6Lifetime1 = this.field_mb;
        }
        if (this.field_X == 1) {
          param2 = param2 + (-var6Lifetime1 + this.field_mb) / 2;
        }
        if (this.field_X == 2) {
          param2 = param2 + (-var6Lifetime1 + this.field_mb);
        }
        if (this.field_Sb != null) {
          this.field_Sb.a(var4Lifetime1, 0, 0, this.field_N, param2);
          this.field_Sb.field_W = this.field_W;
        }
        if (null == this.field_Tb) {
          return;
        }
        this.field_Tb.a(var5Lifetime1, 0, 0, this.field_N, param2 - (-var4Lifetime1 - param0));
        if (this.field_Sb != null) {
          this.field_Tb.field_X = 0;
        } else {
          this.field_Tb.field_X = this.field_X;
        }
        this.field_Tb.field_W = this.field_W;
    }

    final int b(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = -param1;
        int var5Lifetime1;
        if (param2 == 1940) {
          var5 = -param1;
          if (this.field_Sb != null) {
            var4 = this.field_Sb.a(true);
          }
          if (this.field_Tb != null) {
            var5 = this.field_Tb.a(true);
          }
          return param0 + var4 + param0 + param1 + var5;
        }
        String var6 = (String) null;
        qd.a((String) null, -28);
        var5Lifetime1 = -param1;
        if (this.field_Sb != null) {
          var4 = this.field_Sb.a(true);
        }
        if (this.field_Tb != null) {
          var5Lifetime1 = this.field_Tb.a(true);
        }
        return param0 + var4 + param0 + param1 + var5Lifetime1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param4, 0, param3, param0, param2);
        this.a(param5, 9328, param1);
        if (param6 != 500) {
          qd.e(84);
        }
    }

    public static void f(int param0) {
        field_Pb = (String[][]) null;
        if (param0 < 67) {
          qd.e(-21);
        }
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = bh.field_g;
          var3 = pm.field_f;
          var4 = ua.field_H.field_J.a(param0, 500);
          var5 = ua.field_H.field_J.b(param0, 500) + 6;
          var6 = kf.field_O * var4 + 2;
          var7 = vh.a(12, -18265, var5, var2_int);
          var8 = o.a(20, param1 + 2, var6, var3);
          hk.f(var7, var8, var5, var6, 0);
          hk.a(1 + var7, var8 + 1, var5 - 2, var6 + param1, 16777088);
          ua.field_H.field_J.a(param0, 3 + var7, -ua.field_H.field_J.field_R + (wg.field_e + (var8 + 1)), 500, 1000, 0, -1, 0, 0, kf.field_O);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "qd.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean e(int param0) {
        int var1 = 63 % ((79 - param0) / 37);
        return null != vh.field_h ? true : false;
    }

    qd(long param0, w param1, w param2, w param3, ck param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Sb = new w(0L, param2);
            this.field_Sb.field_I = param4;
            this.a(this.field_Sb, -16834);
          }
          if (param5 != null) {
            this.field_Tb = new w(0L, param3, param5);
            this.a(this.field_Tb, -16834);
            this.d(-65);
          } else {
            this.d(-65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
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
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_Ob = 4;
        field_Rb = 0;
        field_Pb = new String[][]{new String[]{"Standard", "Large"}, new String[]{"Slow", "Medium", "Fast", "Maximum", "Panic!"}, new String[]{"3", "4", "5", "6", "7"}, new String[]{"None", "Level 1 - wildcards only", "Level 2 - wildcards, earthquakes and drills", "Level 3 - Level 2 with bombs and power drills added", "Level 4 - all special items enabled"}, new String[]{"Level 1 - when loose pieces are eliminated, they are cooked<br>into a solid shape and sent to the next player", "Level 2 - like Level 1, but in addition to loose tiles, whole solid shapes<br>are sent to the next player when eliminated", "Level 3 - like Level 2, but even special items will bombard<br>the next player with everything they destroy!"}};
    }
}
