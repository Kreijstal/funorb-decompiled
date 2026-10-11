/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends gd {
    static boolean field_o;
    static int field_j;
    static String[] field_m;
    static int field_l;
    static String[] field_k;
    static int[][] field_i;
    private static int[][] field_n;

    final static void a(int param0, boolean param1) {
        if (!param1) {
          if (kf.field_U != null) {
            om.a(-46342, kf.field_U);
            kd.field_b.requestFocus();
            kf.field_U.a(wi.field_b, param0 ^ -29472);
            kf.field_U = null;
          }
        } else {
          if (kf.field_U != null) {
            if (!param1 &&
              kf.field_U != null) {
              om.a(-46342, kf.field_U);
              kd.field_b.requestFocus();
              kf.field_U.a(wi.field_b, param0 ^ -29472);
              kf.field_U = null;
            }
          } else {
            if (!of.a(-969)) {
              if (!param1 &&
                kf.field_U != null) {
                om.a(-46342, kf.field_U);
                kd.field_b.requestFocus();
                kf.field_U.a(wi.field_b, param0 ^ -29472);
                kf.field_U = null;
              }
            } else {
              if (hf.a(wi.field_b, 0)) {
                kf.field_U = oc.a(0, 0, 480, -123, wi.field_b, 640);
                if (null != kf.field_U) {
                  am.a(kf.field_U, 114);
                }
              } else {
                if (!param1 &&
                  kf.field_U != null) {
                  om.a(-46342, kf.field_U);
                  kd.field_b.requestFocus();
                  kf.field_U.a(wi.field_b, param0 ^ -29472);
                  kf.field_U = null;
                }
              }
            }
          }
        }
        if (param0 == -29486) {
          return;
        }
        em.b(true);
    }

    final fd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        fd stackIn_3_0 = null;
        fd stackIn_10_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!ik.a(var5, true)) {
            stackIn_3_0 = g.field_k;
            return stackIn_3_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var3_int = mo.a(var6, (byte) -116);
          if (param1 <= 52) {
            var4 = (String) null;
            this.a((String) null, (byte) 76);
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            stackIn_12_0 = tg.field_d;
            return stackIn_12_0;
          }
          stackIn_10_0 = g.field_k;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("em.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String b(boolean param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var12;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        var5 = HoldTheLine.field_D;
        if (!param0) {
          var18 = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
          var1 = var18;
          if (ad.field_c <= 0) {
            return var1;
          }
          var1Lifetime3 = var18 + ":";
          for (var2 = 0; ad.field_c > var2; var2++) {
            var19 = var1Lifetime3 + ' ';
            var3 = rd.field_e.field_i[var2] & 255;
            var4 = var3 >> 4;
            if (10 <= var4) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var3 = var3 & 15;
            var20 = var19 + (char)var4;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var1Lifetime3 = var20 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_o = true;
        var12 = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
        var1Lifetime1 = var12;
        if (ad.field_c <= 0) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var12 + ":";
        for (var2Lifetime1 = 0; ad.field_c > var2Lifetime1; var2Lifetime1++) {
          var16 = var1Lifetime2 + ' ';
          var3Lifetime1 = rd.field_e.field_i[var2Lifetime1] & 255;
          var4Lifetime1 = var3Lifetime1 >> 4;
          if (10 <= var4Lifetime1) {
            var4Lifetime1 += 55;
          } else {
            var4Lifetime1 += 48;
          }
          var3Lifetime1 = var3Lifetime1 & 15;
          var17 = var16 + (char)var4Lifetime1;
          if (var3Lifetime1 < 10) {
            var3Lifetime1 += 48;
          } else {
            var3Lifetime1 += 55;
          }
          var1Lifetime2 = var17 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    public static void g(int param0) {
        field_n = (int[][]) null;
        field_k = null;
        field_m = null;
        int var1 = -100 % ((param0 + 65) / 53);
        field_i = (int[][]) null;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HoldTheLine.field_D;
        try {
          ka.field_b.a(go.field_e, lh.field_b, param0, false);
          ka.field_b.g((byte) -59);
          while (qh.c(-99)) {
            ka.field_b.a(aa.field_n, pk.field_M, (byte) 108);
          }
          if (-1 != v.field_B) {
            var1_int = v.field_B;
            go.a(0, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (aa.field_k) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ak.field_b == sf.field_n) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (!fj.field_o.a(250)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (bb.field_a != sf.field_n) {
            return -1;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "em.V(" + param0 + ')');
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, (byte) 89) == g.field_k) {
            stackIn_2_0 = vd.field_d;
            return stackIn_2_0;
          }
          if (param1) {
            return null;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("em.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    em(nk param0) {
        super(param0);
    }

    static {
        field_n = new int[14][];
        field_i = field_n;
        field_n[7] = new int[]{4};
        field_n[5] = new int[]{25};
        field_n[9] = new int[]{9, 11};
        field_n[12] = new int[]{};
        field_n[10] = new int[]{8};
        field_n[13] = new int[]{22, 23};
        field_n[3] = new int[]{4};
        field_n[1] = new int[]{2, 18, 19, 16, 7};
        field_n[11] = new int[]{};
        field_n[8] = new int[]{4};
        field_n[6] = new int[]{10};
        field_n[2] = new int[]{10};
        field_n[4] = new int[]{25, 26};
        field_n[0] = new int[]{12, 15, 18, 19, 17, 13, 14, 1};
        field_l = -1;
    }
}
