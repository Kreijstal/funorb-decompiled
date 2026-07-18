/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private int field_c;
    static int[] field_h;
    private int field_f;
    private int[] field_i;
    private int field_l;
    private boolean field_j;
    static String field_k;
    private boolean field_d;
    static vna field_b;
    static int[] field_g;
    private boolean field_a;
    static int[] field_e;

    final static int a(int param0) {
        if (param0 >= -41) {
            field_h = null;
        }
        return hg.field_f;
    }

    private mg(int param0, int param1) {
        this(new int[2], param1);
        ((mg) this).field_c = param1;
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param1.a((byte) 86, ((mg) this).field_i.length, 4);
            for (var3_int = 0; ((mg) this).field_i.length > var3_int; var3_int++) {
                param1.a((byte) -25, ((mg) this).field_i[var3_int], 12);
            }
            if (param0 != 15637) {
                Object var5 = null;
                ((mg) this).a(-109, (kh) null);
            }
            param1.a((byte) -36, ((mg) this).field_c, 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            field_e = null;
        }
        return ((mg) this).field_a;
    }

    mg(int[] param0) {
        this(param0, 0);
    }

    public static void e(int param0) {
        field_h = null;
        field_k = null;
        field_b = null;
        field_g = null;
        if (param0 != 9980) {
            return;
        }
        field_e = null;
    }

    public mg() {
        this(50);
    }

    final void d(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        ((mg) this).field_a = false;
        if (param0 != 0) {
            int discarded$0 = mg.a(-118);
        }
        if (!(!((mg) this).field_d)) {
            ((mg) this).field_d = false;
            ((mg) this).field_a = true;
        }
        if (!(!((mg) this).field_j)) {
            if (((mg) this).field_f == -1) {
                ((mg) this).field_a = true;
                ((mg) this).field_f = 0;
                return;
            }
            ((mg) this).field_a = false;
            return;
        }
        if (-1 == ((mg) this).field_f) {
            ((mg) this).field_f = ((mg) this).field_i[0];
        }
        ((mg) this).field_f = ((mg) this).field_f - 1;
        if (((mg) this).field_f > 0) {
            return;
        }
        do {
            ((mg) this).field_l = ((mg) this).field_l + 1;
            if (!(((mg) this).field_i.length > ((mg) this).field_l)) {
                ((mg) this).field_l = 0;
            }
            ((mg) this).field_f = ((mg) this).field_i[((mg) this).field_l];
            ((mg) this).field_a = !((mg) this).field_a ? true : false;
        } while (((mg) this).field_f == 0);
    }

    final int a(byte param0) {
        if (null == ((mg) this).field_i) {
            return 0;
        }
        if (param0 != -94) {
            int discarded$0 = mg.a(44);
        }
        return jna.a(param0 + 104, ((mg) this).field_i);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((mg) this).field_j) {
          return;
        } else {
          L0: {
            ((mg) this).field_c = param1;
            if (!param0) {
              break L0;
            } else {
              ((mg) this).field_l = 38;
              break L0;
            }
          }
          L1: {
            if (param1 > 0) {
              param1 = param1 % jna.a(10, ((mg) this).field_i);
              var3 = 0;
              L2: while (true) {
                if (param1 <= 0) {
                  L3: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var3 == 0) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L3;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                  ((mg) this).field_d = stackIn_17_1 != 0;
                  break L1;
                } else {
                  ((mg) this).d(0);
                  param1--;
                  if (!((mg) this).field_a) {
                    continue L2;
                  } else {
                    L4: {
                      if (var3 != 0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L4;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L4;
                      }
                    }
                    var3 = stackIn_13_0;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          if (null == ((mg) this).field_i) {
            return 0;
          } else {
            if (0 < ((mg) this).field_i.length) {
              return ((mg) this).field_i[((mg) this).field_l];
            } else {
              return 0;
            }
          }
        } else {
          return 7;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        return (param2 & 34) != 0;
    }

    final int b(int param0) {
        if (param0 != 12) {
            mg.e(6);
        }
        return ((mg) this).field_f;
    }

    private mg(int[] param0, int param1) {
        ((mg) this).field_f = -1;
        try {
            ((mg) this).field_c = param1;
            ((mg) this).field_i = param0;
            ((mg) this).field_j = 0 == ((mg) this).a((byte) -94) ? true : false;
            ((mg) this).a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mg(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        ((mg) this).field_f = -1;
        try {
            var3_int = param1.b((byte) 44, 4);
            ((mg) this).field_i = new int[var3_int];
            if (param0 <= 9) {
                for (var4 = 0; var3_int > var4; var4++) {
                    ((mg) this).field_i[var4] = param1.b((byte) 44, 8);
                }
                ((mg) this).field_c = param1.b((byte) 44, 8);
            } else {
                for (var4 = 0; var4 < var3_int; var4++) {
                    ((mg) this).field_i[var4] = param1.b((byte) 44, 12);
                }
                ((mg) this).field_c = param1.b((byte) 44, 12);
            }
            ((mg) this).a(false, ((mg) this).field_c);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mg(int param0) {
        this(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[1];
        field_k = "Room: <%0>/<%1>";
        field_g = new int[2];
        field_b = new vna();
        field_e = new int[8192];
    }
}
