/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends al {
    private int field_mb;
    private cf field_kb;
    private int field_rb;
    private int field_lb;
    static int field_nb;
    static String field_ib;
    private int field_gb;
    static long field_sb;
    static int[] field_ob;
    private lf field_pb;
    private int field_qb;
    static cj field_jb;
    private na field_hb;

    public static void l() {
        field_jb = null;
        field_ob = null;
        field_ib = null;
    }

    boolean i(int param0) {
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ie) this).field_pb != null) {
          if (ld.field_Rb != ((ie) this).field_pb) {
            if (((ie) this).field_pb == lf.field_a) {
              int fieldTemp$2 = ((ie) this).field_lb + 1;
              ((ie) this).field_lb = ((ie) this).field_lb + 1;
              if (fieldTemp$2 == ((ie) this).field_gb) {
                ((ie) this).field_hb.field_E = 256;
                ((ie) this).field_pb = null;
                return super.i(-27388);
              } else {
                ((ie) this).field_hb.field_E = (((ie) this).field_lb << 8) / ((ie) this).field_gb;
                return super.i(-27388);
              }
            } else {
              return super.i(-27388);
            }
          } else {
            int fieldTemp$3 = ((ie) this).field_lb + 1;
            ((ie) this).field_lb = ((ie) this).field_lb + 1;
            if (fieldTemp$3 != ((ie) this).field_qb) {
              ((ie) this).field_hb.field_E = 256 + -((((ie) this).field_lb << 8) / ((ie) this).field_qb);
              return super.i(-27388);
            } else {
              ((ie) this).field_pb = ll.field_j;
              ((ie) this).a(((ie) this).field_mb, (byte) -112, ((ie) this).field_rb + (12 - -((ie) this).field_kb.field_w), 12 - -((ie) this).field_kb.field_n);
              ((ie) this).field_lb = 0;
              ((ie) this).field_hb.field_E = 0;
              return super.i(-27388);
            }
          }
        } else {
          return super.i(-27388);
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, -6208)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((ie) this).field_hb != null) {
                L1: {
                  if (98 != param0) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((ie) this).field_hb.a(param2, 0);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == 99) {
                    boolean discarded$5 = ((ie) this).field_hb.a(param2, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ie.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -6208 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static void a(boolean param0, boolean param1) {
        if (null != ki.field_e) {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d - oo.field_e);
          ki.field_e.c(param0, -1);
          field_ob = null;
          return;
        } else {
          field_ob = null;
          return;
        }
    }

    final void j(byte param0) {
        if (param0 < -70) {
          if (ld.field_Rb == ((ie) this).field_pb) {
            return;
          } else {
            ((ie) this).field_pb = lf.field_a;
            ((ie) this).field_lb = 0;
            int discarded$2 = 0;
            this.a(((ie) this).field_kb);
            ((ie) this).field_hb.field_E = 0;
            ((ie) this).field_kb = null;
            return;
          }
        } else {
          field_ob = null;
          if (ld.field_Rb == ((ie) this).field_pb) {
            return;
          } else {
            ((ie) this).field_pb = lf.field_a;
            ((ie) this).field_lb = 0;
            int discarded$3 = 0;
            this.a(((ie) this).field_kb);
            ((ie) this).field_hb.field_E = 0;
            ((ie) this).field_kb = null;
            return;
          }
        }
    }

    final boolean h(int param0) {
        ((ie) this).h((byte) 30);
        if (param0 != -6134) {
            return false;
        }
        return super.h(-6134);
    }

    ie(vk param0, cf param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, 12 + (param2 - -param1.field_w));
        try {
            ((ie) this).field_gb = param3;
            ((ie) this).field_qb = param3;
            ((ie) this).field_mb = param4;
            ((ie) this).field_rb = param2;
            int discarded$0 = 0;
            this.a(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void h(byte param0) {
        if (((ie) this).field_pb != null) {
          if (((ie) this).field_pb == lf.field_a) {
            ((ie) this).field_pb = null;
            ((ie) this).field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 >= 29) {
              return;
            } else {
              boolean discarded$8 = ((ie) this).h(-78);
              return;
            }
          } else {
            ((ie) this).b(12 + ((ie) this).field_kb.field_n, ((ie) this).field_kb.field_w + (((ie) this).field_rb + 12), 78);
            int discarded$9 = 0;
            this.a(((ie) this).field_kb);
            ((ie) this).field_pb = null;
            ((ie) this).field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 < 29) {
              boolean discarded$10 = ((ie) this).h(-78);
              return;
            } else {
              return;
            }
          }
        } else {
          super.h((byte) 63);
          if (param0 >= 29) {
            return;
          } else {
            boolean discarded$11 = ((ie) this).h(-78);
            return;
          }
        }
    }

    void a(cf param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((ie) this).field_kb = param0;
            var3_int = -11 % ((param1 - 61) / 56);
            if (((ie) this).field_pb == ll.field_j) {
              ((ie) this).a(((ie) this).field_mb, (byte) -112, 12 - -((ie) this).field_rb - -((ie) this).field_kb.field_w, ((ie) this).field_kb.field_n + 12);
              ((ie) this).field_lb = 0;
              return;
            } else {
              if (ld.field_Rb == ((ie) this).field_pb) {
                break L0;
              } else {
                ((ie) this).field_lb = 0;
                ((ie) this).field_pb = ld.field_Rb;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ie.FA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    private final void a(cf param0) {
        try {
            if (null != ((ie) this).field_hb) {
                ((ie) this).field_hb.a(true);
            }
            if (param0 != null) {
                param0.b(6, 6 + ((ie) this).field_rb, 28972, param0.field_n, param0.field_w);
                ((ie) this).field_hb = new na(param0);
            } else {
                ((ie) this).field_hb = new na();
            }
            ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
            ((ie) this).field_kb = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ie.BA(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    static {
    }
}
