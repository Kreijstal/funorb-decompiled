/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends pt implements he {
    private rj field_tb;
    private boolean field_sb;
    static String field_kb;
    private boolean field_wb;
    static v field_ob;
    private boolean field_mb;
    static int field_pb;
    static int[] field_lb;
    private boolean field_qb;
    static String field_vb;
    static int field_ub;
    static ru[] field_rb;
    private ka field_nb;

    final static void a(tc param0, tc param1, boolean param2) {
        tc var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1.field_j != null) {
                param1.d(76);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_j = param0;
              param1.field_b = param0.field_b;
              param1.field_j.field_b = param1;
              param1.field_b.field_j = param1;
              if (param2) {
                break L2;
              } else {
                var4 = (tc) null;
                ro.a((tc) null, (tc) null, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ro.SA(");

            if (param0 == null) {
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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -12215) {
                break L1;
              } else {
                field_pb = 103;
                break L1;
              }
            }
            if (-14 != (param1 ^ -1)) {
              stackIn_6_0 = super.a(param0, param1, param2, -12215);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.b(true);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ro.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    ro(gk param0, ka param1, String param2, boolean param3, boolean param4) {
        super(param0, new ad((ro) null, param1, param2), 77, 10, 10);
        try {
            this.field_qb = false;
            this.field_mb = param3 ? true : false;
            this.field_wb = false;
            this.field_sb = param4 ? true : false;
            this.field_nb = param1;
            this.field_tb = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_tb.field_R = true;
            this.a((byte) 10, (kb) (this.field_tb));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0) {
        if (this.field_L) {
          if (param0) {
            this.field_L = false;
            if (!this.field_mb) {
              if (this.field_sb) {
                of.d((byte) -24);
                return;
              } else {
                return;
              }
            } else {
              ns.d((byte) 83);
              return;
            }
          } else {
            field_rb = (ru[]) null;
            this.field_L = false;
            if (!this.field_mb) {
              if (!this.field_sb) {
                return;
              } else {
                of.d((byte) -24);
                return;
              }
            } else {
              ns.d((byte) 83);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_ob = null;
        field_rb = null;
        if (param0 != 0) {
            return;
        }
        field_kb = null;
        field_vb = null;
    }

    final static boolean b(int param0, byte param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var20;
        String var51;
        String var52;
        String var53;
        String var54;
        Object var55;
        CharSequence var56;
        L0: {
          var55 = null;
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 1;
          if (cu.field_c) {
            break L0;
          } else {
            if (null != eu.field_g) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (0 != rs.field_t) {
            break L1;
          } else {
            if (null == no.field_K) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (rs.field_t != 2) {
            break L2;
          } else {
            if (!vu.j(6)) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (-85 == (rs.field_q ^ -1)) {
          if (var3 != 0) {
            if ((qj.field_C.length() ^ -1) < -1) {
              var4_ref_String = qj.field_C.toString();
              if (kg.a(var4_ref_String, param1 + 134)) {
                var13 = (String) null;
                var12 = (String) null;
                ta.a((String) null, 2, -18119, (String) null, rl.field_y, 0);
                var15 = (String) null;
                var14 = (String) null;
                ta.a((String) null, 2, -18119, (String) null, g.field_a, 0);
                rd.b(8445);
                return true;
              } else {
                var5 = rs.field_t;
                if (-1 == (var5 ^ -1)) {
                  L3: {
                    if (null != vu.field_M) {
                      var5 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (kp.a(var5, param1 ^ -97) != 2) {
                    it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                    rd.b(8445);
                    return true;
                  } else {
                    ud.b(1, false, var5, param2);
                    it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                    rd.b(8445);
                    return true;
                  }
                } else {
                  L4: {
                    if (kp.a(var5, param1 ^ -97) != 2) {
                      it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                      rd.b(8445);
                      break L4;
                    } else {
                      ud.b(1, false, var5, param2);
                      it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                      rd.b(8445);
                      break L4;
                    }
                  }
                  return true;
                }
              }
            } else {
              rd.b(8445);
              return true;
            }
          } else {
            if (0 == rs.field_t) {
              return true;
            } else {
              rd.b(8445);
              return true;
            }
          }
        } else {
          if (85 != rs.field_q) {
            var4 = ui.field_i;
            if (!uu.a(true, (char) var4)) {
              if (param1 == -59) {
                return false;
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                if ((qj.field_C.length() ^ -1) > -81) {
                  discarded$0 = qj.field_C.append((char) var4);
                  var5 = 485;
                  var17 = mv.field_d;
                  var16 = nt.a(param1 + -47, var17);
                  var18 = var16;
                  if (-3 == (rs.field_t ^ -1)) {
                    var56 = (CharSequence) ((Object) qd.field_G);
                    var20 = fo.a(4800, ta.field_Q, new String[]{ug.a(16, var56)});
                    var8 = fo.a(4800, ov.field_l, new String[]{var16});
                    var9 = tc.field_e.a(var20);
                    var10 = tc.field_e.a(var8);
                    if (var9 <= var10) {
                      var5 = var5 - var10;
                      if (tc.field_e.a(qj.field_C.toString()) > var5) {
                        up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      L5: {
                        var5 = var5 - var9;
                        if (tc.field_e.a(qj.field_C.toString()) > var5) {
                          up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return true;
                    }
                  } else {
                    var7 = "";
                    if (0 == rs.field_t) {
                      L6: {
                        if (null != vu.field_M) {
                          break L6;
                        } else {
                          if (!bq.field_c) {
                            break L6;
                          } else {
                            var7 = "[" + sa.field_c + "] ";
                            break L6;
                          }
                        }
                      }
                      if (vu.field_M != null) {
                        if (mt.field_f) {
                          if (ur.field_C != null) {
                            L7: {
                              var52 = "[" + ur.field_C + "] ";
                              var53 = var52 + var18 + ": ";
                              var5 = var5 - tc.field_e.a(var53);
                              if (tc.field_e.a(qj.field_C.toString()) > var5) {
                                up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            return true;
                          } else {
                            L8: {
                              var7 = "[" + fo.a(param1 ^ -4859, cv.field_m, new String[]{vu.field_M.field_rc}) + "] ";
                              var54 = var7 + var18 + ": ";
                              var5 = var5 - tc.field_e.a(var54);
                              if (tc.field_e.a(qj.field_C.toString()) > var5) {
                                up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            return true;
                          }
                        } else {
                          L9: {
                            var7 = "[" + fo.a(param1 ^ -4859, cv.field_m, new String[]{vu.field_M.field_rc}) + "] ";
                            var54 = var7 + var18 + ": ";
                            var5 = var5 - tc.field_e.a(var54);
                            if (tc.field_e.a(qj.field_C.toString()) > var5) {
                              up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          return true;
                        }
                      } else {
                        L10: {
                          var54 = var7 + var18 + ": ";
                          var5 = var5 - tc.field_e.a(var54);
                          if (tc.field_e.a(qj.field_C.toString()) > var5) {
                            up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return true;
                      }
                    } else {
                      L11: {
                        var51 = var7 + var18 + ": ";
                        var5 = var5 - tc.field_e.a(var51);
                        if (tc.field_e.a(qj.field_C.toString()) > var5) {
                          up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            if (var3 != 0) {
              if ((qj.field_C.length() ^ -1) < -1) {
                up.a(' ', -1 + qj.field_C.length(), qj.field_C, true);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    public void a(int param0, int param1, int param2, int param3, fw param4) {
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
              if (this.field_wb) {
                gl.a(122, 3);
                this.b(true);
                break L1;
              } else {
                ra.a(ag.d((byte) -125), -113, "tochangedisplayname.ws");
                break L1;
              }
            }
            L2: {
              if (param1 == 11) {
                break L2;
              } else {
                ro.n(46);
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

            stackIn_8_1 = new StringBuilder().append("ro.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void o(int param0) {
        ad var2;
        if (param0 != 4259) {
          return;
        } else {
          this.field_tb.c(4210752, 2121792, 27178);
          var2 = new ad((ro) (this), this.field_nb, va.field_B);
          var2.a(sa.field_b, 15, 1);
          this.a(var2, (byte) -108);
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ad stackIn_12_0 = null;
        ad stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ad var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_qb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_qb = true;
                stackIn_6_0 = this;

                if (-257 != (param0 ^ -1)) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((ro) (this)).field_wb = stackIn_7_1 != 0;
                this.field_tb.c(4210752, 8405024, 27178);
                var6 = new ad((ro) (this), this.field_nb, param2);
                var4 = var6;
                if (5 == param0) {
                  var6.a(me.field_d, 11, 1);
                  var6.a(dt.field_c, 17, param1 ^ 99);
                  break L2;
                } else {
                  if (param0 != 256) {
                    L3: {
                      stackIn_12_0 = (ad) (var6);

                      if (this.field_mb) {
                        stackIn_13_0 = (ad) ((Object) stackIn_12_0);
                        stackIn_13_1 = a.field_k;
                        break L3;
                      } else {
                        stackIn_13_0 = (ad) ((Object) stackIn_12_0);
                        stackIn_13_1 = fj.field_a;
                        break L3;
                      }
                    }
                    ((ad) (Object) stackIn_13_0).a(stackIn_13_1, -1, param1 ^ 99);
                    break L2;
                  } else {
                    var6.a(a.field_k, (qo) (this), (byte) -89);
                    break L2;
                  }
                }
              }
              L4: {
                if ((param0 ^ -1) == -4) {
                  var6.a(te.field_m, 7, 1);
                  break L4;
                } else {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) != -7) {
                      if (param0 != 9) {
                        break L4;
                      } else {
                        var6.a(iu.field_b, (qo) (this), (byte) -55);
                        break L4;
                      }
                    } else {
                      var6.a(ag.field_O, 9, 1);
                      break L4;
                    }
                  } else {
                    var6.a(nf.field_Jb, 8, 1);
                    break L4;
                  }
                }
              }
              this.a(var6, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4_ref);

            stackIn_27_1 = new StringBuilder().append("ro.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_kb = "Continue";
        field_ub = 0;
    }
}
