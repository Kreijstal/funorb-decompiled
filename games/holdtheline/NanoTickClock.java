/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoTickClock extends TickClock {
    static String field_o;
    private long field_f;
    static String[] field_j;
    private int field_g;
    static int field_d;
    private long field_h;
    private long field_m;
    static int field_i;
    static int field_e;
    private int field_k;
    private long[] field_l;
    static int[] field_n;

    final static GrowableObjectList removeShortBoundaryEdges(GrowableObjectList param0, byte param1) {
        int var4 = 0;
        Point2i var3 = null;
        TrackBoundary var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        GrowableObjectList var9 = null;
        GrowableObjectList stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 != -127) {
            NanoTickClock.createSolidSquareSprite(67, -35, -105);
          }
          var9 = new GrowableObjectList();
          var3 = ((BoundaryCurve) (param0.elements[-1 + param0.size])).getEndPoint(0);
          for (var4 = 0; var4 < param0.size; var4++) {
            var5 = (TrackBoundary) (param0.elements[var4]);
            var5.start.x = var3.x;
            var5.start.y = var3.y;
            var6 = -var5.start.x + var5.end.x;
            var7 = -var5.start.y + var5.end.y;
            if (4 <= var6 * var6 + var7 * var7) {
              var3 = var5.end;
              var9.add(var5, (byte) 6);
            }
          }
          stackIn_11_0 = var9;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("mk.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.awt.Frame enterFullscreen(int param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        java.awt.Frame stackIn_29_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        FullscreenDisplayMode[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        FullscreenDisplayMode[] var10 = null;
        PlatformTask var11 = null;
        var9 = HoldTheLine.field_D;
        try {
          if (!param4.isFullscreenSupported(true)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (0 == param2) {
            var10 = NetworkGameClient.listFullscreenDisplayModes(param4, (byte) 111);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (~param1 == ~var10[var8].width &&
                param3 == var10[var8].height && ((param5 == 0 ||
                param5 == var10[var8].refreshRate) &&
                (var7_int == 0 ||
                !(param2 >= var10[var8].bitDepth)))) {
                param2 = var10[var8].bitDepth;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          if (param0 != 2) {
            stackIn_29_0 = (java.awt.Frame) null;
            return stackIn_29_0;
          }
          var11 = param4.enterFullscreen(param5, param2, param3, param1, false);
          while (var11.field_d == 0) {
            SocketConnector.sleepMillis(10L, (byte) 45);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            return null;
          }
          if (var11.field_d != 2) {
            return var7;
          }
          RoadStripRenderer.a((byte) 102, param4, var7);
          stackIn_39_0 = null;
          return (java.awt.Frame) (stackIn_39_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("mk.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param5).append(')').toString());
        }
    }

    final int advanceTicks(long param0, int param1) {
        int var4;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        var4 = 61 % ((param1 - 27) / 36);
        if (this.field_h < this.field_f) {
          this.field_m = this.field_m + (-this.field_h + this.field_f);
          this.field_h = this.field_h + (-this.field_h + this.field_f);
          this.field_f = this.field_f + param0;
          return 1;
        }
        var5 = 0;
        do {
          this.field_f = this.field_f + param0;
          var5++;
        } while (var5 < 10 &&
          this.field_h > this.field_f);
        if (this.field_h > this.field_f) {
          this.field_f = this.field_h;
        }
        return var5;
    }

    final void reset(byte param0) {
        if (this.field_f > this.field_h) {
          this.field_h = this.field_h + (this.field_f - this.field_h);
        }
        int var2 = 57 % ((-67 - param0) / 36);
        this.field_m = 0L;
    }

    final static void c(int param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        NineSlicePanel stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSlicePanel var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          var1_int = BlobReadRequest.field_j;
          var2 = 0;
          if (WhirlpoolHasher.field_h == 2) {
            var3_long = -TutorialAction.field_g + bb.b(-1);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          if (param0 <= 98) {
            NanoTickClock.clearSharedReferences(false);
          }
          for (var3 = 0; var3 < ClientException.field_b.length; var3++) {
            var4 = cd.field_f[var3];
            if (var4 < 0) {
              var5 = DialWidget.field_I;
            } else {
              if (var4 == TextFieldRenderer.field_q.selectedIndex) {
                var5 = ge.field_b;
              } else {
                var5 = LoginCredentials.field_c;
              }
            }
            var6 = ClientException.field_b[var3];
            if (2 == WhirlpoolHasher.field_h &&
              var2 == 1) {
              if (qg.field_b.length < dg.field_b.length) {
                stackIn_19_0 = dg.field_b.length;
              } else {
                stackIn_19_0 = qg.field_b.length;
              }
              var7 = stackIn_19_0;
              if (DelayedServerPacket.field_j.length < pb.field_a.length) {
                stackIn_22_0 = pb.field_a.length;
              } else {
                stackIn_22_0 = DelayedServerPacket.field_j.length;
              }
              var8 = stackIn_22_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (-var7 + var3 + (-6 + qg.field_b.length) < 0) {
                  stackIn_28_0 = "";
                } else {
                  stackIn_28_0 = qg.field_b[-var7 + qg.field_b.length + var3 - 6];
                }
                var6 = stackIn_28_0;
              }
              if (var3 >= var7 + 7 &&
                var3 < var8 + 7 + var7) {
                if (DelayedServerPacket.field_j.length > -7 + var3 - var7) {
                  stackIn_34_0 = DelayedServerPacket.field_j[-7 + (var3 - var7)];
                } else {
                  stackIn_34_0 = "";
                }
                var6 = stackIn_34_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = var6;
            stackIn_40_1 = -113;
            stackIn_41_2 = !(var4 < 0);
            var7Lifetime1 = h.measureMenuTextWidthWithIntGuard(stackIn_40_0, stackIn_40_1, stackIn_41_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + field_i;
            if (0 <= var4) {
              if (var4 == TextFieldRenderer.field_q.selectedIndex) {
                stackIn_45_0 = PointLight.field_p;
              } else {
                stackIn_45_0 = Point2i.field_e;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + ContentTransitionDialog.field_bb;
              if (var9 != null) {
                var9.draw(var1_int, TickClock.field_b + (ZombiePedestrian.field_w << 1), -51, (DropTargetWidget.field_G << 1) + var7Lifetime1, -DropTargetWidget.field_G + var8Lifetime1);
              }
              var1_int = var1_int + ZombiePedestrian.field_w;
            }
            if (0 <= var4) {
              q.field_a.draw(var6, var8Lifetime1, var1_int + ClientTextResources.field_b, var5, -1);
              var1_int = var1_int + (TickClock.field_b + ZombiePedestrian.field_w + ContentTransitionDialog.field_bb);
            } else {
              CheckboxWidget.field_G.draw(var6, var8Lifetime1, var1_int + ViewportSizingController.field_i, var5, -1);
              var1_int = var1_int + CurvedRoadSegment.field_M;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "mk.B(" + param0 + ')');
        }
    }

    final static void drawPanelWithShadow(int param0, int param1, int param2, byte param3, int param4) {
        Sprite[] var5 = jc.field_h;
        Sprite var6 = ij.a(-8096, param0, var5, param1);
        param2 = param2 - (var6.height - param1 >> 1);
        param4 = param4 - (-param0 + var6.width >> 1);
        SoftwareRasterizer.fillRectangleAlpha(10 + param4, 10 + param2, var6.width, var6.height, 0, 128);
        if (param3 != -42) {
          return;
        }
        var6.draw(param4, param2);
    }

    final static void sendAchievementUnlock(int param0, int param1, AchievementUnlockRequest param2) {
        IsaacPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = IsaacPacketBuffer.field_p;
          var5.writeCipheredOpcode((byte) 33, param1);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(111, param0);
          var5.writeByte(111, param2.achievementId);
          var5.writeByte(111, param2.value);
          var5.writeInt((byte) -58, param2.field_l);
          var5.writeInt((byte) -58, param2.field_q);
          var5.writeInt((byte) -58, param2.field_k);
          var5.writeInt((byte) -58, param2.field_u);
          var5.appendCrc32(var4, (byte) 85);
          var5.backpatchByteLength(-268435456, var5.position - var4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void recolorGreenPixels(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          if (SoftwareRasterizer.clipLeft > param4) {
            param1 = param1 - (-param4 + SoftwareRasterizer.clipLeft);
            param4 = SoftwareRasterizer.clipLeft;
          }
          if (param4 + param1 > SoftwareRasterizer.clipRight) {
            param1 = -param4 + SoftwareRasterizer.clipRight;
          }
          if (SoftwareRasterizer.clipTop > param3) {
            param2 = param2 - (SoftwareRasterizer.clipTop - param3);
            param3 = SoftwareRasterizer.clipTop;
          }
          if (SoftwareRasterizer.clipBottom < param2 + param3) {
            param2 = SoftwareRasterizer.clipBottom - param3;
          }
          if (0 < param1 &&
            param2 > 0) {
            var6_int = SoftwareRasterizer.width * param3 + param4;
            var7 = -param1 + SoftwareRasterizer.width;
            if (param0 != 255) {
              return;
            }
            for (param3 = -param2; param3 < 0; param3++) {
              for (param4 = -param1; param4 < 0; param4++) {
                var8 = SoftwareRasterizer.pixels[var6_int];
                if (((var8 & 65280) >> 8) > param5 &&
                  (var8 & 65280) >> 8 >= (var8 & 16711680) >> 16) {
                  var9 = -60 + ((var8 & 16711680) >> 15);
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & -(var10 >> 5) + (var10 >> 1);
                  var11 = (255 & var8) >> 3;
                  SoftwareRasterizer.pixels[var6_int] = kc.a(kc.a(var10, var9 << 16), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var6), "mk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final long getSleepMillis(int param0) {
        this.field_h = this.field_h + this.sampleElapsedNanos(10);
        if (this.field_h < this.field_f) {
          return (-this.field_h + this.field_f) / 1000000L;
        }
        if (param0 > -25) {
          GrowableObjectList var3 = (GrowableObjectList) null;
          NanoTickClock.removeShortBoundaryEdges((GrowableObjectList) null, (byte) -102);
        }
        return 0L;
    }

    public static void clearSharedReferences(boolean param0) {
        field_j = null;
        if (!param0) {
          field_j = (String[]) null;
        }
        field_n = null;
        field_o = null;
    }

    private final long sampleElapsedNanos(int param0) {
        int var8 = 0;
        int var9 = HoldTheLine.field_D;
        if (param0 != 10) {
          field_e = 16;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_m + var2;
        this.field_m = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_l[this.field_k] = var4;
          this.field_k = (1 + this.field_k) % 10;
          if (1 > this.field_g) {
            this.field_g = this.field_g + 1;
          }
        }
        long var6 = 0L;
        for (var8 = 1; this.field_g >= var8; var8++) {
          var6 = var6 + this.field_l[(10 - var8 + this.field_k) % 10];
        }
        return var6 / (long)this.field_g;
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          DelayedServerPacket.field_k = false;
          if (param2 != -2698) {
            return;
          }
          SocialListEntry.field_nb = false;
          if (sb.field_c != null) {
            if (!sb.field_c.field_F) {
              return;
            }
            if (param0 == 8) {
              if (ArchiveCatalog.field_o) {
                param1 = Vector2i.field_j;
              } else {
                param1 = RaceWorld.field_Z;
              }
              param0 = 2;
              lh.field_a.a(param2 ^ 2795, RaceSetupMenu.field_v);
            }
            var3_int = 1;
            if (10 == param0) {
              var3_int = 0;
              MidiKeyUsage.a(17902);
            }
            if (var3_int != 0) {
              if (SocialListEntry.field_nb) {
                param1 = LoginCredentials.substituteIndexedTokens(fk.field_d, new String[]{param1}, true);
              }
              if (ResourceArchive.field_g) {
                param1 = DelegatingCanvas.field_g;
              }
              sb.field_c.a(true, param1, param0);
            }
            if (param0 != 256) {
              if (10 == param0) {
                return;
              }
              if (ArchiveCatalog.field_o) {
                return;
              }
              lh.field_a.j(param2 ^ -2692);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("mk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static Sprite createSolidSquareSprite(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = -105 / ((66 - param1) / 56);
        Sprite var7 = new Sprite(param2, param2);
        Sprite var3 = var7;
        for (var5 = 0; var3.pixels.length > var5; var5++) {
          var7.pixels[var5] = param0;
        }
        return var3;
    }

    NanoTickClock() {
        this.field_g = 1;
        this.field_f = 0L;
        this.field_h = 0L;
        this.field_m = 0L;
        this.field_k = 0;
        this.field_l = new long[10];
        this.field_h = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    final static void removeEntitySound(boolean param0, EntitySound param1) {
        if (null != param1.field_p) {
          ai.stopSoundPlayback((byte) -123, param1.field_p);
        }
        if (!param0) {
          return;
        }
        try {
          param1.unlink(0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_o = "Effects will stack, so holding one <col=1>red</col> and<br> two <col=1>blue</col> will give mines and a major shield.";
        field_e = 256;
        field_n = new int[4];
    }
}
