/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hob extends ksa {
    int field_j;
    static String field_l;
    static String field_e;
    hob field_f;
    int field_i;
    static int field_d;
    int field_h;
    int field_k;
    int field_g;

    final static tv[] a(ij param0, int param1) {
        int discarded$2 = 0;
        ksa[] var2 = null;
        RuntimeException var2_ref = null;
        tv[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ksa[] var6 = null;
        tv[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var6 = param0.f(-4872);
                var2 = var6;
                var3 = new tv[var6.length];
                if (param1 == 210377952) {
                  break L1;
                } else {
                  discarded$2 = hob.a(-49, (byte) -17);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var6.length <= var4) {
                  stackOut_9_0 = (tv[]) (var3);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var3[var4] = (tv) ((Object) var6[var4]);
                  var4++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2_ref);
            stackOut_11_1 = new StringBuilder().append("hob.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, asb param1) {
        int var3 = 0;
        int var4 = 0;
        phb var2 = new phb(param1.a("", true, "final_frame.jpg"), (java.awt.Component) ((Object) igb.field_a));
        if (param0 <= 23) {
            return;
        }
        try {
            var3 = var2.field_q;
            var4 = var2.field_p;
            vbb.e(3);
            cg.field_o = new phb(var3, 3 * var4 / 4);
            cg.field_o.b();
            var2.c(0, 0);
            reb.field_a = new phb(var3, var4 - cg.field_o.field_p);
            reb.field_a.b();
            var2.c(0, -cg.field_o.field_p);
            reb.field_a.field_l = cg.field_o.field_p;
            bia.a((byte) 124);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hob.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_l = null;
        int var1 = 101 % ((param0 - 66) / 34);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= -121) {
          if ((param0 ^ -1) > -1) {
            if (65535 < (param0 ^ -1)) {
              return -2048 + tfb.field_o[134217728 / -param0];
            } else {
              return -tfb.field_o[-param0 >> -447471291];
            }
          } else {
            if ((param0 ^ -1) >= -65537) {
              return tfb.field_o[param0 >> -529346267];
            } else {
              return 2048 + -tfb.field_o[134217728 / param0];
            }
          }
        } else {
          field_e = (String) null;
          if ((param0 ^ -1) > -1) {
            if (65535 < (param0 ^ -1)) {
              return -2048 + tfb.field_o[134217728 / -param0];
            } else {
              return -tfb.field_o[-param0 >> -447471291];
            }
          } else {
            if ((param0 ^ -1) >= -65537) {
              return tfb.field_o[param0 >> -529346267];
            } else {
              return 2048 + -tfb.field_o[134217728 / param0];
            }
          }
        }
    }

    final static int a(Random param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (0 < param1) {
              if (bd.a(param1, (byte) -95)) {
                stackOut_4_0 = (int)((long)param1 * ((long)param0.nextInt() & 4294967295L) >> 210377952);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param2 >= 115) {
                    break L1;
                  } else {
                    field_d = -117;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var3_int > var4) {
                    stackOut_11_0 = lva.b(var4, param1, -103);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("hob.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    hob(int param0, int param1, int param2, int param3, int param4) {
        this.field_h = param1;
        this.field_k = param2;
        this.field_g = param3;
        this.field_i = param0;
        this.field_j = param4;
    }

    static {
        field_e = "Scale up map width";
    }
}
