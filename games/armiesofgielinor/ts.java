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
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((ts) this).field_i) {
          if (0 != ((ts) this).field_i.length) {
            if (param1 == 29) {
              var3 = 1;
              L0: while (true) {
                if (((ts) this).field_i.length > var3) {
                  if (((ts) this).field_i[var3] + ((ts) this).field_i[-1 + var3] >> 372070497 > param0) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return -1 + ((ts) this).field_i.length;
                }
              }
            } else {
              ts.a((String) null, 64, -17, 10, 101, -122, -53, 45, 110);
              var3 = 1;
              L1: while (true) {
                if (((ts) this).field_i.length > var3) {
                  if (((ts) this).field_i[var3] + ((ts) this).field_i[-1 + var3] >> 372070497 > param0) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return -1 + ((ts) this).field_i.length;
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
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sb.field_i.field_X = param0;
        if ((rs.field_t ^ -1) == -3) {
          ed.field_e.field_X = bq.field_d;
          var9 = 495;
          var10 = 5;
          mb.field_F.a(param5, -20500, -10 + var9, var10, 5);
          qj.field_z.a(param5, -20500, -rb.field_b.field_gb + mb.field_F.field_gb, 0, 0);
          var10 = var10 + (param5 + param2);
          rb.field_b.a(param5, -20500, rb.field_b.field_gb, 0, qj.field_z.field_gb);
          qf.field_e.a(param4, -20500, qf.field_e.j(param7 + -15550), var10, 5);
          var11 = ed.field_e.j(param7 ^ 15717);
          ed.field_e.a(param4, -20500, var11, var10, -5 + (var9 + -var11));
          if (param7 == 15676) {
            sb.field_i.a(param3, -20500, var9, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9, param8 + -(var12 / 2), -(var9 / 2) + param1);
            return;
          } else {
            ts.b(-109);
            sb.field_i.a(param3, -20500, var9, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9, param8 + -(var12 / 2), -(var9 / 2) + param1);
            return;
          }
        } else {
          ed.field_e.field_X = wq.field_c;
          var9 = 495;
          var10 = 5;
          mb.field_F.a(param5, -20500, -10 + var9, var10, 5);
          qj.field_z.a(param5, -20500, -rb.field_b.field_gb + mb.field_F.field_gb, 0, 0);
          var10 = var10 + (param5 + param2);
          rb.field_b.a(param5, -20500, rb.field_b.field_gb, 0, qj.field_z.field_gb);
          qf.field_e.a(param4, -20500, qf.field_e.j(param7 + -15550), var10, 5);
          var11 = ed.field_e.j(param7 ^ 15717);
          ed.field_e.a(param4, -20500, var11, var10, -5 + (var9 + -var11));
          if (param7 == 15676) {
            sb.field_i.a(param3, -20500, var9, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9, param8 + -(var12 / 2), -(var9 / 2) + param1);
            return;
          } else {
            ts.b(-109);
            sb.field_i.a(param3, -20500, var9, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9, param8 + -(var12 / 2), -(var9 / 2) + param1);
            return;
          }
        }
    }

    final static void a(byte param0) {
        td.field_f = new dg(iw.field_l);
        if (param0 >= -36) {
          field_j = null;
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
          if (((ts) this).field_i != null) {
            if (((ts) this).field_i.length == 0) {
              return 0;
            } else {
              return ((ts) this).field_i[((ts) this).field_i.length - 1];
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
        String[] var3 = null;
        int var4 = 0;
        Exception var5 = null;
        int var5_int = 0;
        jd var6 = null;
        sd var6_ref = null;
        int var7 = 0;
        String[] var8 = null;
        sd var9 = null;
        ic stackIn_1_0 = null;
        ic stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        String[] stackIn_1_4 = null;
        int stackIn_1_5 = 0;
        int stackIn_1_6 = 0;
        dg stackIn_1_7 = null;
        int stackIn_1_8 = 0;
        int stackIn_1_9 = 0;
        int stackIn_1_10 = 0;
        int stackIn_1_11 = 0;
        int stackIn_1_12 = 0;
        int stackIn_1_13 = 0;
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
        int stackIn_4_14 = 0;
        Throwable decompiledCaughtException = null;
        ic stackOut_0_0 = null;
        ic stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        String[] stackOut_0_4 = null;
        int stackOut_0_5 = 0;
        int stackOut_0_6 = 0;
        dg stackOut_0_7 = null;
        int stackOut_0_8 = 0;
        int stackOut_0_9 = 0;
        int stackOut_0_10 = 0;
        int stackOut_0_11 = 0;
        int stackOut_0_12 = 0;
        int stackOut_0_13 = 0;
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
        int stackOut_2_14 = 0;
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
        L0: {
          L1: {
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            l.field_c = param0;
            pq.field_f = null;
            var8 = param0.e(-23209);
            var3 = var8;
            r.field_B = var8.length;
            var4 = param0.field_w;
            mg.field_g = param1 + r.field_B;
            td.field_f.a(param0.field_z, 0);
            stackOut_0_0 = null;
            stackOut_0_1 = null;
            stackOut_0_2 = 0;
            stackOut_0_3 = 0;
            stackOut_0_4 = (String[]) var3;
            stackOut_0_5 = var4;
            stackOut_0_6 = 0;
            stackOut_0_7 = td.field_f;
            stackOut_0_8 = param0.field_o;
            stackOut_0_9 = ArmiesOfGielinor.field_K;
            stackOut_0_10 = param0.field_z;
            stackOut_0_11 = 0;
            stackOut_0_12 = 4;
            stackOut_0_13 = 0;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_3_3 = stackOut_0_3;
            stackIn_3_4 = stackOut_0_4;
            stackIn_3_5 = stackOut_0_5;
            stackIn_3_6 = stackOut_0_6;
            stackIn_3_7 = stackOut_0_7;
            stackIn_3_8 = stackOut_0_8;
            stackIn_3_9 = stackOut_0_9;
            stackIn_3_10 = stackOut_0_10;
            stackIn_3_11 = stackOut_0_11;
            stackIn_3_12 = stackOut_0_12;
            stackIn_3_13 = stackOut_0_13;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            stackIn_1_4 = stackOut_0_4;
            stackIn_1_5 = stackOut_0_5;
            stackIn_1_6 = stackOut_0_6;
            stackIn_1_7 = stackOut_0_7;
            stackIn_1_8 = stackOut_0_8;
            stackIn_1_9 = stackOut_0_9;
            stackIn_1_10 = stackOut_0_10;
            stackIn_1_11 = stackOut_0_11;
            stackIn_1_12 = stackOut_0_12;
            stackIn_1_13 = stackOut_0_13;
            if (rf.a(27875)) {
              break L1;
            } else {
              stackOut_1_0 = null;
              stackOut_1_1 = null;
              stackOut_1_2 = stackIn_1_2;
              stackOut_1_3 = stackIn_1_3;
              stackOut_1_4 = (String[]) (Object) stackIn_1_4;
              stackOut_1_5 = stackIn_1_5;
              stackOut_1_6 = stackIn_1_6;
              stackOut_1_7 = (dg) (Object) stackIn_1_7;
              stackOut_1_8 = stackIn_1_8;
              stackOut_1_9 = stackIn_1_9;
              stackOut_1_10 = stackIn_1_10;
              stackOut_1_11 = stackIn_1_11;
              stackOut_1_12 = stackIn_1_12;
              stackOut_1_13 = stackIn_1_13;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_3_6 = stackOut_1_6;
              stackIn_3_7 = stackOut_1_7;
              stackIn_3_8 = stackOut_1_8;
              stackIn_3_9 = stackOut_1_9;
              stackIn_3_10 = stackOut_1_10;
              stackIn_3_11 = stackOut_1_11;
              stackIn_3_12 = stackOut_1_12;
              stackIn_3_13 = stackOut_1_13;
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
              if ((hi.field_j ^ -1) > -3) {
                break L1;
              } else {
                stackOut_2_0 = null;
                stackOut_2_1 = null;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (String[]) (Object) stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = (dg) (Object) stackIn_2_7;
                stackOut_2_8 = stackIn_2_8;
                stackOut_2_9 = stackIn_2_9;
                stackOut_2_10 = stackIn_2_10;
                stackOut_2_11 = stackIn_2_11;
                stackOut_2_12 = stackIn_2_12;
                stackOut_2_13 = stackIn_2_13;
                stackOut_2_14 = 1;
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
                stackIn_4_14 = stackOut_2_14;
                break L0;
              }
            }
          }
          stackOut_3_0 = null;
          stackOut_3_1 = null;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3;
          stackOut_3_4 = (String[]) (Object) stackIn_3_4;
          stackOut_3_5 = stackIn_3_5;
          stackOut_3_6 = stackIn_3_6;
          stackOut_3_7 = (dg) (Object) stackIn_3_7;
          stackOut_3_8 = stackIn_3_8;
          stackOut_3_9 = stackIn_3_9;
          stackOut_3_10 = stackIn_3_10;
          stackOut_3_11 = stackIn_3_11;
          stackOut_3_12 = stackIn_3_12;
          stackOut_3_13 = stackIn_3_13;
          stackOut_3_14 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          stackIn_4_5 = stackOut_3_5;
          stackIn_4_6 = stackOut_3_6;
          stackIn_4_7 = stackOut_3_7;
          stackIn_4_8 = stackOut_3_8;
          stackIn_4_9 = stackOut_3_9;
          stackIn_4_10 = stackOut_3_10;
          stackIn_4_11 = stackOut_3_11;
          stackIn_4_12 = stackOut_3_12;
          stackIn_4_13 = stackOut_3_13;
          stackIn_4_14 = stackOut_3_14;
          break L0;
        }
        new ic(stackIn_4_2 != 0, stackIn_4_3, (String[]) (Object) stackIn_4_4, stackIn_4_5, stackIn_4_6 != 0, (dg) (Object) stackIn_4_7, stackIn_4_8, stackIn_4_9, stackIn_4_10, stackIn_4_11 != 0, stackIn_4_12, stackIn_4_13, stackIn_4_14 != 0, param0);
        rd.field_j = (ic) (Object) stackIn_4_0;
        rd.field_j.field_xb.field_F = true;
        rd.field_j.field_xb.field_T = new ln[param0.field_B.length];
        var5_int = 0;
        L2: while (true) {
          if (rd.field_j.field_xb.field_T.length <= var5_int) {
            L3: {
              if ((1 & param0.field_k) == 0) {
                break L3;
              } else {
                var5_int = -1 + param0.field_B.length;
                var6 = (jd) (Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).e((byte) 97);
                L4: while (true) {
                  if (var6 == null) {
                    break L3;
                  } else {
                    L5: {
                      if (var6.field_Y <= 10) {
                        break L5;
                      } else {
                        var6.field_Y = 10;
                        break L5;
                      }
                    }
                    var6 = (jd) (Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).a((byte) 123);
                    continue L4;
                  }
                }
              }
            }
            if (param2 != null) {
              try {
                rd.field_j.a((byte) -121, param2, param0);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
            }
          } else {
            if (var5_int == param0.field_w) {
              rd.field_j.field_xb.field_T[var5_int] = ah.field_a;
              var5_int++;
              continue L2;
            } else {
              var9 = param0.field_G.field_q[param0.field_B[var5_int]];
              var6_ref = var9;
              rd.field_j.field_xb.field_T[var5_int] = var9.field_q;
              var5_int++;
              var5_int++;
              continue L2;
            }
          }
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
        ((ts) this).field_n = param0;
        ((ts) this).field_i = new int[1 + param2];
        ((ts) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_e = null;
        field_k = "<%0> is already on your ignore list.";
        field_f = "to return to the normal view.";
        field_g = "Won";
        field_b = "\"Slow but sure moves the might of the gods.\"<br>     - Euripides (484 - 406 BC)";
        field_d = new String[]{"OPEN", "TRACK", "MOUNTAINS", "FOREST", "RIVER", "SWAMP", "SEA", "CIRCLE", "HOUSE", "CASTLE", "BRIDGE"};
    }
}
