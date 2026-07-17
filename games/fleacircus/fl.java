/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    private int[] field_a;
    static ak field_e;
    static boolean field_f;
    static dd field_b;
    static char[][] field_c;

    final static void a(boolean param0, boolean param1, String param2) {
        fh.a(-55);
        try {
            nb.field_a.i(-117);
            lg.field_b = new ul(aa.field_s, (String) null, jg.field_d, param1, param0);
            ak.field_a = new ui(nb.field_a, (qa) (Object) lg.field_b);
            nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "fl.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + -22175 + 41);
        }
    }

    final static void a(byte param0, rh param1) {
        hk var2 = null;
        try {
            if (param0 < 90) {
                Object var3 = null;
                fl.a((byte) 103, (rh) null);
            }
            hk.b(param1.a(0, "", "headers.packvorbis"));
            var2 = hk.a(param1, "jagex logo2.packvorbis", "");
            sf discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "fl.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          var3 = (((fl) this).field_a.length >> 1) - 1;
          if (param1 > 114) {
            break L0;
          } else {
            int discarded$2 = ((fl) this).a(82, (byte) 96);
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = ((fl) this).field_a[1 + var4 + var4];
          if (var5 != -1) {
            if (param0 == ((fl) this).field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    fl(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > (param0.length >> 1) + param0.length) {
                ((fl) this).field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (((fl) this).field_a[1 + (var4 + var4)] == -1) {
                            ((fl) this).field_a[var4 + var4] = param0[var3];
                            ((fl) this).field_a[var4 + var4 - -1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((fl) this).field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("fl.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0>The entrance:<%1> the fleas will fall from the bottom of this after a short delay at the start of each level.";
        field_e = new ak();
        field_f = true;
        field_c = new char[40][21];
    }
}
