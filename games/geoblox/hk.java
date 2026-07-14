/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hk extends el {
    boolean field_y;
    static ei field_C;
    static int field_B;
    private boolean field_z;
    boolean field_D;
    static nd field_x;
    private boolean field_A;

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8 = 0;
        if (((hk) this).field_D) {
          if (((hk) this).a(param4, -1, param5, param0, param2)) {
            boolean discarded$2 = ((hk) this).a((byte) -116, param6);
            ((hk) this).field_f = param3;
            if (null != ((hk) this).field_u) {
              if (!(((hk) this).field_u instanceof ti)) {
                return true;
              } else {
                ((ti) (Object) ((hk) this).field_u).a(param0, -30896, param2, param4, (hk) this, param3, param5);
                return true;
              }
            } else {
              return true;
            }
          } else {
            var8 = 4 / ((param1 - -3) / 38);
            return false;
          }
        } else {
          var8 = 4 / ((param1 - -3) / 38);
          return false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (null == ((hk) this).field_u) {
            break L0;
          } else {
            if (((hk) this).field_u instanceof pl) {
              ((pl) (Object) ((hk) this).field_u).a(param2, (byte) -20, param0, param3, (hk) this);
              break L0;
            } else {
              if (param1 == -28922) {
                return;
              } else {
                field_B = -42;
                return;
              }
            }
          }
        }
        if (param1 != -28922) {
          field_B = -42;
          return;
        } else {
          return;
        }
    }

    public static void f(byte param0) {
        field_x = null;
        int var1 = -17 % ((param0 - 54) / 53);
        field_C = null;
    }

    hk(String param0, bb param1) {
        this(param0, hb.field_j.field_j, param1);
    }

    void a(boolean param0, int param1, el param2, int param3) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != ((hk) this).field_f) {
          if (gf.field_a != ((hk) this).field_f) {
            if (((hk) this).a(qa.field_a, -1, ue.field_e, param1, param3)) {
              if (-1 != (gf.field_a ^ -1)) {
                L0: {
                  stackOut_14_0 = this;
                  stackOut_14_1 = param3;
                  stackOut_14_2 = qa.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (param0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L0;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L0;
                  }
                }
                ((hk) this).a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, param2, param1, ue.field_e);
                return;
              } else {
                L1: {
                  ((hk) this).a(ue.field_e - param1, -28922, qa.field_a + -param3, ((hk) this).field_f);
                  stackOut_10_0 = this;
                  stackOut_10_1 = param3;
                  stackOut_10_2 = qa.field_a;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  if (param0) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = stackIn_12_2;
                    stackOut_12_3 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    break L1;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    break L1;
                  }
                }
                ((hk) this).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0, param2, param1, ue.field_e);
                return;
              }
            } else {
              L2: {
                stackOut_5_0 = this;
                stackOut_5_1 = param3;
                stackOut_5_2 = qa.field_a;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (param0) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L2;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  break L2;
                }
              }
              ((hk) this).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0, param2, param1, ue.field_e);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    hk(String param0, dh param1, bb param2) {
        super(param0, param1, param2);
        ((hk) this).field_D = true;
        ((hk) this).field_z = true;
        ((hk) this).field_A = false;
    }

    boolean a(int param0, int param1, char param2, el param3) {
        if (!((hk) this).e((byte) 54)) {
          if (param1 != 13) {
            ((hk) this).field_y = true;
            return false;
          } else {
            return false;
          }
        } else {
          if ((param0 ^ -1) != -85) {
            if (param0 != 83) {
              if (param1 != 13) {
                ((hk) this).field_y = true;
                return false;
              } else {
                return false;
              }
            } else {
              ((hk) this).a(-1, -28922, -1, 1);
              return true;
            }
          } else {
            ((hk) this).a(-1, -28922, -1, 1);
            return true;
          }
        }
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            boolean discarded$0 = ((hk) this).e((byte) -35);
            return ((hk) this).field_A;
        }
        return ((hk) this).field_A;
    }

    final void d(int param0) {
        if (param0 < -122) {
          if (((hk) this).field_A) {
            ((hk) this).field_A = false;
            if (null != ((hk) this).field_u) {
              if (((hk) this).field_u instanceof rk) {
                ((rk) (Object) ((hk) this).field_u).a(3520, (el) this, ((hk) this).field_A);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((hk) this).field_y = false;
          if (((hk) this).field_A) {
            ((hk) this).field_A = false;
            if (null != ((hk) this).field_u) {
              if (((hk) this).field_u instanceof rk) {
                ((rk) (Object) ((hk) this).field_u).a(3520, (el) this, ((hk) this).field_A);
                return;
              } else {
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

    final static void e(int param0) {
        rd.c(520);
        pc.a(4, false);
        if (param0 != 83) {
            hk.f((byte) -65);
        }
    }

    boolean a(byte param0, el param1) {
        if (((hk) this).field_D) {
          if (((hk) this).field_z) {
            L0: {
              param1.d(-128);
              ((hk) this).field_A = true;
              if (null == ((hk) this).field_u) {
                break L0;
              } else {
                if (((hk) this).field_u instanceof rk) {
                  ((rk) (Object) ((hk) this).field_u).a(3520, (el) this, ((hk) this).field_A);
                  break L0;
                } else {
                  if (param0 > -30) {
                    ((hk) this).field_A = true;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param0 > -30) {
              ((hk) this).field_A = true;
              return true;
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

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        if (param0 == 0) {
          if (((hk) this).a(param1, param3, 10095, param2)) {
            L0: {
              ((hk) this).a(param3, param2, 34, param1);
              if (((hk) this).field_y) {
                StringBuilder discarded$8 = param1.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (!((hk) this).field_D) {
              StringBuilder discarded$9 = param1.append(" disabled");
              return param1;
            } else {
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          hk.e(-5);
          if (((hk) this).a(param1, param3, 10095, param2)) {
            L1: {
              ((hk) this).a(param3, param2, 34, param1);
              if (((hk) this).field_y) {
                StringBuilder discarded$10 = param1.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((hk) this).field_D) {
              return param1;
            } else {
              StringBuilder discarded$11 = param1.append(" disabled");
              return param1;
            }
          } else {
            return param1;
          }
        }
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        if (null != ((hk) this).field_u) {
          if (((hk) this).field_u instanceof ti) {
            ((ti) (Object) ((hk) this).field_u).a(param4, param5, (byte) 55, (hk) this, param0, param1);
            if (!param2) {
              return;
            } else {
              ((hk) this).field_f = 0;
              return;
            }
          } else {
            if (!param2) {
              return;
            } else {
              ((hk) this).field_f = 0;
              return;
            }
          }
        } else {
          if (!param2) {
            return;
          } else {
            ((hk) this).field_f = 0;
            return;
          }
        }
    }

    protected hk() {
        ((hk) this).field_D = true;
        ((hk) this).field_z = true;
        ((hk) this).field_A = false;
        ((hk) this).field_q = hb.field_j.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_x = new nd();
    }
}
