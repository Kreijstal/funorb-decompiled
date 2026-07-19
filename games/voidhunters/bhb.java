/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bhb extends ksa implements tv {
    byte[] field_d;
    static String field_e;
    static int field_f;
    static int field_g;
    static int field_i;
    private tja field_h;

    final tja d(int param0) {
        faa var2 = null;
        tja var3 = null;
        if (null == this.field_h) {
          var2 = new faa(this.field_d.length + -4);
          var2.a(4, this.field_d, -1, -4 + this.field_d.length);
          var2.field_e = param0;
          var3 = (tja) ((Object) gva.field_a.a((byte) -128));
          var2.p(-23497);
          if (var3 instanceof utb) {
            ((utb) ((Object) var3)).a(var2, 32);
            var2.f((byte) -116);
            this.field_h = var3;
            return var3;
          } else {
            var3.a(var2, false);
            var2.f((byte) -116);
            this.field_h = var3;
            return var3;
          }
        } else {
          return this.field_h;
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 > -109) {
                faa var4 = (faa) null;
                this.b((faa) null, -44);
            }
            param0.r(32712);
            param0.d(this.field_d.length, 332614536);
            param0.a(0, this.field_d, -1, this.field_d.length);
            param0.q(-81);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bhb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bhb(int param0, faa param1) {
        this(param0, param1.field_h, param1.field_e);
    }

    public static void a(int param0) {
        if (param0 != 32) {
            return;
        }
        field_e = null;
    }

    final int c(int param0) {
        int var2 = 23 / ((param0 - 26) / 60);
        return ((this.field_d[2] & 255) << -1163684216) + (((this.field_d[1] & 255) << 845274224) + (this.field_d[0] << -930000744 & -16777216)) + (this.field_d[3] & 255);
    }

    final void a(tv param0, boolean param1) {
        RuntimeException runtimeException = null;
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
              if (param1) {
                break L1;
              } else {
                field_g = -106;
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
            stackOut_3_1 = new StringBuilder().append("bhb.G(");
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

    public final void b(byte param0, tv param1) {
        bhb var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3 = (bhb) ((Object) param1);
              if (null == this.field_d) {
                var3.field_d = null;
                break L1;
              } else {
                L2: {
                  L3: {
                    if (null == var3.field_d) {
                      break L3;
                    } else {
                      if (this.field_d.length != var3.field_d.length) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var3.field_d = new byte[this.field_d.length];
                  break L2;
                }
                cua.a(this.field_d, 0, var3.field_d, 0, this.field_d.length);
                break L1;
              }
            }
            if (param0 > 54) {
              break L0;
            } else {
              this.field_h = (tja) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("bhb.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 10 / ((param0 - 22) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("bhb.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    bhb() {
    }

    public final void a(faa param0, boolean param1) {
        int var3_int = 0;
        try {
            param0.f((byte) -100);
            if (param1) {
                field_e = (String) null;
            }
            var3_int = param0.h(49);
            this.field_d = new byte[var3_int];
            param0.a(0, this.field_d, (byte) -59, var3_int);
            param0.p(-23497);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bhb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private bhb(int param0, byte[] param1, int param2) {
        try {
            this.field_d = new byte[param2 - -4];
            this.field_d[2] = (byte)(param0 >> 937933224);
            this.field_d[3] = (byte)param0;
            this.field_d[1] = (byte)(param0 >> 301000240);
            this.field_d[0] = (byte)(param0 >> -1073884648);
            cua.a(param1, 0, this.field_d, 4, param2);
            this.field_h = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bhb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Hold the left mouse button to shoot";
        field_i = 131072;
        field_g = 32;
    }
}
