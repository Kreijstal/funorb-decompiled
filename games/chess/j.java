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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char stackIn_12_2 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        char stackIn_20_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        char stackOut_19_2 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char stackOut_18_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char stackOut_11_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
                        stackOut_17_0 = this.field_r;
                        stackOut_17_1 = var5;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (0 == var6) {
                          stackOut_19_0 = (char[]) ((Object) stackIn_19_0);
                          stackOut_19_1 = stackIn_19_1;
                          stackOut_19_2 = (char)0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          stackIn_20_2 = stackOut_19_2;
                          break L4;
                        } else {
                          stackOut_18_0 = (char[]) ((Object) stackIn_18_0);
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = vm.a(123, (byte) var6);
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
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
                          stackOut_9_0 = this.field_s;
                          stackOut_9_1 = var5;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 == 0) {
                            stackOut_11_0 = (char[]) ((Object) stackIn_11_0);
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = (char)0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            break L6;
                          } else {
                            stackOut_10_0 = (char[]) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = vm.a(117, (byte) var6);
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
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
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("j.D(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void a(p param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("j.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
