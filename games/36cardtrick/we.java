/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    final static void a(int param0, int param1, int param2, int param3, kc[] param4, int param5, int param6, int param7, int param8, ee param9, kc[] param10, int param11, boolean param12, boolean param13, ee param14) {
        try {
          kc[] var16 = (kc[]) null;
          af.a(param14, param5, param2, 0, (byte) -120, af.field_jb, param3, param6, 0, param0, 480, (kc[]) null, param1, param10, param8, param11, param9, wg.field_a, param7, ca.field_b, param4);
          if (!param12) {
            we.a(-28);
          }
          mh.a(0, param13);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "we.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    final static nc a(String param0, int param1) {
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nc stackIn_26_0 = null;
        nc stackIn_32_0 = null;
        nc stackIn_43_0 = null;
        nc stackIn_48_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ec.field_j;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = dj.field_f;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (34 != param0.charAt(-1 + var2_int)) {
              stackIn_13_0 = ij.field_i;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = ij.field_i;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          if (param1 != 34) {
            stackIn_32_0 = (nc) null;
            return stackIn_32_0;
          }
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_43_0 = ij.field_i;
                return stackIn_43_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (rb.field_f.indexOf(var5Lifetime1) == -1) {
                stackIn_48_0 = ij.field_i;
                return stackIn_48_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("we.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -91) {
          return;
        }
        try {
          ia.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "we.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(byte param0) {
        if (param0 != 79) {
          return 102L;
        }
        return id.a(85) - uk.field_a;
    }

    final static void b(int param0) {
        if (!vg.field_d) {
          throw new IllegalStateException();
        }
        if (param0 < -117) {
          tj.field_K = true;
          gh.a((byte) 59, false);
          cd.field_e = 0;
          return;
        }
        String var2 = (String) null;
        we.a((String) null, 15);
        tj.field_K = true;
        gh.a((byte) 59, false);
        cd.field_e = 0;
    }

    final static void a(int param0) {
        pj.field_a = cg.b(true);
        sd.field_c = new j();
        nf.a(true, (byte) -2, true);
        if (param0 != 0) {
          String var2 = (String) null;
          we.a(27, (String) null);
        }
    }

    final static kc[] a(int param0, int param1) {
        kc[] var4 = new kc[9];
        kc[] var2 = var4;
        int var3 = -115 / ((-7 - param0) / 45);
        var4[4] = te.a(64, -128, param1);
        return var2;
    }

    static {
    }
}
