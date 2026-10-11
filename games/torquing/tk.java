/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends lg {
    private long field_E;
    private int field_C;
    private int field_I;
    private boolean field_F;
    private int field_D;
    private long field_H;
    private boolean field_J;
    private int field_G;

    private final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 2 / ((param0 - 58) / 50);
        if (this.field_G != this.field_C) {
          var3 = this.field_G <= this.field_C ? this.field_G : this.field_C;
          var4 = this.field_C < this.field_G ? this.field_G : this.field_C;
          this.field_G = var3;
          this.field_C = var3;
          this.field_m = this.field_m.substring(0, var3) + this.field_m.substring(var4, this.field_m.length());
          this.l(121);
        }
    }

    private final void j(int param0) {
        if (param0 < 59) {
          this.i((byte) 122);
        }
        if (this.field_t instanceof wm) {
          ((wm) (this.field_t)).a(this, (byte) -124);
        }
    }

    private final void a(boolean param0) {
        uj var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fe var9;
        var8 = Torquing.field_u;
        if (!this.field_J) {
          this.field_j = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.field_q instanceof fe)) {
          return;
        }
        var9 = (fe) ((Object) this.field_q);
        var3 = var9.b((byte) 105, (gm) (this));
        var4 = var3.a(param0);
        var5 = var9.b((gm) (this), -1);
        var6 = var9.a(false) >> 1;
        if (var4 < -var6 + var5) {
          this.field_v = 0;
          this.field_j = 0;
        } else {
          var7 = this.field_j + var3.a(this.field_G, (byte) -126);
          if (var7 > var5 - var6) {
            this.field_j = this.field_j - (-var5 + var6) - var7;
          } else {
            if (var7 < var6) {
              this.field_j = this.field_j + var6 - var7;
            }
          }
          if (this.field_j <= 0) {
            if (this.field_j < var6 - var5) {
              this.field_j = var6 - var5;
            }
          } else {
            this.field_j = 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Torquing.field_u;
        try {
          if (param1 >= 0 &&
            param3 < be.field_f) {
            if (param8 < 113) {
              return;
            }
            if (0 > param0 &&
              param4 < 0 &&
              0 > param7) {
              return;
            }
            if (be.field_p <= param0 &&
              be.field_p <= param4 &&
              be.field_p <= param7) {
              return;
            }
            var14 = -param3 + param1;
            if (param3 != param5) {
              var10 = param0 << 16;
              var9_int = param0 << 16;
              var15 = -param3 + param5;
              var11 = (-param0 + param4 << 16) / var15;
              var12 = (-param0 + param7 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (0 > param5) {
                  param3 = param5 - param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + var12 * param3;
                  param3 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + var12 * param3;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = be.field_n[param3];
                while (param3 < param5) {
                  var17 = var9_int >> 16;
                  if (be.field_p > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 != var18) {
                      if (be.field_p <= var17 + var18) {
                        var18 = -1 + (be.field_p - var17);
                      }
                      if (var17 >= 0) {
                        tm.a(var18, var16Lifetime2 + var17, -98, param6, param2);
                      } else {
                        tm.a(var18 + var17, var16Lifetime2, -114, param6, param2);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < be.field_p) {
                        tm.a(var18, var17 + var16Lifetime2, -104, param6, param2);
                      }
                    }
                  }
                  param3++;
                  if (be.field_f <= param3) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + ph.field_j;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param5 + param1;
              if (0 != var16Lifetime3) {
                var17Lifetime2 = param7 << 16;
                if (var13 == 0) {
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            } else {
              if (param1 != param3) {
                var15 = -param5 + param1;
                if (param0 < param4) {
                  var10 = param4 << 16;
                  var12 = (param7 - param4 << 16) / var15;
                  var9_int = param0 << 16;
                  var11 = (param7 - param0 << 16) / var14;
                } else {
                  var11 = (param7 - param4 << 16) / var15;
                  var12 = (param7 - param0 << 16) / var14;
                  var10 = param0 << 16;
                  var9_int = param4 << 16;
                }
              } else {
                var10 = param4 << 16;
                var11 = 0;
                var12 = 0;
                var9_int = param0 << 16;
              }
              if (param3 < 0) {
                param3 = Math.min(-param3, param5 - param3);
                var9_int = var9_int + param3 * var11;
                var10 = var10 + var12 * param3;
                param3 = 0;
              }
              var13 = 0;
            }
            if (param3 < 0) {
              param3 = -param3;
              var9_int = var9_int + param3 * var11;
              var10 = var10 + param3 * var12;
              param3 = 0;
            }
            var15Lifetime1 = be.field_n[param3];
            while (param1 > param3) {
              var16Lifetime1 = var9_int >> 16;
              if (be.field_p > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (0 == var17Lifetime1) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < be.field_p) {
                    tm.a(var17Lifetime1, var16Lifetime1 + var15Lifetime1, -98, param6, param2);
                  }
                } else {
                  if (var17Lifetime1 + var16Lifetime1 >= be.field_p) {
                    var17Lifetime1 = be.field_p - var16Lifetime1 - 1;
                  }
                  if (0 <= var16Lifetime1) {
                    tm.a(var17Lifetime1, var16Lifetime1 + var15Lifetime1, -114, param6, param2);
                  } else {
                    tm.a(var17Lifetime1 + var16Lifetime1, var15Lifetime1, -123, param6, param2);
                  }
                }
              }
              param3++;
              if (param3 >= be.field_f) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + ph.field_j;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("tk.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          if (!param2) {
            this.field_F = false;
          }
          this.field_m = param1;
          var4_int = param1.length();
          if (this.field_I != -1 &&
            var4_int > this.field_I) {
            this.field_m = this.field_m.substring(0, this.field_I);
          }
          dupTemp$1 = this.field_m.length();
          this.field_C = dupTemp$1;
          this.field_G = dupTemp$1;
          if (!param0) {
            this.l(-120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("tk.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Torquing.field_u;
        try {
          ph.b(param1, param0, 1 + param3, 10000536);
          ph.b(param1, param0 + param2, 1 + param3, 12105912);
          var5_int = 1;
          var6 = param2;
          if (var5_int + param0 < ph.field_c) {
            var5_int = -param0 + ph.field_c;
          }
          if (param0 + var6 > ph.field_h) {
            var6 = -param0 + ph.field_h;
          }
          if (param4) {
            return;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + var7 * 48 / param2;
            var9 = var8 << 8 | var8 << 16 | var8;
            ph.field_e[param1 + ph.field_j * (param0 + var7)] = var9;
            ph.field_e[param3 + param1 + (param0 + var7) * ph.field_j] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "tk.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    tk(String param0, ca param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_F = false;
        this.field_D = -1;
        try {
          this.field_q = ah.field_c.field_g;
          this.field_I = param2;
          this.a(true, param0, true);
          this.field_J = true;
          this.field_H = km.b(-1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String n(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 1) {
          var2 = this.field_G > this.field_C ? this.field_C : this.field_G;
          var3 = this.field_C >= this.field_G ? this.field_C : this.field_G;
          return this.field_m.substring(var2, var3);
        }
        return (String) null;
    }

    private final int a(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = Torquing.field_u;
        var2 = this.field_m.length();
        if (var2 == this.field_G) {
          return this.field_G;
        }
        for (var3 = this.field_G + 1; var2 > var3; var3++) {
          if (this.field_m.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 <= 45) {
          return 26;
        }
        return var3;
    }

    void a(int param0, gm param1, int param2, int param3) {
        fe var7 = null;
        int var6 = 0;
        try {
          super.a(124, param1, param2, param3);
          this.a(true);
          if (this.field_l == 1) {
            if (this.field_q instanceof fe) {
              var7 = (fe) ((Object) this.field_q);
              var6 = var7.a(k.field_e, -1, (gm) (this), n.field_t, param2, param3);
              if (var6 != -1) {
                if (this.field_F &&
                  this.field_D > var6 &&
                  this.field_C < var6) {
                  var6 = this.field_D;
                }
                this.field_G = var6;
              }
            }
            this.field_H = km.b(-1);
          }
          int var5_int = -127 / ((-28 - param0) / 43);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "tk.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_H = km.b(-1);
          if (param2 == 60) {
            return false;
          }
          if (62 == param2) {
            return false;
          }
          if (param2 >= 32 &&
            param2 <= 126) {
            if (this.field_G != this.field_C) {
              this.f((byte) 127);
            }
            if (this.field_I == -1 ||
              !(this.field_m.length() >= this.field_I)) {
              if (this.field_G < this.field_m.length()) {
                this.field_m = this.field_m.substring(0, this.field_G) + param2 + this.field_m.substring(this.field_G, this.field_m.length());
                this.field_G = this.field_G + 1;
                this.field_C = this.field_G;
              } else {
                this.field_m = this.field_m + param2;
                dupTemp$0 = this.field_m.length();
                this.field_G = dupTemp$0;
                this.field_C = dupTemp$0;
              }
              this.l(106);
            }
            return true;
          }
          if (param0 != 85) {
            if (param0 == 101) {
              if (this.field_G != this.field_C) {
                this.f((byte) 119);
                return true;
              }
              if (this.field_G < this.field_m.length()) {
                this.field_C = this.field_G + 1;
                this.f((byte) -1);
                return true;
              }
            } else {
              if (param0 == 13) {
                this.i((byte) 88);
                return true;
              }
              if (param0 == 96) {
                if (this.field_G > 0) {
                  stackIn_49_1 = -84;
                  if (!i.field_P[82]) {
                    stackIn_50_2 = this.field_G - 1;
                  } else {
                    stackIn_50_2 = this.g((byte) -127);
                  }
                  this.a((byte) stackIn_49_1, stackIn_50_2);
                  return true;
                }
              } else {
                if (param0 != 97) {
                  if (param0 == 102) {
                    this.a((byte) -62, 0);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a((byte) -78, this.field_m.length());
                    return true;
                  }
                  if (84 == param0) {
                    this.j(123);
                    return true;
                  }
                  if (i.field_P[82] &&
                    param0 == 65) {
                    this.m(-1);
                    return true;
                  }
                  if (i.field_P[82] &&
                    param0 == 66) {
                    this.h((byte) 102);
                    return true;
                  }
                  if (i.field_P[82] &&
                    param0 == 67) {
                    this.k(-121);
                    return true;
                  }
                } else {
                  if (this.field_G < this.field_m.length()) {
                    stackIn_22_1 = -49;
                    if (!i.field_P[82]) {
                      stackIn_23_2 = this.field_G + 1;
                    } else {
                      stackIn_23_2 = this.a((byte) 74);
                    }
                    this.a((byte) stackIn_22_1, stackIn_23_2);
                    return true;
                  }
                }
              }
            }
          } else {
            if (this.field_G != this.field_C) {
              this.f((byte) 125);
              return true;
            }
            if (this.field_G > 0) {
              this.field_C = this.field_G - 1;
              this.f((byte) -106);
              return true;
            }
          }
          var5_int = -27 / ((param3 + 33) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(byte param0) {
        try {
          String var2 = null;
          if (param0 >= 91) {
            var2 = this.n(1);
            if (!(0 >= var2.length())) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.n(1))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        fe var9 = null;
        long var6 = 0L;
        if (param1 >= -7) {
          int[] var8 = (int[]) null;
          tk.a(-25, -56, 58, 91, 83, 87, (int[]) null, 74, (byte) 44);
        }
        if (null != this.field_q &&
          param0 == 0) {
          this.field_q.a(114, param2, param3, this.field_x, (gm) (this));
          if (this.field_q instanceof fe) {
            var9 = (fe) ((Object) this.field_q);
            if (this.field_G != this.field_C) {
              var9.a(param3, this.field_G, this.field_C, -1419356520, param2, (gm) (this));
            }
            var6 = km.b(-1);
            if ((-this.field_H + var6) % 1000L < 500L) {
              var9.a(param3, (gm) (this), this.field_G, false, param2);
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 > -25) {
          return;
        }
        this.field_G = param1;
        if (!i.field_P[81]) {
          this.field_C = this.field_G;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) 70) &&
            this.field_q instanceof fe) {
            var8_int = ((fe) ((Object) this.field_q)).a(k.field_e, -1, (gm) (this), n.field_t, param2, param1);
            stackIn_5_1 = -94;
            if (var8_int != -1) {
              stackIn_6_2 = var8_int;
            } else {
              stackIn_6_2 = 0;
            }
            this.a((byte) stackIn_5_1, stackIn_6_2);
            var8_long = km.b(-1);
            stackIn_9_1 = !(-this.field_E + var8_long >= 250L);
            this.field_F = stackIn_9_1;
            if (this.field_F) {
              this.field_C = this.g((byte) -122);
              this.field_G = this.a((byte) 88);
              if (this.field_G > 0 &&
                this.field_m.charAt(-1 + this.field_G) == 32) {
                this.field_G = this.field_G - 1;
              }
              this.field_D = this.field_G;
            }
            this.field_E = var8_long;
            return true;
          }
          if (param6 >= 5) {
            return false;
          }
          this.field_D = -86;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("tk.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
        }
    }

    final void i(byte param0) {
        if (param0 <= 45) {
          this.field_I = -75;
        }
        this.field_m = "";
        this.field_C = 0;
        this.field_G = 0;
        this.l(-102);
    }

    private final void m(int param0) {
        this.h((byte) 111);
        if (param0 != -1) {
          return;
        }
        this.f((byte) 120);
    }

    void l(int param0) {
        int var2 = -107 % ((param0 + 17) / 63);
        if (this.field_t instanceof wm) {
          ((wm) (this.field_t)).a(88, this);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (-1 != this.field_I) {
            var3_int = this.field_I - this.field_m.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_G == this.field_m.length()) {
            this.field_m = this.field_m + param1;
          } else {
            this.field_m = this.field_m.substring(0, this.field_G) + param1 + this.field_m.substring(this.field_G, this.field_m.length());
          }
          this.field_G = this.field_G + param1.length();
          this.field_C = this.field_G;
          this.l(param0 ^ -97);
          if (param0 != 0) {
            this.field_C = -100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tk.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void k(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            var3 = -109 / ((46 - param0) / 51);
            this.f((byte) -30);
            this.a(0, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int g(byte param0) {
        int var2;
        int var3;
        var3 = Torquing.field_u;
        if (this.field_G == 0) {
          return this.field_G;
        }
        for (var2 = this.field_G - 1; var2 > 0; var2--) {
          if (this.field_m.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 > -121) {
          this.m(52);
        }
        return var2;
    }

    static {
    }
}
