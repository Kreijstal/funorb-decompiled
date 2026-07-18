/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private boolean field_d;
    private int[] field_a;
    static String field_e;
    private int field_b;
    private int field_c;

    public static void a(byte param0) {
        if (param0 != -13) {
            return;
        }
        field_e = null;
    }

    final void a(int[] param0, int param1) {
        try {
            this.a(((uh) this).field_b + 1, param0, 1, param0.length, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1) {
        if (param0 >= 0) {
          if (param0 <= ((uh) this).field_b) {
            L0: {
              if (param0 != ((uh) this).field_b) {
                bc.a(((uh) this).field_a, 1 + param0, ((uh) this).field_a, param0, ((uh) this).field_b - param0);
                break L0;
              } else {
                break L0;
              }
            }
            if (param1 <= 4) {
              ((uh) this).field_d = true;
              ((uh) this).field_b = ((uh) this).field_b - 1;
              return;
            } else {
              ((uh) this).field_b = ((uh) this).field_b - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param0 > ((uh) this).field_b) {
          L0: {
            ((uh) this).field_b = param0;
            if (((uh) this).field_a.length <= param0) {
              this.a(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          ((uh) this).field_a[param0] = param1;
          return;
        } else {
          L1: {
            if (((uh) this).field_a.length <= param0) {
              this.a(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          ((uh) this).field_a[param0] = param1;
          return;
        }
    }

    private final int c(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        var3 = ((uh) this).field_a.length;
        L0: while (true) {
          if (param0 < var3) {
            var4 = 0;
            return var3;
          } else {
            if (!((uh) this).field_d) {
              var3 = var3 + ((uh) this).field_c;
              continue L0;
            } else {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((uh) this).field_c;
                continue L0;
              }
            }
          }
        }
    }

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        var3 = new int[((uh) this).field_b - -1];
        var2 = var3;
        if (param0 > -33) {
          return null;
        } else {
          bc.a(((uh) this).field_a, 0, var3, 0, ((uh) this).field_b + 1);
          return var3;
        }
    }

    private final void a(int param0, int param1) {
        int discarded$0 = -81;
        int[] var4 = new int[this.c(param1)];
        int[] var3 = var4;
        bc.a(((uh) this).field_a, 0, var4, 0, ((uh) this).field_a.length);
        ((uh) this).field_a = var4;
    }

    final void a(int param0, byte param1) {
        if (param1 < 61) {
          int discarded$2 = ((uh) this).b(-32);
          this.a(1 + ((uh) this).field_b, param0, (byte) -119);
          return;
        } else {
          this.a(1 + ((uh) this).field_b, param0, (byte) -119);
          return;
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int param4) {
        try {
            if (!(((uh) this).field_b >= param3 + (param0 - 1))) {
                ((uh) this).field_b = -1 + param3 + param0;
                this.a(0, param3 + (param0 - 1));
            }
            bc.a(param1, param4, ((uh) this).field_a, param0, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "uh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + 1 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (((uh) this).field_b >= param1) {
          if (param0 <= 3) {
            ((uh) this).field_c = -4;
            return ((uh) this).field_a[param1];
          } else {
            return ((uh) this).field_a[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int b(int param0) {
        if (param0 >= -110) {
            int[] discarded$0 = ((uh) this).a(-118);
            return 1 + ((uh) this).field_b;
        }
        return 1 + ((uh) this).field_b;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            uh.a((byte) -39);
            ak.field_c = param2;
            jf.field_b = param0;
            return;
        }
        ak.field_c = param2;
        jf.field_b = param0;
    }

    uh(int param0, boolean param1) {
        ((uh) this).field_a = new int[]{};
        ((uh) this).field_b = -1;
        ((uh) this).field_d = false;
        ((uh) this).field_c = param0;
        ((uh) this).field_d = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Change display name";
    }
}
