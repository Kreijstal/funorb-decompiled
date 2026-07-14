/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma extends oa {
    private vl field_db;
    static vd field_Y;
    static ef field_cb;
    static int field_W;
    private ul field_ab;
    static ek field_eb;
    static Boolean field_bb;
    static String field_Z;
    private String[] field_X;
    static int field_V;

    ma(String param0, qk param1) {
        super(param0, (tn) null);
        ((ma) this).field_db = null;
        ((ma) this).field_p = param1;
    }

    final static void a(boolean param0, byte param1, String param2, String param3) {
        if (param1 > -60) {
            return;
        }
        vn.field_i = param3;
        cc.field_Xb = param2;
        bf.a((byte) -102, param0, rh.field_p);
    }

    String e(int param0) {
        if (param0 == 0) {
          if (((ma) this).field_db != null) {
            if (null != ((ma) this).field_X) {
              if (((ma) this).field_X.length <= ((ma) this).field_db.field_p) {
                return null;
              } else {
                return ((ma) this).field_X[((ma) this).field_db.field_p];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String a(boolean param0) {
        if (param0) {
            return null;
        }
        if (!(cb.field_j != nj.field_ab)) {
            return bl.field_f;
        }
        return vn.field_i;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 >= -71) {
            return;
        }
        super.a(param0, (byte) -122, param2, param3, param4);
        ((ma) this).f((byte) -109);
    }

    public static void c(boolean param0) {
        field_eb = null;
        field_cb = null;
        if (param0) {
          field_bb = null;
          field_Y = null;
          field_Z = null;
          field_bb = null;
          return;
        } else {
          field_Y = null;
          field_Z = null;
          field_bb = null;
          return;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        eg var4 = null;
        da var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        int var12 = 0;
        il var13 = null;
        int var14 = 0;
        int var15 = 0;
        vl var16 = null;
        int var17 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var17 = SteelSentinels.field_G;
        var2 = 48 / ((-24 - param0) / 38);
        ((ma) this).field_ab = new ul();
        var3 = 0;
        var4 = (eg) (Object) ((ma) this).field_p;
        var5 = var4.b(-1, (lh) this);
        L0: while (true) {
          var6 = ((ma) this).field_y.indexOf("<hotspot=", var3);
          if (-1 != var6) {
            var8 = ((ma) this).field_y.indexOf(">", var6);
            var7 = ((ma) this).field_y.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var3 = ((ma) this).field_y.indexOf("</hotspot>", var6);
            var9 = var5.b(-1, var6);
            var10 = var5.b(-1, var3);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var5.field_h[var12];
                  if (var9 == var12) {
                    stackOut_7_0 = var5.a(1, var6);
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var13.field_f[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_8_0;
                  if (var12 == var10) {
                    stackOut_12_0 = var5.a(1, var3);
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    if (var13 != null) {
                      stackOut_11_0 = var13.field_f[-1 + var13.field_f.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                }
                var15 = stackIn_13_0;
                var16 = new vl(var8, var14, var13.field_h, var15 - var14, Math.max(var4.a(-40), var13.field_a + -var13.field_h));
                if (var11 == null) {
                  ((ma) this).field_ab.a(3, (ck) (Object) var16);
                  var11 = var16;
                  var12++;
                  continue L1;
                } else {
                  var11.field_q = var16;
                  ((ma) this).field_ab.a(3, (ck) (Object) var16);
                  var11 = var16;
                  var12++;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vl var7 = null;
        Object var8 = null;
        super.b(param0, (byte) -124, param2, param3);
        if (param1 < -122) {
          var5 = -((ma) this).field_o + param2;
          var6 = -((ma) this).field_z + param3;
          var7 = this.a(-1, var5, var6);
          if (var7 != null) {
            if (null == ((ma) this).field_A) {
              return;
            } else {
              ((cg) (Object) ((ma) this).field_A).a(param0, var7.field_p, (ma) this, 127);
              return;
            }
          } else {
            return;
          }
        } else {
          var8 = null;
          ma.a(true, (byte) -7, (String) null, (String) null);
          var5 = -((ma) this).field_o + param2;
          var6 = -((ma) this).field_z + param3;
          var7 = this.a(-1, var5, var6);
          if (var7 != null) {
            if (null == ((ma) this).field_A) {
              return;
            } else {
              ((cg) (Object) ((ma) this).field_A).a(param0, var7.field_p, (ma) this, 127);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, kf param1, int param2) {
        kj var3 = null;
        var3 = mm.field_g;
        var3.a(param0, (byte) -117);
        var3.a((byte) 115, 5);
        var3.a((byte) 110, 0);
        if (param2 != -2864) {
          String discarded$1 = ma.a(false);
          var3.d(param1.field_C, param2 + 2960);
          var3.a((byte) 125, param1.field_u);
          var3.a((byte) 113, param1.field_w);
          return;
        } else {
          var3.d(param1.field_C, param2 + 2960);
          var3.a((byte) 125, param1.field_u);
          var3.a((byte) 113, param1.field_w);
          return;
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (wc.field_i == null) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) wc.field_i;
                    // monitorenter wc.field_i
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        wc.field_i = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (param0 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    String discarded$4 = ma.a(false);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    if (param0 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    String discarded$5 = ma.a(false);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        var6 = SteelSentinels.field_G;
        if (((ma) this).field_X != null) {
          if (((ma) this).field_X.length > param1) {
            ((ma) this).field_X[param1] = param0;
            if (param2 < -42) {
              return;
            } else {
              field_Y = null;
              return;
            }
          } else {
            var7 = new String[1 + param1];
            var9 = var7;
            var4 = var7;
            if (((ma) this).field_X != null) {
              var5 = 0;
              L0: while (true) {
                if (((ma) this).field_X.length <= var5) {
                  ((ma) this).field_X = var9;
                  ((ma) this).field_X[param1] = param0;
                  if (param2 < -42) {
                    return;
                  } else {
                    field_Y = null;
                    return;
                  }
                } else {
                  var7[var5] = ((ma) this).field_X[var5];
                  var5++;
                  continue L0;
                }
              }
            } else {
              ((ma) this).field_X = var9;
              ((ma) this).field_X[param1] = param0;
              if (param2 >= -42) {
                field_Y = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          var7 = new String[1 + param1];
          var8 = var7;
          var4 = var7;
          if (((ma) this).field_X != null) {
            var5 = 0;
            L1: while (true) {
              if (((ma) this).field_X.length <= var5) {
                ((ma) this).field_X = var8;
                ((ma) this).field_X[param1] = param0;
                if (param2 >= -42) {
                  field_Y = null;
                  return;
                } else {
                  return;
                }
              } else {
                var7[var5] = ((ma) this).field_X[var5];
                var5++;
                continue L1;
              }
            }
          } else {
            ((ma) this).field_X = var8;
            ((ma) this).field_X[param1] = param0;
            if (param2 < -42) {
              return;
            } else {
              field_Y = null;
              return;
            }
          }
        }
    }

    boolean a(int param0, lh param1) {
        if (param0 != 1) {
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
          field_cb = null;
          ((ma) this).a(param0, (byte) -109, param1, param2, ((eg) (Object) ((ma) this).field_p).b((byte) 31, (lh) this));
          return;
        } else {
          ((ma) this).a(param0, (byte) -109, param1, param2, ((eg) (Object) ((ma) this).field_p).b((byte) 31, (lh) this));
          return;
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, 126, param2, param3);
        if (param1 < 56) {
          L0: {
            ((ma) this).a(-59, (byte) 44, 102, -46);
            ((ma) this).field_db = null;
            if (((ma) this).field_C) {
              var5 = -((ma) this).field_o + (oh.field_f - param0);
              var6 = -param3 + (pi.field_c - ((ma) this).field_z);
              ((ma) this).field_db = this.a(-1, var5, var6);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((ma) this).field_db = null;
            if (((ma) this).field_C) {
              var5 = -((ma) this).field_o + (oh.field_f - param0);
              var6 = -param3 + (pi.field_c - ((ma) this).field_z);
              ((ma) this).field_db = this.a(-1, var5, var6);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final vl a(int param0, int param1, int param2) {
        vl var4 = null;
        vl var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (param0 == -1) {
          var4 = (vl) (Object) ((ma) this).field_ab.e(13058);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (vl) (Object) ((ma) this).field_ab.a((byte) -116);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_s > param1) {
                      break L2;
                    } else {
                      if (param2 < var5.field_w) {
                        break L2;
                      } else {
                        if (param1 >= var5.field_s - -var5.field_u) {
                          break L2;
                        } else {
                          if (param2 <= var5.field_o + var5.field_w) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_q;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          ma.c(true);
          var4 = (vl) (Object) ((ma) this).field_ab.e(13058);
          L3: while (true) {
            if (var4 != null) {
              var5 = var4;
              L4: while (true) {
                if (var5 == null) {
                  var4 = (vl) (Object) ((ma) this).field_ab.a((byte) -116);
                  continue L3;
                } else {
                  L5: {
                    if (var5.field_s > param1) {
                      break L5;
                    } else {
                      if (param2 < var5.field_w) {
                        break L5;
                      } else {
                        if (param1 >= var5.field_s - -var5.field_u) {
                          break L5;
                        } else {
                          if (param2 <= var5.field_o + var5.field_w) {
                            return var4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_q;
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        vl var6 = null;
        int var7 = 0;
        int var8 = 0;
        eg var9 = null;
        super.a(param0, (byte) -112, param2, param3);
        if (param3 == 0) {
          var9 = (eg) (Object) ((ma) this).field_p;
          if (param1 > -99) {
            return;
          } else {
            L0: {
              var6 = ((ma) this).field_db;
              if (var6 != null) {
                var7 = var9.a(param2, 3, (lh) this);
                var8 = var9.a((byte) -121, (lh) this, param0);
                L1: while (true) {
                  ha.a(var7 - -var6.field_s - 2, var6.field_u + 2, 2 + var6.field_o, 0, var6.field_w + var8 - 2);
                  var6 = var6.field_q;
                  if (var6 != null) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new vd();
        field_W = -1;
        field_V = -1;
        field_Z = "Ignore";
        field_cb = new ef();
    }
}
