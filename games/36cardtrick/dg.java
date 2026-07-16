/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dg extends hl {
    private fk field_M;
    static boolean field_F;
    private bk field_L;
    private String[] field_K;
    static de field_G;
    static String field_E;
    static ch field_H;
    static String[] field_I;
    static int field_J;

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = -42 % ((param0 - -14) / 33);
        ((dg) this).a(((ne) (Object) ((dg) this).field_v).a(-2, (lk) this), param3, param1, param2, true);
    }

    boolean a(int param0, lk param1) {
        if (param0 <= 71) {
            ((dg) this).field_L = null;
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - ((dg) this).field_o;
        int var6 = -((dg) this).field_i + param0;
        fk var7 = this.b(var6, (byte) 108, var5);
        if (var7 != null) {
            if (((dg) this).field_k != null) {
                ((cl) (Object) ((dg) this).field_k).a(param2, var7.field_g, (byte) 26, (dg) this);
            }
        }
    }

    final void a(String param0, byte param1, int param2) {
        String[] var4_ref_String__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        L0: {
          L1: {
            var6 = Main.field_T;
            if (((dg) this).field_K == null) {
              break L1;
            } else {
              if (((dg) this).field_K.length <= param2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var7 = new String[1 + param2];
            var4_ref_String__ = var7;
            if (((dg) this).field_K != null) {
              var5 = 0;
              L3: while (true) {
                if (var5 >= ((dg) this).field_K.length) {
                  break L2;
                } else {
                  var7[var5] = ((dg) this).field_K[var5];
                  var5++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((dg) this).field_K = var4_ref_String__;
          break L0;
        }
        ((dg) this).field_K[param2] = param0;
        var4 = 117 % ((param1 - -22) / 38);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        super.a(param0, param1, param2, param3, param4);
        ((dg) this).e((byte) 5);
    }

    public static void h(int param0) {
        field_E = null;
        field_I = null;
        field_G = null;
        if (param0 >= -73) {
            return;
        }
        field_H = null;
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return hh.field_g == ei.field_d ? true : false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        ne var5 = (ne) (Object) ((dg) this).field_v;
        fk var6 = ((dg) this).field_M;
        if (var6 != null) {
            var7 = var5.a(param0, (byte) 90, (lk) this);
            var8 = var5.a((lk) this, -1815612287, param1);
            do {
                na.a(var8 + (var6.field_n + -2), 51, var6.field_j + 2, 2 + var6.field_k, -2 + (var7 + var6.field_i));
                var6 = var6.field_m;
            } while (var6 != null);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        ne var3 = null;
        mj var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        di var12 = null;
        int var13 = 0;
        int var14 = 0;
        fk var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var16 = Main.field_T;
        ((dg) this).field_L = new bk();
        if (param0 == 5) {
          var2 = 0;
          var3 = (ne) (Object) ((dg) this).field_v;
          var4 = var3.a((byte) -104, (lk) this);
          L0: while (true) {
            var5 = ((dg) this).field_r.indexOf("<hotspot=", var2);
            if (0 != (var5 ^ -1)) {
              var7 = ((dg) this).field_r.indexOf(">", var5);
              var6 = ((dg) this).field_r.substring(9 + var5, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((dg) this).field_r.indexOf("</hotspot>", var5);
              var8 = var4.a(-13453, var5);
              var9 = var4.a(-13453, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_d[var11];
                    if (var8 != var11) {
                      stackOut_9_0 = var12.field_a[0];
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_8_0 = var4.a(true, var5);
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_10_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var12.field_a[var12.field_a.length + -1];
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    } else {
                      stackOut_11_0 = var4.a(true, var2);
                      stackIn_15_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_15_0;
                    var15 = new fk(var7, var13, var12.field_b, var14 + -var13, Math.max(var3.a(param0 + -6), -var12.field_b + var12.field_c));
                    if (var10 != null) {
                      ((fk) var10).field_m = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var10 = (Object) (Object) var15;
                  ((dg) this).field_L.a((qb) (Object) var15, 27362);
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final fk b(int param0, byte param1, int param2) {
        fk var4 = null;
        fk var5 = null;
        int var6 = 0;
        L0: {
          var6 = Main.field_T;
          var4 = (fk) (Object) ((dg) this).field_L.a((byte) 74);
          if (param1 > 97) {
            break L0;
          } else {
            field_F = true;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (fk) (Object) ((dg) this).field_L.b((byte) -122);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_i) {
                    break L3;
                  } else {
                    if (param0 < var5.field_n) {
                      break L3;
                    } else {
                      if (var5.field_j + var5.field_i <= param2) {
                        break L3;
                      } else {
                        if (param0 <= var5.field_n + var5.field_k) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_m;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    dg(String param0, ci param1) {
        super(param0, (pl) null);
        ((dg) this).field_M = null;
        ((dg) this).field_v = param1;
    }

    void a(int param0, int param1, lk param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((dg) this).field_M = null;
        if (!(!((dg) this).field_j)) {
            var5 = -param1 + eg.field_b + -((dg) this).field_o;
            var6 = -((dg) this).field_i + (ij.field_e - param0);
            ((dg) this).field_M = this.b(var6, (byte) 116, var5);
        }
    }

    String b(byte param0) {
        if (param0 != -79) {
            return null;
        }
        if (null == ((dg) this).field_M) {
            return null;
        }
        if (null == ((dg) this).field_K) {
            return null;
        }
        if (((dg) this).field_K.length <= ((dg) this).field_M.field_g) {
            return null;
        }
        return ((dg) this).field_K[((dg) this).field_M.field_g];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Connection restored.";
        field_G = new de(14, 0, 4, 1);
        field_I = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
