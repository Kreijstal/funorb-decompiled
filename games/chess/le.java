/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static ci field_e;
    static jd field_g;
    private km[] field_a;
    static String field_b;
    static String field_c;
    static String field_d;
    static int field_f;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 >= 107) {
                        break L2;
                      } else {
                        le.a(96);
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(rh.a(var2, param1, (byte) -87), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("le.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        try {
            em.a(param4, this.field_a, param1, param0, 24599, param2);
            if (!param3) {
                field_c = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "le.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String b(byte param0) {
        String stackIn_3_0 = null;
        String stackIn_65_0 = null;
        Object stackIn_103_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Chess.field_G;
        try {
          L0: {
            var1 = null;
            var2 = null;
            if (param0 >= 42) {
              L1: {
                if (-1 != (vk.field_g ^ -1)) {
                  break L1;
                } else {
                  if (null == ib.field_d) {
                    break L1;
                  } else {
                    var2 = lc.field_l;
                    break L1;
                  }
                }
              }
              L2: {
                if ((vk.field_g ^ -1) != -3) {
                  break L2;
                } else {
                  if (!jd.b((byte) 75)) {
                    L3: {
                      L4: {
                        if (!ah.a(ec.field_f, 75)) {
                          break L4;
                        } else {
                          var2 = oc.a(el.field_x, new String[]{ij.field_c}, (byte) -57);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2 = oc.a(r.field_Fb, new String[]{ij.field_c}, (byte) -69);
                      break L3;
                    }
                    if (an.field_c) {
                      lc.a((String) null, (String) null, 2, 0, (String) (var2), false);
                      kf.a(-98);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (var2 != null) {
                  break L5;
                } else {
                  if (fl.field_j) {
                    break L5;
                  } else {
                    if (ac.field_l == null) {
                      var2 = dk.field_e;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (var2 != null) {
                  fj.a((String) (var2), 0, -1, (String) null, uh.field_l);
                  break L6;
                } else {
                  L7: {
                    L8: {
                      var3 = ci.field_J;
                      var3 = on.a(-11307, var3);
                      var4 = "";
                      var5 = "|";
                      var6 = vk.field_g;
                      var7 = 0;
                      if (-3 != (var6 ^ -1)) {
                        break L8;
                      } else {
                        L9: {
                          var4 = oc.a(vf.field_d, new String[]{ij.field_c}, (byte) -97);
                          var8 = oc.a(sa.field_d, new String[]{var3}, (byte) -110);
                          var7 = eg.field_f.field_M - (-uc.field_c.field_M - -485) - (-sc.field_a.b(var8) - -sc.field_a.b(var4));
                          if (var7 < 0) {
                            var7 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L10: {
                      if (var6 == 0) {
                        L11: {
                          if (pd.field_Rb != null) {
                            break L11;
                          } else {
                            if (dn.field_b) {
                              var4 = "[" + ja.field_c + "] ";
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (pd.field_Rb != null) {
                          L12: {
                            L13: {
                              L14: {
                                if (!qj.field_d) {
                                  break L14;
                                } else {
                                  if (kb.field_P != null) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var4 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -112) + "] ";
                              if (var10 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                            var4 = "[" + kb.field_P + "] ";
                            break L12;
                          }
                          var6 = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L15: {
                      if (!wk.a((byte) 119)) {
                        stackIn_65_0 = "<img=3>: ";
                        break L15;
                      } else {
                        stackIn_65_0 = ": ";
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var8 = stackIn_65_0;
                        var4 = var4 + var3 + var8;
                        if (qf.field_b) {
                          break L17;
                        } else {
                          if (kh.field_o) {
                            var4 = "<col=999999>" + var4 + cn.field_e + "</col>";
                            var5 = "";
                            if (var10 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      var4 = "<col=999999>" + var4 + a.field_e + "</col>";
                      var5 = "";
                      break L16;
                    }
                    var9 = sc.field_a.b(var4);
                    if (wk.a((byte) 118)) {
                      break L7;
                    } else {
                      L18: {
                        if (!eg.field_f.field_F) {
                          break L18;
                        } else {
                          if ((var9 ^ -1) < (-eg.field_f.field_U + hn.field_k ^ -1)) {
                            if (qf.field_b) {
                              var1 = "Broken!";
                              break L18;
                            } else {
                              var1 = cn.field_e;
                              break L18;
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (-1 == (eg.field_f.field_L ^ -1)) {
                        break L7;
                      } else {
                        if (eg.field_f.field_qb >= var9) {
                          break L7;
                        } else {
                          if (qf.field_b) {
                            break L7;
                          } else {
                            sh.a(false);
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L19: {
                    fj.a(var4 + lh.a(sg.field_c.toString()), var7, -1, var5, vm.field_i[var6]);
                    if (!kn.field_L) {
                      uc.field_c.field_F = false;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (!uc.field_c.field_F) {
                      break L20;
                    } else {
                      var1 = oc.a(vk.field_h, new String[]{var3, ij.field_c}, (byte) -50);
                      break L20;
                    }
                  }
                  break L6;
                }
              }
              stackIn_103_0 = var1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (var1), "le.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_103_0);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -485) {
            return;
        }
        try {
            field_c = null;
            field_e = null;
            field_d = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "le.A(" + param0 + ')');
        }
    }

    le(km[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("le.<init>(");

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        String stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        le stackIn_24_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = -vh.field_g + tf.field_o;
                        vh.field_g = -(var1_int >> 510459617) + of.field_k;
                        tf.field_o = var1_int + vh.field_g;
                        id.field_c = -(bd.field_d >> -920076767) + pd.field_Fb;
                        var2 = id.field_c;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= bd.field_e.length) {
                            statePc = 32;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = ec.field_l[var3];
                        stackIn_33_0 = 0;
                        stackIn_4_0 = stackIn_33_0;
                        stackIn_33_1 = var4;
                        stackIn_4_1 = stackIn_33_1;
                        if (var10 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 > stackIn_4_1) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((nj.field_u.field_h ^ -1) != (var4 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = cm.field_w;
                        if (var10 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = ni.field_d;
                        if (var10 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = qb.field_b;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = bd.field_e[var3];
                        stackIn_16_0 = (String) (var6);
                        stackIn_14_0 = stackIn_16_0;
                        stackIn_16_1 = 26;
                        stackIn_14_1 = stackIn_16_1;
                        if (0 > var4) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = (String) ((Object) stackIn_14_0);
                        stackIn_17_1 = stackIn_14_1;
                        stackIn_17_2 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = (String) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = in.a(stackIn_17_0, stackIn_17_1, stackIn_17_2 != 0);
                        var8 = of.field_k + -(var7 >> -594478431);
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((nj.field_u.field_h ^ -1) == (var4 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = uc.field_g;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = ig.field_b;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 = stackIn_24_0;
                        var2 = var2 + mf.field_z;
                        if (var9 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9.a(-gm.field_e + var8, var7 + (gm.field_e << -516381503), (fh.field_e << -2091089887) + ug.field_a, true, var2);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var2 = var2 + fh.field_e;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 < (var4 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        vl.field_M.a(var6, var8, var2 + th.field_a, var5, -1);
                        var2 = var2 + (ug.field_a + (mf.field_z + fh.field_e));
                        if (var10 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        sj.field_d.a(var6, var8, var2 + jb.field_f, var5, -1);
                        var2 = var2 + qd.field_r;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param0;
                        stackIn_33_1 = -64;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= stackIn_33_1) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        field_c = (String) null;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) var1), "le.E(" + param0 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Breaking real-world laws";
        field_g = new jd("usename");
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
