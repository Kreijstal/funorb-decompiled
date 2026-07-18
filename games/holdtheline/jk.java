/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk extends hl {
    private int field_n;
    private int field_s;
    int field_i;
    static kg field_p;
    int field_o;
    static String field_r;
    private int field_m;
    int field_q;
    private int field_j;
    int field_t;
    int field_u;
    int field_k;
    static int[] field_l;

    final void a(byte param0) {
        if (param0 >= -4) {
            ((jk) this).field_i = -41;
            ((jk) this).d(0);
            mm.field_e.a((byte) -112, (hl) this);
            return;
        }
        ((jk) this).d(0);
        mm.field_e.a((byte) -112, (hl) this);
    }

    final static void a(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  if (ce.field_n == null) {
                    break L1;
                  } else {
                    ce.field_n.e(1);
                    break L1;
                  }
                }
                L2: {
                  if (null == lk.field_d) {
                    break L2;
                  } else {
                    lk.field_d.a(true);
                    break L2;
                  }
                }
                L3: {
                  if (null != td.field_g) {
                    {
                      L4: {
                        td.field_g.d(-1);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (vb.field_a != null) {
                    var1_int = 0;
                    L7: while (true) {
                      if (vb.field_a.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (null == vb.field_a[var1_int]) {
                            break L8;
                          } else {
                            {
                              L9: {
                                vb.field_a[var1_int].d(-1);
                                break L9;
                              }
                            }
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw kk.a((Throwable) (Object) var1_ref, "jk.C(" + 27370 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        ((jk) this).field_u = ((jk) this).field_u + ((jk) this).field_m;
        ((jk) this).field_t = ((jk) this).field_t + ((jk) this).field_j;
        ((jk) this).field_i = ((jk) this).field_i - 1;
        ((jk) this).field_k = ((jk) this).field_k + ((jk) this).field_n;
        ((jk) this).field_q = ((jk) this).field_q + ((jk) this).field_s;
        if (param0 >= -56) {
            ((jk) this).field_k = 46;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        field_l = null;
    }

    final static void a(gn param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        qk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        da var8 = null;
        int var9 = 0;
        da var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var8 = new da(param0.a("", false, "logo.fo3d"));
            var10 = var8;
            var3 = var10.f((byte) -16);
            var10.e(true);
            kl.field_s = va.a(11658, var10);
            ej.field_c = new qk[var3];
            gd.field_e = new int[var3][];
            var4 = 0;
            var5_int = -32;
            L1: while (true) {
              if (var3 <= var4) {
                var10.l(-71);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = ej.field_c[var9];
                    var5.a(6, 6, 6, 2, 1);
                    var5.c(0);
                    var6 = new int[]{var5.field_F + var5.field_L >> 1, var5.field_H - -var5.field_d >> 1, var5.field_p + var5.field_n >> 1};
                    gd.field_e[var9] = var6;
                    var5.a(-var6[1], -var6[0], -26608, -var6[2]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                ej.field_c[var4] = wg.a(6, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("jk.F(");
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -64 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        ((jk) this).field_k = param2 << 10;
        ((jk) this).field_u = param8 << 10;
        ((jk) this).field_m = param0;
        int var12 = 105 / ((-81 - param5) / 39);
        ((jk) this).field_t = param6 << 10;
        ((jk) this).field_i = param1;
        ((jk) this).field_s = param10;
        ((jk) this).field_o = param7;
        ((jk) this).field_n = param3;
        ((jk) this).field_j = param4;
        ((jk) this).field_q = param9 << 2;
    }

    jk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((jk) this).a(param7, param4, param1, param3, param2, (byte) 79, param0, param5, param6, param8, param9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{4, 4, 2};
    }
}
