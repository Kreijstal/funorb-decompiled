/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ql extends pm {
    private boolean field_h;
    static String field_f;
    private String field_i;
    static float field_j;
    static vn field_g;

    final static void d() {
        int var1 = rf.a(false);
        int discarded$0 = -13043;
        int var2 = co.b();
        cj.field_i.a(var1 + (af.field_b << 1), wm.field_d + -ia.field_c, wh.field_c + -af.field_b, (byte) -80, var2 - -(ia.field_c << 1));
        d.a(false);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        am var4 = null;
        int var5 = 0;
        if (po.w(13296)) {
          return;
        } else {
          var4 = dp.field_e;
          var4.j(11, param1);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.i(0, 97);
          var4.a(param3, (byte) 105);
          var4.i(param2, 82);
          var4.a(param0, (byte) 105);
          var4.d(60, var4.field_j - var5);
          return;
        }
    }

    final rh a(String param0, int param1) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rh stackIn_2_0 = null;
        rh stackIn_9_0 = null;
        rh stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_8_0 = null;
        rh stackOut_15_0 = null;
        rh stackOut_14_0 = null;
        rh stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            if (ea.a(20000000, var4)) {
              L1: {
                if (!param0.equals((Object) (Object) ((ql) this).field_i)) {
                  L2: {
                    var3 = tm.a((byte) 51, param0);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_e) {
                        break L2;
                      } else {
                        ((ql) this).field_i = param0;
                        ((ql) this).field_h = var3.field_b;
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = gj.field_v;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (param1 == 2) {
                  break L3;
                } else {
                  field_g = null;
                  break L3;
                }
              }
              L4: {
                if (((ql) this).field_h) {
                  stackOut_15_0 = mc.field_g;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = uc.field_b;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = uc.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ql.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            field_f = null;
        }
    }

    ql(tb param0) {
        super(param0);
        ((ql) this).field_h = false;
    }

    final void e(int param0) {
        if (param0 != -28769) {
            field_j = 0.772375226020813f;
            ((ql) this).field_i = null;
            return;
        }
        ((ql) this).field_i = null;
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eo var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param0;
            var3 = ed.a(var5, (byte) -105);
            if (var3 == null) {
              L2: {
                if (!param0.equals((Object) (Object) ((ql) this).field_i)) {
                  var4 = tm.a((byte) 51, param0);
                  if (var4 != null) {
                    if (null == var4.field_e) {
                      ((ql) this).field_h = var4.field_b;
                      ((ql) this).field_i = param0;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (((ql) this).field_h) {
                stackOut_16_0 = kf.field_X;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = ma.field_i;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            } else {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ql.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Loading...";
        field_j = -1.0f;
    }
}
