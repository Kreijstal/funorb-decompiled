/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MoveAttackAction extends PreparedAction {
    private int startY;
    static int field_s;
    private int attackOriginY;
    static String field_G;
    static int[] field_x;
    private int pathLength;
    private int startX;
    private int attackOriginX;
    private int attackerAnimationCount;
    private Unit defenderSnapshot;
    private int targetDeltaY;
    private Unit movingUnit;
    private int targetDeltaX;
    private int defenderAnimationCount;
    private int[] pathDirections;

    final static void a(int param0, String param1, boolean param2, byte param3, boolean param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ArchiveIndex.field_g = true;
          DualNodeDeque.field_f = param0;
          var11 = param1;
          if (!param4) {
            stackIn_4_0 = tg.field_j;
          } else {
            stackIn_4_0 = NodeHashIterator.field_h;
          }
          var6 = stackIn_4_0;
          if (DualNodeDeque.field_f == 0) {
            var7 = BattleTutorial.a(480, var11, param3 ^ 7444, AiPlanner.field_G, fs.field_c);
            var8 = 3 + var7;
            DirectByteStorage.field_k = new int[var8];
            nb.field_h = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              DirectByteStorage.field_k[var9] = -1;
            }
            SpellMenuGroup.field_m = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              nb.field_h[var9] = fs.field_c[var9];
            }
            nb.field_h[var8 - 3] = "";
            nb.field_h[-2 + var8] = var6;
            DirectByteStorage.field_k[-2 + var8] = 0;
            SpellMenuGroup.field_m[0] = 1;
            nb.field_h[var8 - 1] = pd.field_f;
            DirectByteStorage.field_k[var8 - 1] = 1;
            SpellMenuGroup.field_m[1] = 2;
          } else {
            if (DualNodeDeque.field_f != 1) {
              throw new IllegalArgumentException();
            }
            var7 = BattleTutorial.a(480, var11, param3 + 7412, AiPlanner.field_G, fs.field_c);
            var8 = 2 + var7;
            DirectByteStorage.field_k = new int[var8];
            nb.field_h = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              DirectByteStorage.field_k[var9] = -1;
            }
            SpellMenuGroup.field_m = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              nb.field_h[var9] = fs.field_c[var9];
            }
            nb.field_h[var8 - 2] = "";
            nb.field_h[var8 - 1] = pd.field_f;
            DirectByteStorage.field_k[var8 - 1] = 0;
            SpellMenuGroup.field_m[0] = 2;
          }
          MovementPlanner.field_z.itemCount = SpellMenuGroup.field_m.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < nb.field_h.length; var8Lifetime1++) {
            stackIn_25_0 = nb.field_h[var8Lifetime1];
            stackIn_26_1 = !(DirectByteStorage.field_k[var8Lifetime1] < 0);
            var9Lifetime1 = lp.a(stackIn_25_0, stackIn_26_1, false);
            if (DirectByteStorage.field_k[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + df.field_E * 2;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          CachedArchiveProvider.field_h = var7Lifetime1 + bt.field_g - (var7Lifetime1 >> 1);
          co.field_f = bt.field_g - (var7Lifetime1 >> 1);
          DualLinkedNode.field_r = (ar.field_w + rd.field_b << 1) * MovementPlanner.field_z.itemCount;
          var8Lifetime2 = 0;
          while (nb.field_h.length > var8Lifetime2) {
            stackIn_38_0 = DualLinkedNode.field_r;
            stackIn_38_1 = ~DirectByteStorage.field_k[var8Lifetime2];
            if (stackIn_38_1 <= -1) {
              stackIn_41_1 = jg.field_k;
            } else {
              stackIn_41_1 = cn.field_o;
            }
            DualLinkedNode.field_r = stackIn_38_0 + stackIn_41_1;
            var8Lifetime2++;
          }
          if (param3 != 90) {
            field_x = (int[]) null;
          }
          InstructionsPanel.field_r = -(DualLinkedNode.field_r >> 1) + lm.field_g;
          MovementPlanner.field_z.restoreSelection(0, param2, DiskCacheWorker.a((byte) -73, ko.pointerY, AiPlanningStrategy.pointerX), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_48_0 = var5;
          stackIn_48_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 62) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          MoveAttackAction.a(-105, (java.applet.Applet) null);
        }
        return TriangleRasterizer.cosineTable[param1 & 2047];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              if (param0 != 16058) {
                return;
              }
              var4 = param1.getCodeBase();
              var3 = ck.a(-3780, var4, param1).getFile();
              lj.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 116);
              lj.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 74);
              lj.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 98);
              lj.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 75);
              lj.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 122);
              lj.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 - 15938);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ld.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        int pathIndex = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] copiedPath = null;
        RuntimeException var3_ref = null;
        int direction = 0;
        int var6 = 0;
        int[] pathBuffer = null;
        int[] eventPath = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.attackOriginX = this.startX;
          eventPath = new int[this.pathLength];
          pathBuffer = eventPath;
          copiedPath = pathBuffer;
          this.attackOriginY = this.startY;
          for (pathIndex = 0; pathIndex < this.pathLength; pathIndex++) {
            direction = this.pathDirections[pathIndex];
            if (direction == 1) {
              this.attackOriginY = this.attackOriginY - 1;
            } else {
              if (direction == 2) {
                this.attackOriginY = this.attackOriginY + 1;
              } else {
                if (direction != 0) {
                  if (direction == 3) {
                    this.attackOriginX = this.attackOriginX - 1;
                  }
                } else {
                  this.attackOriginX = this.attackOriginX + 1;
                }
              }
            }
            copiedPath[pathIndex] = this.pathDirections[pathIndex];
          }
          if (!this.movingUnit.packedFlag8 ||
            this.movingUnit.unitType == 0) {
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new MoveEvent(this.startX, this.startY, eventPath)));
          }
          if (obfuscationGuard != 64) {
            MoveAttackAction.a((byte) -102, 105);
          }
          if (this.targetDeltaX != 0 ||
            0 != this.targetDeltaY) {
            if (this.movingUnit.packedFlag8 &&
              7 == this.movingUnit.unitType) {
              return;
            }
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new AttackEvent(this.attackOriginX, this.attackOriginY, this.targetDeltaX, this.targetDeltaY, this.defenderSnapshot, this.attackerAnimationCount, this.defenderAnimationCount)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_32_0 = var3_ref;
          stackIn_32_1 = new StringBuilder().append("ld.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, RgbSprite[] param1, tu param2, String param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param6 >= -33) {
            field_x = (int[]) null;
          }
          var7_int = param2.a(param3) + (param1[0].pixelWidth << 1);
          var8 = -(var7_int >> 1) + param5;
          var9 = (var7_int >> 1) + param5;
          if (0 > var8) {
            param5 = param5 - var8;
          } else {
            if (var9 > 640) {
              param5 = param5 - (var9 - 640);
            }
          }
          jp.a(-(var7_int >> 1) + param5, param0, var7_int, param1, param4, -8991);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 >= -40) {
          return;
        }
        field_G = null;
        field_x = null;
    }

    MoveAttackAction(int startX, int startY, int[] pathDirections, int pathLength, int targetDeltaX, int targetDeltaY, int actingPlayer, Unit movingUnit, Unit defender) {
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        try {
          this.startY = startY;
          this.targetDeltaX = targetDeltaX;
          this.movingUnit = movingUnit;
          this.pathLength = pathLength;
          this.startX = startX;
          this.targetDeltaY = targetDeltaY;
          this.actingPlayer = actingPlayer;
          this.pathDirections = pathDirections;
          if (defender == null) {
            this.targetDeltaX = 0;
            this.defenderSnapshot = null;
            this.targetDeltaY = 0;
          } else {
            this.defenderSnapshot = defender.copyDetached(false);
            var10_int = bw.unitDefinitions[this.movingUnit.unitType][9];
            stackIn_4_1 = this.movingUnit.strength * vu.field_N[var10_int] / this.movingUnit.maximumStrength;
            if (this.movingUnit.strength * vu.field_N[var10_int] % this.movingUnit.maximumStrength != 0) {
              stackIn_5_2 = 1;
            } else {
              stackIn_5_2 = 0;
            }
            this.attackerAnimationCount = stackIn_4_1 + stackIn_5_2;
            var11 = bw.unitDefinitions[this.defenderSnapshot.unitType][9];
            if (0 != this.defenderSnapshot.strength * vu.field_N[var11] % this.defenderSnapshot.maximumStrength) {
              stackIn_8_1 = 1;
            } else {
              stackIn_8_1 = 0;
            }
            this.defenderAnimationCount = stackIn_8_1 + this.defenderSnapshot.strength * vu.field_N[var11] / this.defenderSnapshot.maximumStrength;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("ld.<init>(").append(startX).append(',').append(startY).append(',');
          if (pathDirections == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(pathLength).append(',').append(targetDeltaX).append(',').append(targetDeltaY).append(',').append(actingPlayer).append(',');
          if (movingUnit == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (defender == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_G = "No target selected.";
        field_s = -1;
    }
}
