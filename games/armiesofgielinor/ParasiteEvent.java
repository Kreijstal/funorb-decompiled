/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ParasiteEvent extends GameEvent {
    static String[] field_A;
    int sourceX;
    int destinationY;
    int destinationX;
    static NodeDeque rasterStateStack;
    private int newOwnerPlayer;
    int sourceY;
    static String field_F;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        if (verbose) {
          System.out.println("Parasite event debug");
          System.out.println("Unit at " + this.sourceX + "," + this.sourceY);
          System.out.println("Takes over " + (this.sourceX + this.destinationX) + "," + (this.sourceY + this.destinationY));
          System.out.println("New owner " + this.newOwnerPlayer);
        }
        String var3 = "EventParasite: pos: (" + this.sourceX + "," + this.sourceY + "), d: (" + this.destinationX + "," + this.destinationY + ")+, owner: " + this.newOwnerPlayer;
        int var4 = 21 / ((53 - obfuscationGuard) / 51);
        return var3;
    }

    public static void d(byte param0) {
        field_A = null;
        rasterStateStack = null;
        field_F = null;
        if (param0 != 46) {
          field_F = (String) null;
        }
    }

    final static RgbSprite[] g(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RgbSprite[] var1 = new RgbSprite[iw.field_n];
        for (var2 = 0; iw.field_n > var2; var2++) {
          var3 = qm.field_K[var2] * c.field_e[var2];
          var4 = AnimationPlayer.field_j[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = MovementPresentation.field_j[rn.bitwiseAnd(255, (int) var4[var6])];
          }
          var1[var2] = new RgbSprite(lg.field_d, wr.field_J, j.field_e[var2], CampaignMenuButton.field_g[var2], qm.field_K[var2], c.field_e[var2], var5);
        }
        rj.d((byte) 106);
        if (param0 >= 1) {
          return var1;
        }
        field_A = (String[]) null;
        return var1;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("md.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ParasiteEvent(int sourceX, int sourceY, int targetDeltaX, int targetDeltaY, int newOwnerPlayer) {
        this.destinationY = targetDeltaY + sourceY;
        this.newOwnerPlayer = newOwnerPlayer;
        this.destinationX = sourceX + targetDeltaX;
        this.sourceY = sourceY;
        this.sourceX = sourceX;
        this.eventKind = 7;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        Unit var7 = null;
        Unit var4 = null;
        Unit var5 = null;
        try {
          var7 = battlefield.getUnitAt(this.sourceY, true, this.sourceX);
          var4 = battlefield.getUnitAt(this.destinationY, true, this.destinationX);
          if (var4 != null) {
            if (null != var4.aiPlanner) {
              var4.aiPlanner.unlink(-116);
            }
            var5 = var4.replaceWithOwner(this.newOwnerPlayer, -1);
            if (var7 != null &&
              var7.aiPlanner != null &&
              var5 != null) {
              var7.aiPlanner.planner.a(80, var5);
            }
          }
          if (var7 != null) {
            var7.unlink(obfuscationGuard ^ 26704);
            if (var7.aiPlanner != null) {
              var7.aiPlanner.unlink(-128);
            }
            battlefield.tiles[battlefield.mapWidth * this.sourceY + this.sourceX].occupant = null;
          }
          if (obfuscationGuard != -26661) {
            GameplayController var6 = (GameplayController) null;
            this.a((NodeDeque) null, (byte) 109, (GameplayController) null);
          }
          fl.a(battlefield, -126);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "md.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        rasterStateStack = new NodeDeque();
        field_F = "This game option has not yet been unlocked for use.";
    }
}
