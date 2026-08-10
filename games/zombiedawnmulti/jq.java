/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jq {
    static re field_b;
    static ri field_c;
    static int field_a;
    static int field_f;
    static uj field_d;
    static ri field_e;

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        ve var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 21 * param3 / param0;
        field_c.a(param5 - 7, -14 + param1, param4);
        if (null == uf.field_h) {
            uf.field_h = new ja(8, 21);
            g.c(uf.field_h);
            oo.a(0, 0, 8, 10, 65280, 16776960);
            oo.a(0, 10, 8, 11, 16776960, 16711680);
            g.d();
        }
        uf.field_h.c(param5, param1, param4);
        if (param2 != 2) {
            return;
        }
        oo.f(param5, param1, 8, 21 + -var6, 0, param4);
        Random var7 = new Random();
        if (param3 >= param0) {
            if (!(hp.a((byte) 11, var7, 7) != 0)) {
                var8 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var8.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                var9 = 200;
                var10 = var9 * 128;
                var11 = var9 * 64;
                var11 = var11 >> 8;
                var12 = var9 * 255;
                var10 = var10 >> 8;
                var10 = var10 << 16;
                var12 = var12 >> 8;
                var11 = var11 << 8;
                var8.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
            }
        }
    }

    final static void a(k param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var6 = new byte[24];
                var2 = var6;
                if (param1 == 13746) {
                  L1: {
                    L2: {
                      if (null != bg.field_e) {
                        try {
                          L3: {
                            bg.field_e.a(0L, (byte) -70);
                            bg.field_e.a(var6, (byte) -50);
                            var3_int = 0;
                            L4: while (true) {
                              L5: {
                                if (var3_int >= 24) {
                                  break L5;
                                } else {
                                  if (0 != var6[var3_int]) {
                                    break L5;
                                  } else {
                                    var3_int++;
                                    continue L4;
                                  }
                                }
                              }
                              if (var3_int >= 24) {
                                throw new IOException();
                              } else {
                                param0.a(var2, 24, 0, 120);
                                decompiledRegionSelector0 = 0;
                                break L3;
                              }
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L7: while (true) {
                              if (var4 >= 24) {
                                decompiledRegionSelector0 = 1;
                                break L6;
                              } else {
                                var2[var4] = (byte)-1;
                                var4++;
                                continue L7;
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param0.a(var2, 24, 0, 120);
                    break L1;
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref);

                stackIn_22_1 = new StringBuilder().append("jq.D(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L8;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L8;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, byte param1) {
        em.field_U = !param0 ? new qh(l.field_d, ga.field_r) : new qh(mk.field_n, sk.field_i);
        mh.field_i = new cj(0L, (cj) null);
        mh.field_i.a((byte) 50, em.field_U.field_c);
        int var2 = 81 % ((65 - param1) / 60);
        mh.field_i.a((byte) 50, jp.field_b);
        qf.field_b = new cj(0L, wa.field_a);
        vb.field_c = new cj(0L, (cj) null);
        qf.field_b.a((byte) 50, mq.field_l);
        qf.field_b.a((byte) 50, vb.field_c);
        vb.field_c.a((byte) 50, pd.field_b);
        vb.field_c.a((byte) 50, pg.field_a);
        ci.a(param0, -72);
    }

    static {
        field_b = new re();
        field_f = 0;
        field_d = null;
    }
}
