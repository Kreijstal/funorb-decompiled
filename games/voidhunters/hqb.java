/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqb {
    llb field_b;
    private String field_g;
    private int field_c;
    static int field_f;
    aw field_i;
    private long field_d;
    static String[][] field_k;
    int field_h;
    private int[] field_e;
    String field_a;
    static String field_j;

    private final boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        L0: {
          if (param2 <= -64) {
            break L0;
          } else {
            this.b(33);
            break L0;
          }
        }
        L1: {
          var4 = null;
          if (param1 != 4) {
            if ((param1 ^ -1) == -6) {
              var4_ref = npa.a((byte) 90, this.field_a, param0);
              break L1;
            } else {
              if (6 != param1) {
                if (7 == param1) {
                  var4_ref = iab.a(param0, this.field_g, this.field_a, (byte) -76);
                  break L1;
                } else {
                  return false;
                }
              } else {
                var4_ref = tba.a(2, this.field_a, param0);
                break L1;
              }
            }
          } else {
            var4_ref = ukb.a(this.field_a, param0, 9602);
            break L1;
          }
        }
        L2: {
          if (var4_ref == null) {
            break L2;
          } else {
            lh.a((byte) -112, 0, (String) null, this.field_a, var4_ref, 2);
            break L2;
          }
        }
        return true;
    }

    private final boolean a(byte param0, int param1, int param2) {
        if (param0 != 16) {
            field_f = 14;
        }
        if (17 != param1) {
            return false;
        }
        crb.field_v = new bwa(this.field_b.field_M, this.field_b.field_u, this.field_b.field_hb, this.field_b.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, this.field_a, this.field_d);
        return true;
    }

    private final boolean b(byte param0, int param1, int param2) {
        boolean discarded$2 = false;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (-1 != (param2 ^ -1)) {
            if (param2 != 1) {
              if ((param2 ^ -1) != -3) {
                if (-4 != (param2 ^ -1)) {
                  if ((param2 ^ -1) != -11) {
                    if ((param2 ^ -1) == -16) {
                      mia.a(param1, this.field_h, 91);
                      break L0;
                    } else {
                      if (16 != param2) {
                        return false;
                      } else {
                        mia.a(param1, 0, 53);
                        break L0;
                      }
                    }
                  } else {
                    jua.a(this.field_h, param1, 20694);
                    break L0;
                  }
                } else {
                  sh.a(this.field_h, -1, param1);
                  break L0;
                }
              } else {
                pa.a(param1, (byte) -128, this.field_h);
                break L0;
              }
            } else {
              pe.a(param1, this.field_d, param0 ^ -25);
              break L0;
            }
          } else {
            ut.a(6, this.field_d, param1);
            break L0;
          }
        }
        if (param0 == 99) {
          return true;
        } else {
          discarded$2 = this.a((byte) 32, 2, 100);
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 > param0) {
              if (1 + param0 >= param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 + 5 >= param2) {
                    break L1;
                  } else {
                    if (param6 == param1) {
                      break L1;
                    } else {
                      var7_int = (1 & (param6 & param1)) + ((param6 >> -1515240959) - -(param1 >> 266938081));
                      var8 = param0;
                      var9 = param1;
                      var10 = param6;
                      var11 = param0;
                      L2: while (true) {
                        if (var11 >= param2) {
                          hqb.a(param0, param1, var8, param3, param4, (byte) 24, var9);
                          hqb.a(var8, var10, param2, param3, param4, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = sv.field_f[var11];
                            if (param3) {
                              stackOut_22_0 = fmb.field_o[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = hga.field_o[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var13 > var7_int) {
                              sv.field_f[var11] = sv.field_f[var8];
                              incrementValue$1 = var8;
                              var8++;
                              sv.field_f[incrementValue$1] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            } else {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L5: while (true) {
                  if (param0 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param0;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = sv.field_f[var8];
                          var10 = sv.field_f[1 + var8];
                          if (!dla.a(param5 + 103, param3, var10, var9)) {
                            break L7;
                          } else {
                            sv.field_f[var8] = var10;
                            sv.field_f[1 + var8] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "hqb.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int[] param2) {
        String discarded$1 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        vu var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        String var8 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_a == null) {
                break L1;
              } else {
                L2: {
                  if ((wqa.field_a ^ -1L) != (this.field_d ^ -1L)) {
                    break L2;
                  } else {
                    if (param1 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (iwa.field_b != 2) {
                  break L1;
                } else {
                  L3: {
                    var8 = this.b((byte) -63);
                    var4_ref = var8;
                    var5 = di.a(this.field_a, 0);
                    var6 = ltb.a((byte) -94, this.field_a) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        this.field_i.a(isa.a(knb.field_r, new String[]{var8}, 93), (byte) -53, 4);
                        this.field_i.a(isa.a(uda.field_c, new String[]{var8}, 104), (byte) -53, 6);
                        if (param2 == null) {
                          break L3;
                        } else {
                          if ((param1 ^ -1) == -3) {
                            break L3;
                          } else {
                            if (erb.field_p) {
                              break L3;
                            } else {
                              this.field_e = param2;
                              this.field_i.a(isa.a(raa.field_q, new String[]{var8}, 87), (byte) -53, 19);
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (qs.a(0, this.field_a)) {
                          break L5;
                        } else {
                          if (erb.field_p) {
                            break L5;
                          } else {
                            L6: {
                              if (hb.field_c) {
                                break L6;
                              } else {
                                this.field_i.a(isa.a(qia.field_o, new String[]{var8}, 104), (byte) -53, 8);
                                break L6;
                              }
                            }
                            this.field_i.a(isa.a(eha.field_p, new String[]{var8}, 112), (byte) -53, 18);
                            if (param2 != null) {
                              this.field_e = param2;
                              this.field_i.a(isa.a(raa.field_q, new String[]{var8}, 73), (byte) -53, 19);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_i.a(isa.a(dfb.field_o, new String[]{var8}, 114), (byte) -53, 5);
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    this.field_i.a(isa.a(lu.field_c, new String[]{var8}, 80), (byte) -53, 7);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (param0 < -13) {
                break L7;
              } else {
                var7 = (CharSequence) null;
                discarded$1 = hqb.a(false, (byte) -9, (CharSequence) null);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("hqb.M(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        String stackOut_30_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_10_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == 43) {
              if (param2 != null) {
                L1: {
                  var3_int = param2.length();
                  if (var3_int < 1) {
                    break L1;
                  } else {
                    if (var3_int > 12) {
                      break L1;
                    } else {
                      L2: {
                        var4 = jwa.a(false, param2);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (-2 >= (var4.length() ^ -1)) {
                            L3: {
                              if (fg.a(var4.charAt(0), 56)) {
                                break L3;
                              } else {
                                if (!fg.a(var4.charAt(var4.length() - 1), param1 ^ 79)) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param2.length()) {
                                      if (0 < var5) {
                                        stackOut_35_0 = kma.field_d;
                                        stackIn_36_0 = stackOut_35_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param2.charAt(var6);
                                        if (fg.a((char) var7, 45)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if ((var5 ^ -1) > -3) {
                                          break L6;
                                        } else {
                                          if (!param0) {
                                            stackOut_30_0 = amb.field_a;
                                            stackIn_31_0 = stackOut_30_0;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_20_0 = kma.field_d;
                            stackIn_21_0 = stackOut_20_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_15_0 = bka.field_o;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackOut_10_0 = bka.field_o;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = bka.field_o;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("hqb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        String discarded$0 = null;
        field_k = (String[][]) null;
        if (param0 > -103) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = hqb.a(true, (byte) -64, (CharSequence) null);
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        this.field_i.b(param1, 39);
        if (param0 != 1) {
            field_f = 4;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        boolean discarded$28 = false;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param2 == -17791) {
            break L0;
          } else {
            this.field_a = (String) null;
            break L0;
          }
        }
        L1: {
          if (param1 != 8) {
            if (18 == param1) {
              bab.a(this.field_a, this.field_d, 63);
              break L1;
            } else {
              if ((param1 ^ -1) == -12) {
                mea.a(0, (byte) -118, param0, this.field_c);
                break L1;
              } else {
                if (param1 == 12) {
                  mea.a(1, (byte) -123, param0, this.field_c);
                  break L1;
                } else {
                  if (-14 == (param1 ^ -1)) {
                    mea.a(2, (byte) -105, param0, this.field_c);
                    break L1;
                  } else {
                    if (param1 != 14) {
                      if (param1 != 20) {
                        if (19 != param1) {
                          return false;
                        } else {
                          discarded$28 = fia.a(this.field_e, this.field_c, (byte) 105, this.field_d, this.field_a);
                          return true;
                        }
                      } else {
                        or.a(0);
                        break L1;
                      }
                    } else {
                      km.e(1);
                      break L1;
                    }
                  }
                }
              }
            }
          } else {
            ir.a((byte) 39, this.field_d, this.field_a);
            break L1;
          }
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        jk var4 = null;
        String var5 = null;
        int var6 = 0;
        jk var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 > 1) {
            break L0;
          } else {
            this.field_b = (llb) null;
            break L0;
          }
        }
        L1: {
          if (this.field_a == null) {
            break L1;
          } else {
            if (wqa.field_a == this.field_d) {
              break L1;
            } else {
              if (null == lqa.field_o) {
                break L1;
              } else {
                if (!nmb.b(-45)) {
                  break L1;
                } else {
                  var7 = pdb.a((byte) 80, this.field_d);
                  var4 = pjb.a(this.field_d, true);
                  var5 = this.b((byte) -128);
                  if (var4 == null) {
                    if (var7 == null) {
                      break L1;
                    } else {
                      if (!lqa.field_o.field_Gb) {
                        break L1;
                      } else {
                        if (lqa.field_o.field_zb < lqa.field_o.field_Fb) {
                          if (!var7.field_Eb) {
                            L2: {
                              if (!param0) {
                                break L2;
                              } else {
                                if (!var7.field_Fb) {
                                  break L2;
                                } else {
                                  this.field_i.a(isa.a(ica.field_p, new String[]{var5}, 121), (byte) -53, 0);
                                  this.field_i.a(isa.a(aib.field_b, new String[]{var5}, 75), (byte) -53, 1);
                                  break L1;
                                }
                              }
                            }
                            this.field_i.a(isa.a(ina.field_o, new String[]{var5}, 94), (byte) -53, 0);
                            break L1;
                          } else {
                            this.field_i.a(isa.a(ts.field_a, new String[]{var5}, 115), (byte) -53, 1);
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if (!lqa.field_o.field_fc) {
                        break L3;
                      } else {
                        if (lqa.field_o.field_Ub >= 0) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.field_i.a(isa.a(ib.field_o, new String[]{var5}, 106), (byte) -53, 1);
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final void a(pgb param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param0.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 > 73) {
                L1: {
                  this.field_c = param0.field_a;
                  if (param0.field_a == 0) {
                    L2: {
                      if (kib.field_d == 0) {
                        this.field_i.a(vv.field_a, (byte) -53, 12);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    this.field_i.a(tda.field_M, (byte) -53, 13);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (1 == param0.field_a) {
                    L4: {
                      if (0 != idb.field_p) {
                        break L4;
                      } else {
                        this.field_i.a(gbb.field_p, (byte) -53, 12);
                        break L4;
                      }
                    }
                    this.field_i.a(ocb.field_j, (byte) -53, 13);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (-3 != (param0.field_a ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (0 == lla.field_h) {
                        this.field_i.a(bga.field_o, (byte) -53, 12);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    this.field_i.a(uta.field_o, (byte) -53, 13);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (runtimeException);
            stackOut_22_1 = new StringBuilder().append("hqb.I(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
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

    private final String b(byte param0) {
        String var2 = null;
        if (param0 >= -24) {
            return (String) null;
        }
        if (this.field_g == null) {
            var2 = this.field_a;
        } else {
            var2 = this.field_g;
        }
        return var2;
    }

    final void a(boolean param0) {
        String var3 = null;
        int var4 = 0;
        mm var5 = null;
        var4 = VoidHunters.field_G;
        if (param0) {
          L0: {
            if (lqa.field_o == null) {
              var5 = meb.a(this.field_h, 1);
              if (var5 != null) {
                var3 = var5.field_Vb;
                if (!var5.field_ac) {
                  L1: {
                    if (var5.field_cc) {
                      this.field_i.a(isa.a(ti.field_g, new String[]{var3}, 101), (byte) -53, 2);
                      break L1;
                    } else {
                      if (var5.field_Qb) {
                        break L1;
                      } else {
                        if (!var5.field_Gb) {
                          break L1;
                        } else {
                          L2: {
                            if (!var5.field_fc) {
                              break L2;
                            } else {
                              if (!var5.field_cc) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          this.field_i.a(isa.a(ue.field_c, new String[]{var3}, 107), (byte) -53, 2);
                          break L1;
                        }
                      }
                    }
                  }
                  if (var5.field_Qb) {
                    this.field_i.a(isa.a(t.field_e, new String[]{var3}, 126), (byte) -53, 3);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  this.field_i.a(isa.a(rib.field_o, new String[]{var3}, 127), (byte) -53, 2);
                  this.field_i.a(isa.a(nrb.field_a, new String[]{var3}, 127), (byte) -53, 3);
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_i.a(param1 + 17, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$1 = this.b((byte) 99, param2, var6);
        if (param1 != -11) {
            this.b(26);
        }
        boolean discarded$2 = this.a(param3, var6, -111);
        boolean discarded$3 = this.b(param3, var6, -17791);
        boolean discarded$4 = this.a((byte) 16, var6, param4);
        return true;
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_i == null) {
                break L1;
              } else {
                if (!this.field_i.e((byte) -126)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0) {
        String var3 = null;
        if (this.field_a != null) {
            if (wqa.field_a != this.field_d) {
                var3 = this.b((byte) -110);
                String var2 = var3;
                this.field_i.a(isa.a(ona.field_l, new String[]{var3}, 83), (byte) -53, 17);
            }
        }
        if (param0 != -9923) {
            this.a(-125, false);
        }
    }

    hqb(llb param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_i = new aw(aba.field_a);
            this.field_d = param1;
            this.field_b = param0;
            this.field_g = param3;
            param0.field_J = true;
            this.field_a = param2;
            this.field_c = param5;
            this.field_h = param4;
            this.field_e = param6;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hqb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = 0;
        field_j = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
