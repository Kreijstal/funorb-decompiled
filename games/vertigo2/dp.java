/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ji {
    static String[] field_F;
    private int field_z;
    static int[] field_A;
    private int field_y;
    private int[] field_D;
    private int[] field_B;
    private int field_C;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int == 0) {
            this.field_z = param2.h(-11);
          } else {
            if (1 == var4_int) {
              this.field_C = param2.a((byte) -11);
            } else {
              if (var4_int == 2) {
                this.field_y = param2.h(-11);
              }
            }
          }
          if (param0 != 110) {
            this.field_D = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("dp.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var10 = Vertigo2.field_L ? 1 : 0;
        var13 = this.field_x.a(param0, (byte) -124);
        var12 = var13;
        var3 = var12;
        if (this.field_x.field_i) {
          var4 = lf.field_y[param0];
          if (this.field_y == 0) {
            var5 = 0;
            var6 = 0;
            L8: while (true) {
              if (var6 < this.field_z) {
                if (this.field_B[var6] <= var4 &&
                  this.field_B[1 + var6] > var4) {
                  if (this.field_D[var6] <= var4) {
                    break L8;
                  }
                  var5 = 4096;
                  break L8;
                }
                var6++;
                continue;
              }
              break;
            }
            qq.a(var13, 0, we.field_M, var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var5Lifetime1 = 0;
            while (!(var5Lifetime1 >= we.field_M)) {
              var6Lifetime1 = 0;
              var7 = 0;
              var8 = rh.field_O[var5Lifetime1];
              var9 = this.field_y;
              stackIn_18_0 = ~var9;
              stackIn_18_1 = -2;
              if (stackIn_18_0 == stackIn_18_1) {
                var6Lifetime1 = var8;
              } else {
                if (var9 == 2) {
                  var6Lifetime1 = (-4096 + var4 + var8 >> 1) + 2048;
                } else {
                  if (var9 == 3) {
                    var6Lifetime1 = 2048 + (-var4 + var8 >> 1);
                  }
                }
              }
              var11 = 0;
              var9Lifetime1 = var11;
              L5: while (true) {
                if (var11 < this.field_z) {
                  if (var6Lifetime1 >= this.field_B[var11] &&
                    this.field_B[var11 + 1] > var6Lifetime1) {
                    if (this.field_D[var11] <= var6Lifetime1) {
                      break L5;
                    }
                    var7 = 4096;
                    break L5;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var13 = var12;
              var13[var5Lifetime1] = var7;
              var5Lifetime1++;
            }
          }
        }
        if (param1 <= 91) {
          this.field_C = 10;
        }
        return var3;
    }

    final void a(int param0) {
        if (param0 > -98) {
          CharSequence var3 = (CharSequence) null;
          dp.a((CharSequence) null, true, false);
        }
        this.g(4096);
    }

    final static String a(CharSequence param0, boolean param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = jn.field_d;
            return stackIn_3_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = rc.a(param0, 320);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!jq.a(var4.charAt(0), -96) &&
                !jq.a(var4.charAt(-1 + var4.length()), -96)) {
                var5 = 0;
                if (param1) {
                  dp.h(-57);
                }
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!jq.a((char) var7, -96)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_30_0 = mo.field_a;
                    return stackIn_30_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_35_0 = vq.field_p;
                return stackIn_35_0;
              }
              stackIn_18_0 = vq.field_p;
              return stackIn_18_0;
            }
            stackIn_13_0 = jn.field_d;
            return stackIn_13_0;
          }
          stackIn_8_0 = jn.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("dp.B(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 >= -68) {
          return;
        }
        field_F = null;
        field_A = null;
    }

    public dp() {
        super(0, true);
        this.field_y = 0;
        this.field_z = 10;
        this.field_C = 2048;
    }

    private final void g(int param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        this.field_D = new int[1 + this.field_z];
        this.field_B = new int[1 + this.field_z];
        int var3 = 4096 / this.field_z;
        int var4 = this.field_C * var3 >> 12;
        for (var5 = 0; this.field_z > var5; var5++) {
          this.field_B[var5] = var2;
          this.field_D[var5] = var4 + var2;
          var2 = var2 + var3;
        }
        this.field_B[this.field_z] = 4096;
        this.field_D[this.field_z] = this.field_D[0] + param0;
    }

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var1 = kb.field_a;
          synchronized (var1) {
            mm.field_a = mm.field_a + 1;
            rq.field_B = ah.field_l;
            if (fh.field_w < 0) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                cr.field_eb[var5] = false;
                var5++;
              }
              fh.field_w = bd.field_f;
            } else {
              while (bd.field_f != fh.field_w) {
                var2 = bq.field_D[bd.field_f];
                bd.field_f = 127 & bd.field_f + 1;
                if (var2 >= 0) {
                  cr.field_eb[var2] = true;
                  continue;
                }
                cr.field_eb[~var2] = false;
              }
            }
            ah.field_l = ro.field_e;
          }
          if (param0 <= 97) {
            field_F = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "dp.F(" + param0 + ')');
        }
    }

    final static v a(String param0, String param1, byte param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        wi stackIn_3_0 = null;
        nd stackIn_7_0 = null;
        c stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param4 &&
            param1 != null) {
            stackIn_3_0 = new wi(param1, param0);
            return (v) ((Object) stackIn_3_0);
          }
          if (param3) {
            stackIn_7_0 = new nd(param4, param0);
            return (v) ((Object) stackIn_7_0);
          }
          if (param2 != -7) {
            dp.b((byte) 42);
          }
          stackIn_11_0 = new c(param4, param0);
          return (v) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("dp.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_F = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new int[8192];
    }
}
