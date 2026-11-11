/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PbufferEntry extends DualLinkNode {
    static String field_o;
    private long field_k;
    int field_p;
    static int[] field_n;
    static int[] field_m;
    private OpenGlToolkit field_l;

    final static boolean isPowerOfTwoOrZero(int param0, int param1) {
        if (param0 == 9181) {
          return (param1 & -param1) == param1 ? true : false;
        }
        return false;
    }

    protected final void finalize() throws Throwable {
        this.releasePbuffer(-6814);
        super.finalize();
    }

    private final void releasePbuffer(int param0) {
        if (param0 == -6814) {
          if (this.field_k > 0L) {
            this.field_l.field_l.releasePbuffer(this.field_k);
            this.field_k = 0L;
          }
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_o = null;
        if (param0 != 0) {
          field_n = (int[]) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    final long getPbufferHandle(byte param0) {
        if (param0 != 101) {
          return -83L;
        }
        return this.field_k;
    }

    PbufferEntry(OpenGlToolkit param0, int param1, int param2) {
        try {
          this.field_l = param0;
          this.field_p = param2 * param1;
          this.field_k = this.field_l.field_l.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean ensurePacketPayload(int param0) {
        if (-1 == uca.field_d) {
          if (!LegacyRidgedWaterNoise.ensureGamePacketBytes(1, -1)) {
            return false;
          }
          uca.field_d = WeaveOperator.field_q.readUnsignedByte(255);
          WeaveOperator.field_q.position = 0;
        }
        if (param0 != 0) {
          return true;
        }
        if (-2 != uca.field_d) {
          return LegacyRidgedWaterNoise.ensureGamePacketBytes(uca.field_d, -1);
        }
        if (!LegacyRidgedWaterNoise.ensureGamePacketBytes(2, -1)) {
          return false;
        }
        uca.field_d = WeaveOperator.field_q.readUnsignedShort(125);
        WeaveOperator.field_q.position = 0;
        return LegacyRidgedWaterNoise.ensureGamePacketBytes(uca.field_d, -1);
    }

    final static void initConsole(int param0) {
        TripBeamComponent.playMusicTrack(1, param0);
        SoftwareRasterizer.clear();
        TextureCombineSource.startMenuBackgroundDemo(122);
        if (!(ld.field_e < 2)) {
          HelloCommand.field_o = new FunOrbConsole(jk.createConsoleMethods((byte) 122), HeapIndexArray.field_d, dsa.field_c);
          aca.addShellListenerFirst(HelloCommand.field_o, 19711);
          aca.addShellListenerFirst(oq.getSharedShellListener((byte) 124), 19711);
        }
        if (TextWidgetPainter.a(83)) {
          UrlDownloadRequest.startTutorial((byte) -59);
        }
    }

    static {
        field_o = "Lobby";
        field_n = new int[]{0, 26, 27};
    }
}
