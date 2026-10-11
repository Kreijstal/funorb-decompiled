/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends i {
    private int field_J;
    private int field_L;
    static ut field_F;
    static byte[][][][] field_K;
    static String field_H;
    static int[] field_I;
    static int[] field_M;
    static volatile int field_G;

    public static void g(byte param0) {
        field_M = null;
        if (param0 != -45) {
          return;
        }
        field_I = null;
        field_F = null;
        field_K = (byte[][][][]) null;
        field_H = null;
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        var2 = -19 / ((param0 + 30) / 34);
        var3 = param1;
        if (var3 == 32) {
          return '_';
        }
        if (var3 == 160) {
          return '_';
        }
        if (var3 == 95) {
          return '_';
        }
        if (var3 == 45) {
          return '_';
        }
        if (var3 == 91) {
          return param1;
        }
        if (var3 == 93) {
          return param1;
        }
        if (var3 == 35) {
          return param1;
        }
        if (var3 == 224) {
          return 'a';
        }
        if (var3 == 225) {
          return 'a';
        }
        if (var3 == 226) {
          return 'a';
        }
        if (228 == var3) {
          return 'a';
        }
        if (var3 == 227) {
          return 'a';
        }
        if (192 == var3) {
          return 'a';
        }
        if (var3 == 193) {
          return 'a';
        }
        if (var3 == 194) {
          return 'a';
        }
        if (var3 == 196) {
          return 'a';
        }
        if (195 == var3) {
          return 'a';
        }
        if (var3 == 232) {
          return 'e';
        }
        if (var3 == 233) {
          return 'e';
        }
        if (234 == var3) {
          return 'e';
        }
        if (235 == var3) {
          return 'e';
        }
        if (var3 == 200) {
          return 'e';
        }
        if (var3 == 201) {
          return 'e';
        }
        if (202 == var3) {
          return 'e';
        }
        if (var3 == 203) {
          return 'e';
        }
        if (var3 == 237) {
          return 'i';
        }
        if (var3 == 238) {
          return 'i';
        }
        if (var3 == 239) {
          return 'i';
        }
        if (var3 == 205) {
          return 'i';
        }
        if (var3 == 206) {
          return 'i';
        }
        if (var3 == 207) {
          return 'i';
        }
        if (var3 == 242) {
          return 'o';
        }
        if (var3 == 243) {
          return 'o';
        }
        if (var3 == 244) {
          return 'o';
        }
        if (var3 == 246) {
          return 'o';
        }
        if (var3 == 245) {
          return 'o';
        }
        if (210 == var3) {
          return 'o';
        }
        if (var3 == 211) {
          return 'o';
        }
        if (var3 == 212) {
          return 'o';
        }
        if (214 == var3) {
          return 'o';
        }
        if (var3 == 213) {
          return 'o';
        }
        if (var3 == 249) {
          return 'u';
        }
        if (var3 == 250) {
          return 'u';
        }
        if (var3 == 251) {
          return 'u';
        }
        if (var3 == 252) {
          return 'u';
        }
        if (var3 == 217) {
          return 'u';
        }
        if (var3 == 218) {
          return 'u';
        }
        if (219 == var3) {
          return 'u';
        }
        if (var3 == 220) {
          return 'u';
        }
        if (var3 == 231) {
          return 'c';
        }
        if (199 == var3) {
          return 'c';
        }
        if (255 == var3) {
          return 'y';
        }
        if (var3 == 376) {
          return 'y';
        }
        if (241 == var3) {
          return 'n';
        }
        if (209 == var3) {
          return 'n';
        }
        if (var3 == 223) {
          return 'b';
        }
        return Character.toLowerCase(param1);
    }

    vf(jt param0) {
        super(29, param0);
        String var5 = null;
        String var3 = null;
        String var4 = null;
        try {
          this.field_L = param0.field_Db;
          this.field_J = param0.field_zb;
          var5 = h.field_b[this.field_L][this.field_J];
          String var2 = var5;
          var3 = param0.field_Eb;
          var4 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[29], new String[]{var5, var3});
          this.a(var4, this.field_t, this.field_D, -90, this.field_u);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(84, param1);
        if (param1 == 0) {
          ve.a(true, this.field_L, this.field_J);
        }
        if (param0 > 60) {
          return;
        }
        vf.a((byte) -101, 'V');
    }

    static {
        field_F = new ut(96, 96);
        field_H = "Starting price at max";
        field_I = new int[15];
        field_I[6] = 80;
        field_I[11] = 2;
        field_I[8] = 20;
        field_I[7] = 30;
        field_I[9] = 30;
        field_I[10] = 10;
        field_I[3] = 22;
        field_I[4] = 30;
        field_I[5] = 40;
        field_I[2] = 21;
        field_M = new int[8192];
        field_G = -1;
    }
}
