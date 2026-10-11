/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea extends hn {
    private int field_K;

    aea(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -125, this.field_K, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9) {
        int var25 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          var10_int = 12 % ((param8 - 52) / 40);
          if (param0 == param2 &&
            param9 == param5 &&
            param3 == param1 &&
            param6 == param4) {
            ik.a(param3, param2, 111, param7, param4, param5);
            return;
          }
          var11 = param2;
          var12 = param5;
          var13 = param2 * 3;
          var14 = param5 * 3;
          var15 = param0 * 3;
          var16 = param9 * 3;
          var17 = param1 * 3;
          var18 = 3 * param6;
          var19 = var15 + (-var17 + (param3 - param2));
          var20 = -param5 + (var16 + (-var18 + param4));
          var21 = -var15 + (var17 - var15) + var13;
          var22 = var14 + (-var16 - var16 + var18);
          var23 = var15 - var13;
          var24 = var16 - var14;
          for (var25 = 128; var25 <= 4096; var25 += 128) {
            var26 = var25 * var25 >> 12;
            var27 = var26 * var25 >> 12;
            var28 = var19 * var27;
            var29 = var27 * var20;
            var30 = var26 * var21;
            var31 = var22 * var26;
            var32 = var23 * var25;
            var33 = var24 * var25;
            var34 = (var30 + (var28 + var32) >> 12) + param2;
            var35 = (var29 + var31 + var33 >> 12) + param5;
            ik.a(var34, var11, -21, param7, var35, var12);
            var12 = var35;
            var11 = var34;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var10), "aea.WB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final boolean D(int param0) {
        if (param0 != 0) {
          la var3 = (la) null;
          this.a((la) null, false, false);
          return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1) {
          this.field_K = -86;
          return true;
        }
        return true;
    }

    aea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_K = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fsa(param0, param2);
          var4.b((byte) -11, 2097152, 2097152);
          var5 = new lpa(param0, param1);
          var5.b(-5, this.field_K);
          var4.a((byte) 83, (nv) (var5));
          var6 = rm.field_a;
          var7 = (ce) (var6.a(17, 102));
          var7.b(0, (byte) 23);
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("aea.VB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final fsa a(int param0, boolean param1, la param2) {
        RuntimeException var4 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            return null;
          }
          stackIn_3_0 = (fsa) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("aea.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
