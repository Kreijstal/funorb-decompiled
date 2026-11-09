/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlBuffer {
    LegacyOpenGlGraphicsToolkit toolkit;
    static LoginCredentials field_d;
    private boolean disposed;
    static volatile int field_i;
    static int chatMessageCount;
    private boolean streaming;
    private int byteLength;
    static QuickChatPhraseProvider field_c;
    int bufferHandle;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_c = null;
        if (!param0) {
          chatMessageCount = 19;
        }
    }

    protected final void finalize() throws Throwable {
        if (!this.disposed) {
          this.toolkit.a(this.bufferHandle, true, this.byteLength);
          this.disposed = true;
        }
        super.finalize();
    }

    abstract void bind(int guard);

    final static Sprite[] a(String param0, ResourceArchive param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.groupId(0, param3);
          if (!param2) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var5 = param1.fileId(var4_int, param0, (byte) 126);
          stackIn_4_0 = tt.loadOpaqueSprites((byte) -100, var5, param1, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kb.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    LegacyOpenGlBuffer(LegacyOpenGlGraphicsToolkit renderer, int target, byte[] data, int size, boolean useStreaming) {
        this.disposed = false;
        try {
          this.toolkit = renderer;
          this.streaming = useStreaming ? true : false;
          this.byteLength = size;
          jaggl.OpenGL.glGenBuffersARB(1, MatchingTextValidator.field_j, 0);
          this.bufferHandle = MatchingTextValidator.field_j[0];
          this.bind(1735490466);
          jaggl.OpenGL.glBufferDataARBub(target, this.byteLength, data, 0, this.streaming ? 35040 : 35044);
          this.toolkit.field_Xb = this.toolkit.field_Xb + this.byteLength;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kb.<init>(" + (renderer != null ? "{...}" : "null") + ',' + target + ',' + (data != null ? "{...}" : "null") + ',' + size + ',' + useStreaming + ')');
        }
    }

    static {
        field_d = null;
        field_i = 0;
    }
}
