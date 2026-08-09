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
        if (param0 >= -64) {
          field_d = (oc) null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 > -13) {
            this.a((byte) 47);
            return this.field_b;
        }
        return this.field_b;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((ii) (this)).field_a = stackIn_3_1 != 0;
        if (param0 != 25957) {
          field_d = (oc) null;
          this.field_b = true;
          return;
        } else {
          this.field_b = true;
          return;
        }
    }

    final static boolean b(byte param0) {
        if (param0 == 30) {
          if (-1 != (bm.field_c ^ -1)) {
            if (1 == bm.field_c) {
              if (-9 != (rl.field_c ^ -1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (-4 != (rl.field_c ^ -1)) {
              if (1 == bm.field_c) {
                if (-9 != (rl.field_c ^ -1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ii.b((byte) -32);
          if (-1 == (bm.field_c ^ -1)) {
            if (-4 != (rl.field_c ^ -1)) {
              if (1 == bm.field_c) {
                if (-9 != (rl.field_c ^ -1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (1 == bm.field_c) {
              if (-9 != (rl.field_c ^ -1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static String c(byte param0) {
        int var1;
        if (!re.field_k) {
          if (fb.field_l >= ui.field_e) {
            if (qg.field_u + ui.field_e > fb.field_l) {
              return eb.field_d;
            } else {
              var1 = -97 / ((param0 - 1) / 40);
              return null;
            }
          } else {
            var1 = -97 / ((param0 - 1) / 40);
            return null;
          }
        } else {
          var1 = -97 / ((param0 - 1) / 40);
          return null;
        }
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
