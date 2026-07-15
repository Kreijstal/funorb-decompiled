/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pe {
    static ck field_d;
    static String field_a;
    static String field_c;
    static String field_b;
    static w field_e;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            boolean discarded$0 = pe.a(100, -24);
        }
        field_d = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        fa var4_ref_fa = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        fa var8 = null;
        hd var9 = null;
        uf var10 = null;
        byte[] var14 = null;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var10 = de.field_V;
          var2 = var10.d((byte) -119);
          if (param0 == 14750) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          if (-1 == (var2 ^ -1)) {
            var9 = (hd) (Object) c.field_r.c((byte) 80);
            if (var9 == null) {
              si.a(67);
              return;
            } else {
              L2: {
                var4 = var10.d((byte) -90);
                if (0 == var4) {
                  var5 = null;
                  break L2;
                } else {
                  var14 = new byte[var4];
                  var10.a(var14, 0, (byte) 125, var4);
                  break L2;
                }
              }
              var10.field_n = var10.field_n + 4;
              if (!var10.g(0)) {
                si.a(param0 ^ 14802);
                return;
              } else {
                var9.b((byte) 109);
                break L1;
              }
            }
          } else {
            if (var2 == 1) {
              var3 = var10.i(7553);
              fa dupTemp$4 = (fa) (Object) sa.field_C.c((byte) 46);
              var8 = dupTemp$4;
              var4_ref_fa = dupTemp$4;
              L3: while (true) {
                L4: {
                  if (var8 == null) {
                    break L4;
                  } else {
                    if (var3 != var8.field_s) {
                      var4_ref_fa = (fa) (Object) sa.field_C.d(true);
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var4_ref_fa != null) {
                  var4_ref_fa.b((byte) 119);
                  break L1;
                } else {
                  si.a(60);
                  return;
                }
              }
            } else {
              qb.a((Throwable) null, 16408, "A1: " + qk.d((byte) 47));
              si.a(78);
              break L1;
            }
          }
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            L0: {
              if (param0 == 25973) {
                break L0;
              } else {
                field_b = null;
                break L0;
              }
            }
            if (de.field_V.field_n < param1) {
              if (qc.field_s == null) {
                return false;
              } else {
                try {
                  L1: {
                    var2_int = qc.field_s.b(0);
                    if ((var2_int ^ -1) >= -1) {
                      L2: {
                        if (-1 < (var2_int ^ -1)) {
                          si.a(69);
                          break L2;
                        } else {
                          if ((sl.a(param0 + -25974) ^ -1L) >= -30001L) {
                            decompiledRegionSelector0 = 0;
                            break L1;
                          } else {
                            si.a(69);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      L3: {
                        if (-de.field_V.field_n + param1 >= var2_int) {
                          break L3;
                        } else {
                          var2_int = -de.field_V.field_n + param1;
                          break L3;
                        }
                      }
                      qc.field_s.a(var2_int, de.field_V.field_n, (byte) 17, de.field_V.field_r);
                      p.field_a = ik.a(4);
                      de.field_V.field_n = de.field_V.field_n + var2_int;
                      if (param1 > de.field_V.field_n) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        de.field_V.field_n = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    si.a(96);
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
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

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var4 = -1;
        if (param2 > -103) {
            boolean discarded$0 = pe.a(73, -42);
        }
        for (var5 = param3; var5 < param1; var5++) {
            var4 = a.field_j[(param0[var5] ^ var4) & 255] ^ var4 >>> 922790152;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static boolean a(int param0, int param1) {
        if (param0 != 922790152) {
            return false;
        }
        return param1 == (-param1 & param1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords must be between 5 and 20 characters long";
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
