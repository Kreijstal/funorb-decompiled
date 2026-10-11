/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends cg {
    private int[] field_t;
    l field_y;
    private l field_k;
    private int field_r;
    l field_n;
    private int field_m;
    static String field_x;
    private l field_l;
    private qua field_u;
    private boolean field_q;
    private qua field_w;
    private int[] field_o;
    private boolean field_p;
    private int field_s;
    private int field_j;
    private qua field_v;

    final cg b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, int param3, boolean param4, qua param5) {
        boolean stackIn_20_1 = false;
        int stackIn_32_0 = 0;
        l stackIn_42_0 = null;
        qua stackIn_42_1 = null;
        boolean stackIn_43_2 = false;
        l stackIn_51_0 = null;
        qua stackIn_51_1 = null;
        boolean stackIn_52_2 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_q &&
            param4) {
            if (this.field_m <= 0) {
              if (this.field_w != null) {
                this.field_l.b(2);
              }
              this.field_w = param5;
              if (param5 != null) {
                this.field_l.a(param5, false, (byte) 80);
                this.a(1048576, param3, param0, this.field_l);
              }
            } else {
              if (null != this.field_u) {
                this.field_y.b(param2 ^ -42);
              }
              this.field_u = param5;
              if (param5 != null) {
                this.field_y.a(param5, false, (byte) 80);
                this.a(1048576, param3, param0, this.field_y);
              }
            }
            return;
          }
          stackIn_20_1 = (param4);
          this.field_q = stackIn_20_1;
          if (param5 == this.field_u) {
            this.field_m = param1;
            this.a(1048576, param3, param0, this.field_y);
            return;
          }
          if (param5 == this.field_w) {
            this.field_m = -param1;
            this.a(1048576, param3, param0, this.field_l);
            return;
          }
          if (this.field_u == null) {
            var7_int = 1;
          } else {
            if (null != this.field_w) {
              stackIn_32_0 = (this.field_r >= 524288) ? 0 : 1;
              var7_int = stackIn_32_0;
            } else {
              var7_int = 0;
            }
          }
          if (var7_int != 0) {
            if (this.field_u != null) {
              this.field_y.b(param2 + 46);
            }
            this.field_u = param5;
            if (param5 != null) {
              stackIn_51_0 = this.field_y;
              stackIn_51_1 = (qua) (param5);
              stackIn_52_2 = !(param4);
              ((l) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_52_2, (byte) 80);
              this.a(1048576, param3, param0, this.field_y);
            }
            this.field_m = param1;
          } else {
            if (null != this.field_w) {
              this.field_l.b(2);
            }
            this.field_w = param5;
            if (param5 != null) {
              stackIn_42_0 = this.field_l;
              stackIn_42_1 = (qua) (param5);
              stackIn_43_2 = !(param4);
              ((l) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_43_2, (byte) 80);
              this.a(1048576, param3, param0, this.field_l);
            }
            this.field_m = -param1;
          }
          if (param2 == -44) {
            return;
          }
          this.field_u = (qua) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("sq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_x = (String) null;
          field_x = null;
          return;
        }
        field_x = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
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
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_s <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_q) {
            if (this.field_m > 0 &&
              !this.field_y.a((byte) -72)) {
              this.field_q = false;
              this.field_m = -this.field_m;
              this.field_u = null;
            } else {
              if (this.field_m < 0 &&
                !this.field_l.a((byte) -117)) {
                this.field_q = false;
                this.field_w = null;
                this.field_m = -this.field_m;
              }
            }
          }
          var4_int = (this.field_r >> 12) * this.field_s / 256;
          var5 = -var4_int + this.field_s;
          if (0 != this.field_m) {
            this.field_r = this.field_r + param2 * this.field_m;
            if (this.field_r < 1048576) {
              if (this.field_r <= 0) {
                this.field_r = 0;
                if (!this.field_q) {
                  this.field_m = 0;
                  if (!this.field_p) {
                    if (this.field_u != null) {
                      this.field_y.b(2);
                    }
                    this.field_u = null;
                  }
                }
              }
            } else {
              this.field_r = 1048576;
              if (!this.field_q) {
                this.field_m = 0;
                if (!this.field_p) {
                  if (null != this.field_w) {
                    this.field_l.b(2);
                  }
                  this.field_w = null;
                }
              }
            }
          }
          if (!kta.field_h) {
            stackIn_35_0 = param2;
          } else {
            stackIn_35_0 = param2 << 1;
          }
          var6 = stackIn_35_0;
          if (256 > this.field_j && (null != this.field_u ||
            this.field_w != null)) {
            if (var4_int == 256) {
              this.field_y.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_t != null &&
                  this.field_t.length >= var6) {
                  lua.a(this.field_t, 0, var6);
                  lua.a(this.field_o, 0, var6);
                } else {
                  this.field_o = new int[var6];
                  this.field_t = new int[var6];
                }
                this.field_y.b(this.field_t, 0, param2);
                this.field_l.b(this.field_o, 0, param2);
                if (!kta.field_h) {
                  stackIn_49_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_49_0 = localTemp$0;
                }
                var7 = stackIn_49_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var4_int * this.field_t[var8] + var5 * this.field_o[var8] >> 8);
                }
              } else {
                this.field_l.b(param0, param1, param2);
              }
            }
          }
          if (this.field_v != null) {
            if (this.field_j == 0) {
              return;
            }
            if (this.field_t != null &&
              this.field_t.length >= var6) {
              lua.a(this.field_t, 0, var6);
            } else {
              this.field_t = new int[var6];
              this.field_o = new int[var6];
            }
            this.field_k.b(this.field_t, 0, param2);
            if (kta.field_h) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_65_0 = localTemp$1;
            } else {
              stackIn_65_0 = param1;
            }
            var7Lifetime1 = stackIn_65_0;
            var8Lifetime1 = this.field_j * this.field_s / 256;
            var9 = -var8Lifetime1 + this.field_s;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = param0[var10 + var7Lifetime1] * var9 + this.field_t[var10] * var8Lifetime1 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_71_0 = var4;
          stackIn_71_1 = new StringBuilder().append("sq.D(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(l param0, l param1, int param2) {
        try {
          this.field_l = param0;
          this.field_y = param1;
          this.field_r = param2;
          this.field_n = this.field_y;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sq.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -94) {
            var4 = (byte[]) null;
            sq.a(59, (byte[]) null, (byte) -100);
          }
          stackIn_3_0 = aia.a(param1, param0, 71, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(byte param0, int param1) {
        int var3 = -104 / ((-2 - param0) / 53);
        this.field_s = param1;
    }

    private final void a(int param0, int param1, int param2, l param3) {
        try {
          this.field_n = param3;
          param3.a((byte) -105, param2, -1);
          if (param0 != 1048576) {
            this.field_o = (int[]) null;
          }
          param3.a(param1, (byte) 55);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final cg c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (0 >= this.field_r) {
          if (this.field_r < 1048576 &&
            this.field_w != null) {
            this.field_l.a(param0);
          }
          if (this.field_j > 0 &&
            null != this.field_v) {
            this.field_k.a(param0);
          }
          if (this.field_q) {
            if (this.field_m > 0 &&
              !this.field_y.a((byte) -91)) {
              this.field_m = -this.field_m;
              this.field_q = false;
              this.field_u = null;
              if (this.field_m != 0) {
                this.field_r = this.field_r + param0 * this.field_m;
                if (this.field_r < 1048576) {
                  if (this.field_r <= 0) {
                    this.field_r = 0;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (!this.field_p) {
                        if (null != this.field_u) {
                          this.field_y.b(2);
                        }
                        this.field_u = null;
                      }
                    }
                  }
                } else {
                  this.field_r = 1048576;
                  if (!this.field_q) {
                    this.field_m = 0;
                    if (!this.field_p) {
                      if (this.field_w != null) {
                        this.field_l.b(2);
                      }
                      this.field_w = null;
                    }
                  }
                }
              }
              return;
            }
            if (this.field_m < 0 &&
              !this.field_l.a((byte) -127)) {
              this.field_q = false;
              this.field_m = -this.field_m;
              this.field_w = null;
              if (this.field_m != 0) {
                this.field_r = this.field_r + param0 * this.field_m;
                if (this.field_r < 1048576) {
                  if (this.field_r <= 0) {
                    this.field_r = 0;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (!this.field_p) {
                        if (null != this.field_u) {
                          this.field_y.b(2);
                        }
                        this.field_u = null;
                      }
                    }
                  }
                } else {
                  this.field_r = 1048576;
                  if (!this.field_q) {
                    this.field_m = 0;
                    if (!this.field_p) {
                      if (this.field_w != null) {
                        this.field_l.b(2);
                      }
                      this.field_w = null;
                    }
                  }
                }
              }
              return;
            }
          }
          if (this.field_m == 0) {
            return;
          }
          this.field_r = this.field_r + param0 * this.field_m;
          if (this.field_r >= 1048576) {
            this.field_r = 1048576;
            if (this.field_q) {
              return;
            }
            this.field_m = 0;
            if (this.field_p) {
              return;
            }
            if (this.field_w != null) {
              this.field_l.b(2);
            }
            this.field_w = null;
            return;
          }
          if (this.field_r > 0) {
            return;
          }
          this.field_r = 0;
          if (this.field_q) {
            return;
          }
          this.field_m = 0;
          if (this.field_p) {
            return;
          }
          if (null != this.field_u) {
            this.field_y.b(2);
          }
          this.field_u = null;
          return;
        }
        if (this.field_u == null) {
          if (this.field_r < 1048576 &&
            this.field_w != null) {
            this.field_l.a(param0);
          }
          if (this.field_j > 0 &&
            null != this.field_v) {
            this.field_k.a(param0);
          }
          if (this.field_q) {
            if (this.field_m > 0 &&
              !this.field_y.a((byte) -91)) {
              this.field_m = -this.field_m;
              this.field_q = false;
              this.field_u = null;
              if (this.field_m != 0) {
                this.field_r = this.field_r + param0 * this.field_m;
                if (this.field_r < 1048576) {
                  if (this.field_r <= 0) {
                    this.field_r = 0;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (!this.field_p) {
                        if (null != this.field_u) {
                          this.field_y.b(2);
                        }
                        this.field_u = null;
                      }
                    }
                  }
                } else {
                  this.field_r = 1048576;
                  if (!this.field_q) {
                    this.field_m = 0;
                    if (!this.field_p) {
                      if (this.field_w != null) {
                        this.field_l.b(2);
                      }
                      this.field_w = null;
                    }
                  }
                }
              }
              return;
            }
            if (this.field_m < 0 &&
              !this.field_l.a((byte) -127)) {
              this.field_q = false;
              this.field_m = -this.field_m;
              this.field_w = null;
              if (this.field_m != 0) {
                this.field_r = this.field_r + param0 * this.field_m;
                if (this.field_r < 1048576) {
                  if (this.field_r <= 0) {
                    this.field_r = 0;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (!this.field_p) {
                        if (null != this.field_u) {
                          this.field_y.b(2);
                        }
                        this.field_u = null;
                      }
                    }
                  }
                } else {
                  this.field_r = 1048576;
                  if (!this.field_q) {
                    this.field_m = 0;
                    if (!this.field_p) {
                      if (this.field_w != null) {
                        this.field_l.b(2);
                      }
                      this.field_w = null;
                    }
                  }
                }
              }
              return;
            }
          }
          if (this.field_m == 0) {
            return;
          }
          this.field_r = this.field_r + param0 * this.field_m;
          if (this.field_r >= 1048576) {
            this.field_r = 1048576;
            if (this.field_q) {
              return;
            }
            this.field_m = 0;
            if (this.field_p) {
              return;
            }
            if (this.field_w != null) {
              this.field_l.b(2);
            }
            this.field_w = null;
            return;
          }
          if (this.field_r > 0) {
            return;
          }
          this.field_r = 0;
          if (this.field_q) {
            return;
          }
          this.field_m = 0;
          if (this.field_p) {
            return;
          }
          if (null != this.field_u) {
            this.field_y.b(2);
          }
          this.field_u = null;
          return;
        }
        this.field_y.a(param0);
        if (this.field_r < 1048576 &&
          this.field_w != null) {
          this.field_l.a(param0);
        }
        if (this.field_j > 0 &&
          null != this.field_v) {
          this.field_k.a(param0);
        }
        if (this.field_q) {
          if (this.field_m > 0 &&
            !this.field_y.a((byte) -91)) {
            this.field_m = -this.field_m;
            this.field_q = false;
            this.field_u = null;
          } else {
            if (this.field_m >= 0) {
              if (this.field_m == 0) {
                return;
              }
              this.field_r = this.field_r + param0 * this.field_m;
              if (this.field_r >= 1048576) {
                this.field_r = 1048576;
                if (this.field_q) {
                  return;
                }
                this.field_m = 0;
                if (this.field_p) {
                  return;
                }
                if (this.field_w != null) {
                  this.field_l.b(2);
                }
                this.field_w = null;
                return;
              }
              if (this.field_r > 0) {
                return;
              }
              this.field_r = 0;
              if (this.field_q) {
                return;
              }
              this.field_m = 0;
              if (this.field_p) {
                return;
              }
              if (null != this.field_u) {
                this.field_y.b(2);
              }
              this.field_u = null;
              return;
            }
            if (!this.field_l.a((byte) -127)) {
              this.field_q = false;
              this.field_m = -this.field_m;
              this.field_w = null;
            }
          }
        }
        if (this.field_m == 0) {
          return;
        }
        this.field_r = this.field_r + param0 * this.field_m;
        if (this.field_r < 1048576) {
          if (this.field_r <= 0) {
            this.field_r = 0;
            if (!this.field_q) {
              this.field_m = 0;
              if (this.field_p) {
                return;
              }
              if (null != this.field_u) {
                this.field_y.b(2);
              }
              this.field_u = null;
            }
          }
        } else {
          this.field_r = 1048576;
          if (!this.field_q) {
            this.field_m = 0;
            if (this.field_p) {
              return;
            }
            if (this.field_w != null) {
              this.field_l.b(2);
            }
            this.field_w = null;
            return;
          }
        }
    }

    sq(l param0, l param1) {
        this.field_s = 256;
        this.field_p = false;
        this.field_j = 0;
        try {
          this.a(param1, param0, 1048576);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Error connecting to server. Please try using a different server.";
    }
}
