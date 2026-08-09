/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends df implements pj, vb {
    static aj field_I;
    static int field_G;
    static String field_H;
    private ej field_J;
    private ag field_F;
    static byte[] field_D;
    static int field_K;
    private ie field_E;

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        L0: {
          if (null == ob.field_hb) {
            break L0;
          } else {
            var1 = ob.field_hb;
            synchronized (var1) {
              L1: {
                ob.field_hb = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0 == -23) {
            break L2;
          } else {
            field_D = (byte[]) null;
            break L2;
          }
        }
    }

    private final String g(int param0) {
        if (param0 != -7) {
            qm var3 = (qm) null;
            this.a((qm) null, (byte) 70, 'ﾘ', 107);
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String g(byte param0) {
        if (param0 != 94) {
            field_H = (String) null;
        }
        return "</col></u>";
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_24_0 = null;
        kc stackIn_33_0 = null;
        kc stackIn_34_0 = null;
        String stackIn_34_1 = null;
        kc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String[] stackIn_36_2 = null;
        kc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_37_2 = null;
        String stackIn_37_3 = null;
        kc stackIn_64_0 = null;
        kc stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        kc stackIn_69_0 = null;
        kc stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        kc stackIn_74_0 = null;
        kc stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        kc var5 = null;
        kc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        kc var15 = null;
        String var16 = null;
        kc var17 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ej.a(16, sm.field_a);
              if (null == om.field_x) {
                break L1;
              } else {
                L2: {
                  L3: {
                    go.field_d.field_I = 0;
                    var15 = go.field_d;
                    var17 = var15;
                    var17.field_x = 0;
                    dk.field_k.field_I = 0;
                    var5 = dk.field_k;
                    var5.field_x = 0;
                    var6 = jf.field_d;
                    jf.field_d.field_I = 0;
                    var6.field_x = 0;
                    nl.field_Db.field_rb = ri.field_c.toUpperCase();
                    var7 = (oh.field_h.field_x + 2) / 2;
                    jf.field_d.a(-2 + var7, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
                    dk.field_k.a(-var7 + oh.field_h.field_x, var7, oh.field_h.field_I + -40, 40, (byte) -120);
                    if (ao.field_h.length != 1) {
                      break L3;
                    } else {
                      if (-3 != (ao.field_h[0] ^ -1)) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (ao.field_h.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if ((gh.field_E[var10 / 8] & 1 << (var10 & 7) ^ -1) == -1) {
                            stackIn_10_0 = 0;
                            break L6;
                          } else {
                            stackIn_10_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_10_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (2 != ao.field_h[var10]) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int == 0) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                dk.field_k.field_ub = true;
                if (!dn.field_Db) {
                  L9: {
                    stackIn_33_0 = dk.field_k;

                    if (var8 == 0) {
                      stackIn_34_0 = (kc) ((Object) stackIn_33_0);
                      stackIn_34_1 = ah.field_d;
                      break L9;
                    } else {
                      stackIn_34_0 = (kc) ((Object) stackIn_33_0);
                      stackIn_34_1 = fi.field_b;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_34_0.field_rb = ((String) (Object) stackIn_34_1).toUpperCase();
                    stackIn_36_0 = vc.field_c;

                    stackIn_36_1 = -96;

                    stackIn_36_2 = new String[]{dk.field_k.field_rb};

                    if (var8 == 0) {
                      stackIn_37_0 = (kc) ((Object) stackIn_36_0);
                      stackIn_37_1 = stackIn_36_1;
                      stackIn_37_2 = (String[]) ((Object) stackIn_36_2);
                      stackIn_37_3 = bi.field_W;
                      break L10;
                    } else {
                      stackIn_37_0 = (kc) ((Object) stackIn_36_0);
                      stackIn_37_1 = stackIn_36_1;
                      stackIn_37_2 = (String[]) ((Object) stackIn_36_2);
                      stackIn_37_3 = km.field_g;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_37_0.field_rb = tj.a(stackIn_37_1, stackIn_37_2, stackIn_37_3);
                    jf.field_d.field_rb = me.field_R;
                    mo.field_o.field_ub = true;
                    bg.field_a = true;
                    if (um.field_a == null) {
                      break L11;
                    } else {
                      L12: {
                        if (qa.field_l != null) {
                          break L12;
                        } else {
                          qa.field_l = new byte[vf.field_l];
                          tk.field_q = new boolean[vf.field_l];
                          break L12;
                        }
                      }
                      bg.field_a = false;
                      nb.field_d = false;
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (vf.field_l <= var13) {
                          jm.a(-1, (byte) -25, true, om.field_x, -1, vf.field_l, -1, 0);
                          if ((qf.field_d ^ -1) > -3) {
                            break L11;
                          } else {
                            if (!ri.field_b[12]) {
                              break L11;
                            } else {
                              bg.field_a = true;
                              break L11;
                            }
                          }
                        } else {
                          tk.field_q[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    }
                  }
                  if (bg.field_a) {
                    break L1;
                  } else {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                      L14: {
                        var9 = null;
                        if (!nb.field_d) {
                          break L14;
                        } else {
                          var9 = "<col=A00000>" + w.field_Bb + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= vf.field_l) {
                          kh.field_c = "<col=A00000>" + nm.field_f + "<br>" + cd.field_s + (String) (var9);
                          break L1;
                        } else {
                          L16: {
                            if (tk.field_q[var10]) {
                              var11_ref = "<col=A00000>" + ob.field_bb[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L16;
                              } else {
                                var9 = var11_ref;
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  L17: {
                    mo.field_o.field_ub = false;
                    vc.field_c.field_rb = j.field_e;
                    if (var8 == 0) {
                      stackIn_24_0 = ql.field_e;
                      break L17;
                    } else {
                      stackIn_24_0 = bb.field_f;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_24_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = jf.field_d.field_Z.b(var16) + 3 * jf.field_d.field_Z.a('.');
                    jf.field_d.field_X = 0;
                    if (16 != (sb.field_e & 48)) {
                      break L18;
                    } else {
                      var9 = var16 + ".";
                      break L18;
                    }
                  }
                  L19: {
                    jf.field_d.field_t = (jf.field_d.field_x - var10) / 2;
                    if (-33 != (sb.field_e & 48 ^ -1)) {
                      break L19;
                    } else {
                      var9 = (String) (var9) + "..";
                      break L19;
                    }
                  }
                  L20: {
                    if ((sb.field_e & 48 ^ -1) != -49) {
                      break L20;
                    } else {
                      var9 = (String) (var9) + "...";
                      break L20;
                    }
                  }
                  jf.field_d.field_rb = (String) (var9);
                  dk.field_k.field_rb = sa.field_Eb.toUpperCase();
                  break L1;
                }
              }
            }
            L21: {
              L22: {
                stackIn_64_0 = hl.field_m;

                if (!param2) {
                  break L22;
                } else {
                  stackIn_64_0 = (kc) ((Object) stackIn_64_0);

                  if (param0) {
                    break L22;
                  } else {
                    stackIn_64_0 = (kc) ((Object) stackIn_64_0);

                    if (so.field_j) {
                      break L22;
                    } else {
                      stackIn_65_0 = (kc) ((Object) stackIn_64_0);
                      stackIn_65_1 = 1;
                      break L21;
                    }
                  }
                }
              }
              stackIn_65_0 = (kc) ((Object) stackIn_64_0);
              stackIn_65_1 = 0;
              break L21;
            }
            L23: {
              L24: {
                ((kc) (Object) stackIn_65_0).b(stackIn_65_1 != 0, (byte) 33);
                stackIn_69_0 = oh.field_h;

                if (!param2) {
                  break L24;
                } else {
                  stackIn_69_0 = (kc) ((Object) stackIn_69_0);

                  if (param0) {
                    break L24;
                  } else {
                    stackIn_69_0 = (kc) ((Object) stackIn_69_0);

                    if (so.field_j) {
                      break L24;
                    } else {
                      stackIn_70_0 = (kc) ((Object) stackIn_69_0);
                      stackIn_70_1 = 1;
                      break L23;
                    }
                  }
                }
              }
              stackIn_70_0 = (kc) ((Object) stackIn_69_0);
              stackIn_70_1 = 0;
              break L23;
            }
            L25: {
              L26: {
                ((kc) (Object) stackIn_70_0).b(stackIn_70_1 != 0, (byte) 90);
                stackIn_74_0 = nl.field_Fb;

                if (!param2) {
                  break L26;
                } else {
                  stackIn_74_0 = (kc) ((Object) stackIn_74_0);

                  if (param0) {
                    break L26;
                  } else {
                    stackIn_74_0 = (kc) ((Object) stackIn_74_0);

                    if (!so.field_j) {
                      break L26;
                    } else {
                      stackIn_75_0 = (kc) ((Object) stackIn_74_0);
                      stackIn_75_1 = 1;
                      break L25;
                    }
                  }
                }
              }
              stackIn_75_0 = (kc) ((Object) stackIn_74_0);
              stackIn_75_1 = 0;
              break L25;
            }
            L27: {
              ((kc) (Object) stackIn_75_0).b(stackIn_75_1 != 0, (byte) 64);
              tn.field_Ob.field_c.h((byte) 101);
              if (null == om.field_x) {
                break L27;
              } else {
                L28: {
                  if (-1 == (mo.field_o.field_U ^ -1)) {
                    break L28;
                  } else {
                    bc.a(param1, -14431);
                    break L28;
                  }
                }
                L29: {
                  if (-1 == (dk.field_k.field_U ^ -1)) {
                    break L29;
                  } else {
                    if (!dn.field_Db) {
                      fm.a(param1, true);
                      break L29;
                    } else {
                      uc.a(param1, (byte) -96);
                      break L29;
                    }
                  }
                }
                lm.a(true, param1, om.field_x, 0);
                break L27;
              }
            }
            L30: {
              if (param3 > 105) {
                break L30;
              } else {
                ng.a(false, -75L);
                break L30;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ng.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        String discarded$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                discarded$1 = this.g(-67);
                break L1;
              }
            }
            L2: {
              if (this.field_F == param4) {
                mo.g(-1);
                this.field_E.h(77);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ng.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -120) {
                break L1;
              } else {
                ng.a((byte) -91);
                break L1;
              }
            }
            if (super.a(param0, (byte) -122, param2, param3)) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param3) {
                if (99 == param3) {
                  stackIn_12_0 = this.b(2, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = this.a(param0, 9555);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ng.N(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void a(int param0, ej param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param3) {
                uh.a(126, "terms.ws");
                break L1;
              } else {
                if (param3 != 1) {
                  if ((param3 ^ -1) == -3) {
                    uh.a(127, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  uh.a(126, "privacy.ws");
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == -1607) {
                break L2;
              } else {
                this.field_J = (ej) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ng.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 96 % ((param0 - -43) / 49);
        field_I = null;
        field_H = null;
        field_D = null;
    }

    final static void a(boolean param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param1);
                  if (param0) {
                    break L1;
                  } else {
                    field_I = (aj) null;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ng(ie param0) {
        super(0, 0, 288, 0, (pf) null);
        String var7 = null;
        int var3 = 0;
        jm var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_E = param0;
            this.field_F = new ag(qn.field_lb, (wc) null);
            this.field_F.field_r = (pf) ((Object) new mm());
            var7 = tj.a(125, new String[]{this.g(-7), this.g((byte) 94)}, ud.field_r);
            var3 = 20;
            var4 = new jm(ia.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_c.field_C, -1, 2147483647, true);
            this.field_J = new ej(var7, var4);
            this.field_J.field_q = "";
            this.field_J.a(0, 0, mm.field_s);
            this.field_J.a(1, 0, mm.field_s);
            this.field_J.field_o = (wc) (this);
            this.field_J.field_v = -40 + this.field_v;
            this.field_J.a(26, (byte) -4, this.field_v - 40, var3);
            var3 = var3 + (this.field_J.field_k - -15);
            this.c(-111, this.field_J);
            var5 = 4;
            var6 = 200;
            this.field_F.a(40, var3, var6, 300 - var6 >> 1210249057, -69);
            this.field_F.field_o = (wc) (this);
            this.c(-109, this.field_F);
            this.a(var5 + (var3 + 55), 0, 300, 0, -67);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(byte param0, int param1) {
        if (!(0 != param1)) {
            return 12176339;
        }
        if (-2 == (param1 ^ -1)) {
            return 11731378;
        }
        int var2 = 18 / ((param0 - 8) / 44);
        if (!((param1 ^ -1) != -4)) {
            return 12246236;
        }
        if (4 == param1) {
            return 14869724;
        }
        if (!((param1 ^ -1) != -6)) {
            return 6716006;
        }
        if ((param1 ^ -1) == -7) {
            return 17408;
        }
        if (-8 == (param1 ^ -1)) {
            return 9938607;
        }
        if (8 == param1) {
            return 13404415;
        }
        return 4227104;
    }

    static {
        field_H = "Accept unrated rematch";
        field_I = new aj(14, 0, 4, 1);
        field_K = 0;
    }
}
