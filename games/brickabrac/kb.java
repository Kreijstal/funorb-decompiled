/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends mh {
    static boolean field_Xb;
    static String field_Wb;
    static String field_Rb;
    private mh field_ac;
    static volatile int field_Pb;
    static boolean field_Sb;
    static String field_Tb;
    static jp[] field_Ub;
    static int field_Yb;
    static mh field_Vb;
    static long field_Zb;
    static String field_Qb;

    final static boolean a(long param0, int param1, String param2, int[] param3, int param4) {
        Object var7 = null;
        if (param1 == -3) {
          if (param3 != null) {
            if ((param4 ^ -1) == -3) {
              if (!ud.a(param0, param2, -123)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var7 = null;
          int discarded$4 = kb.a((ak) null, 109, -70, (j) null);
          if (param3 != null) {
            if ((param4 ^ -1) == -3) {
              if (!ud.a(param0, param2, -123)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0;
        int stackOut_19_0;
        int stackOut_15_0;
        int stackOut_9_0;
        int stackOut_8_0;
        int stackOut_4_0;
        int stackOut_3_0;
        if (param0 >= 63) {
          ((kb) this).a(true, -15211);
          if (-1 == (ki.field_e ^ -1)) {
            if (((kb) this).field_ac.field_L != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (((kb) this).field_L != 0) {
              L0: {
                if (((kb) this).field_ac.field_L == 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          mh discarded$5 = kb.h(-91);
          ((kb) this).a(true, -15211);
          if (-1 != (ki.field_e ^ -1)) {
            if (((kb) this).field_L == 0) {
              return true;
            } else {
              L1: {
                if (((kb) this).field_ac.field_L == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (((kb) this).field_ac.field_L == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void d(byte param0) {
        if (param0 < 40) {
          field_Yb = -55;
          field_Ub = null;
          field_Tb = null;
          field_Rb = null;
          field_Qb = null;
          field_Wb = null;
          field_Vb = null;
          return;
        } else {
          field_Ub = null;
          field_Tb = null;
          field_Rb = null;
          field_Qb = null;
          field_Wb = null;
          field_Vb = null;
          return;
        }
    }

    final static lo a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = param1.length();
        if (-1 != (var2 ^ -1)) {
          L0: {
            if (param0 > 80) {
              break L0;
            } else {
              field_Tb = null;
              if ((var2 ^ -1) >= -64) {
                var3 = 0;
                if (var2 > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (0 != (kq.field_k.indexOf(var4) ^ -1)) {
                        var3++;
                        break L1;
                      } else {
                        return wg.field_c;
                      }
                    } else {
                      if (var3 != 0) {
                        if (var3 != var2 + -1) {
                          var3++;
                          break L1;
                        } else {
                          return wg.field_c;
                        }
                      } else {
                        return wg.field_c;
                      }
                    }
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return pi.field_r;
              }
            }
          }
          if ((var2 ^ -1) >= -64) {
            var3 = 0;
            L2: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (0 == kq.field_k.indexOf(var4)) {
                    return wg.field_c;
                  } else {
                    var3++;
                    var3++;
                    continue L2;
                  }
                } else {
                  L3: {
                    if (var3 == -1) {
                      break L3;
                    } else {
                      if (var3 == var2 + -1) {
                        break L3;
                      } else {
                        var3++;
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  return wg.field_c;
                }
              } else {
                return null;
              }
            }
          } else {
            return pi.field_r;
          }
        } else {
          return la.field_a;
        }
    }

    kb(mh param0, mh param1, mh param2, mh param3, mh param4, mh param5) {
        int var12 = 0;
        mh var13 = null;
        mh var14 = null;
        int var15 = 0;
        mh var17 = new mh(0L, param1, ng.field_c.toUpperCase());
        var17.field_S = 1;
        ((kb) this).field_ac = new mh(0L, param2);
        mh var8 = new mh(0L, param3);
        mh var9 = new mh(0L, param3, od.field_b);
        var9.field_S = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; re.field_p.length > var12; var12++) {
            var13 = new mh(0L, param3, qo.field_M[var12]);
            var14 = new mh(0L, param3, re.field_p[var12]);
            var15 = param3.field_O.c(re.field_p[var12]);
            var13.a(15, var10, 20, 65, (byte) 64);
            if (var15 > var11) {
                var11 = var15;
            }
            var14.a(15, var10, 90, 640, (byte) 64);
            var8.a(var13, 0);
            var8.a(var14, 0);
            var10 += 30;
        }
        var17.a(24, 0, 0, 20 + var11 + 90, (byte) 64);
        var10 += 15;
        ((kb) this).a(var17.field_cb + var10, 100, 100, var17.field_Ib, (byte) 64);
        ((kb) this).field_ac.a(15, 5, -20 + var17.field_Ib, 15, (byte) 64);
        var8.a(((kb) this).field_cb + -var17.field_cb, var17.field_cb, 0, ((kb) this).field_Ib, (byte) 64);
        var9.a(15, 20, 0, ((kb) this).field_Ib, (byte) 64);
        var8.field_Jb = na.a(false, 8421504, 3, 11579568, var8.field_cb, 2105376);
        var17.a(((kb) this).field_ac, 0);
        var8.a(var9, 0);
        ((kb) this).a(var17, 0);
        ((kb) this).a(var8, 0);
        ((kb) this).field_P = -(((kb) this).field_Ib >> 1270156545) + 320;
        var10 = 240 + -(((kb) this).field_cb >> -1149341695);
    }

    final static mh h(int param0) {
        if (param0 != 2) {
            field_Vb = null;
            return gf.field_f.field_Xb;
        }
        return gf.field_f.field_Xb;
    }

    final static void a(String param0, int param1) {
        pf.a(48, param0);
        int var2 = 81 % ((param1 - 86) / 38);
        pq.a(0, ep.field_d, false);
    }

    final static boolean i(int param0) {
        if (param0 == 7457) {
          if (-11 >= i.field_j) {
            if (-14 > qg.field_A) {
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

    final static int a(ak param0, int param1, int param2, j param3) {
        int var4 = 0;
        Object var5 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0;
        int stackOut_1_0;
        L0: {
          if (-1 == (1 << param1 & (param0.field_a | (param0.field_g | param0.field_i)) ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param2 > 63) {
          if (var4 == 0) {
            if (param3.field_Z == 2) {
              if (!r.field_A) {
                L1: {
                  if (-1 == (1 & param3.field_db ^ -1)) {
                    break L1;
                  } else {
                    if ((-2 & param3.field_db) != 0) {
                      break L1;
                    } else {
                      return 0;
                    }
                  }
                }
                if ((param3.field_db & 2) != 0) {
                  if ((param3.field_db & -3) == 0) {
                    return 2;
                  } else {
                    return 1;
                  }
                } else {
                  return 1;
                }
              } else {
                if (!ka.a((byte) 93)) {
                  L2: {
                    if (-1 == (1 & param3.field_db ^ -1)) {
                      break L2;
                    } else {
                      if ((-2 & param3.field_db) != 0) {
                        break L2;
                      } else {
                        return 0;
                      }
                    }
                  }
                  if ((param3.field_db & 2) != 0) {
                    if ((param3.field_db & -3) == 0) {
                      return 2;
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          var5 = null;
          boolean discarded$1 = kb.a(-35L, 83, (String) null, (int[]) null, -41);
          if (var4 == 0) {
            if (param3.field_Z == 2) {
              if (!r.field_A) {
                L3: {
                  if (-1 == (1 & param3.field_db ^ -1)) {
                    break L3;
                  } else {
                    if ((-2 & param3.field_db) != 0) {
                      break L3;
                    } else {
                      return 0;
                    }
                  }
                }
                if ((param3.field_db & 2) != 0) {
                  if ((param3.field_db & -3) != 0) {
                    return 1;
                  } else {
                    return 2;
                  }
                } else {
                  return 1;
                }
              } else {
                if (!ka.a((byte) 93)) {
                  if (-1 != (1 & param3.field_db ^ -1)) {
                    if ((-2 & param3.field_db) != 0) {
                      if ((param3.field_db & 2) != 0) {
                        if ((param3.field_db & -3) != 0) {
                          return 1;
                        } else {
                          return 2;
                        }
                      } else {
                        return 1;
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    if ((param3.field_db & 2) != 0) {
                      if ((param3.field_db & -3) == 0) {
                        return 2;
                      } else {
                        return 1;
                      }
                    } else {
                      return 1;
                    }
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Wb = "Public";
        field_Xb = false;
        field_Pb = 0;
        field_Tb = "Your ball fell out of play! Try to catch it with your paddle.";
        field_Rb = "Try changing the following settings:  ";
    }
}
