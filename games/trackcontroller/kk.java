/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private pc field_b;
    private wi field_c;
    private Object[] field_d;
    private int field_i;
    private boolean field_e;
    private Object[][] field_f;
    static String field_a;
    static int field_h;
    static int[] field_g;

    private final synchronized byte[] a(int[] param0, boolean param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
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
            if (this.a(param1, param3, param2)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((kk) this).field_f[param3] == null) {
                    break L2;
                  } else {
                    if (((kk) this).field_f[param3][param2] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(4, param3, param2, param0)) {
                  break L1;
                } else {
                  this.d(118, param3);
                  if (this.a(4, param3, param2, param0)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (((kk) this).field_f[param3] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null == ((kk) this).field_f[param3][param2]) {
                    break L3;
                  } else {
                    var7 = me.a(false, 22692, ((kk) this).field_f[param3][param2]);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    L5: {
                      if (((kk) this).field_i != 1) {
                        break L5;
                      } else {
                        ((kk) this).field_f[param3][param2] = null;
                        if (((kk) this).field_b.field_a[param3] != 1) {
                          break L4;
                        } else {
                          ((kk) this).field_f[param3] = null;
                          if (!TrackController.field_F) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (2 == ((kk) this).field_i) {
                      ((kk) this).field_f[param3] = null;
                      break L4;
                    } else {
                      break L4;
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
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("kk.L(");
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
              break L6;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        if (((kk) this).c(-69)) {
          var2 = 1;
          if (param0 == 48) {
            var3 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (((kk) this).field_b.field_f.length <= var3) {
                    break L2;
                  } else {
                    stackOut_6_0 = ((kk) this).field_b.field_f[var3];
                    stackIn_13_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_7_0;
                        if (null == ((kk) this).field_d[var4]) {
                          this.d(127, var4);
                          if (((kk) this).field_d[var4] != null) {
                            break L3;
                          } else {
                            var2 = 0;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              return stackIn_13_0 != 0;
            }
          } else {
            return ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[6];
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1) {
        if (param0 != -40) {
            byte[] discarded$0 = ((kk) this).b(-100, ((int[]) ((kk) this).field_d[2])[0]);
        }
        if (!this.c(71, param1)) {
            return false;
        }
        if (null != ((kk) this).field_d[param1]) {
            return true;
        }
        this.d(param0 + -80, param1);
        if (null != ((kk) this).field_d[param1]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((kk) this).c(-101)) {
            return null;
        }
        if (!(1 != ((kk) this).field_b.field_a.length)) {
            return ((kk) this).a(0, param0, (byte) -39);
        }
        if (!this.c(-116, param0)) {
            return null;
        }
        if (param1 != 20095) {
            return null;
        }
        if (((kk) this).field_b.field_a[param0] == 1) {
            return ((kk) this).a(param0, 0, (byte) -82);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 >= -21) {
            field_a = (String) ((kk) this).field_d[13];
        }
        return this.a((int[]) null, true, param1, param0);
    }

    final int b(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        if (!(((kk) this).c(-23))) {
            return -1;
        }
        return ((kk) this).field_b.field_a.length;
    }

    final int a(String param0, int param1, int param2) {
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
            if (!this.c(param2 ^ 66, param1)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  ((kk) this).field_d[6] = null;
                  break L1;
                }
              }
              var5 = (CharSequence) (Object) param0;
              var4_int = ((kk) this).field_b.field_e[param1].a(hk.a(var5, 0), param2 ^ 26555);
              if (!this.a(true, param1, var4_int)) {
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
            stackOut_10_1 = new StringBuilder().append("kk.S(");
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
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        if (!((kk) this).c(100)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            var3 = 0;
            if (param0) {
              break L0;
            } else {
              field_a = (String) ((kk) this).field_d[2];
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (~((kk) this).field_d.length >= ~var4) {
                  break L3;
                } else {
                  stackOut_7_0 = -1;
                  stackOut_7_1 = ~((kk) this).field_b.field_l[var4];
                  stackIn_13_0 = stackOut_7_0;
                  stackIn_13_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_8_0 > stackIn_8_1) {
                        var2 += 100;
                        var3 = var3 + ((kk) this).a(var4, -24214);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = -1;
              stackOut_12_1 = ~var2;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L2;
            }
            if (stackIn_13_0 == stackIn_13_1) {
              return 100;
            } else {
              var4 = 100 * var3 / var2;
              return var4;
            }
          }
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
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
            if (((kk) this).c(102)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                if (param2 == -45) {
                  break L1;
                } else {
                  ((long[]) ((kk) this).field_d[16])[11] = -121L;
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param0;
              var4_int = ((kk) this).field_b.field_q.a(hk.a(var6, 0), param2 + -26511);
              if (!this.c(param2 ^ -110, var4_int)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((kk) this).field_b.field_e[var4_int].a(hk.a(var7, param2 + 45), param2 + -26511);
                stackOut_9_0 = ((kk) this).a(var4_int, var5, param2 ^ 44);
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
            stackOut_11_1 = new StringBuilder().append("kk.B(");
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
          throw sl.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
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
            if (((kk) this).c(119)) {
              L1: {
                if (param1 == -3) {
                  break L1;
                } else {
                  byte[] discarded$2 = this.a((int[]) ((Object[]) ((kk) this).field_d[43])[6], ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[2], -64, -39);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((kk) this).field_b.field_q.a(hk.a(var4, 0), -26556);
              stackOut_5_0 = ((kk) this).a((byte) -40, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kk.N(");
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
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean b(byte param0) {
        return vg.field_o;
    }

    final int a(int param0, byte param1) {
        if (!(this.c(67, param0))) {
            return 0;
        }
        if (param1 != -91) {
            return 56;
        }
        return ((kk) this).field_b.field_a[param0];
    }

    final int a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (((kk) this).c(92)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  int discarded$2 = ((kk) this).a(true, (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((kk) this).field_b.field_q.a(hk.a(var4, 0), -26556);
              if (this.c(74, var3_int)) {
                stackOut_8_0 = var3_int;
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
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kk.C(").append(param0).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!(this.a(true, param0, param1))) {
            return false;
        }
        if (null != ((kk) this).field_f[param0]) {
            if (!(((kk) this).field_f[param0][param1] == null)) {
                return true;
            }
        }
        if (param2 != -1) {
            ((byte[]) ((kk) this).field_d[6])[2] = ((byte[]) ((kk) this).field_d[9])[0];
        }
        if (!(null == ((kk) this).field_d[param0])) {
            return true;
        }
        this.d(73, param0);
        if (((kk) this).field_d[param0] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!((kk) this).c(-115)) {
          return false;
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if (~((kk) this).field_b.field_a.length >= ~param1) {
                  break L0;
                } else {
                  if (param2 < ((kk) this).field_b.field_a[param1]) {
                    if (param0) {
                      return true;
                    } else {
                      ((kk) this).field_b = null;
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!sk.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param2);
          }
        }
    }

    public static void a(int param0) {
    }

    private final synchronized void d(int param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = 83 / ((param0 - 2) / 61);
            if (!((kk) this).field_e) {
              break L1;
            } else {
              ((kk) this).field_d[param1] = (Object) (Object) ((kk) this).field_c.a(-1, param1);
              if (!TrackController.field_F) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((kk) this).field_d[param1] = qk.a(((kk) this).field_c.a(-1, param1), false, (byte) -88);
          break L0;
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != -24214) {
            return 22;
        }
        if (!this.c(-42, param0)) {
            return 0;
        }
        if (!(null == ((kk) this).field_d[param0])) {
            return 100;
        }
        return ((kk) this).field_c.b(param0, param1 ^ 2972);
    }

    private final synchronized boolean c(int param0, int param1) {
        int var3 = 0;
        if (((kk) this).c(-79)) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param1 >= ((kk) this).field_b.field_a.length) {
                break L0;
              } else {
                if (((kk) this).field_b.field_a[param1] == 0) {
                  break L0;
                } else {
                  var3 = 91 % ((13 - param0) / 52);
                  return true;
                }
              }
            }
          }
          if (!sk.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
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
        Object stackOut_1_0 = null;
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
            if (((kk) this).c(-79)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((kk) this).field_b.field_q.a(hk.a(var6, param1 ^ param1), param1 + -26555);
              if (this.c(93, var4_int)) {
                var7 = (CharSequence) (Object) param2;
                var5 = ((kk) this).field_b.field_e[var4_int].a(hk.a(var7, 0), -26556);
                stackOut_6_0 = ((kk) this).a(var4_int, var5, (byte) -64);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
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
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("kk.E(");
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
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final boolean a(String param0, byte param1) {
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
            if (!((kk) this).c(110)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((kk) this).field_b.field_q.a(hk.a(var4, 0), -26556);
                if (param1 <= -85) {
                  break L1;
                } else {
                  ((kk) this).field_b = null;
                  break L1;
                }
              }
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
            stackOut_11_1 = new StringBuilder().append("kk.W(");
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
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean c(int param0) {
        int var2 = 122 % ((param0 - 33) / 55);
        if (null == ((kk) this).field_b) {
            ((kk) this).field_b = ((kk) this).field_c.a(9);
            if (!(((kk) this).field_b != null)) {
                return false;
            }
            ((kk) this).field_d = new Object[((kk) this).field_b.field_n];
            ((kk) this).field_f = new Object[((kk) this).field_b.field_n][];
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        be var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        be var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_25_0 = 0;
        int[] stackIn_31_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_127_0 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_14_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var22 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (this.c(90, param1)) {
              if (null != ((kk) this).field_d[param1]) {
                var5_int = ((kk) this).field_b.field_l[param1];
                var6 = ((kk) this).field_b.field_r[param1];
                if (param0 == 4) {
                  L1: {
                    if (((kk) this).field_f[param1] != null) {
                      break L1;
                    } else {
                      ((kk) this).field_f[param1] = new Object[((kk) this).field_b.field_a[param1]];
                      break L1;
                    }
                  }
                  var7 = ((kk) this).field_f[param1];
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              if (var9_int >= var5_int) {
                                break L7;
                              } else {
                                stackOut_14_0 = (int[]) var6;
                                stackIn_31_0 = stackOut_14_0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var22 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    L9: {
                                      if (stackIn_15_0 != null) {
                                        break L9;
                                      } else {
                                        var10_int = var9_int;
                                        if (var22 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var10_int = var6[var9_int];
                                    break L8;
                                  }
                                  L10: {
                                    if (null == var7[var10_int]) {
                                      var8 = 0;
                                      if (var22 == 0) {
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var9_int++;
                                  if (var22 == 0) {
                                    continue L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            if (var8 == 0) {
                              if (param3 == null) {
                                break L4;
                              } else {
                                if (param3[0] != 0) {
                                  break L5;
                                } else {
                                  if (param3[1] != 0) {
                                    break L5;
                                  } else {
                                    if (param3[2] != 0) {
                                      break L5;
                                    } else {
                                      stackOut_30_0 = (int[]) param3;
                                      stackIn_31_0 = stackOut_30_0;
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              stackOut_24_0 = 1;
                              stackIn_25_0 = stackOut_24_0;
                              return stackIn_25_0 != 0;
                            }
                          }
                          if (stackIn_31_0[3] == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        var9_array = me.a(true, 22692, ((kk) this).field_d[param1]);
                        var10 = new be(var9_array);
                        var10.a(5, param3, var10.field_j.length, false);
                        break L3;
                      }
                      var9_array = me.a(false, param0 ^ 22688, ((kk) this).field_d[param1]);
                      break L3;
                    }
                    try {
                      L11: {
                        var23 = al.a(-127, var9_array);
                        var10_array = var23;
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_36_1 = new StringBuilder();
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param3 == null) {
                          stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                          stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                          stackOut_38_2 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L12;
                        } else {
                          stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                          stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                          stackOut_37_2 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L12;
                        }
                      }
                      throw sl.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param1 + " " + param3.length + " " + ql.a(0, var9_array, param3.length) + " " + ql.a(param0 ^ 4, var9_array, -2 + param3.length) + " " + ((kk) this).field_b.field_b[param1] + " " + ((kk) this).field_b.field_p);
                    }
                    L13: {
                      if (((kk) this).field_e) {
                        ((kk) this).field_d[param1] = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (1 >= var5_int) {
                            break L16;
                          } else {
                            L17: {
                              if (((kk) this).field_i != 2) {
                                break L17;
                              } else {
                                var11 = var23.length;
                                var11--;
                                var12 = 255 & var23[var11];
                                var11 = var11 - 4 * (var12 * var5_int);
                                var13 = new be(var10_array);
                                var14_int = 0;
                                var13.field_k = var11;
                                var15_int = 0;
                                var16 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var16 >= var12) {
                                        break L20;
                                      } else {
                                        var17 = 0;
                                        stackOut_47_0 = 0;
                                        stackIn_60_0 = stackOut_47_0;
                                        stackIn_48_0 = stackOut_47_0;
                                        if (var22 != 0) {
                                          break L19;
                                        } else {
                                          var18 = stackIn_48_0;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (var5_int <= var18) {
                                                  break L23;
                                                } else {
                                                  var17 = var17 + var13.e((byte) 113);
                                                  if (var22 != 0) {
                                                    break L22;
                                                  } else {
                                                    L24: {
                                                      L25: {
                                                        if (var6 == null) {
                                                          break L25;
                                                        } else {
                                                          var19 = var6[var18];
                                                          if (var22 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      var19 = var18;
                                                      break L24;
                                                    }
                                                    L26: {
                                                      if (var19 != param2) {
                                                        break L26;
                                                      } else {
                                                        var14_int = var14_int + var17;
                                                        var15_int = var19;
                                                        break L26;
                                                      }
                                                    }
                                                    var18++;
                                                    if (var22 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                              var16++;
                                              break L22;
                                            }
                                            if (var22 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_59_0 = var14_int;
                                    stackIn_60_0 = stackOut_59_0;
                                    break L19;
                                  }
                                  if (stackIn_60_0 == 0) {
                                    stackOut_62_0 = 1;
                                    stackIn_63_0 = stackOut_62_0;
                                    return stackIn_63_0 != 0;
                                  } else {
                                    var16_ref_byte__ = new byte[var14_int];
                                    var14_int = 0;
                                    var13.field_k = var11;
                                    var17 = 0;
                                    var18 = 0;
                                    L27: while (true) {
                                      L28: {
                                        if (var18 >= var12) {
                                          break L28;
                                        } else {
                                          var19 = 0;
                                          stackOut_66_0 = 0;
                                          stackIn_127_0 = stackOut_66_0;
                                          stackIn_67_0 = stackOut_66_0;
                                          if (var22 != 0) {
                                            break L14;
                                          } else {
                                            var20 = stackIn_67_0;
                                            L29: while (true) {
                                              L30: {
                                                L31: {
                                                  if (~var5_int >= ~var20) {
                                                    break L31;
                                                  } else {
                                                    var19 = var19 + var13.e((byte) 113);
                                                    if (var22 != 0) {
                                                      break L30;
                                                    } else {
                                                      L32: {
                                                        L33: {
                                                          if (var6 == null) {
                                                            break L33;
                                                          } else {
                                                            var21 = var6[var20];
                                                            if (var22 == 0) {
                                                              break L32;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        var21 = var20;
                                                        break L32;
                                                      }
                                                      L34: {
                                                        if (param2 != var21) {
                                                          break L34;
                                                        } else {
                                                          pd.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                                          var14_int = var14_int + var19;
                                                          break L34;
                                                        }
                                                      }
                                                      var17 = var17 + var19;
                                                      var20++;
                                                      if (var22 == 0) {
                                                        continue L29;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                }
                                                var18++;
                                                break L30;
                                              }
                                              if (var22 == 0) {
                                                continue L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var23.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - 4 * var5_int * var12;
                            var13 = new be(var10_array);
                            var13.field_k = var11;
                            var14 = new int[var5_int];
                            var15_int = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (var15_int >= var12) {
                                    break L37;
                                  } else {
                                    var16 = 0;
                                    stackOut_81_0 = 0;
                                    stackIn_90_0 = stackOut_81_0;
                                    stackIn_82_0 = stackOut_81_0;
                                    if (var22 != 0) {
                                      break L36;
                                    } else {
                                      var17 = stackIn_82_0;
                                      L38: while (true) {
                                        L39: {
                                          L40: {
                                            if (~var17 <= ~var5_int) {
                                              break L40;
                                            } else {
                                              var16 = var16 + var13.e((byte) 113);
                                              var14[var17] = var14[var17] + var16;
                                              var17++;
                                              if (var22 != 0) {
                                                break L39;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L38;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                          }
                                          var15_int++;
                                          break L39;
                                        }
                                        if (var22 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_89_0 = var5_int;
                                stackIn_90_0 = stackOut_89_0;
                                break L36;
                              }
                              var15 = new byte[stackIn_90_0][];
                              var16 = 0;
                              L41: while (true) {
                                L42: {
                                  L43: {
                                    if (var5_int <= var16) {
                                      break L43;
                                    } else {
                                      var15[var16] = new byte[var14[var16]];
                                      var14[var16] = 0;
                                      var16++;
                                      if (var22 != 0) {
                                        break L42;
                                      } else {
                                        if (var22 == 0) {
                                          continue L41;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                  var13.field_k = var11;
                                  var16 = 0;
                                  break L42;
                                }
                                var17 = 0;
                                L44: while (true) {
                                  L45: {
                                    L46: {
                                      if (~var17 <= ~var12) {
                                        break L46;
                                      } else {
                                        var18 = 0;
                                        stackOut_98_0 = 0;
                                        stackIn_107_0 = stackOut_98_0;
                                        stackIn_99_0 = stackOut_98_0;
                                        if (var22 != 0) {
                                          break L45;
                                        } else {
                                          var19 = stackIn_99_0;
                                          L47: while (true) {
                                            L48: {
                                              L49: {
                                                if (var19 >= var5_int) {
                                                  break L49;
                                                } else {
                                                  var18 = var18 + var13.e((byte) 113);
                                                  pd.a(var23, var16, var15[var19], var14[var19], var18);
                                                  var14[var19] = var14[var19] + var18;
                                                  var16 = var16 + var18;
                                                  var19++;
                                                  if (var22 != 0) {
                                                    break L48;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L47;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                              var17++;
                                              break L48;
                                            }
                                            if (var22 == 0) {
                                              continue L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_106_0 = 0;
                                    stackIn_107_0 = stackOut_106_0;
                                    break L45;
                                  }
                                  var17 = stackIn_107_0;
                                  L50: while (true) {
                                    L51: {
                                      if (~var17 <= ~var5_int) {
                                        break L51;
                                      } else {
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          L52: {
                                            L53: {
                                              if (var6 != null) {
                                                break L53;
                                              } else {
                                                var18 = var17;
                                                if (var22 == 0) {
                                                  break L52;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            var18 = var6[var17];
                                            break L52;
                                          }
                                          L54: {
                                            L55: {
                                              if (((kk) this).field_i == 0) {
                                                break L55;
                                              } else {
                                                var7[var18] = (Object) (Object) var15[var17];
                                                if (var22 == 0) {
                                                  break L54;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                            var7[var18] = qk.a(var15[var17], false, (byte) -19);
                                            break L54;
                                          }
                                          var17++;
                                          if (var22 == 0) {
                                            continue L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L56: {
                          L57: {
                            if (var6 == null) {
                              break L57;
                            } else {
                              var11 = var6[0];
                              if (var22 == 0) {
                                break L56;
                              } else {
                                break L57;
                              }
                            }
                          }
                          var11 = 0;
                          break L56;
                        }
                        L58: {
                          if (((kk) this).field_i == 0) {
                            break L58;
                          } else {
                            var7[var11] = (Object) (Object) var23;
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var7[var11] = qk.a(var23, false, (byte) 8);
                        return true;
                      }
                      stackOut_126_0 = 1;
                      stackIn_127_0 = stackOut_126_0;
                      break L14;
                    }
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) var5;
            stackOut_128_1 = new StringBuilder().append("kk.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_130_0 = stackOut_128_0;
            stackIn_130_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param3 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L59;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_131_0 = stackOut_129_0;
              stackIn_131_1 = stackOut_129_1;
              stackIn_131_2 = stackOut_129_2;
              break L59;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_131_0, stackIn_131_2 + 41);
        }
        return stackIn_127_0 != 0;
    }

    final int a(String param0, int param1) {
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
            if (((kk) this).c(-82)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((kk) this).field_b.field_q.a(hk.a(var4, param1), -26556);
              stackOut_3_0 = ((kk) this).a(var3_int, -24214);
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
            stackOut_5_1 = new StringBuilder().append("kk.G(");
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
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    kk(wi param0, boolean param1, int param2) {
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
        ((kk) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((kk) this).field_i = param2;
                    ((kk) this).field_c = param0;
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
                  ((kk) this).field_e = stackIn_7_1 != 0;
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
            stackOut_9_1 = new StringBuilder().append("kk.<init>(");
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
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You are unable to access this level yet.";
        field_g = new int[4];
    }
}
