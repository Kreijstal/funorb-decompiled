/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends am {
    static char[] field_t;
    static ei field_s;
    private int field_v;
    private int field_x;
    private int field_u;
    static t field_w;
    static double field_y;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_s = null;
        field_t = null;
        field_w = null;
    }

    final static void a(boolean param0, int param1) {
        on.field_c = param1;
        if (!param0) {
            return;
        }
        bd.a(true, 46);
    }

    public bd() {
        super(0, true);
        ((bd) this).field_v = 204;
        ((bd) this).field_x = 1;
        ((bd) this).field_u = 1;
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var11 = Torquing.field_u;
        var16 = ((bd) this).field_l.a(param1, 25657);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var3 = var13;
        if (param0 > 86) {
          if (((bd) this).field_l.field_b) {
            var4 = 0;
            L0: while (true) {
              if (ci.field_c <= var4) {
                return var3;
              } else {
                L1: {
                  L2: {
                    var5 = q.field_b[var4];
                    var6 = dp.field_a[param1];
                    var7 = ((bd) this).field_u * var5 >> -1854255092;
                    var8 = ((bd) this).field_x * var6 >> 1895656140;
                    var9 = ((bd) this).field_u * (var5 % (4096 / ((bd) this).field_u));
                    var10 = ((bd) this).field_x * (var6 % (4096 / ((bd) this).field_x));
                    if (((bd) this).field_v > var10) {
                      var7 = var7 - var8;
                      L3: while (true) {
                        if (-1 >= (var7 ^ -1)) {
                          L4: while (true) {
                            if (3 >= var7) {
                              if (-2 != (var7 ^ -1)) {
                                var16[var4] = 0;
                                var4++;
                                break L1;
                              } else {
                                if ((((bd) this).field_v ^ -1) < (var9 ^ -1)) {
                                  var16[var4] = 0;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              var7 -= 4;
                              continue L4;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    if (var9 < ((bd) this).field_v) {
                      var7 = var7 - var8;
                      L6: while (true) {
                        if (var7 >= 0) {
                          L7: while (true) {
                            if ((var7 ^ -1) >= -4) {
                              if (var7 > 0) {
                                var16[var4] = 0;
                                break L1;
                              } else {
                                break L5;
                              }
                            } else {
                              var7 -= 4;
                              continue L7;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  var16[var4] = 4096;
                  break L1;
                }
                var4++;
                continue L0;
              }
            }
          } else {
            return var3;
          }
        } else {
          L8: {
            var12 = null;
            ((bd) this).a((fj) null, -77, 90);
            if (((bd) this).field_l.field_b) {
              var4 = 0;
              if (ci.field_c > var4) {
                var5 = q.field_b[var4];
                var6 = dp.field_a[param1];
                var7 = ((bd) this).field_u * var5 >> -1854255092;
                var8 = ((bd) this).field_x * var6 >> 1895656140;
                var9 = ((bd) this).field_u * (var5 % (4096 / ((bd) this).field_u));
                var10 = ((bd) this).field_x * (var6 % (4096 / ((bd) this).field_x));
                if (((bd) this).field_v > var10) {
                  var7 = var7 - var8;
                  L9: while (true) {
                    if (-1 >= (var7 ^ -1)) {
                      L10: while (true) {
                        if (3 >= var7) {
                          L11: {
                            if (-2 != (var7 ^ -1)) {
                              var16[var4] = 0;
                              var4++;
                              break L11;
                            } else {
                              if ((((bd) this).field_v ^ -1) < (var9 ^ -1)) {
                                var16[var4] = 0;
                                var4++;
                                var4++;
                                var4++;
                                break L11;
                              } else {
                                L12: {
                                  if (var9 < ((bd) this).field_v) {
                                    var7 = var7 - var8;
                                    L13: while (true) {
                                      if (var7 >= 0) {
                                        L14: while (true) {
                                          if ((var7 ^ -1) >= -4) {
                                            if (var7 > 0) {
                                              var16[var4] = 0;
                                              var4++;
                                              break L12;
                                            } else {
                                              var16[var4] = 4096;
                                              var4++;
                                              var4++;
                                              var4++;
                                              var4++;
                                              var4++;
                                              var4++;
                                              return var3;
                                            }
                                          } else {
                                            var7 -= 4;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var7 += 4;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    var16[var4] = 4096;
                                    break L12;
                                  }
                                }
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                return var3;
                              }
                            }
                          }
                          var4++;
                          var4++;
                          var4++;
                          var4++;
                          var4++;
                          break L8;
                        } else {
                          var7 -= 4;
                          continue L10;
                        }
                      }
                    } else {
                      var7 += 4;
                      continue L9;
                    }
                  }
                } else {
                  L15: {
                    if (var9 < ((bd) this).field_v) {
                      var7 = var7 - var8;
                      L16: while (true) {
                        if (var7 >= 0) {
                          L17: while (true) {
                            if ((var7 ^ -1) >= -4) {
                              if (var7 > 0) {
                                var16[var4] = 0;
                                var4++;
                                break L15;
                              } else {
                                var16[var4] = 4096;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                return var3;
                              }
                            } else {
                              var7 -= 4;
                              continue L17;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L16;
                        }
                      }
                    } else {
                      var16[var4] = 4096;
                      break L15;
                    }
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              break L8;
            }
          }
          return var3;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (param1 == 35) {
          var4 = param2;
          if (var4 != 0) {
            if (var4 != 1) {
              if ((var4 ^ -1) != -3) {
                return;
              } else {
                ((bd) this).field_v = param0.i(param1 + 7053);
                return;
              }
            } else {
              ((bd) this).field_x = param0.i((byte) -101);
              return;
            }
          } else {
            ((bd) this).field_u = param0.i((byte) -101);
            return;
          }
        } else {
          bd.a(true);
          var4 = param2;
          if (var4 != 0) {
            if (var4 != 1) {
              if ((var4 ^ -1) != -3) {
                return;
              } else {
                ((bd) this).field_v = param0.i(param1 + 7053);
                return;
              }
            } else {
              ((bd) this).field_x = param0.i((byte) -101);
              return;
            }
          } else {
            ((bd) this).field_u = param0.i((byte) -101);
            return;
          }
        }
    }

    final static void c(int param0) {
        qd.field_d = param0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (-21 > (of.field_m ^ -1)) {
          ea.b(-60, of.field_m + -20);
          var1 = -12 % ((40 - param0) / 47);
          return;
        } else {
          ea.b(-19, 0);
          var1 = -12 % ((40 - param0) / 47);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_s = new ei();
    }
}
