/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends cg {
    static bk field_k;
    static String field_l;
    static int[] field_j;
    static int field_m;

    public static void g(int param0) {
        field_l = null;
        int var1 = -115 % ((-60 - param0) / 37);
        field_k = null;
        field_j = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, -64) == pe.field_b) {
            stackIn_3_0 = d.field_j;
            return stackIn_3_0;
          }
          if (!param1) {
            return null;
          }
          field_m = -2;
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ai.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Main.field_T;
        try {
          if (param1 <= param3) {
            return;
          }
          if (param3 + 1 >= param2) {
            return;
          }
          if (5 + param3 < param2 &&
            param5 != param0) {
            var7_int = (param5 >> 1) + ((param0 >> 1) + (param0 & param5 & 1));
            var8 = param3;
            var9 = param0;
            var10 = param5;
            for (var11 = param3; var11 < param2; var11++) {
              var12 = re.field_c[var11];
              if (param4) {
                stackIn_23_0 = p.field_n[var12];
              } else {
                stackIn_23_0 = db.field_l[var12];
              }
              var13 = stackIn_23_0;
              if (var7_int < var13) {
                re.field_c[var11] = re.field_c[var8];
                incrementValue$0 = var8;
                var8++;
                re.field_c[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            ai.a(param0, param1, var8, param3, param4, var9, 8192);
            ai.a(var10, param1, param2, var8, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; var7_intLifetime1 > param3; var7_intLifetime1--) {
            for (var8Lifetime1 = param3; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = re.field_c[var8Lifetime1];
              var10Lifetime1 = re.field_c[1 + var8Lifetime1];
              if (oa.a(-29680, var9Lifetime1, param4, var10Lifetime1)) {
                re.field_c[var8Lifetime1] = var10Lifetime1;
                re.field_c[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var7), "ai.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ai(hf param0) {
        super(param0);
    }

    final sg a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        sg stackIn_3_0 = null;
        sg stackIn_6_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!pg.a(false, var4)) {
            stackIn_3_0 = pe.field_b;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = ie.a(false, var5);
          if (param1 > -58) {
            stackIn_6_0 = (sg) null;
            return stackIn_6_0;
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            stackIn_13_0 = ii.field_e;
            return stackIn_13_0;
          }
          stackIn_11_0 = pe.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ai.M(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = "to keep fullscreen or";
        field_k = new bk();
        field_j = new int[8192];
    }
}
