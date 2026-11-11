/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterChoice implements dv {
    private Player player;
    static SpriteData field_c;
    static String field_a;
    private int characterId;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 3) {
          String var2 = (String) null;
          CharacterChoice.a((byte) -5, (String) null);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static us a(byte param0, String param1) {
        RuntimeException var2 = null;
        us stackIn_2_0 = null;
        us stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -11) {
            stackIn_2_0 = (us) null;
            return stackIn_2_0;
          }
          if (DefaultRoomObjectRenderer.field_b.b(127) &&
            !param1.equals(DefaultRoomObjectRenderer.field_b.a((byte) 106))) {
            DefaultRoomObjectRenderer.field_b = ai.a((byte) 120, param1);
          }
          stackIn_7_0 = DefaultRoomObjectRenderer.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, boolean param2, Room param3, Trap param4, boolean param5) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        WeaponShooterBehaviour var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        SimpleBlockBehaviour var8 = null;
        ApproachPlayerLocomotor var9 = null;
        MiscItemBehaviour var10 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          param4.setIndependent((byte) -87, param5);
          var6_int = param1;
          if (var6_int != 0) {
            if (1 != var6_int) {
              if (var6_int == 2) {
                param4.setWeight((byte) -3, 10);
                param4.setObstructionLevel(3, 0);
                param4.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param3, param5)));
                param4.setPushable(true, 117);
                param4.setPushMode(119, 1);
                param4.setCollisionLevel(1, (byte) -12, true);
                param4.setAttachedToParent(false, 11468);
                param4.setFloating((byte) 17, false);
              } else {
                if (var6_int == 3) {
                  param4.setWeight((byte) -3, 20);
                  param4.setObstructionLevel(3, 0);
                  var8 = new SimpleBlockBehaviour(param3, param5);
                  param4.setCollisionLevel(3, (byte) -12, true);
                  var8.b((byte) -107, true);
                  param4.addBehaviour((byte) 83, (Behaviour) (var8));
                  param4.addLocomotor(new SimpleMoveLocomotor(param3, 131072, 0, 0, param5), 0);
                  param4.setFloating((byte) 17, false);
                  param4.setAttachedToParent(false, 11468);
                } else {
                  if (var6_int != 4) {
                    if (var6_int == 5) {
                      param4.setWeight((byte) -3, 10);
                      param4.setObstructionLevel(3, 0);
                      param4.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param3, param5)));
                      param4.addBehaviour((byte) 83, (Behaviour) (new BeamShooterBehaviour(param3, param5)));
                      param4.addLocomotor(new FacePlayerLocomotor(param3, param5), 0);
                    } else {
                      if (var6_int == 6) {
                        param4.setWeight((byte) -3, 20);
                        param4.setObstructionLevel(3, 0);
                        param4.addBehaviour((byte) 83, (Behaviour) (new CrusherBehaviour(param3, param5)));
                        var9 = new ApproachPlayerLocomotor(param3, param5);
                        param4.addLocomotor(var9, 0);
                        var9.c(124, 0);
                      } else {
                        if (var6_int == 7) {
                          param4.setWeight((byte) -3, 2);
                          var10 = new MiscItemBehaviour(param3, param5);
                          var10.setItemType(0, false);
                          param4.addBehaviour((byte) 83, (Behaviour) (var10));
                          param4.setAttachedToParent(false, 11468);
                          param4.setFloating((byte) 17, false);
                        }
                      }
                    }
                  } else {
                    param4.setWeight((byte) -3, 10);
                    param4.setObstructionLevel(3, 0);
                    param4.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param3, param5)));
                    var6 = new WeaponShooterBehaviour(param3, param5);
                    var6.a(TextureOperator.a(2, -1), (byte) 100);
                    param4.addBehaviour((byte) 83, (Behaviour) (var6));
                    param4.addLocomotor(new RotateLocomotor(param3, param5), 0);
                  }
                }
              }
            } else {
              param4.setWeight((byte) -3, 10);
              param4.setObstructionLevel(3, 0);
              param4.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param3, param5)));
              param4.setFloating((byte) 17, true);
            }
          } else {
            param4.addBehaviour((byte) 83, (Behaviour) (new PitBehaviour(param3, param5)));
          }
          if (param0 > -85) {
            field_c = (SpriteData) null;
          }
          if (!param2) {
            return;
          }
          param4.rebuildBehaviourModels(437453352, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_28_0 = var6_ref;
          stackIn_28_1 = new StringBuilder().append("wd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(')').toString());
        }
    }

    final int getCharacter(int param0) {
        if (param0 <= 52) {
          CharacterChoice.releaseStatics(72);
          return this.characterId;
        }
        return this.characterId;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        int var26 = 0;
        int var27 = 0;
        int incrementValue$9 = 0;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
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
        int var28 = 0;
        int[] var29 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        var28 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 < param6 &&
            !cla.isPowerOfTwoOrZero(9181, param6)) {
            throw new IllegalArgumentException("");
          }
          if (param3 <= 49) {
            var29 = (int[]) null;
            CharacterChoice.a(127, 113, -99, -33, (int[]) null, 112, 62, 15);
          }
          if (param7 > 0 &&
            !cla.isPowerOfTwoOrZero(9181, param7)) {
            throw new IllegalArgumentException("");
          }
          if (param1 != 32993) {
            throw new IllegalArgumentException("");
          }
          var8_int = 0;
          stackIn_14_0 = (param7 <= param6) ? param7 : param6;
          var9 = stackIn_14_0;
          var10 = param6 >> 1;
          var11 = param7 >> 1;
          var12 = param4;
          var13 = new int[var10 * var11];
          while (true) {
            jaggl.OpenGL.glTexImage2Di(param0, var8_int, param2, param6, param7, 0, param1, param5, var12, 0);
            if (1 >= var9) {
              return;
            }
            var15 = 0;
            var24 = 0;
            var25 = param6 + var24;
            for (var26 = 0; var11 > var26; var26++) {
              for (var27 = 0; var10 > var27; var27++) {
                var16 = var12[var24++];
                var17 = var12[var24++];
                var18 = var12[var25++];
                var19 = var12[var25++];
                var23 = 255 & var16 >> 24;
                var22 = 255 & var16;
                var21 = var16 >> 8 & 255;
                var20 = (var16 & 16742997) >> 16;
                var21 = var21 + (var17 >> 8 & 255);
                var23 = var23 + (255 & var17 >> 24);
                var20 = var20 + ((var17 & 16776900) >> 16);
                var22 = var22 + (var17 & 255);
                var22 = var22 + (255 & var18);
                var23 = var23 + (255 & var18 >> 24);
                var20 = var20 + ((16756606 & var18) >> 16);
                var21 = var21 + (var18 >> 8 & 255);
                var23 = var23 + (var19 >> 24 & 255);
                var21 = var21 + ((var19 & 65349) >> 8);
                var22 = var22 + (var19 & 255);
                var20 = var20 + ((16764137 & var19) >> 16);
                incrementValue$9 = var15;
                var15++;
                var13[incrementValue$9] = WallTile.bitwiseOr(SnakePitBehaviour.bitwiseAnd(1020, var22) >> 2, WallTile.bitwiseOr(WallTile.bitwiseOr(SnakePitBehaviour.bitwiseAnd(var23 << 22, -16777216), SnakePitBehaviour.bitwiseAnd(1020, var20) << 14), SnakePitBehaviour.bitwiseAnd(var21 << 6, 65280)));
              }
              var25 = var25 + param6;
              var24 = var24 + param6;
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            param7 = var11;
            param6 = var10;
            var9 = var9 >> 1;
            var8_int++;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("wd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final void decode(BitPacketBuffer param0, boolean param1) {
        try {
          this.characterId = uma.readSignedBits(5, param0, -26803);
          if (param1) {
            this.player = (Player) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "wd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = param3 + param0;
          var8 = param6 - param0;
          for (var11 = param3; var7_int > var11; var11++) {
            nra.fillRange((byte) -55, param2, param1, vaa.field_a[var11], param4);
          }
          var9 = param0 + param4;
          if (param5 != 27) {
            field_c = (SpriteData) null;
          }
          var10 = param1 - param0;
          for (var11Lifetime1 = param6; var8 < var11Lifetime1; var11Lifetime1--) {
            nra.fillRange((byte) -55, param2, param1, vaa.field_a[var11Lifetime1], param4);
          }
          for (var11Lifetime2 = var7_int; var8 >= var11Lifetime2; var11Lifetime2++) {
            var17 = vaa.field_a[var11Lifetime2];
            nra.fillRange((byte) -55, param2, var9, var17, param4);
            nra.fillRange((byte) -55, param2, param1, var17, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var7), "wd.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void setPlayer(int param0, Player param1) {
        if (param0 != 11008) {
          return;
        }
        try {
          this.player = param1;
          this.setCharacter(this.characterId, (byte) 37);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "wd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CharacterChoice() {
    }

    final void setCharacter(int param0, byte param1) {
        this.characterId = param0;
        if (param1 != 37) {
          CharacterChoice.a(-67, 85, 11, -69, 5, (byte) -38, -52);
          if (null == this.player) {
            return;
          }
          if (this.player.getAnimator((byte) -84) != null) {
            this.player.getAnimator((byte) -115).setCharacter(param0, 1);
            this.player.getAnimator((byte) -82).setAnimationState(26, 0, true);
            return;
          }
          return;
        }
        if (null == this.player) {
          return;
        }
        if (this.player.getAnimator((byte) -84) == null) {
          return;
        }
        this.player.getAnimator((byte) -115).setCharacter(param0, 1);
        this.player.getAnimator((byte) -82).setAnimationState(26, 0, true);
    }

    CharacterChoice(Player param0) {
        try {
          this.player = param0;
          this.characterId = -1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static mf compileAssemblyProgram(byte param0, HardwareOpenGlToolkit param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mf stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        mf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param3, var4_int);
          if (param0 != -70) {
            stackIn_5_0 = (mf) null;
            return stackIn_5_0;
          }
          jaggl.OpenGL.glProgramRawARB(param3, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, GrowableIntList.field_a, 0);
          if (GrowableIntList.field_a[0] != -1) {
            jaggl.OpenGL.glBindProgramARB(param3, 0);
            stackIn_9_0 = null;
            return (mf) (stackIn_9_0);
          }
          jaggl.OpenGL.glBindProgramARB(param3, 0);
          stackIn_11_0 = new mf(param1, param3, var4_int);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Uh oh, you've been trapped forever in the Tortuous Temple of Torment! Press <img=16> to try again.";
    }
}
