/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends le {
    static long field_G;
    private String field_J;
    private int field_K;
    static String field_I;
    private wa field_L;
    static String field_M;
    private ti field_H;
    static String field_F;

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
            this.field_K = this.field_K + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String f(int param0) {
        if (param0 == 4) {
            return null;
        }
        return (String) null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5;
        rc var6;
        int var7;
        m var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        ti var15;
        ti var16;
        ti var17;
        L0: {
          L1: {
            L2: {
              L3: {
                var14 = Transmogrify.field_A ? 1 : 0;
                var6 = this.field_L.a(27835);
                if (var6 == ek.field_a) {
                  break L3;
                } else {
                  if (fi.field_u != var6) {
                    var5 = this.field_L.c(30523);
                    if (var5 == null) {
                      var5 = this.field_J;
                      break L2;
                    } else {
                      if (!var5.equals(this.field_k)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = bj.field_X;
              break L2;
            }
            if (!var5.equals(this.field_k)) {
              break L1;
            } else {
              break L0;
            }
          }
          this.field_k = var5;
          this.j(-108);
          break L0;
        }
        L4: {
          L5: {
            var7 = 97 % ((77 - param3) / 34);
            super.a(param0, param1, param2, (byte) 111);
            var6 = this.field_L.a(27835);
            var9 = (m) ((Object) this.field_q);
            var10 = param0 + this.field_p;
            var11 = var9.a((qg) (this), 68, param1) - -(var9.a((qg) (this), -2).a(126) >> -678446239);
            if (ek.field_a == var6) {
              break L5;
            } else {
              if (fi.field_u != var6) {
                if (ec.field_d != var6) {
                  if (hi.field_b != var6) {
                    break L4;
                  } else {
                    var17 = ai.field_b[1];
                    var17.c(var10, -(var17.field_m >> 454651233) + var11, 256);
                    break L4;
                  }
                } else {
                  var16 = ai.field_b[2];
                  var16.c(var10, var11 - (var16.field_m >> -1794552927), 256);
                  break L4;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              var15 = ai.field_b[0];
              var12 = var15.field_r << 836923905;
              var13 = var15.field_s << 908056673;
              if (null == this.field_H) {
                break L7;
              } else {
                if (this.field_H.field_n < var12) {
                  break L7;
                } else {
                  if (var13 <= this.field_H.field_m) {
                    oj.a(this.field_H, 256);
                    sb.c();
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            this.field_H = new ti(var12, var13);
            oj.a(this.field_H, 256);
            break L6;
          }
          var15.a(112, 144, var15.field_r << -306217724, var15.field_s << -172847676, -this.field_K << 2001662346, 4096);
          fi.c(true);
          this.field_H.c(var10 - (var15.field_r >> 263659009), var11 + -var15.field_s, 256);
          break L4;
        }
    }

    ob(wa param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, rj.b(true));
        try {
            this.field_J = param1;
            this.field_L = param0;
            this.a(62, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, sj param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ii var11 = null;
        ii var12 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ue.field_c[param1]) {
                break L1;
              } else {
                ue.field_c[param1] = new ii(wl.field_K.field_n, wl.field_K.field_m, 256);
                ue.field_c[param1].field_h = hk.field_a.field_y;
                break L1;
              }
            }
            L2: {
              if (null == tj.field_s) {
                tj.field_s = new ti(wl.field_K.field_n, wl.field_K.field_m);
                break L2;
              } else {
                break L2;
              }
            }
            tj.field_s.e();
            sb.c();
            param2.a(param3, -param2.field_q, 1, -param2.field_j);
            var11 = ue.field_c[param1];
            var12 = var11;
            var11.field_j[0] = 0;
            var5 = param0;
            var6 = 0;
            L3: while (true) {
              if (var6 >= sb.field_h.length) {
                ri.field_k.a(104);
                break L0;
              } else {
                var7 = sb.field_h[var6];
                var8 = -1;
                var9 = 0;
                L4: while (true) {
                  L5: {
                    if (var5 <= var9) {
                      break L5;
                    } else {
                      if ((var12.field_j[var9] ^ -1) == (var7 ^ -1)) {
                        var8 = var9;
                        break L5;
                      } else {
                        var9++;
                        continue L4;
                      }
                    }
                  }
                  L6: {
                    if (var8 == -1) {
                      var8 = var5;
                      incrementValue$0 = var5;
                      var5++;
                      var12.field_j[incrementValue$0] = var7;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var12.field_i[var6] = (byte)var8;
                  var6++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
    }

    final boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -11) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_L = (wa) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ob.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void k(int param0) {
        field_M = null;
        int var1 = -3 % ((-60 - param0) / 57);
        field_F = null;
        field_I = null;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                var5 = -67 / ((50 - param0) / 38);
                stackIn_20_0 = new String(var8);
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if ((var5 ^ -1) > -66) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + (-65 + var5));
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (122 >= var5) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ob.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final static void l(int param0) {
        int var1 = -55 / ((16 - param0) / 35);
        wg.field_f = new qj();
    }

    static {
        field_I = "Passwords must be between 5 and 20 characters long";
        field_M = "Previous";
    }
}
