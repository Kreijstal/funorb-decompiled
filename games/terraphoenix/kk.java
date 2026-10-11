/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_c;
    static String field_a;
    static String[] field_b;

    final static int a(int param0, int param1, int param2) {
        if (param0 != 10472) {
          return 47;
        }
        if (uf.field_f == null) {
          return -1;
        }
        if (param1 < qk.field_i) {
          if (param1 < nj.field_j) {
            return -1;
          }
          if (param1 >= uf.field_f.field_r + nj.field_j) {
            return -1;
          }
          if (param2 < gf.field_C) {
            return -1;
          }
          if (param2 < uf.field_f.field_t + gf.field_C) {
            return 1;
          }
          return -1;
        }
        if (qk.field_i + uf.field_f.field_r <= param1) {
          if (param1 < nj.field_j) {
            return -1;
          }
          if (param1 >= uf.field_f.field_r + nj.field_j) {
            return -1;
          }
          if (param2 < gf.field_C) {
            return -1;
          }
          if (param2 < uf.field_f.field_t + gf.field_C) {
            return 1;
          }
          return -1;
        }
        if (sl.field_d <= param2 &&
          uf.field_f.field_t + sl.field_d > param2) {
          return 0;
        }
        if (param1 < nj.field_j) {
          return -1;
        }
        if (param1 >= uf.field_f.field_r + nj.field_j) {
          return -1;
        }
        if (param2 < gf.field_C) {
          return -1;
        }
        if (param2 >= uf.field_f.field_t + gf.field_C) {
          return -1;
        }
        return 1;
    }

    final static void a(int param0, int param1) {
        ke.field_e = (param0 << 16) / 150;
        ke.field_c = param1 * param0 / 150;
        ke.field_f = param0 * 400 / 150;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 67) {
          kk.a(-26, -65);
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_c = "Grunt with armour";
        field_a = "Mouse over an icon for details";
        field_b = new String[]{"Radio signals from this barracks indicate that it is under attack from a violent gang.", "Our scouts have indicated that this research base was not affected by the war. Getting control of the building will allow us to look for more survivors.", "An alien UFO has landed next to our research base!  We must fight them off at all costs.", "Securing this factory will provide us with a place to manufacture more weapons to help with the fight ahead.", "Our factory base is under attack from an alien UFO!  We must fight them back.", "Three UFOs have swarmed over our factory base!  We must fight them back.", "Securing this air strip will provide us with a place to launch attacks against the aliens' UFOs.", "Our air base is under attack from an alien UFO!  We must fight them back.", "Three UFOs have swarmed over our air base!  We must fight them back.", "Our fighter pilots have managed to down an alien UFO!  We must storm the vessel and not allow them to escape.", "Our fighter pilots have managed to down a large alien UFO!  We must storm the vessel and not allow them to escape.", "Our fighters have managed to shoot down one of the largest alien UFOs!  Taking control of this vessel is vital for the attack against the aliens.", "This base will contain important information that we need to fight back against the aliens.", "This undamaged nuclear silo contains the warhead we need to take out the aliens' fusion core.", "We need to assault this alien base and steal one of their UFOs to attack the aliens' mothership in space!", "By venturing into the cities we may be able to find more manpower to help run our factories.", "You have factory resources available. Enter the equipment screen to build new weapons and armour.", "You can recruit new soldiers. Enter the equipment screen to fill out your squad.", "Click on a mission's circle to select it.", " recruits ready.", " recruit ready.", " build points.", " build point."};
    }
}
