/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou extends na {
    static String field_g;
    private boolean field_e;
    private String field_f;

    ou(dh param0) {
        super(param0);
        this.field_e = false;
    }

    final void e(int param0) {
        this.field_f = null;
        if (param0 != -1) {
            ou.a(false, -24, (byte) -79);
        }
    }

    final static void d(byte param0) {
        if (param0 != -112) {
            field_g = (String) null;
        }
        if (!vs.b((byte) 9) && !nt.field_r) {
            if (!(nq.field_g != null)) {
                nq.field_g = ew.a((byte) -92, 4);
            }
            if (!(!nq.field_g.field_o)) {
                kh.field_e = kh.field_e | nq.field_g.field_k;
                wj.field_e = wj.field_e & (nq.field_g.field_k ^ -1);
                nt.field_r = true;
                nq.field_g = null;
            }
        }
        if (null == ah.field_g) {
            ki.b(6);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 107) {
            ou.a(-41, -16);
        }
        pl var2 = as.field_v;
        var2.g(param1, 8);
        var2.b((byte) 116, 1);
        var2.b((byte) 107, 2);
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        an var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = (CharSequence) ((Object) param1);
              var3 = ti.a(false, var5);
              if (param0 == 0) {
                break L1;
              } else {
                ou.c((byte) 14);
                break L1;
              }
            }
            if (var3 == null) {
              L2: {
                if (!param1.equals(this.field_f)) {
                  var4 = im.a((byte) -109, param1);
                  if (var4 != null) {
                    if (var4.field_g == null) {
                      this.field_e = var4.field_b;
                      this.field_f = param1;
                      break L2;
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_e) {
                stackIn_16_0 = au.field_e;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return ck.field_b;
              }
            } else {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ou.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final gf a(byte param0, String param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        gf stackIn_3_0 = null;
        gf stackIn_11_0 = null;
        gf stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!gr.a(var4, (byte) 53)) {
              stackIn_3_0 = qr.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 26) {
                  break L1;
                } else {
                  this.e(-22);
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_f)) {
                  break L2;
                } else {
                  L3: {
                    var3 = im.a((byte) -71, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_g == null) {
                        this.field_e = var3.field_b;
                        this.field_f = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = kt.field_a;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (!this.field_e) {
                  stackIn_16_0 = qr.field_e;
                  break L4;
                } else {
                  stackIn_16_0 = qe.field_a;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ou.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    public static void c(byte param0) {
        int var1 = 119 % ((-43 - param0) / 63);
        field_g = null;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        String stackIn_49_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        int stackIn_91_0 = 0;
        String stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              sr.field_d = true;
              cl.field_s = param1;
              if (0 == cl.field_s) {
                var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ms.field_c);
                var4 = 3 - -var3_int;
                bf.field_c = new String[var4];
                eb.field_a = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    jo.field_b = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_int) {
                        bf.field_c[-3 + var4] = "";
                        bf.field_c[-2 + var4] = pp.field_f;
                        eb.field_a[-2 + var4] = 0;
                        jo.field_b[0] = 4;
                        bf.field_c[-1 + var4] = jh.field_I;
                        eb.field_a[-1 + var4] = 1;
                        jo.field_b[1] = 5;
                        break L1;
                      } else {
                        bf.field_c[var5] = mb.field_c[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    eb.field_a[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (cl.field_s != 1) {
                  if (-3 != (cl.field_s ^ -1)) {
                    if (-4 == (cl.field_s ^ -1)) {
                      L4: {
                        if (!lt.field_m.field_f) {
                          var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, fr.field_lb);
                          break L4;
                        } else {
                          var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ni.field_f);
                          break L4;
                        }
                      }
                      var4 = var3_int + 2;
                      eb.field_a = new int[var4];
                      bf.field_c = new String[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var4 <= var5) {
                          jo.field_b = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var3_int <= var5) {
                              bf.field_c[-2 + var4] = "";
                              bf.field_c[-1 + var4] = jh.field_I;
                              eb.field_a[-1 + var4] = 0;
                              jo.field_b[0] = 5;
                              break L1;
                            } else {
                              bf.field_c[var5] = mb.field_c[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          eb.field_a[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if (4 != cl.field_s) {
                        if (cl.field_s != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ua.field_i);
                          var4 = 3 - -var3_int;
                          eb.field_a = new int[var4];
                          bf.field_c = new String[var4];
                          var5 = 0;
                          L7: while (true) {
                            if (var4 <= var5) {
                              jo.field_b = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var5 >= var3_int) {
                                  bf.field_c[-3 + var4] = "";
                                  bf.field_c[var4 - 2] = kq.field_Q;
                                  eb.field_a[-2 + var4] = 0;
                                  jo.field_b[0] = 3;
                                  bf.field_c[var4 + -1] = jh.field_I;
                                  eb.field_a[var4 - 1] = 1;
                                  jo.field_b[1] = 5;
                                  break L1;
                                } else {
                                  bf.field_c[var5] = mb.field_c[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              eb.field_a[var5] = -1;
                              var5++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, sr.field_c);
                        var4 = var3_int + 2;
                        bf.field_c = new String[var4];
                        eb.field_a = new int[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var5 >= var4) {
                            jo.field_b = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var3_int <= var5) {
                                bf.field_c[-2 + var4] = "";
                                bf.field_c[var4 - 1] = jh.field_I;
                                eb.field_a[var4 - 1] = 0;
                                jo.field_b[0] = 5;
                                break L1;
                              } else {
                                bf.field_c[var5] = mb.field_c[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            eb.field_a[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ic.a(qo.field_c, new String[]{"<br><%0><br>"}, (byte) -128));
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var3_int <= var5) {
                          break L12;
                        } else {
                          if ("<%0>".equals(mb.field_c[var5])) {
                            var4 = var5;
                            break L12;
                          } else {
                            var5++;
                            continue L11;
                          }
                        }
                      }
                      if ((var4 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        no.field_b = new String[var4];
                        la.a(mb.field_c, 0, no.field_b, 0, var4);
                        uw.field_c = new String[-1 + -var4 + var3_int];
                        la.a(mb.field_c, var4 + 1, uw.field_c, 0, -var4 + (var3_int - 1));
                        var4 = -1;
                        var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ic.a(lq.field_a, new String[]{"<br><%0><br>"}, (byte) -128));
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var5 >= var3_int) {
                              break L14;
                            } else {
                              if (!"<%0>".equals(mb.field_c[var5])) {
                                var5++;
                                continue L13;
                              } else {
                                var4 = var5;
                                break L14;
                              }
                            }
                          }
                          if ((var4 ^ -1) == 0) {
                            throw new IllegalStateException();
                          } else {
                            L15: {
                              hf.field_F = new String[var4];
                              la.a(mb.field_c, 0, hf.field_F, 0, var4);
                              uw.field_b = new String[-1 + (-var4 + var3_int)];
                              la.a(mb.field_c, var4 - -1, uw.field_b, 0, -1 + -var4 + var3_int);
                              if (no.field_b.length >= hf.field_F.length) {
                                stackIn_31_0 = no.field_b.length;
                                break L15;
                              } else {
                                stackIn_31_0 = hf.field_F.length;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_31_0;
                              if (uw.field_b.length <= uw.field_c.length) {
                                stackIn_34_0 = uw.field_c.length;
                                break L16;
                              } else {
                                stackIn_34_0 = uw.field_b.length;
                                break L16;
                              }
                            }
                            var6 = stackIn_34_0;
                            var7 = var6 + 7 + var5;
                            bf.field_c = new String[var7];
                            eb.field_a = new int[var7];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var7) {
                                jo.field_b = new int[2];
                                bf.field_c[0] = fd.field_i;
                                bf.field_c[1] = km.field_m;
                                eb.field_a[1] = 0;
                                jo.field_b[1] = 2;
                                jo.field_b[0] = 5;
                                eb.field_a[3] = 1;
                                bf.field_c[5] = "";
                                bf.field_c[3] = up.field_b;
                                bf.field_c[2] = ws.field_a;
                                bf.field_c[4] = oh.field_b;
                                var8 = 0;
                                L18: while (true) {
                                  if (var8 >= var5) {
                                    bf.field_c[6 - -var5] = null;
                                    eb.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        iv.field_f = wq.a(-17);
                                        break L1;
                                      } else {
                                        stackIn_46_0 = bf.field_c;
                                        stackIn_46_1 = var5 + (7 + var8);
                                        stackIn_46_2 = uw.field_b.length ^ -1;
                                        stackIn_46_3 = var8 ^ -1;
                                        L20: {




                                          if (stackIn_46_2 >= stackIn_46_3) {
                                            stackIn_46_0 = (String[]) ((Object) stackIn_46_0);

                                            stackIn_49_2 = "";
                                            break L20;
                                          } else {
                                            stackIn_46_0 = (String[]) ((Object) stackIn_46_0);

                                            stackIn_49_2 = uw.field_b[var8];
                                            break L20;
                                          }
                                        }
                                        stackIn_46_0[stackIn_46_1] = stackIn_49_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackIn_41_0 = bf.field_c;

                                      stackIn_41_1 = var8 + 6;

                                      if ((hf.field_F.length + (var8 - var5) ^ -1) > -1) {
                                        stackIn_42_0 = (String[]) ((Object) stackIn_41_0);
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = "";
                                        break L21;
                                      } else {
                                        stackIn_42_0 = (String[]) ((Object) stackIn_41_0);
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = hf.field_F[var8 - -hf.field_F.length + -var5];
                                        break L21;
                                      }
                                    }
                                    stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                eb.field_a[var8] = -1;
                                var8++;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ms.field_c);
                  var4 = var3_int + 2;
                  eb.field_a = new int[var4];
                  bf.field_c = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var4 <= var5) {
                      jo.field_b = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          bf.field_c[-2 + var4] = "";
                          bf.field_c[-1 + var4] = jh.field_I;
                          eb.field_a[var4 + -1] = 0;
                          jo.field_b[0] = 5;
                          break L1;
                        } else {
                          bf.field_c[var5] = mb.field_c[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      eb.field_a[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            nj.field_a.field_e = jo.field_b.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= bf.field_c.length) {
                L25: {
                  if ((cl.field_s ^ -1) == -3) {
                    var11 = no.field_b;
                    var4_ref_String__ = var11;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        var4_ref_String__ = uw.field_c;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var13 = var4_ref_String__[var5];
                            var7 = gt.a((byte) -120, var13, false);
                            if (var7 > var3_int) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var12 = var11[var5];
                        var7 = gt.a((byte) -42, var12, false);
                        if ((var7 ^ -1) < (var3_int ^ -1)) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                hu.field_b = -(var3_int >> 606054945) + oj.field_a;
                dj.field_n = var3_int + oj.field_a - (var3_int >> 1095580897);
                rf.field_d = nj.field_a.field_e * (ag.field_b + qc.field_a << 999161441);
                var4 = 0;
                L28: while (true) {
                  if (var4 >= bf.field_c.length) {
                    hh.field_f = -(rf.field_d >> -1526469247) + nv.field_b;
                    var4 = -96 % ((param2 - 48) / 57);
                    ib.field_g = new int[bf.field_c.length][];
                    var5 = 0;
                    var6 = hh.field_f;
                    L29: while (true) {
                      if (bf.field_c.length <= var5) {
                        L30: {
                          if (cl.field_s == 2) {
                            nj.field_a.a(param0, 84, -1, -1);
                            break L30;
                          } else {
                            nj.field_a.a(param0, -27, wg.b(pi.field_e, 1882601153, ko.field_p), 0);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var7 = eb.field_a[var5];
                          if (var7 < 0) {
                            var6 = var6 + fn.field_t;
                            break L31;
                          } else {
                            var8 = gt.a((byte) -116, bf.field_c[var5], true);
                            var9 = -(var8 >> -1713482751) + oj.field_a;
                            var6 = var6 + qc.field_a;
                            ib.field_g[var5] = new int[4];
                            ib.field_g[var5][0] = var9 - dw.field_b;
                            ib.field_g[var5][1] = var6;
                            ib.field_g[var5][2] = (dw.field_b << 1258903521) + var8;
                            var6 = var6 + (qc.field_a + (ag.field_b << 539594433) - -ga.field_h);
                            ib.field_g[var5][3] = (ag.field_b << 1149207329) + ga.field_h;
                            break L31;
                          }
                        }
                        var5++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackIn_110_0 = rf.field_d;

                      if (0 <= eb.field_a[var4]) {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = ga.field_h;
                        break L32;
                      } else {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = fn.field_t;
                        break L32;
                      }
                    }
                    rf.field_d = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackIn_90_0 = -27;

                  stackIn_90_1 = bf.field_c[var4];

                  if ((eb.field_a[var4] ^ -1) > -1) {
                    stackIn_91_0 = stackIn_90_0;
                    stackIn_91_1 = (String) ((Object) stackIn_90_1);
                    stackIn_91_2 = 0;
                    break L33;
                  } else {
                    stackIn_91_0 = stackIn_90_0;
                    stackIn_91_1 = (String) ((Object) stackIn_90_1);
                    stackIn_91_2 = 1;
                    break L33;
                  }
                }
                var5 = gt.a((byte) stackIn_91_0, stackIn_91_1, stackIn_91_2 != 0);
                if (var5 > var3_int) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "ou.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "save";
    }
}
