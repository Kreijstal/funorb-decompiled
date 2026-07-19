/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha implements ntb {
    int field_b;
    int field_e;
    int field_c;
    int field_a;
    static int field_d;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rha var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
            L1: {
              L2: {
                var3_int = 79 / ((param0 - 22) / 59);
                var4 = (rha) ((Object) param1);
                if (this.field_a != var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_e != this.field_e) {
                    break L2;
                  } else {
                    if (this.field_b != var4.field_b) {
                      break L2;
                    } else {
                      if (var4.field_c == this.field_c) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rha.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (ob.field_j > param1) {
            break L0;
          } else {
            if (param1 <= mt.field_o) {
              param4 = ksa.a(31123, lua.field_c, hab.field_i, param4);
              param3 = ksa.a(31123, lua.field_c, hab.field_i, param3);
              sk.a(-105, param4, param1, param3, param2);
              break L0;
            } else {
              if (param0 <= -18) {
                return;
              } else {
                rha.a(72, 80, 26, 93, -92);
                return;
              }
            }
          }
        }
        if (param0 > -18) {
          rha.a(72, 80, 26, 93, -92);
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        tv var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-632, this.field_a, 32);
              param0.a(-632, this.field_e, 8);
              param0.a(-632, 1 + this.field_b, 8);
              param0.a(-632, 1 + this.field_c, 8);
              if (param1 < -109) {
                break L1;
              } else {
                var4 = (tv) null;
                discarded$2 = this.a((byte) -115, (tv) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rha.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static float a(float param0, float param1, int param2, float param3, byte param4) {
        float[] var5 = null;
        float[] var6 = null;
        if (param4 <= 53) {
          return 0.2956068813800812f;
        } else {
          var6 = cn.field_a[param2];
          var5 = var6;
          return param3 * var6[1] + var6[0] * param1 + param0 * var6[2];
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rha var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                this.field_e = 92;
                break L1;
              }
            }
            L2: {
              var5 = (rha) ((Object) param0);
              var4 = 0;
              if (var5.field_a != this.field_a) {
                var4 = 1;
                System.out.println("int tick has changed. before=" + var5.field_a + ", now=" + this.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_e != var5.field_e) {
                var4 = 1;
                System.out.println("int string_id has changed. before=" + var5.field_e + ", now=" + this.field_e);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var5.field_b != this.field_b) {
                var4 = 1;
                System.out.println("int a_id has changed. before=" + var5.field_b + ", now=" + this.field_b);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.field_c != var5.field_c) {
                var4 = 1;
                System.out.println("int b_id has changed. before=" + var5.field_c + ", now=" + this.field_c);
                break L5;
              } else {
                break L5;
              }
            }
            if (var4 != 0) {
              System.out.println("This instance of Message has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("rha.F(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        rha var4 = (rha) ((Object) param1);
        rha var3 = var4;
        var4.field_a = this.field_a;
        var4.field_e = this.field_e;
        if (param0 <= 54) {
            return;
        }
        try {
            var4.field_b = this.field_b;
            var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        this.field_a = param0.i(0, 32);
        this.field_e = param0.i(0, 8);
        if (param1) {
            return;
        }
        try {
            this.field_b = param0.i(0, 8) - 1;
            this.field_c = -1 + param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rha() {
    }

    rha(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = param2;
        this.field_b = param1;
    }

    static {
    }
}
