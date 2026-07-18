/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    private boolean field_k;
    int[] field_g;
    int field_j;
    int field_i;
    private long field_f;
    private int field_d;
    String field_e;
    static int[] field_b;
    private String field_h;
    static o[] field_c;
    int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = SolKnight.field_L ? 1 : 0;
          if (param8 < 0) {
            break L0;
          } else {
            if (~hk.field_a < ~param4) {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (param9 >= 0) {
                    break L1;
                  } else {
                    if (param10 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param0 < hk.field_i) {
                  break L2;
                } else {
                  if (hk.field_i > param9) {
                    break L2;
                  } else {
                    if (~param10 <= ~hk.field_i) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = param8 + -param4;
                if (param4 == param16) {
                  L4: {
                    if (~param8 != ~param4) {
                      var35 = param8 - param16;
                      if (~param9 >= ~param0) {
                        var22 = param2 << 16;
                        var25 = param7 << 16;
                        var26 = param14 << 16;
                        var21 = param5 << 16;
                        var23 = (param3 + -param5 << 16) / var35;
                        var32 = (-param1 + param11 << 16) / var34;
                        var30 = param1 << 16;
                        var28 = (-param14 + param15 << 16) / var34;
                        var24 = (param3 + -param2 << 16) / var34;
                        var19 = (param10 - param9 << 16) / var35;
                        var27 = (param15 + -param7 << 16) / var35;
                        var18 = param0 << 16;
                        var31 = (param11 - param13 << 16) / var35;
                        var29 = param13 << 16;
                        var17_int = param9 << 16;
                        var20 = (param10 - param0 << 16) / var34;
                        break L4;
                      } else {
                        var19 = (param10 - param0 << 16) / var34;
                        var23 = (-param2 + param3 << 16) / var34;
                        var32 = (param11 - param13 << 16) / var35;
                        var28 = (-param7 + param15 << 16) / var35;
                        var20 = (-param9 + param10 << 16) / var35;
                        var27 = (param15 + -param14 << 16) / var34;
                        var24 = (param3 - param5 << 16) / var35;
                        var21 = param2 << 16;
                        var31 = (-param1 + param11 << 16) / var34;
                        var17_int = param0 << 16;
                        var22 = param5 << 16;
                        var18 = param9 << 16;
                        var26 = param7 << 16;
                        var30 = param13 << 16;
                        var29 = param1 << 16;
                        var25 = param14 << 16;
                        break L4;
                      }
                    } else {
                      var32 = 0;
                      var26 = param7;
                      var25 = param14;
                      var31 = 0;
                      var19 = 0;
                      var30 = param13;
                      var27 = 0;
                      var18 = param9 << 16;
                      var24 = 0;
                      var17_int = param0 << 16;
                      var28 = 0;
                      var20 = 0;
                      var29 = param1;
                      var22 = param5;
                      var21 = param2;
                      var23 = 0;
                      break L4;
                    }
                  }
                  var33 = 0;
                  if (param4 >= 0) {
                    break L3;
                  } else {
                    param4 = Math.min(-param4, param16 - param4);
                    var30 = var30 + var32 * param4;
                    var22 = var22 + param4 * var24;
                    var29 = var29 + var31 * param4;
                    var18 = var18 + var20 * param4;
                    var17_int = var17_int + var19 * param4;
                    var25 = var25 + var27 * param4;
                    var21 = var21 + var23 * param4;
                    var26 = var26 + param4 * var28;
                    param4 = 0;
                    break L3;
                  }
                } else {
                  L5: {
                    var18 = param0 << 16;
                    var17_int = param0 << 16;
                    var22 = param2 << 16;
                    var21 = param2 << 16;
                    var30 = param1 << 16;
                    var29 = param1 << 16;
                    var26 = param14 << 16;
                    var25 = param14 << 16;
                    var35 = -param4 + param16;
                    var19 = (-param0 + param9 << 16) / var35;
                    var20 = (-param0 + param10 << 16) / var34;
                    if (var20 <= var19) {
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      var23 = (param3 - param2 << 16) / var34;
                      var28 = (param7 + -param14 << 16) / var35;
                      var31 = (-param1 + param11 << 16) / var34;
                      var24 = (param5 - param2 << 16) / var35;
                      var32 = (-param1 + param13 << 16) / var35;
                      var27 = (param15 - param14 << 16) / var34;
                      break L5;
                    } else {
                      var28 = (param15 - param14 << 16) / var34;
                      var27 = (param7 + -param14 << 16) / var35;
                      var23 = (-param2 + param5 << 16) / var35;
                      var33 = 0;
                      var32 = (param11 + -param1 << 16) / var34;
                      var24 = (-param2 + param3 << 16) / var34;
                      var31 = (-param1 + param13 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param4 >= 0) {
                        break L7;
                      } else {
                        if (0 <= param16) {
                          param4 = -param4;
                          var18 = var18 + var20 * param4;
                          var25 = var25 + var27 * param4;
                          var29 = var29 + param4 * var31;
                          var22 = var22 + var24 * param4;
                          var21 = var21 + param4 * var23;
                          var17_int = var17_int + param4 * var19;
                          var26 = var26 + var28 * param4;
                          var30 = var30 + param4 * var32;
                          param4 = 0;
                          break L7;
                        } else {
                          param4 = -param4 + param16;
                          var21 = var21 + param4 * var23;
                          var22 = var22 + param4 * var24;
                          var25 = var25 + var27 * param4;
                          var30 = var30 + var32 * param4;
                          var18 = var18 + param4 * var20;
                          var26 = var26 + param4 * var28;
                          var29 = var29 + param4 * var31;
                          var17_int = var17_int + param4 * var19;
                          param4 = param16;
                          break L6;
                        }
                      }
                    }
                    var36 = hk.field_d[param4];
                    L8: while (true) {
                      if (param4 >= param16) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (~hk.field_i < ~var37) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (var37 < hk.field_i) {
                                  da.a(var38, 26, param12, 0, 0, 0, var25, var36 + var37, var29, var21);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (var30 - var29) / var38;
                                if (var37 - -var38 < hk.field_i) {
                                  break L10;
                                } else {
                                  var38 = -1 + (-var37 + hk.field_i);
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                da.a(var37 + var38, 114, param12, var40, var41, var39, -(var37 * var40) + var25, var36, -(var41 * var37) + var29, -(var39 * var37) + var21);
                                break L9;
                              } else {
                                da.a(var38, 88, param12, var40, var41, var39, var25, var37 + var36, var29, var21);
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        param4++;
                        if (hk.field_a > param4) {
                          var22 = var22 + var24;
                          var30 = var30 + var32;
                          var25 = var25 + var27;
                          var36 = var36 + mi.field_a;
                          var21 = var21 + var23;
                          var17_int = var17_int + var19;
                          var26 = var26 + var28;
                          var18 = var18 + var20;
                          var29 = var29 + var31;
                          continue L8;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param16 + param8;
                  if (var36 == 0) {
                    var32 = 0;
                    var28 = 0;
                    var23 = 0;
                    var27 = 0;
                    var24 = 0;
                    var20 = 0;
                    var19 = 0;
                    var31 = 0;
                    break L3;
                  } else {
                    L11: {
                      var37 = param10 << 16;
                      var38 = param3 << 16;
                      var39 = param15 << 16;
                      var40 = param11 << 16;
                      if (var33 == 0) {
                        var17_int = param9 << 16;
                        var29 = param13 << 16;
                        var25 = param7 << 16;
                        var21 = param5 << 16;
                        break L11;
                      } else {
                        var18 = param9 << 16;
                        var22 = param5 << 16;
                        var26 = param7 << 16;
                        var30 = param13 << 16;
                        break L11;
                      }
                    }
                    var32 = (var40 - var30) / var36;
                    var27 = (-var25 + var39) / var36;
                    var28 = (-var26 + var39) / var36;
                    var31 = (var40 - var29) / var36;
                    var20 = (-var18 + var37) / var36;
                    var24 = (-var22 + var38) / var36;
                    var23 = (-var21 + var38) / var36;
                    var19 = (-var17_int + var37) / var36;
                    break L3;
                  }
                }
              }
              L12: {
                if (param4 >= 0) {
                  break L12;
                } else {
                  param4 = -param4;
                  var21 = var21 + param4 * var23;
                  var29 = var29 + var31 * param4;
                  var26 = var26 + var28 * param4;
                  var30 = var30 + var32 * param4;
                  var22 = var22 + var24 * param4;
                  var25 = var25 + param4 * var27;
                  var18 = var18 + param4 * var20;
                  var17_int = var17_int + var19 * param4;
                  param4 = 0;
                  break L12;
                }
              }
              var35 = hk.field_d[param4];
              L13: while (true) {
                if (~param4 <= ~param8) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (~hk.field_i < ~var36) {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 != 0) {
                        L15: {
                          var38 = (var22 - var21) / var37;
                          var39 = (var26 - var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (hk.field_i > var36 + var37) {
                            break L15;
                          } else {
                            var37 = hk.field_i + -var36 - 1;
                            break L15;
                          }
                        }
                        if (var36 >= 0) {
                          da.a(var37, 85, param12, var39, var40, var38, var25, var36 - -var35, var29, var21);
                          break L14;
                        } else {
                          da.a(var37 + var36, 112, param12, var39, var40, var38, -(var36 * var39) + var25, var35, var29 + -(var36 * var40), -(var38 * var36) + var21);
                          break L14;
                        }
                      } else {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~var36 > ~hk.field_i) {
                            da.a(var37, 115, param12, 0, 0, 0, var25, var36 + var35, var29, var21);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  param4++;
                  if (param4 >= hk.field_a) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var21 = var21 + var23;
                    var18 = var18 + var20;
                    var17_int = var17_int + var19;
                    var26 = var26 + var28;
                    var35 = var35 + mi.field_a;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    continue L13;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
    }

    final int a(int param0) {
        L0: {
          if (((hf) this).field_k) {
            break L0;
          } else {
            L1: {
              if (((hf) this).field_i != 2) {
                break L1;
              } else {
                if (((hf) this).field_d <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (~((hf) this).field_f == ~nc.field_f) {
              return 1;
            } else {
              L2: {
                if (lh.field_p != 2) {
                  break L2;
                } else {
                  if (!ad.a((byte) -105, ((hf) this).field_h)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              if (param0 != 1910696752) {
                int discarded$2 = ((hf) this).a(13);
                return 0;
              } else {
                return 0;
              }
            }
          }
        }
        return 2;
    }

    final static void a(boolean param0, int param1, boolean param2, String param3) {
        try {
            k.a((byte) -35);
            u.field_b.j(param1 ^ 17073);
            ve.field_a = new bb(me.field_h, (String) null, k.field_b, param0, param2);
            if (param1 != 17072) {
                Object var5 = null;
                hf.a(false, -42, false, (String) null);
            }
            gf.field_cb = new s(u.field_b, (rc) (Object) ve.field_a);
            u.field_b.b((rc) (Object) gf.field_cb, param1 ^ 17105);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "hf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    hf(boolean param0) {
        ((hf) this).field_d = th.field_I;
        ((hf) this).field_a = ah.field_c;
        ((hf) this).field_j = hc.field_b;
        ((hf) this).field_k = ml.field_e;
        ((hf) this).field_e = ek.field_a;
        if (param0) {
            ((hf) this).field_g = qe.field_G;
        } else {
            ((hf) this).field_g = null;
        }
        ((hf) this).field_h = vd.field_a;
        ((hf) this).field_i = qk.field_m;
        ((hf) this).field_f = q.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
