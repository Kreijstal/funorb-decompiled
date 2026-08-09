/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aka extends rqa {
    static boolean field_p;
    static int[] field_o;

    final static void a(pgb param0, int param1) {
        long stackIn_2_0;
        llb stackIn_2_1;
        int stackIn_2_2;
        Object stackIn_2_3;
        String stackIn_2_4;
        Object stackIn_2_5;
        String stackIn_2_6;
        int stackIn_2_7;
        long stackIn_3_0 = 0L;
        llb stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        Object stackIn_3_3 = null;
        String stackIn_3_4 = null;
        Object stackIn_3_5 = null;
        String stackIn_3_6 = null;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        hqb var5 = null;
        String var6 = null;
        hqb var7 = null;
        String var8 = null;
        hqb var9 = null;
        String var10 = null;
        hqb var11 = null;
        String var12 = null;
        hqb var13 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_i;

              stackIn_2_1 = param0.field_j;

              stackIn_2_2 = param0.field_a;

              stackIn_2_3 = null;

              stackIn_2_4 = param0.field_n;

              stackIn_2_5 = null;

              stackIn_2_6 = param0.field_e;

              stackIn_2_7 = 117;

              if (1 != param0.field_a) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = (llb) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (String) ((Object) stackIn_2_4);
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = (String) ((Object) stackIn_2_6);
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = (llb) ((Object) stackIn_2_1);
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (String) ((Object) stackIn_2_4);
                stackIn_3_5 = stackIn_2_5;
                stackIn_3_6 = (String) ((Object) stackIn_2_6);
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = param0.field_q;
                break L1;
              }
            }
            L2: {
              pea.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, (int[]) ((Object) stackIn_3_3), stackIn_3_4, (soa) ((Object) stackIn_3_5), stackIn_3_6, (byte) stackIn_3_7, stackIn_3_8);
              if (0 != param0.field_a) {
                break L2;
              } else {
                if (spb.a(-121)) {
                  break L2;
                } else {
                  if (lqa.field_o != null) {
                    break L2;
                  } else {
                    if (ohb.field_o == null) {
                      L3: {
                        if (hb.field_c) {
                          break L3;
                        } else {
                          var5 = cka.field_o;
                          var6 = di.field_k;
                          var5.field_i.a(var6, (byte) -53, 14);
                          break L3;
                        }
                      }
                      var7 = cka.field_o;
                      var8 = uca.field_D;
                      var7.field_i.a(var8, (byte) -53, 20);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0.field_a != 1) {
                break L4;
              } else {
                if (spb.a(-78)) {
                  break L4;
                } else {
                  if (null == lqa.field_o) {
                    break L4;
                  } else {
                    if (param0.field_q == lqa.field_o.f((byte) -13)) {
                      L5: {
                        if (hb.field_c) {
                          break L5;
                        } else {
                          var9 = cka.field_o;
                          var10 = kia.field_b;
                          var9.field_i.a(var10, (byte) -53, 14);
                          break L5;
                        }
                      }
                      var11 = cka.field_o;
                      var12 = oqb.field_k;
                      var11.field_i.a(var12, (byte) -53, 20);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              if (param1 == 22859) {
                break L6;
              } else {
                field_o = (int[]) null;
                break L6;
              }
            }
            cka.field_o.a(true);
            cka.field_o.a(false, param1 ^ 22797);
            cka.field_o.a(-63, param0.field_a, param0.field_m);
            cka.field_o.b(-9923);
            cka.field_o.a(param0, param1 ^ 22805);
            var13 = cka.field_o;
            var3 = oq.field_H;
            var4 = qs.field_a;
            var13.field_i.b(var3, -29060, var4, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("aka.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    aka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1) {
        rga.a(param0, false, false);
        if (param1 > -121) {
            field_p = true;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -109) {
            aka.a(false, -67);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(86, 87));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("aka.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_p = true;
    }
}
