/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends ul implements og {
    static String field_Z;
    private static int[][] field_F;
    static hl[] field_K;
    private static int field_Y;
    static int field_X;
    private static int[][] field_Q;
    private el field_T;
    private static int[][] field_V;
    static String[] field_R;
    private int field_W;
    static int[][][] field_U;
    private static int[][] field_S;

    public final el a(byte param0) {
        if (param0 != -89) {
            return null;
        }
        return ((gd) this).field_T;
    }

    final void a(int param0, int param1, int param2, hm param3) {
        super.a(param0, param1, param2, param3);
        ((gd) this).field_W = -param2 + -((gd) this).field_k + dh.field_d;
    }

    final void a(boolean param0) {
        super.a(param0);
        if (null != ((gd) this).field_T) {
            ((gd) this).field_T.a(false);
        }
    }

    gd(String param0, wn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(el param0, byte param1) {
        ((gd) this).field_T = param0;
        if (param1 != 63) {
            gd.i((byte) 31);
        }
    }

    public static void i(byte param0) {
        field_F = null;
        field_V = null;
        field_R = null;
        field_Q = null;
        field_K = null;
        field_U = null;
        if (param0 >= -39) {
          gd.i((byte) 82);
          field_Z = null;
          field_S = null;
          return;
        } else {
          field_Z = null;
          field_S = null;
          return;
        }
    }

    final String d(int param0) {
        if (((gd) this).field_u) {
          if (((gd) this).field_i != null) {
            ri.a(bj.field_y, dh.field_d + ((gd) this).field_g - ((gd) this).field_W, (byte) -62);
            if (param0 != 1) {
              field_Z = null;
              return ((gd) this).field_i;
            } else {
              return ((gd) this).field_i;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_K = new hl[16];
        field_Y = 48;
        field_Q = new int[][]{new int[6], new int[6], new int[8], new int[8], new int[8], new int[10], new int[10], new int[6], new int[10], new int[10], new int[6], new int[8], new int[6], new int[12], new int[8], new int[8]};
        field_F = new int[][]{new int[6], new int[6], new int[8], new int[8], new int[8], new int[10], new int[10], new int[6], new int[10], new int[10], new int[6], new int[8], new int[6], new int[12], new int[8], new int[8]};
        field_R = new String[]{"logo", "break_in_a", "break_in_b", "cloaking", "tracking_device", "alien_system", "caves", "boom", "tether", "teleporter", "earth", "asteroid_belt", "repeller", "turret", "system_centre", "baked_moon", "fuel_depot", "powerups", "magnet", "icy_moon", "alien_world", "recovered_technology", "weapons", "logo_ws", "alien_system_ws", "infrastructure_asteroids", "infrastructure_moon", "infrastructure_ice", "infrastructure_alien", "powerups_upgrade"};
        field_S = new int[][]{new int[6], new int[6], new int[8], new int[8], new int[8], new int[10], new int[10], new int[6], new int[10], new int[10], new int[6], new int[8], new int[6], new int[12], new int[8], new int[8]};
        field_V = field_S;
        field_U = new int[][][]{field_S, field_V, field_F, field_Q};
    }
}
