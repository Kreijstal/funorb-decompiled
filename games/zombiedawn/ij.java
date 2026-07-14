/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends pa {
    static int field_E;
    static int field_I;
    private boolean field_D;
    static String field_J;
    private int field_O;
    private boolean field_K;
    private int field_G;
    private int field_N;
    private int field_Q;
    static int field_P;
    static String[] field_M;
    static u[] field_L;

    ij(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ij) this).field_Q = 2147483647;
        ((ij) this).field_G = 2147483647;
        ((ij) this).field_D = param8 ? true : false;
        ((ij) this).field_K = param7 ? true : false;
        ((ij) this).field_z = param6;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        if (param2) {
          if (((ij) this).a(param0, param1, 11098, param3)) {
            ((ij) this).a(param0, param3, 113, param1);
            ((ij) this).a(param0, param3, param1, -10643);
            StringBuilder discarded$4 = param1.append(" revert=").append(((ij) this).field_K);
            if ((((ij) this).field_Q ^ -1) != -2147483648) {
              if (2147483647 != ((ij) this).field_G) {
                StringBuilder discarded$5 = param1.append(" to ").append(((ij) this).field_Q).append(44).append(((ij) this).field_G);
                return param1;
              } else {
                return param1;
              }
            } else {
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          field_M = null;
          if (((ij) this).a(param0, param1, 11098, param3)) {
            ((ij) this).a(param0, param3, 113, param1);
            ((ij) this).a(param0, param3, param1, -10643);
            StringBuilder discarded$6 = param1.append(" revert=").append(((ij) this).field_K);
            if ((((ij) this).field_Q ^ -1) != -2147483648) {
              if (2147483647 == ((ij) this).field_G) {
                return param1;
              } else {
                StringBuilder discarded$7 = param1.append(" to ").append(((ij) this).field_Q).append(44).append(((ij) this).field_G);
                return param1;
              }
            } else {
              return param1;
            }
          } else {
            return param1;
          }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        ((ij) this).field_z.a(29, 0, 0, ((ij) this).field_i, ((ij) this).field_n);
        ((ij) this).field_G = ((ij) this).field_j;
        ((ij) this).field_Q = ((ij) this).field_k;
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (!param1) {
          return 57;
        } else {
          var3 = 0;
          L0: while (true) {
            if (0 >= param2) {
              return var3;
            } else {
              var3 = var3 << 85957921 | param0 & 1;
              param0 = param0 >>> 1;
              param2--;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        if (param1 <= 1) {
          field_I = -68;
          super.a(param0, 29, param2, param3, param4, param5);
          ((ij) this).field_m = 0;
          return;
        } else {
          super.a(param0, 29, param2, param3, param4, param5);
          ((ij) this).field_m = 0;
          return;
        }
    }

    final static eo h(int param0) {
        if (param0 < -26) {
          if (ic.field_S == fk.field_F) {
            throw new IllegalStateException();
          } else {
            if (hm.field_H != fk.field_F) {
              return null;
            } else {
              fk.field_F = ic.field_S;
              return mp.field_f;
            }
          }
        } else {
          field_E = -41;
          if (ic.field_S == fk.field_F) {
            throw new IllegalStateException();
          } else {
            if (hm.field_H != fk.field_F) {
              return null;
            } else {
              fk.field_F = ic.field_S;
              return mp.field_f;
            }
          }
        }
    }

    public static void g(int param0) {
        field_M = null;
        field_J = null;
        field_L = null;
        if (param0 != -1) {
            field_P = -19;
        }
    }

    final static int a(int param0, byte[] param1, byte param2, int param3) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var4 = -1;
        int var5 = 21 % ((55 - param2) / 52);
        for (var6 = param3; param0 > var6; var6++) {
            var4 = var4 >>> -1175648664 ^ ci.field_b[(var4 ^ param1[var6]) & 255];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        if (!(((ij) this).field_z instanceof an)) {
          if (-2 != (((ij) this).field_m ^ -1)) {
            if (((ij) this).field_K) {
              L0: {
                if (((ij) this).field_Q != ((ij) this).field_k) {
                  L1: {
                    var5 = ((ij) this).field_Q + -((ij) this).field_k;
                    stackOut_65_0 = this;
                    stackOut_65_1 = ((ij) this).field_k;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_67_0 = this;
                      stackOut_67_1 = stackIn_67_1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if (var5 <= 0) {
                        stackOut_69_0 = this;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = -1;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        break L1;
                      } else {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_70_2 = stackOut_68_2;
                        break L1;
                      }
                    } else {
                      stackOut_66_0 = this;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = var5 >> -2007616383;
                      stackIn_70_0 = stackOut_66_0;
                      stackIn_70_1 = stackOut_66_1;
                      stackIn_70_2 = stackOut_66_2;
                      break L1;
                    }
                  }
                  ((ij) this).field_k = stackIn_70_1 + stackIn_70_2;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((ij) this).field_G == ((ij) this).field_j) {
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              } else {
                L2: {
                  var5 = -((ij) this).field_j + ((ij) this).field_G;
                  stackOut_72_0 = this;
                  stackOut_72_1 = ((ij) this).field_j;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  if (2 >= Math.abs(var5)) {
                    stackOut_74_0 = this;
                    stackOut_74_1 = stackIn_74_1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if ((var5 ^ -1) >= -1) {
                      stackOut_76_0 = this;
                      stackOut_76_1 = stackIn_76_1;
                      stackOut_76_2 = -1;
                      stackIn_77_0 = stackOut_76_0;
                      stackIn_77_1 = stackOut_76_1;
                      stackIn_77_2 = stackOut_76_2;
                      break L2;
                    } else {
                      stackOut_75_0 = this;
                      stackOut_75_1 = stackIn_75_1;
                      stackOut_75_2 = 1;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_77_1 = stackOut_75_1;
                      stackIn_77_2 = stackOut_75_2;
                      break L2;
                    }
                  } else {
                    stackOut_73_0 = this;
                    stackOut_73_1 = stackIn_73_1;
                    stackOut_73_2 = var5 >> 322162881;
                    stackIn_77_0 = stackOut_73_0;
                    stackIn_77_1 = stackOut_73_1;
                    stackIn_77_2 = stackOut_73_2;
                    break L2;
                  }
                }
                ((ij) this).field_j = stackIn_77_1 + stackIn_77_2;
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              }
            } else {
              super.a(param0, (byte) 100, param2, param3);
              var5 = -91 % ((param1 - 46) / 42);
              return;
            }
          } else {
            var5 = ha.field_b - ((ij) this).field_O - param3;
            var6 = -param2 + (-((ij) this).field_N + ei.field_K);
            if (var5 == ((ij) this).field_k) {
              if (((ij) this).field_j != var6) {
                ((ij) this).field_j = var6;
                ((ij) this).field_k = var5;
                if (((ij) this).field_v instanceof tn) {
                  ((tn) (Object) ((ij) this).field_v).a(param2, -20962, (ij) this, param3);
                  super.a(param0, (byte) 100, param2, param3);
                  var5 = -91 % ((param1 - 46) / 42);
                  return;
                } else {
                  super.a(param0, (byte) 100, param2, param3);
                  var5 = -91 % ((param1 - 46) / 42);
                  return;
                }
              } else {
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              }
            } else {
              ((ij) this).field_j = var6;
              ((ij) this).field_k = var5;
              if (((ij) this).field_v instanceof tn) {
                ((tn) (Object) ((ij) this).field_v).a(param2, -20962, (ij) this, param3);
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              } else {
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              }
            }
          }
        } else {
          if (((an) (Object) ((ij) this).field_z).field_C) {
            if (-2 == (((ij) this).field_m ^ -1)) {
              var5 = ha.field_b - ((ij) this).field_O - param3;
              var6 = -param2 + (-((ij) this).field_N + ei.field_K);
              if (var5 == ((ij) this).field_k) {
                if (((ij) this).field_j != var6) {
                  ((ij) this).field_j = var6;
                  ((ij) this).field_k = var5;
                  if (((ij) this).field_v instanceof tn) {
                    ((tn) (Object) ((ij) this).field_v).a(param2, -20962, (ij) this, param3);
                    super.a(param0, (byte) 100, param2, param3);
                    var5 = -91 % ((param1 - 46) / 42);
                    return;
                  } else {
                    super.a(param0, (byte) 100, param2, param3);
                    var5 = -91 % ((param1 - 46) / 42);
                    return;
                  }
                } else {
                  super.a(param0, (byte) 100, param2, param3);
                  var5 = -91 % ((param1 - 46) / 42);
                  return;
                }
              } else {
                L3: {
                  ((ij) this).field_j = var6;
                  ((ij) this).field_k = var5;
                  if (!(((ij) this).field_v instanceof tn)) {
                    break L3;
                  } else {
                    ((tn) (Object) ((ij) this).field_v).a(param2, -20962, (ij) this, param3);
                    break L3;
                  }
                }
                super.a(param0, (byte) 100, param2, param3);
                var5 = -91 % ((param1 - 46) / 42);
                return;
              }
            } else {
              L4: {
                if (!((ij) this).field_K) {
                  break L4;
                } else {
                  L5: {
                    if (((ij) this).field_Q != ((ij) this).field_k) {
                      L6: {
                        var5 = ((ij) this).field_Q + -((ij) this).field_k;
                        stackOut_24_0 = this;
                        stackOut_24_1 = ((ij) this).field_k;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if ((Math.abs(var5) ^ -1) >= -3) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = stackIn_26_1;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          if (var5 <= 0) {
                            stackOut_28_0 = this;
                            stackOut_28_1 = stackIn_28_1;
                            stackOut_28_2 = -1;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            stackIn_29_2 = stackOut_28_2;
                            break L6;
                          } else {
                            stackOut_27_0 = this;
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = 1;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_29_1 = stackOut_27_1;
                            stackIn_29_2 = stackOut_27_2;
                            break L6;
                          }
                        } else {
                          stackOut_25_0 = this;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = var5 >> -2007616383;
                          stackIn_29_0 = stackOut_25_0;
                          stackIn_29_1 = stackOut_25_1;
                          stackIn_29_2 = stackOut_25_2;
                          break L6;
                        }
                      }
                      ((ij) this).field_k = stackIn_29_1 + stackIn_29_2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((ij) this).field_G != ((ij) this).field_j) {
                    L7: {
                      var5 = -((ij) this).field_j + ((ij) this).field_G;
                      stackOut_32_0 = this;
                      stackOut_32_1 = ((ij) this).field_j;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      if (2 >= Math.abs(var5)) {
                        stackOut_34_0 = this;
                        stackOut_34_1 = stackIn_34_1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_36_0 = this;
                          stackOut_36_1 = stackIn_36_1;
                          stackOut_36_2 = -1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L7;
                        } else {
                          stackOut_35_0 = this;
                          stackOut_35_1 = stackIn_35_1;
                          stackOut_35_2 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L7;
                        }
                      } else {
                        stackOut_33_0 = this;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = var5 >> 322162881;
                        stackIn_37_0 = stackOut_33_0;
                        stackIn_37_1 = stackOut_33_1;
                        stackIn_37_2 = stackOut_33_2;
                        break L7;
                      }
                    }
                    ((ij) this).field_j = stackIn_37_1 + stackIn_37_2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              super.a(param0, (byte) 100, param2, param3);
              var5 = -91 % ((param1 - 46) / 42);
              return;
            }
          } else {
            L8: {
              if (!((ij) this).field_K) {
                break L8;
              } else {
                L9: {
                  if (((ij) this).field_Q != ((ij) this).field_k) {
                    L10: {
                      var5 = ((ij) this).field_Q + -((ij) this).field_k;
                      stackOut_5_0 = this;
                      stackOut_5_1 = ((ij) this).field_k;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var5 <= 0) {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = -1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          break L10;
                        } else {
                          stackOut_8_0 = this;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          break L10;
                        }
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = var5 >> -2007616383;
                        stackIn_10_0 = stackOut_6_0;
                        stackIn_10_1 = stackOut_6_1;
                        stackIn_10_2 = stackOut_6_2;
                        break L10;
                      }
                    }
                    ((ij) this).field_k = stackIn_10_1 + stackIn_10_2;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (((ij) this).field_G != ((ij) this).field_j) {
                  L11: {
                    var5 = -((ij) this).field_j + ((ij) this).field_G;
                    stackOut_13_0 = this;
                    stackOut_13_1 = ((ij) this).field_j;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (2 >= Math.abs(var5)) {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L11;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L11;
                      }
                    } else {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = var5 >> 322162881;
                      stackIn_18_0 = stackOut_14_0;
                      stackIn_18_1 = stackOut_14_1;
                      stackIn_18_2 = stackOut_14_2;
                      break L11;
                    }
                  }
                  ((ij) this).field_j = stackIn_18_1 + stackIn_18_2;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            super.a(param0, (byte) 100, param2, param3);
            var5 = -91 % ((param1 - 46) / 42);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int var8 = 0;
        if (param1 == 1) {
          var8 = super.a(param0, param1 + 0, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 == 0) {
            if (((ij) this).b(param3, 21224, param2, param4, param0)) {
              L0: {
                ((ij) this).field_m = param5;
                if ((param5 ^ -1) == -2) {
                  ((ij) this).field_O = -((ij) this).field_k + (param0 - param4);
                  np.field_H = (ij) this;
                  ((ij) this).field_N = -((ij) this).field_j + (param3 + -param2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            if (!((ij) this).field_D) {
              if (((ij) this).b(param3, 21224, param2, param4, param0)) {
                L1: {
                  ((ij) this).field_m = param5;
                  if ((param5 ^ -1) == -2) {
                    ((ij) this).field_O = -((ij) this).field_k + (param0 - param4);
                    np.field_H = (ij) this;
                    ((ij) this).field_N = -((ij) this).field_j + (param3 + -param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          ((ij) this).field_N = 84;
          var8 = super.a(param0, param1 + 0, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((ij) this).field_D) {
              if (((ij) this).b(param3, 21224, param2, param4, param0)) {
                L2: {
                  ((ij) this).field_m = param5;
                  if ((param5 ^ -1) == -2) {
                    ((ij) this).field_O = -((ij) this).field_k + (param0 - param4);
                    np.field_H = (ij) this;
                    ((ij) this).field_N = -((ij) this).field_j + (param3 + -param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((ij) this).b(param3, 21224, param2, param4, param0)) {
              ((ij) this).field_m = param5;
              if ((param5 ^ -1) != -2) {
                return true;
              } else {
                ((ij) this).field_O = -((ij) this).field_k + (param0 - param4);
                np.field_H = (ij) this;
                ((ij) this).field_N = -((ij) this).field_j + (param3 + -param2);
                return true;
              }
            } else {
              return var8 != 0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "TOUGH";
        to.a(50, (byte) -102);
        field_M = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
