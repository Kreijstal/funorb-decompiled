/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ri extends f implements od, bp {
    private boolean field_L;
    private kg field_K;
    private String field_J;
    static String field_G;
    static int field_F;
    static String field_N;
    private kg field_P;
    static gr field_I;
    private go field_H;
    private kg field_Q;
    private go field_R;
    private boolean field_D;
    private boolean field_E;
    static String field_M;
    static int field_O;

    final void a(int param0, String param1) {
        go var3 = null;
        String var4 = null;
        if (param0 != 16311) {
            return;
        }
        try {
            var3 = ((ri) this).field_H;
            var4 = param1;
            var3.a(108, var4, false);
            ((ri) this).field_R.e(true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ri.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void k(int param0) {
        int var2 = 0;
        L0: {
          var2 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((ce.field_x.field_P.field_y & 1 << ce.field_x.field_h) != 0) {
            oq.field_i[11] = te.field_a;
            break L0;
          } else {
            if (ce.field_x.field_P.field_y == 0) {
              oq.field_i[11] = kd.field_c;
              break L0;
            } else {
              oq.field_i[11] = bb.field_a;
              break L0;
            }
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 != 98) {
                if (param0 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((ri) this).a(param3, 102);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((ri) this).a(param3, true);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ri.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static th a(String param0, String param1, bc param2, bc param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        th stackIn_1_0 = null;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        th stackOut_0_0 = null;
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
            var5_int = param2.a(126, param1);
            var6 = param2.a(var5_int, (byte) 106, param0);
            var7 = 72 % ((38 - param4) / 49);
            stackOut_0_0 = mf.a(var6, var5_int, param2, param3, -121);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("ri.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(go param0, int param1) {
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
              if (param1 == 95) {
                break L1;
              } else {
                ((ri) this).field_K = null;
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
            stackOut_3_1 = new StringBuilder().append("ri.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0) {
        L0: {
          L1: {
            if (i.a(1)) {
              break L1;
            } else {
              if (((ri) this).field_H.field_s.length() <= 0) {
                break L0;
              } else {
                if (0 < ((ri) this).field_R.field_s.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          bh.a((byte) 81, ((ri) this).field_R.field_s, ((ri) this).field_H.field_s);
          break L0;
        }
        L2: {
          if (param0 <= -126) {
            break L2;
          } else {
            this.a(-6);
            break L2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((ri) this).field_J == null)) {
            int discarded$0 = gn.field_u.a(((ri) this).field_J, 20 + (param3 - -((ri) this).field_m), 15 + ((ri) this).field_q + param2, -40 + ((ri) this).field_x, ((ri) this).field_n, 16777215, -1, 1, 0, gn.field_u.field_J);
        }
        if (!(((ri) this).field_Q == null)) {
            gf.f(param3 - -10, 134 + param2, ((ri) this).field_x - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public final void a(int param0, go param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == ((ri) this).field_H) {
                boolean discarded$4 = ((ri) this).field_R.a((byte) -21, (vg) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ri) this).field_R != param1) {
                break L2;
              } else {
                this.a(param0 + -4468);
                break L2;
              }
            }
            L3: {
              if (param0 == 4340) {
                break L3;
              } else {
                var4 = null;
                th discarded$5 = ri.a((String) null, (String) null, (bc) null, (bc) null, (byte) -106);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ri.K(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    ri(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (iq) null);
        RuntimeException var6 = null;
        qp var6_ref = null;
        nq var7 = null;
        String var8 = null;
        bg var9 = null;
        pg var12 = null;
        pg var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        kg stackIn_17_1 = null;
        kg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        kg stackIn_18_1 = null;
        kg stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        kg stackIn_19_1 = null;
        kg stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        kg stackOut_16_1 = null;
        kg stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        kg stackOut_18_1 = null;
        kg stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        kg stackOut_17_1 = null;
        kg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              ((ri) this).field_J = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ri) this).field_E = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param4) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ri) this).field_D = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ri) this).field_L = stackIn_10_1 != 0;
              if (!((ri) this).field_L) {
                break L4;
              } else {
                L5: {
                  if (((ri) this).field_E) {
                    break L5;
                  } else {
                    if (!((ri) this).field_D) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((ri) this).field_H = (go) (Object) new fa(param0, (ko) this, 100);
              ((ri) this).field_R = (go) (Object) new fa("", (ko) this, 20);
              if (!((ri) this).field_L) {
                L7: {
                  ((ri) this).field_K = new kg(wl.field_e, (ko) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((ri) this).field_D) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = ss.field_e;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = tr.field_Pb;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ri) this).field_P = new kg(stackIn_19_3, (ko) null);
                if (!((ri) this).field_E) {
                  break L6;
                } else {
                  ((ri) this).field_Q = new kg(oj.field_Ab, (ko) this);
                  break L6;
                }
              } else {
                ((ri) this).field_K = new kg(ts.field_E, (ko) null);
                ((ri) this).field_P = new kg(em.field_g, (ko) null);
                ((ri) this).field_H.field_y = false;
                break L6;
              }
            }
            L8: {
              ((ri) this).field_H.field_p = (iq) (Object) new rr(10000536);
              ((ri) this).field_R.field_p = (iq) (Object) new ce(10000536);
              var6_ref = new qp();
              ((ri) this).field_K.field_p = (iq) (Object) var6_ref;
              if (((ri) this).field_P == null) {
                break L8;
              } else {
                ((ri) this).field_P.field_p = (iq) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((ri) this).field_Q == null) {
                break L9;
              } else {
                ((ri) this).field_Q.field_p = (iq) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((ri) this).field_H.field_v = sf.field_a;
              if (null == ((ri) this).field_Q) {
                break L10;
              } else {
                ((ri) this).field_Q.field_v = nc.field_m;
                break L10;
              }
            }
            L11: {
              if (((ri) this).field_L) {
                ((ri) this).field_P.field_v = ed.field_a;
                break L11;
              } else {
                if (((ri) this).field_D) {
                  ((ri) this).field_P.field_v = bs.field_c;
                  ((ri) this).field_P.field_p = (iq) (Object) new rq();
                  break L11;
                } else {
                  ((ri) this).field_P.field_p = (iq) (Object) new rq();
                  break L11;
                }
              }
            }
            L12: {
              ((ri) this).field_q = 15;
              var7 = gn.field_u;
              if (null == ((ri) this).field_J) {
                break L12;
              } else {
                ((ri) this).field_q = ((ri) this).field_q + (var7.c(((ri) this).field_J, ((ri) this).field_x + -40, var7.field_J) - -5);
                break L12;
              }
            }
            L13: {
              var8 = ph.field_e;
              var9 = jc.a(kq.f((byte) 124), true);
              if (var9 == og.field_b) {
                var8 = cn.field_v;
                break L13;
              } else {
                if (dm.field_f != var9) {
                  break L13;
                } else {
                  var8 = ba.field_b;
                  break L13;
                }
              }
            }
            L14: {
              pg dupTemp$2 = new pg(10, ((ri) this).field_q, -20 + ((ri) this).field_x, 25, (vg) (Object) ((ri) this).field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((ri) this).b((byte) -65, (vg) (Object) dupTemp$2);
              ((ri) this).field_q = ((ri) this).field_q + (((vg) (Object) var12).field_n + 5);
              pg dupTemp$3 = new pg(10, ((ri) this).field_q, ((ri) this).field_x + -20, 25, (vg) (Object) ((ri) this).field_R, false, 80, 3, var7, 16777215, co.field_t);
              var13 = dupTemp$3;
              ((ri) this).b((byte) -66, (vg) (Object) dupTemp$3);
              ((ri) this).field_q = ((ri) this).field_q + (((vg) (Object) var13).field_n + 5);
              ((ri) this).field_K.field_u = (ko) this;
              if (null == ((ri) this).field_Q) {
                break L14;
              } else {
                ((ri) this).field_Q.field_u = (ko) this;
                break L14;
              }
            }
            L15: {
              if (null == ((ri) this).field_P) {
                break L15;
              } else {
                ((ri) this).field_P.field_u = (ko) this;
                break L15;
              }
            }
            L16: {
              if (null == ((ri) this).field_Q) {
                ((ri) this).field_K.a(((ri) this).field_q, 30, (byte) 106, 8, -6 + (((ri) this).field_x - 10));
                ((ri) this).field_q = ((ri) this).field_q + 35;
                break L16;
              } else {
                ((ri) this).field_K.a(((ri) this).field_q, 30, (byte) 110, 85, ((ri) this).field_x - 95);
                ((ri) this).field_q = ((ri) this).field_q + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((ri) this).field_Q) {
                break L17;
              } else {
                ((ri) this).field_Q.a(((ri) this).field_q, 30, (byte) 115, 8, ((ri) this).field_x + -16);
                ((ri) this).field_q = ((ri) this).field_q + 35;
                break L17;
              }
            }
            L18: {
              if (((ri) this).field_P == null) {
                break L18;
              } else {
                L19: {
                  if (((ri) this).field_L) {
                    break L19;
                  } else {
                    if (((ri) this).field_D) {
                      break L19;
                    } else {
                      ((ri) this).field_P.a(((ri) this).field_q, 20, (byte) 108, 8, 40);
                      ((ri) this).field_q = ((ri) this).field_q + 25;
                      break L18;
                    }
                  }
                }
                ((ri) this).field_P.a(((ri) this).field_q, 30, (byte) 124, 8, -10 + ((ri) this).field_x + -6);
                ((ri) this).field_q = ((ri) this).field_q + 35;
                break L18;
              }
            }
            L20: {
              ((ri) this).a(0, ((ri) this).field_q - -3, (byte) 100, 0, ((ri) this).field_x);
              ((ri) this).b((byte) -98, (vg) (Object) ((ri) this).field_K);
              if (null == ((ri) this).field_Q) {
                break L20;
              } else {
                ((ri) this).b((byte) -44, (vg) (Object) ((ri) this).field_Q);
                break L20;
              }
            }
            L21: {
              if (((ri) this).field_P == null) {
                break L21;
              } else {
                ((ri) this).b((byte) -87, (vg) (Object) ((ri) this).field_P);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("ri.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw r.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ri) this).field_K != param0) {
                if (((ri) this).field_Q == param0) {
                  cs.a((byte) 115);
                  break L1;
                } else {
                  if (((ri) this).field_P == param0) {
                    if (((ri) this).field_L) {
                      o.a(0);
                      break L1;
                    } else {
                      if (((ri) this).field_D) {
                        ol.b((byte) -125);
                        break L1;
                      } else {
                        qc.h(30252);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                this.a(-127);
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                ((ri) this).l(-45);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("ri.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_N = null;
        if (param0 > -55) {
            ri.a((byte) 58);
        }
        field_G = null;
    }

    final String d(boolean param0) {
        if (param0) {
            return null;
        }
        if (null == ((ri) this).field_H.field_s) {
            return "";
        }
        return ((ri) this).field_H.field_s;
    }

    final void l(int param0) {
        if (param0 != 8) {
            return;
        }
        ((ri) this).field_H.e(true);
        ((ri) this).field_R.e(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Auto-respond to <%0>";
        field_N = "<%highlight>FLEET MOVEMENT</col> - To issue a fleet order, <%key>click</col> on a <%glossary>system</col> you control that has available fleets, then <%key>click</col> on a destination system. Fleets can make <%highlight>one</col> <%glossary>wormhole</col> jump per turn through hostile territory, but can move an unlimited distance through your own systems. Fleets that are about to move are displayed as a <%highlight>curved arrow</col> between the source and destination system.";
        field_F = 50;
        field_I = null;
        field_M = "Invalid date";
    }
}
