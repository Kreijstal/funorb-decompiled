/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    private boolean field_a;
    static int[] field_c;
    private boolean field_b;
    static boolean field_g;
    static Boolean field_h;
    private String field_e;
    static String[] field_f;
    static oc field_d;

    final String a(byte param0) {
        if (param0 != -34) {
          return (String) null;
        }
        return this.field_e;
    }

    final boolean a(int param0) {
        if (param0 != 17539) {
          field_g = true;
          return this.field_a;
        }
        return this.field_a;
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 < -64) {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
        field_d = (oc) null;
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final boolean d(byte param0) {
        if (param0 > -13) {
          this.a((byte) 47);
          return this.field_b;
        }
        return this.field_b;
    }

    final void a(int param0, boolean param1) {
        this.field_a = param1 ? true : false;
        if (param0 == 25957) {
          this.field_b = true;
          return;
        }
        field_d = (oc) null;
        this.field_b = true;
    }

    final static boolean b(byte param0) {
        if (param0 != 30) {
          ii.b((byte) -32);
          if (bm.field_c != 0) {
            if (1 != bm.field_c) {
              return false;
            }
            if (rl.field_c == 8) {
              return true;
            }
            return false;
          }
          if (rl.field_c == 3) {
            return true;
          }
          if (1 != bm.field_c) {
            return false;
          }
          if (rl.field_c == 8) {
            return true;
          }
          return false;
        }
        if (bm.field_c == 0) {
          if (rl.field_c == 3) {
            return true;
          }
          if (1 != bm.field_c) {
            return false;
          }
          if (rl.field_c == 8) {
            return true;
          }
          return false;
        }
        if (1 != bm.field_c) {
          return false;
        }
        if (rl.field_c == 8) {
          return true;
        }
        return false;
    }

    final static String c(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (re.field_k) {
          var1 = -97 / ((param0 - 1) / 40);
          return null;
        }
        if (fb.field_l < ui.field_e) {
          var1Lifetime1 = -97 / ((param0 - 1) / 40);
          return null;
        }
        if (qg.field_u + ui.field_e <= fb.field_l) {
          var1Lifetime2 = -97 / ((param0 - 1) / 40);
          return null;
        }
        return eb.field_d;
    }

    ii(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_g = false;
        field_f = new String[]{"Name", "Rank", "Level", "Score"};
        field_d = new oc();
    }
}
