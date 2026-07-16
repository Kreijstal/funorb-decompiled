/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tg {
    static long field_a;
    static String field_d;
    private je field_e;
    private mc field_b;
    static volatile int field_f;
    static String field_c;

    final mc a(byte param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        mc stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        mc stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((tg) this).field_b;
            if (((tg) this).field_e.field_c != var2) {
              L1: {
                if (param0 == -66) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              ((tg) this).field_b = var2.field_e;
              stackOut_6_0 = (mc) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((tg) this).field_b = null;
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "tg.B(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final mc a(boolean param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        mc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        mc stackOut_8_0 = null;
        try {
          L0: {
            var2 = ((tg) this).field_e.field_c.field_j;
            if (var2 == ((tg) this).field_e.field_c) {
              ((tg) this).field_b = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (mc) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  mc discarded$2 = ((tg) this).b(63);
                  break L1;
                }
              }
              ((tg) this).field_b = var2.field_j;
              stackOut_8_0 = (mc) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "tg.E(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    final mc a(boolean param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        mc stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        mc stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  var3 = param1;
                  if (TetraLink.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = ((tg) this).field_e.field_c.field_e;
              break L1;
            }
            if (((tg) this).field_e.field_c == var3) {
              ((tg) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (mc) (Object) stackIn_7_0;
            } else {
              L3: {
                if (param0) {
                  break L3;
                } else {
                  field_c = null;
                  break L3;
                }
              }
              ((tg) this).field_b = var3.field_e;
              stackOut_11_0 = (mc) var3;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("tg.H(").append(param0).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    final mc a(int param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        mc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        mc stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null != param1) {
                  break L2;
                } else {
                  var3 = ((tg) this).field_e.field_c.field_j;
                  if (TetraLink.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
            }
            if (var3 != ((tg) this).field_e.field_c) {
              if (param0 < -1) {
                ((tg) this).field_b = var3.field_j;
                stackOut_9_0 = (mc) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (mc) (Object) stackIn_8_0;
              }
            } else {
              ((tg) this).field_b = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (mc) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("tg.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
    }

    final mc b(byte param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        mc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        mc stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              var2 = ((tg) this).field_b;
              if (param0 == -58) {
                break L1;
              } else {
                tg.a(87);
                break L1;
              }
            }
            if (((tg) this).field_e.field_c == var2) {
              ((tg) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (mc) (Object) stackIn_7_0;
            } else {
              ((tg) this).field_b = var2.field_j;
              stackOut_8_0 = (mc) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "tg.G(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    final mc b(int param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        mc stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        mc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = ((tg) this).field_e.field_c.field_e;
            if (var2 != ((tg) this).field_e.field_c) {
              ((tg) this).field_b = var2.field_e;
              var3 = -100 / ((param0 - 40) / 42);
              stackOut_3_0 = (mc) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              ((tg) this).field_b = null;
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "tg.F(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    tg(je param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((tg) this).field_e = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tg.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public static void a(int param0) {
        try {
            field_c = null;
            field_d = null;
            if (param0 != 0) {
                field_f = 18;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "tg.D(" + param0 + 41);
        }
    }

    final static void a(int param0, hl param1, hl param2, jb param3, hl param4, hl param5, hl param6, hl param7, boolean param8, hl param9, hl param10, bl param11) {
        RuntimeException var12 = null;
        oh var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        oh[] var16 = null;
        hl var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int stackIn_4_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_21_0 = null;
        boolean stackOut_27_0 = false;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var20 = TetraLink.field_J;
        try {
          L0: {
            pg.field_f[2] = 9474303;
            pg.field_f[0] = 16764000;
            we.field_k = param3;
            pg.field_f[1] = 6356832;
            ll.field_A = param1;
            go.field_c = param8;
            pg.field_f[3] = 16736511;
            pg.field_f[4] = 16711935;
            pg.field_f[4] = 16711935;
            un.field_j[0] = 16764000;
            un.field_j[2] = 16736352;
            t.field_l = 8421504;
            un.field_j[1] = 6356832;
            un.field_j[3] = 16736511;
            var12_ref = new oh(4, 4);
            var13 = var12_ref.field_C;
            var14 = var12_ref.field_C;
            var12_ref.field_C[15] = 7368816;
            var15 = var12_ref.field_C;
            var15[8] = 7368816;
            var13[2] = 7368816;
            var14[5] = 7368816;
            var16 = new oh[9];
            var16[4] = var12_ref;
            oj.field_a = new hl(0L, param4);
            ea.field_f = new hl(0L, param10);
            oj.field_a.a((byte) 73, ea.field_f);
            var17 = new hl(0L, (hl) null);
            var17.field_fb = new je();
            id.field_M = new rb(0L, var17, param5, param11);
            ea.field_f.a((byte) -97, (hl) (Object) id.field_M);
            pj.field_d = new hl(0L, param6);
            ea.field_f.a((byte) -123, pj.field_d);
            in.field_g = new hl(0L, param7);
            in.field_g.field_Ib = we.field_k;
            pj.field_d.a((byte) 89, in.field_g);
            pj.field_d.c((byte) 84);
            ba.field_L = new hl(0L, (hl) null);
            ba.field_L.field_Eb = var16;
            pj.field_d.a((byte) -124, ba.field_L);
            el.field_oc = new hl[5];
            nj.field_f = new hl[5];
            fh.field_f = new hl[5];
            og.field_o = new hl[5];
            var18 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (5 <= var18) {
                    break L3;
                  } else {
                    stackOut_3_0 = var18;
                    stackIn_28_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var20 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 == 0) {
                              break L6;
                            } else {
                              L7: {
                                if ((var18 ^ -1) != -2) {
                                  break L7;
                                } else {
                                  if (!go.field_c) {
                                    break L7;
                                  } else {
                                    var19 = rl.field_e;
                                    if (var20 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var18 != 2) {
                                break L4;
                              } else {
                                var19 = im.field_b;
                                if (var20 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L8: {
                            if (go.field_c) {
                              stackOut_23_0 = nm.field_v;
                              stackIn_24_0 = stackOut_23_0;
                              break L8;
                            } else {
                              stackOut_21_0 = r.field_v;
                              stackIn_24_0 = stackOut_21_0;
                              break L8;
                            }
                          }
                          var19 = stackIn_24_0;
                          break L5;
                        }
                        nj.field_f[var18] = new hl(0L, param9);
                        el.field_oc[var18] = new hl(0L, ll.field_A, var19);
                        fh.field_f[var18] = new hl(0L, (hl) null);
                        fh.field_f[var18].field_J = 1;
                        og.field_o[var18] = new hl(0L, ll.field_A);
                        og.field_o[var18].field_J = 1;
                        nj.field_f[var18].a((byte) -88, el.field_oc[var18]);
                        nj.field_f[var18].a((byte) 14, fh.field_f[var18]);
                        nj.field_f[var18].a((byte) -106, og.field_o[var18]);
                        nj.field_f[var18].c((byte) -96);
                        oj.field_a.a((byte) -111, nj.field_f[var18]);
                        v.field_r = v.field_r + 1;
                        break L4;
                      }
                      var18++;
                      if (var20 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                nc.field_e = new hl(0L, param2);
                nc.field_e.field_jb = bd.field_f;
                oj.field_a.a((byte) 47, nc.field_e);
                stackOut_27_0 = r.d(0);
                stackIn_28_0 = stackOut_27_0 ? 1 : 0;
                break L2;
              }
              L9: {
                L10: {
                  if (stackIn_28_0 == 0) {
                    break L10;
                  } else {
                    if (!cd.field_a) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                bk.field_e = new lb(0, 0, 0, 0);
                break L9;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var12 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var12;
            stackOut_35_1 = new StringBuilder().append("tg.C(").append(param0).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L12;
            }
          }
          L13: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L13;
            }
          }
          L14: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L14;
            }
          }
          L15: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param5 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L15;
            }
          }
          L16: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param6 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L16;
            }
          }
          L17: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(44);
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param7 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L17;
            }
          }
          L18: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(44).append(param8).append(44);
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param9 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L18;
            }
          }
          L19: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param10 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param11 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L20;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_c = "Music: ";
    }
}
