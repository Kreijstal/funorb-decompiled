/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends wo {
    static String field_Bb;

    final int j(byte param0) {
        if (param0 > -42) {
          return -15;
        }
        return super.j((byte) -86);
    }

    ig(int param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void l(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        var8 = ZombieDawn.field_J;
        this.field_F = 0;
        super.l(param0);
        var2 = this.a(true);
        var3 = var2 / 24;
        var4 = this.f(param0 ^ 237239940);
        var5 = var4 / 24;
        var6 = 127 & this.l(param0 - 157);
        if (this.field_F != 1) {
          if (var5 >= 34) {
            boolean decompiledFrameRemainder1 = true;
            var7 = 0;
            if (var6 == 10) {
              this.field_X = var4;
              this.field_Y = -96 + var2;
              var7 = 1;
            } else {
              if (var6 != 14 && (var2 < 1080 ||
                500 >= var4)) {
                if (var6 == 2) {
                  this.field_Y = var2;
                  this.field_X = var4 + 72;
                  var7 = 1;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (var2 > 48) {
                    if (var4 <= 96) {
                      this.field_Y = -24 + var2 + so.c(48);
                      var7 = 1;
                      this.field_X = -48 + (so.c(96) + 96);
                    } else {
                      if (var2 >= 1080) {
                        this.field_Y = -24 - so.c(48) + 1008;
                        var7 = 1;
                        this.field_X = so.c(48) + var4 - 24;
                      } else {
                        if (!(1440 > var4)) {
                          this.field_Y = so.c(48) + (var2 - 24);
                          this.field_X = -24 + (so.c(8) + 1436);
                          var7 = 1;
                        }
                      }
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    this.field_Y = 24 + (so.c(48) + 96);
                    var7 = 1;
                    this.field_X = -24 + (var4 + so.c(48));
                    if (var7 != 0) {
                      this.c(0, this.field_D);
                      this.e(1, -6904);
                      this.field_Ab = false;
                    }
                    if (var6 == 3) {
                      dj.field_e.a(this, (byte) 110);
                      ho.a(this.f(237239984), (byte) 54, this.a(true));
                      this.b(-27598);
                      this.d(0);
                    } else {
                      if (var2 <= -24) {
                        this.b(-27598);
                        this.d(0);
                      } else {
                        if (24 + dj.field_e.field_H.field_u <= var2) {
                          this.b(-27598);
                          this.d(0);
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                this.field_X = var4;
                this.field_Y = 96 + var2;
                var7 = 1;
              }
            }
            if (var7 == 0) {
              if (var6 == 3) {
                dj.field_e.a(this, (byte) 110);
                ho.a(this.f(237239984), (byte) 54, this.a(true));
              } else {
                if (var2 > -24 &&
                  24 + dj.field_e.field_H.field_u > var2) {
                  return;
                }
              }
              this.b(-27598);
              this.d(0);
              return;
            }
            this.c(0, this.field_D);
            this.e(1, -6904);
            this.field_Ab = false;
            if (var6 == 3) {
              dj.field_e.a(this, (byte) 110);
              ho.a(this.f(237239984), (byte) 54, this.a(true));
              this.b(-27598);
              this.d(0);
            } else {
              if (var2 <= -24) {
                this.b(-27598);
                this.d(0);
              } else {
                if (24 + dj.field_e.field_H.field_u <= var2) {
                  this.b(-27598);
                  this.d(0);
                }
              }
            }
            return;
          }
          if (45 > var3 &&
            3 < var3 &&
            var5 > 5) {
            if (var6 == 3) {
              dj.field_e.a(this, (byte) 110);
              ho.a(this.f(237239984), (byte) 54, this.a(true));
            } else {
              if (var2 > -24 &&
                24 + dj.field_e.field_H.field_u > var2) {
                return;
              }
            }
            this.b(-27598);
            this.d(0);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var7Lifetime1 = 0;
          if (var6 == 10) {
            this.field_X = var4;
            this.field_Y = -96 + var2;
            var7Lifetime1 = 1;
          } else {
            if (var6 != 14 && (var2 < 1080 ||
              500 >= var4)) {
              if (var6 == 2) {
                this.field_Y = var2;
                this.field_X = var4 + 72;
                var7Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var2 > 48) {
                  if (var4 <= 96) {
                    this.field_Y = -24 + var2 + so.c(48);
                    var7Lifetime1 = 1;
                    this.field_X = -48 + (so.c(96) + 96);
                  } else {
                    if (var2 >= 1080) {
                      this.field_Y = -24 - so.c(48) + 1008;
                      var7Lifetime1 = 1;
                      this.field_X = so.c(48) + var4 - 24;
                    } else {
                      if (!(1440 > var4)) {
                        this.field_Y = so.c(48) + (var2 - 24);
                        this.field_X = -24 + (so.c(8) + 1436);
                        var7Lifetime1 = 1;
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_Y = 24 + (so.c(48) + 96);
                  var7Lifetime1 = 1;
                  this.field_X = -24 + (var4 + so.c(48));
                  if (var7Lifetime1 != 0) {
                    this.c(0, this.field_D);
                    this.e(1, -6904);
                    this.field_Ab = false;
                  }
                  if (var6 == 3) {
                    dj.field_e.a(this, (byte) 110);
                    ho.a(this.f(237239984), (byte) 54, this.a(true));
                    this.b(-27598);
                    this.d(0);
                    return;
                  }
                  if (var2 <= -24) {
                    this.b(-27598);
                    this.d(0);
                  } else {
                    if (24 + dj.field_e.field_H.field_u <= var2) {
                      this.b(-27598);
                      this.d(0);
                      return;
                    }
                  }
                  return;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              this.field_X = var4;
              this.field_Y = 96 + var2;
              var7Lifetime1 = 1;
            }
          }
          if (var7Lifetime1 != 0) {
            this.c(0, this.field_D);
            this.e(1, -6904);
            this.field_Ab = false;
          }
        }
        if (var6 == 3) {
          dj.field_e.a(this, (byte) 110);
          ho.a(this.f(237239984), (byte) 54, this.a(true));
        } else {
          if (var2 > -24 &&
            24 + dj.field_e.field_H.field_u > var2) {
            return;
          }
        }
        this.b(-27598);
        this.d(0);
    }

    final void g(int param0) {
        super.g(107);
        if (param0 < 95) {
          this.g(18);
        }
        if (this.f(237239984) - 48 <= dj.field_e.field_H.field_p &&
          this.a(true) - 48 <= dj.field_e.field_H.field_u) {
          return;
        }
        this.b(-27598);
        this.d(0);
    }

    final void a(wk param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ZombieDawn.field_J;
        try {
          var3_int = param0.a(this.a(true), (byte) -103);
          var4 = param0.a(this.f(237239984), 0);
          bi.d(var3_int, var4, this.field_pb, 65535);
          if (param1 != 5060) {
            ig.m((byte) 7);
          }
          bi.e(var3_int, var4, param0.a(this.field_Y, (byte) -128), param0.a(this.field_X, param1 - 5060), 16711935);
          for (var5 = 0; var5 < this.field_ub; var5++) {
            var6 = param0.a(this.field_jb[var5], (byte) -115);
            var7 = param0.a(this.field_gb[var5], 0);
            bi.b(var6 - 1, var7 - 1, 3, 3, 0);
            bi.a(var6, var7, 65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ig.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void x(int param0) {
        field_Bb = null;
        if (param0 != -96) {
          ig.x(-81);
        }
    }

    final static void m(byte param0) {
        ce.field_q = false;
        nm.field_c = false;
        og.b(-115, -1);
        if (param0 > -43) {
          field_Bb = (String) null;
          fk.field_F = ic.field_S;
          tk.field_a = ic.field_S;
          return;
        }
        fk.field_F = ic.field_S;
        tk.field_a = ic.field_S;
    }

    final void d(byte param0) {
        if (this.f(237239984) < 0) {
          return;
        }
        if (this.f(237239984) > dj.field_e.field_H.field_p) {
          return;
        }
        if (!(this.a(true) >= 0)) {
          return;
        }
        int var2 = 57 % ((param0 - 66) / 50);
        super.d((byte) 123);
    }

    final static int f(int param0, int param1) {
        if (param0 != 2047) {
          field_Bb = (String) null;
          return en.field_e[param1 & 2047];
        }
        return en.field_e[param1 & 2047];
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4, rb param5, int param6, int param7, int param8, mf param9, int param10, mf param11, int param12, mf param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          re.field_g = param0;
          wb.field_m = param5;
          di.a(param17, param10, param12, (byte) -116, param19);
          hn.a(1780, param14, param13, param8);
          ro.a(param4, param7, param9, param11, param16, -386);
          ba.a(18002, param18, param2);
          if (param3 != 495) {
            field_Bb = (String) null;
          }
          kc.a((byte) 50, param15, param1, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("ig.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    static {
        field_Bb = "FEAR";
    }
}
