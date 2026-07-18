/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk {
    static gh[] field_a;
    static String field_e;
    static String field_f;
    static String field_b;
    static String field_k;
    private int[] field_c;
    static int[] field_j;
    static mg field_i;
    static String field_g;
    static gh field_h;
    static int field_d;

    final static boolean c(byte param0) {
        return !gf.field_a.a((byte) -72);
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = (((jk) this).field_c.length >> 1) + -1;
        var4 = param0 & var3;
        var5 = 8 / ((48 - param1) / 60);
        L0: while (true) {
          var6 = ((jk) this).field_c[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          } else {
            if (((jk) this).field_c[var4 - -var4] != param0) {
              var4 = var3 & var4 - -1;
              continue L0;
            } else {
              return var6;
            }
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 13) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_2_0 = ub.a((byte) 37, 0, param1, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    jk(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((jk) this).field_c = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (((jk) this).field_c[1 + var4 + var4] == -1) {
                            ((jk) this).field_c[var4 - -var4] = param0[var3];
                            ((jk) this).field_c[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((jk) this).field_c[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("jk.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, gi param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != va.field_h) {
                    try {
                      L2: {
                        va.field_h.a(-121, 0L);
                        va.field_h.a(-121, var6);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var3_int) {
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
                          if (var3_int < 24) {
                            break L2;
                          } else {
                            throw new IOException();
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
                    param1.a(24, (byte) -122, 0, var2);
                    break L1;
                  } else {
                    param1.a(24, (byte) -122, 0, var2);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("jk.C(").append(125).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        pc.d(param0 + -14);
        vd.a((byte) 63);
        if (param0 != -66) {
            field_b = null;
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_g = null;
        field_e = null;
        field_i = null;
        field_h = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    final static void a(byte param0) {
        wk var3 = new wk(120, 30);
        wk var4 = var3;
        ub.field_a[0] = qe.a(var4, (byte) -93, jf.field_eb);
        ub.field_a[1] = qe.a(var4, (byte) -93, gf.field_e);
        ub.field_a[2] = qe.a(var4, (byte) -93, ob.field_w);
        ub.field_a[3] = qe.a(var4, (byte) -93, fm.field_i);
        ub.field_a[4] = qe.a(var4, (byte) -93, sn.field_o);
        ub.field_a[5] = qe.a(var4, (byte) -93, gm.field_a);
        ub.field_a[9] = qe.a(var4, (byte) -93, fc.field_c);
        ub.field_a[10] = qe.a(var4, (byte) -93, hm.field_e);
        ub.field_a[11] = qe.a(var4, (byte) -93, sn.field_a);
        ub.field_a[12] = qe.a(var4, (byte) -93, jm.field_t);
        ub.field_a[13] = qe.a(var4, (byte) -93, cl.field_g);
        ub.field_a[14] = qe.a(var4, (byte) -93, b.field_p);
        ub.field_a[15] = qe.a(var4, (byte) -93, lk.field_X);
        ub.field_a[16] = qe.a(var4, (byte) -93, pl.field_V);
        lc.field_a = new gk[ub.field_a.length];
        ii.a((Object[]) (Object) ub.field_a, 0, (Object[]) (Object) lc.field_a, 0, ub.field_a.length);
        lc.field_a[5] = ub.field_a[15];
        lc.field_a[4] = ub.field_a[14];
        lc.field_a[3] = ub.field_a[13];
        lc.field_a[8] = ub.field_a[7];
        lc.field_a[7] = ub.field_a[12];
        lc.field_a[15] = null;
        lc.field_a[14] = null;
        lc.field_a[13] = null;
        lc.field_a[12] = ub.field_a[7];
        rh.field_v[6].d();
        fk.field_d.a(gf.field_e, 78, 26, 0, -1);
        fk.field_d.a(ob.field_w, 130, 26, 0, -1);
        sb.field_bb.b((byte) 121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "achievements to collect";
        field_k = "<%1> was caught in <%0>'s core containment explosion";
        field_b = "Start Game";
        field_j = new int[]{14, 15, 16, 22, 4, -1, 8};
    }
}
