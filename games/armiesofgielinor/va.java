/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends DualLinkedNode {
    int[] field_C;
    static String field_F;
    char[] field_v;
    static int field_u;
    static int field_z;
    boolean field_H;
    static int field_D;
    static String field_B;
    String field_E;
    char[] field_x;
    static hg field_w;
    static int[] field_G;
    int[] field_y;
    static String[] field_A;

    private final void a(byte param0, PacketBuffer param1, int param2) {
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char stackIn_8_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char stackIn_15_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = 81 % ((param0 - 47) / 62);
          if (param2 == 1) {
            this.field_E = param1.g(1);
          } else {
            if (param2 == 2) {
              var5 = param1.readUnsignedByte(0);
              this.field_C = new int[var5];
              this.field_x = new char[var5];
              for (var6 = 0; var5 > var6; var6++) {
                this.field_C[var6] = param1.readUnsignedShort((byte) -104);
                var7 = param1.readByte((byte) 111);
                stackIn_7_0 = this.field_x;
                stackIn_7_1 = var6;
                if (0 == var7) {
                  stackIn_8_2 = (char)0;
                } else {
                  stackIn_8_2 = we.a(-121, (byte) var7);
                }
                stackIn_7_0[stackIn_7_1] = stackIn_8_2;
              }
            } else if (3 == param2) {
              var5 = param1.readUnsignedByte(0);
              this.field_v = new char[var5];
              this.field_y = new int[var5];
              for (var6 = 0; var5 > var6; var6++) {
                this.field_y[var6] = param1.readUnsignedShort((byte) -104);
                var7 = param1.readByte((byte) -74);
                stackIn_14_0 = this.field_v;
                stackIn_14_1 = var6;
                if (0 == var7) {
                  stackIn_15_2 = (char)0;
                } else {
                  stackIn_15_2 = we.a(-125, (byte) var7);
                }
                stackIn_14_0[stackIn_14_1] = stackIn_15_2;
              }
            } else {
              if (param2 == 4) {
                this.field_H = true;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("va.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2Lifetime1;
        if (null != this.field_y) {
          for (var2 = 0; var2 < this.field_y.length; var2++) {
            this.field_y[var2] = oe.c(this.field_y[var2], 32768);
          }
        }
        if (this.field_C != null) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (var5 < this.field_C.length) {
            this.field_C[var5] = oe.c(this.field_C[var5], 32768);
            var5++;
          }
        }
        if (param0 <= 6) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.a((byte) 40, (PacketBuffer) null, -40);
        }
    }

    public static void h(int param0) {
        field_B = null;
        field_F = null;
        if (param0 > -91) {
          va.h(-117);
        }
        field_A = null;
        field_G = null;
        field_w = null;
    }

    final void a(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 >= -79) {
            return;
          }
          while (true) {
            var3_int = param1.readUnsignedByte(0);
            if (var3_int == 0) {
              return;
            }
            this.a((byte) -120, param1, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("va.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    va() {
        this.field_H = false;
    }

    static {
        field_F = "No options available";
        field_G = new int[]{7, 1, 0, 0, 2, 5, 4, 1, 1, 1, 9, 7, 11, 11, 1, 11};
        field_B = "Connection restored.";
        field_u = 0;
        field_w = new hg();
    }
}
