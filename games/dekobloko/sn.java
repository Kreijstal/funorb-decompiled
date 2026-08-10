/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    private int field_i;
    private int field_f;
    private int field_d;
    private boolean field_h;
    ck[] field_a;
    static vj field_e;
    ck field_b;
    private int field_c;
    static boolean field_g;
    static cn field_k;
    private int field_j;

    final sn c(int param0, int param1) {
        if (param0 != -1) {
            this.field_c = 9;
        }
        this.field_i = param1;
        return (sn) (this);
    }

    final void a(sn param0, int param1) {
        try {
            param0.field_b = this.field_b;
            if (param1 != 1) {
                sn var4 = (sn) null;
                this.a((sn) null, -53);
            }
            param0.field_a = this.field_a;
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_f = this.field_f;
            param0.field_j = this.field_j;
            param0.field_d = this.field_d;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "sn.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, ce param1, int param2, bc param3, int param4) {
        mm stackIn_18_0 = null;
        String stackIn_18_1 = null;
        mm stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        ck[] var8 = null;
        try {
          L0: {
            L1: {
              vk.a(param1.field_y, (byte) 50, this.field_a, param1.field_t, param4 + param1.field_D, param2 + param1.field_u);
              if (param0 == -2) {
                break L1;
              } else {
                var8 = (ck[]) null;
                this.a(-28, (ck[]) null);
                break L1;
              }
            }
            L2: {
              if (null == this.field_b) {
                break L2;
              } else {
                L3: {
                  var6_int = this.field_i + param1.field_u + param2;
                  var7 = param4 + (param1.field_D + this.field_j);
                  if (param3.field_f != 1) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_b.field_K + param1.field_t) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (1 != param3.field_o) {
                    break L4;
                  } else {
                    var7 = var7 + (-this.field_b.field_C + param1.field_y) / 2;
                    break L4;
                  }
                }
                L5: {
                  if ((param3.field_f ^ -1) != -3) {
                    break L5;
                  } else {
                    var6_int = var6_int + (param1.field_t + -this.field_b.field_K);
                    break L5;
                  }
                }
                L6: {
                  if (-3 == (param3.field_o ^ -1)) {
                    var7 = var7 + (-this.field_b.field_C + param1.field_y);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_b.c(var6_int, var7);
                break L2;
              }
            }
            L7: {
              var6 = param3.b(param1, (byte) -116);
              if (var6 == null) {
                break L7;
              } else {
                if (param3.field_z == null) {
                  break L7;
                } else {
                  if ((this.field_f ^ -1) > -1) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_18_0 = param3.field_z;

                      stackIn_18_1 = (String) (var6);

                      if (2147483647 == (this.field_i ^ -1)) {
                        stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L8;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = this.field_i;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_21_2 = stackIn_19_2 + (param1.field_u + param2) - -param3.field_s;

                      if (this.field_j == -2147483648) {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = 0;
                        break L9;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = this.field_j;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_24_3 = stackIn_22_3 + (param3.field_m + (param1.field_D + param4));

                      stackIn_24_4 = param1.field_t + -param3.field_s + -param3.field_i;

                      stackIn_24_5 = -param3.field_m + (param1.field_y + -param3.field_y);

                      stackIn_24_6 = this.field_f;

                      stackIn_24_7 = this.field_d;

                      if (this.field_c != -2147483648) {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = this.field_c;
                        break L10;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = 256;
                        break L10;
                      }
                    }
                    ((mm) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_f, param3.field_o, param3.field_b);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6_ref);

            stackIn_29_1 = new StringBuilder().append("sn.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param4 + ')');
        }
    }

    final sn a(int param0, int param1) {
        this.field_j = param0;
        if (param1 != -2147483648) {
            field_e = (vj) null;
        }
        return (sn) (this);
    }

    final static void a(long param0, int param1, String param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        try {
            we.field_b.f(param1, -4);
            we.field_b.field_n = we.field_b.field_n + 1;
            if (param3 <= 34) {
                field_e = (vj) null;
            }
            var7_int = we.field_b.field_n;
            we.field_b.a(param0, (byte) 0);
            we.field_b.a(0, param2);
            we.field_b.a(true, param5);
            we.field_b.a(true, param4 ? 1 : 0);
            we.field_b.b(-var7_int + we.field_b.field_n, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "sn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        ta.field_k.field_j = 0;
        ta.field_k.field_o = 0;
        int var1 = -59 % ((-49 - param0) / 38);
    }

    final sn b(int param0, int param1) {
        this.field_d = param1;
        if (param0 >= -76) {
            return (sn) null;
        }
        return (sn) (this);
    }

    final void b(byte param0) {
        this.field_f = 0;
        this.field_c = 256;
        this.field_b = null;
        if (param0 <= 66) {
            return;
        }
        this.field_d = -1;
        this.field_i = 0;
        this.field_a = null;
        this.field_j = 0;
    }

    final static int a(String param0, boolean param1, String param2, byte param3, int param4, boolean param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_107_0 = 0;
            int stackIn_110_0 = 0;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            String stackIn_114_2 = null;
            StringBuilder stackIn_116_1 = null;
            StringBuilder stackIn_117_1 = null;
            String stackIn_117_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            var9 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (qc.field_s == null) {
                    if (mb.a(param5, param3 + -129)) {
                      break L1;
                    } else {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ba.field_f != ph.field_xb) {
                    break L2;
                  } else {
                    L3: {
                      if (param5) {
                        var10 = (String) null;
                        wb.field_Nb = sb.a(sh.field_f, param2, false, (String) null, 0);
                        break L3;
                      } else {
                        wb.field_Nb = hm.a(false, param2, param0, 9507);
                        break L3;
                      }
                    }
                    we.field_b.field_n = 0;
                    we.field_b.a(true, 14);
                    we.field_b.a(true, wb.field_Nb.a(param3 ^ 37).field_a);
                    wj.c(4792, -1);
                    ph.field_xb = wf.field_p;
                    break L2;
                  }
                }
                L4: {
                  if (ph.field_xb == wf.field_p) {
                    if (pe.b(25973, 1)) {
                      L5: {
                        var6_int = de.field_V.d((byte) -85);
                        if (var6_int != 0) {
                          bh.field_k = var6_int;
                          ph.field_xb = bh.field_l;
                          sm.field_e = -1;
                          break L5;
                        } else {
                          ph.field_xb = kk.field_p;
                          break L5;
                        }
                      }
                      de.field_V.field_n = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (param3 == 55) {
                  L6: {
                    if (kk.field_p == ph.field_xb) {
                      if (pe.b(25973, 8)) {
                        lc.field_j = de.field_V.f((byte) -108);
                        de.field_V.field_n = 0;
                        jm.a(param5, wb.field_Nb, param4, (byte) 127, param1);
                        ph.field_xb = nn.field_c;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (ph.field_xb == nn.field_c) {
                      if (pe.b(25973, 1)) {
                        L8: {
                          var6_int = de.field_V.d((byte) -46);
                          vh.field_f = null;
                          bh.field_k = var6_int;
                          de.field_V.field_n = 0;
                          if (var6_int == 0) {
                            break L8;
                          } else {
                            if (-2 != (var6_int ^ -1)) {
                              if (8 == var6_int) {
                                si.a(param3 + 22);
                                jd.field_Qb = false;
                                stackIn_38_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                sm.field_e = -1;
                                ph.field_xb = bh.field_l;
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        sm.field_e = -1;
                        ph.field_xb = of.field_a;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if (ph.field_xb != of.field_a) {
                      break L9;
                    } else {
                      if (!fh.a((byte) -62)) {
                        break L9;
                      } else {
                        L10: {
                          sh.field_f = de.field_V.f((byte) -108);
                          jk.field_a = param2;
                          te.field_p = de.field_V.d((byte) -76);
                          d.field_b = de.field_V.d((byte) -113);
                          eh.field_a = de.field_V.e(3);
                          var6 = de.field_V.c(-16829);
                          var7 = de.field_V.d((byte) -93);
                          if (-1 != (var7 & 1 ^ -1)) {
                            qj.a((byte) 64);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (param5) {
                            break L11;
                          } else {
                            L12: {
                              if (0 == (8 & var7)) {
                                stackIn_48_0 = 0;
                                break L12;
                              } else {
                                stackIn_48_0 = 1;
                                break L12;
                              }
                            }
                            L13: {
                              wc.field_n = stackIn_48_0 != 0;
                              if ((4 & var7) == 0) {
                                stackIn_51_0 = 0;
                                break L13;
                              } else {
                                stackIn_51_0 = 1;
                                break L13;
                              }
                            }
                            L14: {
                              on.field_d = stackIn_51_0 != 0;
                              if ((var7 & 2) == 0) {
                                stackIn_54_0 = 0;
                                break L14;
                              } else {
                                stackIn_54_0 = 1;
                                break L14;
                              }
                            }
                            wl.field_p = stackIn_54_0 != 0;
                            if (!wc.field_n) {
                              break L11;
                            } else {
                              wl.field_p = true;
                              break L11;
                            }
                          }
                        }
                        L15: {
                          if (0 == (16 & var7)) {
                            stackIn_59_0 = 0;
                            break L15;
                          } else {
                            stackIn_59_0 = 1;
                            break L15;
                          }
                        }
                        L16: {
                          gf.field_i = stackIn_59_0 != 0;
                          if (ci.field_c) {
                            de.field_V.d((byte) -25);
                            de.field_V.d((byte) -71);
                            de.field_V.i(param3 ^ 7606);
                            uj.field_a = de.field_V.e(3);
                            ai.field_N = new byte[uj.field_a];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= uj.field_a) {
                                break L16;
                              } else {
                                ai.field_N[var8] = de.field_V.g((byte) -99);
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                        L18: {
                          oa.field_f = de.field_V.c((byte) -38);
                          var11 = (CharSequence) ((Object) oa.field_f);
                          h.field_c = kf.a(var11, (byte) 2);
                          bb.field_e = de.field_V.d((byte) -49);
                          ph.field_xb = wf.field_u;
                          if (wb.field_Nb.a(18) != pb.field_i) {
                            if (wb.field_Nb.a(18) == ui.field_t) {
                              ge.field_g.a(-117, se.h(25144));
                              break L18;
                            } else {
                              break L18;
                            }
                          } else {
                            ah.field_f.a(-69, se.h(param3 ^ 25103));
                            break L18;
                          }
                        }
                        L19: {
                          jd.field_Qb = false;
                          if (var6 != null) {
                            a.a(var6, false, se.h(25144));
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          L21: {
                            if (eh.field_a > 0) {
                              break L21;
                            } else {
                              if (!on.field_d) {
                                try {
                                  L22: {
                                    nc.a(true, "unzap", se.h(25144));
                                    break L22;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L23: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    break L23;
                                  }
                                }
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          try {
                            L24: {
                              nc.a("zap", -14541, se.h(25144), new Object[]{cf.a(0, sh.field_f)});
                              break L24;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L25: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L25;
                            }
                          }
                          break L20;
                        }
                        L26: {
                          if (-1 <= (eh.field_a ^ -1)) {
                            break L26;
                          } else {
                            ce.field_w = true;
                            break L26;
                          }
                        }
                        we.field_b.a(pd.field_h, (byte) 63);
                        var8 = 0;
                        L27: while (true) {
                          if (-5 >= (var8 ^ -1)) {
                            de.field_V.a(pd.field_h, (byte) 123);
                            stackIn_87_0 = bh.field_k;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            pd.field_h[var8] = pd.field_h[var8] + 50;
                            var8++;
                            continue L27;
                          }
                        }
                      }
                    }
                  }
                  L28: {
                    if (ph.field_xb == bh.field_l) {
                      if (!fh.a((byte) 122)) {
                        break L28;
                      } else {
                        L29: {
                          si.a(119);
                          if ((bh.field_k ^ -1) != -8) {
                            break L29;
                          } else {
                            if (jd.field_Qb) {
                              break L29;
                            } else {
                              jd.field_Qb = true;
                              stackIn_94_0 = -1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        L30: {
                          if ((bh.field_k ^ -1) == -8) {
                            bh.field_k = 3;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        rk.field_Y = de.field_V.c((byte) -38);
                        jd.field_Qb = false;
                        stackIn_99_0 = bh.field_k;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L31: {
                    if (qc.field_s == null) {
                      if (!jd.field_Qb) {
                        var6_int = hc.field_a;
                        hc.field_a = ef.field_P;
                        jd.field_Qb = true;
                        ef.field_P = var6_int;
                        break L31;
                      } else {
                        L32: {
                          if (sl.a(-1) <= 30000L) {
                            rk.field_Y = re.field_u;
                            break L32;
                          } else {
                            rk.field_Y = kh.field_f;
                            break L32;
                          }
                        }
                        jd.field_Qb = false;
                        stackIn_107_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      break L31;
                    }
                  }
                  stackIn_110_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_21_0 = -94;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_113_0 = (RuntimeException) (var6_ref);

                stackIn_113_1 = new StringBuilder().append("sn.G(");

                if (param0 == null) {
                  stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackIn_114_2 = "null";
                  break L33;
                } else {
                  stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackIn_114_2 = "{...}";
                  break L33;
                }
              }
              L34: {


                stackIn_116_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
                  stackIn_117_2 = "null";
                  break L34;
                } else {
                  stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
                  stackIn_117_2 = "{...}";
                  break L34;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_114_0), stackIn_117_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_38_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_87_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_94_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_99_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_107_0;
                        } else {
                          return stackIn_110_0;
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final sn a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 106) {
            return (sn) null;
        }
        return (sn) (this);
    }

    final void a(sn param0, bc param1, int param2, int param3, int param4, ce param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ce var8 = null;
        try {
          L0: {
            L1: {
              if (this.field_h) {
                param0.a(-2, param5, param4, param1, param3);
                param0.b((byte) 76);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2147483648 == this.field_j) {
                break L2;
              } else {
                param0.field_j = this.field_j;
                break L2;
              }
            }
            L3: {
              if (2147483647 == (this.field_i ^ -1)) {
                break L3;
              } else {
                param0.field_i = this.field_i;
                break L3;
              }
            }
            L4: {
              if (param2 > 121) {
                break L4;
              } else {
                var8 = (ce) null;
                this.a((sn) null, (bc) null, 121, -77, -29, (ce) null);
                break L4;
              }
            }
            L5: {
              if (this.field_c == -2147483648) {
                break L5;
              } else {
                param0.field_c = this.field_c;
                break L5;
              }
            }
            L6: {
              if (0 >= (this.field_f ^ -1)) {
                param0.field_f = this.field_f;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 > this.field_d) {
                break L7;
              } else {
                param0.field_d = this.field_d;
                break L7;
              }
            }
            L8: {
              if (this.field_b != null) {
                param0.field_b = this.field_b;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null == this.field_a) {
                break L9;
              } else {
                param0.field_a = this.field_a;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("sn.J(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
    }

    final sn a(int param0, ck[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param1;
            var3_int = -21 % ((45 - param0) / 52);
            stackIn_1_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("sn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return (sn) (this);
    }

    final static void a(boolean param0) {
        if (!(cl.field_v != null)) {
            return;
        }
        tj.a(param0, cl.field_v);
        cl.field_v.a(lf.field_e, 115);
        cl.field_v = null;
        if (!(null == li.field_b)) {
            li.field_b.b((byte) -110);
        }
        jh.field_b.requestFocus();
    }

    sn() {
        this.field_i = -2147483648;
        this.field_d = -2;
        this.field_a = null;
        this.field_h = false;
        this.field_c = -2147483648;
        this.field_b = null;
        this.field_f = -2;
        this.field_j = -2147483648;
    }

    final sn a(int param0, boolean param1) {
        if (param0 != -16598) {
            this.field_h = true;
        }
        this.field_h = param1 ? true : false;
        return (sn) (this);
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = -72 % ((param0 - 30) / 37);
        field_e = null;
    }

    static {
        field_e = new vj();
    }
}
