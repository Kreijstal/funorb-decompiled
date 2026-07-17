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
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 > 71) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((dg) this).field_L = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("dg.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
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
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              L2: {
                if (((dg) this).field_K == null) {
                  break L2;
                } else {
                  if (((dg) this).field_K.length <= param2) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param2];
                var4 = var7;
                if (((dg) this).field_K != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((dg) this).field_K.length) {
                      break L3;
                    } else {
                      var7[var5] = ((dg) this).field_K[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((dg) this).field_K = var4;
              break L1;
            }
            ((dg) this).field_K[param2] = param0;
            var4_int = 117 % ((param1 - -22) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("dg.GA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
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

    final static boolean a() {
        return hh.field_g == ei.field_d;
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
            if (var5 != -1) {
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
        try {
            ((dg) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(int param0, int param1, lk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              ((dg) this).field_M = null;
              if (((dg) this).field_j) {
                var5_int = -param1 + eg.field_b + -((dg) this).field_o;
                var6 = -((dg) this).field_i + (ij.field_e - param0);
                ((dg) this).field_M = this.b(var6, (byte) 116, var5_int);
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
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("dg.E(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
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
