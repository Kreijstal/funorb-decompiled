/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lk extends vd implements cd, qk {
    private boolean field_J;
    static int[] field_M;
    private ph field_P;
    static nd field_N;
    private boolean field_G;
    private ph field_R;
    private ig field_O;
    private String field_I;
    static String[] field_E;
    private boolean field_Q;
    static int field_H;
    private ph field_K;
    private ig field_L;

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != ((lk) this).field_I) {
            int discarded$0 = jd.field_s.a(((lk) this).field_I, 20 + param1 + ((lk) this).field_v, 15 + (((lk) this).field_m + param0), -40 + ((lk) this).field_s, ((lk) this).field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        }
        if (param2 <= 42) {
            lk.j(21);
        }
        if (!(((lk) this).field_P == null)) {
            si.a(param1 + 10, 134 + param0, -20 + ((lk) this).field_s, 4210752);
        }
        super.a(param0, param1, (byte) 123, param3);
    }

    final void a(boolean param0) {
        if (param0) {
            ((lk) this).field_J = false;
        }
        ((lk) this).field_O.o(-128);
        ((lk) this).field_L.o(-124);
    }

    private final void e(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            int discarded$8 = -86;
            if (gi.b()) {
              break L1;
            } else {
              if (((lk) this).field_O.field_n.length() <= 0) {
                break L0;
              } else {
                if (((lk) this).field_L.field_n.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          int discarded$9 = -125;
          r.a(((lk) this).field_O.field_n, ((lk) this).field_L.field_n);
          break L0;
        }
        var2 = -47 / ((29 - param0) / 34);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 14 / ((-63 - param4) / 52);
              if (((lk) this).field_K == param3) {
                this.e((byte) 124);
                break L1;
              } else {
                if (param3 != ((lk) this).field_P) {
                  if (param3 != ((lk) this).field_R) {
                    break L1;
                  } else {
                    if (((lk) this).field_G) {
                      int discarded$443 = -1;
                      ki.a();
                      break L1;
                    } else {
                      if (!((lk) this).field_J) {
                        int discarded$444 = -1;
                        vc.a();
                        break L1;
                      } else {
                        int discarded$445 = -126;
                        mn.a();
                        break L1;
                      }
                    }
                  }
                } else {
                  gb.d(126);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("lk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
    }

    public final void a(ig param0, byte param1) {
        try {
            int var3_int = 116 / ((-76 - param1) / 41);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "lk.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ig param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -31 % ((0 - param1) / 41);
              if (param0 == ((lk) this).field_O) {
                boolean discarded$3 = ((lk) this).field_L.a((byte) -47, (ag) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == ((lk) this).field_L) {
                this.e((byte) -72);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("lk.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        if (param0 != 27219) {
            lk.l(-62);
        }
        field_M = null;
        field_N = null;
        field_E = null;
    }

    final static void l(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = mn.field_a;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              if (param0 >= 71) {
                break L1;
              } else {
                lk.j(68);
                break L1;
              }
            }
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var1[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var1[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var1[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var1[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var1[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var1[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var1[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var1[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1_ref, "lk.O(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, vm param3, int param4, int param5, int param6, int param7, int param8, int param9, bd[] param10, bd[] param11, bd[] param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, vm param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            se.a(param20, 4, param3, new vh(param11), 65280, 24, new vh(param12), 4, 16776960, param9, 40, 4, param19, 24, 320, 4000, new vh(param10), 40, 16777215, 240, 24);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("lk.N(").append(4).append(',').append(16776960).append(',').append(4).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(24).append(',').append(320).append(',').append(65280).append(',').append(16777215).append(',').append(24).append(',').append(param9).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param10 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param11 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param12 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(4).append(',').append(24).append(',').append(7662).append(',').append(240).append(',').append(40).append(',').append(40).append(',').append(param19).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param20 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void a(String param0, int param1) {
        ig var3 = ((lk) this).field_O;
        String var4 = param0;
        if (param1 != 10000536) {
            return;
        }
        try {
            var3.a((byte) 118, false, var4);
            ((lk) this).field_L.o(param1 ^ -10000616);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "lk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (98 == param2) {
                stackOut_6_0 = ((lk) this).a(param1, (byte) -21);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 == 99) {
                  stackOut_10_0 = ((lk) this).b((byte) -126, param1);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("lk.F(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final String k(int param0) {
        if (null == ((lk) this).field_O.field_n) {
            return "";
        }
        if (param0 != 80) {
            return null;
        }
        return ((lk) this).field_O.field_n;
    }

    lk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nn) null);
        RuntimeException var6 = null;
        ke var6_ref = null;
        vm var7 = null;
        String var8 = null;
        fa var9 = null;
        nh var12 = null;
        nh var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        ph stackIn_17_1 = null;
        ph stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ph stackIn_18_1 = null;
        ph stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ph stackIn_19_1 = null;
        ph stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        ph stackOut_16_1 = null;
        ph stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        ph stackOut_18_1 = null;
        ph stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        ph stackOut_17_1 = null;
        ph stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              ((lk) this).field_I = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((lk) this).field_Q = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((lk) this).field_G = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((lk) this).field_J = stackIn_10_1 != 0;
              if (!((lk) this).field_G) {
                break L4;
              } else {
                L5: {
                  if (((lk) this).field_Q) {
                    break L5;
                  } else {
                    if (!((lk) this).field_J) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((lk) this).field_O = (ig) (Object) new sf(param0, (mh) this, 100);
              ((lk) this).field_L = (ig) (Object) new sf("", (mh) this, 20);
              if (!((lk) this).field_G) {
                L7: {
                  ((lk) this).field_K = new ph(cb.field_b, (mh) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((lk) this).field_J) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = ej.field_n;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = hg.field_d;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((lk) this).field_R = new ph(stackIn_19_3, (mh) null);
                if (!((lk) this).field_Q) {
                  break L6;
                } else {
                  ((lk) this).field_P = new ph(kc.field_f, (mh) this);
                  break L6;
                }
              } else {
                ((lk) this).field_K = new ph(hf.field_f, (mh) null);
                ((lk) this).field_R = new ph(sc.field_k, (mh) null);
                ((lk) this).field_O.field_D = false;
                break L6;
              }
            }
            L8: {
              ((lk) this).field_O.field_h = (nn) (Object) new sd(10000536);
              ((lk) this).field_L.field_h = (nn) (Object) new km(10000536);
              var6_ref = new ke();
              ((lk) this).field_K.field_h = (nn) (Object) var6_ref;
              if (null == ((lk) this).field_R) {
                break L8;
              } else {
                ((lk) this).field_R.field_h = (nn) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((lk) this).field_O.field_i = qj.field_n;
              if (null == ((lk) this).field_P) {
                break L9;
              } else {
                ((lk) this).field_P.field_h = (nn) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((lk) this).field_P) {
                break L10;
              } else {
                ((lk) this).field_P.field_i = e.field_x;
                break L10;
              }
            }
            L11: {
              if (!((lk) this).field_G) {
                if (((lk) this).field_J) {
                  ((lk) this).field_R.field_i = hk.field_l;
                  ((lk) this).field_R.field_h = (nn) (Object) new ti();
                  break L11;
                } else {
                  ((lk) this).field_R.field_h = (nn) (Object) new ti();
                  break L11;
                }
              } else {
                ((lk) this).field_R.field_i = qg.field_s;
                break L11;
              }
            }
            L12: {
              ((lk) this).field_m = 15;
              var7 = jd.field_s;
              if (((lk) this).field_I == null) {
                break L12;
              } else {
                ((lk) this).field_m = ((lk) this).field_m + (var7.b(((lk) this).field_I, -40 + ((lk) this).field_s, var7.field_y) + 5);
                break L12;
              }
            }
            L13: {
              var8 = jg.field_b;
              int discarded$3 = -116;
              var9 = qj.a(bn.c(-1));
              if (ub.field_b != var9) {
                if (var9 != wh.field_c) {
                  break L13;
                } else {
                  var8 = dg.field_nb;
                  break L13;
                }
              } else {
                var8 = dk.field_k;
                break L13;
              }
            }
            L14: {
              nh dupTemp$4 = new nh(10, ((lk) this).field_m, ((lk) this).field_s + -20, 25, (ag) (Object) ((lk) this).field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$4;
              ((lk) this).a(51448, (ag) (Object) dupTemp$4);
              ((lk) this).field_m = ((lk) this).field_m + (((ag) (Object) var12).field_x - -5);
              nh dupTemp$5 = new nh(10, ((lk) this).field_m, -20 + ((lk) this).field_s, 25, (ag) (Object) ((lk) this).field_L, false, 80, 3, var7, 16777215, qh.field_x);
              var13 = dupTemp$5;
              ((lk) this).a(51448, (ag) (Object) dupTemp$5);
              ((lk) this).field_m = ((lk) this).field_m + (((ag) (Object) var13).field_x - -5);
              ((lk) this).field_K.field_p = (mh) this;
              if (null == ((lk) this).field_P) {
                break L14;
              } else {
                ((lk) this).field_P.field_p = (mh) this;
                break L14;
              }
            }
            L15: {
              if (null == ((lk) this).field_R) {
                break L15;
              } else {
                ((lk) this).field_R.field_p = (mh) this;
                break L15;
              }
            }
            L16: {
              if (null == ((lk) this).field_P) {
                ((lk) this).field_K.a(-10 + ((lk) this).field_s - 6, ((lk) this).field_m, 0, 8, 30);
                ((lk) this).field_m = ((lk) this).field_m + 35;
                break L16;
              } else {
                ((lk) this).field_K.a(((lk) this).field_s - 95, ((lk) this).field_m, 0, 85, 30);
                ((lk) this).field_m = ((lk) this).field_m + 60;
                break L16;
              }
            }
            L17: {
              if (((lk) this).field_P == null) {
                break L17;
              } else {
                ((lk) this).field_P.a(-6 + ((lk) this).field_s + -10, ((lk) this).field_m, 0, 8, 30);
                ((lk) this).field_m = ((lk) this).field_m + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((lk) this).field_R) {
                break L18;
              } else {
                L19: {
                  if (((lk) this).field_G) {
                    break L19;
                  } else {
                    if (!((lk) this).field_J) {
                      ((lk) this).field_R.a(40, ((lk) this).field_m, 0, 8, 20);
                      ((lk) this).field_m = ((lk) this).field_m + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((lk) this).field_R.a(-6 + ((lk) this).field_s + -10, ((lk) this).field_m, 0, 8, 30);
                ((lk) this).field_m = ((lk) this).field_m + 35;
                break L18;
              }
            }
            L20: {
              ((lk) this).a(((lk) this).field_s, 0, 0, 0, ((lk) this).field_m + 3);
              ((lk) this).a(51448, (ag) (Object) ((lk) this).field_K);
              if (((lk) this).field_P == null) {
                break L20;
              } else {
                ((lk) this).a(51448, (ag) (Object) ((lk) this).field_P);
                break L20;
              }
            }
            L21: {
              if (null == ((lk) this).field_R) {
                break L21;
              } else {
                ((lk) this).a(51448, (ag) (Object) ((lk) this).field_R);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("lk.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[8192];
        field_E = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_H = 0;
        field_N = new nd(6, 0, 4, 2);
    }
}
