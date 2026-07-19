/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qw extends vg {
    static hea field_f;
    static String field_g;
    static d field_j;
    private hca field_h;
    private int field_i;

    final hca b(int param0) {
        if (param0 != -14065) {
            qw.a(-124);
            return this.field_h;
        }
        return this.field_h;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 == 256) {
          if (224 <= ff.field_w) {
            cf.a(256, -116);
            if (TombRacer.field_G) {
              var1 = ff.field_w % 32;
              cf.a(ff.field_w - (-32 + var1), -127);
              return;
            } else {
              return;
            }
          } else {
            var1 = ff.field_w % 32;
            cf.a(ff.field_w - (-32 + var1), -127);
            return;
          }
        } else {
          qw.a(false);
          if (224 <= ff.field_w) {
            cf.a(256, -116);
            if (!TombRacer.field_G) {
              return;
            } else {
              var1 = ff.field_w % 32;
              cf.a(ff.field_w - (-32 + var1), -127);
              return;
            }
          } else {
            var1 = ff.field_w % 32;
            cf.a(ff.field_w - (-32 + var1), -127);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_j = null;
    }

    final int c(int param0) {
        if (param0 <= 4) {
            return -38;
        }
        return this.field_i;
    }

    qw(hca param0, la param1, int param2, int param3, int param4) {
        try {
            this.field_i = param3;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 == -32) {
          if (param1 == msa.field_a) {
            if (null == rba.field_a) {
              return;
            } else {
              v.b(15, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_g = (String) null;
          if (param1 == msa.field_a) {
            if (null == rba.field_a) {
              return;
            } else {
              v.b(15, 0);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        field_g = "Friend's Best Score:<br> <%0> - <%1>";
    }
}
