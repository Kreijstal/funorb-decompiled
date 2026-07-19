/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug {
    static int field_b;
    static long field_a;
    static java.awt.Image field_c;

    abstract void b(int param0);

    abstract long a(int param0);

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -46) {
          field_c = (java.awt.Image) null;
          vm.field_b = param2;
          t.field_c = param1;
          vg.field_d = param3;
          return;
        } else {
          vm.field_b = param2;
          t.field_c = param1;
          vg.field_d = param3;
          return;
        }
    }

    abstract int a(boolean param0, long param1);

    final static void a(int param0, int param1, int param2, long param3, String param4) {
        nm.field_E = param0;
        qi.field_b = param4;
        if (param1 != -3) {
            return;
        }
        try {
            ff.field_m = true;
            ap.field_c = param2;
            ba.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ug.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static wp a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        wp var7 = null;
        int var8 = 0;
        wp stackIn_4_0 = null;
        wp stackIn_7_0 = null;
        wp stackIn_10_0 = null;
        wp stackIn_17_0 = null;
        wp stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
        wp stackOut_19_0 = null;
        wp stackOut_16_0 = null;
        wp stackOut_9_0 = null;
        wp stackOut_6_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackOut_3_0 = ab.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-256 <= (var2_int ^ -1)) {
                var3 = jr.a((byte) -9, '.', param0);
                if (-3 >= (var3.length ^ -1)) {
                  L1: {
                    var4 = var3;
                    if (param1 < -45) {
                      break L1;
                    } else {
                      field_a = 17L;
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackOut_19_0 = cr.b(var3[var3.length + -1], 0);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = pe.a(var6, true);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackOut_16_0 = (wp) (var7);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = ab.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = cg.field_a;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("ug.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    final static r a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        String var6 = null;
        if (param3) {
          var6 = (String) null;
          ug.a(66, -15, -123, 95L, (String) null);
          return vo.a(false, 124, param4, param0, param1, param2);
        } else {
          return vo.a(false, 124, param4, param0, param1, param2);
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 0) {
            ug.c(-10);
        }
    }

    final static gd a(ed param0, int param1) {
        wp discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        gd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_2_0 = null;
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
              if (param1 == 46) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = ug.a((String) null, (byte) -93);
                break L1;
              }
            }
            stackOut_2_0 = new gd(param0.n(2), param0.n(2), param0.n(param1 + -44), param0.n(2), param0.n(2), param0.n(2), param0.n(2), param0.n(param1 ^ 44), param0.m(0), param0.h(param1 + -57));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ug.D(");
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final int a(long param0, boolean param1) {
        long var4 = 0L;
        var4 = this.a(104);
        if (param1) {
          if (0L < var4) {
            um.a(param1, var4);
            return this.a(true, param0);
          } else {
            return this.a(true, param0);
          }
        } else {
          this.b(-10);
          if (0L >= var4) {
            return this.a(true, param0);
          } else {
            um.a(param1, var4);
            return this.a(true, param0);
          }
        }
    }

    static {
    }
}
