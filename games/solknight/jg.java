/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_b;
    static int field_e;
    volatile boolean field_a;
    java.awt.Frame field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((jg) this).field_a = true;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        qc var4 = null;
        sd var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (qc) (Object) sb.field_c.a((byte) 51);
            L1: while (true) {
              if (var4 == null) {
                var5 = (sd) (Object) r.field_b.a((byte) 51);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    fi.a(var5, 3, -24045);
                    var5 = (sd) (Object) r.field_b.b(-119);
                    continue L2;
                  }
                }
              } else {
                ah.a(false, 3, var4);
                var4 = (qc) (Object) sb.field_c.b(-121);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "jg.C(" + 3 + ',' + -100 + ')');
        }
    }

    final void a(int param0, dl param1) {
        if (param0 != -3680) {
            return;
        }
        try {
            de.a(param1, ((jg) this).field_c, (byte) 126);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rl param0, int param1, boolean param2) {
        try {
            int var3_int = -44;
            uf.a(param2, 123, 256, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jg.E(" + (param0 != null ? "{...}" : "null") + ',' + 86 + ',' + param2 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != null) {
            var2_int = 0;
            var3 = param0.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!ck.a(param0.charAt(var2_int), true)) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!ck.a(param0.charAt(var3 - 1), true)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 - var2_int;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (~var3 >= ~var6) {
                        if (0 != var5.length()) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var7 = param0.charAt(var6);
                          if (c.a(0, (char) var7)) {
                            var8 = we.a(2, (char) var7);
                            if (var8 == 0) {
                              break L5;
                            } else {
                              StringBuilder discarded$1 = var5.append((char) var8);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (String) (Object) stackIn_16_0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("jg.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + -2 + ')');
        }
    }

    final static void a(byte param0) {
        fb.a(255);
    }

    jg() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = -1;
        field_d = false;
    }
}
