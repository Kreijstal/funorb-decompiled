/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jb extends se {
    private String field_f;
    private long field_g;
    static int field_e;
    static int field_h;

    final void a(fs param0, byte param1) {
        try {
            param0.a(false, this.field_g);
            param0.a(this.field_f, 27);
            if (param1 > -107) {
                fs var4 = (fs) null;
                this.a((fs) null, (byte) -83);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
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
                  stackIn_7_0 = (String) (var5);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  stackIn_5_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_9_0 = "Cabbage";
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
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("jb.A(");

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
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            int var4 = 0;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            try {
              L0: {
                bf.field_d = param1;
                try {
                  L1: {
                    L2: {
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
                      if (param1.length() != 0) {
                        var6 = var8 + "; Expires=" + fi.a(94608000000L + wq.a(-6), true) + "; Max-Age=" + 94608000L;
                        break L2;
                      } else {
                        var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    tw.a("document.cookie=\"" + var6 + "\"", -15428, param2);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                va.a(false, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var3_ref);

                stackIn_11_1 = new StringBuilder().append("jb.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2, boolean param3, int param4, String param5) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_83_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_96_0 = 0;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            String stackIn_100_2 = null;
            StringBuilder stackIn_102_1 = null;
            StringBuilder stackIn_103_1 = null;
            String stackIn_103_2 = null;
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
            var9 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                if (param2 >= 15) {
                  L1: {
                    if (qk.field_O != null) {
                      break L1;
                    } else {
                      if (!nd.a((byte) -34, param3)) {
                        stackIn_8_0 = -1;
                        decompiledRegionSelector0 = 1;
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
                        if (param3) {
                          var10 = (String) null;
                          kb.field_d = ds.a(lb.field_a, false, (String) null, param5, false);
                          break L3;
                        } else {
                          kb.field_d = os.a(false, param0, param5, (byte) -94);
                          break L3;
                        }
                      }
                      as.field_v.field_p = 0;
                      as.field_v.b((byte) 42, 14);
                      as.field_v.b((byte) 96, kb.field_d.a((byte) 126).field_c);
                      gt.a(0, -1);
                      kw.field_c = gi.field_g;
                      break L2;
                    }
                  }
                  L4: {
                    if (kw.field_c != gi.field_g) {
                      break L4;
                    } else {
                      if (!ju.b(-1, 1)) {
                        break L4;
                      } else {
                        L5: {
                          var6_int = ig.field_a.e(-31302);
                          if (var6_int != 0) {
                            iw.field_a = var6_int;
                            gu.field_d = -1;
                            kw.field_c = sp.field_z;
                            break L5;
                          } else {
                            kw.field_c = sc.field_q;
                            break L5;
                          }
                        }
                        ig.field_a.field_p = 0;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (kw.field_c != sc.field_q) {
                      break L6;
                    } else {
                      if (!ju.b(-1, 8)) {
                        break L6;
                      } else {
                        oc.field_g = ig.field_a.a((byte) 127);
                        ig.field_a.field_p = 0;
                        fb.a(param3, param1, -12793, param4, kb.field_d);
                        kw.field_c = jj.field_f;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (kw.field_c == jj.field_f) {
                      if (!ju.b(-1, 1)) {
                        break L7;
                      } else {
                        L8: {
                          var6_int = ig.field_a.e(-31302);
                          iw.field_a = var6_int;
                          ig.field_a.field_p = 0;
                          rp.field_b = null;
                          if (var6_int == 0) {
                            break L8;
                          } else {
                            if (-2 != (var6_int ^ -1)) {
                              if ((var6_int ^ -1) == -9) {
                                kk.a((byte) -128);
                                sr.field_g = false;
                                stackIn_33_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                kw.field_c = sp.field_z;
                                gu.field_d = -1;
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        kw.field_c = uu.field_l;
                        gu.field_d = -1;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if (kw.field_c != uu.field_l) {
                      break L9;
                    } else {
                      if (!lt.a((byte) 119)) {
                        break L9;
                      } else {
                        L10: {
                          lb.field_a = ig.field_a.a((byte) 114);
                          ku.field_j = ig.field_a.e(-31302);
                          ig.field_a.e(-31302);
                          ct.field_x = ig.field_a.a(255);
                          var6 = ig.field_a.g((byte) 92);
                          var7 = ig.field_a.e(-31302);
                          if ((var7 & 1) != 0) {
                            fu.f(24);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (param3) {
                            break L11;
                          } else {
                            L12: {
                              if (-1 == (4 & var7 ^ -1)) {
                                stackIn_43_0 = 0;
                                break L12;
                              } else {
                                stackIn_43_0 = 1;
                                break L12;
                              }
                            }
                            L13: {
                              wo.field_c = stackIn_43_0 != 0;
                              if (-1 == (var7 & 8 ^ -1)) {
                                stackIn_46_0 = 0;
                                break L13;
                              } else {
                                stackIn_46_0 = 1;
                                break L13;
                              }
                            }
                            cb.field_b = stackIn_46_0 != 0;
                            if (cb.field_b) {
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L14: {
                          if (!gn.field_d) {
                            break L14;
                          } else {
                            ig.field_a.e(-31302);
                            ig.field_a.e(-31302);
                            ig.field_a.c(true);
                            pl.field_y = ig.field_a.a(255);
                            sm.field_b = new byte[pl.field_y];
                            var8 = 0;
                            L15: while (true) {
                              if (var8 >= pl.field_y) {
                                break L14;
                              } else {
                                sm.field_b[var8] = ig.field_a.d(true);
                                var8++;
                                continue L15;
                              }
                            }
                          }
                        }
                        L16: {
                          qv.field_o = ig.field_a.d(-1);
                          var11 = (CharSequence) ((Object) qv.field_o);
                          tc.field_f = uk.a(-1, var11);
                          jk.field_c = ig.field_a.e(-31302);
                          kw.field_c = ga.field_j;
                          if (kb.field_d.a((byte) 113) != pb.field_b) {
                            if (kb.field_d.a((byte) 89) != hh.field_c) {
                              break L16;
                            } else {
                              tr.field_j.a(true, ra.c(2));
                              break L16;
                            }
                          } else {
                            go.field_m.a(true, ra.c(2));
                            break L16;
                          }
                        }
                        L17: {
                          sr.field_g = false;
                          if (var6 != null) {
                            jb.a((byte) -118, var6, ra.c(2));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          L19: {
                            if (ct.field_x > 0) {
                              break L19;
                            } else {
                              if (!wo.field_c) {
                                try {
                                  L20: {
                                    tw.a(ra.c(2), 93, "unzap");
                                    break L20;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L21: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    break L21;
                                  }
                                }
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          try {
                            L22: {
                              tw.a(-111, ra.c(2), "zap", new Object[]{td.a(-29275, lb.field_a)});
                              break L22;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L23: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L23;
                            }
                          }
                          break L18;
                        }
                        L24: {
                          if ((ct.field_x ^ -1) >= -1) {
                            break L24;
                          } else {
                            qn.field_a = true;
                            break L24;
                          }
                        }
                        as.field_v.a((byte) 64, bk.field_e);
                        var8 = 0;
                        L25: while (true) {
                          if (-5 >= (var8 ^ -1)) {
                            ig.field_a.a((byte) 123, bk.field_e);
                            stackIn_73_0 = iw.field_a;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            bk.field_e[var8] = bk.field_e[var8] + 50;
                            var8++;
                            continue L25;
                          }
                        }
                      }
                    }
                  }
                  L26: {
                    if (kw.field_c == sp.field_z) {
                      if (!lt.a((byte) 119)) {
                        break L26;
                      } else {
                        L27: {
                          kk.a((byte) -115);
                          if (-8 != (iw.field_a ^ -1)) {
                            break L27;
                          } else {
                            if (!sr.field_g) {
                              sr.field_g = true;
                              stackIn_85_0 = -1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if (7 != iw.field_a) {
                            break L28;
                          } else {
                            iw.field_a = 3;
                            break L28;
                          }
                        }
                        ns.field_c = ig.field_a.d(-1);
                        sr.field_g = false;
                        stackIn_83_0 = iw.field_a;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L29: {
                    if (qk.field_O == null) {
                      if (sr.field_g) {
                        L30: {
                          if (uc.b(26560) <= 30000L) {
                            ns.field_c = nd.field_G;
                            break L30;
                          } else {
                            ns.field_c = ar.field_F;
                            break L30;
                          }
                        }
                        sr.field_g = false;
                        stackIn_94_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var6_int = vp.field_a;
                        vp.field_a = nb.field_b;
                        sr.field_g = true;
                        nb.field_b = var6_int;
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  stackIn_96_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_3_0 = -61;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_99_0 = (RuntimeException) (var6_ref);

                stackIn_99_1 = new StringBuilder().append("jb.F(");

                if (param0 == null) {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackIn_100_2 = "null";
                  break L31;
                } else {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackIn_100_2 = "{...}";
                  break L31;
                }
              }
              L32: {


                stackIn_102_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "null";
                  break L32;
                } else {
                  stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackIn_103_2 = "{...}";
                  break L32;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_100_0), stackIn_103_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_8_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_73_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_83_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_85_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_94_0;
                        } else {
                          return stackIn_96_0;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param3.a(0, param0);
            var5 = param3.a(var4_int, param1, (byte) 127);
            var6 = -88 % ((-10 - param2) / 46);
            stackIn_1_0 = na.a(var5, -11481, param3, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("jb.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
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
