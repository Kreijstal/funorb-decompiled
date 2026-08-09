/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ei {
    private nf field_r;
    static volatile int field_q;
    private boolean field_s;
    private String field_p;

    final static void e(int param0) {
        if (null == ng.field_c) {
          if (null == af.field_g) {
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          } else {
            af.field_g.h((byte) 23);
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          }
        } else {
          ng.field_c.a((byte) -20);
          if (null != af.field_g) {
            af.field_g.h((byte) 23);
            if (param0 == -20480) {
              rb.a((byte) -102);
              return;
            } else {
              field_q = 79;
              rb.a((byte) -102);
              return;
            }
          } else {
            if (param0 != -20480) {
              field_q = 79;
              rb.a((byte) -102);
              return;
            } else {
              rb.a((byte) -102);
              return;
            }
          }
        }
    }

    e(kl param0, kl param1) {
        super(param0);
        this.field_p = "";
        this.field_s = false;
        try {
            this.field_r = new nf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param0 < 101) {
          e.a(21, 94);
          return (-20480 + param1 * 64) / 320 + 128;
        } else {
          return (-20480 + param1 * 64) / 320 + 128;
        }
    }

    final vh a(int param0, String param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        vh stackIn_3_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_r.a(param0, param1) == u.field_b) {
              stackIn_3_0 = u.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1.equals(this.field_p)) {
                  var3 = jc.a((byte) 45, param1);
                  if (var3.a(false)) {
                    this.field_p = param1;
                    this.field_s = var3.b(-15493);
                    break L1;
                  } else {
                    stackIn_8_0 = nd.field_P;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_s) {
                  stackIn_13_0 = u.field_b;
                  break L2;
                } else {
                  stackIn_13_0 = ce.field_e;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("e.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_r.a(8192, param1) == u.field_b) {
              stackIn_3_0 = this.field_r.a((byte) 94, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 47) {
                if (this.a(8192, param1) == u.field_b) {
                  stackIn_10_0 = ce.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return fl.field_e;
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("e.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            return;
        }
        ib.field_f.a(param1, -87);
    }

    static {
        field_q = -1;
    }
}
