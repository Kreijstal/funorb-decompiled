/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    qb field_a;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static String field_b;
    private qb field_d;

    final qb a(byte param0) {
        qb var2 = null;
        var2 = ((bk) this).field_a.field_d;
        if (param0 == 74) {
          if (var2 == ((bk) this).field_a) {
            ((bk) this).field_d = null;
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        } else {
          ((bk) this).field_d = null;
          if (var2 == ((bk) this).field_a) {
            ((bk) this).field_d = null;
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              if (param1 == -25573) {
                L0: {
                  if (!le.field_m.startsWith("win")) {
                    break L0;
                  } else {
                    int discarded$8 = 873140897;
                    if (gl.a(param2)) {
                      return;
                    } else {
                      break L0;
                    }
                  }
                }
                {
                  L1: {
                    param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var4_ref;
                stackOut_10_1 = new StringBuilder().append("bk.C(");
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L2;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L2;
                }
              }
              L3: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
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
              throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qb d(int param0) {
        qb var2 = null;
        Object var3 = null;
        var2 = ((bk) this).field_a.field_d;
        if (param0 < -58) {
          if (var2 == ((bk) this).field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        } else {
          var3 = null;
          ((bk) this).a((qb) null, -66);
          if (var2 == ((bk) this).field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        }
    }

    final qb b(byte param0) {
        qb var2 = null;
        var2 = ((bk) this).field_d;
        if (((bk) this).field_a == var2) {
          ((bk) this).field_d = null;
          return null;
        } else {
          if (param0 > -91) {
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        }
    }

    public static void a() {
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2220) {
          L0: {
            field_c = null;
            if (((bk) this).field_a != ((bk) this).field_a.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((bk) this).field_a != ((bk) this).field_a.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final qb b(int param0) {
        qb var2 = null;
        if (param0 < -6) {
          var2 = ((bk) this).field_a.field_a;
          if (((bk) this).field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        } else {
          field_f = null;
          var2 = ((bk) this).field_a.field_a;
          if (((bk) this).field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        }
    }

    final void a(int param0, qb param1) {
        try {
            if (!(null == param1.field_a)) {
                param1.c(109);
            }
            param1.field_a = ((bk) this).field_a;
            if (param0 > -119) {
                Object var4 = null;
                bk.a((java.applet.Applet) null, 44, (String) null, true);
            }
            param1.field_d = ((bk) this).field_a.field_d;
            param1.field_a.field_d = param1;
            param1.field_d.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bk() {
        ((bk) this).field_a = new qb();
        ((bk) this).field_a.field_d = ((bk) this).field_a;
        ((bk) this).field_a.field_a = ((bk) this).field_a;
    }

    final void a(qb param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.c(107);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_a = ((bk) this).field_a.field_a;
            param0.field_d = ((bk) this).field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            if (param1 == 27362) {
              break L0;
            } else {
              var4 = null;
              bk.a((java.applet.Applet) null, -120, (String) null, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("bk.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        qb var2 = null;
        int var3 = 0;
        var3 = Main.field_T;
        L0: while (true) {
          var2 = ((bk) this).field_a.field_d;
          if (var2 == ((bk) this).field_a) {
            if (param0 != 29026) {
              field_c = null;
              ((bk) this).field_d = null;
              return;
            } else {
              ((bk) this).field_d = null;
              return;
            }
          } else {
            var2.c(param0 ^ 28988);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Account created successfully!";
        field_b = "Email address is unavailable";
        field_f = "Loading graphics";
    }
}
