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
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        if (!this.c((byte) -121)) {
          return false;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_g.field_f.length) {
              return var2 != 0;
            } else {
              var4 = this.field_g.field_f[var3];
              if (this.field_c[var4] == null) {
                this.c(var4, 115);
                if (this.field_c[var4] == null) {
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
        boolean discarded$0 = false;
        if (!this.a((byte) 48, param1)) {
            return 0;
        }
        if (param0 < 5) {
            discarded$0 = this.a(127, (int[]) (this.field_c[0]), 89, true);
        }
        return this.field_g.field_o[param1];
    }

    final int a(byte param0) {
        if (!(this.c((byte) -121))) {
            return -1;
        }
        int var2 = -50 / ((-34 - param0) / 38);
        return this.field_g.field_o.length;
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(this.c((byte) -121))) {
            return false;
        }
        if (param1) {
            field_d = (ef) null;
        }
        if ((param0 ^ -1) <= -1 && (param2 ^ -1) <= -1 && param0 < this.field_g.field_o.length && this.field_g.field_o[param0] > param2) {
            return true;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -84, param2)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_g.field_j[param2].a(0, bk.a(param1 ^ param1, var5));
              if (!this.a(param2, false, var4_int)) {
                stackIn_6_0 = -1;
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("da.DA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final int d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (this.c((byte) -121)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_e.a(0, bk.a(param0 ^ param0, var4));
              stackIn_4_0 = this.b((byte) 100, var3_int);
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
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("da.O(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.a((byte) -117, param0))) {
            return false;
        }
        if (this.field_c[param0] != null) {
            return true;
        }
        if (param1 != -1) {
            return false;
        }
        this.c(param0, 115);
        if (this.field_c[param0] != null) {
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c((byte) -121)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param2) {
                  break L1;
                } else {
                  da.a(((boolean[]) (((Object[]) (this.field_c[4]))[1]))[4]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_g.field_e.a(0, bk.a(0, var6));
              if (!this.a((byte) 98, var4_int)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_j[var4_int].a(0, bk.a(0, var7));
                stackIn_11_0 = this.a(100, var4_int, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("da.N(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
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
        if (null != this.field_c[param1]) {
            return 100;
        }
        return this.field_j.a(param1, (byte) 31);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param1, false, param2)) {
            return false;
        }
        if (this.field_b[param1] != null) {
            if (!(null == this.field_b[param1][param2])) {
                return true;
            }
        }
        if (!(this.field_c[param1] == null)) {
            return true;
        }
        this.c(param1, 107);
        if (this.field_c[param1] != null) {
            return true;
        }
        if (param0 != 100) {
            ((byte[]) (((Object[]) (this.field_c[5]))[7]))[0] = (byte) 125;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c((byte) -121)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_e.a(0, bk.a(0, var4));
              if (param0 >= 69) {
                if (!this.a((byte) -76, var3_int)) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_6_0 = ((int[]) (((Object[]) (this.field_c[5]))[1]))[1];
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("da.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.c((byte) -121)) {
            return false;
        }
        int var3 = -119 / ((param0 - -33) / 42);
        if (-1 >= (param1 ^ -1) && param1 < this.field_g.field_o.length && -1 != (this.field_g.field_o[param1] ^ -1)) {
            return true;
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
        boolean discarded$0 = false;
        if (param0 != -121) {
            discarded$0 = this.a((byte) 64, 117);
        }
        if (null != this.field_g) {
            return true;
        }
        this.field_g = this.field_j.c(-68);
        if (null == this.field_g) {
            return false;
        }
        this.field_c = new Object[this.field_g.field_l];
        this.field_b = new Object[this.field_g.field_l][];
        return true;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 12257) {
            return (byte[]) null;
        }
        return this.a((int[]) null, param0, -17, param2);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
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
            if (this.a(param1, false, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == this.field_b[param1]) {
                    break L2;
                  } else {
                    if (null != this.field_b[param1][param3]) {
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
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (null == this.field_b[param1]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null == this.field_b[param1][param3]) {
                    break L3;
                  } else {
                    var7 = tk.a((byte) -59, false, this.field_b[param1][param3]);
                    var5 = var7;
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
                    if (1 == this.field_e) {
                      this.field_b[param1][param3] = null;
                      if (1 == this.field_g.field_o[param1]) {
                        this.field_b[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (-3 == (this.field_e ^ -1)) {
                        this.field_b[param1] = null;
                        break L4;
                      } else {
                        var6 = 91 / ((param2 - 50) / 45);
                        return (byte[]) (var5);
                      }
                    }
                  }
                }
                var6 = 91 / ((param2 - 50) / 45);
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

            stackIn_29_1 = new StringBuilder().append("da.U(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_10_0);
          } else {
            return (byte[]) ((Object) stackIn_26_0);
          }
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        int var3 = -45 % ((5 - param1) / 37);
        if (!this.c((byte) -121)) {
            return null;
        }
        if (!(-2 != (this.field_g.field_o.length ^ -1))) {
            return this.b(0, 12257, param0);
        }
        if (!this.a((byte) 74, param0)) {
            return null;
        }
        if (!(-2 != (this.field_g.field_o[param0] ^ -1))) {
            return this.b(param0, 12257, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 < 93) {
            ((boolean[]) (this.field_c[2]))[21] = true;
        }
        if (this.field_h) {
            this.field_c[param0] = this.field_j.a(param0, 0);
        } else {
            this.field_c[param0] = w.a(this.field_j.a(param0, 0), (byte) 7, false);
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
            if (this.c((byte) -121)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 4) {
                  break L1;
                } else {
                  this.field_b = (Object[][]) null;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_e.a(0, bk.a(0, var6));
              if (this.a((byte) 106, var4_int)) {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_g.field_j[var4_int].a(0, bk.a(0, var7));
                stackIn_9_0 = this.b(var4_int, 12257, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("da.F(").append(param0).append(',');

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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_7_0);
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
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 == -66) {
          if (this.c((byte) -121)) {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (var4 >= this.field_c.length) {
                if (-1 != (var2 ^ -1)) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if ((this.field_g.field_r[var4] ^ -1) < -1) {
                  var3 = var3 + this.b((byte) 94, var4);
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
        } else {
          return 45;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (-1 < (param0 ^ -1)) {
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
                var10 = var17;
                var11 = param7;
                var12 = param9;
                var13 = param6;
                var14 = param8;
                var15 = var17[var11] >> 748628833 & 8355711;
                var10[var11] = (fi.a(var14, 33448895) >> -1326618447) - -fi.a(var12 >> 614827233, 16711680) - (-(fi.a(var13, 33423626) >> 242024841) - var15);
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
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("da.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.c((byte) -121)) {
              var3_int = -60 / ((param0 - -39) / 59);
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_g.field_e.a(0, bk.a(0, var5));
              if ((var4 ^ -1) > -1) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("da.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, boolean param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int[] stackIn_28_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_57_0 = 0;
        gb stackIn_57_1 = null;
        int stackIn_58_0 = 0;
        gb stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_93_0 = 0;
        int stackIn_100_0 = 0;
        gb stackIn_100_1 = null;
        int stackIn_101_0 = 0;
        gb stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_110_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
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
        gb var26 = null;
        byte[] var27 = null;
        int[] var29 = null;
        gb var30 = null;
        byte[][] var31 = null;
        gb var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.a((byte) 104, param2)) {
              if (null == this.field_c[param2]) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_g.field_r[param2];
                  var34 = this.field_g.field_a[param2];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_b[param2] == null) {
                    array$0 = new Object[this.field_g.field_o[param2]];
                    this.field_b[param2] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_b[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = var34[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
                          break L4;
                        }
                      }
                      if (var7[var10] == null) {
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
                        this.field_e = 3;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (param1 == null) {
                          break L7;
                        } else {
                          L8: {
                            if (-1 != (param1[0] ^ -1)) {
                              break L8;
                            } else {
                              stackIn_28_0 = (int[]) (param1);
                              if (stackIn_28_0[1] != 0) {
                                break L8;
                              } else {
                                if (0 != param1[2]) {
                                  break L8;
                                } else {
                                  if (-1 == (param1[3] ^ -1)) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var35 = tk.a((byte) -76, true, this.field_c[param2]);
                          var25 = var35;
                          var9 = var25;
                          var26 = new gb(var35);
                          var26.a(param1, 5, 5838, var26.field_l.length);
                          break L6;
                        }
                      }
                      var9 = tk.a((byte) -110, false, this.field_c[param2]);
                      break L6;
                    }
                    try {
                      L9: {
                        var36 = jh.a(var9, 6);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_38_1 = new StringBuilder();

                        if (param1 == null) {
                          stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                          stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackIn_39_2 = 0;
                          break L10;
                        } else {
                          stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                          stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackIn_39_2 = 1;
                          break L10;
                        }
                      }
                      throw fc.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + var9.length + " " + gl.a(var9.length, var9, 125) + " " + gl.a(var9.length + -2, var9, 125) + " " + this.field_g.field_b[param2] + " " + this.field_g.field_d);
                    }
                    L11: {
                      if (this.field_h) {
                        this.field_c[param2] = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if ((var5_int ^ -1) < -2) {
                        if (-3 == (this.field_e ^ -1)) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var32 = new gb(var43);
                          var14 = 0;
                          var32.field_m = var11;
                          var15 = 0;
                          var16 = 0;
                          L13: while (true) {
                            if (var12 <= var16) {
                              if (var14 == 0) {
                                stackIn_93_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14];
                                var14 = 0;
                                var32.field_m = var11;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = var44;
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
                                          stackIn_100_0 = var19;

                                          stackIn_100_1 = (gb) (var32);

                                          if (param3) {
                                            stackIn_101_0 = stackIn_100_0;
                                            stackIn_101_1 = (gb) ((Object) stackIn_100_1);
                                            stackIn_101_2 = 0;
                                            break L16;
                                          } else {
                                            stackIn_101_0 = stackIn_100_0;
                                            stackIn_101_1 = (gb) ((Object) stackIn_100_1);
                                            stackIn_101_2 = 1;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          var19 = stackIn_101_0 + ((gb) (Object) stackIn_101_1).e(stackIn_101_2 != 0);
                                          if (var6 != null) {
                                            var21 = var34[var20];
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
                                            fk.a(var43, var17, var44, var14, var19);
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
                                  var16++;
                                  continue L13;
                                } else {
                                  L20: {
                                    var17 = var17 + var32.e(true);
                                    if (var6 != null) {
                                      var19 = var34[var18];
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
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var30 = new gb(var43);
                          var30.field_m = var11;
                          var38 = new int[var5_int];
                          var29 = var38;
                          var14_ref_int__ = var29;
                          var15 = 0;
                          L22: while (true) {
                            if (var12 <= var15) {
                              var39 = new byte[var5_int][];
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L23: while (true) {
                                if (var5_int <= var16) {
                                  var30.field_m = var11;
                                  var16 = 0;
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
                                              var18 = var34[var17];
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (this.field_e == 0) {
                                              var7[var18] = w.a(var39[var17], (byte) 7, false);
                                              break L27;
                                            } else {
                                              var7[var18] = var39[var17];
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
                                          var18 = var18 + var30.e(true);
                                          fk.a(var43, var16, var39[var19], var38[var19], var18);
                                          var16 = var16 + var18;
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var19++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var38[var16]];
                                  var15_ref_byte____[var16] = array$1;
                                  var38[var16] = 0;
                                  var16++;
                                  continue L23;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L29: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L22;
                                } else {
                                  L30: {
                                    stackIn_57_0 = var16;

                                    stackIn_57_1 = (gb) (var30);

                                    if (param3) {
                                      stackIn_58_0 = stackIn_57_0;
                                      stackIn_58_1 = (gb) ((Object) stackIn_57_1);
                                      stackIn_58_2 = 0;
                                      break L30;
                                    } else {
                                      stackIn_58_0 = stackIn_57_0;
                                      stackIn_58_1 = (gb) ((Object) stackIn_57_1);
                                      stackIn_58_2 = 1;
                                      break L30;
                                    }
                                  }
                                  var16 = stackIn_58_0 + ((gb) (Object) stackIn_58_1).e(stackIn_58_2 != 0);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
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
                            var11 = var34[0];
                            break L31;
                          }
                        }
                        if (this.field_e != 0) {
                          var7[var11] = var43;
                          break L12;
                        } else {
                          var7[var11] = w.a(var36, (byte) 7, false);
                          return true;
                        }
                      }
                    }
                    stackIn_110_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L32: {
            var5 = decompiledCaughtException;
            stackIn_113_0 = (RuntimeException) (var5);

            stackIn_113_1 = new StringBuilder().append("da.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "null";
              break L32;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "{...}";
              break L32;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_114_0), stackIn_114_2 + ',' + param2 + ',' + param3 + ')');
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
                return stackIn_93_0 != 0;
              } else {
                return stackIn_110_0 != 0;
              }
            }
          }
        }
    }

    final static String a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = vd.a(param1, 0, param1.length, 160);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("da.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.c((byte) -121)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_g.field_e.a(param0 ^ param0, bk.a(0, var4));
              stackIn_4_0 = this.a(var3_int, -1);
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
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("da.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    da(wd param0, boolean param1, int param2) {
        this.field_g = null;
        try {
            if (-1 < (param2 ^ -1) || param2 > 2) {
                throw new IllegalArgumentException("");
            }
            this.field_j = param0;
            this.field_e = param2;
            this.field_h = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_i = new ff(6, 0, 4, 2);
        field_d = new ef();
        field_a = new fa[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new fa();
        }
    }
}
