/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends di {
    static String field_m;
    private boolean field_n;
    static String field_r;
    static volatile boolean field_q;
    static cb field_p;
    private ni field_t;
    static int field_s;
    private String field_u;
    static int field_o;

    hd(lb param0, lb param1) {
        super(param0);
        this.field_n = false;
        this.field_u = "";
        try {
            this.field_t = new ni(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 < -112) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_q = true;
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_t.a(-116, param0) != ef.field_b) {
              if (this.a(-108, param0) != ef.field_b) {
                L1: {
                  if (param1 == 426) {
                    break L1;
                  } else {
                    this.field_u = (String) null;
                    break L1;
                  }
                }
                stackIn_9_0 = hf.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = wd.field_H;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_t.a(param0, 426);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hd.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void d(byte param0) {
        if (param0 != 69) {
          hd.d((byte) -97);
          field_r = null;
          field_m = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_m = null;
          field_p = null;
          return;
        }
    }

    final ud a(int param0, String param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        ud stackIn_2_0 = null;
        ud stackIn_6_0 = null;
        ud stackIn_12_0 = null;
        ud stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -106) {
              if (this.field_t.a(-112, param1) == ef.field_b) {
                stackIn_6_0 = ef.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (!param1.equals(this.field_u)) {
                    var3 = ca.a(param1, 647);
                    if (!var3.b((byte) 79)) {
                      stackIn_12_0 = tk.field_t;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      this.field_u = param1;
                      this.field_n = var3.c((byte) -100);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (this.field_n) {
                    stackIn_17_0 = TrackController.field_G;
                    break L2;
                  } else {
                    stackIn_17_0 = ef.field_b;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (ud) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("hd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    static {
        field_q = false;
        field_r = "Sound: ";
        field_m = "Continue";
        field_p = new cb();
    }
}
