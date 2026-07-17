/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class q {
    private boolean field_l;
    int field_b;
    private long field_g;
    int field_f;
    static java.util.zip.CRC32 field_k;
    private int field_h;
    int[] field_i;
    private String field_d;
    int field_e;
    String field_n;
    static String[] field_m;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_j;
    static String field_o;

    final int a(byte param0) {
        if (!((q) this).field_l) {
          if (((q) this).field_e == 2) {
            if (((q) this).field_h <= 0) {
              if (~((q) this).field_g != ~fe.field_P) {
                if (param0 <= -41) {
                  if (field_a == 2) {
                    if (ie.a(((q) this).field_d, 2)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  q.a(4);
                  if (field_a == 2) {
                    if (!ie.a(((q) this).field_d, 2)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          } else {
            if (~((q) this).field_g != ~fe.field_P) {
              if (param0 <= -41) {
                if (field_a == 2) {
                  if (!ie.a(((q) this).field_d, 2)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                q.a(4);
                if (field_a == 2) {
                  if (!ie.a(((q) this).field_d, 2)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final static void a(boolean param0) {
        la var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = ra.field_C;
              if (param0) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: while (true) {
              if (!lg.c(-1)) {
                break L0;
              } else {
                var1.c(8, 7);
                int fieldTemp$5 = var1.field_k + 1;
                var1.field_k = var1.field_k + 1;
                var2 = fieldTemp$5;
                rc.a(78, var1);
                ra.field_C.a(param0, -var2 + var1.field_k);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1_ref, "q.D(" + param0 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_j = null;
        field_o = null;
        int var1 = 36 % ((24 - param0) / 56);
        field_k = null;
        field_m = null;
    }

    q(boolean param0) {
        ((q) this).field_h = id.field_h;
        ((q) this).field_e = fd.field_e;
        if (!param0) {
            ((q) this).field_i = null;
        } else {
            ((q) this).field_i = hi.field_A;
        }
        ((q) this).field_l = nl.field_b;
        ((q) this).field_g = lg.field_a;
        ((q) this).field_d = o.field_b;
        ((q) this).field_b = jb.field_d;
        ((q) this).field_f = ka.field_c;
        ((q) this).field_n = li.field_l;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 == -1) {
                      break L1;
                    } else {
                      q.a(false);
                      break L1;
                    }
                  }
                  L2: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(of.a(param0, var5, false), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("q.B(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
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
              throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = new java.util.zip.CRC32();
        field_j = "End Game";
        field_o = "Next page";
    }
}
