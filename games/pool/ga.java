/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga extends TextInputWidget implements ValidationProviderSource {
    private ValidationProvider field_ab;
    private int field_bb;

    final void notifyTextInputChanged(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          super.notifyTextInputChanged(-74);
          var2_int = 101 % ((28 - param0) / 49);
          if (null != this.field_ab) {
            this.field_ab.resetValidationDelay(11755);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.N(" + param0 + ')');
        }
    }

    final void a(byte param0, ValidationProvider param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ab = param1;
          if (param0 != -111) {
            ga.n(-52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ga.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String getHoverText(int param0) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        String stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.pointerInside &&
            null != this.hoverText) {
            if (param0 > -10) {
              this.getHoverText(39);
            }
            te.a((byte) -39, DebouncedValidationProvider.field_f, wn.field_i - this.field_bb + this.widgetWidth);
            stackIn_10_0 = this.hoverText;
            return stackIn_10_0;
          }
          stackIn_5_0 = null;
          return (String) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ga.L(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        try {
          OptionsScreen.f(-1);
          DualLinkDeque.field_c = true;
          ro.field_e = true;
          TabbedPane.field_Ub.hideAllDialogs(-22216);
          wf.a(param0, na.connectionlostReconnecting, -127);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.LA(" + param0 + ')');
        }
    }

    final static void n(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialListEntry var6 = null;
        String var7 = null;
        SocialListEntry var7_ref = null;
        String var8 = null;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        SocialListEntry var6Lifetime1;
        try {
          var1 = PlayerContextMenu.field_e;
          var2 = var1.readUnsignedByte(-125);
          if (var2 == 0) {
            if (gd.field_c == null) {
              gd.field_c = new DualLinkNodeHashTable(128);
              TextHotspotRegion.field_t = 0;
            }
            stackIn_10_0 = (1 != var1.readUnsignedByte(-91)) ? 0 : 1;
            var3_int = stackIn_10_0;
            var4_ref_String = var1.j(param0 - 29836);
            if (var3_int != 0) {
              var5 = var1.j(-70);
            } else {
              var5 = var4_ref_String;
            }
            var6 = CheckboxPainter.a(var4_ref_String, 1);
            var7 = var1.j(-17);
            var8 = TutorialController.normalizeDisplayName(117, (CharSequence) ((Object) var4_ref_String));
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = CheckboxPainter.a(var7, 1);
              if (var6 != null) {
                gd.field_c.put(-6946, (long)var8.hashCode(), var6);
              }
            }
            if (null == var6) {
              var6 = new SocialListEntry();
              gd.field_c.put(param0 ^ -28521, (long)var8.hashCode(), var6);
              fieldTemp$0 = TextHotspotRegion.field_t;
              TextHotspotRegion.field_t = TextHotspotRegion.field_t + 1;
              var6.insertionIndex = fieldTemp$0;
              jq.field_c.b((byte) -31, var6);
            }
            var6.actionName = var5;
            var6.previousName = var7;
            var6.name = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (th.field_a == 1) {
                th.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (th.field_a == 2) {
                th.field_a = 1;
              }
              return;
            }
            if (param0 != 29769) {
              ga.a((int[]) null, (int[]) null, true);
            }
            if (var2 != 4) {
              GrowableIntList.reportClientError((Throwable) null, "F1: " + t.formatPacketDump(93), param0 ^ -21796);
              dn.c(99);
              return;
            }
            th.field_a = 1;
            var3 = var1.j(-118);
            LocalGameSetupScreen.field_J = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(-84);
            DialRenderer.a((byte) 78, var4);
            return;
          }
          if (AimTarget.field_b == null) {
            AimTarget.field_b = new DualLinkNodeHashTable(128);
            AccountWelcomePanel.field_S = 0;
          }
          var3Lifetime1 = var1.j(-101);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.j(-70);
          var5Lifetime1 = var1.j(-54);
          var6Lifetime1 = gf.a(param0 - 29667, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = gf.a(92, var5Lifetime1);
            if (null != var6Lifetime1) {
              AimTarget.field_b.put(-6946, (long)TutorialController.normalizeDisplayName(123, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new SocialListEntry();
            AimTarget.field_b.put(-6946, (long)TutorialController.normalizeDisplayName(param0 ^ 29715, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            fieldTemp$1 = AccountWelcomePanel.field_S;
            AccountWelcomePanel.field_S = AccountWelcomePanel.field_S + 1;
            var6Lifetime1.insertionIndex = fieldTemp$1;
            SoundCache.field_k.b((byte) -24, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.serverName = (String) (var3Lifetime1);
          var6Lifetime1.name = var4_ref_StringLifetime1;
          var6Lifetime1.previousName = var5Lifetime1;
          var6Lifetime1.unlink((byte) -117);
          var7_ref = (SocialListEntry) (SoundCache.field_k.c((byte) -125));
          while (var7_ref != null) {
            if (MessageDialogContent.a(var6Lifetime1, var7_ref, 83)) {
              var7_ref = (SocialListEntry) (SoundCache.field_k.f((byte) -5));
              continue;
            }
            break;
          }
          if (var7_ref == null) {
            SoundCache.field_k.b((byte) 85, var6Lifetime1);
          } else {
            TextLineLayout.insertAfter(var6Lifetime1, (byte) -119, var7_ref);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ga.RA(" + param0 + ')');
        }
    }

    final static int nextRandomInt(int param0, boolean param1, Random param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            stackIn_2_0 = -110;
            return stackIn_2_0;
          }
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (MouseHandler.a(param0, -90)) {
            stackIn_10_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param0 >> 32);
            return stackIn_10_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_16_0 = NameEntryPopup.a(true, param0, var4);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ga.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final ValidationProvider getValidationProvider(int param0) {
        ValidationProvider stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -80 / ((param0 - 33) / 34);
          stackIn_1_0 = this.field_ab;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ga.KA(" + param0 + ')');
        }
    }

    ga(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          param1[1] = param1[1] - param0[1];
          param1[0] = param1[0] - param0[0];
          param1[2] = param1[2] - param0[2];
          var3_int = param1[1] * param0[4] + param0[3] * param1[0] + param1[2] * param0[5] >> 7;
          var4 = param0[7] * param1[1] + (param1[0] * param0[6] + param1[2] * param0[8]) >> 7;
          param1[2] = param0[10] * param1[1] + (param0[9] * param1[0] + param0[11] * param1[2]) >> 16;
          if (param1[2] == 0) {
            param1[2] = -1;
          }
          param1[0] = TriangleRasterizer.projectionCenterX + var3_int / param1[2];
          param1[1] = var4 / param1[2] + TriangleRasterizer.projectionCenterY;
          if (param2) {
            ga.m(-17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ga.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updatePointerState(param0, param1 + 0, param2, param3);
          if (param1 != 958) {
            return;
          }
          this.field_bb = wn.field_i - (this.widgetX + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ga.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void m(int param0) {
        jc.field_e = new Quaternion(ga.nextRandomInt(262144, true, ea.field_r) - 131072, -131072 + ga.nextRandomInt(262144, true, ea.field_r), -131072 + ga.nextRandomInt(262144, true, ea.field_r), -131072 + ga.nextRandomInt(262144, true, ea.field_r));
        jc.field_e.normalise(true);
        LoginPayloadKind.field_a = dq.field_a;
        if (LoginPayloadKind.field_a == null) {
          LoginPayloadKind.field_a = PoolGameModel.field_B[0];
        }
        vn.field_e = ga.nextRandomInt(LoginPayloadKind.field_a.b(param0 + 23883), true, ea.field_r);
        tp.field_h[1] = 0;
        tp.field_h[0] = -140;
        CushionSegment.field_i = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        if (param0 != -23499) {
          return;
        }
        try {
          tp.field_h[2] = 128;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ga.PA(" + param0 + ')');
        }
    }

    static {
    }
}
