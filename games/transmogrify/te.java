/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private int[] field_g;
    private boolean field_d;
    private int field_a;
    static String field_b;
    static int[] field_c;
    private int field_e;
    static String field_f;

    final static void a(gd param0, byte param1, int param2) {
        rh.field_r.a((wf) (Object) param0, -101);
        ne.a((byte) 7, param0, param2);
        if (param1 != -10) {
            te.a((byte) 61);
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var3 = ((te) this).field_g.length;
        L0: while (true) {
          if (var3 > param0) {
            if (param1 > -38) {
              field_b = null;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (((te) this).field_d) {
              if (0 != var3) {
                var3 = var3 * ((te) this).field_e;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((te) this).field_e;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (((te) this).field_a < param0) {
            ((te) this).field_a = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= ((te) this).field_g.length) {
            this.c(param0, 0);
            break L1;
          } else {
            break L1;
          }
        }
        ((te) this).field_g[param0] = param1;
        if (param2 > -111) {
          int discarded$2 = this.a(-66, (byte) 61);
          return;
        } else {
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -14927) {
            return 44;
        }
        if (!(((te) this).field_a >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((te) this).field_g[param0];
    }

    final static void a(ti[] param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (param0 != null) {
          if ((param3 ^ -1) < -1) {
            var6 = param0[0].field_r;
            var7 = param0[2].field_r;
            var8 = param0[1].field_r;
            param0[0].a(param5, param2, param1);
            param0[2].a(-var7 + param5 - -param3, param2, param1);
            sb.a(q.field_i);
            if (param4 < 13) {
              te.a((byte) 8);
              sb.g(param5 - -var6, param2, -var7 + (param5 - -param3), param2 + param0[1].field_s);
              var9 = param5 - -var6;
              var10 = param3 + param5 + -var7;
              param5 = var9;
              L0: while (true) {
                if (var10 <= param5) {
                  sb.b(q.field_i);
                  return;
                } else {
                  param0[1].a(param5, param2, param1);
                  param5 = param5 + var8;
                  continue L0;
                }
              }
            } else {
              sb.g(param5 - -var6, param2, -var7 + (param5 - -param3), param2 + param0[1].field_s);
              var9 = param5 - -var6;
              var10 = param3 + param5 + -var7;
              param5 = var9;
              L1: while (true) {
                if (var10 <= param5) {
                  sb.b(q.field_i);
                  return;
                } else {
                  param0[1].a(param5, param2, param1);
                  param5 = param5 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0, byte param1) {
        this.a(1 + ((te) this).field_a, param0, param1 + -240);
        if (param1 != 118) {
            ((te) this).field_a = -79;
        }
    }

    private te() throws Throwable {
        throw new Error();
    }

    final int a(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          te.a((gd) null, (byte) -123, -32);
          return 1 + ((te) this).field_a;
        } else {
          return 1 + ((te) this).field_a;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 8) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final void a(int param0, int param1) {
        if (param1 <= param0) {
          if (param0 <= ((te) this).field_a) {
            if (param0 != ((te) this).field_a) {
              ji.a(((te) this).field_g, param0 - -1, ((te) this).field_g, param0, ((te) this).field_a + -param0);
              ((te) this).field_a = ((te) this).field_a - 1;
              return;
            } else {
              ((te) this).field_a = ((te) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(param0, (byte) -53)];
        int[] var3 = var4;
        ji.a(((te) this).field_g, param1, var4, 0, ((te) this).field_g.length);
        ((te) this).field_g = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Username: ";
        field_c = new int[128];
        field_f = "Back";
    }
}
