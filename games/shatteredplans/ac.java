/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends wf {
    static bi field_s;
    static String field_v;
    static int field_w;
    static String field_r;
    static qr field_x;
    static long field_o;
    static String field_p;
    static boolean field_u;
    static boolean[] field_t;
    static boolean[] field_q;

    final static void a(int param0, sq param1) {
        sq var3 = null;
        sq var2 = null;
        int fieldTemp$0 = 0;
        if (param0 != 1) {
            return;
        }
        try {
            if (null != hm.field_q) {
                var3 = !hm.field_q.field_k ? hm.field_q : hm.field_q.field_l;
                var2 = var3;
                if (!(var2 == null)) {
                    fieldTemp$0 = ge.field_i;
                    ge.field_i = ge.field_i + 1;
                    js.field_b[fieldTemp$0] = var3;
                }
            }
            lp.a(param0 + 1546006976, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ac.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ac(ln param0, int[] param1, boolean[] param2, me param3) {
        super(param0);
        RuntimeException var5 = null;
        int var5_int = 0;
        ln[] var5_array = null;
        int var6 = 0;
        ln var7 = null;
        ln[] var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            this.field_j = 0;
            var5_int = 0;
            L1: while (true) {
              if (4 <= var5_int) {
                L2: {
                  if (-1 >= (this.field_j ^ -1)) {
                    break L2;
                  } else {
                    this.field_j = -this.field_j;
                    break L2;
                  }
                }
                L3: {
                  if (!(param3 instanceof ui)) {
                    break L3;
                  } else {
                    if (36 != this.field_n.field_p) {
                      break L3;
                    } else {
                      this.field_j = this.field_j + 50;
                      break L3;
                    }
                  }
                }
                this.field_i = 0;
                var9 = param0.field_D;
                var5_array = var9;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var9.length) {
                    L5: {
                      if (!param0.field_u) {
                        break L5;
                      } else {
                        if ((this.field_i ^ -1) >= -2) {
                          break L5;
                        } else {
                          this.field_i = this.field_i / 2;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_i != 0) {
                        break L6;
                      } else {
                        this.field_i = 1;
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var7 = var9[var6];
                      if (null == var7.field_y) {
                        break L7;
                      } else {
                        if (var7.field_y == param0.field_y) {
                          break L7;
                        } else {
                          if (param2[var7.field_y.field_x]) {
                            break L7;
                          } else {
                            this.field_i = this.field_i + var7.field_x;
                            break L7;
                          }
                        }
                      }
                    }
                    var6++;
                    continue L4;
                  }
                }
              } else {
                this.field_j = this.field_j + param0.field_G[var5_int] * param1[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("ac.<init>(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    public static void e(int param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        field_q = null;
        field_p = null;
        int var1 = -126 / ((33 - param0) / 37);
        field_x = null;
        field_v = null;
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 15) {
          L0: {
            L1: {
              if (lg.field_e == null) {
                break L1;
              } else {
                if (!lg.field_e.f((byte) -99)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    static {
        field_r = "Don't mind";
        field_v = "<br><br><%PROJECT_ENERGY> - In the Classic rules, a <%project_energy> does not destroy a <%project_metal> in the target system. Instead, the bomb will destroy half the fleets in the system but leave the net in place. It will also prevent fleets leaving the system as normal.";
        field_p = "Month";
        field_t = new boolean[]{false, false, false, true, true, true, true, true, true, false, false, false, false, true, true, true, false, true, true, true, false, false, false, false, true, true, false, true, true, false, true, true, false, false, true, false, true, false, true, false, true, false, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, true, true, false, true, true, false, true, true, false, false, false, true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, true, true, false, false};
    }
}
