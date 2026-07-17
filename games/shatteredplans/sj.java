/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static qr field_c;
    static int[] field_a;
    static String field_d;
    static ir field_b;

    final static void a(byte param0, qr param1, qr param2) {
        try {
            if (null == param1.field_M) {
                param1.field_M = new pf();
            }
            if (null == param2.field_M) {
                param2.field_M = new pf();
            }
            if (eg.field_q == null) {
                eg.field_q = new in(64);
            }
            if (!(sl.field_m != null)) {
                sl.field_m = new in(64);
            }
            vd.field_j = param1.field_M;
            fp.field_b = param2.field_M;
            int discarded$0 = 1;
            an.a();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sj.C(" + 77 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0) {
        Object var7_ref = null;
        RuntimeException var1 = null;
        lo var2 = null;
        boolean[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        Object var6_ref = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        fs var12 = null;
        String var13 = null;
        RuntimeException decompiledCaughtException = null;
        var7_ref = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = ho.field_d;
              var2 = var12.field_m;
              if (param0 == -31560) {
                break L1;
              } else {
                sj.a(60);
                break L1;
              }
            }
            L2: {
              var3 = new boolean[4];
              if (var2 == null) {
                break L2;
              } else {
                var4 = ((sd) (Object) var2).field_u[((sd) (Object) var2).field_w[3]];
                if (var4 != 0) {
                  var5_int = 0;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= 4) {
                      var6_ref = null;
                      var5_int = 0;
                      var7_int = 0;
                      L4: while (true) {
                        if (var7_int >= 4) {
                          L5: {
                            var13 = re.a(qj.field_d, 4371, new String[1]);
                            var6_ref = (Object) (Object) var13;
                            if (1 == var5_int) {
                              var6_ref = (Object) (Object) (var13 + aq.field_n);
                              var7_ref = var6_ref;
                              var5 = var7_ref;
                              break L5;
                            } else {
                              var6_ref = (Object) (Object) (var13 + oo.field_f);
                              break L5;
                            }
                          }
                          uq.field_m.a((String) var6_ref, param0 + 58835, "generateshortfall");
                          break L2;
                        } else {
                          L6: {
                            var8 = ((sd) (Object) var2).field_w[var7_int];
                            if (((sd) (Object) var2).field_u[var8] == 0) {
                              L7: {
                                var9 = re.a("<col=<%0>><%1></col>", 4371, new String[2]);
                                var6_ref = (Object) (Object) var9;
                                if (var5_int != 0) {
                                  if (var5_int == 1) {
                                    var6_ref = (Object) (Object) (var9 + qn.field_d + var6_ref);
                                    break L7;
                                  } else {
                                    var6_ref = (Object) (Object) (var9 + ef.field_d + var6_ref);
                                    break L7;
                                  }
                                } else {
                                  var6_ref = (Object) (Object) var9;
                                  break L7;
                                }
                              }
                              var5_int++;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var7_int++;
                          continue L4;
                        }
                      }
                    } else {
                      L8: {
                        if (0 == ((sd) (Object) var2).field_u[((sd) (Object) var2).field_w[var6]]) {
                          var5_int++;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var6++;
                      continue L3;
                    }
                  }
                } else {
                  uq.field_m.a(cb.field_m, 27275, "generateshortfall");
                  break L2;
                }
              }
            }
            var4 = 0;
            var5_int = 0;
            L9: while (true) {
              if (var5_int >= 4) {
                var5 = null;
                var4 = 0;
                var11 = 0;
                var6 = var11;
                L10: while (true) {
                  if (var11 >= 4) {
                    uq.field_m.a((String) var5, 27275, "generateprojectprogress");
                    break L0;
                  } else {
                    L11: {
                      if (var12.field_u[var11] <= 0) {
                        break L11;
                      } else {
                        if (var3[var11]) {
                          L12: {
                            var7 = re.a("<col=<%0>><%1></col>", param0 ^ -27221, new String[2]);
                            var5 = (Object) (Object) var7;
                            if (var4 == 0) {
                              var5 = (Object) (Object) var7;
                              break L12;
                            } else {
                              if (var4 != 1) {
                                var5 = (Object) (Object) (var7 + ef.field_d + var5);
                                break L12;
                              } else {
                                var5 = (Object) (Object) (var7 + qn.field_d + var5);
                                break L12;
                              }
                            }
                          }
                          var4++;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var11++;
                    continue L10;
                  }
                }
              } else {
                L13: {
                  if (var12.field_u[var5_int] <= 0) {
                    break L13;
                  } else {
                    var4++;
                    break L13;
                  }
                }
                var5_int++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "sj.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show all private chat";
    }
}
