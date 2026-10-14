/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends k {
    static int field_k;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int var14Lifetime1;
        int var20Lifetime1;
        int var14Lifetime1Lifetime1;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          param12 = param12 + param7;
          var13_int = 0;
          var14 = 0;
          var15 = -param4;
          if (param10 != 8) {
            var22 = (int[]) null;
            kf.a((int[]) null, 92, 50, 37, -19, 126, (int[]) null, 74, 68, -55, 33, -74, 59);
          }
          while (var15 < 0) {
            var13_int = var13_int - param7;
            var16 = param5 >> 8;
            var17 = 256 - var16;
            var18 = var16 * (param11 & 16711935);
            var19 = var16 * (param11 & 65280);
            while (param8 > var13_int) {
              param3 = param6[param9++];
              if (param3 <= 0) {
                var13_int = var13_int - param3;
                continue;
              }
              for (var14Lifetime1 = 0; var14Lifetime1 < param3; var14Lifetime1++) {
                if (var13_int >= param8) {
                  var20 = param0[param12 + var13_int];
                  param0[param12 + var13_int] = ik.a(var17 * ik.a(65280, var20) + var19, 16711680) + ik.a(ik.a(var20, 16711935) * var17 + var18, -16711936) >>> 8;
                }
                var13_int++;
              }
            }
            while (param2 > var13_int) {
              param3 = param6[param9++];
              if (param3 <= 0) {
                var13_int = var13_int - param3;
                continue;
              }
              for (var14Lifetime1Lifetime1 = 0; var14Lifetime1Lifetime1 < param3; var14Lifetime1Lifetime1++) {
                if (var13_int < param2) {
                  var20Lifetime1 = param0[param12 + var13_int];
                  param0[param12 + var13_int] = ik.a(-16711936, var17 * ik.a(var20Lifetime1, 16711935) + var18) + ik.a(var19 + ik.a(var20Lifetime1, 65280) * var17, 16711680) >>> 8;
                }
                var13_int++;
              }
            }
            param12 = param12 + Rasterizer2D.width;
            param5 = param5 + param1;
            var15++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_28_0 = var13;
          stackIn_28_1 = new StringBuilder().append("kf.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final qh a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ResourceArchive var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        qh stackIn_2_0 = null;
        qh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!MeshAttributeRecord.a(var5, -125)) {
            stackIn_2_0 = lp.field_xb;
            return stackIn_2_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var3_int = fl.a(var6, -28734);
          if (param1 != 106) {
            var4 = (ResourceArchive) null;
            kf.a((String) null, (String) null, (ResourceArchive) null, -17);
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            return DualLinkIterator.field_c;
          }
          stackIn_9_0 = lp.field_xb;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kf.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    kf(TextFieldWidget param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, (byte) 106) == lp.field_xb) {
            stackIn_3_0 = FarmBackground.field_y;
            return stackIn_3_0;
          }
          var3_int = -11 / ((param0 + 16) / 50);
          stackIn_5_0 = null;
          return (String) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_4_0 = MenuScreen.field_o;
            return stackIn_4_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = ChatMessage.normalizePlayerName(param1, param2 + 111);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ik.isNameSeparator((byte) -9, var4.charAt(0)) &&
                !ik.isNameSeparator((byte) -9, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                if (param2 != 3) {
                  stackIn_22_0 = (String) null;
                  return stackIn_22_0;
                }
                for (var6 = 0; var6 < param1.length(); var6++) {
                  var7 = param1.charAt(var6);
                  if (ik.isNameSeparator((byte) -9, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !param0) {
                    stackIn_31_0 = MusicPatch.field_n;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = MenuButton.field_g;
                return stackIn_36_0;
              }
              stackIn_19_0 = MenuButton.field_g;
              return stackIn_19_0;
            }
            stackIn_14_0 = MenuScreen.field_o;
            return stackIn_14_0;
          }
          stackIn_9_0 = MenuScreen.field_o;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("kf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              if (param1 > -111) {
                return;
              }
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = hg.a(param2, var3, -1);
              HuffmanCodec.a((byte) 94, param2, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("kf.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static RgbSprite[] a(String param0, String param1, ResourceArchive param2, int param3) {
        RgbSprite[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RgbSprite[] var6 = null;
        RgbSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = cr.loadRgbSpritesByName(param1, param2, param0, 2);
          var4 = var6;
          var6[3].canvasHeight = var6[3].height;
          var6[1].canvasWidth = var6[1].width;
          var6[5].canvasHeight = var6[5].height;
          var6[7].canvasWidth = var6[7].width;
          var6[1] = FarmBackground.a(var6[1], false, 8);
          var6[7] = FarmBackground.a(var6[7], false, 8);
          var6[3] = k.a(var6[3], 101, 8);
          var6[5] = k.a(var6[5], 89, 8);
          var5 = -92 / ((-45 - param3) / 34);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("kf.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
