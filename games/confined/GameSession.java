/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSession {
    TunnelCamera field_m;
    static String field_p;
    wc field_Q;
    static boolean field_I;
    static boolean field_D;
    static String field_e;
    TunnelMesh field_x;
    static od field_f;
    PrimaryNodeDeque field_g;
    PlayerShip field_B;
    static int[] field_C;
    DequeCursor field_N;
    DequeCursor field_w;
    PrimaryNodeDeque field_b;
    PrimaryNodeDeque field_F;
    PrimaryNodeDeque field_z;
    double field_E;
    PrimaryNodeDeque field_u;
    int field_o;
    double field_s;
    boolean field_P;
    int field_c;
    double field_l;
    boolean field_d;
    boolean field_v;
    gk field_n;
    double field_A;
    int field_j;
    double field_r;
    int field_L;
    double field_H;
    boolean field_t;
    int field_h;
    kl field_a;
    boolean field_i;
    boolean field_y;
    boolean field_M;
    un field_K;
    StageDirector field_J;
    private int field_G;
    private wd field_k;
    private wd field_O;
    private double field_q;

    private final void resolveForwardProjectileCollisions(int param0) {
        TunnelEntity var2;
        int var3;
        ProjectileRay var4;
        int var5;
        TunnelEntity var6;
        int var7;
        TunnelEntity var8;
        int var9;
        var9 = Confined.field_J ? 1 : 0;
        var2 = (TunnelEntity) (this.field_g.beginForward(88));
        var3 = 1;
        var4 = (ProjectileRay) (this.field_b.beginForward(param0 ^ 115));
        if (param0 != -2) {
          GameSession.pollLobbyConnection(-46);
        }
        while (var4 != null) {
          if (var4.field_K >= 0.0) {
            while (this.field_x.field_a > var3) {
              if (this.field_x.field_r[var3] < var4.field_X) {
                var3++;
                continue;
              }
              break;
            }
            while (var2 != null) {
              if (var2.field_D + var2.field_C < var4.field_X) {
                var2 = (TunnelEntity) (this.field_g.nextForward(2123));
                continue;
              }
              break;
            }
            var5 = var3;
            var6 = (TunnelEntity) (this.field_N.startBackwardAt(var2, 6));
            var7 = 0;
            var4.field_y = 1.7976931348623157e+308;
            while (var5 < this.field_x.field_a) {
              if (var7 == 0 ||
                var4.field_eb > this.field_x.field_r[var5]) {
                var8 = this.field_x.field_y[var5];
                var6 = var8;
                var6 = var8;
                while (var6 != null &&
                  var8 != var6) {
                  if (var7 == 0 ||
                    var6.field_D - var6.field_C < var4.field_eb) {
                    if (var4.a(0, var7 != 0, var6)) {
                      var7 = 1;
                    }
                    var6 = (TunnelEntity) (this.field_N.previousNode(-109));
                    continue;
                  }
                  break;
                }
                if (var4.b(var7 != 0, param0 ^ -30, var5)) {
                  var7 = 1;
                }
                var5++;
                continue;
              }
              break;
            }
            while (var6 != null) {
              if (var7 == 0 ||
                var6.field_D - var6.field_C < var4.field_eb) {
                if (var4.a(0, var7 != 0, var6)) {
                  var7 = 1;
                }
                var6 = (TunnelEntity) (this.field_N.previousNode(105));
                continue;
              }
              break;
            }
            if (var7 == 0) {
              var4.i(1);
            }
            if (null != var4.field_S) {
              var4.field_S.onProjectileHit(var4, 124);
            }
          }
          var4 = (ProjectileRay) (this.field_b.nextForward(2123));
        }
    }

    private final void prepareEffectDrawQueue(int param0) {
        dc var2;
        dc var3;
        int var4;
        ProjectileRay var5;
        LightningArc var6;
        var4 = Confined.field_J ? 1 : 0;
        var5 = (ProjectileRay) (this.field_b.beginForward(param0 ^ 22168));
        while (var5 != null) {
          if (!var5.a(this.field_m, -1073453180)) {
            var5.unlink(true);
          }
          var5 = (ProjectileRay) (this.field_b.nextForward(2123));
        }
        var6 = (LightningArc) (this.field_F.beginForward(50));
        while (var6 != null) {
          if (!var6.a(this.field_m, -1073453180)) {
            var6.unlink(true);
          }
          var6 = (LightningArc) (this.field_F.nextForward(2123));
        }
        e.a(this.field_b, (byte) -121);
        e.a(this.field_F, (byte) 123);
        var2 = (dc) (this.field_b.beginForward(param0 - 22095));
        var3 = (dc) (this.field_F.beginForward(116));
        while (var2 != null) {
          if (null != var3) {
            if (!(var2.field_I < var3.field_I)) {
              this.field_k.a(var3, (byte) 126);
              var3 = (dc) (this.field_F.nextForward(2123));
              continue;
            }
            this.field_k.a(var2, (byte) 115);
            var2 = (dc) (this.field_b.nextForward(2123));
            continue;
          }
          break;
        }
        while (null != var2) {
          this.field_k.a(var2, (byte) 116);
          var2 = (dc) (this.field_b.nextForward(2123));
        }
        if (param0 != 22189) {
          return;
        }
        while (var3 != null) {
          this.field_k.a(var3, (byte) 114);
          var3 = (dc) (this.field_F.nextForward(param0 ^ 24294));
        }
        this.field_q = 1.7976931348623157e+308;
    }

    final void drawGameScene(byte param0) {
        int stackIn_6_0 = 0;
        double[] var2;
        int var3;
        PrimaryNodeDeque var4;
        int var5;
        double var6;
        TunnelEntity var8;
        DynamicLight var9;
        int var10;
        int var11;
        double var11_double;
        int var12;
        int var13;
        int var14;
        double[] var15;
        double[] var16;
        double[] var17;
        int var10Lifetime1;
        TunnelEntity var8Lifetime1;
        var14 = Confined.field_J ? 1 : 0;
        this.field_m.updateEffectiveViewOrigin(10959);
        var17 = new double[12];
        var16 = var17;
        var15 = var16;
        var2 = var15;
        this.field_m.field_X.a((byte) 52, var17);
        PcmOutputWorker.field_g = -4.0 * var17[11];
        IntrusiveDeque.field_a = -4.0 * var17[9];
        AccountRegistrationPanel.field_Z = var17[10] * -4.0;
        var3 = -91 / ((param0 - 45) / 32);
        if (this.field_x.field_a <= 1) {
          this.sortEntitiesByCameraDepth(938);
        } else {
          this.sortEntitiesByWorldDepth(-125);
        }
        var4 = this.collectSceneLights(true);
        stackIn_6_0 = (this.field_L <= 0) ? 0 : 1;
        var5 = stackIn_6_0;
        var6 = -this.field_A + this.field_E;
        this.field_x.projectAndLightTunnelSections(false, 64.0, var4, this.field_m);
        var8 = (TunnelEntity) (this.field_g.beginBackward(false));
        this.prepareEffectDrawQueue(22189);
        var9 = (DynamicLight) (var4.beginForward(85));
        for (var10 = -2 + this.field_x.field_a; var10 >= 0; var10--) {
          var11_double = this.field_x.field_r[var10 + 1];
          while (var8 != null) {
            if (var11_double < var8.field_D) {
              if (var5 != 0 &&
                var8.field_D < var6) {
                this.drawEffectsThroughDepth(true, var5 != 0, var6, true);
                var5 = 0;
                this.drawShockwaveCrossSection(var6, var10 + 1, (byte) 77);
              }
              while (var9 != null) {
                if (var8.field_D < -var9.field_n + var9.field_p) {
                  var9 = (DynamicLight) (var4.nextForward(2123));
                  continue;
                }
                break;
              }
              this.drawEffectsThroughDepth(true, var5 != 0, var8.field_D, false);
              var8.drawInTunnel(var4, 64.0, -31, this.field_m, var9);
              var8 = (TunnelEntity) (this.field_g.nextBackward((byte) -76));
              continue;
            }
            break;
          }
          if (var5 != 0 &&
            var6 > var11_double) {
            this.drawEffectsThroughDepth(true, var5 != 0, var6, true);
            var5 = 0;
            this.drawShockwaveCrossSection(var6, var10 + 1, (byte) 77);
          }
          this.drawEffectsThroughDepth(true, var5 != 0, var11_double, false);
          this.field_x.drawTunnelSegment(var10, this.field_m, 3);
        }
        while (var8 != null) {
          if (var5 != 0 &&
            var8.field_D < var6) {
            this.drawEffectsThroughDepth(true, var5 != 0, var6, true);
            var5 = 0;
            this.drawShockwaveCrossSection(var6, 0, (byte) 77);
          }
          while (var9 != null) {
            if (var8.field_D < var9.field_p - var9.field_n) {
              var9 = (DynamicLight) (var4.nextForward(2123));
              continue;
            }
            break;
          }
          this.drawEffectsThroughDepth(true, var5 != 0, var8.field_D, false);
          var8.drawInTunnel(var4, 64.0, -77, this.field_m, var9);
          var8 = (TunnelEntity) (this.field_g.nextBackward((byte) -113));
        }
        if (var5 != 0) {
          this.drawEffectsThroughDepth(true, var5 != 0, var6, true);
          var5 = 0;
          this.drawShockwaveCrossSection(var6, 0, (byte) 77);
        }
        this.drawEffectsThroughDepth(true, var5 != 0, -1.7976931348623157e+308, false);
        this.field_k.a(true);
        this.field_O.a(true);
        if (this.field_a != null &&
          this.field_a.field_z) {
          this.field_a = null;
        }
        if (md.a(-85)) {
          var8Lifetime1 = (TunnelEntity) (this.field_g.beginBackward(false));
          while (var8Lifetime1 != null) {
            var8Lifetime1.a(this.field_m, false);
            var8Lifetime1 = (TunnelEntity) (this.field_g.nextBackward((byte) 74));
          }
        }
        if (this.field_G > 0) {
          var10Lifetime1 = ((an) (this.field_u.beginForward(-126))).field_s;
          var11 = this.field_G;
          var12 = 0;
          if (var11 <= 40) {
            var12 = var12 + (-1600 + var11 * var11) * 240 / 1600;
          }
          if (var11 >= 190) {
            var13 = -190 + var11;
            var12 = var12 - 240 * var13 * var13 / 1600;
          }
          db.field_w[var10Lifetime1].drawDownscaledAreaBlended(var12 + 4, 340, 32, 32);
          pn.field_a.drawString(he.field_b[var10Lifetime1], 32 + (4 + (var12 + 4)), 362, 16777215, -1);
        }
    }

    final void addScore(byte param0, int param1) {
        if (param0 != 50) {
          this.field_P = true;
        }
        if (!of.field_a) {
          this.field_h = this.field_h + param1;
          we.field_g = we.field_g + param1;
        }
    }

    private final void sortProjectilesByDepth(int param0) {
        ProjectileRay var2 = null;
        ProjectileRay var3 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        ProjectileRay var2Lifetime1;
        ProjectileRay var3Lifetime1;
        if (param0 != 134217727) {
          this.field_a = (kl) null;
        }
        do {
          var2 = (ProjectileRay) (this.field_b.beginBackward(false));
          if (var2 == null) {
            return;
          }
          var3 = (ProjectileRay) (this.field_b.nextBackward((byte) -37));
          var4 = 1;
          while (var3 != null) {
            if (!(var3.field_X > var2.field_X)) {
              var2 = var3;
            } else {
              ri.a(var3, param0 - 134217727, var2);
              var4 = 0;
            }
            var3 = (ProjectileRay) (this.field_b.nextBackward((byte) -95));
          }
          if (var4 != 0) {
            return;
          }
          var3Lifetime1 = (ProjectileRay) (this.field_b.beginForward(11));
          var4 = 1;
          var2Lifetime1 = (ProjectileRay) (this.field_b.nextForward(2123));
          while (var2Lifetime1 != null) {
            if (var3Lifetime1.field_X > var2Lifetime1.field_X) {
              ri.a(var3Lifetime1, param0 - 134217727, var2Lifetime1);
              var4 = 0;
            } else {
              var3Lifetime1 = var2Lifetime1;
            }
            var2Lifetime1 = (ProjectileRay) (this.field_b.nextForward(2123));
          }
        } while (var4 == 0);
    }

    private final void drawShockwaveCrossSection(double param0, int param1, byte param2) {
        double var35_double = 0.0;
        int var37 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var35 = 0;
        int var36 = 0;
        int var34 = 0;
        int var38 = Confined.field_J ? 1 : 0;
        int var34Lifetime1;
        if (!(param1 <= this.field_x.field_a - 2)) {
          param1 = this.field_x.field_a - 2;
        }
        TunnelCamera var39 = this.field_m;
        if (param0 < var39.field_D) {
          param0 = var39.field_D;
        }
        this.field_x.interpolateCrossSectionCenter(param2 - 74, param1, param0);
        double var6 = this.field_s;
        double var8 = this.field_r;
        double var10 = this.field_A;
        if (var10 > 11.0) {
          var10 = 11.0;
        }
        var8 = var8 + var10 * (-var8 + this.field_x.field_G) / 11.0;
        var6 = var6 + var10 * (this.field_x.field_B - var6) / 11.0;
        double var12 = var6 - var39.field_T;
        double var14 = -var39.field_L + var8;
        double var16 = -var39.field_O + param0;
        double var18 = var39.field_R * var12 + var39.field_ab * var14 + var39.field_M * var16;
        double var20 = var39.field_F * var16 + (var14 * var39.field_U + var12 * var39.field_V);
        double var22 = var39.field_N * var16 + (var12 * var39.field_P + var14 * var39.field_H);
        if (var22 < 5.0) {
          var22 = 5.0;
        }
        int var24 = (int)(640.0 * (var18 / var22)) + 320;
        int var25 = (int)(var20 / var22 * 640.0) + 188;
        int var26 = (int)(640.0 * (var10 / var22));
        int var27 = (int)(512.0 * (-(var16 / 64.0) + 1.0));
        this.field_x.interpolateCrossSectionVertices(18081, param1, param0);
        if (var27 > 256) {
          var27 = 256;
        }
        int[] var41 = new int[this.field_x.field_f * 16];
        int[] var40 = var41;
        int[] var28 = var40;
        double var29 = this.field_x.field_B;
        double var31 = this.field_x.field_G;
        int var33 = 0;
        for (var34 = 0; var34 < 8; var34++) {
          var35_double = 1.0 - (double)var34 * 0.02;
          for (var37 = 0; var37 < this.field_x.field_f; var37++) {
            var8 = (-var31 + this.field_x.field_g[var37]) * var35_double + var31;
            var6 = (this.field_x.field_x[var37] - var29) * var35_double + var29;
            var16 = param0 - var39.field_O;
            var14 = -var39.field_L + var8;
            var12 = -var39.field_T + var6;
            var18 = var39.field_R * var12 + var39.field_ab * var14 + var16 * var39.field_M;
            var22 = var14 * var39.field_H + var39.field_P * var12 + var16 * var39.field_N;
            var20 = var39.field_U * var14 + var39.field_V * var12 + var16 * var39.field_F;
            if (0.5 > var22) {
              var22 = 0.5;
            }
            incrementValue$0 = var33;
            var33++;
            var28[incrementValue$0] = (int)(640.0 * (var18 / var22)) + 320;
            incrementValue$1 = var33;
            var33++;
            var28[incrementValue$1] = 188 + (int)(640.0 * (var20 / var22));
          }
        }
        if (param2 != 77) {
          this.field_G = 109;
        }
        var34Lifetime1 = this.field_x.field_f * 2;
        for (var35 = 0; var35 < 8; var35++) {
          PolygonScanlineRasterizer.resetEdges();
          PolygonScanlineRasterizer.addPolygonEdges(var41, var34Lifetime1 * var35, var34Lifetime1);
          if (var35 < 7) {
            PolygonScanlineRasterizer.addPolygonEdges(var41, var34Lifetime1 + var35 * var34Lifetime1, var34Lifetime1);
          }
          var36 = (-this.field_L + 100) * uc.field_db.length / 100;
          uc.field_db[var36].drawScaledAdditiveWithinScanlineMask(var24 - var26, -var26 + var25, 2 * var26, 2 * var26, (1 + var35) * var27 / 8);
        }
    }

    final static int getDialogContentWidth(int param0) {
        if (param0 != 24860) {
          return 50;
        }
        return AccountCreationResultPanel.field_Eb - ef.field_sb;
    }

    private final void resolveProjectileCollisions(int param0) {
        if (param0 != 320) {
          this.drawGameScene((byte) -83);
        }
        this.sortProjectilesByDepth(param0 + 134217407);
        this.resolveForwardProjectileCollisions(param0 ^ -322);
        this.resolveBackwardProjectileCollisions(1);
    }

    private final void indexDepthOverlapCandidates(byte param0) {
        TunnelEntity var3;
        Object var4;
        Object var5;
        int var6;
        TunnelEntity var7;
        int var8;
        Object var8_ref;
        double var8_double;
        Object var10;
        int var11;
        wd var12;
        Object var10Lifetime1;
        var11 = Confined.field_J ? 1 : 0;
        var12 = this.buildEntityQueueByNearDepth((byte) -26);
        this.sortEntitiesByFarDepth((byte) 120);
        var3 = (TunnelEntity) (this.field_g.beginForward(8));
        var4 = null;
        var5 = null;
        var6 = 0;
        var7 = (TunnelEntity) (var12.d(28));
        while (this.field_x.field_a > var6) {
          var8_double = this.field_x.field_r[var6];
          while (var3 != null) {
            if (var8_double > var3.field_C + var3.field_D) {
              if (var3.participatesInEntityCollisions((byte) 85)) {
                while (var7 != null) {
                  if (var7.field_D - var7.field_C < var3.field_C + var3.field_D) {
                    if (var7.participatesInEntityCollisions((byte) 67) && (var4 == null ||
                      var7.field_C + var7.field_D >= ((TunnelEntity) (var4)).field_C + ((TunnelEntity) (var4)).field_D)) {
                      var4 = var7;
                    }
                    if (var7.participatesInTunnelCollisions(8)) {
                      if (var5 != null &&
                        !(((TunnelEntity) (var5)).field_C + ((TunnelEntity) (var5)).field_D <= var7.field_C + var7.field_D)) {
                        var7 = (TunnelEntity) (var12.a((byte) -122));
                        continue;
                      }
                      var5 = var7;
                    }
                    var7 = (TunnelEntity) (var12.a((byte) -122));
                    continue;
                  }
                  break;
                }
                var10 = var4;
                if (var10 == null) {
                  var10 = this.field_g.sentinel;
                }
                var10 = ((IntrusiveNode) (var10)).field_h;
                if (var10 == this.field_g.sentinel) {
                  var10 = null;
                }
                var3.field_y = (TunnelEntity) (var10);
              }
              var3 = (TunnelEntity) (this.field_g.nextForward(2123));
              continue;
            }
            break;
          }
          while (var7 != null) {
            if (-var7.field_C + var7.field_D < var8_double) {
              if (var7.participatesInEntityCollisions((byte) 73) && (var4 == null ||
                ((TunnelEntity) (var4)).field_C + ((TunnelEntity) (var4)).field_D <= var7.field_C + var7.field_D)) {
                var4 = var7;
              }
              if (var7.participatesInTunnelCollisions(8) && (var5 == null ||
                var7.field_D + var7.field_C >= ((TunnelEntity) (var5)).field_C + ((TunnelEntity) (var5)).field_D)) {
                var5 = var7;
              }
              var7 = (TunnelEntity) (var12.a((byte) -111));
              continue;
            }
            break;
          }
          var10Lifetime1 = var5;
          if (var10Lifetime1 == null) {
            var10Lifetime1 = this.field_g.sentinel;
          }
          var10Lifetime1 = ((IntrusiveNode) (var10Lifetime1)).field_h;
          if (var10Lifetime1 == this.field_g.sentinel) {
            var10Lifetime1 = null;
          }
          this.field_x.field_y[var6] = (TunnelEntity) (var10Lifetime1);
          var6++;
        }
        while (var3 != null) {
          if (var3.participatesInEntityCollisions((byte) 114)) {
            while (var7 != null) {
              if (var3.field_D + var3.field_C > -var7.field_C + var7.field_D) {
                if (var7.participatesInEntityCollisions((byte) 77) && (var4 == null ||
                  var7.field_D + var7.field_C >= ((TunnelEntity) (var4)).field_C + ((TunnelEntity) (var4)).field_D)) {
                  var4 = var7;
                }
                var7 = (TunnelEntity) (var12.a((byte) -126));
                continue;
              }
              break;
            }
            var8_ref = var4;
            if (var8_ref == null) {
              var8_ref = this.field_g.sentinel;
            }
            var8_ref = ((IntrusiveNode) (var8_ref)).field_h;
            if (var8_ref == this.field_g.sentinel) {
              var8_ref = null;
            }
            var3.field_y = (TunnelEntity) (var8_ref);
          }
          var3 = (TunnelEntity) (this.field_g.nextForward(2123));
        }
        var8 = -38 / ((param0 + 45) / 43);
    }

    final static int pollLobbyConnection(int param0) {
        if (param0 != 18042) {
          return -79;
        }
        dh.field_vb.b((byte) 28);
        if (!om.field_s.a((byte) 14)) {
          return PowerUpPickup.h((byte) -116);
        }
        return 0;
    }

    private final PrimaryNodeDeque collectSceneLights(boolean param0) {
        int var4 = Confined.field_J ? 1 : 0;
        PrimaryNodeDeque var8 = new PrimaryNodeDeque();
        TunnelEntity var5 = (TunnelEntity) (this.field_g.beginBackward(false));
        while (var5 != null) {
          var5.collectEntityLights(var8, (byte) -86);
          var5 = (TunnelEntity) (this.field_g.nextBackward((byte) -59));
        }
        fd.c((byte) 35);
        ProjectileRay var6 = (ProjectileRay) (this.field_b.beginBackward(false));
        while (var6 != null) {
          var6.a(var8, 4);
          var6 = (ProjectileRay) (this.field_b.nextBackward((byte) 71));
        }
        LightningArc var7 = (LightningArc) (this.field_F.beginBackward(false));
        while (var7 != null) {
          var7.a(var8, 4);
          var7 = (LightningArc) (this.field_F.nextBackward((byte) -107));
        }
        if (!param0) {
          this.drawShockwaveCrossSection(-0.5612003772515823, -102, (byte) -63);
        }
        DynamicLight var3 = (DynamicLight) (var8.beginForward(-121));
        while (var3 != null) {
          var3.field_n = 4.0 * Math.sqrt(var3.field_u);
          var3 = (DynamicLight) (var8.nextForward(2123));
        }
        this.assignLightRangesToEntities((byte) 115, var8);
        return var8;
    }

    private final void resolveEntityPairCollisions(int param0) {
        TunnelEntity var2;
        TunnelEntity var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        var2 = (TunnelEntity) (this.field_g.beginForward(-123));
        while (var2 != null) {
          if (var2.participatesInEntityCollisions((byte) 103)) {
            this.field_N.startBackwardAt(var2, param0 + 5);
            var3 = (TunnelEntity) (this.field_N.previousNode(param0 + 110));
            while (var3 != null) {
              if (var2.field_y == var3) {
                break;
              }
              if (var3.participatesInEntityCollisions((byte) 127)) {
                gb.a(var2, var3, (byte) 84);
              }
              var3 = (TunnelEntity) (this.field_N.previousNode(124));
            }
          }
          var2 = (TunnelEntity) (this.field_g.nextForward(param0 ^ 2122));
        }
    }

    private final void resolveTunnelWallCollisions(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$7 = 0;
        int var2;
        TunnelEntity var3;
        int var4;
        int var5;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        int var40;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        double var26;
        double var28;
        double var30;
        double var32;
        double var34;
        double var36;
        double var38;
        double var16Lifetime1;
        var40 = Confined.field_J ? 1 : 0;
        var2 = 0;
        if (this.field_x.field_a <= 1) {
          return;
        }
        var3 = (TunnelEntity) (this.field_g.beginForward(25));
        while (var3 != null) {
          if (var3.participatesInTunnelCollisions(8)) {
            while (this.field_x.field_a - 2 > var2) {
              if (var3.field_D >= this.field_x.field_r[var2 + 1]) {
                var2++;
                continue;
              }
              break;
            }
            this.field_x.interpolateCrossSectionVertices(18081, var2, var3.field_D);
            var4 = -1 + this.field_x.field_f;
            var5 = 0;
            while (!(this.field_x.field_f <= var5)) {
              var6 = this.field_x.field_x[var4];
              var8 = this.field_x.field_g[var4];
              var10 = -var6 + this.field_x.field_x[var5];
              var12 = this.field_x.field_g[var5] - var8;
              var14 = var10 * var10 + var12 * var12;
              if (!(var14 >= 0.000001)) {
                incrementValue$8 = var5;
                var5++;
                var4 = incrementValue$8;
                continue;
              }
              var16 = 1.0 / Math.sqrt(var14);
              var18 = var12 * var16;
              var20 = var16 * -var10;
              var16Lifetime1 = var20 * (-var8 + var3.field_t) + (var3.field_E - var6) * var18;
              if (var3.field_C > var16Lifetime1) {
                var22 = (-this.field_x.field_v[var2][var4] + this.field_x.field_v[1 + var2][var4]) / (-this.field_x.field_r[var2] + this.field_x.field_r[1 + var2]);
                var24 = (this.field_x.field_n[1 + var2][var4] - this.field_x.field_n[var2][var4]) / (this.field_x.field_r[var2 + 1] - this.field_x.field_r[var2]);
                var26 = (-this.field_x.field_v[var2][var5] + this.field_x.field_v[var2 + 1][var5]) / (this.field_x.field_r[1 + var2] - this.field_x.field_r[var2]);
                var28 = (this.field_x.field_n[1 + var2][var5] - this.field_x.field_n[var2][var5]) / (-this.field_x.field_r[var2] + this.field_x.field_r[1 + var2]);
                var30 = (var10 * (var3.field_E - var6) + (var3.field_t - var8) * var12) / var14;
                var32 = var22 + (var26 - var22) * var30;
                var34 = var24 + (var28 - var24) * var30;
                var36 = -(var18 * var32 + var34 * var20);
                var38 = 1.0 / Math.sqrt(1.0 + var36 * var36);
                var36 = var36 * var38;
                var18 = var18 * var38;
                var20 = var20 * var38;
                var3.resolveTunnelWallContact(256, -(var20 * var16Lifetime1) + var3.field_t, var18, var3.field_E - var18 * var16Lifetime1, var20, var3.field_D - var36 * var16Lifetime1, var36);
              }
              incrementValue$7 = var5;
              var5++;
              var4 = incrementValue$7;
            }
          }
          var3 = (TunnelEntity) (this.field_g.nextForward(2123));
        }
        if (param0 <= 14) {
          this.prepareEffectDrawQueue(-25);
        }
    }

    private final void sortEntitiesByWorldDepth(int param0) {
        TunnelEntity var2;
        TunnelEntity var3;
        int var4;
        int var5;
        int var4Lifetime1;
        TunnelEntity var2Lifetime1;
        TunnelEntity var3Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        if (param0 >= -4) {
          this.field_y = false;
        }
        while (true) {
          var2 = (TunnelEntity) (this.field_g.beginBackward(false));
          if (var2 == null) {
            return;
          }
          var3 = (TunnelEntity) (this.field_g.nextBackward((byte) 83));
          var4 = 1;
          while (var3 != null) {
            if (var3.field_D > var2.field_D) {
              ri.a(var3, 0, var2);
              var4 = 0;
            } else {
              var2 = var3;
            }
            var3 = (TunnelEntity) (this.field_g.nextBackward((byte) -101));
          }
          if (var4 != 0) {
            return;
          }
          var3Lifetime1 = (TunnelEntity) (this.field_g.beginForward(-127));
          var2Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          var4Lifetime1 = 1;
          while (var2Lifetime1 != null) {
            if (var2Lifetime1.field_D < var3Lifetime1.field_D) {
              ri.a(var3Lifetime1, 0, var2Lifetime1);
              var4Lifetime1 = 0;
            } else {
              var3Lifetime1 = var2Lifetime1;
            }
            var2Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          }
          if (var4Lifetime1 != 0) {
            return;
          }
        }
    }

    private final void sortEntitiesByFarDepth(byte param0) {
        TunnelEntity var2 = null;
        TunnelEntity var3 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        TunnelEntity var2Lifetime1;
        TunnelEntity var3Lifetime1;
        if (param0 < 60) {
          this.field_h = -41;
        }
        do {
          var2 = (TunnelEntity) (this.field_g.beginBackward(false));
          if (var2 == null) {
            return;
          }
          var3 = (TunnelEntity) (this.field_g.nextBackward((byte) -78));
          var4 = 1;
          while (var3 != null) {
            if (var3.field_C + var3.field_D > var2.field_C + var2.field_D) {
              ri.a(var3, 0, var2);
              var4 = 0;
            } else {
              var2 = var3;
            }
            var3 = (TunnelEntity) (this.field_g.nextBackward((byte) -68));
          }
          if (var4 != 0) {
            return;
          }
          var3Lifetime1 = (TunnelEntity) (this.field_g.beginForward(47));
          var2Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          var4 = 1;
          while (var2Lifetime1 != null) {
            if (var2Lifetime1.field_D + var2Lifetime1.field_C < var3Lifetime1.field_D + var3Lifetime1.field_C) {
              var4 = 0;
              ri.a(var3Lifetime1, 0, var2Lifetime1);
            } else {
              var3Lifetime1 = var2Lifetime1;
            }
            var2Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          }
        } while (var4 == 0);
    }

    public static void clearGameSessionGlobals(int param0) {
        if (param0 != 0) {
          GameSession.getDialogContentWidth(64);
        }
        field_C = null;
        field_p = null;
        field_f = null;
        field_e = null;
    }

    private final void drawEffectsThroughDepth(boolean param0, boolean param1, double param2, boolean param3) {
        int var6;
        dc var7;
        int var8;
        int var9;
        int var10;
        dc var7Lifetime1;
        var10 = Confined.field_J ? 1 : 0;
        if (this.field_q <= param2) {
          return;
        }
        var6 = 256;
        if (!param0) {
          this.field_m = (TunnelCamera) null;
        }
        if (param1) {
          var6 = (int)(this.attenuateBrightnessWithinShockwave(256.0, 109) + 0.5);
        }
        var7 = (dc) (this.field_k.c(-106));
        while (var7 != null) {
          if (var7.field_I > param2) {
            var7.c(-1704);
            var7.a(var6, -111);
            var7.field_N = 0;
            this.field_O.a(var7, (byte) 126);
            var7 = (dc) (this.field_k.a(0));
            continue;
          }
          break;
        }
        var7Lifetime1 = (dc) (this.field_O.d(-100));
        while (var7Lifetime1 != null) {
          var8 = var7Lifetime1.field_N;
          if (param2 < var7Lifetime1.field_F) {
            var9 = 65536;
            var7Lifetime1.unlinkSecondary(true);
          } else {
            var9 = var7Lifetime1.a((int)((param2 - var7Lifetime1.field_I) / (-var7Lifetime1.field_I + var7Lifetime1.field_F) * 65536.0), (byte) -63);
            if (var7Lifetime1.field_N > var9) {
              var9 = var7Lifetime1.field_N;
            } else {
              var7Lifetime1.field_N = var9;
            }
          }
          var7Lifetime1.a(var6, var8, -14936, var9);
          if (!(param2 < var7Lifetime1.field_F)) {
            if (param3) {
              var7Lifetime1.a(true, var9, 256 - var6);
            }
          } else {
            var7Lifetime1.b(var6, (byte) 27);
          }
          var7Lifetime1 = (dc) (this.field_O.a((byte) -115));
        }
        this.field_q = param2;
        return;
    }

    final double attenuateBrightnessThroughShockwave(byte param0, double param1) {
        if (param0 <= 10) {
          return 1.8442941966738435;
        }
        return this.attenuateBrightnessToDepth(param1, 0, this.field_E + this.field_A);
    }

    private final wd buildEntityQueueByNearDepth(byte param0) {
        TunnelEntity var3;
        TunnelEntity var4;
        int var5;
        int var6;
        wd var7;
        TunnelEntity var3Lifetime1;
        TunnelEntity var4Lifetime1;
        TunnelEntity var3Lifetime2;
        var6 = Confined.field_J ? 1 : 0;
        var7 = new wd();
        while (true) {
          var3 = (TunnelEntity) (this.field_g.beginBackward(false));
          if (var3 == null) {
            return var7;
          }
          var4 = (TunnelEntity) (this.field_g.nextBackward((byte) -96));
          var5 = 1;
          while (var4 != null) {
            if (var4.field_D - var4.field_C > var3.field_D - var3.field_C) {
              var5 = 0;
              ri.a(var4, 0, var3);
            } else {
              var3 = var4;
            }
            var4 = (TunnelEntity) (this.field_g.nextBackward((byte) 99));
          }
          if (var5 == 0) {
            var4Lifetime1 = (TunnelEntity) (this.field_g.beginForward(18));
            var5 = 1;
            var3Lifetime2 = (TunnelEntity) (this.field_g.nextForward(2123));
            while (var3Lifetime2 != null) {
              if (var3Lifetime2.field_D - var3Lifetime2.field_C < var4Lifetime1.field_D - var4Lifetime1.field_C) {
                var5 = 0;
                ri.a(var4Lifetime1, 0, var3Lifetime2);
              } else {
                var4Lifetime1 = var3Lifetime2;
              }
              var3Lifetime2 = (TunnelEntity) (this.field_g.nextForward(2123));
            }
            if (var5 == 0) {
              continue;
            }
          }
          break;
        }
        if (param0 >= -18) {
          this.field_a = (kl) null;
        }
        var3Lifetime1 = (TunnelEntity) (this.field_g.beginForward(-124));
        while (var3Lifetime1 != null) {
          var7.a(var3Lifetime1, (byte) 120);
          var3Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
        }
        return var7;
    }

    private final void sortEntitiesByCameraDepth(int param0) {
        double var2;
        double var4;
        double var6;
        TunnelEntity var8;
        TunnelEntity var9;
        int var10;
        int var11;
        int var10Lifetime1;
        TunnelEntity var8Lifetime1;
        TunnelEntity var9Lifetime1;
        var11 = Confined.field_J ? 1 : 0;
        var2 = this.field_m.field_P;
        var4 = this.field_m.field_H;
        var6 = this.field_m.field_N;
        if (param0 != 938) {
          this.refreshSceneSoundState(8);
        }
        while (true) {
          var8 = (TunnelEntity) (this.field_g.beginBackward(false));
          if (var8 == null) {
            return;
          }
          var9 = (TunnelEntity) (this.field_g.nextBackward((byte) 71));
          var10 = 1;
          while (var9 != null) {
            if (var9.field_E * var2 + var4 * var9.field_t + var9.field_D * var6 > var6 * var8.field_D + (var4 * var8.field_t + var8.field_E * var2)) {
              ri.a(var9, 0, var8);
              var10 = 0;
            } else {
              var8 = var9;
            }
            var9 = (TunnelEntity) (this.field_g.nextBackward((byte) 57));
          }
          if (var10 != 0) {
            return;
          }
          var9Lifetime1 = (TunnelEntity) (this.field_g.beginForward(-119));
          var10Lifetime1 = 1;
          var8Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          while (var8Lifetime1 != null) {
            if (!(var9Lifetime1.field_D * var6 + (var9Lifetime1.field_t * var4 + var2 * var9Lifetime1.field_E) > var6 * var8Lifetime1.field_D + (var8Lifetime1.field_E * var2 + var4 * var8Lifetime1.field_t))) {
              var9Lifetime1 = var8Lifetime1;
            } else {
              var10Lifetime1 = 0;
              ri.a(var9Lifetime1, param0 ^ 938, var8Lifetime1);
            }
            var8Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          }
          if (var10Lifetime1 != 0) {
            return;
          }
        }
    }

    final void stopSceneSoundSources(int param0) {
        int var3 = Confined.field_J ? 1 : 0;
        gk var4 = (gk) (this.field_z.beginForward(100));
        while (var4 != null) {
          var4.f(128);
          var4 = (gk) (this.field_z.nextForward(2123));
        }
        if (param0 >= -84) {
          this.resolveBackwardProjectileCollisions(-17);
        }
    }

    private final void assignLightRangesToEntities(byte param0, PrimaryNodeDeque param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        TunnelEntity var3 = null;
        RuntimeException var3_ref = null;
        DynamicLight var4 = null;
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        TunnelEntity var3Lifetime1;
        var8 = Confined.field_J ? 1 : 0;
        try {
          IsaacRandom.a(true, param1);
          var3 = (TunnelEntity) (this.field_g.beginBackward(false));
          var4 = (DynamicLight) (param1.beginForward(19));
          var5 = null;
          var6 = 107 % ((53 - param0) / 48);
          while (var3 != null) {
            while (var4 != null) {
              if (var4.field_p + var4.field_n > var3.field_D) {
                if (var5 == null ||
                  ((DynamicLight) (var5)).field_p - ((DynamicLight) (var5)).field_n >= -var4.field_n + var4.field_p) {
                  var5 = var4;
                }
                var4 = (DynamicLight) (param1.nextForward(2123));
                continue;
              }
              break;
            }
            var3.field_v = (DynamicLight) (var5);
            var3 = (TunnelEntity) (this.field_g.nextBackward((byte) 117));
          }
          IsaacRandom.a(param1, (byte) 87);
          var3Lifetime1 = (TunnelEntity) (this.field_g.beginForward(13));
          while (var3Lifetime1 != null) {
            var7 = var3Lifetime1.field_v;
            if (var7 == null) {
              var7 = param1.sentinel;
            }
            var7 = ((IntrusiveNode) (var7)).field_h;
            if (param1.sentinel == var7) {
              var7 = null;
            }
            var3Lifetime1.field_v = (DynamicLight) (var7);
            var3Lifetime1 = (TunnelEntity) (this.field_g.nextForward(2123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("hn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final double attenuateBrightnessWithinShockwave(double param0, int param1) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        if (param1 <= 19) {
          this.field_z = (PrimaryNodeDeque) null;
        }
        if (this.field_L > 0) {
          var4 = this.field_E + this.field_A;
          var6 = this.field_E - this.field_A;
          if (0.0 > var6) {
            var6 = 0.0;
          }
          if (var4 > var6) {
            var8 = var4 - var6;
            if (2.0 * this.field_A < var8) {
              var8 = 2.0 * this.field_A;
            }
            if (7.0 < var8) {
              var8 = 7.0;
            }
            var10 = -this.field_L + 100;
            var11 = 1.6e-7 * (double)(this.field_L * (var10 * var10) * this.field_L);
            var13 = 0.96 * Math.pow(0.5, var8 * var11) + 0.04;
            param0 = param0 * var13;
          }
        }
        return param0;
    }

    final void tickGameSession(int param0) {
        double var2;
        int var2_int;
        TunnelEntity var2_ref_pm;
        TunnelEntity var3;
        Object var4_ref;
        TunnelEntity var4_ref_pm;
        double var4;
        double var5;
        double var6;
        double var7;
        TunnelEntity var8;
        double var9;
        double var11;
        MovingTunnelEntity var13;
        double var14;
        int var16;
        Object var18;
        Object var19;
        Object var20;
        Object var21;
        Object var22;
        Object var23;
        Object var24;
        TunnelMesh var25;
        TunnelMesh var26;
        TunnelEntity var27;
        ProjectileRay var28;
        LightningArc var29;
        TunnelEntity var30;
        ProjectileRay var31;
        LightningArc var32;
        gk var33;
        double var2Lifetime1;
        double var2Lifetime2;
        var4_ref = null;
        var18 = null;
        var19 = null;
        var24 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var16 = Confined.field_J ? 1 : 0;
        if (this.field_B.field_z) {
          this.field_B.advanceShipRespawn(false);
        }
        this.field_b.clear(param0 + 123);
        this.field_F.clear(44);
        if (this.field_L > 0) {
          var2 = this.field_A * this.field_A;
          var4_ref_pm = (TunnelEntity) (this.field_g.beginForward(-124));
          while (var4_ref_pm != null) {
            if (var4_ref_pm instanceof MovingTunnelEntity) {
              var5 = -this.field_s + var4_ref_pm.field_E;
              var7 = var4_ref_pm.field_t - this.field_r;
              var9 = -this.field_E + var4_ref_pm.field_D;
              var11 = var7 * var7 + var5 * var5 + var9 * var9;
              if (var11 < var2) {
                var13 = (MovingTunnelEntity) (var4_ref_pm);
                var14 = 1.0 - var11 / var2;
                if (this.field_L < 15) {
                  var14 = (double)this.field_L * var14 / 15.0;
                }
                if (var4_ref_pm != this.field_B &&
                  !(var4_ref_pm instanceof WingPod)) {
                  if (var4_ref_pm instanceof wc) {
                    var13.applyDamage(14170, false, var14 * 8.0);
                  } else {
                    var13.applyDamage(14170, false, var14 * 64.0);
                  }
                } else {
                  var13.applyDamage(14170, false, 0.5 * var14);
                }
                var14 = var14 * (0.01 / this.field_A);
                var13.field_L = var13.field_L + var14 * var9;
                var13.field_K = var13.field_K + var14 * var5;
                var13.field_G = var13.field_G + var7 * var14;
              }
            }
            var4_ref_pm = (TunnelEntity) (this.field_g.nextForward(2123));
          }
          this.field_A = this.field_A + this.field_H;
          this.field_L = this.field_L - 1;
          this.field_H = this.field_H * 0.98;
          if (0 == this.field_L) {
            this.field_n = null;
          }
        }
        this.sortEntitiesByWorldDepth(-100);
        var2_int = param0;
        var3 = (TunnelEntity) (this.field_g.beginForward(94));
        while (var3 != null) {
          while (-2 + this.field_x.field_a > var2_int) {
            if (this.field_x.field_r[var2_int + 1] <= var3.field_D) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int > 0) {
            if (var3.field_D < this.field_x.field_r[var2_int]) {
              var2_int--;
              continue;
            }
            break;
          }
          var3.updateForTunnelSegment(param0 ^ 11878, var2_int);
          var3 = (TunnelEntity) (this.field_g.nextForward(2123));
        }
        this.field_m.updateCameraFollowTransform(param0 ^ 3230);
        if (null != this.field_K) {
          var2Lifetime1 = this.field_x.field_r[this.field_x.field_a - 1];
          var4_ref_pm = (TunnelEntity) (this.field_g.beginForward(80));
          while (var4_ref_pm != null) {
            if (this.field_B != var4_ref_pm &&
              var4_ref_pm != this.field_m &&
              !(var4_ref_pm instanceof WingPod) &&
              var4_ref_pm.field_D >= var2Lifetime1) {
              var4_ref_pm.field_D = var2Lifetime1;
            }
            var4_ref_pm = (TunnelEntity) (this.field_g.nextForward(param0 + 2123));
          }
        }
        this.sortEntitiesByWorldDepth(param0 ^ -99);
        this.resolveTunnelWallCollisions(29);
        this.indexDepthOverlapCandidates((byte) 100);
        this.resolveEntityPairCollisions(param0 + 1);
        this.resolveProjectileCollisions(320);
        var2_ref_pm = (TunnelEntity) (this.field_g.beginForward(60));
        while (var2_ref_pm != null) {
          if (var2_ref_pm.field_z) {
            var2_ref_pm.unlink(true);
          }
          var2_ref_pm = (TunnelEntity) (this.field_g.nextForward(param0 ^ 2123));
        }
        if (!of.field_a &&
          null != this.field_Q &&
          this.field_Q.field_z) {
          this.field_Q = null;
          this.field_J.field_o = this.field_J.field_o + 1;
          d.field_a = d.field_a - 1;
          this.field_J.configureCurrentStage(12631, false);
          if (this.field_o == 0 &&
            12 >= this.field_J.field_o) {
            di.a(-30867, 242, 13);
          }
        }
        if (this.field_x.field_a < 2) {
          var2Lifetime2 = this.field_B.field_E;
          var4 = this.field_B.field_t;
          var6 = this.field_B.field_D;
          var30 = (TunnelEntity) (this.field_g.beginForward(117));
          while (var30 != null) {
            var30.shiftWorldOrigin(var2Lifetime2, (byte) 46, var6, var4);
            var30 = (TunnelEntity) (this.field_g.nextForward(2123));
          }
          var31 = (ProjectileRay) (this.field_b.beginForward(param0 + 93));
          while (var31 != null) {
            var31.a((byte) 83, var2Lifetime2, var6, var4);
            var31 = (ProjectileRay) (this.field_b.nextForward(param0 + 2123));
          }
          var32 = (LightningArc) (this.field_F.beginForward(74));
          while (var32 != null) {
            var32.a((byte) 112, var2Lifetime2, var6, var4);
            var32 = (LightningArc) (this.field_F.nextForward(2123));
          }
          var8 = (TunnelEntity) (this.field_g.beginForward(84));
          while (var8 != null) {
            if (this.field_B != var8 &&
              var8 != this.field_m &&
              !(var8 instanceof WingPod)) {
              var8.unlink(true);
            }
            var8 = (TunnelEntity) (this.field_g.nextForward(param0 ^ 2123));
          }
        } else {
          if (!this.field_B.field_z &&
            this.field_m.field_D >= this.field_x.field_r[1]) {
            var2Lifetime2 = this.field_x.field_u;
            var4 = this.field_x.field_c;
            var6 = this.field_x.field_r[0];
            var25 = this.field_x;
            var26 = var25;
            this.field_x.field_c = 0.0;
            var26.field_u = 0.0;
            this.field_x.shiftTunnelOrigin(var4, var2Lifetime2, var6, 14497);
            var27 = (TunnelEntity) (this.field_g.beginForward(24));
            while (var27 != null) {
              var27.shiftWorldOrigin(var2Lifetime2, (byte) 46, var6, var4);
              var27 = (TunnelEntity) (this.field_g.nextForward(param0 + 2123));
            }
            var28 = (ProjectileRay) (this.field_b.beginForward(33));
            while (var28 != null) {
              var28.a((byte) -107, var2Lifetime2, var6, var4);
              var28 = (ProjectileRay) (this.field_b.nextForward(param0 ^ 2123));
            }
            var29 = (LightningArc) (this.field_F.beginForward(-128));
            while (var29 != null) {
              var29.a((byte) 78, var2Lifetime2, var6, var4);
              var29 = (LightningArc) (this.field_F.nextForward(param0 + 2123));
            }
            this.field_E = this.field_E - var6;
            this.field_r = this.field_r - var4;
            this.field_s = this.field_s - var2Lifetime2;
            if (this.field_K != null) {
              this.field_x.dropLeadingTunnelSection(param0 ^ -2);
            } else {
              this.field_x.scrollAndExtendTunnel((byte) -90);
              if (!this.field_y) {
                this.field_l = this.field_l + var6;
                if (null == this.field_Q) {
                  this.field_J.advanceStageSpawns((byte) -46, var6);
                }
              }
            }
          }
        }
        if (null != this.field_K) {
          this.field_K.a(46);
        }
        var33 = (gk) (this.field_z.beginForward(41));
        while (var33 != null) {
          var33.b(-25071);
          var33 = (gk) (this.field_z.nextForward(2123));
        }
        if (this.field_n != null) {
          if (!this.field_n.isLinked((byte) 115)) {
            this.field_n = null;
          } else {
            this.field_n.g(256);
          }
        }
        if (this.field_J.field_o >= 2 &&
          0 == this.field_j) {
          di.a(-30867, 244, 11);
        }
        if (this.field_J.field_o >= 3 &&
          this.field_c == 0) {
          di.a(param0 ^ -30867, 243, 12);
        }
        if (this.field_u.beginForward(102) != null) {
          this.field_G = this.field_G + 1;
          if (this.field_G == 230) {
            this.field_G = 0;
            this.field_u.removeFirst(1);
          }
        }
    }

    final double attenuateBrightnessToDepth(double param0, int param1, double param2) {
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        if (this.field_L > 0) {
          var6 = -this.field_A + this.field_E;
          if (var6 < 0.0) {
            var6 = 0.0;
          }
          if (param2 > var6) {
            var8 = -var6 + param2;
            if (this.field_A * 2.0 < var8) {
              var8 = this.field_A * 2.0;
            }
            var10 = 100 - this.field_L;
            var11 = 1.6e-7 * (double)(this.field_L * var10 * (var10 * this.field_L));
            var13 = 0.04 + 0.96 * Math.pow(0.5, var8 * var11);
            param0 = param0 * var13;
          }
        }
        if (param1 != 0) {
          this.resolveProjectileCollisions(13);
        }
        return param0;
    }

    final void refreshSceneSoundState(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        int var3 = 14 % ((38 - param0) / 63);
        gk var2 = (gk) (this.field_z.beginForward(11));
        while (var2 != null) {
          if (var2.field_t != null) {
            var2.a((byte) -77);
          }
          var2 = (gk) (this.field_z.nextForward(2123));
        }
        if (null != this.field_n) {
          this.field_n.a((byte) -124);
        }
    }

    private final void resolveBackwardProjectileCollisions(int param0) {
        int var2;
        ProjectileRay var3;
        int var4;
        TunnelEntity var5;
        int var6;
        double var7;
        int var9;
        TunnelEntity var10;
        var9 = Confined.field_J ? 1 : 0;
        var2 = 0;
        if (param0 != 1) {
          this.indexDepthOverlapCandidates((byte) 64);
        }
        var3 = (ProjectileRay) (this.field_b.beginForward(78));
        while (var3 != null) {
          if (!(var3.field_K >= 0.0)) {
            while (this.field_x.field_a - 1 > 1 + var2) {
              if (var3.field_X > this.field_x.field_r[var2 + 1]) {
                var2++;
                continue;
              }
              break;
            }
            var4 = var2;
            var10 = this.field_x.field_y[1 + var4];
            var5 = var10;
            if (var5 == null) {
              var5 = (TunnelEntity) (this.field_g.beginBackward(false));
            } else {
              this.field_g.beginBackwardFrom(var10, false);
              var5 = (TunnelEntity) (this.field_g.nextBackward((byte) 57));
            }
            var6 = 0;
            var3.field_y = 1.7976931348623157e+308;
            while (var4 >= 0) {
              if (var6 == 0 ||
                this.field_x.field_r[var4] > var3.field_eb) {
                var7 = this.field_x.field_r[var4];
                while (var5 != null &&
                  var7 <= var5.field_C + var5.field_D) {
                  if (var6 == 0 ||
                    var3.field_eb < var5.field_D + var5.field_C) {
                    if (var3.a(0, var6 != 0, var5)) {
                      var6 = 1;
                    }
                    var5 = (TunnelEntity) (this.field_g.nextBackward((byte) 84));
                    continue;
                  }
                  break;
                }
                if (var3.a(var4, (byte) -47, var6 != 0)) {
                  var6 = 1;
                }
                var4--;
                continue;
              }
              break;
            }
            while (var5 != null) {
              if (var6 == 0 ||
                var3.field_eb < var5.field_C + var5.field_D) {
                if (var3.a(0, var6 != 0, var5)) {
                  var6 = 1;
                }
                var5 = (TunnelEntity) (this.field_g.nextBackward((byte) 67));
                continue;
              }
              break;
            }
            if (var6 == 0) {
              var3.f((byte) -125);
            }
            if (null != var3.field_S) {
              var3.field_S.onProjectileHit(var3, param0 + 123);
            }
          }
          var3 = (ProjectileRay) (this.field_b.nextForward(2123));
        }
    }

    GameSession() {
        this.field_g = new PrimaryNodeDeque();
        this.field_N = new DequeCursor(this.field_g);
        this.field_w = new DequeCursor(this.field_g);
        this.field_b = new PrimaryNodeDeque();
        this.field_F = new PrimaryNodeDeque();
        this.field_z = new PrimaryNodeDeque();
        this.field_u = new PrimaryNodeDeque();
        this.field_i = false;
        this.field_y = true;
        this.field_M = true;
        this.field_K = null;
        this.field_G = 0;
        this.field_J = new StageDirector(this);
        this.field_k = new wd();
        this.field_O = new wd();
        this.field_x = new TunnelMesh(WingPod.field_V[0], ag.field_g[0], 17, 4.0, DequeCursor.field_a[0], 0.0);
        this.field_B = new PlayerShip(this);
        this.field_g.addLast((IntrusiveNode) (this.field_B), (byte) -113);
        this.field_m = new TunnelCamera(this, 0.0, 0.0, 0.0);
        this.field_m.field_ab = 0.0;
        this.field_m.field_P = 0.0;
        this.field_m.field_H = 0.0;
        this.field_m.field_F = 0.0;
        this.field_m.field_M = 0.0;
        this.field_m.field_R = 1.0;
        this.field_m.field_N = 1.0;
        this.field_m.field_V = 0.0;
        this.field_m.field_U = 1.0;
        this.field_g.addFirst(this.field_m, -1);
        this.field_J.configureCurrentStage(12631, false);
        bd.field_h = 40;
        we.field_g = 120;
        rc.field_i = 1;
        d.field_a = 256;
    }

    static {
        field_e = "End Game";
        field_p = "Email: ";
        field_D = false;
        field_C = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_I = true;
    }
}
