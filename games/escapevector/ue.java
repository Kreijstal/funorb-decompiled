/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ue extends hc {
    private cn field_D;
    private String[] field_F;
    private bl field_E;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 + -((ue) this).field_k;
        int var6 = param1 + -((ue) this).field_j;
        bl var7 = this.a(var6, (byte) -110, var5);
        if (var7 != null) {
            if (null != ((ue) this).field_q) {
                ((sg) (Object) ((ue) this).field_q).a(param0 ^ 18321, (ue) this, var7.field_m, param3);
            }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) 87, param2, param3);
        if (param1 <= 85) {
            ((ue) this).field_D = null;
        }
        if (param2 != 0) {
            return;
        }
        ao var9 = (ao) (Object) ((ue) this).field_s;
        bl var6 = ((ue) this).field_E;
        if (var6 == null) {
        } else {
            var7 = var9.a((byte) -113, (hm) this, param3);
            var8 = var9.a((hm) this, param0, -16956);
            do {
                ic.a(false, 2 + var6.field_j, var6.field_i + var7 - 2, var6.field_n - -2, -2 + var8 - -var6.field_g);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final void a(String param0, byte param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (((ue) this).field_F != null) {
            // if_icmpge L24
        } else {
            var7 = new String[1 + param2];
            var4 = var7;
            if (!(((ue) this).field_F == null)) {
                for (var5 = 0; ((ue) this).field_F.length > var5; var5++) {
                    var7[var5] = ((ue) this).field_F[var5];
                }
            }
            ((ue) this).field_F = var4;
        }
        if (param1 < 51) {
            ue.b(-38, (byte) -110);
        }
        ((ue) this).field_F[param2] = param0;
    }

    final void k(int param0) {
        int var2 = 0;
        ao var3 = null;
        pg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bl var10 = null;
        int var11 = 0;
        vl var12 = null;
        int var13 = 0;
        int var14 = 0;
        bl var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = EscapeVector.field_A;
        ((ue) this).field_D = new cn();
        var2 = param0;
        var3 = (ao) (Object) ((ue) this).field_s;
        var4 = var3.b((hm) this, 90);
        L0: while (true) {
          var5 = ((ue) this).field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((ue) this).field_l.indexOf(">", var5);
            var6 = ((ue) this).field_l.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ue) this).field_l.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, 0);
            var9 = var4.a(var2, 0);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_a[var11];
                  if (var8 == var11) {
                    stackOut_6_0 = var4.a((byte) 122, var5);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var12.field_b[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 == var9) {
                    stackOut_11_0 = var4.a((byte) 125, var2);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var12 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new bl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(109), var12.field_a - var12.field_d));
                  if (var10 == null) {
                    break L4;
                  } else {
                    var10.field_k = var15;
                    break L4;
                  }
                }
                ((ue) this).field_D.a(-12328, (hg) (Object) var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
            ue.b(-85, (byte) -78);
        }
        super.a(param0, param1, param2, param3, param4);
        ((ue) this).k(0);
    }

    ue(String param0, db param1) {
        super(param0, (wn) null);
        ((ue) this).field_E = null;
        ((ue) this).field_s = param1;
    }

    private final bl a(int param0, byte param1, int param2) {
        bl var4 = null;
        bl var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var4 = (bl) (Object) ((ue) this).field_D.a(false);
        if (param1 <= -83) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (bl) (Object) ((ue) this).field_D.b((byte) 70);
                  continue L0;
                } else {
                  L2: {
                    if (param2 < var5.field_i) {
                      break L2;
                    } else {
                      if (var5.field_g > param0) {
                        break L2;
                      } else {
                        if (var5.field_i - -var5.field_j <= param2) {
                          break L2;
                        } else {
                          if (var5.field_g + var5.field_n >= param0) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_k;
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

    final static void b(int param0, byte param1) {
        try {
            try {
                Object discarded$0 = sd.a((byte) 106, oc.d((byte) -62), new Object[1], "resizing");
            } catch (Throwable throwable) {
            }
            if (param1 <= 93) {
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ue) this).a(param2, param3, param1, true, ((ao) (Object) ((ue) this).field_s).a(-106, (hm) this));
        if (param0 != 2463) {
            ((ue) this).field_F = null;
        }
    }

    boolean a(int param0, hm param1) {
        if (param0 != -4659) {
            ((ue) this).field_E = null;
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((ue) this).field_E = null;
        if (((ue) this).field_u) {
            var5 = -param2 + (dh.field_d + -((ue) this).field_k);
            var6 = -param1 + bj.field_y - ((ue) this).field_j;
            ((ue) this).field_E = this.a(var6, (byte) -111, var5);
        }
    }

    String d(int param0) {
        if (((ue) this).field_E == null) {
            return null;
        }
        if (((ue) this).field_F == null) {
            return null;
        }
        if (param0 != 1) {
            return null;
        }
        if (((ue) this).field_E.field_m >= ((ue) this).field_F.length) {
            return null;
        }
        return ((ue) this).field_F[((ue) this).field_E.field_m];
    }

    static {
    }
}
