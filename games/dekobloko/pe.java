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
            pe.a(100, -24);
        }
        field_d = null;
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fa var4_ref_fa = null;
        Object var5 = null;
        int var6 = 0;
        hd var8 = null;
        uf var9 = null;
        byte[] var13 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = de.field_V;
              var2 = var9.d((byte) -119);
              if (param0 == 14750) {
                break L1;
              } else {
                field_e = (w) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (var2 ^ -1)) {
                var8 = (hd) ((Object) c.field_r.c((byte) 80));
                if (var8 == null) {
                  si.a(67);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var4 = var9.d((byte) -90);
                    if (0 == var4) {
                      var5 = null;
                      break L3;
                    } else {
                      var13 = new byte[var4];
                      var9.a(var13, 0, (byte) 125, var4);
                      break L3;
                    }
                  }
                  var9.field_n = var9.field_n + 4;
                  if (!var9.g(0)) {
                    si.a(param0 ^ 14802);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var8.b((byte) 109);
                    break L2;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.i(7553);
                  var4_ref_fa = (fa) ((Object) sa.field_C.c((byte) 46));
                  L4: while (true) {
                    L5: {
                      if (var4_ref_fa == null) {
                        break L5;
                      } else {
                        if (var3 != var4_ref_fa.field_s) {
                          var4_ref_fa = (fa) ((Object) sa.field_C.d(true));
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var4_ref_fa != null) {
                      var4_ref_fa.b((byte) 119);
                      break L2;
                    } else {
                      si.a(60);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  qb.a((Throwable) null, 16408, "A1: " + qk.d((byte) 47));
                  si.a(78);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "pe.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            L0: {
              if (param0 == 25973) {
                break L0;
              } else {
                field_b = (String) null;
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
                            decompiledRegionSelector0 = 2;
                            break L1;
                          } else {
                            si.a(69);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
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
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        de.field_V.field_n = 0;
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    si.a(96);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_13_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param2 <= -103) {
                break L1;
              } else {
                pe.a(73, -42);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              if (var5 >= param1) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = a.field_j[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 922790152;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("pe.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        field_c = "Passwords must be between 5 and 20 characters long";
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
