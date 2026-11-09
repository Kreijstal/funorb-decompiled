/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureMetadata {
    boolean field_s;
    boolean field_l;
    int field_p;
    byte field_k;
    byte field_g;
    boolean field_o;
    byte field_c;
    short field_e;
    byte field_u;
    boolean field_n;
    int field_h;
    boolean field_i;
    boolean field_b;
    byte field_j;
    static boolean[] completedLevels;
    byte field_t;
    boolean field_m;
    byte field_d;
    boolean field_r;
    static ToolkitSprite field_a;
    int field_q;

    final static void blendHalfSpan(int guard, int offset, int colorContribution, int length, int[] pixels) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -1) {
            field_a = (ToolkitSprite) null;
          }
          length--;
          while (length >= 0) {
            var9 = pixels;
            var5 = var9;
            var6 = offset;
            var7 = colorContribution;
            var9[var6] = LegacyOpenGlPostProcessManager.bitwiseAnd(8355711, var9[var6] >> 1) + var7;
            offset++;
            length--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("wm.C(").append(guard).append(',').append(offset).append(',').append(colorContribution).append(',').append(length).append(',');
          if (pixels == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void resendServerDataRequests(boolean guard, int opcode) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        ServerDataWriteRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = (ServerDataWriteRequest) (LoginMethodPreference.field_a.first(72));
          while (var5 != null) {
            ArchiveLoadingStage.sendServerDataWrite(var5, -112, opcode);
            var5 = (ServerDataWriteRequest) (LoginMethodPreference.field_a.next((byte) 18));
          }
          var2 = LoginFormState.pendingServerReads.first(-87);
          while (var2 != null) {
            GzipDecompressor.sendServerDataRead(11044, opcode);
            var2 = LoginFormState.pendingServerReads.next((byte) 18);
          }
          if (!guard) {
            return;
          }
          var4 = (int[]) null;
          TextureMetadata.blendHalfSpan(-1, 109, 92, -119, (int[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "wm.A(" + guard + ',' + opcode + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        completedLevels = null;
        field_a = null;
        if (param0) {
          return;
        }
        completedLevels = (boolean[]) null;
    }

    private TextureMetadata() throws Throwable {
        throw new Error();
    }

    static {
        completedLevels = new boolean[25];
    }
}
