/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static af field_g;
    static java.awt.Canvas field_d;
    static String[][] field_a;
    static String field_e;
    private vo field_f;
    private le field_b;
    static mf field_i;
    static String[] field_h;
    static int[] field_c;

    final le a(int param0) {
        le var2 = this.field_b;
        if (var2 == this.field_f.field_b) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_d;
        if (param0 != 17) {
            return (le) null;
        }
        return var2;
    }

    final static cg a(int param0, int param1) {
        cg[] var2;
        int var3;
        int var4;
        cg[] var5;
        var4 = ZombieDawn.field_J;
        var5 = c.b(19795);
        var2 = var5;
        var3 = param1;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_f != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final le a(le param0, byte param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        le stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -128) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = this.field_f.field_b.field_d;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (this.field_f.field_b == var3) {
              this.field_b = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_d;
              stackIn_10_0 = (le) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("cj.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (le) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final le c(byte param0) {
        le var2 = this.field_f.field_b.field_b;
        if (param0 > -113) {
            cj.b(-19);
        }
        if (!(this.field_f.field_b != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final le b(byte param0) {
        if (param0 != -21) {
            this.c((byte) 123);
        }
        le var2 = this.field_f.field_b.field_d;
        if (var2 == this.field_f.field_b) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_d;
        return var2;
    }

    final static ll a(boolean param0, byte param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ll stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 25) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if (param2.indexOf('@') == -1) {
                var7 = (CharSequence) ((Object) param2);
                var4_long = sd.a(-66, var7);
                break L2;
              } else {
                var6 = param2;
                break L2;
              }
            }
            stackIn_6_0 = sn.a((byte) -116, var4_long, param0, param3, (String) (var6));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(String param0, int param1, int param2, int param3, int param4) {
        try {
            tc.field_s[tc.field_t] = param1;
            tc.field_y[tc.field_t] = param3;
            tc.field_x[tc.field_t] = param0;
            if (param2 > -82) {
                field_e = (String) null;
            }
            tc.field_w[tc.field_t] = param4;
            tc.field_t = tc.field_t + 1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "cj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 15) {
                break L1;
              } else {
                var5 = (String) null;
                cj.a((String) null, -43, -34, 75, -12);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param1.length() <= var2_int) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param1.charAt(var2_int);
                  if (cb.a(60, (char) var3)) {
                    break L3;
                  } else {
                    if (!bj.a((char) var3, 91)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("cj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static void d(byte param0) {
        if (param0 <= 99) {
            return;
        }
        og.b(-111, 17);
    }

    public static void b(int param0) {
        field_i = null;
        field_c = null;
        field_a = (String[][]) null;
        field_d = null;
        field_e = null;
        field_g = null;
        if (param0 != 25808) {
            field_h = (String[]) null;
        }
        field_h = null;
    }

    final le a(byte param0) {
        le var2 = this.field_b;
        if (this.field_f.field_b == var2) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_b;
        if (param0 != 61) {
            field_e = (String) null;
        }
        return var2;
    }

    final le a(int param0, le param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        le stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        le stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -3549) {
              L1: {
                if (param1 == null) {
                  var3 = this.field_f.field_b.field_b;
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              if (var3 == this.field_f.field_b) {
                this.field_b = null;
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_b = var3.field_b;
                stackIn_11_0 = (le) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (le) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("cj.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (le) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    cj(vo param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[][]{new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"}, new String[]{"Terminal 5", "Countryside", "The Labs", "The Palace"}};
        field_g = new af();
        field_c = new int[]{220, 347, 515, -1};
    }
}
