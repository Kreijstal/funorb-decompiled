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
        this.f((byte) 75);
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        lg var5 = (lg) ((Object) this.field_o);
        oi var6 = this.field_E;
        if (var6 != null) {
            var7 = var5.a((uj) (this), (byte) 12, param1);
            var8 = var5.a((byte) -69, (uj) (this), param3);
            do {
                ji.a(2 + var6.field_k, 2 + var6.field_l, -140110815, -2 + (var8 - -var6.field_h), -2 + var6.field_g + var7);
                var6 = var6.field_o;
            } while (var6 != null);
        }
    }

    final static hl[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -25343) {
            return (hl[]) null;
        }
        return cc.a(1, param4, 1, param3, 3, param0, 3, 1, param2);
    }

    final static void g(byte param0) {
        if (param0 != -114) {
            field_A = (int[]) null;
        }
    }

    final static void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        hl var9 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            ki.e(243, 197, 369, 143, 16777215);
            ki.d(244, 198, 367, 141, 0);
            var1_int = 34 % ((38 - param0) / 32);
            if (og.field_d != null) {
              L1: {
                var7 = og.field_d[ag.field_o];
                var8 = var7;
                var8 = var7;
                if (var7 == null) {
                  if (ah.field_d != null) {
                    ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
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
                      n.a(var4 * -256 / 30, 199, 245, 256 * (var8.field_x - var4) / 30, var8, (byte) -2);
                      break L2;
                    } else {
                      n.a(256 * (var8.field_x + -var4) / 30, 199, 245, -256 * var4 / 30, var8, (byte) -2);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  if (ah.field_d == null) {
                    break L4;
                  } else {
                    var3 = null;
                    var6 = 0;
                    var4 = var6;
                    L5: while (true) {
                      if (og.field_d.length <= var6) {
                        if (var3 != null) {
                          ah.field_d.a("Screenshot(s) " + (String) (var3) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        L6: {
                          var9 = og.field_d[var6];
                          if (var9 != null) {
                            L7: {
                              if (var9.field_x != 365) {
                                break L7;
                              } else {
                                if ((var9.field_q ^ -1) != -140) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (var3 != null) {
                              var3 = (String) (var3) + ", " + var6;
                              break L6;
                            } else {
                              var3 = Integer.toString(var6);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L5;
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L8: {
                if (ah.field_d != null) {
                  ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L8;
                } else {
                  break L8;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ab.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    String d(int param0) {
        if (this.field_E == null) {
            return null;
        }
        if (this.field_D == null) {
            return null;
        }
        if (param0 != 12606) {
            this.d(-34);
        }
        if (this.field_D.length <= this.field_E.field_m) {
            return null;
        }
        return this.field_D[this.field_E.field_m];
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, 94, param2, param3);
        int var5 = param2 + -this.field_s;
        if (param1 <= 59) {
            field_A = (int[]) null;
        }
        int var6 = param0 + -this.field_j;
        oi var7 = this.a(var6, -256, var5);
        if (var7 != null && this.field_g != null) {
            ((dc) ((Object) this.field_g)).a(var7.field_m, (byte) -123, param3, (ab) (this));
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        if (param0 <= 27) {
            return;
        }
        try {
            super.a(110, param1, param2, param3);
            this.field_E = null;
            if (this.field_h) {
                var5_int = -this.field_s + -param1 + pe.field_d;
                var6 = -param3 + la.field_c + -this.field_j;
                this.field_E = this.a(var6, -256, var5_int);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ab.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ab.PA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final oi a(int param0, int param1, int param2) {
        oi var4;
        oi var5;
        int var6;
        uj var7;
        L0: {
          var6 = StarCannon.field_A;
          if (param1 == -256) {
            break L0;
          } else {
            var7 = (uj) null;
            this.a(-66, 48, (uj) null, -8);
            break L0;
          }
        }
        var4 = (oi) ((Object) this.field_C.c(-3905));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (oi) ((Object) this.field_C.a(-16913));
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_g) {
                    break L3;
                  } else {
                    if (var5.field_h > param0) {
                      break L3;
                    } else {
                      if (var5.field_g + var5.field_k <= param2) {
                        break L3;
                      } else {
                        if (var5.field_l + var5.field_h >= param0) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_o;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param0, param3, (byte) 116, ((lg) ((Object) this.field_o)).a(16293784, (uj) (this)), param2);
        if (param1 <= 64) {
            this.field_D = (String[]) null;
        }
    }

    final void f(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        lg var3;
        bd var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        nh var12;
        int var13;
        int var14;
        oi var15;
        L0: {
          this.field_C = new rk();
          if (param0 >= 66) {
            break L0;
          } else {
            this.field_D = (String[]) null;
            break L0;
          }
        }
        var2 = 0;
        var3 = (lg) ((Object) this.field_o);
        var4 = var3.a((uj) (this), (byte) -93);
        L1: while (true) {
          var5 = this.field_k.indexOf("<hotspot=", var2);
          if ((var5 ^ -1) != 0) {
            var7 = this.field_k.indexOf(">", var5);
            var6 = this.field_k.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_k.indexOf("</hotspot>", var5);
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
                    stackIn_10_0 = var12.field_d[0];
                    break L3;
                  } else {
                    stackIn_10_0 = var4.a((byte) -30, var5);
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackIn_15_0 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = var12.field_d[-1 + var12.field_d.length];
                      break L4;
                    }
                  } else {
                    stackIn_15_0 = var4.a((byte) -30, var2);
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new oi(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a(0), var12.field_c + -var12.field_g));
                  if (var10 != null) {
                    ((oi) (var10)).field_o = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                this.field_C.b(110, var15);
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
        this.field_E = null;
        try {
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var6 = null;
        String[] var4 = null;
        int var5 = 0;
        try {
            if (this.field_D == null || this.field_D.length <= param2) {
                var6 = new String[1 + param2];
                var4 = var6;
                if (!(null == this.field_D)) {
                    for (var5 = 0; var5 < this.field_D.length; var5++) {
                        var6[var5] = this.field_D[var5];
                    }
                }
                this.field_D = var4;
            }
            int var4_int = 120 / ((param1 - -49) / 36);
            this.field_D[param2] = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ab.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_G = null;
        field_F = null;
        field_A = null;
        int var1 = -121 / ((43 - param0) / 33);
        field_B = null;
        field_H = null;
    }

    static {
        field_H = new rk();
        field_B = "Once these are at maximum power new powerups will only upgrade your lasers.";
        field_A = new int[128];
        field_F = new ge();
    }
}
