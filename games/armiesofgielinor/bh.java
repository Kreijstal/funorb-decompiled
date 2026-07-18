/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    static String field_J;
    static String field_L;
    static String[] field_M;
    static String field_I;
    static kl field_H;
    int field_K;

    final static String a(int param0, byte param1) {
        String var2 = "old time: " + wf.field_v;
        wf.field_v = param0;
        return var2;
    }

    public static void c() {
        field_H = null;
        field_M = null;
        field_J = null;
        field_I = null;
        field_L = null;
    }

    public bh() {
        super(0, 0, 0, 0, (kh) null, (qo) null);
        ((bh) this).field_K = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(((bh) this).field_E != null)) {
            return;
        }
        if (!(((bh) this).field_K != 0)) {
            return;
        }
        if (!(((bh) this).field_K != 256)) {
            ((bh) this).field_E.a(((bh) this).field_B + param0, param1 - -((bh) this).field_p, (byte) -125, param3);
            return;
        }
        wk var5 = new wk(((bh) this).field_E.field_l, ((bh) this).field_E.field_w);
        if (param2 >= -82) {
            field_M = null;
            int discarded$0 = 3;
            vn.a(var5);
            ((bh) this).field_E.a(0, 0, (byte) -86, param3);
            rf.b(-18862);
            var5.e(((bh) this).field_B + param0, param1 - -((bh) this).field_p, ((bh) this).field_K);
            return;
        }
        int discarded$1 = 3;
        vn.a(var5);
        ((bh) this).field_E.a(0, 0, (byte) -86, param3);
        rf.b(-18862);
        var5.e(((bh) this).field_B + param0, param1 - -((bh) this).field_p, ((bh) this).field_K);
    }

    bh(kb param0) {
        super(param0.field_B, param0.field_p, param0.field_l, param0.field_w, (kh) null, (qo) null);
        try {
            param0.a(0, ((bh) this).field_l, 0, 8192, ((bh) this).field_w);
            ((bh) this).field_K = 256;
            ((bh) this).field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d() {
        int var1 = (tq.field_c + -640) / 2;
        int var2 = mj.field_c * mj.field_c;
        int var3 = -(gk.field_J * gk.field_J) + var2;
        no.field_T.a(-4 + (qn.field_g + -120) - 90, -20500, 199, 90, var1 + -(var3 * 199 / var2));
        ov.field_i.a(-4 + (qn.field_g - 120), -20500, 438, 0, var3 * 438 / var2 + 202 + var1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Login: ";
        field_I = "<%0> cannot join; the game has started.";
        field_L = "Spells to revive and rejuvenate your weary forces.";
        field_M = new String[]{"A unit that can capture structures.", null, null, "A unit that can capture structures.", "Flying, fire-breathing ranged unit.", null, "An amphibious, air-intercepting warrior.", "Opens a single portal for a single god's forces at a chosen location.", null, null, "Heals adjacent units by 3 points and cures poisoned units. Buries bones on his current map square, which increases the monk's maximum health by 1 point.", null, null, null, null, null, null, "Heals adjacent units by 3 points and cures poisoned units. Deploys a single spiritual barrier at a chosen location, which protects friendly units within.", "A flying unit with long-range throwing axes.", null, "Undead skirmish unit that slowly rots away.", "Raises the bones of the dead on adjacent map tiles into skeleton warriors; adjacent skeletons are healed fully.", null, null, null, null, null, "An amphibious parasitic creature that sacrifices itself in an attack to gain control of one enemy unit with strength equal or lower to its own.", "A flying demon with a long-range rock throwing attack.", "Burns down any forest it moves onto, converting it to open ground.", null, null, "Increases the combat strength of adjacent units by 5 points (which diminishes by 1 per turn) and cures poisoned units.", null, "A troop of engineers who will build a single, powerful cannon on a designated map tile.", null, null, null, null, "Can be commanded to grow onto adjacent open ground tiles, blocking them. Each tile containing a jade vine costs 10 Mana per turn. It can be commanded to whither and die.", "Plants a forest on any open ground tile onto which it moves.", null, null, "Allies within two map tiles of her song become equally effective in combat against all unit classes.", null, null, null, null, null, null, null, "Can burrow onto a map tile occupied by an enemy unit, killing that unit in the process.", null, "Confuses all enemy units within two map tiles, removing the defensive qualities of the ground on which they stand.", null, null, "An amphibious ogre.", "A warrior capable of intercepting flying units.", "A shaman who conjures a cloud of smoke that prevents ranged attacks on units within it.", "Enemy units within two map tiles are paralysed with fear and are unable to move.", null, null, "When moved a distance of one map tile onto a mountain, it destroys the mountain, converting it to open ground.", "Surrounded by insects that inhibit the movement of units crossing them.", null, "A tough, walking, rotting, poisonous corpse.", "A flying, poisonous insect.", null, null, null, "An amphibious warrior-beast.", "A mage with poisoning magic.", "A beast that can invade an adjacent unit's mind, giving you control of it.", "When moved a distance of one map tile from river/sea onto open ground, it converts the open ground to a river.", "The strongest of all dragons, who is only available to the first player to bring him to the fight. Lethal!", null, null, null, null, null, null, "Flying, fire-breathing ranged unit."};
    }
}
