/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends td {
    static sna field_q;
    static int field_p;
    static String field_r;

    final static void a(gb param0, boolean param1, int param2) {
        pf var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = sja.field_fb;
              var3.c(param2, (byte) 127);
              var3.d(param0.field_g, 0);
              var3.b(param0.field_h, -127);
              if (param1) {
                break L1;
              } else {
                field_p = -86;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("io.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var8 = null;
        char[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var7 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!hm.a((byte) 110, param1)) {
                var9 = uj.field_s;
                var8 = var9;
                var6 = var8;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var9.length <= var3) {
                    L2: {
                      var2 = ra.field_r;
                      if (param0) {
                        break L2;
                      } else {
                        io.a(false, '5');
                        break L2;
                      }
                    }
                    var7 = 0;
                    var3 = var7;
                    L3: while (true) {
                      if (var7 >= var2.length) {
                        stackIn_26_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var7];
                        if (var4 == param1) {
                          stackIn_23_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var9[var3];
                    if ((param1 ^ -1) == (var4 ^ -1)) {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "io.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                return stackIn_26_0 != 0;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 >= -114) {
            io.a(false, 'Z');
        }
        field_q = null;
        field_r = null;
    }

    io(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "io.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        hla var5 = null;
        aga var6 = null;
        hla stackIn_6_0 = null;
        ew stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                io.b(87);
                break L1;
              }
            }
            L2: {
              var6 = this.field_h.a(71, param0);
              var4 = this.field_j.a(67, param0);
              if (var4 == null) {
                break L2;
              } else {
                if (null != param0.field_a[var4.field_x][var4.field_J].field_l) {
                  break L2;
                } else {
                  if (!var4.field_A) {
                    break L2;
                  } else {
                    var5 = new hla(this.field_g, new nq(var6), this.field_j);
                    var5.field_o.a(new iv(new nq(var4), false, 1, -(var4.field_t >> -1309717375), 0), true);
                    var5.field_o.a(new cn(new nq(var4), var4.field_x, var4.field_J), true);
                    stackIn_6_0 = (hla) (var5);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            stackIn_8_0 = new ew(new nq(var6));
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("io.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii) ((Object) stackIn_6_0);
        } else {
          return (ii) ((Object) stackIn_8_0);
        }
    }

    static {
        field_r = "Advertising websites";
    }
}
