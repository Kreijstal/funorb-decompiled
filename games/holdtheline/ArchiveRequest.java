/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static int field_s;
    static ResourceArchive field_p;
    boolean field_q;
    static int field_r;
    static String field_o;
    volatile boolean field_u;
    boolean field_t;

    final static String[] splitTrimmedNonempty(byte param0, char param1, String param2) {
        int incrementValue$1 = 0;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        String[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          var9 = BlobWriteRequest.split(param2, (byte) -120, param1);
          var3 = var9;
          var6 = -65 % ((param0 + 68) / 35);
          var5 = 0;
          for (var4 = 0; var9.length > var4; var4++) {
            if (0 < var9[var4].trim().length()) {
              var5++;
            }
          }
          var7 = new String[var5];
          var5Lifetime1 = 0;
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var9.length) {
            if (0 < var9[var10].trim().length()) {
              incrementValue$1 = var5Lifetime1;
              var5Lifetime1++;
              var7[incrementValue$1] = var9[var10].trim();
            }
            var10++;
          }
          stackIn_14_0 = var7;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ca.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (null != RaceSetupMenu.field_D && (EmailValidationResult.field_d == null ||
          !ai.field_a.containsTrack(-54, EmailValidationResult.field_d))) {
          ResourceArchive.playMusicTrack(true, RaceSetupMenu.field_D, (byte) 69, 30);
          RaceSetupMenu.field_D = null;
          EmailValidationResult.field_d = null;
        }
        if (param0 != -11875) {
          field_s = -14;
        }
        ImageProducerRasterBuffer.serviceAudio(-1379);
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != -1010) {
          return;
        }
        field_p = null;
    }

    abstract int getProgress(int param0);

    abstract byte[] getData(int param0);

    final static boolean a(Point2i param0, int param1, Point2i param2, int param3, Vector2f param4, int param5, int param6) {
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        Vector2f var10 = null;
        Vector2f var11 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new Vector2f(param2, param0);
          var8 = param4.dot(var11, (byte) -10);
          if ((float)(-(param3 + param5)) > var8) {
            return false;
          }
          if ((float)(param5 + param3) < var8) {
            return false;
          }
          var9 = param4.cross(var11, true);
          if (param6 < 61) {
            var10 = (Vector2f) null;
            ArchiveRequest.a((Point2i) null, -92, (Point2i) null, -119, (Vector2f) null, 62, -87);
          }
          if (var9 < (float)(-(param3 + param1))) {
            return false;
          }
          if (!(var9 > (float)(param3 + param1))) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("ca.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static NameAvailabilityResult createNameSuggestionsResult(String[] args, byte param1) {
        NameAvailabilityResult var2 = null;
        RuntimeException var2_ref = null;
        NameAvailabilityResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new NameAvailabilityResult(false);
          var2.field_j = args;
          if (param1 <= 87) {
            field_p = (ResourceArchive) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ca.H(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ArchiveRequest() {
        this.field_u = true;
    }

    static {
        field_o = "Main Menu";
    }
}
