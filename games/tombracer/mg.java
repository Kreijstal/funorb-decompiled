/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private int field_c;
    static int[] field_h;
    private int field_f;
    private int[] field_i;
    private int field_l;
    private boolean field_j;
    static String field_k;
    private boolean field_d;
    static vna field_b;
    static int[] field_g;
    private boolean field_a;
    static int[] field_e;

    final static int a(int param0) {
        if (param0 >= -41) {
            field_h = null;
        }
        return hg.field_f;
    }

    private mg(int param0, int param1) {
        this(new int[2], param1);
        ((mg) this).field_c = param1;
    }

    final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param1.a((byte) 86, ((mg) this).field_i.length, 4);
        for (var3 = 0; ((mg) this).field_i.length > var3; var3++) {
            param1.a((byte) -25, ((mg) this).field_i[var3], 12);
        }
        if (param0 != 15637) {
            Object var5 = null;
            ((mg) this).a(-109, (kh) null);
        }
        param1.a((byte) -36, ((mg) this).field_c, 12);
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            field_e = null;
        }
        return ((mg) this).field_a;
    }

    mg(int[] param0) {
        this(param0, 0);
    }

    public static void e(int param0) {
        field_h = null;
        field_k = null;
        field_b = null;
        field_g = null;
        if (param0 != 9980) {
            return;
        }
        field_e = null;
    }

    public mg() {
        this(50);
    }

    final void d(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        ((mg) this).field_a = false;
        if (param0 != 0) {
            int discarded$0 = mg.a(-118);
        }
        if (!(!((mg) this).field_d)) {
            ((mg) this).field_d = false;
            ((mg) this).field_a = true;
        }
        if (!(!((mg) this).field_j)) {
            if ((((mg) this).field_f ^ -1) == 0) {
                ((mg) this).field_a = true;
                ((mg) this).field_f = 0;
                return;
            }
            ((mg) this).field_a = false;
            return;
        }
        if (-1 == ((mg) this).field_f) {
            ((mg) this).field_f = ((mg) this).field_i[0];
        }
        ((mg) this).field_f = ((mg) this).field_f - 1;
        if (-1 > (((mg) this).field_f ^ -1)) {
            return;
        }
        do {
            ((mg) this).field_l = ((mg) this).field_l + 1;
            if (!(((mg) this).field_i.length > ((mg) this).field_l)) {
                ((mg) this).field_l = 0;
            }
            ((mg) this).field_f = ((mg) this).field_i[((mg) this).field_l];
            ((mg) this).field_a = !((mg) this).field_a ? true : false;
        } while (-1 == (((mg) this).field_f ^ -1));
    }

    final int a(byte param0) {
        if (null == ((mg) this).field_i) {
            return 0;
        }
        if (param0 != -94) {
            int discarded$0 = mg.a(44);
        }
        return jna.a(param0 + 104, ((mg) this).field_i);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(!((mg) this).field_j)) {
            return;
        }
        ((mg) this).field_c = param1;
        if (param0) {
            ((mg) this).field_l = 38;
        }
        if (!(-1 <= param1)) {
            param1 = param1 % jna.a(10, ((mg) this).field_i);
            var3 = 0;
            while (-1 < param1) {
                ((mg) this).d(0);
                param1--;
                // ifeq L56
                var3 = var3 == 0 ? 1 : 0;
            }
            ((mg) this).field_d = var3 != 0 ? true : false;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          if (null == ((mg) this).field_i) {
            return 0;
          } else {
            if (0 < ((mg) this).field_i.length) {
              return ((mg) this).field_i[((mg) this).field_l];
            } else {
              return 0;
            }
          }
        } else {
          return 7;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (param0 != -53) {
            field_k = null;
        }
        return (param2 & 34) != 0 ? true : false;
    }

    final int b(int param0) {
        if (param0 != 12) {
            mg.e(6);
        }
        return ((mg) this).field_f;
    }

    private mg(int[] param0, int param1) {
        ((mg) this).field_f = -1;
        ((mg) this).field_c = param1;
        ((mg) this).field_i = param0;
        ((mg) this).field_j = 0 == ((mg) this).a((byte) -94) ? true : false;
        ((mg) this).a(false, param1);
    }

    mg(int param0, kh param1) {
        int var4 = 0;
        ((mg) this).field_f = -1;
        int var3 = param1.b((byte) 44, 4);
        ((mg) this).field_i = new int[var3];
        if (-10 <= (param0 ^ -1)) {
            for (var4 = 0; var3 > var4; var4++) {
                ((mg) this).field_i[var4] = param1.b((byte) 44, 8);
            }
            ((mg) this).field_c = param1.b((byte) 44, 8);
        } else {
            for (var4 = 0; var4 < var3; var4++) {
                ((mg) this).field_i[var4] = param1.b((byte) 44, 12);
            }
            ((mg) this).field_c = param1.b((byte) 44, 12);
        }
        ((mg) this).a(false, ((mg) this).field_c);
    }

    mg(int param0) {
        this(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[1];
        field_k = "Room: <%0>/<%1>";
        field_g = new int[2];
        field_b = new vna();
        field_e = new int[8192];
    }
}
