/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static boolean[] field_e;
    static qf field_f;
    static byte[][][] field_d;
    static ff field_b;
    static int field_c;
    static String field_a;

    final static pc a(byte param0, String param1) {
        ug discarded$4 = null;
        ug discarded$5 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pc stackIn_3_0 = null;
        pc stackIn_6_0 = null;
        pc stackIn_18_0 = null;
        pc stackIn_21_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_17_0 = null;
        pc stackOut_20_0 = null;
        Object stackOut_27_0 = null;
        pc stackOut_5_0 = null;
        pc stackOut_2_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) >= -64) {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 >= var2_int) {
                        break L3;
                      } else {
                        var4 = param1.charAt(var3);
                        var8 = 45;
                        var7 = var4;
                        if (var5 != 0) {
                          if (var7 <= var8) {
                            var6 = (String) null;
                            discarded$4 = rg.a((String) null, -120, -30);
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          L4: {
                            if (var7 == var8) {
                              L5: {
                                if (0 == var3) {
                                  break L5;
                                } else {
                                  if (var3 != var2_int + -1) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_17_0 = si.field_C;
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              if (0 != (cg.field_b.indexOf(var4) ^ -1)) {
                                break L4;
                              } else {
                                stackOut_20_0 = si.field_C;
                                stackIn_21_0 = stackOut_20_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (param0 <= 102) {
                      var6 = (String) null;
                      discarded$5 = rg.a((String) null, -120, -30);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                  stackOut_27_0 = null;
                  stackIn_28_0 = stackOut_27_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackOut_5_0 = el.field_o;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = h.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("rg.C(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return (pc) ((Object) stackIn_28_0);
              }
            }
          }
        }
    }

    final static ug a(String param0, int param1, int param2) {
        String discarded$2 = null;
        qk var3 = null;
        RuntimeException var3_ref = null;
        qk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new qk();
              ((ug) ((Object) var3)).field_b = param1;
              if (param2 == 2525) {
                break L1;
              } else {
                discarded$2 = rg.a(-91);
                break L1;
              }
            }
            ((ug) ((Object) var3)).field_c = param0;
            stackOut_2_0 = (qk) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("rg.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (ug) ((Object) stackIn_3_0);
    }

    final static void a(o[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 39 / ((param1 - 51) / 37);
              jb.field_d = param0;
              if (jb.field_d == null) {
                break L1;
              } else {
                if (-4 >= (param0.length ^ -1)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("rg.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = (byte[][][]) null;
        if (param0 != -40) {
          field_a = (String) null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_c = 11;
            if (!(gf.field_Z != ma.field_o)) {
                return te.field_K;
            }
            if (!(gb.field_i != gf.field_Z)) {
                return uh.field_r;
            }
            if (!(td.field_h.a(false))) {
                return uh.field_r;
            }
            return me.field_h;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return te.field_K;
        }
        if (!(gb.field_i != gf.field_Z)) {
            return uh.field_r;
        }
        if (!(td.field_h.a(false))) {
            return uh.field_r;
        }
        return me.field_h;
    }

    static {
        field_f = new qf();
        field_b = new ff(8, 0, 4, 1);
        field_a = "Game over";
    }
}
