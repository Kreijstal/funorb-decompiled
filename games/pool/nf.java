/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ch implements jb, tb, jn {
    private ga field_bb;
    private ga field_cb;
    private mh field_N;
    mp field_P;
    private fe field_Y;
    private fe field_U;
    private ga field_R;
    static ko field_S;
    private ga field_O;
    private ri field_W;
    private ga field_ab;
    private ga field_X;
    static qb[] field_Z;
    static int field_T;
    static long field_Q;
    static String field_db;
    static dd[] field_V;

    private final int a(String param0, ei param1, int param2, int param3, String param4, int param5, byte param6) {
        RuntimeException var8 = null;
        ck var9 = null;
        n var10 = null;
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
              if (param6 <= -10) {
                break L1;
              } else {
                ((nf) this).field_Y = null;
                break L1;
              }
            }
            var10 = new n(20, param5, param3 + 120, 25, param1, false, 120, 3, lc.field_O, 16777215, param0);
            ((nf) this).a(true, (ei) (Object) var10);
            var9 = new ck(((sc) (Object) param1).a(70), param4, 126, param5 - -var10.field_y, param3 + 50, param2);
            var9.field_t = (cc) this;
            ((nf) this).a(true, (ei) (Object) var9);
            stackOut_2_0 = var9.field_y + var10.field_y;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("nf.I(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44).append(param3).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
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
              if (param1 == 98) {
                stackOut_6_0 = ((nf) this).a(param3, 3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 == 99) {
                  stackOut_10_0 = ((nf) this).b(param3, 0);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("nf.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    final static void a(int param0, boolean param1, int param2) {
        oq var3 = null;
        oq stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        oq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        oq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        oq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        oq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        oq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        oq stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        oq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        oq stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        oq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        oq stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        oq stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var3 = ej.field_j;
          var3.b(false, param2);
          stackOut_0_0 = (oq) var3;
          stackOut_0_1 = 3;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param1) {
            stackOut_2_0 = (oq) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (oq) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          ((oq) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
          stackOut_3_0 = (oq) var3;
          stackOut_3_1 = 9;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (param1) {
            stackOut_5_0 = (oq) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (oq) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        ((oq) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0);
        if (!param1) {
          vh discarded$2 = nf.g((byte) 125);
          var3.a((byte) -81, param0);
          return;
        } else {
          var3.a((byte) -81, param0);
          return;
        }
    }

    public final void a(int param0) {
        if (param0 != 16777215) {
          String discarded$2 = this.j(24);
          ((ua) (Object) ((nf) this).field_bb.a(-91)).i(18);
          return;
        } else {
          ((ua) (Object) ((nf) this).field_bb.a(-91)).i(18);
          return;
        }
    }

    private final int a(String param0, byte param1, int param2, int param3, ei param4) {
        RuntimeException var6 = null;
        lc var7 = null;
        Object var8 = null;
        n var9 = null;
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
        try {
          L0: {
            L1: {
              var9 = new n(20, param3, 120 - -param2, 25, param4, false, 120, 3, lc.field_O, 16777215, param0);
              if (param1 == -114) {
                break L1;
              } else {
                var8 = null;
                int discarded$2 = this.a((String) null, (ei) null, -45, 100, (String) null, 17, (byte) -12);
                break L1;
              }
            }
            ((nf) this).a(true, (ei) (Object) var9);
            var7 = new lc(((sc) (Object) param4).a(-14));
            ((nf) this).a(true, (ei) (Object) var7);
            var7.a(15, 3 + (var9.field_C + var9.field_l), 15, false, (-15 + var9.field_y >> 1) + var9.field_D);
            stackOut_2_0 = var9.field_y;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("nf.N(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    private final boolean a(byte param0, sc param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var3 = param1.a(101);
            if (var3 != null) {
              var4 = var3.c(-31873);
              if (gp.field_d != var4) {
                if (ji.field_h != var4) {
                  if (wm.field_Pb == var4) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    L1: {
                      if (param0 == -3) {
                        break L1;
                      } else {
                        nf.h((byte) -49);
                        break L1;
                      }
                    }
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("nf.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    public final void a(int param0, mh param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 == -12147) {
                break L1;
              } else {
                field_V = null;
                break L1;
              }
            }
            if (param3 != 0) {
              if (param3 != 1) {
                if (param3 != 2) {
                  break L0;
                } else {
                  ci.a("conduct.ws", param2 ^ 12044);
                  return;
                }
              } else {
                ci.a("privacy.ws", param2 + 12020);
                return;
              }
            } else {
              ci.a("terms.ws", -127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("nf.D(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final int a(byte param0, ei param1, int param2, int param3, String param4) {
        n var6 = null;
        RuntimeException var6_ref = null;
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
            var6 = new n(20, param2, param3 + 120, 25, param1, false, 120, 3, lc.field_O, 16777215, param4);
            if (param0 == 44) {
              ((nf) this).a(true, (ei) (Object) var6);
              stackOut_3_0 = var6.field_y;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 118;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("nf.T(").append(param0).append(44);
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(param3).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((nf) this).field_U.field_I = this.k(3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "nf.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static vh g(byte param0) {
        if (param0 != 103) {
            field_S = null;
            return wo.field_f.field_Rb;
        }
        return wo.field_f.field_Rb;
    }

    private final int a(int param0, String param1, ei param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
            if (param0 == 35) {
              stackOut_3_0 = this.a(param1, param2, 35, param4, param3, param5, (byte) -36);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 48;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("nf.DA(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    private final boolean k(int param0) {
        if (this.a((byte) -3, (sc) (Object) ((nf) this).field_bb)) {
          if (this.a((byte) -3, (sc) (Object) ((nf) this).field_cb)) {
            if (this.a((byte) -3, (sc) (Object) ((nf) this).field_O)) {
              if (this.a((byte) -3, (sc) (Object) ((nf) this).field_X)) {
                if (this.a((byte) -3, (sc) (Object) ((nf) this).field_R)) {
                  if (!this.a((byte) -3, (sc) (Object) ((nf) this).field_ab)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
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
              if (param3 == ((nf) this).field_Y) {
                od.a(true);
                break L1;
              } else {
                if (param3 == ((nf) this).field_U) {
                  boolean discarded$5 = this.h(127);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              break L0;
            } else {
              var7 = null;
              ((nf) this).a((String) null, -73);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("nf.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
    }

    public static void h(byte param0) {
        if (param0 != 4) {
            return;
        }
        field_S = null;
        field_Z = null;
        field_V = null;
        field_db = null;
    }

    public nf() {
        super(0, 0, 496, 0, (fp) null);
        ((nf) this).field_bb = new ga("", (cc) null, 12);
        ((nf) this).field_cb = new ga("", (cc) null, 100);
        ((nf) this).field_O = new ga("", (cc) null, 100);
        ((nf) this).field_X = new ga("", (cc) null, 20);
        ((nf) this).field_R = new ga("", (cc) null, 20);
        ((nf) this).field_ab = new ga("", (cc) null, 3);
        int var1 = 1;
        ((nf) this).field_W = new ri("", (cc) null, var1 != 0);
        ((nf) this).field_U = new fe(qo.field_E, (cc) null);
        ((nf) this).field_Y = new fe(lc.field_Q, (cc) null);
        ((nf) this).field_bb.field_p = sg.field_H;
        ((nf) this).field_cb.field_p = ri.field_T;
        ((nf) this).field_O.field_p = wp.field_e;
        ((nf) this).field_X.field_p = kc.field_f;
        ((nf) this).field_R.field_p = ii.field_b;
        ((nf) this).field_ab.field_p = uf.field_J;
        ((nf) this).field_W.field_p = ui.field_ab;
        ((nf) this).field_bb.a((byte) -111, (ip) (Object) new ua((sl) (Object) ((nf) this).field_bb));
        ((nf) this).field_cb.a((byte) -111, (ip) (Object) new r((sl) (Object) ((nf) this).field_cb));
        ((nf) this).field_O.a((byte) -111, (ip) (Object) new me((sl) (Object) ((nf) this).field_O, (sl) (Object) ((nf) this).field_cb));
        ((nf) this).field_X.a((byte) -111, (ip) (Object) new uh((sl) (Object) ((nf) this).field_X, (sl) (Object) ((nf) this).field_bb, (sl) (Object) ((nf) this).field_cb));
        ((nf) this).field_R.a((byte) -111, (ip) (Object) new ne((sl) (Object) ((nf) this).field_R, (sl) (Object) ((nf) this).field_X));
        ((nf) this).field_ab.a((byte) -111, (ip) (Object) new ka((sl) (Object) ((nf) this).field_ab));
        ((nf) this).field_U.field_I = false;
        ((nf) this).field_U.field_z = (fp) (Object) new ng();
        ((nf) this).field_Y.field_z = (fp) (Object) new pd();
        ((nf) this).field_bb.field_z = (fp) (Object) new om(10000536);
        om dupTemp$0 = new om(10000536);
        ((nf) this).field_O.field_z = (fp) (Object) dupTemp$0;
        ((nf) this).field_cb.field_z = (fp) (Object) dupTemp$0;
        ((nf) this).field_ab.field_z = (fp) (Object) new om(10000536);
        ((nf) this).field_W.field_z = (fp) (Object) new j();
        sm dupTemp$1 = new sm(10000536);
        ((nf) this).field_R.field_z = (fp) (Object) dupTemp$1;
        ((nf) this).field_X.field_z = (fp) (Object) dupTemp$1;
        String var2 = nr.a(new String[2], -1, lh.field_d);
        int var3 = 20;
        var3 = var3 + this.a((byte) 44, (ei) (Object) ((nf) this).field_cb, var3, 170, ng.field_x);
        var3 = var3 + (5 + this.a(lo.field_d, (ei) (Object) ((nf) this).field_O, 20, 170, "", var3, (byte) -76));
        var3 = var3 + this.a((byte) 44, (ei) (Object) ((nf) this).field_X, var3, 170, to.field_n);
        var3 = var3 + (5 + this.a(35, e.field_g, (ei) (Object) ((nf) this).field_R, df.field_c, 170, var3));
        var3 = var3 + (5 + this.a(35, ac.field_l, (ei) (Object) ((nf) this).field_bb, se.field_k, 170, var3));
        var3 = var3 + this.a(g.field_m, (byte) -114, 170, var3, (ei) (Object) ((nf) this).field_ab);
        n var4 = new n(46, var3, -90 + ((nf) this).field_l, 25, (ei) (Object) ((nf) this).field_W, true, -120 + ((nf) this).field_l, 5, qk.field_a, 11579568, ab.field_b);
        ((nf) this).a(true, (ei) (Object) var4);
        var3 = var3 + var4.field_y;
        am var5 = new am(lc.field_O, 0, 0, 0, 0, 16777215, -1, 0, 0, lc.field_O.field_C, -1, 2147483647, true);
        ((nf) this).field_N = new mh(var2, (fp) (Object) var5);
        ((nf) this).field_N.field_p = "";
        ((nf) this).field_N.a((byte) 73, cn.field_b, 0);
        ((nf) this).field_N.a((byte) 117, cn.field_b, 1);
        ((nf) this).field_N.field_t = (cc) this;
        ((nf) this).field_N.b(46, var3, -90 + ((nf) this).field_l, -15);
        var3 = var3 + (((nf) this).field_N.field_y + 15);
        ((nf) this).a(true, (ei) (Object) ((nf) this).field_N);
        int var6 = 4;
        int var7 = 200;
        ((nf) this).field_U.a(var7, 496 + -var7 >> 1, 40, false, var3);
        ((nf) this).field_Y.a(60, 3 + var6, 40, false, 15 + var3);
        ((nf) this).field_Y.field_t = (cc) this;
        ((nf) this).field_U.field_t = (cc) this;
        ((nf) this).a(true, (ei) (Object) ((nf) this).field_U);
        ((nf) this).a(true, (ei) (Object) ((nf) this).field_Y);
        ((nf) this).field_P = new mp((jn) this);
        ((nf) this).field_P.a(-((nf) this).field_bb.field_l + -((nf) this).field_bb.field_C + (((nf) this).field_l - 60), 60 + (((nf) this).field_bb.field_l + ((nf) this).field_bb.field_C), 150, false, ((nf) this).field_bb.field_D + 20);
        ((nf) this).a(true, (ei) (Object) ((nf) this).field_P);
        ((nf) this).a(496, 0, var3 - -55 + var6, false, 0);
    }

    final static qr b(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        qr stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == -25) {
              L1: {
                if (!ig.field_j.a(param0 + 121)) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) ig.field_j.b(2))) {
                    break L1;
                  } else {
                    ig.field_j = oh.a(117, param1);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = ig.field_j;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qr) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("nf.O(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final String j(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = ((nf) this).a('￴', -47, false, (ei) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String i(int param0) {
        return "</col></u>";
    }

    private final boolean h(int param0) {
        if (!this.k(3)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((nf) this).field_ab.field_m);
        } catch (NumberFormatException numberFormatException) {
        }
        return vb.a(((nf) this).field_W.field_G, ((nf) this).field_X.field_m, (byte) 114, (nf) this, var2, ((nf) this).field_cb.field_m, ((nf) this).field_bb.field_m);
    }

    public final void a(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 != 35) {
            return;
        }
        try {
            var3 = ((nf) this).field_bb;
            var4 = param0;
            ((sl) (Object) var3).a((byte) -124, false, var4);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "nf.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new ko();
        field_db = "You and <%0> have won!";
    }
}
