/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_c;
    static CampaignDefinition[] campaigns;
    static String field_e;
    static String field_b;
    static String field_d;

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        vg var3_ref_vg = null;
        li var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        CipherPacketBuffer var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 > -17) {
            field_c = -14;
          }
          var8 = ByteStorage.incomingPacket;
          var2 = var8.readUnsignedByte(0);
          if (var2 != 0) {
            if (var2 != 1) {
              af.a((Throwable) null, 76, "A1: " + CampaignProgress.b(false));
              dj.a((byte) -128);
              return;
            }
            var3 = var8.readInt(1);
            var4 = (li) (s.field_e.first((byte) 92));
            while (var4 != null) {
              if (var4.field_o != var3) {
                var4 = (li) (s.field_e.next((byte) 123));
                continue;
              }
              break;
            }
            if (var4 == null) {
              dj.a((byte) -125);
              return;
            }
            var4.unlink(-102);
            return;
          }
          var3_ref_vg = (vg) (oe.field_Bb.first((byte) 98));
          if (var3_ref_vg == null) {
            dj.a((byte) -126);
            return;
          }
          var4_int = var8.readUnsignedByte(0);
          if (var4_int != 0) {
            var10 = new byte[var4_int];
            var9 = var10;
            var7 = var9;
            var5 = var7;
            var8.readBytes(0, var4_int, 0, var10);
          } else {
            var5 = null;
          }
          var8.position = var8.position + 4;
          if (!var8.j(4215)) {
            dj.a((byte) -126);
            return;
          }
          var3_ref_vg.field_n = true;
          var3_ref_vg.field_s = (byte[]) (var5);
          var3_ref_vg.unlink(29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "cd.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        gp.field_e = null;
        if (param0 != 12) {
          field_b = (String) null;
          BattleCharacter.field_g = null;
          return;
        }
        BattleCharacter.field_g = null;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          campaigns = (CampaignDefinition[]) null;
          if (rs.field_q == 13) {
            DelayedPacket.e(-3);
            return true;
          }
          if (rs.field_q == 102) {
            qd.activeQuickChatMenu.resetSelection((byte) -106);
            return true;
          }
          if (qd.activeQuickChatMenu == null) {
            return false;
          }
          if (qd.activeQuickChatMenu.handleKeyboard(param2, param0, param1)) {
            return true;
          }
          return false;
        }
        if (rs.field_q == 13) {
          DelayedPacket.e(-3);
          return true;
        }
        if (rs.field_q == 102) {
          qd.activeQuickChatMenu.resetSelection((byte) -106);
          return true;
        }
        if (qd.activeQuickChatMenu == null) {
          return false;
        }
        if (qd.activeQuickChatMenu.handleKeyboard(param2, param0, param1)) {
          return true;
        }
        return false;
    }

    final static boolean c(int param0) {
        if (param0 != 9501) {
          field_d = (String) null;
          if (SphinxActionRequest.field_v == null) {
            return false;
          }
          if (null != SphinxActionRequest.field_v.a((byte) 89)) {
            return true;
          }
          return false;
        }
        if (SphinxActionRequest.field_v == null) {
          return false;
        }
        if (null != SphinxActionRequest.field_v.a((byte) 89)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        BattleCharacter.field_h[uc.spellDefinitions[param0][param3]].h(48 + param1, param2 + 12);
        km.field_h[0].h(param1 + 46, param2 + 10);
    }

    public static void a(boolean param0) {
        campaigns = null;
        field_b = null;
        if (!param0) {
          field_e = null;
          field_d = null;
          return;
        }
        field_d = (String) null;
        field_e = null;
        field_d = null;
    }

    static {
        field_c = 2;
        campaigns = new CampaignDefinition[3];
        field_b = "You have declined the invitation.";
        field_d = "Off";
    }
}
