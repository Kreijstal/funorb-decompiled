/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends jc {
    static int field_x;
    static String[] field_u;
    private sa field_w;
    private sa[] field_v;

    final static String b(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        Object stackOut_2_0 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  var1_ref = "(" + lh.field_c + " " + fe.field_b + " " + ce.field_d + ") " + ab.field_l;
                  if (0 < tf.field_c) {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (tf.field_c <= var2) {
                        break L2;
                      } else {
                        stackOut_9_0 = var1_ref + ' ';
                        stackIn_24_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_10_0;
                              var3 = 255 & cd.field_t.field_j[var2];
                              var4 = var3 >> -506037628;
                              if (var4 < 10) {
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
                  } else {
                    break L2;
                  }
                }
                stackOut_23_0 = (String) var1_ref;
                stackIn_24_0 = stackOut_23_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "sj.EA(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    public sj() {
        sa var1 = null;
        ((sj) this).field_v = new sa[6];
        ((sj) this).field_w = new sa();
        try {
            sa dupTemp$0 = new sa();
            ((sj) this).field_v[0] = dupTemp$0;
            var1 = dupTemp$0;
            var1.b((byte) -31);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "sj.<init>()");
        }
    }

    final void a(int param0, hj param1) {
        sa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.a(true, -7, (sj) null);
                break L1;
              }
            }
            var3 = ((sj) this).field_v;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3.length <= var4) {
                    break L4;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null != var5) {
                          var5.field_e = param1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("sj.CA(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, sj param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        sa var5 = null;
        sa var6 = null;
        int var7 = 0;
        sa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        sa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        sa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        sa stackIn_14_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        sa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        sa stackOut_13_2 = null;
        sa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        sa stackOut_11_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            super.a((byte) 81, (jc) (Object) param2);
            if (param1 == -19056) {
              L1: {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    var4_int = 0;
                    L3: while (true) {
                      L4: {
                        if (6 <= var4_int) {
                          break L4;
                        } else {
                          var5 = ((sj) this).field_v[var4_int];
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L5: {
                              L6: {
                                if (var5 == null) {
                                  break L6;
                                } else {
                                  L7: {
                                    var6 = param2.field_v[var4_int];
                                    stackOut_10_0 = (sa) var5;
                                    stackOut_10_1 = -110;
                                    stackIn_13_0 = stackOut_10_0;
                                    stackIn_13_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (null != var6) {
                                      stackOut_13_0 = (sa) (Object) stackIn_13_0;
                                      stackOut_13_1 = stackIn_13_1;
                                      stackOut_13_2 = (sa) var6;
                                      stackIn_14_0 = stackOut_13_0;
                                      stackIn_14_1 = stackOut_13_1;
                                      stackIn_14_2 = stackOut_13_2;
                                      break L7;
                                    } else {
                                      sa dupTemp$13 = new sa();
                                      param2.field_v[var4_int] = dupTemp$13;
                                      stackOut_11_0 = (sa) (Object) stackIn_11_0;
                                      stackOut_11_1 = stackIn_11_1;
                                      stackOut_11_2 = (sa) dupTemp$13;
                                      stackIn_14_0 = stackOut_11_0;
                                      stackIn_14_1 = stackOut_11_1;
                                      stackIn_14_2 = stackOut_11_2;
                                      break L7;
                                    }
                                  }
                                  ((sa) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2);
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              param2.field_v[var4_int] = null;
                              break L5;
                            }
                            var4_int++;
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                mk.a((Object[]) (Object) ((sj) this).field_v, 0, (Object[]) (Object) param2.field_v, 0, 6);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) runtimeException;
            stackOut_22_1 = new StringBuilder().append("sj.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L8;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static sh a(boolean param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        sh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param0) {
                break L1;
              } else {
                sh discarded$2 = sj.a(true, (String) null, false, (String) null);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var4_long = bk.a(125, (CharSequence) (Object) param1);
                break L2;
              } else {
                var6 = (Object) (Object) param1;
                break L2;
              }
            }
            stackOut_6_0 = f.a(param2, var4_long, (String) var6, 17470, param3);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("sj.W(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, hj[] param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2 > 85) {
              L1: {
                var4_int = param0;
                if (null != ((sj) this).field_v[var4_int]) {
                  break L1;
                } else {
                  ((sj) this).field_v[var4_int] = new sa();
                  break L1;
                }
              }
              ((sj) this).field_v[param0].field_b = param1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("sj.BA(").append(param0).append(',');
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
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    sj(sj param0, boolean param1) {
        this();
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
            param0.a(param1, -19056, (sj) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sj.<init>(");
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
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, hj[] param1) {
        RuntimeException runtimeException = null;
        sa[] var3 = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 34) {
              var3 = ((sj) this).field_v;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= var3.length) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == var5) {
                            break L4;
                          } else {
                            var5.field_b = param1;
                            break L4;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("sj.FA(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final sa a(int param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        sa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1) {
              sa dupTemp$2 = new sa();
              ((sj) this).field_v[param0] = dupTemp$2;
              stackOut_3_0 = (sa) dupTemp$2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "sj.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(byte param0) {
        try {
            field_u = null;
            int var1_int = 8 % ((-5 - param0) / 61);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "sj.DA(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        s var6_ref = null;
        sa var7 = null;
        sa var8 = null;
        sa var9 = null;
        pj stackIn_4_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        pj stackOut_1_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof s)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (pj) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = (pj) param2;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_ref = (s) (Object) stackIn_4_0;
              id.a(param2.field_s + (param1 + param2.field_m), param2.field_s + param1, param2.field_r + param0 + param2.field_n, param0 - -param2.field_n, param3 ^ -5112);
              if (var6_ref == null) {
                break L2;
              } else {
                param4 = param4 & var6_ref.field_F;
                break L2;
              }
            }
            L3: {
              var7 = ((sj) this).field_v[0];
              ((sj) this).field_w.b((byte) -31);
              var7.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
              if (param3 == -4394) {
                break L3;
              } else {
                sh discarded$1 = sj.a(true, (String) null, false, (String) null);
                break L3;
              }
            }
            L4: {
              if (null != var6_ref) {
                L5: {
                  if (!var6_ref.field_D) {
                    break L5;
                  } else {
                    var8 = ((sj) this).field_v[1];
                    if (null == var8) {
                      break L5;
                    } else {
                      var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                      break L5;
                    }
                  }
                }
                if (!var6_ref.field_t) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      var8 = ((sj) this).field_v[3];
                      if (var6_ref.field_v == 0) {
                        break L7;
                      } else {
                        if (var8 != null) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = ((sj) this).field_v[2];
                      if (var9 != null) {
                        var9.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!OrbDefence.field_D) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L9: {
              if (param2.d(param3 ^ 4473)) {
                var8 = ((sj) this).field_v[5];
                if (var8 == null) {
                  break L9;
                } else {
                  var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (param4) {
                break L10;
              } else {
                var8 = ((sj) this).field_v[4];
                if (null != var8) {
                  var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            ((sj) this).field_w.a((sj) this, param0, param1, param2, param3 + 28577);
            oc.g((byte) -105);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var6;
            stackOut_41_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L11;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
