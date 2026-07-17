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
        try {
            ((ma) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, byte param1, String param2, String param3) {
        if (param1 > -60) {
            return;
        }
        try {
            vn.field_i = param3;
            cc.field_Xb = param2;
            bf.a((byte) -102, param0, rh.field_p);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ma.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
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

    public static void c() {
        field_eb = null;
        field_cb = null;
        field_Y = null;
        field_Z = null;
        field_bb = null;
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
        Object var11 = null;
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
                  var11 = (Object) (Object) var16;
                  var12++;
                  continue L1;
                } else {
                  ((vl) var11).field_q = var16;
                  ((ma) this).field_ab.a(3, (ck) (Object) var16);
                  var11 = (Object) (Object) var16;
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

    final static void a(int param0, kf param1) {
        kj var3 = null;
        try {
            var3 = mm.field_g;
            var3.a(param0, (byte) -117);
            var3.a((byte) 115, 5);
            var3.a((byte) 110, 0);
            var3.d(param1.field_C, 96);
            var3.a((byte) 125, param1.field_u);
            var3.a((byte) 113, param1.field_w);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ma.CA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -2864 + 41);
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (wc.field_i == null) {
          String discarded$4 = ma.a(false);
          return;
        } else {
          var1 = (Object) (Object) wc.field_i;
          synchronized (var1) {
            L0: {
              wc.field_i = null;
              break L0;
            }
          }
          String discarded$5 = ma.a(false);
          return;
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ma) this).field_X == null) {
                  break L2;
                } else {
                  if (((ma) this).field_X.length <= param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (((ma) this).field_X != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (((ma) this).field_X.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = ((ma) this).field_X[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((ma) this).field_X = var8;
              break L1;
            }
            ((ma) this).field_X[param1] = param0;
            if (param2 < -42) {
              break L0;
            } else {
              field_Y = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("ma.DA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ma.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            super.a(param0, 126, param2, param3);
            ((ma) this).field_db = null;
            if (((ma) this).field_C) {
              var5_int = -((ma) this).field_o + (oh.field_f - param0);
              var6 = -param3 + (pi.field_c - ((ma) this).field_z);
              ((ma) this).field_db = this.a(-1, var5_int, var6);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ma.H(").append(param0).append(44).append(92).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
    }

    private final vl a(int param0, int param1, int param2) {
        vl var4 = null;
        vl var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
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
    }

    void a(int param0, byte param1, int param2, int param3) {
        vl var6 = null;
        int var7 = 0;
        int var8 = 0;
        eg var9 = null;
        super.a(param0, (byte) -112, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          L0: {
            var9 = (eg) (Object) ((ma) this).field_p;
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
