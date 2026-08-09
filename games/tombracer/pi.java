/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vg {
    private int field_h;
    private int field_k;
    private int field_l;
    private int field_f;
    private bs field_g;
    private int field_j;
    private int field_i;

    final boolean a(int param0, int param1) {
        if (!this.b(120)) {
          if (param1 != 3) {
            this.b(-6, -25);
            return false;
          } else {
            return false;
          }
        } else {
          if (param0 <= this.field_h) {
            if (param1 == 3) {
              return false;
            } else {
              this.b(-6, -25);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (this.a(param2, 3)) {
          return true;
        } else {
          if (param1 == -1) {
            if ((this.field_k ^ -1) < -1) {
              if (param0 < this.field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            this.a(-125, -75, 17);
            if ((this.field_k ^ -1) < -1) {
              if (param0 < this.field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    private final int a(boolean param0) {
        if (param0) {
            this.c(40, 38);
            return this.field_j;
        }
        return this.field_j;
    }

    pi(bs param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4);
        try {
            this.field_h = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(pi param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (!this.field_g.a(false, param0.field_g)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_i != param0.field_i) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (!this.b(120)) {
                    break L1;
                  } else {
                    if (param0.field_h == this.field_h) {
                      break L1;
                    } else {
                      stackIn_11_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L2: {
                  L3: {
                    if (this.field_k == param1) {
                      break L3;
                    } else {
                      if (param0.field_k != 0) {
                        L4: {
                          var3_int = this.a(false);
                          var4 = param0.a(false);
                          var5 = this.c(-30481);
                          var6 = param0.c(param1 ^ -30481);
                          if (var4 > var5) {
                            break L4;
                          } else {
                            if (var6 < var3_int) {
                              break L4;
                            } else {
                              L5: {
                                var7 = iia.d(var5, var6, 2);
                                var8 = et.b(var4, var3_int, param1 ^ -120);
                                if (this.field_k >= param0.field_k) {
                                  break L5;
                                } else {
                                  this.field_f = param0.field_f;
                                  break L5;
                                }
                              }
                              this.field_j = var8;
                              this.field_k = var7 + -var8;
                              break L2;
                            }
                          }
                        }
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (this.field_k == 0) {
                    this.field_k = 0;
                    return true;
                  } else {
                    this.field_f = param0.field_f;
                    this.field_k = 0;
                    break L2;
                  }
                }
                stackIn_28_0 = 1;
                decompiledRegionSelector0 = 4;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("pi.J(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                return stackIn_28_0 != 0;
              }
            }
          }
        }
    }

    final boolean c(int param0, int param1) {
        if (param1 >= 95) {
          if (this.field_j <= param0) {
            if (0 != this.field_k) {
              if (param0 < this.field_l) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(dt param0, int param1) {
        int discarded$0 = 0;
        try {
            if (param1 > -52) {
                discarded$0 = this.c(22);
            }
            this.field_g.a(this.field_h, (byte) 102, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dt param0, int param1, int param2) {
        try {
            if (param2 != 0) {
                this.toString();
            }
            this.field_g.a(param0, 113, this.field_h, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 3) {
            return -84;
        }
        return this.field_i;
    }

    private final void a(kh param0, int param1) {
        try {
            param0.h((byte) 112);
            if (param1 > -108) {
                this.a(3, -70, 47);
            }
            this.field_g = lka.a(-90, param0, 26);
            this.field_f = param0.b((byte) 44, 3);
            this.field_i = param0.b((byte) 44, 3);
            this.field_j = param0.b((byte) 44, 32);
            this.field_k = param0.b((byte) 44, 8);
            this.field_l = this.field_j + 50 * this.field_k;
            if (!(!this.b(122))) {
                this.field_h = param0.b((byte) 44, 5);
            }
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0) {
        if (param0 <= 118) {
            return true;
        }
        return this.field_g.a(false);
    }

    final int b(int param0, int param1) {
        dt var4;
        if (param1 > -15) {
          var4 = (dt) null;
          this.a((dt) null, -69);
          return param0 + -this.field_j;
        } else {
          return param0 + -this.field_j;
        }
    }

    private final int c(int param0) {
        if (param0 != -30481) {
            return -32;
        }
        return this.field_l;
    }

    public final String toString() {
        String var1 = "PendingEvent";
        var1 = var1 + "(instigator: " + this.field_f + ", course:" + this.field_i;
        if (!(!this.b(121))) {
            var1 = var1 + ", room:" + this.field_h;
        }
        var1 = var1 + ", start:" + this.field_j + ", duration:" + this.field_k + ")";
        return var1;
    }

    private pi(bs param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_l = param4 * 50 + param3;
            this.field_g = param0;
            this.field_j = param3;
            this.field_k = param4;
            this.field_i = param2;
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    pi(kh param0) {
        try {
            this.a(param0, -124);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(kh param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param0.i(8);
              if (param1 == -19733) {
                break L1;
              } else {
                this.c(123, -124);
                break L1;
              }
            }
            L2: {
              this.field_g.a(param0, -5);
              param0.a((byte) -32, this.field_f, 3);
              param0.a((byte) -2, this.field_i, 3);
              param0.a((byte) -128, this.field_j, 32);
              param0.a((byte) 95, this.field_k, 8);
              if (this.b(122)) {
                param0.a((byte) -125, this.field_h, 5);
                param0.k(-1826190686);
                break L2;
              } else {
                param0.k(-1826190686);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pi.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
