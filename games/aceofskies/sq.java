/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends InteractiveWidget {
    sq(String param0, WidgetEventListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_s = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        this.field_s = !this.field_s ? true : false;
        super.activateFromInput(param0 ^ param0, param1, param2, param3);
    }

    private sq(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        super(param0, param1, param2);
        try {
          this.field_e = ArchiveRequest.field_n.field_g;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private sq(String param0, WidgetEventListener param1) {
        this(param0, ArchiveRequest.field_n.field_c, param1);
        try {
          this.field_e = ArchiveRequest.field_n.field_g;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite a(int param0) {
        if (param0 == 15636) {
          IndexedSprite var1 = new IndexedSprite(pu.field_a, JaggrabDownloader.field_i, FullscreenNoticeType.field_a[0], lg.field_j[0], ji.field_b[0], ee.field_e[0], fk.field_a[0], ud.field_e);
          OpenGlUnderwaterEffect.f(1);
          return var1;
        }
        return (IndexedSprite) null;
    }

    static {
    }
}
