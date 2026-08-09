/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends llb {
    static int field_Cb;
    llb field_Ib;
    boolean field_Lb;
    llb field_wb;
    String field_xb;
    long field_zb;
    int field_yb;
    int field_Db;
    String field_Hb;
    boolean field_Eb;
    llb field_Jb;
    boolean field_Fb;
    int field_Gb;
    long field_Kb;
    llb field_Nb;
    int field_Ab;
    int field_vb;
    int field_Bb;
    llb field_Mb;

    final boolean a(int param0, jk param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
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
              if (param1.field_Fb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            if (stackIn_3_0 != (this.field_Fb ? 1 : 0)) {
              if (param0 == 26344) {
                L2: {
                  if (param1.field_Eb) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                L3: {


                  if (this.field_Eb) {

                    stackIn_15_1 = 0;
                    break L3;
                  } else {

                    stackIn_15_1 = 1;
                    break L3;
                  }
                }
                if (stackIn_12_0 == stackIn_15_1) {
                  L4: {
                    if (this.field_Kb >= param1.field_Kb) {
                      stackIn_21_0 = 0;
                      break L4;
                    } else {
                      stackIn_21_0 = 1;
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_17_0 = this.field_Eb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_Fb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("jk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final boolean i(int param0) {
        int var2 = -19 / ((-46 - param0) / 57);
        return !this.c((byte) 97) ? true : false;
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var6 = null;
        try {
            this.field_xb = param0;
            this.field_Hb = param1;
            if (param2 != -424) {
                jk var5 = (jk) null;
                this.a(-116, (jk) null);
            }
            var6 = (CharSequence) ((Object) this.field_Hb);
            jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jk(String param0, String param1, long param2) {
        super(0L, (llb) null);
        CharSequence var6 = null;
        try {
            this.field_zb = param2;
            this.field_xb = param1;
            this.field_Hb = param0;
            var6 = (CharSequence) ((Object) this.field_Hb);
            jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void h(int param0) {
        sp.field_p = ik.a(param0 + -21167);
        if (param0 != 118) {
            field_Cb = 85;
        }
    }

    static {
    }
}
