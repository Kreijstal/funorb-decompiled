/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundTriggerTick {
    static SoundEffectDefinition field_g;
    static long field_e;
    int field_c;
    static AnimatedPanel field_f;
    SoundTriggerTick field_b;
    static String field_h;
    static String field_a;
    static MusicTrack field_d;

    public static void releaseSoundTriggerStatics(byte param0) {
        field_f = null;
        if (param0 == 82) {
          field_a = null;
          field_g = null;
          field_h = null;
          field_d = null;
          return;
        }
        SoundTriggerTick.ensureAiWorkCapacity((byte) -109, 97);
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static void ensureAiWorkCapacity(byte param0, int param1) {
        if (param1 >= ValidationMessageWidget.field_T) {
          ValidationMessageWidget.field_T = param1;
          TutorialStageSupport.field_f = new boolean[param1];
          CheckboxWidgetPainter.field_c = new int[param1];
          GameScreen.field_c = new int[param1];
          TabbedPanel.field_Ab = new int[param1];
          if (param0 < 123) {
            field_e = 41L;
          }
          return;
        }
    }

    SoundTriggerTick(SoundPlayback param0, int param1) {
        try {
          this.field_c = param1;
          this.field_b = null;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "Type your email address again to make sure it's correct";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
