/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static long field_a;
    static String field_b;

    final static void a(String param0, byte param1) {
        df.field_o = param0;
        if (param1 != -13) {
            Object var3 = null;
            ld.a((String) null, (byte) -41);
        }
    }

    final static void a(boolean param0) {
        hk var1 = null;
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        vh.field_B.c();
        fc.field_k.c();
        vg.field_J = vg.field_J - 1;
        if (!param0) {
          if (-1 == (vg.field_J ^ -1)) {
            vg.field_J = 200;
            var1 = (hk) (Object) bd.field_c.a((byte) -117);
            L0: while (true) {
              if (var1 != null) {
                L1: {
                  if (var1.field_h.d(-3548)) {
                    break L1;
                  } else {
                    var1.c(-19822);
                    break L1;
                  }
                }
                var1 = (hk) (Object) bd.field_c.d((byte) 63);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ld.a(126);
          if (-1 == (vg.field_J ^ -1)) {
            vg.field_J = 200;
            var1 = (hk) (Object) bd.field_c.a((byte) -117);
            L2: while (true) {
              if (var1 != null) {
                L3: {
                  if (var1.field_h.d(-3548)) {
                    break L3;
                  } else {
                    var1.c(-19822);
                    break L3;
                  }
                }
                var1 = (hk) (Object) bd.field_c.d((byte) 63);
                continue L2;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -66) {
            ld.a(73);
        }
    }

    final static boolean a(rb param0, int param1, rb param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = param2.field_gb - param0.field_gb;
        if (param1 == -24612) {
          L0: {
            if (cm.field_G == param2.field_bb) {
              // wide iinc 3 -200
              break L0;
            } else {
              if (null != param2.field_bb) {
                break L0;
              } else {
                // wide iinc 3 200
                break L0;
              }
            }
          }
          if (cm.field_G != param0.field_bb) {
            if (null != param0.field_bb) {
              L1: {
                if ((var3 ^ -1) >= -1) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            } else {
              L2: {
                // wide iinc 3 -200
                if ((var3 ^ -1) >= -1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            L3: {
              // wide iinc 3 200
              if ((var3 ^ -1) >= -1) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            return stackIn_10_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L0: {
                if (cb.a(false)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_a = 113L;
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L1: {
                if (cb.a(false)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
