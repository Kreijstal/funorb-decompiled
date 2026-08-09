/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ca {
    private boolean field_hb;
    private String field_lb;
    static bb field_qb;
    static String[] field_nb;
    private hd field_fb;
    static String field_kb;
    private String field_ob;
    private boolean field_gb;
    static volatile int field_mb;
    static String field_pb;
    static int field_jb;
    static String field_ib;

    final static int a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 16752) {
                break L1;
              } else {
                field_nb = (String[]) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              if (var4 <= var5) {
                stackIn_10_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param1 != param0.charAt(var5)) {
                    break L3;
                  } else {
                    var3_int++;
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("tf.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static void n(int param0) {
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_41_0 = null;
        String stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        gk stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gk var9 = null;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jd.field_N;
              var2 = 0;
              if ((re.field_g ^ -1) == -3) {
                var3_long = -aa.field_d + la.a(false);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 17077) {
                break L2;
              } else {
                field_mb = 118;
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (sg.field_f.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = lg.field_a[var3];
                  if (0 > var4) {
                    var5 = b.field_h;
                    break L4;
                  } else {
                    if (wg.field_k.field_f == var4) {
                      var5 = a.field_i;
                      break L4;
                    } else {
                      var5 = pj.field_E;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = sg.field_f[var3];
                  if ((re.field_g ^ -1) != -3) {
                    break L5;
                  } else {
                    if (-2 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (lk.field_i.length < ng.field_d.length) {
                          stackIn_20_0 = ng.field_d.length;
                          break L6;
                        } else {
                          stackIn_20_0 = lk.field_i.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_20_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (6 - -var7 > var3) {
                            L8: {
                              if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                stackIn_26_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                break L8;
                              } else {
                                stackIn_26_0 = "";
                                break L8;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (ga.field_i.length <= wg.field_h.length) {
                          stackIn_30_0 = wg.field_h.length;
                          break L9;
                        } else {
                          stackIn_30_0 = ga.field_i.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_30_0;
                      if (7 + var7 > var3) {
                        break L5;
                      } else {
                        if (var8 + 7 - -var7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (wg.field_h.length <= -7 + (var3 - var7)) {
                              stackIn_35_0 = "";
                              break L10;
                            } else {
                              stackIn_35_0 = wg.field_h[-7 + var3 - var7];
                              break L10;
                            }
                          }
                          var6 = stackIn_35_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_41_0 = (String) (var6);

                  if (var4 < 0) {
                    stackIn_42_0 = (String) ((Object) stackIn_41_0);
                    stackIn_42_1 = 0;
                    break L12;
                  } else {
                    stackIn_42_0 = (String) ((Object) stackIn_41_0);
                    stackIn_42_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = u.a(stackIn_42_0, stackIn_42_1 != 0, true);
                  var8 = -(var7 >> 198130753) + ji.field_f;
                  if (-1 >= (var4 ^ -1)) {
                    L14: {
                      if (wg.field_k.field_f != var4) {
                        stackIn_47_0 = wd.field_c;
                        break L14;
                      } else {
                        stackIn_47_0 = ue.field_a;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_47_0;
                      var1_int = var1_int + ig.field_h;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1_int, 7453);
                        break L15;
                      }
                    }
                    var1_int = var1_int + wa.field_N;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    cj.field_a.c(var6, var8, var1_int + hi.field_g, var5, -1);
                    var1_int = var1_int + (wa.field_N + ig.field_h + ni.field_p);
                    break L16;
                  } else {
                    uj.field_i.c(var6, var8, ha.field_a + var1_int, var5, -1);
                    var1_int = var1_int + s.field_g;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "tf.C(" + param0 + ')');
        }
    }

    tf(k param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_ob = param1;
            if (null != this.field_ob) {
                var3_int = wi.field_e.a(this.field_ob, 260, wi.field_e.field_x);
                this.b(300, 1688990433, var3_int + 150);
            }
            this.field_fb = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_gb = false;
            this.field_hb = false;
            this.field_fb.field_E = true;
            this.b(this.field_fb, (byte) 61);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(byte param0) {
        this.field_hb = true;
        if (param0 != 23) {
          field_nb = (String[]) null;
          this.field_fb.field_E = false;
          return;
        } else {
          this.field_fb.field_E = false;
          return;
        }
    }

    final static void a(gi param0, int param1, gi param2) {
        try {
            if (null != param0.field_b) {
                param0.a(param1 ^ -32364);
            }
            if (param1 != 16709) {
                gi var4 = (gi) null;
                tf.a((gi) null, 103, (gi) null);
            }
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "tf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        L0: {
          super.c(param0, 59, param2);
          wi.field_e.b(this.field_lb, param2 - -(this.field_w >> 1813688929), 103 + param0, 16777215, -1);
          if (this.field_ob != null) {
            wj.g(20 + param2, 120 + (param0 + -7), 260, 8421504);
            wi.field_e.a(this.field_ob, param2 + 20, 8 + (param0 - -120), 260, 100, 16777215, -1, 1, 0, wi.field_e.field_x);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 26) {
          field_nb = (String[]) null;
          return;
        } else {
          return;
        }
    }

    final void a(String param0, boolean param1, int param2, float param3) {
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_gb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (param1 ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (!param1) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((tf) (this)).field_gb = stackIn_7_1 != 0;
                if (this.field_gb) {
                  this.field_fb.a(false, 8405024, 4210752);
                  this.field_fb.field_E = true;
                  break L2;
                } else {
                  this.field_fb.a(false, 2113632, 4210752);
                  if (this.field_hb) {
                    this.field_fb.field_E = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              if (param2 == 6) {
                break L4;
              } else {
                this.a((String) null, false, 76, -0.6110716462135315f);
                break L4;
              }
            }
            this.field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
            this.field_lb = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("tf.H(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(boolean param0) {
        field_ib = null;
        field_pb = null;
        field_kb = null;
        field_nb = null;
        if (param0) {
            field_jb = -111;
            field_qb = null;
            return;
        }
        field_qb = null;
    }

    static {
        field_nb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_qb = new bb();
        field_mb = 0;
        field_ib = "Invalid password.";
    }
}
