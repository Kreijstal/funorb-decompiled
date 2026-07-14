/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    private boolean field_l;
    static int[] field_f;
    static String[] field_k;
    static boolean field_i;
    private String field_d;
    static int field_g;
    static ud field_j;
    static int[] field_h;
    static String field_c;
    static byte[][][] field_b;
    static volatile boolean field_e;
    static ui field_a;

    public static void b(byte param0) {
        field_k = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_j = null;
        int var1 = 26 / ((-24 - param0) / 49);
        field_b = null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        vf.field_a = true;
        if (param1 != 0) {
          field_f = null;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          pf.a(param0, var2, var4, (byte) 89, var3);
          return;
        } else {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          pf.a(param0, var2, var4, (byte) 89, var3);
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            jg.a(-65);
            return ((jg) this).field_l;
        }
        return ((jg) this).field_l;
    }

    final static void a(boolean param0, String param1) {
        hl.field_a = param1;
        if (!param0) {
            return;
        }
        hm.a(12, (byte) -111);
    }

    final static ui a(boolean param0, pl param1, int param2, int param3, ji param4) {
        byte[] var5 = null;
        Object var6 = null;
        byte[] var7 = null;
        var7 = param4.a(param2, 108, param3);
        var5 = var7;
        if (param0) {
          if (var7 == null) {
            return null;
          } else {
            return new ui(new wl(var7), param1);
          }
        } else {
          var6 = null;
          jg.a(false, (String) null);
          if (var7 == null) {
            return null;
          } else {
            return new ui(new wl(var7), param1);
          }
        }
    }

    final static w b(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          ui discarded$2 = jg.a(true, (pl) null, 58, 53, (ji) null);
          return gf.field_c.field_Ob;
        } else {
          return gf.field_c.field_Ob;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    jg(String param0, boolean param1) {
        ((jg) this).field_d = param0;
        if (((jg) this).field_d == null) {
            ((jg) this).field_d = "";
        }
        ((jg) this).field_l = param1 ? true : false;
        if (((jg) this).field_d.length() == 0) {
            ((jg) this).field_l = false;
        }
    }

    final String a(byte param0) {
        Object var3 = null;
        if (param0 != 56) {
          var3 = null;
          ui discarded$2 = jg.a(true, (pl) null, -94, -75, (ji) null);
          return ((jg) this).field_d;
        } else {
          return ((jg) this).field_d;
        }
    }

    jg(String param0) {
        this(param0, false);
    }

    final static void a(int param0) {
        pl.a(3970);
        if (param0 >= -38) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = true;
        field_g = 0;
        field_k = new String[]{"This shape is called a Deko:", "This shape is called a Bloko:", "You can activate special items by popping shapes next to them.", "Using 'Z' and 'X' for rotation will give you more control.", "If you pop 2 or more shapes in one go, you will be awarded a special item!", "If you pop 4 or more shapes in one go, you will be awarded 2 special items!", "If you pop 7 or more shapes in one go, you will be awarded 4 special items!", "In multiplayer, any special items you earn will be given to both you and your victim.", "Dropping shapes quickly using the 'DOWN' arrow will give you 'fast drop' bonus points.", "Try popping several shapes simultaneously for bonus points!", "Try popping several shapes in a row for bonus points! This is called a chain.", "A chain of 2 will give you 1000 points, but a chain of 4 will give you 6000 points!"};
        field_c = "Players: ";
        field_h = new int[8192];
        field_e = false;
    }
}
