/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int[] field_d;
    static String field_c;
    static SceneWidget field_f;
    static SceneWidget field_e;
    static String field_b;
    static String field_g;
    static String field_h;
    static int field_i;
    static IntrusiveDeque field_a;

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            nk.a((SceneWidget) null, (BitmapFont) null, (VerticalScrollbar) null, (SceneWidget) null, (byte) 7, (SceneWidget) null, (SceneWidget) null, (SceneWidget) null, (SceneWidget) null, true, (SceneWidget) null, (SceneWidget) null);
          }
          field_d = null;
          field_g = null;
          field_h = null;
          field_f = null;
          field_a = null;
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "nk.E(" + param0 + ')');
        }
    }

    final static void a(SceneWidget param0, BitmapFont param1, VerticalScrollbar param2, SceneWidget param3, byte param4, SceneWidget param5, SceneWidget param6, SceneWidget param7, SceneWidget param8, boolean param9, SceneWidget param10, SceneWidget param11) {
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        SceneWidget var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = Pixelate.field_H ? 1 : 0;
        try {
          ib.field_i[4] = 16711935;
          ib.field_i[1] = 6356832;
          ib.field_i[2] = 9474303;
          ib.field_i[3] = 16736511;
          ge.field_f = param9;
          oi.field_e = param6;
          AccountMessagePanel.field_Q = param1;
          ib.field_i[0] = 16764000;
          ib.field_i[4] = 16711935;
          LabeledField.field_P[3] = 16736511;
          LabeledField.field_P[1] = 6356832;
          LabeledField.field_P[2] = 16736352;
          VerticalScrollbar.field_Ib = 8421504;
          LabeledField.field_P[0] = 16764000;
          var12 = new Sprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          ui.field_i = new SceneWidget(0L, param0);
          ki.field_k = new SceneWidget(0L, param3);
          ui.field_i.addChild(ki.field_k, (byte) 26);
          var17 = new SceneWidget(0L, (SceneWidget) null);
          var17.children = new IntrusiveDeque();
          l.field_p = new ScrollContainer(0L, var17, param8, param2);
          ki.field_k.addChild(l.field_p, (byte) 26);
          StripedProgressBar.field_U = new SceneWidget(0L, param5);
          ki.field_k.addChild(StripedProgressBar.field_U, (byte) 26);
          nf.field_d = new SceneWidget(0L, param10);
          nf.field_d.font = AccountMessagePanel.field_Q;
          StripedProgressBar.field_U.addChild(nf.field_d, (byte) 26);
          StripedProgressBar.field_U.h(-257);
          rh.field_y = new SceneWidget(0L, (SceneWidget) null);
          rh.field_y.field_zb = var16;
          if (param4 <= 69) {
            nk.a(-96);
          }
          StripedProgressBar.field_U.addChild(rh.field_y, (byte) 26);
          DelegatingCanvas.field_e = new SceneWidget[5];
          CheckboxPainter.field_n = new SceneWidget[5];
          ResourceArchive.field_f = new SceneWidget[5];
          ResourceArchive.field_h = new SceneWidget[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 != ~var18) {
                if (var18 == 1 &&
                  ge.field_f) {
                  var19 = PairedTextColumns.field_Gb;
                } else {
                  decompiledFrameRemainder0 = (2 == var18);
                  if (decompiledFrameRemainder0) {
                    var19 = mc.field_n;
                  }
                }
              } else {
                if (ge.field_f) {
                  stackIn_30_0 = ul.field_m;
                } else {
                  stackIn_30_0 = em.field_c;
                }
                var19 = stackIn_30_0;
              }
              if (decompiledFrameRemainder0) {
                ResourceArchive.field_f[var18] = new SceneWidget(0L, param11);
                CheckboxPainter.field_n[var18] = new SceneWidget(0L, oi.field_e, var19);
                ResourceArchive.field_h[var18] = new SceneWidget(0L, (SceneWidget) null);
                ResourceArchive.field_h[var18].verticalAlignment = 1;
                DelegatingCanvas.field_e[var18] = new SceneWidget(0L, oi.field_e);
                DelegatingCanvas.field_e[var18].verticalAlignment = 1;
                ResourceArchive.field_f[var18].addChild(CheckboxPainter.field_n[var18], (byte) 26);
                ResourceArchive.field_f[var18].addChild(ResourceArchive.field_h[var18], (byte) 26);
                ResourceArchive.field_f[var18].addChild(DelegatingCanvas.field_e[var18], (byte) 26);
                ResourceArchive.field_f[var18].h(-257);
                ui.field_i.addChild(ResourceArchive.field_f[var18], (byte) 26);
                TextButton.field_F = TextButton.field_F + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            GradientOutlineTextPainter.field_u = new SceneWidget(0L, param7);
            GradientOutlineTextPainter.field_u.field_cb = nd.field_a;
            ui.field_i.addChild(GradientOutlineTextPainter.field_u, (byte) 26);
            stackIn_34_0 = PauseMenuScreen.b(true) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !ln.field_q) {
            return;
          }
          td.field_b = new BirthDateEntryPanel(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_44_0 = var12_ref;
          stackIn_44_1 = new StringBuilder().append("nk.C(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param6 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param7 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param8 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param11 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 16711935) {
            nk.a(true);
          }
          ModalStack.field_J = MusicCrossfadeStream.field_o.readString(5);
          LobbyGame.field_Hb = dh.a((CharSequence) ((Object) ModalStack.field_J), (byte) 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "nk.G(" + param0 + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param1);
          var5 = var4_int;
          do {
            if (param1 <= var5) {
              if (param3 != 16736352) {
                nk.a((StringBuilder) null, 4, 'ﾧ', 43);
              }
              break;
            }
            param0.setCharAt(var5, param2);
            var5++;
          } while (var6 == 0);
          stackIn_11_0 = (StringBuilder) (param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nk.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        cm var2 = null;
        int var3 = 0;
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        cm var2Lifetime1;
        boolean stackIn_22_0Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 93) {
            field_i = -74;
          }
          LinkButtonPainter.field_h = param1;
          var2 = (cm) (bo.field_d.c(param0 ^ 1504642236));
          while (null != var2) {
            stackIn_22_0 = var2.field_k.b(param0 - 93);
            if (var3 != 0) {
              while (true) {
                if (!stackIn_22_0) {
                  var2.unlink(2779);
                }
                var2.field_n.setVolumeQ6(var2.field_p * LinkButtonPainter.field_h + 128 >> 8);
                var2 = (cm) (LoginCredentials.field_b.last(1504642273));
                return;
              }
            }
            if (!stackIn_22_0) {
              var2.unlink(2779);
            }
            if (stackIn_22_0 ||
              var3 != 0) {
              var2.field_n.setVolumeQ6(128 + var2.field_p * LinkButtonPainter.field_h >> 8);
            }
            var2 = (cm) (bo.field_d.last(param0 + 1504642180));
            if (var3 == 0) {
              continue;
            }
            break;
          }
          if (LoginCredentials.field_b != null) {
            var2Lifetime1 = (cm) (LoginCredentials.field_b.c(1504642273));
            while (null != var2Lifetime1) {
              if (var3 != 0) {
                return;
              }
              stackIn_22_0Lifetime1 = var2Lifetime1.field_k.b(0);
              if (!stackIn_22_0Lifetime1) {
                var2Lifetime1.unlink(2779);
              } else {
                var2Lifetime1.field_n.setVolumeQ6(var2Lifetime1.field_p * LinkButtonPainter.field_h + 128 >> 8);
              }
              var2Lifetime1 = (cm) (LoginCredentials.field_b.last(1504642273));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2_ref), "nk.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        try {
          an.field_e.a(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "nk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        try {
          Checkbox.field_Q = param0;
          DisplayNameForm.field_L = param1;
          if (param2 != 5818) {
            field_a = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "nk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Players";
        field_g = "Breaking real-world laws";
        field_h = "Offensive account name";
        field_i = 0;
    }
}
