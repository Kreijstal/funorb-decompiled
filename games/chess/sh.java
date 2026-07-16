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
        if (param0 != -59) {
          return;
        } else {
          dk.field_g = true;
          bc.field_d = true;
          jh.field_e.i(param0 ^ -59);
          qd.a(-1845, qi.field_n, false);
          return;
        }
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 > -96) {
          var2 = null;
          c discarded$2 = sh.a(113, (byte[]) null);
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static um a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param3 != 935) {
            return null;
        }
        return ci.a(param3 ^ -16417, param1, param0, param4, false, param2);
    }

    final static void a(int param0) {
        int var1 = 0;
        L0: {
          var1 = 121 / ((param0 - 40) / 53);
          if (jh.field_e != null) {
            jh.field_e.j(10907);
            break L0;
          } else {
            break L0;
          }
        }
        if (null != mk.field_e) {
          mk.field_e.l(-30336);
          of.d(-103);
          return;
        } else {
          of.d(-103);
          return;
        }
    }

    final static c a(int param0, byte[] param1) {
        c var2 = null;
        if (param0 == -1) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new c(param1, be.field_a, a.field_c, wm.field_b, b.field_c, vk.field_d);
            ch.k(4210752);
            return var2;
          }
        } else {
          um discarded$9 = sh.a(-117, -92, false, -84, false);
          if (param1 == null) {
            return null;
          } else {
            var2 = new c(param1, be.field_a, a.field_c, wm.field_b, b.field_c, vk.field_d);
            ch.k(4210752);
            return var2;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(-1 >= (param1 ^ -1))) {
            return -1 == ((1 + param1) % 4 ^ -1) ? true : false;
        }
        if (!(1582 <= param1)) {
            return 0 == param1 % 4 ? true : false;
        }
        if (!(0 == param1 % 4)) {
            return false;
        }
        if (-1 != (param1 % 100 ^ -1)) {
            return true;
        }
        if (param1 % 400 != 0) {
            return false;
        }
        if (param0 != 14222) {
            return true;
        }
        return true;
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            p var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (4 <= qh.field_c.field_g) {
              if (0 != (qh.field_c.field_c ^ -1)) {
                if (-2 != qh.field_c.field_c) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (vm.field_k != 0) {
                      break L1;
                    } else {
                      dm.field_b = ol.field_N.a(ml.field_h, false, of.field_g);
                      vm.field_k = vm.field_k + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (vm.field_k != 1) {
                      break L2;
                    } else {
                      if (dm.field_b.field_f == 2) {
                        stackOut_12_0 = ic.a(125, -1);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        if (-2 != (dm.field_b.field_f ^ -1)) {
                          break L2;
                        } else {
                          vm.field_k = vm.field_k + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (vm.field_k != 2) {
                      break L3;
                    } else {
                      jj.field_a = new hn((java.net.Socket) dm.field_b.field_b, ol.field_N);
                      var2 = new p(13);
                      dh.a(ue.field_e, 11, uj.field_n, tg.field_t, var2);
                      var2.c(15, (byte) 95);
                      var2.d(ln.field_oc, (byte) -81);
                      jj.field_a.a(0, 13, (byte) -92, var2.field_o);
                      vm.field_k = vm.field_k + 1;
                      ve.field_Pb = 30000L + ud.a(2);
                      break L3;
                    }
                  }
                  L4: {
                    if ((vm.field_k ^ -1) != -4) {
                      break L4;
                    } else {
                      if (-1 > (jj.field_a.c(0) ^ -1)) {
                        var1_int = jj.field_a.b((byte) -103);
                        if (0 == var1_int) {
                          vm.field_k = vm.field_k + 1;
                          break L4;
                        } else {
                          stackOut_24_0 = ic.a(118, var1_int);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      } else {
                        if (ud.a(2) <= ve.field_Pb) {
                          break L4;
                        } else {
                          stackOut_21_0 = ic.a(-92, -2);
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param0 == 32288) {
                      break L5;
                    } else {
                      sh.a(24);
                      break L5;
                    }
                  }
                  if ((vm.field_k ^ -1) != -5) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    qh.field_c.a((byte) 45, (Object) (Object) jj.field_a, oh.field_b);
                    jj.field_a = null;
                    dm.field_b = null;
                    vm.field_k = 0;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ic.a(-18, -3);
              }
              return stackIn_33_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Withdraw invitation to <%0> to join this game";
        field_c = "Pawn";
        field_d = "Names should contain a maximum of 12 characters";
    }
}
