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
        boolean discarded$2 = false;
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          discarded$2 = pe.a(100, -24);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void b(int param0) {
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
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
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
              L3: {
                if (-1 == (var2 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (var2 == 1) {
                      break L4;
                    } else {
                      qb.a((Throwable) null, 16408, "A1: " + qk.d((byte) 47));
                      si.a(78);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = var9.i(7553);
                  var4_ref_fa = (fa) ((Object) sa.field_C.c((byte) 46));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4_ref_fa == null) {
                          break L7;
                        } else {
                          stackOut_9_0 = var3 ^ -1;
                          stackIn_16_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_10_0 != (var4_ref_fa.field_s ^ -1)) {
                                break L8;
                              } else {
                                if (var6 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var4_ref_fa = (fa) ((Object) sa.field_C.d(true));
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var4_ref_fa != null) {
                        var4_ref_fa.b((byte) 119);
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_15_0 = 60;
                        stackIn_16_0 = stackOut_15_0;
                        break L6;
                      }
                    }
                    si.a(stackIn_16_0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var8 = (hd) ((Object) c.field_r.c((byte) 80));
              if (var8 == null) {
                si.a(67);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L9: {
                  L10: {
                    var4 = var9.d((byte) -90);
                    if (0 == var4) {
                      break L10;
                    } else {
                      var13 = new byte[var4];
                      var9.a(var13, 0, (byte) 125, var4);
                      if (var6 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var5 = null;
                  break L9;
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
                      if (-1 < (var2_int ^ -1)) {
                        si.a(69);
                        return false;
                      } else {
                        if ((sl.a(param0 + -25974) ^ -1L) >= -30001L) {
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          si.a(69);
                          return false;
                        }
                      }
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
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        de.field_V.field_n = 0;
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  si.a(96);
                  return false;
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_13_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    return false;
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
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param2 <= -103) {
                break L1;
              } else {
                discarded$2 = pe.a(73, -42);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              L3: {
                if (var5 >= param1) {
                  var4_int = var4_int ^ -1;
                  break L3;
                } else {
                  var4_int = a.field_j[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 922790152;
                  var5++;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              stackOut_9_0 = var4_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("pe.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
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
