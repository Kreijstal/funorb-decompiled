/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends mg {
    private java.nio.ByteBuffer field_p;
    static sa field_m;
    static sa field_o;
    static String field_l;
    static int field_h;
    static int[] field_k;
    static String[] field_n;
    static String field_i;
    static String[] field_j;

    public static void c() {
        field_o = null;
        field_n = null;
        field_j = null;
        field_i = null;
        field_m = null;
        field_l = null;
        field_k = null;
    }

    final void a(byte param0, byte[] param1) {
        try {
            ((cj) this).field_p = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$6 = ((cj) this).field_p.position(0);
            if (param0 != 126) {
                field_o = null;
            }
            java.nio.ByteBuffer discarded$7 = ((cj) this).field_p.put(param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var3 = new byte[((cj) this).field_p.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = ((cj) this).field_p.position(param0);
        java.nio.ByteBuffer discarded$1 = ((cj) this).field_p.get(var3);
        return var3;
    }

    cj() {
    }

    final static int[] a(int param0, int param1, int param2) {
        int var11 = 0;
        int var12 = 0;
        int var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var5 = 34 % ((76 - param2) / 50);
        int var4 = 255 & param1 >> 16;
        int var6 = 255 & param1 >> 8;
        int var7 = param1 & 255;
        int var8 = (16746397 & param0) >> 16;
        int var9 = 255 & param0 >> 8;
        int var10 = 255 & param0;
        for (var11 = 0; var11 < 256; var11++) {
            var12 = 256 + -var11;
            var14[var11] = ((var8 * var12 >> 8) + (var4 * var11 >> 8) << 16) + (((var11 * var6 >> 8) - -(var12 * var9 >> 8) << 8) + (var12 * var10 >> 8)) + (var11 * var7 >> 8);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new sa();
        field_o = new sa();
        field_h = 1;
        field_l = "<%0> might change the options - wait and see.";
        field_i = "<%0> has been removed.";
        field_n = new String[]{"Adjacent units are healed by 3 points and cured of poison. Buries bones to increase maximum strength", "Adjacent units are strengthened by 5 points (which diminishes by 1 per turn) and are cured of poison", "Adjacent bones are raised into skeletons; adjacent skeletons are fully healed", "Confuses enemies within 2 tiles, eliminating the defensive qualities of the ground on which they stand", "Paralyses enemies within 2 tiles, leaving them unable to move or attack", "Morale boosts allies within 2 tiles, making them equally effective against all unit classes in battle", "Poisonous attack, poisoned units lose one health point per turn until they die or are healed by structures or other units", "Teleports within 8 tiles, taking 1 turn, killing anything it lands on", "Spreads over 1 tile instead of moving. Upkeep cost of 10 Mana per turn, per tile", "Takes over a single enemy ground unit if the sea slug is at least as strong as the target", "Can attack flying units", "Has a long-range attack", "A single step onto a mountain tile will level the mountain, making it open terrain", "Burns down any forest it moves onto, converting it to open ground.", "Plants a forest on any open ground tile over which it moves", "When walks onto open ground from a river or the sea, the tiles walked over will become a river", "Generates cloud of obscuring smoke, preventing ranged attacks in", "Is surrounded by movement-inhibiting kalphites", "Health -1 at the start of each turn", "Captures structures using current strength<br>(higher strength equals faster capture)", "This unit is not slowed down when moving through swamps or rivers and may cross seas", "This unit is not slowed down when moving through swamps or rivers, may cross seas, and can attack flying units", "Adjacent units are healed by 3 points and cured of poison"};
    }
}
