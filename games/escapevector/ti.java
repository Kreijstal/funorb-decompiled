/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int[] field_a;

    public static void releaseStatics(byte guard) {
        if (guard <= -61) {
          field_a = null;
          return;
        }
        NineSliceFrame var2 = (NineSliceFrame) null;
        ti.a(125, -91, -121, 39, 71, -77, 39, (BitmapFont) null, 103, -82, -2, (NineSliceFrame) null, 98, (byte) 43, 106, -68, (BitmapFont) null, -15, -43, (NineSliceFrame) null, (NineSliceFrame) null);
        field_a = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, BitmapFont param7, int param8, int param9, int param10, NineSliceFrame param11, int param12, byte param13, int param14, int param15, BitmapFont param16, int param17, int param18, NineSliceFrame param19, NineSliceFrame param20) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          if (param13 <= 49) {
            field_a = (int[]) null;
          }
          ke.a(param16, 2, param9, param7);
          mm.a(-127, param4, param12, param1, param15);
          ObjectSpriteSet.a(param0, param10, 11710);
          ValidationState.a(param11, param6, param14, 3, param20, param8);
          BoundedRandomAccessFile.a(25398, param18, param19, param5);
          ui.a(param17, param3, param2, -11997);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var21 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var21;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ti.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param20 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(Sprite[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, BitmapFont param10, int param11, int param12, int param13, Sprite[] param14, int param15, int param16, int param17, int param18, BitmapFont param19, Sprite[] param20) {
        String stackIn_6_2 = null;
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        try {
          ti.a(param8, param1, param9, param11, param12, param17, param13, param10, param4, param5, param16, new NineSliceFrame(param20), param2, (byte) 90, param7, param3, param19, param18, param6, new NineSliceFrame(param14), new NineSliceFrame(param0));
          if (param15 != 2) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var21 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var21;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          StringBuilder stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param20 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_a = new int[]{0, 1, 2};
    }
}
