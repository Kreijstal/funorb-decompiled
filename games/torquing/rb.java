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
        ((rb) this).field_F = null;
        ((rb) this).field_q = param1;
    }

    boolean a(gm param0, boolean param1) {
        if (param1) {
            return false;
        }
        return false;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -124 % ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        ((rb) this).a((byte) 125);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 46) {
            return;
        }
        ((rb) this).a((byte) 124, param1, param3, ((fe) (Object) ((rb) this).field_q).a((gm) this, 2), param2);
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            Object stackOut_2_0 = null;
            var8 = Torquing.field_u;
            try {
              L0: {
                var9 = param1.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) hp.a(param1, (byte) -85, "getcookies");
                var5 = kc.a(';', var4, 0);
                if (param0 <= -102) {
                  var6 = 0;
                  L1: while (true) {
                    if (var5.length <= var6) {
                      break L0;
                    } else {
                      L2: {
                        var7 = var5[var6].indexOf('=');
                        if ((var7 ^ -1) > -1) {
                          break L2;
                        } else {
                          if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                            break L2;
                          } else {
                            stackOut_8_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          }
                        }
                      }
                      var6++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (String) (Object) stackIn_3_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (null != rd.field_t) {
              return rd.field_t;
            } else {
              return param1.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final tb a(int param0, boolean param1, int param2) {
        tb var4 = null;
        tb var5 = null;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (!param1) {
            break L0;
          } else {
            ((rb) this).field_F = null;
            break L0;
          }
        }
        var4 = (tb) (Object) ((rb) this).field_D.b(0);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (tb) (Object) ((rb) this).field_D.f(-24059);
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
        super.a(71, param1, param2, param3);
        int var5 = -86 % ((param0 - -28) / 43);
        ((rb) this).field_F = null;
        if (((rb) this).field_s) {
            var6 = -((rb) this).field_w + -param3 + n.field_t;
            var7 = k.field_e + (-param2 + -((rb) this).field_k);
            ((rb) this).field_F = this.a(var6, false, var7);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -44, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        fe var10 = (fe) (Object) ((rb) this).field_q;
        tb var6 = ((rb) this).field_F;
        if (var6 != null) {
            var7 = var10.a(2, param3, (gm) this);
            var8 = var10.a((gm) this, param2, -59);
            do {
                he.a(-2 + var7 + var6.field_m, 2 + var6.field_n, -2 + (var6.field_p + var8), 2, var6.field_q + 2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
        if (param1 >= -7) {
            Object var9 = null;
            ((rb) this).a(107, (gm) null, -97, 84);
        }
    }

    final void a(int param0, byte param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        L0: {
          L1: {
            var6 = Torquing.field_u;
            if (((rb) this).field_E == null) {
              break L1;
            } else {
              if (((rb) this).field_E.length > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var8 = new String[param0 + 1];
            var4 = var8;
            if (((rb) this).field_E != null) {
              var5 = 0;
              L3: while (true) {
                if (((rb) this).field_E.length <= var5) {
                  break L2;
                } else {
                  var8[var5] = ((rb) this).field_E[var5];
                  var5++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((rb) this).field_E = var4;
          break L0;
        }
        L4: {
          ((rb) this).field_E[param0] = param2;
          if (param1 < -73) {
            break L4;
          } else {
            var7 = null;
            boolean discarded$2 = ((rb) this).a((gm) null, false);
            break L4;
          }
        }
    }

    String b(int param0) {
        if (((rb) this).field_F == null) {
            return null;
        }
        if (null == ((rb) this).field_E) {
            return null;
        }
        if (((rb) this).field_E.length <= ((rb) this).field_F.field_j) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        return ((rb) this).field_E[((rb) this).field_F.field_j];
    }

    final void a(byte param0) {
        int var2 = 0;
        fe var3 = null;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        kp var13 = null;
        int var14 = 0;
        int var15 = 0;
        tb var16 = null;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var17 = Torquing.field_u;
        ((rb) this).field_D = new ei();
        var2 = 0;
        var3 = (fe) (Object) ((rb) this).field_q;
        var4 = var3.b((byte) 110, (gm) this);
        var5 = -116 / ((param0 - 76) / 41);
        L0: while (true) {
          var6 = ((rb) this).field_m.indexOf("<hotspot=", var2);
          if ((var6 ^ -1) == 0) {
            return;
          } else {
            var8 = ((rb) this).field_m.indexOf(">", var6);
            var7 = ((rb) this).field_m.substring(9 + var6, var8);
            var8 = Integer.parseInt(var7);
            var2 = ((rb) this).field_m.indexOf("</hotspot>", var6);
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
                  if (var9 != var12) {
                    stackOut_6_0 = var13.field_b[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var4.a(var6, (byte) -110);
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 == var12) {
                    stackOut_11_0 = var4.a(var2, (byte) -112);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var13 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = var13.field_b[-1 + var13.field_b.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new tb(var8, var14, var13.field_c, -var14 + var15, Math.max(var3.a(false), -var13.field_c + var13.field_a));
                  if (var11 != null) {
                    ((tb) var11).field_k = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11 = (Object) (Object) var16;
                ((rb) this).field_D.a((byte) 54, (q) (Object) var16);
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
            var2 = (ga) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ 0, param3);
        if (param2 != -1) {
            return;
        }
        int var5 = -((rb) this).field_w + param3;
        int var6 = param1 - ((rb) this).field_k;
        tb var7 = this.a(var5, false, var6);
        if (var7 != null) {
            if (!(((rb) this).field_t == null)) {
                ((fp) (Object) ((rb) this).field_t).a((byte) 124, param0, var7.field_j, (rb) this);
            }
        }
    }

    static {
    }
}
