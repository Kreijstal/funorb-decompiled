/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends lh {
    static int field_i;
    int field_q;
    static fh field_l;
    static String[][] field_k;
    static int[] field_o;
    static String field_j;
    static int field_r;
    static String field_n;
    static String field_m;
    static int field_p;

    final static void a(int param0, ke param1, rh param2, int param3) {
        wf.field_c = bm.f((byte) 73) * param3 / 1000;
        fl.a((byte) 101, param2);
        if (param0 != -1) {
            return;
        }
        try {
            vc.a((byte) 125, param2);
            ed.a(param2, (byte) -111);
            kl.b(param0 ^ -31208);
            aa.c((byte) -65);
            vg.field_z = -wf.field_c + 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "kb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        java.awt.Component var8 = null;
        byte[] var9 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        wa var5 = null;
        byte[] var6 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 84) {
                break L1;
              } else {
                var8 = (java.awt.Component) null;
                kb.a((java.awt.Component) null, -7, -95, 67);
                break L1;
              }
            }
            L2: {
              if (-1 <= (param3 ^ -1)) {
                var4 = param0;
                break L2;
              } else {
                var9 = new byte[param1];
                var4 = var9;
                var5_int = 0;
                L3: while (true) {
                  if (param1 <= var5_int) {
                    break L2;
                  } else {
                    var9[var5_int] = param0[param3 + var5_int];
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            var5 = new wa();
            var5.b(-124);
            var5.a((byte) -127, (long)(param1 * 8), var4);
            var11 = new byte[64];
            var10 = var11;
            var6 = var10;
            var5.a(var11, 0, (byte) -85);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("kb.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    kb(int param0) {
        this.field_q = param0;
    }

    public static void b(boolean param0) {
        field_j = null;
        if (param0) {
          kb.b(true);
          field_o = null;
          field_m = null;
          field_l = null;
          field_n = null;
          field_k = (String[][]) null;
          return;
        } else {
          field_o = null;
          field_m = null;
          field_l = null;
          field_n = null;
          field_k = (String[][]) null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        nb.field_a.a(param0 ^ 0, param0, 0);
    }

    final static uc a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            uc var5 = null;
            bj var5_ref = null;
            java.awt.Component var6 = null;
            uc stackIn_3_0 = null;
            bj stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param3 == 1024) {
                        break L2;
                      } else {
                        var6 = (java.awt.Component) null;
                        kb.a((java.awt.Component) null, 73, 77, -125);
                        break L2;
                      }
                    }
                    var4 = Class.forName("ka");
                    var5 = (uc) (var4.newInstance());
                    var5.a(param0, param1, param2, -100);
                    stackIn_3_0 = (uc) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new bj();
                  ((uc) ((Object) var5_ref)).a(param0, param1, param2, -104);
                  stackIn_5_0 = (bj) (var5_ref);
                  return (uc) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("kb.D(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_i = 0;
        field_l = new fh(12, 0, 1, 0);
        field_r = -1;
        field_m = "Connection restored.";
        field_n = "If you get stuck and can't solve a puzzle, don't give up. Every level IS possible! Often a seemingly pointless tile will help you win if you think what it might be there for. Some levels can be beaten in several different ways. Sometimes an approach will almost but not quite work, and a fresh approach might be the best way to proceed!";
        field_o = new int[8192];
        field_p = 20;
        field_j = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
