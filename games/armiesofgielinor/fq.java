/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fq {
    int field_m;
    int field_e;
    int field_b;
    int field_j;
    byte[] field_l;
    int field_d;
    static String field_a;
    static fa field_h;
    int field_i;
    static String[] field_f;
    byte[] field_g;
    static String field_k;
    int field_c;

    final static uv a(int param0) {
        if (param0 != 18757) {
          fq.a((byte) 23, -125L);
          return AnimationSkeleton.field_n;
        }
        return AnimationSkeleton.field_n;
    }

    public static void a(byte param0) {
        if (param0 >= 84) {
          field_k = null;
          field_h = null;
          field_f = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        fq.requestRemoveIgnoredAccount(-122, (String) null, true, (String) null);
        field_k = null;
        field_h = null;
        field_f = null;
        field_a = null;
    }

    final static void a(NodeDeque param0, String param1, int param2, boolean param3) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        sq var9 = null;
        int var10 = 0;
        String[] var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = rs.field_n.a(param1) + 8;
          if (var4_int <= 200) {
            var5 = new String[]{param1};
          } else {
            var11 = new String[rs.field_n.c(param1, 196)];
            var5 = var11;
            rs.field_n.a(param1, new int[]{196}, var11);
          }
          var6 = var5;
          for (var7 = param2; var6.length > var7; var7++) {
            var8 = var6[var7];
            var9 = new sq(var8, param3, param0);
            param0.addLast((byte) -119, (IntrusiveNode) (var9));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fq.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(byte param0, long param1) {
        int var8 = 0;
        int var9 = 0;
        PopupPresentation.field_c.setTime(new Date(param1));
        int var3 = PopupPresentation.field_c.get(7);
        int var4 = PopupPresentation.field_c.get(5);
        int var5 = PopupPresentation.field_c.get(2);
        int var6 = PopupPresentation.field_c.get(1);
        int var7 = PopupPresentation.field_c.get(11);
        if (param0 == -82) {
          var8 = PopupPresentation.field_c.get(12);
          var9 = PopupPresentation.field_c.get(13);
          return so.field_c[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + gi.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    final static vg a(int param0, int param1) {
        vg var2 = null;
        vg var2Lifetime1;
        if (param0 == 14663) {
          var2 = new vg();
          oe.field_Bb.addLast((byte) -119, (IntrusiveNode) (var2));
          tq.a(param1, 0);
          return var2;
        }
        fq.a((byte) -111, -125L);
        var2Lifetime1 = new vg();
        oe.field_Bb.addLast((byte) -119, (IntrusiveNode) (var2Lifetime1));
        tq.a(param1, 0);
        return var2Lifetime1;
    }

    final static String requestRemoveIgnoredAccount(int packetOpcode, String displayName, boolean obfuscationGuard, String accountName) {
        RuntimeException var4 = null;
        CipherPacketBuffer packet = null;
        int payloadStart = 0;
        SocialListEntry ignoredAccount = null;
        CharSequence accountNameCharacters = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          accountNameCharacters = (CharSequence) ((Object) accountName);
          if (!hg.isValidSocialTargetName((byte) -113, accountNameCharacters)) {
            stackIn_3_0 = SectorCacheStore.field_d;
            return stackIn_3_0;
          }
          if (th.socialListState != 2) {
            stackIn_6_0 = EffectPresentation.field_a;
            return stackIn_6_0;
          }
          ignoredAccount = db.findIgnoredAccount(displayName, -122);
          if (ignoredAccount == null) {
            stackIn_10_0 = fo.a(4800, CacheEntry.field_x, new String[]{displayName});
            return stackIn_10_0;
          }
          ignoredAccount.unlink(-124);
          ignoredAccount.unlinkSecondary((byte) -76);
          vg.ignoreCount = vg.ignoreCount - 1;
          packet = vl.outgoingPacket;
          packet.writeCipheredOpcode(32161, packetOpcode);
          packet.position = packet.position + 1;
          payloadStart = packet.position;
          packet.writeByte(1, 3);
          if (obfuscationGuard) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          packet.b(accountName, 13851);
          packet.writeByteLengthPrefix(packet.position - payloadStart, 5930);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("fq.B(").append(packetOpcode).append(',');
          if (displayName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(',');
          if (accountName == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        NodeIterator.field_a = false;
        vi.field_d = ByteStorage.incomingPacket.readUnsignedByte(0) == 0 ? true : false;
        if (param0 < 70) {
          field_h = (fa) null;
          return;
        }
    }

    static {
        field_f = new String[]{"Magical Bolt", "Magical Blast", "Magical Rush", "Magical Wave", "Magical Burst", "Magical Blitz", "Magical Barrage", "Mana Rush", "Mana Wave", "Mana Burst", "Mana Blitz", "Mana Barrage", "Waders", "Strength XS", "Strength S", "Strength M", "Strength L", "Strength XL", "Weakness XS", "Weakness S", "Weakness M", "Weakness L", "Weakness XL", "Raise Soldier", "Raise Army", "Spiritual Shield", "Spiritual Barrier", "Revolt", "Grappling hook", "Clone 1", "Clone 2", "Clone 3", "Clone 4", "Clone 5", "Tele-shift", "Teleport", "Mind Warp", "Shrine of Saradomin", "Shrine of Zamorak", "Shrine of Guthix", "Shrine of Seren", "Shrine of Bandos", "Shrine of Menaphos", "Fortify", "Bridger", "Draconic Chant", "Rejuvenate", "Fireball", "Large fireball", "Fire Shower", "Greater Fire Shower", "Fire Rain", "Greater Fire Rain", "Firestorm", "Healing Spark", "Healing Ray", "Healing Beam", "Healing Wave", "Healing Light", "Healing Glare", "Healing Blaze", "Healing Glow", "Greater Healing Glow", "Healing Aura", "Greater Healing Aura", "Healing Radiance", "Greater Healing Radiance ", "Healing Brilliance", "Poison", "Ring of life", "Iron plate armour", "Steel plate armour", "Mithril plate armour", "Adamant plate armour", "Leather armour", "Hard leather armour", "Studded leather armour", "Snakeskin armour", "Wizard robes", "Mystic robes", "Enchanted robes", "Infinity robes", "Light dragonhide armour", "Medium dragonhide armour", "Heavy dragonhide armour", "Winged dragonhide armour", "Chain rune armour", "Plate rune armour", "Trimmed rune armour", "Blessed rune armour", "Murky armour", "Shrouded armour", "Gloomy armour", "Shadow armour", "Defender", "Longsword", "Two-handed sword", "Hunting arrows", "Steel arrows", "Brutal arrows", "Wizard hat", "Mystic hat", "Enchanted hat", "Stone armour", "Granite armour", "Poisoned blade", "Poisoned arrows", "Scabarite hat", "Flag", "Speed Boost", "Boots of Elidinis", "Forestation", "Quagmire", "Flood", "Earthquake", "Egg sac", "Charcoal", "Pharmakos berries", "Eye drops", "Crystal lozenge", "Vampyric blood", "Bind", "Snare", "Entangle", "Longbow", "Infinity hat", "Swamp tar", "Bitumen", "Potassium", "Magnesium", "Sulphur", "Pointed talons", "Sharpened talons", "Razored talons", "Poisoned talons"};
        field_a = "Mastery";
        field_k = "Player Name: ";
    }
}
