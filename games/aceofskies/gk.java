/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private ps field_e;
    private Object[][] field_d;
    private Object[] field_a;
    static nf field_g;
    private ip field_h;
    private int field_b;
    private boolean field_f;
    static String field_c;

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 42)) {
            return false;
        }
        if (((gk) this).field_a[param0] != null) {
            return true;
        }
        this.a(param0, true);
        if (param1 != 0) {
            return false;
        }
        if (null != ((gk) this).field_a[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (!((gk) this).b((byte) 118)) {
            return false;
        }
        if (param0 >= 0) {
            if (param0 < ((gk) this).field_e.field_j.length) {
                if (((gk) this).field_e.field_j[param0] != 0) {
                    return true;
                }
            }
        }
        if (!ak.field_e) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!((gk) this).b((byte) -99)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                param2 = param2.toLowerCase();
                var6 = (CharSequence) (Object) param0;
                var4_int = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
                if (param1 < -76) {
                  break L1;
                } else {
                  int discarded$2 = ((gk) this).b(((int[]) ((gk) this).field_a[0])[0], -77);
                  break L1;
                }
              }
              if (var4_int >= 0) {
                var7 = (CharSequence) (Object) param2;
                var5 = ((gk) this).field_e.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
                if (0 > var5) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  return true;
                }
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
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("gk.O(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((gk) this).b((byte) 108)) {
          return false;
        } else {
          L0: {
            if (param1 > 73) {
              break L0;
            } else {
              ((gk) this).field_h = null;
              break L0;
            }
          }
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (param2 < 0) {
                break L1;
              } else {
                if (((gk) this).field_e.field_j.length <= param0) {
                  break L1;
                } else {
                  if (param2 < ((gk) this).field_e.field_j[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (ak.field_e) {
            throw new IllegalArgumentException(param0 + " " + param2);
          } else {
            return false;
          }
        }
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (((gk) this).b((byte) -71)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (((gk) this).field_e.field_o.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((gk) this).field_e.field_o[var3];
              if (null == ((gk) this).field_a[var4]) {
                this.a(var4, true);
                if (((gk) this).field_a[var4] == null) {
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
          return false;
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param1 == -79) {
                break L1;
              } else {
                gk.c(((byte[]) ((gk) this).field_a[17])[0]);
                break L1;
              }
            }
            if (!((gk) this).b((byte) 102)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
              stackOut_6_0 = ((gk) this).a(var3_int, 100);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gk.L(");
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
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 100) {
            return -113;
        }
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (!(((gk) this).field_a[param0] == null)) {
            return 100;
        }
        return ((gk) this).field_h.b(1, param0);
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_8_0 = null;
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
        Object stackOut_7_0 = null;
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
            if (((gk) this).b((byte) -94)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
              if (this.a(var4_int, (byte) 42)) {
                if (param1 == -71) {
                  var7 = (CharSequence) (Object) param2;
                  var5 = ((gk) this).field_e.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
                  stackOut_9_0 = ((gk) this).a(var4_int, param1 + -10399, var5);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return (byte[]) (Object) stackIn_8_0;
                }
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("gk.S(");
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
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final int b(int param0, int param1) {
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (param1 != 27912) {
            ((gk) this).field_d = (Object[][]) ((Object[]) ((gk) this).field_a[4])[2];
        }
        return ((gk) this).field_e.field_j[param0];
    }

    final int a(byte param0) {
        if (!(((gk) this).b((byte) -25))) {
            return -1;
        }
        if (param0 < 56) {
            int discarded$0 = ((gk) this).a(((byte[]) ((gk) this).field_a[0])[2]);
        }
        return ((gk) this).field_e.field_j.length;
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 != -73) {
            field_g = null;
        }
        field_g = null;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
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
            if (this.b(param2, 100, param1)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((gk) this).field_d[param2]) {
                    break L2;
                  } else {
                    if (((gk) this).field_d[param2][param1] != null) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param1, param0, param2, (byte) 40)) {
                  break L1;
                } else {
                  this.a(param2, true);
                  if (this.a(param1, param0, param2, (byte) 65)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (null == ((gk) this).field_d[param2]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != ((gk) this).field_d[param2][param1]) {
                    var7 = rb.a(false, ((gk) this).field_d[param2][param1], -45);
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
                  if (var5 != null) {
                    if (((gk) this).field_b == 1) {
                      ((gk) this).field_d[param2][param1] = null;
                      if (((gk) this).field_e.field_j[param2] != 1) {
                        break L4;
                      } else {
                        ((gk) this).field_d[param2] = null;
                        break L4;
                      }
                    } else {
                      if (((gk) this).field_b != 2) {
                        break L4;
                      } else {
                        ((gk) this).field_d[param2] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_25_0 = var5;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("gk.E(");
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
          throw pn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 44 + -53 + 41);
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (param1 <= 29) {
            byte[] discarded$0 = ((gk) this).d(-108, ((int[]) ((Object[]) ((Object[]) ((gk) this).field_a[22])[3])[0])[3]);
        }
        if (!this.b(param2, 113, param0)) {
            return false;
        }
        if (((gk) this).field_d[param2] != null) {
            if (((gk) this).field_d[param2][param0] != null) {
                return true;
            }
        }
        if (null != ((gk) this).field_a[param2]) {
            return true;
        }
        this.a(param2, true);
        if (null == ((gk) this).field_a[param2]) {
            return false;
        }
        return true;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (((gk) this).field_f) {
            ((gk) this).field_a[param0] = (Object) (Object) ((gk) this).field_h.a(param0, 2);
        } else {
            ((gk) this).field_a[param0] = sf.a(false, -137, ((gk) this).field_h.a(param0, 2));
        }
    }

    final synchronized boolean b(byte param0) {
        if (((gk) this).field_e == null) {
            ((gk) this).field_e = ((gk) this).field_h.a(true);
            if (!(null != ((gk) this).field_e)) {
                return false;
            }
            ((gk) this).field_a = new Object[((gk) this).field_e.field_l];
            ((gk) this).field_d = new Object[((gk) this).field_e.field_l][];
        }
        int var2 = -122 % ((param0 - 37) / 44);
        return true;
    }

    final synchronized int a(int param0) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        if (!(((gk) this).b((byte) -37))) {
            return 0;
        }
        int var2 = -90 / ((24 - param0) / 63);
        int var3 = 0;
        int var4 = 0;
        for (var5 = 0; ~var5 > ~((gk) this).field_a.length; var5++) {
            if (!(((gk) this).field_e.field_k[var5] <= 0)) {
                var4 = var4 + ((gk) this).a(var5, 100);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        }
        var5 = var4 * 100 / var3;
        return var5;
    }

    final int b(String param0, int param1) {
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
            if (!((gk) this).b((byte) -42)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
              if (param1 == 0) {
                if (!this.a(var3_int, (byte) 42)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_5_0 = ((int[]) ((gk) this).field_a[5])[9];
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
            stackOut_11_1 = new StringBuilder().append("gk.AA(");
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final boolean a(String param0, int param1) {
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
            if (((gk) this).b((byte) -81)) {
              param0 = param0.toLowerCase();
              var3_int = 68 / ((param1 - 64) / 52);
              var5 = (CharSequence) (Object) param0;
              var4 = ((gk) this).field_e.field_b.a(false, bg.a(var5, (byte) 120));
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
            stackOut_7_1 = new StringBuilder().append("gk.B(");
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
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
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
        rb var26 = null;
        byte[] var27 = null;
        rb var29 = null;
        rb var31 = null;
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
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_105_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param2, (byte) 42)) {
              if (((gk) this).field_a[param2] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((gk) this).field_e.field_k[param2];
                  var48 = ((gk) this).field_e.field_q[param2];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (null == ((gk) this).field_d[param2]) {
                    ((gk) this).field_d[param2] = new Object[((gk) this).field_e.field_j[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((gk) this).field_d[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
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
                      if (null == var7[var10]) {
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
                      L6: {
                        if (param1 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != -1) {
                              break L7;
                            } else {
                              if (-1 != param1[1]) {
                                break L7;
                              } else {
                                if (0 != param1[2]) {
                                  break L7;
                                } else {
                                  if (0 != param1[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = rb.a(true, ((gk) this).field_a[param2], -62);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new rb(var49);
                          var26.a(5, param1, 1515088773, var26.field_f.length);
                          break L5;
                        }
                      }
                      var9_array = rb.a(false, ((gk) this).field_a[param2], -84);
                      break L5;
                    }
                    if (param3 > 3) {
                      try {
                        L8: {
                          int discarded$1 = 0;
                          var50 = pn.a(var9_array);
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
                          stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_36_1 = new StringBuilder();
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (param1 == null) {
                            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                            stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                            stackOut_38_2 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L9;
                          } else {
                            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                            stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                            stackOut_37_2 = 1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L9;
                          }
                        }
                        throw pn.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param2 + " " + param1.length + " " + lj.a(-124, var9_array, param1.length) + " " + lj.a(-118, var9_array, param1.length + -2) + " " + ((gk) this).field_e.field_g[param2] + " " + ((gk) this).field_e.field_t);
                      }
                      L10: {
                        if (((gk) this).field_f) {
                          ((gk) this).field_a[param2] = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var5_int > 1) {
                          if (((gk) this).field_b != 2) {
                            var11 = var50.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - var5_int * var12 * 4;
                            var31 = new rb(var51);
                            var53 = new int[var5_int];
                            var46 = var53;
                            var39 = var46;
                            var32 = var39;
                            var14 = var32;
                            var31.field_g = var11;
                            var15_int = 0;
                            L12: while (true) {
                              if (var12 <= var15_int) {
                                var54 = new byte[var5_int][];
                                var47 = var54;
                                var40 = var47;
                                var33 = var40;
                                var15 = var33;
                                var16 = 0;
                                L13: while (true) {
                                  if (var5_int <= var16) {
                                    var31.field_g = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L14: while (true) {
                                      if (var12 <= var17) {
                                        var17 = 0;
                                        L15: while (true) {
                                          if (var5_int <= var17) {
                                            break L11;
                                          } else {
                                            L16: {
                                              if (var6 == null) {
                                                var18 = var17;
                                                break L16;
                                              } else {
                                                var18 = var48[var17];
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              if (((gk) this).field_b == 0) {
                                                var7[var18] = sf.a(false, -137, var54[var17]);
                                                break L17;
                                              } else {
                                                var7[var18] = (Object) (Object) var54[var17];
                                                break L17;
                                              }
                                            }
                                            var17++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        var18 = 0;
                                        var19 = 0;
                                        L18: while (true) {
                                          if (var19 >= var5_int) {
                                            var17++;
                                            continue L14;
                                          } else {
                                            var18 = var18 + var31.a((byte) 109);
                                            au.a(var51, var16, var54[var19], var53[var19], var18);
                                            var16 = var16 + var18;
                                            var14[var19] = var14[var19] + var18;
                                            var19++;
                                            continue L18;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var15[var16] = new byte[var53[var16]];
                                    var53[var16] = 0;
                                    var16++;
                                    continue L13;
                                  }
                                }
                              } else {
                                var16 = 0;
                                var17 = 0;
                                L19: while (true) {
                                  if (var5_int <= var17) {
                                    var15_int++;
                                    continue L12;
                                  } else {
                                    var16 = var16 + var31.a((byte) 122);
                                    var14[var17] = var14[var17] + var16;
                                    var17++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var50.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - var12 * (var5_int * 4);
                            var29 = new rb(var51);
                            var14_int = 0;
                            var15_int = 0;
                            var29.field_g = var11;
                            var16 = 0;
                            L20: while (true) {
                              if (var12 <= var16) {
                                if (var14_int == 0) {
                                  stackOut_65_0 = 1;
                                  stackIn_66_0 = stackOut_65_0;
                                  return stackIn_66_0 != 0;
                                } else {
                                  var52 = new byte[var14_int];
                                  var29.field_g = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L21: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15_int] = (Object) (Object) var52;
                                      break L11;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L22: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L21;
                                        } else {
                                          L23: {
                                            var19 = var19 + var29.a((byte) 118);
                                            if (var6 == null) {
                                              var21 = var20;
                                              break L23;
                                            } else {
                                              var21 = var48[var20];
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (var21 == param0) {
                                              au.a(var51, var17, var52, var14_int, var19);
                                              var14_int = var14_int + var19;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var17 = var17 + var19;
                                          var20++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var17 = 0;
                                var18 = 0;
                                L25: while (true) {
                                  if (var18 >= var5_int) {
                                    var16++;
                                    continue L20;
                                  } else {
                                    L26: {
                                      var17 = var17 + var29.a((byte) 115);
                                      if (var6 != null) {
                                        var19 = var48[var18];
                                        break L26;
                                      } else {
                                        var19 = var18;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      if (param0 == var19) {
                                        var14_int = var14_int + var17;
                                        var15_int = var19;
                                        break L27;
                                      } else {
                                        break L27;
                                      }
                                    }
                                    var18++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L28: {
                            if (var6 != null) {
                              var11 = var48[0];
                              break L28;
                            } else {
                              var11 = 0;
                              break L28;
                            }
                          }
                          if (((gk) this).field_b != 0) {
                            var7[var11] = (Object) (Object) var51;
                            break L11;
                          } else {
                            var7[var11] = sf.a(false, -137, var50);
                            return true;
                          }
                        }
                      }
                      stackOut_104_0 = 1;
                      stackIn_105_0 = stackOut_104_0;
                      break L0;
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0 != 0;
                    }
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
          L29: {
            var5 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) var5;
            stackOut_106_1 = new StringBuilder().append("gk.F(").append(param0).append(44);
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param1 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L29;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L29;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_109_0, stackIn_109_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_105_0 != 0;
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((gk) this).b((byte) 100)) {
            return null;
        }
        if (!(1 != ((gk) this).field_e.field_j.length)) {
            return ((gk) this).a(0, -10470, param0);
        }
        if (!this.a(param0, (byte) 42)) {
            return null;
        }
        if (!(param1 != ~((gk) this).field_e.field_j[param0])) {
            return ((gk) this).a(param0, param1 ^ 10468, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
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
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((gk) this).b((byte) 114)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
              if (this.a(var4_int, (byte) 42)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((gk) this).field_e.field_r[var4_int].a(param1, bg.a(var7, (byte) 120));
                stackOut_6_0 = ((gk) this).a(var5, (byte) 40, var4_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
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
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("gk.U(");
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -10470) {
            return null;
        }
        int discarded$0 = -53;
        return this.a((int[]) null, param2, param0);
    }

    final int a(int param0, int param1, String param2) {
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
            if (!this.a(param1, (byte) 42)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 < -26) {
                  break L1;
                } else {
                  ((int[]) ((gk) this).field_a[2])[0] = -26;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var5 = (CharSequence) (Object) param2;
              var4_int = ((gk) this).field_e.field_r[param1].a(false, bg.a(var5, (byte) 120));
              if (!this.b(param1, 91, var4_int)) {
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
            stackOut_10_1 = new StringBuilder().append("gk.M(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    gk(ip param0, boolean param1, int param2) {
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
        ((gk) this).field_e = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((gk) this).field_h = param0;
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
                  ((gk) this).field_f = stackIn_7_1 != 0;
                  ((gk) this).field_b = param2;
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
            stackOut_9_1 = new StringBuilder().append("gk.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean c(String param0, int param1) {
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
            if (!((gk) this).b((byte) 106)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == -14012) {
                var4 = (CharSequence) (Object) param0;
                var3_int = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
                stackOut_7_0 = ((gk) this).c(var3_int, 0);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
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
            stackOut_9_1 = new StringBuilder().append("gk.H(");
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
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new nf();
        field_c = "Loading sound effects";
    }
}
