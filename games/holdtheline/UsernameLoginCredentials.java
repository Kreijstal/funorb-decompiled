/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameLoginCredentials extends LoginCredentials {
    private long encodedUsername;
    static IntrusiveDeque field_e;
    static ResourceArchive field_f;
    static String field_g;
    static RotatedSpriteAsset field_h;
    private String password;

    LoginCredentialType getType(boolean param0) {
        if (!param0) {
          return (LoginCredentialType) null;
        }
        return jh.field_d;
    }

    final static int a(byte param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Sprite var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          UrlPacketDownloader.field_i = UrlPacketDownloader.field_i + 65536;
          while (QuickChatPhraseDefinition.multiplyFixed16(BoundedRandomAccessFile.field_c, UrlPacketDownloader.field_i, (byte) -100) >= 65536) {
            AccountFormText.field_b = AccountFormText.field_b + 1;
            UrlPacketDownloader.field_i = UrlPacketDownloader.field_i - BoundedRandomAccessFile.field_c;
          }
          var2_int = -1;
          if (param0 != -86) {
            var6 = (Sprite) null;
            UsernameLoginCredentials.a((Sprite) null, 75, -15, -53, 82, 25);
          }
          if (TriangleMesh.field_y != null) {
            var2_int = TriangleMesh.field_y.length;
          } else {
            if (null != TextLineLayout.field_a) {
              var2_int = TextLineLayout.field_a.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (BoundedRandomAccessFile.field_f > hk.field_e) {
              hk.field_e = hk.field_e + 1;
              if (hk.field_e > BoundedRandomAccessFile.field_g && (null == TriangleMesh.field_y ||
                null == TriangleMesh.field_y[SpriteSheetAsset.field_e])) {
                hk.field_e = hk.field_e - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (BoundedRandomAccessFile.field_f <= hk.field_e &&
                  TriangleMesh.field_y[(1 + SpriteSheetAsset.field_e) % var2_int] == null) {
                  hk.field_e = hk.field_e - 1;
                }
              }
            }
            if (hk.field_e >= BoundedRandomAccessFile.field_f) {
              ProxySocketConnector.field_i = SpriteSheetAsset.field_e;
              hk.field_e = hk.field_e - BoundedRandomAccessFile.field_f;
              if (!DualNodeHashTable.field_e) {
                SpriteSheetAsset.field_e = SpriteSheetAsset.field_e - 1;
                if (SpriteSheetAsset.field_e < 0) {
                  SpriteSheetAsset.field_e = SpriteSheetAsset.field_e + var2_int;
                }
              } else {
                SpriteSheetAsset.field_e = SpriteSheetAsset.field_e + 1;
                if (SpriteSheetAsset.field_e >= var2_int) {
                  SpriteSheetAsset.field_e = SpriteSheetAsset.field_e - var2_int;
                }
              }
            }
            if (BoundedRandomAccessFile.field_g < hk.field_e) {
              DualNodeHashTable.field_e = true;
            }
          }
          if (null != nl.field_i) {
            var3 = -(nl.field_i.field_v / 2) + 357;
            var4 = 0;
            if (ValidationIndicator.field_J != 0 &&
              ValidatedTextField.field_U > var3 &&
              nl.field_i.field_y + var3 > ValidatedTextField.field_U) {
              if (-nl.field_i.field_s + 269 < TrackBoundary.field_x &&
                TrackBoundary.field_x < 269) {
                var4 = 1;
                hk.field_e = BoundedRandomAccessFile.field_f;
                DualNodeHashTable.field_e = false;
              }
              if (TrackBoundary.field_x > 586 &&
                TrackBoundary.field_x < nl.field_i.field_s + 586) {
                hk.field_e = BoundedRandomAccessFile.field_f;
                DualNodeHashTable.field_e = true;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              hk.field_e > BoundedRandomAccessFile.field_g &&
              rf.field_X > var3 &&
              rf.field_X < var3 + nl.field_i.field_y) {
              if (-nl.field_i.field_s + 269 < NodeHashTableIterator.field_g &&
                NodeHashTableIterator.field_g < 269) {
                hk.field_e = BoundedRandomAccessFile.field_g;
              }
              if (NodeHashTableIterator.field_g > 586 &&
                nl.field_i.field_s + 586 > NodeHashTableIterator.field_g) {
                hk.field_e = BoundedRandomAccessFile.field_g;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          DualLinkNode.field_k.a(PasswordValidator.a(116, ValidatedTextField.field_U, TrackBoundary.field_x), PasswordValidator.a(param0 + 203, rf.field_X, NodeHashTableIterator.field_g), 4);
          if (DualLinkNode.field_k.a(-1)) {
            if (0 == DualLinkNode.field_k.field_g) {
              stackIn_63_0 = 3;
              return stackIn_63_0;
            }
            if (1 == DualLinkNode.field_k.field_g) {
              stackIn_66_0 = 2;
              return stackIn_66_0;
            }
          }
          while (true) {
            if (!qh.c(-121)) {
              stackIn_83_0 = 0;
              return stackIn_83_0;
            }
            DualLinkNode.field_k.a((byte) -21, 0);
            if (DualLinkNode.field_k.a(-1)) {
              if (DualLinkNode.field_k.field_g == 0) {
                stackIn_73_0 = 3;
                return stackIn_73_0;
              }
              if (DualLinkNode.field_k.field_g == 1) {
                stackIn_77_0 = 1;
                return stackIn_77_0;
              }
            }
            if (DelayedServerPacket.field_n != 13) {
              continue;
            }
            break;
          }
          stackIn_81_0 = 1;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "pd.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static Boolean b(byte param0) {
        if (param0 != -29) {
          vk var2 = (vk) null;
          UsernameLoginCredentials.a((vk) null, true);
        }
        Boolean var1 = RoadSegment.field_u;
        RoadSegment.field_u = null;
        return var1;
    }

    final static boolean a(vk param0, boolean param1) {
        int var3_int = 0;
        int var5_int = 0;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        RotatedSpriteCache[] var3 = null;
        int[] var4 = null;
        Sprite[] var5 = null;
        Sprite[] var6 = null;
        Sprite var8 = null;
        int var9 = 0;
        int[] var10 = null;
        var9 = HoldTheLine.field_D;
        try {
          if (!RasterBuffer.a(param0, -65)) {
            return false;
          }
          var10 = RotatedSpriteAsset.field_g[param0.field_p];
          var2 = var10;
          for (var3_int = 0; var10.length > var3_int; var3_int++) {
            if (ge.field_c[var10[var3_int]].field_b.getRotatedSprites((byte) 41) == null) {
              return false;
            }
            if (ge.field_c[var10[var3_int]].field_z.getRotatedSprites((byte) -117) == null) {
              return false;
            }
          }
          if (!param1) {
            field_e = (IntrusiveDeque) null;
          }
          if (!mc.field_a[9].b((byte) 116)) {
            return false;
          }
          if (!mc.field_a[11].b((byte) 124)) {
            return false;
          }
          if (LoginCredentialType.a(16616, 0)) {
            var3 = wi.field_a.getRotatedSprites(16);
            if (var3 == null) {
              return false;
            }
            SpriteSheetAsset.field_d = new RotatedSpriteCache[4][var3.length];
            var4 = new int[]{16711680, 16776960, 33023, 16711935};
            for (var5_int = 0; var5_int < 4; var5_int++) {
              for (var6_int = 0; var3.length > var6_int; var6_int++) {
                SpriteSheetAsset.field_d[var5_int][var6_int] = var3[var6_int].recolorGrayscale(-4503, var4[var5_int]);
                SpriteSheetAsset.field_d[var5_int][var6_int].setScale(3072, false);
              }
            }
            var5 = tn.field_b.getSprites(180);
            if (var5 == null) {
              return false;
            }
            var6 = var5;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              var8.a();
            }
          }
          if (BufferedSocket.a(-74)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_45_0 = var2_ref;
          stackIn_45_1 = new StringBuilder().append("pd.G(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeToPacket(int param0, PacketBuffer param1) {
        try {
          param1.writeLong((byte) -84, this.encodedUsername);
          param1.writeBase38Name(param0 + param0, this.password);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "pd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 > -94) {
          return;
        }
        field_f = null;
        field_e = null;
        field_g = null;
        field_h = null;
    }

    final static void a(Sprite param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int var11Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          if (param4 == 1024) {
            TickClock.a(param5, param0, 109, param2, param3);
            return;
          }
          param3 = param3 - ((param4 - 1024) * param0.field_s >> 11);
          param2 = param2 - ((param4 - 1024) * param0.field_y >> 11);
          var6_int = param4 * param0.field_s >> 10;
          var7 = param4 * param0.field_y >> 10;
          var8 = 0;
          if (param3 < 0) {
            var6_int = var6_int + param3;
            var8 = var8 + (-param3 << 20) / param4;
            param3 = 0;
          }
          var9 = 0;
          if (0 > param2) {
            var7 = var7 + param2;
            var9 = var9 + (-param2 << 20) / param4;
            param2 = 0;
          }
          if (param3 + var6_int > 640) {
            var6_int = 640 - param3;
          }
          if (var7 + param2 > 480) {
            var7 = -param2 + 480;
          }
          var11 = 0;
          for (var12 = 0; var12 < var7; var12++) {
            var10 = (var12 + param2) * SoftwareRasterizer.field_j + param3;
            var11Lifetime1 = var8 + ((var9 >> 10) * param0.field_s << 10);
            for (var13 = 0; var6_int > var13; var13++) {
              if (param0.field_z[var11Lifetime1 >> 10] != 16777215) {
                if (param0.field_z[var11Lifetime1 >> 10] != 0) {
                  SoftwareRasterizer.field_b[var10] = param0.field_z[var11Lifetime1 >> 10];
                }
              } else {
                SoftwareRasterizer.field_b[var10] = param5;
              }
              var10++;
              var11Lifetime1 = var11Lifetime1 + 1048576 / param4;
            }
            var9 = var9 + 1048576 / param4;
          }
          if (param1 > -26) {
            field_h = (RotatedSpriteAsset) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("pd.F(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    UsernameLoginCredentials(long param0, String param1) {
        try {
          this.encodedUsername = param0;
          this.password = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new IntrusiveDeque();
        field_g = "One kill remaining.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int updateMembershipSlidesWithIntGuard(int param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Sprite var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          UrlPacketDownloader.field_i = UrlPacketDownloader.field_i + 65536;
          while (QuickChatPhraseDefinition.multiplyFixed16(BoundedRandomAccessFile.field_c, UrlPacketDownloader.field_i, (byte) -100) >= 65536) {
            AccountFormText.field_b = AccountFormText.field_b + 1;
            UrlPacketDownloader.field_i = UrlPacketDownloader.field_i - BoundedRandomAccessFile.field_c;
          }
          var2_int = -1;
          if (param0 != -86) {
            var6 = (Sprite) null;
            UsernameLoginCredentials.a((Sprite) null, 75, -15, -53, 82, 25);
          }
          if (TriangleMesh.field_y != null) {
            var2_int = TriangleMesh.field_y.length;
          } else {
            if (null != TextLineLayout.field_a) {
              var2_int = TextLineLayout.field_a.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (BoundedRandomAccessFile.field_f > hk.field_e) {
              hk.field_e = hk.field_e + 1;
              if (hk.field_e > BoundedRandomAccessFile.field_g && (null == TriangleMesh.field_y ||
                null == TriangleMesh.field_y[SpriteSheetAsset.field_e])) {
                hk.field_e = hk.field_e - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (BoundedRandomAccessFile.field_f <= hk.field_e &&
                  TriangleMesh.field_y[(1 + SpriteSheetAsset.field_e) % var2_int] == null) {
                  hk.field_e = hk.field_e - 1;
                }
              }
            }
            if (hk.field_e >= BoundedRandomAccessFile.field_f) {
              ProxySocketConnector.field_i = SpriteSheetAsset.field_e;
              hk.field_e = hk.field_e - BoundedRandomAccessFile.field_f;
              if (!DualNodeHashTable.field_e) {
                SpriteSheetAsset.field_e = SpriteSheetAsset.field_e - 1;
                if (SpriteSheetAsset.field_e < 0) {
                  SpriteSheetAsset.field_e = SpriteSheetAsset.field_e + var2_int;
                }
              } else {
                SpriteSheetAsset.field_e = SpriteSheetAsset.field_e + 1;
                if (SpriteSheetAsset.field_e >= var2_int) {
                  SpriteSheetAsset.field_e = SpriteSheetAsset.field_e - var2_int;
                }
              }
            }
            if (BoundedRandomAccessFile.field_g < hk.field_e) {
              DualNodeHashTable.field_e = true;
            }
          }
          if (null != nl.field_i) {
            var3 = -(nl.field_i.field_v / 2) + 357;
            var4 = 0;
            if (ValidationIndicator.field_J != 0 &&
              ValidatedTextField.field_U > var3 &&
              nl.field_i.field_y + var3 > ValidatedTextField.field_U) {
              if (-nl.field_i.field_s + 269 < TrackBoundary.field_x &&
                TrackBoundary.field_x < 269) {
                var4 = 1;
                hk.field_e = BoundedRandomAccessFile.field_f;
                DualNodeHashTable.field_e = false;
              }
              if (TrackBoundary.field_x > 586 &&
                TrackBoundary.field_x < nl.field_i.field_s + 586) {
                hk.field_e = BoundedRandomAccessFile.field_f;
                DualNodeHashTable.field_e = true;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              hk.field_e > BoundedRandomAccessFile.field_g &&
              rf.field_X > var3 &&
              rf.field_X < var3 + nl.field_i.field_y) {
              if (-nl.field_i.field_s + 269 < NodeHashTableIterator.field_g &&
                NodeHashTableIterator.field_g < 269) {
                hk.field_e = BoundedRandomAccessFile.field_g;
              }
              if (NodeHashTableIterator.field_g > 586 &&
                nl.field_i.field_s + 586 > NodeHashTableIterator.field_g) {
                hk.field_e = BoundedRandomAccessFile.field_g;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          DualLinkNode.field_k.a(PasswordValidator.a(116, ValidatedTextField.field_U, TrackBoundary.field_x), PasswordValidator.a(param0 + 203, rf.field_X, NodeHashTableIterator.field_g), 4);
          if (DualLinkNode.field_k.a(-1)) {
            if (0 == DualLinkNode.field_k.field_g) {
              stackIn_63_0 = 3;
              return stackIn_63_0;
            }
            if (1 == DualLinkNode.field_k.field_g) {
              stackIn_66_0 = 2;
              return stackIn_66_0;
            }
          }
          while (true) {
            if (!qh.c(-121)) {
              stackIn_83_0 = 0;
              return stackIn_83_0;
            }
            DualLinkNode.field_k.a((byte) -21, 0);
            if (DualLinkNode.field_k.a(-1)) {
              if (DualLinkNode.field_k.field_g == 0) {
                stackIn_73_0 = 3;
                return stackIn_73_0;
              }
              if (DualLinkNode.field_k.field_g == 1) {
                stackIn_77_0 = 1;
                return stackIn_77_0;
              }
            }
            if (DelayedServerPacket.field_n != 13) {
              continue;
            }
            break;
          }
          stackIn_81_0 = 1;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "pd.B(" + param0 + ',' + param1 + ')');
        }
    }
}
