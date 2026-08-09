/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vg extends pp {
    private int field_i;
    private boolean field_m;
    private int field_k;
    private int field_g;
    static ei field_h;
    private String field_l;
    private int field_d;
    private int field_c;
    private hc field_f;
    static Hashtable field_j;
    static int[] field_e;

    final void a(int param0, hc param1, int param2, String param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        co var9 = null;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (this.field_f != param1) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if ((this.field_d ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (!this.field_l.equals(param3)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_d = 1;
                if (param0 >= 1) {
                  break L2;
                } else {
                  var8 = (String) null;
                  this.a(-95, (hc) null, -118, (String) null, -117);
                  break L2;
                }
              }
              this.field_f = param1;
              this.field_m = true;
              var9 = this.a(param4, 77, param1, param3);
              var7 = param1.a(param3);
              var9.field_h[0] = param2 - (var7 >> 423150369);
              var9.field_h[param3.length()] = (var7 >> 291627521) + param2;
              ng.a(param1, param3, var9, 0, (byte) 30);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("vg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, String param1, int param2, int param3, hc param4) {
        co var8 = null;
        co var9 = null;
        if (param1 == null) {
            this.field_b = null;
            return;
        }
        if (this.field_f == param4 && this.field_m && (this.field_d ^ -1) == -3 && null != this.field_l && this.field_l.equals(param1)) {
            return;
        }
        try {
            this.field_d = 2;
            this.field_m = true;
            this.field_l = param1;
            if (param0 != 2137) {
                field_j = (Hashtable) null;
            }
            this.field_f = param4;
            var8 = this.a(param3, 43, param4, param1);
            var9 = var8;
            var9.field_h[0] = -param4.a(param1) + param2;
            var9.field_h[param1.length()] = param2;
            ng.a(param4, param1, var9, 0, (byte) 30);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2, hc param3, byte param4) {
        co var8 = null;
        co var9 = null;
        if (!(param0 != null)) {
            this.field_b = null;
            return;
        }
        if (param3 == this.field_f && this.field_m && this.field_d == 0 && null != this.field_l && this.field_l.equals(param0)) {
            return;
        }
        try {
            this.field_d = 0;
            this.field_f = param3;
            this.field_m = true;
            this.field_l = param0;
            var8 = this.a(param2, -128, param3, param0);
            var9 = var8;
            var8.field_h[0] = param1;
            var9.field_h[param0.length()] = param3.a(param0) + param1;
            if (param4 >= -45) {
                hc var7 = (hc) null;
                this.a(-111, (String) null, -109, -118, (hc) null);
            }
            ng.a(param3, param0, var9, 0, (byte) 30);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final co a(int param0, int param1, hc param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        co var6 = null;
        co stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -90 / ((-38 - param1) / 52);
            var6 = new co(param0 - param2.field_I, param2.field_D + param0, param3.length());
            this.field_b = new co[]{var6};
            stackIn_1_0 = (co) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("vg.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(String param0, hc param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        co stackIn_38_0;
        co stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        co stackIn_39_0 = null;
        co stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        hc stackIn_43_0 = null;
        String stackIn_43_1 = null;
        co stackIn_43_2 = null;
        hc stackIn_44_0;
        String stackIn_44_1;
        co stackIn_44_2;
        int stackIn_44_3;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        co var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 != 0) {
                break L1;
              } else {
                param7 = param1.field_w;
                break L1;
              }
            }
            if (param0 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 != this.field_f) {
                  break L2;
                } else {
                  if (this.field_m) {
                    break L2;
                  } else {
                    if (this.field_d != param6) {
                      break L2;
                    } else {
                      if (param2 != this.field_g) {
                        break L2;
                      } else {
                        if (this.field_c != param7) {
                          break L2;
                        } else {
                          if (param5 != this.field_k) {
                            break L2;
                          } else {
                            if (param4 != this.field_i) {
                              break L2;
                            } else {
                              if (this.field_l == null) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param0)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_g = param2;
                this.field_d = param6;
                this.field_k = param5;
                this.field_f = param1;
                this.field_c = param7;
                if (param3 == 127395681) {
                  break L3;
                } else {
                  field_h = (ei) null;
                  break L3;
                }
              }
              L4: {
                this.field_m = false;
                this.field_l = param0;
                this.field_i = param4;
                var16 = new String[1 + param1.a(param0, param4)];
                var17 = var16;
                var10 = Math.max(1, param1.a(param0, new int[]{param4}, var17));
                if ((this.field_g ^ -1) != -4) {
                  break L4;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_g = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                this.field_b = new co[var10];
                if (0 != this.field_g) {
                  if (-2 == (this.field_g ^ -1)) {
                    var11 = param1.field_I + (this.field_k + -(this.field_c * var10) >> -1124339199);
                    break L5;
                  } else {
                    if (-3 == (this.field_g ^ -1)) {
                      var11 = -(this.field_c * var10) + (-param1.field_D + this.field_k);
                      break L5;
                    } else {
                      L6: {
                        var12 = (this.field_k - this.field_c * var10) / (var10 + 1);
                        if (var12 < 0) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_c = this.field_c + var12;
                      var11 = param1.field_I + var12;
                      break L5;
                    }
                  }
                } else {
                  var11 = param1.field_I;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackIn_38_0 = null;

                    stackIn_38_1 = null;

                    stackIn_38_2 = -param1.field_I + var11;

                    stackIn_38_3 = param1.field_D + var11;

                    if (var13 == null) {
                      stackIn_39_0 = null;
                      stackIn_39_1 = null;
                      stackIn_39_2 = stackIn_38_2;
                      stackIn_39_3 = stackIn_38_3;
                      stackIn_39_4 = 0;
                      break L8;
                    } else {
                      stackIn_39_0 = null;
                      stackIn_39_1 = null;
                      stackIn_39_2 = stackIn_38_2;
                      stackIn_39_3 = stackIn_38_3;
                      stackIn_39_4 = var13.length();
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new co(stackIn_39_2, stackIn_39_3, stackIn_39_4);
                    var14.field_h[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_h[var13.length()] = param1.a(var13);
                        stackIn_43_0 = (hc) (param1);

                        stackIn_43_1 = (String) (var13);

                        stackIn_43_2 = (co) (var14);

                        if (-4 != (param6 ^ -1)) {
                          stackIn_44_0 = (hc) ((Object) stackIn_43_0);
                          stackIn_44_1 = (String) ((Object) stackIn_43_1);
                          stackIn_44_2 = (co) ((Object) stackIn_43_2);
                          stackIn_44_3 = 0;
                          break L10;
                        } else {
                          stackIn_44_0 = (hc) ((Object) stackIn_43_0);
                          stackIn_44_1 = (String) ((Object) stackIn_43_1);
                          stackIn_44_2 = (co) ((Object) stackIn_43_2);
                          stackIn_44_3 = this.a(param4, -1, var13, param1.a(var13));
                          break L10;
                        }
                      }
                      ng.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, (byte) 30);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var11 = var11 + param7;
                  this.field_b[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var9);

            stackIn_49_1 = new StringBuilder().append("vg.F(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

            if (param1 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L12;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L12;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 0) {
            vg.b(-51);
        }
        field_h = null;
        field_e = null;
    }

    public vg() {
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_h = new ei();
            field_j = new Hashtable();
            field_e = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_e[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (var0 & 1 ^ -1)) {
                      var0 = -306674912 ^ var0 >>> 127395681;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
