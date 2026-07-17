/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ct extends ml {
    static int field_x;
    static java.applet.Applet field_z;
    static hr[] field_A;
    private byte[] field_y;

    ct() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static void a(int param0, ah param1) {
        RuntimeException var2 = null;
        double var2_double = 0.0;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1.field_Q == 0) {
                break L1;
              } else {
                L2: {
                  var2_double = vp.field_d[param1.field_N] * (double)gq.field_q[param1.field_Q];
                  var2_double = var2_double + (double)(param1.field_G / 50);
                  var2_double = var2_double * (double)pd.field_p;
                  cb.a((int)var2_double, -1372239541);
                  if ((1 << param1.field_Q & qk.field_T) == 0) {
                    qk.field_T = qk.field_T | 1 << param1.field_Q;
                    bi.field_c = bi.field_c + 1;
                    break L2;
                  } else {
                    qk.field_T = 0;
                    bi.field_c = 1;
                    qk.field_T = qk.field_T | 1 << param1.field_Q;
                    break L2;
                  }
                }
                L3: {
                  rn.a(Integer.toString((int)var2_double), param1.field_C >> 8, param1.field_z >> 8, 16777215, 28807);
                  if (qk.field_T == 0) {
                    break L3;
                  } else {
                    if (ps.field_e[13] != bi.field_c) {
                      break L3;
                    } else {
                      th.b(24753, 242, 13);
                      break L3;
                    }
                  }
                }
                if (7 != oh.field_e) {
                  break L1;
                } else {
                  if (0 == an.field_a) {
                    L4: {
                      if (param1.field_N == 5) {
                        ei.field_a = ei.field_a + 1;
                        break L4;
                      } else {
                        ei.field_a = ei.field_a - 1;
                        break L4;
                      }
                    }
                    if (ei.field_a == 4) {
                      th.b(24753, 240, 15);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    od.a(param1.field_N, (byte) 73);
                    return;
                  }
                }
              }
            }
            od.a(param1.field_N, (byte) 73);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ct.A(").append(6510).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          return null;
        } else {
          ((ct) this).field_y = new byte[2 * (param0 * param1 * param3)];
          ((ct) this).a(param3, 206, param1, param0);
          return ((ct) this).field_y;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param1;
        var5 = param0 & 255;
        int incrementValue$2 = var4;
        var4++;
        ((ct) this).field_y[incrementValue$2] = (byte) -1;
        ((ct) this).field_y[var4] = (byte)(3 * var5 >> 5);
        if (param2 != 4096) {
          field_x = 71;
          return;
        } else {
          return;
        }
    }

    public static void d() {
        field_z = null;
        field_A = null;
    }

    final static void b() {
        aa.field_a = new ah[100];
        int discarded$0 = 72;
        sm.a();
        bj.field_b = new jn();
        is.field_c = new jn();
        he.field_o = new Random();
        db.field_l = 1;
        in.field_z = 0;
        nd.field_F = 1;
        iw.field_b = 0;
        td.field_m = false;
        int discarded$1 = 0;
        ke.a();
        oc.field_e = 1000;
        ag.a(0, 8);
    }

    static {
    }
}
