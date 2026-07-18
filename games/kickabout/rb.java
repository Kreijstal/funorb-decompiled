/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rb extends hd {
    static int field_yb;
    static int field_Bb;
    private StringBuilder field_Db;
    private hd field_Lb;
    private hd field_Cb;
    static String field_Hb;
    private hd field_Nb;
    private hd[] field_Jb;
    static int field_Kb;
    private om field_zb;
    static String field_Ib;
    long field_Eb;
    private hd field_Ab;
    private hd field_Fb;
    static int field_Mb;
    private int field_Ob;
    private hd field_Gb;

    final static tv a(int param0, int param1, byte param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tv var8_ref_tv = null;
        int var8 = 0;
        int var9 = 0;
        tv var9_ref_tv = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_39_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_75_0 = 0;
        Object stackIn_76_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_38_0 = 0;
        Object stackOut_41_0 = null;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_75_0 = null;
        Object stackOut_54_0 = null;
        tv stackOut_56_0 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            pw.field_G.field_Ab.field_jb.b(22997);
            var4 = null;
            var5 = 0;
            var6 = 0;
            var7 = vb.field_j - 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 < 0) {
                    break L3;
                  } else {
                    var8_ref_tv = fu.field_b[var7];
                    var9 = 0;
                    stackOut_3_0 = iw.field_l;
                    stackIn_39_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (var5 < at.field_Hb) {
                            var10_int = r.a(0, var8_ref_tv.field_c);
                            if (var10_int > var8_ref_tv.b(80)) {
                              break L4;
                            } else {
                              L5: {
                                if (var8_ref_tv.field_m) {
                                  break L5;
                                } else {
                                  if (!hi.a(param2 ^ 26, var8_ref_tv.field_q)) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var9 = 1;
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var9 != 0) {
                            break L7;
                          } else {
                            var8_ref_tv.field_s = null;
                            if (var13 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          L9: {
                            if (var8_ref_tv.field_s == null) {
                              break L9;
                            } else {
                              if (!wj.field_z) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var8_ref_tv.field_s != null) {
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = ob.a((byte) -92, var8_ref_tv);
                          var11 = var10 + hu.c(var8_ref_tv.field_g);
                          var12 = qa.a(var8_ref_tv, 31100);
                          var8_ref_tv.field_s = new hd(0L, vv.field_o, var11);
                          var6 = var6 + param1;
                          var8_ref_tv.field_s.field_X = nl.field_i;
                          var8_ref_tv.field_s.field_ub = -(8355711 & var12 >> -810913951) + var12 - -(8355711 & vv.field_o.field_ub >> -1039946463);
                          var8_ref_tv.field_s.field_ab = var12 - (((16711423 & var12) >> 1187469889) + -((vv.field_o.field_ab & 16711422) >> 966118849));
                          var8_ref_tv.field_s.field_y = var12;
                          break L8;
                        }
                        var5++;
                        break L6;
                      }
                      var7--;
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7 = 0;
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L2;
              }
              var8 = stackIn_39_0;
              L11: while (true) {
                L12: {
                  L13: {
                    if (~vb.field_j >= ~var8) {
                      break L13;
                    } else {
                      var9_ref_tv = fu.field_b[var8];
                      stackOut_41_0 = null;
                      stackIn_56_0 = stackOut_41_0;
                      stackIn_42_0 = stackOut_41_0;
                      if (var13 != 0) {
                        break L12;
                      } else {
                        L14: {
                          if (stackIn_42_0 != (Object) (Object) var9_ref_tv.field_s) {
                            pw.field_G.field_Ab.a((byte) -105, var9_ref_tv.field_s);
                            var9_ref_tv.field_s.a(true, var9_ref_tv.field_s.g((byte) -44), param3, var7, param1);
                            var7 = var7 + param1;
                            if (var9_ref_tv.field_s.field_sb == 0) {
                              break L14;
                            } else {
                              var4 = (Object) (Object) var9_ref_tv;
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        var8++;
                        if (var13 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  L15: {
                    var8 = var6 + -var7 + pw.field_G.field_Ab.field_L + pw.field_G.field_Ab.field_mb;
                    pw.field_G.field_Ab.field_mb = pw.field_G.field_Ab.field_mb - var8;
                    pw.field_G.field_Ab.field_J = pw.field_G.field_Ab.field_J + var8;
                    if (!wj.field_z) {
                      break L15;
                    } else {
                      pw.field_G.field_Ab.field_mb = var7;
                      break L15;
                    }
                  }
                  if (param2 == 26) {
                    L16: {
                      pw.field_G.field_Ab.field_L = var7 - pw.field_G.field_Ab.field_mb;
                      if (wj.field_z) {
                        dg.field_a = true;
                        pw.field_G.field_Ab.field_J = -pw.field_G.field_Ab.field_mb + pw.field_G.field_zb.field_mb;
                        wj.field_z = false;
                        pw.field_G.field_Ab.field_v = 0;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (!vg.field_Wb) {
                        break L17;
                      } else {
                        if (mu.field_Y == null) {
                          break L17;
                        } else {
                          dg.field_a = true;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      var9 = -pw.field_G.field_Ab.field_mb + (-pw.field_G.field_Ab.field_L + pw.field_G.field_zb.field_mb);
                      if (!dg.field_a) {
                        break L18;
                      } else {
                        pw.field_G.field_Ab.field_v = var9 - pw.field_G.field_Ab.field_J;
                        break L18;
                      }
                    }
                    L19: {
                      pw.field_G.a(param1, param0 * param1 * 2, true, param2 ^ 26);
                      if (~(pw.field_G.field_Ab.field_J - -pw.field_G.field_Ab.field_v) != ~var9) {
                        stackOut_74_0 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        break L19;
                      } else {
                        stackOut_72_0 = 1;
                        stackIn_75_0 = stackOut_72_0;
                        break L19;
                      }
                    }
                    dg.field_a = stackIn_75_0 != 0;
                    stackOut_75_0 = var4;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    stackOut_54_0 = null;
                    stackIn_56_0 = stackOut_54_0;
                    break L12;
                  }
                }
                stackOut_56_0 = (tv) (Object) stackIn_56_0;
                stackIn_57_0 = (Object) (Object) stackOut_56_0;
                return (tv) (Object) stackIn_57_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (Object) (Object) decompiledCaughtException;
          throw nb.a((Throwable) var4, "rb.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (tv) (Object) stackIn_76_0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ek.field_M = param1;
              qd.b(38, 12);
              if (param0 == -51) {
                break L1;
              } else {
                field_Ib = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rb.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 26) {
                break L1;
              } else {
                ((rb) this).field_Lb = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((rb) this).field_zb) {
                  break L3;
                } else {
                  if (!((rb) this).field_zb.field_I) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "rb.C(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void c(boolean param0) {
        try {
            field_Ib = null;
            field_Hb = null;
            if (!param0) {
                field_Mb = -83;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "rb.A(" + param0 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        om stackIn_9_0 = null;
        om stackIn_11_0 = null;
        om stackIn_13_0 = null;
        om stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_18_0 = null;
        hd stackIn_24_0 = null;
        hd stackIn_26_0 = null;
        hd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_49_0 = null;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        om stackOut_8_0 = null;
        om stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        om stackOut_9_0 = null;
        om stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_17_0 = null;
        hd stackOut_23_0 = null;
        hd stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        hd stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_48_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_49_0 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                ((rb) this).b(param1, param0);
                if (null == ((rb) this).field_Fb) {
                  break L2;
                } else {
                  L3: {
                    ((rb) this).field_Fb.field_E = ((rb) this).field_Db.toString();
                    ((rb) this).field_Fb.field_s = (((rb) this).field_q - ((rb) this).field_Fb.field_X.a(((rb) this).field_Fb.field_E)) / 2;
                    if (null != ((rb) this).field_zb) {
                      if (0 == ((rb) this).field_zb.field_sb) {
                        break L3;
                      } else {
                        L4: {
                          stackOut_8_0 = ((rb) this).field_zb;
                          stackIn_13_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (((rb) this).field_zb.field_I) {
                            stackOut_13_0 = (om) (Object) stackIn_13_0;
                            stackOut_13_1 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            break L4;
                          } else {
                            stackOut_9_0 = (om) (Object) stackIn_9_0;
                            stackIn_11_0 = stackOut_9_0;
                            stackOut_11_0 = (om) (Object) stackIn_11_0;
                            stackOut_11_1 = 1;
                            stackIn_14_0 = stackOut_11_0;
                            stackIn_14_1 = stackOut_11_1;
                            break L4;
                          }
                        }
                        stackIn_14_0.field_I = stackIn_14_1 != 0;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  ((rb) this).field_Fb.field_q = -((rb) this).field_Fb.field_s + ((rb) this).field_q;
                  var3_int = 0;
                  L5: while (true) {
                    if (~var3_int <= ~ob.field_B) {
                      break L2;
                    } else {
                      stackOut_17_0 = this;
                      stackIn_49_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L6: {
                          if (((rb) this).field_Jb[var3_int] != null) {
                            L7: {
                              stackOut_23_0 = ((rb) this).field_Jb[var3_int];
                              stackIn_26_0 = stackOut_23_0;
                              stackIn_24_0 = stackOut_23_0;
                              if (((rb) this).field_Db.length() <= 0) {
                                stackOut_26_0 = (hd) (Object) stackIn_26_0;
                                stackOut_26_1 = 0;
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                break L7;
                              } else {
                                stackOut_24_0 = (hd) (Object) stackIn_24_0;
                                stackOut_24_1 = 1;
                                stackIn_27_0 = stackOut_24_0;
                                stackIn_27_1 = stackOut_24_1;
                                break L7;
                              }
                            }
                            stackIn_27_0.field_lb = stackIn_27_1 != 0;
                            if (!((rb) this).field_Jb[var3_int].field_lb) {
                              break L6;
                            } else {
                              if (0 != ((rb) this).field_Jb[var3_int].field_sb) {
                                stackOut_33_0 = var3_int;
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var3_int++;
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (((rb) this).field_Ab.field_sb == 0) {
                L8: {
                  if (!param0) {
                    break L8;
                  } else {
                    if (0 == wj.field_A) {
                      break L8;
                    } else {
                      if (((rb) this).field_sb != 0) {
                        break L8;
                      } else {
                        stackOut_46_0 = -1;
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0;
                      }
                    }
                  }
                }
                stackOut_48_0 = this;
                stackIn_49_0 = stackOut_48_0;
                break L1;
              } else {
                stackOut_37_0 = -1;
                stackIn_38_0 = stackOut_37_0;
                return stackIn_38_0;
              }
            }
            stackOut_49_0 = ((rb) this).field_Ob;
            stackIn_50_0 = stackOut_49_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "rb.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_50_0;
    }

    final String a(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -15596) {
                break L1;
              } else {
                ((rb) this).field_Ob = -119;
                break L1;
              }
            }
            stackOut_3_0 = ((rb) this).field_Db.toString();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "rb.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(int param0, String param1, int param2, hd param3, hd param4, byte param5) {
        hd var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
        try {
          L0: {
            L1: {
              var7 = new hd(0L, param3, 0, param0, param2, 24, param1);
              param0 += 32;
              param4.a((byte) -106, var7);
              if (param5 >= 4) {
                break L1;
              } else {
                boolean discarded$2 = ((rb) this).b(-117);
                break L1;
              }
            }
            stackOut_3_0 = param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7_ref;
            stackOut_5_1 = new StringBuilder().append("rb.J(").append(param0).append(',');
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
            if (param4 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -46) {
              L1: {
                if (param1 != 6) {
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
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "rb.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    rb(int param0, int param1, int param2, int param3, int param4, hd param5, hd param6, hd param7, hd param8, om param9, hd param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        hd[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        Object stackIn_5_0 = null;
        om stackIn_5_1 = null;
        om stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        om stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        om stackIn_6_1 = null;
        om stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        om stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        om stackIn_7_1 = null;
        om stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        om stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        om stackIn_8_1 = null;
        om stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        om stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        om stackIn_9_1 = null;
        om stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        om stackIn_9_4 = null;
        Object stackIn_10_0 = null;
        om stackIn_10_1 = null;
        om stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        om stackIn_10_4 = null;
        String stackIn_10_5 = null;
        Object stackIn_14_0 = null;
        String stackIn_14_1 = null;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_23_0 = null;
        String stackIn_23_1 = null;
        Object stackOut_4_0 = null;
        om stackOut_4_1 = null;
        om stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        om stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        om stackOut_5_1 = null;
        om stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        om stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        om stackOut_6_1 = null;
        om stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        om stackOut_6_4 = null;
        Object stackOut_9_0 = null;
        om stackOut_9_1 = null;
        om stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        om stackOut_9_4 = null;
        String stackOut_9_5 = null;
        Object stackOut_7_0 = null;
        om stackOut_7_1 = null;
        om stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        om stackOut_7_4 = null;
        Object stackOut_8_0 = null;
        om stackOut_8_1 = null;
        om stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        om stackOut_8_4 = null;
        String stackOut_8_5 = null;
        Object stackOut_13_0 = null;
        String stackOut_13_1 = null;
        hd stackOut_16_0 = null;
        hd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        hd stackOut_17_0 = null;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_22_0 = null;
        String stackOut_22_1 = null;
        L0: {
          L1: {
            var27 = Kickabout.field_G;
            ((rb) this).field_Ob = -2;
            ((rb) this).field_Eb = param12;
            ((rb) this).field_Gb = new hd(0L, param6, fi.field_c.toUpperCase());
            ((rb) this).field_Gb.field_A = 1;
            ((rb) this).a((byte) -110, ((rb) this).field_Gb);
            ((rb) this).field_Ab = new hd(0L, param7);
            ((rb) this).field_Gb.a((byte) -116, ((rb) this).field_Ab);
            ((rb) this).field_Nb = new hd(0L, (hd) null);
            ((rb) this).a((byte) -111, ((rb) this).field_Nb);
            if (param11 == null) {
              break L1;
            } else {
              L2: {
                L3: {
                  ((rb) this).field_Cb = new hd(0L, param8, cf.field_Ib);
                  ((rb) this).field_Cb.field_A = 1;
                  ((rb) this).field_Cb.field_y = 11184810;
                  ((rb) this).field_Nb.a((byte) -110, ((rb) this).field_Cb);
                  ((rb) this).field_Lb = new hd(0L, param8, nc.field_d);
                  ((rb) this).field_Lb.field_y = 11184810;
                  ((rb) this).field_Lb.field_A = 1;
                  ((rb) this).field_Nb.a((byte) -116, ((rb) this).field_Lb);
                  ((rb) this).field_Fb = new hd(0L, param8);
                  ((rb) this).field_Fb.field_y = 16764006;
                  ((rb) this).field_Nb.a((byte) -105, ((rb) this).field_Fb);
                  ((rb) this).field_Fb.field_V = "|";
                  if (bl.field_c >= 5) {
                    break L3;
                  } else {
                    if (tk.field_Ib < 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = 0L;
                    stackOut_4_4 = (om) param9;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_8_1 = stackOut_4_1;
                    stackIn_8_2 = stackOut_4_2;
                    stackIn_8_3 = stackOut_4_3;
                    stackIn_8_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (bl.field_c >= 7) {
                      break L5;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = (om) (Object) stackIn_5_4;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      stackIn_6_4 = stackOut_5_4;
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (om) (Object) stackIn_6_4;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_9_1 = stackOut_6_1;
                      stackIn_9_2 = stackOut_6_2;
                      stackIn_9_3 = stackOut_6_3;
                      stackIn_9_4 = stackOut_6_4;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      if (2 > tk.field_Ib) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = (om) (Object) stackIn_9_4;
                        stackOut_9_5 = vv.field_s;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        stackIn_10_4 = stackOut_9_4;
                        stackIn_10_5 = stackOut_9_5;
                        break L4;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = (om) (Object) stackIn_7_4;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        break L5;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = null;
                  stackOut_8_2 = null;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = (om) (Object) stackIn_8_4;
                  stackOut_8_5 = mc.field_h;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  stackIn_10_3 = stackOut_8_3;
                  stackIn_10_4 = stackOut_8_4;
                  stackIn_10_5 = stackOut_8_5;
                  break L4;
                }
                ((rb) this).field_zb = new om(stackIn_10_3, stackIn_10_4, stackIn_10_5);
                ((rb) this).field_Nb.a((byte) -118, (hd) (Object) ((rb) this).field_zb);
                break L2;
              }
              var15 = new hd[3];
              var15[0] = new hd(0L, (hd) null);
              ((rb) this).field_Nb.a((byte) -105, var15[0]);
              var15[1] = new hd(0L, (hd) null);
              ((rb) this).field_Nb.a((byte) -111, var15[1]);
              var15[2] = new hd(0L, (hd) null);
              ((rb) this).field_Nb.a((byte) -127, var15[2]);
              ((rb) this).field_Jb = new hd[ob.field_B];
              var16 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (ob.field_B <= var16) {
                      break L8;
                    } else {
                      stackOut_13_0 = null;
                      stackOut_13_1 = bh.field_i[var16];
                      stackIn_23_0 = stackOut_13_0;
                      stackIn_23_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var27 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_14_0 == (Object) (Object) stackIn_14_1) {
                            break L9;
                          } else {
                            L10: {
                              ((rb) this).field_Jb[var16] = new hd(0L, param10, bh.field_i[var16]);
                              ((rb) this).field_Jb[var16].field_A = 0;
                              stackOut_16_0 = ((rb) this).field_Jb[var16];
                              stackIn_19_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (null == param11) {
                                stackOut_19_0 = (hd) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L10;
                              } else {
                                stackOut_17_0 = (hd) (Object) stackIn_17_0;
                                stackIn_18_0 = stackOut_17_0;
                                stackOut_18_0 = (hd) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L10;
                              }
                            }
                            stackIn_20_0.field_lb = stackIn_20_1 != 0;
                            ((rb) this).field_Nb.a((byte) -124, ((rb) this).field_Jb[var16]);
                            break L9;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ((rb) this).field_Db = new StringBuilder(12);
                  stackOut_22_0 = null;
                  stackOut_22_1 = (String) param11;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L7;
                }
                L11: {
                  if (stackIn_23_0 != (Object) (Object) stackIn_23_1) {
                    StringBuilder discarded$1 = ((rb) this).field_Db.append(param11);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var16 = 0;
                  var17 = param6.field_X.a(ce.field_F);
                  if (var16 < var17) {
                    var16 = var17;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  var17 = param6.field_X.a(cj.field_H);
                  if (~var17 >= ~var16) {
                    break L13;
                  } else {
                    var16 = var17;
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_X.a(tk.field_Hb);
                  if (~var17 >= ~var16) {
                    break L14;
                  } else {
                    var16 = var17;
                    break L14;
                  }
                }
                var17 = 0;
                L15: while (true) {
                  L16: {
                    L17: {
                      if (var17 >= ob.field_B) {
                        break L17;
                      } else {
                        if (var27 != 0) {
                          break L16;
                        } else {
                          L18: {
                            if (((rb) this).field_Jb[var17] == null) {
                              break L18;
                            } else {
                              var18 = ((rb) this).field_Jb[var17].g((byte) -40);
                              if (var18 > var16) {
                                var16 = var18;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var17++;
                          if (var27 == 0) {
                            continue L15;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L19: {
                      if (var16 <= 140) {
                        break L19;
                      } else {
                        var16 = 140;
                        break L19;
                      }
                    }
                    var17 = 0;
                    break L16;
                  }
                  L20: {
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(var18, ce.field_F, var16, param6, var15[0], (byte) 9);
                    var18 = this.a(-6305, ((rb) this).field_Jb[6], var16, var18, var15[0]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[9], var16, var18, var15[0]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[5], var16, var18, var15[0]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[7], var16, var18, var15[0]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[15], var16, var18, var15[0]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[4], var16, var18, var15[0]);
                    if (var17 < var18) {
                      var17 = var18;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    var18 = 0;
                    var18 = this.a(var18, cj.field_H, var16, param6, var15[1], (byte) 119);
                    var18 = this.a(-6305, ((rb) this).field_Jb[16], var16, var18, var15[1]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[17], var16, var18, var15[1]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[18], var16, var18, var15[1]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[19], var16, var18, var15[1]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[20], var16, var18, var15[1]);
                    if (var17 < var18) {
                      var17 = var18;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(var18, tk.field_Hb, var16, param6, var15[2], (byte) 127);
                    var18 = this.a(-6305, ((rb) this).field_Jb[13], var16, var18, var15[2]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[21], var16, var18, var15[2]);
                    var18 = this.a(-6305, ((rb) this).field_Jb[11], var16, var18, var15[2]);
                    if (var18 > var17) {
                      var17 = var18;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    var19 = 26 + var16 * 3;
                    var20 = ((rb) this).field_Gb.g((byte) 108);
                    if (~var19 <= ~var20) {
                      break L23;
                    } else {
                      var19 = var20;
                      break L23;
                    }
                  }
                  L24: {
                    if (null == ((rb) this).field_zb) {
                      break L24;
                    } else {
                      var20 = ((rb) this).field_zb.b(0, 4);
                      if (var20 <= var19) {
                        break L24;
                      } else {
                        var19 = var20;
                        break L24;
                      }
                    }
                  }
                  L25: {
                    ((rb) this).field_Gb.a(true, var19 + 13 + 13, 0, 0, 24);
                    ((rb) this).field_Ab.a(true, 15, -20 + ((rb) this).field_Gb.field_q, 5, 15);
                    var21 = 10;
                    ((rb) this).field_Cb.a(true, var19, 13, var21, 2 * sh.field_c);
                    var21 = var21 + sh.field_c * 2;
                    ((rb) this).field_Lb.a(true, var19, 13, var21, 2 * sh.field_c);
                    var21 = var21 + (10 + 2 * sh.field_c);
                    ((rb) this).field_Fb.a(true, 0, 0, var21, sh.field_c);
                    var21 = var21 + (10 + sh.field_c);
                    if (null == ((rb) this).field_zb) {
                      break L25;
                    } else {
                      var20 = ((rb) this).field_zb.b(0, 4);
                      ((rb) this).field_zb.a(4, var21, sh.field_c, var20, 13 - -((var19 + -var20) / 2), -10481);
                      var21 = var21 + (10 + sh.field_c);
                      break L25;
                    }
                  }
                  var15[0].a(true, var16, 13, var21, var17);
                  var15[1].a(true, var16, var16 + 13 - -13, var21, var17);
                  var15[2].a(true, var16, 26 + (13 - -(var16 * 2)), var21, var17);
                  var22 = var21;
                  ((rb) this).field_Nb.a(true, 13 + (13 + var19), 0, 24, 10 + var22 + var17);
                  ((rb) this).field_Nb.field_R = fs.a(((rb) this).field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 127);
                  var23 = var19 + 13 + 13;
                  var24 = 10 + (var17 + 24) + var22;
                  var25 = ou.b(var23, param0, param2, 127);
                  var26 = nj.a(param1, param3, var24, 29079);
                  ((rb) this).a(true, var23, var25, var26, var24);
                  if (var27 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          ((rb) this).field_Cb = new hd(0L, param8, sl.field_Bb);
          ((rb) this).field_Cb.field_y = 11184810;
          ((rb) this).field_Cb.field_A = 1;
          ((rb) this).field_Nb.a((byte) -110, ((rb) this).field_Cb);
          var15_int = 226;
          var16 = 10;
          var17 = ((rb) this).field_Cb.field_X.b(((rb) this).field_Cb.field_E, var15_int);
          ((rb) this).field_Cb.a(true, var15_int, 13, var16, var17 * sh.field_c);
          var16 = var16 + var17 * sh.field_c;
          ((rb) this).field_Nb.a(true, 13 - -var15_int - -13, 0, 24, var16 + 10);
          ((rb) this).field_Nb.field_R = fs.a(((rb) this).field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 96);
          var18 = var15_int + 13 - -13;
          var19 = var16 + 34;
          var20 = ou.b(var18, param0, param2, 127);
          var21 = nj.a(param1, param3, var19, 29079);
          ((rb) this).a(true, var18, var20, var21, var19);
          break L0;
        }
    }

    private final int a(int param0, hd param1, int param2, int param3, hd param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              param3 += 8;
              if (param0 == -6305) {
                break L1;
              } else {
                ((rb) this).field_Db = null;
                break L1;
              }
            }
            var6_int = param1.field_X.c(param1.field_E, -(2 * param1.field_kb) + param2, param1.field_xb);
            param1.a(true, param2, 0, param3, var6_int);
            param3 = param3 + var6_int;
            param4.a((byte) -120, param1);
            stackOut_3_0 = param3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((rb) this).field_Ob == -2) {
              L1: {
                if (cc.field_e == 13) {
                  ((rb) this).field_Ob = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 37) {
                  break L2;
                } else {
                  ((rb) this).field_Cb = null;
                  break L2;
                }
              }
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
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
          throw nb.a((Throwable) (Object) var2, "rb.E(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = 20;
        field_Hb = "Spectate";
        field_Kb = 33;
        field_Ib = "null";
        field_Mb = 4;
    }
}
