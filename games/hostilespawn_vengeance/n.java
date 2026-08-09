/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends hi {
    static vl field_v;
    static boolean field_o;
    private boolean field_r;
    static cb field_t;
    private String field_u;
    static int field_s;
    static bd field_q;
    static String[] field_p;

    final bm a(String param0, byte param1) {
        jj var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        bm stackIn_3_0 = null;
        bm stackIn_9_0 = null;
        bm stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!oc.a(var4, 1)) {
              stackIn_3_0 = bi.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_u)) {
                  break L1;
                } else {
                  L2: {
                    var3 = ph.a(param0, -79);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null == var3.field_l) {
                        this.field_u = param0;
                        this.field_r = var3.field_b;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = m.field_n;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                var3_int = -71 % ((param1 - 3) / 42);
                if (this.field_r) {
                  stackIn_14_0 = nd.field_d;
                  break L3;
                } else {
                  stackIn_14_0 = bi.field_d;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("n.L(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -69) {
            n.d((byte) 14);
            field_v = null;
            return;
        }
        field_v = null;
    }

    n(ig param0) {
        super(param0);
        this.field_r = false;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jj var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            var3 = ml.a((byte) -110, var6);
            var4 = -71 / ((param0 - -24) / 35);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1.equals(this.field_u)) {
                  var5 = ph.a(param1, -86);
                  if (var5 != null) {
                    if (null == var5.field_l) {
                      this.field_u = param1;
                      this.field_r = var5.field_b;
                      break L1;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_r) {
                stackIn_16_0 = kj.field_a;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_14_0 = om.field_f;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("n.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final static void b(boolean param0, byte param1) {
        if (param1 < -86) {
          mb.field_s.a(500, 8000);
          if (-2 == (jh.field_ab ^ -1)) {
            jn.l(0);
            if (!param0) {
              db.a(false, 256, dg.field_tb);
              return;
            } else {
              db.a(true, 256, vg.field_h);
              db.a(false, 256, dg.field_tb);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        this.field_u = null;
        if (param0 != -2) {
            n.d((byte) 54);
        }
    }

    static {
        field_o = false;
        field_v = new vl();
        field_p = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
