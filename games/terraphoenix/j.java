/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j extends jc {
    private boolean field_M;
    static Random field_H;
    private int field_O;
    private pk field_A;
    private int field_S;
    private String field_L;
    static String field_K;
    static String field_I;
    static String field_P;
    private int field_Q;
    static int field_R;

    final String f(int param0) {
        int var2;
        String var3;
        gl stackIn_2_0 = null;
        gl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var2 = this.field_F.field_s ? 1 : 0;
          this.field_F.field_s = this.field_s;
          var3 = this.field_F.f(85);
          stackIn_2_0 = this.field_F;

          if (var2 == 0) {
            stackIn_3_0 = (gl) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (gl) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_s = stackIn_3_1 != 0;
        if (param0 <= 70) {
          this.field_M = true;
          return var3;
        } else {
          return var3;
        }
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = gj.a(param1, 0, 255, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 115;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("j.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void g(int param0) {
        field_K = null;
        field_H = null;
        field_P = null;
        if (param0 != -5981) {
            field_R = 125;
            field_I = null;
            return;
        }
        field_I = null;
    }

    j(int param0, int param1, int param2, int param3, gl param4, boolean param5, int param6, int param7, pk param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cj) null, (sc) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_A = param8;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((j) (this)).field_M = stackIn_4_1 != 0;
              this.field_L = param10;
              this.field_S = param9;
              this.field_F = param4;
              this.field_Q = param6;
              this.field_O = param7;
              var12_int = -this.field_O + this.field_Q;
              var13 = this.field_A.a(param10, var12_int, this.field_A.field_s) - -(this.field_O * 2);
              if (var13 > param3) {
                this.a(param1, (byte) 49, param2, param0, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_M) {
                stackIn_10_0 = 2 * this.field_O + this.field_Q;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_F.a(this.field_O + (-param3 + var13 >> -403823999), (byte) 61, param2 - this.field_Q - this.field_O * 3, var14, -(this.field_O * 2) + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("j.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_5_0 = 0;
        pk stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        int stackIn_7_6;
        int stackIn_7_7;
        pk stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_15_0 = 0;
        pk stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        pk stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        var5 = this.field_w - -param0;
        if (param1 < -106) {
          var6 = param3 + this.field_u;
          super.a(param0, -113, param2, param3);
          if (param2 != 0) {
            return;
          } else {
            L0: {
              if (!this.field_M) {
                stackIn_15_0 = 0;
                break L0;
              } else {
                stackIn_15_0 = -(this.field_O * 2) + this.field_p + -this.field_Q;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_15_0;
              stackIn_17_0 = this.field_A;

              stackIn_17_1 = this.field_L;

              stackIn_17_2 = this.field_O + var7 + var5;

              stackIn_17_3 = var6 + this.field_O;

              stackIn_17_4 = -this.field_O + this.field_Q;

              stackIn_17_5 = this.field_n - this.field_O * 2;

              stackIn_17_6 = this.field_S;

              stackIn_17_7 = -1;

              if (!this.field_M) {
                stackIn_18_0 = (pk) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 2;
                break L1;
              } else {
                stackIn_18_0 = (pk) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 0;
                break L1;
              }
            }
            ((pk) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, 1, this.field_A.field_s);
            return;
          }
        } else {
          this.field_Q = 38;
          var6 = param3 + this.field_u;
          super.a(param0, -113, param2, param3);
          if (param2 != 0) {
            return;
          } else {
            L2: {
              if (!this.field_M) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = -(this.field_O * 2) + this.field_p + -this.field_Q;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_5_0;
              stackIn_7_0 = this.field_A;

              stackIn_7_1 = this.field_L;

              stackIn_7_2 = this.field_O + var7 + var5;

              stackIn_7_3 = var6 + this.field_O;

              stackIn_7_4 = -this.field_O + this.field_Q;

              stackIn_7_5 = this.field_n - this.field_O * 2;

              stackIn_7_6 = this.field_S;

              stackIn_7_7 = -1;

              if (!this.field_M) {
                stackIn_8_0 = (pk) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 2;
                break L3;
              } else {
                stackIn_8_0 = (pk) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 0;
                break L3;
              }
            }
            ((pk) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6, stackIn_8_7, stackIn_8_8, 1, this.field_A.field_s);
            return;
          }
        }
    }

    static {
        field_K = "Land your troops";
        field_H = new Random();
        field_I = "Equip your soldiers";
        field_P = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
