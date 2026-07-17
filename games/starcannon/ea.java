/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static char[] field_c;
    static hl[] field_b;
    static n field_a;
    static df field_d;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 48) {
            return;
        }
        field_d = null;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        of var4_ref_of = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        pg var8 = null;
        ia var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var9 = se.field_p;
              var2 = var9.j(7909);
              if (var2 == 0) {
                var8 = (pg) (Object) ab.field_H.c(-3905);
                if (var8 == null) {
                  int discarded$4 = 27;
                  ec.a();
                  return;
                } else {
                  L2: {
                    var4 = var9.j(7909);
                    if (var4 == 0) {
                      var5 = null;
                      break L2;
                    } else {
                      var13 = new byte[var4];
                      var9.a(var4, (byte) 88, var13, 0);
                      break L2;
                    }
                  }
                  var9.field_g = var9.field_g + 4;
                  if (!var9.f(0)) {
                    int discarded$5 = 27;
                    ec.a();
                    return;
                  } else {
                    var8.b(4);
                    break L1;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var9.f((byte) -91);
                  var4_ref_of = (of) (Object) fi.field_c.c(-3905);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_of == null) {
                        break L4;
                      } else {
                        if (var4_ref_of.field_h != var3) {
                          var4_ref_of = (of) (Object) fi.field_c.a(-16913);
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4_ref_of != null) {
                      var4_ref_of.b(4);
                      break L1;
                    } else {
                      int discarded$6 = 27;
                      ec.a();
                      return;
                    }
                  }
                } else {
                  hc.a((Throwable) null, "A1: " + oe.a(-121), (byte) 74);
                  int discarded$7 = 27;
                  ec.a();
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ea.B(" + -107 + 41);
        }
    }

    final static void a(int param0) {
        ti.field_b.l(26756);
        if (!(null != ve.field_f)) {
            ve.field_f = new lf(ti.field_b, sg.field_n);
        }
        ti.field_b.a((byte) 81, (uj) (Object) ve.field_f);
        if (param0 > -19) {
            ea.a((byte) -78);
        }
    }

    final static void a(byte param0, vc param1) {
        ia var3 = null;
        try {
            if (param0 < 39) {
                field_b = null;
            }
            var3 = d.field_b;
            var3.d((byte) 74, 3);
            var3.a(5, -70);
            var3.a(0, -120);
            var3.c(param1.field_i, -306);
            var3.a(param1.field_h, -50);
            var3.a(param1.field_l, -80);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ea.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 3 + 41);
        }
    }

    final static void a(Object param0, int param1, ka param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            if (null != param2.field_w) {
              var4 = -109 % ((param1 - 3) / 59);
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (param2.field_w.peekEvent() == null) {
                      break L2;
                    } else {
                      uc.a(-117, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param0 == null) {
                        break L4;
                      } else {
                        param2.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ea.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new char[]{'[', ']', '#'};
        field_b = new hl[9];
    }
}
