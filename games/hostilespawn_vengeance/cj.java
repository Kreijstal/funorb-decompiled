/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends ph {
    private vl field_G;
    static String field_K;
    private String[] field_H;
    private mm field_J;
    static int field_I;

    final static void a(java.applet.Applet param0, int param1) {
        al.field_T = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        pc.a(var3, var2, true, var4, param0);
        if (param1 != 0) {
            cj.a(20, false);
        }
    }

    String e(int param0) {
        if (param0 != 34) {
            return null;
        }
        if (((cj) this).field_J == null) {
            return null;
        }
        if (((cj) this).field_H == null) {
            return null;
        }
        if (((cj) this).field_J.field_r >= ((cj) this).field_H.length) {
            return null;
        }
        return ((cj) this).field_H[((cj) this).field_J.field_r];
    }

    final static nc a(gb param0, int param1, int param2, gb param3, int param4) {
        if (param1 != 7844) {
            cj.a(false);
        }
        if (!rl.a(2884, param3, param4, param2)) {
            return null;
        }
        return li.a(param0.a(false, param2, param4), 5116);
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) 72, param3);
        if (-1 != (param3 ^ -1)) {
            return;
        }
        mi var9 = (mi) (Object) ((cj) this).field_h;
        if (param2 <= 42) {
            field_K = null;
        }
        mm var6 = ((cj) this).field_J;
        if (var6 == null) {
        } else {
            var7 = var9.a(param1, -1, (ag) this);
            var8 = var9.a(-1, (ag) this, param0);
            do {
                bh.a(2 + var6.field_i, -2 + var6.field_p + var8, (byte) 65, -2 + (var7 - -var6.field_l), 2 + var6.field_o);
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = HostileSpawn.field_I ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param0;
        int var3 = gm.a(var11, param2, (byte) 125);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0.charAt(var8) != param2; var8++) {
            }
            var5++;
            var4[var5] = param0.substring(var6, var8);
            var6 = 1 + var8;
        }
        if (param1 >= -5) {
            Object var10 = null;
            nc discarded$0 = cj.a((gb) null, 50, 61, (gb) null, -88);
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((cj) this).j(-25638);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_K = null;
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (null != ((cj) this).field_H) {
            // if_icmpge L25
        } else {
            var7 = new String[1 + param2];
            var4 = var7;
            if (!(null == ((cj) this).field_H)) {
                for (var5 = 0; ((cj) this).field_H.length > var5; var5++) {
                    var7[var5] = ((cj) this).field_H[var5];
                }
            }
            ((cj) this).field_H = var4;
        }
        if (param0 != -1) {
            return;
        }
        ((cj) this).field_H[param2] = param1;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((cj) this).a(param1, param3, 0, param2, ((mi) (Object) ((cj) this).field_h).b((ag) this, (byte) -83));
        if (!param0) {
            cj.a(89, false);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((cj) this).field_J = null;
        if (!(!((cj) this).field_u)) {
            var5 = -((cj) this).field_v + -param3 + j.field_c;
            var6 = -param1 + rb.field_m - ((cj) this).field_m;
            ((cj) this).field_J = this.a(-2, var6, var5);
        }
    }

    final static uj a(int param0, int param1) {
        if (param1 != 5) {
            field_K = null;
        }
        uj var2 = new uj();
        ve.field_b.a((am) (Object) var2, 109);
        pe.a((byte) 51, param0);
        return var2;
    }

    final void j(int param0) {
        int var2 = 0;
        mi var3 = null;
        ce var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        mm var10 = null;
        int var11 = 0;
        pm var12 = null;
        int var13 = 0;
        int var14 = 0;
        mm var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = HostileSpawn.field_I ? 1 : 0;
          ((cj) this).field_G = new vl();
          if (param0 == -25638) {
            break L0;
          } else {
            ((cj) this).field_G = null;
            break L0;
          }
        }
        var2 = 0;
        var3 = (mi) (Object) ((cj) this).field_h;
        var4 = var3.a((ag) this, 1);
        L1: while (true) {
          var5 = ((cj) this).field_n.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((cj) this).field_n.indexOf(">", var5);
            var6 = ((cj) this).field_n.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((cj) this).field_n.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, 0);
            var9 = var4.a(var2, param0 + 25638);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_d[var11];
                  if (var8 != var11) {
                    stackOut_9_0 = var12.field_b[0];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var4.b(var5, param0 ^ -25638);
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_14_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = var4.b(var2, param0 ^ -25638);
                    stackIn_15_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new mm(var7, var13, var12.field_i, var14 + -var13, Math.max(var3.a(true), -var12.field_i + var12.field_f));
                  if (var10 != null) {
                    var10.field_j = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((cj) this).field_G.a((am) (Object) var15, param0 ^ -25716);
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

    private final mm a(int param0, int param1, int param2) {
        mm var4 = null;
        mm var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            var7 = null;
            nc discarded$2 = cj.a((gb) null, 119, -67, (gb) null, 52);
            break L0;
          }
        }
        var4 = (mm) (Object) ((cj) this).field_G.g(-109);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (mm) (Object) ((cj) this).field_G.a(12684);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_l) {
                    break L3;
                  } else {
                    if (param1 < var5.field_p) {
                      break L3;
                    } else {
                      if (var5.field_l - -var5.field_o <= param2) {
                        break L3;
                      } else {
                        if (param1 > var5.field_i + var5.field_p) {
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

    final static void a(int param0, boolean param1) {
        if (param0 < 55) {
            field_I = 21;
        }
        c.field_a.a(25957, param1);
    }

    boolean a(byte param0, ag param1) {
        if (param0 >= 0) {
            return true;
        }
        return false;
    }

    cj(String param0, nn param1) {
        super(param0, (mh) null);
        ((cj) this).field_J = null;
        ((cj) this).field_h = param1;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - ((cj) this).field_v;
        int var6 = param0 + -((cj) this).field_m;
        mm var7 = this.a(-2, var6, var5);
        if (var7 != null) {
            if (!(((cj) this).field_p == null)) {
                ((nk) (Object) ((cj) this).field_p).a(-2, var7.field_r, (cj) this, param3);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 5;
        field_K = "Get out of the complex before it disintegrates.";
    }
}
