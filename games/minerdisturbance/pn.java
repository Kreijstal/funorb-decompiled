/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn implements uj {
    static nn field_a;
    static ln field_c;
    static String field_f;
    static int field_b;
    static String field_d;
    static int field_e;

    public final String a(byte param0) {
        int var2 = 1 % ((param0 + 33) / 62);
        return "Make Rock Ice";
    }

    final static void a(int param0, int param1, int param2) {
        if (null == ti.field_I ||
          !(ti.field_I.length >= param0)) {
          ti.field_I = new int[param0 * 2];
        }
        if (null == pi.field_h) {
          pi.field_h = new int[2 * param0];
          if (jk.field_db == null ||
            !(jk.field_db.length >= param0)) {
            jk.field_db = new int[2 * param0];
          }
          if (null == qa.field_c ||
            !(qa.field_c.length >= param0)) {
            qa.field_c = new int[2 * param0];
          }
          if (null == li.field_a) {
            li.field_a = new int[2 * param0];
            if (cc.field_L == null ||
              !(param0 <= cc.field_L.length)) {
              cc.field_L = new int[param0 * 2];
            }
            if (an.field_a == null ||
              !(param0 + param2 <= an.field_a.length)) {
              an.field_a = new int[2 * (param0 + param2)];
            }
            if (null == rg.field_ub ||
              !(param0 <= rg.field_ub.length)) {
              rg.field_ub = new boolean[2 * param0];
            }
          } else {
            if (li.field_a.length < param0) {
              li.field_a = new int[2 * param0];
              if (cc.field_L == null ||
                !(param0 <= cc.field_L.length)) {
                cc.field_L = new int[param0 * 2];
              }
              if (an.field_a == null ||
                !(param0 + param2 <= an.field_a.length)) {
                an.field_a = new int[2 * (param0 + param2)];
              }
              if (null == rg.field_ub ||
                !(param0 <= rg.field_ub.length)) {
                rg.field_ub = new boolean[2 * param0];
              }
            } else {
              if (cc.field_L == null) {
                cc.field_L = new int[param0 * 2];
                if (an.field_a == null ||
                  !(param0 + param2 <= an.field_a.length)) {
                  an.field_a = new int[2 * (param0 + param2)];
                }
                if (null == rg.field_ub ||
                  !(param0 <= rg.field_ub.length)) {
                  rg.field_ub = new boolean[2 * param0];
                }
              } else {
                if (param0 > cc.field_L.length) {
                  cc.field_L = new int[param0 * 2];
                  if (an.field_a == null ||
                    !(param0 + param2 <= an.field_a.length)) {
                    an.field_a = new int[2 * (param0 + param2)];
                  }
                  if (null == rg.field_ub ||
                    !(param0 <= rg.field_ub.length)) {
                    rg.field_ub = new boolean[2 * param0];
                  }
                } else {
                  if (an.field_a == null ||
                    !(param0 + param2 <= an.field_a.length)) {
                    an.field_a = new int[2 * (param0 + param2)];
                  }
                  if (null == rg.field_ub) {
                    rg.field_ub = new boolean[2 * param0];
                  } else {
                    if (param0 > rg.field_ub.length) {
                      rg.field_ub = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param0 > pi.field_h.length) {
            pi.field_h = new int[2 * param0];
            if (jk.field_db == null ||
              !(jk.field_db.length >= param0)) {
              jk.field_db = new int[2 * param0];
            }
            if (null == qa.field_c ||
              !(qa.field_c.length >= param0)) {
              qa.field_c = new int[2 * param0];
            }
            if (null == li.field_a) {
              li.field_a = new int[2 * param0];
              if (cc.field_L == null ||
                !(param0 <= cc.field_L.length)) {
                cc.field_L = new int[param0 * 2];
              }
              if (an.field_a == null ||
                !(param0 + param2 <= an.field_a.length)) {
                an.field_a = new int[2 * (param0 + param2)];
              }
              if (null == rg.field_ub ||
                !(param0 <= rg.field_ub.length)) {
                rg.field_ub = new boolean[2 * param0];
              }
            } else {
              if (li.field_a.length < param0) {
                li.field_a = new int[2 * param0];
                if (cc.field_L == null ||
                  !(param0 <= cc.field_L.length)) {
                  cc.field_L = new int[param0 * 2];
                }
                if (an.field_a == null ||
                  !(param0 + param2 <= an.field_a.length)) {
                  an.field_a = new int[2 * (param0 + param2)];
                }
                if (null == rg.field_ub ||
                  !(param0 <= rg.field_ub.length)) {
                  rg.field_ub = new boolean[2 * param0];
                }
              } else {
                if (cc.field_L == null) {
                  cc.field_L = new int[param0 * 2];
                  if (an.field_a == null ||
                    !(param0 + param2 <= an.field_a.length)) {
                    an.field_a = new int[2 * (param0 + param2)];
                  }
                  if (null == rg.field_ub ||
                    !(param0 <= rg.field_ub.length)) {
                    rg.field_ub = new boolean[2 * param0];
                  }
                } else {
                  if (param0 > cc.field_L.length) {
                    cc.field_L = new int[param0 * 2];
                    if (an.field_a == null ||
                      !(param0 + param2 <= an.field_a.length)) {
                      an.field_a = new int[2 * (param0 + param2)];
                    }
                    if (null == rg.field_ub ||
                      !(param0 <= rg.field_ub.length)) {
                      rg.field_ub = new boolean[2 * param0];
                    }
                  } else {
                    if (an.field_a == null ||
                      !(param0 + param2 <= an.field_a.length)) {
                      an.field_a = new int[2 * (param0 + param2)];
                    }
                    if (null == rg.field_ub) {
                      rg.field_ub = new boolean[2 * param0];
                    } else {
                      if (param0 > rg.field_ub.length) {
                        rg.field_ub = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (jk.field_db == null ||
              !(jk.field_db.length >= param0)) {
              jk.field_db = new int[2 * param0];
            }
            if (null == qa.field_c ||
              !(qa.field_c.length >= param0)) {
              qa.field_c = new int[2 * param0];
            }
            if (null == li.field_a) {
              li.field_a = new int[2 * param0];
              if (cc.field_L == null ||
                !(param0 <= cc.field_L.length)) {
                cc.field_L = new int[param0 * 2];
              }
              if (an.field_a == null ||
                !(param0 + param2 <= an.field_a.length)) {
                an.field_a = new int[2 * (param0 + param2)];
              }
              if (null == rg.field_ub) {
                rg.field_ub = new boolean[2 * param0];
              } else {
                if (param0 > rg.field_ub.length) {
                  rg.field_ub = new boolean[2 * param0];
                }
              }
            } else {
              if (li.field_a.length < param0) {
                li.field_a = new int[2 * param0];
                if (cc.field_L == null ||
                  !(param0 <= cc.field_L.length)) {
                  cc.field_L = new int[param0 * 2];
                }
                if (an.field_a == null ||
                  !(param0 + param2 <= an.field_a.length)) {
                  an.field_a = new int[2 * (param0 + param2)];
                }
                if (null == rg.field_ub ||
                  !(param0 <= rg.field_ub.length)) {
                  rg.field_ub = new boolean[2 * param0];
                }
              } else {
                if (cc.field_L == null) {
                  cc.field_L = new int[param0 * 2];
                  if (an.field_a == null ||
                    !(param0 + param2 <= an.field_a.length)) {
                    an.field_a = new int[2 * (param0 + param2)];
                  }
                } else {
                  if (param0 <= cc.field_L.length) {
                    if (an.field_a == null ||
                      !(param0 + param2 <= an.field_a.length)) {
                      an.field_a = new int[2 * (param0 + param2)];
                    }
                  } else {
                    cc.field_L = new int[param0 * 2];
                    if (an.field_a == null ||
                      !(param0 + param2 <= an.field_a.length)) {
                      an.field_a = new int[2 * (param0 + param2)];
                    }
                  }
                }
                if (null == rg.field_ub) {
                  rg.field_ub = new boolean[2 * param0];
                } else {
                  if (param0 > rg.field_ub.length) {
                    rg.field_ub = new boolean[2 * param0];
                  }
                }
              }
            }
          }
        }
        bc.field_d = 2147483647;
        fb.field_c = 0;
        bd.field_g = -2147483648;
        he.field_e = 2147483647;
        if (param1 != 11760) {
          return;
        }
        v.field_c = -2147483648;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (oc.field_f < 224) {
          var1 = oc.field_f % 32;
          ma.a(param0 - 181, 32 + oc.field_f - var1);
          if (param0 != 60) {
            pn.a(-31, -49, 109);
            return;
          }
          return;
        }
        ma.a(-121, 256);
        if (param0 != 60) {
          pn.a(-31, -49, 109);
          return;
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        tc var5 = null;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          if (!fn.field_o) {
            return;
          }
          if (param0 != -17) {
            field_d = (String) null;
          }
          eh.b(40, 40, 560, 400, 1, 164);
          eh.a(40, 40, 560, 400, 16777215);
          var1_int = 16;
          var2 = 60;
          var3 = 60;
          wi.field_A.a("Press 'H' to close this screen", var3, var2, 16777215, -1);
          var2 = var2 + var1_int;
          var4 = var2;
          var5 = (tc) (ii.field_b.b(80));
          while (var5 != null) {
            var7 = var5.field_q;
            if (var7 == 2) {
              var6 = "F" + var5.field_w + "+ALT";
            } else {
              if (1 == var7) {
                var6 = "F" + var5.field_w + "+CTRL";
              } else {
                if (var7 == 3) {
                  var6 = "F" + var5.field_w + "+CTRL+ALT";
                } else {
                  if (0 != var7) {
                    var6 = null;
                  } else {
                    var6 = "F" + var5.field_w;
                  }
                }
              }
            }
            eh.b(-10 + var3, -10 + var2, 50, 20 + var1_int, 65330, 120);
            wi.field_A.a((String) (var6), -10 + var3, var2 - 10, 50, var1_int + 20, 16777215, 5592405, 1, 1, 0);
            wi.field_A.a(var5.field_n, var3 - 10 + 60, var2 - 10, 140, var1_int + 20, 16777215, -1, 0, 1, 0);
            var2 = var2 + (var1_int + 24);
            if (var2 > 420) {
              var3 += 220;
              var2 = var4;
            }
            var5 = (tc) (ii.field_b.b((byte) 56));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "pn.E(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 16777215) {
          pn.a(-105, -121, -58);
        }
    }

    public final void a(boolean param0) {
        if (param0) {
          field_c = (ln) null;
          tb.field_a = 2;
          bc.field_a = 3;
          return;
        }
        tb.field_a = 2;
        bc.field_a = 3;
    }

    static {
        field_f = "Connection restored.";
        field_a = new nn(1);
        field_d = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
