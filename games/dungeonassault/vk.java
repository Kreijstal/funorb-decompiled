/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_e;
    String[] field_c;
    int field_d;
    boolean field_a;
    String field_g;
    static String field_h;
    static String field_b;
    boolean field_f;

    final static b a(Throwable param0, String param1) {
        b var2_ref = null;
        b var2 = null;
        if (!(param0 instanceof b)) {
            var2 = new b(param0, param1);
        } else {
            var2_ref = (b) (Object) param0;
            var2_ref.field_c = var2_ref.field_c + 32 + param1;
        }
        return var2_ref;
    }

    final static boolean a(int param0) {
        if (param0 == 22084) {
          if (-11 >= kh.field_n) {
            if (-14 > dk.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (-11 >= kh.field_n) {
            if (-14 > dk.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static vk a(byte param0, String param1) {
        if (param0 == -126) {
          if (wd.field_d != ql.field_f) {
            if (wd.field_d == dh.field_b) {
              if (!param1.equals((Object) (Object) bf.field_o)) {
                wd.field_d = ql.field_f;
                bf.field_o = param1;
                ll.field_p = null;
                return null;
              } else {
                wd.field_d = sp.field_e;
                return ll.field_p;
              }
            } else {
              wd.field_d = ql.field_f;
              bf.field_o = param1;
              ll.field_p = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        if (param0 != -31) {
            return;
        }
        d.field_f = false;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 75) {
            return;
        }
        field_h = null;
    }

    vk(boolean param0) {
        ((vk) this).field_a = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Type your age in years";
        field_b = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
    }
}
