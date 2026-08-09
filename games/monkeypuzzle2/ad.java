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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_10_0 = this.c(var4_int, var5, -119);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ad.K(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
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
        byte[] stackIn_5_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
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
                  stackIn_30_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = (byte[]) null;
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
            stackIn_33_0 = var5;

            stackIn_33_1 = new StringBuilder().append("ad.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L6;
            } else {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
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
        if (this.field_i[param0] != null && null != this.field_i[param0][param1]) {
            return true;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.b(93);
                break L1;
              }
            }
            if (this.a(118)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_a.field_b.a(true, ra.a((byte) 115, var4));
              stackIn_6_0 = this.a(false, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ad.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ad.M(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
                    this.b(0, 17);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-63)) {
              var3_int = 20 % ((param1 - -58) / 43);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_a.field_b.a(true, ra.a((byte) 104, var5));
              if (var4 >= 0) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ad.S(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        Object[] array$0 = null;
        byte[] array$1 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14_ref_int__ = null;
        int var14 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.a((byte) 88, param3)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (this.field_h[param3] != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var5_int = this.field_a.field_m[param3];
                        var34 = this.field_a.field_a[param3];
                        var24 = var34;
                        var6 = var24;
                        if (this.field_i[param3] != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        array$0 = new Object[this.field_a.field_r[param3]];
                        this.field_i[param3] = array$0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = this.field_i[param3];
                        var8 = 1;
                        var9_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var5_int ^ -1) >= (var9_int ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var22 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = var34[var9_int];
                        if (var22 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7[var10] == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = 0;
                        if (var22 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int++;
                        if (var22 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        if (param1 == null) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((param1[0] ^ -1) != -1) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1[1] != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((param1[2] ^ -1) != -1) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 != param1[3]) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = uj.a(67, this.field_h[param3], false);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var35 = uj.a(59, this.field_h[param3], true);
                        var25 = var35;
                        var9 = var25;
                        var26 = new gk(var35);
                        var26.a(5, var26.field_g.length, -84, param1);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var36 = rc.a(var9, 120);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_36_0 = (RuntimeException) (var11_ref_RuntimeException);
                        stackIn_35_0 = stackIn_36_0;
                        stackIn_36_1 = new StringBuilder();
                        stackIn_35_1 = stackIn_36_1;
                        if (param1 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_37_2 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackIn_37_2 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw la.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param3 + " " + param1.length + " " + w.a(param1.length, var9, -18694) + " " + w.a(-2 + param1.length, var9, param0 ^ 18702) + " " + this.field_a.field_j[param3] + " " + this.field_a.field_d);
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param0 == -12) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.a((String) (this.field_h[11]), (byte) 73);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_b) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_h[param3] = null;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_int ^ -1) < -2) {
                            statePc = 52;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 != null) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = 0;
                        if (var22 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = var34[0];
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (this.field_e == 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7[var11] = var36;
                        if (var22 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7[var11] = p.a(var36, (byte) 110, false);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var22 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((this.field_e ^ -1) == -3) {
                            statePc = 93;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
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
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var12 ^ -1) >= (var15 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var16 = 0;
                        stackIn_64_0 = 0;
                        stackIn_56_0 = stackIn_64_0;
                        if (var22 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var5_int ^ -1) >= (var17 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var16 = var16 + var29.e(-30);
                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                        var17++;
                        if (var22 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var22 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var15++;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var22 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = var5_int;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var39 = new byte[stackIn_64_0][];
                        var31 = var39;
                        var15_ref_byte____ = var31;
                        var16 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((var5_int ^ -1) >= (var16 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        array$1 = new byte[var38[var16]];
                        var15_ref_byte____[var16] = array$1;
                        var38[var16] = 0;
                        var16++;
                        if (var22 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var22 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var29.field_h = var11;
                        var16 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var17 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var12 <= var17) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var18 = 0;
                        stackIn_81_0 = 0;
                        stackIn_73_0 = stackIn_81_0;
                        if (var22 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var19 = stackIn_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var19 >= var5_int) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var18 = var18 + var29.e(-95);
                        gl.a(var36, var16, var39[var19], var38[var19], var18);
                        var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                        var16 = var16 + var18;
                        var19++;
                        if (var22 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var22 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var17++;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var22 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var17 = stackIn_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var17 >= var5_int) {
                            statePc = 92;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var22 != 0) {
                            statePc = 127;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var6 != null) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var18 = var17;
                        if (var22 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var18 = var34[var17];
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (-1 != (this.field_e ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var7[var18] = p.a(var39[var17], (byte) 117, false);
                        if (var22 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var7[var18] = var39[var17];
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var17++;
                        if (var22 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var22 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var11 = var36.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * var5_int * var12;
                        var32 = new gk(var43);
                        var14 = 0;
                        var15 = 0;
                        var32.field_h = var11;
                        var16 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((var16 ^ -1) <= (var12 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var17 = 0;
                        stackIn_108_0 = 0;
                        stackIn_96_0 = stackIn_108_0;
                        if (var22 != 0) {
                            statePc = 108;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var18 = stackIn_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((var18 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var17 = var17 + var32.e(param0 ^ -118);
                        if (var22 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var6 != null) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var19 = var18;
                        if (var22 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var19 = var34[var18];
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (param2 != var19) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var14 = var14 + var17;
                        var15 = var19;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var18++;
                        if (var22 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var16++;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var22 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_108_0 = var14;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackIn_110_0 = 1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 110: {
                    return stackIn_110_0 != 0;
                }
                case 111: {
                    try {
                        var44 = new byte[var14];
                        var14 = 0;
                        var32.field_h = var11;
                        var17 = 0;
                        var18 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if ((var12 ^ -1) >= (var18 ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var19 = 0;
                        stackIn_128_0 = 0;
                        stackIn_114_0 = stackIn_128_0;
                        if (var22 != 0) {
                            statePc = 128;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var20 = stackIn_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((var20 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var19 = var19 + var32.e(param0 + -102);
                        if (var22 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var6 == null) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var21 = var34[var20];
                        if (var22 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var21 = var20;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if ((param2 ^ -1) == (var21 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        gl.a(var43, var17, var44, var14, var19);
                        var14 = var14 + var19;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var17 = var17 + var19;
                        var20++;
                        if (var22 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var18++;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var7[var15] = var44;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackIn_128_0 = 1;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    return stackIn_128_0 != 0;
                }
                case 129: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_131_0 = (RuntimeException) (var5);
                    stackIn_130_0 = stackIn_131_0;
                    stackIn_131_1 = new StringBuilder().append("ad.V(").append(param0).append(',');
                    stackIn_130_1 = stackIn_131_1;
                    if (param1 == null) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (RuntimeException) ((Object) stackIn_130_0);
                    stackIn_132_1 = (StringBuilder) ((Object) stackIn_130_1);
                    stackIn_132_2 = "{...}";
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (RuntimeException) ((Object) stackIn_131_0);
                    stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
                    stackIn_132_2 = "null";
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    throw la.a((Throwable) ((Object) stackIn_132_0), stackIn_132_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
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
                  stackIn_13_0 = 0;

                  stackIn_13_1 = this.field_a.field_m[var4];

                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_13_0 < stackIn_13_1) {
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
              stackIn_13_0 = -1;
              stackIn_13_1 = var2 ^ -1;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = this.b(255, var6, var4_int);
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
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ad.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
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
        if (param0 >= param2 && (param1 ^ -1) <= -1 && this.field_a.field_r.length > param0 && (param1 ^ -1) > (this.field_a.field_r[param0] ^ -1)) {
            return true;
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
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
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
                  stackIn_11_0 = this.field_a.field_f[var3];

                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      var4 = stackIn_11_0;
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
              stackIn_11_0 = var2;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ad.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        this.field_a = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param1 ? true : false;
            this.field_e = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3, String param4, String param5) {
        try {
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
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == ol.field_g) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (cb.a(param1 ^ 665, param3)) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackIn_5_0 = -1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0;
                    }
                    case 6: {
                        try {
                            if (dk.field_h == ii.field_r) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!param3) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var11 = (String) null;
                            pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
                            if (var9 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            pj.field_b = h.a(param1 ^ -739, false, param4, param5);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            gf.field_c.field_h = 0;
                            gf.field_c.b(14, -49152);
                            gf.field_c.b(pj.field_b.a(false).field_b, -49152);
                            al.a((byte) -71, -1);
                            dk.field_h = kh.field_a;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (dk.field_h == kh.field_a) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (hj.a(1, true)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                            if (-1 != (var6_int ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            dk.field_h = aa.field_b;
                            if (var9 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            dk.field_h = dk.field_d;
                            rc.field_f = -1;
                            wk.field_a = var6_int;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            MonkeyPuzzle2.field_D.field_h = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (aa.field_b != dk.field_h) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (hj.a(8, true)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ld.field_a = MonkeyPuzzle2.field_D.i(127);
                            MonkeyPuzzle2.field_D.field_h = 0;
                            ki.a(param0, pj.field_b, true, param3, param2);
                            dk.field_h = qk.field_c;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (qk.field_c == dk.field_h) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (hj.a(1, true)) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                            df.field_o = null;
                            wk.field_a = var6_int;
                            MonkeyPuzzle2.field_D.field_h = 0;
                            if (var6_int == 0) {
                                statePc = 36;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-9 != (var6_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            gk.a(-1);
                            ck.field_e = false;
                            stackIn_34_0 = var6_int;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            dk.field_h = dk.field_d;
                            rc.field_f = -1;
                            if (var9 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            dk.field_h = ea.field_a;
                            rc.field_f = -1;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (dk.field_h != ea.field_a) {
                                statePc = 85;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (!gb.a(true)) {
                                statePc = 85;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ia.field_f = MonkeyPuzzle2.field_D.i(103);
                            ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
                            MonkeyPuzzle2.field_D.a((byte) 114);
                            af.field_c = MonkeyPuzzle2.field_D.j(17277);
                            var6 = MonkeyPuzzle2.field_D.g(-1185292952);
                            var7 = MonkeyPuzzle2.field_D.a((byte) 114);
                            if ((1 & var7 ^ -1) == -1) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            gd.b(-594181854);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (param3) {
                                statePc = 49;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((8 & var7 ^ -1) == -1) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackIn_45_0 = 1;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackIn_45_0 = 0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            rh.field_B = stackIn_45_0 != 0;
                            if (0 == (var7 & 4)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackIn_48_0 = 1;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_48_0 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            fj.field_J = stackIn_48_0 != 0;
                            if (rh.field_B) {
                                statePc = 49;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (me.field_e) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            MonkeyPuzzle2.field_D.a((byte) 114);
                            MonkeyPuzzle2.field_D.a((byte) 114);
                            MonkeyPuzzle2.field_D.e(param1 ^ 756);
                            il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                            il.field_g = new byte[il.field_h];
                            var8 = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (il.field_h <= var8) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                            var8++;
                            if (var9 != 0) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var9 == 0) {
                                statePc = 52;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            cl.field_e = MonkeyPuzzle2.field_D.f(-1);
                            var12 = (CharSequence) ((Object) cl.field_e);
                            uj.field_f = pl.a((byte) 109, var12);
                            ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
                            dk.field_h = wh.field_b;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (pj.field_b.a(false) != te.field_a) {
                                statePc = 60;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            oe.field_l.a(false, ii.a(false));
                            if (var9 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (pj.field_b.a(false) == sj.field_g) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            dh.field_d.a(false, ii.a(false));
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ck.field_e = false;
                            if (var6 != null) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            pe.a(var6, (byte) -108, ii.a(false));
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if ((af.field_c ^ -1) < -1) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (!fj.field_J) {
                                statePc = 72;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            mf.a(126, "zap", ii.a(false), new Object[]{mk.a(ia.field_f, 480)});
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            mf.a(-26159, "unzap", ii.a(false));
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if ((af.field_c ^ -1) >= -1) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            mb.field_c = true;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            gf.field_c.a(e.field_b, param1 ^ 650);
                            var8 = 0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (4 <= var8) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            e.field_b[var8] = e.field_b[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var9 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            MonkeyPuzzle2.field_D.a(e.field_b, 0);
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackIn_84_0 = wk.field_a;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        return stackIn_84_0;
                    }
                    case 85: {
                        try {
                            if (dk.field_h != dk.field_d) {
                                statePc = 96;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (gb.a(true)) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            gk.a(param1 + -651);
                            if ((wk.field_a ^ -1) != -8) {
                                statePc = 92;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (ck.field_e) {
                                statePc = 92;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ck.field_e = true;
                            stackIn_91_0 = -1;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        return stackIn_91_0;
                    }
                    case 92: {
                        try {
                            if (wk.field_a != 7) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            wk.field_a = 3;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                            ck.field_e = false;
                            stackIn_95_0 = wk.field_a;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        return stackIn_95_0;
                    }
                    case 96: {
                        try {
                            if (param1 == 650) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var10 = (String) null;
                            ad.a(-115, 60, false, false, (String) null, (String) null);
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (ol.field_g != null) {
                                statePc = 107;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (ck.field_e) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var6_int = cg.field_g;
                            cg.field_g = id.field_m;
                            id.field_m = var6_int;
                            ck.field_e = true;
                            if (var9 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (30000L >= wf.a(84)) {
                                statePc = 104;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            sl.field_n = kj.field_E;
                            if (var9 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            sl.field_n = hh.field_p;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            ck.field_e = false;
                            stackIn_106_0 = 3;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        return stackIn_106_0;
                    }
                    case 107: {
                        try {
                            stackIn_108_0 = -1;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        return stackIn_108_0;
                    }
                    case 109: {
                        var6_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_111_0 = (RuntimeException) (var6_ref);
                        stackIn_110_0 = stackIn_111_0;
                        stackIn_111_1 = new StringBuilder().append("ad.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                        stackIn_110_1 = stackIn_111_1;
                        if (param4 == null) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    }
                    case 110: {
                        stackIn_112_0 = (RuntimeException) ((Object) stackIn_110_0);
                        stackIn_112_1 = (StringBuilder) ((Object) stackIn_110_1);
                        stackIn_112_2 = "{...}";
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 111: {
                        stackIn_112_0 = (RuntimeException) ((Object) stackIn_111_0);
                        stackIn_112_1 = (StringBuilder) ((Object) stackIn_111_1);
                        stackIn_112_2 = "null";
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        stackIn_114_0 = (RuntimeException) ((Object) stackIn_112_0);
                        stackIn_113_0 = stackIn_114_0;
                        stackIn_114_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',');
                        stackIn_113_1 = stackIn_114_1;
                        if (param5 == null) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    }
                    case 113: {
                        stackIn_115_0 = (RuntimeException) ((Object) stackIn_113_0);
                        stackIn_115_1 = (StringBuilder) ((Object) stackIn_113_1);
                        stackIn_115_2 = "{...}";
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 114: {
                        stackIn_115_0 = (RuntimeException) ((Object) stackIn_114_0);
                        stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
                        stackIn_115_2 = "null";
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        throw la.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -81) {
                break L1;
              } else {
                this.c((String) (this.field_h[13]), (byte) 11);
                break L1;
              }
            }
            if (!this.a(85)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_b.a(true, ra.a((byte) -117, var4));
              stackIn_7_0 = this.b(var3_int, 11619);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ad.Q(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
