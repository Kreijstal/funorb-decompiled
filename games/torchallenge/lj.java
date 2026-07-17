/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private kl field_a;
    static int[] field_j;
    private Object[] field_c;
    static int field_b;
    private tf field_l;
    static int[][][] field_g;
    private boolean field_i;
    static qe[] field_n;
    private int field_m;
    private Object[][] field_p;
    static String field_k;
    static int field_e;
    static cf field_r;
    static ka[] field_h;
    static String field_d;
    static ka[] field_o;
    static ka field_f;
    static boolean field_q;

    final synchronized int a(int param0, byte param1) {
        if (param1 != 12) {
            return -38;
        }
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (((lj) this).field_c[param0] != null) {
            return 100;
        }
        return ((lj) this).field_a.a(0, param0);
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
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
            if (((lj) this).b(-7957)) {
              if (param0 == -39) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((lj) this).field_l.field_p.a((byte) 90, wh.a((byte) 68, var4));
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("lj.F(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((lj) this).b(-7957)) {
            return null;
        }
        if (!(1 != ((lj) this).field_l.field_g.length)) {
            return ((lj) this).c(0, param0, 0);
        }
        if (!this.a((byte) 27, param0)) {
            return null;
        }
        int var3 = 82 / ((param1 - 82) / 32);
        if (1 == ((lj) this).field_l.field_g[param0]) {
            return ((lj) this).c(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 > 31) {
          if (!((lj) this).b(-7957)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (((lj) this).field_c.length <= var4) {
                if (var2 != 0) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (((lj) this).field_l.field_e[var4] > 0) {
                  var3 = var3 + ((lj) this).a(var4, (byte) 12);
                  var2 += 100;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -78;
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, -122)) {
            return false;
        }
        if (null != ((lj) this).field_p[param2]) {
            if (((lj) this).field_p[param2][param0] != null) {
                return true;
            }
        }
        if (((lj) this).field_c[param2] != null) {
            return true;
        }
        int var4 = -107 % ((param1 - -23) / 56);
        this.b(param2, -124);
        if (((lj) this).field_c[param2] == null) {
            return false;
        }
        return true;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((lj) this).b(-7957)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 5) {
                  break L1;
                } else {
                  var4 = null;
                  boolean discarded$2 = ((lj) this).b(79, (String) null, (String) null);
                  break L1;
                }
              }
              var5 = (CharSequence) (Object) param1;
              var3_int = ((lj) this).field_l.field_p.a((byte) 126, wh.a((byte) 68, var5));
              stackOut_6_0 = ((lj) this).a(true, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lj.Q(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((lj) this).b(param0 + -7984)) {
          return false;
        } else {
          if (param0 == 27) {
            L0: {
              if (0 > param1) {
                break L0;
              } else {
                if (param1 >= ((lj) this).field_l.field_g.length) {
                  break L0;
                } else {
                  if (((lj) this).field_l.field_g[param1] != 0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (vh.field_a) {
              throw new IllegalArgumentException(Integer.toString(param1));
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((lj) this).b(-7957)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var3_int = -64 % ((param1 - -10) / 36);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4 = ((lj) this).field_l.field_p.a((byte) 116, wh.a((byte) 68, var5));
              if (!this.a((byte) 27, var4)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return var4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lj.J(");
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!param0) {
            return false;
        }
        if (!this.a((byte) 27, param1)) {
            return false;
        }
        if (null != ((lj) this).field_c[param1]) {
            return true;
        }
        this.b(param1, -108);
        if (((lj) this).field_c[param1] != null) {
            return true;
        }
        return false;
    }

    final static String a() {
        if (!(mf.field_a != null)) {
            return "";
        }
        return mf.field_a;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
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
        byte[] stackOut_9_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (((lj) this).b(param0 + -7955)) {
              if (param0 == -2) {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((lj) this).field_l.field_p.a((byte) -39, wh.a((byte) 68, var6));
                if (this.a((byte) 27, var4_int)) {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((lj) this).field_l.field_s[var4_int].a((byte) 101, wh.a((byte) 68, var7));
                  stackOut_9_0 = ((lj) this).c(var4_int, var5, 0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("lj.W(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(int param0) {
        if (param0 != -7957) {
            boolean discarded$0 = ((lj) this).a(((int[]) ((lj) this).field_c[1])[2], -17, ((int[]) ((lj) this).field_c[3])[1]);
        }
        if (null == ((lj) this).field_l) {
            ((lj) this).field_l = ((lj) this).field_a.b(0);
            if (((lj) this).field_l == null) {
                return false;
            }
            ((lj) this).field_p = new Object[((lj) this).field_l.field_r][];
            ((lj) this).field_c = new Object[((lj) this).field_l.field_r];
        }
        return true;
    }

    private final synchronized void b(int param0, int param1) {
        if (((lj) this).field_i) {
            ((lj) this).field_c[param0] = (Object) (Object) ((lj) this).field_a.a(param0, (byte) -72);
        } else {
            ((lj) this).field_c[param0] = ah.a(false, false, ((lj) this).field_a.a(param0, (byte) -72));
        }
        int var3 = -73 / ((-26 - param1) / 43);
    }

    final boolean b(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((lj) this).b(-7957)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((lj) this).field_l.field_p.a((byte) -57, wh.a((byte) 68, var6));
              if (!this.a((byte) 27, var4_int)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (param0 < -16) {
                    break L1;
                  } else {
                    int discarded$2 = ((lj) this).a(((int[]) ((lj) this).field_c[4])[6], ((int[]) ((lj) this).field_c[1])[0]);
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param2;
                var5 = ((lj) this).field_l.field_s[var4_int].a((byte) 87, wh.a((byte) 68, var7));
                stackOut_10_0 = ((lj) this).a(var5, -109, var4_int);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("lj.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final int a(int param0, String param1) {
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
            if (((lj) this).b(-7957)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((lj) this).field_l.field_p.a((byte) -120, wh.a((byte) 68, var4));
                if (param0 >= 99) {
                  break L1;
                } else {
                  lj.a(30);
                  break L1;
                }
              }
              stackOut_5_0 = ((lj) this).a(var3_int, (byte) 12);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("lj.K(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    private final synchronized boolean a(int param0, byte param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        uf var26 = null;
        byte[] var27 = null;
        uf var29 = null;
        uf var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_52_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var22 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.a((byte) 27, param3)) {
              if (((lj) this).field_c[param3] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((lj) this).field_l.field_e[param3];
                  var48 = ((lj) this).field_l.field_A[param3];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (((lj) this).field_p[param3] == null) {
                    ((lj) this).field_p[param3] = new Object[((lj) this).field_l.field_g[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((lj) this).field_p[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = var48[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
                          break L4;
                        }
                      }
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != -1) {
                              break L7;
                            } else {
                              if (0 != param2[1]) {
                                break L7;
                              } else {
                                if (-1 != param2[2]) {
                                  break L7;
                                } else {
                                  if (param2[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = of.a((byte) 125, true, ((lj) this).field_c[param3]);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new uf(var49);
                          var26.a(false, param2, var26.field_m.length, 5);
                          break L5;
                        }
                      }
                      var9_array = of.a((byte) -109, false, ((lj) this).field_c[param3]);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = pg.a(param1 + -1048551, var9_array);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_32_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_32_1 = new StringBuilder();
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param2 == null) {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          break L9;
                        } else {
                          stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                          stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L9;
                        }
                      }
                      int discarded$2 = 0;
                      int discarded$3 = 0;
                      throw oj.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + " " + param3 + " " + param2.length + " " + k.a(var9_array, param2.length) + " " + k.a(var9_array, -2 + param2.length) + " " + ((lj) this).field_l.field_t[param3] + " " + ((lj) this).field_l.field_k);
                    }
                    L10: {
                      if (!((lj) this).field_i) {
                        break L10;
                      } else {
                        ((lj) this).field_c[param3] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 != null) {
                            var11 = var48[0];
                            break L12;
                          } else {
                            var11 = 0;
                            break L12;
                          }
                        }
                        if (((lj) this).field_m != 0) {
                          var7[var11] = (Object) (Object) var51;
                          break L11;
                        } else {
                          var7[var11] = ah.a(false, false, var50);
                          break L11;
                        }
                      } else {
                        if (((lj) this).field_m != 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var31 = new uf(var51);
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var14 = var32;
                          var31.field_q = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var12 <= var15_int) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_q = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var48[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (((lj) this).field_m == 0) {
                                              var7[var18] = ah.a(false, false, var54[var17]);
                                              break L18;
                                            } else {
                                              var7[var18] = (Object) (Object) var54[var17];
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.i(42);
                                          he.a(var51, var16, var54[var19], var53[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var53[var16]];
                                  var53[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.i(param1 + 69);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var29 = new uf(var51);
                          var14_int = 0;
                          var29.field_q = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (var16 >= var12) {
                              if (var14_int != 0) {
                                var52 = new byte[var14_int];
                                var14_int = 0;
                                var29.field_q = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = (Object) (Object) var52;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.i(28);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var48[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param0 != var21) {
                                            break L25;
                                          } else {
                                            he.a(var51, var17, var52, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_52_0 = 1;
                                stackIn_53_0 = stackOut_52_0;
                                return stackIn_53_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.i(param1 ^ -126);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var48[var18];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (param0 != var19) {
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1 == -25) {
                      stackOut_99_0 = 1;
                      stackIn_100_0 = stackOut_99_0;
                      break L0;
                    } else {
                      stackOut_97_0 = 0;
                      stackIn_98_0 = stackOut_97_0;
                      return stackIn_98_0 != 0;
                    }
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
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
            stackOut_101_0 = (RuntimeException) var5;
            stackOut_101_1 = new StringBuilder().append("lj.L(").append(param0).append(44).append(param1).append(44);
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param2 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L29;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L29;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 44 + param3 + 41);
        }
        return stackIn_100_0 != 0;
    }

    final int c(byte param0) {
        if (!((lj) this).b(-7957)) {
            return -1;
        }
        if (param0 != 52) {
            return -128;
        }
        return ((lj) this).field_l.field_g.length;
    }

    final int a(int param0, int param1) {
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (param1 >= -69) {
            Object var4 = null;
            byte[] discarded$0 = this.a((int[]) null, -124, -72, 97);
        }
        return ((lj) this).field_l.field_g[param0];
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!((lj) this).b(-7957)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((lj) this).field_l.field_y.length <= var3) {
              L1: {
                if (param0 == 79) {
                  break L1;
                } else {
                  field_r = (cf) ((lj) this).field_c[0];
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((lj) this).field_l.field_y[var3];
              if (((lj) this).field_c[var4] == null) {
                this.b(var4, -92);
                if (null == ((lj) this).field_c[var4]) {
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
        }
    }

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
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
            if (!this.a((byte) 27, param0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var5 = (CharSequence) (Object) param1;
                var4_int = ((lj) this).field_l.field_s[param0].a((byte) 116, wh.a((byte) 68, var5));
                if (param2 >= 81) {
                  break L1;
                } else {
                  int discarded$2 = ((lj) this).c((byte) 106);
                  break L1;
                }
              }
              if (!this.b(param0, var4_int, -100)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return var4_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("lj.I(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (this.b(param1, param3, -77)) {
              var5 = null;
              if (param2 <= -22) {
                L1: {
                  L2: {
                    if (((lj) this).field_p[param1] == null) {
                      break L2;
                    } else {
                      if (((lj) this).field_p[param1][param3] != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!this.a(param3, (byte) -25, param0, param1)) {
                    this.b(param1, 121);
                    if (this.a(param3, (byte) -25, param0, param1)) {
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (((lj) this).field_p[param1] != null) {
                  L3: {
                    if (((lj) this).field_p[param1][param3] != null) {
                      var7 = of.a((byte) -115, false, ((lj) this).field_p[param1][param3]);
                      var5 = (Object) (Object) var7;
                      if (var7 == null) {
                        throw new RuntimeException("");
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (((lj) this).field_m == 1) {
                        ((lj) this).field_p[param1][param3] = null;
                        if (((lj) this).field_l.field_g[param1] != 1) {
                          break L4;
                        } else {
                          ((lj) this).field_p[param1] = null;
                          break L4;
                        }
                      } else {
                        if (((lj) this).field_m != 2) {
                          break L4;
                        } else {
                          ((lj) this).field_p[param1] = null;
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = var5;
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_4_0 = (byte[]) ((lj) this).field_c[14];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_29_0 = var5;
            stackOut_29_1 = new StringBuilder().append("lj.H(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_28_0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((lj) this).b(-7957)) {
          return false;
        } else {
          L0: {
            if (param2 < -68) {
              break L0;
            } else {
              boolean discarded$2 = this.a(((int[]) ((lj) this).field_c[4])[13], ((byte[]) ((Object[]) ((lj) this).field_c[2])[0])[10], (int[]) null, ((int[]) ((lj) this).field_c[4])[0]);
              break L0;
            }
          }
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (0 > param1) {
                break L1;
              } else {
                if (((lj) this).field_l.field_g.length <= param0) {
                  break L1;
                } else {
                  if (param1 < ((lj) this).field_l.field_g[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!vh.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        }
    }

    final byte[] c(int param0, int param1, int param2) {
        if (param2 != 0) {
            boolean discarded$0 = this.a(((byte[]) ((Object[]) ((lj) this).field_c[4])[5])[2], -70);
        }
        return this.a((int[]) null, param0, -62, param1);
    }

    lj(kl param0, boolean param1, int param2) {
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
        ((lj) this).field_l = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
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
                  ((lj) this).field_i = stackIn_7_1 != 0;
                  ((lj) this).field_m = param2;
                  ((lj) this).field_a = param0;
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
            stackOut_9_1 = new StringBuilder().append("lj.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_f = null;
        field_r = null;
        field_d = null;
        field_k = null;
        field_j = null;
        field_g = null;
        field_h = null;
        if (param0 != 11446) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_n = null;
        field_k = "Press <img=2> to exit the tower.";
        field_r = new cf();
        field_d = "Quit";
        field_q = true;
    }
}
