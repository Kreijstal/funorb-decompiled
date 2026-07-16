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
        if (param1 != 550) {
          field_b = false;
          return s.a(param0.length, param0, 0, -124);
        } else {
          return s.a(param0.length, param0, 0, -124);
        }
    }

    final static void a(kl param0, kl param1, byte param2) {
        pj.field_M = param1;
        if (param2 < 98) {
            field_e = true;
            qk.field_j = param0;
            return;
        }
        qk.field_j = param0;
    }

    final static String a(int param0, va param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.g(11681);
              if (param0 >= var3_int) {
                break L1;
              } else {
                var3_int = param0;
                break L1;
              }
            }
            L2: {
              var4 = new byte[var3_int];
              if (param2 >= 35) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            param1.field_m = param1.field_m + fb.field_d.a(false, 0, var4, var3_int, param1.field_m, param1.field_k);
            var5 = bi.a(0, var3_int, var4, false);
            stackOut_4_0 = (String) var5;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_5_0;
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
            if (-1 == (ab.field_h.field_a ^ -1)) {
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
              if (-2 == (ab.field_h.field_a ^ -1)) {
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
        if (param0) {
            field_b = true;
        }
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
