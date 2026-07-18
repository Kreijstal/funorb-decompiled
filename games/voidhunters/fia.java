/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fia {
    static String field_a;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        L0: {
          if (100 != param1) {
            break L0;
          } else {
            if (ch.field_p <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = ch.field_p - 1;
              ch.field_p = ch.field_p - 1;
              var2_ref_byte__ = fpb.field_d[fieldTemp$6];
              fpb.field_d[ch.field_p] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (0 < hoa.field_o) {
              int fieldTemp$7 = hoa.field_o - 1;
              hoa.field_o = hoa.field_o - 1;
              var2_ref_byte__ = vcb.field_E[fieldTemp$7];
              vcb.field_E[hoa.field_o] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var2 = 0;
          if (param1 != 30000) {
            break L2;
          } else {
            if (nma.field_a > 0) {
              int fieldTemp$8 = nma.field_a - 1;
              nma.field_a = nma.field_a - 1;
              var3_ref_byte__ = npa.field_b[fieldTemp$8];
              npa.field_b[nma.field_a] = null;
              return var3_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ml.field_l != null) {
            var3 = 0;
            L4: while (true) {
              if (var3 >= dia.field_o.length) {
                break L3;
              } else {
                if (dia.field_o[var3] == param1) {
                  if (0 < fbb.field_f[var3]) {
                    fbb.field_f[var3] = fbb.field_f[var3] - 1;
                    var4 = ml.field_l[var3][fbb.field_f[var3] - 1];
                    ml.field_l[var3][fbb.field_f[var3]] = null;
                    return var4;
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param1];
    }

    final static boolean a(int[] param0, int param1, byte param2, long param3, String param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        tjb var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (jeb.a(param1, param0, param3, param4, (byte) -82)) {
              L1: {
                var6_int = -8 % ((param2 - 36) / 44);
                if (param1 == 1) {
                  param1 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              waa.field_x = param4;
              ow.field_b = param1;
              var8 = (CharSequence) (Object) param4;
              nkb.field_o = jwa.a(false, var8);
              lsa.field_f = param3;
              var7 = nwa.a(jwa.field_k, param0, 0, ej.field_a, wdb.field_Ab);
              sl.a((byte) -28, var7);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("fia.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int[] var3 = null;
        int var3_int = 0;
        int[][] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[][] var6_ref_int____ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var17 = null;
        int[] var18 = null;
        wfb var19 = null;
        int[] var20 = null;
        lta var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        RuntimeException decompiledCaughtException = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (si.field_o[80]) {
                L2: {
                  if (!khb.field_b) {
                    au.field_c = (1 + au.field_c) % 3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                khb.field_b = true;
                break L1;
              } else {
                L3: {
                  if (si.field_o[87]) {
                    break L3;
                  } else {
                    if (tcb.field_o < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (si.field_o[88]) {
                          break L4;
                        } else {
                          if (tcb.field_o > 0) {
                            break L4;
                          } else {
                            if (!si.field_o[9]) {
                              if (!si.field_o[5]) {
                                if (!si.field_o[97]) {
                                  if (!si.field_o[96]) {
                                    if (si.field_o[85]) {
                                      L5: {
                                        if (!khb.field_b) {
                                          if (fe.field_p >= 0) {
                                            if (au.field_c != 2) {
                                              break L5;
                                            } else {
                                              var17 = uob.field_g[uob.field_g.length + -1];
                                              if (1 < var17.length) {
                                                var34 = new int[var17.length + -2];
                                                var30 = var34;
                                                var26 = var30;
                                                var18 = var26;
                                                var2 = var18;
                                                var3_int = 0;
                                                L6: while (true) {
                                                  if (var34.length <= var3_int) {
                                                    uob.field_g[uob.field_g.length - 1] = var34;
                                                    break L5;
                                                  } else {
                                                    var2[var3_int] = var17[var3_int];
                                                    var3_int++;
                                                    continue L6;
                                                  }
                                                }
                                              } else {
                                                break L5;
                                              }
                                            }
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      khb.field_b = true;
                                      break L1;
                                    } else {
                                      if (si.field_o[41]) {
                                        L7: {
                                          if (khb.field_b) {
                                            break L7;
                                          } else {
                                            if (fe.field_p >= 0) {
                                              if (au.field_c != 1) {
                                                if (au.field_c != 2) {
                                                  break L7;
                                                } else {
                                                  System.out.print("int[][] detail_lines=new int[][]{");
                                                  var1_int = 0;
                                                  L8: while (true) {
                                                    if (uob.field_g.length <= var1_int) {
                                                      nkb.a(false, "};");
                                                      break L7;
                                                    } else {
                                                      L9: {
                                                        if (var1_int > 0) {
                                                          System.out.print(",");
                                                          break L9;
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                      System.out.print("{");
                                                      var33 = uob.field_g[var1_int];
                                                      var3_int = 0;
                                                      L10: while (true) {
                                                        if (~var3_int <= ~var33.length) {
                                                          System.out.print("}");
                                                          var1_int++;
                                                          continue L8;
                                                        } else {
                                                          L11: {
                                                            if (var3_int <= 0) {
                                                              break L11;
                                                            } else {
                                                              System.out.print(",");
                                                              break L11;
                                                            }
                                                          }
                                                          System.out.print("" + var33[var3_int]);
                                                          var3_int++;
                                                          continue L10;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                System.out.print("int[][] convex_outlines=new int[][]{");
                                                var1_int = 0;
                                                L12: while (true) {
                                                  if (var1_int >= hw.field_d.length) {
                                                    nkb.a(false, "};");
                                                    break L7;
                                                  } else {
                                                    L13: {
                                                      if (var1_int <= 0) {
                                                        break L13;
                                                      } else {
                                                        System.out.print(",");
                                                        break L13;
                                                      }
                                                    }
                                                    System.out.print("{");
                                                    var32 = hw.field_d[var1_int];
                                                    var3_int = 0;
                                                    L14: while (true) {
                                                      if (~var3_int <= ~var32.length) {
                                                        System.out.print("}");
                                                        var1_int++;
                                                        continue L12;
                                                      } else {
                                                        L15: {
                                                          if (var3_int > 0) {
                                                            System.out.print(",");
                                                            break L15;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                        System.out.print("" + var32[var3_int]);
                                                        var3_int++;
                                                        continue L14;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        khb.field_b = true;
                                        break L1;
                                      } else {
                                        khb.field_b = false;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    L16: {
                                      if (!khb.field_b) {
                                        uob.field_g = new int[1][0];
                                        fe.field_p = fe.field_p - 1;
                                        hw.field_d = new int[1][0];
                                        if (fe.field_p >= -1) {
                                          break L16;
                                        } else {
                                          fe.field_p = hab.field_g.length + -1;
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    khb.field_b = true;
                                    break L1;
                                  }
                                } else {
                                  L17: {
                                    if (khb.field_b) {
                                      break L17;
                                    } else {
                                      fe.field_p = fe.field_p + 1;
                                      uob.field_g = new int[1][0];
                                      hw.field_d = new int[1][0];
                                      if (~hab.field_g.length < ~fe.field_p) {
                                        break L17;
                                      } else {
                                        fe.field_p = -1;
                                        break L17;
                                      }
                                    }
                                  }
                                  khb.field_b = true;
                                  break L1;
                                }
                              } else {
                                L18: {
                                  if (!khb.field_b) {
                                    nkb.a(false, "Saving content data");
                                    web.a(-118);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                khb.field_b = true;
                                break L1;
                              }
                            } else {
                              L19: {
                                if (!khb.field_b) {
                                  System.out.println("Reloading game types");
                                  dva.e((byte) 113);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              khb.field_b = true;
                              break L1;
                            }
                          }
                        }
                      }
                      L20: {
                        if (khb.field_b) {
                          break L20;
                        } else {
                          ql.field_o = ql.field_o / 2.0f;
                          break L20;
                        }
                      }
                      khb.field_b = true;
                      break L1;
                    }
                  }
                }
                L21: {
                  if (khb.field_b) {
                    break L21;
                  } else {
                    ql.field_o = ql.field_o * 2.0f;
                    break L21;
                  }
                }
                khb.field_b = true;
                break L1;
              }
            }
            L22: {
              if (!si.field_o[33]) {
                break L22;
              } else {
                de.field_o = de.field_o - 8.0f / ql.field_o;
                break L22;
              }
            }
            L23: {
              if (!si.field_o[50]) {
                break L23;
              } else {
                gt.field_p = gt.field_p + 8.0f / ql.field_o;
                break L23;
              }
            }
            L24: {
              field_a = null;
              if (!si.field_o[49]) {
                break L24;
              } else {
                de.field_o = de.field_o + 8.0f / ql.field_o;
                break L24;
              }
            }
            L25: {
              if (si.field_o[48]) {
                gt.field_p = gt.field_p - 8.0f / ql.field_o;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (fe.field_p >= 0) {
                L27: {
                  var19 = hab.field_g[fe.field_p];
                  if (var19 == null) {
                    break L27;
                  } else {
                    var21 = new lta();
                    var21.field_b = de.field_o;
                    var21.field_c = gt.field_p;
                    var21.field_a = ql.field_o;
                    if (au.field_c != 1) {
                      if (au.field_c == 2) {
                        L28: {
                          var23 = uob.field_g[-1 + uob.field_g.length];
                          var3 = var23;
                          var4 = var21.a(true, pk.field_o);
                          var5 = var21.a(0, noa.field_q);
                          if (ujb.field_c == 1) {
                            if (si.field_o[81]) {
                              uob.field_g[-1 + uob.field_g.length] = qi.a(var4, false, var23, (byte) -14);
                              uob.field_g[-1 + uob.field_g.length] = qi.a(var5, false, uob.field_g[-1 + uob.field_g.length], (byte) -14);
                              break L28;
                            } else {
                              break L28;
                            }
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (ujb.field_c == 2) {
                            var6_ref_int____ = new int[uob.field_g.length + 1][];
                            var7 = 0;
                            L30: while (true) {
                              if (uob.field_g.length <= var7) {
                                var6_ref_int____[uob.field_g.length] = new int[0];
                                uob.field_g = var6_ref_int____;
                                break L29;
                              } else {
                                var6_ref_int____[var7] = uob.field_g[var7];
                                var7++;
                                continue L30;
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                        if (sab.field_o == 1) {
                          var6 = -1;
                          var7 = 2147483647;
                          var8 = 0;
                          L31: while (true) {
                            if (var23.length <= var8) {
                              if (var6 == -1) {
                                break L27;
                              } else {
                                L32: {
                                  if (si.field_o[83]) {
                                    var8 = fnb.field_b / 2;
                                    var5 = var8 * (var5 / var8);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                var23[var6] = var4;
                                var3[1 + var6] = var5;
                                break L27;
                              }
                            } else {
                              L33: {
                                var9 = var23[var8];
                                var10 = var3[1 + var8];
                                var11 = var9 + -var4;
                                var12 = var10 + -var5;
                                var13 = ar.a(var11, (byte) 106, var12);
                                if (~var7 >= ~var13) {
                                  break L33;
                                } else {
                                  var6 = var8;
                                  var7 = var13;
                                  break L33;
                                }
                              }
                              var8 += 2;
                              continue L31;
                            }
                          }
                        } else {
                          break L26;
                        }
                      } else {
                        break L26;
                      }
                    } else {
                      L34: {
                        if (1 != ujb.field_c) {
                          break L34;
                        } else {
                          var3_int = -1;
                          var4 = 2147483647;
                          var35 = var19.field_v;
                          var31 = var35;
                          var27 = var31;
                          var20 = var27;
                          var5_ref_int__ = var20;
                          var6 = 0;
                          L35: while (true) {
                            if (~var35.length >= ~var6) {
                              if (-1 != var3_int) {
                                nkb.a(false, "Adding point " + var3_int);
                                var22 = hw.field_d[-1 + hw.field_d.length];
                                hw.field_d[-1 + hw.field_d.length] = qi.a(var3_int, true, var22, (byte) -14);
                                break L34;
                              } else {
                                break L34;
                              }
                            } else {
                              L36: {
                                var7 = var35[var6];
                                var8 = var5_ref_int__[var6 + 1];
                                var9 = var21.a(var7, (byte) 125);
                                var10 = var21.b(true, var8);
                                var11 = ar.a(-pk.field_o + var9, (byte) 119, var10 - noa.field_q);
                                if (var11 < var4) {
                                  var4 = var11;
                                  var3_int = var6 >> 1;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              var6 += 2;
                              continue L35;
                            }
                          }
                        }
                      }
                      if (ujb.field_c != 2) {
                        break L27;
                      } else {
                        var3_array = new int[1 + hw.field_d.length][];
                        var4 = 0;
                        L37: while (true) {
                          if (~var4 <= ~hw.field_d.length) {
                            var3_array[hw.field_d.length] = new int[0];
                            hw.field_d = var3_array;
                            break L26;
                          } else {
                            var3_array[var4] = hw.field_d[var4];
                            var4++;
                            continue L37;
                          }
                        }
                      }
                    }
                  }
                }
                break L26;
              } else {
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "fia.A(" + false + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "One team wins by getting their turret to the escape zone";
    }
}
