/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj implements ol {
    private int field_e;
    private e field_g;
    private int field_f;
    private int field_a;
    static String field_j;
    private int field_k;
    private int field_b;
    private int field_c;
    static String field_i;
    static String[] field_d;
    static int field_l;
    static int field_h;

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        gb var13 = null;
        fi stackIn_6_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        fi stackOut_4_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -23294) {
                break L1;
              } else {
                var12 = null;
                ((rj) this).a(62, (fi) null, true, -29, -102);
                break L1;
              }
            }
            L2: {
              if (!(param1 instanceof gb)) {
                stackOut_5_0 = null;
                stackIn_6_0 = (fi) (Object) stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = (fi) param1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var13 = (gb) (Object) stackIn_6_0;
              if (var13 == null) {
                break L3;
              } else {
                break L3;
              }
            }
            df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, ((rj) this).field_k);
            var7 = param1.field_g + -(var13.field_J * 2);
            var8 = param1.field_l + (param0 - -var13.field_J);
            var9 = var13.field_K + param1.field_u + param3;
            df.a(var8, var9, var8 + var7, var9, ((rj) this).field_a);
            var10 = -1 + var13.d((byte) -108);
            L4: while (true) {
              if (var10 < 0) {
                if (((rj) this).field_g == null) {
                  break L0;
                } else {
                  ((rj) this).field_g.c(var13.field_n, var8 - -(var7 / 2), ((rj) this).field_g.field_J + var9 - -var13.field_K, ((rj) this).field_f, ((rj) this).field_c);
                  return;
                }
              } else {
                df.c(var7 * var13.a(-1, var10) / var13.a(2147483647) + var8, var9, ((rj) this).field_b, ((rj) this).field_e);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("rj.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, boolean param1, long param2) {
        hg var4 = gk.field_g;
        var4.g(param0, 8);
        var4.field_l = var4.field_l + 1;
        int var5 = var4.field_l;
        var4.a(6, -119);
        var4.a((byte) 67, param2);
        var4.b(-var5 + var4.field_l, -1);
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              Object discarded$1 = q.a(mb.g((byte) 6), -8582, new Object[1], "resizing");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj(e param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((rj) this).field_k = param4;
            ((rj) this).field_c = param2;
            ((rj) this).field_b = param5;
            ((rj) this).field_g = param0;
            ((rj) this).field_a = param3;
            ((rj) this).field_f = param1;
            ((rj) this).field_e = param6;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "rj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public static void a() {
        field_i = null;
        field_j = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        if (param1 >= param5) {
          if (param7 <= param1) {
            if (param5 < param7) {
              li.a(param5, param0, param7, df.field_d, param1, param3, param2, param6, (byte) -68);
              return;
            } else {
              li.a(param7, param3, param5, df.field_d, param1, param0, param2, param6, (byte) -59);
              return;
            }
          } else {
            li.a(param5, param0, param1, df.field_d, param7, param6, param2, param3, (byte) 75);
            return;
          }
        } else {
          if (param7 <= param5) {
            if (param7 <= param1) {
              li.a(param7, param3, param1, df.field_d, param5, param6, param2, param0, (byte) -58);
              return;
            } else {
              li.a(param1, param6, param7, df.field_d, param5, param3, param2, param0, (byte) 112);
              return;
            }
          } else {
            li.a(param1, param6, param5, df.field_d, param7, param0, param2, param3, (byte) -105);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "More suggestions";
        field_j = "Inviting <%0>";
    }
}
