/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_g;
    private bh[] field_h;
    private int field_d;
    static String field_e;
    private int field_f;
    static String field_j;
    static long field_a;
    static w field_i;
    static ck field_b;
    static String field_l;
    private bh field_k;
    private bh field_c;

    final static void a(ck[] param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = client.field_A ? 1 : 0;
        if (param0 != null) {
          if ((param1 ^ -1) < -1) {
            var5 = param0[0].field_K;
            var6 = param0[2].field_K;
            if (param3 != -1) {
              field_g = null;
              var7 = param0[1].field_K;
              param0[0].c(param4, param2);
              param0[2].c(param4 - -param1 - var6, param2);
              hk.b(kh.field_e);
              hk.f(var5 + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
              var8 = var5 + param4;
              var9 = -var6 + param4 + param1;
              param4 = var8;
              L0: while (true) {
                if (param4 >= var9) {
                  hk.a(kh.field_e);
                  return;
                } else {
                  param0[1].c(param4, param2);
                  param4 = param4 + var7;
                  continue L0;
                }
              }
            } else {
              var7 = param0[1].field_K;
              param0[0].c(param4, param2);
              param0[2].c(param4 - -param1 - var6, param2);
              hk.b(kh.field_e);
              hk.f(var5 + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
              var8 = var5 + param4;
              var9 = -var6 + param4 + param1;
              param4 = var8;
              L1: while (true) {
                if (param4 >= var9) {
                  hk.a(kh.field_e);
                  return;
                } else {
                  param0[1].c(param4, param2);
                  param4 = param4 + var7;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -26) {
            return;
        }
        field_j = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final void a(long param0, int param1, bh param2) {
        if (!(null == param2.field_a)) {
            param2.b((byte) 116);
        }
        bh var5 = ((ng) this).field_h[(int)((long)(((ng) this).field_f + param1) & param0)];
        param2.field_a = var5.field_a;
        param2.field_b = var5;
        param2.field_a.field_b = param2;
        param2.field_b.field_a = param2;
        param2.field_i = param0;
    }

    final bh a(long param0, int param1) {
        bh var4 = null;
        bh var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = ((ng) this).field_h[(int)((long)(((ng) this).field_f - 1) & param0)];
        ((ng) this).field_k = var4.field_b;
        L0: while (true) {
          if (((ng) this).field_k == var4) {
            ((ng) this).field_k = null;
            if (param1 >= 48) {
              return null;
            } else {
              return null;
            }
          } else {
            if ((((ng) this).field_k.field_i ^ -1L) != (param0 ^ -1L)) {
              ((ng) this).field_k = ((ng) this).field_k.field_b;
              continue L0;
            } else {
              var5 = ((ng) this).field_k;
              ((ng) this).field_k = ((ng) this).field_k.field_b;
              return var5;
            }
          }
        }
    }

    final static jc a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_17_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= -65) {
            L0: {
              if (param0 == -1) {
                break L0;
              } else {
                var7 = null;
                ng.a((ck[]) null, 38, -12, 7, -118);
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2 + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var2 + -1 > var4) {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              break L2;
                            } else {
                              stackOut_15_0 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_17_0;
                          var4++;
                          continue L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                return be.field_x;
                              }
                            }
                          }
                          var3 = 0;
                          var4++;
                          continue L1;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return be.field_x;
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  if (var2 > var4) {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (46 == var5) {
                        if (0 != var4) {
                          if (var4 != -1 + var2) {
                            if (var3 == 0) {
                              var3 = 1;
                              var4++;
                              break L4;
                            } else {
                              return be.field_x;
                            }
                          } else {
                            return be.field_x;
                          }
                        } else {
                          return be.field_x;
                        }
                      } else {
                        if (-1 != nm.field_Pb.indexOf(var5)) {
                          var3 = 0;
                          break L4;
                        } else {
                          return be.field_x;
                        }
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            if (param1.charAt(0) == 34) {
              if (param1.charAt(var2 + -1) == 34) {
                var3 = 0;
                var4 = 1;
                L5: while (true) {
                  if (var2 + -1 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L6: {
                        if (var3 != 0) {
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L6;
                        } else {
                          stackOut_51_0 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L6;
                        }
                      }
                      var3 = stackIn_53_0;
                      var4++;
                      continue L5;
                    } else {
                      L7: {
                        if (var5 != 34) {
                          break L7;
                        } else {
                          if (var3 != 0) {
                            break L7;
                          } else {
                            return be.field_x;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L5;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return be.field_x;
              }
            } else {
              var3 = 0;
              var4 = 0;
              L8: while (true) {
                if (var2 > var4) {
                  var5 = param1.charAt(var4);
                  if (46 == var5) {
                    L9: {
                      if (0 == var4) {
                        break L9;
                      } else {
                        if (var4 == -1 + var2) {
                          break L9;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    return be.field_x;
                  } else {
                    if (-1 != nm.field_Pb.indexOf(var5)) {
                      var3 = 0;
                      var4++;
                      continue L8;
                    } else {
                      return be.field_x;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return ga.field_e;
          }
        } else {
          return hm.field_a;
        }
    }

    final bh a(byte param0) {
        ((ng) this).field_d = 0;
        if (param0 != 126) {
            bh discarded$0 = ((ng) this).b((byte) 112);
            return ((ng) this).b((byte) 49);
        }
        return ((ng) this).b((byte) 49);
    }

    final bh b(byte param0) {
        bh var2 = null;
        int var3 = 0;
        bh var4 = null;
        var3 = client.field_A ? 1 : 0;
        if ((((ng) this).field_d ^ -1) >= -1) {
          if (param0 >= 37) {
            L0: while (true) {
              if (((ng) this).field_f > ((ng) this).field_d) {
                ((ng) this).field_d = ((ng) this).field_d + 1;
                var4 = ((ng) this).field_h[((ng) this).field_d].field_b;
                var2 = var4;
                if (var4 != ((ng) this).field_h[-1 + ((ng) this).field_d]) {
                  ((ng) this).field_c = var2.field_b;
                  return var2;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          if (((ng) this).field_h[-1 + ((ng) this).field_d] == ((ng) this).field_c) {
            if (param0 >= 37) {
              L1: while (true) {
                if (((ng) this).field_f > ((ng) this).field_d) {
                  ((ng) this).field_d = ((ng) this).field_d + 1;
                  var4 = ((ng) this).field_h[((ng) this).field_d].field_b;
                  var2 = var4;
                  if (var4 != ((ng) this).field_h[-1 + ((ng) this).field_d]) {
                    ((ng) this).field_c = var2.field_b;
                    return var2;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            var2 = ((ng) this).field_c;
            ((ng) this).field_c = var2.field_b;
            return var2;
          }
        }
    }

    ng(int param0) {
        int var2 = 0;
        bh var3 = null;
        ((ng) this).field_d = 0;
        ((ng) this).field_f = param0;
        ((ng) this).field_h = new bh[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new bh();
            ((ng) this).field_h[var2] = new bh();
            var3.field_b = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please check if address is correct";
        field_g = "Stage";
        field_j = "This password is part of your Player Name, and would be easy to guess";
        field_l = "Waiting for graphics";
    }
}
