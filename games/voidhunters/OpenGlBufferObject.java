/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlBufferObject {
    private int byteSize;
    static boolean field_d;
    private boolean streamDraw;
    static String field_g;
    private boolean disposed;
    int bufferId;
    OpenGlToolkit toolkit;

    abstract void bind(int param0);

    protected final void finalize() throws Throwable {
        if (this.disposed) {
          super.finalize();
          return;
        }
        this.toolkit.enqueueBufferDisposal(-100, this.byteSize, this.bufferId);
        this.disposed = true;
        super.finalize();
    }

    OpenGlBufferObject(OpenGlToolkit param0, int param1, byte[] param2, int param3, boolean param4) {
        this.disposed = false;
        try {
          this.byteSize = param3;
          this.toolkit = param0;
          this.streamDraw = param4 ? true : false;
          jaggl.OpenGL.glGenBuffersARB(1, SetLaserAimarc.field_p, 0);
          this.bufferId = SetLaserAimarc.field_p[0];
          this.bind(34962);
          jaggl.OpenGL.glBufferDataARBub(param1, this.byteSize, param2, 0, !this.streamDraw ? 35044 : 35040);
          this.toolkit.bufferBytes = this.toolkit.bufferBytes + this.byteSize;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mnb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 <= 109) {
          field_g = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static void a(jk param0, boolean param1) {
        jk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (!param1) {
            field_d = false;
          }
          param0.unlink(-3846);
          var2 = (jk) (SetMachineGunAimarc.field_q.first(0));
          while (var2 != null) {
            if (var2.a(26344, param0)) {
              var2 = (jk) (SetMachineGunAimarc.field_q.next((byte) 114));
              continue;
            }
            break;
          }
          if (var2 != null) {
            SoftwareFramebuffer.insertBefore(param0, var2, 2);
            return;
          }
          SetMachineGunAimarc.field_q.addLast(-10258, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("mnb.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
