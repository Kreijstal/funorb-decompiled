/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ef extends kc {
    private String field_k;
    static ed field_h;
    private long field_i;
    static String field_m;
    static int field_l;
    static String field_j;

    uj a(boolean param0) {
        if (!param0) {
            this.a(false);
        }
        return mk.field_i;
    }

    final static void a(int param0, int param1) {
        ih var2 = ud.field_b;
        var2.e(param0 + 8, param1);
        var2.a(-11, 1);
        var2.a(-11, param0);
    }

    public static void b(byte param0) {
        field_j = null;
        field_m = null;
        if (param0 >= -91) {
            field_j = (String) null;
        }
        field_h = null;
    }

    final static int a(byte param0) {
        int var1 = -20 / ((-69 - param0) / 49);
        return bm.field_K - ei.field_M;
    }

    final static void a(sg param0, byte param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (3 <= var2_int) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= qb.field_a) {
                    L3: {
                      dupTemp$0 = param0.b(0);
                      bd.field_ob[dupTemp$0] = bd.field_ob[dupTemp$0] + 1;
                      if (param1 < -27) {
                        break L3;
                      } else {
                        field_h = (ed) null;
                        break L3;
                      }
                    }
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (qb.field_a <= var3) {
                        qb.field_a = var2_int;
                        fieldTemp$1 = qb.field_a;
                        qb.field_a = qb.field_a + 1;
                        vg.field_H[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_j == vg.field_H[var3].field_j) {
                              var4 = vg.field_H[var3].b(0);
                              if (bf.field_h >= bd.field_ob[var4]) {
                                break L6;
                              } else {
                                bd.field_ob[var4] = bd.field_ob[var4] - 1;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          vg.field_H[incrementValue$2] = vg.field_H[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if ((param0.field_j ^ -1) == (vg.field_H[var2_int].field_j ^ -1)) {
                        dupTemp$3 = vg.field_H[var2_int].b(0);
                        bd.field_ob[dupTemp$3] = bd.field_ob[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                bd.field_ob[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ef.I(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    final void a(ni param0, byte param1) {
        try {
            int var3_int = -115 % ((-62 - param1) / 38);
            param0.a(-110, this.field_i);
            param0.b(this.field_k, (byte) 94);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ef.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 17) {
              L1: {
                if (null == rg.b((byte) 59, param1)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ef.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    ef(long param0, String param1) {
        try {
            this.field_i = param0;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ef.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Password is valid";
        field_h = new ed();
    }
}
