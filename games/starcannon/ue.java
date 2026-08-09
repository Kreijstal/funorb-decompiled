/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private Object[][] field_g;
    private ti field_a;
    private int field_i;
    private ak field_b;
    static int field_e;
    static int[] field_c;
    static int field_f;
    private boolean field_d;
    private Object[] field_h;

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
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
            if (!param1) {
              if (!this.b((byte) 99)) {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_b.field_l.a((byte) 0, ne.a(param1, var4));
                if (this.a((byte) -76, var3_int)) {
                  stackIn_11_0 = var3_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = -78;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ue.C(");

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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final int a(String param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_5_0 = 0;
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
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (String) null;
                this.a((String) null, (String) null, (byte) -41);
                break L1;
              }
            }
            if (!this.a((byte) -76, param2)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_b.field_s[param2].a((byte) 127, ne.a(false, var6));
              if (!this.a(var4_int, 117, param2)) {
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

            stackIn_12_1 = new StringBuilder().append("ue.L(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = StarCannon.field_A;
        if (!this.b((byte) 114)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_b.field_g.length) {
              L1: {
                if (param0 == 29741) {
                  break L1;
                } else {
                  this.a(53, (String) (this.field_h[3]));
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_b.field_g[var3];
              if (this.field_h[var4] == null) {
                this.d(var4, 0);
                if (this.field_h[var4] == null) {
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

    final synchronized int a(int param0, int param1) {
        if (!(this.a((byte) -76, param1))) {
            return 0;
        }
        if (null != this.field_h[param1]) {
            return 100;
        }
        if (param0 != 100) {
            this.a((String) (this.field_h[21]), ((boolean[]) (((Object[]) (this.field_h[12]))[31]))[0]);
        }
        return this.field_a.a(param1, true);
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (-1L == (param0 % 37L ^ -1L)) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = rh.field_j[(int)(var7 + -(37L * param0))];
            if (var9 == 95) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
        }
        if (param1 != 16778) {
            return (String) null;
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
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
            if (this.b((byte) 109)) {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var7 = (CharSequence) ((Object) param0);
              var4_int = this.field_b.field_l.a((byte) 21, ne.a(false, var7));
              if (this.a((byte) -76, var4_int)) {
                var5 = -85 / ((param1 - -35) / 41);
                var8 = (CharSequence) ((Object) param2);
                var6 = this.field_b.field_s[var4_int].a((byte) -128, ne.a(false, var8));
                stackIn_7_0 = this.a(var4_int, true, var6);
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

            stackIn_10_1 = new StringBuilder().append("ue.N(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, String param1) {
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
            if (this.b((byte) 100)) {
              L1: {
                if (param0 == -20955) {
                  break L1;
                } else {
                  this.field_i = 24;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_b.field_l.a((byte) -126, ne.a(false, var4));
              if (-1 < (var3_int ^ -1)) {
                stackIn_8_0 = 0;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ue.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (!this.b((byte) 111)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 >= 74) {
                  break L1;
                } else {
                  ((byte[]) (this.field_h[3]))[0] = ((byte[]) (((Object[]) (this.field_h[0]))[9]))[13];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_l.a((byte) -21, ne.a(false, var4));
              stackIn_7_0 = this.a(100, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ue.J(");

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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = StarCannon.field_A;
        if (this.b((byte) 123)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (this.field_h.length <= var4) {
              if (var2 != 0) {
                L1: {
                  if (param0 > 37) {
                    break L1;
                  } else {
                    this.field_i = ((int[]) (((Object[]) (this.field_h[4]))[8]))[1];
                    break L1;
                  }
                }
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (this.field_b.field_i[var4] > 0) {
                var3 = var3 + this.a(100, var4);
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

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            return (byte[]) null;
        }
        return this.a((int[]) null, param0, param2, true);
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_b) {
            this.field_b = this.field_a.b((byte) -84);
            if (this.field_b == null) {
                return false;
            }
            this.field_h = new Object[this.field_b.field_m];
            this.field_g = new Object[this.field_b.field_m][];
        }
        if (param0 <= 87) {
            this.field_a = (ti) null;
            return true;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
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
            if (this.b((byte) 92)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -17) {
                  break L1;
                } else {
                  ue.a((ue) null, (byte) 1, -121, ((int[]) (this.field_h[2]))[5], (ue) (this.field_h[0]));
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_b.field_l.a((byte) -125, ne.a(false, var6));
              if (this.a((byte) -76, var4_int)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_b.field_s[var4_int].a((byte) 9, ne.a(false, var7));
                stackIn_9_0 = this.a((byte) -93, var4_int, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ue.I(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.a((byte) -76, param0))) {
            return false;
        }
        if (this.field_h[param0] != null) {
            return true;
        }
        this.d(param0, 0);
        if (param1 > -24) {
            return false;
        }
        if (this.field_h[param0] != null) {
            return true;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = (int[]) null;
        }
        field_c = null;
    }

    private final synchronized void d(int param0, int param1) {
        if (!this.field_d) {
            this.field_h[param0] = d.a(false, (byte) 119, this.field_a.b(param0, false));
        } else {
            this.field_h[param0] = this.field_a.b(param0, false);
        }
        if (param1 != 0) {
            ((int[]) (this.field_h[1]))[5] = 92;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 <= 106) {
            return false;
        }
        if (!(this.b((byte) 94))) {
            return false;
        }
        if ((param2 ^ -1) <= -1 && param0 >= 0 && param2 < this.field_b.field_j.length && param0 < this.field_b.field_j[param2]) {
            return true;
        }
        if (!gf.field_d) {
            return false;
        }
        throw new IllegalArgumentException(param2 + " " + param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
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
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = StarCannon.field_A;
        try {
          L0: {
            if (!this.a((byte) -76, param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_h[param0]) {
                L1: {
                  var5_int = this.field_b.field_i[param0];
                  var34 = this.field_b.field_k[param0];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_g[param0]) {
                    array$0 = new Object[this.field_b.field_j[param0]];
                    this.field_g[param0] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_g[param0];
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
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (-1 != (param3[0] ^ -1)) {
                              break L7;
                            } else {
                              if (0 != param3[1]) {
                                break L7;
                              } else {
                                if (param3[2] != 0) {
                                  break L7;
                                } else {
                                  if (param3[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = dk.a((byte) -56, this.field_h[param0], true);
                          var25 = var35;
                          var9 = var25;
                          var26 = new rb(var35);
                          var26.a(param3, var26.field_f.length, -84, 5);
                          break L5;
                        }
                      }
                      var9 = dk.a((byte) 90, this.field_h[param0], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = hc.a((byte) 74, var9);
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
                      throw sd.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param0 + " " + param3.length + " " + mg.a(param3.length, var9, (byte) -69) + " " + mg.a(-2 + param3.length, var9, (byte) -110) + " " + this.field_b.field_c[param0] + " " + this.field_b.field_b);
                    }
                    L10: {
                      if (!this.field_d) {
                        break L10;
                      } else {
                        this.field_h[param0] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (param2 < -15) {
                        break L11;
                      } else {
                        this.field_a = (ti) null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int <= 1) {
                        L13: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L13;
                          } else {
                            var11 = 0;
                            break L13;
                          }
                        }
                        if (-1 == (this.field_i ^ -1)) {
                          var7[var11] = d.a(false, (byte) 123, var43);
                          break L12;
                        } else {
                          var7[var11] = var36;
                          break L12;
                        }
                      } else {
                        if ((this.field_i ^ -1) != -3) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var31 = new rb(var43);
                          var31.field_g = var11;
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L14: while (true) {
                            if (var15_int >= var12) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L15: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_g = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L17: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L18: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L18;
                                            } else {
                                              var18 = var17;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (-1 == (this.field_i ^ -1)) {
                                              var7[var18] = d.a(false, (byte) -21, var40[var17]);
                                              break L19;
                                            } else {
                                              var7[var18] = var40[var17];
                                              break L19;
                                            }
                                          }
                                          var17++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L20: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L16;
                                        } else {
                                          var18 = var18 + var31.f((byte) -100);
                                          ug.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L15;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L21: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L14;
                                } else {
                                  var16 = var16 + var31.f((byte) -79);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var29 = new rb(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_g = var11;
                          var16 = 0;
                          L22: while (true) {
                            if (var12 <= var16) {
                              if (var14_int != 0) {
                                var44 = new byte[var14_int];
                                var29.field_g = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L23: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = var44;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L24: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L23;
                                      } else {
                                        L25: {
                                          var19 = var19 + var29.f((byte) -87);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L25;
                                          } else {
                                            var21 = var20;
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (var21 == param1) {
                                            ug.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_57_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L22;
                                } else {
                                  L28: {
                                    var17 = var17 + var29.f((byte) -119);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L28;
                                    } else {
                                      var19 = var34[var18];
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (var19 == param1) {
                                      var15_int = var19;
                                      var14_int = var14_int + var17;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_102_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var5 = decompiledCaughtException;
            stackIn_105_0 = (RuntimeException) (var5);

            stackIn_105_1 = new StringBuilder().append("ue.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "null";
              break L30;
            } else {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "{...}";
              break L30;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0 != 0;
              } else {
                return stackIn_102_0 != 0;
              }
            }
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param2, 122, param1)) {
              L1: {
                var5 = null;
                if (param3) {
                  break L1;
                } else {
                  this.field_b = (ak) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (this.field_g[param1] == null) {
                    break L3;
                  } else {
                    if (this.field_g[param1][param2] == null) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param1, param2, -65, param0)) {
                  this.d(param1, 0);
                  if (this.a(param1, param2, -52, param0)) {
                    break L2;
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_g[param1] == null) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (this.field_g[param1][param2] == null) {
                    break L4;
                  } else {
                    var7 = dk.a((byte) -87, this.field_g[param1][param2], false);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (1 == this.field_i) {
                      this.field_g[param1][param2] = null;
                      if ((this.field_b.field_j[param1] ^ -1) != -2) {
                        break L5;
                      } else {
                        this.field_g[param1] = null;
                        break L5;
                      }
                    } else {
                      if ((this.field_i ^ -1) != -3) {
                        break L5;
                      } else {
                        this.field_g[param1] = null;
                        break L5;
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = var5;

            stackIn_29_1 = new StringBuilder().append("ue.R(");

            if (param0 == null) {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_12_0);
          } else {
            return (byte[]) ((Object) stackIn_26_0);
          }
        }
    }

    final static int b(int param0, int param1) {
        if (param1 <= 118) {
            return -2;
        }
        param0 = param0 & 8191;
        if (-4097 >= (param0 ^ -1)) {
            return 6144 > param0 ? -bd.field_c[6144 - param0] : bd.field_c[param0 + -6144];
        }
        return param0 < 2048 ? bd.field_c[-param0 + 2048] : -bd.field_c[-2048 + param0];
    }

    final static i a(ue param0, byte param1, int param2, int param3, ue param4) {
        RuntimeException var5 = null;
        i stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -57) {
                break L1;
              } else {
                ue.b(-26);
                break L1;
              }
            }
            if (qb.a((byte) -106, param3, param2, param4)) {
              stackIn_6_0 = oe.a(5, param0.a(param3, true, param2));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ue.U(");

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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        byte[] discarded$0 = null;
        if (param0 != -76) {
            discarded$0 = this.a((int[]) null, 34, -53, ((boolean[]) (this.field_h[16]))[11]);
        }
        if (!(this.b((byte) 120))) {
            return false;
        }
        if (0 > param1 || this.field_b.field_j.length <= param1 || 0 == this.field_b.field_j[param1]) {
            if (!gf.field_d) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    ue(ti param0, boolean param1, int param2) {
        this.field_b = null;
        try {
            if (-1 < (param2 ^ -1) || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_a = param0;
            this.field_i = param2;
            this.field_d = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (param1 == -9883) {
              if (this.b((byte) 108)) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_b.field_l.a((byte) -117, ne.a(false, var4));
                stackIn_7_0 = this.c(var3_int, -116);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ue.G(");

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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, 116, param1)) {
            return false;
        }
        if (null != this.field_g[param1]) {
            if (!(null == this.field_g[param1][param2])) {
                return true;
            }
        }
        if (null != this.field_h[param1]) {
            return true;
        }
        this.d(param1, param0 ^ -93);
        if (param0 != -93) {
            this.c(-4, ((int[]) (this.field_h[0]))[9]);
        }
        if (this.field_h[param1] != null) {
            return true;
        }
        return false;
    }

    static {
        field_c = new int[]{15, 20, 20, 10, 10};
        field_f = 500;
    }
}
