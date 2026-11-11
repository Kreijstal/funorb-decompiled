/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialHints {
    private MatchScreen field_l;
    private boolean field_m;
    private int field_g;
    private boolean field_j;
    private IntrusiveDeque field_c;
    private boolean field_d;
    private boolean field_h;
    private boolean field_b;
    private boolean field_f;
    private boolean field_i;
    private int field_a;
    private boolean field_k;
    private int field_e;

    final void a(int param0) {
        int var7 = 0;
        Room var3;
        int var4;
        Trap[] var5_ref_fsa__;
        int var5;
        Trap[] var6_ref_fsa__;
        int var6;
        Trap var8;
        int var9;
        Player var10;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = this.field_l.matchState.players[this.field_l.localPlayerIndex];
        var3 = var10.getRoom((byte) -106);
        var4 = this.field_l.matchState.getPlayerCourseIndex(1, this.field_l.localPlayerIndex);
        if (param0 != 9981) {
          this.a(77);
        }
        if (var4 != this.field_g) {
          this.field_g = var4;
          if (0 == this.field_g) {
            this.queueHint(ColourRowCache.field_j, new wq(), 50, param0 ^ -9907);
          }
          var5_ref_fsa__ = var3.getAllTraps(16);
          var6_ref_fsa__ = var5_ref_fsa__;
          for (var7 = 0; var7 < var6_ref_fsa__.length; var7++) {
            var8 = var6_ref_fsa__[var7];
            if (!this.field_h &&
              var8.isPushableNow((byte) -119)) {
              this.field_h = true;
              this.queueHint(WhirlpoolDigest.field_c, (MessagePanel) null, 25, -89);
            }
            if (!this.field_i) {
              if (var8.getStatCategory((byte) 3) == 1) {
                this.field_i = true;
                this.queueHint(GasTrapComponent.field_F, new jia(), 25, param0 - 10059);
              }
              if (!this.field_m &&
                3 == var8.getStatCategory((byte) 3)) {
                this.field_m = true;
                this.queueHint(gca.field_l, (MessagePanel) null, 25, -61);
              }
            } else {
              if (!this.field_m &&
                3 == var8.getStatCategory((byte) 3)) {
                this.field_m = true;
                this.queueHint(gca.field_l, (MessagePanel) null, 25, -61);
              }
            }
          }
        }
        var5 = var10.getDeathCount((byte) -102);
        if (this.field_e != var5) {
          this.field_a = 0;
          this.field_e = var5;
          var6 = DateFieldsWidget.field_C[4] - 10;
          if (1 == this.field_e) {
            this.queueHint(tha.field_A, (MessagePanel) null, var6, param0 ^ -9888);
          }
        }
        this.field_k = var10.hasCollectedTreasure(-107);
        if (!this.field_d &&
          this.field_k) {
          this.field_d = true;
          this.queueHint(RenderScene.field_b, (MessagePanel) null, 5, -88);
        }
        if (!this.field_f &&
          var10.getRoomTreasure(393216, 2) > 0) {
          this.field_f = true;
          this.queueHint(PlayerContextMenu.field_a, (MessagePanel) null, 5, -74);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_f) {
          if (var10.getRoomTreasure(393216, 2) != 0) {
            this.field_a = 0;
          } else {
            this.field_a = this.field_a + 1;
            if (this.field_j) {
              if ((!(this.field_b)) &&
                ((var10.getHeldItemKind((byte) 127) == 1))) {
                this.field_b = true;
                this.queueHint(S2CPlayerSyncPacket.field_f, (MessagePanel) null, 5, -108);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (500 < this.field_a) {
                this.field_j = true;
                this.queueHint(CharacterChoice.field_a, (MessagePanel) null, 25, param0 ^ -9867);
              }
            }
          }
        }
        if ((decompiledFrameRemainder0) && (!this.field_b &&
          var10.getHeldItemKind((byte) 127) == 1)) {
          this.field_b = true;
          this.queueHint(S2CPlayerSyncPacket.field_f, (MessagePanel) null, 5, -108);
        }

    }

    private final void queueHint(String param0, MessagePanel param1, int param2, int param3) {
        MessageOverlay var5 = null;
        try {
          if (param3 > -56) {
            this.b((byte) 111);
          }
          var5 = new MessageOverlay(this.field_l, param1);
          var5.a(tea.field_a, param0, ColouriseOperator.field_n, (byte) 21);
          this.field_c.addLast((byte) -125, new mga(var5, param2));
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "sna.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        mga var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = (mga) (this.field_c.first(-80));
        while (var2 != null) {
          if (var2.field_k > 0) {
            var2.field_k = var2.field_k - 1;
          } else {
            if (!this.field_l.hasMessageOverlay(0)) {
              this.field_l.addOverlay(var2.field_h, param0 ^ 644);
              var2.unlink(param0 ^ 18);
            }
          }
          var2 = (mga) (this.field_c.next(108));
        }
        if (param0 != 44) {
          this.a(1);
        }
    }

    final void b(byte param0) {
        if (param0 != -121) {
          this.field_a = -88;
        }
    }

    TutorialHints(MatchScreen param0) {
        this.field_m = false;
        this.field_d = false;
        this.field_g = -1;
        this.field_h = false;
        this.field_j = false;
        this.field_b = false;
        this.field_i = false;
        this.field_f = false;
        this.field_a = 0;
        this.field_k = false;
        this.field_e = 0;
        this.field_c = new IntrusiveDeque();
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "sna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
