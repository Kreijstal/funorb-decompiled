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
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((ri) this).field_D) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (this == (Object) (Object) ((ri) this).field_E.a(false)) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    ri(pf param0, int param1, int param2) {
        super(ob.field_a - param1 >> 1, -param2 + gi.field_e >> 1, param1, param2, (fc) null);
        try {
            ((ri) this).field_D = false;
            ((ri) this).field_E = param0;
            ((ri) this).field_A = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static tg[] a(String param0, gk param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tg[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        tg[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param1.a(param0, false);
            var5 = param1.a(var4_int, param3, 125);
            stackOut_0_0 = fl.a(-69, var4_int, param1, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ri.DA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
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
        field_B = null;
        field_C = null;
    }

    final void c(int param0, int param1, int param2) {
        if (param0 != -463076575) {
          return;
        } else {
          ((ri) this).b(param2, 80, param1, -param1 + ob.field_a >> 1, gi.field_e - param2 >> 1);
          return;
        }
    }

    boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param0 == 21) {
          L0: {
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
          L2: {
            L3: {
              if (((ri) this).field_A != 0) {
                break L3;
              } else {
                if (var2 != 0) {
                  break L3;
                } else {
                  if (((ri) this).field_D) {
                    break L3;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L2;
                  }
                }
              }
            }
            stackOut_25_0 = 0;
            stackIn_26_0 = stackOut_25_0;
            break L2;
          }
          return stackIn_26_0 != 0;
        } else {
          L4: {
            ((ri) this).field_D = false;
            var2 = this.k(0);
            var3 = var2 - ((ri) this).field_A;
            if (var3 > 0) {
              ((ri) this).field_A = ((ri) this).field_A + (-1 + var3 + 8) / 8;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (0 > var3) {
              ((ri) this).field_A = ((ri) this).field_A + (-15 + var3) / 16;
              break L5;
            } else {
              break L5;
            }
          }
          if (((ri) this).field_A == 0) {
            if (var2 == 0) {
              L6: {
                if (((ri) this).field_D) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L6;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L6;
                }
              }
              return stackIn_14_0 != 0;
            } else {
              return false;
            }
          } else {
            return false;
          }
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
