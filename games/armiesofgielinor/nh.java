/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ks {
    static String field_H;
    static boolean[] unitProjectionVariants;
    byte[] field_F;
    static RgbSprite[] field_G;
    static String field_J;
    static String field_I;
    static volatile int field_B;
    int field_L;
    bc field_C;
    static int field_E;
    static tp field_K;

    final static RgbSprite a(String param0, String param1, kl param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param1, 96);
          if (param3) {
            field_G = (RgbSprite[]) null;
          }
          var5 = param2.a((byte) -107, var4_int, param0);
          stackIn_3_0 = PacketBuffer.a(-1, var4_int, param2, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] d(byte param0) {
        int var2 = 125 / ((param0 + 35) / 45);
        if (this.field_x) {
          throw new RuntimeException();
        }
        return this.field_F;
    }

    public static void h(int param0) {
        field_J = null;
        field_G = null;
        field_I = null;
        unitProjectionVariants = null;
        if (param0 < 107) {
          return;
        }
        field_H = null;
        field_K = null;
    }

    nh() {
    }

    final int g(int param0) {
        if (this.field_x) {
          return 0;
        }
        if (param0 != 0) {
          field_J = (String) null;
          return 100;
        }
        return 100;
    }

    static {
        field_B = -1;
        field_I = "Open in popup window";
        field_H = "Magic robes help to protect against magic damage.";
        field_J = "Error";
    }
}
