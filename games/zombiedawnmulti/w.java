/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        try {
          param0.a(param2, param1, false);
          param0.a((byte) -116, param3);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "w.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        boolean stackIn_17_1 = false;
        int stackIn_32_0 = 0;
        gd stackIn_40_0 = null;
        ug stackIn_40_1 = null;
        boolean stackIn_41_2 = false;
        gd stackIn_49_0 = null;
        ug stackIn_49_1 = null;
        boolean stackIn_50_2 = false;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_y &&
            param2) {
            if (0 >= this.field_q) {
              if (this.field_o != null) {
                this.field_v.g(2);
              }
              this.field_o = param0;
              if (param0 != null) {
                this.field_v.a(param0, false, 8361407);
                this.a(this.field_v, -1, param3, param1);
              }
            } else {
              if (null != this.field_p) {
                this.field_j.g(2);
              }
              this.field_p = param0;
              if (param0 != null) {
                this.field_j.a(param0, false, 8361407);
                this.a(this.field_j, -1, param3, param1);
              }
            }
            return;
          }
          stackIn_17_1 = (param2);
          this.field_y = stackIn_17_1;
          if (!param5) {
            return;
          }
          if (this.field_p == param0) {
            this.field_q = param4;
            this.a(this.field_j, -1, param3, param1);
            return;
          }
          if (param0 == this.field_o) {
            this.field_q = -param4;
            this.a(this.field_v, -1, param3, param1);
            return;
          }
          if (this.field_p != null) {
            if (this.field_o != null) {
              stackIn_32_0 = (524288 <= this.field_s) ? 0 : 1;
              var7_int = stackIn_32_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (null != this.field_o) {
              this.field_v.g(2);
            }
            this.field_o = param0;
            if (param0 != null) {
              stackIn_49_0 = this.field_v;
              stackIn_49_1 = (ug) (param0);
              stackIn_50_2 = !(param2);
              ((gd) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_50_2, 8361407);
              this.a(this.field_v, -1, param3, param1);
            }
            this.field_q = -param4;
          } else {
            if (this.field_p != null) {
              this.field_j.g(2);
            }
            this.field_p = param0;
            if (param0 != null) {
              stackIn_40_0 = this.field_j;
              stackIn_40_1 = (ug) (param0);
              stackIn_41_2 = !(param2);
              ((gd) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_41_2, 8361407);
              this.a(this.field_j, -1, param3, param1);
            }
            this.field_q = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_55_0 = var7;
          stackIn_55_1 = new StringBuilder().append("w.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final gq d() {
        return null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 94 % ((param3 + 10) / 35);
        ia.a(param0, param1, param2, 0);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (pk.field_b != null &&
          pk.field_b.a(false)) {
          q.b(124);
          return true;
        }
        if (param3 != 18663) {
          return false;
        }
        if (bk.field_i != null &&
          bk.field_i.k(param3 ^ 18562)) {
          bk.field_i = null;
          q.b(46);
          return true;
        }
        if (vc.a(param3 ^ 5010853)) {
          return true;
        }
        if (sd.a(param2, (byte) 122, param0, param1)) {
          return true;
        }
        return false;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_s <= 0) {
          if (this.field_s < 1048576 &&
            this.field_o != null) {
            this.field_v.a(param0);
          }
          if (0 < this.field_u &&
            this.field_x != null) {
            this.field_t.a(param0);
          }
          if (this.field_y) {
            if (this.field_q > 0 &&
              !this.field_j.c(-106)) {
              this.field_p = null;
              this.field_q = -this.field_q;
              this.field_y = false;
            } else {
              if (this.field_q < 0 &&
                !this.field_v.c(-61)) {
                this.field_o = null;
                this.field_q = -this.field_q;
                this.field_y = false;
              }
            }
          }
          if (this.field_q == 0) {
            return;
          }
          this.field_s = this.field_s + param0 * this.field_q;
          if (this.field_s >= 1048576) {
            this.field_s = 1048576;
            if (this.field_y) {
              return;
            }
            this.field_q = 0;
            if (!this.field_l) {
              if (null != this.field_o) {
                this.field_v.g(2);
              }
              this.field_o = null;
            }
            return;
          }
        } else {
          if (null != this.field_p) {
            this.field_j.a(param0);
          }
          if (this.field_s >= 1048576) {
            if (0 < this.field_u &&
              this.field_x != null) {
              this.field_t.a(param0);
            }
            if (this.field_y) {
              if (this.field_q > 0 &&
                !this.field_j.c(-106)) {
                this.field_p = null;
                this.field_q = -this.field_q;
                this.field_y = false;
              } else {
                if (this.field_q < 0 &&
                  !this.field_v.c(-61)) {
                  this.field_o = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                }
              }
            }
            if (this.field_q == 0) {
              return;
            }
            this.field_s = this.field_s + param0 * this.field_q;
            if (this.field_s >= 1048576) {
              this.field_s = 1048576;
              if (this.field_y) {
                return;
              }
              this.field_q = 0;
              if (!this.field_l) {
                if (null != this.field_o) {
                  this.field_v.g(2);
                }
                this.field_o = null;
              }
              return;
            }
          } else {
            if (this.field_o != null) {
              this.field_v.a(param0);
              if (0 < this.field_u &&
                this.field_x != null) {
                this.field_t.a(param0);
              }
              if (this.field_y) {
                if (this.field_q > 0 &&
                  !this.field_j.c(-106)) {
                  this.field_p = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                } else {
                  if (this.field_q < 0 &&
                    !this.field_v.c(-61)) {
                    this.field_o = null;
                    this.field_q = -this.field_q;
                    this.field_y = false;
                  }
                }
              }
              if (this.field_q == 0) {
                return;
              }
              this.field_s = this.field_s + param0 * this.field_q;
              if (this.field_s >= 1048576) {
                this.field_s = 1048576;
                if (this.field_y) {
                  return;
                }
                this.field_q = 0;
                if (this.field_l) {
                  return;
                }
                if (null != this.field_o) {
                  this.field_v.g(2);
                }
                this.field_o = null;
                return;
              }
            } else {
              if (0 < this.field_u) {
                if (this.field_x == null) {
                  if (this.field_y) {
                    if (this.field_q > 0 &&
                      !this.field_j.c(-106)) {
                      this.field_p = null;
                      this.field_q = -this.field_q;
                      this.field_y = false;
                    } else {
                      if (this.field_q < 0 &&
                        !this.field_v.c(-61)) {
                        this.field_o = null;
                        this.field_q = -this.field_q;
                        this.field_y = false;
                      }
                    }
                  }
                  if (this.field_q == 0) {
                    return;
                  }
                  this.field_s = this.field_s + param0 * this.field_q;
                  if (this.field_s >= 1048576) {
                    this.field_s = 1048576;
                    if (this.field_y) {
                      return;
                    }
                    this.field_q = 0;
                    if (!this.field_l) {
                      if (null != this.field_o) {
                        this.field_v.g(2);
                      }
                      this.field_o = null;
                    }
                    return;
                  }
                  if (0 < this.field_s) {
                    return;
                  }
                  this.field_s = 0;
                  if (this.field_y) {
                    return;
                  }
                  this.field_q = 0;
                  if (this.field_l) {
                    return;
                  }
                  if (this.field_p != null) {
                    this.field_j.g(2);
                  }
                  this.field_p = null;
                  return;
                }
                this.field_t.a(param0);
              }
              if (this.field_y) {
                if (this.field_q > 0 &&
                  !this.field_j.c(-106)) {
                  this.field_p = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                  if (this.field_q == 0) {
                    return;
                  }
                  this.field_s = this.field_s + param0 * this.field_q;
                  if (this.field_s >= 1048576) {
                    this.field_s = 1048576;
                    if (this.field_y) {
                      return;
                    }
                    this.field_q = 0;
                    if (!this.field_l) {
                      if (null != this.field_o) {
                        this.field_v.g(2);
                      }
                      this.field_o = null;
                    }
                    return;
                  }
                  if (0 < this.field_s) {
                    return;
                  }
                  this.field_s = 0;
                  if (this.field_y) {
                    return;
                  }
                  this.field_q = 0;
                  if (this.field_l) {
                    return;
                  }
                  if (this.field_p != null) {
                    this.field_j.g(2);
                  }
                  this.field_p = null;
                  return;
                }
                if (this.field_q < 0) {
                  if (this.field_v.c(-61)) {
                    if (this.field_q == 0) {
                      return;
                    }
                    this.field_s = this.field_s + param0 * this.field_q;
                    if (this.field_s >= 1048576) {
                      this.field_s = 1048576;
                      if (this.field_y) {
                        return;
                      }
                      this.field_q = 0;
                      if (!this.field_l) {
                        if (null != this.field_o) {
                          this.field_v.g(2);
                        }
                        this.field_o = null;
                      }
                      return;
                    }
                    if (0 < this.field_s) {
                      return;
                    }
                    this.field_s = 0;
                    if (this.field_y) {
                      return;
                    }
                    this.field_q = 0;
                    if (this.field_l) {
                      return;
                    }
                    if (this.field_p != null) {
                      this.field_j.g(2);
                    }
                    this.field_p = null;
                    return;
                  }
                  this.field_o = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                }
              }
              if (this.field_q == 0) {
                return;
              }
              this.field_s = this.field_s + param0 * this.field_q;
              if (this.field_s >= 1048576) {
                this.field_s = 1048576;
                if (this.field_y) {
                  return;
                }
                this.field_q = 0;
                if (!this.field_l) {
                  if (null != this.field_o) {
                    this.field_v.g(2);
                  }
                  this.field_o = null;
                }
                return;
              }
            }
          }
        }
        if (0 < this.field_s) {
          return;
        }
        this.field_s = 0;
        if (this.field_y) {
          return;
        }
        this.field_q = 0;
        if (this.field_l) {
          return;
        }
        if (this.field_p != null) {
          this.field_j.g(2);
        }
        this.field_p = null;
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 18813) {
          this.a();
          this.field_k = param0;
          return;
        }
        this.field_k = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          for (var1_int = 0; uf.field_g > var1_int; var1_int++) {
            uk.field_M[var1_int] = null;
          }
          uf.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
        }
    }

    final gq b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
          return;
        }
        field_z = null;
        field_n = null;
        field_A = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_k <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_y) {
            if (0 < this.field_q &&
              !this.field_j.c(-54)) {
              this.field_p = null;
              this.field_y = false;
              this.field_q = -this.field_q;
            } else {
              if (this.field_q < 0 &&
                !this.field_v.c(-103)) {
                this.field_o = null;
                this.field_q = -this.field_q;
                this.field_y = false;
              }
            }
          }
          var4_int = (this.field_s >> 12) * this.field_k / 256;
          var5 = -var4_int + this.field_k;
          if (this.field_q != 0) {
            this.field_s = this.field_s + this.field_q * param2;
            if (this.field_s >= 1048576) {
              this.field_s = 1048576;
              if (!this.field_y) {
                this.field_q = 0;
                if (!this.field_l) {
                  if (null != this.field_o) {
                    this.field_v.g(2);
                  }
                  this.field_o = null;
                }
              }
            } else {
              if (0 >= this.field_s) {
                this.field_s = 0;
                if (!this.field_y) {
                  this.field_q = 0;
                  if (!this.field_l) {
                    if (null != this.field_p) {
                      this.field_j.g(2);
                    }
                    this.field_p = null;
                  }
                }
              }
            }
          }
          if (gp.field_j) {
            stackIn_32_0 = param2 << 1;
          } else {
            stackIn_32_0 = param2;
          }
          var6 = stackIn_32_0;
          if (this.field_u < 256 && (null != this.field_p ||
            this.field_o != null)) {
            if (var4_int == 256) {
              this.field_j.b(param0, param1, param2);
            } else {
              if (256 != var5) {
                if (this.field_w != null &&
                  this.field_w.length >= var6) {
                  d.a(this.field_w, 0, var6);
                  d.a(this.field_r, 0, var6);
                } else {
                  this.field_w = new int[var6];
                  this.field_r = new int[var6];
                }
                this.field_j.b(this.field_w, 0, param2);
                this.field_v.b(this.field_r, 0, param2);
                if (!gp.field_j) {
                  stackIn_46_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_46_0 = localTemp$0;
                }
                var7 = stackIn_46_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_w[var8] >> 8);
                }
              } else {
                this.field_v.b(param0, param1, param2);
              }
            }
          }
          if (this.field_x != null) {
            if (this.field_u == 0) {
              return;
            }
            if (null != this.field_w &&
              this.field_w.length >= var6) {
              d.a(this.field_w, 0, var6);
            } else {
              this.field_r = new int[var6];
              this.field_w = new int[var6];
            }
            this.field_t.b(this.field_w, 0, param2);
            if (!gp.field_j) {
              stackIn_62_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_u * this.field_k / 256;
            var9 = -var8Lifetime1 + this.field_k;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_w[var10] + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("w.F(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    static {
        field_n = "Ready";
    }
}
