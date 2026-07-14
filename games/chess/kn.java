/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kn extends mf implements ra {
    static ug field_H;
    static String field_J;
    static String field_E;
    static md field_F;
    static ed field_D;
    static String field_K;
    mf field_M;
    static km field_G;
    static boolean field_L;
    static jc field_I;

    public static void e(byte param0) {
        field_I = null;
        field_F = null;
        field_D = null;
        field_H = null;
        field_K = null;
        if (param0 != 127) {
          boolean discarded$2 = kn.a((String) null, 18L, 28);
          field_J = null;
          field_E = null;
          field_G = null;
          return;
        } else {
          field_J = null;
          field_E = null;
          field_G = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        ((kn) this).h(param1 ^ -15582);
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        int var5 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackOut_28_0 = false;
        boolean stackOut_27_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_4_0 = false;
        if (((kn) this).field_M != null) {
          if (((kn) this).field_M.d((byte) -67)) {
            if (!((kn) this).field_M.a(param0, param1, -1, param3)) {
              var5 = param1;
              if ((var5 ^ -1) == -81) {
                L0: {
                  if (ok.field_Jb[81]) {
                    stackOut_28_0 = this.a(param3, 82);
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    stackOut_27_0 = this.a(param3, (byte) 2);
                    stackIn_29_0 = stackOut_27_0;
                    break L0;
                  }
                }
                return stackIn_29_0;
              } else {
                if (param2 != -1) {
                  field_D = null;
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          } else {
            var5 = param1;
            if ((var5 ^ -1) == -81) {
              L1: {
                if (ok.field_Jb[81]) {
                  stackOut_16_0 = this.a(param3, 82);
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = this.a(param3, (byte) 2);
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              return stackIn_17_0;
            } else {
              if (param2 != -1) {
                field_D = null;
                return false;
              } else {
                return false;
              }
            }
          }
        } else {
          var5 = param1;
          if ((var5 ^ -1) == -81) {
            L2: {
              if (ok.field_Jb[81]) {
                stackOut_5_0 = this.a(param3, 82);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = this.a(param3, (byte) 2);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          } else {
            if (param2 != -1) {
              field_D = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final static int a(boolean param0, boolean param1, String param2) {
        if (!param1) {
          if (param0) {
            return ce.field_a.b(param2);
          } else {
            return vj.field_d.b(param2);
          }
        } else {
          field_G = null;
          if (param0) {
            return ce.field_a.b(param2);
          } else {
            return vj.field_d.b(param2);
          }
        }
    }

    mf a(int param0) {
        if (param0 != 0) {
            return null;
        }
        mf var2 = ((kn) this).field_M;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.d((byte) -67))) {
            return var2;
        }
        return null;
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
            return true;
        }
        return null != ((kn) this).a(0) ? true : false;
    }

    final boolean a(int param0, mf param1) {
        if (param0 == 0) {
          if (((kn) this).field_M != null) {
            if (!((kn) this).field_M.a(0, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_J = null;
          if (((kn) this).field_M != null) {
            if (!((kn) this).field_M.a(0, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    kn(int param0, int param1, int param2, int param3, jm param4, rg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        Object var8 = null;
        if (null == ((kn) this).field_M) {
          if (param4 != 0) {
            var8 = null;
            boolean discarded$4 = ((kn) this).a(14, (mf) null);
            return;
          } else {
            return;
          }
        } else {
          ((kn) this).field_M.a(param0, param1, ((kn) this).field_u + param2, param3, 0, param5 + ((kn) this).field_r);
          if (param4 == 0) {
            return;
          } else {
            var8 = null;
            boolean discarded$5 = ((kn) this).a(14, (mf) null);
            return;
          }
        }
    }

    final int a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            mf discarded$10 = ((kn) this).a(59);
            if (((kn) this).field_M != null) {
              stackOut_7_0 = ((kn) this).field_M.a(true);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((kn) this).field_M != null) {
              stackOut_3_0 = ((kn) this).field_M.a(true);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    String g(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.g(param0);
        if (((kn) this).field_M != null) {
          var3 = ((kn) this).field_M.g(0);
          if (var3 != null) {
            return var3;
          } else {
            return var2;
          }
        } else {
          return var2;
        }
    }

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        if (param3 == 88) {
          if (((kn) this).field_M != null) {
            if (!((kn) this).field_M.a(param0, param1, param2, (byte) 88, param4, param5 - -((kn) this).field_r, param6 + ((kn) this).field_u)) {
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
    }

    private final boolean a(mf param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 2) {
          if (((kn) this).field_M != null) {
            if (((kn) this).field_M.d((byte) -67)) {
              return false;
            } else {
              L0: {
                if (!((kn) this).field_M.a(param1 ^ 2, param0)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_K = null;
          if (((kn) this).field_M != null) {
            if (((kn) this).field_M.d((byte) -67)) {
              return false;
            } else {
              L1: {
                if (!((kn) this).field_M.a(param1 ^ 2, param0)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    private final boolean a(mf param0, int param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = 19 % ((param1 - -62) / 43);
        if (((kn) this).field_M != null) {
          if (((kn) this).field_M.d((byte) -67)) {
            return false;
          } else {
            L0: {
              if (!((kn) this).field_M.a(0, param0)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final void d(int param0) {
        int var2 = -70 / ((param0 - 34) / 57);
        if (!(null == ((kn) this).field_M)) {
            ((kn) this).field_M.d(117);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 <= -80) {
          if (param1 == 0) {
            if (null == ((kn) this).field_n) {
              L0: {
                if (((kn) this).field_M != null) {
                  ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                ((kn) this).field_n.a((byte) 84, param3, param0, true, (mf) this);
                if (((kn) this).field_M != null) {
                  ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (((kn) this).field_M != null) {
                ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_L = true;
          if (param1 == 0) {
            if (null == ((kn) this).field_n) {
              L3: {
                if (((kn) this).field_M != null) {
                  ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                ((kn) this).field_n.a((byte) 84, param3, param0, true, (mf) this);
                if (((kn) this).field_M != null) {
                  ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (((kn) this).field_M != null) {
                ((kn) this).field_M.a(((kn) this).field_r + param0, param1, -96, ((kn) this).field_u + param3);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    void h(int param0) {
        if (!(null == ((kn) this).field_M)) {
            ((kn) this).field_M.c((byte) 90);
        }
        if (param0 != -15616) {
            boolean discarded$0 = ((kn) this).d((byte) -99);
            return;
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        if (param1 >= -6) {
          return;
        } else {
          L0: {
            super.a(param0, -109, param2, param3);
            if (((kn) this).field_M != null) {
              ((kn) this).field_M.a(param0 - -((kn) this).field_u, -30, param2, ((kn) this).field_r + param3);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        StringBuilder discarded$8 = param2.append(10);
        var5 = 0;
        L0: while (true) {
          if (param3 < var5) {
            if (param1 < -24) {
              if (null != ((kn) this).field_M) {
                StringBuilder discarded$9 = ((kn) this).field_M.a(param0, param3 + 1, param2, 1);
                return;
              } else {
                StringBuilder discarded$10 = param2.append("null");
                return;
              }
            } else {
              return;
            }
          } else {
            StringBuilder discarded$11 = param2.append(32);
            var5++;
            continue L0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 59) {
          if (((kn) this).field_M != null) {
            if (!((kn) this).field_M.d((byte) -67)) {
              return false;
            } else {
              L0: {
                if (!((kn) this).field_M.a(91, param1, param2, param3, param4, param5, param6)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var9 = null;
          boolean discarded$1 = this.a((mf) null, -84);
          if (((kn) this).field_M != null) {
            if (!((kn) this).field_M.d((byte) -67)) {
              return false;
            } else {
              L1: {
                if (!((kn) this).field_M.a(91, param1, param2, param3, param4, param5, param6)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, long param1, int param2) {
        ve var4 = null;
        if (param2 == 29712) {
          var4 = mn.a(param2 ^ -29713, param0);
          if (var4 == null) {
            if (pd.field_Rb != null) {
              if (null == mi.a(param2 ^ 134188015, param1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (var4.field_Lb == null) {
              if (pd.field_Rb != null) {
                if (null != mi.a(param2 ^ 134188015, param1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        if (!((kn) this).a(param1, param0, param2, param3 + -68)) {
          if (param3 != 1) {
            field_G = null;
            return param2;
          } else {
            return param2;
          }
        } else {
          ((kn) this).a(param0, param2, param1, false);
          ((kn) this).a(param0, (byte) -101, param2, param1);
          if (param3 == 1) {
            return param2;
          } else {
            field_G = null;
            return param2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Disruptive behaviour";
        field_E = "Buying or selling an account";
        field_H = new ug(2);
        field_K = "Offensive account name";
        field_D = new ed();
        field_L = true;
    }
}
