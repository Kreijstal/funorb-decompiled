/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static String field_i;
    static nf field_h;
    volatile boolean field_d;
    static int[] field_b;
    static String field_e;
    static double field_g;
    static int field_f;
    static double[] field_a;
    volatile dk[] field_k;
    df field_c;
    volatile boolean field_j;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_i = null;
        field_e = null;
        field_b = null;
        int var1 = -119 % ((-13 - param0) / 55);
    }

    public final void run() {
        int var1_int = 0;
        dk var2 = null;
        int var4 = Confined.field_J ? 1 : 0;
        ((sb) this).field_j = true;
        try {
            while (!((sb) this).field_d) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = ((sb) this).field_k[var1_int];
                    if (var2 != null) {
                        var2.c();
                    }
                }
                jd.a(1, 10L);
                mb.a((Object) null, 1001, ((sb) this).field_c);
            }
        } catch (Exception exception) {
            Object var5 = null;
            mb.a((String) null, true, (Throwable) (Object) exception);
        } finally {
            ((sb) this).field_j = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Confined.field_J ? 1 : 0;
        if (param0 < param5) {
          if (1 + param0 >= param3) {
            return;
          } else {
            L0: {
              if (5 + param0 >= param3) {
                break L0;
              } else {
                if (param1 != param2) {
                  var7 = (param2 & param1 & 1) + ((param2 >> -2032674431) + (param1 >> -1887026655));
                  var8 = param0;
                  var9 = param2;
                  var10 = param1;
                  var11 = param0;
                  L1: while (true) {
                    if (var11 >= param3) {
                      sb.a(param0, var9, param2, var8, param4, param5, param6);
                      sb.a(var8, param1, var10, param3, (byte) 92, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = sj.field_rb[var11];
                        if (!param6) {
                          stackOut_22_0 = ik.field_cb[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = an.field_n[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var7 < var13) {
                        sj.field_rb[var11] = sj.field_rb[var8];
                        var8++;
                        sj.field_rb[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = param3 - 1;
            L3: while (true) {
              if (param0 >= var7) {
                return;
              } else {
                var8 = param0;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = sj.field_rb[var8];
                    var10 = sj.field_rb[var8 - -1];
                    if (ek.a(-124, var10, param6, var9)) {
                      sj.field_rb[var8] = var10;
                      sj.field_rb[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    sb() {
        ((sb) this).field_k = new dk[2];
        ((sb) this).field_d = false;
        ((sb) this).field_j = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Cancel";
        field_b = new int[]{100, 100, 100, 200, 200, 300, 500, 100, 300, 1000, 100, 100, 200, 300, 100, 100, 300, 500, 1000, 200};
        field_a = new double[]{8.0, 8.0, 5.0, 5.0};
        field_e = "Good morning.#Awakening from cryogenic inertia cocoon.";
        field_f = 51;
    }
}
