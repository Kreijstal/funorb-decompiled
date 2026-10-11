/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dg extends vg implements fo, noa {
    private int field_l;
    gr field_k;
    private int field_i;
    int field_g;
    private boolean field_j;
    gma field_h;
    private int field_f;

    void a(gma param0, int param1, gr param2) {
        try {
          if (param1 != -2159) {
            this.h(80);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param1 <= 96) {
          this.e(72);
          this.field_f = param0;
          return;
        }
        this.field_f = param0;
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
          return false;
        }
        return true;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          return -69;
        }
        if (null != this.field_h) {
          return this.field_h.e(9648);
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = 19 % ((param0 + 23) / 53);
        if (null != this.field_h) {
          return this.field_h.d(3);
        }
        return 0;
    }

    int m(byte param0) {
        if (param0 > -63) {
          this.a(-26, -105);
          return -1;
        }
        return -1;
    }

    void b(int param0, uw param1) {
        int var3_int = 0;
        if (~this.field_i != param0) {
          return;
        }
        try {
          var3_int = this.k((byte) -99);
          this.a((byte) 66, var3_int, param1);
          this.field_i = var3_int;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_362_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        la var9;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        int var7Lifetime2Lifetime1;
        int var7Lifetime3Lifetime1;
        int var7Lifetime3Lifetime2;
        int var8Lifetime2Lifetime1;
        int var8Lifetime3Lifetime1;
        int var8Lifetime3Lifetime2;
        la var9Lifetime1;
        la var9Lifetime2;
        la var9Lifetime3;
        la var9Lifetime4;
        la var9Lifetime2Lifetime1;
        la var9Lifetime3Lifetime1;
        la var9Lifetime3Lifetime2;
        int var7Lifetime2Lifetime2;
        int var8Lifetime2Lifetime2;
        if (this.field_h == null) {
          return;
        }
        if (this.field_h.b(true)) {
          return;
        }
        var2 = this.m((byte) -88);
        var3 = this.f((byte) -108);
        if (var2 == -1) {
          if (var3 == -1) {
            return;
          }
          if (param0 != -12663) {
            this.field_f = -42;
          }
          var4 = 0;
          if (var4 == 0) {
            stackIn_16_0 = (this.field_h.h(param0 + 31070)) ? 1 : 0;
          } else {
            stackIn_16_0 = 1;
          }
          var5 = stackIn_16_0;
          if (this.field_k != null) {
            if (var5 == 0) {
              if (this.field_k.a(param0 ^ 12575)) {
                stackIn_26_0 = (this.field_k.a((byte) 87)) ? 1 : 0;
              } else {
                stackIn_26_0 = 1;
              }
            } else {
              stackIn_26_0 = 1;
            }
            var5 = stackIn_26_0;
          }
          if (var5 != 0) {
            stackIn_33_0 = (var4 != 0) ? 1 : 0;
          } else {
            stackIn_33_0 = 1;
          }
          var6 = stackIn_33_0;
          if (var6 == 0 &&
            var5 == 0) {
            return;
          }
          var7 = this.field_h.c(-49);
          var8 = this.field_h.a((byte) 55);
          var9 = this.field_h.f((byte) 79);
          if (var5 != 0 &&
            this.field_j) {
            var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
            this.field_j = false;
          }
          if (var6 != 0 &&
            !this.field_j) {
            var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
            this.field_j = true;
          }
          return;
        }
        if (param0 != -12663) {
          this.field_f = -42;
          var4Lifetime1 = 0;
          if (var4Lifetime1 != 0) {
            stackIn_64_0 = 1;
          } else {
            stackIn_64_0 = (this.field_h.h(param0 + 31070)) ? 1 : 0;
          }
          var5Lifetime1 = stackIn_64_0;
          if (this.field_k != null) {
            if (var5Lifetime1 == 0) {
              if (this.field_k.a(param0 ^ 12575)) {
                stackIn_78_0 = (this.field_k.a((byte) 87)) ? 1 : 0;
                var5Lifetime1 = stackIn_78_0;
              } else {
                stackIn_73_0 = 1;
                var5Lifetime1 = stackIn_73_0;
              }
            } else {
              stackIn_69_0 = 1;
              var5Lifetime1 = stackIn_69_0;
            }
          }
          if (var5Lifetime1 != 0) {
            stackIn_87_0 = (var4Lifetime1 != 0) ? 1 : 0;
            var6Lifetime1 = stackIn_87_0;
          } else {
            stackIn_82_0 = 1;
            var6Lifetime1 = stackIn_82_0;
          }
          if (var6Lifetime1 == 0 &&
            var5Lifetime1 == 0) {
            return;
          }
          var7Lifetime1 = this.field_h.c(-49);
          var8Lifetime1 = this.field_h.a((byte) 55);
          var9Lifetime1 = this.field_h.f((byte) 79);
          if (var5Lifetime1 != 0 &&
            this.field_j) {
            var9Lifetime1.b(var2, var8Lifetime1, var7Lifetime1, this.field_h.e(9648), -119, this.field_h.d(3), var3);
            this.field_j = false;
          }
          if (var6Lifetime1 != 0 &&
            !this.field_j) {
            var9Lifetime1.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime1, var8Lifetime1, 121);
            this.field_j = true;
          }
          return;
        }
        var4Lifetime2 = 0;
        if (var4Lifetime2 != 0) {
          stackIn_218_0 = 1;
        } else {
          if (this.field_h.h(param0 + 31070)) {
            var5Lifetime2 = 1;
            sharedTailExit_0: {
              if (this.field_k != null) {
                if (var5Lifetime2 != 0) {
                  var5Lifetime2 = 1;
                  if (var5Lifetime2 != 0) {
                    stackIn_126_0 = (var4Lifetime2 != 0) ? 1 : 0;
                    var6Lifetime2 = stackIn_126_0;
                  } else {
                    stackIn_121_0 = 1;
                    var6Lifetime2 = stackIn_121_0;
                  }
                  break sharedTailExit_0;
                }
                if (!this.field_k.a(param0 ^ 12575)) {
                  var5Lifetime2 = 1;
                  if (var5Lifetime2 == 0) {
                    stackIn_158_0 = 1;
                  } else {
                    stackIn_158_0 = (var4Lifetime2 != 0) ? 1 : 0;
                  }
                  var6Lifetime2 = stackIn_158_0;
                  if (var6Lifetime2 != 0) {
                    var7Lifetime2 = this.field_h.c(-49);
                    var8Lifetime2 = this.field_h.a((byte) 55);
                    var9Lifetime2 = this.field_h.f((byte) 79);
                    if (var5Lifetime2 != 0 &&
                      this.field_j) {
                      var9Lifetime2.b(var2, var8Lifetime2, var7Lifetime2, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                      this.field_j = false;
                    }
                    if (var6Lifetime2 != 0 &&
                      !this.field_j) {
                      var9Lifetime2.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime2, var8Lifetime2, 121);
                      this.field_j = true;
                    }
                    return;
                  }
                  if (var5Lifetime2 == 0) {
                    return;
                  }
                  var7Lifetime2Lifetime2 = this.field_h.c(-49);
                  var8Lifetime2Lifetime2 = this.field_h.a((byte) 55);
                  var9Lifetime2 = this.field_h.f((byte) 79);
                  if (var5Lifetime2 != 0 &&
                    this.field_j) {
                    var9Lifetime2.b(var2, var8Lifetime2Lifetime2, var7Lifetime2Lifetime2, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                    this.field_j = false;
                  }
                  if (var6Lifetime2 != 0 &&
                    !this.field_j) {
                    var9Lifetime2.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime2Lifetime2, var8Lifetime2Lifetime2, 121);
                    this.field_j = true;
                  }
                  return;
                }
                stackIn_185_0 = (!this.field_k.a((byte) 87)) ? 0 : 1;
                var5Lifetime2 = stackIn_185_0;
              }
              if (var5Lifetime2 != 0) {
                stackIn_192_0 = (var4Lifetime2 != 0) ? 1 : 0;
              } else {
                stackIn_192_0 = 1;
              }
              var6Lifetime2 = stackIn_192_0;
            }
            if (var6Lifetime2 == 0 &&
              var5Lifetime2 == 0) {
              return;
            }
            var7Lifetime2Lifetime1 = this.field_h.c(-49);
            var8Lifetime2Lifetime1 = this.field_h.a((byte) 55);
            var9Lifetime2Lifetime1 = this.field_h.f((byte) 79);
            if (var5Lifetime2 != 0 &&
              this.field_j) {
              var9Lifetime2Lifetime1.b(var2, var8Lifetime2Lifetime1, var7Lifetime2Lifetime1, this.field_h.e(9648), -119, this.field_h.d(3), var3);
              this.field_j = false;
            }
            if (var6Lifetime2 != 0 &&
              !this.field_j) {
              var9Lifetime2Lifetime1.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime2Lifetime1, var8Lifetime2Lifetime1, 121);
              this.field_j = true;
            }
            return;
          }
          stackIn_218_0 = 0;
        }
        var5Lifetime3 = stackIn_218_0;
        if (this.field_k != null) {
          if (var5Lifetime3 != 0) {
            var5Lifetime3 = 1;
            sharedTailExit_1: {
              if (var5Lifetime3 != 0) {
                if (var4Lifetime2 != 0) {
                  var6Lifetime3 = 1;
                  break sharedTailExit_1;
                }
                stackIn_246_0 = 0;
              } else {
                stackIn_246_0 = 1;
              }
              var6Lifetime3 = stackIn_246_0;
            }
            if (var6Lifetime3 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3 = this.field_h.c(-49);
            var8Lifetime3 = this.field_h.a((byte) 55);
            var9Lifetime3 = this.field_h.f((byte) 79);
            if (var5Lifetime3 == 0) {
              if (var6Lifetime3 != 0 &&
                !this.field_j) {
                var9Lifetime3.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3, var8Lifetime3, 121);
                this.field_j = true;
              }
              return;
            }
            if (!this.field_j) {
              if (var6Lifetime3 != 0 &&
                !this.field_j) {
                var9Lifetime3.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3, var8Lifetime3, 121);
                this.field_j = true;
              }
              return;
            }
            var9Lifetime3.b(var2, var8Lifetime3, var7Lifetime3, this.field_h.e(9648), -119, this.field_h.d(3), var3);
            this.field_j = false;
            if (var6Lifetime3 == 0) {
              return;
            }
            if (this.field_j) {
              return;
            }
            var9Lifetime3.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3, var8Lifetime3, 121);
            this.field_j = true;
            return;
          }
          if (!this.field_k.a(param0 ^ 12575)) {
            var5Lifetime3 = 1;
            sharedTailExit_2: {
              if (var5Lifetime3 != 0) {
                if (var4Lifetime2 != 0) {
                  var6Lifetime3Lifetime1 = 1;
                  break sharedTailExit_2;
                }
                stackIn_293_0 = 0;
              } else {
                stackIn_293_0 = 1;
              }
              var6Lifetime3Lifetime1 = stackIn_293_0;
            }
            if (var6Lifetime3Lifetime1 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3Lifetime1 = this.field_h.c(-49);
            var8Lifetime3Lifetime1 = this.field_h.a((byte) 55);
            var9Lifetime3Lifetime1 = this.field_h.f((byte) 79);
            if (var5Lifetime3 == 0) {
              if (var6Lifetime3Lifetime1 != 0 &&
                !this.field_j) {
                var9Lifetime3Lifetime1.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
                this.field_j = true;
              }
              return;
            }
            if (!this.field_j) {
              if (var6Lifetime3Lifetime1 != 0 &&
                !this.field_j) {
                var9Lifetime3Lifetime1.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
                this.field_j = true;
              }
              return;
            }
            var9Lifetime3Lifetime1.b(var2, var8Lifetime3Lifetime1, var7Lifetime3Lifetime1, this.field_h.e(9648), -119, this.field_h.d(3), var3);
            this.field_j = false;
            if (var6Lifetime3Lifetime1 != 0) {
              if (this.field_j) {
                return;
              }
              var9Lifetime3Lifetime1.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3Lifetime1, var8Lifetime3Lifetime1, 121);
              this.field_j = true;
            }
            return;
          }
          if (this.field_k.a((byte) 87)) {
            var5Lifetime3 = 1;
            if (var5Lifetime3 != 0) {
              stackIn_322_0 = (var4Lifetime2 != 0) ? 1 : 0;
              var6Lifetime3Lifetime2 = stackIn_322_0;
            } else {
              stackIn_317_0 = 1;
              var6Lifetime3Lifetime2 = stackIn_317_0;
            }
            if (var6Lifetime3Lifetime2 == 0 &&
              var5Lifetime3 == 0) {
              return;
            }
            var7Lifetime3Lifetime2 = this.field_h.c(-49);
            var8Lifetime3Lifetime2 = this.field_h.a((byte) 55);
            var9Lifetime3Lifetime2 = this.field_h.f((byte) 79);
            if (var5Lifetime3 != 0 &&
              this.field_j) {
              var9Lifetime3Lifetime2.b(var2, var8Lifetime3Lifetime2, var7Lifetime3Lifetime2, this.field_h.e(9648), -119, this.field_h.d(3), var3);
              this.field_j = false;
            }
            if (var6Lifetime3Lifetime2 != 0 &&
              !this.field_j) {
              var9Lifetime3Lifetime2.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime3Lifetime2, var8Lifetime3Lifetime2, 121);
              this.field_j = true;
            }
            return;
          }
          var5Lifetime3 = 0;
        }
        sharedTailExit_3: {
          if (var5Lifetime3 != 0) {
            if (var4Lifetime2 != 0) {
              var6Lifetime4 = 1;
              if (var6Lifetime4 == 0 &&
                var5Lifetime3 == 0) {
                return;
              }
              var7Lifetime4 = this.field_h.c(-49);
              var8Lifetime4 = this.field_h.a((byte) 55);
              var9Lifetime4 = this.field_h.f((byte) 79);
              if (!this.field_j) {
                if (var6Lifetime4 != 0 &&
                  !this.field_j) {
                  var9Lifetime4.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime4, var8Lifetime4, 121);
                  this.field_j = true;
                }
                return;
              }
              var9Lifetime4.b(var2, var8Lifetime4, var7Lifetime4, this.field_h.e(9648), -119, this.field_h.d(3), var3);
              this.field_j = false;
              break sharedTailExit_3;
            }
            stackIn_362_0 = 0;
          } else {
            stackIn_362_0 = 1;
          }
          var6Lifetime4 = stackIn_362_0;
          if (var6Lifetime4 == 0 &&
            var5Lifetime3 == 0) {
            return;
          }
          var7Lifetime4 = this.field_h.c(-49);
          var8Lifetime4 = this.field_h.a((byte) 55);
          var9Lifetime4 = this.field_h.f((byte) 79);
          if (var5Lifetime3 != 0 &&
            this.field_j) {
            var9Lifetime4.b(var2, var8Lifetime4, var7Lifetime4, this.field_h.e(9648), -119, this.field_h.d(3), var3);
            this.field_j = false;
          }
        }
        if (var6Lifetime4 != 0) {
          if (this.field_j) {
            return;
          }
          var9Lifetime4.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7Lifetime4, var8Lifetime4, 121);
          this.field_j = true;
        }
        return;
    }

    int f(byte param0) {
        int var2 = 121 % ((param0 - 15) / 45);
        return -1;
    }

    void a(byte param0, kh param1) {
        try {
          if (0 < this.field_f) {
            param1.a((byte) 12, 1, 1);
            param1.a((byte) -128, this.field_f, 8);
          } else {
            param1.a((byte) -125, 0, 1);
          }
          int var3_int = -48 / ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gr c(int param0) {
        if (param0 > -73) {
          this.field_l = -95;
          return this.field_k;
        }
        return this.field_k;
    }

    public void f(int param0) {
        if (param0 != -4366) {
          this.field_f = -35;
        }
    }

    final int h(byte param0) {
        if (param0 <= 1) {
          this.a((byte) -62, -88);
          return this.field_l;
        }
        return this.field_l;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return true;
        }
        return this.g((byte) -105);
    }

    void a(gr param0, gma param1, byte param2) {
        try {
          this.field_k = param0;
          if (param2 != 36) {
            iq var5 = (iq) null;
            this.a(-31, (iq) null);
          }
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(byte param0) {
        if (param0 == -30) {
          this.g(param0 - 12633);
          this.field_h = null;
          return;
        }
        this.field_h = (gma) null;
        this.g(param0 - 12633);
        this.field_h = null;
    }

    abstract void a(iq param0, int param1, int param2, int param3, byte param4);

    private final boolean g(byte param0) {
        int var2;
        var2 = -58 % ((-38 - param0) / 60);
        if (this.a((byte) 74)) {
          if (null != this.field_k &&
            this.field_k.a((byte) 87)) {
            return true;
          }
          if (null != this.field_h &&
            !this.field_h.h(18407)) {
            return false;
          }
          return true;
        }
        if (this.field_k == null) {
          return true;
        }
        if (this.field_k.a((byte) 87)) {
          return true;
        }
        if (null == this.field_h) {
          return true;
        }
        if (this.field_h.h(18407)) {
          return true;
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        Object var3 = null;
        int var4 = 0;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_h) {
            if (this.field_h.l(0)) {
              return;
            }
            var3 = null;
            if (this.field_h instanceof fsa) {
              var3 = (fsa) (this.field_h);
            }
            var4 = (this.field_f << 16) + this.field_h.g((byte) 115);
            this.a(param1, this.field_h.e(9648), this.field_h.d(3), var4, (byte) 46);
            if (var3 != null) {
              ((fsa) (var3)).a(param1, -10425);
            }
          }
          if (param0 <= 103) {
            this.field_f = 112;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dg.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void e(int param0) {
        if (param0 >= -16) {
          this.a(-26);
          this.g(-12663);
          return;
        }
        this.g(-12663);
    }

    void a(byte param0, int param1) {
        int var3 = -51 % ((param0 - 7) / 36);
    }

    dg(int param0, la param1, kh param2) {
        this(param0);
        try {
          this.a(125, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void h(int param0) {
        if (param0 < 0) {
          this.field_f = 78;
        }
    }

    final la a(int param0) {
        if (param0 < 12) {
          this.a((byte) -118);
          if (this.field_h != null) {
            return this.field_h.f((byte) 116);
          }
          return null;
        }
        if (this.field_h != null) {
          return this.field_h.f((byte) 116);
        }
        return null;
    }

    final gma j(byte param0) {
        if (param0 != 16) {
          this.field_k = (gr) null;
          return this.field_h;
        }
        return this.field_h;
    }

    int k(byte param0) {
        if (param0 != -99) {
          this.field_j = true;
          if (!this.field_h.j(param0 + 98)) {
            return 7;
          }
          return 2;
        }
        if (!this.field_h.j(param0 + 98)) {
          return 7;
        }
        return 2;
    }

    void a(int param0, uw param1, byte param2) {
        try {
          if (param2 < 40) {
            this.a((byte) -28, 26);
          }
          param1.a(param0, (fo) (this), (byte) -33);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, la param1, kh param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1.field_E >= 15) {
            if (param2.b((byte) 44, 1) != 1) {
              this.field_f = 0;
            } else {
              this.field_f = param2.b((byte) 44, 8);
            }
          }
          if (param0 < 119) {
            this.d(14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public int e(byte param0) {
        if (param0 > -86) {
          this.k((byte) -84);
          if (null != this.field_h) {
            return this.field_h.g((byte) 115) + (this.field_f << 16);
          }
          return 0;
        }
        if (null != this.field_h) {
          return this.field_h.g((byte) 115) + (this.field_f << 16);
        }
        return 0;
    }

    final void a(int param0, byte param1) {
        this.field_f = this.field_f + param0;
        if (param1 <= 112) {
          this.field_f = -110;
        }
    }

    final boolean a(byte param0) {
        int var2 = -53 / ((param0 + 10) / 59);
        return true;
    }

    void a(byte param0, int param1, uw param2) {
        try {
          if (param0 <= 50) {
            this.m((byte) 49);
          }
          param2.a((byte) -99, param1, (fo) (this));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void d(int param0) {
        if (param0 != -1) {
          return;
        }
        this.g(-12663);
    }

    void a(uw param0, int param1) {
        if (this.field_i == -1) {
          return;
        }
        try {
          param0.a(this.field_i, (fo) (this), (byte) -33);
          this.field_i = -1;
          if (param1 < 82) {
            this.d(-6);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, uw param1) {
        if (this.field_i == -1) {
          return;
        }
        if (param0 > -39) {
          this.field_g = 41;
        }
        int var3_int = this.k((byte) -99);
        if (this.field_i == var3_int) {
          return;
        }
        try {
          this.a(this.field_i, param1, (byte) 53);
          this.a((byte) 86, var3_int, param1);
          this.field_i = var3_int;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dg.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dg(int param0) {
        this.field_j = false;
        this.field_i = -1;
        this.field_l = param0;
    }

    static {
    }
}
