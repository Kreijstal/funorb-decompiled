/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends da {
    static boolean field_r;
    static ge[] field_o;
    byte[] field_q;
    static String field_m;
    static int[] field_n;
    static int[][] field_p;
    static boolean field_j;
    long field_l;
    static int[][][] field_k;
    int field_i;

    final static int b(int param0, int param1) {
        if (param0 > -28) {
            return 6;
        }
        param1 = param1 & 8191;
        if (-4097 >= (param1 ^ -1)) {
            return (param1 ^ -1) > -6145 ? -k.field_d[-param1 + 6144] : k.field_d[-6144 + param1];
        }
        return -2049 < (param1 ^ -1) ? k.field_d[-param1 + 2048] : -k.field_d[-2048 + param1];
    }

    final static boolean a(int param0) {
        ll.field_i = true;
        ji.field_y = 15000L + ol.a(256);
        if (param0 != 1) {
            Object var2 = null;
            lc.a(20, (uf) null, -87, (byte[]) null, -9, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        return gj.field_c == 11 ? true : false;
    }

    final static void a(int param0, uf param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = TorChallenge.field_F ? 1 : 0;
          var7 = dh.a(param2 + 8, param4);
          if (af.field_d == null) {
            af.field_d = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (null == nh.field_eb) {
                  break L3;
                } else {
                  if (var7 > nh.field_eb.field_m.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              nh.field_eb = new uf(var7);
              break L2;
            }
            L4: {
              L5: {
                nh.field_eb.field_q = 0;
                nh.field_eb.a(param4, param0, param3, -16384);
                nh.field_eb.c(var7, (byte) 36);
                nh.field_eb.a(var15, (byte) -124);
                if (null == bi.field_d) {
                  break L5;
                } else {
                  if (bi.field_d.field_m.length < 100) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              bi.field_d = new uf(100);
              break L4;
            }
            bi.field_d.field_q = 0;
            bi.field_d.d(10, (byte) 122);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (-5 >= (var11 ^ -1)) {
                bi.field_d.a(param4, (byte) 106);
                bi.field_d.a(param6, true, param5);
                param1.a(bi.field_d.field_q, param2, bi.field_d.field_m, param2 ^ -16384);
                param1.a(nh.field_eb.field_q, 0, nh.field_eb.field_m, -16384);
                return;
              } else {
                bi.field_d.a(var15[var11], false);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = af.field_d.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = -1;
          var5 = 0;
          if (v.field_X[0][rf.field_ib][param0][0] > nd.field_e) {
            break L0;
          } else {
            if (nd.field_e < v.field_X[0][rf.field_ib][param0][1]) {
              var4 = v.field_X[0][rf.field_ib][param0][1];
              var3 = v.field_X[0][rf.field_ib][param0][0];
              var5 = -var3 + nd.field_e;
              var2 = var5 * 256 / (var4 + -var3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (v.field_X[1][rf.field_ib][param0][0] > nd.field_e) {
            break L1;
          } else {
            if (nd.field_e < v.field_X[1][rf.field_ib][param0][1]) {
              var3 = v.field_X[1][rf.field_ib][param0][0];
              var4 = v.field_X[1][rf.field_ib][param0][1];
              var5 = -var3 + nd.field_e;
              var2 = 256 - 256 * var5 / (-var3 + var4);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (v.field_X[0][rf.field_ib][param0][0] > nd.field_e) {
            var2 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (nd.field_e < v.field_X[param1][rf.field_ib][param0][1]) {
            break L3;
          } else {
            var2 = 0;
            break L3;
          }
        }
        return var2;
    }

    public static void b(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
        field_k = null;
        if (param0 != -75) {
            field_o = null;
        }
        field_o = null;
    }

    lc(long param0, int param1, byte[] param2) {
        ((lc) this).field_l = param0;
        ((lc) this).field_q = param2;
        ((lc) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_r = false;
        field_p = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[1], new int[2]};
        field_n = new int[]{0, 0};
        field_k = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
