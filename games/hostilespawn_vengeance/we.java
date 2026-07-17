/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    private int field_f;
    private int field_c;
    oc field_d;
    private int field_e;
    static String field_h;
    private int field_a;
    static ll field_g;
    static int field_b;

    final void b(byte param0) {
        if (param0 >= -35) {
            ((we) this).field_e = -114;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        oc var4 = null;
        int var5 = 0;
        int var6 = 0;
        oc var7 = null;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        var25 = HostileSpawn.field_I ? 1 : 0;
        if (((we) this).field_d.field_e >= 0) {
          if (of.field_d != dn.field_i) {
            L0: {
              var2 = uj.field_p.field_e;
              var3 = uj.field_p.field_g;
              var4 = mm.field_m[0].field_j;
              var7 = new oc(((we) this).field_d.field_e + -var4.field_e, -var4.field_g + ((we) this).field_d.field_g);
              var8 = var7.a(param0 ^ -25098);
              var6 = ((we) this).field_c;
              if (var8 < 0.0) {
                var8 = var8 + 256.0;
                break L0;
              } else {
                break L0;
              }
            }
            var5 = ((we) this).field_e;
            var5 = var5 - (int)(200.0 * Math.sin(var8 * 3.141592653589793 / 128.0));
            var6 = var6 - (int)(200.0 * Math.cos(3.141592653589793 * var8 / 128.0));
            if (param0 == -46) {
              L1: {
                if (Math.abs(var7.field_e) > 13) {
                  break L1;
                } else {
                  if (Math.abs(var7.field_g) > 10) {
                    break L1;
                  } else {
                    var6 = ((we) this).field_d.field_g * 24 + -var3;
                    var5 = -var2 + 24 * ((we) this).field_d.field_e;
                    if (bm.field_c != 0) {
                      break L1;
                    } else {
                      L2: {
                        if (ha.field_t != 0) {
                          break L2;
                        } else {
                          var5 += 24;
                          break L2;
                        }
                      }
                      L3: {
                        var6 += 56;
                        if (ha.field_t == 1) {
                          var5 += 8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6 -= 40;
                      if (2 == ha.field_t) {
                        var6 -= 24;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L4: {
                ((we) this).field_f = (((we) this).field_f * 9 + var6) / 10;
                ((we) this).field_a = (var5 + ((we) this).field_a * 9) / 10;
                if (~var5 < ~((we) this).field_a) {
                  ((we) this).field_a = ((we) this).field_a + 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var6 > ((we) this).field_f) {
                  ((we) this).field_f = ((we) this).field_f + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (~var5 <= ~((we) this).field_a) {
                  break L6;
                } else {
                  ((we) this).field_a = ((we) this).field_a - 1;
                  break L6;
                }
              }
              L7: {
                if (~var6 > ~((we) this).field_f) {
                  ((we) this).field_f = ((we) this).field_f - 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              li.field_t.e(((we) this).field_a + -(li.field_t.field_z / 2), -(li.field_t.field_A / 2) + ((we) this).field_f);
              var10 = ((we) this).field_a + -(int)(8.0 * Math.sin(3.141592653589793 * var8 / 128.0));
              var11 = ((we) this).field_f - (int)(Math.cos(3.141592653589793 * var8 / 128.0) * 8.0);
              var12 = ((we) this).field_a - (int)(Math.sin((96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
              var13 = ((we) this).field_f - (int)(Math.cos((96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
              var14 = ((we) this).field_a + -(int)(10.0 * Math.sin(3.141592653589793 * (-96.0 + var8) / 128.0));
              var15 = ((we) this).field_f + -(int)(Math.cos((-96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
              li.a(var13, -1, var11, var15, var10, var14, 13684736, var12);
              si.e(((we) this).field_a, ((we) this).field_f, 1, 0);
              si.b(((we) this).field_a, ((we) this).field_f, 2, 7368704);
              var16 = Math.max(((we) this).field_f - 10, 1);
              var17 = Math.min(10 + ((we) this).field_f, 478);
              var18 = Math.max(((we) this).field_a + -10, 1);
              var19 = Math.min(((we) this).field_a - -10, 638);
              var20 = var16 * 640;
              var21 = var16;
              L8: while (true) {
                if (~var21 <= ~var17) {
                  return;
                } else {
                  var22 = var18;
                  L9: while (true) {
                    if (var22 >= var19) {
                      var20 += 640;
                      var21++;
                      continue L8;
                    } else {
                      L10: {
                        var23 = var22 + var20;
                        if ((255 & si.field_i[var23] >> 16) >= 100) {
                          break L10;
                        } else {
                          L11: {
                            var24 = 0;
                            if (13684736 != si.field_i[var23 + -1]) {
                              break L11;
                            } else {
                              var24++;
                              break L11;
                            }
                          }
                          L12: {
                            if (si.field_i[1 + var23] == 13684736) {
                              var24++;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (si.field_i[-640 + var23] == 13684736) {
                              var24++;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (si.field_i[var23 - -640] != 13684736) {
                              break L14;
                            } else {
                              var24++;
                              break L14;
                            }
                          }
                          if (var24 >= 2) {
                            si.field_i[var23] = 7368704;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var22++;
                      continue L9;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        int var1 = 93;
        field_g = null;
        field_h = null;
    }

    we(oc param0) {
        ((we) this).field_c = 232;
        ((we) this).field_e = 312;
        try {
            ((we) this).field_d = param0;
            ((we) this).field_f = ((we) this).field_c;
            ((we) this).field_a = ((we) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "we.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "The entrance to this shuttle bay is blocked off.";
        field_g = new ll();
        field_b = -1;
    }
}
