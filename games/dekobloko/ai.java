/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends ek {
    int field_O;
    static byte[] field_N;
    static String field_T;
    int field_R;
    static int field_P;
    int field_K;
    static String field_L;
    static String field_M;
    int field_S;
    int field_V;
    static String field_U;
    int field_Q;

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -((ai) this).field_O - (param5 - -((ai) this).field_u) + param1;
          var9 = param0 - ((ai) this).field_V - (param4 - -((ai) this).field_D);
          if (var8 * var8 + var9 * var9 < ((ai) this).field_K * ((ai) this).field_K) {
            var10 = Math.atan2((double)var9, (double)var8) - hc.field_b;
            if (0.0 <= var10) {
              L0: {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((ai) this).field_Q;
                  break L0;
                }
              }
              ((ai) this).field_R = (int)((double)((ai) this).field_Q * var10 / 6.283185307179586);
              L1: while (true) {
                if (((ai) this).field_Q <= ((ai) this).field_R) {
                  ((ai) this).field_R = ((ai) this).field_R - ((ai) this).field_Q;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (((ai) this).field_R >= 0) {
                      return true;
                    } else {
                      ((ai) this).field_R = ((ai) this).field_R + ((ai) this).field_Q;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((ai) this).field_Q;
              ((ai) this).field_R = (int)((double)((ai) this).field_Q * var10 / 6.283185307179586);
              L3: while (true) {
                if (((ai) this).field_Q <= ((ai) this).field_R) {
                  ((ai) this).field_R = ((ai) this).field_R - ((ai) this).field_Q;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (((ai) this).field_R >= 0) {
                      return true;
                    } else {
                      ((ai) this).field_R = ((ai) this).field_R + ((ai) this).field_Q;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 > -7) {
          ai.e((byte) -48);
          field_M = null;
          field_N = null;
          field_L = null;
          field_T = null;
          field_U = null;
          return;
        } else {
          field_M = null;
          field_N = null;
          field_L = null;
          field_T = null;
          field_U = null;
          return;
        }
    }

    final static void a(int param0, int param1, ud param2, int param3, int param4) {
        int var5 = 0;
        if (param0 <= 56) {
          field_P = -82;
          var5 = (int)(0.5 + (double)(param2.field_p * 256) * Math.pow(2.0, (double)param1 * 0.08333333333333333) / (double)en.field_o);
          dg.field_c.a(param2, var5, param4 * pb.field_d, param3 << 911025766);
          return;
        } else {
          var5 = (int)(0.5 + (double)(param2.field_p * 256) * Math.pow(2.0, (double)param1 * 0.08333333333333333) / (double)en.field_o);
          dg.field_c.a(param2, var5, param4 * pb.field_d, param3 << 911025766);
          return;
        }
    }

    final static void e(byte param0) {
        ck var1 = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!db.field_d) {
            var1 = ue.field_b;
            var5 = 320 * (vf.field_b * vf.field_b) / 900;
            L1: {
              var4 = 0;
              if (!wg.field_f) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L1;
              }
            }
            var3 = stackIn_12_0;
            var2 = hh.field_a;
            break L0;
          } else {
            L2: {
              var1 = hh.field_a;
              if (!wg.field_f) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_4_0;
            var2 = ue.field_b;
            var3 = 0;
            var5 = 320 + -(vf.field_b * vf.field_b * 320 / 900);
            break L0;
          }
        }
        L3: {
          if (var3 == 0) {
            break L3;
          } else {
            if (var4 == 0) {
              break L3;
            } else {
              var4 = 0;
              var3 = 0;
              break L3;
            }
          }
        }
        hk.b(0, 0, 640, 160 + -var5);
        var6 = 128 * var5 / 320 + 128;
        dl.a((byte) 93, var4 != 0, var2, -var5, 256);
        hk.b(0, 160 - var5, 213, 320 - var5);
        dl.a((byte) 123, var4 != 0, var2, -var5, 256);
        hk.b(427, 160 - var5, 640, 320 + -var5);
        dl.a((byte) 121, var4 != 0, var2, -var5, 256);
        hk.b(0, -var5 + 320, 213, 320 + var5);
        dl.a((byte) 92, var3 != 0, var1, 0, var6);
        hk.b(213, 160 - var5, 427, var5 + 160);
        dl.a((byte) 91, var3 != 0, var1, 0, var6);
        hk.b(427, 320 - var5, 640, 320 + var5);
        dl.a((byte) 91, var3 != 0, var1, 0, var6);
        if (param0 != 84) {
          field_U = null;
          hk.b(213, 160 + var5, 427, 320 - -var5);
          dl.a((byte) 43, var4 != 0, var2, var5, 256);
          hk.b(0, var5 + 320, 640, 480);
          dl.a((byte) 121, var4 != 0, var2, var5, 256);
          hk.d();
          return;
        } else {
          hk.b(213, 160 + var5, 427, 320 - -var5);
          dl.a((byte) 43, var4 != 0, var2, var5, 256);
          hk.b(0, var5 + 320, 640, 480);
          dl.a((byte) 121, var4 != 0, var2, var5, 256);
          hk.d();
          return;
        }
    }

    final static boolean f(byte param0) {
        int var1 = -28 % ((param0 - -57) / 39);
        return fj.field_e;
    }

    final static void h(int param0) {
        Object var2 = null;
        Object var3 = null;
        var3 = null;
        qf.a(te.field_q, -128, (String) null);
        if (param0 < -6) {
          return;
        } else {
          var2 = null;
          ai.a(-10, 44, (ud) null, 29, -93);
          return;
        }
    }

    private ai() throws Throwable {
        throw new Error();
    }

    final static cl a(int param0, int param1, byte param2, int param3) {
        cl var4 = null;
        int var5 = 0;
        cl var6 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = (cl) (Object) oe.field_I.c((byte) 19);
        var4 = (cl) (Object) oe.field_I.c((byte) 19);
        L0: while (true) {
          if (var6 == null) {
            if (param2 != -111) {
              field_M = null;
              var4 = new cl();
              var4.field_z = param1;
              var4.field_q = param3;
              oe.field_I.a((bh) (Object) var4, param2 + 2888);
              fh.a((byte) 8, var4, param0);
              return var4;
            } else {
              var4 = new cl();
              var4.field_z = param1;
              var4.field_q = param3;
              oe.field_I.a((bh) (Object) var4, param2 + 2888);
              fh.a((byte) 8, var4, param0);
              return var4;
            }
          } else {
            if (param3 == var6.field_q) {
              return var6;
            } else {
              var4 = (cl) (Object) oe.field_I.d(true);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "This option cannot be combined with the current '<%0>' setting.";
        field_P = -1;
        field_M = "Send private message to <%0>";
        field_L = "Only show game chat from my friends";
        field_U = "Play free version";
    }
}
