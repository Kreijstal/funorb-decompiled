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
        } else {
          vc.a((byte) 125, param2);
          ed.a(param2, (byte) -111);
          kl.b(param0 ^ -31208);
          aa.c((byte) -65);
          vg.field_z = -wf.field_c + 0;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        wa var12 = null;
        byte[] var13 = null;
        wa var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var7 = fleas.field_A ? 1 : 0;
        if (param2 <= 84) {
          L0: {
            var8 = null;
            uc discarded$1 = kb.a((java.awt.Component) null, -7, -95, 67);
            if (-1 <= (param3 ^ -1)) {
              var4 = param0;
              break L0;
            } else {
              var9 = new byte[param1];
              var4 = var9;
              var5 = 0;
              L1: while (true) {
                if (param1 <= var5) {
                  break L0;
                } else {
                  var9[var5] = param0[param3 + var5];
                  var5++;
                  continue L1;
                }
              }
            }
          }
          var12 = new wa();
          var12.b(-124);
          var12.a((byte) -127, (long)(param1 * 8), var4);
          var16 = new byte[64];
          var13 = var16;
          var11 = var13;
          var10 = var11;
          var6 = var10;
          var12.a(var16, 0, (byte) -85);
          return var6;
        } else {
          L2: {
            if (-1 <= (param3 ^ -1)) {
              var4 = param0;
              break L2;
            } else {
              var9 = new byte[param1];
              var4 = var9;
              var5 = 0;
              L3: while (true) {
                if (param1 <= var5) {
                  break L2;
                } else {
                  var9[var5] = param0[param3 + var5];
                  var5++;
                  continue L3;
                }
              }
            }
          }
          var14 = new wa();
          var14.b(-124);
          var14.a((byte) -127, (long)(param1 * 8), var4);
          var17 = new byte[64];
          var15 = var17;
          var11 = var15;
          var10 = var11;
          var6 = var10;
          var14.a(var17, 0, (byte) -85);
          return var6;
        }
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
        nb.field_a.a(param0 ^ 0, param0, 0);
    }

    final static uc a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            uc var5 = null;
            bj var5_ref = null;
            Object var6 = null;
            uc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            uc stackOut_2_0 = null;
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
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
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
