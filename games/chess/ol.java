/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends ma implements nn, mj, wl {
    private bg field_Z;
    private ki field_P;
    private bg field_T;
    static of field_R;
    private fb field_M;
    static int[] field_S;
    private fb field_V;
    private bg field_Q;
    private bg field_L;
    t field_Y;
    private se field_K;
    static jk field_N;
    private bg field_W;
    private bg field_U;
    static jg field_O;
    static String field_X;

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_M == param0) {
                qf.a(104);
                break L1;
              } else {
                if (this.field_V == param0) {
                  discarded$1 = this.i(-100);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param4 == -24221) {
              break L0;
            } else {
              this.field_Q = (bg) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ol.DA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_O = null;
        field_R = null;
        int var1 = -25 / ((-1 - param0) / 57);
        field_X = null;
        field_N = null;
    }

    public final void a(int param0, byte param1, se param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (-1 != (param0 ^ -1)) {
                if (1 == param0) {
                  hb.a("privacy.ws", (byte) -118);
                  break L1;
                } else {
                  if ((param0 ^ -1) != -3) {
                    break L1;
                  } else {
                    hb.a("conduct.ws", (byte) -118);
                    break L1;
                  }
                }
              } else {
                hb.a("terms.ws", (byte) -118);
                break L1;
              }
            }
            if (param1 == -108) {
              break L0;
            } else {
              field_X = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ol.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    private final int a(mf param0, int param1, int param2, String param3, int param4) {
        RuntimeException var6 = null;
        jn var7 = null;
        int var8 = 0;
        kg var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new kg(20, param4, 120 + param1, 25, param0, false, 120, 3, rb.field_b, 16777215, param3);
            this.b(var9, 95);
            var8 = 114 % ((param2 - -74) / 46);
            var7 = new jn(((ee) ((Object) param0)).a(-109));
            this.b(var7, 95);
            var7.a(var9.field_r + (-15 + var9.field_C >> 1829877217), 34, 15, 15, var9.field_y + var9.field_u - -3);
            stackIn_1_0 = var9.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("ol.R(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean h(byte param0) {
        java.awt.Component var3;
        if (param0 <= -110) {
          if (this.a((ee) (this.field_T), -127)) {
            if (this.a((ee) (this.field_Q), -5)) {
              if (this.a((ee) (this.field_L), -126)) {
                if (this.a((ee) (this.field_U), -104)) {
                  if (this.a((ee) (this.field_Z), -103)) {
                    if (!this.a((ee) (this.field_W), -107)) {
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
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var3 = (java.awt.Component) null;
          ol.a((java.awt.Component) null, 116);
          if (this.a((ee) (this.field_T), -127)) {
            if (this.a((ee) (this.field_Q), -5)) {
              if (this.a((ee) (this.field_L), -126)) {
                if (this.a((ee) (this.field_U), -104)) {
                  if (this.a((ee) (this.field_Z), -103)) {
                    if (!this.a((ee) (this.field_W), -107)) {
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
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(String param0, byte param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_T;
            var4 = param0;
            ((qn) ((Object) var3)).a(0, false, var4);
            if (param1 < -119) {
              break L0;
            } else {
              this.field_U = (bg) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("ol.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static km[] a(um param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        km[] stackIn_2_0 = null;
        km[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -117) {
              var4_int = param0.a(param2, 0);
              var5 = param0.a(param1, 7, var4_int);
              stackIn_4_0 = jg.a((byte) -96, var5, param0, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (km[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ol.T(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0) {
        ((uh) ((Object) this.field_T.a(-108))).h(-121);
        if (param0 != 120) {
            ol.a((byte) 99, true);
        }
    }

    private final String g(byte param0) {
        if (param0 != 79) {
            this.field_W = (bg) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -23) {
            return;
        }
        di.a(param0 ^ 13, param1);
        fn.a((byte) -119, param1);
    }

    private final boolean i(int param0) {
        if (!(this.h((byte) -128))) {
            return false;
        }
        if (param0 >= -45) {
            this.field_V = (fb) null;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_W.field_v);
        } catch (NumberFormatException numberFormatException) {
        }
        return bk.a((byte) 89, this.field_P.field_I, this.field_T.field_v, (ol) (this), this.field_Q.field_v, var2, this.field_U.field_v);
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (99 == param1) {
                  stackIn_10_0 = this.a(param3, (byte) -73);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(param3, param2 + 27965);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ol.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final boolean a(ee param0, int param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mk var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(-123);
            var4 = 82 % ((param1 - -61) / 39);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = var3.a(21314);
              if (qk.field_b != var5) {
                if (in.field_g == var5) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (qf.field_d == var5) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ol.AA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        boolean discarded$0 = false;
        try {
            super.a(param0, -120, param2, param3);
            this.field_V.field_H = this.h((byte) -123);
            if (param1 >= -6) {
                discarded$0 = this.i(-8);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ol.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final int a(int param0, String param1, byte param2, int param3, mf param4, String param5, int param6) {
        int discarded$1 = 0;
        RuntimeException var8 = null;
        ea var9 = null;
        String var10 = null;
        kg var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var11 = new kg(20, param6, param0 + 120, 25, param4, false, 120, 3, rb.field_b, 16777215, param1);
              if (param2 == -71) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$1 = this.a((mf) null, 100, 24, (String) null, -11);
                break L1;
              }
            }
            this.b(var11, 95);
            var9 = new ea(((ee) ((Object) param4)).a(-125), param5, 126, var11.field_C + param6, 50 + param0, param3);
            var9.field_p = (rg) (this);
            this.b(var9, 95);
            stackIn_3_0 = var9.field_C + var11.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ol.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public ol() {
        super(0, 0, 496, 0, (jm) null);
        this.field_T = new bg("", (rg) null, 12);
        this.field_Q = new bg("", (rg) null, 100);
        this.field_L = new bg("", (rg) null, 100);
        this.field_U = new bg("", (rg) null, 20);
        this.field_Z = new bg("", (rg) null, 20);
        this.field_W = new bg("", (rg) null, 3);
        int var1 = 1;
        this.field_P = new ki("", (rg) null, var1 != 0);
        this.field_V = new fb(ei.field_r, (rg) null);
        this.field_M = new fb(vf.field_c, (rg) null);
        this.field_T.field_j = vc.field_a;
        this.field_Q.field_j = mi.field_o;
        this.field_L.field_j = hl.field_q;
        this.field_U.field_j = tc.field_A;
        this.field_Z.field_j = wk.field_a;
        this.field_W.field_j = fm.field_P;
        this.field_P.field_j = pa.field_k;
        this.field_T.a(-96, new uh(this.field_T));
        this.field_Q.a(-123, new tj(this.field_Q));
        this.field_L.a(-66, new db(this.field_L, this.field_Q));
        this.field_U.a(-115, new je(this.field_U, this.field_T, this.field_Q));
        this.field_Z.a(-110, new oc(this.field_Z, this.field_U));
        this.field_W.a(-86, new qi(this.field_W));
        this.field_V.field_H = false;
        this.field_V.field_n = (jm) ((Object) new sf());
        this.field_M.field_n = (jm) ((Object) new wj());
        this.field_T.field_n = (jm) ((Object) new wc(10000536));
        wc dupTemp$0 = new wc(10000536);
        this.field_L.field_n = (jm) ((Object) dupTemp$0);
        this.field_Q.field_n = (jm) ((Object) dupTemp$0);
        this.field_W.field_n = (jm) ((Object) new wc(10000536));
        this.field_P.field_n = (jm) ((Object) new vf());
        hk dupTemp$1 = new hk(10000536);
        this.field_Z.field_n = (jm) ((Object) dupTemp$1);
        this.field_U.field_n = (jm) ((Object) dupTemp$1);
        String var2 = oc.a(la.field_a, new String[]{this.j(25), this.g((byte) 79)}, (byte) -120);
        int var3 = 20;
        var3 = var3 + this.a(true, wh.field_e, var3, 170, this.field_Q);
        var3 = var3 + (this.a(170, qj.field_g, (byte) -71, 20, this.field_L, "", var3) - -5);
        var3 = var3 + this.a(true, di.field_Qb, var3, 170, this.field_U);
        var3 = var3 + (this.a(fn.field_e, 170, uh.field_q, this.field_Z, 170, var3) - -5);
        var3 = var3 + (5 + this.a(tk.field_c, 170, ng.field_d, this.field_T, 170, var3));
        var3 = var3 + this.a(this.field_W, 170, 115, fc.field_a, var3);
        kg var4 = new kg(46, var3, this.field_y - 90, 25, this.field_P, true, this.field_y + -120, 5, rc.field_a, 11579568, li.field_a);
        this.b(var4, 95);
        var3 = var3 + var4.field_C;
        hl var5 = new hl(rb.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, rb.field_b.field_C, -1, 2147483647, true);
        this.field_K = new se(var2, var5);
        this.field_K.field_j = "";
        this.field_K.a(-23750, 0, ok.field_Gb);
        this.field_K.a(-23750, 1, ok.field_Gb);
        this.field_K.field_p = (rg) (this);
        this.field_K.b(46, var3, 1, -90 + this.field_y);
        var3 = var3 + (15 + this.field_K.field_C);
        this.b(this.field_K, 95);
        int var6 = 4;
        int var7 = 200;
        this.field_V.a(var3, 34, 40, var7, 496 - var7 >> -1143359327);
        this.field_M.a(15 + var3, 34, 40, 60, var6 + 3);
        this.field_M.field_p = (rg) (this);
        this.field_V.field_p = (rg) (this);
        this.b(this.field_V, 95);
        this.b(this.field_M, 95);
        this.field_Y = new t((wl) (this));
        this.field_Y.a(20 + this.field_T.field_r, 34, 150, -60 + (-this.field_T.field_y + this.field_y) - this.field_T.field_u, 60 + this.field_T.field_y + this.field_T.field_u);
        this.b(this.field_Y, 95);
        this.a(0, 34, var6 + var3 + 55, 496, 0);
    }

    private final int a(boolean param0, String param1, int param2, int param3, mf param4) {
        kg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_S = (int[]) null;
                break L1;
              }
            }
            var6 = new kg(20, param2, 120 - -param3, 25, param4, false, 120, 3, rb.field_b, 16777215, param1);
            this.b(var6, 95);
            stackIn_3_0 = var6.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("ol.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, int param1, String param2, mf param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 170) {
                break L1;
              } else {
                this.field_U = (bg) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param0, (byte) -71, 35, param3, param2, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ol.U(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final String j(int param0) {
        if (param0 != 25) {
            this.field_Y = (t) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + kb.a(param0, 0, "\n", "%0a"));
        if (param1 != 26613) {
            field_R = (of) null;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener(lg.field_d);
            param0.removeFocusListener(lg.field_d);
            lk.field_e = -1;
            if (param1 != 20) {
                field_R = (of) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ol.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_S = new int[4];
        field_R = new of(1);
        field_X = "Loading sound effects";
    }
}
