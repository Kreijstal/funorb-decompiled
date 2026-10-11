/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static byte[][][] field_a;
    private int[] field_d;
    static String field_e;
    static String field_c;
    static bi field_b;

    public static void a(boolean param0) {
        if (param0) {
          field_b = null;
          field_c = null;
          field_e = null;
          field_a = (byte[][][]) null;
          return;
        }
        field_b = (bi) null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_a = (byte[][][]) null;
    }

    private fh() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = Confined.field_J ? 1 : 0;
        try {
          if (param4 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param5) {
            var12 = (byte[]) null;
            this.a(-19, (byte[]) null, 112, (byte[]) null, -9, true);
          }
          var7_int = 0;
          param4 = param4 + param2;
          var8 = param0;
          L3: while (true) {
            var9 = param3[var8];
            if (var9 < 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_d[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param2;
              param2++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param2 >= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_d[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              incrementValue$3 = param2;
              param2++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 >= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 32)) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_d[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_d[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (0 > dupTemp$6) {
              incrementValue$7 = param2;
              param2++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_d[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (0 > dupTemp$8) {
              incrementValue$9 = param2;
              param2++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_d[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param4 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 2)) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$12 = this.field_d[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param2;
              param2++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param4) {
                return -param0 + (var8 + 1);
              }
              var7_int = 0;
            }
            if ((1 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$14 = this.field_d[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 >= param4) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = -param0 + (var8 + 1);
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, String param2) {
        int var3_int = 0;
        s.field_K = false;
        if (param1 != -1) {
          return;
        }
        try {
          jd.field_c = false;
          if (ki.field_c != null &&
            ki.field_c.field_H) {
            var3_int = 1;
            if (param0 != 8) {
            } else {
              if (rk.field_f) {
                param2 = bg.field_e;
              } else {
                param2 = ml.field_b;
              }
              param0 = 2;
              om.field_p.a(0, kj.field_c);
            }
            if (param0 == 10) {
              ib.c(false);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (jd.field_c) {
                param2 = b.a(new String[]{param2}, cg.field_c, param1 + 1178);
              }
              if (pc.field_f) {
                param2 = gj.field_c;
              }
              ki.field_c.a(param2, param0, false);
            }
            if (param0 != 256) {
              if (10 == param0) {
                return;
              }
              if (rk.field_f) {
                return;
              }
              om.field_p.g((byte) -104);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "That name is not available";
        field_e = "Starting controls";
    }
}
