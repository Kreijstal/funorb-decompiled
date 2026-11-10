/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetContainer extends SingleChildWidget {
    int field_H;
    static QuickChatCommandType field_I;
    static int field_F;
    static int field_G;
    static PlatformTaskDispatcher field_E;

    public static void releaseStatics(byte param0) {
        field_I = null;
        field_E = null;
        int var1 = -49 / ((65 - param0) / 51);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        Sprite var6 = null;
        if (param3 != param1) {
          return;
        }
        if (this.field_z == null) {
          return;
        }
        if (this.field_H == 0) {
          return;
        }
        if (256 != this.field_H) {
          var6 = new Sprite(this.field_z.field_i, this.field_z.field_n);
          ContentTransitionDialog.setRasterTarget((byte) -108, var6);
          this.field_z.drawLayer(0, param1, 0, param3 + 0);
          SingleChildWidget.popRasterState(-21189);
          var6.drawWithOpacity(param2 + this.field_k, param0 + this.field_j, this.field_H);
          return;
        }
        this.field_z.drawLayer(param0 + this.field_j, param1, param2 + this.field_k, param3 ^ 0);
    }

    WidgetContainer(UiWidget param0) {
        super(param0.field_k, param0.field_j, param0.field_i, param0.field_n, (WidgetPainter) null, (WidgetListener) null);
        try {
          param0.setBounds(61, 0, 0, this.field_i, this.field_n);
          this.field_z = param0;
          this.field_H = 256;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeArchiveServices(int param0, int param1, int param2, String param3, int param4, int param5, PlatformTaskDispatcher param6, int param7, int param8) {
        try {
          MoveTargetMarker.field_e = param1;
          WeightedLruCache.field_a = param6;
          TriangleMesh.field_u = param3;
          WhirlpoolHasher.field_j = param4;
          RasterCanvasSizeTarget.field_b = param2;
          KeyStateHelpers.field_a = param0;
          PacketRequestHelpers.field_a = param5;
          if (param7 != 0) {
            PlatformTaskDispatcher var10 = (PlatformTaskDispatcher) null;
            WidgetContainer.initializeArchiveServices(55, -23, -91, (String) null, 112, -70, (PlatformTaskDispatcher) null, 37, -64);
          }
          RankingQueryWriter.field_d = param8;
          SpatialBucket.field_c = (Js5Transport) ((Object) new SocketJs5Transport());
          LoginDialogGlobals.field_d = new ExceptionWrapper(param6);
          PendingBytePayloadRequest.field_l = new Js5ArchiveManager(SpatialBucket.field_c, LoginDialogGlobals.field_d);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "mh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public WidgetContainer() {
        super(0, 0, 0, 0, (WidgetPainter) null, (WidgetListener) null);
        this.field_H = 256;
    }

    static {
        field_I = new QuickChatCommandType(7, 0, 1, 1);
    }
}
