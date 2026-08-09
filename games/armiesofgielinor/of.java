/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends je {
    long field_Pb;
    String field_Yb;
    int field_Kb;
    static ru[] field_Mb;
    je field_dc;
    boolean field_Wb;
    je field_fc;
    boolean field_Zb;
    static String field_bc;
    int field_Qb;
    int field_Xb;
    String field_cc;
    static int field_Ib;
    int field_Sb;
    je field_ac;
    je field_ec;
    long field_Vb;
    int field_Rb;
    static je field_Lb;
    static String field_Jb;
    static int field_Nb;
    je field_Tb;
    int field_Ob;
    boolean field_Ub;

    final boolean k(int param0) {
        of var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = (of) null;
            this.a(-15, (of) null);
            if (this.a((byte) -70)) {
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
            if (this.a((byte) -70)) {
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

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
            this.field_Yb = param1;
            this.field_cc = param2;
            var5 = (CharSequence) ((Object) this.field_cc);
            k.a(var5, false);
            if (param0 != 53) {
                of.e((byte) -11);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "of.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    of(String param0, String param1, long param2) {
        super(0L, (je) null);
        CharSequence var6 = null;
        try {
            this.field_Pb = param2;
            this.field_cc = param0;
            this.field_Yb = param1;
            var6 = (CharSequence) ((Object) this.field_cc);
            k.a(var6, false);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, of param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 9687) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((byte) 41, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1.field_Ub) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {


              if (this.field_Ub) {

                stackIn_8_1 = 0;
                break L3;
              } else {

                stackIn_8_1 = 1;
                break L3;
              }
            }
            if (stackIn_5_0 != stackIn_8_1) {
              stackIn_11_0 = this.field_Ub;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                stackIn_14_0 = param1.field_Wb;

                if (this.field_Wb) {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 0;
                  break L4;
                } else {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 1;
                  break L4;
                }
              }
              if ((stackIn_15_0 ? 1 : 0) != stackIn_15_1) {
                L5: {
                  if (this.field_Vb >= param1.field_Vb) {
                    stackIn_21_0 = 0;
                    break L5;
                  } else {
                    stackIn_21_0 = 1;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_17_0 = this.field_Wb;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("of.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        vi.a(cd.field_e, 640, (String) null);
        if (param0 != -24) {
            of.d((byte) -75);
        }
    }

    public static void e(byte param0) {
        if (param0 != 20) {
            of.e((byte) 74);
            field_Jb = null;
            field_bc = null;
            field_Mb = null;
            field_Lb = null;
            return;
        }
        field_Jb = null;
        field_bc = null;
        field_Mb = null;
        field_Lb = null;
    }

    final static void a(ha param0, int param1, int param2, byte param3, int param4, int param5) {
        sl var9 = null;
        int var7 = 0;
        if (!(!nw.g(121))) {
            return;
        }
        try {
            var9 = new sl(param5, param4, param0, param1, param2 > 0 ? true : false);
            bu.field_b = var9;
            vl.field_n.h(32161, 80);
            vl.field_n.field_q = vl.field_n.field_q + 2;
            if (param3 != -80) {
                ha var8 = (ha) null;
                of.a((ha) null, -98, 73, (byte) 105, 55, -24);
            }
            var7 = vl.field_n.field_q;
            var9.a(0, vl.field_n);
            vl.field_n.f(0, vl.field_n.field_q - var7);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "of.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_Ib = -1;
        field_bc = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
