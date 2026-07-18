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
        wl stackIn_2_0 = null;
        wl stackIn_14_0 = null;
        wl stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_13_0 = null;
        wl stackOut_19_0 = null;
        wl stackOut_17_0 = null;
        wl stackOut_1_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (ee.a(88, (CharSequence) (Object) param0)) {
              L1: {
                if (param1) {
                  break L1;
                } else {
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
                  stackOut_13_0 = te.field_d;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
              L4: {
                if (((di) this).field_p) {
                  stackOut_19_0 = bm.field_i;
                  stackIn_20_0 = stackOut_19_0;
                  break L4;
                } else {
                  stackOut_17_0 = ee.field_c;
                  stackIn_20_0 = stackOut_17_0;
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
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("di.E(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    final void c(boolean param0) {
        if (param0) {
            return;
        }
        try {
            ((di) this).field_s = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "di.G(" + param0 + ')');
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ck var4 = null;
        String stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_19_0 = null;
        String stackOut_17_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
            var3 = ce.a(-1, (CharSequence) (Object) param1);
            if (null == var3) {
              L2: {
                if (param1.equals((Object) (Object) ((di) this).field_s)) {
                  break L2;
                } else {
                  L3: {
                    var4 = sh.a(param0 ^ -648103910, param1);
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_e != null) {
                        break L3;
                      } else {
                        ((di) this).field_s = param1;
                        ((di) this).field_p = var4.field_a;
                        break L2;
                      }
                    }
                  }
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  return (String) (Object) stackIn_14_0;
                }
              }
              if (((di) this).field_p) {
                stackOut_19_0 = sh.field_sb;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                stackOut_17_0 = dm.field_t;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              }
            } else {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("di.H(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0;
    }

    di(wa param0) {
        super(param0);
        ((di) this).field_p = false;
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_r = null;
              field_q = null;
              if (param0 >= 34) {
                break L1;
              } else {
                di.a((sc) null, -36, true);
                break L1;
              }
            }
            field_v = null;
            field_u = null;
            field_t = null;
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "di.F(" + param0 + ')');
        }
    }

    final static id c(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_5_0 = null;
        id stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (null != ca.field_Q) {
                break L1;
              } else {
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
                break L1;
              }
            }
            if (param0 == -6) {
              stackOut_6_0 = ca.field_Q;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (id) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "di.I(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(sc param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            la.a(-1, 256, param2, param0);
            var3_int = -19 / ((param1 - 65) / 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("di.J(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
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
