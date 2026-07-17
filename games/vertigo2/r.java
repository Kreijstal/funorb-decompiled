/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static u[] field_k;
    int field_d;
    private Object[][] field_i;
    private Object[] field_e;
    private ab field_a;
    static int field_j;
    static long field_h;
    static int field_f;
    static int[] field_c;
    private ff field_g;
    boolean field_b;

    private final synchronized void d(int param0, byte param1) {
        if (param1 <= 99) {
            ((r) this).field_d = -46;
        }
        if (!((r) this).field_b) {
            ((r) this).field_e[param0] = oh.a(false, true, ((r) this).field_a.a(true, param0));
        } else {
            ((r) this).field_e[param0] = (Object) (Object) ((r) this).field_a.a(true, param0);
        }
    }

    final int c(int param0) {
        if (!(((r) this).b(param0 ^ param0))) {
            return -1;
        }
        return ((r) this).field_g.field_r.length;
    }

    final boolean a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
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
            if (((r) this).b(0)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((r) this).field_g.field_k.a(og.a(var6, (byte) -116), 1);
              if (!this.c(var4_int, (byte) -81)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                L1: {
                  if (!param2) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((r) this).a(((byte[]) ((Object[]) ((r) this).field_e[0])[0])[5]);
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param0;
                var5 = ((r) this).field_g.field_t[var4_int].a(og.a(var7, (byte) -121), 1);
                stackOut_9_0 = ((r) this).b(0, var4_int, var5);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("r.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!((r) this).b(0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 >= 110) {
                  break L1;
                } else {
                  int discarded$2 = ((r) this).b(49, (byte) 11);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((r) this).field_g.field_k.a(og.a(var4, (byte) -121), 1);
              if (this.c(var3_int, (byte) -75)) {
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("r.F(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param2 != -20729) {
            this.d(((int[]) ((r) this).field_e[0])[8], (byte) -39);
        }
        if (!((r) this).b(param2 + 20729)) {
            return false;
        }
        if (0 <= param0) {
            if (param1 >= 0) {
                if (((r) this).field_g.field_r.length > param0) {
                    if (param1 < ((r) this).field_g.field_r[param0]) {
                        return true;
                    }
                }
            }
        }
        if (!rq.field_y) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final synchronized byte[] a(boolean param0, int param1) {
        if (!((r) this).b(0)) {
            return null;
        }
        if (((r) this).field_g.field_r.length == 1) {
            return ((r) this).a(0, param1, (byte) -41);
        }
        if (!param0) {
            ((r) this).field_d = -20;
        }
        if (!this.c(param1, (byte) -117)) {
            return null;
        }
        if (!(((r) this).field_g.field_r[param1] != 1)) {
            return ((r) this).a(param1, 0, (byte) -72);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!((r) this).b(0)) {
            return false;
        }
        if (!(1 != ((r) this).field_g.field_r.length)) {
            return ((r) this).b(0, 0, param0);
        }
        if (!this.c(param0, (byte) -96)) {
            return false;
        }
        if (!(1 != ((r) this).field_g.field_r[param0])) {
            return ((r) this).b(0, param0, 0);
        }
        int var3 = 53 / ((-28 - param1) / 51);
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!(this.c(param0, (byte) -60))) {
            return 0;
        }
        if (((r) this).field_e[param0] != null) {
            return 100;
        }
        if (param1 != 100) {
            return 31;
        }
        return ((r) this).field_a.b(param0, 57);
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
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
            if (!((r) this).b(param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((r) this).field_g.field_k.a(og.a(var4, (byte) -119), 1);
              stackOut_4_0 = ((r) this).b(var3_int, 100);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("r.L(");
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
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 > -3) {
            boolean discarded$0 = this.a(7, 10, ((int[]) ((r) this).field_e[1])[6]);
        }
        return this.a(param0, param1, 97, (int[]) null);
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (((r) this).b(param0 ^ -112)) {
          var2 = 1;
          if (param0 == -112) {
            var3 = 0;
            L0: while (true) {
              if (var3 >= ((r) this).field_g.field_e.length) {
                return var2 != 0;
              } else {
                var4 = ((r) this).field_g.field_e[var3];
                if (((r) this).field_e[var4] == null) {
                  this.d(var4, (byte) 116);
                  if (((r) this).field_e[var4] == null) {
                    var2 = 0;
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return ((boolean[]) ((Object[]) ((r) this).field_e[0])[1])[0];
          }
        } else {
          return false;
        }
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!this.c(param1, (byte) -85)) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        int[] var3 = ((r) this).field_g.field_g[param1];
        if (!(var3 != null)) {
            var6 = new int[((r) this).field_g.field_h[param1]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((r) this).b(param2 + param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((r) this).field_g.field_k.a(og.a(var6, (byte) -94), param2 ^ 1);
              if (this.c(var4_int, (byte) -109)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((r) this).field_g.field_t[var4_int].a(og.a(var7, (byte) -122), 1);
                stackOut_6_0 = ((r) this).a(var4_int, var5, (byte) -125);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("r.H(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final int b(int param0, byte param1) {
        if (!(this.c(param0, (byte) -52))) {
            return 0;
        }
        if (param1 >= -27) {
            ((r) this).field_e = null;
        }
        return ((r) this).field_g.field_r[param0];
    }

    private final synchronized boolean b(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        ed var26 = null;
        byte[] var27 = null;
        ed var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ed var32 = null;
        int[] var34 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var45 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        byte[] var51 = null;
        Object var52 = null;
        byte[] var52_array = null;
        byte[] var53 = null;
        byte[] var54 = null;
        int[] var55 = null;
        byte[][] var56 = null;
        byte[] var57 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var22 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.c(param1, (byte) -114)) {
              if (((r) this).field_e[param1] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((r) this).field_g.field_h[param1];
                  var50 = ((r) this).field_g.field_g[param1];
                  var42 = var50;
                  var34 = var42;
                  var24 = var34;
                  var6 = var24;
                  if (null == ((r) this).field_i[param1]) {
                    ((r) this).field_i[param1] = new Object[((r) this).field_g.field_r[param1]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((r) this).field_i[param1];
                var8 = 1;
                var9 = param0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9;
                          break L4;
                        } else {
                          var10 = var50[var9];
                          break L4;
                        }
                      }
                      if (var7[var10] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param3[0] != -1) {
                              break L7;
                            } else {
                              if (-1 != param3[1]) {
                                break L7;
                              } else {
                                if (-1 != param3[2]) {
                                  break L7;
                                } else {
                                  if (-1 == param3[3]) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var51 = pc.a((byte) 6, true, ((r) this).field_e[param1]);
                          var26 = new ed(var51);
                          var26.a(param3, var26.field_p.length, 5, -123);
                          var52_array = var51;
                          break L5;
                        }
                      }
                      var52_array = pc.a((byte) 6, false, ((r) this).field_e[param1]);
                      break L5;
                    }
                    try {
                      L8: {
                        var53 = hm.a(-20595, var52_array);
                        var45 = var53;
                        var37 = var45;
                        var27 = var37;
                        var23 = var27;
                        var54 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_34_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_34_1 = new StringBuilder();
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (param3 == null) {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L9;
                        } else {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L9;
                        }
                      }
                      throw wn.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + " " + param1 + " " + param3.length + " " + w.a(param3.length, var52_array, -115) + " " + w.a(param3.length + -2, var52_array, 67) + " " + ((r) this).field_g.field_j[param1] + " " + ((r) this).field_g.field_o);
                    }
                    L10: {
                      if (((r) this).field_b) {
                        ((r) this).field_e[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (((r) this).field_d == 2) {
                          var11 = var53.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var5_int * var12;
                          var32 = new ed(var54);
                          var14 = 0;
                          var32.field_u = var11;
                          var15 = 0;
                          var16 = 0;
                          L12: while (true) {
                            if (var12 <= var16) {
                              if (var14 == 0) {
                                stackOut_86_0 = 1;
                                stackIn_87_0 = stackOut_86_0;
                                return stackIn_87_0 != 0;
                              } else {
                                var57 = new byte[var14];
                                var14 = 0;
                                var32.field_u = var11;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = (Object) (Object) var57;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var32.b(true);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L15;
                                          } else {
                                            var21 = var50[var20];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var21 != param2) {
                                            break L16;
                                          } else {
                                            qq.a(var54, var17, var57, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var32.b(true);
                                    if (var6 != null) {
                                      var19 = var50[var18];
                                      break L18;
                                    } else {
                                      var19 = var18;
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var19 != param2) {
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var53.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var29 = new ed(var54);
                          var55 = new int[var5_int];
                          var47 = var55;
                          var39 = var47;
                          var30 = var39;
                          var14_ref_int__ = var30;
                          var29.field_u = var11;
                          var15 = 0;
                          L20: while (true) {
                            if (var15 >= var12) {
                              var56 = new byte[var5_int][];
                              var48 = var56;
                              var40 = var48;
                              var31 = var40;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L21: while (true) {
                                if (var5_int <= var16) {
                                  var29.field_u = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var17 >= var5_int) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L24;
                                            } else {
                                              var18 = var50[var17];
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (((r) this).field_d != 0) {
                                              var7[var18] = (Object) (Object) var56[var17];
                                              break L25;
                                            } else {
                                              var7[var18] = oh.a(false, true, var56[var17]);
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L26: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L22;
                                        } else {
                                          var18 = var18 + var29.b(true);
                                          qq.a(var54, var16, var56[var19], var55[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16] = new byte[var55[var16]];
                                  var55[var16] = 0;
                                  var16++;
                                  continue L21;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L27: while (true) {
                                if (var5_int <= var17) {
                                  var15++;
                                  continue L20;
                                } else {
                                  var16 = var16 + var29.b(true);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var11 = var50[0];
                            break L28;
                          } else {
                            var11 = 0;
                            break L28;
                          }
                        }
                        if (((r) this).field_d == 0) {
                          var7[var11] = oh.a(false, true, var54);
                          break L11;
                        } else {
                          var7[var11] = (Object) (Object) var53;
                          return true;
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("r.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param3 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L29;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L29;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + 41);
        }
        return stackIn_101_0 != 0;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 0) {
            int discarded$0 = ((r) this).c(-100);
        }
        if (!this.a(param1, param2, param0 + -20729)) {
            return false;
        }
        if (((r) this).field_i[param1] != null) {
            if (null != ((r) this).field_i[param1][param2]) {
                return true;
            }
        }
        if (!(null == ((r) this).field_e[param1])) {
            return true;
        }
        this.d(param1, (byte) 122);
        if (((r) this).field_e[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (this.c(param0, (byte) -43)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((r) this).field_g.field_t[param0].a(og.a(var5, (byte) -108), 1);
              if (!this.a(param0, var4_int, -20729)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param2 >= 93) {
                    break L1;
                  } else {
                    field_c = null;
                    break L1;
                  }
                }
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("r.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        if (param0 > -49) {
            return;
        }
        field_c = null;
        field_k = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (this.a(param0, param1, -20729)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((r) this).field_i[param0]) {
                    break L2;
                  } else {
                    if (null == ((r) this).field_i[param0][param1]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.b(0, param0, param1, param3)) {
                  break L1;
                } else {
                  this.d(param0, (byte) 107);
                  if (this.b(0, param0, param1, param3)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var6 = -41 % ((37 - param2) / 47);
              if (null != ((r) this).field_i[param0]) {
                L3: {
                  if (null == ((r) this).field_i[param0][param1]) {
                    break L3;
                  } else {
                    var7 = pc.a((byte) 6, false, ((r) this).field_i[param0][param1]);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((r) this).field_d != 1) {
                      if (((r) this).field_d == 2) {
                        ((r) this).field_i[param0] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      ((r) this).field_i[param0][param1] = null;
                      if (((r) this).field_g.field_r[param0] != 1) {
                        break L4;
                      } else {
                        ((r) this).field_i[param0] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_23_0 = var5;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_25_0 = var5;
            stackOut_25_1 = new StringBuilder().append("r.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return (byte[]) (Object) stackIn_24_0;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((r) this).b(param1 ^ param1)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((r) this).field_g.field_k.a(og.a(var4, (byte) -100), param1 + 1);
              stackOut_3_0 = ((r) this).c(param1 + 11321, var3_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("r.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            r.a(82);
        }
        if (((r) this).field_g == null) {
            ((r) this).field_g = ((r) this).field_a.a(true);
            if (!(null != ((r) this).field_g)) {
                return false;
            }
            ((r) this).field_e = new Object[((r) this).field_g.field_p];
            ((r) this).field_i = new Object[((r) this).field_g.field_p][];
        }
        return true;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.c(param1, (byte) -121)) {
            return false;
        }
        if (null != ((r) this).field_e[param1]) {
            return true;
        }
        this.d(param1, (byte) 111);
        if (!(((r) this).field_e[param1] == null)) {
            return true;
        }
        if (param0 != 11321) {
            return ((boolean[]) ((r) this).field_e[7])[0];
        }
        return false;
    }

    final synchronized int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (((r) this).b(0)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((r) this).field_e.length <= var4) {
              if (param0 == var2) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > ((r) this).field_g.field_h[var4]) {
                var2 += 100;
                var3 = var3 + ((r) this).b(var4, 100);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((r) this).b(param1 + 1)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((r) this).field_g.field_k.a(og.a(var4, (byte) -103), 1);
              if (~var3_int > param1) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("r.K(");
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    private final synchronized boolean c(int param0, byte param1) {
        if (((r) this).b(0)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((r) this).field_g.field_r.length <= param0) {
                break L0;
              } else {
                if (((r) this).field_g.field_r[param0] != 0) {
                  if (param1 < -38) {
                    return true;
                  } else {
                    int discarded$2 = ((r) this).b(91, (byte) 121);
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (!rq.field_y) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    r(ab param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((r) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((r) this).field_a = param0;
                    ((r) this).field_d = param2;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((r) this).field_b = stackIn_7_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("r.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}
