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
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Random var13 = null;
        ve var14 = null;
        Random var15 = null;
        ve var16 = null;
        var6 = 21 * param3 / param0;
        field_c.a(param5 - 7, -14 + param1, param4);
        if (null != uf.field_h) {
          uf.field_h.c(param5, param1, param4);
          if (param2 == 2) {
            oo.f(param5, param1, 8, 21 + -var6, 0, param4);
            var15 = new Random();
            if (param3 >= param0) {
              if (hp.a((byte) 11, var15, 7) != 0) {
                return;
              } else {
                var16 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var16.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                var9 = 200;
                var10 = var9 * 128;
                var11 = var9 * 64;
                var11 = var11 >> 8;
                var12 = var9 * 255;
                var10 = var10 >> 8;
                var10 = var10 << 16;
                var12 = var12 >> 8;
                var11 = var11 << 8;
                var16.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          uf.field_h = new ja(8, 21);
          g.c(uf.field_h);
          oo.a(0, 0, 8, 10, 65280, 16776960);
          oo.a(0, 10, 8, 11, 16776960, 16711680);
          g.d();
          uf.field_h.c(param5, param1, param4);
          if (param2 == 2) {
            oo.f(param5, param1, 8, 21 + -var6, 0, param4);
            var13 = new Random();
            if (param3 < param0) {
              return;
            } else {
              L0: {
                if (hp.a((byte) 11, var13, 7) == 0) {
                  var14 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                  var14.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                  var9 = 200;
                  var10 = var9 * 128;
                  var11 = var9 * 64;
                  var11 = var11 >> 8;
                  var12 = var9 * 255;
                  var10 = var10 >> 8;
                  var10 = var10 << 16;
                  var12 = var12 >> 8;
                  var11 = var11 << 8;
                  var14.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(k param0, int param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
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
                                L6: {
                                  L7: {
                                    if (var3_int >= 24) {
                                      break L7;
                                    } else {
                                      var8 = var6[var3_int];
                                      var7 = 0;
                                      if (var5 != 0) {
                                        if (var7 >= var8) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        if (var7 != var8) {
                                          break L7;
                                        } else {
                                          var3_int++;
                                          if (var5 == 0) {
                                            continue L4;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var3_int >= 24) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                decompiledRegionSelector0 = 0;
                                break L3;
                              }
                              throw new IOException();
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L8: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L9: while (true) {
                              if (var4 >= 24) {
                                decompiledRegionSelector0 = 0;
                                break L8;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param0.a(var6, 24, 0, 120);
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
              L10: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) (var2_ref);
                stackOut_25_1 = new StringBuilder().append("jq.D(");
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param0 == null) {
                  stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L10;
                } else {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L10;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
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
