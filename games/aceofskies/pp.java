/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp {
    static int field_a;
    co[] field_b;

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        co var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          if (((pp) this).field_b == null) {
            break L0;
          } else {
            if (0 == ((pp) this).field_b.length) {
              break L0;
            } else {
              if (param2 >= ((pp) this).field_b[0].field_f) {
                if (((pp) this).field_b[-1 + ((pp) this).field_b.length].field_d < param2) {
                  return -1;
                } else {
                  if (1 == ((pp) this).field_b.length) {
                    return ((pp) this).field_b[0].a(true, param0);
                  } else {
                    L1: {
                      var4 = 0;
                      if (param1 >= 34) {
                        break L1;
                      } else {
                        int discarded$2 = ((pp) this).a(103);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (((pp) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((pp) this).field_b[var5];
                          if (param2 < ((co) var6).field_f) {
                            break L3;
                          } else {
                            if (((co) var6).field_d >= param2) {
                              var7 = var6.a(true, param0);
                              if (-1 != var7) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (((co) var6).field_h.length + -1);
                        var5++;
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
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        co var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 1) {
            return 124;
        }
        for (var3 = 0; var3 < ((pp) this).field_b.length; var3++) {
            var4 = ((pp) this).field_b[var3];
            if (!(((co) var4).field_h.length <= param1)) {
                return var3;
            }
            param1 = param1 - (((co) var4).field_h.length - 1);
        }
        return ((pp) this).field_b.length;
    }

    final int b(int param0, int param1) {
        co var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        co[] var7 = ((pp) this).field_b;
        co[] var3 = var7;
        int var4 = 0;
        if (param1 >= -101) {
            return 7;
        }
        while (var4 < var7.length) {
            var5 = var7[var4];
            if (param0 < ((co) var5).field_h.length) {
                return ((co) var5).field_h[param0];
            }
            param0 = param0 - (((co) var5).field_h.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param2.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            if ((var5 ^ -1) < param1) {
              return (-param3 + param0 << -1233796248) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param3 == 26326) {
          L0: {
            ht.field_k = uk.field_j;
            if (-256 == (param1 ^ -1)) {
              L1: {
                stackOut_8_0 = 111;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (-14 >= (sd.field_h ^ -1)) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L1;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L1;
                }
              }
              ld.field_c = in.a((byte) stackIn_11_0, stackIn_11_1 != 0);
              break L0;
            } else {
              L2: {
                if ((param1 ^ -1) > -101) {
                  break L2;
                } else {
                  if (param1 <= 105) {
                    ld.field_c = oq.a((byte) -63, args);
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ld.field_c = dq.a(param1, 32, param2);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        co[] var3 = null;
        int var4 = 0;
        co var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var2 = -1;
          if (param0 == 24) {
            break L0;
          } else {
            var8 = (String) null;
            pp.a((String[]) null, -43, (String) null, -67);
            break L0;
          }
        }
        L1: {
          if (null == ((pp) this).field_b) {
            break L1;
          } else {
            var3 = ((pp) this).field_b;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(true);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = ((pp) this).a((byte) 95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((pp) this).field_b == null) {
              break L2;
            } else {
              if (-1 <= (((pp) this).field_b.length ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = ((pp) this).field_b[-1 + ((pp) this).field_b.length].field_d + -((pp) this).field_b[0].field_f;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    static {
    }
}
