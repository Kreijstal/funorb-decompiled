/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends mf {
    static boolean field_n;
    static bh field_q;
    private boolean field_s;
    static int field_o;
    static int field_m;
    static String field_r;
    private String field_l;
    static int field_k;
    static String field_p;

    final static java.applet.Applet f(int param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        da stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != fl.field_F) {
            stackIn_2_0 = fl.field_F;
            return stackIn_2_0;
          }
          if (param0 != 1) {
            field_m = 77;
          }
          stackIn_7_0 = ca.field_c;
          return (java.applet.Applet) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "jg.J(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_65_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_90_1 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        va var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var8Lifetime1;
        byte[] var9Lifetime1;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        int stackIn_79_0Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var7Lifetime1;
        int var12Lifetime3;
        var15 = wizardrun.field_H;
        try {
          var2 = new va(param0);
          var2.field_m = -2 + param0.length;
          wb.field_f = var2.j(-14477);
          if (!param1) {
            return;
          }
          ue.field_e = new byte[wb.field_f][];
          mf.field_j = new byte[wb.field_f][];
          tf.field_b = new int[wb.field_f];
          ne.field_h = new int[wb.field_f];
          cg.field_k = new int[wb.field_f];
          v.field_e = new boolean[wb.field_f];
          ph.field_q = new int[wb.field_f];
          var2.field_m = param0.length - (7 + 8 * wb.field_f);
          hk.field_bb = var2.j(-14477);
          eg.field_v = var2.j(-14477);
          var3 = 1 + (255 & var2.f(255));
          var4 = 0;
          do {
            if (!(wb.field_f > var4)) {
              var4 = 0;
              break;
            }
            ph.field_q[var4] = var2.j(-14477);
            var4++;
          } while (var15 == 0);
          do {
            if (!(var4 < wb.field_f)) {
              var4 = 0;
              break;
            }
            ne.field_h[var4] = var2.j(-14477);
            var4++;
          } while (var15 == 0);
          do {
            if (!(var4 < wb.field_f)) {
              var4 = 0;
              break;
            }
            cg.field_k[var4] = var2.j(-14477);
            var4++;
          } while (var15 == 0);
          do {
            if (!(wb.field_f > var4)) {
              var2.field_m = -(wb.field_f * 8) + (-7 + param0.length + (-(var3 * 3) + 3));
              ic.field_b = new int[var3];
              break;
            }
            tf.field_b[var4] = var2.j(-14477);
            var4++;
          } while (var15 == 0);
          var4 = 1;
          while (var3 > var4) {
            ic.field_b[var4] = var2.d((byte) 125);
            stackIn_46_0 = ~ic.field_b[var4];
            stackIn_46_1 = -1;
            if (var15 != 0) {
              if (stackIn_46_0 >= stackIn_46_1) {
                return;
              }
              var5 = cg.field_k[var4];
              var6 = tf.field_b[var4];
              var7 = var6 * var5;
              var8 = new byte[var7];
              mf.field_j[var4] = var8;
              var9 = new byte[var7];
              ue.field_e[var4] = var9;
              var10 = 0;
              var11 = var2.f(255);
              return;
            } else {
              if (stackIn_46_0 == stackIn_46_1) {
                ic.field_b[var4] = 1;
              }
              var4++;
              continue;
            }
          }
          var2.field_m = 0;
          var4 = 0;
          L38: while (true) {
            stackIn_45_0 = var4;
            while (true) {
              stackIn_46_0Lifetime1 = stackIn_45_0;
              stackIn_46_1Lifetime1 = wb.field_f;
              if (stackIn_46_0Lifetime1 >= stackIn_46_1Lifetime1) {
                return;
              }
              var5Lifetime1 = cg.field_k[var4];
              var6Lifetime1 = tf.field_b[var4];
              var7Lifetime1 = var6Lifetime1 * var5Lifetime1;
              var8Lifetime1 = new byte[var7Lifetime1];
              mf.field_j[var4] = var8Lifetime1;
              var9Lifetime1 = new byte[var7Lifetime1];
              ue.field_e[var4] = var9Lifetime1;
              var10Lifetime1 = 0;
              var11Lifetime1 = var2.f(255);
              if (var15 != 0) {
                return;
              }
              stackIn_50_0 = -1;
              stackIn_50_1 = var11Lifetime1 & 1;
              stackIn_50_2 = -1;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_50_0 == (stackIn_50_1 ^ stackIn_50_2)) {
                  var12 = 0;
                  while (var7Lifetime1 > var12) {
                    var8Lifetime1[var12] = var2.k(0);
                    var12++;
                  }
                  if (((2 & var11Lifetime1) != 0)) {
                    var12Lifetime3 = 0;
                    while (var12Lifetime3 < var7Lifetime1) {
                      dupTemp$0 = var2.k(0);
                      var9Lifetime1[var12Lifetime3] = dupTemp$0;
                      var13 = dupTemp$0;
                      stackIn_50_0 = var10Lifetime1;
                      stackIn_50_1 = var13;
                      stackIn_50_2 = -1;
                      if (stackIn_50_1 == stackIn_50_2) {
                        stackIn_65_1 = 0;
                      } else {
                        stackIn_65_1 = 1;
                      }
                      var10Lifetime1 = stackIn_50_0 | stackIn_65_1;
                      var12Lifetime3++;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var12Lifetime1 = 0;
                  while (var5Lifetime1 > var12Lifetime1) {
                    stackIn_79_0 = 0;
                    var13Lifetime1 = stackIn_79_0;
                    while (var6Lifetime1 > var13Lifetime1) {
                      var8Lifetime1[var12Lifetime1 + var13Lifetime1 * var5Lifetime1] = var2.k(0);
                      var13Lifetime1++;
                    }
                    var12Lifetime1++;
                  }
                  stackIn_79_0Lifetime1 = -1;
                  if (stackIn_79_0Lifetime1 != ~(var11Lifetime1 & 2)) {
                    var12Lifetime2 = 0;
                    while (var12Lifetime2 < var5Lifetime1) {
                      stackIn_45_0 = 0;
                      var13Lifetime2 = stackIn_45_0;
                      while (var13Lifetime2 < var6Lifetime1) {
                        dupTemp$1 = var2.k(0);
                        var9Lifetime1[var5Lifetime1 * var13Lifetime2 + var12Lifetime2] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_50_0 = var10Lifetime1;
                        stackIn_50_1 = 0;
                        stackIn_50_2 = ~var14;
                        if (stackIn_50_1 == stackIn_50_2) {
                          stackIn_90_1 = 0;
                        } else {
                          stackIn_90_1 = 1;
                        }
                        var10Lifetime1 = stackIn_50_0 | stackIn_90_1;
                        var13Lifetime2++;
                      }
                      var12Lifetime2++;
                    }
                  }
                }
                v.field_e[var4] = var10Lifetime1 != 0;
                var4++;
                continue L38;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_98_0 = var2_ref;
          stackIn_98_1 = new StringBuilder().append("jg.H(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 68) {
            this.field_l = (String) null;
          }
          this.field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "jg.B(" + param0 + ')');
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd var4 = null;
        try {
          var3 = bl.a(4, (CharSequence) ((Object) param0));
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (param1 != -1) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_l)) {
            var4 = pl.a(param1 ^ 0, param0);
            if (var4 != null &&
              null == var4.field_h) {
              this.field_l = param0;
              this.field_s = var4.field_i;
            } else {
              stackIn_14_0 = null;
              return (String) (stackIn_14_0);
            }
          }
          if (!this.field_s) {
            stackIn_20_0 = uc.field_e;
            return stackIn_20_0;
          }
          stackIn_22_0 = oj.field_d;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("jg.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    jg(og param0) {
        super(param0);
        this.field_s = false;
    }

    public static void c(byte param0) {
        try {
          field_p = null;
          field_r = null;
          field_q = null;
          if (param0 <= 97) {
            field_m = 69;
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "jg.I(" + param0 + ')');
        }
    }

    final ok a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_5_0 = null;
        ok stackIn_12_0 = null;
        ok stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_k = -25;
          }
          if (!ad.a((CharSequence) ((Object) param1), (byte) 120)) {
            stackIn_5_0 = hg.field_c;
            return stackIn_5_0;
          }
          if (!param1.equals(this.field_l)) {
            var3 = pl.a(param0 ^ 0, param1);
            if (null != var3 &&
              null == var3.field_h) {
              this.field_l = param1;
              this.field_s = var3.field_i;
            } else {
              stackIn_12_0 = l.field_S;
              return stackIn_12_0;
            }
          }
          if (this.field_s) {
            stackIn_18_0 = gf.field_V;
          } else {
            stackIn_18_0 = hg.field_c;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_q = new bh(8, 0, 4, 1);
        field_r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_p = "EXCLUSIVE";
    }
}
