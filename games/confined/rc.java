/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements fe {
    private int field_f;
    static int field_i;
    private int field_e;
    private int field_g;
    private int field_h;
    static int[] field_b;
    private ok field_d;
    private int field_j;
    private int field_c;
    static String field_a;

    public static void a(int param0) {
        try {
          field_a = null;
          field_b = null;
          if (param0 != -29955) {
            rc.a(108);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rc.A(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -22889) {
            rc.a(-14);
          }
          qc.field_m = e.field_c.d(true);
          dc.field_J = hh.a(0, (CharSequence) ((Object) qc.field_m));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "rc.D(" + param0 + ')');
        }
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        fj stackIn_5_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        try {
          if (param3 instanceof nj) {
            stackIn_5_0 = (fj) (param3);
          } else {
            stackIn_5_0 = null;
          }
          var6 = (nj) (stackIn_5_0);
          fn.e(param3.field_q + param1, param4 + param3.field_m, param3.field_F, param3.field_z, this.field_h);
          if (null != var6) {
          }
          var7 = param3.field_F - var6.field_S * 2;
          if (param0 >= -97) {
            this.field_c = -40;
          }
          var8 = param1 - (-param3.field_q - var6.field_S);
          var9 = var6.field_Q + (param4 + param3.field_m);
          fn.f(var8, var9, var7 + var8, var9, this.field_j);
          var10 = -1 + var6.h((byte) 127);
          while (var10 >= 0) {
            fn.e(var6.a((byte) 20, var10) * var7 / var6.i((byte) -96) + var8, var9, this.field_f, this.field_e);
            var10--;
            if (var11 != 0) {
              return;
            }
          }
          if (null != this.field_d) {
            this.field_d.b(var6.field_B, var8 + var7 / 2, this.field_d.field_v + (var9 + var6.field_Q), this.field_g, this.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_22_0 = var6_ref;
          stackIn_22_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3, rm param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Confined.field_J ? 1 : 0;
        try {
          if (param0 >= -112) {
            field_a = (String) null;
          }
          var5_int = km.b(4, 3 * (param3 - param1));
          var6 = 3 * param1;
          var7 = var5_int - 10;
          ab.b((byte) 110);
          if (param4.field_A > 0 &&
            null != param4.field_P) {
            se.a(0);
          }
          ei.field_jb = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_w > var8)))) {
            var9 = param4.field_z[var8];
            var10 = param4.field_m[var8];
            var11 = param4.field_J[var8];
            stackOut_13_0 = param2;
            stackIn_56_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = qf.field_a[var9];
                var13 = db.field_x[var9];
                var14 = -var12 + qf.field_a[var10];
                var15 = qf.field_a[var11] - var12;
                var16 = -var13 + db.field_x[var10];
                var17 = db.field_x[var11] - var13;
              }
              if (!stackIn_14_0 ||
                !(-(var16 * var15) + var17 * var14 >= 0)) {
                var12Lifetime1 = cj.field_b[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = cj.field_b[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = cj.field_b[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 + var13Lifetime1 + var14 - var6;
                      if (0 <= var7) {
                        stackIn_35_0 = var15 >> var7;
                      } else {
                        stackIn_35_0 = var15 << -var7;
                      }
                      var16 = -stackIn_35_0 + vb.field_e.length - 1;
                      var17 = vb.field_e[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_46_0 = 0;
                          stackIn_46_1 = var16;
                          if (stackIn_46_0 > stackIn_46_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = vb.field_e[var16];
                          continue;
                        }
                        stackIn_46_0Lifetime1 = var17;
                        stackIn_46_1Lifetime1 = var16 << 4;
                        var18 = stackIn_46_0Lifetime1 + stackIn_46_1Lifetime1;
                        tl.field_i[var18] = var8;
                        vb.field_e[var16] = var17 + 1;
                        if (param4.field_A > 0 &&
                          param4.field_P != null) {
                          dupTemp$0 = param4.field_P[var8];
                          bd.field_g[dupTemp$0] = bd.field_g[dupTemp$0] + 1;
                        }
                        ei.field_jb = ei.field_jb + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_56_0 = -1;
          }
          if (stackIn_56_0 > ~param4.field_A &&
            null != param4.field_P) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= bd.field_g.length)) {
              var10Lifetime1 = bd.field_g[var9Lifetime1];
              bd.field_g[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_72_0 = var5;
          stackIn_72_1 = new StringBuilder().append("rc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    rc(ok param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param2;
          this.field_g = param1;
          this.field_e = param6;
          this.field_j = param3;
          this.field_h = param4;
          this.field_d = param0;
          this.field_f = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_b = new int[6];
        field_a = "Player Name: ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c68ae6d2455d(int param0, int param1, boolean param2, int param3, rm param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Confined.field_J ? 1 : 0;
        try {
          if (param0 >= -112) {
            field_a = (String) null;
          }
          var5_int = km.b(4, 3 * (param3 - param1));
          var6 = 3 * param1;
          var7 = var5_int - 10;
          ab.b((byte) 110);
          if (param4.field_A > 0 &&
            null != param4.field_P) {
            se.a(0);
          }
          ei.field_jb = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_w > var8)))) {
            var9 = param4.field_z[var8];
            var10 = param4.field_m[var8];
            var11 = param4.field_J[var8];
            stackOut_13_0 = param2;
            stackIn_56_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = qf.field_a[var9];
                var13 = db.field_x[var9];
                var14 = -var12 + qf.field_a[var10];
                var15 = qf.field_a[var11] - var12;
                var16 = -var13 + db.field_x[var10];
                var17 = db.field_x[var11] - var13;
              }
              if (!stackIn_14_0 ||
                !(-(var16 * var15) + var17 * var14 >= 0)) {
                var12Lifetime1 = cj.field_b[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = cj.field_b[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = cj.field_b[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 + var13Lifetime1 + var14 - var6;
                      if (0 <= var7) {
                        stackIn_35_0 = var15 >> var7;
                      } else {
                        stackIn_35_0 = var15 << -var7;
                      }
                      var16 = -stackIn_35_0 + vb.field_e.length - 1;
                      var17 = vb.field_e[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_46_0 = 0;
                          stackIn_46_1 = var16;
                          if (stackIn_46_0 > stackIn_46_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = vb.field_e[var16];
                          continue;
                        }
                        stackIn_46_0Lifetime1 = var17;
                        stackIn_46_1Lifetime1 = var16 << 4;
                        var18 = stackIn_46_0Lifetime1 + stackIn_46_1Lifetime1;
                        tl.field_i[var18] = var8;
                        vb.field_e[var16] = var17 + 1;
                        if (param4.field_A > 0 &&
                          param4.field_P != null) {
                          dupTemp$0 = param4.field_P[var8];
                          bd.field_g[dupTemp$0] = bd.field_g[dupTemp$0] + 1;
                        }
                        ei.field_jb = ei.field_jb + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_56_0 = -1;
          }
          if (stackIn_56_0 > ~param4.field_A &&
            null != param4.field_P) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= bd.field_g.length)) {
              var10Lifetime1 = bd.field_g[var9Lifetime1];
              bd.field_g[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_72_0 = var5;
          stackIn_72_1 = new StringBuilder().append("rc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }
}
