/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vc {
    static ci field_e;
    static jj field_d;
    static jj field_g;
    static String field_b;
    static fh field_c;
    static ud field_f;
    static ec field_a;

    abstract void b(int param0);

    final int a(long param0, int param1) {
        if (param1 >= -45) {
            field_a = (ec) null;
        }
        long var4 = this.a(120);
        if (!(var4 <= 0L)) {
            gi.a((byte) -93, var4);
        }
        return this.a(0, param0);
    }

    abstract long a(int param0);

    abstract int a(int param0, long param1);

    public static void c(int param0) {
        boolean discarded$0 = false;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            discarded$0 = vc.a(83, 26);
        }
        field_e = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            L0: {
              if (param0 <= -97) {
                break L0;
              } else {
                field_b = (String) null;
                break L0;
              }
            }
            if (mk.field_j.field_k >= param1) {
              return true;
            } else {
              if (null != ig.field_e) {
                try {
                  L1: {
                    var2_int = ig.field_e.a(0);
                    if (-1 > (var2_int ^ -1)) {
                      L2: {
                        if (param1 - mk.field_j.field_k >= var2_int) {
                          break L2;
                        } else {
                          var2_int = param1 - mk.field_j.field_k;
                          break L2;
                        }
                      }
                      ig.field_e.a(mk.field_j.field_i, var2_int, mk.field_j.field_k, (byte) 114);
                      dm.field_c = ll.a(1000);
                      mk.field_j.field_k = mk.field_j.field_k + var2_int;
                      if (param1 > mk.field_j.field_k) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        mk.field_j.field_k = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    } else {
                      L3: {
                        if (0 > var2_int) {
                          gb.g(-17464);
                          break L3;
                        } else {
                          if (30000L >= ce.b(1)) {
                            decompiledRegionSelector0 = 2;
                            break L1;
                          } else {
                            gb.g(-17464);
                            break L3;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    gb.g(-17464);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_14_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_16_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        ci var2 = null;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        ci var1 = new ci(540, 140);
        il.a(1, var1);
        ob.b();
        l.a();
        if (!param0) {
            return;
        }
        try {
            kf.field_f = 0;
            af.d(-2766);
            var2 = var1.d();
            for (var3 = 0; (var3 ^ -1) > -16; var3++) {
                var2.b(-2, -2, 16777215);
                l.e(4, 4, 0, 0, 540, 140);
            }
            s.field_a.a();
            var1.f(0, 0);
            ij.a(!param0 ? true : false);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "vc.M(" + param0 + ')');
        }
    }

    static {
        field_d = new jj();
        field_b = "L-TAW";
        field_g = new jj();
    }
}
