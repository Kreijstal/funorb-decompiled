/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_i;
    boolean field_h;
    boolean field_k;
    int field_e;
    boolean field_g;
    int field_f;
    static String[] field_b;
    static e field_n;
    static wg field_o;
    int field_a;
    static eh field_j;
    int field_c;
    boolean field_m;
    boolean field_d;
    static String field_l;

    jf() {
        this(3);
    }

    final static void a(boolean param0, eh param1, eh param2, eh param3, int param4) {
        try {
            if (param4 != -1) {
                field_n = (e) null;
            }
            w.field_I = oe.a("", false);
            w.field_I.a(false, 11358);
            cf.a(param2, param3, 60, param1);
            jg.b(461050508);
            cb.field_c = kh.field_e;
            pa.field_l = kh.field_e;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "jf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (null != he.field_Wb) {
              if (param0 <= -51) {
                L1: {
                  if (param1.toLowerCase().indexOf(he.field_Wb.toLowerCase()) < 0) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final static vh a(byte[] param0, int param1) {
        vh var2 = null;
        RuntimeException var2_ref = null;
        vh stackIn_5_0 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_6_0 = null;
        vh stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new vh(param0, el.field_w, mb.field_bb, db.field_k, gb.field_F, k.field_c, lj.field_j);
              pe.b((byte) -28);
              if (param1 == 20) {
                stackOut_6_0 = (vh) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (vh) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("jf.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        field_n = null;
        field_l = null;
        if (param0 != -124) {
          field_o = (wg) null;
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    jf(int param0) {
        int var2 = 0;
        var2 = param0;
        if (var2 == 0) {
          this.field_h = false;
          this.field_k = false;
          this.field_g = false;
          this.field_f = 0;
          this.field_m = false;
          this.field_e = -1;
          this.field_d = true;
          return;
        } else {
          if (var2 == 1) {
            this.field_e = -1;
            this.field_g = false;
            this.field_f = 0;
            this.field_a = 20;
            this.field_h = false;
            this.field_c = 50;
            this.field_k = false;
            this.field_m = true;
            this.field_i = 1;
            this.field_d = true;
            return;
          } else {
            if ((var2 ^ -1) == -3) {
              this.field_f = 0;
              this.field_e = -1;
              this.field_g = true;
              this.field_m = false;
              this.field_h = false;
              this.field_k = false;
              this.field_d = true;
              return;
            } else {
              L0: {
                if (var2 != 3) {
                  break L0;
                } else {
                  this.field_c = 50;
                  this.field_k = true;
                  this.field_h = false;
                  this.field_f = 0;
                  this.field_a = 20;
                  this.field_g = true;
                  this.field_m = false;
                  this.field_d = true;
                  this.field_e = -1;
                  this.field_i = 1;
                  break L0;
                }
              }
              return;
            }
          }
        }
    }

    static {
        field_l = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
