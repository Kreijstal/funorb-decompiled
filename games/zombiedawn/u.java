/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class u {
    private int field_m;
    static int[] field_d;
    boolean field_k;
    private vn[] field_i;
    int field_l;
    private int field_n;
    private int field_g;
    int field_b;
    static sn field_e;
    private boolean field_c;
    int field_a;
    int field_h;
    private int field_j;
    static String field_f;

    private final void a(byte param0) {
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        ((u) this).field_h = 4;
        if (param0 > 71) {
          if (((u) this).field_b != 2) {
            if (((u) this).field_b != 1) {
              if (((u) this).field_b == 0) {
                ((u) this).field_a = pb.a(so.field_a, 20, 1) + 87 << 4;
                return;
              } else {
                return;
              }
            } else {
              ((u) this).field_a = pb.a(so.field_a, 50, 1) + 90 << 4;
              return;
            }
          } else {
            ((u) this).field_a = 130 - -pb.a(so.field_a, 77, 1) << 4;
            return;
          }
        } else {
          ((u) this).field_m = -75;
          if (((u) this).field_b != 2) {
            if (((u) this).field_b != 1) {
              if (((u) this).field_b != 0) {
                return;
              } else {
                ((u) this).field_a = pb.a(so.field_a, 20, 1) + 87 << 4;
                return;
              }
            } else {
              ((u) this).field_a = pb.a(so.field_a, 50, 1) + 90 << 4;
              return;
            }
          } else {
            ((u) this).field_a = 130 - -pb.a(so.field_a, 77, 1) << 4;
            return;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          int fieldTemp$6 = ((u) this).field_g;
          ((u) this).field_g = ((u) this).field_g + 1;
          if (30 > fieldTemp$6) {
            break L0;
          } else {
            ((u) this).field_g = 0;
            int fieldTemp$7 = ((u) this).field_n + 1;
            ((u) this).field_n = ((u) this).field_n + 1;
            if (fieldTemp$7 > 3) {
              ((u) this).field_n = 0;
              break L0;
            } else {
              if (param0 == ((u) this).field_b) {
                ((u) this).field_n = 0;
                if (((u) this).field_k) {
                  int fieldTemp$8 = ((u) this).field_m;
                  ((u) this).field_m = ((u) this).field_m - 1;
                  if (0 < fieldTemp$8) {
                    if (!this.a(param0 + -93)) {
                      L1: {
                        stackOut_25_0 = this;
                        stackOut_25_1 = ((u) this).field_l;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (((u) this).field_l < ((u) this).field_a) {
                          stackOut_27_0 = this;
                          stackOut_27_1 = stackIn_27_1;
                          stackOut_27_2 = ((u) this).field_h;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          break L1;
                        } else {
                          stackOut_26_0 = this;
                          stackOut_26_1 = stackIn_26_1;
                          stackOut_26_2 = -((u) this).field_h;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_28_2 = stackOut_26_2;
                          break L1;
                        }
                      }
                      ((u) this).field_l = stackIn_28_1 + stackIn_28_2;
                      return;
                    } else {
                      ((u) this).field_k = true;
                      ((u) this).field_m = pb.a(so.field_a, 20, 1);
                      return;
                    }
                  } else {
                    ((u) this).field_k = false;
                    this.a((byte) 126);
                    return;
                  }
                } else {
                  if (!this.a(param0 + -93)) {
                    L2: {
                      stackOut_16_0 = this;
                      stackOut_16_1 = ((u) this).field_l;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (((u) this).field_l < ((u) this).field_a) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = ((u) this).field_h;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L2;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -((u) this).field_h;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L2;
                      }
                    }
                    ((u) this).field_l = stackIn_19_1 + stackIn_19_2;
                    return;
                  } else {
                    ((u) this).field_k = true;
                    ((u) this).field_m = pb.a(so.field_a, 20, 1);
                    return;
                  }
                }
              } else {
                L3: {
                  if (!((u) this).field_k) {
                    break L3;
                  } else {
                    int fieldTemp$9 = ((u) this).field_m;
                    ((u) this).field_m = ((u) this).field_m - 1;
                    if (0 < fieldTemp$9) {
                      break L3;
                    } else {
                      ((u) this).field_k = false;
                      this.a((byte) 126);
                      return;
                    }
                  }
                }
                if (!this.a(param0 + -93)) {
                  L4: {
                    stackOut_8_0 = this;
                    stackOut_8_1 = ((u) this).field_l;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (((u) this).field_l < ((u) this).field_a) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = ((u) this).field_h;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L4;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = -((u) this).field_h;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L4;
                    }
                  }
                  ((u) this).field_l = stackIn_11_1 + stackIn_11_2;
                  return;
                } else {
                  ((u) this).field_k = true;
                  ((u) this).field_m = pb.a(so.field_a, 20, 1);
                  return;
                }
              }
            }
          }
        }
        if (param0 != ((u) this).field_b) {
          if (((u) this).field_k) {
            int fieldTemp$10 = ((u) this).field_m;
            ((u) this).field_m = ((u) this).field_m - 1;
            if (0 < fieldTemp$10) {
              if (this.a(param0 + -93)) {
                ((u) this).field_k = true;
                ((u) this).field_m = pb.a(so.field_a, 20, 1);
                return;
              } else {
                L5: {
                  stackOut_60_0 = this;
                  stackOut_60_1 = ((u) this).field_l;
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  if (((u) this).field_l < ((u) this).field_a) {
                    stackOut_62_0 = this;
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = ((u) this).field_h;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    stackIn_63_2 = stackOut_62_2;
                    break L5;
                  } else {
                    stackOut_61_0 = this;
                    stackOut_61_1 = stackIn_61_1;
                    stackOut_61_2 = -((u) this).field_h;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_63_2 = stackOut_61_2;
                    break L5;
                  }
                }
                ((u) this).field_l = stackIn_63_1 + stackIn_63_2;
                return;
              }
            } else {
              ((u) this).field_k = false;
              this.a((byte) 126);
              return;
            }
          } else {
            if (!this.a(param0 + -93)) {
              L6: {
                stackOut_52_0 = this;
                stackOut_52_1 = ((u) this).field_l;
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (((u) this).field_l < ((u) this).field_a) {
                  stackOut_54_0 = this;
                  stackOut_54_1 = stackIn_54_1;
                  stackOut_54_2 = ((u) this).field_h;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L6;
                } else {
                  stackOut_53_0 = this;
                  stackOut_53_1 = stackIn_53_1;
                  stackOut_53_2 = -((u) this).field_h;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L6;
                }
              }
              ((u) this).field_l = stackIn_55_1 + stackIn_55_2;
              return;
            } else {
              ((u) this).field_k = true;
              ((u) this).field_m = pb.a(so.field_a, 20, 1);
              return;
            }
          }
        } else {
          ((u) this).field_n = 0;
          if (((u) this).field_k) {
            int fieldTemp$11 = ((u) this).field_m;
            ((u) this).field_m = ((u) this).field_m - 1;
            if (0 < fieldTemp$11) {
              if (!this.a(param0 + -93)) {
                L7: {
                  stackOut_44_0 = this;
                  stackOut_44_1 = ((u) this).field_l;
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  if (((u) this).field_l < ((u) this).field_a) {
                    stackOut_46_0 = this;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = ((u) this).field_h;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    stackIn_47_2 = stackOut_46_2;
                    break L7;
                  } else {
                    stackOut_45_0 = this;
                    stackOut_45_1 = stackIn_45_1;
                    stackOut_45_2 = -((u) this).field_h;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    stackIn_47_2 = stackOut_45_2;
                    break L7;
                  }
                }
                ((u) this).field_l = stackIn_47_1 + stackIn_47_2;
                return;
              } else {
                ((u) this).field_k = true;
                ((u) this).field_m = pb.a(so.field_a, 20, 1);
                return;
              }
            } else {
              ((u) this).field_k = false;
              this.a((byte) 126);
              return;
            }
          } else {
            if (!this.a(param0 + -93)) {
              L8: {
                stackOut_35_0 = this;
                stackOut_35_1 = ((u) this).field_l;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (((u) this).field_l < ((u) this).field_a) {
                  stackOut_37_0 = this;
                  stackOut_37_1 = stackIn_37_1;
                  stackOut_37_2 = ((u) this).field_h;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L8;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = stackIn_36_1;
                  stackOut_36_2 = -((u) this).field_h;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L8;
                }
              }
              ((u) this).field_l = stackIn_38_1 + stackIn_38_2;
              return;
            } else {
              ((u) this).field_k = true;
              ((u) this).field_m = pb.a(so.field_a, 20, 1);
              return;
            }
          }
        }
    }

    private final boolean a(int param0) {
        int var2 = 60 % ((0 - param0) / 41);
        return Math.abs((((u) this).field_l >> 4) - (((u) this).field_a >> 4)) <= ((u) this).field_h ? true : false;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var2 = -126 / ((param0 - 56) / 57);
        var3 = ((u) this).field_j * bd.field_e / 640;
        if (((u) this).field_b != 1) {
          if (0 == ((u) this).field_b) {
            ((u) this).field_i[((u) this).field_n].c(((u) this).field_j, nh.field_P + -(((u) this).field_l >> 4));
            if (640 < bd.field_e) {
              ((u) this).field_i[((u) this).field_n].b(640 + ((u) this).field_j, -(((u) this).field_l >> 4) + nh.field_P);
              return;
            } else {
              return;
            }
          } else {
            if (((u) this).field_c) {
              ((u) this).field_i[((u) this).field_n].c(var3, -(((u) this).field_l >> 4) + nh.field_P);
              return;
            } else {
              ((u) this).field_i[((u) this).field_n].b(var3, nh.field_P - (((u) this).field_l >> 4));
              return;
            }
          }
        } else {
          ((u) this).field_i[((u) this).field_n].b(var3, nh.field_P - (((u) this).field_l >> 4), 150, 13056);
          return;
        }
    }

    public static void b() {
        field_f = null;
        field_d = null;
        field_e = null;
    }

    u(vn[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((u) this).field_k = false;
        try {
          L0: {
            L1: {
              ((u) this).field_j = param2;
              ((u) this).field_h = 4;
              ((u) this).field_b = param1;
              ((u) this).field_i = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 == pb.a(so.field_a, 2, 1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((u) this).field_c = stackIn_4_1 != 0;
              ((u) this).field_n = pb.a(so.field_a, 3, 1);
              if (-1 != ((u) this).field_b) {
                break L2;
              } else {
                ((u) this).field_n = 0;
                ((u) this).field_c = false;
                break L2;
              }
            }
            L3: {
              L4: {
                ((u) this).field_g = pb.a(so.field_a, 30, 1);
                if (-3 != ((u) this).field_b) {
                  if (((u) this).field_b == 1) {
                    ((u) this).field_l = 90 - -pb.a(so.field_a, 50, 1) << 4;
                    break L4;
                  } else {
                    if (((u) this).field_b == 0) {
                      ((u) this).field_l = pb.a(so.field_a, 20, 1) + 87 << 4;
                      break L4;
                    } else {
                      this.a((byte) 95);
                      break L3;
                    }
                  }
                } else {
                  ((u) this).field_l = pb.a(so.field_a, 77, 1) + 130 << 4;
                  break L4;
                }
              }
              this.a((byte) 95);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("u.<init>(");
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{170, 150, 140, 160};
        field_e = new sn("");
        field_f = "Waiting for music";
    }
}
