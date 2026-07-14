/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fr extends qs {
    static String field_D;
    private int field_A;
    private int field_C;
    private int field_J;
    static String field_F;
    private boolean field_E;
    private boolean field_B;
    static String field_H;
    private int field_G;

    final static void f(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = (int)(1600.0 * (1.0 + Math.cos((double)((float)cl.field_n / 500.0f))));
        var2 = (int)(1600.0 * (-Math.sin((double)((float)cl.field_n / 500.0f)) + 1.0));
        if (param0 <= -28) {
          if (!fj.field_t.field_k) {
            ln.field_K.c(-var1 >> -950540796, -var2 >> -1246220924);
            return;
          } else {
            il.a(var1, 0, var2, ln.field_K);
            gf.f(0, 0, 640, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void h(int param0) {
        super.h(param0);
        ((fr) this).field_z.a(0, ((fr) this).field_n, (byte) 101, 0, ((fr) this).field_x);
        ((fr) this).field_J = ((fr) this).field_m;
        ((fr) this).field_C = ((fr) this).field_q;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        if (((fr) this).field_z instanceof kg) {
          if (((kg) (Object) ((fr) this).field_z).field_y) {
            if ((((fr) this).field_o ^ -1) != -2) {
              if (((fr) this).field_B) {
                L0: {
                  if (((fr) this).field_m != ((fr) this).field_J) {
                    L1: {
                      var5 = -((fr) this).field_m + ((fr) this).field_J;
                      stackOut_71_0 = this;
                      stackOut_71_1 = ((fr) this).field_m;
                      stackIn_75_0 = stackOut_71_0;
                      stackIn_75_1 = stackOut_71_1;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_75_0 = this;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = var5 >> -842827039;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        stackIn_76_2 = stackOut_75_2;
                        break L1;
                      } else {
                        stackOut_72_0 = this;
                        stackOut_72_1 = stackIn_72_1;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (-1 > (var5 ^ -1)) {
                          stackOut_74_0 = this;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = 1;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_76_1 = stackOut_74_1;
                          stackIn_76_2 = stackOut_74_2;
                          break L1;
                        } else {
                          stackOut_73_0 = this;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = -1;
                          stackIn_76_0 = stackOut_73_0;
                          stackIn_76_1 = stackOut_73_1;
                          stackIn_76_2 = stackOut_73_2;
                          break L1;
                        }
                      }
                    }
                    ((fr) this).field_m = stackIn_76_1 + stackIn_76_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((fr) this).field_C != ((fr) this).field_q) {
                  L2: {
                    L3: {
                      var5 = -((fr) this).field_q + ((fr) this).field_C;
                      stackOut_79_0 = this;
                      stackOut_79_1 = ((fr) this).field_q;
                      stackIn_83_0 = stackOut_79_0;
                      stackIn_83_1 = stackOut_79_1;
                      stackIn_80_0 = stackOut_79_0;
                      stackIn_80_1 = stackOut_79_1;
                      if ((Math.abs(var5) ^ -1) < -3) {
                        stackOut_83_0 = this;
                        stackOut_83_1 = stackIn_83_1;
                        stackOut_83_2 = var5 >> -312148607;
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        stackIn_84_2 = stackOut_83_2;
                        break L3;
                      } else {
                        stackOut_80_0 = this;
                        stackOut_80_1 = stackIn_80_1;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_82_1 = stackOut_80_1;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        if (var5 > 0) {
                          stackOut_82_0 = this;
                          stackOut_82_1 = stackIn_82_1;
                          stackOut_82_2 = 1;
                          stackIn_84_0 = stackOut_82_0;
                          stackIn_84_1 = stackOut_82_1;
                          stackIn_84_2 = stackOut_82_2;
                          break L3;
                        } else {
                          ((fr) this).field_q = stackIn_81_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((fr) this).field_q = stackIn_84_1 + stackIn_84_2;
                    break L2;
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              var5 = -param0 + (pd.field_k - ((fr) this).field_A);
              var6 = -((fr) this).field_G + (bb.field_b - param1);
              if (((fr) this).field_m != var5) {
                ((fr) this).field_m = var5;
                ((fr) this).field_q = var6;
                if (((fr) this).field_u instanceof cd) {
                  ((cd) (Object) ((fr) this).field_u).a((byte) 80, param1, (fr) this, param0);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((fr) this).field_q) {
                  ((fr) this).field_m = var5;
                  ((fr) this).field_q = var6;
                  if (!(((fr) this).field_u instanceof cd)) {
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    ((cd) (Object) ((fr) this).field_u).a((byte) 80, param1, (fr) this, param0);
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
          } else {
            if (!((fr) this).field_B) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((fr) this).field_m != ((fr) this).field_J) {
                  L5: {
                    var5 = -((fr) this).field_m + ((fr) this).field_J;
                    stackOut_39_0 = this;
                    stackOut_39_1 = ((fr) this).field_m;
                    stackIn_43_0 = stackOut_39_0;
                    stackIn_43_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_43_0 = this;
                      stackOut_43_1 = stackIn_43_1;
                      stackOut_43_2 = var5 >> -842827039;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      break L5;
                    } else {
                      stackOut_40_0 = this;
                      stackOut_40_1 = stackIn_40_1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_42_0 = this;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_44_2 = stackOut_42_2;
                        break L5;
                      } else {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = -1;
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_44_2 = stackOut_41_2;
                        break L5;
                      }
                    }
                  }
                  ((fr) this).field_m = stackIn_44_1 + stackIn_44_2;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((fr) this).field_C != ((fr) this).field_q) {
                L6: {
                  L7: {
                    var5 = -((fr) this).field_q + ((fr) this).field_C;
                    stackOut_47_0 = this;
                    stackOut_47_1 = ((fr) this).field_q;
                    stackIn_51_0 = stackOut_47_0;
                    stackIn_51_1 = stackOut_47_1;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_51_0 = this;
                      stackOut_51_1 = stackIn_51_1;
                      stackOut_51_2 = var5 >> -312148607;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      stackIn_52_2 = stackOut_51_2;
                      break L7;
                    } else {
                      stackOut_48_0 = this;
                      stackOut_48_1 = stackIn_48_1;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      if (var5 > 0) {
                        stackOut_50_0 = this;
                        stackOut_50_1 = stackIn_50_1;
                        stackOut_50_2 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_52_2 = stackOut_50_2;
                        break L7;
                      } else {
                        ((fr) this).field_q = stackIn_49_1 + -1;
                        break L6;
                      }
                    }
                  }
                  ((fr) this).field_q = stackIn_52_1 + stackIn_52_2;
                  break L6;
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        } else {
          if ((((fr) this).field_o ^ -1) != -2) {
            if (((fr) this).field_B) {
              L8: {
                if (((fr) this).field_m != ((fr) this).field_J) {
                  L9: {
                    var5 = -((fr) this).field_m + ((fr) this).field_J;
                    stackOut_17_0 = this;
                    stackOut_17_1 = ((fr) this).field_m;
                    stackIn_21_0 = stackOut_17_0;
                    stackIn_21_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = var5 >> -842827039;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      break L9;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L9;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = -1;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        break L9;
                      }
                    }
                  }
                  ((fr) this).field_m = stackIn_22_1 + stackIn_22_2;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (((fr) this).field_C != ((fr) this).field_q) {
                L10: {
                  L11: {
                    var5 = -((fr) this).field_q + ((fr) this).field_C;
                    stackOut_25_0 = this;
                    stackOut_25_1 = ((fr) this).field_q;
                    stackIn_29_0 = stackOut_25_0;
                    stackIn_29_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = var5 >> -312148607;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      break L11;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (var5 > 0) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        break L11;
                      } else {
                        ((fr) this).field_q = stackIn_27_1 + -1;
                        break L10;
                      }
                    }
                  }
                  ((fr) this).field_q = stackIn_30_1 + stackIn_30_2;
                  break L10;
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          } else {
            var5 = -param0 + (pd.field_k - ((fr) this).field_A);
            var6 = -((fr) this).field_G + (bb.field_b - param1);
            if (((fr) this).field_m != var5) {
              ((fr) this).field_m = var5;
              ((fr) this).field_q = var6;
              if (((fr) this).field_u instanceof cd) {
                ((cd) (Object) ((fr) this).field_u).a((byte) 80, param1, (fr) this, param0);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (var6 != ((fr) this).field_q) {
                L12: {
                  ((fr) this).field_m = var5;
                  ((fr) this).field_q = var6;
                  if (((fr) this).field_u instanceof cd) {
                    ((cd) (Object) ((fr) this).field_u).a((byte) 80, param1, (fr) this, param0);
                    super.a(param0, param1, param2, param3);
                    break L12;
                  } else {
                    super.a(param0, param1, param2, param3);
                    break L12;
                  }
                }
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        }
    }

    final static String a(String param0, int param1, char param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = param0.length();
        var5 = param3.length();
        var6 = var4;
        var7 = var5 - param1;
        if (0 == var7) {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L0: while (true) {
            var10 = param0.indexOf((int) param2, var9);
            if (var10 >= 0) {
              StringBuilder discarded$6 = var12.append(param0.substring(var9, var10));
              var9 = var10 + 1;
              StringBuilder discarded$7 = var12.append(param3);
              continue L0;
            } else {
              StringBuilder discarded$8 = var12.append(param0.substring(var9));
              return var12.toString();
            }
          }
        } else {
          var8_int = 0;
          L1: while (true) {
            var8_int = param0.indexOf((int) param2, var8_int);
            if (0 <= var8_int) {
              var6 = var6 + var7;
              var8_int++;
              continue L1;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                var10 = param0.indexOf((int) param2, var9);
                if (var10 >= 0) {
                  StringBuilder discarded$9 = var13.append(param0.substring(var9, var10));
                  var9 = var10 + 1;
                  StringBuilder discarded$10 = var13.append(param3);
                  continue L2;
                } else {
                  StringBuilder discarded$11 = var13.append(param0.substring(var9));
                  return var13.toString();
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((fr) this).field_o = 0;
    }

    private fr(int param0, int param1, int param2, int param3, iq param4, ko param5, vg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((fr) this).field_C = 2147483647;
        ((fr) this).field_J = 2147483647;
        ((fr) this).field_E = param8 ? true : false;
        ((fr) this).field_B = param7 ? true : false;
        ((fr) this).field_z = param6;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 0;
        var5 = 6 % ((64 - param0) / 61);
        if (((fr) this).a(false, param2, param3, param1)) {
          ((fr) this).a(param1, param2, false, param3);
          ((fr) this).a(81, param1, param2, param3);
          StringBuilder discarded$23 = param3.append(" revert=").append(((fr) this).field_B);
          if ((((fr) this).field_J ^ -1) != -2147483648) {
            if (((fr) this).field_C == 2147483647) {
              return param3;
            } else {
              StringBuilder discarded$24 = param3.append(" to ").append(((fr) this).field_J).append(44).append(((fr) this).field_C);
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          return param3;
        }
    }

    final static Boolean j(int param0) {
        if (param0 != 0) {
            return null;
        }
        Boolean var1 = sa.field_d;
        sa.field_d = null;
        return var1;
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, (byte) 118, param3, param4, param5, param6) ? 1 : 0;
        if (param2 > 95) {
          if (var8 == 0) {
            if (((fr) this).a(param1, 101, param3, param5, param4)) {
              L0: {
                if (-2 == (param0 ^ -1)) {
                  ((fr) this).field_A = -param4 + (param1 + -((fr) this).field_m);
                  oa.field_b = (fr) this;
                  ((fr) this).field_G = -param5 + -((fr) this).field_q + param3;
                  break L0;
                } else {
                  break L0;
                }
              }
              ((fr) this).field_o = param0;
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            if (!((fr) this).field_E) {
              if (((fr) this).a(param1, 101, param3, param5, param4)) {
                L1: {
                  if (-2 == (param0 ^ -1)) {
                    ((fr) this).field_A = -param4 + (param1 + -((fr) this).field_m);
                    oa.field_b = (fr) this;
                    ((fr) this).field_G = -param5 + -((fr) this).field_q + param3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((fr) this).field_o = param0;
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public static void i(int param0) {
        field_H = null;
        if (param0 != -950540796) {
            return;
        }
        field_D = null;
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Create a free account to start using this feature";
        field_F = "<%highlight>HOT KEYS</col> - For placement, fleet moves and fleet strength adjustment, <%key>'SHIFT'</col> will make changes in units of <%highlight>one fleet</col>, <%key>'ALT'</col> will use units of <%highlight>5 fleets</col>, and <%key>'CTRL'</col> will use <%highlight>all available fleets</col>.";
    }
}
