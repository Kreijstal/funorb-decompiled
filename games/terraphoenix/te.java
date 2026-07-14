/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    int field_b;
    static String field_e;
    int field_f;
    static String[] field_a;
    int[] field_c;
    java.awt.Image field_d;
    static kf field_g;

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        uc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eg var11 = null;
        uc var12 = null;
        ok var13 = null;
        int[] var14 = null;
        ok var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = Terraphoenix.field_V;
          var12 = mk.field_j;
          if (param0 == 67) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var2 = var12.a(-16384);
          if (0 == var2) {
            var10 = a.b(3922);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((dh) (Object) var5).a(-16384);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var15 = (ok) (Object) vc.field_g.d(9272);
                if (var15 == null) {
                  gb.g(-17464);
                  return;
                } else {
                  var15.field_l = var3;
                  var15.field_m = var18[0];
                  var15.field_k = true;
                  var15.b((byte) 12);
                  break L1;
                }
              } else {
                var9[var7] = ((dh) (Object) var5).f((byte) -107);
                var7++;
                continue L2;
              }
            }
          } else {
            if (var2 == 1) {
              var11 = (eg) (Object) ic.field_s.d(9272);
              if (var11 != null) {
                var11.b((byte) 12);
                break L1;
              } else {
                gb.g(-17464);
                return;
              }
            } else {
              if ((var2 ^ -1) != -3) {
                bd.a((Throwable) null, "A1: " + r.i(-15465), -87);
                gb.g(-17464);
                break L1;
              } else {
                var13 = (ok) (Object) vc.field_g.d(9272);
                if (var13 == null) {
                  gb.g(param0 + -17531);
                  return;
                } else {
                  var13.field_l = a.b(3922);
                  var13.field_k = true;
                  var13.field_m = var13.field_l[0];
                  var13.b((byte) 12);
                  break L1;
                }
              }
            }
          }
        }
    }

    final static void a(long param0, int param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 != 0) {
            te.b((byte) -85);
        }
    }

    final static boolean a(CharSequence param0, boolean param1) {
        if (!param1) {
            return true;
        }
        return bk.a((byte) 120, true, 10, param0);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        Object var24 = null;
        int var25 = 0;
        var23 = Terraphoenix.field_V;
        var9 = param3;
        param3 = param3 - param4;
        if (param1 == 0) {
          l.a(param2, param3, param5);
          return;
        } else {
          L0: {
            if (0 > param1) {
              param1 = -param1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var11 = -param1 + param3;
            if (l.field_d <= var11) {
              break L1;
            } else {
              var11 = l.field_d;
              break L1;
            }
          }
          L2: {
            var12 = param3 - -param1 - -1;
            if (var12 > l.field_c) {
              var12 = l.field_c;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var13 = var11;
            var14 = param1 * param1;
            var15 = 0;
            var16 = -var13 + param3;
            var17 = var16 * var16;
            var8 = var13;
            var18 = -var16 + var17;
            if (var12 < param3) {
              param3 = var12;
              break L3;
            } else {
              break L3;
            }
          }
          L4: while (true) {
            if (var13 >= param3) {
              L5: {
                var15 = param1;
                var16 = -param3 + var13;
                if (param0 == 99) {
                  break L5;
                } else {
                  var24 = null;
                  boolean discarded$1 = te.a((CharSequence) null, false);
                  break L5;
                }
              }
              var18 = var16 * var16 - -var14;
              var17 = var18 + -var15;
              var18 = var18 - var16;
              L6: while (true) {
                if (var12 <= var13) {
                  return;
                } else {
                  L7: while (true) {
                    L8: {
                      if (var14 >= var18) {
                        break L8;
                      } else {
                        if (var14 >= var17) {
                          break L8;
                        } else {
                          var15--;
                          var18 = var18 - (var15 + var15);
                          var17 = var17 - (var15 + var15);
                          continue L7;
                        }
                      }
                    }
                    L9: {
                      var19 = -var15 + param2;
                      if (var19 >= l.field_b) {
                        break L9;
                      } else {
                        var19 = l.field_b;
                        break L9;
                      }
                    }
                    L10: {
                      var20 = var15 + param2;
                      if (l.field_f - 1 < var20) {
                        var20 = l.field_f - 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var21 = var13 * l.field_k + var19;
                    var25 = var19;
                    var7 = var25;
                    var22 = var19;
                    L11: while (true) {
                      if (var20 <= var22) {
                        var18 = var18 + (var16 + var16);
                        var13++;
                        var8++;
                        var16++;
                        var17 = var17 + (var16 + var16);
                        continue L6;
                      } else {
                        var10 = (int)(Math.sqrt((double)(-((-param2 + var25) * (var25 - param2)) + -((-param3 + var8) * (-param3 + var8)) + param1 * param1)) + (double)var9);
                        if (gd.field_a[var25][var8] <= var10) {
                          L12: {
                            if (param6) {
                              gd.field_a[var25][var8] = var10;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var21++;
                          l.field_i[var21] = param5;
                          var25++;
                          var22++;
                          continue L11;
                        } else {
                          var21++;
                          var25++;
                          var22++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L13: while (true) {
                L14: {
                  if (var18 <= var14) {
                    break L14;
                  } else {
                    if (var17 > var14) {
                      L15: {
                        var19 = param2 + -var15 + 1;
                        if (var19 >= l.field_b) {
                          break L15;
                        } else {
                          var19 = l.field_b;
                          break L15;
                        }
                      }
                      L16: {
                        var20 = param2 + var15;
                        if (l.field_f < var20) {
                          var20 = l.field_f;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var7 = var19;
                      var21 = l.field_k * var13 + var19;
                      var22 = var19;
                      L17: while (true) {
                        if (var20 <= var22) {
                          var13++;
                          var8++;
                          var16--;
                          var17 = var17 - (var16 - -var16);
                          var18 = var18 - (var16 + var16);
                          continue L4;
                        } else {
                          var10 = (int)((double)var9 + Math.sqrt((double)(-((-param3 + var8) * (var8 - param3)) + -((var7 + -param2) * (var7 + -param2)) + param1 * param1)));
                          if (var10 >= gd.field_a[var7][var8]) {
                            L18: {
                              if (param6) {
                                gd.field_a[var7][var8] = var10;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var21++;
                            l.field_i[var21] = param5;
                            var7++;
                            var22++;
                            continue L17;
                          } else {
                            var21++;
                            var7++;
                            var22++;
                            continue L17;
                          }
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                var17 = var17 + (var15 + var15);
                var15++;
                var18 = var18 + (var15 + var15);
                continue L13;
              }
            }
          }
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
            return;
        }
        l.a(((te) this).field_c, ((te) this).field_b, ((te) this).field_f);
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 > -51) {
            return;
        }
        field_g = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Close";
        field_g = new kf("email");
    }
}
