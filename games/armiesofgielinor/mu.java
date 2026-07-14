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
        int var3 = 0;
        va var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = og.field_m;
        as.field_E = new je(0L, (je) null);
        if (param2 != null) {
          param2.field_b = false;
          param2.field_e = 0;
          mp.field_Sb = new bl(var3, param2, param2);
          ce.field_K = new rf(var3, param2, param2, (gj) (Object) new cu());
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
            L0: while (true) {
              if (-8 >= (var8 ^ -1)) {
                qn.a(var16, var5, var6);
                wn.field_jb = l.a(var4, hf.field_f, param1 ^ 0, vs.field_g, uj.field_n);
                as.field_E.field_fb = new at();
                return;
              } else {
                qn.h(var8, var8 - -1, 14 - (var8 << -473431135), 16777215);
                var8++;
                continue L0;
              }
            }
          }
        } else {
          var10 = null;
          af.a((Throwable) null, -116, "QC1");
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        if (param0 != 0) {
          field_g = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = "Do you wish to resign from this game and return to the lobby?";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
