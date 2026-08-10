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
            var5 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var9 = new byte[24];
                  var7 = var9;
                  var6 = var7;
                  var10 = var6;
                  var8 = var10;
                  var2 = var8;
                  if (null != ge.field_d) {
                    try {
                      L2: {
                        ge.field_d.a(param1 ^ 14, 0L);
                        ge.field_d.a(631, var9);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (-1 == (var10[var3_int] ^ -1)) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if ((var3_int ^ -1) <= -25) {
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
                          if ((var4 ^ -1) <= -25) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L7: {
                  param0.a(var10, 24, 0, 0);
                  if (param1 == -113) {
                    break L7;
                  } else {
                    lc.c((byte) -96);
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var2_ref);

                stackIn_21_1 = new StringBuilder().append("lc.D(");

                if (param0 == null) {
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
              throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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
        jh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        jh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new jh(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, of.field_d);
                c.o(-28210);
                if (!param1) {
                  break L1;
                } else {
                  lc.f(105);
                  break L1;
                }
              }
              stackIn_6_0 = (jh) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("lc.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
