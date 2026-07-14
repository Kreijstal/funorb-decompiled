/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static hj field_b;
    int field_c;
    int field_a;

    final static void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, byte[] param3, n param4, int param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = EscapeVector.field_A;
          var7 = am.a((byte) 57, param5);
          if (null != ae.field_d) {
            break L0;
          } else {
            ae.field_d = new java.security.SecureRandom();
            break L0;
          }
        }
        L1: {
          var15 = new int[4];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var8 = var12;
          if (!param1) {
            break L1;
          } else {
            gb.b(43);
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (-5 >= (var9 ^ -1)) {
            if (null == kf.field_r) {
              kf.field_r = new n(var7);
              kf.field_r.field_m = 0;
              kf.field_r.a(param5, (byte) 21, param6, param3);
              kf.field_r.g(-1, var7);
              kf.field_r.a(1527987844, var15);
              if (null != oj.field_L) {
                if (100 <= oj.field_L.field_g.length) {
                  oj.field_L.field_m = 0;
                  oj.field_L.f(10, -123);
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      oj.field_L.h(48, param5);
                      oj.field_L.a((byte) -94, param0, param2);
                      param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                      param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                      return;
                    } else {
                      oj.field_L.a((byte) 127, var15[var11]);
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  oj.field_L = new n(100);
                  oj.field_L.field_m = 0;
                  oj.field_L.f(10, -123);
                  var11 = 0;
                  var9 = var11;
                  L4: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      oj.field_L.h(48, param5);
                      oj.field_L.a((byte) -94, param0, param2);
                      param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                      param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                      return;
                    } else {
                      oj.field_L.a((byte) 127, var15[var11]);
                      var11++;
                      continue L4;
                    }
                  }
                }
              } else {
                oj.field_L = new n(100);
                oj.field_L.field_m = 0;
                oj.field_L.f(10, -123);
                var11 = 0;
                var9 = var11;
                L5: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    oj.field_L.h(48, param5);
                    oj.field_L.a((byte) -94, param0, param2);
                    param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                    param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                    return;
                  } else {
                    oj.field_L.a((byte) 127, var15[var11]);
                    var11++;
                    continue L5;
                  }
                }
              }
            } else {
              if (var7 > kf.field_r.field_g.length) {
                kf.field_r = new n(var7);
                kf.field_r.field_m = 0;
                kf.field_r.a(param5, (byte) 21, param6, param3);
                kf.field_r.g(-1, var7);
                kf.field_r.a(1527987844, var15);
                if (null == oj.field_L) {
                  oj.field_L = new n(100);
                  oj.field_L.field_m = 0;
                  oj.field_L.f(10, -123);
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      oj.field_L.h(48, param5);
                      oj.field_L.a((byte) -94, param0, param2);
                      param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                      param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                      return;
                    } else {
                      oj.field_L.a((byte) 127, var15[var11]);
                      var11++;
                      continue L6;
                    }
                  }
                } else {
                  if (100 > oj.field_L.field_g.length) {
                    oj.field_L = new n(100);
                    oj.field_L.field_m = 0;
                    oj.field_L.f(10, -123);
                    var11 = 0;
                    var9 = var11;
                    L7: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        oj.field_L.h(48, param5);
                        oj.field_L.a((byte) -94, param0, param2);
                        param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                        param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                        return;
                      } else {
                        oj.field_L.a((byte) 127, var15[var11]);
                        var11++;
                        continue L7;
                      }
                    }
                  } else {
                    oj.field_L.field_m = 0;
                    oj.field_L.f(10, -123);
                    var11 = 0;
                    var9 = var11;
                    L8: while (true) {
                      if (-5 >= (var11 ^ -1)) {
                        oj.field_L.h(48, param5);
                        oj.field_L.a((byte) -94, param0, param2);
                        param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                        param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                        return;
                      } else {
                        oj.field_L.a((byte) 127, var15[var11]);
                        var11++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                kf.field_r.field_m = 0;
                kf.field_r.a(param5, (byte) 21, param6, param3);
                kf.field_r.g(-1, var7);
                kf.field_r.a(1527987844, var15);
                if (null == oj.field_L) {
                  oj.field_L = new n(100);
                  oj.field_L.field_m = 0;
                  oj.field_L.f(10, -123);
                  var11 = 0;
                  var9 = var11;
                  L9: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      oj.field_L.h(48, param5);
                      oj.field_L.a((byte) -94, param0, param2);
                      param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                      param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                      return;
                    } else {
                      oj.field_L.a((byte) 127, var15[var11]);
                      var11++;
                      continue L9;
                    }
                  }
                } else {
                  L10: {
                    if (100 <= oj.field_L.field_g.length) {
                      oj.field_L.field_m = 0;
                      oj.field_L.f(10, -123);
                      var11 = 0;
                      var9 = var11;
                      break L10;
                    } else {
                      oj.field_L = new n(100);
                      oj.field_L.field_m = 0;
                      oj.field_L.f(10, -123);
                      var11 = 0;
                      var9 = var11;
                      break L10;
                    }
                  }
                  L11: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      oj.field_L.h(48, param5);
                      oj.field_L.a((byte) -94, param0, param2);
                      param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                      param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                      return;
                    } else {
                      oj.field_L.a((byte) 127, var15[var11]);
                      var11++;
                      continue L11;
                    }
                  }
                }
              }
            }
          } else {
            var8[var9] = ae.field_d.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    final gb a(int param0) {
        if (param0 != 10) {
          ((gb) this).field_c = 110;
          return new gb(((gb) this).field_a, ((gb) this).field_c);
        } else {
          return new gb(((gb) this).field_a, ((gb) this).field_c);
        }
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (fc.field_a < 10) {
          L0: {
            var3 = 0;
            if (!rh.field_H) {
              break L0;
            } else {
              rh.field_H = false;
              var3 = 1;
              break L0;
            }
          }
          rh.a((byte) 9, var3 != 0, wi.field_f, qe.a(-111), le.b(1));
          if (param1 != 92) {
            gb.b(90);
            return;
          } else {
            return;
          }
        } else {
          if (!jf.l(param1 + -89)) {
            em.d();
            em.d();
            em.d();
            ok.a(240, 320, param1 ^ 72);
            nn.a(param2, 0, -1, 0);
            if (param1 != 92) {
              gb.b(90);
              return;
            } else {
              return;
            }
          } else {
            if (ff.field_e != 0) {
              ah.a(param2, 0);
              if (param1 == 92) {
                return;
              } else {
                gb.b(90);
                return;
              }
            } else {
              wc.a(param0, 1983, false);
              nn.a(param2, 0, -1, 0);
              if (param1 == 92) {
                return;
              } else {
                gb.b(90);
                return;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -5) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (240 <= param0) {
          if (param0 > -401) {
            L0: {
              if (param1 < 262) {
                break L0;
              } else {
                if (289 <= param1) {
                  break L0;
                } else {
                  return 0;
                }
              }
            }
            if (param2 == 8158) {
              L1: {
                if (-281 > param0) {
                  break L1;
                } else {
                  if (360 <= param0) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) > -333) {
                      break L1;
                    } else {
                      if ((param1 ^ -1) <= -360) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return -1;
            } else {
              field_b = null;
              if (-281 >= (param0 ^ -1)) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if (param1 > -360) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param2 == 8158) {
              if (-281 <= param0) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if ((param1 ^ -1) <= -360) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              field_b = null;
              if (-281 <= param0) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if (param1 <= -360) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          if (param2 == 8158) {
            if (-281 <= param0) {
              if (360 > param0) {
                if ((param1 ^ -1) <= -333) {
                  if ((param1 ^ -1) > -360) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            field_b = null;
            if (-281 >= (param0 ^ -1)) {
              if (360 > param0) {
                if ((param1 ^ -1) <= -333) {
                  if (param1 > -360) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    gb(int param0, int param1) {
        ((gb) this).field_a = param0;
        ((gb) this).field_c = param1;
    }

    static {
    }
}
