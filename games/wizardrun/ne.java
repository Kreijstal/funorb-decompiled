/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String field_d;
    static int[] field_h;
    private boolean field_c;
    static ji field_b;
    static int field_g;
    static int[] field_e;
    private String field_f;
    static String field_a;

    final static int a(byte param0) {
        if (param0 != 28) {
            field_b = null;
            return h.field_p;
        }
        return h.field_p;
    }

    final static boolean b(int param0) {
        if (param0 != 22845) {
            return true;
        }
        if (jc.field_H == null) {
            return false;
        }
        if (!wh.field_j.a(0)) {
            return false;
        }
        return true;
    }

    final String a(int param0) {
        if (param0 != 160) {
            int discarded$0 = ne.a((byte) -6);
            return ((ne) this).field_f;
        }
        return ((ne) this).field_f;
    }

    ne(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != -1) {
            int discarded$0 = ne.a((byte) 40);
        }
    }

    final static String b(byte param0) {
        int var1 = 0;
        var1 = -110 / ((70 - param0) / 56);
        if (!ol.field_b) {
          if (jc.field_I <= gj.field_b) {
            if (jc.field_I + ll.field_o <= gj.field_b) {
              return null;
            } else {
              return vb.field_I;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var10 = null;
        char[] var7 = null;
        char[] var6 = null;
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        char[] var11 = null;
        char[] var8 = null;
        int var5 = wizardrun.field_H;
        if (param0 > 0) {
            if (128 > param0) {
                return true;
            }
            if (160 > param0) {
                if (param0 == 0) {
                    if (param1 == 160) {
                        return false;
                    }
                    return false;
                }
                var10 = ki.field_G;
                var7 = var10;
                var6 = var7;
                var2 = var6;
                for (var3 = 0; var10.length > var3; var3++) {
                    var4 = var10[var3];
                    if (!(param0 != var4)) {
                        return true;
                    }
                }
                if (param1 != 160) {
                    return false;
                }
                return false;
            }
            if (param0 > 255) {
                if (param0 == 0) {
                    if (param1 != 160) {
                        return false;
                    }
                    return false;
                }
                var11 = ki.field_G;
                var8 = var11;
                var6 = var8;
                var2 = var6;
                for (var3 = 0; var11.length > var3; var3++) {
                    var4 = var11[var3];
                    if (!(param0 != var4)) {
                        return true;
                    }
                }
                if (param1 != 160) {
                    return false;
                }
                return false;
            }
            return true;
        }
        if (160 <= param0) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 == 0) {
            if (param1 != 160) {
                return false;
            }
            return false;
        }
        char[] var12 = ki.field_G;
        char[] var9 = var12;
        var6 = var9;
        var2 = var6;
        for (var3 = 0; var12.length > var3; var3++) {
            var4 = var12[var3];
            if (!(param0 != var4)) {
                return true;
            }
        }
        if (param1 != 160) {
            return false;
        }
        return false;
    }

    final boolean c(byte param0) {
        if (param0 < 118) {
            return true;
        }
        return ((ne) this).field_c;
    }

    ne(String param0, boolean param1) {
        ((ne) this).field_f = param0;
        ((ne) this).field_c = param1 ? true : false;
        if (null == ((ne) this).field_f) {
            ((ne) this).field_f = "";
        }
        if (((ne) this).field_f.length() == 0) {
            ((ne) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new int[8192];
        field_a = "Menu";
    }
}
