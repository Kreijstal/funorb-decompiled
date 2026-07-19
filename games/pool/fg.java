/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    private uk field_g;
    static di field_d;
    private int field_b;
    static String[][] field_f;
    static String field_c;
    private qi field_h;
    private int field_a;
    static String field_e;

    private final void a(long param0, int param1) {
        kk var4 = (kk) ((Object) this.field_g.a(-28010, param0));
        this.a(param1, var4);
    }

    fg(int param0) {
        this(param0, param0);
    }

    final void a(int param0, Object param1, long param2) {
        try {
            this.a(0, 1, param1, param2);
            int var5_int = 99 % ((-17 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, kk param1) {
        Object discarded$2 = null;
        RuntimeException var3 = null;
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
              if (param1 != null) {
                param1.a((byte) -117);
                param1.a(false);
                this.field_b = this.field_b + param1.field_y;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 0) {
              break L0;
            } else {
              discarded$2 = this.a(-28L, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("fg.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, int param1, Object param2, long param3) {
        kk var6 = null;
        fd var6_ref = null;
        int var7 = Pool.field_O;
        try {
            if (param1 > this.field_a) {
                throw new IllegalStateException();
            }
            this.a(param3, param0);
            this.field_b = this.field_b - param1;
            while (this.field_b < 0) {
                var6 = (kk) ((Object) this.field_h.a(-97));
                this.a(0, var6);
            }
            var6_ref = new fd(param2, param1);
            this.field_g.a(var6_ref, true, param3);
            this.field_h.a((byte) -62, var6_ref);
            ((kk) ((Object) var6_ref)).field_m = 0L;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object a(long param0, boolean param1) {
        Object var5 = null;
        fd var6 = null;
        kk var7 = null;
        kk var8 = null;
        Object var9 = null;
        kk var10 = null;
        Object var11 = null;
        kk stackIn_8_0 = null;
        kk stackIn_9_0 = null;
        kk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kk stackIn_19_0 = null;
        kk stackIn_20_0 = null;
        kk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        kk stackOut_18_0 = null;
        kk stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        kk stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        kk stackOut_7_0 = null;
        kk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (param1) {
          var10 = (kk) ((Object) this.field_g.a(-28010, param0));
          if (var10 != null) {
            var11 = var10.c((byte) 121);
            if (var11 != null) {
              if (var10.e(-74)) {
                L0: {
                  var6 = new fd(var11, var10.field_y);
                  this.field_g.a(var6, param1, var10.field_c);
                  this.field_h.a((byte) -36, var6);
                  ((kk) ((Object) var6)).field_m = 0L;
                  var10.a((byte) -117);
                  stackOut_18_0 = (kk) (var10);
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (param1) {
                    stackOut_20_0 = (kk) ((Object) stackIn_20_0);
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L0;
                  } else {
                    stackOut_19_0 = (kk) ((Object) stackIn_19_0);
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L0;
                  }
                }
                ((kk) (Object) stackIn_21_0).a(stackIn_21_1 != 0);
                return var11;
              } else {
                this.field_h.a((byte) -36, var10);
                var10.field_m = 0L;
                return var11;
              }
            } else {
              var10.a((byte) -117);
              var10.a(false);
              this.field_b = this.field_b + var10.field_y;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_f = (String[][]) null;
          var8 = (kk) ((Object) this.field_g.a(-28010, param0));
          var7 = var8;
          if (var8 != null) {
            var9 = var8.c((byte) 121);
            var5 = var9;
            if (var9 != null) {
              if (var8.e(-74)) {
                L1: {
                  var6 = new fd(var9, var8.field_y);
                  this.field_g.a(var6, param1, var8.field_c);
                  this.field_h.a((byte) -36, var6);
                  ((kk) ((Object) var6)).field_m = 0L;
                  var8.a((byte) -117);
                  stackOut_7_0 = (kk) (var8);
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param1) {
                    stackOut_9_0 = (kk) ((Object) stackIn_9_0);
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = (kk) ((Object) stackIn_8_0);
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((kk) (Object) stackIn_10_0).a(stackIn_10_1 != 0);
                return var9;
              } else {
                this.field_h.a((byte) -36, var8);
                var8.field_m = 0L;
                return var9;
              }
            } else {
              var8.a((byte) -117);
              var8.a(false);
              this.field_b = this.field_b + var8.field_y;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                ar.field_g = param2;
                try {
                  L1: {
                    L2: {
                      if (param1 <= -103) {
                        break L2;
                      } else {
                        field_c = (String) null;
                        break L2;
                      }
                    }
                    L3: {
                      var6 = param0.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      var4 = param0.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (-1 != (param2.length() ^ -1)) {
                        var5 = var7 + "; Expires=" + hn.a(rl.a((byte) -120) - -94608000000L, false) + "; Max-Age=" + 94608000L;
                        break L3;
                      } else {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    mo.a("document.cookie=\"" + var5 + "\"", param0, (byte) 35);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                uk.a(558370049, param0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var3_ref);
                stackOut_11_1 = new StringBuilder().append("fg.B(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private fg(int param0, int param1) {
        int var3 = 0;
        this.field_h = new qi();
        this.field_a = param0;
        this.field_b = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              this.field_g = new uk(var3);
              return;
            }
          } else {
            this.field_g = new uk(var3);
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 0) {
          field_d = (di) null;
          field_d = null;
          field_f = (String[][]) null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_f = (String[][]) null;
          field_c = null;
          return;
        }
    }

    static {
        field_c = "Continue";
        field_e = "Chat is currently disabled.";
    }
}
