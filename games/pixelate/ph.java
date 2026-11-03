/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph extends IntrusiveNode {
    static LoginDialog field_l;
    static String field_m;
    int field_k;
    static Sprite field_n;
    static int field_o;

    final static int e(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (Match.field_h.field_h >= 4) {
            if (Match.field_h.field_m == -1) {
              return 3;
            }
            if (-2 != Match.field_h.field_m) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == AchievementsScreen.field_q) {
              KiteBackground.field_o = ef.field_e.a(20278, bl.field_e, ArchiveIndex.field_s);
              AchievementsScreen.field_q = AchievementsScreen.field_q + 1;
            }
            if (1 == AchievementsScreen.field_q) {
              if (KiteBackground.field_o.field_b == 2) {
                stackIn_14_0 = ce.a((byte) -124, -1);
                return stackIn_14_0;
              }
              if (KiteBackground.field_o.field_b == 1) {
                AchievementsScreen.field_q = AchievementsScreen.field_q + 1;
              }
            }
            if (AchievementsScreen.field_q == 2) {
              ConditionalTextValue.field_d = new BufferedSocket((java.net.Socket) (KiteBackground.field_o.field_e), ef.field_e);
              var2 = new PacketBuffer(13);
              FallingPieceView.a(GreenGrowTheRushesBackground.field_o, (byte) 66, SceneWidget.field_ib, var2, AcidSunsetBackground.field_n);
              var2.writeByte(160, 15);
              var2.writeInt(fj.field_a, -76);
              ConditionalTextValue.field_d.write(13, -103, 0, var2.payload);
              AchievementsScreen.field_q = AchievementsScreen.field_q + 1;
              ViewportController.field_a = 30000L + hm.a(64);
            }
            if (AchievementsScreen.field_q == 3) {
              if (ConditionalTextValue.field_d.a(-120) <= 0) {
                if (ViewportController.field_a < hm.a(64)) {
                  stackIn_30_0 = ce.a((byte) -124, -2);
                  return stackIn_30_0;
                }
              } else {
                var1_int = ConditionalTextValue.field_d.c((byte) -81);
                if (0 != var1_int) {
                  stackIn_26_0 = ce.a((byte) -124, var1_int);
                  return stackIn_26_0;
                }
                AchievementsScreen.field_q = AchievementsScreen.field_q + 1;
              }
            }
            if (param0 != 25960) {
              stackIn_33_0 = -28;
              return stackIn_33_0;
            }
            if (AchievementsScreen.field_q != 4) {
              return -1;
            }
            Match.field_h.attachTransport(ConditionalTextValue.field_d, ModalStack.field_L, 8);
            ConditionalTextValue.field_d = null;
            KiteBackground.field_o = null;
            AchievementsScreen.field_q = 0;
            stackIn_37_0 = 0;
            return stackIn_37_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ce.a((byte) -124, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 < 104) {
          return;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(ResourceArchive param0, byte param1) {
        RuntimeException var2 = null;
        SceneWidget var3 = null;
        SceneWidget var5 = null;
        SceneWidget var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dk.field_e = bi.a("basic", "display_name_changed", param0, (byte) -25);
          ScoreMarkerBar.field_z = new ScrollPaneWithFooter(0L, rm.field_a, SceneWidgetNode.field_u, OptionsScreen.field_q);
          MouseWheelHandler.field_e = new ScrollPaneWithFooter(0L, rm.field_a, qh.field_e, NanoTickClock.field_n);
          wa.field_f = new SceneWidget(0L, (SceneWidget) null);
          SceneWidget.field_E = new SceneWidget(0L, TextFieldValidator.field_h);
          SceneWidget.field_E.horizontalAlignment = 1;
          EmailConfirmationValidator.field_u = new SceneWidget(0L, QuickChatPhraseCache.field_l, qn.field_m);
          Vector3.field_e = new SceneWidget(0L, ni.field_s, ScrollContainer.field_Jb);
          sk.field_e = new SceneWidget(0L, dn.field_c);
          wa.field_f.addChild(SceneWidget.field_E, (byte) 26);
          wa.field_f.addChild(EmailConfirmationValidator.field_u, (byte) 26);
          wa.field_f.addChild(Vector3.field_e, (byte) 26);
          wa.field_f.addChild(ScoreMarkerBar.field_z, (byte) 26);
          wa.field_f.addChild(sk.field_e, (byte) 26);
          ScoreMarkerBar.field_z.field_Gb.field_Ib.applyStyle(param1 ^ 27853, TextFieldValidator.field_h);
          ScoreMarkerBar.field_z.field_Gb.field_Ib.verticalAlignment = 1;
          var5 = ScoreMarkerBar.field_z.field_Gb.field_Ib;
          var6 = var5;
          var6.horizontalAlignment = 1;
          MouseWheelHandler.field_e.field_Gb.field_Ib.applyStyle(param1 ^ 27853, TextFieldValidator.field_h);
          MouseWheelHandler.field_e.field_Gb.field_Ib.verticalAlignment = 1;
          var3 = MouseWheelHandler.field_e.field_Gb.field_Ib;
          var3.horizontalAlignment = 1;
          if (param1 == -106) {
            return;
          }
          ph.releaseStatics(-30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("ph.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    ph(int param0) {
        this.field_k = param0;
    }

    static {
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
