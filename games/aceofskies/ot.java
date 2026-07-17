/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot {
    private int field_f;
    private int field_d;
    private boolean field_e;
    private int[] field_c;
    static gk field_b;
    static int field_a;

    private final void c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 != -1) {
          int discarded$2 = ((ot) this).a((byte) -66);
          var4 = new int[this.b((byte) -82, param1)];
          var3 = var4;
          au.a(((ot) this).field_c, 0, var4, 0, ((ot) this).field_c.length);
          ((ot) this).field_c = var4;
          return;
        } else {
          var4 = new int[this.b((byte) -82, param1)];
          var3 = var4;
          au.a(((ot) this).field_c, 0, var4, 0, ((ot) this).field_c.length);
          ((ot) this).field_c = var4;
          return;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 == -58) {
          if (param0 >= 0) {
            if (param0 <= ((ot) this).field_f) {
              if (((ot) this).field_f != param0) {
                au.a(((ot) this).field_c, 1 + param0, ((ot) this).field_c, param0, ((ot) this).field_f - param0);
                ((ot) this).field_f = ((ot) this).field_f - 1;
                return;
              } else {
                ((ot) this).field_f = ((ot) this).field_f - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          ((ot) this).a((byte) 9, 30);
          if (param0 >= 0) {
            if (param0 <= ((ot) this).field_f) {
              if (((ot) this).field_f != param0) {
                au.a(((ot) this).field_c, 1 + param0, ((ot) this).field_c, param0, ((ot) this).field_f - param0);
                ((ot) this).field_f = ((ot) this).field_f - 1;
                return;
              } else {
                ((ot) this).field_f = ((ot) this).field_f - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        }
    }

    final static gk a(int param0, int param1) {
        if (param0 > -23) {
            return null;
        }
        return lc.a(true, false, false, (byte) -65, 1, param1);
    }

    final void a(byte param0, int param1) {
        this.a((byte) -70, ((ot) this).field_f + 1, param1);
        if (param0 != -50) {
            ((ot) this).field_d = -75;
        }
    }

    private final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = ((ot) this).field_c.length;
        L0: while (true) {
          if (param1 < var3) {
            if (param0 >= -35) {
              return -27;
            } else {
              return var3;
            }
          } else {
            if (((ot) this).field_e) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((ot) this).field_d;
                continue L0;
              }
            } else {
              var3 = var3 + ((ot) this).field_d;
              continue L0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
    }

    private ot() throws Throwable {
        throw new Error();
    }

    private final void a(byte param0, int param1, int param2) {
        if (!(((ot) this).field_f >= param1)) {
            ((ot) this).field_f = param1;
        }
        if (!(param1 < ((ot) this).field_c.length)) {
            this.c(-1, param1);
        }
        int var4 = 117 % ((param0 - -31) / 32);
        ((ot) this).field_c[param1] = param2;
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            return 54;
        }
        if (!(((ot) this).field_f >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((ot) this).field_c[param0];
    }

    final int a(byte param0) {
        int var2 = -107 / ((51 - param0) / 55);
        return ((ot) this).field_f + 1;
    }

    static {
    }
}
