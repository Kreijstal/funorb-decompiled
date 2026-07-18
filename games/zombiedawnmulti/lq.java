/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String field_c;
    static int field_d;
    static int field_b;
    static String field_a;
    private qa field_e;
    private qa field_f;

    final int a(byte param0) {
        int var2 = 0;
        qa var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = ((lq) this).field_e.field_k;
        if (param0 == 98) {
          L0: while (true) {
            if (var3 == ((lq) this).field_e) {
              return var2;
            } else {
              var3 = var3.field_k;
              var2++;
              continue L0;
            }
          }
        } else {
          return -26;
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 74) {
            return;
        }
        boolean discarded$0 = lq.b(1);
    }

    final qa b(byte param0) {
        qa var2 = null;
        if (param0 >= 82) {
          var2 = ((lq) this).field_f;
          if (var2 == ((lq) this).field_e) {
            ((lq) this).field_f = null;
            return null;
          } else {
            ((lq) this).field_f = var2.field_k;
            return var2;
          }
        } else {
          field_d = 18;
          var2 = ((lq) this).field_f;
          if (var2 == ((lq) this).field_e) {
            ((lq) this).field_f = null;
            return null;
          } else {
            ((lq) this).field_f = var2.field_k;
            return var2;
          }
        }
    }

    final static ma a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ma stackIn_5_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        ma stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_8_0 = null;
        ma stackOut_21_0 = null;
        ma stackOut_17_0 = null;
        ma stackOut_4_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 == 1) {
              break L0;
            } else {
              lq.c(-68);
              break L0;
            }
          }
          if (0 != var2_int) {
            if (var2_int > 63) {
              stackOut_8_0 = er.field_f;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              var3 = 0;
              L1: while (true) {
                if (var2_int > var3) {
                  L2: {
                    var4 = param1.charAt(var3);
                    if (45 != var4) {
                      if (lb.field_e.indexOf(var4) == -1) {
                        stackOut_21_0 = so.field_t;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        break L2;
                      }
                    } else {
                      L3: {
                        if (var3 == 0) {
                          break L3;
                        } else {
                          if (var3 != -1 + var2_int) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_17_0 = so.field_t;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_4_0 = jo.field_e;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("lq.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final void d(int param0) {
        int var3 = 0;
        qa var4 = null;
        qa var5 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -1) {
          L0: while (true) {
            var4 = ((lq) this).field_e.field_k;
            if (((lq) this).field_e == var4) {
              ((lq) this).field_f = null;
              return;
            } else {
              var4.a(-4564);
              continue L0;
            }
          }
        } else {
          lq.c(-67);
          L1: while (true) {
            var5 = ((lq) this).field_e.field_k;
            if (((lq) this).field_e == var5) {
              ((lq) this).field_f = null;
              return;
            } else {
              var5.a(-4564);
              continue L1;
            }
          }
        }
    }

    final qa c(byte param0) {
        qa var2 = null;
        if (param0 <= 84) {
            ((lq) this).field_f = null;
            var2 = ((lq) this).field_e.field_k;
            if (!(((lq) this).field_e != var2)) {
                ((lq) this).field_f = null;
                return null;
            }
            ((lq) this).field_f = var2.field_k;
            return var2;
        }
        var2 = ((lq) this).field_e.field_k;
        if (!(((lq) this).field_e != var2)) {
            ((lq) this).field_f = null;
            return null;
        }
        ((lq) this).field_f = var2.field_k;
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            lq.c(72);
            return fh.field_m != null ? true : false;
        }
        return fh.field_m != null ? true : false;
    }

    final qa a(int param0) {
        qa var2 = null;
        if (param0 == 11356) {
          var2 = ((lq) this).field_e.field_k;
          if (var2 == ((lq) this).field_e) {
            return null;
          } else {
            var2.a(-4564);
            return var2;
          }
        } else {
          boolean discarded$2 = lq.b(-38);
          var2 = ((lq) this).field_e.field_k;
          if (var2 == ((lq) this).field_e) {
            return null;
          } else {
            var2.a(-4564);
            return var2;
          }
        }
    }

    final void a(int param0, qa param1) {
        try {
            if (!(param1.field_p == null)) {
                param1.a(param0 + -34228);
            }
            param1.field_k = ((lq) this).field_e;
            param1.field_p = ((lq) this).field_e.field_p;
            if (param0 != 29664) {
                Object var4 = null;
                ma discarded$0 = lq.a((byte) 122, (String) null);
            }
            param1.field_p.field_k = param1;
            param1.field_k.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "lq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lq() {
        ((lq) this).field_e = new qa();
        ((lq) this).field_e.field_k = ((lq) this).field_e;
        ((lq) this).field_e.field_p = ((lq) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Game Complete!";
        field_b = 0;
        field_c = "Connection restored.";
    }
}
