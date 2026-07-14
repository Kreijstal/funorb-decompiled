/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg extends kd {
    static boolean field_H;
    static int field_G;
    static String field_F;
    static wk[] field_C;
    int field_z;
    static int field_y;
    static String field_E;
    static String field_D;
    static byte[][] field_A;

    final static void c(byte param0) {
        if (param0 <= 56) {
            field_E = null;
        }
        si.field_p = !si.field_p ? true : false;
        ti.field_A[41] = !si.field_p ? fm.field_h : hf.field_b;
        if (si.field_p) {
            if (fk.field_i != null) {
                if (null != fk.field_i.field_C) {
                    fk.field_i.field_V = -(fk.field_i.field_C.field_Gb >> 1335201924) + fk.field_i.field_E - 3200;
                    fk.field_i.field_p = -(fk.field_i.field_C.field_hc >> -1662392220) + (fk.field_i.field_P + 5120);
                }
            }
        }
    }

    final static int a(byte param0, boolean param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          if (2 > param2) {
            break L0;
          } else {
            if (param2 <= 36) {
              L1: {
                var4 = 0;
                var5 = 0;
                if (param0 > 35) {
                  break L1;
                } else {
                  field_F = null;
                  break L1;
                }
              }
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L3;
                    } else {
                      if (45 == var9) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param2) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * param2;
                    if (var10 / param2 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    abstract boolean h(int param0);

    final static void a(na param0, int param1) {
        int var2 = 0;
        na var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        if (null == param0.field_o) {
          return;
        } else {
          L0: {
            L1: {
              if (-1 != (param0.field_w ^ -1)) {
                break L1;
              } else {
                if (param0.field_n == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= uc.field_a) {
                break L0;
              } else {
                var3 = ph.field_e[var2];
                if (-3 == (var3.field_k ^ -1)) {
                  if (var3.field_w == param0.field_w) {
                    if (param0.field_n == var3.field_n) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null == param0.field_l) {
              break L3;
            } else {
              dh.field_B = param0.field_k;
              f.field_x = param0.field_p;
              se.field_b = param0.field_j;
              pa.field_h = param0.field_l;
              break L3;
            }
          }
          L4: {
            tf.a(param0, (byte) -115);
            if (param1 < -61) {
              break L4;
            } else {
              field_C = null;
              break L4;
            }
          }
          return;
        }
    }

    final static String a(String param0, int param1, byte param2, mi param3) {
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          if (param2 == -45) {
            break L0;
          } else {
            bg.a((wk) null, (mb) null, 56);
            break L0;
          }
        }
        L1: {
          if (param0 == null) {
            break L1;
          } else {
            if (param3.c(param0) > param1) {
              L2: while (true) {
                if ((param0.length() ^ -1) >= -1) {
                  return param0;
                } else {
                  param0 = param0.substring(0, param0.length() + -1);
                  var4 = param0 + "...";
                  if (param1 < param3.c(var4)) {
                    continue L2;
                  } else {
                    return var4;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        return param0;
    }

    abstract Object d(byte param0);

    bg(int param0) {
        ((bg) this).field_z = param0;
    }

    public static void g(int param0) {
        field_A = null;
        field_D = null;
        field_E = null;
        field_F = null;
        field_C = null;
        if (param0 != -1008) {
            int discarded$0 = bg.a((byte) -111, true, -42, (CharSequence) null);
        }
    }

    final static void a(wk param0, mb param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          var3 = 0;
          if (param2 == 14590) {
            break L0;
          } else {
            bg.c((byte) -71);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= param0.field_B) {
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (param0.field_z <= var5) {
                var3 = var3 + param0.field_z;
                var4++;
                continue L1;
              } else {
                var6 = param0.field_E[var3 + var5];
                if (var6 >> -630675000 == (var6 & 65535)) {
                  var7 = param1.d((byte) -102);
                  var8 = var6 & 255;
                  if (-65 > (var8 ^ -1)) {
                    param0.field_E[var5 - -var3] = (ec.a(16711720, var8 * ec.a(var7, 65280)) >> -659691448) + ec.a(ec.a(16711935, var7) * var8 >> -640325848, 16711935);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var7 = var6 & 255;
                  var7 = var7 / 2;
                  if ((var7 ^ -1) < -33) {
                    param0.field_E[var5 - -var3] = var7 * param1.field_ic;
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Kick <%0> from this game";
        field_G = 1;
        field_D = "Get access to new modules by expending solarite cubes on engineering. Until you engineer a module, it cannot be equipped on a sentinel.";
        field_A = new byte[250][];
    }
}
