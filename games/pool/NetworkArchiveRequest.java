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

    final static void sortRankingsViews(boolean alternatePrimaryKey, int limit) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          IndexedSpriteState.sortRankingIndices(ArchiveRequest.field_z, MenuScreenBase.field_c, 0, LogoJingleLoader.field_a, limit, (byte) -63, alternatePrimaryKey);
          for (var2_int = 0; var2_int < MenuScreenBase.field_c; var2_int++) {
            NetworkGameClient.field_H[var2_int + limit] = var2_int;
          }
          IndexedSpriteState.sortRankingIndices(DiskCacheWorker.field_d, MenuScreenBase.field_c + limit, limit, SpriteSheetLoadSupport.field_c, limit + limit, (byte) -74, false);
          if (MenuScreenBase.field_c > limit) {
            MenuScreenBase.field_c = limit;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "sp.F(" + alternatePrimaryKey + ',' + limit + ')');
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
