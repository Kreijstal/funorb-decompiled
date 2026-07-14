/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static mi field_h;
    static int[] field_l;
    static int[] field_b;
    static String field_i;
    static int field_j;
    static String field_c;
    static String field_a;
    static String field_e;
    static int field_g;
    static int field_f;
    static cj field_d;
    static int[] field_k;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
            return;
        }
        field_i = null;
        field_k = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_b = null;
        field_l = null;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 <= -38) {
            break L0;
          } else {
            boolean discarded$2 = jk.a((byte) -103, -99);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) == -256) {
              break L2;
            } else {
              if ((param1 ^ -1) > -1) {
                break L2;
              } else {
                if ((1L << param1 & em.field_N ^ -1L) == -1L) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static int a(byte param0, int param1, int[][] param2, int param3) {
        if (0 <= param1) {
            // if_icmpgt L15
        } else {
            return -1;
        }
        if (param3 >= param2.length) {
            return -1;
        }
        int var4 = 85 / ((-36 - param0) / 38);
        if (param1 >= param2[0].length) {
            return -1;
        }
        return param2[param3][param1];
    }

    final static void a(int param0, String[] param1) {
        if (hd.field_s != null) {
            hd.field_s.field_J.a((byte) -112, param1);
        }
        if (qe.field_e != null) {
            qe.field_e.field_V.a((byte) -112, param1);
        }
        if (param0 != 0) {
            boolean discarded$0 = jk.a((byte) 88, 116);
        }
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-120, param1);
        var2.a(121, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        double var0 = 0.0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        double stackIn_3_2 = 0.0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        double stackIn_4_2 = 0.0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        double stackIn_5_2 = 0.0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        double stackIn_6_2 = 0.0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        double stackIn_7_2 = 0.0;
        int stackIn_7_3 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        double stackIn_8_2 = 0.0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        double stackIn_9_2 = 0.0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        double stackIn_10_2 = 0.0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        double stackIn_11_2 = 0.0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        double stackIn_12_2 = 0.0;
        int stackIn_12_3 = 0;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        double stackOut_2_2 = 0.0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        double stackOut_4_2 = 0.0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        double stackOut_6_2 = 0.0;
        int stackOut_6_3 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        double stackOut_5_2 = 0.0;
        int stackOut_5_3 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        double stackOut_3_2 = 0.0;
        int stackOut_3_3 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        double stackOut_7_2 = 0.0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        double stackOut_11_2 = 0.0;
        int stackOut_11_3 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        double stackOut_8_2 = 0.0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        double stackOut_10_2 = 0.0;
        int stackOut_10_3 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        double stackOut_9_2 = 0.0;
        int stackOut_9_3 = 0;
        field_j = -1;
        field_a = "You must play 1 more rated game before playing with the current options.";
        field_c = "Hide game chat";
        field_i = "Send private message to <%0>";
        field_e = "Staff impersonation";
        field_l = new int[61];
        field_b = new int[61];
        var0 = 0.0;
        var2 = 0.41887902047863906;
        var4 = 20;
        var5 = 0;
        L0: while (true) {
          if ((var5 ^ -1) <= -61) {
            field_l[60] = 0;
            field_b[60] = 0;
            field_k = new int[8192];
          } else {
            L1: {
              stackOut_2_0 = (int[]) field_l;
              stackOut_2_1 = var5;
              stackOut_2_2 = Math.sin(var0);
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (var4 <= var5) {
                stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                if (var5 < 2 * var4) {
                  stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 4;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  break L1;
                } else {
                  stackOut_5_0 = (int[]) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 8;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  break L1;
                }
              } else {
                stackOut_3_0 = (int[]) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = 2;
                stackIn_7_0 = stackOut_3_0;
                stackIn_7_1 = stackOut_3_1;
                stackIn_7_2 = stackOut_3_2;
                stackIn_7_3 = stackOut_3_3;
                break L1;
              }
            }
            L2: {
              stackIn_7_0[stackIn_7_1] = (int)(stackIn_7_2 * ((double)stackIn_7_3 * 20.0));
              stackOut_7_0 = (int[]) field_b;
              stackOut_7_1 = var5;
              stackOut_7_2 = 20.0;
              stackIn_11_0 = stackOut_7_0;
              stackIn_11_1 = stackOut_7_1;
              stackIn_11_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (var4 > var5) {
                stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L2;
              } else {
                stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                if (2 * var4 > var5) {
                  stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = 4;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  break L2;
                } else {
                  stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = 8;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  stackIn_12_3 = stackOut_9_3;
                  break L2;
                }
              }
            }
            stackIn_12_0[stackIn_12_1] = (int)(stackIn_12_2 * (double)stackIn_12_3 * Math.cos(var0));
            var0 = var0 + var2;
            var5++;
            continue L0;
          }
        }
    }
}
