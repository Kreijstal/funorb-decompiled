/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static iw field_b;
    static int[][] field_a;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static ki a(byte param0, int param1) {
        int var2 = 0;
        var2 = 39 % ((param0 - -45) / 59);
        if (sn.field_d == null) {
          if (-1 == param1) {
            return sn.field_d;
          } else {
            return ng.a(1, -101, true, param1, false, true);
          }
        } else {
          return sn.field_d;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (0 > td.field_u) {
          return;
        } else {
          L0: {
            var3 = -135 + param1;
            var4 = -35 + param0;
            var5 = param2;
            if (75 > td.field_u) {
              var5 = (td.field_u << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (td.field_u <= 200) {
              break L1;
            } else {
              var5 = (250 - td.field_u << 8) / 50;
              break L1;
            }
          }
          L2: {
            jq.a(7161, sn.field_a);
            nk.b();
            lk.b();
            ok.b(param2);
            if (256 > var5) {
              lk.b(0, 0, lk.field_b, lk.field_c, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          su.a((byte) -69);
          if (td.field_u < 150) {
            sn.field_a.b(var3, var4);
            var6 = td.field_u + -125;
            if (var6 > 0) {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (var6 >= 30) {
                    L3: {
                      var7 = (12800 + -(256 * var6)) / 20;
                      eh.field_b.d(var3, var4, var7);
                      var6 = td.field_u + -140;
                      if (0 >= var6) {
                        break L3;
                      } else {
                        L4: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L4;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L4;
                          }
                        }
                        mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      eh.field_b.d(var3, var4, 256);
                      var6 = td.field_u + -140;
                      if (0 >= var6) {
                        break L5;
                      } else {
                        L6: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L6;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L6;
                          }
                        }
                        mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var7 = var6 * 256 / 20;
                    eh.field_b.d(var3, var4, var7);
                    var6 = td.field_u + -140;
                    if (0 >= var6) {
                      break L7;
                    } else {
                      L8: {
                        var7 = 256;
                        if (20 <= var6) {
                          break L8;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L8;
                        }
                      }
                      mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var6 = td.field_u + -140;
                  if (0 >= var6) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if (20 <= var6) {
                        break L10;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L10;
                      }
                    }
                    mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var6 = td.field_u + -140;
                if (0 >= var6) {
                  break L11;
                } else {
                  L12: {
                    var7 = 256;
                    if (20 <= var6) {
                      break L12;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L12;
                    }
                  }
                  mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                  break L11;
                }
              }
              return;
            }
          } else {
            kh.field_a.a(var3 - -15, 10 + var4, var5);
            var6 = td.field_u + -125;
            if (var6 > 0) {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (var6 >= 30) {
                    L13: {
                      var7 = (12800 + -(256 * var6)) / 20;
                      eh.field_b.d(var3, var4, var7);
                      var6 = td.field_u + -140;
                      if (0 >= var6) {
                        break L13;
                      } else {
                        L14: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L14;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L14;
                          }
                        }
                        mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      eh.field_b.d(var3, var4, 256);
                      var6 = td.field_u + -140;
                      if (0 >= var6) {
                        break L15;
                      } else {
                        L16: {
                          var7 = 256;
                          if (20 <= var6) {
                            break L16;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L16;
                          }
                        }
                        mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    var7 = var6 * 256 / 20;
                    eh.field_b.d(var3, var4, var7);
                    var6 = td.field_u + -140;
                    if (0 >= var6) {
                      break L17;
                    } else {
                      L18: {
                        var7 = 256;
                        if (20 <= var6) {
                          break L18;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L18;
                        }
                      }
                      mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  var6 = td.field_u + -140;
                  if (0 >= var6) {
                    break L19;
                  } else {
                    L20: {
                      var7 = 256;
                      if (20 <= var6) {
                        break L20;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L20;
                      }
                    }
                    mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var6 = td.field_u + -140;
                if (0 >= var6) {
                  break L21;
                } else {
                  L22: {
                    var7 = 256;
                    if (20 <= var6) {
                      break L22;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L22;
                    }
                  }
                  mq.field_a.a(var3 - -15, 10 + var4, var5 * var7 >> 8);
                  break L21;
                }
              }
              return;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        ut.field_o.a(120, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new iw(1);
        field_a = new int[13][];
    }
}
