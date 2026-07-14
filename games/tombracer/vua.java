/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vua extends qr {
    static jpa field_y;
    static String field_z;
    static String field_C;
    static int field_B;
    static String[] field_D;
    static nh field_A;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        if (param0 > 70) {
          if (((vua) this).a(param6, param1, -123, param3, param2)) {
            if (!super.a(119, param1, param2, param3, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0) {
          if (null != ((vua) this).field_r) {
            ((vua) this).field_r.a((ae) this, param0, 16777215, param1, true);
            if (param2 == 0) {
              if (-1 != (((vua) this).field_m ^ -1)) {
                if (((vua) this).field_p != 0) {
                  afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                  ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2 ^ 0, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (param2 == 0) {
              if (-1 != (((vua) this).field_m ^ -1)) {
                if (((vua) this).field_p != 0) {
                  afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                  ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2 ^ 0, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param2 == 0) {
            if (-1 != (((vua) this).field_m ^ -1)) {
              if (((vua) this).field_p == 0) {
                return;
              } else {
                afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2 ^ 0, param3);
                afa.field_c.a((byte) 38);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_D = null;
        field_y = null;
        field_z = null;
        if (param0 != -4) {
          vua.a((byte) -41);
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    final void c(int param0) {
        ((vua) this).field_x.c((byte) -47);
        if (param0 <= 91) {
            ((vua) this).c(75);
        }
    }

    final static boolean e(int param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        boolean stackOut_13_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_15_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (we.b(param0, param1, 2048)) {
          if (param2 == 13650) {
            L0: {
              stackOut_13_0 = o.a(-1, param1, param0);
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((45056 & param0) == 0) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            if (stackIn_16_0 | stackIn_16_1 != 0 | mpa.a(false, param1, param0)) {
              return true;
            } else {
              L1: {
                if ((param1 & 55) != 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L1;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L1;
                }
              }
              return stackIn_20_0 != 0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
            }
          } else {
            L2: {
              field_A = null;
              stackOut_3_0 = o.a(-1, param1, param0);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if ((45056 & param0) == 0) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            if (stackIn_6_0 | stackIn_6_1 != 0 | mpa.a(false, param1, param0)) {
              return true;
            } else {
              L3: {
                if ((param1 & 55) != 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              return stackIn_10_0 != 0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
            }
          }
        } else {
          return false;
        }
    }

    vua(int param0, int param1, int param2, int param3, isa param4, ae param5) {
        super(param0, param1, param2, param3, param4, (qc) null);
        ((vua) this).field_x = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "If you can't take the heat, don't practise your backstroke in the lagoons of lava. I heard Arnie met his end here.";
        field_B = -1;
        field_D = new String[]{"<%0> was punctured", "<%0> was popped", "<%0> got the point", "<%0> served as an impromptu dartboard", "<%0> didn't judge the timings correctly"};
        field_z = "Spectate";
    }
}
