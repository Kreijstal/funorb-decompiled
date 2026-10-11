/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends lw {
    static jd field_o;
    static aj field_l;
    static String field_m;
    static String field_p;
    static kv[] field_n;
    static int field_q;

    final void a(int param0, byte param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (this.field_e != 0) {
          if (this.field_e != 1) {
            if (34 != param0) {
              if (param1 == 73) {
                return;
              }
              field_m = (String) null;
              return;
            }
          } else {
            if (param0 == 12) {
              this.b(1);
              this.c(param1 + 24);
              if (!this.c((byte) 95)) {
                if (param1 != 73) {
                  field_m = (String) null;
                }
                return;
              }
              fla.b(23621);
              if (param1 == 73) {
                return;
              }
              field_m = (String) null;
              return;
            }
            if (34 != param0) {
              if (param1 != 73) {
                field_m = (String) null;
              }
              return;
            }
          }
          if (this.field_e != 0 &&
            this.field_e != 1) {
            this.b(1);
            if (this.c((byte) 95)) {
              fla.b(23621);
            }
            if (param1 != 73) {
              field_m = (String) null;
            }
            return;
          }
          return;
        }
        if (10 == param0) {
          this.b(1);
          this.c(85);
        } else {
          if (this.field_e != 1) {
            if (34 == param0) {
              if (this.field_e == 0) {
                return;
              }
              if (this.field_e == 1) {
                return;
              }
              this.b(1);
              if (this.c((byte) 95)) {
                fla.b(23621);
              }
            }
          } else {
            if (param0 != 12) {
              if (34 == param0) {
                if (this.field_e == 0) {
                  return;
                }
                if (this.field_e == 1) {
                  return;
                }
                this.b(1);
                if (this.c((byte) 95)) {
                  fla.b(23621);
                }
              }
            } else {
              this.b(1);
              this.c(param1 + 24);
              if (this.c((byte) 95)) {
                fla.b(23621);
              }
            }
          }
        }
        if (param1 == 73) {
          return;
        }
        field_m = (String) null;
    }

    final void a(int param0) {
        ku.field_q = true;
        this.c(120);
        int var2 = -115 % ((param0 - 59) / 33);
    }

    dp() {
        super(true, new String[]{un.field_f, pea.field_l}, uga.field_w);
        this.field_c = new int[][]{new int[]{280, 290}, new int[]{320, 400}};
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          jia.a("", -76, param0);
          qfa.a(param0, -118);
          if (param1 >= -78) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            dp.a((java.applet.Applet) null, 36);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_m = null;
        field_o = null;
        field_l = null;
        int var1 = 35 / ((param0 + 62) / 42);
        field_p = null;
        field_n = null;
    }

    final void a(byte param0) {
        if (param0 <= 103) {
          return;
        }
        int var2 = (int)((-Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0) + 1.0) * 256.0);
        if (this.field_e != 0) {
          vg.a(sia.field_j, 8160, 22997, 32000, var2 + 4096, 1280, var2 + 4096, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
          return;
        }
        vg.a(sia.field_j, 8880, 22997, 17000, var2 + 4096, 3200, 4096 + var2, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
    }

    static {
        field_o = new jd(1);
        field_l = new aj(0, 0);
        field_p = "Create";
        field_m = "You can ask to join this game";
    }
}
