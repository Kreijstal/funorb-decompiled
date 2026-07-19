/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ce {
    static boolean field_c;
    static String field_a;
    static String field_d;
    static int field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 < 0) {
              L1: {
                if (param4 < param2) {
                  var7 = param4;
                  var5_int = var7;
                  L2: while (true) {
                    if (param2 <= var7) {
                      break L1;
                    } else {
                      vl.field_e[var7][param0] = param3;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var5_int = param2;
                  L3: while (true) {
                    if (param4 <= var5_int) {
                      break L1;
                    } else {
                      vl.field_e[var5_int][param0] = param3;
                      var5_int++;
                      continue L3;
                    }
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
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "ce.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, boolean param1) {
        long dupTemp$3 = 0L;
        int var2 = 0;
        L0: {
          if (null != hb.field_q) {
            break L0;
          } else {
            hb.field_q = kr.field_g.a(-121, cl.field_d, nb.field_y);
            break L0;
          }
        }
        if (hb.field_q.field_b != 0) {
          L1: {
            dupTemp$3 = gk.a(99);
            bm.field_H = dupTemp$3;
            gn.field_b = dupTemp$3;
            var2 = 67 % ((param0 - 60) / 39);
            if (1 != hb.field_q.field_b) {
              break L1;
            } else {
              break L1;
            }
          }
          rg.field_d = gf.field_h;
          hb.field_q = null;
          return true;
        } else {
          return false;
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var3 = dp.a(param2, false, param1);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param2.length()) {
                  if (param0 >= -112) {
                    field_d = (String) null;
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (wb.a(param2.charAt(var4), (byte) 123)) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_7_0 = ud.field_w;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) (var3);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("ce.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (String) ((Object) stackIn_13_0);
          }
        }
    }

    final static void a(boolean param0, uh param1) {
        uh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.c(2);
              if (param0) {
                break L1;
              } else {
                field_b = -90;
                break L1;
              }
            }
            var2 = (uh) ((Object) nr.field_p.a((byte) 100));
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(true, param1)) {
                    break L3;
                  } else {
                    var2 = (uh) ((Object) nr.field_p.b(25));
                    continue L2;
                  }
                }
              }
              L4: {
                if (var2 == null) {
                  nr.field_p.a(param1, false);
                  break L4;
                } else {
                  jn.a(param1, var2, 18724);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2_ref);
            stackOut_11_1 = new StringBuilder().append("ce.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_a = "Enter name of friend to delete from list";
        field_d = "Unable to add friend - system busy";
        field_b = 480;
    }
}
