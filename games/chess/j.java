/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends l {
    int[] field_q;
    boolean field_w;
    char[] field_s;
    String field_x;
    static bn field_v;
    char[] field_r;
    int[] field_t;
    static boolean field_u;

    final void f(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = Chess.field_G;
        if (!(this.field_t == null)) {
            for (var2 = 0; var2 < this.field_t.length; var2++) {
                this.field_t[var2] = s.a(this.field_t[var2], 32768);
            }
        }
        if (param0 != 0) {
            p var4 = (p) null;
            this.a((p) null, -30);
        }
        if (!(null == this.field_q)) {
            var5 = 0;
            var2 = var5;
            while (var5 < this.field_q.length) {
                this.field_q[var5] = s.a(this.field_q[var5], 32768);
                var5++;
            }
        }
    }

    public static void d(byte param0) {
        int var1 = -87 % ((-44 - param0) / 39);
        field_v = null;
    }

    private final void a(int param0, p param1, boolean param2) {
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char stackIn_12_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        char stackIn_20_2 = 0;
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
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                j.d((byte) 104);
                break L1;
              }
            }
            L2: {
              if (param0 != 1) {
                if (param0 == 2) {
                  var4_int = param1.i(-116);
                  this.field_q = new int[var4_int];
                  this.field_r = new char[var4_int];
                  var5 = 0;
                  L3: while (true) {
                    if (var4_int <= var5) {
                      break L2;
                    } else {
                      L4: {
                        this.field_q[var5] = param1.f(674914976);
                        var6 = param1.g(0);
                        stackIn_19_0 = this.field_r;

                        stackIn_19_1 = var5;

                        if (0 == var6) {
                          stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                          stackIn_20_1 = stackIn_19_1;
                          stackIn_20_2 = (char)0;
                          break L4;
                        } else {
                          stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                          stackIn_20_1 = stackIn_19_1;
                          stackIn_20_2 = vm.a(123, (byte) var6);
                          break L4;
                        }
                      }
                      stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if (-4 != (param0 ^ -1)) {
                    if (-5 != (param0 ^ -1)) {
                      break L2;
                    } else {
                      this.field_w = true;
                      break L2;
                    }
                  } else {
                    var4_int = param1.i(-120);
                    this.field_s = new char[var4_int];
                    this.field_t = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L6: {
                          this.field_t[var5] = param1.f(674914976);
                          var6 = param1.g(0);
                          stackIn_11_0 = this.field_s;

                          stackIn_11_1 = var5;

                          if (var6 == 0) {
                            stackIn_12_0 = (char[]) ((Object) stackIn_11_0);
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = (char)0;
                            break L6;
                          } else {
                            stackIn_12_0 = (char[]) ((Object) stackIn_11_0);
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = vm.a(117, (byte) var6);
                            break L6;
                          }
                        }
                        stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                this.field_x = param1.d(0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("j.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void a(p param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                j.d((byte) 71);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.i(-96);
              if (0 == var3_int) {
                break L0;
              } else {
                this.a(var3_int, param0, true);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("j.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    j() {
        this.field_w = false;
    }

    static {
    }
}
