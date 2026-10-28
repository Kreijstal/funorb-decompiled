/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static Sprite field_c;
    static String field_a;
    static String field_d;
    private String name;

    final static void a(int param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = 0;
        int var3 = SocketConnector.field_d;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (var3 * 16384 - 40960) / 220;
            int var4 = 1;
            int var5 = 0;
            if (3 == param0) {
              var4 = -1;
            }
            if (param0 == 1) {
              var5 = 1;
            }
            if (4 == param0) {
              var5 = 1;
              var4 = 1;
            }
            if (5 == param0) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 < 46) {
              return;
            }
            if (6 == param0) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 == 7) {
              var4 = -1;
              var5 = -1;
            } else if (8 == param0) {
              var4 = -1;
              var5 = -1;
            }
            if (param0 == 11) {
              var4 = -1;
            }
            if (12 == param0) {
              var4 = -1;
              var5 = -1;
            }
            if (param0 == 13) {
              var5 = -1;
              var4 = 1;
            }
            if (param0 == 14) {
              var4 = -1;
              var5 = 1;
            }
            if (15 == param0) {
              var5 = 1;
              var4 = 1;
            }
            TerrainMaskSupport.field_c = DialogueScreen.rotationTransformQ16((byte) 82, var2 * var5, var2 * var4);
            return;
          }
          if (var3 < 120) {
            var3 = 120 - var3;
            var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            int var4Lifetime2 = 1;
            int var5Lifetime2 = 0;
            if (3 == param0) {
              var4Lifetime2 = -1;
            }
            if (param0 == 1) {
              var5Lifetime2 = 1;
            }
            if (4 == param0) {
              var5Lifetime2 = 1;
              var4Lifetime2 = 1;
            }
            if (5 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = 1;
            }
            if (param1 < 46) {
              return;
            }
            if (6 == param0) {
              var4Lifetime2 = 1;
              var5Lifetime2 = -1;
            }
            if (param0 == 7 ||
              8 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            }
            if (param0 == 11) {
              var4Lifetime2 = -1;
            }
            if (12 == param0) {
              var4Lifetime2 = -1;
              var5Lifetime2 = -1;
            }
            if (param0 == 13) {
              var5Lifetime2 = -1;
              var4Lifetime2 = 1;
            }
            if (param0 == 14) {
              var4Lifetime2 = -1;
              var5Lifetime2 = 1;
            }
            if (15 == param0) {
              var5Lifetime2 = 1;
              var4Lifetime2 = 1;
            }
            TerrainMaskSupport.field_c = DialogueScreen.rotationTransformQ16((byte) 82, var2 * var5Lifetime2, var2 * var4Lifetime2);
            return;
          }
        }
        int var4Lifetime1 = 1;
        int var5Lifetime1 = 0;
        if (3 == param0) {
          var4Lifetime1 = -1;
        }
        if (param0 == 1) {
          var5Lifetime1 = 1;
        }
        if (4 == param0) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        if (5 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 < 46) {
          return;
        }
        if (6 == param0) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 == 7 ||
          8 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (param0 == 11) {
          var4Lifetime1 = -1;
        }
        if (12 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (param0 == 13) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param0 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (15 == param0) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        TerrainMaskSupport.field_c = DialogueScreen.rotationTransformQ16((byte) 82, var2 * var5Lifetime1, var2 * var4Lifetime1);
    }

    public static void releaseStatics(boolean guard) {
        field_c = null;
        if (guard) {
          LoginMethod.releaseStatics(true);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != 27002) {
            field_a = (String) null;
          }
          DialogueScreen.writeCookie((byte) 70, param1, "jagex-last-login-method", this.name, 31536000L);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ee.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        String stackIn_8_2 = null;
        try {
          int var3_int = 74 % ((param0 + 43) / 47);
          if (!param2) {
            int stackIn_4_0 = MembershipAssetSupport.field_a.stringWidth(param1);
            return stackIn_4_0;
          }
          int stackIn_2_0 = MenuTitleRenderSupport.field_e.stringWidth(param1);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ee.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean matchesName(String name, byte guard) {
        String stackIn_5_2 = null;
        try {
          int var3_int = 50 % ((guard - 55) / 61);
          boolean stackIn_1_0 = this.name.equals(name);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("ee.A(");
          if (name == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void drawThreeSlice(int x, int width, boolean guard, Sprite[] sprites, int y) {
        String stackIn_14_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (sprites != null &&
            width > 0) {
            int var5_int = sprites[0].fullWidth;
            if (!guard) {
              field_d = (String) null;
            }
            int var6 = sprites[2].fullWidth;
            int var7 = sprites[1].fullWidth;
            sprites[0].drawTransparent(x, y);
            sprites[2].drawTransparent(-var6 + x + width, y);
            SoftwareRasterizer.saveClip(SessionCounterState.field_m);
            SoftwareRasterizer.intersectClip(var5_int + x, y, x - (-width + var6), sprites[1].fullHeight + y);
            int var8 = var5_int + x;
            int var9 = -var6 + (width + x);
            for (x = var8; x < var9; x = x + var7) {
              sprites[1].drawTransparent(x, y);
            }
            SoftwareRasterizer.restoreClip(SessionCounterState.field_m);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ee.F(").append(x).append(',').append(width).append(',').append(guard).append(',');
          if (sprites == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(y).append(')').toString());
        }
    }

    final static PointCloudEffect a(LevelObject param0, int param1, boolean param2) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 14) {
            Sprite[] var4 = (Sprite[]) null;
            LoginMethod.drawThreeSlice(30, -124, true, (Sprite[]) null, -14);
          }
          PointCloudEffect stackIn_3_0 = AchievementDefinition.createSpriteDebris((byte) -43, SessionCounterState.objectExplosionSamples[param0.objectType], param0.y, param0.collisionSprite, param2, param0.x);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ee.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    LoginMethod(String name) {
        try {
          this.name = name;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ee.<init>(" + (name != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Music: ";
    }
}
