/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static boolean field_a;
    static int field_d;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        Object var2 = null;
        if (vl.field_n != null) {
          nb.a(-2, (java.awt.Canvas) (Object) vl.field_n);
          vl.field_n.a(0, ka.field_i);
          if (param0 > -14) {
            L0: {
              var2 = null;
              jk.a((java.awt.Frame) null, 17, (d) null);
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L0;
              } else {
                break L0;
              }
            }
            f.field_kb.requestFocus();
            return;
          } else {
            L1: {
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L1;
              } else {
                break L1;
              }
            }
            f.field_kb.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -10848) {
            field_c = null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        var5 = Geoblox.field_C;
        mh.b();
        ok.field_g = 11;
        jf.field_b = new int[260];
        var1 = -29 / ((param0 - -40) / 45);
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            var6 = 256;
            var1 = var6;
            L1: while (true) {
              if (jf.field_b.length > var6) {
                jf.field_b[var6] = 255;
                var6++;
                continue L1;
              } else {
                return;
              }
            }
          } else {
            var3 = 15.0;
            jf.field_b[var2] = (int)(255.0 * Math.pow((double)((float)var2 / 256.0f), var3));
            var2++;
            continue L0;
          }
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            jk.a(-65);
            return gh.field_P;
        }
        return gh.field_P;
    }

    final static nd a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Geoblox.field_C;
          var2 = param1.length();
          if (param0 == 255) {
            break L0;
          } else {
            jk.a(118);
            if (0 != var2) {
              if (-64 > (var2 ^ -1)) {
                return hk.field_x;
              } else {
                var3 = 0;
                if (var2 > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (45 != var4) {
                      if (pk.field_q.indexOf(var4) != 0) {
                        var3++;
                        break L1;
                      } else {
                        return ii.field_h;
                      }
                    } else {
                      if (-1 != var3) {
                        if (var3 != -1 + var2) {
                          var3++;
                          break L1;
                        } else {
                          return ii.field_h;
                        }
                      } else {
                        return ii.field_h;
                      }
                    }
                  }
                  var3++;
                  var3++;
                  var3++;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              return pj.field_f;
            }
          }
        }
        if (0 != var2) {
          if (-64 < var2) {
            return hk.field_x;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (45 != var4) {
                  if ((pk.field_q.indexOf(var4) ^ -1) == 0) {
                    return ii.field_h;
                  } else {
                    var3++;
                    var3++;
                    continue L2;
                  }
                } else {
                  L3: {
                    if (-1 == (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (var3 == -1 + var2) {
                        break L3;
                      } else {
                        var3++;
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  return ii.field_h;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return pj.field_f;
        }
    }

    final static void a(java.awt.Frame param0, int param1, d param2) {
        cb var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        L0: while (true) {
          var3 = param2.a(param0, 0);
          L1: while (true) {
            if (var3.field_a != 0) {
              if ((var3.field_a ^ -1) != -2) {
                bc.a(0, 100L);
                continue L0;
              } else {
                param0.setVisible(false);
                if (param1 == 10) {
                  param0.dispose();
                  return;
                } else {
                  field_b = null;
                  param0.dispose();
                  return;
                }
              }
            } else {
              bc.a(0, 10L);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "Return to game";
    }
}
