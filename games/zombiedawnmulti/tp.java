/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tp extends un {
    static String field_u;
    static java.math.BigInteger field_v;
    private boolean field_q;
    private String field_r;
    static int field_s;
    static int[] field_t;

    public static void h(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != 66) {
            tp.h(102);
            field_v = null;
            return;
        }
        field_v = null;
    }

    final re a(boolean param0, String param1) {
        gh var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_9_0 = null;
        re stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_8_0 = null;
        re stackOut_15_0 = null;
        re stackOut_14_0 = null;
        re stackOut_1_0 = null;
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
            var5 = (CharSequence) (Object) param1;
            int discarded$7 = 12319;
            if (sj.a(var5)) {
              L1: {
                if (!param1.equals((Object) (Object) ((tp) this).field_r)) {
                  L2: {
                    var3 = ed.a((byte) 127, param1);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_h) {
                        break L2;
                      } else {
                        ((tp) this).field_r = param1;
                        ((tp) this).field_q = var3.field_d;
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = ua.field_I;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (!param0) {
                  break L3;
                } else {
                  var4 = null;
                  String discarded$8 = ((tp) this).a((String) null, 126);
                  break L3;
                }
              }
              L4: {
                if (((tp) this).field_q) {
                  stackOut_15_0 = db.field_b;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = jq.field_b;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = jq.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("tp.F(").append(param0).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        gh var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_16_0 = null;
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
            var6 = (CharSequence) (Object) param0;
            var3 = vk.a(param1 ^ -1276425052, var6);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == -1276425040) {
                  break L1;
                } else {
                  var5 = null;
                  re discarded$2 = ((tp) this).a(true, (String) null);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((tp) this).field_r)) {
                  var4 = ed.a((byte) 127, param0);
                  if (var4 != null) {
                    if (null == var4.field_h) {
                      ((tp) this).field_q = var4.field_d;
                      ((tp) this).field_r = param0;
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
              if (!((tp) this).field_q) {
                stackOut_16_0 = wg.field_d;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return ba.field_j;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("tp.C(");
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
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    tp(pm param0) {
        super(param0);
        ((tp) this).field_q = false;
    }

    final void i(int param0) {
        if (param0 != -22837) {
            tp.h(-36);
            ((tp) this).field_r = null;
            return;
        }
        ((tp) this).field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This trait will make your powerups last even longer than Expert. Equip both for an extra bonus!";
        field_v = new java.math.BigInteger("65537");
        field_s = 66;
    }
}
