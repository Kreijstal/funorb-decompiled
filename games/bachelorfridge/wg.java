/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wg extends aba {
    static boolean field_g;
    private lka field_j;
    static String field_h;
    private lka field_k;
    static sna[] field_i;

    final jg a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_6_0 = null;
        jg stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        jg stackOut_9_0 = null;
        jg stackOut_14_0 = null;
        Object stackOut_12_0 = null;
        jg stackOut_5_0 = null;
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
            var3 = ((wg) this).field_j.field_w.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 == var4.length()) {
              stackOut_2_0 = jt.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (bq.a(var4, 20133, var3)) {
                if (this.a(true, param0)) {
                  stackOut_9_0 = jt.field_f;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!param1) {
                    stackOut_14_0 = cm.field_u;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (jg) (Object) stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = jt.field_f;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("wg.C(");
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final static void a() {
        if (!qo.field_c) {
            throw new IllegalStateException();
        }
    }

    public static void d() {
        field_h = null;
        field_i = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_30_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var7 = ((wg) this).field_j.field_w.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (eha.a(15, var5)) {
                stackOut_5_0 = fd.field_E;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                int discarded$14 = 63;
                if (kaa.a(var5)) {
                  stackOut_9_0 = sh.field_D;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var6 = 24 / ((param0 - -8) / 45);
                  if (!tfa.a(-124, var5)) {
                    if (!this.a(true, param1)) {
                      if (0 >= var7.length()) {
                        stackOut_30_0 = nw.field_q;
                        stackIn_31_0 = stackOut_30_0;
                        break L0;
                      } else {
                        if (vs.a(-62, var7, var5)) {
                          stackOut_20_0 = me.field_s;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (cw.a(var5, var7, true)) {
                            stackOut_24_0 = pka.field_a;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            int discarded$15 = 0;
                            if (db.a(var7, var5)) {
                              stackOut_28_0 = me.field_s;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              return fd.field_E;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = um.field_b;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = uv.field_k;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("wg.D(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L1;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    private final boolean a(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((wg) this).field_k.field_w.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var4.length() < -1) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 > var5) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var5) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 > var4.indexOf(var6)) {
                        if (0 > var4.indexOf(var7)) {
                          break L1;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("wg.B(").append(true).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static int a(int param0, byte param1) {
        String var2 = lka.field_E[param0][19];
        var2 = var2.trim();
        if (!(!var2.equals((Object) (Object) ""))) {
            return -1;
        }
        return ((ji) (Object) pga.field_b.a(true, (long)var2.hashCode())).field_h;
    }

    wg(lka param0, lka param1, lka param2) {
        super(param0);
        try {
            ((wg) this).field_k = param2;
            ((wg) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (jea.field_c != null) {
            if (!jea.field_c.a(param0, (byte) -113)) {
                return;
            }
            jea.field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is your shopping list. You can click this to be taken to groceout.com, where you can spend your ill-gotten gains on more food!";
        field_g = false;
    }
}
