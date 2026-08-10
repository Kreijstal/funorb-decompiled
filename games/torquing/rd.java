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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("rd.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    final static void b(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1 = 0;
            java.lang.reflect.Method var2 = null;
            Exception var2_ref = null;
            Runtime var3 = null;
            Throwable var3_ref = null;
            Long var4 = null;
            Object[] var5 = null;
            var1 = 81 % ((param0 - -46) / 61);
            try {
              L0: {
                L1: {
                  L2: {
                    var2 = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var2 == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          var3 = Runtime.getRuntime();
                          var5 = (Object[]) null;
                          var4 = (Long) (var2.invoke((Object) (var3), (Object[]) null));
                          df.field_u = 1 + (int)(var4.longValue() / 1048576L);
                          decompiledRegionSelector0 = 0;
                          break L3;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var3_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
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
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("rd.H(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int[] var3;
        int var4;
        Random var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int[][] var31;
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
                    stackIn_8_0 = this.field_y;
                    break L2;
                  } else {
                    stackIn_8_0 = this.field_y - (-va.a(this.field_B, (byte) 121, var6) + var4);
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_8_0;
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
                    stackIn_20_0 = 0;
                    break L6;
                  } else {
                    stackIn_20_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_20_0;
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
                    stackIn_30_0 = -1;
                    break L10;
                  } else {
                    stackIn_30_0 = 1;
                    break L10;
                  }
                }
                var22 = stackIn_30_0;
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
