/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int pointerPressXSnapshot;

    final static boolean a(String param0, String param1, int param2, AccountCreationForm param3, int param4, boolean param5, String param6) {
        AccountCreationDialog var7 = null;
        RuntimeException var7_ref = null;
        AccountCreationDialog var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (kd.field_b != DiskCacheWorker.field_l) {
            return false;
          }
          var8 = new AccountCreationDialog(kd.field_e, param3);
          var7 = var8;
          kd.field_e.showDialog(false, var8);
          if (param4 != 0) {
            return false;
          }
          if (kf.a(122)) {
            var8.showIneligibleResult(12086);
            return true;
          }
          CachedArchiveSource.field_s = param5;
          StatefulWidgetRenderer.field_u = param2;
          dl.field_a = null;
          ResourceArchive.field_i = param1;
          kd.field_b = IntrusiveDeque.field_d;
          ByteStorage.field_a = param6;
          SpriteCheckboxRenderer.field_a = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("mc.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void snapshotPointerInput(byte methodGuard) {
        Throwable unusedPointerSnapshotFailureCarrier = null;
        Object pointerMonitor = null;
        pointerMonitor = pg.pointerListener;
        synchronized (pointerMonitor) {
          GameplaySession.pointerIdleTicks = GameplaySession.pointerIdleTicks + 1;
          EntityCollisionSupport.heldPointerButtonSnapshot = Under13TermsPanel.liveHeldPointerButton;
          if (methodGuard >= -126) {
            pointerPressXSnapshot = -77;
          }
          PrefixCodeDecoder.pointerXSnapshot = lj.livePointerX;
          PcmResampler.pointerYSnapshot = ReflectionCheckRequest.livePointerY;
          wb.pointerActivitySnapshot = fc.pointerActivityPending;
          fc.pointerActivityPending = false;
          CheckboxRenderer.pointerPressButtonSnapshot = ClientSessionSnapshot.pendingPointerPressButton;
          pointerPressXSnapshot = ah.livePointerPressX;
          FullscreenFocusCanvas.pointerPressYSnapshot = DisplayNamePanel.livePointerPressY;
          ClientSessionSnapshot.pendingPointerPressButton = 0;
        }
    }

    static {
        pointerPressXSnapshot = 0;
    }
}
