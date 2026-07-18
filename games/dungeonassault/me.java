/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static ai[] field_g;
    private boolean field_b;
    private String field_d;
    private boolean field_h;
    static String field_e;
    static int field_f;
    static String field_c;
    static String field_a;

    final boolean a(byte param0) {
        if (param0 <= 36) {
            me.a(-118);
            return ((me) this).field_b;
        }
        return ((me) this).field_b;
    }

    public static void a(int param0) {
        if (param0 != 36) {
          me.a(95);
          field_e = null;
          field_g = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        if (a.field_o.a(param3, (byte) 99)) {
          if (!al.field_o.a(param1, (byte) 118)) {
            jb.field_Sb[param1] = param0;
            al.field_o.a(param1, -128);
            if (param2 <= 65) {
              field_a = null;
              hf.field_ob.a((ne) (Object) new a(param1), false);
              return;
            } else {
              hf.field_ob.a((ne) (Object) new a(param1), false);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 36) {
            return false;
        }
        return ((me) this).field_h;
    }

    final void a(boolean param0, boolean param1) {
        ((me) this).field_h = true;
        ((me) this).field_b = param0 ? true : false;
        if (param1) {
            me.a(118, -45, (byte) -83, -85);
        }
    }

    me(String param0) {
        ((me) this).field_h = false;
        ((me) this).field_b = false;
        try {
            ((me) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static cn a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        cn var6 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (gl.field_Lb) {
            stackOut_2_0 = 36;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 32;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param0 != 32) {
          return null;
        } else {
          var6 = new cn(var5, var5);
          jh.a(var6);
          gf.b(param3, param2, -param3 - (param1 - var5), -param2 + (-param4 + var5), 16777215);
          jh.b();
          return var6;
        }
    }

    final String c(int param0) {
        if (param0 != -2085) {
            return null;
        }
        return ((me) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Email: ";
        field_c = "Return to game";
        field_a = "Names can only contain letters, numbers, spaces and underscores";
    }
}
