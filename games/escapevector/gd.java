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
            return (el) null;
        }
        return this.field_T;
    }

    final void a(int param0, int param1, int param2, hm param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_W = -param2 + -this.field_k + dh.field_d;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gd.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        super.a(param0);
        if (null != this.field_T) {
            this.field_T.a(false);
        }
    }

    gd(String param0, wn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(el param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_T = param0;
              if (param1 == 63) {
                break L1;
              } else {
                gd.i((byte) 31);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gd.KA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void i(byte param0) {
        field_F = (int[][]) null;
        field_V = (int[][]) null;
        field_R = null;
        field_Q = (int[][]) null;
        field_K = null;
        field_U = (int[][][]) null;
        if (param0 >= -39) {
          gd.i((byte) 82);
          field_Z = null;
          field_S = (int[][]) null;
          return;
        } else {
          field_Z = null;
          field_S = (int[][]) null;
          return;
        }
    }

    final String d(int param0) {
        if (this.field_u) {
          if (this.field_i != null) {
            ri.a(bj.field_y, dh.field_d + this.field_g - this.field_W, (byte) -62);
            if (param0 != 1) {
              field_Z = (String) null;
              return this.field_i;
            } else {
              return this.field_i;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        field_Z = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_K = new hl[16];
        field_Y = 48;
        field_Q = new int[][]{new int[]{30, -field_Y + 185, 30, 222 - field_Y, 38, -field_Y + 230}, new int[]{75, -field_Y + 185, 75, 220 + -field_Y, 70, 225 - field_Y}, new int[]{120, 185 + -field_Y, 120, -field_Y + 215, 60, -field_Y + 275, 35, 275 + -field_Y}, new int[]{165, 185 + -field_Y, 165, -field_Y + 205, 45, 325 + -field_Y, 45, -field_Y + 395}, new int[]{230, -field_Y + 185, 230, -field_Y + 210, 278, 258 + -field_Y, 319, 258 - field_Y}, new int[]{275, 185 + -field_Y, 275, 220 + -field_Y, 300, 245 - field_Y, 317, 245 - field_Y, 326, -field_Y + 254}, new int[]{320, 185 + -field_Y, 320, -field_Y + 215, 335, 230 - field_Y, 335, 255 + -field_Y, 325, 265 - field_Y}, new int[]{365, -field_Y + 185, 365, -field_Y + 230, 332, 263 + -field_Y}, new int[]{30, 440 + -field_Y, 60, 410 - field_Y, 60, -field_Y + 328, 95, 293 + -field_Y, 108, 293 - field_Y}, new int[]{75, -field_Y + 440, 90, 425 + -field_Y, 90, -field_Y + 315, 106, 299 + -field_Y, 127, -field_Y + 299}, new int[]{120, -field_Y + 440, 120, -field_Y + 316, 115, -field_Y + 311}, new int[]{165, -field_Y + 440, 135, -field_Y + 410, 135, -field_Y + 318, 125, -field_Y + 308}, new int[]{230, -field_Y + 440, 150, 360 + -field_Y, 150, -field_Y + 346}, new int[]{275, 440 - field_Y, 275, -field_Y + 420, 235, -field_Y + 380, 200, -field_Y + 380, 160, -field_Y + 340, 160, -field_Y + 332}, new int[]{320, -field_Y + 440, 320, -field_Y + 400, 248, -field_Y + 328, 177, -field_Y + 328}, new int[]{365, 440 + -field_Y, 365, -field_Y + 405, 275, -field_Y + 315, 162, 315 + -field_Y}};
        field_F = new int[][]{new int[]{30, -field_Y + 185, 30, -field_Y + 222, 38, -field_Y + 230}, new int[]{75, -field_Y + 185, 75, 220 - field_Y, 70, -field_Y + 225}, new int[]{120, -field_Y + 185, 120, 215 - field_Y, 60, 275 - field_Y, 35, 275 - field_Y}, new int[]{165, -field_Y + 185, 165, 205 + -field_Y, 45, 325 - field_Y, 45, 395 - field_Y}, new int[]{230, 185 - field_Y, 230, -field_Y + 210, 278, 258 + -field_Y, 319, 258 + -field_Y}, new int[]{275, -field_Y + 185, 275, 220 + -field_Y, 300, -field_Y + 245, 317, -field_Y + 245, 326, -field_Y + 254}, new int[]{320, 185 + -field_Y, 320, 215 + -field_Y, 335, -field_Y + 230, 335, -field_Y + 255, 325, -field_Y + 265}, new int[]{365, 185 - field_Y, 365, -field_Y + 230, 332, -field_Y + 263}, new int[]{30, 440 + -field_Y, 60, -field_Y + 410, 60, -field_Y + 328, 95, 293 + -field_Y, 108, 293 + -field_Y}, new int[]{75, -field_Y + 440, 90, -field_Y + 425, 90, 315 + -field_Y, 106, -field_Y + 299, 127, 299 + -field_Y}, new int[]{120, 440 - field_Y, 120, -field_Y + 316, 115, 311 - field_Y}, new int[]{165, 440 - field_Y, 135, -field_Y + 410, 135, 318 - field_Y, 125, -field_Y + 308}, new int[]{230, 440 - field_Y, 150, 360 + -field_Y, 150, -field_Y + 346}, new int[]{275, -field_Y + 440, 275, -field_Y + 420, 235, 380 + -field_Y, 200, 380 - field_Y, 160, -field_Y + 340, 160, -field_Y + 332}, new int[]{320, 440 + -field_Y, 320, -field_Y + 400, 248, -field_Y + 328, 177, 328 + -field_Y}, new int[]{365, 440 + -field_Y, 365, -field_Y + 405, 275, -field_Y + 315, 162, 315 + -field_Y}};
        field_R = new String[]{"logo", "break_in_a", "break_in_b", "cloaking", "tracking_device", "alien_system", "caves", "boom", "tether", "teleporter", "earth", "asteroid_belt", "repeller", "turret", "system_centre", "baked_moon", "fuel_depot", "powerups", "magnet", "icy_moon", "alien_world", "recovered_technology", "weapons", "logo_ws", "alien_system_ws", "infrastructure_asteroids", "infrastructure_moon", "infrastructure_ice", "infrastructure_alien", "powerups_upgrade"};
        field_S = new int[][]{new int[]{30, -field_Y + 185, 30, -field_Y + 222, 38, 230 - field_Y}, new int[]{75, 185 + -field_Y, 75, 220 + -field_Y, 70, -field_Y + 225}, new int[]{120, 185 + -field_Y, 120, -field_Y + 215, 60, 275 + -field_Y, 35, -field_Y + 275}, new int[]{165, 185 + -field_Y, 165, -field_Y + 205, 45, -field_Y + 325, 45, -field_Y + 395}, new int[]{230, -field_Y + 185, 230, -field_Y + 210, 278, -field_Y + 258, 319, -field_Y + 258}, new int[]{275, -field_Y + 185, 275, -field_Y + 220, 300, -field_Y + 245, 317, 245 + -field_Y, 326, -field_Y + 254}, new int[]{320, 185 + -field_Y, 320, -field_Y + 215, 335, -field_Y + 230, 335, -field_Y + 255, 325, -field_Y + 265}, new int[]{365, 185 - field_Y, 365, -field_Y + 230, 332, -field_Y + 263}, new int[]{30, -field_Y + 440, 60, -field_Y + 410, 60, 328 + -field_Y, 95, 293 + -field_Y, 108, 293 - field_Y}, new int[]{75, -field_Y + 440, 90, 425 + -field_Y, 90, -field_Y + 315, 106, 299 - field_Y, 127, 299 + -field_Y}, new int[]{120, -field_Y + 440, 120, -field_Y + 316, 115, -field_Y + 311}, new int[]{165, -field_Y + 440, 135, 410 + -field_Y, 135, 318 - field_Y, 125, 308 - field_Y}, new int[]{230, 440 - field_Y, 150, -field_Y + 360, 150, 346 + -field_Y}, new int[]{275, -field_Y + 440, 275, 420 - field_Y, 235, -field_Y + 380, 200, 380 - field_Y, 160, 340 + -field_Y, 160, 332 - field_Y}, new int[]{320, -field_Y + 440, 320, -field_Y + 400, 248, 328 - field_Y, 177, 328 + -field_Y}, new int[]{365, 440 - field_Y, 365, -field_Y + 405, 275, 315 + -field_Y, 162, 315 + -field_Y}};
        field_V = field_S;
        field_U = new int[][][]{field_S, field_V, field_F, field_Q};
    }
}
