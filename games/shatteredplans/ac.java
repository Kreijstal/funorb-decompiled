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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        ln[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ln var7 = null;
        ln[] var9 = null;
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
                var5 = var9;
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
            var5_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("ac.<init>(");

            if (param0 == null) {
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
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ')');
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
        if (param0 >= 15) {
          L0: {
            L1: {
              if (lg.field_e == null) {
                break L1;
              } else {
                if (!lg.field_e.f((byte) -99)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
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
