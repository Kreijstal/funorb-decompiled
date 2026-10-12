/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GlobalSpell extends Spell {
    static String field_k;
    static ClientUiComponent field_f;
    static int field_h;
    static String field_n;
    static String field_i;
    static String[] field_l;
    static String field_j;
    static String field_e;
    static String field_m;
    static int field_g;

    final int getPayloadSize(int obfuscationGuard) {
        if (obfuscationGuard != 25365) {
          field_j = (String) null;
          return 2;
        }
        return 2;
    }

    GlobalSpell(int spellId) {
        super(spellId);
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_h = -8;
          return ed.a(-111);
        }
        return ed.a(-111);
    }

    final void finishEffect(Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -1700635440) {
            field_m = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "al.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void writePayload(int obfuscationGuard, PacketBuffer packet) {
        try {
          packet.writeShort(true, this.spellId);
          if (obfuscationGuard != -11637) {
            this.getPayloadSize(-111);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "al.E(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final void applyEffect(int castingPlayer, Battlefield battlefield, int obfuscationGuard) {
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.spellDefinitions[this.spellId][5] == 1) {
            battlefield.b(uc.spellDefinitions[this.spellId][6], castingPlayer, 1, (byte) 92);
          }
          if (uc.spellDefinitions[this.spellId][5] == 0) {
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ManaEvent(4, uc.spellDefinitions[this.spellId][6], castingPlayer)));
          }
          if (uc.spellDefinitions[this.spellId][5] == 2) {
            battlefield.kingBlackDragonSummoned = false;
          }
          if (obfuscationGuard == 26123) {
            return;
          }
          GlobalSpell.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("al.A(").append(castingPlayer).append(',');
          if (battlefield == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        CampaignProgress.a(2000, param1);
        if (param0 >= -21) {
          GlobalSpell.a(-83, true);
          da.a(-10820, param1);
          return;
        }
        da.a(-10820, param1);
    }

    final void prepareEffect(byte obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != -37) {
            Battlefield var4 = (Battlefield) null;
            this.applyEffect(-41, (Battlefield) null, -67);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "al.D(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_e = null;
        field_l = null;
        field_n = null;
        field_m = null;
        field_j = null;
        if (param0 == 103) {
          field_k = null;
          field_f = null;
          return;
        }
        field_f = (ClientUiComponent) null;
        field_k = null;
        field_f = null;
    }

    static {
        field_k = "This ground cannot be captured";
        field_h = 0;
        field_i = "This item can only be used on an ogre shaman.";
        field_e = "This structure belongs to you";
        field_j = "You must play <%1> more rated games before playing with the current options.";
        field_l = new String[]{"Neutral units are either godless or once followed other, now long-departed, gods, and can be commanded in the name of any god.", "Saradomin is the god of lawfulness and goodness in all its forms. His followers are the purest of creatures.", "Zamorak is the Mahjarrat-god of chaos, followed by all kinds of wicked, viscious men and beasts.", "Guthix is the nature god of balance, shaper of Gielinor. His followers are druids and the flora and fauna of the world.", "Seren is the crystalline goddess of elfkind and one of the first gods to bring her followers to Gielinor.", "Bandos is the god of war, leader of orks, goblins, ogres and the like. He likes to fight for the fun of it.", "The Menaphite pantheon consists of the gods Tumeken, Elidinis, Icthlarin, Amascut the Devourer, Het, Apmeken, Crondis and Scabaras."};
        field_m = "Close";
    }
}
