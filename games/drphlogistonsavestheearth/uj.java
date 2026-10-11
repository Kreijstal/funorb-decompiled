/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends gi {
    static rf field_i;
    static ge field_h;
    static qe field_j;

    public static void d(int param0) {
        if (param0 != 1) {
          field_j = (qe) null;
        }
        field_h = null;
        field_j = null;
        field_i = null;
    }

    final static short[] a(lh param0, byte param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4_int = param0.e(param2, (byte) 18);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new short[var4_int];
          }
          var5 = -84 % ((-44 - param1) / 46);
          var6 = param0.e(4, (byte) -122);
          var7 = (short)param0.e(16, (byte) 90);
          if (var6 > 0) {
            for (var8 = 0; var4_int > var8; var8++) {
              param3[var8] = (short)(param0.e(var6, (byte) -107) + var7);
            }
          } else {
            for (var8 = 0; var8 < var4_int; var8++) {
              param3[var8] = (short)var7;
            }
          }
          stackIn_16_0 = (short[]) (param3);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("uj.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ea.field_a = null;
        hf.field_C = 0;
        tc.field_e = null;
        var2 = j.field_ib;
        j.field_ib = vc.field_e;
        p.field_a.field_c = p.field_a.field_c + 1;
        vc.field_e = var2;
        if (param1 == 51) {
          p.field_a.field_h = 2;
        } else {
          if (param1 != 50) {
            p.field_a.field_h = 1;
          } else {
            p.field_a.field_h = 5;
          }
        }
        if (p.field_a.field_c >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (p.field_a.field_c >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (p.field_a.field_c >= 4) {
          return 1;
        }
        if (param0 != 85) {
          field_h = (ge) null;
        }
        return -1;
    }

    private uj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
