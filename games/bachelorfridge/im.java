/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static boolean[][] field_c;
    static String field_a;
    static String field_b;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -48 / ((34 - param0) / 57);
        field_c = (boolean[][]) null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_34_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        un.field_a[ut.field_l] = param0;
        fn.field_k[ut.field_l] = ut.field_l;
        gk.field_a[ut.field_l] = param1;
        if (param1 >= waa.field_a) {
          if (wt.field_u < param1) {
            af.field_c = param1;
          }
          mba.field_a[ut.field_l] = param5;
          sc.field_o[ut.field_l] = param4;
          uda.field_X[ut.field_l] = param2;
          var6 = param4 + param5 + param2;
          if (var6 != 0) {
            stackIn_34_0 = 1000 * param5 / var6;
          } else {
            stackIn_34_0 = 0;
          }
          var7 = stackIn_34_0;
          uc.field_k[ut.field_l] = var7;
          if (var7 < mt.field_r) {
            mt.field_r = var7;
          }
          if (param3) {
            im.a(-109, 3, 88, true, 30, 109);
          }
          ut.field_l = ut.field_l + 1;
          if (var7 > af.field_c) {
            af.field_c = var7;
          }
          return;
        }
        mt.field_r = param1;
        if (wt.field_u < param1) {
          af.field_c = param1;
        }
        mba.field_a[ut.field_l] = param5;
        sc.field_o[ut.field_l] = param4;
        uda.field_X[ut.field_l] = param2;
        var6Lifetime1 = param4 + param5 + param2;
        if (var6Lifetime1 != 0) {
          stackIn_7_0 = 1000 * param5 / var6Lifetime1;
        } else {
          stackIn_7_0 = 0;
        }
        var7Lifetime1 = stackIn_7_0;
        uc.field_k[ut.field_l] = var7Lifetime1;
        if (var7Lifetime1 < mt.field_r) {
          mt.field_r = var7Lifetime1;
        }
        if (param3) {
          im.a(-109, 3, 88, true, 30, 109);
        }
        ut.field_l = ut.field_l + 1;
        if (var7Lifetime1 > af.field_c) {
          af.field_c = var7Lifetime1;
        }
    }

    final static pp a(int param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lu var5 = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.e((byte) 73);
          if (param0 != -22833) {
            var5 = (lu) null;
            im.a(9, (lu) null);
          }
          var3 = param1.b(param0 ^ -16734672);
          var4 = param1.b(16711935);
          stackIn_3_0 = new sl(var2_int, var3, var4);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("im.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = "Please log in as a subscribing member to access this feature.";
        field_b = "Reject";
    }
}
