/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vh field_f;
    private rg field_d;
    private rg field_g;
    static int field_i;
    static int[] field_e;
    private int field_a;
    private rg[] field_c;
    private int field_h;
    static vh field_k;
    private long field_b;
    static String field_j;

    final rg a(int param0) {
        rg var2 = null;
        rg var3 = null;
        if (param0 < -52) {
          if (((tk) this).field_d != null) {
            var2 = ((tk) this).field_c[(int)(((tk) this).field_b & (long)(((tk) this).field_a - 1))];
            L0: while (true) {
              if (((tk) this).field_d != var2) {
                if (~((tk) this).field_d.field_m == ~((tk) this).field_b) {
                  var3 = ((tk) this).field_d;
                  ((tk) this).field_d = ((tk) this).field_d.field_q;
                  return var3;
                } else {
                  ((tk) this).field_d = ((tk) this).field_d.field_q;
                  continue L0;
                }
              } else {
                ((tk) this).field_d = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          ((tk) this).field_c = null;
          if (((tk) this).field_d != null) {
            var2 = ((tk) this).field_c[(int)(((tk) this).field_b & (long)(((tk) this).field_a - 1))];
            L1: while (true) {
              if (((tk) this).field_d != var2) {
                if (~((tk) this).field_d.field_m == ~((tk) this).field_b) {
                  var3 = ((tk) this).field_d;
                  ((tk) this).field_d = ((tk) this).field_d.field_q;
                  return var3;
                } else {
                  ((tk) this).field_d = ((tk) this).field_d.field_q;
                  continue L1;
                }
              } else {
                ((tk) this).field_d = null;
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    final rg b(int param0) {
        rg var3 = null;
        rg var4 = null;
        rg var7 = null;
        if (0 < ((tk) this).field_h) {
          if (((tk) this).field_g == ((tk) this).field_c[((tk) this).field_h + -1]) {
            L0: while (true) {
              if (((tk) this).field_a <= ((tk) this).field_h) {
                if (param0 >= 25) {
                  return null;
                } else {
                  ((tk) this).field_h = -10;
                  return null;
                }
              } else {
                int fieldTemp$2 = ((tk) this).field_h;
                ((tk) this).field_h = ((tk) this).field_h + 1;
                var4 = ((tk) this).field_c[fieldTemp$2].field_q;
                if (((tk) this).field_c[-1 + ((tk) this).field_h] != var4) {
                  ((tk) this).field_g = var4.field_q;
                  return var4;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            var7 = ((tk) this).field_g;
            ((tk) this).field_g = var7.field_q;
            return var7;
          }
        } else {
          L1: while (true) {
            if (((tk) this).field_a <= ((tk) this).field_h) {
              if (param0 >= 25) {
                return null;
              } else {
                ((tk) this).field_h = -10;
                return null;
              }
            } else {
              int fieldTemp$3 = ((tk) this).field_h;
              ((tk) this).field_h = ((tk) this).field_h + 1;
              var3 = ((tk) this).field_c[fieldTemp$3].field_q;
              if (((tk) this).field_c[-1 + ((tk) this).field_h] != var3) {
                ((tk) this).field_g = var3.field_q;
                return var3;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final rg a(byte param0) {
        ((tk) this).field_h = 0;
        if (param0 > -124) {
            ((tk) this).field_d = null;
            return ((tk) this).b(103);
        }
        return ((tk) this).b(103);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              if (param0 == -1) {
                try {
                  L0: {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(p.a((byte) 59, var2, param1), "_top");
                    break L0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("tk.C(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_k = null;
        field_f = null;
        int var1 = -92;
        field_j = null;
        field_e = null;
    }

    final void a(int param0, long param1, rg param2) {
        rg var5 = null;
        try {
            if (param2.field_n != null) {
                param2.a(false);
            }
            if (param0 != -6946) {
                Object var6 = null;
                tk.a(-18, (java.applet.Applet) null);
            }
            var5 = ((tk) this).field_c[(int)(param1 & (long)(((tk) this).field_a - 1))];
            param2.field_n = var5.field_n;
            param2.field_q = var5;
            param2.field_n.field_q = param2;
            param2.field_m = param1;
            param2.field_q.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "tk.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    tk(int param0) {
        int var2 = 0;
        rg var3 = null;
        ((tk) this).field_h = 0;
        ((tk) this).field_c = new rg[param0];
        ((tk) this).field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
            rg dupTemp$0 = new rg();
            var3 = dupTemp$0;
            ((tk) this).field_c[var2] = dupTemp$0;
            var3.field_n = var3;
            var3.field_q = var3;
        }
    }

    final rg a(long param0, boolean param1) {
        rg var4 = null;
        rg var5 = null;
        rg var6 = null;
        rg var7 = null;
        ((tk) this).field_b = param0;
        if (!param1) {
          var6 = ((tk) this).field_c[(int)((long)(-1 + ((tk) this).field_a) & param0)];
          var4 = var6;
          ((tk) this).field_d = var6.field_q;
          L0: while (true) {
            if (var4 != ((tk) this).field_d) {
              if (~param0 == ~((tk) this).field_d.field_m) {
                var5 = ((tk) this).field_d;
                ((tk) this).field_d = ((tk) this).field_d.field_q;
                return var5;
              } else {
                ((tk) this).field_d = ((tk) this).field_d.field_q;
                continue L0;
              }
            } else {
              ((tk) this).field_d = null;
              return null;
            }
          }
        } else {
          rg discarded$1 = ((tk) this).a((byte) -118);
          var7 = ((tk) this).field_c[(int)((long)(-1 + ((tk) this).field_a) & param0)];
          var4 = var7;
          ((tk) this).field_d = var7.field_q;
          L1: while (true) {
            if (var4 != ((tk) this).field_d) {
              if (~param0 == ~((tk) this).field_d.field_m) {
                var5 = ((tk) this).field_d;
                ((tk) this).field_d = ((tk) this).field_d.field_q;
                return var5;
              } else {
                ((tk) this).field_d = ((tk) this).field_d.field_q;
                continue L1;
              }
            } else {
              ((tk) this).field_d = null;
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Creating your account";
    }
}
