/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends vh {
    String field_dc;
    int field_Rb;
    static tk field_Qb;
    boolean field_Pb;
    static qp field_Ub;
    static int field_fc;
    long field_Sb;
    int field_Nb;
    boolean field_Yb;
    String field_jc;
    static int field_Wb;
    int field_Xb;
    static boolean[] field_cc;
    static dd field_Lb;
    int field_hc;
    long field_Mb;
    static String field_Ob;
    vh field_ac;
    int field_gc;
    static String[] field_ic;
    vh field_Zb;
    static dd field_Vb;
    int field_bc;
    boolean field_mc;
    vh field_lc;
    vh field_kc;
    vh field_Tb;
    static int field_ec;

    im(String param0, String param1, long param2) {
        super(0L, (vh) null);
        CharSequence var6 = null;
        try {
            this.field_jc = param1;
            this.field_dc = param0;
            this.field_Sb = param2;
            var6 = (CharSequence) ((Object) this.field_dc);
            hq.a(103, var6);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static dd[] a(int param0, int param1, int param2, di param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd[] stackIn_5_0 = null;
        dd[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vj.a(param0, param3, param1, (byte) 121)) {
              if (param2 == 0) {
                stackIn_7_0 = ok.l((byte) 65);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (dd[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("im.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dd[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static vh f(int param0) {
        if (param0 != 0) {
            im.f((byte) 20);
            return aj.field_Mb.field_Mb;
        }
        return aj.field_Mb.field_Mb;
    }

    final void a(String param0, byte param1, String param2) {
        CharSequence var6 = null;
        try {
            this.field_dc = param0;
            if (param1 != 1) {
                im var5 = (im) null;
                this.a((im) null, (byte) -8);
            }
            this.field_jc = param2;
            var6 = (CharSequence) ((Object) this.field_dc);
            hq.a(param1 + 100, var6);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "im.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(im param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_Yb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            if (stackIn_3_0 == (this.field_Yb ? 1 : 0)) {
              stackIn_6_0 = this.field_Yb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -1 / ((4 - param1) / 38);
              if (param0.field_mc == this.field_mc) {
                L2: {
                  if ((this.field_Mb ^ -1L) <= (param0.field_Mb ^ -1L)) {
                    stackIn_13_0 = 0;
                    break L2;
                  } else {
                    stackIn_13_0 = 1;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = this.field_mc;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("im.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public static void f(byte param0) {
        field_Vb = null;
        field_Ub = null;
        field_cc = null;
        field_Lb = null;
        field_ic = null;
        field_Qb = null;
        field_Ob = null;
        if (param0 != -48) {
            String var2 = (String) null;
            im.a((ge) null, (byte) 100, (String) null);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean c(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            this.field_bc = -108;
            if (this.d(59)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.d(59)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(ge param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 75) {
              var3_int = param0.field_v;
              var5 = (CharSequence) ((Object) param2);
              var4 = hi.a(-66, var5);
              param0.b((byte) -49, var4.length);
              param0.field_v = param0.field_v + Pool.field_J.a(0, var4.length, param0.field_t, param0.field_v, var4, true);
              stackIn_4_0 = -var3_int + param0.field_v;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -12;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("im.D(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_Ob = "You can ask to join this game";
        field_ic = new String[]{"Eight-ball", "Nine-ball", "Killer", "Free play"};
    }
}
