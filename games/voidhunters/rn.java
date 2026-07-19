/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends fh {
    int[] field_n;
    String field_p;
    static int field_o;
    char[] field_q;
    char[] field_m;
    boolean field_k;
    int[] field_l;

    final void a(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.field_n != null) {
            for (var2 = 0; this.field_n.length > var2; var2++) {
                this.field_n[var2] = knb.a(this.field_n[var2], 32768);
            }
        }
        if (!(this.field_l == null)) {
            var4 = 0;
            var2 = var4;
            while (this.field_l.length > var4) {
                this.field_l[var4] = knb.a(this.field_l[var4], 32768);
                var4++;
            }
        }
        if (param0 != 0) {
            this.a(63);
        }
    }

    final void a(ds param0, int param1) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == 8452) {
              L1: while (true) {
                var3_int = param0.e((byte) -94);
                if (0 == var3_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(var3_int, (byte) 19, param0);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("rn.B(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, ds param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_16_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char stackOut_14_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                if ((param0 ^ -1) != -3) {
                  if ((param0 ^ -1) != -4) {
                    if (4 == param0) {
                      this.field_k = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.e((byte) -106);
                    this.field_n = new int[var4_int];
                    this.field_m = new char[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          this.field_n[var5] = param2.e(1869);
                          var6 = param2.d((byte) -114);
                          stackOut_13_0 = this.field_m;
                          stackOut_13_1 = var5;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          if (0 == var6) {
                            stackOut_15_0 = (char[]) ((Object) stackIn_15_0);
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = (char)0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            break L3;
                          } else {
                            stackOut_14_0 = (char[]) ((Object) stackIn_14_0);
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = qe.a((byte) var6, -120);
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            break L3;
                          }
                        }
                        stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param2.e((byte) -122);
                  this.field_q = new char[var4_int];
                  this.field_l = new int[var4_int];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L5: {
                        this.field_l[var5] = param2.e(mgb.a((int) param1, 1886));
                        var6 = param2.d((byte) -114);
                        stackOut_6_0 = this.field_q;
                        stackOut_6_1 = var5;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (-1 == (var6 ^ -1)) {
                          stackOut_8_0 = (char[]) ((Object) stackIn_8_0);
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = (char)0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          break L5;
                        } else {
                          stackOut_7_0 = (char[]) ((Object) stackIn_7_0);
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = qe.a((byte) var6, param1 + 5);
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          break L5;
                        }
                      }
                      stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                this.field_p = param2.a(param1 + -20);
                break L1;
              }
            }
            L6: {
              if (param1 == 19) {
                break L6;
              } else {
                this.field_n = (int[]) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("rn.A(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    rn() {
        this.field_k = false;
    }

    static {
        field_o = 50;
    }
}
