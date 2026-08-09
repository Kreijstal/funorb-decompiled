/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg extends d {
    private String[] field_K;
    private vl field_O;
    private gg field_N;
    static int field_L;
    static String field_M;

    final void i(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        qe var3;
        ep var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        ml var12;
        int var13;
        int var14;
        gg var15;
        int var16;
        L0: {
          var16 = BrickABrac.field_J ? 1 : 0;
          this.field_O = new vl();
          var2 = 0;
          var3 = (qe) ((Object) this.field_l);
          if (param0 == -1) {
            break L0;
          } else {
            this.a(-10, (byte) -28, 79, -11);
            break L0;
          }
        }
        var4 = var3.c((oc) (this), -7);
        L1: while (true) {
          var5 = this.field_A.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = this.field_A.indexOf(">", var5);
            var6 = this.field_A.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_A.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, true);
            var9 = var4.a(var2, true);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if ((var11 ^ -1) == (var8 ^ -1)) {
                    stackIn_10_0 = var4.a(var5, (byte) -53);
                    break L3;
                  } else {
                    stackIn_10_0 = var12.field_g[0];
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackIn_15_0 = var12.field_g[var12.field_g.length + -1];
                      break L4;
                    } else {
                      stackIn_15_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_15_0 = var4.a(var2, (byte) -79);
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new gg(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a((byte) 71), -var12.field_d + var12.field_a));
                  if (var10 != null) {
                    ((gg) (var10)).field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_O.a(var15, (byte) 3);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    String d(int param0) {
        if (null == this.field_N) {
            return null;
        }
        if (null == this.field_K) {
            return null;
        }
        if (param0 <= 6) {
            this.a(-25, -88, 90, 70);
        }
        if (this.field_N.field_u >= this.field_K.length) {
            return null;
        }
        return this.field_K[this.field_N.field_u];
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 46) {
            return;
        }
        this.a(((qe) ((Object) this.field_l)).a((oc) (this), 46695), param0, param3, (byte) -119, param2);
    }

    boolean a(boolean param0, oc param1) {
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
            if (param0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_L = 12;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lg.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final gg b(int param0, int param1, int param2) {
        gg var4;
        gg var5;
        int var6;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            this.a(3, -6, -76, (byte) 116, -98);
            break L0;
          }
        }
        var4 = (gg) ((Object) this.field_O.d(param1 + -75));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (gg) ((Object) this.field_O.a((byte) 116));
                continue L1;
              } else {
                L3: {
                  if (var5.field_j > param2) {
                    break L3;
                  } else {
                    if (var5.field_s > param0) {
                      break L3;
                    } else {
                      if (var5.field_j + var5.field_r <= param2) {
                        break L3;
                      } else {
                        if (param0 <= var5.field_s + var5.field_n) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_N = null;
              if (this.field_q) {
                var5_int = -param2 + (pq.field_k - this.field_o);
                var6 = -param3 + (po.field_a - this.field_w);
                this.field_N = this.b(var6, 0, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("lg.WA(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void j(int param0) {
        if (param0 != -2) {
            field_M = (String) null;
        }
        field_M = null;
    }

    final static boolean a(int param0) {
        if (param0 != 9) {
            field_L = -88;
        }
        return ik.field_j;
    }

    final static jp a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        jp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                field_L = -26;
                break L1;
              }
            }
            stackIn_3_0 = fp.a(2, param0, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lg.C(").append(param0).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -106, param3);
        if (param2 >= -8) {
            String var8 = (String) null;
            lg.a(-127, (String) null, 62);
        }
        int var5 = -this.field_o + param3;
        int var6 = -this.field_w + param0;
        gg var7 = this.b(var6, 0, var5);
        if (var7 != null) {
            if (!(this.field_i == null)) {
                ((ha) ((Object) this.field_i)).a(param1, -526, var7.field_u, (lg) (this));
            }
        }
    }

    final static void h(int param0) {
        ob.field_E.c((byte) -114);
        dl.field_f = param0;
    }

    final void a(String param0, int param1, byte param2) {
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
        RuntimeException var4_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_K == null) {
                  break L2;
                } else {
                  if (this.field_K.length <= param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param1 - -1];
                var8 = var7;
                var4 = var8;
                if (null != this.field_K) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_K.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_K[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_K = var8;
              break L1;
            }
            L5: {
              this.field_K[param1] = param0;
              if (param2 == -98) {
                break L5;
              } else {
                this.d(-97);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("lg.E(");

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
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        qe var9 = (qe) ((Object) this.field_l);
        gg var6 = this.field_N;
        if (var6 == null) {
        } else {
            var7 = var9.a((oc) (this), (byte) 77, param1);
            var8 = var9.a(param0, (byte) -100, (oc) (this));
            do {
                hj.a(-2 + (var8 + var6.field_s), var7 - (-var6.field_j + 2), param3 + 132, var6.field_n + 2, 2 + var6.field_r);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    lg(String param0, ub param1) {
        super(param0, (uh) null);
        this.field_N = null;
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "Show private chat from my friends and opponents";
    }
}
