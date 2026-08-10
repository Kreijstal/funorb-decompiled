/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends eo {
    static String field_n;
    boolean field_w;
    String field_s;
    static int field_t;
    int[] field_q;
    static int field_r;
    static int field_v;
    int[] field_u;
    char[] field_p;
    char[] field_o;

    private final void a(lu param0, int param1, int param2) {
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (param2 == -3) {
              L1: {
                if (param1 == 1) {
                  this.field_s = param0.g(49);
                  break L1;
                } else {
                  L2: {
                    if ((param1 ^ -1) == -3) {
                      var4_int = param0.b(16711935);
                      this.field_u = new int[var4_int];
                      this.field_p = new char[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var4_int <= var5) {
                          break L2;
                        } else {
                          L4: {
                            this.field_u[var5] = param0.e((byte) 114);
                            var6 = param0.b(true);
                            stackIn_19_0 = this.field_p;

                            stackIn_19_1 = var5;

                            if (var6 != 0) {
                              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = vja.a((byte) var6, (byte) -93);
                              break L4;
                            } else {
                              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = 0;
                              break L4;
                            }
                          }
                          stackIn_20_0[stackIn_20_1] = (char) stackIn_20_2;
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param1 == 3) {
                        var4_int = param0.b(16711935);
                        this.field_q = new int[var4_int];
                        this.field_o = new char[var4_int];
                        var5 = 0;
                        L5: while (true) {
                          if (var5 >= var4_int) {
                            break L2;
                          } else {
                            L6: {
                              this.field_q[var5] = param0.e((byte) 92);
                              var6 = param0.b(true);
                              stackIn_13_0 = this.field_o;

                              stackIn_13_1 = var5;

                              if (var6 != 0) {
                                stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = vja.a((byte) var6, (byte) -46);
                                break L6;
                              } else {
                                stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = 0;
                                break L6;
                              }
                            }
                            stackIn_14_0[stackIn_14_1] = (char) stackIn_14_2;
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        if ((param1 ^ -1) == -5) {
                          this.field_w = true;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("jc.M(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(lu param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.b(16711935);
              if (-1 == (var3_int ^ -1)) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    jc.e(91);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(param0, var3_int, -3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("jc.A(");

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
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static fea a(vr param0, int param1, boolean param2, vr param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        fea stackIn_5_0 = null;
        fea stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (g.a(param4, param1, -30744, param3)) {
              if (!param2) {
                stackIn_7_0 = kea.a((byte) -3, param0.b(-26, param4, param1));
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (fea) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("jc.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fea) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static boolean f(int param0) {
        if (param0 != -24457) {
            field_n = (String) null;
        }
        return pma.field_k;
    }

    final void d(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!(this.field_q == null)) {
            for (var2 = 0; var2 < this.field_q.length; var2++) {
                this.field_q[var2] = mp.a(this.field_q[var2], 32768);
            }
        }
        if (null != this.field_u) {
            var4 = 0;
            var2 = var4;
            while (this.field_u.length > var4) {
                this.field_u[var4] = mp.a(this.field_u[var4], 32768);
                var4++;
            }
        }
        if (param0 != -25) {
            field_v = -40;
        }
    }

    public static void e(int param0) {
        if (param0 < 91) {
            jc.e(5);
        }
        field_n = null;
    }

    jc() {
        this.field_w = false;
    }

    static {
        field_r = 0;
        field_v = 500;
    }
}
