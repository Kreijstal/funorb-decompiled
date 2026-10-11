/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static String field_b;
    static String field_d;
    private int[] field_a;
    static String field_c;

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
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
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (0 == param3) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          if (param5 != -1) {
            stackIn_6_0 = 92;
            return stackIn_6_0;
          }
          param3 = param3 + param2;
          var8 = param1;
          L2: while (true) {
            var9 = param0[var8];
            if (0 > var9) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_a[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param2;
              param2++;
              param4[incrementValue$1] = (byte)(~var10);
              if (param3 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_a[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              incrementValue$3 = param2;
              param2++;
              param4[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param3 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_a[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param4[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$6 = this.field_a[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (0 > dupTemp$6) {
              incrementValue$7 = param2;
              param2++;
              param4[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_a[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param4[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param3 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((4 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$10 = this.field_a[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param4[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param3 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 2) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_a[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param4[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param3) {
                return 1 + (var8 - param1);
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_a[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param4[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = 1 + (var8 - param1);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, String[] param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if (param0) {
            field_d = (String) null;
          }
          cb.field_v = ui.field_ob;
          if (param2 == 255) {
            stackIn_12_0 = !(13 <= ug.field_c);
            rl.field_b = ld.a(stackIn_12_0, (byte) 42);
            return;
          }
          if (param2 >= 100 &&
            param2 <= 105) {
            rl.field_b = ha.a(param1, -21916);
            return;
          }
          rl.field_b = af.a((byte) 36, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("oc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -85 / ((58 - param0) / 44);
    }

    private oc() throws Throwable {
        throw new Error();
    }

    final static dd[] a(rh param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd[] stackIn_5_0 = null;
        dd[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ha.a(param0, -32180, param2, param1)) {
            stackIn_2_0 = null;
            return (dd[]) (stackIn_2_0);
          }
          if (param3 < -95) {
            stackIn_7_0 = me.b(120);
            return stackIn_7_0;
          }
          stackIn_5_0 = (dd[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("oc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_d = "<%0>Basic wall:<%1> merely gets in the fleas' way (one of the three tiles you can place yourself).";
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
