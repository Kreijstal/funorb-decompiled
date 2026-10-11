/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends di {
    private boolean field_o;
    private fj field_w;
    private fj field_l;
    private int field_n;
    static im field_q;
    private fj field_z;
    private int field_m;
    private lj field_t;
    private int[] field_y;
    static String field_k;
    private lj field_s;
    private boolean field_p;
    private int[] field_u;
    private int field_x;
    private int field_r;
    static hj field_j;
    private lj field_v;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15136) {
            field_j = (hj) null;
          }
          stackIn_3_0 = ak.field_y.a(param1, 1, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("t.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_20_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var5 < var3_int; var5++) {
                if (hm.a(-20625, param2.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(var6_int + 2, var5);
              if (!tk.a(10, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = th.a(116, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param1[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          if (param0 != -415993727) {
            field_k = (String) null;
          }
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param2.substring(var7));
              stackIn_29_0 = var6.toString();
              return stackIn_29_0;
            }
            stackIn_20_0 = var8Lifetime1 + 2;
            for (var5Lifetime1 = stackIn_20_0; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (hm.a(-20625, param2.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param2.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!tk.a(10, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param2.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = th.a(113, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param1[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("t.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
          field_j = (hj) null;
        }
        field_k = null;
        field_q = null;
    }

    final synchronized int c() {
        return 2;
    }

    final static hj[] a(String param0, ki param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param0, 0);
          if (param3 > -59) {
            field_q = (im) null;
          }
          var5 = param1.a(param2, 5187, var4_int);
          stackIn_3_0 = ua.a(param1, var4_int, 91, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("t.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final di d() {
        return null;
    }

    final di a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
          this.field_u = (int[]) null;
        }
        this.field_n = param1;
    }

    final synchronized void c(int param0) {
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (this.field_r > 0 &&
          null != this.field_z) {
          this.field_s.c(param0);
        }
        if (this.field_r < 1048576 &&
          this.field_l != null) {
          this.field_v.c(param0);
        }
        if (this.field_m > 0 &&
          this.field_w != null) {
          this.field_t.c(param0);
        }
        if (this.field_p) {
          if (0 < this.field_x &&
            !this.field_s.f(-75)) {
            this.field_x = -this.field_x;
            this.field_p = false;
            this.field_z = null;
          } else {
            if (this.field_x < 0 &&
              !this.field_v.f(-63)) {
              this.field_p = false;
              this.field_x = -this.field_x;
              this.field_l = null;
            }
          }
        }
        if (this.field_x != 0) {
          this.field_r = this.field_r + param0 * this.field_x;
          if (1048576 <= this.field_r) {
            this.field_r = 1048576;
            if (!this.field_p) {
              this.field_x = 0;
              if (!this.field_o) {
                if (null != this.field_l) {
                  this.field_v.e(70);
                }
                this.field_l = null;
              }
            }
          } else {
            if (this.field_r <= 0) {
              this.field_r = 0;
              if (!this.field_p) {
                this.field_x = 0;
                if (!this.field_o) {
                  if (null != this.field_z) {
                    this.field_s.e(98);
                  }
                  this.field_z = null;
                }
              }
            }
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_n <= 0) {
            this.c(param2);
            return;
          }
          if (this.field_p) {
            if (0 < this.field_x &&
              !this.field_s.f(-49)) {
              this.field_x = -this.field_x;
              this.field_p = false;
              this.field_z = null;
            } else {
              if (0 > this.field_x &&
                !this.field_v.f(-98)) {
                this.field_l = null;
                this.field_p = false;
                this.field_x = -this.field_x;
              }
            }
          }
          var4_int = this.field_n * (this.field_r >> 12) / 256;
          var5 = -var4_int + this.field_n;
          if (this.field_x != 0) {
            this.field_r = this.field_r + param2 * this.field_x;
            if (this.field_r >= 1048576) {
              this.field_r = 1048576;
              if (!this.field_p) {
                this.field_x = 0;
                if (!this.field_o) {
                  if (this.field_l != null) {
                    this.field_v.e(114);
                  }
                  this.field_l = null;
                }
              }
            } else {
              if (this.field_r <= 0) {
                this.field_r = 0;
                if (!this.field_p) {
                  this.field_x = 0;
                  if (!this.field_o) {
                    if (this.field_z != null) {
                      this.field_s.e(89);
                    }
                    this.field_z = null;
                  }
                }
              }
            }
          }
          if (la.field_g) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (256 > this.field_m && (this.field_z != null ||
            null != this.field_l)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_y &&
                  var6 <= this.field_y.length) {
                  mk.a(this.field_y, 0, var6);
                  mk.a(this.field_u, 0, var6);
                } else {
                  this.field_u = new int[var6];
                  this.field_y = new int[var6];
                }
                this.field_s.b(this.field_y, 0, param2);
                this.field_v.b(this.field_u, 0, param2);
                if (!la.field_g) {
                  stackIn_50_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_50_0 = localTemp$0;
                }
                var7 = stackIn_50_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var5 + this.field_y[var8] * var4_int >> 8);
                }
              } else {
                this.field_v.b(param0, param1, param2);
              }
            } else {
              this.field_s.b(param0, param1, param2);
            }
          }
          if (this.field_w != null) {
            if (this.field_m == 0) {
              return;
            }
            if (this.field_y != null &&
              this.field_y.length >= var6) {
              mk.a(this.field_y, 0, var6);
            } else {
              this.field_y = new int[var6];
              this.field_u = new int[var6];
            }
            this.field_t.b(this.field_y, 0, param2);
            if (la.field_g) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_m * this.field_n / 256;
            var9 = this.field_n - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_y[var10] + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("t.B(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
          ul.d();
        } else {
          ul.d(0, 0, ul.field_f, ul.field_l, 0, 192);
        }
        m.a(param2, 0);
        if (!param1) {
          field_q = (im) null;
        }
    }

    static {
        field_k = "Ice";
    }
}
