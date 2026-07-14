/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends g {
    private j field_D;
    private int field_H;
    static int field_F;
    boolean field_E;
    static ue field_J;
    static String[] field_I;
    static int field_G;

    final static int m(int param0) {
        if (param0 != -32749) {
            return -57;
        }
        return cc.field_d + -cb.field_i;
    }

    qf(j param0, int param1, int param2) {
        super(-param1 + lb.field_g >> -1668665087, kb.field_d + -param2 >> 1301484641, param1, param2, (ci) null);
        ((qf) this).field_D = param0;
        ((qf) this).field_E = false;
        ((qf) this).field_H = 0;
    }

    final void a(int param0, int param1, int param2) {
        ((qf) this).a(param0, -param0 + kb.field_d >> -711450815, param1, -param1 + lb.field_g >> -1756125151, true);
        if (param2 != -1) {
            field_J = (ue) null;
        }
    }

    abstract void b(int param0, byte param1, int param2);

    public static void n(int param0) {
        field_J = null;
        field_I = null;
        if (param0 != 8736) {
            int discarded$0 = qf.m(111);
        }
    }

    private final int l(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 66) {
          L0: {
            ((qf) this).field_D = (j) null;
            if (((qf) this).field_E) {
              if (this == (Object) (Object) ((qf) this).field_D.d((byte) 10)) {
                stackOut_11_0 = 256;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((qf) this).field_E) {
              if (this == (Object) (Object) ((qf) this).field_D.d((byte) 10)) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    final lk i(int param0) {
        lk var2 = null;
        var2 = this.i(param0 + 0);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 != -1) {
            field_F = -107;
            return (lk) this;
          } else {
            return (lk) this;
          }
        }
    }

    boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (param0) {
          L0: {
            var2 = this.l(70);
            var3 = var2 - ((qf) this).field_H;
            if (var3 < -1) {
              ((qf) this).field_H = ((qf) this).field_H + (var3 - -7) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 > var3) {
            L1: {
              L2: {
                ((qf) this).field_H = ((qf) this).field_H + (var3 + -16 - -1) / 16;
                if (0 != ((qf) this).field_H) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((qf) this).field_E) {
                      break L2;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (0 != ((qf) this).field_H) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((qf) this).field_E) {
                      break L4;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            boolean discarded$1 = ((qf) this).o(-76);
            var2 = this.l(70);
            var3 = var2 - ((qf) this).field_H;
            if (var3 < -1) {
              ((qf) this).field_H = ((qf) this).field_H + (var3 - -7) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (-1 > var3) {
            ((qf) this).field_H = ((qf) this).field_H + (var3 + -16 - -1) / 16;
            if (0 == ((qf) this).field_H) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (((qf) this).field_E) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (0 == ((qf) this).field_H) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((qf) this).field_E) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L7;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L7;
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

    boolean o(int param0) {
        if (param0 == 928516712) {
          ((qf) this).field_H = this.l(param0 ^ 928516616);
          if (((qf) this).field_H == 0) {
            if (((qf) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((qf) this).b(-79, (byte) -32, 90);
          ((qf) this).field_H = this.l(param0 ^ 928516616);
          if (((qf) this).field_H == 0) {
            if (((qf) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if ((((qf) this).field_H ^ -1) != param2) {
          if (256 <= ((qf) this).field_H) {
            if (param3 != 0) {
              return;
            } else {
              ((qf) this).b(param0 - -((qf) this).field_o, (byte) -77, ((qf) this).field_i + param1);
              this.a(param0, param1, -1, param3);
              return;
            }
          } else {
            if (null != ad.field_j) {
              if (((qf) this).field_h <= ad.field_j.field_p) {
                if (ad.field_j.field_o >= ((qf) this).field_q) {
                  dl.a(param2 ^ -128, ad.field_j);
                  vj.d();
                  ((qf) this).b(0, (byte) -77, 0);
                  this.a(-((qf) this).field_o + -param0, -((qf) this).field_i + -param1, -1, param3);
                  gg.a(14756);
                  ad.field_j.e(param0 + ((qf) this).field_o, param1 + ((qf) this).field_i, ((qf) this).field_H);
                  return;
                } else {
                  ad.field_j = new kc(((qf) this).field_h, ((qf) this).field_q);
                  dl.a(param2 ^ -128, ad.field_j);
                  vj.d();
                  ((qf) this).b(0, (byte) -77, 0);
                  this.a(-((qf) this).field_o + -param0, -((qf) this).field_i + -param1, -1, param3);
                  gg.a(14756);
                  ad.field_j.e(param0 + ((qf) this).field_o, param1 + ((qf) this).field_i, ((qf) this).field_H);
                  return;
                }
              } else {
                ad.field_j = new kc(((qf) this).field_h, ((qf) this).field_q);
                dl.a(param2 ^ -128, ad.field_j);
                vj.d();
                ((qf) this).b(0, (byte) -77, 0);
                this.a(-((qf) this).field_o + -param0, -((qf) this).field_i + -param1, -1, param3);
                gg.a(14756);
                ad.field_j.e(param0 + ((qf) this).field_o, param1 + ((qf) this).field_i, ((qf) this).field_H);
                return;
              }
            } else {
              ad.field_j = new kc(((qf) this).field_h, ((qf) this).field_q);
              dl.a(param2 ^ -128, ad.field_j);
              vj.d();
              ((qf) this).b(0, (byte) -77, 0);
              this.a(-((qf) this).field_o + -param0, -((qf) this).field_i + -param1, -1, param3);
              gg.a(14756);
              ad.field_j.e(param0 + ((qf) this).field_o, param1 + ((qf) this).field_i, ((qf) this).field_H);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
        field_I = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
