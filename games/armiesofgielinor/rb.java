/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb implements n {
    private long field_a;
    static String field_c;
    static ClientUiComponent field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -107 / ((param2 - 41) / 55);
          var3 = IconTextComponent.a(true, param0);
          if (param1.indexOf(param0) != -1) {
            return true;
          }
          if (param1.indexOf(var3) != -1) {
            return true;
          }
          stackIn_12_0 = (param1.startsWith(param0)) || (param1.startsWith(var3)) || (param1.endsWith(param0)) || (param1.endsWith(var3));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("rb.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract gu c(int param0);

    final static boolean canOpenQuickChatResponses(long accountId, String recipientName, int obfuscationGuard, int channelId, int[] responsePhraseIds) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -17231) {
            field_b = (ClientUiComponent) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (responsePhraseIds != null && (channelId != 2 ||
            FixedQuaternion.isOnlineFriendOrRoomMember(accountId, recipientName, (byte) -125))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("rb.I(").append(accountId).append(',');
          if (recipientName == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(',').append(channelId).append(',');
          if (responsePhraseIds == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static MapTile readTaggedMapTile(int recordBitLength, byte obfuscationGuard, CipherPacketBuffer packet) {
        MapTile var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        MapTile stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (recordBitLength == 0) {
            stackIn_2_0 = null;
            return (MapTile) (stackIn_2_0);
          }
          var3 = new MapTile();
          no.readTaggedFields(packet, var3, recordBitLength, -24721);
          var3.j(-78);
          var4 = -72 / ((-5 - obfuscationGuard) / 60);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("rb.G(").append(recordBitLength).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pu var4_ref_pu = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        pu var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ActionRequest.field_t = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = CampaignMenuButton.field_a.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_pu = CampaignMenuButton.field_a[var3];
            var4_ref_pu.a(-3831);
            CampaignMenuEntry.a((byte) -116, var3);
            var5 = var4_ref_pu.field_L + var4_ref_pu.field_p >> 1;
            var6 = var4_ref_pu.field_H + var4_ref_pu.field_P >> 1;
            var7 = var4_ref_pu.field_D + var4_ref_pu.field_J >> 1;
            var8 = ActionRequest.field_t[9] >> 2;
            var9 = ActionRequest.field_t[10] >> 2;
            var10_int = ActionRequest.field_t[11] >> 2;
            var11 = var8 * pd.field_a[3] + pd.field_a[4] * var9 + pd.field_a[5] * var10_int >> 14;
            var12 = var10_int * pd.field_a[8] + (var8 * pd.field_a[6] + var9 * pd.field_a[7]) >> 14;
            var13 = pd.field_a[10] * var9 + pd.field_a[9] * var8 + pd.field_a[11] * var10_int >> 14;
            var2[var3] = var11 * var5 + var12 * var6 + var7 * var13 >> 16;
          }
          var3Lifetime1 = ActionRequest.field_t[param0] >> 8;
          var4 = ActionRequest.field_t[10] >> 8;
          var5Lifetime1 = ActionRequest.field_t[11] >> 8;
          var6Lifetime1 = ib.field_j << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = SocketResourceClient.b(var6Lifetime1, 100) >> 8;
          var9Lifetime1 = ContextualRuntimeException.a(param0 - 10, var6Lifetime1) >> 8;
          if (AiPlanningStrategy.pointerX != -1 &&
            ko.pointerY != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = AiPlanningStrategy.pointerX - 320;
            var8Lifetime1 = -ko.pointerY + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1)));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1 + var14 * var14));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; CampaignMenuButton.field_a.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < CampaignMenuButton.field_a.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = CampaignMenuButton.field_a[var16];
            CampaignMenuEntry.a((byte) -116, var16);
            for (var18 = 0; var18 < 3; var18++) {
              pd.field_a[var18] = pd.field_a[var18] + CampaignParticipant.field_s[var15][var18];
            }
            ou.a(var17, true, true, false, false, pd.field_a, ActionRequest.field_t);
            IconLabelControl.a(var13Lifetime1, var17, var9Lifetime1, var8Lifetime1, var12Lifetime1, var7Lifetime1, var14, (byte) 120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "rb.C(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 <= 123) {
          return;
        }
        this.field_a = vi.monotonicMillis(99);
    }

    public final gu a(boolean param0) {
        if (param0) {
          return (gu) null;
        }
        if (this.b(81)) {
          return lq.field_c;
        }
        if (!((350L + this.field_a) <= vi.monotonicMillis(-96))) {
          return ad.field_K;
        }
        return this.c(118);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, IndexedSprite param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = (-param4 + param3 << 8) / param5.canvasWidth;
          var7 = var6_int * param5.offsetX + (param4 << 8);
          param2 = param2 + param5.offsetX;
          param0 = param0 + param5.offsetY;
          var8 = param2 + SoftwareRaster.width * param0;
          var9 = 0;
          var10 = param5.pixelHeight;
          var11 = param5.pixelWidth;
          var12 = SoftwareRaster.width - var11;
          if (param0 < SoftwareRaster.clipTop) {
            var14 = SoftwareRaster.clipTop - param0;
            param0 = SoftwareRaster.clipTop;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            var8 = var8 + SoftwareRaster.width * var14;
          }
          if (param1 != -1708086482) {
            rb.e(-63);
          }
          var13 = 0;
          if (param2 < SoftwareRaster.clipLeft) {
            var14Lifetime1 = SoftwareRaster.clipLeft - param2;
            var9 = var9 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            param2 = SoftwareRaster.clipLeft;
            var13 = var13 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (SoftwareRaster.clipBottom < var10 + param0) {
            var10 = var10 - (param0 + var10 - SoftwareRaster.clipBottom);
          }
          if (SoftwareRaster.clipRight < var11 + param2) {
            var14Lifetime2 = -SoftwareRaster.clipRight + param2 + var11;
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            for (param0 = -var10; param0 < 0; param0++) {
              var14Lifetime3 = var7;
              for (param2 = -var11; param2 < 0; param2++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = -var15 + 256;
                if (0 <= var15) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param5.palette[param5.pixelIndices[incrementValue$0] & 255];
                  if (0 != var17) {
                    if (255 < var15) {
                      SoftwareRaster.pixels[var8] = var17;
                    } else {
                      var18 = SoftwareRaster.pixels[var8];
                      var19 = (var17 & 16711935) * var15 + (16711935 & var18) * var16 >> 8 & 16711935;
                      SoftwareRaster.pixels[var8] = var19 + rn.a(65280, rn.a(var17, 65280) * var15 + rn.a(var18, 65280) * var16 >> 8);
                    }
                  }
                  var8++;
                } else {
                  var8++;
                  var9++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("rb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            field_b = (ClientUiComponent) null;
          }
          stackIn_5_0 = ((param1[param0 >> 5] & 1 << (param0 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    public final String a(byte param0) {
        if (this.b(88)) {
          return null;
        }
        if (vi.monotonicMillis(65) < (350L + this.field_a)) {
          return null;
        }
        if (param0 != 55) {
          this.field_a = -82L;
        }
        return this.b((byte) -71);
    }

    public static void d(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 65280) {
          field_c = (String) null;
        }
    }

    abstract String b(byte param0);

    static {
        field_c = "This <%0> is currently wielding the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
    }
}
