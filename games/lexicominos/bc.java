/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc extends kf {
    private String[] field_G;
    private wl field_I;
    static String field_J;
    static String[] field_E;
    private ng field_K;
    static fi field_H;
    static String[] field_L;
    static dg field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wl var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = -((bc) this).field_t + param3;
        var6 = param1 - ((bc) this).field_o;
        var7 = this.a(var6, false, var5);
        if (var7 != null) {
          if (((bc) this).field_r != null) {
            ((ue) (Object) ((bc) this).field_r).a(123, (bc) this, var7.field_o, param2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        int var2 = 0;
        ub var3 = null;
        ve var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wl var10 = null;
        int var11 = 0;
        rj var12 = null;
        int var13 = 0;
        int var14 = 0;
        wl var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var16 = Lexicominos.field_L ? 1 : 0;
        ((bc) this).field_K = new ng();
        var2 = 0;
        var3 = (ub) (Object) ((bc) this).field_i;
        var4 = var3.a((w) this, (byte) -111);
        L0: while (true) {
          var5 = ((bc) this).field_u.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((bc) this).field_u.indexOf(">", var5);
            var6 = ((bc) this).field_u.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((bc) this).field_u.indexOf("</hotspot>", var5);
            var8 = var4.a(28276, var5);
            var9 = var4.a(28276, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_7_0 = var12.field_a[0];
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var4.a((byte) -113, var5);
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var12.field_a[var12.field_a.length + -1];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var4.a((byte) -127, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new wl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c + -var12.field_d));
                  if (var10 != null) {
                    var10.field_p = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((bc) this).field_K.b(114, (kd) (Object) var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          } else {
            if (param0) {
              return;
            } else {
              wl discarded$1 = this.a(68, true, 35);
              return;
            }
          }
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((bc) this).field_I = null;
        if (!((bc) this).field_m) {
          return;
        } else {
          var5 = -((bc) this).field_t + -param3 + bk.field_b;
          var6 = -((bc) this).field_o + sh.field_e - param2;
          ((bc) this).field_I = this.a(var6, false, var5);
          return;
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        String[] var11 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param2 == -27371) {
          if (((bc) this).field_G == null) {
            var7 = new String[1 + param1];
            var11 = var7;
            if (null != ((bc) this).field_G) {
              var5 = 0;
              L0: while (true) {
                if (((bc) this).field_G.length > var5) {
                  var7[var5] = ((bc) this).field_G[var5];
                  var5++;
                  continue L0;
                } else {
                  ((bc) this).field_G = var11;
                  ((bc) this).field_G[param1] = param0;
                  return;
                }
              }
            } else {
              ((bc) this).field_G = var11;
              ((bc) this).field_G[param1] = param0;
              return;
            }
          } else {
            if (param1 >= ((bc) this).field_G.length) {
              var7 = new String[1 + param1];
              var10 = var7;
              var4 = var7;
              if (null != ((bc) this).field_G) {
                var5 = 0;
                L1: while (true) {
                  if (((bc) this).field_G.length > var5) {
                    var7[var5] = ((bc) this).field_G[var5];
                    var5++;
                    continue L1;
                  } else {
                    ((bc) this).field_G = var10;
                    ((bc) this).field_G[param1] = param0;
                    return;
                  }
                }
              } else {
                ((bc) this).field_G = var10;
                ((bc) this).field_G[param1] = param0;
                return;
              }
            } else {
              ((bc) this).field_G[param1] = param0;
              return;
            }
          }
        } else {
          wl discarded$9 = this.a(-40, false, -28);
          if (((bc) this).field_G != null) {
            if (param1 >= ((bc) this).field_G.length) {
              var7 = new String[1 + param1];
              var9 = var7;
              var4 = var7;
              if (null != ((bc) this).field_G) {
                var5 = 0;
                L2: while (true) {
                  if (((bc) this).field_G.length > var5) {
                    var7[var5] = ((bc) this).field_G[var5];
                    var5++;
                    continue L2;
                  } else {
                    ((bc) this).field_G = var9;
                    ((bc) this).field_G[param1] = param0;
                    return;
                  }
                }
              } else {
                ((bc) this).field_G = var9;
                ((bc) this).field_G[param1] = param0;
                return;
              }
            } else {
              ((bc) this).field_G[param1] = param0;
              return;
            }
          } else {
            L3: {
              var7 = new String[1 + param1];
              var8 = var7;
              var4 = var7;
              if (null != ((bc) this).field_G) {
                var5 = 0;
                L4: while (true) {
                  if (((bc) this).field_G.length <= var5) {
                    ((bc) this).field_G = var8;
                    break L3;
                  } else {
                    var7[var5] = ((bc) this).field_G[var5];
                    var5++;
                    continue L4;
                  }
                }
              } else {
                ((bc) this).field_G = var8;
                break L3;
              }
            }
            ((bc) this).field_G[param1] = param0;
            return;
          }
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl var4 = null;
        wl var4_ref = null;
        wl var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = (wl) (Object) ((bc) this).field_K.a(true);
        if (!param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4_ref = (wl) (Object) ((bc) this).field_K.f(2);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_j > param2) {
                      break L2;
                    } else {
                      if (var5.field_k > param0) {
                        break L2;
                      } else {
                        if (var5.field_l + var5.field_j <= param2) {
                          break L2;
                        } else {
                          if (var5.field_k + var5.field_h < param0) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_p;
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

    public static void e(boolean param0) {
        field_L = null;
        if (param0) {
          bc.e(true);
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        } else {
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        }
    }

    String b(int param0) {
        if (null != ((bc) this).field_I) {
          if (((bc) this).field_G != null) {
            if (param0 >= 121) {
              if (((bc) this).field_G.length <= ((bc) this).field_I.field_o) {
                return null;
              } else {
                return ((bc) this).field_G[((bc) this).field_I.field_o];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        if (param0) {
          L0: {
            bc.e(true);
            stackOut_4_0 = 10;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (param0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L0;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
          }
          return rk.a(stackIn_7_0, stackIn_7_1 != 0, param1, true);
        } else {
          stackOut_1_0 = 10;
          stackOut_1_1 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          return rk.a(stackIn_3_0, stackIn_3_1 != 0, param1, true);
        }
    }

    boolean a(byte param0, w param1) {
        if (param0 != 44) {
            Object var4 = null;
            boolean discarded$0 = bc.a(false, (CharSequence) null);
            return false;
        }
        return false;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -2) {
          String discarded$2 = ((bc) this).b(35);
          ((bc) this).a(((ub) (Object) ((bc) this).field_i).a(-13293, (w) this), param3, true, param1, param0);
          return;
        } else {
          ((bc) this).a(((ub) (Object) ((bc) this).field_i).a(-13293, (w) this), param3, true, param1, param0);
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        wl var6 = null;
        int var7 = 0;
        int var8 = 0;
        ub var9 = null;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var9 = (ub) (Object) ((bc) this).field_i;
          var6 = ((bc) this).field_I;
          if (var6 == null) {
            return;
          } else {
            var7 = var9.b((w) this, 102, param2);
            var8 = var9.a((w) this, 20340, param1);
            L0: while (true) {
              pk.a(var6.field_h + 2, -2 + (var8 + var6.field_k), var7 - -var6.field_j - 2, param0 ^ -116, var6.field_l + 2);
              var6 = var6.field_p;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    bc(String param0, rd param1) {
        super(param0, (vd) null);
        ((bc) this).field_I = null;
        ((bc) this).field_i = param1;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        ((bc) this).f(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
