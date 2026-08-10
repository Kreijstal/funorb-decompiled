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

    final static void a(boolean param0, boolean param1, String param2, int param3) {
        fh.a(-55);
        if (param3 != -22175) {
            return;
        }
        try {
            nb.field_a.i(param3 ^ 22250);
            lg.field_b = new ul(aa.field_s, (String) null, jg.field_d, param1, param0);
            ak.field_a = new ui(nb.field_a, lg.field_b);
            nb.field_a.b(ak.field_a, (byte) -35);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, rh param1) {
        hk var2 = null;
        try {
            if (param0 < 90) {
                rh var3 = (rh) null;
                fl.a((byte) 103, (rh) null);
            }
            hk.b(param1.a(0, "", "headers.packvorbis"));
            var2 = hk.a(param1, "jagex logo2.packvorbis", "");
            var2.b();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = (char[][]) null;
        field_b = null;
        if (param0 != 26113) {
            return;
        }
        field_d = null;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          var3 = (this.field_a.length >> -491016159) - 1;
          if (param1 > 114) {
            break L0;
          } else {
            this.a(82, (byte) 96);
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = this.field_a[1 + var4 + var4];
          if ((var5 ^ -1) != 0) {
            if (param0 == this.field_a[var4 + var4]) {
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
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > (param0.length >> 1430897505) + param0.length) {
                this.field_a = new int[var2_int + var2_int];
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
                          if ((this.field_a[1 + (var4 + var4)] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[var4 + var4 - -1] = var3;
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
                    this.field_a[var3] = -1;
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("fl.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_d = "<%0>The entrance:<%1> the fleas will fall from the bottom of this after a short delay at the start of each level.";
        field_e = new ak();
        field_f = true;
        field_c = new char[40][21];
    }
}
