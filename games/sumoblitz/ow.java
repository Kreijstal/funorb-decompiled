/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow {
    private int[] field_c;
    static jn field_f;
    static String field_a;
    static String field_b;
    static int field_e;
    static byte[][] field_d;

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 == param4) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param4 = param4 + param0;
          var7_int = 0;
          var9 = -35 / ((52 - param3) / 59);
          var8 = param1;
          L2: while (true) {
            var10 = param5[var8];
            if (var10 < 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var11 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param0;
              param0++;
              param2[incrementValue$1] = (byte)(~var11);
              if (param4 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var10) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var11Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param0;
              param0++;
              param2[incrementValue$3] = (byte)(~var11Lifetime1);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var10 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var11Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param0;
              param0++;
              param2[incrementValue$5] = (byte)(~var11Lifetime2);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var10) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var11Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param0;
              param0++;
              param2[incrementValue$7] = (byte)(~var11Lifetime3);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((8 & var10) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_c[var7_int];
            var11Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param0;
              param0++;
              param2[incrementValue$9] = (byte)(~var11Lifetime4);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var10 & 4) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var11Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param0;
              param0++;
              param2[incrementValue$11] = (byte)(~var11Lifetime5);
              if (param4 <= param0) {
                return -param1 + var8 + 1;
              }
              var7_int = 0;
            }
            if ((2 & var10) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var11Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param0;
              param0++;
              param2[incrementValue$13] = (byte)(~var11Lifetime6);
              if (param4 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((1 & var10) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var11Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param0;
              param0++;
              param2[incrementValue$15] = (byte)(~var11Lifetime7);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_64_0 = -param1 + var8 + 1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ow.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private ow() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, ki param1, wi param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          ha.field_e = param1;
          pn.field_n = "";
          if (param0 != -18527) {
            ow.a((byte) 19);
          }
          qn.field_e = param2;
          if (!en.field_h.startsWith("win")) {
            if (en.field_h.startsWith("linux")) {
              pn.field_n = pn.field_n + "linux/";
            } else {
              if (en.field_h.startsWith("mac")) {
                pn.field_n = pn.field_n + "macos/";
              }
            }
          } else {
            pn.field_n = pn.field_n + "windows/";
          }
          if (qn.field_e.field_t) {
            pn.field_n = pn.field_n + "msjava/";
            return;
          }
          if (!en.field_d.startsWith("amd64") &&
            !en.field_d.startsWith("x86_64")) {
            if (!en.field_d.startsWith("i386") &&
              !en.field_d.startsWith("i486") &&
              !en.field_d.startsWith("i586") &&
              !en.field_d.startsWith("x86")) {
              if (en.field_d.startsWith("ppc")) {
                pn.field_n = pn.field_n + "ppc/";
                return;
              }
              pn.field_n = pn.field_n + "universal/";
              return;
            }
            pn.field_n = pn.field_n + "x86/";
            return;
          }
          pn.field_n = pn.field_n + "x86_64/";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("ow.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == 123) {
          field_a = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_b = null;
          return;
        }
        field_f = (jn) null;
        field_a = null;
        field_d = (byte[][]) null;
        field_f = null;
        field_b = null;
    }

    static {
        field_a = "Loading fonts";
        field_f = new jn();
        field_b = "Email: ";
        field_d = new byte[250][];
    }
}
