/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static ko field_c;
    String field_b;
    String[] field_o;
    int field_f;
    static int field_k;
    f field_a;
    private int field_d;
    nj field_n;
    dl field_l;
    boolean field_i;
    private int field_j;
    int field_g;
    static int field_e;
    private int field_h;
    private int field_m;

    final void b(int param0) {
        try {
            this.a(-25, 158);
            if (param0 > -33) {
                ((nj) this).field_m = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nj.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 12) {
            return;
        }
        try {
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nj.G(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        wm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_ref = jf.a(72 + (param1 - -4), 486, 0, 534, param1 + 4);
            var4 = -126 % ((71 - param0) / 38);
            if (var3_ref == null) {
              return;
            } else {
              L1: {
                if (((nj) this).field_a != null) {
                  ((nj) this).field_a.a(24, 35, 24, false, 24 + (param1 - -4), 486);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((nj) this).field_l != null) {
                  param1 -= 2;
                  ((nj) this).field_l.a(486, 12 + (param1 - -4));
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  L5: {
                    var3_ref.a((byte) -85);
                    if (((nj) this).field_i) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          L8: {
                            var5 = go.field_l.a(((nj) this).field_b);
                            var6 = ((nj) this).field_b.lastIndexOf(' ');
                            if (var6 < 0) {
                              break L8;
                            } else {
                              if (go.field_l.a(((nj) this).field_b) > 96) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var7_ref_String = ((nj) this).field_b;
                            var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                            if ((((nj) this).field_d | ((nj) this).field_j) != 0) {
                              break L9;
                            } else {
                              if ((8 & ((nj) this).field_m) == 0) {
                                var7_ref_String = var7_ref_String + '_';
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          ih.a((byte) -20, var5, var7_ref_String, 41 + (param1 - -4));
                          if (var11 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          var7_ref_String = ((nj) this).field_b.substring(0, var6);
                          var8 = ((nj) this).field_b.substring(1 + var6);
                          var9 = go.field_l.a(var7_ref_String);
                          if (var6 >= ((nj) this).field_h) {
                            break L10;
                          } else {
                            L11: {
                              var10 = go.field_l.a(var8);
                              var8 = var8.substring(0, -var6 + (((nj) this).field_h - 1));
                              if ((((nj) this).field_j | ((nj) this).field_d) != 0) {
                                break L11;
                              } else {
                                if ((((nj) this).field_m & 8) != 0) {
                                  break L11;
                                } else {
                                  var8 = var8 + '_';
                                  break L11;
                                }
                              }
                            }
                            ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 - -36));
                            ih.a((byte) -20, var10, var8, 15 + (param1 + 4 - -36));
                            if (var11 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L12: {
                          var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                          if ((((nj) this).field_d | ((nj) this).field_j) != 0) {
                            break L12;
                          } else {
                            if ((8 & ((nj) this).field_m) == 0) {
                              var7_ref_String = var7_ref_String + '_';
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 + 36));
                        break L6;
                      }
                      L13: {
                        if (((nj) this).field_l == null) {
                          break L13;
                        } else {
                          param1 -= 12;
                          break L13;
                        }
                      }
                      var7 = 0;
                      L14: while (true) {
                        L15: {
                          if (var7 >= ((nj) this).field_d) {
                            break L15;
                          } else {
                            an.field_q.a(((nj) this).field_o[var7], 486, var7 * 12 + (72 + param1 + 4) - -4 + 12, 8438015, -1);
                            var7++;
                            if (var11 != 0) {
                              break L4;
                            } else {
                              if (var11 == 0) {
                                continue L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L16: {
                          var7_ref_String = ((nj) this).field_o[((nj) this).field_d].substring(0, ((nj) this).field_j);
                          if (0 == (((nj) this).field_d | ((nj) this).field_j)) {
                            break L16;
                          } else {
                            if (0 == ((nj) this).field_g) {
                              break L16;
                            } else {
                              if ((8 & ((nj) this).field_m) != 0) {
                                break L16;
                              } else {
                                var7_ref_String = var7_ref_String + '_';
                                break L16;
                              }
                            }
                          }
                        }
                        an.field_q.a(var7_ref_String, 486, 12 * ((nj) this).field_d + (param1 + 92), 8438015, -1);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L17: {
                    L18: {
                      var5 = go.field_l.a(((nj) this).field_b);
                      var6 = ((nj) this).field_b.lastIndexOf(' ');
                      if (0 > var6) {
                        break L18;
                      } else {
                        if (96 >= var5) {
                          break L18;
                        } else {
                          var7_ref_String = ((nj) this).field_b.substring(0, var6);
                          var8 = ((nj) this).field_b.substring(var6 - -1);
                          var9 = go.field_l.a(var7_ref_String);
                          var10 = go.field_l.a(var8);
                          ih.a((byte) -20, var9, var7_ref_String, param1 - -4 - -31);
                          ih.a((byte) -20, var10, var8, 36 + param1 - -4 + 15);
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    ih.a((byte) -20, var5, ((nj) this).field_b, 36 + (param1 - -4 + 5));
                    break L17;
                  }
                  L19: {
                    if (null != ((nj) this).field_l) {
                      param1 -= 12;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var7 = 0;
                  L20: while (true) {
                    if (((nj) this).field_o.length <= var7) {
                      break L4;
                    } else {
                      an.field_q.a(((nj) this).field_o[var7], 486, 4 + (4 + param1 + 72) + (12 - -(var7 * 12)), 8438015, -1);
                      var7++;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          continue L20;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (((nj) this).field_n == null) {
                  break L3;
                } else {
                  L21: {
                    if (((nj) this).field_i) {
                      break L21;
                    } else {
                      if (0 == ((nj) this).field_g) {
                        break L21;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((nj) this).field_n.a(121, ((nj) this).field_o.length * 12 + 12 + (4 + param1) + 58);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "nj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static double[] a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int stackIn_7_0 = 0;
        double[] stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        double[] stackOut_11_0 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 39) {
                break L1;
              } else {
                field_e = -61;
                break L1;
              }
            }
            L2: {
              var3_int = (tm.field_d[0].length - 2 * param2) * 48;
              var4 = 48 * (tm.field_d.length + -(2 * param1));
              if (~var3_int > ~var4) {
                stackOut_6_0 = var4;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = var3_int;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              var6 = (double)(param2 * 48) + (double)var3_int * 0.5;
              var8 = (double)(48 * param1) + (double)var4 * 0.5;
              var10 = 24.0;
              if (var5 > 480) {
                var10 = 480.0 * var10 / (double)var5;
                var6 = var10 * var6 / 24.0;
                var8 = var8 * var10 / 24.0;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_11_0 = new double[]{var6, var8, var10};
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "nj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    private final boolean a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_39_0 = 0;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ((nj) this).field_m = 1 + ((nj) this).field_m & 15;
              if (param0 == 71) {
                break L1;
              } else {
                ((nj) this).field_a = null;
                break L1;
              }
            }
            if (((nj) this).field_g <= 0) {
              if (((nj) this).field_n == null) {
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              } else {
                ((nj) this).field_f = ((nj) this).field_f - ((nj) this).field_n.field_f;
                var2_int = ((nj) this).field_n.a((byte) 71) ? 1 : 0;
                ((nj) this).field_f = ((nj) this).field_f + ((nj) this).field_n.field_f;
                stackOut_42_0 = var2_int;
                stackIn_43_0 = stackOut_42_0;
                return stackIn_43_0 != 0;
              }
            } else {
              L2: {
                ((nj) this).field_g = ((nj) this).field_g - 1;
                if (((nj) this).field_g != 0) {
                  break L2;
                } else {
                  L3: {
                    if (~((nj) this).field_h > ~((nj) this).field_b.length()) {
                      break L3;
                    } else {
                      if (~((nj) this).field_o.length >= ~((nj) this).field_d) {
                        break L2;
                      } else {
                        L4: {
                          if (((nj) this).field_j >= ((nj) this).field_o[((nj) this).field_d].length()) {
                            break L4;
                          } else {
                            L5: {
                              L6: {
                                if (((nj) this).field_o[((nj) this).field_d].charAt(((nj) this).field_j) != 60) {
                                  break L6;
                                } else {
                                  ((nj) this).field_j = ((nj) this).field_o[((nj) this).field_d].indexOf('>', ((nj) this).field_j + 1) + 1;
                                  if (var3 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              ((nj) this).field_j = ((nj) this).field_j + 1;
                              break L5;
                            }
                            ((nj) this).field_g = 2;
                            ((nj) this).field_f = ((nj) this).field_f + 1;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (((nj) this).field_o.length + -1 > ((nj) this).field_d) {
                          ((nj) this).field_j = 0;
                          ((nj) this).field_d = ((nj) this).field_d + 1;
                          ((nj) this).field_g = 2;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L7: {
                    ((nj) this).field_h = ((nj) this).field_h + 1;
                    stackOut_32_0 = this;
                    stackIn_37_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (((nj) this).field_h != ((nj) this).field_b.length()) {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 4;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L7;
                    } else {
                      stackOut_33_0 = this;
                      stackIn_35_0 = stackOut_33_0;
                      stackOut_35_0 = this;
                      stackOut_35_1 = 30;
                      stackIn_38_0 = stackOut_35_0;
                      stackIn_38_1 = stackOut_35_1;
                      break L7;
                    }
                  }
                  ((nj) this).field_g = stackIn_38_1;
                  break L2;
                }
              }
              stackOut_39_0 = 1;
              stackIn_40_0 = stackOut_39_0;
              return stackIn_40_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "nj.A(" + param0 + ')');
        }
        return stackIn_45_0 != 0;
    }

    final nj b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_10_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        try {
          L0: {
            L1: {
              if (0 >= ((nj) this).field_g) {
                break L1;
              } else {
                if (((nj) this).field_i) {
                  break L1;
                } else {
                  L2: {
                    ((nj) this).field_i = true;
                    if (null == ((nj) this).field_n) {
                      break L2;
                    } else {
                      nj discarded$2 = ((nj) this).field_n.b((byte) -112);
                      break L2;
                    }
                  }
                  stackOut_9_0 = this;
                  stackIn_10_0 = stackOut_9_0;
                  return (nj) this;
                }
              }
            }
            L3: {
              if (param0 <= -91) {
                break L3;
              } else {
                ((nj) this).field_i = true;
                break L3;
              }
            }
            L4: {
              if (null == ((nj) this).field_n) {
                break L4;
              } else {
                ((nj) this).field_n = ((nj) this).field_n.b((byte) -105);
                if (null == ((nj) this).field_n) {
                  break L4;
                } else {
                  stackOut_18_0 = this;
                  stackIn_19_0 = stackOut_18_0;
                  return (nj) this;
                }
              }
            }
            stackOut_20_0 = null;
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "nj.E(" + param0 + ')');
        }
        return (nj) (Object) stackIn_21_0;
    }

    final nj c(int param0) {
        RuntimeException var2 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              if (null != ((nj) this).field_a) {
                ((nj) this).field_a.b(57, 0, (f[][]) null, 0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -28530) {
              if (!this.a((byte) 71)) {
                ((nj) this).field_f = ((nj) this).field_f - 1;
                if (((nj) this).field_f == 0) {
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  return (nj) (Object) stackIn_14_0;
                } else {
                  stackOut_15_0 = this;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              } else {
                stackOut_8_0 = this;
                stackIn_9_0 = stackOut_8_0;
                return (nj) this;
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (nj) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "nj.D(" + param0 + ')');
        }
        return (nj) this;
    }

    nj(f param0, String param1, String[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        try {
          L0: {
            ((nj) this).field_b = param1;
            ((nj) this).field_a = param0;
            ((nj) this).field_o = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nj.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    nj(dl param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        try {
          L0: {
            ((nj) this).field_l = param0;
            ((nj) this).field_b = param1;
            ((nj) this).field_o = rn.a(param2, (byte) 74);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nj.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
