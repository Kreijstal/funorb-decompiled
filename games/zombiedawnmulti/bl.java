/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String field_f;
    static boolean field_h;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;
    static int field_a;
    static ri field_g;

    public static void b() {
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static int c() {
        return mc.field_e + -ch.field_i;
    }

    final static ja a(byte param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ja stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            int discarded$9 = -42;
            if (ud.a(param1, param2, param3)) {
              int discarded$10 = 15;
              stackOut_4_0 = gl.a();
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ja) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("bl.C(").append(50).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final synchronized static long a(byte param0) {
        long var1 = System.currentTimeMillis();
        if (param0 < 38) {
            return 127L;
        }
        if (~var1 > ~he.field_e) {
            vn.field_b = vn.field_b + (-var1 + he.field_e);
        }
        he.field_e = var1;
        return vn.field_b + var1;
    }

    final static void a() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (pl.field_I != sp.field_g) {
              L1: {
                if (lb.a((byte) 53, pl.field_I)) {
                  gk.a(2, pl.field_I).b((byte) 69);
                  break L1;
                } else {
                  break L1;
                }
              }
              gk.field_b = 0;
              L2: {
                pl.field_I = sp.field_g;
                if (!bi.field_e) {
                  break L2;
                } else {
                  wp.field_h = null;
                  hh.field_b = false;
                  cp.field_K = false;
                  df.field_I = false;
                  bi.field_e = false;
                  af.field_e = null;
                  np.field_m = null;
                  pp.field_n = false;
                  break L2;
                }
              }
              L3: {
                if (!cg.field_l) {
                  break L3;
                } else {
                  var13 = k.field_n;
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var4 = var7;
                  var1 = var4;
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= 8) {
                      var14 = fc.field_m;
                      var12 = var14;
                      var10 = var12;
                      var8 = var10;
                      var5 = var8;
                      var1 = var5;
                      var6 = 0;
                      var2 = var6;
                      L5: while (true) {
                        if (var6 >= 8) {
                          cg.field_l = false;
                          break L3;
                        } else {
                          var14[var6] = 0;
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      var13[var2] = 0;
                      var2++;
                      continue L4;
                    }
                  }
                }
              }
              L6: {
                if (!ch.field_k) {
                  break L6;
                } else {
                  int discarded$6 = 1481707568;
                  ld.j();
                  int discarded$7 = -28264;
                  wc.i();
                  int discarded$8 = -8328;
                  cf.d();
                  ch.field_k = false;
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "bl.A(" + -9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_f = "Withdraw invitation to <%0> to join this game";
        field_b = "Unpacking levels";
        field_c = -1;
        field_d = "Your zombie will screech like the devil, making humans tremble with fear and unable to move!";
        field_e = "Rated games are available to members only. To become a member and gain access to all the research, please visit the 'Account' section of the website.";
        field_a = 0;
    }
}
