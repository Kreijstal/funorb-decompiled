/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorchMark {
    int worldY;
    int diameter;
    static eg field_a;
    int spriteIndex;
    int worldX;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        int var1 = 18 % ((param0 - 57) / 62);
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        String stackIn_9_2 = null;
        try {
          if (param0 != -8759) {
            ResourceArchive var3 = (ResourceArchive) null;
            ScorchMark.a((ResourceArchive) null, -26, (byte) 6, 3);
          }
          boolean stackIn_5_0 = (kg.a(param1, (byte) 61) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var2;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static Sprite[] a(ResourceArchive param0, int param1, byte param2, int param3) {
        String stackIn_9_2 = null;
        try {
          if (param2 >= -7) {
            ScorchMark.a((byte) -14);
          }
          if (tn.a(param0, (byte) -127, param3, param1)) {
            return bl.b(-95);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void spawn(int diameter, int worldX, int worldY, byte obfuscationGuard) {
        this.diameter = diameter;
        this.worldY = worldY;
        this.worldX = worldX;
        this.spriteIndex = qq.a(20, co.scorchSprites.length);
        if (obfuscationGuard <= 103) {
          String var6 = (String) null;
          ScorchMark.a(24, (String) null);
        }
    }

    static {
        field_a = new eg();
    }
}
