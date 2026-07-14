/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends IOException {
    static dl field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, ha param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = param1.field_sb;
        var4 = param1.a(true, var3);
        System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(ub.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.a(true, var3), 16) + " ---");
        System.out.println(param1.j(var3, -248));
        if (param0 != 0) {
          return;
        } else {
          L0: {
            System.out.println("--- STATE DUMP ENDS: " + Integer.toString(ub.field_d, 16) + " ---");
            vl.field_n.h(32161, 72);
            vl.field_n.a((byte) -117, ub.field_d);
            vl.field_n.a((byte) -98, var4);
            if (!param2) {
              break L0;
            } else {
              hb.a((byte) 116, 0);
              dj.a((byte) -125);
              break L0;
            }
          }
          return;
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, hd param3, int param4, int param5) {
        ls[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ls[] var11 = null;
        wo var12 = null;
        wo var13 = null;
        java.awt.Frame var14 = null;
        Object var17 = null;
        ls[] var18 = null;
        wo var19 = null;
        Object var20 = null;
        java.awt.Frame var20_ref = null;
        Object var23 = null;
        wo var24 = null;
        Object var25 = null;
        java.awt.Frame var25_ref = null;
        ls[] var26 = null;
        wo var27 = null;
        Object var28 = null;
        java.awt.Frame var28_ref = null;
        var17 = null;
        var20 = null;
        var23 = null;
        var25 = null;
        var28 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 == -1) {
          if (param3.b(false)) {
            if (param0 == 0) {
              var26 = ma.a(param2 ^ 109, param3);
              var11 = var26;
              var6 = var11;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L0: while (true) {
                  if (var26.length <= var8) {
                    if (var7_int != 0) {
                      var27 = param3.a(true, param5, param4, param1, param0);
                      var12 = var27;
                      L1: while (true) {
                        if (-1 == (var27.field_g ^ -1)) {
                          nu.a(10L, 0);
                          continue L1;
                        } else {
                          var28_ref = (java.awt.Frame) var27.field_f;
                          var7 = var28_ref;
                          if (var28_ref != null) {
                            if (2 == var27.field_g) {
                              fj.a(var28_ref, param3, -2);
                              return null;
                            } else {
                              return var28_ref;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    if (param4 == var26[var8].field_b) {
                      if (param5 == var26[var8].field_a) {
                        L2: {
                          if (param1 == 0) {
                            break L2;
                          } else {
                            if (var26[var8].field_e == param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L0;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var26[var8].field_f > param0) {
                              break L3;
                            } else {
                              var8++;
                              continue L0;
                            }
                          }
                        }
                        param0 = var26[var8].field_f;
                        var7_int = 1;
                        var8++;
                        continue L0;
                      } else {
                        var8++;
                        continue L0;
                      }
                    } else {
                      var8++;
                      continue L0;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              var24 = param3.a(true, param5, param4, param1, param0);
              L4: while (true) {
                if (-1 == (var24.field_g ^ -1)) {
                  nu.a(10L, 0);
                  continue L4;
                } else {
                  var25_ref = (java.awt.Frame) var24.field_f;
                  if (var25_ref != null) {
                    if (2 == var24.field_g) {
                      fj.a(var25_ref, param3, -2);
                      return null;
                    } else {
                      return var25_ref;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          var10 = null;
          String discarded$1 = ug.a(99, (CharSequence) null);
          if (param3.b(false)) {
            if (param0 == 0) {
              var18 = ma.a(param2 ^ 109, param3);
              var11 = var18;
              var6 = var11;
              if (var6 != null) {
                L5: {
                  var7_int = 0;
                  var8 = 0;
                  if (var18.length <= var8) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            if (param4 != var18[var8].field_b) {
                              var8++;
                              break L9;
                            } else {
                              if (param5 == var18[var8].field_a) {
                                L10: {
                                  if (param1 == 0) {
                                    break L10;
                                  } else {
                                    if (var18[var8].field_e != param1) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var7_int == 0) {
                                    break L11;
                                  } else {
                                    if (var18[var8].field_f > param0) {
                                      break L11;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                param0 = var18[var8].field_f;
                                var7_int = 1;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var8++;
                          break L8;
                        }
                        var8++;
                        break L7;
                      }
                      var8++;
                      break L6;
                    }
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    var8++;
                    break L5;
                  }
                }
                if (var7_int != 0) {
                  var19 = param3.a(true, param5, param4, param1, param0);
                  var12 = var19;
                  L12: while (true) {
                    if (-1 == (var19.field_g ^ -1)) {
                      nu.a(10L, 0);
                      continue L12;
                    } else {
                      var20_ref = (java.awt.Frame) var19.field_f;
                      if (var20_ref != null) {
                        if (2 == var19.field_g) {
                          fj.a(var20_ref, param3, -2);
                          return null;
                        } else {
                          return var20_ref;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var13 = param3.a(true, param5, param4, param1, param0);
              var12 = var13;
              L13: while (true) {
                if (-1 == (var13.field_g ^ -1)) {
                  nu.a(10L, 0);
                  continue L13;
                } else {
                  var14 = (java.awt.Frame) var13.field_f;
                  if (var14 != null) {
                    if (2 == var13.field_g) {
                      fj.a(var14, param3, -2);
                      return null;
                    } else {
                      return var14;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        if (param0 != 16) {
          return null;
        } else {
          L0: {
            var2 = lt.a(0, wc.a(param1, 0));
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 16) {
            field_c = null;
        }
    }

    ug(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dl(1);
    }
}
