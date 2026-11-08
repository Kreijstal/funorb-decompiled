/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPool {
    static int[] field_a;

    final synchronized static byte[] acquireByteArray(int param0, byte param1) {
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int fieldTemp$18 = 0;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$13 = 0;
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$6 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$12 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$11 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var3Lifetime1Lifetime1;
        if (param1 != -2) {
          return (byte[]) null;
        }
        if (param0 != 100) {
          if (5000 == param0) {
            if (0 < TextButton.field_L) {
              fieldTemp$22 = TextButton.field_L - 1;
              TextButton.field_L = TextButton.field_L - 1;
              var2_ref_byte__ = GameApplet.field_j[fieldTemp$22];
              GameApplet.field_j[TextButton.field_L] = null;
              return var2_ref_byte__;
            }
            if (param0 == 30000 &&
              LoginProgressHelpers.field_e > 0) {
              fieldTemp$19 = LoginProgressHelpers.field_e - 1;
              LoginProgressHelpers.field_e = LoginProgressHelpers.field_e - 1;
              var2_ref_byte__ = MusicPatch.field_q[fieldTemp$19];
              MusicPatch.field_q[LoginProgressHelpers.field_e] = null;
              return var2_ref_byte__;
            }
            if (SecondaryNodeDeque.field_c == null) {
              return new byte[param0];
            }
            for (var2 = 0; DraggableWidget.field_V.length > var2; var2++) {
              if (param0 == DraggableWidget.field_V[var2] &&
                0 < SoundMixerHelpers.field_d[var2]) {
                dupTemp$20 = SoundMixerHelpers.field_d[var2] - 1;
                arrayValue$21 = SecondaryNodeDeque.field_c[var2];
                SoundMixerHelpers.field_d[var2] = dupTemp$20;
                var3 = arrayValue$21[dupTemp$20];
                SecondaryNodeDeque.field_c[var2][SoundMixerHelpers.field_d[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (param0 != 30000) {
            if (SecondaryNodeDeque.field_c == null) {
              return new byte[param0];
            }
            for (var2Lifetime4 = 0; DraggableWidget.field_V.length > var2Lifetime4; var2Lifetime4++) {
              if (param0 == DraggableWidget.field_V[var2Lifetime4] &&
                0 < SoundMixerHelpers.field_d[var2Lifetime4]) {
                dupTemp$14 = SoundMixerHelpers.field_d[var2Lifetime4] - 1;
                arrayValue$15 = SecondaryNodeDeque.field_c[var2Lifetime4];
                SoundMixerHelpers.field_d[var2Lifetime4] = dupTemp$14;
                var3Lifetime4 = arrayValue$15[dupTemp$14];
                SecondaryNodeDeque.field_c[var2Lifetime4][SoundMixerHelpers.field_d[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (LoginProgressHelpers.field_e > 0) {
            fieldTemp$18 = LoginProgressHelpers.field_e - 1;
            LoginProgressHelpers.field_e = LoginProgressHelpers.field_e - 1;
            var2_ref_byte__Lifetime5 = MusicPatch.field_q[fieldTemp$18];
            MusicPatch.field_q[LoginProgressHelpers.field_e] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (SecondaryNodeDeque.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime5 = 0; DraggableWidget.field_V.length > var2Lifetime5; var2Lifetime5++) {
            if (param0 == DraggableWidget.field_V[var2Lifetime5] &&
              0 < SoundMixerHelpers.field_d[var2Lifetime5]) {
              dupTemp$16 = SoundMixerHelpers.field_d[var2Lifetime5] - 1;
              arrayValue$17 = SecondaryNodeDeque.field_c[var2Lifetime5];
              SoundMixerHelpers.field_d[var2Lifetime5] = dupTemp$16;
              var3Lifetime5 = arrayValue$17[dupTemp$16];
              SecondaryNodeDeque.field_c[var2Lifetime5][SoundMixerHelpers.field_d[var2Lifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param0];
        }
        if (0 < EditableTextWidget.field_cb) {
          fieldTemp$13 = EditableTextWidget.field_cb - 1;
          EditableTextWidget.field_cb = EditableTextWidget.field_cb - 1;
          var2_ref_byte__Lifetime1 = DebouncedValidator.field_f[fieldTemp$13];
          DebouncedValidator.field_f[EditableTextWidget.field_cb] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (5000 != param0) {
          if (param0 != 30000) {
            if (SecondaryNodeDeque.field_c == null) {
              return new byte[param0];
            }
            for (var2Lifetime1 = 0; DraggableWidget.field_V.length > var2Lifetime1; var2Lifetime1++) {
              if (param0 == DraggableWidget.field_V[var2Lifetime1] &&
                0 < SoundMixerHelpers.field_d[var2Lifetime1]) {
                dupTemp$2 = SoundMixerHelpers.field_d[var2Lifetime1] - 1;
                arrayValue$3 = SecondaryNodeDeque.field_c[var2Lifetime1];
                SoundMixerHelpers.field_d[var2Lifetime1] = dupTemp$2;
                var3Lifetime1 = arrayValue$3[dupTemp$2];
                SecondaryNodeDeque.field_c[var2Lifetime1][SoundMixerHelpers.field_d[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (LoginProgressHelpers.field_e > 0) {
            fieldTemp$6 = LoginProgressHelpers.field_e - 1;
            LoginProgressHelpers.field_e = LoginProgressHelpers.field_e - 1;
            var2_ref_byte__Lifetime2 = MusicPatch.field_q[fieldTemp$6];
            MusicPatch.field_q[LoginProgressHelpers.field_e] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (SecondaryNodeDeque.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime1Lifetime1 = 0; DraggableWidget.field_V.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (param0 == DraggableWidget.field_V[var2Lifetime1Lifetime1] &&
              0 < SoundMixerHelpers.field_d[var2Lifetime1Lifetime1]) {
              dupTemp$4 = SoundMixerHelpers.field_d[var2Lifetime1Lifetime1] - 1;
              arrayValue$5 = SecondaryNodeDeque.field_c[var2Lifetime1Lifetime1];
              SoundMixerHelpers.field_d[var2Lifetime1Lifetime1] = dupTemp$4;
              var3Lifetime1Lifetime1 = arrayValue$5[dupTemp$4];
              SecondaryNodeDeque.field_c[var2Lifetime1Lifetime1][SoundMixerHelpers.field_d[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (0 < TextButton.field_L) {
          fieldTemp$12 = TextButton.field_L - 1;
          TextButton.field_L = TextButton.field_L - 1;
          var2_ref_byte__Lifetime3 = GameApplet.field_j[fieldTemp$12];
          GameApplet.field_j[TextButton.field_L] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param0 != 30000) {
          if (SecondaryNodeDeque.field_c == null) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; DraggableWidget.field_V.length > var2Lifetime2; var2Lifetime2++) {
            if (param0 == DraggableWidget.field_V[var2Lifetime2] &&
              0 < SoundMixerHelpers.field_d[var2Lifetime2]) {
              dupTemp$7 = SoundMixerHelpers.field_d[var2Lifetime2] - 1;
              arrayValue$8 = SecondaryNodeDeque.field_c[var2Lifetime2];
              SoundMixerHelpers.field_d[var2Lifetime2] = dupTemp$7;
              var3Lifetime2 = arrayValue$8[dupTemp$7];
              SecondaryNodeDeque.field_c[var2Lifetime2][SoundMixerHelpers.field_d[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (LoginProgressHelpers.field_e > 0) {
          fieldTemp$11 = LoginProgressHelpers.field_e - 1;
          LoginProgressHelpers.field_e = LoginProgressHelpers.field_e - 1;
          var2_ref_byte__Lifetime4 = MusicPatch.field_q[fieldTemp$11];
          MusicPatch.field_q[LoginProgressHelpers.field_e] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (SecondaryNodeDeque.field_c == null) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; DraggableWidget.field_V.length > var2Lifetime3; var2Lifetime3++) {
          if (param0 == DraggableWidget.field_V[var2Lifetime3] &&
            0 < SoundMixerHelpers.field_d[var2Lifetime3]) {
            dupTemp$9 = SoundMixerHelpers.field_d[var2Lifetime3] - 1;
            arrayValue$10 = SecondaryNodeDeque.field_c[var2Lifetime3];
            SoundMixerHelpers.field_d[var2Lifetime3] = dupTemp$9;
            var3Lifetime3 = arrayValue$10[dupTemp$9];
            SecondaryNodeDeque.field_c[var2Lifetime3][SoundMixerHelpers.field_d[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    final static void readLocalPlayerName(byte param0) {
        NetworkGameClient.field_w = BackgroundSparkle.field_q.readString((byte) 81);
        if (param0 < 18) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) NetworkGameClient.field_w);
        RegistrationResponseHelpers.field_f = DialWidgetPainter.normalizeDisplayName(var2, (byte) 105);
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (!param0) {
          ByteArrayPool.acquireByteArray(80, (byte) 40);
        }
    }

    static {
        field_a = new int[8192];
    }
}
