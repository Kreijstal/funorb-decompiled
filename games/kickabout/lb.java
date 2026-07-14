/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends wi {
    static String[] field_K;
    private String[] field_J;
    static ut field_L;
    static String field_H;
    static String field_G;
    static String field_N;
    private tf field_E;
    static volatile int field_M;
    static boolean field_F;
    private er field_I;

    private final er b(int param0, int param1, int param2) {
        er var4 = null;
        er var5 = null;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var4 = (er) (Object) ((lb) this).field_E.g(24009);
          if (param1 == 2) {
            break L0;
          } else {
            ((lb) this).field_I = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (er) (Object) ((lb) this).field_E.c(param1 ^ 35);
                continue L1;
              } else {
                L3: {
                  if (param0 < var5.field_g) {
                    break L3;
                  } else {
                    if (param2 < var5.field_m) {
                      break L3;
                    } else {
                      if (var5.field_g - -var5.field_e <= param0) {
                        break L3;
                      } else {
                        if (var5.field_m + var5.field_f >= param2) {
                          return var4;
                        } else {
                          break L3;
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

    final static boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 == 480) {
            break L0;
          } else {
            var4 = null;
            ak discarded$2 = lb.a((gm) null, 69);
            break L0;
          }
        }
        L1: {
          L2: {
            if (20 + param0 <= 0) {
              break L2;
            } else {
              if (-1 <= (param1 ^ -1)) {
                break L2;
              } else {
                if ((param0 - 20 ^ -1) <= -641) {
                  break L2;
                } else {
                  if (480 <= -40 + param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -((lb) this).field_t + param1;
        int var6 = -((lb) this).field_g + param2;
        er var7 = this.b(var5, 2, var6);
        if (var7 != null) {
            if (null != ((lb) this).field_k) {
                ((qu) (Object) ((lb) this).field_k).a((lb) this, param0, var7.field_i, 40);
            }
        }
    }

    public static void i(int param0) {
        field_L = null;
        field_K = null;
        field_G = null;
        field_N = null;
        field_H = null;
        if (param0 != 9574) {
            field_M = 34;
        }
    }

    final static void a(byte param0, int param1) {
        ml var2 = or.field_d;
        if (param0 != -105) {
            lb.i(83);
        }
        var2.b(param1, (byte) -80);
        var2.a(116, 1);
        var2.a(param0 ^ -32, 2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
            field_H = null;
        }
        ((lb) this).a(((ke) (Object) ((lb) this).field_r).b(param0 + 4, (fd) this), 1, param2, param1, param3);
    }

    lb(String param0, gj param1) {
        super(param0, (jv) null);
        ((lb) this).field_I = null;
        ((lb) this).field_r = param1;
    }

    final static void a(int param0, String param1) {
        if (!(cq.e(15137))) {
            return;
        }
        if (param0 != -28153) {
            field_L = null;
        }
        or.field_d.b(89, (byte) 77);
        or.field_d.field_n = or.field_d.field_n + 2;
        int var2 = or.field_d.field_n;
        or.field_d.a(14190, param1);
        or.field_d.d(or.field_d.field_n + -var2, 62);
    }

    String f(int param0) {
        if (null == ((lb) this).field_I) {
            return null;
        }
        if (null == ((lb) this).field_J) {
            return null;
        }
        if (param0 != -1) {
            ((lb) this).b(112, 119, -84, -8);
        }
        if (((lb) this).field_I.field_i >= ((lb) this).field_J.length) {
            return null;
        }
        return ((lb) this).field_J[((lb) this).field_I.field_i];
    }

    void a(byte param0, fd param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((lb) this).field_I = null;
        if (((lb) this).field_m) {
            var5 = -param2 + (el.field_A - ((lb) this).field_t);
            var6 = n.field_m - (param3 + ((lb) this).field_g);
            ((lb) this).field_I = this.b(var5, 2, var6);
        }
    }

    final static ak a(gm param0, int param1) {
        ak var2 = new ak(param1);
        var2.field_m = param0;
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1 ^ 0, param2, param3, param4);
        ((lb) this).a((byte) -41);
        if (param1 != 1) {
            field_H = null;
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param2 != 12082) {
            field_H = null;
        }
        if (((lb) this).field_J != null) {
            // if_icmpge L41
        } else {
            var7 = new String[1 + param1];
            var4 = var7;
            if (null != ((lb) this).field_J) {
                for (var5 = 0; var5 < ((lb) this).field_J.length; var5++) {
                    var7[var5] = ((lb) this).field_J[var5];
                }
            }
            ((lb) this).field_J = var4;
        }
        ((lb) this).field_J[param1] = param0;
    }

    boolean a(fd param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
            return;
        }
        ke var5 = (ke) (Object) ((lb) this).field_r;
        er var6 = ((lb) this).field_I;
        if (var6 != null) {
            var7 = var5.a((fd) this, param2, -1);
            var8 = var5.a(true, (fd) this, param3);
            do {
                ob.b(param1 + -63, 2 + var6.field_e, var6.field_m + (var8 - 2), var6.field_f - -2, -2 + (var7 + var6.field_g));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        ke var3 = null;
        iq var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        er var10 = null;
        int var11 = 0;
        qj var12 = null;
        int var13 = 0;
        int var14 = 0;
        er var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = Kickabout.field_G;
          ((lb) this).field_E = new tf();
          var2 = 0;
          var3 = (ke) (Object) ((lb) this).field_r;
          var4 = var3.a(param0 ^ -4996, (fd) this);
          if (param0 == -41) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((lb) this).field_q.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((lb) this).field_q.indexOf(">", var5);
            var6 = ((lb) this).field_q.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((lb) this).field_q.indexOf("</hotspot>", var5);
            var8 = var4.a(param0 + 41, var5);
            var9 = var4.a(0, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 == var8) {
                    stackOut_8_0 = var4.b(0, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_b[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackOut_13_0 = var4.b(param0 + 41, var2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    if (var12 != null) {
                      stackOut_12_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_14_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new er(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a((byte) -76), -var12.field_g + var12.field_d));
                  if (var10 != null) {
                    var10.field_j = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                ((lb) this).field_E.a((gn) (Object) var15, param0 + 44);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Auto-Switch: Off", "Auto-Switch: On"};
        field_H = "Tips";
        field_N = "Names cannot contain consecutive spaces";
        field_M = 0;
        field_G = "Use this alternative as your account name";
    }
}
