/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static int field_d;
    static String field_c;
    static boolean field_b;
    static ud[] field_a;

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        if (cf.field_q >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (cf.field_q < 75) {
              var5 = (cf.field_q << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (cf.field_q <= 200) {
              break L1;
            } else {
              var5 = (250 - cf.field_q << 8) / 50;
              break L1;
            }
          }
          L2: {
            hf.a(kj.field_p, -1);
            li.c();
            tc.c();
            td.a((byte) -111);
            if (var5 < 256) {
              tc.c(0, 0, tc.field_j, tc.field_c, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          int discarded$1 = -10;
          dm.b();
          if (cf.field_q >= 150) {
            w.field_c.d(15 + var3, 10 + var4, var5);
            var6 = -125 + cf.field_q;
            if (var6 > 0) {
              if (50 > var6) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    L3: {
                      var7 = 256 * (-var6 + 50) / 20;
                      wj.field_o.b(var3, var4, var7);
                      var6 = -140 + cf.field_q;
                      if (var6 > 0) {
                        L4: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L4;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L4;
                          }
                        }
                        kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      wj.field_o.b(var3, var4, 256);
                      var6 = -140 + cf.field_q;
                      if (var6 > 0) {
                        L6: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L6;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L6;
                          }
                        }
                        kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var7 = var6 * 256 / 20;
                    wj.field_o.b(var3, var4, var7);
                    var6 = -140 + cf.field_q;
                    if (var6 > 0) {
                      L8: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L8;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L8;
                        }
                      }
                      kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var6 = -140 + cf.field_q;
                  if (var6 > 0) {
                    L10: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L10;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L10;
                      }
                    }
                    kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var6 = -140 + cf.field_q;
                if (var6 > 0) {
                  L12: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L12;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L12;
                    }
                  }
                  kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            kj.field_p.c(var3, var4);
            var6 = -125 + cf.field_q;
            if (var6 > 0) {
              if (50 > var6) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    L13: {
                      var7 = 256 * (-var6 + 50) / 20;
                      wj.field_o.b(var3, var4, var7);
                      var6 = -140 + cf.field_q;
                      if (var6 > 0) {
                        L14: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L14;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L14;
                          }
                        }
                        kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      wj.field_o.b(var3, var4, 256);
                      var6 = -140 + cf.field_q;
                      if (var6 > 0) {
                        L16: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L16;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L16;
                          }
                        }
                        kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    var7 = var6 * 256 / 20;
                    wj.field_o.b(var3, var4, var7);
                    var6 = -140 + cf.field_q;
                    if (var6 > 0) {
                      L18: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L18;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L18;
                        }
                      }
                      kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  var6 = -140 + cf.field_q;
                  if (var6 > 0) {
                    L20: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L20;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L20;
                      }
                    }
                    kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var6 = -140 + cf.field_q;
                if (var6 > 0) {
                  L22: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L22;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L22;
                    }
                  }
                  kh.field_l.d(var3 + 15, var4 - -10, var5 * var7 >> 8);
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, hj param1) {
        try {
            int discarded$2 = 32381;
            ok.a();
            if (param0 > -44) {
                vb.a(51);
            }
            param1.f();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vb.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          if (!dg.a((byte) -68, param1)) {
            if (param1 != 45) {
              if (param1 != 160) {
                if (param1 != 32) {
                  if (param1 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -1) {
            field_d = 13;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Select Course Type";
    }
}
