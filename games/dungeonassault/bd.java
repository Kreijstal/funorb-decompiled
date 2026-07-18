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
        String var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb[] var8 = null;
        int var9 = 0;
        cn var10 = null;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String[] var17 = null;
        String var18 = null;
        wb[] var19 = null;
        wb var20 = null;
        wb[] stackIn_3_0 = null;
        boolean stackIn_9_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        wb[] stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          var15 = DungeonAssault.field_K;
          jh.c();
          var3 = ck.field_H.a(((bd) this).field_h.field_t, (byte) -48);
          var4 = jn.a(var3, new int[1], -98, (se) (Object) la.field_b);
          var5 = var4.length;
          var6 = (var5 - -2) * la.field_b.field_H - -la.field_b.field_E;
          var7 = la.field_b.field_H;
          if (null != ((bd) this).field_d) {
            stackOut_2_0 = ((bd) this).field_d.field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (wb[]) (Object) stackOut_1_0;
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
          if (null != ((bd) this).field_d) {
            stackOut_8_0 = ((bd) this).field_d.field_i;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = ((bd) this).field_h.field_b;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var9 = stackIn_9_0 ? 1 : 0;
            stackOut_9_0 = var9;
            stackIn_13_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (((bd) this).field_h.field_g == 2) {
              break L4;
            } else {
              stackOut_10_0 = stackIn_10_0;
              stackIn_13_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (((bd) this).field_h.field_g == 1) {
                break L4;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackIn_14_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (((bd) this).field_h.field_g != 3) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L3;
                } else {
                  stackOut_12_0 = stackIn_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                }
              }
            }
          }
          stackOut_13_0 = stackIn_13_0;
          stackOut_13_1 = 1;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
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
        var10 = new cn(param1, var6);
        var10.e();
        db.field_v.c(((bd) this).field_h.field_z.toUpperCase(), param1 >> 1, var7, 16777215, -1);
        var7 = var7 + la.field_b.field_H * 2;
        var17 = var4;
        var12 = 0;
        L6: while (true) {
          if (var12 >= var17.length) {
            L7: {
              if (var9 == 0) {
                break L7;
              } else {
                L8: {
                  var7 = var7 + la.field_b.field_H;
                  if (2 == ((bd) this).field_h.field_g) {
                    db.field_v.c(rb.field_K, param1 >> 1, var7, 16711680, -1);
                    break L8;
                  } else {
                    if (((bd) this).field_h.field_g != 1) {
                      if (3 != ((bd) this).field_h.field_g) {
                        break L8;
                      } else {
                        db.field_v.c(lf.field_m, param1 >> 1, var7, 16711680, -1);
                        break L8;
                      }
                    } else {
                      db.field_v.c(gm.field_a, param1 >> 1, var7, 16711680, -1);
                      break L8;
                    }
                  }
                }
                var7 = var7 + la.field_b.field_H;
                break L7;
              }
            }
            L9: {
              if (var8 != null) {
                var7 = var7 + la.field_b.field_H;
                var19 = var8;
                var16 = 0;
                var12 = var16;
                L10: while (true) {
                  if (var16 >= var19.length) {
                    break L9;
                  } else {
                    var20 = var19[var16];
                    var14 = db.field_v.b(var20.field_b) - -24;
                    var20.field_c.c(-var14 + param1 >> 1, -(-var20.field_c.field_v + la.field_b.field_H * 3 >> 1) + var7, var20.field_a);
                    db.field_v.b(ck.field_H.a(var20.field_b, (byte) -48), 24 + (-var14 + param1 >> 1), var7, var20.field_a, -1);
                    var7 = var7 + la.field_b.field_H;
                    var16++;
                    continue L10;
                  }
                }
              } else {
                break L9;
              }
            }
            jh.b();
            return var10;
          } else {
            var18 = var17[var12];
            la.field_b.c(var18, param1 >> 1, var7, 16777215, -1);
            var7 = var7 + la.field_b.field_H;
            var12++;
            continue L6;
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
        String var2 = null;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        cn var5 = null;
        int var6 = 0;
        Object[] var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        String var11 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        L0: {
          var10 = DungeonAssault.field_K;
          jh.c();
          var2 = ((bd) this).field_h.field_o;
          if (var2 != null) {
            break L0;
          } else {
            if (((bd) this).field_h.field_b) {
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
            int discarded$2 = 30496;
            var4_ref_String = jk.a(new String[1], "<col=178B8B><%0></col>");
            int discarded$3 = 30496;
            var11 = ck.field_H.a(jk.a(new String[1], var2), (byte) -48);
            var2 = var11;
            var3 = (Object) (Object) jn.a(var11, new int[1], -122, (se) (Object) db.field_v);
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = db.field_v.field_H;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (var2 == null) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 2 + ((Object[]) var3).length;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0 * stackIn_9_1 + db.field_v.field_E;
          var5 = new cn(200, var4);
          var5.e();
          var6 = db.field_v.field_H;
          db.field_v.c(((bd) this).field_h.field_z, 100, var6, 16777215, -1);
          var6 = var6 + db.field_v.field_H;
          if (var2 != null) {
            var7_ref = (Object[]) var3;
            var8 = 0;
            L4: while (true) {
              if (var7_ref.length <= var8) {
                break L3;
              } else {
                var9 = var7_ref[var8];
                var6 = var6 + db.field_v.field_H;
                db.field_v.c((String) var9, 100, var6, 16777215, -1);
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
                ((bd) this).field_d = null;
            }
            var3 = this.a(true, -40 + param1.field_b);
            param1.a(var3, 8 + var3.field_v, false, 111, -la.field_b.field_H + param1.field_y >> 1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "bd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            ((bd) this).field_d = param1;
            ((bd) this).field_h = ((bd) this).field_d.field_h;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bd(ac param0) {
        try {
            ((bd) this).field_h = param0;
            ((bd) this).field_d = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
