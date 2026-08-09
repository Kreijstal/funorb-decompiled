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
        if (param0 <= 77) {
            jk.d((byte) 44);
        }
        return !gf.field_a.a((byte) -72) ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = (this.field_c.length >> 848561185) + -1;
        var4 = param0 & var3;
        var5 = 8 / ((48 - param1) / 60);
        L0: while (true) {
          var6 = this.field_c[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          } else {
            if (this.field_c[var4 - -var4] != param0) {
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ub.a((byte) 37, 0, param1, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    jk(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> -1063765151) + param0.length < var2_int) {
                this.field_c = new int[var2_int + var2_int];
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
                          if ((this.field_c[1 + var4 + var4] ^ -1) == 0) {
                            this.field_c[var4 - -var4] = param0[var3];
                            this.field_c[1 + var4 + var4] = var3;
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
                    this.field_c[var3] = -1;
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("jk.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, gi param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  if (param0 >= 120) {
                    break L1;
                  } else {
                    field_a = (gh[]) null;
                    break L1;
                  }
                }
                L2: {
                  var9 = new byte[24];
                  var7 = var9;
                  var6 = var7;
                  var10 = var6;
                  var8 = var10;
                  var2 = var8;
                  if (null != va.field_h) {
                    try {
                      L3: {
                        va.field_h.a(-121, 0L);
                        va.field_h.a(-121, var9);
                        var3_int = 0;
                        L4: while (true) {
                          L5: {
                            if (24 <= var3_int) {
                              break L5;
                            } else {
                              if (-1 == (var10[var3_int] ^ -1)) {
                                var3_int++;
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if ((var3_int ^ -1) > -25) {
                            break L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L7: while (true) {
                          if ((var4 ^ -1) <= -25) {
                            break L6;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                    param1.a(24, (byte) -122, 0, var10);
                    break L2;
                  } else {
                    param1.a(24, (byte) -122, 0, var10);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var2_ref);

                stackIn_21_1 = new StringBuilder().append("jk.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
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
            field_b = (String) null;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -67) {
            jk.c((byte) -9);
        }
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
        ii.a(ub.field_a, 0, lc.field_a, 0, ub.field_a.length);
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
        if (param0 != 6) {
            return;
        }
        fk.field_d.a(gf.field_e, 78, 26, 0, -1);
        fk.field_d.a(ob.field_w, 130, 26, 0, -1);
        sb.field_bb.b((byte) 121);
    }

    static {
        field_f = "achievements to collect";
        field_k = "<%1> was caught in <%0>'s core containment explosion";
        field_b = "Start Game";
        field_j = new int[]{14, 15, 16, 22, 4, -1, 8};
    }
}
