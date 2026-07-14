/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ar extends wp {
    static te field_N;
    private s field_J;
    static String field_F;
    private String[] field_I;
    static int field_G;
    private jn field_H;
    static String field_M;
    static wb field_E;
    static tf field_L;

    final void a(int param0, boolean param1, int param2, int param3) {
        ((ar) this).a(-50, param2, param0, ((de) (Object) ((ar) this).field_w).b((pk) this, (byte) 116), param3);
        if (param1) {
            Object var6 = null;
            ((ar) this).a(-89, -87, (pk) null, -5);
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_M = null;
        field_N = null;
        if (param0 >= -115) {
            field_E = null;
        }
        field_F = null;
        field_L = null;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        super.a(param0, -117, param2, param3);
        int var5 = 65 % ((param1 - -25) / 45);
        ((ar) this).field_J = null;
        if (!(!((ar) this).field_k)) {
            var6 = -((ar) this).field_r + (-param0 + ko.field_p);
            var7 = -param3 + (pi.field_e - ((ar) this).field_v);
            ((ar) this).field_J = this.b(-40, var6, var7);
        }
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        db var5_ref_db = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var9 = null;
        lh var10 = null;
        pl var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var11 = ig.field_a;
          var2 = var11.e(-31302);
          var3 = 99 / ((-33 - param0) / 36);
          if (var2 == -1) {
            var10 = (lh) (Object) no.field_d.b(-110);
            if (var10 != null) {
              L1: {
                var5 = var11.e(-31302);
                if (var5 != 0) {
                  var15 = new byte[var5];
                  var14 = var15;
                  var13 = var14;
                  var12 = var13;
                  var9 = var12;
                  var6 = var9;
                  var11.a(var15, var5, 0, (byte) -47);
                  break L1;
                } else {
                  var6 = null;
                  break L1;
                }
              }
              var11.field_p = var11.field_p + 4;
              if (!var11.e((byte) -9)) {
                kk.a((byte) -127);
                return;
              } else {
                var10.field_o = true;
                var10.field_m = var6;
                var10.b(false);
                break L0;
              }
            } else {
              kk.a((byte) -109);
              return;
            }
          } else {
            if (-2 != var2) {
              ms.a("A1: " + di.b((byte) -9), (Throwable) null, 0);
              kk.a((byte) -128);
              break L0;
            } else {
              var4 = var11.c(true);
              var5_ref_db = (db) (Object) jj.field_a.b(83);
              L2: while (true) {
                L3: {
                  if (var5_ref_db == null) {
                    break L3;
                  } else {
                    if (var4 == var5_ref_db.field_m) {
                      break L3;
                    } else {
                      var5_ref_db = (db) (Object) jj.field_a.d((byte) 18);
                      continue L2;
                    }
                  }
                }
                if (var5_ref_db == null) {
                  kk.a((byte) -123);
                  return;
                } else {
                  var5_ref_db.b(false);
                  break L0;
                }
              }
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        de var3 = null;
        ag var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        s var10 = null;
        int var11 = 0;
        tk var12 = null;
        int var13 = 0;
        int var14 = 0;
        s var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var16 = Sumoblitz.field_L ? 1 : 0;
          ((ar) this).field_H = new jn();
          var2 = 0;
          var3 = (de) (Object) ((ar) this).field_w;
          var4 = var3.b(-3, (pk) this);
          if (param0 == 9) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((ar) this).field_m.indexOf("<hotspot=", var2);
          if (0 == (var5 ^ -1)) {
            return;
          } else {
            var7 = ((ar) this).field_m.indexOf(">", var5);
            var6 = ((ar) this).field_m.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ar) this).field_m.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -17500);
            var9 = var4.b(var2, param0 + -17509);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_a[var11];
                  if (var11 == var8) {
                    stackOut_7_0 = var4.a((byte) 125, var5);
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = var12.field_b[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  } else {
                    stackOut_9_0 = var4.a((byte) 126, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_13_0;
                  var15 = new s(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(14763), -var12.field_d + var12.field_a));
                  if (var10 != null) {
                    var10.field_r = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((ar) this).field_H.a((ms) (Object) var15, (byte) 39);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    ar(String param0, mh param1) {
        super(param0, (qm) null);
        ((ar) this).field_J = null;
        ((ar) this).field_w = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-114, param1, param2, param3, param4);
        int var6 = -60 / ((param0 - 28) / 63);
        ((ar) this).a(9);
    }

    boolean a(pk param0, byte param1) {
        if (param1 != 61) {
            field_N = null;
            return false;
        }
        return false;
    }

    private final s b(int param0, int param1, int param2) {
        int var4 = 0;
        s var5 = null;
        s var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var4 = 22 / ((88 - param0) / 35);
        var5 = (s) (Object) ((ar) this).field_H.b(124);
        L0: while (true) {
          if (var5 != null) {
            var6 = var5;
            L1: while (true) {
              if (var6 == null) {
                var5 = (s) (Object) ((ar) this).field_H.d((byte) 18);
                continue L0;
              } else {
                L2: {
                  if (var6.field_s > param1) {
                    break L2;
                  } else {
                    if (var6.field_l > param2) {
                      break L2;
                    } else {
                      if (var6.field_t + var6.field_s <= param1) {
                        break L2;
                      } else {
                        if (param2 <= var6.field_l - -var6.field_p) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = var6.field_r;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) -113, param3);
        if (!(param3 == 0)) {
            return;
        }
        de var9 = (de) (Object) ((ar) this).field_w;
        if (param2 >= -35) {
            field_L = null;
        }
        s var6 = ((ar) this).field_J;
        if (var6 != null) {
            var7 = var9.a(param0, (pk) this, 16098);
            var8 = var9.b(param1, (pk) this, 0);
            do {
                pp.a(-2 + (var6.field_l + var8), var6.field_t + 2, -13181, -2 + (var7 + var6.field_s), 2 + var6.field_p);
                var6 = var6.field_r;
            } while (var6 != null);
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > -44) {
            field_F = null;
        }
        if (null != ((ar) this).field_I) {
            // if_icmple L41
        } else {
            var7 = new String[1 + param2];
            var4 = var7;
            if (null != ((ar) this).field_I) {
                for (var5 = 0; var5 < ((ar) this).field_I.length; var5++) {
                    var7[var5] = ((ar) this).field_I[var5];
                }
            }
            ((ar) this).field_I = var4;
        }
        ((ar) this).field_I[param2] = param1;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -((ar) this).field_r + param1;
        int var6 = param3 + -((ar) this).field_v;
        s var7 = this.b(126, var5, var6);
        if (var7 != null) {
            if (((ar) this).field_o != null) {
                ((ca) (Object) ((ar) this).field_o).a(var7.field_q, (ar) this, param0, -20036);
            }
        }
    }

    String c(int param0) {
        if (null == ((ar) this).field_J) {
            return null;
        }
        if (((ar) this).field_I == null) {
            return null;
        }
        if (param0 != -6696) {
            field_F = null;
        }
        if (((ar) this).field_I.length <= ((ar) this).field_J.field_q) {
            return null;
        }
        return ((ar) this).field_I[((ar) this).field_J.field_q];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Connection timed out. Please try using a different server.";
        field_G = 0;
        field_M = "points remaining: <%0>";
        field_N = new te(8);
        field_L = new tf();
    }
}
