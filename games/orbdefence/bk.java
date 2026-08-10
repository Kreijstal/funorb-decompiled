/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends IOException {
    static hj[] field_d;
    static String field_a;
    static String field_b;
    static int field_e;
    static String field_c;
    static String[] field_f;

    final static void a(int param0, hj[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            dm.field_b = param1;
            if (param0 == 90) {
              L1: {
                if (dm.field_b == null) {
                  break L1;
                } else {
                  if (param1.length < 3) {
                    throw new IllegalArgumentException("");
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("bk.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bk(String param0) {
        super(param0);
    }

    final static fh a(int param0, java.awt.Component param1, int param2, boolean param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            fh var5 = null;
            ij var5_ref = null;
            fh stackIn_3_0 = null;
            ij stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (!param3) {
                        break L2;
                      } else {
                        field_c = (String) null;
                        break L2;
                      }
                    }
                    var4 = Class.forName("ch");
                    var5 = (fh) (var4.newInstance());
                    var5.a(88, param2, param0, param1);
                    stackIn_3_0 = (fh) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ij();
                  ((fh) ((Object) var5_ref)).a(-73, param2, param0, param1);
                  stackIn_5_0 = (ij) (var5_ref);
                  return (fh) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, vg param2) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        se var7 = uk.field_b;
        se var8 = var7;
        var8.i(param1, -41);
        var8.field_i = var8.field_i + 1;
        int var4 = var8.field_i;
        if (!param0) {
            return;
        }
        try {
            var8.a(1, -62);
            var8.b((byte) -60, param2.field_t);
            var8.b((byte) -60, param2.field_g);
            var8.b((byte) -60, param2.field_k);
            var8.b(param2.field_n, -1);
            var8.b(param2.field_m, -1);
            var8.b(param2.field_f, -1);
            var8.b(param2.field_r, -1);
            var8.a(param2.field_o.length, -118);
            for (var5 = 0; var5 < param2.field_o.length; var5++) {
                var7.b(param2.field_o[var5], -1);
            }
            var8.e(-18951, var4);
            var8.c((byte) -15, var8.field_i - var4);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "bk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(int param0, CharSequence param1) {
        long stackIn_26_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (65 > var6) {
                        break L4;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (122 < var6) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + (var6 - 97));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(-21 + var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if ((var2_long ^ -1L) > -177917621779460414L) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if (param0 >= 121) {
                  break L6;
                } else {
                  var8 = (byte[]) null;
                  bk.a((byte[]) null, 109);
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_26_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("bk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 48) {
            field_d = (hj[]) null;
        }
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        vg var3 = null;
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
              if (param1 == -12465) {
                break L1;
              } else {
                var3 = (vg) null;
                bk.a(true, 92, (vg) null);
                break L1;
              }
            }
            stackIn_3_0 = tj.a(param0.length, 0, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("bk.B(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = "AWESOMEO";
        field_a = "Waiting for fonts";
        field_e = 0;
        field_c = "BEST HISCORES";
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
