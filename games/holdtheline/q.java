/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class q {
    static qi field_a;
    static uf field_d;
    static int field_c;
    static int[] field_b;

    final static String b() {
        if (!(pf.field_d >= 2)) {
            return aj.field_d;
        }
        if (ml.field_a != null) {
            if (!ml.field_a.b((byte) -115)) {
                return rg.field_f;
            }
            return pb.field_d;
        }
        if (!(ah.field_d.b((byte) -115))) {
            return in.field_d;
        }
        if (!(ah.field_d.b("commonui", 64))) {
            return ge.field_a + " - " + ah.field_d.a("commonui", 0) + "%";
        }
        if (!am.field_d.b((byte) -63)) {
            return uf.field_d;
        }
        if (!am.field_d.b("commonui", 108)) {
            return wl.field_b + " - " + am.field_d.a("commonui", 0) + "%";
        }
        if (!ca.field_p.b((byte) -102)) {
            return g.field_l;
        }
        if (!ca.field_p.a((byte) -63)) {
            return uj.field_b + " - " + ca.field_p.a(0) + "%";
        }
        return ng.field_b;
    }

    final static void a(String param0, ql param1, int param2, int param3, byte param4, int param5) {
        try {
            param1.a(param0, param3 + 1, 1 + param5, 8, -1, 114);
            if (param4 > -126) {
                Object var7 = null;
                q.a(-69, (th) null);
            }
            param1.b(param0, param3, param5, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "q.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        t var4 = null;
        int var4_int = 0;
        int var5 = 0;
        se var5_ref_se = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        da var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var9 = rd.field_e;
              var2 = var9.f((byte) -62);
              var3 = var9.f((byte) -86);
              if (0 == var2) {
                var4 = (t) (Object) ih.field_j.b((byte) 100);
                if (var4 != null) {
                  L2: {
                    var5 = -var9.field_l + ad.field_c;
                    var13 = var4.field_m;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 > var13.length << 2) {
                      var5 = var13.length << 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var5) {
                      var4.d(0);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.f((byte) -110) << pk.a(var7 << 8, 768));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  r.a(-28036);
                  return;
                }
              } else {
                if (var2 != 1) {
                  int discarded$1 = 0;
                  bl.a((Throwable) null, (byte) 59, "LR1: " + em.b());
                  r.a(-28036);
                  break L1;
                } else {
                  var4_int = var9.b((byte) -84);
                  var5_ref_se = (se) (Object) le.field_n.b((byte) 113);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_se == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_se.field_j) {
                            break L6;
                          } else {
                            if (var5_ref_se.field_k == var4_int) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_se = (se) (Object) le.field_n.c((byte) -42);
                        continue L4;
                      }
                    }
                    if (var5_ref_se == null) {
                      r.a(-28036);
                      return;
                    } else {
                      var5_ref_se.d(0);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "q.D(" + -24 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 < 45) {
            q.a((byte) 104);
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        da var2 = da.field_p;
        var2.c((byte) 33, 6);
        var2.f(111, 1);
        var2.f(111, 0);
        if (param1 < 41) {
            q.a((byte) 110);
        }
    }

    final static void a(int param0, th param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var5 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (ao.field_c == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ao.field_c.a(25971, 0L);
                        ao.field_c.a(var6, 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
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
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  param1.a(24, 76, var2, 0);
                  if (param0 >= 25) {
                    break L7;
                  } else {
                    field_a = null;
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var2_ref;
                stackOut_17_1 = new StringBuilder().append("q.F(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L8;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L8;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
            }
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
        field_b = new int[]{4, 4, 1};
    }
}
