/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    private qp[] field_c;
    static ho[] field_e;
    private int field_b;
    static il field_g;
    private int field_i;
    static lg[] field_a;
    float field_j;
    String field_h;
    static String field_k;
    static er[] field_f;
    private int field_d;

    final static cr a(boolean param0) {
        if (!param0) {
            th.a((byte) -18);
        }
        return pp.a((byte) 116);
    }

    private final void a(qp param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(1 + this.field_d) + (float)param2 / 100.0f;
            if (param2 == 0) {
                this.field_h = param0.field_f;
            } else {
                this.field_h = param0.field_a + " - " + param2 + "%";
            }
            this.field_j = (float)this.field_i * var4_float / (float)(param1 + this.field_b);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "th.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -62 / ((-76 - param0) / 32);
        field_f = null;
        field_e = null;
        field_k = null;
        field_a = null;
    }

    final static bn a(boolean param0, int[] param1, int param2) {
        cr discarded$3 = null;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        int var20 = 0;
        int var21 = 0;
        lg var22 = null;
        bn stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        bn stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -27911) {
                break L1;
              } else {
                discarded$3 = th.a(false);
                break L1;
              }
            }
            var22 = new lg(672, 192, 96);
            var4 = 0;
            L2: while (true) {
              if (6 <= var4) {
                stackOut_32_0 = var22.a(126, 43690, 1, 0, 0);
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                var5 = 0;
                L3: while (true) {
                  if (-5 >= (var5 ^ -1)) {
                    var4++;
                    continue L2;
                  } else {
                    var6 = 0;
                    L4: while (true) {
                      if ((var6 ^ -1) <= -5) {
                        var5++;
                        continue L3;
                      } else {
                        L5: {
                          var7 = var5 + 1;
                          var8 = var6 + 1;
                          if (!param0) {
                            var9 = var6 * 192 + -384;
                            var11 = var5 * 192 + -384;
                            var10 = -384 + var8 * 192;
                            var12 = var7 * 192 - 384;
                            break L5;
                          } else {
                            var9 = (int)Math.round(384.0 * Math.tan(-0.7853981633974483 + (double)var6 * 3.141592653589793 / 2.0 / 4.0));
                            var10 = (int)Math.round(Math.tan(-0.7853981633974483 + (double)var8 * 3.141592653589793 / 2.0 / 4.0) * 384.0);
                            var11 = (int)Math.round(384.0 * Math.tan(3.141592653589793 * (double)var5 / 2.0 / 4.0 - 0.7853981633974483));
                            var12 = (int)Math.round(Math.tan(3.141592653589793 * (double)var7 / 2.0 / 4.0 - 0.7853981633974483) * 384.0);
                            break L5;
                          }
                        }
                        L6: {
                          var13 = -384;
                          var14 = 384;
                          var15 = -1;
                          var16 = -1;
                          var17 = -1;
                          var18 = -1;
                          var19 = -1;
                          var20 = var4;
                          if (-1 != (var20 ^ -1)) {
                            if (var20 != 1) {
                              if (var20 == 2) {
                                var15 = var22.a(var9, var14, var12);
                                var16 = var22.a(var10, var14, var12);
                                var17 = var22.a(var9, var14, var11);
                                var18 = var22.a(var10, var14, var11);
                                var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                                break L6;
                              } else {
                                if (-4 != (var20 ^ -1)) {
                                  if (4 != var20) {
                                    if (var20 == 5) {
                                      var15 = var22.a(var14, var10, var12);
                                      var16 = var22.a(var14, var9, var12);
                                      var17 = var22.a(var14, var10, var11);
                                      var18 = var22.a(var14, var9, var11);
                                      var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    var15 = var22.a(var13, var9, var12);
                                    var16 = var22.a(var13, var10, var12);
                                    var17 = var22.a(var13, var9, var11);
                                    var18 = var22.a(var13, var10, var11);
                                    var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                                    break L6;
                                  }
                                } else {
                                  var15 = var22.a(var10, var13, var12);
                                  var16 = var22.a(var9, var13, var12);
                                  var17 = var22.a(var10, var13, var11);
                                  var18 = var22.a(var9, var13, var11);
                                  var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                                  break L6;
                                }
                              }
                            } else {
                              var15 = var22.a(var10, var12, var14);
                              var16 = var22.a(var9, var12, var14);
                              var17 = var22.a(var10, var11, var14);
                              var18 = var22.a(var9, var11, var14);
                              var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                              break L6;
                            }
                          } else {
                            var15 = var22.a(var9, var12, var13);
                            var16 = var22.a(var10, var12, var13);
                            var17 = var22.a(var9, var11, var13);
                            var18 = var22.a(var10, var11, var13);
                            var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                            break L6;
                          }
                        }
                        discarded$4 = var22.a(var15, var17, var16, (byte) 1, (byte)var19, (short) 128, (short)(4 * (var4 * 4 + var5) - -var6));
                        discarded$5 = var22.a(var18, var16, var17, (byte) 1, (byte)var19, (short) 128, (short)((var5 + var4 * 4) * 4 + var6));
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("th.E(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
        }
        return stackIn_33_0;
    }

    final boolean a(int param0) {
        qp var2 = null;
        int var3 = 0;
        qp var4 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        L0: while (true) {
          if (this.field_d >= this.field_b) {
            if (param0 == -21493) {
              return true;
            } else {
              return false;
            }
          } else {
            var4 = this.field_c[this.field_d];
            var2 = var4;
            if (var4.field_i.b(0)) {
              L1: {
                if ((var4.field_b ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_i.c(11321, var4.field_b)) {
                    this.a(var2, 1, var4.field_i.b(var4.field_b, 100));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_e) {
                  break L2;
                } else {
                  if (var4.field_i.c(var4.field_e, param0 ^ -21493)) {
                    break L2;
                  } else {
                    this.a(var2, 1, var4.field_i.a(var4.field_e, param0 + 21493));
                    return false;
                  }
                }
              }
              L3: {
                if ((var4.field_b ^ -1) <= -1) {
                  break L3;
                } else {
                  if (null != var4.field_e) {
                    break L3;
                  } else {
                    if (var4.field_a == null) {
                      break L3;
                    } else {
                      if (!var4.field_i.a((byte) -112)) {
                        this.a(var2, 1, var4.field_i.d(-1));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.field_d = this.field_d + 1;
              continue L0;
            } else {
              this.a(var4, 1, 0);
              return false;
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "2 players can work together to paint all the blocks on the map purple. If either player is killed, both players have to start again. This mode is only available in unrated games.";
        field_f = new er[23];
        field_a = new lg[2];
    }
}
