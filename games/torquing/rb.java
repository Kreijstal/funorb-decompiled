/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rb extends lg {
    private ei field_D;
    private String[] field_E;
    static long field_C;
    private tb field_F;

    rb(String param0, el param1) {
        super(param0, (ca) null);
        this.field_F = null;
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(gm param0, boolean param1) {
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
            if (!param1) {
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

            stackIn_7_1 = new StringBuilder().append("rb.JA(");

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
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -124 % ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        this.a((byte) 125);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 46) {
            return;
        }
        this.a((byte) 124, param1, param3, ((fe) ((Object) this.field_q)).a((gm) (this), 2), param2);
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = Torquing.field_u;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (hp.a(param1, (byte) -85, "getcookies"));
                    var5 = kc.a(';', var4, 0);
                    if (param0 <= -102) {
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (null != rd.field_t) {
                      stackIn_16_0 = rd.field_t;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      return param1.getParameter("settings");
                    }
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("rb.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final tb a(int param0, boolean param1, int param2) {
        tb var4;
        tb var5;
        int var6;
        L0: {
          var6 = Torquing.field_u;
          if (!param1) {
            break L0;
          } else {
            this.field_F = (tb) null;
            break L0;
          }
        }
        var4 = (tb) ((Object) this.field_D.b(0));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (tb) ((Object) this.field_D.f(-24059));
                continue L1;
              } else {
                L3: {
                  if (var5.field_m > param0) {
                    break L3;
                  } else {
                    if (param2 < var5.field_p) {
                      break L3;
                    } else {
                      if (var5.field_m + var5.field_q <= param0) {
                        break L3;
                      } else {
                        if (param2 <= var5.field_n + var5.field_p) {
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

    void a(int param0, gm param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        try {
            super.a(71, param1, param2, param3);
            int var5_int = -86 % ((param0 - -28) / 43);
            this.field_F = null;
            if (this.field_s) {
                var6 = -this.field_w + -param3 + n.field_t;
                var7 = k.field_e + (-param2 + -this.field_k);
                this.field_F = this.a(var6, false, var7);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "rb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -44, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        fe var10 = (fe) ((Object) this.field_q);
        tb var6 = this.field_F;
        if (var6 != null) {
            var7 = var10.a(2, param3, (gm) (this));
            var8 = var10.a((gm) (this), param2, -59);
            do {
                he.a(-2 + var7 + var6.field_m, 2 + var6.field_n, -2 + (var6.field_p + var8), 2, var6.field_q + 2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
        if (param1 >= -7) {
            gm var9 = (gm) null;
            this.a(107, (gm) null, -97, 84);
        }
    }

    final void a(int param0, byte param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        gm var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_E == null) {
                  break L2;
                } else {
                  if (this.field_E.length > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var8 = new String[param0 + 1];
                var9 = var8;
                var4 = var9;
                if (this.field_E != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (this.field_E.length <= var5) {
                      break L3;
                    } else {
                      var8[var5] = this.field_E[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_E = var9;
              break L1;
            }
            L5: {
              this.field_E[param0] = param2;
              if (param1 < -73) {
                break L5;
              } else {
                var7 = (gm) null;
                this.a((gm) null, false);
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

            stackIn_15_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    String b(int param0) {
        if (this.field_F == null) {
            return null;
        }
        if (null == this.field_E) {
            return null;
        }
        if (this.field_E.length <= this.field_F.field_j) {
            return null;
        }
        if (param0 != 0) {
            return (String) null;
        }
        return this.field_E[this.field_F.field_j];
    }

    final void a(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        fe var3;
        uj var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        int var12;
        kp var13;
        int var14;
        int var15;
        tb var16;
        int var17;
        var17 = Torquing.field_u;
        this.field_D = new ei();
        var2 = 0;
        var3 = (fe) ((Object) this.field_q);
        var4 = var3.b((byte) 110, (gm) (this));
        var5 = -116 / ((param0 - 76) / 41);
        L0: while (true) {
          var6 = this.field_m.indexOf("<hotspot=", var2);
          if ((var6 ^ -1) == 0) {
            return;
          } else {
            var8 = this.field_m.indexOf(">", var6);
            var7 = this.field_m.substring(9 + var6, var8);
            var8 = Integer.parseInt(var7);
            var2 = this.field_m.indexOf("</hotspot>", var6);
            var9 = var4.b(var6, (byte) 110);
            var10 = var4.b(var2, (byte) 110);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var12 > var10) {
                continue L0;
              } else {
                L2: {
                  var13 = var4.field_c[var12];
                  if ((var9 ^ -1) != (var12 ^ -1)) {
                    stackIn_7_0 = var13.field_b[0];
                    break L2;
                  } else {
                    stackIn_7_0 = var4.a(var6, (byte) -110);
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 == var12) {
                    stackIn_12_0 = var4.a(var2, (byte) -112);
                    break L3;
                  } else {
                    if (var13 == null) {
                      stackIn_12_0 = 0;
                      break L3;
                    } else {
                      stackIn_12_0 = var13.field_b[-1 + var13.field_b.length];
                      break L3;
                    }
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new tb(var8, var14, var13.field_c, -var14 + var15, Math.max(var3.a(false), -var13.field_c + var13.field_a));
                  if (var11 != null) {
                    ((tb) (var11)).field_k = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11 = var16;
                this.field_D.a((byte) 54, var16);
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    final static ga a(Throwable param0, String param1) {
        ga var2 = null;
        if (!(param0 instanceof ga)) {
            var2 = new ga(param0, param1);
        } else {
            var2 = (ga) ((Object) param0);
            var2.field_b = var2.field_b + ' ' + param1;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ 0, param3);
        if (param2 != -1) {
            return;
        }
        int var5 = -this.field_w + param3;
        int var6 = param1 - this.field_k;
        tb var7 = this.a(var5, false, var6);
        if (var7 != null) {
            if (!(this.field_t == null)) {
                ((fp) ((Object) this.field_t)).a((byte) 124, param0, var7.field_j, (rb) (this));
            }
        }
    }

    static {
    }
}
