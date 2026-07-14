/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends hd {
    private vu[] field_Eb;
    private bb[] field_Ob;
    private char[] field_Hb;
    static java.math.BigInteger field_Nb;
    private int field_zb;
    private int field_Bb;
    private int field_yb;
    private int field_Gb;
    private int[] field_Jb;
    private bb field_Kb;
    private int field_Cb;
    static String field_Ib;
    static int[] field_Mb;
    static String field_Db;
    private int field_Fb;
    private int field_Ab;
    private int field_Lb;

    final int h(byte param0) {
        int var2 = 22 % ((-56 - param0) / 60);
        return ((bb) this).field_Bb + (null == ((bb) this).field_Kb ? 0 : ((bb) this).field_Kb.h((byte) 107));
    }

    final boolean h(int param0) {
        int var4 = 0;
        vu var5 = null;
        int var6 = Kickabout.field_G;
        int var2 = 0;
        vu[] var3 = ((bb) this).field_Eb;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_sb != 0 ? 1 : 0);
        }
        if (param0 > -95) {
            ((bb) this).field_Fb = -119;
        }
        if (var2 == 0) {
            if (-1 != ((bb) this).field_Cb) {
                if (null != ((bb) this).field_Ob[((bb) this).field_Cb]) {
                    var2 = ((bb) this).field_Ob[((bb) this).field_Cb].h(-128) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, byte param2) {
        int var4_int = 0;
        bb var4 = null;
        vu var5 = null;
        int var6 = 0;
        bb var7 = null;
        vu stackIn_5_0 = null;
        vu stackIn_6_0 = null;
        vu stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vu stackOut_4_0 = null;
        vu stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vu stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = Kickabout.field_G;
        var4_int = 0;
        L0: while (true) {
          if (((bb) this).field_Eb.length <= var4_int) {
            L1: {
              if (((bb) this).field_Cb == -1) {
                break L1;
              } else {
                var7 = ((bb) this).field_Ob[((bb) this).field_Cb];
                var4 = var7;
                if (var4 != null) {
                  var7.b(param0, param1, (byte) -127);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((((bb) this).field_zb ^ -1) >= -1) {
                break L2;
              } else {
                this.b(param2 ^ 4, ((bb) this).field_zb - 1);
                break L2;
              }
            }
            L3: {
              if (param2 == -127) {
                break L3;
              } else {
                field_Nb = null;
                break L3;
              }
            }
            return;
          } else {
            var5 = ((bb) this).field_Eb[var4_int];
            if (1 == var5.field_sb) {
              L4: {
                this.a(var4_int, (byte) -51, param1, param0);
                stackOut_4_0 = (vu) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((bb) this).field_Cb) {
                  stackOut_6_0 = (vu) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (vu) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_I = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_Db = null;
        field_Nb = null;
        field_Mb = null;
        if (param0 < 26) {
            ff discarded$0 = bb.a((byte) 45, 76);
        }
        field_Ib = null;
    }

    bb(long param0, hd param1, hd param2, hd param3, bb[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        ut var14 = null;
        int var15 = 0;
        hu var17 = null;
        hu var18 = null;
        ((bb) this).field_Cb = -1;
        ((bb) this).field_Ob = param4;
        ((bb) this).field_Jb = param5;
        ((bb) this).field_Hb = param7;
        ((bb) this).field_Fb = ((bb) this).field_Jb.length;
        var17 = param3.field_X;
        var18 = var17;
        ((bb) this).field_Ab = var18.field_p + (2 - -var18.field_G);
        ((bb) this).field_Gb = 0;
        ((bb) this).field_Eb = new vu[((bb) this).field_Fb];
        ((bb) this).field_yb = ((bb) this).field_Fb * ((bb) this).field_Ab;
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (((bb) this).field_Fb <= var13) {
            ((bb) this).field_Gb = ((bb) this).field_Gb + (ci.field_g.field_o - -10);
            this.b(-88, 12);
          } else {
            L1: {
              if (((bb) this).field_Hb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + bn.a(((bb) this).field_Hb[var13], (byte) -83).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (((bb) this).field_Ob[var13] != null) {
                  break L3;
                } else {
                  if ((((bb) this).field_Jb[var13] ^ -1) != 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = ci.field_g;
              break L2;
            }
            ((bb) this).field_Eb[var13] = new vu(0L, param2, (hd) null, param3, var14, param6[var13]);
            ((bb) this).a((byte) -112, (hd) (Object) ((bb) this).field_Eb[var13]);
            var15 = var17.a(param6[var13]);
            if (var15 > ((bb) this).field_Gb) {
              ((bb) this).field_Gb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var3 = 0;
        vu var4 = null;
        int var5 = Kickabout.field_G;
        vu[] var6 = ((bb) this).field_Eb;
        vu[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_sb = 0;
            var4.field_I = false;
        }
        if (param0 != 5075) {
            this.b(-73, 28);
        }
        if (null != ((bb) this).field_Kb) {
            ((bb) this).field_Kb.a(5075);
            ((bb) this).field_Kb.c((byte) -109);
        }
        ((bb) this).field_Cb = -1;
        ((bb) this).field_Kb = null;
        this.b(param0 ^ -5005, 12);
    }

    final static ff a(byte param0, int param1) {
        int var2 = 0;
        ff[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var2 = -45 % ((param0 - 92) / 32);
        var3 = rp.b(-27666);
        var4 = 0;
        L0: while (true) {
          if (var3.length > var4) {
            if (param1 != var3[var4].field_a) {
              var4++;
              continue L0;
            } else {
              return var3[var4];
            }
          } else {
            return null;
          }
        }
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        ((bb) this).field_zb = param1;
        if (param0 >= -84) {
            return;
        }
        for (var5 = 0; var5 < ((bb) this).field_Fb; var5++) {
            var4 = ((bb) this).field_zb * ((bb) this).field_zb;
            var3 = ((bb) this).field_Ab * var5;
            ((bb) this).field_Eb[var5].field_J = (var4 * (((bb) this).field_Lb + -((bb) this).field_T) + var3 * (-var4 + 144)) / 144;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var7 = Kickabout.field_G;
        if (((bb) this).field_Cb == param0) {
            ((bb) this).a(5075);
            this.b(-90, 0);
        } else {
            if (((bb) this).field_Ob[param0] != null) {
                ((bb) this).a(5075);
                this.b(-117, 0);
                ((bb) this).field_Cb = param0;
                ((bb) this).field_Kb = ((bb) this).field_Ob[((bb) this).field_Cb];
                ds.a(-1, ((bb) this).field_Kb);
                ((bb) this).field_Kb.b(-94, 12);
            } else {
                if (0 != ((bb) this).field_Jb[param0]) {
                    var5 = ((bb) this).field_Jb[param0] | 32768;
                    var6 = ov.field_b;
                    if (-1 == var6) {
                        if (uv.field_i != null) {
                            var6 = 1;
                        }
                    }
                    if ((r.a(0, var6) ^ -1) == -3) {
                        gd.a(21, 1, var6, param2);
                    }
                    Object var8 = null;
                    gp.a(var5, -128, ov.field_b, param3, at.field_Kb, (String) null);
                    gk.a(at.field_Kb, var5, ik.field_A, ov.field_b, (byte) -51);
                    fa.b(125);
                    jm.b(68);
                } else {
                    gw.a(8);
                    fa.b(-123);
                }
            }
        }
        if (param1 > -20) {
            boolean discarded$0 = ((bb) this).h(-11);
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var8 = Kickabout.field_G;
          if ((cc.field_e ^ -1) != -86) {
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
        if (null != ((bb) this).field_Kb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == ((bb) this).field_Kb.field_Cb) {
                ((bb) this).a(5075);
                this.b(-105, 0);
                return true;
              } else {
                break L1;
              }
            }
          }
          return ((bb) this).field_Kb.a(param0, param1, (byte) -18);
        } else {
          L2: {
            if (null != ((bb) this).field_Kb) {
              break L2;
            } else {
              if ((Object) (Object) dr.field_g != this) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  fa.b(98);
                  return true;
                }
              }
            }
          }
          var5 = il.field_c;
          var6 = -4 / ((param2 - 25) / 38);
          if (var5 > 0) {
            L3: {
              if (var5 == ml.field_v) {
                var5 = 63;
                break L3;
              } else {
                break L3;
              }
            }
            var7 = 0;
            L4: while (true) {
              if (((bb) this).field_Hb.length <= var7) {
                return false;
              } else {
                if (var5 == ((bb) this).field_Hb[var7]) {
                  this.a(var7, (byte) -115, param1, param0);
                  return true;
                } else {
                  var7++;
                  continue L4;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        ((bb) this).field_Bb = param1 * 2 + ((bb) this).field_Gb;
        ((bb) this).a(true, ((bb) this).field_Bb, param2, param4 - ((bb) this).field_yb, ((bb) this).field_yb);
        if (((bb) this).field_Lb != param5) {
            ((bb) this).field_Lb = param5;
            this.b(-119, ((bb) this).field_zb);
        }
        int var7 = 0;
        if (param0) {
            ((bb) this).field_Jb = null;
        }
        while (((bb) this).field_Fb > var7) {
            ((bb) this).field_Eb[var7].a(param3, param1, ((bb) this).field_Bb, ((bb) this).field_Eb[var7].field_J, 0, 15114, ((bb) this).field_Ab);
            var7++;
        }
        if (-1 != ((bb) this).field_Cb) {
            if (!(((bb) this).field_Ob[((bb) this).field_Cb] == null)) {
                var7 = ((bb) this).field_Ob[((bb) this).field_Cb].field_Fb;
                var8 = (var7 + ((bb) this).field_Cb) * ((bb) this).field_Ab + ((bb) this).field_J;
                while (param4 < var8) {
                    var8 = var8 - ((bb) this).field_Ab;
                }
                ((bb) this).field_Ob[((bb) this).field_Cb].a(param0, param1, ((bb) this).field_Bb + param2, param3, var8, ((bb) this).field_Eb[((bb) this).field_Cb].field_T);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = new java.math.BigInteger("65537");
        field_Ib = "Loading extra data (2/2)";
        field_Db = "to the Quarter-Finals";
    }
}
