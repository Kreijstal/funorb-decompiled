/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends uh {
    static String field_v;
    int[] field_D;
    private int[] field_E;
    private int[][] field_u;
    static vh field_A;
    private String[] field_z;
    static he[] field_y;
    static String field_w;
    static boolean field_B;
    static String field_x;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ja.field_t[gg.field_b] = param3;
        bj.field_a[gg.field_b] = gg.field_b;
        rc.field_i[gg.field_b] = param2;
        if (!(param2 >= cc.field_B)) {
            ha.field_c = param2;
        }
        if (param2 > pf.field_f) {
            mh.field_b = param2;
        }
        fi.field_h[gg.field_b] = param0;
        kk.field_a[gg.field_b] = param4;
        qj.field_d[gg.field_b] = param5;
        int var6 = param4 + param0 - -param5;
        if (param1 > -60) {
            ec discarded$0 = ai.g(-61);
        }
        int var7 = 0 == var6 ? 0 : 1000 * param0 / var6;
        kf.field_c[gg.field_b] = var7;
        if (!(var7 <= mh.field_b)) {
            mh.field_b = var7;
        }
        gg.field_b = gg.field_b + 1;
        if (var7 < ha.field_c) {
            ha.field_c = var7;
        }
    }

    final String i(int param0) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((ai) this).field_z == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ai) this).field_z[0]);
        for (var3 = 1; ((ai) this).field_z.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ai) this).field_z[var3]);
        }
        if (param0 < 120) {
            ((ai) this).a((byte) 20);
        }
        return var2.toString();
    }

    private final void a(od param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        sa var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (param2 == 2) {
                  var4_int = param0.l(31760);
                  ((ai) this).field_D = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((ai) this).field_D[var5] = param0.j(-788751192);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param2 != 3) {
                    if (4 == param2) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param0.l(31760);
                    ((ai) this).field_u = new int[var4_int][];
                    ((ai) this).field_E = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param0.j(-788751192);
                          var7 = m.a(var6, (byte) 46);
                          if (var7 != null) {
                            ((ai) this).field_E[var5] = var6;
                            ((ai) this).field_u[var5] = new int[var7.field_a];
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_a <= var8) {
                                break L4;
                              } else {
                                ((ai) this).field_u[var5][var8] = param0.j(-788751192);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((ai) this).field_z = ki.a((byte) -123, '<', param0.b((byte) -56));
                break L1;
              }
            }
            L6: {
              if (param1 < -6) {
                break L6;
              } else {
                var10 = null;
                ((ai) this).a((od) null, 90);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("ai.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static ec g(int param0) {
        if (param0 != -29132) {
            ec discarded$0 = ai.g(-85);
        }
        return ie.field_v;
    }

    final void a(byte param0) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = 83 % ((-66 - param0) / 46);
        if (((ai) this).field_D != null) {
            for (var3 = 0; ((ai) this).field_D.length > var3; var3++) {
                ((ai) this).field_D[var3] = li.a(((ai) this).field_D[var3], 32768);
            }
        }
    }

    public static void h(int param0) {
        field_x = null;
        field_A = null;
        field_w = null;
        field_v = null;
        field_y = null;
    }

    ai() {
    }

    final void a(od param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.l(31760);
              if (0 == var3_int) {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    ((ai) this).a((byte) 112);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(param0, param1 ^ -61, var3_int);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ai.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Create a free Account";
        field_w = "Create your own free Jagex account";
        field_A = new vh();
        field_x = "Unpacking music";
        field_B = false;
    }
}
