/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeModelRenderContext implements NativeResource {
    private NativeToolkitModel field_a;
    private NativeToolkitModel field_j;
    private NativeToolkitModel field_f;
    private NativeToolkitModel field_d;
    private NativeToolkitModel field_b;
    private NativeToolkitModel field_g;
    private NativeToolkitModel field_l;
    Runnable field_h;
    private NativeSoftwareGraphicsToolkit field_e;
    long field_nativeid;
    private NativeToolkitModel field_k;
    private NativeToolkitModel field_i;
    private NativeToolkitModel field_c;

    public final void releaseNative(boolean param0) {
        this.releaseNativeHandle(this.field_nativeid, param0);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    private final void bindNativeContext() {
        this.bindContextNative(this.field_nativeid);
    }

    final void bindToCurrentThread() {
        this.field_h = (Runnable) ((Object) Thread.currentThread());
        this.bindNativeContext();
    }

    private final native void bindContextNative(long param0);

    private final native void releaseNativeHandle(long param0, boolean param1);

    final void drawModelAtDepth(ToolkitModel param0, Transform3D param1, int[] param2, int param3, int param4) {
        this.drawModelAtDepthNative(this.field_nativeid, ((NativeToolkitModel) (param0)).field_nativeid, ((NativeTransform3D) (param1)).field_nativeid, param2, param3, param4);
    }

    private final native void drawModelNative(long param0, long param1, long param2, int[] param3, int param4);

    final ToolkitModel copyModel(NativeToolkitModel param0, byte param1, int param2, boolean param3) {
        NativeToolkitModel dupTemp$0 = null;
        NativeToolkitModel stackIn_3_0;
        NativeToolkitModel stackIn_3_1;
        NativeToolkitModel stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        NativeToolkitModel stackIn_8_0;
        NativeToolkitModel stackIn_8_1;
        NativeToolkitModel stackIn_8_2;
        int stackIn_8_3;
        boolean stackIn_9_4 = false;
        NativeToolkitModel stackIn_13_0;
        NativeToolkitModel stackIn_13_1;
        NativeToolkitModel stackIn_13_2;
        int stackIn_13_3;
        boolean stackIn_14_4 = false;
        NativeToolkitModel stackIn_18_0;
        NativeToolkitModel stackIn_18_1;
        NativeToolkitModel stackIn_18_2;
        int stackIn_18_3;
        boolean stackIn_19_4 = false;
        NativeToolkitModel stackIn_23_0;
        NativeToolkitModel stackIn_23_1;
        NativeToolkitModel stackIn_23_2;
        int stackIn_23_3;
        boolean stackIn_24_4 = false;
        NativeToolkitModel stackIn_27_0;
        NativeToolkitModel stackIn_27_1;
        NativeToolkitModel stackIn_27_2;
        int stackIn_27_3;
        boolean stackIn_28_4 = false;
        NativeToolkitModel var5;
        NativeToolkitModel var6;
        NativeToolkitModel var5Lifetime1;
        NativeToolkitModel var5Lifetime2;
        NativeToolkitModel var5Lifetime3;
        NativeToolkitModel var5Lifetime4;
        NativeToolkitModel var5Lifetime5;
        NativeToolkitModel var6Lifetime1;
        NativeToolkitModel var6Lifetime2;
        NativeToolkitModel var6Lifetime3;
        NativeToolkitModel var6Lifetime4;
        NativeToolkitModel var6Lifetime5;
        if (param1 == 1) {
          var6 = this.field_k;
          var5 = this.field_c;
          stackIn_3_0 = (NativeToolkitModel) (param0);
          stackIn_3_1 = var5;
          stackIn_3_2 = var6;
          stackIn_3_3 = param2;
          stackIn_4_4 = (param1 == 0) ? false : true;
          ((NativeToolkitModel) (Object) stackIn_3_0).copyInto(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param3);
          var5.field_e = param0.field_e;
          var5.field_d = param0.field_d;
          return (ToolkitModel) ((Object) var5);
        }
        if (param1 == 2) {
          var6Lifetime1 = this.field_f;
          var5Lifetime1 = this.field_i;
          stackIn_8_0 = (NativeToolkitModel) (param0);
          stackIn_8_1 = var5Lifetime1;
          stackIn_8_2 = var6Lifetime1;
          stackIn_8_3 = param2;
          stackIn_9_4 = (param1 == 0) ? false : true;
          ((NativeToolkitModel) (Object) stackIn_8_0).copyInto(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_9_4, param3);
          var5Lifetime1.field_e = param0.field_e;
          var5Lifetime1.field_d = param0.field_d;
          return (ToolkitModel) ((Object) var5Lifetime1);
        }
        if (param1 == 3) {
          var6Lifetime2 = this.field_g;
          var5Lifetime2 = this.field_a;
          stackIn_13_0 = (NativeToolkitModel) (param0);
          stackIn_13_1 = var5Lifetime2;
          stackIn_13_2 = var6Lifetime2;
          stackIn_13_3 = param2;
          stackIn_14_4 = (param1 == 0) ? false : true;
          ((NativeToolkitModel) (Object) stackIn_13_0).copyInto(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_14_4, param3);
          var5Lifetime2.field_e = param0.field_e;
          var5Lifetime2.field_d = param0.field_d;
          return (ToolkitModel) ((Object) var5Lifetime2);
        }
        if (param1 == 4) {
          var6Lifetime3 = this.field_j;
          var5Lifetime3 = this.field_b;
          stackIn_18_0 = (NativeToolkitModel) (param0);
          stackIn_18_1 = var5Lifetime3;
          stackIn_18_2 = var6Lifetime3;
          stackIn_18_3 = param2;
          stackIn_19_4 = (param1 == 0) ? false : true;
          ((NativeToolkitModel) (Object) stackIn_18_0).copyInto(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_19_4, param3);
          var5Lifetime3.field_e = param0.field_e;
          var5Lifetime3.field_d = param0.field_d;
          return (ToolkitModel) ((Object) var5Lifetime3);
        }
        if (param1 == 5) {
          var6Lifetime4 = this.field_d;
          var5Lifetime4 = this.field_l;
          stackIn_27_0 = (NativeToolkitModel) (param0);
          stackIn_27_1 = var5Lifetime4;
          stackIn_27_2 = var6Lifetime4;
          stackIn_27_3 = param2;
          stackIn_28_4 = (param1 == 0) ? false : true;
          ((NativeToolkitModel) (Object) stackIn_27_0).copyInto(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_28_4, param3);
          var5Lifetime4.field_e = param0.field_e;
          var5Lifetime4.field_d = param0.field_d;
          return (ToolkitModel) ((Object) var5Lifetime4);
        }
        dupTemp$0 = new NativeToolkitModel(this.field_e);
        var6Lifetime5 = dupTemp$0;
        var5Lifetime5 = dupTemp$0;
        stackIn_23_0 = (NativeToolkitModel) (param0);
        stackIn_23_1 = var5Lifetime5;
        stackIn_23_2 = var6Lifetime5;
        stackIn_23_3 = param2;
        stackIn_24_4 = (param1 == 0) ? false : true;
        ((NativeToolkitModel) (Object) stackIn_23_0).copyInto(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_24_4, param3);
        var5Lifetime5.field_e = param0.field_e;
        var5Lifetime5.field_d = param0.field_d;
        return (ToolkitModel) ((Object) var5Lifetime5);
    }

    private final native void drawModelAtDepthNative(long param0, long param1, long param2, int[] param3, int param4, int param5);

    final void drawModel(ToolkitModel param0, Transform3D param1, int[] param2, int param3) {
        this.drawModelNative(this.field_nativeid, ((NativeToolkitModel) (param0)).field_nativeid, ((NativeTransform3D) (param1)).field_nativeid, param2, param3);
    }

    private final native void initializeNativeContext(long param0, GraphicsToolkit param1, int param2, int param3);

    NativeModelRenderContext(NativeSoftwareGraphicsToolkit param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = new NativeToolkitModel(this.field_e);
        this.field_i = new NativeToolkitModel(this.field_e);
        this.field_a = new NativeToolkitModel(this.field_e);
        this.field_b = new NativeToolkitModel(this.field_e);
        this.field_l = new NativeToolkitModel(this.field_e);
        this.field_k = new NativeToolkitModel(this.field_e);
        this.field_f = new NativeToolkitModel(this.field_e);
        this.field_g = new NativeToolkitModel(this.field_e);
        this.field_j = new NativeToolkitModel(this.field_e);
        this.field_d = new NativeToolkitModel(this.field_e);
        this.initializeNativeContext(this.field_nativeid, param0, param1, param2);
    }
}
