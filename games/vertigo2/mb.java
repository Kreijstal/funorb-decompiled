/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends li {
    int[][] field_p;
    private boolean[] field_n;
    int field_o;
    int[] field_r;
    static nj field_v;
    int field_x;
    int[] field_u;
    static String[] field_t;
    static ub field_y;
    static int[] field_w;
    static String[] field_q;
    static int field_s;

    final static ri a(int param0, int param1, byte param2, int param3) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        ri var4 = (ri) ((Object) ob.field_M.a((byte) 100));
        while (var4 != null) {
            if (var4.field_w == param0) {
                return var4;
            }
            var4 = (ri) ((Object) ob.field_M.b(96));
        }
        var4 = new ri();
        var4.field_n = param1;
        var4.field_w = param0;
        ob.field_M.a(var4, false);
        if (param2 > -70) {
            mb.b((byte) 6);
        }
        tg.a(param3, var4, 0);
        return var4;
    }

    public static void e(int param0) {
        field_w = null;
        if (param0 != -26523) {
            field_v = (nj) null;
        }
        field_q = null;
        field_t = null;
        field_y = null;
        field_v = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -88) {
            mb.a(-100);
        }
        return null != rc.field_d ? true : false;
    }

    final static void b(byte param0) {
        if (param0 != -110) {
            mb.b((byte) 10);
        }
        lj.a((byte) -116);
    }

    final static String a(int param0) {
        String var1 = "";
        if (!(eb.field_d == null)) {
            var1 = eb.field_d.j(param0 ^ 5607);
        }
        if (var1.length() == 0) {
            var1 = vb.c(-15381);
        }
        if (var1.length() == 0) {
            var1 = dh.field_a;
        }
        if (param0 != 0) {
            field_s = -111;
        }
        return var1;
    }

    mb(int param0, byte[] param1) {
        int[] array$0 = null;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ed var7 = null;
        ed var8 = null;
        try {
          L0: {
            this.field_x = param0;
            var7 = new ed(param1);
            var8 = var7;
            this.field_o = var8.h(-11);
            this.field_p = new int[this.field_o][];
            this.field_r = new int[this.field_o];
            this.field_n = new boolean[this.field_o];
            this.field_u = new int[this.field_o];
            var4 = 0;
            L1: while (true) {
              if (this.field_o <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= this.field_o) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= this.field_o) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= this.field_o) {
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= this.field_o) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (this.field_p[var4].length <= var5) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    this.field_p[var4][var5] = var7.h(-11);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            array$0 = new int[var7.h(-11)];
                            this.field_p[var4] = array$0;
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_u[var4] = var7.a((byte) -11);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackIn_8_0 = this.field_n;

                      stackIn_8_1 = var4;

                      if (-2 != (var8.h(-11) ^ -1)) {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 0;
                        break L7;
                      } else {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 1;
                        break L7;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                this.field_r[var4] = var7.h(-11);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("mb.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_v = new nj();
        field_y = null;
        field_w = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
    }
}
