/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ab {
    private he field_O;
    private String field_M;
    private hl field_K;
    private int field_N;
    static int field_L;
    static String field_J;
    static hl[] field_I;

    pa(he param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (de) (Object) lb.b());
        int discarded$0 = -127;
        try {
            ((pa) this).field_M = param1;
            ((pa) this).field_O = param0;
            ((pa) this).a(param2, param4, (byte) 125, param5, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(ue param0) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param0.a(29741);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pa.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -206 + ')');
        }
        return stackIn_1_0;
    }

    public static void f() {
        field_I = null;
        field_J = null;
    }

    final void a(int param0, int param1, uj param2, int param3) {
        ((pa) this).field_N = ((pa) this).field_N + 1;
        if (param0 < 27) {
            return;
        }
        try {
            super.a(84, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static char a(char param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = param0;
          if (32 != var2) {
            if (160 != var2) {
              if (95 != var2) {
                if (var2 != 45) {
                  if (var2 != 91) {
                    if (93 != var2) {
                      if (var2 != 35) {
                        L1: {
                          if (var2 != 224) {
                            if (var2 != 225) {
                              if (var2 != 226) {
                                if (var2 != 228) {
                                  if (227 != var2) {
                                    if (var2 != 192) {
                                      if (var2 != 193) {
                                        if (194 != var2) {
                                          if (var2 == 196) {
                                            break L1;
                                          } else {
                                            if (var2 == 195) {
                                              break L1;
                                            } else {
                                              L2: {
                                                if (var2 != 232) {
                                                  if (var2 != 233) {
                                                    if (234 == var2) {
                                                      break L2;
                                                    } else {
                                                      if (235 != var2) {
                                                        if (var2 != 200) {
                                                          if (201 != var2) {
                                                            if (var2 == 202) {
                                                              break L2;
                                                            } else {
                                                              if (var2 != 203) {
                                                                L3: {
                                                                  if (var2 == 237) {
                                                                    break L3;
                                                                  } else {
                                                                    if (238 == var2) {
                                                                      break L3;
                                                                    } else {
                                                                      if (var2 == 239) {
                                                                        break L3;
                                                                      } else {
                                                                        if (var2 != 205) {
                                                                          if (var2 != 206) {
                                                                            if (var2 == 207) {
                                                                              break L3;
                                                                            } else {
                                                                              if (var2 != 242) {
                                                                                if (243 != var2) {
                                                                                  if (244 != var2) {
                                                                                    if (var2 != 246) {
                                                                                      if (var2 != 245) {
                                                                                        if (var2 != 210) {
                                                                                          if (var2 == 211) {
                                                                                            return 'o';
                                                                                          } else {
                                                                                            if (212 != var2) {
                                                                                              if (var2 != 214) {
                                                                                                if (213 != var2) {
                                                                                                  L4: {
                                                                                                    if (var2 == 249) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      if (var2 != 250) {
                                                                                                        if (var2 == 251) {
                                                                                                          break L4;
                                                                                                        } else {
                                                                                                          if (var2 != 252) {
                                                                                                            if (var2 != 217) {
                                                                                                              if (var2 != 218) {
                                                                                                                if (var2 != 219) {
                                                                                                                  if (var2 == 220) {
                                                                                                                    break L4;
                                                                                                                  } else {
                                                                                                                    if (var2 == 231) {
                                                                                                                      return 'c';
                                                                                                                    } else {
                                                                                                                      if (var2 != 199) {
                                                                                                                        if (var2 == 255) {
                                                                                                                          return 'y';
                                                                                                                        } else {
                                                                                                                          if (376 != var2) {
                                                                                                                            if (var2 != 241) {
                                                                                                                              if (var2 != 209) {
                                                                                                                                if (var2 == 223) {
                                                                                                                                  return 'b';
                                                                                                                                } else {
                                                                                                                                  return Character.toLowerCase(param0);
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'n';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'n';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'y';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  return 'u';
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            } else {
                                                                                              return 'o';
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L3;
                                                                          }
                                                                        } else {
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                return 'i';
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            break L2;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    break L2;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              return 'e';
                                            }
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  break L1;
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                        return 'a';
                      } else {
                        return param0;
                      }
                    } else {
                      return param0;
                    }
                  } else {
                    return param0;
                  }
                } else {
                  return '_';
                }
              } else {
                break L0;
              }
            } else {
              return '_';
            }
          } else {
            break L0;
          }
        }
        return '_';
    }

    final String d(int param0) {
        if (param0 == 12606) {
            return null;
        }
        ((pa) this).field_N = 74;
        return null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        p var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hl var16 = null;
        String var17 = null;
        Object var18 = null;
        hl var19 = null;
        hl var20 = null;
        hl var21 = null;
        Object var22 = null;
        hl var23 = null;
        hl var24 = null;
        hl var25 = null;
        Object var26 = null;
        hl var27 = null;
        hl var28 = null;
        hl var29 = null;
        hl var30 = null;
        Object var31 = null;
        hl var32 = null;
        hl var33 = null;
        hl var34 = null;
        lg var35 = null;
        lg var36 = null;
        lg var37 = null;
        lg var38 = null;
        var18 = null;
        var22 = null;
        var26 = null;
        var31 = null;
        var13 = StarCannon.field_A;
        var6 = ((pa) this).field_O.b((byte) -121);
        if (var6 != cg.field_g) {
          L0: {
            if (cd.field_a != var6) {
              var5 = ((pa) this).field_O.a(26162);
              if (var5 != null) {
                break L0;
              } else {
                var5 = ((pa) this).field_M;
                break L0;
              }
            } else {
              var5 = dh.field_b;
              break L0;
            }
          }
          if (var5.equals((Object) (Object) ((pa) this).field_k)) {
            L1: {
              super.a(param0, param1, param2, param3);
              var6 = ((pa) this).field_O.b((byte) -127);
              var38 = (lg) (Object) ((pa) this).field_o;
              var9 = ((pa) this).field_s + param1;
              var10 = var38.a((byte) -95, (uj) this, param3) + (var38.a((uj) this, (byte) -38).a(param2 + -169) >> 1);
              if (var6 == cg.field_g) {
                break L1;
              } else {
                if (cd.field_a == var6) {
                  break L1;
                } else {
                  if (var6 != sb.field_n) {
                    if (bf.field_x != var6) {
                      return;
                    } else {
                      var32 = fi.field_g[1];
                      var32.f(var9, var10 - (var32.field_v >> 1), 256);
                      return;
                    }
                  } else {
                    var33 = fi.field_g[2];
                    var33.f(var9, var10 - (var33.field_v >> 1), 256);
                    return;
                  }
                }
              }
            }
            var34 = fi.field_g[0];
            var11 = var34.field_x << 1;
            var12 = var34.field_q << 1;
            if (((pa) this).field_K != null) {
              if (var11 <= ((pa) this).field_K.field_u) {
                if (var12 > ((pa) this).field_K.field_v) {
                  ((pa) this).field_K = new hl(var11, var12);
                  bc.a(((pa) this).field_K, 26095);
                  var34.b(112, 144, var34.field_x << 4, var34.field_q << 4, -((pa) this).field_N << 10, 4096);
                  wf.a(-85);
                  ((pa) this).field_K.f(var9 + -(var34.field_x >> 1), var10 - var34.field_q, 256);
                  return;
                } else {
                  bc.a(((pa) this).field_K, 26095);
                  ki.b();
                  var34.b(112, 144, var34.field_x << 4, var34.field_q << 4, -((pa) this).field_N << 10, 4096);
                  wf.a(-85);
                  ((pa) this).field_K.f(var9 + -(var34.field_x >> 1), var10 - var34.field_q, 256);
                  return;
                }
              } else {
                ((pa) this).field_K = new hl(var11, var12);
                bc.a(((pa) this).field_K, 26095);
                var34.b(112, 144, var34.field_x << 4, var34.field_q << 4, -((pa) this).field_N << 10, 4096);
                wf.a(-85);
                ((pa) this).field_K.f(var9 + -(var34.field_x >> 1), var10 - var34.field_q, 256);
                return;
              }
            } else {
              ((pa) this).field_K = new hl(var11, var12);
              bc.a(((pa) this).field_K, 26095);
              var34.b(112, 144, var34.field_x << 4, var34.field_q << 4, -((pa) this).field_N << 10, 4096);
              wf.a(-85);
              ((pa) this).field_K.f(var9 + -(var34.field_x >> 1), var10 - var34.field_q, 256);
              return;
            }
          } else {
            ((pa) this).field_k = var5;
            ((pa) this).f((byte) 114);
            super.a(param0, param1, param2, param3);
            var6 = ((pa) this).field_O.b((byte) -127);
            var37 = (lg) (Object) ((pa) this).field_o;
            var9 = ((pa) this).field_s + param1;
            var10 = var37.a((byte) -95, (uj) this, param3) + (var37.a((uj) this, (byte) -38).a(param2 + -169) >> 1);
            if (var6 != cg.field_g) {
              if (cd.field_a == var6) {
                var30 = fi.field_g[0];
                var16 = var30;
                var11 = var30.field_x << 1;
                var12 = var30.field_q << 1;
                if (((pa) this).field_K != null) {
                  if (var11 <= ((pa) this).field_K.field_u) {
                    if (var12 <= ((pa) this).field_K.field_v) {
                      bc.a(((pa) this).field_K, 26095);
                      ki.b();
                      var30.b(112, 144, var30.field_x << 4, var30.field_q << 4, -((pa) this).field_N << 10, 4096);
                      wf.a(-85);
                      ((pa) this).field_K.f(var9 + -(var30.field_x >> 1), var10 - var30.field_q, 256);
                      return;
                    } else {
                      ((pa) this).field_K = new hl(var11, var12);
                      bc.a(((pa) this).field_K, 26095);
                      var30.b(112, 144, var30.field_x << 4, var30.field_q << 4, -((pa) this).field_N << 10, 4096);
                      wf.a(-85);
                      ((pa) this).field_K.f(var9 + -(var30.field_x >> 1), var10 - var30.field_q, 256);
                      return;
                    }
                  } else {
                    ((pa) this).field_K = new hl(var11, var12);
                    bc.a(((pa) this).field_K, 26095);
                    var30.b(112, 144, var30.field_x << 4, var30.field_q << 4, -((pa) this).field_N << 10, 4096);
                    wf.a(-85);
                    ((pa) this).field_K.f(var9 + -(var30.field_x >> 1), var10 - var30.field_q, 256);
                    return;
                  }
                } else {
                  ((pa) this).field_K = new hl(var11, var12);
                  bc.a(((pa) this).field_K, 26095);
                  var30.b(112, 144, var30.field_x << 4, var30.field_q << 4, -((pa) this).field_N << 10, 4096);
                  wf.a(-85);
                  ((pa) this).field_K.f(var9 + -(var30.field_x >> 1), var10 - var30.field_q, 256);
                  return;
                }
              } else {
                if (var6 != sb.field_n) {
                  if (bf.field_x == var6) {
                    var28 = fi.field_g[1];
                    var28.f(var9, var10 - (var28.field_v >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var29 = fi.field_g[2];
                  var29.f(var9, var10 - (var29.field_v >> 1), 256);
                  return;
                }
              }
            } else {
              L2: {
                L3: {
                  var27 = fi.field_g[0];
                  var11 = var27.field_x << 1;
                  var12 = var27.field_q << 1;
                  if (((pa) this).field_K == null) {
                    break L3;
                  } else {
                    if (var11 > ((pa) this).field_K.field_u) {
                      break L3;
                    } else {
                      if (var12 <= ((pa) this).field_K.field_v) {
                        bc.a(((pa) this).field_K, 26095);
                        ki.b();
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((pa) this).field_K = new hl(var11, var12);
                bc.a(((pa) this).field_K, 26095);
                break L2;
              }
              var27.b(112, 144, var27.field_x << 4, var27.field_q << 4, -((pa) this).field_N << 10, 4096);
              wf.a(-85);
              ((pa) this).field_K.f(var9 + -(var27.field_x >> 1), var10 - var27.field_q, 256);
              return;
            }
          }
        } else {
          var17 = dh.field_b;
          if (var17.equals((Object) (Object) ((pa) this).field_k)) {
            L4: {
              super.a(param0, param1, param2, param3);
              var6 = ((pa) this).field_O.b((byte) -127);
              var36 = (lg) (Object) ((pa) this).field_o;
              var9 = ((pa) this).field_s + param1;
              var10 = var36.a((byte) -95, (uj) this, param3) + (var36.a((uj) this, (byte) -38).a(param2 + -169) >> 1);
              if (var6 == cg.field_g) {
                break L4;
              } else {
                if (cd.field_a == var6) {
                  break L4;
                } else {
                  if (var6 != sb.field_n) {
                    if (bf.field_x == var6) {
                      var23 = fi.field_g[1];
                      var23.f(var9, var10 - (var23.field_v >> 1), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var24 = fi.field_g[2];
                    var24.f(var9, var10 - (var24.field_v >> 1), 256);
                    return;
                  }
                }
              }
            }
            var25 = fi.field_g[0];
            var11 = var25.field_x << 1;
            var12 = var25.field_q << 1;
            if (((pa) this).field_K != null) {
              if (var11 <= ((pa) this).field_K.field_u) {
                if (var12 > ((pa) this).field_K.field_v) {
                  ((pa) this).field_K = new hl(var11, var12);
                  bc.a(((pa) this).field_K, 26095);
                  var25.b(112, 144, var25.field_x << 4, var25.field_q << 4, -((pa) this).field_N << 10, 4096);
                  wf.a(-85);
                  ((pa) this).field_K.f(var9 + -(var25.field_x >> 1), var10 - var25.field_q, 256);
                  return;
                } else {
                  bc.a(((pa) this).field_K, 26095);
                  ki.b();
                  var25.b(112, 144, var25.field_x << 4, var25.field_q << 4, -((pa) this).field_N << 10, 4096);
                  wf.a(-85);
                  ((pa) this).field_K.f(var9 + -(var25.field_x >> 1), var10 - var25.field_q, 256);
                  return;
                }
              } else {
                ((pa) this).field_K = new hl(var11, var12);
                bc.a(((pa) this).field_K, 26095);
                var25.b(112, 144, var25.field_x << 4, var25.field_q << 4, -((pa) this).field_N << 10, 4096);
                wf.a(-85);
                ((pa) this).field_K.f(var9 + -(var25.field_x >> 1), var10 - var25.field_q, 256);
                return;
              }
            } else {
              ((pa) this).field_K = new hl(var11, var12);
              bc.a(((pa) this).field_K, 26095);
              var25.b(112, 144, var25.field_x << 4, var25.field_q << 4, -((pa) this).field_N << 10, 4096);
              wf.a(-85);
              ((pa) this).field_K.f(var9 + -(var25.field_x >> 1), var10 - var25.field_q, 256);
              return;
            }
          } else {
            L5: {
              L6: {
                ((pa) this).field_k = var17;
                ((pa) this).f((byte) 114);
                super.a(param0, param1, param2, param3);
                var6 = ((pa) this).field_O.b((byte) -127);
                var35 = (lg) (Object) ((pa) this).field_o;
                var9 = ((pa) this).field_s + param1;
                var10 = var35.a((byte) -95, (uj) this, param3) + (var35.a((uj) this, (byte) -38).a(param2 + -169) >> 1);
                if (var6 == cg.field_g) {
                  break L6;
                } else {
                  if (cd.field_a == var6) {
                    break L6;
                  } else {
                    if (var6 == sb.field_n) {
                      var20 = fi.field_g[2];
                      var20.f(var9, var10 - (var20.field_v >> 1), 256);
                      break L5;
                    } else {
                      if (bf.field_x != var6) {
                        break L5;
                      } else {
                        var19 = fi.field_g[1];
                        var19.f(var9, var10 - (var19.field_v >> 1), 256);
                        break L5;
                      }
                    }
                  }
                }
              }
              L7: {
                L8: {
                  var21 = fi.field_g[0];
                  var11 = var21.field_x << 1;
                  var12 = var21.field_q << 1;
                  if (((pa) this).field_K == null) {
                    break L8;
                  } else {
                    if (var11 > ((pa) this).field_K.field_u) {
                      break L8;
                    } else {
                      if (var12 <= ((pa) this).field_K.field_v) {
                        bc.a(((pa) this).field_K, 26095);
                        ki.b();
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                ((pa) this).field_K = new hl(var11, var12);
                bc.a(((pa) this).field_K, 26095);
                break L7;
              }
              var21.b(112, 144, var21.field_x << 4, var21.field_q << 4, -((pa) this).field_N << 10, 4096);
              wf.a(-85);
              ((pa) this).field_K.f(var9 + -(var21.field_x >> 1), var10 - var21.field_q, 256);
              break L5;
            }
            return;
          }
        }
    }

    final static void b(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == -31155) {
                        break L2;
                      } else {
                        field_J = null;
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("pa.E(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_J = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pa.PA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Loading...";
        field_L = 0;
    }
}
