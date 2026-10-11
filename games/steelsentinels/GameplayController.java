/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayController {
    private Sentinel field_u;
    private int field_r;
    private int[] field_O;
    private int field_s;
    private int[] field_D;
    private int field_F;
    private int field_Q;
    Sentinel controlledSentinel;
    int field_l;
    static String field_T;
    private Sentinel[] field_W;
    private int[] field_B;
    private int field_n;
    boolean field_J;
    private int field_U;
    private int field_v;
    boolean field_z;
    int field_i;
    private int[] field_e;
    int field_N;
    private int[] field_b;
    static long field_G;
    int field_p;
    private boolean field_k;
    private int field_q;
    static String field_m;
    private int[] field_H;
    static int field_L;
    int field_V;
    private boolean field_d;
    private int[] field_a;
    private int[] field_o;
    int field_E;
    private boolean field_A;
    int field_P;
    private boolean field_y;
    static boolean field_I;
    int field_w;
    private int field_Y;
    private boolean field_ab;
    private int field_S;
    private boolean field_f;
    private int[] field_g;
    private int[] field_M;
    CombatWorld world;
    int field_j;
    private int field_Z;
    static String field_x;
    private boolean field_h;
    private int field_t;
    private int[] field_c;
    private int[] field_K;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = SteelSentinels.obfuscationControl;
        try {
          if (!this.world.field_j) {
            if (oh.field_f < 0 &&
              0 > pi.field_c) {
              return;
            }
            var8_int = 0;
            var9 = 0;
            var10 = param2;
            while (var10 < hf.field_c) {
              var11 = param1 + (param5 * this.field_D[var10] / param4 >> 4);
              var12 = this.field_K[var10] / (param3 * 16) + param0;
              if (var13 != 0) {
                return;
              }
              if (0 < var10) {
                SoftwareRaster.a(var8_int, var9, var11, var12, 16777215, 128);
              }
              var8_int = var11;
              var9 = var12;
              var10++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "nb.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void j(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Sentinel[] var3 = null;
        int var4 = 0;
        NodeIterator var5 = null;
        Sentinel var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sentinel var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_52_0Lifetime1;
        int stackIn_52_1Lifetime1;
        int var6Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var2_int = this.world.computerPlayerCount + this.world.playerCount;
          if (0 <= this.world.field_A) {
            var2_int++;
          }
          if (null == this.field_B ||
            ~var2_int != ~this.field_B.length) {
            this.field_B = new int[var2_int];
          }
          var3 = new Sentinel[var2_int];
          var4 = 0;
          var5 = new NodeIterator(this.world.sentinels);
          var6_ref_mb = (Sentinel) (var5.b(2));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var6_ref_mb))) {
            stackIn_34_0 = 0;
            stackIn_34_1 = var6_ref_mb.playerId;
            if (var11 == 0) {
              if (stackIn_34_0 > stackIn_34_1 ||
                !(this.world.playerCount + this.world.computerPlayerCount > var6_ref_mb.playerId)) {
                if (!(0 > this.world.field_A) &&
                  this.world.field_A == var6_ref_mb.playerId) {
                  incrementValue$0 = var4;
                  var4++;
                  var3[incrementValue$0] = var6_ref_mb;
                }
              } else {
                incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = var6_ref_mb;
              }
              var6_ref_mb = (Sentinel) (var5.d(2));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_34_0 = ~var2_int;
            stackIn_34_1 = ~var4;
          }
          if (stackIn_34_0 < stackIn_34_1) {
            var2_int = var4;
          }
          if (param0 < 34) {
            return;
          }
          var6 = 0;
          scanLoop1: while (true) {
            if (var6 < (-1 + var2_int)) {
              var7 = var6;
              stackIn_56_0 = var6;
              if (var11 != 0) {
                break scanLoop1;
              }
              var8 = stackIn_56_0;
              while (var2_int > var8) {
                stackIn_52_0 = ~(var3[var7].field_vb - var3[var7].field_Ab);
                stackIn_52_1 = ~(-var3[var8].field_Ab + var3[var8].field_vb);
                if (stackIn_52_0 > stackIn_52_1) {
                  var7 = var8;
                }
                var8++;
              }
              stackIn_52_0Lifetime1 = var7;
              stackIn_52_1Lifetime1 = var6;
              if (stackIn_52_0Lifetime1 != stackIn_52_1Lifetime1) {
                var9 = var3[var6];
                var3[var6] = var3[var7];
                var3[var7] = var9;
              }
              var6++;
              continue scanLoop1;
            }
            var7 = 0;
            stackIn_56_0 = 0;
            break;
          }
          var6Lifetime1 = stackIn_56_0;
          while (var2_int > var6Lifetime1) {
            var10 = var3[var6Lifetime1].playerId;
            if (var11 != 0) {
              return;
            }
            if (this.world.field_A >= 0 &&
              ~this.world.field_A == ~var10) {
              var10 = var3.length - 1;
            }
            if (var7 > this.field_B[var10]) {
              this.field_B[var10] = this.field_B[var10] + 1;
            } else {
              if (this.field_B[var10] > var7) {
                this.field_B[var10] = this.field_B[var10] - 1;
              }
            }
            var7 += 9;
            var6Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.EA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        try {
          Object stackIn_8_0 = null;
          int stackIn_32_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var5 = null;
          RuntimeException var5_ref = null;
          int[] var6 = null;
          int var7_int = 0;
          Object var7 = null;
          java.awt.Cursor var7_ref = null;
          Object var8 = null;
          IllegalAccessException var8_ref = null;
          InstantiationException var8_ref2 = null;
          java.lang.reflect.InvocationTargetException var8_ref3 = null;
          int var9 = 0;
          var9 = SteelSentinels.obfuscationControl;
          try {
            boolean decompiledFrameCompleted0 = true;
            if (this.field_q != param1) {
              this.field_q = param1;
              if (null == wb.field_c) {
                stackIn_8_0 = sl.field_n;
              } else {
                stackIn_8_0 = wb.field_c;
              }
              var5 = stackIn_8_0;
              if (!BattleTerrain.c(-104)) {
                return;
              }
              var6 = new int[vg.field_h[this.field_q].field_E.length];
              var7_int = 0;
              while (var7_int < var6.length) {
                stackIn_32_0 = -1;
                if (var9 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_32_0 != ~vg.field_h[this.field_q].field_E[var7_int]) {
                  var6[var7_int] = vn.a(vg.field_h[this.field_q].field_E[var7_int], -16777216);
                } else {
                  var6[var7_int] = 0;
                }
                var7_int++;
              }
              if (decompiledFrameCompleted0) {
                var7 = null;
                try {
                  var8 = hl.field_u.newInstance(new Object[]{new Integer(vg.field_h[this.field_q].field_A), new Integer(vg.field_h[this.field_q].field_F), new Integer(lc.field_h)});
                  nh.field_u.invoke(var8, new Object[]{new Integer(0), new Integer(0), new Integer(vg.field_h[this.field_q].field_A), new Integer(vg.field_h[this.field_q].field_F), var6, new Integer(0), new Integer(vg.field_h[this.field_q].field_A)});
                  var7_ref = (java.awt.Cursor) (jd.field_rb.invoke((Object) (((java.awt.Canvas) (var5)).getToolkit()), new Object[]{var8, new java.awt.Point(param0, param3), "FunOrb Custom Cursor"}));
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref = (IllegalAccessException) (Object) decompiledCaughtException;
                  jd.field_rb = null;
                } catch (java.lang.InstantiationException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref2 = (InstantiationException) (Object) decompiledCaughtException;
                  throw new RuntimeException();
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var8_ref3 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  throw new RuntimeException();
                }
                ((java.awt.Canvas) (var5)).setCursor(var7_ref);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_32_0 = param2;
            }
            if (stackIn_32_0 != 0) {
              GameplayController.a((cm) null, (byte) 6, (String) null, (String) null);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ci.a((Throwable) ((Object) var5_ref), "nb.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        Sentinel stackIn_17_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Sentinel var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Sentinel var5_ref_mb = null;
        Sentinel[] var5_ref_mb__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sentinel var7_ref_mb = null;
        int var8 = 0;
        int stackIn_56_0Lifetime1;
        int stackIn_56_1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime1Lifetime1;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (this.world.field_P != 1) {
            if (this.world.field_P != 2) {
              this.field_O = null;
              if (var8 != 0) {
                this.field_O = new int[3];
                this.field_O = new int[2];
              }
            } else {
              this.field_O = new int[3];
              if (var8 != 0) {
                this.field_O = new int[2];
              }
            }
          } else {
            this.field_O = new int[2];
          }
          if (this.world.field_A < 0) {
            stackIn_17_0 = null;
          } else {
            stackIn_17_0 = this.world.spawnedSpecialSentinel;
          }
          var2 = stackIn_17_0;
          var3 = this.world.playerCount + this.world.computerPlayerCount;
          if (null != var2) {
            var3++;
          }
          this.field_W = new Sentinel[var3];
          var4 = 0;
          var5_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5_ref_mb))) {
            stackIn_38_0 = 0;
            stackIn_38_1 = var5_ref_mb.playerId;
            if (var8 == 0) {
              if (stackIn_38_0 <= stackIn_38_1 &&
                var5_ref_mb.playerId < this.world.computerPlayerCount + this.world.playerCount) {
                incrementValue$0 = var4;
                var4++;
                this.field_W[incrementValue$0] = var5_ref_mb;
              }
              var5_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -41));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (null != var2) {
              incrementValue$1 = var4;
              var4++;
              this.field_W[incrementValue$1] = var2;
            }
            stackIn_38_0 = var3;
            stackIn_38_1 = var4;
          }
          if (stackIn_38_0 > stackIn_38_1) {
            var5_ref_mb__ = this.field_W;
            this.field_W = new Sentinel[var4];
            ii.a(var5_ref_mb__, 0, this.field_W, 0, var4);
            var3 = var4;
          }
          boolean decompiledFrameCompleted3 = true;
          if (this.field_O != null) {
            var5 = 0;
            while ((-1 + var3) > var5) {
              var6 = var5;
              stackIn_60_0 = 1 + var5;
              if (var8 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              var7 = stackIn_60_0;
              while (var7 < var3) {
                stackIn_56_0 = ~this.field_W[var7].teamId;
                stackIn_56_1 = ~this.field_W[var6].teamId;
                if (stackIn_56_0 > stackIn_56_1) {
                  var6 = var7;
                }
                var7++;
              }
              stackIn_56_0Lifetime1 = var5;
              stackIn_56_1Lifetime1 = var6;
              if (stackIn_56_0Lifetime1 != stackIn_56_1Lifetime1) {
                var7_ref_mb = this.field_W[var6];
                this.field_W[var6] = this.field_W[var5];
                this.field_W[var5] = var7_ref_mb;
              }
              var5++;
            }
          }
          if (decompiledFrameCompleted3) {
            this.field_c = new int[32];
            this.field_a = new int[32];
            stackIn_60_0 = param0;
          }
          if (stackIn_60_0 >= -9) {
            this.c(50);
          }
          this.field_e = new int[var3];
          this.field_H = new int[32];
          stackIn_67_0 = (di.field_g == -1) ? 0 : 1;
          var5Lifetime1 = stackIn_67_0;
          stackIn_71_0 = (var5Lifetime1 != 0) ? 0 : 1;
          var6Lifetime1 = stackIn_71_0;
          if (this.world.field_lb &&
            this.world.field_cb < 43) {
            var6Lifetime1 = 0;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted2 = true;
          if (var6Lifetime1 != 0) {
            this.world.a(this.field_W, this.field_O, this.field_H, -112, this.field_e, this.field_c);
          }
          if (var6Lifetime1 == 0 ||
            var8 != 0) {
            var7Lifetime1 = 0;
            while (this.field_W.length > var7Lifetime1) {
              this.field_H[var7Lifetime1] = this.field_W[var7Lifetime1].field_vb;
              var7Lifetime1++;
              if (var8 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted2) && (var6Lifetime1 != 0 &&
            null != this.controlledSentinel &&
            ed.field_j >= 0)) {
            var7Lifetime1 = 0;
            while (var7Lifetime1 < 32) {
              this.field_a[var7Lifetime1] = this.controlledSentinel.getStatistic(true, var7Lifetime1);
              var7Lifetime1++;
              if (var8 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameRemainder0 = (null != this.field_O))) {
              this.field_a[25] = this.field_O[this.controlledSentinel.teamId];
              decompiledFrameRemainder0 = (var8 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted1)) {
            var7Lifetime1Lifetime1 = 0;
            while (var7Lifetime1Lifetime1 < 32) {
              this.field_a[var7Lifetime1Lifetime1] = 0;
              var7Lifetime1Lifetime1++;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5Lifetime1 != 0)) {
            this.field_c[0] = this.world.simulationTick / 50;
          }
          if (var5Lifetime1 != 0 &&
            0 <= nc.field_a) {
            this.field_c[0] = nc.field_a;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.JA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, Sentinel param7, int param8) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17_int = 0;
        Object var17 = null;
        RgbSprite var17_ref = null;
        String var18 = null;
        try {
          if (param7 == null) {
            return;
          }
          var10_int = param0;
          SoftwareRaster.c(param8, param5, var10_int, param0, 0, 160);
          var11 = -var10_int + (param3 - 4);
          var12 = 4 + var10_int + param8;
          var13 = param5;
          var14 = hj.field_w;
          var15 = 0;
          var16 = null;
          var17_int = NodeDeque.a((byte) 105, param7.chassis.componentId);
          if (var17_int >= 0 &&
            var17_int < cd.field_c.length) {
            var16 = cd.field_c[var17_int];
            if (FunOrbClient.field_z[var17_int] == 84) {
              var15 += 10;
            }
          }
          SoftwareRaster.a(param8, param5, var10_int + param8, param5 + param0);
          if (param4) {
            oa.field_N.a(param8 + (-oa.field_N.field_z + var10_int) / 2, param5 + (-oa.field_N.field_B + param0) / 2);
          }
          hj.field_w = var10_int * 6400 / param6;
          var17 = null;
          if (!param4) {
            param7.chassis.a(0, true, var10_int / 2 + param8, param0 + param5 - (6 - var15), (byte) 49, 0);
            fl.a(var10_int, param7, (byte) -125, param0, param8, param5);
          } else {
            var17_ref = new RgbSprite(var10_int, param0);
            var17_ref.d();
            param7.chassis.a(0, true, var10_int / 2, var15 - 6 + param0, (byte) 49, 0);
            bg.a(var17_ref, param7, 14590);
            sb.field_bb.b((byte) 121);
            var17_ref.a(param8, param5);
          }
          SoftwareRaster.c();
          hj.field_w = var14;
          SoftwareRaster.c(var12, var13, var11, 21, 0, 160);
          var13 += 16;
          var18 = this.world.d(-1661904765, param7.playerId);
          if (param1) {
            return;
          }
          if (~param2 == ~PartInstruction.field_t[0]) {
            param2 = uj.a(param2, 96);
          }
          boolean decompiledSharedTail0 = (null != var18);
          if (!decompiledSharedTail0) {
            var12 += 4;
            decompiledSharedTail0 = (SteelSentinels.obfuscationControl != 0);
          }
          if (decompiledSharedTail0) {
            pl.field_U.b(var18.toUpperCase(), var12 + 4, var13, param2, -1);
            var12 += 150;
          }
          if (var18 == null &&
            var16 != null) {
            pl.field_U.b(((String) (var16)).toUpperCase(), var12, var13, param2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_40_0 = var10;
          stackIn_40_1 = new StringBuilder().append("nb.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1) {
        int stackIn_14_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_258_1 = 0;
        int stackIn_294_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_310_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_320_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        bh var5_ref_bh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        double var18_double = 0.0;
        int var18 = 0;
        double var19_double = 0.0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int[] var25Lifetime1;
        int stackIn_135_0Lifetime1;
        int stackIn_310_0Lifetime1;
        int stackIn_310_1Lifetime1;
        int var11Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var20_intLifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25_intLifetime1;
        int var25_intLifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var14Lifetime2;
        int var17Lifetime1Lifetime1;
        int var20_intLifetime1Lifetime1;
        int var23Lifetime2Lifetime1;
        int var24Lifetime2Lifetime1;
        int var26Lifetime2Lifetime1;
        int var27Lifetime2Lifetime1;
        var29 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 0;
          if (qg.field_n == null) {
            km.field_c = this.controlledSentinel.worldX;
            dl.field_G = this.controlledSentinel.worldY;
            var5_ref_bh = new bh(this.controlledSentinel);
            var6 = -this.field_P >> 4;
            var7 = 400 - (this.field_E >> 4);
            var5_ref_bh.field_k = 16;
            var5_ref_bh.a((byte) -110, 35, var6, 2, true, var7);
          }
          if (param1 != -1) {
            return;
          }
          var4 = 0;
          var5 = (km.field_c >> 8) - (this.field_P >> 4);
          var6 = 400 + (-(this.field_E >> 4) + (-(this.controlledSentinel.field_Db * 8) + dl.field_G >> 8));
          if (Math.abs(320 - var5) <= 320 &&
            190 >= Math.abs(-var6 + 190)) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          var5 = Math.max(48, Math.min(592, var5));
          var6 = Math.max(48, Math.min(332, var6));
          var3_int = var4;
          if (Math.abs(this.controlledSentinel.field_F) > 100 &&
            null == qg.field_n) {
            var3_int = 1;
          }
          nc.field_b = false;
          if (this.controlledSentinel != null &&
            this.controlledSentinel.field_ub < 0 &&
            this.field_F >= 0 &&
            this.field_F < this.controlledSentinel.field_Xb.length &&
            c.a((byte) -122, this.controlledSentinel.field_Xb[this.field_F])) {
            stackIn_35_0 = 1;
          } else {
            stackIn_35_0 = 0;
          }
          var7 = stackIn_35_0;
          if (this.controlledSentinel == null &&
            1 > this.controlledSentinel.charge &&
            this.field_F >= 0 &&
            this.field_F < this.controlledSentinel.field_Xb.length &&
            this.controlledSentinel.field_Xb[this.field_F] == 8) {
            var7 = 1;
          }
          if (null != this.controlledSentinel &&
            param0 &&
            !this.controlledSentinel.field_Hb) {
            if (this.controlledSentinel.field_pc &&
              this.controlledSentinel.field_Qb >= 0) {
              return;
            }
            var8 = -1 + ml.field_f.length;
            scanLoop1: while (true) {
              if (var8 >= 0) {
                ml.field_f[var8] = 0;
                var8--;
                if (var29 == 0) {
                  continue;
                }
              } else {
                if (this.controlledSentinel.field_Xb.length > this.field_F) {
                  break scanLoop1;
                }
              }
              this.field_F = 0;
              break;
            }
            if (this.controlledSentinel.field_Xb.length > 0) {
              this.controlledSentinel.chassis.a(this.controlledSentinel.field_Xb[this.field_F], param1 + 0, ml.field_f);
              if (var29 != 0) {
                this.controlledSentinel.chassis.a(0, -1, ml.field_f);
              }
            } else {
              this.controlledSentinel.chassis.a(0, -1, ml.field_f);
            }
            var8 = 48;
            if (this.controlledSentinel.field_Xb.length > 0 &&
              var3_int != 0 &&
              ((-var6 + pi.field_c) * (pi.field_c - var6) + (oh.field_f - var5) * (oh.field_f - var5)) < (var8 * var8)) {
              stackIn_88_0 = 1;
            } else {
              stackIn_88_0 = 0;
            }
            var9 = stackIn_88_0;
            nc.field_b = var9 != 0;
            if (var9 != 0) {
              SoftwareRaster.b(var5, var6, var8, 8421631, 50);
            }
            if (var4 != 0) {
              SoftwareRaster.b(var5, var6, var8 - 1, 0, 200);
            }
            var10 = 1;
            do {
              if (var10 > 255) {
                this.field_Q = 0;
                this.field_Z = 0;
                var10 = 0;
                break;
              }
              fm.field_j.field_o[var10] = 0;
              var10++;
            } while (var29 == 0);
            stackIn_106_0 = (var9 != 0) ? 198156 : 329737;
            var11 = stackIn_106_0;
            var11Lifetime1 = this.field_M[0] >> 5 & 493447;
            var12 = 0;
            var13_int = 1;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (128 <= var13_int))) {
              stackIn_170_0 = 0;
              if (var29 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (!(stackIn_170_0 < ml.field_f[var13_int]) ||
                  127 <= var13_int) {
                  if ((1 == var12)) {
                    var14 = 0;
                    while (20 > var14) {
                      var15 = var13_int - var14;
                      var15 = 128 - var15;
                      stackIn_135_0 = var15;
                      if (stackIn_135_0 > 0 &&
                        255 > var15) {
                        fm.field_j.field_o[var15 / 2] = var11Lifetime1 * 20;
                        if (var14 < 3) {
                          fm.field_j.field_o[127 + var15 / 2] = 20 * var11Lifetime1;
                        }
                      }
                      var14++;
                    }
                    var12 = 0;
                    stackIn_135_0Lifetime1 = ~this.field_Z;
                    if ((stackIn_135_0Lifetime1 == -1 ||
                      !(this.field_Z >= var13_int))) {
                      this.field_Z = var13_int;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var12 == 0) {
                    if (this.field_Q == 0 ||
                      var13_int < this.field_Q) {
                      this.field_Q = var13_int;
                    }
                    var12 = 20;
                  }
                  var12--;
                  if (var12 == 0) {
                    var12 = 1;
                  }
                  var14Lifetime2 = var13_int;
                  var14Lifetime2 = -var14Lifetime2 + 128;
                  if (0 < var14Lifetime2 &&
                    255 > var14Lifetime2) {
                    fm.field_j.field_o[var14Lifetime2 / 2] = var11Lifetime1 * 20;
                    if (var12 > 16) {
                      fm.field_j.field_o[var14Lifetime2 / 2 + 127] = var11Lifetime1 * 20;
                    }
                  }
                }
                var13_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              fm.field_j.field_o[0] = 0;
              stackIn_170_0 = 4;
            }
            var13 = new int[stackIn_170_0];
            SoftwareRaster.b(var13);
            var14Lifetime1 = this.d(true, km.field_c + l.field_g);
            var15Lifetime1 = this.b(1, cf.field_q + dl.field_G);
            if (!nc.field_b &&
              var7 == 0 &&
              0 <= oh.field_f &&
              this.field_n == -1) {
              stackIn_186_0 = (var14Lifetime1 >= oh.field_f) ? 0 : 1;
              var16 = stackIn_186_0;
              if (qg.field_n != null) {
                stackIn_193_0 = (0 >= qg.field_n.aimAngle) ? 0 : 1;
                var16 = stackIn_193_0;
              }
              if (var16 == 0) {
                SoftwareRaster.h(0, 0, var14Lifetime1, 480);
              }
              if (var16 != 0 ||
                var29 != 0) {
                SoftwareRaster.h(var14Lifetime1 + 1, 0, 640, 480);
              }
              fm.field_j.c(-48 + var14Lifetime1, var15Lifetime1 - 48);
            }
            SoftwareRaster.a(var13);
            if (!nc.field_b &&
              oh.field_f >= 0 &&
              this.field_n == -1) {
              var16Lifetime1 = -var14Lifetime1 + oh.field_f;
              var17 = -var15Lifetime1 + pi.field_c;
              var18_double = Math.sqrt((double)(var17 * var17 + var16Lifetime1 * var16Lifetime1));
              if (var18_double != 0.0) {
                var20_int = (int)((double)(var16Lifetime1 * 53) / var18_double) + var14Lifetime1;
                var21 = (int)((double)(var17 * 53) / var18_double) + var15Lifetime1;
                var22 = var14Lifetime1 + (int)((double)(var16Lifetime1 * 48) / var18_double);
                var23 = var15Lifetime1 + (int)((double)(var17 * 48) / var18_double);
                var24 = var22 + (-var23 + var21);
                var25_int = var23 + (var22 - var20_int);
                var26 = var23 + (-var21 + var22);
                var27 = var23 - (-var20_int + var22);
                dl.a(var25_int, var20_int, var24, true, this.field_M[0], var21, var27, var26);
              }
            }
            if (var4 != 0 &&
              oh.field_f >= 0 &&
              -1 == this.field_n) {
              var16Lifetime2 = var14Lifetime1;
              var14Lifetime1 = var5 + (l.field_g >> 8);
              var15Lifetime2 = (this.controlledSentinel.field_Db >>> 5) + (var6 + (cf.field_q >> 8));
              if (nc.field_b) {
                var16Lifetime2 = var14Lifetime1;
              }
              stackIn_223_0 = (var16Lifetime2 >= oh.field_f) ? 0 : 1;
              var17Lifetime1 = stackIn_223_0;
              if (qg.field_n != null) {
                stackIn_230_0 = (qg.field_n.aimAngle <= 0) ? 0 : 1;
                var17Lifetime1 = stackIn_230_0;
              }
              if (var17Lifetime1 != 0) {
                SoftwareRaster.h(var14Lifetime1 + 1, 0, 640, 480);
              }
              if (var17Lifetime1 == 0 ||
                var29 != 0) {
                SoftwareRaster.h(0, 0, var14Lifetime1, 480);
              }
              if (var7 == 0) {
                fm.field_j.c(-48 + var14Lifetime1, var15Lifetime2 - 48);
              }
              SoftwareRaster.a(var13);
              if (nc.field_b &&
                var7 == 0) {
                var17Lifetime1Lifetime1 = oh.field_f - var14Lifetime1;
                var18 = pi.field_c - var15Lifetime2;
                var19_double = Math.sqrt((double)(var18 * var18 + var17Lifetime1Lifetime1 * var17Lifetime1Lifetime1));
                if (0.0 != var19_double) {
                  var21Lifetime1 = var14Lifetime1 + (int)((double)(55 * var17Lifetime1Lifetime1) / var19_double);
                  var22Lifetime1 = (int)((double)(var18 * 55) / var19_double) + var15Lifetime2;
                  var23Lifetime1 = var14Lifetime1 + (int)((double)(50 * var17Lifetime1Lifetime1) / var19_double);
                  var24Lifetime1 = var15Lifetime2 + (int)((double)(var18 * 50) / var19_double);
                  var25_intLifetime1 = var23Lifetime1 - (-var22Lifetime1 + var24Lifetime1);
                  var26Lifetime1 = var24Lifetime1 - var21Lifetime1 + var23Lifetime1;
                  var27Lifetime1 = var23Lifetime1 - var22Lifetime1 + var24Lifetime1;
                  var28 = var21Lifetime1 - var23Lifetime1 + var24Lifetime1;
                  dl.a(var26Lifetime1, var21Lifetime1, var25_intLifetime1, true, this.field_M[0], var22Lifetime1, var28, var27Lifetime1);
                }
              }
            }
            if (var3_int != 0) {
              SoftwareRaster.a(var5 << 4, var6 << 4, var8 << 4, 99, this.field_b);
            }
            regionExit2: {
              if (var4 != 0) {
                rl.field_b.d();
                SoftwareRaster.b();
                var16Lifetime3 = this.controlledSentinel.field_S;
                var17Lifetime2 = this.controlledSentinel.field_Cb ? 1 : 0;
                this.controlledSentinel.field_S = 0;
                this.controlledSentinel.field_Cb = false;
                this.controlledSentinel.b(40, 256, 80, -68);
                this.controlledSentinel.field_Cb = var17Lifetime2 != 0;
                this.controlledSentinel.field_S = var16Lifetime3;
                var10 = 0;
                rl.field_b.e(0, 0, 1);
                var18Lifetime1 = this.controlledSentinel.getTeamColour((byte) -128);
                var19 = 0;
                while (true) {
                  stackIn_258_0 = var19;
                  stackIn_258_1 = rl.field_b.field_A;
                  if (stackIn_258_0 < stackIn_258_1) {
                    stackIn_294_0 = 0;
                    if (var29 == 0) {
                      var20_intLifetime1 = stackIn_294_0;
                      while (rl.field_b.field_F > var20_intLifetime1) {
                        stackIn_258_0 = 1;
                        stackIn_258_1 = rl.field_b.field_E[var10];
                        if (stackIn_258_0 == stackIn_258_1) {
                          if (0 < var19 &&
                            0 == rl.field_b.field_E[var10 - 1]) {
                            rl.field_b.field_E[-1 + var10] = var18Lifetime1;
                          }
                          if (0 < var19 &&
                            rl.field_b.field_E[var10 - rl.field_b.field_A] == 0) {
                            rl.field_b.field_E[var10 - rl.field_b.field_A] = var18Lifetime1;
                          }
                          if (var19 > 0 &&
                            rl.field_b.field_E[1 + var10] == 0) {
                            rl.field_b.field_E[var10 + 1] = var18Lifetime1;
                          }
                          if (0 < var19 &&
                            rl.field_b.field_E[var10 + rl.field_b.field_A] == 0) {
                            rl.field_b.field_E[var10 + rl.field_b.field_A] = var18Lifetime1;
                          }
                        }
                        var10++;
                        var20_intLifetime1++;
                      }
                      var19++;
                      continue;
                    }
                  } else {
                    sb.field_bb.b((byte) 125);
                    SoftwareRaster.a(var5 - 48, var6 - 48, 48 + var5, 48 + var6);
                    var19 = -80 + (this.controlledSentinel.field_Db >>> 5);
                    rl.field_b.e(-40 + var5, var19 + var6, 128, 128);
                    stackIn_294_0 = this.d(true, this.controlledSentinel.worldX);
                  }
                  var20_intLifetime1Lifetime1 = stackIn_294_0;
                  var21Lifetime2 = this.b(param1 ^ -2, this.controlledSentinel.worldY);
                  var22Lifetime2 = -40 + var20_intLifetime1Lifetime1;
                  scanLoop3: while (true) {
                    if (var22Lifetime2 < var20_intLifetime1Lifetime1 + 40) {
                      var23Lifetime2 = this.a(1024, var22Lifetime2) >>> 4;
                      var24Lifetime2 = -this.world.terrain.getGroundHeightAt((byte) -116, var23Lifetime2);
                      var25_intLifetime2 = this.b(1, var24Lifetime2 << 4);
                      var25_intLifetime2 = var25_intLifetime2 + (var6 + var19 - (-80 + var21Lifetime2));
                      var26Lifetime2 = -var20_intLifetime1Lifetime1 + var22Lifetime2;
                      var27Lifetime2 = -var6 + var25_intLifetime2;
                      stackIn_310_0 = ~(var27Lifetime2 * var27Lifetime2 + var26Lifetime2 * var26Lifetime2);
                      stackIn_310_1 = -1601;
                      if (var29 != 0) {
                        if (stackIn_310_0 > stackIn_310_1) {
                          var23Lifetime2 = -var20_intLifetime1Lifetime1 + f.field_w[var22Lifetime2] + var5;
                          var24Lifetime2 = 80 + (var6 + (nj.field_U[var22Lifetime2] + var19)) - var21Lifetime2;
                          var25 = pe.field_o;
                          var26Lifetime2 = var5 - var23Lifetime2;
                          var27Lifetime2 = -var24Lifetime2 + var6;
                          stackIn_320_0 = 2304;
                          stackIn_320_1 = var26Lifetime2 * var26Lifetime2 + var27Lifetime2 * var27Lifetime2;
                          break regionExit2;
                        }
                        break scanLoop3;
                      }
                      if (stackIn_310_0 > stackIn_310_1) {
                        SoftwareRaster.a(-var20_intLifetime1Lifetime1 + (var5 + var22Lifetime2), var25_intLifetime2, 20560);
                      }
                      var24Lifetime2 = -this.world.terrain.getSecondaryHeightAt(false, var23Lifetime2);
                      var28Lifetime1 = this.b(1, var24Lifetime2 << 4);
                      var28Lifetime1 = var28Lifetime1 + (-var21Lifetime2 + (var19 + var6) + 80);
                      if (~var25_intLifetime2 != ~var28Lifetime1) {
                        var27Lifetime2 = var28Lifetime1 - var6;
                        var26Lifetime2 = -var20_intLifetime1Lifetime1 + var22Lifetime2;
                        if (var27Lifetime2 * var27Lifetime2 + var26Lifetime2 * var26Lifetime2 < 2304) {
                          SoftwareRaster.a(-var20_intLifetime1Lifetime1 + (var22Lifetime2 + var5), var28Lifetime1, 20560);
                        }
                      }
                      var22Lifetime2++;
                      continue;
                    }
                    this.a(var20_intLifetime1Lifetime1, var19 + (var6 + 80), (byte) -63, var5, var21Lifetime2, var6);
                    var22Lifetime2 = 0;
                    while (true) {
                      stackIn_310_0Lifetime1 = ~var22Lifetime2;
                      stackIn_310_1Lifetime1 = ~BattleTerrain.field_a;
                      if (stackIn_310_0Lifetime1 <= stackIn_310_1Lifetime1) {
                        break;
                      }
                      var23Lifetime2Lifetime1 = -var20_intLifetime1Lifetime1 + f.field_w[var22Lifetime2] + var5;
                      var24Lifetime2Lifetime1 = 80 + (var6 + (nj.field_U[var22Lifetime2] + var19)) - var21Lifetime2;
                      var25Lifetime1 = pe.field_o;
                      var26Lifetime2Lifetime1 = var5 - var23Lifetime2Lifetime1;
                      var27Lifetime2Lifetime1 = -var24Lifetime2Lifetime1 + var6;
                      stackIn_320_0 = 2304;
                      stackIn_320_1 = var26Lifetime2Lifetime1 * var26Lifetime2Lifetime1 + var27Lifetime2Lifetime1 * var27Lifetime2Lifetime1;
                      if (var29 != 0) {
                        break regionExit2;
                      }
                      if (stackIn_320_0 > stackIn_320_1) {
                        SoftwareRaster.a(var23Lifetime2Lifetime1 << 4, var24Lifetime2Lifetime1 << 4, 20, -1 + var25Lifetime1.length, var25Lifetime1);
                      }
                      var22Lifetime2++;
                    }
                    break;
                  }
                  SoftwareRaster.c();
                  break;
                }
              }
              stackIn_320_0 = 0;
              stackIn_320_1 = rc.field_l;
            }
            if (stackIn_320_0 >= stackIn_320_1) {
              return;
            }
            if (this.controlledSentinel.field_Xb.length <= 0) {
              return;
            }
            if (3 == di.field_g &&
              qh.field_Yb < 5) {
              return;
            }
            var16Lifetime4 = var5;
            var17Lifetime3 = -26 + var6;
            var18Lifetime2 = 100 - rc.field_l;
            SoftwareRaster.a(0, -50 + var17Lifetime3, 640, var17Lifetime3);
            var17Lifetime3 = var17Lifetime3 + (-(10 * var18Lifetime2 / 20) + 5);
            var19Lifetime1 = -(256 * var18Lifetime2 / 100) + 256;
            var20 = li.field_B[this.controlledSentinel.field_Xb[this.field_F]];
            fk.field_d.c(var20, var16Lifetime4, var17Lifetime3, 16777215, 0, var19Lifetime1);
            SoftwareRaster.c();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        String var1 = null;
        if (param0 < 104) {
          return;
        }
        try {
          if (im.field_g != null) {
            var1 = im.field_g;
            vf.a(320, db.a(jj.field_b, -94, new String[]{var1}));
            im.field_g = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nb.DA(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        int stackIn_59_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_83_4 = 0;
        int stackIn_118_0;
        int stackIn_118_1;
        int stackIn_118_2;
        int stackIn_118_3;
        int stackIn_119_4 = 0;
        RuntimeException decompiledCaughtException = null;
        Projectile var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var13Lifetime1;
        int var14Lifetime1;
        var21 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameRemainder0 = true;
          hf.field_c = 0;
          if (this.controlledSentinel != null &&
            this.field_F >= 0 &&
            this.field_F < this.controlledSentinel.field_Xb.length &&
            c.a((byte) -118, this.controlledSentinel.field_Xb[this.field_F])) {
            if (this.controlledSentinel.field_ub >= 0) {
              if (0 == this.controlledSentinel.charge &&
                0 == this.controlledSentinel.field_ub) {
                return;
              }
              if (((this.controlledSentinel.field_Xb[this.field_F] == 8)) &&
                (this.controlledSentinel.charge < 1)) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              return;
            }
          }
          if (!this.world.field_j) {
            if (oh.field_f < 0 &&
              0 > pi.field_c) {
              return;
            }
            if (di.field_g == 0 &&
              qh.field_Yb < 8) {
              return;
            }
            if (di.field_g == 3 &&
              qh.field_Yb < 5) {
              return;
            }
            var2 = (Projectile) (pm.field_db.first(13058));
            var2.field_I = true;
            var3 = this.d(true, var2.worldX);
            if (param0 >= -75) {
              this.c(73, false);
            }
            var4 = this.b(1, var2.worldY);
            var5 = var2.worldX;
            var6 = var2.worldY;
            this.field_D[0] = var5;
            this.field_K[0] = var6;
            if (var2.effectType != 0 &&
              var2.effectType != 7) {
              stackIn_59_0 = 0;
            } else {
              stackIn_59_0 = 1;
            }
            var7 = stackIn_59_0;
            if (null != this.controlledSentinel &&
              !this.controlledSentinel.hasModuleType(21, -27) &&
              var7 == 0) {
              stackIn_69_0 = 1;
            } else {
              stackIn_69_0 = 0;
            }
            var8 = stackIn_69_0;
            if (var2.sourceWeaponType != 14 &&
              var2.sourceWeaponType != 28) {
              stackIn_76_0 = 0;
            } else {
              stackIn_76_0 = 1;
            }
            var9 = stackIn_76_0;
            var10 = 0;
            scanLoop1: while (true) {
              if (this.field_S > var10 &&
                !var2.field_T) {
                var2.advanceProjectile(-1);
                var11 = this.d(true, var2.worldX);
                var12 = this.b(1, var2.worldY);
                stackIn_82_0 = var3;
                stackIn_82_1 = var4;
                stackIn_82_2 = var11;
                stackIn_82_3 = var12;
                if (var9 != 0) {
                  stackIn_83_4 = 16744576;
                } else {
                  stackIn_83_4 = 16777215;
                }
                SoftwareRaster.a(stackIn_82_0, stackIn_82_1, stackIn_82_2, stackIn_82_3, stackIn_83_4, 128);
                if ((var10 + 1) < this.field_S) {
                  this.field_D[var10 + 1] = var2.worldX;
                  this.field_K[1 + var10] = var2.worldY;
                  hf.field_c = var10 + 1;
                }
                if (var8 != 0) {
                  var13 = Math.abs(-this.controlledSentinel.worldX + var2.worldX) >> 4;
                  var14 = Math.abs(var2.worldY - this.controlledSentinel.worldY) >> 4;
                  var13 = var13 * var13;
                  var14 = var14 * var14;
                  if (var13 + var14 >= 10240000 &&
                    var21 == 0) {
                    break scanLoop1;
                  }
                }
                if (var8 == 0 &&
                  var7 != 0 &&
                  var2.field_hb <= var2.ageTicks ||
                  var9 != 0 &&
                  !(20 > var2.ageTicks)) {
                  var13Lifetime1 = var2.worldX - var5;
                  var14Lifetime1 = -var6 + var2.worldY;
                  if (var13Lifetime1 == 0 &&
                    var14Lifetime1 == 0) {
                    break scanLoop1;
                  }
                  var15 = 6.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var14Lifetime1 * var14Lifetime1));
                  var13Lifetime1 = (int)((double)var13Lifetime1 * var15);
                  var14Lifetime1 = (int)(var15 * (double)var14Lifetime1);
                  var17 = var11 + var14Lifetime1;
                  var18 = var12 - var13Lifetime1;
                  var19 = var11 - var14Lifetime1;
                  var20 = var13Lifetime1 + var12;
                  stackIn_118_0 = var17;
                  stackIn_118_1 = var18;
                  stackIn_118_2 = var19;
                  stackIn_118_3 = var20;
                  if (var9 == 0) {
                    stackIn_119_4 = 16777215;
                  } else {
                    stackIn_119_4 = 16744576;
                  }
                  SoftwareRaster.b(stackIn_118_0, stackIn_118_1, stackIn_118_2, stackIn_118_3, stackIn_119_4, 128);
                  var9 = 0;
                  if (var7 != 0) {
                    break scanLoop1;
                  }
                }
                var6 = var2.worldY;
                var4 = var12;
                var3 = var11;
                var5 = var2.worldX;
                var10++;
                if (var21 == 0) {
                  continue;
                }
              }
              break;
            }
            pm.field_db.clear(6);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.BB(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, boolean param3) {
        boolean stackIn_118_0 = false;
        bh stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_180_2 = 0;
        int stackIn_190_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_251_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_117_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        Sentinel var6_ref_mb = null;
        int var6 = 0;
        bh var7_ref_bh = null;
        int var7 = 0;
        bh var8 = null;
        Sentinel var8_ref = null;
        ne var8_ref2 = null;
        ParticleEffect var8_ref3 = null;
        Explosion var8_ref4 = null;
        Projectile var8_ref5 = null;
        int var9_int = 0;
        bh var9 = null;
        SentinelCommand var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        SentinelCommand var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Sentinel var8_refLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        try {
          this.field_u = null;
          var5_int = 0;
          boolean decompiledSharedTail0 = (this.controlledSentinel == null ||
            !(param2) ||
            this.controlledSentinel.field_Hb || ((0 <= this.controlledSentinel.field_Qb) &&
            this.controlledSentinel.field_pc));
          if (!decompiledSharedTail0) {
            var6_ref_mb = this.controlledSentinel;
            var7_ref_bh = new bh(var6_ref_mb);
            var8 = new bh(var6_ref_mb);
            BattleTerrain.field_a = 0;
            var7_ref_bh.field_k = 0;
            var9_int = 100;
            var10 = 0;
            var11 = this.world.simulationTick + 1;
            scanLoop1: while (true) {
              if (var11 < (500 + this.world.simulationTick)) {
                var12 = var7_ref_bh.a(qg.field_n, true, var11);
                var8.a((SentinelCommand) null, true, var11);
                if (var16 == 0) {
                  boolean decompiledFrameRemainder1 = true;
                  if (null != var12 &&
                    var12.actionType == 0 &&
                    !pm.field_db.f(7) && ((!(this.controlledSentinel.field_ub < 0) ||
                    !c.a((byte) -95, this.controlledSentinel.field_Xb[this.field_F])) &&
                    (!(this.controlledSentinel.charge < 1) ||
                    this.controlledSentinel.field_Xb[this.field_F] != 8))) {
                    var10 = 1;
                    this.e((byte) -104);
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (null != var12) {
                      hf.field_c = 0;
                    }
                  }
                  boolean decompiledFrameRemainder2 = true;
                  var13 = -(this.field_P >> 4);
                  var14 = -(this.field_E >> 4) + 400;
                  if ((var11 % var9_int != 0 &&
                    0 > var7_ref_bh.field_k) &&
                    (decompiledFrameRemainder2 = (var12 != null)) &&
                    (decompiledFrameRemainder2 = (qg.field_n == var12))) {
                    decompiledFrameRemainder2 = (var11 == var12.startTick);
                  }
                  if (decompiledFrameRemainder2) {
                    var15 = 0;
                    if (null != qg.field_n &&
                      qg.field_n.startTick <= var11) {
                      var15 = 1;
                    }
                    if (var15 != 1) {
                      if ((null != qg.field_n)) {
                        var7_ref_bh.a((byte) -106, 35, var13, var15, true, var14);
                      }
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      if (0 <= this.controlledSentinel.field_ub &&
                        var7_ref_bh.field_j && (qg.field_n.actionType == 3 ||
                        4 == qg.field_n.actionType)) {
                        var7_ref_bh.a((byte) -69, 35, var13, 0, true, var14);
                        var5_int = 1;
                      }
                      if (qg.field_n == var12 &&
                        var11 == qg.field_n.startTick) {
                        var8.a((byte) -61, 35, var13, 0, true, var14);
                      }
                    }
                  }
                  if (null != var12) {
                    var8.a(var14, var12, 256, -1, var13);
                  }
                  if (var12 == qg.field_n &&
                    null != qg.field_n) {
                    bj.field_h = var7_ref_bh.field_b;
                    km.field_c = var7_ref_bh.field_g;
                    PacketBuffer.field_r = var7_ref_bh.field_r;
                    dl.field_G = var7_ref_bh.field_q;
                  }
                  var11++;
                  continue;
                }
              } else {
                if (var10 != 0) {
                  break scanLoop1;
                }
              }
              hf.field_c = 0;
              break;
            }
            decompiledSharedTail0 = (var16 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.controlledSentinel != null)) {
            dl.field_G = this.controlledSentinel.worldY;
            PacketBuffer.field_r = this.controlledSentinel.field_pc;
            bj.field_h = this.controlledSentinel.field_E;
            km.field_c = this.controlledSentinel.worldX;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          regionExit2: {
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted3 = true;
            var6 = -(this.field_P >> 4);
            var7 = -(this.field_E >> 4) + 400;
            if (param1) {
              var8_ref = (Sentinel) (this.world.sentinels.first(13058));
              while (var8_ref != null) {
                stackOut_117_0 = var8_ref.a((byte) -22, var6, oh.field_f, pi.field_c, var7);
                stackIn_190_0 = stackOut_117_0 ? 1 : 0;
                stackIn_118_0 = stackOut_117_0;
                if (var16 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
                if (stackIn_118_0 && (this.controlledSentinel == null ||
                  ~this.controlledSentinel.teamId != ~var8_ref.teamId)) {
                  this.field_u = var8_ref;
                }
                if (this.controlledSentinel != null &&
                  this.controlledSentinel.field_Vb == var8_ref) {
                  this.controlledSentinel.a(var6, 256, 23859, var7);
                }
                if (null != this.controlledSentinel &&
                  !this.world.field_j &&
                  this.controlledSentinel.hasModuleType(21, -27) &&
                  !var8_ref.i(81) && (this.controlledSentinel != var8_ref ||
                  var5_int == 0) && (var8_ref.chassis.componentId != 109 &&
                  !var8_ref.field_pc &&
                  !var8_ref.field_Hb)) {
                  var9 = new bh(var8_ref);
                  if (var8_ref != this.controlledSentinel) {
                    var9.field_n = var8_ref.getTeamColour((byte) 110);
                  }
                  var10Lifetime1 = 100;
                  var9.field_k = 0;
                  var11Lifetime1 = 1 + this.world.simulationTick;
                  while (!(var11Lifetime1 >= this.world.simulationTick + 90)) {
                    var9.a((SentinelCommand) null, true, var11Lifetime1);
                    stackIn_190_0 = var11Lifetime1 % var10Lifetime1;
                    if (stackIn_190_0 == 0 ||
                      !(0 > var9.field_k)) {
                      stackIn_179_0 = var9;
                      stackIn_179_1 = -39;
                      if (var11Lifetime1 >= (this.world.simulationTick + 70)) {
                        stackIn_180_2 = 25;
                      } else {
                        stackIn_180_2 = 35;
                      }
                      ((bh) (Object) stackIn_179_0).a((byte) stackIn_179_1, stackIn_180_2, var6, 2, true, var7);
                    }
                    var11Lifetime1++;
                  }
                }
                var8_ref = (Sentinel) (this.world.sentinels.next((byte) -57));
              }
              if (decompiledFrameCompleted3) {
                var8_ref2 = (ne) (this.world.field_e.first(13058));
                while (null != var8_ref2) {
                  var8_ref2.a(256, var7, -1, var6);
                  var8_ref2 = (ne) (this.world.field_e.next((byte) -72));
                  if (var16 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                }
              }
            }
            if ((decompiledFrameCompleted3) &&
              (decompiledFrameCompleted2)) {
              stackIn_190_0 = param3 ? 1 : 0;
            }
            if ((decompiledFrameCompleted2) &&
              (stackIn_190_0 == 0)) {
              break regionExit2;
            }
            var8_ref3 = (ParticleEffect) (this.world.field_o.first(13058));
            while (true) {
              if (var8_ref3 != null) {
                var8_ref3.a(var6, var7, true, (byte) -119);
                var8_ref3 = (ParticleEffect) (this.world.field_o.next((byte) -8));
                if (var16 == 0) {
                  continue;
                }
              } else {
                var8_ref4 = (Explosion) (this.world.field_C.first(13058));
                while (var8_ref4 != null) {
                  var8_ref4.a(var7, var6, 116);
                  var8_ref4 = (Explosion) (this.world.field_C.next((byte) -82));
                  if (var16 != 0) {
                    break regionExit2;
                  }
                }
                var8_ref5 = (Projectile) (this.world.field_db.first(13058));
                while (null != var8_ref5) {
                  var8_ref5.a(var7, var6, 4);
                  var8_ref5 = (Projectile) (this.world.field_db.next((byte) -55));
                  if (var16 != 0) {
                    break regionExit2;
                  }
                }
                var8_ref3 = (ParticleEffect) (this.world.field_o.first(13058));
              }
              break;
            }
            while (null != var8_ref3) {
              var8_ref3.a(var6, var7, false, (byte) -107);
              var8_ref3 = (ParticleEffect) (this.world.field_o.next((byte) -61));
              if (var16 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (this.world.field_b >= 50)) {
            SoftwareRaster.c(0, 0, 640, 400, 16777215, 255 * (-this.world.field_b + 550) / 500);
            decompiledFrameRemainder0 = (var16 != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (this.world.field_b > 0)) {
            SoftwareRaster.c(0, 0, 640, 400, 16777215, this.world.field_b * 5);
          }
          boolean decompiledFrameCompleted0 = true;
          if (param1 &&
            null != this.controlledSentinel &&
            !NodeIterator.a(2)) {
            var8_refLifetime1 = this.controlledSentinel;
            this.field_P = Math.min(this.field_P, this.world.terrain.getProfileLength(99) - 10240);
            this.field_P = Math.max(this.field_P, 0);
            if (!fc.field_e[81] &&
              null != qg.field_n &&
              this.controlledSentinel.field_Xb.length > 0) {
              var8_refLifetime1.chassis.a(qg.field_n.aimAngle * bj.field_h, -126, var8_refLifetime1.field_Xb[this.field_F]);
            }
            var9_ref = (SentinelCommand) (var8_refLifetime1.pendingCommands.b(1063677678));
            while (var9_ref != null) {
              stackIn_251_0 = -1;
              stackIn_251_1 = ~var9_ref.actionType;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_251_0 == stackIn_251_1) {
                qi.field_k = true;
                var8_refLifetime1.chassis.a(var9_ref.aimAngle * this.controlledSentinel.field_E, -117, var9_ref.actionVariant);
              }
              var9_ref = (SentinelCommand) (var8_refLifetime1.pendingCommands.a(-2137));
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_251_0 = param0;
            stackIn_251_1 = -78;
          }
          if (stackIn_251_0 >= stackIn_251_1) {
            field_x = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "nb.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.c(false);
          PartInstruction.field_g = 500;
          var2_int = ol.field_Ub + 10 * ge.field_j;
          this.controlledSentinel.configureDesign(ua.field_C[var2_int], true, false, 0, 0);
          this.world.field_N = this.world.field_N + 100000 * this.controlledSentinel.maximumCharge;
          this.world.field_q = this.world.field_q + this.controlledSentinel.maximumArmour * 60000;
          this.world.field_M = ua.field_t[var2_int][3];
          var3 = ua.field_t[var2_int][2];
          this.controlledSentinel.field_Qb = 170;
          this.controlledSentinel.worldX = var3 << 4;
          this.controlledSentinel.velocityY = 1000;
          this.controlledSentinel.velocityX = 0;
          this.controlledSentinel.worldY = -120000;
          var4 = -93 % ((-52 - param0) / 35);
          this.controlledSentinel.field_U = 0;
          if (ge.field_j == 0) {
            var5 = vc.a((byte) 32);
            if (var5 >= 0) {
              this.controlledSentinel.worldX = var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "nb.OA(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (!this.field_d) {
            if (!ni.b(112)) {
              if (null != lc.field_c) {
                var3_int = param1 ? 1 : 0;
                q.a(5, var3_int != 0, -1, 0);
                if (var4 != 0) {
                  var3_int = param1 ? 1 : 0;
                  q.a(0, var3_int != 0, -1, 0);
                  var3_int = param1 ? 1 : 0;
                  q.a(0, var3_int != 0, -1, 0);
                }
              } else {
                var3_int = param1 ? 1 : 0;
                q.a(0, var3_int != 0, -1, 0);
                if (var4 != 0) {
                  var3_int = param1 ? 1 : 0;
                  q.a(0, var3_int != 0, -1, 0);
                }
              }
            } else {
              var3_int = param1 ? 1 : 0;
              q.a(0, var3_int != 0, -1, 0);
            }
          }
          var3_intLifetime1 = -98 % ((param0 + 53) / 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.U(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 123) {
            field_G = -18L;
          }
          if (!this.field_d) {
            throw new IllegalStateException();
          }
          mm.field_g.writeCipheredOpcode(60, (byte) -117);
          this.controlledSentinel = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.KA(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_1 = 0;
        u stackIn_80_0 = null;
        String stackIn_81_1 = null;
        u stackIn_100_0 = null;
        String stackIn_101_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var21Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var19Lifetime1;
        int var20Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        var24 = SteelSentinels.obfuscationControl;
        try {
          stackIn_5_0 = (nc.field_a < 0) ? 0 : 1;
          var2_int = stackIn_5_0;
          stackIn_9_0 = (ge.field_j != 0) ? 0 : 1;
          var3 = stackIn_9_0;
          stackIn_13_0 = (ni.b(117)) ? 0 : 1;
          var4 = stackIn_13_0;
          if (var4 == 0 &&
            0 == ge.field_j &&
            ol.field_Ub == 9) {
            stackIn_23_0 = 1;
          } else {
            stackIn_23_0 = 0;
          }
          var5 = stackIn_23_0;
          var6 = ql.a(ce.field_t, 18286) ? 1 : 0;
          if (null != ad.field_i) {
            stackIn_27_0 = ad.field_i.length;
          } else {
            stackIn_27_0 = 0;
          }
          if (null == vk.field_g) {
            stackIn_31_1 = 0;
          } else {
            stackIn_31_1 = vk.field_g.length;
          }
          var7 = Math.max(stackIn_27_0, stackIn_31_1);
          var8 = 14;
          var9 = 3;
          var10 = 26;
          var11 = 200;
          var12 = 3 + pl.field_U.field_U;
          var13 = 0;
          var14 = 1;
          if (var5 != 0) {
            var13 = pl.field_U.a(mg.field_Zb, 560, var12);
            var14 += 2;
            var8 = var8 + (var10 + var13);
          }
          if ((var5 == 0 ||
            var24 != 0) &&
            var4 == 0) {
            var13 = pl.field_U.a(id.field_Tb, 560, var12);
            var14 += 2;
            var8 = var8 + (var13 + var10);
          }
          if (var6 != 0) {
            var8 += 32;
            var14++;
          }
          if (var7 > 0) {
            var14 += 3;
            var8 = var8 + (var12 * var7 + (var12 + var12));
          }
          if (var2_int == 0 ||
            var5 == 0) {
            var8 = var8 + var10;
            var14++;
          }
          if (110 > var9 * var14 + var8) {
            var9 = (110 - var8) / var14;
          }
          var8 = var8 + var14 * var9;
          var15 = 480 - var8;
          ch.a(var15, 640, 32308, 0, var8);
          SoftwareRaster.g(3, 3 + var15, 634, var8 - 3 - 3, 8, 0);
          var16 = 473;
          var17 = 0;
          if (var5 != 0) {
            var16 = var16 - var10;
            var17Lifetime1 = (-20 + (640 - 2 * var11)) / 2;
            if (nm.a(var16, var17Lifetime1, 122, rn.field_B, var10, var11)) {
              this.field_r = 32;
            }
            var17Lifetime1 = var17Lifetime1 + (20 + var11);
            if (nm.a(var16, var17Lifetime1, 125, cf.field_v, var10, var11)) {
              this.field_r = 31;
            }
            var16 = var16 - var9;
            var16 = var16 - var13;
            pl.field_U.a(mg.field_Zb, 40, var16, 560, var13, 16777215, -1, 1, 0, var12);
            var16 = var16 - var9;
          }
          if ((var5 == 0 ||
            var24 != 0) &&
            var4 == 0) {
            var16 = var16 - var10;
            var17Lifetime2 = (640 - var11) / 2;
            if (nm.a(var16, var17Lifetime2, 123, cf.field_v, var10, var11)) {
              this.field_r = 31;
            }
            var16 = var16 - var9;
            var16 = var16 - var13;
            pl.field_U.a(id.field_Tb, 40, var16, 560, var13, 16777215, -1, 1, 0, var12);
            var16 = var16 - var9;
          }
          var18 = -1;
          if (var6 != 0) {
            var16 -= 32;
            var18 = var16;
            var16 = var16 - var9;
          }
          boolean decompiledFrameCompleted0 = true;
          if (var7 > 0) {
            var16 = var16 - (var9 + (var12 + var9 + var7 * var12));
            stackIn_80_0 = pl.field_U;
            if (ge.field_j == 0) {
              stackIn_81_1 = na.field_c;
            } else {
              stackIn_81_1 = ej.field_s;
            }
            boolean decompiledFrameCompleted1 = true;
            ((u) (Object) stackIn_80_0).b(stackIn_81_1, 20, var16, 16777215, -1);
            var19 = var9 + (var12 + var16);
            var17Lifetime3 = 20;
            if (ad.field_i.length > 0) {
              var20 = var19;
              pl.field_U.b(qg.field_l, var17Lifetime3, var20, 10526880, 0);
              var20 += 4;
              var17Lifetime3 += 8;
              var21 = ad.field_i;
              var22 = 0;
              while (var21.length > var22) {
                var23 = var21[var22];
                var20 = var20 + var12;
                pl.field_U.b(t.field_e[var23], var17Lifetime3, var20, 1021128, 0);
                var22++;
                if (var24 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var17Lifetime3 += 180;
              }
            }
            if (0 < vk.field_g.length) {
              var20Lifetime1 = var19;
              pl.field_U.b(wa.field_o, var17Lifetime3, var20Lifetime1, 10526880, 0);
              var20Lifetime1 += 4;
              var17Lifetime3 += 8;
              var21Lifetime1 = vk.field_g;
              var22Lifetime1 = 0;
              while (var22Lifetime1 < var21Lifetime1.length) {
                var23Lifetime1 = var21Lifetime1[var22Lifetime1];
                var20Lifetime1 = var20Lifetime1 + var12;
                if (var24 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_100_0 = pl.field_U;
                if (var23Lifetime1 != 34) {
                  stackIn_101_1 = rj.field_m[var23Lifetime1];
                } else {
                  stackIn_101_1 = "GODULE";
                }
                ((u) (Object) stackIn_100_0).b(stackIn_101_1, var17Lifetime3, var20Lifetime1, 1021128, 0);
                var22Lifetime1++;
              }
            }
            if (decompiledFrameCompleted0) {
              var16 = var16 - (var9 + var12);
            }
          }
          if (decompiledFrameCompleted0) {
            var16 = var16 - (var9 + var10);
            var19Lifetime1 = 60 / ((param0 - 80) / 38);
          }
          if (var5 == 0) {
            if (var2_int != 0) {
              var17Lifetime4 = (-var11 + 640) / 2;
              if (nm.a(var16, var17Lifetime4, 120, bf.field_Db, var10, var11)) {
                this.field_r = 5;
              }
              var16 = var16 - var9;
            }
            if (var2_int == 0 ||
              var24 != 0) {
              if (var3 != 0) {
                var17Lifetime4 = (620 - var11 - var11) / 2;
                if (nm.a(var16, var17Lifetime4, 123, r.field_o, var10, var11)) {
                  this.field_r = 40;
                }
                var17Lifetime4 = var17Lifetime4 + (var11 + 20);
                if (nm.a(var16, var17Lifetime4, 124, f.field_z, var10, var11)) {
                  this.field_r = 39;
                }
                var16 = var16 - var9;
              }
              if (var3 == 0 ||
                var24 != 0) {
                var17Lifetime4 = (-var11 + 640) / 2;
                if (nm.a(var16, var17Lifetime4, 120, bf.field_Db, var10, var11)) {
                  this.field_r = 5;
                }
                var16 = var16 - var9;
                if (var24 != 0) {
                  if (var2_int == 0) {
                    var17Lifetime4 = (640 - var11) / 2;
                    if (nm.a(var16, var17Lifetime4, 119, r.field_o, var10, var11)) {
                      this.field_r = 40;
                    }
                  }
                  var16 = var16 - var9;
                }
              }}} else {
            if (var2_int == 0) {
              var17Lifetime4 = (640 - var11) / 2;
              if (nm.a(var16, var17Lifetime4, 119, r.field_o, var10, var11)) {
                this.field_r = 40;
              }
            }
            var16 = var16 - var9;
          }
          if (var6 != 0) {
            discarded$0 = this.e(true, var18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.WA(" + param0 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        int dupTemp$0 = 0;
        int stackIn_22_0 = 0;
        ArticulatedPart stackIn_622_0 = null;
        int stackIn_661_0 = 0;
        int stackIn_661_1 = 0;
        Object stackIn_801_0 = null;
        int stackIn_869_0 = 0;
        int stackIn_872_0 = 0;
        int stackIn_873_1 = 0;
        SentinelCommand stackIn_894_0 = null;
        int stackIn_895_1 = 0;
        int stackIn_1080_0 = 0;
        int stackIn_1149_0 = 0;
        boolean stackIn_1455_1 = false;
        boolean stackIn_1459_1 = false;
        int stackIn_1508_0 = 0;
        RgbSprite[] stackIn_1512_0 = null;
        boolean stackIn_1535_0 = false;
        boolean stackIn_1550_1 = false;
        boolean stackIn_1554_1 = false;
        int stackIn_1638_0 = 0;
        int stackIn_1645_0 = 0;
        int stackIn_1702_1 = 0;
        int stackIn_1702_2 = 0;
        int stackIn_1705_3 = 0;
        boolean stackIn_1734_0 = false;
        boolean stackIn_1761_0 = false;
        String[] stackIn_1764_0 = null;
        int stackIn_1764_1 = 0;
        String stackIn_1765_2 = null;
        boolean stackIn_1778_0 = false;
        String[] stackIn_1781_0 = null;
        int stackIn_1781_1 = 0;
        String stackIn_1782_2 = null;
        boolean stackIn_1796_0 = false;
        String[] stackIn_1799_0 = null;
        int stackIn_1799_1 = 0;
        String stackIn_1800_2 = null;
        int stackIn_2059_0 = 0;
        RgbSprite[] stackIn_2063_0 = null;
        boolean stackIn_2086_0 = false;
        RuntimeException decompiledCaughtException = null;
        ArticulatedPart stackOut_621_0;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        Object var4_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        Sentinel var7_ref_mb = null;
        NodeIterator var7_ref_jc = null;
        ArticulatedPart[] var7_ref_nk__ = null;
        Sentinel var8_ref_mb = null;
        int var8 = 0;
        Sentinel var9_ref_mb = null;
        int var9 = 0;
        Projectile var9_ref_wl = null;
        ArticulatedPart var9_ref_nk = null;
        SentinelCommand var9_ref_je = null;
        int var10 = 0;
        SentinelCommand var10_ref_je = null;
        int var11 = 0;
        SentinelCommand var11_ref_je = null;
        int var12_int = 0;
        RgbSprite[] var12 = null;
        double var13_double = 0.0;
        int var13 = 0;
        int var14 = 0;
        ArticulatedPart[] var15_ref_nk__ = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = SteelSentinels.obfuscationControl;
        try {
          if (!this.world.field_p &&
            wc.field_a &&
            0 <= this.world.field_A &&
            -2 != ed.field_j) {
            wc.field_a = false;
            var3_int = Math.min(2, Math.max(0, this.world.computerPlayerCount));
            var4_ref = null;
            if (1 == var3_int) {
              var4_ref_String = this.world.d(-1661904765, this.world.playerCount);
            } else {
              if (var3_int == 2) {
                var4_ref_String = this.world.d(-1661904765, this.world.playerCount + (1 & this.world.simulationTick));
              } else {
                var4_ref_String = this.world.d(-1661904765, this.world.field_A);
              }
            }
            var4_ref_String = var4_ref_String + ": " + rh.field_t[var3_int];
            stackIn_22_0 = (0 < var3_int) ? 48127 : 16776960;
            bl.a(stackIn_22_0, var4_ref_String, (byte) 34);
            bc.a(var4_ref_String, this.world, (byte) 100);
          }
          if (this.world.field_p &&
            !wc.field_a &&
            ed.field_j != -2) {
            wc.field_a = true;
            var3 = si.field_H[this.world.simulationTick % si.field_H.length];
            var3 = dc.field_a + ": " + var3;
            bl.a(16776960, var3, (byte) -50);
            bc.a(var3, this.world, (byte) 100);
          }
          boolean decompiledFrameRemainder12 = true;
          if (di.field_g == -1) {
            if (!uj.field_f) {
              if (this.world.field_P == 0 ||
                this.world.field_lb) {
                this.j(53);
                decompiledFrameRemainder12 = (var18 != 0);
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder12 = (this.world.field_P == 1))) {
                this.f(30483);
                decompiledFrameRemainder12 = (var18 != 0);
              }
            }
            if (decompiledFrameRemainder12) {
              if (this.world.field_P == 0 ||
                this.world.field_lb) {
                this.b(true);
                if ((var18 != 0) &&
                  (this.world.field_P == 1)) {
                  this.l(-21714);
                }
              } else {
                if (this.world.field_P == 1) {
                  this.l(-21714);
                }
              }
            }
          }
          if (sh.field_d >= 0 &&
            bh.a(true)) {
            sh.field_d = sh.field_d + 1;
          }
          if (this.world.field_j &&
            q.field_h > 0) {
            q.field_h = q.field_h - 1;
          }
          if (PartInstruction.field_g > 0) {
            PartInstruction.field_g = PartInstruction.field_g - 1;
          }
          if (this.world.field_j &&
            this.field_W == null) {
            this.h((byte) -69);
          }
          if (-1 != this.field_t &&
            lb.field_gc == 1 &&
            !this.world.field_j) {
            this.field_F = this.field_t;
            this.field_t = -1;
            rc.field_l = 100;
          }
          if (0 < rc.field_l) {
            rc.field_l = rc.field_l - 1;
          }
          boolean decompiledSharedTail4 = (!(hb.field_f) ||
            !(150 > SentinelCommand.field_o));
          if (!decompiledSharedTail4) {
            SentinelCommand.field_o = SentinelCommand.field_o + 2;
            decompiledSharedTail4 = (var18 != 0);
          }
          if ((decompiledSharedTail4) && (!hb.field_f &&
            SentinelCommand.field_o > 0)) {
            SentinelCommand.field_o = SentinelCommand.field_o - 1;
          }
          if (-1 != g.field_h) {
            pd.field_X = pd.field_X + 1;
            if (250 < pd.field_X) {
              g.field_h = -1;
            }
          }
          if (!pm.field_db.f(7) &&
            ~rc.field_g != ~this.field_F) {
            pm.field_db.clear(6);
          }
          rc.field_g = this.field_F;
          if (null != pm.field_db &&
            pm.field_db.f(7) &&
            null != this.controlledSentinel &&
            !this.controlledSentinel.field_pc) {
            sn.field_n = true;
          }
          if (this.field_r != -1 &&
            26 != this.field_r &&
            this.field_r != 0 &&
            this.field_r != 28 &&
            this.field_r != this.field_n) {
            CombatWorld.c(-2483, 97);
          }
          if (ue.field_b) {
            if (this.field_U > this.field_Y) {
              this.field_Y = this.field_Y + 10;
              if (this.field_U < this.field_Y) {
                this.field_Y = this.field_U;
                if (var18 != 0 &&
                  this.field_Y > 0) {
                  this.field_Y = this.field_Y - 10;
                  if (0 > this.field_Y) {
                    this.field_Y = 0;
                  }
                }
              }
            }
          } else {
            if (this.field_Y > 0) {
              this.field_Y = this.field_Y - 10;
              if (0 > this.field_Y) {
                this.field_Y = 0;
              }
            }
          }
          this.field_n = this.field_r;
          if (fn.field_a) {
            if (this.field_s > this.field_v) {
              this.field_v = this.field_v + 10;
              if (this.field_s < this.field_v) {
                this.field_v = this.field_s;
                if (var18 != 0 &&
                  0 < this.field_v) {
                  this.field_v = this.field_v - 10;
                  if (this.field_v < 0) {
                    this.field_v = 0;
                  }
                }
              }
            }
          } else {
            if (0 < this.field_v) {
              this.field_v = this.field_v - 10;
              if (this.field_v < 0) {
                this.field_v = 0;
              }
            }
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= 6))) {
            if (var18 == 0) {
              if (ke.field_b[var3_int] != null) {
                if (var3_int > 2 &&
                  hh.field_c[var3_int] > 0) {
                  hh.field_c[var3_int] = 0;
                }
                dupTemp$0 = hh.field_c[var3_int] - 1;
                hh.field_c[var3_int] = dupTemp$0;
                if (dupTemp$0 < -50) {
                  ke.field_b[var3_int] = null;
                }
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var3_int = 1;
          }
          if (bb.field_T) {
            var3_int = 0;
          }
          if (vl.field_v &&
            qc.field_V.field_cb <= pi.field_c) {
            var3_int = 0;
          }
          if (this.field_r == 0) {
            var3_int = 0;
          }
          if (var3_int == 0) {
            hf.field_c = 0;
          }
          if (di.field_g != -1 &&
            4 != di.field_g &&
            di.field_g != 10 &&
            ~qh.field_Yb != ~dl.field_M) {
            param1 = false;
          }
          if (null != this.controlledSentinel &&
            this.controlledSentinel.field_pc) {
            hf.field_c = 0;
          }
          if (this.controlledSentinel != null) {
            if (!this.controlledSentinel.field_pc) {
              if (0 < this.controlledSentinel.field_Q) {
                if (!this.field_A &&
                  0 >= this.controlledSentinel.field_S) {
                  this.field_A = true;
                  fc.a((byte) 78, 83, -1);
                }
                if (this.field_A &&
                  this.controlledSentinel.field_S > (this.controlledSentinel.field_Q / 10)) {
                  this.field_A = false;
                  fc.a((byte) -94, 29, -1);
                }
              }
              if (this.controlledSentinel.field_ub >= 0) {
                if (!this.field_f &&
                  this.controlledSentinel.charge < 3 &&
                  (this.controlledSentinel.maximumCharge / 2) > this.controlledSentinel.charge) {
                  this.field_f = true;
                  fc.a((byte) 55, 82, -1);
                }
                if (this.field_f && (!(this.controlledSentinel.charge <= 3) ||
                  !(this.controlledSentinel.charge <= this.controlledSentinel.maximumCharge / 2))) {
                  this.field_f = false;
                  if (var18 != 0) {
                    this.field_f = false;
                  }
                }
              } else {
                this.field_f = false;
              }
              if (!this.field_y &&
                this.controlledSentinel.armour <= (this.controlledSentinel.maximumArmour / 4)) {
                this.field_y = true;
                fc.a((byte) 108, 78, -1);
              }
              if ((this.field_y) &&
                (!(this.controlledSentinel.armour < this.controlledSentinel.maximumArmour / 2))) {
                this.field_y = false;
                if (var18 != 0) {
                  sn.field_n = false;
                  this.field_y = false;
                  this.field_A = false;
                  this.field_f = false;
                }
              }
            } else {
              sn.field_n = false;
              this.field_y = false;
              this.field_A = false;
              this.field_f = false;
            }
          }
          boolean decompiledFrameCompleted1 = true;
          var4 = this.field_P + (oh.field_f << 4) << 4;
          var6 = -32 % ((param0 - 1) / 59);
          var5 = pi.field_c - 400 + (this.field_E >> 4) << 8;
          if (di.field_g != -1 &&
            4 != di.field_g &&
            di.field_g != 10 &&
            qh.field_Yb == dl.field_M) {
            regionExit1: {
              this.controlledSentinel.field_vb = 0;
              if (di.field_g == 0) {
                var7 = qh.field_Yb;
                switch ((var18 == 0
                  || var7 == 1
                  || var7 == 2
                  || var7 == 3
                  || var7 == 4
                  || var7 == 7
                  || var7 == 10
                  ) ? var7 : -1) {
                  case 1:
                    if (tj.field_c != 1) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 2:
                    if (tj.field_c != 1) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 3:
                    if (tj.field_c != 1) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 4:
                    if (!this.world.f(-48)) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 6:
                    if (tj.field_c != 1) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 7:
                    if (!this.world.f(-91)) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 9:
                    if (!this.world.f(-73)) {
                      break regionExit1;
                    }
                    this.k(-1589);
                    if (var18 == 0) {
                      break regionExit1;
                    }
                  case 10:
                    break;
                  default:
                    break regionExit1;
                }
                if (this.world.f(-50)) {
                  this.k(-1589);
                }
              }
            }
            regionExit2: {
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameRemainder15 = true;
              boolean decompiledFrameCompleted4 = true;
              regionExit3: {
                boolean decompiledFrameCompleted3 = true;
                if (1 == di.field_g) {
                  regionExit4: {
                    regionExit5: {
                      regionExit6: {
                        regionExit7: {
                          var7 = qh.field_Yb;
                          if (1 != var7) {
                            if (2 == var7) {
                              break regionExit6;
                            }
                            if (3 == var7) {
                              break regionExit5;
                            }
                            if (4 == var7 &&
                              var18 == 0) {
                              break regionExit4;
                            }
                            regionExit8: {
                              regionExit9: {
                                if (var7 != 5) {
                                  if (var7 != 6 ||
                                    var18 != 0) {
                                    if (var7 == 7 &&
                                      var18 == 0) {
                                      break regionExit9;
                                    }
                                    if (var7 == 8 &&
                                      var18 == 0) {
                                      break regionExit8;
                                    }
                                    regionExit10: {
                                      regionExit11: {
                                        if (var7 == 9) {
                                          if (!this.world.f(-124)) {
                                            break regionExit3;
                                          }
                                          this.k(-1589);
                                          if (var18 == 0) {
                                            break regionExit3;
                                          }
                                        } else {
                                          switch (var7) {
                                            case 12:
                                              break regionExit11;
                                            default:
                                              break regionExit3;
                                            case 13:
                                              if (var18 == 0) {
                                                break regionExit10;
                                              }
                                              break regionExit7;
                                            case 11:
                                              break;
                                          }
                                        }
                                        if (8 > tj.field_c &&
                                          !this.world.f(-127)) {
                                          break regionExit3;
                                        }
                                        this.k(-1589);
                                        if (var18 == 0) {
                                          break regionExit3;
                                        }
                                      }
                                      if (!this.world.f(-126)) {
                                        break regionExit3;
                                      }
                                      this.k(-1589);
                                      if (var18 == 0) {
                                        break regionExit3;
                                      }
                                    }
                                    if (!this.world.f(-79)) {
                                      break regionExit3;
                                    }
                                    if (0 == tj.field_c) {
                                      tj.field_c = 1;
                                      var7 = 0;
                                      while (var7 < 16) {
                                        var8_ref_mb = new Sentinel(-1, 1, this.world);
                                        var8_ref_mb.configureDesign(nn.field_c, true, false, -1, 1);
                                        var8_ref_mb.field_Nb = 9;
                                        var8_ref_mb.j(-5);
                                        var8_ref_mb.worldY = -120000 - var7 * 10000;
                                        var8_ref_mb.field_fc = var8_ref_mb.worldY;
                                        var8_ref_mb.velocityX = 0;
                                        var8_ref_mb.velocityY = 1000;
                                        this.world.sentinels.addLast(3, var8_ref_mb);
                                        var7++;
                                        if (var18 != 0) {
                                          decompiledFrameCompleted4 = false;
                                          break;
                                        }
                                      }
                                      if (decompiledFrameCompleted4) {
                                        break regionExit3;
                                      }
                                    }
                                    if (decompiledFrameCompleted4) {
                                      if (tj.field_c > 2) {
                                        if (tj.field_c != 4) {
                                          break regionExit3;
                                        }
                                        this.k(-1589);
                                        if (var18 == 0) {
                                          break regionExit3;
                                        }
                                      }
                                      var7_ref_int__ = new int[]{55, 1, 18, -1, -1, -1, -1, 2, 29, 96, 29, -1, -1, -1, -1, -1, -1, -1, -1};
                                      tj.field_c = 4;
                                      var8 = 0;
                                      while (var8 < 4) {
                                        var9_ref_mb = new Sentinel(-1, 1, this.world);
                                        var9_ref_mb.configureDesign(var7_ref_int__, true, false, -1, 1);
                                        var9_ref_mb.field_Nb = 4;
                                        var9_ref_mb.j(-5);
                                        var9_ref_mb.worldY = -120000 - 10000 * var8;
                                        var9_ref_mb.field_fc = var9_ref_mb.worldY;
                                        var9_ref_mb.field_pc = false;
                                        var9_ref_mb.velocityX = 0;
                                        var9_ref_mb.velocityY = 1000;
                                        this.world.sentinels.addLast(3, var9_ref_mb);
                                        var8++;
                                        if (var18 != 0) {
                                          decompiledFrameCompleted3 = false;
                                          break;
                                        }
                                      }
                                      if (decompiledFrameCompleted3) {
                                        break regionExit3;
                                      }
                                    }
                                  }
                                } else {
                                  if (this.field_P >= 500) {
                                    break regionExit3;
                                  }
                                  this.k(-1589);
                                  if (var18 == 0) {
                                    break regionExit3;
                                  }
                                }
                                if ((decompiledFrameCompleted4) &&
                                  (decompiledFrameCompleted3)) {
                                  if ((tj.field_c & 7) != 7) {
                                    break regionExit3;
                                  }
                                  this.k(-1589);
                                  if (var18 == 0) {
                                    break regionExit3;
                                  }
                                }
                              }
                              if ((decompiledFrameCompleted4) &&
                                (decompiledFrameCompleted3)) {
                                if (!this.world.f(-39)) {
                                  break regionExit3;
                                }
                                this.k(-1589);
                                if (var18 == 0) {
                                  break regionExit3;
                                }
                              }
                            }
                            if ((decompiledFrameCompleted4) &&
                              (decompiledFrameCompleted3)) {
                              var7_ref_mb = (Sentinel) (this.world.sentinels.b(1063677678));
                              var8 = Math.max(0, Math.min(this.world.terrain.getProfileLength(38) - 10240, -5120 + (this.controlledSentinel.worldX >> 4)));
                              var9 = 3200 + (this.controlledSentinel.worldY >> 4);
                              var10 = -10240 + this.world.terrain.getProfileLength(-119);
                              if ((!(Math.abs(-var7_ref_mb.worldX + var8) >= (var7_ref_mb.field_Db << 4)) ||
                                this.field_P >= var10) && (this.field_E == 1024 ||
                                !(Math.abs(var9 + 8 * var7_ref_mb.field_Db - var7_ref_mb.worldY) >= (40000 + (var7_ref_mb.field_Db << 4))))) {
                                this.k(-1589);
                              }
                              break regionExit3;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted4) &&
                          (decompiledFrameCompleted3)) {
                          if (this.controlledSentinel.field_Xb.length <= this.field_F) {
                            break regionExit3;
                          }
                          if (this.controlledSentinel.field_Xb[this.field_F] != 13) {
                            break regionExit3;
                          }
                          this.k(-1589);
                          if (var18 == 0) {
                            break regionExit3;
                          }
                        }
                      }
                      if ((decompiledFrameCompleted4) &&
                        (decompiledFrameCompleted3)) {
                        if (!this.world.f(-41)) {
                          break regionExit3;
                        }
                        this.k(-1589);
                        if (var18 == 0) {
                          break regionExit3;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted4) &&
                      (decompiledFrameCompleted3)) {
                      if (this.world.field_e.size((byte) -128) != 0) {
                        break regionExit3;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit3;
                      }
                    }
                  }
                  if ((decompiledFrameCompleted4) &&
                    (decompiledFrameCompleted3)) {
                    boolean decompiledSharedTail3 = !(this.world.f(-120));
                    if (!decompiledSharedTail3) {
                      this.k(-1589);
                      decompiledSharedTail3 = (var18 != 0);
                    }
                    if ((decompiledSharedTail3) &&
                      (this.world.sentinels.size((byte) -128) == 2)) {
                      var7_ref_mb = (Sentinel) (this.world.sentinels.b(1063677678));
                      if (var7_ref_mb.worldX < 38000) {
                        this.k(-1589);
                      }
                    }
                  }
                }
              }
              if ((decompiledFrameCompleted4) &&
                (decompiledFrameRemainder15 = (di.field_g == 7))) {
                var7 = qh.field_Yb;
              }
              if (decompiledFrameRemainder15) {
                boolean decompiledFrameRemainder11 = true;
                boolean decompiledFrameRemainder10 = true;
                boolean decompiledFrameRemainder9 = true;
                boolean decompiledFrameRemainder8 = true;
                boolean decompiledFrameRemainder7 = true;
                if ((0 != var7) &&
                  (decompiledFrameRemainder7 = (var7 != 1)) &&
                  (decompiledFrameRemainder8 = (var7 != 2)) &&
                  (decompiledFrameRemainder9 = (var7 != 3 ||
                  var18 != 0)) &&
                  (decompiledFrameRemainder10 = (var7 != 4)) &&
                  (decompiledFrameRemainder15 = (var7 == 5))) {
                  decompiledFrameRemainder11 = (var18 != 0);
                }
                if (((decompiledFrameRemainder15) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10) && (decompiledFrameRemainder9) && (decompiledFrameRemainder8) && (decompiledFrameRemainder7)) &&
                  (decompiledFrameRemainder15 = !(0 > this.field_F)) &&
                  (decompiledFrameRemainder15 = !(this.controlledSentinel.field_Xb.length <= this.field_F)) &&
                  (decompiledFrameRemainder15 = (this.controlledSentinel.field_Xb[this.field_F] == 17))) {
                  this.k(-1589);
                  decompiledFrameRemainder15 = (var18 != 0);
                }
                if ((decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8)) {
                  if (!this.world.f(-46)) {
                    this.controlledSentinel.chassis.d(65536, 17);
                    decompiledFrameRemainder15 = (si.field_t == 0);
                    if (decompiledFrameRemainder15) {
                      var7_ref_jc = new NodeIterator(this.world.field_db);
                      var8 = 0;
                      var9_ref_wl = (Projectile) (var7_ref_jc.b(2));
                      while (null != var9_ref_wl) {
                        stackIn_661_0 = var9_ref_wl.sourceWeaponType;
                        stackIn_661_1 = 20;
                        if (var18 != 0) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        if (stackIn_661_0 == stackIn_661_1) {
                          var8 = 1;
                        }
                        var9_ref_wl = (Projectile) (var7_ref_jc.d(2));
                      }
                      if (decompiledFrameCompleted2) {
                        if (var8 == 0) {
                          this.k(-1589);
                        }
                        decompiledFrameRemainder15 = false;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder15) &&
                    (decompiledFrameCompleted2)) {
                    this.k(-1589);
                    decompiledFrameRemainder15 = (var18 != 0);
                  }
                }
                if ((decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameCompleted2)) {
                  if (!this.world.f(-93)) {
                    var7_ref_nk__ = this.controlledSentinel.weaponParts;
                    var8 = 0;
                    while (var7_ref_nk__.length > var8) {
                      var9_ref_nk = var7_ref_nk__[var8];
                      stackOut_621_0 = var9_ref_nk;
                      stackIn_801_0 = stackOut_621_0;
                      stackIn_622_0 = stackOut_621_0;
                      if (var18 != 0) {
                        break regionExit2;
                      }
                      if (stackIn_622_0 != null &&
                        37 == var9_ref_nk.componentId &&
                        var9_ref_nk.field_C > 350) {
                        var9_ref_nk.field_C = 350;
                      }
                      var8++;
                    }
                    decompiledFrameRemainder15 = false;
                  }
                  else {
                    this.k(-1589);
                    decompiledFrameRemainder15 = (var18 != 0);
                  }
                }
                if (((decompiledFrameRemainder15) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10) && (decompiledFrameCompleted2)) &&
                  (decompiledFrameRemainder15 = !(this.field_F < 0)) &&
                  (decompiledFrameRemainder15 = !(this.field_F >= this.controlledSentinel.field_Xb.length)) &&
                  (decompiledFrameRemainder15 = (this.controlledSentinel.field_Xb[this.field_F] == 2))) {
                  this.k(-1589);
                  decompiledFrameRemainder15 = (var18 != 0);
                }
                if (((decompiledFrameRemainder15) && (decompiledFrameRemainder11) && (decompiledFrameCompleted2)) &&
                  (decompiledFrameRemainder15 = !(!this.world.f(-52)))) {
                  this.k(-1589);
                  decompiledFrameRemainder15 = (var18 != 0);
                }
                if ((decompiledFrameRemainder15) &&
                  (decompiledFrameCompleted2) &&
                  (this.world.f(-63))) {
                  this.k(-1589);
                }
              }
              if (decompiledFrameCompleted2) {
                stackIn_661_0 = 3;
                stackIn_661_1 = di.field_g;
              }
              regionExit12: {
                if (stackIn_661_0 == stackIn_661_1) {
                  var7 = qh.field_Yb;
                  switch ((var18 == 0
                    || var7 == 2
                    || var7 == 5
                    ) ? var7 : -1) {
                    case 2:
                      if (this.controlledSentinel.field_ub >= 0) {
                        break regionExit12;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit12;
                      }
                    case 1:
                      if (tj.field_c <= 0) {
                        break regionExit12;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit12;
                      }
                    case 4:
                      if (!this.world.f(-128)) {
                        break regionExit12;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit12;
                      }
                    case 5:
                      break;
                    default:
                      break regionExit12;
                  }
                  if (this.world.f(-70)) {
                    this.k(-1589);
                  }
                }
              }
              boolean decompiledFrameRemainder6 = true;
              if (di.field_g == 5) {
                boolean decompiledFrameRemainder5 = true;
                boolean decompiledFrameRemainder4 = true;
                var7 = qh.field_Yb;
                if ((var7 != 0 ||
                  var18 != 0) &&
                  (decompiledFrameRemainder4 = (1 != var7 ||
                  var18 != 0)) &&
                  (decompiledFrameRemainder6 = (var7 == 2))) {
                  decompiledFrameRemainder5 = (var18 != 0);
                }
                if (((decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4)) &&
                  (decompiledFrameRemainder6 = (this.controlledSentinel.field_Vb != null))) {
                  this.k(-1589);
                  decompiledFrameRemainder6 = (var18 != 0);
                }
                if (((decompiledFrameRemainder6) && (decompiledFrameRemainder5)) &&
                  (decompiledFrameRemainder6 = !(!this.world.f(-74)))) {
                  this.k(-1589);
                  decompiledFrameRemainder6 = (var18 != 0);
                }
                if ((decompiledFrameRemainder6) &&
                  (this.world.f(-100))) {
                  this.k(-1589);
                }
              }
              regionExit13: {
                if (9 == di.field_g) {
                  var7 = qh.field_Yb;
                  switch ((var18 == 0
                    || var7 == 3
                    || var7 == 4
                    || var7 == 5
                    ) ? var7 : -1) {
                    case 0:
                      if (this.field_F < 0) {
                        break regionExit13;
                      }
                      if (this.field_F >= this.controlledSentinel.field_Xb.length) {
                        break regionExit13;
                      }
                      if (this.controlledSentinel.field_Xb[this.field_F] != 1) {
                        break regionExit13;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit13;
                      }
                    case 1:
                      if (!this.world.f(-109)) {
                        break regionExit13;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit13;
                      }
                    case 3:
                      if (!this.world.f(-47)) {
                        break regionExit13;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit13;
                      }
                    case 4:
                      if (this.field_F < 0) {
                        break regionExit13;
                      }
                      if (this.field_F >= this.controlledSentinel.field_Xb.length) {
                        break regionExit13;
                      }
                      if (this.controlledSentinel.field_Xb[this.field_F] != 15) {
                        break regionExit13;
                      }
                      this.k(-1589);
                      if (var18 == 0) {
                        break regionExit13;
                      }
                    case 5:
                      break;
                    default:
                      break regionExit13;
                  }
                  if (this.world.f(-64)) {
                    this.k(-1589);
                  }
                }
              }
              stackIn_801_0 = this.world.sentinels.first(13058);
            }
            var7_ref_mb = (Sentinel) (stackIn_801_0);
            while (var7_ref_mb != null) {
              stackIn_1080_0 = -7;
              if (var18 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_1080_0 == ~var7_ref_mb.field_Nb) {
                var8 = Math.abs(var7_ref_mb.worldX - this.controlledSentinel.worldX);
                var9 = Math.abs(var7_ref_mb.worldY - this.controlledSentinel.worldY);
                if (8192 > var8 &&
                  var9 < 1024 && (di.field_g != 0 ||
                  !(6 >= qh.field_Yb) ||
                  this.controlledSentinel.field_U == 0)) {
                  var7_ref_mb.clearArmour(128);
                }
              }
              if (var7_ref_mb.field_Nb == 2 &&
                di.field_g == 3 &&
                5 > qh.field_Yb) {
                var8 = -this.controlledSentinel.worldX + var7_ref_mb.worldX;
                var8 = var8 / 1000;
                var9 = -this.controlledSentinel.worldY + var7_ref_mb.worldY;
                var9 = var9 / 1000;
                if (var9 * var9 + var8 * (4 * var8) < 50) {
                  var7_ref_mb.clearArmour(128);
                }
              }
              if (var7_ref_mb.field_Nb == 9 &&
                1 == di.field_g &&
                qh.field_Yb == 13) {
                if (tj.field_c > 1) {
                  var7_ref_mb.field_Nb = 7;
                } else {
                  if (var7_ref_mb.maximumArmour > var7_ref_mb.armour) {
                    tj.field_c = 2;
                  }
                }
              }
              if (2 == var7_ref_mb.field_Nb && (3 == di.field_g ||
                5 == di.field_g ||
                9 == di.field_g)) {
                stackIn_869_0 = (di.field_g != 9) ? 0 : 1;
                var8 = stackIn_869_0;
                stackIn_872_0 = var7_ref_mb.worldY;
                if (var8 == 0) {
                  stackIn_873_1 = -75000;
                } else {
                  stackIn_873_1 = -60000;
                }
                if (stackIn_872_0 > stackIn_873_1 &&
                  var7_ref_mb.pendingCommands.f(7)) {
                  var9_ref_je = new SentinelCommand(3, 0, 10 + this.world.simulationTick);
                  var9_ref_je.targetWorldX = ((int)(Math.random() * (double)this.world.terrain.getProfileLength(19) / 4.0) - this.world.terrain.getProfileLength(32) / 8 << 4) + this.controlledSentinel.worldX;
                  var9_ref_je.scheduled = true;
                  if (var7_ref_mb.velocityX > 0 &&
                    384000 > var7_ref_mb.worldX ||
                    !(var7_ref_mb.worldX >= 64000)) {
                    var9_ref_je.targetWorldX = var7_ref_mb.worldX + 5000;
                  } else {
                    var9_ref_je.targetWorldX = var7_ref_mb.worldX - 5000;
                  }
                  stackIn_894_0 = var9_ref_je;
                  if (var8 != 0) {
                    stackIn_895_1 = -65000;
                  } else {
                    stackIn_895_1 = -80000;
                  }
                  stackIn_894_0.targetWorldY = stackIn_895_1;
                  var7_ref_mb.pendingCommands.addLast(3, var9_ref_je);
                  var7_ref_mb.refillCharge(5);
                }
              }
              if (var7_ref_mb.field_Nb == 2 &&
                di.field_g == 3) {
                var8 = -55000;
                if (var7_ref_mb.field_Nb == 2) {
                  var8 = -75000;
                }
                if (var8 < var7_ref_mb.worldY &&
                  var7_ref_mb.pendingCommands.f(7)) {
                  var9_ref_je = new SentinelCommand(3, 0, 10 + this.world.simulationTick);
                  var9_ref_je.targetWorldX = ((int)(Math.random() * (double)this.world.terrain.getProfileLength(-123) / 4.0) - this.world.terrain.getProfileLength(41) / 8 << 4) + this.controlledSentinel.worldX;
                  if (var9_ref_je.targetWorldX < (-5000 + var7_ref_mb.worldX)) {
                    var9_ref_je.targetWorldX = var7_ref_mb.worldX - 5000;
                  }
                  var9_ref_je.targetWorldY = -60000;
                  if (var9_ref_je.targetWorldX > (var7_ref_mb.worldX + 5000)) {
                    var9_ref_je.targetWorldX = var7_ref_mb.worldX + 5000;
                  }
                  var9_ref_je.scheduled = true;
                  var7_ref_mb.pendingCommands.addLast(3, var9_ref_je);
                  var7_ref_mb.refillCharge(5);
                  var9_ref_je = new SentinelCommand(0, var7_ref_mb.field_Xb[0], this.world.simulationTick + 20);
                  var10 = 1;
                  var11 = -var7_ref_mb.worldX + this.controlledSentinel.worldX;
                  var12_int = -var7_ref_mb.worldY + (this.controlledSentinel.worldY - this.controlledSentinel.field_Db * 8);
                  if (Math.abs(var11) > 80000) {
                    var10 = 0;
                  }
                  if (2 == var7_ref_mb.field_Nb) {
                    var10 = 0;
                  }
                  if (var10 != 0) {
                    if (var11 >= 0) {
                      bj.field_h = 1;
                    } else {
                      bj.field_h = -1;
                    }
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var9_ref_je.aimAngle = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var15_ref_nk__ = var7_ref_mb.chassis.a(0, var7_ref_mb, new ArticulatedPart[]{}, var9_ref_je.aimAngle * bj.field_h, var7_ref_mb.field_Xb[0]);
                    var7_ref_mb.chassis.b((byte) -128, 0, bj.field_h, 0);
                    var16 = 0;
                    var17 = 0;
                    while (true) {
                      if (var15_ref_nk__.length > var17) {
                        var16 = var16 + var15_ref_nk__[var17].field_V;
                        var17++;
                        continue;
                      }
                      break;
                    }
                    if (var15_ref_nk__.length > 0) {
                      var12_int = var12_int - var16 / var15_ref_nk__.length;
                    }
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var9_ref_je.aimAngle = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var9_ref_je.targetWorldY = this.controlledSentinel.worldY;
                    var9_ref_je.targetWorldX = this.controlledSentinel.worldX;
                    if (bj.field_h < 0) {
                      if (!(16384 >= var9_ref_je.aimAngle)) {
                        var9_ref_je.aimAngle = var9_ref_je.aimAngle - 65536;
                      }
                    } else {
                      if (var9_ref_je.aimAngle < -16384) {
                        var9_ref_je.aimAngle = var9_ref_je.aimAngle + 65536;
                      }
                    }
                    var9_ref_je.scheduled = true;
                    var7_ref_mb.pendingCommands.addLast(3, var9_ref_je);
                  }
                }
              }
              if (3 == var7_ref_mb.field_Nb ||
                4 == var7_ref_mb.field_Nb ||
                var7_ref_mb.field_Nb == 9) {
                var7_ref_mb.field_pc = false;
                if (var7_ref_mb.pendingCommands.f(7)) {
                  var8 = 1;
                  if (di.field_g == 1 &&
                    qh.field_Yb <= 12) {
                    if (var7_ref_mb.field_Lb) {
                      var8 = 0;
                    }
                    if (var7_ref_mb.worldX - this.controlledSentinel.worldX > 100000) {
                      var8 = 0;
                    }
                  }
                  if (var7_ref_mb.field_Nb == 9) {
                    var8 = 0;
                  }
                  var9 = 0;
                  if (5 == var7_ref_mb.field_Nb &&
                    var7_ref_mb.worldY > -20000) {
                    var10_ref_je = new SentinelCommand(3, 0, 1 + this.world.simulationTick);
                    var10_ref_je.targetWorldY = -20000 + var7_ref_mb.worldY;
                    var10_ref_je.targetWorldX = var7_ref_mb.worldX;
                    var10_ref_je.scheduled = true;
                    var7_ref_mb.pendingCommands.addLast(3, var10_ref_je);
                    var7_ref_mb.refillCharge(5);
                  }
                  if (var7_ref_mb.field_Nb == 9) {
                    if (var7_ref_mb.worldX <= 16000) {
                      var7_ref_mb.field_U = 1;
                    } else if (var7_ref_mb.worldX >= 213000) {
                      var7_ref_mb.field_U = -1;
                    } else {
                      if (var7_ref_mb.field_U == 0) {
                        var7_ref_mb.field_U = 1;
                      }
                    }
                    var9 = (int)(100.0 * Math.random()) + 100;
                  } else {
                    if (var7_ref_mb.field_Nb == 4 &&
                      !var7_ref_mb.field_Lb) {
                      if (!(5.0 > 100.0 * Math.random()) ||
                        var7_ref_mb.field_r != 5) {
                        if (this.controlledSentinel.worldX < (var7_ref_mb.worldX - 1000)) {
                          var7_ref_mb.field_U = -1;
                        }
                        if (!(this.controlledSentinel.worldX <= (1000 + var7_ref_mb.worldX))) {
                          var7_ref_mb.field_U = 1;
                        }
                      } else {
                        var10_ref_je = new SentinelCommand(3, 0, 1 + this.world.simulationTick);
                        var10_ref_je.targetWorldY = -20000 + var7_ref_mb.worldY;
                        var10_ref_je.scheduled = true;
                        var10_ref_je.targetWorldX = this.controlledSentinel.worldX;
                        var7_ref_mb.pendingCommands.addLast(3, var10_ref_je);
                        var7_ref_mb.refillCharge(5);
                      }
                      var9 = (int)(100.0 * Math.random()) + 100;
                    }
                  }
                  var10_ref_je = new SentinelCommand(0, var7_ref_mb.field_Xb[0], var9 + 2 + this.world.simulationTick);
                  var11 = this.controlledSentinel.worldX - var7_ref_mb.worldX;
                  var12_int = -(this.controlledSentinel.field_Db * 8) + this.controlledSentinel.worldY - var7_ref_mb.worldY;
                  if (0 == var7_ref_mb.field_Xb[0] &&
                    Math.abs(var11) > 80000) {
                    var8 = 0;
                  }
                  if (var7_ref_mb.field_Xb[0] == 13 &&
                    Math.abs(var11) > 150000) {
                    var8 = 0;
                  }
                  if (var8 != 0) {
                    if (0 <= var11) {
                      bj.field_h = 1;
                    } else {
                      bj.field_h = -1;
                    }
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var10_ref_je.aimAngle = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var15_ref_nk__ = var7_ref_mb.chassis.a(0, var7_ref_mb, new ArticulatedPart[]{}, var10_ref_je.aimAngle * bj.field_h, var7_ref_mb.field_Xb[0]);
                    var7_ref_mb.chassis.b((byte) -128, 0, bj.field_h, 0);
                    var16 = 0;
                    var17 = 0;
                    while (true) {
                      if (var17 < var15_ref_nk__.length) {
                        var16 = var16 + var15_ref_nk__[var17].field_V;
                        var17++;
                        continue;
                      }
                      if (0 < var15_ref_nk__.length) {
                        var12_int = var12_int - var16 / var15_ref_nk__.length;
                      }
                      var13_double = Math.atan2((double)var11, (double)(-var12_int));
                      var10_ref_je.aimAngle = (int)(var13_double * 65536.0 / 6.283185307179586);
                      var10_ref_je.targetWorldX = this.controlledSentinel.worldX;
                      if (0 <= bj.field_h) {
                        if (!(-16384 <= var10_ref_je.aimAngle)) {
                          var10_ref_je.aimAngle = var10_ref_je.aimAngle + 65536;
                        }
                      } else {
                        if (var10_ref_je.aimAngle > 16384) {
                          var10_ref_je.aimAngle = var10_ref_je.aimAngle - 65536;
                        }
                      }
                      var10_ref_je.scheduled = true;
                      var10_ref_je.targetWorldY = this.controlledSentinel.worldY;
                      var7_ref_mb.pendingCommands.addLast(3, var10_ref_je);
                      if (var7_ref_mb.field_Xb[0] != 13) {
                        break;
                      }
                      var10_ref_je.startTick = var10_ref_je.startTick + 50;
                      break;
                    }
                  }
                }
              }
              var7_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -88));
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_1080_0 = 320;
          }
          var7 = stackIn_1080_0;
          if (0 != di.field_g &&
            0 != jj.field_d &&
            this.controlledSentinel != null &&
            this.controlledSentinel.field_Xb != null &&
            !this.world.field_j) {
            this.field_F = Math.max(0, Math.min(this.controlledSentinel.field_Xb.length - 1, -jj.field_d + this.field_F));
            rc.field_l = 100;
          }
          if (di.field_g == 1 &&
            qh.field_Yb == 6) {
            if (fc.field_e[97] ||
              fc.field_e[on.field_h]) {
              tj.field_c = tj.field_c | 1;
            }
            if (fc.field_e[98] ||
              fc.field_e[fm.field_d]) {
              tj.field_c = tj.field_c | 2;
            }
            if (fc.field_e[99] ||
              fc.field_e[pd.field_V]) {
              tj.field_c = tj.field_c | 4;
            }
          }
          if (!fc.field_e[b.field_b] ||
            this.controlledSentinel == null) {
            if (!(0 >= lk.field_eb)) {
              lk.field_eb = lk.field_eb - 1;
              if (var18 != 0) {
                lk.field_eb = 16;
              }
            }
          } else {
            lk.field_eb = 16;
          }
          boolean decompiledFrameRemainder14 = true;
          if (this.controlledSentinel != null &&
            this.controlledSentinel.field_pc &&
            !this.controlledSentinel.field_Hb && (!(this.controlledSentinel.field_Qb >= 0) ||
            !(this.controlledSentinel.field_Qb <= 100))) {
            stackIn_1149_0 = 1;
            decompiledFrameRemainder14 = false;
          }
          else {
            stackIn_1149_0 = 0;
          }
          var8 = stackIn_1149_0;
          if (null != this.controlledSentinel &&
            si.field_p &&
            this.controlledSentinel.field_pc &&
            this.controlledSentinel.field_Qb == 0) {
            this.field_V = this.field_E + (-(this.controlledSentinel.worldY >> 4) - 3200);
            this.field_p = 5120 - (this.controlledSentinel.worldX >> 4) + this.field_P;
          }
          boolean decompiledFrameRemainder3 = true;
          if (ri.field_b != null &&
            !this.world.field_j) {
            var9 = Math.max(0, Math.min(this.world.terrain.getProfileLength(-127) - 10240, (ri.field_b.worldX >> 4) - 5120));
            var10 = 3200 + (ri.field_b.worldY >> 4);
            if (var9 < this.field_P) {
              this.field_P = Math.max(var9, -500 + this.field_P);
              if (var18 != 0) {
                this.field_P = Math.min(var9, this.field_P + 500);
              }
            } else {
              this.field_P = Math.min(var9, this.field_P + 500);
            }
            if (this.field_E > var10) {
              this.field_E = Math.max(var10, -500 + this.field_E);
              if (var18 != 0) {
                this.field_E = Math.min(var10, 500 + this.field_E);
              }
            } else {
              this.field_E = Math.min(var10, 500 + this.field_E);
            }
            decompiledFrameRemainder3 = (var18 != 0);
          }
          if (decompiledFrameRemainder3) {
            if (dm.field_c) {
              boolean decompiledFrameRemainder2 = true;
              var9 = 0;
              var10 = this.world.terrain.getProfileLength(-126) - 10240;
              var11 = -3000;
              var12_int = 1024;
              var13 = 0;
              if (lb.field_gc != 2) {
                if ((0 == (4 & sf.field_d)) &&
                  (decompiledFrameRemainder2 = (this.controlledSentinel != null)) &&
                  (decompiledFrameRemainder2 = (var8 == 0)) &&
                  (decompiledFrameRemainder2 = !(!si.field_p))) {
                  if (this.field_P < var9) {
                    this.field_P = var9;
                  }
                  if (this.field_P > var10) {
                    this.field_P = var10;
                  }
                  if (this.field_E < var11) {
                    this.field_E = var11;
                  }
                  if (this.field_E > var12_int) {
                    this.field_E = var12_int;
                  }
                  this.field_P = this.field_p + ((this.controlledSentinel.worldX >> 4) - 5120);
                  this.field_E = 3200 + this.field_V + (this.controlledSentinel.worldY >> 4);
                  decompiledFrameRemainder2 = (var18 != 0);
                }
                if (decompiledFrameRemainder2) {
                  var13 = 1;
                  var14 = pa.field_c - oh.field_f;
                  var15 = -pi.field_c + la.field_a;
                  if (ui.field_G) {
                    var14 = -var14;
                  }
                  pa.field_c = oh.field_f;
                  if (ik.field_h) {
                    var15 = -var15;
                  }
                  la.field_a = pi.field_c;
                  this.field_P = this.field_P - 16 * var14;
                  this.field_E = this.field_E - var15 * 16;
                  var8 = 0;
                  if (var18 != 0) {
                    la.field_a = pi.field_c;
                    pa.field_c = oh.field_f;
                    var8 = 0;
                  }
                }
              } else {
                la.field_a = pi.field_c;
                pa.field_c = oh.field_f;
                var8 = 0;
              }
              if (var9 > this.field_P) {
                this.field_P = var9;
              }
              if (var10 < this.field_P) {
                this.field_P = var10;
              }
              if (this.field_E < var11 &&
                var8 == 0) {
                this.field_E = var11;
              }
              if (var12_int < this.field_E) {
                this.field_E = var12_int;
              }
              if (var13 != 0 &&
                this.controlledSentinel != null) {
                this.field_V = -3200 - (this.controlledSentinel.worldY >> 4) + this.field_E;
                this.field_p = 5120 - (this.controlledSentinel.worldX >> 4) + this.field_P;
              }
              decompiledFrameRemainder3 = (var18 != 0);
            }
            if (decompiledFrameRemainder3) {
              if ((null == this.controlledSentinel ||
                !si.field_p ||
                this.world.field_j) &&
                (decompiledFrameRemainder3 = !(jn.field_g))) {
                if (fc.field_e[96] ||
                  fc.field_e[sa.field_c]) {
                  var8 = 0;
                  this.field_P = Math.max(0, this.field_P - var7);
                }
                if (fc.field_e[97] ||
                  fc.field_e[on.field_h]) {
                  var8 = 0;
                  this.field_P = Math.min(-10240 + this.world.terrain.getProfileLength(-117), var7 + this.field_P);
                }
                if (fc.field_e[99] ||
                  fc.field_e[pd.field_V]) {
                  var8 = 0;
                  this.field_E = this.field_E + var7;
                }
                decompiledFrameRemainder3 = (fc.field_e[98] ||
                  fc.field_e[fm.field_d]);
                if (decompiledFrameRemainder3) {
                  this.field_E = Math.max(-var7 + this.field_E, -3000);
                  var8 = 0;
                  decompiledFrameRemainder3 = (var18 != 0);
                }
              }
              if ((decompiledFrameRemainder3) && (null != this.controlledSentinel &&
                si.field_p)) {
                if (!jn.field_g) {
                  if (fc.field_e[96] ||
                    fc.field_e[sa.field_c]) {
                    this.field_p = this.field_p - var7;
                    var8 = 0;
                  }
                  if (fc.field_e[97] ||
                    fc.field_e[on.field_h]) {
                    this.field_p = this.field_p + var7;
                    var8 = 0;
                  }
                  if (fc.field_e[98] ||
                    fc.field_e[fm.field_d]) {
                    var8 = 0;
                    this.field_V = this.field_V - var7;
                  }
                  if (fc.field_e[99] ||
                    fc.field_e[pd.field_V]) {
                    var8 = 0;
                    this.field_V = this.field_V + var7;
                  }
                }
                this.field_E = this.field_V + (this.controlledSentinel.worldY >> 4) + 3200;
                this.field_P = -5120 + this.field_p + (this.controlledSentinel.worldX >> 4);
                if (this.field_P < 0) {
                  if (jn.field_g ||
                    !fc.field_e[97] &&
                    !fc.field_e[on.field_h]) {
                    if (this.field_P < -2000) {
                      this.field_p = this.field_p - (2000 + this.field_P);
                      if (var18 != 0) {
                        this.field_p = this.field_p - this.field_P;
                      }
                    }
                  } else {
                    this.field_p = this.field_p - this.field_P;
                  }
                  this.field_P = 0;
                }
                var9 = -10240 + this.world.terrain.getProfileLength(-127);
                if (var9 < this.field_P) {
                  if (jn.field_g ||
                    !fc.field_e[96] &&
                    !fc.field_e[sa.field_c]) {
                    if (this.field_P > var9 + 2000) {
                      this.field_p = this.field_p - (-2000 - var9 + this.field_P);
                      if (var18 != 0) {
                        this.field_p = this.field_p - (this.field_P - var9);
                      }
                    }
                  } else {
                    this.field_p = this.field_p - (this.field_P - var9);
                  }
                  this.field_P = var9;
                }
                var10 = -3000;
                if (this.field_E < var10 &&
                  var8 == 0) {
                  boolean decompiledSharedTail2 = (jn.field_g || (!(fc.field_e[99]) &&
                    !(fc.field_e[pd.field_V])));
                  if (!decompiledSharedTail2) {
                    this.field_V = this.field_V - (this.field_E - var10);
                    decompiledSharedTail2 = (var18 != 0);
                  }
                  if ((decompiledSharedTail2) &&
                    (this.field_E < -2000 + var10)) {
                    this.field_V = this.field_V - (this.field_E - (-2000 + var10));
                  }
                  this.field_E = var10;
                }
                if (this.field_E > 1024) {
                  if (jn.field_g ||
                    !fc.field_e[98] &&
                    !fc.field_e[fm.field_d]) {
                    if (this.field_E > 3024) {
                      this.field_V = this.field_V - (-3024 + this.field_E);
                      if (var18 != 0) {
                        this.field_V = this.field_V - (this.field_E - 1024);
                      }
                    }
                  } else {
                    this.field_V = this.field_V - (this.field_E - 1024);
                  }
                  this.field_E = 1024;
                }
              }
            }
          }
          if (!(lk.field_eb <= 0) ||
            var8 != 0) {
            var9 = Math.max(0, Math.min(-10240 + this.world.terrain.getProfileLength(54), (this.controlledSentinel.worldX >> 4) - 5120));
            var10 = 3200 + (this.controlledSentinel.worldY >> 4);
            var11 = Math.max(Math.abs(var9 - this.field_P), Math.abs(-this.field_E + var10)) / 5;
            if (0 < lk.field_eb) {
              var11 = Math.max(var11, 400);
              if (var18 != 0) {
                var11 = Math.min(var11, 150);
              }
            } else {
              var11 = Math.min(var11, 150);
            }
            if (var9 >= this.field_P) {
              this.field_P = Math.min(var9, this.field_P + var11);
              if (var18 != 0) {
                this.field_P = Math.max(var9, this.field_P - var11);
              }
            } else {
              this.field_P = Math.max(var9, this.field_P - var11);
            }
            if (var10 >= this.field_E) {
              this.field_E = Math.min(var10, var11 + this.field_E);
              if (var18 != 0) {
                this.field_E = Math.max(var10, this.field_E - var11);
              }
            } else {
              this.field_E = Math.max(var10, this.field_E - var11);
            }
            if (si.field_p) {
              this.field_V = -3200 - (this.controlledSentinel.worldY >> 4) + this.field_E;
              this.field_p = -(this.controlledSentinel.worldX >> 4) + (5120 + this.field_P);
            }
          }
          if (!this.field_d &&
            ~qh.field_Yb == ~dl.field_M) {
            this.field_i = 1 + this.world.simulationTick;
          }
          boolean decompiledSharedTail1 = !(this.world.field_j);
          if (!decompiledSharedTail1) {
            this.field_i = this.world.simulationTick + 1;
            decompiledSharedTail1 = (var18 != 0);
          }
          if ((decompiledSharedTail1) &&
            (~this.field_i == ~this.world.simulationTick)) {
            this.world.checkMatchCompletion(-1);
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_d &&
            (this.world.simulationTick < this.field_i ||
            this.world.field_j) || !this.field_d) {
            if (~this.field_l == ~this.world.simulationTick) {
              stackIn_1455_1 = ((65535 & this.world.computeSyncChecksum(false)) != (65535 & this.field_j));
              this.field_ab = stackIn_1455_1;
              stackIn_1459_1 = (~(-65536 & this.world.computeSyncChecksum(false)) != ~(this.field_j & -65536));
              this.field_k = stackIn_1459_1;
            }
            this.world.advanceSimulation((byte) 27);
            if (um.field_X > 0) {
              um.field_X = um.field_X - 1;
            }
            if (this.field_d) {
              hj.field_s = sg.field_b;
              if (!vl.field_v) {
                if (ln.field_e > 1) {
                  hj.field_s = db.a(cj.field_b, -61, new String[]{Integer.toString(ln.field_e)});
                  if (var18 != 0) {
                    if (ln.field_e != 1) {
                      hj.field_s = ci.field_d;
                      hj.field_s = gb.field_b;
                    } else {
                      hj.field_s = gb.field_b;
                    }
                  }
                } else {
                  if (ln.field_e != 1) {
                    hj.field_s = ci.field_d;
                    if (var18 != 0) {
                      hj.field_s = gb.field_b;
                    }
                  } else {
                    hj.field_s = gb.field_b;
                  }
                }
              }
              var9 = fk.field_d.c(hj.field_s.toUpperCase());
              jl.field_c = jl.field_c + 0.05000000074505806f * ((float)var9 - jl.field_c);
            }
            if (!this.field_d ||
              !param1 ||
              jn.field_g) {
              bb.field_T = false;
              decompiledFrameRemainder1 = (var18 != 0);
            }
            if (decompiledFrameRemainder1) {
              var9 = 24;
              var10 = 356;
              bb.field_T = false;
              if (vl.field_v) {
                var10 = 336;
              }
              if ((!bb.field_T ||
                !param1) &&
                (!(ln.field_e > 0) ||
                !(a.field_c % 40 < 20))) {
                stackIn_1508_0 = 0;
              } else {
                stackIn_1508_0 = 1;
              }
              var11 = stackIn_1508_0;
              if (var11 != 0) {
                stackIn_1512_0 = be.field_f;
              } else {
                stackIn_1512_0 = co.field_d;
              }
              var12 = stackIn_1512_0;
              var13 = var12[2].field_A + var12[0].field_A + (int)jl.field_c;
              if (oh.field_f >= 0 &&
                oh.field_f < var13 &&
                var10 <= pi.field_c &&
                pi.field_c < var10 + var9) {
                this.field_r = 0;
                bb.field_T = true;
              }
              if (lb.field_gc == 1 &&
                bb.field_T) {
                stackIn_1535_0 = !(vl.field_v);
                vl.field_v = stackIn_1535_0;
                if (vl.field_v) {
                  ln.field_e = 0;
                }
              }
            }
          }
          scanLoop14: while (true) {
            if (this.world.simulationTick < (-in.field_g[this.world.field_c] + this.field_i) &&
              !this.field_z) {
              if (~this.field_l == ~this.world.simulationTick) {
                stackIn_1550_1 = ((65535 & this.world.computeSyncChecksum(false)) != (this.field_j & 65535));
                this.field_ab = stackIn_1550_1;
                stackIn_1554_1 = ((this.world.computeSyncChecksum(false) & -65536) != (-65536 & this.field_j));
                this.field_k = stackIn_1554_1;
              }
              this.world.advanceSimulation((byte) 27);
              if (0 >= um.field_X) {
                continue;
              }
              um.field_X = um.field_X - 1;
              if (var18 == 0) {
                continue;
              }
            } else {
              if (this.field_d) {
                break scanLoop14;
              }
              this.field_ab = false;
            }
            this.field_k = false;
            break;
          }
          if (this.field_w > this.world.simulationTick) {
            return;
          }
          regionExit15: {
            if (!param1 ||
              NodeIterator.a(2) ||
              jn.field_g) {
              this.b(0, 0, 0, 0);
              if (var18 == 0) {
                break regionExit15;
              }
            }
            if (!this.field_d &&
              fc.field_e[35] &&
              !this.field_d &&
              NodeDeque.field_d >= 2) {
              this.world.terrain.a(1200, this.world.playerCount, this.world.mapSeed);
            }
            if (1 == lb.field_gc) {
            }
            if (lb.field_gc == 1 &&
              this.controlledSentinel != null &&
              null != this.controlledSentinel.field_Vb &&
              NodeIterator.field_k) {
              var9 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var10_ref_je = new SentinelCommand(12, 0, var9);
              var11_ref_je = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
              if (null != var11_ref_je &&
                var11_ref_je.endTick > var9) {
                var9 = var11_ref_je.endTick;
              }
              if (this.field_d) {
                mm.field_g.writeCipheredOpcode(64, (byte) -117);
                mm.field_g.writeByte((byte) 127, 12);
                mm.field_g.writeByte((byte) 120, 0);
                mm.field_g.writeInt(true, var9);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                if (var18 != 0) {
                  var10_ref_je.scheduled = true;
                }
              } else {
                var10_ref_je.scheduled = true;
              }
              if (di.field_g != -1 ||
                1 != this.world.field_c) {
                this.controlledSentinel.pendingCommands.addLast(3, var10_ref_je);
              }
            }
            if (var3_int != 0 &&
              null != this.controlledSentinel && (!this.controlledSentinel.field_pc ||
              !(this.controlledSentinel.field_Qb >= 0))) {
              stackIn_1638_0 = (!fc.field_e[81]) ? 0 : 1;
              var9 = stackIn_1638_0;
              if (dm.field_c) {
                stackIn_1645_0 = (fc.field_e[81]) ? 1 : 0;
                var9 = stackIn_1645_0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (!fc.field_e[86] ||
                !this.controlledSentinel.hasModuleType(16, -27)) {
                if (!dm.field_c &&
                  (4 & sf.field_d) != 0) {
                  IsaacRandom.field_c = true;
                  var9 = 1;
                  decompiledFrameRemainder0 = (var18 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (!dm.field_c ||
                    !fc.field_e[fm.field_d] &&
                    !fc.field_e[83]) {
                    if ((!dm.field_c) &&
                      (fc.field_e[83])) {
                      IsaacRandom.field_c = true;
                      var9 = 1;
                      if (var18 != 0) {
                        IsaacRandom.field_c = true;
                        var9 = 1;
                        var9 = 2;
                      }
                    }
                  } else {
                    IsaacRandom.field_c = true;
                    var9 = 1;
                    if (var18 != 0) {
                      var9 = 2;
                    }
                  }
                }
              } else {
                var9 = 2;
              }
              if (PacketBuffer.field_r &&
                var9 != 1) {
                var9 = 0;
              }
              boolean decompiledSharedTail0 = (!(param1) ||
                this.field_r != -1);
              if (!decompiledSharedTail0) {
                switch (var9) {
                  default:
                    break;
                  case 2:
                    stackIn_1702_1 = 15;
                    stackIn_1702_2 = 6;
                    if (null != this.field_u &&
                      0 < this.controlledSentinel.charge &&
                      this.controlledSentinel.field_ub >= 0) {
                      stackIn_1705_3 = 0;
                    } else {
                      stackIn_1705_3 = 1;
                    }
                    this.b(stackIn_1702_1, stackIn_1702_2 + stackIn_1705_3, 0, 15);
                    if (var18 == 0) {
                      break;
                    }
                  case 1:
                    var10 = 2;
                    if (this.controlledSentinel.field_cb > 0 && (this.controlledSentinel.field_Lb ||
                      !(0 < this.controlledSentinel.field_Fb))) {
                      var10 = 3;
                    }
                    this.b(15, var10, 0, 1);
                    break;
                  case 0:
                    break;
                }
                this.a(-7289, var5, var9, var4);
                decompiledSharedTail0 = (var18 != 0);
              }
              if (decompiledSharedTail0) {
                this.b(0, 0, 0, 0);
                dl.field_G = this.controlledSentinel.worldY;
                km.field_c = this.controlledSentinel.worldX;
              }
              if (var18 != 0) {
                this.b(0, 0, 0, 0);
              }
            } else {
              this.b(0, 0, 0, 0);
            }
          }
          if ((1 & sf.field_d) == 0) {
            vd.field_b = false;
          }
          boolean decompiledFrameCompleted0 = true;
          if (41 == this.field_r &&
            lb.field_gc == 1) {
            stackIn_1734_0 = !(uj.field_f);
            uj.field_f = stackIn_1734_0;
            vd.field_b = true;
            if (null != this.field_B) {
              var9 = 0;
              while (var9 < this.field_B.length) {
                this.field_B[var9] = 0;
                var9++;
                if (var18 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted0) && (this.field_r == 1 &&
            lb.field_gc == 1)) {
            vd.field_b = true;
            if (dl.field_M > 0) {
              dl.field_M = dl.field_M - 1;
            }
          }
          if (36 == this.field_r &&
            lb.field_gc == 1) {
            stackIn_1761_0 = !(dm.field_c);
            dm.field_c = stackIn_1761_0;
            vd.field_b = true;
            gd.field_sb = null;
            stackIn_1764_0 = ti.field_A;
            stackIn_1764_1 = 42;
            if (dm.field_c) {
              stackIn_1765_2 = qm.field_c;
            } else {
              stackIn_1765_2 = od.field_j;
            }
            stackIn_1764_0[stackIn_1764_1] = stackIn_1765_2;
            if (!ni.b(88)) {
              um.f((byte) 3);
            }
          }
          if (this.field_r == 37 &&
            lb.field_gc == 1) {
            vd.field_b = true;
            stackIn_1778_0 = !(ui.field_G);
            ui.field_G = stackIn_1778_0;
            stackIn_1781_0 = ti.field_A;
            stackIn_1781_1 = 43;
            if (ui.field_G) {
              stackIn_1782_2 = tm.field_f;
            } else {
              stackIn_1782_2 = fj.field_i;
            }
            stackIn_1781_0[stackIn_1781_1] = stackIn_1782_2;
            if (!ni.b(109)) {
              um.f((byte) 3);
            }
          }
          if (this.field_r == 38 &&
            lb.field_gc == 1) {
            vd.field_b = true;
            stackIn_1796_0 = !(ik.field_h);
            ik.field_h = stackIn_1796_0;
            stackIn_1799_0 = ti.field_A;
            stackIn_1799_1 = 44;
            if (!ik.field_h) {
              stackIn_1800_2 = sa.field_b;
            } else {
              stackIn_1800_2 = o.field_a;
            }
            stackIn_1799_0[stackIn_1799_1] = stackIn_1800_2;
            if (!ni.b(20)) {
              um.f((byte) 3);
            }
          }
          if (this.field_r == 33 &&
            lb.field_gc == 1) {
            var9 = this.world.simulationTick + vk.field_h[this.world.field_c];
            var10_ref_je = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
            if (var10_ref_je != null &&
              var10_ref_je.endTick > var9) {
              var9 = var10_ref_je.endTick;
            }
            if (var9 < 500 + this.world.simulationTick) {
              var11_ref_je = new SentinelCommand(6, -1, var9);
              if (this.field_d) {
                mm.field_g.writeCipheredOpcode(64, (byte) -117);
                mm.field_g.writeByte((byte) 115, 6);
                mm.field_g.writeByte((byte) 122, -1);
                mm.field_g.writeInt(true, var9);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                if (var18 != 0) {
                  var11_ref_je.scheduled = true;
                }
              } else {
                var11_ref_je.scheduled = true;
              }
              if (di.field_g != -1 ||
                this.world.field_c != 1) {
                this.controlledSentinel.secondaryCommands.addLast(3, var11_ref_je);
              }
            }
          }
          if (this.field_r == 34 &&
            lb.field_gc == 1) {
            var9 = vk.field_h[this.world.field_c] + this.world.simulationTick;
            var10_ref_je = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
            if (null != var10_ref_je &&
              var9 < var10_ref_je.endTick) {
              var9 = var10_ref_je.endTick;
            }
            if (var9 < 500 + this.world.simulationTick) {
              var11_ref_je = new SentinelCommand(6, 1, var9);
              if (this.field_d) {
                mm.field_g.writeCipheredOpcode(64, (byte) -117);
                mm.field_g.writeByte((byte) 122, 6);
                mm.field_g.writeByte((byte) 115, -1);
                mm.field_g.writeInt(true, var9);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                if (var18 != 0) {
                  var11_ref_je.scheduled = true;
                }
              } else {
                var11_ref_je.scheduled = true;
              }
              if (di.field_g != -1 ||
                1 != this.world.field_c) {
                this.controlledSentinel.secondaryCommands.addLast(3, var11_ref_je);
              }
            }
          }
          if (this.field_r == 35 &&
            lb.field_gc == 1) {
            var9 = vk.field_h[this.world.field_c] + this.world.simulationTick;
            var10_ref_je = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
            if (var10_ref_je != null &&
              var9 < var10_ref_je.endTick) {
              var9 = var10_ref_je.endTick;
            }
            if (this.world.simulationTick + 500 > var9) {
              var11_ref_je = new SentinelCommand(6, 0, var9);
              if (this.field_d) {
                mm.field_g.writeCipheredOpcode(64, (byte) -117);
                mm.field_g.writeByte((byte) 122, 6);
                mm.field_g.writeByte((byte) 110, -1);
                mm.field_g.writeInt(true, var9);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                if (var18 != 0) {
                  var11_ref_je.scheduled = true;
                }
              } else {
                var11_ref_je.scheduled = true;
              }
              if (di.field_g != -1 ||
                this.world.field_c != 1) {
                this.controlledSentinel.secondaryCommands.addLast(3, var11_ref_je);
              }
            }
          }
          if ((5 == this.field_r ||
            this.field_r == 39) &&
            1 == lb.field_gc) {
            vd.field_b = true;
            if (this.field_r == 39) {
              lh.field_D = true;
            }
            this.i(106);
          }
          if ((this.field_r == 2 ||
            42 == this.field_r) && lb.field_gc == 1) {
            vd.field_b = true;
            if (10 != di.field_g ||
              qh.field_Yb != 0) {
              this.k(-1589);
              if (var18 != 0) {
                dl.field_M = 1;
                qh.field_Yb = 1;
              }
            } else {
              dl.field_M = 1;
              qh.field_Yb = 1;
            }
          }
          if (this.field_r == 3 &&
            lb.field_gc == 1) {
            vd.field_b = true;
          }
          if (this.field_r == 4 &&
            lb.field_gc == 1) {
            vd.field_b = true;
            g.field_c.g(100);
            g.field_c = null;
            var9 = 2 * ll.field_q;
            if (256 < var9) {
              var9 = 256;
            }
            ef.a(1, var9);
          }
          if (di.field_g == 4 &&
            lb.field_gc == 1) {
            this.d(91);
          }
          if (27 == this.field_r &&
            lb.field_gc == 1) {
            vd.field_b = true;
            CombatWorld.c(-2483, 95);
            this.field_h = false;
          }
          if (this.field_r == 30 &&
            1 == lb.field_gc) {
            vd.field_b = true;
            CombatWorld.c(-2483, 95);
            if (ob.field_y) {
              var9 = vb.field_g;
              if (5 == var9 ||
                var9 == 6 ||
                var9 == 8) {
                var9 = SceneWidget.field_Jb;
              }
              q.a(-5, true, -1, var9);
            }
            if (CombatWorld.field_G) {
              ei.a(0, (byte) -23, 11);
            }
          }
          if (this.field_r == 29 &&
            lb.field_gc == 1) {
            vd.field_b = true;
            CombatWorld.c(-2483, 95);
            fk.field_i.a(false);
            q.a(-1, true, -1, 0);
          }
          if (31 == this.field_r &&
            lb.field_gc == 1) {
            vd.field_b = true;
            CombatWorld.c(-2483, 95);
            v.a(-1, (String) null, 10);
          }
          if (this.field_r == 32 &&
            lb.field_gc == 1) {
            vd.field_b = true;
            fm.field_f[0] = 0;
            var9 = 0;
            do {
              if (!(rn.field_D.length > var9)) {
                var9 = 0;
                break;
              }
              rn.field_D[var9] = 0;
              var9++;
            } while (var18 == 0);
            do {
              if (!(var9 < fe.field_D.length)) {
                Sprite.field_k = false;
                ol.field_Ub = 0;
                lc.field_e = true;
                var9 = vb.field_g;
                break;
              }
              fe.field_D[var9] = 0;
              var9++;
            } while (var18 == 0);
            if (var9 == 5 ||
              var9 == 6 ||
              var9 == 8) {
              var9 = SceneWidget.field_Jb;
            }
            q.a(0, false, -1, var9);
          }
          if (this.field_r == 40 &&
            lb.field_gc == 1) {
            sh.a(-3, true, true);
          }
          if (this.field_d) {
            hj.field_s = sg.field_b;
            if (!vl.field_v) {
              if (ln.field_e > 1) {
                hj.field_s = db.a(cj.field_b, -80, new String[]{Integer.toString(ln.field_e)});
                if (var18 != 0) {
                  if (1 == ln.field_e) {
                    hj.field_s = gb.field_b;
                    hj.field_s = ci.field_d;
                  } else {
                    hj.field_s = ci.field_d;
                  }
                }
              } else {
                if (1 == ln.field_e) {
                  hj.field_s = gb.field_b;
                  if (var18 != 0) {
                    hj.field_s = ci.field_d;
                  }
                } else {
                  hj.field_s = ci.field_d;
                }
              }
            }
            var9 = fk.field_d.c(hj.field_s.toUpperCase());
            jl.field_c = jl.field_c + 0.05000000074505806f * ((float)var9 - jl.field_c);
          }
          if (!this.field_d ||
            !param1 ||
            jn.field_g) {
            bb.field_T = false;
            if (var18 == 0) {
              return;
            }
          }
          var9 = 24;
          var10 = 356;
          if (vl.field_v) {
            var10 = 336;
          }
          boolean decompiledFrameRemainder13 = true;
          bb.field_T = false;
          if ((!bb.field_T ||
            !param1) && (!(ln.field_e > 0) ||
            !(a.field_c % 40 < 20))) {
            stackIn_2059_0 = 0;
            decompiledFrameRemainder13 = false;
          }
          else {
            stackIn_2059_0 = 1;
          }
          var11 = stackIn_2059_0;
          if (var11 == 0) {
            stackIn_2063_0 = co.field_d;
          } else {
            stackIn_2063_0 = be.field_f;
          }
          var12 = stackIn_2063_0;
          var13 = var12[0].field_A + ((int)jl.field_c + var12[2].field_A);
          if (oh.field_f >= 0 &&
            var13 > oh.field_f &&
            pi.field_c >= var10 &&
            pi.field_c < (var9 + var10)) {
            bb.field_T = true;
            this.field_r = 0;
          }
          if (lb.field_gc == 1 &&
            bb.field_T) {
            stackIn_2086_0 = !(vl.field_v);
            vl.field_v = stackIn_2086_0;
            if (vl.field_v) {
              ln.field_e = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "nb.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_276_0 = 0;
        fh stackIn_279_0;
        String stackIn_279_1;
        int stackIn_279_2;
        int stackIn_279_3;
        int stackIn_280_4 = 0;
        int stackIn_284_0 = 0;
        int stackIn_288_1 = 0;
        int stackIn_291_2 = 0;
        int stackIn_292_3;
        int stackIn_303_0 = 0;
        fh stackIn_306_0;
        String stackIn_306_1;
        int stackIn_306_2;
        int stackIn_306_3;
        int stackIn_307_4 = 0;
        int stackIn_311_0 = 0;
        int stackIn_315_1 = 0;
        int stackIn_318_2 = 0;
        int stackIn_319_3;
        int stackIn_342_0 = 0;
        fh stackIn_347_0;
        String stackIn_347_1;
        int stackIn_347_2;
        int stackIn_347_3;
        int stackIn_348_4 = 0;
        int stackIn_352_0 = 0;
        int stackIn_356_1 = 0;
        int stackIn_359_2 = 0;
        int stackIn_360_3;
        int stackIn_374_0 = 0;
        fh stackIn_377_0;
        String stackIn_377_1;
        int stackIn_377_2;
        int stackIn_377_3;
        int stackIn_378_4 = 0;
        int stackIn_382_0 = 0;
        int stackIn_386_1 = 0;
        int stackIn_389_2 = 0;
        int stackIn_390_3;
        int stackIn_415_0 = 0;
        int stackIn_415_1 = 0;
        int stackIn_426_0 = 0;
        int stackIn_426_1 = 0;
        int stackIn_445_0 = 0;
        int stackIn_445_1 = 0;
        int stackIn_459_0 = 0;
        int stackIn_459_1 = 0;
        int stackIn_481_0 = 0;
        int stackIn_481_1 = 0;
        fh stackIn_500_0;
        String stackIn_500_1;
        int stackIn_500_2;
        int stackIn_500_3;
        int stackIn_501_4 = 0;
        fh stackIn_505_0;
        String stackIn_505_1;
        int stackIn_505_2;
        int stackIn_505_3;
        int stackIn_506_4;
        int stackIn_512_0 = 0;
        String stackIn_536_0 = null;
        Sentinel stackIn_649_0 = null;
        ne stackIn_662_0 = null;
        Object stackIn_682_0 = null;
        boolean stackIn_694_0 = false;
        int stackIn_701_0 = 0;
        int stackIn_702_0 = 0;
        int stackIn_702_1 = 0;
        int stackIn_703_0 = 0;
        int stackIn_703_1 = 0;
        int stackIn_780_0 = 0;
        int stackIn_780_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ne stackOut_661_0;
        boolean stackOut_693_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        String var25_ref_String = null;
        BattleTerrain var25_ref_hd = null;
        int var26 = 0;
        Sentinel var26_ref_mb = null;
        ne var26_ref_ne = null;
        Projectile var26_ref_wl = null;
        Explosion var26_ref_jb = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        RgbSprite var29_ref_wk = null;
        SentinelCommand var29_ref_je = null;
        int var30 = 0;
        String var30_ref_String = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        Sentinel var26_ref_mbLifetime1;
        int stackIn_415_0Lifetime1;
        int stackIn_415_1Lifetime1;
        int stackIn_445_0Lifetime1;
        int stackIn_445_1Lifetime1;
        int stackIn_481_0Lifetime1;
        int stackIn_481_1Lifetime1;
        int stackIn_780_0Lifetime1;
        int stackIn_780_1Lifetime1;
        int var6Lifetime1;
        int var25Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        int var38Lifetime1;
        int var33Lifetime2;
        int var33Lifetime3;
        int var34Lifetime2;
        int var34Lifetime3;
        int var35Lifetime2;
        int var25Lifetime1Lifetime1;
        var40 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameRemainder4 = true;
          var3_int = 1;
          var4 = 1;
          var5 = 1;
          var6 = di.field_g;
          if (var6 == 0) {
            var4 = 0;
            stackIn_14_0 = (qh.field_Yb < 8) ? 0 : 1;
            var5 = stackIn_14_0;
            var3_int = 0;
            decompiledFrameRemainder4 = (var40 != 0);
          } else {
            decompiledFrameRemainder4 = (1 != var6);
            if (decompiledFrameRemainder4) {
              decompiledFrameRemainder4 = (var6 == 3);
            }
          }
          if (decompiledFrameRemainder4) {
            stackIn_21_0 = (qh.field_Yb < 5) ? 0 : 1;
            var5 = stackIn_21_0;
            if (qh.field_Yb == 3 &&
              (31 & a.field_c) > 24 &&
              this.controlledSentinel.field_ub >= 0) {
              var4 = 0;
            }
          }
          if (!sj.a(true) &&
            CipherPacketBuffer.field_w <= 0) {
            stackIn_36_0 = 0;
          } else {
            stackIn_36_0 = 1;
          }
          var6Lifetime1 = stackIn_36_0;
          if (this.field_r == -1 &&
            var6Lifetime1 != 0) {
            this.field_r = 0;
          }
          if (this.controlledSentinel != null) {
            SoftwareRaster.a(3, 423, 71, 54, 0);
            SoftwareRaster.a(77, 423, 77, 54, 0);
            SoftwareRaster.e(4, 424, 69, 26, 0, 1052688);
          }
          if (param1 != 1956917985) {
            this.a(116, -87, -26);
          }
          if (this.controlledSentinel != null) {
            if (!this.controlledSentinel.hasModuleType(24, -27)) {
            }
            if (!this.controlledSentinel.hasModuleType(16, -27)) {
            }
            if (this.controlledSentinel.hasModuleType(15, -27)) {
            }
            if (this.controlledSentinel.field_fb != 0) {
            }
          }
          var7 = 138;
          var8 = 138;
          var9 = 1;
          var10 = 41;
          var11 = 3;
          var14 = -var9 + var7 - var11;
          var12 = var11;
          var13 = var11 + 385;
          if (null == this.controlledSentinel &&
            !this.world.field_j) {
            var16_ref_String = ri.field_d;
            if (0 < this.world.playerNames.length &&
              null != this.world.playerNames[0]) {
              var16_ref_String = db.a(FunOrbClient.field_o, -30, new String[]{this.world.playerNames[0]});
            }
            var17 = this.field_M[0];
            if (var17 == 7196927) {
              var17 = 26248;
            }
            pl.field_U.a(var16_ref_String, 320, 405, var17, -1);
          }
          var15 = var10 - var9 - var11;
          if (this.controlledSentinel != null) {
            var16 = 6;
            var17 = 427;
            fk.field_d.b(Sentinel.field_I, var16, var17 + 9, 1021128, -1);
            var16 = var16 + (2 + fk.field_d.c(Sentinel.field_I));
            qg.field_f[3].a(var16, var17);
            var17 += 22;
            var16 = 6;
            var18 = 1021128;
            if (null != this.controlledSentinel &&
              this.controlledSentinel.field_Dc > 0) {
              var18 = 8421504;
            }
            fk.field_d.b(l.field_f, var16, 9 + var17, var18, -1);
            var17 += 13;
            if (dm.field_c) {
              qg.field_f[5].a(var16, var17);
              var16 += 14;
              if (var40 != 0) {
                qg.field_f[4].a(var16, var17);
                var16 += 13;
              }
            } else {
              qg.field_f[4].a(var16, var17);
              var16 += 13;
            }
            fk.field_d.b(fg.field_Pb, var16, 9 + var17, 10526880, -1);
            var16 = var16 + (fk.field_d.c(fg.field_Pb) + 2);
            bc.field_wb.f(var16, var17);
            var16 = var16 + (2 + bc.field_wb.field_A);
            fk.field_d.b("+", var16, 9 + var17, 10526880, -1);
            var16 = var16 + fk.field_d.c("+");
            qg.field_f[3].a(var16, var17);
          }
          if (this.controlledSentinel != null) {
            var14 = -var8 + (640 - var7);
            var13 = 385 + var11;
            var12 = var7;
            var15 = var10 + (-var9 - var11);
            if (this.controlledSentinel.field_pc &&
              this.controlledSentinel.field_Qb > 0 &&
              this.controlledSentinel.field_Qb < 100 &&
              this.controlledSentinel.field_Qb < this.world.simulationTick) {
              var4 = 0;
              var3_int = 0;
            }
            if (this.field_F >= this.controlledSentinel.field_Xb.length) {
              this.field_F = 0;
            }
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted8 = true;
            boolean decompiledFrameCompleted7 = true;
            var13 = 383;
            var18 = 190;
            var19 = -var18 + 640;
            if (!vl.field_v &&
              var5 != 0) {
              SoftwareRaster.a(var18, 0, var19, 480);
              var20 = -5;
              var21 = 6;
              var22 = 30;
              var23 = 1;
              var24 = 320;
              var25 = 0;
              var26 = 0;
              var27 = var20;
              while (var27 <= var21) {
                var28 = this.field_F + var27;
                stackIn_254_0 = 0;
                stackIn_254_1 = var28;
                if (var40 != 0) {
                  decompiledFrameCompleted8 = false;
                  break;
                }
                boolean decompiledFrameRemainder11 = true;
                if (stackIn_254_0 <= stackIn_254_1 &&
                  var28 < this.controlledSentinel.field_Xb.length) {
                  var16 = var24 + var27 * (var23 + var22);
                  var29 = this.controlledSentinel.field_Xb[var28];
                  var17 = var15 / 2 + var13;
                  if (var27 < 0) {
                    var16 -= 22;
                  }
                  if (var27 > 0) {
                    var16 += 22;
                  }
                  this.controlledSentinel.chassis.d(65536, var29);
                  if (var27 == 0) {
                    var17--;
                  }
                  if (var18 > var16) {
                    var25 = 1;
                  } else {
                    if (var19 < var16) {
                      var26 = 1;
                    } else {
                      if (var27 == 0) {
                        if (eh.field_b[ed.field_f] > 0) {
                          hb.field_j[this.field_M[3] + var29].d(var16, var17, 0, 4096);
                          if (gl.field_p > 0) {
                            var30 = 40 * gl.field_p / (50 * eh.field_b[ed.field_f]);
                            SoftwareRaster.c(var16 - 20, -20 + var17, 40, var30, 0, 192);
                            if (si.field_t == 0) {
                              SoftwareRaster.c(-20 + var16, var17 - 20 + var30, 40, 40 - var30, 0, 128);
                            }
                          }
                          fk.field_d.c(Integer.toString(si.field_t), 20 + var16, 17 + var17, 16777215, 0);
                        } else {
                          hb.field_j[var29 + this.field_M[3]].d(var16, var17, 0, 4096);
                          if (this.controlledSentinel.field_ub < 0 &&
                            c.a((byte) -90, var29)) {
                            SoftwareRaster.c(var16 - 20, -20 + var17, 40, 40, 0, 192);
                          } else if (!(this.controlledSentinel.charge >= 1) &&
                            var29 == 8) {
                            SoftwareRaster.c(var16 - 20, -20 + var17, 40, 40, 0, 192);
                          }
                        }
                      } else {
                        if (CipherPacketBuffer.field_w == 0 &&
                          var18 < oh.field_f &&
                          var19 > oh.field_f &&
                          oh.field_f >= -15 + var16 &&
                          (var17 - 15) <= pi.field_c &&
                          oh.field_f <= (var16 + 15) &&
                          var17 + 15 >= pi.field_c) {
                          this.field_t = var28;
                          SoftwareRaster.a(var16 << 4, var17 << 4, 320, pe.field_o.length - 1, pe.field_o);
                        }
                        if (eh.field_b[ed.field_f] > 0) {
                          hb.field_j[var29 + this.field_M[3]].d(var16, var17, 0, var22 * 4096 / 40);
                          if (gl.field_p > 0) {
                            var30 = var22 * gl.field_p / (50 * eh.field_b[ed.field_f]);
                            SoftwareRaster.c(var16 - var22 / 2, -(var22 / 2) + var17, var22, var30, 0, 192);
                            if (0 == si.field_t) {
                              SoftwareRaster.c(-(var22 / 2) + var16, var30 + var17 - var22 / 2, var22, -var30 + var22, 0, 128);
                            }
                          }
                          fk.field_d.c(Integer.toString(si.field_t), 15 + var16, 14 + var17, 16777215, 0);
                        } else {
                          hb.field_j[this.field_M[3] + var29].d(var16, var17, 0, 4096 * var22 / 40);
                          if (!(this.controlledSentinel.field_ub < 0) ||
                            !c.a((byte) -101, var29)) {
                            if (!(this.controlledSentinel.charge >= 1) &&
                              var29 == 8) {
                              SoftwareRaster.c(-(var22 / 2) + var16, var17 - var22 / 2, var22, var22, 0, 192);
                            }
                          } else {
                            SoftwareRaster.c(var16 - var22 / 2, -(var22 / 2) + var17, var22, var22, 0, 192);
                          }
                        }
                      }
                      if (var27 != -1) {
                        if ((var27 == 1)) {
                          var30 = 0;
                          while (var30 < 11) {
                            SoftwareRaster.d(var16 + (-var30 - 21), var17 - var30, var30 * 2 + 1, 10066329);
                            var30++;
                          }
                          fk.field_d.a(ob.field_w, -12 + var16 - var22 / 2, 4 + var17, 0, -1);
                        }
                        decompiledFrameRemainder11 = false;
                      }
                      else {
                        var30 = 0;
                        while (var30 < 11) {
                          SoftwareRaster.d(var16 + (var30 + 20), var17 - var30, 2 * var30 + 1, 10066329);
                          var30++;
                        }
                        fk.field_d.a(gf.field_e, var22 / 2 + (var16 + 12), var17 + 4, 0, -1);
                      }
                    }
                  }
                }
                var27++;
              }
              if (decompiledFrameCompleted8) {
                SoftwareRaster.c();
                if (var25 != 0) {
                  var27 = 0;
                  while (var27 < 5) {
                    SoftwareRaster.d(var18 + var27 - 6, -var27 + 400, 2 * var27 + 1, 10066329);
                    var27++;
                    if (var40 != 0) {
                      decompiledFrameCompleted7 = false;
                      break;
                    }
                  }
                }
                if ((decompiledFrameCompleted7) &&
                  (var26 != 0)) {
                  var27 = 0;
                  while (var27 < 5) {
                    SoftwareRaster.d(6 - var27 + var19, -var27 + 400, var27 * 2 + 1, 10066329);
                    var27++;
                    if (var40 != 0) {
                      decompiledFrameCompleted6 = false;
                      break;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted8) &&
              (decompiledFrameCompleted6)) {
              stackIn_254_0 = ~var8;
              stackIn_254_1 = -1;
            }
            if ((decompiledFrameCompleted6) &&
              (decompiledFrameRemainder3 = !(stackIn_254_0 >= stackIn_254_1))) {
              var20 = 487;
              var21 = 423;
              var22 = 54;
              var23 = 150;
              var24 = 3;
              var25 = (-(var24 * 4) + var23) / 4;
              var26 = var24 + var20;
              SoftwareRaster.a(var20, var21, var23, var22, 0);
              var27 = var21 + 3;
              var13 = var11 + 385;
              var15 = -var9 + var10 - var11;
              var14 = var8 - (var11 + var9);
              var12 = -var8 + 640 + var9;
            }
            if (decompiledFrameRemainder3) {
              var28 = 0;
              while (var28 < 4) {
                SoftwareRaster.e(var26, var27, var25, 25, 1776411, 2565927);
                SoftwareRaster.e(var26, 25 + var27, var25, var22 + (-25 - 2 * var24), 1644825, 2631720);
                var26 = var26 + (var25 + var24);
                var28++;
                if (var40 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted5) {
                var17 = var15 / 2 + var21 + 12;
                var16 = 17 - var25 + (-var24 + var26);
                var28 = var25 + var24;
                if (this.controlledSentinel.hasModuleType(24, -27)) {
                  boolean decompiledFrameRemainder9 = true;
                  IsaacRandom.field_d[24].c(var16 - 10, var17 - 14);
                  if ((!(this.controlledSentinel.field_ub >= 0) ||
                    !(this.controlledSentinel.charge >= 5)) && this.controlledSentinel.activeModuleType != 24) {
                    stackIn_276_0 = 1;
                    decompiledFrameRemainder9 = false;
                  }
                  else {
                    stackIn_276_0 = 0;
                  }
                  var29 = stackIn_276_0;
                  stackIn_279_0 = fk.field_d;
                  stackIn_279_1 = bl.field_o;
                  stackIn_279_2 = var16;
                  stackIn_279_3 = -15 + var17;
                  if (var29 == 0) {
                    stackIn_280_4 = 30651;
                  } else {
                    stackIn_280_4 = 13158;
                  }
                  ((fh) (Object) stackIn_279_0).a(stackIn_279_1, stackIn_279_2, stackIn_279_3, stackIn_280_4, 0);
                  stackIn_284_0 = (var29 != 0) ? 6710886 : 10724259;
                  if (var29 == 0) {
                    stackIn_288_1 = 0;
                  } else {
                    stackIn_288_1 = 2236962;
                  }
                  stackIn_291_2 = 18 + var17;
                  if (var29 == 0) {
                    stackIn_292_3 = 8158332;
                  } else {
                    stackIn_292_3 = 4473924;
                  }
                  kb.a(stackIn_284_0, stackIn_288_1, stackIn_291_2, stackIn_292_3, true, IntrusiveNode.field_n, fk.field_d, var16);
                  var16 = var16 - var28;
                }
                if (this.controlledSentinel.hasModuleType(15, -27)) {
                  IsaacRandom.field_d[15].c(-10 + var16, var17 - 14);
                  if (0 <= this.controlledSentinel.field_ub &&
                    0 >= this.controlledSentinel.field_Yb) {
                    stackIn_303_0 = 0;
                  } else {
                    stackIn_303_0 = 1;
                  }
                  var29 = stackIn_303_0;
                  stackIn_306_0 = fk.field_d;
                  stackIn_306_1 = sf.field_v;
                  stackIn_306_2 = var16;
                  stackIn_306_3 = -15 + var17;
                  if (var29 == 0) {
                    stackIn_307_4 = 30651;
                  } else {
                    stackIn_307_4 = 13158;
                  }
                  ((fh) (Object) stackIn_306_0).a(stackIn_306_1, stackIn_306_2, stackIn_306_3, stackIn_307_4, 0);
                  stackIn_311_0 = (var29 == 0) ? 10724259 : 6710886;
                  if (var29 != 0) {
                    stackIn_315_1 = 2236962;
                  } else {
                    stackIn_315_1 = 0;
                  }
                  stackIn_318_2 = 18 + var17;
                  if (var29 != 0) {
                    stackIn_319_3 = 4473924;
                  } else {
                    stackIn_319_3 = 8158332;
                  }
                  kb.a(stackIn_311_0, stackIn_315_1, stackIn_318_2, stackIn_319_3, true, dc.field_d, fk.field_d, var16);
                  var16 = var16 - var28;
                }
                if (this.controlledSentinel.hasModuleType(16, -27)) {
                  if (Math.abs(oh.field_f - var16) < 16 &&
                    Math.abs(-var17 + pi.field_c + 1) < 17 &&
                    this.controlledSentinel.field_Vb != null) {
                    NodeIterator.field_k = true;
                    if (var40 != 0) {
                      NodeIterator.field_k = false;
                    }
                  } else {
                    NodeIterator.field_k = false;
                  }
                  IsaacRandom.field_d[16].c(var16 - 10, var17 - 14);
                  if (!NodeIterator.field_k &&
                    this.controlledSentinel.field_ub < 0) {
                    stackIn_342_0 = 1;
                  } else {
                    stackIn_342_0 = 0;
                  }
                  var29 = stackIn_342_0;
                  var30_ref_String = sn.field_a;
                  if (NodeIterator.field_k) {
                    var30_ref_String = id.field_Zb;
                  }
                  stackIn_347_0 = fk.field_d;
                  stackIn_347_1 = se.field_d;
                  stackIn_347_2 = var16;
                  stackIn_347_3 = -15 + var17;
                  if (var29 != 0) {
                    stackIn_348_4 = 13158;
                  } else {
                    stackIn_348_4 = 30651;
                  }
                  ((fh) (Object) stackIn_347_0).a(stackIn_347_1, stackIn_347_2, stackIn_347_3, stackIn_348_4, 0);
                  stackIn_352_0 = (var29 == 0) ? 10724259 : 6710886;
                  if (var29 != 0) {
                    stackIn_356_1 = 2236962;
                  } else {
                    stackIn_356_1 = 0;
                  }
                  stackIn_359_2 = var17 + 18;
                  if (var29 != 0) {
                    stackIn_360_3 = 4473924;
                  } else {
                    stackIn_360_3 = 8158332;
                  }
                  kb.a(stackIn_352_0, stackIn_356_1, stackIn_359_2, stackIn_360_3, true, var30_ref_String, fk.field_d, var16);
                  var16 = var16 - var28;
                }
                if (this.controlledSentinel.field_fb != 0) {
                  boolean decompiledFrameRemainder8 = true;
                  if (this.controlledSentinel.field_ub >= 0 && (3 != this.controlledSentinel.field_fb ||
                    !(10 > this.controlledSentinel.charge))) {
                    stackIn_374_0 = 0;
                    decompiledFrameRemainder8 = false;
                  }
                  else {
                    stackIn_374_0 = 1;
                  }
                  var29 = stackIn_374_0;
                  hb.field_j[this.controlledSentinel.field_fb + 19].b(var16 - 10, var17 - 14);
                  stackIn_377_0 = fk.field_d;
                  stackIn_377_1 = fk.field_l;
                  stackIn_377_2 = var16;
                  stackIn_377_3 = -15 + var17;
                  if (var29 != 0) {
                    stackIn_378_4 = 13158;
                  } else {
                    stackIn_378_4 = 30651;
                  }
                  ((fh) (Object) stackIn_377_0).a(stackIn_377_1, stackIn_377_2, stackIn_377_3, stackIn_378_4, 0);
                  stackIn_382_0 = (var29 == 0) ? 10724259 : 6710886;
                  if (var29 != 0) {
                    stackIn_386_1 = 2236962;
                  } else {
                    stackIn_386_1 = 0;
                  }
                  stackIn_389_2 = var17 + 18;
                  if (var29 == 0) {
                    stackIn_390_3 = 8158332;
                  } else {
                    stackIn_390_3 = 4473924;
                  }
                  kb.a(stackIn_382_0, stackIn_386_1, stackIn_389_2, stackIn_390_3, true, jf.field_eb, fk.field_d, var16);
                }
              }
            }
            if (decompiledFrameCompleted5) {
              var14 = 640 - var11 * 2;
              var15 = 95 + (-var11 - var10);
              var12 = var11;
              var13 = 385 + var10;
              var13 += 2;
              var13 = 395;
              var20 = 10;
              var21 = 120;
              var22 = Math.max(fk.field_d.c(tj.field_d), fk.field_d.c(vg.field_e));
              var23 = var22 + (var20 + 10);
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted2 = true;
            regionExit1: {
              boolean decompiledFrameCompleted3 = true;
              if (var3_int != 0) {
                fk.field_d.b(tj.field_d, var9 + var20, var13 + 18, 52224, -1);
                var24 = Math.max(this.controlledSentinel.field_Q, this.controlledSentinel.maximumArmour) + 100;
                var25 = 12;
                var26 = var24 / 100;
                var27 = var13 + 6;
                if (var21 < (var25 * var26)) {
                  var25 = var21 / var26;
                }
                var28 = 16;
                if (var25 == 0) {
                  var25 = 1;
                }
                SoftwareRaster.a(var23, var27, var25 * this.controlledSentinel.maximumArmour / 100 + var23, var27 + var28);
                SoftwareRaster.a(var23, var27, var25 * var26, var28, 0);
                SoftwareRaster.a(var23, var27, var25 * this.controlledSentinel.armour / 100 + var23, var28 + var27);
                var29 = 8;
                var30 = 0;
                scanLoop2: while (true) {
                  boolean decompiledFrameRemainder7 = true;
                  if (var26 >= var30) {
                    var31 = var30 * var25 + var23;
                    SoftwareRaster.e(var31, var27, var25, var29, 100611, 514822);
                    SoftwareRaster.g(var31, var29 + var27, var25, 501766);
                    SoftwareRaster.e(var31, var27 + var29 + 1, var25, -var29 + var28 - 1, 487430, 93952);
                    stackIn_415_0 = ~var25;
                    stackIn_415_1 = -5;
                    if (var40 != 0) {
                      if (stackIn_415_0 > stackIn_415_1) {
                        stackIn_426_0 = ~var25;
                        stackIn_426_1 = -2;
                        break scanLoop2;
                      }
                      decompiledFrameRemainder7 = false;
                    }
                    else {
                      if (stackIn_415_0 < stackIn_415_1) {
                        var32 = 1 + var31;
                        while ((var31 + var25) > var32) {
                          SoftwareRaster.f(var32, var27, var28, 0, 100);
                          var32 += 2;
                        }
                      }
                      var30++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder7) {
                    var30 = 0;
                    while (true) {
                      stackIn_415_0Lifetime1 = ~var30;
                      stackIn_415_1Lifetime1 = ~var26;
                      if (stackIn_415_0Lifetime1 <= stackIn_415_1Lifetime1) {
                        break;
                      }
                      stackIn_426_0 = ~var25;
                      stackIn_426_1 = -2;
                      if (var40 != 0) {
                        break scanLoop2;
                      }
                      if (stackIn_426_0 < stackIn_426_1) {
                        SoftwareRaster.d(var25 * var30 + var23, var27, var28, 0);
                      }
                      var30++;
                    }
                  }
                  SoftwareRaster.c();
                  stackIn_426_0 = 38;
                  stackIn_426_1 = this.controlledSentinel.activeModuleType;
                  break;
                }
                if (stackIn_426_0 == stackIn_426_1) {
                  var30 = 127 + (int)(Math.sin(0.2 * (double)this.world.simulationTick) * 128.0);
                  SoftwareRaster.a(var23, var27, var21, var28, 65280 + 65537 * var30);
                }
                var30 = 8 + var27;
                var31 = var28 - 8;
                SoftwareRaster.a(var23, var30, var25 * this.controlledSentinel.field_Q / 100 + var23, var30 + var31);
                SoftwareRaster.c(var23, var30, this.controlledSentinel.field_Q * var25 / 100, 0, 192);
                SoftwareRaster.a(var23, var30, var26 * var25, var31, 0);
                SoftwareRaster.a(var23, var30, var25 * this.controlledSentinel.field_S / 100 + var23, var31 + var30);
                var32 = 0;
                while (var26 >= var32) {
                  var33 = var25 * var32 + var23;
                  SoftwareRaster.a(var33, var30 + 1, var25, var31, 2138367);
                  stackIn_445_0 = ~var25;
                  stackIn_445_1 = -5;
                  if (var40 != 0) {
                    if (stackIn_445_0 <= stackIn_445_1) {
                      stackIn_459_0 = 1;
                      stackIn_459_1 = var25;
                      decompiledFrameCompleted4 = false;
                      break;
                    }
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_445_0 < stackIn_445_1) {
                    var34 = 1 + var33;
                    while (var34 < var33 + var25) {
                      SoftwareRaster.f(var34, var27, var28, 0, 100);
                      var34 += 2;
                    }
                  }
                  var32++;
                }
                if ((decompiledFrameCompleted4) &&
                  (decompiledFrameCompleted3)) {
                  SoftwareRaster.c();
                  var32 = 0;
                  while (true) {
                    stackIn_445_0Lifetime1 = ~(this.controlledSentinel.field_Q / 100);
                    stackIn_445_1Lifetime1 = ~var32;
                    if (stackIn_445_0Lifetime1 > stackIn_445_1Lifetime1) {
                      break;
                    }
                    stackIn_459_0 = 1;
                    stackIn_459_1 = var25;
                    if (var40 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    if (stackIn_459_0 < stackIn_459_1) {
                      SoftwareRaster.d(var25 * var32 + var23, var30, var31, 0);
                    }
                    var32++;
                  }
                }
              }
            }
            if (((decompiledFrameCompleted4) && (decompiledFrameCompleted2)) &&
              (decompiledFrameRemainder2 = (var4 != 0))) {
              fk.field_d.c(vg.field_e, 630 - var9, 18 + var13, 16736304, -1);
              var24 = -var22 + 620;
              var25 = 100 * this.controlledSentinel.maximumCharge;
              var26 = this.controlledSentinel.field_ub / 30 + this.controlledSentinel.charge * 100;
              var27 = 100 + var25;
              var28 = 12;
              var29 = var27 / 100;
              var30 = 6 + var13;
              var31 = 16;
              var32 = 8;
              stackIn_459_0 = ~var21;
              stackIn_459_1 = ~(var28 * var29);
            }
            if (decompiledFrameRemainder2) {
              if (stackIn_459_0 > stackIn_459_1) {
                var28 = var21 / var29;
              }
              SoftwareRaster.a(-(var25 * var28 / 100) + var24, var30, var24, var30 + var31);
              SoftwareRaster.a(-(var28 * var29) + var24, var30, var29 * var28, var31, 0);
              SoftwareRaster.a(var24 - var26 * var28 / 100, var30, var24, var30 + var31);
              var33Lifetime2 = 0;
              var34Lifetime2 = 0;
              var35 = 0;
              if (this.controlledSentinel.field_mc <= 0) {
                var33Lifetime3 = 16711680;
                var34Lifetime3 = 16744448;
                var35Lifetime2 = 4210688;
                if (var40 != 0) {
                  var33Lifetime3 = 128;
                  var34Lifetime3 = 255;
                  var35Lifetime2 = 128;
                }
              } else {
                var33Lifetime3 = 128;
                var34Lifetime3 = 255;
                var35Lifetime2 = 128;
              }
              var36 = 0;
              while (true) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder6 = true;
                boolean decompiledFrameCompleted1 = true;
                boolean decompiledFrameRemainder5 = true;
                if (var29 >= var36) {
                  var37 = -((var36 + 1) * var28) + var24;
                  SoftwareRaster.e(var37, var30, var28, var32, var33Lifetime3, var34Lifetime3);
                  SoftwareRaster.e(var37, var32 + var30, var28, var31 - var32, var34Lifetime3, var35Lifetime2);
                  stackIn_481_0 = -5;
                  stackIn_481_1 = ~var28;
                  if (var40 != 0) {
                    if (stackIn_481_0 > stackIn_481_1) {
                      SoftwareRaster.d(-((1 + var36) * var28) + var24, var30, var31, 0);
                      var36++;
                      decompiledFrameRemainder6 = false;
                    }
                    else {
                      decompiledFrameRemainder5 = false;
                    }
                  }
                  if ((decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5)) {
                    if (stackIn_481_0 > stackIn_481_1) {
                      var38 = 1 + var37;
                      while (var37 + var28 > var38) {
                        SoftwareRaster.f(var38, var30, var31, 0, 100);
                        var38 += 2;
                      }
                    }
                    var36++;
                    continue;
                  }
                }
                if ((decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5)) {
                  var36 = 0;
                  while (true) {
                    stackIn_481_0Lifetime1 = ~var36;
                    stackIn_481_1Lifetime1 = ~var29;
                    if (stackIn_481_0Lifetime1 <= stackIn_481_1Lifetime1) {
                      break;
                    }
                    SoftwareRaster.d(-((1 + var36) * var28) + var24, var30, var31, 0);
                    var36++;
                    if (var40 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                }
                if (((decompiledFrameRemainder6) && (decompiledFrameCompleted1)) &&
                  (decompiledFrameRemainder1 = (this.controlledSentinel.activeModuleType == 37))) {
                  var36 = (int)(Math.sin((double)this.world.simulationTick * 0.2) * 64.0) + 63;
                }
                if (decompiledFrameRemainder1) {
                  SoftwareRaster.a(var24 - var21, var30, var21, var31, var36 * 513 + 16711680);
                }
                SoftwareRaster.c();
                if (0 >= this.controlledSentinel.field_mc) {
                  if (0 <= this.controlledSentinel.field_ub) {
                    break;
                  }
                  var36 = -(var28 * this.controlledSentinel.maximumCharge / 2) + var24;
                  var37 = -this.controlledSentinel.field_ub / (100 + 50 * this.controlledSentinel.field_wb);
                  stackIn_500_0 = fk.field_d;
                  stackIn_500_1 = hk.field_pc;
                  stackIn_500_2 = var36;
                  stackIn_500_3 = var30 + 6;
                  if (a.field_c % 50 < 25) {
                    stackIn_501_4 = 16777215;
                  } else {
                    stackIn_501_4 = 6316128;
                  }
                  ((fh) (Object) stackIn_500_0).a(stackIn_500_1, stackIn_500_2, stackIn_500_3, stackIn_501_4, 0);
                  fk.field_d.a(db.a(f.field_E, -62, new String[]{Integer.toString(var37)}), var36, 10 + var30 + 6, 16777215, 0);
                  if (var40 == 0) {
                    break;
                  }
                }
                var36 = var24 - var28 * this.controlledSentinel.maximumCharge / 2;
                stackIn_505_0 = fk.field_d;
                stackIn_505_1 = r.field_i;
                stackIn_505_2 = var36;
                stackIn_505_3 = 6 + var30;
                if (25 > a.field_c % 50) {
                  stackIn_506_4 = 16777215;
                } else {
                  stackIn_506_4 = 6316128;
                }
                ((fh) (Object) stackIn_505_0).a(stackIn_505_1, stackIn_505_2, stackIn_505_3, stackIn_506_4, 0);
                fk.field_d.a(db.a(f.field_E, -61, new String[]{Integer.toString(this.controlledSentinel.field_mc / 50)}), var36, 6 + (var30 + 10), 16777215, 0);
                break;
              }
            }
            this.a(463, 116, param1 ^ -1956917986);
          }
          var16 = 160;
          var17 = 320;
          stackIn_512_0 = (this.world.terrain.getTerrainType(95) == 4) ? 256 : 100;
          var18 = stackIn_512_0;
          var19 = 474;
          var20 = 48;
          var21 = -var20 + var19;
          var22 = 400;
          if (4 == this.world.terrain.getTerrainType(61)) {
            var22 = 435;
          }
          var22 = var22 - (-7680 + this.field_E) / var18;
          SoftwareRaster.a(var16 - 3, var19 - (var20 + 3), var17 + 6, 6 + var20, 0);
          var22 = var19;
          if (null != this.controlledSentinel &&
            this.controlledSentinel.activeModuleType != -1) {
            var23 = 64;
            var24 = 455;
            this.controlledSentinel.a(var24, false, var23, (byte) 45);
            if ((-10 + var23) <= oh.field_f &&
              10 + var23 > oh.field_f &&
              pi.field_c >= -30 + var24 &&
              pi.field_c < var24) {
              if (this.controlledSentinel.activeModuleType < 35) {
                stackIn_536_0 = rj.field_m[this.controlledSentinel.activeModuleType];
              } else {
                stackIn_536_0 = qj.field_v[this.controlledSentinel.activeModuleType - 35];
              }
              var25_ref_String = stackIn_536_0;
              var26 = 4 + fk.field_d.c(var25_ref_String);
              var27 = fk.field_d.field_F + fk.field_d.field_G;
              var28 = Math.max(0, var23 - var26 / 2);
              var29 = -var27 + (var24 - 30);
              SoftwareRaster.c(var28, var29, var26, var27, 0, 128);
              fk.field_d.b(var25_ref_String, var28 + 2, var29 + 10, 16777215, 0);
            }
          }
          boolean decompiledFrameCompleted10 = true;
          boolean decompiledFrameCompleted9 = true;
          boolean decompiledFrameRemainder0 = true;
          var23 = 4;
          SoftwareRaster.a(var16 + var23, var21, var17 + var16 - var23 + 3, var20 + var21);
          var24 = this.world.terrain.getProfileLength(-121);
          var25_ref_hd = this.world.terrain;
          if (this.world.terrain.getTerrainType(param1 - 1956917895) != 4) {
            var26 = this.field_M[0];
            if (65535 == (65535 & var26)) {
              var26 = 1021128;
            }
            var27 = 255;
            var28 = 0;
            while (var17 > var28) {
              var12 = var24 * var28 / var17;
              var13 = -(this.world.terrain.getGroundHeightAt((byte) -112, var12) / var18) + var22;
              var27 = -var27 + 383;
              var29 = (this.world.terrain.getGroundHeightAt((byte) -114, var12) & 63) * var27 / 64;
              SoftwareRaster.a(var28 + var16, var13, 65536 * (var29 * (16711680 & var26) >> 24) + (var29 * (65280 & var26) >> 16) * 256 + 1 * ((255 & var26) * var29 >> 8));
              SoftwareRaster.d(var16 + var28, var13 + 1, -var13 + (var19 - 1), ((65280 & var26) * var27 >> 16) * 256 + 1 * (var27 * (255 & var26) >> 8) + (var27 * (16711680 & var26) >> 24) * 65536);
              var30 = var22 - this.world.terrain.getSecondaryHeightAt(false, var12) / var18;
              var31 = var22 - this.world.terrain.getSurfaceProfileAt((byte) 119, var12) / var18;
              stackIn_703_0 = ~var30;
              stackIn_703_1 = ~var31;
              if (var40 != 0) {
                decompiledFrameCompleted10 = false;
                break;
              }
              if (stackIn_703_0 != stackIn_703_1) {
                SoftwareRaster.d(var16 + var28, var30, -var30 + var31, 65536 * ((16711680 & var26) * var27 >> 24) + (256 * (var27 * (var26 & 65280) >> 16) + (var27 * (var26 & 255) >> 8) * 1));
              }
              if (var13 != var31) {
                SoftwareRaster.d(var16 + var28, var31, var13 - var31, (var27 * (var26 & 65280) >> 17) * 256 + (1 * (var27 * (255 & var26) >> 9) + (((var26 & 16711680) >> 8) * var27 >> 17) * 65536));
              }
              var28++;
            }
            if (decompiledFrameCompleted10) {
              decompiledFrameRemainder0 = (var40 != 0);
            }
          }
          if ((decompiledFrameCompleted10) &&
            (decompiledFrameRemainder0)) {
            var26 = 0;
            while (!(var26 >= var25_ref_hd.field_c)) {
              var27 = var17 * var25_ref_hd.spawnPositions[var26] / var24 + var16;
              var15 = sb.field_W.field_B >> 4;
              var28 = -(var25_ref_hd.field_h[var26] / var18) + var22;
              var14 = var24 * sb.field_W.field_z / var17 >> 11;
              stackIn_702_0 = ~var26;
              stackIn_702_1 = -1;
              if (var40 != 0) {
                decompiledFrameCompleted9 = false;
                break;
              }
              if (stackIn_702_0 == stackIn_702_1) {
                sb.field_W.c(-(var14 / 2) + var27, var28, var14, var15);
              } else if (var26 == 1) {
                hb.field_e.c(var27 - var14 / 2, var28, var14, var15);
              } else {
                if (var25_ref_hd.field_j[var26] != -1) {
                  var29_ref_wk = kc.field_x[1][var25_ref_hd.field_j[var26]];
                  var15 = var29_ref_wk.field_B >> 5;
                  var14 = var24 * var29_ref_wk.field_z / var17 >> 13;
                  var29_ref_wk.c(-(var14 / 2) + var27, var28, var14, var15);
                }
              }
              var26++;
            }
          }
          if ((decompiledFrameCompleted10) &&
            (decompiledFrameCompleted9)) {
            var26_ref_mb = (Sentinel) (this.world.sentinels.first(param1 ^ 1956905443));
            boolean decompiledNaturalLoopExit2 = false;
            while (!(decompiledNaturalLoopExit2 = (var26_ref_mb == null))) {
              var12 = var16 + (var26_ref_mb.worldX * var17 / var24 >> 4);
              var13 = var22 + var26_ref_mb.worldY / (var18 * 16);
              stackIn_649_0 = this.controlledSentinel;
              if (var40 == 0) {
                boolean decompiledFrameRemainder10 = true;
                if (stackIn_649_0 != var26_ref_mb &&
                  !var26_ref_mb.field_Hb && (di.field_g != 0 ||
                  qh.field_Yb != 4 ||
                  !((16 & a.field_c) > 0)) && (1 != di.field_g ||
                  11 != qh.field_Yb ||
                  !((a.field_c & 16) > 0)) && 250 > var26_ref_mb.field_F && (!var26_ref_mb.field_pc ||
                  var26_ref_mb.field_Nb == 7)) {
                  var27 = var26_ref_mb.getTeamColour((byte) -125);
                  if (var27 == PartInstruction.field_t[0]) {
                    var27 = 7612277;
                  }
                  var28 = 0;
                  if (var26_ref_mb.field_Cb) {
                    if (2 == this.world.terrain.getTerrainType(116)) {
                      var28 = (int)((1.0 + Math.sin(3.141592653589793 * (double)((63 & this.world.simulationTick) * 2) / 64.0)) * 255.0 / 2.0);
                    }
                    SoftwareRaster.c(var12, var13 - 3, (int)(2.0 * Math.sin(3.141592653589793 * (double)(2 * (63 & this.world.simulationTick)) / 64.0)) + 6, var27);
                  }
                  if ((var21 + 4) <= var13) {
                    SoftwareRaster.e(var12, -3 + var13, (250 - var26_ref_mb.field_F) * 3 / 250, var27);
                    if (!(var28 <= 0)) {
                      SoftwareRaster.b(var12, -3 + var13, (250 - var26_ref_mb.field_F) * 3 / 250, 16776960, var28);
                    }
                    decompiledFrameRemainder10 = false;
                  }
                  else {
                    SoftwareRaster.g(var12, 1 + var21, 1, var27);
                    if (150 > var26_ref_mb.field_F) {
                      SoftwareRaster.g(var12 - 1, 2 + var21, 3, var27);
                    }
                    if (var26_ref_mb.field_F < 50) {
                      SoftwareRaster.g(var12 - 2, 3 + var21, 5, var27);
                    }
                    if (0 < var28) {
                      SoftwareRaster.c(var12, 1 + var21, 1, var27, var28);
                      if (var26_ref_mb.field_F < 150) {
                        SoftwareRaster.c(var12 - 1, var21 + 2, 3, 16776960, var28);
                      }
                      if (50 > var26_ref_mb.field_F) {
                        SoftwareRaster.c(var12 - 2, 3 + var21, 5, 16776960, var28);
                      }
                    }
                  }
                }
                var26_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -42));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit2) {
              stackIn_649_0 = this.controlledSentinel;
            }
            if (stackIn_649_0 != null &&
              !this.controlledSentinel.field_Hb) {
              var26_ref_mbLifetime1 = this.controlledSentinel;
              var12 = var16 + (var26_ref_mbLifetime1.worldX * var17 / var24 >> 4);
              var13 = var26_ref_mbLifetime1.worldY / (var18 * 16) + var22;
              var27 = var26_ref_mbLifetime1.getTeamColour((byte) 92);
              boolean decompiledSharedTail1 = !(var21 <= var13);
              if (!decompiledSharedTail1) {
                SoftwareRaster.e(var12, -4 + var13, 4, var27);
                SoftwareRaster.c(var12, var13 - 4, 4, 16777215);
                decompiledSharedTail1 = (var40 != 0);
              }
              if (decompiledSharedTail1) {
                SoftwareRaster.g(var12, var21 + 1, 1, var27);
                SoftwareRaster.g(-1 + var12, var21 + 2, 3, var27);
                SoftwareRaster.g(-2 + var12, 3 + var21, 5, var27);
                SoftwareRaster.g(var12 - 3, 4 + var21, 7, 16777215);
                SoftwareRaster.d(var12 - 1, 1 + var21, var12 - 3, 3 + var21, 16777215);
                SoftwareRaster.d(1 + var12, 1 + var21, 3 + var12, 3 + var21, 16777215);
              }
            }
            var26_ref_ne = (ne) (this.world.field_e.first(13058));
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (null == var26_ref_ne))) {
              var12 = var16 + (var17 * var26_ref_ne.field_z / var24 >> 4);
              var13 = var26_ref_ne.field_I / (16 * var18) + var22;
              var27 = (int)(128.0 * Math.sin((double)this.world.simulationTick / 10.0)) + 128;
              var27 = 65536 * (-var27 + 255) + var27 * 257;
              stackOut_661_0 = var26_ref_ne;
              stackIn_682_0 = stackOut_661_0;
              stackIn_662_0 = stackOut_661_0;
              if (var40 == 0) {
                var28 = stackIn_662_0.field_K / 2;
                if (var13 >= var21) {
                  if (var28 < 256) {
                    SoftwareRaster.c(var12, -6 + var13, 6, 6, var27, var28);
                    SoftwareRaster.h(var12, var13 - 6, 6, 6, 65535, var28);
                  } else {
                    SoftwareRaster.a(var12, var13 - 6, 6, 6, var27);
                    SoftwareRaster.h(var12, var13 - 6, 6, 6, 65535);
                  }
                } else if (var28 >= 256) {
                  SoftwareRaster.g(var12, 1 + var21, 1, var27);
                  SoftwareRaster.g(-1 + var12, 2 + var21, 3, var27);
                  SoftwareRaster.g(-2 + var12, 3 + var21, 5, var27);
                  SoftwareRaster.g(var12 - 3, var21 + 4, 7, var27);
                  SoftwareRaster.d(var12 - 1, var21 + 1, -3 + var12, var21 + 3, 65535);
                  SoftwareRaster.d(var12 + 1, var21 + 1, var12 + 3, var21 + 3, 65535);
                } else {
                  SoftwareRaster.c(var12, 1 + var21, 1, var27, var28);
                  SoftwareRaster.c(var12 - 1, var21 + 2, 3, var27, var28);
                  SoftwareRaster.c(var12 - 2, 3 + var21, 5, var27, var28);
                  SoftwareRaster.c(-3 + var12, 4 + var21, 7, var27, var28);
                  SoftwareRaster.b(var12 - 1, var21 + 1, var12 - 3, 3 + var21, 65535, var28);
                  SoftwareRaster.b(1 + var12, 1 + var21, var12 + 3, 3 + var21, 65535, var28);
                }
                var26_ref_ne = (ne) (this.world.field_e.next((byte) -6));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_682_0 = this.world.field_db.first(13058);
            }
            var26_ref_wl = (Projectile) (stackIn_682_0);
            do {
              if (null == var26_ref_wl) {
                if (this.controlledSentinel != null) {
                  this.a(var19, var16, param1 ^ 1956917985, var18, var24, var17, var20);
                }
                break;
              }
              var13 = var26_ref_wl.worldY / (var18 * 16) + var22;
              var12 = var16 + (var17 * var26_ref_wl.worldX / var24 >> 4);
              SoftwareRaster.a(var12, var13, 16776960);
              var26_ref_wl = (Projectile) (this.world.field_db.next((byte) -103));
            } while (var40 == 0);
            var26_ref_jb = (Explosion) (this.world.field_C.first(13058));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var26_ref_jb))) {
              var13 = var22 + var26_ref_jb.worldY / (var18 * 16);
              var12 = (var17 * var26_ref_jb.worldX / var24 >> 4) + var16;
              var27 = var26_ref_jb.field_F;
              var14 = 300 * var27 / var24 / 2;
              var15 = (var27 >> 6) / 2;
              var28 = 16746496;
              stackOut_693_0 = var26_ref_jb.field_O;
              stackIn_701_0 = stackOut_693_0 ? 1 : 0;
              stackIn_694_0 = stackOut_693_0;
              if (var40 == 0) {
                if (stackIn_694_0) {
                  var28 = 16711680;
                }
                SoftwareRaster.f(var12 - var14, var13, var12, var13 - var15, var28, 256);
                SoftwareRaster.f(var12, -var15 + var13, var14 + var12, var13, var28, 256);
                SoftwareRaster.f(var12 + var14, var13, var12, var15 + var13, var28, 256);
                SoftwareRaster.f(var12, var13 + var15, -var14 + var12, var13, var28, 256);
                var26_ref_jb = (Explosion) (this.world.field_C.next((byte) -96));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_701_0 = -1 + this.field_P * var17 / var24 + var16 + 5;
            }
            var26 = stackIn_701_0;
            var27 = var17 * (this.field_P + 9680) / var24 + var16 + 5;
            var28 = (this.field_E - 7680) / var18 + var22;
            stackIn_702_0 = var22;
            stackIn_702_1 = (this.field_E - 320) / var18;
          }
          if (decompiledFrameCompleted10) {
            var29 = stackIn_702_0 + stackIn_702_1;
            stackIn_703_0 = 4;
            stackIn_703_1 = this.world.terrain.getTerrainType(92);
          }
          if (stackIn_703_0 == stackIn_703_1) {
            var29 += 3;
            var28 += 3;
          }
          SoftwareRaster.c(var26, var28, 1 - var26 + var27, var29 - var28 + 1, 16777215, 40);
          SoftwareRaster.c();
          SoftwareRaster.d(var16 + (var17 - 2), -2 + var22 - 3, 4, 0);
          SoftwareRaster.d(-2 + var17 + (var16 - 1), var22 - 3, 2, 0);
          SoftwareRaster.d(-4 + var16 + var17, -2 + var22, 1, 0);
          SoftwareRaster.d(var16 + var17 - 5, -2 + var22, 1, 0);
          var30 = Math.max(var21 + 12, var28 + 10);
          boolean decompiledSharedTail0 = !(!dm.field_c);
          if (!decompiledSharedTail0) {
            fk.field_d.a(qe.field_f, var26 + 10 - 1, var30, 0, 0);
            fk.field_d.a(ai.field_r, 9 + var26, 6 + var30, 0, 0);
            fk.field_d.a(qe.field_f, var26 + 10, var30 - 1, 0, 0);
            fk.field_d.a(ai.field_r, 10 + var26, 5 + var30, 0, 0);
            fk.field_d.a(qe.field_f, 10 + var26, var30, this.field_M[0], -1);
            fk.field_d.a(ai.field_r, var26 + 10, var30 + 6, this.field_M[0], -1);
            decompiledSharedTail0 = (var40 != 0);
          }
          if (decompiledSharedTail0) {
            fk.field_d.a("<img=26>", 10 + var26, var30, this.field_M[0], -1);
          }
          if (di.field_g == 4) {
            this.d((byte) -86);
          }
          if (this.world.simulationTick > 50 &&
            NodeDeque.field_d >= 2) {
            if (this.field_ab) {
              dk.field_h.c("S/C checksums broken", 636, 80, 16711680, -1);
            }
            if (this.field_k) {
              dk.field_h.c("S/C score checksums broken", 636, 100, 16711680, -1);
            }
          }
          if (this.field_E > 1024) {
            this.field_E = 1024;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param0 &&
            this.controlledSentinel != null) {
            if (this.controlledSentinel.field_Xb.length <= this.field_F) {
              this.field_F = 0;
            }
            var23 = 0;
            var24 = 640;
            var25Lifetime1 = var24 - var23;
            var26 = 360;
            if (this.world.field_c != 1) {
              var27 = vk.field_h[this.world.field_c] * (var24 - var23) / 500;
              SoftwareRaster.e(var23, var26 + 2, -var27 + var24 - var23, 8, 2236962, 8772);
              SoftwareRaster.e(var23, 8 + var26 + 2, var24 - var23 - var27, 8, 68, 0);
              SoftwareRaster.e(var24 - var27, var26 + 2, var27, 8, 2236962, 16729156);
              SoftwareRaster.e(-var27 + var24, 10 + var26, var27, 8, 16729156, 0);
              var28 = 1;
              var29_ref_je = (SentinelCommand) (this.controlledSentinel.pendingCommands.first(param1 ^ 1956905443));
              while (null != var29_ref_je) {
                var30 = var29_ref_je.startTick - this.world.simulationTick;
                var31 = -this.world.simulationTick + var29_ref_je.endTick;
                var32Lifetime1 = var25Lifetime1 - var25Lifetime1 * var31 / 500;
                var33Lifetime1 = var25Lifetime1 - var25Lifetime1 * var30 / 500;
                var14 = var33Lifetime1 - var32Lifetime1;
                var34Lifetime1 = var26;
                var15 = 20;
                var35Lifetime1 = var15 / 2 - 1;
                var36Lifetime1 = -1 + var14 / 2;
                stackIn_780_0 = ~var35Lifetime1;
                stackIn_780_1 = ~var36Lifetime1;
                if (var40 != 0) {
                  if (stackIn_780_0 > stackIn_780_1) {
                    return;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_780_0 < stackIn_780_1) {
                  var35Lifetime1 = var36Lifetime1;
                }
                var37 = 65535;
                if (6 == var29_ref_je.actionType) {
                  var37 = 35071;
                }
                if (var29_ref_je.actionType == 3) {
                  var37 = 65416;
                }
                if (var29_ref_je.field_q) {
                  var37 = 8947712;
                }
                SoftwareRaster.g(var23 + var32Lifetime1, var34Lifetime1, var14, var15, var35Lifetime1, var37);
                SoftwareRaster.g(2 + (var32Lifetime1 + var23), 2 + var34Lifetime1, var14 - 4, -4 + var15, -2 + var35Lifetime1, 0);
                if (var29_ref_je.actionType == 0) {
                  var38Lifetime1 = var29_ref_je.actionVariant;
                  if (var38Lifetime1 >= 0 &&
                    var38Lifetime1 < 30) {
                    if (var28 == 0) {
                      hb.field_j[var38Lifetime1 + this.field_M[3]].b(var23 + var32Lifetime1, var34Lifetime1);
                    } else {
                      var28 = 0;
                      var39 = var32Lifetime1 - (-var23 + 20);
                      if (var39 < var23) {
                        hb.field_j[var38Lifetime1 + this.field_M[3]].a(var23, var34Lifetime1 - 20);
                      } else {
                        hb.field_j[this.field_M[3] + var38Lifetime1].b(var23 + var32Lifetime1, var34Lifetime1);
                      }
                    }
                  }
                }
                var29_ref_je = (SentinelCommand) (this.controlledSentinel.pendingCommands.next((byte) -8));
              }
            }
          }
          if (decompiledFrameCompleted0) {
            if (vl.field_v) {
              return;
            }
            var23 = 352;
            var24 = 6;
            var25Lifetime1Lifetime1 = 10;
            var26 = 0;
            fk.field_d.a(bf.field_Cb, (int[]) null);
            var27 = 0;
            while (true) {
              stackIn_780_0Lifetime1 = ~var27;
              stackIn_780_1Lifetime1 = -7;
              if (stackIn_780_0Lifetime1 <= stackIn_780_1Lifetime1) {
                break;
              }
              if (var40 != 0) {
                return;
              }
              if (null == ke.field_b[var27] &&
                var40 == 0) {
                break;
              }
              if (hh.field_c[var27] < 0) {
                var28 = 255 + 255 * hh.field_c[var27] / 50;
              } else {
                var28 = 255;
              }
              var28 = var28 * (-var27 + 6) / 6;
              var29 = fi.field_g[var27];
              var30 = 6 + fk.field_d.c(ke.field_b[var27]);
              SoftwareRaster.c(-3 + var24, var23 - fk.field_d.field_G, var30, fk.field_d.field_G, 0, var28 * 2 / 3);
              if (var30 > var26) {
                SoftwareRaster.c(var24 - (3 - var26), var23, var30 - var26, 5, 0, 2 * var28 / 3);
              }
              var26 = var30;
              fk.field_d.a(ke.field_b[var27], var24, var23, var29, 0, var28);
              var23 = var23 - var25Lifetime1Lifetime1;
              var27++;
            }
          }
          fk.field_d.a(NodeIterator.field_c, bb.field_X);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.field_k = true;
          }
          if (!this.field_d) {
            throw new IllegalStateException();
          }
          mm.field_g.writeCipheredOpcode(61, (byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.E(" + param0 + ')');
        }
    }

    private final int a(boolean param0, BattleTerrain param1, boolean param2, byte param3) {
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RgbSprite var11_ref_wk = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Sentinel var13_ref_mb = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        var20 = SteelSentinels.obfuscationControl;
        try {
          var5_int = 480;
          if (1024 < this.field_E) {
            this.field_E = 1024;
          }
          var6 = this.field_P;
          var7 = this.field_E;
          SoftwareRaster.a(0, 0, 640, 400);
          if (param3 >= -87) {
            stackIn_7_0 = 92;
            return stackIn_7_0;
          }
          var8 = -(var7 >> 4) + 400;
          var9 = -var8 + 400;
          if (var9 < 30) {
            var9 = 30;
          }
          stackIn_14_0 = (param1.getTerrainType(104) == 4) ? 0 : 1;
          boolean decompiledFrameCompleted1 = true;
          var10 = stackIn_14_0;
          if (param0 &&
            var10 != 0) {
            var11_ref_wk = bc.field_rb[this.world.terrain.getTerrainType(107)];
            var12 = 128;
            var13 = 1 + var8;
            if (var13 > 400) {
              var13 = 400;
            }
            var14 = 0;
            while (640 > var14) {
              var15 = var6 + (var14 << 4);
              var16 = param1.getGroundHeightAt((byte) -127, var15) + var7;
              var17 = param1.getSecondaryHeightAt(false, var15) + var7;
              var18 = param1.getSurfaceProfileAt((byte) 119, var15) + var7;
              stackIn_39_0 = param1.getTerrainType(70);
              stackIn_39_1 = 2;
              if (var20 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_39_0 == stackIn_39_1 &&
                -var7 + var17 > 1125) {
                var17 = 1125 + var7;
              }
              if (var16 < var17) {
                SoftwareRaster.a(var14, -(var18 >> 4) + 400, 1 + var14, -(var16 >> 4) + 400);
                SoftwareRaster.f(var14, 400 - (var18 >> 4), 400 - (-var18 + var16 >> 4) + 1, 0, 64);
                SoftwareRaster.a(var14, 401 - (var17 >> 4), 1 + var14, 400 - (var18 >> 4));
                var11_ref_wk.f(-(255 & var15 >> 4) + var14, var8 - 3 * var12);
                var11_ref_wk.f(-((var15 & 4095) >> 4) + var14, var8 - var12);
                SoftwareRaster.a(var14, 400 - (var17 >> 4) + 1, 1 + var14, 400 - (var16 >> 4));
                vi.field_R.d(-(1023 & var15 >> 2) + var14, -(var17 >> 4) + 400, 1024, 16, 128);
              }
              SoftwareRaster.a(var14, 1 - (var16 >> 4) + 400, 1 + var14, var9 + var13);
              var11_ref_wk.f(-(255 & var15 >> 4) + var14, var8 - var12 * 3);
              var11_ref_wk.f(var14 - (var15 >> 4 & 255), var8 - var12);
              vi.field_R.d(var14 - ((var15 & 4095) >> 2), 400 - (var16 >> 4), 1024, 16, 128);
              SoftwareRaster.a(var14, 400 - (var16 >> 4), var14 + 1, 1 + (400 - (var16 >> 4)));
              var19 = (var16 << 8) % 4096 * 256 / 4096;
              var11_ref_wk.b(-(255 & var15 >> 4) + var14, -(3 * var12) + var8, var19);
              var11_ref_wk.b(var14 - ((4095 & var15) >> 4), var8 - var12, var19);
              vi.field_R.d(-(1023 & var15 >> 2) + var14, -(var16 >> 4) + 400, 1024, 16, var19 * 128 / 256);
              var14++;
            }
            if (decompiledFrameCompleted1) {
              SoftwareRaster.c();
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_39_0 = this.field_P;
            stackIn_39_1 = -1702543676;
          }
          var11 = -(stackIn_39_0 >> stackIn_39_1);
          var12Lifetime1 = -(this.field_E >> 4) + 400;
          var13_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (null != var13_ref_mb) {
              var13_ref_mb.a(var12Lifetime1, 256, 16711680, this.controlledSentinel, var11);
              if (var20 == 0) {
                if (null != this.controlledSentinel &&
                  var13_ref_mb == this.controlledSentinel.field_Vb) {
                  this.controlledSentinel.a(var11, 256, 23859, var12Lifetime1);
                }
                var13_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -85));
                continue;
              }
            } else {
              if (SentinelCommand.field_o > 0 &&
                0 != he.field_k) {
                var11 = 33023;
                var12Lifetime1 = Math.min(SentinelCommand.field_o, 256);
                var13Lifetime1 = (he.field_k >> 8) - (this.field_P >> 4);
                var14Lifetime1 = 400;
                if (fk.field_c) {
                  var14Lifetime1 = var14Lifetime1 * var12Lifetime1 / 150;
                  if (SentinelCommand.field_o == 0) {
                    he.field_k = 0;
                  }
                  var12Lifetime1 = 150;
                }
                var15Lifetime1 = 0;
                while (var15Lifetime1 < 100) {
                  SoftwareRaster.f(var13Lifetime1 - var15Lifetime1, 0, var14Lifetime1, var11, var12Lifetime1);
                  var12Lifetime1 -= 4;
                  stackIn_78_0 = 0;
                  stackIn_78_1 = var12Lifetime1;
                  if (var20 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_78_0 >= stackIn_78_1) {
                    break;
                  }
                  var15Lifetime1++;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (decompiledFrameRemainder0 = !(SentinelCommand.field_o <= 0))) {
              stackIn_78_0 = -1;
              stackIn_78_1 = ~ge.field_l;
            }
            if ((decompiledFrameRemainder0) &&
              (stackIn_78_0 != stackIn_78_1)) {
              var11 = 33023;
              var12Lifetime1 = Math.min(SentinelCommand.field_o, 256);
              var13Lifetime1Lifetime1 = -(this.field_P >> 4) + (ge.field_l >> 8);
              var14Lifetime1Lifetime1 = 400;
              if (fk.field_c) {
                var14Lifetime1Lifetime1 = var14Lifetime1Lifetime1 * var12Lifetime1 / 150;
                if (SentinelCommand.field_o == 0) {
                  ge.field_l = 0;
                }
                var12Lifetime1 = 150;
              }
              var15Lifetime1Lifetime1 = 0;
              while (var15Lifetime1Lifetime1 < 100) {
                SoftwareRaster.f(var15Lifetime1Lifetime1 + var13Lifetime1Lifetime1, 0, var14Lifetime1Lifetime1, var11, var12Lifetime1);
                var12Lifetime1 -= 4;
                stackIn_95_0 = var12Lifetime1;
                if (var20 != 0) {
                  break scanLoop1;
                }
                if (stackIn_95_0 <= 4) {
                  break;
                }
                var15Lifetime1Lifetime1++;
              }
            }
            stackIn_95_0 = var5_int;
            break;
          }
          return stackIn_95_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_99_0 = var5;
          stackIn_99_1 = new StringBuilder().append("nb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static RgbSprite[] a(cm param0, byte param1, String param2, String param3) {
        RgbSprite[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RgbSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = cf.a(param2, param3, (byte) -116, param0);
          var5 = -58 / ((param1 + 18) / 32);
          var4[1].field_z = var4[1].field_A;
          var4[3].field_B = var4[3].field_F;
          var4[5].field_B = var4[5].field_F;
          var4[7].field_z = var4[7].field_A;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("nb.GA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void i(byte param0) {
        String[] array$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        Sentinel[] stackIn_130_0 = null;
        int stackIn_131_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_188_1 = 0;
        Sentinel[] stackIn_223_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        int[] stackIn_237_1 = null;
        int stackIn_238_2 = 0;
        int stackIn_242_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_283_0 = 0;
        int stackIn_361_0 = 0;
        int stackIn_361_1 = 0;
        int stackIn_370_0 = 0;
        int stackIn_370_1 = 0;
        String stackIn_401_0;
        int stackIn_401_1;
        String[] stackIn_401_2;
        String[] stackIn_401_3;
        int stackIn_401_4;
        String stackIn_402_5;
        boolean stackIn_415_0 = false;
        int stackIn_433_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_414_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        ld var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        int var10_int = 0;
        u var10 = null;
        int var11 = 0;
        Sentinel[] var12_ref_mb__ = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23_ref_int__ = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        String var28_ref_String = null;
        int var28 = 0;
        fh var28_ref_fh = null;
        int var29 = 0;
        Sentinel var29_ref_mb = null;
        String var29_ref_String = null;
        int var30 = 0;
        String var30_ref_String = null;
        int var31 = 0;
        String var31_ref_String = null;
        int var32 = 0;
        String var32_ref_String = null;
        int var33_int = 0;
        String var33 = null;
        int var34 = 0;
        RgbSprite var34_ref_wk = null;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        Object var39_ref = null;
        String var39_ref_String = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        String var48 = null;
        String var49 = null;
        int var50 = 0;
        int var51 = 0;
        Object var14Lifetime1;
        int stackIn_361_0Lifetime1;
        int stackIn_361_1Lifetime1;
        int var8Lifetime1;
        int var13Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var28Lifetime2;
        int var29Lifetime1;
        int var29Lifetime2;
        int var30Lifetime1;
        int var30Lifetime2;
        int var31Lifetime1;
        int var31Lifetime2;
        int var32Lifetime1;
        int var33_intLifetime1;
        int var33_intLifetime2;
        int var34Lifetime1;
        int var34Lifetime2;
        int var35Lifetime1;
        int var35Lifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var45Lifetime1;
        int var50Lifetime1;
        int var24Lifetime2;
        int var25Lifetime2;
        var51 = SteelSentinels.obfuscationControl;
        try {
          stackIn_5_0 = (di.field_g == -1) ? 0 : 1;
          var2_int = stackIn_5_0;
          var3 = ql.field_Tb;
          if (null == this.field_W) {
            this.h((byte) -50);
          }
          var4 = 0;
          var5 = CipherPacketBuffer.field_x;
          if (var2_int != 0 &&
            0 <= nc.field_a &&
            ni.b(122) &&
            ge.field_j == 0 &&
            ol.field_Ub == 9) {
            stackIn_24_0 = 1;
          } else {
            stackIn_24_0 = 0;
          }
          var6 = stackIn_24_0;
          if (var6 != 0) {
            var5 = ij.field_T;
          }
          if ((var6 == 0 || var51 != 0) && (var2_int != 0 &&
            nc.field_a >= 0)) {
            var5 = fg.field_Wb;
          }
          if (var2_int != 0 &&
            nc.field_a < 0) {
            var5 = bf.field_Eb;
          }
          var5 = ke.a(42, var5);
          ic.field_db.f(0, -10);
          if (var5 != null) {
            ((BitmapFont) ((Object) var3)).a(var5, 320, ((BitmapFont) ((Object) var3)).field_G / 2 + 22, 0, -1);
          }
          var7 = 375;
          if (var2_int != 0 &&
            0 <= nc.field_a &&
            ni.b(53)) {
            var7 = 310;
          }
          this.field_r = 28;
          if (var2_int == 0) {
            if (!(ed.field_j < 0)) {
              ch.a(var7, 640, 32308, 0, 480 - var7);
              SoftwareRaster.g(3, 3 + var7, 634, -var7 + 480 - 6, 8, 0);
              if (var51 != 0) {
                this.g((byte) -118);
              }
            }
          } else {
            this.g((byte) -118);
          }
          if (param0 >= -3) {
            return;
          }
          var8 = 640;
          if (ed.field_j >= 0 &&
            var2_int == 0) {
            h.i(-1);
            var8Lifetime1 = 330;
            var9_ref_String = ti.field_A[12];
            var10_int = 10 + pl.field_U.c(var9_ref_String);
            if (var10_int < 140) {
              var10_int = 140;
            }
            if (nm.a(440, var8Lifetime1, 122, var9_ref_String, 28, var10_int)) {
              this.field_r = 29;
            }
          }
          if (var2_int == 0) {
            stackIn_81_0 = (ed.field_j >= 0) ? 440 : 390;
            if (ed.field_j < 0) {
              stackIn_85_1 = 240;
            } else {
              stackIn_85_1 = 150;
            }
            if (nm.a(stackIn_81_0, stackIn_85_1, 120, bi.field_c, 28, 160)) {
              this.field_r = 30;
            }
          }
          var9 = this.field_W.length;
          if (var4 > 0) {
            var9 = var4;
          }
          var10 = pl.field_U;
          var11 = 0;
          var12_ref_mb__ = this.field_W;
          var13 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var13 >= var12_ref_mb__.length))) {
            var14 = var12_ref_mb__[var13];
            stackIn_104_0 = ((Sentinel) (var14)).field_Db;
            stackIn_104_1 = var11;
            if (var51 == 0) {
              if (stackIn_104_0 > stackIn_104_1) {
                var11 = ((Sentinel) (var14)).field_Db;
              }
              if (((Sentinel) (var14)).field_Ub > var11) {
                var11 = ((Sentinel) (var14)).field_Ub;
              }
              var13++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_104_0 = 3000;
            stackIn_104_1 = var9;
          }
          var12 = stackIn_104_0 / stackIn_104_1;
          var13Lifetime1 = 1;
          if (1 == this.world.field_P) {
            var13Lifetime1 = 2;
          }
          if (this.world.field_P == 2) {
            var13Lifetime1 = 3;
          }
          if (var12 > 1024) {
            var12 = 1024;
          }
          if (~var13Lifetime1 == ~var9) {
            var13Lifetime1 = 1;
          }
          var14Lifetime1 = null;
          var15 = 0;
          var16 = 0;
          if (var6 == 0 &&
            ni.b(119) &&
            di.field_g == 4) {
          }
          boolean decompiledFrameCompleted0 = true;
          var17 = var9;
          var18 = 1;
          var19 = 8;
          var20 = 311;
          var21 = 45;
          var22 = 8;
          if (var13Lifetime1 == 2) {
            var18 = 2;
            var23_ref_int__ = new int[2];
            var24 = 0;
            while (var9 > var24) {
              if (var51 == 0) {
                stackIn_130_0 = this.field_W;
                if (var4 > 0) {
                  stackIn_131_1 = 0;
                } else {
                  stackIn_131_1 = var24;
                }
                var25 = stackIn_130_0[stackIn_131_1].teamId;
                if (var25 >= 0 &&
                  2 > var25) {
                  var23_ref_int__[var25] = var23_ref_int__[var25] + 1;
                }
                var24++;
                continue;
              }
              break;
            }
            if (this.field_O[0] > this.field_O[1]) {
              stackIn_147_0 = 0;
            } else {
              stackIn_147_0 = (this.field_O[1] > this.field_O[0]) ? 1 : -1;
            }
            boolean decompiledFrameCompleted1 = true;
            var24Lifetime2 = stackIn_147_0;
            if (var24Lifetime2 >= 0 &&
              0 == var4) {
              var25Lifetime2 = 1;
              var26 = 0;
              while (true) {
                if (var26 < this.field_e.length) {
                  stackIn_170_0 = -1;
                  stackIn_170_1 = this.field_e[var26];
                  if (var51 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_170_0 != stackIn_170_1 &&
                    null != this.field_W[var26] &&
                    ~this.field_W[var26].teamId == ~var24Lifetime2) {
                    var25Lifetime2 = 0;
                  } else {
                    var26++;
                    continue;
                  }
                }
                if (var25Lifetime2 == 0) {
                  break;
                }
                var24Lifetime2 = -1;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              var25Lifetime2 = Math.max(var23_ref_int__[0], var23_ref_int__[1]);
              var17 = var25Lifetime2;
              stackIn_170_0 = -6;
              stackIn_170_1 = ~var17;
            }
            if (stackIn_170_0 > stackIn_170_1) {
              var22 = 5;
            }
            var26 = 0;
            while (2 > var26) {
              var27 = 3;
              var28_ref_String = db.a(kk.field_f, -85, new String[]{mm.field_d[var26], Integer.toString(this.field_O[var26])});
              var28_ref_String = ke.a(42, var28_ref_String);
              var29 = ui.field_U.c(var28_ref_String) + 2 * var27;
              var30 = -(var29 / 2) + (640 + var26 * 1280) / 4;
              var31 = 60;
              var32 = ui.field_U.field_U + 2 * var27;
              SoftwareRaster.c(var30, var31, var29, var32, 0, 160);
              var33_int = fj.field_h[var26];
              stackIn_188_0 = ~PartInstruction.field_t[0];
              stackIn_188_1 = ~var33_int;
              if (var51 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_188_0 == stackIn_188_1) {
                var33_int = uj.a(var33_int, 100);
              }
              ui.field_U.b(var28_ref_String, var27 + var30, -var27 + (var31 + var32), var33_int, 0);
              if (~var24Lifetime2 == ~var26) {
                var34 = 250;
                var35 = 100;
                stackIn_185_0 = (var26 == 1) ? 320 : 0;
                var36 = stackIn_185_0 + (320 - var34) / 2;
                td.field_ec.a(var36, var35);
              }
              var26++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_188_0 = -5;
            stackIn_188_1 = ~var9;
          }
          if (stackIn_188_0 > stackIn_188_1) {
            var18 = 2;
          }
          if (var2_int != 0) {
            var21 = 100;
            var20 = 450;
          }
          if (4 > var9) {
            var22 = 16;
          }
          if (var18 == 2) {
            var17 = (1 + var9) / 2;
          }
          var23 = -((var22 + var17 * (var21 + var22)) / 2) + 218;
          var24Lifetime1 = (var19 + 640 - (var20 + var19) * var18) / 2;
          var25Lifetime1 = 0;
          if (var13Lifetime1 == 2) {
            var23 += 16;
          }
          var26 = var24Lifetime1;
          var27Lifetime1 = var23;
          var28 = 0;
          while (true) {
            if (var28 >= var9) {
              if (null != var14Lifetime1) {
                var28_ref_fh = ff.field_lb;
                var29Lifetime1 = ((BitmapFont) ((Object) var28_ref_fh)).c((String) (var14Lifetime1));
                var15 = var15 - var29Lifetime1 / 2;
                var15 = Math.min(var15, 638 - var29Lifetime1);
                var15 = Math.max(var15, 2);
                SoftwareRaster.c(-2 + var15, var16 - 2, var29Lifetime1 + 4, 4 + (((BitmapFont) ((Object) var28_ref_fh)).field_F + ((BitmapFont) ((Object) var28_ref_fh)).field_G), 0, 192);
                ((BitmapFont) ((Object) var28_ref_fh)).b((String) (var14Lifetime1), var15, var16 + ((BitmapFont) ((Object) var28_ref_fh)).field_G, 16777215, 0);
              }
              stackIn_370_0 = 0;
              stackIn_370_1 = ed.field_j;
              break;
            }
            stackIn_370_0 = var9 % 2;
            stackIn_370_1 = 1;
            if (var51 == 0) {
              if (stackIn_370_0 == stackIn_370_1 &&
                var18 == 2 &&
                var13Lifetime1 == 1 &&
                ~var28 == ~(-1 + var17)) {
                var26 = var26 + (var19 + var20) / 2;
              }
              stackIn_223_0 = this.field_W;
              if (var4 <= 0) {
                stackIn_224_1 = var28;
              } else {
                stackIn_224_1 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              var29_ref_mb = stackIn_223_0[stackIn_224_1];
              if (var4 <= 0 && (-1 == this.field_e[var28] ||
                (256 & this.field_e[var28]) == 0)) {
                stackIn_234_0 = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_234_0 = 1;
              }
              var30Lifetime1 = stackIn_234_0;
              stackIn_237_0 = 0;
              stackIn_237_1 = this.field_e;
              if (var4 <= 0) {
                stackIn_238_2 = var28;
              } else {
                stackIn_238_2 = 0;
              }
              stackIn_242_0 = (stackIn_237_0 != ~stackIn_237_1[stackIn_238_2]) ? 0 : 1;
              var31Lifetime1 = stackIn_242_0;
              if (var2_int == 0 ||
                !(ge.field_j <= 0)) {
                this.a(var21, false, var29_ref_mb.getTeamColour((byte) 28), var20, var30Lifetime1 != 0, var27Lifetime1, var11, var29_ref_mb, var26);
              }
              var32_ref_String = Integer.toString(this.field_H[var28] / 100);
              stackIn_253_0 = (var31Lifetime1 == 0) ? 16777215 : 11579568;
              var33_intLifetime1 = stackIn_253_0;
              if (var2_int != 0) {
                if (0 != ge.field_j) {
                  var32_ref_String = db.a(ak.field_a, -37, new String[]{qa.a(-1, this.field_c[0])});
                } else {
                  var32_ref_String = "";
                }
                stackIn_263_0 = (nc.field_a >= 0) ? 65280 : 6316128;
                var33_intLifetime1 = stackIn_263_0;
              }
              ((BitmapFont) ((Object) var10)).c(var32_ref_String, -5 + (var26 + var20), var27Lifetime1 + 16, var33_intLifetime1, -1);
              var34Lifetime1 = 25 + var27Lifetime1;
              var35Lifetime1 = 4 + (var26 + var21);
              var36Lifetime1 = -var35Lifetime1 + var20 + var26;
              var37 = var27Lifetime1 - (-var21 + var34Lifetime1);
              var38 = 160;
              if (var2_int == 0) {
                if (this.world.field_lb &&
                  this.world.field_cb < 43) {
                  SoftwareRaster.c(var35Lifetime1, var34Lifetime1, var36Lifetime1, var37, 0, var38);
                  var39_ref = null;
                  if (this.world.field_cb <= 40) {
                    var39_ref_String = "" + this.world.field_cb;
                  } else {
                    var39_ref_String = "40+";
                  }
                  var39_ref_String = db.a(jf.field_W, -100, new String[]{var39_ref_String});
                  ((BitmapFont) ((Object) var10)).a(var39_ref_String, var36Lifetime1 / 2 + var35Lifetime1, (var37 + ((BitmapFont) ((Object) var10)).field_U) / 2 + var34Lifetime1, 16777215, 0);
                } else {
                  var39 = var35Lifetime1;
                  var40 = var37 / 2 + var34Lifetime1;
                  var41 = 20;
                  var42 = 20;
                  var43 = var39;
                  if (var31Lifetime1 != 0) {
                    SoftwareRaster.c(var35Lifetime1, var34Lifetime1, var36Lifetime1, var37, 0, var38);
                    ((BitmapFont) ((Object) var10)).b(NodeIterator.field_e, 4 + var39, ((BitmapFont) ((Object) var10)).field_U / 2 + var40, 11579568, 0);
                  } else {
                    var25Lifetime1 = 1;
                    var44 = 1;
                    if (0 < var4) {
                      stackIn_283_0 = (var28 + 1) % 2 * 32;
                    } else {
                      stackIn_283_0 = mm.a((byte) 106, this.field_e[var28]);
                    }
                    var45 = stackIn_283_0;
                    var46 = var36Lifetime1 / var41;
                    if (0 < var45) {
                      SoftwareRaster.c(var35Lifetime1, var34Lifetime1, var36Lifetime1, var37, 0, var38);
                    }
                    if (var46 < var45) {
                      if (var37 <= 40) {
                        var46 = var45;
                        var41 = var36Lifetime1 / var45;
                      } else {
                        var40 -= 10;
                      }
                    }
                    var45Lifetime1 = 0;
                    var43 -= 3;
                    var40 = var40 - var42 / 2;
                    var47 = 0;
                    while (var47 < 32) {
                      stackIn_361_0 = 0;
                      stackIn_361_1 = var4;
                      if (stackIn_361_0 < stackIn_361_1 &&
                        var28 % 2 == 0 ||
                        var4 == 0 &&
                        (var44 & this.field_e[var28]) != 0) {
                        pd.field_Z[var47].a(var43, var40);
                        if (var43 <= oh.field_f &&
                          oh.field_f < (var43 + pd.field_Z[var47].field_z) &&
                          var40 <= pi.field_c &&
                          pi.field_c < pd.field_Z[var47].field_B + var40) {
                          var48 = Integer.toString(this.field_c[var47]);
                          var49 = Integer.toString(this.field_a[var47]);
                          if (7 != var47 &&
                            30 != var47 &&
                            var47 != 24) {
                            if (var47 == 4 ||
                              var47 == 5) {
                              var50 = Math.min(this.field_a[var47], -1 + dl.field_I.length);
                              var49 = db.a(dl.field_I[var50], -55, new String[]{Integer.toString(this.field_a[var47])});
                            } else if (27 == var47) {
                              var49 = var49 + '%';
                              var48 = var48 + '%';
                            }
                          } else {
                            if (this.field_c[var47] == 1) {
                              var48 = var48 + IntrusiveNode.field_d;
                            } else {
                              var48 = var48 + tc.field_s;
                            }
                            if (1 == this.field_a[var47]) {
                              var49 = var49 + IntrusiveNode.field_d;
                            } else {
                              var49 = var49 + tc.field_s;
                            }
                          }
                          var14Lifetime1 = db.a(bj.field_l[var47 * 2], -78, new String[]{": " + var48});
                          var50Lifetime1 = 1;
                          if (ed.field_j <= -1) {
                            var50Lifetime1 = 0;
                          }
                          if (null == bj.field_l[var47 * 2 + 1]) {
                            var50Lifetime1 = 0;
                          } else {
                            if (this.field_c[var47] == this.field_a[var47]) {
                              var50Lifetime1 = 0;
                            }
                          }
                          var16 = var40 - 25;
                          var15 = var43 + 8;
                          if (var50Lifetime1 != 0) {
                            var14Lifetime1 = (String) (var14Lifetime1) + db.a(bj.field_l[1 + 2 * var47], -127, new String[]{var49});
                          }
                        }
                        var45Lifetime1++;
                        var43 = var43 + var41;
                        if (~var45Lifetime1 == ~var46) {
                          var40 = var40 + var42;
                          var45Lifetime1 = 0;
                          var43 = var39;
                        }
                      }
                      var44 = var44 << 1;
                      var47++;
                    }
                  }
                }
              }
              stackIn_361_0Lifetime1 = ~(1 + var28);
              stackIn_361_1Lifetime1 = ~var17;
              if (stackIn_361_0Lifetime1 != stackIn_361_1Lifetime1) {
                var27Lifetime1 = var27Lifetime1 + (var22 + var21);
              } else {
                var27Lifetime1 = var23;
                var26 = var19 + var20 + var24Lifetime1;
              }
              var28++;
              continue;
            }
            break;
          }
          if (stackIn_370_0 <= stackIn_370_1 &&
            !this.field_J &&
            var25Lifetime1 != 0 &&
            !this.world.field_lb) {
            pl.field_U.a(oa.field_O, 320, 436, 1021128, -1);
          }
          if (ed.field_j >= 0 &&
            var2_int == 0 && (!(hj.field_F <= 0) ||
            !(li.field_v <= 0))) {
            var28Lifetime1 = 32 + var7;
            if (ql.a(ce.field_t, 18286)) {
              var28Lifetime1 -= 15;
            }
            var29_ref_String = "00a2ff";
            var30_ref_String = db.a(de.field_g, -128, new String[]{Integer.toString(hj.field_F), var29_ref_String});
            array$0 = new String[2];
            stackIn_401_0 = ph.field_d;
            stackIn_401_1 = -123;
            stackIn_401_2 = array$0;
            stackIn_401_3 = array$0;
            stackIn_401_4 = 0;
            if (1000 != li.field_v) {
              stackIn_402_5 = Integer.toString(li.field_v);
            } else {
              stackIn_402_5 = tm.field_g;
            }
            stackIn_401_3[stackIn_401_4] = stackIn_402_5;
            stackIn_401_2[1] = var29_ref_String;
            var31_ref_String = db.a(stackIn_401_0, stackIn_401_1, stackIn_401_2);
            pl.field_U.b(var30_ref_String, 100, var28Lifetime1, 16777215, -1);
            pl.field_U.b(var31_ref_String, 400, var28Lifetime1, 16777215, -1);
          }
          if (ed.field_j >= 0 &&
            var2_int == 0 &&
            ql.a(ce.field_t, 18286)) {
            var28Lifetime2 = uf.a(120, ce.field_t);
            var29Lifetime2 = -10 + var28Lifetime2 * 40;
            var30Lifetime2 = (640 - var29Lifetime2) / 2;
            var31Lifetime2 = 0;
            var32Lifetime1 = -1;
            var33_intLifetime2 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (256 <= var33_intLifetime2))) {
              stackOut_414_0 = ve.a(ce.field_t, 1, var33_intLifetime2);
              stackIn_433_0 = stackOut_414_0 ? 1 : 0;
              stackIn_415_0 = stackOut_414_0;
              if (var51 == 0) {
                if (stackIn_415_0) {
                  var34_ref_wk = od.field_c[var33_intLifetime2];
                  var34_ref_wk.d(var30Lifetime2, 400);
                  if (var30Lifetime2 <= oh.field_f &&
                    oh.field_f < (30 + var30Lifetime2) &&
                    400 <= pi.field_c &&
                    pi.field_c < 430) {
                    var31Lifetime2 = 15 + var30Lifetime2;
                    var32Lifetime1 = var33_intLifetime2;
                  }
                  var30Lifetime2 += 40;
                }
                var33_intLifetime2++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_433_0 = 0;
            }
            if (stackIn_433_0 > var32Lifetime1) {
              return;
            }
            var33 = jg.field_t[var32Lifetime1];
            var34Lifetime2 = 4 + ff.field_lb.c(var33);
            var31Lifetime2 = var31Lifetime2 - var34Lifetime2 / 2;
            var35Lifetime2 = 14;
            if (10 > var31Lifetime2) {
              var31Lifetime2 = 10;
            }
            if (630 < var31Lifetime2 + var34Lifetime2) {
              var31Lifetime2 = -var34Lifetime2 + 630;
            }
            var36Lifetime2 = -var35Lifetime2 + 400 - 4;
            SoftwareRaster.c(var31Lifetime2, var36Lifetime2, var34Lifetime2, var35Lifetime2, 0, 192);
            ff.field_lb.b(var33, 2 + var31Lifetime2, -2 + (var35Lifetime2 + var36Lifetime2), 16777215, -1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.W(" + param0 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.controlledSentinel &&
            this.controlledSentinel.field_Fb < 5 &&
            0 >= this.controlledSentinel.field_cb) {
            return true;
          }
          if (param2 > dl.field_G &&
            this.world.a(4 + (dl.field_G >> 4), 4, 0, dl.field_G >> 4, km.field_c >> 4, (byte) 98, km.field_c >> 4)) {
            return true;
          }
          if (param0 != -5821) {
            this.field_D = (int[]) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "nb.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean e(int param0) {
        int discarded$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          if (dl.field_M < qh.field_Yb) {
            return true;
          }
          if (param0 != -100) {
            discarded$0 = this.e(false, 117);
          }
          var2_int = di.field_g;
          if (0 == var2_int) {
            var2_int = qh.field_Yb;
            if (0 != var2_int ||
              var3 != 0) {
              if (var2_int == 5) {
                return true;
              }
              if (8 != var2_int) {
                return false;
              }
              if (var3 == 0) {
                return true;
              }
            }
            return true;
          }
          if (var2_int == 1 &&
            var3 == 0) {
            var2_int = qh.field_Yb;
            if (0 != var2_int) {
              if (var2_int != 10) {
                return false;
              }
              return true;
            }
            return true;
          }
          if (var2_int == 7 &&
            var3 == 0) {
            return false;
          }
          if (3 != var2_int) {
            if (5 == var2_int) {
              return false;
            }
            if (var2_int != 9) {
              return false;
            }
            var2_int = qh.field_Yb;
            if (var2_int == 2) {
              return true;
            }
            return false;
          }
          var2_intLifetime1 = qh.field_Yb;
          if (0 != var2_intLifetime1 ||
            var3 != 0) {
            if (var2_intLifetime1 != 3) {
              return false;
            }
            if (var3 == 0) {
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.BA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        NodeDeque var2 = null;
        Sentinel var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var2 = this.world.sentinels;
          if (param0) {
            return;
          }
          var3 = (Sentinel) (var2.first(13058));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            if (var3.field_Nb != 0) {
              var3.clearArmour(128);
              b.field_f = true;
            }
            var3 = (Sentinel) (var2.next((byte) -49));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "nb.B(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1024) {
            discarded$1 = this.e(-3);
          }
          stackIn_4_0 = (param1 << 4) + this.field_P << 4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0, int param1) {
        int discarded$0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_46_0 = 0;
        String stackIn_66_0 = null;
        String stackIn_112_0 = null;
        int stackIn_140_0 = 0;
        int stackIn_157_0 = 0;
        RgbSprite[] stackIn_161_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        BattleTerrain var4 = null;
        int var5 = 0;
        u var5_ref_u = null;
        String var5_ref_String = null;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        String var7_ref_String = null;
        RgbSprite[] var7_ref_wk__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11_intLifetime1;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        var12 = SteelSentinels.obfuscationControl;
        try {
          if (this.world.simulationTick < this.field_w) {
            this.a(param0, (byte) -21);
            return;
          }
          this.field_n = this.field_r;
          this.field_r = -1;
          sb.field_bb.b((byte) 126);
          if (!NodeIterator.a(param1 ^ 21517) &&
            param0 &&
            !jn.field_g) {
            stackIn_16_0 = 1;
          } else {
            stackIn_16_0 = 0;
          }
          var3_int = stackIn_16_0;
          var4 = this.world.terrain;
          this.a((byte) 125, true, true, var4);
          this.a(-93, true, var3_int != 0, true);
          discarded$0 = this.a(true, var4, true, (byte) -95);
          if (di.field_g != -1 &&
            di.field_g != 4 &&
            dl.field_M != qh.field_Yb) {
            SoftwareRaster.c(0, 0, 640, 480, 0, 128);
          }
          if (null != this.controlledSentinel) {
            this.a(var3_int != 0, param1 ^ -21520);
          }
          boolean decompiledFrameCompleted0 = true;
          SoftwareRaster.c();
          this.field_t = -1;
          this.b(var3_int != 0, 1956917985);
          if (di.field_g == -1 &&
            !this.world.field_j &&
            1 == this.world.terrain.getTerrainType(param1 - 21434)) {
            var5 = 16;
            var6 = 8;
            var7 = 428;
            var8 = 192;
            var9 = 508;
            SoftwareRaster.c(var7, var5, var9 - var7, var6, 32768, var8);
            var7 = var9;
            var9Lifetime3 = 549;
            SoftwareRaster.c(var7, var5, -var7 + var9Lifetime3, var6, 8421376, var8);
            var7 = var9Lifetime3;
            var9Lifetime4 = 589;
            SoftwareRaster.c(var7, var5, var9Lifetime4 - var7, var6, 8409088, var8);
            var7 = var9Lifetime4;
            var9Lifetime5 = 628;
            SoftwareRaster.c(var7, var5, var9Lifetime5 - var7, var6, 8388608, var8);
            if (12000 > this.world.simulationTick) {
              stackIn_46_0 = 32768;
            } else {
              if (18000 <= this.world.simulationTick) {
                stackIn_46_0 = (this.world.simulationTick < 24000) ? 8409088 : 8388608;
              } else {
                stackIn_46_0 = 8421376;
              }
            }
            var10 = stackIn_46_0;
            var5 -= 2;
            var7 = Math.min(200 * this.world.simulationTick / 29750, 200) + 428;
            var11_int = 4;
            while (var11_int > 0) {
              SoftwareRaster.c(-var11_int + var7, -var11_int + var5, var11_int * 2, var10, var8);
              SoftwareRaster.c(-var11_int + var7, var6 + (var11_int + var5) + 3, var11_int * 2, var10, var8);
              var11_int--;
              if (var12 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) && (di.field_g == -1 && (!this.world.field_j ||
            !(q.field_h <= 0)))) {
            this.f(var3_int != 0, 8209);
          }
          if (g.field_h >= 0) {
            var5_ref_u = dm.field_f;
            if (35 > g.field_h) {
              stackIn_66_0 = rj.field_m[g.field_h];
            } else {
              stackIn_66_0 = qj.field_v[g.field_h - 35];
            }
            var6_ref_String = stackIn_66_0;
            if (24 == g.field_h) {
              var6_ref_String = bk.field_O;
            }
            var7_ref_String = ll.field_p[g.field_h];
            if (di.field_g == 1 &&
              22 == g.field_h) {
              var7_ref_String = hm.field_b;
            }
            var8 = pd.field_X;
            var9Lifetime1 = 320;
            var10Lifetime1 = 240;
            var11_intLifetime1 = var10Lifetime1 + ((BitmapFont) ((Object) var5_ref_u)).field_U / 2;
            if (var8 >= 25) {
              if (225 > var8) {
                var11_intLifetime1 -= 75;
                if (var12 != 0) {
                  var11_intLifetime1 = var11_intLifetime1 - (-(3 * var8) + 750);
                  var11_intLifetime1 = var11_intLifetime1 - 3 * var8;
                }
              } else {
                var11_intLifetime1 = var11_intLifetime1 - (-(3 * var8) + 750);
                if (var12 != 0) {
                  var11_intLifetime1 = var11_intLifetime1 - 3 * var8;
                }
              }
            } else {
              var11_intLifetime1 = var11_intLifetime1 - 3 * var8;
            }
            SoftwareRaster.a(0, 0, 640, var10Lifetime1);
            ((BitmapFont) ((Object) var5_ref_u)).a(ke.a(42, var6_ref_String), var9Lifetime1, var11_intLifetime1, 16777215, 0);
            SoftwareRaster.a(0, 10 + var11_intLifetime1, 640, 480);
            pl.field_U.a(var7_ref_String, 100, 200, 440, 200, 1044724, 0, 1, 0, pl.field_U.field_G);
            SoftwareRaster.c();
          }
          if (this.world.field_j) {
            SoftwareRaster.c(0, 0, 640, 480, 0, Math.max(0, -q.field_h + 100));
          }
          if (param1 != 21519) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (!this.world.field_j ||
            !(q.field_h <= 0)) {
            if ((!(this.world.field_R > 150) ||
              this.world.terrain.getTerrainType(56) == 4) &&
              (decompiledFrameRemainder1 = !(this.world.field_R <= 0)) &&
              (decompiledFrameRemainder1 = (this.world.terrain.getTerrainType(62) != 4))) {
              if (1 == this.world.terrain.getTerrainType(81)) {
                stackIn_112_0 = hk.field_jc;
              } else {
                stackIn_112_0 = wb.field_f;
              }
              var5_ref_String = stackIn_112_0;
              ui.field_U.a(db.a(var5_ref_String, -126, new String[]{Integer.toString((-this.world.field_R + 150) / 50)}).toUpperCase(), 320, 80, 16777215, 8421504);
              decompiledFrameRemainder1 = (var12 != 0);
            }
            if ((decompiledFrameRemainder1) &&
              (this.world.terrain.getTerrainType(param1 ^ 21572) != 1)) {
              ui.field_U.a(nh.field_A.toUpperCase(), 320, 80, 16777215, 8421504);
              if (var12 != 0) {
                this.i((byte) -23);
              }
            }
          } else {
            this.i((byte) -23);
          }
          if (di.field_g != 0 &&
            di.field_g != 1 &&
            di.field_g != 3 &&
            di.field_g != 5 &&
            di.field_g != 7 &&
            di.field_g != 9) {
            stackIn_140_0 = 0;
          } else {
            stackIn_140_0 = 1;
          }
          var5Lifetime1 = stackIn_140_0;
          if (var5Lifetime1 != 0) {
            this.c((byte) 104);
          }
          if (10 == di.field_g) {
            this.a(-5669);
          }
          if (this.field_d) {
            if (bb.field_T &&
              param0) {
              stackIn_157_0 = 1;
            } else {
              stackIn_157_0 = 0;
            }
            var6Lifetime1 = stackIn_157_0;
            if (var6Lifetime1 != 0) {
              stackIn_161_0 = tk.field_t;
            } else {
              stackIn_161_0 = co.field_d;
            }
            var7_ref_wk__ = stackIn_161_0;
            var8 = var7_ref_wk__[2].field_A + ((int)jl.field_c + var7_ref_wk__[0].field_A);
            var9Lifetime2 = 24;
            var10Lifetime2 = 356;
            if (vl.field_v) {
              var10Lifetime2 = -var9Lifetime2 + qc.field_V.field_cb;
              if (var10Lifetime2 < 336) {
                var10Lifetime2 = 336;
              }
              if (!(var10Lifetime2 <= 356)) {
                var10Lifetime2 = 356;
                if ((var12 != 0) &&
                  ((qc.field_V.field_cb - var9Lifetime2) < var10Lifetime2)) {
                  var10Lifetime2 = -var9Lifetime2 + qc.field_V.field_cb;
                }
              }
            } else {
              if ((qc.field_V.field_cb - var9Lifetime2) < var10Lifetime2) {
                var10Lifetime2 = -var9Lifetime2 + qc.field_V.field_cb;
              }
            }
            SoftwareRaster.c(0, var10Lifetime2, var8, var9Lifetime2, 0, 192);
            hb.a((byte) 44, var7_ref_wk__, var8, var10Lifetime2, 0, var9Lifetime2);
            if (0 <= oh.field_f &&
              var8 + 0 > oh.field_f &&
              pi.field_c >= var10Lifetime2 &&
              var9Lifetime2 + var10Lifetime2 > pi.field_c) {
              this.field_r = 0;
              vd.field_b = true;
            }
            var11 = new int[4];
            SoftwareRaster.b(var11);
            if (hj.field_s != null) {
              fk.field_d.c(hj.field_s.toUpperCase(), var7_ref_wk__[0].field_A + (int)jl.field_c, -var7_ref_wk__[6].field_F + var10Lifetime2 - (-var9Lifetime2 - 3), this.field_M[0], -1);
            }
            SoftwareRaster.a(var11);
          }
          boolean decompiledFrameRemainder0 = true;
          var6Lifetime2 = 0;
          if (fc.field_e[28] &&
            di.field_g == -1) {
            var6Lifetime2 = 1;
            decompiledFrameRemainder0 = (var12 != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_h)) {
            if (this.world.simulationTick < 250) {
              var6Lifetime2 = 1;
              if (var12 != 0) {
                this.field_h = false;
              }
            } else {
              this.field_h = false;
            }
          }
          if (var6Lifetime2 == 0) {
            if (!(CipherPacketBuffer.field_w <= 0)) {
              CipherPacketBuffer.field_w = Math.max(0, -25 + CipherPacketBuffer.field_w);
              if ((var12 != 0) &&
                (CipherPacketBuffer.field_w < 105)) {
                CipherPacketBuffer.field_w = Math.min(25 + CipherPacketBuffer.field_w, 105);
              }
            }
          } else {
            if (CipherPacketBuffer.field_w < 105) {
              CipherPacketBuffer.field_w = Math.min(25 + CipherPacketBuffer.field_w, 105);
            }
          }
          if (CipherPacketBuffer.field_w > 0) {
            this.h(-4294);
          }
          var7 = 0;
          do {
            if (var7 >= 640) {
              var7 = 0;
              break;
            }
            var8 = var7;
            sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
            var8 = var8 + 306560;
            sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
            var7++;
          } while (var12 == 0);
          while (var7 < 480) {
            var8 = sb.field_bb.field_c * var7;
            sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], bi.a(param1, 5662));
            var8 += 639;
            sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
            var7++;
            if (var12 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        int incrementValue$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Sentinel[] var4 = null;
        int var5 = 0;
        NodeIterator var6 = null;
        Sentinel var7_ref_mb = null;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var2 = new int[2];
          var3 = this.world.playerCount + this.world.computerPlayerCount;
          if (null == this.field_B ||
            this.field_B.length != var3) {
            this.field_B = new int[var3];
          }
          var4 = new Sentinel[var3];
          var5 = 0;
          var6 = new NodeIterator(this.world.sentinels);
          var7_ref_mb = (Sentinel) (var6.b(param0 + 21716));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var7_ref_mb))) {
            stackIn_21_0 = var7_ref_mb.playerId;
            if (var8 == 0) {
              if (stackIn_21_0 >= 0 &&
                var7_ref_mb.playerId < var3) {
                incrementValue$0 = var5;
                var5++;
                var4[incrementValue$0] = var7_ref_mb;
              }
              var2[var7_ref_mb.teamId] = var2[var7_ref_mb.teamId] + (var7_ref_mb.field_vb - var7_ref_mb.field_Ab);
              var7_ref_mb = (Sentinel) (var6.d(2));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = ~var2[0];
          }
          stackIn_25_0 = (stackIn_21_0 >= ~var2[1]) ? 1 : 0;
          var7 = stackIn_25_0;
          if (param0 != -21714) {
            return;
          }
          if (var2[0] / 100 == var2[1] / 100) {
            if (this.field_B[1] < this.field_B[0]) {
              var7 = 1;
              if (var8 != 0) {
                var7 = 0;
              }
            } else {
              var7 = 0;
            }
          }
          boolean decompiledSharedTail0 = !(this.field_B[var7] < 0);
          if (!decompiledSharedTail0) {
            this.field_B[var7] = this.field_B[var7] + 1;
            decompiledSharedTail0 = (var8 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.field_B[var7] > 0)) {
            this.field_B[var7] = this.field_B[var7] - 1;
          }
          if (this.field_B[-var7 + 1] >= 12) {
            if (this.field_B[1 - var7] <= 12) {
              return;
            }
            this.field_B[1 - var7] = this.field_B[1 - var7] - 1;
            if (var8 == 0) {
              return;
            }
          }
          this.field_B[-var7 + 1] = this.field_B[-var7 + 1] + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.L(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        String[] array$0 = null;
        Object stackIn_43_0;
        int stackIn_43_1;
        Object stackIn_43_2;
        Object stackIn_43_3;
        Object stackIn_44_0;
        boolean stackIn_44_4;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        String stackIn_77_0;
        int stackIn_77_1;
        String[] stackIn_77_2;
        String[] stackIn_77_3;
        int stackIn_77_4;
        String stackIn_78_5 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4_ref = null;
        int var4 = 0;
        Object var5_ref = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        String[] var8_ref_String__ = null;
        int var8 = 0;
        String[] var9 = null;
        int[][] var9_array = null;
        String var9_ref = null;
        int var10_int = 0;
        NodeIterator var10 = null;
        String var10_ref = null;
        Sentinel var11_ref_mb = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        int var16 = 0;
        Object var6Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (this.world.field_j) {
            return;
          }
          dl.field_M = qh.field_Yb;
          if (param0 != -5669) {
            this.d(-18);
          }
          var2_int = ge.field_j * 10 + ol.field_Ub;
          var3 = 0;
          if (var3 != 0 &&
            !this.world.field_j) {
            var4_ref = null;
            var5_ref = null;
            if (ol.field_Ub < dl.field_N.length &&
              dl.field_M < dl.field_N[ol.field_Ub].length) {
              var4_ref = dl.field_N[ol.field_Ub][dl.field_M];
            } else {
              if (ol.field_Ub < dl.field_N.length &&
                dl.field_N[ol.field_Ub].length == 1) {
                var4_ref = dl.field_N[ol.field_Ub][0];
              }
            }
            var6 = null;
            var7 = 0;
            var8_ref_String__ = dj.field_g[var2_int];
            if (dm.field_c) {
              var8_ref_String__ = null;
            }
            var9 = dl.field_H[var2_int];
            if (null != var8_ref_String__) {
              var5_ref = var8_ref_String__[var7];
            }
            if (var5_ref == null) {
              var5_ref = var9[var7];
            }
            if (0 == qh.field_Yb) {
              if (var8_ref_String__ != null) {
                var6 = var8_ref_String__[var7 + 1];
              }
              if (var6 == null) {
                var6 = var9[var7 + 1];
              }
            }
            stackIn_43_0 = this;
            stackIn_43_1 = 0;
            stackIn_43_2 = var4_ref;
            stackIn_43_3 = var5_ref;
            if (0 != qh.field_Yb) {
              stackIn_44_0 = this;
              stackIn_44_4 = false;
            } else {
              stackIn_44_0 = this;
              stackIn_44_4 = true;
            }
            this.a(stackIn_43_1, (String) (stackIn_43_2), (String) (stackIn_43_3), stackIn_44_4, false, (String) (var6));
          }
          if (var3 == 0) {
            var4 = this.field_M[1];
            var5 = 16777215;
            var6Lifetime1 = fk.field_d;
            SoftwareRaster.c(0, 0, 192, 47, 0, 192);
            SoftwareRaster.h(0, 0, 192, 47, var4, 192);
            SoftwareRaster.a(2, 2, 188, 14, 2565927);
            var7 = 0;
            var8 = 0;
            var9_array = ua.field_I[ge.field_j * 10 + ol.field_Ub];
            var10_int = 0;
            while (var9_array.length > var10_int) {
              var8 = var8 + var9_array[var10_int].length * 9;
              if (var16 != 0) {
                return;
              }
              if (var10_int <= this.world.field_cb) {
                var7 = var7 + 9 * var9_array[var10_int].length;
              }
              var10_int++;
            }
            var10 = new NodeIterator(this.world.sentinels);
            var11_ref_mb = (Sentinel) (var10.b(2));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11_ref_mb == null))) {
              stackIn_70_0 = 0;
              stackIn_70_1 = var11_ref_mb.field_Nb;
              if (var16 == 0) {
                if (stackIn_70_0 != stackIn_70_1) {
                  if (~nn.field_c[0] == ~var11_ref_mb.chassis.componentId) {
                    var7--;
                  } else {
                    var7 -= 9;
                  }
                }
                var11_ref_mb = (Sentinel) (var10.d(2));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_70_0 = var7 * 100;
              stackIn_70_1 = var8;
            }
            var7 = stackIn_70_0 / stackIn_70_1;
            var8Lifetime1 = 13;
            var9_ref = db.a(dc.field_f, -77, new String[]{Integer.toString(ol.field_Ub + 1)});
            var10_ref = db.a(ne.field_J, -112, new String[]{Integer.toString(var7)});
            var11 = this.world.simulationTick / 50;
            if (b.field_f) {
              var11 += 600;
            }
            var12 = hc.field_V + var11;
            var13 = db.a(il.field_g, -44, new String[]{qa.a(-1, var11)});
            array$0 = new String[1];
            stackIn_77_0 = sn.field_k;
            stackIn_77_1 = -13;
            stackIn_77_2 = array$0;
            stackIn_77_3 = array$0;
            stackIn_77_4 = 0;
            if (this.world.field_M == -1) {
              stackIn_78_5 = NodeDeque.field_b;
            } else {
              stackIn_78_5 = Integer.toString(this.world.field_M);
            }
            stackIn_77_3[stackIn_77_4] = stackIn_78_5;
            var14 = db.a(stackIn_77_0, stackIn_77_1, stackIn_77_2);
            var15 = db.a(ub.field_k, -82, new String[]{qa.a(-1, var12)});
            ((BitmapFont) (var6Lifetime1)).b(cc.field_ic[ge.field_j], 6, var8Lifetime1, var5, 0);
            ((BitmapFont) (var6Lifetime1)).b(var9_ref, 99, var8Lifetime1, 1021128, 0);
            var8Lifetime1 += 17;
            var5Lifetime1 = 1021128;
            ((BitmapFont) (var6Lifetime1)).b(var10_ref, 6, var8Lifetime1, var5Lifetime1, 0);
            ((BitmapFont) (var6Lifetime1)).b(var13, 99, var8Lifetime1, var5Lifetime1, 0);
            var8Lifetime1 += 11;
            ((BitmapFont) (var6Lifetime1)).b(var14, 6, var8Lifetime1, var5Lifetime1, 0);
            if (ge.field_j > 0) {
              ((BitmapFont) (var6Lifetime1)).b(var15, 99, var8Lifetime1, var5Lifetime1, 0);
            }
            if (0 != qh.field_Yb) {
              return;
            }
            qh.field_Yb = 1;
            dl.field_M = 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.V(" + param0 + ')');
        }
    }

    final static cm a(boolean param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        cm stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 256) {
            GameplayController.b((byte) 125);
          }
          stackIn_4_0 = rf.a(param0, param3, (byte) -118, false, param4, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "nb.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int d(boolean param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = param1 >> 4;
          param1 = param1 - this.field_P;
          param1 = param1 >> 4;
          if (!param0) {
            discarded$1 = this.e(-60);
          }
          stackIn_4_0 = param1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, String param1, String param2, boolean param3, boolean param4, String param5) {
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_142_2 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_150_2 = null;
        RuntimeException decompiledCaughtException = null;
        fh var7 = null;
        RuntimeException var7_ref = null;
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
        String[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RgbSprite var21_ref_wk = null;
        int var22_int = 0;
        RgbSprite var22 = null;
        int var23 = 0;
        int var24_int = 0;
        double var24 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var8Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22_intLifetime1;
        int var23Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var23Lifetime2;
        var29 = SteelSentinels.obfuscationControl;
        try {
          if (this.world.field_j) {
            return;
          }
          param4 = false;
          var7 = ff.field_lb;
          var8 = 10;
          var9 = 636;
          if (ge.field_j == 0 &&
            ol.field_Ub == 0 &&
            dl.field_M == 5) {
            var9 = 400;
          }
          var10 = 4;
          var11 = 96;
          var12 = var10 * 2;
          var13 = var10 * 2;
          ParticleEffect.a(var11, var10, (byte) 50, var13, var12, var11);
          var8Lifetime1 = var12 - (-var11 - 8);
          var14 = 0;
          var15 = ff.field_lb.field_U + 3;
          var16 = 14;
          var17 = -10 - var8Lifetime1 + var9;
          var18 = new String[16];
          var19 = 0;
          if (null != param5) {
            var14 = ff.field_lb.a(param5, var17, var15);
          }
          var13 -= 2;
          var20 = 2;
          if (null != param1) {
            var20 += 25;
          }
          var20 = var20 + var14;
          if (param2 != null) {
            var19 = ((BitmapFont) ((Object) var7)).a(param2, new int[]{var17}, var18);
            var20 = var20 + var16 * var19;
          }
          ta.a(var9 - var8Lifetime1, 0, param0 + 0, 255, 0, 128, var8Lifetime1, var13, var20);
          SoftwareRaster.c(var8Lifetime1, var13 + var20, -var8Lifetime1 + var9, param0, 64);
          var13Lifetime1 = 20;
          if (param1 != null) {
            pl.field_U.b(param1, var8Lifetime1 + 5, var13Lifetime1, 16777215, 0);
          }
          var13Lifetime1 += 5;
          if (param5 != null) {
            var21 = 1021128;
            if (this.e(-100) &&
              (5 + var8Lifetime1) <= oh.field_f &&
              oh.field_f < (ff.field_lb.a(param5, var17) + (5 + var8Lifetime1)) &&
              pi.field_c >= var13Lifetime1 &&
              pi.field_c < (var13Lifetime1 + ff.field_lb.a(param5, var17, var15))) {
              var21 = 1044724;
              this.field_r = 42;
            }
            ff.field_lb.a(param5, 5 + var8Lifetime1, var13Lifetime1, var17, 100, var21, -1, 0, 0, var15);
            var13Lifetime1 = var13Lifetime1 + var14;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param2 != null) {
            var21Lifetime1 = 14;
            var12 = 5 + var8Lifetime1;
            var22_int = 16777215;
            if (sh.field_d >= 0) {
              var23 = sh.field_d;
              var24_int = 0;
              var25 = 0;
              var26 = 0;
              while (true) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                if ((var23 > var25) &&
                  (decompiledFrameRemainder1 = (var29 == 0))) {
                  if (null != var18[var24_int] &&
                    var26 < var18[var24_int].length()) {
                    if (60 == var18[var24_int].charAt(var26)) {
                      var27 = var18[var24_int].indexOf('>', 1 + var26);
                      decompiledFrameRemainder0 = !(var27 < 0);
                      if (decompiledFrameRemainder0) {
                        var26 = var27 + 1;
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var25++;
                      var26++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var26 = 0;
                    var24_int++;
                    if (var24_int < var19) {
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (var19 <= var24_int) {
                    break;
                  }
                  var18[var24_int] = var18[var24_int].substring(0, var26);
                }
                var19 = var24_int + 1;
                break;
              }
            }
            var13Lifetime1 = var13Lifetime1 + (var21Lifetime1 + var10);
            var23Lifetime2 = 0;
            while (var23Lifetime2 < var19) {
              ((BitmapFont) ((Object) var7)).b(var18[var23Lifetime2], var12, var13Lifetime1, var22_int, 5263440);
              var13Lifetime1 = var13Lifetime1 + var21Lifetime1;
              var23Lifetime2++;
              if (var29 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var12 = 10;
            var13Lifetime1 = 10;
          }
          if (param4) {
            var21_ref_wk = am.field_f[0];
            var22_intLifetime1 = 1021128;
            if (dl.field_M <= 0) {
              var22_intLifetime1 = 8421504;
              if (var29 != 0 && (oh.field_f >= var12 &&
                (var21_ref_wk.field_z + var12) > oh.field_f &&
                pi.field_c >= var13Lifetime1 &&
                pi.field_c < (var13Lifetime1 + var21_ref_wk.field_B))) {
                this.field_r = 1;
              }
            } else {
              if (oh.field_f >= var12 &&
                (var21_ref_wk.field_z + var12) > oh.field_f &&
                pi.field_c >= var13Lifetime1 &&
                pi.field_c < (var13Lifetime1 + var21_ref_wk.field_B)) {
                this.field_r = 1;
              }
            }
            if (this.field_r == 1) {
              am.field_f[0].b(-3 + var12, -3 + var13Lifetime1, 6 + var21_ref_wk.field_z, 6 + var21_ref_wk.field_B, var22_intLifetime1);
              if (var29 != 0) {
                am.field_f[0].c(var12, var13Lifetime1, var22_intLifetime1);
              }
            } else {
              am.field_f[0].c(var12, var13Lifetime1, var22_intLifetime1);
            }
          }
          if (param3) {
            var12Lifetime1 = 618;
            var21Lifetime2 = 1021128;
            var22 = am.field_f[1];
            var23Lifetime1 = 0;
            if (di.field_g == 10) {
              var23Lifetime1 = 1;
              if (var29 != 0 &&
                this.e(param0 - 100)) {
                var23Lifetime1 = 1;
              }
            } else {
              if (this.e(param0 - 100)) {
                var23Lifetime1 = 1;
              }
            }
            if (var23Lifetime1 != 0) {
              if (!(-1 + var12Lifetime1 <= oh.field_f) ||
                !((15 + var12Lifetime1) > oh.field_f) ||
                !(pi.field_c >= var13Lifetime1 - 1) ||
                !(var13Lifetime1 + 15 > pi.field_c)) {
                var24 = (Math.sin((double)(a.field_c / 8)) + 1.0) * 0.5;
                var26Lifetime1 = (var21Lifetime2 & 16765495) >> 16;
                var27Lifetime1 = (var21Lifetime2 & 65425) >> 8;
                var27Lifetime1 = var27Lifetime1 + (int)((double)(-var27Lifetime1 + 255) * var24);
                var26Lifetime1 = var26Lifetime1 + (int)(var24 * (double)(255 - var26Lifetime1));
                var28 = var21Lifetime2 & 255;
                var28 = var28 + (int)((double)(-var28 + 255) * var24);
                var21Lifetime2 = var28 | (var27Lifetime1 << 8 | var26Lifetime1 << 16);
                if (var29 != 0) {
                  this.field_r = 2;
                  var21Lifetime2 = 8421504;
                }
              } else {
                this.field_r = 2;
                if (var29 != 0) {
                  var21Lifetime2 = 8421504;
                }
              }
            } else {
              var21Lifetime2 = 8421504;
            }
            if (this.field_r != 2) {
              var22.c(var12Lifetime1, var13Lifetime1, var21Lifetime2);
              if (var29 == 0) {
                return;
              }
            }
            var22.b(-2 + var12Lifetime1, var13Lifetime1 - 2, 20, 20, var21Lifetime2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_141_0 = var7_ref;
          stackIn_141_1 = new StringBuilder().append("nb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_142_2 = "null";
          } else {
            stackIn_142_2 = "{...}";
          }
          stackIn_145_1 = ((StringBuilder) (Object) stackIn_141_1).append(stackIn_142_2).append(',');
          if (param2 == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          stackIn_149_1 = ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_150_2 = "null";
          } else {
            stackIn_150_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_141_0), ((StringBuilder) (Object) stackIn_149_1).append(stackIn_150_2).append(')').toString());
        }
    }

    private final void f(boolean param0, int param1) {
        int stackIn_20_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_175_0;
        int stackIn_175_1;
        int stackIn_175_2;
        int stackIn_175_3;
        int stackIn_176_4 = 0;
        int stackIn_245_0 = 0;
        int stackIn_333_0 = 0;
        int stackIn_381_0 = 0;
        int stackIn_381_1 = 0;
        int stackIn_388_0 = 0;
        int stackIn_388_1 = 0;
        int stackIn_389_0 = 0;
        int stackIn_389_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Sentinel var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Sentinel var12_ref_mb = null;
        int var12 = 0;
        Sentinel var13_ref_mb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        NodeIterator var16_ref_jc = null;
        int[] var16_ref_int__ = null;
        int var17 = 0;
        Sentinel var17_ref_mb = null;
        int[] var17_ref_int__ = null;
        int var18 = 0;
        String var18_ref_String = null;
        Sentinel var18_ref_mb = null;
        int var19 = 0;
        int var20 = 0;
        String var21_ref_String = null;
        int var21 = 0;
        String var22 = null;
        int var22_int = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        int var25 = 0;
        RgbSprite var26 = null;
        int var27 = 0;
        Sentinel var12_ref_mbLifetime1;
        String var21_ref_StringLifetime1;
        String var22Lifetime1;
        String var21_ref_StringLifetime1Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var23_intLifetime1;
        int var18Lifetime2;
        int var19Lifetime1Lifetime1;
        int var20Lifetime1Lifetime1;
        int var23_intLifetime1Lifetime1;
        var27 = SteelSentinels.obfuscationControl;
        try {
          var3_int = this.field_M[1];
          var4 = this.field_M[0];
          var5 = 0;
          var6_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var6_ref_mb))) {
            stackIn_20_0 = -1;
            if (var27 == 0) {
              if (!(stackIn_20_0 >= ~var6_ref_mb.playerId) ||
                !(var6_ref_mb.playerId < this.world.playerCount)) {
                if (var6_ref_mb.field_Nb == 11) {
                  var5++;
                }
              } else {
                var5++;
              }
              var6_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -124));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = this.world.field_lb ? 1 : 0;
          }
          if (stackIn_20_0 != 0) {
            var5 += 4;
          }
          var6 = 1;
          if (this.world.field_P == 1) {
            var6 = 2;
            if (var27 != 0 &&
              this.world.field_P == 2) {
              var6 = 3;
            }
          } else {
            if (this.world.field_P == 2) {
              var6 = 3;
            }
          }
          if (var6 == var5) {
            var6 = 1;
          }
          var7 = 3 * var6 - 3 + 12 + (7 * var5 + (-1 + var5) * 2);
          if (uj.field_f &&
            var5 <= 4 &&
            var6 < 2) {
            uj.field_f = false;
          }
          boolean decompiledFrameRemainder4 = true;
          var8 = 138;
          if (uj.field_f &&
            !this.world.field_lb && (var5 > 4 ||
            var5 > 3 &&
            var6 > 1)) {
            stackIn_57_0 = 1;
            decompiledFrameRemainder4 = false;
          }
          else {
            stackIn_57_0 = 0;
          }
          var9 = stackIn_57_0;
          if (var9 != 0) {
            var7 = 28;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameCompleted6 = true;
          boolean decompiledFrameCompleted5 = true;
          var10 = null;
          var11 = null;
          if (var9 != 0 &&
            var6 == 1) {
            var10 = new Sentinel[2];
            var12_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
            while (true) {
              if (null == var12_ref_mb) {
                if (this.controlledSentinel == null) {
                  decompiledFrameCompleted7 = false;
                  break;
                }
                if (this.controlledSentinel == ((Object[]) (var10))[0]) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
                if (this.controlledSentinel == ((Object[]) (var10))[1]) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
                ((Object[]) (var10))[1] = this.controlledSentinel;
                break;
              }
              if (var27 == 0) {
                if (var12_ref_mb.playerId >= 0 &&
                  this.world.playerCount > var12_ref_mb.playerId ||
                  var12_ref_mb.field_Nb == 11) {
                  if (null != ((Object[]) (var10))[0] &&
                    var12_ref_mb.field_vb <= ((Sentinel) (((Object[]) (var10))[0])).field_vb) {
                    if (((Object[]) (var10))[1] == null ||
                      !(((Sentinel) (((Object[]) (var10))[1])).field_vb >= var12_ref_mb.field_vb)) {
                      ((Object[]) (var10))[1] = var12_ref_mb;
                    }
                  } else {
                    ((Object[]) (var10))[1] = ((Object[]) (var10))[0];
                    ((Object[]) (var10))[0] = var12_ref_mb;
                  }
                }
                var12_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -16));
                continue;
              }
              break;
            }
            if ((decompiledFrameCompleted7) &&
              (decompiledFrameCompleted6)) {
              decompiledFrameRemainder2 = !(decompiledFrameCompleted5);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameCompleted7) &&
            (decompiledFrameCompleted6) &&
            (decompiledFrameCompleted5) &&
            (var9 != 0)) {
            var11 = new int[2];
            var12_ref_mbLifetime1 = (Sentinel) (this.world.sentinels.first(13058));
            while (null != var12_ref_mbLifetime1) {
              if (var12_ref_mbLifetime1.teamId == 0 ||
                1 == var12_ref_mbLifetime1.teamId) {
                ((int[]) (var11))[var12_ref_mbLifetime1.teamId] = ((int[]) (var11))[var12_ref_mbLifetime1.teamId] + var12_ref_mbLifetime1.field_vb;
              }
              var12_ref_mbLifetime1 = (Sentinel) (this.world.sentinels.next((byte) -36));
              if (var27 == 0) {
                continue;
              }
              break;
            }
            var7 += 3;
          }
          boolean decompiledFrameCompleted4 = true;
          if (this.world.field_fb &&
            var9 == 0) {
            var12 = 0;
            var13_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
            while (true) {
              boolean decompiledFrameRemainder3 = true;
              if (var13_ref_mb != null) {
                stackIn_137_0 = 0;
                stackIn_137_1 = var13_ref_mb.field_kc;
                if (var27 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
                if (stackIn_137_0 < stackIn_137_1 && (var13_ref_mb.field_Nb == 0 ||
                  var13_ref_mb.field_Nb == 11)) {
                  var12 = 1;
                  decompiledFrameRemainder3 = false;
                }
                else {
                  var13_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -117));
                  continue;
                }
              }
              if (var12 == 0) {
                break;
              }
              var8 += 40;
              break;
            }
          }
          if (decompiledFrameCompleted4) {
            stackIn_137_0 = -2;
            stackIn_137_1 = ~var6;
          }
          if (stackIn_137_0 > stackIn_137_1 &&
            var9 == 0) {
            var8 += 50;
          }
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted3 = true;
          SoftwareRaster.c(0, 0, var8, var7, 0, 192);
          SoftwareRaster.h(0, 0, var8, var7, var3_int, 192);
          if ((!this.world.field_lb) &&
            (!(var5 <= 4) ||
            !(var5 <= 3)) &&
            (!(var5 <= 4) ||
            !(var6 <= 1))) {
            var12 = 138;
            var13 = 12;
            var12 = var12 - var13;
            var14 = var7;
            var15 = 9;
            var14 = var14 - var15 / 2;
            SoftwareRaster.a(var12, var14, var13, var15, 0);
            if (oh.field_f >= var12 &&
              var12 + var13 > oh.field_f &&
              pi.field_c >= var14 &&
              pi.field_c < (var14 + var15)) {
              stackIn_168_0 = 1;
            } else {
              stackIn_168_0 = 0;
            }
            var16 = stackIn_168_0;
            if (var16 != 0) {
              this.field_r = 41;
            }
            stackIn_175_0 = var12;
            stackIn_175_1 = var14;
            stackIn_175_2 = var13;
            stackIn_175_3 = var15;
            if (var16 != 0) {
              stackIn_176_4 = uj.a(var3_int, 120);
            } else {
              stackIn_176_4 = var3_int;
            }
            SoftwareRaster.h(stackIn_175_0, stackIn_175_1, stackIn_175_2, stackIn_175_3, stackIn_176_4);
            var12 = var12 + var13 / 2;
            if (!uj.field_f) {
              var17 = 0;
              while (var17 < 5) {
                SoftwareRaster.g(-var17 + var12, var14 - (-var17 - 1), 2 * var17, var3_int);
                var17++;
                if (var27 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                decompiledFrameRemainder1 = (var27 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted3)) {
              var17 = 0;
              while (var17 < 5) {
                SoftwareRaster.g(-var17 + var12, -var17 + (var15 + (var14 - 3)), 2 * var17, var3_int);
                var17++;
                if (var27 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted2) {
            if (param1 != 8209) {
              this.field_s = 76;
            }
            var12 = 13;
            var13 = -1;
            var14 = 0;
            var15 = 136;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (null != var10) {
            var16_ref_jc = new NodeIterator(this.world.sentinels);
            SoftwareRaster.a(0, 0, var8, -1 + var7);
            var17_ref_mb = (Sentinel) (var16_ref_jc.b(param1 - 8207));
            while (null != var17_ref_mb) {
              var18 = var17_ref_mb.playerId;
              stackIn_388_0 = var18;
              stackIn_388_1 = this.world.field_A;
              if (var27 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_388_0 == stackIn_388_1 &&
                null != this.field_B) {
                var18 = -1 + this.field_B.length;
              }
              if (this.field_B != null &&
                var18 >= 0 &&
                var18 < this.field_B.length) {
                var12 = this.field_B[var18];
                var12 += 12;
                if (var12 < var7) {
                  var19 = var4;
                  var20 = 13421772;
                  if (var17_ref_mb.field_Ab <= 0) {
                    if (var17_ref_mb.field_Ab < 0) {
                      var20 = 16711680;
                    } else if (var17_ref_mb.field_Cb && (this.world.terrain.getTerrainType(84) == 3 ||
                      this.world.terrain.getTerrainType(param1 - 8131) == 2)) {
                      var20 = 16777215;
                    }
                  } else {
                    var20 = 16777215;
                  }
                  if (this.world.playerCount > var17_ref_mb.playerId) {
                    var21_ref_String = this.world.playerNames[var17_ref_mb.playerId].toUpperCase();
                    if (this.field_d) {
                      var19 = var17_ref_mb.getTeamColour((byte) -117);
                      if (~PartInstruction.field_t[0] == ~var19) {
                        var19 = uj.a(var19, 91);
                      }
                    }
                    var22 = Integer.toString(var17_ref_mb.field_vb / 100);
                    stackIn_245_0 = (0 == (this.world.field_hb & 1 << var17_ref_mb.playerId)) ? 0 : 1;
                    var23_int = stackIn_245_0;
                    if (var23_int != 0) {
                      var19 = 10526880;
                      var20 = 10526880;
                    } else {
                      var14 = var14 + var17_ref_mb.field_vb;
                    }
                    if (var17_ref_mb.field_Cb &&
                      this.world.terrain.getTerrainType(param1 ^ 8298) == 2) {
                      var19 = 16776960;
                    }
                    fk.field_d.b(var21_ref_String, 6, var12, var19, -1);
                    fk.field_d.c(var22, 132, var12, var20, -1);
                    if (var23_int != 0) {
                      SoftwareRaster.g(6, -1 + var12 - fk.field_d.field_U / 2, 126, 10526880);
                    }
                  } else {
                    if (var17_ref_mb.field_Nb == 11) {
                      var21_ref_String = this.world.d(-1661904765, var17_ref_mb.playerId);
                      var19 = var17_ref_mb.getTeamColour((byte) -124);
                      var22 = Integer.toString(var17_ref_mb.field_vb / 100);
                      fk.field_d.b(var21_ref_String, 6, var12, var19, -1);
                      fk.field_d.c(var22, 132, var12, 13421772, -1);
                      var12 += 9;
                    }
                  }
                }
              }
              var17_ref_mb = (Sentinel) (var16_ref_jc.d(2));
            }
            if (decompiledFrameCompleted1) {
              SoftwareRaster.c();
              decompiledFrameRemainder0 = (var27 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted1)) {
            if ((var11 != null) &&
              (decompiledFrameRemainder0 = (null != this.field_B))) {
              var16 = 0;
              while (var16 < 2) {
                var17 = var16;
                var18_ref_String = mm.field_d[var17].toUpperCase();
                var19Lifetime1 = fj.field_h[var17];
                var20Lifetime1 = 13421772;
                stackIn_389_0 = var19Lifetime1;
                stackIn_389_1 = fj.field_h[0];
                if (var27 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_389_0 == stackIn_389_1) {
                  var19Lifetime1 = uj.a(var19Lifetime1, 119);
                }
                var21_ref_StringLifetime1 = Integer.toString(((int[]) (var11))[var17] / 100);
                var12 = this.field_B[var16] + 12;
                fk.field_d.b(var18_ref_String, 6, var12, var19Lifetime1, -1);
                fk.field_d.c(var21_ref_StringLifetime1, 132, var12, var20Lifetime1, -1);
                var16++;
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var27 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var16_ref_int__ = new int[]{480, 480};
              var17_ref_int__ = new int[]{0, 0};
              var18_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
              while (true) {
                if (null != var18_ref_mb) {
                  var19Lifetime1Lifetime1 = var4;
                  var20Lifetime1Lifetime1 = 13421772;
                  stackIn_381_0 = 0;
                  stackIn_381_1 = var18_ref_mb.field_Ab;
                  if (var27 == 0) {
                    if (stackIn_381_0 >= stackIn_381_1) {
                      if (var18_ref_mb.field_Ab >= 0) {
                        if (var18_ref_mb.field_Cb && (3 == this.world.terrain.getTerrainType(74) ||
                          this.world.terrain.getTerrainType(126) == 2)) {
                          var20Lifetime1Lifetime1 = 16777215;
                        }
                      } else {
                        var20Lifetime1Lifetime1 = 16711680;
                      }
                    } else {
                      var20Lifetime1Lifetime1 = 16777215;
                    }
                    if (var18_ref_mb.playerId >= 0 &&
                      this.world.playerCount > var18_ref_mb.playerId) {
                      var21_ref_StringLifetime1Lifetime1 = this.world.playerNames[var18_ref_mb.playerId].toUpperCase();
                      if (this.field_B != null &&
                        var18_ref_mb.playerId < this.field_B.length) {
                        var12 = this.field_B[var18_ref_mb.playerId] + 13;
                      }
                      if (var6 > 1) {
                        var16_ref_int__[var18_ref_mb.teamId] = Math.min(var16_ref_int__[var18_ref_mb.teamId], var12 - 7);
                        var17_ref_int__[var18_ref_mb.teamId] = Math.max(var17_ref_int__[var18_ref_mb.teamId], var12);
                      }
                      if (var6 > 1 &&
                        ~var18_ref_mb.teamId != ~var13) {
                        if (var13 != -1) {
                          var22_int = fj.field_h[var13];
                          if (var22_int == PartInstruction.field_t[0]) {
                            var22_int = uj.a(var22_int, 105);
                          }
                          SoftwareRaster.g(var15, var16_ref_int__[var13], 3, var22_int);
                          SoftwareRaster.g(var15, var17_ref_int__[var13], 3, var22_int);
                          SoftwareRaster.d(3 + var15, var16_ref_int__[var13], 1 + (var17_ref_int__[var13] - var16_ref_int__[var13]), var22_int);
                          var14 = var14 / 100;
                          var23_intLifetime1 = (var16_ref_int__[var13] + var17_ref_int__[var13]) / 2;
                          var24_int = ff.field_lb.c(Integer.toString(var14));
                          var24_int = -3 - var15 + (-6 + (var8 - var24_int));
                          SoftwareRaster.g(3 + var15, var23_intLifetime1, -5 + var24_int, var22_int);
                          ff.field_lb.b(Integer.toString(var14), var24_int + (3 + var15), 4 + var23_intLifetime1, var22_int, -1);
                        }
                        var13 = var18_ref_mb.teamId;
                        var14 = 0;
                      }
                      if (this.field_d) {
                        var19Lifetime1Lifetime1 = var18_ref_mb.getTeamColour((byte) 88);
                        if (~PartInstruction.field_t[0] == ~var19Lifetime1Lifetime1) {
                          var19Lifetime1Lifetime1 = uj.a(var19Lifetime1Lifetime1, 114);
                        }
                      }
                      var22Lifetime1 = Integer.toString(var18_ref_mb.field_vb / 100);
                      var14 = var14 + var18_ref_mb.field_vb;
                      stackIn_333_0 = ((1 << var18_ref_mb.playerId & this.world.field_hb) == 0) ? 0 : 1;
                      var23_intLifetime1Lifetime1 = stackIn_333_0;
                      if (var23_intLifetime1Lifetime1 != 0) {
                        var19Lifetime1Lifetime1 = 10526880;
                        if (var6 <= 1) {
                          var20Lifetime1Lifetime1 = 10526880;
                        }
                      }
                      if (var18_ref_mb.field_Cb &&
                        this.world.terrain.getTerrainType(param1 ^ 8259) == 2) {
                        var19Lifetime1Lifetime1 = 16776960;
                      }
                      fk.field_d.b(var21_ref_StringLifetime1Lifetime1, 6, var12, var19Lifetime1Lifetime1, -1);
                      fk.field_d.c(var22Lifetime1, 132, var12, var20Lifetime1Lifetime1, -1);
                      if (this.world.field_fb &&
                        var18_ref_mb.field_kc > 0) {
                        var24 = "<times>" + var18_ref_mb.field_kc;
                        var25 = fk.field_d.c(var24);
                        var26 = pd.field_Z[31];
                        var26.b(-1 + (-(var26.field_z / 2) + (-var25 + 172)), var12 - 8);
                        fk.field_d.b("<times>" + var18_ref_mb.field_kc, -var25 + 172, var12, 13421772, -1);
                      }
                      if (var23_intLifetime1Lifetime1 != 0) {
                        if (1 < var6) {
                          SoftwareRaster.g(6, -(fk.field_d.field_U / 2) + var12 - 1, fk.field_d.c(var21_ref_StringLifetime1Lifetime1), 10526880);
                        } else {
                          SoftwareRaster.g(6, var12 - fk.field_d.field_U / 2 - 1, 126, 10526880);
                        }
                      }
                      var12 += 9;
                    } else {
                      if (var18_ref_mb.field_Nb == 11) {
                        var21 = var18_ref_mb.playerId;
                        if (this.world.field_A == var21 &&
                          null != this.field_B) {
                          var21 = this.field_B.length - 1;
                        }
                        if (null != this.field_B &&
                          this.field_B.length > var21) {
                          var12 = 13 + this.field_B[var21];
                        }
                        var19Lifetime1Lifetime1 = var18_ref_mb.getTeamColour((byte) -98);
                        var22Lifetime1 = this.world.d(-1661904765, var18_ref_mb.playerId);
                        var23 = Integer.toString(var18_ref_mb.field_vb / 100);
                        fk.field_d.b(var22Lifetime1, 6, var12, var19Lifetime1Lifetime1, -1);
                        fk.field_d.c(var23, 132, var12, var20Lifetime1Lifetime1, -1);
                        if (this.world.field_fb &&
                          var18_ref_mb.field_kc > 0) {
                          var24 = "<times>" + var18_ref_mb.field_kc;
                          var25 = fk.field_d.c(var24);
                          var26 = pd.field_Z[31];
                          var26.b(-1 - var25 + (172 - var26.field_z / 2), var12 - 8);
                          fk.field_d.b("<times>" + var18_ref_mb.field_kc, 172 - var25, var12, 13421772, -1);
                        }
                        var12 += 9;
                      }
                    }
                    var18_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -97));
                    continue;
                  }
                } else {
                  stackIn_381_0 = var13;
                  stackIn_381_1 = -1;
                }
                if (stackIn_381_0 == stackIn_381_1) {
                  break;
                }
                var17_ref_int__[var13] = Math.max(var17_ref_int__[var13], var12 - 7 - 2);
                SoftwareRaster.g(var15, var16_ref_int__[var13], 3, fj.field_h[var13]);
                SoftwareRaster.g(var15, var17_ref_int__[var13], 3, fj.field_h[var13]);
                SoftwareRaster.d(3 + var15, var16_ref_int__[var13], -var16_ref_int__[var13] + (var17_ref_int__[var13] + 1), fj.field_h[var13]);
                var14 = var14 / 100;
                var18Lifetime2 = (var16_ref_int__[var13] + var17_ref_int__[var13]) / 2;
                var19Lifetime1Lifetime1 = ff.field_lb.c(Integer.toString(var14));
                var19Lifetime1Lifetime1 = -var19Lifetime1Lifetime1 - 6 + (var8 - 3 - var15);
                SoftwareRaster.g(3 + var15, var18Lifetime2, -5 + var19Lifetime1Lifetime1, fj.field_h[var13]);
                ff.field_lb.b(Integer.toString(var14), var19Lifetime1Lifetime1 + var15 + 3, var18Lifetime2 + 4, fj.field_h[var13], -1);
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            if (!this.world.field_lb) {
              return;
            }
            stackIn_388_0 = 13;
            stackIn_388_1 = this.field_B.length * 9;
          }
          if (decompiledFrameCompleted0) {
            var12 = stackIn_388_0 + stackIn_388_1;
            var12 += 9;
            fk.field_d.b(ci.field_f, 6, var12, var4, -1);
            fk.field_d.c(Integer.toString(this.world.field_cb), 132, var12, 13421772, -1);
            var12 += 9;
            fk.field_d.b(mc.field_e, 6, var12, var4, -1);
            fk.field_d.c(Integer.toString(this.world.field_M), 132, var12, 13421772, -1);
            var12 += 4;
            var16 = 6;
            var17 = 126;
            stackIn_389_0 = -1;
            stackIn_389_1 = ~this.world.field_d;
          }
          if (stackIn_389_0 > stackIn_389_1) {
            var18Lifetime1 = Math.min(var17 - 2, this.world.field_gb * (var17 - 2) / this.world.field_d);
            SoftwareRaster.h(var16, var12, var17, 7, var4);
            SoftwareRaster.a(1 + var16, 1 + var12, var18Lifetime1, 5, this.field_M[2]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.FA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        boolean stackIn_8_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_33_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          this.field_Y = 0;
          fn.field_a = false;
          this.field_v = 0;
          ue.field_b = false;
          this.controlledSentinel.field_U = 0;
          var3 = FunOrbClient.field_z;
          if (this.field_o == null) {
            this.field_o = new int[var3.length];
            this.field_g = new int[var3.length];
          }
          var4 = 7;
          var5 = 41;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var8 >= var3.length))) {
            stackOut_7_0 = t.a(rn.field_D, var3[var8], -20370);
            stackIn_14_0 = stackOut_7_0 ? 1 : 0;
            stackIn_8_0 = stackOut_7_0;
            if (var9 == 0) {
              if (stackIn_8_0) {
                var7++;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_s = 0;
            var7 = (var7 + param0) / 2;
            stackIn_14_0 = 0;
          }
          var8Lifetime1 = stackIn_14_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3.length <= var8Lifetime1))) {
            stackIn_33_0 = t.a(rn.field_D, var3[var8Lifetime1], param0 - 20371);
            if (var9 == 0) {
              if (!stackIn_33_0) {
                this.field_o[var8Lifetime1] = -1;
              } else {
                this.field_o[var8Lifetime1] = var4;
                this.field_g[var8Lifetime1] = var5;
                var6++;
                var5 += 32;
                if (this.field_s < this.field_g[var8Lifetime1]) {
                  this.field_s = this.field_g[var8Lifetime1];
                }
                if (var7 == var6) {
                  var4 += 82;
                  var5 = 41;
                }
              }
              var8Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = param1;
          }
          if (stackIn_33_0) {
            this.controlledSentinel.worldY = -50000;
            this.controlledSentinel.worldX = 138000;
            this.controlledSentinel.field_Qb = 256;
            this.controlledSentinel.velocityY = 1000;
            this.field_E = 327;
            this.field_P = 6000;
            this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
          }
          this.field_s = this.field_s + 40;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "nb.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        String stackIn_55_3 = null;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        String stackIn_64_3 = null;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        String stackIn_71_3 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        Object var7_ref = null;
        int var7 = 0;
        Object var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        int var8Lifetime1;
        try {
          if (this.world.field_j) {
            return;
          }
          var2 = dl.field_H[di.field_g];
          var3 = dj.field_g[di.field_g];
          if (dm.field_c) {
            var3 = null;
          }
          var5 = 126 % ((-10 - param0) / 38);
          var4 = 2 * dl.field_M;
          if (0 <= var4 &&
            var4 < var2.length) {
            var6_ref = null;
            var7_ref = null;
            var8_ref = null;
            if (dl.field_N.length > ol.field_Ub &&
              dl.field_N[ol.field_Ub].length > dl.field_M) {
              var6_ref = dl.field_N[ol.field_Ub][dl.field_M];
            }
            if (null != var3) {
              var7_ref = var3[var4];
            }
            if (qh.field_Yb <= dl.field_M) {
              if (var3 != null) {
                var8_ref = var3[var4 + 1];
              }
              if (null == var8_ref) {
                var8_ref = var2[var4 + 1];
              }
            } else {
              var8_ref = ue.field_d;
            }
            if (null == var7_ref) {
              var7_ref = var2[var4];
            }
            this.a(0, (String) (var6_ref), (String) (var7_ref), true, true, (String) (var8_ref));
          }
          if (ge.field_j == 0 &&
            ol.field_Ub == 0 &&
            pm.field_T == -1 &&
            vb.field_g == -1 &&
            5 == dl.field_M) {
            var6 = 404;
            var7 = 30;
            var8 = 30;
            var9 = 230;
            var10 = null;
            stackIn_54_0 = var7;
            stackIn_54_1 = var6;
            stackIn_54_2 = 127;
            if (!dm.field_c) {
              stackIn_55_3 = od.field_j;
            } else {
              stackIn_55_3 = qm.field_c;
            }
            if (nm.a(stackIn_54_0, stackIn_54_1, stackIn_54_2, stackIn_55_3, var8, var9)) {
              this.field_r = 36;
            }
            if (dm.field_c) {
              var7 += 35;
              stackIn_63_0 = var7;
              stackIn_63_1 = var6;
              stackIn_63_2 = 127;
              if (ui.field_G) {
                stackIn_64_3 = tm.field_f;
              } else {
                stackIn_64_3 = fj.field_i;
              }
              if (nm.a(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_64_3, var8, var9)) {
                this.field_r = 37;
              }
              var7 += 35;
              stackIn_70_0 = var7;
              stackIn_70_1 = var6;
              stackIn_70_2 = 121;
              if (!ik.field_h) {
                stackIn_71_3 = sa.field_b;
              } else {
                stackIn_71_3 = o.field_a;
              }
              if (nm.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_71_3, var8, var9)) {
                this.field_r = 38;
              }
              var10_ref = hb.field_g[0];
              var7 += 35;
            } else {
              var7 += 105;
              var10_ref = hb.field_g[1];
            }
            var9 -= 5;
            var6 += 3;
            var7 += 3;
            var8Lifetime1 = ff.field_lb.a(var10_ref, var9, 18);
            SoftwareRaster.c(-3 + var6, -3 + var7, var9 + 5, var8Lifetime1 + 5, 0, 128);
            ff.field_lb.a(var10_ref, var6, var7, var9, 100, 1021128, -1, 0, 0, 18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.TA(" + param0 + ')');
        }
    }

    final void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = SteelSentinels.obfuscationControl;
        try {
          this.c(false);
          if (param0 < 18) {
            this.field_J = true;
          }
          Sprite.field_k = false;
          lc.field_e = true;
          if ((ge.field_j != 0 ||
            !(3 > fm.field_f[0]) ||
            !(nc.field_a >= 0) &&
            !lh.field_D) &&
            (!lh.field_D ||
            !ni.b(34))) {
            if (!(nc.field_a >= 0) ||
              ni.b(11)) {
              var2_int = vb.field_g;
              if (var2_int == 5 ||
                var2_int == 6 ||
                var2_int == 8) {
                var2_int = SceneWidget.field_Jb;
              }
              q.a(20, false, -1, var2_int);
              if (var3 == 0) {
                return;
              }
            }
            var2_intLifetime2 = vb.field_g;
            if (var2_intLifetime2 == 5 ||
              var2_intLifetime2 == 6 ||
              var2_intLifetime2 == 8) {
              var2_intLifetime2 = SceneWidget.field_Jb;
            }
            q.a(19, false, -1, var2_intLifetime2);
            if (var3 == 0) {
              return;
            }
          }
          ol.field_Ub = ol.field_Ub + 1;
          var2_intLifetime1 = vb.field_g;
          if (var2_intLifetime1 == 5 ||
            var2_intLifetime1 == 6 ||
            var2_intLifetime1 == 8) {
            var2_intLifetime1 = SceneWidget.field_Jb;
          }
          q.a(20, false, -1, var2_intLifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.O(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        int incrementValue$0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Sentinel[] var4 = null;
        int var5 = 0;
        NodeIterator var6 = null;
        Sentinel var7_ref_mb = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Sentinel var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_52_0Lifetime1;
        int stackIn_52_1Lifetime1;
        int var7Lifetime1;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var2 = new int[2];
          var3 = this.world.computerPlayerCount + this.world.playerCount;
          if (null == this.field_B ||
            ~var3 != ~this.field_B.length) {
            this.field_B = new int[var3];
          }
          var4 = new Sentinel[var3];
          var5 = 0;
          var6 = new NodeIterator(this.world.sentinels);
          var7_ref_mb = (Sentinel) (var6.b(2));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var7_ref_mb))) {
            stackIn_20_0 = -1;
            stackIn_20_1 = ~var7_ref_mb.playerId;
            if (var12 == 0) {
              if (stackIn_20_0 >= stackIn_20_1 &&
                var7_ref_mb.playerId < var3) {
                incrementValue$0 = var5;
                var5++;
                var4[incrementValue$0] = var7_ref_mb;
              }
              var2[var7_ref_mb.teamId] = var2[var7_ref_mb.teamId] + (var7_ref_mb.field_vb - var7_ref_mb.field_Ab);
              var7_ref_mb = (Sentinel) (var6.d(2));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = ~(var2[0] / 100);
            stackIn_20_1 = ~(var2[1] / 100);
          }
          if (stackIn_20_0 == stackIn_20_1) {
            if (this.field_B[var3 / 2] >= this.field_B[0]) {
              var2[0] = var2[0] + 100;
              if (var12 != 0) {
                var2[1] = var2[1] + 100;
              }
            } else {
              var2[1] = var2[1] + 100;
            }
          }
          if (param0 != 30483) {
            this.field_D = (int[]) null;
          }
          var7 = 0;
          scanLoop1: while (true) {
            if ((-1 + var3) > var7) {
              var8 = var7;
              stackIn_57_0 = var7;
              if (var12 != 0) {
                break scanLoop1;
              }
              var9 = stackIn_57_0;
              while (var3 > var9) {
                stackIn_52_0 = var2[var4[var8].teamId];
                stackIn_52_1 = var2[var4[var9].teamId];
                if (stackIn_52_0 < stackIn_52_1 ||
                  var4[var8].teamId == var4[var9].teamId &&
                  !(var4[var8].field_vb - var4[var8].field_Ab >= var4[var9].field_vb - var4[var9].field_Ab)) {
                  var8 = var9;
                }
                var9++;
              }
              stackIn_52_0Lifetime1 = var7;
              stackIn_52_1Lifetime1 = var8;
              if (stackIn_52_0Lifetime1 != stackIn_52_1Lifetime1) {
                var10 = var4[var7];
                var4[var7] = var4[var8];
                var4[var8] = var10;
              }
              var7++;
              continue scanLoop1;
            }
            var8 = 0;
            stackIn_57_0 = 0;
            break;
          }
          var7Lifetime1 = stackIn_57_0;
          while (var7Lifetime1 < var3) {
            var11 = var4[var7Lifetime1].playerId;
            if (var12 != 0) {
              return;
            }
            if (var7Lifetime1 > 0 &&
              ~var4[var7Lifetime1 - 1].teamId != ~var4[var7Lifetime1].teamId) {
              var8 += 3;
            }
            if (var8 <= this.field_B[var11]) {
              if (this.field_B[var11] > var8) {
                this.field_B[var11] = this.field_B[var11] - 1;
              }
            } else {
              this.field_B[var11] = this.field_B[var11] + 1;
            }
            var8 += 9;
            var7Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.G(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, boolean param2, BattleTerrain param3) {
        int stackIn_11_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_199_0 = 0;
        int stackIn_199_1 = 0;
        RuntimeException stackIn_209_0 = null;
        StringBuilder stackIn_209_1 = null;
        String stackIn_210_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        IsaacRandom var12_ref_ie = null;
        RgbSprite var12_ref_wk = null;
        int var13 = 0;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_135_0Lifetime1;
        int stackIn_135_1Lifetime1;
        int stackIn_190_0Lifetime1;
        int stackIn_190_1Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var13Lifetime2;
        int var14Lifetime2;
        int var15Lifetime2;
        int var16Lifetime2;
        int var17Lifetime2;
        int var18Lifetime2;
        int var19Lifetime2;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var27 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_E > 1024) {
            this.field_E = 1024;
          }
          var5_int = this.field_P;
          var6 = this.field_E;
          SoftwareRaster.a(0, 0, 640, 400);
          var7 = -(var6 >> 4) + 400;
          var8 = -var7 + 400;
          if (var8 < 30) {
            var8 = 30;
          }
          stackIn_11_0 = (4 == param3.getTerrainType(111)) ? 0 : 1;
          boolean decompiledFrameCompleted7 = true;
          var9 = stackIn_11_0;
          if (param1) {
            if (var9 == 0) {
              SoftwareRaster.b();
              var10 = -var8 + var7;
              var11 = -(this.field_P >> 4) + (this.world.terrain.getProfileLength(param0 - 74) / 2 >> 4);
              var11 = 320 + (var11 - 320) * 3 / 10;
              var12 = 1000;
              var13 = 4 * var8 / 6 + (var10 - var12 * 2 / 3);
              var13 = 31 - (this.field_E >> 4);
              var13 = -180 + ((var13 * 3 - 720) / 10 + 240);
              if (null == un.field_o ||
                h.field_T == null) {
                im.field_h.field_d = 0;
                un.field_o = (RgbSprite) ((Object) new ek(im.field_h.a("planet.jpg", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                h.field_T = (RgbSprite) ((Object) new ek(im.field_h.a("moon.jpg", param0 ^ -665, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
              }
              if (null != un.field_o &&
                h.field_T != null) {
                un.field_o.f(var11, var13);
                var11 = -(this.field_P >> 4) / 2;
                h.field_T.f(var11, var13);
              }
            }
            if (var9 != 0) {
              var10Lifetime2 = -var8 + var7;
              if (0 < var8) {
                var11Lifetime2 = 0;
                var12Lifetime2 = 288;
                var13Lifetime2 = var12Lifetime2 * 800 >> 9;
                SoftwareRaster.a(0, 0, 640, -(var13Lifetime2 * 4 / 5) + (var10Lifetime2 + 4 * var8 / 6), 0);
                var14 = this.world.terrain.getProfileLength(86) - 10240;
                if (var14 < 30000) {
                  var14 = 30000;
                }
                var15 = -this.field_P * (var13Lifetime2 * 2 - 640) / var14;
                var16 = 4 * var8 / 6 + var10Lifetime2 - 4 * var13Lifetime2 / 5;
                var11Lifetime2++;
                var16 = 1 * (-240 + var16) / 10;
                if (var11Lifetime2 >= 4) {
                  var11Lifetime2 -= 4;
                }
                if (null == jh.field_h) {
                  im.field_h.field_d = 0;
                  if (this.world.terrain.getTerrainType(55) == 0) {
                    jh.field_h = new RgbSprite(im.field_h.a("wz_background.jpg", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false)));
                  }
                  if (1 == this.world.terrain.getTerrainType(79)) {
                    jh.field_h = new RgbSprite(im.field_h.a("lw_background.jpg", param0 - 867, "lostworld/"), (java.awt.Component) ((Object) gl.a(false)));
                  }
                  if (this.world.terrain.getTerrainType(63) == 2) {
                    jh.field_h = new RgbSprite(im.field_h.a("ct_background.jpg", param0 - 867, "city/"), (java.awt.Component) ((Object) gl.a(false)));
                  }
                  if (this.world.terrain.getTerrainType(90) == 3) {
                    jh.field_h = new RgbSprite(im.field_h.a("mn_background.jpg", -742, "moon/"), (java.awt.Component) ((Object) gl.a(false)));
                  }
                }
                if (jh.field_h != null) {
                  jh.field_h.c(var15, var16, 2 * var13Lifetime2, var13Lifetime2);
                }
                if (this.world.terrain.getTerrainType(113) != 3 &&
                  ka.field_V) {
                  var12_ref_ie = new IsaacRandom(new int[]{this.world.mapSeed, this.world.mapSeed});
                  var13_ref_int__ = new int[]{24000, 24000, 10000, 26000};
                  var14Lifetime2 = var12_ref_ie.nextIntBounded(-95, var13_ref_int__.length);
                  var15Lifetime2 = 256;
                  var16Lifetime2 = 500 * var15Lifetime2 >> 9;
                  var17 = -16000;
                  while (true) {
                    if (!(var17 < (22000 + this.world.terrain.getProfileLength(param0 - 249)))) {
                      var15Lifetime2 = 256;
                      stackIn_78_0 = 800 * var15Lifetime2;
                      stackIn_78_1 = -325987223;
                      break;
                    }
                    var18 = -this.field_P * var15Lifetime2 / 4096 + (var15Lifetime2 * var17 >> 12);
                    var19 = var8 + var10Lifetime2 - var16Lifetime2;
                    var18 = 320 + (3 * var18 - 960) / 20;
                    var19 = (-720 + 3 * var19) / 20 + 160;
                    stackIn_78_0 = this.world.terrain.getTerrainType(76);
                    stackIn_78_1 = 2;
                    if (var27 == 0) {
                      if (stackIn_78_0 == stackIn_78_1 &&
                        ig.field_o[this.world.terrain.getTerrainType(param0 - 38)][var14Lifetime2].field_F >= 300) {
                        ig.field_o[this.world.terrain.getTerrainType(81)][var14Lifetime2].c(var18 - var16Lifetime2 / 2, var19, var16Lifetime2, var16Lifetime2);
                      }
                      var17 = var17 + var13_ref_int__[var14Lifetime2];
                      var14Lifetime2 = var14Lifetime2 + (var12_ref_ie.nextIntBounded(-107, var13_ref_int__.length - 1) + 1);
                      if (var14Lifetime2 >= var13_ref_int__.length) {
                        var14Lifetime2 = var14Lifetime2 - var13_ref_int__.length;
                      }
                      continue;
                    }
                    break;
                  }
                  var16Lifetime2 = stackIn_78_0 >> stackIn_78_1;
                  var17Lifetime2 = -12000;
                  while (!((20000 + this.world.terrain.getProfileLength(106)) <= var17Lifetime2)) {
                    var18Lifetime2 = -this.field_P * var15Lifetime2 / 4096 + (var15Lifetime2 * var17Lifetime2 >> 12);
                    var19Lifetime2 = var8 + var10Lifetime2 - var16Lifetime2;
                    var18Lifetime2 = 320 + (-320 + var18Lifetime2) * 5 / 20;
                    var19Lifetime2 = (var19Lifetime2 * 5 - 1200) / 20 + 80;
                    ig.field_o[this.world.terrain.getTerrainType(101)][var14Lifetime2].c(var18Lifetime2 - var16Lifetime2 / 2, var19Lifetime2, var16Lifetime2, var16Lifetime2);
                    var17Lifetime2 = var17Lifetime2 + var13_ref_int__[var14Lifetime2];
                    var14Lifetime2 = var14Lifetime2 + (1 + var12_ref_ie.nextIntBounded(-122, -1 + var13_ref_int__.length));
                    stackIn_88_0 = ~var13_ref_int__.length;
                    stackIn_88_1 = ~var14Lifetime2;
                    if (var27 != 0) {
                      decompiledFrameCompleted7 = false;
                      break;
                    }
                    if (stackIn_88_0 >= stackIn_88_1) {
                      var14Lifetime2 = var14Lifetime2 - var13_ref_int__.length;
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameCompleted7) {
            stackIn_88_0 = param0;
            stackIn_88_1 = 125;
          }
          if (stackIn_88_0 != stackIn_88_1) {
            this.field_j = 55;
          }
          if (param2) {
            boolean decompiledFrameCompleted6 = true;
            if (var9 == 0) {
              var10Lifetime1 = -(this.field_P >> 4);
              var11Lifetime1 = -(this.field_E >> 4) + 400;
              var12Lifetime1 = 0;
              while (var12Lifetime1 < param3.field_c) {
                var13Lifetime1 = var10Lifetime1 + (param3.spawnPositions[var12Lifetime1] >> 4);
                var14Lifetime1 = var11Lifetime1 - (param3.field_h[var12Lifetime1] >> 4);
                stackIn_199_0 = var12Lifetime1;
                stackIn_199_1 = 2;
                if (var27 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
                if (stackIn_199_0 < stackIn_199_1) {
                  var15Lifetime1 = sb.field_W.field_z;
                  if (var12Lifetime1 == 0) {
                    sb.field_W.a(-(var15Lifetime1 / 2) + var13Lifetime1, var14Lifetime1);
                    var16Lifetime1 = this.world.simulationTick / 5 % 6;
                    if ((1 & this.world.field_v) == 0) {
                      b.field_n[var16Lifetime1].d(var13Lifetime1 - var15Lifetime1 / 2, var14Lifetime1, var15Lifetime1, var15Lifetime1, 64);
                    }
                  }
                  if (1 == var12Lifetime1) {
                    hb.field_e.a(-(var15Lifetime1 / 2) + var13Lifetime1, var14Lifetime1);
                    var16Lifetime1 = 6 + this.world.simulationTick / 5 % 6;
                    if ((2 & this.world.field_v) == 0) {
                      b.field_n[var16Lifetime1].d(var13Lifetime1 - var15Lifetime1 / 2, var14Lifetime1, var15Lifetime1, var15Lifetime1, 64);
                    }
                  }
                } else {
                  if (param3.field_j[var12Lifetime1] != -1) {
                    var15Lifetime1 = kc.field_x[1][param3.field_j[var12Lifetime1]].field_z >> 2;
                    kc.field_x[1][param3.field_j[var12Lifetime1]].c(var13Lifetime1 - var15Lifetime1 / 2, var14Lifetime1, var15Lifetime1, var15Lifetime1);
                  }
                }
                var12Lifetime1++;
              }
            }
            if (decompiledFrameCompleted6) {
              if (var9 != 0 ||
                var27 != 0) {
                boolean decompiledFrameCompleted2 = true;
                boolean decompiledFrameCompleted5 = true;
                boolean decompiledFrameCompleted3 = true;
                regionExit1: {
                  var10Lifetime1 = -(this.field_P >> 4);
                  var11Lifetime1 = 400 - (this.field_E >> 4);
                  if (2 == param3.getTerrainType(54)) {
                    boolean decompiledFrameCompleted4 = true;
                    if (ka.field_V) {
                      var12Lifetime1 = 0;
                      while (!(var12Lifetime1 >= param3.field_c)) {
                        stackIn_135_0 = 1;
                        stackIn_135_1 = param3.field_j[var12Lifetime1];
                        if (var27 == 0) {
                          if (stackIn_135_0 < stackIn_135_1) {
                            var13Lifetime1 = (param3.spawnPositions[var12Lifetime1] >> 4) + var10Lifetime1;
                            var14Lifetime1 = -(param3.field_h[var12Lifetime1] >> 4) + var11Lifetime1;
                            var15Lifetime1 = kc.field_x[this.world.terrain.getTerrainType(param0 ^ 63)][param3.field_j[var12Lifetime1]].field_z >> 1;
                            kc.field_x[this.world.terrain.getTerrainType(70)][param3.field_j[var12Lifetime1]].c(var13Lifetime1 - var15Lifetime1 / 2, var14Lifetime1, var15Lifetime1, var15Lifetime1);
                          }
                          var12Lifetime1++;
                          continue;
                        }
                        if (stackIn_135_0 > stackIn_135_1) {
                          stackIn_157_0 = 1;
                          stackIn_157_1 = param3.field_j[var12Lifetime1];
                          decompiledFrameCompleted5 = false;
                          break;
                        }
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                    }
                    if ((decompiledFrameCompleted5) &&
                      (decompiledFrameCompleted4)) {
                      var12Lifetime1 = 0;
                      while (true) {
                        stackIn_135_0Lifetime1 = ~var12Lifetime1;
                        stackIn_135_1Lifetime1 = ~param3.field_c;
                        if (stackIn_135_0Lifetime1 <= stackIn_135_1Lifetime1) {
                          break;
                        }
                        stackIn_157_0 = 1;
                        stackIn_157_1 = param3.field_j[var12Lifetime1];
                        if (var27 != 0) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                        if (stackIn_157_0 >= stackIn_157_1) {
                          var13Lifetime1 = var10Lifetime1 + (param3.spawnPositions[var12Lifetime1] >> 4);
                          var14Lifetime1 = var11Lifetime1 - (param3.field_h[var12Lifetime1] >> 4);
                          var15Lifetime1 = kc.field_x[this.world.terrain.getTerrainType(46)][param3.field_j[var12Lifetime1]].field_z >> 1;
                          kc.field_x[this.world.terrain.getTerrainType(72)][param3.field_j[var12Lifetime1]].c(-(var15Lifetime1 / 2) + var13Lifetime1, var14Lifetime1, var15Lifetime1, var15Lifetime1);
                        }
                        var12Lifetime1++;
                      }
                    }
                    if ((decompiledFrameCompleted5) &&
                      (decompiledFrameCompleted3) &&
                      (var27 == 0)) {
                      break regionExit1;
                    }
                  }
                  if ((decompiledFrameCompleted5) &&
                    (decompiledFrameCompleted3) &&
                    (ka.field_V)) {
                    var12Lifetime1 = 0;
                    while (!(param3.field_c <= var12Lifetime1)) {
                      var13Lifetime1 = (param3.spawnPositions[var12Lifetime1] >> 4) + var10Lifetime1;
                      var14Lifetime1 = var11Lifetime1 - (param3.field_h[var12Lifetime1] >> 4);
                      var15Lifetime1 = kc.field_x[this.world.terrain.getTerrainType(param0 - 68)][param3.field_j[var12Lifetime1]].field_z >> 2;
                      kc.field_x[this.world.terrain.getTerrainType(param0 ^ 65)][param3.field_j[var12Lifetime1]].c(var13Lifetime1 - var15Lifetime1 / 2, var14Lifetime1, var15Lifetime1, var15Lifetime1);
                      var12Lifetime1++;
                      if (var27 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                  }
                }
                if ((decompiledFrameCompleted5) &&
                  (decompiledFrameCompleted3) &&
                  (decompiledFrameCompleted2)) {
                  stackIn_157_0 = 1024;
                  stackIn_157_1 = this.field_E;
                }
                if ((decompiledFrameCompleted2) &&
                  (stackIn_157_0 < stackIn_157_1)) {
                  this.field_E = 1024;
                }
                if (var8 < 30) {
                  var8 = 30;
                }
                boolean decompiledFrameCompleted1 = true;
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameRemainder0 = true;
                SoftwareRaster.a(0, 0, 640, 400);
                var12_ref_wk = bc.field_rb[this.world.terrain.getTerrainType(109)];
                var13Lifetime1 = 128;
                var14Lifetime1 = var7 + 1;
                if (!ka.field_V) {
                  var15Lifetime1 = 0;
                  while (var15Lifetime1 < 640) {
                    var16Lifetime1 = var5_int + (var15Lifetime1 << 4);
                    var17Lifetime1 = var6 + param3.getGroundHeightAt((byte) -119, var16Lifetime1);
                    var18Lifetime1 = param3.getSecondaryHeightAt(false, var16Lifetime1) + var6;
                    var19Lifetime1 = var6 + param3.getSurfaceProfileAt((byte) 126, var16Lifetime1);
                    stackIn_195_0 = var18Lifetime1;
                    stackIn_195_1 = var17Lifetime1;
                    if (var27 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_195_0 > stackIn_195_1) {
                      SoftwareRaster.d(var15Lifetime1, 400 - (var19Lifetime1 >> 4), -(var17Lifetime1 - var19Lifetime1 >> 4) + 400 + 1, 0);
                    }
                    var15Lifetime1++;
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1)) {
                  var15Lifetime1 = 0;
                  while (var15Lifetime1 < 640) {
                    var16Lifetime1 = var5_int + (var15Lifetime1 << 4);
                    var17Lifetime1 = var6 + param3.getGroundHeightAt((byte) -96, var16Lifetime1);
                    var18Lifetime1Lifetime1 = var6 + param3.getSecondaryHeightAt(false, var16Lifetime1);
                    var19Lifetime1Lifetime1 = param3.getSurfaceProfileAt((byte) 123, var16Lifetime1) + var6;
                    var20 = var17Lifetime1;
                    var21 = -(var20 >> 4) + 400;
                    var22 = 0;
                    stackIn_195_0 = 400;
                    stackIn_195_1 = var21;
                    if (var27 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_195_0 < stackIn_195_1) {
                      var22 = var22 - (400 - var21);
                      var21 = 400;
                    }
                    var21 = var15Lifetime1 + 640 * var21;
                    while (var22 < 256) {
                      stackIn_190_0 = -1;
                      stackIn_190_1 = ~var21;
                      if (stackIn_190_0 >= stackIn_190_1) {
                        var23 = sb.field_bb.field_a[var21];
                        var24 = var22 * (16711680 & var23) >> 8 & 16711680;
                        var25 = var22 * (65280 & var23) >> 8 & 65280;
                        var26 = var22 * (var23 & 255) >> 8 & 255;
                        sb.field_bb.field_a[var21] = var24 + var25 + var26;
                        var21 -= 640;
                        var22 += 4;
                        continue;
                      }
                      break;
                    }
                    stackIn_190_0Lifetime1 = var18Lifetime1Lifetime1;
                    stackIn_190_1Lifetime1 = var17Lifetime1;
                    if (stackIn_190_0Lifetime1 > stackIn_190_1Lifetime1) {
                      SoftwareRaster.a(var15Lifetime1, 400 - (var19Lifetime1Lifetime1 >> 4), 1 + var15Lifetime1, 400 - (var17Lifetime1 >> 4));
                      var12_ref_wk.c(-((4095 & var16Lifetime1) >> 1) + var15Lifetime1, var7 - var13Lifetime1, 2048, var13Lifetime1);
                      var12_ref_wk.c(var15Lifetime1 - ((4095 & var16Lifetime1) >> 1), var7 - var13Lifetime1 * 2, 2048, var13Lifetime1);
                      var12_ref_wk.c(-((4095 & var16Lifetime1) >> 1) + var15Lifetime1, var7, 2048, var13Lifetime1);
                      SoftwareRaster.f(var15Lifetime1, 400 - (var19Lifetime1Lifetime1 >> 4), -(var17Lifetime1 - var19Lifetime1Lifetime1 >> 4) + 400 + 1, 0, 192);
                    }
                    var15Lifetime1++;
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  stackIn_195_0 = 400;
                  stackIn_195_1 = var14Lifetime1;
                }
                if (stackIn_195_0 < stackIn_195_1) {
                  var14Lifetime1 = 400;
                }
                SoftwareRaster.c();
              }
              stackIn_199_0 = ~this.world.terrain.getTerrainType(param0 - 70);
              stackIn_199_1 = -4;
            }
            if (stackIn_199_0 == stackIn_199_1) {
              var10Lifetime1Lifetime1 = -(this.field_P >> 4);
              var11Lifetime1Lifetime1 = -(this.field_E >> 4) + 400;
              var12Lifetime1Lifetime1 = this.world.terrain.getProfileLength(param0 ^ 35);
              var13Lifetime1Lifetime1 = (var12Lifetime1Lifetime1 >> 5) + var10Lifetime1Lifetime1;
              var14Lifetime1Lifetime1 = var11Lifetime1Lifetime1;
              var14Lifetime1Lifetime1 += 384;
              var15Lifetime1Lifetime1 = sb.field_W.field_z;
              var16Lifetime1Lifetime1 = sb.field_W.field_B;
              sb.field_W.a(-(var15Lifetime1Lifetime1 / 2) + var13Lifetime1Lifetime1, -(3 * var16Lifetime1Lifetime1 / 2) + var14Lifetime1Lifetime1);
              var17Lifetime1Lifetime1 = this.world.simulationTick / 5 % 6;
              b.field_n[var17Lifetime1Lifetime1].d(-(var15Lifetime1Lifetime1 / 2) + var13Lifetime1Lifetime1, -(var15Lifetime1Lifetime1 / 2) + (var14Lifetime1Lifetime1 - 3 * var16Lifetime1Lifetime1 / 4), var15Lifetime1Lifetime1, var15Lifetime1Lifetime1, 64);
            }
          }
          if (this.world.field_fb) {
            SoftwareRaster.c(0, 0, 640, 480, 0, 180);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_209_0 = var5;
          stackIn_209_1 = new StringBuilder().append("nb.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_210_2 = "null";
          } else {
            stackIn_210_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_209_0), ((StringBuilder) (Object) stackIn_209_1).append(stackIn_210_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_86_0Lifetime1;
        int stackIn_86_1Lifetime1;
        int stackIn_86_0Lifetime2;
        int stackIn_86_1Lifetime2;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (!this.world.field_j) {
            if (oh.field_f < 0 &&
              pi.field_c < 0) {
              return;
            }
            if (param2 > -19) {
              this.field_a = (int[]) null;
            }
            var7_int = 0;
            var8 = 0;
            var9 = 0;
            while (hf.field_c > var9) {
              var10 = this.d(true, this.field_D[var9]);
              var10 = var10 + (-param0 + param3);
              var11 = this.b(1, this.field_K[var9]);
              var11 = var11 + (-param4 + param1);
              var12 = -param3 + var10;
              var13 = -param5 + var11;
              if (var16 != 0) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              if (var9 > 0 &&
                var13 * var13 + var12 * var12 < 2304) {
                SoftwareRaster.a(var7_int, var8, var10, var11, 12632304, 128);
              } else {
                if ((0 >= var9) &&
                  (decompiledFrameRemainder1 = !(var9 <= 0))) {
                  return;
                }
                if (decompiledFrameRemainder1) {
                  boolean decompiledFrameRemainder0 = true;
                  boolean decompiledFrameCompleted2 = true;
                  boolean decompiledFrameCompleted1 = true;
                  boolean decompiledFrameCompleted0 = true;
                  var14 = 0;
                  var15 = 0;
                  if (Math.abs(var12) > Math.abs(var13)) {
                    if (var7_int >= var10) {
                      var14 = var7_int - 1;
                      while (var14 > var10) {
                        var15 = (-var7_int + var14) * (-var8 + var11) / (-var7_int + var10) + var8;
                        var12 = -param3 + var14;
                        var13 = var15 - param5;
                        stackIn_86_0 = ~(var12 * var12 + var13 * var13);
                        stackIn_86_1 = -2305;
                        if (stackIn_86_0 <= stackIn_86_1 &&
                          var16 == 0) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        var14--;
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted2)) {
                      var14 = 1 + var7_int;
                      while (var14 < var10) {
                        var12 = -param3 + var14;
                        var15 = var8 + (var11 - var8) * (var14 - var7_int) / (-var7_int + var10);
                        var13 = var15 - param5;
                        stackIn_86_0 = ~(var12 * var12 + var13 * var13);
                        stackIn_86_1 = -2305;
                        if (stackIn_86_0 <= stackIn_86_1 &&
                          var16 == 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        var14++;
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    if (var8 >= var11) {
                      var15 = -1 + var8;
                      while (var11 < var15) {
                        var14 = var7_int + (-var7_int + var10) * (var15 - var8) / (-var8 + var11);
                        var13 = var15 - param5;
                        var12 = -param3 + var14;
                        stackIn_86_0Lifetime2 = ~(var13 * var13 + var12 * var12);
                        stackIn_86_1Lifetime2 = -2305;
                        if (stackIn_86_0Lifetime2 <= stackIn_86_1Lifetime2) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var15--;
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var15 = var8 + 1;
                      while (var15 < var11) {
                        var14 = (-var7_int + var10) * (var15 - var8) / (var11 - var8) + var7_int;
                        var12 = var14 - param3;
                        var13 = var15 - param5;
                        stackIn_86_0Lifetime2 = ~(var13 * var13 + var12 * var12);
                        stackIn_86_1Lifetime2 = -2305;
                        if (stackIn_86_0Lifetime2 <= stackIn_86_1Lifetime2 &&
                          var16 == 0) {
                          break;
                        }
                        var15++;
                      }
                    }
                  }
                  stackIn_86_0Lifetime1 = var7_int;
                  stackIn_86_1Lifetime1 = var8;
                  SoftwareRaster.a(stackIn_86_0Lifetime1, stackIn_86_1Lifetime1, var14, var15, 12632304, 128);
                  return;
                }
              }
              var8 = var11;
              var7_int = var10;
              var9++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var7), "nb.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void m(int param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 1125) {
            discarded$1 = this.e(82);
          }
          if (!this.field_d) {
            throw new IllegalStateException();
          }
          mm.field_g.writeCipheredOpcode(59, (byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.D(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
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
        RgbSprite var17_ref_wk = null;
        int var17 = 0;
        int var18_int = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var19Lifetime1;
        var20 = SteelSentinels.obfuscationControl;
        try {
          var2_int = 41;
          var3 = 1021128;
          ic.field_db.f(0, -ic.field_db.field_B + var2_int);
          if (this.field_r == -1 &&
            oh.field_f >= 479 &&
            635 > oh.field_f &&
            pi.field_c >= 2 &&
            pi.field_c < 30) {
            var3 = 1044724;
            this.field_r = 6;
          }
          DualNodeDeque.a(var3, 2, pl.field_U, 479, 156, (byte) 68, ha.field_S, 28);
          var3 = 1021128;
          if (this.field_r == -1 &&
            oh.field_f >= 173 &&
            oh.field_f < 321 &&
            pi.field_c >= 2 &&
            pi.field_c < 30) {
            this.field_r = 12;
            var3 = 1044724;
          }
          DualNodeDeque.a(var3, 2, pl.field_U, 173, 148, (byte) 68, sl.field_f, 28);
          var3 = 1021128;
          var3 = 1021128;
          if (this.field_r == -1 &&
            oh.field_f >= 5 &&
            oh.field_f < 171 &&
            pi.field_c >= 2 &&
            pi.field_c < 30) {
            var3 = 1044724;
            this.field_r = 13;
          }
          if (param0 != -86) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          DualNodeDeque.a(var3, 2, pl.field_U, 5, 166, (byte) 68, SteelSentinels.field_I, 28);
          if (this.field_v > 0) {
            var4 = new int[4];
            SoftwareRaster.b(var4);
            SoftwareRaster.h(0, var2_int, 640, 480);
            var5 = new int[4];
            SoftwareRaster.b(var5);
            var6 = FunOrbClient.field_z;
            var7 = 0;
            var8 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8 >= var6.length))) {
              stackIn_62_0 = -1;
              stackIn_62_1 = ~this.field_o[var8];
              if (var20 == 0) {
                if (stackIn_62_0 >= stackIn_62_1 &&
                  this.field_g[var8] > var7) {
                  var7 = this.field_g[var8];
                }
                var8++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              var7 = var7 + (-this.field_s + (32 + this.field_v));
              SoftwareRaster.a(5, var2_int, 166, var7 - var2_int, 0);
              ei.a(5, var7, 166, 8, -96);
              var8 = 50;
              stackIn_62_0 = 2;
              stackIn_62_1 = var7;
            }
            var9 = stackIn_62_0 + stackIn_62_1;
            var10 = 0;
            do {
              if (var10 >= 8) {
                var7 += 8;
                break;
              }
              ao.field_y.a(var8, var9);
              var8 += 10;
              var10++;
            } while (var20 == 0);
            if (-1 == this.field_r &&
              oh.field_f >= 5 &&
              oh.field_f < 171 &&
              pi.field_c >= var2_int &&
              pi.field_c < var7) {
              this.field_r = 26;
            }
            stackIn_89_0 = (12 > this.world.sentinels.size((byte) -128)) ? 0 : 1;
            var8 = stackIn_89_0;
            var9 = oe.field_i;
            oe.field_i = -1;
            var10 = 0;
            while (var10 < var6.length) {
              var11 = this.field_o[var10];
              var12 = -this.field_s + this.field_g[var10] + this.field_v;
              stackIn_131_0 = var11;
              if (var20 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_131_0 >= 0) {
                var13 = 0;
                var3 = 1021128;
                if (this.field_r == 26 &&
                  fn.field_a &&
                  ~this.field_s == ~this.field_v &&
                  var11 <= oh.field_f &&
                  oh.field_f < var11 + 80 &&
                  pi.field_c >= var12 &&
                  30 + var12 > pi.field_c) {
                  var3 = 1044724;
                  this.field_r = 14 + var10;
                  oe.field_i = var10;
                  if (var9 != oe.field_i) {
                    nc.field_f = a.field_c;
                  }
                  var13 = (-nc.field_f + a.field_c) / 7 % 15;
                }
                if (var8 != 0) {
                  var3 = 7829367;
                }
                a.a(var12, var11, 30, 90, 80);
                var14 = 28;
                var15 = var11 + 2;
                var16 = 1 + var12;
                SoftwareRaster.g(var15, var16, var14, var14, 4, 0);
                SoftwareRaster.h(var15, 1 + var16, var15 + var14, var14 + var16);
                var17_ref_wk = si.field_E[var10];
                var18_int = var13 % 4 * var14;
                var19 = var14 * (var13 / 4);
                var17_ref_wk.c(var15 - var18_int, -var19 + var16, 4 * var14, 4 * var14);
                SoftwareRaster.a(var5);
                var17 = var12 + (30 + fk.field_d.field_G) / 2 - 3;
                var18 = cd.field_c[var10];
                var19Lifetime1 = fk.field_d.c(var18);
                if ((80 - var14 - 6) >= var19Lifetime1) {
                  fk.field_d.a(var18, var11 + (80 + var14) / 2, var17, var3, -1);
                } else {
                  fk.field_d.c(var18, -1 + (var11 + 80), var17, var3, -1);
                }
              }
              var10++;
            }
            if (decompiledFrameCompleted0) {
              SoftwareRaster.a(var4);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_131_0 = -1;
          }
          if (stackIn_131_0 == this.field_r &&
            var2_int > pi.field_c) {
            this.field_r = 26;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.HA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        Object var5 = null;
        int var6_int = 0;
        ld var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Sentinel[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Sentinel var12 = null;
        int[] var12_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var12_arrayLifetime1;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var12_intLifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime2;
        int var8Lifetime3;
        int var13Lifetime2;
        int var12_intLifetime1Lifetime1;
        var21 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          SoftwareRaster.c(0, 0, 640, 480, 0, 100);
          var2_int = 25;
          var3 = 0;
          var4 = null;
          var5 = "";
          var6_int = this.world.field_P;
          if (var6_int != 0) {
            if ((var6_int != 1 && (var6_int != 2 ||
              var21 != 0)) &&
              (decompiledFrameRemainder4 = (var6_int == 3)) &&
              (decompiledFrameRemainder3 = (var21 == 0))) {
              if (1 == this.world.playerCount) {
                var5 = vd.field_e[2];
                var4 = a.field_b;
              } else {
                var4 = de.field_b;
                var5 = vd.field_e[3];
              }
              decompiledFrameRemainder4 = false;
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              var4 = ag.field_t;
              var5 = vd.field_e[1];
              decompiledFrameRemainder4 = false;
            }
          }
          if (decompiledFrameRemainder4) {
            var5 = vd.field_e[0];
            if (di.field_g != 4) {
              var4 = vn.field_k;
            } else {
              var4 = na.field_u;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder0 = true;
          var6_intLifetime1 = this.world.terrain.getTerrainType(77);
          if ((var6_intLifetime1 != 0 ||
            var21 != 0) &&
            (decompiledFrameRemainder0 = (1 != var6_intLifetime1 ||
            var21 != 0)) &&
            (decompiledFrameRemainder6 = (2 != var6_intLifetime1 ||
            var21 != 0)) &&
            (decompiledFrameRemainder7 = (3 != var6_intLifetime1)) &&
            (decompiledFrameRemainder2 = (var6_intLifetime1 == 4))) {
            decompiledFrameRemainder1 = (var21 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var5 = (String) (var5) + nh.field_o[0];
            decompiledFrameRemainder2 = (var21 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var5 = (String) (var5) + nh.field_o[1];
            decompiledFrameRemainder2 = (var21 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var5 = (String) (var5) + nh.field_o[2];
            decompiledFrameRemainder2 = (var21 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var5 = (String) (var5) + nh.field_o[3];
            decompiledFrameRemainder2 = (var21 != 0);
          }
          if (decompiledFrameRemainder2) {
            var5 = (String) (var5) + nh.field_o[4];
          }
          if (di.field_g == 4) {
            var5 = null;
          }
          ic.field_db.f(0, -115 + CipherPacketBuffer.field_w);
          if (this.world.field_W ||
            !(0 > this.world.field_A)) {
            SoftwareRaster.b(639, -58 + CipherPacketBuffer.field_w, 16776960);
          }
          var4 = ke.a(42, (String) (var4));
          var6 = ql.field_Tb;
          if (param0 != -4294) {
            GameplayController.b((byte) 5);
          }
          if (var4 != null) {
            ((BitmapFont) ((Object) var6)).a((String) (var4), 320, CipherPacketBuffer.field_w - 83 + ((BitmapFont) ((Object) var6)).field_G / 2, 0, -1);
          }
          if (0 >= var3) {
            stackIn_74_0 = this.world.computerPlayerCount + this.world.playerCount;
          } else {
            stackIn_74_0 = var3;
          }
          boolean decompiledFrameCompleted6 = true;
          var9 = stackIn_74_0;
          var10 = new Sentinel[var9];
          var11 = 0;
          if (var3 != 0) {
            var12_int = 0;
            while (true) {
              if (var10.length > var12_int) {
                var10[var12_int] = this.controlledSentinel;
                var12_int++;
                if (var21 == 0) {
                  continue;
                }
              } else {
                var11 = Math.max(this.controlledSentinel.field_Db, this.controlledSentinel.field_Ub);
              }
              break;
            }
          }
          if (var3 == 0 ||
            var21 != 0) {
            var12 = (Sentinel) (this.world.sentinels.first(param0 + 17352));
            while (var12 != null) {
              stackIn_103_0 = 0;
              stackIn_103_1 = var12.playerId;
              if (var21 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
              if (stackIn_103_0 <= stackIn_103_1 &&
                var12.playerId < var9) {
                var10[var12.playerId] = var12;
              }
              if (var12.field_Db > var11) {
                var11 = var12.field_Db;
              }
              if (var12.field_Ub > var11) {
                var11 = var12.field_Ub;
              }
              var12 = (Sentinel) (this.world.sentinels.next((byte) -71));
            }
          }
          if (decompiledFrameCompleted6) {
            stackIn_103_0 = ~this.world.field_P;
            stackIn_103_1 = -4;
          }
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameCompleted4 = true;
          if (stackIn_103_0 == stackIn_103_1) {
            var7 = (var2_int + (640 - var9 * (100 + var2_int))) / 2;
            var8 = 149;
            var12_intLifetime1 = 0;
            while (var12_intLifetime1 < var9) {
              this.a(var11, 100, 5, var10[var12_intLifetime1], fj.field_h[0], var7, var8, 130);
              var7 = var7 + (var2_int + 100);
              var12_intLifetime1++;
              if (var21 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted5) &&
            (0 == this.world.field_P)) {
            if (var9 >= 4) {
              var8 = 73;
              if (var9 > 10) {
                var2_int = 8;
              }
              var12_intLifetime1Lifetime1 = (1 + var9) / 2;
              var7 = (640 - var12_intLifetime1Lifetime1 * (var2_int + 100) + var2_int) / 2;
              var13 = 0;
              while (true) {
                if (var12_intLifetime1Lifetime1 > var13) {
                  this.a(var11, 100, 5, var10[var13], var10[var13].getTeamColour((byte) -110), var7, var8, 130);
                  var7 = var7 + (100 + var2_int);
                  var13++;
                  if (var21 == 0) {
                    continue;
                  }
                } else {
                  var12_intLifetime1Lifetime1 = -var12_intLifetime1Lifetime1 + var9;
                  var8 = 225;
                }
                break;
              }
              var7 = (var2_int - var12_intLifetime1Lifetime1 * (100 + var2_int) + 640) / 2;
              while (var9 > var13) {
                this.a(var11, 100, param0 + 4299, var10[var13], var10[var13].getTeamColour((byte) -107), var7, var8, 130);
                var7 = var7 + (100 + var2_int);
                var13++;
                if (var21 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted4) &&
              (!(var9 >= 4) ||
              var21 != 0)) {
              var7 = (var2_int + (-((var2_int + 100) * var9) + 640)) / 2;
              var8 = 149;
              var12_intLifetime1Lifetime1 = 0;
              while (var12_intLifetime1Lifetime1 < var9) {
                this.a(var11, 100, 5, var10[var12_intLifetime1Lifetime1], var10[var12_intLifetime1Lifetime1].getTeamColour((byte) 31), var7, var8, 130);
                var7 = var7 + (var2_int + 100);
                var12_intLifetime1Lifetime1++;
                if (var21 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted3) {
            decompiledFrameRemainder5 = (this.world.field_P == 1);
          }
          if (decompiledFrameRemainder5) {
            var12_array = new int[2];
            var13Lifetime2 = 0;
            while (true) {
              if (var13Lifetime2 >= var9) {
                var13Lifetime2 = Math.max(var12_array[0], var12_array[1]);
                stackIn_152_0 = var13Lifetime2;
                stackIn_152_1 = 5;
                break;
              }
              stackIn_152_0 = 0;
              stackIn_152_1 = var3;
              if (var21 == 0) {
                if (stackIn_152_0 < stackIn_152_1) {
                  var10[var13Lifetime2] = this.world.findSentinelForPlayer(var13Lifetime2 * 2 / var3, bi.a(param0, 4283));
                }
                if (null != var10[var13Lifetime2]) {
                  dupTemp$0 = var10[var13Lifetime2].teamId;
                  var12_array[dupTemp$0] = var12_array[dupTemp$0] + 1;
                }
                var13Lifetime2++;
                continue;
              }
              break;
            }
            if (stackIn_152_0 > stackIn_152_1) {
              var2_int = 12;
            }
            var8Lifetime2 = 73;
            var14 = (-((var2_int + 100) * var13Lifetime2) + 640 + var2_int) / 2;
            var7Lifetime2 = var14;
            var15 = 0;
            while (var15 < var9) {
              stackIn_169_0 = ~var10[0].teamId;
              stackIn_169_1 = ~var10[var15].teamId;
              if (var21 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_169_0 == stackIn_169_1) {
                this.a(var11, 100, 5, var10[var15], var10[var15].getTeamColour((byte) 121), var7Lifetime2, var8Lifetime2, 130);
                var7Lifetime2 = var7Lifetime2 + (var2_int + 100);
                var15++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted2) {
              var8Lifetime3 = 225;
              var7Lifetime3 = var14;
              var16 = var15;
              while (var9 > var15) {
                stackIn_169_0 = ~var10[var16].teamId;
                stackIn_169_1 = ~var10[var15].teamId;
                if (var21 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_169_0 != stackIn_169_1) {
                  break;
                }
                this.a(var11, 100, 5, var10[var15], var10[var15].getTeamColour((byte) -115), var7Lifetime3, var8Lifetime3, 130);
                var7Lifetime3 = var7Lifetime3 + (100 + var2_int);
                var15++;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_169_0 = this.world.field_P;
            stackIn_169_1 = 2;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_169_0 == stackIn_169_1) {
            var12_arrayLifetime1 = new int[3];
            var13Lifetime1 = 0;
            while (true) {
              if (var9 <= var13Lifetime1) {
                var13Lifetime1 = Math.max(var12_arrayLifetime1[0], Math.max(var12_arrayLifetime1[1], var12_arrayLifetime1[2]));
                break;
              }
              if (var21 == 0) {
                if (var10[var13Lifetime1] != null) {
                  dupTemp$1 = var10[var13Lifetime1].teamId;
                  var12_arrayLifetime1[dupTemp$1] = var12_arrayLifetime1[dupTemp$1] + 1;
                }
                var13Lifetime1++;
                continue;
              }
              break;
            }
            if (var13Lifetime1 > 2) {
              var2_int = 12;
            }
            var14Lifetime1 = Math.min(var13Lifetime1, 2);
            var15Lifetime1 = (var13Lifetime1 + 1) / 2;
            stackIn_189_0 = (var13Lifetime1 <= 2) ? 30 : 20;
            var16Lifetime1 = stackIn_189_0;
            var17 = (-(300 * var15Lifetime1) - 2 * var16Lifetime1 + (640 - var2_int * ((-1 + var15Lifetime1) * 3))) / 2;
            var18 = 0;
            while (var18 < 3) {
              var7Lifetime1 = var17;
              stackIn_219_0 = var14Lifetime1;
              stackIn_219_1 = 1;
              if (var21 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_198_0 = (stackIn_219_0 != stackIn_219_1) ? 73 : 149;
              var8Lifetime1 = stackIn_198_0;
              var19 = 0;
              var20 = 0;
              while (var9 > var20) {
                if (null != var10[var20] &&
                  var10[var20].teamId == var18) {
                  this.a(var11, 100, param0 + 4299, var10[var20], fj.field_h[var18], var7Lifetime1, var8Lifetime1, 130);
                  var19++;
                  if (~var19 != ~var15Lifetime1) {
                    var7Lifetime1 = var7Lifetime1 + (100 + var2_int);
                  } else {
                    var7Lifetime1 = var17;
                    var8Lifetime1 = 225;
                    if (var12_arrayLifetime1[var18] == 3) {
                      var7Lifetime1 = var7Lifetime1 + (100 + var2_int) / 2;
                    }
                  }
                }
                var20++;
              }
              var17 = var17 + (var16Lifetime1 + (100 + var2_int) * var15Lifetime1 - var2_int);
              var18++;
            }
          }
          if (decompiledFrameCompleted0) {
            SoftwareRaster.a(0, 480 - CipherPacketBuffer.field_w, 640, 105, 0);
            stackIn_219_0 = 0;
            stackIn_219_1 = -CipherPacketBuffer.field_w + 479;
          }
          SoftwareRaster.c(stackIn_219_0, stackIn_219_1, 640, 0, 128);
          if (var5 != null) {
            pl.field_U.a((String) (var5), 100, -CipherPacketBuffer.field_w + 500, 440, 100, 1021128, -1, 1, 0, pl.field_U.field_U + 6);
          }
          if (this.field_h &&
            nm.a(-CipherPacketBuffer.field_w + 541, 280, param0 + 4418, ja.field_c, 30, 80)) {
            this.field_r = 27;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.GB(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        boolean stackIn_103_0 = false;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Sentinel var7 = null;
        int[] var8 = null;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (0 <= this.field_r &&
            this.field_r != 26) {
            var2 = new int[][]{ua.field_v, ua.field_x, ua.field_P, ua.field_z, ua.field_N, ua.field_O, ua.field_D, ua.field_J, ua.field_E, vk.field_s, jm.field_p, si.field_k};
            var3 = 0;
            if (this.field_r >= 14 &&
              this.field_r < (14 + var2.length)) {
              var3 = this.field_r - 14;
              if (var9 != 0 && (this.field_r >= 8 &&
                11 > this.field_r)) {
                var3 = -8 + this.field_r;
              }
            } else {
              if (this.field_r >= 8 &&
                11 > this.field_r) {
                var3 = -8 + this.field_r;
              }
            }
            CombatWorld.c(-2483, 95);
            var4 = -29 / ((24 - param0) / 51);
            vd.field_b = true;
            var5 = -var3 + this.field_r;
            switch ((var9 == 0
              || var5 == 13
              || var5 == 14
              ) ? var5 : -1) {
              case 12:
                this.c(false);
                if (var9 == 0) {
                  return;
                }
              case 6:
                hl.field_v = SentinelDesigner.a(uc.field_b, (byte) 0, di.field_c);
                lc.field_e = true;
                Sprite.field_k = false;
                var5 = vb.field_g;
                if (var5 == 5 ||
                  var5 == 6 ||
                  var5 == 8) {
                  var5 = SceneWidget.field_Jb;
                }
                q.a(14, false, -1, var5);
                if (var9 == 0) {
                  return;
                }
              case 7:
                lc.field_e = true;
                Sprite.field_k = false;
                if (fm.field_f[0] < 10) {
                  ol.field_Ub = fm.field_f[0];
                  ge.field_j = 0;
                  var5 = vb.field_g;
                  if (var5 == 5 ||
                    var5 == 6 ||
                    8 == var5) {
                    var5 = SceneWidget.field_Jb;
                  }
                  q.a(20, false, -1, var5);
                  if (var9 == 0) {
                    return;
                  }
                }
                var5 = vb.field_g;
                if (5 == var5 ||
                  var5 == 6 ||
                  var5 == 8) {
                  var5 = SceneWidget.field_Jb;
                }
                q.a(19, false, -1, var5);
                if (var9 == 0) {
                  return;
                }
              case 14:
                if (this.world.sentinels.size((byte) -128) >= 12) {
                  return;
                }
                var5 = (int)((double)(this.world.terrain.getProfileLength(-115) << 4) * Math.random());
                var6 = -100000;
                var7 = new Sentinel(var5, var6, this.world);
                var8 = var2[var3];
                if (var8 == ua.field_v &&
                  t.a(rn.field_D, 49, -20370)) {
                  var8 = pg.field_z;
                }
                var7.configureDesign(var8, true, false, -1, 1);
                var7.field_Nb = 7;
                var7.d(-28033);
                var7.velocityY = 1000;
                var7.field_Qb = 256;
                this.world.sentinels.addLast(3, var7);
                if (var9 == 0) {
                  return;
                }
              case 8:
                di.field_g = 0 + var3;
                qh.field_Yb = 0;
                this.j((byte) -123);
                if (var9 == 0) {
                  return;
                }
              case 13:
                stackIn_103_0 = !(fn.field_a);
                fn.field_a = stackIn_103_0;
                if (!fn.field_a) {
                  return;
                }
                ue.field_b = false;
                if (var9 == 0) {
                  return;
                }
              default:
                break;
            }
            vd.field_b = false;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.Q(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            this.field_J = false;
          }
          param1 = param1 >> 8;
          param1 = param1 + (400 - this.field_E / 16);
          stackIn_4_0 = param1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.UA(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          pm.field_db.clear(6);
          ri.field_b = null;
          hf.field_c = 0;
          this.world.field_O.clear(6);
          this.world.field_o.clear(6);
          db.c(10000);
          jh.field_h = null;
          if (param0 >= -60) {
            this.g(109);
          }
          un.field_o = null;
          h.field_T = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.SA(" + param0 + ')');
        }
    }

    private final int e(boolean param0, int param1) {
        boolean stackIn_7_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var6Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (!param0) {
            this.j((byte) -91);
          }
          var3_int = uf.a(108, ce.field_t);
          var4 = 0;
          var5 = 0;
          var6 = (20 - 52 * var3_int + 640) / 2;
          var7 = -1;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int <= var4))) {
            stackOut_6_0 = ve.a(ce.field_t, 1, var5);
            stackIn_28_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var11 == 0) {
              if (stackIn_7_0) {
                od.field_c[var5].d(var6, param1);
                if (var6 <= oh.field_f &&
                  (var6 + 32) > oh.field_f &&
                  pi.field_c >= param1 &&
                  pi.field_c < (param1 + 32)) {
                  var7 = var5;
                  var8 = var6 + 16;
                }
                var6 += 52;
                var4++;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_28_0 = -1;
          }
          if (stackIn_28_0 >= ~var7) {
            var9 = jg.field_t[var7];
            var10 = ff.field_lb.c(var9) + 4;
            var6Lifetime1 = var8 - var10 / 2;
            if (var6Lifetime1 < 10) {
              var6Lifetime1 = 10;
            }
            param1 -= 4;
            if (630 < var6Lifetime1 + var10) {
              var6Lifetime1 = 630 - var10;
            }
            SoftwareRaster.c(var6Lifetime1 - 3, -ff.field_lb.field_U + (param1 - 3), var10, ff.field_lb.field_U + (ff.field_lb.field_F + 3), 0, 128);
            ff.field_lb.b(var9, var6Lifetime1, param1, 16777215, -1);
          }
          stackIn_39_0 = var7;
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        String stackIn_52_0 = null;
        fh stackIn_88_0 = null;
        String stackIn_89_1 = null;
        fh stackIn_92_0 = null;
        String stackIn_93_1 = null;
        Sentinel stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_97_3;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
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
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var18 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4_int = 0;
          var5 = -1;
          if (pi.field_c >= (-2 + param0) &&
            pi.field_c < (12 + param0) &&
            this.controlledSentinel.field_ub >= 0 &&
            oh.field_f >= (-40 + param1)) {
            if ((param1 - 13) <= oh.field_f) {
              if ((param1 + 12) > oh.field_f) {
                this.field_r = 35;
                SoftwareRaster.a(-1 + param1 << 4, param0 + 6 << 4, 160, -1 + pe.field_o.length, pe.field_o);
                decompiledFrameRemainder0 = (var18 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (!(oh.field_f >= (param1 + 40)))) {
                this.field_r = 34;
                SoftwareRaster.a(16 + param1 << 4, 6 + param0 << 4, 144, pe.field_o.length - 1, pe.field_o);
                if (var18 != 0) {
                  this.field_r = 33;
                  SoftwareRaster.a(param1 - 17 << 4, param0 + 6 << 4, 144, pe.field_o.length - 1, pe.field_o);
                }
              }
            } else {
              this.field_r = 33;
              SoftwareRaster.a(param1 - 17 << 4, param0 + 6 << 4, 144, pe.field_o.length - 1, pe.field_o);
            }
          }
          if (~this.controlledSentinel.field_ub > param2) {
            var5Lifetime1 = -1;
            var4_intLifetime1 = 8388608;
            if (var18 != 0) {
              if (this.controlledSentinel.field_U != -1) {
                var5Lifetime1 = 16777215;
                var4_intLifetime1 = 0;
                var4_intLifetime1 = 16777215;
                var5Lifetime1 = -1;
              } else {
                var4_intLifetime1 = 16777215;
                var5Lifetime1 = -1;
              }
            }
          } else {
            if (this.controlledSentinel.field_U != -1) {
              var5Lifetime1 = 16777215;
              var4_intLifetime1 = 0;
              if (var18 != 0) {
                var4_intLifetime1 = 16777215;
                var5Lifetime1 = -1;
              }
            } else {
              var4_intLifetime1 = 16777215;
              var5Lifetime1 = -1;
            }
          }
          s.a(var4_intLifetime1, true, true, param0 + 6, param1 - 19, var5Lifetime1);
          if (0 <= this.controlledSentinel.field_ub) {
            if (this.controlledSentinel.field_U == 0) {
              var5Lifetime2 = -1;
              var4_intLifetime2 = 16777215;
              if (var18 != 0) {
                var4_intLifetime2 = 0;
                var5Lifetime2 = 16777215;
                var4_intLifetime2 = 8388608;
                var5Lifetime2 = -1;
              }
            } else {
              var4_intLifetime2 = 0;
              var5Lifetime2 = 16777215;
              if (var18 != 0) {
                var4_intLifetime2 = 8388608;
                var5Lifetime2 = -1;
              }
            }
          } else {
            var4_intLifetime2 = 8388608;
            var5Lifetime2 = -1;
          }
          regionExit1: {
            boolean decompiledFrameCompleted0 = true;
            if (!sn.field_o.equals("X") ||
              dm.field_c) {
              if (dm.field_c) {
                stackIn_52_0 = b.field_p;
              } else {
                stackIn_52_0 = sn.field_o;
              }
              var6_ref_String = stackIn_52_0;
              if (var4_intLifetime2 != -1) {
                SoftwareRaster.a(param1 - 8, param0 + 1, 15, 11, var4_intLifetime2);
                fk.field_d.a(var6_ref_String, param1, 10 + param0, 0, -1);
              }
              if (var4_intLifetime2 == -1 ||
                0 == var4_intLifetime2) {
                fk.field_d.a(var6_ref_String, param1, param0 + 10, 1021128, -1);
              }
              if (-1 != var5Lifetime2) {
                SoftwareRaster.h(param1 - 8, param0 + 1, 15, 11, var5Lifetime2);
              }
              if (var18 == 0) {
                break regionExit1;
              }
            }
            var6 = param1 - 8;
            var7 = 1 + param0;
            var8 = 6 + param0;
            var9 = 11 + param0;
            var10 = var8 - 2;
            var11 = var8 + 2;
            var12 = param1 - 1;
            var13 = param1 + 6;
            var14 = -3 + param1;
            var15 = param1 + 1;
            var16 = 4;
            if (var4_intLifetime2 != -1) {
              var17 = 0;
              while (var17 <= var16) {
                SoftwareRaster.d(var6 + var17, var7, var17 + (var6 + 10), var9, var4_intLifetime2);
                SoftwareRaster.d(var6 + var17, var9, 10 + var6 + var17, var7, var4_intLifetime2);
                var17++;
                if (var18 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var5Lifetime2 != -1)) {
              SoftwareRaster.d(var6, var7, var14, var8, var5Lifetime2);
              SoftwareRaster.d(var14, var8, var6, var9, var5Lifetime2);
              SoftwareRaster.g(var6, var9, var16, var5Lifetime2);
              SoftwareRaster.d(var16 + var6, var9, var12, var11, var5Lifetime2);
              SoftwareRaster.d(var12, var11, -var16 + var13, var9, var5Lifetime2);
              SoftwareRaster.g(var13 - var16, var9, var16, var5Lifetime2);
              SoftwareRaster.d(var13, var9, var15, var8, var5Lifetime2);
              SoftwareRaster.d(var15, var8, var13, var7, var5Lifetime2);
              SoftwareRaster.g(var13 - var16, var7, var16, var5Lifetime2);
              SoftwareRaster.d(-var16 + var13, var7, var12, var10, var5Lifetime2);
              SoftwareRaster.d(var12, var10, var6 + var16, var7, var5Lifetime2);
              SoftwareRaster.g(var6, var7, var16, var5Lifetime2);
            }
          }
          if (this.controlledSentinel.field_ub < 0) {
            var5Lifetime3 = -1;
            var4_intLifetime3 = 8388608;
            if (var18 != 0) {
              if (this.controlledSentinel.field_U != 1) {
                var5Lifetime3 = 16777215;
                var4_intLifetime3 = 0;
                var4_intLifetime3 = 16777215;
                var5Lifetime3 = -1;
              } else {
                var4_intLifetime3 = 16777215;
                var5Lifetime3 = -1;
              }
            }
          } else {
            if (this.controlledSentinel.field_U != 1) {
              var5Lifetime3 = 16777215;
              var4_intLifetime3 = 0;
              if (var18 != 0) {
                var4_intLifetime3 = 16777215;
                var5Lifetime3 = -1;
              }
            } else {
              var4_intLifetime3 = 16777215;
              var5Lifetime3 = -1;
            }
          }
          s.a(var4_intLifetime3, true, false, 6 + param0, param1 + 17, var5Lifetime3);
          stackIn_88_0 = fk.field_d;
          if (!dm.field_c) {
            stackIn_89_1 = gm.field_a;
          } else {
            stackIn_89_1 = lk.field_X;
          }
          ((fh) (Object) stackIn_88_0).b(stackIn_89_1, param1 + 29, 10 + param0, 1021128, -1);
          stackIn_92_0 = fk.field_d;
          if (!dm.field_c) {
            stackIn_93_1 = fm.field_i;
          } else {
            stackIn_93_1 = cl.field_g;
          }
          ((fh) (Object) stackIn_92_0).c(stackIn_93_1, param1 - 29, 10 + param0, 1021128, -1);
          SoftwareRaster.a(0, 423, 640, 480);
          stackIn_96_0 = this.controlledSentinel;
          stackIn_96_1 = param1;
          stackIn_96_2 = 256;
          if (!this.controlledSentinel.field_Lb) {
            stackIn_97_3 = 0;
          } else {
            stackIn_97_3 = 7;
          }
          ((Sentinel) (Object) stackIn_96_0).b(stackIn_96_1, stackIn_96_2, -stackIn_97_3 + param0, -118);
          SoftwareRaster.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "nb.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        NodeIterator var3_ref_jc = null;
        ne var3_ref_ne = null;
        int var4 = 0;
        Sentinel var4_ref_mb = null;
        Sentinel var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (di.field_g == 7 &&
            dl.field_M == 1 &&
            this.world.f(param0 ^ 1613)) {
            dl.field_M = dl.field_M + 1;
          }
          tj.field_c = 0;
          var2_int = ec.field_c[di.field_g + 0];
          if (dl.field_M >= var2_int) {
            return;
          }
          dl.field_M = dl.field_M + 1;
          sh.field_d = 0;
          if (di.field_g == 1 &&
            6 == dl.field_M) {
            dl.field_M = dl.field_M + 1;
          }
          if (param0 != -1589) {
            this.a((byte) -52, true);
          }
          if (var2_int <= dl.field_M) {
            this.world.field_j = true;
            if (nc.field_a < 0) {
              nc.field_a = 1;
            }
          }
          if (dl.field_M > qh.field_Yb) {
            boolean decompiledFrameRemainder6 = true;
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            qh.field_Yb = dl.field_M;
            PartInstruction.field_g = 500;
            var3 = di.field_g;
            if (0 == var3) {
              regionExit1: {
                regionExit2: {
                  regionExit3: {
                    regionExit4: {
                      var3 = qh.field_Yb;
                      if (var3 != 4) {
                        switch (var3) {
                          case 7:
                            break regionExit4;
                          case 9:
                            break regionExit3;
                          case 10:
                            break regionExit2;
                          default:
                            return;
                          case 11:
                            if (var6 == 0) {
                              break regionExit1;
                            }
                            break;
                        }
                      }
                      var3 = 52000;
                      var4 = -23000;
                      var5 = new Sentinel(var3, var4, this.world);
                      var5.configureDesign(va.field_f, true, false, -1, 1);
                      var5.field_Nb = 6;
                      var5.field_pc = false;
                      this.world.sentinels.addLast(param0 + 1592, var5);
                      if (var6 == 0) {
                        return;
                      }
                    }
                    var3 = 126000;
                    var4 = -25000;
                    var5 = new Sentinel(var3, var4, this.world);
                    var5.configureDesign(va.field_f, true, false, -1, 1);
                    var5.field_pc = false;
                    var5.field_Nb = 6;
                    var3 = 166000;
                    var4 = -30000;
                    this.world.sentinels.addLast(param0 + 1592, var5);
                    var5 = new Sentinel(var3, var4, this.world);
                    var5.configureDesign(va.field_f, true, false, -1, 1);
                    var5.field_pc = false;
                    var5.field_Nb = 6;
                    var4 = -40000;
                    var3 = 221000;
                    this.world.sentinels.addLast(3, var5);
                    var5 = new Sentinel(var3, var4, this.world);
                    var5.configureDesign(va.field_f, true, false, -1, 1);
                    var5.field_pc = false;
                    var5.field_Nb = 6;
                    this.world.sentinels.addLast(3, var5);
                    if (var6 == 0) {
                      return;
                    }
                  }
                  var3 = 180000;
                  var4 = -30000;
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.configureDesign(va.field_f, true, false, -1, 1);
                  var5.field_Nb = 1;
                  var5.field_pc = false;
                  this.world.sentinels.addLast(3, var5);
                  if (var6 == 0) {
                    return;
                  }
                }
                var3 = 25000;
                var4 = -100000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                this.world.sentinels.addLast(3, var5);
                var3 = 96000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                this.world.sentinels.addLast(3, var5);
                var3 = 166000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                this.world.sentinels.addLast(3, var5);
                var3 = 228000;
                var4 = -4000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                var5.field_u = true;
                this.world.sentinels.addLast(param0 ^ -1592, var5);
                if (var6 == 0) {
                  return;
                }
              }
              mj.a(0, 0, 1200, 0, 0, 0, 0, (byte) -65);
              if (0 != vn.field_o) {
                return;
              }
              vn.field_o = 1;
              if (var6 == 0) {
                return;
              }
            } else {
              if ((var3 != 1) &&
                (decompiledFrameRemainder3 = (var3 != 7)) &&
                (decompiledFrameRemainder4 = (var3 != 3)) &&
                (decompiledFrameRemainder5 = (var3 != 5 ||
                var6 != 0)) &&
                (decompiledFrameRemainder6 = (var3 != 9))) {
                return;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              boolean decompiledFrameRemainder2 = true;
              regionExit5: {
                var3 = qh.field_Yb;
                if ((var3 != 2 ||
                  var6 != 0) &&
                  (decompiledFrameRemainder2 = (var3 != 3))) {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          boolean decompiledFrameRemainder1 = true;
                          if (var3 == 4 &&
                            var6 == 0) {
                            var3 = 102000;
                            var4 = -100000;
                            var5 = new Sentinel(var3, var4, this.world);
                            var5.configureDesign(va.field_f, true, false, -1, 1);
                            var5.field_Nb = 1;
                            var5.field_o = 7;
                            var5.field_pc = false;
                            var3 = 67000;
                            this.world.sentinels.addLast(3, var5);
                            var5 = new Sentinel(var3, var4, this.world);
                            var5.configureDesign(va.field_f, true, false, -1, 1);
                            var5.field_o = 7;
                            var5.field_pc = false;
                            var5.field_Nb = 1;
                            this.world.sentinels.addLast(3, var5);
                            return;
                          } else if (var3 != 5 ||
                            var6 != 0) {
                            decompiledFrameRemainder1 = (var3 != 7 ||
                              var6 != 0);
                            if (decompiledFrameRemainder1) {
                              switch (var3) {
                                case 9:
                                  break regionExit9;
                                case 10:
                                  break regionExit8;
                                case 11:
                                  break regionExit7;
                                case 12:
                                  break regionExit6;
                                case 13:
                                  return;
                                default:
                                  return;
                                case 14:
                                  if (var6 != 0) {
                                    break regionExit5;
                                  }
                                  mj.a(0, 0, 1200, 1, 0, 0, 0, (byte) -65);
                                  return;
                              }
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            var4 = -100000;
                            var3 = 17000;
                            var5 = new Sentinel(var3, var4, this.world);
                            var5.configureDesign(va.field_f, true, false, -1, 1);
                            var5.field_Nb = 1;
                            var5.field_o = 7;
                            var5.field_pc = false;
                            this.world.sentinels.addLast(param0 ^ -1592, var5);
                            return;
                          }
                          if (!this.world.f(param0 ^ 1617)) {
                            return;
                          }
                          var4 = -100000;
                          var3 = 17000;
                          var5 = new Sentinel(var3, var4, this.world);
                          var5.configureDesign(va.field_f, true, false, -1, 1);
                          var5.field_Nb = 1;
                          var5.field_pc = false;
                          var5.field_o = 7;
                          this.world.sentinels.addLast(3, var5);
                          if (var6 == 0) {
                            return;
                          }
                        }
                        var4 = -100000;
                        var3 = 25000;
                        var5 = new Sentinel(var3, var4, this.world);
                        var5.velocityY = -100;
                        var5.configureDesign(va.field_f, true, false, -1, 1);
                        var5.field_Nb = 9;
                        var5.field_pc = false;
                        var5.field_o = 7;
                        var3 = 96000;
                        this.world.sentinels.addLast(param0 + 1592, var5);
                        var5 = new Sentinel(var3, var4, this.world);
                        var5.configureDesign(va.field_f, true, false, -1, 1);
                        var5.field_o = 7;
                        var5.field_Nb = 9;
                        var5.field_pc = false;
                        this.world.sentinels.addLast(3, var5);
                        var3 = 166000;
                        var5 = new Sentinel(var3, var4, this.world);
                        var5.configureDesign(va.field_f, true, false, -1, 1);
                        var5.field_o = 7;
                        var5.field_Nb = 9;
                        var5.field_pc = false;
                        this.world.sentinels.addLast(3, var5);
                        var4 = -4000;
                        var3 = 228000;
                        var5 = new Sentinel(var3, var4, this.world);
                        var5.configureDesign(va.field_f, true, false, -1, 1);
                        var5.field_o = 7;
                        var5.field_Nb = 9;
                        var5.field_pc = false;
                        var5.field_u = true;
                        this.world.sentinels.addLast(3, var5);
                        if (var6 == 0) {
                          return;
                        }
                      }
                      this.c(false);
                      if (var6 == 0) {
                        return;
                      }
                    }
                    this.j((byte) -123);
                    SentinelCommand.field_o = 150;
                    hb.field_f = false;
                    fk.field_c = true;
                    var3 = 147000;
                    var4 = -150000;
                    var5 = new Sentinel(var3, var4, this.world);
                    var5.configureDesign(in.field_j, true, false, -1, 1);
                    var5.field_pc = false;
                    var5.field_Lb = true;
                    var5.field_Nb = 3;
                    var5.velocityY = 2000;
                    this.world.sentinels.addLast(3, var5);
                    var5.field_o = -2;
                    if (var6 == 0) {
                      return;
                    }
                  }
                  this.controlledSentinel.field_U = 0;
                  var3_ref_jc = new NodeIterator(this.world.sentinels);
                  var4_ref_mb = (Sentinel) (var3_ref_jc.b(2));
                  while (var4_ref_mb != null) {
                    var4_ref_mb.field_o = -1;
                    var4_ref_mb = (Sentinel) (var3_ref_jc.d(param0 + 1591));
                    if (var6 != 0) {
                      return;
                    }
                  }
                  return;
                }
              }
              if (decompiledFrameRemainder2) {
                var3 = 122000;
                var4 = -25000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 1;
                var5.field_pc = false;
                var5.field_o = 7;
                this.world.sentinels.addLast(3, var5);
                if (var6 == 0) {
                  return;
                }
              }
              var3_ref_ne = new ne(this.world, 22);
              if (this.controlledSentinel.worldX > 203000) {
                var3_ref_ne.field_z = 187000;
                if (var6 != 0) {
                  var3_ref_ne.field_z = 225000;
                }
              } else {
                var3_ref_ne.field_z = 225000;
              }
              var3_ref_ne.field_I = -100000;
              var3_ref_ne.field_E = false;
              var3_ref_ne.field_S = 500;
              var3_ref_ne.field_F = 2147483647;
              var3_ref_ne.field_K = 2147483647;
              this.world.field_e.addLast(3, var3_ref_ne);
              return;
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4)) {
              regionExit10: {
                regionExit11: {
                  var3 = qh.field_Yb;
                  if (var3 == 1) {
                    var4 = -100000;
                    var3 = 20000;
                    var5 = new Sentinel(var3, var4, this.world);
                    var5.velocityY = -100;
                    var5.configureDesign(va.field_f, true, false, -1, 1);
                    var5.armour = 1;
                    var5.field_o = 20;
                    var5.maximumArmour = 1;
                    var5.field_Nb = 1;
                    var5.field_pc = false;
                    this.world.sentinels.addLast(param0 ^ -1592, var5);
                    if (var6 == 0) {
                      return;
                    }
                  } else {
                    switch (var3) {
                      case 5:
                        break regionExit11;
                      case 6:
                        break regionExit10;
                      default:
                        return;
                      case 4:
                        break;
                    }
                  }
                  var3 = 142000;
                  var4 = -100000;
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.configureDesign(va.field_f, true, false, -1, 1);
                  var5.field_pc = false;
                  var5.field_Nb = 1;
                  var5.field_o = 13;
                  var3 = 102000;
                  this.world.sentinels.addLast(param0 ^ -1592, var5);
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.configureDesign(va.field_f, true, false, -1, 1);
                  var5.field_pc = false;
                  var5.field_o = 13;
                  var5.field_Nb = 1;
                  this.world.sentinels.addLast(3, var5);
                  var3 = 67000;
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.configureDesign(va.field_f, true, false, -1, 1);
                  var5.field_Nb = 1;
                  var5.field_pc = false;
                  var5.field_o = 13;
                  var3 = 49000;
                  this.world.sentinels.addLast(3, var5);
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.configureDesign(va.field_f, true, false, -1, 1);
                  var5.field_o = 13;
                  var5.field_pc = false;
                  var5.field_Nb = 1;
                  this.world.sentinels.addLast(3, var5);
                  if (var6 == 0) {
                    return;
                  }
                }
                SentinelCommand.field_o = 150;
                hb.field_f = false;
                fk.field_c = true;
                var4 = -100000;
                var3 = 142000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                var3 = 102000;
                this.world.sentinels.addLast(param0 + 1592, var5);
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 9;
                this.world.sentinels.addLast(3, var5);
                var3 = 67000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_Nb = 9;
                var5.field_pc = false;
                this.world.sentinels.addLast(3, var5);
                var3 = 49000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.configureDesign(va.field_f, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 9;
                this.world.sentinels.addLast(3, var5);
                if (var6 == 0) {
                  return;
                }
              }
              mj.a(0, 0, 1200, 7, 0, 0, 0, (byte) -65);
              if (var6 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5)) {
              boolean decompiledFrameRemainder0 = true;
              var3 = qh.field_Yb;
              if (var3 == 4) {
                var4 = -100000;
                var3 = 25000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 2;
                this.world.sentinels.addLast(3, var5);
                var3 = 105000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 2;
                this.world.sentinels.addLast(3, var5);
                var3 = 205000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 2;
                var3 = 305000;
                this.world.sentinels.addLast(3, var5);
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_Nb = 2;
                var3 = 405000;
                this.world.sentinels.addLast(3, var5);
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_Nb = 2;
                var5.field_pc = false;
                this.world.sentinels.addLast(param0 ^ -1592, var5);
                if (var6 == 0) {
                  return;
                }
              } else {
                if ((var3 != 5) &&
                  (decompiledFrameRemainder0 = (var3 != 6))) {
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                var4 = -100000;
                var3 = 25000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_Nb = 2;
                var5.armour = 1;
                var5.field_pc = false;
                var5.maximumArmour = 1;
                this.world.sentinels.addLast(param0 ^ -1592, var5);
                var3 = 105000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_Nb = 2;
                var5.field_pc = false;
                var5.maximumArmour = 1;
                var5.armour = 1;
                this.world.sentinels.addLast(3, var5);
                var3 = 205000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_Nb = 2;
                var5.maximumArmour = 1;
                var5.armour = 1;
                var5.field_pc = false;
                this.world.sentinels.addLast(3, var5);
                var3 = 305000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.armour = 1;
                var5.field_Nb = 2;
                var5.field_pc = false;
                var5.maximumArmour = 1;
                var3 = 405000;
                this.world.sentinels.addLast(3, var5);
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.maximumArmour = 1;
                var5.field_pc = false;
                var5.armour = 1;
                var5.field_Nb = 2;
                this.world.sentinels.addLast(3, var5);
                if (var6 == 0) {
                  return;
                }
              }
              mj.a(0, 0, 1200, 3, 0, 0, 0, (byte) -65);
              if (var6 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder6) {
              var3 = qh.field_Yb;
              if (var3 == 1) {
                var3_ref_jc = new NodeIterator(this.world.sentinels);
                var4_ref_mb = (Sentinel) (var3_ref_jc.b(2));
                while (var4_ref_mb != null) {
                  var4_ref_mb.field_o = -1;
                  var4_ref_mb = (Sentinel) (var3_ref_jc.d(param0 + 1591));
                  if (var6 != 0) {
                    return;
                  }
                }
                return;
              }
              if (2 == var3) {
                fk.field_c = true;
                hb.field_f = false;
                SentinelCommand.field_o = 150;
                var4 = -100000;
                var3 = 25000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_Nb = 2;
                var5.field_pc = false;
                var5.field_o = 4;
                var3 = 105000;
                this.world.sentinels.addLast(3, var5);
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_o = 4;
                var5.field_pc = false;
                var5.field_Nb = 2;
                this.world.sentinels.addLast(param0 ^ -1592, var5);
                var3 = 205000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(qm.field_d, true, false, -1, 1);
                var5.field_pc = false;
                var5.field_o = 4;
                var5.field_Nb = 2;
                this.world.sentinels.addLast(3, var5);
                if (var6 == 0) {
                  return;
                }
              } else {
                if (var3 != 3) {
                  return;
                }
              }
              mj.a(0, 0, 1200, 5, 0, 0, 0, (byte) -65);
              if (var6 == 0) {
                return;
              }
            }
            regionExit12: {
              regionExit13: {
                regionExit14: {
                  var3 = qh.field_Yb;
                  if (var3 != 1) {
                    switch (var3) {
                      case 3:
                        break regionExit14;
                      case 5:
                        break regionExit13;
                      default:
                        return;
                      case 6:
                        if (var6 == 0) {
                          break regionExit12;
                        }
                        break;
                    }
                  }
                  var4 = -100000;
                  var3 = 20000;
                  var5 = new Sentinel(var3, var4, this.world);
                  var5.velocityY = -100;
                  var5.configureDesign(va.field_f, true, false, -1, -1);
                  var5.field_Nb = 9;
                  var5.field_pc = false;
                  var5.field_o = 0;
                  this.world.sentinels.addLast(3, var5);
                  if (var6 == 0) {
                    return;
                  }
                }
                var4 = -100000;
                var3 = 20000;
                var5 = new Sentinel(var3, var4, this.world);
                var5.velocityY = -100;
                var5.configureDesign(eb.field_o, true, false, -1, -1);
                var5.field_Nb = 7;
                var5.field_o = 7;
                var5.field_pc = false;
                this.world.sentinels.addLast(param0 ^ -1592, var5);
                if (var6 == 0) {
                  return;
                }
              }
              var3 = 25000;
              var4 = -100000;
              var5 = new Sentinel(var3, var4, this.world);
              var5.velocityY = -100;
              var5.configureDesign(bb.field_S, true, false, -1, 1);
              var5.field_Nb = 2;
              var5.field_pc = false;
              var3 = 105000;
              this.world.sentinels.addLast(3, var5);
              var5 = new Sentinel(var3, var4, this.world);
              var5.velocityY = -100;
              var5.configureDesign(bb.field_S, true, false, -1, 1);
              var5.field_Nb = 2;
              var5.field_pc = false;
              var3 = 205000;
              this.world.sentinels.addLast(3, var5);
              var5 = new Sentinel(var3, var4, this.world);
              var5.velocityY = -100;
              var5.configureDesign(bb.field_S, true, false, -1, 1);
              var5.field_Nb = 2;
              var5.field_pc = false;
              this.world.sentinels.addLast(3, var5);
              if (var6 == 0) {
                return;
              }
            }
            mj.a(0, 0, 1200, 9, 0, 0, 0, (byte) -65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.P(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        Sentinel stackIn_75_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Sentinel[] var3 = null;
        int var4 = 0;
        NodeIterator var5 = null;
        Sentinel var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sentinel var9 = null;
        int var10 = 0;
        int var11 = 0;
        Sentinel stackIn_75_0Lifetime1;
        int stackIn_47_0Lifetime1;
        int stackIn_47_1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var10Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var2_int = this.world.playerCount + this.world.computerPlayerCount;
          if (this.world.field_A >= 0) {
            var2_int++;
          }
          if (this.field_B == null ||
            ~this.field_B.length != ~var2_int) {
            this.field_B = new int[var2_int];
          }
          var3 = new Sentinel[var2_int];
          var4 = 0;
          var5 = new NodeIterator(this.world.sentinels);
          var6_ref_mb = (Sentinel) (var5.b(2));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var6_ref_mb))) {
            stackIn_33_0 = var6_ref_mb.playerId;
            if (var11 == 0) {
              if (stackIn_33_0 < 0 ||
                !(var6_ref_mb.playerId < this.world.playerCount + this.world.computerPlayerCount)) {
                if (~var6_ref_mb.playerId == ~this.world.field_A &&
                  !var6_ref_mb.field_Hb) {
                  incrementValue$0 = var4;
                  var4++;
                  var3[incrementValue$0] = var6_ref_mb;
                }
              } else {
                incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = var6_ref_mb;
              }
              var6_ref_mb = (Sentinel) (var5.d(2));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = ~var4;
          }
          if (stackIn_33_0 > ~var2_int) {
            var2_int = var4;
          }
          var6 = 0;
          scanLoop1: while (true) {
            if ((var2_int - 1) > var6) {
              var7 = var6;
              stackIn_52_0 = var6;
              if (var11 != 0) {
                break scanLoop1;
              }
              var8 = stackIn_52_0;
              while (var8 < var2_int) {
                stackIn_47_0 = ~(var3[var8].field_vb - var3[var8].field_Ab);
                stackIn_47_1 = ~(var3[var7].field_vb - var3[var7].field_Ab);
                if (stackIn_47_0 < stackIn_47_1) {
                  var7 = var8;
                }
                var8++;
              }
              stackIn_47_0Lifetime1 = ~var6;
              stackIn_47_1Lifetime1 = ~var7;
              if (stackIn_47_0Lifetime1 != stackIn_47_1Lifetime1) {
                var9 = var3[var6];
                var3[var6] = var3[var7];
                var3[var7] = var9;
              }
              var6++;
              continue scanLoop1;
            }
            stackIn_52_0 = param0 ? 1 : 0;
            break;
          }
          if (stackIn_52_0 != 1) {
            this.field_S = 72;
          }
          var7Lifetime1 = 0;
          if (this.controlledSentinel != null &&
            this.controlledSentinel != var3[0] &&
            var3[1] != this.controlledSentinel) {
            var6Lifetime1 = 2;
            while (var6Lifetime1 < var2_int) {
              stackIn_75_0 = this.controlledSentinel;
              if (var11 == 0) {
                if (stackIn_75_0 == var3[var6Lifetime1]) {
                  var3[var6Lifetime1] = var3[1];
                  var3[1] = this.controlledSentinel;
                }
                var6Lifetime1++;
                continue;
              }
              while (true) {
                var10 = stackIn_75_0.playerId;
                return;
              }
            }
          }
          var6Lifetime2 = 0;
          while (var2_int > var6Lifetime2) {
            stackIn_75_0Lifetime1 = var3[var6Lifetime2];
            var10Lifetime1 = stackIn_75_0Lifetime1.playerId;
            if (var11 != 0) {
              return;
            }
            if (~var10Lifetime1 == ~this.world.field_A) {
              var10Lifetime1 = var3.length - 1;
            }
            if (var7Lifetime1 <= this.field_B[var10Lifetime1]) {
              if (var7Lifetime1 < this.field_B[var10Lifetime1]) {
                this.field_B[var10Lifetime1] = this.field_B[var10Lifetime1] - 1;
              }
            } else {
              this.field_B[var10Lifetime1] = this.field_B[var10Lifetime1] + 1;
            }
            if (var6Lifetime2 < 2) {
              var7Lifetime1 += 9;
            }
            var6Lifetime2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.EB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, Sentinel param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        Object var14Lifetime1;
        int var15Lifetime1;
        try {
          var9_int = -48 + param7;
          SoftwareRaster.c(param5, param6, param1, var9_int, 0, 150);
          SoftwareRaster.c(param5, param6 + var9_int + 4, param1, 20, 0, 150);
          var10 = this.world.d(-1661904765, param3.playerId);
          if (null != var10) {
            SoftwareRaster.c(param5, 8 + (param6 - (-var9_int - 20)), param1, 20, 0, 150);
          }
          var11 = hj.field_w;
          var12 = -4 + Math.min(param1, var9_int);
          hj.field_w = 6400 * var12 / param0;
          SoftwareRaster.a(param5, param6, param1 + param5, var9_int + param6);
          param3.chassis.a(0, true, param1 / 2 + param5, -6 + var9_int + param6, (byte) 49, 0);
          fl.a(param1, param3, (byte) -98, var9_int, param5, param6);
          SoftwareRaster.c();
          hj.field_w = var11;
          if (param4 == PartInstruction.field_t[0]) {
            param4 = uj.a(param4, 93);
          }
          var13 = var9_int + param6 + (4 + (20 + pl.field_U.field_U) / 2);
          if (var10 != null) {
            var14 = pl.field_U;
            var15 = ((BitmapFont) (var14)).c(var10);
            if (var15 > param1) {
              var14 = ff.field_lb;
              var15 = ((BitmapFont) (var14)).c(var10);
              if (var15 > param1) {
                var14 = fk.field_d;
                var15 = ((BitmapFont) (var14)).c(var10);
              }
              if (var15 > param1) {
                var10 = bg.a(var10, param1, (byte) -45, (BitmapFont) (var14));
              }
            }
            ((BitmapFont) (var14)).a(var10, param5 + param1 / 2, var13, param4, 0);
            var13 += 24;
          }
          if (param2 != 5) {
            this.a(95, false, true, true);
          }
          var14Lifetime1 = null;
          var15Lifetime1 = NodeDeque.a((byte) -59, param3.chassis.componentId);
          if (var15Lifetime1 >= 0 &&
            var15Lifetime1 < cd.field_c.length) {
            var14Lifetime1 = cd.field_c[var15Lifetime1];
          }
          if (null != var14Lifetime1) {
            pl.field_U.a((String) (var14Lifetime1), param5 + param1 / 2, var13, param4, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_31_0 = var9;
          stackIn_31_1 = new StringBuilder().append("nb.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        Sentinel var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.obfuscationControl;
        try {
          this.c(false);
          this.controlledSentinel.field_Qb = 250;
          if (param0 != -123) {
            return;
          }
          PartInstruction.field_g = 500;
          this.controlledSentinel.field_U = 0;
          if (di.field_g == 1 &&
            qh.field_Yb == 11) {
            this.world.terrain.a(param0 + 1323, this.world.playerCount, 16);
            this.controlledSentinel.configureDesign(ua.field_x, true, false, 0, 0);
            this.controlledSentinel.worldY = -100000;
            this.controlledSentinel.worldX = 31000;
            this.controlledSentinel.velocityY = 3000;
            this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
            this.controlledSentinel.field_u = true;
            this.controlledSentinel.field_E = 1;
            this.controlledSentinel.field_pc = false;
            this.controlledSentinel.field_Qb = -1;
            this.controlledSentinel.velocityX = 0;
            nh.a(true, this.controlledSentinel);
            this.field_E = 1024;
            this.field_P = 0;
            this.controlledSentinel.field_J = 0;
            var2 = this.controlledSentinel;
            var2.field_r = 0;
            return;
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  qh.field_Yb = 0;
                  dl.field_M = 0;
                  var2_int = di.field_g;
                  switch (var2_int) {
                    case 1:
                      break;
                    case 7:
                      break regionExit4;
                    case 3:
                      break regionExit3;
                    case 5:
                      break regionExit2;
                    default:
                      break regionExit1;
                    case 9:
                      if (var5 == 0) {
                        this.controlledSentinel.configureDesign(ua.field_C[9], true, false, 0, 0);
                        this.controlledSentinel.worldX = 218000;
                        this.controlledSentinel.worldY = -40000;
                        this.field_E = 1024;
                        this.controlledSentinel.velocityY = 0;
                        this.field_P = 4000;
                        this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
                        break regionExit1;
                      }
                    case 0:
                      this.controlledSentinel.configureDesign(ua.field_C[0], true, false, 0, 0);
                      this.controlledSentinel.worldY = -100000;
                      this.controlledSentinel.worldX = 92000;
                      this.field_P = 1024;
                      this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
                      this.field_E = 1024;
                      this.controlledSentinel.velocityY = 3000;
                      if (var5 == 0) {
                        break regionExit1;
                      }
                      break;
                  }
                  this.controlledSentinel.configureDesign(ua.field_C[1], true, false, 0, 0);
                  this.controlledSentinel.worldX = 218000;
                  this.controlledSentinel.worldY = -40000;
                  this.field_P = 4000;
                  this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
                  this.field_E = 1024;
                  if (var5 == 0) {
                    break regionExit1;
                  }
                }
                this.controlledSentinel.configureDesign(ua.field_C[7], true, false, 0, 0);
                this.controlledSentinel.worldY = -40000;
                this.controlledSentinel.worldX = 218000;
                this.field_E = 1024;
                this.controlledSentinel.velocityY = 0;
                this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
                this.field_P = 4000;
                if (var5 == 0) {
                  break regionExit1;
                }
              }
              this.controlledSentinel.configureDesign(ua.field_C[3], true, false, 0, 0);
              this.controlledSentinel.worldX = 108000;
              this.controlledSentinel.worldY = -40000;
              this.field_P = 1000;
              this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
              this.field_E = 1024;
              if (var5 == 0) {
                break regionExit1;
              }
            }
            this.controlledSentinel.configureDesign(ua.field_C[5], true, false, 0, 0);
            this.controlledSentinel.worldY = -40000;
            this.controlledSentinel.worldX = 200000;
            this.field_P = 4000;
            this.field_E = 1024;
            this.controlledSentinel.field_fc = this.controlledSentinel.worldY;
            var3 = 109000;
            var4 = -16000;
            var2 = new Sentinel(0, 0, this.world);
            var2.configureDesign(va.field_f, true, false, -1, 1);
            var2.field_o = -2;
            var2.field_Nb = 1;
            var2.worldX = var3;
            var2.field_pc = false;
            var2.worldY = var4;
            var3 = 77000;
            this.world.sentinels.addLast(3, var2);
            var4 = -4000;
            var2 = new Sentinel(0, 0, this.world);
            var2.configureDesign(va.field_f, true, false, -1, 1);
            var2.worldX = var3;
            var2.field_pc = false;
            var2.worldY = var4;
            var2.field_Nb = 1;
            var2.field_o = -2;
            this.world.sentinels.addLast(3, var2);
          }
          var2 = this.controlledSentinel;
          this.controlledSentinel.field_J = 0;
          var2.field_r = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "nb.LA(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_m = null;
          field_x = null;
          field_T = null;
          if (param0 != 750) {
            GameplayController.b(4, false);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nb.F(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int discarded$0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        RgbSprite[] stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        BattleTerrain var4 = null;
        int var5 = 0;
        RgbSprite[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        try {
          sb.field_bb.b((byte) 121);
          if (!NodeIterator.a(param1 + 23) &&
            param0 &&
            !jn.field_g) {
            stackIn_10_0 = 1;
          } else {
            stackIn_10_0 = 0;
          }
          var3_int = stackIn_10_0;
          if (param1 != -21) {
            GameplayController.b(-25, false);
          }
          var4 = this.world.terrain;
          this.a((byte) 125, true, true, var4);
          this.a(-105, true, var3_int != 0, true);
          discarded$0 = this.a(true, var4, true, (byte) -110);
          SoftwareRaster.c(0, 0, 640, 480, 0, 128);
          SoftwareRaster.h(218, 198, 204, 44, 16777215);
          SoftwareRaster.c(220, 200, this.world.simulationTick * 200 / this.field_w, 40, 4473924, 128);
          pl.field_U.a(eb.field_q + " " + this.world.simulationTick * 100 / this.field_w + "%", 320, pl.field_U.field_U / 2 + 220, 16777215, 0);
          pl.field_U.a(rb.field_b, 320, 220 + pl.field_U.field_U / 2 + 40, 16777215, 0);
          this.b(true, 1956917985);
          if (this.field_d) {
            if (bb.field_T &&
              param0) {
              stackIn_23_0 = 1;
            } else {
              stackIn_23_0 = 0;
            }
            var5 = stackIn_23_0;
            if (var5 != 0) {
              stackIn_27_0 = tk.field_t;
            } else {
              stackIn_27_0 = co.field_d;
            }
            var6 = stackIn_27_0;
            var7 = var6[2].field_A + (var6[0].field_A + (int)jl.field_c);
            var8 = 24;
            var9 = 356;
            if (vl.field_v) {
              var9 = qc.field_V.field_cb - var8;
              if (var9 < 336) {
                var9 = 336;
              }
              if (!(var9 <= 356)) {
                var9 = 356;
                if ((SteelSentinels.obfuscationControl != 0) &&
                  (-var8 + qc.field_V.field_cb < var9)) {
                  var9 = qc.field_V.field_cb - var8;
                }
              }
            } else {
              if (-var8 + qc.field_V.field_cb < var9) {
                var9 = qc.field_V.field_cb - var8;
              }
            }
            SoftwareRaster.c(0, var9, var7, var8, 0, 192);
            hb.a((byte) 115, var6, var7, var9, 0, var8);
            if (oh.field_f >= 0 &&
              var7 + 0 > oh.field_f &&
              pi.field_c >= var9 &&
              pi.field_c < (var8 + var9)) {
              vd.field_b = true;
              this.field_r = 0;
            }
            var10 = new int[4];
            SoftwareRaster.b(var10);
            if (null != hj.field_s) {
              fk.field_d.c(hj.field_s.toUpperCase(), (int)jl.field_c + var6[0].field_A, 3 + (var9 + (-var6[6].field_F + var8)), this.field_M[0], -1);
            }
            SoftwareRaster.a(var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "nb.FB(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          va.field_b = param0;
          if (param1) {
            GameplayController.b((byte) -121);
          }
          if (~wa.field_p != ~an.field_h) {
            var2_int = an.field_h * an.field_h;
            var3 = var2_int - wa.field_p * wa.field_p;
            param0 = param0 + var3 * (-param0 + jn.field_c) / var2_int;
          }
          qc.field_V.a(0, param0, 120, me.field_e, 640);
          nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_186_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_303_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_394_0 = 0;
        int stackIn_471_0 = 0;
        int stackIn_471_1 = 0;
        int stackIn_475_0 = 0;
        int stackIn_489_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        SentinelCommand var6_ref_je = null;
        int var6 = 0;
        SentinelCommand var7 = null;
        int var7_int = 0;
        int var8_int = 0;
        SentinelCommand var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        ArticulatedPart var16_ref_nk = null;
        int var16_int = 0;
        double var16 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        SentinelCommand var6_ref_jeLifetime1;
        SentinelCommand var7Lifetime1;
        SentinelCommand var7Lifetime2;
        ArticulatedPart var16_ref_nkLifetime1;
        SentinelCommand var6_ref_jeLifetime2;
        SentinelCommand var7Lifetime3;
        SentinelCommand var6_ref_jeLifetime1Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        long var12Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16_intLifetime1;
        int var5_intLifetime3;
        int var5_intLifetime1Lifetime1;
        int var8_intLifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        var20 = SteelSentinels.obfuscationControl;
        try {
          if (param2 != 0) {
            cf.field_q = -1;
            l.field_g = -1;
          }
          boolean decompiledFrameRemainder6 = true;
          if (lb.field_gc == 1 &&
            param2 == 2 &&
            null != this.field_u) {
            var5_int = this.world.simulationTick + vk.field_h[this.world.field_c];
            var6_ref_je = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
            if (null != var6_ref_je &&
              var6_ref_je.endTick > var5_int) {
              var5_int = var6_ref_je.endTick;
            }
            if (var5_int < 500 + this.world.simulationTick) {
              fc.a((byte) 101, 69, -1);
              if (this.controlledSentinel.hasModuleType(16, -27)) {
                var7 = new SentinelCommand(5, this.field_u.playerId, var5_int);
                var7.targetWorldY = param1;
                var7.targetWorldX = param3;
                if (this.field_d) {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 126, 5);
                  mm.field_g.writeByte((byte) 112, this.field_u.playerId);
                  mm.field_g.writeInt(true, var5_int);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  if (var20 != 0) {
                    var7.scheduled = true;
                  }
                } else {
                  var7.scheduled = true;
                }
                if (di.field_g != -1 ||
                  1 != this.world.field_c) {
                  this.controlledSentinel.pendingCommands.addLast(3, var7);
                }
                fc.a((byte) 59, 26, -1);
              }
            }
            decompiledFrameRemainder6 = (var20 != 0);
          }
          if (decompiledFrameRemainder6) {
            if (param2 == 2 &&
              lb.field_gc == 2 &&
              tj.field_a) {
              var5_intLifetime3 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var6_ref_jeLifetime2 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
              if (null != var6_ref_jeLifetime2 &&
                var6_ref_jeLifetime2.endTick > var5_intLifetime3) {
                var5_intLifetime3 = var6_ref_jeLifetime2.endTick;
              }
              var7Lifetime3 = new SentinelCommand(12, 0, var5_intLifetime3);
              if (!this.field_d) {
                var7Lifetime3.scheduled = true;
                if (var20 != 0) {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 111, 12);
                  mm.field_g.writeByte((byte) 123, 0);
                  mm.field_g.writeInt(true, var5_intLifetime3);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                }
              } else {
                mm.field_g.writeCipheredOpcode(64, (byte) -117);
                mm.field_g.writeByte((byte) 111, 12);
                mm.field_g.writeByte((byte) 123, 0);
                mm.field_g.writeInt(true, var5_intLifetime3);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
                mm.field_g.writeInt(true, 0);
              }
              if (di.field_g != -1 ||
                this.world.field_c != 1) {
                this.controlledSentinel.pendingCommands.addLast(3, var7Lifetime3);
              }
              if ((var20 != 0) && (param2 == 2 &&
                null != this.field_u)) {
                var5_intLifetime3 = this.world.simulationTick + vk.field_h[this.world.field_c];
                var6_ref_jeLifetime2 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
                if (var6_ref_jeLifetime2 != null &&
                  var6_ref_jeLifetime2.endTick > var5_intLifetime3) {
                  var5_intLifetime3 = var6_ref_jeLifetime2.endTick;
                }
                if (var5_intLifetime3 < kh.field_x + this.world.simulationTick) {
                  qg.field_n = new SentinelCommand(5, this.field_u.playerId, var5_intLifetime3);
                }
              }
            } else {
              if (param2 == 2 &&
                null != this.field_u) {
                var5_intLifetime3 = this.world.simulationTick + vk.field_h[this.world.field_c];
                var6_ref_jeLifetime2 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
                if (var6_ref_jeLifetime2 != null &&
                  var6_ref_jeLifetime2.endTick > var5_intLifetime3) {
                  var5_intLifetime3 = var6_ref_jeLifetime2.endTick;
                }
                if (var5_intLifetime3 < kh.field_x + this.world.simulationTick) {
                  qg.field_n = new SentinelCommand(5, this.field_u.playerId, var5_intLifetime3);
                }
              }
            }
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          if (null != this.controlledSentinel) {
            if ((1 != lb.field_gc) &&
              (decompiledFrameRemainder4 = (0 != (1 & sf.field_d))) &&
              (decompiledFrameRemainder4 = !(vd.field_b))) {
              decompiledFrameRemainder4 = !(0 < um.field_X);
            }
            if ((decompiledFrameRemainder4) && (this.field_F >= 0 &&
              this.controlledSentinel.field_Xb.length > this.field_F && (ad.field_e ||
              !(this.controlledSentinel.field_Mb[this.field_F] > 0)) && 0 == param2 && (di.field_g != 0 ||
              !(qh.field_Yb < 8)) && (3 != di.field_g ||
              !(5 > qh.field_Yb)))) {
              var5_intLifetime1 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var6_ref_jeLifetime1 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(param0 ^ -1063678615));
              if (null != var6_ref_jeLifetime1 &&
                var5_intLifetime1 < var6_ref_jeLifetime1.endTick) {
                var5_intLifetime1 = var6_ref_jeLifetime1.endTick;
              }
              if (this.world.simulationTick + kh.field_x > var5_intLifetime1 &&
                this.controlledSentinel.field_Xb.length > 0 && ((0 <= this.controlledSentinel.field_ub &&
                (this.controlledSentinel.charge > 0 ||
                this.controlledSentinel.field_ub != 0) ||
                !c.a((byte) -56, this.controlledSentinel.field_Xb[this.field_F])) &&
                (this.controlledSentinel.field_Xb[this.field_F] != 8 ||
                !(this.controlledSentinel.charge < 1)))) {
                var7Lifetime1 = new SentinelCommand(0, this.controlledSentinel.field_Xb[this.field_F], var5_intLifetime1);
                var7Lifetime1.targetWorldX = param3;
                var7Lifetime1.targetWorldY = param1;
                var8_int = (km.field_c >> 8) - (this.field_P >> 4);
                var9 = 400 + (-(this.field_E >> 4) + (dl.field_G - this.controlledSentinel.field_Db * 8 >> 8));
                if (var8_int < 0) {
                  var8_int = 48;
                }
                if (var8_int > 640) {
                  var8_int = 592;
                }
                if (0 > var9) {
                  var9 = 48;
                }
                if (var9 > 380) {
                  var9 = 332;
                }
                if (nc.field_b) {
                  var7Lifetime1.targetWorldY = dl.field_G + 10000 * (pi.field_c - var9);
                  var7Lifetime1.targetWorldX = (oh.field_f - var8_int) * 10000 + km.field_c;
                }
                var10 = -km.field_c + var7Lifetime1.targetWorldX;
                var11 = var7Lifetime1.targetWorldY - dl.field_G;
                if (var10 < 0) {
                  bj.field_h = -1;
                }
                if (var10 >= 0 ||
                  var20 != 0) {
                  bj.field_h = 1;
                }
                var12 = 0L;
                if (this.controlledSentinel.field_Lb &&
                  !this.controlledSentinel.hasModuleType(31, param0 + 7262)) {
                  stackIn_186_0 = 0;
                } else {
                  stackIn_186_0 = 1;
                }
                var14 = stackIn_186_0;
                var15 = 0;
                while (true) {
                  if (var15 < this.controlledSentinel.weaponParts.length) {
                    var16_ref_nk = this.controlledSentinel.weaponParts[var15];
                    stackIn_214_0 = ja.a(var16_ref_nk.componentId, false);
                    stackIn_214_1 = this.controlledSentinel.field_Xb[this.field_F];
                    if (var20 == 0) {
                      if (stackIn_214_0 == stackIn_214_1 && (var14 != 0 ||
                        !bi.b(-69, var16_ref_nk.componentId))) {
                        var12 = var12 | 1L << var15;
                      }
                      var15++;
                      continue;
                    }
                  } else {
                    this.controlledSentinel.chassis.b((byte) -128, 0, bj.field_h, 0);
                    if (var12 != 0L) {
                      var15 = 0;
                      var16_int = 0;
                      while (true) {
                        if (this.controlledSentinel.weaponParts.length > var16_int) {
                          stackIn_212_0 = $cfr$lcmp(~(1L << var16_int & var12), -1L);
                          if (var20 == 0) {
                            if (stackIn_212_0 != 0) {
                              var15 = var15 + this.controlledSentinel.weaponParts[var16_int].field_V;
                            }
                            var16_int++;
                            continue;
                          }
                        } else {
                          stackIn_212_0 = var11 - var15 / ff.a(false, var12);
                        }
                        break;
                      }
                      var11 = stackIn_212_0;
                    }
                    stackIn_214_0 = Math.abs(var10);
                    stackIn_214_1 = 1600;
                  }
                  if (stackIn_214_0 < stackIn_214_1 &&
                    1600 > Math.abs(var11)) {
                    var11 = 0;
                  }
                  var15_double = Math.atan2((double)var10, (double)(-var11));
                  var7Lifetime1.aimAngle = (int)(var15_double * 65536.0 / 6.283185307179586);
                  if ((var7Lifetime1.aimAngle * bj.field_h) >= (this.field_Q + 1 << 8)) {
                    if (bj.field_h * var7Lifetime1.aimAngle <= this.field_Z - 1 << 8) {
                      var10 = (int)(256.0 * Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0)) * bj.field_h;
                      var11 = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var7Lifetime1.aimAngle) / 65536.0) * 256.0);
                      if (var20 != 0) {
                        var7Lifetime1.aimAngle = (-1 + this.field_Z << 8) * bj.field_h;
                        var10 = (int)(Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                        var11 = -(int)(256.0 * Math.cos((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0));
                        var7Lifetime1.aimAngle = bj.field_h * (1 + this.field_Q << 8);
                        var10 = (int)(Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                        var11 = -(int)(Math.cos(3.141592653589793 * (double)var7Lifetime1.aimAngle * 2.0 / 65536.0) * 256.0);
                      }
                    } else {
                      var7Lifetime1.aimAngle = (-1 + this.field_Z << 8) * bj.field_h;
                      var10 = (int)(Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                      var11 = -(int)(256.0 * Math.cos((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0));
                      if (var20 != 0) {
                        var7Lifetime1.aimAngle = bj.field_h * (1 + this.field_Q << 8);
                        var10 = (int)(Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                        var11 = -(int)(Math.cos(3.141592653589793 * (double)var7Lifetime1.aimAngle * 2.0 / 65536.0) * 256.0);
                      }
                    }
                  } else {
                    var7Lifetime1.aimAngle = bj.field_h * (1 + this.field_Q << 8);
                    var10 = (int)(Math.sin((double)var7Lifetime1.aimAngle * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                    var11 = -(int)(Math.cos(3.141592653589793 * (double)var7Lifetime1.aimAngle * 2.0 / 65536.0) * 256.0);
                  }
                  if (bj.field_h < 0) {
                    if (!(16384 >= var7Lifetime1.aimAngle)) {
                      var7Lifetime1.aimAngle = var7Lifetime1.aimAngle - 65536;
                      if ((var20 != 0) &&
                        (var7Lifetime1.aimAngle < -16384)) {
                        var7Lifetime1.aimAngle = var7Lifetime1.aimAngle + 65536;
                      }
                    }
                  } else {
                    if (var7Lifetime1.aimAngle < -16384) {
                      var7Lifetime1.aimAngle = var7Lifetime1.aimAngle + 65536;
                    }
                  }
                  if ((bj.field_h * var7Lifetime1.aimAngle) >= sl.field_i) {
                    if (!(ic.field_P >= bj.field_h * var7Lifetime1.aimAngle)) {
                      var7Lifetime1.aimAngle = ic.field_P;
                      if (var20 != 0) {
                        var7Lifetime1.aimAngle = sl.field_i;
                      }
                    }
                  } else {
                    var7Lifetime1.aimAngle = sl.field_i;
                  }
                  if (var12 == 0L) {
                    break;
                  }
                  if (this.field_d) {
                    mm.field_g.writeCipheredOpcode(64, (byte) -117);
                    mm.field_g.writeByte((byte) 123, 0);
                    mm.field_g.writeByte((byte) 112, this.controlledSentinel.field_Xb[this.field_F]);
                    mm.field_g.writeInt(true, var5_intLifetime1);
                    mm.field_g.writeInt(true, var7Lifetime1.targetWorldX);
                    mm.field_g.writeInt(true, var7Lifetime1.targetWorldY);
                    mm.field_g.writeInt(true, var7Lifetime1.aimAngle);
                    if (var20 != 0) {
                      var7Lifetime1.scheduled = true;
                    }
                  } else {
                    var7Lifetime1.scheduled = true;
                  }
                  fc.a((byte) -83, 69, -1);
                  if (-1 != di.field_g ||
                    this.world.field_c != 1) {
                    this.controlledSentinel.pendingCommands.addLast(3, var7Lifetime1);
                  }
                  var17 = -var7Lifetime1.startTick + var7Lifetime1.endTick;
                  this.controlledSentinel.field_Mb[this.field_F] = this.controlledSentinel.field_Mb[this.field_F] + var17;
                  um.field_X = um.field_X + var17;
                  break;
                }
              }
              decompiledFrameRemainder5 = (var20 != 0);
            }
          }
          if ((decompiledFrameRemainder5) &&
            (param2 == 0)) {
            var5_intLifetime1Lifetime1 = this.world.simulationTick + vk.field_h[this.world.field_c];
            var6_ref_jeLifetime1Lifetime1 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
            if (null != var6_ref_jeLifetime1Lifetime1 &&
              var5_intLifetime1Lifetime1 < var6_ref_jeLifetime1Lifetime1.endTick) {
              var5_intLifetime1Lifetime1 = var6_ref_jeLifetime1Lifetime1.endTick;
            }
            boolean decompiledFrameRemainder3 = true;
            var7_int = 0;
            if (0 != this.controlledSentinel.field_Xb.length) {
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              var8_intLifetime1 = this.controlledSentinel.field_Xb[this.field_F];
              if ((7 != var8_intLifetime1 && ((var8_intLifetime1 != 0 ||
                var20 != 0) &&
                (8 != var8_intLifetime1 ||
                var20 != 0))) &&
                (decompiledFrameRemainder1 = (var8_intLifetime1 != 12))) {
                decompiledFrameRemainder1 = (var8_intLifetime1 != 11);
                decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                stackIn_303_0 = (this.controlledSentinel.field_Vb == null) ? 4 : 14;
                var7_int = stackIn_303_0;
                decompiledFrameRemainder3 = (var20 != 0);
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                stackIn_310_0 = (this.controlledSentinel.field_Vb != null) ? 12 : 10;
                var7_int = stackIn_310_0;
                decompiledFrameRemainder3 = (var20 != 0);
              }
              if (decompiledFrameRemainder3) {
                var7_int = 8;
                if (var20 != 0) {
                  var7_int = 0;
                }
              }
            } else {
              var7_int = 0;
            }
            if (var5_intLifetime1Lifetime1 < (this.world.simulationTick + 500) &&
              null != this.controlledSentinel &&
              this.controlledSentinel.field_Xb.length > 0) {
              if (this.field_F >= this.controlledSentinel.field_Xb.length) {
                this.field_F = 0;
              }
              if (null != qg.field_n &&
                qg.field_n.actionType == 0 &&
                ~qg.field_n.actionVariant == ~this.controlledSentinel.field_Xb[this.field_F]) {
                qg.field_n.endTick = var5_intLifetime1Lifetime1 - (-qg.field_n.endTick + qg.field_n.startTick);
                qg.field_n.startTick = var5_intLifetime1Lifetime1;
                if (var20 != 0) {
                  qg.field_n = new SentinelCommand(0, this.controlledSentinel.field_Xb[this.field_F], var5_intLifetime1Lifetime1);
                }
              } else {
                qg.field_n = new SentinelCommand(0, this.controlledSentinel.field_Xb[this.field_F], var5_intLifetime1Lifetime1);
              }
              qg.field_n.targetWorldX = param3;
              qg.field_n.targetWorldY = param1;
              var8_intLifetime1Lifetime1 = (km.field_c >> 8) - (this.field_P >> 4);
              var9Lifetime1 = -(this.field_E >> 4) + (400 + (dl.field_G - this.controlledSentinel.field_Db * 8 >> 8));
              if (var8_intLifetime1Lifetime1 < 0) {
                var8_intLifetime1Lifetime1 = 48;
              }
              if (var9Lifetime1 < 0) {
                var9Lifetime1 = 48;
              }
              if (var8_intLifetime1Lifetime1 > 640) {
                var8_intLifetime1Lifetime1 = 592;
              }
              if (var9Lifetime1 > 380) {
                var9Lifetime1 = 332;
              }
              if (nc.field_b) {
                qg.field_n.targetWorldY = dl.field_G + (-var9Lifetime1 + pi.field_c) * 10000;
                qg.field_n.targetWorldX = km.field_c + 10000 * (oh.field_f - var8_intLifetime1Lifetime1);
              }
              var10Lifetime1 = qg.field_n.targetWorldX - km.field_c;
              var11Lifetime1 = -dl.field_G + qg.field_n.targetWorldY;
              if (0 > var10Lifetime1) {
                bj.field_h = -1;
              }
              if (0 <= var10Lifetime1 ||
                var20 != 0) {
                bj.field_h = 1;
              }
              var12Lifetime1 = 0L;
              if (this.controlledSentinel.field_Lb &&
                !this.controlledSentinel.hasModuleType(31, -27)) {
                stackIn_368_0 = 0;
              } else {
                stackIn_368_0 = 1;
              }
              var14Lifetime1 = stackIn_368_0;
              var15Lifetime1 = 0;
              while (this.controlledSentinel.weaponParts.length > var15Lifetime1) {
                var16_ref_nkLifetime1 = this.controlledSentinel.weaponParts[var15Lifetime1];
                stackIn_471_0 = ja.a(var16_ref_nkLifetime1.componentId, false);
                stackIn_471_1 = qg.field_n.actionVariant;
                if (var20 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_471_0 == stackIn_471_1 &&
                  0 >= var16_ref_nkLifetime1.field_C && (var14Lifetime1 != 0 ||
                  !bi.b(110, var16_ref_nkLifetime1.componentId))) {
                  var12Lifetime1 = var12Lifetime1 | 1L << var15Lifetime1;
                }
                var15Lifetime1++;
              }
              if (decompiledFrameCompleted0) {
                this.controlledSentinel.chassis.b((byte) -128, 0, bj.field_h, 0);
                var15Lifetime1Lifetime1 = 0;
                var16_intLifetime1 = 0;
                while (true) {
                  if (this.controlledSentinel.weaponParts.length > var16_intLifetime1) {
                    stackIn_394_0 = $cfr$lcmp(-1L, ~(1L << var16_intLifetime1 & var12Lifetime1));
                    if (var20 == 0) {
                      if (stackIn_394_0 != 0) {
                        var15Lifetime1Lifetime1 = var15Lifetime1Lifetime1 + this.controlledSentinel.weaponParts[var16_intLifetime1].field_V;
                      }
                      var16_intLifetime1++;
                      continue;
                    }
                  } else {
                    stackIn_394_0 = $cfr$lcmp(0L, var12Lifetime1);
                  }
                  break;
                }
                if (stackIn_394_0 != 0) {
                  var11Lifetime1 = var11Lifetime1 - var15Lifetime1Lifetime1 / ff.a(false, var12Lifetime1);
                }
                if (Math.abs(var10Lifetime1) < 1600 &&
                  1600 > Math.abs(var11Lifetime1)) {
                  var11Lifetime1 = 0;
                }
                boolean decompiledFrameRemainder0 = true;
                var16 = Math.atan2((double)var10Lifetime1, (double)(-var11Lifetime1));
                qg.field_n.aimAngle = (int)(65536.0 * var16 / 6.283185307179586);
                if ((bj.field_h * qg.field_n.aimAngle) < (1 + this.field_Q << 8)) {
                  qg.field_n.aimAngle = bj.field_h * (this.field_Q + 1 << 8);
                  var10Lifetime1 = (int)(Math.sin(2.0 * ((double)qg.field_n.aimAngle * 3.141592653589793) / 65536.0) * 256.0) * bj.field_h;
                  var11Lifetime1 = -(int)(256.0 * Math.cos((double)qg.field_n.aimAngle * 3.141592653589793 * 2.0 / 65536.0));
                  decompiledFrameRemainder0 = (var20 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (-1 + this.field_Z << 8 >= qg.field_n.aimAngle * bj.field_h) {
                    var10Lifetime1 = (int)(256.0 * Math.sin((double)qg.field_n.aimAngle * 3.141592653589793 * 2.0 / 65536.0)) * bj.field_h;
                    var11Lifetime1 = -(int)(256.0 * Math.cos(3.141592653589793 * (double)qg.field_n.aimAngle * 2.0 / 65536.0));
                    if (var20 != 0) {
                      qg.field_n.aimAngle = bj.field_h * (this.field_Z - 1 << 8);
                      var10Lifetime1 = (int)(256.0 * Math.sin(3.141592653589793 * (double)qg.field_n.aimAngle * 2.0 / 65536.0)) * bj.field_h;
                      var11Lifetime1 = -(int)(256.0 * Math.cos((double)qg.field_n.aimAngle * 3.141592653589793 * 2.0 / 65536.0));
                    }
                  } else {
                    qg.field_n.aimAngle = bj.field_h * (this.field_Z - 1 << 8);
                    var10Lifetime1 = (int)(256.0 * Math.sin(3.141592653589793 * (double)qg.field_n.aimAngle * 2.0 / 65536.0)) * bj.field_h;
                    var11Lifetime1 = -(int)(256.0 * Math.cos((double)qg.field_n.aimAngle * 3.141592653589793 * 2.0 / 65536.0));
                  }
                }
                qg.field_n.scheduled = true;
                if (bj.field_h < 0) {
                  if (!(qg.field_n.aimAngle <= 16384)) {
                    qg.field_n.aimAngle = qg.field_n.aimAngle - 65536;
                    if ((var20 != 0) &&
                      (-16384 > qg.field_n.aimAngle)) {
                      qg.field_n.aimAngle = qg.field_n.aimAngle + 65536;
                    }
                  }
                } else {
                  if (-16384 > qg.field_n.aimAngle) {
                    qg.field_n.aimAngle = qg.field_n.aimAngle + 65536;
                  }
                }
                var18 = 0;
                if (this.world.simulationTick + kh.field_x <= var5_intLifetime1Lifetime1) {
                  var18 = 1;
                }
                if (0L == var12Lifetime1) {
                  qg.field_n.scheduled = false;
                  var18 = 1;
                  qg.field_n = null;
                }
                if (0L != var12Lifetime1 ||
                  var20 != 0) {
                  if (this.controlledSentinel.field_ub >= 0 && (this.controlledSentinel.charge != 0 ||
                    this.controlledSentinel.field_ub != 0)) {
                    if (this.controlledSentinel.field_Xb[this.field_F] != 8 ||
                      !(this.controlledSentinel.charge < 1)) {
                      if ((ml.field_f[Math.max(0, qg.field_n.aimAngle * bj.field_h >> 8)] == 0) &&
                        (0 == hf.field_c)) {
                        var18 = 1;
                        if (var20 != 0) {
                          var18 = 1;
                          var19 = this.controlledSentinel.field_Xb[this.field_F];
                          if (c.a((byte) -119, var19)) {
                            var18 = 1;
                          }
                        }
                      }
                    } else {
                      var18 = 1;
                      if (var20 != 0) {
                        var19 = this.controlledSentinel.field_Xb[this.field_F];
                        if (c.a((byte) -119, var19)) {
                          var18 = 1;
                        }
                      }
                    }
                  } else {
                    var19 = this.controlledSentinel.field_Xb[this.field_F];
                    if (c.a((byte) -119, var19)) {
                      var18 = 1;
                    }
                  }
                }
                if (var18 != 0) {
                  var7_int++;
                }
                this.b(15, var7_int, 0, 15);
                if (var20 != 0) {
                  if (var7_int == 0) {
                    this.b(0, var7_int, 0, 0);
                  }
                  this.b(15, var7_int + 1, 0, 15);
                  qg.field_n = null;
                }
              }
            } else {
              if (var7_int == 0) {
                this.b(0, var7_int, 0, 0);
              }
              if (var7_int != 0 ||
                var20 != 0) {
                this.b(15, var7_int + 1, 0, 15);
              }
              qg.field_n = null;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_471_0 = 4;
            stackIn_471_1 = sf.field_d;
          }
          stackIn_475_0 = ((stackIn_471_0 & stackIn_471_1) == 0) ? 0 : 1;
          var5_intLifetime2 = stackIn_475_0;
          if (!dm.field_c) {
            if (fc.field_e[83]) {
              var5_intLifetime2 = 1;
              if (var20 != 0) {
                if (!fc.field_e[fm.field_d] &&
                  !fc.field_e[83]) {
                  stackIn_489_0 = 0;
                } else {
                  stackIn_489_0 = 1;
                }
                var5_intLifetime2 = stackIn_489_0;
              }
            }
          } else {
            if (!fc.field_e[fm.field_d] &&
              !fc.field_e[83]) {
              stackIn_489_0 = 0;
            } else {
              stackIn_489_0 = 1;
            }
            var5_intLifetime2 = stackIn_489_0;
          }
          if (lb.field_gc == 1 &&
            param2 == 1 &&
            var5_intLifetime2 == 0 ||
            IsaacRandom.field_c &&
            var5_intLifetime2 == 0 &&
            param2 != -1) {
            var6 = vk.field_h[this.world.field_c] + this.world.simulationTick;
            var7Lifetime2 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
            if (null != var7Lifetime2 &&
              var6 < var7Lifetime2.endTick) {
              var6 = var7Lifetime2.endTick;
            }
            if (500 + this.world.simulationTick > var6) {
              var8 = new SentinelCommand(3, 0, var6);
              var8.targetWorldX = param3;
              var8.targetWorldY = param1;
              if (!this.b(param0 ^ 2756, param3, param1)) {
                boolean decompiledSharedTail0 = (this.field_d);
                if (!decompiledSharedTail0) {
                  var8.scheduled = true;
                  decompiledSharedTail0 = (var20 != 0);
                }
                if (decompiledSharedTail0) {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 112, 3);
                  mm.field_g.writeByte((byte) 113, 0);
                  mm.field_g.writeInt(true, var6);
                  mm.field_g.writeInt(true, var8.targetWorldX);
                  mm.field_g.writeInt(true, var8.targetWorldY);
                  mm.field_g.writeInt(true, var8.aimAngle);
                }
                fc.a((byte) 67, 69, -1);
                if (di.field_g != -1 ||
                  1 != this.world.field_c) {
                  this.controlledSentinel.secondaryCommands.addLast(3, var8);
                }
              }
            }
            if ((var20 != 0) &&
              (param2 == 1)) {
              var6 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var7Lifetime2 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
              if (var7Lifetime2 != null &&
                var7Lifetime2.endTick > var6) {
                var6 = var7Lifetime2.endTick;
              }
              if ((500 + this.world.simulationTick) > var6 &&
                !this.b(-5821, param3, param1)) {
                qg.field_n = new SentinelCommand(3, 0, var6);
                qg.field_n.targetWorldY = param1;
                qg.field_n.targetWorldX = param3;
              }
            }
          } else {
            if (param2 == 1) {
              var6 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var7Lifetime2 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
              if (var7Lifetime2 != null &&
                var7Lifetime2.endTick > var6) {
                var6 = var7Lifetime2.endTick;
              }
              if ((500 + this.world.simulationTick) > var6 &&
                !this.b(-5821, param3, param1)) {
                qg.field_n = new SentinelCommand(3, 0, var6);
                qg.field_n.targetWorldY = param1;
                qg.field_n.targetWorldX = param3;
              }
            }
          }
          if (param0 != -7289) {
            field_x = (String) null;
          }
          if (!dm.field_c) {
            if ((sf.field_d & 4) != 0) {
              return;
            }
            if (fc.field_e[83]) {
              return;
            }
            IsaacRandom.field_c = false;
            if (var20 == 0) {
              return;
            }
          }
          if (!fc.field_e[fm.field_d] &&
            !fc.field_e[83]) {
            IsaacRandom.field_c = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "nb.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void g(int param0) {
        int stackIn_367_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        SentinelCommand var5 = null;
        int var6 = 0;
        SentinelCommand var6_ref_je = null;
        int var7_int = 0;
        SentinelCommand var7 = null;
        ne var8 = null;
        int var9 = 0;
        SentinelCommand var5Lifetime1;
        SentinelCommand var5Lifetime2;
        SentinelCommand var5Lifetime3;
        SentinelCommand var5Lifetime4;
        SentinelCommand var5Lifetime5;
        SentinelCommand var6_ref_jeLifetime1;
        SentinelCommand var7Lifetime1;
        SentinelCommand var7Lifetime2;
        SentinelCommand var7Lifetime3;
        SentinelCommand var7Lifetime4;
        SentinelCommand var7Lifetime1Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (ei.field_q == 13 && (di.field_g != 10 ||
            !(nc.field_a >= 0) ||
            ge.field_j != 0 ||
            ol.field_Ub != 9 ||
            !ni.b(55))) {
            CombatWorld.c(-2483, 84);
            var2_int = 1;
            if (this.field_d) {
              if (ed.field_j < 0) {
                var2_int = 4;
                if (var9 != 0) {
                  if (this.world.field_j) {
                    var2_int = 3;
                    var2_int = 2;
                  } else {
                    var2_int = 2;
                  }
                }
              } else {
                if (this.world.field_j) {
                  var2_int = 3;
                  if (var9 != 0) {
                    var2_int = 2;
                  }
                } else {
                  var2_int = 2;
                }
              }
            }
            var3 = var2_int;
            q.a(var3, false, -1, 0);
            Sprite.field_k = true;
            return;
          }
          if (fc.field_e[86] &&
            ei.field_q == 84 &&
            ArticulatedPart.f((byte) -76)) {
            if (wb.field_c != null) {
              ub.c(0);
              if (var9 != 0) {
                si.field_y = false;
                ag.a(-4, false);
              }
            } else {
              si.field_y = false;
              ag.a(-4, false);
            }
          }
          if (this.world.simulationTick < this.field_w) {
            return;
          }
          var2_intLifetime1 = -127 / ((param0 + 29) / 46);
          if (this.controlledSentinel != null &&
            !this.world.field_j) {
            var3Lifetime1 = 0;
            if (ln.field_d == ei.field_q &&
              0 != di.field_g) {
              this.field_F = this.field_F - 1;
              var3Lifetime1 = 1;
              if (this.field_F < 0) {
                this.field_F = 0;
              }
            }
            if (vh.field_c == ei.field_q &&
              di.field_g != 0) {
              var3Lifetime1 = 1;
              this.field_F = this.field_F + 1;
            }
            if (16 <= ei.field_q &&
              ei.field_q <= 24 &&
              di.field_g != 0) {
              this.field_F = -16 + ei.field_q;
              var3Lifetime1 = 1;
            }
            if (this.field_F >= this.controlledSentinel.field_Xb.length) {
              this.field_F = -1 + this.controlledSentinel.field_Xb.length;
            }
            if (ei.field_q != 85 &&
              ei.field_q == 101) {
            }
            if (var3Lifetime1 != 0 && (3 != di.field_g ||
              !(qh.field_Yb < 5))) {
              rc.field_l = 100;
            }
            if (0 < NodeDeque.field_d && (ei.field_q == 41 ||
              ei.field_q == 40 ||
              ei.field_q == 56 ||
              ei.field_q == 55) && di.field_g == 4) {
              var4 = this.field_P + (oh.field_f << 4) << 4;
              var5_int = pi.field_c - 400 + (this.field_E >> 4) << 8;
              var6 = 0;
              if (ei.field_q == 41) {
                var6 = 0;
              }
              if (ei.field_q == 40) {
                var6 = 10;
              }
              if (ei.field_q == 56) {
                var6 = 20;
              }
              if (ei.field_q == 55) {
                var6 = 30;
              }
              if (fc.field_e[16]) {
                var6++;
              }
              if (fc.field_e[17]) {
                var6 += 2;
              }
              if (fc.field_e[18]) {
                var6 += 3;
              }
              if (fc.field_e[19]) {
                var6 += 4;
              }
              if (fc.field_e[20]) {
                var6 += 5;
              }
              if (fc.field_e[21]) {
                var6 += 6;
              }
              if (fc.field_e[22]) {
                var6 += 7;
              }
              if (fc.field_e[23]) {
                var6 += 8;
              }
              if (fc.field_e[24]) {
                var6 += 9;
              }
              if (var6 <= fg.field_Xb.length) {
                var7_int = fg.field_Xb[var6];
                var8 = new ne(this.world, var7_int);
                var8.field_I = var5_int;
                var8.field_z = var4;
                this.world.field_e.addLast(3, var8);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if ((71 != ei.field_q &&
              ei.field_q != jf.field_hb) &&
              (decompiledFrameRemainder2 = !(!dm.field_c))) {
              decompiledFrameRemainder2 = (ei.field_q == sa.field_c);
            }
            if (decompiledFrameRemainder2) {
              var4Lifetime1 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var5 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
              var6Lifetime1 = 0;
              if (var5 != null) {
                if (var5.endTick > var4Lifetime1) {
                  var4Lifetime1 = var5.endTick;
                }
                if (var5.actionType == 6 &&
                  var5.actionVariant == -1) {
                  var7 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
                  if (null == var7 ||
                    !(var7.endTick >= var5.endTick)) {
                    var6Lifetime1 = 1;
                  }
                }
              }
              if (500 + this.world.simulationTick > var4Lifetime1 &&
                var6Lifetime1 == 0) {
                var7Lifetime4 = new SentinelCommand(6, -1, var4Lifetime1);
                if (!this.field_d) {
                  var7Lifetime4.scheduled = true;
                  if (var9 != 0) {
                    mm.field_g.writeCipheredOpcode(64, (byte) -117);
                    mm.field_g.writeByte((byte) 108, 6);
                    mm.field_g.writeByte((byte) 113, -1);
                    mm.field_g.writeInt(true, var4Lifetime1);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                  }
                } else {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 108, 6);
                  mm.field_g.writeByte((byte) 113, -1);
                  mm.field_g.writeInt(true, var4Lifetime1);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                }
                if (di.field_g != -1 ||
                  1 != this.world.field_c) {
                  this.controlledSentinel.secondaryCommands.addLast(3, var7Lifetime4);
                }
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if ((ei.field_q != 72 &&
              ~ei.field_q != ~rj.field_b) &&
              (decompiledFrameRemainder1 = !(!dm.field_c))) {
              decompiledFrameRemainder1 = (~on.field_h == ~ei.field_q);
            }
            if (decompiledFrameRemainder1) {
              var4Lifetime2 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var5Lifetime1 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
              var6Lifetime2 = 0;
              if (var5Lifetime1 != null) {
                if (var5Lifetime1.endTick > var4Lifetime2) {
                  var4Lifetime2 = var5Lifetime1.endTick;
                }
                if (var5Lifetime1.actionType == 6 &&
                  1 == var5Lifetime1.actionVariant) {
                  var7Lifetime1 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
                  if (null == var7Lifetime1 ||
                    !(var7Lifetime1.endTick >= var5Lifetime1.endTick)) {
                    var6Lifetime2 = 1;
                  }
                }
              }
              if (500 + this.world.simulationTick > var4Lifetime2 &&
                var6Lifetime2 == 0) {
                var7Lifetime1Lifetime1 = new SentinelCommand(6, 1, var4Lifetime2);
                if (this.field_d) {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 110, 6);
                  mm.field_g.writeByte((byte) 112, 1);
                  mm.field_g.writeInt(true, var4Lifetime2);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  if (var9 != 0) {
                    var7Lifetime1Lifetime1.scheduled = true;
                  }
                } else {
                  var7Lifetime1Lifetime1.scheduled = true;
                }
                if (di.field_g != -1 ||
                  this.world.field_c != 1) {
                  this.controlledSentinel.secondaryCommands.addLast(3, var7Lifetime1Lifetime1);
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if ((fe.field_y != ei.field_q) &&
              (decompiledFrameRemainder0 = !(!dm.field_c))) {
              decompiledFrameRemainder0 = (~pd.field_V == ~ei.field_q);
            }
            if (decompiledFrameRemainder0) {
              var4Lifetime3 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var5Lifetime2 = (SentinelCommand) (this.controlledSentinel.secondaryCommands.b(1063677678));
              var6Lifetime3 = 0;
              if (null != var5Lifetime2) {
                if (var5Lifetime2.endTick > var4Lifetime3) {
                  var4Lifetime3 = var5Lifetime2.endTick;
                }
                if (var5Lifetime2.actionType == 6 &&
                  var5Lifetime2.actionVariant == 0) {
                  var6Lifetime3 = 1;
                }
              }
              if (var4Lifetime3 < (this.world.simulationTick + 500) &&
                var6Lifetime3 == 0) {
                var7Lifetime2 = new SentinelCommand(6, 0, var4Lifetime3);
                if (this.field_d) {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 115, 6);
                  mm.field_g.writeByte((byte) 110, 0);
                  mm.field_g.writeInt(true, var4Lifetime3);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  if (var9 != 0) {
                    var7Lifetime2.scheduled = true;
                  }
                } else {
                  var7Lifetime2.scheduled = true;
                }
                if (di.field_g != -1 ||
                  this.world.field_c != 1) {
                  this.controlledSentinel.secondaryCommands.addLast(3, var7Lifetime2);
                }
              }
            }
            if (na.field_b == ei.field_q &&
              this.controlledSentinel.field_fb != 0) {
              var4Lifetime4 = vk.field_h[this.world.field_c] + this.world.simulationTick;
              var5Lifetime3 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
              if (var5Lifetime3 != null &&
                var4Lifetime4 < var5Lifetime3.endTick) {
                var4Lifetime4 = var5Lifetime3.endTick;
              }
              if (500 + this.world.simulationTick > var4Lifetime4) {
                var6_ref_je = new SentinelCommand(7, this.controlledSentinel.field_fb, var4Lifetime4);
                if (!this.field_d) {
                  var6_ref_je.scheduled = true;
                  if (var9 != 0) {
                    mm.field_g.writeCipheredOpcode(64, (byte) -117);
                    mm.field_g.writeByte((byte) 112, 7);
                    mm.field_g.writeByte((byte) 120, this.controlledSentinel.field_fb);
                    mm.field_g.writeInt(true, var4Lifetime4);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                  }
                } else {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 112, 7);
                  mm.field_g.writeByte((byte) 120, this.controlledSentinel.field_fb);
                  mm.field_g.writeInt(true, var4Lifetime4);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                }
                if (-1 != di.field_g ||
                  1 != this.world.field_c) {
                  this.controlledSentinel.pendingCommands.addLast(3, var6_ref_je);
                }
              }
            }
            if (ff.field_nb == ei.field_q &&
              this.controlledSentinel.hasModuleType(15, -27)) {
              var4Lifetime5 = this.world.simulationTick + vk.field_h[this.world.field_c];
              var5Lifetime4 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
              if (null != var5Lifetime4 &&
                var4Lifetime5 < var5Lifetime4.endTick) {
                var4Lifetime5 = var5Lifetime4.endTick;
              }
              if (500 + this.world.simulationTick > var4Lifetime5) {
                var6_ref_jeLifetime1 = new SentinelCommand(8, 0, var4Lifetime5);
                if (!this.field_d) {
                  var6_ref_jeLifetime1.scheduled = true;
                  if (var9 != 0) {
                    mm.field_g.writeCipheredOpcode(64, (byte) -117);
                    mm.field_g.writeByte((byte) 112, 8);
                    mm.field_g.writeByte((byte) 116, 0);
                    mm.field_g.writeInt(true, var4Lifetime5);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                  }
                } else {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 112, 8);
                  mm.field_g.writeByte((byte) 116, 0);
                  mm.field_g.writeInt(true, var4Lifetime5);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                }
                if (di.field_g != -1 ||
                  this.world.field_c != 1) {
                  this.controlledSentinel.pendingCommands.addLast(3, var6_ref_jeLifetime1);
                }
              }
            }
            if (~ei.field_q == ~dg.field_d &&
              this.controlledSentinel.hasModuleType(24, -27)) {
              var4Lifetime6 = vk.field_h[this.world.field_c] + this.world.simulationTick;
              var5Lifetime5 = (SentinelCommand) (this.controlledSentinel.pendingCommands.b(1063677678));
              if (null != var5Lifetime5 &&
                var5Lifetime5.endTick > var4Lifetime6) {
                var4Lifetime6 = var5Lifetime5.endTick;
              }
              if (var4Lifetime6 < this.world.simulationTick + 500) {
                stackIn_367_0 = (this.controlledSentinel.activeModuleType != 24) ? 9 : 11;
                var6Lifetime4 = stackIn_367_0;
                var7Lifetime3 = new SentinelCommand(var6Lifetime4, 0, var4Lifetime6);
                if (!this.field_d) {
                  var7Lifetime3.scheduled = true;
                  if (var9 != 0) {
                    mm.field_g.writeCipheredOpcode(64, (byte) -117);
                    mm.field_g.writeByte((byte) 116, var6Lifetime4);
                    mm.field_g.writeByte((byte) 123, 0);
                    mm.field_g.writeInt(true, var4Lifetime6);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                    mm.field_g.writeInt(true, 0);
                  }
                } else {
                  mm.field_g.writeCipheredOpcode(64, (byte) -117);
                  mm.field_g.writeByte((byte) 116, var6Lifetime4);
                  mm.field_g.writeByte((byte) 123, 0);
                  mm.field_g.writeInt(true, var4Lifetime6);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                  mm.field_g.writeInt(true, 0);
                }
                if (-1 == di.field_g &&
                  1 == this.world.field_c) {
                  return;
                }
                this.controlledSentinel.pendingCommands.addLast(3, var7Lifetime3);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "nb.R(" + param0 + ')');
        }
    }

    GameplayController(boolean param0, int param1, int param2, String[] param3, int param4, boolean param5, int[][] param6, int param7, int param8, boolean param9, boolean param10) {
        int stackIn_4_0 = 0;
        boolean stackIn_123_1 = false;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_138_2 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_142_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = SteelSentinels.obfuscationControl;
        this.field_r = -1;
        this.field_p = 0;
        this.field_U = 0;
        this.field_b = new int[100];
        this.field_s = 0;
        this.field_n = -1;
        this.field_P = 0;
        this.field_q = -1;
        this.field_z = false;
        this.field_v = 0;
        this.field_V = 0;
        this.field_Y = 0;
        this.field_S = 500;
        this.field_E = 0;
        this.field_t = -1;
        try {
          lh.field_D = false;
          b.field_f = false;
          uj.field_f = false;
          q.field_h = 100;
          sh.field_d = 0;
          hj.field_F = 0;
          stackIn_4_0 = (1 != param2) ? 500 : 100;
          kh.field_x = stackIn_4_0;
          g.field_h = -1;
          ri.field_b = null;
          nc.field_a = -1;
          rc.field_l = 0;
          pm.field_db = new NodeDeque();
          hh.field_c = new int[6];
          this.field_D = new int[this.field_S];
          fi.field_g = new int[6];
          this.field_K = new int[this.field_S];
          ke.field_b = new String[6];
          ed.field_j = param4;
          this.field_J = param5;
          BattleTerrain.field_a = 0;
          this.field_d = param0;
          dl.field_M = qh.field_Yb;
          f.field_w = new int[10];
          nj.field_U = new int[10];
          ce.field_t = jg.a(true);
          var12_int = 0;
          if (this.field_J) {
            var13 = param3.length;
            if (var13 == 2 &&
              param8 == 1) {
              var12_int = 2;
            }
            if (var13 == 3 &&
              1 == param8) {
              var12_int = 1;
            }
            if (var13 == 2 &&
              param8 == 2) {
              var12_int = 2;
            }
            if (var13 == 3 &&
              param8 == 2) {
              var12_int = 1;
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          this.world = new CombatWorld(param1, param2, param3, param6, false, param7, var12_int, param8, param9, param10);
          wc.field_a = this.world.field_W;
          vi.field_db = this.world.field_fb;
          fj.field_h = fj.field_a;
          if (this.world.field_P == 0) {
            fj.field_h = new int[12];
            if (param4 == -2) {
              var13 = 0;
              while (var13 < 12) {
                fj.field_h[var13] = 65535;
                var13++;
                if (var16 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (param4 != -2 ||
              var16 != 0)) {
              var13 = 0;
              while (12 > var13) {
                fj.field_h[var13] = 16711680;
                var13++;
                if (var16 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted0) &&
                (!(ed.field_j < 0) &&
                !(fj.field_h.length <= ed.field_j))) {
                fj.field_h[ed.field_j] = 65535;
              }
            }
          }
          if (this.world.field_P == 1) {
            fj.field_h = PartInstruction.field_t;
          }
          if (this.world.terrain.getTerrainType(72) == 0) {
            jn.a(true, (byte) 104, 200, l.field_i);
          }
          if (1 == this.world.terrain.getTerrainType(68)) {
            jn.a(true, (byte) 86, 200, gb.field_e);
          }
          if (this.world.terrain.getTerrainType(119) == 2) {
            jn.a(true, (byte) 82, 200, CipherPacketBuffer.field_z);
          }
          if (this.world.terrain.getTerrainType(107) == 3) {
            jn.a(true, (byte) 111, 200, ue.field_e);
          }
          if (this.world.terrain.getTerrainType(61) == 4) {
            jn.a(true, (byte) 70, 200, db.field_a);
          }
          boolean decompiledFrameRemainder0 = true;
          this.controlledSentinel = this.world.findSentinelForPlayer(param4, -127);
          if (null == this.controlledSentinel) {
            this.field_M = new int[4];
            this.field_M[0] = 7172239;
            this.field_M[1] = 4216424;
            this.field_M[3] = 0;
            this.field_M[2] = 13692927;
            decompiledFrameRemainder0 = (var16 != 0);
          }
          if (decompiledFrameRemainder0) {
            this.field_M = new int[4];
            var13 = this.controlledSentinel.teamId;
            this.field_M[2] = 65535;
            this.field_M[1] = 26248;
            this.field_M[0] = 7196927;
            this.field_M[3] = 0;
            if (1 == this.world.field_P) {
              if (0 == var13) {
                this.field_M[1] = 6559605;
                this.field_M[3] = 30;
                this.field_M[0] = 11701178;
                this.field_M[2] = 8388863;
              }
              if (1 == var13) {
                this.field_M[3] = 60;
                this.field_M[2] = 16752704;
                this.field_M[0] = 16744448;
                this.field_M[1] = 8413184;
              }
            }
          }
          var13 = 66056;
          var13 = (6316128 & this.field_M[2]) >> 5;
          var14 = 258;
          var14 = (6316128 & this.field_M[2]) >> 5;
          var15 = 0;
          do {
            if (10 <= var15) {
              var15 = 20;
              break;
            }
            this.field_b[var15] = (var14 + var13) * var15;
            this.field_b[19 - var15] = var14 * 10 + var15 * var13;
            var15++;
          } while (var16 == 0);
          do {
            if (var15 >= 100) {
              if (di.field_g != -1 &&
                di.field_g != 4 &&
                di.field_g != 10) {
                this.j((byte) -123);
              }
              break;
            }
            this.field_b[var15] = var14 * 10;
            var15++;
          } while (var16 == 0);
          if (10 == di.field_g) {
            this.a((byte) -10);
          }
          if (this.field_d) {
          }
          this.field_F = 0;
          this.field_i = 0;
          this.b(0, 0, 0, 0);
          if (4 == di.field_g) {
            this.a(1, true);
          }
          stackIn_123_1 = !(1 >= this.world.playerCount);
          this.field_h = stackIn_123_1;
          vk.field_g = null;
          ad.field_i = null;
          if (this.world.terrain.getTerrainType(118) == 4 &&
            null != this.controlledSentinel &&
            this.controlledSentinel.teamId == 1) {
            this.field_P = -10240 + this.world.terrain.getProfileLength(-125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_137_0 = var12;
          stackIn_137_1 = new StringBuilder().append("nb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_138_2 = "null";
          } else {
            stackIn_138_2 = "{...}";
          }
          stackIn_141_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_138_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_142_2 = "null";
          } else {
            stackIn_142_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_137_0), ((StringBuilder) (Object) stackIn_141_1).append(stackIn_142_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    static {
        field_m = "Cancel draw";
        field_I = false;
        field_T = "Connection lost. <%0>";
        field_x = "Tips";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
