/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RenderedFootballer extends FootballerAgent {
    private boolean field_ab;
    private int field_W;
    private double field_H;
    int field_R;
    private boolean field_jb;
    private MeshData field_hb;
    static String field_lb;
    private boolean field_eb;
    private boolean field_db;
    private int field_ib;
    int field_ob;
    private boolean field_cb;
    static String field_S;
    int field_bb;
    static int[][][] field_fb;
    int field_U;
    AnimationPlayer field_mb;
    private int field_X;
    private ModelMesh field_gb;
    boolean field_nb;
    boolean field_E;
    private boolean field_V;
    private boolean field_T;
    int field_kb;
    static String field_Q;
    boolean field_Z;
    private boolean field_Y;

    final static CoverageBitmapFont a(ResourceArchive param0, int param1, String param2, ResourceArchive param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        CoverageBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.getGroupId(param4, -1);
          var6 = param3.getFileId((byte) -107, param2, var5_int);
          if (param1 != 10) {
            var7 = (String) null;
            RenderedFootballer.a((ResourceArchive) null, -21, (String) null, (ResourceArchive) null, (String) null);
          }
          stackIn_3_0 = TriangleMesh.a(var5_int, param3, param1 - 84, var6, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gm.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, UiLayoutNode param2, SquadSlotWidget param3) {
        PlayerStats stackIn_7_0;
        int stackIn_7_1;
        PlayerStats stackIn_7_2;
        int stackIn_7_3;
        boolean stackIn_8_4 = false;
        boolean stackIn_12_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ArgbSprite var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        var11 = Kickabout.field_G;
        try {
          if (param0 != -5186) {
            var12 = (String) null;
            RenderedFootballer.a((ResourceArchive) null, -89, (String) null, (ResourceArchive) null, (String) null);
          }
          SoftwareRasterizer.fillRoundedRectangleBlended(param2.field_F + 6, 26 + param2.field_T, -12 + param2.field_q, -32 + param2.field_mb, 10, 65793, 96);
          if (param3 != null) {
            stackIn_7_0 = param3.field_Eb;
            stackIn_7_1 = 0;
            stackIn_7_2 = param3.field_Eb;
            stackIn_7_3 = -107;
            stackIn_8_4 = !(TextFieldValidator.f(param0 ^ 5185));
            stackIn_12_2 = (((PlayerStats) (Object) stackIn_7_2).c((byte) stackIn_7_3, stackIn_8_4)) && (AccountRegistrationResponse.a((byte) 83));
            var4 = TriangleMesh.a(stackIn_7_0, stackIn_7_1, stackIn_12_2);
            var5 = param2.field_q + param2.field_F - 38;
            var6 = param2.field_T + 58;
            if (var4 == null) {
              ReceivedAuctionItemRow.a(var5, -128, var6);
            } else {
              ((Sprite) ((Object) var4)).c(var5 - (((Sprite) ((Object) var4)).field_o >> 1), var6 - (((Sprite) ((Object) var4)).field_v >> 1));
            }
            var7 = LocalizedTextLoader.formatCurrencyAmount(ImageProducerRasterBuffer.a(param3.field_Eb, true), 26300);
            var8 = Math.max(param2.field_F + 15, 66 + (param2.field_F - (IsSixCommand.field_C.a(var7) >> 1)));
            IsSixCommand.field_C.a(var7, var8, param2.field_T + 51, 16777215, -1);
            if (!param1) {
              var9 = BlobSubmission.field_l;
              var10 = Math.max(param2.field_F + 15, param2.field_F - (-66 + (IsSixCommand.field_C.a(var9) >> 1)));
              IsSixCommand.field_C.a(var9, var10, 73 + param2.field_T, 13369344, 65793);
            }
          } else {
            IsSixCommand.field_C.a(StrongCacheEntry.field_A, param2.field_F + 18, 40 + param2.field_T, param2.field_q - 36, param2.field_mb - 50, 11184810, -1, 1, 0, 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("gm.DB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void setFacingAngle(int param0, byte param1) {
        this.field_W = param0;
        param0 += 1700;
        if (param0 >= 2048) {
          param0 -= 2048;
        }
        if (param1 <= 39) {
          this.field_Y = false;
        }
        int[] var6 = !this.field_jb ? ParticipantStatus.field_f : OffscreenPlayerArrow.field_f;
        int[] var3 = var6;
        int var4 = var6[0] * TriangleRasterizer.field_o[param0] >> 16;
        int var5 = TriangleRasterizer.field_f[param0] * var6[0] >> 16;
        this.field_gb = this.field_hb.createModelMesh(var6[2], var6[3], var4, var6[1], var5);
    }

    final void setPosition(int param0, boolean param1, int param2, int param3) {
        this.positionX = param0;
        this.positionY = param3;
        this.height = param2;
        if (!param1) {
          this.field_bb = this.positionY;
          this.field_X = this.height;
          this.field_kb = this.positionX;
          return;
        }
    }

    final void renderModel(int param0, int param1, int param2, int param3, byte param4) {
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.setProjectionCenter(param2, param3);
        if (this.field_jb &&
          this.field_W != this.field_R) {
          this.setFacingAngle(this.field_R, (byte) 79);
        }
        ModelMesh var8 = (ModelMesh) (this.field_mb.applyCurrentFrame(this.field_gb, false, true, true));
        int var7 = this.field_R;
        if (this.field_V) {
          var7 = 2047 & var7 + 1024;
        }
        if (this.megamode &&
          this.action == 4) {
          var7 = this.actionTime * (2048 / BuyPitchDialog.field_I[4]) + var7 & 2047;
        }
        var8.a(0, var7, 0, param1, 0, 0, 0, param0);
        if (param4 >= -63) {
          this.d(true);
        }
    }

    private final void drawPlayerLabel(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        var8 = Kickabout.field_G;
        if (null == MachineTokenStorageSupport.field_e) {
          return;
        }
        if (param0 != 109) {
          var9 = (String) null;
          RenderedFootballer.a((String) null, true, (byte) -48);
        }
        if (FormationMaskSupport.field_c == 0) {
          var2 = 74;
        } else {
          var2 = (FormationMaskSupport.field_c != 1) ? 62 : 68;
        }
        var2 = var2 + ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(127, 2, MidiPcmStream.field_l);
        var3 = NotCommand.h(-2521);
        var4 = IsaacRandom.a(true);
        if (512 > Math.abs((this.positionX >> 16) - var3) &&
          Math.abs(-var4 + (this.positionY >> 16)) < 512) {
          var5 = LocalizedTextLoader.approximateHypotenuse(-var3 + (this.positionX >> 16), true, (this.positionY >> 16) - var4);
          var6 = -var5 + 512 >> 3;
          if (var6 < 16) {
            var6 = 0;
          }
          if (var6 > 36) {
            var6 = 36;
          }
          var7 = 128 + ((this.positionX >> 16) - var3);
          if (var7 < 0) {
            var7 = 0;
          }
          if (FormationMaskSupport.field_c == 0) {
            var6 -= 20;
          }
          if (256 < var7) {
            var7 = 256;
          }
          if (FormationMaskSupport.field_c == 1) {
            var6 -= 8;
          }
          if (FormationMaskSupport.field_c == 2) {
            var6 += 10;
          }
          LobbyPlayerRow.a(var7, false, 240, ConsoleCommand.field_t + var6, var2);
        }
        this.field_ib = 20;
        return;
    }

    final void d(boolean param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        int var9_int = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String[] var8_ref_String__;
        int var8;
        String[] var9_ref_String__;
        StringBuilder var10;
        StringBuilder var11_ref_StringBuilder;
        int var12;
        int var13;
        Sprite var14;
        BinaryBitmapFont var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_1 = false;
        double var9;
        double var11;
        int var17Lifetime1;
        var21 = Kickabout.field_G;
        var2 = 1900;
        var3 = SocialListLayoutSupport.worldToScreenX(0, this.getRenderedX(1606384336));
        var4 = IntKeyLookup.a((byte) -119, this.h(1000));
        var5 = InstrumentNoteMask.field_i * 40 >> 8;
        var6 = InstrumentNoteMask.field_i * 70 >> 8;
        var7 = InstrumentNoteMask.field_i * 10 >> 8;
        if (FadingSoundSupport.field_d &&
          this.stats.archetype != 4) {
          var8_ref_String__ = new String[]{"action:", "action_time:", "dash_delay"};
          var9_ref_String__ = new String[]{Integer.toString(this.action), Integer.toString(this.actionTime), Integer.toString(this.dashCooldown)};
          var10 = new StringBuilder("(");
          GameResourceLoader.a(this.positionX, 100, var10);
          discarded$6 = var10.append(", ");
          GameResourceLoader.a(this.positionY, 100, var10);
          discarded$7 = var10.append(", ");
          GameResourceLoader.a(this.height, 100, var10);
          discarded$8 = var10.append(')');
          var11_ref_StringBuilder = new StringBuilder("(");
          GameResourceLoader.a(this.field_kb, 100, var11_ref_StringBuilder);
          discarded$9 = var11_ref_StringBuilder.append(", ");
          GameResourceLoader.a(this.field_bb, 100, var11_ref_StringBuilder);
          discarded$10 = var11_ref_StringBuilder.append(", ");
          GameResourceLoader.a(this.field_X, 100, var11_ref_StringBuilder);
          discarded$11 = var11_ref_StringBuilder.append(')');
          var12 = this.stats.getWidth(0);
          var13 = this.stats.getHeight(15);
          var14 = new Sprite(var12, 10 * var8_ref_String__.length + 5 + var13 + 20);
          PacketBuffer.a(-64, var14);
          this.stats.drawCentered(var13 >> 1, 23, var12 >> 1);
          var15 = ConsoleTokenCursor.field_d;
          var16 = var13 + 11;
          for (var17 = 0; var8_ref_String__.length > var17; var17++) {
            var15.c(var8_ref_String__[var17], 10 + (var12 >> 1), var16, 16777215, -1);
            var15.a(var9_ref_String__[var17], (var12 >> 1) + 15, var16, 16777215, -1);
            var16 += 10;
          }
          var16 += 2;
          var15.a(var10.toString(), 20, var16, 16777215, -1);
          var16 += 10;
          var15.a(var11_ref_StringBuilder.toString(), 20, var16, 16777215, -1);
          TeamManagementScreen.e(125);
          var17Lifetime1 = var14.field_o * InstrumentNoteMask.field_i >> 8;
          var18 = InstrumentNoteMask.field_i * var14.field_v >> 8;
          var19 = -(var17Lifetime1 >> 1) + var3;
          var20 = 10 + var4;
          SoftwareRasterizer.fillRoundedRectangleBlended(var19 - 5, -5 + var20, var17Lifetime1 + 10, var18 + 10, 5, 65793, 200);
          var14.drawScaledAveraged(var19, var20, var17Lifetime1, var18);
        }
        if (var3 + var5 < 0) {
          return;
        }
        if (var4 + var7 < 0) {
          return;
        }
        if (var3 - var5 > 640) {
          return;
        }
        if (-var6 + var4 > 480) {
          return;
        }
        var8 = 300;
        if (this.archetype == 4 &&
          15 == this.field_ob) {
          stackIn_18_0 = FaceNormal.field_c;
          stackIn_19_1 = (this.pixelY(true) >= 672) ? false : true;
          if (stackIn_18_0 ^ stackIn_19_1) {
            var8 = 220;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.megamode && (1 == SocketArchiveNetworkClient.field_v ||
          this.field_ab ||
          this.field_T)) {
          PacketBuffer.a(-88, AvailabilityCheckRequest.field_f);
          SoftwareRasterizer.clearFramebuffer();
          var2 = (var2 << 7) / InstrumentNoteMask.field_i;
          this.renderModel(var2, var8, 128, 190, (byte) -91);
          TeamManagementScreen.e(119);
          if (this.field_T) {
            SoftwareDrawingSupport.a(AvailabilityCheckRequest.field_f, -16777215);
            SoftwareDrawingSupport.a(AvailabilityCheckRequest.field_f, -16777214);
            SoftwareDrawingSupport.a(AvailabilityCheckRequest.field_f, -16777215);
            SoftwareDrawingSupport.a(AvailabilityCheckRequest.field_f, -16777214);
            SoftwareDrawingSupport.a(AvailabilityCheckRequest.field_f, -16777215);
            for (var9_int = 0; AvailabilityCheckRequest.field_f.field_y.length > var9_int; var9_int++) {
              if (AvailabilityCheckRequest.field_f.field_y[var9_int] > 0) {
                AvailabilityCheckRequest.field_f.field_y[var9_int] = 0;
              }
            }
          }
          if (this.field_ab) {
            var9 = (double)(MonotonicClock.monotonicMillis(95) % 1000L) / 1000.0;
            var11 = (double)(MonotonicClock.monotonicMillis(35) % 300L) / 300.0;
            SpritePixelSupport.adjustSpriteHsv(AvailabilityCheckRequest.field_f, var9, 1.0, var11 + 1.0);
          }
          AvailabilityCheckRequest.field_f.drawHalfSize(-64 + var3, -95 + var4);
          decompiledFrameRemainder0 = false;
        }
        else {
          var2 = (var2 << 8) / InstrumentNoteMask.field_i;
          if (this.megamode) {
            var2 = var2 >> 1;
          }
          this.renderModel(var2, var8, var3, var4, (byte) -75);
        }
        if (param0) {
          this.field_nb = true;
        }
    }

    RenderedFootballer(MeshData param0, int param1, boolean param2, FootballerAgent param3) {
        this(param0, param1, param2);
        try {
          this.applyPlayerStats(param3.member, param3.stats, 3);
          this.a(param3, false);
          this.setPosition(this.positionX, false, this.height, this.positionY);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderedX(int param0) {
        if (param0 != 1606384336) {
          return -3;
        }
        return this.field_kb >> 16;
    }

    final static FadingChatMessage a(String param0, boolean param1, byte param2) {
        FadingChatMessage var3 = null;
        RuntimeException var3_ref = null;
        FadingChatMessage stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new FadingChatMessage(param0, param1);
          if (SplashScreen.field_j < 18) {
            AppScreen.field_d.addLast(var3, 3);
          } else {
            MatchingTextValidator.a(var3, false);
          }
          if (param2 > -103) {
            field_Q = (String) null;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("gm.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void stepMovement(int param0, PlayArea[] param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 2) {
            this.field_W = -115;
          }
          var5_int = this.positionX;
          var6 = this.positionY;
          var7 = this.height;
          super.stepMovement(param0 + 0, param1, param2, param3);
          if (!this.field_E) {
            this.field_bb = this.positionY;
            this.field_kb = this.positionX;
            this.field_X = this.height;
            return;
          }
          this.field_bb = this.field_bb + (-var6 + this.positionY);
          this.field_X = this.field_X + (this.height - var7);
          this.field_kb = this.field_kb + (-var5_int + this.positionX);
          if (this.field_Z) {
            this.field_bb = this.positionY + 3 * this.field_bb >> 2;
            this.field_X = this.field_X * 3 + this.height >> 2;
            this.field_kb = this.positionX + this.field_kb * 3 >> 2;
            var8 = -this.positionX + this.field_kb >> 16;
            var9 = this.field_bb - this.positionY >> 16;
            var10 = -this.height + this.field_X >> 16;
            var11 = var9 * var9 + var8 * var8 + var10 * var10;
            if (var11 > 2) {
              return;
            }
            this.field_Z = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("gm.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void updateAnimationFlags(boolean param0, boolean param1, int param2) {
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_12_1 = false;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_92_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        double var8;
        int var10;
        int var11;
        int var12;
        int var6Lifetime1;
        int var7Lifetime1;
        int var10Lifetime1;
        var12 = Kickabout.field_G;
        stackIn_3_1 = (0 != (2 & param2));
        this.field_ab = stackIn_3_1;
        stackIn_6_1 = ((param2 & 1) != 0);
        this.field_T = stackIn_6_1;
        stackIn_9_1 = (0 != (param2 & 8));
        this.field_eb = stackIn_9_1;
        stackIn_12_1 = ((4 & param2) != 0);
        this.field_V = stackIn_12_1;
        var4 = param1 ? 1 : 0;
        var5 = 0;
        if (this.action == 5 ||
          this.action == 6) {
          stackIn_18_0 = (this.pixelY(true) >= 672) ? 0 : 1;
          var6 = stackIn_18_0;
          stackIn_20_0 = var6;
          if ((this.directionMask & 2) == 0) {
            stackIn_21_1 = 0;
          } else {
            stackIn_21_1 = 1;
          }
          var4 = stackIn_20_0 ^ stackIn_21_1;
          stackIn_23_0 = var6;
          if (this.directionX != -1) {
            stackIn_24_1 = 0;
          } else {
            stackIn_24_1 = 1;
          }
          stackIn_27_0 = ((stackIn_23_0 ^ stackIn_24_1) != 0) ? 512 : -512;
          var5 = stackIn_27_0;
        }
        var6Lifetime1 = (2048 + (var5 + this.computeFacingAngle((byte) 117))) % 2048;
        if (FaceNormal.field_c) {
          var6Lifetime1 += 1024;
          if (var6Lifetime1 >= 2048) {
            var6Lifetime1 -= 2048;
          }
        }
        if (this.field_R != var6Lifetime1) {
          stackIn_35_0 = (1024 >= (var6Lifetime1 - (this.field_R - 2048)) % 2048) ? 0 : 1;
          var7 = stackIn_35_0;
          if (var7 != 0) {
            this.field_R = this.field_R - 64;
          } else {
            this.field_R = this.field_R + 64;
          }
          if (this.field_R >= 2048) {
            this.field_R = this.field_R - 2048;
          }
          if (this.field_R < 0) {
            this.field_R = this.field_R + 2048;
          }
          var8_int = Math.abs(-this.field_R + var6Lifetime1);
          if (var8_int > 1024) {
            var8_int = -var8_int + 2048;
          }
          if (var8_int <= 32) {
            this.field_R = var6Lifetime1;
          }
        }
        var7Lifetime1 = 3;
        var8 = 1.0;
        if (this.e(292603688)) {
          var7Lifetime1 = 5;
          if (this.field_eb) {
            var7Lifetime1 = 16;
          }
          this.field_ib = (int)((double)this.field_ib - var8);
          if (this.action == 4) {
            this.field_ib = this.field_ib - 3;
          }
        }
        if (this.field_ib < 0) {
          this.drawPlayerLabel((byte) 109);
        }
        if (14 == this.action) {
          var8 = 1.5;
          var7Lifetime1 = 15;
        }
        if (this.action == 2 &&
          this.field_R == var6Lifetime1) {
          var7Lifetime1 = 4;
        }
        if (this.action != 3 &&
          this.action != 12) {
          this.field_db = false;
        } else {
          var7Lifetime1 = 0;
          if (!this.field_db) {
            if (FormationMaskSupport.field_c != 0) {
              if (FormationMaskSupport.field_c == 1) {
                var10 = 82;
              } else {
                var10 = 80;
              }
            } else {
              var10 = 84;
            }
            ShopPlayerSlot.c(var10, -121);
            this.field_db = true;
          }
        }
        if (this.action == 13) {
          var8 = 0.38;
          var7Lifetime1 = 8;
        }
        if (10 == this.action) {
          var7Lifetime1 = 6;
          var8 = 2.0;
          if (this.actionTime > BuyPitchDialog.field_I[10]) {
            var7Lifetime1 = 7;
          }
        }
        if (5 == this.action) {
          stackIn_86_0 = (var4 == 0) ? 14 : 12;
          var7Lifetime1 = stackIn_86_0;
        }
        if (this.action == 6) {
          var8 = 0.7;
          stackIn_92_0 = (var4 != 0) ? 11 : 13;
          var7Lifetime1 = stackIn_92_0;
        }
        if (this.action == 9) {
          var7Lifetime1 = 2;
        }
        if (this.action != 7) {
          this.field_Y = false;
        } else {
          if (!this.field_Y &&
            49 > this.actionTime) {
            var10Lifetime1 = -1;
            var11 = -1;
            if (FormationMaskSupport.field_c == 0) {
              var11 = 88;
              var10Lifetime1 = 85;
            } else {
              if (FormationMaskSupport.field_c != 1) {
                if (FormationMaskSupport.field_c == 2) {
                  var10Lifetime1 = 81;
                  var11 = 86;
                }
              } else {
                var11 = 87;
                var10Lifetime1 = 83;
              }
            }
            if (var10Lifetime1 != -1) {
              ShopPlayerSlot.c(var10Lifetime1, -3);
            }
            if (-1 != var11) {
              ShopPlayerSlot.c(var11, 11);
            }
            this.field_Y = true;
          }
          var7Lifetime1 = 1;
        }
        if (this.action == 8) {
          var7Lifetime1 = 2;
          var8 = 0.0;
        }
        if (this.action == 11 &&
          this.e(292603688) &&
          param0) {
          var7Lifetime1 = 9;
        }
        if (this.action == 4) {
          var8 = 2.0;
        }
        if (this.action == 1 &&
          this.e(292603688)) {
          var8 = (!this.stats.c(this.member, (byte) -62)) ? 0.25 : 0.5;
        }
        if (!this.field_nb) {
          this.setAnimationClip((byte) -128, var7Lifetime1);
        }
        if (this.megamode) {
          if (7 == this.action &&
            this.actionTime == 1) {
            TrinketIcon.b(-5, 10);
          }
          var8 = var8 / 2.0;
          if (4 == this.action) {
            var8 = var8 * 2.0;
          }
        }
        if (!this.field_cb) {
          this.field_H = this.field_H + var8;
          while (this.field_H >= 1.0) {
            this.field_mb.a(127);
            this.field_H = this.field_H - 1.0;
          }
          if (!this.field_nb) {
            if (this.field_ob == 4 &&
              this.actionTime < 20) {
              this.field_mb.a(-1 + this.field_mb.a(true), 103);
            }
            if (0 == this.field_ob &&
              this.field_mb.field_b > 9) {
              this.field_mb.a(9, 98);
            }
            if (this.field_ob == 6 &&
              30 < this.actionTime) {
              this.field_mb.a(0, 109);
            }
            if (this.field_ob == 15 &&
              !this.e(292603688)) {
              this.field_mb.a(0, 124);
            }
          }
        }
        if (this.action == 4 &&
          this.stats.c(this.member, -94) &&
          this.actionTime % 2 == 0) {
          PanelSpriteFactory.captureFootballer(100, this, 109);
        }
        if (3 == this.action &&
          this.stats.a((byte) 44, this.member) &&
          this.actionTime % 2 == 0) {
          PanelSpriteFactory.captureFootballer(60, this, 104);
        }
    }

    final void setAnimationClip(byte param0, int param1) {
        if (param0 >= -127) {
          this.field_ab = true;
        }
        if (param1 == this.field_ob) {
          return;
        }
        this.field_ob = param1;
        this.field_mb.a(HelpTipDialog.field_I[this.field_U][this.field_ob], (byte) -107);
    }

    private final int computeFacingAngle(byte param0) {
        int var2;
        int stackIn_20_0 = 0;
        if ((this.action == 13 ||
          this.action == 3 ||
          this.action == 10 ||
          this.action == 12) &&
          (this.field_s ||
          !this.stats.a((byte) 44, this.member))) {
          return (PlayerContextMenu.b(this.field_m >> 8, this.field_k >> 8, (byte) 2) + 6144) % 8192 >> 2;
        }
        var2 = -68 / ((param0 + 17) / 51);
        if (this.directionX < 0) {
          if (this.directionY == -1) {
            return 768;
          }
          if (this.directionY == 1) {
            return 256;
          }
          return 512;
        }
        if (this.directionX <= 0) {
          stackIn_20_0 = (this.directionY < 0) ? 1024 : 0;
          return stackIn_20_0;
        }
        if (this.directionY == -1) {
          return 1280;
        }
        if (this.directionY == 1) {
          return 1792;
        }
        return 1536;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, boolean param9, boolean param10, boolean param11, int param12, int param13) {
        UrlRequest.field_e = null;
        NetworkGameClient.b(true);
        param11 = UiInputRoutingSupport.routePointerInput(param4, 50, param5, param11, param13, param12, param1);
        MatchTransitionScreen.a(false, param7, param9, param8, param10, param6, param5, param11, param3, param2);
        StringCursor.a(param9, false, param8);
        if (param0 >= -42) {
          field_S = (String) null;
        }
        DemoIntegersCommand.a(param11, param8, param13, -103);
    }

    final void resetPose(byte param0) {
        this.updateAnimationFlags(false, false, 0);
        if (param0 < 124) {
          PlayArea[] var3 = (PlayArea[]) null;
          this.stepMovement(-73, (PlayArea[]) null, false, true);
        }
    }

    final void setModel(MeshData param0, byte param1) {
        try {
          this.field_hb = param0;
          if (param1 >= -80) {
            this.field_R = -35;
          }
          this.setFacingAngle(this.field_W, (byte) 68);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gm.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(int param0) {
        int var4 = 0;
        int var2 = this.field_bb >> 16;
        int var3 = this.field_X >> 16;
        if (var3 > 0) {
          if (1000 <= var3) {
            var3 = 999;
          }
          var4 = var3 * param0 / (-var3 + 1000);
          return FaceNormal.field_c ? var2 + var4 : var2 - var4;
        }
        return var2;
    }

    public static void i(byte param0) {
        field_fb = (int[][][]) null;
        field_Q = null;
        field_lb = null;
        if (param0 < 13) {
          field_fb = (int[][][]) null;
        }
        field_S = null;
    }

    final void a(MatchAgent param0, int param1, int param2, int param3) {
        FootballerAgent var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param3 <= 38) {
            return;
          }
          var5 = (FootballerAgent) (param0);
          if (this.a(-93, var5, param2, param1)) {
            return;
          }
          this.a(param0, false);
          if (!this.field_Z) {
            var6 = this.field_kb - this.positionX >> 16;
            var7 = this.field_bb - this.positionY >> 16;
            var8 = -this.height + this.field_X >> 16;
            var9 = var8 * var8 + (var6 * var6 + var7 * var7);
            if (var9 > ModelMaterialDecoder.field_c) {
              this.field_Z = true;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("gm.LA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void i(int param0) {
        int var2 = 0;
        ButtonMenuScreen[] var1 = null;
        ButtonMenuScreen var3 = null;
        int var4 = 0;
        ButtonMenuScreen[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Kickabout.field_G;
        try {
          var5 = ByteArrayPool.field_b;
          var1 = var5;
          for (var2 = param0; var5.length > var2; var2++) {
            var3 = var5[var2];
            var3.restoreDefaultButtons((byte) -112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "gm.CA(" + param0 + ')');
        }
    }

    RenderedFootballer(MeshData param0, int param1, boolean param2) {
        this.field_H = 0.0;
        this.field_ab = false;
        this.field_eb = false;
        this.field_db = false;
        this.field_cb = false;
        this.field_nb = false;
        this.field_E = true;
        this.field_ib = 0;
        this.field_T = false;
        this.field_V = false;
        this.field_Y = false;
        try {
          this.field_jb = param2 ? true : false;
          if (!param2) {
            param0.field_o = DualLinkNode.field_j;
          }
          this.field_U = param1;
          this.setModel(param0, (byte) -117);
          this.field_mb = new AnimationPlayer(1);
          this.field_ob = -1;
          this.setAnimationClip((byte) -128, 3);
          this.setPosition(this.positionX, false, this.height, this.positionY);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_fb = new int[33][33][33];
        field_S = "Please select options in the following rows:  ";
        field_Q = "Awesome!";
    }
}
