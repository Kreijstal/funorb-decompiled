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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        gb var13 = null;
        gb var14 = null;
        gb var15 = null;
        fi stackIn_4_0 = null;
        fi stackIn_15_0 = null;
        Object stackOut_14_0 = null;
        fi stackOut_13_0 = null;
        Object stackOut_3_0 = null;
        fi stackOut_2_0 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        if (param4 == -23294) {
          L0: {
            if (!(param1 instanceof gb)) {
              stackOut_14_0 = null;
              stackIn_15_0 = (fi) (Object) stackOut_14_0;
              break L0;
            } else {
              stackOut_13_0 = (fi) param1;
              stackIn_15_0 = stackOut_13_0;
              break L0;
            }
          }
          L1: {
            var15 = (gb) (Object) stackIn_15_0;
            if (var15 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, ((rj) this).field_k);
          var7 = param1.field_g + -(var15.field_J * 2);
          var8 = param1.field_l + (param0 - -var15.field_J);
          var9 = var15.field_K + param1.field_u + param3;
          df.a(var8, var9, var8 + var7, var9, ((rj) this).field_a);
          var10 = -1 + var15.d((byte) -108);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((rj) this).field_g != null) {
                ((rj) this).field_g.c(var15.field_n, var8 - -(var7 / 2), ((rj) this).field_g.field_J + var9 - -var15.field_K, ((rj) this).field_f, ((rj) this).field_c);
                return;
              } else {
                return;
              }
            } else {
              df.c(var7 * var15.a(-1, var10) / var15.a(2147483647) + var8, var9, ((rj) this).field_b, ((rj) this).field_e);
              var10--;
              continue L2;
            }
          }
        } else {
          L3: {
            var12 = null;
            ((rj) this).a(62, (fi) null, true, -29, -102);
            if (!(param1 instanceof gb)) {
              stackOut_3_0 = null;
              stackIn_4_0 = (fi) (Object) stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = (fi) param1;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            var14 = (gb) (Object) stackIn_4_0;
            var13 = var14;
            if (var14 == null) {
              break L4;
            } else {
              break L4;
            }
          }
          df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, ((rj) this).field_k);
          var7 = param1.field_g + -(var14.field_J * 2);
          var8 = param1.field_l + (param0 - -var14.field_J);
          var9 = var14.field_K + param1.field_u + param3;
          df.a(var8, var9, var8 + var7, var9, ((rj) this).field_a);
          var10 = -1 + var14.d((byte) -108);
          L5: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((rj) this).field_g != null) {
                ((rj) this).field_g.c(var14.field_n, var8 - -(var7 / 2), ((rj) this).field_g.field_J + var9 - -var14.field_K, ((rj) this).field_f, ((rj) this).field_c);
                return;
              } else {
                return;
              }
            } else {
              df.c(var7 * var14.a(-1, var10) / var14.a(2147483647) + var8, var9, ((rj) this).field_b, ((rj) this).field_e);
              var10--;
              continue L5;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, long param2) {
        hg var4 = null;
        int var5 = 0;
        var4 = gk.field_g;
        var4.g(param0, 8);
        var4.field_l = var4.field_l + 1;
        var5 = var4.field_l;
        var4.a(6, -119);
        var4.a((byte) 67, param2);
        if (param1) {
          return;
        } else {
          var4.b(-var5 + var4.field_l, -1);
          return;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$1 = q.a(mb.g((byte) 6), -8582, new Object[1], "resizing");
                if (param1 < -65) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj(e param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((rj) this).field_k = param4;
        ((rj) this).field_c = param2;
        ((rj) this).field_b = param5;
        ((rj) this).field_g = param0;
        ((rj) this).field_a = param3;
        ((rj) this).field_f = param1;
        ((rj) this).field_e = param6;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 6) {
            field_h = -10;
            field_j = null;
            field_d = null;
            return;
        }
        field_j = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        if (param4 < -26) {
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
        } else {
          return;
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
