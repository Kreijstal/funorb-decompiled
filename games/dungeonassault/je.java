/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private ec field_n;
    private em field_m;
    static int[] field_d;
    private java.math.BigInteger field_j;
    private cc field_g;
    static String[] field_f;
    private ti[] field_k;
    private bb field_h;
    static String field_l;
    static int field_i;
    private java.math.BigInteger field_e;
    static int field_b;
    static mb field_c;
    static String field_a;

    final static o a(int param0, cf[] param1) {
        int var2 = oi.b(param0, param1.length);
        return gd.a(64, param1[var2]);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = DungeonAssault.field_K;
        if (((je) this).field_k == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((je) this).field_k.length) {
              if (param0 > 46) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (((je) this).field_k.length <= var4) {
                    return;
                  } else {
                    if (((je) this).field_k[var4] != null) {
                      ((je) this).field_k[var4].c(-10790);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (null != ((je) this).field_k[var2]) {
                ((je) this).field_k[var2].b(false);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_l = null;
        if (!param0) {
            field_c = null;
        }
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final boolean b(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ec var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = DungeonAssault.field_K;
        if (null == ((je) this).field_n) {
          L0: {
            if (null == ((je) this).field_m) {
              if (!((je) this).field_h.b(-21431)) {
                ((je) this).field_m = ((je) this).field_h.a(true, 255, (byte) 0, 255, (byte) 69);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (param0 == 113) {
            if (!((je) this).field_m.field_v) {
              L1: {
                L2: {
                  var10 = new ec(((je) this).field_m.b(true));
                  var10.field_o = 5;
                  var3 = var10.c(true);
                  var10.field_o = var10.field_o + 72 * var3;
                  var16 = new byte[-var10.field_o + var10.field_m.length];
                  var14 = var16;
                  var13 = var14;
                  var11 = var13;
                  var4 = var11;
                  var10.a((byte) -105, 0, var16.length, var16);
                  if (null == ((je) this).field_j) {
                    break L2;
                  } else {
                    if (((je) this).field_e != null) {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((je) this).field_j, ((je) this).field_e);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if (65 == var5.length) {
                var17 = rn.a(-5 + (var10.field_o + -var16.length), 5, 8, var10.field_m);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    ((je) this).field_k = new ti[var3];
                    ((je) this).field_n = var10;
                    return true;
                  } else {
                    if (var5[var7 + 1] == var17[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final ti a(boolean param0, int param1, int param2, ln param3, ln param4) {
        int var6 = 0;
        int var7 = 0;
        ti var9 = null;
        byte[] var11 = null;
        if (null != ((je) this).field_n) {
          L0: {
            if (0 > param2) {
              break L0;
            } else {
              if (param2 < ((je) this).field_k.length) {
                if (null != ((je) this).field_k[param2]) {
                  return ((je) this).field_k[param2];
                } else {
                  ((je) this).field_n.field_o = 6 + 72 * param2;
                  var6 = ((je) this).field_n.h(-31);
                  var7 = ((je) this).field_n.h(-54);
                  var11 = new byte[64];
                  ((je) this).field_n.a((byte) -117, 0, 64, var11);
                  var9 = new ti(param2, param4, param3, ((je) this).field_h, ((je) this).field_g, var6, var11, var7, param0);
                  ((je) this).field_k[param2] = var9;
                  if (param1 == 4210752) {
                    return var9;
                  } else {
                    return null;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    je(bb param0, cc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, int param2, cn param3, int param4, int param5) {
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        jh.c();
        gf.e(param4, param2, param4 + param5, param1 + param2);
        int var6 = param2;
        while (var6 < param1 + param2) {
            var7 = param4;
            while (var7 < param5 + param4) {
                param3.h(var7, var6);
                var7 = var7 + param3.field_y;
            }
            var6 = var6 + param3.field_v;
        }
        if (param0 >= -83) {
            return;
        }
        jh.b();
    }

    private je(bb param0, cc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((je) this).field_h = param0;
        ((je) this).field_g = param1;
        ((je) this).field_j = param2;
        ((je) this).field_e = param3;
        if (!((je) this).field_h.b(-21431)) {
            ((je) this).field_m = ((je) this).field_h.a(true, 255, (byte) 0, 255, (byte) 91);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{4210752, 16711680, 16711680, 255, 65280};
        field_l = "EXCLUSIVE";
        field_f = new String[]{null, "Different raiders are better suited for different types of obstacles within the dungeon. Some are good at disarming <%traps>, others at fighting <%monsters>."};
        field_a = "(Including <%0>)";
        field_i = 0;
    }
}
