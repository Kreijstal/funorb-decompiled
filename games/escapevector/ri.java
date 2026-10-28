/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_a;
    static PcmSample field_b;

    final static void a(int param0, int param1, byte param2) {
        bg.field_f = param1;
        ValidationIndicator.field_M = param0;
        if (param2 > -53) {
          ri.a(-74);
        }
    }

    final static StringBuilder a(int param0, char param1, StringBuilder param2, byte param3) {
        String stackIn_11_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var4_int = param2.length();
          param2.setLength(param0);
          if (param3 != 56) {
            ri.a(-23);
          }
          for (int var5 = var4_int; var5 < param0; var5++) {
            param2.setCharAt(var5, param1);
          }
          StringBuilder stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        field_a = null;
        if (guard >= -23) {
          field_b = (PcmSample) null;
        }
    }

    final static void a(byte param0) {
        int var12 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var14 = QuickChatDynamicCommand.incomingPackets;
          int var2 = var14.readUnsignedByte(0);
          if (param0 != 113) {
            field_b = (PcmSample) null;
          }
          RatingQuery var3 = (RatingQuery) (LegacyStyleNode.field_s.first(false));
          while (var3 != null) {
            if (var3.requestId != var2) {
              var3 = (RatingQuery) (LegacyStyleNode.field_s.next((byte) 70));
              continue;
            }
            break;
          }
          if (var3 == null) {
            nm.a(16);
            return;
          }
          int var4 = var14.readUnsignedByte(0);
          if (0 != var4) {
            int var5 = var3.rowCount;
            TextHotspotRegion.field_l[0] = ThreeSliceButtonPainter.field_r;
            for (int var6_int = 1; var4 > var6_int; var6_int++) {
              TextHotspotRegion.field_l[var6_int] = var14.readString(false);
            }
            wk.a(var4, param0 - 58, var5);
            for (int var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              DirectByteStorage.a(var14, 1238559653);
              if (var6_intLifetime1 != 0) {
                FullscreenFocusCanvas.a(1, CachedArchiveProvider.field_n, wk.field_d, PointCloudEffect.field_u, var6_intLifetime1, SocketJs5Transport.field_s);
              } else {
                FullscreenFocusCanvas.a(param0 - 112, CachedArchiveProvider.field_n, wk.field_d, PointCloudEffect.field_u, var6_intLifetime1, SocketJs5Transport.field_s);
              }
            }
            DynamicTerrainRenderer.rankRatingRows(var5, 0);
            String[][] var6 = new String[2][var5];
            int[][] var18 = new int[2][var5 * 4];
            int var8 = AccountTermsPanel.field_J;
            int var9 = 0;
            int var10 = 0;
            while (var8 > var9) {
              int var11 = LegacyStyleNode.field_q[var9];
              var6[0][var10] = TextHotspotRegion.field_l[var11];
              var18[0][var10 * 4] = DualLinkNode.field_k[var11];
              var18[0][1 + 4 * var10] = pc.field_c[var11];
              var18[0][var10 * 4 + 2] = RasterSnapshot.field_k[var11];
              var18[0][3 + var10 * 4] = AccountNoticeDialog.field_fb[var11];
              if (SeekerMine.a(TextHotspotRegion.field_l[var11], (byte) 123) &&
                AccountNoticeDialog.field_fb[var11] + pc.field_c[var11] + RasterSnapshot.field_k[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            int var9Lifetime1 = 0;
            int var13 = 0;
            int var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              int var11Lifetime1 = LegacyStyleNode.field_q[var9Lifetime1 + var5];
              var6[1][var13] = TextHotspotRegion.field_l[var11Lifetime1];
              var18[1][var13 * 4] = DualLinkNode.field_k[var11Lifetime1];
              var18[1][var13 * 4 + 1] = pc.field_c[var11Lifetime1];
              var18[1][var13 * 4 + 2] = RasterSnapshot.field_k[var11Lifetime1];
              var18[1][3 + var13 * 4] = AccountNoticeDialog.field_fb[var11Lifetime1];
              if (SeekerMine.a(TextHotspotRegion.field_l[var11Lifetime1], (byte) 117) &&
                0 == AccountNoticeDialog.field_fb[var11Lifetime1] + pc.field_c[var11Lifetime1] + RasterSnapshot.field_k[var11Lifetime1]) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.unlink((byte) -100);
            return;
          }
          var3.unlink((byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ri.E(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        if (null == IsaacRandom.field_d) {
          return;
        }
        Checkbox.detachCanvasInput(IsaacRandom.field_d, (byte) -59);
        IsaacRandom.field_d.a(NetworkGameClient.field_r, true);
        IsaacRandom.field_d = null;
        if (null != DirectByteStorage.field_n) {
          DirectByteStorage.field_n.restoreWindowedSize(param0 ^ -25123);
        }
        if (param0 != -25123) {
          field_a = (String) null;
        }
        SpriteDecodeSupport.field_d.requestFocus();
    }

    static {
        field_a = "Confirm Email:";
    }
}
