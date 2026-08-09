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
        if (param0 != 0) {
          L0: {
            this.d((byte) 91);
            if (!this.field_D) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              if (this == this.field_E.a(false)) {
                stackIn_12_0 = 256;
                break L0;
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_D) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              if (this == this.field_E.a(false)) {
                stackIn_6_0 = 256;
                break L1;
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    ri(pf param0, int param1, int param2) {
        super(ob.field_a - param1 >> -1771514399, -param2 + gi.field_e >> -1298539775, param1, param2, (fc) null);
        try {
            this.field_D = false;
            this.field_E = param0;
            this.field_A = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static tg[] a(String param0, gk param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tg[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param1.a(param0, param2);
            var5 = param1.a(var4_int, param3, 125);
            stackIn_1_0 = fl.a(-69, var4_int, param1, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ri.DA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final lk d(byte param0) {
        lk var2 = super.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (lk) (this);
    }

    boolean f(byte param0) {
        if (param0 == -33) {
          this.field_A = this.k(0);
          if (this.field_A == 0) {
            if (this.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_E = (pf) null;
          this.field_A = this.k(0);
          if (this.field_A == 0) {
            if (this.field_D) {
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
        if (0 != this.field_A) {
          if (this.field_A >= 256) {
            if (0 != param0) {
              return;
            } else {
              this.b(param1 - -this.field_i, -104, this.field_r + param3);
              super.a(param0, param1, 105, param3);
              return;
            }
          } else {
            if (ml.field_d != null) {
              if (ml.field_d.field_s >= this.field_k) {
                if (ml.field_d.field_q >= this.field_m) {
                  kh.a(ml.field_d, 1);
                  na.a();
                  this.b(0, -11, 0);
                  if (param2 < 33) {
                    this.field_D = true;
                    super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                    return;
                  } else {
                    super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                    return;
                  }
                } else {
                  ml.field_d = new tg(this.field_k, this.field_m);
                  kh.a(ml.field_d, 1);
                  na.a();
                  this.b(0, -11, 0);
                  if (param2 < 33) {
                    this.field_D = true;
                    super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                    return;
                  } else {
                    super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                    ve.a(-121);
                    ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                    return;
                  }
                }
              } else {
                ml.field_d = new tg(this.field_k, this.field_m);
                kh.a(ml.field_d, 1);
                na.a();
                this.b(0, -11, 0);
                if (param2 < 33) {
                  this.field_D = true;
                  super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                  ve.a(-121);
                  ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                  return;
                } else {
                  super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                  ve.a(-121);
                  ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                  return;
                }
              }
            } else {
              ml.field_d = new tg(this.field_k, this.field_m);
              kh.a(ml.field_d, 1);
              na.a();
              this.b(0, -11, 0);
              if (param2 < 33) {
                this.field_D = true;
                super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                ve.a(-121);
                ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                return;
              } else {
                super.a(param0, -param1 + -this.field_i, 34, -param3 - this.field_r);
                ve.a(-121);
                ml.field_d.d(param3 - -this.field_r, this.field_i + param1, this.field_A);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        String var2;
        field_B = (byte[][][]) null;
        if (param0 != -11673) {
          var2 = (String) null;
          ri.a((String) null, (gk) null, true, (String) null);
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
          this.b(param2, 80, param1, -param1 + ob.field_a >> -940938911, gi.field_e - param2 >> -463076575);
          return;
        }
    }

    boolean e(byte param0) {
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        int var2;
        int var3;
        if (param0 != 21) {
          L0: {
            this.field_D = false;
            var2 = this.k(0);
            var3 = var2 - this.field_A;
            if (var3 > 0) {
              this.field_A = this.field_A + (-1 + var3 + 8) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var3) {
              this.field_A = this.field_A + (-15 + var3) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (this.field_A == 0) {
            if (-1 != (var2 ^ -1)) {
              return false;
            } else {
              L2: {
                if (this.field_D) {
                  stackIn_25_0 = 0;
                  break L2;
                } else {
                  stackIn_25_0 = 1;
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
            var3 = var2 - this.field_A;
            if (var3 > 0) {
              this.field_A = this.field_A + (-1 + var3 + 8) / 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 > var3) {
              this.field_A = this.field_A + (-15 + var3) / 16;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (this.field_A != 0) {
                break L6;
              } else {
                if (-1 != (var2 ^ -1)) {
                  break L6;
                } else {
                  if (this.field_D) {
                    break L6;
                  } else {
                    stackIn_12_0 = 1;
                    break L5;
                  }
                }
              }
            }
            stackIn_12_0 = 0;
            break L5;
          }
          return stackIn_12_0 != 0;
        }
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_C = new uf();
    }
}
