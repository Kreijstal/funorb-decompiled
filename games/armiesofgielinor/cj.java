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

    public static void c(int param0) {
        field_o = null;
        field_n = null;
        field_j = null;
        if (param0 != 1) {
          field_l = (String) null;
          field_i = null;
          field_m = null;
          field_l = null;
          field_k = null;
          return;
        } else {
          field_i = null;
          field_m = null;
          field_l = null;
          field_k = null;
          return;
        }
    }

    final void a(byte param0, byte[] param1) {
        java.nio.Buffer discarded$6 = null;
        java.nio.ByteBuffer discarded$7 = null;
        try {
            this.field_p = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$6 = this.field_p.position(0);
            if (param0 != 126) {
                field_o = (sa) null;
            }
            discarded$7 = this.field_p.put(param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var3 = new byte[this.field_p.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = this.field_p.position(param0);
        java.nio.ByteBuffer discarded$1 = this.field_p.get(var3);
        return var3;
    }

    cj() {
    }

    final static int[] a(int param0, int param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_5_0 = null;
        int[] stackOut_3_0 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var14 = new int[256];
        var3 = var14;
        var5 = 34 % ((76 - param2) / 50);
        var4 = 255 & param1 >> -988415408;
        var6 = 255 & param1 >> -2002122968;
        var7 = param1 & 255;
        var8 = (16746397 & param0) >> -1706762512;
        var9 = 255 & param0 >> 153093480;
        var10 = 255 & param0;
        var11 = 0;
        L0: while (true) {
          if (-257 < (var11 ^ -1)) {
            var12 = 256 + -var11;
            stackOut_3_0 = (int[]) (var14);
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var13 == 0) {
              stackIn_5_0[var11] = ((var8 * var12 >> 1270670376) + (var4 * var11 >> 2011327240) << 2122095280) + (((var11 * var6 >> -1109512888) - -(var12 * var9 >> -287065144) << 1277368488) + (var12 * var10 >> 849994888)) + (var11 * var7 >> 1393334088);
              var11++;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var14;
          }
        }
    }

    static {
        field_m = new sa();
        field_o = new sa();
        field_h = 1;
        field_l = "<%0> might change the options - wait and see.";
        field_i = "<%0> has been removed.";
        field_n = new String[]{"Adjacent units are healed by 3 points and cured of poison. Buries bones to increase maximum strength", "Adjacent units are strengthened by 5 points (which diminishes by 1 per turn) and are cured of poison", "Adjacent bones are raised into skeletons; adjacent skeletons are fully healed", "Confuses enemies within 2 tiles, eliminating the defensive qualities of the ground on which they stand", "Paralyses enemies within 2 tiles, leaving them unable to move or attack", "Morale boosts allies within 2 tiles, making them equally effective against all unit classes in battle", "Poisonous attack, poisoned units lose one health point per turn until they die or are healed by structures or other units", "Teleports within 8 tiles, taking 1 turn, killing anything it lands on", "Spreads over 1 tile instead of moving. Upkeep cost of 10 Mana per turn, per tile", "Takes over a single enemy ground unit if the sea slug is at least as strong as the target", "Can attack flying units", "Has a long-range attack", "A single step onto a mountain tile will level the mountain, making it open terrain", "Burns down any forest it moves onto, converting it to open ground.", "Plants a forest on any open ground tile over which it moves", "When walks onto open ground from a river or the sea, the tiles walked over will become a river", "Generates cloud of obscuring smoke, preventing ranged attacks in", "Is surrounded by movement-inhibiting kalphites", "Health -1 at the start of each turn", "Captures structures using current strength<br>(higher strength equals faster capture)", "This unit is not slowed down when moving through swamps or rivers and may cross seas", "This unit is not slowed down when moving through swamps or rivers, may cross seas, and can attack flying units", "Adjacent units are healed by 3 points and cured of poison"};
    }
}
