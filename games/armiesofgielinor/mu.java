/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mu {
    static cg field_a;
    static java.math.BigInteger field_c;
    static ru[][] field_g;
    static int field_d;
    static String field_e;
    static int field_f;
    static ue[] field_b;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 <= param0) {
          if (param3 - -param5 > param0) {
            if (param2 >= param6) {
              if (param2 >= param1 + param6) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(ka param0, int param1, kl param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        va var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = og.field_m;
            as.field_E = new je(0L, (je) null);
            if (param2 != null) {
              param2.field_b = false;
              param2.field_e = 0;
              mp.field_Sb = new bl(var3_int, param2, param2);
              ce.field_K = new rf(var3_int, param2, param2, (gj) (Object) new cu());
              var4 = ps.b((byte) -83);
              if (var4 == null) {
                var11 = null;
                af.a((Throwable) null, 124, "QC2");
                return;
              } else {
                lo.a(var4, 19003);
                var12 = null;
                hf.field_f = pr.a(65793, 2245737, 65793, 65793, 8947848, 0, (ka) null, 1127256, 1513239, 4020342, 5138823, (byte) 39, 1513239);
                vs.field_g = pr.a(param1, 0, 0, 0, 0, 16764006, param0, 0, 0, 0, 0, (byte) 107, 0);
                uj.field_n = pr.a(0, 0, 0, 0, 0, 16777215, param0, 0, 0, 0, 0, (byte) -124, 0);
                var5 = qn.field_l;
                var6 = qn.field_g;
                var16 = qn.field_d;
                s.field_c = new wk(10, 14);
                s.field_c.b();
                var8 = 2;
                L1: while (true) {
                  if (var8 >= 7) {
                    qn.a(var16, var5, var6);
                    wn.field_jb = l.a(var4, hf.field_f, param1, vs.field_g, uj.field_n);
                    as.field_E.field_fb = new at();
                    break L0;
                  } else {
                    qn.h(var8, var8 - -1, 14 - (var8 << 1), 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var10 = null;
              af.a((Throwable) null, -116, "QC1");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("mu.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 28799) {
            return false;
        }
        if (48 > param1) {
            return false;
        }
        if (57 < param1) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = "Do you wish to resign from this game and return to the lobby?";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
