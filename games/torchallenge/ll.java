/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static boolean field_i;
    static int[][][] field_e;
    static ti[] field_h;
    static int field_a;
    static String field_c;
    static String field_f;
    static int field_b;
    static int field_d;
    static volatile int field_g;
    static boolean[][][] field_j;
    static int[][] field_k;

    final static int b(int param0) {
        return sj.field_L;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        L0: {
          var23 = TorChallenge.field_F ? 1 : 0;
          var12 = kj.field_C[0].field_q;
          var13 = -1;
          var14 = param11 + -param2;
          var15 = 0;
          var16 = si.field_F;
          if (param1 == 0) {
            var16 = si.field_F;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (1 != param1) {
            break L1;
          } else {
            var16 = kj.field_C[0];
            break L1;
          }
        }
        L2: {
          if (param1 != 2) {
            break L2;
          } else {
            var16 = kj.field_C[1];
            break L2;
          }
        }
        if (param5) {
          L3: {
            if (!param6) {
              var13 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param4) {
            L4: {
              if (param6) {
                var13 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!param4) {
                break L5;
              } else {
                if (!param6) {
                  break L5;
                } else {
                  var13 = 2;
                  break L5;
                }
              }
            }
            L6: {
              if (!param4) {
                break L6;
              } else {
                if (!param6) {
                  var13 = 3;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var17 = var13 * var12 >> 2;
              var18 = var14 << 2;
              var19 = var18 * var17 / var12;
              var20 = -var19 + param2;
              var21 = param2;
              if (var15 == 0) {
                break L7;
              } else {
                var21 = var21 + -var14;
                break L7;
              }
            }
            var22 = param11;
            if (var20 + var18 < var21) {
              return;
            } else {
              if (var22 >= var20) {
                if (param0 <= param7 - -var16.field_v) {
                  if (param7 <= param9) {
                    if (param10) {
                      if (var13 >= 0) {
                        if (var13 < 4) {
                          L8: {
                            if (param1 != 2) {
                              break L8;
                            } else {
                              if (!je.field_i) {
                                cj.field_c.d();
                                je.field_g.e(0, 0, param8);
                                od.a(cj.field_c, 33, 30, 68, 90);
                                var16.g(0, 0);
                                la.field_f.a(119);
                                je.field_i = true;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            qg.a(vd.field_e);
                            qg.a(var21, param0, var22, param9);
                            if (2 != param1) {
                              var16.d(var20, param7, var18, var16.field_v);
                              break L9;
                            } else {
                              cj.field_c.d(var20, param7, var18, cj.field_c.field_v);
                              break L9;
                            }
                          }
                          L10: {
                            if (1 == param1) {
                              break L10;
                            } else {
                              if (param1 == 2) {
                                break L10;
                              } else {
                                qg.b(vd.field_e);
                                return;
                              }
                            }
                          }
                          if (1 != var13) {
                            if (2 == var13) {
                              if (c.field_b.field_u >> 1 <= var14) {
                                c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                qg.b(vd.field_e);
                                return;
                              } else {
                                c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                qg.b(vd.field_e);
                                return;
                              }
                            } else {
                              qg.b(vd.field_e);
                              return;
                            }
                          } else {
                            if (var14 < c.field_b.field_u >> 1) {
                              c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
                              if (2 == var13) {
                                if (c.field_b.field_u >> 1 <= var14) {
                                  c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                  qg.b(vd.field_e);
                                  return;
                                } else {
                                  c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                  qg.b(vd.field_e);
                                  return;
                                }
                              } else {
                                qg.b(vd.field_e);
                                return;
                              }
                            } else {
                              c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
                              if (2 == var13) {
                                if (c.field_b.field_u >> 1 <= var14) {
                                  c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                  qg.b(vd.field_e);
                                  return;
                                } else {
                                  c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                  qg.b(vd.field_e);
                                  return;
                                }
                              } else {
                                qg.b(vd.field_e);
                                return;
                              }
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L11: {
              if (!param6) {
                break L11;
              } else {
                var13 = 2;
                break L11;
              }
            }
            L12: {
              if (!param4) {
                break L12;
              } else {
                if (!param6) {
                  var13 = 3;
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              var17 = var13 * var12 >> 2;
              var18 = var14 << 2;
              var19 = var18 * var17 / var12;
              var20 = -var19 + param2;
              var21 = param2;
              if (var15 == 0) {
                break L13;
              } else {
                var21 = var21 + -var14;
                break L13;
              }
            }
            var22 = param11;
            if (var20 + var18 < var21) {
              return;
            } else {
              if (var22 >= var20) {
                if (param0 <= param7 - -var16.field_v) {
                  if (param7 <= param9) {
                    if (param10) {
                      if (var13 >= 0) {
                        if (var13 < 4) {
                          L14: {
                            if (param1 != 2) {
                              break L14;
                            } else {
                              if (!je.field_i) {
                                cj.field_c.d();
                                je.field_g.e(0, 0, param8);
                                od.a(cj.field_c, 33, 30, 68, 90);
                                var16.g(0, 0);
                                la.field_f.a(119);
                                je.field_i = true;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            qg.a(vd.field_e);
                            qg.a(var21, param0, var22, param9);
                            if (2 != param1) {
                              var16.d(var20, param7, var18, var16.field_v);
                              break L15;
                            } else {
                              cj.field_c.d(var20, param7, var18, cj.field_c.field_v);
                              break L15;
                            }
                          }
                          L16: {
                            if (1 == param1) {
                              break L16;
                            } else {
                              if (param1 == 2) {
                                break L16;
                              } else {
                                qg.b(vd.field_e);
                                return;
                              }
                            }
                          }
                          if (1 != var13) {
                            if (2 == var13) {
                              if (c.field_b.field_u >> 1 <= var14) {
                                c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                qg.b(vd.field_e);
                                return;
                              } else {
                                c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                qg.b(vd.field_e);
                                return;
                              }
                            } else {
                              qg.b(vd.field_e);
                              return;
                            }
                          } else {
                            if (var14 >= c.field_b.field_u >> 1) {
                              L17: {
                                c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
                                if (2 == var13) {
                                  if (c.field_b.field_u >> 1 <= var14) {
                                    c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                    qg.b(vd.field_e);
                                    break L17;
                                  } else {
                                    c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                    qg.b(vd.field_e);
                                    break L17;
                                  }
                                } else {
                                  qg.b(vd.field_e);
                                  break L17;
                                }
                              }
                              return;
                            } else {
                              L18: {
                                c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
                                if (2 == var13) {
                                  if (c.field_b.field_u >> 1 <= var14) {
                                    c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                    qg.b(vd.field_e);
                                    break L18;
                                  } else {
                                    c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                    qg.b(vd.field_e);
                                    break L18;
                                  }
                                } else {
                                  qg.b(vd.field_e);
                                  break L18;
                                }
                              }
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L19: {
            if (param4) {
              break L19;
            } else {
              if (param6) {
                var13 = 1;
                break L19;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (!param4) {
              break L20;
            } else {
              if (!param6) {
                break L20;
              } else {
                var13 = 2;
                break L20;
              }
            }
          }
          L21: {
            if (!param4) {
              break L21;
            } else {
              if (!param6) {
                var13 = 3;
                break L21;
              } else {
                break L21;
              }
            }
          }
          L22: {
            var17 = var13 * var12 >> 2;
            var18 = var14 << 2;
            var19 = var18 * var17 / var12;
            var20 = -var19 + param2;
            var21 = param2;
            if (var15 == 0) {
              break L22;
            } else {
              var21 = var21 + -var14;
              break L22;
            }
          }
          var22 = param11;
          if (var20 + var18 < var21) {
            return;
          } else {
            if (var22 >= var20) {
              if (param0 <= param7 - -var16.field_v) {
                if (param7 <= param9) {
                  if (param10) {
                    if (var13 >= 0) {
                      if (var13 < 4) {
                        L23: {
                          if (param1 != 2) {
                            break L23;
                          } else {
                            if (!je.field_i) {
                              cj.field_c.d();
                              je.field_g.e(0, 0, param8);
                              od.a(cj.field_c, 33, 30, 68, 90);
                              var16.g(0, 0);
                              la.field_f.a(119);
                              je.field_i = true;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          qg.a(vd.field_e);
                          qg.a(var21, param0, var22, param9);
                          if (2 != param1) {
                            var16.d(var20, param7, var18, var16.field_v);
                            break L24;
                          } else {
                            cj.field_c.d(var20, param7, var18, cj.field_c.field_v);
                            break L24;
                          }
                        }
                        L25: {
                          if (1 == param1) {
                            break L25;
                          } else {
                            if (param1 == 2) {
                              break L25;
                            } else {
                              qg.b(vd.field_e);
                              return;
                            }
                          }
                        }
                        if (1 != var13) {
                          if (2 == var13) {
                            if (c.field_b.field_u >> 1 <= var14) {
                              c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                              qg.b(vd.field_e);
                              return;
                            } else {
                              c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                              qg.b(vd.field_e);
                              return;
                            }
                          } else {
                            qg.b(vd.field_e);
                            return;
                          }
                        } else {
                          if (var14 >= c.field_b.field_u >> 1) {
                            L26: {
                              c.field_b.g(param11 - (c.field_b.field_q >> 1), param7);
                              if (2 == var13) {
                                if (c.field_b.field_u >> 1 <= var14) {
                                  c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                  qg.b(vd.field_e);
                                  break L26;
                                } else {
                                  c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                  qg.b(vd.field_e);
                                  break L26;
                                }
                              } else {
                                qg.b(vd.field_e);
                                break L26;
                              }
                            }
                            return;
                          } else {
                            L27: {
                              c.field_b.d(-(var14 * (c.field_b.field_q >> 1) / (c.field_b.field_u >> 1)) + param11, param7, var14 * c.field_b.field_q / (c.field_b.field_u >> 1), c.field_b.field_v);
                              if (2 == var13) {
                                if (c.field_b.field_u >> 1 <= var14) {
                                  c.field_b.g(param2 - (c.field_b.field_q >> 1), param7);
                                  qg.b(vd.field_e);
                                  break L27;
                                } else {
                                  c.field_b.d(-((c.field_b.field_q >> 1) * var14 / (c.field_b.field_u >> 1)) + param2, param7, c.field_b.field_q * var14 / (c.field_b.field_u >> 1), c.field_b.field_v);
                                  qg.b(vd.field_e);
                                  break L27;
                                }
                              } else {
                                qg.b(vd.field_e);
                                break L27;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static int a(boolean param0, int param1) {
        param1--;
        if (!param0) {
          field_e = null;
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        L0: {
          if (!param1) {
            qg.b();
            qg.b();
            qg.b();
            break L0;
          } else {
            qg.a(0, 0, qg.field_g, qg.field_f, 0, 192);
            break L0;
          }
        }
        if (param0 != 0) {
          ll.a(80, true, false);
          c.a(param1, false);
          return;
        } else {
          c.a(param1, false);
          return;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        field_k = null;
        field_f = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 64;
        field_e = new int[][][]{new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][]};
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = -1;
        field_g = 0;
        field_j = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_k = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[1], new int[1]};
    }
}
