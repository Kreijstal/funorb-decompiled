/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends rk {
    static int field_r;
    private String[] field_v;
    static int[] field_q;
    static o field_s;
    private int[] field_w;
    static int field_t;
    int[] field_p;
    private int[][] field_u;

    final String d(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = wizardrun.field_H;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_v) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_v[0]);
        for (var3 = 1; var3 < this.field_v.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_v[var3]);
        }
        if (param0 != 10592) {
            field_t = 109;
        }
        return var2.toString();
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        if (!(this.field_p == null)) {
            for (var2 = 0; this.field_p.length > var2; var2++) {
                this.field_p[var2] = sd.a(this.field_p[var2], 32768);
            }
        }
        if (param0 >= -118) {
            va var4 = (va) null;
            this.a(92, (va) null, 16);
        }
    }

    final static boolean a(byte param0) {
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        pk var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var3 = wizardrun.field_H;
        try {
          L0: {
            var4 = (pk) ((Object) kj.field_d.b((byte) 46));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_r) {
                  if (param0 > 60) {
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    field_t = -99;
                    return true;
                  }
                } else {
                  L2: {
                    if (null != var4.field_l[var2]) {
                      if (var4.field_l[var2].field_a != 0) {
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null == var4.field_m[var2]) {
                      break L3;
                    } else {
                      if (-1 == (var4.field_m[var2].field_a ^ -1)) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "ac.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            return;
        }
        int discarded$0 = tf.a(-20232);
    }

    private final void a(int param0, va param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        bh var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 >= 24) {
                break L1;
              } else {
                field_r = 59;
                break L1;
              }
            }
            L2: {
              if (-2 != (param2 ^ -1)) {
                if ((param2 ^ -1) != -3) {
                  if ((param2 ^ -1) != -4) {
                    if (param2 == 4) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var4_int = param1.f(255);
                    this.field_w = new int[var4_int];
                    this.field_u = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L4: {
                          var6 = param1.j(-14477);
                          var7 = nh.a(0, var6);
                          if (var7 == null) {
                            break L4;
                          } else {
                            this.field_w[var5] = var6;
                            array$1 = new int[var7.field_f];
                            this.field_u[var5] = array$1;
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_f) {
                                break L4;
                              } else {
                                this.field_u[var5][var8] = param1.j(-14477);
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var4_int = param1.f(255);
                  this.field_p = new int[var4_int];
                  var5 = 0;
                  L6: while (true) {
                    if (var5 >= var4_int) {
                      break L2;
                    } else {
                      this.field_p[var5] = param1.j(-14477);
                      var5++;
                      continue L6;
                    }
                  }
                }
              } else {
                this.field_v = tj.a(param1.d(0), -22710, '<');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("ac.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            field_s = (o) null;
        }
        field_s = null;
        field_q = null;
    }

    ac() {
    }

    final void a(va param0, int param1) {
        int var3_int = 0;
        int var4 = wizardrun.field_H;
        try {
            while (true) {
                var3_int = param0.f(255);
                if (-1 == (var3_int ^ -1)) {
                    break;
                }
                this.a(117, param0, var3_int);
            }
            var3_int = 44 % ((-38 - param1) / 36);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ac.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_q = new int[4];
    }
}
