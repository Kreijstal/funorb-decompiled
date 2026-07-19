/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static int field_f;
    static int field_e;
    static int field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, int param1) {
        lh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        oa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -64) {
                break L1;
              } else {
                pg.a(-11, 18);
                break L1;
              }
            }
            var4 = (oa) ((Object) cf.field_d.c((byte) 47));
            L2: while (true) {
              if (var4 == null) {
                var2 = hd.field_a.c((byte) 47);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ef.a(0, param1);
                    var2 = hd.field_a.b((byte) -105);
                    continue L3;
                  }
                }
              } else {
                s.a(var4, param1, false);
                var4 = (oa) ((Object) cf.field_d.b((byte) -105));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "pg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int incrementValue$5 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var11 = new char[param0];
            var10 = var11;
            var4 = var10;
            var5 = param3;
            var6 = 0;
            L1: while (true) {
              if (param0 <= var6) {
                stackOut_15_0 = new String(var11, 0, var5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L2: {
                  var7 = param2[var6 + param1] & 255;
                  if (-1 != (var7 ^ -1)) {
                    L3: {
                      if (128 > var7) {
                        break L3;
                      } else {
                        if (-161 < (var7 ^ -1)) {
                          L4: {
                            var8 = fh.field_e[var7 - 128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var7 = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = (char)var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4_ref);
            stackOut_17_1 = new StringBuilder().append("pg.C(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final static bi[] b(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        bi[] var1 = new bi[ef.field_l];
        for (var2 = param0; ef.field_l > var2; var2++) {
            var1[var2] = new bi(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], of.field_d[var2], rd.field_d);
        }
        c.o(-28210);
        return var1;
    }

    public static void a(int param0) {
        int var1 = 20 % ((-74 - param0) / 41);
        field_b = null;
    }

    static {
        field_f = 0;
        field_a = 0;
        field_b = "members-only content";
        field_d = 61453;
    }
}
