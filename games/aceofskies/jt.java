/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt extends rf {
    private ap field_k;
    private int field_l;
    private int field_q;
    hk field_s;
    private hk field_y;
    hk field_p;
    private int[] field_o;
    private int field_u;
    private int[] field_i;
    private ap field_r;
    static int field_x;
    private int field_j;
    private ap field_v;
    static int field_t;
    private boolean field_m;
    private boolean field_w;
    hk field_n;

    final rf a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_l > 0 &&
          null != this.field_v) {
          this.field_n.a(param0);
        }
        if (this.field_l < 1048576 &&
          null != this.field_r) {
          this.field_p.a(param0);
        }
        if (this.field_j > 0 &&
          this.field_k != null) {
          this.field_y.a(param0);
        }
        if (this.field_m) {
          if (0 < this.field_u &&
            !this.field_n.f(32119)) {
            this.field_u = -this.field_u;
            this.field_m = false;
            this.field_v = null;
          } else {
            if (this.field_u < 0 &&
              !this.field_p.f(32119)) {
              this.field_u = -this.field_u;
              this.field_r = null;
              this.field_m = false;
            }
          }
        }
        if (this.field_u != 0) {
          this.field_l = this.field_l + param0 * this.field_u;
          if (this.field_l < 1048576) {
            if (this.field_l <= 0) {
              this.field_l = 0;
              if (!this.field_m) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (null != this.field_v) {
                    this.field_n.d(-127);
                  }
                  this.field_v = null;
                }
              }
            }
          } else {
            this.field_l = 1048576;
            if (!this.field_m) {
              this.field_u = 0;
              if (!this.field_w) {
                if (null != this.field_r) {
                  this.field_p.d(-127);
                }
                this.field_r = null;
              }
            }
          }
        }
    }

    private final void a(int param0, hk param1, int param2, int param3) {
        try {
          this.field_s = param1;
          param1.a((byte) -124, param2, -1);
          param1.a(param0, -107);
          if (param3 != 30121) {
            hk var6 = (hk) null;
            this.a((hk) null, 88, (hk) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jt.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(hk param0, int param1, hk param2) {
        try {
          if (param1 != 9649) {
            this.b();
          }
          this.field_p = param0;
          this.field_n = param2;
          this.field_s = this.field_n;
          this.field_l = 1048576;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jt.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
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
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_q <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_m) {
            if (this.field_u > 0 &&
              !this.field_n.f(32119)) {
              this.field_m = false;
              this.field_u = -this.field_u;
              this.field_v = null;
            } else {
              if (0 > this.field_u &&
                !this.field_p.f(32119)) {
                this.field_r = null;
                this.field_m = false;
                this.field_u = -this.field_u;
              }
            }
          }
          var4_int = this.field_q * (this.field_l >> 12) / 256;
          var5 = this.field_q - var4_int;
          if (this.field_u != 0) {
            this.field_l = this.field_l + this.field_u * param2;
            if (this.field_l < 1048576) {
              if (this.field_l <= 0) {
                this.field_l = 0;
                if (!this.field_m) {
                  this.field_u = 0;
                  if (!this.field_w) {
                    if (null != this.field_v) {
                      this.field_n.d(-128);
                    }
                    this.field_v = null;
                  }
                }
              }
            } else {
              this.field_l = 1048576;
              if (!this.field_m) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (null != this.field_r) {
                    this.field_p.d(-127);
                  }
                  this.field_r = null;
                }
              }
            }
          }
          if (tk.field_r) {
            stackIn_34_0 = param2 << 1;
          } else {
            stackIn_34_0 = param2;
          }
          var6 = stackIn_34_0;
          if (this.field_j < 256 && (this.field_v != null ||
            null != this.field_r)) {
            if (var4_int == 256) {
              this.field_n.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (null != this.field_i &&
                  this.field_i.length >= var6) {
                  au.a(this.field_i, 0, var6);
                  au.a(this.field_o, 0, var6);
                } else {
                  this.field_i = new int[var6];
                  this.field_o = new int[var6];
                }
                this.field_n.b(this.field_i, 0, param2);
                this.field_p.b(this.field_o, 0, param2);
                if (tk.field_r) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_49_0 = localTemp$0;
                } else {
                  stackIn_49_0 = param1;
                }
                var7 = stackIn_49_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_i[var8] + var5 * this.field_o[var8] >> 8);
                }
              } else {
                this.field_p.b(param0, param1, param2);
              }
            }
          }
          if (this.field_k != null) {
            if (0 == this.field_j) {
              return;
            }
            if (this.field_i != null &&
              var6 <= this.field_i.length) {
              au.a(this.field_i, 0, var6);
            } else {
              this.field_o = new int[var6];
              this.field_i = new int[var6];
            }
            this.field_y.b(this.field_i, 0, param2);
            if (tk.field_r) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_64_0 = localTemp$1;
            } else {
              stackIn_64_0 = param1;
            }
            var7Lifetime1 = stackIn_64_0;
            var8Lifetime1 = this.field_j * this.field_q / 256;
            var9 = this.field_q - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = this.field_i[var10] * var8Lifetime1 + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("jt.M(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, long param2, java.applet.Applet param3, int param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param3.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 < (long)param4) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + bt.a(false, 1000L * param2 + kh.a(-83)) + "; Max-Age=" + param2;
              }
              fe.a(param3, -7012, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("jt.D(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized int d() {
        return 2;
    }

    final synchronized void a(byte param0, int param1, boolean param2, int param3, ap param4, int param5) {
        boolean stackIn_20_1 = false;
        int stackIn_33_0 = 0;
        hk stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        hk stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_m &&
            param2) {
            if (this.field_u > 0) {
              if (null != this.field_v) {
                this.field_n.d(-127);
              }
              this.field_v = param4;
              if (param4 != null) {
                this.field_n.a(false, -2029711608, param4);
                this.a(param5, this.field_n, param3, 30121);
              }
            } else {
              if (null != this.field_r) {
                this.field_p.d(-126);
              }
              this.field_r = param4;
              if (param4 != null) {
                this.field_p.a(false, -2029711608, param4);
                this.a(param5, this.field_p, param3, 30121);
              }
            }
            return;
          }
          if (param0 >= -22) {
            return;
          }
          stackIn_20_1 = (param2);
          this.field_m = stackIn_20_1;
          if (param4 == this.field_v) {
            this.field_u = param1;
            this.a(param5, this.field_n, param3, 30121);
            return;
          }
          if (this.field_r == param4) {
            this.field_u = -param1;
            this.a(param5, this.field_p, param3, 30121);
            return;
          }
          if (this.field_v != null) {
            if (this.field_r == null) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_l >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (this.field_v != null) {
              this.field_n.d(-128);
            }
            this.field_v = param4;
            if (param4 != null) {
              stackIn_51_0 = this.field_n;
              stackIn_52_1 = !(param2);
              ((hk) (Object) stackIn_51_0).a(stackIn_52_1, -2029711608, param4);
              this.a(param5, this.field_n, param3, 30121);
            }
            this.field_u = param1;
          } else {
            if (null != this.field_r) {
              this.field_p.d(-128);
            }
            this.field_r = param4;
            if (param4 != null) {
              stackIn_42_0 = this.field_p;
              stackIn_43_1 = !(param2);
              ((hk) (Object) stackIn_42_0).a(stackIn_43_1, -2029711608, param4);
              this.a(param5, this.field_p, param3, 30121);
            }
            this.field_u = -param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("jt.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 125) {
          this.field_i = (int[]) null;
        }
        this.field_q = param1;
    }

    final rf b() {
        return null;
    }

    jt(hk param0, hk param1) {
        this.field_q = 256;
        this.field_j = 0;
        this.field_w = false;
        try {
          this.a(param1, 9649, param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = 0;
    }
}
