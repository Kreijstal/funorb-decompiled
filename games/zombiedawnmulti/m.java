/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends tb {
    static cj field_B;
    static cj field_x;
    static String field_A;
    static fm field_C;
    static int field_z;
    static int field_y;
    static ja field_w;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        if (param1 == 0) {
          if (gi.field_i != null) {
            var3 = gi.field_i.a((byte) 113, param0);
            if (-1 != var3) {
              if (-3 == var3) {
                if (null != gi.field_i.field_wb) {
                  if (!gi.field_i.field_wb.equals((Object) (Object) "")) {
                    L0: {
                      if (gi.field_i.field_wb.charAt(0) != 91) {
                        var9 = (CharSequence) (Object) gi.field_i.field_wb;
                        var4 = tg.a(var9, false);
                        var5 = var4;
                        var5 = var4;
                        break L0;
                      } else {
                        var4 = gi.field_i.field_wb;
                        break L0;
                      }
                    }
                    L1: {
                      var5 = null;
                      if (0 == ic.field_e) {
                        var5 = ii.a(var4, (byte) 116, param2);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (1 != ic.field_e) {
                        break L2;
                      } else {
                        var5 = gn.a(var4, 103, param2);
                        break L2;
                      }
                    }
                    L3: {
                      if ((ic.field_e ^ -1) == -3) {
                        var5 = sf.a(param1 + -86, param2, var4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (ic.field_e != 3) {
                        break L4;
                      } else {
                        var5 = ng.a(var4, var4, param1 + -25, param2);
                        break L4;
                      }
                    }
                    if (var5 != null) {
                      var7 = null;
                      vm.a(var4, 0, (String) null, var5, 2, 0);
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    } else {
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    }
                  } else {
                    gi.field_i = null;
                    ic.field_e = -1;
                    return;
                  }
                } else {
                  gi.field_i = null;
                  ic.field_e = -1;
                  return;
                }
              } else {
                gi.field_i = null;
                ic.field_e = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          java.awt.Frame discarded$1 = m.a(-30, (go) null, 112, 17, -89, 48);
          if (gi.field_i != null) {
            var3 = gi.field_i.a((byte) 113, param0);
            if (-1 != var3) {
              if (-3 == var3) {
                if (null != gi.field_i.field_wb) {
                  if (!gi.field_i.field_wb.equals((Object) (Object) "")) {
                    L5: {
                      if (gi.field_i.field_wb.charAt(0) != 91) {
                        var8 = (CharSequence) (Object) gi.field_i.field_wb;
                        var4 = tg.a(var8, false);
                        var5 = var4;
                        var4 = var5;
                        var5 = var4;
                        break L5;
                      } else {
                        var4 = gi.field_i.field_wb;
                        break L5;
                      }
                    }
                    L6: {
                      var5 = null;
                      if (0 == ic.field_e) {
                        var5 = ii.a(var4, (byte) 116, param2);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (1 != ic.field_e) {
                        break L7;
                      } else {
                        var5 = gn.a(var4, 103, param2);
                        break L7;
                      }
                    }
                    L8: {
                      if ((ic.field_e ^ -1) == -3) {
                        var5 = sf.a(param1 + -86, param2, var4);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (ic.field_e != 3) {
                        break L9;
                      } else {
                        var5 = ng.a(var4, var4, param1 + -25, param2);
                        var4 = var5;
                        var5 = var4;
                        var4 = var5;
                        break L9;
                      }
                    }
                    if (var5 != null) {
                      var7 = null;
                      vm.a(var4, 0, (String) null, var5, 2, 0);
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    } else {
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    }
                  } else {
                    gi.field_i = null;
                    ic.field_e = -1;
                    return;
                  }
                } else {
                  gi.field_i = null;
                  ic.field_e = -1;
                  return;
                }
              } else {
                gi.field_i = null;
                ic.field_e = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private m(fm param0, int param1) {
        super(param0, param1);
    }

    final String d(cf param0, int param1) {
        Object var4 = null;
        if (param1 != -9327) {
          var4 = null;
          java.awt.Frame discarded$2 = m.a(-33, (go) null, 73, 31, -76, 61);
          return hg.a(40, '*', param0.field_j.length());
        } else {
          return hg.a(40, '*', param0.field_j.length());
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_x = null;
        if (param0) {
          field_A = null;
          field_w = null;
          field_B = null;
          return;
        } else {
          field_w = null;
          field_B = null;
          return;
        }
    }

    final static void c(int param0) {
        il var1 = null;
        il var1_ref = null;
        L0: {
          var1 = (il) (Object) db.field_a.a(true);
          if (var1 == null) {
            var1_ref = new il();
            break L0;
          } else {
            break L0;
          }
        }
        var1_ref.a(oo.field_e, oo.field_d, oo.field_g, (byte) -120, oo.field_i, oo.field_f, oo.field_b, oo.field_l);
        if (param0 != 540) {
          return;
        } else {
          mo.field_Fb.a((br) (Object) var1_ref, false);
          return;
        }
    }

    final static java.awt.Frame a(int param0, go param1, int param2, int param3, int param4, int param5) {
        sm[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        sm[] var10 = null;
        di var12 = null;
        java.awt.Frame var13 = null;
        java.awt.Frame var14 = null;
        di var15 = null;
        Object var16 = null;
        java.awt.Frame var16_ref = null;
        Object var17 = null;
        java.awt.Frame var17_ref = null;
        var16 = null;
        var17 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1.a(-96)) {
          if (param3 == 0) {
            var10 = jg.a(-123, param1);
            var6 = var10;
            if (var6 != null) {
              var7_int = 0;
              var8 = 0;
              L0: while (true) {
                if (var10.length <= var8) {
                  if (var7_int != 0) {
                    var15 = param1.a(param0, (byte) 126, param2, param3, param4);
                    L1: while (true) {
                      if (var15.field_f == 0) {
                        vd.a(false, 10L);
                        continue L1;
                      } else {
                        if (param5 > 85) {
                          var17_ref = (java.awt.Frame) var15.field_d;
                          var7 = var17_ref;
                          if (var17_ref != null) {
                            if (2 == var15.field_f) {
                              sp.a(param1, 1, var17_ref);
                              return null;
                            } else {
                              return var17_ref;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          field_x = null;
                          var16_ref = (java.awt.Frame) var15.field_d;
                          if (var16_ref != null) {
                            if (2 == var15.field_f) {
                              sp.a(param1, 1, var16_ref);
                              return null;
                            } else {
                              return var16_ref;
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
                  if (param0 == var10[var8].field_e) {
                    if (param4 == var10[var8].field_a) {
                      L2: {
                        if (param2 == 0) {
                          break L2;
                        } else {
                          if (param2 == var10[var8].field_d) {
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
                          if (param3 < var10[var8].field_c) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      var7_int = 1;
                      param3 = var10[var8].field_c;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var12 = param1.a(param0, (byte) 126, param2, param3, param4);
            L4: while (true) {
              if (var12.field_f == 0) {
                vd.a(false, 10L);
                continue L4;
              } else {
                if (param5 > 85) {
                  var14 = (java.awt.Frame) var12.field_d;
                  if (var14 != null) {
                    if (2 == var12.field_f) {
                      sp.a(param1, 1, var14);
                      return null;
                    } else {
                      return var14;
                    }
                  } else {
                    return null;
                  }
                } else {
                  field_x = null;
                  var13 = (java.awt.Frame) var12.field_d;
                  if (var13 != null) {
                    if (2 == var12.field_f) {
                      sp.a(param1, 1, var13);
                      return null;
                    } else {
                      return var13;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    m(int param0) {
        this(ke.field_h, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Waiting for music";
        field_w = new ja(540, 140);
    }
}
