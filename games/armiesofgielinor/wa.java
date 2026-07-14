/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ik {
    static String field_h;
    static String field_e;
    int field_f;
    int field_g;

    private final void a(int param0, ha param1) {
        jd var5 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
        jd var3 = var5;
        if (param0 != 0) {
            Object var4 = null;
            this.b((byte) 119, (ha) null);
        }
        var5.field_P = uc.field_d[((wa) this).field_c][5];
        var5.field_o = uc.field_d[((wa) this).field_c][6];
    }

    final void a(int param0, vh param1) {
        param1.b(true, ((wa) this).field_c);
        param1.b(1, ((wa) this).field_g);
        param1.b(1, ((wa) this).field_f);
        if (param0 != -11637) {
            field_e = null;
        }
    }

    private final void d(byte param0, ha param1) {
        int var4 = 0;
        jd var5 = null;
        jd var6 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -100) {
            break L0;
          } else {
            ((wa) this).field_f = 58;
            break L0;
          }
        }
        L1: {
          var5 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
          var6 = var5;
          if (-8 == uc.field_d[((wa) this).field_c][6]) {
            var5.field_I = true;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (uc.field_d[((wa) this).field_c][6] != 16) {
            break L2;
          } else {
            if (-1 < var6.field_cb) {
              var6.field_cb = var6.field_cb - 1;
              break L2;
            } else {
              L3: {
                L4: {
                  if (34 != var6.field_N) {
                    break L4;
                  } else {
                    if (var6.field_W) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var6.field_s = false;
                break L3;
              }
              if (74 != var6.field_N) {
                var6.field_B = 1;
                break L2;
              } else {
                var6.field_B = 2;
                break L2;
              }
            }
          }
        }
    }

    private final void a(boolean param0, ha param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            var5 = null;
            this.a((ha) null, false);
            break L0;
          }
        }
        L1: {
          var3 = uc.field_d[((wa) this).field_c][5];
          if (var3 != 0) {
            if (var3 != 64) {
              this.b(true, param1);
              break L1;
            } else {
              this.c((byte) 78, param1);
              break L1;
            }
          } else {
            this.d((byte) -106, param1);
            break L1;
          }
        }
    }

    private final void b(int param0, ha param1) {
        if (param0 <= 80) {
            Object var4 = null;
            ((wa) this).a((ha) null, 28);
        }
        jd var5 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
        jd var3 = var5;
        var5.field_r = uc.field_d[((wa) this).field_c][6] | uc.field_d[((wa) this).field_c][5] << -379528731;
    }

    private final void c(byte param0, ha param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 78) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        var3 = uc.field_d[((wa) this).field_c][7];
        var4 = ((wa) this).field_g + -var3;
        L1: while (true) {
          if (var4 > var3 + ((wa) this).field_g) {
            return;
          } else {
            var5 = -var3 + ((wa) this).field_f;
            L2: while (true) {
              if (((wa) this).field_f + var3 < var5) {
                var4++;
                continue L1;
              } else {
                var6 = param1.c(var5, true, var4);
                if (var6 != null) {
                  var7 = 0;
                  L3: while (true) {
                    if (uc.field_d[((wa) this).field_c][6] <= var7) {
                      var7 = 0;
                      L4: while (true) {
                        if (uc.field_d[((wa) this).field_c][6] < var7) {
                          param1.field_l.a(750, (tc) (Object) new st(var6, 4));
                          var7--;
                          continue L4;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      param1.field_l.a(750, (tc) (Object) new st(var6, 6));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void b(boolean param0, ha param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = uc.field_d[((wa) this).field_c][7];
          if (param0) {
            break L0;
          } else {
            ((wa) this).field_g = -123;
            break L0;
          }
        }
        var4 = ((wa) this).field_g - var3;
        L1: while (true) {
          if (var3 + ((wa) this).field_g < var4) {
            return;
          } else {
            var5 = ((wa) this).field_f + -var3;
            L2: while (true) {
              if (var3 + ((wa) this).field_f < var5) {
                var4++;
                continue L1;
              } else {
                var6 = param1.c(var5, true, var4);
                if (var6 != null) {
                  if ((uc.field_d[((wa) this).field_c][6] ^ -1) < -1) {
                    param1.field_l.a(750, (tc) (Object) new nw(var6, param1.a(var6, (byte) -128, uc.field_d[((wa) this).field_c][5], uc.field_d[((wa) this).field_c][6]), false));
                    var5++;
                    continue L2;
                  } else {
                    var7 = 0;
                    L3: while (true) {
                      if (var7 > uc.field_d[((wa) this).field_c][6]) {
                        param1.field_l.a(750, (tc) (Object) new st(var6, 1));
                        var7--;
                        continue L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, ok param1) {
        bd.a((byte) 111, new fj(param1));
        if (param0 < 8) {
            field_h = null;
        }
    }

    private final void a(byte param0, int param1, ha param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var7_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (uc.field_d[((wa) this).field_c][5] == 5) {
            var4 = uc.field_d[((wa) this).field_c][7];
            var5 = ((wa) this).field_g - var4;
            L1: while (true) {
              if (var4 + ((wa) this).field_g < var5) {
                break L0;
              } else {
                if (-1 >= (var5 ^ -1)) {
                  if (param2.field_v > var5) {
                    var6 = -var4 + ((wa) this).field_f;
                    L2: while (true) {
                      if (var6 <= ((wa) this).field_f + var4) {
                        if ((var6 ^ -1) <= -1) {
                          if (var6 < param2.field_db) {
                            var7_ref_ne = param2.field_Eb[var5 + param2.field_v * var6];
                            var7_ref_ne.b(true, param2.o(param1, -1));
                            var6++;
                            continue L2;
                          } else {
                            var5++;
                            continue L1;
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (uc.field_d[((wa) this).field_c][5] == 6) {
            var4 = uc.field_d[((wa) this).field_c][7];
            var5 = ((wa) this).field_g - var4;
            L4: while (true) {
              if (((wa) this).field_g - -var4 < var5) {
                break L3;
              } else {
                if (0 <= var5) {
                  if (param2.field_v > var5) {
                    var6 = ((wa) this).field_f - var4;
                    L5: while (true) {
                      if (((wa) this).field_f + var4 >= var6) {
                        if (var6 >= 0) {
                          if (param2.field_db > var6) {
                            param2.a((byte) 86, param1, var6, var5);
                            var6++;
                            continue L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var5++;
                  continue L4;
                }
              }
            }
          } else {
            if (uc.field_d[((wa) this).field_c][5] == 3) {
              var4 = uc.field_d[((wa) this).field_c][7];
              var5 = -var4 + ((wa) this).field_g;
              L6: while (true) {
                if (var4 + ((wa) this).field_g < var5) {
                  break L3;
                } else {
                  var6 = ((wa) this).field_f + -var4;
                  L7: while (true) {
                    if (var4 + ((wa) this).field_f < var6) {
                      var5++;
                      continue L6;
                    } else {
                      param2.b(var5, true, uc.field_d[((wa) this).field_c][6], param1, var6);
                      var6++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
        }
        L8: {
          if (uc.field_d[((wa) this).field_c][5] != 4) {
            break L8;
          } else {
            L9: {
              var4 = param2.a(((wa) this).field_f, 2056, ((wa) this).field_g);
              var5 = param2.g(((wa) this).field_f, -85, ((wa) this).field_g);
              var6 = ((wa) this).field_g;
              var7 = ((wa) this).field_f;
              var8 = 0;
              var9 = 0;
              var10 = var4;
              if (1 != var10) {
                if (2 == var10) {
                  var8 = 0;
                  var9 = 1;
                  break L9;
                } else {
                  if (var10 == 3) {
                    var9 = 0;
                    var8 = -1;
                    break L9;
                  } else {
                    if (var10 == 0) {
                      var9 = 0;
                      var8 = 1;
                      break L9;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var9 = -1;
                var8 = 0;
                break L9;
              }
            }
            L10: while (true) {
              if (param2.g(var7, -85, var6) != var5) {
                param2.b(var6, true, 1, param1, var7);
                param2.b(((wa) this).field_g + -var8, true, 1, param1, ((wa) this).field_f - var9);
                break L8;
              } else {
                param2.b(var6, true, 10, param1, var7);
                var7 = var7 + var9;
                var6 = var6 + var8;
                continue L10;
              }
            }
          }
        }
        if (param0 == -100) {
          L11: {
            if (uc.field_d[((wa) this).field_c][5] != 7) {
              break L11;
            } else {
              param2.field_Eb[((wa) this).field_f * param2.field_v + ((wa) this).field_g].field_a = -1;
              param2.f(-2);
              param2.b(param0 ^ -98);
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int a(bv param0, int param1, int param2) {
        if (param2 != 1) {
            Object var4 = null;
            int discarded$0 = wa.a((bv) null, 11, -12);
        }
        return (param0.g(param2 + -102, param1) ^ 1 << param1 - 1) + -(1 << param1 - 1);
    }

    final void a(int param0, ha param1, int param2) {
        jd var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 != (uc.field_d[((wa) this).field_c][3] ^ -1)) {
            break L0;
          } else {
            var4_ref = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
            if (var4_ref == null) {
              break L0;
            } else {
              var4_ref.field_D = true;
              break L0;
            }
          }
        }
        var4 = uc.field_d[((wa) this).field_c][4];
        if (param2 == 26123) {
          L1: {
            var5 = var4;
            if (-5 != (var5 ^ -1)) {
              if ((var5 ^ -1) != -7) {
                if (var5 != -1) {
                  if (-2 != var5) {
                    if (var5 == -4) {
                      this.b((byte) 51, param1);
                      break L1;
                    } else {
                      if (-3 != var5) {
                        break L1;
                      } else {
                        this.a(param1, true);
                        break L1;
                      }
                    }
                  } else {
                    this.b(95, param1);
                    break L1;
                  }
                } else {
                  this.a(0, param1);
                  break L1;
                }
              } else {
                this.a((byte) -100, param0, param1);
                break L1;
              }
            } else {
              this.a(true, param1);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        if (param1 != 1) {
            Object var4 = null;
            wa.a(-25, (ok) null);
        }
        oj.field_r.a((byte) -119, (tc) (Object) param2);
        wr.a((byte) -57, param2, param0);
    }

    private final void b(byte param0, ha param1) {
        jd var4 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
        jd var3 = var4;
        if (param0 != 51) {
            field_h = null;
        }
        if (!(var3 == null)) {
            var4.field_ab = uc.field_d[((wa) this).field_c][5];
        }
    }

    final void a(byte param0, ha param1) {
        if (param0 != -37) {
            ((wa) this).field_g = 12;
        }
    }

    private final void a(ha param0, boolean param1) {
        jd var4 = null;
        jd var5 = null;
        L0: {
          L1: {
            L2: {
              var4 = param0.c(((wa) this).field_f, param1, ((wa) this).field_g);
              var5 = var4;
              if (115 != ((wa) this).field_c) {
                break L2;
              } else {
                if (-64 == var5.field_N) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (119 != ((wa) this).field_c) {
                break L3;
              } else {
                if (43 == var5.field_N) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (-119 != ((wa) this).field_c) {
                break L4;
              } else {
                if (var5.field_N == 59) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-117 != ((wa) this).field_c) {
                break L5;
              } else {
                if (-59 == var5.field_N) {
                  break L1;
                } else {
                  break L5;
                }
              }
            }
            if (((wa) this).field_c != -118) {
              break L0;
            } else {
              if (-54 == var5.field_N) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var5.field_F = true;
          param0.a(((wa) this).field_f, ((wa) this).field_g, 0, 3);
          break L0;
        }
        L6: {
          if (-121 == (((wa) this).field_c ^ -1)) {
            var4.field_C = true;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (19 != uc.field_d[((wa) this).field_c][5]) {
            break L7;
          } else {
            var5.field_bb = true;
            break L7;
          }
        }
        L8: {
          if ((uc.field_d[((wa) this).field_c][5] ^ -1) != -22) {
            break L8;
          } else {
            var4.field_cb = var4.field_cb + uc.field_d[((wa) this).field_c][6];
            var5.field_s = true;
            var5.field_B = 0;
            if (-101 > (var5.field_cb ^ -1)) {
              var5.field_cb = 100;
              break L8;
            } else {
              break L8;
            }
          }
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != 6) {
            field_h = null;
        }
    }

    wa(int param0, int param1, int param2) {
        super(param0);
        ((wa) this).field_f = param2;
        ((wa) this).field_g = param1;
    }

    final void a(ha param0, int param1) {
        if (param1 != -1700635440) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "(<%0> players want to join)";
    }
}
