/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am implements dh {
    static go[] field_b;
    static String field_f;
    private int field_g;
    static gn field_d;
    private int field_e;
    private qi field_a;
    static String field_c;

    final static void a(int param0, String param1, boolean param2, ql param3, int param4, int param5) {
        if (!param2) {
          field_f = null;
          param3.c(param1, param0 - -1, 1 + param4, 8, -1, 114);
          param3.c(param1, param0, param4, param5, -1);
          return;
        } else {
          param3.c(param1, param0 - -1, 1 + param4, 8, -1, 114);
          param3.c(param1, param0, param4, param5, -1);
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        if (param1 == 114) {
          vd.a((java.awt.Component) (Object) param0, -116);
          gk.a((java.awt.Component) (Object) param0, param1 ^ 109);
          if (null != lb.field_u) {
            lb.field_u.a((java.awt.Component) (Object) param0, (byte) 106);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          am.a(-98, (String) null, true, (ql) null, 48, -52);
          vd.a((java.awt.Component) (Object) param0, -116);
          gk.a((java.awt.Component) (Object) param0, param1 ^ 109);
          if (null == lb.field_u) {
            return;
          } else {
            lb.field_u.a((java.awt.Component) (Object) param0, (byte) 106);
            return;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var11 = HoldTheLine.field_D;
        if (param2 <= -48) {
          L0: {
            if (param3.field_p) {
              stackOut_37_0 = 3249872;
              stackIn_39_0 = stackOut_37_0;
              break L0;
            } else {
              if (!param3.c((byte) -20)) {
                stackOut_38_0 = 2188450;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                var6 = 3249872;
                int discarded$3 = ((am) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_q + "</u>", param3.field_k + param1, param3.field_o + param4, param3.field_x, param3.field_u, var6, -1, ((am) this).field_e, ((am) this).field_g, ((am) this).field_a.field_G - -((am) this).field_a.field_I);
                if (param3.c((byte) -20)) {
                  L1: {
                    var7 = ((am) this).field_a.a(param3.field_q);
                    var8 = ((am) this).field_a.field_I + ((am) this).field_a.field_G;
                    var9 = param1 + param3.field_k;
                    var10 = param4 - -param3.field_o;
                    if ((((am) this).field_e ^ -1) == -3) {
                      var9 = var9 + (param3.field_x - var7);
                      break L1;
                    } else {
                      if (((am) this).field_e != 1) {
                        break L1;
                      } else {
                        L2: {
                          var9 = var9 + (-var7 + param3.field_x >> -1921105503);
                          if (2 == ((am) this).field_g) {
                            var10 = var10 + (-var8 + param3.field_u);
                            break L2;
                          } else {
                            if (1 == ((am) this).field_g) {
                              var10 = var10 + (param3.field_u + -var8 >> 955315457);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                        return;
                      }
                    }
                  }
                  if (2 != ((am) this).field_g) {
                    if (1 != ((am) this).field_g) {
                      ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                      return;
                    } else {
                      var10 = var10 + (param3.field_u + -var8 >> 955315457);
                      ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param3.field_u);
                    ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          var6 = stackIn_39_0;
          int discarded$4 = ((am) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_q + "</u>", param3.field_k + param1, param3.field_o + param4, param3.field_x, param3.field_u, var6, -1, ((am) this).field_e, ((am) this).field_g, ((am) this).field_a.field_G - -((am) this).field_a.field_I);
          if (param3.c((byte) -20)) {
            L3: {
              var7 = ((am) this).field_a.a(param3.field_q);
              var8 = ((am) this).field_a.field_I + ((am) this).field_a.field_G;
              var9 = param1 + param3.field_k;
              var10 = param4 - -param3.field_o;
              if ((((am) this).field_e ^ -1) == -3) {
                var9 = var9 + (param3.field_x - var7);
                break L3;
              } else {
                if (((am) this).field_e != 1) {
                  break L3;
                } else {
                  var9 = var9 + (-var7 + param3.field_x >> -1921105503);
                  if (2 != ((am) this).field_g) {
                    if (1 != ((am) this).field_g) {
                      ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                      return;
                    } else {
                      var10 = var10 + (param3.field_u + -var8 >> 955315457);
                      ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param3.field_u);
                    ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                    return;
                  }
                }
              }
            }
            if (2 != ((am) this).field_g) {
              if (1 != ((am) this).field_g) {
                ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                return;
              } else {
                var10 = var10 + (param3.field_u + -var8 >> 955315457);
                ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                return;
              }
            } else {
              var10 = var10 + (-var8 + param3.field_u);
              ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
              return;
            }
          } else {
            return;
          }
        } else {
          L4: {
            L5: {
              field_b = null;
              if (param3.field_p) {
                break L5;
              } else {
                if (!param3.c((byte) -20)) {
                  stackOut_5_0 = 2188450;
                  stackIn_6_0 = stackOut_5_0;
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            stackOut_4_0 = 3249872;
            stackIn_6_0 = stackOut_4_0;
            break L4;
          }
          L6: {
            var6 = stackIn_6_0;
            int discarded$5 = ((am) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_q + "</u>", param3.field_k + param1, param3.field_o + param4, param3.field_x, param3.field_u, var6, -1, ((am) this).field_e, ((am) this).field_g, ((am) this).field_a.field_G - -((am) this).field_a.field_I);
            if (!param3.c((byte) -20)) {
              break L6;
            } else {
              L7: {
                var7 = ((am) this).field_a.a(param3.field_q);
                var8 = ((am) this).field_a.field_I + ((am) this).field_a.field_G;
                var9 = param1 + param3.field_k;
                var10 = param4 - -param3.field_o;
                if ((((am) this).field_e ^ -1) == -3) {
                  var9 = var9 + (param3.field_x - var7);
                  break L7;
                } else {
                  if (((am) this).field_e != 1) {
                    break L7;
                  } else {
                    var9 = var9 + (-var7 + param3.field_x >> -1921105503);
                    break L7;
                  }
                }
              }
              L8: {
                if (2 == ((am) this).field_g) {
                  var10 = var10 + (-var8 + param3.field_u);
                  break L8;
                } else {
                  if (1 == ((am) this).field_g) {
                    var10 = var10 + (param3.field_u + -var8 >> 955315457);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
              break L6;
            }
          }
          return;
        }
    }

    public am() {
        ((am) this).field_g = 1;
        ((am) this).field_e = 1;
        ((am) this).field_a = hl.field_g;
    }

    final static void a(int param0, byte param1, fb param2) {
        Object var4 = null;
        bj.field_O.a((byte) -103, (hl) (Object) param2);
        if (param1 >= -27) {
          var4 = null;
          am.a(-120, (byte) -6, (fb) null);
          dn.a(param2, param0, 118);
          return;
        } else {
          dn.a(param2, param0, 118);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        if (param0 != 1) {
            am.a(-13);
        }
    }

    am(qi param0, int param1, int param2) {
        ((am) this).field_e = param1;
        ((am) this).field_a = param0;
        ((am) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Single-player controls:";
    }
}
