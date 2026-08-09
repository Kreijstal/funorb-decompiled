/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends mh {
    mh field_Rb;
    static String field_Tb;
    static jp field_Sb;
    private mh field_Pb;
    static int field_Qb;

    private final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var4 = -param2;
          var5 = -param2;
          if (this.field_Pb == null) {
            break L0;
          } else {
            var4 = this.field_Pb.g(71);
            break L0;
          }
        }
        L1: {
          if (null == this.field_Rb) {
            break L1;
          } else {
            var5 = this.field_Rb.a(-param1 + (-param1 + this.field_Ib) - (var4 + param2), 0);
            break L1;
          }
        }
        L2: {
          var7 = 40 / ((-47 - param0) / 42);
          var6 = param2 + var4 + param1 + (var5 - -param1);
          if (this.field_Ib >= var6) {
            break L2;
          } else {
            var5 = var5 + (this.field_Ib + -var6);
            var6 = this.field_Ib;
            break L2;
          }
        }
        L3: {
          if (-2 != (this.field_S ^ -1)) {
            break L3;
          } else {
            param1 = param1 + (this.field_Ib + -var6) / 2;
            break L3;
          }
        }
        L4: {
          if (2 == this.field_S) {
            param1 = param1 + (-var6 + this.field_Ib);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (null != this.field_Pb) {
            this.field_Pb.a(this.field_cb, 0, param1, var4, (byte) 64);
            this.field_Pb.field_Q = this.field_Q;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (null == this.field_Rb) {
            break L6;
          } else {
            this.field_Rb.a(this.field_cb, 0, param2 + (param1 + var4), var5, (byte) 64);
            this.field_Rb.field_Q = this.field_Q;
            if (null != this.field_Pb) {
              this.field_Rb.field_S = 0;
              break L6;
            } else {
              this.field_Rb.field_S = this.field_S;
              break L6;
            }
          }
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_13_0 = 0;
        if (param0 < -58) {
          L0: {
            L1: {
              L2: {
                if (param1 < 48) {
                  break L2;
                } else {
                  if (param1 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 65) {
                  break L3;
                } else {
                  if (param1 <= 90) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 < 97) {
                  break L4;
                } else {
                  if (122 < param1) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_13_0 = 0;
              break L0;
            }
            stackIn_13_0 = 1;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_Tb = null;
        field_Sb = null;
        if (param0 != 21) {
            rk.d((byte) -26);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            tg stackIn_16_0;
            int stackIn_16_1;
            java.net.URL stackIn_16_2;
            java.net.URL stackIn_16_3;
            java.net.URL stackIn_16_4;
            StringBuilder stackIn_16_5;
            tg stackIn_17_0;
            int stackIn_17_1;
            java.net.URL stackIn_17_2;
            java.net.URL stackIn_17_3;
            java.net.URL stackIn_17_4;
            StringBuilder stackIn_17_5;
            String stackIn_17_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            ql var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param2 > 27) {
                    break L1;
                  } else {
                    rk.a((byte) -93, 'K');
                    break L1;
                  }
                }
                L2: {
                  var3 = "";
                  if (param1 == null) {
                    break L2;
                  } else {
                    var3 = pp.a(22570, param1);
                    break L2;
                  }
                }
                L3: {
                  if (param0 != null) {
                    L4: {
                      if (param1 != null) {
                        var3 = var3 + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3 = var3 + param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                me.a(var3, -107);
                var7 = oh.a((byte) 13, "%3a", var3, ":");
                var8 = oh.a((byte) 13, "%40", var7, "@");
                var9 = oh.a((byte) 13, "%26", var8, "&");
                var10 = oh.a((byte) 13, "%23", var9, "#");
                if (null == mk.field_i) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackIn_16_0 = mq.field_e;

                    stackIn_16_1 = -49;

                    stackIn_16_2 = null;

                    stackIn_16_3 = null;

                    stackIn_16_4 = mk.field_i.getCodeBase();

                    stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(oj.field_m).append("&u=");

                    if (ua.field_a == null) {
                      stackIn_17_0 = (tg) ((Object) stackIn_16_0);
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = null;
                      stackIn_17_3 = null;
                      stackIn_17_4 = (java.net.URL) ((Object) stackIn_16_4);
                      stackIn_17_5 = (StringBuilder) ((Object) stackIn_16_5);
                      stackIn_17_6 = "" + sb.field_e;
                      break L5;
                    } else {
                      stackIn_17_0 = (tg) ((Object) stackIn_16_0);
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = null;
                      stackIn_17_3 = null;
                      stackIn_17_4 = (java.net.URL) ((Object) stackIn_16_4);
                      stackIn_17_5 = (StringBuilder) ((Object) stackIn_16_5);
                      stackIn_17_6 = ua.field_a;
                      break L5;
                    }
                  }
                  var4 = ((tg) (Object) stackIn_17_0).a((byte) stackIn_17_1, new java.net.URL(stackIn_17_4, stackIn_17_6 + "&v1=" + tg.field_g + "&v2=" + tg.field_o + "&e=" + var10));
                  L6: while (true) {
                    if (var4.field_f != 0) {
                      L7: {
                        if (-2 == (var4.field_f ^ -1)) {
                          var5 = (DataInputStream) (var4.field_e);
                          var5.read();
                          var5.close();
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      wj.a(-125, 1L);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param1 != 24) {
            rk.a((byte) 108, '￱');
        }
        int var4 = -param0;
        if (!(this.field_Pb == null)) {
            var4 = this.field_Pb.g(107);
        }
        int var5 = -param0;
        if (null != this.field_Rb) {
            var5 = this.field_Rb.g(64);
        }
        return param2 + var4 + (param0 + var5) + param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -10411) {
            Throwable var9 = (Throwable) null;
            rk.a((String) null, (Throwable) null, 64);
        }
        this.a(param5, param1, param4, param6, (byte) 64);
        this.b(param0 ^ 10436, param2, param3);
    }

    rk(long param0, mh param1, mh param2, mh param3, jp param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Pb = new mh(0L, param2);
                this.field_Pb.field_wb = param4;
                this.a(this.field_Pb, 0);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Rb = new mh(0L, param3, param5);
                this.a(this.field_Rb, 0);
                this.c(true);
                break L2;
              } else {
                this.c(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("rk.<init>(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    final static dc[] a(pi param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dc[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dc var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dc[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c(8, (byte) -85);
            if ((var2_int ^ -1) >= -1) {
              L1: {
                if (param1 == 24) {
                  break L1;
                } else {
                  field_Tb = (String) null;
                  break L1;
                }
              }
              var3 = param0.c(12, (byte) 85);
              var4 = new dc[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackIn_13_0 = (dc[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (eo.a(false, param0)) {
                      var6 = new dc();
                      param0.c(24, (byte) -115);
                      param0.c(24, (byte) 107);
                      var6.field_a = param0.c(24, (byte) -86);
                      param0.c(9, (byte) 110);
                      param0.c(12, (byte) -113);
                      param0.c(12, (byte) -91);
                      param0.c(12, (byte) -112);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.c(dj.a(-1 + var5, 15), (byte) 98);
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("rk.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dc[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_13_0;
        }
    }

    static {
    }
}
