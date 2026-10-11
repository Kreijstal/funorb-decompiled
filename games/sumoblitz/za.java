/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends ms {
    static int field_k;
    static int[] field_l;

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param3;
          while (true) {
            if (rg.field_C.length <= var5_int) {
              return;
            }
            param2 = rg.field_C[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = Sumoblitz.field_G[incrementValue$1];
              dupTemp$2 = param0[param4];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              Sumoblitz.field_G[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("za.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -93) {
          field_l = (int[]) null;
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static int c(boolean param0) {
        if (param0) {
          field_l = (int[]) null;
          return ht.field_h;
        }
        return ht.field_h;
    }

    protected za() {
    }

    static {
        field_k = -1;
        field_l = new int[13];
    }
}
