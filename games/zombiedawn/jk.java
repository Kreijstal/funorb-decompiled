/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_c;
    static String field_h;
    static String field_g;
    private int field_f;
    float field_a;
    String field_b;
    private int field_d;
    private j[] field_e;

    final void a(String param0, dj param1, int param2) {
        this.a(param1, -1, (String) null, param0, 25324, (String) null);
        if (param2 == 1) {
            return;
        }
        jk.a(false, true);
    }

    private final void a(dj param0, int param1, String param2, String param3, int param4, String param5) {
        j[] var7 = null;
        j var7_ref = null;
        j var8 = null;
        j[] var9 = null;
        j var10 = null;
        L0: {
          if (((jk) this).field_e.length <= ((jk) this).field_c) {
            var9 = new j[2 * ((jk) this).field_c];
            var7 = var9;
            gp.a((Object[]) (Object) ((jk) this).field_e, 0, (Object[]) (Object) var9, 0, ((jk) this).field_c);
            ((jk) this).field_e = var9;
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 != 25324) {
          return;
        } else {
          var8 = new j();
          var10 = var8;
          var7_ref = var10;
          var10.field_i = param2;
          var10.field_k = param5;
          var10.field_f = param1;
          var10.field_g = param3;
          var10.field_c = param0;
          ((jk) this).field_c = ((jk) this).field_c + 1;
          ((jk) this).field_e[((jk) this).field_c] = var8;
          return;
        }
    }

    final static void b(int param0) {
        lc.field_i = -1;
        pl.field_m = param0;
        mm.field_i = -1;
        qo.field_x = false;
        da.field_m = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (!we.o((byte) -80)) {
          return;
        } else {
          L0: {
            if (param0) {
              bi.a(0, 0, bi.field_f, bi.field_a, 0, 192);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1) {
            field_h = null;
            wo.field_xb.a(0, 0, 0);
            return;
          } else {
            wo.field_xb.a(0, 0, 0);
            return;
          }
        }
    }

    final static void a(byte param0, aa param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = ZombieDawn.field_J;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            L1: {
              var2 = 0;
              if (tb.field_E <= var2) {
                break L1;
              } else {
                L2: {
                  if (cc.field_m[var2].field_j != param1.field_j) {
                    var2++;
                    break L2;
                  } else {
                    nl.field_o[cc.field_m[var2].a((byte) -82)] = nl.field_o[cc.field_m[var2].a((byte) -82)] + 1;
                    var2++;
                    break L2;
                  }
                }
                var2++;
                var2++;
                var2++;
                break L1;
              }
            }
            if (param0 < -57) {
              L3: {
                nl.field_o[param1.a((byte) -80)] = nl.field_o[param1.a((byte) -80)] + 1;
                var2 = 0;
                var3 = 0;
                if (tb.field_E <= var3) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (cc.field_m[var3].field_j != param1.field_j) {
                        break L5;
                      } else {
                        var4 = cc.field_m[var3].a((byte) -78);
                        if (ej.field_d < nl.field_o[var4]) {
                          nl.field_o[var4] = nl.field_o[var4] - 1;
                          var3++;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2++;
                    cc.field_m[var2] = cc.field_m[var3];
                    var3++;
                    break L4;
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L3;
                }
              }
              tb.field_E = var2;
              tb.field_E = tb.field_E + 1;
              cc.field_m[tb.field_E] = param1;
              return;
            } else {
              var6 = null;
              jk.a((byte) -114, (aa) null);
              L6: {
                nl.field_o[param1.a((byte) -80)] = nl.field_o[param1.a((byte) -80)] + 1;
                var2 = 0;
                var3 = 0;
                if (tb.field_E <= var3) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (cc.field_m[var3].field_j != param1.field_j) {
                        break L8;
                      } else {
                        var4 = cc.field_m[var3].a((byte) -78);
                        if (ej.field_d < nl.field_o[var4]) {
                          nl.field_o[var4] = nl.field_o[var4] - 1;
                          var3++;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2++;
                    cc.field_m[var2] = cc.field_m[var3];
                    var3++;
                    break L7;
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L6;
                }
              }
              tb.field_E = var2;
              tb.field_E = tb.field_E + 1;
              cc.field_m[tb.field_E] = param1;
              return;
            }
          } else {
            nl.field_o[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final void a(byte param0, dj param1, String param2, String param3) {
        Object var6 = null;
        this.a(param1, -1, (String) null, param3, 25324, param2);
        if (param0 <= -90) {
          return;
        } else {
          var6 = null;
          jk.a((byte) -18, (aa) null);
          return;
        }
    }

    private final void a(int param0, int param1, j param2) {
        float var4 = 0.0f;
        if (param0 != 0) {
            field_h = null;
            var4 = (float)(1 + ((jk) this).field_f) + (float)param1 / 100.0f;
            ((jk) this).field_a = (float)((jk) this).field_d * var4 / (float)(1 + ((jk) this).field_c);
            if (param1 == 0) {
                ((jk) this).field_b = param2.field_g;
            } else {
                ((jk) this).field_b = param2.field_k + " - " + param1 + "%";
                return;
            }
            return;
        }
        var4 = (float)(1 + ((jk) this).field_f) + (float)param1 / 100.0f;
        ((jk) this).field_a = (float)((jk) this).field_d * var4 / (float)(1 + ((jk) this).field_c);
        if (param1 == 0) {
            ((jk) this).field_b = param2.field_g;
        } else {
            ((jk) this).field_b = param2.field_k + " - " + param1 + "%";
            return;
        }
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 <= 19) {
            field_g = null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final void a(String param0, String param1, String param2, dj param3, byte param4) {
        this.a(param3, -1, param0, param1, param4 ^ -25280, param2);
        if (param4 == -84) {
            return;
        }
        jk.b(-21);
    }

    final boolean a(int param0) {
        int var3 = 0;
        j var4 = null;
        var3 = ZombieDawn.field_J;
        L0: while (true) {
          if (((jk) this).field_c <= ((jk) this).field_f) {
            if (param0 != -1) {
              ((jk) this).field_d = -49;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((jk) this).field_e[((jk) this).field_f];
            if (var4.field_c.a((byte) 73)) {
              L1: {
                if ((var4.field_f ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_c.b(-29092, var4.field_f)) {
                    this.a(0, var4.field_c.a(var4.field_f, param0 + -5365), var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_i == null) {
                  break L2;
                } else {
                  if (var4.field_c.a(-1, var4.field_i)) {
                    break L2;
                  } else {
                    this.a(0, var4.field_c.b(var4.field_i, 103), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_f ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_i != null) {
                    break L3;
                  } else {
                    if (var4.field_k == null) {
                      break L3;
                    } else {
                      if (!var4.field_c.c(9001)) {
                        this.a(param0 ^ -1, var4.field_c.e(-102), var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((jk) this).field_f = ((jk) this).field_f + 1;
              continue L0;
            } else {
              this.a(param0 ^ -1, 0, var4);
              return false;
            }
          }
        }
    }

    jk(int param0) {
        ((jk) this).field_e = new j[16];
        ((jk) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Back";
        field_h = "This is a members only level. If you are a member, log in to start at any members only level you've reached.";
    }
}
