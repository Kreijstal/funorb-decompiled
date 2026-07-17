/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    private int[] field_g;
    private int field_o;
    private int[] field_a;
    int field_n;
    private int field_e;
    private int[] field_b;
    private int field_c;
    private int field_m;
    private int[] field_i;
    private boolean field_h;
    static je field_p;
    private int field_l;
    v field_k;
    private int field_j;
    private int[] field_d;
    private int[] field_f;

    final static int a(int param0, int param1, int param2, byte param3) {
        if (param0 >= 0) {
          if (0 <= param1) {
            if (ks.field_y > param0) {
              if (param1 < ef.field_c) {
                if (param3 >= -91) {
                  return -54;
                } else {
                  return cq.field_u[param0 + ks.field_y * param1];
                }
              } else {
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          return param2;
        }
    }

    final boolean a(byte param0) {
        int var2 = -78 / ((param0 - 41) / 62);
        return ((sr) this).field_n == 256 ? true : false;
    }

    final void a(int param0, int param1) {
        ((sr) this).field_e = 256;
        ((sr) this).field_i[0] = 16;
        ((sr) this).field_i[1] = 16;
        ((sr) this).field_j = -((sr) this).field_j + ((sr) this).field_o;
        ((sr) this).field_m = 0;
        ((sr) this).field_g[1] = ((sr) this).field_l;
        ((sr) this).field_g[0] = ((sr) this).field_c;
        ((sr) this).field_k.a(1, param1);
        ((sr) this).field_a[0] = ((sr) this).field_k.field_e[0];
        ((sr) this).field_a[1] = ((sr) this).field_k.field_e[1];
        ((sr) this).field_b[0] = so.field_b.field_a >> 1;
        ((sr) this).field_b[1] = so.field_b.field_g >> 1;
        ((sr) this).field_h = false;
        if (param0 > -59) {
            boolean discarded$0 = ((sr) this).a((byte) -51);
        }
    }

    final void a(int param0, wk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Exception var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var7 = ((sr) this).field_n;
                  var6 = param1.field_x;
                  var5 = param1.field_A;
                  var5 = ((sr) this).field_d[0];
                  var6 = ((sr) this).field_d[1];
                  var4 = -(var6 >> 1) + (((sr) this).field_l >> 1);
                  var8 = -55 / ((param0 - -18) / 37);
                  var3_int = (((sr) this).field_c >> 1) - (var5 >> 1);
                  var4 = ((sr) this).field_f[1];
                  var3_int = ((sr) this).field_f[0];
                  var4 = var4 - (var6 >> 1);
                  var3_int = var3_int - (var5 >> 1);
                  if (256 == var7) {
                    param1.c(var3_int, var4, var5, var6);
                    break L2;
                  } else {
                    param1.c(var3_int, var4, var5, var6, var7);
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("sr.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 != 1) {
          L0: {
            ((sr) this).a(9, -1);
            if (param3 > 0) {
              break L0;
            } else {
              param3 = 1;
              break L0;
            }
          }
          var6 = param4 + -param2;
          var7 = var6 * param1 / param3 + param2;
          return var7;
        } else {
          L1: {
            if (param3 > 0) {
              break L1;
            } else {
              param3 = 1;
              break L1;
            }
          }
          var6 = param4 + -param2;
          var7 = var6 * param1 / param3 + param2;
          return var7;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((sr) this).field_o == ((sr) this).field_j) {
          ((sr) this).field_f[1] = so.field_b.field_g >> 1;
          ((sr) this).field_f[0] = so.field_b.field_a >> 1;
          return;
        } else {
          if (param0 == 1959107777) {
            if (!((sr) this).field_h) {
              L0: {
                ((sr) this).field_b[1] = so.field_b.field_g >> 1;
                ((sr) this).field_b[0] = so.field_b.field_a >> 1;
                this.a(-120);
                ((sr) this).field_n = this.a(param0 + -1959107776, ((sr) this).field_j, ((sr) this).field_e, ((sr) this).field_o, ((sr) this).field_m);
                var2 = ((sr) this).field_i[0] - ((sr) this).field_g[0];
                var3 = this.a((byte) -71, var2);
                var2 = var3 * var2;
                var4 = -((sr) this).field_g[0] + ((sr) this).field_d[0];
                var3 = this.a((byte) -71, var4);
                var4 = var3 * var4;
                ((sr) this).field_f[0] = this.a(1, var4, ((sr) this).field_b[0], var2, ((sr) this).field_a[0]);
                ((sr) this).field_f[1] = this.a(1, var4, ((sr) this).field_b[1], var2, ((sr) this).field_a[1]);
                if (((sr) this).field_o > ((sr) this).field_j) {
                  ((sr) this).field_j = ((sr) this).field_j + 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (((sr) this).field_o == ((sr) this).field_j) {
                  this.b(-85);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                ((sr) this).field_a[0] = so.field_b.field_a >> 1;
                ((sr) this).field_a[1] = so.field_b.field_g >> 1;
                this.a(-120);
                ((sr) this).field_n = this.a(param0 + -1959107776, ((sr) this).field_j, ((sr) this).field_e, ((sr) this).field_o, ((sr) this).field_m);
                var2 = ((sr) this).field_i[0] - ((sr) this).field_g[0];
                var3 = this.a((byte) -71, var2);
                var2 = var3 * var2;
                var4 = -((sr) this).field_g[0] + ((sr) this).field_d[0];
                var3 = this.a((byte) -71, var4);
                var4 = var3 * var4;
                ((sr) this).field_f[0] = this.a(1, var4, ((sr) this).field_b[0], var2, ((sr) this).field_a[0]);
                ((sr) this).field_f[1] = this.a(1, var4, ((sr) this).field_b[1], var2, ((sr) this).field_a[1]);
                if (((sr) this).field_o > ((sr) this).field_j) {
                  ((sr) this).field_j = ((sr) this).field_j + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((sr) this).field_o == ((sr) this).field_j) {
                  this.b(-85);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 77;
        ((sr) this).field_d[0] = (((sr) this).field_i[0] * ((sr) this).field_j + (-((sr) this).field_j + ((sr) this).field_o) * ((sr) this).field_g[0]) / ((sr) this).field_o;
        ((sr) this).field_d[1] = (((sr) this).field_i[1] * ((sr) this).field_j + ((sr) this).field_g[1] * (-((sr) this).field_j + ((sr) this).field_o)) / ((sr) this).field_o;
    }

    private final int a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -71) {
          L0: {
            ((sr) this).a(-4, 101);
            if (param1 < 0) {
              stackOut_7_0 = -1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 < 0) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void b(int param0, int param1) {
        ((sr) this).field_j = 0;
        ((sr) this).field_g[1] = 16;
        ((sr) this).field_e = 0;
        ((sr) this).field_m = 256;
        ((sr) this).field_g[0] = 16;
        ((sr) this).field_i[0] = ((sr) this).field_c;
        ((sr) this).field_i[1] = ((sr) this).field_l;
        ((sr) this).field_k.a(1, param0);
        ((sr) this).field_b[1] = ((sr) this).field_k.field_e[1];
        ((sr) this).field_b[0] = ((sr) this).field_k.field_e[0];
        ((sr) this).field_h = true;
        int var3 = -107 / ((74 - param1) / 42);
        ((sr) this).field_a[0] = so.field_b.field_a >> 1;
        ((sr) this).field_a[1] = so.field_b.field_g >> 1;
    }

    private final void b(int param0) {
        ((sr) this).field_d[0] = ((sr) this).field_i[0];
        ((sr) this).field_n = ((sr) this).field_m;
        ((sr) this).field_d[1] = ((sr) this).field_i[1];
        ((sr) this).field_f[1] = ((sr) this).field_a[1];
        ((sr) this).field_f[0] = ((sr) this).field_a[0];
    }

    final static int c(int param0, int param1) {
        if (param1 < 67) {
            return 4;
        }
        return tm.field_n[param0 & 2047];
    }

    public static void b(byte param0) {
        field_p = null;
    }

    sr(int param0, int param1, v param2) {
        ((sr) this).field_o = 60;
        try {
            ((sr) this).field_a = new int[2];
            ((sr) this).field_k = param2;
            ((sr) this).field_d = new int[2];
            ((sr) this).field_i = new int[2];
            ((sr) this).field_f = new int[2];
            ((sr) this).field_g = new int[2];
            ((sr) this).field_l = param1;
            ((sr) this).field_c = param0;
            ((sr) this).field_b = new int[2];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sr.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
