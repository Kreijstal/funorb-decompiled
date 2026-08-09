/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private kl field_a;
    static int[] field_j;
    private Object[] field_c;
    static int field_b;
    private tf field_l;
    static int[][][] field_g;
    private boolean field_i;
    static qe[] field_n;
    private int field_m;
    private Object[][] field_p;
    static String field_k;
    static int field_e;
    static cf field_r;
    static ka[] field_h;
    static String field_d;
    static ka[] field_o;
    static ka field_f;
    static boolean field_q;

    final synchronized int a(int param0, byte param1) {
        if (param1 != 12) {
            return -38;
        }
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (this.field_c[param0] != null) {
            return 100;
        }
        return this.field_a.a(0, param0);
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
            if (this.b(-7957)) {
              if (param0 == -39) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_l.field_p.a((byte) 90, wh.a((byte) 68, var4));
                if (var3_int >= 0) {
                  stackIn_10_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("lj.F(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!this.b(-7957)) {
            return null;
        }
        if (!(1 != this.field_l.field_g.length)) {
            return this.c(0, param0, 0);
        }
        if (!this.a((byte) 27, param0)) {
            return null;
        }
        int var3 = 82 / ((param1 - 82) / 32);
        if (1 == this.field_l.field_g[param0]) {
            return this.c(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 > 31) {
          if (!this.b(-7957)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (this.field_c.length <= var4) {
                if (var2 != 0) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (-1 > (this.field_l.field_e[var4] ^ -1)) {
                  var3 = var3 + this.a(var4, (byte) 12);
                  var2 += 100;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -78;
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, -122)) {
            return false;
        }
        if (null != this.field_p[param2] && this.field_p[param2][param0] != null) {
            return true;
        }
        if (this.field_c[param2] != null) {
            return true;
        }
        int var4 = -107 % ((param1 - -23) / 56);
        this.b(param2, -124);
        if (this.field_c[param2] == null) {
            return false;
        }
        return true;
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b(-7957)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 5) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.b(79, (String) null, (String) null);
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_l.field_p.a((byte) 126, wh.a((byte) 68, var5));
              stackIn_7_0 = this.a(true, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lj.Q(").append(param0).append(',');

            if (param1 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!(this.b(param0 + -7984))) {
            return false;
        }
        if (param0 != 27) {
            return true;
        }
        if (0 > param1 || param1 >= this.field_l.field_g.length || this.field_l.field_g[param1] == 0) {
            if (!vh.field_a) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
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
            if (!this.b(-7957)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -64 % ((param1 - -10) / 36);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_l.field_p.a((byte) 116, wh.a((byte) 68, var5));
              if (!this.a((byte) 27, var4)) {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lj.J(");

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
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!param0) {
            return false;
        }
        if (!this.a((byte) 27, param1)) {
            return false;
        }
        if (null != this.field_c[param1]) {
            return true;
        }
        this.b(param1, -108);
        if (this.field_c[param1] != null) {
            return true;
        }
        return false;
    }

    final static String a(byte param0) {
        if (!(mf.field_a != null)) {
            return "";
        }
        if (param0 > -70) {
            field_r = (cf) null;
        }
        return mf.field_a;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
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
            if (this.b(param0 + -7955)) {
              if (param0 == -2) {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_l.field_p.a((byte) -39, wh.a((byte) 68, var6));
                if (this.a((byte) 27, var4_int)) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_l.field_s[var4_int].a((byte) 101, wh.a((byte) 68, var7));
                  stackIn_10_0 = this.c(var4_int, var5, 0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackIn_5_0 = (byte[]) null;
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("lj.W(").append(param0).append(',');

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
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != -7957) {
            this.a(((int[]) (this.field_c[1]))[2], -17, ((int[]) (this.field_c[3]))[1]);
        }
        if (null == this.field_l) {
            this.field_l = this.field_a.b(0);
            if (this.field_l == null) {
                return false;
            }
            this.field_p = new Object[this.field_l.field_r][];
            this.field_c = new Object[this.field_l.field_r];
        }
        return true;
    }

    private final synchronized void b(int param0, int param1) {
        if (this.field_i) {
            this.field_c[param0] = this.field_a.a(param0, (byte) -72);
        } else {
            this.field_c[param0] = ah.a(false, false, this.field_a.a(param0, (byte) -72));
        }
        int var3 = -73 / ((-26 - param1) / 43);
    }

    final boolean b(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
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
            if (!this.b(-7957)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_l.field_p.a((byte) -57, wh.a((byte) 68, var6));
              if (!this.a((byte) 27, var4_int)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 < -16) {
                    break L1;
                  } else {
                    this.a(((int[]) (this.field_c[4]))[6], ((int[]) (this.field_c[1]))[0]);
                    break L1;
                  }
                }
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_l.field_s[var4_int].a((byte) 87, wh.a((byte) 68, var7));
                stackIn_11_0 = this.a(var5, -109, var4_int);
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

            stackIn_14_1 = new StringBuilder().append("lj.A(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final int a(int param0, String param1) {
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
            if (this.b(-7957)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_l.field_p.a((byte) -120, wh.a((byte) 68, var4));
                if (param0 >= 99) {
                  break L1;
                } else {
                  lj.a(30);
                  break L1;
                }
              }
              stackIn_6_0 = this.a(var3_int, (byte) 12);
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

            stackIn_9_1 = new StringBuilder().append("lj.K(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final synchronized boolean a(int param0, byte param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
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
        uf var26 = null;
        byte[] var27 = null;
        uf var29 = null;
        uf var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.a((byte) 27, param3)) {
              if (this.field_c[param3] == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_l.field_e[param3];
                  var34 = this.field_l.field_A[param3];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_p[param3] == null) {
                    array$0 = new Object[this.field_l.field_g[param3]];
                    this.field_p[param3] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_p[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (null != var6) {
                          var10 = var34[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
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
                        if (null == param2) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param2[1]) {
                                break L7;
                              } else {
                                if (-1 != (param2[2] ^ -1)) {
                                  break L7;
                                } else {
                                  if (-1 != (param2[3] ^ -1)) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = of.a((byte) 125, true, this.field_c[param3]);
                          var25 = var35;
                          var9 = var25;
                          var26 = new uf(var35);
                          var26.a(false, param2, var26.field_m.length, 5);
                          break L5;
                        }
                      }
                      var9 = of.a((byte) -109, false, this.field_c[param3]);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = pg.a(param1 + -1048551, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_34_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_34_1 = new StringBuilder();

                        if (param2 == null) {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 0;
                          break L9;
                        } else {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 1;
                          break L9;
                        }
                      }
                      throw oj.a((Throwable) ((Object) stackIn_35_0), (stackIn_35_2 != 0) + " " + param3 + " " + param2.length + " " + k.a(var9, param2.length, 0) + " " + k.a(var9, -2 + param2.length, 0) + " " + this.field_l.field_t[param3] + " " + this.field_l.field_k);
                    }
                    L10: {
                      if (!this.field_i) {
                        break L10;
                      } else {
                        this.field_c[param3] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if ((var5_int ^ -1) >= -2) {
                        L12: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L12;
                          } else {
                            var11 = 0;
                            break L12;
                          }
                        }
                        if (this.field_m != 0) {
                          var7[var11] = var43;
                          break L11;
                        } else {
                          var7[var11] = ah.a(false, false, var36);
                          break L11;
                        }
                      } else {
                        if (this.field_m != 2) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var31 = new uf(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_q = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_q = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var34[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (-1 == (this.field_m ^ -1)) {
                                              var7[var18] = ah.a(false, false, var40[var17]);
                                              break L18;
                                            } else {
                                              var7[var18] = var40[var17];
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.i(42);
                                          he.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.i(param1 + 69);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var29 = new uf(var43);
                          var14_int = 0;
                          var29.field_q = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (var16 >= var12) {
                              if (var14_int != 0) {
                                var44 = new byte[var14_int];
                                var14_int = 0;
                                var29.field_q = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.i(28);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var34[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param0 != var21) {
                                            break L25;
                                          } else {
                                            he.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_53_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.i(param1 ^ -126);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var34[var18];
                                      break L27;
                                    }
                                  }
                                  if (param0 == var19) {
                                    var14_int = var14_int + var17;
                                    var15_int = var19;
                                    var18++;
                                    continue L26;
                                  } else {
                                    var18++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1 == -25) {
                      stackIn_100_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_98_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_21_0 = 1;
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
          L28: {
            var5 = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var5);

            stackIn_103_1 = new StringBuilder().append("lj.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L28;
            } else {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L28;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_53_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_98_0 != 0;
                } else {
                  return stackIn_100_0 != 0;
                }
              }
            }
          }
        }
    }

    final int c(byte param0) {
        if (!this.b(-7957)) {
            return -1;
        }
        if (param0 != 52) {
            return -128;
        }
        return this.field_l.field_g.length;
    }

    final int a(int param0, int param1) {
        byte[] discarded$0 = null;
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (param1 >= -69) {
            int[] var4 = (int[]) null;
            discarded$0 = this.a((int[]) null, -124, -72, 97);
        }
        return this.field_l.field_g[param0];
    }

    final synchronized boolean b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        Object stackIn_12_0 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!this.b(-7957)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (this.field_l.field_y.length <= var3) {
              L1: {
                if (param0 == 79) {
                  break L1;
                } else {
                  stackIn_12_0 = this.field_c[0];
                  field_r = (cf) ((Object) stackIn_12_0);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_l.field_y[var3];
              if (this.field_c[var4] == null) {
                this.b(var4, -92);
                if (null == this.field_c[var4]) {
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

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
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
            if (!this.a((byte) 27, param0)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var5 = (CharSequence) ((Object) param1);
                var4_int = this.field_l.field_s[param0].a((byte) 116, wh.a((byte) 68, var5));
                if (param2 >= 81) {
                  break L1;
                } else {
                  this.c((byte) 106);
                  break L1;
                }
              }
              if (!this.b(param0, var4_int, -100)) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("lj.I(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        byte[] stackIn_5_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.b(param1, param3, -77)) {
              var5 = null;
              if (param2 <= -22) {
                L1: {
                  L2: {
                    if (this.field_p[param1] == null) {
                      break L2;
                    } else {
                      if (this.field_p[param1][param3] != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!this.a(param3, (byte) -25, param0, param1)) {
                    this.b(param1, 121);
                    if (this.a(param3, (byte) -25, param0, param1)) {
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (this.field_p[param1] != null) {
                  L3: {
                    if (this.field_p[param1][param3] != null) {
                      var7 = of.a((byte) -115, false, this.field_p[param1][param3]);
                      var5 = var7;
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
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (this.field_m == 1) {
                        this.field_p[param1][param3] = null;
                        if (-2 != (this.field_l.field_g[param1] ^ -1)) {
                          break L4;
                        } else {
                          this.field_p[param1] = null;
                          break L4;
                        }
                      } else {
                        if (this.field_m != 2) {
                          break L4;
                        } else {
                          this.field_p[param1] = null;
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_28_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackIn_5_0 = (byte[]) (this.field_c[14]);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = var5;

            stackIn_31_1 = new StringBuilder().append("lj.H(");

            if (param0 == null) {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return (byte[]) ((Object) stackIn_28_0);
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (!(this.b(-7957))) {
            return false;
        }
        if (param2 >= -68) {
            discarded$0 = this.a(((int[]) (this.field_c[4]))[13], ((byte[]) (((Object[]) (this.field_c[2]))[0]))[10], (int[]) null, ((int[]) (this.field_c[4]))[0]);
        }
        if (param0 < 0 || 0 > param1 || this.field_l.field_g.length <= param0 || param1 >= this.field_l.field_g[param0]) {
            if (vh.field_a) {
                throw new IllegalArgumentException(param0 + " " + param1);
            }
            return false;
        }
        return true;
    }

    final byte[] c(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param2 != 0) {
            discarded$0 = this.a(((byte[]) (((Object[]) (this.field_c[4]))[5]))[2], -70);
        }
        return this.a((int[]) null, param0, -62, param1);
    }

    lj(kl param0, boolean param1, int param2) {
        this.field_l = null;
        try {
            if (0 > param2 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param1 ? true : false;
            this.field_m = param2;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_f = null;
        field_r = null;
        field_d = null;
        field_k = null;
        field_j = null;
        field_g = (int[][][]) null;
        field_h = null;
        if (param0 != 11446) {
            field_g = (int[][][]) null;
        }
    }

    static {
        field_b = 0;
        field_n = null;
        field_k = "Press <img=2> to exit the tower.";
        field_r = new cf();
        field_d = "Quit";
        field_q = true;
    }
}
