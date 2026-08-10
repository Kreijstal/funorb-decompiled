/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ja extends bb {
    static int field_P;
    private String[] field_K;
    private vc field_N;
    static String field_L;
    static String field_O;
    private mi field_M;

    final void i(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        eg var3;
        ne var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        pi var12;
        int var13;
        int var14;
        mi var15;
        int var16;
        qa var17;
        L0: {
          var16 = fleas.field_A ? 1 : 0;
          this.field_N = new vc();
          var2 = 0;
          if (param0 == 424) {
            break L0;
          } else {
            var17 = (qa) null;
            this.a(-109, 29, (qa) null, (byte) 12);
            break L0;
          }
        }
        var3 = (eg) ((Object) this.field_p);
        var4 = var3.a((qa) (this), (byte) -35);
        L1: while (true) {
          var5 = this.field_i.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          } else {
            var7 = this.field_i.indexOf(">", var5);
            var6 = this.field_i.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_i.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -1);
            var9 = var4.b(var2, -1);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if ((var8 ^ -1) == (var11 ^ -1)) {
                    stackIn_9_0 = var4.c(-1, var5);
                    break L3;
                  } else {
                    stackIn_9_0 = var12.field_d[0];
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackIn_14_0 = var4.c(-1, var2);
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = var12.field_d[var12.field_d.length - 1];
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new mi(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a((byte) 127), -var12.field_a + var12.field_c));
                  if (var10 != null) {
                    ((mi) (var10)).field_q = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                this.field_N.a(false, var15);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        try {
            if (param0 != 0) {
                this.b(55, 20, false, -78);
            }
            if (this.field_K == null || param2 >= this.field_K.length) {
                var7 = new String[param2 - -1];
                var8 = var7;
                String[] var4 = var8;
                if (null != this.field_K) {
                    for (var5 = 0; var5 < this.field_K.length; var5++) {
                        var7[var5] = this.field_K[var5];
                    }
                }
                this.field_K = var8;
            }
            this.field_K[param2] = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ja.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ja(String param0, ch param1) {
        super(param0, (kd) null);
        this.field_M = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final mi b(int param0, int param1, int param2) {
        mi var4;
        mi var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        var4 = (mi) ((Object) this.field_N.c((byte) 47));
        if (param2 == -1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (mi) ((Object) this.field_N.b((byte) -105));
                  continue L0;
                } else {
                  L2: {
                    if (param0 < var5.field_i) {
                      break L2;
                    } else {
                      if (param1 < var5.field_j) {
                        break L2;
                      } else {
                        if (param0 >= var5.field_i - -var5.field_n) {
                          break L2;
                        } else {
                          if (var5.field_j + var5.field_l >= param1) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_q;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (mi) null;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, (byte) -108);
            this.field_M = null;
            if (param3 > -85) {
                this.field_M = (mi) null;
            }
            if (this.field_x) {
                var5_int = ag.field_f - (param1 - -this.field_y);
                var6 = -param0 + kc.field_b + -this.field_z;
                this.field_M = this.b(var5_int, var6, -1);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ja.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    String g(int param0) {
        mi discarded$0 = null;
        if (null == this.field_M) {
            return null;
        }
        if (null == this.field_K) {
            return null;
        }
        if (param0 != 4) {
            discarded$0 = this.b(-37, 104, -16);
        }
        if (this.field_M.field_m >= this.field_K.length) {
            return null;
        }
        return this.field_K[this.field_M.field_m];
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param1, param0, param2, ((eg) ((Object) this.field_p)).b(-69, (qa) (this)), 80);
        if (param3 != -9) {
            this.field_K = (String[]) null;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 > -75) {
            return;
        }
        field_L = null;
    }

    boolean a(qa param0, int param1) {
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
              if (param1 <= -26) {
                break L1;
              } else {
                this.a(78, 122, -59, -72);
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

            stackIn_6_1 = new StringBuilder().append("ja.A(");

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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(424);
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.b(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        eg var5 = (eg) ((Object) this.field_p);
        mi var6 = this.field_M;
        if (var6 != null) {
            var7 = var5.a(false, param1, (qa) (this));
            var8 = var5.a(param0, (qa) (this), (byte) 84);
            do {
                ek.a(var6.field_l + 2, -2 + (var7 - -var6.field_i), var8 + var6.field_j - 2, 1, var6.field_n + 2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - this.field_y;
        int var6 = -this.field_z + param0;
        mi var7 = this.b(var5, var6, -1);
        if (var7 != null) {
            if (!(null == this.field_s)) {
                ((dc) ((Object) this.field_s)).a(var7.field_m, (ja) (this), param3, param1 ^ 22);
            }
        }
    }

    static {
        field_P = 0;
        field_O = "Close";
        field_L = "Please wait...";
    }
}
