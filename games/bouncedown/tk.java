/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk extends IOException {
    static boolean field_a;
    static hc field_b;
    static int field_c;

    final static boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 250) {
          L0: {
            boolean discarded$8 = tk.c(84);
            if (250 >= oa.field_a) {
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
            if (250 >= oa.field_a) {
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

    tk(String param0) {
        super(param0);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -822) {
          if (4096 > param1) {
            L0: {
              if (param1 >= 2048) {
                stackOut_18_0 = -lc.field_x[-2048 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = lc.field_x[-param1 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 >= 6144) {
                stackOut_14_0 = lc.field_x[-6144 + param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -lc.field_x[-param1 + 6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_a = true;
          if (4096 > param1) {
            L2: {
              if (param1 >= 2048) {
                stackOut_8_0 = -lc.field_x[-2048 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = lc.field_x[-param1 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 >= 6144) {
                stackOut_4_0 = lc.field_x[-6144 + param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -lc.field_x[-param1 + 6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = Bounce.field_N;
        if (param3 == -72) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) <= -1) {
              var17 = param5;
              var10 = var17;
              var11 = param1;
              var12 = param2;
              var13 = param8;
              var14 = param7;
              var15 = 8355711 & var17[var11] >> -640755295;
              var10[var11] = var15 + da.b(var14 >> -1653411503, 255) + (da.b(var12 >> -956147679, 16711680) - -(da.b(33423384, var13) >> -1816906583));
              param1++;
              param2 = param2 + param4;
              param7 = param7 + param6;
              param8 = param8 + param9;
              param0--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 8191) {
            field_a = false;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        ma.field_m = qj.a((byte) 67);
        q.field_N = new pf();
        l.a(true, true, 43);
        if (param0 >= 72) {
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void d(int param0) {
        if (pg.field_c) {
          pa.field_e = true;
          qb.a(true, -1402584374);
          if (param0 != -6144) {
            field_a = false;
            mh.field_U = 0;
            return;
          } else {
            mh.field_U = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
    }
}
