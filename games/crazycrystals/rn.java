/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends rd {
    static int field_n;
    private int field_l;
    static int[] field_j;
    static jg[] field_o;
    private int field_m;
    static ko field_p;
    static bf field_r;
    static String field_q;
    static vc field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        mg discarded$2 = null;
        RuntimeException var6 = null;
        String var7 = null;
        mi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$2 = rn.a(-72, true, 42L, (String) null, (String) null);
                break L1;
              }
            }
            this.field_l = this.field_l + param3;
            this.field_m = this.field_m + 1;
            stackOut_2_0 = new mi(bm.field_g, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("rn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (f) ((Object) stackIn_3_0);
    }

    final static String[] a(String param0, byte param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = an.field_q.a(param0, 148);
            var3 = new String[var2_int];
            discarded$2 = an.field_q.a(param0, new int[]{148}, var3);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                var4 = -61 / ((param1 - 30) / 40);
                stackOut_7_0 = (String[]) (var3);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: while (true) {
                  var5 = var3[var4].indexOf("<br>");
                  if (var5 >= 0) {
                    var3[var4] = var3[var4].substring(0, var5) + var3[var4].substring(4 + var5);
                    continue L2;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("rn.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0) {
        tb.field_d.a(ad.field_k, 100, 48 * gi.field_m * this.field_m, this.field_l / this.field_m);
        this.field_m = 0;
        int var2 = -42 / ((29 - param0) / 42);
        this.field_l = 0;
    }

    final pb b(byte param0) {
        f discarded$0 = null;
        if (param0 >= -127) {
            ta var3 = (ta) null;
            discarded$0 = this.a(true, 103, 109, -114, (ta) null);
        }
        return (pb) ((Object) new cl());
    }

    final static mg a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        uh stackIn_5_0 = null;
        bq stackIn_7_0 = null;
        fa stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bq stackOut_6_0 = null;
        fa stackOut_10_0 = null;
        uh stackOut_4_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (-1L != (param2 ^ -1L)) {
                break L1;
              } else {
                if (param4 != null) {
                  stackOut_6_0 = new bq(param4, param3);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  field_o = (jg[]) null;
                  break L2;
                }
              }
              stackOut_10_0 = new fa(param2, param3);
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_4_0 = new uh(param2, param3);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("rn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mg) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (mg) ((Object) stackIn_7_0);
          } else {
            return (mg) ((Object) stackIn_11_0);
          }
        }
    }

    public static void c(int param0) {
        String discarded$0 = null;
        field_r = null;
        field_j = null;
        field_o = null;
        field_p = null;
        if (param0 >= -72) {
            discarded$0 = rn.d(-52);
        }
        field_q = null;
        field_k = null;
    }

    rn() {
        this.field_l = 0;
        this.field_m = 0;
    }

    final static String d(int param0) {
        if (param0 < (eq.field_j ^ -1)) {
            return hd.field_b;
        }
        if (null != be.field_e) {
            if (!be.field_e.a((byte) 102)) {
                return jg.field_h;
            }
            return ge.field_a;
        }
        if (!rb.field_k.a((byte) 102)) {
            return re.field_n;
        }
        if (!rb.field_k.a(-20402, "commonui")) {
            return dp.field_j + " - " + rb.field_k.b("commonui", -38) + "%";
        }
        if (!(ok.field_c.a((byte) 102))) {
            return ld.field_w;
        }
        if (!ok.field_c.a(param0 ^ 20403, "commonui")) {
            return jn.field_k + " - " + ok.field_c.b("commonui", -60) + "%";
        }
        if (!dd.field_a.a((byte) 102)) {
            return gf.field_d;
        }
        if (!dd.field_a.a(false)) {
            return l.field_a + " - " + dd.field_a.b(3492) + "%";
        }
        return wp.field_a;
    }

    static {
        int var0 = 0;
        field_j = new int[16];
        for (var0 = 0; 16 > var0; var0++) {
            field_j[var0] = 198149 * var0;
        }
        field_q = null;
        field_r = new bf();
    }
}
