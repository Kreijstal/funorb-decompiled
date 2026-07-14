/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    private boolean field_d;
    static ja field_e;
    static long field_f;
    private int[] field_g;
    private int field_a;
    static String field_c;
    static ea field_b;
    private int field_h;
    static boolean field_i;

    public static void a(int param0) {
        int var1 = 12 / ((param0 - 26) / 63);
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0, int param1) {
        if ((param0 ^ -1) <= -1) {
          if (((qh) this).field_a >= param0) {
            if (((qh) this).field_a == param0) {
              ((qh) this).field_a = ((qh) this).field_a - 1;
              if (param1 != -12759) {
                ((qh) this).a(-123, 110);
                return;
              } else {
                return;
              }
            } else {
              pd.a(((qh) this).field_g, 1 + param0, ((qh) this).field_g, param0, -param0 + ((qh) this).field_a);
              ((qh) this).field_a = ((qh) this).field_a - 1;
              if (param1 != -12759) {
                ((qh) this).a(-123, 110);
                return;
              } else {
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final static hg a(kk param0, int param1, kk param2, int param3, int param4) {
        Object var6 = null;
        if (param4 == -11948) {
          if (!sk.a(param3, param2, param4 + 11949, param1)) {
            return null;
          } else {
            return ra.a(param4 + 11446, param0.a(param1, param3, (byte) -67));
          }
        } else {
          var6 = null;
          hg discarded$6 = qh.a((kk) null, -65, (kk) null, -113, 27);
          if (!sk.a(param3, param2, param4 + 11949, param1)) {
            return null;
          } else {
            return ra.a(param4 + 11446, param0.a(param1, param3, (byte) -67));
          }
        }
    }

    final void a(byte param0, int param1) {
        this.a(((qh) this).field_a - -1, true, param1);
        int var3 = 39 / ((54 - param0) / 57);
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        if (((qh) this).field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = -41 / ((param0 - 1) / 55);
          return ((qh) this).field_g[param1];
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param0 <= ((qh) this).field_a) {
          if (((qh) this).field_g.length > param0) {
            ((qh) this).field_g[param0] = param2;
            if (!param1) {
              int discarded$8 = ((qh) this).b(-86);
              return;
            } else {
              return;
            }
          } else {
            this.b((byte) 123, param0);
            ((qh) this).field_g[param0] = param2;
            if (!param1) {
              int discarded$9 = ((qh) this).b(-86);
              return;
            } else {
              return;
            }
          }
        } else {
          ((qh) this).field_a = param0;
          if (((qh) this).field_g.length <= param0) {
            this.b((byte) 123, param0);
            ((qh) this).field_g[param0] = param2;
            if (param1) {
              return;
            } else {
              int discarded$10 = ((qh) this).b(-86);
              return;
            }
          } else {
            ((qh) this).field_g[param0] = param2;
            if (!param1) {
              int discarded$11 = ((qh) this).b(-86);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var5 = new int[this.b(param1, 20029)];
        int[] var3 = var5;
        pd.a(((qh) this).field_g, 0, var5, 0, ((qh) this).field_g.length);
        int var4 = 87 / ((param0 - 58) / 62);
        ((qh) this).field_g = var5;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 != 20029) {
          field_c = null;
          var3 = ((qh) this).field_g.length;
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!((qh) this).field_d) {
                var3 = var3 + ((qh) this).field_h;
                continue L0;
              } else {
                if (var3 != 0) {
                  var3 = var3 * ((qh) this).field_h;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = ((qh) this).field_g.length;
          L1: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!((qh) this).field_d) {
                var3 = var3 + ((qh) this).field_h;
                continue L1;
              } else {
                if (var3 != 0) {
                  var3 = var3 * ((qh) this).field_h;
                  continue L1;
                } else {
                  var3 = 1;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            field_e = null;
            return ((qh) this).field_a - -1;
        }
        return ((qh) this).field_a - -1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(of.a(param1, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your email address again to make sure it's correct";
        field_e = new ja();
    }
}
