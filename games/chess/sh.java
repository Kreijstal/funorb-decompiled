/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sh {
    static km[] field_b;
    static String field_a;
    static String field_c;
    static String field_d;

    final static void a(byte param0) {
        bo.a((byte) 33);
        if (param0 == -59) {
          dk.field_g = true;
          bc.field_d = true;
          jh.field_e.i(param0 ^ -59);
          qd.a(-1845, qi.field_n, false);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 <= -96) {
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        sh.a(113, (byte[]) null);
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static um a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param3 != 935) {
          return (um) null;
        }
        return ci.a(param3 ^ -16417, param1, param0, param4, false, param2);
    }

    final static void a(int param0) {
        int var1 = 121 / ((param0 - 40) / 53);
        if (jh.field_e != null) {
          jh.field_e.j(10907);
        }
        if (null == mk.field_e) {
          of.d(-103);
          return;
        }
        mk.field_e.l(-30336);
        of.d(-103);
    }

    final static c a(int param0, byte[] param1) {
        c var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        c stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            sh.a(-117, -92, false, -84, false);
          }
          if (param1 == null) {
            stackIn_4_0 = null;
            return (c) (stackIn_4_0);
          }
          var2 = new c(param1, be.field_a, a.field_c, wm.field_b, b.field_c, vk.field_d);
          ch.k(4210752);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("sh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 < 0) {
          return (1 + param1) % 4 == 0 ? true : false;
        }
        if (1582 > param1) {
          return 0 == param1 % 4 ? true : false;
        }
        if (0 != param1 % 4) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (param1 % 400 != 0) {
          return false;
        }
        if (param0 == 14222) {
          return true;
        }
        return true;
    }

    final static int b(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_23_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          p var2 = null;
          if (4 <= qh.field_c.field_g) {
            if (qh.field_c.field_c == -1) {
              return 3;
            }
            if (-2 == qh.field_c.field_c) {
              return 4;
            }
            return 1;
          }
          try {
            if (vm.field_k == 0) {
              dm.field_b = ol.field_N.a(ml.field_h, false, of.field_g);
              vm.field_k = vm.field_k + 1;
            }
            if (vm.field_k == 1) {
              if (dm.field_b.field_f == 2) {
                stackIn_14_0 = ic.a(125, -1);
                return stackIn_14_0;
              }
              if (dm.field_b.field_f == 1) {
                vm.field_k = vm.field_k + 1;
              }
            }
            if (vm.field_k == 2) {
              jj.field_a = new hn((java.net.Socket) (dm.field_b.field_b), ol.field_N);
              var2 = new p(13);
              dh.a(ue.field_e, 11, uj.field_n, tg.field_t, var2);
              var2.c(15, (byte) 95);
              var2.d(ln.field_oc, (byte) -81);
              jj.field_a.a(0, 13, (byte) -92, var2.field_o);
              vm.field_k = vm.field_k + 1;
              ve.field_Pb = 30000L + ud.a(2);
            }
            if (vm.field_k == 3) {
              if (jj.field_a.c(0) > 0) {
                var1_int = jj.field_a.b((byte) -103);
                if (0 != var1_int) {
                  stackIn_26_0 = ic.a(118, var1_int);
                  return stackIn_26_0;
                }
                vm.field_k = vm.field_k + 1;
              } else {
                if (ud.a(2) > ve.field_Pb) {
                  stackIn_23_0 = ic.a(-92, -2);
                  return stackIn_23_0;
                }
              }
            }
            if (param0 != 32288) {
              sh.a(24);
            }
            if (vm.field_k != 4) {
              stackIn_34_0 = -1;
              return stackIn_34_0;
            }
            qh.field_c.a((byte) 45, jj.field_a, oh.field_b);
            jj.field_a = null;
            dm.field_b = null;
            vm.field_k = 0;
            stackIn_32_0 = 0;
            return stackIn_32_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ic.a(-18, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        vk.field_g = 0;
        if (param0) {
          return;
        }
        df.a(true);
    }

    static {
        field_a = "Withdraw invitation to <%0> to join this game";
        field_c = "Pawn";
        field_d = "Names should contain a maximum of 12 characters";
    }
}
