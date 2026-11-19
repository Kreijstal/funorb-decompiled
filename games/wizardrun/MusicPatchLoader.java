/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchLoader {
    static Sprite field_d;
    static String[] field_c;
    static String field_f;
    static String field_a;
    static BufferedRandomAccessFile field_e;
    static int[] field_b;
    static PlatformTaskDispatcher field_g;

    public static void releaseStatics(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 == -122) {
          field_b = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
        MusicPatchLoader.releaseStatics((byte) 91);
        field_b = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static MusicPatch loadPatch(int param0, int param1, ResourceArchive param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ResourceArchive var4 = null;
        byte[] var5 = null;
        Object stackIn_4_0 = null;
        MusicPatch stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 26) {
            var4 = (ResourceArchive) null;
            MusicPatchLoader.loadPatch(91, -108, (ResourceArchive) null);
          }
          var5 = param2.getFileFlat((byte) -128, param1);
          var3 = var5;
          if (var5 != null) {
            stackIn_6_0 = new MusicPatch(var5);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (MusicPatch) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ld.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void writeProgressQuery(int param0, ProgressQuery param1, int param2) {
        IsaacPacketBuffer var3 = null;
        try {
          var3 = AccountPacketState.field_b;
          var3.writeCipheredOpcode((byte) 87, param0);
          var3.writeByte((byte) 11, 2);
          var3.writeByte((byte) 11, param2);
          var3.writeByte((byte) 11, param1.category);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ld.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_a = "when the last enemy is killed.";
        field_b = new int[4];
        field_c = new String[255];
    }
}
