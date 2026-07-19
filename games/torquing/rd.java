/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rd extends am {
    private int field_y;
    private int field_u;
    private int field_B;
    static rc field_x;
    static String field_t;
    private int field_w;
    private int field_s;
    static la field_z;
    static java.awt.Color field_A;
    static String field_v;

    public rd() {
        super(0, true);
        this.field_u = 16;
        this.field_y = 0;
        this.field_s = 0;
        this.field_B = 4096;
        this.field_w = 2000;
    }

    final static void a(uc param0, int param1, int param2, String param3, kp param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param1 == 10580) {
                break L1;
              } else {
                field_z = (la) null;
                break L1;
              }
            }
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (var7 >= param3.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param3.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = (var5_int >> 79497000) + param4.field_b[0] - -param0.a(param3.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var6) {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param4.field_b[var7] = param4.field_b[0] + (var5_int >> -2122845112) - -param0.a(param3.substring(0, 1 + var7)) - param0.a((char) var8);
                    break L4;
                  } else {
                    param4.field_b[var7] = var6;
                    break L4;
                  }
                }
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("rd.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final static void b(int param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            java.lang.reflect.Method var2_ref = null;
            Throwable var3 = null;
            Runtime var3_ref = null;
            Long var4 = null;
            Object[] var5 = null;
            Throwable decompiledCaughtException = null;
            var1 = 81 % ((param0 - -46) / 61);
            try {
              L0: {
                L1: {
                  var2_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var2_ref == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var3_ref = Runtime.getRuntime();
                        var5 = (Object[]) null;
                        var4 = (Long) (var2_ref.invoke((Object) (var3_ref), (Object[]) null));
                        df.field_u = 1 + (int)(var4.longValue() / 1048576L);
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var3 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if ((var4_int ^ -1) != -2) {
                  if (2 == var4_int) {
                    this.field_u = param0.i((byte) -101);
                    break L1;
                  } else {
                    if (-4 != (var4_int ^ -1)) {
                      if (var4_int == 4) {
                        this.field_B = param0.i(param1 + 7053);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      this.field_y = param0.i(7088);
                      break L1;
                    }
                  }
                } else {
                  this.field_w = param0.i(7088);
                  break L1;
                }
              } else {
                this.field_s = param0.i((byte) -101);
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                this.field_u = 81;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("rd.H(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        Random var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[][] var31 = null;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var27 = Torquing.field_u;
          var3 = this.field_l.a(param1, 25657);
          if (!this.field_l.field_b) {
            break L0;
          } else {
            var4 = this.field_B >> -1616475775;
            var31 = this.field_l.a(0);
            var6 = new Random((long)this.field_s);
            var7 = 0;
            L1: while (true) {
              if (this.field_w <= var7) {
                break L0;
              } else {
                L2: {
                  if ((this.field_B ^ -1) >= -1) {
                    stackOut_5_0 = this.field_y;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = this.field_y - (-va.a(this.field_B, (byte) 121, var6) + var4);
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var8 = (4087 & var8) >> -596194588;
                  var9 = va.a(ci.field_c, (byte) 123, var6);
                  var10 = va.a(um.field_o, (byte) 127, var6);
                  var11 = (this.field_u * de.field_d[var8] >> -2010635956) + var9;
                  var12 = var10 + (this.field_u * jh.field_x[var8] >> -1650227156);
                  var13 = var12 - var10;
                  var14 = var11 + -var9;
                  if (0 != var14) {
                    break L3;
                  } else {
                    if (var13 != 0) {
                      break L3;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                L4: {
                  if (var13 < 0) {
                    var13 = -var13;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var13 <= var14) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_18_0;
                  if (var15 != 0) {
                    var16 = var9;
                    var17 = var11;
                    var9 = var10;
                    var10 = var16;
                    var11 = var12;
                    var12 = var17;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var11 >= var9) {
                    break L8;
                  } else {
                    var16 = var9;
                    var17 = var10;
                    var9 = var11;
                    var11 = var16;
                    var10 = var12;
                    var12 = var17;
                    break L8;
                  }
                }
                L9: {
                  var16 = var10;
                  var17 = var11 - var9;
                  var18 = -var10 + var12;
                  var19 = -var17 / 2;
                  var20 = 2048 / var17;
                  var21 = 1024 + -(va.a(4096, (byte) 124, var6) >> 466902114);
                  if (-1 >= (var18 ^ -1)) {
                    break L9;
                  } else {
                    var18 = -var18;
                    break L9;
                  }
                }
                L10: {
                  if (var10 >= var12) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L10;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L10;
                  }
                }
                var22 = stackIn_28_0;
                var23 = var9;
                L11: while (true) {
                  if (var11 > var23) {
                    L12: {
                      var24 = var20 * (-var9 + var23) + (1024 + var21);
                      var25 = jh.field_A & var23;
                      var26 = var16 & vp.field_I;
                      if (var15 == 0) {
                        var31[var25][var26] = var24;
                        break L12;
                      } else {
                        var31[var26][var25] = var24;
                        break L12;
                      }
                    }
                    var19 = var19 + var18;
                    if (-1 > (var19 ^ -1)) {
                      var19 = var19 + -var17;
                      var16 = var16 + var22;
                      var23++;
                      continue L11;
                    } else {
                      var23++;
                      continue L11;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param0 > 86) {
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final void a(byte param0) {
        if (param0 < 123) {
            kp var3 = (kp) null;
            rd.a((uc) null, -27, 36, (String) null, (kp) null);
        }
        ie.a(14837);
    }

    public static void c(int param0) {
        field_t = null;
        field_z = null;
        field_x = null;
        field_v = null;
        field_A = null;
        int var1 = -92 / ((param0 - 58) / 43);
    }

    static {
        field_A = new java.awt.Color(10040319);
        field_v = "No highscores";
    }
}
