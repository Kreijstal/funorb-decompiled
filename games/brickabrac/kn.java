/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends tk {
    boolean field_A;
    int[] field_x;
    static int field_z;
    static String[] field_E;
    String field_D;
    static int field_y;
    char[] field_u;
    static volatile boolean field_C;
    int[] field_v;
    char[] field_w;

    private final void a(int param0, wq param1, int param2) {
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char stackIn_10_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char stackIn_17_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 59) {
                break L1;
              } else {
                field_z = -79;
                break L1;
              }
            }
            L2: {
              if (1 == param2) {
                this.field_D = param1.d(-1);
                break L2;
              } else {
                L3: {
                  if (-3 != (param2 ^ -1)) {
                    if (-4 != (param2 ^ -1)) {
                      if (param2 != 4) {
                        break L3;
                      } else {
                        this.field_A = true;
                        break L2;
                      }
                    } else {
                      var4_int = param1.l(255);
                      this.field_u = new char[var4_int];
                      this.field_v = new int[var4_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var4_int <= var5) {
                          break L3;
                        } else {
                          L5: {
                            this.field_v[var5] = param1.i(65280);
                            var6 = param1.b(true);
                            stackIn_16_0 = this.field_u;

                            stackIn_16_1 = var5;

                            if (0 == var6) {
                              stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                              stackIn_17_1 = stackIn_16_1;
                              stackIn_17_2 = (char)0;
                              break L5;
                            } else {
                              stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                              stackIn_17_1 = stackIn_16_1;
                              stackIn_17_2 = cq.a((byte) -11, (byte) var6);
                              break L5;
                            }
                          }
                          stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var4_int = param1.l(255);
                    this.field_x = new int[var4_int];
                    this.field_w = new char[var4_int];
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        L7: {
                          this.field_x[var5] = param1.i(65280);
                          var6 = param1.b(true);
                          stackIn_9_0 = this.field_w;

                          stackIn_9_1 = var5;

                          if (0 == var6) {
                            stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                            stackIn_10_1 = stackIn_9_1;
                            stackIn_10_2 = (char)0;
                            break L7;
                          } else {
                            stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                            stackIn_10_1 = stackIn_9_1;
                            stackIn_10_2 = cq.a((byte) -112, (byte) var6);
                            break L7;
                          }
                        }
                        stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("kn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 <= 44) {
            kn.a((byte) -32);
        }
    }

    final void a(wq param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -29539) {
                break L1;
              } else {
                field_E = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.l(255);
              if (0 != var3_int) {
                this.a(104, param0, var3_int);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kn.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (11 == i.field_j) {
                mk.a(-1);
            }
            if (!param0) {
                kn.a((byte) -116);
            }
            bf.a(ri.field_N, 8192, ep.field_a, vq.field_C);
            ck.a(param1, 0, 14209, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "kn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -86) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            kn.a(false, (java.awt.Canvas) null);
        }
        if (null != this.field_v) {
            for (var2 = 0; var2 < this.field_v.length; var2++) {
                this.field_v[var2] = ud.d(this.field_v[var2], 32768);
            }
        }
        if (this.field_x != null) {
            var5 = 0;
            var2 = var5;
            while (var5 < this.field_x.length) {
                this.field_x[var5] = ud.d(this.field_x[var5], 32768);
                var5++;
            }
        }
    }

    kn() {
        this.field_A = false;
    }

    static {
        field_C = false;
    }
}
