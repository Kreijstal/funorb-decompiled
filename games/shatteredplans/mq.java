/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static String field_b;
    static ms field_c;
    static String field_a;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 114) {
            return;
        }
        field_b = null;
    }

    final static int[] a(int param0, byte param1, int param2) {
        int var3 = je.a(param0, (byte) -104);
        int var4 = oh.b(param0, param1 ^ 96);
        int var5 = je.a(param2, (byte) -104);
        int var6 = oh.b(param2, param1 + -207);
        int var7 = (int)((long)var3 * (long)var5 >> 471396560);
        int var8 = (int)((long)var3 * (long)var6 >> -26069872);
        int var9 = (int)((long)var4 * (long)var5 >> 1293876176);
        if (param1 != 80) {
            int[] discarded$0 = mq.a(54, (byte) -60, 103);
        }
        int var10 = (int)((long)var6 * (long)var4 >> 702001744);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bi[] var5 = null;
        int var6 = 0;
        bi[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (null != ol.field_g) {
            break L0;
          } else {
            if (null != hm.field_q) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (-e.field_f + ei.field_e <= 20) {
            break L1;
          } else {
            if (-21 > (-fk.field_k + kl.field_o ^ -1)) {
              ei.a(true, -fk.field_k + kl.field_o, -e.field_f + ei.field_e, param0 + -12350, fk.field_k, e.field_f, ui.a(3974311, 0, -120, 128));
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (ol.field_g != hm.field_q) {
            break L2;
          } else {
            L3: {
              var1 = e.field_f - -13;
              var2 = 6 + fk.field_k;
              var3 = te.field_c;
              if (eh.field_L != null) {
                if (-1 <= (te.field_c ^ -1)) {
                  return;
                } else {
                  sa.a(te.field_c, var1, (byte) 101, 16, eh.field_L[0], var2);
                  var4 = 1;
                  L4: while (true) {
                    if (eh.field_L.length <= var4) {
                      var2 += 13;
                      break L3;
                    } else {
                      var3 = var3 - ol.field_g.field_j;
                      if (-1 > (var3 ^ -1)) {
                        var2 += 13;
                        sa.a(var3, var1, (byte) 98, 16, eh.field_L[var4], var2);
                        var4++;
                        continue L4;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            if (oi.field_i == null) {
              break L2;
            } else {
              var4 = 0;
              L5: while (true) {
                if (oi.field_i.length <= var4) {
                  break L2;
                } else {
                  var5 = oi.field_i[var4];
                  var6 = rg.field_f[var4];
                  if (var6 > 0) {
                    L6: {
                      var7 = sp.field_m[var4];
                      if (var6 <= 32) {
                        var6 = (var6 << 246875368) / 32;
                        var10 = 0;
                        var8 = var10;
                        L7: while (true) {
                          if (var5.length <= var10) {
                            break L6;
                          } else {
                            var2 += 13;
                            var3 = var3 - ol.field_g.field_j;
                            var5[var10].c(var1, var2, 256);
                            var7[var10].c(var1, var2, var6);
                            var10++;
                            continue L7;
                          }
                        }
                      } else {
                        L8: {
                          var6 = -var6 + 48;
                          if ((var6 ^ -1) > -1) {
                            var6 = 0;
                            break L8;
                          } else {
                            var6 = (var6 << -838397080) / 16;
                            break L8;
                          }
                        }
                        var8 = 0;
                        L9: while (true) {
                          if (var5.length <= var8) {
                            break L6;
                          } else {
                            var3 = var3 - ol.field_g.field_j;
                            var2 += 13;
                            var5[var8].c(var1, var2, var6);
                            var7[var8].c(var1, var2, var6);
                            var8++;
                            continue L9;
                          }
                        }
                      }
                    }
                    if (0 > var3) {
                      te.field_c = te.field_c - var3;
                      var3 = 0;
                      var2 += 13;
                      var4++;
                      continue L5;
                    } else {
                      var2 += 13;
                      var4++;
                      continue L5;
                    }
                  } else {
                    var7_int = 0;
                    L10: while (true) {
                      if (var7_int < var5.length) {
                        var3 = var3 - ol.field_g.field_j;
                        if (var3 <= 0) {
                          return;
                        } else {
                          var2 += 13;
                          sa.a(var3, var1, (byte) 89, 16, var5[var7_int], var2);
                          var7_int++;
                          continue L10;
                        }
                      } else {
                        var2 += 13;
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L11: {
          if (param0 == -44) {
            break L11;
          } else {
            mq.a((byte) 101);
            break L11;
          }
        }
    }

    final static va c(byte param0) {
        if (param0 <= 20) {
            field_a = null;
        }
        va var1 = new va();
        var1.field_f = false;
        var1.field_h = 0;
        var1.field_k = false;
        var1.field_a = 0;
        var1.field_c = 0;
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> would need a rating of <%1> to play with the current options.";
        field_a = "Set up new unrated game";
        field_c = null;
    }
}
