/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static boolean field_c;
    static String field_b;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 21) {
            field_c = false;
        }
    }

    final static void a(o[] param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        if (param0 != null) {
          if (param3 <= 0) {
            return;
          } else {
            var5 = param0[0].field_q;
            var6 = param0[2].field_q;
            var7 = param0[1].field_q;
            param0[0].d(param1, param2);
            param0[2].d(-var6 + param1 + param3, param2);
            mi.b(ql.field_q);
            mi.d(var5 + param1, param2, param1 + param3 + -var6, param0[1].field_r + param2);
            var8 = param1 - -var5;
            var9 = param1 + (param3 + -var6);
            param1 = var8;
            L0: while (true) {
              if (var9 <= param1) {
                mi.a(ql.field_q);
                var10 = -88 % ((-22 - param4) / 53);
                return;
              } else {
                param0[1].d(param1, param2);
                param1 = param1 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static o[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -125 % ((param1 - 30) / 35);
        return md.a(param2, param3, param0, param4, 1, -1, 1, 3, 1);
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (qf.field_b <= var1) {
          if (param0 != 1) {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        } else {
          of.field_e = of.field_e + (qf.field_b + -var1);
          if (param0 == 1) {
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        }
    }

    final static boolean a(ia param0, ia param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            field_c = false;
            break L0;
          }
        }
        L1: {
          var3 = param0.field_jb - param1.field_jb;
          if (param0.field_gb != qa.field_r) {
            if (param0.field_gb == null) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          } else {
            // wide iinc 3 -200
            break L1;
          }
        }
        if (qa.field_r != param1.field_gb) {
          if (null != param1.field_gb) {
            L2: {
              if (0 >= var3) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if (0 >= var3) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if (0 >= var3) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 <= -59) {
          if (null == kf.field_G) {
            return;
          } else {
            var3 = 0;
            L0: while (true) {
              if (kf.field_G.length <= var3) {
                return;
              } else {
                if (null == kf.field_G[var3]) {
                  var3++;
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  kf.field_G[var3].a((byte) 117, param2, param1);
                  var3++;
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          L0: {
            je.a(false);
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for music";
        field_a = "Player";
        field_d = 0;
    }
}
