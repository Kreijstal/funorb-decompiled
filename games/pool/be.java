/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be extends ob {
    static String field_K;
    static String field_J;
    static int field_I;
    private static int field_H;
    static vh field_L;

    final static void a(ge param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              L1: {
                var5 = Pool.field_O;
                var6 = new byte[24];
                var2 = var6;
                if (nl.field_c == null) {
                  break L1;
                } else {
                  try {
                    L2: {
                      nl.field_c.a(0, 0L);
                      nl.field_c.a(param1 + 114, var6);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          if (-25 >= (var3_int ^ -1)) {
                            break L4;
                          } else {
                            if (-1 == (var2[var3_int] ^ -1)) {
                              var3_int++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3_int >= 24) {
                          throw new IOException();
                        } else {
                          param0.a(var2, (byte) 0, param1, 24);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L6: while (true) {
                        if (var4 >= 24) {
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          var2[var4] = (byte)-1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param0.a(var2, (byte) 0, param1, 24);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(byte param0) {
        field_J = null;
        if (param0 != -89) {
            field_H = -35;
        }
        field_L = null;
        field_K = null;
    }

    final static void f(int param0) {
        ep.field_z = false;
        ro.field_e = false;
        lf.a(param0, (byte) 111);
        pa.field_I = aa.field_c;
        wd.field_Lb = aa.field_c;
    }

    final boolean f(int param0, int param1) {
        if (param0 != -13676) {
            field_L = null;
        }
        return param1 == ((be) this).field_h.length + -1 ? true : false;
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
            int discarded$0 = ((be) this).b((byte) 113, 90);
        }
        return ((be) this).field_s * param1 + (((be) this).field_x + (param1 != -1 + ((be) this).field_h.length ? 0 : 20));
    }

    final static void a(int param0, int param1, int param2, int param3, so[] param4, int param5, eg param6) {
        int[] var8 = mj.a(-31121);
        int[] var7 = var8;
        var8[param3] = param1;
        var8[0] = param5;
        var8[2] = param2;
        param4[0 + param0] = hc.a(param6, var8, (byte) 101);
        int[] var9 = dq.a((byte) 10, f.a((byte) 94, var8));
        var7 = var9;
        param4[param0 - -1] = hc.a(param6, var9, (byte) 101);
    }

    be(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(mc.field_k, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        if (param0 <= 36) {
            field_K = null;
        }
        super.c(92);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Cancel";
        field_H = 3;
        field_J = "More suggestions";
        field_I = 1 << field_H;
    }
}
