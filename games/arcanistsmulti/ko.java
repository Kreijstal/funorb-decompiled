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
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  if (param1 < -56) {
                    param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ko.B(");
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc param1, byte param2) {
        RuntimeException var3 = null;
        ne var3_ref = null;
        qb var4_ref_qb = null;
        int var4 = 0;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              ArcanistsMulti.a(-26335, (int[]) null, (dn) null, (String) null, 0L, param0, -1, (String) null, param1);
              if (param0 == 0) {
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[0];
                var5_ref_String = oh.field_q;
                var3_ref.field_l.a((byte) -32, 11, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[1];
                var5_ref_String = cj.field_c;
                var3_ref.field_l.a((byte) -32, 12, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[2];
                var5_ref_String = jg.field_j;
                var3_ref.field_l.a((byte) -32, 13, var4_ref_qb, var5_ref_String);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (1 == param0) {
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[0];
                var5_ref_String = ug.field_f;
                var3_ref.field_l.a((byte) -32, 11, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[1];
                var5_ref_String = wa.field_Hb;
                var3_ref.field_l.a((byte) -32, 12, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[2];
                var5_ref_String = dm.field_J;
                var3_ref.field_l.a((byte) -32, 13, var4_ref_qb, var5_ref_String);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 != 2) {
                break L3;
              } else {
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[0];
                var5_ref_String = w.field_Jb;
                var3_ref.field_l.a((byte) -32, 11, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[1];
                var5_ref_String = lk.field_l;
                var3_ref.field_l.a((byte) -32, 12, var4_ref_qb, var5_ref_String);
                var3_ref = eo.field_c;
                var4_ref_qb = tl.field_a[2];
                var5_ref_String = ol.field_c;
                var3_ref.field_l.a((byte) -32, 13, var4_ref_qb, var5_ref_String);
                break L3;
              }
            }
            L4: {
              var3_ref = eo.field_c;
              var4 = param1.field_V;
              var5 = param1.field_nb;
              var6 = param1.field_x;
              var7 = param1.field_I;
              var3_ref.field_l.a(var6, var7, -29466, var5, var4);
              if (param2 <= -51) {
                break L4;
              } else {
                ll[] discarded$1 = ko.a(99, (byte) -116, 31, (eg) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ko.F(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_j = null;
            field_h = null;
            field_g = null;
            if (param0 != 32) {
                field_j = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ko.C(" + param0 + ')');
        }
    }

    final static ll[] a(int param0, byte param1, int param2, eg param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        ll[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ll[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param1 > 94) {
              if (!fc.a(19, param3, param0, param2)) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ll[]) (Object) stackIn_7_0;
              } else {
                stackOut_8_0 = fk.c(0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ll[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ko.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_2_0 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 < -105) {
              L1: {
                var3_int = 1;
                if (di.field_j) {
                  break L1;
                } else {
                  if (null == tm.field_d) {
                    var3_int = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (0 != nj.field_c) {
                  break L2;
                } else {
                  if (null == om.field_x) {
                    break L2;
                  } else {
                    var3_int = 0;
                    break L2;
                  }
                }
              }
              L3: {
                if (nj.field_c != 2) {
                  break L3;
                } else {
                  if (!wm.c(false)) {
                    var3_int = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (84 != vn.field_d) {
                if (vn.field_d != 85) {
                  var4 = ed.field_Bb;
                  if (!bg.a(-256, (char) var4)) {
                    stackOut_100_0 = 0;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  } else {
                    L4: {
                      if (var3_int == 0) {
                        break L4;
                      } else {
                        if (hi.field_e.length() < 80) {
                          L5: {
                            L6: {
                              StringBuilder discarded$3 = hi.field_e.append((char) var4);
                              var5 = 485;
                              var6 = ah.field_b;
                              var6 = fg.a(var6, -2);
                              if (2 != nj.field_c) {
                                break L6;
                              } else {
                                L7: {
                                  L8: {
                                    var7 = tj.a(-45, new String[1], ge.field_n);
                                    var8 = tj.a(113, new String[1], pk.field_f);
                                    var9 = oo.field_x.b(var7);
                                    var10 = oo.field_x.b(var8);
                                    if (var10 >= var9) {
                                      break L8;
                                    } else {
                                      var5 = var5 - var9;
                                      if (var11 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var5 = var5 - var10;
                                  break L7;
                                }
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L9: {
                              var7 = "";
                              if (0 == nj.field_c) {
                                L10: {
                                  if (wi.field_f != null) {
                                    break L10;
                                  } else {
                                    if (!hm.field_c) {
                                      break L10;
                                    } else {
                                      var7 = "[" + lj.field_p + "] ";
                                      break L10;
                                    }
                                  }
                                }
                                if (null == wi.field_f) {
                                  break L9;
                                } else {
                                  L11: {
                                    L12: {
                                      if (!oe.field_a) {
                                        break L12;
                                      } else {
                                        if (he.field_d != null) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var7 = "[" + tj.a(-68, new String[1], ul.field_j) + "] ";
                                    if (var11 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var7 = "[" + he.field_d + "] ";
                                  break L9;
                                }
                              } else {
                                break L9;
                              }
                            }
                            var7 = var7 + var6 + ": ";
                            var5 = var5 - oo.field_x.b(var7);
                            break L5;
                          }
                          if (oo.field_x.b(hi.field_e.toString()) <= var5) {
                            break L4;
                          } else {
                            StringBuilder discarded$4 = qj.a(-1 + hi.field_e.length(), hi.field_e, ' ', false);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackOut_98_0 = 1;
                    stackIn_99_0 = stackOut_98_0;
                    return stackIn_99_0 != 0;
                  }
                } else {
                  L13: {
                    if (var3_int == 0) {
                      break L13;
                    } else {
                      if (hi.field_e.length() > 0) {
                        StringBuilder discarded$5 = qj.a(hi.field_e.length() + -1, hi.field_e, ' ', false);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  stackOut_61_0 = 1;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0 != 0;
                }
              } else {
                L14: {
                  L15: {
                    if (var3_int == 0) {
                      break L15;
                    } else {
                      L16: {
                        if (hi.field_e.length() <= 0) {
                          break L16;
                        } else {
                          L17: {
                            var4_ref_String = hi.field_e.toString();
                            if (!p.a(-1, var4_ref_String)) {
                              break L17;
                            } else {
                              ao.a(0, (byte) 83, cd.field_q, (String) null, 2, (String) null);
                              ao.a(0, (byte) 73, rg.field_b, (String) null, 2, (String) null);
                              if (var11 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            var5 = nj.field_c;
                            if (0 != var5) {
                              break L18;
                            } else {
                              if (wi.field_f == null) {
                                break L18;
                              } else {
                                var5 = 1;
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (oh.a((byte) 117, var5) != 2) {
                              break L19;
                            } else {
                              ea.a(param2, 1, true, var5);
                              break L19;
                            }
                          }
                          sd.a(-1, var4_ref_String, 82, param1, nj.field_c, so.field_p);
                          break L16;
                        }
                      }
                      ue.b(10);
                      if (var11 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (0 == nj.field_c) {
                    break L14;
                  } else {
                    ue.b(10);
                    break L14;
                  }
                }
                stackOut_49_0 = 1;
                stackIn_50_0 = stackOut_49_0;
                return stackIn_50_0 != 0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ko.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final static int[] a(int[] param0, int[] param1, boolean param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_6_0 = null;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new int[8];
              var4 = 0;
              if (param2) {
                break L1;
              } else {
                boolean discarded$2 = ko.a((nf) null, -45, 124, 15, (ll) null, 88);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= 8) {
                    break L4;
                  } else {
                    stackOut_5_0 = (int[]) var3;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      stackIn_6_0[var4] = fj.b(param0[var4], param1[var4]);
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_9_0 = (int[]) var3;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ko.D(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param1.length() >= ~var2_int) {
                    break L3;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_3_0 = uh.a((char) var3, (byte) -122);
                    stackIn_16_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (!e.a(30, (char) var3)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = 117 % ((-63 - param0) / 59);
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ko.H(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private ko() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ko.<init>()");
        }
    }

    final static boolean a(nf param0, int param1, int param2, int param3, ll param4, int param5) {
        qb var6 = null;
        RuntimeException var6_ref = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("ko.A(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_k = 71;
    }
}
