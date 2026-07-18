/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private la field_c;
    static String field_b;
    private ji field_a;
    private ji field_d;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 82) {
                break L1;
              } else {
                em.a((byte) 15);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "em.F(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -107) {
              L1: {
                if (jj.field_f.a(80)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "em.B(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ah.field_c.c(true);
              if (pk.field_v == null) {
                pk.field_v = new qn(ah.field_c, ed.field_d);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1199770620) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            ah.field_c.a((byte) -119, (ce) (Object) pk.field_v);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "em.G(" + param0 + ')');
        }
    }

    final ac a(int param0, int param1) {
        ac var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        ac stackIn_2_0 = null;
        ac stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        ac stackOut_12_0 = null;
        ac stackOut_1_0 = null;
        try {
          L0: {
            var3 = (ac) ((em) this).field_c.a((long)param1, (byte) -30);
            if (null == var3) {
              L1: {
                L2: {
                  var5 = 57 / ((param0 - -79) / 38);
                  if (param1 >= 32768) {
                    break L2;
                  } else {
                    var4 = ((em) this).field_d.a(param1, 63, 0);
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = ((em) this).field_a.a(32767 & param1, 49, 0);
                break L1;
              }
              L3: {
                var3 = new ac();
                if (var4 == null) {
                  break L3;
                } else {
                  var3.a((byte) -4, new wl(var4));
                  break L3;
                }
              }
              L4: {
                if (param1 < 32768) {
                  break L4;
                } else {
                  var3.c(-1);
                  break L4;
                }
              }
              ((em) this).field_c.a((Object) (Object) var3, (long)param1, 69);
              stackOut_12_0 = (ac) var3;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = (ac) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3_ref, "em.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(vg param0, boolean param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = s.b((byte) 127, (-param4 + param2) * 3);
              var6 = param4 * 3;
              var7 = var5_int + -10;
              rd.c(0);
              if (0 >= param0.field_B) {
                break L1;
              } else {
                if (null == param0.field_Q) {
                  break L1;
                } else {
                  ci.a((byte) 127);
                  break L1;
                }
              }
            }
            ta.field_d = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param0.field_L >= ~var8) {
                    break L4;
                  } else {
                    var9 = param0.field_M[var8];
                    var10 = param0.field_c[var8];
                    var11 = param0.field_A[var8];
                    stackOut_9_0 = param1;
                    stackIn_49_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_10_0) {
                            break L6;
                          } else {
                            var12 = kl.field_n[var9];
                            var13 = rn.field_b[var9];
                            var14 = -var12 + kl.field_n[var10];
                            var15 = kl.field_n[var11] - var12;
                            var16 = -var13 + rn.field_b[var10];
                            var17 = rn.field_b[var11] - var13;
                            if (var17 * var14 - var15 * var16 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          var12 = vg.field_G[var9];
                          if (var12 != -2147483648) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var13 = vg.field_G[var10];
                          if (var13 != -2147483648) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var14 = vg.field_G[var11];
                        if (var14 == -2147483648) {
                          break L5;
                        } else {
                          L9: {
                            var15 = var14 + (var13 + var12) + -var6;
                            if (0 > var7) {
                              stackOut_29_0 = var15 << -var7;
                              stackIn_30_0 = stackOut_29_0;
                              break L9;
                            } else {
                              stackOut_27_0 = var15 >> var7;
                              stackIn_30_0 = stackOut_27_0;
                              break L9;
                            }
                          }
                          var16 = -stackIn_30_0 + a.field_r.length + -1;
                          var17 = a.field_r[var16];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var17 >> 4 == 0) {
                                  break L12;
                                } else {
                                  var16--;
                                  stackOut_32_0 = ~var16;
                                  stackOut_32_1 = -1;
                                  stackIn_40_0 = stackOut_32_0;
                                  stackIn_40_1 = stackOut_32_1;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_33_0 > stackIn_33_1) {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var17 = a.field_r[var16];
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_39_0 = var17;
                              stackOut_39_1 = var16 << 4;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L11;
                            }
                            L14: {
                              var18 = stackIn_40_0 + stackIn_40_1;
                              hb.field_Vb[var18] = var8;
                              a.field_r[var16] = var17 + 1;
                              if (param0.field_B <= 0) {
                                break L14;
                              } else {
                                if (param0.field_Q == null) {
                                  break L14;
                                } else {
                                  nm.field_Nb[param0.field_Q[var8]] = nm.field_Nb[param0.field_Q[var8]] + 1;
                                  break L14;
                                }
                              }
                            }
                            ta.field_d = ta.field_d + 1;
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = -1;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_49_0 <= ~param0.field_B) {
                    break L16;
                  } else {
                    if (null != param0.field_Q) {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (~nm.field_Nb.length >= ~var9) {
                          break L16;
                        } else {
                          var10 = nm.field_Nb[var9];
                          nm.field_Nb[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                if (param3 >= 44) {
                  break L15;
                } else {
                  field_b = null;
                  break L15;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("em.A(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L18;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 90) {
                break L1;
              } else {
                int[] discarded$1 = em.a(107, 61, (byte) -72);
                break L1;
              }
            }
            var3_int = sk.a(param1, -104);
            var4 = ue.a(param1, 92);
            var5 = sk.a(param0, -122);
            var6 = ue.a(param0, -63);
            var7 = (int)((long)var5 * (long)var3_int >> 16);
            var8 = (int)((long)var6 * (long)var3_int >> 16);
            var9 = (int)((long)var5 * (long)var4 >> 16);
            var10 = (int)((long)var6 * (long)var4 >> 16);
            stackOut_3_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "em.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, ji param1) {
        RuntimeException runtimeException = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ck(param1.a(0, "", "final_frame.jpg"), (java.awt.Component) (Object) jh.field_b);
              var3 = var2.field_I;
              var4 = var2.field_H;
              uh.a(-9074);
              re.field_r = new ck(var3, 3 * var4 / 4);
              re.field_r.a();
              var2.e(0, 0);
              qj.field_d = new ck(var3, -re.field_r.field_H + var4);
              qj.field_d.a();
              var2.e(0, -re.field_r.field_H);
              if (param0 == -113) {
                break L1;
              } else {
                int[] discarded$3 = em.a(16, 35, (byte) 0);
                break L1;
              }
            }
            qj.field_d.field_z = re.field_r.field_H;
            mk.a((byte) -5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("em.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    em(int param0, ji param1, ji param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((em) this).field_c = new la(64);
        try {
          L0: {
            L1: {
              ((em) this).field_a = param2;
              ((em) this).field_d = param1;
              if (null != ((em) this).field_d) {
                int discarded$4 = ((em) this).field_d.b(-5228, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((em) this).field_a != null) {
                int discarded$5 = ((em) this).field_a.b(-5228, 0);
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
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("em.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> has withdrawn the request to join.";
    }
}
