/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class en extends tj implements eg {
    private sb field_H;
    static tu field_E;
    static int field_F;
    static String field_G;

    abstract int a(byte param0);

    public static void n(int param0) {
        if (param0 != 0) {
          return;
        }
        field_G = null;
        field_E = null;
    }

    void a(byte param0, sb param1) {
        try {
          if (param0 >= -21) {
            PacketBuffer var4 = (PacketBuffer) null;
            en.readUnsignedByteArray((PacketBuffer) null, (byte) -110);
          }
          this.field_H = param1;
          this.field_H.field_j = this;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "en.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int l(int param0);

    final static int[] readUnsignedByteArray(PacketBuffer packet, byte obfuscationGuard) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -24) {
            en.n(-95);
          }
          var5 = new int[packet.readUnsignedByte(obfuscationGuard ^ -24)];
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            var5[var3] = packet.readUnsignedByte(0);
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("en.D(");
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    en(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
          PacketBuffer var3 = (PacketBuffer) null;
          en.readUnsignedByteArray((PacketBuffer) null, (byte) 126);
          return (n) ((Object) this.field_H);
        }
        return (n) ((Object) this.field_H);
    }

    abstract int m(int param0);

    abstract boolean k(int param0);

    static {
        field_G = "Loading extra data";
    }
}
