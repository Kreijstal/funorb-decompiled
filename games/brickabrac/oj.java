/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ep {
    static int field_m;
    static String field_s;
    private String field_w;
    private int field_n;
    private int field_l;
    static java.awt.Image field_r;
    static vm field_q;
    static String field_o;
    private boolean field_x;
    static long field_t;
    private int field_p;
    private dh field_u;
    private int field_v;
    private int field_y;

    final void a(String param0, int param1, dh param2, int param3, int param4) {
        ml var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_u) {
            if (this.field_x) {
                if (this.field_l == 1) {
                    if (this.field_w != null) {
                        if (this.field_w.equals(param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_x = true;
            this.field_u = param2;
            this.field_l = param4;
            var8 = this.a(param0, param2, (byte) -72, param1);
            var7 = param2.c(param0);
            var8.field_g[0] = param3 + -(var7 >> 1513741441);
            var8.field_g[param0.length()] = param3 + (var7 >> 864306305);
            dn.a(25293, param0, var8, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        mh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        mh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        mh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        mh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        mh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        mh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        mh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        mh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        mh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        mh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        mh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        mh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        mh stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        mh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        mh stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        mh stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        mh stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        mh stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        mh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        mh stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        mh stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        mh stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        mh stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        mh stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        mh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        mh stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mh stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        mh stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        mh stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        mh stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        mh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        mh stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        mh stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        mh stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        mh stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        mh stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        mh stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        mh stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        mh stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        mh stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        mh stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        mh stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        mh stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        mh stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        mh stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        mh stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        mh stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        mh stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        mh stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        mh stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        mh stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        mh stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        mh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        mh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        mh stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        mh stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        mh stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        mh stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        mh stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        mh stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        mh stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        mh stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        mh stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        mh stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        mh stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        mh stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        mh stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        mh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        mh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        mh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        mh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        mh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        mh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        mh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        mh stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        mh stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        mh stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        mh stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        mh stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        mh stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        mh stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        mh stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        mh stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        mh stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        mh stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        mh stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        mh stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        mh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        mh stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        mh stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        mh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        mh stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        mh stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        mh stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        mh stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        mh stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        mh stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        mh stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        mh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        mh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        mh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        mh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        mh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        mh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        mh stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        mh stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        mh stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        mh stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        mh stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        mh stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        mh stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        mh stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        mh stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        mh stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        mh stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        mh stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        mh stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        mh stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        mh stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        mh stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        mh stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        mh stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        mh stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        mh stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        mh stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        mh stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        mh stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        mh stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        mh stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        mh stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        mh stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        mh stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        mh stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        mh stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        mh stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        mh stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        vi.a((byte) 74, 640 + lb.field_c >> 1926271233, -640 + lb.field_c >> 947342433, 0, lb.field_d);
        if ((ml.field_b ^ -1) < -1) {
          L0: {
            if (null == c.field_e) {
              break L0;
            } else {
              c.field_e.d(fe.field_gb.field_P, 0);
              break L0;
            }
          }
          L1: {
            L2: {
              stackOut_4_0 = fe.field_gb;
              stackOut_4_1 = 1;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (!param0) {
                break L2;
              } else {
                stackOut_5_0 = (mh) ((Object) stackIn_5_0);
                stackOut_5_1 = stackIn_5_1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (sc.field_c) {
                  break L2;
                } else {
                  stackOut_6_0 = (mh) ((Object) stackIn_6_0);
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L1;
                }
              }
            }
            stackOut_7_0 = (mh) ((Object) stackIn_7_0);
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            break L1;
          }
          L3: {
            L4: {
              ((mh) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2 != 0);
              stackOut_8_0 = rm.field_a;
              stackOut_8_1 = 1;
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (!param0) {
                break L4;
              } else {
                stackOut_9_0 = (mh) ((Object) stackIn_9_0);
                stackOut_9_1 = stackIn_9_1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (sc.field_c) {
                  break L4;
                } else {
                  stackOut_10_0 = (mh) ((Object) stackIn_10_0);
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
            }
            stackOut_11_0 = (mh) ((Object) stackIn_11_0);
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            break L3;
          }
          ((mh) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2 != 0);
          if ((pe.field_j ^ -1) >= -1) {
            if (eg.field_m > 0) {
              if (null != c.field_e) {
                L5: {
                  L6: {
                    c.field_e.d(qa.field_w.field_P, 0);
                    stackOut_45_0 = qa.field_w;
                    stackOut_45_1 = 1;
                    stackIn_48_0 = stackOut_45_0;
                    stackIn_48_1 = stackOut_45_1;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    if (!param0) {
                      break L6;
                    } else {
                      stackOut_46_0 = (mh) ((Object) stackIn_46_0);
                      stackOut_46_1 = stackIn_46_1;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (hc.field_c) {
                        break L6;
                      } else {
                        stackOut_47_0 = (mh) ((Object) stackIn_47_0);
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        break L5;
                      }
                    }
                  }
                  stackOut_48_0 = (mh) ((Object) stackIn_48_0);
                  stackOut_48_1 = stackIn_48_1;
                  stackOut_48_2 = 0;
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L5;
                }
                L7: {
                  L8: {
                    ((mh) (Object) stackIn_49_0).a(stackIn_49_1 != 0, stackIn_49_2 != 0);
                    stackOut_49_0 = ak.field_d;
                    stackOut_49_1 = 1;
                    stackIn_52_0 = stackOut_49_0;
                    stackIn_52_1 = stackOut_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    if (!param0) {
                      break L8;
                    } else {
                      stackOut_50_0 = (mh) ((Object) stackIn_50_0);
                      stackOut_50_1 = stackIn_50_1;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (hc.field_c) {
                        break L8;
                      } else {
                        stackOut_51_0 = (mh) ((Object) stackIn_51_0);
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        break L7;
                      }
                    }
                  }
                  stackOut_52_0 = (mh) ((Object) stackIn_52_0);
                  stackOut_52_1 = stackIn_52_1;
                  stackOut_52_2 = 0;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L7;
                }
                ((mh) (Object) stackIn_53_0).a(stackIn_53_1 != 0, stackIn_53_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              } else {
                L9: {
                  L10: {
                    stackOut_36_0 = qa.field_w;
                    stackOut_36_1 = 1;
                    stackIn_39_0 = stackOut_36_0;
                    stackIn_39_1 = stackOut_36_1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    if (!param0) {
                      break L10;
                    } else {
                      stackOut_37_0 = (mh) ((Object) stackIn_37_0);
                      stackOut_37_1 = stackIn_37_1;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (hc.field_c) {
                        break L10;
                      } else {
                        stackOut_38_0 = (mh) ((Object) stackIn_38_0);
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L9;
                      }
                    }
                  }
                  stackOut_39_0 = (mh) ((Object) stackIn_39_0);
                  stackOut_39_1 = stackIn_39_1;
                  stackOut_39_2 = 0;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L9;
                }
                L11: {
                  L12: {
                    ((mh) (Object) stackIn_40_0).a(stackIn_40_1 != 0, stackIn_40_2 != 0);
                    stackOut_40_0 = ak.field_d;
                    stackOut_40_1 = 1;
                    stackIn_43_0 = stackOut_40_0;
                    stackIn_43_1 = stackOut_40_1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    if (!param0) {
                      break L12;
                    } else {
                      stackOut_41_0 = (mh) ((Object) stackIn_41_0);
                      stackOut_41_1 = stackIn_41_1;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      if (hc.field_c) {
                        break L12;
                      } else {
                        stackOut_42_0 = (mh) ((Object) stackIn_42_0);
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_44_2 = stackOut_42_2;
                        break L11;
                      }
                    }
                  }
                  stackOut_43_0 = (mh) ((Object) stackIn_43_0);
                  stackOut_43_1 = stackIn_43_1;
                  stackOut_43_2 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L11;
                }
                ((mh) (Object) stackIn_44_0).a(stackIn_44_1 != 0, stackIn_44_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              }
            } else {
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          } else {
            if (null != c.field_e) {
              L13: {
                L14: {
                  c.field_e.d(qa.field_w.field_P, 0);
                  stackOut_23_0 = qa.field_w;
                  stackOut_23_1 = 1;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (!param0) {
                    break L14;
                  } else {
                    stackOut_24_0 = (mh) ((Object) stackIn_24_0);
                    stackOut_24_1 = stackIn_24_1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (hc.field_c) {
                      break L14;
                    } else {
                      stackOut_25_0 = (mh) ((Object) stackIn_25_0);
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      break L13;
                    }
                  }
                }
                stackOut_26_0 = (mh) ((Object) stackIn_26_0);
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                break L13;
              }
              L15: {
                L16: {
                  ((mh) (Object) stackIn_27_0).a(stackIn_27_1 != 0, stackIn_27_2 != 0);
                  stackOut_27_0 = ak.field_d;
                  stackOut_27_1 = 1;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_30_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (!param0) {
                    break L16;
                  } else {
                    stackOut_28_0 = (mh) ((Object) stackIn_28_0);
                    stackOut_28_1 = stackIn_28_1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    if (hc.field_c) {
                      break L16;
                    } else {
                      stackOut_29_0 = (mh) ((Object) stackIn_29_0);
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      stackIn_31_2 = stackOut_29_2;
                      break L15;
                    }
                  }
                }
                stackOut_30_0 = (mh) ((Object) stackIn_30_0);
                stackOut_30_1 = stackIn_30_1;
                stackOut_30_2 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                break L15;
              }
              ((mh) (Object) stackIn_31_0).a(stackIn_31_1 != 0, stackIn_31_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            } else {
              L17: {
                L18: {
                  stackOut_14_0 = qa.field_w;
                  stackOut_14_1 = 1;
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (!param0) {
                    break L18;
                  } else {
                    stackOut_15_0 = (mh) ((Object) stackIn_15_0);
                    stackOut_15_1 = stackIn_15_1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (hc.field_c) {
                      break L18;
                    } else {
                      stackOut_16_0 = (mh) ((Object) stackIn_16_0);
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L17;
                    }
                  }
                }
                stackOut_17_0 = (mh) ((Object) stackIn_17_0);
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                break L17;
              }
              L19: {
                L20: {
                  ((mh) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2 != 0);
                  stackOut_18_0 = ak.field_d;
                  stackOut_18_1 = 1;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  if (!param0) {
                    break L20;
                  } else {
                    stackOut_19_0 = (mh) ((Object) stackIn_19_0);
                    stackOut_19_1 = stackIn_19_1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (hc.field_c) {
                      break L20;
                    } else {
                      stackOut_20_0 = (mh) ((Object) stackIn_20_0);
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      break L19;
                    }
                  }
                }
                stackOut_21_0 = (mh) ((Object) stackIn_21_0);
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                break L19;
              }
              ((mh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, stackIn_22_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          }
        } else {
          if ((pe.field_j ^ -1) >= -1) {
            if (eg.field_m > 0) {
              if (null != c.field_e) {
                L21: {
                  L22: {
                    c.field_e.d(qa.field_w.field_P, 0);
                    stackOut_88_0 = qa.field_w;
                    stackOut_88_1 = 1;
                    stackIn_91_0 = stackOut_88_0;
                    stackIn_91_1 = stackOut_88_1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    if (!param0) {
                      break L22;
                    } else {
                      stackOut_89_0 = (mh) ((Object) stackIn_89_0);
                      stackOut_89_1 = stackIn_89_1;
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_91_1 = stackOut_89_1;
                      stackIn_90_0 = stackOut_89_0;
                      stackIn_90_1 = stackOut_89_1;
                      if (hc.field_c) {
                        break L22;
                      } else {
                        stackOut_90_0 = (mh) ((Object) stackIn_90_0);
                        stackOut_90_1 = stackIn_90_1;
                        stackOut_90_2 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        stackIn_92_1 = stackOut_90_1;
                        stackIn_92_2 = stackOut_90_2;
                        break L21;
                      }
                    }
                  }
                  stackOut_91_0 = (mh) ((Object) stackIn_91_0);
                  stackOut_91_1 = stackIn_91_1;
                  stackOut_91_2 = 0;
                  stackIn_92_0 = stackOut_91_0;
                  stackIn_92_1 = stackOut_91_1;
                  stackIn_92_2 = stackOut_91_2;
                  break L21;
                }
                L23: {
                  L24: {
                    ((mh) (Object) stackIn_92_0).a(stackIn_92_1 != 0, stackIn_92_2 != 0);
                    stackOut_92_0 = ak.field_d;
                    stackOut_92_1 = 1;
                    stackIn_95_0 = stackOut_92_0;
                    stackIn_95_1 = stackOut_92_1;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    if (!param0) {
                      break L24;
                    } else {
                      stackOut_93_0 = (mh) ((Object) stackIn_93_0);
                      stackOut_93_1 = stackIn_93_1;
                      stackIn_95_0 = stackOut_93_0;
                      stackIn_95_1 = stackOut_93_1;
                      stackIn_94_0 = stackOut_93_0;
                      stackIn_94_1 = stackOut_93_1;
                      if (hc.field_c) {
                        break L24;
                      } else {
                        stackOut_94_0 = (mh) ((Object) stackIn_94_0);
                        stackOut_94_1 = stackIn_94_1;
                        stackOut_94_2 = 1;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        stackIn_96_2 = stackOut_94_2;
                        break L23;
                      }
                    }
                  }
                  stackOut_95_0 = (mh) ((Object) stackIn_95_0);
                  stackOut_95_1 = stackIn_95_1;
                  stackOut_95_2 = 0;
                  stackIn_96_0 = stackOut_95_0;
                  stackIn_96_1 = stackOut_95_1;
                  stackIn_96_2 = stackOut_95_2;
                  break L23;
                }
                ((mh) (Object) stackIn_96_0).a(stackIn_96_1 != 0, stackIn_96_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              } else {
                L25: {
                  L26: {
                    stackOut_79_0 = qa.field_w;
                    stackOut_79_1 = 1;
                    stackIn_82_0 = stackOut_79_0;
                    stackIn_82_1 = stackOut_79_1;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    if (!param0) {
                      break L26;
                    } else {
                      stackOut_80_0 = (mh) ((Object) stackIn_80_0);
                      stackOut_80_1 = stackIn_80_1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      if (hc.field_c) {
                        break L26;
                      } else {
                        stackOut_81_0 = (mh) ((Object) stackIn_81_0);
                        stackOut_81_1 = stackIn_81_1;
                        stackOut_81_2 = 1;
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_83_1 = stackOut_81_1;
                        stackIn_83_2 = stackOut_81_2;
                        break L25;
                      }
                    }
                  }
                  stackOut_82_0 = (mh) ((Object) stackIn_82_0);
                  stackOut_82_1 = stackIn_82_1;
                  stackOut_82_2 = 0;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  stackIn_83_2 = stackOut_82_2;
                  break L25;
                }
                L27: {
                  L28: {
                    ((mh) (Object) stackIn_83_0).a(stackIn_83_1 != 0, stackIn_83_2 != 0);
                    stackOut_83_0 = ak.field_d;
                    stackOut_83_1 = 1;
                    stackIn_86_0 = stackOut_83_0;
                    stackIn_86_1 = stackOut_83_1;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    if (!param0) {
                      break L28;
                    } else {
                      stackOut_84_0 = (mh) ((Object) stackIn_84_0);
                      stackOut_84_1 = stackIn_84_1;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      if (hc.field_c) {
                        break L28;
                      } else {
                        stackOut_85_0 = (mh) ((Object) stackIn_85_0);
                        stackOut_85_1 = stackIn_85_1;
                        stackOut_85_2 = 1;
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        break L27;
                      }
                    }
                  }
                  stackOut_86_0 = (mh) ((Object) stackIn_86_0);
                  stackOut_86_1 = stackIn_86_1;
                  stackOut_86_2 = 0;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  stackIn_87_2 = stackOut_86_2;
                  break L27;
                }
                ((mh) (Object) stackIn_87_0).a(stackIn_87_1 != 0, stackIn_87_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              }
            } else {
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          } else {
            if (null != c.field_e) {
              L29: {
                L30: {
                  c.field_e.d(qa.field_w.field_P, 0);
                  stackOut_66_0 = qa.field_w;
                  stackOut_66_1 = 1;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_69_1 = stackOut_66_1;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  if (!param0) {
                    break L30;
                  } else {
                    stackOut_67_0 = (mh) ((Object) stackIn_67_0);
                    stackOut_67_1 = stackIn_67_1;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (hc.field_c) {
                      break L30;
                    } else {
                      stackOut_68_0 = (mh) ((Object) stackIn_68_0);
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_70_2 = stackOut_68_2;
                      break L29;
                    }
                  }
                }
                stackOut_69_0 = (mh) ((Object) stackIn_69_0);
                stackOut_69_1 = stackIn_69_1;
                stackOut_69_2 = 0;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                stackIn_70_2 = stackOut_69_2;
                break L29;
              }
              L31: {
                L32: {
                  ((mh) (Object) stackIn_70_0).a(stackIn_70_1 != 0, stackIn_70_2 != 0);
                  stackOut_70_0 = ak.field_d;
                  stackOut_70_1 = 1;
                  stackIn_73_0 = stackOut_70_0;
                  stackIn_73_1 = stackOut_70_1;
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  if (!param0) {
                    break L32;
                  } else {
                    stackOut_71_0 = (mh) ((Object) stackIn_71_0);
                    stackOut_71_1 = stackIn_71_1;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (hc.field_c) {
                      break L32;
                    } else {
                      stackOut_72_0 = (mh) ((Object) stackIn_72_0);
                      stackOut_72_1 = stackIn_72_1;
                      stackOut_72_2 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      stackIn_74_2 = stackOut_72_2;
                      break L31;
                    }
                  }
                }
                stackOut_73_0 = (mh) ((Object) stackIn_73_0);
                stackOut_73_1 = stackIn_73_1;
                stackOut_73_2 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                stackIn_74_2 = stackOut_73_2;
                break L31;
              }
              ((mh) (Object) stackIn_74_0).a(stackIn_74_1 != 0, stackIn_74_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            } else {
              L33: {
                L34: {
                  stackOut_57_0 = qa.field_w;
                  stackOut_57_1 = 1;
                  stackIn_60_0 = stackOut_57_0;
                  stackIn_60_1 = stackOut_57_1;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  if (!param0) {
                    break L34;
                  } else {
                    stackOut_58_0 = (mh) ((Object) stackIn_58_0);
                    stackOut_58_1 = stackIn_58_1;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (hc.field_c) {
                      break L34;
                    } else {
                      stackOut_59_0 = (mh) ((Object) stackIn_59_0);
                      stackOut_59_1 = stackIn_59_1;
                      stackOut_59_2 = 1;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      stackIn_61_2 = stackOut_59_2;
                      break L33;
                    }
                  }
                }
                stackOut_60_0 = (mh) ((Object) stackIn_60_0);
                stackOut_60_1 = stackIn_60_1;
                stackOut_60_2 = 0;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                stackIn_61_2 = stackOut_60_2;
                break L33;
              }
              L35: {
                L36: {
                  ((mh) (Object) stackIn_61_0).a(stackIn_61_1 != 0, stackIn_61_2 != 0);
                  stackOut_61_0 = ak.field_d;
                  stackOut_61_1 = 1;
                  stackIn_64_0 = stackOut_61_0;
                  stackIn_64_1 = stackOut_61_1;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  if (!param0) {
                    break L36;
                  } else {
                    stackOut_62_0 = (mh) ((Object) stackIn_62_0);
                    stackOut_62_1 = stackIn_62_1;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    if (hc.field_c) {
                      break L36;
                    } else {
                      stackOut_63_0 = (mh) ((Object) stackIn_63_0);
                      stackOut_63_1 = stackIn_63_1;
                      stackOut_63_2 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      stackIn_65_2 = stackOut_63_2;
                      break L35;
                    }
                  }
                }
                stackOut_64_0 = (mh) ((Object) stackIn_64_0);
                stackOut_64_1 = stackIn_64_1;
                stackOut_64_2 = 0;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                stackIn_65_2 = stackOut_64_2;
                break L35;
              }
              ((mh) (Object) stackIn_65_0).a(stackIn_65_1 != 0, stackIn_65_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          }
        }
    }

    final void a(dh param0, int param1, int param2, String param3, int param4) {
        ml var7 = null;
        ml var8 = null;
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_u == param0) {
            if (this.field_x) {
                if (-1 == (this.field_l ^ -1)) {
                    if (this.field_w != null) {
                        if (!(!this.field_w.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_u = param0;
            this.field_x = true;
            this.field_w = param3;
            this.field_l = param4;
            var7 = this.a(param3, param0, (byte) -109, param1);
            var8 = var7;
            var7.field_g[0] = param2;
            var8.field_g[param3.length()] = param0.c(param3) + param2;
            dn.a(param4 ^ 25293, param3, var8, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oj.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, vo param1, int param2, int param3, byte param4, j param5, int param6) {
        RuntimeException var7 = null;
        jp[] var7_array = null;
        jp[] var8 = null;
        jp var9 = null;
        int var10 = 0;
        int var11 = 0;
        jp var12 = null;
        int var12_int = 0;
        int var13 = 0;
        jp[] var14 = null;
        jp var15 = null;
        jp[] var16 = null;
        jp[] stackIn_4_0 = null;
        jp[] stackIn_7_0 = null;
        jp stackIn_10_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        jp[] stackOut_6_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_9_0 = null;
        jp stackOut_8_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (oa.field_Sb != null) {
                stackOut_3_0 = oa.field_Sb.a((byte) -89, param2);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (jp[]) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var14 = stackIn_4_0;
              var16 = var14;
              var7_array = var16;
              if (oa.field_Sb != null) {
                stackOut_6_0 = oa.field_Sb.a(param2, true);
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = null;
                stackIn_7_0 = (jp[]) ((Object) stackOut_5_0);
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (oa.field_Sb == null) {
                stackOut_9_0 = null;
                stackIn_10_0 = (jp) ((Object) stackOut_9_0);
                break L3;
              } else {
                stackOut_8_0 = oa.field_Sb.a(true, param2);
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var9 = stackIn_10_0;
            if (param4 >= 54) {
              L4: {
                var10 = param1.field_m >> 474266472;
                var11 = param1.field_j >> 1311999656;
                if (-3 != (param0 ^ -1)) {
                  break L4;
                } else {
                  var15 = bq.field_e[1][oo.field_w.a(-37880252, bq.field_e[1].length)];
                  var12 = var15;
                  var12.f((var11 + param6 * param2 + -(var15.field_x * param2) - -3) / param2, (3 + (param2 * param3 + var10)) / param2, 196);
                  break L4;
                }
              }
              L5: {
                tf.field_c[0].c(var11 / param2 + param6, var10 / param2 + param3);
                if (var7_array != null) {
                  var14[0].c(param6 - -(var11 / param2), param3 - -(var10 / param2));
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 += 16;
              var12_int = 0;
              L6: while (true) {
                if (param1.field_F / 2 <= var12_int) {
                  L7: {
                    gg.field_o.c(param6 + var11 / param2, var10 / param2 + param3);
                    if (var9 != null) {
                      var9.c(param6 + var11 / param2, var10 / param2 + param3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var11 += 8;
                  var12_int = 0;
                  L8: while (true) {
                    if (param1.field_F / 2 <= var12_int) {
                      L9: {
                        if (0 != param0) {
                          break L9;
                        } else {
                          var12 = bq.field_e[0][oo.field_w.a(-37880252, bq.field_e[0].length)];
                          var12.f((var11 + (16 + param6 * param2) - 3) / param2, (3 + param2 * param3 - -var10) / param2, 196);
                          break L9;
                        }
                      }
                      tf.field_c[1].c(param6 - -(var11 / param2), var10 / param2 + param3);
                      if (var7_array != null) {
                        var16[1].c(param6 - -(var11 / param2), param3 + var10 / param2);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      L10: {
                        fq.field_d[1].c(var11 / param2 + param6, var10 / param2 + param3);
                        if (var8 == null) {
                          break L10;
                        } else {
                          var8[1].c(var11 / param2 + param6, param3 + var10 / param2);
                          break L10;
                        }
                      }
                      var11 += 6;
                      var12_int++;
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    fq.field_d[0].c(var11 / param2 + param6, param3 - -(var10 / param2));
                    if (var8 == null) {
                      break L11;
                    } else {
                      var8[0].c(var11 / param2 + param6, var10 / param2 + param3);
                      break L11;
                    }
                  }
                  var11 += 6;
                  var12_int++;
                  continue L6;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var7);
            stackOut_38_1 = new StringBuilder().append("oj.P(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          L13: {
            stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param5 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ml a(String param0, dh param1, byte param2, int param3) {
        ml var5 = null;
        RuntimeException var5_ref = null;
        ml var6 = null;
        ml stackIn_2_0 = null;
        ml stackIn_4_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_3_0 = null;
        ml stackOut_1_0 = null;
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
            var6 = new ml(-param1.field_F + param3, param3 - -param1.field_P, param0.length());
            var5 = var6;
            this.field_c = new ml[]{var6};
            if (param2 < -71) {
              stackOut_3_0 = (ml) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ml) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5_ref);
            stackOut_5_1 = new StringBuilder().append("oj.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -51) {
          field_t = -70L;
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
    }

    final void a(String param0, dh param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        dh var7 = null;
        ml var9 = null;
        ml var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            if (param0 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 != this.field_u) {
                  break L1;
                } else {
                  if (!this.field_x) {
                    break L1;
                  } else {
                    if (2 != this.field_l) {
                      break L1;
                    } else {
                      if (null == this.field_w) {
                        break L1;
                      } else {
                        if (this.field_w.equals(param0)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                if (param3 <= -90) {
                  break L2;
                } else {
                  var7 = (dh) null;
                  this.a((String) null, -87, (dh) null, 2, -3);
                  break L2;
                }
              }
              this.field_u = param1;
              this.field_w = param0;
              this.field_x = true;
              this.field_l = 2;
              var9 = this.a(param0, param1, (byte) -108, param4);
              var10 = var9;
              var10.field_g[0] = param2 - param1.c(param0);
              var10.field_g[param0.length()] = param2;
              dn.a(25293, param0, var10, 0, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("oj.L(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static int b(boolean param0) {
        if ((qg.field_A ^ -1) > -3) {
          return 0;
        } else {
          if (-1 == (cd.field_e ^ -1)) {
            if (!ma.field_P.a((byte) -127)) {
              return 20;
            } else {
              if (!ma.field_P.a("commonui", -28138)) {
                return 40;
              } else {
                if (!vh.field_S.a((byte) -127)) {
                  return 50;
                } else {
                  if (!vh.field_S.a("commonui", -28138)) {
                    return 60;
                  } else {
                    if (!ja.field_c.a((byte) -127)) {
                      return 70;
                    } else {
                      if (ja.field_c.a(117)) {
                        if (param0) {
                          return 71;
                        } else {
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (wl.field_K != null) {
              if (!wl.field_K.a((byte) -127)) {
                return 14;
              } else {
                if (!wl.field_K.a(-104, "")) {
                  return 29;
                } else {
                  if (wl.field_K.a("", -28138)) {
                    if (!ma.field_P.a((byte) -127)) {
                      return 43;
                    } else {
                      if (ma.field_P.a("commonui", -28138)) {
                        if (vh.field_S.a((byte) -127)) {
                          if (vh.field_S.a("commonui", -28138)) {
                            if (ja.field_c.a((byte) -127)) {
                              if (ja.field_c.a(110)) {
                                if (param0) {
                                  return 71;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            } else {
                              return 82;
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      } else {
                        return 57;
                      }
                    }
                  } else {
                    return 29;
                  }
                }
              }
            } else {
              if (!ma.field_P.a((byte) -127)) {
                return 43;
              } else {
                if (ma.field_P.a("commonui", -28138)) {
                  if (vh.field_S.a((byte) -127)) {
                    if (vh.field_S.a("commonui", -28138)) {
                      if (ja.field_c.a((byte) -127)) {
                        if (ja.field_c.a(110)) {
                          if (param0) {
                            return 71;
                          } else {
                            return 100;
                          }
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, dh param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        String[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ml var15 = null;
        int var16 = 0;
        ml stackIn_33_0 = null;
        ml stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        ml stackIn_34_0 = null;
        ml stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        ml stackIn_35_0 = null;
        ml stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        ml stackIn_38_2 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        ml stackIn_39_2 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        ml stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_32_0 = null;
        ml stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        ml stackOut_34_0 = null;
        ml stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        ml stackOut_33_0 = null;
        ml stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        ml stackOut_37_2 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        ml stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        ml stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param4) {
                break L1;
              } else {
                param4 = param7.field_N;
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (param7 != this.field_u) {
                  break L2;
                } else {
                  if (this.field_x) {
                    break L2;
                  } else {
                    if (param1 != this.field_l) {
                      break L2;
                    } else {
                      if (param6 != this.field_v) {
                        break L2;
                      } else {
                        if (this.field_p != param4) {
                          break L2;
                        } else {
                          if (this.field_y != param3) {
                            break L2;
                          } else {
                            if (param5 != this.field_n) {
                              break L2;
                            } else {
                              if (this.field_w == null) {
                                break L2;
                              } else {
                                if (this.field_w.equals(param0)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
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
              L3: {
                var9_int = -125 % ((26 - param2) / 49);
                this.field_l = param1;
                this.field_x = false;
                this.field_w = param0;
                this.field_y = param3;
                this.field_v = param6;
                this.field_p = param4;
                this.field_n = param5;
                this.field_u = param7;
                var10 = new String[1 + param7.a(param0, param5)];
                var11 = Math.max(1, param7.a(param0, new int[]{param5}, var10));
                if (this.field_v != 3) {
                  break L3;
                } else {
                  if (var11 == 1) {
                    this.field_v = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                this.field_c = new ml[var11];
                if (-1 == (this.field_v ^ -1)) {
                  var12 = param7.field_F;
                  break L4;
                } else {
                  if (-2 == (this.field_v ^ -1)) {
                    var12 = (-(var11 * this.field_p) + this.field_y >> -107612191) + param7.field_F;
                    break L4;
                  } else {
                    if (2 != this.field_v) {
                      L5: {
                        var13 = (this.field_y - this.field_p * var11) / (var11 - -1);
                        if ((var13 ^ -1) <= -1) {
                          break L5;
                        } else {
                          var13 = 0;
                          break L5;
                        }
                      }
                      var12 = var13 + param7.field_F;
                      this.field_p = this.field_p + var13;
                      break L4;
                    } else {
                      var12 = this.field_y - param7.field_P - var11 * this.field_p;
                      break L4;
                    }
                  }
                }
              }
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var14 = var10[var13];
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = var12 + -param7.field_F;
                    stackOut_32_3 = param7.field_P + var12;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    if (var14 != null) {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = var14.length();
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      stackIn_35_4 = stackOut_34_4;
                      break L7;
                    } else {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = 0;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      stackIn_35_3 = stackOut_33_3;
                      stackIn_35_4 = stackOut_33_4;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new ml(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var15.field_g[0] = 0;
                    if (var14 != null) {
                      L9: {
                        var15.field_g[var14.length()] = param7.c(var14);
                        stackOut_37_0 = 25293;
                        stackOut_37_1 = (String) (var14);
                        stackOut_37_2 = (ml) (var15);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (param1 != 3) {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = (String) ((Object) stackIn_39_1);
                          stackOut_39_2 = (ml) ((Object) stackIn_39_2);
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L9;
                        } else {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = (String) ((Object) stackIn_38_1);
                          stackOut_38_2 = (ml) ((Object) stackIn_38_2);
                          stackOut_38_3 = this.a(param5, param7.c(var14), var14, true);
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L9;
                        }
                      }
                      dn.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, param7);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_c[var13] = var15;
                  var12 = var12 + param4;
                  var13++;
                  continue L6;
                }
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var9);
            stackOut_43_1 = new StringBuilder().append("oj.O(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param7 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public oj() {
    }

    static {
        field_o = "Seriously offensive language";
        field_s = "Please select a level.";
    }
}
