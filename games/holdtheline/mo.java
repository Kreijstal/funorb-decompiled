/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends dk {
    static int[] field_v;
    static String field_y;
    static qm field_q;
    private hj[] field_t;
    private int field_u;
    private int field_s;
    private int field_x;
    static qi field_w;
    static uf field_r;

    final static kk a(int param0, int param1, ee param2, el param3) {
        kk var4 = null;
        RuntimeException var4_ref = null;
        kk stackIn_2_0 = null;
        kk stackIn_5_0 = null;
        kk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!sm.field_b.b(0)) {
              var4 = (kk) ((Object) sm.field_b.a((byte) 74));
              var4.a(param2, (byte) -79, param0, param3);
              if (param1 == 2931) {
                stackIn_7_0 = (kk) (var4);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (kk) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = new kk(param3, param2, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("mo.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_w = null;
        if (param0 != -1351579448) {
          field_v = (int[]) null;
          field_v = null;
          field_y = null;
          field_q = null;
          return;
        } else {
          field_v = null;
          field_y = null;
          field_q = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        CharSequence var8;
        if (param4 >= 4) {
          if (param1 >= param5) {
            if (param5 + param2 > param1) {
              if (param6 <= param3) {
                if (param3 >= param0 + param6) {
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
          var8 = (CharSequence) null;
          mo.a((CharSequence) null, (byte) 105);
          if (param1 >= param5) {
            if (param5 + param2 > param1) {
              if (param6 <= param3) {
                if (param3 >= param0 + param6) {
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
        }
    }

    public mo() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_p) {
                if (param3.c((byte) -20)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param3 instanceof rm)) {
                break L2;
              } else {
                param0 = param0 & ((rm) ((Object) param3)).field_D;
                break L2;
              }
            }
            L3: {
              if (!param0) {
                stackIn_13_0 = this.field_u;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackIn_13_0 = this.field_x;
                  break L3;
                } else {
                  stackIn_13_0 = this.field_s;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (param0) {
                stackIn_16_0 = 16777215;
                break L4;
              } else {
                stackIn_16_0 = 7105644;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              oj.a(this.field_t, var7, param3.field_k + param1, param4 - -param3.field_o + (param3.field_u + -this.field_t[0].field_v >> 557065601), -102, param3.field_x);
              if (param2 < -48) {
                break L5;
              } else {
                var9 = (CharSequence) null;
                mo.a((CharSequence) null, (byte) -73);
                break L5;
              }
            }
            this.field_f.a(param3.field_q, param1 - -param3.field_k, -2 + (param3.field_o + param4), param3.field_x, param3.field_u, var8, -1, 1, 1, this.field_f.field_G);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("mo.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -116) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                mo.a((CharSequence) null, (byte) -11);
                break L1;
              }
            }
            stackIn_3_0 = gl.a(true, 10, (byte) 106, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mo.A(");

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 993336769;
        param1 = param1 | param1 >>> -948583550;
        if (param0 != 7) {
          return 107;
        } else {
          param1 = param1 | param1 >>> 2077731332;
          param1 = param1 | param1 >>> -1351579448;
          param1 = param1 | param1 >>> -208689168;
          return 1 + param1;
        }
    }

    private mo(int param0, int param1, int param2) {
        this.field_s = param1;
        this.field_f = de.field_I;
        this.field_u = param2;
        this.field_t = vm.field_Ab;
        this.field_x = param0;
    }

    static {
        field_v = new int[]{119, 100, 180, 100};
        field_y = "Connection timed out. Please try using a different server.";
        field_q = new qm(0, 0);
    }
}
