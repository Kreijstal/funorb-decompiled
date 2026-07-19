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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (param1.field_Q ^ -1)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var2_double = vp.field_d[param1.field_N] * (double)gq.field_q[param1.field_Q];
                    var2_double = var2_double + (double)(param1.field_G / 50);
                    var2_double = var2_double * (double)pd.field_p;
                    cb.a((int)var2_double, -1372239541);
                    if ((1 << param1.field_Q & qk.field_T) == 0) {
                      break L3;
                    } else {
                      qk.field_T = 0;
                      bi.field_c = 1;
                      qk.field_T = qk.field_T | 1 << param1.field_Q;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qk.field_T = qk.field_T | 1 << param1.field_Q;
                  bi.field_c = bi.field_c + 1;
                  break L2;
                }
                L4: {
                  rn.a(Integer.toString((int)var2_double), param1.field_C >> -1852132440, param1.field_z >> 1911001992, 16777215, 28807);
                  if (qk.field_T == 0) {
                    break L4;
                  } else {
                    if (ps.field_e[13] != bi.field_c) {
                      break L4;
                    } else {
                      th.b(24753, 242, 13);
                      break L4;
                    }
                  }
                }
                if (7 != oh.field_e) {
                  break L1;
                } else {
                  if (0 == an.field_a) {
                    L5: {
                      L6: {
                        if (-6 == (param1.field_N ^ -1)) {
                          break L6;
                        } else {
                          ei.field_a = ei.field_a - 1;
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ei.field_a = ei.field_a + 1;
                      break L5;
                    }
                    if ((ei.field_a ^ -1) == -5) {
                      th.b(24753, 240, 15);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (param0 == 6510) {
                break L7;
              } else {
                ct.b(true);
                break L7;
              }
            }
            od.a(param1.field_N, (byte) 73);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("ct.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          return (byte[]) null;
        } else {
          this.field_y = new byte[2 * (param0 * param1 * param3)];
          this.a(param3, 206, param1, param0);
          return this.field_y;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param1;
        var5 = param0 & 255;
        int incrementValue$2 = var4;
        var4++;
        this.field_y[incrementValue$2] = (byte)-1;
        this.field_y[var4] = (byte)(3 * var5 >> -971127963);
        if (param2 != 4096) {
          field_x = 71;
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        field_z = null;
        if (param0 >= -15) {
            return;
        }
        field_A = null;
    }

    final static void b(boolean param0) {
        aa.field_a = new ah[100];
        sm.a(72);
        bj.field_b = new jn();
        is.field_c = new jn();
        he.field_o = new Random();
        db.field_l = 1;
        in.field_z = 0;
        nd.field_F = 1;
        iw.field_b = 0;
        td.field_m = false;
        if (!param0) {
          return;
        } else {
          ke.a(false);
          oc.field_e = 1000;
          ag.a(0, 8);
          return;
        }
    }

    static {
    }
}
