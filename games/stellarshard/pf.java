/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private wf field_e;
    private lh field_h;
    static oj field_b;
    static boolean field_c;
    private int field_g;
    private Object[] field_f;
    private Object[][] field_d;
    private boolean field_a;

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 125) {
              stackIn_4_0 = uj.a(param0, (byte) 98, 10, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -69;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("pf.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        if (param0 != 30300) {
            String var2 = (String) null;
            pf.a(-33, (String) null);
        }
        field_b = null;
    }

    final static pb[] a(String param0, byte param1, String param2, pf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = -50 / ((19 - param1) / 61);
            var4_int = param3.b(param0, (byte) -118);
            var6 = param3.a(var4_int, param2, (byte) -11);
            stackIn_1_0 = vf.a(param3, (byte) -78, var6, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("pf.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final synchronized boolean a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -36) {
            discarded$0 = this.c(((int[]) (((Object[]) (this.field_f[2]))[41]))[5], 113, 73);
        }
        if (this.field_h != null) {
            return true;
        }
        this.field_h = this.field_e.a(-107);
        if (!(this.field_h != null)) {
            return false;
        }
        this.field_d = new Object[this.field_h.field_e][];
        this.field_f = new Object[this.field_h.field_e];
        return true;
    }

    final boolean b(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
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
            if (this.a((byte) -36)) {
              param0 = param0.toLowerCase();
              if (param2 == 42) {
                param1 = param1.toLowerCase();
                var6 = (CharSequence) ((Object) param0);
                var4_int = this.field_h.field_q.a(rl.a(var6, (byte) 58), param2 + 85);
                if (this.b(var4_int, param2 ^ -7256)) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_h.field_c[var4_int].a(rl.a(var7, (byte) 115), 65);
                  stackIn_10_0 = this.b(0, var4_int, var5);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ((boolean[]) (this.field_f[5]))[1];
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

            stackIn_13_1 = new StringBuilder().append("pf.AA(");

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


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final synchronized byte[] a(int param0, int param1, byte param2, int[] param3) {
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        try {
          L0: {
            if (this.c(param1, param0, -21293)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_d[param1] == null) {
                    break L2;
                  } else {
                    if (this.field_d[param1][param0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(0, param1, param0, param3)) {
                  break L1;
                } else {
                  this.a((byte) -78, param1);
                  if (this.a(0, param1, param0, param3)) {
                    break L1;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (this.field_d[param1] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != this.field_d[param1][param0]) {
                    var7 = tf.a(2, false, this.field_d[param1][param0]);
                    var5 = var7;
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
                  var6 = -32 % ((param2 - -60) / 38);
                  if (var5 == null) {
                    break L4;
                  } else {
                    if ((this.field_g ^ -1) == -2) {
                      this.field_d[param1][param0] = null;
                      if (-2 == (this.field_h.field_g[param1] ^ -1)) {
                        this.field_d[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (this.field_g == 2) {
                        this.field_d[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_26_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = var5;

            stackIn_29_1 = new StringBuilder().append("pf.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_9_0);
          } else {
            return (byte[]) ((Object) stackIn_26_0);
          }
        }
    }

    final static n a(int param0, ha param1) {
        n stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param1.e(8, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = mh.a(param1, (byte) -124) ? 1 : 0;
                var4 = mh.a(param1, (byte) -44) ? 1 : 0;
                var5 = new n();
                var5.field_n = (short)param1.e(16, 8);
                var5.field_f = vh.a((byte) 87, var5.field_f, param0, param1);
                var5.field_b = vh.a((byte) 120, var5.field_b, 16, param1);
                var5.field_a = vh.a((byte) 91, var5.field_a, 16, param1);
                var5.field_C = (short)param1.e(16, 8);
                var5.field_l = vh.a((byte) 99, var5.field_l, 16, param1);
                var5.field_z = vh.a((byte) 96, var5.field_z, 16, param1);
                var5.field_m = vh.a((byte) 82, var5.field_m, 16, param1);
                if (var3 != 0) {
                  var5.field_D = (short)param1.e(16, 8);
                  var5.field_r = vh.a((byte) 106, var5.field_r, 16, param1);
                  var5.field_e = vh.a((byte) 54, var5.field_e, 16, param1);
                  var5.field_K = vh.a((byte) 34, var5.field_K, 16, param1);
                  var5.field_M = vh.a((byte) 110, var5.field_M, 16, param1);
                  var5.field_h = vh.a((byte) 84, var5.field_h, 16, param1);
                  var5.field_v = vh.a((byte) 65, var5.field_v, 16, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  param1.e(16, 8);
                  var5.field_H = vh.a((byte) 23, var5.field_H, 16, param1);
                  var5.field_E = vh.a((byte) 88, var5.field_E, 16, param1);
                  var5.field_P = vh.a((byte) 48, var5.field_P, 16, param1);
                  var5.field_s = vh.a((byte) 84, var5.field_s, 16, param1);
                  var5.field_I = vh.a((byte) 116, var5.field_I, 16, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!mh.a(param1, (byte) -79)) {
                  break L3;
                } else {
                  var5.field_c = vh.a((byte) 22, var5.field_c, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!mh.a(param1, (byte) -126)) {
                  break L4;
                } else {
                  var5.field_g = wh.a(16, param1, var5.field_g, (byte) 50);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_g.length <= var7) {
                      if (-1 == (var6 ^ -1)) {
                        var5.field_g = null;
                        break L4;
                      } else {
                        var5.field_N = (byte)(1 + var6);
                        break L4;
                      }
                    } else {
                      if ((255 & var5.field_g[var7]) > var6) {
                        var6 = var5.field_g[var7] & 255;
                        var7++;
                        continue L5;
                      } else {
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackIn_21_0 = (n) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("pf.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -36)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 80), 111);
                if (param0 == 0) {
                  break L1;
                } else {
                  ((byte[]) (this.field_f[3]))[0] = (byte) 66;
                  break L1;
                }
              }
              stackIn_6_0 = this.a(var3_int, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pf.T(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final synchronized boolean c(int param0, int param1, int param2) {
        if (param2 != -21293) {
            return true;
        }
        if (!(this.a((byte) -36))) {
            return false;
        }
        if (param0 < 0 || -1 < (param1 ^ -1) || this.field_h.field_g.length <= param0 || this.field_h.field_g[param0] <= param1) {
            if (!fe.field_b) {
                return false;
            }
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        return true;
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 0) {
            return 20;
        }
        if (!this.b(param0, -7294)) {
            return 0;
        }
        if (!(null == this.field_f[param0])) {
            return 100;
        }
        return this.field_e.a(0, param0);
    }

    final synchronized boolean c(byte param0) {
        byte[] discarded$0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        var5 = stellarshard.field_B;
        if (this.a((byte) -36)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_h.field_k.length) {
              L1: {
                if (param0 == -111) {
                  break L1;
                } else {
                  var6 = (int[]) null;
                  discarded$0 = this.a(((int[]) (this.field_f[0]))[4], ((int[]) (this.field_f[0]))[6], (byte) 73, (int[]) null);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_h.field_k[var3];
              if (this.field_f[var4] == null) {
                this.a((byte) -85, var4);
                if (this.field_f[var4] == null) {
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

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param0, -7294)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -11) {
                  break L1;
                } else {
                  this.a((byte) -32, -9);
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_h.field_c[param0].a(rl.a(var5, (byte) 88), param2 ^ 117);
              if (this.c(param0, var4_int, param2 ^ 21286)) {
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("pf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = stellarshard.field_B;
        if (this.a((byte) -36)) {
          L0: {
            var2 = 0;
            if (param0 == 1) {
              break L0;
            } else {
              this.a((byte) 33, -59);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (var4 >= this.field_f.length) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if ((this.field_h.field_p[var4] ^ -1) < -1) {
                var3 = var3 + this.a(var4, param0 ^ 1);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + gg.a(param1, "\n", "%0a", 97));
        if (param0 != 17651) {
            pf.a(20);
        }
    }

    final synchronized byte[] a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -36)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                var7 = (CharSequence) ((Object) param0);
                var4_int = this.field_h.field_q.a(rl.a(var7, (byte) 72), 0);
                if (param2 == -12) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.b((String) null, (String) null, (byte) 114);
                  break L1;
                }
              }
              if (this.b(var4_int, -7294)) {
                var8 = (CharSequence) ((Object) param1);
                var5 = this.field_h.field_c[var4_int].a(rl.a(var8, (byte) 97), -125);
                stackIn_9_0 = this.a(var5, 16, var4_int);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("pf.K(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.c(param1, param2, -21293)) {
            return false;
        }
        if (param0 != 0) {
            this.field_e = (wf) null;
        }
        if (this.field_d[param1] != null) {
            if (!(null == this.field_d[param1][param2])) {
                return true;
            }
        }
        if (!(null == this.field_f[param1])) {
            return true;
        }
        this.a((byte) 118, param1);
        if (null != this.field_f[param1]) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, byte param1) {
        int var3 = 48 / ((param1 - 72) / 51);
        if (!this.b(param0, -7294)) {
            return false;
        }
        if (!(this.field_f[param0] == null)) {
            return true;
        }
        this.a((byte) -103, param0);
        if (null == this.field_f[param0]) {
            return false;
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.a((byte) -36)) {
            return false;
        }
        if (param1 != -7294) {
            discarded$0 = this.b(((int[]) (((Object[]) (this.field_f[2]))[11]))[5], -36);
        }
        if ((param0 ^ -1) <= -1 && param0 < this.field_h.field_g.length && 0 != this.field_h.field_g[param0]) {
            return true;
        }
        if (!fe.field_b) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -36)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 95), 122);
              if (0 > var3_int) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == -116) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.a((byte) 95);
                  return true;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("pf.O(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.a((byte) -36)) {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_h.field_q.a(rl.a(var4, (byte) 124), param1 + -17);
                if (param1 == -109) {
                  break L1;
                } else {
                  this.field_h = (lh) null;
                  break L1;
                }
              }
              stackIn_6_0 = this.a(var3_int, (byte) -121);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pf.A(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    private final synchronized void a(byte param0, int param1) {
        int var3 = -23 / ((param0 - 7) / 54);
        if (this.field_a) {
            this.field_f[param1] = this.field_e.a((byte) 35, param1);
        } else {
            this.field_f[param1] = ch.a(136, false, this.field_e.a((byte) 35, param1));
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != 16) {
            this.field_a = false;
        }
        return this.a(param0, param2, (byte) -98, (int[]) null);
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        ka var26 = null;
        byte[] var27 = null;
        ka var29 = null;
        ka var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = stellarshard.field_B;
        try {
          L0: {
            if (!this.b(param1, -7294)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_f[param1]) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_h.field_p[param1];
                  var34 = this.field_h.field_b[param1];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_d[param1] == null) {
                    array$0 = new Object[this.field_h.field_g[param1]];
                    this.field_d[param1] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_d[param1];
                var8 = 1;
                var9_int = param0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var34[var9_int];
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
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param3[0] != 0) {
                              break L7;
                            } else {
                              if (-1 != (param3[1] ^ -1)) {
                                break L7;
                              } else {
                                if (param3[2] != 0) {
                                  break L7;
                                } else {
                                  if (0 != param3[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = tf.a(2, true, this.field_f[param1]);
                          var25 = var35;
                          var9 = var25;
                          var26 = new ka(var35);
                          var26.a(99, param3, 5, var26.field_r.length);
                          break L5;
                        }
                      }
                      var9 = tf.a(2, false, this.field_f[param1]);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = sl.a((byte) -76, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_35_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_35_1 = new StringBuilder();

                        if (param3 == null) {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 0;
                          break L9;
                        } else {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 1;
                          break L9;
                        }
                      }
                      throw ma.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param1 + " " + var9.length + " " + bg.a(var9.length, var9, 0) + " " + bg.a(var9.length + -2, var9, 0) + " " + this.field_h.field_l[param1] + " " + this.field_h.field_m);
                    }
                    L10: {
                      if (this.field_a) {
                        this.field_f[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((var5_int ^ -1) < -2) {
                        if (2 != this.field_g) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * (var12 * 4);
                          var31 = new ka(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_k = var11;
                          var15_int = 0;
                          L12: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L13: while (true) {
                                if (var5_int <= var16) {
                                  var31.field_k = var11;
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
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L16;
                                            } else {
                                              var18 = var17;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (-1 != (this.field_g ^ -1)) {
                                              var7[var18] = var40[var17];
                                              break L17;
                                            } else {
                                              var7[var18] = ch.a(136, false, var40[var17]);
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
                                          var18 = var18 + var31.b(false);
                                          ri.a(var43, var16, var40[var19], var39[var19], var18);
                                          var14[var19] = var14[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L13;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L12;
                                } else {
                                  var16 = var16 + var31.b(false);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var5_int * (var12 * 4);
                          var29 = new ka(var43);
                          var14_int = 0;
                          var29.field_k = var11;
                          var15_int = 0;
                          var16 = 0;
                          L20: while (true) {
                            if (var12 <= var16) {
                              if (var14_int == 0) {
                                stackIn_63_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14_int];
                                var14_int = 0;
                                var29.field_k = var11;
                                var17 = 0;
                                var18 = 0;
                                L21: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L22: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L21;
                                      } else {
                                        L23: {
                                          var19 = var19 + var29.b(false);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L23;
                                          } else {
                                            var21 = var34[var20];
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (var21 != param2) {
                                            break L24;
                                          } else {
                                            ri.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
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
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L20;
                                } else {
                                  L26: {
                                    var17 = var17 + var29.b(false);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L26;
                                    } else {
                                      var19 = var18;
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (var19 == param2) {
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
                            var11 = var34[0];
                            break L28;
                          } else {
                            var11 = 0;
                            break L28;
                          }
                        }
                        if (-1 != (this.field_g ^ -1)) {
                          var7[var11] = var43;
                          break L11;
                        } else {
                          var7[var11] = ch.a(ih.a(param0, 136), false, var36);
                          return true;
                        }
                      }
                    }
                    stackIn_101_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var5);

            stackIn_104_1 = new StringBuilder().append("pf.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L29;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L29;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_63_0 != 0;
              } else {
                return stackIn_101_0 != 0;
              }
            }
          }
        }
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -36)) {
              L1: {
                if (param1 == -118) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (String) null, (byte) 45);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_h.field_q.a(rl.a(var5, (byte) 79), -128);
              if (this.b(var3_int, -7294)) {
                stackIn_9_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("pf.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            if (param1 != 123) {
                CharSequence var3 = (CharSequence) null;
                pf.a((CharSequence) null, (byte) 96);
            }
            be.a(param0, "", (byte) 110);
            wf.a(63, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pf.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pf(wf param0, boolean param1, int param2) {
        this.field_h = null;
        try {
            if ((param2 ^ -1) > -1 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_e = param0;
            this.field_g = param2;
            this.field_a = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new oj();
    }
}
