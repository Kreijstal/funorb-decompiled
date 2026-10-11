/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static String field_a;
    static int field_b;

    final static int b(int param0) {
        if (param0 != -13043) {
          String var2 = (String) null;
          co.a((String) null, -49);
          return p.field_d;
        }
        return p.field_d;
    }

    public static void d(int param0) {
        field_a = null;
        if (param0 != 28186) {
          String var2 = (String) null;
          co.a((String) null, -91);
        }
    }

    final static id a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        Object stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        Object stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        Object stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        Object var6;
        int var7;
        Object var6Lifetime1;
        if (param5 != -19653) {
          return (id) null;
        }
        var6 = null;
        var7 = 0;
        while (true) {
          if (bm.field_a.length <= var7) {
            if (param4 == ch.field_b) {
              var6 = new te(param2, param1, 0, param0);
            }
            if (var6 == null) {
              var6 = new id(param2, param1, param4);
            }
            stackIn_12_0 = var6;
            stackIn_13_1 = (param0);
            ((id) (stackIn_12_0)).field_P = stackIn_13_1;
            stackIn_15_0 = var6;
            stackIn_16_1 = (param3);
            ((id) (stackIn_15_0)).field_J = stackIn_16_1;
            return (id) (var6);
          }
          if (bm.field_a[var7] != param4) {
            var7++;
            continue;
          }
          break;
        }
        var6Lifetime1 = new kc(param2, param1, hd.field_u[var7], param0, param3, hg.field_a[var7], si.field_Qb[var7]);
        rg.field_J.a((nb) (var6Lifetime1), (byte) -119);
        if (param4 == ch.field_b) {
          var6Lifetime1 = new te(param2, param1, 0, param0);
        }
        if (var6Lifetime1 == null) {
          var6Lifetime1 = new id(param2, param1, param4);
        }
        stackIn_27_0 = var6Lifetime1;
        stackIn_28_1 = (param0);
        ((id) (stackIn_27_0)).field_P = stackIn_28_1;
        stackIn_30_0 = var6Lifetime1;
        stackIn_31_1 = (param3);
        ((id) (stackIn_30_0)).field_J = stackIn_31_1;
        return (id) (var6Lifetime1);
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -10 / ((param1 + 49) / 51);
          stackIn_1_0 = new tk(param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("co.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        le var1 = null;
        le var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        le var2Lifetime1;
        le var2Lifetime2;
        var3 = ZombieDawn.field_J;
        try {
          var1 = kn.field_L.b((byte) 26);
          while (var1 instanceof tm) {
            var2 = var1.field_b;
            if (((tm) (var1)).field_j.l()) {
              var1.b(-27598);
            }
            var1 = var2;
          }
          if (param0 != 0) {
            field_a = (String) null;
          }
          var1 = se.field_m.b((byte) 26);
          while (var1 instanceof tm) {
            var2Lifetime1 = var1.field_b;
            if (((tm) (var1)).field_j.l()) {
              var1.b(-27598);
            }
            var1 = var2Lifetime1;
          }
          var1 = rm.field_e.b((byte) 26);
          while (var1 instanceof tm) {
            var2Lifetime2 = var1.field_b;
            if (((tm) (var1)).field_j.l()) {
              var1.b(-27598);
            }
            var1 = var2Lifetime2;
          }
          mg.a(-120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "co.C(" + param0 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 17821) {
          field_b = 79;
          return df.field_l;
        }
        return df.field_l;
    }

    static {
        field_a = "Music: ";
    }
}
