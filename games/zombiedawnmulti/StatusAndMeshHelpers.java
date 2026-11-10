/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatusAndMeshHelpers {
    static String field_g;
    static volatile int field_b;
    static IndexedSprite field_c;
    static String field_a;
    static volatile int field_f;
    static CipherPacketBuffer field_e;
    static String field_d;
    static String field_h;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
          return;
        }
        field_g = null;
        field_h = null;
    }

    final static TriangleMesh decodeMesh(CipherPacketBuffer param0, byte param1) {
        int var8 = 0;
        TriangleMesh stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        TriangleMesh var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = 76 / ((param1 + 22) / 54);
          var2_int = param0.readBits(8, 14862);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var4 = PhaseChangeEvent.readFlagBit(-128, param0) ? 1 : 0;
          var5 = PhaseChangeEvent.readFlagBit(-86, param0) ? 1 : 0;
          var6 = new TriangleMesh();
          var6.field_n = (short)param0.readBits(16, 14862);
          var6.field_k = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_k, param0, (byte) -104);
          var6.field_E = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_E, param0, (byte) -120);
          var6.field_v = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_v, param0, (byte) -122);
          var6.field_B = (short)param0.readBits(16, 14862);
          var6.field_y = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_y, param0, (byte) -128);
          var6.field_L = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_L, param0, (byte) -106);
          var6.field_H = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_H, param0, (byte) -119);
          if (var4 != 0) {
            var6.field_o = (short)param0.readBits(16, 14862);
            var6.field_A = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_A, param0, (byte) -108);
            var6.field_p = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_p, param0, (byte) -103);
            var6.field_b = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_b, param0, (byte) -119);
            var6.field_F = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_F, param0, (byte) -114);
            var6.field_K = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_K, param0, (byte) -103);
            var6.field_x = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_x, param0, (byte) -127);
          }
          if (var5 != 0) {
            param0.readBits(16, 14862);
            var6.field_M = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_M, param0, (byte) -117);
            var6.field_s = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_s, param0, (byte) -126);
            var6.field_g = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_g, param0, (byte) -128);
            var6.field_a = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_a, param0, (byte) -120);
            var6.field_J = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_J, param0, (byte) -116);
          }
          if (PhaseChangeEvent.readFlagBit(-99, param0)) {
            var6.field_c = BitPackedArrayHelpers.readBitPackedShorts(16, var6.field_c, param0, (byte) -100);
          }
          if (PhaseChangeEvent.readFlagBit(-92, param0)) {
            var6.field_z = PackedArrayHelpers.readPackedByteArray(param0, var6.field_z, (byte) -102, 16);
            var7 = 0;
            for (var8 = 0; var8 < var6.field_z.length; var8++) {
              if ((var6.field_z[var8] & 255) > var7) {
                var7 = 255 & var6.field_z[var8];
              }
            }
            if (var7 == 0) {
              var6.field_z = null;
            } else {
              var6.field_m = (byte)(var7 + 1);
            }
          }
          stackIn_21_0 = var6;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("s.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawNineSliceFrame(int param0, int param1, Sprite[] param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param2 == null) {
            return;
          }
          if (param5 > 0 &&
            param4 > 0) {
            if (null != param2[3]) {
              stackIn_9_0 = param2[3].fullWidth;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null == param2[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param2[5].fullWidth;
            }
            var7 = stackIn_12_0;
            if (null != param2[1]) {
              stackIn_15_0 = param2[1].field_u;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (param2[7] != null) {
              stackIn_18_0 = param2[7].field_u;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param3 + param5;
            var11 = param4 + param0;
            var12 = param3 + var6_int;
            var13 = var10 - var7;
            var14 = var8 + param0;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param3 + param5 * var6_int / (var7 + var6_int);
              var16 = param3 + param5 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            SoftwareRasterizer.saveClip(DualLinkNode.field_f);
            if (var18 > var19) {
              var19 = param0 + param4 * var8 / (var8 + var9);
              var18 = param0 + param4 * var8 / (var8 + var9);
            }
            if (null != param2[param1]) {
              SoftwareRasterizer.intersectClip(param3, param0, var16, var18);
              param2[0].drawTransparent(param3, param0);
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[2] != null) {
              SoftwareRasterizer.intersectClip(var17, param0, var10, var18);
              param2[2].drawTransparent(var13, param0);
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[6] != null) {
              SoftwareRasterizer.intersectClip(param3, var19, var16, var11);
              param2[6].drawTransparent(param3, var15);
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[8] != null) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              param2[8].drawTransparent(var13, var15);
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[1] != null &&
              param2[1].fullWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, param0, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].fullWidth) {
                param2[1].drawTransparent(var20, param0);
              }
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[7] != null &&
              0 != param2[7].fullWidth) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param2[7].fullWidth) {
                param2[7].drawTransparent(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (null != param2[3] &&
              param2[3].field_u != 0) {
              SoftwareRasterizer.intersectClip(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param2[3].field_u) {
                param2[3].drawTransparent(param3, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (param2[5] != null &&
              param2[5].field_u != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param2[5].field_u) {
                param2[5].drawTransparent(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            if (null != param2[4] &&
              param2[4].fullWidth != 0) {
              if (param2[4].field_u == 0) {
                return;
              }
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param2[4].field_u) {
                for (var21 = var12; var13 > var21; var21 = var21 + param2[4].fullWidth) {
                  param2[4].drawTransparent(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(DualLinkNode.field_f);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String getStatusMessage(byte param0) {
        if (BirthDateValidator.field_k == SceneObject.field_B) {
          return IntrusiveDequeCursor.field_j;
        }
        if (param0 != 32) {
          return (String) null;
        }
        if (BirthDateValidator.field_k == ProgressDialog.field_hb) {
          return StatSubmissionHelpers.field_a;
        }
        if (!AudioPumpThread.field_g.hasChanged(-107)) {
          return StatSubmissionHelpers.field_a;
        }
        return ReportAbuseDialog.field_Ib;
    }

    final static void ensureRankingArrays(int param0, byte param1, int param2) {
        int var3;
        if (ChatMessage.field_f == null ||
          !(ChatMessage.field_f.length >= param0)) {
          ChatMessage.field_f = new int[param0 * 2];
        }
        if (null == PasswordCheckHelpers.field_c ||
          !(PasswordCheckHelpers.field_c.length >= param0)) {
          PasswordCheckHelpers.field_c = new int[2 * param0];
        }
        if (null == DialogLayer.field_J ||
          !(param0 <= DialogLayer.field_J.length)) {
          DialogLayer.field_J = new int[2 * param0];
        }
        if (FriendListHelpers.field_p == null ||
          !(param0 <= FriendListHelpers.field_p.length)) {
          FriendListHelpers.field_p = new int[param0 * 2];
        }
        if (ContentTransitionDialog.field_ob == null ||
          !(ContentTransitionDialog.field_ob.length >= param0)) {
          ContentTransitionDialog.field_ob = new int[param0 * 2];
        }
        if (FrameCycleAnimation.field_f == null ||
          !(FrameCycleAnimation.field_f.length >= param0)) {
          FrameCycleAnimation.field_f = new int[param0 * 2];
        }
        if (GrowableIntList.field_c == null ||
          !(param0 + param2 <= GrowableIntList.field_c.length)) {
          GrowableIntList.field_c = new int[2 * (param2 + param0)];
        }
        if (LevelData.field_c == null ||
          !(LevelData.field_c.length >= param0)) {
          LevelData.field_c = new boolean[param0 * 2];
        }
        ClickMarker.field_n = 0;
        MusicPatchPcmStream.field_m = -2147483648;
        NodeHashTableIterator.field_d = -2147483648;
        var3 = -105 / ((param1 - 6) / 47);
        MusicPatchNode.field_j = 2147483647;
        ScrollBar.field_Ub = 2147483647;
    }

    static {
        field_b = 0;
        field_g = "Retry (<%0> Left)";
        field_d = "They may be nowhere near your zombies, but you'll still be able to reach them...";
        field_f = 0;
        field_h = "Loading extra data";
    }
}
