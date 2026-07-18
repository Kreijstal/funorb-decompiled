/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends IOException {
    static int[] field_e;
    static int field_f;
    static String field_a;
    static int field_d;
    static int field_b;
    static String field_h;
    static rh field_c;
    static nd field_g;

    final static void a() {
        L0: {
          ia.field_p[4] = new int[1];
          tk.a(34, 185, new int[1], 455, -119, 4, 383);
          pi.field_b[4] = new t(4);
          tk.a(34, 57, new int[4], 600, -126, 2, 383);
          pi.field_b[2] = new t(2);
          tk.a(34, 165, new int[2], 475, -120, 8, 410);
          pi.field_b[8] = new t(8);
          ia.field_p[6] = new int[1];
          tk.a(70, 165, new int[1], 475, -125, 6, 295);
          int discarded$1 = 19;
          em.a();
          pi.field_b[6] = new t(6);
          rh.field_c.field_d = rh.field_c.field_D.field_N * 11;
          if (wc.field_q <= 0) {
            break L0;
          } else {
            if (lf.a(fg.field_q, 31849)) {
              tk.a(34, 155, new int[7], 485, -123, 1, 135);
              pi.field_b[1] = new t(1);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (df.field_b == null) {
            return -1;
        }
        if (ha.field_l <= param2) {
            if (param2 < ha.field_l + df.field_b.field_w) {
                if (mg.field_e <= param0) {
                    if (param0 < df.field_b.field_t + mg.field_e) {
                        return 0;
                    }
                }
            }
        }
        if (param2 >= mh.field_w) {
            if (param2 < mh.field_w - -df.field_b.field_w) {
                if (rj.field_o <= param0) {
                    if (df.field_b.field_t + rj.field_o > param0) {
                        return 1;
                    }
                }
            }
        }
        em.b(-117);
        return -1;
    }

    em(String param0) {
        super(param0);
    }

    final static String c() {
        if (!(b.field_e != null)) {
            return "";
        }
        return b.field_e;
    }

    final static void a(dd param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if ((3 & (param0.field_w | param0.field_t | param0.field_q | param0.field_v)) != 0) {
              var2_int = (3 & param0.field_q) + param0.field_w;
              var2_int = -(3 & var2_int) - (-4 - var2_int);
              var3 = param0.field_t - -(3 & param0.field_v);
              var3 = 4 + -(var3 & 3) + var3;
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = (param0.field_v & 3) * var2_int + (3 & param0.field_q);
              var7 = 0;
              L1: while (true) {
                if (var7 >= param0.field_t) {
                  param0.field_B = var4;
                  param0.field_w = var2_int;
                  param0.field_q = param0.field_q & -4;
                  param0.field_t = var3;
                  param0.field_v = param0.field_v & -4;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (param0.field_w <= var8) {
                      var6 = var6 + (var2_int + -param0.field_w);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.field_B[incrementValue$3];
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("em.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -85 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -52) {
            break L0;
          } else {
            field_d = 68;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 48) {
              break L2;
            } else {
              if (param1 > 57) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 3505) {
            em.b(17);
        }
        field_h = null;
        field_e = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = "Flea Circus is a puzzle game in which you must direct fleas from their starting location to the level exit. You can do this by placing three different types of item into the level: left slopes, right slopes and blocks.";
        field_b = 0;
        field_h = "<%0>Spider:<%1> eats fleas for breakfast, lunch and dinner. Keep your fleas away from them!";
    }
}
