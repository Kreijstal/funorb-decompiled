/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_b;
    static String field_a;

    final static void writeIntRecordSubmission(int packetOpcode, int methodGuard, KeyedIntRecordSubmission submission) {
        PacketBuffer var6 = null;
        int var4 = 0;
        try {
            var6 = CacheReference.field_q;
            var6.writeCipherByte(packetOpcode, (byte) -63);
            var6.position = var6.position + 1;
            if (methodGuard != 86) {
                KeyedIntRecordSubmission var5 = (KeyedIntRecordSubmission) null;
                tj.writeIntRecordSubmission(-12, 107, (KeyedIntRecordSubmission) null);
            }
            var4 = var6.position;
            var6.writeByte((byte) 127, 1);
            var6.writeByte((byte) 124, submission.byteKey);
            var6.writeSignedSmart(submission.signedSmartKey, methodGuard - 6048);
            var6.writeIntBE((byte) 95, submission.firstValue);
            var6.writeIntBE((byte) 95, submission.secondValue);
            var6.writeIntBE((byte) 95, submission.thirdValue);
            var6.writeIntBE((byte) 95, submission.fourthValue);
            var6.appendCrc32(104, var4);
            var6.backpatchLengthByte(11700, -var4 + var6.position);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tj.B(" + packetOpcode + ',' + methodGuard + ',' + (submission != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        String var3 = null;
        String var2 = null;
        String var5 = null;
        if (!AgeValidator.field_i) {
            throw new IllegalStateException();
        }
        if (Geoblox.activeMessageDialog != null) {
            Geoblox.activeMessageDialog.dismissDialog((byte) -104);
            if (param0 >= -47) {
                field_a = (String) null;
                var3 = SpriteButtonRenderer.c(7789);
                SpriteButtonRenderer.field_t = new LoginPanel(var3, (String) null, true, false, false);
                kd.field_e.showDialog(false, ButtonWidget.field_C);
                ButtonWidget.field_C.replaceContent(SpriteButtonRenderer.field_t, -85);
                ButtonWidget.field_C.finishTransition(true);
                return;
            }
            var2 = SpriteButtonRenderer.c(7789);
            SpriteButtonRenderer.field_t = new LoginPanel(var2, (String) null, true, false, false);
            kd.field_e.showDialog(false, ButtonWidget.field_C);
            ButtonWidget.field_C.replaceContent(SpriteButtonRenderer.field_t, -85);
            ButtonWidget.field_C.finishTransition(true);
            return;
        }
        if (param0 < -47) {
            var5 = SpriteButtonRenderer.c(7789);
            SpriteButtonRenderer.field_t = new LoginPanel(var5, (String) null, true, false, false);
            kd.field_e.showDialog(false, ButtonWidget.field_C);
            ButtonWidget.field_C.replaceContent(SpriteButtonRenderer.field_t, -85);
            ButtonWidget.field_C.finishTransition(true);
            return;
        }
        field_a = (String) null;
        String var4 = SpriteButtonRenderer.c(7789);
        SpriteButtonRenderer.field_t = new LoginPanel(var4, (String) null, true, false, false);
        kd.field_e.showDialog(false, ButtonWidget.field_C);
        ButtonWidget.field_C.replaceContent(SpriteButtonRenderer.field_t, -85);
        ButtonWidget.field_C.finishTransition(true);
    }

    public static void a(int param0) {
        if (param0 < 1) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void c(byte param0) {
        TextWidgetRenderer.field_a = null;
        int var1 = 59 % ((param0 + 30) / 37);
        UiFontResources.awtLoadingFont = null;
    }

    final static int a(byte param0) {
        if (param0 != 73) {
          tj.a(-5);
        }
        if (VisualPropertyOverrides.field_C < 2) {
          return 0;
        }
        if (MeshPrioritySupport.field_a == 0) {
          if (!DirectByteStorage.field_h.ensureIndexLoaded(0)) {
            return 20;
          }
          if (!DirectByteStorage.field_h.loadGroupByName("commonui", (byte) -127)) {
            return 40;
          }
          if (!AttachedEntityRenderer.field_c.ensureIndexLoaded(0)) {
            return 50;
          }
          if (!AttachedEntityRenderer.field_c.loadGroupByName("commonui", (byte) -127)) {
            return 60;
          }
          if (!DialRenderer.field_n.ensureIndexLoaded(0)) {
            return 70;
          }
          if (DialRenderer.field_n.loadAllGroups(true)) {
            return 100;
          }
          return 80;
        }
        if (FadingDialog.field_J != null) {
          if (!FadingDialog.field_J.ensureIndexLoaded(0)) {
            return 14;
          }
          if (!FadingDialog.field_J.hasGroupName((byte) -115, "")) {
            return 29;
          }
          if (!FadingDialog.field_J.loadGroupByName("", (byte) -124)) {
            return 29;
          }
        }
        if (!DirectByteStorage.field_h.ensureIndexLoaded(param0 ^ 73)) {
          return 43;
        }
        if (!DirectByteStorage.field_h.loadGroupByName("commonui", (byte) -125)) {
          return 57;
        }
        if (!AttachedEntityRenderer.field_c.ensureIndexLoaded(0)) {
          return 71;
        }
        if (!AttachedEntityRenderer.field_c.loadGroupByName("commonui", (byte) -128)) {
          return 80;
        }
        if (!DialRenderer.field_n.ensureIndexLoaded(param0 - 73)) {
          return 82;
        }
        if (!DialRenderer.field_n.loadAllGroups(true)) {
          return 86;
        }
        return 100;
    }

    static {
        field_a = "Level's<br>last geoblox";
    }
}
