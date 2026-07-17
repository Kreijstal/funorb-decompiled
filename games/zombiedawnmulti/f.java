/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_g;
    static String field_b;
    static int field_a;
    private br field_f;
    private int field_e;
    private br[] field_d;
    private br field_h;
    static int field_c;

    final br b(int param0) {
        int var3 = 0;
        Object var4 = null;
        br var5 = null;
        br var6 = null;
        br var9 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((f) this).field_e > 0) {
          if (((f) this).field_h != ((f) this).field_d[((f) this).field_e + -1]) {
            var9 = ((f) this).field_h;
            ((f) this).field_h = var9.field_d;
            return var9;
          } else {
            L0: while (true) {
              if (((f) this).field_g <= ((f) this).field_e) {
                if (param0 > -105) {
                  var4 = null;
                  ((f) this).a(false, -86L, (br) null);
                  return null;
                } else {
                  return null;
                }
              } else {
                int fieldTemp$2 = ((f) this).field_e;
                ((f) this).field_e = ((f) this).field_e + 1;
                var6 = ((f) this).field_d[fieldTemp$2].field_d;
                if (((f) this).field_d[-1 + ((f) this).field_e] != var6) {
                  ((f) this).field_h = var6.field_d;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((f) this).field_g <= ((f) this).field_e) {
              if (param0 > -105) {
                var4 = null;
                ((f) this).a(false, -86L, (br) null);
                return null;
              } else {
                return null;
              }
            } else {
              int fieldTemp$3 = ((f) this).field_e;
              ((f) this).field_e = ((f) this).field_e + 1;
              var5 = ((f) this).field_d[fieldTemp$3].field_d;
              if (((f) this).field_d[-1 + ((f) this).field_e] != var5) {
                ((f) this).field_h = var5.field_d;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < -31) {
            return;
        }
        f.a((byte) -51);
    }

    final br a(int param0, long param1) {
        br var4 = null;
        br var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = ((f) this).field_d[(int)(param1 & (long)(((f) this).field_g - 1))];
        if (param0 == 0) {
          ((f) this).field_f = var4.field_d;
          L0: while (true) {
            if (((f) this).field_f == var4) {
              ((f) this).field_f = null;
              return null;
            } else {
              if (param1 == ((f) this).field_f.field_e) {
                var5 = ((f) this).field_f;
                ((f) this).field_f = ((f) this).field_f.field_d;
                return var5;
              } else {
                ((f) this).field_f = ((f) this).field_f.field_d;
                continue L0;
              }
            }
          }
        } else {
          ((f) this).field_g = -49;
          ((f) this).field_f = var4.field_d;
          L1: while (true) {
            if (((f) this).field_f == var4) {
              ((f) this).field_f = null;
              return null;
            } else {
              if (param1 == ((f) this).field_f.field_e) {
                var5 = ((f) this).field_f;
                ((f) this).field_f = ((f) this).field_f.field_d;
                return var5;
              } else {
                ((f) this).field_f = ((f) this).field_f.field_d;
                continue L1;
              }
            }
          }
        }
    }

    final void a(boolean param0, long param1, br param2) {
        br var5 = null;
        try {
            if (!(param2.field_b == null)) {
                param2.a(true);
            }
            if (!param0) {
                ((f) this).field_g = 88;
            }
            var5 = ((f) this).field_d[(int)(param1 & (long)(((f) this).field_g - 1))];
            param2.field_d = var5;
            param2.field_b = var5.field_b;
            param2.field_b.field_d = param2;
            param2.field_e = param1;
            param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "f.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final br a(int param0) {
        ((f) this).field_e = param0;
        return ((f) this).b(-119);
    }

    final static void a(java.applet.Applet param0, boolean param1, byte param2, String param3) {
        try {
            int var4_int = 0;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
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
                L1: {
                  if (!go.field_l.startsWith("win")) {
                    break L1;
                  } else {
                    if (!va.a(9805, param3)) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                {
                  L2: {
                    param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    var4_int = 3 / ((param2 - 39) / 61);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref;
                stackOut_7_1 = new StringBuilder().append("f.A(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param3 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    f(int param0) {
        int var2 = 0;
        br var3 = null;
        ((f) this).field_e = 0;
        ((f) this).field_g = param0;
        ((f) this).field_d = new br[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            br dupTemp$2 = new br();
            var3 = dupTemp$2;
            ((f) this).field_d[var2] = dupTemp$2;
            var3.field_d = var3;
            var3.field_b = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = 0;
    }
}
