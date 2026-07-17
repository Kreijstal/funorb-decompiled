/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends ma {
    static String field_M;
    private vj field_Q;
    static String field_O;
    static af field_P;
    static pl field_N;

    final bl g(byte param0) {
        rd var2 = null;
        bl var3 = null;
        int var4 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          var2 = new rd(((ka) this).field_Q);
          var3 = (bl) (Object) var2.a((byte) 71);
          if (param0 <= -73) {
            break L0;
          } else {
            ka.h((byte) 44);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_S) {
              return var3;
            } else {
              var3 = (bl) (Object) var2.a(-93);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void c(boolean param0) {
        int var4 = client.field_A ? 1 : 0;
        if (!param0) {
            field_O = null;
        }
        rd var2 = new rd(((ka) this).field_Q);
        bl var3 = (bl) (Object) var2.a((byte) 71);
        while (var3 != null) {
            var3.field_S = false;
            var3 = (bl) (Object) var2.a(-48);
        }
        ((ka) this).field_L = null;
    }

    final static int a(byte param0, int param1, Random param2) {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
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
            if (param1 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!pe.a(922790152, param1)) {
                L1: {
                  if (param0 >= 42) {
                    break L1;
                  } else {
                    field_N = null;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int > var4) {
                    stackOut_11_0 = oi.a(param1, 105, var4);
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              } else {
                stackOut_4_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ka.S(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    public ka() {
        super(0, 0, cf.field_f, vd.field_n, (gl) null, (kg) null);
        ((ka) this).field_Q = new vj();
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        boolean stackIn_17_8 = false;
        int stackIn_17_9 = 0;
        int stackIn_17_10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        boolean stackIn_18_8 = false;
        int stackIn_18_9 = 0;
        int stackIn_18_10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        boolean stackIn_19_8 = false;
        int stackIn_19_9 = 0;
        int stackIn_19_10 = 0;
        int stackIn_19_11 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        boolean stackOut_16_8 = false;
        int stackOut_16_9 = 0;
        int stackOut_16_10 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        boolean stackOut_18_8 = false;
        int stackOut_18_9 = 0;
        int stackOut_18_10 = 0;
        int stackOut_18_11 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        boolean stackOut_17_8 = false;
        int stackOut_17_9 = 0;
        int stackOut_17_10 = 0;
        int stackOut_17_11 = 0;
        sb.c((byte) 123);
        if (hh.field_a == tc.field_Tb) {
          gn.b(-29550);
          return;
        } else {
          L0: {
            if (cd.field_m != null) {
              if (km.b(cd.field_m.field_rc, -8222)) {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_7_0;
            if (hh.field_a == null) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          L2: {
            L3: {
              var3 = stackIn_10_0;
              stackOut_10_0 = 0;
              stackOut_10_1 = 1;
              stackOut_10_2 = 14;
              stackOut_10_3 = 11;
              stackOut_10_4 = 13;
              stackOut_10_5 = jk.field_c;
              stackIn_14_0 = stackOut_10_0;
              stackIn_14_1 = stackOut_10_1;
              stackIn_14_2 = stackOut_10_2;
              stackIn_14_3 = stackOut_10_3;
              stackIn_14_4 = stackOut_10_4;
              stackIn_14_5 = stackOut_10_5;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              stackIn_11_4 = stackOut_10_4;
              stackIn_11_5 = stackOut_10_5;
              if (fm.field_b) {
                break L3;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = stackIn_11_4;
                stackOut_11_5 = stackIn_11_5;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_14_2 = stackOut_11_2;
                stackIn_14_3 = stackOut_11_3;
                stackIn_14_4 = stackOut_11_4;
                stackIn_14_5 = stackOut_11_5;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                stackIn_12_5 = stackOut_11_5;
                if (fa.field_n) {
                  break L3;
                } else {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = stackIn_12_4;
                  stackOut_12_5 = stackIn_12_5;
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  stackIn_15_3 = stackOut_12_3;
                  stackIn_15_4 = stackOut_12_4;
                  stackIn_15_5 = stackOut_12_5;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  stackIn_13_4 = stackOut_12_4;
                  stackIn_13_5 = stackOut_12_5;
                  if (var3 == 0) {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = stackIn_15_4;
                    stackOut_15_5 = stackIn_15_5;
                    stackOut_15_6 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    stackIn_16_5 = stackOut_15_5;
                    stackIn_16_6 = stackOut_15_6;
                    break L2;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = stackIn_13_2;
                    stackOut_13_3 = stackIn_13_3;
                    stackOut_13_4 = stackIn_13_4;
                    stackOut_13_5 = stackIn_13_5;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    stackIn_14_5 = stackOut_13_5;
                    break L3;
                  }
                }
              }
            }
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = stackIn_14_2;
            stackOut_14_3 = stackIn_14_3;
            stackOut_14_4 = stackIn_14_4;
            stackOut_14_5 = stackIn_14_5;
            stackOut_14_6 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            stackIn_16_4 = stackOut_14_4;
            stackIn_16_5 = stackOut_14_5;
            stackIn_16_6 = stackOut_14_6;
            break L2;
          }
          L4: {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = stackIn_16_1;
            stackOut_16_2 = stackIn_16_2;
            stackOut_16_3 = stackIn_16_3;
            stackOut_16_4 = stackIn_16_4;
            stackOut_16_5 = stackIn_16_5;
            stackOut_16_6 = stackIn_16_6;
            stackOut_16_7 = 15;
            stackOut_16_8 = param0;
            stackOut_16_9 = 1;
            stackOut_16_10 = var2;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_18_2 = stackOut_16_2;
            stackIn_18_3 = stackOut_16_3;
            stackIn_18_4 = stackOut_16_4;
            stackIn_18_5 = stackOut_16_5;
            stackIn_18_6 = stackOut_16_6;
            stackIn_18_7 = stackOut_16_7;
            stackIn_18_8 = stackOut_16_8;
            stackIn_18_9 = stackOut_16_9;
            stackIn_18_10 = stackOut_16_10;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            stackIn_17_2 = stackOut_16_2;
            stackIn_17_3 = stackOut_16_3;
            stackIn_17_4 = stackOut_16_4;
            stackIn_17_5 = stackOut_16_5;
            stackIn_17_6 = stackOut_16_6;
            stackIn_17_7 = stackOut_16_7;
            stackIn_17_8 = stackOut_16_8;
            stackIn_17_9 = stackOut_16_9;
            stackIn_17_10 = stackOut_16_10;
            if (50 >= pm.field_g) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = stackIn_18_2;
              stackOut_18_3 = stackIn_18_3;
              stackOut_18_4 = stackIn_18_4;
              stackOut_18_5 = stackIn_18_5;
              stackOut_18_6 = stackIn_18_6;
              stackOut_18_7 = stackIn_18_7;
              stackOut_18_8 = stackIn_18_8;
              stackOut_18_9 = stackIn_18_9;
              stackOut_18_10 = stackIn_18_10;
              stackOut_18_11 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              stackIn_19_3 = stackOut_18_3;
              stackIn_19_4 = stackOut_18_4;
              stackIn_19_5 = stackOut_18_5;
              stackIn_19_6 = stackOut_18_6;
              stackIn_19_7 = stackOut_18_7;
              stackIn_19_8 = stackOut_18_8;
              stackIn_19_9 = stackOut_18_9;
              stackIn_19_10 = stackOut_18_10;
              stackIn_19_11 = stackOut_18_11;
              break L4;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = stackIn_17_1;
              stackOut_17_2 = stackIn_17_2;
              stackOut_17_3 = stackIn_17_3;
              stackOut_17_4 = stackIn_17_4;
              stackOut_17_5 = stackIn_17_5;
              stackOut_17_6 = stackIn_17_6;
              stackOut_17_7 = stackIn_17_7;
              stackOut_17_8 = stackIn_17_8;
              stackOut_17_9 = stackIn_17_9;
              stackOut_17_10 = stackIn_17_10;
              stackOut_17_11 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              stackIn_19_3 = stackOut_17_3;
              stackIn_19_4 = stackOut_17_4;
              stackIn_19_5 = stackOut_17_5;
              stackIn_19_6 = stackOut_17_6;
              stackIn_19_7 = stackOut_17_7;
              stackIn_19_8 = stackOut_17_8;
              stackIn_19_9 = stackOut_17_9;
              stackIn_19_10 = stackOut_17_10;
              stackIn_19_11 = stackOut_17_11;
              break L4;
            }
          }
          lk.a(stackIn_19_0, stackIn_19_1 != 0, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_19_6 != 0, stackIn_19_7, stackIn_19_8, stackIn_19_9 != 0, stackIn_19_10 != 0, stackIn_19_11 != 0);
          return;
        }
    }

    final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
            field_O = null;
        }
        rd var2 = new rd(((ka) this).field_Q);
        bl var3 = (bl) (Object) var2.a((byte) 71);
        while (var3 != null) {
            if (!(!var3.h((byte) 39))) {
                var3.b((byte) 124);
            }
            var3 = (bl) (Object) var2.a(param0 + -70);
        }
        ((ka) this).field_L = (ce) (Object) ((ka) this).g((byte) -87);
    }

    public static void h(byte param0) {
        field_N = null;
        field_O = null;
        field_M = null;
        field_P = null;
        int var1 = 99 % ((-85 - param0) / 40);
    }

    final ce a(int param0) {
        rd var2 = null;
        bl var3 = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(((ka) this).field_Q);
        if (param0 == 14) {
          var3 = (bl) (Object) var2.a((byte) 71);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_S) {
                var3 = (bl) (Object) var2.a(-93);
                continue L0;
              } else {
                return var3.e((byte) -74);
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void f(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != -66) {
            field_P = null;
        }
        rd var2 = new rd(((ka) this).field_Q);
        bl var3 = (bl) (Object) var2.a((byte) 71);
        while (var3 != null) {
            if (var3.f((byte) 110)) {
                var3.b((byte) 120);
            }
            var3 = (bl) (Object) var2.a(param0 ^ 8);
        }
    }

    final void a(byte param0, ce param1) {
        bl var3 = null;
        try {
            if (!(param1 instanceof bl)) {
                throw new IllegalArgumentException();
            }
            if (param0 > -104) {
                Object var4 = null;
                ((ka) this).a((byte) -72, (ce) null);
            }
            var3 = (bl) (Object) param1;
            ((ka) this).field_Q.b((bh) (Object) var3, 7143);
            var3.field_S = true;
            boolean discarded$0 = var3.a(false, (ce) this);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ka.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (null != ((ka) this).field_p) {
            ((ka) this).field_p.a(true, param0, param3, (byte) -100, (ce) this);
        }
        rd var5 = new rd(((ka) this).field_Q);
        if (param1 > -103) {
            return;
        }
        ce var6 = (ce) (Object) var5.a(true);
        while (var6 != null) {
            var6.a(param0 + ((ka) this).field_u, -116, param2, ((ka) this).field_D + param3);
            var6 = (ce) (Object) var5.d(2078965185);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "CHALLENGE!";
        field_O = "Members' Benefits";
    }
}
