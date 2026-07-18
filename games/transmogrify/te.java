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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              rh.field_r.a((wf) (Object) param0, -101);
              ne.a((byte) 7, param0, param2);
              if (param1 == -10) {
                break L1;
              } else {
                te.a((byte) 61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("te.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 <= 0) {
                  break L1;
                } else {
                  var6_int = param0[0].field_r;
                  var7 = param0[2].field_r;
                  var8 = param0[1].field_r;
                  param0[0].a(param5, param2, param1);
                  param0[2].a(-var7 + param5 - -param3, param2, param1);
                  sb.a(q.field_i);
                  sb.g(param5 - -var6_int, param2, -var7 + (param5 - -param3), param2 + param0[1].field_s);
                  var9 = param5 - -var6_int;
                  var10 = param3 + param5 + -var7;
                  param5 = var9;
                  L2: while (true) {
                    if (var10 <= param5) {
                      sb.b(q.field_i);
                      break L0;
                    } else {
                      param0[1].a(param5, param2, param1);
                      param5 = param5 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("te.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 15 + ',' + param5 + ')');
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
        ji.a(((te) this).field_g, 0, var4, 0, ((te) this).field_g.length);
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
