/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends km {
    boolean field_Sb;
    static int[] field_Tb;
    static byte[] field_Pb;
    int field_Gb;
    km field_Lb;
    String field_Nb;
    long field_Ib;
    long field_Ob;
    boolean field_Xb;
    km field_Hb;
    int field_Wb;
    int field_Rb;
    int field_Ub;
    int field_Vb;
    km field_Mb;
    boolean field_Jb;
    km field_Kb;
    km field_Yb;
    String field_Eb;
    int field_Fb;
    static il field_Qb;

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            lk.e((byte) -9);
            if (this.a(1)) {
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
            if (this.a(1)) {
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

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
            this.field_Eb = param0;
            if (param2 != 0) {
                this.field_Nb = (String) null;
            }
            this.field_Nb = param1;
            var5 = (CharSequence) ((Object) this.field_Nb);
            c.a(var5, true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "lk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_Sb == param1.field_Sb) {
              if (param0 >= 1) {
                L1: {
                  if (this.field_Xb) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                L2: {


                  if (param1.field_Xb) {

                    stackIn_12_1 = 0;
                    break L2;
                  } else {

                    stackIn_12_1 = 1;
                    break L2;
                  }
                }
                if (stackIn_9_0 != stackIn_12_1) {
                  stackIn_15_0 = this.field_Xb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if ((param1.field_Ib ^ -1L) >= (this.field_Ib ^ -1L)) {
                      stackIn_19_0 = 0;
                      break L3;
                    } else {
                      stackIn_19_0 = 1;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_Sb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("lk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_Tb = null;
        if (param0 != 10) {
            return;
        }
        field_Pb = null;
        field_Qb = null;
    }

    lk(String param0, String param1, long param2) {
        super(0L, (km) null);
        CharSequence var6 = null;
        try {
            this.field_Ob = param2;
            this.field_Nb = param0;
            this.field_Eb = param1;
            var6 = (CharSequence) ((Object) this.field_Nb);
            c.a(var6, true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
