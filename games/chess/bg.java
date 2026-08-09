/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends qn implements ee {
    private int field_bb;
    static boolean field_ab;
    static km field_Z;
    private vb field_Y;
    static String[] field_cb;

    final String g(int param0) {
        if (this.field_w) {
          if (null != this.field_j) {
            sb.d(33, rf.field_b, -this.field_bb - -this.field_y + hn.field_k);
            if (param0 != 0) {
              return (String) null;
            } else {
              return this.field_j;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final vb a(int param0) {
        if (param0 >= -80) {
            field_ab = false;
            return this.field_Y;
        }
        return this.field_Y;
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != this.field_Y) {
            this.field_Y.b(true);
        }
    }

    final void a(int param0, vb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_Y = param1;
              if (param0 < -63) {
                break L1;
              } else {
                field_ab = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bg.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 2491) {
            field_Z = (km) null;
            field_cb = null;
            field_Z = null;
            return;
        }
        field_cb = null;
        field_Z = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
            if (param1 >= -6) {
                field_cb = (String[]) null;
            }
            super.a(param0, -30, param2, param3);
            this.field_bb = -param0 + (-this.field_u + hn.field_k);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bg.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    bg(String param0, rg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
