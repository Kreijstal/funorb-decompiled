/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    private bf[] field_l;
    private int field_c;
    private int field_e;
    private int field_d;
    static String field_i;
    static boolean field_f;
    private int field_k;
    static String field_j;
    private int field_a;
    private int field_h;
    private dd field_m;
    private int field_g;
    static fm field_n;
    private int field_o;
    private int field_b;

    final static void a(int param0, sb param1, int param2, int param3) {
        we.field_n = param3;
        he.field_a = param1;
        gh.field_t = param0;
        if (param2 != 16) {
            Object var5 = null;
            pb.a(-25, (sb) null, 81, -121);
        }
    }

    final void a(int param0) {
        if (param0 != -18577) {
          boolean discarded$2 = ((pb) this).a((byte) -44);
          ((pb) this).field_e = this.b((byte) -37);
          return;
        } else {
          ((pb) this).field_e = this.b((byte) -37);
          return;
        }
    }

    final static void a(int param0, tf[] param1) {
        Object var3 = null;
        wg.field_g = param1;
        if (null == wg.field_g) {
          if (param0 != -25960) {
            var3 = null;
            pb.a(-62, (sb) null, 98, 74);
            return;
          } else {
            return;
          }
        } else {
          if (-4 >= (param1.length ^ -1)) {
            if (param0 == -25960) {
              return;
            } else {
              var3 = null;
              pb.a(-62, (sb) null, 98, 74);
              return;
            }
          } else {
            throw new IllegalArgumentException("");
          }
        }
    }

    final static void b(int param0) {
        if (0 + -ub.field_a != ga.field_f) {
          if (ga.field_f == 250 - ub.field_a) {
            if (param0 <= 122) {
              return;
            } else {
              ga.field_f = ga.field_f + 1;
              return;
            }
          } else {
            if (param0 <= 122) {
              return;
            } else {
              ga.field_f = ga.field_f + 1;
              return;
            }
          }
        } else {
          if (param0 <= 122) {
            return;
          } else {
            ga.field_f = ga.field_f + 1;
            return;
          }
        }
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          pb.a(-41, (sb) null, 24, 65);
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -37 % ((param0 - -10) / 55);
        return 0 == ((pb) this).field_c ? true : false;
    }

    private final int b(byte param0) {
        int var2 = 0;
        if (param0 != -37) {
            ((pb) this).field_m = null;
            var2 = ((pb) this).field_m.field_d;
            if (!(((pb) this).field_m.field_d < ((pb) this).field_m.field_l.length)) {
                return ((pb) this).field_o - (100 * var2 + 100);
            }
            return ((pb) this).field_o - var2 * 100;
        }
        var2 = ((pb) this).field_m.field_d;
        if (!(((pb) this).field_m.field_d < ((pb) this).field_m.field_l.length)) {
            return ((pb) this).field_o - (100 * var2 + 100);
        }
        return ((pb) this).field_o - var2 * 100;
    }

    private final int a(boolean param0, int param1) {
        if (!(param1 <= ((pb) this).field_o)) {
            param1 = 2 * ((pb) this).field_o - param1;
        }
        int var3 = 512 * (param1 + -((pb) this).field_o - -100) / 100;
        if (param0) {
            Object var4 = null;
            pb.a(31, (tf[]) null);
            if (!((var3 ^ -1) >= -257)) {
                return 256;
            }
            return var3;
        }
        if (!((var3 ^ -1) >= -257)) {
            return 256;
        }
        return var3;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          var2 = jc.field_d ? 1 : 0;
          t.a(uf.field_b);
          if (var2 == 0) {
            t.f(0, -100 + ((pb) this).field_o, 640, ((pb) this).field_o + 100);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var7 = 0;
          if (((pb) this).field_m.field_l.length <= var7) {
            break L1;
          } else {
            L2: {
              var8 = var7;
              if (-1 >= (var8 ^ -1)) {
                break L2;
              } else {
                var8 = var8 + ((pb) this).field_l.length;
                break L2;
              }
            }
            L3: {
              if (var8 >= ((pb) this).field_l.length) {
                var8 = var8 - ((pb) this).field_l.length;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  var9 = -(gb.field_b.field_A >> 943241985) + ((pb) this).field_k;
                  var10 = ((pb) this).field_e + 100 * var7 + -50;
                  if (var2 != 0) {
                    L7: {
                      var3 = this.a(false, var10);
                      var4 = this.a(false, 100 + var10);
                      if ((var3 ^ -1) < -1) {
                        fi.a(gb.field_b, var9, var10, var3 >> -2056448063, var4 >> -1955486271);
                        var5 = this.a(false, var10 - -((pb) this).field_a);
                        var6 = this.a(false, ((pb) this).field_g + (var10 - -((pb) this).field_a));
                        ((pb) this).field_l[var8].a(0, ((pb) this).field_h + var9, var6, ((pb) this).field_a + var10, var5);
                        break L7;
                      } else {
                        if (var4 <= 0) {
                          break L7;
                        } else {
                          L8: {
                            fi.a(gb.field_b, var9, var10, var3 >> -2056448063, var4 >> -1955486271);
                            var5 = this.a(false, var10 - -((pb) this).field_a);
                            var6 = this.a(false, ((pb) this).field_g + (var10 - -((pb) this).field_a));
                            ((pb) this).field_l[var8].a(0, ((pb) this).field_h + var9, var6, ((pb) this).field_a + var10, var5);
                            if (var7 != 0) {
                              break L8;
                            } else {
                              if ((var3 ^ -1) < -1) {
                                wh.field_q.a(var9, var10 + -wh.field_q.field_B, var3 >> -59332575);
                                break L8;
                              } else {
                                L9: {
                                  L10: {
                                    if (((pb) this).field_l.length - 1 != var7) {
                                      var7++;
                                      break L10;
                                    } else {
                                      if ((var4 ^ -1) >= -1) {
                                        break L10;
                                      } else {
                                        of.field_h.a(var9, 100 + var10, var4 >> -2134246751);
                                        break L9;
                                      }
                                    }
                                  }
                                  var7++;
                                  break L9;
                                }
                                var7++;
                                var7++;
                                if (param0 > 43) {
                                  t.b(uf.field_b);
                                  return;
                                } else {
                                  ((pb) this).field_h = -119;
                                  t.b(uf.field_b);
                                  return;
                                }
                              }
                            }
                          }
                          L11: {
                            L12: {
                              if (((pb) this).field_l.length - 1 != var7) {
                                var7++;
                                break L12;
                              } else {
                                if ((var4 ^ -1) >= -1) {
                                  break L12;
                                } else {
                                  of.field_h.a(var9, 100 + var10, var4 >> -2134246751);
                                  break L11;
                                }
                              }
                            }
                            var7++;
                            break L11;
                          }
                          var7++;
                          var7++;
                          if (param0 > 43) {
                            t.b(uf.field_b);
                            return;
                          } else {
                            ((pb) this).field_h = -119;
                            t.b(uf.field_b);
                            return;
                          }
                        }
                      }
                    }
                    L13: {
                      if (var7 != 0) {
                        break L13;
                      } else {
                        if ((var3 ^ -1) < -1) {
                          wh.field_q.a(var9, var10 + -wh.field_q.field_B, var3 >> -59332575);
                          break L13;
                        } else {
                          L14: {
                            L15: {
                              if (((pb) this).field_l.length - 1 != var7) {
                                var7++;
                                break L15;
                              } else {
                                if ((var4 ^ -1) >= -1) {
                                  break L15;
                                } else {
                                  of.field_h.a(var9, 100 + var10, var4 >> -2134246751);
                                  break L14;
                                }
                              }
                            }
                            var7++;
                            break L14;
                          }
                          var7++;
                          var7++;
                          if (param0 > 43) {
                            t.b(uf.field_b);
                            return;
                          } else {
                            ((pb) this).field_h = -119;
                            t.b(uf.field_b);
                            return;
                          }
                        }
                      }
                    }
                    if (((pb) this).field_l.length - 1 != var7) {
                      break L6;
                    } else {
                      if ((var4 ^ -1) >= -1) {
                        break L5;
                      } else {
                        of.field_h.a(var9, 100 + var10, var4 >> -2134246751);
                        break L4;
                      }
                    }
                  } else {
                    gb.field_b.a(var9, var10, 128);
                    ((pb) this).field_l[var8].b(((pb) this).field_h + var9, var10 - -((pb) this).field_a, (byte) -106);
                    if (0 != var7) {
                      L16: {
                        if (((pb) this).field_l.length - 1 != var7) {
                          var7++;
                          break L16;
                        } else {
                          of.field_h.a(var9, var10 - -100, 128);
                          break L16;
                        }
                      }
                      var7++;
                      break L6;
                    } else {
                      L17: {
                        wh.field_q.a(var9, var10 - wh.field_q.field_B, 128);
                        if (((pb) this).field_l.length - 1 != var7) {
                          var7++;
                          break L17;
                        } else {
                          of.field_h.a(var9, var10 - -100, 128);
                          break L17;
                        }
                      }
                      var7++;
                      var7++;
                      var7++;
                      var7++;
                      var7++;
                      if (param0 > 43) {
                        t.b(uf.field_b);
                        return;
                      } else {
                        ((pb) this).field_h = -119;
                        t.b(uf.field_b);
                        return;
                      }
                    }
                  }
                }
                var7++;
                break L5;
              }
              var7++;
              break L4;
            }
            var7++;
            var7++;
            break L1;
          }
        }
        if (param0 > 43) {
          t.b(uf.field_b);
          return;
        } else {
          ((pb) this).field_h = -119;
          t.b(uf.field_b);
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        if (param0 == -16888) {
          var2 = this.b((byte) -37);
          if (((pb) this).field_c <= 0) {
            L0: {
              if (((pb) this).field_e > var2) {
                ((pb) this).field_c = 30;
                ((pb) this).field_b = -var2 + ((pb) this).field_e;
                break L0;
              } else {
                break L0;
              }
            }
            if (var2 > ((pb) this).field_e) {
              ((pb) this).field_e = 100;
              ((pb) this).field_b = 100;
              ((pb) this).field_c = 30;
              return;
            } else {
              return;
            }
          } else {
            ((pb) this).field_c = ((pb) this).field_c - 1;
            ((pb) this).field_e = ((pb) this).field_b * ((pb) this).field_c * ((pb) this).field_c / 900 + var2;
            return;
          }
        } else {
          pb.c(-121);
          var2 = this.b((byte) -37);
          if (((pb) this).field_c <= 0) {
            L1: {
              if (((pb) this).field_e > var2) {
                ((pb) this).field_c = 30;
                ((pb) this).field_b = -var2 + ((pb) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            if (var2 <= ((pb) this).field_e) {
              return;
            } else {
              ((pb) this).field_e = 100;
              ((pb) this).field_b = 100;
              ((pb) this).field_c = 30;
              return;
            }
          } else {
            ((pb) this).field_c = ((pb) this).field_c - 1;
            ((pb) this).field_e = ((pb) this).field_b * ((pb) this).field_c * ((pb) this).field_c / 900 + var2;
            return;
          }
        }
    }

    pb(dd param0, int param1, int param2) {
        int var5 = 0;
        ((pb) this).field_o = param2;
        ((pb) this).field_m = param0;
        hh[] var7 = ((pb) this).field_m.field_l;
        hh[] var4 = var7;
        ((pb) this).field_g = var7[0].field_d * 16;
        ((pb) this).field_d = 16 * var7[0].field_g;
        ((pb) this).field_a = -((pb) this).field_g + gb.field_b.field_B >> 143715777;
        ((pb) this).field_h = gb.field_b.field_A - ((pb) this).field_d >> -26984671;
        ((pb) this).field_l = new bf[var7.length];
        for (var5 = 0; var7.length > var5; var5++) {
            ((pb) this).field_l[var5] = new bf(var7[var5]);
        }
        ((pb) this).field_e = 200 + ((pb) this).field_o;
        ((pb) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Passwords must be between 5 and 20 letters and numbers";
    }
}
