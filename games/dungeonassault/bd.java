/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends en {
    static cn field_g;
    static int field_f;
    private ai field_d;
    private ac field_h;
    static String[] field_e;

    private final cn a(boolean param0, int param1) {
        wb[] stackIn_3_0 = null;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        String var3;
        String[] var4;
        int var5;
        int var6;
        int var7;
        wb[] var8;
        int var9;
        cn var10;
        int var12;
        int var14;
        int var15;
        sa var16;
        int var17;
        String[] var18;
        String var19;
        wb[] var20;
        wb var21;
        L0: {
          var15 = DungeonAssault.field_K;
          jh.c();
          var3 = ck.field_H.a(this.field_h.field_t, (byte) -48);
          var4 = jn.a(var3, new int[]{param1}, -98, la.field_b);
          var5 = var4.length;
          var6 = (var5 - -2) * la.field_b.field_H - -la.field_b.field_E;
          var7 = la.field_b.field_H;
          if (null != this.field_d) {
            stackIn_3_0 = this.field_d.field_f;
            break L0;
          } else {
            stackIn_3_0 = null;
            break L0;
          }
        }
        L1: {
          var8 = stackIn_3_0;
          if (var8 != null) {
            var6 = var6 + (var8.length - -1) * db.field_v.field_H;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null != this.field_d) {
            stackIn_9_0 = this.field_d.field_i;
            break L2;
          } else {
            stackIn_9_0 = this.field_h.field_b;
            break L2;
          }
        }
        L3: {
          L4: {
            var9 = stackIn_9_0 ? 1 : 0;
            stackIn_13_0 = var9;

            if (this.field_h.field_g == 2) {
              break L4;
            } else {

              if (this.field_h.field_g == 1) {
                break L4;
              } else {


                if (-4 != (this.field_h.field_g ^ -1)) {
                  stackIn_15_0 = stackIn_13_0;
                  stackIn_15_1 = 0;
                  break L3;
                } else {

                  break L4;
                }
              }
            }
          }
          stackIn_15_0 = stackIn_13_0;
          stackIn_15_1 = 1;
          break L3;
        }
        L5: {
          var9 = stackIn_15_0 & stackIn_15_1;
          if (var9 == 0) {
            break L5;
          } else {
            var6 = var6 + 2 * db.field_v.field_H;
            break L5;
          }
        }
        L6: {
          var10 = new cn(param1, var6);
          var10.e();
          db.field_v.c(this.field_h.field_z.toUpperCase(), param1 >> 1294990081, var7, 16777215, -1);
          var7 = var7 + la.field_b.field_H * 2;
          if (param0) {
            break L6;
          } else {
            var16 = (sa) null;
            this.a(80, (sa) null);
            break L6;
          }
        }
        var18 = var4;
        var12 = 0;
        L7: while (true) {
          if (var12 >= var18.length) {
            L8: {
              if (var9 == 0) {
                break L8;
              } else {
                L9: {
                  var7 = var7 + la.field_b.field_H;
                  if (2 == this.field_h.field_g) {
                    db.field_v.c(rb.field_K, param1 >> 3111937, var7, 16711680, -1);
                    break L9;
                  } else {
                    if (-2 != (this.field_h.field_g ^ -1)) {
                      if (3 != this.field_h.field_g) {
                        break L9;
                      } else {
                        db.field_v.c(lf.field_m, param1 >> -1079794143, var7, 16711680, -1);
                        break L9;
                      }
                    } else {
                      db.field_v.c(gm.field_a, param1 >> 309056961, var7, 16711680, -1);
                      break L9;
                    }
                  }
                }
                var7 = var7 + la.field_b.field_H;
                break L8;
              }
            }
            L10: {
              if (var8 != null) {
                var7 = var7 + la.field_b.field_H;
                var20 = var8;
                var17 = 0;
                var12 = var17;
                L11: while (true) {
                  if (var17 >= var20.length) {
                    break L10;
                  } else {
                    var21 = var20[var17];
                    var14 = db.field_v.b(var21.field_b) - -24;
                    var21.field_c.c(-var14 + param1 >> -1438539359, -(-var21.field_c.field_v + la.field_b.field_H * 3 >> 1700686177) + var7, var21.field_a);
                    db.field_v.b(ck.field_H.a(var21.field_b, (byte) -48), 24 + (-var14 + param1 >> 1163385153), var7, var21.field_a, -1);
                    var7 = var7 + la.field_b.field_H;
                    var17++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
            jh.b();
            return var10;
          } else {
            var19 = var18[var12];
            la.field_b.c(var19, param1 >> -2033248223, var7, 16777215, -1);
            var7 = var7 + la.field_b.field_H;
            var12++;
            continue L7;
          }
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 != 113) {
            bd.a(123, (byte) 56);
        }
        wj var2 = ac.field_B;
        var2.d((byte) -82, param0);
        var2.a(6, 1);
        var2.a(6, 2);
    }

    final cn b(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        String var2;
        Object var3;
        String var4_ref_String;
        int var4;
        cn var5;
        int var6;
        Object[] var7_ref;
        int var7;
        int var8;
        Object var9;
        int var10;
        String var11;
        L0: {
          var10 = DungeonAssault.field_K;
          jh.c();
          var2 = this.field_h.field_o;
          if (var2 != null) {
            break L0;
          } else {
            if (this.field_h.field_b) {
              var2 = lg.field_s;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var3 = null;
          if (var2 == null) {
            break L1;
          } else {
            var4_ref_String = jk.a(new String[]{this.field_h.field_z.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
            var11 = ck.field_H.a(jk.a(new String[]{var4_ref_String}, var2, 30496), (byte) -48);
            var2 = var11;
            var3 = jn.a(var11, new int[]{200}, -122, db.field_v);
            break L1;
          }
        }
        L2: {
          stackIn_8_0 = db.field_v.field_H;

          if (var2 == null) {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 1;
            break L2;
          } else {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 2 + java.lang.reflect.Array.getLength(var3);
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0 * stackIn_9_1 + db.field_v.field_E;
          var5 = new cn(200, var4);
          var5.e();
          var6 = db.field_v.field_H;
          db.field_v.c(this.field_h.field_z, 100, var6, 16777215, -1);
          var6 = var6 + db.field_v.field_H;
          if (var2 != null) {
            var7_ref = (Object[]) (Object) (var3);
            var8 = 0;
            L4: while (true) {
              if (var7_ref.length <= var8) {
                break L3;
              } else {
                var9 = var7_ref[var8];
                var6 = var6 + db.field_v.field_H;
                db.field_v.c((String) (var9), 100, var6, 16777215, -1);
                var8++;
                continue L4;
              }
            }
          } else {
            break L3;
          }
        }
        jh.b();
        var7 = 119 % ((param0 - -58) / 35);
        return var5;
    }

    final void a(int param0, sa param1) {
        cn var3 = null;
        try {
            if (param0 != 0) {
                this.field_d = (ai) null;
            }
            var3 = this.a(true, -40 + param1.field_b);
            param1.a(var3, 8 + var3.field_v, false, 111, -la.field_b.field_H + param1.field_y >> 823221761);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        if (param0 < 65) {
            bd.b(64);
        }
    }

    bd(pj param0, ai param1) {
        try {
            this.field_d = param1;
            this.field_h = this.field_d.field_h;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bd(ac param0) {
        try {
            this.field_h = param0;
            this.field_d = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
