/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu {
    private int field_i;
    private boolean field_e;
    static boolean field_c;
    private int field_g;
    static String field_a;
    static String field_f;
    private int[] field_d;
    static tv[] field_b;
    static int field_h;

    final int a(int param0, byte param1) {
        if (!(((fu) this).field_g >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        int var3 = 82 / ((35 - param1) / 62);
        return ((fu) this).field_d[param0];
    }

    private final void a(boolean param0, int param1, int param2) {
        if (((fu) this).field_g < param2) {
            ((fu) this).field_g = param2;
        }
        if (!(param2 < ((fu) this).field_d.length)) {
            this.a(param2, true);
        }
        ((fu) this).field_d[param2] = param1;
    }

    private final int b(int param0) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var3 = ((fu) this).field_d.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (!((fu) this).field_e) {
              var3 = var3 + ((fu) this).field_i;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((fu) this).field_i;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int discarded$0 = 20151;
        int[] var4 = new int[this.b(param0)];
        int[] var3 = var4;
        dv.a(((fu) this).field_d, 0, var4, 0, ((fu) this).field_d.length);
        ((fu) this).field_d = var4;
    }

    final static ki a(int param0, byte param1, int param2) {
        int var3 = 0;
        return new ki(7, param0, param2, (byte) 0, (byte) 0);
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        oi var8 = null;
        int var9 = 0;
        int var10 = 0;
        tf var11 = null;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var11 = new tf();
              var11.a((gn) (Object) new oi(0), 3);
              if (0 == param1) {
                var11.a((gn) (Object) new oi(2), 3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != 1) {
                break L2;
              } else {
                var11.a((gn) (Object) new oi(3), 3);
                break L2;
              }
            }
            L3: {
              if (2 != param1) {
                break L3;
              } else {
                var11.a((gn) (Object) new oi(4), 3);
                break L3;
              }
            }
            L4: {
              L5: {
                if (param2 == 1) {
                  break L5;
                } else {
                  if (param2 != 2) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11.a((gn) (Object) new oi(1), 3);
              break L4;
            }
            L6: {
              if (param2 != 2) {
                break L6;
              } else {
                var11.a((gn) (Object) new oi(5), 3);
                break L6;
              }
            }
            L7: {
              if (param2 != 3) {
                break L7;
              } else {
                var11.a((gn) (Object) new oi(6), 3);
                break L7;
              }
            }
            var4 = 100.0 / (double)var11.a(false);
            var6 = 0.0;
            var8 = (oi) (Object) var11.g(24009);
            L8: while (true) {
              if (var8 == null) {
                stackOut_22_0 = -1;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                var9 = fv.a(var8.field_j, (byte) 19);
                if (var9 == -1) {
                  var6 = var6 + var4;
                  var8 = (oi) (Object) var11.c(33);
                  continue L8;
                } else {
                  var6 = var6 + (double)var9 * var4 / 100.0;
                  stackOut_19_0 = (int)var6;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "fu.H(" + 5464 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0;
    }

    final int a(int param0) {
        if (param0 != 1) {
            return -66;
        }
        return ((fu) this).field_g + 1;
    }

    final void a(int param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (((fu) this).field_g < param1) {
              break L0;
            } else {
              if (param0 == -1) {
                L1: {
                  if (param1 != ((fu) this).field_g) {
                    dv.a(((fu) this).field_d, param1 - -1, ((fu) this).field_d, param1, ((fu) this).field_g - param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((fu) this).field_g = ((fu) this).field_g - 1;
                return;
              } else {
                return;
              }
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final void c(int param0, int param1) {
        if (param1 < 101) {
            return;
        }
        this.a(true, param0, 1 + ((fu) this).field_g);
    }

    private fu() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "view all <%0> teams";
        field_h = 0;
    }
}
