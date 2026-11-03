/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class GameWorld {
    static UiComponent field_n;
    IntrusiveDeque characters;
    static String field_w;
    LevelData field_h;
    int phase;
    int[] field_v;
    int field_F;
    int[] teamScores;
    boolean field_c;
    int nextObjectId;
    int field_C;
    private PlayerLoadout[] field_k;
    boolean field_i;
    int teamCount;
    int[] teamCharacterCounts;
    IntrusiveDeque field_s;
    long[] teamUpgradeMask;
    static String field_p;
    int[] field_o;
    static String field_q;
    int field_r;
    int[] field_z;
    IntrusiveDeque field_G;
    int currentTick;
    IntrusiveDeque field_A;
    int field_j;
    int[][] field_D;
    int field_g;
    int[] field_a;
    int[] field_J;
    String[] field_b;
    int field_I;
    static String field_E;
    IntrusiveDeque field_u;
    static UiComponent field_x;
    int[] field_y;
    static String field_B;

    final static void a(int param0, int param1, Sprite[] param2, int param3, Sprite[] param4, BitmapFont param5, int param6, int param7, int param8, int param9, Sprite[] param10, byte param11, int param12, int param13, int param14) {
        int var16 = 0;
        int var15_int = param5.field_J + param5.maxDescent;
        if (param11 >= -114) {
          return;
        }
        try {
          var16 = param5.field_J;
          BirthDateInputWidget.a(param14, param8, 2, param3, var15_int, param10, param13, param1, param5, param7, param12, 480, var16, param4, param0, param5, param2, var16, param9, var15_int, param6);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final boolean hasUpgrade(byte param0, int param1, int param2) {
        if (param2 < 0) {
          return false;
        }
        if (param0 > -61) {
          this.b(103, -2);
        }
        return (1L << param1 & this.teamUpgradeMask[param2]) != 0L ? true : false;
    }

    final int nextObjectId(int param0) {
        if (param0 != -16777216) {
          return 30;
        }
        int fieldTemp$0 = this.nextObjectId;
        this.nextObjectId = this.nextObjectId + 1;
        return fieldTemp$0;
    }

    final int getPowerupCooldown(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          return -15;
        }
        return g.a(param1, param0, this.hasUpgrade((byte) -81, 59, param2), this.hasUpgrade((byte) -92, 56, param2));
    }

    public static void b(int param0) {
        field_p = null;
        field_B = null;
        if (param0 != -6) {
          Sprite[] var2 = (Sprite[]) null;
          GameWorld.a(-39, -50, (Sprite[]) null, -9, (Sprite[]) null, (BitmapFont) null, -54, 88, -18, -27, (Sprite[]) null, (byte) -4, -116, -58, 27);
        }
        field_E = null;
        field_n = null;
        field_q = null;
        field_w = null;
        field_x = null;
    }

    final IntrusiveDeque a(byte param0) {
        if (param0 < 108) {
          return (IntrusiveDeque) null;
        }
        return this.characters;
    }

    final int computeEffectDuration(byte param0, int param1, int param2) {
        int var4 = param2;
        if (this.hasUpgrade((byte) -66, 58, param1)) {
          var4 = var4 + param2 / 2;
        }
        if (param0 != 32) {
          this.field_C = 122;
        }
        if (this.hasUpgrade((byte) -101, 57, param1)) {
          var4 = var4 + param2;
        }
        return var4;
    }

    final void a(byte param0, int param1) {
        if (param0 != -110) {
          this.a(-88, true);
        }
        this.field_c = true;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + we.a((byte) -73, "%0a", param1, "\n"));
        if (param0 != 2) {
          field_n = (UiComponent) null;
        }
    }

    final boolean b(int param0, int param1) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          this.field_u = (IntrusiveDeque) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.hasUpgrade((byte) -83, 45, param1) && (!this.hasUpgrade((byte) -83, 46, param1) ||
          !(hp.a((byte) 7, g.field_a, 100) < 40))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final SceneObject a(int param0, byte param1) {
        SceneObject var3;
        int var4;
        SceneObject var3Lifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (SceneObject) (this.characters.c(param1 ^ 27));
        while (var3 != null) {
          if (var3.objectId == param0) {
            return var3;
          }
          var3 = (SceneObject) (this.characters.b(6));
        }
        if (param1 != 33) {
          this.field_A = (IntrusiveDeque) null;
        }
        var3Lifetime1 = (SceneObject) (this.field_u.c(47));
        while (var3Lifetime1 != null) {
          if (param0 == var3Lifetime1.objectId) {
            return var3Lifetime1;
          }
          var3Lifetime1 = (SceneObject) (this.field_u.b(param1 - 27));
        }
        return null;
    }

    final void decodeFromPacket(int param0, PacketBuffer param1) {
        int dupTemp$0 = 0;
        boolean stackIn_4_1 = false;
        jj stackIn_21_0;
        jj stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        jj stackIn_22_0;
        jj stackIn_22_1;
        boolean stackIn_22_6;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        GameCharacter var10 = null;
        HumanView var11 = null;
        jj var12 = null;
        cg var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        String var18 = null;
        ce var19 = null;
        Object var4Lifetime1;
        int var3_intLifetime1;
        var16 = null;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.currentTick = param1.readShort((byte) -18);
          stackIn_4_1 = (0 != param1.readUnsignedByte(param0 ^ 31367));
          this.field_i = stackIn_4_1;
          this.field_C = param1.readUnsignedShort((byte) 69);
          this.field_I = param1.readUnsignedShort((byte) 69);
          this.field_g = param1.readUnsignedShort((byte) 69);
          this.phase = param1.readUnsignedByte(31365);
          if (param0 != 2) {
            var18 = (String) null;
            GameWorld.a(51, (String) null);
          }
          for (var3_int = 0; var3_int < this.teamCount; var3_int++) {
            this.field_y[var3_int] = param1.readUnsignedByte(31365);
            this.field_D[var3_int][0] = param1.readUnsignedMedium(128);
            this.field_D[var3_int][1] = param1.readUnsignedMedium(128);
            this.teamScores[var3_int] = param1.readUnsignedShort((byte) 69);
            this.teamUpgradeMask[var3_int] = (long)param1.readUnsignedMedium(128) << 40;
            this.teamCharacterCounts[var3_int] = 0;
            this.field_J[var3_int] = 0;
            this.field_a[var3_int] = param1.readUnsignedShort((byte) 69);
            this.field_z[var3_int] = param1.readUnsignedShort((byte) 69);
          }
          while (true) {
            dupTemp$0 = param1.readUnsignedByte(31365);
            var3_intLifetime1 = dupTemp$0;
            if (dupTemp$0 == 0) {
              return;
            }
            var4 = null;
            var5 = param1.readUnsignedByte(31365);
            var6 = param1.readUnsignedShort((byte) 69);
            var7 = param1.readUnsignedShort((byte) 69);
            var8 = param1.readUnsignedShort((byte) 69);
            var8 = 255 & var8 | var8 << 16 & -16777216;
            var14 = var3_intLifetime1;
            if (var14 == 1) {
              var9 = (byte)(3 & var8 >>> 30);
              var8 = var8 & 1073741823;
              var10 = new GameCharacter(var6, var7, var8);
              var10.team = var9;
              var4Lifetime1 = var10;
              this.teamCharacterCounts[var9] = this.teamCharacterCounts[var9] + 1;
            } else {
              if (var14 == 2) {
                var11 = pg.a(var6, (byte) -83, var8, var7);
                var4Lifetime1 = var11;
              } else {
                if (3 == var14) {
                  stackIn_21_0 = null;
                  stackIn_21_1 = null;
                  stackIn_21_2 = var6;
                  stackIn_21_3 = var7;
                  stackIn_21_4 = var8 & 1;
                  stackIn_21_5 = 3 & var8 >>> 30;
                  if ((536870912 & var8) == 0) {
                    stackIn_22_0 = null;
                    stackIn_22_1 = null;
                    stackIn_22_6 = false;
                  } else {
                    stackIn_22_0 = null;
                    stackIn_22_1 = null;
                    stackIn_22_6 = true;
                  }
                  var12 = new jj(stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_22_6);
                  var4Lifetime1 = var12;
                } else {
                  if (var14 != 4) {
                    if (var14 != 5) {
                      throw new IllegalArgumentException("invalid actor type: " + var3_intLifetime1);
                    }
                    var4Lifetime1 = null;
                    var14 = var5;
                    var15 = var8 & 255 | var8 >> 16;
                    this.a(var6, var14, 117, var7, var15, (NavigationGrid) null);
                    var19 = (ce) (this.field_s.a((byte) -127));
                    var19.field_l = var15 * 2;
                  } else {
                    var13 = new cg((var8 & -1073741824) >>> 30, var6, var7);
                    this.field_A.a(var13, false);
                    var4Lifetime1 = null;
                  }
                }
              }
            }
            if (var4Lifetime1 == null) {
              continue;
            }
            ((SceneObject) (var4Lifetime1)).objectId = var5;
            this.nextObjectId = 1 + var5;
            this.characters.a((IntrusiveNode) (var4Lifetime1), false);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("kb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, String param3, int param4, int param5) {
        CipherPacketBuffer var8 = null;
        int var7 = 0;
        try {
          var8 = ma.field_a;
          CipherPacketBuffer var6 = var8;
          var8.b((byte) -35, param2);
          if (param5 != 29602) {
            field_w = (String) null;
          }
          var8.position = var8.position + 1;
          var7 = var8.position;
          var8.writeByte(114, param4);
          if (param4 == 2) {
            var8.writeString(param1, (byte) 105);
          }
          if (param3 == null) {
            var8.writeShort(param0, (byte) -71);
          } else {
            GameEvent.a(var8, param3, -31746);
          }
          var8.e(41, var8.position - var7);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kb.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void addEntity(int param0, TertiaryLinkNode param1) {
        try {
          param1.unlink(true);
          param1.a(-4564);
          if (param0 >= -95) {
            this.field_g = 51;
          }
          param1.unlinkTertiary((byte) -70);
          this.field_u.a(param1, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kb.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (this.phase == 1) {
          this.field_C = this.field_C - 250;
        }
        this.field_g = this.field_g - 1;
        if (param0 >= -57) {
          this.field_h = (LevelData) null;
        }
    }

    final GameCharacter a(int param0, boolean param1) {
        SceneObject var3 = this.a(param0, (byte) 33);
        if (var3 == null) {
          return null;
        }
        if (!(var3 instanceof GameCharacter)) {
          return null;
        }
        if (param1) {
          String var4 = (String) null;
          GameWorld.a(-73, (String) null, 60, (String) null, 9, -123);
        }
        return (GameCharacter) (var3);
    }

    final HumanView a(int param0, int param1) {
        SceneObject var3 = this.a(param0, (byte) 33);
        if (var3 == null) {
          return null;
        }
        int var4 = 94 / ((param1 + 27) / 43);
        if (!(var3 instanceof HumanView)) {
          return null;
        }
        return (HumanView) (var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, NavigationGrid param5) {
        ce var7 = null;
        Sprite[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var7 = new ce(param5, param0, param3, param4, param1);
          this.field_s.a(var7, false);
          if (param2 <= 98) {
            var8 = (Sprite[]) null;
            GameWorld.a(-11, 108, (Sprite[]) null, -106, (Sprite[]) null, (BitmapFont) null, -103, -20, -90, 29, (Sprite[]) null, (byte) 50, 82, -116, 28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_5_0 = var7_ref;
          stackIn_5_1 = new StringBuilder().append("kb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    GameWorld(String[] param0, LevelData param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_r = 0;
          this.field_b = param0;
          this.field_h = param1;
          if (null != this.field_h) {
            this.field_r = this.field_h.field_i;
          }
          this.teamCount = param0.length;
          if (this.teamCount == 1) {
            this.teamCount = 2;
          }
          this.field_J = new int[this.teamCount];
          this.field_D = new int[this.teamCount][2];
          this.teamUpgradeMask = new long[this.teamCount];
          this.teamScores = new int[this.teamCount];
          this.teamCharacterCounts = new int[this.teamCount];
          this.field_y = new int[this.teamCount];
          this.characters = new IntrusiveDeque();
          this.field_u = new IntrusiveDeque();
          this.field_A = new IntrusiveDeque();
          this.field_s = new IntrusiveDeque();
          this.field_G = new IntrusiveDeque();
          this.field_o = new int[this.teamCount];
          this.field_v = new int[this.teamCount];
          this.field_a = new int[this.teamCount];
          this.field_k = new PlayerLoadout[this.teamCount];
          this.field_z = new int[this.teamCount];
          for (var3_int = 0; this.teamCount > var3_int; var3_int++) {
            this.field_k[var3_int] = new PlayerLoadout();
          }
          this.teamCount = param0.length;
          this.field_c = false;
          this.phase = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_w = "This game has started.";
        field_q = "This option cannot be combined with the current settings for:  ";
        field_p = "Owner";
        field_E = "Mouse-over an icon for details";
        field_B = "Resign";
    }
}
