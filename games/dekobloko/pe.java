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

    public static void a() {
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fa var4_ref_fa = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        hd var8 = null;
        uf var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = de.field_V;
              var2 = var9.d((byte) -119);
              if (var2 == 0) {
                var8 = (hd) (Object) c.field_r.c((byte) 80);
                if (var8 == null) {
                  si.a(67);
                  return;
                } else {
                  L2: {
                    var4 = var9.d((byte) -90);
                    if (0 == var4) {
                      var5 = null;
                      break L2;
                    } else {
                      var13 = new byte[var4];
                      var9.a(var13, 0, (byte) 125, var4);
                      break L2;
                    }
                  }
                  var9.field_n = var9.field_n + 4;
                  if (!var9.g(0)) {
                    si.a(76);
                    return;
                  } else {
                    var8.b((byte) 109);
                    break L1;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.i(7553);
                  var4_ref_fa = (fa) (Object) sa.field_C.c((byte) 46);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_fa == null) {
                        break L4;
                      } else {
                        if (var3 != var4_ref_fa.field_s) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "pe.E(" + 14750 + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_12_0 = 0;
            if (de.field_V.field_n < param1) {
              if (qc.field_s == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = qc.field_s.b(0);
                    if (var2_int <= 0) {
                      L1: {
                        if (var2_int < 0) {
                          si.a(69);
                          break L1;
                        } else {
                          if (sl.a(-1) <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            si.a(69);
                            break L1;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L2: {
                        if (-de.field_V.field_n + param1 >= var2_int) {
                          break L2;
                        } else {
                          var2_int = -de.field_V.field_n + param1;
                          break L2;
                        }
                      }
                      qc.field_s.a(var2_int, de.field_V.field_n, (byte) 17, de.field_V.field_r);
                      p.field_a = ik.a(4);
                      de.field_V.field_n = de.field_V.field_n + var2_int;
                      if (param1 > de.field_V.field_n) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        de.field_V.field_n = 0;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    si.a(96);
                    decompiledRegionSelector0 = 1;
                    break L3;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param2 <= -103) {
                break L1;
              } else {
                boolean discarded$2 = pe.a(73, -42);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              if (var5 >= param1) {
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = a.field_j[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pe.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
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
