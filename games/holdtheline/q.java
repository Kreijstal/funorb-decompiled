/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class q {
    static qi field_a;
    static uf field_d;
    static int field_c;
    static int[] field_b;

    final static String b(byte param0) {
        if (!(-3 >= (pf.field_d ^ -1))) {
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
        if (!(ah.field_d.b("commonui", param0 ^ 54))) {
            return ge.field_a + " - " + ah.field_d.a("commonui", 0) + "%";
        }
        if (!am.field_d.b((byte) -63)) {
            return uf.field_d;
        }
        if (!am.field_d.b("commonui", 108)) {
            return wl.field_b + " - " + am.field_d.a("commonui", param0 + -118) + "%";
        }
        if (!ca.field_p.b((byte) -102)) {
            return g.field_l;
        }
        if (param0 != 118) {
            field_b = null;
        }
        if (!ca.field_p.a((byte) -63)) {
            return uj.field_b + " - " + ca.field_p.a(param0 + -118) + "%";
        }
        return ng.field_b;
    }

    final static void a(String param0, ql param1, int param2, int param3, byte param4, int param5) {
        param1.a(param0, param3 + 1, 1 + param5, 8, -1, 114);
        if (param4 > -126) {
            Object var7 = null;
            q.a(-69, (th) null);
        }
        param1.b(param0, param3, param5, param2, -1);
    }

    final static void c(byte param0) {
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
        L0: {
          var8 = HoldTheLine.field_D;
          var9 = rd.field_e;
          var2 = var9.f((byte) -62);
          var3 = var9.f((byte) -86);
          if (0 == var2) {
            var4 = (t) (Object) ih.field_j.b((byte) 100);
            if (var4 != null) {
              L1: {
                var5 = -var9.field_l + ad.field_c;
                var13 = var4.field_m;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5 > var13.length << -639570334) {
                  var5 = var13.length << -2076945662;
                  break L1;
                } else {
                  break L1;
                }
              }
              var7 = 0;
              L2: while (true) {
                if (var7 >= var5) {
                  var4.d(0);
                  break L0;
                } else {
                  var6[var7 >> -2028123838] = var6[var7 >> -2028123838] + (var9.f((byte) -110) << pk.a(var7 << -1499567480, 768));
                  var7++;
                  continue L2;
                }
              }
            } else {
              r.a(-28036);
              return;
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              bl.a((Throwable) null, (byte) 59, "LR1: " + em.b(false));
              r.a(-28036);
              break L0;
            } else {
              var4_int = var9.b((byte) -84);
              var5_ref_se = (se) (Object) le.field_n.b((byte) 113);
              L3: while (true) {
                L4: {
                  if (var5_ref_se == null) {
                    break L4;
                  } else {
                    L5: {
                      if (var3 != var5_ref_se.field_j) {
                        break L5;
                      } else {
                        if (var5_ref_se.field_k == var4_int) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5_ref_se = (se) (Object) le.field_n.c((byte) -42);
                    continue L3;
                  }
                }
                if (var5_ref_se == null) {
                  r.a(-28036);
                  return;
                } else {
                  var5_ref_se.d(0);
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          if (param0 == -24) {
            break L6;
          } else {
            field_a = null;
            break L6;
          }
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
        var2.c((byte) 33, param0);
        var2.f(111, 1);
        var2.f(111, 0);
        if (param1 < 41) {
            q.a((byte) 110);
        }
    }

    final static void a(int param0, th param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = HoldTheLine.field_D;
                        var6 = new byte[24];
                        var2 = var6;
                        if (ao.field_c == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ao.field_c.a(25971, 0L);
                            ao.field_c.a(var6, 0);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if ((var4 ^ -1) <= -25) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param1.a(24, 76, var2, 0);
                        if (param0 >= 25) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        field_a = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
