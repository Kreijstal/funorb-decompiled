/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static je field_c;
    static String[][] field_b;
    static int field_e;
    static int field_d;
    static String field_f;
    static je field_a;

    final static void a(byte param0) {
        if (qc.field_a == null) {
          tj.field_C = new na();
          if (param0 > -22) {
            ek.a(-112);
            lt.field_g.a(tj.field_C, (byte) -88);
            return;
          } else {
            lt.field_g.a(tj.field_C, (byte) -88);
            return;
          }
        } else {
          qc.field_a.b(true);
          tj.field_C = new na();
          if (param0 <= -22) {
            lt.field_g.a(tj.field_C, (byte) -88);
            return;
          } else {
            ek.a(-112);
            lt.field_g.a(tj.field_C, (byte) -88);
            return;
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = ae.b(param1, 100);
        var4 = g.a(-1, param1);
        var5 = ae.b(param2, 100);
        var6 = g.a(-1, param2);
        var7 = (int)((long)var3 * (long)var5 >> 236611664);
        if (param0 > -114) {
          field_b = (String[][]) null;
          var8 = (int)((long)var6 * (long)var3 >> -1612209264);
          var9 = (int)((long)var4 * (long)var5 >> 852523472);
          var10 = (int)((long)var6 * (long)var4 >> 1602676944);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var8 = (int)((long)var6 * (long)var3 >> -1612209264);
          var9 = (int)((long)var4 * (long)var5 >> 852523472);
          var10 = (int)((long)var6 * (long)var4 >> 1602676944);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 236611664) {
          field_a = (je) null;
          field_b = (String[][]) null;
          field_c = null;
          return;
        } else {
          field_b = (String[][]) null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -95) {
            ek.a(-61, 63, 80, -105);
        }
    }

    static {
        field_d = 1;
        field_b = new String[][]{new String[]{"The bones of the dead rest here.", "This map tile will heal your units.", "This portal will heal your units and harm non-barbarian enemies.", "Ranged attacks cannot pass through this tile.", "This tile is covered in kalphites, which will slow your enemies' movement.", "Your enemies may not launch ranged attacks inside this smoke, nor can your units be the target of such attacks within.", "Your enemies will be unable to move if they land on this tile.", "Your enemies will gain no ground defence bonus on these tiles.", "Any enemy units within the range of the enemy songstress's music will fight with the power of a titan.", "This ground has a spiritual barrier, protecting its owner's units from 40% of the damage dealt here.", "Only skirmish and amphibious units may cross rivers on foot.", "Deep water cannot be crossed on foot.", "Swamp slows movement of non-amphibious units.", "The forest slows the movement of all but Guthix-aligned units.", "This ground can be crossed normally.", "Roads allow for faster movement.", "Mountains and walls are impassable on foot.", "Units on this tile only receive <%0>% damage."}, new String[]{null, "This structure will heal its owner's units.", "This structure will heal its owner's units and harm any non-barbarians from other players.", null, "This tile is covered in kalphites, which will slow your unit's movement.", "Your units cannot make ranged attacks while in this smoke, nor can they target enemies within it.", "Any of your units within the range of the cyclops' stare will be paralysed and unable to move.", "Your units gain no ground defence while they're in range of the enemy goblin priest.", "Any of your units within range of your songstress will fight with the power of a titan.", "The spiritual barrier on this tile will protect your units from 40% of the damage dealt to them.", null, null, null, null, null, null, null, "Units on this tile receive full damage."}, new String[]{null, null, "When captured, this structure will heal its owner's units and harm any non-barbarian enemy units.", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}};
        field_f = "Similar rating";
    }
}
