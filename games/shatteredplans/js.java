/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    static ld field_c;
    static int field_d;
    static int field_g;
    static gh field_i;
    static String field_h;
    static ke field_a;
    static sl field_f;
    static int field_j;
    static sq[] field_b;
    static int field_e;

    final static void a(int param0, int param1) {
        qr discarded$2 = null;
        gm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              tf.field_p = param0;
              if (param1 == 197126152) {
                break L1;
              } else {
                discarded$2 = js.b((byte) -92);
                break L1;
              }
            }
            var2 = (gm) ((Object) eo.field_ab.d(0));
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (nc.field_v == null) {
                    break L3;
                  } else {
                    var2 = (gm) ((Object) nc.field_v.d(0));
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (var2.field_n.c(param1 + -197124104)) {
                            var2.field_p.e(128 + tf.field_p * var2.field_h >> 1830650120);
                            break L5;
                          } else {
                            var2.b((byte) -69);
                            break L5;
                          }
                        }
                        var2 = (gm) ((Object) nc.field_v.a((byte) -71));
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (!var2.field_n.c(param1 + -197124104)) {
                    var2.b((byte) -75);
                    break L6;
                  } else {
                    var2.field_p.e(var2.field_h * tf.field_p - -128 >> 197126152);
                    break L6;
                  }
                }
                var2 = (gm) ((Object) eo.field_ab.a((byte) -71));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "js.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fb var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param2 >= 3) {
                break L1;
              } else {
                var5 = (fb) null;
                js.a(-8, 21, (fb) null, -124, 16, false, 64, -69);
                break L1;
              }
            }
            L2: while (true) {
              if (-1 <= (param1 ^ -1)) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = var3_int << -1078106911 | 1 & param0;
                param1--;
                param0 = param0 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "js.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            String var3 = null;
            Throwable var3_ref = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                var2_int = -84 / ((param0 - -5) / 55);
                if (!sq.field_o) {
                  try {
                    L1: {
                      var3 = "tuhstatbut";
                      var4 = (String) (ll.a("getcookies", param1, (byte) 127));
                      var5 = so.a(var4, ';', 116);
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackOut_8_0 = 1;
                                stackIn_9_0 = stackOut_8_0;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2);
                stackOut_17_1 = new StringBuilder().append("js.G(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_9_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qr b(byte param0) {
        if (param0 != 121) {
            return (qr) null;
        }
        return d.field_a.field_Eb;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1627333441;
        param0 = param0 | param0 >>> -1114969182;
        param0 = param0 | param0 >>> 1812676996;
        param0 = param0 | param0 >>> 1693466344;
        param0 = param0 | param0 >>> 1315717520;
        if (param1 != 122) {
            js.c((byte) -124);
        }
        return param0 + 1;
    }

    public static void c(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 <= 58) {
            return;
        }
        field_f = null;
        field_b = null;
        field_i = null;
    }

    final static void a(int param0, int param1, fb param2, int param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        sg[] var8_array = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg var13_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        sg[] var16 = null;
        sg[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        sg[][] stackIn_5_0 = null;
        sg[][] stackIn_6_0 = null;
        sg[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sg[][] stackOut_4_0 = null;
        sg[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sg[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                js.a(106, 32);
                break L1;
              }
            }
            L2: {
              if (param3 <= param0) {
                var8_int = 1;
                var9 = 0;
                L3: while (true) {
                  if (pe.field_D.length <= var9) {
                    if (var8_int == 0) {
                      break L2;
                    } else {
                      wg.field_d = true;
                      break L2;
                    }
                  } else {
                    var19 = pe.field_D[var9];
                    var18 = var19;
                    var10 = var18;
                    var11 = 0;
                    var12 = 0;
                    L4: while (true) {
                      L5: {
                        if (var12 >= var19.length) {
                          L6: {
                            if (var11 != 0) {
                              break L6;
                            } else {
                              if (em.field_k == param0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var12 = 0;
                          L7: while (true) {
                            if (var19.length <= var12) {
                              var8_int = 0;
                              break L5;
                            } else {
                              L8: {
                                var13 = var19[var12];
                                if (0 == (var13 ^ -1)) {
                                  qd.field_h = true;
                                  break L8;
                                } else {
                                  if (var13 < param0) {
                                    ek.field_F[var13] = true;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L7;
                            }
                          }
                        } else {
                          L9: {
                            var13 = var19[var12];
                            var14 = var10[1 + var12];
                            if (var13 != -1) {
                              L10: {
                                if (var13 != param0) {
                                  break L10;
                                } else {
                                  if (param6 == var14) {
                                    var11 = 1;
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (param0 > var13) {
                                if ((lr.field_c[var13] & 255) != var14) {
                                  break L5;
                                } else {
                                  var12 += 2;
                                  continue L4;
                                }
                              } else {
                                var9++;
                                continue L3;
                              }
                            } else {
                              if (nl.field_a[param7] == var14) {
                                break L9;
                              } else {
                                var9++;
                                continue L3;
                              }
                            }
                          }
                          var12 += 2;
                          continue L4;
                        }
                      }
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                L11: {
                  stackOut_4_0 = fk.field_p;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 == param0) {
                    stackOut_6_0 = (sg[][]) ((Object) stackIn_6_0);
                    stackOut_6_1 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L11;
                  } else {
                    stackOut_5_0 = (sg[][]) ((Object) stackIn_5_0);
                    stackOut_5_1 = 4 - -param0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L11;
                  }
                }
                L12: {
                  var16 = stackIn_7_0[stackIn_7_1];
                  var17 = var16;
                  var8_array = var17;
                  var9 = 1;
                  if (!param5) {
                    break L12;
                  } else {
                    if (-1 != param0) {
                      var10_int = 0;
                      L13: while (true) {
                        L14: {
                          if (var16.length + -1 <= var10_int) {
                            break L14;
                          } else {
                            if ((qj.field_f[(var10_int + param4) / 8] & 1 << (7 & param4 - -var10_int)) == 0) {
                              var10_int++;
                              continue L13;
                            } else {
                              var9 = 0;
                              break L14;
                            }
                          }
                        }
                        param4 = param4 + (ks.field_e[param0] & 255);
                        break L12;
                      }
                    } else {
                      var10_int = 0;
                      L15: while (true) {
                        if (nl.field_a.length <= var10_int) {
                          break L12;
                        } else {
                          if ((id.field_c[var10_int / 8] & 1 << (var10_int & 7)) != 0) {
                            var9 = 0;
                            break L12;
                          } else {
                            var10_int++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                }
                var10_int = 0;
                var11 = 0;
                L16: while (true) {
                  L17: {
                    if (-1 != param0) {
                      stackOut_24_0 = var17.length + -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = nl.field_a.length;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  if ((stackIn_25_0 ^ -1) >= (var11 ^ -1)) {
                    if (var10_int == 0) {
                      var11 = 0;
                      L18: while (true) {
                        if (var11 >= var17.length - 1) {
                          break L2;
                        } else {
                          L19: {
                            if (param0 == -1) {
                              param7 = var11;
                              break L19;
                            } else {
                              lr.field_c[param0] = (byte)var11;
                              break L19;
                            }
                          }
                          js.a(param0 - -1, param1 ^ 0, param2, param3, param4, param5, param6, param7);
                          if (!wg.field_d) {
                            var11++;
                            continue L18;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L20: {
                      if (param0 != -1) {
                        lr.field_c[param0] = (byte)var11;
                        break L20;
                      } else {
                        param7 = var11;
                        break L20;
                      }
                    }
                    L21: {
                      L22: {
                        if ((param0 ^ -1) != 0) {
                          break L22;
                        } else {
                          if (-2 == (nl.field_a.length ^ -1)) {
                            var12 = 1;
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var13_ref_sg = var8_array[1 + var11];
                      if (!param5) {
                        L23: {
                          if (0 == (param0 ^ -1)) {
                            if (nl.field_a[var11] != np.field_a.field_Eb) {
                              stackOut_48_0 = 0;
                              stackIn_49_0 = stackOut_48_0;
                              break L23;
                            } else {
                              stackOut_47_0 = 1;
                              stackIn_49_0 = stackOut_47_0;
                              break L23;
                            }
                          } else {
                            if ((255 & np.field_a.field_dc[param0]) != var11) {
                              stackOut_45_0 = 0;
                              stackIn_49_0 = stackOut_45_0;
                              break L23;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_49_0 = stackOut_44_0;
                              break L23;
                            }
                          }
                        }
                        var12 = stackIn_49_0;
                        break L21;
                      } else {
                        L24: {
                          if (!var13_ref_sg.field_bb) {
                            if (var9 != 0) {
                              if (var13_ref_sg.field_s) {
                                stackOut_39_0 = 1;
                                stackIn_41_0 = stackOut_39_0;
                                break L24;
                              } else {
                                stackOut_38_0 = 0;
                                stackIn_41_0 = stackOut_38_0;
                                break L24;
                              }
                            } else {
                              stackOut_36_0 = 0;
                              stackIn_41_0 = stackOut_36_0;
                              break L24;
                            }
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_41_0 = stackOut_34_0;
                            break L24;
                          }
                        }
                        var12 = stackIn_41_0;
                        break L21;
                      }
                    }
                    L25: {
                      if (var12 != 0) {
                        js.a(1 + param0, 1, param2, param3, param4, param5, param6, param7);
                        var10_int = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    if (!wg.field_d) {
                      var11++;
                      continue L16;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var8);
            stackOut_102_1 = new StringBuilder().append("js.E(").append(param0).append(',').append(param1).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param2 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L26;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L26;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        String[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        String[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              be.field_h = oi.field_a;
              kp.field_j = jb.field_d;
              ph.field_g = false;
              er.field_g = false;
              pc.field_q = tp.field_b;
              ol.field_g = hm.field_q;
              jc.field_r = fe.field_B;
              me.field_j = false;
              td.field_L = false;
              se.field_k = false;
              if (param0 == -10) {
                break L1;
              } else {
                js.a((byte) 43);
                break L1;
              }
            }
            L2: {
              tl.field_u = false;
              ej.field_m = 0;
              if (null == ol.field_g.field_m) {
                break L2;
              } else {
                var5 = ol.field_g.field_m;
                var1 = var5;
                var2 = 0;
                L3: while (true) {
                  if (var2 >= var5.length) {
                    break L2;
                  } else {
                    var3 = var5[var2];
                    kq.b(var3, param0 ^ -15);
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (!ol.field_g.field_h) {
                break L4;
              } else {
                ge.field_i = 0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "js.A(" + param0 + ')');
        }
    }

    static {
        field_c = null;
        field_d = 0;
        field_h = "Please select an option in the '<%0>' row.";
    }
}
