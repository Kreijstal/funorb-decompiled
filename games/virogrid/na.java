/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends km {
    static km field_Ib;
    static String field_Eb;
    private km field_Jb;
    static lc field_Fb;
    static String field_Gb;
    static int field_Hb;

    final static void a(long param0, String param1, int param2) {
        sd.field_e = 2;
        va.field_d = param1;
        CharSequence var5 = (CharSequence) (Object) param1;
        d.field_Gb = c.a(var5, true);
        oc.field_n = param0;
        qc.field_h = true;
        if (param2 != -1) {
            na.e((byte) 44);
        }
    }

    final static int a(boolean param0, int param1, byte[] param2) {
        if (param0) {
            return -52;
        }
        return ed.a(param1, 0, param2, -26459);
    }

    public static void e(byte param0) {
        field_Fb = null;
        field_Eb = null;
        if (param0 != 56) {
            Object var2 = null;
            na.a(-94L, (String) null, 9);
        }
        field_Ib = null;
        field_Gb = null;
    }

    na(km param0, km param1, km param2, km param3, km param4, km param5) {
        int var12 = 0;
        km var13 = null;
        km var14 = null;
        int var15 = 0;
        km var17 = new km(0L, param1, je.field_G.toUpperCase());
        var17.field_lb = 1;
        ((na) this).field_Jb = new km(0L, param2);
        km var8 = new km(0L, param3);
        km var9 = new km(0L, param3, gd.field_q);
        var9.field_lb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; dl.field_a.length > var12; var12++) {
            var13 = new km(0L, param3, lb.field_b[var12]);
            var14 = new km(0L, param3, dl.field_a[var12]);
            var15 = param3.field_C.a(dl.field_a[var12]);
            var13.a(20, 15, 65, (byte) -76, var10);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.a(90, 15, 640, (byte) -79, var10);
            var8.a(0, var13);
            var8.a(0, var14);
            var10 += 30;
        }
        var17.a(0, 24, 90 + (var11 + 20), (byte) -69, 0);
        var10 += 15;
        ((na) this).a(100, var10 - -var17.field_ub, var17.field_K, (byte) -87, 100);
        ((na) this).field_Jb.a(var17.field_K - 20, 15, 15, (byte) -93, 5);
        var8.a(0, -var17.field_ub + ((na) this).field_ub, ((na) this).field_K, (byte) -103, var17.field_ub);
        var9.a(0, 15, ((na) this).field_K, (byte) -56, 20);
        var8.field_vb = ne.a(var8.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
        var17.a(0, ((na) this).field_Jb);
        var8.a(0, var9);
        ((na) this).a(0, var17);
        ((na) this).a(0, var8);
        var10 = -(((na) this).field_ub >> -446221023) + 240;
        ((na) this).field_tb = 320 + -(((na) this).field_K >> 2031986913);
    }

    final boolean a(boolean param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            L2: {
              ((na) this).a(param0, (byte) 89);
              if (-1 == (oi.field_g ^ -1)) {
                break L2;
              } else {
                if (((na) this).field_nb == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (((na) this).field_Jb.field_nb == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              break L1;
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          var2 = param1.length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            if (param0 == 51) {
              return new String(var8);
            } else {
              return null;
            }
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (65 > var5) {
                break L2;
              } else {
                if (var5 > 90) {
                  break L2;
                } else {
                  var3[var4] = (char)(97 + (-65 + var5));
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (var5 > 57) {
                    break L5;
                  } else {
                    break L3;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "This game is full.";
        field_Fb = new lc(7, 0, 1, 1);
        field_Gb = "Who can join";
    }
}
