/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cb {
    static String field_k;
    private pb[] field_f;
    static boolean[][] field_e;
    static String field_d;
    private int field_b;
    String field_a;
    static String field_h;
    float field_l;
    private int field_j;
    static String field_i;
    private int field_g;
    static int field_c;

    private final void a(String param0, int param1, String param2, String param3, int param4, ji param5) {
        pb[] var9 = null;
        if (((cb) this).field_g >= ((cb) this).field_f.length) {
            var9 = new pb[2 * ((cb) this).field_g];
            pb[] var7 = var9;
            an.a((Object[]) (Object) ((cb) this).field_f, 0, (Object[]) (Object) var9, 0, ((cb) this).field_g);
            ((cb) this).field_f = var9;
        }
        pb var8 = new pb();
        pb var10 = var8;
        pb var7_ref = var10;
        var10.field_j = param3;
        if (param1 != 2) {
            ((cb) this).field_a = null;
        }
        var10.field_a = param2;
        var10.field_b = param0;
        var10.field_h = param4;
        var10.field_g = param5;
        ((cb) this).field_g = ((cb) this).field_g + 1;
        ((cb) this).field_f[((cb) this).field_g] = var8;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 12623) {
            return;
        }
        field_k = null;
        field_h = null;
        field_i = null;
        field_d = null;
    }

    final boolean a(int param0) {
        pb var2 = null;
        int var3 = 0;
        pb var4 = null;
        pb var5 = null;
        pb var6 = null;
        var3 = client.field_A ? 1 : 0;
        if (param0 > -48) {
          boolean discarded$1 = ((cb) this).a(88);
          L0: while (true) {
            if (((cb) this).field_j < ((cb) this).field_g) {
              var6 = ((cb) this).field_f[((cb) this).field_j];
              var4 = var6;
              var2 = var4;
              if (!var6.field_g.a((byte) 121)) {
                this.a(var6, 30993, 0);
                return false;
              } else {
                L1: {
                  if ((var6.field_h ^ -1) > -1) {
                    break L1;
                  } else {
                    if (!var6.field_g.b(var6.field_h, (byte) -106)) {
                      this.a(var2, 30993, var6.field_g.a((byte) 34, var6.field_h));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_b) {
                    break L2;
                  } else {
                    if (!var6.field_g.a(var6.field_b, (byte) -103)) {
                      this.a(var2, 30993, var6.field_g.a(20, var6.field_b));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_h ^ -1)) {
                    break L3;
                  } else {
                    if (var6.field_b != null) {
                      break L3;
                    } else {
                      if (null == var6.field_a) {
                        break L3;
                      } else {
                        if (!var6.field_g.a(false)) {
                          this.a(var2, 30993, var6.field_g.b((byte) -100));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((cb) this).field_j = ((cb) this).field_j + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((cb) this).field_j < ((cb) this).field_g) {
              var5 = ((cb) this).field_f[((cb) this).field_j];
              var4 = var5;
              var2 = var4;
              if (!var5.field_g.a((byte) 121)) {
                this.a(var5, 30993, 0);
                return false;
              } else {
                L5: {
                  if ((var5.field_h ^ -1) > -1) {
                    break L5;
                  } else {
                    if (!var5.field_g.b(var5.field_h, (byte) -106)) {
                      this.a(var2, 30993, var5.field_g.a((byte) 34, var5.field_h));
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_b) {
                    break L6;
                  } else {
                    if (!var5.field_g.a(var5.field_b, (byte) -103)) {
                      this.a(var2, 30993, var5.field_g.a(20, var5.field_b));
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_h ^ -1)) {
                    break L7;
                  } else {
                    if (var5.field_b != null) {
                      break L7;
                    } else {
                      if (null == var5.field_a) {
                        break L7;
                      } else {
                        if (!var5.field_g.a(false)) {
                          this.a(var2, 30993, var5.field_g.b((byte) -100));
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((cb) this).field_j = ((cb) this).field_j + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        Object var2 = null;
        if (param0 == -128) {
          if (cd.a(8192)) {
            if ((8 & uf.field_A) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = null;
          int discarded$4 = cb.a((byte) 49, (CharSequence) null);
          if (cd.a(8192)) {
            if ((8 & uf.field_A) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void a(pb param0, int param1, int param2) {
        if (param1 != 30993) {
            return;
        }
        float var4 = (float)(((cb) this).field_j - -1) + (float)param2 / 100.0f;
        ((cb) this).field_l = var4 * (float)((cb) this).field_b / (float)(((cb) this).field_g + 1);
        if (param2 == 0) {
            ((cb) this).field_a = param0.field_j;
        } else {
            ((cb) this).field_a = param0.field_a + " - " + param2 + "%";
            return;
        }
    }

    final void a(String param0, ji param1, String param2, byte param3, String param4) {
        int var6 = -19 / ((param3 - 43) / 42);
        this.a(param0, 2, param2, param4, -1, param1);
    }

    final static void a(hl param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        pf var14 = null;
        pf var30 = null;
        pf var46 = null;
        pf var47 = null;
        String var48 = null;
        pf var49 = null;
        String var50 = null;
        pf var51 = null;
        pf var52 = null;
        pf var53 = null;
        String var54 = null;
        pf var55 = null;
        String var56 = null;
        pf var57 = null;
        pf var58 = null;
        String var59 = null;
        pf var60 = null;
        String var61 = null;
        pf var62 = null;
        pf var63 = null;
        String var64 = null;
        pf var65 = null;
        String var66 = null;
        pf var67 = null;
        String stackIn_1_0 = null;
        Object stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        Object stackIn_1_3 = null;
        w stackIn_1_4 = null;
        String stackIn_1_5 = null;
        long stackIn_1_6 = 0L;
        int stackIn_1_7 = 0;
        String stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        Object stackIn_2_3 = null;
        w stackIn_2_4 = null;
        String stackIn_2_5 = null;
        long stackIn_2_6 = 0L;
        int stackIn_2_7 = 0;
        String stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        Object stackIn_3_3 = null;
        w stackIn_3_4 = null;
        String stackIn_3_5 = null;
        long stackIn_3_6 = 0L;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        String stackOut_0_0 = null;
        Object stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        Object stackOut_0_3 = null;
        w stackOut_0_4 = null;
        String stackOut_0_5 = null;
        long stackOut_0_6 = 0L;
        int stackOut_0_7 = 0;
        String stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        Object stackOut_2_3 = null;
        w stackOut_2_4 = null;
        String stackOut_2_5 = null;
        long stackOut_2_6 = 0L;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        String stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        Object stackOut_1_3 = null;
        w stackOut_1_4 = null;
        String stackOut_1_5 = null;
        long stackOut_1_6 = 0L;
        int stackOut_1_7 = 0;
        int stackOut_1_8 = 0;
        L0: {
          stackOut_0_0 = param0.field_o;
          stackOut_0_1 = null;
          stackOut_0_2 = 100;
          stackOut_0_3 = null;
          stackOut_0_4 = param0.field_f;
          stackOut_0_5 = param0.field_p;
          stackOut_0_6 = param0.field_r;
          stackOut_0_7 = param0.field_m;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_2_5 = stackOut_0_5;
          stackIn_2_6 = stackOut_0_6;
          stackIn_2_7 = stackOut_0_7;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          stackIn_1_5 = stackOut_0_5;
          stackIn_1_6 = stackOut_0_6;
          stackIn_1_7 = stackOut_0_7;
          if (-2 == param0.field_m) {
            stackOut_2_0 = (String) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = (w) (Object) stackIn_2_4;
            stackOut_2_5 = (String) (Object) stackIn_2_5;
            stackOut_2_6 = stackIn_2_6;
            stackOut_2_7 = stackIn_2_7;
            stackOut_2_8 = param0.field_k;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            stackIn_3_6 = stackOut_2_6;
            stackIn_3_7 = stackOut_2_7;
            stackIn_3_8 = stackOut_2_8;
            break L0;
          } else {
            stackOut_1_0 = (String) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = (w) (Object) stackIn_1_4;
            stackOut_1_5 = (String) (Object) stackIn_1_5;
            stackOut_1_6 = stackIn_1_6;
            stackOut_1_7 = stackIn_1_7;
            stackOut_1_8 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            stackIn_3_6 = stackOut_1_6;
            stackIn_3_7 = stackOut_1_7;
            stackIn_3_8 = stackOut_1_8;
            break L0;
          }
        }
        sl.a(stackIn_3_0, (int[]) (Object) stackIn_3_1, (byte) stackIn_3_2, (nm) (Object) stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
        if (0 == param0.field_m) {
          if (!ne.b(-18163)) {
            L1: {
              if (cd.field_m != null) {
                break L1;
              } else {
                if (null != g.field_N) {
                  break L1;
                } else {
                  L2: {
                    if (!wl.field_p) {
                      var58 = w.field_H;
                      var59 = wk.field_p;
                      var58.field_h.a(var59, 14, -61);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var60 = w.field_H;
                  var61 = re.field_t;
                  var60.field_h.a(var61, 20, 91);
                  break L1;
                }
              }
            }
            if (-2 == (param0.field_m ^ -1)) {
              if (!ne.b(-18163)) {
                if (null != cd.field_m) {
                  if (param0.field_k == cd.field_m.e(125)) {
                    L3: {
                      if (!wl.field_p) {
                        var63 = w.field_H;
                        var64 = ob.field_l;
                        var63.field_h.a(var64, 14, 121);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var65 = w.field_H;
                    var66 = eb.field_r;
                    var65.field_h.a(var66, 20, -57);
                    w.field_H.b(-92);
                    w.field_H.a(param1, 29072);
                    w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                    w.field_H.a(17);
                    w.field_H.a((byte) -51, param0);
                    var67 = w.field_H;
                    var3 = he.field_S;
                    var4 = nf.field_h;
                    var67.field_h.b(var4, var3, 121, 0, 0);
                    return;
                  } else {
                    w.field_H.b(-92);
                    w.field_H.a(param1, 29072);
                    w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                    w.field_H.a(17);
                    w.field_H.a((byte) -51, param0);
                    var62 = w.field_H;
                    var3 = he.field_S;
                    var4 = nf.field_h;
                    var62.field_h.b(var4, var3, 121, 0, 0);
                    return;
                  }
                } else {
                  w.field_H.b(-92);
                  w.field_H.a(param1, 29072);
                  w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                  w.field_H.a(17);
                  w.field_H.a((byte) -51, param0);
                  var67 = w.field_H;
                  var3 = he.field_S;
                  var4 = nf.field_h;
                  var67.field_h.b(var4, var3, 121, 0, 0);
                  return;
                }
              } else {
                w.field_H.b(-92);
                w.field_H.a(param1, 29072);
                w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                w.field_H.a(17);
                w.field_H.a((byte) -51, param0);
                var67 = w.field_H;
                var3 = he.field_S;
                var4 = nf.field_h;
                var67.field_h.b(var4, var3, 121, 0, 0);
                return;
              }
            } else {
              w.field_H.b(-92);
              w.field_H.a(param1, 29072);
              w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
              w.field_H.a(17);
              w.field_H.a((byte) -51, param0);
              var67 = w.field_H;
              var3 = he.field_S;
              var4 = nf.field_h;
              var67.field_h.b(var4, var3, 121, 0, 0);
              return;
            }
          } else {
            if (-2 == (param0.field_m ^ -1)) {
              if (!ne.b(-18163)) {
                if (null != cd.field_m) {
                  if (param0.field_k != cd.field_m.e(125)) {
                    w.field_H.b(-92);
                    w.field_H.a(param1, 29072);
                    w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                    w.field_H.a(17);
                    w.field_H.a((byte) -51, param0);
                    var52 = w.field_H;
                    var3 = he.field_S;
                    var4 = nf.field_h;
                    var52.field_h.b(var4, var3, 121, 0, 0);
                    return;
                  } else {
                    L4: {
                      if (!wl.field_p) {
                        var53 = w.field_H;
                        var54 = ob.field_l;
                        var53.field_h.a(var54, 14, 121);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var55 = w.field_H;
                    var56 = eb.field_r;
                    var55.field_h.a(var56, 20, -57);
                    w.field_H.b(-92);
                    w.field_H.a(param1, 29072);
                    w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                    w.field_H.a(17);
                    w.field_H.a((byte) -51, param0);
                    var57 = w.field_H;
                    var3 = he.field_S;
                    var4 = nf.field_h;
                    var57.field_h.b(var4, var3, 121, 0, 0);
                    return;
                  }
                } else {
                  w.field_H.b(-92);
                  w.field_H.a(param1, 29072);
                  w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                  w.field_H.a(17);
                  w.field_H.a((byte) -51, param0);
                  var57 = w.field_H;
                  var3 = he.field_S;
                  var4 = nf.field_h;
                  var57.field_h.b(var4, var3, 121, 0, 0);
                  return;
                }
              } else {
                w.field_H.b(-92);
                w.field_H.a(param1, 29072);
                w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                w.field_H.a(17);
                w.field_H.a((byte) -51, param0);
                var57 = w.field_H;
                var3 = he.field_S;
                var4 = nf.field_h;
                var57.field_h.b(var4, var3, 121, 0, 0);
                return;
              }
            } else {
              w.field_H.b(-92);
              w.field_H.a(param1, 29072);
              w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
              w.field_H.a(17);
              w.field_H.a((byte) -51, param0);
              var57 = w.field_H;
              var3 = he.field_S;
              var4 = nf.field_h;
              var57.field_h.b(var4, var3, 121, 0, 0);
              return;
            }
          }
        } else {
          if (-2 == param0.field_m) {
            if (!ne.b(-18163)) {
              if (null != cd.field_m) {
                if (param0.field_k != cd.field_m.e(125)) {
                  w.field_H.b(-92);
                  w.field_H.a(param1, 29072);
                  w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                  w.field_H.a(17);
                  w.field_H.a((byte) -51, param0);
                  var46 = w.field_H;
                  var3 = he.field_S;
                  var4 = nf.field_h;
                  var46.field_h.b(var4, var3, 121, 0, 0);
                  return;
                } else {
                  L5: {
                    if (!wl.field_p) {
                      var47 = w.field_H;
                      var48 = ob.field_l;
                      var47.field_h.a(var48, 14, 121);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var49 = w.field_H;
                  var50 = eb.field_r;
                  var49.field_h.a(var50, 20, -57);
                  w.field_H.b(-92);
                  w.field_H.a(param1, 29072);
                  w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                  w.field_H.a(17);
                  w.field_H.a((byte) -51, param0);
                  var51 = w.field_H;
                  var3 = he.field_S;
                  var4 = nf.field_h;
                  var51.field_h.b(var4, var3, 121, 0, 0);
                  return;
                }
              } else {
                w.field_H.b(-92);
                w.field_H.a(param1, 29072);
                w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
                w.field_H.a(17);
                w.field_H.a((byte) -51, param0);
                var51 = w.field_H;
                var3 = he.field_S;
                var4 = nf.field_h;
                var51.field_h.b(var4, var3, 121, 0, 0);
                return;
              }
            } else {
              w.field_H.b(-92);
              w.field_H.a(param1, 29072);
              w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
              w.field_H.a(17);
              w.field_H.a((byte) -51, param0);
              var30 = w.field_H;
              var3 = he.field_S;
              var4 = nf.field_h;
              var30.field_h.b(var4, var3, 121, 0, 0);
              return;
            }
          } else {
            w.field_H.b(-92);
            w.field_H.a(param1, 29072);
            w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
            w.field_H.a(17);
            w.field_H.a((byte) -51, param0);
            var14 = w.field_H;
            var3 = he.field_S;
            var4 = nf.field_h;
            var14.field_h.b(var4, var3, 121, 0, 0);
            return;
          }
        }
    }

    final void a(String param0, byte param1, ji param2, String param3) {
        this.a((String) null, 2, param3, param0, -1, param2);
        int var5 = 73 / ((6 - param1) / 37);
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = client.field_A ? 1 : 0;
        if (param1 != null) {
          if (param2 == 4564) {
            L0: {
              var3 = param1.length();
              if (-2 < (var3 ^ -1)) {
                break L0;
              } else {
                if ((var3 ^ -1) < -13) {
                  break L0;
                } else {
                  L1: {
                    var10 = kf.a(param1, (byte) 2);
                    if (var10 == null) {
                      break L1;
                    } else {
                      if ((var10.length() ^ -1) > -2) {
                        break L1;
                      } else {
                        L2: {
                          if (ug.a(var10.charAt(0), 32)) {
                            break L2;
                          } else {
                            if (ug.a(var10.charAt(var10.length() + -1), 32)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param1.length() <= var6) {
                                  if (-1 < var5) {
                                    return false;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!ug.a((char) var7, 32)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (-3 < var5) {
                                    var6++;
                                    var6++;
                                    continue L3;
                                  } else {
                                    if (!param0) {
                                      return false;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        return false;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            field_c = 77;
            var3 = param1.length();
            if (-2 >= (var3 ^ -1)) {
              if ((var3 ^ -1) >= -13) {
                L5: {
                  var9 = kf.a(param1, (byte) 2);
                  if (var9 == null) {
                    break L5;
                  } else {
                    if ((var9.length() ^ -1) > -2) {
                      break L5;
                    } else {
                      L6: {
                        if (ug.a(var9.charAt(0), 32)) {
                          break L6;
                        } else {
                          if (ug.a(var9.charAt(var9.length() + -1), 32)) {
                            break L6;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L7: while (true) {
                              if (param1.length() <= var6) {
                                if (-1 < var5) {
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                L8: {
                                  var7 = param1.charAt(var6);
                                  if (!ug.a((char) var7, 32)) {
                                    var5 = 0;
                                    break L8;
                                  } else {
                                    var5++;
                                    break L8;
                                  }
                                }
                                if (-3 < var5) {
                                  var6++;
                                  var6++;
                                  continue L7;
                                } else {
                                  if (!param0) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    cb(int param0) {
        ((cb) this).field_f = new pb[16];
        ((cb) this).field_b = param0;
    }

    final static void b(byte param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = client.field_A ? 1 : 0;
          if ((gi.field_c ^ -1) > -1) {
            bf.field_o = bf.field_o - (gi.field_c >> 33324641);
            break L0;
          } else {
            bf.field_o = bf.field_o + (-gi.field_c >> 467911937);
            break L0;
          }
        }
        gi.field_c = gi.field_c + bf.field_o;
        if (0 <= gi.field_c) {
          L1: {
            gi.field_c = gi.field_c + (-gi.field_c >> -1859306780);
            if (0 <= nf.field_e) {
              wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
              break L1;
            } else {
              wg.field_d = wg.field_d - (nf.field_e >> -727063359);
              break L1;
            }
          }
          L2: {
            nf.field_e = nf.field_e + wg.field_d;
            if (nf.field_e < 0) {
              nf.field_e = nf.field_e - (nf.field_e >> 117175588);
              break L2;
            } else {
              nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
              break L2;
            }
          }
          if (param0 == 71) {
            L3: {
              if (nf.field_e > 0) {
                L4: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                nf.field_e = 0;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L5: {
              var3 = null;
              cb.a((hl) null, false);
              if (nf.field_e > 0) {
                L6: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                nf.field_e = 0;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          gi.field_c = gi.field_c - (gi.field_c >> -858222876);
          if (0 <= nf.field_e) {
            wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
            nf.field_e = nf.field_e + wg.field_d;
            if (nf.field_e < 0) {
              nf.field_e = nf.field_e - (nf.field_e >> 117175588);
              if (param0 != 71) {
                L7: {
                  var3 = null;
                  cb.a((hl) null, false);
                  if (nf.field_e > 0) {
                    L8: {
                      if (wg.field_d > 0) {
                        wg.field_d = -wg.field_d;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    nf.field_e = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              } else {
                L9: {
                  if (nf.field_e > 0) {
                    L10: {
                      if (wg.field_d > 0) {
                        wg.field_d = -wg.field_d;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    nf.field_e = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            } else {
              nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
              if (param0 != 71) {
                L11: {
                  var3 = null;
                  cb.a((hl) null, false);
                  if (nf.field_e > 0) {
                    L12: {
                      if (wg.field_d > 0) {
                        wg.field_d = -wg.field_d;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    nf.field_e = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return;
              } else {
                L13: {
                  if (nf.field_e > 0) {
                    L14: {
                      if (wg.field_d > 0) {
                        wg.field_d = -wg.field_d;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    nf.field_e = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            }
          } else {
            L15: {
              wg.field_d = wg.field_d - (nf.field_e >> -727063359);
              nf.field_e = nf.field_e + wg.field_d;
              if (nf.field_e < 0) {
                nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                break L15;
              } else {
                nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                break L15;
              }
            }
            if (param0 == 71) {
              L16: {
                if (nf.field_e > 0) {
                  L17: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  nf.field_e = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            } else {
              L18: {
                var3 = null;
                cb.a((hl) null, false);
                if (nf.field_e > 0) {
                  L19: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  nf.field_e = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              return;
            }
          }
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2 = 96 % ((3 - param0) / 35);
        return s.a(true, 4, 10, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Breaking real-world laws";
        field_k = "Game full";
        field_h = "Name";
        field_i = "OH NO!";
    }
}
