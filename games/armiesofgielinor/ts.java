/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts {
    static String field_k;
    static String field_a;
    static boolean field_m;
    static String field_g;
    static at field_e;
    int field_n;
    int[] field_i;
    static long field_h;
    static rg field_j;
    static String field_f;
    int field_c;
    static boolean field_l;
    static String field_b;
    static String[] field_d;

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_i) {
          if (0 != this.field_i.length) {
            if (param1 == 29) {
              var3 = 1;
              L0: while (true) {
                if (this.field_i.length > var3) {
                  stackOut_19_0 = this.field_i[var3] + this.field_i[-1 + var3] >> 372070497 ^ -1;
                  stackOut_19_1 = param0 ^ -1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  if (var4 == 0) {
                    if (stackIn_21_0 < stackIn_21_1) {
                      return -1 + var3;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    return stackIn_20_0 + stackIn_20_1;
                  }
                } else {
                  return -1 + this.field_i.length;
                }
              }
            } else {
              ts.a((String) null, 64, -17, 10, 101, -122, -53, 45, 110);
              var3 = 1;
              L1: while (true) {
                if (this.field_i.length > var3) {
                  stackOut_9_0 = this.field_i[var3] + this.field_i[-1 + var3] >> 372070497 ^ -1;
                  stackOut_9_1 = param0 ^ -1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (var4 == 0) {
                    if (stackIn_11_0 < stackIn_11_1) {
                      return -1 + var3;
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    return stackIn_10_0 + stackIn_10_1;
                  }
                } else {
                  return -1 + this.field_i.length;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              sb.field_i.field_X = param0;
              if ((rs.field_t ^ -1) == -3) {
                ed.field_e.field_X = bq.field_d;
                break L1;
              } else {
                ed.field_e.field_X = wq.field_c;
                if (!ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  ed.field_e.field_X = bq.field_d;
                  break L1;
                }
              }
            }
            L2: {
              var9_int = 495;
              var10 = 5;
              mb.field_F.a(param5, -20500, -10 + var9_int, var10, 5);
              qj.field_z.a(param5, -20500, -rb.field_b.field_gb + mb.field_F.field_gb, 0, 0);
              var10 = var10 + (param5 + param2);
              rb.field_b.a(param5, -20500, rb.field_b.field_gb, 0, qj.field_z.field_gb);
              qf.field_e.a(param4, -20500, qf.field_e.j(param7 + -15550), var10, 5);
              var11 = ed.field_e.j(param7 ^ 15717);
              ed.field_e.a(param4, -20500, var11, var10, -5 + (var9_int + -var11));
              if (param7 == 15676) {
                break L2;
              } else {
                ts.b(-109);
                break L2;
              }
            }
            sb.field_i.a(param3, -20500, var9_int, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9_int, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9_int, param8 + -(var12 / 2), -(var9_int / 2) + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var9);
            stackOut_9_1 = new StringBuilder().append("ts.A(");
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
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0) {
        td.field_f = new dg(iw.field_l);
        if (param0 >= -36) {
          field_j = (rg) null;
          td.field_f.a(0, 0);
          td.field_f.b(0);
          return;
        } else {
          td.field_f.a(0, 0);
          td.field_f.b(0);
          return;
        }
    }

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 0) {
          if (this.field_i != null) {
            if (this.field_i.length == 0) {
              return 0;
            } else {
              return this.field_i[this.field_i.length - 1];
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return -103;
        }
    }

    final static void a(om param0, int param1, sl param2) {
        RuntimeException var3 = null;
        String[] var3_array = null;
        int var4 = 0;
        Exception var5 = null;
        int var5_int = 0;
        jd var6 = null;
        sd var6_ref = null;
        int var7 = 0;
        String[] var8 = null;
        sd var9 = null;
        int var10 = 0;
        int var11 = 0;
        ic stackIn_2_0 = null;
        ic stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        String[] stackIn_2_4 = null;
        int stackIn_2_5 = 0;
        int stackIn_2_6 = 0;
        dg stackIn_2_7 = null;
        int stackIn_2_8 = 0;
        int stackIn_2_9 = 0;
        int stackIn_2_10 = 0;
        int stackIn_2_11 = 0;
        int stackIn_2_12 = 0;
        int stackIn_2_13 = 0;
        ic stackIn_3_0 = null;
        ic stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        String[] stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        dg stackIn_3_7 = null;
        int stackIn_3_8 = 0;
        int stackIn_3_9 = 0;
        int stackIn_3_10 = 0;
        int stackIn_3_11 = 0;
        int stackIn_3_12 = 0;
        int stackIn_3_13 = 0;
        ic stackIn_4_0 = null;
        ic stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        String[] stackIn_4_4 = null;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        dg stackIn_4_7 = null;
        int stackIn_4_8 = 0;
        int stackIn_4_9 = 0;
        int stackIn_4_10 = 0;
        int stackIn_4_11 = 0;
        int stackIn_4_12 = 0;
        int stackIn_4_13 = 0;
        ic stackIn_5_0 = null;
        ic stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        String[] stackIn_5_4 = null;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        dg stackIn_5_7 = null;
        int stackIn_5_8 = 0;
        int stackIn_5_9 = 0;
        int stackIn_5_10 = 0;
        int stackIn_5_11 = 0;
        int stackIn_5_12 = 0;
        int stackIn_5_13 = 0;
        int stackIn_5_14 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        Throwable decompiledCaughtException = null;
        ic stackOut_1_0 = null;
        ic stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        String[] stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        int stackOut_1_6 = 0;
        dg stackOut_1_7 = null;
        int stackOut_1_8 = 0;
        int stackOut_1_9 = 0;
        int stackOut_1_10 = 0;
        int stackOut_1_11 = 0;
        int stackOut_1_12 = 0;
        int stackOut_1_13 = 0;
        ic stackOut_2_0 = null;
        ic stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        String[] stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        dg stackOut_2_7 = null;
        int stackOut_2_8 = 0;
        int stackOut_2_9 = 0;
        int stackOut_2_10 = 0;
        int stackOut_2_11 = 0;
        int stackOut_2_12 = 0;
        int stackOut_2_13 = 0;
        ic stackOut_3_0 = null;
        ic stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        String[] stackOut_3_4 = null;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        dg stackOut_3_7 = null;
        int stackOut_3_8 = 0;
        int stackOut_3_9 = 0;
        int stackOut_3_10 = 0;
        int stackOut_3_11 = 0;
        int stackOut_3_12 = 0;
        int stackOut_3_13 = 0;
        int stackOut_3_14 = 0;
        ic stackOut_4_0 = null;
        ic stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        String[] stackOut_4_4 = null;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        dg stackOut_4_7 = null;
        int stackOut_4_8 = 0;
        int stackOut_4_9 = 0;
        int stackOut_4_10 = 0;
        int stackOut_4_11 = 0;
        int stackOut_4_12 = 0;
        int stackOut_4_13 = 0;
        int stackOut_4_14 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                l.field_c = param0;
                pq.field_f = null;
                var8 = param0.e(-23209);
                var3_array = var8;
                r.field_B = var8.length;
                var4 = param0.field_w;
                mg.field_g = param1 + r.field_B;
                td.field_f.a(param0.field_z, 0);
                stackOut_1_0 = null;
                stackOut_1_1 = null;
                stackOut_1_2 = 0;
                stackOut_1_3 = 0;
                stackOut_1_4 = (String[]) (var3_array);
                stackOut_1_5 = var4;
                stackOut_1_6 = 0;
                stackOut_1_7 = td.field_f;
                stackOut_1_8 = param0.field_o;
                stackOut_1_9 = ArmiesOfGielinor.field_K;
                stackOut_1_10 = param0.field_z;
                stackOut_1_11 = 0;
                stackOut_1_12 = 4;
                stackOut_1_13 = 0;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                stackIn_4_4 = stackOut_1_4;
                stackIn_4_5 = stackOut_1_5;
                stackIn_4_6 = stackOut_1_6;
                stackIn_4_7 = stackOut_1_7;
                stackIn_4_8 = stackOut_1_8;
                stackIn_4_9 = stackOut_1_9;
                stackIn_4_10 = stackOut_1_10;
                stackIn_4_11 = stackOut_1_11;
                stackIn_4_12 = stackOut_1_12;
                stackIn_4_13 = stackOut_1_13;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                stackIn_2_2 = stackOut_1_2;
                stackIn_2_3 = stackOut_1_3;
                stackIn_2_4 = stackOut_1_4;
                stackIn_2_5 = stackOut_1_5;
                stackIn_2_6 = stackOut_1_6;
                stackIn_2_7 = stackOut_1_7;
                stackIn_2_8 = stackOut_1_8;
                stackIn_2_9 = stackOut_1_9;
                stackIn_2_10 = stackOut_1_10;
                stackIn_2_11 = stackOut_1_11;
                stackIn_2_12 = stackOut_1_12;
                stackIn_2_13 = stackOut_1_13;
                if (rf.a(27875)) {
                  break L2;
                } else {
                  stackOut_2_0 = null;
                  stackOut_2_1 = null;
                  stackOut_2_2 = stackIn_2_2;
                  stackOut_2_3 = stackIn_2_3;
                  stackOut_2_4 = (String[]) ((Object) stackIn_2_4);
                  stackOut_2_5 = stackIn_2_5;
                  stackOut_2_6 = stackIn_2_6;
                  stackOut_2_7 = (dg) ((Object) stackIn_2_7);
                  stackOut_2_8 = stackIn_2_8;
                  stackOut_2_9 = stackIn_2_9;
                  stackOut_2_10 = stackIn_2_10;
                  stackOut_2_11 = stackIn_2_11;
                  stackOut_2_12 = stackIn_2_12;
                  stackOut_2_13 = stackIn_2_13;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_4_3 = stackOut_2_3;
                  stackIn_4_4 = stackOut_2_4;
                  stackIn_4_5 = stackOut_2_5;
                  stackIn_4_6 = stackOut_2_6;
                  stackIn_4_7 = stackOut_2_7;
                  stackIn_4_8 = stackOut_2_8;
                  stackIn_4_9 = stackOut_2_9;
                  stackIn_4_10 = stackOut_2_10;
                  stackIn_4_11 = stackOut_2_11;
                  stackIn_4_12 = stackOut_2_12;
                  stackIn_4_13 = stackOut_2_13;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  stackIn_3_3 = stackOut_2_3;
                  stackIn_3_4 = stackOut_2_4;
                  stackIn_3_5 = stackOut_2_5;
                  stackIn_3_6 = stackOut_2_6;
                  stackIn_3_7 = stackOut_2_7;
                  stackIn_3_8 = stackOut_2_8;
                  stackIn_3_9 = stackOut_2_9;
                  stackIn_3_10 = stackOut_2_10;
                  stackIn_3_11 = stackOut_2_11;
                  stackIn_3_12 = stackOut_2_12;
                  stackIn_3_13 = stackOut_2_13;
                  if ((hi.field_j ^ -1) > -3) {
                    break L2;
                  } else {
                    stackOut_3_0 = null;
                    stackOut_3_1 = null;
                    stackOut_3_2 = stackIn_3_2;
                    stackOut_3_3 = stackIn_3_3;
                    stackOut_3_4 = (String[]) ((Object) stackIn_3_4);
                    stackOut_3_5 = stackIn_3_5;
                    stackOut_3_6 = stackIn_3_6;
                    stackOut_3_7 = (dg) ((Object) stackIn_3_7);
                    stackOut_3_8 = stackIn_3_8;
                    stackOut_3_9 = stackIn_3_9;
                    stackOut_3_10 = stackIn_3_10;
                    stackOut_3_11 = stackIn_3_11;
                    stackOut_3_12 = stackIn_3_12;
                    stackOut_3_13 = stackIn_3_13;
                    stackOut_3_14 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    stackIn_5_4 = stackOut_3_4;
                    stackIn_5_5 = stackOut_3_5;
                    stackIn_5_6 = stackOut_3_6;
                    stackIn_5_7 = stackOut_3_7;
                    stackIn_5_8 = stackOut_3_8;
                    stackIn_5_9 = stackOut_3_9;
                    stackIn_5_10 = stackOut_3_10;
                    stackIn_5_11 = stackOut_3_11;
                    stackIn_5_12 = stackOut_3_12;
                    stackIn_5_13 = stackOut_3_13;
                    stackIn_5_14 = stackOut_3_14;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = null;
              stackOut_4_1 = null;
              stackOut_4_2 = stackIn_4_2;
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = (String[]) ((Object) stackIn_4_4);
              stackOut_4_5 = stackIn_4_5;
              stackOut_4_6 = stackIn_4_6;
              stackOut_4_7 = (dg) ((Object) stackIn_4_7);
              stackOut_4_8 = stackIn_4_8;
              stackOut_4_9 = stackIn_4_9;
              stackOut_4_10 = stackIn_4_10;
              stackOut_4_11 = stackIn_4_11;
              stackOut_4_12 = stackIn_4_12;
              stackOut_4_13 = stackIn_4_13;
              stackOut_4_14 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              stackIn_5_6 = stackOut_4_6;
              stackIn_5_7 = stackOut_4_7;
              stackIn_5_8 = stackOut_4_8;
              stackIn_5_9 = stackOut_4_9;
              stackIn_5_10 = stackOut_4_10;
              stackIn_5_11 = stackOut_4_11;
              stackIn_5_12 = stackOut_4_12;
              stackIn_5_13 = stackOut_4_13;
              stackIn_5_14 = stackOut_4_14;
              break L1;
            }
            rd.field_j = new ic(stackIn_5_2 != 0, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6 != 0, stackIn_5_7, stackIn_5_8, stackIn_5_9, stackIn_5_10, stackIn_5_11 != 0, stackIn_5_12, stackIn_5_13, stackIn_5_14 != 0, param0);
            rd.field_j.field_xb.field_F = true;
            rd.field_j.field_xb.field_T = new ln[param0.field_B.length];
            var5_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      if (rd.field_j.field_xb.field_T.length <= var5_int) {
                        break L7;
                      } else {
                        var11 = param0.field_w ^ -1;
                        var10 = var5_int ^ -1;
                        if (var7 != 0) {
                          if (var10 == var11) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          L8: {
                            L9: {
                              if (var10 == var11) {
                                break L9;
                              } else {
                                var9 = param0.field_G.field_q[param0.field_B[var5_int]];
                                var6_ref = var9;
                                rd.field_j.field_xb.field_T[var5_int] = var9.field_q;
                                if (var7 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            rd.field_j.field_xb.field_T[var5_int] = ah.field_a;
                            break L8;
                          }
                          var5_int++;
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if ((1 & param0.field_k) == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                  var5_int = -1 + param0.field_B.length;
                  var6 = (jd) ((Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).e((byte) 97));
                  L10: while (true) {
                    if (var6 == null) {
                      break L5;
                    } else {
                      if (var7 != 0) {
                        break L4;
                      } else {
                        L11: {
                          if (var6.field_Y <= 10) {
                            break L11;
                          } else {
                            var6.field_Y = 10;
                            break L11;
                          }
                        }
                        var6 = (jd) ((Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).a((byte) 123));
                        if (var7 == 0) {
                          continue L10;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (param2 != null) {
                  try {
                    L12: {
                      rd.field_j.a((byte) -121, param2, param0);
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var5 = (Exception) (Object) decompiledCaughtException;
                    af.a((Throwable) ((Object) var5), -74, "Error loading quicksave.");
                    return;
                  }
                  break L4;
                } else {
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("ts.E(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          L14: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        field_k = null;
        if (param0 != -26908) {
          field_l = false;
          field_a = null;
          field_d = null;
          field_f = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    ts(int param0, int param1, int param2) {
        this.field_n = param0;
        this.field_i = new int[1 + param2];
        this.field_c = param1;
    }

    static {
        field_a = null;
        field_e = null;
        field_k = "<%0> is already on your ignore list.";
        field_f = "to return to the normal view.";
        field_g = "Won";
        field_b = "\"Slow but sure moves the might of the gods.\"<br>     - Euripides (484 - 406 BC)";
        field_d = new String[]{"OPEN", "TRACK", "MOUNTAINS", "FOREST", "RIVER", "SWAMP", "SEA", "CIRCLE", "HOUSE", "CASTLE", "BRIDGE"};
    }
}
