/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hj extends IOException {
    static String field_e;
    static int[] field_a;
    static volatile boolean field_d;
    static String field_c;
    static int field_b;

    final static void a(dj param0, eg param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        oo var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        dj var12 = null;
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
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = gm.field_f;
            co.field_f = new kc(0L, (kc) null);
            if (param1 != null) {
              param1.field_h = false;
              param1.field_f = 0;
              bg.field_d = new kg(var3_int, param1, param1);
              th.field_d = new gn(var3_int, param1, param1, new la());
              var4 = gj.b(param2 ^ -20419);
              if (var4 == null) {
                var11 = (Throwable) null;
                jh.a((Throwable) null, "QC2", (byte) 20);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ff.a((byte) 91, var4);
                var12 = (dj) null;
                mj.field_z = ck.a(65793, 5138823, 65793, 8947848, 1513239, 4020342, 65793, (dj) null, 97, 0, 2245737, 1513239, 1127256);
                if (param2 == 3896) {
                  gl.field_c = ck.a(0, 0, 0, 0, 0, 0, 0, param0, 112, 16764006, 0, 0, 0);
                  ab.field_p = ck.a(0, 0, 0, 0, 0, 0, 0, param0, 81, 16777215, 0, 0, 0);
                  var5 = de.field_e;
                  var6 = de.field_j;
                  var16 = de.field_l;
                  ql.field_c = new qb(10, 14);
                  ql.field_c.a();
                  var8 = 2;
                  L1: while (true) {
                    if ((var8 ^ -1) <= -8) {
                      de.a(var16, var5, var6);
                      ag.field_C = bl.a(true, gl.field_c, ab.field_p, var4, mj.field_z);
                      co.field_f.field_G = new vn();
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      de.d(var8, 1 + var8, -(var8 << 886051649) + 14, 16777215);
                      var8++;
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              var10 = (Throwable) null;
              jh.a((Throwable) null, "QC1", (byte) 20);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("hj.B(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        Object var2 = null;
        ml var3 = null;
        ml var4 = null;
        int var5 = 0;
        vn var6 = null;
        nf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        nf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        nf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        nf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        int stackIn_16_8 = 0;
        nf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        nf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        int stackIn_18_9 = 0;
        nf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        int stackIn_19_8 = 0;
        nf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        int stackIn_20_7 = 0;
        int stackIn_20_8 = 0;
        nf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_21_8 = 0;
        int stackIn_21_9 = 0;
        nf stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        int stackIn_23_8 = 0;
        nf stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        nf stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        nf stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        nf stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        nf stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        int stackIn_28_9 = 0;
        nf stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        nf stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        int stackIn_30_8 = 0;
        nf stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int stackIn_31_8 = 0;
        int stackIn_31_9 = 0;
        RuntimeException decompiledCaughtException = null;
        nf stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        nf stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        int stackOut_24_9 = 0;
        nf stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        nf stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        nf stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        int stackOut_27_9 = 0;
        nf stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        int stackOut_26_9 = 0;
        nf stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        nf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int stackOut_30_8 = 0;
        int stackOut_30_9 = 0;
        nf stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int stackOut_29_8 = 0;
        int stackOut_29_9 = 0;
        nf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        nf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        int stackOut_14_9 = 0;
        nf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        nf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        int stackOut_15_8 = 0;
        nf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        int stackOut_17_8 = 0;
        int stackOut_17_9 = 0;
        nf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        int stackOut_16_9 = 0;
        nf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        int stackOut_18_8 = 0;
        nf stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        int stackOut_20_9 = 0;
        nf stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        int stackOut_19_7 = 0;
        int stackOut_19_8 = 0;
        int stackOut_19_9 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = rk.field_O.g((byte) 101);
              var2 = null;
              var3 = (ml) ((Object) var6.b(param0 + 33225));
              if (param0 == -20602) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                L3: {
                  var4 = rk.field_O.a(0, true);
                  if (var2 == null) {
                    break L3;
                  } else {
                    L4: {
                      rk.field_O.c(-4207, ((ml) (var2)).field_T);
                      rk.field_O.a(((ml) (var2)).field_T, 157, (byte) 0, 0, 0, 0, 0, ((ml) (var2)).field_T, 0);
                      if (100 >= Math.abs(var4.field_lb + -((ml) (var2)).field_lb)) {
                        L5: {
                          stackOut_22_0 = rk.field_O;
                          stackOut_22_1 = ((ml) (var2)).field_T;
                          stackOut_22_2 = 158;
                          stackOut_22_3 = -115;
                          stackOut_22_4 = 32;
                          stackOut_22_5 = var4.field_lb;
                          stackOut_22_6 = var4.field_db;
                          stackOut_22_7 = 0;
                          stackOut_22_8 = ((ml) (var2)).field_T;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          stackIn_24_2 = stackOut_22_2;
                          stackIn_24_3 = stackOut_22_3;
                          stackIn_24_4 = stackOut_22_4;
                          stackIn_24_5 = stackOut_22_5;
                          stackIn_24_6 = stackOut_22_6;
                          stackIn_24_7 = stackOut_22_7;
                          stackIn_24_8 = stackOut_22_8;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          stackIn_23_2 = stackOut_22_2;
                          stackIn_23_3 = stackOut_22_3;
                          stackIn_23_4 = stackOut_22_4;
                          stackIn_23_5 = stackOut_22_5;
                          stackIn_23_6 = stackOut_22_6;
                          stackIn_23_7 = stackOut_22_7;
                          stackIn_23_8 = stackOut_22_8;
                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackOut_24_0 = (nf) ((Object) stackIn_24_0);
                            stackOut_24_1 = stackIn_24_1;
                            stackOut_24_2 = stackIn_24_2;
                            stackOut_24_3 = stackIn_24_3;
                            stackOut_24_4 = stackIn_24_4;
                            stackOut_24_5 = stackIn_24_5;
                            stackOut_24_6 = stackIn_24_6;
                            stackOut_24_7 = stackIn_24_7;
                            stackOut_24_8 = stackIn_24_8;
                            stackOut_24_9 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            stackIn_25_2 = stackOut_24_2;
                            stackIn_25_3 = stackOut_24_3;
                            stackIn_25_4 = stackOut_24_4;
                            stackIn_25_5 = stackOut_24_5;
                            stackIn_25_6 = stackOut_24_6;
                            stackIn_25_7 = stackOut_24_7;
                            stackIn_25_8 = stackOut_24_8;
                            stackIn_25_9 = stackOut_24_9;
                            break L5;
                          } else {
                            stackOut_23_0 = (nf) ((Object) stackIn_23_0);
                            stackOut_23_1 = stackIn_23_1;
                            stackOut_23_2 = stackIn_23_2;
                            stackOut_23_3 = stackIn_23_3;
                            stackOut_23_4 = stackIn_23_4;
                            stackOut_23_5 = stackIn_23_5;
                            stackOut_23_6 = stackIn_23_6;
                            stackOut_23_7 = stackIn_23_7;
                            stackOut_23_8 = stackIn_23_8;
                            stackOut_23_9 = 1;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            stackIn_25_2 = stackOut_23_2;
                            stackIn_25_3 = stackOut_23_3;
                            stackIn_25_4 = stackOut_23_4;
                            stackIn_25_5 = stackOut_23_5;
                            stackIn_25_6 = stackOut_23_6;
                            stackIn_25_7 = stackOut_23_7;
                            stackIn_25_8 = stackOut_23_8;
                            stackIn_25_9 = stackOut_23_9;
                            break L5;
                          }
                        }
                        L6: {
                          ((nf) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, (byte) stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, stackIn_25_9);
                          stackOut_25_0 = rk.field_O;
                          stackOut_25_1 = ((ml) (var2)).field_T;
                          stackOut_25_2 = 158;
                          stackOut_25_3 = 34;
                          stackOut_25_4 = 0;
                          stackOut_25_5 = var4.field_lb;
                          stackOut_25_6 = var4.field_db;
                          stackOut_25_7 = 0;
                          stackOut_25_8 = ((ml) (var2)).field_T;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackIn_27_3 = stackOut_25_3;
                          stackIn_27_4 = stackOut_25_4;
                          stackIn_27_5 = stackOut_25_5;
                          stackIn_27_6 = stackOut_25_6;
                          stackIn_27_7 = stackOut_25_7;
                          stackIn_27_8 = stackOut_25_8;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          stackIn_26_3 = stackOut_25_3;
                          stackIn_26_4 = stackOut_25_4;
                          stackIn_26_5 = stackOut_25_5;
                          stackIn_26_6 = stackOut_25_6;
                          stackIn_26_7 = stackOut_25_7;
                          stackIn_26_8 = stackOut_25_8;
                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackOut_27_0 = (nf) ((Object) stackIn_27_0);
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = stackIn_27_2;
                            stackOut_27_3 = stackIn_27_3;
                            stackOut_27_4 = stackIn_27_4;
                            stackOut_27_5 = stackIn_27_5;
                            stackOut_27_6 = stackIn_27_6;
                            stackOut_27_7 = stackIn_27_7;
                            stackOut_27_8 = stackIn_27_8;
                            stackOut_27_9 = 5;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            stackIn_28_2 = stackOut_27_2;
                            stackIn_28_3 = stackOut_27_3;
                            stackIn_28_4 = stackOut_27_4;
                            stackIn_28_5 = stackOut_27_5;
                            stackIn_28_6 = stackOut_27_6;
                            stackIn_28_7 = stackOut_27_7;
                            stackIn_28_8 = stackOut_27_8;
                            stackIn_28_9 = stackOut_27_9;
                            break L6;
                          } else {
                            stackOut_26_0 = (nf) ((Object) stackIn_26_0);
                            stackOut_26_1 = stackIn_26_1;
                            stackOut_26_2 = stackIn_26_2;
                            stackOut_26_3 = stackIn_26_3;
                            stackOut_26_4 = stackIn_26_4;
                            stackOut_26_5 = stackIn_26_5;
                            stackOut_26_6 = stackIn_26_6;
                            stackOut_26_7 = stackIn_26_7;
                            stackOut_26_8 = stackIn_26_8;
                            stackOut_26_9 = 3;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_28_1 = stackOut_26_1;
                            stackIn_28_2 = stackOut_26_2;
                            stackIn_28_3 = stackOut_26_3;
                            stackIn_28_4 = stackOut_26_4;
                            stackIn_28_5 = stackOut_26_5;
                            stackIn_28_6 = stackOut_26_6;
                            stackIn_28_7 = stackOut_26_7;
                            stackIn_28_8 = stackOut_26_8;
                            stackIn_28_9 = stackOut_26_9;
                            break L6;
                          }
                        }
                        L7: {
                          ((nf) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, (byte) stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, stackIn_28_9);
                          stackOut_28_0 = rk.field_O;
                          stackOut_28_1 = ((ml) (var2)).field_T;
                          stackOut_28_2 = 158;
                          stackOut_28_3 = -88;
                          stackOut_28_4 = 0;
                          stackOut_28_5 = var4.field_lb;
                          stackOut_28_6 = var4.field_db;
                          stackOut_28_7 = 0;
                          stackOut_28_8 = ((ml) (var2)).field_T;
                          stackIn_30_0 = stackOut_28_0;
                          stackIn_30_1 = stackOut_28_1;
                          stackIn_30_2 = stackOut_28_2;
                          stackIn_30_3 = stackOut_28_3;
                          stackIn_30_4 = stackOut_28_4;
                          stackIn_30_5 = stackOut_28_5;
                          stackIn_30_6 = stackOut_28_6;
                          stackIn_30_7 = stackOut_28_7;
                          stackIn_30_8 = stackOut_28_8;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          stackIn_29_2 = stackOut_28_2;
                          stackIn_29_3 = stackOut_28_3;
                          stackIn_29_4 = stackOut_28_4;
                          stackIn_29_5 = stackOut_28_5;
                          stackIn_29_6 = stackOut_28_6;
                          stackIn_29_7 = stackOut_28_7;
                          stackIn_29_8 = stackOut_28_8;
                          if (var4.field_lb < ((ml) (var2)).field_lb) {
                            stackOut_30_0 = (nf) ((Object) stackIn_30_0);
                            stackOut_30_1 = stackIn_30_1;
                            stackOut_30_2 = stackIn_30_2;
                            stackOut_30_3 = stackIn_30_3;
                            stackOut_30_4 = stackIn_30_4;
                            stackOut_30_5 = stackIn_30_5;
                            stackOut_30_6 = stackIn_30_6;
                            stackOut_30_7 = stackIn_30_7;
                            stackOut_30_8 = stackIn_30_8;
                            stackOut_30_9 = 2;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            stackIn_31_2 = stackOut_30_2;
                            stackIn_31_3 = stackOut_30_3;
                            stackIn_31_4 = stackOut_30_4;
                            stackIn_31_5 = stackOut_30_5;
                            stackIn_31_6 = stackOut_30_6;
                            stackIn_31_7 = stackOut_30_7;
                            stackIn_31_8 = stackOut_30_8;
                            stackIn_31_9 = stackOut_30_9;
                            break L7;
                          } else {
                            stackOut_29_0 = (nf) ((Object) stackIn_29_0);
                            stackOut_29_1 = stackIn_29_1;
                            stackOut_29_2 = stackIn_29_2;
                            stackOut_29_3 = stackIn_29_3;
                            stackOut_29_4 = stackIn_29_4;
                            stackOut_29_5 = stackIn_29_5;
                            stackOut_29_6 = stackIn_29_6;
                            stackOut_29_7 = stackIn_29_7;
                            stackOut_29_8 = stackIn_29_8;
                            stackOut_29_9 = 4;
                            stackIn_31_0 = stackOut_29_0;
                            stackIn_31_1 = stackOut_29_1;
                            stackIn_31_2 = stackOut_29_2;
                            stackIn_31_3 = stackOut_29_3;
                            stackIn_31_4 = stackOut_29_4;
                            stackIn_31_5 = stackOut_29_5;
                            stackIn_31_6 = stackOut_29_6;
                            stackIn_31_7 = stackOut_29_7;
                            stackIn_31_8 = stackOut_29_8;
                            stackIn_31_9 = stackOut_29_9;
                            break L7;
                          }
                        }
                        ((nf) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, (byte) stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_31_7, stackIn_31_8, stackIn_31_9);
                        rk.field_O.a(((ml) (var2)).field_T, 37, (byte) -100, 32, var4.field_lb, var4.field_db, var4.field_db, ((ml) (var2)).field_T, var4.field_lb);
                        break L4;
                      } else {
                        L8: {
                          stackOut_12_0 = rk.field_O;
                          stackOut_12_1 = ((ml) (var2)).field_T;
                          stackOut_12_2 = 158;
                          stackOut_12_3 = -92;
                          stackOut_12_4 = 0;
                          stackOut_12_5 = var4.field_lb;
                          stackOut_12_6 = var4.field_db;
                          stackOut_12_7 = 0;
                          stackOut_12_8 = ((ml) (var2)).field_T;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_14_3 = stackOut_12_3;
                          stackIn_14_4 = stackOut_12_4;
                          stackIn_14_5 = stackOut_12_5;
                          stackIn_14_6 = stackOut_12_6;
                          stackIn_14_7 = stackOut_12_7;
                          stackIn_14_8 = stackOut_12_8;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          stackIn_13_3 = stackOut_12_3;
                          stackIn_13_4 = stackOut_12_4;
                          stackIn_13_5 = stackOut_12_5;
                          stackIn_13_6 = stackOut_12_6;
                          stackIn_13_7 = stackOut_12_7;
                          stackIn_13_8 = stackOut_12_8;
                          if (((ml) (var2)).field_lb <= var4.field_lb) {
                            stackOut_14_0 = (nf) ((Object) stackIn_14_0);
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = stackIn_14_3;
                            stackOut_14_4 = stackIn_14_4;
                            stackOut_14_5 = stackIn_14_5;
                            stackOut_14_6 = stackIn_14_6;
                            stackOut_14_7 = stackIn_14_7;
                            stackOut_14_8 = stackIn_14_8;
                            stackOut_14_9 = 4;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            stackIn_15_7 = stackOut_14_7;
                            stackIn_15_8 = stackOut_14_8;
                            stackIn_15_9 = stackOut_14_9;
                            break L8;
                          } else {
                            stackOut_13_0 = (nf) ((Object) stackIn_13_0);
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = stackIn_13_2;
                            stackOut_13_3 = stackIn_13_3;
                            stackOut_13_4 = stackIn_13_4;
                            stackOut_13_5 = stackIn_13_5;
                            stackOut_13_6 = stackIn_13_6;
                            stackOut_13_7 = stackIn_13_7;
                            stackOut_13_8 = stackIn_13_8;
                            stackOut_13_9 = 2;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            stackIn_15_7 = stackOut_13_7;
                            stackIn_15_8 = stackOut_13_8;
                            stackIn_15_9 = stackOut_13_9;
                            break L8;
                          }
                        }
                        L9: {
                          ((nf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, (byte) stackIn_15_3, stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7, stackIn_15_8, stackIn_15_9);
                          stackOut_15_0 = rk.field_O;
                          stackOut_15_1 = ((ml) (var2)).field_T;
                          stackOut_15_2 = 158;
                          stackOut_15_3 = 83;
                          stackOut_15_4 = 32;
                          stackOut_15_5 = var4.field_lb;
                          stackOut_15_6 = var4.field_db;
                          stackOut_15_7 = 0;
                          stackOut_15_8 = ((ml) (var2)).field_T;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          stackIn_17_5 = stackOut_15_5;
                          stackIn_17_6 = stackOut_15_6;
                          stackIn_17_7 = stackOut_15_7;
                          stackIn_17_8 = stackOut_15_8;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          stackIn_16_4 = stackOut_15_4;
                          stackIn_16_5 = stackOut_15_5;
                          stackIn_16_6 = stackOut_15_6;
                          stackIn_16_7 = stackOut_15_7;
                          stackIn_16_8 = stackOut_15_8;
                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackOut_17_0 = (nf) ((Object) stackIn_17_0);
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = stackIn_17_2;
                            stackOut_17_3 = stackIn_17_3;
                            stackOut_17_4 = stackIn_17_4;
                            stackOut_17_5 = stackIn_17_5;
                            stackOut_17_6 = stackIn_17_6;
                            stackOut_17_7 = stackIn_17_7;
                            stackOut_17_8 = stackIn_17_8;
                            stackOut_17_9 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            stackIn_18_3 = stackOut_17_3;
                            stackIn_18_4 = stackOut_17_4;
                            stackIn_18_5 = stackOut_17_5;
                            stackIn_18_6 = stackOut_17_6;
                            stackIn_18_7 = stackOut_17_7;
                            stackIn_18_8 = stackOut_17_8;
                            stackIn_18_9 = stackOut_17_9;
                            break L9;
                          } else {
                            stackOut_16_0 = (nf) ((Object) stackIn_16_0);
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = stackIn_16_2;
                            stackOut_16_3 = stackIn_16_3;
                            stackOut_16_4 = stackIn_16_4;
                            stackOut_16_5 = stackIn_16_5;
                            stackOut_16_6 = stackIn_16_6;
                            stackOut_16_7 = stackIn_16_7;
                            stackOut_16_8 = stackIn_16_8;
                            stackOut_16_9 = 0;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            stackIn_18_3 = stackOut_16_3;
                            stackIn_18_4 = stackOut_16_4;
                            stackIn_18_5 = stackOut_16_5;
                            stackIn_18_6 = stackOut_16_6;
                            stackIn_18_7 = stackOut_16_7;
                            stackIn_18_8 = stackOut_16_8;
                            stackIn_18_9 = stackOut_16_9;
                            break L9;
                          }
                        }
                        L10: {
                          ((nf) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, (byte) stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, stackIn_18_9);
                          stackOut_18_0 = rk.field_O;
                          stackOut_18_1 = ((ml) (var2)).field_T;
                          stackOut_18_2 = 158;
                          stackOut_18_3 = -117;
                          stackOut_18_4 = 0;
                          stackOut_18_5 = var4.field_lb;
                          stackOut_18_6 = var4.field_db;
                          stackOut_18_7 = 0;
                          stackOut_18_8 = ((ml) (var2)).field_T;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          stackIn_20_3 = stackOut_18_3;
                          stackIn_20_4 = stackOut_18_4;
                          stackIn_20_5 = stackOut_18_5;
                          stackIn_20_6 = stackOut_18_6;
                          stackIn_20_7 = stackOut_18_7;
                          stackIn_20_8 = stackOut_18_8;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          stackIn_19_3 = stackOut_18_3;
                          stackIn_19_4 = stackOut_18_4;
                          stackIn_19_5 = stackOut_18_5;
                          stackIn_19_6 = stackOut_18_6;
                          stackIn_19_7 = stackOut_18_7;
                          stackIn_19_8 = stackOut_18_8;
                          if (((ml) (var2)).field_lb <= var4.field_lb) {
                            stackOut_20_0 = (nf) ((Object) stackIn_20_0);
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = stackIn_20_2;
                            stackOut_20_3 = stackIn_20_3;
                            stackOut_20_4 = stackIn_20_4;
                            stackOut_20_5 = stackIn_20_5;
                            stackOut_20_6 = stackIn_20_6;
                            stackOut_20_7 = stackIn_20_7;
                            stackOut_20_8 = stackIn_20_8;
                            stackOut_20_9 = 5;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            stackIn_21_3 = stackOut_20_3;
                            stackIn_21_4 = stackOut_20_4;
                            stackIn_21_5 = stackOut_20_5;
                            stackIn_21_6 = stackOut_20_6;
                            stackIn_21_7 = stackOut_20_7;
                            stackIn_21_8 = stackOut_20_8;
                            stackIn_21_9 = stackOut_20_9;
                            break L10;
                          } else {
                            stackOut_19_0 = (nf) ((Object) stackIn_19_0);
                            stackOut_19_1 = stackIn_19_1;
                            stackOut_19_2 = stackIn_19_2;
                            stackOut_19_3 = stackIn_19_3;
                            stackOut_19_4 = stackIn_19_4;
                            stackOut_19_5 = stackIn_19_5;
                            stackOut_19_6 = stackIn_19_6;
                            stackOut_19_7 = stackIn_19_7;
                            stackOut_19_8 = stackIn_19_8;
                            stackOut_19_9 = 3;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            stackIn_21_3 = stackOut_19_3;
                            stackIn_21_4 = stackOut_19_4;
                            stackIn_21_5 = stackOut_19_5;
                            stackIn_21_6 = stackOut_19_6;
                            stackIn_21_7 = stackOut_19_7;
                            stackIn_21_8 = stackOut_19_8;
                            stackIn_21_9 = stackOut_19_9;
                            break L10;
                          }
                        }
                        ((nf) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, (byte) stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, stackIn_21_7, stackIn_21_8, stackIn_21_9);
                        rk.field_O.a(((ml) (var2)).field_T, 36, (byte) 96, 64, var4.field_lb, var4.field_db, var4.field_db, ((ml) (var2)).field_T, var4.field_lb);
                        break L4;
                      }
                    }
                    rk.field_O.a(((ml) (var2)).field_T, 157, (byte) 27, 0, 0, 0, 0, ((ml) (var2)).field_T, 0);
                    break L3;
                  }
                }
                rk.field_O.e(true);
                rk.field_O.c(-4207, 3);
                break L0;
              } else {
                L11: {
                  if (-1 == (var3.y(17571) ^ -1)) {
                    break L11;
                  } else {
                    L12: {
                      if (Math.random() < 0.3) {
                        break L12;
                      } else {
                        if (var2 == null) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var2 = var3;
                    break L11;
                  }
                }
                var3 = (ml) ((Object) var6.a(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "hj.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 93) {
            nf var2 = (nf) null;
            hj.a((ll) null, -60, 88, (nf) null, (byte) -107, -114, 54);
        }
        field_c = null;
        field_e = null;
    }

    final static void a(ll param0, int param1, int param2, nf param3, byte param4, int param5, int param6) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param2 = param2 >> 1;
            param1 = param1 >> 1;
            param5 = param5 >> 1;
            if (param1 == 0) {
              L1: {
                if ((param5 ^ -1) > -1) {
                  break L1;
                } else {
                  if (0 > param2) {
                    break L1;
                  } else {
                    if (param5 >= param3.field_hb) {
                      break L1;
                    } else {
                      if (param2 < param3.field_Hb) {
                        var7_int = param5 - -(param3.field_hb * param2);
                        param0.field_m[var7_int] = (byte)param4;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((param1 ^ -1) > -1) {
                  param1 = -param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var7_int = param2 + -param1;
                if (0 > var7_int) {
                  var7_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8 = 1 + param2 - -param1;
                if (param3.field_Hb - 1 < var8) {
                  var8 = param3.field_Hb - 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              var9 = var7_int;
              var10 = param1 * param1;
              if (param6 <= -75) {
                L5: {
                  var11 = 0;
                  var12 = param2 + -var9;
                  var13 = var12 * var12;
                  var14 = var13 + -var12;
                  if (param2 > var8) {
                    param2 = var8;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: while (true) {
                  if (var9 >= param2) {
                    var11 = param1;
                    var12 = var9 - param2;
                    var14 = var12 * var12 + var10;
                    var13 = var14 + -var11;
                    var14 = var14 - var12;
                    L7: while (true) {
                      if (var8 <= var9) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L8: while (true) {
                          L9: {
                            if (var14 <= var10) {
                              break L9;
                            } else {
                              if (var10 >= var13) {
                                break L9;
                              } else {
                                incrementValue$6 = var11;
                                var11--;
                                var14 = var14 - (incrementValue$6 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L8;
                              }
                            }
                          }
                          L10: {
                            var15 = -var11 + param5;
                            if (var15 < 0) {
                              var15 = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var16 = param5 - -var11;
                            if (var16 > param3.field_hb + -1) {
                              var16 = param3.field_hb - 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var17 = var15 + var9 * param3.field_hb;
                          var18 = var15;
                          L12: while (true) {
                            if (var16 < var18) {
                              var14 = var14 + (var12 - -var12);
                              var9++;
                              incrementValue$7 = var12;
                              var12++;
                              var13 = var13 + (incrementValue$7 + var12);
                              continue L7;
                            } else {
                              incrementValue$8 = var17;
                              var17++;
                              param0.field_m[incrementValue$8] = (byte)param4;
                              var18++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L13: while (true) {
                      L14: {
                        if (var10 >= var14) {
                          break L14;
                        } else {
                          if (var10 < var13) {
                            L15: {
                              var15 = param5 + (-var11 - -1);
                              if (var15 < 0) {
                                var15 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              var16 = var11 + param5;
                              if (var16 > -1 + param3.field_hb) {
                                var16 = -1 + param3.field_hb;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var17 = var15 - -(param3.field_hb * var9);
                            var9++;
                            var18 = var15;
                            L17: while (true) {
                              if (var16 <= var18) {
                                incrementValue$9 = var12;
                                var12--;
                                var13 = var13 - (incrementValue$9 + var12);
                                var14 = var14 - (var12 + var12);
                                continue L6;
                              } else {
                                incrementValue$10 = var17;
                                var17++;
                                param0.field_m[incrementValue$10] = (byte)param4;
                                var18++;
                                continue L17;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      var13 = var13 + (var11 + var11);
                      incrementValue$11 = var11;
                      var11++;
                      var14 = var14 + (incrementValue$11 + var11);
                      continue L13;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var7);
            stackOut_55_1 = new StringBuilder().append("hj.C(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L18;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L18;
            }
          }
          L19: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param3 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L19;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L19;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    hj(String param0) {
        super(param0);
    }

    final static qb a(int param0, eg param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -10) {
                break L1;
              } else {
                field_b = -93;
                break L1;
              }
            }
            if (fc.a(-124, param1, param0, param2)) {
              stackOut_5_0 = i.a(false);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("hj.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_e = "Apply";
        field_a = new int[4];
        field_d = true;
        field_c = "Play the game without logging in just yet";
    }
}
