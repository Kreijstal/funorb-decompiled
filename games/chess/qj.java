/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_f;
    private o field_c;
    private jc field_b;
    static String field_g;
    static ci field_e;
    static String field_a;
    static boolean field_d;
    static String field_h;

    public static void a(int param0) {
        int var1 = -79 / ((-15 - param0) / 45);
        field_a = null;
        field_g = null;
        field_h = null;
        field_e = null;
    }

    final o a(boolean param0, o param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        o stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        o stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_b.field_a.field_h;
                break L1;
              }
            }
            if (var3 == this.field_b.field_a) {
              this.field_c = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                this.field_c = var3.field_h;
                if (!param0) {
                  break L2;
                } else {
                  qj.a(89);
                  break L2;
                }
              }
              stackOut_9_0 = (o) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("qj.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final o a(o param0, byte param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        o stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = -115 % ((27 - param1) / 56);
              if (param0 == null) {
                var3 = this.field_b.field_a.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 == this.field_b.field_a) {
              this.field_c = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_c = var3.field_c;
              stackOut_7_0 = (o) (var3);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("qj.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final o b(byte param0) {
        o var2 = null;
        var2 = this.field_c;
        if (var2 != this.field_b.field_a) {
          if (param0 > -52) {
            qj.a(92);
            this.field_c = var2.field_c;
            return var2;
          } else {
            this.field_c = var2.field_c;
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    qj(jc param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static km[] a(int param0, int param1, byte param2, um param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param2 == 108) {
              break L0;
            } else {
              field_e = (ci) null;
              break L0;
            }
          }
          if (tj.a(param1, param0, param3, (byte) 83)) {
            return af.a((byte) -109);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("qj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final o c(int param0) {
        o var2 = this.field_b.field_a.field_h;
        if (param0 != -20229) {
            return (o) null;
        }
        if (!(this.field_b.field_a != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final o b(int param0) {
        o var2 = null;
        var2 = this.field_c;
        if (this.field_b.field_a != var2) {
          if (param0 != 8922) {
            return (o) null;
          } else {
            this.field_c = var2.field_h;
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final o a(byte param0) {
        o var2 = null;
        int var3 = 0;
        var2 = this.field_b.field_a.field_c;
        if (var2 == this.field_b.field_a) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_c;
          var3 = -4 / ((66 - param0) / 34);
          return var2;
        }
    }

    static {
        field_f = 1;
        field_g = "Confirm Email:";
        field_a = "Invalid name";
        field_d = false;
        field_h = "Players";
    }
}
