/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends anb implements ntb, utb {
    private int[] field_x;
    private int field_P;
    private int field_G;
    private boolean field_y;
    private int field_A;
    private boolean field_R;
    private qua field_L;
    private boa field_S;
    private int field_N;
    static int field_H;
    private int field_u;
    static int field_E;
    private int field_M;
    private int field_v;
    boolean field_T;
    private int field_Q;
    private boolean field_K;
    private int field_F;
    boolean field_D;
    private int field_I;
    private int[] field_J;
    private int field_C;
    private boolean field_O;
    boolean field_w;
    private aoa field_z;

    final void g(int param0, int param1) {
        int var3 = -108 % ((param1 - 35) / 49);
        ((sg) this).field_Q = param0;
    }

    public final void a(faa param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, 32);
              ((sg) this).field_Q = param0.i(0, 32);
              ((sg) this).field_N = param0.i(param1 ^ 32, 32);
              ((sg) this).field_u = param0.i(param1 + -32, 32);
              if (!kv.a(false, param0)) {
                ((sg) this).field_z = null;
                break L1;
              } else {
                L2: {
                  if (((sg) this).field_z != null) {
                    break L2;
                  } else {
                    ((sg) this).field_z = new aoa();
                    break L2;
                  }
                }
                ((sg) this).field_z.a(param0, false);
                break L1;
              }
            }
            L3: {
              ((sg) this).field_P = param0.i(0, 32);
              ((sg) this).field_I = param0.i(0, 32);
              ((sg) this).field_C = param0.i(0, 32);
              ((sg) this).field_G = param0.i(0, 32);
              ((sg) this).field_y = kv.a(false, param0);
              ((sg) this).field_K = kv.a(false, param0);
              ((sg) this).field_O = kv.a(false, param0);
              ((sg) this).field_M = param0.i(0, param1);
              ((sg) this).field_T = kv.a(false, param0);
              ((sg) this).field_w = kv.a(false, param0);
              ((sg) this).field_R = kv.a(false, param0);
              ((sg) this).field_v = param0.i(0, 32);
              ((sg) this).field_J = wkb.a((byte) 37, ((sg) this).field_J, param0, 4);
              if (!kv.a(false, param0)) {
                ((sg) this).field_S = null;
                break L3;
              } else {
                L4: {
                  if (((sg) this).field_S == null) {
                    ((sg) this).field_S = new boa();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((sg) this).field_S.a(param0, false);
                break L3;
              }
            }
            ((sg) this).field_F = param0.i(0, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("sg.L(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final boolean q(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -6) {
            break L0;
          } else {
            ((sg) this).field_x = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((sg) this).field_y) {
              break L2;
            } else {
              if (oq.field_I != ((sg) this).field_G) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0, boa param1) {
        try {
            int var3_int = -32 % ((-79 - param0) / 42);
            ((sg) this).field_S = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int w(int param0) {
        if (param0 <= 36) {
            ((sg) this).field_x = null;
        }
        return ((sg) this).field_G;
    }

    final boolean s(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 31) {
            break L0;
          } else {
            var3 = null;
            ((sg) this).a((aoa) null, -101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (1 == vqa.field_k) {
              break L2;
            } else {
              if (((sg) this).g(false)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int[] param0, int param1) {
        if (param1 >= -7) {
            return;
        }
        try {
            ((sg) this).field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(qua param0, int param1) {
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
              ((sg) this).field_L = param0;
              if (param1 == 3) {
                break L1;
              } else {
                int discarded$2 = ((sg) this).o((byte) -104);
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
            stackOut_3_1 = new StringBuilder().append("sg.ID(");
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean j(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((param0 - 49) / 42);
            if (((sg) this).field_z != null) {
              break L1;
            } else {
              if (((sg) this).field_F >= oq.field_A) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean n(int param0) {
        if (param0 != 31390) {
            int[] discarded$0 = ((sg) this).A(125);
        }
        return ((sg) this).field_R;
    }

    final int d(int param0) {
        if (param0 < 42) {
            field_H = -63;
            return 1;
        }
        return 1;
    }

    final void e(byte param0) {
        super.e(param0);
        ((sg) this).field_C = jo.field_e + ((sg) this).field_k.a(0);
    }

    final boolean r(byte param0) {
        if (param0 >= -83) {
            return false;
        }
        return ((sg) this).field_K;
    }

    final boolean s(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -90) {
            break L0;
          } else {
            boolean discarded$2 = ((sg) this).r((byte) -68);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sg) this).field_P > 0) {
              break L2;
            } else {
              if (((sg) this).field_I <= 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void m(int param0) {
        if (param0 != -13539) {
            return;
        }
        if (((sg) this).field_v > 0) {
        } else {
            ((sg) this).field_R = !((sg) this).field_R ? true : false;
            ((sg) this).field_v = pca.field_i[3].d((byte) 64);
            ((sg) this).d((byte) 39);
            if (!((sg) this).field_R) {
                qba.a(20382, ((sg) this).d(false), 25, ((sg) this).g((byte) -3), 50);
            } else {
                qba.a(20382, ((sg) this).d(false), 26, ((sg) this).g((byte) -71), 50);
            }
        }
    }

    private final void B(int param0) {
        ((sg) this).field_J = null;
    }

    final void a(boolean param0, pe param1) {
        try {
            if (!param0) {
                Object var4 = null;
                boolean discarded$0 = ((sg) this).a((byte) 18, (tv) null);
            }
            boolean discarded$1 = ((sg) this).field_z.a((sg) this, (byte) -73, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        if (0 <= ((sg) this).field_Q) {
            if (!(fwa.a(param0, 1, ((sg) this).field_J))) {
                ((sg) this).field_J = qi.a(param0, true, ((sg) this).field_J, (byte) -14);
            }
        }
        if (param1 != 19581) {
            ((sg) this).field_M = 18;
        }
    }

    final boolean b(int param0, byte param1) {
        int var3 = -67 % ((param1 - -53) / 48);
        return (((sg) this).field_A & param0) != 0 ? true : false;
    }

    final int y(int param0) {
        if (param0 != 8) {
            ((sg) this).field_z = null;
        }
        return -oq.field_e + ((sg) this).field_M;
    }

    final int q(byte param0) {
        if (param0 <= 63) {
            ((sg) this).u(39);
        }
        return ((sg) this).field_N;
    }

    final boa n(byte param0) {
        if (param0 != 28) {
            int discarded$0 = ((sg) this).l(45);
        }
        return ((sg) this).field_S;
    }

    final void a(ij param0, int param1, boolean param2, boolean param3) {
        try {
            if (param1 != 9) {
                Object var6 = null;
                ((sg) this).a((qua) null, 93);
            }
            if (1 == era.field_p) {
                param0.b(param1 ^ -10265, (ksa) (Object) new ihb(4, ((sg) this).field_y ? 2 : 0));
            } else {
                param0.b(param1 + -10267, (ksa) (Object) new ihb(4, ((sg) this).field_G));
            }
            if (!param2) {
                if (!param3) {
                    if (!((sg) this).field_O) {
                        param0.b(param1 ^ -10265, (ksa) (Object) new ihb(8, 0));
                    }
                    if (!(!((sg) this).field_K)) {
                        param0.b(-10258, (ksa) (Object) new ihb(9, ((sg) this).field_M));
                    }
                }
            }
            ((sg) this).field_k.a(param0, (sg) this, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.LC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int c(int param0, byte param1) {
        int var3 = ((sg) this).field_k.g(param0, param1 + 5);
        if (param1 != -2) {
            Object var4 = null;
            ((sg) this).a(false, (pe) null);
        }
        if (var3 > 0) {
            this.B(-128);
        }
        return var3;
    }

    final void r(int param0) {
        ((sg) this).field_F = oq.field_A;
        if (param0 != -2) {
            Object var3 = null;
            ((sg) this).a((int[]) null, 59);
        }
    }

    final void a(boolean param0, lta param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
            var4_int = ((sg) this).t(0);
            var5 = (int)((float)tu.field_d * param1.field_a);
            if (var5 < 8) {
                var5 = 8;
            }
            var6 = (int)((float)lua.field_d * param1.field_a);
            if (!(1 <= var6)) {
                var6 = 1;
            }
            if (param2 != 32) {
                ((sg) this).field_D = false;
            }
            var7 = (((sg) this).f((byte) -23)[0] + ((sg) this).f((byte) -46)[1]) / 2;
            var8 = param1.a(var7, (byte) 117) + -(var5 / 2);
            var9 = param1.b(true, ((sg) this).f((byte) -94)[2]) + -(4 * var6);
            nhb.a(qpb.a(false, ((sg) this).field_N, param2 ^ 13894111), var4_int, var9, var6, param0, var5, var8, 2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.NC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        sg var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        boolean stackIn_29_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_31_0 = false;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        boolean stackIn_42_0 = false;
        boolean stackIn_43_0 = false;
        boolean stackIn_44_0 = false;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        boolean stackOut_28_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_30_1 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_29_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        boolean stackOut_41_0 = false;
        boolean stackOut_43_0 = false;
        int stackOut_43_1 = 0;
        boolean stackOut_42_0 = false;
        int stackOut_42_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -46 % ((param0 - 22) / 59);
                var5 = (sg) (Object) param1;
                if (super.a((byte) -43, param1)) {
                  break L2;
                } else {
                  if (var5.field_Q != ((sg) this).field_Q) {
                    break L2;
                  } else {
                    if (((sg) this).field_N != var5.field_N) {
                      break L2;
                    } else {
                      if (((sg) this).field_u != var5.field_u) {
                        break L2;
                      } else {
                        L3: {
                          if (null != var5.field_z) {
                            stackOut_6_0 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            break L3;
                          } else {
                            stackOut_5_0 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            break L3;
                          }
                        }
                        L4: {
                          stackOut_7_0 = stackIn_7_0;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (((sg) this).field_z != null) {
                            stackOut_9_0 = stackIn_9_0;
                            stackOut_9_1 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L4;
                          } else {
                            stackOut_8_0 = stackIn_8_0;
                            stackOut_8_1 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L4;
                          }
                        }
                        if ((stackIn_10_0 ^ stackIn_10_1) != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (null == ((sg) this).field_z) {
                              break L5;
                            } else {
                              if (((sg) this).field_z.a((byte) -43, (tv) (Object) var5.field_z)) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (((sg) this).field_P != var5.field_P) {
                            break L2;
                          } else {
                            if (((sg) this).field_I != var5.field_I) {
                              break L2;
                            } else {
                              if (var5.field_G != ((sg) this).field_G) {
                                break L2;
                              } else {
                                L6: {
                                  if (((sg) this).field_y) {
                                    stackOut_19_0 = 0;
                                    stackIn_20_0 = stackOut_19_0;
                                    break L6;
                                  } else {
                                    stackOut_18_0 = 1;
                                    stackIn_20_0 = stackOut_18_0;
                                    break L6;
                                  }
                                }
                                if (stackIn_20_0 == (var5.field_y ? 1 : 0)) {
                                  break L2;
                                } else {
                                  L7: {
                                    if (((sg) this).field_K) {
                                      stackOut_23_0 = 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      break L7;
                                    } else {
                                      stackOut_22_0 = 1;
                                      stackIn_24_0 = stackOut_22_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    stackOut_24_0 = stackIn_24_0;
                                    stackIn_26_0 = stackOut_24_0;
                                    stackIn_25_0 = stackOut_24_0;
                                    if (var5.field_K) {
                                      stackOut_26_0 = stackIn_26_0;
                                      stackOut_26_1 = 0;
                                      stackIn_27_0 = stackOut_26_0;
                                      stackIn_27_1 = stackOut_26_1;
                                      break L8;
                                    } else {
                                      stackOut_25_0 = stackIn_25_0;
                                      stackOut_25_1 = 1;
                                      stackIn_27_0 = stackOut_25_0;
                                      stackIn_27_1 = stackOut_25_1;
                                      break L8;
                                    }
                                  }
                                  if (stackIn_27_0 != stackIn_27_1) {
                                    break L2;
                                  } else {
                                    L9: {
                                      stackOut_28_0 = ((sg) this).field_O;
                                      stackIn_30_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (var5.field_O) {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 0;
                                        stackIn_31_0 = stackOut_30_0;
                                        stackIn_31_1 = stackOut_30_1;
                                        break L9;
                                      } else {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = 1;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_31_1 = stackOut_29_1;
                                        break L9;
                                      }
                                    }
                                    if ((stackIn_31_0 ? 1 : 0) == stackIn_31_1) {
                                      break L2;
                                    } else {
                                      if (var5.field_M != ((sg) this).field_M) {
                                        break L2;
                                      } else {
                                        L10: {
                                          if (var5.field_T) {
                                            stackOut_35_0 = 0;
                                            stackIn_36_0 = stackOut_35_0;
                                            break L10;
                                          } else {
                                            stackOut_34_0 = 1;
                                            stackIn_36_0 = stackOut_34_0;
                                            break L10;
                                          }
                                        }
                                        if (stackIn_36_0 == (((sg) this).field_T ? 1 : 0)) {
                                          break L2;
                                        } else {
                                          L11: {
                                            if (((sg) this).field_w) {
                                              stackOut_39_0 = 0;
                                              stackIn_40_0 = stackOut_39_0;
                                              break L11;
                                            } else {
                                              stackOut_38_0 = 1;
                                              stackIn_40_0 = stackOut_38_0;
                                              break L11;
                                            }
                                          }
                                          if (stackIn_40_0 == (var5.field_w ? 1 : 0)) {
                                            break L2;
                                          } else {
                                            L12: {
                                              stackOut_41_0 = ((sg) this).field_R;
                                              stackIn_43_0 = stackOut_41_0;
                                              stackIn_42_0 = stackOut_41_0;
                                              if (var5.field_R) {
                                                stackOut_43_0 = stackIn_43_0;
                                                stackOut_43_1 = 0;
                                                stackIn_44_0 = stackOut_43_0;
                                                stackIn_44_1 = stackOut_43_1;
                                                break L12;
                                              } else {
                                                stackOut_42_0 = stackIn_42_0;
                                                stackOut_42_1 = 1;
                                                stackIn_44_0 = stackOut_42_0;
                                                stackIn_44_1 = stackOut_42_1;
                                                break L12;
                                              }
                                            }
                                            if ((stackIn_44_0 ? 1 : 0) == stackIn_44_1) {
                                              break L2;
                                            } else {
                                              if (((sg) this).field_v != var5.field_v) {
                                                break L2;
                                              } else {
                                                if (wpb.a(var5.field_J, ((sg) this).field_J, (byte) 28)) {
                                                  break L2;
                                                } else {
                                                  L13: {
                                                    if (var5.field_S != null) {
                                                      stackOut_49_0 = 0;
                                                      stackIn_50_0 = stackOut_49_0;
                                                      break L13;
                                                    } else {
                                                      stackOut_48_0 = 1;
                                                      stackIn_50_0 = stackOut_48_0;
                                                      break L13;
                                                    }
                                                  }
                                                  L14: {
                                                    stackOut_50_0 = stackIn_50_0;
                                                    stackIn_52_0 = stackOut_50_0;
                                                    stackIn_51_0 = stackOut_50_0;
                                                    if (((sg) this).field_S != null) {
                                                      stackOut_52_0 = stackIn_52_0;
                                                      stackOut_52_1 = 0;
                                                      stackIn_53_0 = stackOut_52_0;
                                                      stackIn_53_1 = stackOut_52_1;
                                                      break L14;
                                                    } else {
                                                      stackOut_51_0 = stackIn_51_0;
                                                      stackOut_51_1 = 1;
                                                      stackIn_53_0 = stackOut_51_0;
                                                      stackIn_53_1 = stackOut_51_1;
                                                      break L14;
                                                    }
                                                  }
                                                  if ((stackIn_53_0 ^ stackIn_53_1) != 0) {
                                                    break L2;
                                                  } else {
                                                    L15: {
                                                      if (null == ((sg) this).field_S) {
                                                        break L15;
                                                      } else {
                                                        if (((sg) this).field_S.a((byte) -92, (tv) (Object) var5.field_S)) {
                                                          break L2;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    if (var5.field_F == ((sg) this).field_F) {
                                                      stackOut_60_0 = 0;
                                                      stackIn_61_0 = stackOut_60_0;
                                                      break L1;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_59_0 = 1;
              stackIn_61_0 = stackOut_59_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var3;
            stackOut_62_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ')');
        }
        return stackIn_61_0 != 0;
    }

    final int x(int param0) {
        int var2 = 10 / ((-20 - param0) / 55);
        return ((sg) this).field_u;
    }

    final qua p(byte param0) {
        if (param0 != 49) {
            int discarded$0 = ((sg) this).t(-25);
        }
        return ((sg) this).field_L;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, false);
              ((sg) this).field_Q = param0.i(0, 32);
              ((sg) this).field_N = param0.i(0, 32);
              ((sg) this).field_u = param0.i(0, 32);
              if (!kv.a(false, param0)) {
                ((sg) this).field_z = null;
                break L1;
              } else {
                L2: {
                  if (null != ((sg) this).field_z) {
                    break L2;
                  } else {
                    ((sg) this).field_z = new aoa();
                    break L2;
                  }
                }
                ((sg) this).field_z.a(param0, false);
                break L1;
              }
            }
            L3: {
              ((sg) this).field_P = param0.i(0, 32);
              ((sg) this).field_I = param0.i(0, 32);
              ((sg) this).field_G = param0.i(0, 32);
              ((sg) this).field_y = kv.a(param1, param0);
              ((sg) this).field_K = kv.a(false, param0);
              ((sg) this).field_O = kv.a(param1, param0);
              ((sg) this).field_M = param0.i(0, 32);
              ((sg) this).field_T = kv.a(false, param0);
              ((sg) this).field_w = kv.a(false, param0);
              ((sg) this).field_R = kv.a(false, param0);
              ((sg) this).field_v = param0.i(0, 32);
              ((sg) this).field_J = wkb.a((byte) 37, ((sg) this).field_J, param0, 4);
              if (!kv.a(false, param0)) {
                ((sg) this).field_S = null;
                break L3;
              } else {
                L4: {
                  if (((sg) this).field_S != null) {
                    break L4;
                  } else {
                    ((sg) this).field_S = new boa();
                    break L4;
                  }
                }
                ((sg) this).field_S.a(param0, false);
                break L3;
              }
            }
            ((sg) this).field_F = param0.i(0, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("sg.H(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final int o(byte param0) {
        if (param0 != -117) {
            field_H = -115;
        }
        return ((sg) this).field_Q;
    }

    final boolean a(pe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ml[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        ml[] var17 = null;
        ml[] var18 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            if (!((sg) this).d(4, 67)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              ((sg) this).field_k.i(param3 + 110);
              ((sg) this).a(param0, true, (byte) 67, true);
              if (((sg) this).q(-107)) {
                L1: {
                  if (param3 == 0) {
                    break L1;
                  } else {
                    boolean discarded$1 = ((sg) this).n(-12);
                    break L1;
                  }
                }
                L2: {
                  var17 = ((sg) this).field_k.a((byte) 101, param1, nw.field_o, (ml[]) null, param2);
                  var18 = var17;
                  var5_array = var18;
                  var6 = 1;
                  if (var5_array == null) {
                    break L2;
                  } else {
                    if (var17.length > 0) {
                      var7 = -1;
                      var8 = 0;
                      L3: while (true) {
                        L4: {
                          if (var17.length <= var8) {
                            break L4;
                          } else {
                            if (var17[var8] != ((sg) this).field_k) {
                              var8++;
                              continue L3;
                            } else {
                              var7 = var8;
                              break L4;
                            }
                          }
                        }
                        var8 = wda.field_p / var18.length;
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= var18.length) {
                            L6: {
                              if (var10 == 0) {
                                break L6;
                              } else {
                                rmb.a(param2, ((sg) this).field_l, 73, 102, param1);
                                var6 = 0;
                                break L6;
                              }
                            }
                            if (var10 == 0) {
                              break L2;
                            } else {
                              if (0 != kdb.field_o % 80) {
                                break L2;
                              } else {
                                qba.a(20382, param1, 19, param2, 20);
                                break L2;
                              }
                            }
                          } else {
                            L7: {
                              var12 = var18[var11];
                              var13 = var8 - -var9;
                              if (var11 != var7) {
                                var9 = var12.a(true, false, var13);
                                break L7;
                              } else {
                                var14 = var8 / 4;
                                var9 = var13 - var14 + var12.a(true, false, var14);
                                break L7;
                              }
                            }
                            L8: {
                              var14 = -var9 + var13;
                              if (var14 <= 0) {
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var11++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                L9: {
                  if (var6 == 0) {
                    break L9;
                  } else {
                    rmb.a(param2, ((sg) this).field_l, 72, -72, param1);
                    break L9;
                  }
                }
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var5;
            stackOut_35_1 = new StringBuilder().append("sg.HC(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final void a(pe param0, boolean param1, byte param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (((sg) this).field_P > 0) {
                break L1;
              } else {
                ((sg) this).field_I = ((sg) this).field_I + 1;
                break L1;
              }
            }
            L2: {
              ((sg) this).field_F = ((sg) this).field_F + 1;
              if (((sg) this).field_D) {
                ((sg) this).field_D = false;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (vdb.field_d <= ((sg) this).field_I) {
                ((sg) this).field_I = 0;
                ((sg) this).field_P = ((sg) this).f(true);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((sg) this).field_P <= 0) {
                break L4;
              } else {
                ((sg) this).field_P = ((sg) this).field_P + sja.field_b;
                if (~((sg) this).field_P >= ~((sg) this).f(true)) {
                  break L4;
                } else {
                  ((sg) this).field_P = ((sg) this).f(true);
                  break L4;
                }
              }
            }
            L5: {
              if (!((sg) this).field_O) {
                break L5;
              } else {
                if (0 >= ((sg) this).field_M) {
                  break L5;
                } else {
                  ((sg) this).field_M = ((sg) this).field_M - 1;
                  break L5;
                }
              }
            }
            L6: {
              if (era.field_p != 1) {
                if (((sg) this).field_G <= 0) {
                  break L6;
                } else {
                  ((sg) this).field_G = ((sg) this).field_G - 1;
                  break L6;
                }
              } else {
                L7: {
                  if (!((sg) this).field_y) {
                    break L7;
                  } else {
                    if (~((sg) this).field_G <= ~oq.field_I) {
                      break L7;
                    } else {
                      ((sg) this).field_G = ((sg) this).field_G + 1;
                      break L7;
                    }
                  }
                }
                if (((sg) this).field_y) {
                  break L6;
                } else {
                  if (((sg) this).field_G > 0) {
                    ((sg) this).field_G = ((sg) this).field_G - 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L8: {
              if (!((sg) this).field_O) {
                break L8;
              } else {
                if (((sg) this).field_M > oq.field_e) {
                  break L8;
                } else {
                  boolean discarded$1 = ((sg) this).field_k.a(400, param2 + -20, param0, (anb) this);
                  break L8;
                }
              }
            }
            L9: {
              if (((sg) this).field_v <= 0) {
                break L9;
              } else {
                ((sg) this).field_v = ((sg) this).field_v - 1;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("sg.SA(");
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
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        sg var6 = null;
        sg var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = (sg) (Object) param1;
              var7 = var6;
              super.b((byte) 89, param1);
              var6.field_Q = ((sg) this).field_Q;
              var6.field_N = ((sg) this).field_N;
              var6.field_u = ((sg) this).field_u;
              if (((sg) this).field_z != null) {
                L2: {
                  if (null == var7.field_z) {
                    var7.field_z = new aoa();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((sg) this).field_z.b((byte) 103, (tv) (Object) var7.field_z);
                break L1;
              } else {
                var6.field_z = null;
                break L1;
              }
            }
            L3: {
              var7.field_v = ((sg) this).field_v;
              var7.field_R = ((sg) this).field_R;
              var7.field_y = ((sg) this).field_y;
              var7.field_M = ((sg) this).field_M;
              var7.field_O = ((sg) this).field_O;
              var7.field_T = ((sg) this).field_T;
              var7.field_C = ((sg) this).field_C;
              var7.field_P = ((sg) this).field_P;
              var7.field_I = ((sg) this).field_I;
              var7.field_G = ((sg) this).field_G;
              var7.field_K = ((sg) this).field_K;
              var7.field_w = ((sg) this).field_w;
              if (param0 > 54) {
                break L3;
              } else {
                var5 = null;
                ((sg) this).b((faa) null, -85);
                break L3;
              }
            }
            L4: {
              var7.field_J = dob.a(var7.field_J, (byte) -102, ((sg) this).field_J);
              if (((sg) this).field_S != null) {
                L5: {
                  if (null == var7.field_S) {
                    var7.field_S = new boa();
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((sg) this).field_S.b((byte) 89, (tv) (Object) var7.field_S);
                break L4;
              } else {
                var7.field_S = null;
                break L4;
              }
            }
            var7.field_F = ((sg) this).field_F;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("sg.D(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    final void f(int param0, int param1) {
        ((sg) this).field_A = ((sg) this).field_A | param1;
        if (param0 != 0) {
            boolean discarded$0 = ((sg) this).l((byte) -73);
        }
    }

    final void a(aoa param0, int param1) {
        try {
            if (param1 != 4) {
                int discarded$0 = ((sg) this).w(105);
            }
            ((sg) this).field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sg.MC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int t(int param0) {
        int[] var5 = new int[2];
        int[] var2 = var5;
        ((sg) this).field_k.a(var5, (byte) -17, true);
        int var3 = var5[0] * 256 / var5[1];
        var5[1] = param0;
        var5[0] = 0;
        ((sg) this).field_k.a(var5, (byte) -17, false);
        int var4 = 256 * var5[0] / var5[1];
        if (var4 < var3) {
            var3 = var4;
        }
        return var3;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              super.b(param0, -118);
              param0.a(-632, ((sg) this).field_Q, 32);
              if (param1 < -109) {
                break L1;
              } else {
                boolean discarded$7 = ((sg) this).s((byte) -86);
                break L1;
              }
            }
            L2: {
              param0.a(-632, ((sg) this).field_N, 32);
              param0.a(-632, ((sg) this).field_u, 32);
              stackOut_2_0 = (faa) param0;
              stackOut_2_1 = -76;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((sg) this).field_z == null) {
                stackOut_4_0 = (faa) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            L3: {
              if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 == 0)) {
                break L3;
              } else {
                ((sg) this).field_z.b(param0, -113);
                break L3;
              }
            }
            L4: {
              param0.a(-632, ((sg) this).field_P, 32);
              param0.a(-632, ((sg) this).field_I, 32);
              param0.a(-632, ((sg) this).field_G, 32);
              boolean discarded$8 = vq.a(param0, 81, ((sg) this).field_y);
              boolean discarded$9 = vq.a(param0, 47, ((sg) this).field_K);
              boolean discarded$10 = vq.a(param0, 82, ((sg) this).field_O);
              param0.a(-632, ((sg) this).field_M, 32);
              boolean discarded$11 = vq.a(param0, 70, ((sg) this).field_T);
              boolean discarded$12 = vq.a(param0, -121, ((sg) this).field_w);
              boolean discarded$13 = vq.a(param0, 104, ((sg) this).field_R);
              param0.a(-632, ((sg) this).field_v, 32);
              stackOut_7_0 = 4;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (((sg) this).field_J != null) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = ((sg) this).field_J.length;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L4;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L4;
              }
            }
            L5: {
              pgb.a(stackIn_10_0, stackIn_10_1, -125, param0, ((sg) this).field_J);
              stackOut_10_0 = (faa) param0;
              stackOut_10_1 = 78;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (null == ((sg) this).field_S) {
                stackOut_12_0 = (faa) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L5;
              } else {
                stackOut_11_0 = (faa) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                ((sg) this).field_S.b(param0, -116);
                break L6;
              } else {
                break L6;
              }
            }
            param0.a(-632, ((sg) this).field_F, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("sg.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final boolean d(int param0, int param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 > 38) {
            break L0;
          } else {
            var4 = null;
            ((sg) this).b((byte) -22, (tv) null);
            break L0;
          }
        }
        if (param0 != 4) {
          if (param0 != 9) {
            return false;
          } else {
            return ((sg) this).field_O;
          }
        } else {
          if (era.field_p == 1) {
            L1: {
              L2: {
                if (((sg) this).field_y) {
                  break L2;
                } else {
                  if (((sg) this).field_G <= 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
            return stackIn_13_0 != 0;
          } else {
            L3: {
              if (((sg) this).field_G <= pca.field_i[4].d((byte) 64)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L3;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final void z(int param0) {
        if (param0 < 77) {
            Object var3 = null;
            ((sg) this).b((faa) null, -12);
        }
        ((sg) this).field_A = 0;
    }

    final int l(int param0) {
        if (param0 != -465) {
            ((sg) this).field_P = -114;
        }
        return ((sg) this).field_v;
    }

    final int[] p(int param0) {
        if (param0 != -26448) {
            return null;
        }
        return ((sg) this).field_J;
    }

    final void a(int param0, byte param1) {
        ((sg) this).field_u = param0;
        if (param1 > -48) {
            field_E = 125;
        }
    }

    final void h(int param0, int param1) {
        if (param0 != 17704) {
            aoa discarded$0 = ((sg) this).k((byte) -15);
        }
        ((sg) this).field_N = param1;
    }

    final boolean v(int param0) {
        if (param0 != 32) {
            return false;
        }
        return ((sg) this).field_y;
    }

    final int[] A(int param0) {
        if (param0 < 21) {
            int discarded$0 = ((sg) this).y(-71);
        }
        return ((sg) this).field_x;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != 11) {
            return false;
        }
        if (((sg) this).field_P > 0) {
            ((sg) this).field_P = ((sg) this).field_P - param1;
            ((sg) this).d((byte) -126);
            return true;
        }
        return false;
    }

    final void u(int param0) {
        ((sg) this).field_k.f(14546);
        if (!(era.field_p != 1)) {
            ((sg) this).field_G = 0;
            ((sg) this).field_y = false;
        }
        int var2 = 90 / ((72 - param0) / 44);
    }

    public final void a(faa param0, byte param1) {
        RuntimeException var3 = null;
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -107);
              param0.a(-632, ((sg) this).field_Q, 32);
              param0.a(-632, ((sg) this).field_N, 32);
              param0.a(-632, ((sg) this).field_u, 32);
              stackOut_0_0 = (faa) param0;
              stackOut_0_1 = -128;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (null == ((sg) this).field_z) {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (faa) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                ((sg) this).field_z.b(param0, -116);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              param0.a(-632, ((sg) this).field_P, 32);
              param0.a(-632, ((sg) this).field_I, 32);
              param0.a(-632, ((sg) this).field_C, 32);
              param0.a(-632, ((sg) this).field_G, 32);
              boolean discarded$7 = vq.a(param0, -73, ((sg) this).field_y);
              boolean discarded$8 = vq.a(param0, 90, ((sg) this).field_K);
              boolean discarded$9 = vq.a(param0, 113, ((sg) this).field_O);
              param0.a(-632, ((sg) this).field_M, 32);
              boolean discarded$10 = vq.a(param0, -92, ((sg) this).field_T);
              boolean discarded$11 = vq.a(param0, 107, ((sg) this).field_w);
              boolean discarded$12 = vq.a(param0, -102, ((sg) this).field_R);
              param0.a(-632, ((sg) this).field_v, 32);
              stackOut_6_0 = 4;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (((sg) this).field_J == null) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = ((sg) this).field_J.length;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              pgb.a(stackIn_9_0, stackIn_9_1, -90, param0, ((sg) this).field_J);
              if (param1 <= -91) {
                break L4;
              } else {
                boolean discarded$13 = ((sg) this).s(57);
                break L4;
              }
            }
            L5: {
              stackOut_11_0 = (faa) param0;
              stackOut_11_1 = 101;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (null == ((sg) this).field_S) {
                stackOut_13_0 = (faa) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L5;
              } else {
                stackOut_12_0 = (faa) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L5;
              }
            }
            L6: {
              if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 == 0)) {
                break L6;
              } else {
                ((sg) this).field_S.b(param0, -118);
                break L6;
              }
            }
            param0.a(-632, ((sg) this).field_F, 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("sg.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final void t(byte param0) {
        int var2 = ((sg) this).a((byte) 11, fna.field_p * (-fra.field_a + 1)) ? 1 : 0;
        int var3 = 85 % ((47 - param0) / 51);
        if (!(var2 != 0)) {
            ((sg) this).field_R = false;
            ((sg) this).d((byte) 124);
            return;
        }
    }

    final int m(byte param0) {
        if (param0 != -64) {
            return 120;
        }
        return ((sg) this).field_I * 255 / Math.max(vdb.field_d, 1);
    }

    final int o(int param0) {
        int var2 = -44 / ((param0 - 33) / 44);
        return 255 * ((sg) this).field_P / Math.max(((sg) this).f(true), 1);
    }

    final void e(int param0, int param1) {
        if (!((sg) this).s((byte) -90)) {
            if (!(((sg) this).field_P <= 0)) {
                ((sg) this).field_P = ((sg) this).field_P + param1;
                if (!(((sg) this).field_P <= ((sg) this).f(true))) {
                    ((sg) this).field_P = ((sg) this).f(true);
                }
            }
        }
        if (param0 != -1) {
            ((sg) this).field_M = 49;
        }
    }

    final void a(lta param0, int param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = qpb.a(false, ((sg) this).field_N, 13894143);
              if (!((sg) this).j((byte) 108)) {
                break L1;
              } else {
                L2: {
                  var5 = ((sg) this).b(true);
                  if (var5 <= 0) {
                    break L2;
                  } else {
                    var5 = oq.field_A * var5 / (1 + ((sg) this).field_F);
                    var6 = 256;
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= 5) {
                        break L2;
                      } else {
                        var8 = ((sg) this).field_F * ((var7 << 4) + var6);
                        var9 = ((sg) this).field_d - -((fc.a(var8, (byte) 74) >> 8) * (var5 >> 8));
                        var10 = ((sg) this).field_e + (eu.a(var8, 77) >> 8) * (var5 >> 8);
                        var11 = ((sg) this).field_d - -((fc.a(var8 + var6, (byte) -73) >> 8) * (var5 >> 8));
                        var12 = ((sg) this).field_e + (var5 >> 8) * (eu.a(var6 + var8, 56) >> 8);
                        c.a(param0.b(true, var12), param0.a(var11, (byte) 122), param0.a(var9, (byte) 116), param0.b(true, var10), -16777216, var4_int);
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
                if ((((sg) this).field_F & 8) == 0) {
                  break L1;
                } else {
                  var4_int = var4_int ^ 4473924;
                  break L1;
                }
              }
            }
            L4: {
              super.a(param0, var4_int, param2, 16);
              if (param1 >= 119) {
                break L4;
              } else {
                ((sg) this).field_z = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("sg.P(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final aoa k(byte param0) {
        if (param0 != -108) {
            int discarded$0 = ((sg) this).q((byte) -110);
        }
        return ((sg) this).field_z;
    }

    final boolean l(byte param0) {
        if (param0 != -10) {
            int discarded$0 = ((sg) this).q((byte) 25);
        }
        return null != ((sg) this).field_z ? true : false;
    }

    final void a(int param0, int param1, pe param2, int param3, int param4) {
        RuntimeException var6 = null;
        uj var7 = null;
        uj var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              super.a(-53, param1, param2, param3, param4);
              if (param1 == 4) {
                if (era.field_p != 1) {
                  if (((sg) this).field_G > 0) {
                    break L1;
                  } else {
                    var7 = pca.field_i[4];
                    var8 = var7;
                    var8 = var7;
                    ((sg) this).field_G = var7.d((byte) 64) - -var7.b(-25131);
                    break L1;
                  }
                } else {
                  L2: {
                    stackOut_3_0 = this;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (((sg) this).field_y) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L2;
                    }
                  }
                  ((sg) this).field_y = stackIn_6_1 != 0;
                  ((sg) this).field_u = -1;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 != 8) {
                break L3;
              } else {
                if (!((sg) this).field_O) {
                  L4: {
                    stackOut_12_0 = this;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((sg) this).field_K) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  ((sg) this).field_K = stackIn_15_1 != 0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (param1 == 9) {
                if (!((sg) this).field_K) {
                  break L5;
                } else {
                  if (!((sg) this).field_O) {
                    ((sg) this).field_O = true;
                    var8 = pca.field_i[9];
                    ((sg) this).field_M = var8.d((byte) 64) - -var8.b(-25131);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 <= -36) {
                break L6;
              } else {
                ((sg) this).field_G = -108;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("sg.WA(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean g(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((sg) this).r((byte) -85);
        }
        return ((sg) this).field_k.field_j == 0 ? true : false;
    }

    final int f(boolean param0) {
        if (!param0) {
            return 10;
        }
        return ((sg) this).field_C;
    }

    final void C(int param0) {
        ((sg) this).field_F = 0;
        ((sg) this).field_D = true;
        if (param0 != 32) {
            Object var3 = null;
            ((sg) this).a((faa) null, true);
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        sg var5 = null;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_39_0 = false;
        boolean stackIn_40_0 = false;
        boolean stackIn_41_0 = false;
        int stackIn_41_1 = 0;
        boolean stackIn_44_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_49_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_51_0 = false;
        int stackIn_51_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        boolean stackOut_38_0 = false;
        boolean stackOut_40_0 = false;
        int stackOut_40_1 = 0;
        boolean stackOut_39_0 = false;
        int stackOut_39_1 = 0;
        boolean stackOut_43_0 = false;
        boolean stackOut_45_0 = false;
        int stackOut_45_1 = 0;
        boolean stackOut_44_0 = false;
        int stackOut_44_1 = 0;
        boolean stackOut_48_0 = false;
        boolean stackOut_50_0 = false;
        int stackOut_50_1 = 0;
        boolean stackOut_49_0 = false;
        int stackOut_49_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -85);
              var5 = (sg) (Object) param0;
              if (null == ((sg) this).field_z) {
                break L1;
              } else {
                if (null != var5.field_z) {
                  ((sg) this).field_z.a((tv) (Object) var5.field_z, -49);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((sg) this).field_S == null) {
                break L2;
              } else {
                if (null != var5.field_S) {
                  ((sg) this).field_S.a((tv) (Object) var5.field_S, -54);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var4 = 0;
              if (((sg) this).field_Q == var5.field_Q) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int owner has changed. before=" + var5.field_Q + ", now=" + ((sg) this).field_Q);
                break L3;
              }
            }
            L4: {
              if (((sg) this).field_N != var5.field_N) {
                System.out.println("int team has changed. before=" + var5.field_N + ", now=" + ((sg) this).field_N);
                var4 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var5.field_u != ((sg) this).field_u) {
                System.out.println("int dragging has changed. before=" + var5.field_u + ", now=" + ((sg) this).field_u);
                var4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null != ((sg) this).field_z) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L6;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L6;
              }
            }
            L7: {
              stackOut_19_0 = stackIn_19_0;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (null != var5.field_z) {
                stackOut_21_0 = stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L7;
              } else {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L7;
              }
            }
            L8: {
              L9: {
                if ((stackIn_22_0 ^ stackIn_22_1) != 0) {
                  break L9;
                } else {
                  if (((sg) this).field_z == null) {
                    break L8;
                  } else {
                    if (((sg) this).field_z.a((byte) 89, (tv) (Object) var5.field_z)) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("ShipAI ai has changed. before=" + (Object) (Object) var5.field_z + ", now=" + (Object) (Object) ((sg) this).field_z);
              break L8;
            }
            L10: {
              if (var5.field_P == ((sg) this).field_P) {
                break L10;
              } else {
                System.out.println("int energy has changed. before=" + var5.field_P + ", now=" + ((sg) this).field_P);
                var4 = 1;
                break L10;
              }
            }
            L11: {
              if (var5.field_I != ((sg) this).field_I) {
                System.out.println("int reloadtimer has changed. before=" + var5.field_I + ", now=" + ((sg) this).field_I);
                var4 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((sg) this).field_C != var5.field_C) {
                var4 = 1;
                System.out.println("int max_energy has changed. before=" + var5.field_C + ", now=" + ((sg) this).field_C);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((sg) this).field_G != var5.field_G) {
                var4 = 1;
                System.out.println("int repair_mode_reload has changed. before=" + var5.field_G + ", now=" + ((sg) this).field_G);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              stackOut_38_0 = ((sg) this).field_y;
              stackIn_40_0 = stackOut_38_0;
              stackIn_39_0 = stackOut_38_0;
              if (var5.field_y) {
                stackOut_40_0 = stackIn_40_0;
                stackOut_40_1 = 0;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                break L14;
              } else {
                stackOut_39_0 = stackIn_39_0;
                stackOut_39_1 = 1;
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                break L14;
              }
            }
            L15: {
              if ((stackIn_41_0 ? 1 : 0) != stackIn_41_1) {
                break L15;
              } else {
                System.out.println("boolean repair_mode_on has changed. before=" + var5.field_y + ", now=" + ((sg) this).field_y);
                var4 = 1;
                break L15;
              }
            }
            L16: {
              stackOut_43_0 = var5.field_K;
              stackIn_45_0 = stackOut_43_0;
              stackIn_44_0 = stackOut_43_0;
              if (((sg) this).field_K) {
                stackOut_45_0 = stackIn_45_0;
                stackOut_45_1 = 0;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                break L16;
              } else {
                stackOut_44_0 = stackIn_44_0;
                stackOut_44_1 = 1;
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                break L16;
              }
            }
            L17: {
              if ((stackIn_46_0 ? 1 : 0) != stackIn_46_1) {
                break L17;
              } else {
                var4 = 1;
                System.out.println("boolean self_destruct_prepared has changed. before=" + var5.field_K + ", now=" + ((sg) this).field_K);
                break L17;
              }
            }
            L18: {
              stackOut_48_0 = ((sg) this).field_O;
              stackIn_50_0 = stackOut_48_0;
              stackIn_49_0 = stackOut_48_0;
              if (var5.field_O) {
                stackOut_50_0 = stackIn_50_0;
                stackOut_50_1 = 0;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                break L18;
              } else {
                stackOut_49_0 = stackIn_49_0;
                stackOut_49_1 = 1;
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                break L18;
              }
            }
            L19: {
              if ((stackIn_51_0 ? 1 : 0) == stackIn_51_1) {
                System.out.println("boolean self_destruct_activated has changed. before=" + var5.field_O + ", now=" + ((sg) this).field_O);
                var4 = 1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (var5.field_M != ((sg) this).field_M) {
                System.out.println("int self_destruct_countdown has changed. before=" + var5.field_M + ", now=" + ((sg) this).field_M);
                var4 = 1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param1 < -19) {
                break L21;
              } else {
                ((sg) this).field_A = 114;
                break L21;
              }
            }
            L22: {
              if (var5.field_T) {
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                break L22;
              } else {
                stackOut_60_0 = 1;
                stackIn_62_0 = stackOut_60_0;
                break L22;
              }
            }
            L23: {
              if (stackIn_62_0 == (((sg) this).field_T ? 1 : 0)) {
                var4 = 1;
                System.out.println("boolean salvo_just_fired has changed. before=" + var5.field_T + ", now=" + ((sg) this).field_T);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (var5.field_w == ((sg) this).field_w) {
                break L24;
              } else {
                var4 = 1;
                System.out.println("boolean just_attached_something has changed. before=" + var5.field_w + ", now=" + ((sg) this).field_w);
                break L24;
              }
            }
            L25: {
              if (((sg) this).field_R) {
                stackOut_69_0 = 0;
                stackIn_70_0 = stackOut_69_0;
                break L25;
              } else {
                stackOut_68_0 = 1;
                stackIn_70_0 = stackOut_68_0;
                break L25;
              }
            }
            L26: {
              stackOut_70_0 = stackIn_70_0;
              stackIn_72_0 = stackOut_70_0;
              stackIn_71_0 = stackOut_70_0;
              if (var5.field_R) {
                stackOut_72_0 = stackIn_72_0;
                stackOut_72_1 = 0;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                break L26;
              } else {
                stackOut_71_0 = stackIn_71_0;
                stackOut_71_1 = 1;
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                break L26;
              }
            }
            L27: {
              if (stackIn_73_0 == stackIn_73_1) {
                break L27;
              } else {
                System.out.println("boolean shields_on has changed. before=" + var5.field_R + ", now=" + ((sg) this).field_R);
                var4 = 1;
                break L27;
              }
            }
            L28: {
              if (((sg) this).field_v != var5.field_v) {
                var4 = 1;
                System.out.println("int shields_toggle_cooldown has changed. before=" + var5.field_v + ", now=" + ((sg) this).field_v);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (ikb.a(((sg) this).field_J, var5.field_J, false)) {
                var4 = 1;
                System.out.println("int[] last_attackers has changed. ");
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (((sg) this).field_S != null) {
                stackOut_83_0 = 0;
                stackIn_84_0 = stackOut_83_0;
                break L30;
              } else {
                stackOut_82_0 = 1;
                stackIn_84_0 = stackOut_82_0;
                break L30;
              }
            }
            L31: {
              stackOut_84_0 = stackIn_84_0;
              stackIn_86_0 = stackOut_84_0;
              stackIn_85_0 = stackOut_84_0;
              if (var5.field_S != null) {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                break L31;
              } else {
                stackOut_85_0 = stackIn_85_0;
                stackOut_85_1 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                break L31;
              }
            }
            L32: {
              L33: {
                if ((stackIn_87_0 ^ stackIn_87_1) != 0) {
                  break L33;
                } else {
                  if (null == ((sg) this).field_S) {
                    break L32;
                  } else {
                    if (!((sg) this).field_S.a((byte) -92, (tv) (Object) var5.field_S)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("ShipBlueprint target_blueprint has changed. before=" + (Object) (Object) var5.field_S + ", now=" + (Object) (Object) ((sg) this).field_S);
              break L32;
            }
            L34: {
              if (((sg) this).field_F != var5.field_F) {
                System.out.println("int spawn_timer has changed. before=" + var5.field_F + ", now=" + ((sg) this).field_F);
                var4 = 1;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (var4 == 0) {
                break L35;
              } else {
                System.out.println("This instance of Ship has changed, where owner=" + ((sg) this).field_Q);
                break L35;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var3;
            stackOut_98_1 = new StringBuilder().append("sg.F(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L36;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L36;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + param1 + ')');
        }
    }

    public sg() {
        ((sg) this).field_u = -1;
        ((sg) this).field_P = jo.field_e;
        ((sg) this).field_z = null;
        ((sg) this).field_N = 0;
        ((sg) this).field_Q = -1;
        ((sg) this).field_x = null;
        ((sg) this).field_L = null;
    }

    static {
    }
}
