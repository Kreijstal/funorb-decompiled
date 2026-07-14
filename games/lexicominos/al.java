/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends nb {
    static ng field_C;
    private eg field_B;
    boolean field_D;
    private int field_E;
    static String field_G;
    static gk field_F;
    static ei field_H;

    private final int g(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= -70) {
          L0: {
            ((al) this).field_E = -87;
            if (!((al) this).field_D) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this != (Object) (Object) ((al) this).field_B.e(false)) {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 256;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!((al) this).field_D) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this != (Object) (Object) ((al) this).field_B.e(false)) {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 256;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((al) this).field_E != 0) {
          if (256 > ((al) this).field_E) {
            if (ki.field_c != null) {
              if (ki.field_c.field_p >= ((al) this).field_j) {
                if (((al) this).field_v > ki.field_c.field_u) {
                  ki.field_c = new db(((al) this).field_j, ((al) this).field_v);
                  de.a(ki.field_c, param0 + 121);
                  lf.a();
                  ((al) this).a(0, (byte) 115, 0);
                  super.a(param0, -((al) this).field_o + -param1, -param2 - ((al) this).field_t, param3);
                  pd.a(-22949);
                  ki.field_c.b(param2 - -((al) this).field_t, ((al) this).field_o + param1, ((al) this).field_E);
                  return;
                } else {
                  de.a(ki.field_c, param0 + 121);
                  lf.a();
                  ((al) this).a(0, (byte) 115, 0);
                  super.a(param0, -((al) this).field_o + -param1, -param2 - ((al) this).field_t, param3);
                  pd.a(-22949);
                  ki.field_c.b(param2 - -((al) this).field_t, ((al) this).field_o + param1, ((al) this).field_E);
                  return;
                }
              } else {
                ki.field_c = new db(((al) this).field_j, ((al) this).field_v);
                de.a(ki.field_c, param0 + 121);
                lf.a();
                ((al) this).a(0, (byte) 115, 0);
                super.a(param0, -((al) this).field_o + -param1, -param2 - ((al) this).field_t, param3);
                pd.a(-22949);
                ki.field_c.b(param2 - -((al) this).field_t, ((al) this).field_o + param1, ((al) this).field_E);
                return;
              }
            } else {
              ki.field_c = new db(((al) this).field_j, ((al) this).field_v);
              de.a(ki.field_c, param0 + 121);
              lf.a();
              ((al) this).a(0, (byte) 115, 0);
              super.a(param0, -((al) this).field_o + -param1, -param2 - ((al) this).field_t, param3);
              pd.a(-22949);
              ki.field_c.b(param2 - -((al) this).field_t, ((al) this).field_o + param1, ((al) this).field_E);
              return;
            }
          } else {
            if (-1 != (param3 ^ -1)) {
              return;
            } else {
              ((al) this).a(param1 - -((al) this).field_o, (byte) -99, ((al) this).field_t + param2);
              super.a((byte) -115, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(byte param0) {
        if (param0 == 26) {
          ((al) this).field_E = this.g(-101);
          if (0 == ((al) this).field_E) {
            if (((al) this).field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((al) this).a(-114, (byte) -25, 68);
          ((al) this).field_E = this.g(-101);
          if (0 == ((al) this).field_E) {
            if (((al) this).field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    al(eg param0, int param1, int param2) {
        super(-param1 + ql.field_O >> 203577121, kg.field_C - param2 >> -1914076895, param1, param2, (rd) null);
        ((al) this).field_D = false;
        ((al) this).field_E = 0;
        ((al) this).field_B = param0;
    }

    final w e(int param0) {
        w var2 = super.e(param0);
        if (var2 != null) {
            return var2;
        }
        return (w) this;
    }

    public static void d(byte param0) {
        if (param0 <= 0) {
            return;
        }
        field_G = null;
        field_F = null;
        field_C = null;
        field_H = null;
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var2 = this.g(-111);
          var3 = -((al) this).field_E + var2;
          if ((var3 ^ -1) < -1) {
            ((al) this).field_E = ((al) this).field_E + (-1 + (var3 + 8)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= -21) {
          if (0 > var3) {
            L1: {
              L2: {
                ((al) this).field_E = ((al) this).field_E + (var3 + -16 + 1) / 16;
                if (((al) this).field_E != 0) {
                  break L2;
                } else {
                  if (-1 != var2) {
                    break L2;
                  } else {
                    if (((al) this).field_D) {
                      break L2;
                    } else {
                      stackOut_34_0 = 1;
                      stackIn_36_0 = stackOut_34_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            }
            return stackIn_36_0 != 0;
          } else {
            L3: {
              L4: {
                if (((al) this).field_E != 0) {
                  break L4;
                } else {
                  if (-1 != var2) {
                    break L4;
                  } else {
                    if (((al) this).field_D) {
                      break L4;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L3;
            }
            return stackIn_30_0 != 0;
          }
        } else {
          Boolean discarded$1 = al.e((byte) -102);
          if (0 > var3) {
            ((al) this).field_E = ((al) this).field_E + (var3 + -16 + 1) / 16;
            if (((al) this).field_E == 0) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L5: {
                  if (((al) this).field_D) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (((al) this).field_E == 0) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L6: {
                  if (((al) this).field_D) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L6;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L6;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    abstract void a(int param0, byte param1, int param2);

    final static void a(int param0, String param1, float param2) {
        pb.field_j = param1;
        tl.field_g = param2;
        if (param0 != 16) {
            Boolean discarded$0 = al.e((byte) 114);
        }
    }

    final void b(int param0, int param1, int param2) {
        ((al) this).a(param2, param0, true, -param2 + kg.field_C >> -1925371807, ql.field_O - param0 >> -257670367);
        if (param1 >= -94) {
            field_H = null;
        }
    }

    final static Boolean e(byte param0) {
        if (param0 >= -109) {
            return null;
        }
        Boolean var1 = wh.field_d;
        wh.field_d = null;
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Create a free account to start using this feature";
        field_C = new ng();
        field_F = new gk();
    }
}
