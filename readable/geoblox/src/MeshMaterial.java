/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshMaterial {
    int baseRgb;

    final static void a(java.applet.Applet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 126 % ((-26 - param1) / 49);
          var3 = param0.getParameter("username");
          if (var3 != null) {
            var4 = (CharSequence) ((Object) var3);
            if (0L != ResourceArchive.a(var4, -48)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fd.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, PcmSample param1, boolean param2, int param3) {
        PcmSampleStream var4 = PcmSampleStream.createForPlaybackRate(param1, 100, param3);
        DelayedPcmStream var5 = ProgressDialog.a(param0, var4, 1000);
        PrefixCodeDecoder.trackedSoundEffectStreams.addLast(-103, new TrackedPcmStream(var4, var5));
        if (param2) {
            return;
        }
        try {
            WhirlpoolHash.field_d.a(var5);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
