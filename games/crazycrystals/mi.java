/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ea implements Cloneable {
    static int[] field_A;
    private transient boolean field_w;
    private dl[] field_y;
    transient fq field_C;
    transient fq field_z;
    transient int field_u;
    private boolean field_B;
    int field_E;
    transient int field_t;
    static fp field_D;
    static int field_v;
    static dl[] field_x;

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("mi.PA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((mi) this).field_l.a(param0, param3, (byte) 40, param1);
              var5_int = 67 / ((param2 - -43) / 51);
              if ((((mi) this).field_s | ((mi) this).field_o) != 0) {
                aa.field_a.a(128, 12 * param3 - -(((mi) this).field_m * ((mi) this).field_o), ((mi) this).field_m * ((mi) this).field_s + 12 * param1, 0, (byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = super.b(param0, param1, (byte) -110, param3);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("mi.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static db c(int param0, int param1) {
        if (param1 > -94) {
            return null;
        }
        return qk.a(param0, -114, false, true, false, 1);
    }

    public static void h(int param0) {
        field_A = null;
        if (param0 != -20188) {
            return;
        }
        field_x = null;
        field_D = null;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                f discarded$2 = ((mi) this).e(115, 40, (f[][]) null, -25);
                break L1;
              }
            }
            stackOut_2_0 = ng.a(ec.field_n, param1, (f) (Object) new mi((f) (Object) new kp(-1), true), (byte) -83, ch.field_c);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mi.V(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static dl[] b(int param0, int param1) {
        int var3 = -18 % ((param0 - -26) / 60);
        dl[] var4 = new dl[9];
        dl[] var2 = var4;
        var4[4] = mc.a(64, -64, param1);
        return var2;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((mi) this).field_t = param2;
              ((mi) this).field_u = param3;
              if (param0 == -35) {
                break L1;
              } else {
                ((mi) this).field_w = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mi.KC(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        f stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        f stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5 = ((mi) this).field_l;
              if (param3 > 120) {
                break L1;
              } else {
                f discarded$2 = ((mi) this).b((f[][]) null, -56, (byte) -57, -94);
                break L1;
              }
            }
            L2: while (true) {
              if (!(var5 instanceof ma)) {
                if (var5 instanceof pn) {
                  var5 = ((pn) (Object) var5).field_l;
                  continue L2;
                } else {
                  ((mi) this).field_l = ((mi) this).field_l.a(param0, (byte) -110, param1);
                  stackOut_9_0 = this;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = ((mi) this).a(param2, param0, (f) this, 11460, param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("mi.OA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return (f) this;
    }

    final static int e(byte param0) {
        if (param0 != 125) {
            mi.h(-58);
            return jf.field_a;
        }
        return jf.field_a;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              je.field_j = je.field_j + 20;
              we.field_h = we.field_h + 40;
              fp.field_a = fp.field_a + 40;
              b.field_a = b.field_a + 20;
              ((mi) this).field_t = param6;
              if (param4 == 17512) {
                break L1;
              } else {
                int discarded$2 = mi.e((byte) -65);
                break L1;
              }
            }
            mb.field_g = mb.field_g - 10;
            fn.field_j = fn.field_j - 10;
            ((mi) this).field_u = param3;
            stackOut_2_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("mi.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            return -65;
        }
        return 3;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        ma stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var5 = this;
              if (param1 <= -74) {
                break L1;
              } else {
                f discarded$2 = ((mi) this).e(18, 7, (f[][]) null, -101);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                if (((mi) this).field_p >= 2 * ((mi) this).field_m) {
                  var5 = (Object) (Object) ((mi) this).a(param0.field_c, param0.field_b, (f) (Object) param0.field_a, -119, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = new ma(param0.b((byte) 84), (f) var5, param0);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_8_0 = var5;
            stackOut_8_1 = new StringBuilder().append("mi.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return (f) (Object) stackIn_7_0;
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        f stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((mi) this).field_p > ((mi) this).field_m * 2) {
              L1: {
                if (param4) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              stackOut_5_0 = this;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = ((mi) this).a(-((mi) this).field_s + param2, param3 + -((mi) this).field_o, param1, -124, param0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("mi.GB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (f) this;
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        sl stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              aa.field_a.a(128, param4 * 12, param1 * 12, 0, (byte) -111);
              if (0 >= param3) {
                if (param3 < 0) {
                  ((mi) this).field_y = al.field_h;
                  break L1;
                } else {
                  if (0 < param5) {
                    ((mi) this).field_y = ag.field_c;
                    break L1;
                  } else {
                    ((mi) this).field_y = sa.field_qb;
                    break L1;
                  }
                }
              } else {
                ((mi) this).field_y = cp.field_d;
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                ((mi) this).field_C = null;
                break L2;
              }
            }
            stackOut_10_0 = super.a(param0, param1, false, param3, param4, param5);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7;
            stackOut_12_1 = new StringBuilder().append("mi.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_11_0;
    }

    mi(f param0) {
        this(param0, false);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        dl var7 = null;
        int var8 = 0;
        Object var9 = null;
        dl stackIn_6_0 = null;
        dl stackIn_20_0 = null;
        dl stackIn_31_0 = null;
        dl stackIn_40_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_60_0 = null;
        dl stackIn_69_0 = null;
        dl stackIn_77_0 = null;
        dl stackOut_47_0 = null;
        dl stackOut_46_0 = null;
        dl stackOut_39_0 = null;
        dl stackOut_38_0 = null;
        dl stackOut_30_0 = null;
        dl stackOut_29_0 = null;
        dl stackOut_76_0 = null;
        dl stackOut_75_0 = null;
        dl stackOut_68_0 = null;
        dl stackOut_67_0 = null;
        dl stackOut_59_0 = null;
        dl stackOut_58_0 = null;
        dl stackOut_19_0 = null;
        dl stackOut_18_0 = null;
        dl stackOut_5_0 = null;
        dl stackOut_4_0 = null;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (param5 == 4261) {
            break L0;
          } else {
            var9 = null;
            f discarded$1 = ((mi) this).a((f[][]) null, (f) null, -83, 121, true);
            break L0;
          }
        }
        if (0 == ((mi) this).field_m) {
          if (24 != param2) {
            if (((mi) this).field_z == null) {
              if (null != ((mi) this).field_C) {
                L1: {
                  vj.field_a[19][((mi) this).field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[((mi) this).field_C.field_u]);
                  if (((mi) this).field_B) {
                    stackOut_47_0 = pa.field_H;
                    stackIn_48_0 = stackOut_47_0;
                    break L1;
                  } else {
                    stackOut_46_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                    stackIn_48_0 = stackOut_46_0;
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_48_0;
                  if (param2 != 24) {
                    break L2;
                  } else {
                    if (24 != param3) {
                      break L2;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              } else {
                L3: {
                  if (((mi) this).field_B) {
                    stackOut_39_0 = pa.field_H;
                    stackIn_40_0 = stackOut_39_0;
                    break L3;
                  } else {
                    stackOut_38_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                    stackIn_40_0 = stackOut_38_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_40_0;
                  if (param2 != 24) {
                    break L4;
                  } else {
                    if (24 != param3) {
                      break L4;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              }
            } else {
              L5: {
                vj.field_a[18][((mi) this).field_z.field_B >> uc.field_c[16]].b(param1, param4 + -param3, param2, param3 * 3, ek.field_f[((mi) this).field_z.field_u]);
                if (null == ((mi) this).field_C) {
                  break L5;
                } else {
                  vj.field_a[19][((mi) this).field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[((mi) this).field_C.field_u]);
                  break L5;
                }
              }
              L6: {
                if (((mi) this).field_B) {
                  stackOut_30_0 = pa.field_H;
                  stackIn_31_0 = stackOut_30_0;
                  break L6;
                } else {
                  stackOut_29_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                  stackIn_31_0 = stackOut_29_0;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var7 = stackIn_31_0;
                  if (param2 != 24) {
                    break L8;
                  } else {
                    if (24 != param3) {
                      break L8;
                    } else {
                      var7.a(param1, -param3 + param4);
                      break L7;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                break L7;
              }
              return;
            }
          } else {
            if (param3 == 24) {
              if (null == ((mi) this).field_z) {
                if (null != ((mi) this).field_C) {
                  L9: {
                    vj.field_a[19][((mi) this).field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[((mi) this).field_C.field_u]);
                    if (((mi) this).field_B) {
                      stackOut_76_0 = pa.field_H;
                      stackIn_77_0 = stackOut_76_0;
                      break L9;
                    } else {
                      stackOut_75_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                      stackIn_77_0 = stackOut_75_0;
                      break L9;
                    }
                  }
                  L10: {
                    var7 = stackIn_77_0;
                    if (param2 != 24) {
                      break L10;
                    } else {
                      if (24 != param3) {
                        break L10;
                      } else {
                        var7.a(param1, -param3 + param4);
                        return;
                      }
                    }
                  }
                  var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                  return;
                } else {
                  L11: {
                    if (((mi) this).field_B) {
                      stackOut_68_0 = pa.field_H;
                      stackIn_69_0 = stackOut_68_0;
                      break L11;
                    } else {
                      stackOut_67_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                      stackIn_69_0 = stackOut_67_0;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = stackIn_69_0;
                    if (param2 != 24) {
                      break L12;
                    } else {
                      if (24 != param3) {
                        break L12;
                      } else {
                        var7.a(param1, -param3 + param4);
                        return;
                      }
                    }
                  }
                  var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                  return;
                }
              } else {
                L13: {
                  vj.field_a[18][((mi) this).field_z.field_B >> uc.field_c[16]].c(param1, -param3 + param4, ek.field_f[((mi) this).field_z.field_u]);
                  if (null != ((mi) this).field_C) {
                    vj.field_a[19][((mi) this).field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[((mi) this).field_C.field_u]);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((mi) this).field_B) {
                    stackOut_59_0 = pa.field_H;
                    stackIn_60_0 = stackOut_59_0;
                    break L14;
                  } else {
                    stackOut_58_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                    stackIn_60_0 = stackOut_58_0;
                    break L14;
                  }
                }
                L15: {
                  var7 = stackIn_60_0;
                  if (param2 != 24) {
                    break L15;
                  } else {
                    if (24 != param3) {
                      break L15;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              }
            } else {
              L16: {
                if (((mi) this).field_z == null) {
                  break L16;
                } else {
                  vj.field_a[18][((mi) this).field_z.field_B >> uc.field_c[16]].b(param1, param4 + -param3, param2, param3 * 3, ek.field_f[((mi) this).field_z.field_u]);
                  break L16;
                }
              }
              L17: {
                if (null == ((mi) this).field_C) {
                  break L17;
                } else {
                  vj.field_a[19][((mi) this).field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[((mi) this).field_C.field_u]);
                  break L17;
                }
              }
              L18: {
                if (((mi) this).field_B) {
                  stackOut_19_0 = pa.field_H;
                  stackIn_20_0 = stackOut_19_0;
                  break L18;
                } else {
                  stackOut_18_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
                  stackIn_20_0 = stackOut_18_0;
                  break L18;
                }
              }
              L19: {
                L20: {
                  var7 = stackIn_20_0;
                  if (param2 != 24) {
                    break L20;
                  } else {
                    if (24 != param3) {
                      break L20;
                    } else {
                      var7.a(param1, -param3 + param4);
                      break L19;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                break L19;
              }
              return;
            }
          }
        } else {
          L21: {
            if (((mi) this).field_B) {
              stackOut_5_0 = pa.field_H;
              stackIn_6_0 = stackOut_5_0;
              break L21;
            } else {
              stackOut_4_0 = ((mi) this).field_y[(((mi) this).field_E + ((mi) this).field_m) % 12];
              stackIn_6_0 = stackOut_4_0;
              break L21;
            }
          }
          L22: {
            L23: {
              var7 = stackIn_6_0;
              if (param2 != 24) {
                break L23;
              } else {
                if (24 != param3) {
                  break L23;
                } else {
                  var7.a(param1, -param3 + param4);
                  break L22;
                }
              }
            }
            var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
            break L22;
          }
          return;
        }
    }

    final static void i(int param0) {
        double var1 = 0.0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        var1 = td.field_c[0] / td.field_c[2] - cn.field_d[0] / cn.field_d[2];
        var3 = -(cn.field_d[1] / cn.field_d[2]) + td.field_c[1] / td.field_c[2];
        var5 = Math.log(td.field_c[2] / cn.field_d[2]) * 24.0;
        if (param0 != 22075) {
          field_A = null;
          var7 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
          ia.field_g = (int)(Math.sqrt(var7) * 12.0);
          return;
        } else {
          var7 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
          ia.field_g = (int)(Math.sqrt(var7) * 12.0);
          return;
        }
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        if (!param0) {
            mi.i(-117);
            pm.field_d = pm.field_d + 1;
            return;
        }
        pm.field_d = pm.field_d + 1;
    }

    mi(f param0, boolean param1) {
        super(param0);
        ((mi) this).field_w = false;
        ((mi) this).field_y = al.field_h;
        ((mi) this).field_B = false;
        ((mi) this).field_z = null;
        ((mi) this).field_C = null;
        try {
            ((mi) this).field_B = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7_int = 0;
        ji var7 = null;
        int var8 = 0;
        sl var9 = null;
        f stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        f stackIn_23_0 = null;
        ji stackIn_27_0 = null;
        ji stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji stackOut_28_0 = null;
        ji stackOut_26_0 = null;
        f stackOut_22_0 = null;
        Object stackOut_18_0 = null;
        f stackOut_15_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (null != ab.field_D) {
                break L1;
              } else {
                pm.field_d = pm.field_d - 1;
                if (param2 == null) {
                  break L1;
                } else {
                  var6_int = param2.a(false);
                  var7_int = 0;
                  L2: while (true) {
                    if (var7_int >= 3) {
                      ol.field_B = ol.field_B | 8;
                      break L1;
                    } else {
                      L3: {
                        if ((var6_int & 1 << var7_int) != 0) {
                          L4: {
                            q.field_a[var7_int].field_d = q.field_a[var7_int].field_d + 1;
                            fp.field_a = fp.field_a + 5;
                            b.field_a = b.field_a + 2;
                            je.field_j = je.field_j + 2;
                            we.field_h = we.field_h + 5;
                            we.field_h = we.field_h + 4;
                            fp.field_a = fp.field_a + 4;
                            je.field_j = je.field_j + 2;
                            b.field_a = b.field_a + 2;
                            mb.field_g = mb.field_g + 400;
                            fn.field_j = fn.field_j + 500;
                            fn.field_j = fn.field_j + 20;
                            mb.field_g = mb.field_g + 20;
                            if (pm.field_d != 0) {
                              break L4;
                            } else {
                              ol.field_B = ol.field_B | 1 << var7_int;
                              break L4;
                            }
                          }
                          wd.field_j = wd.field_j + 1;
                          fn.field_j = fn.field_j - ob.field_l;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            L5: {
              if (param2 instanceof qf) {
                break L5;
              } else {
                if (param2 instanceof ig) {
                  break L5;
                } else {
                  if (param3 == 11460) {
                    bn.field_h.a(192, ((mi) this).field_o * ((mi) this).field_m + 12 * param4, 12 * param1 - -(((mi) this).field_s * ((mi) this).field_m), 0, (byte) -111);
                    if ((((mi) this).field_s | ((mi) this).field_o) == 0) {
                      stackOut_28_0 = new ji(((mi) this).field_l, 0, 0);
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      var9 = ((mi) this).d(param1, param4, param0, 85);
                      if (((mi) this).field_s <= 0) {
                        L6: {
                          ob.field_l = ob.field_l + 1;
                          mb.field_g = mb.field_g + wd.field_j;
                          var7 = new ji(((mi) this).field_l, ((mi) this).field_m * ((mi) this).field_o, ((mi) this).field_s * ((mi) this).field_m);
                          if (((mi) this).field_s != 0) {
                            break L6;
                          } else {
                            var9.field_l = (f) (Object) new tn(var9.field_l, var7, ((mi) this).field_o, 0);
                            break L6;
                          }
                        }
                        stackOut_26_0 = (ji) var7;
                        stackIn_27_0 = stackOut_26_0;
                        return (f) (Object) stackIn_27_0;
                      } else {
                        var9.field_l = (f) (Object) new ji(var9.field_l, 0, -12 + ((mi) this).field_m * ((mi) this).field_s);
                        stackOut_22_0 = ((mi) this).field_l;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                    }
                  } else {
                    stackOut_18_0 = null;
                    stackIn_19_0 = stackOut_18_0;
                    return (f) (Object) stackIn_19_0;
                  }
                }
              }
            }
            wp.field_b.a(256, ((mi) this).field_o * ((mi) this).field_m + 12 * param4, ((mi) this).field_m * ((mi) this).field_s + param1 * 12, 0, (byte) -111);
            stackOut_15_0 = ((mi) this).field_l;
            stackIn_16_0 = stackOut_15_0;
            return stackIn_16_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("mi.VA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          L8: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param3 + ',' + param4 + ')');
        }
        return (f) (Object) stackIn_29_0;
    }

    final void c(int param0, int param1, int param2) {
        ((mi) this).field_u = param2;
        if (param1 != -5) {
            return;
        }
        ((mi) this).field_t = param0;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f var5_ref = null;
        pf var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((mi) this).f(126, -128, (f[][]) null, 20);
                break L1;
              }
            }
            var5_ref = ((mi) this).field_l;
            L2: while (true) {
              L3: {
                if (!(var5_ref instanceof pf)) {
                  if (var5_ref instanceof pn) {
                    var5_ref = ((pn) (Object) var5_ref).field_l;
                    continue L2;
                  } else {
                    break L3;
                  }
                } else {
                  var6 = (pf) (Object) var5_ref;
                  if (var6.field_r) {
                    mb.field_g = mb.field_g - wd.field_j;
                    ob.field_l = ob.field_l - 1;
                    var7 = var6.field_u;
                    var8 = var6.field_v;
                    if (0 != (var8 | var7)) {
                      if (!param2[var8 + param1][var7 + param3].a(16736352, param2, false, var8, param1, param3, (ea) this, var7)) {
                        break L3;
                      } else {
                        L4: {
                          ((mi) this).a(1 << var6.field_w, true, var6.field_p);
                          if (!((mi) this).field_w) {
                            ((mi) this).field_l.a(1 << var6.field_w, true, var6.field_p);
                            ((mi) this).field_w = true;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        sl discarded$1 = ((mi) this).a(param2, param1, false, var8, param3, var7);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("mi.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        Object stackIn_3_0 = null;
        f stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        f stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param6 instanceof fq) {
              stackOut_2_0 = this;
              stackIn_3_0 = stackOut_2_0;
              return (f) this;
            } else {
              L1: {
                if (param3 == -31135) {
                  break L1;
                } else {
                  ((mi) this).f(78, -21, (f[][]) null, 71);
                  break L1;
                }
              }
              b.field_a = b.field_a + 1;
              fp.field_a = fp.field_a + 2;
              je.field_j = je.field_j + 1;
              we.field_h = we.field_h + 2;
              stackOut_6_0 = ((mi) this).a(param4, param1, (f) (Object) param6, 13, param2);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("mi.P(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new fp();
        field_v = 20;
    }
}
