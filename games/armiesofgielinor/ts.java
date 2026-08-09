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
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_i) {
          if (0 != this.field_i.length) {
            if (param1 == 29) {
              var3 = 1;
              L0: while (true) {
                if (this.field_i.length > var3) {
                  if ((this.field_i[var3] + this.field_i[-1 + var3] >> 372070497 ^ -1) < (param0 ^ -1)) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
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
                  if ((this.field_i[var3] + this.field_i[-1 + var3] >> 372070497 ^ -1) < (param0 ^ -1)) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
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
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            sb.field_i.field_X = param0;
            if ((rs.field_t ^ -1) != -3) {
                ed.field_e.field_X = wq.field_c;
            } else {
                ed.field_e.field_X = bq.field_d;
            }
            var9_int = 495;
            var10 = 5;
            mb.field_F.a(param5, -20500, -10 + var9_int, var10, 5);
            qj.field_z.a(param5, -20500, -rb.field_b.field_gb + mb.field_F.field_gb, 0, 0);
            var10 = var10 + (param5 + param2);
            rb.field_b.a(param5, -20500, rb.field_b.field_gb, 0, qj.field_z.field_gb);
            qf.field_e.a(param4, -20500, qf.field_e.j(param7 + -15550), var10, 5);
            var11 = ed.field_e.j(param7 ^ 15717);
            ed.field_e.a(param4, -20500, var11, var10, -5 + (var9_int + -var11));
            if (param7 != 15676) {
                ts.b(-109);
            }
            sb.field_i.a(param3, -20500, var9_int, 0, 0);
            var12 = 5 + param4 + var10;
            f.field_C.a(var12, -20500, var9_int, param3, 0);
            f.field_C.field_G = tq.a(11579568, false, f.field_C.field_ob, 2105376, 3, 8421504);
            var12 = var12 + param3;
            eu.field_g.a(var12, -20500, var9_int, param8 + -(var12 / 2), -(var9_int / 2) + param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ts.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
        if (param0 == 0) {
          if (this.field_i != null) {
            if (this.field_i.length == 0) {
              return 0;
            } else {
              return this.field_i[this.field_i.length - 1];
            }
          } else {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
        } else {
          return -103;
        }
    }

    final static void a(om param0, int param1, sl param2) {
        ic stackIn_4_0;
        ic stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        String[] stackIn_4_4;
        int stackIn_4_5;
        int stackIn_4_6;
        dg stackIn_4_7;
        int stackIn_4_8;
        int stackIn_4_9;
        int stackIn_4_10;
        int stackIn_4_11;
        int stackIn_4_12;
        int stackIn_4_13;
        ic stackIn_5_0;
        ic stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        String[] stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        dg stackIn_5_7;
        int stackIn_5_8;
        int stackIn_5_9;
        int stackIn_5_10;
        int stackIn_5_11;
        int stackIn_5_12;
        int stackIn_5_13;
        int stackIn_5_14;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        Throwable decompiledCaughtException = null;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        Exception var5 = null;
        jd var6 = null;
        sd var6_ref = null;
        int var7 = 0;
        String[] var8 = null;
        sd var9 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              l.field_c = param0;
              pq.field_f = null;
              var8 = param0.e(-23209);
              var3 = var8;
              r.field_B = var8.length;
              var4 = param0.field_w;
              mg.field_g = param1 + r.field_B;
              td.field_f.a(param0.field_z, 0);
              stackIn_4_0 = null;

              stackIn_4_1 = null;

              stackIn_4_2 = 0;

              stackIn_4_3 = 0;

              stackIn_4_4 = (String[]) (var3);

              stackIn_4_5 = var4;

              stackIn_4_6 = 0;

              stackIn_4_7 = td.field_f;

              stackIn_4_8 = param0.field_o;

              stackIn_4_9 = ArmiesOfGielinor.field_K;

              stackIn_4_10 = param0.field_z;

              stackIn_4_11 = 0;

              stackIn_4_12 = 4;

              stackIn_4_13 = 0;

              if (rf.a(27875)) {
                break L1;
              } else {
                stackIn_4_0 = null;

                stackIn_4_1 = null;

                stackIn_4_4 = (String[]) ((Object) stackIn_4_4);

                stackIn_4_7 = (dg) ((Object) stackIn_4_7);

                if ((hi.field_j ^ -1) > -3) {
                  break L1;
                } else {
                  stackIn_5_0 = null;
                  stackIn_5_1 = null;
                  stackIn_5_2 = stackIn_4_2;
                  stackIn_5_3 = stackIn_4_3;
                  stackIn_5_4 = (String[]) ((Object) stackIn_4_4);
                  stackIn_5_5 = stackIn_4_5;
                  stackIn_5_6 = stackIn_4_6;
                  stackIn_5_7 = (dg) ((Object) stackIn_4_7);
                  stackIn_5_8 = stackIn_4_8;
                  stackIn_5_9 = stackIn_4_9;
                  stackIn_5_10 = stackIn_4_10;
                  stackIn_5_11 = stackIn_4_11;
                  stackIn_5_12 = stackIn_4_12;
                  stackIn_5_13 = stackIn_4_13;
                  stackIn_5_14 = 1;
                  break L0;
                }
              }
            }
            stackIn_5_0 = null;
            stackIn_5_1 = null;
            stackIn_5_2 = stackIn_4_2;
            stackIn_5_3 = stackIn_4_3;
            stackIn_5_4 = (String[]) ((Object) stackIn_4_4);
            stackIn_5_5 = stackIn_4_5;
            stackIn_5_6 = stackIn_4_6;
            stackIn_5_7 = (dg) ((Object) stackIn_4_7);
            stackIn_5_8 = stackIn_4_8;
            stackIn_5_9 = stackIn_4_9;
            stackIn_5_10 = stackIn_4_10;
            stackIn_5_11 = stackIn_4_11;
            stackIn_5_12 = stackIn_4_12;
            stackIn_5_13 = stackIn_4_13;
            stackIn_5_14 = 0;
            break L0;
          }
          rd.field_j = new ic(stackIn_5_2 != 0, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6 != 0, stackIn_5_7, stackIn_5_8, stackIn_5_9, stackIn_5_10, stackIn_5_11 != 0, stackIn_5_12, stackIn_5_13, stackIn_5_14 != 0, param0);
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
                  var6 = (jd) ((Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).e((byte) 97));
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
                      var6 = (jd) ((Object) rd.field_j.field_xb.f(var5_int, param1 ^ -1).a((byte) 123));
                      continue L4;
                    }
                  }
                }
              }
              if (param2 != null) {
                try {
                  L6: {
                    rd.field_j.a((byte) -121, param2, param0);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5 = (Exception) (Object) decompiledCaughtException;
                  af.a((Throwable) ((Object) var5), -74, "Error loading quicksave.");
                  return;
                }
                return;
              } else {
                return;
              }
            } else {
              L7: {
                if ((var5_int ^ -1) == (param0.field_w ^ -1)) {
                  rd.field_j.field_xb.field_T[var5_int] = ah.field_a;
                  break L7;
                } else {
                  var9 = param0.field_G.field_q[param0.field_B[var5_int]];
                  var6_ref = var9;
                  rd.field_j.field_xb.field_T[var5_int] = var9.field_q;
                  break L7;
                }
              }
              var5_int++;
              continue L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3_ref);

            stackIn_28_1 = new StringBuilder().append("ts.E(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
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
