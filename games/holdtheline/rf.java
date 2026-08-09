/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rf extends u implements pi {
    static hj field_ab;
    private rm field_Z;
    static int field_X;
    static String field_bb;
    static String[] field_Y;

    private final rm a(tb param0, String param1, int param2) {
        rm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 25105) {
                break L1;
              } else {
                field_X = -88;
                break L1;
              }
            }
            var4 = new rm(param1, param0);
            var4.field_l = (dh) ((Object) new mo());
            var5 = this.field_u - 6;
            this.field_u = this.field_u + 38;
            var4.a(15, (byte) 122, var5, 30, -16 + (this.field_x + -14));
            this.a(true, var4);
            this.g(113);
            stackIn_3_0 = (rm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("rf.W(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        rm var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -4) {
                break L1;
              } else {
                var7 = (rm) null;
                this.a(1, (rm) null, 85, -26, -88);
                break L1;
              }
            }
            if (param1 != this.field_Z) {
              break L0;
            } else {
              this.h((byte) 49);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("rf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    rf(qj param0, h param1) {
        super(param0, 200, 150);
        Object var3 = null;
        n var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (pk.field_N != param1) {
                if (sk.field_a != param1) {
                  if (si.field_nb != param1) {
                    break L1;
                  } else {
                    var3 = hc.field_c;
                    this.field_u = this.field_u + 30;
                    break L1;
                  }
                } else {
                  var3 = dk.field_m;
                  this.field_u = this.field_u + 10;
                  if (!vg.b(true)) {
                    break L1;
                  } else {
                    var3 = dm.field_c;
                    this.field_u = this.field_u + 20;
                    break L1;
                  }
                }
              } else {
                var3 = ek.field_w;
                break L1;
              }
            }
            var4 = new n((String) (var3), (tb) null);
            var4.field_o = 50;
            var4.field_x = this.field_x;
            var4.field_u = 80;
            var4.field_k = 0;
            var4.field_l = (dh) ((Object) new dk(mo.field_w, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(true, var4);
            this.field_Z = this.a((tb) (this), h.field_f, 25105);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("rf.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void m(int param0) {
        field_bb = null;
        if (param0 >= -25) {
            return;
        }
        field_Y = null;
        field_ab = null;
    }

    private final void h(byte param0) {
        if (param0 < 39) {
            return;
        }
        if (!this.field_F) {
            return;
        }
        this.field_F = false;
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if ((param0 ^ -1) < param2) {
              if (bg.a(param2 ^ -6, param0)) {
                stackIn_6_0 = (int)((long)param0 * (4294967295L & (long)param1.nextInt()) >> 1942349152);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var4 >= var3_int) {
                    continue L1;
                  } else {
                    stackIn_10_0 = oa.a(param0, var4, param2 + -3247);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rf.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_X = 0;
        field_bb = "Login: ";
        field_Y = new String[]{"1st", "2nd", "3rd", "4th"};
    }
}
