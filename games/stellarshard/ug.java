/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    private oj field_e;
    static String[] field_c;
    static String field_b;
    static pb field_f;
    private gg field_a;
    static String field_d;

    final gg b(int param0, gg param1) {
        gg discarded$2 = null;
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        gg stackOut_9_0 = null;
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
              if (param1 == null) {
                var3 = this.field_e.field_d.field_g;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 == 4993) {
                break L2;
              } else {
                discarded$2 = this.b((byte) -10);
                break L2;
              }
            }
            if (this.field_e.field_d == var3) {
              this.field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_g;
              stackOut_9_0 = (gg) (var3);
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
            stackOut_11_1 = new StringBuilder().append("ug.A(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gg) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final gg a(int param0) {
        int var2 = 0;
        gg var3 = null;
        var2 = 26 % ((4 - param0) / 50);
        var3 = this.field_a;
        if (var3 == this.field_e.field_d) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var3.field_c;
          return var3;
        }
    }

    final gg a(boolean param0) {
        gg var2 = null;
        if (!param0) {
            this.field_a = (gg) null;
            var2 = this.field_a;
            if (!(var2 != this.field_e.field_d)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_g;
            return var2;
        }
        var2 = this.field_a;
        if (!(var2 != this.field_e.field_d)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_g;
        return var2;
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        gg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
              if (param1 == null) {
                var3 = this.field_e.field_d.field_c;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 == -25888) {
                break L2;
              } else {
                field_d = (String) null;
                break L2;
              }
            }
            if (var3 != this.field_e.field_d) {
              this.field_a = var3.field_c;
              stackOut_8_0 = (gg) (var3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gg) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static int b(int param0) {
        if (param0 != 1) {
            field_f = (pb) null;
            return 1;
        }
        return 1;
    }

    final gg a(byte param0) {
        gg var2 = null;
        var2 = this.field_e.field_d.field_c;
        if (var2 == this.field_e.field_d) {
          this.field_a = null;
          return null;
        } else {
          if (param0 >= -25) {
            field_c = (String[]) null;
            this.field_a = var2.field_c;
            return var2;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param0 >= 0) {
          if (param0 >= 65536) {
            L0: {
              param0 = param0 >>> 16;
              var2 += 16;
              if (256 > param0) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (-17 >= (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= param0) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2 < (param0 ^ -1)) {
                break L3;
              } else {
                param0 = param0 >>> 1;
                var2++;
                break L3;
              }
            }
            return param0 + var2;
          } else {
            L4: {
              if (256 > param0) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (-17 >= (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 <= param0) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2 < (param0 ^ -1)) {
                break L7;
              } else {
                param0 = param0 >>> 1;
                var2++;
                break L7;
              }
            }
            return param0 + var2;
          }
        } else {
          L8: {
            param0 = param0 >>> 16;
            var2 += 16;
            if (256 > param0) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (-17 >= (param0 ^ -1)) {
              var2 += 4;
              param0 = param0 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 <= param0) {
              var2 += 2;
              param0 = param0 >>> 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (-2 < (param0 ^ -1)) {
              break L11;
            } else {
              param0 = param0 >>> 1;
              var2++;
              break L11;
            }
          }
          return param0 + var2;
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_f = null;
        if (param0 <= 23) {
          field_c = (String[]) null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          return;
        }
    }

    ug(oj param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gg b(byte param0) {
        gg var2 = null;
        if (param0 > 114) {
          var2 = this.field_e.field_d.field_g;
          if (this.field_e.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        } else {
          field_f = (pb) null;
          var2 = this.field_e.field_d.field_g;
          if (this.field_e.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        }
    }

    static {
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
