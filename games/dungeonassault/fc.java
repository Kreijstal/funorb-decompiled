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
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        wb[] stackIn_15_0 = null;
        String[] var3;
        Object var4;
        Object var5;
        String[][] var6;
        String[][] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        wb[] var13;
        String var14_ref_String;
        int var14;
        int var15;
        String var15_ref_String;
        String var16_ref_String;
        int var16;
        String var17_ref_String;
        int var17;
        int var18;
        String var18_ref_String;
        int var19;
        int var20;
        String[] var21;
        String[] var22;
        String[] var23;
        String[] var24;
        String[] var25;
        cn var26;
        String[] var27;
        String var28;
        wb[] var29;
        wb var30;
        Object[] var31;
        Object var32;
        Object[] var33;
        Object var34;
        String[] var35;
        String var36;
        String[] var37;
        String var38;
        L0: {
          var19 = DungeonAssault.field_K;
          jh.c();
          var21 = jn.a(this.field_k.field_G, new int[]{param1}, -102, la.field_b);
          var3 = var21;
          var4 = null;
          var5 = null;
          var6 = new String[this.field_k.field_A.length][];
          var7 = new String[this.field_k.field_A.length][];
          var8 = var21.length;
          var9 = la.field_b.field_E + (var8 + 2) * la.field_b.field_H;
          var10 = la.field_b.field_H;
          if (null != this.field_i) {
            if (this.field_i.b(0, this.field_f)) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          var11 = stackIn_6_0;
          if (null != this.field_i) {
            if (this.field_f == this.field_i.field_u) {
              stackIn_12_0 = 1;
              break L1;
            } else {
              stackIn_12_0 = 0;
              break L1;
            }
          } else {
            stackIn_12_0 = 0;
            break L1;
          }
        }
        L2: {
          var12 = stackIn_12_0;
          if (null == this.field_f) {
            stackIn_15_0 = null;
            break L2;
          } else {
            stackIn_15_0 = this.field_f.field_i;
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
          if (this.field_k.field_s != -1) {
            var14_ref_String = jk.a(new String[]{this.field_k.field_F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
            var22 = this.field_k.field_d;
            var16_ref_String = jk.a(new String[]{var22[0]}, lc.field_g, 30496);
            var17_ref_String = ck.field_H.a(jk.a(new String[]{var14_ref_String}, var22[1], 30496), (byte) -48);
            var24 = jn.a(var16_ref_String, new int[]{param1}, -118, la.field_b);
            var4 = var24;
            var23 = jn.a(var17_ref_String, new int[]{param1}, -75, la.field_b);
            var5 = var23;
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
          if (this.field_k.field_A.length <= var14) {
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
            db.field_v.c(this.field_k.field_F.toUpperCase(), param1 >> -276979807, var10, param0, -1);
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
                  if (0 == (this.field_k.field_s ^ -1)) {
                    break L11;
                  } else {
                    var31 = (Object[]) (Object) (var4);
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
                        var33 = (Object[]) (Object) (var5);
                        var16 = 0;
                        L14: while (true) {
                          if (var33.length <= var16) {
                            break L11;
                          } else {
                            var34 = var33[var16];
                            la.field_b.c((String) (var34), param1 >> -125466303, var10, 16777215, -1);
                            var10 = var10 + la.field_b.field_H;
                            var16++;
                            continue L14;
                          }
                        }
                      } else {
                        var32 = var31[var16];
                        var10 = var10 + la.field_b.field_H;
                        db.field_v.c((String) (var32), param1 >> -413241759, var10, 1543051, -1);
                        var16++;
                        continue L12;
                      }
                    }
                  }
                }
                var15 = 0;
                L15: while (true) {
                  if (var15 >= this.field_k.field_A.length) {
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
            var15_ref_String = jk.a(new String[]{this.field_k.field_F.toUpperCase()}, "<col=FF8000><%0></col>", param0 ^ 16746719);
            var25 = this.field_k.field_D[var14];
            var17_ref_String = jk.a(new String[]{var25[0]}, rm.field_J, 30496);
            var18_ref_String = ck.field_H.a(jk.a(new String[]{var15_ref_String}, var25[1], 30496), (byte) -48);
            var6[var14] = jn.a(var17_ref_String, new int[]{param1}, -80, la.field_b);
            var7[var14] = jn.a(var18_ref_String, new int[]{param1}, md.b(param0, -16777100), la.field_b);
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
        try {
            param1.a(var3, var3.field_v - -8, false, 110, -la.field_b.field_H + param1.field_y >> -482698559);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final cn b(byte param0) {
        String var6_ref_String = null;
        String[] var13 = null;
        String var14 = null;
        String var15 = null;
        String[] var16 = null;
        int var6 = 0;
        String var7_ref_String = null;
        String[] var17 = null;
        String var18 = null;
        String var19 = null;
        Object[] var21 = null;
        int var9 = 0;
        Object var22 = null;
        int var8 = 0;
        String[] var23 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = DungeonAssault.field_K;
        jh.c();
        Object var2 = null;
        String[][] var3 = new String[this.field_k.field_A.length][];
        int var4 = db.field_v.field_E + db.field_v.field_H;
        int var5 = db.field_v.field_H;
        if (-1 != this.field_k.field_s) {
            var6_ref_String = jk.a(new String[]{this.field_k.field_F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
            var13 = this.field_k.field_C;
            var14 = var13[0];
            var15 = ck.field_H.a(jk.a(new String[]{var6_ref_String}, var13[1], 30496), (byte) -48);
            var16 = jn.a("<col=178B8B>" + var14 + "</col> - " + var15, new int[]{200}, -94, db.field_v);
            var2 = var16;
            var4 = var4 + db.field_v.field_H * (1 - -var16.length);
        }
        for (var6 = 0; var6 < this.field_k.field_A.length; var6++) {
            var7_ref_String = jk.a(new String[]{this.field_k.field_F.toUpperCase()}, "<col=FF8000><%0></col>", 30496);
            var17 = this.field_k.field_k[var6];
            var18 = var17[0];
            var19 = ck.field_H.a(jk.a(new String[]{var7_ref_String}, var17[1], 30496), (byte) -48);
            var3[var6] = jn.a("<col=FF8000>" + var18 + "</col> - " + var19, new int[]{200}, -95, db.field_v);
            var4 = var4 + db.field_v.field_H * (1 - -var3[var6].length);
        }
        cn var20 = new cn(200, var4);
        var20.e();
        int var7 = -80 % ((param0 - -58) / 35);
        db.field_v.c(this.field_k.field_F, 100, var5, 16777215, -1);
        if (!(-1 == this.field_k.field_s)) {
            var5 = var5 + db.field_v.field_H;
            var21 = (Object[]) (Object) (var2);
            for (var9 = 0; var9 < var21.length; var9++) {
                var22 = var21[var9];
                var5 = var5 + la.field_b.field_H;
                db.field_v.c((String) (var22), 100, var5, 16777215, -1);
            }
        }
        for (var8 = 0; this.field_k.field_A.length > var8; var8++) {
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              lb.a(param16, param19, param20, 2);
              mi.a(param12, 25570, param9, param5, param15);
              wm.a((byte) -66, param3, param13);
              bk.a(param11, (byte) -40, param18, param1, param6, param0);
              if (param14 > 108) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            mn.a(param8, param17, param10, -8);
            tk.a(param2, -122, param7, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("fc.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param17 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param20 + ')');
        }
    }

    fc(pj param0, hb param1) {
        try {
            this.field_f = param1;
            this.field_i = param0;
            this.field_k = this.field_f.field_n;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fc(h param0) {
        try {
            this.field_k = param0;
            this.field_i = null;
            this.field_f = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[4];
        field_e = "The monster failed to trap your raider.";
        field_h = "Serving one of the humans' innumerable dark gods, the priest brings a broad set of skills to any raiding party.";
        field_m = 0;
        field_j = "Try again";
        field_l = "Error connecting to server. Please try using a different server.";
    }
}
