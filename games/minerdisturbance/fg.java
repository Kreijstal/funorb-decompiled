/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg {
    static ag field_d;
    static Calendar field_h;
    static String field_e;
    String field_f;
    static int field_b;
    String field_a;
    boolean field_g;
    static ea[] field_c;

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param0 == -1975005818) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 >= param1) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (97 > param1) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param1) {
                  L2: {
                    L3: {
                      if (97 > param1) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          var3 = null;
          fg.a((byte) -41, (sb) null);
          if (param1 >= 48) {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param1) {
                  L4: {
                    L5: {
                      if (97 > param1) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 < param1) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(byte param0, sl param1, int param2) {
        int var4 = 0;
        ld var5 = null;
        var5 = sn.field_c;
        if (param0 != 5) {
          return;
        } else {
          var5.d((byte) -81, param2);
          var5.field_o = var5.field_o + 1;
          var4 = var5.field_o;
          var5.c(1, param0 ^ 25561);
          var5.c(param1.field_n, 25564);
          var5.c(param1.field_p, param0 ^ 25561);
          var5.a((byte) 122, param1.field_t);
          var5.a((byte) 120, param1.field_s);
          var5.a((byte) 117, param1.field_r);
          var5.a((byte) 94, param1.field_o);
          int discarded$1 = var5.e(86, var4);
          var5.g(-1, var5.field_o - var4);
          return;
        }
    }

    final static String[][] a(int param0, sb param1) {
        ta var2 = null;
        String[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ta var6 = null;
        String[][] var7 = null;
        ta var8 = null;
        String[][] var9 = null;
        var5 = MinerDisturbance.field_ab;
        if (param0 == 65) {
          var6 = new ta();
          L0: while (true) {
            if (param1.field_u.length <= param1.field_o) {
              var7 = new String[var6.c((byte) -119)][];
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  return var3;
                } else {
                  var3[var4] = ((fn) (Object) var6.e(eg.a(param0, 63791))).field_n;
                  var4++;
                  continue L1;
                }
              }
            } else {
              var6.a((byte) -124, (pi) (Object) new fn(lm.a(param1, (byte) -101)));
              continue L0;
            }
          }
        } else {
          fg.a(-58);
          var8 = new ta();
          var2 = var8;
          L2: while (true) {
            if (param1.field_u.length <= param1.field_o) {
              var9 = new String[var8.c((byte) -119)][];
              var3 = var9;
              var4 = 0;
              L3: while (true) {
                if (var9.length <= var4) {
                  return var3;
                } else {
                  var3[var4] = ((fn) (Object) var8.e(eg.a(param0, 63791))).field_n;
                  var4++;
                  continue L3;
                }
              }
            } else {
              var8.a((byte) -124, (pi) (Object) new fn(lm.a(param1, (byte) -101)));
              continue L2;
            }
          }
        }
    }

    final static void a(byte param0, sb param1) {
        int var2 = 0;
        ah.field_b = param1.e(-25) << -515703259;
        var2 = param1.d((byte) -54);
        vb.field_b = (var2 & 7) << 1948267666;
        ah.field_b = ah.field_b + (var2 >> 132833827);
        vb.field_b = vb.field_b + (param1.e(param0 ^ 41) << -944889534);
        var2 = param1.d((byte) -54);
        tk.field_h = var2 << -1942808337 & 2064384;
        vb.field_b = vb.field_b + (var2 >> -1975005818);
        tk.field_h = tk.field_h + (param1.d((byte) -54) << -1706359097);
        if (param0 != -86) {
          field_e = null;
          var2 = param1.d((byte) -54);
          tk.field_h = tk.field_h + (var2 >> 1621629793);
          fl.field_c = var2 << -1318389136 & 65536;
          fl.field_c = fl.field_c + param1.e(param0 + 40);
          return;
        } else {
          var2 = param1.d((byte) -54);
          tk.field_h = tk.field_h + (var2 >> 1621629793);
          fl.field_c = var2 << -1318389136 & 65536;
          fl.field_c = fl.field_c + param1.e(param0 + 40);
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 > -99) {
          var2 = null;
          fg.a((byte) 10, (sl) null, 95);
          field_c = null;
          field_d = null;
          field_h = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ag();
        field_e = "Hydraulic fist: Gives strength to push rock.";
        field_h = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
