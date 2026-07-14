/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends bh {
    static String field_Y;
    static String field_U;
    private String field_Z;
    private cn field_V;
    static cn field_W;
    private dp field_T;
    static cn field_I;
    private int field_X;

    final String c(byte param0) {
        if (param0 >= 3) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((tn) this).a(25, (lm) null);
        return null;
    }

    final boolean a(int param0, lm param1) {
        if (param0 != 34) {
            field_U = null;
            return false;
        }
        return false;
    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 >= -18) {
            field_W = null;
        }
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var5 = param1.charAt(var4);
            if (var4 != 0) {
                var5 = Character.toLowerCase((char) var5);
            } else {
                var5 = lb.a((char) var5, 80);
            }
            var3[var4] = (char)var5;
        }
        return new String(var3);
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        ((tn) this).field_X = ((tn) this).field_X + 1;
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0) {
        cd.field_b = false;
        qc.field_t = false;
        sn.a(49, param0);
        wd.field_d = sp.field_e;
        ol.field_i = sp.field_e;
    }

    final static pp a(int param0, int param1, se param2, cn param3, int param4, String param5) {
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        int var10_int = 0;
        cn var10 = null;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        cn var14 = null;
        cn var15 = null;
        cn var16 = null;
        int var17 = 0;
        Object var18 = null;
        L0: {
          var17 = DungeonAssault.field_K;
          jh.c();
          var6 = param2.b(param5);
          var7 = param2.field_E + param2.field_H;
          var8 = new cn(var6, var7);
          var8.e();
          param2.b(param5, 0, param2.field_H, 16760960, -1);
          if (param4 <= -36) {
            break L0;
          } else {
            var18 = null;
            pp discarded$2 = tn.a(9, 109, (se) null, (cn) null, 59, (String) null);
            break L0;
          }
        }
        var9 = te.a(var6, var7, ag.field_c, 32, 32, 0.125);
        var10_int = 0;
        L1: while (true) {
          if (var9.field_B.length <= var10_int) {
            var10 = rb.a(16, var8, 16776960, (byte) 100);
            var11 = -var8.field_y + param3.field_y >> -485030015;
            var12 = param3.field_v - var8.field_v >> 1789048417;
            var13 = dd.a((byte) -112, 4, var9);
            var14 = param3.d();
            var14.e();
            bp.a(var12, var13, var11, (byte) 99);
            var9.h(var11, var12);
            var14.h();
            var15 = var14.d();
            var15.e();
            gf.b(0, 0, param3.field_y, param3.field_v, 0, 160);
            var15.h();
            var16 = param3.d();
            var16.e();
            rb.a(8, var8, 12690143, (byte) -59).b(var11, var12, 32);
            var8.h(var11, var12);
            var10.field_w = var10.field_w + var11;
            var10.field_A = var10.field_A + var12;
            jh.b();
            return new pp(var14, var15, var16, var10, param0, param1);
          } else {
            if (0 == var8.field_B[var10_int]) {
              var9.field_B[var10_int] = 0;
              var10_int++;
              continue L1;
            } else {
              var10_int++;
              continue L1;
            }
          }
        }
    }

    tn(dp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ca) (Object) ri.a((byte) 56));
        ((tn) this).field_Z = param1;
        ((tn) this).field_T = param0;
        ((tn) this).b(0, param4, param3, param2, param5);
    }

    public static void h(byte param0) {
        field_Y = null;
        field_W = null;
        if (param0 != -89) {
            Object var2 = null;
            pp discarded$0 = tn.a(-105, -33, (se) null, (cn) null, -20, (String) null);
        }
        field_U = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        od var6 = null;
        th var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cn var14 = null;
        cn var15 = null;
        cn var16 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var13 = DungeonAssault.field_K;
                var6 = ((tn) this).field_T.a((byte) -116);
                if (ub.field_s == var6) {
                  break L3;
                } else {
                  if (var6 != oc.field_A) {
                    var5 = ((tn) this).field_T.a(true);
                    if (var5 == null) {
                      var5 = ((tn) this).field_Z;
                      break L2;
                    } else {
                      if (!var5.equals((Object) (Object) ((tn) this).field_w)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = kj.field_k;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((tn) this).field_w)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((tn) this).field_w = var5;
          ((tn) this).g((byte) 112);
          break L0;
        }
        L4: {
          L5: {
            super.a(param0, param1, param2, param3);
            var6 = ((tn) this).field_T.a((byte) -110);
            var8 = (th) (Object) ((tn) this).field_o;
            var9 = ((tn) this).field_q + param1;
            var10 = var8.a((byte) 64, param3, (lm) this) - -(var8.b(-2, (lm) this).b(263) >> -1069160095);
            if (ub.field_s == var6) {
              break L5;
            } else {
              if (oc.field_A != var6) {
                if (var6 != pd.field_J) {
                  if (var6 == c.field_d) {
                    var16 = sl.field_c[1];
                    var16.b(var9, var10 + -(var16.field_v >> 378418433), 256);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var15 = sl.field_c[2];
                  var15.b(var9, var10 - (var15.field_v >> -612723103), 256);
                  break L4;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              var14 = sl.field_c[0];
              var11 = var14.field_E << -996960095;
              var12 = var14.field_G << 280613377;
              if (((tn) this).field_V == null) {
                break L7;
              } else {
                if (var11 > ((tn) this).field_V.field_y) {
                  break L7;
                } else {
                  if (var12 > ((tn) this).field_V.field_v) {
                    break L7;
                  } else {
                    lm.a(((tn) this).field_V, (byte) 38);
                    gf.a();
                    break L6;
                  }
                }
              }
            }
            ((tn) this).field_V = new cn(var11, var12);
            lm.a(((tn) this).field_V, (byte) -79);
            break L6;
          }
          var14.b(112, 144, var14.field_E << -1072581244, var14.field_G << 1303701380, -((tn) this).field_X << -1707845462, 4096);
          ti.c(true);
          ((tn) this).field_V.b(var9 + -(var14.field_E >> 1170036449), -var14.field_G + var10, 256);
          break L4;
        }
    }

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ec var16 = null;
        ec var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        var15 = DungeonAssault.field_K;
        var16 = new ec(param1);
        var17 = var16;
        var17.field_o = -2 + param1.length;
        dk.field_d = var17.k(0);
        jn.field_k = new int[dk.field_d];
        ub.field_q = new byte[dk.field_d][];
        gk.field_Q = new boolean[dk.field_d];
        hg.field_t = new int[dk.field_d];
        if (param0 > 59) {
          rf.field_P = new byte[dk.field_d][];
          jc.field_f = new int[dk.field_d];
          fe.field_g = new int[dk.field_d];
          var17.field_o = -7 + (param1.length - dk.field_d * 8);
          ce.field_x = var17.k(0);
          tb.field_i = var17.k(0);
          var3 = 1 + (255 & var17.c(true));
          var4 = 0;
          L0: while (true) {
            L1: {
              if (dk.field_d <= var4) {
                break L1;
              } else {
                hg.field_t[var4] = var16.k(0);
                var4++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (dk.field_d <= var4) {
                  break L3;
                } else {
                  fe.field_g[var4] = var16.k(0);
                  var4++;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                L5: {
                  if (dk.field_d <= var4) {
                    break L5;
                  } else {
                    jc.field_f[var4] = var16.k(0);
                    var4++;
                    if (0 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var4 = 0;
                L6: while (true) {
                  L7: {
                    if (var4 >= dk.field_d) {
                      break L7;
                    } else {
                      jn.field_k[var4] = var16.k(0);
                      var4++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var17.field_o = -(3 * var3) + (-4 + param1.length + -(8 * dk.field_d));
                  uo.field_b = new int[var3];
                  var4 = 1;
                  L8: while (true) {
                    L9: {
                      if (var4 >= var3) {
                        break L9;
                      } else {
                        L10: {
                          uo.field_b[var4] = var16.f(-114);
                          if ((uo.field_b[var4] ^ -1) == -1) {
                            uo.field_b[var4] = 1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var4++;
                        if (0 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var17.field_o = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (dk.field_d <= var4) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              var5 = jc.field_f[var4];
                              var6 = jn.field_k[var4];
                              var7 = var5 * var6;
                              var24 = new byte[var7];
                              var22 = var24;
                              var20 = var22;
                              var18 = var20;
                              var8 = var18;
                              ub.field_q[var4] = var24;
                              var25 = new byte[var7];
                              var23 = var25;
                              var21 = var23;
                              var19 = var21;
                              var9 = var19;
                              rf.field_P[var4] = var25;
                              var10 = 0;
                              var11 = var17.c(true);
                              if (0 == (1 & var11)) {
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var5 <= var12) {
                                      break L16;
                                    } else {
                                      var13 = 0;
                                      L17: while (true) {
                                        L18: {
                                          if (var6 <= var13) {
                                            break L18;
                                          } else {
                                            var8[var12 - -(var5 * var13)] = var16.a((byte) 2);
                                            var13++;
                                            if (0 == 0) {
                                              continue L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        var12++;
                                        if (0 == 0) {
                                          continue L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                  if ((var11 & 2) != 0) {
                                    var12 = 0;
                                    L19: while (true) {
                                      L20: {
                                        if (var12 >= var5) {
                                          break L20;
                                        } else {
                                          var13 = 0;
                                          L21: while (true) {
                                            L22: {
                                              if (var13 >= var6) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  var9[var5 * var13 + var12] = var16.a((byte) 2);
                                                  var14 = var16.a((byte) 2);
                                                  stackOut_40_0 = var10;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_41_0 = stackOut_40_0;
                                                  if ((var14 ^ -1) == 0) {
                                                    stackOut_42_0 = stackIn_42_0;
                                                    stackOut_42_1 = 0;
                                                    stackIn_43_0 = stackOut_42_0;
                                                    stackIn_43_1 = stackOut_42_1;
                                                    break L23;
                                                  } else {
                                                    stackOut_41_0 = stackIn_41_0;
                                                    stackOut_41_1 = 1;
                                                    stackIn_43_0 = stackOut_41_0;
                                                    stackIn_43_1 = stackOut_41_1;
                                                    break L23;
                                                  }
                                                }
                                                var10 = stackIn_43_0 | stackIn_43_1;
                                                var13++;
                                                if (0 == 0) {
                                                  continue L21;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            var12++;
                                            if (0 == 0) {
                                              continue L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var12 = 0;
                            L24: while (true) {
                              L25: {
                                if (var7 <= var12) {
                                  break L25;
                                } else {
                                  var8[var12] = var16.a((byte) 2);
                                  var12++;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              if ((var11 & 2) == 0) {
                                break L13;
                              } else {
                                var12 = 0;
                                L26: while (true) {
                                  if (var12 >= var7) {
                                    break L13;
                                  } else {
                                    L27: {
                                      var9[var12] = var16.a((byte) 2);
                                      var13 = var16.a((byte) 2);
                                      stackOut_53_0 = var10;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_54_0 = stackOut_53_0;
                                      if ((var13 ^ -1) == 0) {
                                        stackOut_55_0 = stackIn_55_0;
                                        stackOut_55_1 = 0;
                                        stackIn_56_0 = stackOut_55_0;
                                        stackIn_56_1 = stackOut_55_1;
                                        break L27;
                                      } else {
                                        stackOut_54_0 = stackIn_54_0;
                                        stackOut_54_1 = 1;
                                        stackIn_56_0 = stackOut_54_0;
                                        stackIn_56_1 = stackOut_54_1;
                                        break L27;
                                      }
                                    }
                                    var10 = stackIn_56_0 | stackIn_56_1;
                                    var12++;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          gk.field_Q[var4] = var10 != 0;
                          var4++;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Cost";
        field_Y = "The reanimated corpses of previous failed raids; these four skeletons are well armed.<br><br>This monster will rise again when the party leaves the room, even if defeated.";
    }
}
