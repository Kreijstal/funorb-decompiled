/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends cj {
    static String field_Jb;
    private cj field_Lb;
    static ja field_Mb;
    private cj field_Fb;
    static th field_Kb;
    static int field_Gb;
    static String field_Nb;
    static cj[] field_Ib;
    static int field_Hb;

    mi(long param0, ja param1, ja param2, int param3, cj param4, String param5) {
        this(param0, (cj) null, param4, param5);
        try {
            this.field_Lb.field_lb = param3;
            this.field_Lb.field_rb = param2;
            this.field_Lb.field_O = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    mi(long param0, mi param1, String param2) {
        this(param0, param1.field_Lb, param1.field_Fb, param2);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        this.a(param5, param0, param3, param4, -3344);
        int var7 = 121 / ((param1 - -34) / 45);
        this.e(true, param2);
    }

    final int a(byte param0, int param1) {
        if (param0 <= 92) {
            this.e(false, -106);
            return param1 + (this.field_Lb.e(0) + this.field_Fb.e(0));
        }
        return param1 + (this.field_Lb.e(0) + this.field_Fb.e(0));
    }

    private final void e(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            mi.b(-119, -84);
            this.field_Lb.a(this.field_z, 0, this.field_Lb.e(0), 0, -3344);
            var3 = param1 + this.field_Lb.field_zb;
            this.field_Fb.a(this.field_z, 0, this.field_zb - var3, var3, -3344);
            return;
        }
        this.field_Lb.a(this.field_z, 0, this.field_Lb.e(0), 0, -3344);
        var3 = param1 + this.field_Lb.field_zb;
        this.field_Fb.a(this.field_z, 0, this.field_zb - var3, var3, -3344);
    }

    public static void d(boolean param0) {
        field_Kb = null;
        field_Ib = null;
        if (param0) {
          mi.d(false);
          field_Nb = null;
          field_Mb = null;
          field_Jb = null;
          return;
        } else {
          field_Nb = null;
          field_Mb = null;
          field_Jb = null;
          return;
        }
    }

    final static void a(jh param0, int param1) {
        jh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        jh stackIn_6_0 = null;
        jh stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        jh stackIn_10_0 = null;
        jh stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_5_0 = null;
        jh stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        jh stackOut_9_0 = null;
        jh stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 < -52) {
              param0.a(true);
              var2 = (jh) ((Object) tn.field_C.c(79));
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var2 == null) {
                        break L4;
                      } else {
                        stackOut_5_0 = (jh) (var2);
                        stackOut_5_1 = (jh) (param0);
                        stackOut_5_2 = -53;
                        stackIn_10_0 = stackOut_5_0;
                        stackIn_10_1 = stackOut_5_1;
                        stackIn_10_2 = stackOut_5_2;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        if (var3 != 0) {
                          break L3;
                        } else {
                          if (!((jh) (Object) stackIn_6_0).a(stackIn_6_1, (byte) stackIn_6_2)) {
                            break L4;
                          } else {
                            var2 = (jh) ((Object) tn.field_C.b(6));
                            if (var3 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (var2 == null) {
                      break L2;
                    } else {
                      stackOut_9_0 = (jh) (var2);
                      stackOut_9_1 = (jh) (param0);
                      stackOut_9_2 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  vc.a(stackIn_10_0, stackIn_10_1, stackIn_10_2 != 0);
                  if (var3 == 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
                tn.field_C.a(param0, false);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2_ref);
            stackOut_13_1 = new StringBuilder().append("mi.CA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private mi(long param0, cj param1, cj param2, String param3) {
        super(param0, (cj) null);
        try {
            this.field_Lb = new cj(0L, param1);
            this.field_Fb = new cj(0L, param2);
            this.field_Fb.field_wb = param3;
            this.a((byte) 50, this.field_Lb);
            this.a((byte) 50, this.field_Fb);
            this.f(-128);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.a(109, param0);
        var2.a(-116, 0);
    }

    static {
        field_Jb = "Report <%0> for abuse";
        field_Kb = new th();
        field_Nb = "Visit the Account Management section on the main site to view.";
    }
}
