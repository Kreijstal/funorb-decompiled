/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static ng field_h;
    int field_b;
    static float field_g;
    int field_f;
    int field_a;
    private int field_d;
    private int field_e;
    int field_c;

    final static void a(boolean param0, ng param1) {
        kd var2 = null;
        RuntimeException var2_ref = null;
        kd var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2 = param1.field_b;
            L1: while (true) {
              var3 = var2.field_f;
              var2.field_c = var3;
              var2 = var3;
              if (var2 != param1.field_b) {
                continue L1;
              } else {
                var2 = param1.field_b;
                L2: while (true) {
                  var3 = var2.field_c;
                  var3.field_f = var2;
                  var2 = var3;
                  if (param1.field_b != var2) {
                    continue L2;
                  } else {
                    if (!param0) {
                      break L0;
                    } else {
                      var5 = null;
                      tl.a(true, (ng) null);
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("tl.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void a() {
        field_h = null;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (((tl) this).field_e != rf.a(param1, 47)) {
          L0: {
            ((tl) this).field_e = rf.a(param1, 47);
            ((tl) this).field_d = 1;
            if (20 < ((tl) this).field_d) {
              stackOut_20_0 = 3;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L0;
            }
          }
          var3 = stackIn_21_0 * param1;
          if (var3 > ((tl) this).field_f / tg.field_j) {
            var3 = ((tl) this).field_f / tg.field_j;
            if (param0 > 100) {
              return var3;
            } else {
              ((tl) this).field_e = -94;
              return var3;
            }
          } else {
            if (var3 < -((tl) this).field_f / tg.field_j) {
              var3 = -((tl) this).field_f / tg.field_j;
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            } else {
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            }
          }
        } else {
          L1: {
            ((tl) this).field_d = ((tl) this).field_d + 1;
            if (20 < ((tl) this).field_d) {
              stackOut_3_0 = 3;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0 * param1;
          if (var3 > ((tl) this).field_f / tg.field_j) {
            var3 = ((tl) this).field_f / tg.field_j;
            if (param0 > 100) {
              return var3;
            } else {
              ((tl) this).field_e = -94;
              return var3;
            }
          } else {
            if (var3 < -((tl) this).field_f / tg.field_j) {
              var3 = -((tl) this).field_f / tg.field_j;
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            } else {
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != -123) {
            return -123;
        }
        return ((tl) this).field_c * ((tl) this).field_b / ((tl) this).field_f;
    }

    tl(int param0, int param1) {
        ((tl) this).field_f = param0;
        ((tl) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ng();
    }
}
