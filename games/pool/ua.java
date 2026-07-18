/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ua extends ig {
    static int field_v;
    private boolean field_q;
    static dd field_u;
    static String field_m;
    static dd field_r;
    static int[] field_t;
    static int field_o;
    static String field_n;
    private String field_p;
    static String field_s;

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wc var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
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
        Object stackOut_10_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_1_0 = null;
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
            var5 = (CharSequence) (Object) param0;
            var3 = pk.a(var5, param1 + -89);
            if (var3 == null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_u = null;
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((ua) this).field_p)) {
                  var4 = sm.a(param0, 118);
                  if (var4 != null) {
                    if (var4.field_b == null) {
                      ((ua) this).field_p = param0;
                      ((ua) this).field_q = var4.field_f;
                      break L2;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (String) (Object) stackIn_11_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (((ua) this).field_q) {
                stackOut_16_0 = lb.field_M;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = gi.field_n;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ua.L(");
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
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final na a(String param0, boolean param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        na stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        na stackIn_11_0 = null;
        na stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_10_0 = null;
        na stackOut_15_0 = null;
        na stackOut_14_0 = null;
        Object stackOut_4_0 = null;
        na stackOut_1_0 = null;
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
            if (qi.a((byte) -64, var4)) {
              if (param1) {
                L1: {
                  if (param0.equals((Object) (Object) ((ua) this).field_p)) {
                    break L1;
                  } else {
                    L2: {
                      var3 = sm.a(param0, -51);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (var3.field_b == null) {
                          ((ua) this).field_p = param0;
                          ((ua) this).field_q = var3.field_f;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_10_0 = no.field_k;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
                L3: {
                  if (((ua) this).field_q) {
                    stackOut_15_0 = kr.field_e;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = gp.field_d;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (na) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = gp.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ua.K(");
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
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    ua(sl param0) {
        super(param0);
        ((ua) this).field_q = false;
    }

    final void i(int param0) {
        if (param0 != 18) {
            return;
        }
        ((ua) this).field_p = null;
    }

    public static void h() {
        field_m = null;
        field_r = null;
        field_u = null;
        field_n = null;
        field_t = null;
        field_s = null;
    }

    final static void b() {
        if (oh.field_h) {
            kh.field_Vb.a((byte) -79, false);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Clan";
        field_v = 0;
        field_t = new int[]{17, 18, 8};
        field_n = "Chat";
        field_o = 0;
        field_s = "Start Game";
    }
}
