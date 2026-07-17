/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf extends ll {
    boolean field_B;
    static String field_y;
    static int field_x;
    static String[] field_A;
    static int field_w;
    volatile boolean field_v;
    boolean field_z;

    abstract byte[] b(boolean param0);

    final static int[] a(int param0, int param1) {
        int discarded$0 = 51;
        int var3 = oj.a(param1);
        int var4 = jg.a(8191, param1);
        int discarded$1 = 51;
        int var5 = oj.a(param0);
        int var6 = jg.a(8191, param0);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void c() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            if (null != kf.field_p) {
              ib.a("goblin_club", true, 1);
              ib.a("saurus_spawn", true, 2);
              ib.a("goblin_cleaver", true, 3);
              ib.a("orc_warrior", true, 4);
              ib.a("witch", true, 5);
              ib.a("beastman", true, 6);
              ib.a("saurus_slink", true, 7);
              ib.a("mercenary", true, 8);
              ib.a("priest", true, 9);
              ib.a("orc_blademaster", true, 10);
              ib.a("goblin_scout", true, 11);
              ib.a("necromancer", true, 12);
              ib.a("ogre", true, 13);
              ib.a("enchantress", true, 14);
              ib.a("saurus_warrior", true, 15);
              var1_int = -119;
              ib.a("orc_shaman", true, 16);
              ib.a("troll", true, 17);
              ib.a("northman", true, 18);
              ib.a("dwarf_renegade", true, 19);
              ib.a("thief", true, 20);
              ib.a("zealot", true, 21);
              ib.a("darkelf", true, 22);
              ib.a("baerserker", true, 23);
              ib.a("ogre", true, 24);
              ib.a("spy", true, 25);
              ib.a("blackknight", true, 27);
              ib.a("minotaur", true, 28);
              ib.a("necromancer", true, 29);
              ib.a("blackknight", true, 30);
              ib.a("chaos_champion", true, 31);
              ib.a("demonette", true, 33);
              ib.a("dryad", true, 34);
              o.a(11404, "giantrats", 15);
              o.a(11404, "rotworms", 16);
              o.a(11404, "troglodytes", 17);
              o.a(11404, "giantsnake", 18);
              o.a(11404, "giantspider", 19);
              o.a(11404, "skeleton", 20);
              ic.a(21, 27029, "corrosive_slime");
              o.a(11404, "razor_construct", 22);
              o.a(11404, "vampirebats", 24);
              o.a(11404, "imp", 25);
              o.a(11404, "stone_golem", 26);
              o.a(11404, "spectre", 27);
              o.a(11404, "banshee", 28);
              o.a(11404, "hellbeast", 29);
              o.a(11404, "pitdemon", 31);
              o.a(11404, "vampirelord", 32);
              o.a(11404, "hellbeast", 33);
              o.a(11404, "demonlord", 34);
              ic.a(0, 27029, "empty_room");
              ic.a(3, 27029, "empty_room");
              ic.a(2, 27029, "empty_room");
              ic.a(4, 27029, "bottomless_pit");
              ic.a(5, 27029, "snakes");
              ic.a(6, 27029, "nails");
              ic.a(7, 27029, "hidden_pit");
              ic.a(8, 27029, "teleport");
              ic.a(9, 27029, "hidden_nails");
              ic.a(10, 27029, "bottomless_pit");
              ic.a(11, 27029, "crusher");
              ic.a(12, 27029, "crossbow");
              ic.a(14, 27029, "poison_gas");
              ic.a(13, 27029, "whirling_blades");
              ic.a(35, 27029, "tripwire_bell");
              ic.a(36, 27029, "glass");
              int discarded$6 = -1998;
              k.field_c = tp.a(kf.field_p, "laugh", "skull");
              int discarded$7 = -1998;
              hf.field_ib = tp.a(kf.field_p, "tumble", "dice");
              rg.field_M = new eh[4];
              var2 = 0;
              L1: while (true) {
                if (var2 >= 4) {
                  int discarded$8 = -1998;
                  bo.field_Lb = tp.a(kf.field_p, "eye_open", "dragon");
                  int discarded$9 = -1998;
                  ce.field_v = tp.a(kf.field_p, "victory", "dragon");
                  int discarded$10 = -1998;
                  kf.field_j = tp.a(kf.field_p, "defeat", "dragon");
                  break L0;
                } else {
                  int discarded$11 = -1998;
                  rg.field_M[var2] = tp.a(kf.field_p, "idle" + (1 + var2), "dragon");
                  var2++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "vf.P(" + 117 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var5 = 117 / ((param3 - 57) / 40);
        jc.a(param0, param2, param4, 1, 2, 1);
    }

    abstract int d(byte param0);

    public static void d() {
        field_y = null;
        field_A = null;
    }

    vf() {
        ((vf) this).field_v = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[]{"Dragons of Renown", "<%highlight>You're now approaching the end of the Dungeon Assault tutorial</col>. Having taken and fortified your dungeon, and recruited a party of raiders, you can now send them forth on your first real raid."};
        field_x = 480;
        field_y = "Watch Introduction";
    }
}
