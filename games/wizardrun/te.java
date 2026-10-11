/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wl {
    boolean field_i;
    int field_j;
    int[] field_l;
    static o[] field_k;

    public static void a(int param0) {
        if (param0 != 10615) {
          return;
        }
        field_k = null;
    }

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        var7 = wizardrun.field_H;
        try {
          if (param0 >= -91) {
            var8 = (int[]) null;
            te.a((byte) 19, (byte[]) null, (int[]) null, 2, 7);
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= id.field_b.length) {
              return;
            }
            param4 = id.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = cb.field_e[incrementValue$1];
              dupTemp$2 = param1[param3];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              cb.field_e[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("te.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    te() {
        this.field_i = false;
    }

    static {
    }
}
