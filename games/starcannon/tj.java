/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tj extends kf {
    static String field_y;
    static int field_C;
    private int field_E;
    private int field_x;
    private int field_z;
    static int field_w;
    private boolean field_D;
    private int field_A;
    private boolean field_B;
    static int field_G;

    private tj(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((tj) this).field_E = 2147483647;
        ((tj) this).field_z = 2147483647;
        ((tj) this).field_B = param8 ? true : false;
        ((tj) this).field_t = param6;
        ((tj) this).field_D = param7 ? true : false;
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8 = 0;
        L0: {
          var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 == 0) {
            break L0;
          } else {
            if (((tj) this).field_B) {
              return true;
            } else {
              break L0;
            }
          }
        }
        if (!((tj) this).a(param3, param2, param1, param5, -12790)) {
          return var8 != 0;
        } else {
          L1: {
            if (1 != param6) {
              break L1;
            } else {
              il.field_k = (tj) this;
              ((tj) this).field_A = param5 - (((tj) this).field_s + param2);
              ((tj) this).field_x = param1 + -((tj) this).field_j + -param3;
              break L1;
            }
          }
          ((tj) this).field_l = param6;
          return true;
        }
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((tj) this).field_l = 0;
    }

    final static int a(int param0, int param1, re param2, vc param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = StarCannon.field_A;
          if (param3 == null) {
            break L0;
          } else {
            if (null == param3.field_o) {
              break L0;
            } else {
              if (param2 == null) {
                break L0;
              } else {
                if (param2.field_n == param3.field_i) {
                  var4 = param2.field_o.length;
                  var5 = param3.field_o[param0].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var5 <= var6) {
                      L2: {
                        if (param1 == -1) {
                          break L2;
                        } else {
                          var9 = null;
                          boolean discarded$1 = tj.a((byte) -65, true, (CharSequence) null);
                          break L2;
                        }
                      }
                      return -1;
                    } else {
                      if ((param2.field_k ^ -1L) == (param3.field_g[param0][var6] ^ -1L)) {
                        if (mc.a(param3.field_n[param0][var6], 0)) {
                          var7 = 0;
                          L3: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param2.field_o[var7] == param3.field_o[param0][var4 * var6 + var7]) {
                                var6 = var6;
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(byte param0, dg param1, int param2) {
        ia var5 = d.field_b;
        var5.d((byte) 100, param2);
        var5.field_g = var5.field_g + 1;
        int var4 = var5.field_g;
        var5.a(1, -70);
        var5.a(param1.field_k, -57);
        var5.d(5918, param1.field_f);
        var5.c((byte) -97, param1.field_h);
        if (param0 != 69) {
            field_G = 121;
        }
        var5.c((byte) -109, param1.field_m);
        var5.c((byte) -89, param1.field_g);
        var5.c((byte) -88, param1.field_i);
        int discarded$0 = var5.b((byte) -128, var4);
        var5.b(var5.field_g - var4, 31700);
    }

    final void a(int param0, int param1, uj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
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
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        L0: {
          L1: {
            L2: {
              if (!(((tj) this).field_t instanceof dk)) {
                break L2;
              } else {
                if (!((dk) (Object) ((tj) this).field_t).field_u) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (-2 != (((tj) this).field_l ^ -1)) {
              break L1;
            } else {
              L3: {
                var5 = -((tj) this).field_A + (pe.field_d - param1);
                var6 = -param3 + (la.field_c + -((tj) this).field_x);
                if (var5 != ((tj) this).field_s) {
                  break L3;
                } else {
                  if (var6 == ((tj) this).field_j) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              ((tj) this).field_j = var6;
              ((tj) this).field_s = var5;
              if (!(((tj) this).field_g instanceof wb)) {
                break L0;
              } else {
                ((wb) (Object) ((tj) this).field_g).a((tj) this, (byte) 117, param1, param3);
                break L0;
              }
            }
          }
          if (!((tj) this).field_D) {
            break L0;
          } else {
            L4: {
              if (((tj) this).field_s != ((tj) this).field_z) {
                L5: {
                  var5 = -((tj) this).field_s + ((tj) this).field_z;
                  stackOut_13_0 = this;
                  stackOut_13_1 = ((tj) this).field_s;
                  stackIn_17_0 = stackOut_13_0;
                  stackIn_17_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (2 < Math.abs(var5)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = var5 >> 1914981857;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L5;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = stackIn_14_1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if ((var5 ^ -1) < -1) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L5;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = -1;
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_18_1 = stackOut_15_1;
                      stackIn_18_2 = stackOut_15_2;
                      break L5;
                    }
                  }
                }
                ((tj) this).field_s = stackIn_18_1 + stackIn_18_2;
                break L4;
              } else {
                break L4;
              }
            }
            if (((tj) this).field_E != ((tj) this).field_j) {
              L6: {
                var5 = -((tj) this).field_j + ((tj) this).field_E;
                stackOut_21_0 = this;
                stackOut_21_1 = ((tj) this).field_j;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if ((Math.abs(var5) ^ -1) >= -3) {
                  stackOut_23_0 = this;
                  stackOut_23_1 = stackIn_23_1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if ((var5 ^ -1) < -1) {
                    stackOut_25_0 = this;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L6;
                  } else {
                    stackOut_24_0 = this;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L6;
                  }
                } else {
                  stackOut_22_0 = this;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = var5 >> 1198063905;
                  stackIn_26_0 = stackOut_22_0;
                  stackIn_26_1 = stackOut_22_1;
                  stackIn_26_2 = stackOut_22_2;
                  break L6;
                }
              }
              ((tj) this).field_j = stackIn_26_1 + stackIn_26_2;
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param0 >= 27) {
          super.a(98, param1, param2, param3);
          return;
        } else {
          return;
        }
    }

    final static id[] h(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        id[] var1 = new id[bj.field_b];
        for (var2 = 0; var2 < bj.field_b; var2++) {
            var1[var2] = new id(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], og.field_c[var2], of.field_g);
        }
        var2 = -67 / ((-49 - param0) / 58);
        rc.b((byte) 123);
        return var1;
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 >= -113) {
            tj.g(104);
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        if (param2 != null) {
          L0: {
            var3 = param2.length();
            if (-2 < var3) {
              break L0;
            } else {
              if (-13 < var3) {
                break L0;
              } else {
                L1: {
                  if (param0 <= -58) {
                    break L1;
                  } else {
                    field_C = 43;
                    break L1;
                  }
                }
                L2: {
                  var4 = ni.a(127, param2);
                  if (var4 == null) {
                    break L2;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L2;
                    } else {
                      L3: {
                        if (dk.a((byte) -121, var4.charAt(0))) {
                          break L3;
                        } else {
                          if (dk.a((byte) -127, var4.charAt(var4.length() + -1))) {
                            break L3;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= param2.length()) {
                                if (0 < var5) {
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                L5: {
                                  var7 = param2.charAt(var6);
                                  if (dk.a((byte) -122, (char) var7)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param1) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (((tj) this).a(param0, 0, param1, param3)) {
            ((tj) this).a(param0, param1, param3, 19103);
            ((tj) this).a(param0, param3, -349, param1);
            StringBuilder discarded$22 = param1.append(" revert=").append(((tj) this).field_D);
            if (2147483647 != ((tj) this).field_z) {
                if ((((tj) this).field_E ^ -1) != -2147483648) {
                    StringBuilder discarded$23 = param1.append(" to ").append(((tj) this).field_z).append(44).append(((tj) this).field_E);
                }
            }
        }
        if (param2 != 39) {
            return null;
        }
        return param1;
    }

    final void f(int param0) {
        super.f(-77);
        ((tj) this).field_t.a(0, ((tj) this).field_i, (byte) 122, ((tj) this).field_f, 0);
        ((tj) this).field_E = ((tj) this).field_j;
        ((tj) this).field_z = ((tj) this).field_s;
        int var2 = 98 / ((47 - param0) / 52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Password: ";
    }
}
