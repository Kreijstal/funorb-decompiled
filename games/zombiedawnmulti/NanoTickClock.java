/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoTickClock extends TickClock {
    static String field_j;
    static String[] field_n;
    private long field_m;
    private long field_k;
    private int field_f;
    static int field_o;
    static UiComponent field_l;
    static String field_p;
    static IndexedSprite[] field_h;
    private int field_q;
    private long[] field_g;
    private long field_i;

    final static PendingIntArrayReply queueOutgoingRequest(int param0, int param1) {
        PendingIntArrayReply var2 = new PendingIntArrayReply();
        if (param0 != -19300) {
          PcmSampleStream var3 = (PcmSampleStream) null;
          NanoTickClock.removeSoundStream(true, (PcmSampleStream) null);
        }
        UnitStateEvent.field_j.addFirst(var2, false);
        UiComponentNode.sendRequestHeader(true, param1);
        return var2;
    }

    final long getMillisUntilNextTick(byte param0) {
        this.field_k = this.field_k + this.sampleElapsedNanos(1);
        if (this.field_k < this.field_i) {
          return (this.field_i - this.field_k) / 1000000L;
        }
        int var2 = 33 % ((73 - param0) / 46);
        return 0L;
    }

    final static void updateActivePopup(byte param0, boolean param1) {
        if (SpriteHotspot.field_e != null &&
          SpriteHotspot.field_e.updateAndPollDismissal(0, param1)) {
          SpriteHotspot.field_e = null;
        }
        if (param0 <= 113) {
          field_l = (UiComponent) null;
        }
    }

    final static boolean isReconnecting(int param0) {
        if (param0 != 0) {
          field_n = (String[]) null;
        }
        return IntrusiveDequeCursor.field_e;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_p = null;
        field_l = null;
        field_h = null;
        field_j = null;
    }

    private final long sampleElapsedNanos(int param0) {
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_m;
        this.field_m = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_g[this.field_q] = var4;
          if (1 > this.field_f) {
            this.field_f = this.field_f + 1;
          }
          this.field_q = (this.field_q + 1) % 10;
        }
        long var6 = 0L;
        for (var8 = param0; var8 <= this.field_f; var8++) {
          var6 = var6 + this.field_g[(-var8 + (this.field_q + 10)) % 10];
        }
        return var6 / (long)this.field_f;
    }

    final int advanceTicks(long param0, boolean param1) {
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param1) {
          return 31;
        }
        if (this.field_k < this.field_i) {
          this.field_m = this.field_m + (this.field_i - this.field_k);
          this.field_k = this.field_k + (this.field_i - this.field_k);
          this.field_i = this.field_i + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_i = this.field_i + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_k > this.field_i);
        if (this.field_i < this.field_k) {
          this.field_i = this.field_k;
        }
        return var4;
    }

    final static void removeSoundStream(boolean param0, PcmSampleStream param1) {
        if (!param0) {
          return;
        }
        try {
          ChatAndOptionHelpers.field_a.removeSubStream(param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void resetTiming(int param0) {
        if (this.field_i > this.field_k) {
          this.field_k = this.field_k + (this.field_i - this.field_k);
        }
        this.field_m = 0L;
        if (param0 >= -93) {
          field_l = (UiComponent) null;
        }
    }

    NanoTickClock() {
        this.field_f = 1;
        this.field_k = 0L;
        this.field_m = 0L;
        this.field_q = 0;
        this.field_i = 0L;
        this.field_g = new long[10];
        this.field_k = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = 20;
        field_p = "(Research Points can only be earned in Rated games!)";
    }
}
