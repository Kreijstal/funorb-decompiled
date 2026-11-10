/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelFileCatalog {
    static UiComponent field_d;
    static int field_b;
    static int[] field_a;
    static int field_c;
    static String field_e;

    final static AccountServerResult pollUsernameAvailability(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        AccountServerResult stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (BirthDateValidator.field_k == ProgressDialog.field_hb) {
            return null;
          }
          if (param0 != 127) {
            var3 = (String) null;
            LevelFileCatalog.pollUsernameAvailability((byte) -55, (String) null);
          }
          if (RankingEntry.field_j == ProgressDialog.field_hb &&
            param1.equals(StatSubmissionHelpers.field_a)) {
            ProgressDialog.field_hb = TextLayout.field_b;
            stackIn_8_0 = DiskCacheWorker.field_g;
            return stackIn_8_0;
          }
          DiskCacheWorker.field_g = null;
          StatSubmissionHelpers.field_a = param1;
          ProgressDialog.field_hb = BirthDateValidator.field_k;
          stackIn_10_0 = null;
          return (AccountServerResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ed.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void writeAbuseReport(String param0, long param1, int param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        ResourceArchive var8 = null;
        CipherPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, param2);
          TextValidationFailure.field_a.position = TextValidationFailure.field_a.position + 1;
          var7_int = TextValidationFailure.field_a.position;
          TextValidationFailure.field_a.writeLong(param1, true);
          TextValidationFailure.field_a.writeString(param0, (byte) 105);
          TextValidationFailure.field_a.writeByte(-31, param3);
          stackIn_2_0 = TextValidationFailure.field_a;
          stackIn_2_1 = 107;
          if (!param4) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((CipherPacketBuffer) (Object) stackIn_2_0).writeByte(stackIn_2_1, stackIn_3_2);
          TextValidationFailure.field_a.backpatchByteLength(76, -var7_int + TextValidationFailure.field_a.position);
          if (param5 != 21965) {
            var8 = (ResourceArchive) null;
            LevelFileCatalog.loadLevelFiles((ResourceArchive) null, -63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ed.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 12814) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static LevelFileList loadLevelFiles(ResourceArchive param0, int param1) {
        LevelFileList var2 = null;
        RuntimeException var2_ref = null;
        LevelFileList stackIn_2_0 = null;
        LevelFileList stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2852) {
            stackIn_2_0 = (LevelFileList) null;
            return stackIn_2_0;
          }
          var2 = new LevelFileList();
          var2.addLevelFile((byte) 97, param0.getNamedFile("", "sandbox.zdl", false));
          var2.addLevelFile((byte) 84, param0.getNamedFile("", "tutorial.zdl", false));
          var2.addLevelFile((byte) 111, param0.getNamedFile("", "n2/ma_1.zdl", false));
          var2.addLevelFile((byte) 115, param0.getNamedFile("", "n2/wh_1.zdl", false));
          var2.addLevelFile((byte) 126, param0.getNamedFile("", "n2/pp_1.zdl", false));
          var2.addLevelFile((byte) 94, param0.getNamedFile("", "n2/pr_1.zdl", false));
          var2.addLevelFile((byte) 85, param0.getNamedFile("", "n4/ma_1.zdl", false));
          var2.addLevelFile((byte) 115, param0.getNamedFile("", "n4/wh_1.zdl", false));
          var2.addLevelFile((byte) 125, param0.getNamedFile("", "n4/pp_1.zdl", false));
          var2.addLevelFile((byte) 83, param0.getNamedFile("", "n4/pr_1.zdl", false));
          var2.addLevelFile((byte) 107, param0.getNamedFile("", "Badgirls_2.zdl", false));
          var2.addLevelFile((byte) 110, param0.getNamedFile("", "Carpark_4.zdl", false));
          var2.addLevelFile((byte) 103, param0.getNamedFile("", "Cineplex_2.zdl", false));
          var2.addLevelFile((byte) 76, param0.getNamedFile("", "Claustrophobia_2.zdl", false));
          var2.addLevelFile((byte) 79, param0.getNamedFile("", "Core_2.zdl", false));
          var2.addLevelFile((byte) 120, param0.getNamedFile("", "Hotel_4.zdl", false));
          var2.addLevelFile((byte) 72, param0.getNamedFile("", "Megamall_4.zdl", false));
          var2.addLevelFile((byte) 126, param0.getNamedFile("", "Prisonbreak_4.zdl", false));
          var2.addLevelFile((byte) 95, param0.getNamedFile("", "AnyonesConference.zdl", false));
          var2.addLevelFile((byte) 80, param0.getNamedFile("", "impound.zdl", false));
          var2.addLevelFile((byte) 72, param0.getNamedFile("", "mini_mart.zdl", false));
          var2.addLevelFile((byte) 114, param0.getNamedFile("", "Birdmaster1.zdl", false));
          var2.addLevelFile((byte) 94, param0.getNamedFile("", "Sken58_2.zdl", false));
          var2.addLevelFile((byte) 126, param0.getNamedFile("", "precinct42.zdl", false));
          var2.addLevelFile((byte) 125, param0.getNamedFile("", "sustained_alpha.zdl", false));
          var2.addLevelFile((byte) 121, param0.getNamedFile("", "Media_2.zdl", false));
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_a = new int[256];
        field_e = "Haze";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (1 & var0)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_a[var1] = var0;
        }
    }
}
