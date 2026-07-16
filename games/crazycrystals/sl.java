/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pn {
    ea field_o;
    static int field_q;
    static jp field_m;
    boolean field_p;
    static String[] field_r;
    static String field_n;
    static volatile boolean field_t;
    static String field_u;
    static java.security.SecureRandom field_s;

    private final void a(int param0, int param1, f[][] param2, int param3, f param4) {
        pn var6 = null;
        int var7 = CrazyCrystals.field_B;
        param0 = param0 - ((sl) this).field_o.field_s;
        param1 = param1 - ((sl) this).field_o.field_o;
        if (param3 != 12) {
            field_t = true;
        }
        if ((Object) (Object) ((sl) this).field_o != (Object) (Object) param2[param0][param1]) {
            var6 = (pn) (Object) param2[param0][param1];
            while ((Object) (Object) ((sl) this).field_o != (Object) (Object) var6.field_l) {
                var6 = (pn) (Object) var6.field_l;
            }
            var6.field_l = param4;
        } else {
            param2[param0][param1] = param4;
        }
    }

    final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 43) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((sl) this).field_o.b((byte) 126)) {
              break L2;
            } else {
              if (!((sl) this).field_l.b((byte) 98)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(vc param0, vc param1, int param2, int param3) {
        vk.field_L = param3;
        ec.field_m = param0;
        int var4 = 37 / ((param2 - 58) / 47);
        gh.field_F = param1;
        mh.a(kh.field_l / 2, -20, kh.field_d / 2);
        mo.a(param0.field_u + param0.field_A, param1.field_A, param0.field_A, param1.field_A - -param1.field_u, (byte) -16);
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 16736352) {
          L0: {
            L1: {
              if (!((sl) this).field_o.a(16736352, param1, param2, param3, param4, param5, param6, param7)) {
                break L1;
              } else {
                if (!((sl) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 90 % ((param2 - -43) / 51);
        return (f) this;
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        f var7 = null;
        ig var8 = null;
        f var9 = null;
        int var10 = 0;
        Object stackIn_7_0 = null;
        f stackIn_7_1 = null;
        f stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        f[][] stackIn_7_5 = null;
        Object stackIn_8_0 = null;
        f stackIn_8_1 = null;
        f stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        f[][] stackIn_8_5 = null;
        Object stackIn_9_0 = null;
        f stackIn_9_1 = null;
        f stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        f[][] stackIn_9_5 = null;
        dl[] stackIn_9_6 = null;
        Object stackOut_6_0 = null;
        f stackOut_6_1 = null;
        f stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        f[][] stackOut_6_5 = null;
        Object stackOut_8_0 = null;
        f stackOut_8_1 = null;
        f stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        f[][] stackOut_8_5 = null;
        Object stackOut_8_6 = null;
        Object stackOut_7_0 = null;
        f stackOut_7_1 = null;
        f stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        f[][] stackOut_7_5 = null;
        dl[] stackOut_7_6 = null;
        var10 = CrazyCrystals.field_B;
        var7 = ((sl) this).field_l;
        L0: while (true) {
          if (!(var7 instanceof ro)) {
            if (var7 instanceof pn) {
              var7 = ((pn) (Object) var7).field_l;
              continue L0;
            } else {
              L1: {
                stackOut_6_0 = this;
                stackOut_6_1 = ((sl) this).field_l;
                stackOut_6_2 = (f) param0;
                stackOut_6_3 = param1;
                stackOut_6_4 = param2;
                stackOut_6_5 = (f[][]) param3;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                if (!((sl) this).field_o.b((byte) 121)) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = (f) (Object) stackIn_8_1;
                  stackOut_8_2 = (f) (Object) stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = (f[][]) (Object) stackIn_8_5;
                  stackOut_8_6 = null;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = (dl[]) (Object) stackOut_8_6;
                  break L1;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = (f) (Object) stackIn_7_1;
                  stackOut_7_2 = (f) (Object) stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = (f[][]) (Object) stackIn_7_5;
                  stackOut_7_6 = (dl[]) param4;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  stackIn_9_6 = stackOut_7_6;
                  break L1;
                }
              }
              ((sl) this).field_l = ((f) (Object) stackIn_9_1).a(stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, param5);
              if (!((sl) this).field_o.a((byte) 42, param3, param0)) {
                cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
                var8 = new ig(param0, bd.field_n, ((sl) this).field_l, true);
                var9 = ((sl) this).field_o.a(param3, -((sl) this).field_o.field_s + param1, (f) (Object) var8, 11460, param2 - ((sl) this).field_o.field_o);
                ((sl) this).field_l = (f) (Object) var8;
                if ((Object) (Object) var9 == (Object) (Object) ((sl) this).field_o) {
                  return (f) this;
                } else {
                  this.a(param1, param2, param3, 12, var9);
                  return ((sl) this).field_l;
                }
              } else {
                return (f) this;
              }
            }
          } else {
            return (f) this;
          }
        }
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        f var6 = null;
        Object var5 = null;
        if (param1 > -74) {
            field_r = null;
        }
        if (((sl) this).field_o.field_s >= 0) {
            var5 = (Object) (Object) super.a(param0, (byte) -89, param2, param3);
        } else {
            var5 = this;
            ((sl) this).field_l = ((sl) this).field_l.a(param0, (byte) -125, param2, param3);
        }
        if (param2) {
            var6 = ((sl) this).field_o.a(param3, (f) (Object) param0.field_a, param0.field_c, param0.field_b, true);
            if ((Object) (Object) ((sl) this).field_o != (Object) (Object) var6) {
                this.a(param0.field_c, param0.field_b, param3, 12, var6);
                return ((sl) this).field_l;
            }
        }
        return (f) var5;
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        if (param1 == null) {
          return false;
        } else {
          var3 = param1.length();
          if (1 > var3) {
            return false;
          } else {
            if (var3 <= 12) {
              L0: {
                var4 = fe.a(60136, param1);
                if (var4 == null) {
                  break L0;
                } else {
                  if (1 <= var4.length()) {
                    L1: {
                      if (am.a(var4.charAt(0), (byte) 34)) {
                        break L1;
                      } else {
                        if (am.a(var4.charAt(-1 + var4.length()), (byte) 72)) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (var6 >= param1.length()) {
                              if (var5 <= param2) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L3: {
                                var7 = param1.charAt(var6);
                                if (am.a((char) var7, (byte) 93)) {
                                  var5++;
                                  break L3;
                                } else {
                                  var5 = 0;
                                  break L3;
                                }
                              }
                              if (-3 >= (var5 ^ -1)) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        nj var3 = ((sl) this).field_o.a(param0, param1);
        if (var3 == null) {
            var3 = ((sl) this).field_l.a(param0 + 0, param1);
        }
        return var3;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        wm var10 = null;
        int var8 = 0;
        int var9 = 0;
        if (((sl) this).field_p) {
            if ((((sl) this).field_o.field_s ^ -1) <= -1) {
                var10 = jf.a(kh.field_j, param4, 0, param4 + param1 * 2, kh.field_b);
                if (var10 == null) {
                    return;
                }
                var8 = (((sl) this).field_o.field_m - ((sl) this).field_o.field_p) * param1 * 2 / ((sl) this).field_o.field_p;
                var9 = param2 * (((sl) this).field_o.field_m + -((sl) this).field_o.field_p) * 2 / ((sl) this).field_o.field_p;
                ((sl) this).field_o.a(param3, param4 + var8 * ((sl) this).field_o.field_o, param1, param2, param5 + var9 * ((sl) this).field_o.field_s, 4261);
                var10.a((byte) -4);
            }
        }
        int var7 = 68 % ((74 - param0) / 41);
    }

    final static int a(byte param0, int param1, int param2) {
        int var4 = CrazyCrystals.field_B;
        int var3 = 0;
        if (param0 != -24) {
            return -34;
        }
        while (0 < param2) {
            var3 = param1 & 1 | var3 << 1819447425;
            param2--;
            param1 = param1 >>> 1;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (((sl) this).field_o.g(0)) {
            ((sl) this).field_l.a(126, param1, param2, param3, param4, param5, param6, param7);
        }
        if (param0 <= 92) {
            ((sl) this).field_p = false;
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        Object var9 = null;
        f var10 = null;
        L0: {
          ((sl) this).field_l = ((sl) this).field_l.a(param0, param1, param2, param3, (byte) -126, param5, param6);
          if (param4 <= -87) {
            break L0;
          } else {
            var9 = null;
            sl.a((vc) null, (vc) null, -42, -91);
            break L0;
          }
        }
        if (param1 == ((sl) this).field_o) {
          return (f) this;
        } else {
          L1: {
            L2: {
              if (((sl) this).field_o.field_o != -param2) {
                break L2;
              } else {
                if (-param0 != ((sl) this).field_o.field_s) {
                  break L2;
                } else {
                  if (((sl) this).field_o.field_p * param1.field_p > param1.field_p * ((sl) this).field_o.field_m + ((sl) this).field_o.field_p * param1.field_m) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var10 = ((sl) this).field_o.a(param0, param2 + param5 - ((sl) this).field_o.field_o, param6, -31135, -((sl) this).field_o.field_s + (param0 + param3), param2, param1);
            if ((Object) (Object) ((sl) this).field_o != (Object) (Object) var10) {
              this.a(param3 - -param0, param5 - -param2, param6, 12, var10);
              return ((sl) this).field_l;
            } else {
              break L1;
            }
          }
          return super.a(param0, param1, param2, param3, (byte) -117, param5, param6);
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return null;
        }
        if (((sl) this).field_o.g(0)) {
            ((sl) this).field_l = ((sl) this).field_l.a(param0, (byte) -110, param2);
        }
        return (f) this;
    }

    sl(ea param0, f param1) {
        super(param1);
        ((sl) this).field_p = true;
        ((sl) this).field_o = param0;
        ((sl) this).a((byte) 97, (f) (Object) param0);
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_q = -108;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((sl) this).field_o.a(param2, true, param1)) {
              break L2;
            } else {
              if (!((sl) this).field_l.a(param0, param1, param2)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(f[][] param0, int param1, byte param2, int param3) {
        if (((sl) this).field_o.g(0)) {
            ((sl) this).field_l.a(param0, param1, (byte) 40, param3);
        }
        if (param2 != 40) {
            int discarded$0 = ((sl) this).a(true, false);
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_s = null;
        field_n = null;
        field_u = null;
        field_r = null;
        if (!param0) {
            Object var2 = null;
            sl.a((vc) null, (vc) null, 111, 59);
        }
    }

    final f e(byte param0) {
        ma var3 = null;
        ea var4 = null;
        sl var5 = null;
        if (((sl) this).field_l instanceof ma) {
          var3 = (ma) (Object) ((sl) this).field_l;
          if ((((sl) this).field_o.field_s ^ -1) <= -1) {
            ((sl) this).field_l = var3.field_l;
            var3.field_l = ((sl) this).e((byte) -8);
            return (f) (Object) var3;
          } else {
            return (f) this;
          }
        } else {
          L0: {
            if (param0 == -8) {
              break L0;
            } else {
              ((sl) this).a(73, 92, 59, (f[][]) null, -47, 116, 85, -122);
              break L0;
            }
          }
          if (!(((sl) this).field_l instanceof ea)) {
            L1: {
              if (((sl) this).field_l instanceof sl) {
                L2: {
                  var5 = (sl) (Object) ((sl) this).field_l;
                  if ((var5.field_o.field_s ^ -1) < -1) {
                    break L2;
                  } else {
                    if (0 != var5.field_o.field_s) {
                      break L1;
                    } else {
                      if ((var5.field_o.field_s ^ -1) >= -1) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                ((sl) this).field_l = var5.field_l;
                var5.field_l = ((sl) this).e((byte) -8);
                return (f) (Object) var5;
              } else {
                break L1;
              }
            }
            return (f) this;
          } else {
            L3: {
              var4 = (ea) (Object) ((sl) this).field_l;
              if ((((sl) this).field_o.field_s ^ -1) < -1) {
                break L3;
              } else {
                L4: {
                  if (0 != ((sl) this).field_o.field_s) {
                    break L4;
                  } else {
                    if (0 > var4.field_s) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                return (f) this;
              }
            }
            ((sl) this).field_l = var4.field_l;
            var4.field_l = ((sl) this).e((byte) -8);
            return (f) (Object) var4;
          }
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        ((sl) this).field_l = ((sl) this).field_l.a(param0, param1, param2, param3, (byte) 127);
        if (-1 == (2 & ((sl) this).field_l.a(true, false) ^ -1)) {
            return (f) this;
        }
        int var6 = 69 % ((param4 - 73) / 42);
        f var7 = ((sl) this).field_o.a(param0 + -((sl) this).field_o.field_s, -((sl) this).field_o.field_o + param1, param2, param3, (byte) 126);
        if (!((Object) (Object) var7 == (Object) (Object) ((sl) this).field_o)) {
            this.a(param0, param1, param2, 12, var7);
            return ((sl) this).field_l;
        }
        return (f) this;
    }

    final int a(boolean param0, boolean param1) {
        int var3 = ((sl) this).field_o.a(param1, 0);
        if ((var3 & 2) != 0) {
            var3 = var3 | 12;
        }
        int var4 = ((sl) this).field_l.a(param0, param1);
        if ((2 & var4) != 0) {
            var4 = var4 | 12;
        }
        return var4 & var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_m = new jp();
        field_u = "Password is valid";
        field_t = true;
    }
}
