/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aca extends IntrusiveNode {
    int field_j;
    static String[] field_h;
    static byte[] field_i;
    static String field_g;
    int field_f;

    public static void releaseStatics(boolean param0) {
        field_i = null;
        field_g = null;
        field_h = null;
        if (param0) {
          ShellListener var2 = (ShellListener) null;
          aca.addShellListenerFirst((ShellListener) null, 1);
        }
    }

    final static void addShellListenerFirst(ShellListener param0, int param1) {
        try {
          HuffmanCodec.field_c.insertElementAt(param0, 0);
          if (param1 != 19711) {
            ResourceArchive var3 = (ResourceArchive) null;
            aca.a((ResourceArchive) null, 32, (ResourceArchive) null, (byte) -47, 55);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "aca.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean hasFlag32768(int param0, int param1, int param2) {
        if (param1 != 32768) {
          return false;
        }
        return (param0 & 32768) != 0 ? true : false;
    }

    final static BinaryBitmapFont a(ResourceArchive param0, int param1, ResourceArchive param2, byte param3, int param4) {
        RuntimeException var5 = null;
        BinaryBitmapFont stackIn_2_0 = null;
        BinaryBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -99) {
            stackIn_2_0 = (BinaryBitmapFont) null;
            return stackIn_2_0;
          }
          if (!GameApplet.a(false, param4, param1, param2)) {
            return null;
          }
          stackIn_7_0 = RoomHeader.decodeBinaryFont(param0.getFile(false, param1, param4), (byte) 103);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("aca.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private aca() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "HOLD <img=10><img=11> TO SNEAK OVER SNAKES";
    }
}
