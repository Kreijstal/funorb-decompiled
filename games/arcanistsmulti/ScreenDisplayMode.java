/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenDisplayMode {
    int field_d;
    int field_g;
    static Sprite field_f;
    static String field_b;
    static int[] field_c;
    int field_e;
    static Sprite[] field_i;
    int field_a;
    static co field_h;

    final static int a(jd param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ScreenDisplayMode.a(-2147483648, param1)) {
            stackIn_5_0 = (int)((long)param1 * ((long)param0.c((byte) -46) & 4294967295L) >> 32);
            return stackIn_5_0;
          }
          var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
          if (param2 > -22) {
            stackIn_8_0 = -99;
            return stackIn_8_0;
          }
          do {
            var4 = param0.c((byte) -46);
          } while (var4 >= var3_int);
          stackIn_12_0 = dh.floorMod(var4, true, param1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uj.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_h = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0) {
          return;
        }
        field_f = (Sprite) null;
    }

    final static void a(int param0, byte param1, int param2) {
        CipherPacketBuffer var3 = he.field_e;
        var3.writeOpcode((byte) -32, param2);
        var3.writeByte(3, (byte) -54);
        var3.writeByte(8, (byte) -85);
        var3.writeShort(param0, (byte) -93);
        if (param1 >= -92) {
          jd var4 = (jd) null;
          ScreenDisplayMode.a((jd) null, 16, (byte) 39);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == -2147483648) {
          return param1 == (param1 & -param1) ? true : false;
        }
        field_f = (Sprite) null;
        return param1 == (param1 & -param1) ? true : false;
    }

    static {
        field_b = "Since you have figured out the controls and don't need movement explained, select the Arcane<nbsp>Flash spell.";
        field_c = new int[]{70, 71, 72};
        field_h = new co();
    }
}
