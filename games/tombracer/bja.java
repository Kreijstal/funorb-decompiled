/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class bja {
    static String field_d;
    static cn field_a;
    kha[] field_c;
    static float field_b;

    final static void a(int param0, byte param1, int param2) {
        qv.field_o = null;
        String var3 = fna.field_k;
        if (!(var3 != null)) {
            var3 = kma.field_c[0];
        }
        String[] var4 = new String[1];
        var4[0] = var3;
        int var5 = jqa.a(2147483647, new Random(), -76);
        wka.field_d = false;
        id var6 = new id(param0, var5);
        rba.field_a = new qh(false, var5, var4, 0, false, rga.b(26499, param0), 0, 1, param2, param0, (BitSet[]) null, new boolean[]{-1 > (wla.field_ub ^ -1) ? true : false}, var6);
        rba.field_a.j((byte) -64);
        rba.field_a.h((byte) -52);
        int var7 = -125 / ((param1 - 57) / 38);
        iqa.field_c.g(0);
        ira.a(false, -1, (byte) 92);
    }

    public static void c(int param0) {
        if (param0 < 126) {
            field_d = (String) null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        kha var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = param1;
        L0: while (true) {
          if (this.field_c.length > var3) {
            var4 = this.field_c[var3];
            stackOut_3_0 = var4.field_c.length ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_5_0 < (param0 ^ -1)) {
                return var3;
              } else {
                param0 = param0 - (var4.field_c.length + -1);
                var3++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return this.field_c.length;
          }
        }
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 <= var8) {
                    break L3;
                  } else {
                    var9 = param1.charAt(var8);
                    var12 = -61;
                    var11 = var9 ^ -1;
                    if (var10 != 0) {
                      if (var11 < var12) {
                        break L2;
                      } else {
                        return 0;
                      }
                    } else {
                      L4: {
                        L5: {
                          if (var11 == var12) {
                            break L5;
                          } else {
                            L6: {
                              if (var9 == 62) {
                                break L6;
                              } else {
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  if (var9 == 32) {
                                    var5_int++;
                                    if (var10 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            var6 = 0;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6 = 1;
                        break L4;
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if ((var5_int ^ -1) < -1) {
                  break L2;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackOut_18_0 = (param2 - param3 << -576281880) / var5_int;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("bja.J(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final int a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var2 = 0;
        kha[] var3 = null;
        int var4 = 0;
        kha var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              if (var7 == 0) {
                if (var5 != null) {
                  L1: {
                    var6 = var5.a(true);
                    if (var6 <= var2) {
                      break L1;
                    } else {
                      var2 = var6;
                      break L1;
                    }
                  }
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return var2;
              }
            } else {
              if (param0 != 0) {
                discarded$4 = this.a(62, 38, 65);
                return var2;
              } else {
                return var2;
              }
            }
          }
        } else {
          if (param0 != 0) {
            discarded$5 = this.a(62, 38, 65);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static void a(byte param0, cn param1, int param2, String param3) {
        sra var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4 = (sra) ((Object) dma.field_l);
            var4.a(param2, (byte) 47, param3);
            haa.field_A = new jpa();
            haa.field_A.field_f = param1.a("", (byte) 127, "map.png");
            var4.a(param2 - -5, (byte) 47, param3);
            du.field_c = new jpa();
            du.field_c.field_f = param1.a("", (byte) 117, "wall_bg.jpg");
            if (param0 <= -100) {
              break L0;
            } else {
              var5 = (String) null;
              bja.a((byte) -1, (cn) null, 32, (String) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4_ref);
            stackOut_3_1 = new StringBuilder().append("bja.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        kha var12 = null;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_c != null) {
          if (this.field_c.length != 0) {
            if (this.field_c[0].field_d <= param2) {
              if (param2 > this.field_c[this.field_c.length + param0].field_b) {
                return -1;
              } else {
                if (-2 == (this.field_c.length ^ -1)) {
                  return this.field_c[0].a(param1, -1);
                } else {
                  var4 = 0;
                  var5 = 0;
                  L0: while (true) {
                    if (var5 < this.field_c.length) {
                      var12 = this.field_c[var5];
                      stackOut_18_0 = param2 ^ -1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var8 == 0) {
                        L1: {
                          if (stackIn_20_0 > (var12.field_d ^ -1)) {
                            break L1;
                          } else {
                            if (var12.field_b < param2) {
                              break L1;
                            } else {
                              var7 = var12.a(param1, -1);
                              if (0 != (var7 ^ -1)) {
                                return var4 - -var7;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (var12.field_c.length - 1);
                        var5++;
                        continue L0;
                      } else {
                        return stackIn_19_0;
                      }
                    } else {
                      return -1;
                    }
                  }
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int b(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -43 / ((79 - param0) / 44);
        if (null != this.field_c) {
          if (-1 <= (this.field_c.length ^ -1)) {
            return 0;
          } else {
            return this.field_c[this.field_c.length - 1].field_b + -this.field_c[0].field_d;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0;
        }
    }

    final int a(byte param0, int param1) {
        kha[] var3 = null;
        int var4 = 0;
        kha var5 = null;
        int var6 = 0;
        kha[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == -59) {
          var7 = this.field_c;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length > var4) {
              var5 = var7[var4];
              stackOut_5_0 = param1 ^ -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if (stackIn_7_0 <= (var5.field_c.length ^ -1)) {
                  param1 = param1 - (-1 + var5.field_c.length);
                  var4++;
                  continue L0;
                } else {
                  return var5.field_c[param1];
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return 0;
            }
          }
        } else {
          return 84;
        }
    }

    static {
        field_d = "Waiting for <%0> to start the game...";
    }
}
