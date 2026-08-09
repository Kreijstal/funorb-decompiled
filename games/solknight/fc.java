/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends gg {
    static int field_o;
    static boolean field_m;
    byte[] field_h;
    static int[] field_n;
    g[] field_i;
    private int[] field_k;
    byte[] field_r;
    byte[] field_p;
    sh[] field_q;
    static gl field_l;
    int field_j;
    short[] field_s;

    final static int a(String param0, int param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_100_0 = 0;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            StringBuilder stackIn_106_1 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            var9 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == lf.field_d) {
                    if (!ai.a(param2, (byte) -37)) {
                      stackIn_6_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (qc.field_i != ef.field_e) {
                    break L2;
                  } else {
                    L3: {
                      if (param2) {
                        var11 = (String) null;
                        lf.field_a = pb.a(false, param4, kc.field_P, 0, (String) null);
                        break L3;
                      } else {
                        lf.field_a = rj.a(param0, (byte) 102, param4, false);
                        break L3;
                      }
                    }
                    id.field_c.field_m = 0;
                    id.field_c.c(param5 ^ -121, 14);
                    id.field_c.c(-127, lf.field_a.a(77).field_e);
                    qf.a(param5 + 0, -1);
                    ef.field_e = gl.field_s;
                    break L2;
                  }
                }
                L4: {
                  if (ef.field_e != gl.field_s) {
                    break L4;
                  } else {
                    if (bf.c(81, 1)) {
                      var6_int = te.field_N.j(255);
                      te.field_N.field_m = 0;
                      if (0 != var6_int) {
                        ef.field_e = ik.field_e;
                        ob.field_h = var6_int;
                        te.field_O = -1;
                        break L4;
                      } else {
                        ef.field_e = pl.field_b;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (ef.field_e == pl.field_b) {
                    if (bf.c(54, 8)) {
                      i.field_H = te.field_N.a(10526);
                      te.field_N.field_m = 0;
                      ci.a(-25776, param2, param1, lf.field_a, param3);
                      ef.field_e = rc.field_o;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (ef.field_e != rc.field_o) {
                    break L6;
                  } else {
                    if (!bf.c(53, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = te.field_N.j(255);
                        ob.field_h = var6_int;
                        te.field_N.field_m = 0;
                        ri.field_a = null;
                        if (0 == var6_int) {
                          break L7;
                        } else {
                          if ((var6_int ^ -1) != -2) {
                            if ((var6_int ^ -1) != -9) {
                              ef.field_e = ik.field_e;
                              te.field_O = -1;
                              break L6;
                            } else {
                              je.a(false);
                              je.field_c = false;
                              stackIn_31_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      ef.field_e = dk.field_h;
                      te.field_O = -1;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (dk.field_h == ef.field_e) {
                    if (qd.b((byte) 127)) {
                      L9: {
                        kc.field_P = te.field_N.a(10526);
                        lh.field_s = te.field_N.j(255);
                        te.field_N.j(param5 + 255);
                        ob.field_l = te.field_N.i(param5 + -103);
                        var12 = te.field_N.g(87);
                        var7 = te.field_N.j(255);
                        if (0 != (var7 & 1)) {
                          uf.d(31911);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (param2) {
                          break L10;
                        } else {
                          L11: {
                            if ((4 & var7) == 0) {
                              stackIn_44_0 = 0;
                              break L11;
                            } else {
                              stackIn_44_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            lc.field_u = stackIn_44_0 != 0;
                            if (0 == (8 & var7)) {
                              stackIn_47_0 = 0;
                              break L12;
                            } else {
                              stackIn_47_0 = 1;
                              break L12;
                            }
                          }
                          fb.field_a = stackIn_47_0 != 0;
                          if (!fb.field_a) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        if (!b.field_b) {
                          break L13;
                        } else {
                          te.field_N.j(255);
                          te.field_N.j(255);
                          te.field_N.e(true);
                          me.field_d = te.field_N.i(param5 + -105);
                          dk.field_l = new byte[me.field_d];
                          var8 = 0;
                          L14: while (true) {
                            if (var8 >= me.field_d) {
                              break L13;
                            } else {
                              dk.field_l[var8] = te.field_N.a((byte) -14);
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ne.field_g = te.field_N.h(16);
                        var13 = (CharSequence) ((Object) ne.field_g);
                        kf.field_D = jg.a(var13, -2);
                        c.field_H = te.field_N.j(255);
                        ef.field_e = jj.field_Y;
                        if (lf.field_a.a(123) != dc.field_k) {
                          if (lf.field_a.a(param5 + 70) != qb.field_L) {
                            break L15;
                          } else {
                            bb.field_I.a((byte) 104, ia.g(-78));
                            break L15;
                          }
                        } else {
                          sk.field_p.a((byte) 82, ia.g(-55));
                          break L15;
                        }
                      }
                      L16: {
                        je.field_c = false;
                        if (var12 != null) {
                          kl.a(ia.g(90), var12, 13536);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (ob.field_l > 0) {
                            break L18;
                          } else {
                            if (!lc.field_u) {
                              try {
                                L19: {
                                  fd.a(ia.g(param5 + 110), "unzap", (byte) 101);
                                  break L19;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L20: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L20;
                                }
                              }
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        try {
                          L21: {
                            fd.a(param5 + -4476, ia.g(-63), "zap", new Object[]{ub.a(-62, kc.field_P)});
                            break L21;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L22: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L22;
                          }
                        }
                        break L17;
                      }
                      L23: {
                        if (0 >= ob.field_l) {
                          break L23;
                        } else {
                          cl.field_m = true;
                          break L23;
                        }
                      }
                      id.field_c.a(-1, ed.field_a);
                      var8 = 0;
                      L24: while (true) {
                        if ((var8 ^ -1) <= -5) {
                          te.field_N.a(-1, ed.field_a);
                          stackIn_74_0 = ob.field_h;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          ed.field_a[var8] = ed.field_a[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L25: {
                  if (ik.field_e == ef.field_e) {
                    if (!qd.b((byte) 125)) {
                      break L25;
                    } else {
                      L26: {
                        je.a(false);
                        if (-8 != (ob.field_h ^ -1)) {
                          break L26;
                        } else {
                          if (!je.field_c) {
                            je.field_c = true;
                            stackIn_87_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if ((ob.field_h ^ -1) == -8) {
                          ob.field_h = 3;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      md.field_v = te.field_N.h(param5 + 121);
                      je.field_c = false;
                      stackIn_85_0 = ob.field_h;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L25;
                  }
                }
                L28: {
                  if (param5 == 0) {
                    break L28;
                  } else {
                    var10 = (String) null;
                    fc.a((Throwable) null, (String) null);
                    break L28;
                  }
                }
                L29: {
                  if (null == lf.field_d) {
                    if (je.field_c) {
                      L30: {
                        if (dh.b(-1) > 30000L) {
                          md.field_v = il.field_d;
                          break L30;
                        } else {
                          md.field_v = cl.field_j;
                          break L30;
                        }
                      }
                      je.field_c = false;
                      stackIn_98_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var6_int = ia.field_kb;
                      ia.field_kb = ki.field_C;
                      ki.field_C = var6_int;
                      je.field_c = true;
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                stackIn_100_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_103_0 = (RuntimeException) (var6);

                stackIn_103_1 = new StringBuilder().append("fc.D(");

                if (param0 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "null";
                  break L31;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "{...}";
                  break L31;
                }
              }
              L32: {


                stackIn_106_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "null";
                  break L32;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "{...}";
                  break L32;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_104_0), stackIn_107_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_31_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_74_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_85_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_87_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_98_0;
                      } else {
                        return stackIn_100_0;
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

    final void a(int param0) {
        this.field_k = null;
        if (param0 != 6890) {
            fc.a((byte) 62);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        if (param0 != 124) {
            String var2 = (String) null;
            fc.a((Throwable) null, (String) null);
        }
    }

    final boolean a(me param0, int[] param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = 89 % ((-82 - param3) / 36);
            var5_int = 1;
            var7 = 0;
            var8 = null;
            var9 = 0;
            L1: while (true) {
              if ((var9 ^ -1) <= -129) {
                stackIn_20_0 = var5_int;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param2 == null) {
                      break L3;
                    } else {
                      if (param2[var9] != 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = this.field_k[var9];
                  if (0 != var10) {
                    L4: {
                      if (var7 == var10) {
                        break L4;
                      } else {
                        L5: {
                          var7 = var10;
                          var10--;
                          if (0 == (var10 & 1)) {
                            var8 = param0.a(0, var10 >> 1600326754, param1);
                            break L5;
                          } else {
                            var8 = param0.a(param1, -2, var10 >> -530492670);
                            break L5;
                          }
                        }
                        if (var8 == null) {
                          var5_int = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 != null) {
                      this.field_q[var9] = (sh) (var8);
                      this.field_k[var9] = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("fc.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ',' + param3 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static ve a(Throwable param0, String param1) {
        ve var2 = null;
        if (param0 instanceof ve) {
            var2 = (ve) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new ve(param0, param1);
        }
        return var2;
    }

    fc(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        g dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        g[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        g var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        g var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gb var38 = null;
        byte[] var39 = null;
        g var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        g var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        g var48 = null;
        g var49 = null;
        g var50 = null;
        g var51 = null;
        g var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_r = new byte[128];
            this.field_p = new byte[128];
            this.field_h = new byte[128];
            this.field_i = new g[128];
            this.field_q = new sh[128];
            this.field_s = new short[128];
            this.field_k = new int[128];
            var38 = new gb(param0);
            var3 = 0;
            L1: while (true) {
              if (0 == var38.field_l[var3 + var38.field_m]) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var3++;
                    var38.field_m = var38.field_m + 1;
                    var5 = var38.field_m;
                    var38.field_m = var38.field_m + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_l[var38.field_m + var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var6++;
                            var38.field_m = var38.field_m + 1;
                            var8 = var38.field_m;
                            var38.field_m = var38.field_m + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_l[var9 + var38.field_m] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_m = var38.field_m + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) < -2) {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.j(255);
                                              if (var15_int != 0) {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = var9;
                                        break L7;
                                      }
                                    }
                                    var13 = new g[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.j(255);
                                          if (var14 > 0) {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          } else {
                                            stackIn_39_0 = null;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15 = var46;
                                          var14 = var38.j(255);
                                          if ((var14 ^ -1) >= -1) {
                                            stackIn_42_0 = null;
                                            break L13;
                                          } else {
                                            stackIn_42_0 = new byte[var14 * 2];
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_l[var38.field_m + var17] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var38.field_m = var38.field_m + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (-129 >= (var20 ^ -1)) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if ((var20 ^ -1) <= -129) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var23) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var24 ^ -1)) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (var26 >= 128) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_j = var38.j(255) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var58.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.a((byte) -14);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (null == var16) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var27 >= var47.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.a((byte) -14);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.j(255);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var58.length) {
                                                                                                var27 = var58[0];
                                                                                                var28_int = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var58.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_p[var30] = (byte)(32 + this.field_p[var30] * var28_int >> -409955258);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = (var30 + -var27) * var28_int - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28_int = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = ke.b(var32, -1697860097, var30 + -var27);
                                                                                                            var32 = var32 + (var31 - var28_int);
                                                                                                            this.field_p[var33] = (byte)(32 + var34 * this.field_p[var33] >> -1502842426);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_p[var29] = (byte)(this.field_p[var29] * var28_int + 32 >> 1602553798);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + (var19 + var38.j(255));
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 == null) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            var19 = var38.j(255);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var47.length <= var27) {
                                                                                                var27 = var47[0];
                                                                                                var28_int = var47[1] << -1053044159;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var29 >= var47.length) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = (255 & this.field_r[var30]) - -var28_int;
                                                                                                              if (var31 >= 0) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if ((var31 ^ -1) >= -129) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_r[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 - -1] << -1223639519;
                                                                                                        var32 = (var30 + -var27) * var28_int + (var30 - var27) / 2;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var29 += 2;
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = ke.b(var32, -1697860097, -var27 + var30);
                                                                                                              var35 = var34 + (255 & this.field_r[var37]);
                                                                                                              if (var35 >= 0) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (-129 <= (var35 ^ -1)) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            var32 = var32 + (-var28_int + var31);
                                                                                                            this.field_r[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = var28_int + (this.field_r[var29] & 255);
                                                                                                      if (0 <= var30) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if (-129 <= (var30 ^ -1)) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_r[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 + (1 - -var38.j(255));
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if ((var52.field_d ^ -1) >= -1) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_f = var38.j(255);
                                                                                                                break L53;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L52;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var51 = var13[var27];
                                                                                                          if (var51.field_m <= 0) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_d = var38.j(255);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_m = var38.j(255);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  var28 = var50;
                                                                                                  if (null == var50.field_j) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var28.field_b = var38.j(255);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (var28.field_i == null) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var28.field_h = var38.j(255);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if (var28.field_c <= 0) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var28.field_g = var38.j(255);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_c = var38.j(255);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_j == null) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var29 >= var49.field_j.length) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var38.j(255) + var19 - -1;
                                                                                                var49.field_j[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L59;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L60: {
                                                                                      var48 = var13[var27];
                                                                                      var28 = var48;
                                                                                      if (null == var48.field_i) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var48.field_i.length <= var29) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 - -var38.j(255));
                                                                                            var48.field_i[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L61;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L62: {
                                                                                  var45 = var13[var27];
                                                                                  if (null == var45.field_j) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var29 >= var45.field_j.length) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_j[var29] = var38.a((byte) -14);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (null == var45.field_i) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (-2 + var45.field_i.length <= var29) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_i[var29] = var38.a((byte) -14);
                                                                                        var29 += 2;
                                                                                        continue L65;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L66: {
                                                                              if (var20 != 0) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var54.length > var21) {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L67;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (0 >= this.field_k[var27]) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = 1 + var38.j(255);
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_p[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (this.field_k[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L69;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_i[var26] = (g) (var25);
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (-1 == (this.field_k[var25_int] ^ -1)) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_l[incrementValue$3] << -2100200158;
                                                                            if (var56.length <= var21) {
                                                                              var20 = -1;
                                                                              break L71;
                                                                            } else {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L71;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_r[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (-1 == (this.field_k[var24] ^ -1)) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (0 != var20) {
                                                                        break L73;
                                                                      } else {
                                                                        L74: {
                                                                          if (var21 >= var55.length) {
                                                                            var20 = -1;
                                                                            break L74;
                                                                          } else {
                                                                            incrementValue$5 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$5];
                                                                            break L74;
                                                                          }
                                                                        }
                                                                        incrementValue$6 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_l[incrementValue$6];
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    this.field_h[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L72;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (var20 != 0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.c((byte) 120);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_s[var23] = (short)(this.field_s[var23] + (fi.a(-1 + var22, 2) << 741160046));
                                                            var20--;
                                                            this.field_k[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.j(255);
                                                        this.field_s[var20] = (short)(this.field_s[var20] + (var19 << -2128998808));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.j(255);
                                                    this.field_s[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.a((byte) -14);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$8 = new g();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.j(255);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L77;
                                          } else {
                                            var15_ref.field_j = new byte[2 * var16_int];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.j(255);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L78;
                                          } else {
                                            var15_ref.field_i = new byte[2 + 2 * var16_int];
                                            var40.field_i[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.a((byte) -14);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.a((byte) -14);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.a((byte) -14);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackIn_206_0 = (RuntimeException) (var2);

            stackIn_206_1 = new StringBuilder().append("fc.<init>(");

            if (param0 == null) {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "null";
              break L79;
            } else {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "{...}";
              break L79;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    static {
        field_o = 0;
        field_n = new int[]{1, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 5, 2, 3, 10, 2};
        field_m = false;
        field_l = null;
    }
}
