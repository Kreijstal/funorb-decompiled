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
        if (param4 == 5138823) {
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
        } else {
          return true;
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
        Throwable var10 = null;
        Throwable var11 = null;
        ka var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = og.field_m;
            as.field_E = new je(0L, (je) null);
            if (param2 != null) {
              param2.field_b = false;
              param2.field_e = 0;
              mp.field_Sb = new bl(var3_int, param2, param2);
              ce.field_K = new rf(var3_int, param2, param2, new cu());
              var4 = ps.b((byte) -83);
              if (var4 == null) {
                var11 = (Throwable) null;
                af.a((Throwable) null, 124, "QC2");
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                lo.a(var4, 19003);
                var12 = (ka) null;
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
                  L2: {
                    L3: {
                      if (-8 >= (var8 ^ -1)) {
                        break L3;
                      } else {
                        qn.h(var8, var8 - -1, 14 - (var8 << -473431135), 16777215);
                        var8++;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    qn.a(var16, var5, var6);
                    wn.field_jb = l.a(var4, hf.field_f, param1 ^ 0, vs.field_g, uj.field_n);
                    as.field_E.field_fb = new at();
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              var10 = (Throwable) null;
              af.a((Throwable) null, -116, "QC1");
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("mu.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_g = (ru[][]) null;
        field_c = null;
        if (param0 != 0) {
          field_g = (ru[][]) null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
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
        field_f = 0;
        field_e = "Do you wish to resign from this game and return to the lobby?";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
