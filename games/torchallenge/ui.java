/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui implements wd {
    static String field_e;
    static ka[] field_i;
    static boolean field_b;
    static rl field_c;
    private long field_a;
    static String[] field_h;
    static int[] field_f;
    static String field_g;
    static String field_d;

    public final void a(boolean param0) {
        if (!param0) {
            rj discarded$0 = ((ui) this).b(66);
        }
        ((ui) this).field_a = ol.a(256);
    }

    public static void c(byte param0) {
        if (param0 >= -120) {
            field_e = null;
        }
        field_i = null;
        field_c = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    abstract rj b(byte param0);

    public final String a(byte param0) {
        if (param0 != -10) {
            String discarded$0 = ((ui) this).a((byte) 50);
        }
        if (((ui) this).a(6650)) {
            return null;
        }
        if (ol.a(256) < 350L + ((ui) this).field_a) {
            return null;
        }
        return ((ui) this).d(5);
    }

    final static short[] a(pa param0, int param1, short[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -91) {
                break L1;
              } else {
                ui.c((byte) -111);
                break L1;
              }
            }
            var4_int = param0.e(16, -126);
            if (0 != var4_int) {
              L2: {
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    if (param2.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.e(4, -13);
                var6 = (short)param0.e(16, 107);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param2[var7] = (short)(var6 + param0.e(var5, -32));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (short[]) param2;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ui.S(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 16 + ')');
        }
        return stackIn_18_0;
    }

    abstract String d(int param0);

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            qf.field_e = new ge[8];
            qf.field_e[1] = ua.field_d[1];
            qf.field_e[0] = ua.field_d[0];
            qf.field_e[3] = ua.field_d[3];
            qf.field_e[2] = ua.field_d[2];
            qf.field_e[4] = ua.field_d[5];
            qf.field_e[7] = ua.field_d[4];
            qf.field_e[5] = dj.field_V[0];
            e.field_p = new int[8][];
            wc.field_d = new int[8];
            qf.field_e[6] = dj.field_V[1];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 8) {
                ag.field_e.a((jc[]) (Object) qf.field_e, wc.field_d);
                if (param0 <= -89) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  L3: {
                    wc.field_d[var1_int] = qf.field_e[var1_int].field_d;
                    if (var1_int == 0) {
                      break L3;
                    } else {
                      if (var1_int == 5) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  e.field_p[var1_int] = new int[qf.field_e[var1_int].field_l.length];
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= e.field_p[var1_int].length) {
                      break L2;
                    } else {
                      e.field_p[var1_int][var2] = qf.field_e[var1_int].field_l[var2];
                      var2++;
                      continue L4;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "ui.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final rj b(int param0) {
        if (!(!((ui) this).a(6650))) {
            return mh.field_b;
        }
        if (ol.a(256) < ((ui) this).field_a + 350L) {
            return bl.field_S;
        }
        int var2 = -47 / ((param0 - 33) / 61);
        return ((ui) this).b((byte) 109);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new rl(1);
        field_f = new int[4];
        field_g = "Instructions";
        field_d = "Skip";
    }
}
