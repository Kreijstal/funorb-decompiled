/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimedSpriteEffect {
    int field_d;
    int field_e;
    static eg field_a;
    int field_c;
    int field_b;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        int var1 = 18 % ((param0 - 57) / 62);
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        ResourceArchive var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -8759) {
            var3 = (ResourceArchive) null;
            TimedSpriteEffect.a((ResourceArchive) null, -26, (byte) 6, 3);
          }
          stackIn_5_0 = (kg.a(param1, (byte) 61) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static ll[] a(ResourceArchive param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -7) {
            TimedSpriteEffect.a((byte) -14);
          }
          if (tn.a(param0, (byte) -127, param3, param1)) {
            return bl.b(-95);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_e = param0;
        this.field_d = param2;
        this.field_b = param1;
        this.field_c = qq.a(20, co.field_i.length);
        if (param3 <= 103) {
          String var6 = (String) null;
          TimedSpriteEffect.a(24, (String) null);
        }
    }

    static {
        field_a = new eg();
    }
}
