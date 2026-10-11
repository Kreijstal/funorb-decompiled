/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends kl implements ud {
    private int field_I;
    private qi field_X;
    static he[] field_W;
    static he[] field_U;

    public static void n(int param0) {
        field_U = null;
        if (param0 != -1) {
          qg.n((byte) 59);
        }
        field_W = null;
    }

    qg(String param0, fd param1, int param2) {
        super(param0, param1, param2);
    }

    public final qi a(byte param0) {
        int var2 = 90 % ((param0 + 80) / 39);
        return this.field_X;
    }

    final void a(qi param0, byte param1) {
        if (param1 != -57) {
          return;
        }
        try {
          this.field_X = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int n(byte param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (th.a(46)) {
            wg.field_k.c(param0 - 5);
            if (wg.field_k.c((byte) -82)) {
              var1_int = 1;
            }
            if (di.field_c != 13) {
              continue;
            }
            var2 = 1;
          }
          wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), qg.a(ih.field_R, (byte) -112, ae.field_gb));
          if (wg.field_k.c((byte) -82)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            wg.field_k.field_f >= 0) {
            var3 = mi.field_g[wg.field_k.field_f];
            if (var3 == 2 ||
              5 == var3) {
              ch.c(3);
            }
          } else {
            if (var2 != 0 &&
              re.field_g != 2) {
              ch.c(3);
            }
          }
          if (param0 != 46) {
            field_U = (he[]) null;
          }
          if (var3 == 0 &&
            2 == re.field_g) {
            var4 = -aa.field_d + la.a(false);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              jk.a((byte) 49, true, 5);
            }
          }
          stackIn_28_0 = var3;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "qg.B(" + param0 + ')');
        }
    }

    final static bm a(vj param0, String param1, String param2, vj param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -127 / ((param4 - 40) / 53);
          var5_int = param3.a(param2, (byte) -104);
          var7 = param3.a((byte) -66, param1, var5_int);
          stackIn_1_0 = tc.a(var7, param3, var5_int, param0, 65245);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("qg.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        try {
          qf.field_c = param1;
          nd.field_K = param2;
          if (param3 != -11) {
            vj var5 = (vj) null;
            qg.a((String) null, (String) null, 112, (String) null, (vj) null);
          }
          nc.a(j.field_Y, param0, (byte) 77);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qg.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_int = 0;
          var4 = jd.field_N;
          while (var3_int < sg.field_f.length) {
            var5 = lg.field_a[var3_int];
            if (0 > var5) {
              var4 = var4 + s.field_g;
            } else {
              var6 = u.a(sg.field_f[var3_int], true, true);
              var4 = var4 + ig.field_h;
              var7 = -(var6 >> 1) + ji.field_f;
              if (g.a((dg.field_d << 1) + var6, (byte) -108, ni.field_p + (wa.field_N << 1), var4, var7 - dg.field_d, param0, param2)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (ni.field_p + ig.field_h + (wa.field_N << 1));
            }
            var3_int++;
          }
          if (param1 != -112) {
            field_W = (he[]) null;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "qg.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static og l(int param0) {
        if (fk.field_q == pj.field_D) {
          throw new IllegalStateException();
        }
        if (param0 != 19860) {
          return (og) null;
        }
        if (fk.field_q != wg.field_u) {
          return null;
        }
        fk.field_q = pj.field_D;
        return jj.field_d;
    }

    final static void a(od param0, byte param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ah.field_K = param0.j(-788751192) << 5;
          var2_int = param0.l(31760);
          ah.field_K = ah.field_K + (var2_int >> 3);
          d.field_b = (7 & var2_int) << 18;
          d.field_b = d.field_b + (param0.j(-788751192) << 2);
          var2_intLifetime1 = param0.l(31760);
          oh.field_d = (63 & var2_intLifetime1) << 15;
          d.field_b = d.field_b + (var2_intLifetime1 >> 6);
          oh.field_d = oh.field_d + (param0.l(31760) << 7);
          var2_intLifetime2 = param0.l(31760);
          oh.field_d = oh.field_d + (var2_intLifetime2 >> 1);
          if (param1 <= 51) {
            field_W = (he[]) null;
          }
          j.field_e = var2_intLifetime2 << 16 & 65536;
          j.field_e = j.field_e + param0.j(-788751192);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        try {
          super.a(param0, param1, param2, (byte) -128);
          this.field_I = -param1 - this.field_o + ck.field_c;
          if (param3 > -127) {
            qi var6 = (qi) null;
            this.a((qi) null, (byte) -8);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qg.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, String param1, int param2, String param3, vj param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 34) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (param4.a(0)) {
            stackIn_7_0 = param1 + " - " + param4.b(10461, param3) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qg.MA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static vi b(byte param0, String param1) {
        vi stackIn_6_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_16_0 = null;
        int stackIn_24_0 = 0;
        vi stackIn_29_0 = null;
        vi stackIn_42_0 = null;
        vi stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 <= 66) {
            field_U = (he[]) null;
          }
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_6_0 = qj.field_e;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = ej.field_f;
            return stackIn_10_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_16_0 = dh.field_H;
              return stackIn_16_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_29_0 = dh.field_H;
                  return stackIn_29_0;
                }
                var3 = 0;
              } else {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = dh.field_H;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (m.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = dh.field_H;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("qg.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final static int m(int param0) {
        if (param0 != 12484) {
          field_W = (he[]) null;
        }
        return th.field_e;
    }

    final void m(byte param0) {
        super.m((byte) 103);
        if (this.field_X != null) {
          this.field_X.a((byte) 87);
        }
        int var2 = -108 % ((param0 - 35) / 33);
    }

    final String e(int param0) {
        if (!this.field_n) {
          return null;
        }
        if (this.field_v == null) {
          return null;
        }
        oh.a(26500, ob.field_g, this.field_w - this.field_I + ck.field_c);
        if (param0 >= -39) {
          String var3 = (String) null;
          qg.a(false, (String) null, (String) null, (byte) 23);
        }
        return this.field_v;
    }

    static {
    }
}
