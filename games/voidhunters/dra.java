/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra extends f {
    private kka field_o;
    hbb field_n;
    private int field_u;
    static phb[] field_v;
    private boolean field_q;
    private int field_s;
    private hbb field_j;
    private kka field_m;
    private int[] field_r;
    private kka field_w;
    private int field_h;
    private int[] field_p;
    hbb field_k;
    private boolean field_i;
    private hbb field_l;
    private int field_t;

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
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
        var11 = VoidHunters.field_G;
        try {
          if (this.field_h <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_q) {
            if (this.field_t > 0 &&
              !this.field_k.c(-93)) {
              this.field_o = null;
              this.field_q = false;
              this.field_t = -this.field_t;
            } else {
              if (this.field_t < 0 &&
                !this.field_j.c(-123)) {
                this.field_q = false;
                this.field_m = null;
                this.field_t = -this.field_t;
              }
            }
          }
          var4_int = this.field_h * (this.field_s >> 12) / 256;
          var5 = this.field_h - var4_int;
          if (this.field_t != 0) {
            this.field_s = this.field_s + param2 * this.field_t;
            if (this.field_s < 1048576) {
              if (this.field_s <= 0) {
                this.field_s = 0;
                if (!this.field_q) {
                  this.field_t = 0;
                  if (!this.field_i) {
                    if (null != this.field_o) {
                      this.field_k.a(true);
                    }
                    this.field_o = null;
                  }
                }
              }
            } else {
              this.field_s = 1048576;
              if (!this.field_q) {
                this.field_t = 0;
                if (!this.field_i) {
                  if (null != this.field_m) {
                    this.field_j.a(true);
                  }
                  this.field_m = null;
                }
              }
            }
          }
          if (vka.field_r) {
            stackIn_34_0 = param2 << 1;
          } else {
            stackIn_34_0 = param2;
          }
          var6 = stackIn_34_0;
          if (this.field_u < 256 && (this.field_o != null ||
            this.field_m != null)) {
            if (var4_int == 256) {
              this.field_k.a(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_r != null &&
                  var6 <= this.field_r.length) {
                  cua.a(this.field_r, 0, var6);
                  cua.a(this.field_p, 0, var6);
                } else {
                  this.field_p = new int[var6];
                  this.field_r = new int[var6];
                }
                this.field_k.a(this.field_r, 0, param2);
                this.field_j.a(this.field_p, 0, param2);
                if (vka.field_r) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                } else {
                  stackIn_48_0 = param1;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_p[var8] + this.field_r[var8] * var4_int >> 8);
                }
              } else {
                this.field_j.a(param0, param1, param2);
              }
            }
          }
          if (this.field_w != null) {
            if (0 == this.field_u) {
              return;
            }
            if (null != this.field_r &&
              this.field_r.length >= var6) {
              cua.a(this.field_r, 0, var6);
            } else {
              this.field_p = new int[var6];
              this.field_r = new int[var6];
            }
            this.field_l.a(this.field_r, 0, param2);
            if (vka.field_r) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_h * this.field_u / 256;
            var9 = -var8Lifetime1 + this.field_h;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_r[var10] + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("dra.E(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (this.field_s > 0 &&
          null != this.field_o) {
          this.field_k.a(param0);
        }
        if (this.field_s < 1048576 &&
          null != this.field_m) {
          this.field_j.a(param0);
        }
        if (0 < this.field_u &&
          null != this.field_w) {
          this.field_l.a(param0);
        }
        if (this.field_q) {
          if (this.field_t > 0 &&
            !this.field_k.c(-110)) {
            this.field_o = null;
            this.field_q = false;
            this.field_t = -this.field_t;
          } else {
            if (0 > this.field_t &&
              !this.field_j.c(-102)) {
              this.field_q = false;
              this.field_t = -this.field_t;
              this.field_m = null;
            }
          }
        }
        if (this.field_t != 0) {
          this.field_s = this.field_s + param0 * this.field_t;
          if (1048576 <= this.field_s) {
            this.field_s = 1048576;
            if (!this.field_q) {
              this.field_t = 0;
              if (!this.field_i) {
                if (null != this.field_m) {
                  this.field_j.a(true);
                }
                this.field_m = null;
              }
            }
          } else {
            if (this.field_s <= 0) {
              this.field_s = 0;
              if (!this.field_q) {
                this.field_t = 0;
                if (!this.field_i) {
                  if (this.field_o != null) {
                    this.field_k.a(true);
                  }
                  this.field_o = null;
                }
              }
            }
          }
        }
    }

    private final void a(hbb param0, int param1, int param2, int param3) {
        try {
          if (param2 >= -112) {
            this.field_k = (hbb) null;
          }
          this.field_n = param0;
          param0.b(param1, (byte) 18, -1);
          param0.a((byte) 30, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dra.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 67) {
          return;
        }
        lla.field_b = param1;
        lla.field_e = lla.field_b / 2;
    }

    final synchronized void a(int param0, kka param1, int param2, int param3) {
        try {
          int var5_int = -83 % ((-81 - param0) / 45);
          this.a(256, param2, false, param1, -123, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dra.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final f c() {
        return null;
    }

    final synchronized void b(byte param0, int param1) {
        this.field_h = param1;
        if (param0 != -108) {
          dra.c(72);
        }
    }

    final synchronized int d() {
        return 2;
    }

    private final void a(int param0, hbb param1, hbb param2) {
        try {
          this.field_k = param1;
          this.field_j = param2;
          int var4_int = 88 % ((73 - param0) / 51);
          this.field_s = 1048576;
          this.field_n = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dra.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final f a() {
        return null;
    }

    final synchronized void a(int param0, int param1, boolean param2, kka param3, int param4, int param5) {
        boolean stackIn_18_1 = false;
        int stackIn_29_0 = 0;
        hbb stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        hbb stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (this.field_q &&
            param2) {
            if (this.field_t > 0) {
              if (null != this.field_o) {
                this.field_k.a(true);
              }
              this.field_o = param3;
              if (param3 != null) {
                this.field_k.a(false, param3, -1);
                this.a(this.field_k, param0, -125, param5);
              }
            } else {
              if (null != this.field_m) {
                this.field_j.a(true);
              }
              this.field_m = param3;
              if (param3 != null) {
                this.field_j.a(false, param3, -1);
                this.a(this.field_j, param0, -118, param5);
              }
            }
            return;
          }
          stackIn_18_1 = (param2);
          this.field_q = stackIn_18_1;
          var7_int = -19 / ((param4 + 81) / 32);
          if (this.field_o == param3) {
            this.field_t = param1;
            this.a(this.field_k, param0, -116, param5);
            return;
          }
          if (param3 == this.field_m) {
            this.field_t = -param1;
            this.a(this.field_j, param0, -128, param5);
            return;
          }
          if (null == this.field_o) {
            var8 = 1;
          } else {
            if (this.field_m == null) {
              var8 = 0;
            } else {
              stackIn_29_0 = (524288 <= this.field_s) ? 0 : 1;
              var8 = stackIn_29_0;
            }
          }
          if (var8 != 0) {
            if (null != this.field_o) {
              this.field_k.a(true);
            }
            this.field_o = param3;
            if (param3 != null) {
              stackIn_48_0 = this.field_k;
              stackIn_49_1 = !(param2);
              ((hbb) (Object) stackIn_48_0).a(stackIn_49_1, param3, -1);
              this.a(this.field_k, param0, -122, param5);
            }
            this.field_t = param1;
          } else {
            if (null != this.field_m) {
              this.field_j.a(true);
            }
            this.field_m = param3;
            if (param3 != null) {
              stackIn_39_0 = this.field_j;
              stackIn_40_1 = !(param2);
              ((hbb) (Object) stackIn_39_0).a(stackIn_40_1, param3, -1);
              this.a(this.field_j, param0, -117, param5);
            }
            this.field_t = -param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_54_0 = var7;
          stackIn_54_1 = new StringBuilder().append("dra.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 <= 37) {
          field_v = (phb[]) null;
        }
    }

    dra(hbb param0, hbb param1, hbb param2) {
        this.field_u = 0;
        this.field_h = 256;
        this.field_i = false;
        try {
          this.a(-93, param0, param1);
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
