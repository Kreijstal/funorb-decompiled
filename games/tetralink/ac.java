/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static boolean field_e;
    static ma field_a;
    static int[] field_b;
    static String field_d;
    static oh field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 < -90) {
          if (param1 < 65) {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ac.a(107, -51, false, 107);
          if (param1 >= 65) {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 == -19403) {
          if (fn.field_R >= 10) {
            if (13 > vd.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$6 = ac.a((byte) 73, '~');
          if (fn.field_R >= 10) {
            if (13 > vd.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          hd.field_v = 0;
          ed.field_O = param0;
          pf.field_d = param3;
          if (qb.a(ed.field_O, (byte) 114)) {
            var4 = 0;
            kk.field_X[ed.field_O].b(param2, var4, -1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > -64) {
          return;
        } else {
          L1: {
            if (ed.field_O != -4) {
              break L1;
            } else {
              cl.field_g = 2;
              im.field_e = 3.1415927410125732f;
              ok.field_d = 84.0f;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -88) {
            return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, byte[] param1, int param2, bh param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var11 = TetraLink.field_J;
          var7 = k.a(false, param2);
          var9 = -127 / ((param0 - 47) / 35);
          if (null == re.field_R) {
            re.field_R = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var16 = new int[4];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var8 = var13;
        var10 = 0;
        L1: while (true) {
          if (4 <= var10) {
            if (null == ug.field_hb) {
              ug.field_hb = new bh(var7);
              ug.field_hb.field_t = 0;
              ug.field_hb.a(param4, 128, param1, param2);
              ug.field_hb.b((byte) -71, var7);
              ug.field_hb.a(10830, var16);
              if (null == ce.field_f) {
                ce.field_f = new bh(100);
                ce.field_f.field_t = 0;
                ce.field_f.a(10, false);
                var12 = 0;
                var10 = var12;
                L2: while (true) {
                  if (4 <= var12) {
                    ce.field_f.b(param2, false);
                    ce.field_f.a(param5, param6, -25035);
                    param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                    param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                    return;
                  } else {
                    ce.field_f.d(var16[var12], (byte) -124);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (100 <= ce.field_f.field_u.length) {
                    ce.field_f.field_t = 0;
                    ce.field_f.a(10, false);
                    var12 = 0;
                    var10 = var12;
                    break L3;
                  } else {
                    ce.field_f = new bh(100);
                    ce.field_f.field_t = 0;
                    ce.field_f.a(10, false);
                    var12 = 0;
                    var10 = var12;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (4 <= var12) {
                    ce.field_f.b(param2, false);
                    ce.field_f.a(param5, param6, -25035);
                    param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                    param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                    return;
                  } else {
                    ce.field_f.d(var16[var12], (byte) -124);
                    var12++;
                    continue L4;
                  }
                }
              }
            } else {
              if (var7 <= ug.field_hb.field_u.length) {
                ug.field_hb.field_t = 0;
                ug.field_hb.a(param4, 128, param1, param2);
                ug.field_hb.b((byte) -71, var7);
                ug.field_hb.a(10830, var16);
                if (null == ce.field_f) {
                  ce.field_f = new bh(100);
                  ce.field_f.field_t = 0;
                  ce.field_f.a(10, false);
                  var12 = 0;
                  var10 = var12;
                  L5: while (true) {
                    if (4 <= var12) {
                      ce.field_f.b(param2, false);
                      ce.field_f.a(param5, param6, -25035);
                      param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                      param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                      return;
                    } else {
                      ce.field_f.d(var16[var12], (byte) -124);
                      var12++;
                      continue L5;
                    }
                  }
                } else {
                  L6: {
                    if (100 <= ce.field_f.field_u.length) {
                      break L6;
                    } else {
                      ce.field_f = new bh(100);
                      break L6;
                    }
                  }
                  ce.field_f.field_t = 0;
                  ce.field_f.a(10, false);
                  var12 = 0;
                  var10 = var12;
                  L7: while (true) {
                    if (4 <= var12) {
                      ce.field_f.b(param2, false);
                      ce.field_f.a(param5, param6, -25035);
                      param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                      param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                      return;
                    } else {
                      ce.field_f.d(var16[var12], (byte) -124);
                      var12++;
                      continue L7;
                    }
                  }
                }
              } else {
                ug.field_hb = new bh(var7);
                ug.field_hb.field_t = 0;
                ug.field_hb.a(param4, 128, param1, param2);
                ug.field_hb.b((byte) -71, var7);
                ug.field_hb.a(10830, var16);
                if (null != ce.field_f) {
                  if (100 <= ce.field_f.field_u.length) {
                    ce.field_f.field_t = 0;
                    ce.field_f.a(10, false);
                    var12 = 0;
                    var10 = var12;
                    L8: while (true) {
                      if (4 <= var12) {
                        ce.field_f.b(param2, false);
                        ce.field_f.a(param5, param6, -25035);
                        param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                        param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                        return;
                      } else {
                        ce.field_f.d(var16[var12], (byte) -124);
                        var12++;
                        continue L8;
                      }
                    }
                  } else {
                    ce.field_f = new bh(100);
                    ce.field_f.field_t = 0;
                    ce.field_f.a(10, false);
                    var12 = 0;
                    var10 = var12;
                    L9: while (true) {
                      if (4 <= var12) {
                        ce.field_f.b(param2, false);
                        ce.field_f.a(param5, param6, -25035);
                        param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                        param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                        return;
                      } else {
                        ce.field_f.d(var16[var12], (byte) -124);
                        var12++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  ce.field_f = new bh(100);
                  ce.field_f.field_t = 0;
                  ce.field_f.a(10, false);
                  var12 = 0;
                  var10 = var12;
                  L10: while (true) {
                    if (4 <= var12) {
                      ce.field_f.b(param2, false);
                      ce.field_f.a(param5, param6, -25035);
                      param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
                      param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
                      return;
                    } else {
                      ce.field_f.d(var16[var12], (byte) -124);
                      var12++;
                      continue L10;
                    }
                  }
                }
              }
            }
          } else {
            var8[var10] = re.field_R.nextInt();
            var10++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
