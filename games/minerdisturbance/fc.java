/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends al {
    private String[] field_w;
    int[] field_y;
    private int[][] field_v;
    private int[] field_x;
    static long field_u;

    private final void a(int param0, byte param1, sb param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        bg var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 != 1) {
                if (2 == param0) {
                  var4_int = param2.d((byte) -54);
                  ((fc) this).field_y = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((fc) this).field_y[var5] = param2.e(-64);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param0 != 3) {
                    if (param0 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.d((byte) -54);
                    ((fc) this).field_x = new int[var4_int];
                    ((fc) this).field_v = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param2.e(-103);
                          var7 = in.a(var6, (byte) 77);
                          if (var7 != null) {
                            ((fc) this).field_x[var5] = var6;
                            ((fc) this).field_v[var5] = new int[var7.field_a];
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_a <= var8) {
                                break L4;
                              } else {
                                ((fc) this).field_v[var5][var8] = param2.e(-55);
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
                ((fc) this).field_w = h.a('<', true, param2.a(false));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("fc.C(").append(param0).append(',').append(119).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static void a() {
        int var1 = 0;
        if (oc.field_f > 32) {
            var1 = oc.field_f % 32;
            if (0 == var1) {
                var1 = 32;
            }
            ma.a(-96, oc.field_f - var1);
        } else {
            ma.a(-102, 0);
        }
    }

    final static String b(byte param0) {
        if (param0 <= 115) {
            return null;
        }
        if (!(ci.field_e != ic.field_l)) {
            return wm.field_d;
        }
        if (ci.field_e == bd.field_h) {
            return ic.field_m;
        }
        if (!wm.field_f.a(0)) {
            return ic.field_m;
        }
        return pl.field_a;
    }

    final String f(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((fc) this).field_w)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((fc) this).field_w[0]);
        for (var3 = param0; ((fc) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((fc) this).field_w[var3]);
        }
        return var2.toString();
    }

    final void a(int param0, sb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.d((byte) -54);
              if (var3_int != 0) {
                this.a(var3_int, (byte) 119, param1);
                continue L1;
              } else {
                L2: {
                  if (param0 == 32768) {
                    break L2;
                  } else {
                    String discarded$1 = fc.b((byte) -29);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fc.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 60) {
            Object var4 = null;
            ((fc) this).a(80, (sb) null);
        }
        if (!(null == ((fc) this).field_y)) {
            for (var2 = 0; ((fc) this).field_y.length > var2; var2++) {
                ((fc) this).field_y[var2] = hi.a(((fc) this).field_y[var2], 32768);
            }
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 35) {
            fc.a(-84, (byte) 24);
        }
        ee.field_J = param0;
        if (!(null == km.field_a)) {
            km.field_a.a((byte) -95, param0);
        }
        if (null != nj.field_e) {
            nj.field_e.a(81, param0);
        }
    }

    fc() {
    }

    static {
    }
}
