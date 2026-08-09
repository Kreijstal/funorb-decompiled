/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends gj implements dc, da, pe {
    private bc field_K;
    private bb field_R;
    static mf field_L;
    static dd field_P;
    private bc field_F;
    static String field_O;
    private bb field_I;
    ij field_N;
    static int field_Q;
    private bc field_S;
    static int[] field_G;
    private vk field_T;
    private ja field_J;
    private bc field_H;
    private bc field_U;
    private bc field_M;

    private final int a(int param0, qa param1, String param2, int param3, int param4) {
        ml var6 = null;
        RuntimeException var6_ref = null;
        je var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new ml(20, param4, 120 + param3, 25, param1, false, 120, 3, ug.field_e, 16777215, param2);
            this.a((qa) (var6), (byte) -85);
            var7 = new je(((nh) ((Object) param1)).a((byte) 21));
            this.a((qa) (var7), (byte) -29);
            var7.a(3 + var6.field_u + var6.field_y, 15, var6.field_z + (var6.field_j + param0 >> -399902495), 15, 80);
            stackIn_1_0 = var6.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6_ref);

            stackIn_5_1 = new StringBuilder().append("ca.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(int param0, int param1, String param2, int param3, qa param4) {
        ml var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new ml(20, param3, param1 + 120, 25, param4, false, 120, 3, ug.field_e, 16777215, param2);
              this.a((qa) (var6), (byte) -66);
              if (param0 <= -27) {
                break L1;
              } else {
                this.field_R = (bb) null;
                break L1;
              }
            }
            stackIn_4_0 = var6.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6_ref);

            stackIn_8_1 = new StringBuilder().append("ca.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_O = null;
              if (param0 == 100) {
                break L1;
              } else {
                field_Q = -51;
                break L1;
              }
            }
            field_L = null;
            field_G = null;
            field_P = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ca.NA(" + param0 + ')');
        }
    }

    private final boolean a(nh param0, int param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a((byte) 92);
            if (var3 != null) {
              L1: {
                if (param1 == 22898) {
                  break L1;
                } else {
                  field_G = (int[]) null;
                  break L1;
                }
              }
              var4 = var3.a(false);
              if (ml.field_K == var4) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4 == ea.field_b) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4 != uk.field_b) {
                    stackIn_20_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("ca.QA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    private final int a(String param0, String param1, int param2, int param3, int param4, qa param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == -19983) {
                break L1;
              } else {
                this.a(-55, -75, (qa) null, (byte) -86);
                break L1;
              }
            }
            stackIn_4_0 = this.a(param5, 35, param3, param0, param1, (byte) -86, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("ca.OA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    private final String k(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11579568) {
                break L1;
              } else {
                this.a(75, 25, (qa) null, '￱');
                break L1;
              }
            }
            stackIn_4_0 = "<u=2164A2><col=2164A2>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.AA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (-99 == (param1 ^ -1)) {
                stackIn_7_0 = this.b(param2, -28533);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackIn_12_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ca.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    private final boolean l(int param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (!this.e((byte) 65)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = -1;
              try {
                L1: {
                  var3_int = 78 / ((40 - param0) / 42);
                  var2_int = Integer.parseInt(this.field_S.field_i);
                  break L1;
                }
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
                  break L2;
                }
              }
              stackIn_10_0 = gh.a(this.field_K.field_i, var2_int, this.field_F.field_i, this.field_T.field_G, (ca) (this), -122, this.field_U.field_i);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_10_0;
        }
    }

    private final int a(qa param0, int param1, int param2, String param3, String param4, byte param5, int param6) {
        ml var8 = null;
        RuntimeException var8_ref = null;
        v var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new ml(20, param2, param6 + 120, 25, param0, false, 120, 3, ug.field_e, 16777215, param3);
            this.a((qa) (var8), (byte) -42);
            if (param5 == -86) {
              var9 = new v(((nh) ((Object) param0)).a((byte) -2), param4, 126, var8.field_j + param2, 50 + param6, param1);
              var9.field_s = (kd) (this);
              this.a((qa) (var9), (byte) -77);
              stackIn_4_0 = var8.field_j + var9.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 108;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8_ref);

            stackIn_8_1 = new StringBuilder().append("ca.PA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a((nh) (this.field_K), 22898)) {
                break L1;
              } else {
                if (!this.a((nh) (this.field_U), 22898)) {
                  break L1;
                } else {
                  if (!this.a((nh) (this.field_H), 22898)) {
                    break L1;
                  } else {
                    if (!this.a((nh) (this.field_F), 22898)) {
                      break L1;
                    } else {
                      if (!this.a((nh) (this.field_M), 22898)) {
                        break L1;
                      } else {
                        if (this.a((nh) (this.field_S), 22898)) {
                          if (param0 >= 18) {
                            stackIn_22_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackIn_20_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 != (param0 ^ -1)) {
                  break L2;
                } else {
                  lk.a(-15493, "terms.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 == 1) {
                  break L3;
                } else {
                  if ((param0 ^ -1) != -3) {
                    break L1;
                  } else {
                    lk.a(-15493, "conduct.ws");
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              lk.a(-15493, "privacy.ws");
              break L1;
            }
            var5_int = 8 % ((param3 - -36) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ca.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              param0.removeKeyListener(rh.field_f);
              if (param1 == 83) {
                break L1;
              } else {
                ca.j(-73);
                break L1;
              }
            }
            param0.removeFocusListener(rh.field_f);
            em.field_f = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ca.LA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, si param2, boolean param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = dk.a(3 * (param1 + -param0), (byte) -57);
                        var6 = 3 * param0;
                        if (!param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        sk.b((byte) -80);
                        var7 = -10 + var5_int;
                        if ((param2.field_h ^ -1) >= -1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2.field_J == null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ik.d(109);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        vc.field_d = 0;
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 >= param2.field_j) {
                            statePc = 46;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param2.field_Q[var8];
                        var10 = param2.field_M[var8];
                        var11 = param2.field_N[var8];
                        stackOut_11_0 = param4;
                        stackIn_47_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!stackIn_12_0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = kb.field_o[var9];
                        var13 = il.field_c[var9];
                        var14 = -var12 + kb.field_o[var10];
                        var15 = -var12 + kb.field_o[var11];
                        var16 = il.field_c[var10] + -var13;
                        var17 = -var13 + il.field_c[var11];
                        if ((var14 * var17 - var15 * var16 ^ -1) > -1) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var19 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12 = h.field_c[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = h.field_c[var10];
                        if (var13 == -2147483648) {
                            statePc = 45;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = h.field_c[var11];
                        if (-2147483648 == var14) {
                            statePc = 45;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15 = var14 + var13 + (var12 - var6);
                        if ((var7 ^ -1) > -1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = var15 >> var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = var15 << -var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = -stackIn_26_0 + ed.field_c.length - 1;
                        var17 = ed.field_c[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var17 >> 1478003972 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16--;
                        stackIn_37_0 = var16;
                        stackIn_29_0 = stackIn_37_0;
                        if (var19 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 >= 0) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var17 = ed.field_c[var16];
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var17 + (var16 << 1681965412);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var18 = stackIn_37_0;
                        pk.field_J[var18] = var8;
                        ed.field_c[var16] = 1 + var17;
                        if (param2.field_h <= 0) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null != param2.field_J) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        dupTemp$0 = param2.field_J[var8];
                        ge.field_e[dupTemp$0] = ge.field_e[dupTemp$0] + 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        vc.field_d = vc.field_d + 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 <= (param2.field_h ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (null != param2.field_J) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 >= ge.field_e.length) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10 = ge.field_e[var9];
                        ge.field_e[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_63_0 = (RuntimeException) (var5);
                    stackIn_61_0 = stackIn_63_0;
                    stackIn_63_1 = new StringBuilder().append("ca.GA(").append(param0).append(',').append(param1).append(',');
                    stackIn_61_1 = stackIn_63_1;
                    if (param2 == null) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_64_2 = "{...}";
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_64_2 = "null";
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    throw pf.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ca() {
        super(0, 0, 496, 0, (ch) null);
        int var1_int = 0;
        aa dupTemp$0 = null;
        mh dupTemp$1 = null;
        String var2 = null;
        int var3 = 0;
        ml var4 = null;
        e var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
            this.field_K = new bc("", (kd) null, 12);
            this.field_U = new bc("", (kd) null, 100);
            this.field_H = new bc("", (kd) null, 100);
            this.field_F = new bc("", (kd) null, 20);
            this.field_M = new bc("", (kd) null, 20);
            this.field_S = new bc("", (kd) null, 3);
            var1_int = 1;
            this.field_T = new vk("", (kd) null, var1_int != 0);
            this.field_I = new bb(tk.field_y, (kd) null);
            this.field_R = new bb(qj.field_J, (kd) null);
            this.field_K.field_m = df.field_c;
            this.field_U.field_m = bj.field_i;
            this.field_H.field_m = cg.field_v;
            this.field_F.field_m = nc.field_c;
            this.field_M.field_m = a.field_h;
            this.field_S.field_m = va.field_k;
            this.field_T.field_m = gf.field_f;
            this.field_K.a(true, new vf(this.field_K));
            this.field_U.a(true, new ai(this.field_U));
            this.field_H.a(true, new ck(this.field_H, this.field_U));
            this.field_F.a(true, new gh(this.field_F, this.field_K, this.field_U));
            this.field_M.a(true, new tl(this.field_M, this.field_F));
            this.field_S.a(true, new ga(this.field_S));
            this.field_I.field_D = false;
            this.field_I.field_p = (ch) ((Object) new ri());
            this.field_R.field_p = (ch) ((Object) new me());
            this.field_K.field_p = (ch) ((Object) new aa(10000536));
            dupTemp$0 = new aa(10000536);
            this.field_H.field_p = (ch) ((Object) dupTemp$0);
            this.field_U.field_p = (ch) ((Object) dupTemp$0);
            this.field_S.field_p = (ch) ((Object) new aa(10000536));
            this.field_T.field_p = (ch) ((Object) new jc());
            dupTemp$1 = new mh(10000536);
            this.field_M.field_p = (ch) ((Object) dupTemp$1);
            this.field_F.field_p = (ch) ((Object) dupTemp$1);
            var2 = db.a(ei.field_v, new String[]{this.k(11579568), this.f((byte) 49)}, true);
            var3 = 20;
            var3 = var3 + this.a(-61, 170, ff.field_a, var3, this.field_U);
            var3 = var3 + (this.a(this.field_H, 20, var3, b.field_c, "", (byte) -86, 170) + 5);
            var3 = var3 + this.a(-93, 170, kc.field_g, var3, this.field_F);
            var3 = var3 + (this.a(gd.field_c, hd.field_f, 170, var3, -19983, this.field_M) - -5);
            var3 = var3 + (5 + this.a(me.field_a, bb.field_J, 170, var3, -19983, this.field_K));
            var3 = var3 + this.a(-15, this.field_S, me.field_f, 170, var3);
            var4 = new ml(46, var3, this.field_u - 90, 25, this.field_T, true, -120 + this.field_u, 5, nb.field_c, 11579568, lf.field_a);
            this.a((qa) (var4), (byte) -101);
            var3 = var3 + var4.field_j;
            var5 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ug.field_e.field_H, -1, 2147483647, true);
            this.field_J = new ja(var2, var5);
            this.field_J.field_m = "";
            this.field_J.a(0, pi.field_f, 0);
            this.field_J.a(0, pi.field_f, 1);
            this.field_J.field_s = (kd) (this);
            this.field_J.b(this.field_u + -90, 46, var3, -9);
            var3 = var3 + (15 + this.field_J.field_j);
            this.a((qa) (this.field_J), (byte) -83);
            var6 = 4;
            var7 = 200;
            this.field_I.a(-var7 + 496 >> -267677567, var7, var3, 40, 80);
            this.field_R.a(var6 + 3, 60, var3 - -15, 40, 80);
            this.field_R.field_s = (kd) (this);
            this.field_I.field_s = (kd) (this);
            this.a((qa) (this.field_I), (byte) -51);
            this.a((qa) (this.field_R), (byte) -106);
            this.field_N = new ij((pe) (this));
            this.field_N.a(60 + this.field_K.field_u + this.field_K.field_y, -60 + (-this.field_K.field_y + this.field_u - this.field_K.field_u), 20 + this.field_K.field_z, 150, 80);
            this.a((qa) (this.field_N), (byte) -77);
            this.a(0, 496, 0, var6 + (var3 + 55), 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ca.<init>()");
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -107);
              if (param3 < -85) {
                break L1;
              } else {
                this.field_R = (bb) null;
                break L1;
              }
            }
            this.field_I.field_D = this.e((byte) 84);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ca.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        bc var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_K;
              if (param1 == -96) {
                break L1;
              } else {
                discarded$1 = this.a(4, (qa) null, (String) null, 11, 117);
                break L1;
              }
            }
            var4 = param0;
            ((c) ((Object) var3)).a(false, (byte) -91, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ca.CA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final String f(byte param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 49) {
                break L1;
              } else {
                this.a(46, -16, 42, -88, (bb) null);
                break L1;
              }
            }
            stackIn_4_0 = "</col></u>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ca.BA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_R != param4) {
                  break L2;
                } else {
                  ej.a(param3 + -232);
                  if (!fleas.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param4 == this.field_I) {
                discarded$0 = this.l(127);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param3 == 248) {
                break L3;
              } else {
                ca.a((java.awt.Component) null, (byte) 78);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ca.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    public final void a(int param0) {
        try {
            ((vf) ((Object) this.field_K.a((byte) -109))).d(true);
            if (param0 >= -66) {
                field_L = (mf) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ca.HA(" + param0 + ')');
        }
    }

    static {
        field_Q = 480;
        field_G = new int[5];
        field_O = "<%0>Bomb:<%1> Explodes when a flea touches it, removing all adjacent tiles. Does <u>not</u> harm fleas.";
    }
}
