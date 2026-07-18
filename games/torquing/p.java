/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends ta {
    int[] field_v;
    private String[] field_r;
    private int[] field_q;
    private int[][] field_s;
    static ce field_t;
    static t field_w;
    static fn field_x;
    static int field_u;

    public static void b(int param0) {
        field_x = null;
        field_w = null;
        field_t = null;
    }

    private final void a(int param0, int param1, fj param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        k var7 = null;
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
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                ((p) this).field_r = kc.a('<', param2.h((byte) 122), 0);
                break L1;
              } else {
                if (param0 != 2) {
                  if (param0 == 3) {
                    var4_int = param2.i((byte) -101);
                    ((p) this).field_s = new int[var4_int][];
                    ((p) this).field_q = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param2.i(7088);
                          var7 = ni.a(89, var6);
                          if (var7 != null) {
                            ((p) this).field_q[var5] = var6;
                            ((p) this).field_s[var5] = new int[var7.field_a];
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_a <= var8) {
                                break L3;
                              } else {
                                ((p) this).field_s[var5][var8] = param2.i(7088);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param0 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_int = param2.i((byte) -101);
                  ((p) this).field_v = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((p) this).field_v[var5] = param2.i(7088);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("p.A(").append(param0).append(',').append(1).append(',');
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
          throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final void a(fj param0, byte param1) {
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
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param1 > 35) {
              L1: while (true) {
                var3_int = param0.i((byte) -101);
                if (var3_int == 0) {
                  break L0;
                } else {
                  this.a(var3_int, 1, param0);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("p.D(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static t[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Torquing.field_u;
        t[] var1 = new t[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
            var3 = ij.field_o[var2] * vo.field_b[var2];
            var4 = pn.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = cq.field_y[ie.a(255, (int) var4[var6])];
            }
            var1[var2] = new t(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], var5);
        }
        go.b(param0 + -3499);
        if (param0 != 3499) {
            field_x = null;
        }
        return var1;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (((p) this).field_v != null) {
            for (var2 = 0; var2 < ((p) this).field_v.length; var2++) {
                ((p) this).field_v[var2] = gm.a(((p) this).field_v[var2], 32768);
            }
        }
        if (param0 >= -28) {
            t[] discarded$0 = p.a(-61);
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((p) this).field_r) {
            return "";
        }
        if (param0 >= -126) {
            t[] discarded$0 = p.a(18);
        }
        StringBuilder discarded$1 = var5.append(((p) this).field_r[0]);
        for (var3 = 1; var3 < ((p) this).field_r.length; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var5.append(((p) this).field_r[var3]);
        }
        return var2.toString();
    }

    p() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ce();
        field_u = 50;
    }
}
