/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf {
    long field_b;
    static hd field_d;
    wf field_c;
    wf field_a;

    final void c(int param0) {
        if (this.field_c != null) {
          this.field_c.field_a = this.field_a;
          this.field_a.field_c = this.field_c;
          this.field_a = null;
          if (param0 >= -122) {
            this.field_a = (wf) null;
            this.field_c = null;
            return;
          } else {
            this.field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= 80) {
          if (this.field_c == null) {
            return false;
          } else {
            return true;
          }
        } else {
          this.field_a = (wf) null;
          if (this.field_c == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = -7 % ((param0 - 12) / 47);
    }

    final static void a(long param0, boolean param1) {
        if (0L >= param0) {
          return;
        } else {
          if (-1L == (param0 % 10L ^ -1L)) {
            ci.a(param0 - 1L, (byte) 127);
            ci.a(1L, (byte) 104);
            if (!param1) {
              return;
            } else {
              field_d = (hd) null;
              return;
            }
          } else {
            ci.a(param0, (byte) 105);
            if (!param1) {
              return;
            } else {
              field_d = (hd) null;
              return;
            }
          }
        }
    }

    static {
        field_d = new hd(1);
    }
}
