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
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pc stackIn_3_0 = null;
        pc stackIn_6_0 = null;
        pc stackIn_16_0 = null;
        pc stackIn_19_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) >= -64) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param0 <= 102) {
                      var6 = (String) null;
                      rg.a((String) null, -120, -30);
                      stackIn_24_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 != var2_int + -1) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_16_0 = si.field_C;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (0 != (cg.field_b.indexOf(var4) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_19_0 = si.field_C;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = el.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = h.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("rg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return (pc) ((Object) stackIn_24_0);
              }
            }
          }
        }
    }

    final static ug a(String param0, int param1, int param2) {
        qk var3 = null;
        RuntimeException var3_ref = null;
        qk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new qk();
              ((ug) ((Object) var3)).field_b = param1;
              if (param2 == 2525) {
                break L1;
              } else {
                rg.a(-91);
                break L1;
              }
            }
            ((ug) ((Object) var3)).field_c = param0;
            stackIn_3_0 = (qk) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("rg.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (ug) ((Object) stackIn_3_0);
    }

    final static void a(o[] param0, int param1) {
        try {
            int var2_int = 39 / ((param1 - 51) / 37);
            jb.field_d = param0;
            if (jb.field_d != null && -4 < (param0.length ^ -1)) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = (byte[][][]) null;
        if (param0 != -40) {
            field_a = (String) null;
        }
        field_a = null;
        field_f = null;
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_c = 11;
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
