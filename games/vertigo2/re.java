/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int field_g;
    private boolean field_e;
    static int field_j;
    private int[] field_i;
    static int field_k;
    static r field_d;
    private int field_h;
    static String field_c;
    private int field_b;
    static String field_f;
    static r field_a;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return 37;
        }
        if (param1 > ((re) this).field_h) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((re) this).field_i[param1];
    }

    private final void b(int param0, byte param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1 <= 59) {
          return;
        } else {
          var4 = new int[this.a(param0, (byte) 120)];
          var3 = var4;
          qq.a(((re) this).field_i, 0, var4, 0, ((re) this).field_i.length);
          ((re) this).field_i = var4;
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var3 = ((re) this).field_i.length;
        if (param1 == 120) {
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (((re) this).field_e) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((re) this).field_b;
                  continue L0;
                }
              } else {
                var3 = var3 + ((re) this).field_b;
                continue L0;
              }
            }
          }
        } else {
          this.a((byte) -28, -51, -53);
          L1: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (((re) this).field_e) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((re) this).field_b;
                  continue L1;
                }
              } else {
                var3 = var3 + ((re) this).field_b;
                continue L1;
              }
            }
          }
        }
    }

    final int b(int param0) {
        if (param0 < 115) {
            field_j = 104;
            return ((re) this).field_h + 1;
        }
        return ((re) this).field_h + 1;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 < -41) {
            return;
        }
        field_j = 39;
    }

    private final void a(byte param0, int param1, int param2) {
        if (((re) this).field_h >= param2) {
          L0: {
            if (param2 >= ((re) this).field_i.length) {
              this.b(param2, (byte) 94);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 >= -20) {
            int discarded$4 = this.a(110, (byte) -93);
            ((re) this).field_i[param2] = param1;
            return;
          } else {
            ((re) this).field_i[param2] = param1;
            return;
          }
        } else {
          L1: {
            ((re) this).field_h = param2;
            if (param2 >= ((re) this).field_i.length) {
              this.b(param2, (byte) 94);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 < -20) {
            ((re) this).field_i[param2] = param1;
            return;
          } else {
            int discarded$5 = this.a(110, (byte) -93);
            ((re) this).field_i[param2] = param1;
            return;
          }
        }
    }

    final static cr c(int param0) {
        if (param0 != -1087) {
            return null;
        }
        return tf.b((byte) 98);
    }

    final void b(int param0, int param1) {
        if (param0 >= 0) {
          if (((re) this).field_h >= param0) {
            L0: {
              if (((re) this).field_h != param0) {
                qq.a(((re) this).field_i, 1 + param0, ((re) this).field_i, param0, -param0 + ((re) this).field_h);
                break L0;
              } else {
                break L0;
              }
            }
            ((re) this).field_h = ((re) this).field_h - 1;
            if (param1 == 7810) {
              return;
            } else {
              ((re) this).a((byte) 89, -75);
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final void a(byte param0, int param1) {
        if (param0 <= 89) {
            return;
        }
        this.a((byte) -87, param1, ((re) this).field_h + 1);
    }

    private re() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 15;
        field_c = "You have declined the invitation.";
        field_f = "Confirm Email:";
    }
}
