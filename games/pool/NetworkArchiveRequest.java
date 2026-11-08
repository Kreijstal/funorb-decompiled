/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    byte reservedTailBytes;
    PacketBuffer responseBuffer;
    int blockPosition;

    final static boolean h(int param0) {
        if (param0 != 0) {
          return true;
        }
        return TimeTrialSelectScreen.field_I == IntegerRecordProtocolSupport.field_e ? true : false;
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          IndexedSpriteState.sortVisibleFaces(ArchiveRequest.field_z, MenuScreenBase.field_c, 0, LogoJingleLoader.field_a, param1, (byte) -63, param0);
          for (var2_int = 0; var2_int < MenuScreenBase.field_c; var2_int++) {
            NetworkGameClient.field_H[var2_int + param1] = var2_int;
          }
          IndexedSpriteState.sortVisibleFaces(DiskCacheWorker.field_d, MenuScreenBase.field_c + param1, param1, SpriteSheetLoadSupport.field_c, param1 + param1, (byte) -74, false);
          if (MenuScreenBase.field_c > param1) {
            MenuScreenBase.field_c = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "sp.F(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] getBytes(boolean param0) {
        if (param0) {
          return (byte[]) null;
        }
        if (!this.pending &&
          this.responseBuffer.position >= this.responseBuffer.payload.length - this.reservedTailBytes) {
          return this.responseBuffer.payload;
        }
        throw new RuntimeException();
    }

    NetworkArchiveRequest() {
    }

    final int getProgress(int param0) {
        if (null == this.responseBuffer) {
          return 0;
        }
        if (param0 <= 6) {
          return 22;
        }
        return 100 * this.responseBuffer.position / (this.responseBuffer.payload.length - this.reservedTailBytes);
    }

    static {
    }
}
