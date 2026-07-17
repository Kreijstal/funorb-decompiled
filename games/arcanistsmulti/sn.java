/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends df implements ro, vb {
    static byte[][] field_F;
    li field_M;
    static String field_J;
    private ag field_O;
    static int[] field_H;
    static String field_L;
    static ll[] field_E;
    static String field_N;
    private bi field_D;
    static int field_G;
    static int field_K;
    private ag field_I;

    private final int a(String param0, int param1, byte param2, qm param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        sc var9 = null;
        Object var10 = null;
        ke var11 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            L1: {
              if (param2 == -123) {
                break L1;
              } else {
                var10 = null;
                int discarded$2 = this.a((String) null, -25, (byte) -96, (qm) null, (String) null, 57, 33);
                break L1;
              }
            }
            var11 = new ke(20, param5, 120 + param6, 25, param3, false, 120, 3, ia.field_c, 16777215, param0);
            ((sn) this).c(-108, (qm) (Object) var11);
            var9 = new sc(((el) (Object) param3).a(0), param4, 126, param5 + var11.field_k, 25 + param6, param1);
            var9.field_o = (wc) this;
            ((sn) this).c(-113, (qm) (Object) var9);
            stackOut_2_0 = var9.field_k + var11.field_k;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("sn.G(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
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
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, (byte) -121, param2, param3)) {
              if (param3 != 98) {
                if (param3 != 99) {
                  if (param1 < -120) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    var6 = null;
                    boolean discarded$2 = this.a(42, (el) null);
                    return false;
                  }
                } else {
                  stackOut_7_0 = ((sn) this).b(2, param0);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((sn) this).a(param0, 9555);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("sn.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final int a(int param0, String param1, int param2, qm param3, String param4) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            stackOut_0_0 = this.a(param4, 35, (byte) -123, param3, param1, 70, 170);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("sn.L(").append(70).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(170).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -124 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean a() {
        if (!this.a(315, (el) (Object) ((sn) this).field_D)) {
            return false;
        }
        return true;
    }

    public final void a(byte param0) {
        if (param0 != -7) {
            return;
        }
        ((dg) (Object) ((sn) this).field_D.a(0)).e(127);
    }

    public static void g() {
        field_F = null;
        field_H = null;
        field_N = null;
        field_L = null;
        field_E = null;
        field_J = null;
    }

    private final boolean a(int param0, el param1) {
        pd var3 = null;
        RuntimeException var3_ref = null;
        eh var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
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
            var3 = param1.a(0);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var4 = var3.a(param0 + -392);
              if (param0 == 315) {
                L1: {
                  if (var4 != nn.field_s) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("sn.M(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public sn() {
        super(0, 0, 496, 0, (pf) null);
        ((sn) this).field_D = new bi("", (wc) null, 12);
        jm var1 = new jm(vc.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_c.field_C, -1, 2147483647, true);
        qm var2 = new qm(wl.field_H, (pf) (Object) var1, (wc) null);
        ((sn) this).field_O = new ag(im.field_f, (wc) null);
        ((sn) this).field_I = new ag(sa.field_Eb, (wc) null);
        ((sn) this).field_D.field_q = eh.field_b;
        ((sn) this).field_D.a((pd) (Object) new dg((rn) (Object) ((sn) this).field_D), (byte) 69);
        ((sn) this).field_O.field_B = false;
        ((sn) this).field_O.field_r = (pf) (Object) new mm();
        ((sn) this).field_I.field_r = (pf) (Object) new gm();
        ((sn) this).field_D.field_r = (pf) (Object) new ib(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, var3, 270, 20, -85);
        ((sn) this).c(-85, var2);
        var3 += 50;
        int discarded$0 = -124;
        var3 = var3 + (5 + this.a(var3, bj.field_kb, 170, (qm) (Object) ((sn) this).field_D, ch.field_h));
        ((sn) this).field_O.a(40, var3, var5, -var5 + 496 >> 1, -67);
        ((sn) this).field_I.a(40, var3 - -15, 60, 3 + var4, -126);
        ((sn) this).field_I.field_o = (wc) this;
        ((sn) this).field_O.field_o = (wc) this;
        ((sn) this).c(-71, (qm) (Object) ((sn) this).field_O);
        ((sn) this).c(-84, (qm) (Object) ((sn) this).field_I);
        ((sn) this).field_M = new li((ro) this);
        ((sn) this).field_M.a(150, 20, -((sn) this).field_D.field_n + ((sn) this).field_v + -((sn) this).field_D.field_v - 60, ((sn) this).field_D.field_n - -((sn) this).field_D.field_v - -60, -118);
        ((sn) this).c(-84, (qm) (Object) ((sn) this).field_M);
        ((sn) this).a(55 + var3 + var4, 0, 496, 0, -76);
    }

    private final void e() {
        int discarded$0 = 16777215;
        if (!(this.a())) {
            return;
        }
        he.a(1, ((sn) this).field_D.field_g);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param4 != ((sn) this).field_I) {
                if (param4 != ((sn) this).field_O) {
                  break L1;
                } else {
                  int discarded$2 = 1;
                  this.e();
                  break L1;
                }
              } else {
                bl.d((byte) -77);
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                field_F = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("sn.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public final void a(String param0, int param1) {
        bi var3 = null;
        String var4 = null;
        try {
            var3 = ((sn) this).field_D;
            if (param1 != 90) {
                Object var5 = null;
                boolean discarded$0 = this.a(77, (el) null);
            }
            var4 = param0;
            ((rn) (Object) var3).a(false, var4, false);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sn.O(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            if (param2 != 170) {
                Object var6 = null;
                ((sn) this).a(false, -6, 41, -17, (ag) null);
            }
            super.a(param0, param1, param2, param3);
            int discarded$0 = 16777215;
            ((sn) this).field_O.field_B = this.a();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sn.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, ll param1, int param2, int param3, nf param4, boolean param5, int param6, byte param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              return;
            } else {
              if (param2 != 0) {
                L1: {
                  if (param2 >= 0) {
                    break L1;
                  } else {
                    param2 = -param2;
                    break L1;
                  }
                }
                L2: {
                  var9 = 89 / ((param3 - 70) / 48);
                  var8_int = param6 + -param2;
                  if (var8_int >= 0) {
                    break L2;
                  } else {
                    var8_int = 0;
                    break L2;
                  }
                }
                L3: {
                  var10 = 1 + (param6 + param2);
                  if (~(-1 + param4.field_H) <= ~var10) {
                    break L3;
                  } else {
                    var10 = -1 + param4.field_H;
                    break L3;
                  }
                }
                L4: {
                  var11 = var8_int;
                  var12 = param2 * param2;
                  var13 = 0;
                  var14 = -var11 + param6;
                  var15 = var14 * var14;
                  if (~param6 >= ~var10) {
                    break L4;
                  } else {
                    param6 = var10;
                    break L4;
                  }
                }
                var16 = var15 + -var14;
                L5: while (true) {
                  if (var11 >= param6) {
                    var14 = var11 - param6;
                    var13 = param2;
                    var16 = var12 + var14 * var14;
                    var15 = -var13 + var16;
                    var16 = var16 - var14;
                    L6: while (true) {
                      if (~var10 >= ~var11) {
                        break L0;
                      } else {
                        L7: while (true) {
                          L8: {
                            if (var16 <= var12) {
                              break L8;
                            } else {
                              if (var15 <= var12) {
                                break L8;
                              } else {
                                int incrementValue$6 = var13;
                                var13--;
                                var16 = var16 - (incrementValue$6 + var13);
                                var15 = var15 - (var13 - -var13);
                                continue L7;
                              }
                            }
                          }
                          L9: {
                            var17 = -var13 + param0;
                            if (var17 < 0) {
                              var17 = 0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            var18 = var13 + param0;
                            if (var18 > param4.field_y - 1) {
                              var18 = -1 + param4.field_y;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var22 = var11 * param4.field_y + var17;
                          var19 = var22;
                          var20 = var17;
                          L11: while (true) {
                            if (var18 < var20) {
                              var16 = var16 + (var14 + var14);
                              var11++;
                              int incrementValue$7 = var14;
                              var14++;
                              var15 = var15 + (incrementValue$7 + var14);
                              continue L6;
                            } else {
                              L12: {
                                L13: {
                                  if (param5) {
                                    break L13;
                                  } else {
                                    if (param1.field_m[var22] == 0) {
                                      break L13;
                                    } else {
                                      if (param1.field_m[var22] != -5) {
                                        var22++;
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                int incrementValue$8 = var22;
                                var22++;
                                param1.field_m[incrementValue$8] = (byte)param7;
                                break L12;
                              }
                              var20++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L14: while (true) {
                      L15: {
                        if (var12 >= var16) {
                          break L15;
                        } else {
                          if (var12 < var15) {
                            L16: {
                              var17 = 1 + param0 + -var13;
                              if (var17 >= 0) {
                                break L16;
                              } else {
                                var17 = 0;
                                break L16;
                              }
                            }
                            L17: {
                              var18 = var13 + param0;
                              if (~var18 < ~(-1 + param4.field_y)) {
                                var18 = param4.field_y + -1;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            var19 = var11 * param4.field_y + var17;
                            var20 = var17;
                            L18: while (true) {
                              if (~var18 >= ~var20) {
                                var11++;
                                int incrementValue$9 = var14;
                                var14--;
                                var15 = var15 - (incrementValue$9 + var14);
                                var16 = var16 - (var14 + var14);
                                continue L5;
                              } else {
                                L19: {
                                  L20: {
                                    if (param5) {
                                      break L20;
                                    } else {
                                      if (param1.field_m[var19] == 0) {
                                        break L20;
                                      } else {
                                        if (param1.field_m[var19] != -5) {
                                          var19++;
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  int incrementValue$10 = var19;
                                  var19++;
                                  param1.field_m[incrementValue$10] = (byte)param7;
                                  break L19;
                                }
                                var20++;
                                continue L18;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      var15 = var15 + (var13 + var13);
                      int incrementValue$11 = var13;
                      var13++;
                      var16 = var16 + (incrementValue$11 - -var13);
                      continue L14;
                    }
                  }
                }
              } else {
                L21: {
                  if (param0 < 0) {
                    break L21;
                  } else {
                    if (param6 < 0) {
                      break L21;
                    } else {
                      if (param0 >= param4.field_y) {
                        break L21;
                      } else {
                        if (param6 < param4.field_H) {
                          L22: {
                            var8_int = param0 - -(param6 * param4.field_y);
                            if (param5) {
                              break L22;
                            } else {
                              if (param1.field_m[var8_int] == 0) {
                                break L22;
                              } else {
                                if (param1.field_m[var8_int] != -5) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          param1.field_m[var8_int] = (byte)param7;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var8 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var8;
            stackOut_67_1 = new StringBuilder().append("sn.I(").append(param0).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L23;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L23;
            }
          }
          L24: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L24;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L24;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "The effect of the spell is focused on where you click the mouse. Some spells have a limited area of use.";
        field_N = "Unpacking sound effects";
        field_F = new byte[250][];
        field_H = new int[]{0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 11, 12, 13, 13, 14, 15, 15, 16, 17, 17, 18, 18, 19, 20, 20, 21, 22, 22, 23, 24, 24, 25, 25, 26, 27, 27, 28, 29, 29, 30, 31, 31, 32, 32, 33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 39, 40, 41, 41, 42, 43, 43, 44, 45, 45, 46, 46, 47, 48, 48, 49, 50, 50, 51, 52, 52, 53, 53, 54, 55, 55, 56, 57, 57, 58, 59, 59, 60, 60, 61, 62, 62, 63, 64, 64, 65, 66, 66, 67, 67, 68, 69, 69, 70, 71, 71, 72, 72, 73, 74, 74, 75, 76, 76, 77, 78, 78, 79, 79, 80, 81, 81, 82, 83, 83, 84, 85, 85, 86, 86, 87, 88, 88, 89, 90, 90, 91, 92, 92, 93, 93, 94, 95, 95, 96, 97, 97, 98, 98, 99, 100, 100, 101, 102, 102, 103, 104, 104, 105, 105, 106, 107, 107, 108, 109, 109, 110, 111, 111, 112, 112, 113, 114, 114, 115, 116, 116, 117, 117, 118, 119, 119, 120, 121, 121, 122, 123, 123, 124, 124, 125, 126, 126, 127, 128, 128, 129, 129, 130, 131, 131, 132, 133, 133, 134, 134, 135, 136, 136, 137, 138, 138, 139, 140, 140, 141, 141, 142, 143, 143, 144, 145, 145, 146, 146, 147, 148, 148, 149, 150, 150, 151, 151, 152, 153, 153, 154, 155, 155, 156, 156, 157, 158, 158, 159, 160, 160, 161, 162, 162, 163, 163, 164, 165, 165, 166, 167, 167, 168, 168, 169, 170, 170, 171, 172, 172, 173, 173, 174, 175, 175, 176, 177, 177, 178, 178, 179, 180, 180, 181, 182, 182, 183, 183, 184, 185, 185, 186, 187, 187, 188, 188, 189, 190, 190, 191, 192, 192, 193, 193, 194, 195, 195, 196, 196, 197, 198, 198, 199, 200, 200, 201, 201, 202, 203, 203, 204, 205, 205, 206, 206, 207, 208, 208, 209, 210, 210, 211, 211, 212, 213, 213, 214, 214, 215, 216, 216, 217, 218, 218, 219, 219, 220, 221, 221, 222, 223, 223, 224, 224, 225, 226, 226, 227, 227, 228, 229, 229, 230, 231, 231, 232, 232, 233, 234, 234, 235, 236, 236, 237, 237, 238, 239, 239, 240, 240, 241, 242, 242, 243, 244, 244, 245, 245, 246, 247, 247, 248, 248, 249, 250, 250, 251, 251, 252, 253, 253, 254, 255, 255, 256, 256, 257, 258, 258, 259, 259, 260, 261, 261, 262, 263, 263, 264, 264, 265, 266, 266, 267, 267, 268, 269, 269, 270, 270, 271, 272, 272, 273, 273, 274, 275, 275, 276, 277, 277, 278, 278, 279, 280, 280, 281, 281, 282, 283, 283, 284, 284, 285, 286, 286, 287, 287, 288, 289, 289, 290, 290, 291, 292, 292, 293, 294, 294, 295, 295, 296, 297, 297, 298, 298, 299, 300, 300, 301, 301, 302, 303, 303, 304, 304, 305, 306, 306, 307, 307, 308, 309, 309, 310, 310, 311, 312, 312, 313, 313, 314, 315, 315, 316, 316, 317, 318, 318, 319, 319, 320, 321, 321, 322, 322, 323, 324, 324, 325, 325, 326, 327, 327, 328, 328, 329, 330, 330, 331, 331, 332, 333, 333, 334, 334, 335, 336, 336, 337, 337, 338, 339, 339, 340, 340, 341, 341, 342, 343, 343, 344, 344, 345, 346, 346, 347, 347, 348, 349, 349, 350, 350, 351, 352, 352, 353, 353, 354, 355, 355, 356, 356, 357, 357, 358, 359, 359, 360, 360, 361, 362, 362, 363, 363, 364, 365, 365, 366, 366, 367, 367, 368, 369, 369, 370, 370, 371, 372, 372, 373, 373, 374, 375, 375, 376, 376, 377, 377, 378, 379, 379, 380, 380, 381, 382, 382, 383, 383, 384, 384, 385, 386, 386, 387, 387, 388, 389, 389, 390, 390, 391, 391, 392, 393, 393, 394, 394, 395, 395, 396, 397, 397, 398, 398, 399, 400, 400, 401, 401, 402, 402, 403, 404, 404, 405, 405, 406, 406, 407, 408, 408, 409, 409, 410, 411, 411, 412, 412, 413, 413, 414, 415, 415, 416, 416, 417, 417, 418, 419, 419, 420, 420, 421, 421, 422, 423, 423, 424, 424, 425, 425, 426, 427, 427, 428, 428, 429, 429, 430, 431, 431, 432, 432, 433, 433, 434, 435, 435, 436, 436, 437, 437, 438, 439, 439, 440, 440, 441, 441, 442, 442, 443, 444, 444, 445, 445, 446, 446, 447, 448, 448, 449, 449, 450, 450, 451, 452, 452, 453, 453, 454, 454, 455, 455, 456, 457, 457, 458, 458, 459, 459, 460, 460, 461, 462, 462, 463, 463, 464, 464, 465, 466, 466, 467, 467, 468, 468, 469, 469, 470, 471, 471, 472, 472, 473, 473, 474, 474, 475, 476, 476, 477, 477, 478, 478, 479, 479, 480, 481, 481, 482, 482, 483, 483, 484, 484, 485, 486, 486, 487, 487, 488, 488, 489, 489, 490, 490, 491, 492, 492, 493, 493, 494, 494, 495, 495, 496, 497, 497, 498, 498, 499, 499, 500, 500, 501, 501, 502, 503, 503, 504, 504, 505, 505, 506, 506, 507, 507, 508, 509, 509, 510, 510, 511, 511, 512, 512, 513, 513, 514, 515, 515, 516, 516, 517, 517, 518, 518, 519, 519, 520, 521, 521, 522, 522, 523, 523, 524, 524, 525, 525, 526, 526, 527, 528, 528, 529, 529, 530, 530, 531, 531, 532, 532, 533, 533, 534, 534, 535, 536, 536, 537, 537, 538, 538, 539, 539, 540, 540, 541, 541, 542, 543, 543, 544, 544, 545, 545, 546, 546, 547, 547, 548, 548, 549, 549, 550, 550, 551, 552, 552, 553, 553, 554, 554, 555, 555, 556, 556, 557, 557, 558, 558, 559, 559, 560, 560, 561, 562, 562, 563, 563, 564, 564, 565, 565, 566, 566, 567, 567, 568, 568, 569, 569, 570, 570, 571, 572, 572, 573, 573, 574, 574, 575, 575, 576, 576, 577, 577, 578, 578, 579, 579, 580, 580, 581, 581, 582, 582, 583, 583, 584, 584, 585, 586, 586, 587, 587, 588, 588, 589, 589, 590, 590, 591, 591, 592, 592, 593, 593, 594, 594, 595, 595, 596, 596, 597, 597, 598, 598, 599, 599, 600, 600, 601, 601, 602, 602, 603, 603, 604, 605, 605, 606, 606, 607, 607, 608, 608, 609, 609, 610, 610, 611, 611, 612, 612, 613, 613, 614, 614, 615, 615, 616, 616, 617, 617, 618, 618, 619, 619, 620, 620, 621, 621, 622, 622, 623, 623, 624, 624, 625, 625, 626, 626, 627, 627, 628, 628, 629, 629, 630, 630, 631, 631, 632, 632, 633, 633, 634, 634, 635, 635, 636, 636, 637, 637, 638, 638, 639, 639, 640, 640, 641, 641, 642, 642, 643, 643, 644, 644, 645, 645, 646, 646, 647, 647, 648, 648, 649, 649, 650, 650, 651, 651, 651, 652, 652, 653, 653, 654, 654, 655, 655, 656, 656, 657, 657, 658, 658, 659, 659, 660, 660, 661, 661, 662, 662, 663, 663, 664, 664, 665, 665, 666, 666, 667, 667, 668, 668, 669, 669, 670, 670, 670, 671, 671, 672, 672, 673, 673, 674, 674, 675, 675, 676, 676, 677, 677, 678, 678, 679, 679, 680, 680, 681, 681, 682, 682, 682, 683, 683, 684, 684, 685, 685, 686, 686, 687, 687, 688, 688, 689, 689, 690, 690, 691, 691, 692, 692, 692, 693, 693, 694, 694, 695, 695, 696, 696, 697, 697, 698, 698, 699, 699, 700, 700, 700, 701, 701, 702, 702, 703, 703, 704, 704, 705, 705, 706, 706, 707, 707, 707, 708, 708, 709, 709, 710, 710, 711, 711, 712, 712, 713, 713, 714, 714, 714, 715, 715, 716, 716, 717, 717, 718, 718, 719, 719, 720, 720, 720, 721, 721, 722, 722, 723, 723, 724, 724, 725, 725, 726, 726, 726, 727, 727, 728, 728, 729, 729, 730, 730, 731, 731, 731, 732, 732, 733, 733, 734, 734, 735, 735, 736, 736, 737, 737, 737, 738, 738, 739, 739, 740, 740, 741, 741, 741, 742, 742, 743, 743, 744, 744, 745, 745, 746, 746, 746, 747, 747, 748, 748, 749, 749, 750, 750, 750, 751, 751, 752, 752, 753, 753, 754, 754, 755, 755, 755, 756, 756, 757, 757, 758, 758, 759, 759, 759, 760, 760, 761, 761, 762, 762, 763, 763, 763, 764, 764, 765, 765, 766, 766, 766, 767, 767, 768, 768, 769, 769, 770, 770, 770, 771, 771, 772, 772, 773, 773, 774, 774, 774, 775, 775, 776, 776, 777, 777, 777, 778, 778, 779, 779, 780, 780, 780, 781, 781, 782, 782, 783, 783, 784, 784, 784, 785, 785, 786, 786, 787, 787, 787, 788, 788, 789, 789, 790, 790, 790, 791, 791, 792, 792, 793, 793, 793, 794, 794, 795, 795, 796, 796, 796, 797, 797, 798, 798, 799, 799, 799, 800, 800, 801, 801, 802, 802, 802, 803, 803, 804, 804, 805, 805, 805, 806, 806, 807, 807, 807, 808, 808, 809, 809, 810, 810, 810, 811, 811, 812, 812, 813, 813, 813, 814, 814, 815, 815, 815, 816, 816, 817, 817, 818, 818, 818, 819, 819, 820, 820, 820, 821, 821, 822, 822, 823, 823, 823, 824, 824, 825, 825, 825, 826, 826, 827, 827, 828, 828, 828, 829, 829, 830, 830, 830, 831, 831, 832, 832, 832, 833, 833, 834, 834, 835, 835, 835, 836, 836, 837, 837, 837, 838, 838, 839, 839, 839, 840, 840, 841, 841, 841, 842, 842, 843, 843, 843, 844, 844, 845, 845, 845, 846, 846, 847, 847, 848, 848, 848, 849, 849, 850, 850, 850, 851, 851, 852, 852, 852, 853, 853, 854, 854, 854, 855, 855, 856, 856, 856, 857, 857, 858, 858, 858, 859, 859, 860, 860, 860, 861, 861, 862, 862, 862, 863, 863, 863, 864, 864, 865, 865, 865, 866, 866, 867, 867, 867, 868, 868, 869, 869, 869, 870, 870, 871, 871, 871, 872, 872, 873, 873, 873, 874, 874, 875, 875, 875, 876, 876, 876, 877, 877, 878, 878, 878, 879, 879, 880, 880, 880, 881, 881, 882, 882, 882, 883, 883, 883, 884, 884, 885, 885, 885, 886, 886, 887, 887, 887, 888, 888, 888, 889, 889, 890, 890, 890, 891, 891, 892, 892, 892, 893, 893, 893, 894, 894, 895, 895, 895, 896, 896, 896, 897, 897, 898, 898, 898, 899, 899, 900, 900, 900, 901, 901, 901, 902, 902, 903, 903, 903, 904, 904, 904, 905, 905, 906, 906, 906, 907, 907, 907, 908, 908, 909, 909, 909, 910, 910, 910, 911, 911, 912, 912, 912, 913, 913, 913, 914, 914, 915, 915, 915, 916, 916, 916, 917, 917, 917, 918, 918, 919, 919, 919, 920, 920, 920, 921, 921, 922, 922, 922, 923, 923, 923, 924, 924, 924, 925, 925, 926, 926, 926, 927, 927, 927, 928, 928, 929, 929, 929, 930, 930, 930, 931, 931, 931, 932, 932, 933, 933, 933, 934, 934, 934, 935, 935, 935, 936, 936, 936, 937, 937, 938, 938, 938, 939, 939, 939, 940, 940, 940, 941, 941, 942, 942, 942, 943, 943, 943, 944, 944, 944, 945, 945, 945, 946, 946, 947, 947, 947, 948, 948, 948, 949, 949, 949, 950, 950, 950, 951, 951, 951, 952, 952, 953, 953, 953, 954, 954, 954, 955, 955, 955, 956, 956, 956, 957, 957, 957, 958, 958, 959, 959, 959, 960, 960, 960, 961, 961, 961, 962, 962, 962, 963, 963, 963, 964, 964, 964, 965, 965, 966, 966, 966, 967, 967, 967, 968, 968, 968, 969, 969, 969, 970, 970, 970, 971, 971, 971, 972, 972, 972, 973, 973, 973, 974, 974, 974, 975, 975, 975, 976, 976, 977, 977, 977, 978, 978, 978, 979, 979, 979, 980, 980, 980, 981, 981, 981, 982, 982, 982, 983, 983, 983, 984, 984, 984, 985, 985, 985, 986, 986, 986, 987, 987, 987, 988, 988, 988, 989, 989, 989, 990, 990, 990, 991, 991, 991, 992, 992, 992, 993, 993, 993, 994, 994, 994, 995, 995, 995, 996, 996, 996, 997, 997, 997, 998, 998, 998, 999, 999, 999, 1000, 1000, 1000, 1001, 1001, 1001, 1002, 1002, 1002, 1003, 1003, 1003, 1004, 1004, 1004, 1005, 1005, 1005, 1006, 1006, 1006, 1007, 1007, 1007, 1008, 1008, 1008, 1009, 1009, 1009, 1010, 1010, 1010, 1010, 1011, 1011, 1011, 1012, 1012, 1012, 1013, 1013, 1013, 1014, 1014, 1014, 1015, 1015, 1015, 1016, 1016, 1016, 1017, 1017, 1017, 1018, 1018, 1018, 1019, 1019, 1019, 1020, 1020, 1020, 1020, 1021, 1021, 1021, 1022, 1022, 1022, 1023, 1023, 1023, 1024, 1024};
        field_K = 0;
    }
}
