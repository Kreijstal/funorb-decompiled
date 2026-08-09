/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private ec field_n;
    private em field_m;
    static int[] field_d;
    private java.math.BigInteger field_j;
    private cc field_g;
    static String[] field_f;
    private ti[] field_k;
    private bb field_h;
    static String field_l;
    static int field_i;
    private java.math.BigInteger field_e;
    static int field_b;
    static mb field_c;
    static String field_a;

    final static o a(int param0, cf[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = oi.b(param0, param1.length);
            stackIn_1_0 = gd.a(64, param1[var2_int]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("je.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        var3 = DungeonAssault.field_K;
        if (this.field_k == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_k.length) {
              if (param0 > 46) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (this.field_k.length <= var4) {
                    return;
                  } else {
                    if (this.field_k[var4] != null) {
                      this.field_k[var4].c(-10790);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (null != this.field_k[var2]) {
                this.field_k[var2].b(false);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_l = null;
        if (!param0) {
            field_c = (mb) null;
        }
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final boolean b(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ec var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = DungeonAssault.field_K;
        if (null == this.field_n) {
          L0: {
            if (null == this.field_m) {
              if (!this.field_h.b(-21431)) {
                this.field_m = this.field_h.a(true, 255, (byte) 0, 255, (byte) 69);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (param0 == 113) {
            if (!this.field_m.field_v) {
              L1: {
                L2: {
                  var10 = new ec(this.field_m.b(true));
                  var10.field_o = 5;
                  var3 = var10.c(true);
                  var10.field_o = var10.field_o + 72 * var3;
                  var13 = new byte[-var10.field_o + var10.field_m.length];
                  var11 = var13;
                  var4 = var11;
                  var10.a((byte) -105, 0, var13.length, var13);
                  if (null == this.field_j) {
                    break L2;
                  } else {
                    if (this.field_e != null) {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_e);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if (65 == var5.length) {
                var15 = rn.a(-5 + (var10.field_o + -var13.length), 5, 8, var10.field_m);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    this.field_k = new ti[var3];
                    this.field_n = var10;
                    return true;
                  } else {
                    if (var5[var7 + 1] == var15[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final ti a(boolean param0, int param1, int param2, ln param3, ln param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var9 = null;
        byte[] var13 = null;
        ti stackIn_9_0 = null;
        ti stackIn_12_0 = null;
        ti stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != this.field_n) {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (param2 < this.field_k.length) {
                    if (null != this.field_k[param2]) {
                      stackIn_9_0 = this.field_k[param2];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_n.field_o = 6 + 72 * param2;
                      var6_int = this.field_n.h(-31);
                      var7 = this.field_n.h(-54);
                      var13 = new byte[64];
                      this.field_n.a((byte) -117, 0, 64, var13);
                      var9 = new ti(param2, param4, param3, this.field_h, this.field_g, var6_int, var13, var7, param0);
                      this.field_k[param2] = var9;
                      if (param1 == 4210752) {
                        stackIn_14_0 = (ti) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_12_0 = (ti) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("je.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    je(bb param0, cc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, int param2, cn param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        jh.c();
        gf.e(param4, param2, param4 + param5, param1 + param2);
        for (var6_int = param2; var6_int < param1 + param2; var6_int = var6_int + param3.field_v) {
            for (var7 = param4; var7 < param5 + param4; var7 = var7 + param3.field_y) {
                param3.h(var7, var6_int);
            }
        }
        if (param0 >= -83) {
            return;
        }
        try {
            jh.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "je.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private je(bb param0, cc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.field_g = param1;
              this.field_j = param2;
              this.field_e = param3;
              if (this.field_h.b(-21431)) {
                break L1;
              } else {
                this.field_m = this.field_h.a(true, 255, (byte) 0, 255, (byte) 91);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("je.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_d = new int[]{4210752, 16711680, 16711680, 255, 65280};
        field_l = "EXCLUSIVE";
        field_f = new String[]{null, "Different raiders are better suited for different types of obstacles within the dungeon. Some are good at disarming <%traps>, others at fighting <%monsters>."};
        field_a = "(Including <%0>)";
        field_i = 0;
    }
}
