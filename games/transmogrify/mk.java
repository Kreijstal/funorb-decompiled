/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends aj {
    static ti field_y;
    boolean field_A;
    static String field_C;
    private int field_D;
    static int field_x;
    static int[] field_w;
    static ti[] field_B;
    static String field_E;
    private da field_z;

    boolean a(byte param0) {
        ((mk) this).field_D = this.l(-18555);
        if (param0 == -97) {
          if (0 == ((mk) this).field_D) {
            if (((mk) this).field_A) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    boolean m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = this.l(-18555);
          var3 = -((mk) this).field_D + var2;
          if (var3 > param0) {
            ((mk) this).field_D = ((mk) this).field_D + (var3 + 7) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (0 <= var3) {
          if (0 == ((mk) this).field_D) {
            if (0 != var2) {
              return false;
            } else {
              L1: {
                if (((mk) this).field_A) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((mk) this).field_D = ((mk) this).field_D + (var3 + -15) / 16;
          if (0 == ((mk) this).field_D) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((mk) this).field_A) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    private final int l(int param0) {
        return !((mk) this).field_A ? 0 : (Object) (Object) ((mk) this).field_z.e((byte) 14) == this ? 256 : 0;
    }

    final static uk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        uk var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        uk stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        uk stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = 30 / ((param0 - 46) / 38);
          if (null != sj.field_u) {
            if (param1 != null) {
              if (0 != param1.length()) {
                var7 = (CharSequence) (Object) param1;
                var3 = hj.a((byte) -126, var7);
                if (var3 != null) {
                  var4 = (uk) (Object) sj.field_u.a((long)var3.hashCode(), (byte) -72);
                  L0: while (true) {
                    if (var4 != null) {
                      var8 = (CharSequence) (Object) var4.field_eb;
                      var5 = hj.a((byte) -128, var8);
                      if (var5.equals((Object) (Object) var3)) {
                        stackOut_16_0 = (uk) var4;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var4 = (uk) (Object) sj.field_u.a(-91);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("mk.P(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static uj a(int param0, String param1, int param2) {
        uj var3 = null;
        RuntimeException var3_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 242763393) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            var3 = new uj(false);
            var3.field_g = param2;
            var3.field_b = param1;
            stackOut_2_0 = (uj) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("mk.I(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    mk(da param0, int param1, int param2) {
        super(-param1 + cd.field_b >> 1, wj.field_h - param2 >> 1, param1, param2, (ui) null);
        try {
            ((mk) this).field_D = 0;
            ((mk) this).field_A = false;
            ((mk) this).field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((mk) this).a(87, -param1 + wj.field_h >> 1, cd.field_b + -param0 >> 1, param0, param1);
        if (param2) {
            field_B = null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        var5 = -122 % ((param3 - 77) / 34);
        if (((mk) this).field_D != 0) {
          if (((mk) this).field_D < 256) {
            if (qk.field_c != null) {
              if (((mk) this).field_l <= qk.field_c.field_n) {
                if (qk.field_c.field_m >= ((mk) this).field_h) {
                  oj.a(qk.field_c, 256);
                  sb.c();
                  ((mk) this).a(0, (byte) -81, 0);
                  super.a(-((mk) this).field_p + -param0, -((mk) this).field_n + -param1, param2, (byte) -93);
                  fi.c(true);
                  qk.field_c.e(param0 + ((mk) this).field_p, param1 + ((mk) this).field_n, ((mk) this).field_D);
                  return;
                } else {
                  qk.field_c = new ti(((mk) this).field_l, ((mk) this).field_h);
                  oj.a(qk.field_c, 256);
                  sb.c();
                  ((mk) this).a(0, (byte) -81, 0);
                  super.a(-((mk) this).field_p + -param0, -((mk) this).field_n + -param1, param2, (byte) -93);
                  fi.c(true);
                  qk.field_c.e(param0 + ((mk) this).field_p, param1 + ((mk) this).field_n, ((mk) this).field_D);
                  return;
                }
              } else {
                qk.field_c = new ti(((mk) this).field_l, ((mk) this).field_h);
                oj.a(qk.field_c, 256);
                sb.c();
                ((mk) this).a(0, (byte) -81, 0);
                super.a(-((mk) this).field_p + -param0, -((mk) this).field_n + -param1, param2, (byte) -93);
                fi.c(true);
                qk.field_c.e(param0 + ((mk) this).field_p, param1 + ((mk) this).field_n, ((mk) this).field_D);
                return;
              }
            } else {
              qk.field_c = new ti(((mk) this).field_l, ((mk) this).field_h);
              oj.a(qk.field_c, 256);
              sb.c();
              ((mk) this).a(0, (byte) -81, 0);
              super.a(-((mk) this).field_p + -param0, -((mk) this).field_n + -param1, param2, (byte) -93);
              fi.c(true);
              qk.field_c.e(param0 + ((mk) this).field_p, param1 + ((mk) this).field_n, ((mk) this).field_D);
              return;
            }
          } else {
            if (param2 == 0) {
              ((mk) this).a(((mk) this).field_n + param1, (byte) -106, param0 - -((mk) this).field_p);
              super.a(param0, param1, param2, (byte) -27);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, byte param1, int param2);

    final qg i(int param0) {
        qg var2 = null;
        var2 = super.i(-120);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 > -112) {
            field_w = null;
            return (qg) this;
          } else {
            return (qg) this;
          }
        }
    }

    public static void n(int param0) {
        field_y = null;
        field_w = null;
        field_B = null;
        field_E = null;
        if (param0 > -23) {
            return;
        }
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_w = new int[8192];
        field_E = "Open in popup window";
    }
}
