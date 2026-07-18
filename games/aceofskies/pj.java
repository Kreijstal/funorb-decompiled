/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj {
    static es field_a;
    int[] field_e;
    static eg field_f;
    int field_b;
    int field_c;
    java.awt.Image field_d;

    final static tp c() {
        return qn.field_b;
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void a(int param0) {
        vp.a(((pj) this).field_e, ((pj) this).field_c, ((pj) this).field_b);
        if (param0 != -12595) {
            field_f = null;
        }
    }

    public static void a() {
        int var1 = 0;
        field_f = null;
        field_a = null;
    }

    final static void b(byte param0) {
        ak.field_d.d((ea) (Object) new tn(), -30244);
        if (param0 >= -21) {
            Object var2 = null;
            pj.a(19, (s) null);
        }
    }

    final static void a(int param0, s param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        s var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null != param1.field_j) {
              L1: {
                L2: {
                  if (param0 != param1.field_a) {
                    break L2;
                  } else {
                    if (0 == param1.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (dd.field_a <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ve.field_b[var2_int];
                      if (2 != var3.field_f) {
                        break L4;
                      } else {
                        if (param1.field_a != var3.field_a) {
                          break L4;
                        } else {
                          if (var3.field_b == param1.field_b) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_k == null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              tr.a(param1, param0 + -96);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("pj.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    abstract void a(byte param0, int param1, int param2, java.awt.Component param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new eg();
    }
}
