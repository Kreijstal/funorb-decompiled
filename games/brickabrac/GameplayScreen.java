/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayScreen extends GameScreen {
    boolean field_p;
    static int field_h;
    MultiplayerMatch match;
    static RgbSprite field_l;
    int field_v;
    int field_r;
    private int field_i;
    int field_x;
    static mh field_u;
    boolean field_n;
    static int field_j;
    int field_k;
    boolean field_s;
    private int field_m;
    private boolean field_y;
    boolean field_q;
    int field_o;
    private int field_t;

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_30_0 = false;
        int var2;
        PlayerBoard var3;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!pf.field_p) {
          stackIn_6_0 = (!la.field_c) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (param0 != -1) {
          var3 = (PlayerBoard) null;
          this.a((byte) -2, (PlayerBoard) null);
        }
        stackIn_10_0 = var2;
        stackIn_11_1 = ((this.field_o & (this.match.playerMaskOne | this.match.playerMaskTwo | this.match.playerMaskThree)) != this.field_o) ? 0 : 1;
        boolean decompiledFrameRemainder0 = true;
        var2Lifetime1 = stackIn_10_0 & stackIn_11_1;
        stackIn_16_0 = var2Lifetime1;
        if (2 < this.match.playerCount && (this.field_k < 0 ||
          !(this.match.playerBoards[this.field_k].field_U < 50))) {
          stackIn_17_1 = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_17_1 = 0;
        }
        boolean decompiledFrameRemainder1 = true;
        var2Lifetime2 = stackIn_16_0 & stackIn_17_1;
        if (var2Lifetime2 != 0) {
          if (!pe.field_l[fq.field_b] &&
            !pe.field_l[td.field_u]) {
            if (!(!pe.field_l[ac.field_f])) {
              fieldTemp$0 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              this.field_m = (this.match.playerCount + fieldTemp$0) % this.match.playerCount;
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            fieldTemp$1 = this.field_m + 1;
            this.field_m = this.field_m + 1;
            this.field_m = fieldTemp$1 % this.match.playerCount;
          }
        }
        stackIn_30_0 = (pe.field_l[fq.field_b]) || (pe.field_l[ac.field_f]) || (pe.field_l[td.field_u]);
        la.field_c = stackIn_30_0;
    }

    private final boolean a(int param0, int param1) {
        if (eo.a(mk.field_b, param0, (byte) -75)) {
          return true;
        }
        int[] var5 = mk.field_b;
        int[] var3 = var5;
        int var4 = param0;
        var5[var4 >> 5] = LevelSelectScreen.d(var5[var4 >> 5], 1 << ik.a(31, var4));
        int[] var6 = pl.field_b;
        var3 = var6;
        var4 = param0;
        var6[var4 >> 5] = LevelSelectScreen.d(var6[var4 >> 5], param1 << ik.a(var4, 31));
        kp.field_c.addLast(new IntNode(param0), (byte) 3);
        return false;
    }

    final void drawScreen(byte obfuscationGuard) {
        Rasterizer2D.resetClip();
        if (!this.field_q) {
          return;
        }
        if (obfuscationGuard > -14) {
          this.a((byte) -47, -81);
        }
        this.g(41);
    }

    final void a(BitPacketBuffer param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param0.readUnsignedByte(255);
          this.match.playerBoards[var4_int].field_V = param0.readMedium(48);
          var5 = -101 % ((param2 - 26) / 60);
          if (param1) {
            this.match.playerBoards[var4_int].field_zb = param0.readUnsignedByte(255);
            this.match.playerMaskThree = this.match.playerMaskThree | 1 << var4_int;
          } else {
            this.match.playerMaskTwo = this.match.playerMaskTwo | 1 << var4_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, BitPacketBuffer param1) {
        PlayerBoard dupTemp$0 = null;
        try {
          dupTemp$0 = this.match.playerBoards[this.field_k];
          dupTemp$0.field_E = dupTemp$0.field_E + 5;
          this.match.playerBoards[this.field_k].field_p = param1.readUnsignedShort(65280);
          if (param0 != 33) {
            PlayerBoard var4 = (PlayerBoard) null;
            this.a((byte) 15, (PlayerBoard) null);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "qj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (this.a(param2, 1)) {
          return;
        }
        if (!this.field_s) {
          var4 = this.match.playerBoards[0].score;
          ep.field_i = ep.field_i - (var4 + this.field_t);
          var5 = this.match.playerBoards[0].levelIndex;
          fp.field_z = fp.field_z + var5;
          lp.field_wb.addLast(new e(param2, param0, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
          fp.field_z = fp.field_z + (var4 + this.field_t);
          ep.field_i = ep.field_i - var5;
        }
        if (param1 != 67) {
          this.field_i = 125;
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        String stackIn_210_0 = null;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        Object stackIn_231_0;
        boolean stackIn_231_3;
        int var4;
        int var5;
        int var6;
        NodeDeque var7;
        long var9_long;
        int var9_int;
        Ball var9;
        PlayerBoard var11;
        PlayerBoard var12;
        Ball var13;
        int var14;
        PlayerBoard var15;
        PlayerBoard var16;
        PlayerBoard var17;
        PlayerBoard var18;
        NodeDeque var19;
        PlayerBoard var20;
        PlayerBoard var21;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        PlayerBoard var17Lifetime1;
        PlayerBoard var17Lifetime2;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (!this.field_q) {
          return;
        }
        if (null != oa.field_Sb) {
          oa.field_Sb.e(1);
          if (!oa.field_Sb.field_q) {
            oa.field_Sb.d(59);
          }
          if (MenuScreen.field_i > 0) {
            fieldTemp$0 = MenuScreen.field_i - 1;
            MenuScreen.field_i = MenuScreen.field_i - 1;
            if (fieldTemp$0 == 0) {
              fq.field_c = null;
              ih.field_k = null;
            }
          }
        } else {
          if (MenuScreen.field_i > 0) {
            fieldTemp$1 = MenuScreen.field_i - 1;
            MenuScreen.field_i = MenuScreen.field_i - 1;
            if (fieldTemp$1 == 0) {
              fq.field_c = null;
              ih.field_k = null;
            }
          }
        }
        stackIn_15_0 = (this.match.playerBoards[this.field_m].field_M == -1) ? 0 : 1;
        var4 = stackIn_15_0;
        stackIn_19_0 = var4;
        if (!this.field_p &&
          this.match.playerCount == 2 &&
          -1 != this.match.playerBoards[-this.field_m + 1].field_M) {
          stackIn_20_1 = 1;
        } else {
          stackIn_20_1 = 0;
        }
        var4Lifetime1 = stackIn_19_0 | stackIn_20_1;
        if (1 == this.match.playerCount &&
          this.match.playerBoards[0].field_Z == 5) {
          ji.a(25459, true, c.field_j, 1, 1, true);
        } else {
          if (!this.match.field_c) {
            if (var4Lifetime1 != 0) {
              ji.a(25459, true, uk.field_t, 1, 1, true);
            } else {
              if (oa.field_Sb != null &&
                oa.field_Sb.field_q) {
                wj.a(1, true, oa.field_Sb.c(-109), false, 1, oa.field_Sb.field_n, true);
              } else {
                ji.a(25459, true, cd.field_g, 1, 1, true);
              }
            }
          } else {
            ji.a(25459, true, oj.field_q, 1, 1, true);
          }
        }
        if (this.match.field_c &&
          this.match.playerCount > 1) {
          fieldTemp$2 = be.field_j + 1;
          be.field_j = be.field_j + 1;
          if (fieldTemp$2 == 300) {
            if (m.field_a) {
              fieldTemp$3 = ml.field_f + 1;
              ml.field_f = ml.field_f + 1;
              System.out.println("Concluded " + fieldTemp$3 + " games (" + cf.field_a + " errors)");
              if ((1 << this.field_k & this.match.field_j) == 0) {
                this.f(87);
              }
            }
            po.a((byte) -97);
            if (!this.field_p) {
              ng.requestScreen(false, 62, 20);
              cc.field_G = true;
            } else {
              if (op.field_a) {
                if (null == hd.pendingScreen ||
                  hd.pendingScreen.screenId != -2) {
                  ng.requestScreen(false, 101, 19);
                }
              } else {
                da.f((byte) 122);
              }
            }
          }
        }
        if (obfuscationGuard >= -52) {
          this.match = (MultiplayerMatch) null;
        }
        var5 = oo.field_w.nextBoundedInt(-37880252, 10);
        var6 = oo.field_w.nextBoundedInt(-37880252, 3);
        if (var5 == 0) {
          od.field_c = od.field_c + 1;
          fp.field_z = fp.field_z + og.field_Wb;
        }
        if (var5 == 1) {
          od.field_c = od.field_c - 2;
          fp.field_z = fp.field_z - 2 * og.field_Wb;
        }
        if (var5 == 2) {
          fp.field_z = fp.field_z + 2 * od.field_c;
          og.field_Wb = og.field_Wb + 2;
        }
        if (var5 == 3) {
          og.field_Wb = og.field_Wb - 1;
          fp.field_z = fp.field_z - od.field_c;
        }
        if (var5 == 4) {
          od.field_c = od.field_c + 1;
          ep.field_i = ep.field_i + og.field_Wb;
        }
        if (var5 == 5) {
          ep.field_i = ep.field_i - og.field_Wb * 2;
          od.field_c = od.field_c - 2;
        }
        if (6 == var5) {
          ep.field_i = ep.field_i + og.field_Wb;
          od.field_c = od.field_c + 1;
        }
        if (var5 == 7) {
          ep.field_i = ep.field_i - od.field_c * 2;
          og.field_Wb = og.field_Wb - 2;
        }
        if (var5 == 8) {
          fp.field_z = fp.field_z + var6;
          fp.field_z = fp.field_z - var6;
        }
        if (var5 == 9) {
          ep.field_i = ep.field_i + var6;
          fp.field_z = fp.field_z - var6;
        }
        var5Lifetime1 = oo.field_w.nextBoundedInt(-37880252, 5);
        if (var5Lifetime1 == 0) {
          hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 16;
        }
        if (var5Lifetime1 == 1) {
          ek.field_kb = ek.field_kb - tm.field_g;
          qm.field_a = qm.field_a - 1;
        }
        if (var5Lifetime1 == 2) {
          ek.field_kb = ek.field_kb + tm.field_g;
          qm.field_a = qm.field_a + 1;
        }
        if (var5Lifetime1 == 3) {
          ek.field_kb = ek.field_kb - qm.field_a;
          tm.field_g = tm.field_g - 1;
        }
        if (var5Lifetime1 == 4) {
          ek.field_kb = ek.field_kb + qm.field_a;
          tm.field_g = tm.field_g + 1;
        }
        if (this.field_p) {
          for (var5Lifetime2 = 0; this.match.playerCount > var5Lifetime2; var5Lifetime2++) {
            if ((this.field_o & 1 << var5Lifetime2) != 0) {
              var15 = this.match.playerBoards[var5Lifetime2];
              var17 = var15;
              var17Lifetime2 = var15;
              var16 = var15;
              var16.field_vb[var15.simulationTick % 5] = 0;
            }
          }
        }
        if (inputEnabled) {
          this.a(-1);
        }
        for (var5Lifetime3 = 0; var5Lifetime3 < this.match.playerCount; var5Lifetime3++) {
          if ((this.field_o & 1 << var5Lifetime3) != 0) {
            var17Lifetime1 = this.match.playerBoards[var5Lifetime3];
            if (inputEnabled) {
              this.a((byte) 73, var17Lifetime1);
            } else {
              var17Lifetime1.field_db = 0;
            }
            if (this.field_p) {
              var17Lifetime1.field_vb[var17Lifetime1.simulationTick % 5] = var17Lifetime1.field_db;
            }
          }
        }
        var5Lifetime4 = 0;
        var19 = new NodeDeque();
        var7 = new NodeDeque();
        if (!r.field_A) {
          stackIn_120_0 = (!this.a(var7, true, var19)) ? 0 : 1;
          var5Lifetime4 = stackIn_120_0;
        } else {
          if (MenuScreen.field_i == 0) {
            od.a((byte) 32);
            var18 = this.match.playerBoards[0];
            if (2 == var18.field_Z) {
              jc.a(var18.field_db, 0, (byte) -85);
            }
            if (var18.field_Z == 0 ||
              !ka.a((byte) 62)) {
              stackIn_116_0 = (!this.a(var7, true, var19)) ? 0 : 1;
              var5Lifetime4 = stackIn_116_0;
            }
          }
        }
        bm.playGameplayAudioEvents(96, 96, false, -30791, var19);
        bm.playGameplayAudioEvents(48, 48, true, -30791, var7);
        if (this.match.playerCount == 1) {
          var20 = this.match.playerBoards[0];
          if (var20.levelIndex > this.field_i) {
            var9_long = ue.a(false);
            this.a(gq.field_Yb, this.field_i, var9_long - fl.field_l, true, 1000);
            fl.field_l = var9_long;
            this.field_i = var20.levelIndex;
            this.a(this.match.configuration.pack, var20.score, (byte) -125, var20.levelIndex);
            if (this.field_i == 1 &&
              0 == this.match.configuration.pack.packId) {
              var11 = var20;
              var20.field_Q = 0;
              var11.field_m = 0;
              var20.field_u = 0;
              var12 = var20;
              var12.field_N = 0;
              var13 = (Ball) (var20.activeBalls.first(-66));
              while (var13 != null) {
                var13.brickBounceCount = 0;
                var13 = (Ball) (var20.activeBalls.next((byte) 116));
              }
            }
            if ((this.field_i > 1 ||
              this.match.configuration.pack.packId == 1) &&
              (lc.a(0, -119) &&
              oa.field_Sb instanceof dp)) {
              this.a(false, 239, 16);
            }
            if (this.field_i < this.match.configuration.getPeriod(95)) {
              w.field_r = lg.a(2, this.match.configuration.getLevelTitle(this.field_i, (byte) -122), -1);
            }
          }
          if (var20.field_tb) {
            var9_int = (33423360 - 2 * (var20.paddle.x256 + var20.paddle.width256 / 2 << 8)) / 510;
            nk.field_c.bindRasterTarget();
            oa.field_Sb.a(true, var9_int, 0, 0, 0);
            kc.field_q.a((byte) 78);
            ih.field_k = oa.field_Sb.c((byte) -116);
            fq.field_c = oa.field_Sb.b(-102);
            oa.field_Sb = rd.a(var20.levelState.value, (byte) 19);
            MenuScreen.field_i = 32;
            var20.field_tb = false;
            pe.field_n = var20.levelState.value;
          }
          if (!(var20.levelIndex <= 0) ||
            this.match.configuration.pack.packId != 0) {
            if (dp.field_r[0] <= var20.field_m) {
              this.b(0, -64, 255);
            }
            if (var20.field_m >= dp.field_r[1]) {
              this.b(1, 119, 254);
            }
            if (var20.field_m >= dp.field_r[2]) {
              this.b(2, -42, 253);
            }
            if (dp.field_r[39] <= var20.field_m) {
              this.b(39, 109, 216);
            }
            if (var20.levelIndex - this.field_t >= dp.field_r[3]) {
              this.a(false, 252, 3);
            }
            if (var20.levelIndex - this.field_t >= dp.field_r[4]) {
              this.a(false, 251, 4);
            }
            if (var20.levelIndex >= dp.field_r[5] - 1) {
              this.a(250, 67, 5);
            }
            if (-1 + dp.field_r[6] <= var20.levelIndex &&
              var20.field_Z == 5) {
              this.a(249, 67, 6);
            }
            if (dp.field_r[7] <= var20.score) {
              this.a((byte) 68, 7, 248);
            }
            if (dp.field_r[8] <= var20.score) {
              this.a((byte) 97, 8, 247);
            }
            if (var20.score >= dp.field_r[40]) {
              this.a((byte) 39, 40, 215);
            }
            var9 = (Ball) (var20.activeBalls.first(-119));
            while (var9 != null) {
              if (dp.field_r[9] <= var9.brickBounceCount) {
                this.b(9, 106, 246);
              }
              if (var9.brickBounceCount < dp.field_r[10]) {
                var9 = (Ball) (var20.activeBalls.next((byte) 116));
                continue;
              }
              this.b(10, -52, 245);
              break;
            }
            if (dp.field_r[22] <= var20.field_l) {
              this.b(22, -65, 233);
            }
            if (var20.field_hb >= dp.field_r[29]) {
              this.b(29, 114, 226);
            }
            if (dp.field_r[30] <= var20.field_u) {
              this.b(30, -118, 225);
            }
            if (dp.field_r[31] <= var20.field_u) {
              this.b(31, -33, 224);
            }
            if (var20.field_N >= dp.field_r[32]) {
              this.b(32, -94, 223);
            }
            if (var20.field_N >= dp.field_r[33]) {
              this.b(33, 112, 222);
            }
            if (var20.field_t >= dp.field_r[19]) {
              this.b(19, 85, 236);
            }
            if (var20.field_t >= dp.field_r[20]) {
              this.b(20, -128, 235);
            }
            if (!(var20.field_t < dp.field_r[21])) {
              this.b(21, 109, 234);
            }
          }
          if (dj.field_b != var20.score) {
            dj.field_b = var20.score;
            vd.field_d = Integer.toString(dj.field_b);
          }
          if (pg.field_m != 1 + pp.a(var20, (byte) 59, this.match)) {
            pg.field_m = pp.a(var20, (byte) -100, this.match) + 1;
            if (pg.field_m < 10) {
              stackIn_210_0 = "0" + pg.field_m;
            } else {
              stackIn_210_0 = Integer.toString(pg.field_m);
            }
            lq.field_e = stackIn_210_0;
          }
        }
        if (this.field_p &&
          this.field_o != 0) {
          for (var8 = 0; var8 < this.match.playerCount; var8++) {
            if ((this.field_o & 1 << var8) != 0 &&
              ((this.match.playerMaskOne | (this.match.playerMaskThree | this.match.playerMaskTwo)) & 1 << var8) == 0) {
              var21 = this.match.playerBoards[var8];
              if (var5Lifetime4 != 0 &&
                0 == var21.simulationTick % 5) {
                stackIn_230_1 = 120;
                stackIn_230_2 = var8;
                if (var21.simulationTick % 5 != 0) {
                  stackIn_231_0 = this;
                  stackIn_231_3 = false;
                } else {
                  stackIn_231_0 = this;
                  stackIn_231_3 = true;
                }
                this.a((byte) stackIn_230_1, stackIn_230_2, stackIn_231_3);
              }
            }
          }
          return;
        }
        return;
    }

    final boolean c(int param0) {
        if (param0 < 93) {
          this.a(false, (byte) -87);
        }
        return this.field_k == -2 ? true : false;
    }

    private final void e(int param0) {
        if (param0 != 0) {
          this.field_q = true;
        }
        if (this.field_s) {
          return;
        }
        if (null == fj.field_Ub &&
          !(0 >= this.match.playerBoards[0].score)) {
          fj.field_Ub = new sp(this.match.configuration.pack.completionWord, 65535 ^ this.match.configuration.pack.completionWord, fp.field_z, ep.field_i, od.field_c, og.field_Wb, new int[]{this.match.playerBoards[0].score, this.field_t << 16 | this.field_r});
          if (!og.h(-26090)) {
            bd.a(3, (byte) 25, fj.field_Ub);
          }
        }
    }

    final void a(byte param0, boolean param1) {
        boolean stackIn_8_0 = false;
        if (!this.field_p) {
          if (1 == this.match.playerCount &&
            !this.field_s) {
            this.a(pp.a(this.match.playerBoards[0], (byte) 115, this.match), false);
            this.e(0);
            this.a(gq.field_Yb, this.field_r, -fl.field_l + ue.a(false), false, 1000);
            jj.field_d = jj.field_d | ja.a(this.field_t, this.match.configuration, -1 + this.field_r, true);
            stackIn_8_0 = (hh.field_b[0] == 0);
            be.field_a = stackIn_8_0;
          }
          if (this.match.playerCount == 1 &&
            this.match.playerBoards[0].field_Z == 8) {
            ng.requestScreen(param1, 107, 18);
            ji.a(25459, true, cd.field_g, 1, 1, true);
          } else {
            this.a(param1, (byte) 69);
          }
        }
        if (param0 != 40) {
          return;
        }
        pe.field_n = si.field_k.field_m;
    }

    final void a(boolean param0, byte param1) {
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        rj.a((byte) 80, to.field_k);
        rj.a((byte) 80, me.field_d);
        if (!(this.match.playerCount <= 1) ||
          9 != this.match.playerBoards[0].field_Z) {
          ji.a(25459, true, cd.field_g, 1, 1, true);
        }
        if (this.field_p) {
          return;
        }
        if (param1 != 69) {
          return;
        }
        if (og.h(-26090)) {
          if (!ib.a(pl.field_b, -1) &&
            fj.field_Ub == null) {
            ng.requestScreen(param0, 121, 0);
          } else {
            ng.requestScreen(param0, 68, 10);
          }
        } else {
          if (!ib.a(pl.field_b, -1)) {
            if (fj.field_Ub != null) {
              ng.requestScreen(param0, 68, 5);
            } else {
              ng.requestScreen(param0, 100, 0);
            }
          } else {
            ng.requestScreen(param0, 60, 9);
          }
        }
    }

    final void a(byte param0, BitPacketBuffer param1, boolean param2) {
        int var6_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        p var5 = null;
        PlayerBoard var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = param1.readUnsignedByte(255);
          if (this.match.playerCount <= var4_int) {
            rk.a("K1: (" + var4_int + "/" + param1.position + ") " + eq.c((byte) -110), (Throwable) null, param0 + 125);
            hn.a((byte) 89);
            return;
          }
          var5 = new p();
          var5.field_k = param1.readUnsignedShort(65280);
          param1.beginBitRead(-79);
          for (var6_int = 0; var6_int < 5; var6_int++) {
            var5.field_n[var6_int] = param1.readBits(3, (byte) 117);
          }
          if (param0 != -15) {
            this.b(-25, 35, 50);
          }
          param1.finishBitRead((byte) 100);
          if (param2) {
            var5.field_m = param1.readInt(255);
            var5.field_l = true;
          }
          var6 = this.match.playerBoards[var4_int];
          var6.field_E = var6.field_E + 5;
          var6.field_q = var6.field_q + 5;
          var6.field_eb.addLast(var5, (byte) 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.readUnsignedByte(param0 ^ 18615);
          this.match.playerBoards[var3_int].field_V = param1.readMedium(48);
          this.match.playerMaskOne = this.match.playerMaskOne | 1 << var3_int;
          if (param0 != 18504) {
            field_u = (mh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("qj.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 17 % ((29 - param0) / 57);
        k.field_h.writeCipheredOpcode(-13413, !param2 ? 68 : 69);
        k.field_h.beginBitWrite(62);
        PlayerBoard var5 = this.match.playerBoards[param1];
        for (var6 = 0; var6 < 5; var6++) {
          k.field_h.writeBits(3, -17566, var5.field_vb[var6]);
        }
        k.field_h.finishBitWrite(-105);
        if (param2) {
          k.field_h.writeInt(var5.a(true, (StringBuilder) null) ^ var5.nextRandomInt(122), (byte) -79);
        }
    }

    final boolean handleKey(char character, int keyCode, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        boolean stackIn_152_0 = false;
        int var4;
        int var5;
        Ball var5_ref_vn;
        int var6;
        PlayerBoard var7;
        PlayerBoard var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime2Lifetime1;
        Ball var5_ref_vnLifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = oo.field_w.nextBoundedInt(-37880252, 10);
        var5 = oo.field_w.nextBoundedInt(-37880252, 5);
        if (var4 == 0) {
          fp.field_z = fp.field_z + og.field_Wb;
          od.field_c = od.field_c + 1;
        }
        if (var4 == 1) {
          fp.field_z = fp.field_z - og.field_Wb * 2;
          od.field_c = od.field_c - 2;
        }
        if (var4 == 2) {
          og.field_Wb = og.field_Wb + 2;
          fp.field_z = fp.field_z + od.field_c * 2;
        }
        if (var4 == 3) {
          og.field_Wb = og.field_Wb - 1;
          fp.field_z = fp.field_z - od.field_c;
        }
        if (4 == var4) {
          od.field_c = od.field_c + 1;
          ep.field_i = ep.field_i + og.field_Wb;
        }
        if (var4 == 5) {
          od.field_c = od.field_c - 2;
          ep.field_i = ep.field_i - 2 * og.field_Wb;
        }
        if (keyCode <= 98) {
          return false;
        }
        if (6 == var4) {
          ep.field_i = ep.field_i + og.field_Wb;
          od.field_c = od.field_c + 1;
        }
        if (var4 == 7) {
          og.field_Wb = og.field_Wb - 2;
          ep.field_i = ep.field_i - od.field_c * 2;
        }
        if (8 == var4) {
          fp.field_z = fp.field_z + var5;
          fp.field_z = fp.field_z - var5;
        }
        if (var4 == 9) {
          ep.field_i = ep.field_i + var5;
          fp.field_z = fp.field_z - var5;
        }
        var4Lifetime1 = oo.field_w.nextBoundedInt(-37880252, 5);
        if (var4Lifetime1 == 0) {
          hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 16;
        }
        if (var4Lifetime1 == 1) {
          ek.field_kb = ek.field_kb - tm.field_g;
          qm.field_a = qm.field_a - 1;
        }
        if (var4Lifetime1 == 2) {
          qm.field_a = qm.field_a + 1;
          ek.field_kb = ek.field_kb + tm.field_g;
        }
        if (var4Lifetime1 == 3) {
          tm.field_g = tm.field_g - 1;
          ek.field_kb = ek.field_kb - qm.field_a;
        }
        if (var4Lifetime1 == 4) {
          tm.field_g = tm.field_g + 1;
          ek.field_kb = ek.field_kb + qm.field_a;
        }
        if (obfuscationGuard == 13) {
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime2 = 1;
          if (this.field_p) {
            if (this.c(113)) {
              var4Lifetime2 = 4;
            } else {
              if (!this.match.field_c &&
                ((this.match.playerMaskThree | (this.match.playerMaskOne | this.match.playerMaskTwo)) & 1 << this.field_k) == 0) {
                var4Lifetime2 = 2;
              } else {
                var4Lifetime2 = 3;
              }
            }
          } else {
            if (this.match.playerCount == 1) {
              var5Lifetime1 = this.match.playerBoards[0].field_Z;
              decompiledFrameRemainder0 = (5 == var5Lifetime1 ||
                9 == var5Lifetime1 ||
                var5Lifetime1 == 3 ||
                var5Lifetime1 == 8);
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (this.match.playerCount == 2)) {
              var4Lifetime2 = 17;
            }
          }
          if (this.match.playerCount != 1 &&
            this.match.field_c) {
            if (!(200 >= be.field_j)) {
              be.field_j = 299;
              return true;
            }
          } else {
            ng.requestScreen(false, 64, var4Lifetime2);
          }
          return true;
        }
        if (this.match.playerCount == 1 &&
          r.field_A &&
          ka.a((byte) 113)) {
          if (84 == obfuscationGuard) {
            im.b(-8);
          }
          return true;
        }
        if (1 == this.match.playerCount &&
          this.field_y) {
          var7 = this.match.playerBoards[0];
          var8 = var7;
          if (48 == obfuscationGuard) {
            this.field_s = true;
            var7.field_m = dp.field_r[0] - 5;
            return true;
          }
          if (obfuscationGuard == 68) {
            var7.field_m = dp.field_r[1] - 5;
            this.field_s = true;
            return true;
          }
          if (66 == obfuscationGuard) {
            var7.field_m = -5 + dp.field_r[2];
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 50) {
            this.field_t = -dp.field_r[3] + (var8.levelIndex + 1);
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 34) {
            this.field_s = true;
            this.field_t = var7.levelIndex + 1 - dp.field_r[4];
            return true;
          }
          if (51 == obfuscationGuard) {
            var7.score = dp.field_r[7] - 20;
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 52) {
            this.field_s = true;
            var7.score = -20 + dp.field_r[8];
          }
          if (obfuscationGuard == 53) {
            var5_ref_vn = (Ball) (var8.activeBalls.first(-19));
            while (var5_ref_vn != null) {
              var5_ref_vn.brickBounceCount = dp.field_r[9] - 2;
              var5_ref_vn = (Ball) (var8.activeBalls.next((byte) 116));
            }
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 39) {
            var5_ref_vnLifetime1 = (Ball) (var8.activeBalls.first(-114));
            while (var5_ref_vnLifetime1 != null) {
              var5_ref_vnLifetime1.brickBounceCount = dp.field_r[10] - 2;
              var5_ref_vnLifetime1 = (Ball) (var8.activeBalls.next((byte) 116));
            }
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 54) {
            fieldTemp$0 = var8.levelIndex + 1;
            var8.levelIndex = var8.levelIndex + 1;
            if (DualLinkNode.field_q > fieldTemp$0) {
              var8.field_Z = 0;
            } else {
              var8.field_Z = 5;
            }
            this.field_s = true;
            var8.field_P = 0;
            return true;
          }
          if (obfuscationGuard == 55) {
            for (var5Lifetime2 = 0; 29 > var5Lifetime2; var5Lifetime2++) {
              if (to.field_f[var5Lifetime2] > -1) {
                var7.field_o[var5Lifetime2] = (byte)(-1 + to.field_f[var5Lifetime2]);
              }
            }
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 56) {
            var8.field_rb = 5;
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard >= 16 &&
            25 >= obfuscationGuard) {
            var5Lifetime2Lifetime1 = -16 - (-obfuscationGuard - 1);
            this.field_s = true;
            if (pe.field_l[81]) {
              var5Lifetime2Lifetime1 += 10;
            }
            if (var5Lifetime2Lifetime1 <= 11) {
              oa.field_Sb = rd.a(var5Lifetime2Lifetime1, (byte) 19);
              return true;
            }
          }
          if (70 == obfuscationGuard) {
            var8.field_l = 6;
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 69) {
            this.field_s = true;
            var7.field_hb = -1 + dp.field_r[29];
            return true;
          }
          if (obfuscationGuard == 40) {
            var7.field_u = -1 + dp.field_r[30];
            this.field_s = true;
            return true;
          }
          if (41 == obfuscationGuard) {
            var7.field_u = dp.field_r[31] - 1;
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 32) {
            var7.field_N = dp.field_r[32] - 1;
            this.field_s = true;
            return true;
          }
          if (obfuscationGuard == 35) {
            var7.field_N = -1 + dp.field_r[33];
            this.field_s = true;
            return true;
          }
          if (49 == obfuscationGuard) {
            this.field_s = true;
            var7.field_m = dp.field_r[39] - 5;
            return true;
          }
          if (obfuscationGuard == 36) {
            this.field_s = true;
            var7.score = dp.field_r[40] - 20;
            return true;
          }
          if (38 == obfuscationGuard) {
            var8.field_Z = 0;
            this.field_s = true;
            var8.field_P = 0;
            return true;
          }
        }
        stackIn_152_0 = !(pf.field_p);
        return stackIn_152_0;
    }

    private final void a(int param0, int param1, long param2, boolean param3, int param4) {
        int var7 = 0;
        if (!this.field_s) {
          if (og.h(-26090)) {
            return;
          }
          param1 = param1 + param0 * 1000;
          var7 = param3 ? 1 : 0;
          hq.a(param1, var7, param4 - 468, ((int)param2 + 500) / param4);
          return;
        }
    }

    final void b(int param0) {
        if (!this.field_p) {
          throw new IllegalStateException();
        }
        this.match.playerMaskOne = this.match.playerMaskOne | 1 << this.field_k;
        int var2 = 116 % ((param0 + 55) / 62);
        k.field_h.writeCipheredOpcode(-13413, 66);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (this.a(param2, 1)) {
          return;
        }
        if (param0) {
          this.field_q = true;
        }
        if (!this.field_s) {
          var4 = this.match.playerBoards[0].score;
          var5 = this.match.playerBoards[0].levelIndex;
          fp.field_z = fp.field_z - (this.field_t + var4);
          ep.field_i = ep.field_i + (-this.field_t + var5);
          lp.field_wb.addLast(new e(param2, param1, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
          fp.field_z = fp.field_z - (-this.field_t + var5);
          ep.field_i = ep.field_i + (this.field_t + var4);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var3Lifetime1;
        if (param0 != 119) {
          return;
        }
        for (var3 = 0; var3 < this.match.playerBoards.length; var3++) {
          this.match.playerBoards[var3].levelIndex = param1;
        }
        if (this.match.playerCount == 1) {
          this.field_t = param1;
          this.field_i = param1;
          var3Lifetime1 = param1;
          fp.field_z = fp.field_z + var3Lifetime1;
          w.field_r = lg.a(2, this.match.configuration.getLevelTitle(this.field_i, (byte) -122), -1);
        }
    }

    final static void b(byte param0, boolean param1) {
        int var2 = 9 % ((param0 + 73) / 49);
        String[] var3 = new String[]{tb.field_cb == null ? we.field_c : tb.field_cb, pg.field_q};
        LevelSequence var4 = new LevelSequence(qh.field_b, kk.createIndexOrder(false, qh.field_b.levelCount, hi.field_w), 3);
        r.field_A = false;
        oa.field_Sb = rd.a(0, (byte) 19);
        sk.a(var3, 0, var4, 2, param1, -12665);
    }

    final void a(BitPacketBuffer param0, int param1) {
        int var3_int = 0;
        byte dupTemp$0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var3_int = param1; this.match.playerCount > var3_int; var3_int++) {
            dupTemp$0 = param0.readByte(true);
            this.match.field_m[var3_int] = dupTemp$0;
            stackIn_5_0 = op.field_a;
            stackIn_6_1 = !(0 > dupTemp$0);
            op.field_a = stackIn_5_0 | stackIn_6_1;
          }
          this.match.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qj.Q(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_l = null;
        int var1 = 47 / ((param0 - 14) / 59);
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
          this.field_n = true;
        }
        if (this.match.playerCount == 1) {
          var3 = param0;
          ep.field_i = ep.field_i - var3;
        }
        this.field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        int var4Lifetime1;
        if (this.a(param0, 1)) {
          return;
        }
        if (!this.field_s) {
          var4 = param0;
          var5 = param2;
          if ((255 ^ var5) != var4) {
            throw new IllegalArgumentException();
          }
          var6 = ed.field_f[var4];
          if (0 > var6) {
            throw new IllegalArgumentException();
          }
          ek.field_kb = ek.field_kb + hg.field_e;
          var7 = 1 << var6;
          hg.field_e = hg.field_e ^ var7;
          ek.field_kb = ek.field_kb - hg.field_e;
          lp.field_wb.addLast(new e(param0, param2, hg.field_e, ek.field_kb, tm.field_g, qm.field_a), (byte) 3);
        }
        var4Lifetime1 = 90 % ((param1 - 36) / 46);
    }

    private final void a(byte param0, int param1, int param2) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (this.a(param1, 1)) {
          return;
        }
        if (param0 <= 17) {
          return;
        }
        if (this.field_s) {
        } else {
          if (param1 == 7) {
            fp.field_z = fp.field_z - this.field_t;
          } else {
            ep.field_i = ep.field_i - this.field_t;
          }
          lp.field_wb.addLast(new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
          if (param1 != 7) {
            ep.field_i = ep.field_i + this.field_t;
          } else {
            fp.field_z = fp.field_z + this.field_t;
          }
        }
    }

    private final boolean a(NodeDeque param0, boolean param1, NodeDeque param2) {
        NodeDeque stackIn_4_0 = null;
        int stackIn_107_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        NodeDeque var5 = null;
        int var6_int = 0;
        PlayerBoard var6 = null;
        int var7 = 0;
        int var8_int = 0;
        PlayerBoard var8 = null;
        PowerUp var9_ref_ge = null;
        int var9 = 0;
        int var10 = 0;
        p var10_ref_p = null;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        PlayerBoard var16 = null;
        PlayerBoard var17 = null;
        PlayerBoard var18 = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 0;
          if (!this.field_p) {
            stackIn_4_0 = new NodeDeque();
          } else {
            stackIn_4_0 = null;
          }
          var5 = stackIn_4_0;
          for (var6_int = 0; var6_int < this.match.playerCount; var6_int++) {
            var16 = this.match.playerBoards[var6_int];
            if ((1 << var6_int & (this.match.playerMaskOne | (this.match.playerMaskTwo | this.match.playerMaskThree))) != 0) {
              var16.field_U = var16.field_U + 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if ((1 << var6_int & this.field_o) == 0) {
              decompiledFrameRemainder0 = (var16.field_q != 0);
              if (decompiledFrameRemainder0) {
                var8_int = 1;
                if (var16.field_q > 25) {
                  var8_int = 3;
                }
                if (50 < var16.field_q) {
                  var8_int = -25 + var16.field_q;
                }
                var9 = 0;
                var10_ref_p = (p) (var16.field_eb.first(-84));
                while (var9 < var8_int) {
                  this.match.applyPendingPowerUps((byte) 120, var6_int);
                  var16.field_db = var10_ref_p.a((byte) -104);
                  this.match.a(var16, param0, var5, 0);
                  var16.simulationTick = var16.simulationTick + 1;
                  if (var10_ref_p.c(1)) {
                    var10_ref_p.unlink((byte) 111);
                    var16.field_p = var10_ref_p.field_k;
                    if (var10_ref_p.field_l) {
                      var11 = null;
                      var12 = var16.a(param1, (StringBuilder) (var11)) ^ var16.nextRandomInt(120);
                      if (var10_ref_p.field_m != var12) {
                        hn.a((byte) 91);
                        rk.a("T2 " + var10_ref_p.field_m + " " + var12 + " ", (Throwable) null, 54);
                        cf.field_a = cf.field_a + 1;
                      }
                    }
                    var10_ref_p = (p) (var16.field_eb.first(-21));
                  }
                  var9++;
                  var16.field_q = var16.field_q - 1;
                }
              }
            } else {
              if (this.field_p) {
                var8_int = var16.simulationTick - var16.field_E;
                decompiledFrameRemainder0 = (!(var8_int > 30) ||
                  0 != MembershipBenefitsScreen.field_x % 10);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (!(40 < var8_int) ||
                  0 != MembershipBenefitsScreen.field_x % 5))) {
                  decompiledFrameRemainder0 = (50 != var8_int);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (((this.match.playerMaskThree | (this.match.playerMaskTwo | this.match.playerMaskOne)) & 1 << var6_int) == 0))) {
                this.match.applyPendingPowerUps((byte) 127, var6_int);
                this.match.a(var16, param2, var5, 0);
                if (!this.field_p) {
                  this.match.distributeQueuedAttacks(var6_int, 1, var5, (byte) -122);
                  var16.field_p = var16.field_Q;
                }
                var4_int = var4_int | 1;
                var16.simulationTick = var16.simulationTick + 1;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var5 != null) {
                var5.clear((byte) -110);
              }
              var16.c(-101);
            }
          }
          var6_intLifetime1 = 0;
          if (!param1) {
            this.field_k = 29;
          }
          while (this.match.playerCount > var6_intLifetime1) {
            var17 = this.match.playerBoards[var6_intLifetime1];
            var8_intLifetime1 = 0;
            var9_ref_ge = (PowerUp) (var17.fallingPowerUps.first(-48));
            while (var9_ref_ge != null) {
              var8_intLifetime1 = var8_intLifetime1 | 1 << var9_ref_ge.typeId;
              var9_ref_ge = (PowerUp) (var17.fallingPowerUps.next((byte) 116));
            }
            var15 = 0;
            var9Lifetime1 = var15;
            while (var15 < 29) {
              if (to.field_f[var15] >= 1) {
                var10 = (20 * var17.field_o[var15] << 8) / to.field_f[var15];
                if ((1 << var15 & var8_intLifetime1) != 0) {
                  var10 = 5120;
                }
                var17.field_xb[var15] = var17.field_xb[var15] + (-var17.field_cb[var15] + var10) / 100;
                var17.field_xb[var15] = 7 * var17.field_xb[var15] / 8;
                if (512 < var17.field_xb[var15]) {
                  var17.field_xb[var15] = 512;
                }
                if (var17.field_xb[var15] < -512) {
                  var17.field_xb[var15] = -512;
                }
                var17.field_cb[var15] = var17.field_cb[var15] + var17.field_xb[var15];
                if (var17.field_xb[var15] > 0 &&
                  var17.field_cb[var15] > var10 ||
                  !(var17.field_xb[var15] >= 0) &&
                  !(var10 <= var17.field_cb[var15])) {
                  var17.field_cb[var15] = var10;
                }
              }
              var15++;
            }
            var6_intLifetime1++;
          }
          if (this.match.playerCount > 1) {
            for (var6_intLifetime2 = 0; var6_intLifetime2 < this.match.playerCount; var6_intLifetime2++) {
              var18 = this.match.playerBoards[var6_intLifetime2];
              var8_intLifetime2 = var18.field_p + var18.boardOffset << 8;
              var18.field_J = var18.field_J + (var8_intLifetime2 - var18.field_G) / 100;
              var18.field_J = 7 * var18.field_J / 8;
              if (var18.field_J > 1280) {
                var18.field_J = 1280;
              }
              var18.field_G = var18.field_G + var18.field_J;
              if (var18.field_G > var8_intLifetime2) {
                var18.field_G = var8_intLifetime2;
              }
            }
          }
          if (this.match.playerCount > 1) {
            var6_intLifetime3 = this.match.a(125);
            for (var7 = 0; this.match.playerCount > var7; var7++) {
              var8 = this.match.playerBoards[var7];
              if ((1 << var7 & var6_intLifetime3) != 0) {
                if (var8.field_M == -1) {
                  var8.field_M = 500;
                }
              } else {
                var8.field_M = -1;
              }
            }
          }
          if (!this.field_p) {
            if (this.match.playerCount == 1) {
              var6 = this.match.playerBoards[0];
              if (var6.field_Z == 8 ||
                var6.field_Z == 9) {
                this.a((byte) 40, false);
                if (8 != var6.field_Z) {
                  cc.field_G = true;
                }
              }
            } else {
              if (!this.match.field_c) {
                this.match.playerMaskThree = this.match.playerMaskThree | this.match.getStateSevenPlayerMask(-17566);
                this.match.playerMaskTwo = this.match.playerMaskTwo | this.match.getStateZeroPlayerMask((byte) -92);
                if (this.match.b(82)) {
                  if (-1 == this.match.field_h) {
                    this.match.field_h = 0;
                  }
                  var6_intLifetime4 = this.match.field_h;
                  var7Lifetime1 = 1 - this.match.field_h;
                  if ((this.match.playerMaskThree & 1 << var7Lifetime1) != 0) {
                    var6_intLifetime4 = var7Lifetime1;
                  }
                  this.match.playerBoards[var6_intLifetime4].field_zb = 1;
                  this.match.field_m[0] = var6_intLifetime4;
                  this.match.playerBoards[-var6_intLifetime4 + 1].field_zb = 2;
                  this.match.field_m[1] = 1 - var6_intLifetime4;
                  this.match.a(false);
                  op.field_a = true;
                }
              }
            }
          }
          stackIn_107_0 = var4_int;
          return stackIn_107_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_110_0 = var4;
          stackIn_110_1 = new StringBuilder().append("qj.P(");
          if (param0 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          stackIn_113_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(')').toString());
        }
    }

    private final void a(LevelPack param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (this.field_s) {
            return;
          }
          ep.field_i = ep.field_i + (param3 + param0.scoreOffset);
          if (param2 > -87) {
            this.field_p = true;
          }
          fp.field_z = fp.field_z - (param1 + this.field_t);
          var5 = new pn(param0.packId, -1 + param3, fp.field_z, ep.field_i, od.field_c, og.field_Wb);
          IntNode.field_j.addLast(var5, (byte) 3);
          fp.field_z = fp.field_z - (param0.scoreOffset + param3);
          ep.field_i = ep.field_i + (param1 + this.field_t);
          if (hh.field_b[param0.packId] < param3) {
            hh.field_b[param0.packId] = param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("qj.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        PowerUp var6 = null;
        try {
          var3_int = param0.readUnsignedByte(255);
          var4 = param0.readUnsignedByte(255);
          var5 = param0.readInt(255);
          var6 = new PowerUp(0, 0, var4);
          int var7 = 102 / ((-65 - param1) / 34);
          var6.activationTick = var5;
          this.match.playerBoards[var3_int].powerUpHistory.append(var6, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "qj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, PlayerBoard param1) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param1.field_db = 0;
          if (pe.field_l[param1.field_bb]) {
            param1.field_db = param1.field_db | 1;
          }
          if (pe.field_l[param1.field_j]) {
            param1.field_db = param1.field_db | 2;
          }
          if (pe.field_l[param1.field_I]) {
            param1.field_db = param1.field_db | 4;
          }
          if (param0 <= 50) {
            this.b(60);
          }
          if (this.match.playerCount == 1 ||
            this.field_p) {
            if (pe.field_l[ah.field_w[1][0]]) {
              param1.field_db = param1.field_db | 1;
            }
            if (pe.field_l[ah.field_w[1][1]]) {
              param1.field_db = param1.field_db | 2;
            }
            if (!pe.field_l[ah.field_w[1][2]]) {
              return;
            }
            param1.field_db = param1.field_db | 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qj.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_59_0 = false;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        boolean stackIn_61_3 = false;
        PlayerBoard stackIn_64_4;
        int stackIn_64_5;
        int stackIn_64_6;
        boolean stackIn_66_7 = false;
        int stackIn_69_0 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        boolean stackIn_74_3 = false;
        PlayerBoard stackIn_77_4;
        int stackIn_77_5;
        int stackIn_77_6;
        boolean stackIn_79_7;
        int stackIn_83_0 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        boolean stackIn_88_3;
        int[] var2;
        int[] var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        PlayerBoard var7_ref_j;
        int var8_int;
        RgbSprite var8;
        int var9;
        int var10;
        int var11;
        tp[] var12;
        Paddle var13;
        int[] var14;
        int[] var15;
        int[] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        RgbSprite var20;
        int[] var21;
        int[] var22;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var9Lifetime3;
        int var10Lifetime1Lifetime1;
        var11 = BrickABrac.field_J ? 1 : 0;
        var4 = -76 / ((-79 - param0) / 35);
        var14 = kh.field_c[this.match.playerCount - 1];
        var2 = var14;
        var15 = kh.field_e[this.match.playerCount - 1];
        var3 = var15;
        var5 = kh.field_h[-1 + this.match.playerCount];
        var6 = this.field_m;
        if (null != oa.field_Sb) {
          for (var7 = 0; var7 < this.match.playerCount; var7++) {
            var13 = this.match.playerBoards[var6].paddle;
            if (1 == this.match.playerCount) {
              var9 = (-((var13.x256 + var13.width256 / 2 << 8) * 2) + 33423360) / 510;
              oa.field_Sb.a(true, var9, 0, 0, 0);
              if (oa.field_Sb.field_m == 7 ||
                this.match.playerBoards[var6].field_Z == 5) {
                gh.a(121, true);
              }
              if (MenuScreen.field_i <= 0) {
                break;
              }
              var10 = MenuScreen.field_i * 256 / 32;
              nk.field_c.b(0, 0, var10);
              break;
            }
            var14 = var2;
            var15 = var3;
            if (var5[var7] != 1) {
              var14 = var2;
              var15 = var3;
              MovingBody.a((byte) 124, 153 + var14[var7], var14[var7], var15[var7], 233 + var15[var7]);
              oa.field_Sb.a((byte) -102, var6, var14[var7], var15[var7]);
              sc.b(-79);
            } else {
              MovingBody.a((byte) 76, 306 + var14[var7], var14[var7], var15[var7], var15[var7] + 480);
              var9Lifetime3 = (-(2 * (var13.x256 + var13.width256 / 2 << 8)) + 20054016) / 306;
              oa.field_Sb.a(var15[var7], (byte) -107, var14[var7], var6, var9Lifetime3 / 2);
              sc.b(-122);
            }
            var6++;
            var6 = var6 % this.match.playerCount;
          }
        }
        if (oa.field_Sb != null) {
          var14 = var2;
          var15 = var3;
          if (this.match.playerCount > 2) {
            for (var7Lifetime1 = this.match.playerCount; var7Lifetime1 < 5; var7Lifetime1++) {
              oa.field_Sb.a((byte) -79, -1, var14[var7Lifetime1], var15[var7Lifetime1]);
              Rasterizer2D.fillRectangleAlpha(var14[var7Lifetime1], var15[var7Lifetime1], 153, 233, 0, 160);
            }
          }
        }
        var6Lifetime1 = this.field_m;
        for (var7Lifetime2 = 0; var7Lifetime2 < this.match.playerCount; var7Lifetime2++) {
          if (~tn.field_C != ~var5[var7Lifetime2]) {
            gr.b(var5[var7Lifetime2], -28463);
          }
          BitPacketBuffer.drawBoard((byte) 90, var6Lifetime1, var5[var7Lifetime2], var15[var7Lifetime2], this.match, var14[var7Lifetime2]);
          var6Lifetime1++;
          var6Lifetime1 = var6Lifetime1 % this.match.playerCount;
        }
        if (this.match.playerCount != 1) {
          if (2 != this.match.playerCount) {
            var22 = kh.field_e[4];
            var17 = var22;
            var3 = var17;
            var21 = kh.field_c[4];
            var16 = var21;
            var2 = var16;
            nh.a(169, 482, -40, -1, cd.field_h, -1);
            nh.a(169, 482, -40, 472, cd.field_h, -1);
            stackIn_83_0 = ((this.field_o & 1 << this.field_m) == 0) ? 0 : 1;
            var7Lifetime3 = stackIn_83_0;
            stackIn_86_0 = this.field_n;
            stackIn_86_1 = -103;
            stackIn_86_2 = var21[0];
            stackIn_88_3 = (var7Lifetime3 != 0) || (0 == this.field_o);
            om.$cfr$intArgs$a$687785aae666(stackIn_86_0, stackIn_86_1, stackIn_86_2, stackIn_88_3, this.match.playerBoards[this.field_m], var22[0], this.field_m, var7Lifetime3 != 0, this.match);
            nh.a(169, 9, -40, -1, cd.field_h, 0 + (var22[2] - 3));
            nh.a(169, 9, -40, 472, cd.field_h, -3 + var22[2] - 0);
          } else {
            stackIn_44_0 = (this.field_p) ? 0 : 1;
            var7Lifetime3 = stackIn_44_0;
            if (this.field_p) {
              stackIn_50_0 = (this.field_o == 0) ? 1 : 0;
            } else {
              stackIn_50_0 = 1;
            }
            var8_int = stackIn_50_0;
            if (this.field_p) {
              stackIn_53_0 = this.field_m;
            } else {
              stackIn_53_0 = 1;
            }
            var9Lifetime1 = stackIn_53_0;
            stackIn_56_0 = ((this.field_o & 1 << var9Lifetime1) == 0) ? 0 : 1;
            var10Lifetime1 = stackIn_56_0;
            stackIn_59_0 = this.field_n;
            stackIn_59_1 = -103;
            stackIn_59_2 = var14[0];
            stackIn_61_3 = (var8_int != 0) || (var10Lifetime1 != 0);
            stackIn_64_4 = this.match.playerBoards[var9Lifetime1];
            stackIn_64_5 = var15[0];
            stackIn_64_6 = var9Lifetime1;
            stackIn_66_7 = (var7Lifetime3 != 0) || (var10Lifetime1 != 0);
            om.$cfr$intArgs$a$687785aae666(stackIn_59_0, stackIn_59_1, stackIn_59_2, stackIn_61_3, stackIn_64_4, stackIn_64_5, stackIn_64_6, stackIn_66_7, this.match);
            var9Lifetime1 = 1 - var9Lifetime1;
            stackIn_69_0 = (0 == (1 << var9Lifetime1 & this.field_o)) ? 0 : 1;
            var10Lifetime1Lifetime1 = stackIn_69_0;
            stackIn_72_0 = this.field_n;
            stackIn_72_1 = -103;
            stackIn_72_2 = var14[1];
            stackIn_74_3 = (var8_int != 0) || (var10Lifetime1Lifetime1 != 0);
            stackIn_77_4 = this.match.playerBoards[var9Lifetime1];
            stackIn_77_5 = var15[1];
            stackIn_77_6 = var9Lifetime1;
            stackIn_79_7 = (var7Lifetime3 != 0) || (var10Lifetime1Lifetime1 != 0);
            om.$cfr$intArgs$a$687785aae666(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_74_3, stackIn_77_4, stackIn_77_5, stackIn_77_6, stackIn_79_7, this.match);
          }
        } else {
          var7_ref_j = this.match.playerBoards[0];
          nh.a(526, 482, -40, -1, cd.field_h, -1);
          Rasterizer2D.fillRectangleAlpha(7, 473, 510, 7, 0, 96);
          Rasterizer2D.fillRectangleAlpha(524, 0, 116, 480, 0, 96);
          nh.a(125, 482, -40, 516, cd.field_h, -1);
          DualLinkNode.a(130, this.match, nn.field_g, var7_ref_j, (byte) -104, 527, 10, 85);
          nh.a(125, 9, -40, 516, cd.field_h, 137);
          if (!r.field_A ||
            wc.field_b) {
            ua.a(var7_ref_j, 524, 85, -68, 147, 81, this.match);
          }
          nh.a(125, 9, -40, 516, cd.field_h, 229);
          a.a(640, this.match, var7_ref_j);
          if (r.field_A &&
            ka.a((byte) 124)) {
            ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
          } else {
            if (null != var7_ref_j.field_fb) {
              var12 = (tp[]) null;
              ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
            }
          }
        }
        if (this.match.playerCount > 1 &&
          ((this.match.playerMaskTwo | this.match.playerMaskOne) & 1 << this.field_m) == 0) {
          v.a(var2[0], 424, false, this.match, this.field_m, var3[0]);
        }
        if (this.match.playerCount == 2 &&
          0 == (1 << 1 - this.field_m & (this.match.playerMaskTwo | this.match.playerMaskOne))) {
          v.a(var2[1], 424, false, this.match, 1 - this.field_m, var3[1]);
        }
        var19 = kh.field_e[this.match.playerCount - 1];
        var6Lifetime2 = this.field_m;
        var18 = kh.field_c[this.match.playerCount - 1];
        for (var7Lifetime4 = 0; this.match.playerCount > var7Lifetime4; var7Lifetime4++) {
          if (var5[var7Lifetime4] == 2) {
            var20 = ScorePopup.field_k[this.match.playerBoards[var6Lifetime2].field_H];
            var8 = var20;
            var9Lifetime2 = ob.field_D.field_F + ob.field_D.field_P;
            Rasterizer2D.fillRectangleAlpha(var18[var7Lifetime4], 235 + var19[var7Lifetime4] - 23, 153, var9Lifetime2, 0, 141);
            var8.drawTransparent(-var20.canvasWidth + (153 + var18[var7Lifetime4]), 0 + (-var20.canvasHeight + var19[var7Lifetime4]) + 233);
            ce.field_e.c(this.match.playerNames[var6Lifetime2], var18[var7Lifetime4] + 4, 2 + var19[var7Lifetime4] + 223, 2, -1);
          }
          var6Lifetime2++;
          var6Lifetime2 = var6Lifetime2 % this.match.playerCount;
        }
    }

    GameplayScreen(String[] param0, int param1, int param2, LevelSequence param3, int[] param4, int[] param5) {
        this(false, false, param0, param1, param2, param3, param4, param5);
    }

    final void f(int param0) {
        if (!this.field_p) {
          throw new IllegalStateException();
        }
        k.field_h.writeCipheredOpcode(-13413, 67);
        int var2 = 68 % ((param0 + 65) / 59);
    }

    GameplayScreen(boolean param0, boolean param1, String[] param2, int param3, int param4, LevelSequence param5, int[] param6, int[] param7) {
        super(-1);
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var9 = null;
        int var9_int = 0;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var10Lifetime1;
        this.field_x = 0;
        this.field_s = false;
        try {
          stackIn_4_1 = (param1);
          this.field_n = stackIn_4_1;
          stackIn_7_1 = (param0);
          this.field_p = stackIn_7_1;
          this.field_o = param4;
          this.field_k = param3;
          stackIn_10_1 = !(kb.field_Yb < 2);
          this.field_y = stackIn_10_1;
          var14 = pl.field_b;
          var13 = var14;
          var12 = var13;
          var9 = var12;
          for (var10 = 0; 8 > var10; var10++) {
            var14[var10] = 0;
          }
          this.match = new MultiplayerMatch(param2, this.field_o, param5, param6, param7);
          var9_int = 0;
          for (var10Lifetime1 = 0; this.match.playerCount > var10Lifetime1; var10Lifetime1++) {
            if ((this.field_o & 1 << var10Lifetime1) != 0) {
              var9_int++;
            }
          }
          if (var9_int == 2) {
            stackIn_23_1 = 1;
          } else {
            if (this.field_k < 0) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = this.field_k;
            }
          }
          this.field_m = stackIn_23_1;
          if (oo.field_w == null) {
            oo.field_w = new IsaacGenerator(new int[]{(int)ue.a(false)});
          }
          MenuScreen.field_i = 0;
          to.field_k = kl.a(ta.field_e[2], 256, 0);
          me.field_d = kl.a(ta.field_e[2], 256, 0);
          to.field_k.f(-1);
          me.field_d.f(-1);
          sk.a((byte) 125, to.field_k);
          sk.a((byte) 5, me.field_d);
          tn.field_C = 1;
          gr.b(tn.field_C, -28463);
          pg.field_m = -1;
          dj.field_b = -1;
          if (jo.field_j == null) {
            jo.field_j = rd.a(cm.field_p, new String[]{""}, (byte) 103).toLowerCase();
            ff.field_j = pn.field_j.toLowerCase();
          }
          be.field_j = 0;
          op.field_a = false;
          fl.field_l = ue.a(false);
          gq.field_Yb = param5.pack.packId;
          DualLinkNode.field_q = param5.getPeriod(96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_31_0 = var9_ref;
          stackIn_31_1 = new StringBuilder().append("qj.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param6 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param7 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static {
    }
}
