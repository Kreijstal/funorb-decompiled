/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class km extends gf {
    int field_p;
    int field_q;
    int field_l;
    static n field_k;
    int field_j;
    re field_h;
    q[] field_m;
    static String field_n;
    static String field_o;
    static int field_i;

    void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (-1 <= (im.field_e ^ -1)) {
            pa.a(true);
            break L0;
          } else {
            var2 = (-50 + im.field_e) * 640 / 50;
            if (0 != hc.field_h) {
              ed.a(-640 - var2, 0);
              rp.field_s.d(-var2, 0);
              break L0;
            } else {
              ed.a(640 + var2, 0);
              rp.field_s.d(var2, 0);
              break L0;
            }
          }
        }
        if (param0 < -14) {
          pg.d(0);
          return;
        } else {
          return;
        }
    }

    final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        try {
            this.field_m = new q[param0.length];
            this.field_h = new re(this.field_m.length);
            for (var3_int = param1; param0.length > var3_int; var3_int++) {
                this.field_m[var3_int] = new q(param0[var3_int], (km) (this));
                this.field_m[var3_int].a(-97);
            }
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "km.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    String e(byte param0) {
        int discarded$0 = 0;
        if (param0 <= 53) {
            discarded$0 = this.a(18, (byte) 84, -33);
        }
        return ag.field_D[7];
    }

    int a(boolean param0) {
        if (!param0) {
            field_n = (String) null;
            return 0;
        }
        return 0;
    }

    private final void c(boolean param0, int param1) {
        if (this.field_h.field_j != -1) {
            if (param1 != this.field_h.field_j) {
                j.a(ta.field_e[0], -106, lh.g((byte) -44) / 4);
            }
        }
        if (!param0) {
            this.field_j = -36;
        }
    }

    final void e(int param0) {
        int dupTemp$7 = 0;
        int var2 = 0;
        int var3 = 0;
        q var4_ref_q = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        q var8 = null;
        String stackIn_5_0 = null;
        String stackOut_4_0 = null;
        String stackOut_3_0 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (this.field_m.length <= var3) {
            var3 = (640 - var2) / param0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_m.length) {
                return;
              } else {
                var8 = this.field_m[var4];
                var8.field_c = var3;
                var8.field_a = this.b(var4, param0 ^ 3);
                var8.field_d = this.b((byte) 125, var4);
                var3 = var3 + (var8.field_j + 10);
                var4++;
                continue L1;
              }
            }
          } else {
            L2: {
              var4_ref_q = this.field_m[var3];
              if ((var4_ref_q.field_f ^ -1) == -9) {
                stackOut_4_0 = this.e((byte) 108);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = ag.field_D[var4_ref_q.field_f];
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var7 = stackIn_5_0;
            var5 = var7;
            dupTemp$7 = nn.field_g.c(var7) + 30;
            var4_ref_q.field_j = dupTemp$7;
            var2 = var2 + dupTemp$7;
            if (-1 > (var3 ^ -1)) {
              var2 += 10;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    int a(int param0, int param1) {
        if (param0 >= -71) {
            this.b(true, 87);
        }
        return this.field_l;
    }

    km(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0);
        try {
            this.field_p = param3;
            this.field_l = param2;
            this.field_q = param4;
            if (param5 == null) {
                param5 = new int[]{};
            }
            this.field_j = param1;
            this.a(param5, 0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "km.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void d(int param0) {
        if (param0 > -60) {
            this.a(true, -25, 10);
        }
    }

    boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        if (13 != param2) {
            var4 = this.field_h.field_j;
            this.a(-120, param2, param0);
            this.field_h.d((byte) -124);
            if (this.a(false, (byte) 126)) {
                wp.a(8, ta.field_e[0]);
            }
            this.c(true, var4);
        } else {
            this.c(-1);
        }
        if (param1 <= 98) {
            return true;
        }
        return true;
    }

    int b(int param0, int param1) {
        if (param1 != 1) {
            this.a(true, true, -57);
        }
        return this.field_q * param0 + this.field_p;
    }

    void a(int param0, int param1, char param2) {
        this.field_h.d(param0 + 119);
        if (param0 != -120) {
            this.c(true, 117);
        }
    }

    void a(boolean param0, boolean param1, int param2) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        q[] var4_ref_q__ = null;
        int var4 = 0;
        int var5 = 0;
        q var6 = null;
        int var7 = 0;
        q[] var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        si.field_k.e(1);
        var8 = this.field_m;
        var4_ref_q__ = var8;
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            L1: {
              if (param2 <= -52) {
                break L1;
              } else {
                this.a(true, -79, -10);
                break L1;
              }
            }
            L2: {
              var4 = this.field_h.field_j;
              dm.field_b = sa.a(de.field_x * 20, -4097);
              if (!param1) {
                this.c(true, var4);
                if (lp.field_rb != this) {
                  break L2;
                } else {
                  if (-1 <= (im.field_e ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$4 = im.field_e - 1;
                    im.field_e = im.field_e - 1;
                    if (fieldTemp$4 != 0) {
                      break L2;
                    } else {
                      hc.field_h = 1;
                      c.field_g = 250;
                      break L2;
                    }
                  }
                }
              } else {
                this.c(true, var4);
                if (lp.field_rb != this) {
                  break L2;
                } else {
                  if (-1 <= (im.field_e ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$5 = im.field_e - 1;
                    im.field_e = im.field_e - 1;
                    if (fieldTemp$5 != 0) {
                      break L2;
                    } else {
                      hc.field_h = 1;
                      c.field_g = 250;
                      break L2;
                    }
                  }
                }
              }
            }
            return;
          } else {
            var6 = var8[var5];
            var6.b(-2217);
            var5++;
            continue L0;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        q stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        q stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        q stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        q stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        q stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        q stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (var2 >= this.field_h.field_r) {
            return;
          } else {
            if (this.a((byte) 99, var2)) {
              L1: {
                stackOut_4_0 = this.field_m[var2];
                stackOut_4_1 = 4;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (this.field_h.field_j != var2) {
                  stackOut_6_0 = (q) ((Object) stackIn_6_0);
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (q) ((Object) stackIn_5_0);
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              ((q) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2 != 0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 5 % ((param1 - 69) / 51);
        if (this.field_m.length != 0) {
            if (0 <= this.field_h.field_j) {
                return this.a(this.field_h.field_j, param0, (byte) 123);
            }
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var2 = param0.getParameter("username");
            if (param1 <= -66) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (CharSequence) ((Object) var2);
                  if (0L == ah.a(false, var3)) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("km.HA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    void c(int param0) {
        ng.a(false, 97, this.a(true));
        if (param0 != -1) {
            field_n = (String) null;
        }
    }

    boolean a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        q var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        boolean stackIn_46_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        boolean stackIn_48_0 = false;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_143_0 = 0;
        int stackIn_165_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        boolean stackOut_45_0 = false;
        int stackOut_45_1 = 0;
        boolean stackOut_47_0 = false;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        boolean stackOut_46_0 = false;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param2 == 123) {
          L0: {
            var4 = 0;
            var5 = this.field_m[param0];
            var6 = var5.field_f;
            var8 = var6;
            if (0 != var8) {
              L1: {
                if (-39 == (var8 ^ -1)) {
                  break L1;
                } else {
                  if (var8 == 27) {
                    break L1;
                  } else {
                    if (var8 == 37) {
                      if (!this.field_h.a((byte) 113)) {
                        break L0;
                      } else {
                        be.field_a = true;
                        cq.a(16727, param1, 0, new oi(na.field_L[0]));
                        break L0;
                      }
                    } else {
                      if ((var8 ^ -1) == -2) {
                        if (this.field_h.a((byte) 113)) {
                          if (og.h(-26090)) {
                            sl.field_z = -2;
                            dk.a(sb.field_b, true, 0, param1, 46);
                            break L0;
                          } else {
                            cb.b(true);
                            break L0;
                          }
                        } else {
                          break L0;
                        }
                      } else {
                        if (var8 != 2) {
                          if (-8 != (var8 ^ -1)) {
                            if ((var8 ^ -1) == -25) {
                              if (!this.field_h.a((byte) 113)) {
                                break L0;
                              } else {
                                eb.field_l = true;
                                ng.a(param1, param2 ^ 61, 0);
                                break L0;
                              }
                            } else {
                              if ((var8 ^ -1) == -23) {
                                if (!this.field_h.a((byte) 113)) {
                                  break L0;
                                } else {
                                  ng.a(param1, 67, 8);
                                  break L0;
                                }
                              } else {
                                if (-6 != (var8 ^ -1)) {
                                  if (-9 != (var8 ^ -1)) {
                                    if (-5 != (var8 ^ -1)) {
                                      if (-4 == (var8 ^ -1)) {
                                        if (this.field_h.a((byte) 113)) {
                                          ng.a(param1, 86, 5);
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      } else {
                                        if (-21 == (var8 ^ -1)) {
                                          L2: {
                                            var7 = 0;
                                            if (!this.field_h.b(-103)) {
                                              break L2;
                                            } else {
                                              if (-1 > (lh.g((byte) -44) ^ -1)) {
                                                ma.a((byte) -113, 0);
                                                var7 = 1;
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                          L3: {
                                            if (!this.field_h.a(-1)) {
                                              break L3;
                                            } else {
                                              if (lh.g((byte) -44) >= re.e((byte) 44)) {
                                                break L3;
                                              } else {
                                                ma.a((byte) 47, re.e((byte) 31));
                                                var7 = 1;
                                                break L3;
                                              }
                                            }
                                          }
                                          L4: {
                                            if (!this.field_h.g((byte) -57)) {
                                              break L4;
                                            } else {
                                              if (-1 > (lh.g((byte) -44) ^ -1)) {
                                                k.d((byte) 116);
                                                var7 = 1;
                                                break L4;
                                              } else {
                                                break L4;
                                              }
                                            }
                                          }
                                          L5: {
                                            if (!this.field_h.c(-98)) {
                                              break L5;
                                            } else {
                                              if (lh.g((byte) -44) >= re.e((byte) 90)) {
                                                break L5;
                                              } else {
                                                var7 = 1;
                                                th.a((byte) -63);
                                                break L5;
                                              }
                                            }
                                          }
                                          L6: {
                                            if (!this.field_h.a(false)) {
                                              break L6;
                                            } else {
                                              L7: {
                                                var8 = -120 + var5.field_j - -var5.field_c + var5.field_c + dg.field_d >> -106141215;
                                                var9 = pq.field_k - var8;
                                                var10 = var9 * re.e((byte) 51) / 120;
                                                if ((var10 ^ -1) >= -1) {
                                                  ma.a((byte) -114, 0);
                                                  break L7;
                                                } else {
                                                  if (var10 < re.e((byte) 81)) {
                                                    ma.a((byte) -127, var10);
                                                    break L7;
                                                  } else {
                                                    ma.a((byte) 95, re.e((byte) 32));
                                                    break L7;
                                                  }
                                                }
                                              }
                                              var7 = 1;
                                              break L6;
                                            }
                                          }
                                          if (var7 == 0) {
                                            break L0;
                                          } else {
                                            L8: {
                                              if (!this.field_h.a(false)) {
                                                break L8;
                                              } else {
                                                if (de.field_x > ea.field_d) {
                                                  break L8;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            }
                                            wp.a(8, ta.field_e[1]);
                                            ea.field_d = de.field_x + 20;
                                            break L0;
                                          }
                                        } else {
                                          if (var8 != 21) {
                                            if ((var8 ^ -1) == -7) {
                                              if (this.field_h.a((byte) 113)) {
                                                var4 = 1;
                                                if (null == ua.field_d) {
                                                  cp.a(param1, 21543);
                                                  break L0;
                                                } else {
                                                  nc.b(82);
                                                  break L0;
                                                }
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              if (-10 != (var8 ^ -1)) {
                                                if ((var8 ^ -1) == -12) {
                                                  if (!this.field_h.a((byte) 113)) {
                                                    break L0;
                                                  } else {
                                                    pe.field_o.b(29);
                                                    ng.a(param1, 73, -1);
                                                    break L0;
                                                  }
                                                } else {
                                                  if ((var8 ^ -1) != -13) {
                                                    if (13 == var8) {
                                                      if (!this.field_h.a((byte) 113)) {
                                                        break L0;
                                                      } else {
                                                        da.f((byte) 122);
                                                        break L0;
                                                      }
                                                    } else {
                                                      if (-24 == (var8 ^ -1)) {
                                                        if (!this.field_h.a((byte) 113)) {
                                                          break L0;
                                                        } else {
                                                          if (this.field_a == 10) {
                                                            var12 = (String) null;
                                                            he.a((String) null, true, (byte) 123);
                                                            if (!ib.a(pl.field_b, -1)) {
                                                              L9: {
                                                                if (null != fj.field_Ub) {
                                                                  stackOut_142_0 = 5;
                                                                  stackIn_143_0 = stackOut_142_0;
                                                                  break L9;
                                                                } else {
                                                                  stackOut_141_0 = 0;
                                                                  stackIn_143_0 = stackOut_141_0;
                                                                  break L9;
                                                                }
                                                              }
                                                              sl.field_z = stackIn_143_0;
                                                              break L0;
                                                            } else {
                                                              sl.field_z = 9;
                                                              break L0;
                                                            }
                                                          } else {
                                                            he.a(mq.field_a, true, (byte) 126);
                                                            sl.field_z = 2147483647;
                                                            break L0;
                                                          }
                                                        }
                                                      } else {
                                                        if (19 != var8) {
                                                          if (-33 == (var8 ^ -1)) {
                                                            if (this.field_h.a((byte) 113)) {
                                                              ng.a(param1, 62, 14);
                                                              break L0;
                                                            } else {
                                                              break L0;
                                                            }
                                                          } else {
                                                            if (var8 == 33) {
                                                              if (this.field_h.a((byte) 113)) {
                                                                cq.a(16727, param1, pe.field_o.field_r, pe.field_o.field_w.field_b);
                                                                break L0;
                                                              } else {
                                                                break L0;
                                                              }
                                                            } else {
                                                              if ((var8 ^ -1) != -35) {
                                                                if (-36 != (var8 ^ -1)) {
                                                                  if (36 != var8) {
                                                                    if (42 == var8) {
                                                                      if (!this.field_h.a((byte) 113)) {
                                                                        break L0;
                                                                      } else {
                                                                        var4 = 1;
                                                                        ng.a(param1, 110, 12);
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    if (!this.field_h.a((byte) 113)) {
                                                                      break L0;
                                                                    } else {
                                                                      L10: {
                                                                        if (be.field_a) {
                                                                          stackOut_164_0 = 0;
                                                                          stackIn_165_0 = stackOut_164_0;
                                                                          break L10;
                                                                        } else {
                                                                          stackOut_163_0 = 1;
                                                                          stackIn_165_0 = stackOut_163_0;
                                                                          break L10;
                                                                        }
                                                                      }
                                                                      L11: {
                                                                        be.field_a = stackIn_165_0 != 0;
                                                                        r.field_A = stackIn_165_0 != 0;
                                                                        if (!r.field_A) {
                                                                          break L11;
                                                                        } else {
                                                                          if (pe.field_o == null) {
                                                                            break L11;
                                                                          } else {
                                                                            hd.a(true);
                                                                            break L11;
                                                                          }
                                                                        }
                                                                      }
                                                                      var4 = 1;
                                                                      break L0;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (this.field_h.a((byte) 113)) {
                                                                    pe.field_o.a(param1, (byte) 69);
                                                                    cc.field_G = true;
                                                                    break L0;
                                                                  } else {
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                if (this.field_h.a((byte) 113)) {
                                                                  L12: {
                                                                    var8 = 13;
                                                                    if (gq.field_Yb != 1) {
                                                                      break L12;
                                                                    } else {
                                                                      var8 = 15;
                                                                      break L12;
                                                                    }
                                                                  }
                                                                  ng.a(param1, param2 ^ 25, var8);
                                                                  cc.field_G = true;
                                                                  break L0;
                                                                } else {
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (this.field_h.a((byte) 113)) {
                                                            var4 = 1;
                                                            nk.a(2048, uc.e((byte) -66));
                                                            break L0;
                                                          } else {
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (this.field_h.a((byte) 113)) {
                                                      pe.field_o.f(69);
                                                      break L0;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!this.field_h.a((byte) 113)) {
                                                  break L0;
                                                } else {
                                                  pe.field_o.a((byte) 40, param1);
                                                  cc.field_G = true;
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            L13: {
                                              if (!this.field_h.b(param2 ^ -30)) {
                                                break L13;
                                              } else {
                                                il.a((byte) 86, 0);
                                                break L13;
                                              }
                                            }
                                            L14: {
                                              if (this.field_h.a(-1)) {
                                                il.a((byte) 86, 256);
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              if (!this.field_h.g((byte) -57)) {
                                                break L15;
                                              } else {
                                                lf.f(-1);
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              if (!this.field_h.c(param2 ^ -27)) {
                                                break L16;
                                              } else {
                                                nf.a((byte) 109);
                                                break L16;
                                              }
                                            }
                                            if (!this.field_h.a(false)) {
                                              break L0;
                                            } else {
                                              var8 = -120 + (dg.field_d + (var5.field_c + var5.field_j) + var5.field_c) >> -1472647007;
                                              var9 = -var8 + pq.field_k;
                                              var10 = 256 * var9 / 120;
                                              if ((var10 ^ -1) >= -1) {
                                                il.a((byte) 86, 0);
                                                break L0;
                                              } else {
                                                if (var10 >= 256) {
                                                  il.a((byte) 86, 256);
                                                  break L0;
                                                } else {
                                                  il.a((byte) 86, var10);
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_h.a((byte) 113)) {
                                        ng.a(param1, 71, 6);
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  } else {
                                    if (this.field_h.a((byte) 113)) {
                                      ng.a(param1, param2 ^ 28, this.a(true));
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  }
                                } else {
                                  if (!this.field_h.a((byte) 113)) {
                                    break L0;
                                  } else {
                                    ng.a(param1, 126, 7);
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_h.a((byte) 113)) {
                              ng.a(param1, 74, 0);
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        } else {
                          if (this.field_h.a((byte) 113)) {
                            ng.a(param1, 69, -1);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (this.field_h.a((byte) 113)) {
                qj.b((byte) -126, param1);
                break L0;
              } else {
                break L0;
              }
            } else {
              if (!this.field_h.a((byte) 113)) {
                break L0;
              } else {
                L17: {
                  stackOut_45_0 = param1;
                  stackOut_45_1 = param2 + -44;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  if (pg.c(72)) {
                    stackOut_47_0 = stackIn_47_0;
                    stackOut_47_1 = stackIn_47_1;
                    stackOut_47_2 = 13;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    break L17;
                  } else {
                    stackOut_46_0 = stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = 16;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_48_2 = stackOut_46_2;
                    break L17;
                  }
                }
                ng.a(stackIn_48_0, stackIn_48_1, stackIn_48_2);
                break L0;
              }
            }
          }
          return var4 != 0;
        } else {
          return true;
        }
    }

    final static void a(ak param0, j param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7_int = param3;
            var8 = param2;
            if (param4) {
              var9 = 0;
              var10 = 0;
              var11 = 0;
              L1: while (true) {
                if ((var11 ^ -1) <= -30) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (-1 != (1 << var11 & param1.field_S ^ -1)) {
                      oc.a(var8, var11, var7_int, param1, param0, (byte) 115);
                      var7_int += 25;
                      var9++;
                      if (var9 == param5) {
                        var10++;
                        if (var10 == param6) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var9 = 0;
                          var8 += 25;
                          var7_int = param3;
                          break L2;
                        }
                      } else {
                        var11++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var7);
            stackOut_15_1 = new StringBuilder().append("km.EA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    boolean a(byte param0, int param1) {
        if (param0 <= 80) {
            return false;
        }
        return true;
    }

    void b(boolean param0) {
        String discarded$0 = null;
        int var2 = 0;
        q var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
            discarded$0 = this.e((byte) -7);
        }
        for (var2 = 0; var2 < this.field_m.length; var2++) {
            var3 = this.field_m[var2];
            var3.field_c = this.a(true, var2);
            var3.field_a = this.b(var2, 1);
            var3.field_j = this.a(-109, var2) - this.a(param0, var2);
            this.field_m[var2].field_d = this.b((byte) -78, var2);
        }
    }

    int a(boolean param0, int param1) {
        if (!param0) {
            this.a(109, -54, 'ￃ');
        }
        return this.field_j;
    }

    final static void a(int param0, int param1, long param2, String param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ep.field_k = param0;
              bo.field_l = true;
              wd.field_z = param4;
              gn.field_E = param2;
              ba.field_z = param3;
              if (param1 == 29295) {
                break L1;
              } else {
                km.b(48);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("km.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_n = null;
        if (param0 >= -57) {
            j var2 = (j) null;
            km.a((ak) null, (j) null, 113, 61, false, -53, 18);
        }
        field_k = null;
    }

    void a(boolean param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param2 <= 96) {
            discarded$0 = this.a('F', -76, -96);
        }
        this.field_h.a(this.a(po.field_a, (byte) -106, pq.field_k), param1, param0, (byte) -127);
    }

    void d(byte param0) {
        int discarded$0 = 0;
        if (param0 != 79) {
            discarded$0 = this.b(-57, -105);
        }
    }

    int b(byte param0, int param1) {
        int var3 = 11 % ((param0 - 66) / 45);
        return 30;
    }

    final void b(boolean param0, int param1) {
        int var4 = 0;
        q var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        q[] var7 = this.field_m;
        q[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            var5.field_h = false;
        }
        this.field_m[param1].field_h = param0 ? true : false;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        q var5 = null;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var4 = 0;
          if (param1 < -77) {
            break L0;
          } else {
            this.field_h = (re) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= this.field_m.length) {
            return -1;
          } else {
            var5 = this.field_m[var4];
            if (this.a((byte) 122, var4)) {
              if (var5.a(param2, param0, -79)) {
                return var4;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    static {
        field_k = new n();
        field_o = "Names should contain a maximum of 12 characters";
        field_n = "Your request to join has been declined.";
    }
}
