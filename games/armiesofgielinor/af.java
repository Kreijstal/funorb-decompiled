/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class af {
    static boolean field_c;
    static String[] field_a;
    static int field_b;

    final static String formatChatPrefix(ChatMessage message, byte obfuscationGuard) {
        String stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        Object var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        Object var3Lifetime1;
        Object var3Lifetime1Lifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = null;
          if (message.displayName != null) {
            var5 = message.displayName;
            var2 = var5;
            var3 = var2;
            var2 = var5;
            var2 = var5;
            if (message.chatIconId == 1) {
              var2 = "<img=0>" + var5;
            }
            if (message.chatIconId == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3Lifetime1 = var2;
              var3Lifetime1Lifetime1 = var2;
            }
          }
          if (obfuscationGuard != 103) {
            field_c = false;
          }
          var3_ref = "";
          if (2 == message.channelId) {
            if (!message.systemMessage) {
              if (0 == message.privateMessageIdHigh16 &&
                message.privateMessageIdLow24 == 0) {
                var3_ref = fo.a(obfuscationGuard + 4697, ta.field_Q, new String[]{(String) (var2)});
              } else {
                var3_ref = fo.a(obfuscationGuard + 4697, ov.field_l, new String[]{(String) (var2)});
              }
            }
          } else {
            if (0 == message.channelId &&
              bq.field_c) {
              var3_ref = "[" + ClientConnectionState.field_c + "] ";
            }
            if (message.channelId == 1) {
              var3_ref = "[" + fo.a(obfuscationGuard + 4697, CampaignMenu.field_m, new String[]{message.channelLabel}) + "] ";
            }
            if (4 == message.channelId &&
              null != TeleportAction.field_C) {
              var3_ref = "[" + TeleportAction.field_C + "] ";
            }
            if (message.channelId == 3) {
              var3_ref = "[#" + message.channelLabel + "] ";
            }
            if (!message.systemMessage) {
              var3_ref = var3_ref + (String) (var2) + ": ";
            }
          }
          stackIn_33_0 = var3_ref;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("af.H(");
          if (message == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) (stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    abstract void a(PacketBuffer param0, int param1);

    public static void b(byte param0) {
        if (param0 >= -95) {
          return;
        }
        field_a = null;
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
          PlatformTaskService stackIn_12_0;
          java.net.URL stackIn_12_1;
          java.net.URL stackIn_12_2;
          java.net.URL stackIn_12_3;
          StringBuilder stackIn_12_4;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          String stackIn_13_5;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          Exception var3 = null;
          String var4 = null;
          PlatformTask var5 = null;
          DataInputStream var6 = null;
          int var7 = 0;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var11 = null;
          var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var3_int = 16 % ((7 - param1) / 62);
            var4 = "";
            if (param0 != null) {
              var4 = MovementPresentation.a(0, param0);
            }
            if (param2 != null) {
              if (param0 != null) {
                var4 = var4 + " | ";
              }
              var4 = var4 + param2;
            }
            FixedQuaternion.a(var4, false);
            var8 = ConsolePanel.replaceText(var4, -75, ":", "%3a");
            var9 = ConsolePanel.replaceText(var8, -110, "@", "%40");
            var10 = ConsolePanel.replaceText(var9, -68, "&", "%26");
            var11 = ConsolePanel.replaceText(var10, -102, "#", "%23");
            if (vu.field_L == null) {
              return;
            }
            stackIn_12_0 = PacketBuffer.field_s;
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_3 = vu.field_L.getCodeBase();
            stackIn_12_4 = new StringBuilder().append("clienterror.ws?c=").append(SummonRequest.field_B).append("&u=");
            if (uk.field_l == null) {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_5 = "" + ck.field_b;
            } else {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_5 = uk.field_l;
            }
            var5 = ((PlatformTaskService) (Object) stackIn_12_0).openUrlStreamAsync(new java.net.URL(stackIn_12_3, ((StringBuilder) (Object) stackIn_12_4).append(stackIn_13_5).append("&v1=").append(PlatformTaskService.javaVendor).append("&v2=").append(PlatformTaskService.javaVersion).append("&e=").append(var11).toString()), false);
            while (var5.status == 0) {
              nu.a(1L, 0);
            }
            if (var5.status != 1) {
              return;
            }
            var6 = (DataInputStream) (var5.result);
            var6.read();
            var6.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract h a(byte param0);

    final static void a(boolean param0, String param1, int param2) {
        try {
          se.field_f = param0;
          ac.field_n = true;
          qc.field_a = new ro(KingBlackDragonEvent.field_C, CipherPacketBuffer.field_t, param1, fh.field_i, se.field_f);
          KingBlackDragonEvent.field_C.a(qc.field_a, param2 ^ param2);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "af.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[]{"BARBARIAN", "AVIANSIE", "GORILLA", "BARBARIANSPEARWOMAN", "DRAGON", "TXHAARKET", "DAGANNOTH", "PORTALMAGE", "PALADIN", "SARADOMINOWL", "MONK", "SARADOMINMAGE", "WHITEKNIGHT", "UNICORN", "CENTAURBOWMAN", "LION", "SARADOMINRANGER", "PRIEST", "ICYENE", "WEREWOLF", "SKELETON", "NECROMANCER", "ZAMORAKMAGE", "BLACKKNIGHT", "BLACKDEMON", "ZAMORAKRANGER", "HELLHOUND", "SEASLUG", "VYREWATCH", "PYRELORD", "TERRORBIRDGNOME", "WOLF", "DRUID", "BLACKGUARDDWARF", "DWARFCANNON", "MOSSGIANT", "VOIDKNIGHT", "TORTOISEGNOME", "GLIDERGNOME", "JADEVINE", "ENT", "FALCON", "BLACKBEAR", "ELFSONGSTRESS", "ELFSHIELDMAIDEN", "GRENWALL", "DIREWOLF", "ELVENPIKEMEN", "ELVENARCHER", "ELFLORD", "ELFLADY", "SHADOWCREATURE", "GOBLIN", "GOBLINHIGHPRIEST", "OGRE", "JOGRE", "MOGRE", "HOBGOBLIN", "OGRESHAMAN", "CYCLOPS", "ORK", "OGRESS", "OURG", "KALPHITEQUEEN", "JACKAL", "MUMMY", "LOCUST", "BEBADINNOMAD", "MENAPHITETHUG", "WARRIOROFICTHLARIN", "CROCODILE", "SCARABITEMAGE", "SPHINX", "ELIDINISELEMENTAL", "KINGBLACKDRAGON", "DWARFCANNON(cannon)", "PORTALMAGE(portal)", "", "", "", "", "BLUEDRAGON", "BARROWS AHRIM", "BARROWS DHAROK", "BARROWS GUTHAN", "BARROWS KARIL", "BARROWS TORAG", "BARROWS VERAC", "ZEMOUREGAL"};
        field_b = 0;
    }
}
