/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kja extends htb {
    static String field_C;
    private hob field_F;
    private ij field_B;
    static String field_G;
    private String[] field_D;
    static ij field_E;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((kja) this).g((byte) 122);
    }

    final void c(int param0, int param1, int param2, int param3) {
        super.c(param0, param1, param2 + 0, param3);
        int var5 = param1 - ((kja) this).field_g;
        int var6 = param3 + -((kja) this).field_r;
        hob var7 = this.b(var5, var6, param2 ^ param2);
        if (var7 != null) {
            if (!(null == ((kja) this).field_l)) {
                ((ln) (Object) ((kja) this).field_l).a(-1, param0, var7.field_i, (kja) this);
            }
        }
    }

    String d(byte param0) {
        if (null == ((kja) this).field_F) {
            return null;
        }
        if (null == ((kja) this).field_D) {
            return null;
        }
        if (((kja) this).field_F.field_i >= ((kja) this).field_D.length) {
            return null;
        }
        if (param0 != 125) {
            return null;
        }
        return ((kja) this).field_D[((kja) this).field_F.field_i];
    }

    private final hob b(int param0, int param1, int param2) {
        hob var4 = null;
        hob var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var4 = (hob) (Object) ((kja) this).field_B.d(param2 + param2);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (hob) (Object) ((kja) this).field_B.a((byte) 95);
                continue L0;
              } else {
                L2: {
                  if (param0 < var5.field_h) {
                    break L2;
                  } else {
                    if (var5.field_k > param1) {
                      break L2;
                    } else {
                      if (var5.field_g + var5.field_h <= param0) {
                        break L2;
                      } else {
                        if (var5.field_k + var5.field_j >= param1) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_f;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    kja(String param0, wwa param1) {
        super(param0, (sba) null);
        ((kja) this).field_F = null;
        ((kja) this).field_q = param1;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != -23) {
            Object var6 = null;
            boolean discarded$0 = ((kja) this).a(110, (shb) null);
        }
        ((kja) this).a(param2, param0, ((at) (Object) ((kja) this).field_q).a((shb) this, (byte) 81), 1, param1);
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (null != ((kja) this).field_D) {
            // if_icmplt L87
        }
        String[] var7 = new String[param0 - -1];
        String[] var4 = var7;
        if (!(((kja) this).field_D == null)) {
            for (var5 = 0; ((kja) this).field_D.length > var5; var5++) {
                var7[var5] = ((kja) this).field_D[var5];
            }
        }
        ((kja) this).field_D = var4;
        if (param1 != -1) {
            ((kja) this).a(87, 68, 4, -44, 106);
        }
        ((kja) this).field_D[param0] = param2;
    }

    boolean a(int param0, shb param1) {
        if (param0 != 0) {
            field_G = null;
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, shb param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((kja) this).field_F = null;
        if (!(!((kja) this).field_e)) {
            var5 = -((kja) this).field_g + kc.field_b + -param1;
            var6 = -param0 + (uia.field_b - ((kja) this).field_r);
            ((kja) this).field_F = this.b(var5, var6, 0);
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.b(param0, param1, 52, param3);
        if (!(0 == param1)) {
            return;
        }
        if (param2 < 47) {
            return;
        }
        at var9 = (at) (Object) ((kja) this).field_q;
        hob var6 = ((kja) this).field_F;
        if (var6 == null) {
        } else {
            var7 = var9.a(0, param0, (shb) this);
            var8 = var9.b(-3, param3, (shb) this);
            do {
                aha.a(var6.field_k + var8 + -2, var6.field_g - -2, var7 - -var6.field_h - 2, 2 + var6.field_j, (byte) -90);
                var6 = var6.field_f;
            } while (var6 != null);
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        at var3 = null;
        ar var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hob var10 = null;
        int var11 = 0;
        toa var12 = null;
        int var13 = 0;
        int var14 = 0;
        hob var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = VoidHunters.field_G;
        ((kja) this).field_B = new ij();
        var2 = 0;
        var3 = (at) (Object) ((kja) this).field_q;
        var4 = var3.a((shb) this, 3);
        L0: while (true) {
          var5 = ((kja) this).field_j.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (param0 > 110) {
                break L1;
              } else {
                ((kja) this).field_D = null;
                break L1;
              }
            }
            return;
          } else {
            var7 = ((kja) this).field_j.indexOf(">", var5);
            var6 = ((kja) this).field_j.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((kja) this).field_j.indexOf("</hotspot>", var5);
            var8 = var4.a(true, var5);
            var9 = var4.a(true, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_c[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(var5, -125);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  } else {
                    stackOut_8_0 = var4.a(var2, -114);
                    stackIn_12_0 = stackOut_8_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new hob(var7, var13, var12.field_b, var14 + -var13, Math.max(var3.a(124), -var12.field_b + var12.field_a));
                  if (var10 != null) {
                    var10.field_f = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((kja) this).field_B.b(-10258, (ksa) (Object) var15);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_G = null;
        field_E = null;
        field_C = null;
        int var1 = 34 % ((param0 - 20) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Software";
        field_G = "Spawn Nebula";
    }
}
