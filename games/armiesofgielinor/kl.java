/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private ew field_g;
    private jm field_j;
    int field_e;
    boolean field_b;
    static sa field_k;
    private Object[] field_h;
    static String field_d;
    static String field_f;
    static v field_a;
    static volatile int field_i;

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (this.a((byte) 82)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_h.length) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (this.field_j.field_p[var4] > 0) {
                var3 = var3 + this.b(var4, (byte) 73);
                var2 += 100;
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

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        Object var5 = null;
        String var7 = null;
        byte[] var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (this.b(param3, 0, param2)) {
              L1: {
                if (param1 >= 113) {
                  break L1;
                } else {
                  var7 = (String) null;
                  discarded$1 = this.a(((byte[]) (this.field_h[1]))[1], (String) null);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_c[param3]) {
                    break L3;
                  } else {
                    if (this.field_c[param3][param2] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param2, 0, param0, param3)) {
                  break L2;
                } else {
                  this.a(true, param3);
                  if (this.a(param2, 0, param0, param3)) {
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (null != this.field_c[param3]) {
                L4: {
                  if (null != this.field_c[param3][param2]) {
                    var8 = ko.a(false, 80, this.field_c[param3][param2]);
                    var5 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != null) {
                    L6: {
                      if (this.field_e == 1) {
                        break L6;
                      } else {
                        if (this.field_e == 2) {
                          this.field_c[param3] = null;
                          if (!ArmiesOfGielinor.field_M) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_c[param3][param2] = null;
                    if (this.field_j.field_h[param3] == 1) {
                      this.field_c[param3] = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_28_0 = var5;
                stackIn_29_0 = stackOut_28_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = var5;
            stackOut_30_1 = new StringBuilder().append("kl.T(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_11_0);
          } else {
            return (byte[]) ((Object) stackIn_29_0);
          }
        }
    }

    final boolean a(int param0, String param1) {
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
        int decompiledRegionSelector0 = 0;
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
            if (this.a((byte) 82)) {
              L1: {
                if (param0 == 28979) {
                  break L1;
                } else {
                  field_a = (v) (this.field_h[6]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
              stackOut_5_0 = this.a(param0 + -17085, var3_int);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("kl.N(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_9_0 = false;
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
            if (!this.a((byte) 82)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_j.field_l.a(rs.a((byte) -116, var6), 1);
              if (!this.c(var4_int, -24876)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 <= -51) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_j.field_f[var4_int].a(rs.a((byte) -116, var7), 1);
                  stackOut_11_0 = this.a(var4_int, var5, 0);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = ((boolean[]) (this.field_h[13]))[11];
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("kl.W(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final synchronized byte[] c(int param0, byte param1) {
        boolean discarded$0 = false;
        if (!this.a((byte) 82)) {
            return null;
        }
        if (param1 != 81) {
            discarded$0 = this.a(21, 79);
        }
        if (!(this.field_j.field_h.length != 1)) {
            return this.a((byte) 99, param0, 0);
        }
        if (!this.c(param0, param1 ^ -24955)) {
            return null;
        }
        if (!(1 != this.field_j.field_h[param0])) {
            return this.a((byte) 94, 0, param0);
        }
        throw new RuntimeException();
    }

    final int e(int param0) {
        if (!(this.a((byte) 82))) {
            return -1;
        }
        if (param0 >= -96) {
            kl.b(52);
        }
        return this.field_j.field_h.length;
    }

    final synchronized int[] b(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_12_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_11_0 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 <= -24) {
            break L0;
          } else {
            ((int[]) (this.field_h[0]))[43] = ((int[]) (((Object[]) (((Object[]) (this.field_h[0]))[13]))[2]))[6];
            break L0;
          }
        }
        if (this.c(param1, -24876)) {
          L1: {
            L2: {
              var3 = this.field_j.field_a[param1];
              if (var3 == null) {
                var6 = new int[this.field_j.field_p[param1]];
                var3 = var6;
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var6.length) {
                    break L2;
                  } else {
                    stackOut_8_0 = (int[]) (var6);
                    stackIn_12_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      stackIn_9_0[var4] = var4;
                      var4++;
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_11_0 = (int[]) (var3);
            stackIn_12_0 = stackOut_11_0;
            break L1;
          }
          return stackIn_12_0;
        } else {
          return null;
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.a((byte) 82))) {
            return false;
        }
        if (param1 != 0) {
            this.field_e = -128;
        }
        if ((param0 ^ -1) <= -1) {
            if (-1 >= (param2 ^ -1)) {
                if (this.field_j.field_h.length > param0) {
                    if (this.field_j.field_h[param0] > param2) {
                        return true;
                    }
                }
            }
        }
        if (wh.field_f) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = -33 % ((param1 - 33) / 62);
        if (2 > param2) {
            if (5 > param0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (!this.a((byte) 82)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 >= 89) {
                  break L1;
                } else {
                  field_f = (String) (((Object[]) (this.field_h[9]))[6]);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
              if (!this.c(var3_int, -24876)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("kl.O(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.c(param1, param0 + -36770)) {
            return false;
        }
        if (this.field_h[param1] != null) {
            return true;
        }
        if (param0 != 11894) {
            field_d = (String) (((Object[]) (((Object[]) (this.field_h[8]))[7]))[5]);
        }
        this.a(true, param1);
        if (this.field_h[param1] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param0, param2, param1)) {
            return false;
        }
        if (null != this.field_c[param0]) {
            if (this.field_c[param0][param1] != null) {
                return true;
            }
        }
        if (null != this.field_h[param0]) {
            return true;
        }
        this.a(true, param0);
        if (null != this.field_h[param0]) {
            return true;
        }
        return false;
    }

    final synchronized boolean d(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.a((byte) 82)) {
          L0: {
            var2 = 1;
            if (param0 == -27927) {
              break L0;
            } else {
              discarded$2 = kl.c(((int[]) (this.field_h[1]))[2], 24, 50);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_j.field_q.length <= var3) {
                  break L3;
                } else {
                  stackOut_6_0 = this.field_j.field_q[var3];
                  stackIn_13_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      var4 = stackIn_7_0;
                      if (this.field_h[var4] == null) {
                        this.a(true, var4);
                        if (null != this.field_h[var4]) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = var2;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            return stackIn_13_0 != 0;
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean c(int param0, int param1) {
        if (param1 != -24876) {
            return true;
        }
        if (!this.a((byte) 82)) {
            return false;
        }
        if ((param0 ^ -1) <= -1) {
            if (param0 < this.field_j.field_h.length) {
                if (this.field_j.field_h[param0] != 0) {
                    return true;
                }
            }
        }
        if (!wh.field_f) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final synchronized boolean a(byte param0) {
        int discarded$0 = 0;
        if (param0 != 82) {
            discarded$0 = this.a(-110);
        }
        if (null != this.field_j) {
            return true;
        }
        this.field_j = this.field_g.a(param0 ^ 20097);
        if (!(null != this.field_j)) {
            return false;
        }
        this.field_c = new Object[this.field_j.field_i][];
        this.field_h = new Object[this.field_j.field_i];
        return true;
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!this.a((byte) 82)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              if (param0 <= -127) {
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_j.field_l.a(rs.a((byte) -116, var4), 1);
                if (0 <= var3_int) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("kl.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final int a(byte param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
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
            var4_int = -107 % ((76 - param0) / 40);
            if (!this.c(param1, -24876)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var5 = this.field_j.field_f[param1].a(rs.a((byte) -116, var6), 1);
              if (this.b(param1, 0, var5)) {
                stackOut_7_0 = var5;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("kl.H(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        try {
          L0: {
            L1: {
              var1_int = sm.field_d;
              var2 = ko.field_b;
              if (param0 == -20193) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (tr.field_A ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_5_0;
              if (ro.field_ub != 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var4 = stackIn_8_0;
            st.field_z.a(87, var4 != 0, var3 != 0, var1_int, var2, el.field_d);
            L4: while (true) {
              if (!jd.i((byte) -61)) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L5: {
                  if (13 != rs.field_q) {
                    break L5;
                  } else {
                    bv.a(true, 0, param0 + 20194, jt.field_a);
                    break L5;
                  }
                }
                L6: {
                  if (12 == rs.field_q) {
                    L7: {
                      if (ln.field_e) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L7;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L7;
                      }
                    }
                    ln.field_e = stackIn_17_0 != 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (rs.field_q != 11) {
                  continue L4;
                } else {
                  if (hi.field_j >= 2) {
                    L8: {
                      if (jv.field_a) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L8;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L8;
                      }
                    }
                    jv.field_a = stackIn_24_0 != 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "kl.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
            if (this.a((byte) 82)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = 119 % ((param1 - -36) / 44);
              var7 = (CharSequence) ((Object) param2);
              var5 = this.field_j.field_l.a(rs.a((byte) -116, var7), 1);
              if (this.c(var5, -24876)) {
                var8 = (CharSequence) ((Object) param0);
                var6 = this.field_j.field_f[var5].a(rs.a((byte) -116, var8), 1);
                stackOut_6_0 = this.a((byte) 119, var6, var5);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("kl.DA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.a((byte) 82)) {
            return false;
        }
        if (param1 != -56) {
            field_d = (String) null;
        }
        if (1 == this.field_j.field_h.length) {
            return this.a(0, param0, 0);
        }
        if (!this.c(param0, param1 ^ 24860)) {
            return false;
        }
        if (!(-2 != (this.field_j.field_h[param0] ^ -1))) {
            return this.a(param0, 0, param1 + 56);
        }
        throw new RuntimeException();
    }

    final int d(int param0, int param1) {
        if (param1 != -2) {
            return -27;
        }
        if (!this.c(param0, -24876)) {
            return 0;
        }
        return this.field_j.field_h[param0];
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 <= 42) {
            return (byte[]) null;
        }
        return this.a((int[]) null, 116, param1, param2);
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
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
        vh var26 = null;
        byte[] var27 = null;
        vh var29 = null;
        vh var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.c(param3, -24876)) {
              if (null == this.field_h[param3]) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_j.field_p[param3];
                  var34 = this.field_j.field_a[param3];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_c[param3] != null) {
                    break L1;
                  } else {
                    array$2 = new Object[this.field_j.field_h[param3]];
                    this.field_c[param3] = array$2;
                    break L1;
                  }
                }
                var7 = this.field_c[param3];
                var8 = 1;
                var9_int = param1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5_int <= var9_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (var6 == null) {
                                break L6;
                              } else {
                                var10 = var34[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10 = var9_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var10] != null) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var9_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L3;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                  L8: {
                    L9: {
                      if (param2 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (param2[0] != 0) {
                            break L10;
                          } else {
                            if (0 != param2[1]) {
                              break L10;
                            } else {
                              if (param2[2] != 0) {
                                break L10;
                              } else {
                                if (param2[3] != 0) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var35 = ko.a(true, 42, this.field_h[param3]);
                        var25 = var35;
                        var9_array = var25;
                        var26 = new vh(var35);
                        var26.a(param2, var26.field_o.length, 5, -12366);
                        break L8;
                      }
                    }
                    var9_array = ko.a(false, 87, this.field_h[param3]);
                    break L8;
                  }
                  try {
                    L11: {
                      var36 = el.a(false, var9_array);
                      var27 = var36;
                      var23 = var27;
                      var43 = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_33_0 = (RuntimeException) (var11_ref_RuntimeException);
                      stackOut_33_1 = new StringBuilder();
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (param2 == null) {
                        stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackOut_35_2 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        stackIn_36_2 = stackOut_35_2;
                        break L12;
                      } else {
                        stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
                        stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
                        stackOut_34_2 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_36_2 = stackOut_34_2;
                        break L12;
                      }
                    }
                    throw ig.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param3 + " " + param2.length + " " + pk.a(var9_array, param2.length, 113) + " " + pk.a(var9_array, -2 + param2.length, 115) + " " + this.field_j.field_e[param3] + " " + this.field_j.field_s);
                  }
                  L13: {
                    if (this.field_b) {
                      this.field_h[param3] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (-2 > (var5_int ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (var6 == null) {
                                break L18;
                              } else {
                                var11 = var34[0];
                                if (var22 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var11 = 0;
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (-1 == (this.field_e ^ -1)) {
                                break L20;
                              } else {
                                var7[var11] = var36;
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = pf.a(0, var36, false);
                            break L19;
                          }
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (-3 != (this.field_e ^ -1)) {
                          break L21;
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var12 * var5_int * 4;
                          var29 = new vh(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_q = var11;
                          var16 = 0;
                          L22: while (true) {
                            L23: {
                              if (var16 >= var12) {
                                stackOut_65_0 = 0;
                                stackIn_66_0 = stackOut_65_0;
                                break L23;
                              } else {
                                var17 = 0;
                                stackOut_52_0 = 0;
                                stackIn_66_0 = stackOut_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                if (var22 != 0) {
                                  break L23;
                                } else {
                                  var18 = stackIn_53_0;
                                  L24: while (true) {
                                    L25: {
                                      if (var18 >= var5_int) {
                                        var16++;
                                        break L25;
                                      } else {
                                        var17 = var17 + var29.i(1);
                                        if (var22 != 0) {
                                          break L25;
                                        } else {
                                          L26: {
                                            L27: {
                                              if (var6 != null) {
                                                break L27;
                                              } else {
                                                var19 = var18;
                                                if (var22 == 0) {
                                                  break L26;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                            var19 = var34[var18];
                                            break L26;
                                          }
                                          L28: {
                                            if (param0 == var19) {
                                              var14_int = var14_int + var17;
                                              var15_int = var19;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var18++;
                                          continue L24;
                                        }
                                      }
                                    }
                                    continue L22;
                                  }
                                }
                              }
                            }
                            if (stackIn_66_0 == var14_int) {
                              stackOut_68_0 = 1;
                              stackIn_69_0 = stackOut_68_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var44 = new byte[var14_int];
                              var29.field_q = var11;
                              var14_int = 0;
                              var17 = 0;
                              var18 = 0;
                              L29: while (true) {
                                if (var18 >= var12) {
                                  var7[var15_int] = var44;
                                  if (var22 == 0) {
                                    break L15;
                                  } else {
                                    break L21;
                                  }
                                } else {
                                  var19 = 0;
                                  stackOut_72_0 = 0;
                                  stackIn_125_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var22 != 0) {
                                    break L14;
                                  } else {
                                    var20 = stackIn_73_0;
                                    L30: while (true) {
                                      L31: {
                                        if (var5_int <= var20) {
                                          var18++;
                                          break L31;
                                        } else {
                                          var19 = var19 + var29.i(param1 ^ 1);
                                          if (var22 != 0) {
                                            break L31;
                                          } else {
                                            L32: {
                                              L33: {
                                                if (var6 != null) {
                                                  break L33;
                                                } else {
                                                  var21 = var20;
                                                  if (var22 == 0) {
                                                    break L32;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                              var21 = var34[var20];
                                              break L32;
                                            }
                                            L34: {
                                              if (var21 == param0) {
                                                vm.a(var43, var17, var44, var14_int, var19);
                                                var14_int = var14_int + var19;
                                                break L34;
                                              } else {
                                                break L34;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            continue L30;
                                          }
                                        }
                                      }
                                      continue L29;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var36.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5_int);
                      var31 = new vh(var43);
                      var39 = new int[var5_int];
                      var32 = var39;
                      var14 = var32;
                      var31.field_q = var11;
                      var15_int = 0;
                      L35: while (true) {
                        L36: {
                          if (var12 <= var15_int) {
                            stackOut_96_0 = var5_int;
                            stackIn_97_0 = stackOut_96_0;
                            break L36;
                          } else {
                            var16 = 0;
                            stackOut_88_0 = 0;
                            stackIn_97_0 = stackOut_88_0;
                            stackIn_89_0 = stackOut_88_0;
                            if (var22 != 0) {
                              break L36;
                            } else {
                              var17 = stackIn_89_0;
                              L37: while (true) {
                                L38: {
                                  if (var17 >= var5_int) {
                                    var15_int++;
                                    break L38;
                                  } else {
                                    var16 = var16 + var31.i(param1 + 1);
                                    var14[var17] = var14[var17] + var16;
                                    var17++;
                                    if (var22 != 0) {
                                      break L38;
                                    } else {
                                      continue L37;
                                    }
                                  }
                                }
                                continue L35;
                              }
                            }
                          }
                        }
                        var40 = new byte[stackIn_97_0][];
                        var33 = var40;
                        var15 = var33;
                        var16 = 0;
                        L39: while (true) {
                          L40: {
                            if (var16 >= var5_int) {
                              var31.field_q = var11;
                              var16 = 0;
                              break L40;
                            } else {
                              array$3 = new byte[var39[var16]];
                              var15[var16] = array$3;
                              var39[var16] = 0;
                              var16++;
                              if (var22 != 0) {
                                break L40;
                              } else {
                                continue L39;
                              }
                            }
                          }
                          var17 = 0;
                          L41: while (true) {
                            L42: {
                              if (var12 <= var17) {
                                stackOut_113_0 = 0;
                                stackIn_114_0 = stackOut_113_0;
                                break L42;
                              } else {
                                var18 = 0;
                                stackOut_105_0 = 0;
                                stackIn_114_0 = stackOut_105_0;
                                stackIn_106_0 = stackOut_105_0;
                                if (var22 != 0) {
                                  break L42;
                                } else {
                                  var19 = stackIn_106_0;
                                  L43: while (true) {
                                    L44: {
                                      if (var19 >= var5_int) {
                                        var17++;
                                        break L44;
                                      } else {
                                        var18 = var18 + var31.i(1);
                                        vm.a(var36, var16, var40[var19], var39[var19], var18);
                                        var16 = var16 + var18;
                                        var14[var19] = var14[var19] + var18;
                                        var19++;
                                        if (var22 != 0) {
                                          break L44;
                                        } else {
                                          continue L43;
                                        }
                                      }
                                    }
                                    continue L41;
                                  }
                                }
                              }
                            }
                            var17 = stackIn_114_0;
                            L45: while (true) {
                              if (var17 >= var5_int) {
                                break L15;
                              } else {
                                L46: {
                                  L47: {
                                    if (var6 != null) {
                                      break L47;
                                    } else {
                                      var18 = var17;
                                      if (var22 == 0) {
                                        break L46;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                  var18 = var34[var17];
                                  break L46;
                                }
                                L48: {
                                  L49: {
                                    if (0 != this.field_e) {
                                      break L49;
                                    } else {
                                      var7[var18] = pf.a(param1 + 0, var40[var17], false);
                                      if (var22 == 0) {
                                        break L48;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  var7[var18] = var40[var17];
                                  break L48;
                                }
                                var17++;
                                continue L45;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_124_0 = 1;
                    stackIn_125_0 = stackOut_124_0;
                    break L14;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) (var5);
            stackOut_126_1 = new StringBuilder().append("kl.U(").append(param0).append(',').append(param1).append(',');
            stackIn_128_0 = stackOut_126_0;
            stackIn_128_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param2 == null) {
              stackOut_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackOut_128_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L50;
            } else {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "{...}";
              stackIn_129_0 = stackOut_127_0;
              stackIn_129_1 = stackOut_127_1;
              stackIn_129_2 = stackOut_127_2;
              break L50;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_129_0), stackIn_129_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_69_0 != 0;
              } else {
                return stackIn_125_0 != 0;
              }
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var3_int = 98 % ((param1 - 39) / 43);
            if (this.a((byte) 82)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_j.field_l.a(rs.a((byte) -116, var5), 1);
              stackOut_3_0 = this.b(var4, (byte) 73);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("kl.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    kl(ew param0, boolean param1, int param2) {
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
        this.field_j = null;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -3) {
                  L2: {
                    this.field_g = param0;
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
                  ((kl) (this)).field_b = stackIn_7_1 != 0;
                  this.field_e = param2;
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("kl.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b(int param0, byte param1) {
        if (!(this.c(param0, -24876))) {
            return 0;
        }
        if (this.field_h[param0] != null) {
            return 100;
        }
        if (param1 != 73) {
            kl.b(-64);
        }
        return this.field_g.b(5926, param0);
    }

    private final synchronized void a(boolean param0, int param1) {
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_h = (Object[]) (this.field_h[2]);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_b) {
              break L2;
            } else {
              this.field_h[param1] = pf.a(0, this.field_g.a(param1, 4), false);
              if (!ArmiesOfGielinor.field_M) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_h[param1] = this.field_g.a(param1, 4);
          break L1;
        }
    }

    static {
        field_k = new sa();
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_i = -1;
    }
}
