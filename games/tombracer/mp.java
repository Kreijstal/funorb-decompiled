/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static gb field_a;
    int[] field_c;
    static SpriteData field_d;
    static String field_b;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          Throwable throwable = null;
          RuntimeException runtimeException = null;
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            RoomEffectTraps.field_g = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var4 = param1.getParameter("cookiehost");
              var5 = var3 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              boolean decompiledSharedTail0 = (param0.length() != 0);
              if (!decompiledSharedTail0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                decompiledSharedTail0 = (TombRacer.field_G);
              }
              if (decompiledSharedTail0) {
                var5 = var5 + "; Expires=" + ida.formatCookieDate(bva.currentTimeMillis((byte) -107) + 94608000000L, param2 + 21406) + "; Max-Age=" + 94608000L;
              }
              JavaScriptBridge.evaluateScript(param1, 19467, "document.cookie=\"" + var5 + "\"");
              if (param2 != -21407) {
                mp.a(-2);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            MatchProtocol.a((byte) 64, param1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = runtimeException;
            stackIn_14_1 = new StringBuilder().append("mp.C(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void setMusicVolume(int param0, int param1) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var3 = 0;
        boolean stackIn_23_0 = false;
        RuntimeException decompiledCaughtException = null;
        vb var2Lifetime1;
        boolean stackIn_23_0Lifetime1;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          HardwareRidgedWaterNoise.field_v = param1;
          if (param0 != 2) {
            return;
          }
          var2 = (vb) (DivisionMazeGenerator.field_e.first(param0 ^ -78));
          while (null != var2) {
            stackIn_23_0 = var2.field_h.isLinked((byte) 122);
            if (var3 != 0) {
              while (true) {
                if (stackIn_23_0) {
                  var2.field_f.e(var2.field_g * HardwareRidgedWaterNoise.field_v + 128 >> 8);
                }
                var2.unlink(param0 + 2);
                var2 = (vb) (Obstacle.field_f.next(113));
                return;
              }
            }
            if (!stackIn_23_0) {
              var2.unlink(78);
            }
            if (stackIn_23_0 ||
              var3 != 0) {
              var2.field_f.e(var2.field_g * HardwareRidgedWaterNoise.field_v + 128 >> 8);
            }
            var2 = (vb) (DivisionMazeGenerator.field_e.next(112));
            if (var3 == 0) {
              continue;
            }
            break;
          }
          if (null != Obstacle.field_f) {
            var2Lifetime1 = (vb) (Obstacle.field_f.first(param0 ^ -78));
            while (null != var2Lifetime1) {
              if (var3 != 0) {
                return;
              }
              stackIn_23_0Lifetime1 = var2Lifetime1.field_h.isLinked((byte) 44);
              if (stackIn_23_0Lifetime1) {
                var2Lifetime1.field_f.e(var2Lifetime1.field_g * HardwareRidgedWaterNoise.field_v + 128 >> 8);
              } else {
                var2Lifetime1.unlink(param0 + 2);
              }
              var2Lifetime1 = (vb) (Obstacle.field_f.next(113));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "mp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          var1_int = 11 % ((-52 - param0) / 57);
          stackIn_1_0 = ej.field_a.g(-110);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.A(" + param0 + ')');
        }
    }

    final static void a(jea param0, jea param1, boolean param2, jea param3, VerticalScrollbar param4, jea param5, int param6, jea param7, jea param8, jea param9, jea param10, BitmapFont param11) {
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        jea var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          pm.field_a[3] = 16736511;
          pm.field_a[2] = 9474303;
          PlatformBehaviour.field_s = param11;
          pm.field_a[4] = 16711935;
          kq.field_c = param2;
          pm.field_a[0] = 16764000;
          pm.field_a[1] = 6356832;
          VortexBehaviour.field_t = param7;
          BrickOperator.field_t[3] = 16736511;
          BrickOperator.field_t[2] = 16736352;
          RoomLighting.field_d = 8421504;
          BrickOperator.field_t[param6] = 16764000;
          pm.field_a[4] = 16711935;
          BrickOperator.field_t[1] = 6356832;
          var12 = new Sprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var14[5] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          era.field_e = new jea(0L, param0);
          MatchProtocol.field_i = new jea(0L, param9);
          era.field_e.b(-128, MatchProtocol.field_i);
          var17 = new jea(0L, (jea) null);
          var17.field_J = new IntrusiveDeque();
          ne.field_d = new ScrollPane(0L, var17, param3, param4);
          MatchProtocol.field_i.b(-126, ne.field_d);
          RotaterMountComponent.field_K = new jea(0L, param1);
          MatchProtocol.field_i.b(-124, RotaterMountComponent.field_K);
          CharacterChoiceFactory.field_g = new jea(0L, param5);
          CharacterChoiceFactory.field_g.field_H = PlatformBehaviour.field_s;
          RotaterMountComponent.field_K.b(param6 - 124, CharacterChoiceFactory.field_g);
          RotaterMountComponent.field_K.a(param6 ^ -10966);
          ComponentMount.field_b = new jea(0L, (jea) null);
          ComponentMount.field_b.field_w = var16;
          RotaterMountComponent.field_K.b(-125, ComponentMount.field_b);
          bt.field_c = new jea[5];
          PitModel.field_p = new jea[5];
          MembersUpsellMenu.field_y = new jea[5];
          OpenGlSceneLight.field_p = new jea[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_31_0 = ~var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 != -1) {
                if (var18 != 1 ||
                  !kq.field_c) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = dna.field_H;
                  }
                } else {
                  var19 = BitPacketBuffer.field_p;
                }
              } else {
                if (!kq.field_c) {
                  stackIn_27_0 = wra.field_a;
                } else {
                  stackIn_27_0 = cla.field_o;
                }
                var19 = stackIn_27_0;
              }
              if (decompiledFrameRemainder0) {
                OpenGlSceneLight.field_p[var18] = new jea(0L, param10);
                bt.field_c[var18] = new jea(0L, VortexBehaviour.field_t, var19);
                MembersUpsellMenu.field_y[var18] = new jea(0L, (jea) null);
                MembersUpsellMenu.field_y[var18].field_bb = 1;
                PitModel.field_p[var18] = new jea(0L, VortexBehaviour.field_t);
                PitModel.field_p[var18].field_bb = 1;
                OpenGlSceneLight.field_p[var18].b(-122, bt.field_c[var18]);
                OpenGlSceneLight.field_p[var18].b(param6 - 125, MembersUpsellMenu.field_y[var18]);
                OpenGlSceneLight.field_p[var18].b(-125, PitModel.field_p[var18]);
                OpenGlSceneLight.field_p[var18].a(-10966);
                era.field_e.b(-127, OpenGlSceneLight.field_p[var18]);
                gka.field_g = gka.field_g + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ara.field_ub = new jea(0L, param8);
            ara.field_ub.field_r = ShooterComponent.field_G;
            era.field_e.b(-128, ara.field_ub);
            stackIn_31_0 = o.e(540800) ? 1 : 0;
          }
          if (stackIn_31_0 != 0 &&
            !fua.field_g) {
            return;
          }
          apa.field_c = new ada(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_42_0 = var12_ref;
          stackIn_42_1 = new StringBuilder().append("mp.D(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param4 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param5 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param8 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param9 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param10 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param11 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          if (param0 != 9) {
            mp.a(13);
          }
          field_a = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.B(" + param0 + ')');
        }
    }

    public mp() {
        this.field_c = new int[16];
    }

    static {
        field_a = new gb();
        field_b = "Add <%0> to ignore list";
    }
}
