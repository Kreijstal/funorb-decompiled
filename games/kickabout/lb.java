/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends wi {
    static String[] field_K;
    private String[] field_J;
    static ut field_L;
    static String field_H;
    static String field_G;
    static String field_N;
    private tf field_E;
    static volatile int field_M;
    static boolean field_F;
    private er field_I;

    private final er b(int param0, int param1, int param2) {
        er var4;
        er var5;
        int var6;
        L0: {
          var6 = Kickabout.field_G;
          var4 = (er) ((Object) this.field_E.g(24009));
          if (param1 == 2) {
            break L0;
          } else {
            this.field_I = (er) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (er) ((Object) this.field_E.c(param1 ^ 35));
                continue L1;
              } else {
                L3: {
                  if (param0 < var5.field_g) {
                    break L3;
                  } else {
                    if (param2 < var5.field_m) {
                      break L3;
                    } else {
                      if (var5.field_g - -var5.field_e <= param0) {
                        break L3;
                      } else {
                        if (var5.field_m + var5.field_f >= param2) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        gm var4;
        int stackIn_8_0 = 0;
        L0: {
          if (param2 == 480) {
            break L0;
          } else {
            var4 = (gm) null;
            lb.a((gm) null, 69);
            break L0;
          }
        }
        L1: {
          L2: {
            if (20 + param0 <= 0) {
              break L2;
            } else {
              if (-1 <= (param1 ^ -1)) {
                break L2;
              } else {
                if ((param0 - 20 ^ -1) <= -641) {
                  break L2;
                } else {
                  if (480 <= -40 + param1) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_t + param1;
        int var6 = -this.field_g + param2;
        er var7 = this.b(var5, 2, var6);
        if (var7 != null && null != this.field_k) {
            ((qu) ((Object) this.field_k)).a((lb) (this), param0, var7.field_i, 40);
        }
    }

    public static void i(int param0) {
        field_L = null;
        field_K = null;
        field_G = null;
        field_N = null;
        field_H = null;
        if (param0 != 9574) {
            field_M = 34;
        }
    }

    final static void a(byte param0, int param1) {
        ml var2 = or.field_d;
        if (param0 != -105) {
            lb.i(83);
        }
        var2.b(param1, (byte) -80);
        var2.a(116, 1);
        var2.a(param0 ^ -32, 2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
            field_H = (String) null;
        }
        this.a(((ke) ((Object) this.field_r)).b(param0 + 4, (fd) (this)), 1, param2, param1, param3);
    }

    lb(String param0, gj param1) {
        super(param0, (jv) null);
        this.field_I = null;
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        if (!(cq.e(15137))) {
            return;
        }
        try {
            if (param0 != -28153) {
                field_L = (ut) null;
            }
            or.field_d.b(89, (byte) 77);
            or.field_d.field_n = or.field_d.field_n + 2;
            var2_int = or.field_d.field_n;
            or.field_d.a(14190, param1);
            or.field_d.d(or.field_d.field_n + -var2_int, 62);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String f(int param0) {
        if (null == this.field_I) {
            return null;
        }
        if (null == this.field_J) {
            return null;
        }
        if (param0 != -1) {
            this.b(112, 119, -84, -8);
        }
        if (this.field_I.field_i >= this.field_J.length) {
            return null;
        }
        return this.field_J[this.field_I.field_i];
    }

    void a(byte param0, fd param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.field_I = null;
            if (this.field_m) {
                var5_int = -param2 + (el.field_A - this.field_t);
                var6 = n.field_m - (param3 + this.field_g);
                this.field_I = this.b(var5_int, 2, var6);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ak a(gm param0, int param1) {
        ak var2 = null;
        RuntimeException var2_ref = null;
        ak stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new ak(param1);
            var2.field_m = param0;
            stackIn_1_0 = (ak) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("lb.D(");

            if (param0 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1 ^ 0, param2, param3, param4);
        this.a((byte) -41);
        if (param1 != 1) {
            field_H = (String) null;
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 12082) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_J == null) {
                  break L3;
                } else {
                  if (param1 >= this.field_J.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (null == this.field_J) {
                  break L4;
                } else {
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= this.field_J.length) {
                      break L4;
                    } else {
                      var7[var5] = this.field_J[var5];
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
              this.field_J = var8;
              break L2;
            }
            this.field_J[param1] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("lb.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("lb.HA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
            return;
        }
        ke var5 = (ke) ((Object) this.field_r);
        er var6 = this.field_I;
        if (var6 != null) {
            var7 = var5.a((fd) (this), param2, -1);
            var8 = var5.a(true, (fd) (this), param3);
            do {
                ob.b(param1 + -63, 2 + var6.field_e, var6.field_m + (var8 - 2), var6.field_f - -2, -2 + (var7 + var6.field_g));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        ke var3;
        iq var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        qj var12;
        int var13;
        int var14;
        er var15;
        int var16;
        L0: {
          var16 = Kickabout.field_G;
          this.field_E = new tf();
          var2 = 0;
          var3 = (ke) ((Object) this.field_r);
          var4 = var3.a(param0 ^ -4996, (fd) (this));
          if (param0 == -41) {
            break L0;
          } else {
            field_H = (String) null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = this.field_q.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = this.field_q.indexOf(">", var5);
            var6 = this.field_q.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_q.indexOf("</hotspot>", var5);
            var8 = var4.a(param0 + 41, var5);
            var9 = var4.a(0, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 == var8) {
                    stackIn_9_0 = var4.b(0, var5);
                    break L3;
                  } else {
                    stackIn_9_0 = var12.field_b[0];
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackIn_14_0 = var4.b(param0 + 41, var2);
                    break L4;
                  } else {
                    if (var12 != null) {
                      stackIn_14_0 = var12.field_b[-1 + var12.field_b.length];
                      break L4;
                    } else {
                      stackIn_14_0 = 0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new er(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a((byte) -76), -var12.field_g + var12.field_d));
                  if (var10 != null) {
                    ((er) (var10)).field_j = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                this.field_E.a(var15, param0 + 44);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        field_K = new String[]{"Auto-Switch: Off", "Auto-Switch: On"};
        field_H = "Tips";
        field_N = "Names cannot contain consecutive spaces";
        field_M = 0;
        field_G = "Use this alternative as your account name";
    }
}
