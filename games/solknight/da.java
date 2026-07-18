/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private int field_e;
    private ha field_g;
    private Object[] field_c;
    static ff field_i;
    private boolean field_h;
    static ef field_d;
    static int field_f;
    private wd field_j;
    private Object[][] field_b;
    static fa[] field_a;

    final synchronized boolean b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (!((da) this).c((byte) -121)) {
          return false;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((da) this).field_g.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((da) this).field_g.field_f[var3];
              if (((da) this).field_c[var4] == null) {
                this.c(var4, 115);
                if (((da) this).field_c[var4] == null) {
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

    final int b(int param0, int param1) {
        if (!this.a((byte) 48, param1)) {
            return 0;
        }
        if (param0 < 5) {
            boolean discarded$0 = this.a(127, (int[]) ((da) this).field_c[0], 89, true);
        }
        return ((da) this).field_g.field_o[param1];
    }

    final int a(byte param0) {
        if (!(((da) this).c((byte) -121))) {
            return -1;
        }
        int var2 = -50 / ((-34 - param0) / 38);
        return ((da) this).field_g.field_o.length;
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(((da) this).c((byte) -121))) {
            return false;
        }
        field_d = null;
        if (param0 >= 0) {
            if (param2 >= 0) {
                if (param0 < ((da) this).field_g.field_o.length) {
                    if (((da) this).field_g.field_o[param0] > param2) {
                        return true;
                    }
                }
            }
        }
        if (!ab.field_t) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param2);
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (this.a((byte) -84, param2)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4_int = ((da) this).field_g.field_j[param2].a(0, bk.a(param1 ^ param1, var5));
              if (!this.a(param2, false, var4_int)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("da.DA(");
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
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final int d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            if (((da) this).c((byte) -121)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((da) this).field_g.field_e.a(0, bk.a(param0 ^ param0, var4));
              stackOut_3_0 = ((da) this).b((byte) 100, var3_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("da.O(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.a((byte) -117, param0))) {
            return false;
        }
        if (((da) this).field_c[param0] != null) {
            return true;
        }
        if (param1 != -1) {
            return false;
        }
        this.c(param0, 115);
        if (((da) this).field_c[param0] != null) {
            return true;
        }
        return false;
    }

    final boolean a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
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
            if (!((da) this).c((byte) -121)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param2) {
                  break L1;
                } else {
                  da.a(((boolean[]) ((Object[]) ((da) this).field_c[4])[1])[4]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((da) this).field_g.field_e.a(0, bk.a(0, var6));
              if (!this.a((byte) 98, var4_int)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((da) this).field_g.field_j[var4_int].a(0, bk.a(0, var7));
                stackOut_10_0 = ((da) this).a(100, var4_int, var5);
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
            stackOut_12_1 = new StringBuilder().append("da.N(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(boolean param0) {
        if (!lh.field_l) {
            throw new IllegalStateException();
        }
        kk.field_c = param0;
        qa.a(false, -111);
        fj.field_i = 0;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.a((byte) -114, param1)) {
            return 0;
        }
        if (param0 <= 78) {
            field_f = 108;
        }
        if (null != ((da) this).field_c[param1]) {
            return 100;
        }
        return ((da) this).field_j.a(param1, (byte) 31);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param1, false, param2)) {
            return false;
        }
        if (((da) this).field_b[param1] != null) {
            if (!(null == ((da) this).field_b[param1][param2])) {
                return true;
            }
        }
        if (!(((da) this).field_c[param1] == null)) {
            return true;
        }
        this.c(param1, 107);
        if (((da) this).field_c[param1] != null) {
            return true;
        }
        if (param0 != 100) {
            ((byte[]) ((Object[]) ((da) this).field_c[5])[7])[0] = (byte) 125;
            return false;
        }
        return false;
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
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
            if (!((da) this).c((byte) -121)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((da) this).field_g.field_e.a(0, bk.a(0, var4));
              if (param0 >= 69) {
                if (!this.a((byte) -76, var3_int)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_5_0 = ((int[]) ((Object[]) ((da) this).field_c[5])[1])[1];
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("da.H(").append(param0).append(',');
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
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((da) this).c((byte) -121)) {
            return false;
        }
        int var3 = -119 / ((param0 - -33) / 42);
        if (param1 >= 0) {
            if (~param1 > ~((da) this).field_g.field_o.length) {
                if (((da) this).field_g.field_o[param1] != 0) {
                    return true;
                }
            }
        }
        if (!ab.field_t) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    public static void b(int param0) {
        if (param0 > -121) {
            da.a(true);
        }
        field_a = null;
        field_d = null;
        field_i = null;
    }

    final synchronized boolean c(byte param0) {
        if (param0 != -121) {
            boolean discarded$0 = this.a((byte) 64, 117);
        }
        if (null != ((da) this).field_g) {
            return true;
        }
        ((da) this).field_g = ((da) this).field_j.c(-68);
        if (null == ((da) this).field_g) {
            return false;
        }
        ((da) this).field_c = new Object[((da) this).field_g.field_l];
        ((da) this).field_b = new Object[((da) this).field_g.field_l][];
        return true;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 12257) {
            return null;
        }
        return this.a((int[]) null, param0, -17, param2);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (this.a(param1, false, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((da) this).field_b[param1]) {
                    break L2;
                  } else {
                    if (null != ((da) this).field_b[param1][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param3, param0, param1, false)) {
                  this.c(param1, 119);
                  if (this.a(param3, param0, param1, false)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((da) this).field_b[param1]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null == ((da) this).field_b[param1][param3]) {
                    break L3;
                  } else {
                    var7 = tk.a((byte) -59, false, ((da) this).field_b[param1][param3]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (1 == ((da) this).field_e) {
                      ((da) this).field_b[param1][param3] = null;
                      if (1 == ((da) this).field_g.field_o[param1]) {
                        ((da) this).field_b[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (((da) this).field_e == 2) {
                        ((da) this).field_b[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6 = -91;
                stackOut_25_0 = var5;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("da.U(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + -17 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    final synchronized byte[] a(int param0, byte param1) {
        int var3 = -45 % ((5 - param1) / 37);
        if (!((da) this).c((byte) -121)) {
            return null;
        }
        if (!(((da) this).field_g.field_o.length != 1)) {
            return ((da) this).b(0, 12257, param0);
        }
        if (!this.a((byte) 74, param0)) {
            return null;
        }
        if (!(((da) this).field_g.field_o[param0] != 1)) {
            return ((da) this).b(param0, 12257, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 < 93) {
            ((boolean[]) ((da) this).field_c[2])[21] = true;
        }
        if (((da) this).field_h) {
            ((da) this).field_c[param0] = (Object) (Object) ((da) this).field_j.a(param0, 0);
        } else {
            int discarded$0 = 0;
            int discarded$1 = 7;
            ((da) this).field_c[param0] = w.a(((da) this).field_j.a(param0, 0));
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((da) this).c((byte) -121)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 4) {
                  break L1;
                } else {
                  ((da) this).field_b = null;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((da) this).field_g.field_e.a(0, bk.a(0, var6));
              if (this.a((byte) 106, var4_int)) {
                var7 = (CharSequence) (Object) param2;
                var5 = ((da) this).field_g.field_j[var4_int].a(0, bk.a(0, var7));
                stackOut_8_0 = ((da) this).b(var4_int, 12257, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("da.F(").append(param0).append(',');
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
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int b(byte param0) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param0 != -66) {
            return 45;
        }
        if (!((da) this).c((byte) -121)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (var4 = 0; ~var4 > ~((da) this).field_c.length; var4++) {
            if (!(((da) this).field_g.field_r[var4] <= 0)) {
                var3 = var3 + ((da) this).b((byte) 94, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        }
        var4 = var3 * 100 / var2;
        return var4;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
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
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (param0 < 0) {
                L2: {
                  if (param1 > 14) {
                    break L2;
                  } else {
                    da.b(-34);
                    break L2;
                  }
                }
                break L0;
              } else {
                var17 = param2;
                var10_array = var17;
                var11 = param7;
                var12 = param9;
                var13 = param6;
                var14 = param8;
                var15 = var17[var11] >> 1 & 8355711;
                var10_array[var11] = (fi.a(var14, 33448895) >> 17) - -fi.a(var12 >> 1, 16711680) - (-(fi.a(var13, 33423626) >> 9) - var15);
                param8 = param8 + param4;
                param7++;
                param9 = param9 + param5;
                param6 = param6 + param3;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("da.R(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(int param0) {
        sg.field_b[192] = 28;
        sg.field_b[222] = 58;
        sg.field_b[520] = 59;
        if (param0 != 0) {
            da.a(-106);
        }
        sg.field_b[92] = 74;
        sg.field_b[47] = 73;
        sg.field_b[91] = 42;
        sg.field_b[44] = 71;
        sg.field_b[93] = 43;
        sg.field_b[59] = 57;
        sg.field_b[46] = 72;
        sg.field_b[45] = 26;
        sg.field_b[61] = 27;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
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
            if (((da) this).c((byte) -121)) {
              var3_int = -60 / ((param0 - -39) / 59);
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4 = ((da) this).field_g.field_e.a(0, bk.a(0, var5));
              if (var4 < 0) {
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
            stackOut_7_1 = new StringBuilder().append("da.V(").append(param0).append(',');
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
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        gb var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        gb var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_55_0 = 0;
        gb stackIn_55_1 = null;
        int stackIn_56_0 = 0;
        gb stackIn_56_1 = null;
        int stackIn_57_0 = 0;
        gb stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        gb stackIn_98_1 = null;
        int stackIn_99_0 = 0;
        gb stackIn_99_1 = null;
        int stackIn_100_0 = 0;
        gb stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_109_0 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_91_0 = 0;
        int stackOut_97_0 = 0;
        gb stackOut_97_1 = null;
        int stackOut_99_0 = 0;
        gb stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_98_0 = 0;
        gb stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_54_0 = 0;
        gb stackOut_54_1 = null;
        int stackOut_56_0 = 0;
        gb stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_55_0 = 0;
        gb stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_108_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        var22 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.a((byte) 104, param2)) {
              if (null == ((da) this).field_c[param2]) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((da) this).field_g.field_r[param2];
                  var6 = ((da) this).field_g.field_a[param2];
                  if (((da) this).field_b[param2] == null) {
                    ((da) this).field_b[param2] = new Object[((da) this).field_g.field_o[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((da) this).field_b[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10_int = var6[var9_int];
                          break L4;
                        } else {
                          var10_int = var9_int;
                          break L4;
                        }
                      }
                      if (var7[var10_int] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      if (!param3) {
                        break L5;
                      } else {
                        ((da) this).field_e = 3;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (param1 == null) {
                          break L7;
                        } else {
                          L8: {
                            if (-1 != param1[0]) {
                              break L8;
                            } else {
                              if (param1[1] != 0) {
                                break L8;
                              } else {
                                if (0 != param1[2]) {
                                  break L8;
                                } else {
                                  if (-1 == param1[3]) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = tk.a((byte) -76, true, ((da) this).field_c[param2]);
                          var10_ref = new gb(var9_array);
                          var10_ref.a(param1, 5, 5838, var10_ref.field_l.length);
                          break L6;
                        }
                      }
                      var9_array = tk.a((byte) -110, false, ((da) this).field_c[param2]);
                      break L6;
                    }
                    try {
                      L9: {
                        int discarded$5 = 6;
                        var23 = jh.a(var9_array);
                        var10 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_35_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_35_1 = new StringBuilder();
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (param1 == null) {
                          stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                          stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                          stackOut_37_2 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          stackIn_38_2 = stackOut_37_2;
                          break L10;
                        } else {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_38_2 = stackOut_36_2;
                          break L10;
                        }
                      }
                      throw fc.a((Throwable) (Object) stackIn_38_0, (stackIn_38_2 != 0) + " " + param2 + " " + param1.length + " " + gl.a(param1.length, var9_array, 125) + " " + gl.a(param1.length + -2, var9_array, 125) + " " + ((da) this).field_g.field_b[param2] + " " + ((da) this).field_g.field_d);
                    }
                    L11: {
                      if (((da) this).field_h) {
                        ((da) this).field_c[param2] = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int > 1) {
                        if (((da) this).field_e == 2) {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var13 = new gb(var10);
                          var14 = 0;
                          var13.field_m = var11;
                          var15 = 0;
                          var16_int = 0;
                          L13: while (true) {
                            if (var12 <= var16_int) {
                              if (var14 == 0) {
                                stackOut_91_0 = 1;
                                stackIn_92_0 = stackOut_91_0;
                                return stackIn_92_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var14 = 0;
                                var13.field_m = var11;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = (Object) (Object) var16;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L15: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          stackOut_97_0 = var19;
                                          stackOut_97_1 = (gb) var13;
                                          stackIn_99_0 = stackOut_97_0;
                                          stackIn_99_1 = stackOut_97_1;
                                          stackIn_98_0 = stackOut_97_0;
                                          stackIn_98_1 = stackOut_97_1;
                                          if (param3) {
                                            stackOut_99_0 = stackIn_99_0;
                                            stackOut_99_1 = (gb) (Object) stackIn_99_1;
                                            stackOut_99_2 = 0;
                                            stackIn_100_0 = stackOut_99_0;
                                            stackIn_100_1 = stackOut_99_1;
                                            stackIn_100_2 = stackOut_99_2;
                                            break L16;
                                          } else {
                                            stackOut_98_0 = stackIn_98_0;
                                            stackOut_98_1 = (gb) (Object) stackIn_98_1;
                                            stackOut_98_2 = 1;
                                            stackIn_100_0 = stackOut_98_0;
                                            stackIn_100_1 = stackOut_98_1;
                                            stackIn_100_2 = stackOut_98_2;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          var19 = stackIn_100_0 + ((gb) (Object) stackIn_100_1).e(stackIn_100_2 != 0);
                                          if (var6 != null) {
                                            var21 = var6[var20];
                                            break L17;
                                          } else {
                                            var21 = var20;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          if (param0 != var21) {
                                            break L18;
                                          } else {
                                            fk.a(var10, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L18;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L19: while (true) {
                                if (var18 >= var5_int) {
                                  var16_int++;
                                  continue L13;
                                } else {
                                  L20: {
                                    var17 = var17 + var13.e(true);
                                    if (var6 != null) {
                                      var19 = var6[var18];
                                      break L20;
                                    } else {
                                      var19 = var18;
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (var19 == param0) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  var18++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var13 = new gb(var10);
                          var13.field_m = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L22: while (true) {
                            if (var12 <= var15) {
                              var15_ref_byte____ = new byte[var5_int][];
                              var16_int = 0;
                              L23: while (true) {
                                if (var5_int <= var16_int) {
                                  var13.field_m = var11;
                                  var16_int = 0;
                                  var17 = 0;
                                  L24: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L25: while (true) {
                                        if (var17 >= var5_int) {
                                          break L12;
                                        } else {
                                          L26: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L26;
                                            } else {
                                              var18 = var6[var17];
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (((da) this).field_e == 0) {
                                              int discarded$6 = 0;
                                              int discarded$7 = 7;
                                              var7[var18] = w.a(var15_ref_byte____[var17]);
                                              break L27;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              break L27;
                                            }
                                          }
                                          var17++;
                                          continue L25;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L28: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L24;
                                        } else {
                                          var18 = var18 + var13.e(true);
                                          fk.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                          var16_int = var16_int + var18;
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var19++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  continue L23;
                                }
                              }
                            } else {
                              var16_int = 0;
                              var17 = 0;
                              L29: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L22;
                                } else {
                                  L30: {
                                    stackOut_54_0 = var16_int;
                                    stackOut_54_1 = (gb) var13;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_56_1 = stackOut_54_1;
                                    stackIn_55_0 = stackOut_54_0;
                                    stackIn_55_1 = stackOut_54_1;
                                    if (param3) {
                                      stackOut_56_0 = stackIn_56_0;
                                      stackOut_56_1 = (gb) (Object) stackIn_56_1;
                                      stackOut_56_2 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      stackIn_57_1 = stackOut_56_1;
                                      stackIn_57_2 = stackOut_56_2;
                                      break L30;
                                    } else {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = (gb) (Object) stackIn_55_1;
                                      stackOut_55_2 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      stackIn_57_1 = stackOut_55_1;
                                      stackIn_57_2 = stackOut_55_2;
                                      break L30;
                                    }
                                  }
                                  var16_int = stackIn_57_0 + ((gb) (Object) stackIn_57_1).e(stackIn_57_2 != 0);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                  var17++;
                                  continue L29;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L31: {
                          if (var6 == null) {
                            var11 = 0;
                            break L31;
                          } else {
                            var11 = var6[0];
                            break L31;
                          }
                        }
                        if (((da) this).field_e != 0) {
                          var7[var11] = (Object) (Object) var10;
                          break L12;
                        } else {
                          int discarded$8 = 0;
                          int discarded$9 = 7;
                          var7[var11] = w.a(var23);
                          return true;
                        }
                      }
                    }
                    stackOut_108_0 = 1;
                    stackIn_109_0 = stackOut_108_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
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
          L32: {
            var5 = decompiledCaughtException;
            stackOut_110_0 = (RuntimeException) var5;
            stackOut_110_1 = new StringBuilder().append("da.P(").append(param0).append(',');
            stackIn_112_0 = stackOut_110_0;
            stackIn_112_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param1 == null) {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L32;
            } else {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "{...}";
              stackIn_113_0 = stackOut_111_0;
              stackIn_113_1 = stackOut_111_1;
              stackIn_113_2 = stackOut_111_2;
              break L32;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_109_0 != 0;
    }

    final static String a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            int discarded$2 = 160;
            stackOut_2_0 = vd.a(param1, 0, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("da.D(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, String param1) {
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
            if (((da) this).c((byte) -121)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((da) this).field_g.field_e.a(param0 ^ param0, bk.a(0, var4));
              stackOut_3_0 = ((da) this).a(var3_int, -1);
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
            stackOut_5_1 = new StringBuilder().append("da.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    da(wd param0, boolean param1, int param2) {
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
        ((da) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((da) this).field_j = param0;
                    ((da) this).field_e = param2;
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
                  ((da) this).field_h = stackIn_7_1 != 0;
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
            stackOut_9_1 = new StringBuilder().append("da.<init>(");
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
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_i = new ff(6, 0, 4, 2);
        field_d = new ef();
        field_a = new fa[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new fa();
        }
    }
}
