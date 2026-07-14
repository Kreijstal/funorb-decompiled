/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends bh {
    static a field_z;
    private int field_y;
    private oj field_w;
    static String field_x;
    static String field_v;

    final void e(boolean param0) {
        ((bc) this).field_y = 8 * ((bc) this).field_t;
        if (!param0) {
            ((bc) this).e(false);
        }
    }

    final int e(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var3 = ((bc) this).field_y >> 1049270051;
        var4 = 8 - (((bc) this).field_y & 7);
        if (param1 == -112) {
          ((bc) this).field_y = ((bc) this).field_y + param0;
          var5 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              L1: {
                if (var4 != param0) {
                  var5 = var5 + (((bc) this).field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
                  break L1;
                } else {
                  var5 = var5 + (((bc) this).field_u[var3] & rf.field_a[var4]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((bc) this).field_u[var3] & rf.field_a[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((bc) this).field_y = -52;
          ((bc) this).field_y = ((bc) this).field_y + param0;
          var5 = 0;
          L2: while (true) {
            if (param0 <= var4) {
              L3: {
                if (var4 != param0) {
                  var5 = var5 + (((bc) this).field_u[var3] >> -param0 + var4 & rf.field_a[param0]);
                  break L3;
                } else {
                  var5 = var5 + (((bc) this).field_u[var3] & rf.field_a[var4]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((bc) this).field_u[var3] & rf.field_a[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        if (param0 < 28) {
            return;
        }
        for (var5 = 0; var5 < param3; var5++) {
            ((bc) this).field_t = ((bc) this).field_t + 1;
            param1[param2 + var5] = (byte)(((bc) this).field_u[((bc) this).field_t] + -((bc) this).field_w.c(0));
        }
    }

    final int d(boolean param0) {
        if (param0) {
            ((bc) this).f(-44, (byte) -67);
            ((bc) this).field_t = ((bc) this).field_t + 1;
            return ((bc) this).field_u[((bc) this).field_t] - ((bc) this).field_w.c(0) & 255;
        }
        ((bc) this).field_t = ((bc) this).field_t + 1;
        return ((bc) this).field_u[((bc) this).field_t] - ((bc) this).field_w.c(0) & 255;
    }

    final void i(byte param0) {
        ((bc) this).field_t = (((bc) this).field_y + 7) / 8;
        if (param0 <= 57) {
            Object var3 = null;
            boolean discarded$0 = bc.a(89, (bc) null);
        }
    }

    final static boolean a(int param0, bc param1) {
        if (param0 <= 53) {
            Object var3 = null;
            boolean discarded$4 = bc.a(116, (bc) null);
            return 1 == param1.e(1, (byte) -112) ? true : false;
        }
        return 1 == param1.e(1, (byte) -112) ? true : false;
    }

    bc(byte[] param0) {
        super(param0);
    }

    bc(int param0) {
        super(param0);
    }

    final void a(int[] param0, byte param1) {
        ((bc) this).field_w = new oj(param0);
        if (param1 != 33) {
            ((bc) this).e(true);
        }
    }

    final void f(int param0, byte param1) {
        if (param1 != -92) {
            field_v = null;
            ((bc) this).field_t = ((bc) this).field_t + 1;
            ((bc) this).field_u[((bc) this).field_t] = (byte)(((bc) this).field_w.c(oj.a((int) param1, -92)) + param0);
            return;
        }
        ((bc) this).field_t = ((bc) this).field_t + 1;
        ((bc) this).field_u[((bc) this).field_t] = (byte)(((bc) this).field_w.c(oj.a((int) param1, -92)) + param0);
    }

    public static void j(int param0) {
        if (param0 != 29313) {
            bc.j(84);
            field_z = null;
            field_v = null;
            field_x = null;
            return;
        }
        field_z = null;
        field_v = null;
        field_x = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new a();
        field_x = "Quick Chat lobby";
        field_v = "<%0> wants to draw.";
    }
}
