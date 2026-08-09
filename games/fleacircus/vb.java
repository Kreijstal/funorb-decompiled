/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends java.awt.Canvas implements java.awt.event.FocusListener {
    static dd field_a;
    volatile boolean field_c;
    java.awt.Frame field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(ce param0, int param1) {
        try {
            if (param1 != 20401) {
                field_a = (dd) null;
            }
            hi.a(param0, this.field_b, (byte) 52);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static gm a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        gm var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        gm stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (null != kc.field_c) {
              L1: {
                var3 = -16 % ((param1 - 18) / 62);
                var7 = (CharSequence) ((Object) param0);
                var2 = uk.a(0, var7);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              var4 = (gm) ((Object) kc.field_c.a((long)var2.hashCode(), 16571));
              L2: while (true) {
                if (var4 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var4.field_jb);
                    var5 = uk.a(102, var8);
                    stackIn_18_0 = null;

                    if (var6 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (stackIn_18_0 == var5) {
                          var5 = var4.field_jb;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (!var5.equals(var2)) {
                        var4 = (gm) ((Object) kc.field_c.a(-113));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          stackIn_18_0 = null;
                          break L3;
                        }
                      } else {
                        stackIn_15_0 = (gm) (var4);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("vb.B(");

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
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gm) ((Object) stackIn_18_0);
        } else {
          return stackIn_15_0;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -29039) {
            rh var2 = (rh) null;
            vb.a(92, (rh) null, -70, -1);
        }
    }

    final static dd a(int param0, rh param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -21) {
              break L0;
            } else {
              field_a = (dd) null;
              break L0;
            }
          }
          if (ha.a(param1, -32180, param2, param3)) {
            return qa.h(114);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    vb() {
    }

    static {
    }
}
