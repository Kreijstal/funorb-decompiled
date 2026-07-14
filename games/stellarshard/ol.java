/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int[] field_f;
    static int field_c;
    static int[] field_a;
    private int field_b;
    private int field_e;
    static int[] field_g;
    private boolean field_d;

    private final void a(int param0, int param1, int param2) {
        if (param0 == 31860) {
          L0: {
            if (param1 > ((ol) this).field_e) {
              ((ol) this).field_e = param1;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 >= ((ol) this).field_f.length) {
            this.a(param1, 64);
            ((ol) this).field_f[param1] = param2;
            return;
          } else {
            ((ol) this).field_f[param1] = param2;
            return;
          }
        } else {
          L1: {
            field_c = 90;
            if (param1 > ((ol) this).field_e) {
              ((ol) this).field_e = param1;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1 < ((ol) this).field_f.length) {
            ((ol) this).field_f[param1] = param2;
            return;
          } else {
            this.a(param1, 64);
            ((ol) this).field_f[param1] = param2;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        if (!param0) {
            field_c = -98;
        }
    }

    private final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        if (!param0) {
          ((ol) this).field_b = 105;
          var3 = ((ol) this).field_f.length;
          L0: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (((ol) this).field_d) {
                if (-1 == (var3 ^ -1)) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((ol) this).field_b;
                  continue L0;
                }
              } else {
                var3 = var3 + ((ol) this).field_b;
                continue L0;
              }
            }
          }
        } else {
          var3 = ((ol) this).field_f.length;
          L1: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (((ol) this).field_d) {
                if (-1 == (var3 ^ -1)) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((ol) this).field_b;
                  continue L1;
                }
              } else {
                var3 = var3 + ((ol) this).field_b;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1 < 54) {
          ol.a(false);
          var4 = new int[this.a(true, param0)];
          var3 = var4;
          ri.a(((ol) this).field_f, 0, var4, 0, ((ol) this).field_f.length);
          ((ol) this).field_f = var4;
          return;
        } else {
          var4 = new int[this.a(true, param0)];
          var3 = var4;
          ri.a(((ol) this).field_f, 0, var4, 0, ((ol) this).field_f.length);
          ((ol) this).field_f = var4;
          return;
        }
    }

    final void a(int param0, byte param1) {
        if (-1 >= (param0 ^ -1)) {
          if (param0 <= ((ol) this).field_e) {
            if (param1 != 111) {
              L0: {
                ((ol) this).a(77, (byte) -17);
                if (param0 != ((ol) this).field_e) {
                  ri.a(((ol) this).field_f, 1 + param0, ((ol) this).field_f, param0, ((ol) this).field_e + -param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((ol) this).field_e = ((ol) this).field_e - 1;
              return;
            } else {
              L1: {
                if (param0 != ((ol) this).field_e) {
                  ri.a(((ol) this).field_f, 1 + param0, ((ol) this).field_f, param0, ((ol) this).field_e + -param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ol) this).field_e = ((ol) this).field_e - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          this.a(-83, -41);
          this.a(31860, ((ol) this).field_e + 1, param0);
          return;
        } else {
          this.a(31860, ((ol) this).field_e + 1, param0);
          return;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 == -117) {
          if (param1 > ((ol) this).field_e) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            return ((ol) this).field_f[param1];
          }
        } else {
          int discarded$6 = ((ol) this).a(-72);
          if (param1 > ((ol) this).field_e) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            return ((ol) this).field_f[param1];
          }
        }
    }

    final static void b(int param0) {
        sj.field_F = null;
        if (param0 > -12) {
            return;
        }
        wc.field_C = null;
    }

    private ol() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        if (param0 != 19692) {
            int discarded$0 = ((ol) this).a((byte) 67, 47);
            return 1 + ((ol) this).field_e;
        }
        return 1 + ((ol) this).field_e;
    }

    static {
    }
}
