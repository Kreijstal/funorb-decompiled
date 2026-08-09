/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class jg {
    static String field_a;
    static nf field_g;
    static bm[] field_d;
    static Calendar field_c;
    static int[] field_f;
    static bi field_e;
    static double[] field_b;

    abstract void a(byte param0);

    final static ce a(int param0, byte[] param1) {
        ce var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ce stackIn_5_0 = null;
        ce stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 == 2563) {
                var2 = new ce(param1, jl.field_p, ij.field_r, rg.field_I, sd.field_f, rj.field_f);
                ql.a(false);
                stackIn_7_0 = (ce) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ce) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("jg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ce) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(kg param0, int param1) {
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
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var9 = new byte[param1];
                    var7 = var9;
                    var6 = var7;
                    var10 = var6;
                    var8 = var10;
                    var2 = var8;
                    if (bg.field_b == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          bg.field_b.a((byte) 123, 0L);
                          bg.field_b.a(var9, (byte) -4);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (-25 >= (var3_int ^ -1)) {
                                break L5;
                              } else {
                                if ((var10[var3_int] ^ -1) == -1) {
                                  var3_int++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if ((var3_int ^ -1) <= -25) {
                              throw new IOException();
                            } else {
                              param0.a(24, 0, var10, param1 ^ 119);
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
                            if ((var4 ^ -1) <= -25) {
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
                    }
                  }
                  param0.a(24, 0, var10, param1 ^ 119);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("jg.G(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L8;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L8;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract long a(int param0);

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_f = null;
        int var1 = 121 % ((64 - param0) / 39);
        field_c = null;
        field_g = null;
        field_a = null;
    }

    final int b(int param0, long param1) {
        if (param0 != 0) {
            return 102;
        }
        long var4 = this.a(10);
        if (!(-1L <= (var4 ^ -1L))) {
            jd.a(1, var4);
        }
        return this.a(-25, param1);
    }

    final static void b(int param0) {
        tk.field_e = null;
        fj.field_s = null;
        if (param0 != 15229) {
            field_e = (bi) null;
        }
        tf.field_d = null;
        jc.field_d = null;
        in.field_h = false;
    }

    abstract int a(int param0, long param1);

    static {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_f = new int[]{14, -1, 0, 1, -1, 10, 3};
        field_b = new double[]{0.0, -256.0, 0.0};
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
