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
            Exception var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2_ref2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    int discarded$1 = -87;
                    param1.getAppletContext().showDocument(rh.a(var2_ref2, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref;
                stackOut_7_1 = new StringBuilder().append("le.C(").append(126).append(',');
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L3;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        try {
            em.a(param4, ((le) this).field_a, param1, param0, 24599, param2);
            if (!param3) {
                field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "le.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String b() {
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
        String stackIn_65_0 = null;
        Object stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_64_0 = null;
        String stackOut_62_0 = null;
        Object stackOut_102_0 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            var1 = null;
            var2 = null;
            L1: {
              if (vk.field_g != 0) {
                break L1;
              } else {
                if (null == ib.field_d) {
                  break L1;
                } else {
                  var2 = (Object) (Object) lc.field_l;
                  break L1;
                }
              }
            }
            L2: {
              if (vk.field_g != 2) {
                break L2;
              } else {
                int discarded$2 = 75;
                if (!jd.b()) {
                  L3: {
                    L4: {
                      if (!ah.a(ec.field_f, 75)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) oc.a(el.field_x, new String[1], (byte) -57);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) oc.a(r.field_Fb, new String[1], (byte) -69);
                    break L3;
                  }
                  if (an.field_c) {
                    int discarded$3 = 0;
                    lc.a((String) null, (String) null, 2, 0, (String) var2);
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
                    var2 = (Object) (Object) dk.field_e;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                fj.a((String) var2, 0, -1, (String) null, uh.field_l);
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
                    if (var6 != 2) {
                      break L8;
                    } else {
                      L9: {
                        var4 = oc.a(vf.field_d, new String[1], (byte) -97);
                        var8 = oc.a(sa.field_d, new String[1], (byte) -110);
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
                            var4 = "[" + oc.a(fb.field_D, new String[1], (byte) -112) + "] ";
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
                      stackOut_64_0 = "<img=3>: ";
                      stackIn_65_0 = stackOut_64_0;
                      break L15;
                    } else {
                      stackOut_62_0 = ": ";
                      stackIn_65_0 = stackOut_62_0;
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
                        if (~var9 < ~(-eg.field_f.field_U + hn.field_k)) {
                          if (qf.field_b) {
                            var1 = (Object) (Object) "Broken!";
                            break L18;
                          } else {
                            var1 = (Object) (Object) cn.field_e;
                            break L18;
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (eg.field_f.field_L == 0) {
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
                    var1 = (Object) (Object) oc.a(vk.field_h, new String[2], (byte) -50);
                    break L20;
                  }
                }
                break L6;
              }
            }
            stackOut_102_0 = var1;
            stackIn_103_0 = stackOut_102_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw fk.a((Throwable) var1, "le.B(" + 93 + ')');
        }
        return (String) (Object) stackIn_103_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            field_c = null;
            field_e = null;
            field_d = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "le.A(" + -485 + ')');
        }
    }

    le(km[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((le) this).field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("le.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int var10 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        String stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        String stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        le stackOut_23_0 = null;
        le stackOut_21_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        var10 = Chess.field_G;
        try {
          L0: {
            var1_int = -vh.field_g + tf.field_o;
            vh.field_g = -(var1_int >> 1) + of.field_k;
            tf.field_o = var1_int + vh.field_g;
            id.field_c = -(bd.field_d >> 1) + pd.field_Fb;
            var2 = id.field_c;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= bd.field_e.length) {
                    break L3;
                  } else {
                    var4 = ec.field_l[var3];
                    stackOut_3_0 = 0;
                    stackOut_3_1 = var4;
                    stackIn_33_0 = stackOut_3_0;
                    stackIn_33_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 > stackIn_4_1) {
                            break L5;
                          } else {
                            L6: {
                              if (~nj.field_u.field_h != ~var4) {
                                break L6;
                              } else {
                                var5 = cm.field_w;
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var5 = ni.field_d;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5 = qb.field_b;
                        break L4;
                      }
                      L7: {
                        var6 = bd.field_e[var3];
                        stackOut_13_0 = (String) var6;
                        stackOut_13_1 = 26;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (0 > var4) {
                          stackOut_16_0 = (String) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L7;
                        } else {
                          stackOut_14_0 = (String) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L7;
                        }
                      }
                      L8: {
                        var7 = in.a(stackIn_17_0, stackIn_17_1, stackIn_17_2 != 0);
                        var8 = of.field_k + -(var7 >> 1);
                        if (var4 >= 0) {
                          L9: {
                            if (~nj.field_u.field_h == ~var4) {
                              stackOut_23_0 = ig.field_b;
                              stackIn_24_0 = stackOut_23_0;
                              break L9;
                            } else {
                              stackOut_21_0 = uc.field_g;
                              stackIn_24_0 = stackOut_21_0;
                              break L9;
                            }
                          }
                          L10: {
                            var9 = stackIn_24_0;
                            var2 = var2 + mf.field_z;
                            if (var9 == null) {
                              break L10;
                            } else {
                              var9.a(-gm.field_e + var8, var7 + (gm.field_e << 1), (fh.field_e << 1) + ug.field_a, true, var2);
                              break L10;
                            }
                          }
                          var2 = var2 + fh.field_e;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L11: {
                        L12: {
                          if (var4 < 0) {
                            break L12;
                          } else {
                            vl.field_M.a(var6, var8, var2 + th.field_a, var5, -1);
                            var2 = var2 + (ug.field_a + (mf.field_z + fh.field_e));
                            if (var10 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        sj.field_d.a(var6, var8, var2 + jb.field_f, var5, -1);
                        var2 = var2 + qd.field_r;
                        break L11;
                      }
                      var3++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_32_0 = -115;
                stackOut_32_1 = -64;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                break L2;
              }
              L13: {
                if (stackIn_33_0 <= stackIn_33_1) {
                  break L13;
                } else {
                  field_c = null;
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "le.E(" + -115 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Breaking real-world laws";
        field_g = new jd("usename");
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
