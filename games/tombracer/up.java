/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up implements noa {
    static jea field_a;
    int field_j;
    private int field_f;
    gma field_g;
    static jpa[] field_e;
    private int field_k;
    static String[][] field_h;
    int field_b;
    private static String[] field_i;
    gma field_c;
    static String[] field_d;

    final void a(gma param0, int param1) {
        ((up) this).field_g = param0;
        if (param1 != 2348) {
            return;
        }
        try {
            ((up) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "up.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (param0 == 32) {
            return true;
        }
        if (40 == param0) {
            return true;
        }
        if (41 == param0) {
            return true;
        }
        return false;
    }

    final int e(int param0) {
        if (param0 > -78) {
            ((up) this).field_j = 23;
            return ((up) this).field_k;
        }
        return ((up) this).field_k;
    }

    final int b(int param0) {
        if (param0 != -344) {
            this.a(9);
            return ((up) this).field_f;
        }
        return ((up) this).field_f;
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_i = null;
        field_e = null;
        field_d = null;
    }

    final void a(kh param0, byte param1) {
        try {
            param0.a((byte) -125, ((up) this).field_f, 4);
            if (param1 != 125) {
                ((up) this).field_f = 36;
            }
            param0.a((byte) 116, ((up) this).field_b, 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "up.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0) {
        ((up) this).field_j = this.a(true);
        if (param0 > -37) {
            ((up) this).b(-40, 82);
        }
    }

    final void a(int param0, int param1) {
        ((up) this).field_f = param1;
        this.a(-80);
        if (param0 != 29525) {
            field_i = null;
        }
    }

    final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = 77 % ((-68 - param0) / 55);
        var3 = ((up) this).field_f;
        if (0 != var3) {
          if (var3 != 2) {
            if (1 != var3) {
              if (var3 != 5) {
                return 0;
              } else {
                return 2;
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          return 2;
        }
    }

    private final int a(boolean param0) {
        int var2 = 0;
        var2 = ((up) this).field_f;
        if (var2 != 0) {
          if (var2 != 2) {
            if (var2 != 1) {
              if (var2 != 3) {
                if (4 != var2) {
                  if (5 != var2) {
                    if (6 != var2) {
                      throw new IllegalStateException("Unknown effect preset: " + ((up) this).field_f);
                    } else {
                      return 2;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  return 1;
                }
              } else {
                return 4;
              }
            } else {
              return 3;
            }
          } else {
            return 3;
          }
        } else {
          return 0;
        }
    }

    final boolean d(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 6734) {
          if (((up) this).field_j != 1) {
            if (((up) this).field_j == 2) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((up) this).b(94, -61);
          if (((up) this).field_j == 1) {
            return true;
          } else {
            L0: {
              if (((up) this).field_j != 2) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    up(int param0, int param1) {
        this((gma) null, param0, param1);
    }

    final void b(int param0, int param1) {
        ((up) this).field_k = param1;
        if (param0 != 1) {
            field_e = null;
        }
    }

    up(gma param0, up param1) {
        this(param0, param1.field_f, param1.field_b);
        try {
            ((up) this).field_k = param1.field_k;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "up.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    up(gma param0, int param1, int param2) {
        try {
            ((up) this).field_f = param1;
            ((up) this).field_b = param2;
            ((up) this).a(param0, 2348);
            this.a(-70);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "up.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final String toString() {
        return "Effect: preset " + ((up) this).field_f + ", size " + ((up) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[1];
        field_i[0] = "Normal";
        field_h = new String[11][];
        field_d = new String[]{"<%0> took a nice hot bath", "<%0> took a dip", "<%0> felt the heat", "<%0> needs to cool off", "<%0> melted", "<%0> found that lava was bad to touch"};
    }
}
