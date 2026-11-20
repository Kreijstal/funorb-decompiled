/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaceVehicle extends MovingEntity {
    private int field_Jb;
    private int field_uc;
    private int field_Kb;
    private int field_Vb;
    int field_Sb;
    float field_lc;
    private float field_Gb;
    private int field_Mb;
    private int field_ac;
    private boolean field_Ab;
    int field_cb;
    private EntitySound field_S;
    private int field_cc;
    int[][] field_W;
    private EntitySound field_ub;
    private float field_P;
    private float field_ic;
    boolean field_V;
    VehicleDefinition field_C;
    int field_bc;
    private EntitySound field_Z;
    private boolean field_I;
    private EntitySound field_vc;
    int field_L;
    private RaceVehicle field_Bb;
    int field_mc;
    private wm field_lb;
    int field_M;
    int field_X;
    private RoadSegment field_zb;
    private float field_xc;
    float field_H;
    private int[] field_Nb;
    private boolean field_ib;
    private int field_eb;
    int field_db;
    int field_rc;
    private RoadSegment field_K;
    int field_Eb;
    private int field_Hb;
    float field_vb;
    Point2i field_Zb;
    private float field_bb;
    int field_R;
    private int field_Xb;
    private int field_kc;
    private wm field_yb;
    int[] field_hc;
    private GrowableObjectList field_sb;
    int field_Q;
    private int field_Yb;
    private float field_D;
    float field_N;
    private float field_Y;
    private int field_Ob;
    boolean field_jb;
    private float field_E;
    private int[] field_yc;
    int field_T;
    int field_ab;
    private int field_nb;
    int field_tc;
    private float field_wc;
    static LoginMethodPreference field_Wb;
    private PathWaypoint[] field_sc;
    private int field_dc;
    private int field_gc;
    private int field_mb;
    private boolean field_Cb;
    private int field_fc;
    int field_ob;
    int field_Lb;
    int field_tb;
    private int field_Ub;
    int field_oc;
    private float field_jc;
    float field_Ib;
    int[] field_Fb;
    static Sprite[] field_Db;
    private float field_ec;
    private int field_Rb;
    private EntitySound field_fb;
    int field_J;
    private int field_xb;
    private int field_pc;
    int field_hb;
    int field_O;
    private EntitySound field_rb;
    int field_Pb;
    private int field_pb;
    private boolean field_F;
    private int field_G;
    private int field_Tb;
    static char[] field_Qb;
    Sprite field_kb;
    private int field_qc;
    private int field_qb;
    static NameAvailabilityResult field_U;
    private int field_gb;
    private boolean field_nc;
    private float field_wb;

    private final void f(byte param0) {
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        PathWaypoint stackIn_21_3 = null;
        int stackIn_30_0 = 0;
        int stackIn_39_1 = 0;
        PathWaypoint[] stackIn_39_2 = null;
        Object stackIn_40_0;
        boolean stackIn_40_3;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        PathWaypoint[] var5 = null;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7 = 0;
        float var8_float = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wm var14_ref_wm = null;
        RaceVehicle var15 = null;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        RaceVehicle var15Lifetime1;
        float var4Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        float var18Lifetime1;
        float var19Lifetime1;
        var20 = HoldTheLine.field_D;
        try {
          var2_float = 1500000.0f;
          var3 = 0.0f;
          var4 = this.field_jc;
          if (this.field_G > 0 &&
            (-this.field_sc[0].y + this.position.y) * (this.position.y - this.field_sc[0].y) + (this.position.x - this.field_sc[0].x) * (this.position.x - this.field_sc[0].x) > 10000) {
            this.f(3);
          }
          if (-1.0f != this.field_vb &&
            this.field_G < 22) {
            if (10 < this.field_G) {
              this.field_G = 10;
            }
            stackIn_20_1 = 41;
            stackIn_20_2 = 32 - this.field_G;
            if (0 == this.field_G) {
              stackIn_21_3 = null;
            } else {
              stackIn_21_3 = this.field_sc[this.field_G - 1];
            }
            this.a((byte) stackIn_20_1, stackIn_20_2, stackIn_21_3);
            if (null == this.field_sc) {
              throw new RuntimeException();
            }
            this.field_G = this.field_sc.length;
          }
          if (15 < this.field_G) {
            stackIn_30_0 = 15;
          } else {
            stackIn_30_0 = this.field_G;
          }
          var5 = new PathWaypoint[stackIn_30_0];
          var6 = 0;
          scanLoop1: while (true) {
            if (var5.length > var6) {
              var5[var6] = new PathWaypoint(this.field_sc[var6]);
              var6++;
              if (var20 != 0) {
                break scanLoop1;
              }
              if (var20 == 0) {
                continue;
              }
            }
            stackIn_39_1 = 118;
            stackIn_39_2 = var5;
            if (this.field_J != 2) {
              stackIn_40_0 = this;
              stackIn_40_3 = false;
            } else {
              stackIn_40_0 = this;
              stackIn_40_3 = true;
            }
            this.a((byte) stackIn_39_1, stackIn_39_2, stackIn_40_3, var5.length);
            break;
          }
          regionExit2: {
            if (this.field_G > 0) {
              var7_float = BoundaryIntersection.angleBetweenPoints(this.position, var5[0], false);
              if (this.direction.y * this.velocityY + this.direction.x * this.velocityX < 0.0f) {
                var7_float = (float)((double)var7_float + 3.141592653589793);
              }
              var3 = this.heading - var7_float;
              while (true) {
                boolean decompiledFrameRemainder3 = true;
                if ((double)var3 < -3.141592653589793) {
                  var3 = (float)((double)var3 + 6.283185307179586);
                  decompiledFrameRemainder3 = (var20 == 0);
                  if ((decompiledFrameRemainder3) &&
                    (var20 == 0)) {
                    continue;
                  }
                }
                if (decompiledFrameRemainder3) {
                  while ((double)var3 > 3.141592653589793) {
                    var3 = (float)((double)var3 - 6.283185307179586);
                    if (var20 != 0) {
                      break regionExit2;
                    }
                    if (var20 == 0) {
                      continue;
                    }
                    break;
                  }
                }
                var8_float = this.a(var5, (byte) -112, 25.0f);
                if (var2_float > var8_float) {
                  var2_float = var8_float;
                }
                if (!(var2_float < 10.0f)) {
                  break;
                }
                var2_float = 10.0f;
                break;
              }
            }
            var6 = 0;
          }
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var4Lifetime1 = this.field_jc;
          if (this.field_qb > 0) {
            if (!this.field_Ab) {
              var3 = var3 * 2.0f;
              if (var20 != 0) {
                var3 = var3 * -2.0f;
              }
            } else {
              var3 = var3 * -2.0f;
            }
          }
          if (var4Lifetime1 >= var2_float) {
            var9 = 1;
          }
          if (var4Lifetime1 < var2_float) {
            var7 = 1;
          }
          if (var3 < -0.05000000074505806f) {
            var10 = 1;
          }
          if (0.05000000074505806f < var3) {
            var11 = 1;
          }
          if (MusicPatchPcmStream.field_r.field_r == 1 && (var10 != 0 ||
            var11 != 0) && this.field_jc > 25.0f) {
            var7 = 0;
          }
          if (this.field_qb > 0) {
            var7 = 0;
            var8 = 1;
            this.field_qb = this.field_qb - 1;
          }
          if (var6 != 0) {
            var7 = 0;
            var9 = 0;
            var8 = 1;
          }
          var13 = -1;
          if (this.field_Fb[0] == 1) {
            var13 = 0;
          }
          if (this.field_Fb[0] == 2) {
            var13 = 1;
          }
          if (this.field_Fb[0] == 3) {
            var13 = 2;
          }
          if (this.field_Fb[1] == 3) {
            var13 = 3;
          }
          if (this.field_Fb[2] == 3) {
            var13 = 4;
          }
          if (param0 <= 64) {
            this.c(-82, -104);
          }
          regionExit3: {
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder2 = true;
            var14 = var13;
            if (var14 != 0) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (var14 != 1) {
                if ((var14 != 2 ||
                  var20 != 0) &&
                  (decompiledFrameRemainder0 = (var14 != 3)) &&
                  (decompiledFrameRemainder4 = (4 == var14))) {
                  decompiledFrameRemainder1 = (var20 != 0);
                  decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                }
              } else {
                var14 = 0;
                scanLoop4: while (true) {
                  if (var14 < MusicPatchPcmStream.field_r.field_h) {
                    if (var20 != 0) {
                      break regionExit3;
                    }
                    if (this.field_mc != var14) {
                      var15 = MusicPatchPcmStream.field_r.vehicles[var14];
                      if (var15 != null) {
                        var16 = -this.position.x + var15.position.x;
                        var17 = var15.position.y - this.position.y;
                        if (var16 * var16 + var17 * var17 >= 2500) {
                          var18 = this.direction.y * (float)var17 + this.direction.x * (float)var16;
                          var19 = (float)var16 * this.direction.y - (float)var17 * this.direction.x;
                          if (var18 > Math.abs(var19) * 4.0f &&
                            !SolidRoadStripRenderer.intersectsBoundaryGroups(140, var15.position, this.position, MusicPatchPcmStream.field_r.field_nb)) {
                            var12 = 1;
                            if (var20 == 0) {
                              break scanLoop4;
                            }
                          }
                        }
                      }
                    }
                    var14++;
                    if (var20 == 0) {
                      continue;
                    }
                  }
                  break;
                }
                decompiledFrameRemainder4 = (var20 != 0);
              }
              if (((decompiledFrameRemainder4) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
                (decompiledFrameRemainder4 = (this.field_lb == null ||
                !(this.field_lb.isLinked(110)) ||
                var20 != 0))) {
                var14 = 0;
                scanLoop5: while (true) {
                  if (MusicPatchPcmStream.field_r.field_h > var14) {
                    if (var20 != 0) {
                      break regionExit3;
                    }
                    if (this.field_mc != var14 ||
                      var20 != 0) {
                      var15Lifetime1 = MusicPatchPcmStream.field_r.vehicles[var14];
                      if (var15Lifetime1 != null) {
                        var16Lifetime1 = var15Lifetime1.position.x - this.position.x;
                        var17Lifetime1 = -this.position.y + var15Lifetime1.position.y;
                        if (var17Lifetime1 * var17Lifetime1 + var16Lifetime1 * var16Lifetime1 >= 225) {
                          var18Lifetime1 = this.direction.x * (float)var16Lifetime1 + this.direction.y * (float)var17Lifetime1;
                          var19Lifetime1 = -(this.direction.x * (float)var17Lifetime1) + this.direction.y * (float)var16Lifetime1;
                          if (var18Lifetime1 > 4.0f * Math.abs(var19Lifetime1) &&
                            !SolidRoadStripRenderer.intersectsBoundaryGroups(140, var15Lifetime1.position, this.position, MusicPatchPcmStream.field_r.field_nb)) {
                            var12 = 1;
                            if (var20 == 0) {
                              break scanLoop5;
                            }
                          }
                        }
                      }
                    }
                    var14++;
                    if (var20 == 0) {
                      continue;
                    }
                  }
                  break;
                }
                decompiledFrameRemainder4 = (var20 != 0);
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                var12 = 1;
                decompiledFrameRemainder4 = (var20 != 0);
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder2)) {
                var12 = 1;
                decompiledFrameRemainder4 = false;
              }
            }
            if ((decompiledFrameRemainder4) && (null == this.field_yb ||
              SolidRoadStripRenderer.b(2, 250) == 0)) {
              var12 = 1;
              var14_ref_wm = (wm) (MusicPatchPcmStream.field_r.field_d.first((byte) 115));
              scanLoop6: while (true) {
                if (null != var14_ref_wm) {
                  if (var20 != 0) {
                    break;
                  }
                  if (this.field_q < var14_ref_wm.field_q &&
                    var14_ref_wm.a(2048, this.position)) {
                    var12 = 0;
                    if (var20 == 0) {
                      break scanLoop6;
                    }
                  }
                  var14_ref_wm = (wm) (MusicPatchPcmStream.field_r.field_d.next((byte) 120));
                  if (var20 == 0) {
                    continue;
                  }
                }
                break;
              }
            }
          }
          this.a(var10 != 0, var7 != 0, var12 != 0, 116, var8 != 0, var11 != 0, var9 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        boolean stackIn_7_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          stackIn_7_1 = (MusicPatchPcmStream.field_r.field_J != 2) && (MusicPatchPcmStream.field_r.field_J != 6);
          this.field_V = stackIn_7_1;
          this.field_jb = true;
          if (this.field_J != param0 &&
            this.field_rc == 0) {
            param1 = (int)((float)param1 * this.a((byte) 105, il.field_d));
            if (HoldTheLine.field_D != 0) {
              this.field_jb = false;
            }
          } else {
            this.field_jb = false;
          }
          if (param1 > this.field_M) {
            this.field_M = param1;
          }
          this.field_T = 20;
          this.field_H = this.e((byte) 45);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "ja.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_rb != null) {
            NanoTickClock.removeEntitySound(true, this.field_rb);
          }
          this.field_rb = null;
          if (this.field_S != null) {
            NanoTickClock.removeEntitySound(true, this.field_S);
          }
          this.field_S = null;
          if (null != this.field_Z) {
            NanoTickClock.removeEntitySound(true, this.field_Z);
          }
          if (param0 < 97) {
            this.field_sb = (GrowableObjectList) null;
          }
          this.field_Z = null;
          if (this.field_fb != null) {
            NanoTickClock.removeEntitySound(true, this.field_fb);
          }
          this.field_fb = null;
          if (this.field_ub != null) {
            NanoTickClock.removeEntitySound(true, this.field_ub);
          }
          this.field_ub = null;
          if (this.field_vc != null) {
            NanoTickClock.removeEntitySound(true, this.field_vc);
          }
          this.field_vc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.P(" + param0 + ')');
        }
    }

    private final void a(RaceVehicle param0, byte param1) {
        int fieldTemp$0 = 0;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        try {
          if (null != param0 &&
            0 == this.field_rc &&
            !LoginCredentialType.a(16616, 0)) {
            param0.field_Sb = param0.field_Sb + 1;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          this.d(3, -1065046232);
          this.field_oc = this.field_oc + 1;
          this.field_J = -1;
          ValidationHelpWidget.a((byte) 4, (MovingEntity) (this), PolarSortVector.field_g, PolarSortVector.field_g.field_q);
          this.d((byte) 116);
          ArchiveIndex.a(0, this.position.y, 0, 128, 1, -1, this.position.x, 3, MusicPatchPcmStream.field_r.field_M, 16777215, 0, 32, 400);
          ArchiveIndex.a(0, this.position.y, 0, 128, 1, -4, this.position.x, 3, MusicPatchPcmStream.field_r.field_M, 16777215, 0, 128, 60);
          ArchiveIndex.a(0, this.position.y, 0, 128, 1, -8, this.position.x, 3, MusicPatchPcmStream.field_r.field_M, 16777215, 0, 255, 20);
          if (this.field_rc != 0) {
            this.field_rc = 2;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3_int = MusicPatchPcmStream.field_r.field_h;
            while (true) {
              if (MusicPatchPcmStream.field_r.field_z > var3_int) {
                stackIn_37_0 = null;
                if (var4 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_37_0 == MusicPatchPcmStream.field_r.vehicles[var3_int]) {
                  MusicPatchPcmStream.field_r.vehicles[var3_int] = new RaceVehicle(this.position.x, this.position.y, this.field_q, this.heading, this.field_vb, this.field_zb, this.field_C, 2);
                } else {
                  var3_int++;
                  continue;
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              if (var3_int == MusicPatchPcmStream.field_r.field_z &&
                MusicPatchPcmStream.field_r.field_z < 64) {
                fieldTemp$0 = MusicPatchPcmStream.field_r.field_z;
                MusicPatchPcmStream.field_r.field_z = MusicPatchPcmStream.field_r.field_z + 1;
                MusicPatchPcmStream.field_r.vehicles[fieldTemp$0] = new RaceVehicle(this.position.x, this.position.y, this.field_q, this.heading, this.field_vb, this.field_zb, this.field_C, 2);
              }
              this.l(554646678);
              this.field_L = 150;
            }
          }
          if (decompiledFrameCompleted0) {
            if (param1 <= -67) {
              return;
            }
            stackIn_37_0 = null;
          }
          field_Qb = (char[]) (stackIn_37_0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("ja.RA(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, VehicleDefinition param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_C = param1;
          this.field_p = true;
          this.field_z = true;
          this.field_i = this.field_C.field_k;
          if (param0 != 20385) {
            return;
          }
          this.field_k = this.field_C.field_K;
          this.field_B = (int)Math.ceil(Math.sqrt((double)(this.field_i * this.field_i + this.field_k * this.field_k)) + 1.0);
          this.field_lc = (float)this.field_C.field_i;
          this.field_kb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ja.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void k(int param0) {
        float stackIn_11_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        Point2i var3 = null;
        Vector2f var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          var2_float = (float)(-(int)this.field_vb) + this.field_vb;
          var3 = this.field_zb.pointAt(false, var2_float);
          var4 = this.field_zb.directionAt((byte) 126, var2_float);
          var5 = (float)Math.atan2((double)(-var4.y), (double)var4.x);
          var6 = -this.worldX + (float)var3.x;
          var7 = -this.worldY + (float)var3.y;
          var8 = var5 - this.heading;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if ((double)var8 > 3.141592653589793) {
              var8 = (float)((double)var8 - 6.283185307179586);
              decompiledFrameRemainder0 = (var10 == 0);
              if ((decompiledFrameRemainder0) &&
                (var10 == 0)) {
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              while (-3.141592653589793 > (double)var8) {
                stackIn_11_0 = (float)((double)var8 + 6.283185307179586);
                if (var10 != 0) {
                  break scanLoop1;
                }
                var8 = stackIn_11_0;
                if (var10 == 0) {
                  continue;
                }
                break;
              }
            }
            stackIn_11_0 = 1.0f / (float)this.field_O;
            break;
          }
          var9 = stackIn_11_0;
          this.velocityY = var9 * var7 / 0.07000000029802322f;
          this.angularVelocity = var9 * var8 / 0.019999999552965164f;
          this.velocityX = var6 * var9 / 0.07000000029802322f;
          if (param0 != -1675) {
            this.field_bb = 1.3815250396728516f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.U(" + param0 + ')');
        }
    }

    final float e(byte param0) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        Vector2f var3 = null;
        float stackIn_4_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_float = this.field_vb - (float)(int)this.field_vb;
          var3 = this.field_zb.directionAt((byte) 120, var2_float);
          if (param0 != 45) {
            field_Db = (Sprite[]) null;
          }
          stackIn_4_0 = (float)Math.atan2((double)(-var3.y), (double)var3.x);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.M(" + param0 + ')');
        }
    }

    private final void a(PathWaypoint[] param0, GrowableObjectList param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        float stackIn_56_0 = 0.0f;
        float stackIn_59_0 = 0.0f;
        float stackIn_60_1 = 0.0f;
        float stackIn_64_0 = 0.0f;
        float stackIn_67_0 = 0.0f;
        float stackIn_68_1 = 0.0f;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        IntrusiveDeque var5 = null;
        Point2i var6 = null;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PathWaypoint[] var16 = null;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        PathWaypoint[] var20 = null;
        PathWaypoint[] var21 = null;
        int var22 = 0;
        int stackIn_33_0Lifetime1;
        int stackIn_33_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        float var17Lifetime1;
        float var18Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var4_int = param0.length;
          if (0 == var4_int) {
            return;
          }
          var5 = MusicPatchPcmStream.field_r.field_cb;
          var6 = new Point2i(param2, 0);
          var7 = (wm) (var5.first((byte) 105));
          while (null != var7) {
            if (var22 != 0) {
              return;
            }
            if ((8 & var7.field_J) == 0 ||
              !this.b(-26, var7.field_v) &&
              !this.b(-106, var7.field_m) &&
              !this.b(-100, var7.field_l) &&
              !this.b(param2 ^ -72, var7.field_s)) {
              var7 = (wm) (var5.next((byte) -34));
              continue;
            }
            var8 = var7.position.x - param0[0].x;
            var9 = var7.position.y - param0[0].y;
            var10 = var8 * var8 + var9 * var9;
            var11 = var10;
            var12 = 0;
            var13 = 1;
            while (var13 < var4_int) {
              var8Lifetime1 = -param0[var13].x + var7.position.x;
              var9Lifetime1 = var7.position.y - param0[var13].y;
              var10Lifetime1 = var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1;
              stackIn_33_0 = var10Lifetime1;
              stackIn_33_1 = var11;
              if (stackIn_33_0 < stackIn_33_1) {
                var11 = var10Lifetime1;
                var12 = var13;
              }
              var13++;
            }
            stackIn_33_0Lifetime1 = ~var11;
            stackIn_33_1Lifetime1 = -1;
            if (stackIn_33_0Lifetime1 > stackIn_33_1Lifetime1) {
              throw new RuntimeException();
            }
            if (!param0[var12].field_m) {
              var13Lifetime1 = var7.field_B + (this.field_C.field_k + 5);
              var14 = var7.field_B + this.field_C.field_k + 90;
              if (var11 < var14 * var14) {
                var16 = new PathWaypoint[var4_int];
                var15 = 0;
                while (var4_int > var15) {
                  var16[var15] = new PathWaypoint(param0[var15]);
                  var15++;
                }
                var6.x = var7.position.x;
                var6.y = var7.position.y;
                this.a(var6, var12, var16, -1);
                param1.add(var16, (byte) 6);
                if (var11 < (var13Lifetime1 * var13Lifetime1)) {
                  if (var12 != -1 + param0.length) {
                    stackIn_56_0 = (float)param0[var12 + 1].x;
                  } else {
                    stackIn_56_0 = (float)param0[var12].x;
                  }
                  var17 = stackIn_56_0;
                  stackIn_59_0 = var17;
                  if (var12 != 0) {
                    stackIn_60_1 = (float)param0[-1 + var12].x;
                  } else {
                    stackIn_60_1 = (float)param0[0].x;
                  }
                  var17Lifetime1 = stackIn_59_0 - stackIn_60_1;
                  if (var12 != param0.length - 1) {
                    stackIn_64_0 = (float)param0[1 + var12].y;
                  } else {
                    stackIn_64_0 = (float)param0[var12].y;
                  }
                  var18 = stackIn_64_0;
                  stackIn_67_0 = var18;
                  if (var12 != 0) {
                    stackIn_68_1 = (float)param0[var12 - 1].y;
                  } else {
                    stackIn_68_1 = (float)param0[0].y;
                  }
                  var18Lifetime1 = stackIn_67_0 - stackIn_68_1;
                  var19 = (float)Math.sqrt((double)(var18Lifetime1 * var18Lifetime1 + var17Lifetime1 * var17Lifetime1));
                  var17Lifetime1 = var17Lifetime1 / var19;
                  var18Lifetime1 = var18Lifetime1 / var19;
                  var20 = new PathWaypoint[var4_int];
                  var21 = new PathWaypoint[var4_int];
                  var15Lifetime1 = 0;
                  while (var15Lifetime1 < var4_int) {
                    var20[var15Lifetime1] = new PathWaypoint(param0[var15Lifetime1]);
                    var21[var15Lifetime1] = new PathWaypoint(param0[var15Lifetime1]);
                    var15Lifetime1++;
                  }
                  var6.y = (int)((float)var7.position.y - (float)(15 + var13Lifetime1) * var17Lifetime1);
                  var6.x = (int)((float)var7.position.x + var18Lifetime1 * (float)(var13Lifetime1 + 15));
                  this.a(var6, var12, var20, -1);
                  var6.y = (int)((float)var7.position.y + var17Lifetime1 * (float)(var13Lifetime1 + 15));
                  var6.x = (int)(-((float)(-5 + (20 + var13Lifetime1)) * var18Lifetime1) + (float)var7.position.x);
                  this.a(var6, var12, var21, -1);
                  param1.add(var20, (byte) 6);
                  param1.add(var21, (byte) 6);
                  return;
                }
                return;
              }
            }
            var7 = (wm) (var5.next((byte) 86));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_82_0 = var4;
          stackIn_82_1 = new StringBuilder().append("ja.PA(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param1 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        NamedSoundEffect stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        NamedSoundEffect var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0.0f == this.field_ic) {
            if (this.field_I) {
              var2_int = 0;
              if (this.field_rb != null) {
                var2_int = this.field_rb.field_o.getSamplePosition();
                boolean decompiledSharedTail0 = (var2_int != -1 &&
                  (var2_int < this.field_C.field_u.field_m));
                if (!decompiledSharedTail0) {
                  var2_int = 0;
                  decompiledSharedTail0 = (var3 != 0);
                }
                if (decompiledSharedTail0) {
                  var2_int = this.field_C.field_u.field_m - var2_int;
                  var2_int = var2_int * this.field_C.field_L.field_n.length;
                  var2_int = var2_int / this.field_C.field_u.field_m;
                }
              }
              if (this.field_S != null) {
                NanoTickClock.removeEntitySound(true, this.field_S);
              }
              this.field_S = ValidationHelpWidget.a((byte) 3, (MovingEntity) (this), this.field_C.field_L, this.field_C.field_L.field_q);
              this.field_S.field_o.setSamplePosition(var2_int);
              this.field_S.field_o.setLoopCount(-1);
              this.field_I = false;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_eb < 8) {
                this.field_eb = this.field_eb + 1;
              }
              decompiledFrameRemainder0 = !(0 >= this.field_Vb);
              if (decompiledFrameRemainder0) {
                fieldTemp$0 = this.field_Vb - 1;
                this.field_Vb = this.field_Vb - 1;
                decompiledFrameRemainder0 = (fieldTemp$0 == 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (null != this.field_rb))) {
                  NanoTickClock.removeEntitySound(true, this.field_rb);
                  this.field_rb = null;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_I) {
              if (this.field_rb.field_o.getSamplePosition() > this.field_C.field_u.field_m &&
                0.0f != this.field_jc &&
                SolidRoadStripRenderer.b(2, 50) == 0) {
                this.field_rb.field_o.setSamplePosition((this.field_C.field_u.field_m + SolidRoadStripRenderer.b(2, this.field_C.field_u.field_m)) / 2);
              }
              if (this.field_Vb < 8) {
                this.field_Vb = this.field_Vb + 1;
              }
              decompiledFrameRemainder0 = !(this.field_eb <= 0);
              if (decompiledFrameRemainder0) {
                fieldTemp$1 = this.field_eb - 1;
                this.field_eb = this.field_eb - 1;
                decompiledFrameRemainder0 = (fieldTemp$1 == 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (this.field_S != null))) {
                  NanoTickClock.removeEntitySound(true, this.field_S);
                  this.field_S = null;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var2_intLifetime1 = 0;
              if (this.field_S != null) {
                var2_intLifetime1 = this.field_S.field_o.getSamplePosition();
                if (var2_intLifetime1 == -1) {
                  var2_intLifetime1 = 0;
                  if (var3 != 0) {
                    var2_intLifetime1 = this.field_C.field_L.field_n.length - var2_intLifetime1;
                    var2_intLifetime1 = var2_intLifetime1 * this.field_C.field_u.field_m;
                    var2_intLifetime1 = var2_intLifetime1 / this.field_C.field_L.field_n.length;
                  }
                } else {
                  var2_intLifetime1 = this.field_C.field_L.field_n.length - var2_intLifetime1;
                  var2_intLifetime1 = var2_intLifetime1 * this.field_C.field_u.field_m;
                  var2_intLifetime1 = var2_intLifetime1 / this.field_C.field_L.field_n.length;
                }
              }
              if (this.field_rb != null) {
                NanoTickClock.removeEntitySound(true, this.field_rb);
              }
              this.field_rb = ValidationHelpWidget.a((byte) 114, (MovingEntity) (this), this.field_C.field_u, this.field_C.field_u.field_q);
              this.field_rb.field_o.setSamplePosition(var2_intLifetime1);
              this.field_rb.field_o.setLoopCount(-1);
              this.field_I = true;
            }
          }
          if (MusicPatchPcmStream.field_r.field_r != 1) {
            if (this.field_wb > 1.0f) {
              if (this.field_Kb < 16) {
                this.field_Kb = this.field_Kb + 1;
              }
              if (this.field_Z == null) {
                this.field_Z = ValidationHelpWidget.a((byte) 5, (MovingEntity) (this), Point2i.field_c, this.field_Kb * Point2i.field_c.field_q >> 4);
                this.field_Z.field_o.setLoopCount(-1);
                if (var3 != 0) {
                  this.field_Z.field_n = this.field_Kb * Point2i.field_c.field_q >> 4;
                  if (this.field_Kb > 0) {
                    this.field_Kb = this.field_Kb - 1;
                  }
                  if (this.field_Z != null) {
                    this.field_Z.field_n = Point2i.field_c.field_q * this.field_Kb >> 4;
                  }
                }
              } else {
                this.field_Z.field_n = this.field_Kb * Point2i.field_c.field_q >> 4;
                if (var3 != 0) {
                  if (this.field_Kb > 0) {
                    this.field_Kb = this.field_Kb - 1;
                  }
                  if (this.field_Z != null) {
                    this.field_Z.field_n = Point2i.field_c.field_q * this.field_Kb >> 4;
                  }
                }
              }
            } else {
              if (this.field_Kb > 0) {
                this.field_Kb = this.field_Kb - 1;
              }
              if (this.field_Z != null) {
                this.field_Z.field_n = Point2i.field_c.field_q * this.field_Kb >> 4;
              }
            }
          }
          if (MusicPatchPcmStream.field_r.field_r != 3) {
            if (2 != MusicPatchPcmStream.field_r.field_r) {
              stackIn_103_0 = rc.field_a;
            } else {
              stackIn_103_0 = TextFieldRenderer.field_t;
            }
            var2 = stackIn_103_0;
            if (Math.abs(this.field_jc) > 1.0f &&
              !MusicPatchPcmStream.field_r.a(this.field_q, false, this.position)) {
              if (this.field_dc < 16) {
                this.field_dc = this.field_dc + 1;
              }
              if (null != this.field_ub) {
                this.field_ub.field_n = this.field_dc * var2.field_q >> 4;
                if (var3 != 0) {
                  this.field_ub = ValidationHelpWidget.a((byte) 38, (MovingEntity) (this), var2, this.field_dc * var2.field_q >> 4);
                  this.field_ub.field_o.setLoopCount(-1);
                  if (this.field_dc > 0) {
                    this.field_dc = this.field_dc - 1;
                  }
                  if (null != this.field_ub) {
                    this.field_ub.field_n = this.field_dc * var2.field_q >> 4;
                  }
                }
              } else {
                this.field_ub = ValidationHelpWidget.a((byte) 38, (MovingEntity) (this), var2, this.field_dc * var2.field_q >> 4);
                this.field_ub.field_o.setLoopCount(-1);
                if (var3 != 0) {
                  if (this.field_dc > 0) {
                    this.field_dc = this.field_dc - 1;
                  }
                  if (null != this.field_ub) {
                    this.field_ub.field_n = this.field_dc * var2.field_q >> 4;
                  }
                }
              }
            } else {
              if (this.field_dc > 0) {
                this.field_dc = this.field_dc - 1;
              }
              if (null != this.field_ub) {
                this.field_ub.field_n = this.field_dc * var2.field_q >> 4;
              }
            }
          }
          if (param0 < 103) {
            return;
          }
          if ((this.field_Fb[1] > 0 ||
            this.field_J == 1) &&
            this.field_ic > 0.0f) {
            if (this.field_gc < 16) {
              this.field_gc = this.field_gc + 1;
            }
            if (null == this.field_fb) {
              this.field_fb = ValidationHelpWidget.a((byte) 109, (MovingEntity) (this), StrongCacheEntry.field_s, this.field_gc * StrongCacheEntry.field_s.field_q >> 4);
              this.field_fb.field_o.setLoopCount(-1);
              if (var3 == 0) {
                return;
              }
            }
            this.field_fb.field_n = StrongCacheEntry.field_s.field_q * this.field_gc >> 4;
            if (var3 == 0) {
              return;
            }
          }
          if (this.field_gc > 0) {
            this.field_gc = this.field_gc - 1;
          }
          if (this.field_fb != null) {
            this.field_fb.field_n = StrongCacheEntry.field_s.field_q * this.field_gc >> 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "ja.K(" + param0 + ')');
        }
    }

    private final GrowableObjectList a(float param0, float param1, float param2, int param3) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        GrowableObjectList stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        RoadSegment[] var5 = null;
        RuntimeException var5_ref = null;
        GrowableObjectList var6 = null;
        int var7 = 0;
        float var8 = 0.0f;
        RoadSegment var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        RoadSegment var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        var17 = HoldTheLine.field_D;
        try {
          var5 = MusicPatchPcmStream.field_r.roadSegments;
          var6 = new GrowableObjectList();
          var7 = (int)param1;
          var8 = (float)(-var7) + param1;
          if (var7 == var5.length) {
            var7 = 0;
          }
          boolean decompiledFrameCompleted0 = true;
          var9 = var5[var7];
          var10 = var9.length(50);
          var11 = param0 / var10;
          if (!(1.0f > var8 + var11)) {
            param0 = param0 + var10 * var8;
            while (param0 >= var10) {
              param0 = param0 - var10;
              var7++;
              stackIn_17_0 = var7;
              stackIn_17_1 = var5.length;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_17_0 == stackIn_17_1) {
                var7 = 0;
              }
              var9 = var5[var7];
              var10 = var9.length(50);
            }
            if (decompiledFrameCompleted0) {
              var8 = param0 / var10;
              if (var17 != 0) {
                var8 = var8 + var11;
              }
            }
          } else {
            var8 = var8 + var11;
          }
          if (decompiledFrameCompleted0) {
            this.field_qc = var7;
            stackIn_17_0 = param3;
            stackIn_17_1 = 55;
          }
          if (stackIn_17_0 < stackIn_17_1) {
            this.a(false, false, true, 14, false, true, true);
          }
          boolean decompiledFrameRemainder0 = true;
          var12 = param2 / var10;
          if (var12 + var8 < 1.0f) {
            this.field_kc = var7;
            var6.add(hk.a(ao.a(var8, true, var9, var12 + var8), 1, false), (byte) 6);
            decompiledFrameRemainder0 = (var17 != 0);
          }
          if (decompiledFrameRemainder0) {
            var6.add(hk.a(sa.a(var9, var8, (byte) -97), 1, false), (byte) 6);
            param2 = param2 - var10 * (-var8 + 1.0f);
            if (0.0f < param2) {
              var13 = (var7 + 1) % var5.length;
              var14 = var5[var13];
              var15 = var14.length(50);
              while (true) {
                if (var15 <= param2) {
                  param2 = param2 - var15;
                  var6.add(hk.a(var14, 1, false), (byte) 6);
                  var13++;
                  if (var17 == 0) {
                    if (~var13 == ~var5.length) {
                      var13 = 0;
                    }
                    var14 = var5[var13];
                    var15 = var14.length(50);
                    continue;
                  }
                } else {
                  this.field_kc = var13;
                }
                break;
              }
              var16 = param2 / var15;
              var6.add(hk.a(fj.a(false, var16, var14), 1, false), (byte) 6);
            }
          }
          stackIn_38_0 = var6;
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var5_ref), "ja.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_Cb = false;
          this.field_q = this.field_uc;
          this.field_tb = 0;
          this.field_xc = 0.0f;
          this.field_Jb = 0;
          this.field_sc = new PathWaypoint[32];
          this.field_ic = 0.0f;
          this.field_V = false;
          this.heading = this.field_D;
          this.field_H = this.field_D;
          this.field_vb = this.field_E;
          this.field_Ib = this.field_E;
          this.position.y = this.field_mb;
          this.worldY = (float)this.field_mb;
          this.field_T = 0;
          this.field_Lb = 0;
          this.field_O = 0;
          this.angularVelocity = 0.0f;
          this.field_P = 0.0f;
          this.field_Gb = 0.0f;
          this.field_zb = this.field_K;
          this.position.x = this.field_Mb;
          this.worldX = (float)this.field_Mb;
          this.field_wc = 0.0f;
          this.field_jb = false;
          this.velocityX = 0.0f;
          this.field_xb = 0;
          this.velocityY = 0.0f;
          this.f(3);
          this.field_lc = (float)this.field_C.field_i;
          this.field_N = (float)this.field_C.field_i;
          this.field_Ab = true;
          this.field_nb = this.position.x - (int)((float)this.field_C.field_K * this.direction.x + (float)this.field_C.field_k * this.direction.y);
          if (param0 != 554646678) {
            this.a((byte) -40, 71, (PathWaypoint) null);
          }
          this.field_I = false;
          this.field_Tb = -(int)(-((float)this.field_C.field_k * this.direction.x) + this.direction.y * (float)this.field_C.field_K) + this.position.y;
          this.field_pc = 0;
          this.field_Xb = -(int)(-((float)this.field_C.field_k * this.direction.y) + this.direction.x * (float)this.field_C.field_K) + this.position.x;
          this.field_Ob = -(int)((float)this.field_C.field_K * this.direction.y + (float)this.field_C.field_k * this.direction.x) + this.position.y;
          this.field_Hb = 0;
          this.field_Bb = null;
          this.field_Yb = 0;
          this.field_qb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.HA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        boolean discarded$4 = false;
        int stackIn_125_0 = 0;
        int stackIn_135_0 = 0;
        wm stackIn_138_0 = null;
        wm stackIn_138_1 = null;
        Point2i stackIn_138_2 = null;
        wm stackIn_139_0 = null;
        wm stackIn_139_1 = null;
        int stackIn_139_3 = 0;
        int stackIn_164_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        float var3 = 0.0f;
        int var4_int = 0;
        Vector2f var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wm var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          if (0 != this.field_rc) {
            this.a(false, false, false, 121, false, false, true);
            if (this.field_rc == 2) {
              fieldTemp$5 = this.field_L + 1;
              this.field_L = this.field_L + 1;
              if (30000 == fieldTemp$5) {
                this.b(false);
                if ((var9 != 0) &&
                  (29820 <= this.field_L)) {
                  this.field_z = false;
                }
              } else {
                if (29820 <= this.field_L) {
                  this.field_z = false;
                }
              }
            }
            this.h(84);
            return;
          }
          if (this.field_L > 0) {
            this.field_L = this.field_L - 1;
          }
          boolean decompiledFrameRemainder2 = true;
          if (this.field_W == null) {
            this.field_F = false;
            if (this.field_Yb <= 0) {
              if (MusicPatchPcmStream.field_r.field_f) {
                this.a(false, false, false, 126, false, false, true);
                decompiledFrameRemainder2 = (var9 != 0);
              }
              if (decompiledFrameRemainder2) {
                this.f((byte) 81);
                decompiledFrameRemainder2 = (var9 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              this.field_Yb = this.field_Yb - 3;
              decompiledFrameRemainder2 = (var9 != 0);
            }
          }
          if (decompiledFrameRemainder2) {
            if (0 < this.field_O) {
              this.a(false, false, false, 109, false, false, false);
              decompiledFrameRemainder2 = (var9 != 0);
            }
            if (decompiledFrameRemainder2) {
              var2_int = ma.a(this.field_W[0], param0 + 1244) ? 1 : 0;
              var3_int = ma.a(this.field_W[1], -1) ? 1 : 0;
              var4_int = ma.a(this.field_W[2], param0 + 1244) ? 1 : 0;
              var5 = ma.a(this.field_W[3], -1) ? 1 : 0;
              var6 = ma.a(this.field_W[4], -1) ? 1 : 0;
              if (var2_int != 0 ||
                var3_int != 0 ||
                var4_int != 0 ||
                var5 != 0) {
                this.field_tb = 0;
              }
              if (this.field_jc > 10.0f) {
                this.a(var2_int != 0, var4_int != 0, var6 != 0, param0 ^ -1194, false, var3_int != 0, var5 != 0);
                if (var9 != 0) {
                  if (-10.0f > this.field_jc) {
                    this.a(var2_int != 0, false, var6 != 0, 125, var5 != 0, var3_int != 0, var4_int != 0);
                    this.a(var2_int != 0, var4_int != 0, var6 != 0, 116, var5 != 0, var3_int != 0, false);
                  } else {
                    this.a(var2_int != 0, var4_int != 0, var6 != 0, 116, var5 != 0, var3_int != 0, false);
                  }
                }
              } else {
                boolean decompiledSharedTail1 = !(-10.0f > this.field_jc);
                if (!decompiledSharedTail1) {
                  this.a(var2_int != 0, false, var6 != 0, 125, var5 != 0, var3_int != 0, var4_int != 0);
                  decompiledSharedTail1 = (var9 != 0);
                }
                if (decompiledSharedTail1) {
                  this.a(var2_int != 0, var4_int != 0, var6 != 0, 116, var5 != 0, var3_int != 0, false);
                }
              }
            }
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          var2_int = 0;
          if (this.field_nc &&
            !this.field_F) {
            if (this.field_Fb[0] != 1) {
              if (this.field_Fb[0] != 2) {
                if ((this.field_Fb[0] != 3 &&
                  this.field_Fb[1] != 3 &&
                  3 != this.field_Fb[2]) &&
                  (decompiledFrameRemainder1 = !(this.field_fc >= (-30 + MusicPatchPcmStream.field_r.field_ab)))) {
                  ad.playSample(255, 64, DualNodeHashTable.field_b);
                  this.field_fc = MusicPatchPcmStream.field_r.field_ab;
                  decompiledFrameRemainder1 = (var9 != 0);
                }
                if (decompiledFrameRemainder1) {
                  boolean decompiledFrameRemainder0 = true;
                  if ((this.field_hc[0] == 0) &&
                    (decompiledFrameRemainder0 = !(this.field_Rb < 0))) {
                    if (null != this.field_lb &&
                      this.field_lb.isLinked(param0 + 1338)) {
                      this.field_lb.unlink(param0 + 1245);
                    }
                    this.field_lb = new wm(this.position, 11, this.field_q, this.heading, this.direction.x * 55.0f + this.velocityX, this.velocityY + 55.0f * this.direction.y);
                    this.field_lb.field_J = this.field_lb.field_J | this.field_mc;
                    ValidationHelpWidget.a((byte) 117, this.field_lb, ValidatedTextField.field_T, ValidatedTextField.field_T.field_q);
                    MusicPatchPcmStream.field_r.field_W.addLast((byte) -112, this.field_lb);
                    this.field_Rb = 0;
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (1 != this.field_hc[0]) {
                      if (this.field_hc[0] == 2) {
                        this.field_J = 2;
                        this.field_ac = 500;
                        if (var9 != 0) {
                          this.field_ac = 250;
                          this.field_J = 1;
                          ValidationHelpWidget.a((byte) 84, (MovingEntity) (this), pe.field_b, pe.field_b.field_q);
                        }
                      }
                    } else {
                      this.field_ac = 250;
                      this.field_J = 1;
                      ValidationHelpWidget.a((byte) 84, (MovingEntity) (this), pe.field_b, pe.field_b.field_q);
                    }
                  }
                  var3_int = 0;
                  while (var3_int < 3) {
                    var4_int = 0;
                    var5 = 0;
                    stackIn_164_0 = 0;
                    if (var9 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var6 = stackIn_164_0;
                    do {
                      var4_int = SolidRoadStripRenderer.b(2, 640);
                      var5 = SolidRoadStripRenderer.b(2, 480);
                      var6 = MusicPatchPcmStream.field_r.d(var5, var4_int, param0 ^ 1217);
                      stackIn_125_0 = -1;
                    } while (stackIn_125_0 == ~var6);
                    stackIn_125_0 = 48 & var6;
                    if (stackIn_125_0 != 0) {
                      stackIn_135_0 = 1;
                    } else {
                      stackIn_135_0 = ((12 & var6) == 0) ? -1 : 0;
                    }
                    var7 = stackIn_135_0;
                    stackIn_138_0 = null;
                    stackIn_138_1 = null;
                    stackIn_138_2 = this.position;
                    if (this.field_hc[var3_int] == 3) {
                      stackIn_139_0 = null;
                      stackIn_139_1 = null;
                      stackIn_139_3 = 1;
                    } else {
                      stackIn_139_0 = null;
                      stackIn_139_1 = null;
                      stackIn_139_3 = this.field_hc[var3_int] + 2;
                    }
                    var8 = new wm(stackIn_138_2, stackIn_139_3, 3);
                    var8.field_C = 150;
                    var8.field_J = var8.field_J | 131072;
                    var8.field_D = var4_int;
                    var8.field_P = -this.position.x + var4_int;
                    var8.field_T = var7;
                    var8.field_z = false;
                    var8.field_F = var5;
                    var8.field_O = -this.position.y + var5;
                    MusicPatchPcmStream.field_r.field_W.addLast((byte) -124, var8);
                    this.field_hc[var3_int] = -1;
                    var3_int++;
                  }
                  if (decompiledFrameCompleted0) {
                    this.field_Fb[0] = 0;
                    this.field_Fb[3] = 0;
                    this.field_Fb[1] = 0;
                    this.field_Fb[2] = 0;
                    this.field_fc = MusicPatchPcmStream.field_r.field_ab;
                    decompiledFrameRemainder1 = (var9 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameCompleted0) &&
                (!(this.field_Rb < 0))) {
                var2_int = this.c((byte) -71) ? 1 : 0;
                if ((var9 != 0) && (this.field_Rb >= 250 ||
                  this.field_yb == null ||
                  !this.field_yb.isLinked(56))) {
                  this.field_Ub = 20;
                  if (this.field_yb != null &&
                    this.field_yb.isLinked(60)) {
                    this.field_yb.unlink(0);
                  }
                  this.field_yb = new wm(this.position, 9, this.field_q, this.heading, this.velocityX - this.direction.x * 50.0f, -(this.direction.y * 50.0f) + this.velocityY);
                  this.field_yb.field_J = this.field_yb.field_J | this.field_mc;
                  this.field_yb.a(SoundPlayback.field_i, 90);
                  ValidationHelpWidget.a((byte) 91, this.field_yb, ArchiveLoadStage.field_i, ArchiveLoadStage.field_i.field_q);
                  MusicPatchPcmStream.field_r.field_W.addLast((byte) -94, this.field_yb);
                  this.field_Rb = 0;
                }
              }
            } else {
              if (this.field_Rb >= 250 ||
                this.field_yb == null ||
                !this.field_yb.isLinked(56)) {
                this.field_Ub = 20;
                if (this.field_yb != null &&
                  this.field_yb.isLinked(60)) {
                  this.field_yb.unlink(0);
                }
                this.field_yb = new wm(this.position, 9, this.field_q, this.heading, this.velocityX - this.direction.x * 50.0f, -(this.direction.y * 50.0f) + this.velocityY);
                this.field_yb.field_J = this.field_yb.field_J | this.field_mc;
                this.field_yb.a(SoundPlayback.field_i, 90);
                ValidationHelpWidget.a((byte) 91, this.field_yb, ArchiveLoadStage.field_i, ArchiveLoadStage.field_i.field_q);
                MusicPatchPcmStream.field_r.field_W.addLast((byte) -94, this.field_yb);
                this.field_Rb = 0;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_164_0 = var2_int;
          }
          if (stackIn_164_0 == 0) {
            if (null != this.field_vc) {
              NanoTickClock.removeEntitySound(true, this.field_vc);
              this.field_vc = null;
              if ((var9 != 0) &&
                (null == this.field_vc)) {
                this.field_vc = ValidationHelpWidget.a((byte) 13, (MovingEntity) (this), RoadFillRenderer.field_b, RoadFillRenderer.field_b.field_q);
                this.field_vc.field_o.setLoopCount(-1);
              }
            }
          } else {
            if (null == this.field_vc) {
              this.field_vc = ValidationHelpWidget.a((byte) 13, (MovingEntity) (this), RoadFillRenderer.field_b, RoadFillRenderer.field_b.field_q);
              this.field_vc.field_o.setLoopCount(-1);
            }
          }
          if (this.field_jc == 0.0f &&
            0.0f != this.field_ic) {
            this.field_pb = 0;
          }
          if (MusicPatchPcmStream.field_r.field_ab > 0) {
            fieldTemp$0 = this.field_pb + 1;
            this.field_pb = this.field_pb + 1;
            if (fieldTemp$0 >= 25 &&
              DualLinkNode.signumFloat(param0 - 28162, this.field_jc) == DualLinkNode.signumFloat(-29407, this.field_ic)) {
              this.field_Cb = false;
            }
          }
          if (this.field_Ub > 0) {
            this.field_Ub = this.field_Ub - 1;
          }
          this.field_Rb = this.field_Rb + 1;
          if (0 < this.field_ac) {
            fieldTemp$1 = this.field_ac - 1;
            this.field_ac = this.field_ac - 1;
            if (0 == fieldTemp$1) {
              this.field_J = -1;
            }
          }
          if ((MusicPatchPcmStream.field_r.field_J == 2 ||
            6 == MusicPatchPcmStream.field_r.field_J) &&
            !MusicPatchPcmStream.field_r.a(this.field_q, false, this.position)) {
            this.a(1.0f, 0, (RaceVehicle) null, 7);
          }
          if (MusicPatchPcmStream.field_r.field_J != 2 &&
            6 != MusicPatchPcmStream.field_r.field_J) {
            this.field_lc = this.field_lc + (float)this.field_C.field_i / 1500.0f;
            if ((float)this.field_C.field_i <= this.field_lc) {
              this.field_lc = (float)this.field_C.field_i;
            }
          }
          this.field_N = this.field_N + 0.05000000074505806f * (this.field_lc - this.field_N);
          if (this.field_W != null) {
            this.field_tb = this.field_tb + 1;
            if (!this.field_jb &&
              MusicPatchPcmStream.field_r.field_J != 2) {
              var3 = (float)(-(int)this.field_vb) + this.field_vb;
              var4 = this.field_zb.directionAt((byte) 127, var3);
              boolean decompiledSharedTail0 = !(!(0.5 > (double)this.direction.dot(var4, (byte) -10)));
              if (!decompiledSharedTail0) {
                this.field_Jb = 0;
                decompiledSharedTail0 = (var9 != 0);
              }
              if (decompiledSharedTail0) {
                fieldTemp$2 = this.field_Jb + 1;
                this.field_Jb = this.field_Jb + 1;
                if (fieldTemp$2 >= 100 &&
                  this.field_tb >= 100) {
                  this.field_O = 25;
                }
              }
            }
            if (this.field_O > 0) {
              fieldTemp$3 = this.field_O - 1;
              this.field_O = this.field_O - 1;
              if (fieldTemp$3 == 0) {
                this.velocityY = 0.0f;
                this.field_jc = 0.0f;
                this.velocityX = 0.0f;
                this.field_Y = 0.0f;
                this.field_wc = 0.0f;
                this.angularVelocity = 0.0f;
              }
            }
          }
          if (this.field_Q > 0) {
            this.field_Q = this.field_Q - 1;
          }
          this.field_Hb = this.field_Hb + 1;
          this.field_pc = this.field_pc + 1;
          this.g((byte) 124);
          if (param0 != -1245) {
            discarded$4 = this.c((byte) 19);
          }
          this.h(param0 + 1292);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.FA(" + param0 + ')');
        }
    }

    private final void a(Point2i param0, int param1, PathWaypoint[] param2, int param3) {
        PathWaypoint dupTemp$0 = null;
        PathWaypoint dupTemp$1 = null;
        PathWaypoint dupTemp$2 = null;
        PathWaypoint dupTemp$3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          var5_float = (float)(param0.x - param2[param1].x);
          var6 = (float)(param0.y - param2[param1].y);
          var7 = -19;
          if (param3 < ~(var7 + param1)) {
            var7 = -param1;
          }
          var8 = 20;
          if ((var8 + param1) > param2.length) {
            var8 = -param1 + param2.length;
          }
          var9 = var7;
          do {
            if (0 <= var9) {
              param2[param1].x = param0.x;
              param2[param1].y = param0.y;
              param2[param1].field_m = true;
              break;
            }
            var10 = (float)(-var9) / 20.0f;
            var11 = 1.0f - (3.0f - var10 * 2.0f) * (var10 * var10);
            dupTemp$0 = param2[var9 + param1];
            dupTemp$0.x = (int)((float)dupTemp$0.x + var5_float * var11);
            dupTemp$1 = param2[param1 + var9];
            dupTemp$1.y = (int)((float)dupTemp$1.y + var6 * var11);
            var9++;
          } while (var12 == 0);
          var9 = 1;
          while (var9 < var8) {
            var10 = (float)var9 / 20.0f;
            var11 = 1.0f - var10 * var10 * (3.0f - 2.0f * var10);
            dupTemp$2 = param2[var9 + param1];
            dupTemp$2.x = (int)((float)dupTemp$2.x + var5_float * var11);
            dupTemp$3 = param2[var9 + param1];
            dupTemp$3.y = (int)((float)dupTemp$3.y + var11 * var6);
            var9++;
            if (var12 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ja.H(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        Vector2f stackIn_47_0 = null;
        Vector2f stackIn_47_1 = null;
        boolean stackIn_48_2 = false;
        float stackIn_89_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        Vector2f var17_ref_in = null;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29_float = 0.0f;
        int var29 = 0;
        float var30_float = 0.0f;
        int var30 = 0;
        float var31 = 0.0f;
        int var32 = 0;
        float var16Lifetime1;
        float var21Lifetime1;
        float var28Lifetime1;
        var32 = HoldTheLine.field_D;
        try {
          this.field_jc = this.direction.x * this.velocityX + this.velocityY * this.direction.y;
          this.field_Y = this.velocityX * this.direction.y - this.direction.x * this.velocityY;
          var2_float = this.field_jc * (this.field_jc * this.field_C.field_m);
          var3 = var2_float + this.field_C.field_l / this.field_C.field_g * (9.8100004196167f * this.field_C.field_C - this.field_Gb * this.field_C.field_M);
          var4 = var2_float + this.field_C.field_l / this.field_C.field_g * (this.field_Gb * this.field_C.field_M + 9.8100004196167f * this.field_C.field_j);
          var5 = (float)Math.atan2((double)(this.angularVelocity * this.field_C.field_j + this.field_Y), (double)Math.abs(this.field_jc)) - this.field_P * DualLinkNode.signumFloat(-29407, this.field_jc);
          var6 = (float)Math.atan2((double)(-(this.field_C.field_C * this.angularVelocity) + this.field_Y), (double)Math.abs(this.field_jc));
          if (Math.abs(var5) > this.field_C.field_F) {
            var5 = DualLinkNode.signumFloat(-29407, var5) * this.field_C.field_F;
          }
          if (Math.abs(var6) > this.field_C.field_F) {
            var6 = DualLinkNode.signumFloat(-29407, var6) * this.field_C.field_F;
          }
          var7 = var3 * (var5 * this.field_C.field_y);
          var8 = var4 * (var6 * this.field_C.field_y);
          var9 = 0;
          if (this.field_C.field_o &&
            0.0f != this.field_P &&
            DualLinkNode.signumFloat(-29407, this.field_P) != DualLinkNode.signumFloat(-29407, this.angularVelocity)) {
            this.angularVelocity = this.angularVelocity * 0.800000011920929f;
            var9 = 1;
            if (DualLinkNode.signumFloat(-29407, this.field_P) != DualLinkNode.signumFloat(-29407, this.field_wc)) {
              this.field_wc = this.field_wc * 0.6000000238418579f;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          var10 = this.field_ic * this.field_C.field_s * this.field_C.field_p / this.field_C.field_E;
          var11 = 0.0f;
          var11 = Math.abs(var10) * this.field_C.field_q;
          if (this.field_J == 1) {
            var10 = var10 * (1.0f + this.field_C.field_r * 3.0f);
            var11 = var10;
            decompiledFrameRemainder1 = (var32 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (2 == this.field_J) {
              var10 = var10 * (1.0f + this.field_C.field_r * 1.0f);
              decompiledFrameRemainder1 = (var32 != 0);
            }
            if (decompiledFrameRemainder1) {
              boolean decompiledSharedTail0 = !(this.field_Fb[1] >= 2);
              if (!decompiledSharedTail0) {
                var10 = var10 * (1.0f + 0.800000011920929f * this.field_C.field_r);
                decompiledSharedTail0 = (var32 != 0);
              }
              if ((decompiledSharedTail0) &&
                (1 == this.field_Fb[1])) {
                var10 = var10 * (0.30000001192092896f * this.field_C.field_r + 1.0f);
              }
            }
          }
          if (MusicPatchPcmStream.field_r.field_J == 0 ||
            3 == MusicPatchPcmStream.field_r.field_J) {
            var10 = var10 * this.a((byte) 19);
          }
          if (this.field_Cb) {
            var10 = var10 * 3.0f;
          }
          var12 = this.field_C.field_w;
          var12 = var12 * this.a((byte) 115, oi.field_c);
          var13 = var4 * (this.field_C.field_I * this.field_xc) * DualLinkNode.signumFloat(-29407, this.field_jc);
          var14 = 0.0f;
          var15 = 0.0f;
          if (this.field_zb.field_o != 0.0f) {
            var16 = 60.0f * (this.field_zb.field_o * (-this.field_C.field_l * 9.8100004196167f));
            var17_ref_in = this.field_zb.directionAt((byte) 121, (float)(-(int)this.field_vb) + this.field_vb);
            var15 = var17_ref_in.dot(this.direction, (byte) -10) * var16;
            stackIn_47_0 = var17_ref_in;
            stackIn_47_1 = this.direction;
            stackIn_48_2 = !(param0);
            var14 = ((Vector2f) (Object) stackIn_47_0).cross(stackIn_47_1, stackIn_48_2) * var16;
            if (0.0f != this.field_ic &&
              DualLinkNode.signumFloat(-29407, var15) != DualLinkNode.signumFloat(-29407, var10)) {
              var14 = 0.0f;
              var15 = 0.0f;
            }
          }
          var16Lifetime1 = var3 * var12;
          var17 = var12 * var4;
          var18 = 0;
          var19 = 0;
          if (this.field_W != null) {
            if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.position.x - (float)this.field_C.field_k * this.direction.y + this.direction.x * (float)this.field_C.field_K), -3, (int)(this.direction.y * (float)this.field_C.field_K + ((float)this.position.y + this.direction.x * (float)this.field_C.field_k)))) {
              var18++;
            }
            if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.direction.x + (this.direction.y * (float)this.field_C.field_k + (float)this.position.x)), -3, (int)((float)this.position.y - (float)this.field_C.field_k * this.direction.x + (float)this.field_C.field_K * this.direction.y))) {
              var18++;
            }
            if (MusicPatchPcmStream.field_r.a(this.field_q, (int)(-(this.direction.x * (float)this.field_C.field_K) + ((float)this.position.x - (float)this.field_C.field_k * this.direction.y)), -3, (int)((float)this.position.y + (float)this.field_C.field_k * this.direction.x - (float)this.field_C.field_K * this.direction.y))) {
              var19++;
            }
            if (MusicPatchPcmStream.field_r.a(this.field_q, (int)(-(this.direction.x * (float)this.field_C.field_K) + ((float)this.position.x + (float)this.field_C.field_k * this.direction.y)), -3, (int)(-((float)this.field_C.field_K * this.direction.y) + ((float)this.position.y - (float)this.field_C.field_k * this.direction.x)))) {
              var19++;
            }
            if (0 != MusicPatchPcmStream.field_r.field_r) {
              if (1 != MusicPatchPcmStream.field_r.field_r) {
                if (MusicPatchPcmStream.field_r.field_r == 2) {
                  var16Lifetime1 = var16Lifetime1 * MatchingTextValidator.field_k[var18];
                  var17 = var17 * MatchingTextValidator.field_k[var19];
                  if (var32 != 0) {
                    var16Lifetime1 = var16Lifetime1 * DisplayNameForm.field_J[var18];
                    var17 = var17 * DisplayNameForm.field_J[var19];
                    if (var32 != 0) {
                      var17 = var17 * qg.field_c[var19];
                      var16Lifetime1 = var16Lifetime1 * qg.field_c[var18];
                    }
                  }
                }
              } else {
                var16Lifetime1 = var16Lifetime1 * DisplayNameForm.field_J[var18];
                var17 = var17 * DisplayNameForm.field_J[var19];
                if (var32 != 0) {
                  var17 = var17 * qg.field_c[var19];
                  var16Lifetime1 = var16Lifetime1 * qg.field_c[var18];
                }
              }
            } else {
              var17 = var17 * qg.field_c[var19];
              var16Lifetime1 = var16Lifetime1 * qg.field_c[var18];
            }
          }
          this.field_ec = Math.abs(var7) / var16Lifetime1;
          if (1.0f < this.field_ec) {
            var7 = var16Lifetime1 * DualLinkNode.signumFloat(-29407, var7);
          }
          if (var9 == 0) {
            stackIn_89_0 = var8 * var8;
          } else {
            stackIn_89_0 = 0.0f;
          }
          var20 = (float)Math.sqrt((double)(stackIn_89_0 + var10 * var10 + var13 * var13));
          this.field_wb = var20 / var17;
          if (1.0f < this.field_wb) {
            var21 = var17 / var20;
            var13 = var13 * var21;
            var10 = var10 * var21;
            var8 = var8 * var21;
          }
          if (Math.abs(var10) < var11) {
            var10 = var11 * DualLinkNode.signumFloat(-29407, var10);
          }
          var21Lifetime1 = (float)Math.cos((double)this.field_P) * this.field_C.field_j * var7 - this.field_C.field_C * var8;
          this.field_wc = -var21Lifetime1 / this.field_C.field_a;
          var22 = this.field_C.field_J * (this.field_jc * this.field_jc) * DualLinkNode.signumFloat(-29407, this.field_jc);
          var23 = 9.8100004196167f * DualLinkNode.signumFloat(-29407, this.field_jc) * this.field_C.field_l * this.field_C.field_n;
          var24 = var13 + (var23 + var22);
          var25 = var15 + var10;
          var26 = var14 + (var8 + (float)Math.cos((double)this.field_P) * var7);
          var27 = var26 / this.field_C.field_l;
          this.field_Gb = var25 / this.field_C.field_l;
          if (this.field_J == 1) {
            var28 = -5.0f * DualLinkNode.signumFloat(-29407, this.field_P);
            var27 = var27 + var28;
            var29_float = var28 * this.field_C.field_l;
            var30_float = (3.0f * this.field_C.field_j - this.field_C.field_C) / 4.0f;
            this.field_wc = this.field_wc + var30_float * var29_float / this.field_C.field_a;
          }
          if (this.field_jb) {
            if (0.0f < this.angularVelocity) {
              this.angularVelocity = 5.0f;
              if (var32 != 0) {
                this.angularVelocity = -5.0f;
              }
            } else {
              this.angularVelocity = -5.0f;
            }
            if (this.field_M != -1) {
              fieldTemp$0 = this.field_M - 1;
              this.field_M = this.field_M - 1;
              if (fieldTemp$0 <= 0) {
                this.field_jb = false;
              }
            }
            this.field_wc = 0.0f;
          }
          var28Lifetime1 = -var24 / this.field_C.field_l;
          var29 = 0;
          if (DualLinkNode.signumFloat(-29407, var28Lifetime1) != DualLinkNode.signumFloat(-29407, this.field_jc) &&
            Math.abs(var28Lifetime1 * 0.019999999552965164f) > Math.abs(this.field_jc)) {
            var29 = 1;
          }
          this.field_Gb = this.field_Gb + var28Lifetime1;
          if (Float.isNaN(this.field_Gb)) {
            throw new RuntimeException((String) null);
          }
          var30 = param0 ? 1 : 0;
          if (DualLinkNode.signumFloat(-29407, this.angularVelocity) != DualLinkNode.signumFloat(-29407, this.field_wc) &&
            Math.abs(this.angularVelocity) < Math.abs(this.field_wc * 0.019999999552965164f)) {
            var30 = 1;
          }
          this.angularVelocity = this.angularVelocity + 0.019999999552965164f * this.field_wc;
          if (this.field_V &&
            !this.field_jb) {
            var31 = -this.heading + this.field_H;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if ((double)var31 > 3.141592653589793) {
                var31 = (float)((double)var31 - 6.283185307179586);
                decompiledFrameRemainder0 = (var32 == 0);
                if ((decompiledFrameRemainder0) &&
                  (var32 == 0)) {
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                while (-3.141592653589793 > (double)var31) {
                  var31 = (float)((double)var31 + 6.283185307179586);
                  if (var32 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (var32 == 0) {
                    continue;
                  }
                  break;
                }
                if (decompiledFrameCompleted0) {
                  this.heading = this.heading + 5.0f * var31 * 0.019999999552965164f;
                }
              }
              if (Math.abs(var31) < 0.5f &&
                Math.abs(this.field_wc) < 5.0f) {
                this.field_V = false;
              }
              fieldTemp$1 = this.field_T - 1;
              this.field_T = this.field_T - 1;
              if (0 < fieldTemp$1) {
                break;
              }
              this.field_V = false;
              break;
            }
          }
          this.velocityY = this.velocityY + 0.019999999552965164f * (this.field_Gb * this.direction.y + this.direction.x * var27);
          this.velocityX = this.velocityX + 0.019999999552965164f * (this.direction.x * this.field_Gb - this.direction.y * var27);
          if (var29 != 0) {
            this.velocityX = 0.0f;
            this.velocityY = 0.0f;
            this.field_Gb = 0.0f;
          }
          if (0.0f == this.velocityX &&
            this.velocityY == 0.0f &&
            var30 != 0) {
            this.angularVelocity = 0.0f;
            this.field_wc = 0.0f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.I(" + param0 + ')');
        }
    }

    final void a(byte param0, MovingEntity param1) {
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 54) {
            this.b(false);
          }
          if (0.0f > this.field_jc) {
            return;
          }
          if (null != param1 &&
            100.0f < param1.velocityY * param1.velocityY + param1.velocityX * param1.velocityX) {
            return;
          }
          if (this.field_pc > 10) {
            this.field_Hb = 0;
          }
          this.field_pc = 0;
          if (50 < this.field_Hb) {
            stackIn_22_1 = !(this.field_Ab);
            this.field_Ab = stackIn_22_1;
            this.field_qb = 100;
            this.f(3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("ja.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, PathWaypoint param2) {
        int stackIn_11_0 = 0;
        int stackIn_29_0 = 0;
        float stackIn_31_0 = 0.0f;
        boolean stackIn_48_1 = false;
        GrowableObjectList stackIn_53_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        float var5 = 0.0f;
        Vector2f var6 = null;
        GrowableObjectList var6_ref = null;
        PathWaypoint[] var7 = null;
        int var8_int = 0;
        PathWaypoint[] var8 = null;
        PathWaypoint[] var9_ref_eb__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        var11 = HoldTheLine.field_D;
        try {
          this.field_yc[1] = 30;
          this.field_yc[3] = -20;
          this.field_yc[0] = 30;
          this.field_yc[2] = 30;
          this.field_yc[this.field_hb] = this.field_yc[this.field_hb] + 30;
          var4_int = -1;
          var5_int = 2;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5_int < 0))) {
            stackIn_11_0 = ~this.field_hc[var5_int];
            if (var11 == 0) {
              if (stackIn_11_0 != 0) {
                var4_int = var5_int;
              }
              var5_int--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_11_0 = var4_int;
          }
          if (stackIn_11_0 != -1) {
            this.field_yc[var4_int] = this.field_yc[var4_int] + 30;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (this.field_hc[1] == this.field_hc[0]) {
            var5_intLifetime1 = 0;
            while (var5_intLifetime1 < 3) {
              stackIn_29_0 = ~var5_intLifetime1;
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_29_0 != ~this.field_hc[1]) {
                this.field_yc[var5_intLifetime1] = this.field_yc[var5_intLifetime1] - 20;
              }
              var5_intLifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            if (null == param2) {
              stackIn_31_0 = this.field_bb;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_29_0 = MusicPatchPcmStream.field_r.roadSegments.length;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_31_0 = hi.a(stackIn_29_0, this.field_bb, 1, MusicPatchPcmStream.field_r.roadSegments, -24659, param2, param2.field_l);
          }
          var5 = stackIn_31_0;
          if (-1.0f == var5) {
            return;
          }
          if ((MusicPatchPcmStream.field_r.field_J == 2 ||
            MusicPatchPcmStream.field_r.field_J == 6) &&
            this.field_G == 0) {
            var6 = this.field_zb.directionAt((byte) 121, (float)(-(int)this.field_bb) + this.field_bb);
            stackIn_48_1 = !(!(0.0 > (double)this.direction.dot(var6, (byte) -10)));
            this.field_ib = stackIn_48_1;
          }
          if (this.field_ib) {
            stackIn_53_0 = this.a(50.0f, false, 5.0f * (float)param1, var5);
          } else {
            stackIn_53_0 = this.a(50.0f, var5, (float)param1 * 5.0f, 62);
          }
          var6_ref = stackIn_53_0;
          this.field_sb = new GrowableObjectList();
          this.a(param2, (byte) 39, this.field_sb, var6_ref);
          this.field_gb = this.a(89, (PathWaypoint[]) (this.field_sb.elements[0]), this.field_yc);
          this.field_cc = this.field_gb;
          this.field_Nb = new int[this.field_sb.size];
          var7 = (PathWaypoint[]) (this.field_sb.elements[0]);
          if (param0 != 41) {
            this.field_D = -0.24020713567733765f;
          }
          this.field_Nb[0] = this.field_gb;
          var8_int = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8_int < this.field_sb.size)))) {
            var9_ref_eb__ = (PathWaypoint[]) (this.field_sb.elements[var8_int]);
            var10 = this.a(param0 + 51, var9_ref_eb__, this.field_yc);
            stackIn_68_0 = ~var10;
            stackIn_68_1 = ~this.field_cc;
            if (var11 == 0) {
              if (stackIn_68_0 > stackIn_68_1) {
                this.field_cc = var10;
              }
              if (var10 > this.field_gb) {
                var7 = var9_ref_eb__;
                this.field_gb = var10;
              }
              this.field_Nb[var8_int] = var10;
              var8_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_68_0 = var7.length;
            stackIn_68_1 = this.field_G;
          }
          var8 = new PathWaypoint[stackIn_68_0 + stackIn_68_1];
          var9 = 0;
          do {
            if (var9 >= this.field_G) {
              var9 = 0;
              break;
            }
            var8[var9] = this.field_sc[var9];
            var9++;
          } while (var11 == 0);
          while (var9 < var7.length) {
            var8[var9 + this.field_G] = var7[var9];
            var9++;
            if (var11 != 0) {
              return;
            }
          }
          this.field_sc = var8;
          this.field_G = this.field_G + var7.length;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_87_0 = var4;
          stackIn_87_1 = new StringBuilder().append("ja.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    private final void a(float param0, Vector2f param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var25 = HoldTheLine.field_D;
        try {
          var6_int = MusicPatchPcmStream.field_r.d((byte) 47) ? 1 : 0;
          var7 = param2 + (int)(param0 * param1.x);
          var8 = (int)(param1.y * param0) + param4;
          stackIn_5_0 = (var6_int != 0) ? 100 : 50;
          var9 = stackIn_5_0;
          qg.a(3, this.field_q, var7, 255, 16777215, MusicPatchPcmStream.field_r.field_O, 5, -204, var8, 0, (byte) 124);
          var10 = (int)(param0 / (float)var9);
          var11 = (int)(256.0f * param1.x);
          var12 = -120 % ((-44 - param3) / 57);
          var13 = (int)(param1.y * 256.0f);
          var14 = 512;
          var15 = 512;
          var16 = 0;
          while (var10 > var16) {
            var17 = Math.random() * (double)param0;
            var19 = param2 + (int)(var17 * (double)param1.x);
            var20 = param4 + (int)((double)param1.y * var17);
            if (var25 != 0) {
              return;
            }
            if (var6_int == 0) {
              qg.a(0, this.field_q, var19, 255, 16776960, MusicPatchPcmStream.field_r.field_O, 5, -204, var20, 0, (byte) -127);
            } else {
              var21 = SolidRoadStripRenderer.b(2, 128);
              var22 = (-var21 + 256) * (16711935 & this.field_Eb) & -16711936 | 16711680 & (-var21 + 256) * (this.field_Eb & 65280);
              var22 = var22 + (16711680 & 65280 * var21 | -16711936 & var21 * 16711935);
              var23 = var11 + dg.a(-var14, -1, var14);
              var24 = dg.a(-var15, -1, var15) + var13;
              ArchiveIndex.a(var23, var20, -512, 16, 1, -4, var19, this.field_q, MusicPatchPcmStream.field_r.field_q, var22 >>> 8, var24, 255, 4);
            }
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("ja.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, GrowableObjectList param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        PathWaypoint[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param0 <= 0) {
            return;
          }
          var4_int = param1.size;
          var5 = 0;
          while (var4_int > var5) {
            var6 = (PathWaypoint[]) (param1.elements[var5]);
            this.a(var6, param1, 0);
            var5++;
            if (var7 != 0) {
              return;
            }
          }
          if (~var4_int == ~param1.size) {
            return;
          }
          this.a(param0 - 1, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("ja.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          if (this.field_rc == 0) {
            throw new RuntimeException();
          }
          this.d((byte) 99);
          var2_int = MusicPatchPcmStream.field_r.field_h;
          scanLoop1: while (true) {
            if (var2_int < MusicPatchPcmStream.field_r.field_z) {
              if (var3 != 0) {
                break scanLoop1;
              }
              if (this == MusicPatchPcmStream.field_r.vehicles[var2_int]) {
                MusicPatchPcmStream.field_r.vehicles[var2_int] = null;
              } else {
                var2_int++;
                continue;
              }
            }
            if (!param0) {
              return;
            }
            break;
          }
          this.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.O(" + param0 + ')');
        }
    }

    private final int a(int param0, PathWaypoint[] param1, int[] param2) {
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_52_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IntrusiveDeque var6 = null;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_48_0Lifetime1;
        int stackIn_48_1Lifetime1;
        int var8Lifetime1;
        var15 = HoldTheLine.field_D;
        try {
          var4_int = 0;
          var5 = param1.length;
          var6 = MusicPatchPcmStream.field_r.field_cb;
          var7 = (wm) (var6.first((byte) 103));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var7 == null))) {
            stackIn_47_0 = 0;
            if (var15 == 0) {
              if (stackIn_47_0 == (8 & var7.field_J)) {
                var7 = (wm) (var6.next((byte) 100));
                continue;
              }
              var8 = 5 + var7.field_B + this.field_C.field_k;
              var9 = var8 * var8;
              var10 = 0;
              while (var5 > var10) {
                var11 = -param1[var10].x + var7.position.x;
                var12 = -param1[var10].y + var7.position.y;
                var13 = var11 * var11 + var12 * var12;
                stackIn_48_0 = ~var13;
                stackIn_48_1 = ~var9;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_48_0 > stackIn_48_1) {
                  if ((var7.field_J & 1024) == 0 ||
                    ~(var7.field_J & 3) == ~this.field_mc) {
                    if ((512 & var7.field_J) == 0) {
                      if ((262144 & var7.field_J) != 0) {
                        var14 = 3 & var7.field_J;
                        if (var14 != 0) {
                          if (var14 == 1) {
                            var4_int -= 200;
                          }
                        } else {
                          var4_int += 100;
                        }
                      } else {
                        var4_int -= 100;
                      }
                    } else {
                      var4_int = var4_int + param2[3 & var7.field_J];
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var4_int -= 250;
                  }
                }
                var10++;
              }
              var7 = (wm) (var6.next((byte) 90));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_47_0 = 0;
          }
          var8Lifetime1 = stackIn_47_0;
          stackIn_48_0Lifetime1 = param0;
          stackIn_48_1Lifetime1 = 88;
          if (stackIn_48_0Lifetime1 <= stackIn_48_1Lifetime1) {
            this.k(-50);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8Lifetime1 >= param1.length))) {
            stackOut_52_0 = MusicPatchPcmStream.field_r.a(param1[var8Lifetime1].field_l, param1[var8Lifetime1].y, true, param1[var8Lifetime1].x);
            stackIn_66_0 = stackOut_52_0 ? 1 : 0;
            stackIn_53_0 = stackOut_52_0;
            if (var15 == 0) {
              if (stackIn_53_0) {
                if (!MusicPatchPcmStream.field_r.a(param1[var8Lifetime1].field_l, param1[var8Lifetime1].x, -3, param1[var8Lifetime1].y)) {
                  var4_int -= 5;
                }
              } else {
                var4_int -= 1000;
              }
              var8Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_66_0 = var4_int;
          }
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("ja.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param0 > -104) {
            return;
          }
          if (3 == MusicPatchPcmStream.field_r.field_r) {
            return;
          }
          if (!MusicPatchPcmStream.field_r.a(this.field_q, param2, -3, param1) &&
            MusicPatchPcmStream.field_r.a(this.field_q, param1, true, param2)) {
            var4_int = 0;
            while (50 > var4_int) {
              var5 = (int)(1024.0f * (-this.velocityX * 0.019999999552965164f));
              var6 = (int)(1024.0f * (-this.velocityY * 0.019999999552965164f));
              var7 = this.field_jc * (-0.5f + (float)Math.random());
              var8 = 6.0f * this.field_jc * (-0.5f + (float)Math.random());
              var6 = var6 - (int)(1024.0f * ((this.direction.y * var8 - this.direction.x * var7) * 0.019999999552965164f));
              var5 = var5 + (int)(1024.0f * ((this.direction.y * var7 + var8 * this.direction.x) * 0.019999999552965164f));
              if (var10 != 0) {
                return;
              }
              if (MusicPatchPcmStream.field_r.field_r == 0) {
                var9 = 256 * (SolidRoadStripRenderer.b(2, 192) + 64);
              } else if (MusicPatchPcmStream.field_r.field_r != 1) {
                var9 = (128 | SolidRoadStripRenderer.b(2, 128)) * 65793;
              } else {
                var9 = 12888928;
                var9 = var9 + 65792 * SolidRoadStripRenderer.b(2, 32);
              }
              ArchiveIndex.a(var5, param1, 0, 16, 1, -16, param2, this.field_q, MusicPatchPcmStream.field_r.field_O, var9, var6, 128, 0);
              var4_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "ja.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void j(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          if (this.field_O <= param0) {
            if (0 == this.field_C.field_G) {
              this.a(false);
              if (var3 == 0) {
                return;
              }
            }
            if (this.field_C.field_G == 1) {
              this.c(true);
              if (var3 == 0) {
                return;
              }
            }
            if (this.field_C.field_G == 2) {
              this.m(2301);
              if (var3 == 0) {
                return;
              }
            }
            throw new RuntimeException((String) null);
          }
          this.k(-1675);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.R(" + param0 + ')');
        }
    }

    RaceVehicle(int param0, int param1, int param2, float param3, float param4, RoadSegment param5, VehicleDefinition param6, int param7) {
        super((float)param0, (float)param1, param2, param3);
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        this.field_yc = new int[]{0, 0, 0, -20};
        try {
          this.a(20385, param6);
          this.field_Ib = param4;
          this.field_vb = param4;
          this.field_E = param4;
          this.field_D = param3;
          this.field_Mb = param0;
          this.field_zb = param5;
          this.field_K = param5;
          this.field_mb = param1;
          this.field_ic = 0.0f;
          this.field_Gb = 0.0f;
          this.velocityY = 0.0f;
          this.field_Cb = false;
          this.field_V = false;
          this.velocityX = 0.0f;
          this.field_xc = 0.0f;
          this.field_wc = 0.0f;
          this.field_mc = -1;
          this.angularVelocity = 0.0f;
          this.field_W = (int[][]) null;
          this.field_rc = param7;
          this.field_P = 0.0f;
          this.field_q = this.field_zb.field_k;
          this.field_uc = this.field_zb.field_k;
          this.field_O = 0;
          this.field_tb = 0;
          this.field_L = 0;
          this.field_T = 0;
          this.field_Zb = new Point2i(param0, param1);
          this.field_Fb = new int[4];
          this.field_F = false;
          this.field_db = 0;
          this.field_hc = new int[3];
          this.field_Ub = 0;
          var9_int = 0;
          do {
            if (var9_int >= 3) {
              var9_int = 0;
              break;
            }
            this.field_hc[var9_int] = -1;
            var9_int++;
          } while (var10 == 0);
          while (var9_int < 4) {
            this.field_Fb[var9_int] = 0;
            var9_int++;
            if (var10 != 0) {
              return;
            }
          }
          this.field_Yb = 0;
          this.field_qb = 0;
          this.field_pc = 0;
          this.field_bc = 0;
          this.field_Ob = -(int)(this.direction.y * (float)this.field_C.field_K + this.direction.x * (float)this.field_C.field_k) + this.position.y;
          this.field_Bb = null;
          this.field_Lb = 0;
          this.field_Xb = this.position.x - (int)(-((float)this.field_C.field_k * this.direction.y) + this.direction.x * (float)this.field_C.field_K);
          this.field_sc = new PathWaypoint[32];
          this.field_xb = 0;
          this.field_Sb = 0;
          this.field_Tb = this.position.y - (int)(-(this.direction.x * (float)this.field_C.field_k) + (float)this.field_C.field_K * this.direction.y);
          this.field_nb = this.position.x - (int)(this.direction.x * (float)this.field_C.field_K + this.direction.y * (float)this.field_C.field_k);
          this.field_G = 0;
          this.field_Hb = 0;
          this.field_cb = -1000;
          this.field_hb = 0;
          this.field_Ab = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("ja.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(')').toString());
        }
    }

    private final GrowableObjectList a(float param0, boolean param1, float param2, float param3) {
        int stackIn_16_0 = 0;
        GrowableObjectList stackIn_18_0 = null;
        GrowableObjectList stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        RoadSegment[] var5 = null;
        RuntimeException var5_ref = null;
        GrowableObjectList var6 = null;
        int var7 = 0;
        float var8 = 0.0f;
        RoadSegment var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        RoadSegment var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        var17 = HoldTheLine.field_D;
        try {
          var5 = MusicPatchPcmStream.field_r.roadSegments;
          var6 = new GrowableObjectList();
          var7 = (int)param3;
          var8 = (float)(-var7) + param3;
          if (~var7 == ~var5.length) {
            var7 = 0;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var9 = var5[var7];
          var10 = var9.length(50);
          var11 = param0 / var10;
          if (0.0f < var8 - var11) {
            var8 = var8 - var11;
            decompiledFrameRemainder0 = (var17 != 0);
          }
          if (decompiledFrameRemainder0) {
            param0 = param0 + (1.0f - var8) * var10;
            while (var10 <= param0) {
              param0 = param0 - var10;
              var7--;
              stackIn_16_0 = var7;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_16_0 < 0) {
                var7 = -1 + var5.length;
              }
              var9 = var5[var7];
              var10 = var9.length(50);
            }
            if (decompiledFrameCompleted0) {
              var8 = 1.0f - param0 / var10;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_qc = var7;
            stackIn_16_0 = param1 ? 1 : 0;
          }
          if (stackIn_16_0 != 0) {
            stackIn_18_0 = (GrowableObjectList) null;
            return stackIn_18_0;
          }
          var12 = param2 / var10;
          boolean decompiledSharedTail0 = !(!(0.0f < var8 - var12));
          if (!decompiledSharedTail0) {
            param2 = param2 - var10 * var8;
            var6.add(hk.a(ao.a(var8, true, var9, 0.0f), 1, false), (byte) 6);
            var13 = (-1 + (var7 + var5.length)) % var5.length;
            var14 = var5[var13];
            var15 = var14.length(50);
            while (true) {
              if (var15 <= param2) {
                param2 = param2 - var15;
                var6.add(hk.a(var14, 1, false), (byte) 6);
                if (var17 == 0) {
                  var13--;
                  if (var13 < 0) {
                    var13 = var5.length - 1;
                  }
                  var14 = var5[var13];
                  var15 = var14.length(50);
                  continue;
                }
              } else {
                this.field_kc = var13;
              }
              break;
            }
            var16 = 1.0f - param2 / var15;
            var6.add(hk.a(ao.a(1.0f, true, var14, var16), 1, false), (byte) 6);
            decompiledSharedTail0 = (var17 != 0);
          }
          if (decompiledSharedTail0) {
            this.field_kc = var7;
            var6.add(hk.a(ao.a(var8, true, var9, -var12 + var8), 1, false), (byte) 6);
          }
          stackIn_33_0 = var6;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var5_ref), "ja.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final float a(byte param0) {
        float stackIn_21_0 = 0.0f;
        float stackIn_22_0 = 0.0f;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        float stackIn_39_0 = 0.0f;
        float stackIn_40_0 = 0.0f;
        float stackIn_43_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        int var4 = 0;
        int var2_intLifetime1;
        float var3Lifetime1;
        float var3Lifetime2;
        float var3Lifetime1Lifetime1;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 != 19) {
            this.field_yb = (wm) null;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_R == 0) {
            var2_int = 0;
            while (!(var2_int >= MusicPatchPcmStream.field_r.field_h)) {
              stackIn_25_0 = -2;
              stackIn_25_1 = ~MusicPatchPcmStream.field_r.vehicles[var2_int].field_R;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_25_0 != stackIn_25_1) {
                var2_int++;
                continue;
              }
              var3 = pj.a(MusicPatchPcmStream.field_r.roadSegments, (byte) -105, MusicPatchPcmStream.field_r.vehicles[var2_int].field_vb, this.field_vb);
              var3 = (-50.0f + var3) / 200.0f;
              if (!(0.0f > var3)) {
                stackIn_21_0 = (!(1.0f < var3)) ? var3 : 1.0f;
              } else {
                stackIn_21_0 = 0.0f;
              }
              var3Lifetime2 = stackIn_21_0;
              stackIn_22_0 = 1.0f - 0.30000001192092896f * var3Lifetime2;
              return stackIn_22_0;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_25_0 = ~(-1 + MusicPatchPcmStream.field_r.field_h);
            stackIn_25_1 = ~this.field_R;
          }
          if (stackIn_25_0 == stackIn_25_1) {
            var2_intLifetime1 = 0;
            while (!(var2_intLifetime1 >= MusicPatchPcmStream.field_r.field_h)) {
              if (MusicPatchPcmStream.field_r.vehicles[var2_intLifetime1].field_R != 2) {
                var2_intLifetime1++;
                if (var4 == 0) {
                  continue;
                }
                break;
              }
              var3Lifetime1 = pj.a(MusicPatchPcmStream.field_r.roadSegments, (byte) -105, this.field_vb, MusicPatchPcmStream.field_r.vehicles[var2_intLifetime1].field_vb);
              var3Lifetime1 = (var3Lifetime1 - 50.0f) / 200.0f;
              if (!(0.0f > var3Lifetime1)) {
                stackIn_39_0 = (var3Lifetime1 > 1.0f) ? 1.0f : var3Lifetime1;
              } else {
                stackIn_39_0 = 0.0f;
              }
              var3Lifetime1Lifetime1 = stackIn_39_0;
              stackIn_40_0 = 1.0f + 0.2999999523162842f * var3Lifetime1Lifetime1;
              return stackIn_40_0;
            }
          }
          stackIn_43_0 = 1.0f;
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.J(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float stackIn_72_0 = 0.0f;
        float stackIn_73_1 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        Vector2f var21_ref_in = null;
        float var21 = 0.0f;
        int var22 = 0;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        int var34 = 0;
        float var20Lifetime1;
        float var30Lifetime1;
        float var31Lifetime1;
        float var31Lifetime2;
        float var32Lifetime1;
        float var33Lifetime1;
        var34 = HoldTheLine.field_D;
        try {
          this.field_jc = this.direction.x * this.velocityX + this.direction.y * this.velocityY;
          this.field_Y = this.velocityX * this.direction.y - this.direction.x * this.velocityY;
          var2_float = this.field_jc * (this.field_C.field_m * this.field_jc);
          var3 = this.field_jc;
          var4 = this.field_Y + this.field_C.field_j * this.angularVelocity;
          var5 = this.field_jc;
          var6 = this.field_Y - this.field_C.field_C * this.angularVelocity;
          var7 = (-(this.field_C.field_M * this.field_Gb) + this.field_C.field_C * 9.8100004196167f) * (this.field_C.field_l / this.field_C.field_g) + var2_float;
          var8 = (this.field_C.field_j * 9.8100004196167f + this.field_C.field_M * this.field_Gb) * (this.field_C.field_l / this.field_C.field_g) + var2_float;
          var9 = (float)Math.atan2((double)var4, (double)Math.abs(var3)) - this.field_P * DualLinkNode.signumFloat(param0 - 31708, this.field_jc);
          var10 = (float)Math.atan2((double)var6, (double)Math.abs(var5));
          if (Math.abs(var9) > this.field_C.field_F) {
            var9 = DualLinkNode.signumFloat(param0 ^ -31268, var9) * this.field_C.field_F;
          }
          if (Math.abs(var10) > this.field_C.field_F) {
            var10 = DualLinkNode.signumFloat(-29407, var10) * this.field_C.field_F;
          }
          var11 = var9 * this.field_C.field_y * var7;
          var12 = this.field_C.field_y * var10 * var8;
          var13 = 0;
          if (this.field_C.field_o &&
            this.field_P != 0.0f &&
            DualLinkNode.signumFloat(-29407, this.field_P) != DualLinkNode.signumFloat(-29407, this.angularVelocity)) {
            var13 = 1;
            this.angularVelocity = this.angularVelocity * 0.800000011920929f;
            if (DualLinkNode.signumFloat(param0 - 31708, this.field_P) != DualLinkNode.signumFloat(-29407, this.field_wc)) {
              this.field_wc = this.field_wc * 0.6000000238418579f;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var14 = this.field_C.field_p * (this.field_C.field_s * this.field_ic) / this.field_C.field_E;
          if (1 == this.field_J) {
            var14 = var14 * (1.0f + 3.0f * this.field_C.field_r);
            decompiledFrameRemainder0 = (var34 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (2 == this.field_J) {
              var14 = var14 * (1.0f + 1.0f * this.field_C.field_r);
              decompiledFrameRemainder0 = (var34 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_Fb[1] < 2) {
                if (1 == this.field_Fb[1]) {
                  var14 = var14 * (1.0f + 0.30000001192092896f * this.field_C.field_r);
                  if (var34 != 0) {
                    var14 = var14 * (1.0f + this.field_C.field_r * 0.800000011920929f);
                  }
                }
              } else {
                var14 = var14 * (1.0f + this.field_C.field_r * 0.800000011920929f);
              }
            }
          }
          if (MusicPatchPcmStream.field_r.field_J == 0 ||
            MusicPatchPcmStream.field_r.field_J == 3) {
            var14 = var14 * this.a((byte) 19);
          }
          if (this.field_Cb) {
            var14 = var14 * 3.0f;
          }
          var15 = this.field_C.field_e * this.a((byte) 125, oi.field_c);
          var16 = this.field_C.field_w * this.a((byte) 101, oi.field_c);
          var17 = var8 * (this.field_xc * this.field_C.field_I) * DualLinkNode.signumFloat(-29407, this.field_jc);
          var18 = 0.0f;
          var19 = 0.0f;
          if (0.0f != this.field_zb.field_o) {
            var20 = 9.8100004196167f * -this.field_C.field_l * this.field_zb.field_o * 60.0f;
            var21_ref_in = this.field_zb.directionAt((byte) 123, this.field_vb - (float)(int)this.field_vb);
            var19 = var21_ref_in.dot(this.direction, (byte) -10) * var20;
            var18 = var21_ref_in.cross(this.direction, true) * var20;
            if (this.field_ic != 0.0f &&
              DualLinkNode.signumFloat(-29407, var19) != DualLinkNode.signumFloat(-29407, var14)) {
              var19 = 0.0f;
              var18 = 0.0f;
            }
          }
          var20Lifetime1 = var7 * var16;
          var21 = var15 * var8;
          var22 = 0;
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.direction.x + ((float)this.position.x - (float)this.field_C.field_k * this.direction.y)), -3, (int)(this.direction.y * (float)this.field_C.field_K + ((float)this.field_C.field_k * this.direction.x + (float)this.position.y)))) {
            var22++;
          }
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.field_C.field_K * this.direction.x + ((float)this.field_C.field_k * this.direction.y + (float)this.position.x)), param0 ^ -2304, (int)(this.direction.y * (float)this.field_C.field_K + ((float)this.position.y - (float)this.field_C.field_k * this.direction.x)))) {
            var22++;
          }
          if (MusicPatchPcmStream.field_r.field_r != 0) {
            if (1 != MusicPatchPcmStream.field_r.field_r) {
              if (2 == MusicPatchPcmStream.field_r.field_r) {
                var20Lifetime1 = var20Lifetime1 * MatchingTextValidator.field_k[var22];
                if (var34 != 0) {
                  var20Lifetime1 = var20Lifetime1 * DisplayNameForm.field_J[var22];
                  if (var34 != 0) {
                    var20Lifetime1 = var20Lifetime1 * qg.field_c[var22];
                  }
                }
              }
            } else {
              var20Lifetime1 = var20Lifetime1 * DisplayNameForm.field_J[var22];
              if (var34 != 0) {
                var20Lifetime1 = var20Lifetime1 * qg.field_c[var22];
              }
            }
          } else {
            var20Lifetime1 = var20Lifetime1 * qg.field_c[var22];
          }
          this.field_ec = Math.abs(var11) / var20Lifetime1;
          if (1.0f < this.field_ec) {
            var11 = var20Lifetime1 * DualLinkNode.signumFloat(param0 - 31708, var11);
          }
          stackIn_72_0 = var12 * var12;
          if (var13 != 0) {
            stackIn_73_1 = 0.0f;
          } else {
            stackIn_73_1 = var14 * var14;
          }
          var23 = (float)Math.sqrt((double)(stackIn_72_0 + stackIn_73_1));
          this.field_wb = Math.abs(var23) / var21;
          if (this.field_wb > 1.0f) {
            var12 = var12 / this.field_wb;
            if (1 != this.field_J) {
              var14 = var14 / this.field_wb;
            }
          }
          var24 = (float)Math.cos((double)this.field_P) * this.field_C.field_j * var11 - var12 * this.field_C.field_C;
          this.field_wc = -var24 / this.field_C.field_a;
          var25 = this.field_C.field_J * (this.field_jc * this.field_jc) * DualLinkNode.signumFloat(param0 ^ -31268, this.field_jc);
          var26 = DualLinkNode.signumFloat(-29407, this.field_jc) * 9.8100004196167f * this.field_C.field_l * this.field_C.field_n;
          var27 = var17 + (var26 + var25);
          var28 = -var27 + (var19 + var14);
          var29 = var12 + (float)Math.cos((double)this.field_P) * var11 + var18;
          this.field_Gb = var28 / this.field_C.field_l;
          var30 = -var29 / this.field_C.field_l;
          if (1 == this.field_J) {
            var31 = -5.0f * DualLinkNode.signumFloat(-29407, this.field_P);
            var30 = var30 + var31;
            var32 = var31 * this.field_C.field_l;
            var33 = (3.0f * this.field_C.field_j - this.field_C.field_C) / 4.0f;
            this.field_wc = this.field_wc + var33 * var32 / this.field_C.field_a;
          }
          if (this.field_jb) {
            if (-1 != this.field_M) {
              fieldTemp$0 = this.field_M - 1;
              this.field_M = this.field_M - 1;
              if (fieldTemp$0 <= 0) {
                this.field_jb = false;
              }
            }
            if (!(0.0f < this.angularVelocity)) {
              this.angularVelocity = -5.0f;
              if (var34 != 0) {
                this.angularVelocity = 5.0f;
              }
            } else {
              this.angularVelocity = 5.0f;
            }
            this.field_wc = 0.0f;
          }
          if (Float.isNaN(this.field_Gb)) {
            throw new RuntimeException((String) null);
          }
          if (this.field_V &&
            !this.field_jb) {
            var31Lifetime1 = this.field_H - this.heading;
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted0 = true;
              if (3.141592653589793 < (double)var31Lifetime1) {
                var31Lifetime1 = (float)((double)var31Lifetime1 - 6.283185307179586);
                decompiledFrameRemainder1 = (var34 == 0);
                if ((decompiledFrameRemainder1) &&
                  (var34 == 0)) {
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                while (-3.141592653589793 > (double)var31Lifetime1) {
                  var31Lifetime1 = (float)((double)var31Lifetime1 + 6.283185307179586);
                  if (var34 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (var34 == 0) {
                    continue;
                  }
                  break;
                }
                if (decompiledFrameCompleted0) {
                  this.heading = this.heading + var31Lifetime1 * 5.0f * 0.019999999552965164f;
                }
              }
              if (0.5f > Math.abs(var31Lifetime1) &&
                5.0f > Math.abs(this.field_wc)) {
                this.field_V = false;
              }
              fieldTemp$1 = this.field_T - 1;
              this.field_T = this.field_T - 1;
              if (fieldTemp$1 > 0) {
                break;
              }
              this.field_V = false;
              break;
            }
          }
          if (param0 != 2301) {
            RaceVehicle.clearSharedReferences(-82);
          }
          var31Lifetime2 = this.field_jc + 0.019999999552965164f * this.field_Gb;
          var32Lifetime1 = this.field_Y + var30 * 0.019999999552965164f;
          var33Lifetime1 = this.angularVelocity + this.field_wc * 0.019999999552965164f;
          if (0.0f != this.field_jc &&
            DualLinkNode.signumFloat(-29407, var31Lifetime2) != DualLinkNode.signumFloat(-29407, this.field_jc)) {
            this.field_jc = 0.0f;
            this.field_Gb = 0.0f;
            if (var34 != 0) {
              this.field_jc = var31Lifetime2;
            }
          } else {
            this.field_jc = var31Lifetime2;
          }
          if (0.0f != this.field_Y &&
            DualLinkNode.signumFloat(-29407, var32Lifetime1) != DualLinkNode.signumFloat(param0 ^ -31268, this.field_Y)) {
            var30Lifetime1 = 0.0f;
            this.field_Y = 0.0f;
            if (var34 != 0) {
              this.field_Y = var32Lifetime1;
            }
          } else {
            this.field_Y = var32Lifetime1;
          }
          if (0.0f == this.angularVelocity ||
            DualLinkNode.signumFloat(-29407, var33Lifetime1) == DualLinkNode.signumFloat(-29407, this.angularVelocity)) {
            this.angularVelocity = var33Lifetime1;
            if (var34 != 0) {
              this.angularVelocity = 0.0f;
              this.field_wc = 0.0f;
            }
          } else {
            this.angularVelocity = 0.0f;
            this.field_wc = 0.0f;
          }
          this.velocityY = this.field_jc * this.direction.y - this.field_Y * this.direction.x;
          this.velocityX = this.field_jc * this.direction.x + this.field_Y * this.direction.y;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.L(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6) {
        float stackIn_4_0 = 0.0f;
        float stackIn_8_1 = 0.0f;
        float stackIn_22_1 = 0.0f;
        float stackIn_26_2 = 0.0f;
        float stackIn_33_1 = 0.0f;
        float stackIn_37_2 = 0.0f;
        float stackIn_50_1 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var8_float = 0.0f;
        RuntimeException var8 = null;
        float var9 = 0.0f;
        try {
          var8_float = Math.abs(this.field_jc);
          if (var8_float >= this.field_C.field_B) {
            stackIn_4_0 = this.field_C.field_f;
          } else {
            stackIn_4_0 = (-var8_float + this.field_C.field_B) / this.field_C.field_B * (-this.field_C.field_f + this.field_C.field_x) + this.field_C.field_f;
          }
          var9 = stackIn_4_0;
          if (!param6) {
            stackIn_8_1 = 0.0f;
          } else {
            stackIn_8_1 = 1.0f;
          }
          this.field_xc = stackIn_8_1;
          if (param3 <= 108) {
            this.a(true, true, false, -21, true, false, true);
          }
          this.field_nc = param2;
          boolean decompiledSharedTail0 = (this.field_Q == 0);
          if (!decompiledSharedTail0) {
            this.field_P = this.field_C.field_x * (float)(50 - this.field_Q) / 50.0f;
            if (this.field_P > var9) {
              this.field_P = var9;
            }
            if (param5) {
              stackIn_22_1 = -1.0f;
            } else {
              stackIn_22_1 = 0.0f;
            }
            if (param0) {
              stackIn_26_2 = 1.0f;
            } else {
              stackIn_26_2 = 0.0f;
            }
            this.field_P = (stackIn_22_1 + stackIn_26_2) * this.field_P;
            decompiledSharedTail0 = (HoldTheLine.field_D != 0);
          }
          if (decompiledSharedTail0) {
            if (param0) {
              stackIn_33_1 = 1.0f;
            } else {
              stackIn_33_1 = 0.0f;
            }
            if (param5) {
              stackIn_37_2 = -1.0f;
            } else {
              stackIn_37_2 = 0.0f;
            }
            this.field_P = (stackIn_33_1 + stackIn_37_2) * var9;
          }
          if (param6) {
            stackIn_50_1 = 0.0f;
          } else {
            if (param1) {
              stackIn_50_1 = 1.0f;
            } else {
              if (param4) {
                stackIn_50_1 = -1.0f;
              } else {
                stackIn_50_1 = 0.0f;
              }
            }
          }
          this.field_ic = stackIn_50_1;
          if (!param2 &&
            null != this.field_W) {
            this.field_F = false;
          }
          if ((0 == MusicPatchPcmStream.field_r.field_J ||
            MusicPatchPcmStream.field_r.field_J == 3) &&
            (MusicPatchPcmStream.field_r.field_B != -1 &&
            !MusicPatchPcmStream.field_r.field_T &&
            this.field_bc > MusicPatchPcmStream.field_r.field_B)) {
            this.field_nc = false;
            this.field_ic = 0.0f;
          }
          if (this.field_jb) {
            this.field_P = 0.0f;
          }
          if (1 == this.field_J) {
            this.field_ic = 1.0f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var8), "ja.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -1) {
            field_Wb = (LoginMethodPreference) null;
          }
          field_Db = null;
          field_Wb = null;
          field_Qb = null;
          field_U = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "ja.Q(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 3) {
            this.f((byte) -76);
          }
          this.field_G = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.LA(" + param0 + ')');
        }
    }

    private final void a(byte param0, PathWaypoint[] param1, boolean param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        float stackIn_65_0 = 0.0f;
        float stackIn_69_0 = 0.0f;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        RaceVehicle[] var5 = null;
        RuntimeException var5_ref = null;
        Point2i var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RaceVehicle var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        float var13 = 0.0f;
        int var14_int = 0;
        float var14 = 0.0f;
        int var15_int = 0;
        float var15 = 0.0f;
        int var16_int = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        int stackIn_37_0Lifetime1;
        int stackIn_37_1Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          if (param3 <= 1) {
            return;
          }
          if (param0 < 79) {
            return;
          }
          var5 = MusicPatchPcmStream.field_r.vehicles;
          var6 = new Point2i(0, 0);
          var7 = 1;
          var8 = 0;
          scanLoop1: while (true) {
            stackIn_7_0 = 5;
            stackIn_7_1 = var8;
            while (true) {
              if (stackIn_7_0 > stackIn_7_1) {
                if (var22 != 0) {
                  return;
                }
                var9 = 0;
                while (true) {
                  boolean decompiledFrameCompleted1 = true;
                  boolean decompiledFrameCompleted0 = true;
                  if (var9 < MusicPatchPcmStream.field_r.field_z) {
                    stackIn_7_0 = ~this.field_mc;
                    stackIn_7_1 = ~var9;
                    if (stackIn_7_0 != stackIn_7_1) {
                      var10 = var5[var9];
                      if ((var10 != null ||
                        var22 != 0) && (-var10.field_q + this.field_q <= 1 &&
                        -var10.field_q + this.field_q >= -1)) {
                        var11 = 0;
                        var12 = -1;
                        var13_int = 0;
                        while (true) {
                          if (param3 > var13_int) {
                            var14_int = -param1[var13_int].x + (int)var10.worldX;
                            var15_int = (int)var10.worldY - param1[var13_int].y;
                            var16_int = var14_int * var14_int + var15_int * var15_int;
                            stackIn_37_0 = ~var11;
                            stackIn_37_1 = ~var16_int;
                            if (stackIn_37_0 < stackIn_37_1 ||
                              var12 == -1) {
                              var11 = var16_int;
                              var12 = var13_int;
                            }
                            var13_int++;
                            continue;
                          }
                          stackIn_37_0Lifetime1 = var10.field_C.field_K + this.field_C.field_k;
                          stackIn_37_1Lifetime1 = 5;
                          var13 = (float)(stackIn_37_0Lifetime1 + stackIn_37_1Lifetime1);
                          var14 = (float)(5 + this.field_C.field_k + var10.field_C.field_k);
                          var15 = (float)(-param1[var12].x) + var10.worldX;
                          var16 = var10.worldY - (float)param1[var12].y;
                          var17 = var10.direction.x * var15 + var16 * var10.direction.y;
                          var18 = -(var10.direction.x * var16) + var15 * var10.direction.y;
                          if (param2 ||
                            !(var17 > -var13) ||
                            !(var13 > var17) ||
                            !(-var14 < var18) ||
                            !(var14 > var18)) {
                            if (!param2) {
                              break;
                            }
                            if (8100 <= var11) {
                              break;
                            }
                            var6.x = var10.position.x;
                            var6.y = var10.position.y;
                            var7 = 0;
                            this.a(var6, var12, param1, -1);
                            decompiledFrameCompleted1 = false;
                            break;
                          }
                          if (var12 != 0) {
                            stackIn_65_0 = (float)(param1[var12].x - param1[-1 + var12].x);
                          } else {
                            stackIn_65_0 = (float)(param1[1].x - param1[0].x);
                          }
                          var19 = stackIn_65_0;
                          if (var12 == 0) {
                            stackIn_69_0 = (float)(-param1[0].y + param1[1].y);
                          } else {
                            stackIn_69_0 = (float)(-param1[var12 - 1].y + param1[var12].y);
                          }
                          var20 = stackIn_69_0;
                          var21 = (float)Math.sqrt((double)(var20 * var20 + var19 * var19));
                          var20 = var20 / var21;
                          var19 = var19 / var21;
                          if (var20 * var15 - var19 * var16 < 0.0f) {
                            var6.x = (int)(var20 * (var14 + 10.0f - 5.0f) + var10.worldX);
                            var6.y = (int)(-((var14 + 10.0f - 5.0f) * var19) + var10.worldY);
                          } else {
                            var6.x = (int)(-(var20 * (var14 + 10.0f - 5.0f)) + var10.worldX);
                            var6.y = (int)((-5.0f + (var14 + 10.0f)) * var19 + var10.worldY);
                          }
                          var7 = 0;
                          this.a(var6, var12, param1, -1);
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted1) &&
                      (decompiledFrameCompleted0)) {
                      var9++;
                      continue;
                    }
                  }
                  if (var7 != 0 &&
                    var22 == 0) {
                    break;
                  }
                  var8++;
                  continue scanLoop1;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_90_0 = var5_ref;
          stackIn_90_1 = new StringBuilder().append("ja.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final float a(byte param0, float[] param1) {
        RuntimeException var3 = null;
        float stackIn_5_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_10_0 = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 96) {
            this.a((byte) -121, (PathWaypoint[]) null, false, -122);
          }
          if (this.field_J == 2) {
            stackIn_5_0 = param1[3];
            return stackIn_5_0;
          }
          if (3 == this.field_Fb[2]) {
            stackIn_10_0 = param1[2];
            return stackIn_10_0;
          }
          stackIn_8_0 = param1[this.field_Fb[2]];
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ja.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_340_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RaceWorld var2 = null;
        RuntimeException var2_ref = null;
        float var3 = 0.0f;
        RaceWorld var4_ref_sg = null;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        RaceVehicle var6_ref_ja = null;
        int var6_int = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        RaceVehicle var7_ref_ja = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        RaceWorld var4_ref_sgLifetime1;
        RaceVehicle var6_ref_jaLifetime1;
        RaceWorld var4_ref_sgLifetime2;
        RaceWorld var4_ref_sgLifetime3;
        RaceWorld var4_ref_sgLifetime4;
        RaceVehicle var6_ref_jaLifetime2;
        int stackIn_323_0Lifetime1;
        int stackIn_323_1Lifetime1;
        int var4_intLifetime1;
        float var4Lifetime1;
        int var5_intLifetime1;
        float var5Lifetime1;
        float var6Lifetime1;
        float var7Lifetime1;
        float var8Lifetime1;
        float var9Lifetime1;
        float var10Lifetime1;
        int var4_intLifetime2;
        int var5_intLifetime2;
        var12 = HoldTheLine.field_D;
        try {
          var2 = MusicPatchPcmStream.field_r;
          var3 = hi.a(4, this.field_Ib, 1, var2.roadSegments, -24659, this.position, this.field_q);
          if (-1.0f == var3) {
            var3 = hi.a(var2.roadSegments.length, this.field_Ib, 0, var2.roadSegments, -24659, this.position, this.field_q);
          }
          if (param0 < 14) {
            this.j(88);
          }
          if (var3 != -1.0f) {
            if (-1.0f == this.field_vb) {
              this.f(3);
            }
            this.field_vb = var3;
            if (this.field_vb == (float)var2.roadSegments.length) {
              this.field_zb = var2.roadSegments[0];
              if (var12 != 0) {
                this.field_zb = var2.roadSegments[(int)this.field_vb];
              }
            } else {
              this.field_zb = var2.roadSegments[(int)this.field_vb];
            }
            this.field_q = this.field_zb.field_k;
            if (this.field_Ib == -1.0f) {
              this.field_Ib = this.field_vb;
              this.field_Lb = 0;
            }
            if (this.field_vb > this.field_Ib &&
              this.field_vb - this.field_Ib < 2.0f) {
              this.field_Ib = this.field_vb;
              this.field_bb = this.field_vb;
              this.field_Lb = 0;
              this.field_xb = 0;
            }
            if (this.field_bb < this.field_vb &&
              this.field_vb - this.field_bb < 2.0f) {
              this.field_bb = this.field_vb;
              this.field_xb = 0;
            }
            if (2.0f > -this.field_Ib + (this.field_vb + (float)var2.roadSegments.length)) {
              if (this.field_bc == 1 ||
                this.field_X < this.field_ab) {
                this.field_ab = this.field_X;
                if (this.field_W != null &&
                  !var2.field_E && (var2.field_J == 0 ||
                  1 == var2.field_J)) {
                  MouseWheelInput.a(this.field_ab, StrongCacheEntry.field_w, (byte) 62, LoginForm.field_P);
                }
              }
              this.field_bc = this.field_bc + 1;
              if (0 == var2.field_J) {
                if (var2.field_B < this.field_bc) {
                  this.field_Pb = var2.field_ab;
                }
                if (this.field_mc == 0) {
                  var4_ref_sg = var2;
                  if (0 == (var4_ref_sg.field_H & 1048576)) {
                    var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_l * var4_ref_sg.field_p << 20);
                    if (var12 != 0) {
                      var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 20);
                    }
                  } else {
                    var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 20);
                  }
                  var4_ref_sg.field_H = var4_ref_sg.field_H ^ 1048576;
                  if ((var4_ref_sg.field_H & 1048576) == 1048576) {
                    if ((var4_ref_sg.field_H & 4) != 0) {
                      var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 2);
                      if (var12 != 0) {
                        var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << 2);
                      }
                    } else {
                      var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << 2);
                    }
                    var4_ref_sg.field_H = var4_ref_sg.field_H ^ 4;
                    if ((4 & var4_ref_sg.field_H) == 4) {
                      if ((var4_ref_sg.field_H & 1073741824) == 0) {
                        var4_ref_sg.field_N = var4_ref_sg.field_N - (var4_ref_sg.field_p * var4_ref_sg.field_l << 30);
                        if (var12 != 0) {
                          var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 30);
                        }
                      } else {
                        var4_ref_sg.field_N = var4_ref_sg.field_N + (var4_ref_sg.field_l * var4_ref_sg.field_p << 30);
                      }
                      var4_ref_sg.field_H = var4_ref_sg.field_H ^ 1073741824;
                    }
                  }
                }
                if (1 == this.field_mc) {
                  var4_ref_sgLifetime2 = var2;
                  if ((var4_ref_sgLifetime2.field_H & 65536) != 0) {
                    var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N + (var4_ref_sgLifetime2.field_p * var4_ref_sgLifetime2.field_l << 16);
                    if (var12 != 0) {
                      var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N - (var4_ref_sgLifetime2.field_p * var4_ref_sgLifetime2.field_l << 16);
                    }
                  } else {
                    var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N - (var4_ref_sgLifetime2.field_p * var4_ref_sgLifetime2.field_l << 16);
                  }
                  var4_ref_sgLifetime2.field_H = var4_ref_sgLifetime2.field_H ^ 65536;
                  if ((65536 & var4_ref_sgLifetime2.field_H) == 65536) {
                    if ((128 & var4_ref_sgLifetime2.field_H) == 0) {
                      var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N - (var4_ref_sgLifetime2.field_l * var4_ref_sgLifetime2.field_p << 7);
                      if (var12 != 0) {
                        var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N + (var4_ref_sgLifetime2.field_p * var4_ref_sgLifetime2.field_l << 7);
                      }
                    } else {
                      var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N + (var4_ref_sgLifetime2.field_p * var4_ref_sgLifetime2.field_l << 7);
                    }
                    var4_ref_sgLifetime2.field_H = var4_ref_sgLifetime2.field_H ^ 128;
                    if (128 == (var4_ref_sgLifetime2.field_H & 128)) {
                      if ((4194304 & var4_ref_sgLifetime2.field_H) == 0) {
                        var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N - (var4_ref_sgLifetime2.field_l * var4_ref_sgLifetime2.field_p << 22);
                        if (var12 != 0) {
                          var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N + (var4_ref_sgLifetime2.field_l * var4_ref_sgLifetime2.field_p << 22);
                        }
                      } else {
                        var4_ref_sgLifetime2.field_N = var4_ref_sgLifetime2.field_N + (var4_ref_sgLifetime2.field_l * var4_ref_sgLifetime2.field_p << 22);
                      }
                      var4_ref_sgLifetime2.field_H = var4_ref_sgLifetime2.field_H ^ 4194304;
                    }
                  }
                }
                if (this.field_mc == 2) {
                  var4_ref_sgLifetime3 = var2;
                  if ((var4_ref_sgLifetime3.field_H & 32768) == 0) {
                    var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N - (var4_ref_sgLifetime3.field_l * var4_ref_sgLifetime3.field_p << 15);
                    if (var12 != 0) {
                      var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N + (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 15);
                    }
                  } else {
                    var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N + (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 15);
                  }
                  var4_ref_sgLifetime3.field_H = var4_ref_sgLifetime3.field_H ^ 32768;
                  if ((var4_ref_sgLifetime3.field_H & 32768) == 32768) {
                    if ((8388608 & var4_ref_sgLifetime3.field_H) != 0) {
                      var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N + (var4_ref_sgLifetime3.field_l * var4_ref_sgLifetime3.field_p << 23);
                      if (var12 != 0) {
                        var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N - (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 23);
                      }
                    } else {
                      var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N - (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 23);
                    }
                    var4_ref_sgLifetime3.field_H = var4_ref_sgLifetime3.field_H ^ 8388608;
                    if ((8388608 & var4_ref_sgLifetime3.field_H) == 0) {
                      if ((1024 & var4_ref_sgLifetime3.field_H) == 0) {
                        var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N - (var4_ref_sgLifetime3.field_l * var4_ref_sgLifetime3.field_p << 10);
                        if (var12 != 0) {
                          var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N + (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 10);
                        }
                      } else {
                        var4_ref_sgLifetime3.field_N = var4_ref_sgLifetime3.field_N + (var4_ref_sgLifetime3.field_p * var4_ref_sgLifetime3.field_l << 10);
                      }
                      var4_ref_sgLifetime3.field_H = var4_ref_sgLifetime3.field_H ^ 1024;
                    }
                  }
                }
                if (3 == this.field_mc) {
                  var4_ref_sgLifetime4 = var2;
                  if ((-2147483648 & var4_ref_sgLifetime4.field_H) == 0) {
                    var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N - (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 31);
                    if (var12 != 0) {
                      var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N + (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 31);
                    }
                  } else {
                    var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N + (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 31);
                  }
                  var4_ref_sgLifetime4.field_H = var4_ref_sgLifetime4.field_H ^ -2147483648;
                  if ((-2147483648 & var4_ref_sgLifetime4.field_H) == 0) {
                    if ((var4_ref_sgLifetime4.field_H & 262144) != 0) {
                      var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N + (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 18);
                      if (var12 != 0) {
                        var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N - (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 18);
                      }
                    } else {
                      var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N - (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 18);
                    }
                    var4_ref_sgLifetime4.field_H = var4_ref_sgLifetime4.field_H ^ 262144;
                    if (0 == (262144 & var4_ref_sgLifetime4.field_H)) {
                      if (0 != (var4_ref_sgLifetime4.field_H & 4096)) {
                        var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N + (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 12);
                        if (var12 != 0) {
                          var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N - (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 12);
                        }
                      } else {
                        var4_ref_sgLifetime4.field_N = var4_ref_sgLifetime4.field_N - (var4_ref_sgLifetime4.field_l * var4_ref_sgLifetime4.field_p << 12);
                      }
                      var4_ref_sgLifetime4.field_H = var4_ref_sgLifetime4.field_H ^ 4096;
                    }
                  }
                }
                if (this.field_W != null &&
                  !var2.field_E) {
                  if (0 != var2.field_r) {
                    dupTemp$0 = var2.field_rb[6] + 1;
                    var2.field_rb[6] = dupTemp$0;
                    if (dupTemp$0 >= 3) {
                      var2.a(6, 249, (byte) -47);
                    }
                    dupTemp$1 = var2.field_rb[7] + 1;
                    var2.field_rb[7] = dupTemp$1;
                    if (dupTemp$1 >= 3) {
                      var2.a(7, 248, (byte) -72);
                    }
                  }
                  if (~var2.field_B == ~this.field_bc &&
                    this.field_R == var2.field_h - 1) {
                    var2.field_rb[12] = 1;
                  }
                }
              }
              this.field_Lb = 0;
              this.field_xb = 0;
              this.field_X = 0;
              this.field_Ib = this.field_vb;
              this.field_bb = this.field_vb;
            }
          }
          if (this.field_vb + (float)var2.roadSegments.length - this.field_bb < 2.0f) {
            this.field_xb = 0;
            this.field_bb = this.field_vb;
          }
          this.field_xb = this.field_xb + 1;
          if (null == MusicPatchPcmStream.field_r.field_i) {
            if (!(this.field_xb < 200)) {
              this.field_xb = 0;
              this.field_bb = this.field_vb;
              if ((var12 != 0) &&
                (this.field_xb >= 50)) {
                this.f(3);
              }
            }
          } else {
            if (this.field_xb >= 50) {
              this.f(3);
            }
          }
          regionExit1: {
            boolean decompiledFrameCompleted0 = true;
            regionExit2: {
              boolean decompiledFrameRemainder0 = true;
              this.field_Lb = this.field_Lb + 1;
              if (var2.field_J != 0) {
                if ((var2.field_J != 2) &&
                  (decompiledFrameRemainder0 = (var2.field_J == 3)) &&
                  (decompiledFrameRemainder0 = (var2.field_B == -1 ||
                  !(var2.field_B < this.field_bc)))) {
                  var4_int = 0;
                  var5_int = 0;
                  while (true) {
                    if (var5_int < var2.field_h) {
                      var6_ref_ja = var2.vehicles[var5_int];
                      stackIn_246_0 = ~this.field_bc;
                      stackIn_246_1 = ~var6_ref_ja.field_bc;
                      if (var12 == 0) {
                        if (stackIn_246_0 > stackIn_246_1 ||
                          this.field_bc == var6_ref_ja.field_bc &&
                          this.field_Ib < var6_ref_ja.field_Ib) {
                          var4_int++;
                        }
                        var5_int++;
                        continue;
                      }
                    } else {
                      stackIn_246_0 = ~this.field_R;
                      stackIn_246_1 = ~var4_int;
                    }
                    break;
                  }
                  if (stackIn_246_0 != stackIn_246_1) {
                    this.field_ob = 0;
                  }
                  this.field_R = var4_int;
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var4_intLifetime2 = 0;
                  var5_intLifetime2 = 0;
                  while (true) {
                    if (var5_intLifetime2 < var2.field_h) {
                      var6_ref_jaLifetime2 = var2.vehicles[var5_intLifetime2];
                      stackIn_259_0 = this.field_Sb;
                      stackIn_259_1 = var6_ref_jaLifetime2.field_Sb;
                      if (var12 == 0) {
                        if (stackIn_259_0 < stackIn_259_1) {
                          var4_intLifetime2++;
                        }
                        var5_intLifetime2++;
                        continue;
                      }
                    } else {
                      stackIn_259_0 = ~this.field_R;
                      stackIn_259_1 = ~var4_intLifetime2;
                    }
                    break;
                  }
                  if (stackIn_259_0 != stackIn_259_1) {
                    this.field_ob = 0;
                  }
                  this.field_R = var4_intLifetime2;
                  decompiledFrameRemainder0 = (var12 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var2.field_B >= this.field_bc)) {
                var4_intLifetime1 = 0;
                var5_intLifetime1 = 0;
                while (true) {
                  if (var2.field_h > var5_intLifetime1) {
                    var6_ref_jaLifetime1 = var2.vehicles[var5_intLifetime1];
                    stackIn_282_0 = var6_ref_jaLifetime1.field_bc;
                    stackIn_282_1 = this.field_bc;
                    if (var12 == 0) {
                      if (stackIn_282_0 > stackIn_282_1 ||
                        ~this.field_bc == ~var6_ref_jaLifetime1.field_bc &&
                        var6_ref_jaLifetime1.field_Ib > this.field_Ib) {
                        var4_intLifetime1++;
                      }
                      var5_intLifetime1++;
                      continue;
                    }
                  } else {
                    stackIn_282_0 = this.field_R;
                    stackIn_282_1 = var4_intLifetime1;
                  }
                  if (stackIn_282_0 != stackIn_282_1) {
                    this.field_ob = 0;
                  }
                  this.field_R = var4_intLifetime1;
                  if (var2.field_E) {
                    break;
                  }
                  if (var2.field_rb[14] == -1) {
                    break;
                  }
                  if (this.field_mc != 0) {
                    break;
                  }
                  var5_intLifetime1 = 1;
                  var6_int = 0;
                  while (var2.field_h > var6_int) {
                    stackIn_323_0 = var6_int;
                    stackIn_323_1 = this.field_mc;
                    if (var12 != 0) {
                      if (stackIn_323_0 <= stackIn_323_1) {
                        break regionExit2;
                      }
                      var4 = (float)(-this.field_sc[0].x + this.field_sc[1].x);
                      var5 = (float)(-this.field_sc[0].y + this.field_sc[1].y);
                      var6 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
                      var5 = var5 / var6;
                      var4 = var4 / var6;
                      var7 = -this.worldX + (float)this.field_sc[0].x;
                      var8 = (float)this.field_sc[0].y - this.worldY;
                      var9 = var5 * var8 + var7 * var4;
                      var10 = var7 * var5 - var8 * var4;
                      stackIn_340_0 = compareFloatsNaNLow(var9, 0.0f);
                      break regionExit1;
                    }
                    if (stackIn_323_0 != stackIn_323_1) {
                      var7_ref_ja = var2.vehicles[var6_int];
                      if (var7_ref_ja.field_Ib > this.field_Ib &&
                        ~(2 + var7_ref_ja.field_bc) == ~this.field_bc ||
                        !(this.field_bc >= (2 + var7_ref_ja.field_bc))) {
                        var5_intLifetime1 = 0;
                      }
                    }
                    var6_int++;
                    if (var12 == 0) {
                      continue;
                    }
                    break;
                  }
                  if (var5_intLifetime1 == 0) {
                    break;
                  }
                  var2.a(14, 241, (byte) 114);
                  var2.field_rb[14] = -1;
                  break;
                }
              }
              if (this.field_W != null &&
                !MusicPatchPcmStream.field_r.a(this.field_q, false, this.position)) {
                var2.field_rb[7] = -1;
                var4_ref_sgLifetime1 = var2;
                if ((16384 & var4_ref_sgLifetime1.field_H) == 16384) {
                  var4_ref_sgLifetime1.field_H = var4_ref_sgLifetime1.field_H ^ 16384;
                  var4_ref_sgLifetime1.field_N = var4_ref_sgLifetime1.field_N + (var4_ref_sgLifetime1.field_p * var4_ref_sgLifetime1.field_l << 14);
                }
              }
              while (true) {
                stackIn_323_0Lifetime1 = -2;
                stackIn_323_1Lifetime1 = ~this.field_G;
                if (stackIn_323_0Lifetime1 <= stackIn_323_1Lifetime1) {
                  break;
                }
                var4Lifetime1 = (float)(-this.field_sc[0].x + this.field_sc[1].x);
                var5Lifetime1 = (float)(-this.field_sc[0].y + this.field_sc[1].y);
                var6Lifetime1 = (float)Math.sqrt((double)(var4Lifetime1 * var4Lifetime1 + var5Lifetime1 * var5Lifetime1));
                var5Lifetime1 = var5Lifetime1 / var6Lifetime1;
                var4Lifetime1 = var4Lifetime1 / var6Lifetime1;
                var7Lifetime1 = -this.worldX + (float)this.field_sc[0].x;
                var8Lifetime1 = (float)this.field_sc[0].y - this.worldY;
                var9Lifetime1 = var5Lifetime1 * var8Lifetime1 + var7Lifetime1 * var4Lifetime1;
                var10Lifetime1 = var7Lifetime1 * var5Lifetime1 - var8Lifetime1 * var4Lifetime1;
                stackIn_340_0 = compareFloatsNaNLow(var9Lifetime1, 0.0f);
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_340_0 > 0 &&
                  var9Lifetime1 > 2.0f * Math.abs(var10Lifetime1)) {
                  break;
                }
                var11 = 0;
                while ((this.field_G - 1) > var11) {
                  this.field_sc[var11] = this.field_sc[var11 + 1];
                  var11++;
                }
                this.field_G = this.field_G - 1;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_340_0 = 1;
            }
          }
          if (stackIn_340_0 == this.field_G) {
            this.f(3);
          }
          this.field_X = this.field_X + 1;
          this.field_ob = this.field_ob + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "ja.S(" + param0 + ')');
        }
    }

    private final float a(PathWaypoint[] param0, byte param1, float param2) {
        float stackIn_13_1 = 0.0f;
        float stackIn_19_0 = 0.0f;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        float var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        float var10Lifetime1;
        float var11Lifetime1;
        float var20Lifetime1;
        var25 = HoldTheLine.field_D;
        try {
          var4_float = 3.4028234663852886e+38f;
          var5 = 0.0f;
          var6 = param0[0].x;
          var7 = param0[0].y;
          if (param1 >= -108) {
            field_Db = (Sprite[]) null;
          }
          var8 = param0[1].x;
          var9 = param0[1].y;
          var10 = (float)((var8 - var6) / 2);
          var11 = (float)((-var7 + var9) / 2);
          var12 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
          var13 = var10 / var12;
          var14 = var11 / var12;
          var5Lifetime1 = param2 * var12;
          var21 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var21 >= param0.length - 1))) {
            var22 = param0[1 + var21].x;
            var15 = (float)((var22 - var8) / 2);
            var23 = param0[1 + var21].y;
            var16 = (float)((-var9 + var23) / 2);
            var17 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16));
            var19 = var16 / var17;
            var18 = var15 / var17;
            var20 = Math.abs((var19 + var14) / (var13 - var18));
            stackIn_19_0 = var20;
            if (var25 == 0) {
              if (!(var17 > var12)) {
                stackIn_13_1 = var17;
              } else {
                stackIn_13_1 = var12;
              }
              var20Lifetime1 = stackIn_19_0 * stackIn_13_1;
              var24 = this.field_C.field_A * (float)Math.sqrt((double)var20Lifetime1) + var5Lifetime1;
              if (var4_float > var24) {
                var4_float = var24;
              }
              var6Lifetime1 = var8;
              var7Lifetime1 = var9;
              var5Lifetime1 = var5Lifetime1 + var17 * param2;
              var9 = var23;
              var13 = var18;
              var14 = var19;
              var11Lifetime1 = var16;
              var10Lifetime1 = var15;
              var8 = var22;
              var12 = var17;
              var21++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_19_0 = var4_float;
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ja.KA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void h(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var7_float = 0.0f;
        int var8 = 0;
        wm var8_ref_wm = null;
        float var8_float = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15 = 0;
        Sprite var16 = null;
        int var17 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_1 = 0;
        float stackIn_43_0 = 0.0f;
        float stackIn_44_1 = 0.0f;
        float stackIn_48_0 = 0.0f;
        int stackIn_51_0 = 0;
        float stackIn_51_1 = 0.0f;
        float stackIn_52_2 = 0.0f;
        int stackIn_55_0 = 0;
        float stackIn_55_1 = 0.0f;
        float stackIn_56_2 = 0.0f;
        int stackIn_70_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_125_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite var9_ref_hj = null;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        float var13Lifetime1;
        float var13Lifetime2;
        float var14Lifetime1;
        float var14Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        var17 = HoldTheLine.field_D;
        try {
          var2_int = MusicPatchPcmStream.field_r.field_r;
          if (this.field_ic > 0.0f) {
            if (this.field_Fb[1] == 1 &&
              MusicPatchPcmStream.field_r.field_ab % 2 == 0) {
              var3 = this.position.x - (int)((float)this.field_C.field_K * this.direction.x);
              var4 = this.position.y - (int)(this.direction.y * (float)this.field_C.field_K);
              ArchiveIndex.a((int)(-this.direction.x * 1024.0f), var4, 1, 32, 1, -16, var3, this.field_q, MusicPatchPcmStream.field_r.field_O, 0, (int)(-this.direction.y * 1024.0f), 128, 2);
            }
            if (this.field_Fb[1] >= 2 &&
              this.field_J != 1) {
              var3Lifetime3 = -(int)(this.direction.x * (float)this.field_C.field_K) + this.position.x;
              var4Lifetime4 = -(int)(this.direction.y * (float)this.field_C.field_K) + this.position.y;
              if (MusicPatchPcmStream.field_r.field_ab % 2 == 0) {
                ArchiveIndex.a((int)(-this.direction.x * 2048.0f), var4Lifetime4, 1, 32, 1, -8, var3Lifetime3, this.field_q, MusicPatchPcmStream.field_r.field_O, 12632256, (int)(2048.0f * -this.direction.y), 64, 4);
              }
              ArchiveIndex.a((int)(-this.direction.x * 1024.0f), var4Lifetime4, 0, 16, 1, -16, var3Lifetime3, this.field_q, MusicPatchPcmStream.field_r.field_O, 8388352, (int)(-this.direction.y * 1024.0f), 128, 2);
            }
            if (this.field_J == 1) {
              var3Lifetime4 = -(int)(this.direction.x * (float)this.field_C.field_K) + this.position.x;
              var4Lifetime5 = this.position.y - (int)(this.direction.y * (float)this.field_C.field_K);
              if (MusicPatchPcmStream.field_r.field_ab % 2 == 0) {
                ArchiveIndex.a((int)(-this.direction.x * 2048.0f), var4Lifetime5, 1, 64, 1, -2, var3Lifetime4, this.field_q, MusicPatchPcmStream.field_r.field_O, 12632256, (int)(2048.0f * -this.direction.y), 32, 8);
              }
              var5 = (int)(-this.direction.x * 1024.0f);
              var6 = (int)(1024.0f * -this.direction.y);
              var5 = var5 + (-256 + SolidRoadStripRenderer.b(2, 512));
              var6 = var6 + (-256 + SolidRoadStripRenderer.b(2, 512));
              var7 = (369164160 | SolidRoadStripRenderer.b(2, 128)) << 8;
              ArchiveIndex.a(var5, var4Lifetime5, 0, 16, 1, -16, var3Lifetime4, this.field_q, MusicPatchPcmStream.field_r.field_O, var7, var6, 128, 2);
            }
          }
          stackIn_33_0 = (this.field_J != 1) ? 0 : 1;
          if (this.field_P == 0.0f) {
            stackIn_37_1 = 0;
          } else {
            stackIn_37_1 = 1;
          }
          if ((stackIn_33_0 & stackIn_37_1) != 0) {
            stackIn_43_0 = this.direction.y * (float)this.field_C.field_K;
            if (this.field_P > 0.0f) {
              stackIn_44_1 = -1.0f;
            } else {
              stackIn_44_1 = 1.0f;
            }
            var3Lifetime1 = (int)(stackIn_43_0 * stackIn_44_1 + (float)this.field_C.field_K * this.direction.x * 0.5f) + this.position.x;
            stackIn_48_0 = (!(0.0f < this.field_P)) ? 1.0f : -1.0f;
            var4Lifetime1 = (int)(-(stackIn_48_0 * ((float)this.field_C.field_K * this.direction.x)) + (float)this.field_C.field_K * this.direction.y * 0.5f) + this.position.y;
            var5Lifetime1 = (int)(1024.0f * (3.5f * this.velocityX * 0.019999999552965164f));
            stackIn_51_0 = var5Lifetime1;
            stackIn_51_1 = 1024.0f;
            if (this.field_P > 0.0f) {
              stackIn_52_2 = -this.direction.y;
            } else {
              stackIn_52_2 = this.direction.y;
            }
            var5Lifetime1Lifetime1 = stackIn_51_0 + (int)(stackIn_51_1 * stackIn_52_2);
            var6Lifetime1 = (int)(1024.0f * (3.5f * this.velocityY * 0.019999999552965164f));
            stackIn_55_0 = var6Lifetime1;
            stackIn_55_1 = 1024.0f;
            if (!(this.field_P > 0.0f)) {
              stackIn_56_2 = -this.direction.x;
            } else {
              stackIn_56_2 = this.direction.x;
            }
            var6Lifetime1Lifetime1 = stackIn_55_0 + (int)(stackIn_55_1 * stackIn_56_2);
            var7 = 16744448 | SolidRoadStripRenderer.b(2, 128) << 8;
            ArchiveIndex.a(var5Lifetime1Lifetime1, var4Lifetime1, 0, 16, 1, -16, var3Lifetime1, this.field_q, MusicPatchPcmStream.field_r.field_O, var7, var6Lifetime1Lifetime1, 128, 2);
          }
          if (this.field_J == 2) {
            var3_float = 2.0f * (float)(Math.random() * 3.141592653589793);
            var4Lifetime2 = this.position.x + (int)(1.2999999523162842 * (Math.cos((double)var3_float) * (double)this.field_C.field_d));
            var5Lifetime2 = this.position.y - (int)(Math.sin((double)var3_float) * (double)this.field_C.field_d * 1.2999999523162842);
            var6Lifetime2 = (int)(0.75f * (this.velocityX * 0.019999999552965164f * 3.5f) * 1024.0f);
            var7 = (int)(0.75f * (0.019999999552965164f * this.velocityY * 3.5f) * 1024.0f);
            var8 = 255 | SolidRoadStripRenderer.b(2, 255) * 1052672;
            ArchiveIndex.a(var6Lifetime2, var5Lifetime2, 0, 25, 1, -40, var4Lifetime2, this.field_q, MusicPatchPcmStream.field_r.field_q, var8, var7, 255, 2);
          }
          boolean decompiledFrameCompleted1 = true;
          var3Lifetime2 = -(int)((float)this.field_C.field_k * this.direction.y + (float)this.field_C.field_K * this.direction.x) + this.position.x;
          var4Lifetime3 = this.position.y - (int)((float)this.field_C.field_K * this.direction.y - (float)this.field_C.field_k * this.direction.x);
          var5Lifetime3 = -(int)(this.direction.x * (float)this.field_C.field_K - (float)this.field_C.field_k * this.direction.y) + this.position.x;
          var6Lifetime3 = -(int)(this.direction.x * (float)this.field_C.field_k + (float)this.field_C.field_K * this.direction.y) + this.position.y;
          if (1.0f < this.field_wb) {
            if (var2_int == 1) {
              stackIn_70_0 = 1082097408;
            } else {
              stackIn_70_0 = (2 != var2_int) ? 1073873410 : 537002498;
            }
            var7 = stackIn_70_0;
            vb.a(-68, MusicPatchPcmStream.field_r.field_qb);
            SoftwareRasterizer.drawLineAlpha(this.field_nb, this.field_Tb, var3Lifetime2, var4Lifetime3, var7, var7 >>> 24);
            SoftwareRasterizer.drawLineAlpha(this.field_Xb, this.field_Ob, var5Lifetime3, var6Lifetime3, var7, var7 >>> 24);
            var8_ref_wm = (wm) (MusicPatchPcmStream.field_r.field_d.first((byte) 105));
            while (null != var8_ref_wm) {
              stackIn_85_0 = this.field_q;
              stackIn_85_1 = var8_ref_wm.field_q;
              if (var17 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_85_0 >= stackIn_85_1 &&
                (1048576 & var8_ref_wm.field_J) != 0) {
                var9_ref_hj = var8_ref_wm.field_H;
                var9_ref_hj.bindRaster();
                var10 = var8_ref_wm.position.x - (var9_ref_hj.width >> 1);
                var11 = var8_ref_wm.position.y - (var9_ref_hj.height >> 1);
                SoftwareRasterizer.drawLineAlpha(this.field_nb - var10, this.field_Tb - var11, -var10 + var3Lifetime2, -var11 + var4Lifetime3, var7, var7 >>> 24);
                SoftwareRasterizer.drawLineAlpha(this.field_Xb - var10, -var11 + this.field_Ob, var5Lifetime3 - var10, var6Lifetime3 - var11, var7, var7 >>> 24);
              }
              var8_ref_wm = (wm) (MusicPatchPcmStream.field_r.field_d.next((byte) -107));
            }
            if (decompiledFrameCompleted1) {
              MarkerSliderRenderer.restoreRasterTarget(-1);
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_85_0 = -1;
            stackIn_85_1 = ~this.field_Q;
          }
          if (stackIn_85_0 > stackIn_85_1) {
            vb.a(-100, MusicPatchPcmStream.field_r.field_qb);
            var7 = (this.field_Q << 8) / 50;
            SoftwareRasterizer.drawLineAlpha(this.field_nb, this.field_Tb, var3Lifetime2, var4Lifetime3, 0, var7);
            SoftwareRasterizer.drawLineAlpha(this.field_Xb, this.field_Ob, var5Lifetime3, var6Lifetime3, 0, var7);
            MarkerSliderRenderer.restoreRasterTarget(-1);
          }
          this.field_Xb = var5Lifetime3;
          this.field_Tb = var4Lifetime3;
          this.field_nb = var3Lifetime2;
          this.field_Ob = var6Lifetime3;
          if (3 != MusicPatchPcmStream.field_r.field_r) {
            var7 = this.position.x + (int)((float)this.field_C.field_K * this.direction.x - this.direction.y * (float)this.field_C.field_k);
            var8Lifetime1 = this.position.y + (int)((float)this.field_C.field_k * this.direction.x + (float)this.field_C.field_K * this.direction.y);
            var9 = this.position.x + (int)(this.direction.y * (float)this.field_C.field_k + this.direction.x * (float)this.field_C.field_K);
            var10Lifetime1 = (int)(-((float)this.field_C.field_k * this.direction.x) + (float)this.field_C.field_K * this.direction.y) + this.position.y;
            this.a((byte) -119, var8Lifetime1, var7);
            this.a((byte) -124, var10Lifetime1, var9);
            this.a((byte) -108, this.field_Tb, this.field_nb);
            this.a((byte) -119, this.field_Ob, this.field_Xb);
          }
          boolean decompiledFrameCompleted0 = true;
          if (MusicPatchPcmStream.field_r.field_r == 1) {
            var7_float = Math.abs(this.field_jc) / 50.0f;
            var8_float = var7_float / (1.0f + var7_float);
            var9Lifetime1 = (int)(this.worldX - DualLinkNode.signumFloat(-29407, this.field_jc) * this.direction.x * (float)this.field_C.field_K);
            var10Lifetime2 = (int)(this.worldY - DualLinkNode.signumFloat(-29407, this.field_jc) * this.direction.y * (float)this.field_C.field_K);
            while (Math.random() < (double)var8_float) {
              var11Lifetime1 = (int)(1024.0f * (0.019999999552965164f * -this.velocityX * 3.5f));
              var12 = (int)(1024.0f * (3.5f * (-this.velocityY * 0.019999999552965164f)));
              var13 = this.field_jc * ((float)Math.random() - 0.5f);
              var14 = this.field_jc * 6.0f * (-0.5f + (float)Math.random());
              var11Lifetime1 = var11Lifetime1 + (int)(0.019999999552965164f * (this.direction.x * var14 + this.direction.y * var13) * 1024.0f);
              var12 = var12 - (int)(1024.0f * ((-(var13 * this.direction.x) + var14 * this.direction.y) * 0.019999999552965164f));
              var15 = 14147112;
              stackIn_117_0 = 0;
              stackIn_117_1 = var9Lifetime1;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_117_0 <= stackIn_117_1 &&
                var9Lifetime1 < 640 &&
                var10Lifetime2 >= 0 &&
                var10Lifetime2 < 480) {
                var16 = IterableSecondaryNodeDeque.field_a.getSprite(8192);
                if (var16 != null) {
                  var15 = var16.pixels[640 * var10Lifetime2 + var9Lifetime1];
                }
              }
              ArchiveIndex.a(var11Lifetime1, var10Lifetime2, 512, 64, 1, 0, var9Lifetime1, this.field_q, MusicPatchPcmStream.field_r.field_O, var15, var12, 24, 20);
            }
          }
          if (decompiledFrameCompleted0) {
            if (this.field_Cb &&
              MusicPatchPcmStream.field_r.field_ab % 5 == 0) {
              var7 = -(int)((float)this.field_C.field_K * this.direction.x) + this.position.x;
              var8Lifetime2 = -(int)(this.direction.y * (float)this.field_C.field_K) + this.position.y;
              ArchiveIndex.a((int)(-this.direction.x * 1024.0f), var8Lifetime2, 1, 32, 1, -16, var7, this.field_q, MusicPatchPcmStream.field_r.field_O, 0, (int)(1024.0f * -this.direction.y), 128, 2);
            }
            stackIn_117_0 = ~this.field_rc;
            stackIn_117_1 = -3;
          }
          if (stackIn_117_0 != stackIn_117_1) {
            var8Lifetime3 = (-(int)this.field_lc + this.field_C.field_i) * 3 - SolidRoadStripRenderer.b(2, this.field_C.field_i);
            var7 = var8Lifetime3 / this.field_C.field_i;
          }
          if (stackIn_117_0 == stackIn_117_1 ||
            var17 != 0) {
            stackIn_125_0 = (SolidRoadStripRenderer.b(2, 18000) <= this.field_L) ? 0 : 2;
            var7 = stackIn_125_0;
          }
          if (2 == var7) {
            var8Lifetime4 = (int)(3.5f * this.velocityX * 0.019999999552965164f * 1024.0f);
            var9Lifetime2 = (int)(1024.0f * (0.019999999552965164f * (this.velocityY * 3.5f)));
            var8Lifetime4 = var8Lifetime4 + (SolidRoadStripRenderer.b(2, 512) - 256);
            var9Lifetime2 = var9Lifetime2 + (-1024 + SolidRoadStripRenderer.b(2, 512));
            var10Lifetime3 = 16711680 | SolidRoadStripRenderer.b(2, 256) << 8;
            var11Lifetime2 = this.position.x;
            var12Lifetime1 = this.position.y;
            var13Lifetime1 = this.field_C.field_c + ((float)Math.random() * 4.0f - 2.0f);
            var14Lifetime1 = this.field_C.field_H + ((float)Math.random() * 4.0f - 2.0f);
            var11Lifetime2 = var11Lifetime2 + (int)(this.direction.y * var14Lifetime1 + var13Lifetime1 * this.direction.x);
            var12Lifetime1 = var12Lifetime1 + (int)(this.direction.y * var13Lifetime1 - var14Lifetime1 * this.direction.x);
            ArchiveIndex.a(var8Lifetime4, var12Lifetime1, -1, 64, 1, -8, var11Lifetime2, this.field_q, MusicPatchPcmStream.field_r.field_q, var10Lifetime3, var9Lifetime2, 128, 1);
          }
          if ((2 != var7 ||
            var17 != 0) &&
            1 == var7) {
            var8Lifetime5 = (int)(3.5f * this.velocityX * 0.019999999552965164f * 1024.0f);
            var9Lifetime3 = (int)(1024.0f * (0.019999999552965164f * (3.5f * this.velocityY)));
            var8Lifetime5 = var8Lifetime5 + (SolidRoadStripRenderer.b(2, 512) - 256);
            var9Lifetime3 = var9Lifetime3 + (SolidRoadStripRenderer.b(2, 512) - 1024);
            var10Lifetime4 = 0;
            var11Lifetime3 = this.position.x;
            var12Lifetime2 = this.position.y;
            var13Lifetime2 = this.field_C.field_c + (-2.0f + 4.0f * (float)Math.random());
            var14Lifetime2 = this.field_C.field_H + ((float)Math.random() * 4.0f - 2.0f);
            var12Lifetime2 = var12Lifetime2 + (int)(this.direction.y * var13Lifetime2 - var14Lifetime2 * this.direction.x);
            var11Lifetime3 = var11Lifetime3 + (int)(this.direction.y * var14Lifetime2 + var13Lifetime2 * this.direction.x);
            ArchiveIndex.a(var8Lifetime5, var12Lifetime2, 1, 64, 1, -8, var11Lifetime3, this.field_q, MusicPatchPcmStream.field_r.field_O, var10Lifetime4, var9Lifetime3, 128, 2);
          }
          if (param0 < 43) {
            this.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ja.V(" + param0 + ')');
        }
    }

    final boolean c(int param0, int param1) {
        NamedSoundEffect stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        NamedSoundEffect var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          if (this.field_rc != 0) {
            return false;
          }
          if (this.field_Fb[0] != param0 &&
            this.field_Fb[1] != 3 &&
            this.field_Fb[2] != 3) {
            if (this.field_hc[2] == -1) {
              if (this.field_hc[1] != -1) {
                stackIn_21_0 = MouseWheelInput.field_d;
              } else {
                stackIn_21_0 = ij.field_g;
              }
            } else {
              stackIn_21_0 = null;
            }
            var3 = stackIn_21_0;
            if (var3 != null) {
              ValidationHelpWidget.a((byte) 20, (MovingEntity) (this), var3, var3.field_q);
            }
            var4 = this.field_Fb[0];
            if (this.field_hc[2] != -1) {
              this.d(1, -1065046232);
            }
            this.field_hc[2] = this.field_hc[1];
            this.field_hc[1] = this.field_hc[0];
            this.field_hc[0] = param1;
            this.field_Fb[param1] = this.field_Fb[param1] + 1;
            if (this.field_Fb[0] != var4 &&
              this.field_W != null) {
              this.field_F = true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3_ref), "ja.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        float stackIn_81_0 = 0.0f;
        float stackIn_85_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        Vector2f var11_ref_in = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33_float = 0.0f;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        float var4Lifetime1;
        float var10Lifetime1;
        float var31Lifetime1;
        float var32Lifetime1;
        var36 = HoldTheLine.field_D;
        try {
          this.field_Y = -(this.velocityY * this.direction.x) + this.direction.y * this.velocityX;
          this.field_jc = this.velocityX * this.direction.x + this.velocityY * this.direction.y;
          var2_float = this.field_C.field_l * 9.8100004196167f;
          var3 = 0;
          if (this.field_C.field_o &&
            0.0f != this.field_P &&
            DualLinkNode.signumFloat(-29407, this.field_P) != DualLinkNode.signumFloat(-29407, this.angularVelocity)) {
            this.angularVelocity = this.angularVelocity * 0.800000011920929f;
            var3 = 1;
            if (DualLinkNode.signumFloat(-29407, this.field_P) != DualLinkNode.signumFloat(-29407, this.field_wc)) {
              this.field_wc = this.field_wc * 0.6000000238418579f;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          var4 = this.field_C.field_s * this.field_C.field_p / this.field_C.field_E;
          var5 = var4 * 0.5f * this.field_ic;
          if (1 != this.field_J) {
            if (2 != this.field_J) {
              if (2 <= this.field_Fb[1]) {
                var4 = var4 * (0.800000011920929f * this.field_C.field_r + 1.0f);
                decompiledFrameRemainder2 = (var36 != 0);
              }
              if ((decompiledFrameRemainder2) &&
                (this.field_Fb[1] == 1)) {
                var4 = var4 * (1.0f + this.field_C.field_r * 0.30000001192092896f);
                if (var36 != 0) {
                  var4 = var4 * (this.field_C.field_r * 1.0f + 1.0f);
                  if (var36 != 0) {
                    var4 = var4 * (this.field_C.field_r * 3.0f + 1.0f);
                    var5 = var4;
                  }
                }
              }
            } else {
              var4 = var4 * (this.field_C.field_r * 1.0f + 1.0f);
              if (var36 != 0) {
                var4 = var4 * (this.field_C.field_r * 3.0f + 1.0f);
                var5 = var4;
              }
            }
          } else {
            var4 = var4 * (this.field_C.field_r * 3.0f + 1.0f);
            var5 = var4;
          }
          if (0 == MusicPatchPcmStream.field_r.field_J ||
            MusicPatchPcmStream.field_r.field_J == 3) {
            var4 = var4 * this.a((byte) 19);
          }
          if (this.field_Cb) {
            var4 = var4 * 3.0f;
          }
          var6 = this.field_C.field_w;
          var6 = var6 * this.a((byte) 127, oi.field_c);
          var7 = var2_float * (this.field_xc * this.field_C.field_I) * DualLinkNode.signumFloat(-29407, this.field_jc);
          var8 = 0.0f;
          var9 = 0.0f;
          if (this.field_zb.field_o != 0.0f) {
            var10 = 60.0f * (9.8100004196167f * -this.field_C.field_l * this.field_zb.field_o);
            var11_ref_in = this.field_zb.directionAt((byte) 125, this.field_vb - (float)(int)this.field_vb);
            var9 = var10 * var11_ref_in.dot(this.direction, (byte) -10);
            var8 = var10 * var11_ref_in.cross(this.direction, param0);
            if (this.field_ic != 0.0f &&
              DualLinkNode.signumFloat(-29407, var9) != DualLinkNode.signumFloat(-29407, var4)) {
              var9 = var9 * 0.30000001192092896f;
              var8 = var8 * 0.30000001192092896f;
            }
          }
          var10Lifetime1 = 0.5f * (var6 * var2_float);
          var11 = var6 * var2_float * 0.5f;
          var12 = this.field_C.field_n;
          var13 = 0;
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)(this.direction.x * (float)this.field_C.field_K + (-((float)this.field_C.field_k * this.direction.y) + (float)this.position.x)), -3, (int)((float)this.field_C.field_k * this.direction.x + (float)this.position.y + this.direction.y * (float)this.field_C.field_K))) {
            var13++;
          }
          var14 = 0;
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)(this.direction.x * (float)this.field_C.field_K + ((float)this.position.x + this.direction.y * (float)this.field_C.field_k)), -3, (int)(-(this.direction.x * (float)this.field_C.field_k) + (float)this.position.y + this.direction.y * (float)this.field_C.field_K))) {
            var14++;
          }
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.position.x - (float)this.field_C.field_k * this.direction.y - this.direction.x * (float)this.field_C.field_K), -3, (int)(-((float)this.field_C.field_K * this.direction.y) + (this.direction.x * (float)this.field_C.field_k + (float)this.position.y)))) {
            var13++;
          }
          if (MusicPatchPcmStream.field_r.a(this.field_q, (int)((float)this.field_C.field_k * this.direction.y + (float)this.position.x - this.direction.x * (float)this.field_C.field_K), -3, (int)(-(this.direction.y * (float)this.field_C.field_K) + ((float)this.position.y - this.direction.x * (float)this.field_C.field_k)))) {
            var14++;
          }
          boolean decompiledFrameRemainder3 = true;
          if (MusicPatchPcmStream.field_r.field_r == 0) {
            var11 = var11 * qg.field_c[var14];
            var12 = var12 * LayeredButtonRenderer.field_u[var14 + var13];
            var10Lifetime1 = var10Lifetime1 * qg.field_c[var13];
            decompiledFrameRemainder3 = (var36 != 0);
          }
          if (decompiledFrameRemainder3) {
            if (1 == MusicPatchPcmStream.field_r.field_r) {
              var12 = var12 * MusicPatch.field_r[var14 + var13];
              var10Lifetime1 = var10Lifetime1 * DisplayNameForm.field_J[var13];
              var11 = var11 * DisplayNameForm.field_J[var14];
              if ((var36 != 0) &&
                (MusicPatchPcmStream.field_r.field_r == 2)) {
                var12 = var12 * QuickChatDynamicCommand.field_e[var13 + var14];
                var11 = var11 * MatchingTextValidator.field_k[var14];
                var10Lifetime1 = var10Lifetime1 * MatchingTextValidator.field_k[var13];
              }
            } else {
              if (MusicPatchPcmStream.field_r.field_r == 2) {
                var12 = var12 * QuickChatDynamicCommand.field_e[var13 + var14];
                var11 = var11 * MatchingTextValidator.field_k[var14];
                var10Lifetime1 = var10Lifetime1 * MatchingTextValidator.field_k[var13];
              }
            }
          }
          var15 = 0.5f * (var4 * this.field_ic);
          var16 = 0.5f * (this.field_ic * var4);
          if (0.0f > this.field_P) {
            var16 = var16 + var4 * 0.5f;
            var15 = var15 - var4 * 0.5f;
          }
          if (this.field_P > 0.0f) {
            var16 = var16 - 0.5f * var4;
            var15 = var15 + var4 * 0.5f;
          }
          var17 = 0.5f * (-DualLinkNode.signumFloat(-29407, this.field_Y) * (var2_float * var6));
          var18 = 0.5f * (-DualLinkNode.signumFloat(-29407, this.field_Y) * (var6 * var2_float));
          if (var3 == 0) {
            stackIn_81_0 = var15 * var15;
          } else {
            stackIn_81_0 = 0.0f;
          }
          var19 = (float)Math.sqrt((double)(stackIn_81_0 + var17 * var17));
          if (var3 != 0) {
            stackIn_85_0 = 0.0f;
          } else {
            stackIn_85_0 = var16 * var16;
          }
          var20 = (float)Math.sqrt((double)(stackIn_85_0 + var18 * var18));
          var21 = var19 / var10Lifetime1;
          var22 = var20 / var11;
          if (var21 > 1.0f) {
            var17 = var17 / var21;
            var15 = var15 / var21;
          }
          if (1.0f < var22) {
            var18 = var18 / var22;
            var16 = var16 / var22;
          }
          var4Lifetime1 = var16 + var15;
          if (var5 > Math.abs(var4Lifetime1)) {
            var4Lifetime1 = DualLinkNode.signumFloat(-29407, var4Lifetime1) * var5;
          }
          var23 = this.field_C.field_y * (var16 - var15);
          this.field_wc = -var23 / this.field_C.field_a;
          var24 = this.field_jc * this.field_jc * this.field_C.field_J * DualLinkNode.signumFloat(-29407, this.field_jc);
          var25 = var12 * (9.8100004196167f * DualLinkNode.signumFloat(-29407, this.field_jc) * this.field_C.field_l);
          var26 = var25 + var24 + var7;
          var27 = var9 + var4Lifetime1;
          if (!param0) {
            this.a(4, (GrowableObjectList) null, 97);
          }
          var28 = var17 + var18;
          var29 = var8;
          this.field_Gb = var27 / this.field_C.field_l;
          var30 = var29 / this.field_C.field_l;
          if (this.field_J == 1) {
            var31 = DualLinkNode.signumFloat(-29407, this.field_P) * -5.0f;
            var30 = var30 + var31;
            var32 = var31 * this.field_C.field_l;
            var33_float = (this.field_C.field_j * 3.0f - this.field_C.field_C) / 4.0f;
            this.field_wc = this.field_wc + var33_float * var32 / this.field_C.field_a;
          }
          var31Lifetime1 = -var26 / this.field_C.field_l;
          var32Lifetime1 = var28 / this.field_C.field_l;
          var33 = 0;
          if (DualLinkNode.signumFloat(-29407, var31Lifetime1) != DualLinkNode.signumFloat(-29407, this.field_jc) &&
            Math.abs(0.019999999552965164f * var31Lifetime1) > Math.abs(this.field_jc)) {
            var33 = 1;
          }
          this.field_Gb = this.field_Gb + var31Lifetime1;
          var30 = var30 + var32Lifetime1;
          var34 = 0;
          if (Math.abs(var32Lifetime1 * 0.019999999552965164f) > Math.abs(this.field_Y)) {
            var34 = 1;
          }
          if (Float.isNaN(this.field_Gb)) {
            throw new RuntimeException((String) null);
          }
          boolean decompiledFrameRemainder1 = true;
          this.angularVelocity = 0.019999999552965164f * this.field_wc;
          if (this.field_jb) {
            this.field_wc = 0.0f;
            if (this.field_M != -1) {
              fieldTemp$0 = this.field_M - 1;
              this.field_M = this.field_M - 1;
              if (fieldTemp$0 <= 0) {
                this.field_jb = false;
              }
            }
            if (0.0f < this.angularVelocity) {
              this.angularVelocity = 5.0f;
              decompiledFrameRemainder1 = (var36 != 0);
            }
            if (decompiledFrameRemainder1) {
              this.angularVelocity = -5.0f;
              decompiledFrameRemainder1 = (var36 != 0);
            }
          }
          if ((decompiledFrameRemainder1) &&
            (this.field_V)) {
            var35 = this.field_H - this.heading;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if ((double)var35 > 3.141592653589793) {
                var35 = (float)((double)var35 - 6.283185307179586);
                decompiledFrameRemainder0 = (var36 == 0);
                if ((decompiledFrameRemainder0) &&
                  (var36 == 0)) {
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                while ((double)var35 < -3.141592653589793) {
                  var35 = (float)((double)var35 + 6.283185307179586);
                  if (var36 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (var36 == 0) {
                    continue;
                  }
                  break;
                }
                if (decompiledFrameCompleted0) {
                  this.heading = this.heading + 0.019999999552965164f * (5.0f * var35);
                }
              }
              if (0.5f > Math.abs(var35) &&
                100.0f > Math.abs(this.field_wc)) {
                this.field_V = false;
              }
              fieldTemp$1 = this.field_T - 1;
              this.field_T = this.field_T - 1;
              if (fieldTemp$1 > 0) {
                break;
              }
              this.field_V = false;
              break;
            }
          }
          this.field_jc = this.direction.y * this.velocityY + this.direction.x * this.velocityX;
          this.field_Y = this.velocityX * this.direction.y - this.velocityY * this.direction.x;
          this.field_jc = this.field_jc + this.field_Gb * 0.019999999552965164f;
          this.field_Y = this.field_Y + 0.019999999552965164f * var30;
          if (var33 != 0) {
            this.field_Gb = 0.0f;
            this.field_jc = 0.0f;
          }
          if (var34 != 0) {
            this.field_Y = 0.0f;
          }
          this.velocityY = this.field_jc * this.direction.y - this.direction.x * this.field_Y;
          this.velocityX = this.direction.y * this.field_Y + this.direction.x * this.field_jc;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.D(" + param0 + ')');
        }
    }

    private final void a(Point2i param0, byte param1, GrowableObjectList param2, GrowableObjectList param3) {
        float stackIn_18_0 = 0.0f;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        GrowableObjectList var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        float var7 = 0.0f;
        PointPath var8 = null;
        float var9 = 0.0f;
        Object var10 = null;
        PathWaypoint[] var10_array = null;
        int var11_int = 0;
        float var11 = 0.0f;
        PathWaypoint var12 = null;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          var5 = new GrowableObjectList();
          if (param1 != 39) {
            return;
          }
          var6 = 0;
          var7 = 0.0f;
          var8 = (PointPath) (param3.elements[var6]);
          var9 = var8.field_e;
          var10 = null;
          while (true) {
            if (var7 >= var9) {
              stackIn_18_0 = var7 - var9;
              if (var13 == 0) {
                var7 = stackIn_18_0;
                var6++;
                if (param3.size <= var6) {
                  var10_array = new PathWaypoint[var5.size];
                  var11_int = 0;
                  while (var5.size > var11_int) {
                    var10_array[var11_int] = (PathWaypoint) (var5.elements[var11_int]);
                    var11_int++;
                  }
                  param2.add(var10_array, (byte) 6);
                  this.a(5, param2, -1);
                  return;
                }
                var8 = (PointPath) (param3.elements[var6]);
                var9 = var8.field_e;
                continue;
              }
            } else {
              stackIn_18_0 = var7 / var9;
            }
            var11 = stackIn_18_0;
            var12 = new PathWaypoint(var8.pointAt(false, var11), var8.field_b);
            var5.add(var12, (byte) 6);
            if (100 <= var5.size) {
              throw new RuntimeException();
            }
            var7 = var7 + 5.0f;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("ja.GA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1) {
        int dupTemp$0 = 0;
        wm stackIn_25_0 = null;
        wm stackIn_25_1 = null;
        Point2i stackIn_25_2 = null;
        wm stackIn_26_0 = null;
        wm stackIn_26_1 = null;
        int stackIn_26_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Vector2f var4 = null;
        Point2i var5 = null;
        wm var6 = null;
        float var7 = 0.0f;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 != -1065046232) {
            this.field_mc = 21;
          }
          var3_int = 2;
          while (var3_int >= 0) {
            if (var8 != 0) {
              return;
            }
            if (param0 == 0) {
              return;
            }
            if (this.field_hc[var3_int] != -1) {
              ValidationHelpWidget.a((byte) 76, (MovingEntity) (this), TutorialPage.field_i, TutorialPage.field_i.field_q);
              dupTemp$0 = this.field_hc[var3_int];
              this.field_Fb[dupTemp$0] = this.field_Fb[dupTemp$0] - 1;
              var4 = new Vector2f(this.direction);
              var4.scale(1.5f * (float)this.field_C.field_K, -1);
              var5 = new Point2i(this.position);
              if (!(0.0f < this.field_jc)) {
                var5.translate(var4, (byte) 113);
              } else {
                var5.subtractVector(var4, -13201);
              }
              stackIn_25_0 = null;
              stackIn_25_1 = null;
              stackIn_25_2 = var5;
              if (this.field_hc[var3_int] != 3) {
                stackIn_26_0 = null;
                stackIn_26_1 = null;
                stackIn_26_3 = 2 + this.field_hc[var3_int];
              } else {
                stackIn_26_0 = null;
                stackIn_26_1 = null;
                stackIn_26_3 = 1;
              }
              var6 = new wm(stackIn_25_2, stackIn_26_3, this.field_q);
              var7 = -5.0f + (float)Math.random() * 10.0f;
              if (!(this.field_jc > 0.0f)) {
                var6.velocityY = -(this.direction.x * var7) + (this.direction.y * 100.0f + this.velocityY);
                var6.velocityX = this.velocityX + 100.0f * this.direction.x + var7 * this.direction.y;
              } else {
                var6.velocityX = this.velocityX - 100.0f * this.direction.x - var7 * this.direction.y;
                var6.velocityY = this.velocityY - this.direction.y * 100.0f + var7 * this.direction.x;
              }
              MusicPatchPcmStream.field_r.field_W.addLast((byte) -71, var6);
              param0--;
              this.field_hc[var3_int] = -1;
            }
            var3_int--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "ja.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_16_0 = false;
        boolean stackIn_24_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -1) {
            return false;
          }
          if (param0 >= -24) {
            this.field_gc = -118;
          }
          if (this.field_kc > this.field_qc) {
            stackIn_16_0 = (this.field_qc <= param1) && (param1 <= this.field_kc);
            return stackIn_16_0;
          }
          stackIn_24_0 = !(this.field_qc > param1) || !(param1 > this.field_kc);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "ja.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean c(byte param0) {
        Object stackIn_21_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        RaceVehicle[] var3 = null;
        float var4 = 0.0f;
        Vector2f var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        Object var8 = null;
        Object var9 = null;
        int var10_int = 0;
        wm var10 = null;
        Object var11 = null;
        float var11_float = 0.0f;
        float var12_float = 0.0f;
        vf var12_ref_vf = null;
        int var12 = 0;
        float var13_float = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        Object var11Lifetime1;
        float var12_floatLifetime1;
        int var12Lifetime1;
        float var13_floatLifetime1;
        float var13_floatLifetime2;
        int var13Lifetime1;
        float var14Lifetime1;
        float var14Lifetime2;
        float var15Lifetime1;
        float var14Lifetime2Lifetime1;
        var17 = HoldTheLine.field_D;
        try {
          var2_int = 1;
          var3 = MusicPatchPcmStream.field_r.vehicles;
          var4 = this.heading;
          var4 = (float)((double)var4 + (-0.05000000074505806 + Math.random() * 0.10000000149011612));
          var5 = new Vector2f(var4);
          var6 = 3.4028234663852886e+38f;
          if (param0 >= -53) {
            this.field_lc = -0.8991538286209106f;
          }
          var7 = 0.0f;
          var8 = null;
          var9 = null;
          var10_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var10_int < MusicPatchPcmStream.field_r.field_z)))) {
            stackIn_21_0 = this;
            if (var17 == 0) {
              if (~this.field_mc != ~var10_int) {
                var11 = var3[var10_int];
                if (null != var11) {
                  var12_float = -this.worldX + ((RaceVehicle) (var11)).worldX;
                  var13_float = ((RaceVehicle) (var11)).worldY - this.worldY;
                  var14 = var12_float * var5.x + var13_float * var5.y;
                  var15 = -(var13_float * var5.x) + var5.y * var12_float;
                  if (var6 > var14 &&
                    4.0f * Math.abs(var15) < var14) {
                    var6 = var14;
                    var7 = var15;
                    var8 = var11;
                  }
                }
              }
              var10_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = MusicPatchPcmStream.field_r.field_cb.first((byte) 121);
          }
          var10 = (wm) (stackIn_21_0);
          while (var10 != null) {
            var10.g(0);
            if ((var10.field_J & 1024) != 0) {
              var11_float = -this.worldX + var10.worldX;
              var12_floatLifetime1 = -this.worldY + var10.worldY;
              var13_floatLifetime1 = var12_floatLifetime1 * var5.y + var5.x * var11_float;
              var14Lifetime1 = var5.y * var11_float - var5.x * var12_floatLifetime1;
              if (var6 > var13_floatLifetime1 &&
                Math.abs(var14Lifetime1) * 6.0f < var13_floatLifetime1 &&
                Math.abs(var14Lifetime1) < 12.0f) {
                var7 = var14Lifetime1;
                var9 = var10;
                var6 = var13_floatLifetime1;
              }
            }
            var10 = (wm) (MusicPatchPcmStream.field_r.field_cb.next((byte) 87));
            if (var17 == 0) {
              continue;
            }
            break;
          }
          regionExit1: {
            boolean decompiledFrameCompleted0 = true;
            var11Lifetime1 = null;
            if (null != ih.field_n) {
              var12_ref_vf = (vf) (ih.field_n.first((byte) 103));
              while (null != var12_ref_vf) {
                var13_floatLifetime2 = -this.worldX + (float)var12_ref_vf.field_B;
                var14Lifetime2 = (float)var12_ref_vf.field_i - this.worldY;
                var15Lifetime1 = var13_floatLifetime2 * var5.x + var14Lifetime2 * var5.y;
                var16 = var13_floatLifetime2 * var5.y - var14Lifetime2 * var5.x;
                stackIn_68_0 = compareFloatsNaNLow(var6, var15Lifetime1);
                if (var17 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_68_0 > 0 &&
                  var15Lifetime1 > 8.0f * Math.abs(var16) &&
                  Math.abs(var16) < 6.0f) {
                  var7 = var16;
                  var6 = var15Lifetime1;
                  var11Lifetime1 = var12_ref_vf;
                }
                var12_ref_vf = (vf) (ih.field_n.next((byte) -49));
              }
            }
            if (decompiledFrameCompleted0) {
              if (var9 == null &&
                null == var8 &&
                var11Lifetime1 == null) {
                var12 = (int)(var5.x * 500.0f + this.worldX);
                var13 = (int)(500.0f * var5.y + this.worldY);
                if (Point2i.a(this.field_q, MusicPatchPcmStream.field_r.field_nb, -20484, this.position, new Point2i(var12, var13))) {
                  this.a(500.0f * RasterBuffer.field_d, var5, (int)this.worldX, 40, (int)this.worldY);
                }
                if (var17 == 0) {
                  break regionExit1;
                }
              }
              stackIn_68_0 = (int)(this.worldX + var5.x * var6);
            }
            var12Lifetime1 = stackIn_68_0;
            var13Lifetime1 = (int)(var6 * var5.y + this.worldY);
            if (!Point2i.a(this.field_q, MusicPatchPcmStream.field_r.field_nb, -20484, this.position, new Point2i(var12Lifetime1, var13Lifetime1))) {
              this.a(var6, var5, (int)this.worldX, 35, (int)this.worldY);
              if (null == var11Lifetime1) {
                if (var9 != null) {
                  MusicPatchPcmStream.field_r.a((wm) (var9), false);
                  if (var17 != 0) {
                    if (((RaceVehicle) (var8)).field_J != 2) {
                      var14Lifetime2Lifetime1 = ((RaceVehicle) (var8)).field_C.field_a * ((RaceVehicle) (var8)).a((byte) 104, RotatedSpriteAsset.field_j);
                      ((RaceVehicle) (var8)).heading = ((RaceVehicle) (var8)).heading + var7 * 2000.0f / (var14Lifetime2Lifetime1 * var6);
                    }
                    ((RaceVehicle) (var8)).field_Yb = ((RaceVehicle) (var8)).field_Yb + 2;
                    ((RaceVehicle) (var8)).a(1.0f, 0, this, 6);
                    ((vf) (var11Lifetime1)).a(this, 0, (byte) 110, 0);
                    this.a(var6 * RasterBuffer.field_d, var5, (int)this.worldX, -115, (int)this.worldY);
                  }
                } else {
                  if (((RaceVehicle) (var8)).field_J != 2) {
                    var14Lifetime2Lifetime1 = ((RaceVehicle) (var8)).field_C.field_a * ((RaceVehicle) (var8)).a((byte) 104, RotatedSpriteAsset.field_j);
                    ((RaceVehicle) (var8)).heading = ((RaceVehicle) (var8)).heading + var7 * 2000.0f / (var14Lifetime2Lifetime1 * var6);
                  }
                  ((RaceVehicle) (var8)).field_Yb = ((RaceVehicle) (var8)).field_Yb + 2;
                  ((RaceVehicle) (var8)).a(1.0f, 0, this, 6);
                  if (var17 != 0) {
                    ((vf) (var11Lifetime1)).a(this, 0, (byte) 110, 0);
                    this.a(var6 * RasterBuffer.field_d, var5, (int)this.worldX, -115, (int)this.worldY);
                  }
                }
              } else {
                ((vf) (var11Lifetime1)).a(this, 0, (byte) 110, 0);
                if (var17 != 0) {
                  this.a(var6 * RasterBuffer.field_d, var5, (int)this.worldX, -115, (int)this.worldY);
                }
              }
            } else {
              this.a(var6 * RasterBuffer.field_d, var5, (int)this.worldX, -115, (int)this.worldY);
            }
          }
          this.field_Rb = 0;
          stackIn_91_0 = var2_int;
          return stackIn_91_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "ja.NA(" + param0 + ')');
        }
    }

    final void a(float param0, int param1, RaceVehicle param2, int param3) {
        float[] stackIn_15_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (null == param2) {
            param2 = this.field_Bb;
          }
          this.field_Bb = param2;
          if (this.field_J == 2) {
            stackIn_15_0 = pb.field_b;
          } else {
            if (this.field_Fb[2] == 0) {
              stackIn_15_0 = sl.field_d;
            } else {
              if (this.field_Fb[2] == 1) {
                stackIn_15_0 = StandardContentTransitionDialog.field_kb;
              } else {
                stackIn_15_0 = IndexedSpriteState.field_g;
              }
            }
          }
          var5 = stackIn_15_0;
          param0 = param0 * var5[param3];
          this.field_lc = this.field_lc - param0;
          if (0.0f >= this.field_lc && (2 == MusicPatchPcmStream.field_r.field_J ||
            MusicPatchPcmStream.field_r.field_J == 6)) {
            if (this.field_rc != 2) {
              this.a(param2, (byte) -88);
              if (var8 == 0) {
                return;
              }
            }
            this.b(false);
            return;
          }
          var6 = this.field_Fb[param1];
          var7 = 3;
          scanLoop1: while (true) {
            if (var7 > 0) {
              stackIn_44_0 = compareFloatsNaNHigh(RoadStripRenderer.field_b[var7 - 1], param0);
              if (var8 != 0) {
                break scanLoop1;
              }
              if (stackIn_44_0 < 0) {
                this.d(var7, -1065046232);
              } else {
                var7--;
                continue;
              }
            }
            stackIn_44_0 = this.field_Fb[0];
            break;
          }
          if (stackIn_44_0 != var6 &&
            this.field_W != null) {
            this.field_F = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_55_0 = var5_ref;
          stackIn_55_1 = new StringBuilder().append("ja.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MouseInputHandler.field_d = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          if (param0 != -1848651292) {
            RaceVehicle.clearSharedReferences(59);
          }
          var4 = -1L;
          OpacityWidget.writeCookie(var4, param1, var3, -118, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ja.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_Wb = new LoginMethodPreference("email");
        field_Qb = new char[]{'€', '\0', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\0', 'Ž', '\0', '\0', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\0', 'ž', 'Ÿ'};
    }

    private static int compareFloatsNaNLow(float left, float right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }

    private static int compareFloatsNaNHigh(float left, float right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
