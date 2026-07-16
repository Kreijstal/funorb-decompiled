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
        int var2 = 0;
        eg var3 = null;
        ne var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        pi var12 = null;
        int var13 = 0;
        int var14 = 0;
        mi var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = fleas.field_A ? 1 : 0;
          ((ja) this).field_N = new vc();
          var2 = 0;
          if (param0 == 424) {
            break L0;
          } else {
            var17 = null;
            ((ja) this).a(-109, 29, (qa) null, (byte) 12);
            break L0;
          }
        }
        var3 = (eg) (Object) ((ja) this).field_p;
        var4 = var3.a((qa) this, (byte) -35);
        L1: while (true) {
          var5 = ((ja) this).field_i.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          } else {
            var7 = ((ja) this).field_i.indexOf(">", var5);
            var6 = ((ja) this).field_i.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ja) this).field_i.indexOf("</hotspot>", var5);
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
                  if (var8 == var11) {
                    stackOut_8_0 = var4.c(-1, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_d[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackOut_13_0 = var4.c(-1, var2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var12.field_d[var12.field_d.length - 1];
                      stackIn_14_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new mi(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a((byte) 127), -var12.field_a + var12.field_c));
                  if (var10 != null) {
                    ((mi) var10).field_q = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((ja) this).field_N.a(false, (lh) (Object) var15);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((ja) this).b(55, 20, false, -78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ja) this).field_K == null) {
              break L2;
            } else {
              if (param2 < ((ja) this).field_K.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var7 = new String[param2 - -1];
            var4 = var7;
            if (null == ((ja) this).field_K) {
              break L3;
            } else {
              var5 = 0;
              L4: while (true) {
                if (var5 >= ((ja) this).field_K.length) {
                  break L3;
                } else {
                  var7[var5] = ((ja) this).field_K[var5];
                  var5++;
                  continue L4;
                }
              }
            }
          }
          ((ja) this).field_K = var4;
          break L1;
        }
        ((ja) this).field_K[param2] = param1;
    }

    ja(String param0, ch param1) {
        super(param0, (kd) null);
        ((ja) this).field_M = null;
        ((ja) this).field_p = param1;
    }

    private final mi b(int param0, int param1, int param2) {
        mi var4 = null;
        mi var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var4 = (mi) (Object) ((ja) this).field_N.c((byte) 47);
        if (param2 == -1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (mi) (Object) ((ja) this).field_N.b((byte) -105);
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
          return null;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, (byte) -108);
        ((ja) this).field_M = null;
        if (param3 > -85) {
            ((ja) this).field_M = null;
        }
        if (((ja) this).field_x) {
            var5 = ag.field_f - (param1 - -((ja) this).field_y);
            var6 = -param0 + kc.field_b + -((ja) this).field_z;
            ((ja) this).field_M = this.b(var5, var6, -1);
        }
    }

    String g(int param0) {
        if (null == ((ja) this).field_M) {
            return null;
        }
        if (null == ((ja) this).field_K) {
            return null;
        }
        if (param0 != 4) {
            mi discarded$0 = this.b(-37, 104, -16);
        }
        if (((ja) this).field_M.field_m >= ((ja) this).field_K.length) {
            return null;
        }
        return ((ja) this).field_K[((ja) this).field_M.field_m];
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ja) this).a(param1, param0, param2, ((eg) (Object) ((ja) this).field_p).b(-69, (qa) this), 80);
        if (param3 != -9) {
            ((ja) this).field_K = null;
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
        if (param1 > -26) {
            ((ja) this).a(78, 122, -59, -72);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ja) this).i(424);
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.b(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        eg var5 = (eg) (Object) ((ja) this).field_p;
        mi var6 = ((ja) this).field_M;
        if (var6 != null) {
            var7 = var5.a(false, param1, (qa) this);
            var8 = var5.a(param0, (qa) this, (byte) 84);
            do {
                ek.a(var6.field_l + 2, -2 + (var7 - -var6.field_i), var8 + var6.field_j - 2, 1, var6.field_n + 2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - ((ja) this).field_y;
        int var6 = -((ja) this).field_z + param0;
        mi var7 = this.b(var5, var6, -1);
        if (var7 != null) {
            if (!(null == ((ja) this).field_s)) {
                ((dc) (Object) ((ja) this).field_s).a(var7.field_m, (ja) this, param3, param1 ^ 22);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
        field_O = "Close";
        field_L = "Please wait...";
    }
}
