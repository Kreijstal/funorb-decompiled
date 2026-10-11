/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ej {
    private mf field_u;
    private mf field_r;
    private mf field_v;
    private rl field_n;
    private boolean field_m;
    private int[] field_w;
    private int field_A;
    private int field_s;
    private boolean field_o;
    static String field_z;
    static String field_x;
    private rl field_y;
    private int field_p;
    private int[] field_t;
    private int field_l;
    private rl field_q;

    final synchronized void a(int param0, int param1, boolean param2, rl param3, int param4, int param5) {
        boolean stackIn_18_1 = false;
        int stackIn_33_0 = 0;
        mf stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        mf stackIn_50_0 = null;
        boolean stackIn_51_1 = false;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_o &&
            param2) {
            if (this.field_s <= 0) {
              if (null != this.field_q) {
                this.field_v.a((byte) 97);
              }
              this.field_q = param3;
              if (param3 != null) {
                this.field_v.a(false, param3, true);
                this.a((byte) -71, this.field_v, param4, param5);
              }
            } else {
              if (null != this.field_n) {
                this.field_r.a((byte) 97);
              }
              this.field_n = param3;
              if (param3 != null) {
                this.field_r.a(false, param3, true);
                this.a((byte) -113, this.field_r, param4, param5);
              }
            }
            return;
          }
          stackIn_18_1 = (param2);
          this.field_o = stackIn_18_1;
          if (param1 != 0) {
            this.field_A = -21;
          }
          if (this.field_n == param3) {
            this.field_s = param0;
            this.a((byte) -106, this.field_r, param4, param5);
            return;
          }
          if (this.field_q == param3) {
            this.field_s = -param0;
            this.a((byte) -84, this.field_v, param4, param5);
            return;
          }
          if (null != this.field_n) {
            if (null == this.field_q) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_l >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (null != this.field_n) {
              this.field_r.a((byte) 97);
            }
            this.field_n = param3;
            if (param3 != null) {
              stackIn_50_0 = this.field_r;
              stackIn_51_1 = !(param2);
              ((mf) (Object) stackIn_50_0).a(stackIn_51_1, param3, true);
              this.a((byte) -84, this.field_r, param4, param5);
            }
            this.field_s = param0;
            return;
          }
          if (this.field_q != null) {
            this.field_v.a((byte) 97);
          }
          this.field_q = param3;
          if (param3 != null) {
            stackIn_42_0 = this.field_v;
            stackIn_43_1 = !(param2);
            ((mf) (Object) stackIn_42_0).a(stackIn_43_1, param3, true);
            this.a((byte) -95, this.field_v, param4, param5);
          }
          this.field_s = -param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param0 != -15705) {
          field_z = (String) null;
          this.field_p = param1;
          return;
        }
        this.field_p = param1;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (this.field_l <= 0) {
          if (1048576 > this.field_l &&
            null != this.field_q) {
            this.field_v.a(param0);
          }
          if (this.field_A > 0 &&
            null != this.field_y) {
            this.field_u.a(param0);
          }
          if (this.field_o) {
            if (this.field_s > 0 &&
              !this.field_r.d(144)) {
              this.field_o = false;
              this.field_s = -this.field_s;
              this.field_n = null;
              if (this.field_s != 0) {
                this.field_l = this.field_l + this.field_s * param0;
                if (this.field_l >= 1048576) {
                  this.field_l = 1048576;
                  if (!this.field_o) {
                    this.field_s = 0;
                    if (!this.field_m) {
                      if (null != this.field_q) {
                        this.field_v.a((byte) 97);
                      }
                      this.field_q = null;
                    }
                  }
                } else {
                  if (0 >= this.field_l) {
                    this.field_l = 0;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                        }
                        this.field_n = null;
                      }
                    }
                  }
                }
              }
              return;
            }
            if (this.field_s < 0 &&
              !this.field_v.d(144)) {
              this.field_o = false;
              this.field_s = -this.field_s;
              this.field_q = null;
              if (this.field_s != 0) {
                this.field_l = this.field_l + this.field_s * param0;
                if (this.field_l >= 1048576) {
                  this.field_l = 1048576;
                  if (!this.field_o) {
                    this.field_s = 0;
                    if (!this.field_m) {
                      if (null != this.field_q) {
                        this.field_v.a((byte) 97);
                      }
                      this.field_q = null;
                    }
                  }
                } else {
                  if (0 >= this.field_l) {
                    this.field_l = 0;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                        }
                        this.field_n = null;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
          if (this.field_s == 0) {
            return;
          }
          this.field_l = this.field_l + this.field_s * param0;
          if (this.field_l >= 1048576) {
            this.field_l = 1048576;
            if (this.field_o) {
              return;
            }
            this.field_s = 0;
            if (this.field_m) {
              return;
            }
            if (null != this.field_q) {
              this.field_v.a((byte) 97);
            }
            this.field_q = null;
            return;
          }
        } else {
          if (this.field_n != null) {
            this.field_r.a(param0);
          }
          if (1048576 <= this.field_l) {
            if (this.field_A > 0 &&
              null != this.field_y) {
              this.field_u.a(param0);
            }
            if (this.field_o) {
              if (this.field_s > 0 &&
                !this.field_r.d(144)) {
                this.field_o = false;
                this.field_s = -this.field_s;
                this.field_n = null;
                if (this.field_s != 0) {
                  this.field_l = this.field_l + this.field_s * param0;
                  if (this.field_l >= 1048576) {
                    this.field_l = 1048576;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_q) {
                          this.field_v.a((byte) 97);
                        }
                        this.field_q = null;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (!this.field_o) {
                        this.field_s = 0;
                        if (!this.field_m) {
                          if (null != this.field_n) {
                            this.field_r.a((byte) 97);
                          }
                          this.field_n = null;
                        }
                      }
                    }
                  }
                }
                return;
              }
              if (this.field_s < 0 &&
                !this.field_v.d(144)) {
                this.field_o = false;
                this.field_s = -this.field_s;
                this.field_q = null;
                if (this.field_s != 0) {
                  this.field_l = this.field_l + this.field_s * param0;
                  if (this.field_l >= 1048576) {
                    this.field_l = 1048576;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_q) {
                          this.field_v.a((byte) 97);
                        }
                        this.field_q = null;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (!this.field_o) {
                        this.field_s = 0;
                        if (!this.field_m) {
                          if (null != this.field_n) {
                            this.field_r.a((byte) 97);
                          }
                          this.field_n = null;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
            if (this.field_s == 0) {
              return;
            }
            this.field_l = this.field_l + this.field_s * param0;
            if (this.field_l >= 1048576) {
              this.field_l = 1048576;
              if (this.field_o) {
                return;
              }
              this.field_s = 0;
              if (this.field_m) {
                return;
              }
              if (null != this.field_q) {
                this.field_v.a((byte) 97);
              }
              this.field_q = null;
              return;
            }
          } else {
            if (null != this.field_q) {
              this.field_v.a(param0);
            }
            if (this.field_A > 0 &&
              null != this.field_y) {
              this.field_u.a(param0);
            }
            if (!this.field_o) {
              if (this.field_s == 0) {
                return;
              }
              this.field_l = this.field_l + this.field_s * param0;
              if (this.field_l >= 1048576) {
                this.field_l = 1048576;
                if (this.field_o) {
                  return;
                }
                this.field_s = 0;
                if (this.field_m) {
                  return;
                }
                if (null != this.field_q) {
                  this.field_v.a((byte) 97);
                }
                this.field_q = null;
                return;
              }
            } else {
              if (this.field_s > 0 &&
                !this.field_r.d(144)) {
                this.field_o = false;
                this.field_s = -this.field_s;
                this.field_n = null;
                if (this.field_s != 0) {
                  this.field_l = this.field_l + this.field_s * param0;
                  if (this.field_l >= 1048576) {
                    this.field_l = 1048576;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_q) {
                          this.field_v.a((byte) 97);
                          this.field_q = null;
                          return;
                        }
                        this.field_q = null;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (this.field_o) {
                        return;
                      }
                      this.field_s = 0;
                      if (this.field_m) {
                        return;
                      }
                      if (null != this.field_n) {
                        this.field_r.a((byte) 97);
                      }
                      this.field_n = null;
                      return;
                    }
                  }
                }
                return;
              }
              if (this.field_s >= 0) {
                if (this.field_s != 0) {
                  this.field_l = this.field_l + this.field_s * param0;
                  if (this.field_l >= 1048576) {
                    this.field_l = 1048576;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_q) {
                          this.field_v.a((byte) 97);
                          this.field_q = null;
                          return;
                        }
                        this.field_q = null;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (this.field_o) {
                        return;
                      }
                      this.field_s = 0;
                      if (this.field_m) {
                        return;
                      }
                      if (null != this.field_n) {
                        this.field_r.a((byte) 97);
                      }
                      this.field_n = null;
                      return;
                    }
                  }
                }
                return;
              }
              if (this.field_v.d(144)) {
                if (this.field_s != 0) {
                  this.field_l = this.field_l + this.field_s * param0;
                  if (this.field_l >= 1048576) {
                    this.field_l = 1048576;
                    if (!this.field_o) {
                      this.field_s = 0;
                      if (!this.field_m) {
                        if (null != this.field_q) {
                          this.field_v.a((byte) 97);
                          this.field_q = null;
                          return;
                        }
                        this.field_q = null;
                      }
                    }
                  } else {
                    if (0 >= this.field_l) {
                      this.field_l = 0;
                      if (this.field_o) {
                        return;
                      }
                      this.field_s = 0;
                      if (this.field_m) {
                        return;
                      }
                      if (null != this.field_n) {
                        this.field_r.a((byte) 97);
                      }
                      this.field_n = null;
                      return;
                    }
                  }
                }
                return;
              }
              this.field_o = false;
              this.field_s = -this.field_s;
              this.field_q = null;
              if (this.field_s == 0) {
                return;
              }
              this.field_l = this.field_l + this.field_s * param0;
              if (this.field_l >= 1048576) {
                this.field_l = 1048576;
                if (!this.field_o) {
                  this.field_s = 0;
                  if (!this.field_m) {
                    if (null != this.field_q) {
                      this.field_v.a((byte) 97);
                      this.field_q = null;
                      return;
                    }
                    this.field_q = null;
                  }
                }
                return;
              }
            }
          }
        }
        if (0 < this.field_l) {
          return;
        }
        this.field_l = 0;
        if (this.field_o) {
          return;
        }
        this.field_s = 0;
        if (this.field_m) {
          return;
        }
        if (null != this.field_n) {
          this.field_r.a((byte) 97);
        }
        this.field_n = null;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
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
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_p <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_o) {
            if (this.field_s > 0 &&
              !this.field_r.d(144)) {
              this.field_n = null;
              this.field_s = -this.field_s;
              this.field_o = false;
            } else {
              if (this.field_s < 0 &&
                !this.field_v.d(144)) {
                this.field_q = null;
                this.field_o = false;
                this.field_s = -this.field_s;
              }
            }
          }
          var4_int = (this.field_l >> 12) * this.field_p / 256;
          var5 = this.field_p - var4_int;
          if (this.field_s != 0) {
            this.field_l = this.field_l + param2 * this.field_s;
            if (this.field_l >= 1048576) {
              this.field_l = 1048576;
              if (!this.field_o) {
                this.field_s = 0;
                if (!this.field_m) {
                  if (this.field_q != null) {
                    this.field_v.a((byte) 97);
                  }
                  this.field_q = null;
                }
              }
            } else {
              if (0 >= this.field_l) {
                this.field_l = 0;
                if (!this.field_o) {
                  this.field_s = 0;
                  if (!this.field_m) {
                    if (this.field_n != null) {
                      this.field_r.a((byte) 97);
                    }
                    this.field_n = null;
                  }
                }
              }
            }
          }
          if (!gj.field_u) {
            stackIn_32_0 = param2;
          } else {
            stackIn_32_0 = param2 << 1;
          }
          var6 = stackIn_32_0;
          if (this.field_A < 256 && (null != this.field_n ||
            this.field_q != null)) {
            if (var4_int == 256) {
              this.field_r.a(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_w != null &&
                  this.field_w.length >= var6) {
                  fk.a(this.field_w, 0, var6);
                  fk.a(this.field_t, 0, var6);
                } else {
                  this.field_w = new int[var6];
                  this.field_t = new int[var6];
                }
                this.field_r.a(this.field_w, 0, param2);
                this.field_v.a(this.field_t, 0, param2);
                if (gj.field_u) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_47_0 = localTemp$0;
                } else {
                  stackIn_47_0 = param1;
                }
                var7 = stackIn_47_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_t[var8] * var5 + this.field_w[var8] * var4_int >> 8);
                }
              } else {
                this.field_v.a(param0, param1, param2);
              }
            }
          }
          if (this.field_y != null &&
            0 != this.field_A) {
            if (null != this.field_w &&
              this.field_w.length >= var6) {
              fk.a(this.field_w, 0, var6);
            } else {
              this.field_w = new int[var6];
              this.field_t = new int[var6];
            }
            this.field_u.a(this.field_w, 0, param2);
            if (!gj.field_u) {
              stackIn_61_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_61_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_61_0;
            var8Lifetime1 = this.field_A * this.field_p / 256;
            var9 = this.field_p - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = param0[var10 + var7Lifetime1] * var9 + this.field_w[var10] * var8Lifetime1 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("se.AA(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, mf param1, int param2, int param3) {
        try {
          param1.b(param3, -1, -129);
          param1.b(param2, (byte) -110);
          if (param0 > -61) {
            this.b();
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "se.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ej b() {
        return null;
    }

    final ej a() {
        return null;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_z = null;
        if (param0) {
          field_x = (String) null;
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    final synchronized int d() {
        return 2;
    }

    static {
        field_z = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_x = "Invalid password.";
    }
}
