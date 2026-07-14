/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int[][] field_e;
    static int[] field_c;
    static hl[] field_d;
    static rj field_a;
    static String field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        if (param2 != 18097) {
          field_e = null;
          return cc.a(param1, param0, true, param2 + -18162);
        } else {
          return cc.a(param1, param0, true, param2 + -18162);
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_b = null;
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static java.awt.Frame a(int param0, ka param1, int param2, int param3, int param4, int param5) {
        jk[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        jk[] var9 = null;
        bk var10 = null;
        jk[] var11 = null;
        bk var12 = null;
        java.awt.Frame var13 = null;
        Object var16 = null;
        Object var17 = null;
        bk var18 = null;
        Object var19 = null;
        java.awt.Frame var19_ref = null;
        Object var20 = null;
        Object var22 = null;
        Object var23 = null;
        Object var24 = null;
        jk[] var25 = null;
        bk var26 = null;
        Object var27 = null;
        java.awt.Frame var27_ref = null;
        bk var28 = null;
        Object var29 = null;
        java.awt.Frame var29_ref = null;
        Object var30 = null;
        var16 = null;
        var17 = null;
        var19 = null;
        var20 = null;
        var22 = null;
        var23 = null;
        var24 = null;
        var27 = null;
        var29 = null;
        var30 = null;
        if (param5 < -91) {
          if (param1.a((byte) -68)) {
            if (0 != param2) {
              var26 = param1.a(param4, param0, param2, param3, 2024561328);
              L0: while (true) {
                if (0 != var26.field_b) {
                  var27_ref = (java.awt.Frame) var26.field_f;
                  if (var27_ref != null) {
                    if (var26.field_b == 2) {
                      eg.a(var27_ref, (byte) -47, param1);
                      return null;
                    } else {
                      return var27_ref;
                    }
                  } else {
                    return null;
                  }
                } else {
                  uc.a(-119, 10L);
                  continue L0;
                }
              }
            } else {
              var25 = el.a(false, param1);
              var9 = var25;
              var6 = var9;
              if (var6 != null) {
                var7 = 0;
                var8 = 0;
                L1: while (true) {
                  if (var25.length <= var8) {
                    if (var7 != 0) {
                      var28 = param1.a(param4, param0, param2, param3, 2024561328);
                      var10 = var28;
                      L2: while (true) {
                        if (0 != var28.field_b) {
                          var29_ref = (java.awt.Frame) var28.field_f;
                          if (var29_ref != null) {
                            if (var28.field_b == 2) {
                              eg.a(var29_ref, (byte) -47, param1);
                              return null;
                            } else {
                              return var29_ref;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          uc.a(-119, 10L);
                          continue L2;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    if (var25[var8].field_d != param3) {
                      var8++;
                      var8++;
                      continue L1;
                    } else {
                      if (var25[var8].field_h == param0) {
                        L3: {
                          if (param4 == 0) {
                            break L3;
                          } else {
                            if (var25[var8].field_i == param4) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L4: {
                          if (var7 == 0) {
                            break L4;
                          } else {
                            if (var25[var8].field_e > param2) {
                              break L4;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7 = 1;
                        param2 = var25[var8].field_e;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          field_c = null;
          if (param1.a((byte) -68)) {
            if (0 != param2) {
              var12 = param1.a(param4, param0, param2, param3, 2024561328);
              var10 = var12;
              L5: while (true) {
                if (0 != var12.field_b) {
                  var13 = (java.awt.Frame) var12.field_f;
                  if (var13 != null) {
                    if (var12.field_b == 2) {
                      eg.a(var13, (byte) -47, param1);
                      return null;
                    } else {
                      return var13;
                    }
                  } else {
                    return null;
                  }
                } else {
                  uc.a(-119, 10L);
                  continue L5;
                }
              }
            } else {
              var11 = el.a(false, param1);
              var9 = var11;
              var6 = var9;
              if (var6 != null) {
                L6: {
                  var7 = 0;
                  var8 = 0;
                  if (var11.length <= var8) {
                    break L6;
                  } else {
                    L7: {
                      if (var11[var8].field_d != param3) {
                        var8++;
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            L10: {
                              if (var11[var8].field_h != param0) {
                                var8++;
                                break L10;
                              } else {
                                L11: {
                                  if (param4 == 0) {
                                    break L11;
                                  } else {
                                    if (var11[var8].field_i != param4) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var7 == 0) {
                                    break L12;
                                  } else {
                                    if (var11[var8].field_e <= param2) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                var7 = 1;
                                param2 = var11[var8].field_e;
                                break L8;
                              }
                            }
                            var8++;
                            break L9;
                          }
                          var8++;
                          break L8;
                        }
                        var8++;
                        break L7;
                      }
                    }
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    break L6;
                  }
                }
                if (var7 != 0) {
                  var18 = param1.a(param4, param0, param2, param3, 2024561328);
                  var10 = var18;
                  L13: while (true) {
                    if (0 != var18.field_b) {
                      var19_ref = (java.awt.Frame) var18.field_f;
                      if (var19_ref != null) {
                        if (var18.field_b == 2) {
                          eg.a(var19_ref, (byte) -47, param1);
                          return null;
                        } else {
                          return var19_ref;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      uc.a(-119, 10L);
                      continue L13;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection lost. <%0>";
    }
}
