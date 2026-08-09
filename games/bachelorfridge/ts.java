/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts extends td {
    static sna field_r;
    static String field_q;
    static String field_p;

    ts(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ts.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(int param0, ht param1, int param2, int param3, int param4, int param5) {
        Object stackIn_7_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lba[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        lba[] var10 = null;
        eh var11 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1.b(34)) {
              L1: {
                if (0 != param5) {
                  break L1;
                } else {
                  var10 = we.a((byte) -57, param1);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (var10[var8].field_d == param2) {
                          L3: {
                            if (var10[var8].field_e == param0) {
                              L4: {
                                if (0 == param3) {
                                  break L4;
                                } else {
                                  if (param3 == var10[var8].field_b) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_a > param5) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param5 = var10[var8].field_a;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              var11 = param1.a(param5, param2, param4 ^ 124, param0, param3);
              L6: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (param4 == var11.field_f) {
                      gv.a(-111, param1, var7);
                      stackIn_36_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  gda.a(false, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("ts.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_26_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_32_0);
            } else {
              return (java.awt.Frame) ((Object) stackIn_36_0);
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_q = null;
        field_r = null;
        if (!param0) {
            field_q = (String) null;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga var4 = null;
        lca var5 = null;
        int var6 = 0;
        int var7 = 0;
        ii stackIn_2_0 = null;
        ew stackIn_5_0 = null;
        lca stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 3) {
              var3 = this.field_h.a(61, param0);
              var4 = this.field_j.a(param1 ^ 96, param0);
              if (var4 != null) {
                var5 = new lca(this.field_g, new nq(var3), this.field_j);
                var6 = var4.c(param1 ^ 119);
                var7 = kla.a(var6, param0.field_w, param1 + 2147483645);
                var5.field_o.a(new ela(new nq(var4), var7), true);
                stackIn_7_0 = (lca) (var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = new ew(new nq(var3));
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ts.A(");

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
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ii) ((Object) stackIn_5_0);
          } else {
            return (ii) ((Object) stackIn_7_0);
          }
        }
    }

    static {
        field_q = "Real-life threats";
        field_p = "OFFERED DRAW";
    }
}
