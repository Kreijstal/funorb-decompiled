/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SquadSlotWidget extends UiLayoutNode {
    private RenderedFootballer field_Db;
    boolean field_Kb;
    static IntrusiveDeque field_yb;
    boolean field_Gb;
    PlayerStats field_Eb;
    static String field_Ib;
    static String field_Bb;
    static int field_Jb;
    static int field_Ab;
    boolean field_Hb;
    private Sprite field_Fb;
    private boolean field_Cb;
    boolean field_Lb;
    boolean field_zb;

    final void a(byte param0, ClubState param1, int param2) {
        AuctionLogEntry var4 = null;
        try {
          var4 = param1.findLogEntryBySlot((byte) 43, param2);
          if (var4 == null) {
            this.field_Fb = null;
            this.field_Gb = false;
          } else {
            this.field_Fb = param1.hasOwnEntry(1, var4.auctionId) ? (Sprite) ((Object) WeightedLruCache.field_h) : (Sprite) ((Object) CipherPacketBuffer.field_q);
            this.field_Gb = true;
          }
          int var5 = -66 / ((-50 - param0) / 34);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void h(byte param0) {
        int[] var2;
        int[] var3;
        int[] var4;
        int[] var5;
        if (this.field_Eb.isEmpty(-2)) {
          if (param0 >= -114) {
            this.h((byte) -68);
          }
          if (this.field_Fb == null) {
            return;
          }
          this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
          return;
        }
        if (null == this.field_Db) {
          jr.a(this.field_F + (this.field_q >> 1), -36, (this.field_mb >> 1) + this.field_T);
          if (!this.field_Hb) {
            if (param0 >= -114) {
              this.h((byte) -68);
            }
            if (this.field_Fb == null) {
              return;
            }
            this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
            return;
          }
          SoftwareRasterizer.a(this.field_F + 1, -22 + this.field_mb + this.field_T, this.field_q - 2, 19, 7, 65793, 170);
          PlayerContextMenu.a(this.field_F + 12, (byte) 126, this.field_T + (this.field_mb - 12));
          ConsoleTokenCursor.field_d.a(WeightedLruCache.field_b, this.field_F + 23, this.field_mb + (this.field_T - 8), 16763955, 65793);
          if (param0 < -114) {
            if (this.field_Fb == null) {
              return;
            }
            this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
            return;
          }
          this.h((byte) -68);
          if (this.field_Fb != null) {
            this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
          }
          return;
        }
        PacketBuffer.a(85, dc.field_b);
        SoftwareRasterizer.b();
        var5 = new int[4];
        var4 = var5;
        var3 = var4;
        var2 = var3;
        var5[0] = 1428;
        var5[3] = 1260;
        var5[2] = 1400;
        var5[1] = 1400;
        this.field_Db.renderModel(var3[this.field_Eb.archetype], 0, SoftwareRasterizer.field_g >> 1, SoftwareRasterizer.field_f - 8, (byte) -122);
        TeamManagementScreen.e(117);
        if (this.field_zb) {
          eo.a(dc.field_b, 1);
          eo.a(dc.field_b, 2);
        } else {
          if (this.field_Kb) {
            eo.a(dc.field_b, 1);
            eo.a(dc.field_b, 2);
            dc.field_b.drawHalfSize(this.field_F, this.field_T);
            if (this.field_Hb) {
              SoftwareRasterizer.a(this.field_F + 1, -22 + this.field_mb + this.field_T, this.field_q - 2, 19, 7, 65793, 170);
              PlayerContextMenu.a(this.field_F + 12, (byte) 126, this.field_T + (this.field_mb - 12));
              ConsoleTokenCursor.field_d.a(WeightedLruCache.field_b, this.field_F + 23, this.field_mb + (this.field_T - 8), 16763955, 65793);
            }
            if (param0 >= -114) {
              this.h((byte) -68);
            }
            if (this.field_Fb != null) {
              this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
            }
            return;
          }
        }
        dc.field_b.drawHalfSize(this.field_F, this.field_T);
        if (this.field_Hb) {
          SoftwareRasterizer.a(this.field_F + 1, -22 + this.field_mb + this.field_T, this.field_q - 2, 19, 7, 65793, 170);
          PlayerContextMenu.a(this.field_F + 12, (byte) 126, this.field_T + (this.field_mb - 12));
          ConsoleTokenCursor.field_d.a(WeightedLruCache.field_b, this.field_F + 23, this.field_mb + (this.field_T - 8), 16763955, 65793);
        }
        if (param0 >= -114) {
          this.h((byte) -68);
        }
        if (this.field_Fb == null) {
          return;
        }
        this.field_Fb.c(18 + this.field_F, 41 + this.field_T);
        return;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -123) {
          return;
        }
        field_Ib = null;
        field_yb = null;
        field_Bb = null;
    }

    final void a(int param0, int param1, byte param2, int param3, PlayerStats param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!param4.isSameAs((byte) -98, this.field_Eb)) {
            this.field_Eb.copyFrom((byte) -95, param4);
            this.field_Db = null;
          }
          if (param2 < 124) {
            return;
          }
          if (!this.field_Eb.isEmpty(-2) &&
            this.field_gb &&
            0 == this.field_qb) {
            MenuButton.a(param1, 0, this.field_Cb, param0, this.field_Eb, this.field_Lb, param3);
          }
          if (null == this.field_Db) {
            if (!this.field_Eb.isEmpty(-2)) {
              if (null != GameModesHelpScreen.field_G) {
                return;
              }
              this.field_Db = pg.a(param0, param1, this.field_Eb, -79, param3);
            }
          } else {
            this.field_Db.stepMovement(2, (PlayArea[]) null, false, false);
            this.field_Db.resetPose((byte) 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("kq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public SquadSlotWidget() {
        this.field_Cb = true;
        this.field_Lb = false;
        this.field_Eb = new PlayerStats();
        this.field_mb = 75;
        this.field_q = 52;
    }

    static {
        field_Bb = "You are winning this auction.";
        field_Ib = "Invalid name";
        field_Jb = 105;
        field_Ab = -1;
    }
}
