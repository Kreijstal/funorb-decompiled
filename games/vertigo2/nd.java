/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends c {
    static String field_l;
    static String field_j;
    static int field_k;

    public static void d(int param0) {
        field_l = null;
        if (param0 >= -15) {
            nd.d(-114);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static void a(tn param0, int param1) {
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        b var5 = null;
        String var6 = null;
        b var7 = null;
        String var8 = null;
        b var9 = null;
        String var10 = null;
        b var11 = null;
        String var12 = null;
        b var13 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = null;

              stackIn_2_1 = param0.field_s;

              stackIn_2_2 = param1 + -27730;

              if ((param0.field_s ^ -1) != -2) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = param0.field_q;
                break L1;
              }
            }
            L2: {
              oq.a((od) ((Object) stackIn_3_0), stackIn_3_1, stackIn_3_2, stackIn_3_3, param0.field_l, (int[]) null, param0.field_e, param0.field_b, param0.field_a);
              if (param0.field_s != 0) {
                break L2;
              } else {
                if (ja.a(param1 ^ -32193)) {
                  break L2;
                } else {
                  if (gd.field_j != null) {
                    break L2;
                  } else {
                    if (sj.field_d != null) {
                      break L2;
                    } else {
                      L3: {
                        if (!hj.field_b) {
                          var5 = un.field_Lb;
                          var6 = ck.field_K;
                          var5.field_n.a(var6, 14, param1 ^ 32192);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = un.field_Lb;
                      var8 = ri.field_x;
                      var7.field_n.a(var8, 20, 0);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if ((param0.field_s ^ -1) != -2) {
                break L4;
              } else {
                if (ja.a(-1)) {
                  break L4;
                } else {
                  if (null == gd.field_j) {
                    break L4;
                  } else {
                    if (param0.field_q == gd.field_j.a((byte) -38)) {
                      L5: {
                        if (hj.field_b) {
                          break L5;
                        } else {
                          var9 = un.field_Lb;
                          var10 = up.field_D;
                          var9.field_n.a(var10, 14, 0);
                          break L5;
                        }
                      }
                      var11 = un.field_Lb;
                      var12 = ja.field_g;
                      var11.field_n.a(var12, 20, 0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            if (param1 == 32192) {
              un.field_Lb.a(2);
              un.field_Lb.a(param1 + -32192, false);
              un.field_Lb.a(param0.field_f, param0.field_s, (byte) -50);
              un.field_Lb.c(-24634);
              un.field_Lb.a(true, param0);
              var13 = un.field_Lb;
              var3 = sd.field_N;
              var4 = no.field_e;
              var13.field_n.c(0, var4, -1220, var3, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("nd.I(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nd(long param0, String param1) {
        super(param0, param1);
    }

    final tq a(byte param0) {
        if (param0 != -83) {
            field_k = 28;
            return hj.field_a;
        }
        return hj.field_a;
    }

    static {
        field_l = "This password is part of your Player Name, and would be easy to guess";
        field_j = "<%0> has joined your game.";
        field_k = 256;
    }
}
