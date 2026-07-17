/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ab extends dk {
    static rk field_H;
    private String[] field_D;
    static ge field_F;
    private rk field_C;
    static String field_B;
    static int[] field_G;
    static int[] field_A;
    private oi field_E;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 118, param3, param4);
        if (param2 < 115) {
            return;
        }
        ((ab) this).f((byte) 75);
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        lg var5 = (lg) (Object) ((ab) this).field_o;
        oi var6 = ((ab) this).field_E;
        if (var6 != null) {
            var7 = var5.a((uj) this, (byte) 12, param1);
            var8 = var5.a((byte) -69, (uj) this, param3);
            do {
                ji.a(2 + var6.field_k, 2 + var6.field_l, -140110815, -2 + (var8 - -var6.field_h), -2 + var6.field_g + var7);
                var6 = var6.field_o;
            } while (var6 != null);
        }
    }

    final static hl[] b() {
        int discarded$0 = 0;
        int discarded$1 = 1;
        int discarded$2 = 3;
        int discarded$3 = 0;
        int discarded$4 = 3;
        int discarded$5 = 0;
        int discarded$6 = 1;
        int discarded$7 = 65793;
        int discarded$8 = 1;
        return cc.a();
    }

    final static void g(byte param0) {
        if (param0 != -114) {
            field_A = null;
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        hl var9 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            ki.e(243, 197, 369, 143, 16777215);
            ki.d(244, 198, 367, 141, 0);
            var1_int = 1;
            if (og.field_d != null) {
              L1: {
                var7 = og.field_d[ag.field_o];
                if (var7 == null) {
                  if (ah.field_d != null) {
                    int discarded$5 = ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var7.e(245, 199);
                  break L1;
                }
              }
              L2: {
                if (rk.field_a < kk.field_a) {
                  var8 = og.field_d[od.field_i];
                  if (var8 == null) {
                    break L2;
                  } else {
                    var3_int = (var8.field_x + 60) * rk.field_a / kk.field_a;
                    var4 = var3_int + -30;
                    if (cc.field_j) {
                      int discarded$6 = -2;
                      n.a(var4 * -256 / 30, 199, 245, 256 * (var8.field_x - var4) / 30, var8);
                      break L2;
                    } else {
                      int discarded$7 = -2;
                      n.a(256 * (var8.field_x + -var4) / 30, 199, 245, -256 * var4 / 30, var8);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (ah.field_d == null) {
                  break L3;
                } else {
                  var3 = null;
                  var6 = 0;
                  var4 = var6;
                  L4: while (true) {
                    if (og.field_d.length <= var6) {
                      if (var3 != null) {
                        int discarded$8 = ah.field_d.a("Screenshot(s) " + var3 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      L5: {
                        var9 = og.field_d[var6];
                        if (var9 != null) {
                          L6: {
                            if (var9.field_x != 365) {
                              break L6;
                            } else {
                              if (var9.field_q != 139) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var3 != null) {
                            var3 = (Object) (Object) (var3 + ", " + var6);
                            break L5;
                          } else {
                            var3 = (Object) (Object) Integer.toString(var6);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L7: {
                if (ah.field_d != null) {
                  int discarded$9 = ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ab.H(" + -67 + 41);
        }
    }

    String d(int param0) {
        if (((ab) this).field_E == null) {
            return null;
        }
        if (((ab) this).field_D == null) {
            return null;
        }
        if (param0 != 12606) {
            String discarded$0 = ((ab) this).d(-34);
        }
        if (((ab) this).field_D.length <= ((ab) this).field_E.field_m) {
            return null;
        }
        return ((ab) this).field_D[((ab) this).field_E.field_m];
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, 94, param2, param3);
        int var5 = param2 + -((ab) this).field_s;
        if (param1 <= 59) {
            field_A = null;
        }
        int var6 = param0 + -((ab) this).field_j;
        oi var7 = this.a(var6, -256, var5);
        if (var7 != null) {
            if (((ab) this).field_g != null) {
                ((dc) (Object) ((ab) this).field_g).a(var7.field_m, (byte) -123, param3, (ab) this);
            }
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              super.a(110, param1, param2, param3);
              ((ab) this).field_E = null;
              if (!((ab) this).field_h) {
                break L1;
              } else {
                var5_int = -((ab) this).field_s + -param1 + pe.field_d;
                var6 = -param3 + la.field_c + -((ab) this).field_j;
                ((ab) this).field_E = this.a(var6, -256, var5_int);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ab.U(").append(84).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
    }

    boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                ab.g((byte) 85);
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
            stackOut_4_1 = new StringBuilder().append("ab.PA(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    private final oi a(int param0, int param1, int param2) {
        oi var4 = null;
        oi var5 = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var4 = (oi) (Object) ((ab) this).field_C.c(-3905);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (oi) (Object) ((ab) this).field_C.a(-16913);
                continue L0;
              } else {
                L2: {
                  if (param2 < var5.field_g) {
                    break L2;
                  } else {
                    if (var5.field_h > param0) {
                      break L2;
                    } else {
                      if (var5.field_g + var5.field_k <= param2) {
                        break L2;
                      } else {
                        if (var5.field_l + var5.field_h >= param0) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_o;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ab) this).a(param0, param3, (byte) 116, ((lg) (Object) ((ab) this).field_o).a(16293784, (uj) this), param2);
        if (param1 <= 64) {
            ((ab) this).field_D = null;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        lg var3 = null;
        bd var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        nh var12 = null;
        int var13 = 0;
        int var14 = 0;
        oi var15 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          ((ab) this).field_C = new rk();
          if (param0 >= 66) {
            break L0;
          } else {
            ((ab) this).field_D = null;
            break L0;
          }
        }
        var2 = 0;
        var3 = (lg) (Object) ((ab) this).field_o;
        var4 = var3.a((uj) this, (byte) -93);
        L1: while (true) {
          var5 = ((ab) this).field_k.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((ab) this).field_k.indexOf(">", var5);
            var6 = ((ab) this).field_k.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ab) this).field_k.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, 0);
            var9 = var4.a(var2, 0);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_d[var11];
                  if (var11 != var8) {
                    stackOut_9_0 = var12.field_d[0];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var4.a((byte) -30, var5);
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = var12.field_d[-1 + var12.field_d.length];
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = var4.a((byte) -30, var2);
                    stackIn_15_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new oi(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a(0), var12.field_c + -var12.field_g));
                  if (var10 != null) {
                    ((oi) var10).field_o = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((ab) this).field_C.b(110, (rf) (Object) var15);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    ab(String param0, de param1) {
        super(param0, (qg) null);
        ((ab) this).field_E = null;
        try {
            ((ab) this).field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ab.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        String[] var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((ab) this).field_D == null) {
                  break L2;
                } else {
                  if (((ab) this).field_D.length > param2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = new String[1 + param2];
                var4 = var6;
                if (null != ((ab) this).field_D) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((ab) this).field_D.length) {
                      break L3;
                    } else {
                      var6[var5] = ((ab) this).field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((ab) this).field_D = var4;
              break L1;
            }
            var4_int = 120 / ((param1 - -49) / 36);
            ((ab) this).field_D[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("ab.O(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void e() {
        field_G = null;
        field_F = null;
        field_A = null;
        int var1 = 60;
        field_B = null;
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new rk();
        field_B = "Once these are at maximum power new powerups will only upgrade your lasers.";
        field_A = new int[128];
        field_F = new ge();
    }
}
