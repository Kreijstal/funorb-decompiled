/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ci {
    static ci field_Tb;
    int field_Sb;
    static String field_Zb;
    static String field_Fb;
    static int field_Eb;
    ci field_Ob;
    long field_Yb;
    boolean field_Qb;
    static boolean field_bc;
    int field_Vb;
    int field_Jb;
    int field_Wb;
    ci field_Xb;
    String field_Lb;
    boolean field_Hb;
    int field_Mb;
    int field_Pb;
    String field_Rb;
    boolean field_ac;
    ci field_Gb;
    static dk field_Ib;
    ci field_Kb;
    ci field_Ub;
    long field_Nb;

    final boolean a(r param0, int param1) {
        RuntimeException var3 = null;
        r var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_Qb;

              if (this.field_Qb) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            if ((stackIn_3_0 ? 1 : 0) != stackIn_3_1) {
              L2: {
                if (param1 == -343) {
                  break L2;
                } else {
                  var4 = (r) null;
                  this.a((r) null, -42);
                  break L2;
                }
              }
              L3: {
                if (param0.field_ac) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = 1;
                  break L3;
                }
              }
              if (stackIn_11_0 == (this.field_ac ? 1 : 0)) {
                stackIn_14_0 = this.field_ac;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (this.field_Nb >= param0.field_Nb) {
                    stackIn_18_0 = 0;
                    break L4;
                  } else {
                    stackIn_18_0 = 1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_Qb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("r.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
            if (param0 != 1) {
                this.field_Gb = (ci) null;
            }
            this.field_Lb = param1;
            this.field_Rb = param2;
            var5 = (CharSequence) ((Object) this.field_Rb);
            ad.a(var5, -2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "r.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void k(int param0) {
        h var1;
        if (param0 != 3029) {
          return;
        } else {
          L0: {
            var1 = (h) ((Object) ni.field_c.c(101));
            if (var1 == null) {
              var1 = new h();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(wb.field_h, wb.field_c, 0, wb.field_d, wb.field_j, wb.field_i, wb.field_b, wb.field_a);
          tm.field_a.a((o) (var1), (byte) -39);
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, le param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              o.field_f = param2;
              de.field_c = param3;
              bb.field_b = param0;
              if (param1 <= -46) {
                break L1;
              } else {
                field_Ib = (dk) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("r.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    r(String param0, String param1, long param2) {
        super(0L, (ci) null);
        CharSequence var6 = null;
        try {
            this.field_Lb = param1;
            this.field_Rb = param0;
            this.field_Yb = param2;
            var6 = (CharSequence) ((Object) this.field_Rb);
            ad.a(var6, -2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean l(int param0) {
        if (param0 != 1) {
            return true;
        }
        return !this.e(-4) ? true : false;
    }

    public static void m(int param0) {
        field_Zb = null;
        int var1 = -85 / ((-34 - param0) / 32);
        field_Tb = null;
        field_Ib = null;
        field_Fb = null;
    }

    final static boolean a(boolean param0, nk param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (1 != param1.e(-63, 1)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("r.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
        field_Zb = "Continue spectating";
        field_Fb = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
