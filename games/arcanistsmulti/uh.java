/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends pg {
    static ri field_i;
    static int field_m;
    static String field_s;
    int field_p;
    int field_o;
    int field_r;
    int field_g;
    int field_k;
    int field_h;
    static String field_q;
    int[] field_j;
    static String field_l;
    static vn field_n;

    final static void a(int[] param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, byte param8, int[] param9, int param10, int param11, int[] param12, int param13, int[] param14, int param15) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        int var17 = 0;
        int stackIn_51_0Lifetime1;
        int stackIn_51_1Lifetime1;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param6 = -param3;
          L0: while (true) {
            if (param6 < 0) {
              stackIn_53_0 = -param13;
              if (var17 != 0) {
                break L0;
              }
              param7 = stackIn_53_0;
              while (param7 < 0) {
                param15 = param4[param1++];
                stackIn_51_0 = 0;
                stackIn_51_1 = param15;
                if (stackIn_51_0 != stackIn_51_1) {
                  if (~param15 == ~(param15 & 16711680)) {
                    param15 = 255 & param15 >> 16;
                    incrementValue$1 = param11;
                    param11++;
                    param14[incrementValue$1] = dg.a(param9[1] * param15, 65280) + (dg.a(param15 * param9[0] << 8, 16711703) + (dg.a(param9[2] * param15, 65466) >> 8));
                    if (param14[param11 - 1] == 0) {
                      param14[-1 + param11] = 65792;
                    }
                  } else if ((65280 & param15) == param15) {
                    param15 = param15 >> 8 & 255;
                    incrementValue$2 = param11;
                    param11++;
                    param14[incrementValue$2] = dg.a(param15 * param5[1], 65280) + ((dg.a(param5[0] * param15, 1812004608) << 8) + dg.a(255, param5[2] * param15 >> 8));
                    if (0 == param14[-1 + param11]) {
                      param14[-1 + param11] = 65792;
                    }
                  } else if (~param15 != ~(255 & param15)) {
                    if ((255 & param15) == (255 & param15 >> 8) &&
                      ~(param15 >> 16) == ~(param15 & 255)) {
                      param15 = param15 & 255;
                      if (127 > param15) {
                        param15 = param15 * 2;
                        incrementValue$3 = param11;
                        param11++;
                        param14[incrementValue$3] = (dg.a(param12[2] * param15, 65330) >> 8) + dg.a(param15 * param12[1], 65280) + (dg.a(param12[0] * param15, -1107230976) << 8);
                      } else {
                        param15 = 2 * (param15 - 127);
                        incrementValue$4 = param11;
                        param11++;
                        param14[incrementValue$4] = dg.a((-param12[1] + 255) * param15 + 255 * param12[1], 65280) + ((dg.a(1275133696, 255 * param12[0] + (255 - param12[0]) * param15) << 8) + dg.a(param15 * (255 - param12[2]) + 255 * param12[2] >> 8, 255));
                      }
                      if (0 == param14[-1 + param11]) {
                        param14[-1 + param11] = 65792;
                      }
                    } else {
                      param14[param11++] = param15;
                    }
                  } else {
                    param15 = param15 & 255;
                    incrementValue$6 = param11;
                    param11++;
                    param14[incrementValue$6] = dg.a(param15 * param0[2] >> 8, 255) + dg.a(param15 * param0[1], 65280) + dg.a(16711759, param0[0] * param15 << 8);
                    if (param14[-1 + param11] == 0) {
                      param14[param11 - 1] = 65792;
                    }
                  }
                } else {
                  param11++;
                }
                param7++;
              }
              param1 = param1 + param10;
              stackIn_51_0Lifetime1 = param11;
              stackIn_51_1Lifetime1 = param2;
              param11 = stackIn_51_0Lifetime1 + stackIn_51_1Lifetime1;
              param6++;
              continue L0;
            }
            stackIn_53_0 = param8;
            break;
          }
          if (stackIn_53_0 != -99) {
            field_s = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_60_0 = var16;
          stackIn_60_1 = new StringBuilder().append("uh.A(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param5 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param15).append(')').toString());
        }
    }

    final static void a(qb param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          var4 = Math.min(param0.field_y, de.field_j / param1);
          var5 = Math.min(param0.field_q, de.field_e / 2);
          var6 = 0;
          while (var4 > var6) {
            var7 = var2_int;
            var8 = var3;
            if (var10 != 0) {
              return;
            }
            var9 = 0;
            while (var5 > var9) {
              dupTemp$0 = param0.field_A[var8];
              de.field_l[de.field_e + var7] = dupTemp$0;
              de.field_l[var7] = dupTemp$0;
              var7++;
              dupTemp$1 = param0.field_A[var8];
              de.field_l[de.field_e + var7] = dupTemp$1;
              de.field_l[var7] = dupTemp$1;
              var7++;
              var8++;
              var9++;
            }
            var3 = var3 + param0.field_n;
            var2_int = var2_int + de.field_e * 2;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("uh.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -120) {
            uh.a((int[]) null, 98, -65, 94, (int[]) null, (int[]) null, -75, 116, (byte) -14, (int[]) null, -110, 9, (int[]) null, -39, (int[]) null, -48);
          }
          stackIn_16_0 = ((!(param0 < 65) &&
            !(90 < param0)) ||
            (!(param0 < 97) &&
            !(param0 > 122)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "uh.G(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_s = null;
          field_q = null;
          if (param0 >= -44) {
            field_q = (String) null;
          }
          field_l = null;
          field_i = null;
          field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "uh.E(" + param0 + ')');
        }
    }

    final void a(int param0, int[] param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_o = param6;
          this.field_r = param4;
          this.field_p = param5;
          this.field_k = param7;
          this.field_h = param3;
          this.field_g = param0;
          if (param2 != 27) {
            field_s = (String) null;
          }
          this.field_j = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_8_0 = var9;
          stackIn_8_1 = new StringBuilder().append("uh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        try {
          if (pn.a((byte) -120)) {
            param0 = false;
          }
          ig.a(0, param0);
          int var2_int = 32 % ((param1 - 18) / 50);
          cj.a(-127);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "uh.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vi.field_F = param1;
          ee.a(12, (byte) 30);
          if (param0 <= 125) {
            field_l = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("uh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    uh() {
    }

    static {
        field_s = "Cancel draw";
        field_q = "Increases the power of your flame spells by up to 50%";
        field_l = "Make your way to the islands of Mos Le'Harmless to get your hands on some 'rum', but watch out for the monkeys - they might just rain on your parade.";
        field_i = new ri();
        field_n = new vn();
    }
}
