/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends pg {
    int field_l;
    static kc field_h;
    int field_i;
    static String field_g;
    static int field_k;
    static dj field_j;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                    if (param1 < -56) {
                      param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
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
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("ko.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc param1, byte param2) {
        ll[] discarded$1 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        ne var10 = null;
        qb var11 = null;
        String var12 = null;
        ne var13 = null;
        qb var14 = null;
        String var15 = null;
        ne var16 = null;
        qb var17 = null;
        String var18 = null;
        ne var19 = null;
        qb var20 = null;
        String var21 = null;
        ne var22 = null;
        qb var23 = null;
        String var24 = null;
        ne var25 = null;
        qb var26 = null;
        String var27 = null;
        ne var28 = null;
        qb var29 = null;
        String var30 = null;
        ne var31 = null;
        qb var32 = null;
        String var33 = null;
        ne var34 = null;
        qb var35 = null;
        String var36 = null;
        ne var37 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              ArcanistsMulti.a(-26335, (int[]) null, (dn) null, (String) null, 0L, param0, -1, (String) null, param1);
              if (param0 == 0) {
                var10 = eo.field_c;
                var11 = tl.field_a[0];
                var20 = var11;
                var20 = var11;
                var12 = oh.field_q;
                var10.field_l.a((byte) -32, 11, var11, var12);
                var13 = eo.field_c;
                var14 = tl.field_a[1];
                var20 = var14;
                var20 = var14;
                var15 = cj.field_c;
                var13.field_l.a((byte) -32, 12, var14, var15);
                var16 = eo.field_c;
                var17 = tl.field_a[2];
                var20 = var17;
                var20 = var17;
                var18 = jg.field_j;
                var16.field_l.a((byte) -32, 13, var17, var18);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (1 == param0) {
                var19 = eo.field_c;
                var20 = tl.field_a[0];
                var21 = ug.field_f;
                var19.field_l.a((byte) -32, 11, var20, var21);
                var22 = eo.field_c;
                var23 = tl.field_a[1];
                var24 = wa.field_Hb;
                var22.field_l.a((byte) -32, 12, var23, var24);
                var25 = eo.field_c;
                var26 = tl.field_a[2];
                var27 = dm.field_J;
                var25.field_l.a((byte) -32, 13, var26, var27);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 != 2) {
                break L3;
              } else {
                var28 = eo.field_c;
                var29 = tl.field_a[0];
                var30 = w.field_Jb;
                var28.field_l.a((byte) -32, 11, var29, var30);
                var31 = eo.field_c;
                var32 = tl.field_a[1];
                var33 = lk.field_l;
                var31.field_l.a((byte) -32, 12, var32, var33);
                var34 = eo.field_c;
                var35 = tl.field_a[2];
                var36 = ol.field_c;
                var34.field_l.a((byte) -32, 13, var35, var36);
                break L3;
              }
            }
            L4: {
              var37 = eo.field_c;
              var4 = param1.field_V;
              var5 = param1.field_nb;
              var6 = param1.field_x;
              var7 = param1.field_I;
              var37.field_l.a(var6, var7, -29466, var5, var4);
              if (param2 <= -51) {
                break L4;
              } else {
                var8 = (eg) null;
                discarded$1 = ko.a(99, (byte) -116, 31, (eg) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("ko.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        field_g = null;
        if (param0 == 32) {
            return;
        }
        field_j = (dj) null;
    }

    final static ll[] a(int param0, byte param1, int param2, eg param3) {
        RuntimeException var4 = null;
        ll[] stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll[] stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 > 94) {
              if (fc.a(19, param3, param0, param2)) {
                return fk.c(0);
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (ll[]) null;
              stackIn_2_0 = stackOut_1_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ko.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_2_0;
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var57 = null;
        String var58 = null;
        String var59 = null;
        String var60 = null;
        String var61 = null;
        String var62 = null;
        Object var63 = null;
        CharSequence var64 = null;
        var63 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < -105) {
          L0: {
            var3 = 1;
            if (di.field_j) {
              break L0;
            } else {
              if (null == tm.field_d) {
                var3 = 0;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (0 != nj.field_c) {
              break L1;
            } else {
              if (null == om.field_x) {
                break L1;
              } else {
                var3 = 0;
                break L1;
              }
            }
          }
          L2: {
            if (nj.field_c != 2) {
              break L2;
            } else {
              if (!wm.c(false)) {
                var3 = 0;
                break L2;
              } else {
                break L2;
              }
            }
          }
          if (84 != vn.field_d) {
            if (-86 != (vn.field_d ^ -1)) {
              var4 = ed.field_Bb;
              if (bg.a(-256, (char) var4)) {
                if (var3 != 0) {
                  if (hi.field_e.length() < 80) {
                    L3: {
                      discarded$6 = hi.field_e.append((char) var4);
                      var5 = 485;
                      var17 = ah.field_b;
                      var16 = fg.a(var17, -2);
                      var19 = var16;
                      if (2 != nj.field_c) {
                        var7 = "";
                        if (0 == nj.field_c) {
                          L4: {
                            if (wi.field_f != null) {
                              break L4;
                            } else {
                              if (!hm.field_c) {
                                break L4;
                              } else {
                                var7 = "[" + lj.field_p + "] ";
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (null == wi.field_f) {
                              break L5;
                            } else {
                              if (!oe.field_a) {
                                var60 = "[" + tj.a(-68, new String[]{wi.field_f.field_ic}, ul.field_j) + "] ";
                                var61 = var60 + var19 + ": ";
                                var5 = var5 - oo.field_x.b(var61);
                                if (oo.field_x.b(hi.field_e.toString()) > var5) {
                                  discarded$7 = qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                if (he.field_d != null) {
                                  var7 = "[" + he.field_d + "] ";
                                  break L5;
                                } else {
                                  var58 = "[" + tj.a(-68, new String[]{wi.field_f.field_ic}, ul.field_j) + "] ";
                                  var59 = var58 + var19 + ": ";
                                  var5 = var5 - oo.field_x.b(var59);
                                  if (oo.field_x.b(hi.field_e.toString()) > var5) {
                                    discarded$8 = qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          }
                          var62 = var7 + var19 + ": ";
                          var5 = var5 - oo.field_x.b(var62);
                          break L3;
                        } else {
                          var57 = var7 + var19 + ": ";
                          var5 = var5 - oo.field_x.b(var57);
                          if (oo.field_x.b(hi.field_e.toString()) > var5) {
                            discarded$9 = qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
                            return true;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        var64 = (CharSequence) ((Object) so.field_p);
                        var18 = tj.a(-45, new String[]{qo.a((byte) 84, var64)}, ge.field_n);
                        var8 = tj.a(113, new String[]{var16}, pk.field_f);
                        var9 = oo.field_x.b(var18);
                        var10 = oo.field_x.b(var8);
                        if (var10 >= var9) {
                          var5 = var5 - var10;
                          break L3;
                        } else {
                          var5 = var5 - var9;
                          break L3;
                        }
                      }
                    }
                    if (oo.field_x.b(hi.field_e.toString()) <= var5) {
                      return true;
                    } else {
                      discarded$10 = qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                if (hi.field_e.length() <= 0) {
                  return true;
                } else {
                  discarded$11 = qj.a(hi.field_e.length() + -1, hi.field_e, ' ', false);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            if (var3 == 0) {
              if (0 == nj.field_c) {
                return true;
              } else {
                ue.b(10);
                return true;
              }
            } else {
              L6: {
                if ((hi.field_e.length() ^ -1) >= -1) {
                  ue.b(10);
                  break L6;
                } else {
                  var4_ref_String = hi.field_e.toString();
                  var7 = var4_ref_String;
                  var7 = var4_ref_String;
                  if (!p.a(-1, var4_ref_String)) {
                    L7: {
                      var5 = nj.field_c;
                      if (0 != var5) {
                        break L7;
                      } else {
                        if (wi.field_f == null) {
                          break L7;
                        } else {
                          var5 = 1;
                          break L7;
                        }
                      }
                    }
                    if (oh.a((byte) 117, var5) != 2) {
                      sd.a(-1, var4_ref_String, 82, param1, nj.field_c, so.field_p);
                      break L6;
                    } else {
                      ea.a(param2, 1, true, var5);
                      sd.a(-1, var4_ref_String, 82, param1, nj.field_c, so.field_p);
                      ue.b(10);
                      break L6;
                    }
                  } else {
                    var13 = (String) null;
                    var12 = (String) null;
                    ao.a(0, (byte) 83, cd.field_q, (String) null, 2, (String) null);
                    var15 = (String) null;
                    var14 = (String) null;
                    ao.a(0, (byte) 73, rg.field_b, (String) null, 2, (String) null);
                    ue.b(10);
                    break L6;
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static int[] a(int[] param0, int[] param1, boolean param2) {
        boolean discarded$2 = false;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ll var6 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new int[8];
              var4 = 0;
              if (param2) {
                break L1;
              } else {
                var6 = (ll) null;
                discarded$2 = ko.a((nf) null, -45, 124, 15, (ll) null, 88);
                break L1;
              }
            }
            L2: while (true) {
              if (-9 >= (var4 ^ -1)) {
                stackOut_5_0 = (int[]) (var3);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3[var4] = fj.b(param0[var4], param1[var4]);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("ko.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                var3 = 117 % ((-63 - param0) / 59);
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (uh.a((char) var3, (byte) -122)) {
                    break L2;
                  } else {
                    if (!e.a(30, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ko.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private ko() throws Throwable {
        throw new Error();
    }

    final static boolean a(nf param0, int param1, int param2, int param3, ll param4, int param5) {
        qb var6 = null;
        RuntimeException var6_ref = null;
        boolean stackIn_1_0 = false;
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
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
        try {
          L0: {
            var6 = new qb(param3 * 2, 2 * param3);
            var6.a();
            de.i(param3, param3, param3, param5);
            stackOut_0_0 = fk.a(param0, -(param3 * 2) + param1, param4, param2 - param3, (byte) -1, var6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6_ref);
            stackOut_2_1 = new StringBuilder().append("ko.A(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_k = 71;
    }
}
