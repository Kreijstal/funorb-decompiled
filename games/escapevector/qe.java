/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private int field_c;
    private int[] field_j;
    qj field_f;
    private qj[] field_e;
    static byte[][] field_a;
    int field_d;
    private int[] field_i;
    private int field_g;
    int field_h;
    private int field_b;

    private final void a(boolean param0, byte param1) {
        hl[] var3 = null;
        hl var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hl[] var8 = null;
        L0: {
          var8 = gd.field_K;
          var3 = var8;
          if (0 > ((qe) this).field_d) {
            break L0;
          } else {
            if (var8.length > ((qe) this).field_d) {
              var4 = var8[((qe) this).field_d];
              if (var4 != null) {
                L1: {
                  if (!param0) {
                    var5 = 256;
                    var6 = qm.field_c * 6144 / 64;
                    var7 = 16384 * ((qe) this).field_f.field_h / 640;
                    var4.a(var5, var6, var7);
                    break L1;
                  } else {
                    var5 = 256;
                    var4.g(var5);
                    var8[((qe) this).field_d] = null;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final int a(qj param0, qj param1) {
        double var4_double = 0.0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4_double = this.a(84, param0, param1);
            var6 = 0;
            var7 = (int)(var4_double * 0.2 + 0.5);
            stackOut_0_0 = var7;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("qe.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -128 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length / 2;
            ((qe) this).field_e = new qj[var3_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                ((qe) this).field_f = ((qe) this).field_e[0];
                break L0;
              } else {
                var5 = param0[var4 * 2];
                var6 = param0[var4 * 2 - -1];
                ((qe) this).field_e[var4] = new qj(var5, var6);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qe.M(");
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 121 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, ed[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param3[0].field_A;
                  var7 = param3[2].field_A;
                  var8 = param3[1].field_A;
                  param3[0].f(param5, param1, param4);
                  param3[2].f(-var7 + (param2 + param5), param1, param4);
                  em.a(sf.field_m);
                  em.h(var6_int + param5, param1, -var7 + param2 + param5, param3[1].field_z + param1);
                  var9 = param5 - -var6_int;
                  var10 = param5 + (param2 - var7);
                  param5 = var9;
                  var11 = -19;
                  L2: while (true) {
                    if (param5 >= var10) {
                      em.b(sf.field_m);
                      break L0;
                    } else {
                      param3[1].f(param5, param1, param4);
                      param5 = param5 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("qe.A(").append(-100).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = ((qe) this).field_i[param0];
        em.d(((qe) this).field_f.field_h, ((qe) this).field_f.field_b, ((qe) this).field_b, var3);
        var3 = ((qe) this).field_j[param0];
        em.a(((qe) this).field_f.field_h, ((qe) this).field_f.field_b, ((qe) this).field_b, var3);
        String var4 = Integer.toString(((qe) this).field_d - -1);
        fh.field_g.c(var4, 1 + (((qe) this).field_f.field_h - 1), -2 + ((qe) this).field_f.field_b - -((qe) this).field_b, ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h - -1, -2 + (((qe) this).field_f.field_b + ((qe) this).field_b), ((qe) this).field_g, -1);
        fh.field_g.c(var4, ((qe) this).field_f.field_h + 1, -1 + ((qe) this).field_b + (((qe) this).field_f.field_b - 2), ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h, -1 + (((qe) this).field_b + ((qe) this).field_f.field_b), ((qe) this).field_g, -1);
        fh.field_g.c(var4, 1 + ((qe) this).field_f.field_h, -2 + (((qe) this).field_b + ((qe) this).field_f.field_b), ((qe) this).field_c, -1);
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        qj var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qj var11 = null;
        qj var12 = null;
        qj var13 = null;
        qj var14 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var10 = EscapeVector.field_A;
        var4 = ((qe) this).field_e.length;
        var5 = 0;
        var6 = null;
        var7 = null;
        var8 = ((qe) this).field_i[param1];
        L0: while (true) {
          L1: {
            if (0 >= param2) {
              break L1;
            } else {
              if (var4 <= 1 + var5) {
                break L1;
              } else {
                var11 = ((qe) this).field_e[var5 + 1];
                var7_ref = var11;
                var12 = ((qe) this).field_e[var5];
                int discarded$2 = -128;
                var9 = this.a(var12, var7_ref);
                var13 = this.a(var11, true, param2, var12, var9);
                param2 = param2 - var9;
                em.d(var12.field_h, var12.field_b, var13.field_h, var13.field_b, var8);
                if (param2 <= 0) {
                  break L1;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          }
          L2: {
            if (param2 <= 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_8_0;
            if (var9 == 0) {
              break L3;
            } else {
              var14 = ((qe) this).field_e[var4 - 1];
              em.a(-1 + var14.field_h, -1 + var14.field_b, 3, 3, var8);
              break L3;
            }
          }
          this.a(var9 != 0, (byte) -66);
          return param2;
        }
    }

    private final qj a(qj param0, boolean param1, int param2, qj param3, int param4) {
        RuntimeException var6 = null;
        qj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              if (param4 > param2) {
                bn.field_a.field_b = param2 * (-param3.field_b + param0.field_b) / param4 + param3.field_b;
                bn.field_a.field_h = param2 * (-param3.field_h + param0.field_h) / param4 + param3.field_h;
                break L1;
              } else {
                bn.field_a.field_h = param0.field_h;
                bn.field_a.field_b = param0.field_b;
                break L1;
              }
            }
            stackOut_3_0 = bn.field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("qe.H(");
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(true).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    public static void b() {
        field_a = null;
    }

    final static int a(int[] param0, int param1, boolean param2, int[] param3) {
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            qg.a(param3, 0, param0, param1, param3.length);
            param1 = param1 + param3.length;
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("qe.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(true).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(boolean param0, int param1) {
        int var3 = !param0 ? kh.field_b : bo.field_E;
        int var4 = mj.field_d;
        if (((qe) this).field_h > var4) {
            return;
        }
        if (param1 != -1) {
            ((qe) this).field_d = 26;
        }
        var4 = -((qe) this).field_h + var4;
        var4 = this.a(true, var3, var4);
        this.a(var3, (byte) -92);
    }

    final static int a() {
        if (fc.field_a >= 2) {
          L0: {
            if (ff.field_h != 0) {
              L1: {
                if (null != nk.field_p) {
                  if (nk.field_p.b(0)) {
                    if (!nk.field_p.a("", (byte) -111)) {
                      return 29;
                    } else {
                      if (!nk.field_p.a(0, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!ii.field_a.b(0)) {
                return 43;
              } else {
                if (ii.field_a.a(0, "commonui")) {
                  if (!w.field_ab.b(0)) {
                    return 71;
                  } else {
                    if (!w.field_ab.a(0, "commonui")) {
                      return 80;
                    } else {
                      if (pl.field_j.b(0)) {
                        if (!pl.field_j.a((byte) -119)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      } else {
                        return 82;
                      }
                    }
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (ii.field_a.b(0)) {
                if (ii.field_a.a(0, "commonui")) {
                  if (!w.field_ab.b(0)) {
                    return 50;
                  } else {
                    if (!w.field_ab.a(0, "commonui")) {
                      return 60;
                    } else {
                      if (pl.field_j.b(0)) {
                        if (pl.field_j.a((byte) -119)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -((qe) this).field_f.field_h + param1;
        int var5 = -((qe) this).field_f.field_b + param0;
        int var6 = var4 * var4 - -(var5 * var5);
        int var7 = (param2 + ((qe) this).field_b) * ((qe) this).field_b;
        int var8 = var6 <= var7 ? 1 : 0;
        return var8 != 0;
    }

    private final double a(int param0, qj param1, qj param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        double stackIn_3_0 = 0.0;
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
        double stackOut_2_0 = 0.0;
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
            var4_int = param2.field_h - param1.field_h;
            var5 = -param1.field_b + param2.field_b;
            var6 = var4_int * var4_int + var5 * var5;
            stackOut_2_0 = Math.sqrt((double)var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qe.J(").append(84).append(',');
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0) {
        rd.field_c.a((hm) (Object) new l(), 30);
    }

    qe(int param0, int[] param1, int param2, int[] param3, int[] param4, int param5, int param6, ih param7) {
        try {
            ((qe) this).field_d = param0;
            int discarded$0 = 121;
            this.a(param1);
            ((qe) this).field_h = 5 * (((qe) this).field_d + 1);
            ((qe) this).field_j = param4;
            ((qe) this).field_b = param2;
            ((qe) this).field_c = param5;
            ((qe) this).field_g = param6;
            ((qe) this).field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qe.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
