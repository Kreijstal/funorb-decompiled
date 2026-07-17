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
            var4 = (oa) (Object) cf.field_d.c((byte) 47);
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
                var4 = (oa) (Object) cf.field_d.b((byte) -105);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "pg.B(" + param0 + 44 + param1 + 41);
        }
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var13 = new char[param0];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = param3;
            var6 = 0;
            L1: while (true) {
              if (~param0 >= ~var6) {
                stackOut_17_0 = new String(var13, 0, var5);
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                var7 = param2[var6 + param1] & 255;
                if (var7 != 0) {
                  L2: {
                    if (128 > var7) {
                      break L2;
                    } else {
                      if (var7 < 160) {
                        L3: {
                          var8 = fh.field_e[var7 - 128];
                          if (var8 == 0) {
                            var8 = 63;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var7 = var8;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  int incrementValue$46 = var5;
                  var5++;
                  var4[incrementValue$46] = (char)var7;
                  var6++;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("pg.C(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 41);
        }
        return stackIn_18_0;
    }

    final static bi[] b(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        bi[] var1 = new bi[ef.field_l];
        for (var2 = 0; ef.field_l > var2; var2++) {
            var1[var2] = new bi(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], of.field_d[var2], rd.field_d);
        }
        c.o(-28210);
        return var1;
    }

    public static void a(int param0) {
        int var1 = 0;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = 0;
        field_b = "members-only content";
        field_d = 61453;
    }
}
