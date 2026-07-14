/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vj extends eb {
    static rh field_K;
    static String field_L;
    static int field_P;
    private hh field_N;
    static boolean field_Q;
    private jj field_R;
    private String[] field_M;
    static String[] field_O;

    void a(gl param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param3 < 25) {
            return;
        }
        super.a(param0, param1, param2, 104);
        ((vj) this).field_N = null;
        if (!(!((vj) this).field_s)) {
            var5 = -((vj) this).field_w + -param2 + ef.field_j;
            var6 = jb.field_b - param1 - ((vj) this).field_u;
            ((vj) this).field_N = this.a(2, var5, var6);
        }
    }

    private final hh a(int param0, int param1, int param2) {
        hh var4 = null;
        hh var5 = null;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          var4 = (hh) (Object) ((vj) this).field_R.d(9272);
          if (param0 == 2) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (hh) (Object) ((vj) this).field_R.e((byte) -119);
                continue L1;
              } else {
                L3: {
                  if (var5.field_n > param1) {
                    break L3;
                  } else {
                    if (var5.field_o > param2) {
                      break L3;
                    } else {
                      if (var5.field_q + var5.field_n <= param1) {
                        break L3;
                      } else {
                        if (param2 > var5.field_o - -var5.field_h) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = Terraphoenix.field_V;
        for (var1 = param0; 21 > var1; var1++) {
            od.field_c[var1] = new re(var1);
        }
    }

    final void a(int param0, String param1, byte param2) {
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        int var4 = 100 % ((param2 - 80) / 45);
        if (((vj) this).field_M != null) {
            // if_icmpgt L92
        }
        String[] var5 = new String[1 + param0];
        if (null != ((vj) this).field_M) {
            for (var6 = 0; var6 < ((vj) this).field_M.length; var6++) {
                var5[var6] = ((vj) this).field_M[var6];
            }
        }
        ((vj) this).field_M = var5;
        ((vj) this).field_M[param0] = param1;
    }

    boolean a(byte param0, gl param1) {
        if (param0 <= 2) {
            vj.a(103);
        }
        return false;
    }

    final static void a(int param0) {
        if (param0 != -24517) {
            field_L = null;
        }
        jl.field_I.b(false);
        if (null == vi.field_n) {
            vi.field_n = new na(jl.field_I, m.field_e);
        }
        jl.field_I.a((gl) (Object) vi.field_n, (byte) -1);
    }

    final void b(boolean param0) {
        int var2 = 0;
        w var3 = null;
        ld var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hh var10 = null;
        int var11 = 0;
        em var12 = null;
        int var13 = 0;
        int var14 = 0;
        hh var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var16 = Terraphoenix.field_V;
          ((vj) this).field_R = new jj();
          if (param0) {
            break L0;
          } else {
            var17 = null;
            ((vj) this).a(-95, (String) null, (byte) -110);
            break L0;
          }
        }
        var2 = 0;
        var3 = (w) (Object) ((vj) this).field_l;
        var4 = var3.a((gl) this, -19302);
        L1: while (true) {
          var5 = ((vj) this).field_o.indexOf("<hotspot=", var2);
          if ((var5 ^ -1) != 0) {
            var7 = ((vj) this).field_o.indexOf(">", var5);
            var6 = ((vj) this).field_o.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((vj) this).field_o.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, 0);
            var9 = var4.b(var2, 0);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_f[var11];
                  if (var8 != var11) {
                    stackOut_9_0 = var12.field_d[0];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var4.a(var5, 0);
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 == var11) {
                    stackOut_14_0 = var4.a(var2, 0);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_d[var12.field_d.length - 1];
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_15_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new hh(var7, var13, var12.field_e, var14 + -var13, Math.max(var3.a(8233), -var12.field_e + var12.field_a));
                  if (var10 == null) {
                    break L5;
                  } else {
                    var10.field_j = var15;
                    break L5;
                  }
                }
                ((vj) this).field_R.a((uf) (Object) var15, -16611);
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

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
            return;
        }
        super.a(param0, (byte) 117, param2, param3, param4);
        ((vj) this).b(true);
    }

    String f(int param0) {
        if (param0 <= 70) {
            field_K = null;
        }
        if (((vj) this).field_N == null) {
            return null;
        }
        if (null == ((vj) this).field_M) {
            return null;
        }
        if (((vj) this).field_N.field_i >= ((vj) this).field_M.length) {
            return null;
        }
        return ((vj) this).field_M[((vj) this).field_N.field_i];
    }

    vj(String param0, cj param1) {
        super(param0, (sc) null);
        ((vj) this).field_N = null;
        ((vj) this).field_l = param1;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, -121, param2, param3);
        if (!(0 == param2)) {
            return;
        }
        if (param1 > -106) {
            ((vj) this).field_N = null;
        }
        w var9 = (w) (Object) ((vj) this).field_l;
        hh var6 = ((vj) this).field_N;
        if (var6 == null) {
        } else {
            var7 = var9.a((gl) this, -37, param0);
            var8 = var9.a((gl) this, param3, (byte) -72);
            do {
                ed.a(var6.field_q - -2, var6.field_h - -2, var8 + (var6.field_o - 2), 52, var7 - (-var6.field_n + 2));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((vj) this).a(param0, (byte) 88, param3, param2, ((w) (Object) ((vj) this).field_l).b((gl) this, (byte) 112));
        if (param1 >= -4) {
            field_L = null;
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 != -32015) {
            fa discarded$0 = vj.a(true, false, -10, (byte) -18, -113);
        }
        field_O = null;
        field_K = null;
    }

    final static fa a(boolean param0, boolean param1, int param2, byte param3, int param4) {
        if (param3 != 62) {
            field_L = null;
        }
        return jg.a(30, param4, false, param0, param2, param1);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - ((vj) this).field_w;
        int var6 = -((vj) this).field_u + param0;
        hh var7 = this.a(param2 + 4, var5, var6);
        if (var7 != null) {
            if (!(((vj) this).field_r == null)) {
                ((jf) (Object) ((vj) this).field_r).a((byte) -85, (vj) this, param1, var7.field_i);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Orb coins: <%0>";
        field_O = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = new rh(0, 2, 2, 1);
    }
}
