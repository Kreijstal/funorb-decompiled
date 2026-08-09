/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa implements noa {
    private int field_g;
    private int field_c;
    private int field_d;
    private int field_h;
    static apa field_b;
    private boolean field_e;
    private int field_f;
    static String field_a;

    final int a(int param0) {
        int var2;
        kh var3;
        if (param0 != -43946608) {
          L0: {
            var3 = (kh) null;
            this.a(8, (kh) null);
            var2 = this.field_d | (this.field_g << -43946608 | this.field_f << -1416970584);
            if (this.field_e) {
              var2 = this.field_h << -458627816 | var2;
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = this.field_d | (this.field_g << -43946608 | this.field_f << -1416970584);
            if (this.field_e) {
              var2 = this.field_h << -458627816 | var2;
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    private final void a(int param0, int param1, kh param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              var4_int = 1 << 8 + -this.field_c;
              var5 = -1 + var4_int;
              this.field_g = var4_int * param2.b((byte) 44, this.field_c);
              if (0 >= this.field_g) {
                break L1;
              } else {
                this.field_g = this.field_g + var5;
                break L1;
              }
            }
            L2: {
              this.field_f = var4_int * param2.b((byte) 44, this.field_c);
              if ((this.field_f ^ -1) >= -1) {
                break L2;
              } else {
                this.field_f = this.field_f + var5;
                break L2;
              }
            }
            L3: {
              this.field_d = param2.b((byte) 44, this.field_c) * var4_int;
              if (0 < this.field_d) {
                this.field_d = this.field_d + var5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_e) {
                this.field_h = param2.b((byte) 44, this.field_c) * var4_int;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 == 8) {
                break L5;
              } else {
                field_b = (apa) null;
                break L5;
              }
            }
            if (0 < this.field_h) {
              this.field_h = this.field_h + var5;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("jaa.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final void a(boolean param0, int param1) {
        this.field_g = param1 >> -1531094160 ^ 255;
        this.field_d = 255 ^ param1;
        this.field_h = param1 >> -84083560 ^ 255;
        if (param0) {
          return;
        } else {
          this.field_f = (65398 ^ param1) >> -672233560;
          return;
        }
    }

    jaa(boolean param0, int param1) {
        this.field_c = param1;
        this.field_e = param0 ? true : false;
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 1 << -this.field_c + 8;
            var4 = var3_int + -1;
            param1.a((byte) -128, iia.d(param0, -var4 + this.field_g, param0 ^ 2) / var3_int, this.field_c);
            param1.a((byte) 61, iia.d(0, -var4 + this.field_f, 2) / var3_int, this.field_c);
            param1.a((byte) -128, iia.d(0, -var4 + this.field_d, 2) / var3_int, this.field_c);
            if (this.field_e) {
              param1.a((byte) -127, iia.d(0, this.field_h - var4, 2) / var3_int, this.field_c);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 24) {
              stackIn_4_0 = nia.a(param1, 0, param1.length, 255);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("jaa.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    jaa(boolean param0, int param1, int param2, kh param3) {
        try {
            this.field_e = param0 ? true : false;
            this.field_c = param1;
            this.a(8, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jaa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Send private message";
    }
}
