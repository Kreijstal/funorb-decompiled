/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static String field_d;
    private boolean field_e;
    static String field_b;
    private boolean field_c;
    static int field_f;
    private String field_a;

    final String d(byte param0) {
        if (param0 < 104) {
            ((bk) this).field_e = false;
            return ((bk) this).field_a;
        }
        return ((bk) this).field_a;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mp var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        String stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        mp stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        String stackOut_10_1 = null;
        int stackOut_12_0 = 0;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_11_0 = 0;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        mp stackOut_17_0 = null;
        mp stackOut_16_0 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = qp.field_d - pk.field_o;
            pk.field_o = ni.field_a - (var1_int >> 1);
            qp.field_d = var1_int + pk.field_o;
            if (param0 < -90) {
              ui.field_d = -(sf.field_d >> 1) + kf.field_b;
              var2 = ui.field_d;
              var3 = 0;
              L1: while (true) {
                if (al.field_y.length <= var3) {
                  break L0;
                } else {
                  L2: {
                    var4 = dg.field_f[var3];
                    if (var4 < 0) {
                      var5 = t.field_c;
                      break L2;
                    } else {
                      if (var4 == kg.field_G.field_c) {
                        var5 = vm.field_b;
                        break L2;
                      } else {
                        var5 = vg.field_d;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var6 = al.field_y[var3];
                    stackOut_10_0 = 127;
                    stackOut_10_1 = (String) var6;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (0 > var4) {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = (String) (Object) stackIn_12_1;
                      stackOut_12_2 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      break L3;
                    } else {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = (String) (Object) stackIn_11_1;
                      stackOut_11_2 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      break L3;
                    }
                  }
                  L4: {
                    var7 = ao.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0);
                    var8 = -(var7 >> 1) + ni.field_a;
                    if (0 <= var4) {
                      L5: {
                        var2 = var2 + vo.field_y;
                        if (kg.field_G.field_c != var4) {
                          stackOut_17_0 = od.field_Jb;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = td.field_a;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_18_0;
                        if (var9 != null) {
                          var9.a(ml.field_v + (eb.field_h << 1), -hc.field_a + var8, var2, (hc.field_a << 1) + var7, -59);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var2 = var2 + eb.field_h;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if (var4 >= 0) {
                      hd.field_f.b(var6, var8, hq.field_r + var2, var5, -1);
                      var2 = var2 + (ml.field_v + vo.field_y + eb.field_h);
                      var3++;
                      break L7;
                    } else {
                      oc.field_s.b(var6, var8, jm.field_G + var2, var5, -1);
                      var2 = var2 + cd.field_a;
                      var3++;
                      break L7;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "bk.G(" + param0 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        ((bk) this).field_e = param1 ? true : false;
        ((bk) this).field_c = true;
        if (param0 != 0) {
            bk.b((byte) 100);
        }
    }

    final static er[] a(int param0, int param1, r param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_4_0 = null;
        er[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        er[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -2724) {
                break L1;
              } else {
                var5 = null;
                er[] discarded$2 = bk.a(-14, -96, (r) null, 39);
                break L1;
              }
            }
            if (hq.a(124, param0, param1, param2)) {
              stackOut_5_0 = wa.c(param3 + 2846);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (er[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("bk.E(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 >= -61) {
            return true;
        }
        return ((bk) this).field_c;
    }

    final boolean c(byte param0) {
        if (param0 > -109) {
            bk.b((byte) -90);
            return ((bk) this).field_e;
        }
        return ((bk) this).field_e;
    }

    bk(String param0) {
        ((bk) this).field_e = false;
        ((bk) this).field_c = false;
        try {
            ((bk) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Retry";
        field_b = "All players have left <%0>'s game.";
        field_f = 0;
    }
}
