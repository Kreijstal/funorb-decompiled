/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static int field_c;
    static String field_a;
    static gk field_b;
    static pk field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Geoblox.field_C;
        if (gb.field_f < 0) {
          return;
        }
        var3 = -135 + param1;
        var4 = param0 - 35;
        var5 = 256;
        if (75 > gb.field_f) {
          var5 = (gb.field_f << 8) / 75;
        }
        if (gb.field_f > 200) {
          var5 = (250 - gb.field_f << 8) / 50;
        }
        Geoblox.a(1, ki.field_c);
        mh.b();
        vb.c();
        ck.a((byte) 123);
        if (var5 < 256) {
          vb.b(0, 0, vb.field_f, vb.field_b, 0, -var5 + 256);
          id.a(true);
          if (gb.field_f >= 150) {
            bk.field_b.d(15 + var3, var4 + 10, var5);
          } else {
            ki.field_c.d(var3, var4);
          }
          var6 = -125 + gb.field_f;
          if (param2 != -51) {
            field_a = (String) null;
          }
          if (var6 > 0) {
            if (var6 < 50) {
              if (var6 >= 20) {
                if (var6 >= 30) {
                  var7 = 256 * (-var6 + 50) / 20;
                  cd.field_l.c(var3, var4, var7);
                } else {
                  cd.field_l.c(var3, var4, 256);
                }
              } else {
                var7 = var6 * 256 / 20;
                cd.field_l.c(var3, var4, var7);
              }
            }
          }
        } else {
          id.a(true);
          if (gb.field_f >= 150) {
            bk.field_b.d(15 + var3, var4 + 10, var5);
            var6 = -125 + gb.field_f;
            if (param2 != -51) {
              field_a = (String) null;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (var6 >= 30) {
                      var7 = 256 * (-var6 + 50) / 20;
                      cd.field_l.c(var3, var4, var7);
                    } else {
                      cd.field_l.c(var3, var4, 256);
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    cd.field_l.c(var3, var4, var7);
                  }
                }
              }
              var6 = gb.field_f - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
              }
            } else {
              if (var6 <= 0) {
                var6 = gb.field_f - 140;
                if (var6 > 0) {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                  }
                  cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                }
              } else {
                if (var6 >= 50) {
                  var6 = gb.field_f - 140;
                  if (var6 > 0) {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                    }
                    cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                  }
                } else {
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                    cd.field_l.c(var3, var4, var7);
                    var6 = gb.field_f - 140;
                    if (var6 > 0) {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = var6 * 256 / 20;
                      }
                      cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                    }
                  } else {
                    if (var6 < 30) {
                      cd.field_l.c(var3, var4, 256);
                      var6 = gb.field_f - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                      }
                    } else {
                      var7 = 256 * (-var6 + 50) / 20;
                      cd.field_l.c(var3, var4, var7);
                      var6 = gb.field_f - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          ki.field_c.d(var3, var4);
          var6 = -125 + gb.field_f;
          if (param2 != -51) {
            field_a = (String) null;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    var7 = 256 * (-var6 + 50) / 20;
                    cd.field_l.c(var3, var4, var7);
                  } else {
                    cd.field_l.c(var3, var4, 256);
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  cd.field_l.c(var3, var4, var7);
                }
              }
            }
          } else {
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  cd.field_l.c(var3, var4, var7);
                } else {
                  if (var6 < 30) {
                    cd.field_l.c(var3, var4, 256);
                  } else {
                    var7 = 256 * (-var6 + 50) / 20;
                    cd.field_l.c(var3, var4, var7);
                  }
                }
              }
            }
          }
        }
        var6 = gb.field_f - 140;
        if (var6 > 0) {
          var7 = 256;
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
          }
          cl.field_b.d(15 + var3, var4 + 10, var5 * var7 >> 8);
        }
        return;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -6910) {
            field_c = -22;
        }
    }

    final static void a(byte param0) {
        vl.field_q = false;
        tc.field_a = null;
        int var1 = 46 / ((param0 + 64) / 39);
        oe.field_V = 0;
        bc.field_a = -1;
        nj.field_g = -1;
    }

    static {
        field_a = "Open in popup window";
        field_b = new gk();
    }
}
