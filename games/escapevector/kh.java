/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_b;
    static String field_c;
    static int[] field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        CheckboxPainter.field_n = true;
        if (param1 == -1230) {
          ol.field_N = null;
          int var3 = dh.field_b;
          rc.field_a = new ak(param2, var3);
          int var4 = rc.field_a.h(param1 ^ -1209);
          di.field_d = new wc(var4);
          di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, UiContainer.field_y), id.a(0));
          return;
        }
        field_a = (int[]) null;
        ol.field_N = null;
        int var3Lifetime1 = dh.field_b;
        rc.field_a = new ak(param2, var3Lifetime1);
        int var4Lifetime1 = rc.field_a.h(param1 ^ -1209);
        di.field_d = new wc(var4Lifetime1);
        di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, UiContainer.field_y), id.a(0));
    }

    final static int a(String param0, int param1, String param2, String param3, boolean param4, int param5, int param6) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param6 != 0) {
            field_c = (String) null;
          }
          sn var7 = new sn(param0);
          sn var8 = new sn(param2);
          int stackIn_3_0 = SelfDestructEffects.a((byte) -32, param4, param3, var8, var7, param1, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("kh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 65) {
          field_b = -91;
        }
    }

    final static Sprite[] a(ResourceArchive param0, byte param1, String param2, String param3) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          int var6 = 21 / ((param1 - 62) / 60);
          int var4_int = param0.b(-1, param2);
          int var5 = param0.a(var4_int, param3, true);
          Sprite[] stackIn_1_0 = cc.a(var4_int, param0, var5, (byte) 75);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("kh.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(int param0, char param1, byte param2) {
        int var5 = EscapeVector.obfuscationControl;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param2 >= 4) {
          for (int var4 = 0; param0 > var4; var4++) {
            var6[var4] = param1;
          }
          return new String(var6);
        }
        kh.a((byte) -54);
        for (int var4Lifetime1 = 0; param0 > var4Lifetime1; var4Lifetime1++) {
          var6[var4Lifetime1] = param1;
        }
        return new String(var6);
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = (255 & rl.field_k.field_k[param2]) + param1;
        rl.field_k.field_k[param2] = (byte)lb.a(var3, var3 << 23 >> 31);
        int var4 = -46 % ((-11 - param0) / 34);
    }

    static {
        field_b = 0;
        field_a = new int[12];
    }
}
