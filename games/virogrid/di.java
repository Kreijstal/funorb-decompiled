/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class di extends qe {
    private String field_s;
    static int field_o;
    static km field_n;
    private boolean field_p;
    static p field_v;
    static String field_q;
    static boolean[] field_r;
    static String field_t;
    static String field_u;

    final wl a(String param0, boolean param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        CharSequence var5 = null;
        wl stackIn_2_0 = null;
        wl stackIn_10_0 = null;
        wl stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_9_0 = null;
        wl stackOut_14_0 = null;
        wl stackOut_13_0 = null;
        wl stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            if (ee.a(88, var5)) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  var4 = null;
                  wl discarded$2 = ((di) this).a((String) null, false);
                  break L1;
                }
              }
              L2: {
                if (param0.equals((Object) (Object) ((di) this).field_s)) {
                  break L2;
                } else {
                  L3: {
                    var3 = sh.a(648093968, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_e != null) {
                        break L3;
                      } else {
                        ((di) this).field_s = param0;
                        ((di) this).field_p = var3.field_a;
                        break L2;
                      }
                    }
                  }
                  stackOut_9_0 = te.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              L4: {
                if (((di) this).field_p) {
                  stackOut_14_0 = bm.field_i;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ee.field_c;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ee.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("di.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0;
    }

    final void c(boolean param0) {
        if (param0) {
            return;
        }
        ((di) this).field_s = null;
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ck var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        String stackOut_13_0 = null;
        String stackOut_3_0 = null;
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
            L1: {
              if (param0 == -26358) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param1;
            var3 = ce.a(-1, var5);
            if (var3 == null) {
              L2: {
                if (param1.equals((Object) (Object) ((di) this).field_s)) {
                  break L2;
                } else {
                  var4 = sh.a(param0 ^ -648103910, param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      ((di) this).field_s = param1;
                      ((di) this).field_p = var4.field_a;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((di) this).field_p) {
                stackOut_15_0 = sh.field_sb;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = dm.field_t;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
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
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("di.H(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    di(wa param0) {
        super(param0);
        ((di) this).field_p = false;
    }

    public static void h(int param0) {
        field_r = null;
        field_q = null;
        field_v = null;
        field_u = null;
        field_t = null;
        field_n = null;
    }

    final static id c(byte param0) {
        if (null == ca.field_Q) {
          ca.field_Q = new id();
          ca.field_Q.a((byte) 119, dj.field_h);
          ca.field_Q.field_n = 5;
          ca.field_Q.field_e = 2763306;
          ca.field_Q.field_g = 6;
          ca.field_Q.field_o = dk.field_j;
          ca.field_Q.field_k = 14;
          ca.field_Q.field_s = 7697781;
          ca.field_Q.field_q = 0;
          ca.field_Q.field_m = 4;
          return ca.field_Q;
        } else {
          return ca.field_Q;
        }
    }

    final static void a(sc param0, int param1, boolean param2) {
        try {
            la.a(-1, 256, true, param0);
            int var3_int = -19 / ((param1 - 65) / 42);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "di.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new p();
        field_q = "The following settings need to be changed:  ";
        field_r = new boolean[64];
        field_t = "You have <%0> unread messages!";
        field_u = "Decline invitation to <%0>'s game";
    }
}
