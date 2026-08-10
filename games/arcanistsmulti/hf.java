/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static kc field_f;
    static String field_m;
    static qb field_o;
    private int field_p;
    private String field_j;
    private int field_n;
    private qb field_k;
    static kc field_q;
    static int field_r;
    private int field_l;
    static String field_b;
    private int field_c;
    private int field_u;
    private boolean field_h;
    static kc field_t;
    private String[] field_a;
    private qb field_e;
    private int field_s;
    private qb field_g;
    private ll[] field_i;
    private so field_d;

    public static void a(boolean param0) {
        if (param0) {
            int[] var2 = (int[]) null;
            hf.a(91, (int[]) null, -18, -89, -119, 34, 118);
        }
        field_m = null;
        field_o = null;
        field_t = null;
        field_b = null;
        field_f = null;
        field_q = null;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            wl.field_L[param3] = param1;
            lm.field_e[param3] = param6;
            eo.field_b[param3] = param5;
            if (param2 != 0) {
                dj var8 = (dj) null;
                hf.a((String[]) null, (String) null, -76, (dj) null, 57);
            }
            tg.field_f[param3] = param4;
            sc.field_U[param3] = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int a(byte param0) {
        if (param0 >= -61) {
            this.field_i = (ll[]) null;
        }
        this.field_d.a((byte) -76);
        if (!(!this.field_d.b(true))) {
            if (!(-1 != (this.field_d.field_h ^ -1))) {
                this.a(127);
                return 3;
            }
            if (this.field_d.field_h == 1) {
                return 1;
            }
        }
        if (vn.field_d == 13) {
            return 1;
        }
        return 0;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = oc.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((var4 ^ -1) != (param0 ^ -1)) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            var2_int = -85 / ((21 - param1) / 39);
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "hf.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final static void c(int param0) {
        wh.field_g = false;
        ld.field_p = -1 == (df.field_z.e((byte) 88) ^ -1) ? true : false;
        if (param0 < 15) {
            hf.a(true);
        }
    }

    private final void a(int param0, int param1, int param2, dj param3, String param4, int param5, int[] param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            ec.a(65280);
            var9_int = param7;
            L1: while (true) {
              if (var9_int >= param0) {
                L2: {
                  oo.c(-15405);
                  if (param5 == 23146) {
                    break L2;
                  } else {
                    this.field_u = 61;
                    break L2;
                  }
                }
                break L0;
              } else {
                de.h(param2, var9_int, param1, 1 + var9_int);
                var10 = var9_int * param6.length / param0;
                var11 = param6[-var10 + param6.length + -1];
                param3.a(param4, param2, param7, param1, param0, var11, -1, 1, 1, 0);
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var9);

            stackIn_9_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param7 + ')');
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        de.c(9, 9, 622, 47, 4540749, 65793);
        de.d(9, 257, 622, 33, 2585);
        de.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            var3 = 299;
            L1: while (true) {
              if (var2 >= 2) {
                L2: {
                  this.c((byte) -101);
                  if (null == an.field_o) {
                    break L2;
                  } else {
                    if (!an.field_o.c(-10923)) {
                      break L2;
                    } else {
                      if (!an.field_o.a("members_expansion_screen", -24417)) {
                        break L2;
                      } else {
                        if (!an.field_o.a("arialish12", -24417)) {
                          break L2;
                        } else {
                          if (!an.field_o.a("pump32", -24417)) {
                            break L2;
                          } else {
                            if (bb.field_a == null) {
                              break L2;
                            } else {
                              if (!bb.field_a.c(-10923)) {
                                break L2;
                              } else {
                                if (!bb.field_a.a("arialish12", -24417)) {
                                  break L2;
                                } else {
                                  if (!bb.field_a.a("pump32", -24417)) {
                                    break L2;
                                  } else {
                                    be.field_j = af.a("frame", "members_expansion_screen", 19412, an.field_o);
                                    cg.field_Ib = fj.a("members_expansion_screen", -22612, an.field_o, "arrow");
                                    li.field_F = rc.a(bb.field_a, -24755, "arialish12", "", an.field_o);
                                    fd.field_b = rm.a("", bb.field_a, "pump32", -119, an.field_o);
                                    fd.field_f = cg.a("benefit_orbs", (byte) 113, an.field_o, "members_expansion_screen");
                                    qf.field_b = cg.a("button_text", (byte) 116, an.field_o, "members_expansion_screen");
                                    ji.field_c = nl.a((byte) 31, an.field_o, "button_highlights", "members_expansion_screen");
                                    an.field_o = null;
                                    bb.field_a = null;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.b(16180917);
                if (null != be.field_j) {
                  L3: {
                    this.field_e.c(376, 339);
                    this.field_k.c(9, 9);
                    be.field_j.a(0, 0);
                    if (cg.field_Ib == null) {
                      break L3;
                    } else {
                      cg.field_Ib.c(9, 257);
                      cg.field_Ib.e(558, 257);
                      if (-258 <= (me.field_I ^ -1)) {
                        break L3;
                      } else {
                        if (290 > me.field_I) {
                          var2 = 40 + (40 * hg.a(this.field_p << 1415725956, -52) >> -544527184);
                          if (-1 > (var2 ^ -1)) {
                            L4: {
                              if (-10 <= (an.field_g ^ -1)) {
                                break L4;
                              } else {
                                if (an.field_g >= 82) {
                                  break L4;
                                } else {
                                  cg.field_Ib.b(8, 256, var2);
                                  cg.field_Ib.b(10, 256, var2);
                                  cg.field_Ib.b(8, 258, var2);
                                  cg.field_Ib.b(10, 258, var2);
                                  break L3;
                                }
                              }
                            }
                            if (an.field_g <= 558) {
                              break L3;
                            } else {
                              if (631 > an.field_g) {
                                cg.field_Ib.d();
                                cg.field_Ib.b(557, 256, var2);
                                cg.field_Ib.b(559, 256, var2);
                                cg.field_Ib.b(557, 258, var2);
                                cg.field_Ib.b(559, 258, var2);
                                cg.field_Ib.d();
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    var2 = 89 % ((-46 - param0) / 43);
                    this.field_g.c(16, 302);
                    li.field_F.a(this.field_a[this.field_l], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    fd.field_f.c(30, 330);
                    li.field_F.a(nf.field_qb[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    li.field_F.a(nf.field_qb[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    li.field_F.a(nf.field_qb[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    qf.field_b.c(508 + (127 - qf.field_b.field_n) / 2, 315);
                    if (0 != this.field_d.field_h) {
                      if ((this.field_d.field_h ^ -1) == -2) {
                        ji.field_c[1].c(508, 387);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      ji.field_c[0].c(508, 299);
                      break L5;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                de.c(508, var3, 127, 42, 1130115, 3365268);
                de.d(508, 42 + var3, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L1;
              }
            }
          } else {
            de.c(var3, 331, 117, 90, 460551, 3881787);
            var2++;
            var3 += 121;
            continue L0;
          }
        }
    }

    final static String a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        ab var5 = null;
        int var6 = 0;
        wa var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = (CharSequence) ((Object) param0);
            if (vn.a(var8, 0)) {
              if ((jb.field_t ^ -1) == -3) {
                var7 = mf.a(-1, param1);
                if (var7 == null) {
                  stackIn_9_0 = tj.a(param3 ^ 10068676, new String[]{param1}, k.field_f);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    var7.a(true);
                    var7.a((byte) 88);
                    pc.field_b = pc.field_b - 1;
                    var5 = he.field_e;
                    var5.b((byte) -50, param2);
                    var5.field_g = var5.field_g + 1;
                    var6 = var5.field_g;
                    var5.f(3, (byte) -99);
                    if (param3 == 10068666) {
                      break L1;
                    } else {
                      field_t = (kc) null;
                      break L1;
                    }
                  }
                  var5.a(param0, 23333);
                  var5.b(-var6 + var5.field_g, (byte) 43);
                  stackIn_13_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = rk.field_L;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = fn.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("hf.N(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (String) ((Object) stackIn_13_0);
            }
          }
        }
    }

    private final void a(int param0) {
        if (param0 != 127) {
            return;
        }
        try {
            ko.a(cd.e(124), (byte) -108);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(ll[] param0, int param1, String param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param3.getParameter("currency");
                if (var7 == null) {
                  break L2;
                } else {
                  if (fi.a((CharSequence) ((Object) var7), 10)) {
                    this.field_u = dc.a((CharSequence) ((Object) var7), 126);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_u = 2;
              break L1;
            }
            L3: {
              this.field_j = param2;
              this.field_d = new so(2);
              this.field_i = param0;
              this.field_a = param5;
              if (param1 < -99) {
                break L3;
              } else {
                this.field_h = false;
                break L3;
              }
            }
            L4: {
              if (null == this.field_i) {
                break L4;
              } else {
                if (3 > this.field_i.length) {
                  break L4;
                } else {
                  v.field_t = param4;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("hf.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var15 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        qb var5 = null;
        String var6 = null;
        String var7 = null;
        if (this.field_k == null) {
            if (!(fd.field_b != null)) {
                return;
            }
            this.field_k = new qb(622, 47);
            fk.a(this.field_k, -23095);
            de.c(0, 0, 622, 47, 4540749, 65793);
            var2 = 16448250;
            var3 = 10068666;
            var15 = kb.a(var3, var2, param0 ^ 16128330);
            this.a(47, 622, 0, fd.field_b, this.field_j, 23146, var15, 0);
            oo.c(-15405);
            this.field_g = new qb(475, 24);
            this.a(this.field_g, 0.75f, 0, 127, 24, var15, -4, fd.field_b, mm.field_r, 475);
            var13 = kb.a(526344, 526344, 65535);
            var11 = var13;
            var9 = var11;
            var5 = new qb(121, 122);
            fk.a(var5, param0 ^ -16170116);
            de.c(0, 0, var5.field_q, var5.field_y / 2, param0, 16306250);
            de.c(0, var5.field_y / 2, var5.field_q, var5.field_y, 16306250, 15568919);
            var6 = vc.field_l;
            var7 = ph.field_b;
            this.a(var5, 0.5f, 0, 127, var5.field_y, var13, -16, fd.field_b, var6, var5.field_q);
            this.a(var5, 0.5f, 0, 127, var5.field_y, var13, 20, fd.field_b, var7, var5.field_q);
            this.a(var5, 0.699999988079071f, 0, 127, var5.field_y / 3, var9, 12 + (var5.field_y / 2 + -fd.field_b.field_C), fd.field_b, gk.field_f[this.field_u], var5.field_q);
            oo.c(-15405);
            this.field_e = new qb(121, 122);
            fk.a(this.field_e, param0 + -16204012);
            var5.a(this.field_e.field_q / 2, this.field_e.field_y / 2, -2048, 4096);
            oo.c(param0 + -16196322);
            return;
        }
    }

    private final void a(qb param0, float param1, int param2, int param3, int param4, int[] param5, int param6, dj param7, String param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        qb var13 = null;
        try {
          L0: {
            var11_int = (int)((float)param9 / param1);
            var12 = (int)((float)param4 / param1);
            if (param3 == 127) {
              var13 = new qb(var11_int, var12);
              fk.a(var13, -23095);
              param0.c((int)((float)(-param2) / param1), (int)((float)(-param6) / param1), (int)((float)param0.field_q / param1), (int)((float)param0.field_y / param1));
              this.a(var12, var11_int, 0, param7, param8, param3 ^ 23061, param5, 0);
              oo.c(param3 + -15532);
              fk.a(param0, -23095);
              var13.d(param2, param6, param9, param4);
              oo.c(param3 ^ -15444);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("hf.O(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        ll var2;
        int var3;
        int var4;
        int var5;
        ll var6;
        ll var7;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != this.field_i) {
          L0: {
            if (param0 == -101) {
              break L0;
            } else {
              this.a(true, false);
              break L0;
            }
          }
          L1: {
            var6 = this.field_i[this.field_l];
            var2 = var6;
            if (var2 != null) {
              var6.a(9, 58);
              break L1;
            } else {
              if (null != li.field_F) {
                li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (vf.field_o > this.field_s) {
              var7 = this.field_i[this.field_n];
              var2 = var7;
              if (var2 != null) {
                var3 = (60 + var7.field_g) * this.field_s / vf.field_o;
                var4 = var3 - 30;
                if (!this.field_h) {
                  td.a(-256 * var4 / 30, (byte) -115, (-var4 + var7.field_g) * 256 / 30, var7, 9, 58);
                  break L2;
                } else {
                  td.a(256 * (-var4 + var7.field_g) / 30, (byte) 70, var4 * -256 / 30, var7, 9, 58);
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (li.field_F != null) {
              li.field_F.a(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_c = this.field_c + 65536;
        if (param1) {
          L0: while (true) {
            if (65536 > gh.a(vf.field_q, (byte) 96, this.field_c)) {
              L1: {
                var3 = -1;
                if (this.field_i == null) {
                  break L1;
                } else {
                  var3 = this.field_i.length;
                  break L1;
                }
              }
              L2: {
                if (-1 == var3) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_s < vf.field_m) {
                      this.field_s = this.field_s + 1;
                      if (this.field_s > vf.field_o) {
                        L4: {
                          if (this.field_i == null) {
                            break L4;
                          } else {
                            if (this.field_i[this.field_l] == null) {
                              break L4;
                            } else {
                              if (this.field_s < vf.field_m) {
                                break L3;
                              } else {
                                if (this.field_i[(this.field_l - -1) % var3] != null) {
                                  break L3;
                                } else {
                                  this.field_s = this.field_s - 1;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        this.field_s = this.field_s - 1;
                        break L3;
                      } else {
                        if (this.field_s < vf.field_m) {
                          break L3;
                        } else {
                          if (this.field_i[(this.field_l - -1) % var3] != null) {
                            break L3;
                          } else {
                            this.field_s = this.field_s - 1;
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (vf.field_m <= this.field_s) {
                      L6: {
                        this.field_n = this.field_l;
                        if (!this.field_h) {
                          this.field_l = this.field_l - 1;
                          if ((this.field_l ^ -1) <= -1) {
                            break L6;
                          } else {
                            this.field_l = this.field_l + var3;
                            break L6;
                          }
                        } else {
                          this.field_l = this.field_l + 1;
                          if (var3 > this.field_l) {
                            break L6;
                          } else {
                            this.field_l = this.field_l - var3;
                            break L6;
                          }
                        }
                      }
                      this.field_s = this.field_s - vf.field_m;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (this.field_s <= vf.field_o) {
                    break L2;
                  } else {
                    this.field_h = true;
                    break L2;
                  }
                }
              }
              L7: {
                if (cg.field_Ib != null) {
                  L8: {
                    var4 = 0;
                    if (re.field_r == 0) {
                      break L8;
                    } else {
                      if (-258 <= (ja.field_s ^ -1)) {
                        break L8;
                      } else {
                        if (290 > ja.field_s) {
                          L9: {
                            if ((pb.field_h ^ -1) >= -10) {
                              break L9;
                            } else {
                              if (82 > pb.field_h) {
                                var4 = 1;
                                this.field_h = false;
                                this.field_s = vf.field_m;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (558 >= pb.field_h) {
                            break L8;
                          } else {
                            if (-632 < (pb.field_h ^ -1)) {
                              this.field_h = true;
                              this.field_s = vf.field_m;
                              var4 = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L7;
                  } else {
                    if (vf.field_o >= this.field_s) {
                      break L7;
                    } else {
                      if (-258 <= (ja.field_s ^ -1)) {
                        break L7;
                      } else {
                        if (-291 < (ja.field_s ^ -1)) {
                          if (an.field_g > 9) {
                            if (82 > an.field_g) {
                              this.field_s = vf.field_o;
                              if (558 >= an.field_g) {
                                break L7;
                              } else {
                                if (an.field_g >= 631) {
                                  break L7;
                                } else {
                                  this.field_s = vf.field_o;
                                  break L7;
                                }
                              }
                            } else {
                              if (558 >= an.field_g) {
                                break L7;
                              } else {
                                if (an.field_g >= 631) {
                                  break L7;
                                } else {
                                  this.field_s = vf.field_o;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            if (558 >= an.field_g) {
                              break L7;
                            } else {
                              if (an.field_g >= 631) {
                                break L7;
                              } else {
                                this.field_s = vf.field_o;
                                break L7;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (!param0) {
                  break L10;
                } else {
                  L11: {
                    this.field_d.a(this.a(an.field_g, 112, me.field_I), this.a(pb.field_h, 76, ja.field_s), -97);
                    var4 = 0;
                    if (!this.field_d.b(true)) {
                      break L11;
                    } else {
                      L12: {
                        if (this.field_d.field_h != 0) {
                          break L12;
                        } else {
                          var4 = 1;
                          break L12;
                        }
                      }
                      if (this.field_d.field_h != 1) {
                        break L11;
                      } else {
                        return 2;
                      }
                    }
                  }
                  L13: {
                    if (!v.field_t) {
                      break L13;
                    } else {
                      L14: while (true) {
                        if (!ib.b(false)) {
                          break L13;
                        } else {
                          var5 = this.a((byte) -73);
                          if (0 == var5) {
                            continue L14;
                          } else {
                            return var5;
                          }
                        }
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L10;
                  } else {
                    this.a(127);
                    return 3;
                  }
                }
              }
              return 0;
            } else {
              this.field_p = this.field_p + 1;
              this.field_c = this.field_c - vf.field_q;
              continue L0;
            }
          }
        } else {
          return -60;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (!(be.field_j != null)) {
            return -1;
        }
        if (param1 <= 72) {
            this.field_j = (String) null;
        }
        if (-509 >= (param0 ^ -1) && 635 > param0 && (param2 ^ -1) <= -300 && 386 > param2) {
            return 0;
        }
        if (-509 >= (param0 ^ -1) && (param0 ^ -1) > -636 && (param2 ^ -1) <= -391 && param2 < 475) {
            return 1;
        }
        return -1;
    }

    final static int a(String[] args, String param1, int param2, dj param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param1);
              if (param4 == 21230) {
                break L1;
              } else {
                field_q = (kc) null;
                break L1;
              }
            }
            L2: {
              if (param2 < var5_int) {
                break L2;
              } else {
                if ((param1.indexOf("<br>") ^ -1) != 0) {
                  break L2;
                } else {
                  args[0] = param1;
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (param2 + var5_int - 1) / param2;
            param2 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L3: while (true) {
              if (var8 <= var9) {
                L4: {
                  if (var7 >= var8) {
                    break L4;
                  } else {
                    incrementValue$0 = var6;
                    var6++;
                    args[incrementValue$0] = param1.substring(var7, var8).trim();
                    break L4;
                  }
                }
                stackIn_24_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param1.substring(var7, 1 + var9).trim();
                  var12 = param3.b(var11);
                  if (param2 <= var12) {
                    var7 = 1 + var9;
                    incrementValue$1 = var6;
                    var6++;
                    args[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  L7: {
                    if (param1.regionMatches(var9 + -3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      args[incrementValue$2] = param1.substring(var7, var9 - 3).trim();
                      var7 = var9 - -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("hf.J(");

            if (args == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_24_0;
        }
    }

    hf(java.applet.Applet param0, String param1, ll[] param2, String[] param3) {
        this.field_p = 0;
        this.field_c = 0;
        this.field_h = true;
        try {
            this.a(param2, -126, param1, param0, true, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_b = "Offering rematch";
    }
}
