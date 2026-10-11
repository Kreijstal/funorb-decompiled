/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ka {
    private double field_R;
    static String field_H;
    private double field_Q;

    final static boolean a(boolean param0, byte param1) {
        try {
          hb var4 = null;
          hb var5 = null;
          if (param1 != 17) {
            return false;
          }
          if (null == mg.field_a) {
            mg.field_a = ld.field_k.a(nd.field_s, -90, af.field_ab);
          }
          if (mg.field_a.field_g == 0) {
            return false;
          }
          long dupTemp$0 = ri.a(param1 - 20);
          pc.field_a = dupTemp$0;
          m.field_b = dupTemp$0;
          if (mg.field_a.field_g != 1) {
            lk.field_d = i.field_q;
          } else {
            try {
              kl.field_G = new vd((java.net.Socket) (mg.field_a.field_f), ld.field_k);
              var4 = e.field_c;
              var5 = var4;
              vh.field_a.field_n = 0;
              kk.field_c = !param0 ? -1 : -2;
              pk.field_c = !param0 ? -1 : -2;
              qm.field_y = !param0 ? -1 : -2;
              lk.field_d = si.field_g;
              var5.field_n = 0;
              ql.a(kk.field_b, vh.field_a, rg.field_M, (byte) 40, qa.field_c);
              tb.a(-1, 116);
            } catch (IOException iOException) {
              lk.field_d = i.field_q;
            }
          }
          mg.field_a = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, Throwable param2) {
        try {
          df stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          bc var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          df var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var11 = null;
          var6 = Confined.field_J ? 1 : 0;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = ag.a(-19080, param2);
            }
            if (param0 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            ej.a(0, var3);
            var8 = pi.a(":", "%3a", 22232, var3);
            var9 = pi.a("@", "%40", 22232, var8);
            var10 = pi.a("&", "%26", 22232, var9);
            var11 = pi.a("#", "%23", 22232, var10);
            if (!param1) {
              var7 = (df) null;
              mb.a((Object) null, 13, (df) null);
            }
            if (kc.field_k == null) {
              return;
            }
            stackIn_14_0 = hh.field_c;
            stackIn_14_1 = 0;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = kc.field_k.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(uh.field_f).append("&u=");
            if (kc.field_f == null) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + i.field_p;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = kc.field_f;
            }
            var4 = ((df) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(df.field_b).append("&v2=").append(df.field_s).append("&e=").append(var11).toString()));
            while (var4.field_g == 0) {
              jd.a(1, 1L);
            }
            if (var4.field_g == 1) {
              var5 = (DataInputStream) (var4.field_f);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ah param1) {
        try {
          this.a(true, (ee) (param1));
          int var3_int = -24 / ((14 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mb(pm param0, double param1, double param2, double param3, bi param4) {
        super(param0, param1, param4);
        try {
          this.field_Q = param2 * this.field_C;
          this.field_R = this.field_C * param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pm param0, int param1) {
        try {
          param0.a(-23154, this);
          if (param1 >= -81) {
            field_H = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(Object param0, int param1, df param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (null == param2.field_k) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param2.field_k.peekEvent()) {
              jd.a(1, 1L);
              continue;
            }
            break;
          }
          try {
            if (param1 != 1001) {
              field_H = (String) null;
            }
            if (param0 != null) {
              param2.field_k.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mb.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, hf param1) {
        try {
          this.a(true, (ee) (param1));
          if (param0 > -29) {
            il var4 = (il) null;
            this.a(true, (il) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, mb param1) {
        try {
          if (param0 != -23154) {
            il var4 = (il) null;
            this.a(false, (il) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        try {
          var3_double = -this.field_E + param1.field_E;
          var5 = -this.field_t + param1.field_t;
          var7 = -this.field_D + param1.field_D;
          if (!param0) {
            il var17 = (il) null;
            this.a(true, (il) null);
          }
          var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3_double * var3_double));
          var11 = -var9 + (this.field_C + param1.field_C);
          var13 = (1.0 - this.field_K / (double)uc.field_db.length) * this.field_Q;
          if (param1.field_C > var11) {
            var13 = var13 * (var11 / param1.field_C);
          }
          param1.a(14170, false, var13);
          var15 = var9 >= 0.001 ? 1.0 / var9 : 1000.0;
          var3_double = var3_double * var15;
          var7 = var7 * var15;
          var11 = var11 * (this.field_R / param1.field_M);
          var5 = var5 * var15;
          param1.field_L = param1.field_L + var7 * var11;
          param1.field_K = param1.field_K + var3_double * var11;
          param1.field_G = param1.field_G + var5 * var11;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
          return;
        }
        try {
          this.a(true, (ee) (param1));
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_H = null;
        if (param0 != 1072) {
          Throwable var2 = (Throwable) null;
          mb.a((String) null, true, (Throwable) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, byte param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        var19 = Confined.field_J ? 1 : 0;
        try {
          if (param8 != 112) {
            field_H = (String) null;
          }
          if (0 <= param0 &&
            ti.field_g > param3) {
            if (param4 < 0 &&
              0 > param7 &&
              param6 < 0) {
              return;
            }
            if (param4 >= ti.field_e &&
              ti.field_e <= param7 &&
              param6 >= ti.field_e) {
              return;
            }
            var14 = -param3 + param0;
            if (param3 == param2) {
              if (param3 == param0) {
                var12 = 0;
                var9_int = param4 << 16;
                var11 = 0;
                var10 = param7 << 16;
              } else {
                var15 = -param2 + param0;
                if (param7 > param4) {
                  var12 = (param6 - param7 << 16) / var15;
                  var10 = param7 << 16;
                  var9_int = param4 << 16;
                  var11 = (-param4 + param6 << 16) / var14;
                } else {
                  var10 = param4 << 16;
                  var12 = (param6 - param4 << 16) / var14;
                  var11 = (param6 - param7 << 16) / var15;
                  var9_int = param7 << 16;
                }
              }
              var13 = 0;
              if (param3 < 0) {
                param3 = Math.min(-param3, param2 - param3);
                var9_int = var9_int + param3 * var11;
                var10 = var10 + var12 * param3;
                param3 = 0;
              }
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var15 = param2 - param3;
              var12 = (param6 - param4 << 16) / var14;
              var11 = (-param4 + param7 << 16) / var15;
              if (var12 <= var11) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param2 < 0) {
                  param3 = param2 - param3;
                  var9_int = var9_int + param3 * var11;
                  var10 = var10 + param3 * var12;
                  param3 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + param3 * var12;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ti.field_l[param3];
                while (param3 < param2) {
                  var17 = var9_int >> 16;
                  if (var17 < ti.field_e) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < ti.field_e) {
                        sm.a(param5, param1, var16Lifetime2 + var17, var18, 87);
                      }
                    } else {
                      if (var17 + var18 >= ti.field_e) {
                        var18 = ti.field_e - (var17 + 1);
                      }
                      if (0 > var17) {
                        sm.a(param5, param1, var16Lifetime2, var18 + var17, 87);
                      } else {
                        sm.a(param5, param1, var17 + var16Lifetime2, var18, 87);
                      }
                    }
                  }
                  param3++;
                  if (ti.field_g <= param3) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + fn.field_g;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = -param2 + param0;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param6 << 16;
                if (var13 != 0) {
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (0 > param3) {
              param3 = -param3;
              var10 = var10 + param3 * var12;
              var9_int = var9_int + var11 * param3;
              param3 = 0;
            }
            var15Lifetime1 = ti.field_l[param3];
            while (param0 > param3) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < ti.field_e) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (0 == var17Lifetime1) {
                  if (0 <= var16Lifetime1 &&
                    ti.field_e > var16Lifetime1) {
                    sm.a(param5, param1, var15Lifetime1 + var16Lifetime1, var17Lifetime1, 87);
                  }
                } else {
                  if (ti.field_e <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = ti.field_e - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 < 0) {
                    sm.a(param5, param1, var15Lifetime1, var17Lifetime1 + var16Lifetime1, 87);
                  } else {
                    sm.a(param5, param1, var16Lifetime1 + var15Lifetime1, var17Lifetime1, param8 - 25);
                  }
                }
              }
              param3++;
              if (param3 >= ti.field_g) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + fn.field_g;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("mb.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(cl param0, byte param1) {
        try {
          this.a(true, (ee) (param0));
          int var3_int = 66 % ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        if (param0 <= 64) {
          return true;
        }
        return true;
    }

    final void a(boolean param0, il param1) {
        try {
          if (param0) {
            this.field_R = 0.5049676490090665;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mb.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "<col=FFFFFF>Shield:</col> this indispensable item creates a powerful defensive force field around your ship. Look out for these when your shield is low or lost. Without your shield, it only takes one hit to kill you!";
    }
}
