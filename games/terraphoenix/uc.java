/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends dh {
    static rh field_n;
    private int field_o;
    static rh field_p;
    static int field_r;
    private qe field_m;
    static String field_q;

    public static void m(int param0) {
        field_p = null;
        field_q = null;
        field_n = null;
    }

    final int a(boolean param0, int param1) {
        int var6 = Terraphoenix.field_V;
        int var3 = ((uc) this).field_o >> 3;
        if (param0) {
            field_q = null;
        }
        int var4 = 8 - (((uc) this).field_o & 7);
        int var5 = 0;
        ((uc) this).field_o = ((uc) this).field_o + param1;
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((ai.field_a[var4] & ((uc) this).field_i[incrementValue$0]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((uc) this).field_i[var3] >> -param1 + var4 & ai.field_a[param1]);
        } else {
            var5 = var5 + (ai.field_a[var4] & ((uc) this).field_i[var3]);
        }
        return var5;
    }

    final static void l(int param0, int param1) {
        int discarded$0 = m.a(1);
    }

    final static bg[] o(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        bg[] var1 = new bg[kf.field_b];
        for (var2 = 0; var2 < kf.field_b; var2++) {
            var1[var2] = new bg(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], qc.field_b[var2], wb.field_a);
        }
        mj.a((byte) 113);
        return var1;
    }

    final static int j(byte param0) {
        return (int)(1000000000L / dm.field_f);
    }

    final void k(int param0) {
        if (param0 != -1694261224) {
            return;
        }
        ((uc) this).field_o = ((uc) this).field_k * 8;
    }

    final static ci[] l(int param0) {
        ci[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Terraphoenix.field_V;
        var1 = new ci[kf.field_b];
        var2 = 0;
        L0: while (true) {
          if (var2 >= kf.field_b) {
            mj.a((byte) 95);
            return var1;
          } else {
            var3 = rf.field_p[var2] * sb.field_m[var2];
            var23 = qc.field_b[var2];
            if (!aa.field_k[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ci(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = wb.field_a[dg.a(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = ug.field_c[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (ci) (Object) new sg(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ei.b(wb.field_a[dg.a((int) var23[var7], 255)], dg.a((int) var24[var7], 255) << 24);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void b(int param0, String param1) {
        try {
            og.field_e = param1;
            int var2_int = -111;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "uc.TA(" + 121 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                int fieldTemp$5 = ((uc) this).field_k;
                ((uc) this).field_k = ((uc) this).field_k + 1;
                param1[param3 + var5_int] = (byte)(((uc) this).field_i[fieldTemp$5] + -((uc) this).field_m.a(112));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("uc.UA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int[] param0, int param1) {
        if (param1 != 16888) {
            return;
        }
        try {
            ((uc) this).field_m = new qe(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "uc.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void k(int param0, int param1) {
        if (param0 != -17410) {
            return;
        }
        int fieldTemp$0 = ((uc) this).field_k;
        ((uc) this).field_k = ((uc) this).field_k + 1;
        ((uc) this).field_i[fieldTemp$0] = (byte)(param1 + ((uc) this).field_m.a(65));
    }

    final void n(int param0) {
        ((uc) this).field_k = (((uc) this).field_o + 7) / param0;
    }

    uc(byte[] param0) {
        super(param0);
    }

    uc(int param0) {
        super(param0);
    }

    final int a(boolean param0) {
        if (param0) {
            return 72;
        }
        int fieldTemp$0 = ((uc) this).field_k;
        ((uc) this).field_k = ((uc) this).field_k + 1;
        return ((uc) this).field_i[fieldTemp$0] - ((uc) this).field_m.a(116) & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new rh(8, 0, 4, 1);
        field_r = -1;
        field_p = new rh(7, 0, 1, 1);
        field_q = "Create a free account to save your game.<br>Saved games can be continued from the title menu.<br><br><col=ff0000>If you do not save your game, your progress will be lost when you leave.";
    }
}
