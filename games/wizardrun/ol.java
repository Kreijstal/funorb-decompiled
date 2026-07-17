/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ol {
    int field_a;
    static boolean field_e;
    static String field_d;
    static boolean field_b;
    static vi field_c;

    ol() {
        ((ol) this).field_a = 0;
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = s.a(param0.length, param0, 0, -124);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ol.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 550 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(kl param0, kl param1, byte param2) {
        try {
            pj.field_M = param1;
            if (param2 < 98) {
                field_e = true;
            }
            qk.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ol.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static String a(int param0, va param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param1.g(11681);
              if (param0 >= var3_int) {
                break L0;
              } else {
                var3_int = param0;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param1.field_m = param1.field_m + fb.field_d.a(false, 0, var4, var3_int, param1.field_m, param1.field_k);
            var5 = bi.a(0, var3_int, var4, false);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("ol.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 45 + 41);
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            Object var3 = null;
            mg var5 = null;
            mg var6 = null;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_10_0 = 0;
            L0: {
              if (ab.field_h != null) {
                break L0;
              } else {
                ab.field_h = sb.field_e.a(aa.field_nb, vl.field_d, (byte) -20);
                break L0;
              }
            }
            if (ab.field_h.field_a == 0) {
              return false;
            } else {
              L1: {
                long dupTemp$2 = d.a((byte) 119);
                hi.field_k = dupTemp$2;
                eg.field_C = dupTemp$2;
                if (param0 >= 118) {
                  break L1;
                } else {
                  var3 = null;
                  ol.a((kl) null, (kl) null, (byte) -16);
                  break L1;
                }
              }
              if (ab.field_h.field_a == 1) {
                try {
                  L2: {
                    L3: {
                      jc.field_H = new hi((java.net.Socket) ab.field_h.field_e, sb.field_e);
                      n.field_b.field_m = 0;
                      var5 = nk.field_N;
                      var6 = var5;
                      var6.field_m = 0;
                      wh.field_j = tj.field_G;
                      if (param1) {
                        stackOut_11_0 = -2;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = -1;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    l.field_P = stackIn_12_0;
                    wizardrun.field_E = stackIn_12_0;
                    me.field_c = stackIn_12_0;
                    cd.a(bl.field_a, (va) (Object) n.field_b, 20443, vk.field_l, df.field_a);
                    id.a((byte) -67, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  wh.field_j = sf.field_i;
                  ab.field_h = null;
                  return true;
                }
                ab.field_h = null;
                return true;
              } else {
                wh.field_j = sf.field_i;
                ab.field_h = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_b = false;
        field_d = "Press Enter or click to continue";
    }
}
