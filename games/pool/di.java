/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int field_b;
    private Object[][] field_c;
    static int field_h;
    private lh field_d;
    private Object[] field_l;
    boolean field_i;
    static int field_e;
    private ad field_f;
    static String field_a;
    static String field_j;
    static int field_g;
    int field_k;

    private final synchronized boolean b(int param0, byte param1) {
        if (!this.d(-38)) {
            return false;
        }
        if (param1 > -58) {
            return ((boolean[]) (this.field_l[1]))[10];
        }
        if (param0 < 0 || this.field_f.field_z.length <= param0 || this.field_f.field_z[param0] == 0) {
            if (!uk.field_c) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final synchronized boolean d(int param0) {
        if (null == this.field_f) {
            this.field_f = this.field_d.b((byte) -21);
            if (!(this.field_f != null)) {
                return false;
            }
            this.field_c = new Object[this.field_f.field_d][];
            this.field_l = new Object[this.field_f.field_d];
        }
        int var2 = -26 / ((8 - param0) / 39);
        return true;
    }

    private final synchronized boolean c(int param0, int param1, int param2) {
        if (!(this.d(param0 ^ -21930))) {
            return false;
        }
        if (0 > param2 || -1 < (param1 ^ -1) || this.field_f.field_z.length <= param2 || this.field_f.field_z[param2] <= param1) {
            if (!uk.field_c) {
                return false;
            }
            throw new IllegalArgumentException(param2 + " " + param1);
        }
        if (param0 != -21918) {
            this.field_f = (ad) null;
            return true;
        }
        return true;
    }

    public static void e(int param0) {
        field_j = null;
        if (param0 != 0) {
            di.a(true, (byte) -103, true);
        }
        field_a = null;
    }

    final synchronized boolean c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pool.field_O;
        if (!this.d(102)) {
          return false;
        } else {
          L0: {
            if (param0 == -63) {
              break L0;
            } else {
              this.field_i = ((boolean[]) (this.field_l[0]))[0];
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (this.field_f.field_m.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_f.field_m[var3];
              if (null == this.field_l[var4]) {
                this.c(var4, -1);
                if (null == this.field_l[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(param0, (byte) -78)) {
            return false;
        }
        if (!(this.field_l[param0] == null)) {
            return true;
        }
        this.c(param0, -1);
        if (!(this.field_l[param0] == null)) {
            return true;
        }
        int var3 = -68 % ((-7 - param1) / 54);
        return false;
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
            if (this.d(106)) {
              param0 = param0.toLowerCase();
              if (param1 == 0) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_f.field_p.a(t.a(29050, var4), (byte) 126);
                stackIn_7_0 = this.a(var3_int, (byte) 53);
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

            stackIn_10_1 = new StringBuilder().append("di.CA(");

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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
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

    final synchronized boolean b(boolean param0, int param1) {
        if (!this.d(75)) {
            return false;
        }
        if (1 == this.field_f.field_z.length) {
            return this.b(param1, 0, 65);
        }
        if (!param0) {
            this.a(-76, -87, 57);
        }
        if (!this.b(param1, (byte) -124)) {
            return false;
        }
        if (this.field_f.field_z[param1] == 1) {
            return this.b(0, param1, 111);
        }
        throw new RuntimeException();
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Pool.field_O;
        if (!this.b(param0, (byte) -63)) {
            return null;
        }
        if (param1 != 0) {
            this.field_i = ((boolean[]) (((Object[]) (this.field_l[0]))[1]))[17];
        }
        int[] var3 = this.field_f.field_k[param0];
        if (!(var3 != null)) {
            var6 = new int[this.field_f.field_s[param0]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.d(74)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var5 = 36 % ((param1 - 40) / 52);
              var7 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_p.a(t.a(29050, var7), (byte) 120);
              if (this.b(var4_int, (byte) -91)) {
                var8 = (CharSequence) ((Object) param0);
                var6 = this.field_f.field_n[var4_int].a(t.a(29050, var8), (byte) 127);
                stackIn_7_0 = this.b(var6, var4_int, 32);
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
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("di.L(");

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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Pool.field_O;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= nn.field_b.length) {
                var3 = param0;
                var1_int = var3;
                L2: while (true) {
                  if (al.field_B.length <= var3) {
                    break L0;
                  } else {
                    al.field_B[var3].a(7096);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                nn.field_b[var1_int].i(25879);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "di.V(" + param0 + ')');
        }
    }

    final static String a(long param0, int param1, boolean param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int stackIn_16_0 = 0;
        long var7;
        long var9;
        int var11;
        int var12;
        long var13;
        long var15;
        char[] var17;
        int var18;
        char[] var19;
        char[] var20;
        L0: {
          if (param3 < -90) {
            break L0;
          } else {
            di.a(false, (byte) 98, true);
            break L0;
          }
        }
        L1: {
          if (-1 < (param1 ^ -1)) {
            break L1;
          } else {
            if ((param1 ^ -1) >= -63) {
              L2: {
                if ((param5 ^ -1) > -3) {
                  break L2;
                } else {
                  if (36 < param5) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 >= 0L) {
                        if (!param2) {
                          stackIn_16_0 = 0;
                          break L3;
                        } else {
                          stackIn_16_0 = 1;
                          break L3;
                        }
                      } else {
                        stackIn_16_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_16_0;
                      var13 = (long)(1 << param1);
                      var15 = -1L + var13;
                      if (-1L >= (param0 ^ -1L)) {
                        var7 = param0 >> param1;
                        var9 = param0 & var15;
                        break L4;
                      } else {
                        var9 = -(param0 & var15) + var13;
                        var7 = -param0 >> param1;
                        break L4;
                      }
                    }
                    L5: {
                      if (0L != var7) {
                        var11 = var12;
                        L6: while (true) {
                          if (0L == var7) {
                            break L5;
                          } else {
                            var12++;
                            var11++;
                            var7 = var7 / (long)param5;
                            continue L6;
                          }
                        }
                      } else {
                        var12++;
                        var11 = var12;
                        break L5;
                      }
                    }
                    L7: {
                      if (var9 == 0L) {
                        break L7;
                      } else {
                        var11++;
                        L8: while (true) {
                          if (var9 == 0L) {
                            break L7;
                          } else {
                            incrementValue$0 = param4;
                            param4--;
                            if (0 == incrementValue$0) {
                              break L7;
                            } else {
                              var9 = var9 * (long)param5;
                              var11++;
                              var9 = var9 & var15;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      if ((param0 ^ -1L) <= -1L) {
                        var9 = param0 & var15;
                        var7 = param0 >> param1;
                        break L9;
                      } else {
                        var7 = -param0 >> param1;
                        var9 = param0 & var15;
                        if ((var9 ^ -1L) == -1L) {
                          break L9;
                        } else {
                          var9 = var13 + -(var15 & param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var20 = new char[var11];
                      var19 = var20;
                      var17 = var19;
                      if (0L <= param0) {
                        if (!param2) {
                          break L10;
                        } else {
                          var17[0] = (char)43;
                          break L10;
                        }
                      } else {
                        var17[0] = (char)45;
                        break L10;
                      }
                    }
                    L11: {
                      if ((var7 ^ -1L) != -1L) {
                        var18 = -1 + var12;
                        L12: while (true) {
                          if (-1L == (var7 ^ -1L)) {
                            break L11;
                          } else {
                            var17[var18] = wm.field_Wb[(int)(var7 % (long)param5)];
                            var7 = var7 / (long)param5;
                            var18--;
                            continue L12;
                          }
                        }
                      } else {
                        var17[var12 + -1] = wm.field_Wb[0];
                        break L11;
                      }
                    }
                    L13: {
                      if (var9 != 0L) {
                        var17[var12] = (char)46;
                        var18 = 1 + var12;
                        L14: while (true) {
                          if (var20.length <= var18) {
                            break L13;
                          } else {
                            var9 = var9 * (long)param5;
                            var17[var18] = wm.field_Wb[(int)(var9 >> param1)];
                            var9 = var9 & var15;
                            var18++;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    return new String(var20);
                  }
                }
              }
              throw new IllegalArgumentException("Invalid radix: " + param5);
            } else {
              break L1;
            }
          }
        }
        throw new IllegalArgumentException("Invalid fp: " + param1);
    }

    final int b(String param0, int param1) {
        byte[] discarded$1 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
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
            if (this.d(107)) {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  var4 = (int[]) null;
                  discarded$1 = this.a((int[]) null, 23, -125, -21);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_p.a(t.a(param1 + 29051, var5), (byte) -120);
              if (this.b(var3_int, (byte) -71)) {
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

            stackIn_12_1 = new StringBuilder().append("di.W(");

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
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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

    final int f(int param0) {
        if (param0 != -1) {
            di.a(((long[]) (((Object[]) (this.field_l[2]))[6]))[12], -60, true, 112, -107, -102);
        }
        if (!this.d(-82)) {
            return -1;
        }
        return this.field_f.field_z.length;
    }

    final synchronized int d(int param0, int param1) {
        if (param0 != -29867) {
            return -51;
        }
        if (!(this.b(param1, (byte) -114))) {
            return 0;
        }
        if (null != this.field_l[param1]) {
            return 100;
        }
        return this.field_d.a(-18600, param1);
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            String var4 = (String) null;
            this.a((byte) 89, (String) null);
        }
        if (!(this.b(param1, (byte) -68))) {
            return 0;
        }
        return this.field_f.field_z[param1];
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.c(-21918, param0, param1))) {
            return false;
        }
        if (param2 < 2) {
            this.a((byte) 97, (String) (this.field_l[1]));
        }
        if (this.field_c[param1] != null && this.field_c[param1][param0] != null) {
            return true;
        }
        if (this.field_l[param1] != null) {
            return true;
        }
        this.c(param1, -1);
        if (null != this.field_l[param1]) {
            return true;
        }
        return false;
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param2) {
            qh.c(0, 0, qh.field_l, qh.field_f, 0, 192);
        } else {
            qh.d();
        }
        to.a((byte) -39, param2);
        if (param1 <= 84) {
            field_j = (String) null;
        }
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (this.b(param0, (byte) -128)) {
              param2 = param2.toLowerCase();
              if (param1 == 0) {
                var5 = (CharSequence) ((Object) param2);
                var4_int = this.field_f.field_n[param0].a(t.a(29050, var5), (byte) 118);
                if (this.c(param1 ^ -21918, var4_int, param0)) {
                  stackIn_10_0 = var4_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ((int[]) (this.field_l[0]))[7];
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("di.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
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
            if (this.c(param1 ^ 21916, param2, param3)) {
              L1: {
                if (param1 == -2) {
                  break L1;
                } else {
                  this.a(40, ((byte[]) (this.field_l[0]))[5]);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_c[param3] == null) {
                    break L3;
                  } else {
                    if (null != this.field_c[param3][param2]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param1 + 2, param0, param2, param3)) {
                  this.c(param3, -1);
                  if (this.a(param1 ^ -2, param0, param2, param3)) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_c[param3] != null) {
                L4: {
                  if (this.field_c[param3][param2] != null) {
                    var7 = or.a(this.field_c[param3][param2], param1 ^ 19261, false);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if ((this.field_k ^ -1) != -2) {
                      if ((this.field_k ^ -1) != -3) {
                        break L5;
                      } else {
                        this.field_c[param3] = null;
                        break L5;
                      }
                    } else {
                      this.field_c[param3][param2] = null;
                      if (-2 != (this.field_f.field_z[param3] ^ -1)) {
                        break L5;
                      } else {
                        this.field_c[param3] = null;
                        break L5;
                      }
                    }
                  }
                }
                stackIn_26_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
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

            stackIn_29_1 = new StringBuilder().append("di.BA(");

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
          throw wm.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_26_0);
        }
    }

    final int a(int param0, String param1) {
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
            if (!this.d(84)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 100) {
                  break L1;
                } else {
                  this.field_d = (lh) null;
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_p.a(t.a(param0 + 28950, var4), (byte) 117);
              stackIn_7_0 = this.d(-29867, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("di.P(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized byte[] a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.d(-80)) {
              L1: {
                param2 = param2.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  this.b(((int[]) (this.field_l[7]))[28]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_p.a(t.a(29050, var6), (byte) -63);
              if (this.b(var4_int, (byte) -120)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_f.field_n[var4_int].a(t.a(29050, var7), (byte) -114);
                stackIn_9_0 = this.a(125, var5, var4_int);
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("di.DA(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param0 <= 79) {
            this.field_c = (Object[][]) null;
        }
        return this.a((int[]) null, -2, param1, param2);
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        if (!this.d(-53)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            var3 = 0;
            if (param0 == 0) {
              break L0;
            } else {
              this.field_c = (Object[][]) null;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 >= this.field_l.length) {
              if (-1 != (var2 ^ -1)) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (this.field_f.field_s[var4] > 0) {
                var2 += 100;
                var3 = var3 + this.d(-29867, var4);
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(byte param0, String param1) {
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
            if (this.d(-120)) {
              param1 = param1.toLowerCase();
              var3_int = 29 / ((param0 - -48) / 57);
              var5 = (CharSequence) ((Object) param1);
              var4 = this.field_f.field_p.a(t.a(29050, var5), (byte) 119);
              if ((var4 ^ -1) <= -1) {
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

            stackIn_10_1 = new StringBuilder().append("di.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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

    private final synchronized void c(int param0, int param1) {
        boolean discarded$0 = false;
        if (!this.field_i) {
            this.field_l[param0] = pj.a(false, param1 + -29, this.field_d.a(param0, (byte) 19));
        } else {
            this.field_l[param0] = this.field_d.a(param0, (byte) 19);
        }
        if (param1 != -1) {
            int[] var4 = (int[]) null;
            discarded$0 = this.a(29, (int[]) null, 14, -109);
        }
    }

    di(lh param0, boolean param1, int param2) {
        this.field_f = null;
        try {
            if (0 > param2 || -3 > (param2 ^ -1)) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param1 ? true : false;
            this.field_k = param2;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_61_0 = 0;
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
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        ge var25 = null;
        byte[] var26 = null;
        ge var28 = null;
        ge var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        try {
          L0: {
            if (!this.b(param3, (byte) -64)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_l[param3]) {
                L1: {
                  var5_int = this.field_f.field_s[param3];
                  var33 = this.field_f.field_k[param3];
                  var23 = var33;
                  var6 = var23;
                  if (this.field_c[param3] != null) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_f.field_z[param3]];
                    this.field_c[param3] = array$0;
                    break L1;
                  }
                }
                var7 = this.field_c[param3];
                var8 = 1;
                var9_int = 0;
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
                          var10 = var33[var9_int];
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
                  if (var8 != 0) {
                    stackIn_20_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (param1 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param1[0]) {
                              break L7;
                            } else {
                              if (-1 != (param1[1] ^ -1)) {
                                break L7;
                              } else {
                                if (param1[2] != 0) {
                                  break L7;
                                } else {
                                  if (param1[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var34 = or.a(this.field_l[param3], -19261, true);
                          var24 = var34;
                          var9 = var24;
                          var25 = new ge(var34);
                          var25.a(var25.field_t.length, 5, param1, param0 + -81);
                          break L5;
                        }
                      }
                      var9 = or.a(this.field_l[param3], -19261, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var35 = wp.a(param0, var9);
                        var26 = var35;
                        var22 = var26;
                        var42 = var22;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_33_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_33_1 = new StringBuilder();

                        if (param1 == null) {
                          stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                          stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                          stackIn_34_2 = 0;
                          break L9;
                        } else {
                          stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                          stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                          stackIn_34_2 = 1;
                          break L9;
                        }
                      }
                      throw wm.a((Throwable) ((Object) stackIn_34_0), (stackIn_34_2 != 0) + " " + param3 + " " + param1.length + " " + qo.a(param1.length, var9, 0) + " " + qo.a(param1.length + -2, var9, param0 ^ 0) + " " + this.field_f.field_w[param3] + " " + this.field_f.field_v);
                    }
                    L10: {
                      if (this.field_i) {
                        this.field_l[param3] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (2 != this.field_k) {
                          var11 = var35.length;
                          var11--;
                          var12 = var22[var11] & 255;
                          var11 = var11 - var5_int * var12 * 4;
                          var30 = new ge(var42);
                          var30.field_v = var11;
                          var38 = new int[var5_int];
                          var31 = var38;
                          var14 = var31;
                          var15_int = 0;
                          L12: while (true) {
                            if (var15_int >= var12) {
                              var39 = new byte[var5_int][];
                              var32 = var39;
                              var15 = var32;
                              var16 = 0;
                              L13: while (true) {
                                if (var5_int <= var16) {
                                  var30.field_v = var11;
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
                                              var18 = var33[var17];
                                              break L16;
                                            } else {
                                              var18 = var17;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (this.field_k != 0) {
                                              var7[var18] = var39[var17];
                                              break L17;
                                            } else {
                                              var7[var18] = pj.a(false, -54, var39[var17]);
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
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L14;
                                        } else {
                                          var18 = var18 + var30.b(true);
                                          qn.a(var35, var16, var39[var19], var38[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var38[var16]];
                                  var15[var16] = array$1;
                                  var38[var16] = 0;
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
                                  var16 = var16 + var30.b(true);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var35.length;
                          var11--;
                          var12 = var22[var11] & 255;
                          var11 = var11 - var5_int * (var12 * 4);
                          var28 = new ge(var42);
                          var14_int = 0;
                          var15_int = 0;
                          var28.field_v = var11;
                          var16 = 0;
                          L20: while (true) {
                            if (var12 <= var16) {
                              if (var14_int == 0) {
                                stackIn_61_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var43 = new byte[var14_int];
                                var28.field_v = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L21: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = var43;
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
                                          var19 = var19 + var28.b(true);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L23;
                                          } else {
                                            var21 = var33[var20];
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (param2 == var21) {
                                            qn.a(var42, var17, var43, var14_int, var19);
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
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L20;
                                } else {
                                  L26: {
                                    var17 = var17 + var28.b(true);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L26;
                                    } else {
                                      var19 = var33[var18];
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
                          if (var6 == null) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = var33[0];
                            break L28;
                          }
                        }
                        if (this.field_k != 0) {
                          var7[var11] = var35;
                          break L11;
                        } else {
                          var7[var11] = pj.a(false, -77, var35);
                          return true;
                        }
                      }
                    }
                    stackIn_100_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_103_0 = (RuntimeException) (var5);

            stackIn_103_1 = new StringBuilder().append("di.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L29;
            } else {
              stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L29;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_61_0 != 0;
              } else {
                return stackIn_100_0 != 0;
              }
            }
          }
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.d(param1 ^ -31482)) {
            return null;
        }
        if (1 == this.field_f.field_z.length) {
            return this.a(119, param0, 0);
        }
        if (!this.b(param0, (byte) -125)) {
            return null;
        }
        if (!((this.field_f.field_z[param0] ^ -1) != -2)) {
            return this.a(113, 0, param0);
        }
        if (param1 != -31413) {
            return (byte[]) (((Object[]) (this.field_l[14]))[7]);
        }
        throw new RuntimeException();
    }

    static {
        field_b = 97;
        field_e = 2;
        field_g = 0;
    }
}
