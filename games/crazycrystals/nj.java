/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static ko field_c;
    String field_b;
    String[] field_o;
    int field_f;
    static int field_k;
    f field_a;
    private int field_d;
    nj field_n;
    dl field_l;
    boolean field_i;
    private int field_j;
    int field_g;
    static int field_e;
    private int field_h;
    private int field_m;

    final void b(int param0) {
        this.a(-25, 158);
        if (param0 > -33) {
            ((nj) this).field_m = -49;
        }
    }

    public static void a(int param0) {
        field_c = null;
    }

    private final void a(int param0, int param1) {
        wm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = CrazyCrystals.field_B;
        var3 = jf.a(72 + (param1 - -4), 486, 0, 534, param1 + 4);
        var4 = -126 % ((71 - param0) / 38);
        if (var3 == null) {
          return;
        } else {
          L0: {
            if (((nj) this).field_a != null) {
              ((nj) this).field_a.a(24, 35, 24, false, 24 + (param1 - -4), 486);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((nj) this).field_l != null) {
              param1 -= 2;
              ((nj) this).field_l.a(486, 12 + (param1 - -4));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var3.a((byte) -85);
            if (((nj) this).field_i) {
              L3: {
                L4: {
                  var5 = go.field_l.a(((nj) this).field_b);
                  var6 = ((nj) this).field_b.lastIndexOf(' ');
                  if (0 > var6) {
                    break L4;
                  } else {
                    if (96 >= var5) {
                      break L4;
                    } else {
                      var7_ref_String = ((nj) this).field_b.substring(0, var6);
                      var8 = ((nj) this).field_b.substring(var6 - -1);
                      var9 = go.field_l.a(var7_ref_String);
                      var10 = go.field_l.a(var8);
                      ih.a((byte) -20, var9, var7_ref_String, param1 + 35);
                      ih.a((byte) -20, var10, var8, 36 + param1 + 19);
                      break L3;
                    }
                  }
                }
                ih.a((byte) -20, var5, ((nj) this).field_b, 36 + (param1 + 9));
                break L3;
              }
              L5: {
                if (null != ((nj) this).field_l) {
                  param1 -= 12;
                  break L5;
                } else {
                  break L5;
                }
              }
              var12 = 0;
              var7 = var12;
              L6: while (true) {
                if (((nj) this).field_o.length <= var12) {
                  break L2;
                } else {
                  an.field_q.a(((nj) this).field_o[var12], 486, 4 + (4 + param1 + 72) + (12 - -(var12 * 12)), 8438015, -1);
                  var12++;
                  continue L6;
                }
              }
            } else {
              L7: {
                L8: {
                  var5 = go.field_l.a(((nj) this).field_b);
                  var6 = ((nj) this).field_b.lastIndexOf(' ');
                  if (var6 < 0) {
                    break L8;
                  } else {
                    if (go.field_l.a(((nj) this).field_b) > 96) {
                      var7_ref_String = ((nj) this).field_b.substring(0, var6);
                      var8 = var7_ref_String;
                      var7_ref_String = var8;
                      var8 = var7_ref_String;
                      var8 = ((nj) this).field_b.substring(1 + var6);
                      var9 = go.field_l.a(var7_ref_String);
                      if (var6 >= ((nj) this).field_h) {
                        L9: {
                          var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                          if ((((nj) this).field_d | ((nj) this).field_j) != 0) {
                            break L9;
                          } else {
                            if ((8 & ((nj) this).field_m) == 0) {
                              var7_ref_String = var7_ref_String + '_';
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 + 36));
                        break L7;
                      } else {
                        L10: {
                          var10 = go.field_l.a(var8);
                          var8 = var8.substring(0, -var6 + (((nj) this).field_h - 1));
                          if ((((nj) this).field_j | ((nj) this).field_d) != 0) {
                            break L10;
                          } else {
                            if ((((nj) this).field_m & 8) != 0) {
                              break L10;
                            } else {
                              var8 = var8 + '_';
                              var7_ref_String = var8;
                              var7_ref_String = var8;
                              break L10;
                            }
                          }
                        }
                        ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 - -36));
                        ih.a((byte) -20, var10, var8, 15 + (param1 + 40));
                        break L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L11: {
                  var7_ref_String = ((nj) this).field_b;
                  var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                  if ((((nj) this).field_d | ((nj) this).field_j) != -1) {
                    break L11;
                  } else {
                    if (-1 == (8 & ((nj) this).field_m)) {
                      var7_ref_String = var7_ref_String + '_';
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                ih.a((byte) -20, var5, var7_ref_String, 41 + (param1 - -4));
                break L7;
              }
              L12: {
                if (((nj) this).field_l == null) {
                  break L12;
                } else {
                  param1 -= 12;
                  break L12;
                }
              }
              var7 = 0;
              L13: while (true) {
                if (var7 >= ((nj) this).field_d) {
                  L14: {
                    var7_ref_String = ((nj) this).field_o[((nj) this).field_d].substring(0, ((nj) this).field_j);
                    if (0 == (((nj) this).field_d | ((nj) this).field_j)) {
                      break L14;
                    } else {
                      if (0 == ((nj) this).field_g) {
                        break L14;
                      } else {
                        if ((8 & ((nj) this).field_m) != 0) {
                          break L14;
                        } else {
                          var7_ref_String = var7_ref_String + '_';
                          break L14;
                        }
                      }
                    }
                  }
                  an.field_q.a(var7_ref_String, 486, 12 * ((nj) this).field_d + (param1 + 92), 8438015, -1);
                  break L2;
                } else {
                  an.field_q.a(((nj) this).field_o[var7], 486, var7 * 12 + (72 + param1 + 4) + 16, 8438015, -1);
                  var7++;
                  continue L13;
                }
              }
            }
          }
          L15: {
            if (((nj) this).field_n == null) {
              break L15;
            } else {
              L16: {
                if (((nj) this).field_i) {
                  break L16;
                } else {
                  if (0 == ((nj) this).field_g) {
                    break L16;
                  } else {
                    break L15;
                  }
                }
              }
              ((nj) this).field_n.a(121, ((nj) this).field_o.length * 12 + 12 + (4 + param1) + 58);
              break L15;
            }
          }
          return;
        }
    }

    final static double[] a(int param0, int param1, int param2) {
        int var3 = (tm.field_d[0].length - 2 * param2) * 48;
        int var4 = 48 * (tm.field_d.length + -(2 * param1));
        int var5 = var3 >= var4 ? var3 : var4;
        double var6 = (double)(param2 * 48) + (double)var3 * 0.5;
        double var8 = (double)(48 * param1) + (double)var4 * 0.5;
        double var10 = 24.0;
        if (!(var5 <= 480)) {
            var10 = 480.0 * var10 / (double)var5;
            var6 = var10 * var6 / 24.0;
            var8 = var8 * var10 / 24.0;
        }
        return new double[]{var6, var8, var10};
    }

    private final boolean a() {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        var3 = CrazyCrystals.field_B;
        ((nj) this).field_m = 1 + ((nj) this).field_m & 15;
        if (((nj) this).field_g <= 0) {
          if (((nj) this).field_n == null) {
            return false;
          } else {
            ((nj) this).field_f = ((nj) this).field_f - ((nj) this).field_n.field_f;
            int discarded$1 = 71;
            var2 = ((nj) this).field_n.a() ? 1 : 0;
            ((nj) this).field_f = ((nj) this).field_f + ((nj) this).field_n.field_f;
            return var2 != 0;
          }
        } else {
          L0: {
            ((nj) this).field_g = ((nj) this).field_g - 1;
            if (((nj) this).field_g != 0) {
              break L0;
            } else {
              if (~((nj) this).field_h > ~((nj) this).field_b.length()) {
                L1: {
                  ((nj) this).field_h = ((nj) this).field_h + 1;
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (((nj) this).field_h != ((nj) this).field_b.length()) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 4;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L1;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 30;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L1;
                  }
                }
                ((nj) this).field_g = stackIn_15_1;
                break L0;
              } else {
                if (~((nj) this).field_o.length >= ~((nj) this).field_d) {
                  break L0;
                } else {
                  if (((nj) this).field_j >= ((nj) this).field_o[((nj) this).field_d].length()) {
                    if (((nj) this).field_o.length + -1 > ((nj) this).field_d) {
                      ((nj) this).field_j = 0;
                      ((nj) this).field_d = ((nj) this).field_d + 1;
                      ((nj) this).field_g = 2;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    L2: {
                      if (((nj) this).field_o[((nj) this).field_d].charAt(((nj) this).field_j) != 60) {
                        ((nj) this).field_j = ((nj) this).field_j + 1;
                        break L2;
                      } else {
                        ((nj) this).field_j = ((nj) this).field_o[((nj) this).field_d].indexOf('>', ((nj) this).field_j + 1) + 1;
                        break L2;
                      }
                    }
                    ((nj) this).field_g = 2;
                    ((nj) this).field_f = ((nj) this).field_f + 1;
                    return true;
                  }
                }
              }
            }
          }
          return true;
        }
    }

    final nj b(byte param0) {
        if (0 < ((nj) this).field_g) {
            if (!((nj) this).field_i) {
                ((nj) this).field_i = true;
                if (null != ((nj) this).field_n) {
                    nj discarded$0 = ((nj) this).field_n.b((byte) -112);
                }
                return (nj) this;
            }
        }
        if (param0 > -91) {
            ((nj) this).field_i = true;
        }
        if (null == ((nj) this).field_n) {
            return null;
        }
        ((nj) this).field_n = ((nj) this).field_n.b((byte) -105);
        if (null == ((nj) this).field_n) {
            return null;
        }
        return (nj) this;
    }

    final nj c(int param0) {
        if (!(null == ((nj) this).field_a)) {
            Object var3 = null;
            ((nj) this).field_a.b(57, 0, (f[][]) null, 0);
        }
        if (param0 != -28530) {
            return null;
        }
        int discarded$0 = 71;
        if (this.a()) {
            return (nj) this;
        }
        ((nj) this).field_f = ((nj) this).field_f - 1;
        if (((nj) this).field_f == 0) {
            return null;
        }
        return (nj) this;
    }

    nj(f param0, String param1, String[] param2) {
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        try {
            ((nj) this).field_b = param1;
            ((nj) this).field_a = param0;
            ((nj) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nj(dl param0, String param1, String param2) {
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        try {
            ((nj) this).field_l = param0;
            ((nj) this).field_b = param1;
            ((nj) this).field_o = rn.a(param2, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
