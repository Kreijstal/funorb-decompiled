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
        kk var4 = (kk) (Object) ((fg) this).field_g.a(-28010, param0);
        this.a(param1, var4);
    }

    fg(int param0) {
        this(param0, param0);
    }

    final void a(int param0, Object param1, long param2) {
        this.a(0, 1, param1, param2);
        int var5 = 99 % ((-17 - param0) / 62);
    }

    private final void a(int param0, kk param1) {
        L0: {
          if (param1 != null) {
            param1.a((byte) -117);
            param1.a(false);
            ((fg) this).field_b = ((fg) this).field_b + param1.field_y;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          Object discarded$2 = ((fg) this).a(-28L, false);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, Object param2, long param3) {
        fd var6 = null;
        kk var6_ref = null;
        int var7 = 0;
        var7 = Pool.field_O;
        if (param1 > ((fg) this).field_a) {
          throw new IllegalStateException();
        } else {
          this.a(param3, param0);
          ((fg) this).field_b = ((fg) this).field_b - param1;
          L0: while (true) {
            if (((fg) this).field_b >= 0) {
              var6 = new fd(param2, param1);
              ((fg) this).field_g.a((ma) (Object) var6, true, param3);
              ((fg) this).field_h.a((byte) -62, (rg) (Object) var6);
              ((kk) (Object) var6).field_m = 0L;
              return;
            } else {
              var6_ref = (kk) (Object) ((fg) this).field_h.a(-97);
              this.a(0, var6_ref);
              continue L0;
            }
          }
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
          var10 = (kk) (Object) ((fg) this).field_g.a(-28010, param0);
          if (var10 != null) {
            var11 = var10.c((byte) 121);
            if (var11 != null) {
              if (var10.e(-74)) {
                L0: {
                  var6 = new fd(var11, var10.field_y);
                  ((fg) this).field_g.a((ma) (Object) var6, param1, var10.field_c);
                  ((fg) this).field_h.a((byte) -36, (rg) (Object) var6);
                  ((kk) (Object) var6).field_m = 0L;
                  var10.a((byte) -117);
                  stackOut_18_0 = (kk) var10;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (param1) {
                    stackOut_20_0 = (kk) (Object) stackIn_20_0;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L0;
                  } else {
                    stackOut_19_0 = (kk) (Object) stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L0;
                  }
                }
                ((kk) (Object) stackIn_21_0).a(stackIn_21_1 != 0);
                return var11;
              } else {
                ((fg) this).field_h.a((byte) -36, (rg) (Object) var10);
                var10.field_m = 0L;
                return var11;
              }
            } else {
              var10.a((byte) -117);
              var10.a(false);
              ((fg) this).field_b = ((fg) this).field_b + var10.field_y;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_f = null;
          var8 = (kk) (Object) ((fg) this).field_g.a(-28010, param0);
          var7 = var8;
          if (var8 != null) {
            var9 = var8.c((byte) 121);
            var5 = var9;
            if (var9 != null) {
              if (var8.e(-74)) {
                L1: {
                  var6 = new fd(var9, var8.field_y);
                  ((fg) this).field_g.a((ma) (Object) var6, param1, var8.field_c);
                  ((fg) this).field_h.a((byte) -36, (rg) (Object) var6);
                  ((kk) (Object) var6).field_m = 0L;
                  var8.a((byte) -117);
                  stackOut_7_0 = (kk) var8;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param1) {
                    stackOut_9_0 = (kk) (Object) stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = (kk) (Object) stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((kk) (Object) stackIn_10_0).a(stackIn_10_1 != 0);
                return var9;
              } else {
                ((fg) this).field_h.a((byte) -36, (rg) (Object) var8);
                var8.field_m = 0L;
                return var9;
              }
            } else {
              var8.a((byte) -117);
              var8.a(false);
              ((fg) this).field_b = ((fg) this).field_b + var8.field_y;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            ar.field_g = param2;
            try {
                if (param1 > -103) {
                    field_c = null;
                }
                var6 = param0.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (-1 == (param2.length() ^ -1)) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + hn.a(rl.a((byte) -120) - -94608000000L, false) + "; Max-Age=" + 94608000L;
                }
                mo.a("document.cookie=\"" + var5 + "\"", param0, (byte) 35);
            } catch (Throwable throwable) {
            }
            uk.a(558370049, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private fg(int param0, int param1) {
        int var3 = 0;
        ((fg) this).field_h = new qi();
        ((fg) this).field_a = param0;
        ((fg) this).field_b = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((fg) this).field_g = new uk(var3);
              return;
            }
          } else {
            ((fg) this).field_g = new uk(var3);
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 0) {
          field_d = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Continue";
        field_e = "Chat is currently disabled.";
    }
}
