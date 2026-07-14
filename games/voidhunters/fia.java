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
            if (-1 <= (ch.field_p ^ -1)) {
              break L0;
            } else {
              ch.field_p = ch.field_p - 1;
              var2_ref_byte__ = fpb.field_d[ch.field_p - 1];
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
              hoa.field_o = hoa.field_o - 1;
              var2_ref_byte__ = vcb.field_E[hoa.field_o - 1];
              vcb.field_E[hoa.field_o] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var2 = -5 % ((51 - param0) / 54);
          if ((param1 ^ -1) != -30001) {
            break L2;
          } else {
            if (nma.field_a > 0) {
              nma.field_a = nma.field_a - 1;
              var3_ref_byte__ = npa.field_b[nma.field_a - 1];
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
        if (!jeb.a(param1, param0, param3, param4, (byte) -82)) {
            return false;
        }
        int var6 = -8 % ((param2 - 36) / 44);
        if (!(-2 != (param1 ^ -1))) {
            param1 = 0;
        }
        waa.field_x = param4;
        ow.field_b = param1;
        CharSequence var8 = (CharSequence) (Object) param4;
        nkb.field_o = jwa.a(false, var8);
        lsa.field_f = param3;
        tjb var7 = nwa.a(jwa.field_k, param0, 0, ej.field_a, wdb.field_Ab);
        sl.a((byte) -28, var7);
        return true;
    }

    final static void a(boolean param0) {
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
        int[] var34 = null;
        int[] var35 = null;
        L0: {
          var14 = VoidHunters.field_G;
          if (si.field_o[80]) {
            L1: {
              if (!khb.field_b) {
                au.field_c = (1 + au.field_c) % 3;
                break L1;
              } else {
                break L1;
              }
            }
            khb.field_b = true;
            break L0;
          } else {
            L2: {
              if (si.field_o[87]) {
                break L2;
              } else {
                if (tcb.field_o > -1) {
                  break L2;
                } else {
                  L3: {
                    if (si.field_o[88]) {
                      break L3;
                    } else {
                      if (-1 < tcb.field_o) {
                        break L3;
                      } else {
                        if (!si.field_o[9]) {
                          if (!si.field_o[5]) {
                            if (!si.field_o[97]) {
                              if (!si.field_o[96]) {
                                if (si.field_o[85]) {
                                  if (!khb.field_b) {
                                    if ((fe.field_p ^ -1) <= -1) {
                                      L4: {
                                        if ((au.field_c ^ -1) != -3) {
                                          break L4;
                                        } else {
                                          var17 = uob.field_g[uob.field_g.length + -1];
                                          if (1 < var17.length) {
                                            var34 = new int[var17.length + -2];
                                            var30 = var34;
                                            var26 = var30;
                                            var18 = var26;
                                            var2 = var18;
                                            var3_int = 0;
                                            L5: while (true) {
                                              if (var34.length <= var3_int) {
                                                uob.field_g[uob.field_g.length - 1] = var34;
                                                khb.field_b = true;
                                                break L0;
                                              } else {
                                                var2[var3_int] = var17[var3_int];
                                                var3_int++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      khb.field_b = true;
                                      break L0;
                                    } else {
                                      khb.field_b = true;
                                      break L0;
                                    }
                                  } else {
                                    khb.field_b = true;
                                    break L0;
                                  }
                                } else {
                                  if (si.field_o[41]) {
                                    L6: {
                                      if (khb.field_b) {
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    khb.field_b = true;
                                    break L0;
                                  } else {
                                    khb.field_b = false;
                                    break L0;
                                  }
                                }
                              } else {
                                L7: {
                                  if (!khb.field_b) {
                                    uob.field_g = new int[1][0];
                                    fe.field_p = fe.field_p - 1;
                                    hw.field_d = new int[1][0];
                                    if (fe.field_p >= -1) {
                                      break L7;
                                    } else {
                                      fe.field_p = hab.field_g.length + -1;
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                khb.field_b = true;
                                break L0;
                              }
                            } else {
                              L8: {
                                if (khb.field_b) {
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              khb.field_b = true;
                              break L0;
                            }
                          } else {
                            L9: {
                              if (!khb.field_b) {
                                nkb.a(false, "Saving content data");
                                web.a(-118);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            khb.field_b = true;
                            break L0;
                          }
                        } else {
                          L10: {
                            if (!khb.field_b) {
                              System.out.println("Reloading game types");
                              dva.e((byte) 113);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          khb.field_b = true;
                          break L0;
                        }
                      }
                    }
                  }
                  L11: {
                    if (khb.field_b) {
                      break L11;
                    } else {
                      ql.field_o = ql.field_o / 2.0f;
                      break L11;
                    }
                  }
                  khb.field_b = true;
                  break L0;
                }
              }
            }
            L12: {
              if (khb.field_b) {
                break L12;
              } else {
                ql.field_o = ql.field_o * 2.0f;
                break L12;
              }
            }
            khb.field_b = true;
            break L0;
          }
        }
        L13: {
          if (!si.field_o[33]) {
            break L13;
          } else {
            de.field_o = de.field_o - 8.0f / ql.field_o;
            break L13;
          }
        }
        L14: {
          if (!si.field_o[50]) {
            break L14;
          } else {
            gt.field_p = gt.field_p + 8.0f / ql.field_o;
            break L14;
          }
        }
        L15: {
          if (!param0) {
            break L15;
          } else {
            field_a = null;
            break L15;
          }
        }
        L16: {
          if (!si.field_o[49]) {
            break L16;
          } else {
            de.field_o = de.field_o + 8.0f / ql.field_o;
            break L16;
          }
        }
        L17: {
          if (si.field_o[48]) {
            gt.field_p = gt.field_p - 8.0f / ql.field_o;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if ((fe.field_p ^ -1) <= -1) {
            var19 = hab.field_g[fe.field_p];
            if (var19 == null) {
              break L18;
            } else {
              var21 = new lta();
              var21.field_b = de.field_o;
              var21.field_c = gt.field_p;
              var21.field_a = ql.field_o;
              if (au.field_c != 1) {
                if (-3 == (au.field_c ^ -1)) {
                  L19: {
                    var23 = uob.field_g[-1 + uob.field_g.length];
                    var3 = var23;
                    var4 = var21.a(true, pk.field_o);
                    var5 = var21.a(0, noa.field_q);
                    if (ujb.field_c == 1) {
                      if (si.field_o[81]) {
                        uob.field_g[-1 + uob.field_g.length] = qi.a(var4, false, var23, (byte) -14);
                        uob.field_g[-1 + uob.field_g.length] = qi.a(var5, false, uob.field_g[-1 + uob.field_g.length], (byte) -14);
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-3 == (ujb.field_c ^ -1)) {
                      var6_ref_int____ = new int[uob.field_g.length + 1][];
                      var7 = 0;
                      L21: while (true) {
                        if (uob.field_g.length <= var7) {
                          var6_ref_int____[uob.field_g.length] = new int[0];
                          uob.field_g = var6_ref_int____;
                          break L20;
                        } else {
                          var6_ref_int____[var7] = uob.field_g[var7];
                          var7++;
                          continue L21;
                        }
                      }
                    } else {
                      break L20;
                    }
                  }
                  if (sab.field_o == 1) {
                    var6 = -1;
                    var7 = 2147483647;
                    var8 = 0;
                    L22: while (true) {
                      if (var23.length <= var8) {
                        if (0 == (var6 ^ -1)) {
                          break L18;
                        } else {
                          L23: {
                            if (si.field_o[83]) {
                              var8 = fnb.field_b / 2;
                              var5 = var8 * (var5 / var8);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          var23[var6] = var4;
                          var3[1 + var6] = var5;
                          break L18;
                        }
                      } else {
                        var9 = var23[var8];
                        var10 = var3[1 + var8];
                        var11 = var9 + -var4;
                        var12 = var10 + -var5;
                        var13 = ar.a(var11, (byte) 106, var12);
                        if (var7 > var13) {
                          var6 = var8;
                          var7 = var13;
                          var8 += 2;
                          continue L22;
                        } else {
                          var8 += 2;
                          continue L22;
                        }
                      }
                    }
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              } else {
                L24: {
                  if (1 != ujb.field_c) {
                    break L24;
                  } else {
                    var3_int = -1;
                    var4 = 2147483647;
                    var35 = var19.field_v;
                    var31 = var35;
                    var27 = var31;
                    var20 = var27;
                    var5_ref_int__ = var20;
                    var6 = 0;
                    L25: while (true) {
                      if (var35.length <= var6) {
                        if (-1 != var3_int) {
                          nkb.a(false, "Adding point " + var3_int);
                          var22 = hw.field_d[-1 + hw.field_d.length];
                          hw.field_d[-1 + hw.field_d.length] = qi.a(var3_int, true, var22, (byte) -14);
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        var7 = var35[var6];
                        var8 = var5_ref_int__[var6 + 1];
                        var9 = var21.a(var7, (byte) 125);
                        var10 = var21.b(true, var8);
                        var11 = ar.a(-pk.field_o + var9, (byte) 119, var10 - noa.field_q);
                        if (var11 < var4) {
                          var4 = var11;
                          var3_int = var6 >> 677879169;
                          var6 += 2;
                          continue L25;
                        } else {
                          var6 += 2;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                if (-3 != (ujb.field_c ^ -1)) {
                  break L18;
                } else {
                  var3_array = new int[1 + hw.field_d.length][];
                  var4 = 0;
                  L26: while (true) {
                    if (var4 >= hw.field_d.length) {
                      var3_array[hw.field_d.length] = new int[0];
                      hw.field_d = var3_array;
                      break L18;
                    } else {
                      var3_array[var4] = hw.field_d[var4];
                      var4++;
                      continue L26;
                    }
                  }
                }
              }
            }
          } else {
            break L18;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -14) {
            field_a = null;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "One team wins by getting their turret to the escape zone";
    }
}
