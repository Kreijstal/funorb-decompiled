/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qt extends js {
    static int[] field_r;
    private String field_s;
    private int field_p;
    private int field_q;
    static ut field_u;
    private String field_w;
    private io[] field_v;
    private int field_t;
    static String field_z;
    private int field_g;
    ko field_x;
    static String field_k;
    io[] field_i;
    static String field_h;
    int field_j;
    static int field_l;
    static gq field_y;
    private int field_o;
    private boolean field_m;
    static hd field_n;

    private final boolean e(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != 83) {
            field_n = null;
        }
        for (var2 = 0; ((qt) this).field_i.length > var2; var2++) {
            if (7 == ((qt) this).field_i[var2].field_m) {
                return true;
            }
        }
        return false;
    }

    final boolean a(qt param0, int param1) {
        if (param1 != -4319) {
            ((qt) this).a(false, -69);
        }
        return param0.field_q > ((qt) this).field_q ? true : false;
    }

    final void d(byte param0) {
        int var2 = 0;
        if ((((qt) this).field_c ^ -1) == -25) {
            var2 = 12;
        }
        if (param0 <= 41) {
            field_y = null;
        }
        if (!(-26 != (((qt) this).field_c ^ -1))) {
            var2 = 14;
        }
        if ((((qt) this).field_c ^ -1) == -15) {
            var2 = 15;
        }
        if (((qt) this).field_c == 23) {
            var2 = 13;
        }
        if (!(16 != ((qt) this).field_c)) {
            var2 = 16;
        }
        if (!(((qt) this).field_c != 15)) {
            var2 = 17;
        }
        kj.a(63, var2);
    }

    int b(int param0, int param1) {
        if (param1 != -22667) {
            ((qt) this).field_p = -20;
        }
        if (((qt) this).field_i[param0].field_m == 37) {
            return wr.field_f + -50;
        }
        return 190;
    }

    void a(int param0, boolean param1) {
        int var3 = 0;
        js var3_ref_js = null;
        int var4 = 0;
        js var4_ref_js = null;
        int var5 = 0;
        ut var5_ref_ut = null;
        int var6 = 0;
        int var7 = 0;
        ut var8 = null;
        L0: {
          var7 = Kickabout.field_G;
          if (((qt) this).field_t != 0) {
            var3 = 14 + (5 * ((qt) this).field_t - 5);
            var4 = 0;
            L1: while (true) {
              if (((qt) this).field_t <= var4) {
                L2: {
                  var4 = ((qt) this).field_i[0].field_d + 14;
                  if (1 < ((qt) this).field_g) {
                    var5 = 1;
                    L3: while (true) {
                      if (((qt) this).field_g <= var5) {
                        break L2;
                      } else {
                        var4 = var4 + (14 + ((qt) this).field_i[var5].field_d);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = ((qt) this).b(0, -22667) - (((qt) this).field_i[0].field_d >> 1571527937);
                var6 = ((qt) this).a(60, 0) + -(((qt) this).field_i[0].field_h >> 1077054785);
                var5 = var5 - 7 + ((qt) this).field_j;
                var6 = var6 + -7;
                on.a(var5, var6, var4, var3, 12, 0, 128);
                break L0;
              } else {
                var3 = var3 + ((qt) this).field_i[var4].field_h;
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 == -5) {
          L4: {
            if (-1 != ((qt) this).field_o) {
              var3 = -((((qt) this).field_j << -747328762) / 640);
              var8 = ug.field_b[((qt) this).field_o][1];
              var5_ref_ut = ug.field_b[((qt) this).field_o][0];
              var6 = 0;
              L5: while (true) {
                if (var6 >= wr.field_f - var5_ref_ut.field_o) {
                  L6: {
                    var5_ref_ut.d(-var5_ref_ut.field_o + wr.field_f, var3);
                    var6 = var3 - (-var5_ref_ut.field_v - -18);
                    if (null == ((qt) this).field_w) {
                      break L6;
                    } else {
                      un.field_d.a(((qt) this).field_w, 10, var6, 16777215, -1);
                      break L6;
                    }
                  }
                  if (null == ((qt) this).field_s) {
                    break L4;
                  } else {
                    un.field_d.c(((qt) this).field_s, ((qt) this).field_p, var6, 16777215, -1);
                    break L4;
                  }
                } else {
                  var8.d(var6, var3);
                  var6 = var6 + var8.field_o;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
          L7: {
            if (!((qt) this).field_m) {
              break L7;
            } else {
              var3_ref_js = cq.field_h;
              var4_ref_js = ra.field_G;
              if (var4_ref_js != null) {
                L8: {
                  if ((Object) (Object) var3_ref_js != this) {
                    break L8;
                  } else {
                    if (!(var4_ref_js instanceof qt)) {
                      break L8;
                    } else {
                      if (!((qt) (Object) var4_ref_js).field_m) {
                        break L8;
                      } else {
                        ai.field_E.d(0, 430);
                        break L7;
                      }
                    }
                  }
                }
                L9: {
                  var5 = (ce.field_I << 518080521) / 24;
                  if (256 >= var5) {
                    break L9;
                  } else {
                    var5 = 256;
                    break L9;
                  }
                }
                L10: {
                  if (this != (Object) (Object) cq.field_h) {
                    break L10;
                  } else {
                    var5 = -var5 + 256;
                    break L10;
                  }
                }
                ai.field_E.b(0, 430, var5);
                break L7;
              } else {
                ai.field_E.d(0, 430);
                break L7;
              }
            }
          }
          var3 = 0;
          L11: while (true) {
            if (var3 >= ((qt) this).field_x.field_a) {
              return;
            } else {
              if (((qt) this).a(var3, (byte) -95)) {
                L12: {
                  var4 = ((qt) this).b(var3, param0 + -22662) + ((qt) this).field_j;
                  var5 = ((qt) this).field_i[var3].field_m;
                  if (-8 == (var5 ^ -1)) {
                    L13: {
                      if (this != (Object) (Object) cq.field_h) {
                        break L13;
                      } else {
                        if (!(ra.field_G instanceof qt)) {
                          break L13;
                        } else {
                          if (!((qt) (Object) ra.field_G).e((byte) 83)) {
                            break L13;
                          } else {
                            var3++;
                            continue L11;
                          }
                        }
                      }
                    }
                    if ((Object) (Object) ra.field_G != this) {
                      break L12;
                    } else {
                      if (!(cq.field_h instanceof qt)) {
                        break L12;
                      } else {
                        if (!((qt) (Object) cq.field_h).e((byte) 83)) {
                          break L12;
                        } else {
                          var4 = var4 - ((qt) this).field_j;
                          break L12;
                        }
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                L14: {
                  L15: {
                    if (7 == var5) {
                      break L15;
                    } else {
                      if ((var5 ^ -1) == -44) {
                        break L15;
                      } else {
                        if (var5 == 19) {
                          break L15;
                        } else {
                          if ((var5 ^ -1) == -43) {
                            break L15;
                          } else {
                            if (var5 == 21) {
                              break L15;
                            } else {
                              if ((var5 ^ -1) == -23) {
                                break L15;
                              } else {
                                if ((var5 ^ -1) != -38) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  on.a(-4 + (var4 - (((qt) this).field_i[var3].field_d >> -618926815)), ((qt) this).a(123, var3) + (-(((qt) this).field_i[var3].field_h >> -43066271) + -4), 8 + ((qt) this).field_i[var3].field_d, 8 + ((qt) this).field_i[var3].field_h, 10, 0, 128);
                  break L14;
                }
                ((qt) this).field_i[var3].a(((qt) this).a(-106, var3), var4, 13800);
                var3++;
                continue L11;
              } else {
                var3++;
                continue L11;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        io stackIn_16_0 = null;
        io stackIn_17_0 = null;
        io stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        io stackOut_15_0 = null;
        io stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        io stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var5 = Kickabout.field_G;
            if ((((qt) this).field_x.field_e ^ -1) > -1) {
              break L1;
            } else {
              L2: {
                if (17 == ((qt) this).field_i[((qt) this).field_x.field_e].field_m) {
                  break L2;
                } else {
                  if (16 != ((qt) this).field_i[((qt) this).field_x.field_e].field_m) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        L3: {
          var4 = stackIn_6_0;
          if ((param0 ^ -1) == -14) {
            this.c(-77);
            break L3;
          } else {
            L4: {
              if (var4 == 0) {
                break L4;
              } else {
                L5: {
                  if (param0 == 96) {
                    break L5;
                  } else {
                    if (-98 == (param0 ^ -1)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  stackOut_15_0 = ((qt) this).field_i[((qt) this).field_x.field_e];
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if ((param0 ^ -1) != -97) {
                    stackOut_17_0 = (io) (Object) stackIn_17_0;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L6;
                  } else {
                    stackOut_16_0 = (io) (Object) stackIn_16_0;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L6;
                  }
                }
                ((io) (Object) stackIn_18_0).a(stackIn_18_1 != 0, -27);
                break L3;
              }
            }
            ((qt) this).field_x.d(107);
            if (0 > ((qt) this).field_x.field_e) {
              break L3;
            } else {
              if (((qt) this).field_x.c(-1)) {
                ((qt) this).field_i[((qt) this).field_x.field_e].a(-1, false);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        if (param1 <= -5) {
          return true;
        } else {
          int discarded$1 = ((qt) this).a(-115, 63);
          return true;
        }
    }

    void a(int param0, boolean param1, int param2, js param3) {
        int var5 = 0;
        L0: {
          if (param3 instanceof qt) {
            L1: {
              var5 = -param0 + 256;
              ((qt) this).field_j = var5 * (var5 * 640) >> -1768038128;
              if (!param1) {
                ((qt) this).field_j = ((qt) this).field_j - 640;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1) {
                  break L3;
                } else {
                  if (((qt) (Object) param3).a((qt) this, -4319)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (!param1) {
                break L0;
              } else {
                if (!((qt) this).a((qt) (Object) param3, -4319)) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            ((qt) this).field_j = -((qt) this).field_j;
            break L0;
          } else {
            ((qt) this).field_j = wr.field_f + -po.a((js) this, -4);
            break L0;
          }
        }
        L4: {
          if (param2 < -28) {
            break L4;
          } else {
            ((qt) this).field_j = 124;
            break L4;
          }
        }
    }

    final void b(byte param0) {
        if (!(((qt) this).field_v == null)) {
            this.a(false, ((qt) this).field_v);
        }
        if (param0 >= -94) {
            Object var3 = null;
            this.a(false, (io[]) null);
        }
    }

    final void a(String param0, int param1, int param2, int param3, String param4, io[] param5, io[] param6, int param7, boolean param8, int param9, int param10, int param11) {
        ((qt) this).field_w = param0;
        ((qt) this).field_g = param2;
        ((qt) this).field_o = param9;
        ((qt) this).field_p = param7;
        ((qt) this).field_q = param11;
        ((qt) this).field_m = param8 ? true : false;
        ((qt) this).field_c = param10;
        if (param3 != -46) {
            qt.c((byte) 105);
        }
        ((qt) this).field_t = param1;
        if (param6 == null) {
            param6 = new io[]{};
        }
        ((qt) this).field_s = param4;
        if (param5 == null) {
            this.a(false, param6);
        } else {
            this.a(false, param5);
            ((qt) this).field_v = param6;
        }
    }

    void b(int param0) {
        if (param0 != -38) {
            Object var3 = null;
            boolean discarded$0 = ((qt) this).a((qt) null, 112);
        }
    }

    boolean a(int param0, byte param1) {
        if (param1 != -95) {
            ((qt) this).a(true, 92);
        }
        return true;
    }

    qt() {
        super(0);
        ((qt) this).field_j = 0;
    }

    final static boolean d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var3 = Kickabout.field_G;
        if (ks.field_e == 1) {
          L0: {
            if ((et.field_d.field_V.field_m ^ -1) != -1) {
              stackOut_67_0 = 0;
              stackIn_68_0 = stackOut_67_0;
              break L0;
            } else {
              stackOut_66_0 = 1;
              stackIn_68_0 = stackOut_66_0;
              break L0;
            }
          }
          return stackIn_68_0 != 0;
        } else {
          if (2 != ks.field_e) {
            if (ks.field_e != 3) {
              if (-5 == (ks.field_e ^ -1)) {
                L1: {
                  L2: {
                    if ((et.field_d.field_V.field_m ^ -1) != -1) {
                      break L2;
                    } else {
                      if (-4 != (et.field_d.field_V.field_s ^ -1)) {
                        break L2;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L1;
                }
                return stackIn_64_0 != 0;
              } else {
                if (5 != ks.field_e) {
                  if (-7 == (ks.field_e ^ -1)) {
                    L3: {
                      L4: {
                        if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                          break L4;
                        } else {
                          if (3 != et.field_d.field_V.field_s) {
                            break L4;
                          } else {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L3;
                    }
                    return stackIn_59_0 != 0;
                  } else {
                    if ((ks.field_e ^ -1) == -8) {
                      L5: {
                        if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L5;
                        } else {
                          stackOut_46_0 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L5;
                        }
                      }
                      var1 = stackIn_48_0;
                      var2 = 1;
                      L6: while (true) {
                        if (4 <= var2) {
                          return var1 != 0;
                        } else {
                          L7: {
                            stackOut_50_0 = var1;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_51_0 = stackOut_50_0;
                            if ((et.field_d.field_P[1][var2].field_w ^ -1) != (fm.a((byte) -27, 1) ^ -1)) {
                              stackOut_52_0 = stackIn_52_0;
                              stackOut_52_1 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              break L7;
                            } else {
                              stackOut_51_0 = stackIn_51_0;
                              stackOut_51_1 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              break L7;
                            }
                          }
                          var1 = stackIn_53_0 & stackIn_53_1;
                          var2++;
                          continue L6;
                        }
                      }
                    } else {
                      if (8 != ks.field_e) {
                        if (9 != ks.field_e) {
                          if (ks.field_e != 10) {
                            if (11 == ks.field_e) {
                              L8: {
                                if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                                  stackOut_43_0 = 0;
                                  stackIn_44_0 = stackOut_43_0;
                                  break L8;
                                } else {
                                  stackOut_42_0 = 1;
                                  stackIn_44_0 = stackOut_42_0;
                                  break L8;
                                }
                              }
                              return stackIn_44_0 != 0;
                            } else {
                              L9: {
                                if (param0 == -8) {
                                  break L9;
                                } else {
                                  qt.c((byte) -118);
                                  break L9;
                                }
                              }
                              return false;
                            }
                          } else {
                            L10: {
                              if ((et.field_d.field_R[0].field_g ^ -1) != -5) {
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                break L10;
                              } else {
                                stackOut_36_0 = 1;
                                stackIn_38_0 = stackOut_36_0;
                                break L10;
                              }
                            }
                            return stackIn_38_0 != 0;
                          }
                        } else {
                          L11: {
                            L12: {
                              if (0 != et.field_d.field_V.field_m) {
                                break L12;
                              } else {
                                if (-2 != (et.field_d.field_V.field_s ^ -1)) {
                                  break L12;
                                } else {
                                  stackOut_31_0 = 1;
                                  stackIn_33_0 = stackOut_31_0;
                                  break L11;
                                }
                              }
                            }
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L11;
                          }
                          return stackIn_33_0 != 0;
                        }
                      } else {
                        L13: {
                          L14: {
                            if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                              break L14;
                            } else {
                              if (-761 <= (ld.field_f.f(-115) ^ -1)) {
                                break L14;
                              } else {
                                if (-1001 <= (ld.field_f.a(true) ^ -1)) {
                                  break L14;
                                } else {
                                  stackOut_25_0 = 1;
                                  stackIn_27_0 = stackOut_25_0;
                                  break L13;
                                }
                              }
                            }
                          }
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          break L13;
                        }
                        return stackIn_27_0 != 0;
                      }
                    }
                  }
                } else {
                  L15: {
                    L16: {
                      if ((et.field_d.field_V.field_m ^ -1) != -1) {
                        break L16;
                      } else {
                        if (et.field_d.field_V.field_s != 1) {
                          break L16;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L15;
                        }
                      }
                    }
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L15;
                  }
                  return stackIn_18_0 != 0;
                }
              }
            } else {
              L17: {
                L18: {
                  if (790 >= mh.field_k.f(param0 + -85)) {
                    break L18;
                  } else {
                    if (1000 >= mh.field_k.a(true)) {
                      break L18;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L17;
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L17;
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L19: {
              if (-286 >= (mh.field_k.a(true) ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L19;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L19;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    void a(boolean param0, int param1) {
        if (param1 <= 99) {
            ((qt) this).field_v = null;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        for (var4 = 0; var4 < ((qt) this).field_i.length; var4++) {
            var5 = ((qt) this).field_i[var4].field_d;
            var6 = ((qt) this).field_i[var4].field_h;
            var7 = ((qt) this).b(var4, -22667) - (var5 >> 104415105) - -((qt) this).field_j;
            var8 = -(var6 >> -697512511) + ((qt) this).a(31, var4);
            if (!(!((qt) this).a(var4, (byte) -95))) {
                if (!(param0 < var7)) {
                    if (!(var5 + var7 <= param0)) {
                        if (!(param1 < var8)) {
                            if (!(var8 - -var6 <= param1)) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        if (param2 < 29) {
            return 43;
        }
        return -1;
    }

    void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          L1: {
            var8 = Kickabout.field_G;
            stackOut_0_0 = param1;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (ec.field_e) {
              break L1;
            } else {
              stackOut_1_0 = stackIn_1_0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (an.field_d) {
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L0;
              }
            }
          }
          stackOut_3_0 = stackIn_3_0;
          stackOut_3_1 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          break L0;
        }
        L2: {
          param1 = stackIn_4_0 & stackIn_4_1 != 0;
          if (!param1) {
            ((qt) this).field_x.field_e = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            L4: {
              var3 = this.a(wt.field_x, us.field_j, (byte) 30);
              ((qt) this).field_x.a(-21174, var3, this.a(dn.field_yb, kf.field_Eb, (byte) 110));
              if (0 == (var3 ^ -1)) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = ((qt) this).field_i[var3].field_m;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            var4 = stackIn_11_0;
            if (var4 == -1) {
              break L3;
            } else {
              if (null != fa.field_g[var4]) {
                qd.a((byte) -67, fa.field_g[var4]);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        var9 = 0;
        var3 = var9;
        L5: while (true) {
          if (((qt) this).field_i.length <= var9) {
            var4 = -54 % ((38 - param0) / 60);
            return;
          } else {
            L6: {
              if (var9 != ((qt) this).field_x.field_e) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L6;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L6;
              }
            }
            L7: {
              var4 = stackIn_20_0;
              if (var4 != 0) {
                if (((qt) this).field_x.c(-1)) {
                  stackOut_24_0 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = 0;
                  stackIn_26_0 = stackOut_23_0;
                  break L7;
                }
              } else {
                stackOut_21_0 = 0;
                stackIn_26_0 = stackOut_21_0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_26_0;
              if (var4 != 0) {
                if (((qt) this).field_x.a(0)) {
                  stackOut_30_0 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L8;
                } else {
                  stackOut_29_0 = 0;
                  stackIn_32_0 = stackOut_29_0;
                  break L8;
                }
              } else {
                stackOut_27_0 = 0;
                stackIn_32_0 = stackOut_27_0;
                break L8;
              }
            }
            var6 = stackIn_32_0;
            var7 = wt.field_x + -((qt) this).b(var9, -22667);
            ((qt) this).field_i[var9].a(var4 != 0, var5 != 0, var6 != 0, 16, var7);
            var9++;
            continue L5;
          }
        }
    }

    final static void a(int param0) {
        np.field_Jb.a((gn) (Object) new qq(), 3);
        if (param0 != 16144) {
            boolean discarded$0 = qt.d(-47);
        }
    }

    void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        io var6 = null;
        int var7 = Kickabout.field_G;
        ((qt) this).field_x.a(-1, 0, param1, param2);
        io[] var8 = ((qt) this).field_i;
        io[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            var6.a(false, false, false, 16, 0);
        }
        if (param0 == ((qt) this).field_i.length) {
            ((qt) this).field_x.field_e = -1;
        }
    }

    private final void c(int param0) {
        if (param0 <= -67) {
          L0: {
            if (0 == ((qt) this).field_c) {
              break L0;
            } else {
              if (18 != ((qt) this).field_c) {
                vj.a(106, false);
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_n = null;
        field_z = null;
        int var1 = 27 % ((param0 - -56) / 45);
        field_h = null;
        field_u = null;
        field_k = null;
        field_r = null;
    }

    int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (((qt) this).field_i[param1].field_m == 7) {
            break L0;
          } else {
            if (42 == ((qt) this).field_i[param1].field_m) {
              break L0;
            } else {
              if (-38 == (((qt) this).field_i[param1].field_m ^ -1)) {
                break L0;
              } else {
                if ((((qt) this).field_i[param1].field_m ^ -1) == -20) {
                  break L0;
                } else {
                  if ((((qt) this).field_i[param1].field_m ^ -1) == -44) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        var3 = -124 % ((param0 - -49) / 52);
                        var4 = 190;
                        if ((((qt) this).field_i[param1].field_m ^ -1) == -47) {
                          break L2;
                        } else {
                          if (48 == ((qt) this).field_i[param1].field_m) {
                            break L2;
                          } else {
                            if (-46 == (((qt) this).field_i[param1].field_m ^ -1)) {
                              break L2;
                            } else {
                              if (((qt) this).field_i[param1].field_m == 28) {
                                break L2;
                              } else {
                                if (((qt) this).field_i[param1].field_m != 26) {
                                  L3: {
                                    if (25 == ((qt) this).field_i[param1].field_m) {
                                      break L3;
                                    } else {
                                      if (3 == ((qt) this).field_i[param1].field_m) {
                                        break L3;
                                      } else {
                                        if (18 == ((qt) this).field_i[param1].field_m) {
                                          break L3;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                  var4 += 25;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4 -= 25;
                      break L1;
                    }
                    var5 = 0;
                    L4: while (true) {
                      if ((param1 ^ -1) >= (var5 ^ -1)) {
                        return var4;
                      } else {
                        var4 = var4 + ((((qt) this).field_i[var5].field_h >> -741388863) - -5 - -(((qt) this).field_i[var5 + 1].field_h >> -2050160319));
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return 469 - (((qt) this).field_i[param1].field_h >> -972877759);
    }

    private final void a(boolean param0, io[] param1) {
        ((qt) this).field_i = param1;
        if (param0) {
            return;
        }
        ((qt) this).field_x = new ko(((qt) this).field_i.length);
    }

    final static hd f(byte param0) {
        if (param0 != -63) {
            return null;
        }
        return nq.field_F.field_yb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[]{672, 100, 1294};
        field_h = "scroll down";
        field_z = "Lobby";
        field_k = "Remove friend";
    }
}
