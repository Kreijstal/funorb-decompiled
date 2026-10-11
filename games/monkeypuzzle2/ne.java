/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static ai[] field_a;
    static fg field_c;
    static int field_b;

    final static am a(String param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        am var7 = null;
        int var8 = 0;
        am stackIn_4_0 = null;
        am stackIn_8_0 = null;
        am stackIn_11_0 = null;
        am stackIn_19_0 = null;
        am stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = si.field_s;
            return stackIn_4_0;
          }
          if (255 < var2_int) {
            stackIn_8_0 = wk.field_f;
            return stackIn_8_0;
          }
          var3 = ma.a(126, '.', param0);
          if (var3.length < 2) {
            stackIn_11_0 = si.field_s;
            return stackIn_11_0;
          }
          if (param1 >= -61) {
            field_b = -50;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = dh.a(var6, (byte) 55);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = bi.a(var3[-1 + var3.length], 5000);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ne.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        boolean stackIn_40_2 = false;
        gg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gg var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = fb.field_k;
          var2 = 0;
          if (ud.field_b == 2) {
            var3_long = -fb.field_n + pf.a(0);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          if (param0 != -107) {
            ne.a(-67);
          }
          for (var3 = 0; pl.field_k.length > var3; var3++) {
            var4 = gh.field_a[var3];
            if (0 > var4) {
              var5 = lc.field_e;
            } else {
              if (sj.field_f.field_a != var4) {
                var5 = qj.field_D;
              } else {
                var5 = ki.field_s;
              }
            }
            var6 = pl.field_k[var3];
            if (ud.field_b == 2 &&
              var2 == 1) {
              if (uj.field_c.length <= wi.field_b.length) {
                stackIn_19_0 = wi.field_b.length;
              } else {
                stackIn_19_0 = uj.field_c.length;
              }
              var7 = stackIn_19_0;
              if (re.field_a.length <= ud.field_e.length) {
                stackIn_22_0 = ud.field_e.length;
              } else {
                stackIn_22_0 = re.field_a.length;
              }
              var8 = stackIn_22_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (wi.field_b.length - 6 + (var3 - var7) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = wi.field_b[-var7 + (-6 + var3 + wi.field_b.length)];
                }
                var6 = stackIn_27_0;
              }
              if (var7 + 7 <= var3 &&
                7 + (var7 + var8) > var3) {
                if (ud.field_e.length > -var7 - 7 + var3) {
                  stackIn_33_0 = ud.field_e[-var7 + (var3 - 7)];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_39_0 = 47;
            stackIn_39_1 = var6;
            stackIn_40_2 = !(0 > var4);
            var7Lifetime1 = hh.$cfr$intArgs$a$590e95718a07(stackIn_39_0, stackIn_39_1, stackIn_40_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + jc.field_b;
            if (var4 >= 0) {
              if (var4 == sj.field_f.field_a) {
                stackIn_44_0 = mg.field_u;
              } else {
                stackIn_44_0 = de.field_j;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + ud.field_a;
              if (var9 != null) {
                var9.a(var7Lifetime1 + (pl.field_h << 1), var8Lifetime1 - pl.field_h, false, var1_int, hb.field_n + (vf.field_b << 1));
              }
              var1_int = var1_int + vf.field_b;
            }
            if (var4 >= 0) {
              sl.field_o.b(var6, var8Lifetime1, da.field_a + var1_int, var5, -1);
              var1_int = var1_int + (hb.field_n + vf.field_b + ud.field_a);
            } else {
              fe.field_a.b(var6, var8Lifetime1, nf.field_M + var1_int, var5, -1);
              var1_int = var1_int + gi.field_a;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ne.C(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -17) {
          field_b = -18;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != -1) {
          ne.b((byte) 95);
        }
        return ib.field_a;
    }

    final static void a(boolean param0) {
        if (null != wg.field_j) {
          wg.field_j.a(true);
        }
        if (!param0) {
          ne.a((byte) -120);
        }
        if (null != vl.field_f) {
          vl.field_f.c(true);
        }
        vb.g(81);
    }

    static {
        field_b = 0;
    }
}
