/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends en {
    static int[] field_g;
    private hb field_f;
    static String field_e;
    static String field_h;
    static volatile int field_m;
    static int field_d;
    private h field_k;
    private pj field_i;
    static String field_l;
    static String field_j;

    private final cn a(int param0, int param1) {
        String[] var3 = null;
        Object var4 = null;
        String[] var4_array = null;
        Object var5 = null;
        String[] var5_array = null;
        String[][] var6 = null;
        String[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wb[] var13 = null;
        String var14_ref = null;
        int var14 = 0;
        String var15_ref = null;
        int var15 = 0;
        String var16_ref = null;
        int var16 = 0;
        String var17_ref = null;
        int var17 = 0;
        String var18_ref = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String[] var21 = null;
        String[] var22 = null;
        String[] var23 = null;
        String[] var24 = null;
        String[] var25 = null;
        cn var26 = null;
        String[] var27 = null;
        String var28 = null;
        wb[] var29 = null;
        wb var30 = null;
        String[] var31 = null;
        String var32 = null;
        String[] var33 = null;
        String var34 = null;
        String[] var35 = null;
        String var36 = null;
        String[] var37 = null;
        String var38 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        wb[] stackIn_15_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_14_0 = null;
        wb[] stackOut_13_0 = null;
        L0: {
          var19 = DungeonAssault.field_K;
          jh.c();
          var21 = jn.a(((fc) this).field_k.field_G, new int[1], -102, (se) (Object) la.field_b);
          var3 = var21;
          var4 = null;
          var5 = null;
          var6 = new String[((fc) this).field_k.field_A.length][];
          var7 = new String[((fc) this).field_k.field_A.length][];
          var8 = var21.length;
          var9 = la.field_b.field_E + (var8 + 2) * la.field_b.field_H;
          var10 = la.field_b.field_H;
          if (null != ((fc) this).field_i) {
            if (((fc) this).field_i.b(0, ((fc) this).field_f)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = stackIn_6_0;
          if (null != ((fc) this).field_i) {
            if (((fc) this).field_f == ((fc) this).field_i.field_u) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L1;
            }
          } else {
            stackOut_7_0 = 0;
            stackIn_12_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          var12 = stackIn_12_0;
          if (null == ((fc) this).field_f) {
            stackOut_14_0 = null;
            stackIn_15_0 = (wb[]) (Object) stackOut_14_0;
            break L2;
          } else {
            stackOut_13_0 = ((fc) this).field_f.field_i;
            stackIn_15_0 = stackOut_13_0;
            break L2;
          }
        }
        L3: {
          var13 = stackIn_15_0;
          if (var13 != null) {
            var9 = var9 + db.field_v.field_H * (1 + var13.length);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((fc) this).field_k.field_s != -1) {
            var14_ref = jk.a(new String[1], "<col=178B8B><%0></col>", 30496);
            var22 = ((fc) this).field_k.field_d;
            var16_ref = jk.a(new String[1], lc.field_g, 30496);
            var17_ref = ck.field_H.a(jk.a(new String[1], var22[1], 30496), (byte) -48);
            var24 = jn.a(var16_ref, new int[1], -118, (se) (Object) la.field_b);
            var4_array = var24;
            var23 = jn.a(var17_ref, new int[1], -75, (se) (Object) la.field_b);
            var5_array = var23;
            var9 = var9 + la.field_b.field_H * (var23.length + (var24.length + 2));
            if (var11 != 0) {
              var9 = var9 + db.field_v.field_H;
              break L4;
            } else {
              break L4;
            }
          } else {
            break L4;
          }
        }
        var14 = 0;
        L5: while (true) {
          if (((fc) this).field_k.field_A.length <= var14) {
            L6: {
              if (var12 != 0) {
                var9 = var9 + 2 * db.field_v.field_H;
                break L6;
              } else {
                break L6;
              }
            }
            var26 = new cn(param1, var9);
            var26.e();
            db.field_v.c(((fc) this).field_k.field_F.toUpperCase(), param1 >> -276979807, var10, param0, -1);
            var10 = var10 + la.field_b.field_H * 2;
            var27 = var21;
            var16 = 0;
            L7: while (true) {
              if (var27.length <= var16) {
                L8: {
                  if (var13 == null) {
                    break L8;
                  } else {
                    var10 = var10 + la.field_b.field_H;
                    var29 = var13;
                    var16 = 0;
                    L9: while (true) {
                      if (var29.length <= var16) {
                        break L8;
                      } else {
                        var30 = var29[var16];
                        var18 = db.field_v.b(var30.field_b) + 24;
                        var30.field_c.c(param1 + -var18 >> -1403109023, -(-var30.field_c.field_v + 3 * la.field_b.field_H >> -9756095) + var10, var30.field_a);
                        db.field_v.b(var30.field_b, (-var18 + param1 >> 1902556609) + 24, var10, var30.field_a, -1);
                        var10 = var10 + la.field_b.field_H;
                        var16++;
                        continue L9;
                      }
                    }
                  }
                }
                L10: {
                  if (var12 != 0) {
                    var10 = var10 + db.field_v.field_H;
                    db.field_v.c(od.field_a, param1 >> 1136235745, var10, 16744448, -1);
                    var10 = var10 + db.field_v.field_H;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (0 == (((fc) this).field_k.field_s ^ -1)) {
                    break L11;
                  } else {
                    var31 = var4_array;
                    var16 = 0;
                    L12: while (true) {
                      if (var16 >= var31.length) {
                        L13: {
                          if (var11 == 0) {
                            break L13;
                          } else {
                            var10 = var10 + db.field_v.field_H;
                            db.field_v.c(g.field_Jb, param1 >> -978812127, var10, 1543051, -1);
                            break L13;
                          }
                        }
                        var10 = var10 + 2 * db.field_v.field_H;
                        var33 = var5_array;
                        var16 = 0;
                        L14: while (true) {
                          if (var33.length <= var16) {
                            break L11;
                          } else {
                            var34 = var33[var16];
                            la.field_b.c(var34, param1 >> -125466303, var10, 16777215, -1);
                            var10 = var10 + la.field_b.field_H;
                            var16++;
                            continue L14;
                          }
                        }
                      } else {
                        var32 = var31[var16];
                        var10 = var10 + la.field_b.field_H;
                        db.field_v.c(var32, param1 >> -413241759, var10, 1543051, -1);
                        var16++;
                        continue L12;
                      }
                    }
                  }
                }
                var15 = 0;
                L15: while (true) {
                  if (var15 >= ((fc) this).field_k.field_A.length) {
                    jh.b();
                    return var26;
                  } else {
                    var35 = var6[var15];
                    var17 = 0;
                    L16: while (true) {
                      if (var35.length <= var17) {
                        var10 = var10 + 2 * db.field_v.field_H;
                        var37 = var7[var15];
                        var20 = 0;
                        var17 = var20;
                        L17: while (true) {
                          if (var20 >= var37.length) {
                            var15++;
                            continue L15;
                          } else {
                            var38 = var37[var20];
                            la.field_b.c(var38, param1 >> -836624063, var10, 16777215, -1);
                            var10 = var10 + la.field_b.field_H;
                            var20++;
                            continue L17;
                          }
                        }
                      } else {
                        var36 = var35[var17];
                        var10 = var10 + db.field_v.field_H;
                        db.field_v.c(var36, param1 >> 1222564545, var10, 16744448, -1);
                        var17++;
                        continue L16;
                      }
                    }
                  }
                }
              } else {
                var28 = var27[var16];
                la.field_b.c(var28, param1 >> 1644955457, var10, 16777215, -1);
                var10 = var10 + la.field_b.field_H;
                var16++;
                continue L7;
              }
            }
          } else {
            var15_ref = jk.a(new String[1], "<col=FF8000><%0></col>", param0 ^ 16746719);
            var25 = ((fc) this).field_k.field_D[var14];
            var17_ref = jk.a(new String[1], rm.field_J, 30496);
            var18_ref = ck.field_H.a(jk.a(new String[1], var25[1], 30496), (byte) -48);
            var6[var14] = jn.a(var17_ref, new int[1], -80, (se) (Object) la.field_b);
            var7[var14] = jn.a(var18_ref, new int[1], md.b(param0, -16777100), (se) (Object) la.field_b);
            var9 = var9 + (2 - -var6[var14].length - -var7[var14].length) * la.field_b.field_H;
            var14++;
            continue L5;
          }
        }
    }

    final static boolean a(int param0, byte param1) {
        int var2 = 35 / ((param1 - -60) / 56);
        return 0 <= param0 ? true : false;
    }

    final void a(int param0, sa param1) {
        cn var3 = this.a(16777215, -40 + param1.field_b);
        if (param0 != 0) {
            return;
        }
        param1.a(var3, var3.field_v - -8, false, 110, -la.field_b.field_H + param1.field_y >> -482698559);
    }

    final cn b(byte param0) {
        String[] var13 = null;
        String var14 = null;
        String var15 = null;
        String[] var16 = null;
        String[] var2_array = null;
        int var6 = 0;
        String[] var17 = null;
        String var18 = null;
        String var19 = null;
        String[] var21 = null;
        int var9 = 0;
        String var22 = null;
        int var8 = 0;
        String[] var23 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = DungeonAssault.field_K;
        jh.c();
        Object var2 = null;
        String[][] var3 = new String[((fc) this).field_k.field_A.length][];
        int var4 = db.field_v.field_E + db.field_v.field_H;
        int var5 = db.field_v.field_H;
        if (-1 != ((fc) this).field_k.field_s) {
            String var6_ref = jk.a(new String[1], "<col=178B8B><%0></col>", 30496);
            var13 = ((fc) this).field_k.field_C;
            var14 = var13[0];
            var15 = ck.field_H.a(jk.a(new String[1], var13[1], 30496), (byte) -48);
            var16 = jn.a("<col=178B8B>" + var14 + "</col> - " + var15, new int[1], -94, (se) (Object) db.field_v);
            var2_array = var16;
            var4 = var4 + db.field_v.field_H * (1 - -var16.length);
        }
        for (var6 = 0; var6 < ((fc) this).field_k.field_A.length; var6++) {
            String var7_ref = jk.a(new String[1], "<col=FF8000><%0></col>", 30496);
            var17 = ((fc) this).field_k.field_k[var6];
            var18 = var17[0];
            var19 = ck.field_H.a(jk.a(new String[1], var17[1], 30496), (byte) -48);
            var3[var6] = jn.a("<col=FF8000>" + var18 + "</col> - " + var19, new int[1], -95, (se) (Object) db.field_v);
            var4 = var4 + db.field_v.field_H * (1 - -var3[var6].length);
        }
        cn var20 = new cn(200, var4);
        var20.e();
        int var7 = -80 % ((param0 - -58) / 35);
        db.field_v.c(((fc) this).field_k.field_F, 100, var5, 16777215, -1);
        if (!(-1 == ((fc) this).field_k.field_s)) {
            var5 = var5 + db.field_v.field_H;
            var21 = var2_array;
            for (var9 = 0; var9 < var21.length; var9++) {
                var22 = var21[var9];
                var5 = var5 + la.field_b.field_H;
                db.field_v.c(var22, 100, var5, 16777215, -1);
            }
        }
        for (var8 = 0; ((fc) this).field_k.field_A.length > var8; var8++) {
            var5 = var5 + db.field_v.field_H;
            var23 = var3[var8];
            for (var10 = 0; var10 < var23.length; var10++) {
                var11 = var23[var10];
                var5 = var5 + db.field_v.field_H;
                db.field_v.c(var11, 100, var5, 16777215, -1);
            }
        }
        jh.b();
        return var20;
    }

    public static void b(int param0) {
        field_h = null;
        field_l = null;
        if (param0 != 18677) {
            return;
        }
        field_e = null;
        field_g = null;
        field_j = null;
    }

    final static void a(qk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, qk param11, int param12, int param13, int param14, int param15, se param16, qk param17, int param18, se param19, int param20) {
        lb.a(param16, param19, param20, 2);
        mi.a(param12, 25570, param9, param5, param15);
        wm.a((byte) -66, param3, param13);
        bk.a(param11, (byte) -40, param18, param1, param6, param0);
        if (param14 <= 108) {
            field_l = null;
        }
        mn.a(param8, param17, param10, -8);
        tk.a(param2, -122, param7, param4);
    }

    fc(pj param0, hb param1) {
        ((fc) this).field_f = param1;
        ((fc) this).field_i = param0;
        ((fc) this).field_k = ((fc) this).field_f.field_n;
    }

    fc(h param0) {
        ((fc) this).field_k = param0;
        ((fc) this).field_i = null;
        ((fc) this).field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[4];
        field_e = "The monster failed to trap your raider.";
        field_h = "Serving one of the humans' innumerable dark gods, the priest brings a broad set of skills to any raiding party.";
        field_m = 0;
        field_j = "Try again";
        field_l = "Error connecting to server. Please try using a different server.";
    }
}
