/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ak {
    private dk[] field_k;
    private int[] field_a;
    static hf field_d;
    private int[][] field_b;
    private dk[] field_i;
    private dk[] field_j;
    private gj field_g;
    boolean field_h;
    int field_f;
    private int field_e;
    private int field_c;

    private final int[] a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (var5 = param2; param0 > var5; var5++) {
            var7[var5] = param1 + var5;
        }
        return var4;
    }

    private final void l(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var2 = this.j(0);
        ((ak) this).field_g = this.a((byte) -103, var2);
        if (!(null == ((ak) this).field_g)) {
            this.e((byte) -96);
            ((ak) this).field_g.c(2);
        }
        if (!(var2 == null)) {
            var3 = 320;
            var4 = 240;
            var5 = 6340704;
            fh.field_g.c(var2, var3, var4, var5, -1);
        }
    }

    private final void a(boolean param0, byte param1) {
        ol.field_N = null;
        hn.field_n = false;
        pl.field_q.b(-26480, param0);
        di.field_d = null;
        mj.field_d = 0;
        gi.a((byte) -71);
    }

    private final int[] a(int[] param0, int param1, int[] param2, int[] param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 == 10) {
                break L1;
              } else {
                this.e((byte) 114);
                break L1;
              }
            }
            var13 = new int[10];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var5 = var10;
            var6 = 0;
            L2: while (true) {
              if (var6 >= 10) {
                stackOut_15_0 = (int[]) var5;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var7 = param2[var6];
                  if (var7 >= 0) {
                    L4: {
                      var8 = 0;
                      if (0 == var7 / 10) {
                        var7 = var7 % 10;
                        var8 = param3[var7];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var7 / 10 == 1) {
                        var7 = var7 % 10;
                        var8 = param0[var7];
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var13[var6] = var8;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref;
            stackOut_17_1 = new StringBuilder().append("ak.T(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_16_0;
    }

    private final boolean f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = this.k(-115);
        if (!(0 <= var2)) {
            return false;
        }
        for (var3 = 0; var3 < fh.field_d.length; var3++) {
            var4 = fh.field_d[var3];
            if (!(var4 != var2)) {
                if (var3 >= ti.field_a.length) {
                    return false;
                }
                var5 = ti.field_a[var3];
                ((ak) this).field_c = var5;
                return true;
            }
        }
        return false;
    }

    final int h(int param0) {
        if (!(((ak) this).field_a != null)) {
            return 0;
        }
        if (param0 < 29) {
            ((ak) this).field_h = false;
        }
        return ((ak) this).field_a.length;
    }

    private final boolean c(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var2 = this.k(param0 ^ -17654);
        if (param0 != 17592) {
            ((ak) this).field_k = null;
        }
        if (!(var2 >= 0)) {
            return false;
        }
        for (var3 = 0; v.field_b.length > var3; var3++) {
            var4 = v.field_b[var3];
            if (var4 == var2) {
                if (!(var4 != ((ak) this).field_e)) {
                    return false;
                }
                ol.field_N = null;
                ((ak) this).field_e = var4;
                this.h((byte) -122);
                return true;
            }
        }
        return false;
    }

    private final int b(byte param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 0;
        if (param0 > -60) {
            ((ak) this).field_j = null;
        }
        while (var2 < v.field_b.length) {
            var3 = v.field_b[var2];
            if (!(((ak) this).field_e != var3)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    public static void c(byte param0) {
        field_d = null;
    }

    private final void a(int param0, ij param1, ij param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[] var10 = null;
        int[] var21 = null;
        int[] var22 = null;
        long[] var23 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            if (param3 == 6144) {
              var6_int = jb.a(102, param4);
              var7 = jb.a(param3 + -6045, param0);
              var21 = this.a(var7, param2, param1, ((ak) this).field_c, -17, ((ak) this).field_c, var6_int);
              var22 = this.a(param2.field_o[((ak) this).field_c], 10, var21, param1.field_o[((ak) this).field_c]);
              param1.field_o[((ak) this).field_c] = var22;
              var10 = this.a((byte) 56, param2.field_m[((ak) this).field_c], var21, param1.field_m[((ak) this).field_c]);
              param1.field_m[((ak) this).field_c] = var10;
              var23 = this.a(param2.field_k[((ak) this).field_c], param1.field_k[((ak) this).field_c], var21, true);
              param1.field_k[((ak) this).field_c] = var23;
              this.a((byte) 69, param4, var21, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("ak.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (((ak) this).field_b == null) {
            return;
        }
        for (var2 = 0; ((ak) this).field_b.length > var2; var2++) {
            ((ak) this).field_b[var2] = null;
        }
    }

    private final int[] d(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (var5 = 0; var5 < var7.length; var5++) {
            var7[var5] = param1;
        }
        return var4;
    }

    private final int d(int param0) {
        int var2 = 0;
        dk var3 = null;
        L0: {
          var2 = 115;
          if (null == ((ak) this).field_k) {
            break L0;
          } else {
            if (((ak) this).field_k.length != 0) {
              var3 = ((ak) this).field_k[0];
              if (var3 == null) {
                return var2;
              } else {
                var2 = 3 + var3.field_l - -var3.field_i;
                return var2;
              }
            } else {
              break L0;
            }
          }
        }
        return var2;
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          if (0 > ((ak) this).field_c) {
            break L0;
          } else {
            if (ti.field_a.length > ((ak) this).field_c) {
              var3 = -19;
              var2 = 0;
              L1: while (true) {
                if (var2 >= ti.field_a.length) {
                  return -1;
                } else {
                  if (((ak) this).field_c == ti.field_a[var2]) {
                    if (fh.field_d.length >= var2) {
                      var4 = fh.field_d[var2];
                      return var4;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final void a(boolean param0) {
        em.d();
        od.b(2);
        this.l(-1);
        pb.a(4);
        if (param0) {
            return;
        }
        this.b(true);
    }

    private final void i(byte param0) {
        int var3 = 0;
        int[] var4 = null;
        ij[] var5 = ol.field_N;
        ij[] var2 = var5;
        if (var2 != null) {
            if (!(var5.length != 0)) {
                return;
            }
            var3 = this.b((byte) -92);
            var4 = vn.field_a[var3];
            if (1 == var5.length) {
                ((ak) this).field_b[((ak) this).field_c] = this.d(10, var4[0], 0);
                return;
            }
            this.a(var4[1], var5[0], var5[1], 6144, var4[0]);
            return;
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = di.field_d.field_h;
          if (var2 < 0) {
            break L0;
          } else {
            if (var2 >= ((ak) this).field_a.length) {
              break L0;
            } else {
              if (param0 <= -77) {
                var3 = ((ak) this).field_a[var2];
                return var3;
              } else {
                return 85;
              }
            }
          }
        }
        return -1;
    }

    private final boolean e(int param0) {
        ij[] var2 = null;
        ij[] var3 = null;
        int var4 = 0;
        ij var5 = null;
        int var6 = 0;
        ij[] var7 = null;
        L0: {
          var6 = EscapeVector.field_A;
          var7 = ol.field_N;
          var2 = var7;
          if (var2 == null) {
            break L0;
          } else {
            if (var7.length == 0) {
              break L0;
            } else {
              var3 = var7;
              var4 = param0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  return true;
                } else {
                  var5 = var3[var4];
                  if (var5 == null) {
                    return false;
                  } else {
                    if (var5.field_l) {
                      var4++;
                      continue L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final long[] a(long[] param0, long[] param1, int[] param2, boolean param3) {
        long[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10 = 0;
        long[] var11 = null;
        long[] var12 = null;
        long[] var13 = null;
        long[] var14 = null;
        long[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var14 = new long[10];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var5 = var11;
            var6 = 0;
            L1: while (true) {
              if (var6 >= 10) {
                stackOut_13_0 = (long[]) var5;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var7 = param2[var6];
                  if (var7 >= 0) {
                    L3: {
                      var8 = 0L;
                      if (var7 / 10 != 0) {
                        break L3;
                      } else {
                        var7 = var7 % 10;
                        var8 = param1[var7];
                        break L3;
                      }
                    }
                    L4: {
                      if (var7 / 10 != 1) {
                        break L4;
                      } else {
                        var7 = var7 % 10;
                        var8 = param0[var7];
                        break L4;
                      }
                    }
                    var14[var6] = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5_ref;
            stackOut_15_1 = new StringBuilder().append("ak.FA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 1 + 41);
        }
        return stackIn_14_0;
    }

    private final gj a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        gj stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        gj stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              var3_int = this.d(77);
              if (aj.b(-123)) {
                stackOut_2_0 = hg.field_a;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = tj.field_G;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_3_0;
              if (aj.b(-104)) {
                stackOut_5_0 = 10551200;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 6340704;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_6_0;
              if (param1 != wk.field_f) {
                break L3;
              } else {
                L4: {
                  if (((ak) this).field_g == null) {
                    break L4;
                  } else {
                    if (((ak) this).field_g.field_o == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                ((ak) this).field_g = new gj(((ak) this).field_e, var3_int, ((ak) this).field_h);
                ((ak) this).field_g.a(3, var4, var5);
                break L3;
              }
            }
            L5: {
              if (param1 != le.field_b) {
                break L5;
              } else {
                L6: {
                  if (null == ((ak) this).field_g) {
                    break L6;
                  } else {
                    if (((ak) this).field_g.field_o == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                ((ak) this).field_g = new gj(((ak) this).field_e, var3_int, ((ak) this).field_h);
                ((ak) this).field_g.a(3, var4, var5);
                break L5;
              }
            }
            L7: {
              if (param0 <= -66) {
                break L7;
              } else {
                ((ak) this).field_b = null;
                break L7;
              }
            }
            L8: {
              if (bd.field_m == param1) {
                L9: {
                  if (((ak) this).field_g == null) {
                    break L9;
                  } else {
                    if (0 == ((ak) this).field_g.field_o) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                ((ak) this).field_g = new gj(((ak) this).field_e, var3_int, ((ak) this).field_h);
                ((ak) this).field_g.a(3, var4, var5);
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              if (param1 != null) {
                break L10;
              } else {
                L11: {
                  if (((ak) this).field_g == null) {
                    break L11;
                  } else {
                    if (((ak) this).field_g.field_o != 1) {
                      break L11;
                    } else {
                      if (((ak) this).field_c != ((ak) this).field_g.field_p) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                this.a(var5, var3_int, var4, (byte) -10);
                break L10;
              }
            }
            stackOut_30_0 = ((ak) this).field_g;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("ak.J(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_31_0;
    }

    private final void c(boolean param0) {
        dk var2 = null;
        int var3 = 0;
        if (!(!di.field_d.field_e)) {
            var2 = this.j((byte) 82);
            var3 = nk.a(-122, var2);
            rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, var3);
        }
    }

    private final String a(int param0) {
        String var2 = null;
        String var3 = null;
        ij[] var4 = null;
        ij[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ij var8 = null;
        String[][] var9 = null;
        String[] var10 = null;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        L0: {
          var13 = EscapeVector.field_A;
          var2 = wk.field_f;
          var3 = bd.field_m;
          var4 = ol.field_N;
          if (var4 == null) {
            break L0;
          } else {
            if (var4.length == 0) {
              break L0;
            } else {
              var5 = var4;
              var6 = 0;
              var7 = 40;
              L1: while (true) {
                if (var6 >= var5.length) {
                  return var2;
                } else {
                  var8 = var5[var6];
                  if (var8 != null) {
                    var9 = var8.field_m;
                    if (var9 != null) {
                      L2: {
                        if (((ak) this).field_c < 0) {
                          break L2;
                        } else {
                          if (((ak) this).field_c >= var9.length) {
                            break L2;
                          } else {
                            if (var9[((ak) this).field_c] != null) {
                              var10 = var9[((ak) this).field_c];
                              var11 = 0;
                              L3: while (true) {
                                if (var11 >= var10.length) {
                                  var6++;
                                  continue L1;
                                } else {
                                  var12 = var10[var11];
                                  if (var12 != null) {
                                    var2 = null;
                                    var11++;
                                    continue L3;
                                  } else {
                                    var11++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    private final dk j(byte param0) {
        int var2 = di.field_d.field_h;
        dk var3 = m.a(((ak) this).field_k, var2, 0);
        if (!(var3 == null)) {
            return var3;
        }
        var3 = m.a(((ak) this).field_i, var2, 0);
        if (var3 != null) {
            return var3;
        }
        var3 = m.a(((ak) this).field_j, var2, 0);
        if (var3 == null) {
            return null;
        }
        return var3;
    }

    private final int[] a(int param0, ij param1, ij param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var15 = EscapeVector.field_A;
        try {
          L0: {
            var10 = -77 / ((param4 - 78) / 43);
            var29 = ua.a(param6, true, param5, param2);
            var25 = var29;
            var21 = var25;
            var17 = var21;
            var8_array = var17;
            var30 = ua.a(param0, true, param3, param1);
            var26 = var30;
            var22 = var26;
            var18 = var22;
            var9 = var18;
            var11 = var29.length + var30.length;
            var32 = new int[var11];
            var28 = var32;
            var24 = var28;
            var20 = var24;
            var12 = var20;
            qg.a(var8_array, 0, var12, 0, var29.length);
            qg.a(var9, 0, var12, var29.length, var30.length);
            var31 = new int[var11];
            var14 = 0;
            L1: while (true) {
              if (var14 >= var31.length) {
                uk.a(-1, var32, var31);
                var16 = this.a(var31, 12);
                stackOut_4_0 = (int[]) var16;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var31[var14] = var14;
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("ak.BA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0;
    }

    private final int[] a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var9 = new int[param2];
        int[] var5 = var9;
        int var6 = 40 % ((11 - param1) / 39);
        for (var7 = 0; var7 < param2; var7++) {
            var9[var7] = param3 - -(var7 * param0);
        }
        return var5;
    }

    private final void b(int param0) {
        L0: {
          if (mj.field_d != 0) {
            break L0;
          } else {
            sj.a(8192, (byte) 51);
            break L0;
          }
        }
        L1: {
          de.field_j = true;
          if (param0 == 100) {
            break L1;
          } else {
            ((ak) this).field_j = null;
            break L1;
          }
        }
        L2: {
          if (!aj.b(-122)) {
            L3: {
              if (mj.field_d != 0) {
                break L3;
              } else {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 5120);
                break L3;
              }
            }
            L4: {
              if (10 == mj.field_d) {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (mj.field_d != 20) {
                break L5;
              } else {
                rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 11264);
                break L5;
              }
            }
            if (30 != mj.field_d) {
              break L2;
            } else {
              rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
              break L2;
            }
          } else {
            L6: {
              if (mj.field_d == 0) {
                rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
                break L6;
              } else {
                break L6;
              }
            }
            if (mj.field_d != 10) {
              break L2;
            } else {
              rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
              break L2;
            }
          }
        }
        L7: {
          if (mj.field_d >= 1000) {
            break L7;
          } else {
            mj.field_d = mj.field_d + 1;
            break L7;
          }
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = sm.a(param2, -121, ((ak) this).field_k, param0);
        if (!(0 > var4)) {
            return var4;
        }
        var4 = sm.a(param2, -94, ((ak) this).field_i, param0);
        if (!(0 > var4)) {
            return var4;
        }
        var4 = sm.a(param2, param1 ^ 108, ((ak) this).field_j, param0);
        if (!(param1 < ~var4)) {
            return var4;
        }
        return -1;
    }

    final boolean f(int param0) {
        int var2 = -60 / ((param0 - -22) / 35);
        int var3 = 0;
        this.b(100);
        var3 = this.a((byte) 3) ? 1 : 0;
        if (var3 != 0) {
            return var3 != 0;
        }
        di.field_d.a(((ak) this).c(sf.field_c, -1, ng.field_ob), (byte) 120, ((ak) this).c(dh.field_d, -1, bj.field_y));
        this.c(false);
        var3 = this.a(true, s.a((byte) 15, -1), (byte) 79) ? 1 : 0;
        return var3 != 0;
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ih param7, int param8) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        String[] var11 = null;
        int var12 = 0;
        int[] var16 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param5 < -27) {
                break L1;
              } else {
                String discarded$2 = this.g((byte) 98);
                break L1;
              }
            }
            var16 = new int[]{0};
            var10 = var16;
            var11 = new String[]{ag.field_a};
            var12 = var16.length;
            var26 = this.b(var12, param3, 10);
            var28 = this.a(param0, -47, var12, param4);
            var27 = this.a(var12, param1, 0);
            ((ak) this).field_j = na.a(param2 + 1, var26, param6, 0, param7, var11, var27, false, var28);
            stackOut_2_0 = (int[]) var10;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var10_ref;
            stackOut_4_1 = new StringBuilder().append("ak.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
        return stackIn_3_0;
    }

    private final void g(int param0) {
        if (!aj.b(-119)) {
            return;
        }
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -94);
    }

    private final void h(byte param0) {
        ih var18 = fh.field_g;
        int var3 = 640;
        int var4 = 0;
        int var5 = 10;
        int var6 = 10;
        int var7 = 1;
        int var8 = 78;
        int var9 = var8;
        int[] var10 = this.a(var7, 0, var9, 0, var5, var6, var18, var3 + -1, var4);
        dk var19 = ((ak) this).field_k[0];
        var9 = var9 + (var19.field_i - -3);
        ((ak) this).field_g = new gj(((ak) this).field_e, var9, ((ak) this).field_h);
        int var12 = (var3 - ((ak) this).field_g.field_m) / 2;
        var9 = var9 + (3 + ((ak) this).field_g.field_c);
        int var13 = var12 + ((ak) this).field_g.field_m;
        int[] var28 = this.a(var7, var12, var8, 0, var5, var6, var18, var13, var4);
        var5 = var5 + var28.length;
        var4 = var4 + var28.length;
        int[] var29 = this.a(var18, var6, var5, var13, var12, 98, var4, var7, var9);
        var5 = var5 + var29.length;
        var4 = var4 + var29.length;
        dk var21 = ((ak) this).field_i[0];
        var9 = var9 + (var21.field_i - -20);
        int[] var30 = this.a(var6, var7, var3 + -1, var4, var5, -28, var9, var18, 0);
        int var16 = var28.length - (-var29.length - var30.length);
        var4 = 0;
        ((ak) this).field_a = new int[var16];
        var4 = qe.a(((ak) this).field_a, var4, true, var28);
        var4 = qe.a(((ak) this).field_a, var4, true, var29);
        int discarded$7 = qe.a(((ak) this).field_a, var4, true, var30);
        gn.a(((ak) this).field_k, true, (byte) 41);
        if (param0 > -120) {
            ((ak) this).field_a = null;
        }
        gn.a(((ak) this).field_i, !aj.b(-102) ? true : false, (byte) 41);
        gn.a(((ak) this).field_j, false, (byte) 41);
        ((ak) this).field_g = null;
    }

    private final int[] a(int[] param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = new int[param0.length];
            var3 = var7;
            var4 = -1 + param0.length;
            var5 = 0;
            L1: while (true) {
              if (var4 < 0) {
                stackOut_4_0 = (int[]) var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                int incrementValue$2 = var5;
                var5++;
                var7[incrementValue$2] = param0[var4];
                var4--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("ak.UA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 12 + 41);
        }
        return stackIn_5_0;
    }

    private final void a(byte param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            ((ak) this).field_b[((ak) this).field_c] = new int[10];
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= 10) {
                var5_int = -68 % ((-21 - param0) / 61);
                break L0;
              } else {
                L2: {
                  var6 = param2[var5_int];
                  if (var6 < 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ak.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
    }

    private final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var4 = EscapeVector.field_A;
        var2 = 0;
        L0: while (true) {
          if (!pn.p(-110)) {
            return var2 != 0;
          } else {
            L1: {
              di.field_d.a(127);
              qk.a(((ak) this).field_a, 0);
              if (nk.field_n == 13) {
                var3 = ((ak) this).a(1, 0);
                di.field_d.a(false, var3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.a(false, s.a((byte) 15, nk.field_n), (byte) 96)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var2 = stackIn_8_0;
            if (var2 != 0) {
              return var2 != 0;
            } else {
              continue L0;
            }
          }
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        String[] var11 = null;
        String[] var12 = null;
        int var13 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
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
            L1: {
              var12 = mg.field_h;
              if (!bj.e((byte) 103)) {
                var10 = new int[]{5};
                var11 = new String[]{var12[0]};
                break L1;
              } else {
                var10 = v.field_b;
                var11 = var12;
                break L1;
              }
            }
            var13 = var10.length;
            var26 = this.b(var13, param8, 10);
            var28 = this.a(param5, param3 ^ 115, var13, param4);
            var27 = this.a(var13, param0, param3 ^ param3);
            ((ak) this).field_k = na.a(param7 + (-param1 + 1), var26, param2, param1, param6, var11, var27, false, var28);
            stackOut_3_0 = (int[]) var10;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10_ref;
            stackOut_5_1 = new StringBuilder().append("ak.PA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        if (param0 != 1) {
            Object var5 = null;
            int[] discarded$0 = this.a((int[]) null, -63, (int[]) null, (int[]) null);
        }
        for (var3 = 0; ((ak) this).field_a.length > var3; var3++) {
            if (!(((ak) this).field_a[var3] != param1)) {
                return var3;
            }
        }
        return -1;
    }

    private final String g(byte param0) {
        String var2 = null;
        ij[] var3 = null;
        ij[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ij var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        L0: {
          var9 = EscapeVector.field_A;
          var2 = bd.field_m;
          var3 = ol.field_N;
          if (var3 == null) {
            break L0;
          } else {
            if (var3.length == 0) {
              break L0;
            } else {
              var4 = var3;
              var5 = 73 / ((-1 - param0) / 44);
              var6 = 0;
              L1: while (true) {
                if (var4.length > var6) {
                  var7 = var4[var6];
                  if (var7 != null) {
                    var11 = var7.field_o;
                    var10 = var11;
                    var8 = var10;
                    if (var8 != null) {
                      L2: {
                        if (((ak) this).field_c < 0) {
                          break L2;
                        } else {
                          if (((ak) this).field_c < var11.length) {
                            if (null == var8[((ak) this).field_c]) {
                              return var2;
                            } else {
                              var6++;
                              continue L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return var2;
                    } else {
                      return var2;
                    }
                  } else {
                    return var2;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        RuntimeException runtimeException = null;
        ij[] var5 = null;
        ij var6 = null;
        ik var7 = null;
        ij[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == ((ak) this).field_b[((ak) this).field_c]) {
                this.i((byte) -107);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = ol.field_N;
              var5 = var8;
              if (var5 == null) {
                break L2;
              } else {
                if (var8.length == 0) {
                  break L2;
                } else {
                  var6 = var8[0];
                  if (var6 == null) {
                    return;
                  } else {
                    var7 = de.field_i;
                    if (param3 == -10) {
                      ((ak) this).field_g = new gj(var6, ((ak) this).field_b[((ak) this).field_c], var7, ((ak) this).field_c, ((ak) this).field_e, param1, ((ak) this).field_h);
                      ((ak) this).field_g.a(3, param2, param0);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ak.AB(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
    }

    private final String[] a(byte param0, String[] param1, int[] param2, String[] param3) {
        String[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String[] var10 = null;
        String[] stackIn_12_0 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_11_0 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var10 = new String[10];
            var5 = var10;
            var6 = 0;
            L1: while (true) {
              if (var6 >= 10) {
                L2: {
                  if (param0 == 56) {
                    break L2;
                  } else {
                    ((ak) this).field_b = null;
                    break L2;
                  }
                }
                stackOut_11_0 = (String[]) var5;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var7 = param2[var6];
                  var8 = "";
                  if (var7 / 10 != 0) {
                    break L3;
                  } else {
                    var7 = var7 % 10;
                    var8 = param3[var7];
                    break L3;
                  }
                }
                L4: {
                  if (1 == var7 / 10) {
                    var7 = var7 % 10;
                    var8 = param1[var7];
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var10[var6] = var8;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("ak.QA(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_12_0;
    }

    private final int[] a(ih param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
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
            L1: {
              if (!aj.b(-99)) {
                var10_array = new int[]{2, 3, 4};
                var11 = ge.field_d;
                break L1;
              } else {
                var11 = new String[]{cn.field_e};
                var10_array = new int[]{1};
                break L1;
              }
            }
            var12 = var10_array.length;
            var13 = -114 / ((-5 - param5) / 34);
            var26 = this.b(var12, param6, 10);
            var28 = this.a(param1, -47, var12, param2);
            var27 = this.a(var12, param7, 0);
            ((ak) this).field_i = na.a(1 + (-param4 + param3), var26, param8, param4, param0, var11, var27, false, var28);
            stackOut_3_0 = (int[]) var10_array;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10;
            stackOut_5_1 = new StringBuilder().append("ak.SA(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_4_0;
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        dk var15 = null;
        dk var16 = null;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var2 = 20;
          var3 = 12;
          var4 = 12;
          var5 = ((ak) this).field_g.field_t + -var2;
          var6 = ((ak) this).field_g.field_m + var5 + 2 * var2;
          var7 = null;
          if (((ak) this).field_k == null) {
            break L0;
          } else {
            L1: {
              if (((ak) this).field_k.length < 1) {
                break L1;
              } else {
                if (null == ((ak) this).field_k[0]) {
                  break L1;
                } else {
                  L2: {
                    var15 = ((ak) this).field_k[0];
                    if (param0 < -81) {
                      break L2;
                    } else {
                      ((ak) this).field_c = -52;
                      break L2;
                    }
                  }
                  var8 = -var3 + var15.field_l;
                  if (((ak) this).field_i == null) {
                    break L0;
                  } else {
                    L3: {
                      if (((ak) this).field_i.length < 1) {
                        break L3;
                      } else {
                        if (((ak) this).field_i[0] == null) {
                          break L3;
                        } else {
                          L4: {
                            var16 = ((ak) this).field_i[0];
                            var9 = var16.field_l + var16.field_i - -var4;
                            var10 = mj.field_d;
                            if (var10 < 40) {
                              stackOut_14_0 = 40 - var10;
                              stackIn_15_0 = stackOut_14_0;
                              break L4;
                            } else {
                              stackOut_13_0 = 0;
                              stackIn_15_0 = stackOut_13_0;
                              break L4;
                            }
                          }
                          var11 = stackIn_15_0;
                          var12 = 0;
                          var13 = 3162160;
                          var14 = 6324320;
                          fc.a(var11, var5, var6, var9, true, 29788, false, var14, var13, var12, var8, true);
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        ((ak) this).field_e = 5;
        if (hi.a(param1, -2)) {
            ((ak) this).field_e = 5;
        }
        if (!bj.e((byte) 98)) {
            return;
        }
        if (param1 == 2) {
            ((ak) this).field_e = 6;
        }
        if (!param0) {
            ((ak) this).field_i = null;
        }
        if (!(3 != param1)) {
            ((ak) this).field_e = 7;
        }
    }

    private final int[] b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (var5 = 0; var5 < param0; var5++) {
            var7[var5] = var5 + param1;
        }
        return var4;
    }

    private final boolean a(boolean param0, boolean param1, byte param2) {
        int var6 = 0;
        int var4 = 0;
        if (!(!param1)) {
            if (!(!this.f((byte) -123))) {
                return var4 != 0;
            }
            if (!(!this.c(17592))) {
                return var4 != 0;
            }
            var6 = this.k(-124);
            if (var6 == 0) {
                var4 = 1;
                this.a(param0, (byte) -123);
                return var4 != 0;
            }
            if (!(var6 != 1)) {
                this.g(-1);
                var4 = 1;
                return var4 != 0;
            }
        }
        if (param2 < 77) {
            this.a(true, 117);
        }
        return var4 != 0;
    }

    private final void d(byte param0) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = this.b((byte) -89);
        if (!(var2 >= 0)) {
            return;
        }
        if (!(var2 < vn.field_a.length)) {
            return;
        }
        int[] var3 = vn.field_a[var2];
        ij[] var4 = new ij[var3.length];
        for (var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = bk.a(var3[var5], true, 10, 3, 1);
            this.m(0);
        }
        ol.field_N = var4;
    }

    private final void b(boolean param0) {
        int var2 = ((ak) this).a(1, ((ak) this).field_e);
        int var3 = this.i(-74);
        int var4 = ((ak) this).a(1, var3);
        int var5 = di.field_d.field_h;
        rb.a(((ak) this).field_k, var2, var5, (byte) -55);
        rb.a(((ak) this).field_i, var4, var5, (byte) -114);
        rb.a(((ak) this).field_j, -1, var5, (byte) -97);
    }

    private final String j(int param0) {
        String var2 = wk.field_f;
        ij[] var3 = ol.field_N;
        if (!(!aj.b(-123))) {
            return var2;
        }
        if (!(var3 != null)) {
            this.d((byte) -83);
            ((ak) this).field_g = null;
            return var2;
        }
        if (!this.e(0)) {
            var2 = le.field_b;
            return var2;
        }
        var2 = this.a(48);
        if (var2 != null) {
            return var2;
        }
        var2 = this.g((byte) 86);
        return var2;
    }

    ak(boolean param0, int param1) {
        ((ak) this).field_b = new int[ti.field_a.length][];
        ((ak) this).field_h = param0 ? true : false;
        ((ak) this).field_c = 0;
        this.a(true, param1);
        ((ak) this).field_f = vh.f(121);
        this.h((byte) -126);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hf();
    }
}
