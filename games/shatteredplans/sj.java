/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static qr field_c;
    static int[] field_a;
    static String field_d;
    static ir field_b;

    final static void a(byte param0, qr param1, qr param2) {
        try {
            if (null == param1.field_M) {
                param1.field_M = new pf();
            }
            if (null == param2.field_M) {
                param2.field_M = new pf();
            }
            if (eg.field_q == null) {
                eg.field_q = new in(64);
            }
            if (!(sl.field_m != null)) {
                sl.field_m = new in(64);
            }
            vd.field_j = param1.field_M;
            fp.field_b = param2.field_M;
            if (param0 <= 42) {
                field_a = null;
            }
            an.a(true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sj.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 > -80) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        lo var2 = null;
        boolean[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        Object var6_ref = null;
        int var7_int = 0;
        Object var7 = null;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        fs var11 = null;
        fs var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var11 = ho.field_d;
                var12 = var11;
                var2 = var12.field_m;
                sj.a(60);
                var3 = new boolean[4];
                if (var2 == null) {
                  break L2;
                } else {
                  L3: {
                    var4 = ((sd) (Object) var2).field_u[((sd) (Object) var2).field_w[3]];
                    if (var4 != 0) {
                      break L3;
                    } else {
                      uq.field_m.a(cb.field_m, 27275, "generateshortfall");
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5_int = 0;
                  var6 = 0;
                  L4: while (true) {
                    L5: {
                      if (var6 >= 4) {
                        break L5;
                      } else {
                        stackOut_7_0 = 0;
                        stackOut_7_1 = ((sd) (Object) var2).field_u[((sd) (Object) var2).field_w[var6]];
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var10 != 0) {
                          if (stackIn_10_0 <= stackIn_10_1) {
                            break L1;
                          } else {
                            L6: while (true) {
                              L7: {
                                if (var11.field_u[var5_int] <= 0) {
                                  break L7;
                                } else {
                                  var4++;
                                  break L7;
                                }
                              }
                              var5_int++;
                              if (var10 == 0) {
                                if (var5_int >= 4) {
                                  break L1;
                                } else {
                                  continue L6;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (stackIn_8_0 == stackIn_8_1) {
                              var5_int++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var6++;
                          if (var10 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var6_ref = null;
                    var5_int = 0;
                    var7_int = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          L12: {
                            L13: {
                              if (var7_int >= 4) {
                                break L13;
                              } else {
                                var8 = ((sd) (Object) var2).field_w[var7_int];
                                stackOut_16_0 = -1;
                                stackOut_16_1 = ~((sd) (Object) var2).field_u[var8];
                                stackIn_19_0 = stackOut_16_0;
                                stackIn_19_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var10 != 0) {
                                  if (stackIn_19_0 == stackIn_19_1) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_17_0 == stackIn_17_1) {
                                      L15: {
                                        L16: {
                                          var9 = re.a("<col=<%0>><%1></col>", 4371, new String[2]);
                                          var6_ref = (Object) (Object) var9;
                                          var6_ref = (Object) (Object) var9;
                                          if (var5_int != 0) {
                                            break L16;
                                          } else {
                                            var6_ref = (Object) (Object) var9;
                                            if (var10 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        L17: {
                                          if (var5_int == 1) {
                                            break L17;
                                          } else {
                                            var6_ref = (Object) (Object) (var9 + ef.field_d + var6_ref);
                                            if (var10 == 0) {
                                              break L15;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var6_ref = (Object) (Object) (var9 + qn.field_d + var6_ref);
                                        break L15;
                                      }
                                      var5_int++;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var7_int++;
                                  if (var10 == 0) {
                                    continue L9;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var6_ref = (Object) (Object) re.a(qj.field_d, 4371, new String[1]);
                            if (1 == var5_int) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                          var6_ref = (Object) (Object) (var6_ref + oo.field_f);
                          if (var10 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                        var6_ref = (Object) (Object) (var6_ref + aq.field_n);
                        var7 = var6_ref;
                        var5 = var7;
                        var7 = var6_ref;
                        var5 = var7;
                        break L10;
                      }
                      uq.field_m.a((String) var6_ref, 58895, "generateshortfall");
                      break L2;
                    }
                  }
                }
              }
              var4 = 0;
              var5_int = 0;
              L18: while (true) {
                if (var5_int >= 4) {
                  break L1;
                } else {
                  L19: {
                    if (var11.field_u[var5_int] <= 0) {
                      break L19;
                    } else {
                      var4++;
                      break L19;
                    }
                  }
                  var5_int++;
                  if (var10 == 0) {
                    continue L18;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5 = null;
            var4 = 0;
            var6 = 0;
            L20: while (true) {
              L21: {
                L22: {
                  if (var6 >= 4) {
                    break L22;
                  } else {
                    if (var10 != 0) {
                      break L21;
                    } else {
                      L23: {
                        if (var11.field_u[var6] <= 0) {
                          break L23;
                        } else {
                          if (var3[var6]) {
                            L24: {
                              L25: {
                                var7_ref = re.a("<col=<%0>><%1></col>", -27241, new String[2]);
                                var5 = (Object) (Object) var7_ref;
                                var5 = (Object) (Object) var7_ref;
                                if (var4 == 0) {
                                  break L25;
                                } else {
                                  L26: {
                                    if (var4 != 1) {
                                      break L26;
                                    } else {
                                      var5 = (Object) (Object) (var7_ref + qn.field_d + var5);
                                      if (var10 == 0) {
                                        break L24;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var5 = (Object) (Object) (var7_ref + ef.field_d + var5);
                                  if (var10 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              var5 = (Object) (Object) var7_ref;
                              break L24;
                            }
                            var4++;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var6++;
                      if (var10 == 0) {
                        continue L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                uq.field_m.a((String) var5, 27275, "generateprojectprogress");
                break L21;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "sj.A(" + 60 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show all private chat";
    }
}
