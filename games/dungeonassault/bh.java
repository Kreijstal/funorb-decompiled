/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh extends ck {
    private ci field_O;
    static int field_P;
    static boolean field_M;
    static String field_L;
    static String field_Q;
    private String[] field_R;
    static String[] field_J;
    static String field_K;
    static String[] field_N;
    private md field_S;

    final static int b(int param0, int param1, boolean param2) {
        int var3 = tg.field_f[param1][param0];
        if (param2) {
            return -123;
        }
        if (ke.a(71, var3)) {
            return 260;
        }
        return tg.field_b[param1];
    }

    final static String a(int param0, int param1) {
        if (param0 <= 116) {
            return (String) null;
        }
        if (param1 == ek.field_c) {
            return null;
        }
        return cc.field_e[param1];
    }

    public static void f(byte param0) {
        field_J = null;
        int var1 = -97 / ((param0 - -1) / 33);
        field_L = null;
        field_N = null;
        field_K = null;
        field_Q = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.g((byte) -109);
    }

    final void a(int param0, int param1, String param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (null == this.field_R || this.field_R.length <= param1) {
            var7 = new String[param1 - -1];
            var8 = var7;
            String[] var4 = var8;
            if (this.field_R != null) {
                for (var5 = 0; var5 < this.field_R.length; var5++) {
                    var7[var5] = this.field_R[var5];
                }
            }
            this.field_R = var8;
        }
        if (param0 != 8) {
            return;
        }
        try {
            this.field_R[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bh.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    bh(String param0, ca param1) {
        super(param0, (pg) null);
        this.field_O = null;
        try {
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 34) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_K = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bh.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_q + param3;
        int var6 = param0 - this.field_v;
        ci var7 = this.a(var5, var6, true);
        if (var7 != null && this.field_n != null) {
            ((pf) ((Object) this.field_n)).a(var7.field_r, (bh) (this), param2 + 125, param1);
        }
    }

    final static int a(boolean param0, String param1, int param2, int param3, boolean param4, String param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_99_0 = 0;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            String stackIn_103_2 = null;
            StringBuilder stackIn_105_1 = null;
            StringBuilder stackIn_106_1 = null;
            String stackIn_106_2 = null;
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
            var9 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  if (null != sp.field_c) {
                    break L1;
                  } else {
                    if (!rj.a((byte) 98, param4)) {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (pd.field_A == no.field_c) {
                    L3: {
                      if (!param4) {
                        be.field_n = qf.a(96, false, param1, param5);
                        break L3;
                      } else {
                        var10 = (String) null;
                        be.field_n = l.a(param1, false, hg.field_s, false, (String) null);
                        break L3;
                      }
                    }
                    ac.field_B.field_o = 0;
                    ac.field_B.a(6, 14);
                    ac.field_B.a(6, be.field_n.b(-110).field_c);
                    op.a(0, -1);
                    pd.field_A = ik.field_b;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (pd.field_A != ik.field_b) {
                    break L4;
                  } else {
                    if (oi.a(-12929, 1)) {
                      L5: {
                        var6_int = ra.field_c.c(true);
                        if (var6_int != 0) {
                          hc.field_c = var6_int;
                          nj.field_b = -1;
                          pd.field_A = bj.field_K;
                          break L5;
                        } else {
                          pd.field_A = mh.field_c;
                          break L5;
                        }
                      }
                      ra.field_c.field_o = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (mh.field_c == pd.field_A) {
                    if (oi.a(-12929, 8)) {
                      o.field_j = ra.field_c.c((byte) 105);
                      ra.field_c.field_o = 0;
                      b.a(be.field_n, param0, (byte) -27, param3, param4);
                      pd.field_A = rp.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (rp.field_d != pd.field_A) {
                    break L7;
                  } else {
                    if (oi.a(-12929, 1)) {
                      L8: {
                        var6_int = ra.field_c.c(true);
                        ra.field_c.field_o = 0;
                        hc.field_c = var6_int;
                        pd.field_E = null;
                        if (0 == var6_int) {
                          break L8;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L8;
                          } else {
                            if (var6_int == 8) {
                              tl.a(127);
                              nh.field_e = false;
                              stackIn_32_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              pd.field_A = bj.field_K;
                              nj.field_b = -1;
                              break L7;
                            }
                          }
                        }
                      }
                      nj.field_b = -1;
                      pd.field_A = k.field_e;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (param2 > 99) {
                    break L9;
                  } else {
                    field_N = (String[]) null;
                    break L9;
                  }
                }
                L10: {
                  if (k.field_e != pd.field_A) {
                    break L10;
                  } else {
                    if (kh.d((byte) -86)) {
                      L11: {
                        hg.field_s = ra.field_c.c((byte) 53);
                        nh.field_k = ra.field_c.c(true);
                        ra.field_c.c(true);
                        pb.field_G = ra.field_c.k(0);
                        var6 = ra.field_c.b(true);
                        var7 = ra.field_c.c(true);
                        if (-1 == (1 & var7 ^ -1)) {
                          break L11;
                        } else {
                          l.b(false);
                          break L11;
                        }
                      }
                      L12: {
                        if (!param4) {
                          L13: {
                            if (0 == (8 & var7)) {
                              stackIn_46_0 = 0;
                              break L13;
                            } else {
                              stackIn_46_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            field_M = stackIn_46_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackIn_49_0 = 0;
                              break L14;
                            } else {
                              stackIn_49_0 = 1;
                              break L14;
                            }
                          }
                          e.field_l = stackIn_49_0 != 0;
                          if (field_M) {
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      L15: {
                        if (fa.field_j) {
                          ra.field_c.c(true);
                          ra.field_c.c(true);
                          ra.field_c.h(-59);
                          ao.field_k = ra.field_c.k(0);
                          ti.field_q = new byte[ao.field_k];
                          var8 = 0;
                          L16: while (true) {
                            if (var8 >= ao.field_k) {
                              break L15;
                            } else {
                              ti.field_q[var8] = ra.field_c.a((byte) 2);
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        tc.field_u = ra.field_c.d(-98);
                        var11 = (CharSequence) ((Object) tc.field_u);
                        nn.field_k = jm.a((byte) 59, var11);
                        hf.field_sb = ra.field_c.c(true);
                        pd.field_A = qa.field_c;
                        if (be.field_n.b(65) != pe.field_j) {
                          if (be.field_n.b(-104) == ug.field_w) {
                            gg.field_c.a(64, m.c(true));
                            break L17;
                          } else {
                            break L17;
                          }
                        } else {
                          ba.field_e.a(64, m.c(true));
                          break L17;
                        }
                      }
                      L18: {
                        nh.field_e = false;
                        if (var6 == null) {
                          break L18;
                        } else {
                          jb.a(true, var6, m.c(true));
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (pb.field_G > 0) {
                            break L20;
                          } else {
                            if (e.field_l) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  ee.a((byte) -21, m.c(true), "unzap");
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            ee.a("zap", m.c(true), 15647, new Object[]{uj.a(hg.field_s, -1)});
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if ((pb.field_G ^ -1) >= -1) {
                          break L25;
                        } else {
                          ld.field_g = true;
                          break L25;
                        }
                      }
                      ac.field_B.a(n.field_f, (byte) -86);
                      var8 = 0;
                      L26: while (true) {
                        if (4 <= var8) {
                          ra.field_c.a(n.field_f, (byte) -108);
                          stackIn_77_0 = hc.field_c;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          n.field_f[var8] = n.field_f[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L27: {
                  if (pd.field_A != bj.field_K) {
                    break L27;
                  } else {
                    if (!kh.d((byte) -60)) {
                      break L27;
                    } else {
                      L28: {
                        tl.a(-17);
                        if (-8 != (hc.field_c ^ -1)) {
                          break L28;
                        } else {
                          if (!nh.field_e) {
                            nh.field_e = true;
                            stackIn_89_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (hc.field_c == 7) {
                          hc.field_c = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      tp.field_v = ra.field_c.d(-96);
                      nh.field_e = false;
                      stackIn_87_0 = hc.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                L30: {
                  if (null != sp.field_c) {
                    break L30;
                  } else {
                    if (!nh.field_e) {
                      var6_int = an.field_E;
                      an.field_E = l.field_b;
                      l.field_b = var6_int;
                      nh.field_e = true;
                      break L30;
                    } else {
                      L31: {
                        if (b.a(123) <= 30000L) {
                          tp.field_v = fc.field_l;
                          break L31;
                        } else {
                          tp.field_v = lh.field_r;
                          break L31;
                        }
                      }
                      nh.field_e = false;
                      stackIn_96_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
                stackIn_99_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_102_0 = (RuntimeException) (var6_ref);

                stackIn_102_1 = new StringBuilder().append("bh.R(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "null";
                  break L32;
                } else {
                  stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "{...}";
                  break L32;
                }
              }
              L33: {


                stackIn_105_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_103_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                  stackIn_106_2 = "null";
                  break L33;
                } else {
                  stackIn_103_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                  stackIn_106_2 = "{...}";
                  break L33;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_103_0), stackIn_106_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_32_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_77_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_87_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_89_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_96_0;
                      } else {
                        return stackIn_99_0;
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

    final void a(int param0, byte param1, int param2, int param3) {
        this.b(0, param2, param3, param0, ((th) ((Object) this.field_o)).a((lm) (this), 8));
        if (param1 >= -11) {
            field_M = false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2 ^ param2, param3);
        if (-1 != (param0 ^ -1)) {
            return;
        }
        th var5 = (th) ((Object) this.field_o);
        ci var6 = this.field_O;
        if (var6 != null) {
            var7 = var5.a((lm) (this), (byte) 75, param1);
            var8 = var5.a((byte) 84, param3, (lm) (this));
            do {
                in.a(-2 + (var6.field_k + var7), var6.field_p + 2, var6.field_i + 2, var6.field_l + (var8 - 2), 1);
                var6 = var6.field_o;
            } while (var6 != null);
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_O = null;
              if (this.field_u) {
                var5_int = -this.field_q + (hj.field_S - param0);
                var6 = -param1 + eh.field_h - this.field_v;
                this.field_O = this.a(var5_int, var6, true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                bh.a(110, 28);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void g(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        th var3;
        int var4;
        l var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        int var12;
        tg var13;
        int var14;
        int var15;
        ci var16;
        int var17;
        var17 = DungeonAssault.field_K;
        this.field_S = new md();
        var2 = 0;
        var3 = (th) ((Object) this.field_o);
        var4 = -22 / ((param0 - -42) / 62);
        var5 = var3.b(-2, (lm) (this));
        L0: while (true) {
          var6 = this.field_w.indexOf("<hotspot=", var2);
          if (0 != (var6 ^ -1)) {
            var8 = this.field_w.indexOf(">", var6);
            var7 = this.field_w.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var2 = this.field_w.indexOf("</hotspot>", var6);
            var9 = var5.a(0, var6);
            var10 = var5.a(0, var2);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var5.field_e[var12];
                  if ((var12 ^ -1) == (var9 ^ -1)) {
                    stackIn_8_0 = var5.a((byte) 60, var6);
                    break L2;
                  } else {
                    stackIn_8_0 = var13.field_k[0];
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_8_0;
                  if (var10 != var12) {
                    if (var13 == null) {
                      stackIn_13_0 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = var13.field_k[-1 + var13.field_k.length];
                      break L3;
                    }
                  } else {
                    stackIn_13_0 = var5.a((byte) 70, var2);
                    break L3;
                  }
                }
                L4: {
                  var15 = stackIn_13_0;
                  var16 = new ci(var8, var14, var13.field_m, -var14 + var15, Math.max(var3.a(100), -var13.field_m + var13.field_c));
                  if (var11 != null) {
                    ((ci) (var11)).field_o = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_S.a(var16, false);
                var11 = var16;
                var12++;
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    private final ci a(int param0, int param1, boolean param2) {
        ci var4;
        ci var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var4 = (ci) ((Object) this.field_S.e(-24172));
        if (param2) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (ci) ((Object) this.field_S.a(4));
                  continue L0;
                } else {
                  L2: {
                    if (param0 < var5.field_k) {
                      break L2;
                    } else {
                      if (param1 < var5.field_l) {
                        break L2;
                      } else {
                        if (var5.field_i + var5.field_k <= param0) {
                          break L2;
                        } else {
                          if (var5.field_l - -var5.field_p >= param1) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_o;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (ci) null;
        }
    }

    String c(byte param0) {
        if (this.field_O == null) {
            return null;
        }
        if (this.field_R == null) {
            return null;
        }
        if (param0 <= 3) {
            return (String) null;
        }
        if (this.field_R.length <= this.field_O.field_r) {
            return null;
        }
        return this.field_R[this.field_O.field_r];
    }

    static {
        field_M = true;
        field_J = new String[]{"Welcome", "Welcome to <%highlight>Dungeon Assault</col>! In this game, you play a dragon, battling your kind to gain <%highlight>Renown</col> in the realm of Dungaria.<br><br><%command>You can hide this tutorial by clicking on the down arrow icon at the top-right of this scroll, and return to it by clicking the visible portion of this scroll at the right edge of the screen. You can also reposition it by holding the mouse button and dragging.</col><br><br><%command>Click the arrow at the bottom-right of this scroll to continue."};
        field_L = "There is a pit in this room, but it remains concealed until a raider steps on it.";
        field_K = "OVER <%0>";
        field_Q = "Please log in to access this feature.";
        field_N = new String[]{"Master of Chaos", "Sacrifice a raider to defeat any room. (Multiple use)"};
    }
}
