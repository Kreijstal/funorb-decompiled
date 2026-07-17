/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hm extends an {
    private vo field_I;
    static vn field_E;
    private String[] field_K;
    private eg field_G;
    static long field_N;
    static sd field_H;
    static int field_L;
    static String field_M;
    static int[][] field_F;
    static int field_J;

    boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 67) {
                break L1;
              } else {
                var4 = null;
                ((hm) this).a((ga) null, (byte) 86, -110, -12);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hm.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0) {
        le var1 = null;
        int var2 = ZombieDawn.field_J;
        try {
            var1 = kn.field_L.b((byte) 26);
            while (var1 instanceof tm) {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
            }
            var1 = se.field_m.b((byte) 26);
            while (var1 instanceof tm) {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
            }
            if (param0 != 9) {
                hm.a(-124);
            }
            var1 = rm.field_e.b((byte) 26);
            while (var1 instanceof tm) {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
            }
            kn.field_L.b(param0 ^ 67);
            se.field_m.b(-61);
            rm.field_e.b(68);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "hm.G(" + param0 + 41);
        }
    }

    private final eg b(int param0, int param1, int param2) {
        eg var4 = null;
        eg var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param0 == 31677) {
          var4 = (eg) (Object) ((hm) this).field_I.b((byte) 26);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (eg) (Object) ((hm) this).field_I.a(false);
                  continue L0;
                } else {
                  L2: {
                    if (param1 < var5.field_i) {
                      break L2;
                    } else {
                      if (param2 < var5.field_k) {
                        break L2;
                      } else {
                        if (var5.field_i - -var5.field_j <= param1) {
                          break L2;
                        } else {
                          if (var5.field_m + var5.field_k < param2) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_h;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          ((hm) this).field_I = null;
          var4 = (eg) (Object) ((hm) this).field_I.b((byte) 26);
          L3: while (true) {
            if (var4 != null) {
              var5 = var4;
              L4: while (true) {
                if (var5 == null) {
                  var4 = (eg) (Object) ((hm) this).field_I.a(false);
                  continue L3;
                } else {
                  L5: {
                    if (param1 < var5.field_i) {
                      break L5;
                    } else {
                      if (param2 < var5.field_k) {
                        break L5;
                      } else {
                        if (var5.field_i - -var5.field_j <= param1) {
                          break L5;
                        } else {
                          if (var5.field_m + var5.field_k < param2) {
                            break L5;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_h;
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(28, param1, param2, param3, param4);
        ((hm) this).d((byte) -36);
        int var6 = 80 % ((param0 - -23) / 48);
    }

    final void d(byte param0) {
        int var2 = 0;
        ak var3 = null;
        vg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        oe var12 = null;
        int var13 = 0;
        int var14 = 0;
        eg var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = ZombieDawn.field_J;
        ((hm) this).field_I = new vo();
        if (param0 != -36) {
          return;
        } else {
          var2 = 0;
          var3 = (ak) (Object) ((hm) this).field_h;
          var4 = var3.a(-113, (ga) this);
          L0: while (true) {
            var5 = ((hm) this).field_o.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = ((hm) this).field_o.indexOf(">", var5);
              var6 = ((hm) this).field_o.substring(9 + var5, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((hm) this).field_o.indexOf("</hotspot>", var5);
              var8 = var4.a(93, var5);
              var9 = var4.a(96, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var4.a((byte) -72, var5);
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var12.field_e[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var12.field_e[-1 + var12.field_e.length];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.a((byte) -72, var2);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new eg(var7, var13, var12.field_b, -var13 + var14, Math.max(var3.a(param0 ^ -39), var12.field_g - var12.field_b));
                    if (var10 != null) {
                      ((eg) var10).field_h = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var10 = (Object) (Object) var15;
                  ((hm) this).field_I.a(0, (le) (Object) var15);
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    String d(int param0) {
        int var2 = 0;
        var2 = -127 / ((param0 - 10) / 58);
        if (null != ((hm) this).field_G) {
          if (((hm) this).field_K != null) {
            if (((hm) this).field_K.length <= ((hm) this).field_G.field_l) {
              return null;
            } else {
              return ((hm) this).field_K[((hm) this).field_G.field_l];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((hm) this).field_K) {
                  break L2;
                } else {
                  if (param0 >= ((hm) this).field_K.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = new String[param0 - -1];
                var9 = var8;
                var4 = var9;
                if (((hm) this).field_K == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (((hm) this).field_K.length <= var5) {
                      break L3;
                    } else {
                      var8[var5] = ((hm) this).field_K[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((hm) this).field_K = var9;
              break L1;
            }
            L5: {
              if (param1 == -21423) {
                break L5;
              } else {
                var7 = null;
                ((hm) this).a((ga) null, (byte) 100, -58, -75);
                break L5;
              }
            }
            ((hm) this).field_K[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("hm.L(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          hm.g(-53);
          ((hm) this).a(-121, param1, param0, param3, ((ak) (Object) ((hm) this).field_h).a(false, (ga) this));
          return;
        } else {
          ((hm) this).a(-121, param1, param0, param3, ((ak) (Object) ((hm) this).field_h).a(false, (ga) this));
          return;
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) 106, param2, param3);
              ((hm) this).field_G = null;
              var5_int = -66 / ((46 - param1) / 42);
              if (!((hm) this).field_l) {
                break L1;
              } else {
                var6 = -param3 + ha.field_b + -((hm) this).field_k;
                var7 = -((hm) this).field_j + ei.field_K - param2;
                ((hm) this).field_G = this.b(31677, var6, var7);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hm.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        ak var5 = null;
        eg var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            var5 = (ak) (Object) ((hm) this).field_h;
            var6 = ((hm) this).field_G;
            if (var6 != null) {
              var7 = var5.b((ga) this, 128, param2);
              var8 = var5.a((ga) this, 1, param0);
              L1: while (true) {
                on.b(var6.field_j + 2, var6.field_m - -2, var6.field_i + var7 + -2, param3 + 117, var6.field_k + var8 - 2);
                var6 = var6.field_h;
                if (var6 != null) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1, int[][] param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (param1 >= 0) {
                  if (param1 < param2.length) {
                    if (param0 >= param2[0].length) {
                      stackOut_10_0 = -1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    } else {
                      stackOut_12_0 = param2[param1][param0];
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    }
                  } else {
                    stackOut_6_0 = -1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = -1;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("hm.E(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 2 + 41);
        }
        return stackIn_13_0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        eg var7 = null;
        int var8 = 0;
        super.b(param0, 71, param2, param3);
        var5 = -((hm) this).field_k + param0;
        var6 = -((hm) this).field_j + param2;
        var8 = 63 / ((-12 - param1) / 56);
        var7 = this.b(31677, var5, var6);
        if (var7 != null) {
          if (null != ((hm) this).field_v) {
            ((oa) (Object) ((hm) this).field_v).a((hm) this, 120, var7.field_l, param3);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    hm(String param0, io param1) {
        super(param0, (sk) null);
        ((hm) this).field_G = null;
        try {
            ((hm) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "hm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_H = null;
        field_M = null;
        if (param0 != -27476) {
          field_E = null;
          field_F = null;
          return;
        } else {
          field_F = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new sd();
        field_M = "THE END";
        field_J = -1;
    }
}
