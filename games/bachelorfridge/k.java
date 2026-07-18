/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends bw {
    pr field_j;
    k[] field_g;
    eia field_h;
    int field_i;
    boolean field_f;

    int[] a(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final static pp a(boolean param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        kt stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kt stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2 = qi.a(param1, (byte) 60);
            var3 = param1.b(16711935);
            stackOut_2_0 = new kt(var2, var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("k.S(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (pp) (Object) stackIn_3_0;
    }

    int a(int param0) {
        if (param0 != -2359) {
            Object var3 = null;
            ((k) this).a((byte) 23, (lu) null, 74);
            return -1;
        }
        return -1;
    }

    int c(byte param0) {
        if (param0 <= 35) {
            ((k) this).field_j = null;
            return -1;
        }
        return -1;
    }

    void b(int param0) {
        if (!((k) this).field_f) {
          ((k) this).field_h.a(false);
          ((k) this).field_h = null;
          if (param0 == -256) {
            return;
          } else {
            ((k) this).field_f = false;
            return;
          }
        } else {
          ((k) this).field_j.b(0);
          ((k) this).field_j = null;
          if (param0 == -256) {
            return;
          } else {
            ((k) this).field_f = false;
            return;
          }
        }
    }

    void d(byte param0) {
        if (param0 != -68) {
            ((k) this).field_i = 42;
        }
    }

    final int[] a(int param0, int param1, byte param2) {
        if (param2 > 104) {
          if (!((k) this).field_g[param0].field_f) {
            return ((k) this).field_g[param0].a(false, param1)[0];
          } else {
            return ((k) this).field_g[param0].a(param1, 0);
          }
        } else {
          ((k) this).field_j = null;
          if (!((k) this).field_g[param0].field_f) {
            return ((k) this).field_g[param0].a(false, param1)[0];
          } else {
            return ((k) this).field_g[param0].a(param1, 0);
          }
        }
    }

    int[][] a(boolean param0, int param1) {
        if (param0) {
            int[][] discarded$0 = ((k) this).a((byte) 115, -14, 40);
            throw new IllegalStateException("This operation does not have a colour output");
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    k(int param0, boolean param1) {
        ((k) this).field_g = new k[param0];
        ((k) this).field_f = param1 ? true : false;
    }

    final int[][] a(byte param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param0 < -57) {
          if (!((k) this).field_g[param1].field_f) {
            return ((k) this).field_g[param1].a(false, param2);
          } else {
            var6 = ((k) this).field_g[param1].a(param2, 0);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[0] = var6;
            var5[2] = var6;
            return var5;
          }
        } else {
          return null;
        }
    }

    void a(byte param0, lu param1, int param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
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
              if (param0 == -71) {
                break L1;
              } else {
                var5 = null;
                pp discarded$2 = k.a(false, (lu) null);
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
            stackOut_3_1 = new StringBuilder().append("k.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 < -9) {
          L0: {
            if (((k) this).field_i != 255) {
              stackOut_4_0 = ((k) this).field_i;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var4 = stackIn_5_0;
          if (((k) this).field_f) {
            ((k) this).field_j = new pr(var4, param0, param2);
            return;
          } else {
            ((k) this).field_h = new eia(var4, param0, param2);
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0) {
        eia.field_d = dg.field_k;
        jf.field_m = dg.field_f;
        tq.field_r = dg.field_h;
        mm.field_D = dg.field_j;
    }

    static {
    }
}
