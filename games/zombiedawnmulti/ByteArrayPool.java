/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPool {
    static int[] field_c;
    static String[] field_b;
    static int field_a;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 103) {
          field_b = (String[]) null;
        }
    }

    final synchronized static byte[] acquireByteArray(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var4;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          ArchiveAvailabilityHelpers.field_h > 0) {
          fieldTemp$0 = ArchiveAvailabilityHelpers.field_h - 1;
          ArchiveAvailabilityHelpers.field_h = ArchiveAvailabilityHelpers.field_h - 1;
          var2_ref_byte__ = ReflectionCheckRequest.field_f[fieldTemp$0];
          ReflectionCheckRequest.field_f[ArchiveAvailabilityHelpers.field_h] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          BufferedSocket.field_e > 0) {
          fieldTemp$1 = BufferedSocket.field_e - 1;
          BufferedSocket.field_e = BufferedSocket.field_e - 1;
          var2_ref_byte__Lifetime1 = LobbyUiSetupHelpers.field_a[fieldTemp$1];
          LobbyUiSetupHelpers.field_a[BufferedSocket.field_e] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param1 &&
          0 < LevelFileList.field_a) {
          fieldTemp$2 = LevelFileList.field_a - 1;
          LevelFileList.field_a = LevelFileList.field_a - 1;
          var2_ref_byte__Lifetime2 = BirthDateEntryPanel.field_N[fieldTemp$2];
          BirthDateEntryPanel.field_N[LevelFileList.field_a] = null;
          return var2_ref_byte__Lifetime2;
        }
        var2 = -104 / ((param0 - 39) / 61);
        if (null != GameKeyHandler.field_b) {
          for (var3 = 0; var3 < MiasmaParticle.field_P.length; var3++) {
            if (param1 == MiasmaParticle.field_P[var3] &&
              ProgressDialog.field_ib[var3] > 0) {
              dupTemp$3 = ProgressDialog.field_ib[var3] - 1;
              arrayValue$4 = GameKeyHandler.field_b[var3];
              ProgressDialog.field_ib[var3] = dupTemp$3;
              var4 = arrayValue$4[dupTemp$3];
              GameKeyHandler.field_b[var3][ProgressDialog.field_ib[var3]] = null;
              return var4;
            }
          }
        }
        return new byte[param1];
    }

    final static Sprite loadSpriteByName(String param0, String param1, ResourceArchive param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 11091) {
            ByteArrayPool.isNameCharacter(-27, 'w');
          }
          var4_int = param2.getGroupIdByName(param0, (byte) 118);
          var5 = param2.getFileId(param1, var4_int, -1);
          stackIn_3_0 = ClockAndScreenHelpers.loadSprite((byte) 50, var4_int, param2, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean isNameCharacter(int param0, char param1) {
        if (param0 > -69) {
          return false;
        }
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (ButtonWidget.isAlphanumeric(param1, 16413)) {
          return true;
        }
        if (param1 != 45 &&
          param1 != 160 &&
          param1 != 32 &&
          95 != param1) {
          return false;
        }
        return true;
    }

    static {
        field_b = new String[]{"Zombie", "Overlord", "Planetary"};
        field_c = new int[8192];
    }
}
