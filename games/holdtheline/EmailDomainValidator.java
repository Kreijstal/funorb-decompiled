/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class EmailDomainValidator {
    static SpriteAsset field_d;
    static String field_c;
    static int field_b;
    static int[] field_f;
    static Sprite[] field_a;
    static byte[][] field_e;

    final static String formatCookieDate(int param0, long param1) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ArchiveIndex.field_f.setTime(new Date(param1));
        int var3 = ArchiveIndex.field_f.get(7);
        int var4 = ArchiveIndex.field_f.get(5);
        int var5 = ArchiveIndex.field_f.get(2);
        int var6 = ArchiveIndex.field_f.get(1);
        if (param0 > 43) {
          var7 = ArchiveIndex.field_f.get(11);
          var8 = ArchiveIndex.field_f.get(12);
          var9 = ArchiveIndex.field_f.get(13);
          return IntrusiveDequeCursor.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + PathWaypoint.field_n[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    final static void resetPlayerProgress(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        try {
          RoadControlPathBuilder.field_c = new int[4][];
          AccountProtocolContext.field_c = new int[4];
          QuickChatPhraseDefinition.field_v = new int[4][];
          BoundaryIntersection.field_j = new int[4][];
          for (var1_int = 0; var1_int < 4; var1_int++) {
            var2 = MenuList.field_l[var1_int];
            array$0 = new int[var2];
            RoadControlPathBuilder.field_c[var1_int] = array$0;
            array$1 = new int[var2];
            QuickChatPhraseDefinition.field_v[var1_int] = array$1;
            array$2 = new int[var2];
            BoundaryIntersection.field_j[var1_int] = array$2;
            for (var3 = 0; var2 > var3; var3++) {
              RoadControlPathBuilder.field_c[var1_int][var3] = -1;
              QuickChatPhraseDefinition.field_v[var1_int][var3] = -1;
              BoundaryIntersection.field_j[var1_int][var3] = 3;
            }
            AccountProtocolContext.field_c[var1_int] = -1;
          }
          BoundaryLoopClipper.field_b = 0;
          QuickChatPhraseDefinition.field_s = true;
          ReflectionCheckSupport.field_a = false;
          NameAvailabilityResult.field_e = true;
          if (param0 < 100) {
            field_a = (Sprite[]) null;
          }
          RoadControlPathBuilder.field_d = 0;
          ChatMessage.field_l = true;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "cd.F(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 == 1) {
          field_e = (byte[][]) null;
          return;
        }
        EmailDomainValidator.formatCookieDate(93, -81L);
        field_e = (byte[][]) null;
    }

    final static void logClientError(int param0, String param1) {
        System.out.println("Error: " + NineSlicePanel.replaceAllLiteral("\n", "%0a", param0 - 75, param1));
        if (param0 != 12) {
          EmailDomainValidator.resetPlayerProgress(-37);
        }
    }

    final static void drawSpriteHighlight(Sprite param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = -param7 + param2 + param8 + param0.offsetX;
        int var10 = param4 + (param0.offsetX + (param8 + param2));
        int var11 = param3 + param0.offsetY + (param0.height >> 1);
        SoftwareRasterizer.intersectClip(var9_int, 0, var10, var11 + param5);
        param0.drawAdditive(-1 + param8, -1 + param3, param6);
        param0.drawAdditive(param8 - 1, 1 + param3, param6);
        SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
        SoftwareRasterizer.intersectClip(var9_int + 1, 0, var10 + 1, param5 + var11);
        param0.drawAdditive(param8 + 1, param3 - 1, param6);
        param0.drawAdditive(1 + param8, param3 + 1, param6);
        SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
        var9_int = param8 + (param0.offsetX + param0.width) - (param2 + param4);
        var10 = -param2 + param8 + (param0.offsetX + param0.width) - param7;
        SoftwareRasterizer.intersectClip(var9_int, var11 - param5, var10, 480);
        if (param1 <= 111) {
          return;
        }
        try {
          param0.drawAdditive(-1 + param8, param3 - 1, param6);
          param0.drawAdditive(param8 - 1, 1 + param3, param6);
          SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
          SoftwareRasterizer.intersectClip(1 + var9_int, var11 - param5, 1 + var10, 480);
          param0.drawAdditive(param8 + 1, -1 + param3, param6);
          param0.drawAdditive(1 + param8, param3 + 1, param6);
          SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "cd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static float normalizedCourseProgress(TrackCurve[] param0, int param1, float param2) {
        RuntimeException var3 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = MusicCrossfadeStream.distanceAlongCurves((byte) 117, param2, param0) / OutlinedRoadStripRenderer.totalCurveLength(-1, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -0.11478078365325928f;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cd.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static InputValidationError validateEmailDomain(byte param0, String param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var7 = null;
        InputValidationError var8 = null;
        int var9 = 0;
        InputValidationError stackIn_4_0 = null;
        InputValidationError stackIn_7_0 = null;
        InputValidationError stackIn_11_0 = null;
        InputValidationError stackIn_17_0 = null;
        InputValidationError stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = ArchiveKeyRequest.field_k;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = Vector2i.field_h;
            return stackIn_7_0;
          }
          var3 = BlobWriteRequest.split(param1, (byte) -126, '.');
          if (var3.length < 2) {
            stackIn_11_0 = ArchiveKeyRequest.field_k;
            return stackIn_11_0;
          }
          var5 = -111 / ((param0 + 56) / 44);
          var4 = var3;
          for (var6 = 0; var4.length > var6; var6++) {
            var7 = var4[var6];
            var8 = LoginChoicePanel.validateEmailDomainLabel((byte) -102, var7);
            if (var8 != null) {
              stackIn_17_0 = var8;
              return stackIn_17_0;
            }
          }
          stackIn_20_0 = TexturedPolygonRenderer.validateTopLevelDomain(var3[-1 + var3.length], 124);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_c = "Click to add or remove AI racers";
        field_e = new byte[250][];
    }
}
