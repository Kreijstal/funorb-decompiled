/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hm extends an {
    private vo field_I;
    static vn field_E;
    private String[] field_K;
    private eg field_G;
    static long field_N;
    static sd field_H;
    static int field_L;
    static String field_M;
    static int[][] field_F;
    static int field_J;

    boolean a(byte param0, ga param1) {
        if (param0 < 67) {
            Object var4 = null;
            ((hm) this).a((ga) null, (byte) 86, -110, -12);
            return false;
        }
        return false;
    }

    final static void a(int param0) {
        le var1 = null;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        var1 = kn.field_L.b((byte) 26);
        L0: while (true) {
          if (!(var1 instanceof tm)) {
            var1 = se.field_m.b((byte) 26);
            L1: while (true) {
              if (!(var1 instanceof tm)) {
                if (param0 == 9) {
                  var1 = rm.field_e.b((byte) 26);
                  L2: while (true) {
                    if (!(var1 instanceof tm)) {
                      kn.field_L.b(param0 ^ 67);
                      se.field_m.b(-61);
                      rm.field_e.b(68);
                      return;
                    } else {
                      pc.a((byte) 13, ((tm) (Object) var1).field_j);
                      var1 = var1.field_b;
                      continue L2;
                    }
                  }
                } else {
                  hm.a(-124);
                  var1 = rm.field_e.b((byte) 26);
                  L3: while (true) {
                    if (!(var1 instanceof tm)) {
                      kn.field_L.b(param0 ^ 67);
                      se.field_m.b(-61);
                      rm.field_e.b(68);
                      return;
                    } else {
                      pc.a((byte) 13, ((tm) (Object) var1).field_j);
                      var1 = var1.field_b;
                      continue L3;
                    }
                  }
                }
              } else {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
                continue L1;
              }
            }
          } else {
            pc.a((byte) 13, ((tm) (Object) var1).field_j);
            var1 = var1.field_b;
            continue L0;
          }
        }
    }

    private final eg b(int param0, int param1, int param2) {
        eg var4 = null;
        eg var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param0 == 31677) {
          var4 = (eg) (Object) ((hm) this).field_I.b((byte) 26);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (eg) (Object) ((hm) this).field_I.a(false);
                  continue L0;
                } else {
                  if (param1 < var5.field_i) {
                    var5 = var5.field_h;
                    continue L1;
                  } else {
                    if (param2 < var5.field_k) {
                      var5 = var5.field_h;
                      continue L1;
                    } else {
                      if (var5.field_i - -var5.field_j <= param1) {
                        var5 = var5.field_h;
                        continue L1;
                      } else {
                        if ((var5.field_m + var5.field_k ^ -1) > (param2 ^ -1)) {
                          var5 = var5.field_h;
                          continue L1;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        } else {
          ((hm) this).field_I = null;
          var4 = (eg) (Object) ((hm) this).field_I.b((byte) 26);
          L2: while (true) {
            if (var4 != null) {
              var5 = var4;
              L3: while (true) {
                if (var5 == null) {
                  var4 = (eg) (Object) ((hm) this).field_I.a(false);
                  continue L2;
                } else {
                  if (param1 < var5.field_i) {
                    var5 = var5.field_h;
                    continue L3;
                  } else {
                    if (param2 < var5.field_k) {
                      var5 = var5.field_h;
                      continue L3;
                    } else {
                      if (var5.field_i - -var5.field_j <= param1) {
                        var5 = var5.field_h;
                        continue L3;
                      } else {
                        if ((var5.field_m + var5.field_k ^ -1) > (param2 ^ -1)) {
                          var5 = var5.field_h;
                          continue L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(28, param1, param2, param3, param4);
        ((hm) this).d((byte) -36);
        int var6 = 80 % ((param0 - -23) / 48);
    }

    final void d(byte param0) {
        int var2 = 0;
        ak var3 = null;
        vg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eg var10 = null;
        int var11 = 0;
        oe var12 = null;
        int var13 = 0;
        int var14 = 0;
        eg var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var16 = ZombieDawn.field_J;
        ((hm) this).field_I = new vo();
        if (param0 == -36) {
          var2 = 0;
          var3 = (ak) (Object) ((hm) this).field_h;
          var4 = var3.a(-113, (ga) this);
          L0: while (true) {
            var5 = ((hm) this).field_o.indexOf("<hotspot=", var2);
            if ((var5 ^ -1) != 0) {
              var7 = ((hm) this).field_o.indexOf(">", var5);
              var6 = ((hm) this).field_o.substring(9 + var5, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((hm) this).field_o.indexOf("</hotspot>", var5);
              var8 = var4.a(93, var5);
              var9 = var4.a(96, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if ((var9 ^ -1) > (var11 ^ -1)) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 == var11) {
                      stackOut_9_0 = var4.a((byte) -72, var5);
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_8_0 = var12.field_e[0];
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_10_0;
                    if ((var11 ^ -1) != (var9 ^ -1)) {
                      if (var12 == null) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var12.field_e[-1 + var12.field_e.length];
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    } else {
                      stackOut_11_0 = var4.a((byte) -72, var2);
                      stackIn_15_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_15_0;
                    var15 = new eg(var7, var13, var12.field_b, -var13 + var14, Math.max(var3.a(param0 ^ -39), var12.field_g - var12.field_b));
                    if (var10 != null) {
                      var10.field_h = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var10 = var15;
                  ((hm) this).field_I.a(0, (le) (Object) var15);
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    String d(int param0) {
        int var2 = -127 / ((param0 - 10) / 58);
        if (null == ((hm) this).field_G) {
            return null;
        }
        if (((hm) this).field_K == null) {
            return null;
        }
        if ((((hm) this).field_K.length ^ -1) >= (((hm) this).field_G.field_l ^ -1)) {
            return null;
        }
        return ((hm) this).field_K[((hm) this).field_G.field_l];
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        var6 = ZombieDawn.field_J;
        if (null != ((hm) this).field_K) {
          if ((param0 ^ -1) > (((hm) this).field_K.length ^ -1)) {
            if (param1 == -21423) {
              ((hm) this).field_K[param0] = param2;
              return;
            } else {
              var7 = null;
              ((hm) this).a((ga) null, (byte) 100, -58, -75);
              ((hm) this).field_K[param0] = param2;
              return;
            }
          } else {
            var8 = new String[param0 - -1];
            var10 = var8;
            var4 = var8;
            if (((hm) this).field_K == null) {
              ((hm) this).field_K = var10;
              if (param1 == -21423) {
                ((hm) this).field_K[param0] = param2;
                return;
              } else {
                var7 = null;
                ((hm) this).a((ga) null, (byte) 100, -58, -75);
                ((hm) this).field_K[param0] = param2;
                return;
              }
            } else {
              var5 = 0;
              L0: while (true) {
                if (((hm) this).field_K.length <= var5) {
                  ((hm) this).field_K = var10;
                  if (param1 == -21423) {
                    ((hm) this).field_K[param0] = param2;
                    return;
                  } else {
                    var7 = null;
                    ((hm) this).a((ga) null, (byte) 100, -58, -75);
                    ((hm) this).field_K[param0] = param2;
                    return;
                  }
                } else {
                  var8[var5] = ((hm) this).field_K[var5];
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          var8 = new String[param0 - -1];
          var9 = var8;
          var4 = var8;
          if (((hm) this).field_K == null) {
            L1: {
              ((hm) this).field_K = var9;
              if (param1 == -21423) {
                break L1;
              } else {
                var7 = null;
                ((hm) this).a((ga) null, (byte) 100, -58, -75);
                break L1;
              }
            }
            ((hm) this).field_K[param0] = param2;
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (((hm) this).field_K.length <= var5) {
                ((hm) this).field_K = var9;
                if (param1 == -21423) {
                  ((hm) this).field_K[param0] = param2;
                  return;
                } else {
                  var7 = null;
                  ((hm) this).a((ga) null, (byte) 100, -58, -75);
                  ((hm) this).field_K[param0] = param2;
                  return;
                }
              } else {
                var8[var5] = ((hm) this).field_K[var5];
                var5++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            hm.g(-53);
            ((hm) this).a(-121, param1, param0, param3, ((ak) (Object) ((hm) this).field_h).a(false, (ga) this));
            return;
        }
        ((hm) this).a(-121, param1, param0, param3, ((ak) (Object) ((hm) this).field_h).a(false, (ga) this));
    }

    void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 106, param2, param3);
        ((hm) this).field_G = null;
        int var5 = -66 / ((46 - param1) / 42);
        if (!((hm) this).field_l) {
            return;
        }
        int var6 = -param3 + ha.field_b + -((hm) this).field_k;
        int var7 = -((hm) this).field_j + ei.field_K - param2;
        ((hm) this).field_G = this.b(31677, var6, var7);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (-1 != (param1 ^ -1)) {
            return;
        }
        ak var5 = (ak) (Object) ((hm) this).field_h;
        eg var6 = ((hm) this).field_G;
        if (var6 == null) {
        } else {
            var7 = var5.b((ga) this, 128, param2);
            var8 = var5.a((ga) this, 1, param0);
            do {
                on.b(var6.field_j + 2, var6.field_m - -2, var6.field_i + var7 + -2, param3 + 117, var6.field_k + var8 - 2);
                var6 = var6.field_h;
            } while (var6 != null);
        }
    }

    final static int a(int param0, int param1, int[][] param2, int param3) {
        if (-1 < (param0 ^ -1)) {
          return -1;
        } else {
          if ((param1 ^ -1) <= -1) {
            if (param3 == 2) {
              if (param1 < param2.length) {
                if (param0 >= param2[0].length) {
                  return -1;
                } else {
                  return param2[param1][param0];
                }
              } else {
                return -1;
              }
            } else {
              field_L = -54;
              if (param1 < param2.length) {
                if (param0 >= param2[0].length) {
                  return -1;
                } else {
                  return param2[param1][param0];
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, 71, param2, param3);
        int var5 = -((hm) this).field_k + param0;
        int var6 = -((hm) this).field_j + param2;
        int var8 = 63 / ((-12 - param1) / 56);
        eg var7 = this.b(31677, var5, var6);
        if (var7 == null) {
            return;
        }
        if (null != ((hm) this).field_v) {
            ((oa) (Object) ((hm) this).field_v).a((hm) this, 120, var7.field_l, param3);
            return;
        }
    }

    hm(String param0, io param1) {
        super(param0, (sk) null);
        ((hm) this).field_G = null;
        ((hm) this).field_h = param1;
    }

    public static void g(int param0) {
        field_E = null;
        field_H = null;
        field_M = null;
        if (param0 != -27476) {
            field_E = null;
            field_F = null;
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new sd();
        field_M = "THE END";
        field_J = -1;
    }
}
