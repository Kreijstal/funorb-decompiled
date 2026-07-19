/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private Object[][] field_i;
    private int field_e;
    private Object[] field_h;
    private boolean field_b;
    private rf field_c;
    static String field_d;
    private wd field_a;
    static String field_j;
    static int[] field_g;
    static String field_k;
    static String field_f;

    public static void a(byte param0) {
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != 123) {
            field_j = (String) null;
        }
        field_k = null;
        field_f = null;
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
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
            if (this.a(-22)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              if (param1) {
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_a.field_b.a(param1, ra.a((byte) -21, var6));
                if (this.a((byte) 115, var4_int)) {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_a.field_t[var4_int].a(param1, ra.a((byte) 99, var7));
                  stackOut_9_0 = this.c(var4_int, var5, -119);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ad.K(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        byte[] var7 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (this.a(param2, param0, 0)) {
              if (param3 <= -30) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == this.field_i[param2]) {
                      break L2;
                    } else {
                      if (this.field_i[param2][param0] != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!this.a((byte) -12, param1, param0, param2)) {
                    this.a(3, param2);
                    if (this.a((byte) -12, param1, param0, param2)) {
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (null == this.field_i[param2]) {
                  throw new RuntimeException("");
                } else {
                  L3: {
                    if (this.field_i[param2][param0] == null) {
                      break L3;
                    } else {
                      var7 = uj.a(43, this.field_i[param2][param0], false);
                      var5 = var7;
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
                        if ((this.field_e ^ -1) == -2) {
                          break L5;
                        } else {
                          if (2 == this.field_e) {
                            this.field_i[param2] = null;
                            if (!MonkeyPuzzle2.field_F) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_i[param2][param0] = null;
                      if (this.field_a.field_r[param2] != 1) {
                        break L4;
                      } else {
                        this.field_i[param2] = null;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_29_0 = var5;
                  stackIn_30_0 = stackOut_29_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_4_0 = (byte[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = var5;
            stackOut_31_1 = new StringBuilder().append("ad.N(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return (byte[]) ((Object) stackIn_30_0);
        }
    }

    final synchronized boolean c(int param0, int param1, int param2) {
        int var4 = 43 / ((param2 - 5) / 50);
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        if (this.field_i[param0] != null) {
            if (null != this.field_i[param0][param1]) {
                return true;
            }
        }
        if (this.field_h[param0] != null) {
            return true;
        }
        this.a(3, param0);
        if (null != this.field_h[param0]) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, String param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
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
              if (param0 == 0) {
                break L1;
              } else {
                discarded$2 = this.b(93);
                break L1;
              }
            }
            if (this.a(118)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_a.field_b.a(true, ra.a((byte) 115, var4));
              stackOut_5_0 = this.a(false, var3_int);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(String param0, int param1, float param2) {
        try {
            pj.field_h = param2;
            be.field_d = param0;
            if (param1 != -24119) {
                field_f = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ad.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.a(112)) {
              L1: {
                if (param1 == -105) {
                  break L1;
                } else {
                  field_j = (String) null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_b.a(true, ra.a((byte) -14, var4));
              if (!this.a((byte) 73, var3_int)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ad.M(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.a((byte) 124, param1)) {
            return false;
        }
        if (!(null == this.field_h[param1])) {
            return true;
        }
        this.a(3, param1);
        if (this.field_h[param1] != null) {
            return true;
        }
        if (param0) {
            return ((boolean[]) (this.field_h[1]))[8];
        }
        return false;
    }

    private final synchronized boolean a(byte param0, int param1) {
        int discarded$2 = 0;
        if (this.a(-18)) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if ((this.field_a.field_r.length ^ -1) >= (param1 ^ -1)) {
                break L0;
              } else {
                if ((this.field_a.field_r[param1] ^ -1) == -1) {
                  break L0;
                } else {
                  if (param0 >= 64) {
                    return true;
                  } else {
                    discarded$2 = this.b(0, 17);
                    return true;
                  }
                }
              }
            }
          }
          if (mg.field_t) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
        try {
          L0: {
            if (this.a(-63)) {
              var3_int = 20 % ((param1 - -58) / 43);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_a.field_b.a(true, ra.a((byte) 104, var5));
              if (var4 >= 0) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ad.S(");
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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    private final synchronized void a(int param0, int param1) {
        if (param0 == 3) {
          L0: {
            L1: {
              if (!this.field_b) {
                break L1;
              } else {
                this.field_h[param1] = this.field_c.b(-113, param1);
                if (!MonkeyPuzzle2.field_F) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_h[param1] = p.a(this.field_c.b(-116, param1), (byte) 111, false);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final synchronized boolean a(byte param0, int[] param1, int param2, int param3) {
        Object[] array$3 = null;
        int discarded$4 = 0;
        byte[] array$5 = null;
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
        byte[] var25 = null;
        gk var26 = null;
        byte[] var27 = null;
        gk var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gk var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        var22 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 88, param3)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_h[param3] != null) {
                L1: {
                  var5_int = this.field_a.field_m[param3];
                  var34 = this.field_a.field_a[param3];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_i[param3] != null) {
                    break L1;
                  } else {
                    array$3 = new Object[this.field_a.field_r[param3]];
                    this.field_i[param3] = array$3;
                    break L1;
                  }
                }
                var7 = this.field_i[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if ((var5_int ^ -1) >= (var9_int ^ -1)) {
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
                            if (var7[var10] == null) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L3;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                  L8: {
                    L9: {
                      if (param1 == null) {
                        break L9;
                      } else {
                        L10: {
                          if ((param1[0] ^ -1) != -1) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if ((param1[2] ^ -1) != -1) {
                                break L10;
                              } else {
                                if (0 != param1[3]) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var35 = uj.a(59, this.field_h[param3], true);
                        var25 = var35;
                        var9_array = var25;
                        var26 = new gk(var35);
                        var26.a(5, var26.field_g.length, -84, param1);
                        break L8;
                      }
                    }
                    var9_array = uj.a(67, this.field_h[param3], false);
                    break L8;
                  }
                  try {
                    L11: {
                      var36 = rc.a(var9_array, 120);
                      var27 = var36;
                      var23 = var27;
                      var43 = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_34_0 = (RuntimeException) (var11_ref_RuntimeException);
                      stackOut_34_1 = new StringBuilder();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (param1 == null) {
                        stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackOut_36_2 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L12;
                      } else {
                        stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackOut_35_2 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L12;
                      }
                    }
                    throw la.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param3 + " " + param1.length + " " + w.a(param1.length, var9_array, -18694) + " " + w.a(-2 + param1.length, var9_array, param0 ^ 18702) + " " + this.field_a.field_j[param3] + " " + this.field_a.field_d);
                  }
                  L13: {
                    if (param0 == -12) {
                      break L13;
                    } else {
                      discarded$4 = this.a((String) (this.field_h[11]), (byte) 73);
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_b) {
                      this.field_h[param3] = null;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if ((var5_int ^ -1) < -2) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (var6 != null) {
                                break L19;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = var34[0];
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (this.field_e == 0) {
                                break L21;
                              } else {
                                var7[var11] = var36;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = p.a(var36, (byte) 110, false);
                            break L20;
                          }
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L22: {
                        if ((this.field_e ^ -1) == -3) {
                          break L22;
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var29 = new gk(var43);
                          var29.field_h = var11;
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if ((var12 ^ -1) >= (var15 ^ -1)) {
                                  break L25;
                                } else {
                                  var16 = 0;
                                  stackOut_55_0 = 0;
                                  stackIn_64_0 = stackOut_55_0;
                                  stackIn_56_0 = stackOut_55_0;
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var17 = stackIn_56_0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if ((var5_int ^ -1) >= (var17 ^ -1)) {
                                            break L28;
                                          } else {
                                            var16 = var16 + var29.e(-30);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                            var17++;
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              if (var22 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        var15++;
                                        break L27;
                                      }
                                      if (var22 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_63_0 = var5_int;
                              stackIn_64_0 = stackOut_63_0;
                              break L24;
                            }
                            var39 = new byte[stackIn_64_0][];
                            var31 = var39;
                            var15_ref_byte____ = var31;
                            var16 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if ((var5_int ^ -1) >= (var16 ^ -1)) {
                                    break L31;
                                  } else {
                                    array$5 = new byte[var38[var16]];
                                    var15_ref_byte____[var16] = array$5;
                                    var38[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      if (var22 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var29.field_h = var11;
                                var16 = 0;
                                break L30;
                              }
                              var17 = 0;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (var12 <= var17) {
                                      break L34;
                                    } else {
                                      var18 = 0;
                                      stackOut_72_0 = 0;
                                      stackIn_81_0 = stackOut_72_0;
                                      stackIn_73_0 = stackOut_72_0;
                                      if (var22 != 0) {
                                        break L33;
                                      } else {
                                        var19 = stackIn_73_0;
                                        L35: while (true) {
                                          L36: {
                                            L37: {
                                              if (var19 >= var5_int) {
                                                break L37;
                                              } else {
                                                var18 = var18 + var29.e(-95);
                                                gl.a(var36, var16, var39[var19], var38[var19], var18);
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var16 = var16 + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L36;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L35;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L36;
                                          }
                                          if (var22 == 0) {
                                            continue L32;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_80_0 = 0;
                                  stackIn_81_0 = stackOut_80_0;
                                  break L33;
                                }
                                var17 = stackIn_81_0;
                                L38: while (true) {
                                  L39: {
                                    if (var17 >= var5_int) {
                                      break L39;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L40: {
                                          L41: {
                                            if (var6 != null) {
                                              break L41;
                                            } else {
                                              var18 = var17;
                                              if (var22 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                          var18 = var34[var17];
                                          break L40;
                                        }
                                        L42: {
                                          L43: {
                                            if (-1 != (this.field_e ^ -1)) {
                                              break L43;
                                            } else {
                                              var7[var18] = p.a(var39[var17], (byte) 117, false);
                                              if (var22 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          var7[var18] = var39[var17];
                                          break L42;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L22;
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
                      var11 = var11 - 4 * var5_int * var12;
                      var32 = new gk(var43);
                      var14 = 0;
                      var15 = 0;
                      var32.field_h = var11;
                      var16 = 0;
                      L44: while (true) {
                        L45: {
                          L46: {
                            if ((var16 ^ -1) <= (var12 ^ -1)) {
                              break L46;
                            } else {
                              var17 = 0;
                              stackOut_95_0 = 0;
                              stackIn_108_0 = stackOut_95_0;
                              stackIn_96_0 = stackOut_95_0;
                              if (var22 != 0) {
                                break L45;
                              } else {
                                var18 = stackIn_96_0;
                                L47: while (true) {
                                  L48: {
                                    L49: {
                                      if ((var18 ^ -1) <= (var5_int ^ -1)) {
                                        break L49;
                                      } else {
                                        var17 = var17 + var32.e(param0 ^ -118);
                                        if (var22 != 0) {
                                          break L48;
                                        } else {
                                          L50: {
                                            L51: {
                                              if (var6 != null) {
                                                break L51;
                                              } else {
                                                var19 = var18;
                                                if (var22 == 0) {
                                                  break L50;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            var19 = var34[var18];
                                            break L50;
                                          }
                                          L52: {
                                            if (param2 != var19) {
                                              break L52;
                                            } else {
                                              var14 = var14 + var17;
                                              var15 = var19;
                                              break L52;
                                            }
                                          }
                                          var18++;
                                          if (var22 == 0) {
                                            continue L47;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                    var16++;
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
                          stackOut_107_0 = var14;
                          stackIn_108_0 = stackOut_107_0;
                          break L45;
                        }
                        if (stackIn_108_0 != 0) {
                          var44 = new byte[var14];
                          var14 = 0;
                          var32.field_h = var11;
                          var17 = 0;
                          var18 = 0;
                          L53: while (true) {
                            L54: {
                              if ((var12 ^ -1) >= (var18 ^ -1)) {
                                break L54;
                              } else {
                                var19 = 0;
                                stackOut_113_0 = 0;
                                stackIn_128_0 = stackOut_113_0;
                                stackIn_114_0 = stackOut_113_0;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  var20 = stackIn_114_0;
                                  L55: while (true) {
                                    L56: {
                                      L57: {
                                        if ((var20 ^ -1) <= (var5_int ^ -1)) {
                                          break L57;
                                        } else {
                                          var19 = var19 + var32.e(param0 + -102);
                                          if (var22 != 0) {
                                            break L56;
                                          } else {
                                            L58: {
                                              L59: {
                                                if (var6 == null) {
                                                  break L59;
                                                } else {
                                                  var21 = var34[var20];
                                                  if (var22 == 0) {
                                                    break L58;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L58;
                                            }
                                            L60: {
                                              if ((param2 ^ -1) == (var21 ^ -1)) {
                                                gl.a(var43, var17, var44, var14, var19);
                                                var14 = var14 + var19;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            if (var22 == 0) {
                                              continue L55;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      break L56;
                                    }
                                    if (var22 == 0) {
                                      continue L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var15] = var44;
                            break L16;
                          }
                        } else {
                          stackOut_109_0 = 1;
                          stackIn_110_0 = stackOut_109_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_127_0 = 1;
                    stackIn_128_0 = stackOut_127_0;
                    break L15;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L61: {
            var5 = decompiledCaughtException;
            stackOut_129_0 = (RuntimeException) (var5);
            stackOut_129_1 = new StringBuilder().append("ad.V(").append(param0).append(',');
            stackIn_131_0 = stackOut_129_0;
            stackIn_131_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param1 == null) {
              stackOut_131_0 = (RuntimeException) ((Object) stackIn_131_0);
              stackOut_131_1 = (StringBuilder) ((Object) stackIn_131_1);
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L61;
            } else {
              stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
              stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
              stackOut_130_2 = "{...}";
              stackIn_132_0 = stackOut_130_0;
              stackIn_132_1 = stackOut_130_1;
              stackIn_132_2 = stackOut_130_2;
              break L61;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_132_0), stackIn_132_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_110_0 != 0;
              } else {
                return stackIn_128_0 != 0;
              }
            }
          }
        }
    }

    final synchronized int b(boolean param0) {
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
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!this.a(89)) {
          return 0;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              this.field_e = 47;
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if ((var4 ^ -1) <= (this.field_h.length ^ -1)) {
                  break L3;
                } else {
                  stackOut_7_0 = 0;
                  stackOut_7_1 = this.field_a.field_m[var4];
                  stackIn_13_0 = stackOut_7_0;
                  stackIn_13_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_8_0 < stackIn_8_1) {
                        var3 = var3 + this.b(var4, 11619);
                        var2 += 100;
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
              stackOut_12_1 = var2 ^ -1;
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

    final static boolean c(boolean param0) {
        if (param0) {
            field_g = (int[]) null;
        }
        return oa.a((byte) -127, ii.a(false));
    }

    final byte[] b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 != 255) {
            discarded$0 = this.a((byte) 89, -23);
        }
        return this.a(param1, (int[]) null, param2, (byte) -85);
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
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
            if (this.a(85)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var5 = 26 / ((-88 - param2) / 36);
              var7 = (CharSequence) ((Object) param1);
              var4_int = this.field_a.field_b.a(true, ra.a((byte) 125, var7));
              if (this.a((byte) 117, var4_int)) {
                var8 = (CharSequence) ((Object) param0);
                var6 = this.field_a.field_t[var4_int].a(true, ra.a((byte) -59, var8));
                stackOut_6_0 = this.b(255, var6, var4_int);
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
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ad.L(");
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean a(boolean param0) {
        if (param0) {
            field_j = (String) null;
        }
        return wd.field_g;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2 ^ -42)) {
            return false;
        }
        if (param0 >= param2) {
            if ((param1 ^ -1) <= -1) {
                if (this.field_a.field_r.length > param0) {
                    if ((param1 ^ -1) > (this.field_a.field_r[param0] ^ -1)) {
                        return true;
                    }
                }
            }
        }
        if (!mg.field_t) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            mk.a("", (byte) -5, param0);
            l.a(param0, -106);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ad.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0) {
        if (this.field_a == null) {
            this.field_a = this.field_c.a((byte) 80);
            if (this.field_a == null) {
                return false;
            }
            this.field_h = new Object[this.field_a.field_e];
            this.field_i = new Object[this.field_a.field_e][];
        }
        int var2 = -110 / ((param0 - 24) / 38);
        return true;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.a(-123)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= this.field_a.field_f.length) {
                  break L2;
                } else {
                  stackOut_4_0 = this.field_a.field_f[var3];
                  stackIn_11_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      var4 = stackIn_5_0;
                      if (this.field_h[var4] != null) {
                        break L3;
                      } else {
                        this.a(3, var4);
                        if (null == this.field_h[var4]) {
                          var2 = 0;
                          break L3;
                        } else {
                          break L3;
                        }
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
              stackOut_10_0 = var2;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            return stackIn_11_0 != 0;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.a((byte) 96, param1)) {
              L1: {
                param0 = param0.toLowerCase();
                var5 = (CharSequence) ((Object) param0);
                var4_int = this.field_a.field_t[param1].a(true, ra.a((byte) 3, var5));
                if (param2 == -28459) {
                  break L1;
                } else {
                  ((int[]) (((Object[]) (((Object[]) (this.field_h[1]))[14]))[2]))[0] = -43;
                  break L1;
                }
              }
              if (!this.a(param1, var4_int, 0)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ad.G(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != 11619) {
            return -123;
        }
        if (!(this.a((byte) 73, param0))) {
            return 0;
        }
        if (null != this.field_h[param0]) {
            return 100;
        }
        return this.field_c.a(-48, param0);
    }

    ad(rf param0, boolean param1, int param2) {
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
        this.field_a = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
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
                  ((ad) (this)).field_b = stackIn_7_1 != 0;
                  this.field_e = param2;
                  this.field_c = param0;
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
            stackOut_9_1 = new StringBuilder().append("ad.<init>(");
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
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3, String param4, String param5) {
        try {
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            int discarded$10 = 0;
            Object discarded$11 = null;
            Object discarded$12 = null;
            int discarded$13 = 0;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_5_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_106_0 = 0;
            int stackIn_108_0 = 0;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            String stackIn_112_2 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            String stackIn_115_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_107_0 = 0;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            String stackOut_111_2 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            String stackOut_114_2 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            var9 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ol.field_g) {
                    if (cb.a(param1 ^ 665, param3)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (dk.field_h == ii.field_r) {
                    L3: {
                      L4: {
                        if (!param3) {
                          break L4;
                        } else {
                          var11 = (String) null;
                          pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      pj.field_b = h.a(param1 ^ -739, false, param4, param5);
                      break L3;
                    }
                    gf.field_c.field_h = 0;
                    gf.field_c.b(14, -49152);
                    gf.field_c.b(pj.field_b.a(false).field_b, -49152);
                    al.a((byte) -71, -1);
                    dk.field_h = kh.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (dk.field_h == kh.field_a) {
                    if (hj.a(1, true)) {
                      L6: {
                        L7: {
                          var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                          if (-1 != (var6_int ^ -1)) {
                            break L7;
                          } else {
                            dk.field_h = aa.field_b;
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        dk.field_h = dk.field_d;
                        rc.field_f = -1;
                        wk.field_a = var6_int;
                        break L6;
                      }
                      MonkeyPuzzle2.field_D.field_h = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (aa.field_b != dk.field_h) {
                    break L8;
                  } else {
                    if (hj.a(8, true)) {
                      ld.field_a = MonkeyPuzzle2.field_D.i(127);
                      MonkeyPuzzle2.field_D.field_h = 0;
                      ki.a(param0, pj.field_b, true, param3, param2);
                      dk.field_h = qk.field_c;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (qk.field_c == dk.field_h) {
                    if (hj.a(1, true)) {
                      L10: {
                        var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                        df.field_o = null;
                        wk.field_a = var6_int;
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var6_int == 0) {
                          break L10;
                        } else {
                          if (-2 == (var6_int ^ -1)) {
                            break L10;
                          } else {
                            if (-9 != (var6_int ^ -1)) {
                              dk.field_h = dk.field_d;
                              rc.field_f = -1;
                              if (var9 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            } else {
                              gk.a(-1);
                              ck.field_e = false;
                              stackOut_33_0 = var6_int;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector1 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                      dk.field_h = ea.field_a;
                      rc.field_f = -1;
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (dk.field_h != ea.field_a) {
                    break L11;
                  } else {
                    if (!gb.a(true)) {
                      break L11;
                    } else {
                      L12: {
                        ia.field_f = MonkeyPuzzle2.field_D.i(103);
                        ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
                        discarded$7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        af.field_c = MonkeyPuzzle2.field_D.j(17277);
                        var6_ref = MonkeyPuzzle2.field_D.g(-1185292952);
                        var7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        if ((1 & var7 ^ -1) == -1) {
                          break L12;
                        } else {
                          gd.b(-594181854);
                          break L12;
                        }
                      }
                      L13: {
                        if (param3) {
                          break L13;
                        } else {
                          L14: {
                            if ((8 & var7 ^ -1) == -1) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L14;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L14;
                            }
                          }
                          L15: {
                            rh.field_B = stackIn_45_0 != 0;
                            if (0 == (var7 & 4)) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L15;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L15;
                            }
                          }
                          fj.field_J = stackIn_48_0 != 0;
                          if (rh.field_B) {
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L16: {
                        L17: {
                          if (me.field_e) {
                            discarded$8 = MonkeyPuzzle2.field_D.a((byte) 114);
                            discarded$9 = MonkeyPuzzle2.field_D.a((byte) 114);
                            discarded$10 = MonkeyPuzzle2.field_D.e(param1 ^ 756);
                            il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                            il.field_g = new byte[il.field_h];
                            var8 = 0;
                            L18: while (true) {
                              if (il.field_h <= var8) {
                                break L17;
                              } else {
                                il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                                var8++;
                                if (var9 != 0) {
                                  break L16;
                                } else {
                                  if (var9 == 0) {
                                    continue L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
                        var12 = (CharSequence) ((Object) cl.field_e);
                        uj.field_f = pl.a((byte) 109, var12);
                        ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
                        dk.field_h = wh.field_b;
                        break L16;
                      }
                      L19: {
                        L20: {
                          if (pj.field_b.a(false) != te.field_a) {
                            break L20;
                          } else {
                            oe.field_l.a(false, ii.a(false));
                            if (var9 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (pj.field_b.a(false) == sj.field_g) {
                          dh.field_d.a(false, ii.a(false));
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L21: {
                        ck.field_e = false;
                        if (var6_ref != null) {
                          pe.a(var6_ref, (byte) -108, ii.a(false));
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        L23: {
                          L24: {
                            if ((af.field_c ^ -1) < -1) {
                              break L24;
                            } else {
                              if (!fj.field_J) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          try {
                            L25: {
                              discarded$11 = mf.a(126, "zap", ii.a(false), new Object[]{mk.a(ia.field_f, 480)});
                              decompiledRegionSelector0 = 0;
                              break L25;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L26: {
                              var8_ref_Throwable = decompiledCaughtException;
                              if (var9 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L26;
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L26;
                              }
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                        try {
                          L27: {
                            discarded$12 = mf.a(-26159, "unzap", ii.a(false));
                            break L27;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L28: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L28;
                          }
                        }
                        break L22;
                      }
                      L29: {
                        if ((af.field_c ^ -1) >= -1) {
                          break L29;
                        } else {
                          mb.field_c = true;
                          break L29;
                        }
                      }
                      gf.field_c.a(e.field_b, param1 ^ 650);
                      var8 = 0;
                      L30: while (true) {
                        L31: {
                          L32: {
                            if (4 <= var8) {
                              break L32;
                            } else {
                              e.field_b[var8] = e.field_b[var8] + 50;
                              var8++;
                              if (var9 != 0) {
                                break L31;
                              } else {
                                if (var9 == 0) {
                                  continue L30;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          MonkeyPuzzle2.field_D.a(e.field_b, 0);
                          break L31;
                        }
                        stackOut_83_0 = wk.field_a;
                        stackIn_84_0 = stackOut_83_0;
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                }
                L33: {
                  if (dk.field_h != dk.field_d) {
                    break L33;
                  } else {
                    if (gb.a(true)) {
                      L34: {
                        gk.a(param1 + -651);
                        if ((wk.field_a ^ -1) != -8) {
                          break L34;
                        } else {
                          if (ck.field_e) {
                            break L34;
                          } else {
                            ck.field_e = true;
                            stackOut_90_0 = -1;
                            stackIn_91_0 = stackOut_90_0;
                            decompiledRegionSelector1 = 3;
                            break L0;
                          }
                        }
                      }
                      L35: {
                        if (wk.field_a != 7) {
                          break L35;
                        } else {
                          wk.field_a = 3;
                          break L35;
                        }
                      }
                      sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                      ck.field_e = false;
                      stackOut_94_0 = wk.field_a;
                      stackIn_95_0 = stackOut_94_0;
                      decompiledRegionSelector1 = 4;
                      break L0;
                    } else {
                      break L33;
                    }
                  }
                }
                L36: {
                  if (param1 == 650) {
                    break L36;
                  } else {
                    var10 = (String) null;
                    discarded$13 = ad.a(-115, 60, false, false, (String) null, (String) null);
                    break L36;
                  }
                }
                L37: {
                  if (ol.field_g != null) {
                    break L37;
                  } else {
                    L38: {
                      if (ck.field_e) {
                        break L38;
                      } else {
                        var6_int = cg.field_g;
                        cg.field_g = id.field_m;
                        id.field_m = var6_int;
                        ck.field_e = true;
                        if (var9 == 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      L40: {
                        if (30000L >= wf.a(84)) {
                          break L40;
                        } else {
                          sl.field_n = kj.field_E;
                          if (var9 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      sl.field_n = hh.field_p;
                      break L39;
                    }
                    ck.field_e = false;
                    stackOut_105_0 = 3;
                    stackIn_106_0 = stackOut_105_0;
                    decompiledRegionSelector1 = 5;
                    break L0;
                  }
                }
                stackOut_107_0 = -1;
                stackIn_108_0 = stackOut_107_0;
                decompiledRegionSelector1 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L41: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_109_0 = (RuntimeException) (var6);
                stackOut_109_1 = new StringBuilder().append("ad.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_111_0 = stackOut_109_0;
                stackIn_111_1 = stackOut_109_1;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                if (param4 == null) {
                  stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
                  stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
                  stackOut_111_2 = "null";
                  stackIn_112_0 = stackOut_111_0;
                  stackIn_112_1 = stackOut_111_1;
                  stackIn_112_2 = stackOut_111_2;
                  break L41;
                } else {
                  stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackOut_110_2 = "{...}";
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_112_1 = stackOut_110_1;
                  stackIn_112_2 = stackOut_110_2;
                  break L41;
                }
              }
              L42: {
                stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
                stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',');
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                stackIn_113_0 = stackOut_112_0;
                stackIn_113_1 = stackOut_112_1;
                if (param5 == null) {
                  stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
                  stackOut_114_2 = "null";
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  break L42;
                } else {
                  stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackOut_113_2 = "{...}";
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_115_1 = stackOut_113_1;
                  stackIn_115_2 = stackOut_113_2;
                  break L42;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_34_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_84_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_91_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_95_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_106_0;
                      } else {
                        return stackIn_108_0;
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        int discarded$2 = 0;
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
        int decompiledRegionSelector0 = 0;
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
              if (param1 == -81) {
                break L1;
              } else {
                discarded$2 = this.c((String) (this.field_h[13]), (byte) 11);
                break L1;
              }
            }
            if (!this.a(85)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_b.a(true, ra.a((byte) -117, var4));
              stackOut_6_0 = this.b(var3_int, 11619);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ad.Q(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        int var0 = 0;
        field_d = "This password contains your email address, and would be easy to guess";
        field_k = "This entry doesn't match";
        field_g = new int[5];
        field_j = "Use this alternative as your account name";
        for (var0 = 0; (field_g.length ^ -1) < (var0 ^ -1); var0++) {
            if (-1 != (var0 ^ -1)) {
                field_g[var0] = var0 * 51 - -51 << 1319719984;
            } else {
                field_g[var0] = 20 * (var0 + 1) << -1088248624;
            }
            if (!(2 >= var0)) {
                field_g[var0] = bd.a(field_g[var0], (-2 + var0) * 22 << -1695822616);
            }
        }
        field_f = "Your email address is used to identify this account";
    }
}
