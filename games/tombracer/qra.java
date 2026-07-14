/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qra {
    static int[] field_e;
    private boolean field_b;
    static String field_g;
    static float field_d;
    ff field_c;
    private boolean field_i;
    qh field_h;
    static d field_l;
    static int field_j;
    private fna field_k;
    v field_f;
    private ko field_a;

    public static void b(int param0) {
        if (param0 != 96) {
          qra.b(-96);
          field_l = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_l = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    abstract void a(int param0, boolean param1);

    abstract boolean e(int param0);

    final static void a(la param0, int param1, ff param2) {
        if (param1 != 100) {
            field_e = null;
            if (vpa.a(84)) {
                return;
            }
            if (param2.k(param1 + -25419)) {
                return;
            }
            if (!(0 <= param0.q((byte) -82))) {
                return;
            }
            ql.field_k.k(96, -2988);
            ql.field_k.f(-1477662136, param0.q((byte) -82));
            return;
        }
        if (vpa.a(84)) {
            return;
        }
        if (param2.k(param1 + -25419)) {
            return;
        }
        if (!(0 <= param0.q((byte) -82))) {
            return;
        }
        ql.field_k.k(96, -2988);
        ql.field_k.f(-1477662136, param0.q((byte) -82));
    }

    abstract void b(int param0, boolean param1);

    abstract boolean a(char param0, int param1, int param2);

    final static int a(int param0) {
        if (param0 != 96) {
            return 112;
        }
        return ej.field_a.f(param0 ^ -2147483552);
    }

    private final void a(byte param0) {
        ((qra) this).field_k = new fna(0, wba.field_q[0], 0, false);
        if (param0 != -78) {
          this.a((byte) 97);
          ((qra) this).field_k.field_b = ((qra) this).field_k.e(-163) / 2 + 10;
          ((qra) this).field_k.field_i = -25 + koa.b(0);
          ((qra) this).field_k.a(false);
          ((qra) this).field_a = new ko(1);
          return;
        } else {
          ((qra) this).field_k.field_b = ((qra) this).field_k.e(-163) / 2 + 10;
          ((qra) this).field_k.field_i = -25 + koa.b(0);
          ((qra) this).field_k.a(false);
          ((qra) this).field_a = new ko(1);
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        ko stackIn_15_0 = null;
        ko stackIn_16_0 = null;
        ko stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ko stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        ko stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        ko stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        ko stackIn_46_0 = null;
        ko stackIn_47_0 = null;
        ko stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        ko stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        ko stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        ko stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_79_0 = 0;
        ko stackIn_80_0 = null;
        ko stackIn_81_0 = null;
        ko stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        ko stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        ko stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        ko stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        ko stackOut_79_0 = null;
        ko stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        ko stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        ko stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        ko stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        ko stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        ko stackOut_45_0 = null;
        ko stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ko stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        ko stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        ko stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        ko stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        ko stackOut_14_0 = null;
        ko stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ko stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ko stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        ko stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        ko stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        ((qra) this).field_i = true;
        if (((qra) this).field_k.field_b - 80 <= jba.field_j) {
          if (((qra) this).field_k.field_b - -80 > jba.field_j) {
            L0: {
              if (-25 + ((qra) this).field_k.field_i <= sta.field_B) {
                if (((qra) this).field_k.field_i + 25 <= sta.field_B) {
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  break L0;
                } else {
                  stackOut_65_0 = 1;
                  stackIn_67_0 = stackOut_65_0;
                  break L0;
                }
              } else {
                stackOut_63_0 = 0;
                stackIn_67_0 = stackOut_63_0;
                break L0;
              }
            }
            L1: {
              var2 = stackIn_67_0;
              stackOut_67_0 = this;
              stackIn_69_0 = stackOut_67_0;
              stackIn_68_0 = stackOut_67_0;
              if (var2 == 0) {
                stackOut_69_0 = this;
                stackOut_69_1 = 0;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                break L1;
              } else {
                stackOut_68_0 = this;
                stackOut_68_1 = 1;
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                break L1;
              }
            }
            L2: {
              ((qra) this).field_b = stackIn_70_1 != 0;
              if (((qra) this).field_k.field_b <= jm.field_m) {
                if (jm.field_m < 100 + ((qra) this).field_k.field_b) {
                  if (lba.field_p >= ((qra) this).field_k.field_i) {
                    if (20 + ((qra) this).field_k.field_i <= lba.field_p) {
                      stackOut_78_0 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      break L2;
                    } else {
                      stackOut_77_0 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      break L2;
                    }
                  } else {
                    stackOut_75_0 = 0;
                    stackIn_79_0 = stackOut_75_0;
                    break L2;
                  }
                } else {
                  stackOut_73_0 = 0;
                  stackIn_79_0 = stackOut_73_0;
                  break L2;
                }
              } else {
                stackOut_71_0 = 0;
                stackIn_79_0 = stackOut_71_0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_79_0;
              stackOut_79_0 = ((qra) this).field_a;
              stackIn_81_0 = stackOut_79_0;
              stackIn_80_0 = stackOut_79_0;
              if (var3 != 0) {
                stackOut_81_0 = (ko) (Object) stackIn_81_0;
                stackOut_81_1 = 0;
                stackIn_82_0 = stackOut_81_0;
                stackIn_82_1 = stackOut_81_1;
                break L3;
              } else {
                stackOut_80_0 = (ko) (Object) stackIn_80_0;
                stackOut_80_1 = -1;
                stackIn_82_0 = stackOut_80_0;
                stackIn_82_1 = stackOut_80_1;
                break L3;
              }
            }
            L4: {
              stackOut_82_0 = (ko) (Object) stackIn_82_0;
              stackOut_82_1 = stackIn_82_1;
              stackOut_82_2 = 85;
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              if (var2 != 0) {
                stackOut_84_0 = (ko) (Object) stackIn_84_0;
                stackOut_84_1 = stackIn_84_1;
                stackOut_84_2 = stackIn_84_2;
                stackOut_84_3 = 0;
                stackIn_85_0 = stackOut_84_0;
                stackIn_85_1 = stackOut_84_1;
                stackIn_85_2 = stackOut_84_2;
                stackIn_85_3 = stackOut_84_3;
                break L4;
              } else {
                stackOut_83_0 = (ko) (Object) stackIn_83_0;
                stackOut_83_1 = stackIn_83_1;
                stackOut_83_2 = stackIn_83_2;
                stackOut_83_3 = -1;
                stackIn_85_0 = stackOut_83_0;
                stackIn_85_1 = stackOut_83_1;
                stackIn_85_2 = stackOut_83_2;
                stackIn_85_3 = stackOut_83_3;
                break L4;
              }
            }
            ((ko) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_85_2, stackIn_85_3);
            ((qra) this).field_k.a(true, ((qra) this).field_b, true, 6);
            if (param0 == 7) {
              if (var2 != 0) {
                if (0 == hf.field_b) {
                  return;
                } else {
                  L5: {
                    stackOut_90_0 = 0;
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_91_0 = stackOut_90_0;
                    if (!((qra) this).field_h.field_D) {
                      stackOut_92_0 = stackIn_92_0;
                      stackOut_92_1 = 9;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      break L5;
                    } else {
                      stackOut_91_0 = stackIn_91_0;
                      stackOut_91_1 = 7;
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_93_1 = stackOut_91_1;
                      break L5;
                    }
                  }
                  ira.a(stackIn_93_0 != 0, stackIn_93_1, (byte) 97);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L6: {
              var2 = 0;
              stackOut_32_0 = this;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if (var2 == 0) {
                stackOut_34_0 = this;
                stackOut_34_1 = 0;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L6;
              } else {
                stackOut_33_0 = this;
                stackOut_33_1 = 1;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L6;
              }
            }
            L7: {
              ((qra) this).field_b = stackIn_35_1 != 0;
              if (((qra) this).field_k.field_b <= jm.field_m) {
                if (jm.field_m < 100 + ((qra) this).field_k.field_b) {
                  if (lba.field_p >= ((qra) this).field_k.field_i) {
                    if (20 + ((qra) this).field_k.field_i > lba.field_p) {
                      stackOut_43_0 = 1;
                      stackIn_45_0 = stackOut_43_0;
                      break L7;
                    } else {
                      stackOut_42_0 = 0;
                      stackIn_45_0 = stackOut_42_0;
                      break L7;
                    }
                  } else {
                    stackOut_40_0 = 0;
                    stackIn_45_0 = stackOut_40_0;
                    break L7;
                  }
                } else {
                  stackOut_38_0 = 0;
                  stackIn_45_0 = stackOut_38_0;
                  break L7;
                }
              } else {
                stackOut_36_0 = 0;
                stackIn_45_0 = stackOut_36_0;
                break L7;
              }
            }
            L8: {
              var3 = stackIn_45_0;
              stackOut_45_0 = ((qra) this).field_a;
              stackIn_47_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (var3 != 0) {
                stackOut_47_0 = (ko) (Object) stackIn_47_0;
                stackOut_47_1 = 0;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                break L8;
              } else {
                stackOut_46_0 = (ko) (Object) stackIn_46_0;
                stackOut_46_1 = -1;
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                break L8;
              }
            }
            L9: {
              stackOut_48_0 = (ko) (Object) stackIn_48_0;
              stackOut_48_1 = stackIn_48_1;
              stackOut_48_2 = 85;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              if (var2 != 0) {
                stackOut_50_0 = (ko) (Object) stackIn_50_0;
                stackOut_50_1 = stackIn_50_1;
                stackOut_50_2 = stackIn_50_2;
                stackOut_50_3 = 0;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                stackIn_51_2 = stackOut_50_2;
                stackIn_51_3 = stackOut_50_3;
                break L9;
              } else {
                stackOut_49_0 = (ko) (Object) stackIn_49_0;
                stackOut_49_1 = stackIn_49_1;
                stackOut_49_2 = stackIn_49_2;
                stackOut_49_3 = -1;
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_51_2 = stackOut_49_2;
                stackIn_51_3 = stackOut_49_3;
                break L9;
              }
            }
            ((ko) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_51_3);
            ((qra) this).field_k.a(true, ((qra) this).field_b, true, 6);
            if (param0 == 7) {
              if (var2 != 0) {
                if (0 == hf.field_b) {
                  return;
                } else {
                  L10: {
                    stackOut_56_0 = 0;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (!((qra) this).field_h.field_D) {
                      stackOut_58_0 = stackIn_58_0;
                      stackOut_58_1 = 9;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      break L10;
                    } else {
                      stackOut_57_0 = stackIn_57_0;
                      stackOut_57_1 = 7;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      break L10;
                    }
                  }
                  ira.a(stackIn_59_0 != 0, stackIn_59_1, (byte) 97);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L11: {
            var2 = 0;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L11;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L11;
            }
          }
          L12: {
            ((qra) this).field_b = stackIn_4_1 != 0;
            if (((qra) this).field_k.field_b <= jm.field_m) {
              if (jm.field_m < 100 + ((qra) this).field_k.field_b) {
                if (lba.field_p >= ((qra) this).field_k.field_i) {
                  if (20 + ((qra) this).field_k.field_i > lba.field_p) {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L12;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_14_0 = stackOut_11_0;
                    break L12;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_14_0 = stackOut_9_0;
                  break L12;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_14_0 = stackOut_7_0;
                break L12;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_14_0 = stackOut_5_0;
              break L12;
            }
          }
          L13: {
            var3 = stackIn_14_0;
            stackOut_14_0 = ((qra) this).field_a;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (var3 != 0) {
              stackOut_16_0 = (ko) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L13;
            } else {
              stackOut_15_0 = (ko) (Object) stackIn_15_0;
              stackOut_15_1 = -1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L13;
            }
          }
          L14: {
            stackOut_17_0 = (ko) (Object) stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = 85;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            if (var2 != 0) {
              stackOut_19_0 = (ko) (Object) stackIn_19_0;
              stackOut_19_1 = stackIn_19_1;
              stackOut_19_2 = stackIn_19_2;
              stackOut_19_3 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              break L14;
            } else {
              stackOut_18_0 = (ko) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = stackIn_18_2;
              stackOut_18_3 = -1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              break L14;
            }
          }
          ((ko) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2, stackIn_20_3);
          ((qra) this).field_k.a(true, ((qra) this).field_b, true, 6);
          if (param0 == 7) {
            if (var2 != 0) {
              if (0 == hf.field_b) {
                return;
              } else {
                L15: {
                  stackOut_25_0 = 0;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (!((qra) this).field_h.field_D) {
                    stackOut_27_0 = stackIn_27_0;
                    stackOut_27_1 = 9;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    break L15;
                  } else {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = 7;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L15;
                  }
                }
                ira.a(stackIn_28_0 != 0, stackIn_28_1, (byte) 97);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    qra(qh param0, v param1) {
        ((qra) this).field_c = param0.field_k;
        ((qra) this).field_f = param1;
        ((qra) this).field_h = param0;
        this.a((byte) -78);
    }

    final void d(int param0) {
        if (param0 != -27142) {
            return;
        }
        ((qra) this).field_k.a(false, ((qra) this).field_i, param0 + 27143, ((qra) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> is not a member, and cannot play with the current options.";
    }
}
