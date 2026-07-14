/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private int field_t;
    private int field_o;
    private bd field_e;
    private bd field_h;
    private be field_u;
    private int field_b;
    private String[] field_a;
    private int field_s;
    private boolean field_j;
    private String field_n;
    static int[] field_w;
    private int field_v;
    private int field_f;
    private pg[] field_p;
    static int[] field_y;
    private bd field_i;
    static int[] field_g;
    static String field_x;
    static String field_A;
    static bd field_d;
    static fk field_q;
    static int field_z;
    static String field_k;
    static int[] field_c;
    static String field_m;
    static b field_l;
    static bd field_r;

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        ((e) this).field_s = ((e) this).field_s + 65536;
        L0: while (true) {
          if (ui.a(65535, q.field_d, ((e) this).field_s) < 65536) {
            L1: {
              var3 = param0;
              if (null != ((e) this).field_p) {
                var3 = ((e) this).field_p.length;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 == (var3 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (((e) this).field_f >= q.field_h) {
                    break L3;
                  } else {
                    L4: {
                      ((e) this).field_f = ((e) this).field_f + 1;
                      if (((e) this).field_f <= q.field_k) {
                        break L4;
                      } else {
                        L5: {
                          if (null == ((e) this).field_p) {
                            break L5;
                          } else {
                            if (null != ((e) this).field_p[((e) this).field_b]) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((e) this).field_f = ((e) this).field_f - 1;
                        break L3;
                      }
                    }
                    if (((e) this).field_f < q.field_h) {
                      break L3;
                    } else {
                      if (null == ((e) this).field_p[(1 + ((e) this).field_b) % var3]) {
                        ((e) this).field_f = ((e) this).field_f - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L6: {
                  if (q.field_h <= ((e) this).field_f) {
                    ((e) this).field_o = ((e) this).field_b;
                    ((e) this).field_f = ((e) this).field_f - q.field_h;
                    if (!((e) this).field_j) {
                      ((e) this).field_b = ((e) this).field_b - 1;
                      if (-1 >= (((e) this).field_b ^ -1)) {
                        break L6;
                      } else {
                        ((e) this).field_b = ((e) this).field_b + var3;
                        break L6;
                      }
                    } else {
                      ((e) this).field_b = ((e) this).field_b + 1;
                      if (((e) this).field_b < var3) {
                        break L6;
                      } else {
                        ((e) this).field_b = ((e) this).field_b - var3;
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                if (((e) this).field_f <= q.field_k) {
                  break L2;
                } else {
                  ((e) this).field_j = true;
                  break L2;
                }
              }
            }
            L7: {
              if (jm.field_b != null) {
                L8: {
                  var4 = 0;
                  if (-1 == (pf.field_o ^ -1)) {
                    break L8;
                  } else {
                    if (257 >= rc.field_b) {
                      break L8;
                    } else {
                      if (rc.field_b >= 290) {
                        break L8;
                      } else {
                        L9: {
                          if (ec.field_a <= 9) {
                            break L9;
                          } else {
                            if (82 <= ec.field_a) {
                              break L9;
                            } else {
                              ((e) this).field_f = q.field_h;
                              var4 = 1;
                              ((e) this).field_j = false;
                              break L9;
                            }
                          }
                        }
                        if (558 >= ec.field_a) {
                          break L8;
                        } else {
                          if (ec.field_a < 631) {
                            var4 = 1;
                            ((e) this).field_f = q.field_h;
                            ((e) this).field_j = true;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L7;
                } else {
                  if (q.field_k >= ((e) this).field_f) {
                    break L7;
                  } else {
                    if (-258 <= (rc.field_b ^ -1)) {
                      break L7;
                    } else {
                      if ((rc.field_b ^ -1) <= -291) {
                        break L7;
                      } else {
                        L10: {
                          if (j.field_c <= 9) {
                            break L10;
                          } else {
                            if (j.field_c < 82) {
                              ((e) this).field_f = q.field_k;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if ((j.field_c ^ -1) >= -559) {
                          break L7;
                        } else {
                          if (631 > j.field_c) {
                            ((e) this).field_f = q.field_k;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (param1) {
              L11: {
                ((e) this).field_u.a((byte) -127, this.a(j.field_c, rb.field_m, -1300), this.a(ec.field_a, rc.field_b, -1300));
                var4 = 0;
                if (!((e) this).field_u.b(0)) {
                  break L11;
                } else {
                  L12: {
                    if (0 == ((e) this).field_u.field_f) {
                      var4 = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  if ((((e) this).field_u.field_f ^ -1) == -2) {
                    return 2;
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if (!o.field_e) {
                  break L13;
                } else {
                  L14: while (true) {
                    if (!jn.e((byte) -100)) {
                      break L13;
                    } else {
                      var5 = this.a(true);
                      if (var5 != 0) {
                        return var5;
                      } else {
                        continue L14;
                      }
                    }
                  }
                }
              }
              if (var4 == 0) {
                return 0;
              } else {
                this.b((byte) -36);
                return 3;
              }
            } else {
              return 0;
            }
          } else {
            ((e) this).field_v = ((e) this).field_v + 1;
            ((e) this).field_s = ((e) this).field_s - q.field_d;
            continue L0;
          }
        }
    }

    private final int a(boolean param0) {
        ((e) this).field_u.c(0);
        if (((e) this).field_u.b(0)) {
            if (0 == ((e) this).field_u.field_f) {
                this.b((byte) -36);
                return 3;
            }
            if (((e) this).field_u.field_f == 1) {
                return 1;
            }
        }
        if ((pj.field_e ^ -1) == -14) {
            return 1;
        }
        if (!param0) {
            return -53;
        }
        return 0;
    }

    public static void b(int param0) {
        field_q = null;
        field_g = null;
        field_y = null;
        int var1 = -97 % ((68 - param0) / 55);
        field_x = null;
        field_d = null;
        field_w = null;
        field_A = null;
        field_c = null;
        field_m = null;
        field_k = null;
        field_l = null;
        field_r = null;
    }

    private final void a(int param0, int[] param1, int param2, String param3, int param4, int param5, vm param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = HostileSpawn.field_I ? 1 : 0;
        pf.b(511);
        if (param4 != 1) {
            int discarded$0 = this.a(false);
        }
        for (var9 = param2; var9 < param5; var9++) {
            si.d(param0, var9, param7, var9 + 1);
            var10 = var9 * param1.length / param5;
            var11 = param1[-1 + (param1.length - var10)];
            int discarded$1 = param6.a(param3, param0, param2, param7, param5, var11, -1, 1, 1, 0);
        }
        eh.b(false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = nj.a(param1, true, var4).getFile();
                Object discarded$6 = a.a(param1, new Object[2], "updatelinks", -13730);
                Object discarded$7 = a.a(param1, new Object[2], "updatelinks", param0 ^ -28622);
                Object discarded$8 = a.a(param1, new Object[2], "updatelinks", -13730);
                Object discarded$9 = a.a(param1, new Object[2], "updatelinks", -13730);
                if (param0 == 23148) {
                  break L0;
                } else {
                  field_z = 29;
                  break L0;
                }
              }
              Object discarded$10 = a.a(param1, new Object[2], "updatelinks", -13730);
              Object discarded$11 = a.a(param1, new Object[2], "updatelinks", param0 + -36878);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        pg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pg var6 = null;
        pg var7 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (((e) this).field_p != null) {
          L0: {
            var6 = ((e) this).field_p[((e) this).field_b];
            var2 = var6;
            if (var2 != null) {
              var6.a(9, 58);
              break L0;
            } else {
              if (mn.field_e == null) {
                break L0;
              } else {
                int discarded$2 = mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L0;
              }
            }
          }
          if (param0 == 9) {
            L1: {
              if (q.field_k > ((e) this).field_f) {
                var7 = ((e) this).field_p[((e) this).field_o];
                var2 = var7;
                if (var2 != null) {
                  var3 = ((e) this).field_f * (var7.field_i - -60) / q.field_k;
                  var4 = var3 - 30;
                  if (!((e) this).field_j) {
                    la.a(256 * (-var4 + var7.field_i) / 30, param0 + 108, var7, 9, var4 * -256 / 30, 58);
                    break L1;
                  } else {
                    la.a(var4 * -256 / 30, 126, var2, 9, 256 * (-var4 + var7.field_i) / 30, 58);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L2: {
            if (mn.field_e == null) {
              break L2;
            } else {
              int discarded$3 = mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L2;
            }
          }
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (null == im.field_g) {
            return -1;
        }
        if (param0 <= -509) {
            if (-636 > param0) {
                if ((param1 ^ -1) <= -300) {
                    if (386 > param1) {
                        return 0;
                    }
                }
            }
        }
        if (param2 != -1300) {
            return -46;
        }
        if (param0 <= -509) {
            if (635 > param0) {
                if (-391 <= param1) {
                    if (!((param1 ^ -1) <= -476)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void a(int param0, int param1, int[] param2, vm param3, int param4, String param5, float param6, int param7, bd param8, int param9) {
        int var11 = (int)((float)param9 / param6);
        int var12 = (int)((float)param1 / param6);
        bd var13 = new bd(var11, var12);
        sb.a(var13, param4 + -120);
        param8.a((int)((float)(-param7) / param6), (int)((float)(-param0) / param6), (int)((float)param8.field_z / param6), (int)((float)param8.field_A / param6));
        this.a(param4, param2, 0, param5, 1, var12, param3, var11);
        eh.b(false);
        sb.a(param8, -128);
        var13.c(param7, param0, param9, param1);
        eh.b(false);
    }

    private final void b(byte param0) {
        try {
            if (param0 != -36) {
                Object var3 = null;
                this.a(-82, (int[]) null, -17, (String) null, -50, 44, (vm) null, 100);
            }
            HostileSpawn.a(bn.c(param0 ^ 35), -53);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(pg[] param0, String param1, String[] param2, java.applet.Applet param3, int param4, boolean param5) {
        String var7 = null;
        int var8 = 0;
        L0: {
          L1: {
            var7 = param3.getParameter("currency");
            if (var7 == null) {
              break L1;
            } else {
              if (sf.a((byte) 90, (CharSequence) (Object) var7)) {
                ((e) this).field_t = hi.a(87, (CharSequence) (Object) var7);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((e) this).field_t = 2;
          break L0;
        }
        L2: {
          ((e) this).field_n = param1;
          ((e) this).field_u = new be(2);
          ((e) this).field_p = param0;
          var8 = 22 % ((28 - param4) / 47);
          ((e) this).field_a = param2;
          if (((e) this).field_p == null) {
            break L2;
          } else {
            if (-4 >= (((e) this).field_p.length ^ -1)) {
              o.field_e = param5;
              return;
            } else {
              break L2;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final void a(byte param0, boolean param1) {
        ((e) this).field_s = 0;
        ((e) this).field_b = 0;
        ((e) this).field_f = q.field_k;
        ((e) this).field_v = 0;
        if (param0 > -37) {
            Object var4 = null;
            e.a(103, (java.applet.Applet) null);
        }
        ((e) this).field_u.a(param1, 0, this.a(j.field_c, rb.field_m, -1300), -1);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        bd var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          if (null != ((e) this).field_i) {
            break L0;
          } else {
            if (ra.field_e == null) {
              break L0;
            } else {
              ((e) this).field_i = new bd(622, 47);
              sb.a(((e) this).field_i, -119);
              si.c(0, 0, 622, 47, 4540749, 65793);
              var2 = 16448250;
              var3 = 10068666;
              var13 = wg.a(true, var2, var3);
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var9 = var10;
              this.a(0, var13, 0, ((e) this).field_n, 1, 47, (vm) (Object) ra.field_e, 622);
              eh.b(false);
              ((e) this).field_e = new bd(475, 24);
              this.a(-4, 24, var9, (vm) (Object) ra.field_e, 0, eb.field_f, 0.75f, 0, ((e) this).field_e, 475);
              var8 = wg.a(true, 526344, 526344);
              var5 = new bd(121, 122);
              sb.a(var5, -121);
              si.c(0, 0, var5.field_z, var5.field_A / 2, 16180917, 16306250);
              si.c(0, var5.field_A / 2, var5.field_z, var5.field_A, 16306250, 15568919);
              var6 = ue.field_b;
              var7 = sg.field_m;
              this.a(-16, var5.field_A, var8, (vm) (Object) ra.field_e, 0, var6, 0.5f, param0, var5, var5.field_z);
              this.a(20, var5.field_A, var8, (vm) (Object) ra.field_e, param0 + 0, var7, 0.5f, 0, var5, var5.field_z);
              this.a(var5.field_A / 2 + -ra.field_e.field_y - -12, var5.field_A / 3, var8, (vm) (Object) ra.field_e, 0, lk.field_E[((e) this).field_t], 0.699999988079071f, 0, var5, var5.field_z);
              eh.b(false);
              ((e) this).field_h = new bd(121, 122);
              sb.a(((e) this).field_h, -126);
              var5.b(((e) this).field_h.field_z / 2, ((e) this).field_h.field_A / 2, -2048, 4096);
              eh.b(false);
              return;
            }
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          si.c(9, 9, 622, 47, 4540749, 65793);
          if (param0 == -67) {
            break L0;
          } else {
            ((e) this).a((byte) 85);
            break L0;
          }
        }
        si.c(9, 257, 622, 33, 2585);
        si.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            var3 = 299;
            L2: while (true) {
              if (-3 >= (var2 ^ -1)) {
                L3: {
                  this.c(9);
                  if (null == jk.field_c) {
                    break L3;
                  } else {
                    if (!jk.field_c.a(-15879)) {
                      break L3;
                    } else {
                      if (!jk.field_c.a(-8088, "members_expansion_screen")) {
                        break L3;
                      } else {
                        if (!jk.field_c.a(-8088, "arialish12")) {
                          break L3;
                        } else {
                          if (!jk.field_c.a(-8088, "pump32")) {
                            break L3;
                          } else {
                            if (cl.field_i == null) {
                              break L3;
                            } else {
                              if (!cl.field_i.a(-15879)) {
                                break L3;
                              } else {
                                if (!cl.field_i.a(-8088, "arialish12")) {
                                  break L3;
                                } else {
                                  if (cl.field_i.a(param0 ^ 8149, "pump32")) {
                                    im.field_g = qm.a("members_expansion_screen", param0 + 67, "frame", jk.field_c);
                                    jm.field_b = ci.a("members_expansion_screen", param0 + 181, "arrow", jk.field_c);
                                    mn.field_e = wc.a("arialish12", cl.field_i, 84, jk.field_c, "");
                                    ra.field_e = th.a(jk.field_c, 126, "", cl.field_i, "pump32");
                                    ue.field_j = fg.a("members_expansion_screen", "benefit_orbs", jk.field_c, false);
                                    od.field_D = fg.a("members_expansion_screen", "button_text", jk.field_c, false);
                                    vj.field_h = ei.a(jk.field_c, param0 ^ -49, "members_expansion_screen", "button_highlights");
                                    cl.field_i = null;
                                    jk.field_c = null;
                                    break L3;
                                  } else {
                                    break L3;
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
                this.a(param0 + 67);
                if (im.field_g != null) {
                  L4: {
                    ((e) this).field_h.e(376, 339);
                    ((e) this).field_i.e(9, 9);
                    im.field_g.a(0, 0);
                    if (null != jm.field_b) {
                      jm.field_b.e(9, 257);
                      jm.field_b.d(558, 257);
                      if (rb.field_m <= 257) {
                        break L4;
                      } else {
                        if (rb.field_m < 290) {
                          var2 = 40 + (40 * la.a(((e) this).field_v << 1393050628, false) >> -1872940368);
                          if (-1 > (var2 ^ -1)) {
                            L5: {
                              if (j.field_c <= 9) {
                                break L5;
                              } else {
                                if (82 <= j.field_c) {
                                  break L5;
                                } else {
                                  jm.field_b.c(8, 256, var2);
                                  jm.field_b.c(10, 256, var2);
                                  jm.field_b.c(8, 258, var2);
                                  jm.field_b.c(10, 258, var2);
                                  break L4;
                                }
                              }
                            }
                            if (j.field_c <= 558) {
                              break L4;
                            } else {
                              if (j.field_c < 631) {
                                jm.field_b.g();
                                jm.field_b.c(557, 256, var2);
                                jm.field_b.c(559, 256, var2);
                                jm.field_b.c(557, 258, var2);
                                jm.field_b.c(559, 258, var2);
                                jm.field_b.g();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    ((e) this).field_e.e(16, 302);
                    int discarded$4 = mn.field_e.a(((e) this).field_a[((e) this).field_b], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    ue.field_j.e(30, 330);
                    int discarded$5 = mn.field_e.a(mm.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$6 = mn.field_e.a(mm.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    int discarded$7 = mn.field_e.a(mm.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    od.field_D.e((127 - od.field_D.field_u) / 2 + 508, 315);
                    if (((e) this).field_u.field_f != 0) {
                      if ((((e) this).field_u.field_f ^ -1) == -2) {
                        vj.field_h[1].e(508, 387);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      vj.field_h[0].e(508, 299);
                      break L6;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                si.c(508, var3, 127, 42, 1130115, 3365268);
                si.c(508, var3 - -42, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L2;
              }
            }
          } else {
            si.c(var3, 331, 117, 90, 460551, 3881787);
            var3 += 121;
            var2++;
            continue L1;
          }
        }
    }

    e(java.applet.Applet param0, String param1, pg[] param2, String[] param3) {
        ((e) this).field_j = true;
        ((e) this).field_s = 0;
        ((e) this).field_v = 0;
        this.a(param2, param1, param3, param0, -82, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int[] var0 = null;
        int[] var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        field_w = nf.a(false);
        field_y = nf.a(false);
        field_g = nf.a(false);
        var0_int = 18;
        L0: while (true) {
          if (var0_int >= 42) {
            var45 = field_y;
            var31 = var45;
            var17 = var31;
            var3 = var17;
            var0 = var3;
            var0[0] = ll.a(var45[0], 131072);
            var46 = field_y;
            var32 = var46;
            var18 = var32;
            var4 = var18;
            var0 = var4;
            var0[0] = ll.a(var46[0], 1073741824);
            var47 = field_y;
            var33 = var47;
            var19 = var33;
            var5 = var19;
            var0 = var5;
            var0[1] = ll.a(var47[1], 1);
            var48 = field_g;
            var34 = var48;
            var20 = var34;
            var6 = var20;
            var0 = var6;
            var0[0] = ll.a(var48[0], 262144);
            var49 = field_g;
            var35 = var49;
            var21 = var35;
            var7 = var21;
            var0 = var7;
            var0[0] = ll.a(var49[0], 2097152);
            var50 = field_g;
            var36 = var50;
            var22 = var36;
            var8 = var22;
            var0 = var8;
            var0[0] = ll.a(var50[0], 4194304);
            var51 = field_g;
            var37 = var51;
            var23 = var37;
            var9 = var23;
            var0 = var9;
            var0[0] = ll.a(var51[0], 8388608);
            var52 = field_g;
            var38 = var52;
            var24 = var38;
            var10 = var24;
            var0 = var10;
            var0[0] = ll.a(var52[0], 16777216);
            var53 = field_g;
            var39 = var53;
            var25 = var39;
            var11 = var25;
            var0 = var11;
            var0[0] = ll.a(var53[0], 33554432);
            var54 = field_g;
            var40 = var54;
            var26 = var40;
            var12 = var26;
            var0 = var12;
            var0[0] = ll.a(var54[0], 67108864);
            var55 = field_g;
            var41 = var55;
            var27 = var41;
            var13 = var27;
            var0 = var13;
            var0[0] = ll.a(var55[0], 134217728);
            var56 = field_g;
            var42 = var56;
            var28 = var42;
            var14 = var28;
            var0 = var14;
            var0[0] = ll.a(var56[0], 268435456);
            var57 = field_g;
            var43 = var57;
            var29 = var43;
            var15 = var29;
            var0 = var15;
            var0[0] = ll.a(var57[0], 536870912);
            var58 = field_g;
            var44 = var58;
            var30 = var44;
            var16 = var30;
            var0 = var16;
            var0[0] = ll.a(var58[0], -2147483648);
            field_x = "Create your own free Jagex account";
            field_A = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
            field_z = 0;
            field_q = new fk();
            field_m = "Check the shuttle bays for a way off the station.";
            field_c = new int[]{41, 327, 41};
            field_k = "These reactor detonations are destabilising the level. I'd better not blow up any more.";
            field_l = null;
          } else {
            var1 = field_w;
            var2 = var0_int;
            var1[var2 >> 2025952549] = ll.a(var1[var2 >> 2025952549], 1 << ua.a(var2, 31));
            var0_int++;
            continue L0;
          }
        }
    }
}
