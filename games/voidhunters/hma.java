/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hma {
    private int field_b;
    private boolean field_e;
    private int field_a;
    private int[] field_c;
    static int[] field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != -1) {
            field_d = null;
        }
    }

    final void a(byte param0, int param1) {
        this.a(((hma) this).field_a - -1, -15220, param1);
        if (param0 >= -66) {
            field_d = null;
        }
    }

    final static phb[] a(String param0, int param1, asb param2, String param3) {
        int var4 = param2.b(param0, -112);
        int var6 = -104 / ((-47 - param1) / 40);
        int var5 = param2.a(true, var4, param3);
        return dmb.a(var5, (byte) 75, param2, var4);
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var3 = ((hma) this).field_c.length;
        L0: while (true) {
          if (param1 < var3) {
            if (param0 != 0) {
              ((hma) this).field_a = 102;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (((hma) this).field_e) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((hma) this).field_b;
                continue L0;
              }
            } else {
              var3 = var3 + ((hma) this).field_b;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 <= 110) {
          field_d = null;
          var4 = new int[this.a(0, param1)];
          var3 = var4;
          cua.a(((hma) this).field_c, 0, var4, 0, ((hma) this).field_c.length);
          ((hma) this).field_c = var4;
          return;
        } else {
          var4 = new int[this.a(0, param1)];
          var3 = var4;
          cua.a(((hma) this).field_c, 0, var4, 0, ((hma) this).field_c.length);
          ((hma) this).field_c = var4;
          return;
        }
    }

    final int b(int param0, byte param1) {
        if (param0 <= ((hma) this).field_a) {
          if (param1 != 106) {
            return -67;
          } else {
            return ((hma) this).field_c[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final void a(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
          if (param0 <= ((hma) this).field_a) {
            if (param1 != 70) {
              return;
            } else {
              L0: {
                if (param0 != ((hma) this).field_a) {
                  cua.a(((hma) this).field_c, 1 + param0, ((hma) this).field_c, param0, ((hma) this).field_a + -param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((hma) this).field_a = ((hma) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final int a(byte param0) {
        int var2 = -107 / ((param0 - -16) / 43);
        return 1 + ((hma) this).field_a;
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param0 > ((hma) this).field_a) {
            ((hma) this).field_a = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -15220) {
          if (param0 >= ((hma) this).field_c.length) {
            this.b((byte) 116, param0);
            ((hma) this).field_c[param0] = param2;
            return;
          } else {
            ((hma) this).field_c[param0] = param2;
            return;
          }
        } else {
          return;
        }
    }

    private hma() throws Throwable {
        throw new Error();
    }

    static {
    }
}
