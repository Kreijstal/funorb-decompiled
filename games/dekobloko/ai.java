/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends ek {
    int field_O;
    static byte[] field_N;
    static String field_T;
    int field_R;
    static int field_P;
    int field_K;
    static String field_L;
    static String field_M;
    int field_S;
    int field_V;
    static String field_U;
    int field_Q;

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -this.field_O - (param5 - -this.field_u) + param1;
              var9 = param0 - this.field_V - (param4 - -this.field_D);
              if (var8_int * var8_int + var9 * var9 < this.field_K * this.field_K) {
                L1: {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - hc.field_b;
                    if (0.0 <= var10) {
                      break L2;
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)this.field_Q;
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0.0 >= var10) {
                    break L1;
                  } else {
                    var10 = var10 + 3.141592653589793 / (double)this.field_Q;
                    break L1;
                  }
                }
                this.field_R = (int)((double)this.field_Q * var10 / 6.283185307179586);
                L3: while (true) {
                  L4: {
                    L5: {
                      if (this.field_Q > this.field_R) {
                        break L5;
                      } else {
                        this.field_R = this.field_R - this.field_Q;
                        if (var12 != 0) {
                          break L4;
                        } else {
                          if (var12 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (this.field_R >= 0) {
                        break L4;
                      } else {
                        this.field_R = this.field_R + this.field_Q;
                        if (var12 == 0) {
                          continue L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var8);
            stackOut_18_1 = new StringBuilder().append("ai.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    public static void a(int param0) {
        if (param0 > -7) {
          ai.e((byte) -48);
          field_M = null;
          field_N = null;
          field_L = null;
          field_T = null;
          field_U = null;
          return;
        } else {
          field_M = null;
          field_N = null;
          field_L = null;
          field_T = null;
          field_U = null;
          return;
        }
    }

    final static void a(int param0, int param1, ud param2, int param3, int param4) {
        int var5_int = 0;
        try {
            if (param0 <= 56) {
                field_P = -82;
            }
            var5_int = (int)(0.5 + (double)(param2.field_p * 256) * Math.pow(2.0, (double)param1 * 0.08333333333333333) / (double)en.field_o);
            dg.field_c.a(param2, var5_int, param4 * pb.field_d, param3 << 911025766);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ai.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void e(byte param0) {
        ck var1 = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          L1: {
            if (!db.field_d) {
              break L1;
            } else {
              L2: {
                var1 = hh.field_a;
                if (!wg.field_f) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_4_0;
                var2 = ue.field_b;
                if (!qd.field_Nb) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              var3 = stackIn_7_0;
              var5 = 320 + -(vf.field_b * vf.field_b * 320 / 900);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            var1 = ue.field_b;
            var5 = 320 * (vf.field_b * vf.field_b) / 900;
            if (!qd.field_Nb) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          L5: {
            var4 = stackIn_11_0;
            if (!wg.field_f) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L5;
            } else {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L5;
            }
          }
          var3 = stackIn_14_0;
          var2 = hh.field_a;
          break L0;
        }
        L6: {
          if (var3 == 0) {
            break L6;
          } else {
            if (var4 == 0) {
              break L6;
            } else {
              var4 = 0;
              var3 = 0;
              break L6;
            }
          }
        }
        hk.b(0, 0, 640, 160 + -var5);
        var6 = 128 * var5 / 320 + 128;
        dl.a((byte) 93, var4 != 0, var2, -var5, 256);
        hk.b(0, 160 - var5, 213, 320 - var5);
        dl.a((byte) 123, var4 != 0, var2, -var5, 256);
        hk.b(427, 160 - var5, 640, 320 + -var5);
        dl.a((byte) 121, var4 != 0, var2, -var5, 256);
        hk.b(0, -var5 + 320, 213, 320 + var5);
        dl.a((byte) 92, var3 != 0, var1, 0, var6);
        hk.b(213, 160 - var5, 427, var5 + 160);
        dl.a((byte) 91, var3 != 0, var1, 0, var6);
        hk.b(427, 320 - var5, 640, 320 + var5);
        dl.a((byte) 91, var3 != 0, var1, 0, var6);
        if (param0 == 84) {
          hk.b(213, 160 + var5, 427, 320 - -var5);
          dl.a((byte) 43, var4 != 0, var2, var5, 256);
          hk.b(0, var5 + 320, 640, 480);
          dl.a((byte) 121, var4 != 0, var2, var5, 256);
          hk.d();
          if (qd.field_Nb) {
            if (wg.field_f) {
              if (gi.field_b) {
                return;
              } else {
                fj.a(0, 256, -71, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_U = (String) null;
          hk.b(213, 160 + var5, 427, 320 - -var5);
          dl.a((byte) 43, var4 != 0, var2, var5, 256);
          hk.b(0, var5 + 320, 640, 480);
          dl.a((byte) 121, var4 != 0, var2, var5, 256);
          hk.d();
          if (qd.field_Nb) {
            if (!wg.field_f) {
              return;
            } else {
              L7: {
                if (!gi.field_b) {
                  fj.a(0, 256, -71, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean f(byte param0) {
        int var1 = -28 % ((param0 - -57) / 39);
        return fj.field_e;
    }

    final static void h(int param0) {
        ud var2 = null;
        String var3 = null;
        var3 = (String) null;
        qf.a(te.field_q, -128, (String) null);
        if (param0 < -6) {
          return;
        } else {
          var2 = (ud) null;
          ai.a(-10, 44, (ud) null, 29, -93);
          return;
        }
    }

    private ai() throws Throwable {
        throw new Error();
    }

    final static cl a(int param0, int param1, byte param2, int param3) {
        cl var4 = null;
        int var5 = 0;
        cl var6 = null;
        cl var7 = null;
        cl var8 = null;
        cl var9 = null;
        int var10 = 0;
        int var11 = 0;
        var5 = client.field_A ? 1 : 0;
        var4 = (cl) ((Object) oe.field_I.c((byte) 19));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              var11 = var4.field_q;
              var10 = param3;
              if (var5 != 0) {
                if (var10 != var11) {
                  field_M = (String) null;
                  var6 = new cl();
                  var6.field_z = param1;
                  var6.field_q = param3;
                  oe.field_I.a(var6, param2 + 2888);
                  fh.a((byte) 8, var6, param0);
                  return var6;
                } else {
                  var7 = new cl();
                  var4 = var7;
                  var7.field_z = param1;
                  var7.field_q = param3;
                  oe.field_I.a(var7, param2 + 2888);
                  fh.a((byte) 8, var7, param0);
                  return var7;
                }
              } else {
                if (var10 != var11) {
                  var4 = (cl) ((Object) oe.field_I.d(true));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var4;
                }
              }
            }
          }
          if (param2 != -111) {
            field_M = (String) null;
            var8 = new cl();
            var8.field_z = param1;
            var8.field_q = param3;
            oe.field_I.a(var8, param2 + 2888);
            fh.a((byte) 8, var8, param0);
            return var8;
          } else {
            var9 = new cl();
            var9.field_z = param1;
            var9.field_q = param3;
            oe.field_I.a(var9, param2 + 2888);
            fh.a((byte) 8, var9, param0);
            return var9;
          }
        }
    }

    static {
        field_T = "This option cannot be combined with the current '<%0>' setting.";
        field_P = -1;
        field_M = "Send private message to <%0>";
        field_L = "Only show game chat from my friends";
        field_U = "Play free version";
    }
}
