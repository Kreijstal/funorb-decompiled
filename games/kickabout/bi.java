/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static int field_i;
    static int field_m;
    static String field_e;
    static String field_a;
    o field_h;
    o field_b;
    o field_c;
    o field_j;
    iw field_d;
    int field_f;
    long field_p;
    volatile int field_l;
    volatile int field_o;
    byte field_g;
    iw field_n;
    ui field_k;

    final int b(int param0) {
        if (param0 != -21) {
          int discarded$2 = ((bi) this).e(124);
          return ((bi) this).field_c.c(-1976587888) + ((bi) this).field_j.c(-1976587888);
        } else {
          return ((bi) this).field_c.c(-1976587888) + ((bi) this).field_j.c(-1976587888);
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 10770) {
          L0: {
            ((bi) this).field_f = -107;
            if (((bi) this).b(param0 ^ -10759) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((bi) this).b(param0 ^ -10759) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(Object param0, int param1, boolean param2);

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 25533) {
          L0: {
            ((bi) this).field_g = (byte) -15;
            if ((((bi) this).e(0) ^ -1) > -21) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((bi) this).e(0) ^ -1) > -21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        if (hf.a(param0, -3)) {
          return false;
        } else {
          if (!qe.a(true, param0)) {
            if (lg.a(param0, (byte) 79)) {
              return false;
            } else {
              if (param1 == -32341) {
                if (param2.length() != 0) {
                  if (j.a((byte) -125, param2, param0)) {
                    return false;
                  } else {
                    if (uj.a(63, param0, param2)) {
                      return false;
                    } else {
                      if (lj.a((byte) -120, param2, param0)) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final ui a(int param0, int param1, byte param2, byte param3, boolean param4) {
        long var6 = 0L;
        ui var8 = null;
        ui stackIn_2_0 = null;
        ui stackIn_3_0 = null;
        ui stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ui stackIn_15_0 = null;
        ui stackIn_16_0 = null;
        ui stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ui stackOut_14_0 = null;
        ui stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ui stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ui stackOut_1_0 = null;
        ui stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ui stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = ((long)param0 << 1415540512) + (long)param1;
        var8 = new ui();
        if (param3 == 89) {
          L0: {
            var8.field_l = var6;
            stackOut_14_0 = (ui) var8;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param4) {
              stackOut_16_0 = (ui) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (ui) (Object) stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          stackIn_17_0.field_q = stackIn_17_1 != 0;
          var8.field_x = param2;
          if (!param4) {
            if (((bi) this).b(-21) >= 20) {
              throw new RuntimeException();
            } else {
              ((bi) this).field_c.a(param3 + 38, (am) (Object) var8);
              return var8;
            }
          } else {
            if ((((bi) this).e(0) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              ((bi) this).field_h.a(127, (am) (Object) var8);
              return var8;
            }
          }
        } else {
          L1: {
            bi.a(14, -40, 39, -92);
            var8.field_l = var6;
            stackOut_1_0 = (ui) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param4) {
              stackOut_3_0 = (ui) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ui) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          var8.field_x = param2;
          if (!param4) {
            if (((bi) this).b(-21) >= 20) {
              throw new RuntimeException();
            } else {
              ((bi) this).field_c.a(param3 + 38, (am) (Object) var8);
              return var8;
            }
          } else {
            if ((((bi) this).e(0) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              ((bi) this).field_h.a(127, (am) (Object) var8);
              return var8;
            }
          }
        }
    }

    abstract void c(int param0);

    abstract void b(byte param0);

    final static void a(int param0, int param1, int param2, int param3) {
        fb.field_R = param2;
        if (param3 != 20) {
            return;
        }
        wt.field_v = param0;
        du.field_k = param1;
    }

    abstract boolean a(byte param0);

    final int e(int param0) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          ((bi) this).a((Object) null, -67, false);
          return ((bi) this).field_h.c(-1976587888) - -((bi) this).field_b.c(-1976587888);
        } else {
          return ((bi) this).field_h.c(-1976587888) - -((bi) this).field_b.c(-1976587888);
        }
    }

    bi() {
        ((bi) this).field_h = new o();
        ((bi) this).field_b = new o();
        ((bi) this).field_c = new o();
        ((bi) this).field_j = new o();
        ((bi) this).field_d = new iw(6);
        ((bi) this).field_g = (byte) 0;
        ((bi) this).field_o = 0;
        ((bi) this).field_l = 0;
        ((bi) this).field_n = new iw(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 10;
        field_a = "Filter Auctions";
        field_e = "search for a user: ";
    }
}
