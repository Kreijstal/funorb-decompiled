/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static ad field_d;
    Throwable field_c;
    static int[] field_b;
    String field_a;
    static boolean field_e;
    static int[] menuRight;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (!param0) {
          menuRight = null;
          return;
        }
        int[] var2 = (int[]) null;
        ClientException.a(-20, (IndexedSprite) null, (int[]) null);
        menuRight = null;
    }

    final static void queueScoreSubmission(ScoreSubmission submission, boolean obfuscationGuard, int opcode) {
        try {
          tq.pendingScoreSubmissions.addLast(84, submission);
          ac.writeScoreSubmission(0, opcode, submission);
          if (!obfuscationGuard) {
            field_e = false;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ak.C(" + (submission != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + opcode + ')');
        }
    }

    final static IndexedSprite a(int param0, IndexedSprite param1, int[] param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.trimY = param1.trimY;
          var3.palette = param2;
          var3.fullWidth = param1.fullWidth;
          var3.indices = param1.indices;
          var3.fullHeight = param1.fullHeight;
          if (param0 != 15810) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var3.width = param1.width;
          var3.height = param1.height;
          var3.trimX = param1.trimX;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ak.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ClientException(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    static {
        field_b = new int[1];
        field_e = false;
        menuRight = new int[8];
    }
}
