/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_i;
    private Object[][] field_e;
    static tf field_a;
    private bm field_c;
    private boolean field_h;
    private Object[] field_f;
    static tf field_d;
    private nh field_g;
    private int field_b;
    static String field_j;

    final int a(boolean param0) {
        if (!((rh) this).a(0)) {
            return -1;
        }
        if (param0) {
            return 84;
        }
        return ((rh) this).field_c.field_k.length;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        float var1_float = 0.0f;
        ja var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 > 93) {
                break L1;
              } else {
                rh.a((byte) 28);
                break L1;
              }
            }
            var1_float = 0.0f;
            var2 = (ja) (Object) a.field_d.g(0);
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  int discarded$1 = 14;
                  wc.a(var1_float);
                  if (10000.0f > var1_float) {
                    jc.a(0, false);
                    break L3;
                  } else {
                    if (25600.0f <= var1_float) {
                      jc.a(2, false);
                      break L3;
                    } else {
                      jc.a(1, false);
                      break L3;
                    }
                  }
                }
                break L0;
              } else {
                L4: {
                  var2.field_E = var2.field_E - 1;
                  if (var2.field_E != 0) {
                    break L4;
                  } else {
                    ab.field_f = true;
                    break L4;
                  }
                }
                L5: {
                  if (null == var2.field_K) {
                    L6: {
                      var2.b(true);
                      if (3 != var2.field_z) {
                        break L6;
                      } else {
                        if (!var2.field_t) {
                          break L6;
                        } else {
                          if (0 < var2.field_E) {
                            break L6;
                          } else {
                            w.field_f = true;
                            break L6;
                          }
                        }
                      }
                    }
                    if (var1_float < (var2.field_o - 320.0f) * (-320.0f + var2.field_o) + (var2.field_v - 240.0f) * (var2.field_v - 240.0f)) {
                      var1_float = (-240.0f + var2.field_v) * (-240.0f + var2.field_v) + (-320.0f + var2.field_o) * (-320.0f + var2.field_o);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var2 = (ja) (Object) a.field_d.d(1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "rh.I(" + param0 + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (param0 != -9467) {
            rh.b(91);
        }
        return ((rh) this).field_c.field_k[param1];
    }

    private final synchronized void a(int param0, int param1) {
        if (!((rh) this).field_h) {
            int discarded$1 = 0;
            ((rh) this).field_f[param0] = hf.a(-105, ((rh) this).field_g.b(4, param0));
        } else {
            ((rh) this).field_f[param0] = (Object) (Object) ((rh) this).field_g.b(4, param0);
        }
        if (param1 >= -103) {
            boolean discarded$2 = this.b(((int[]) ((rh) this).field_f[5])[9], 37);
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -28153) {
            boolean discarded$0 = ((rh) this).a((byte) -106, (String) null, (String) ((rh) this).field_f[14]);
        }
        return this.a(param0, true, (int[]) null, param2);
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            if (param0 < -87) {
              if (((rh) this).a(0)) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((rh) this).field_c.field_n.a(true, ab.a(94, var4));
                if (var3_int < 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("rh.O(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final synchronized boolean b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        if (((rh) this).a(0)) {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (((rh) this).field_c.field_i.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((rh) this).field_c.field_i[var3];
              if (((rh) this).field_f[var4] == null) {
                this.a(var4, -119);
                if (null == ((rh) this).field_f[var4]) {
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

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((rh) this).a(0)) {
          return false;
        } else {
          L0: {
            if (0 > param2) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (((rh) this).field_c.field_k.length <= param2) {
                  break L0;
                } else {
                  if (((rh) this).field_c.field_k[param2] > param0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (vf.field_K) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (!this.b(param2, 3)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 <= -55) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4_int = ((rh) this).field_c.field_f[param2].a(true, ab.a(99, var5));
              if (this.b(var4_int, -1, param2)) {
                stackOut_9_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("rh.W(");
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((rh) this).c(70, -80);
        }
        if (((rh) this).field_c != null) {
            return true;
        }
        ((rh) this).field_c = ((rh) this).field_g.a((byte) 113);
        if (((rh) this).field_c == null) {
            return false;
        }
        ((rh) this).field_f = new Object[((rh) this).field_c.field_b];
        ((rh) this).field_e = new Object[((rh) this).field_c.field_b][];
        return true;
    }

    final int a(int param0, String param1) {
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
            if (((rh) this).a(param0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((rh) this).field_c.field_n.a(true, ab.a(84, var4));
              stackOut_3_0 = ((rh) this).b((byte) 85, var3_int);
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
            stackOut_5_1 = new StringBuilder().append("rh.G(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((rh) this).a(0)) {
            return false;
        }
        if (param1 != 3) {
            field_j = null;
        }
        if (param0 >= 0) {
            if (param0 < ((rh) this).field_c.field_k.length) {
                if (((rh) this).field_c.field_k[param0] != 0) {
                    return true;
                }
            }
        }
        if (vf.field_K) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_j = null;
        if (param0 != 30261) {
            field_a = null;
        }
        field_i = null;
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((rh) this).a(0)) {
            return null;
        }
        if (!(((rh) this).field_c.field_k.length != 1)) {
            return ((rh) this).a(0, param0 + -56472, param1);
        }
        if (param0 != 28319) {
            return null;
        }
        if (!this.b(param1, 3)) {
            return null;
        }
        if (!(((rh) this).field_c.field_k[param1] != 1)) {
            return ((rh) this).a(param1, param0 ^ -872, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!(this.b(param1, 3))) {
            return false;
        }
        if (!(((rh) this).field_f[param1] == null)) {
            return true;
        }
        if (param0 != 102) {
            int discarded$0 = ((rh) this).b((byte) -65, 111);
        }
        this.a(param1, -108);
        if (((rh) this).field_f[param1] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
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
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        qc var25 = null;
        byte[] var26 = null;
        qc var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        qc var31 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        int[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        int[] var44 = null;
        byte[][] var45 = null;
        int[] var47 = null;
        byte[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        int[] var51 = null;
        byte[][] var52 = null;
        byte[] var53 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        try {
          L0: {
            if (!this.b(param3, 3)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((rh) this).field_f[param3] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((rh) this).field_c.field_a[param3];
                  var47 = ((rh) this).field_c.field_o[param3];
                  var40 = var47;
                  var33 = var40;
                  var23 = var33;
                  var6 = var23;
                  if (null == ((rh) this).field_e[param3]) {
                    ((rh) this).field_e[param3] = new Object[((rh) this).field_c.field_k[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((rh) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (~var9_int <= ~var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var47[var9_int];
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
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != 0) {
                              break L7;
                            } else {
                              if (param2[1] != 0) {
                                break L7;
                              } else {
                                if (param2[2] != 0) {
                                  break L7;
                                } else {
                                  if (0 != param2[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var48 = uk.a(true, -118, ((rh) this).field_f[param3]);
                          var41 = var48;
                          var34 = var41;
                          var24 = var34;
                          var9_array = var24;
                          var25 = new qc(var48);
                          var25.a((byte) -125, param2, 5, var25.field_j.length);
                          break L5;
                        }
                      }
                      var9_array = uk.a(false, -86, ((rh) this).field_f[param3]);
                      break L5;
                    }
                    try {
                      L8: {
                        int discarded$3 = -1;
                        var49 = v.a(var9_array);
                        var42 = var49;
                        var35 = var42;
                        var26 = var35;
                        var22 = var26;
                        var50 = var22;
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
                        if (param2 == null) {
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
                      throw t.a((Throwable) (Object) stackIn_37_0, (stackIn_37_2 != 0) + " " + param3 + " " + param2.length + " " + gg.a(var9_array, 99, param2.length) + " " + gg.a(var9_array, 77, param2.length - 2) + " " + ((rh) this).field_c.field_q[param3] + " " + ((rh) this).field_c.field_m);
                    }
                    L10: {
                      if (!((rh) this).field_h) {
                        break L10;
                      } else {
                        ((rh) this).field_f[param3] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int <= 1) {
                        L12: {
                          if (var6 != null) {
                            var11 = var47[0];
                            break L12;
                          } else {
                            var11 = 0;
                            break L12;
                          }
                        }
                        if (((rh) this).field_b != 0) {
                          var7[var11] = (Object) (Object) var49;
                          break L11;
                        } else {
                          int discarded$4 = 0;
                          var7[var11] = hf.a(-113, var22);
                          break L11;
                        }
                      } else {
                        if (((rh) this).field_b == 2) {
                          var11 = var49.length;
                          var11--;
                          var12 = 255 & var22[var11];
                          var11 = var11 - var5_int * (var12 * 4);
                          var31 = new qc(var50);
                          var14 = 0;
                          var15 = 0;
                          var31.field_f = var11;
                          var16 = 0;
                          L13: while (true) {
                            if (~var16 <= ~var12) {
                              if (var14 != 0) {
                                var53 = new byte[var14];
                                var31.field_f = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = (Object) (Object) var53;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L15: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var19 = var19 + var31.a((byte) -82);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L16;
                                          } else {
                                            var21 = var47[var20];
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (~var21 != ~param0) {
                                            break L17;
                                          } else {
                                            sf.a(var50, var17, var53, var14, var19);
                                            var14 = var14 + var19;
                                            break L17;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_79_0 = 1;
                                stackIn_80_0 = stackOut_79_0;
                                return stackIn_80_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (~var18 <= ~var5_int) {
                                  var16++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var17 = var17 + var31.a((byte) -126);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L19;
                                    } else {
                                      var19 = var47[var18];
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (param0 == var19) {
                                      var14 = var14 + var17;
                                      var15 = var19;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var18++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var49.length;
                          var11--;
                          var12 = 255 & var22[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var28 = new qc(var50);
                          var51 = new int[var5_int];
                          var44 = var51;
                          var37 = var44;
                          var29 = var37;
                          var14_ref_int__ = var29;
                          var28.field_f = var11;
                          var15 = 0;
                          L21: while (true) {
                            if (var15 >= var12) {
                              var52 = new byte[var5_int][];
                              var45 = var52;
                              var38 = var45;
                              var30 = var38;
                              var15_ref_byte____ = var30;
                              var16 = 0;
                              L22: while (true) {
                                if (~var5_int >= ~var16) {
                                  var28.field_f = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L23: while (true) {
                                    if (~var12 >= ~var17) {
                                      var17 = 0;
                                      L24: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L25: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L25;
                                            } else {
                                              var18 = var47[var17];
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (((rh) this).field_b != 0) {
                                              var7[var18] = (Object) (Object) var52[var17];
                                              break L26;
                                            } else {
                                              int discarded$5 = 0;
                                              var7[var18] = hf.a(-122, var52[var17]);
                                              break L26;
                                            }
                                          }
                                          var17++;
                                          continue L24;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L27: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L23;
                                        } else {
                                          var18 = var18 + var28.a((byte) -106);
                                          sf.a(var49, var16, var52[var19], var51[var19], var18);
                                          var16 = var16 + var18;
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var19++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16] = new byte[var51[var16]];
                                  var51[var16] = 0;
                                  var16++;
                                  continue L22;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L28: while (true) {
                                if (~var17 <= ~var5_int) {
                                  var15++;
                                  continue L21;
                                } else {
                                  var16 = var16 + var28.a((byte) -27);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_99_0 = 1;
                    stackIn_100_0 = stackOut_99_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var5;
            stackOut_101_1 = new StringBuilder().append("rh.J(").append(param0).append(',').append(4).append(',');
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
          throw t.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + ',' + param3 + ')');
        }
        return stackIn_100_0 != 0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, -1, param1))) {
            return false;
        }
        if (param0 != 37) {
            return true;
        }
        if (null != ((rh) this).field_e[param1]) {
            if (!(((rh) this).field_e[param1][param2] == null)) {
                return true;
            }
        }
        if (((rh) this).field_f[param1] != null) {
            return true;
        }
        this.a(param1, -118);
        if (((rh) this).field_f[param1] != null) {
            return true;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_1_0 = null;
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
            if (this.b(param3, -1, param0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((rh) this).field_e[param0] == null) {
                    break L2;
                  } else {
                    if (null != ((rh) this).field_e[param0][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param3, 4, param2, param0)) {
                  this.a(param0, -118);
                  if (this.a(param3, 4, param2, param0)) {
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
              if (((rh) this).field_e[param0] != null) {
                L3: {
                  if (null != ((rh) this).field_e[param0][param3]) {
                    var7 = uk.a(false, -116, ((rh) this).field_e[param0][param3]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (-2 == ((rh) this).field_b) {
                      ((rh) this).field_e[param0][param3] = null;
                      if (((rh) this).field_c.field_k[param0] != 1) {
                        break L4;
                      } else {
                        ((rh) this).field_e[param0] = null;
                        break L4;
                      }
                    } else {
                      if (-3 != ((rh) this).field_b) {
                        break L4;
                      } else {
                        ((rh) this).field_e[param0] = null;
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
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_25_0 = var5;
            stackOut_25_1 = new StringBuilder().append("rh.B(").append(param0).append(',').append(true).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_24_0;
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
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
            if (!((rh) this).a(0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((rh) this).field_c.field_n.a(true, ab.a(124, var4));
              if (!this.b(var3_int, 3)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param0 > 125) {
                    break L1;
                  } else {
                    ((rh) this).field_h = false;
                    break L1;
                  }
                }
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("rh.P(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(String param0, byte param1) {
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
            if (((rh) this).a(0)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 <= -123) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((rh) this).field_c.field_n.a(true, ab.a(69, var4));
              stackOut_5_0 = ((rh) this).a((byte) 102, var3_int);
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
            stackOut_7_1 = new StringBuilder().append("rh.F(");
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        if (!((rh) this).a(0)) {
          return 0;
        } else {
          if (param0 >= 99) {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (((rh) this).field_f.length <= var4) {
                if (var2 != 0) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (((rh) this).field_c.field_a[var4] > 0) {
                  var3 = var3 + ((rh) this).b((byte) 59, var4);
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
            return 9;
          }
        }
    }

    final boolean a(byte param0, String param1, String param2) {
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
            if (!((rh) this).a(0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((rh) this).field_c.field_n.a(true, ab.a(80, var6));
              if (!this.b(var4_int, 3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((rh) this).field_c.field_f[var4_int].a(true, ab.a(93, var7));
                if (param0 == 113) {
                  stackOut_11_0 = ((rh) this).a((byte) 37, var4_int, var5);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((boolean[]) ((Object[]) ((rh) this).field_f[8])[2])[9];
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rh.H(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    rh(nh param0, boolean param1, int param2) {
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
        ((rh) this).field_c = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    ((rh) this).field_b = param2;
                    ((rh) this).field_g = param0;
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
                  ((rh) this).field_h = stackIn_7_1 != 0;
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
            stackOut_9_1 = new StringBuilder().append("rh.<init>(");
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
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
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
            if (((rh) this).a(param0)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((rh) this).field_c.field_n.a(true, ab.a(54, var6));
              if (this.b(var4_int, 3)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((rh) this).field_c.field_f[var4_int].a(true, ab.a(43, var7));
                stackOut_6_0 = ((rh) this).a(var4_int, -28153, var5);
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
            stackOut_8_1 = new StringBuilder().append("rh.Q(").append(param0).append(',');
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int b(byte param0, int param1) {
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (null != ((rh) this).field_f[param1]) {
            return 100;
        }
        if (param0 <= 31) {
            boolean discarded$0 = this.b(-88, ((int[]) ((Object[]) ((rh) this).field_f[0])[2])[7]);
        }
        return ((rh) this).field_g.a(126, param1);
    }

    final static long a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param1 == -48) {
                break L1;
              } else {
                var8 = null;
                break L1;
              }
            }
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + (1 + var6));
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 > 122) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-96 - -var6);
                          break L4;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L4;
                    } else {
                      if (57 < var6) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(-48 + var6 + 27);
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("rh.N(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new tf();
        field_d = new tf();
        field_j = "That name is not available";
    }
}
