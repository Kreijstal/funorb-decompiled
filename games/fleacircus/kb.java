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
            vg.field_z = -wf.field_c;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "kb.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        wa var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 84) {
                break L1;
              } else {
                var8 = null;
                uc discarded$2 = kb.a((java.awt.Component) null, -7, -95, 67);
                break L1;
              }
            }
            L2: {
              if (param3 <= 0) {
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
            var13 = new byte[64];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var6 = var10;
            var5.a(var13, 0, (byte) -85);
            stackOut_8_0 = (byte[]) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("kb.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    kb(int param0) {
        ((kb) this).field_q = param0;
    }

    public static void b(boolean param0) {
        field_j = null;
        if (param0) {
          kb.b(true);
          field_o = null;
          field_m = null;
          field_l = null;
          field_n = null;
          field_k = null;
          return;
        } else {
          field_o = null;
          field_m = null;
          field_l = null;
          field_n = null;
          field_k = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        nb.field_a.a(param0, param0, 0);
    }

    final static uc a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            uc var5 = null;
            bj var5_ref = null;
            Object var6 = null;
            uc stackIn_3_0 = null;
            bj stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            uc stackOut_2_0 = null;
            bj stackOut_4_0 = null;
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
                  if (param3 == 1024) {
                    break L0;
                  } else {
                    var6 = null;
                    uc discarded$2 = kb.a((java.awt.Component) null, 73, 77, -125);
                    break L0;
                  }
                }
                var4 = Class.forName("ka");
                var5 = (uc) var4.newInstance();
                var5.a(param0, param1, param2, -100);
                stackOut_2_0 = (uc) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new bj();
                ((uc) (Object) var5_ref).a(param0, param1, param2, -104);
                stackOut_4_0 = (bj) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (uc) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("kb.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
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
              throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
