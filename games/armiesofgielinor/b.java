/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends IntrusiveNode {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var16 = new PacketBuffer(param0);
          var17 = var16;
          var17.position = param0.length - 2;
          iw.field_n = var17.readUnsignedShort((byte) -104);
          j.field_e = new int[iw.field_n];
          c.field_e = new int[iw.field_n];
          iq.field_g = new int[iw.field_n];
          MapTile.field_e = new boolean[iw.field_n];
          qm.field_K = new int[iw.field_n];
          AnimationPlayer.field_j = new byte[iw.field_n][];
          cq.field_z = new byte[iw.field_n][];
          var17.position = -(iw.field_n * 8) - 7 + param0.length;
          lg.field_d = var17.readUnsignedShort((byte) -104);
          wr.field_J = var17.readUnsignedShort((byte) -104);
          var3 = 1 + (255 & var17.readUnsignedByte(param1 + 1));
          for (var4 = 0; iw.field_n > var4; var4++) {
            j.field_e[var4] = var16.readUnsignedShort((byte) -104);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < iw.field_n; var4Lifetime1++) {
            iq.field_g[var4Lifetime1] = var17.readUnsignedShort((byte) -104);
          }
          for (var4Lifetime2 = 0; iw.field_n > var4Lifetime2; var4Lifetime2++) {
            qm.field_K[var4Lifetime2] = var17.readUnsignedShort((byte) -104);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < iw.field_n; var4Lifetime3++) {
            c.field_e[var4Lifetime3] = var17.readUnsignedShort((byte) -104);
          }
          if (param1 != -1) {
            field_n = (la) null;
          }
          var17.position = 3 + (-(var3 * 3) + (-(8 * iw.field_n) - 7) + param0.length);
          MovementPresentation.field_j = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            MovementPresentation.field_j[var4Lifetime4] = var17.d((byte) -13);
            if (MovementPresentation.field_j[var4Lifetime4] == 0) {
              MovementPresentation.field_j[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < iw.field_n; var4Lifetime5++) {
            var5 = qm.field_K[var4Lifetime5];
            var6 = c.field_e[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            AnimationPlayer.field_j[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            cq.field_z[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte(0);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.readByte((byte) -90);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.readByte((byte) 102);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_49_0 = var10;
                  if (var13 == -1) {
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_1 = 1;
                  }
                  var10 = stackIn_49_0 | stackIn_50_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var17.readByte((byte) -106);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var17.readByte((byte) -67);
                    var9[var12 + var5 * var13] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_37_0 = var10;
                    if (var14 == -1) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var10 = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            MapTile.field_e[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("b.B(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
          b.calculateMissionScore(94, 33, -110, (byte) 28, -37);
        }
    }

    final static int calculateMissionScore(int turnTarget, int damageTarget, int damageTaken, byte obfuscationGuard, int turnsTaken) {
        int turnScore;
        int turnBonus;
        int damageBonus;
        int damageScore;
        if (turnTarget == 0) {
          return 1;
        }
        if (damageTarget == 0) {
          return 1;
        }
        if (obfuscationGuard != 25) {
          return -81;
        }
        turnScore = (-turnsTaken + turnTarget * 2) * 500 / turnTarget;
        turnScore = Math.max(0, turnScore);
        if (turnScore > 500) {
          turnBonus = turnScore - 500;
          turnScore = turnBonus / 3 + 500;
          if (turnScore > 1000) {
            turnScore = 1000;
          }
        }
        damageScore = (2 * damageTarget - damageTaken) * 500 / damageTarget;
        damageScore = Math.max(0, damageScore);
        if (damageScore > 500) {
          damageBonus = damageScore - 500;
          damageScore = 500 + damageBonus / 2;
          if (damageScore > 1000) {
            damageScore = 1000;
          }
        }
        return Math.max(100, Math.min(turnScore + damageScore, 2000));
    }

    b() {
        this.field_m = false;
    }

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            field_n = (la) null;
          }
          for (var2_int = 0; var2_int < wp.field_H.length; var2_int++) {
            for (var3 = 0; wp.field_H[var2_int].length > var3; var3++) {
              if (~wp.field_H[var2_int][var3] == ~param1) {
                stackIn_10_0 = var3;
                return stackIn_10_0;
              }
            }
          }
          stackIn_14_0 = 0;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "b.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
