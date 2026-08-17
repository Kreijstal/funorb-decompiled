/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    private String field_c;
    private wk field_b;
    private int field_p;
    private ru[] field_i;
    private dl field_h;
    private String[] field_k;
    static byte[][] field_d;
    private int field_n;
    private int field_l;
    private wk field_t;
    private int field_r;
    private wk field_m;
    static int field_a;
    private boolean field_s;
    private int field_f;
    static String field_e;
    static gu field_g;
    private int field_q;
    static String field_o;
    static String field_j;

    public static void b(int param0) {
        try {
            field_g = null;
            field_o = null;
            field_d = (byte[][]) null;
            field_e = null;
            field_j = null;
            if (param0 != -8616) {
                oo.b(85);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "oo.E(" + param0 + ')');
        }
    }

    private final void a(String param0, byte param1, ru[] param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
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
                  if (!vv.a(-84, (CharSequence) ((Object) var7))) {
                    break L2;
                  } else {
                    this.field_r = dq.a(param1 + 2, (CharSequence) ((Object) var7));
                    break L1;
                  }
                }
              }
              this.field_r = 2;
              break L1;
            }
            this.field_c = param0;
            this.field_h = new dl(2);
            this.field_k = param5;
            if (param1 == 71) {
              L3: {
                this.field_i = param2;
                if (null == this.field_i) {
                  break L3;
                } else {
                  if (3 > this.field_i.length) {
                    break L3;
                  } else {
                    mk.field_h = param4;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException("");
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7_ref);

            stackIn_17_1 = new StringBuilder().append("oo.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);

            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);

            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);

            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_l = this.field_l + 65536;
            L1: while (true) {
              if (ev.b(-101, qk.field_d, this.field_l) < 65536) {
                L2: {
                  if (param1 <= -95) {
                    break L2;
                  } else {
                    var7 = (int[]) null;
                    this.a((wk) null, 114, -82, (String) null, (ka) null, (int[]) null, 110, 33, 0, 0.8778258562088013f);
                    break L2;
                  }
                }
                L3: {
                  var3_int = -1;
                  if (this.field_i != null) {
                    var3_int = this.field_i.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var3_int != -1) {
                    L5: {
                      if (qk.field_c > this.field_p) {
                        L6: {
                          this.field_p = this.field_p + 1;
                          if (this.field_p <= qk.field_a) {
                            break L6;
                          } else {
                            L7: {
                              if (null == this.field_i) {
                                break L7;
                              } else {
                                if (this.field_i[this.field_n] == null) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_p = this.field_p - 1;
                            break L5;
                          }
                        }
                        if (qk.field_c > this.field_p) {
                          break L5;
                        } else {
                          if (this.field_i[(this.field_n - -1) % var3_int] == null) {
                            this.field_p = this.field_p - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (this.field_p < qk.field_c) {
                        break L8;
                      } else {
                        this.field_q = this.field_n;
                        this.field_p = this.field_p - qk.field_c;
                        if (this.field_s) {
                          this.field_n = this.field_n + 1;
                          if (var3_int > this.field_n) {
                            break L8;
                          } else {
                            this.field_n = this.field_n - var3_int;
                            break L8;
                          }
                        } else {
                          this.field_n = this.field_n - 1;
                          if (0 > this.field_n) {
                            this.field_n = this.field_n + var3_int;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (this.field_p <= qk.field_a) {
                      break L4;
                    } else {
                      this.field_s = true;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L9: {
                  if (null == mg.field_d) {
                    break L9;
                  } else {
                    L10: {
                      var4 = 0;
                      if (tr.field_A == 0) {
                        break L10;
                      } else {
                        if ((ur.field_z ^ -1) >= -258) {
                          break L10;
                        } else {
                          if (290 > ur.field_z) {
                            L11: {
                              if (9 >= iu.field_t) {
                                break L11;
                              } else {
                                if (82 > iu.field_t) {
                                  var4 = 1;
                                  this.field_p = qk.field_c;
                                  this.field_s = false;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (558 >= iu.field_t) {
                              break L10;
                            } else {
                              if (631 <= iu.field_t) {
                                break L10;
                              } else {
                                var4 = 1;
                                this.field_p = qk.field_c;
                                this.field_s = true;
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (this.field_p <= qk.field_a) {
                        break L9;
                      } else {
                        if (257 >= ur.field_z) {
                          break L9;
                        } else {
                          if (290 <= ur.field_z) {
                            break L9;
                          } else {
                            L12: {
                              if ((sm.field_d ^ -1) >= -10) {
                                break L12;
                              } else {
                                if (-83 < (sm.field_d ^ -1)) {
                                  this.field_p = qk.field_a;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (558 >= sm.field_d) {
                              break L9;
                            } else {
                              if (631 > sm.field_d) {
                                this.field_p = qk.field_a;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (!param0) {
                    break L13;
                  } else {
                    L14: {
                      this.field_h.a(0, this.a(iu.field_t, ur.field_z, -387), this.a(sm.field_d, ko.field_b, -387));
                      var4 = 0;
                      if (!this.field_h.d((byte) 96)) {
                        break L14;
                      } else {
                        L15: {
                          if (0 == this.field_h.field_h) {
                            var4 = 1;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (this.field_h.field_h != 1) {
                          break L14;
                        } else {
                          stackIn_73_0 = 2;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    L16: {
                      if (!mk.field_h) {
                        break L16;
                      } else {
                        L17: while (true) {
                          if (!jd.i((byte) -71)) {
                            break L16;
                          } else {
                            var5 = this.c(127);
                            if (0 != var5) {
                              stackIn_80_0 = var5;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L13;
                    } else {
                      this.b((byte) -92);
                      stackIn_84_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_86_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_l = this.field_l - qk.field_d;
                this.field_f = this.field_f + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "oo.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_73_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_80_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_84_0;
            } else {
              return stackIn_86_0;
            }
          }
        }
    }

    private final void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  rf.a(32767, ag.d((byte) 73));
                  if (param0 < -84) {
                    break L2;
                  } else {
                    this.field_n = 29;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (Exception) (Object) decompiledCaughtException;
                var2.printStackTrace();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "oo.A(" + param0 + ')');
        }
    }

    private final int c(int param0) {
        int discarded$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 126) {
                break L1;
              } else {
                discarded$1 = this.c(-121);
                break L1;
              }
            }
            L2: {
              this.field_h.b((byte) -120);
              if (!this.field_h.d((byte) 73)) {
                break L2;
              } else {
                if (this.field_h.field_h != 0) {
                  if (-2 == (this.field_h.field_h ^ -1)) {
                    stackIn_10_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  this.b((byte) -95);
                  stackIn_5_0 = 3;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (-14 != (rs.field_q ^ -1)) {
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_13_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "oo.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    private final void a(int[] param0, int param1, String param2, int param3, ka param4, byte param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            rq.a((byte) -56);
            var9_int = param7;
            L1: while (true) {
              if (var9_int >= param6) {
                L2: {
                  rf.b(-18862);
                  if (param5 >= 62) {
                    break L2;
                  } else {
                    field_e = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                qn.f(param3, var9_int, param1, var9_int + 1);
                var10 = var9_int * param0.length / param6;
                var11 = param0[param0.length - var10 + -1];
                param4.a(param2, param3, param7, param1, param6, var11, -1, 1, 1, 0);
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var9);

            stackIn_12_1 = new StringBuilder().append("oo.J(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);

            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);

            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            qn.a(9, 9, 622, 47, 4540749, 65793);
            qn.f(9, 257, 622, 33, 2585);
            qn.a(9, 265, 622, 11, 2585, 1515566);
            var2_int = 0;
            var3 = 14;
            L1: while (true) {
              if (4 <= var2_int) {
                L2: {
                  var2_int = 0;
                  if (param0 >= 106) {
                    break L2;
                  } else {
                    this.a((byte) -43);
                    break L2;
                  }
                }
                var3 = 299;
                L3: while (true) {
                  if (var2_int >= 2) {
                    L4: {
                      this.d(1439);
                      if (null == iw.field_p) {
                        break L4;
                      } else {
                        if (!iw.field_p.a((byte) 82)) {
                          break L4;
                        } else {
                          if (!iw.field_p.a(28979, "members_expansion_screen")) {
                            break L4;
                          } else {
                            if (!iw.field_p.a(28979, "arialish12")) {
                              break L4;
                            } else {
                              if (!iw.field_p.a(28979, "pump32")) {
                                break L4;
                              } else {
                                if (bh.field_H == null) {
                                  break L4;
                                } else {
                                  if (!bh.field_H.a((byte) 82)) {
                                    break L4;
                                  } else {
                                    if (!bh.field_H.a(28979, "arialish12")) {
                                      break L4;
                                    } else {
                                      if (!bh.field_H.a(28979, "pump32")) {
                                        break L4;
                                      } else {
                                        mc.field_a = pv.a("members_expansion_screen", "frame", iw.field_p, 24914);
                                        mg.field_d = ic.a("arrow", (byte) 51, "members_expansion_screen", iw.field_p);
                                        ll.field_Sb = gs.a("arialish12", iw.field_p, bh.field_H, (byte) -53, "");
                                        kt.field_n = it.a("", iw.field_p, bh.field_H, (byte) -87, "pump32");
                                        hr.field_b = nh.a("benefit_orbs", "members_expansion_screen", iw.field_p, false);
                                        ar.field_D = nh.a("button_text", "members_expansion_screen", iw.field_p, false);
                                        nh.field_G = ac.a(iw.field_p, "button_highlights", (byte) -4, "members_expansion_screen");
                                        bh.field_H = null;
                                        iw.field_p = null;
                                        break L4;
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
                    this.a((byte) -124);
                    if (mc.field_a != null) {
                      L5: {
                        this.field_b.g(376, 339);
                        this.field_t.g(9, 9);
                        mc.field_a.a(0, 0);
                        if (mg.field_d != null) {
                          mg.field_d.g(9, 257);
                          mg.field_d.d(558, 257);
                          if ((ko.field_b ^ -1) >= -258) {
                            break L5;
                          } else {
                            if ((ko.field_b ^ -1) <= -291) {
                              break L5;
                            } else {
                              var2_int = (40 * sr.c(this.field_f << -1173839804, 127) >> 263324176) + 40;
                              if ((var2_int ^ -1) >= -1) {
                                break L5;
                              } else {
                                L6: {
                                  if (-10 <= (sm.field_d ^ -1)) {
                                    break L6;
                                  } else {
                                    if (sm.field_d < 82) {
                                      mg.field_d.f(8, 256, var2_int);
                                      mg.field_d.f(10, 256, var2_int);
                                      mg.field_d.f(8, 258, var2_int);
                                      mg.field_d.f(10, 258, var2_int);
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if ((sm.field_d ^ -1) >= -559) {
                                  break L5;
                                } else {
                                  if ((sm.field_d ^ -1) > -632) {
                                    mg.field_d.h();
                                    mg.field_d.f(557, 256, var2_int);
                                    mg.field_d.f(559, 256, var2_int);
                                    mg.field_d.f(557, 258, var2_int);
                                    mg.field_d.f(559, 258, var2_int);
                                    mg.field_d.h();
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      L7: {
                        this.field_m.g(16, 302);
                        ll.field_Sb.a(this.field_k[this.field_n], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                        hr.field_b.g(30, 330);
                        ll.field_Sb.a(db.field_e[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ll.field_Sb.a(db.field_e[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ll.field_Sb.a(db.field_e[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ar.field_D.g((127 - ar.field_D.field_A) / 2 + 508, 315);
                        if (0 != this.field_h.field_h) {
                          if ((this.field_h.field_h ^ -1) == -2) {
                            nh.field_G[1].g(508, 387);
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          nh.field_G[0].g(508, 299);
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    qn.a(508, var3, 127, 42, 1130115, 3365268);
                    qn.f(508, 42 + var3, 127, 42, 12410);
                    var3 += 91;
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                qn.a(var3, 331, 117, 90, 460551, 3881787);
                var2_int++;
                var3 += 121;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "oo.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ru var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ru var6 = null;
        ru var7 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != this.field_i) {
              L1: {
                if (param0 == 1439) {
                  break L1;
                } else {
                  field_a = -111;
                  break L1;
                }
              }
              L2: {
                var6 = this.field_i[this.field_n];
                var2 = var6;
                if (var2 == null) {
                  if (ll.field_Sb == null) {
                    break L2;
                  } else {
                    ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                    break L2;
                  }
                } else {
                  var6.a(9, 58);
                  break L2;
                }
              }
              L3: {
                if (this.field_p >= qk.field_a) {
                  break L3;
                } else {
                  var7 = this.field_i[this.field_q];
                  var2 = var7;
                  if (var2 != null) {
                    var3 = this.field_p * (var7.field_g - -60) / qk.field_a;
                    var4 = var3 - 30;
                    if (!this.field_s) {
                      rb.a(58, -1708086482, 9, 256 * (var7.field_g + -var4) / 30, var4 * -256 / 30, var7);
                      break L3;
                    } else {
                      rb.a(58, param0 ^ -1708085583, 9, var4 * -256 / 30, 256 * (-var4 + var7.field_g) / 30, var7);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L4: {
                if (null == ll.field_Sb) {
                  break L4;
                } else {
                  ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                  break L4;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "oo.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(wk param0, int param1, int param2, String param3, ka param4, int[] param5, int param6, int param7, int param8, float param9) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        wk var13 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param8 / param9);
              var12 = (int)((float)param7 / param9);
              var13 = new wk(var11_int, var12);
              vn.a(var13, 3);
              if (param6 < -108) {
                break L1;
              } else {
                oo.b(-32);
                break L1;
              }
            }
            param0.c((int)((float)(-param2) / param9), (int)((float)(-param1) / param9), (int)((float)param0.field_y / param9), (int)((float)param0.field_v / param9));
            this.a(param5, var11_int, param3, 0, param4, (byte) 79, var12, 0);
            rf.b(-18862);
            vn.a(param0, 3);
            var13.d(param2, param1, param8, param7);
            rf.b(-18862);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var11);

            stackIn_7_1 = new StringBuilder().append("oo.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (mc.field_a == null) {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-509 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (635 <= param0) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) > -300) {
                      break L1;
                    } else {
                      if (-387 < (param1 ^ -1)) {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                if (-509 < (param0 ^ -1)) {
                  break L2;
                } else {
                  if ((param0 ^ -1) <= -636) {
                    break L2;
                  } else {
                    if (param1 < 390) {
                      break L2;
                    } else {
                      if (475 <= param1) {
                        break L2;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              if (param2 == -387) {
                stackIn_24_0 = -1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_22_0 = -86;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "oo.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        wk var5 = null;
        String var6 = null;
        String var7 = null;
        ka var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_t != null) {
                break L1;
              } else {
                if (null == kt.field_n) {
                  break L1;
                } else {
                  L2: {
                    this.field_t = new wk(622, 47);
                    vn.a(this.field_t, 3);
                    qn.a(0, 0, 622, 47, 4540749, 65793);
                    var2_int = 16448250;
                    var3 = 10068666;
                    var12 = cj.a(var3, var2_int, -60);
                    var11 = var12;
                    var9 = var11;
                    this.a(var12, 622, this.field_c, 0, kt.field_n, (byte) 66, 47, 0);
                    rf.b(-18862);
                    this.field_m = new wk(475, 24);
                    this.a(this.field_m, -4, 0, hr.field_h, kt.field_n, var9, -124, 24, 475, 0.75f);
                    if (param0 < -103) {
                      break L2;
                    } else {
                      var8 = (ka) null;
                      this.a((int[]) null, -60, (String) null, -5, (ka) null, (byte) 31, 126, -81);
                      break L2;
                    }
                  }
                  var10 = cj.a(526344, 526344, 126);
                  var5 = new wk(121, 122);
                  vn.a(var5, 3);
                  qn.a(0, 0, var5.field_y, var5.field_v / 2, 16180917, 16306250);
                  qn.a(0, var5.field_v / 2, var5.field_y, var5.field_v, 16306250, 15568919);
                  var6 = rv.field_a;
                  var7 = wp.field_B;
                  this.a(var5, -16, 0, var6, kt.field_n, var10, -112, var5.field_v, var5.field_y, 0.5f);
                  this.a(var5, 20, 0, var7, kt.field_n, var10, -123, var5.field_v, var5.field_y, 0.5f);
                  this.a(var5, 12 + -kt.field_n.field_H + var5.field_v / 2, 0, qb.field_c[this.field_r], kt.field_n, var10, -125, var5.field_v / 3, var5.field_y, 0.699999988079071f);
                  rf.b(-18862);
                  this.field_b = new wk(121, 122);
                  vn.a(this.field_b, 3);
                  var5.a(this.field_b.field_y / 2, this.field_b.field_v / 2, -2048, 4096);
                  rf.b(-18862);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "oo.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = -43 % ((param6 - 19) / 62);
                var8 = 0;
                if ((sr.a(param3 + -1, param5, 2, (byte) -113) ^ -1) == -3) {
                  break L2;
                } else {
                  if (4 != sr.a(-1 + param3, param5, 2, (byte) -104)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8++;
              break L1;
            }
            L3: {
              L4: {
                if (-3 == (sr.a(param3, 1 + param5, 2, (byte) -113) ^ -1)) {
                  break L4;
                } else {
                  if (-5 != (sr.a(param3, 1 + param5, 2, (byte) -100) ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var8 += 2;
              break L3;
            }
            L5: {
              if ((var8 & 1) > 0) {
                ac.field_k[2].b(-32 + param4, param1 + 10, param0, param2);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var8 & 2 ^ -1) >= -1) {
                break L6;
              } else {
                ac.field_k[2].b(8 + param4, 10 + param1, param0, param2);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "oo.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (rd.field_j != null) {
                oa.a(90, rd.field_j.field_d);
                break L1;
              } else {
                if (bc.field_a != null) {
                  oa.a(102, bc.field_a.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -387) {
                break L2;
              } else {
                field_o = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "oo.D(" + param0 + ')');
        }
    }

    oo(java.applet.Applet param0, String param1, ru[] param2, String[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_l = 0;
        this.field_s = true;
        this.field_f = 0;
        try {
          L0: {
            this.a(param1, (byte) 71, param2, param0, true, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("oo.<init>(");

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
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);

            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);

            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
        field_d = new byte[250][];
        field_e = "Full screen";
        field_g = new gu();
        field_o = "This <%0> is currently wearing <%2>. Are you sure you wish to replace it with <%1>? The <%2> will be lost forever if you do this.";
        field_j = "Try again";
    }
}
