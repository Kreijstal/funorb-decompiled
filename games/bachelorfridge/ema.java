/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends sna {
    int field_xb;
    String field_Hb;
    int field_Mb;
    sna field_Fb;
    int field_Kb;
    int field_Jb;
    boolean field_Ob;
    String field_Nb;
    sna field_Bb;
    int field_yb;
    sna field_Db;
    boolean field_wb;
    static String field_Lb;
    sna field_Ib;
    sna field_vb;
    int field_Gb;
    long field_Eb;
    boolean field_zb;
    long field_Cb;
    static String field_Ab;

    final boolean a(int param0, ema param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_Ob) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_Ob) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            if (stackIn_3_0 != stackIn_6_1) {
              stackIn_9_0 = this.field_Ob;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  this.field_Bb = (sna) null;
                  break L3;
                }
              }
              L4: {
                if (param1.field_wb) {
                  stackIn_15_0 = 0;
                  break L4;
                } else {
                  stackIn_15_0 = 1;
                  break L4;
                }
              }
              if (stackIn_15_0 == (this.field_wb ? 1 : 0)) {
                stackIn_18_0 = this.field_wb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  if ((this.field_Cb ^ -1L) <= (param1.field_Cb ^ -1L)) {
                    stackIn_22_0 = 0;
                    break L5;
                  } else {
                    stackIn_22_0 = 1;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("ema.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final boolean f(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 21) {
          L0: {
            this.field_Eb = 8L;
            if (this.a(0)) {
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
            if (this.a(0)) {
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

    public static void f(int param0) {
        if (param0 != 0) {
            ema.f(56);
            field_Ab = null;
            field_Lb = null;
            return;
        }
        field_Ab = null;
        field_Lb = null;
    }

    ema(String param0, String param1, long param2) {
        super(0L, (sna) null);
        CharSequence var6 = null;
        try {
            this.field_Eb = param2;
            this.field_Hb = param0;
            this.field_Nb = param1;
            var6 = (CharSequence) ((Object) this.field_Hb);
            fq.a(0, var6);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ema.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, int param1, String param2) {
        CharSequence var5 = null;
        try {
            this.field_Nb = param2;
            this.field_Hb = param0;
            var5 = (CharSequence) ((Object) this.field_Hb);
            fq.a(param1 + param1, var5);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ema.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Lb = "members-only content";
        field_Ab = "Loading...";
    }
}
