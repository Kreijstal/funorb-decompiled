/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
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
            if (!((sh) this).c(81)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
              if (param1 == -89) {
                if (!this.b(var3_int, 127)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_5_0 = -87;
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
            stackOut_11_1 = new StringBuilder().append("sh.V(");
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -27493) {
            field_e = -77;
        }
        return this.a((int[]) null, (byte) 101, param0, param2);
    }

    final synchronized boolean c(int param0) {
        if (!(null != ((sh) this).field_g)) {
            ((sh) this).field_g = ((sh) this).field_h.a(false);
            if (!(((sh) this).field_g != null)) {
                return false;
            }
            ((sh) this).field_j = new Object[((sh) this).field_g.field_d];
            ((sh) this).field_b = new Object[((sh) this).field_g.field_d][];
        }
        int var2 = -54 % ((21 - param0) / 52);
        return true;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(param2, 127)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -27964) {
                  break L1;
                } else {
                  ((sh) this).field_c = 26;
                  break L1;
                }
              }
              var5 = (CharSequence) (Object) param0;
              var4_int = ((sh) this).field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, var5));
              if (this.a(true, param2, var4_int)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
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
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("sh.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(true, param0, param2))) {
            return false;
        }
        if (null != ((sh) this).field_b[param0]) {
            if (null != ((sh) this).field_b[param0][param2]) {
                return true;
            }
        }
        if (!(null == ((sh) this).field_j[param0])) {
            return true;
        }
        this.a(param0, true);
        if (null != ((sh) this).field_j[param0]) {
            return true;
        }
        if (param1 != 78) {
            boolean discarded$0 = sh.d((String) ((sh) this).field_j[7], (byte) -115);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        if (!(((sh) this).c(-54))) {
            return -1;
        }
        int var2 = 30 % ((-72 - param0) / 54);
        return ((sh) this).field_g.field_a.length;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
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
            L1: {
              if (param1 > 109) {
                break L1;
              } else {
                ((sh) this).field_i = false;
                break L1;
              }
            }
            if (((sh) this).c(-41)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
              stackOut_5_0 = ((sh) this).b((byte) -113, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("sh.N(");
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
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void a() {
        field_d = null;
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        byte[] var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.a(true, param2, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((sh) this).field_b[param2]) {
                    break L2;
                  } else {
                    if (null != ((sh) this).field_b[param2][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param2, 80, param0, param3)) {
                  this.a(param2, true);
                  if (this.a(param2, 124, param0, param3)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((sh) this).field_b[param2]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((sh) this).field_b[param2][param3] != null) {
                    var8 = nl.a(((sh) this).field_b[param2][param3], (byte) -74, false);
                    var5 = (Object) (Object) var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 != null) {
                    if (1 != ((sh) this).field_c) {
                      if (-3 != ((sh) this).field_c) {
                        break L4;
                      } else {
                        ((sh) this).field_b[param2] = null;
                        break L4;
                      }
                    } else {
                      ((sh) this).field_b[param2][param3] = null;
                      if (-2 != ((sh) this).field_g.field_a[param2]) {
                        break L4;
                      } else {
                        ((sh) this).field_b[param2] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
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
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("sh.W(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 101 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.b(param1, 126))) {
            return false;
        }
        if (!(null == ((sh) this).field_j[param1])) {
            return true;
        }
        this.a(param1, true);
        if (!(null == ((sh) this).field_j[param1])) {
            return true;
        }
        if (param0 != 5) {
            return ((boolean[]) ((sh) this).field_j[4])[1];
        }
        return false;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (((sh) this).field_i) {
            ((sh) this).field_j[param0] = (Object) (Object) ((sh) this).field_h.a(param0, true);
        } else {
            ((sh) this).field_j[param0] = ri.a(136, ((sh) this).field_h.a(param0, true), false);
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((sh) this).c(param1 ^ 10842)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
              if (param1 == 10762) {
                stackOut_7_0 = ((sh) this).c(5, var3_int);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("sh.B(");
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, 126)) {
            return 0;
        }
        if (param0 > -79) {
            return ((int[]) ((sh) this).field_j[0])[9];
        }
        if (null != ((sh) this).field_j[param1]) {
            return 100;
        }
        return ((sh) this).field_h.a(param1, 1215);
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!((sh) this).c(121)) {
          return false;
        } else {
          var2 = 1;
          var3 = 39 % ((-47 - param0) / 62);
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((sh) this).field_g.field_f.length) {
              return var2 != 0;
            } else {
              var5 = ((sh) this).field_g.field_f[var4];
              if (((sh) this).field_j[var5] == null) {
                this.a(var5, true);
                if (null == ((sh) this).field_j[var5]) {
                  var2 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
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
            if (((sh) this).c(param0 + -250)) {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 127) {
                  break L1;
                } else {
                  ((long[]) ((sh) this).field_j[9])[2] = ((long[]) ((sh) this).field_j[0])[1];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((sh) this).field_g.field_b.a(-20075, na.a(param0 ^ 1048703, var6));
              if (this.b(var4_int, 127)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((sh) this).field_g.field_c[var4_int].a(-20075, na.a(param0 + 1048449, var7));
                stackOut_8_0 = ((sh) this).a(var4_int, -27493, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("sh.R(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((sh) this).c(125)) {
            return null;
        }
        if (((sh) this).field_g.field_a.length == 1) {
            return ((sh) this).a(0, -27493, param0);
        }
        if (!this.b(param0, 127)) {
            return null;
        }
        if (!(((sh) this).field_g.field_a[param0] != 1)) {
            return ((sh) this).a(param0, -27493, 0);
        }
        int var3 = 81 / ((param1 - -44) / 43);
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (!((sh) this).c(-98)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            if (!param0) {
              break L0;
            } else {
              ((sh) this).field_j[1] = null;
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((sh) this).field_j.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (((sh) this).field_g.field_m[var4] > 0) {
                var3 = var3 + ((sh) this).b((byte) -98, var4);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(String param0, String param1, int param2) {
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
            if (!((sh) this).c(-118)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  field_a = ((int[]) ((Object[]) ((sh) this).field_j[2])[2])[0];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((sh) this).field_g.field_b.a(-20075, na.a(param2 ^ -1048577, var6));
              if (!this.b(var4_int, 126)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param0;
                var5 = ((sh) this).field_g.field_c[var4_int].a(-20075, na.a(1048576, var7));
                stackOut_10_0 = ((sh) this).a(var4_int, (byte) 78, var5);
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
            stackOut_12_1 = new StringBuilder().append("sh.J(");
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
          throw ld.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
        int stackOut_4_0 = 0;
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
            L1: {
              if (param1 < -113) {
                break L1;
              } else {
                boolean discarded$2 = ((sh) this).c(71, ((int[]) ((sh) this).field_j[23])[0]);
                break L1;
              }
            }
            if (!((sh) this).c(85)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
              if (var3_int >= 0) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("sh.S(");
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((sh) this).c(101)) {
          return false;
        } else {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((sh) this).field_g.field_a.length <= param0) {
                break L0;
              } else {
                if (((sh) this).field_g.field_a[param0] == 0) {
                  break L0;
                } else {
                  if (param1 >= 125) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          if (!oc.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!(((sh) this).c(-94))) {
            return false;
        }
        if (0 <= param1) {
            if (0 <= param2) {
                if (((sh) this).field_g.field_a.length > param1) {
                    if (((sh) this).field_g.field_a[param1] > param2) {
                        return true;
                    }
                }
            }
        }
        if (!oc.field_b) {
            return false;
        }
        throw new IllegalArgumentException(param1 + " " + param2);
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wf var27 = null;
        byte[] var28 = null;
        wf var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        wf var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        byte[] var55 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.b(param0, 126)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((sh) this).field_j[param0]) {
                L1: {
                  var5_int = ((sh) this).field_g.field_m[param0];
                  var49 = ((sh) this).field_g.field_n[param0];
                  var42 = var49;
                  var35 = var42;
                  var25 = var35;
                  var6 = var25;
                  if (((sh) this).field_b[param0] != null) {
                    break L1;
                  } else {
                    ((sh) this).field_b[param0] = new Object[((sh) this).field_g.field_a[param0]];
                    break L1;
                  }
                }
                var7 = ((sh) this).field_b[param0];
                var8 = -4 % ((param1 - 17) / 39);
                var9 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var10_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var11 = var10_int;
                          break L4;
                        } else {
                          var11 = var49[var10_int];
                          break L4;
                        }
                      }
                      if (var7[var11] != null) {
                        var10_int++;
                        continue L2;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var9 != 0) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param2[0]) {
                              break L7;
                            } else {
                              if (param2[1] != 0) {
                                break L7;
                              } else {
                                if (param2[2] != 0) {
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
                          var50 = nl.a(((sh) this).field_j[param0], (byte) -74, true);
                          var43 = var50;
                          var36 = var43;
                          var26 = var36;
                          var10_array = var26;
                          var27 = new wf(var50);
                          var27.a(4, var27.field_j.length, 5, param2);
                          break L5;
                        }
                      }
                      var10_array = nl.a(((sh) this).field_j[param0], (byte) -74, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var51 = qk.a(65, var10_array);
                        var44 = var51;
                        var37 = var44;
                        var28 = var37;
                        var24 = var28;
                        var52 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackOut_32_0 = (RuntimeException) var12_ref_RuntimeException;
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
                      throw ld.a((Throwable) (Object) stackIn_35_0, (stackIn_35_2 != 0) + " " + param0 + " " + param2.length + " " + oe.a(88, var10_array, param2.length) + " " + oe.a(-91, var10_array, -2 + param2.length) + " " + ((sh) this).field_g.field_r[param0] + " " + ((sh) this).field_g.field_i);
                    }
                    L10: {
                      if (((sh) this).field_i) {
                        ((sh) this).field_j[param0] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (((sh) this).field_c == 2) {
                          var12 = var51.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - var5_int * var13 * 4;
                          var33 = new wf(var52);
                          var15 = 0;
                          var16 = 0;
                          var33.field_h = var12;
                          var17 = 0;
                          L12: while (true) {
                            if (var13 <= var17) {
                              if (var15 == 0) {
                                stackOut_85_0 = 1;
                                stackIn_86_0 = stackOut_85_0;
                                return stackIn_86_0 != 0;
                              } else {
                                var55 = new byte[var15];
                                var15 = 0;
                                var33.field_h = var12;
                                var18 = 0;
                                var19 = 0;
                                L13: while (true) {
                                  if (var19 >= var13) {
                                    var7[var16] = (Object) (Object) var55;
                                    break L11;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (var21 >= var5_int) {
                                        var19++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var20 = var20 + var33.d((byte) 19);
                                          if (var6 != null) {
                                            var22 = var49[var21];
                                            break L15;
                                          } else {
                                            var22 = var21;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param3 != var22) {
                                            break L16;
                                          } else {
                                            o.a(var52, var18, var55, var15, var20);
                                            var15 = var15 + var20;
                                            break L16;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L17: while (true) {
                                if (var5_int <= var19) {
                                  var17++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var18 = var18 + var33.d((byte) 19);
                                    if (var6 == null) {
                                      var20 = var19;
                                      break L18;
                                    } else {
                                      var20 = var49[var19];
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var20 == param3) {
                                      var16 = var20;
                                      var15 = var15 + var18;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var19++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var51.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - 4 * (var13 * var5_int);
                          var30 = new wf(var52);
                          var30.field_h = var12;
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_int__ = var31;
                          var16 = 0;
                          L20: while (true) {
                            if (var13 <= var16) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var32 = var40;
                              var16_ref_byte____ = var32;
                              var17 = 0;
                              L21: while (true) {
                                if (var5_int <= var17) {
                                  var30.field_h = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var18 >= var13) {
                                      var18 = 0;
                                      L23: while (true) {
                                        if (var18 >= var5_int) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var19 = var49[var18];
                                              break L24;
                                            } else {
                                              var19 = var18;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (((sh) this).field_c == 0) {
                                              var7[var19] = ri.a(136, var54[var18], false);
                                              break L25;
                                            } else {
                                              var7[var19] = (Object) (Object) var54[var18];
                                              break L25;
                                            }
                                          }
                                          var18++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L26: while (true) {
                                        if (var5_int <= var20) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          var19 = var19 + var30.d((byte) 19);
                                          o.a(var52, var17, var54[var20], var53[var20], var19);
                                          var17 = var17 + var19;
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var20++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var16_ref_byte____[var17] = new byte[var53[var17]];
                                  var53[var17] = 0;
                                  var17++;
                                  continue L21;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L20;
                                } else {
                                  var17 = var17 + var30.d((byte) 19);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var12 = var49[0];
                            break L28;
                          } else {
                            var12 = 0;
                            break L28;
                          }
                        }
                        if (((sh) this).field_c != 0) {
                          var7[var12] = (Object) (Object) var52;
                          break L11;
                        } else {
                          var7[var12] = ri.a(136, var51, false);
                          return true;
                        }
                      }
                    }
                    stackOut_99_0 = 1;
                    stackIn_100_0 = stackOut_99_0;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var5;
            stackOut_101_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + ',' + param3 + ')');
        }
        return stackIn_100_0 != 0;
    }

    sh(hf param0, boolean param1, int param2) {
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
        ((sh) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
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
                  ((sh) this).field_i = stackIn_7_1 != 0;
                  ((sh) this).field_c = param2;
                  ((sh) this).field_h = param0;
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
            stackOut_9_1 = new StringBuilder().append("sh.<init>(");
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
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == 50) {
                break L1;
              } else {
                field_a = -22;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (hi.a(18670, (char) var3)) {
                    break L3;
                  } else {
                    if (!ne.a((byte) 94, (char) var3)) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("sh.O(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final int a(byte param0, int param1) {
        int var3 = 92 % ((70 - param0) / 40);
        if (!this.b(param1, 126)) {
            return 0;
        }
        return ((sh) this).field_g.field_a[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = 0;
    }
}
