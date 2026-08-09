/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kb extends kn {
    static ol field_O;
    private boolean field_T;
    private int field_W;
    private boolean field_U;
    private int field_V;
    private int field_N;
    private int field_Q;
    static boolean field_S;
    static String field_P;
    static String field_R;

    final static void f(byte param0) {
        if (param0 != 100) {
          return;
        } else {
          L0: {
            if (!an.field_c) {
              break L0;
            } else {
              wb.g(wb.field_i, wb.field_a, -wb.field_i + wb.field_j, -wb.field_a + wb.field_b);
              rh.field_c.a(false, false);
              break L0;
            }
          }
          return;
        }
    }

    final static boolean j(int param0) {
        if (param0 >= -21) {
            return true;
        }
        return !pi.field_c.b((byte) 98) ? true : false;
    }

    public static void i(int param0) {
        field_P = null;
        if (param0 != -15237) {
            field_O = (ol) null;
            field_R = null;
            field_O = null;
            return;
        }
        field_R = null;
        field_O = null;
    }

    final void h(int param0) {
        super.h(param0 ^ 0);
        if (param0 != -15616) {
          return;
        } else {
          this.field_M.a(0, 34, this.field_C, this.field_y, 0);
          this.field_N = this.field_u;
          this.field_Q = this.field_r;
          return;
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_M instanceof fb)) {
                    break L3;
                  } else {
                    if (!((fb) ((Object) this.field_M)).field_H) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_q ^ -1) == -2) {
                  L4: {
                    var5_int = -this.field_W + (hn.field_k + -param0);
                    var6 = -param3 + (rf.field_b - this.field_V);
                    if (var5_int != this.field_u) {
                      break L4;
                    } else {
                      if (var6 == this.field_r) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_r = var6;
                  this.field_u = var5_int;
                  if (!(this.field_p instanceof gk)) {
                    break L1;
                  } else {
                    ((gk) ((Object) this.field_p)).a(param0, param3, (kb) (this), (byte) 30);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_U) {
                L5: {
                  if (this.field_N != this.field_u) {
                    L6: {
                      var5_int = -this.field_u + this.field_N;
                      stackIn_13_0 = this;

                      stackIn_13_1 = this.field_u;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_14_0 = this;
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = var5_int >> 370916353;
                        break L6;
                      } else {
                        stackIn_12_0 = this;

                        if ((var5_int ^ -1) < -1) {
                          stackIn_14_0 = this;
                          stackIn_14_1 = stackIn_13_1;
                          stackIn_14_2 = 1;
                          break L6;
                        } else {
                          stackIn_14_0 = this;
                          stackIn_14_1 = stackIn_13_1;
                          stackIn_14_2 = -1;
                          break L6;
                        }
                      }
                    }
                    ((kb) (this)).field_u = stackIn_14_1 + stackIn_14_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_Q == this.field_r) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_Q - this.field_r;
                    stackIn_18_0 = this;

                    stackIn_18_1 = this.field_r;

                    if (2 >= Math.abs(var5_int)) {
                      stackIn_20_0 = this;

                      if (-1 <= (var5_int ^ -1)) {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_18_1;
                        stackIn_21_2 = -1;
                        break L7;
                      } else {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_18_1;
                        stackIn_21_2 = 1;
                        break L7;
                      }
                    } else {
                      stackIn_21_0 = this;
                      stackIn_21_1 = stackIn_18_1;
                      stackIn_21_2 = var5_int >> -809682495;
                      break L7;
                    }
                  }
                  ((kb) (this)).field_r = stackIn_21_1 + stackIn_21_2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            super.a(param0, -14, param2, param3);
            if (param1 <= -6) {
              break L0;
            } else {
              var7 = (String) null;
              kb.a((String) null, 11, (String) null, (String) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("kb.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        if (param0 != 0) {
          L0: {
            if (param1 > 23) {
              break L0;
            } else {
              kb.j(15);
              break L0;
            }
          }
          if (param0 > 0) {
            L1: {
              var2 = 1;
              if (-65536 > (param0 ^ -1)) {
                var2 += 16;
                param0 = param0 >> 16;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (255 >= param0) {
                break L2;
              } else {
                param0 = param0 >> 8;
                var2 += 8;
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) >= -16) {
                break L3;
              } else {
                var2 += 4;
                param0 = param0 >> 4;
                break L3;
              }
            }
            L4: {
              if (3 < param0) {
                param0 = param0 >> 2;
                var2 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
                break L5;
              } else {
                break L5;
              }
            }
            return var2;
          } else {
            L6: {
              var2 = 2;
              if ((param0 ^ -1) > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-256 > param0) {
                param0 = param0 >> 8;
                var2 += 8;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0 < -16) {
                var2 += 4;
                param0 = param0 >> 4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-4 > param0) {
                param0 = param0 >> 2;
                var2 += 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0 >= -2) {
                break L10;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L10;
              }
            }
            return var2;
          }
        } else {
          return 0;
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4;
        int var5;
        var5 = Chess.field_G;
        var4 = param0.indexOf(param3);
        L0: while (true) {
          if ((var4 ^ -1) == 0) {
            if (param1 != 0) {
              field_P = (String) null;
              return param0;
            } else {
              return param0;
            }
          } else {
            param0 = param0.substring(0, var4) + param2 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param2.length() + var4);
            continue L0;
          }
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_q = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "kb.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_T) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param2, param5, param6, (byte) -117, param1)) {
              L2: {
                if (1 != param0) {
                  break L2;
                } else {
                  this.field_W = -param6 + (param1 - this.field_u);
                  this.field_V = param2 + (-this.field_r + -param5);
                  vj.field_a = (kb) (this);
                  break L2;
                }
              }
              this.field_q = param0;
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = var8_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("kb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    private kb(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_N = 2147483647;
        this.field_Q = 2147483647;
        try {
            this.field_M = param6;
            this.field_U = param7 ? true : false;
            this.field_T = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = Chess.field_G;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (u.a(true, "getcookies", param1));
                      if (param0 == -2147483648) {
                        break L2;
                      } else {
                        kb.j(11);
                        break L2;
                      }
                    }
                    var4 = gl.a((byte) -118, ';', var3);
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param2)) {
                              stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_14_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("kb.J(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

                if (param2 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L7;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L7;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 1) {
              L1: {
                if (!this.a(param1, param0, param2, -13)) {
                  break L1;
                } else {
                  this.a(param0, param2, param1, false);
                  this.a(param0, (byte) -67, param2, param1);
                  discarded$64 = param2.append(" revert=").append(this.field_U);
                  if (2147483647 == this.field_N) {
                    break L1;
                  } else {
                    if (-2147483648 != (this.field_Q ^ -1)) {
                      discarded$65 = param2.append(" to ").append(this.field_N).append(',').append(this.field_Q);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackIn_9_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("kb.WA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_R = "Waiting for <%0> to start the game...";
        field_S = false;
    }
}
