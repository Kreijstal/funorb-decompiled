/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int[] field_c;
    private ha field_f;
    static uj field_a;
    private lj field_d;
    private lj field_e;
    private ha field_g;
    static int[][][] field_b;

    final static void a(int param0, int param1) {
        fe var2 = null;
        int var3 = 0;
        if (0 <= param1) {
          if (param1 < 13) {
            if (param0 != 12604) {
              field_c = null;
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              e discarded$4 = ol.a(param0 + -12732, var2, var3);
              return;
            } else {
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              e discarded$5 = ol.a(param0 + -12732, var2, var3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -26193) {
            u.a((byte) 11, 88);
            field_c = null;
            return;
        }
        field_c = null;
    }

    private final fe a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        fe var8 = null;
        fe var8_ref = null;
        q var9 = null;
        Object var10 = null;
        q var12 = null;
        fe var13 = null;
        q var37 = null;
        fe var38 = null;
        q var45 = null;
        fe var46 = null;
        if (param0 == 0) {
          var5 = (param3 << 522666948 & 65533 | param3 >>> 507203052) ^ param2;
          var5 = var5 | param3 << -1275001936;
          var6 = (long)var5;
          var8 = (fe) (Object) ((u) this).field_g.a((byte) 97, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if (0 < param1[0]) {
                var45 = q.a(((u) this).field_d, param3, param2);
                if (var45 != null) {
                  var46 = var45.b();
                  var8_ref = var46;
                  ((u) this).field_g.a(106, (da) (Object) var8_ref, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var46.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var45 = q.a(((u) this).field_d, param3, param2);
              if (var45 != null) {
                var46 = var45.b();
                var8_ref = var46;
                ((u) this).field_g.a(106, (da) (Object) var8_ref, var6);
                if (param1 != null) {
                  param1[0] = param1[0] - var46.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          var10 = null;
          fe discarded$1 = ((u) this).a(74, -112, (int[]) null);
          var5 = (param3 << 522666948 & 65533 | param3 >>> 507203052) ^ param2;
          var5 = var5 | param3 << -1275001936;
          var6 = (long)var5;
          var8 = (fe) (Object) ((u) this).field_g.a((byte) 97, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if (0 < param1[0]) {
                var37 = q.a(((u) this).field_d, param3, param2);
                var9 = var37;
                if (var37 != null) {
                  var38 = var37.b();
                  var8_ref = var38;
                  ((u) this).field_g.a(106, (da) (Object) var8_ref, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var38.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var12 = q.a(((u) this).field_d, param3, param2);
              var9 = var12;
              if (var12 != null) {
                var13 = var12.b();
                var8_ref = var13;
                ((u) this).field_g.a(106, (da) (Object) var8_ref, var6);
                if (param1 != null) {
                  param1[0] = param1[0] - var13.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final fe a(int param0, int param1, int[] param2) {
        Object var5 = null;
        if (param0 > 85) {
          if (((u) this).field_e.c((byte) 52) != 1) {
            if (-2 == (((u) this).field_e.a(param1, -89) ^ -1)) {
              return this.a((byte) 119, param2, 0, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a((byte) 113, param2, param1, 0);
          }
        } else {
          var5 = null;
          fe discarded$5 = ((u) this).a(108, (int[]) null, -71);
          if (((u) this).field_e.c((byte) 52) != 1) {
            if (-2 == (((u) this).field_e.a(param1, -89) ^ -1)) {
              return this.a((byte) 119, param2, 0, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a((byte) 113, param2, param1, 0);
          }
        }
    }

    final fe a(int param0, int[] param1, int param2) {
        if ((((u) this).field_d.c((byte) 52) ^ -1) == -2) {
          return this.a(0, param1, param2, 0);
        } else {
          if (param0 == -1) {
            if ((((u) this).field_d.a(param2, -77) ^ -1) == -2) {
              return this.a(0, param1, 0, param2);
            } else {
              throw new RuntimeException();
            }
          } else {
            u.a(-35, -112);
            if ((((u) this).field_d.a(param2, -77) ^ -1) == -2) {
              return this.a(0, param1, 0, param2);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final static void a(boolean param0, lj param1) {
        ka var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new ka(param1.a(-2, "", "final_frame.jpg"), (java.awt.Component) (Object) bg.field_P);
        var3 = var2.field_u;
        var4 = var2.field_x;
        wb.b((byte) 66);
        hf.field_a = new ka(var3, 3 * var4 / 4);
        hf.field_a.d();
        var2.a(0, 0);
        td.field_o = new ka(var3, var4 - hf.field_a.field_x);
        td.field_o.d();
        var2.a(0, -hf.field_a.field_x);
        if (!param0) {
          return;
        } else {
          td.field_o.field_p = hf.field_a.field_x;
          ie.b((byte) -9);
          return;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, int param2, String param3) {
        try {
            if (uj.field_a.startsWith("win")) {
                if (ol.a(param3, true)) {
                    return;
                }
            }
            if (param2 >= -56) {
                field_b = null;
            }
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                td.a("MGR1: " + param3, (Throwable) null, (byte) -90);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    u(lj param0, lj param1) {
        ((u) this).field_f = new ha(256);
        ((u) this).field_g = new ha(256);
        ((u) this).field_d = param0;
        ((u) this).field_e = param1;
    }

    private final fe a(byte param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        fe var8 = null;
        fe var8_ref = null;
        wg var9 = null;
        wg var9_ref = null;
        var5 = param2 ^ (param3 >>> -229964500 | (param3 & -268431361) << -800298748);
        if (param0 > 109) {
          var5 = var5 | param3 << 260325232;
          var6 = 4294967296L ^ (long)var5;
          var8 = (fe) (Object) ((u) this).field_g.a((byte) 89, var6);
          if (var8 == null) {
            if (param1 != null) {
              if (0 < param1[0]) {
                L0: {
                  var9 = (wg) (Object) ((u) this).field_f.a((byte) 100, var6);
                  if (var9 == null) {
                    var9_ref = wg.a(((u) this).field_e, param3, param2);
                    if (var9_ref != null) {
                      ((u) this).field_f.a(-101, (da) (Object) var9_ref, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(true);
                  ((u) this).field_g.a(-98, (da) (Object) var8_ref, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (wg) (Object) ((u) this).field_f.a((byte) 100, var6);
                if (var9 == null) {
                  var9_ref = wg.a(((u) this).field_e, param3, param2);
                  if (var9_ref != null) {
                    ((u) this).field_f.a(-101, (da) (Object) var9_ref, var6);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(true);
                ((u) this).field_g.a(-98, (da) (Object) var8_ref, var6);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, int param1) {
        if (!(50 == param1)) {
            throw new IllegalArgumentException();
        }
        int var2 = -73 / ((10 - param0) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 200, 450};
        field_b = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
