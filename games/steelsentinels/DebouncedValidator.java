/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements ValidationSource {
    static int[] field_b;
    static int field_e;
    static String field_f;
    static String field_d;
    static char field_g;
    static String field_c;
    private long field_a;

    final static void a(int param0, boolean param1, int param2, MidiPcmStream param3, SystemTaskService param4, java.awt.Component param5, int param6, int param7) {
        try {
          AudioOutput.configure(param2, param1, 10);
          SoundAndUrlHelpers.field_a = AudioOutput.createOutput(param4, param5, 0, param0);
          ResourceArchive.field_j = AudioOutput.createOutput(param4, param5, 1, param6);
          UiTheme.field_e = new PcmStreamMixer();
          MusicPatchPcmStream.field_B = param6 * 1000 / param2;
          ResourceArchive.field_j.setStream(UiTheme.field_e);
          if (param7 > -71) {
            field_g = 'ﾓ';
          }
          IterableNodeHashTable.field_f = param3;
          IterableNodeHashTable.field_f.setMasterVolume(UiTheme.field_q, 1000000);
          SoundAndUrlHelpers.field_a.setStream(IterableNodeHashTable.field_f);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "v.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void markChanged(int param0) {
        this.field_a = ClockAndCookieHelpers.monotonicMillis(param0 ^ 17297);
        if (param0 != -17382) {
          field_c = (String) null;
        }
    }

    public final vd validationState(byte param0) {
        if (this.isEmpty(true)) {
          return ModalStack.field_S;
        }
        if (!(ClockAndCookieHelpers.monotonicMillis(114) >= (this.field_a + 350L))) {
          return Bzip2State.field_J;
        }
        if (param0 == 21) {
          return this.evaluateState(param0 - 32013);
        }
        return (vd) null;
    }

    public final String validationMessage(boolean param0) {
        if (this.isEmpty(param0)) {
          return null;
        }
        if (ClockAndCookieHelpers.monotonicMillis(85) >= this.field_a + 350L) {
          return this.evaluateMessage((byte) -42);
        }
        return null;
    }

    abstract vd evaluateState(int param0);

    public static void releaseStatics(boolean param0) {
        field_b = null;
        if (param0) {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        DebouncedValidator.a(-71, false, 92, (MidiPcmStream) null, (SystemTaskService) null, (java.awt.Component) null, -72, -65);
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract String evaluateMessage(byte param0);

    final static void a(int param0, String param1, int param2) {
        try {
          SentinelDesigner.field_i = param0;
          in.field_i = WeightedCacheEntry.field_G;
          if (param2 != 10) {
            field_d = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "v.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "MISSION <%0> <%1>";
        field_b = new int[]{4};
        field_d = "Orb coins: ";
        field_g = '/';
        field_c = "components:</col>";
    }
}
