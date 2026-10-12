/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int decodedPrivateMessageIdLow24;
    static ko[] field_b;
    static int socialListState;

    final static boolean a(MeshData param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -17900) {
            return false;
          }
          for (var2_int = 0; param0.vertexCount > var2_int; var2_int++) {
            if (param0.verticesY[var2_int] > 50) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("th.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < 32) {
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 - param1 & param0 >> 31;
        return var3 + ((param0 >>> 31) + param0) % param2;
    }

    static {
        int var0 = 0;
        field_b = new ko[255];
        for (var0 = 0; field_b.length > var0; var0++) {
          field_b[var0] = new ko();
        }
    }
}
