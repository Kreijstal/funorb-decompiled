/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia implements eb {
    static boolean field_d;
    static volatile int field_i;
    static int[] field_a;
    static fp field_c;
    private int field_f;
    private int field_b;
    static int field_e;
    private jl field_g;
    static int field_h;

    final static void a(boolean param0, String param1, int param2, java.applet.Applet param3) {
        try {
            if (!(!cb.field_p.startsWith("win"))) {
                if (la.a(param1, -31451)) {
                    return;
                }
            }
            if (param2 > -31) {
                field_i = 125;
            }
            try {
                param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                jo.a(1, "MGR1: " + param1, (Throwable) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        jd var1 = (jd) (Object) oj.field_P.b(param0 + -174);
        if (param0 != 92) {
            field_i = -106;
            if (!(var1 != null)) {
                throw new IllegalStateException();
            }
            t.a(var1.field_t, var1.field_q, var1.field_u);
            t.f(var1.field_w, var1.field_v, var1.field_m, var1.field_l);
            var1.field_t = null;
            vc.field_O.a(param0 ^ 22065, (fa) (Object) var1);
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        t.a(var1.field_t, var1.field_q, var1.field_u);
        t.f(var1.field_w, var1.field_v, var1.field_m, var1.field_l);
        var1.field_t = null;
        vc.field_O.a(param0 ^ 22065, (fa) (Object) var1);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -74) {
            ia.a(92);
        }
    }

    public ia() {
        ((ia) this).field_f = 1;
        ((ia) this).field_b = 1;
        ((ia) this).field_g = he.field_d;
    }

    ia(jl param0, int param1, int param2) {
        ((ia) this).field_f = param1;
        ((ia) this).field_g = param0;
        ((ia) this).field_b = param2;
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        if (!param0.field_D) {
          if (!param0.b(true)) {
            var6 = 2188450;
            int discarded$3 = ((ia) this).field_g.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_q + "</u>", param3 - -param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, var6, -1, ((ia) this).field_f, ((ia) this).field_b, ((ia) this).field_g.field_w + ((ia) this).field_g.field_z);
            if (param1 == -124) {
              if (param0.b(true)) {
                var7 = ((ia) this).field_g.c(param0.field_q);
                var8 = ((ia) this).field_g.field_z + ((ia) this).field_g.field_w;
                var9 = param0.field_z + param3;
                if (((ia) this).field_f != 2) {
                  if (1 == ((ia) this).field_f) {
                    var9 = var9 + (-var7 + param0.field_E >> -1449296703);
                    var10 = param0.field_p + param2;
                    if (-3 != ((ia) this).field_b) {
                      L0: {
                        if (-2 != ((ia) this).field_b) {
                          break L0;
                        } else {
                          var10 = var10 + (-var8 + param0.field_C >> 538216705);
                          break L0;
                        }
                      }
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    } else {
                      var10 = var10 + (param0.field_C - var8);
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    }
                  } else {
                    var10 = param0.field_p + param2;
                    if (-3 != ((ia) this).field_b) {
                      L1: {
                        if (-2 != ((ia) this).field_b) {
                          break L1;
                        } else {
                          var10 = var10 + (-var8 + param0.field_C >> 538216705);
                          break L1;
                        }
                      }
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    } else {
                      var10 = var10 + (param0.field_C - var8);
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    }
                  }
                } else {
                  var9 = var9 + (-var7 + param0.field_E);
                  var10 = param0.field_p + param2;
                  if (-3 == ((ia) this).field_b) {
                    var10 = var10 + (param0.field_C - var8);
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  } else {
                    L2: {
                      if (-2 != ((ia) this).field_b) {
                        break L2;
                      } else {
                        var10 = var10 + (-var8 + param0.field_C >> 538216705);
                        break L2;
                      }
                    }
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var6 = 3249872;
            int discarded$4 = ((ia) this).field_g.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_q + "</u>", param3 - -param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, var6, -1, ((ia) this).field_f, ((ia) this).field_b, ((ia) this).field_g.field_w + ((ia) this).field_g.field_z);
            if (param1 == -124) {
              if (param0.b(true)) {
                var7 = ((ia) this).field_g.c(param0.field_q);
                var8 = ((ia) this).field_g.field_z + ((ia) this).field_g.field_w;
                var9 = param0.field_z + param3;
                if (((ia) this).field_f != 2) {
                  if (1 == ((ia) this).field_f) {
                    var9 = var9 + (-var7 + param0.field_E >> -1449296703);
                    var10 = param0.field_p + param2;
                    if (-3 == ((ia) this).field_b) {
                      var10 = var10 + (param0.field_C - var8);
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    } else {
                      L3: {
                        if (-2 != ((ia) this).field_b) {
                          break L3;
                        } else {
                          var10 = var10 + (-var8 + param0.field_C >> 538216705);
                          break L3;
                        }
                      }
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    }
                  } else {
                    var10 = param0.field_p + param2;
                    if (-3 == ((ia) this).field_b) {
                      var10 = var10 + (param0.field_C - var8);
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    } else {
                      L4: {
                        if (-2 != ((ia) this).field_b) {
                          break L4;
                        } else {
                          var10 = var10 + (-var8 + param0.field_C >> 538216705);
                          break L4;
                        }
                      }
                      gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                      return;
                    }
                  }
                } else {
                  var9 = var9 + (-var7 + param0.field_E);
                  var10 = param0.field_p + param2;
                  if (-3 == ((ia) this).field_b) {
                    var10 = var10 + (param0.field_C - var8);
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  } else {
                    L5: {
                      if (-2 != ((ia) this).field_b) {
                        break L5;
                      } else {
                        var10 = var10 + (-var8 + param0.field_C >> 538216705);
                        break L5;
                      }
                    }
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var6 = 3249872;
          int discarded$5 = ((ia) this).field_g.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_q + "</u>", param3 - -param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, var6, -1, ((ia) this).field_f, ((ia) this).field_b, ((ia) this).field_g.field_w + ((ia) this).field_g.field_z);
          if (param1 == -124) {
            if (param0.b(true)) {
              var7 = ((ia) this).field_g.c(param0.field_q);
              var8 = ((ia) this).field_g.field_z + ((ia) this).field_g.field_w;
              var9 = param0.field_z + param3;
              if (((ia) this).field_f != 2) {
                if (1 == ((ia) this).field_f) {
                  var9 = var9 + (-var7 + param0.field_E >> -1449296703);
                  var10 = param0.field_p + param2;
                  if (-3 == ((ia) this).field_b) {
                    var10 = var10 + (param0.field_C - var8);
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  } else {
                    L6: {
                      if (-2 != ((ia) this).field_b) {
                        break L6;
                      } else {
                        var10 = var10 + (-var8 + param0.field_C >> 538216705);
                        break L6;
                      }
                    }
                    gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                    return;
                  }
                } else {
                  L7: {
                    var10 = param0.field_p + param2;
                    if (-3 != ((ia) this).field_b) {
                      if (-2 != ((ia) this).field_b) {
                        break L7;
                      } else {
                        var10 = var10 + (-var8 + param0.field_C >> 538216705);
                        break L7;
                      }
                    } else {
                      var10 = var10 + (param0.field_C - var8);
                      break L7;
                    }
                  }
                  gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
                  return;
                }
              } else {
                L8: {
                  var9 = var9 + (-var7 + param0.field_E);
                  var10 = param0.field_p + param2;
                  if (-3 != ((ia) this).field_b) {
                    if (-2 != ((ia) this).field_b) {
                      break L8;
                    } else {
                      var10 = var10 + (-var8 + param0.field_C >> 538216705);
                      break L8;
                    }
                  } else {
                    var10 = var10 + (param0.field_C - var8);
                    break L8;
                  }
                }
                gk.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_c = new fp();
        field_h = 256;
    }
}
