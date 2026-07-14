/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends qf {
    static boolean field_l;
    static String field_k;
    private fe field_m;
    private fe field_n;
    static boolean field_j;

    cc(fe param0, fe param1, fe param2) {
        super(param0);
        ((cc) this).field_m = param1;
        ((cc) this).field_n = param2;
    }

    final p a(String param0, int param1) {
        if (param1 != -26188) {
            field_j = true;
        }
        String var3 = ((cc) this).field_m.field_k.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return sb.field_n;
        }
        if (!(kb.a(var3, var4, -28169))) {
            return sb.field_n;
        }
        if (!(!this.a(5, param0))) {
            return sb.field_n;
        }
        return bf.field_x;
    }

    final String a(String param0, boolean param1) {
        String var3 = ((cc) this).field_m.field_k.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        if (param1) {
            field_k = null;
        }
        String var5 = var4;
        if (md.a(-1, var5)) {
            return eb.field_g;
        }
        if (la.a((byte) 96, var5)) {
            return wc.field_e;
        }
        if (nc.a(-68, var5)) {
            return rg.field_K;
        }
        if (this.a(5, param0)) {
            return vh.field_s;
        }
        if (var3.length() <= 0) {
            return nc.field_a;
        }
        if (k.a(19272, var5, var3)) {
            return fa.field_t;
        }
        if (!(!ia.a(var5, (byte) -16, var3))) {
            return pc.field_c;
        }
        if (bj.a(var5, var3, true)) {
            return fa.field_t;
        }
        return eb.field_g;
    }

    private final boolean a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param0 != 5) {
            Object var8 = null;
            boolean discarded$0 = this.a(87, (String) null);
        }
        String var9 = ((cc) this).field_n.field_k.toLowerCase();
        String var4 = param1.toLowerCase();
        if (-1 > (var9.length() ^ -1)) {
            if (0 < var4.length()) {
                var5 = var9.lastIndexOf("@");
                if ((var5 ^ -1) <= -1) {
                    if (var9.length() + -1 <= var5) {
                        return false;
                    }
                    var6 = var9.substring(0, var5);
                    var7 = var9.substring(1 + var5);
                    if (!(var4.indexOf(var6) > -1)) {
                        return true;
                    }
                    return -1 > var4.indexOf(var7) ? false : true;
                }
            }
        }
        return false;
    }

    public static void e(byte param0) {
        if (param0 > -53) {
            return;
        }
        field_k = null;
    }

    final static int a(CharSequence param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param3 <= -48) {
          L0: {
            if (-3 < param1) {
              break L0;
            } else {
              if (-37 < param1) {
                break L0;
              } else {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param0.length();
                var8 = 0;
                L1: while (true) {
                  if (var7 <= var8) {
                    if (var5 == 0) {
                      throw new NumberFormatException();
                    } else {
                      return var6;
                    }
                  } else {
                    L2: {
                      var9 = param0.charAt(var8);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (45 == var9) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (57 >= var9) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param1) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var9 + var6 * param1;
                      if (var10 / param1 != var6) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            }
          }
          throw new IllegalArgumentException("" + param1);
        } else {
          return -112;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          if (param0 == 20755) {
            break L0;
          } else {
            var6 = null;
            String discarded$2 = cc.a(103, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          var2 = param1.length();
          if (var2 > 20) {
            var2 = 20;
            break L1;
          } else {
            break L1;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L2: while (true) {
          if (var2 <= var4) {
            return new String(var8);
          } else {
            L3: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(97 + (-65 + var5));
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (48 > var5) {
                  break L6;
                } else {
                  if (57 >= var5) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    final static hl[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        hl[] var10 = null;
        hl[] var11_ref_hl__ = null;
        int var11 = 0;
        int var12 = 0;
        hl var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = StarCannon.field_A;
        var9 = param7 + (param0 - -param2);
        var10 = new hl[]{new hl(var9, var9), new hl(param6, var9), new hl(var9, var9), new hl(var9, param6), new hl(64, 64), new hl(var9, param6), new hl(var9, var9), new hl(param6, var9), new hl(var9, var9)};
        var11_ref_hl__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_hl__.length) {
            var10 = var11_ref_hl__;
            var11 = 0;
            L1: while (true) {
              if (param0 <= var11) {
                if (param4 == 3) {
                  var11 = 0;
                  L2: while (true) {
                    if (param0 <= var11) {
                      var11 = 0;
                      L3: while (true) {
                        if (param6 <= var11) {
                          var11 = 0;
                          L4: while (true) {
                            if (param6 >> 1543348353 <= var11) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (param2 <= var12) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_B[var11 + param6 * (-var12 + (var9 - 1))] = param1;
                                  var10[3].field_B[var9 * var11 - var12 - 1 - -var9] = param1;
                                  var10[7].field_B[var11 + var12 * param6] = param1;
                                  var10[5].field_B[var9 * var11 + var12] = param1;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = 0;
                          L6: while (true) {
                            if (param0 <= var12) {
                              var11++;
                              continue L3;
                            } else {
                              var10[7].field_B[(-var12 + (var9 - 1)) * param6 - -var11] = param3;
                              var10[5].field_B[var9 + (-1 - var12 + var11 * var9)] = param3;
                              var10[1].field_B[param6 * var12 - -var11] = param8;
                              var10[3].field_B[var11 * var9 - -var12] = param8;
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = 0;
                      L7: while (true) {
                        if (var12 >= var9) {
                          var11++;
                          continue L2;
                        } else {
                          var10[0].field_B[var12 + var9 * var11] = param8;
                          var10[0].field_B[var9 * var12 - -var11] = param8;
                          if (var9 - var11 > var12) {
                            var10[2].field_B[var9 * var11 + var12] = param8;
                            var10[6].field_B[var11 + var9 * var12] = param8;
                            var12++;
                            continue L7;
                          } else {
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[(-var11 + (var9 + -1)) * var9 + var12] = param3;
                    var10[8].field_B[var12 + (-1 + (-var11 + var9)) * var9] = param3;
                    var10[2].field_B[-var11 - -var9 - (1 - var12 * var9)] = param3;
                    var10[8].field_B[-var11 - -var9 + (-1 + var9 * var12)] = param3;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_hl__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param5;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_k = "ARROW KEYS    Fly Ship";
    }
}
