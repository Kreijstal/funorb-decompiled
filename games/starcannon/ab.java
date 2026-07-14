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

    final static hl[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -25343) {
            return null;
        }
        return cc.a(1, param4, 1, param3, 3, param0, 3, 1, param2);
    }

    final static void g(byte param0) {
        if (param0 != -114) {
            field_A = null;
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        hl var8_ref = null;
        hl var9 = null;
        var5 = StarCannon.field_A;
        ki.e(243, 197, 369, 143, 16777215);
        ki.d(244, 198, 367, 141, 0);
        var1 = 34 % ((38 - param0) / 32);
        if (og.field_d != null) {
          L0: {
            var7 = og.field_d[ag.field_o];
            var8 = var7;
            var8 = var7;
            if (var7 == null) {
              if (ah.field_d != null) {
                int discarded$3 = ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            } else {
              var7.e(245, 199);
              break L0;
            }
          }
          L1: {
            if (rk.field_a < kk.field_a) {
              var8_ref = og.field_d[od.field_i];
              if (var8_ref == null) {
                break L1;
              } else {
                var3_int = (var8_ref.field_x + 60) * rk.field_a / kk.field_a;
                var4 = var3_int + -30;
                if (cc.field_j) {
                  n.a(var4 * -256 / 30, 199, 245, 256 * (var8_ref.field_x - var4) / 30, var8_ref, (byte) -2);
                  break L1;
                } else {
                  n.a(256 * (var8_ref.field_x + -var4) / 30, 199, 245, -256 * var4 / 30, var8_ref, (byte) -2);
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          L2: {
            if (ah.field_d == null) {
              break L2;
            } else {
              var3 = null;
              var6 = 0;
              var4 = var6;
              L3: while (true) {
                if (og.field_d.length <= var6) {
                  if (var3 != null) {
                    int discarded$4 = ah.field_d.a("Screenshot(s) " + var3 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var9 = og.field_d[var6];
                  if (var9 != null) {
                    L4: {
                      if (var9.field_x != 365) {
                        break L4;
                      } else {
                        if ((var9.field_q ^ -1) != -140) {
                          break L4;
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                    if (var3 != null) {
                      var3 = var3 + ", " + var6;
                      var6++;
                      continue L3;
                    } else {
                      var3 = Integer.toString(var6);
                      var6++;
                      continue L3;
                    }
                  } else {
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          L5: {
            if (ah.field_d != null) {
              int discarded$5 = ah.field_d.a(pa.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L5;
            } else {
              break L5;
            }
          }
          return;
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
        int var5 = 0;
        int var6 = 0;
        if (param0 <= 27) {
            return;
        }
        super.a(110, param1, param2, param3);
        ((ab) this).field_E = null;
        if (((ab) this).field_h) {
            var5 = -((ab) this).field_s + -param1 + pe.field_d;
            var6 = -param3 + la.field_c + -((ab) this).field_j;
            ((ab) this).field_E = this.a(var6, -256, var5);
        }
    }

    boolean a(int param0, uj param1) {
        if (param0 != 0) {
            ab.g((byte) 85);
        }
        return false;
    }

    private final oi a(int param0, int param1, int param2) {
        oi var4 = null;
        oi var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = StarCannon.field_A;
          if (param1 == -256) {
            break L0;
          } else {
            var7 = null;
            ((ab) this).a(-66, 48, (uj) null, -8);
            break L0;
          }
        }
        var4 = (oi) (Object) ((ab) this).field_C.c(-3905);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (oi) (Object) ((ab) this).field_C.a(-16913);
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
        oi var10 = null;
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
          if ((var5 ^ -1) != 0) {
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
                    var10.field_o = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
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
        ((ab) this).field_o = param1;
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        if (((ab) this).field_D != null) {
            // if_icmpgt L82
        }
        String[] var6 = new String[1 + param2];
        String[] var4_ref_String__ = var6;
        if (!(null == ((ab) this).field_D)) {
            for (var5 = 0; var5 < ((ab) this).field_D.length; var5++) {
                var6[var5] = ((ab) this).field_D[var5];
            }
        }
        ((ab) this).field_D = var4_ref_String__;
        int var4 = 120 / ((param1 - -49) / 36);
        ((ab) this).field_D[param2] = param0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new rk();
        field_B = "Once these are at maximum power new powerups will only upgrade your lasers.";
        field_A = new int[128];
        field_F = new ge();
    }
}
