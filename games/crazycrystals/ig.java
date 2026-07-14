/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ig extends pn {
    private dl[] field_o;
    private boolean field_r;
    static String field_p;
    private int field_n;
    static String field_m;
    static dl field_q;

    final boolean a(boolean param0, f[][] param1, mj param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0) {
          L0: {
            field_p = null;
            if (((ig) this).field_r) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((ig) this).field_l.a(param0, param1, param2);
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ig) this).field_r) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((ig) this).field_l.a(param0, param1, param2);
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_6_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_2_0 = 0;
        if (param0 != 16736352) {
          L0: {
            field_m = null;
            if (!((ig) this).field_r) {
              stackOut_7_0 = ((ig) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
              stackIn_8_0 = stackOut_7_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (!((ig) this).field_r) {
              stackOut_3_0 = ((ig) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
              stackIn_4_0 = stackOut_3_0 ? 1 : 0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = -128 / ((-43 - param2) / 51);
        wd.field_j = wd.field_j - 1;
        fn.field_j = fn.field_j + ob.field_l;
        ((ig) this).field_n = ((ig) this).field_n + 1;
        if (!(-25 < (((ig) this).field_n ^ -1))) {
            ob.field_l = ob.field_l + 1;
            fn.field_j = fn.field_j - wd.field_j;
            if (!((ig) this).field_r) {
                return ((ig) this).field_l;
            }
            ((ig) this).field_l.a((byte) 81, (f) this);
            return ((ig) this).field_l;
        }
        return (f) this;
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (((ig) this).field_r) {
          if (param5 != -87) {
            field_m = null;
            return (f) this;
          } else {
            return (f) this;
          }
        } else {
          ((ig) this).field_l = ((ig) this).field_l.a(param0, param1, param2, param3, param4, (byte) -87);
          if (param5 == -87) {
            return (f) this;
          } else {
            field_m = null;
            return (f) this;
          }
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        ((ig) this).field_l = ((ig) this).field_l.a(param0, param1, param2, param3, (byte) 119);
        int var6 = 47 % ((param4 - 73) / 42);
        return (f) this;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != -21) {
          return false;
        } else {
          L0: {
            if (((ig) this).field_r) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((ig) this).field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(boolean param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((ig) this).field_n = -26;
            if (!((ig) this).field_r) {
              stackOut_7_0 = ((ig) this).field_l.a(true, param1);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (!((ig) this).field_r) {
              stackOut_3_0 = ((ig) this).field_l.a(true, param1);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    ig(f param0, dl[] param1, f param2, boolean param3) {
        super(param2);
        ((ig) this).field_n = 0;
        ((ig) this).field_j = true;
        ((ig) this).field_r = param3 ? true : false;
        ((ig) this).field_o = param1;
        ((ig) this).a((byte) 67, param0);
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        ((ig) this).field_l = ((ig) this).field_l.a(param0, param1, param2, param3, (byte) -113, param5, param6);
        if (param4 >= -87) {
          field_p = null;
          return super.a(param0, param1, param2, param3, (byte) -121, param5, param6);
        } else {
          return super.a(param0, param1, param2, param3, (byte) -121, param5, param6);
        }
    }

    final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_6_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_2_0 = 0;
        if (param0 < 43) {
          L0: {
            var3 = null;
            boolean discarded$6 = ((ig) this).a(false, (f[][]) null, (mj) null);
            if (!((ig) this).field_r) {
              stackOut_7_0 = ((ig) this).field_l.b((byte) 83);
              stackIn_8_0 = stackOut_7_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (!((ig) this).field_r) {
              stackOut_3_0 = ((ig) this).field_l.b((byte) 83);
              stackIn_4_0 = stackOut_3_0 ? 1 : 0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 24) {
            ig.f(108);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != -4128) {
          L0: {
            field_m = null;
            if (((ig) this).field_r) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((ig) this).field_l.e(-4128);
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ig) this).field_r) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((ig) this).field_l.e(-4128);
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        if (param1 == 24) {
          if (-25 != (param2 ^ -1)) {
            ((ig) this).field_o[((ig) this).field_n / 3].a(param4, -param2 + param5, param1 * 2, param2 * 3, 256);
            var7 = 49 / ((74 - param0) / 41);
            return;
          } else {
            ((ig) this).field_o[((ig) this).field_n / 3].d(param4, -param2 + param5, 256);
            var7 = 49 / ((74 - param0) / 41);
            return;
          }
        } else {
          ((ig) this).field_o[((ig) this).field_n / 3].a(param4, -param2 + param5, param1 * 2, param2 * 3, 256);
          var7 = 49 / ((74 - param0) / 41);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Members";
    }
}
