/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends l {
    static oi field_h;
    int field_f;
    pb field_e;
    int field_g;
    int field_j;
    static String field_i;

    public static void a(boolean param0) {
        field_i = null;
        field_h = null;
        if (!param0) {
            Object var2 = null;
            ta.a((java.applet.Applet) null, -18);
        }
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 1;
        var4 = 1;
        if (param0 <= -91) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= ma.field_n.length) {
              if (var2 == 0) {
                return 0;
              } else {
                ((ta) this).field_e.a((byte) -89);
                ((ta) this).field_f = ((ta) this).field_f + 1;
                ((ta) this).field_e.a(false, (ta) this, var3 != 0);
                return var2;
              }
            } else {
              var6 = ((ta) this).field_e.a(1843275042, var5);
              if (var6 > ((ta) this).field_f) {
                if (33 <= ((ta) this).field_g) {
                  return ((ta) this).c(-1);
                } else {
                  L1: {
                    ((ta) this).field_e.a(var5, 23041505, (ta) this);
                    if (-1 + var6 > ((ta) this).field_f) {
                      var4 = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var2 = ((ta) this).field_e.a((byte) -80, var4 != 0);
                  if (var4 == 0) {
                    var3 = 0;
                    var5++;
                    continue L0;
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -33;
        }
    }

    final l b(byte param0) {
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (param0 == -90) {
          var2_int = 0;
          L0: while (true) {
            if (ma.field_n.length <= var2_int) {
              L1: {
                var2 = (Object) (Object) this.e((byte) -102);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ((ta) this).b(false);
                  break L1;
                }
              }
              return (l) var2;
            } else {
              var3 = ((ta) this).field_e.a(param0 ^ -1843275132, var2_int) - ((ta) this).field_f;
              if (var3 > 0) {
                ((ta) this).field_e.a(true, var2_int, var3, ((ta) this).field_f);
                var2_int++;
                continue L0;
              } else {
                var2_int++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    abstract l b(boolean param0);

    abstract int c(int param0);

    private final ta e(byte param0) {
        ((ta) this).field_f = 0;
        ((ta) this).field_e = ((ta) this).field_e.b((byte) -128);
        if (((ta) this).field_e == null) {
            return null;
        }
        int var2 = -104 % ((param0 - 21) / 36);
        ((ta) this).field_e.a((byte) 19, (ta) this);
        return (ta) this;
    }

    final ta d(byte param0) {
        if (param0 > -119) {
            ((ta) this).field_j = -76;
        }
        return -1 > (this.b(-126) ^ -1) ? this : this.e((byte) -56).d((byte) -123);
    }

    final l a(int param0) {
        int var2 = this.b(-115);
        if (!(var2 <= 0)) {
            return new o(var2, (l) this).a(param0 ^ 0);
        }
        if (param0 != -2) {
            ((ta) this).field_e = null;
        }
        Object var3 = (Object) (Object) this.e((byte) -40);
        if (var3 == null) {
            var3 = (Object) (Object) ((ta) this).b(false);
        }
        return ((l) var3).a(-2);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 != 19) {
                    ta.a(true);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ta(pb param0) {
        ((ta) this).field_f = 0;
        ((ta) this).field_g = 19;
        ((ta) this).field_j = 0;
        ((ta) this).field_e = param0;
        param0.a((byte) 19, (ta) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new oi();
    }
}
