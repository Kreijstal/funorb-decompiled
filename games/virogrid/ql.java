/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql implements ol {
    private int field_c;
    static String field_e;
    private int field_l;
    static String field_o;
    static int field_t;
    static boolean field_d;
    static String field_i;
    static String field_j;
    private int field_b;
    static String field_f;
    private int field_a;
    static String field_k;
    static String field_p;
    static String field_s;
    private int field_h;
    private int field_n;
    private int field_r;
    static ha field_q;
    static eh field_m;
    private e field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 > 74) {
          cm.field_h.a(param1, param5, param2, (byte) -105, param4);
          if (null != dk.field_v) {
            dk.field_v.a(param6, param3, param3 - bf.field_o, param5, param5, 0);
            return;
          } else {
            return;
          }
        } else {
          field_o = null;
          cm.field_h.a(param1, param5, param2, (byte) -105, param4);
          if (null == dk.field_v) {
            return;
          } else {
            dk.field_v.a(param6, param3, param3 - bf.field_o, param5, param5, 0);
            return;
          }
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        var11 = (CharSequence) (Object) param0;
        var3 = gg.a(var11, param2, param1 + 139);
        var4 = new String[var3 + 1];
        var5 = 0;
        if (param1 != -123) {
          var10 = null;
          boolean discarded$5 = ql.a(110, (String) null, (String) null);
          var6 = 0;
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var3 <= var7) {
                var4[var3] = param0.substring(var6);
                break L1;
              } else {
                if (var9 != 0) {
                  break L1;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    L3: {
                      if (param2 == param0.charAt(var8)) {
                        int incrementValue$6 = var5;
                        var5++;
                        var4[incrementValue$6] = param0.substring(var6, var8);
                        var6 = 1 + var8;
                        var7++;
                        break L3;
                      } else {
                        var8++;
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          int incrementValue$7 = var5;
                          var5++;
                          var4[incrementValue$7] = param0.substring(var6, var8);
                          var6 = 1 + var8;
                          var7++;
                          break L3;
                        }
                      }
                    }
                    continue L0;
                  }
                }
              }
            }
            return var4;
          }
        } else {
          var6 = 0;
          var7 = 0;
          L4: while (true) {
            L5: {
              if (var3 <= var7) {
                var4[var3] = param0.substring(var6);
                break L5;
              } else {
                if (var9 != 0) {
                  break L5;
                } else {
                  var8 = var6;
                  L6: while (true) {
                    L7: {
                      if (param2 == param0.charAt(var8)) {
                        int incrementValue$8 = var5;
                        var5++;
                        var4[incrementValue$8] = param0.substring(var6, var8);
                        var6 = 1 + var8;
                        var7++;
                        break L7;
                      } else {
                        var8++;
                        if (var9 == 0) {
                          continue L6;
                        } else {
                          int incrementValue$9 = var5;
                          var5++;
                          var4[incrementValue$9] = param0.substring(var6, var8);
                          var6 = 1 + var8;
                          var7++;
                          break L7;
                        }
                      }
                    }
                    continue L4;
                  }
                }
              }
            }
            return var4;
          }
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        if (param0 <= -89) {
          if (!jd.a(-685, param2)) {
            if (!al.a(param2, 125)) {
              if (!we.a((byte) 12, param2)) {
                if (-1 != (param1.length() ^ -1)) {
                  if (!mj.a(param2, param1, (byte) 113)) {
                    if (me.a(param2, param1, true)) {
                      return false;
                    } else {
                      if (!w.a(param2, param1, false)) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static java.awt.Frame a(int param0, int param1, pd param2, int param3, int param4, boolean param5) {
        ch[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ch[] var11 = null;
        un var12 = null;
        ch[] var15 = null;
        ch[] var17 = null;
        ch[] var23 = null;
        un var24 = null;
        Object var25 = null;
        java.awt.Frame var25_ref = null;
        Object var26 = null;
        Object var28 = null;
        Object var30 = null;
        Object var31 = null;
        Object var32 = null;
        java.awt.Frame var32_ref = null;
        un var33 = null;
        Object var34 = null;
        java.awt.Frame var34_ref = null;
        Object var36 = null;
        Object var38 = null;
        Object var39 = null;
        un var40 = null;
        Object var41 = null;
        java.awt.Frame var41_ref = null;
        Object var42 = null;
        Object var43 = null;
        Object var45 = null;
        Object var47 = null;
        Object var48 = null;
        Object var49 = null;
        Object var51 = null;
        Object var53 = null;
        Object var54 = null;
        Object var56 = null;
        Object var58 = null;
        Object var59 = null;
        un var60 = null;
        Object var61 = null;
        java.awt.Frame var61_ref = null;
        Object var62 = null;
        Object var63 = null;
        Object var65 = null;
        Object var67 = null;
        Object var68 = null;
        Object var70 = null;
        Object var72 = null;
        Object var73 = null;
        Object var74 = null;
        un var75 = null;
        Object var76 = null;
        java.awt.Frame var76_ref = null;
        un var77 = null;
        Object var78 = null;
        java.awt.Frame var78_ref = null;
        Object var79 = null;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_110_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_70_0 = 0;
        var25 = null;
        var26 = null;
        var28 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var34 = null;
        var36 = null;
        var38 = null;
        var39 = null;
        var41 = null;
        var42 = null;
        var43 = null;
        var45 = null;
        var47 = null;
        var48 = null;
        var49 = null;
        var51 = null;
        var53 = null;
        var54 = null;
        var56 = null;
        var58 = null;
        var59 = null;
        var61 = null;
        var62 = null;
        var63 = null;
        var65 = null;
        var67 = null;
        var68 = null;
        var70 = null;
        var72 = null;
        var73 = null;
        var74 = null;
        var76 = null;
        var78 = null;
        var79 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        if (param2.b(121)) {
          if (param4 == 0) {
            var23 = eh.a(105, param2);
            var11 = var23;
            var6 = var11;
            if (var6 != null) {
              var7 = 0;
              var8 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var8 >= var23.length) {
                      break L2;
                    } else {
                      stackOut_97_0 = var23[var8].field_c;
                      stackIn_110_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L3: {
                          if (stackIn_98_0 != param3) {
                            break L3;
                          } else {
                            if (param1 == var23[var8].field_k) {
                              L4: {
                                if (param0 == 0) {
                                  break L4;
                                } else {
                                  if (var23[var8].field_d != param0) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  if (var23[var8].field_g > param4) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param4 = var23[var8].field_g;
                              var7 = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var8++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_109_0 = var7;
                  stackIn_110_0 = stackOut_109_0;
                  break L1;
                }
                if (stackIn_110_0 != 0) {
                  if (!param5) {
                    var75 = param2.a(param0, param4, param3, 1289287280, param1);
                    L6: while (true) {
                      L7: {
                        if (var75.field_a != 0) {
                          break L7;
                        } else {
                          mm.a(-25, 10L);
                          if (var9 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var76_ref = (java.awt.Frame) var75.field_f;
                      if (var76_ref != null) {
                        if (2 != var75.field_a) {
                          return var76_ref;
                        } else {
                          ah.a((byte) 71, param2, var76_ref);
                          return null;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    var10 = null;
                    String[] discarded$31 = ql.a((String) null, (byte) 7, '￞');
                    var77 = param2.a(param0, param4, param3, 1289287280, param1);
                    var12 = var77;
                    L8: while (true) {
                      L9: {
                        if (var77.field_a != 0) {
                          break L9;
                        } else {
                          mm.a(-25, 10L);
                          if (var9 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var78_ref = (java.awt.Frame) var77.field_f;
                      if (var78_ref != null) {
                        if (2 != var77.field_a) {
                          return var78_ref;
                        } else {
                          ah.a((byte) 71, param2, var78_ref);
                          return null;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            if (!param5) {
              var24 = param2.a(param0, param4, param3, 1289287280, param1);
              var12 = var24;
              L10: while (true) {
                if (var24.field_a == 0) {
                  mm.a(-25, 10L);
                  if (var9 == 0) {
                    continue L10;
                  } else {
                    var15 = eh.a(105, param2);
                    var11 = var15;
                    var6 = var11;
                    if (var6 != null) {
                      var7 = 0;
                      var8 = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (var8 >= var15.length) {
                              break L13;
                            } else {
                              stackOut_18_0 = var15[var8].field_c;
                              stackIn_31_0 = stackOut_18_0;
                              stackIn_19_0 = stackOut_18_0;
                              if (var9 != 0) {
                                break L12;
                              } else {
                                L14: {
                                  if (stackIn_19_0 != param3) {
                                    break L14;
                                  } else {
                                    if (param1 == var15[var8].field_k) {
                                      L15: {
                                        if (param0 == 0) {
                                          break L15;
                                        } else {
                                          if (var15[var8].field_d != param0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var7 == 0) {
                                          break L16;
                                        } else {
                                          if (var15[var8].field_g > param4) {
                                            break L16;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      param4 = var15[var8].field_g;
                                      var7 = 1;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var8++;
                                if (var9 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          stackOut_30_0 = var7;
                          stackIn_31_0 = stackOut_30_0;
                          break L12;
                        }
                        if (stackIn_31_0 != 0) {
                          L17: {
                            if (!param5) {
                              var12 = param2.a(param0, param4, param3, 1289287280, param1);
                              break L17;
                            } else {
                              var10 = null;
                              String[] discarded$32 = ql.a((String) null, (byte) 7, '￞');
                              var12 = param2.a(param0, param4, param3, 1289287280, param1);
                              break L17;
                            }
                          }
                          L18: while (true) {
                            L19: {
                              if (var12.field_a != 0) {
                                break L19;
                              } else {
                                mm.a(-25, 10L);
                                if (var9 == 0) {
                                  continue L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var32_ref = (java.awt.Frame) var12.field_f;
                            if (var32_ref != null) {
                              if (2 == var12.field_a) {
                                ah.a((byte) 71, param2, var32_ref);
                                return null;
                              } else {
                                return var32_ref;
                              }
                            } else {
                              return null;
                            }
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  var25_ref = (java.awt.Frame) var24.field_f;
                  if (var25_ref != null) {
                    if (2 == var24.field_a) {
                      ah.a((byte) 71, param2, var25_ref);
                      return null;
                    } else {
                      return var25_ref;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var10 = null;
              String[] discarded$33 = ql.a((String) null, (byte) 7, '￞');
              var33 = param2.a(param0, param4, param3, 1289287280, param1);
              var12 = var33;
              L20: while (true) {
                if (var33.field_a == 0) {
                  mm.a(-25, 10L);
                  if (var9 == 0) {
                    continue L20;
                  } else {
                    var17 = eh.a(105, param2);
                    var11 = var17;
                    var6 = var11;
                    if (var6 != null) {
                      var7 = 0;
                      var8 = 0;
                      L21: while (true) {
                        L22: {
                          L23: {
                            if (var8 >= var17.length) {
                              break L23;
                            } else {
                              stackOut_58_0 = var17[var8].field_c;
                              stackIn_71_0 = stackOut_58_0;
                              stackIn_59_0 = stackOut_58_0;
                              if (var9 != 0) {
                                break L22;
                              } else {
                                L24: {
                                  if (stackIn_59_0 != param3) {
                                    break L24;
                                  } else {
                                    if (param1 == var17[var8].field_k) {
                                      L25: {
                                        if (param0 == 0) {
                                          break L25;
                                        } else {
                                          if (var17[var8].field_d != param0) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      L26: {
                                        if (var7 == 0) {
                                          break L26;
                                        } else {
                                          if (var17[var8].field_g > param4) {
                                            break L26;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      param4 = var17[var8].field_g;
                                      var7 = 1;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                var8++;
                                if (var9 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          stackOut_70_0 = var7;
                          stackIn_71_0 = stackOut_70_0;
                          break L22;
                        }
                        if (stackIn_71_0 != 0) {
                          if (!param5) {
                            var40 = param2.a(param0, param4, param3, 1289287280, param1);
                            var12 = var40;
                            L27: while (true) {
                              L28: {
                                if (var40.field_a != 0) {
                                  break L28;
                                } else {
                                  mm.a(-25, 10L);
                                  if (var9 == 0) {
                                    continue L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              var41_ref = (java.awt.Frame) var40.field_f;
                              if (var41_ref != null) {
                                if (2 != var40.field_a) {
                                  return var41_ref;
                                } else {
                                  ah.a((byte) 71, param2, var41_ref);
                                  return null;
                                }
                              } else {
                                return null;
                              }
                            }
                          } else {
                            var10 = null;
                            String[] discarded$34 = ql.a((String) null, (byte) 7, '￞');
                            var60 = param2.a(param0, param4, param3, 1289287280, param1);
                            var12 = var60;
                            L29: while (true) {
                              L30: {
                                if (var60.field_a != 0) {
                                  break L30;
                                } else {
                                  mm.a(-25, 10L);
                                  if (var9 == 0) {
                                    continue L29;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              var61_ref = (java.awt.Frame) var60.field_f;
                              if (var61_ref != null) {
                                if (2 != var60.field_a) {
                                  return var61_ref;
                                } else {
                                  ah.a((byte) 71, param2, var61_ref);
                                  return null;
                                }
                              } else {
                                return null;
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  var34_ref = (java.awt.Frame) var33.field_f;
                  if (var34_ref != null) {
                    if (2 == var33.field_a) {
                      ah.a((byte) 71, param2, var34_ref);
                      return null;
                    } else {
                      return var34_ref;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qn var14 = null;
        fi stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fi stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof qn)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fi) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fi) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (qn) (Object) stackIn_3_0;
          df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, ((ql) this).field_h);
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var14.field_M + (param0 + param1.field_l);
          var8 = var14.field_N + (param3 - -param1.field_u);
          df.c(var7, var8, var14.field_F, ((ql) this).field_c);
          if (-1 == var14.field_O) {
            break L2;
          } else {
            var9 = 2.0 * ((double)var14.field_O * 3.141592653589793) / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            df.c(var11 + var7, var12 + var8, 1, ((ql) this).field_r);
            break L2;
          }
        }
        if (param4 != -23294) {
          L3: {
            ql.a((byte) -39, -110, 72, -97, -121, -28, 103);
            df.c(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_G * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            df.a(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null == ((ql) this).field_g) {
              break L3;
            } else {
              var13 = var14.field_F + var14.field_M + ((ql) this).field_b;
              int discarded$2 = ((ql) this).field_g.a(param1.field_n, var13 + (param1.field_l + param0), param1.field_u + param3 + ((ql) this).field_n, -var13 + (-((ql) this).field_b + param1.field_g), param1.field_m - (((ql) this).field_b << -468976159), ((ql) this).field_l, ((ql) this).field_a, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            df.c(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_G * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            df.a(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null == ((ql) this).field_g) {
              break L4;
            } else {
              var13 = var14.field_F + var14.field_M + ((ql) this).field_b;
              int discarded$3 = ((ql) this).field_g.a(param1.field_n, var13 + (param1.field_l + param0), param1.field_u + param3 + ((ql) this).field_n, -var13 + (-((ql) this).field_b + param1.field_g), param1.field_m - (((ql) this).field_b << -468976159), ((ql) this).field_l, ((ql) this).field_a, 1, 1, 0);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_m = null;
        field_k = null;
        field_e = null;
        field_p = null;
        if (param0 > -76) {
          field_p = null;
          field_q = null;
          field_s = null;
          field_j = null;
          field_o = null;
          field_f = null;
          return;
        } else {
          field_q = null;
          field_s = null;
          field_j = null;
          field_o = null;
          field_f = null;
          return;
        }
    }

    ql(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ql) this).field_a = param4;
        ((ql) this).field_b = param1;
        ((ql) this).field_c = param5;
        ((ql) this).field_r = param6;
        ((ql) this).field_n = param2;
        ((ql) this).field_l = param3;
        ((ql) this).field_h = param7;
        ((ql) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Advertising websites";
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = "Go Back";
        field_d = true;
        field_f = "Show private chat from my friends and opponents";
        field_k = "You cannot add yourself!";
        field_s = "Lost";
        field_j = "Options Menu";
        field_t = 200;
        field_p = "Show lobby chat from my friends";
    }
}
