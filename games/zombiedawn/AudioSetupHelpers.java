/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioSetupHelpers {
    static LoginMethod field_a;
    static boolean field_b;

    final static Js5Archive createArchive(boolean param0, int param1, byte param2, int param3, boolean param4) {
        if (param2 == -85) {
          return SpriteState.createResourceArchive(false, true, param1, param3, param0, param4);
        }
        field_b = true;
        return SpriteState.createResourceArchive(false, true, param1, param3, param0, param4);
    }

    final static void initializeAudio(int param0, MidiPcmStream param1, int param2, java.awt.Component param3, PlatformTaskDispatcher param4, int param5, boolean param6, int param7) {
        try {
          AudioOutput.configure(param5, param6, 10);
          ExceptionWrapper.field_d = AudioOutput.create(param4, param3, 0, param0);
          LoginDialog.field_fb = AudioOutput.create(param4, param3, 1, param2);
          DialWidgetPainter.field_i = new PcmMixer();
          PasswordValidator.field_f = 1000 * param2 / param5;
          LoginDialog.field_fb.setStream(DialWidgetPainter.field_i);
          if (param7 >= -104) {
            field_b = true;
          }
          PowerupBar.field_o = param1;
          PowerupBar.field_o.setMasterVolume(VisualPropertyNode.field_u, (byte) -68);
          ExceptionWrapper.field_d.setStream(PowerupBar.field_o);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "wn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          PlatformTaskDispatcher var2 = (PlatformTaskDispatcher) null;
          AudioSetupHelpers.initializeAudio(3, (MidiPcmStream) null, 66, (java.awt.Component) null, (PlatformTaskDispatcher) null, -13, false, 43);
        }
    }

    static {
        field_a = new LoginMethod("usename");
        field_b = true;
    }
}
