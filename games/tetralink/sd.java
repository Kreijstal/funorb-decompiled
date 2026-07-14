/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ml {
    static oh[] field_qb;
    static String field_ob;
    static hl field_rb;
    static String field_pb;
    static kd field_nb;

    final void e(na param0, int param1) {
        super.e(param0, param1);
    }

    sd(pk param0, na param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 >= -70) {
          field_rb = null;
          var3 = param0 >>> 269286079;
          return -var3 + (var3 + param0) / param1;
        } else {
          var3 = param0 >>> 269286079;
          return -var3 + (var3 + param0) / param1;
        }
    }

    final static mh a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        var2 = param1.length();
        if (-1 != (var2 ^ -1)) {
          if ((var2 ^ -1) >= -64) {
            var3 = 0;
            if (param0 != 30) {
              field_nb = null;
              if (var2 > var3) {
                L0: {
                  var4 = param1.charAt(var3);
                  if (var4 != 45) {
                    if (0 != fi.field_xb.indexOf(var4)) {
                      var3++;
                      break L0;
                    } else {
                      return jg.field_h;
                    }
                  } else {
                    if (var3 != 0) {
                      if (-1 + var2 != var3) {
                        var3++;
                        break L0;
                      } else {
                        return jg.field_h;
                      }
                    } else {
                      return jg.field_h;
                    }
                  }
                }
                var3++;
                var3++;
                var3++;
                L1: while (true) {
                  if (var2 > var3) {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (0 == (fi.field_xb.indexOf(var4) ^ -1)) {
                        return jg.field_h;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (-1 + var2 == var3) {
                            break L2;
                          } else {
                            var3++;
                            var3++;
                            continue L1;
                          }
                        }
                      }
                      return jg.field_h;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              L3: while (true) {
                if (var2 > var3) {
                  var4 = param1.charAt(var3);
                  if (var4 != 45) {
                    if (0 == (fi.field_xb.indexOf(var4) ^ -1)) {
                      return jg.field_h;
                    } else {
                      var3++;
                      var3++;
                      continue L3;
                    }
                  } else {
                    L4: {
                      if (var3 == 0) {
                        break L4;
                      } else {
                        if (-1 + var2 == var3) {
                          break L4;
                        } else {
                          var3++;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    return jg.field_h;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return nb.field_V;
          }
        } else {
          return c.field_o;
        }
    }

    final static boolean a(byte param0, ah param1) {
        if (param0 >= -28) {
            Object var3 = null;
            mh discarded$0 = sd.a(121, (String) null);
            return param1.a(false);
        }
        return param1.a(false);
    }

    public static void p(int param0) {
        field_pb = null;
        field_qb = null;
        if (param0 != -32527) {
          sd.q(68);
          field_rb = null;
          field_nb = null;
          field_ob = null;
          return;
        } else {
          field_rb = null;
          field_nb = null;
          field_ob = null;
          return;
        }
    }

    final static void r(int param0) {
        if (!pj.b((byte) 106)) {
            return;
        }
        if (param0 != -11) {
            return;
        }
        om.a(false, 10, 4);
    }

    final static void a(java.awt.Component param0, int param1) {
        Object var3 = null;
        param0.addMouseListener((java.awt.event.MouseListener) (Object) kd.field_g);
        if (param1 != 33) {
          var3 = null;
          sd.a((java.awt.Component) null, -26);
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
          return;
        } else {
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
          return;
        }
    }

    final static void q(int param0) {
        if ((fn.field_R ^ -1) == -11) {
          cc.c(param0 + -9216);
          fn.field_R = 11;
          n.field_Q = true;
          if (param0 == 27112) {
            return;
          } else {
            sd.r(-30);
            return;
          }
        } else {
          if (wm.b(param0 + -27112)) {
            n.field_Q = true;
            if (param0 == 27112) {
              return;
            } else {
              sd.r(-30);
              return;
            }
          } else {
            cc.c(param0 + -9216);
            fn.field_R = 11;
            n.field_Q = true;
            if (param0 == 27112) {
              return;
            } else {
              sd.r(-30);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Return to lobby";
        field_pb = "Create unrated game";
    }
}
