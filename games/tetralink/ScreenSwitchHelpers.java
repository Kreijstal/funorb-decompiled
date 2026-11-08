/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenSwitchHelpers {
    static boolean field_e;
    static AnimationPlayer field_a;
    static int[] field_b;
    static String field_d;
    static Sprite field_c;

    final static boolean isAsciiLetter(byte param0, char param1) {
        if (param0 >= -90) {
          ScreenSwitchHelpers.switchScreen(107, -51, false, 107);
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 >= param1) {
          return true;
        }
        return false;
    }

    final static boolean haveRequiredClientStages(int param0) {
        if (param0 != -19403) {
          ScreenSwitchHelpers.isAsciiLetter((byte) 73, '~');
          if (DisplayNameForm.field_R < 10) {
            return false;
          }
          if (13 <= GrowableIntList.field_a) {
            return true;
          }
          return false;
        }
        if (DisplayNameForm.field_R < 10) {
          return false;
        }
        if (13 <= GrowableIntList.field_a) {
          return true;
        }
        return false;
    }

    final static void switchScreen(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        EmailAvailabilityValidator.field_v = 0;
        DraggableWidget.field_O = param0;
        PlayerContextMenu.field_d = param3;
        if (AccountWelcomePanel.isNonNegative(DraggableWidget.field_O, (byte) 114)) {
          var4 = 0;
          MarkerSlider.field_X[DraggableWidget.field_O].updatePointerSelection(param2, var4, -1);
        }
        if (param1 <= -64) {
          if (DraggableWidget.field_O == -4) {
            MenuScreen.field_g = 2;
            SoundMixerHelpers.field_e = 3.1415927410125732f;
            TransitionPhase.field_d = 84.0f;
          }
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -88) {
          return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void writeEncryptedPayload(byte param0, byte[] param1, int param2, PacketBuffer param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var10Lifetime1;
        var11 = TetraLink.field_J;
        try {
          var7_int = ClockAndTextHelpers.roundUpToMultipleOfEight(false, param2);
          var9 = -127 / ((param0 - 47) / 35);
          if (null == CheckboxWidget.field_R) {
            CheckboxWidget.field_R = new java.security.SecureRandom();
          }
          var14 = new int[4];
          var13 = var14;
          var8 = var13;
          for (var10 = 0; 4 > var10; var10++) {
            var8[var10] = CheckboxWidget.field_R.nextInt();
          }
          if (null == LoadingProgressDialog.field_hb ||
            !(var7_int <= LoadingProgressDialog.field_hb.payload.length)) {
            LoadingProgressDialog.field_hb = new PacketBuffer(var7_int);
          }
          LoadingProgressDialog.field_hb.position = 0;
          LoadingProgressDialog.field_hb.writeBytes(param4, 128, param1, param2);
          LoadingProgressDialog.field_hb.padToPosition((byte) -71, var7_int);
          LoadingProgressDialog.field_hb.encryptXtea(10830, var14);
          if (null == FaceNormal.field_f ||
            !(100 <= FaceNormal.field_f.payload.length)) {
            FaceNormal.field_f = new PacketBuffer(100);
          }
          FaceNormal.field_f.position = 0;
          FaceNormal.field_f.writeByte(10, false);
          var12 = 0;
          var10Lifetime1 = var12;
          while (4 > var12) {
            FaceNormal.field_f.writeInt(var14[var12], (byte) -124);
            var12++;
          }
          FaceNormal.field_f.writeShort(param2, false);
          FaceNormal.field_f.encryptRsa(param5, param6, -25035);
          param3.writeBytes(0, 128, FaceNormal.field_f.payload, FaceNormal.field_f.position);
          param3.writeBytes(0, 128, LoadingProgressDialog.field_hb.payload, LoadingProgressDialog.field_hb.position);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
