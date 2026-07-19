/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends ie {
    static ti field_D;
    static String field_C;
    static int field_z;
    static String field_B;
    int field_A;

    final static boolean g(int param0) {
        if (param0 <= -26) {
          if ((mp.field_a ^ -1) <= -21) {
            if (we.g(-1)) {
              if (-1 > (jk.field_c ^ -1)) {
                if (au.c(1)) {
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
            return true;
          }
        } else {
          field_B = (String) null;
          if ((mp.field_a ^ -1) <= -21) {
            if (we.g(-1)) {
              if (-1 > (jk.field_c ^ -1)) {
                if (au.c(1)) {
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
            return true;
          }
        }
    }

    in(pk param0) {
        super(param0.field_r, param0.field_v, param0.field_q, param0.field_p, (mh) null, (qm) null);
        try {
            param0.a(-116, 0, 0, this.field_p, this.field_q);
            this.field_A = 256;
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public in() {
        super(0, 0, 0, 0, (mh) null, (qm) null);
        this.field_A = 256;
    }

    public static void a(byte param0) {
        if (param0 > -9) {
            return;
        }
        field_C = null;
        field_D = null;
        field_B = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        wb var6 = null;
        if (0 != param3) {
          return;
        } else {
          if (null != this.field_y) {
            if (this.field_A != 0) {
              if ((this.field_A ^ -1) == -257) {
                this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -125, param3);
                return;
              } else {
                var6 = new wb(this.field_y.field_q, this.field_y.field_p);
                jq.a(7161, var6);
                if (param2 >= -35) {
                  field_C = (String) null;
                  this.field_y.a(0, 0, (byte) -55, param3);
                  su.a((byte) 108);
                  var6.a(this.field_r + param0, param1 - -this.field_v, this.field_A);
                  return;
                } else {
                  this.field_y.a(0, 0, (byte) -55, param3);
                  su.a((byte) 108);
                  var6.a(this.field_r + param0, param1 - -this.field_v, this.field_A);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        field_z = 0;
        field_B = "Next";
    }
}
