/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void a(int param0) {
        mi var1 = null;
        try {
            var1 = (mi) (Object) k.field_d.b(-8980);
            if (var1 == null) {
                var1 = new mi();
            }
            var1.a(em.field_j, (byte) 29, em.field_k, em.field_b, em.field_a, em.field_d, em.field_i, em.field_l);
            int var2 = 28 % ((param0 - -72) / 49);
            re.field_q.a(-12328, (hg) (Object) var1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hf.E(" + param0 + ')');
        }
    }

    final static String b(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_21_0 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + g.field_q + " " + f.field_t + " " + jj.field_b + ") " + cd.field_v;
                if (hi.field_r <= 0) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~var2 <= ~hi.field_r) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & om.field_g.field_g[var2];
                      var4 = var3 >> -1780804028;
                      stackOut_4_0 = var4;
                      stackOut_4_1 = 10;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 < stackIn_5_1) {
                              break L5;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 48;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 >= 10) {
                              break L7;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 55;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 96;
              stackOut_20_1 = (-24 - param0) / 38;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            var2 = stackIn_21_0 / stackIn_21_1;
            stackOut_21_0 = (String) var1_ref;
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "hf.A(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 62) {
              L1: {
                L2: {
                  if (this == (Object) (Object) mc.field_b) {
                    break L2;
                  } else {
                    if ((Object) (Object) rn.field_c == this) {
                      break L2;
                    } else {
                      if (this != (Object) (Object) ck.field_t) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_13_0 = stackOut_10_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "hf.B(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static byte[] a(mf param0, int[] param1, int param2, int param3, mf param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        mf var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_8_0 = null;
        mf stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        byte[] stackIn_20_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_12_0 = null;
        mf stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        byte[] stackOut_21_0 = null;
        byte[] stackOut_19_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (param5 >= 92) {
                break L1;
              } else {
                field_b = -32;
                break L1;
              }
            }
            L2: {
              var6_int = je.a(false, param3);
              if (param2 < 0) {
                break L2;
              } else {
                if (var6_int > param2) {
                  L3: {
                    var7 = dh.field_e[param3];
                    if (var7 != 2) {
                      stackOut_12_0 = (mf) param0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_10_0 = (mf) param4;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  var8 = stackIn_13_0;
                  if (var8 == null) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  } else {
                    var9 = ja.field_e[param3].toLowerCase();
                    var10 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
                    var10 = rd.a((byte) 72, var10);
                    var10 = var9 + "_" + var10;
                    var9 = "";
                    if (param1 == null) {
                      stackOut_21_0 = var8.a(-4, var10, var9);
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_19_0 = var8.a((byte) -73, var9, var10, param1);
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = null;
            stackIn_8_0 = stackOut_7_0;
            return (byte[]) (Object) stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("hf.D(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L5;
            }
          }
          L6: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param5 + ')');
        }
        return stackIn_22_0;
    }

    final static ed[] b(int param0) {
        ed[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        ed[] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        ed[] stackOut_16_0 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 >= 63) {
                break L1;
              } else {
                field_c = -0.8853374871854307;
                break L1;
              }
            }
            var1 = new ed[qk.field_j];
            var2 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 >= qk.field_j) {
                    break L4;
                  } else {
                    var3 = bc.field_a[var2] * qh.field_k[var2];
                    var4 = qe.field_a[var2];
                    var5 = new int[var3];
                    stackOut_6_0 = 0;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      var6 = stackIn_7_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~var6 <= ~var3) {
                              break L7;
                            } else {
                              var5[var6] = qk.field_f[ae.a((int) var4[var6], 255)];
                              var6++;
                              if (var7 != 0) {
                                break L6;
                              } else {
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var5);
                          var2++;
                          break L6;
                        }
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              of.a(stackIn_16_0 != 0);
              stackOut_16_0 = (ed[]) var1;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "hf.C(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final static byte a(int param0, char param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_124_0 = 0;
        int stackOut_2_0 = 0;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 > 22) {
              L1: {
                L2: {
                  L3: {
                    if (param1 <= 0) {
                      break L3;
                    } else {
                      if (param1 < 128) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1 < 160) {
                      break L4;
                    } else {
                      if (param1 <= 255) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (8364 == param1) {
                      break L5;
                    } else {
                      L6: {
                        if (param1 == 8218) {
                          break L6;
                        } else {
                          L7: {
                            if (param1 == 402) {
                              break L7;
                            } else {
                              L8: {
                                if (8222 == param1) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (param1 == 8230) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (param1 != 8224) {
                                          break L10;
                                        } else {
                                          var2_int = -122;
                                          if (var3 == 0) {
                                            break L1;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (8225 == param1) {
                                          break L11;
                                        } else {
                                          L12: {
                                            if (710 != param1) {
                                              break L12;
                                            } else {
                                              var2_int = -120;
                                              if (var3 == 0) {
                                                break L1;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (param1 == 8240) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (param1 == 352) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    if (param1 == 8249) {
                                                      break L15;
                                                    } else {
                                                      L16: {
                                                        if (param1 == 338) {
                                                          break L16;
                                                        } else {
                                                          L17: {
                                                            if (param1 != 381) {
                                                              break L17;
                                                            } else {
                                                              var2_int = -114;
                                                              if (var3 == 0) {
                                                                break L1;
                                                              } else {
                                                                break L17;
                                                              }
                                                            }
                                                          }
                                                          L18: {
                                                            if (8216 != param1) {
                                                              break L18;
                                                            } else {
                                                              var2_int = -111;
                                                              if (var3 == 0) {
                                                                break L1;
                                                              } else {
                                                                break L18;
                                                              }
                                                            }
                                                          }
                                                          L19: {
                                                            if (param1 == 8217) {
                                                              break L19;
                                                            } else {
                                                              L20: {
                                                                if (param1 != 8220) {
                                                                  break L20;
                                                                } else {
                                                                  var2_int = -109;
                                                                  if (var3 == 0) {
                                                                    break L1;
                                                                  } else {
                                                                    break L20;
                                                                  }
                                                                }
                                                              }
                                                              L21: {
                                                                if (8221 != param1) {
                                                                  break L21;
                                                                } else {
                                                                  var2_int = -108;
                                                                  if (var3 == 0) {
                                                                    break L1;
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              L22: {
                                                                if (param1 == 8226) {
                                                                  break L22;
                                                                } else {
                                                                  L23: {
                                                                    if (8211 != param1) {
                                                                      break L23;
                                                                    } else {
                                                                      var2_int = -106;
                                                                      if (var3 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  L24: {
                                                                    if (8212 != param1) {
                                                                      break L24;
                                                                    } else {
                                                                      var2_int = -105;
                                                                      if (var3 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L24;
                                                                      }
                                                                    }
                                                                  }
                                                                  L25: {
                                                                    if (param1 != 732) {
                                                                      break L25;
                                                                    } else {
                                                                      var2_int = -104;
                                                                      if (var3 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  L26: {
                                                                    if (param1 != 8482) {
                                                                      break L26;
                                                                    } else {
                                                                      var2_int = -103;
                                                                      if (var3 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  L27: {
                                                                    if (param1 == 353) {
                                                                      break L27;
                                                                    } else {
                                                                      L28: {
                                                                        if (8250 == param1) {
                                                                          break L28;
                                                                        } else {
                                                                          L29: {
                                                                            if (339 != param1) {
                                                                              break L29;
                                                                            } else {
                                                                              var2_int = -100;
                                                                              if (var3 == 0) {
                                                                                break L1;
                                                                              } else {
                                                                                break L29;
                                                                              }
                                                                            }
                                                                          }
                                                                          L30: {
                                                                            if (param1 != 382) {
                                                                              break L30;
                                                                            } else {
                                                                              var2_int = -98;
                                                                              if (var3 == 0) {
                                                                                break L1;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          L31: {
                                                                            if (param1 != 376) {
                                                                              break L31;
                                                                            } else {
                                                                              var2_int = -97;
                                                                              if (var3 == 0) {
                                                                                break L1;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          var2_int = 63;
                                                                          if (var3 == 0) {
                                                                            break L1;
                                                                          } else {
                                                                            break L28;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2_int = -101;
                                                                      if (var3 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2_int = -102;
                                                                  if (var3 == 0) {
                                                                    break L1;
                                                                  } else {
                                                                    break L22;
                                                                  }
                                                                }
                                                              }
                                                              var2_int = -107;
                                                              if (var3 == 0) {
                                                                break L1;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          var2_int = -110;
                                                          if (var3 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                      }
                                                      var2_int = -116;
                                                      if (var3 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  var2_int = -117;
                                                  if (var3 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              var2_int = -118;
                                              if (var3 == 0) {
                                                break L1;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          var2_int = -119;
                                          if (var3 == 0) {
                                            break L1;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      var2_int = -121;
                                      if (var3 == 0) {
                                        break L1;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var2_int = -123;
                                  if (var3 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var2_int = -124;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var2_int = -125;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2_int = -126;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2_int = -128;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var2_int = (byte)param1;
                break L1;
              }
              stackOut_124_0 = var2_int;
              stackIn_125_0 = stackOut_124_0;
              break L0;
            } else {
              stackOut_2_0 = -88;
              stackIn_3_0 = stackOut_2_0;
              return (byte) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "hf.F(" + param0 + ',' + param1 + ')');
        }
        return (byte) stackIn_125_0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "hf.toString()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Math.atan2(1.0, 0.0);
    }
}
