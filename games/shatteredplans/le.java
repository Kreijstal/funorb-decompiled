/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le {
    static tc field_e;
    static String field_a;
    static String field_c;
    static int field_b;
    static bi field_d;

    abstract void a(byte[] param0, byte param1);

    final static boolean a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_50_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_49_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_98_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (ShatteredPlansClient.field_K) {
                break L1;
              } else {
                if (fa.field_X == null) {
                  var3_int = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (em.field_h != 0) {
                break L2;
              } else {
                if (he.field_p != null) {
                  var3_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (2 != em.field_h) {
                break L3;
              } else {
                if (!lh.e((byte) 53)) {
                  var3_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (oq.field_j == 84) {
              L4: {
                L5: {
                  if (var3_int == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (cg.field_E.length() <= 0) {
                        break L6;
                      } else {
                        L7: {
                          var4_ref_String = cg.field_E.toString();
                          if (af.a(var4_ref_String, 0)) {
                            break L7;
                          } else {
                            L8: {
                              var5 = em.field_h;
                              if (var5 != 0) {
                                break L8;
                              } else {
                                if (null != np.field_a) {
                                  var5 = 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (id.a(-7019, var5) != 2) {
                                break L9;
                              } else {
                                gb.a((byte) 91, param0, 1, var5);
                                break L9;
                              }
                            }
                            ih.a(gi.field_a, 2, -1, em.field_h, var4_ref_String, param1);
                            if (var11 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        md.a(2, pr.field_e, 0, (String) null, (String) null, -16169);
                        md.a(2, go.field_K, 0, (String) null, (String) null, -16169);
                        break L6;
                      }
                    }
                    qq.c(param2);
                    if (var11 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (em.field_h == 0) {
                  break L4;
                } else {
                  qq.c(false);
                  break L4;
                }
              }
              stackOut_49_0 = 1;
              stackIn_50_0 = stackOut_49_0;
              return stackIn_50_0 != 0;
            } else {
              L10: {
                if (oq.field_j == 85) {
                  break L10;
                } else {
                  var4 = ho.field_h;
                  if (!nb.a((char) var4, 99)) {
                    if (var11 == 0) {
                      L11: {
                        if (!param2) {
                          break L11;
                        } else {
                          le.a(36);
                          break L11;
                        }
                      }
                      stackOut_103_0 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      break L0;
                    } else {
                      break L10;
                    }
                  } else {
                    L12: {
                      if (var3_int == 0) {
                        break L12;
                      } else {
                        if (cg.field_E.length() >= 80) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              StringBuilder discarded$3 = cg.field_E.append((char) var4);
                              var5 = 485;
                              var6 = ln.field_o;
                              var6 = v.a(var6, (byte) 17);
                              if (em.field_h == 2) {
                                break L14;
                              } else {
                                L15: {
                                  var7 = "";
                                  if (0 == em.field_h) {
                                    L16: {
                                      if (null != np.field_a) {
                                        break L16;
                                      } else {
                                        if (je.field_e) {
                                          var7 = "[" + ds.field_a + "] ";
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (null != np.field_a) {
                                      L17: {
                                        L18: {
                                          if (!i.field_c) {
                                            break L18;
                                          } else {
                                            if (wf.field_m != null) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        var7 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                                        if (var11 == 0) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var7 = "[" + wf.field_m + "] ";
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                var7 = var7 + var6 + ": ";
                                var5 = var5 - ho.field_f.c(var7);
                                if (var11 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L19: {
                              var7 = re.a(fj.field_q, 4371, new String[1]);
                              var8 = re.a(cf.field_M, 4371, new String[1]);
                              var9 = ho.field_f.c(var7);
                              var10 = ho.field_f.c(var8);
                              if (var9 > var10) {
                                break L19;
                              } else {
                                var5 = var5 - var10;
                                if (var11 == 0) {
                                  break L13;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var5 = var5 - var9;
                            break L13;
                          }
                          if (~var5 > ~ho.field_f.c(cg.field_E.toString())) {
                            StringBuilder discarded$4 = aj.a(cg.field_E, -1 + cg.field_E.length(), 87, ' ');
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_87_0 = 1;
                    stackIn_88_0 = stackOut_87_0;
                    return stackIn_88_0 != 0;
                  }
                }
              }
              L20: {
                if (var3_int == 0) {
                  break L20;
                } else {
                  if (cg.field_E.length() <= 0) {
                    break L20;
                  } else {
                    StringBuilder discarded$5 = aj.a(cg.field_E, cg.field_E.length() + -1, 83, ' ');
                    break L20;
                  }
                }
              }
              stackOut_98_0 = 1;
              stackIn_99_0 = stackOut_98_0;
              return stackIn_99_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "le.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_104_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_d = null;
              field_e = null;
              if (param0 >= 119) {
                break L1;
              } else {
                field_b = -98;
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "le.D(" + param0 + ')');
        }
    }

    abstract byte[] a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_c = "Rated game";
    }
}
