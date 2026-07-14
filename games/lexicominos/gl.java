/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    static sh field_a;
    static int[] field_e;
    private int field_g;
    private int field_f;
    static String field_b;
    private int[] field_d;
    private boolean field_c;

    final static nc a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        nc var9 = null;
        var9 = new nc(param1, param0, param4, param2, param6, param8, param7);
        ok.field_b.b(114, (kd) (Object) var9);
        ga.a(var9, param3, 104);
        if (param5 != 56) {
          field_b = null;
          return var9;
        } else {
          return var9;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        if (param0 >= 0) {
          if (param0 <= ((gl) this).field_f) {
            if (param0 != ((gl) this).field_f) {
              o.a(((gl) this).field_d, 1 + param0, ((gl) this).field_d, param0, -param0 + ((gl) this).field_f);
              var3 = 36 % ((53 - param1) / 55);
              ((gl) this).field_f = ((gl) this).field_f - 1;
              return;
            } else {
              var3 = 36 % ((53 - param1) / 55);
              ((gl) this).field_f = ((gl) this).field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final static void a(le param0, int param1, int param2, int param3, int param4, int param5, wh param6, int param7, le param8, wh param9, int param10, int param11, int param12, int param13, int param14, int param15, wh param16, int param17, int param18, int param19, int param20) {
        ng.a(param5, param8, (byte) 115, param0);
        if (param12 != 0) {
            field_b = null;
            vc.a(-5094, param20, param10, param15, param2);
            Lexicominos.a(param7, param12 ^ 102, param18);
            tg.a(param6, param11, param16, param13, -109, param4);
            ph.a(param14, (byte) 126, param1, param9);
            sc.a(param12 + -72, param3, param17, param19);
            return;
        }
        vc.a(-5094, param20, param10, param15, param2);
        Lexicominos.a(param7, param12 ^ 102, param18);
        tg.a(param6, param11, param16, param13, -109, param4);
        ph.a(param14, (byte) 126, param1, param9);
        sc.a(param12 + -72, param3, param17, param19);
    }

    final int a(byte param0) {
        if (param0 != -110) {
            ((gl) this).a(34, (byte) 74);
            return ((gl) this).field_f + 1;
        }
        return ((gl) this).field_f + 1;
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (((gl) this).field_f < param1) {
            ((gl) this).field_f = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((gl) this).field_d.length <= param1) {
            this.a(param1, false);
            break L1;
          } else {
            break L1;
          }
        }
        ((gl) this).field_d[param1] = param2;
        if (param0 >= -25) {
          this.a(-31, -120, -39);
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 12359) {
          this.a(90, true);
          var3 = ((gl) this).field_d.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((gl) this).field_c) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((gl) this).field_g;
                  continue L0;
                }
              } else {
                var3 = var3 + ((gl) this).field_g;
                continue L0;
              }
            }
          }
        } else {
          var3 = ((gl) this).field_d.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((gl) this).field_c) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((gl) this).field_g;
                  continue L1;
                }
              } else {
                var3 = var3 + ((gl) this).field_g;
                continue L1;
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        this.a(-53, ((gl) this).field_f + param1, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -90) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final int a(int param0, int param1) {
        if (param0 <= ((gl) this).field_f) {
          if (param1 > -105) {
            ((gl) this).field_c = true;
            return ((gl) this).field_d[param0];
          } else {
            return ((gl) this).field_d[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(param0, 12359)];
        var3 = var4;
        o.a(((gl) this).field_d, 0, var4, 0, ((gl) this).field_d.length);
        ((gl) this).field_d = var4;
        if (param1) {
          ((gl) this).c(-2, 38);
          return;
        } else {
          return;
        }
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
    }
}
