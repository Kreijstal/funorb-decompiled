/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelObject extends IntrusiveNode {
    boolean field_h;
    Sprite collisionSprite;
    static String field_q;
    int spriteFrame;
    int x;
    int objectId;
    private int displayOffsetX;
    private int displayOffsetY;
    boolean field_p;
    boolean field_r;
    int y;
    private Sprite displaySprite;
    int field_o;
    int objectType;

    private final void a(boolean param0, int param1, int param2) {
        try {
          int var4_int = 100;
          int var5 = BoundedRandomAccessFile.activeSession.elapsedTicks % var4_int;
          if (null == this.collisionSprite) {
            return;
          }
          int var6 = this.collisionSprite.fullWidth;
          int var7 = this.collisionSprite.fullHeight;
          int var8 = var6 + (var4_int - var5) * 2 * var6 / var4_int;
          int var9 = (-var5 + var4_int) * var7 * 2 / var4_int + var7;
          if (param0) {
            this.a(false, -79, -121);
          }
          int var10 = var5 * 128 / var4_int;
          int var11 = 16711680;
          int var12 = this.y + (-param2 - (var9 - var7) / 2);
          int var13 = var9 + var12;
          int var14 = 480;
          if (var13 >= 0 &&
            var12 < var14) {
            int var15 = -param1 + this.x - (var8 - var6) / 2;
            int var16 = var8 + var15;
            int var17 = BoundedRandomAccessFile.activeSession.worldWidth;
            SoftwareRasterizer.b(var15, var12, var8, var9, var11, var10);
            if (var15 > 0 &&
              var17 <= var16) {
              return;
            }
            if (0 < var15) {
              var15 = var15 - var17;
              if (EscapeVector.obfuscationControl != 0) {
                var15 = var15 + var17;
              }
            } else {
              var15 = var15 + var17;
            }
            SoftwareRasterizer.b(var15, var12, var8, var9, var11, var10);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var4), "sa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        try {
          try {
            if (param0 != 27) {
              LevelObject.d((byte) -32);
            }
            je.field_a = new IntrusiveDeque();
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var1 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var1), "sa.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final fn b(boolean param0) {
        try {
          rk[] var2 = w.c(false);
          if (!param0) {
            fn stackIn_2_0 = (fn) null;
            return stackIn_2_0;
          }
          if (var2 != null) {
            fn stackIn_7_0 = var2[this.objectType].a((byte) 120, this.spriteFrame);
            return stackIn_7_0;
          }
          Object stackIn_5_0 = null;
          return (fn) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, Sprite[] param3, int param4, int param5, Sprite[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        String stackIn_7_2 = null;
        String stackIn_11_2 = null;
        String stackIn_15_2 = null;
        try {
          di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
          if (param2) {
            field_q = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("sa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    private final Sprite d(int param0) {
        try {
          if (param0 != 0) {
            LevelObject.a(22, (byte) 101);
          }
          rk[] var2 = w.c(false);
          if (null == var2) {
            Object stackIn_7_0 = null;
            return (Sprite) (stackIn_7_0);
          }
          Sprite stackIn_9_0 = var2[this.objectType].a(-125, this.spriteFrame);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.I(" + param0 + ')');
        }
    }

    LevelObject(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        try {
          this.field_p = param5;
          this.spriteFrame = param6;
          this.field_r = param4;
          this.refreshSprites(-7012);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void stampTerrain(boolean guard, GameplaySession session) {
        int stackIn_31_0 = 0;
        String stackIn_39_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          int var3_int = 0;
          int var4 = 0;
          while (true) {
            int stackIn_5_0 = ~this.collisionSprite.height;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_5_0 < ~var4) {
              int var5 = var4 + (this.y + this.collisionSprite.offsetY);
              int var6 = var5 >> 5;
              var5 = var5 & 31;
              stackIn_31_0 = 0;
              decompiledFrameRemainder0 = (var11 == 0);
              if (decompiledFrameRemainder0) {
                int var7 = stackIn_31_0;
                while (var7 < this.collisionSprite.width) {
                  int var8 = var7 + (this.collisionSprite.offsetX + this.x);
                  int var9 = var8 >> 5;
                  stackIn_5_0 = var8 & 31;
                  int var8Lifetime1 = stackIn_5_0;
                  while (var9 < 0) {
                    var9 = var9 + session.tilesWide;
                  }
                  var9 = var9 % session.tilesWide;
                  if (this.collisionSprite.pixels[var3_int] != 0) {
                    int[] var10 = session.terrainMasks[var9 + session.tilesWide * var6];
                    if (QuickChatPhraseDefinition.fullTileMask != var10) {
                      if (null == var10) {
                        int[] array$0 = new int[32];
                        var10 = array$0;
                        session.terrainMasks[var9 + var6 * session.tilesWide] = array$0;
                      }
                      var10[var5] = lb.a(var10[var5], 1 << var8Lifetime1);
                    }
                  }
                  var3_int++;
                  var7++;
                }
                var4++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_31_0 = guard ? 1 : 0;
            }
            if (stackIn_31_0 != 1) {
              this.objectId = -96;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_38_0 = var3;
          StringBuilder stackIn_38_1 = new StringBuilder().append("sa.E(").append(guard).append(',');
          if (session == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object var4 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          if (this.field_h) {
            int var9Lifetime1 = this.a((byte) 54);
            if (var9Lifetime1 > 0) {
              var5 = this.displayOffsetX;
              var4 = this.displaySprite;
              var6 = this.displayOffsetY;
              if (var5 < 0) {
                var7 = -var5;
              }
              if (var6 < 0) {
                var8 = -var6;
              }
            }
          }
          int var10 = this.y - param0;
          if (var10 < 480 + var8 &&
            var10 > -this.collisionSprite.fullHeight) {
            int var11 = -param2 + (this.x + BoundedRandomAccessFile.activeSession.worldWidth + BoundedRandomAccessFile.activeSession.worldWidth) - var7;
            int var12 = this.collisionSprite.fullWidth + var7 + var7;
            var11 = var11 + var12;
            var11 = var11 % BoundedRandomAccessFile.activeSession.worldWidth;
            var11 = var11 - var12;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11 >= 640))) {
              if (var13 == 0) {
                if (null != var4) {
                  this.collisionSprite.e(var11 + var7, var10);
                  ((Sprite) (var4)).c(var5 + var11 + var7, var10 + var6, this.a((byte) 122));
                } else {
                  this.collisionSprite.e(var11, var10);
                }
                var11 = var11 + BoundedRandomAccessFile.activeSession.worldWidth;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0 &&
              param1 <= 106) {
              this.a(false, -48, -24);
            }
            if (this.field_r) {
              this.a(false, param2, param0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (var4), "sa.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0) {
        try {
          if (param0 < 36) {
            field_q = (String) null;
          }
          if (this.objectType == 2) {
            int var2_int = -42 + this.field_o;
            if (var2_int <= 0) {
              int stackIn_14_0 = 0;
              return stackIn_14_0;
            }
            int stackIn_16_0 = 16 * var2_int;
            return stackIn_16_0;
          }
          double var2_double = (double)(BoundedRandomAccessFile.activeSession.field_Zb / 8);
          if (kg.a((byte) -98, this.objectType)) {
            var2_double = (double)(BoundedRandomAccessFile.activeSession.elapsedTicks % 100) / 100.0;
          }
          double var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
          int stackIn_9_0 = (int)(var4 * var4 * 28.0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.M(" + param0 + ')');
        }
    }

    private final void refreshSprites(int guard) {
        this.collisionSprite = k.a(this.spriteFrame, (byte) -39, this.objectType);
        this.displaySprite = this.d(0);
        fn var2 = this.b(true);
        if (guard != -7012) {
          return;
        }
        if (var2 == null) {
          return;
        }
        try {
          this.displayOffsetX = var2.field_c;
          this.displayOffsetY = var2.field_b;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.H(" + guard + ')');
        }
    }

    LevelObject(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        try {
          this.field_r = param4;
          this.field_p = param5;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            if (hi.a(param0, -2)) {
              DialogueScreen var2 = new DialogueScreen(ic.field_n, ae.field_c, qh.field_j, true);
              re.a(1820, var2);
            }
            if (param1 >= -69) {
              return;
            }
            if (param0 == 2) {
              String var2_ref = "vengeance_intro";
              String var3 = "scene";
              Sprite[] var4 = tm.field_cb;
              String[] var5 = me.field_o;
              DialogueScreen var6 = new DialogueScreen(var2_ref, var3, var4, var5, true);
              re.a(1820, var6);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var2_ref2 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var2_ref2), "sa.D(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(byte param0) {
        try {
          if (mf.a(this.objectType, -64)) {
            return false;
          }
          if (1 == this.objectType) {
            return false;
          }
          if (5 == this.objectType) {
            return false;
          }
          if (this.objectType == 6) {
            return false;
          }
          if (param0 != -5) {
            return false;
          }
          if (this.objectType == 7) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.F(" + param0 + ')');
        }
    }

    final void removeFromTerrain(GameplaySession session, byte guard) {
        String stackIn_49_2 = null;
        int var12 = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          int var3_int = 0;
          if (guard < 58) {
            this.refreshSprites(-105);
          }
          int var4 = 0;
          scanLoop1: while (true) {
            int stackIn_9_0 = this.collisionSprite.height;
            if (stackIn_9_0 > var4) {
              int var5 = var4 + this.collisionSprite.offsetY + this.y;
              int var6 = var5 >> 5;
              var5 = var5 & 31;
              if (var12 != 0) {
                return;
              }
              int var7 = 0;
              while (var7 < this.collisionSprite.width) {
                int var8 = var7 + (this.x + this.collisionSprite.offsetX);
                int var9 = var8 >> 5;
                stackIn_9_0 = var8 & 31;
                int var8Lifetime1 = stackIn_9_0;
                while (0 > var9) {
                  var9 = var9 + session.tilesWide;
                }
                var9 = var9 % session.tilesWide;
                if (null != BoundedRandomAccessFile.activeSession.dynamicTerrain) {
                  BoundedRandomAccessFile.activeSession.dynamicTerrain.invalidateTileNeighborhood(var9, var6, true);
                }
                if (0 != this.collisionSprite.pixels[var3_int]) {
                  int[] var10 = session.terrainMasks[session.tilesWide * var6 + var9];
                  if (var10 != null) {
                    if (QuickChatPhraseDefinition.fullTileMask == var10) {
                      int[] array$0 = new int[32];
                      var10 = array$0;
                      session.terrainMasks[session.tilesWide * var6 + var9] = array$0;
                      int var11 = 0;
                      while (var11 < 32) {
                        var10[var11] = -1;
                        var11++;
                      }
                    }
                    var10[var5] = ae.a(var10[var5], ~(1 << var8Lifetime1));
                  }
                }
                var3_int++;
                var7++;
              }
              var4++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_48_0 = var3;
          StringBuilder stackIn_48_1 = new StringBuilder().append("sa.C(");
          if (session == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        try {
          if (param0) {
            LevelObject.a(77, 13, true, (Sprite[]) null, -108, -59, (Sprite[]) null, -14, -30, (wl) null, -40, true);
          }
          field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var1 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var1), "sa.G(" + param0 + ')');
        }
    }

    LevelObject(int objectId, int objectType, int x, int y) {
        boolean stackIn_6_1 = false;
        this.field_o = 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.y = y;
          this.x = x;
          this.objectId = objectId;
          this.objectType = objectType;
          Object stackIn_3_0 = this;
          if (objectType != 2) {
            Object stackIn_5_0 = this;
            Object stackIn_3_0Lifetime1 = stackIn_5_0;
            if (!kg.a((byte) -125, this.objectType)) {
              stackIn_6_1 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_6_1 = true;
          }
          this.field_h = stackIn_6_1;
          this.field_p = false;
          this.field_r = false;
          this.spriteFrame = 0;
          this.refreshSprites(-7012);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + objectId + ',' + objectType + ',' + x + ',' + y + ')');
        }
    }

    static {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
