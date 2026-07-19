/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class lc extends pa {
    static int field_r;
    static String field_s;
    static String field_q;
    static int[] field_v;
    static dd field_t;
    static int field_u;

    final static void a(ni param0, byte param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            int var9 = 0;
            int var10 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var5 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var8 = new byte[24];
                    var7 = var8;
                    var6 = var7;
                    var2 = var6;
                    if (null != ge.field_d) {
                      try {
                        L3: {
                          ge.field_d.a(param1 ^ 14, 0L);
                          ge.field_d.a(631, var8);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                L7: {
                                  if (var3_int >= 24) {
                                    break L7;
                                  } else {
                                    var10 = var8[var3_int] ^ -1;
                                    var9 = -1;
                                    if (var5 != 0) {
                                      if (var9 <= var10) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      L8: {
                                        if (var9 == var10) {
                                          break L8;
                                        } else {
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                if ((var3_int ^ -1) <= -25) {
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
                        L9: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L10: while (true) {
                            L11: {
                              if ((var4 ^ -1) <= -25) {
                                break L11;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L9;
                                } else {
                                  if (var5 == 0) {
                                    continue L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L9;
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
                  param0.a(var8, 24, 0, 0);
                  break L1;
                }
                if (param1 == -113) {
                  break L0;
                } else {
                  lc.c((byte) -96);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) (var2_ref);
                stackOut_27_1 = new StringBuilder().append("lc.D(");
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param0 == null) {
                  stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L12;
                } else {
                  stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L12;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lc() {
    }

    final static String f(int param0) {
        if (!(wi.field_f != cb.field_v)) {
            return ef.field_j;
        }
        if (param0 != 0) {
            return (String) null;
        }
        return jk.field_j;
    }

    public static void c(byte param0) {
        field_s = null;
        field_q = null;
        if (param0 != 99) {
            return;
        }
        field_t = null;
        field_v = null;
    }

    final static jh a(byte[] param0, boolean param1) {
        String discarded$2 = null;
        jh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        jh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new jh(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, of.field_d);
                c.o(-28210);
                if (!param1) {
                  break L1;
                } else {
                  discarded$2 = lc.f(105);
                  break L1;
                }
              }
              stackOut_5_0 = (jh) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("lc.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jh) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_q = "Account created successfully!";
        field_s = "Suggested names: ";
        field_v = new int[5];
    }
}
