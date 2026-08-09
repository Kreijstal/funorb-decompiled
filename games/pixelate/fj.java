/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static wb field_c;
    static int field_a;
    static int field_b;

    final static void a(aa param0, byte param1) {
        String stackIn_2_0 = null;
        long stackIn_2_1 = 0L;
        String stackIn_2_2 = null;
        String stackIn_3_0 = null;
        long stackIn_3_1 = 0L;
        String stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wi var5 = null;
        String var6 = null;
        wi var7 = null;
        String var8 = null;
        wi var9 = null;
        String var10 = null;
        wi var11 = null;
        String var12 = null;
        wi var13 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_m;

              stackIn_2_1 = param0.field_k;

              stackIn_2_2 = param0.field_n;

              if (1 != param0.field_j) {
                stackIn_3_0 = (String) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = 0;
                break L1;
              } else {
                stackIn_3_0 = (String) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = param0.field_b;
                break L1;
              }
            }
            L2: {
              em.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, param0.field_q, -163, (gp) null, (int[]) null, param0.field_j);
              if (0 != param0.field_j) {
                break L2;
              } else {
                if (pk.b(121)) {
                  break L2;
                } else {
                  if (io.field_c != null) {
                    break L2;
                  } else {
                    if (bn.field_S != null) {
                      break L2;
                    } else {
                      L3: {
                        if (lh.field_g) {
                          break L3;
                        } else {
                          var5 = eg.field_n;
                          var6 = kc.field_s;
                          var5.field_b.a(var6, (byte) -33, 14);
                          break L3;
                        }
                      }
                      var7 = eg.field_n;
                      var8 = nn.field_h;
                      var7.field_b.a(var8, (byte) -128, 20);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0.field_j != 1) {
                break L4;
              } else {
                if (pk.b(120)) {
                  break L4;
                } else {
                  if (io.field_c == null) {
                    break L4;
                  } else {
                    if (param0.field_b == io.field_c.c((byte) 8)) {
                      L5: {
                        if (!lh.field_g) {
                          var9 = eg.field_n;
                          var10 = ee.field_c;
                          var9.field_b.a(var10, (byte) -60, 14);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = eg.field_n;
                      var12 = od.field_Eb;
                      var11.field_b.a(var12, (byte) -73, 20);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              eg.field_n.c(-24);
              eg.field_n.b(false, (byte) -98);
              eg.field_n.a(param0.field_j, param0.field_l, -3);
              eg.field_n.b(8893);
              if (param1 > 96) {
                break L6;
              } else {
                field_a = -88;
                break L6;
              }
            }
            eg.field_n.a((byte) 99, param0);
            var13 = eg.field_n;
            var3 = uo.field_a;
            var4 = ji.field_c;
            var13.field_b.b(0, var3, 88, var4, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("fj.A(");

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
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            L0: {
              var5 = -63 % ((param2 - 41) / 63);
              var4 = param3.getGraphics();
              qa.field_f.a(var4, false, param0, param1);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref2);

            stackIn_6_1 = new StringBuilder().append("fj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
          return;
        } else {
          ui.field_a = param1 * 400 / 150;
          ui.field_j = (param1 << -1386998224) / 150;
          ui.field_k = param1 * 100 / 150;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 112) {
            aa var2 = (aa) null;
            fj.a((aa) null, (byte) -67);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = new wb();
    }
}
