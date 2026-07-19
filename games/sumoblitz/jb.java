/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jb extends se {
    private String field_f;
    private long field_g;
    static int field_e;
    static int field_h;

    final void a(fs param0, byte param1) {
        RuntimeException runtimeException = null;
        fs var4 = null;
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
              param0.a(false, this.field_g);
              param0.a(this.field_f, 27);
              if (param1 <= -107) {
                break L1;
              } else {
                var4 = (fs) null;
                this.a((fs) null, (byte) -83);
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
            stackOut_3_1 = new StringBuilder().append("jb.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static String a(fs param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.e(false);
                  if (var3_int > param1) {
                    var3_int = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_p = param0.field_p + ga.field_g.a(0, param0.field_p, var4, 116, var3_int, param0.field_n);
                var5 = sd.a(var4, 0, var3_int, 26564);
                if (param2 == -14832) {
                  stackOut_6_0 = (String) (var5);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  stackOut_4_0 = (String) null;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackOut_8_0 = "Cabbage";
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("jb.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            int var4 = 0;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                bf.field_d = param1;
                try {
                  L1: {
                    L2: {
                      L3: {
                        var4 = 82 / ((param0 - -62) / 49);
                        var7 = param2.getParameter("cookieprefix");
                        var6 = var7;
                        var6 = var7;
                        var5 = param2.getParameter("cookiehost");
                        var6 = var5;
                        var6 = var5;
                        var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var5;
                        var6 = var8;
                        var6 = var8;
                        var6 = var8;
                        if (param1.length() != 0) {
                          break L3;
                        } else {
                          var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!Sumoblitz.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6 = var6 + "; Expires=" + fi.a(94608000000L + wq.a(-6), true) + "; Max-Age=" + 94608000L;
                      break L2;
                    }
                    tw.a("document.cookie=\"" + var6 + "\"", -15428, param2);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                va.a(false, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var3_ref);
                stackOut_9_1 = new StringBuilder().append("jb.D(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2, boolean param3, int param4, String param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            Object discarded$10 = null;
            Object discarded$11 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_106_0 = 0;
            int stackIn_108_0 = 0;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            String stackIn_112_2 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            String stackIn_115_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_107_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            String stackOut_111_2 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            String stackOut_114_2 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            var9 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                if (param2 >= 15) {
                  L1: {
                    if (qk.field_O != null) {
                      break L1;
                    } else {
                      if (!nd.a((byte) -34, param3)) {
                        stackOut_7_0 = -1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector1 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (kw.field_c != gg.field_t) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (param3) {
                            break L4;
                          } else {
                            kb.field_d = os.a(false, param0, param5, (byte) -94);
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var10 = (String) null;
                        kb.field_d = ds.a(lb.field_a, false, (String) null, param5, false);
                        break L3;
                      }
                      as.field_v.field_p = 0;
                      as.field_v.b((byte) 42, 14);
                      as.field_v.b((byte) 96, kb.field_d.a((byte) 126).field_c);
                      gt.a(0, -1);
                      kw.field_c = gi.field_g;
                      break L2;
                    }
                  }
                  L5: {
                    if (kw.field_c != gi.field_g) {
                      break L5;
                    } else {
                      if (!ju.b(-1, 1)) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var6_int = ig.field_a.e(-31302);
                            if (var6_int != 0) {
                              break L7;
                            } else {
                              kw.field_c = sc.field_q;
                              if (var9 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          iw.field_a = var6_int;
                          gu.field_d = -1;
                          kw.field_c = sp.field_z;
                          break L6;
                        }
                        ig.field_a.field_p = 0;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (kw.field_c != sc.field_q) {
                      break L8;
                    } else {
                      if (!ju.b(-1, 8)) {
                        break L8;
                      } else {
                        oc.field_g = ig.field_a.a((byte) 127);
                        ig.field_a.field_p = 0;
                        fb.a(param3, param1, -12793, param4, kb.field_d);
                        kw.field_c = jj.field_f;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (kw.field_c == jj.field_f) {
                      if (!ju.b(-1, 1)) {
                        break L9;
                      } else {
                        L10: {
                          L11: {
                            var6_int = ig.field_a.e(-31302);
                            iw.field_a = var6_int;
                            ig.field_a.field_p = 0;
                            rp.field_b = null;
                            if (var6_int == 0) {
                              break L11;
                            } else {
                              if (-2 != (var6_int ^ -1)) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          kw.field_c = uu.field_l;
                          gu.field_d = -1;
                          if (var9 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                        L12: {
                          if ((var6_int ^ -1) == -9) {
                            break L12;
                          } else {
                            kw.field_c = sp.field_z;
                            gu.field_d = -1;
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        kk.a((byte) -128);
                        sr.field_g = false;
                        stackOut_36_0 = var6_int;
                        stackIn_37_0 = stackOut_36_0;
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L13: {
                    if (kw.field_c != uu.field_l) {
                      break L13;
                    } else {
                      if (!lt.a((byte) 119)) {
                        break L13;
                      } else {
                        L14: {
                          lb.field_a = ig.field_a.a((byte) 114);
                          ku.field_j = ig.field_a.e(-31302);
                          discarded$6 = ig.field_a.e(-31302);
                          ct.field_x = ig.field_a.a(255);
                          var6_ref = ig.field_a.g((byte) 92);
                          var7 = ig.field_a.e(-31302);
                          if ((var7 & 1) != 0) {
                            fu.f(24);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (param3) {
                            break L15;
                          } else {
                            L16: {
                              if (-1 == (4 & var7 ^ -1)) {
                                stackOut_46_0 = 0;
                                stackIn_47_0 = stackOut_46_0;
                                break L16;
                              } else {
                                stackOut_45_0 = 1;
                                stackIn_47_0 = stackOut_45_0;
                                break L16;
                              }
                            }
                            L17: {
                              wo.field_c = stackIn_47_0 != 0;
                              if (-1 == (var7 & 8 ^ -1)) {
                                stackOut_49_0 = 0;
                                stackIn_50_0 = stackOut_49_0;
                                break L17;
                              } else {
                                stackOut_48_0 = 1;
                                stackIn_50_0 = stackOut_48_0;
                                break L17;
                              }
                            }
                            cb.field_b = stackIn_50_0 != 0;
                            if (cb.field_b) {
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L18: {
                          L19: {
                            if (!gn.field_d) {
                              break L19;
                            } else {
                              discarded$7 = ig.field_a.e(-31302);
                              discarded$8 = ig.field_a.e(-31302);
                              discarded$9 = ig.field_a.c(true);
                              pl.field_y = ig.field_a.a(255);
                              sm.field_b = new byte[pl.field_y];
                              var8 = 0;
                              L20: while (true) {
                                if (var8 >= pl.field_y) {
                                  break L19;
                                } else {
                                  sm.field_b[var8] = ig.field_a.d(true);
                                  var8++;
                                  if (var9 != 0) {
                                    break L18;
                                  } else {
                                    if (var9 == 0) {
                                      continue L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          qv.field_o = ig.field_a.d(-1);
                          var11 = (CharSequence) ((Object) qv.field_o);
                          tc.field_f = uk.a(-1, var11);
                          jk.field_c = ig.field_a.e(-31302);
                          kw.field_c = ga.field_j;
                          break L18;
                        }
                        L21: {
                          L22: {
                            if (kb.field_d.a((byte) 113) != pb.field_b) {
                              break L22;
                            } else {
                              go.field_m.a(true, ra.c(2));
                              if (var9 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          if (kb.field_d.a((byte) 89) != hh.field_c) {
                            break L21;
                          } else {
                            tr.field_j.a(true, ra.c(2));
                            break L21;
                          }
                        }
                        L23: {
                          sr.field_g = false;
                          if (var6_ref != null) {
                            jb.a((byte) -118, var6_ref, ra.c(2));
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          L25: {
                            L26: {
                              if (ct.field_x > 0) {
                                break L26;
                              } else {
                                if (!wo.field_c) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            try {
                              L27: {
                                discarded$10 = tw.a(-111, ra.c(2), "zap", new Object[]{td.a(-29275, lb.field_a)});
                                decompiledRegionSelector0 = 0;
                                break L27;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L28: {
                                var8_ref_Throwable = decompiledCaughtException;
                                if (var9 == 0) {
                                  decompiledRegionSelector0 = 0;
                                  break L28;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L28;
                                }
                              }
                            }
                            if (decompiledRegionSelector0 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                          try {
                            L29: {
                              discarded$11 = tw.a(ra.c(2), 93, "unzap");
                              break L29;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L30: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L30;
                            }
                          }
                          break L24;
                        }
                        L31: {
                          if ((ct.field_x ^ -1) >= -1) {
                            break L31;
                          } else {
                            qn.field_a = true;
                            break L31;
                          }
                        }
                        as.field_v.a((byte) 64, bk.field_e);
                        var8 = 0;
                        L32: while (true) {
                          L33: {
                            L34: {
                              if (-5 >= (var8 ^ -1)) {
                                break L34;
                              } else {
                                bk.field_e[var8] = bk.field_e[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L33;
                                } else {
                                  if (var9 == 0) {
                                    continue L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            ig.field_a.a((byte) 123, bk.field_e);
                            break L33;
                          }
                          stackOut_83_0 = iw.field_a;
                          stackIn_84_0 = stackOut_83_0;
                          decompiledRegionSelector1 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                  L35: {
                    if (kw.field_c == sp.field_z) {
                      if (!lt.a((byte) 119)) {
                        break L35;
                      } else {
                        L36: {
                          kk.a((byte) -115);
                          if (-8 != (iw.field_a ^ -1)) {
                            break L36;
                          } else {
                            if (!sr.field_g) {
                              sr.field_g = true;
                              stackOut_95_0 = -1;
                              stackIn_96_0 = stackOut_95_0;
                              decompiledRegionSelector1 = 5;
                              break L0;
                            } else {
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if (7 != iw.field_a) {
                            break L37;
                          } else {
                            iw.field_a = 3;
                            break L37;
                          }
                        }
                        ns.field_c = ig.field_a.d(-1);
                        sr.field_g = false;
                        stackOut_93_0 = iw.field_a;
                        stackIn_94_0 = stackOut_93_0;
                        decompiledRegionSelector1 = 4;
                        break L0;
                      }
                    } else {
                      break L35;
                    }
                  }
                  L38: {
                    if (qk.field_O == null) {
                      L39: {
                        if (sr.field_g) {
                          break L39;
                        } else {
                          var6_int = vp.field_a;
                          vp.field_a = nb.field_b;
                          sr.field_g = true;
                          nb.field_b = var6_int;
                          if (var9 == 0) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      L40: {
                        L41: {
                          if (uc.b(26560) <= 30000L) {
                            break L41;
                          } else {
                            ns.field_c = ar.field_F;
                            if (var9 == 0) {
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                        ns.field_c = nd.field_G;
                        break L40;
                      }
                      sr.field_g = false;
                      stackOut_105_0 = 3;
                      stackIn_106_0 = stackOut_105_0;
                      decompiledRegionSelector1 = 6;
                      break L0;
                    } else {
                      break L38;
                    }
                  }
                  stackOut_107_0 = -1;
                  stackIn_108_0 = stackOut_107_0;
                  decompiledRegionSelector1 = 7;
                  break L0;
                } else {
                  stackOut_2_0 = -61;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L42: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_109_0 = (RuntimeException) (var6);
                stackOut_109_1 = new StringBuilder().append("jb.F(");
                stackIn_111_0 = stackOut_109_0;
                stackIn_111_1 = stackOut_109_1;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                if (param0 == null) {
                  stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
                  stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
                  stackOut_111_2 = "null";
                  stackIn_112_0 = stackOut_111_0;
                  stackIn_112_1 = stackOut_111_1;
                  stackIn_112_2 = stackOut_111_2;
                  break L42;
                } else {
                  stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackOut_110_2 = "{...}";
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_112_1 = stackOut_110_1;
                  stackIn_112_2 = stackOut_110_2;
                  break L42;
                }
              }
              L43: {
                stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
                stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                stackIn_113_0 = stackOut_112_0;
                stackIn_113_1 = stackOut_112_1;
                if (param5 == null) {
                  stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
                  stackOut_114_2 = "null";
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  break L43;
                } else {
                  stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackOut_113_2 = "{...}";
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_115_1 = stackOut_113_1;
                  stackIn_115_2 = stackOut_113_2;
                  break L43;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_8_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_37_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_84_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_94_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_96_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_106_0;
                        } else {
                          return stackIn_108_0;
                        }
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

    nb a(byte param0) {
        if (param0 < 80) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            jb.a((byte) -100, (String) null, (java.applet.Applet) null);
        }
        return hh.field_c;
    }

    final static wb a(String param0, String param1, int param2, ki param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param3.a(0, param0);
            var5 = param3.a(var4_int, param1, (byte) 127);
            var6 = -88 % ((-10 - param2) / 46);
            stackOut_0_0 = na.a(var5, -11481, param3, var4_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("jb.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    jb(long param0, String param1) {
        try {
            this.field_g = param0;
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
