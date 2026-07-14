/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ri extends lc {
    static boolean field_z;
    static uf field_C;
    static byte[][][] field_B;
    private pf field_E;
    boolean field_D;
    private int field_A;

    private final int k(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 != 0) {
          L0: {
            lk discarded$1 = ((ri) this).d((byte) 91);
            if (!((ri) this).field_D) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this == (Object) (Object) ((ri) this).field_E.a(false)) {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!((ri) this).field_D) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this == (Object) (Object) ((ri) this).field_E.a(false)) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    ri(pf param0, int param1, int param2) {
        super(ob.field_a - param1 >> -1771514399, -param2 + gi.field_e >> -1298539775, param1, param2, (fc) null);
        ((ri) this).field_D = false;
        ((ri) this).field_E = param0;
        ((ri) this).field_A = 0;
    }

    final static tg[] a(String param0, gk param1, boolean param2, String param3) {
        int var4 = param1.a(param0, param2);
        int var5 = param1.a(var4, param3, 125);
        return fl.a(-69, var4, param1, var5);
    }

    final lk d(byte param0) {
        lk var2 = super.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (lk) this;
    }

    boolean f(byte param0) {
        if (param0 == -33) {
          ((ri) this).field_A = this.k(0);
          if (((ri) this).field_A == 0) {
            if (((ri) this).field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ri) this).field_E = null;
          ((ri) this).field_A = this.k(0);
          if (((ri) this).field_A == 0) {
            if (((ri) this).field_D) {
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
        if (0 != ((ri) this).field_A) {
          if (((ri) this).field_A >= 256) {
            if (0 != param0) {
              return;
            } else {
              ((ri) this).b(param1 - -((ri) this).field_i, -104, ((ri) this).field_r + param3);
              super.a(param0, param1, 105, param3);
              return;
            }
          } else {
            if (ml.field_d != null) {
              if (ml.field_d.field_s >= ((ri) this).field_k) {
                if (ml.field_d.field_q >= ((ri) this).field_m) {
                  kh.a(ml.field_d, 1);
                  na.a();
                  ((ri) this).b(0, -11, 0);
                  if (param2 < 33) {
                    ((ri) this).field_D = true;
                    super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                    return;
                  } else {
                    super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                    return;
                  }
                } else {
                  ml.field_d = new tg(((ri) this).field_k, ((ri) this).field_m);
                  kh.a(ml.field_d, 1);
                  na.a();
                  ((ri) this).b(0, -11, 0);
                  if (param2 < 33) {
                    ((ri) this).field_D = true;
                    super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                    return;
                  } else {
                    super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                    return;
                  }
                }
              } else {
                ml.field_d = new tg(((ri) this).field_k, ((ri) this).field_m);
                kh.a(ml.field_d, 1);
                na.a();
                ((ri) this).b(0, -11, 0);
                if (param2 < 33) {
                  ((ri) this).field_D = true;
                  super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                  ve.a(-121);
                  ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                  return;
                } else {
                  super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                  ve.a(-121);
                  ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                  return;
                }
              }
            } else {
              ml.field_d = new tg(((ri) this).field_k, ((ri) this).field_m);
              kh.a(ml.field_d, 1);
              na.a();
              ((ri) this).b(0, -11, 0);
              if (param2 < 33) {
                ((ri) this).field_D = true;
                super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                ve.a(-121);
                ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                return;
              } else {
                super.a(param0, -param1 + -((ri) this).field_i, 34, -param3 - ((ri) this).field_r);
                ve.a(-121);
                ml.field_d.d(param3 - -((ri) this).field_r, ((ri) this).field_i + param1, ((ri) this).field_A);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_B = null;
        if (param0 != -11673) {
          var2 = null;
          tg[] discarded$2 = ri.a((String) null, (gk) null, true, (String) null);
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param0 != -463076575) {
          return;
        } else {
          ((ri) this).b(param2, 80, param1, -param1 + ob.field_a >> -940938911, gi.field_e - param2 >> -463076575);
          return;
        }
    }

    boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 != 21) {
          L0: {
            ((ri) this).field_D = false;
            var2 = this.k(0);
            var3 = var2 - ((ri) this).field_A;
            if (var3 > 0) {
              ((ri) this).field_A = ((ri) this).field_A + (-1 + var3 + 8) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var3) {
              ((ri) this).field_A = ((ri) this).field_A + (-15 + var3) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (((ri) this).field_A == -1) {
            if (-1 != var2) {
              return false;
            } else {
              L2: {
                if (((ri) this).field_D) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            var2 = this.k(0);
            var3 = var2 - ((ri) this).field_A;
            if (var3 > 0) {
              ((ri) this).field_A = ((ri) this).field_A + (-1 + var3 + 8) / 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 > var3) {
              ((ri) this).field_A = ((ri) this).field_A + (-15 + var3) / 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (((ri) this).field_A != -1) {
                break L6;
              } else {
                if (-1 != var2) {
                  break L6;
                } else {
                  if (((ri) this).field_D) {
                    break L6;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L5;
          }
          return stackIn_12_0 != 0;
        }
    }

    abstract void b(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new uf();
    }
}
