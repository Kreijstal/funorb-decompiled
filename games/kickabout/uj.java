/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj extends tm {
    static ut field_B;
    static String field_C;
    static int[] field_D;
    static String field_A;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        param2 = n.a('_', "", (byte) -125, param2);
        if (param0 >= 12) {
          L0: {
            L1: {
              var3 = bo.a(-1, param1);
              if (param2.indexOf(param1) != -1) {
                break L1;
              } else {
                if (-1 == param2.indexOf(var3)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_B = null;
        field_C = null;
        if (param0) {
            field_B = null;
        }
        field_D = null;
    }

    final static ut[] a(byte param0, it[] param1, String[] param2, int param3) {
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var4 = param2.length;
        ut[] var5 = new ut[var4];
        if (param0 > -58) {
            field_B = null;
        }
        for (var6 = 0; var6 < var4; var6++) {
            var7 = param2[var6];
            var5[var6] = new ut(q.field_d.a(var7) + 4, 18);
            iw.a(82, var5[var6]);
            var8 = param1[var6].field_p != param3 ? 16755370 : 11184895;
            q.field_d.d(var7, on.field_g >> -870119327, -4 + on.field_f, var8, -1);
            ta.e(117);
            var5[var6].a(65793);
        }
        return var5;
    }

    uj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            return null;
        }
        return new li(vg.e(-63, param1[0].b(-30368)));
    }

    final static boolean a(byte param0, int param1) {
        try {
            int var2 = 0;
            IOException var2_ref_IOException = null;
            int stackIn_9_0 = 0;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_8_0 = 0;
            if (un.field_e.field_n < param1) {
              if (op.field_y != null) {
                try {
                  L0: {
                    var2 = op.field_y.a((byte) 63);
                    if (0 >= var2) {
                      L1: {
                        L2: {
                          if (0 > var2) {
                            break L2;
                          } else {
                            if (30000L < aa.c(29680)) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        lr.b((byte) -116);
                        break L1;
                      }
                      break L0;
                    } else {
                      L3: {
                        if (param1 - un.field_e.field_n >= var2) {
                          break L3;
                        } else {
                          var2 = -un.field_e.field_n + param1;
                          break L3;
                        }
                      }
                      op.field_y.a(un.field_e.field_f, var2, un.field_e.field_n, -4847);
                      ci.field_c = nj.a(-128);
                      un.field_e.field_n = un.field_e.field_n + var2;
                      if (param1 <= un.field_e.field_n) {
                        un.field_e.field_n = 0;
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                    lr.b((byte) -116);
                    break L4;
                  }
                }
                var2 = -124 / ((param0 - -30) / 55);
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        if (!(hk.field_G)) {
            throw new IllegalStateException();
        }
        if (null != rk.field_f) {
            rk.field_f.q(-96);
        }
        String var1 = vg.a(-110);
        pb.field_E = new pd(var1, (String) null, param0, false, false);
        wd.field_l.a((fd) (Object) we.field_a, false);
        we.field_a.a((byte) -126, (fd) (Object) pb.field_E);
        we.field_a.m(4000);
    }

    final static sj a(int param0, byte param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            Object var7 = null;
            Object var8 = null;
            wm var9 = null;
            sj stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            sj stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6_int = 60 % ((20 - param1) / 35);
                  var7 = null;
                  if (hf.field_e.field_c != null) {
                    ao.field_h = new ew(hf.field_e.field_c, 5200, 0);
                    hf.field_e.field_c = null;
                    var7 = (Object) (Object) new qh(255, ao.field_h, new ew(hf.field_e.field_j, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var8 = null;
                  if (null != ao.field_h) {
                    L3: {
                      if (null != u.field_j) {
                        break L3;
                      } else {
                        u.field_j = new ew[hf.field_e.field_v.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (u.field_j[param0] != null) {
                        break L4;
                      } else {
                        u.field_j[param0] = new ew(hf.field_e.field_v[param0], 12000, 0);
                        hf.field_e.field_v[param0] = null;
                        break L4;
                      }
                    }
                    var8 = (Object) (Object) new qh(param0, ao.field_h, u.field_j[param0], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var9 = al.field_Ab.a((qh) var8, -122, param0, param4, (qh) var7);
                  if (param3) {
                    var9.b((byte) 55);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_13_0 = new sj((ow) (Object) var9, param5, param2);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var6.toString());
            }
            return stackIn_14_0;
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
        field_C = "Asking to join <%0>'s game...";
        field_A = "Email: ";
    }
}
