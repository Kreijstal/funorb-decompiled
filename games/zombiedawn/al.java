/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al {
    static String field_c;
    int field_d;
    int[] field_h;
    int field_k;
    static boolean field_e;
    int field_g;
    static dj field_a;
    private int field_j;
    static vn field_f;
    int field_i;
    private boolean field_l;
    jp field_b;

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (((al) this).field_h.length <= param0) {
                  break L1;
                } else {
                  L2: {
                    param0 = ((al) this).field_h[param0];
                    if (0 > param0) {
                      break L2;
                    } else {
                      if (param0 == 12) {
                        break L2;
                      } else {
                        if (13 == param0) {
                          break L2;
                        } else {
                          if (((al) this).field_b.d(param1 ^ -61)) {
                            hn discarded$3 = wm.a(param1 + 28, vb.field_D[68]);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    if (param1 == 68) {
                      break L3;
                    } else {
                      int discarded$4 = ((al) this).a(35, 8);
                      break L3;
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "al.QA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_f = null;
            field_c = null;
            field_a = null;
            if (param0 != 2) {
                boolean discarded$0 = al.a((dj) null, 55, (dj) null, (dj) null);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "al.NA(" + param0 + ')');
        }
    }

    void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (bd.field_e != 640) {
                break L1;
              } else {
                if (nh.field_P != 480) {
                  break L1;
                } else {
                  L2: {
                    if (param0 > 105) {
                      break L2;
                    } else {
                      ((al) this).field_l = false;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          var2_int = ((al) this).field_d;
                          if (var2_int == 1) {
                            break L6;
                          } else {
                            L7: {
                              if (14 != var2_int) {
                                break L7;
                              } else {
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var2_int != 8) {
                                break L8;
                              } else {
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (2 == var2_int) {
                              break L5;
                            } else {
                              L9: {
                                if (var2_int != 3) {
                                  break L9;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (4 != var2_int) {
                                  break L10;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var2_int != 5) {
                                  break L11;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var2_int != 6) {
                                  break L12;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (7 != var2_int) {
                                  break L13;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var2_int == 9) {
                                break L5;
                              } else {
                                if (var2_int == 13) {
                                  break L5;
                                } else {
                                  if (11 == var2_int) {
                                    break L4;
                                  } else {
                                    if (var2_int != 12) {
                                      break L3;
                                    } else {
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        qk.field_Hb[0].e(0, 0);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      qk.field_Hb[4].e(0, 0);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    bi.b(0, 0, 640, 480, 65793);
                    break L3;
                  }
                  break L0;
                }
              }
            }
            L14: {
              L15: {
                L16: {
                  L17: {
                    var2_int = bd.field_e / 128;
                    var3 = nh.field_P / 96;
                    var4 = ((al) this).field_d;
                    if (1 == var4) {
                      break L17;
                    } else {
                      if (var4 == 14) {
                        break L17;
                      } else {
                        if (var4 == 8) {
                          break L17;
                        } else {
                          if (2 == var4) {
                            break L16;
                          } else {
                            L18: {
                              if (var4 != 3) {
                                break L18;
                              } else {
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              if (var4 != 4) {
                                break L19;
                              } else {
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              if (var4 != 5) {
                                break L20;
                              } else {
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (var4 == 6) {
                              break L16;
                            } else {
                              if (var4 == 7) {
                                break L16;
                              } else {
                                if (var4 == 9) {
                                  break L16;
                                } else {
                                  if (var4 == 13) {
                                    break L16;
                                  } else {
                                    if (11 == var4) {
                                      break L15;
                                    } else {
                                      if (12 != var4) {
                                        break L14;
                                      } else {
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  qk.field_Hb[0].a(-var2_int, -var3, bd.field_e + 2 * var2_int, nh.field_P - -(2 * var3));
                  of.a(11690);
                  if (var5 == 0) {
                    break L14;
                  } else {
                    break L16;
                  }
                }
                qk.field_Hb[4].a(-var2_int, -var3, bd.field_e - -(var2_int * 2), nh.field_P + var3 * 2);
                of.a(11690);
                if (var5 == 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
              bi.b(0, 0, bd.field_e, nh.field_P, 65793);
              break L14;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "al.RA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = 2 * param0;
              if (param0 < 128) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = param0 * 2 - 256;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              if (param2) {
                var6 = var4_int;
                var4_int = var5;
                var5 = var6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = ((al) this).field_d;
              if (0 != var6) {
                break L3;
              } else {
                var6 = 2;
                break L3;
              }
            }
            L4: {
              if (11 == var6) {
                var6 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            lf.field_h.a();
            qk.field_Jb[var6].b((byte) 119);
            cn.field_f.b(64);
            var7 = -57 / ((param1 - -72) / 47);
            lf.field_h.c(0, 0, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "al.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "al.TA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 6) {
                break L1;
              } else {
                ((al) this).field_k = -83;
                break L1;
              }
            }
            if (!((al) this).field_l) {
              stackOut_6_0 = ((al) this).field_i * param0 + (((al) this).field_g - -vh.field_b);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = vh.field_b + ((al) this).field_g;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.DA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        vn var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_43_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_139_0 = 0;
        vn stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int stackIn_144_2 = 0;
        vn stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        vn stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_136_0 = 0;
        vn stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        vn stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        vn stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var4_int = ((al) this).a(param0, -1);
              var5 = ((al) this).c(param0, 6);
              var6 = ((al) this).field_h[param0];
              if (var6 == 22) {
                break L1;
              } else {
                if (var6 == 23) {
                  break L1;
                } else {
                  if (24 == var6) {
                    break L1;
                  } else {
                    if (25 == var6) {
                      break L1;
                    } else {
                      if (27 == var6) {
                        break L1;
                      } else {
                        if (var6 == 28) {
                          break L1;
                        } else {
                          if (29 == var6) {
                            break L1;
                          } else {
                            if (var6 == 30) {
                              break L1;
                            } else {
                              if (31 == var6) {
                                break L1;
                              } else {
                                if (var6 == 32) {
                                  break L1;
                                } else {
                                  if (var6 == 33) {
                                    break L1;
                                  } else {
                                    if (var6 == 44) {
                                      break L1;
                                    } else {
                                      if (var6 != 26) {
                                        L2: {
                                          var7 = vk.field_b[var6];
                                          var8 = ((al) this).a(true, param0) + -var5;
                                          var9 = ((al) this).b(param0, true);
                                          if (!param2) {
                                            stackOut_42_0 = 0;
                                            stackIn_43_0 = stackOut_42_0;
                                            break L2;
                                          } else {
                                            stackOut_40_0 = 2;
                                            stackIn_43_0 = stackOut_40_0;
                                            break L2;
                                          }
                                        }
                                        L3: {
                                          var10 = stackIn_43_0;
                                          if (var6 != 4) {
                                            break L3;
                                          } else {
                                            if (cn.field_b != null) {
                                              break L3;
                                            } else {
                                              L4: {
                                                if (be.field_j <= 0) {
                                                  break L4;
                                                } else {
                                                  if (!nh.a((byte) 77, vh.field_a)) {
                                                    break L4;
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                              }
                                              L5: {
                                                if (!param2) {
                                                  stackOut_58_0 = 6;
                                                  stackIn_59_0 = stackOut_58_0;
                                                  break L5;
                                                } else {
                                                  stackOut_56_0 = 7;
                                                  stackIn_59_0 = stackOut_56_0;
                                                  break L5;
                                                }
                                              }
                                              var10 = stackIn_59_0;
                                              break L3;
                                            }
                                          }
                                        }
                                        L6: {
                                          if (((al) this).field_d != 3) {
                                            break L6;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (var6 != 8) {
                                                  break L8;
                                                } else {
                                                  if (ad.field_e == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              L9: {
                                                if (var6 != 9) {
                                                  break L9;
                                                } else {
                                                  if (1 == ad.field_e) {
                                                    break L7;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                              if (var6 != 10) {
                                                break L6;
                                              } else {
                                                if (ad.field_e == 2) {
                                                  break L7;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (param2) {
                                                stackOut_84_0 = 1;
                                                stackIn_85_0 = stackOut_84_0;
                                                break L10;
                                              } else {
                                                stackOut_82_0 = 10;
                                                stackIn_85_0 = stackOut_82_0;
                                                break L10;
                                              }
                                            }
                                            var10 = stackIn_85_0;
                                            break L6;
                                          }
                                        }
                                        L11: {
                                          if (dj.field_e != null) {
                                            stackOut_89_0 = dj.field_e.j(-5402);
                                            stackIn_90_0 = stackOut_89_0;
                                            break L11;
                                          } else {
                                            stackOut_87_0 = 0;
                                            stackIn_90_0 = stackOut_87_0;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          L13: {
                                            var11 = stackIn_90_0;
                                            if (var7 != null) {
                                              break L13;
                                            } else {
                                              var7 = "ERROR: missing text";
                                              if (var22 == 0) {
                                                break L12;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (var6 == 20) {
                                              break L14;
                                            } else {
                                              if (var6 == 21) {
                                                L15: {
                                                  if (var11 == 0) {
                                                    var10 = 6;
                                                    break L15;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                                var7 = s.a(1938762664, var7, new String[1]);
                                                if (var22 == 0) {
                                                  break L12;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          var7 = s.a(1938762664, var7, new String[1]);
                                          break L12;
                                        }
                                        L16: {
                                          var12 = -sg.field_jb.field_x + -sg.field_jb.field_I + -ca.field_b[6].field_q + (-ca.field_b[0].field_q + var9);
                                          if (param1 <= -123) {
                                            break L16;
                                          } else {
                                            field_c = null;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          L18: {
                                            L19: {
                                              if (var6 == 12) {
                                                break L19;
                                              } else {
                                                if (var6 != 13) {
                                                  break L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (12 == var6) {
                                                stackOut_118_0 = 224;
                                                stackIn_119_0 = stackOut_118_0;
                                                break L20;
                                              } else {
                                                stackOut_116_0 = 288;
                                                stackIn_119_0 = stackOut_116_0;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              var13 = stackIn_119_0;
                                              var14 = 137 + ff.field_b;
                                              var15 = (var8 + -var14 >> -1499278207) + var5;
                                              sg.field_jb.c(var7, var15, (var12 >> 1574732513) + (ca.field_b[0].field_q + sg.field_jb.field_I + var4_int), var10, 0);
                                              var15 = var15 + (ff.field_b - -8);
                                              bi.c(var15, var9 / 2 + var4_int - 1, 129, 2, var10);
                                              if (var6 == 12) {
                                                stackOut_122_0 = ge.field_c;
                                                stackIn_123_0 = stackOut_122_0;
                                                break L21;
                                              } else {
                                                stackOut_120_0 = ce.field_u;
                                                stackIn_123_0 = stackOut_120_0;
                                                break L21;
                                              }
                                            }
                                            L22: {
                                              L23: {
                                                L24: {
                                                  var16 = stackIn_123_0;
                                                  var16 = (var16 << -125053368) / var13;
                                                  if (ad.field_g == null) {
                                                    break L24;
                                                  } else {
                                                    if (ad.field_g[0] == null) {
                                                      break L24;
                                                    } else {
                                                      if (ad.field_g[0][0] != null) {
                                                        break L23;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                }
                                                bi.b(-1 + (var16 >> 1294430849) + var15, 3 + var4_int, 3, -6 + var9, 6684672);
                                                bi.c(-1 + (var16 >> 1841016417) + var15, var4_int + 3, 3, -6 + var9, 11141120);
                                                if (var22 == 0) {
                                                  break L22;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                              L25: {
                                                if (var6 == 12) {
                                                  stackOut_138_0 = 0;
                                                  stackIn_139_0 = stackOut_138_0;
                                                  break L25;
                                                } else {
                                                  stackOut_136_0 = 1;
                                                  stackIn_139_0 = stackOut_136_0;
                                                  break L25;
                                                }
                                              }
                                              L26: {
                                                var17 = stackIn_139_0;
                                                var18 = (int)((tp.field_p >> 696066179) % 7L) + 7;
                                                if (param2) {
                                                  var18 = (int)((tp.field_p >> -175638525) % 4L) + 14;
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                              L27: {
                                                bi.b(var15, var9 / 2 + var4_int - 1, 129, 6, 6815744);
                                                bi.b(var15, -1 + var9 / 2 + var4_int, (var16 >> -1501401599) - -1, 6, 13373713);
                                                bi.c(var15, -1 + (var4_int + var9 / 2), 129, 6, var10);
                                                bi.e(var15, var4_int + (var9 / 2 + -1), 129, 6, 1, var10);
                                                stackOut_143_0 = ad.field_g[var17][var18];
                                                stackOut_143_1 = 0;
                                                stackOut_143_2 = 339;
                                                stackIn_146_0 = stackOut_143_0;
                                                stackIn_146_1 = stackOut_143_1;
                                                stackIn_146_2 = stackOut_143_2;
                                                stackIn_144_0 = stackOut_143_0;
                                                stackIn_144_1 = stackOut_143_1;
                                                stackIn_144_2 = stackOut_143_2;
                                                if (var6 != 12) {
                                                  stackOut_146_0 = (vn) (Object) stackIn_146_0;
                                                  stackOut_146_1 = stackIn_146_1;
                                                  stackOut_146_2 = stackIn_146_2;
                                                  stackOut_146_3 = 0;
                                                  stackIn_147_0 = stackOut_146_0;
                                                  stackIn_147_1 = stackOut_146_1;
                                                  stackIn_147_2 = stackOut_146_2;
                                                  stackIn_147_3 = stackOut_146_3;
                                                  break L27;
                                                } else {
                                                  stackOut_144_0 = (vn) (Object) stackIn_144_0;
                                                  stackOut_144_1 = stackIn_144_1;
                                                  stackOut_144_2 = stackIn_144_2;
                                                  stackOut_144_3 = 1;
                                                  stackIn_147_0 = stackOut_144_0;
                                                  stackIn_147_1 = stackOut_144_1;
                                                  stackIn_147_2 = stackOut_144_2;
                                                  stackIn_147_3 = stackOut_144_3;
                                                  break L27;
                                                }
                                              }
                                              var19 = fj.a(stackIn_147_0, stackIn_147_1, stackIn_147_2, stackIn_147_3 != 0);
                                              var20 = 1;
                                              var21 = 1;
                                              var19.h(var15 + (var16 >> 739849633) + (-1 + (-23 - -var20)), var21 + -10 + var4_int + 2, 1);
                                              var19.b(var15 + ((var16 >> 1906403553) + -24), 2 + var4_int - 10);
                                              break L22;
                                            }
                                            if (var22 == 0) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                          sg.field_jb.a(var7, var5 - -(var8 >> 568775841), var4_int + (sg.field_jb.field_I - -ca.field_b[0].field_q) - -(var12 >> -749156159), var10, 0);
                                          break L17;
                                        }
                                        break L0;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "al.VA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (((al) this).field_l) {
                  break L2;
                } else {
                  ((al) this).field_b.a(0, param0 ^ 31644);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((al) this).field_b.a(21657);
              break L1;
            }
            if (0 <= ((al) this).field_b.field_d) {
              L3: {
                if (((al) this).field_d != 2) {
                  break L3;
                } else {
                  if (((al) this).field_h[((al) this).field_b.field_d] != 21) {
                    break L3;
                  } else {
                    if (dj.field_e.j(-5402) != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (kg.field_i == 98) {
                          break L4;
                        } else {
                          if (99 == kg.field_i) {
                            ((al) this).field_b.b(((al) this).field_b.field_d + 1, param0 + 31542);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((al) this).field_b.b(((al) this).field_b.field_d + -1, -69);
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (param0 == -31645) {
                  break L5;
                } else {
                  ((al) this).field_d = -13;
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "al.F(" + param0 + ')');
        }
    }

    void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = ((al) this).field_b.field_d;
            if (((al) this).field_d != 11) {
              if (((al) this).field_d != 0) {
                if (((al) this).field_d != 8) {
                  L1: {
                    if (!param1) {
                      break L1;
                    } else {
                      L2: {
                        ((al) this).field_b.a((byte) -13, ((al) this).b(true, ha.field_b, ei.field_K), ((al) this).b(true, nc.field_j, hp.field_D));
                        if (-1 == ((al) this).field_b.field_d) {
                          break L2;
                        } else {
                          this.d(((al) this).field_b.field_d, 68);
                          ((al) this).a(true, ((al) this).field_b.field_d, -8512);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (ci.field_d == 1) {
                        L3: {
                          if (9 != ((al) this).field_d) {
                            break L3;
                          } else {
                            ((pl) this).a((byte) -114, ei.field_K, ha.field_b);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (((al) this).field_d == 13) {
                          ((ac) this).b(ha.field_b, 32526, ei.field_K);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L4: {
                    var4 = 62 % ((-39 - param0) / 61);
                    if (~var3_int == ~((al) this).field_b.field_d) {
                      break L4;
                    } else {
                      if (((al) this).field_b.field_d != -1) {
                        fn discarded$1 = kh.a(69, false);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  break L0;
                } else {
                  L5: {
                    var4 = jp.field_c.b(param1, 257);
                    if (var4 != 3) {
                      break L5;
                    } else {
                      ca.a(true, true, 1);
                      break L5;
                    }
                  }
                  L6: {
                    if (var4 == 1) {
                      ca.a(false, true, 1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var4 != 2) {
                      break L7;
                    } else {
                      ca.a(true, true, 1);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                vl.field_b.a(-1, param1);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((al) this).field_d == 2) {
                    break L3;
                  } else {
                    L4: {
                      if (((al) this).field_d == 3) {
                        break L4;
                      } else {
                        L5: {
                          if (((al) this).field_d == 5) {
                            break L5;
                          } else {
                            L6: {
                              if (9 == ((al) this).field_d) {
                                break L6;
                              } else {
                                if (1 == ((al) this).field_d) {
                                  if (be.field_j <= 0) {
                                    break L2;
                                  } else {
                                    var2_array = new int[-1 + ((al) this).field_h.length];
                                    var3 = 0;
                                    var4 = 0;
                                    L7: while (true) {
                                      L8: {
                                        if (~((al) this).field_h.length >= ~var4) {
                                          break L8;
                                        } else {
                                          var2_array[var3] = ((al) this).field_h[var4];
                                          stackOut_19_0 = var2_array[var3];
                                          stackOut_19_1 = 42;
                                          stackIn_41_0 = stackOut_19_0;
                                          stackIn_41_1 = stackOut_19_1;
                                          stackIn_20_0 = stackOut_19_0;
                                          stackIn_20_1 = stackOut_19_1;
                                          if (var5 != 0) {
                                            break L1;
                                          } else {
                                            L9: {
                                              if (stackIn_20_0 != stackIn_20_1) {
                                                break L9;
                                              } else {
                                                var3--;
                                                break L9;
                                              }
                                            }
                                            var4++;
                                            var3++;
                                            if (var5 == 0) {
                                              continue L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                      ((al) this).field_h = var2_array;
                                      ((al) this).field_b = new jp(((al) this).field_h.length);
                                      boolean discarded$1 = la.field_d.b(param0 ^ -20093, 1);
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                            if (0 >= be.field_j) {
                              break L2;
                            } else {
                              ((al) this).field_h[0] = 41;
                              ((pl) this).field_o[0] = 41;
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        ((al) this).field_h = new int[]{5};
                        ((al) this).field_b = new jp(((al) this).field_h.length);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((al) this).field_h = new int[]{44, 44, 8, 9, 10, 5};
                    ((al) this).field_b = new jp(((al) this).field_h.length);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((al) this).field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
                ((al) this).field_k = ((al) this).field_k - sg.field_jb.field_I / 2;
                ((al) this).field_b = new jp(((al) this).field_h.length);
                break L2;
              }
              stackOut_40_0 = param0;
              stackOut_40_1 = 24136;
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              break L1;
            }
            L10: {
              if (stackIn_41_0 == stackIn_41_1) {
                break L10;
              } else {
                ((al) this).field_h = null;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "al.SA(" + param0 + ')');
        }
    }

    int b(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4_int >= ((al) this).field_h.length) {
                      break L3;
                    } else {
                      var5 = ((al) this).a(var4_int, -1);
                      stackOut_6_0 = ((al) this).b(var4_int, -1);
                      stackIn_26_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            if (((al) this).c(var4_int, 6) > param1) {
                              break L4;
                            } else {
                              if (~((al) this).a(true, var4_int) >= ~param1) {
                                break L4;
                              } else {
                                if (~var5 < ~param2) {
                                  break L4;
                                } else {
                                  if (~param2 <= ~(var5 + ((al) this).b(var4_int, param0))) {
                                    break L4;
                                  } else {
                                    stackOut_22_0 = var4_int;
                                    stackIn_23_0 = stackOut_22_0;
                                    return stackIn_23_0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = -1;
                  stackIn_26_0 = stackOut_25_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 7;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "al.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    boolean a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        boolean stackIn_4_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_45_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        try {
          L0: {
            if (((al) this).field_d == 0) {
              stackOut_3_0 = vl.field_b.a(param0, param2, -29638);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 != 13) {
                  if (((al) this).field_d != 8) {
                    ((al) this).a(-31645);
                    if (-1 != ((al) this).field_b.field_d) {
                      this.d(((al) this).field_b.field_d, param1 + -65725);
                      ((al) this).a(false, ((al) this).field_b.field_d, param1 ^ -73791);
                      stackOut_45_0 = 1;
                      stackIn_46_0 = stackOut_45_0;
                      return stackIn_46_0 != 0;
                    } else {
                      break L1;
                    }
                  } else {
                    L2: {
                      var4_int = jp.field_c.b(3782);
                      if (var4_int == 3) {
                        ca.a(true, true, 1);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var4_int == 1) {
                        ca.a(false, true, 1);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (0 == var4_int) {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L4;
                      } else {
                        stackOut_38_0 = 1;
                        stackIn_41_0 = stackOut_38_0;
                        break L4;
                      }
                    }
                    return stackIn_41_0 != 0;
                  }
                } else {
                  if (((al) this).field_d == 2) {
                    ca.a(false, true, 0);
                    df.field_i = 1;
                    stackOut_26_0 = 1;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
                  } else {
                    if (10 == ((al) this).field_d) {
                      break L1;
                    } else {
                      if (((al) this).field_d != 9) {
                        if (((al) this).field_d != 13) {
                          if (((al) this).field_d != 7) {
                            if (((al) this).field_d == 1) {
                              break L1;
                            } else {
                              ca.a(false, true, df.field_i);
                              stackOut_24_0 = 1;
                              stackIn_25_0 = stackOut_24_0;
                              return stackIn_25_0 != 0;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          ((ac) this).e((byte) 54);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      } else {
                        ((pl) this).c(-26931);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                }
              }
              if (param1 == 65793) {
                stackOut_50_0 = 0;
                stackIn_51_0 = stackOut_50_0;
                break L0;
              } else {
                stackOut_48_0 = 1;
                stackIn_49_0 = stackOut_48_0;
                return stackIn_49_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "al.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_51_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 == -10) {
              L1: {
                L2: {
                  if (po.w(param0 + 13306)) {
                    break L2;
                  } else {
                    L3: {
                      vl.field_b.c(true);
                      vl.field_b.d(false);
                      bd.field_m = null;
                      if (nk.a(8, kg.field_g)) {
                        break L3;
                      } else {
                        ca.a(param1, true, 3);
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ca.a(param1, true, 6);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ca.a(param1, true, 7);
                break L1;
              }
              df.field_i = 1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.AB(" + param0 + ',' + param1 + ')');
        }
    }

    int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == -1) {
              if (((al) this).field_l) {
                stackOut_6_0 = id.field_M + param0 * ((al) this).field_i + ((al) this).field_k;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = id.field_M + ((al) this).field_k;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 62;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.OA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_101_0 = false;
        int stackIn_101_1 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_102_1 = 0;
        boolean stackIn_103_0 = false;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_265_0 = 0;
        boolean stackOut_100_0 = false;
        int stackOut_100_1 = 0;
        boolean stackOut_102_0 = false;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_264_0 = 0;
        int stackOut_263_0 = 0;
        var9 = ZombieDawn.field_J;
        var4_int = ((al) this).field_h[param1];
        if (param2 == -8512) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  L12: {
                                    L13: {
                                      L14: {
                                        L15: {
                                          L16: {
                                            L17: {
                                              L18: {
                                                L19: {
                                                  L20: {
                                                    L21: {
                                                      L22: {
                                                        L23: {
                                                          L24: {
                                                            L25: {
                                                              L26: {
                                                                L27: {
                                                                  L28: {
                                                                    L29: {
                                                                      var6 = var4_int;
                                                                      if (var6 == 0) {
                                                                        break L29;
                                                                      } else {
                                                                        L30: {
                                                                          if (var6 != 42) {
                                                                            break L30;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L28;
                                                                            } else {
                                                                              break L30;
                                                                            }
                                                                          }
                                                                        }
                                                                        L31: {
                                                                          if (var6 != 1) {
                                                                            break L31;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L27;
                                                                            } else {
                                                                              break L31;
                                                                            }
                                                                          }
                                                                        }
                                                                        L32: {
                                                                          if (var6 != 41) {
                                                                            break L32;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L26;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        L33: {
                                                                          if (var6 != 40) {
                                                                            break L33;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L25;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (5 == var6) {
                                                                          break L24;
                                                                        } else {
                                                                          L34: {
                                                                            if (var6 != 16) {
                                                                              break L34;
                                                                            } else {
                                                                              if (var9 == 0) {
                                                                                break L23;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (14 == var6) {
                                                                            break L22;
                                                                          } else {
                                                                            L35: {
                                                                              if (3 != var6) {
                                                                                break L35;
                                                                              } else {
                                                                                if (var9 == 0) {
                                                                                  break L21;
                                                                                } else {
                                                                                  break L35;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var6 == 6) {
                                                                              break L20;
                                                                            } else {
                                                                              if (var6 == 43) {
                                                                                break L19;
                                                                              } else {
                                                                                if (var6 == 2) {
                                                                                  break L18;
                                                                                } else {
                                                                                  if (var6 == 12) {
                                                                                    break L17;
                                                                                  } else {
                                                                                    if (var6 == 13) {
                                                                                      break L16;
                                                                                    } else {
                                                                                      L36: {
                                                                                        if (var6 != 4) {
                                                                                          break L36;
                                                                                        } else {
                                                                                          if (var9 == 0) {
                                                                                            break L15;
                                                                                          } else {
                                                                                            break L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (7 == var6) {
                                                                                        break L14;
                                                                                      } else {
                                                                                        if (44 == var6) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          L37: {
                                                                                            if (var6 != 8) {
                                                                                              break L37;
                                                                                            } else {
                                                                                              if (var9 == 0) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                break L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L38: {
                                                                                            if (var6 != 9) {
                                                                                              break L38;
                                                                                            } else {
                                                                                              if (var9 == 0) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                break L38;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L39: {
                                                                                            if (var6 != 10) {
                                                                                              break L39;
                                                                                            } else {
                                                                                              if (var9 == 0) {
                                                                                                break L10;
                                                                                              } else {
                                                                                                break L39;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (var6 == 15) {
                                                                                            break L9;
                                                                                          } else {
                                                                                            if (var6 == 17) {
                                                                                              break L8;
                                                                                            } else {
                                                                                              L40: {
                                                                                                if (var6 != 18) {
                                                                                                  break L40;
                                                                                                } else {
                                                                                                  if (var9 == 0) {
                                                                                                    break L7;
                                                                                                  } else {
                                                                                                    break L40;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if (11 == var6) {
                                                                                                break L6;
                                                                                              } else {
                                                                                                if (var6 == 19) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  L41: {
                                                                                                    if (20 != var6) {
                                                                                                      break L41;
                                                                                                    } else {
                                                                                                      if (var9 == 0) {
                                                                                                        break L4;
                                                                                                      } else {
                                                                                                        break L41;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (var6 == 21) {
                                                                                                    break L4;
                                                                                                  } else {
                                                                                                    L42: {
                                                                                                      if (var6 != 34) {
                                                                                                        break L42;
                                                                                                      } else {
                                                                                                        if (var9 == 0) {
                                                                                                          break L3;
                                                                                                        } else {
                                                                                                          break L42;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    if (37 == var6) {
                                                                                                      break L2;
                                                                                                    } else {
                                                                                                      if (var6 == 35) {
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          if (var6 != 36) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            if (var9 == 0) {
                                                                                                              break L1;
                                                                                                            } else {
                                                                                                              break L43;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if (var6 == 38) {
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          if (var6 != 39) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            if (var9 == 0) {
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              break L29;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    if (((al) this).field_b.d(-127)) {
                                                                      L44: {
                                                                        wi.field_b = null;
                                                                        bd.field_m = null;
                                                                        stackOut_100_0 = param0;
                                                                        stackOut_100_1 = 1;
                                                                        stackIn_102_0 = stackOut_100_0;
                                                                        stackIn_102_1 = stackOut_100_1;
                                                                        stackIn_101_0 = stackOut_100_0;
                                                                        stackIn_101_1 = stackOut_100_1;
                                                                        if (0 < be.field_j) {
                                                                          stackOut_102_0 = stackIn_102_0;
                                                                          stackOut_102_1 = stackIn_102_1;
                                                                          stackOut_102_2 = 13;
                                                                          stackIn_103_0 = stackOut_102_0;
                                                                          stackIn_103_1 = stackOut_102_1;
                                                                          stackIn_103_2 = stackOut_102_2;
                                                                          break L44;
                                                                        } else {
                                                                          stackOut_101_0 = stackIn_101_0;
                                                                          stackOut_101_1 = stackIn_101_1;
                                                                          stackOut_101_2 = 9;
                                                                          stackIn_103_0 = stackOut_101_0;
                                                                          stackIn_103_1 = stackOut_101_1;
                                                                          stackIn_103_2 = stackOut_101_2;
                                                                          break L44;
                                                                        }
                                                                      }
                                                                      ca.a(stackIn_103_0, stackIn_103_1 != 0, stackIn_103_2);
                                                                      df.field_i = 1;
                                                                      if (var9 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    } else {
                                                                      break L0;
                                                                    }
                                                                  }
                                                                  if (!((al) this).field_b.d(-128)) {
                                                                    break L0;
                                                                  } else {
                                                                    ca.a(param0, true, 8);
                                                                    df.field_i = 1;
                                                                    if (var9 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L27;
                                                                    }
                                                                  }
                                                                }
                                                                if (((al) this).field_b.d(param2 + 8386)) {
                                                                  ca.a(param0, true, 0);
                                                                  df.field_i = 1;
                                                                  if (var9 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                } else {
                                                                  break L0;
                                                                }
                                                              }
                                                              if (((al) this).field_b.d(-122)) {
                                                                ca.a(param0, true, 13);
                                                                if (var9 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              } else {
                                                                break L0;
                                                              }
                                                            }
                                                            if (((al) this).field_b.d(-122)) {
                                                              ca.a(param0, true, 9);
                                                              if (var9 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L24;
                                                              }
                                                            } else {
                                                              break L0;
                                                            }
                                                          }
                                                          if (((al) this).field_b.d(-128)) {
                                                            ca.a(param0, true, 1);
                                                            if (var9 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L23;
                                                            }
                                                          } else {
                                                            break L0;
                                                          }
                                                        }
                                                        if (!((al) this).field_b.d(-127)) {
                                                          break L0;
                                                        } else {
                                                          var6 = 1;
                                                          ca.a(param0, true, var6);
                                                          var7_ref_int__ = kg.field_g;
                                                          var8 = 0;
                                                          L45: while (true) {
                                                            L46: {
                                                              L47: {
                                                                if (8 <= var8) {
                                                                  break L47;
                                                                } else {
                                                                  var7_ref_int__[var8] = 0;
                                                                  var8++;
                                                                  if (var9 != 0) {
                                                                    break L46;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      continue L45;
                                                                    } else {
                                                                      break L47;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var7_ref_int__ = dj.field_i;
                                                              break L46;
                                                            }
                                                            var8 = 0;
                                                            L48: while (true) {
                                                              L49: {
                                                                L50: {
                                                                  if (8 <= var8) {
                                                                    break L50;
                                                                  } else {
                                                                    var7_ref_int__[var8] = 0;
                                                                    var8++;
                                                                    if (var9 != 0) {
                                                                      break L49;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        continue L48;
                                                                      } else {
                                                                        break L50;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                kk.field_j.b(param2 + 8482);
                                                                dn.field_D.b(-63);
                                                                to.field_b[0] = 0;
                                                                break L49;
                                                              }
                                                              if (var9 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L22;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (((al) this).field_b.d(-127)) {
                                                        ca.a(param0, true, 5);
                                                        df.field_i = ((al) this).field_d;
                                                        if (var9 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L21;
                                                        }
                                                      } else {
                                                        break L0;
                                                      }
                                                    }
                                                    if (((al) this).field_b.d(-126)) {
                                                      ((fg) (Object) qk.field_Jb[4]).d((byte) -37);
                                                      ca.a(param0, true, 4);
                                                      df.field_i = ((al) this).field_d;
                                                      if (var9 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L20;
                                                      }
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                  if (((al) this).field_b.d(-122)) {
                                                    ca.a(param0, true, df.field_i);
                                                    if (var9 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L19;
                                                    }
                                                  } else {
                                                    break L0;
                                                  }
                                                }
                                                if (((al) this).field_b.d(param2 + 8388)) {
                                                  ca.a(param0, true, 14);
                                                  df.field_i = ((al) this).field_d;
                                                  if (var9 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L18;
                                                  }
                                                } else {
                                                  break L0;
                                                }
                                              }
                                              if (!((al) this).field_b.d(param2 + 8386)) {
                                                break L0;
                                              } else {
                                                ca.a(param0, true, 3);
                                                if (var9 == 0) {
                                                  break L0;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            L51: {
                                              var5 = ge.field_c;
                                              if (((al) this).field_b.b(false)) {
                                                qb.a(false, 0);
                                                break L51;
                                              } else {
                                                break L51;
                                              }
                                            }
                                            L52: {
                                              if (!((al) this).field_b.f(param2 ^ 8536)) {
                                                break L52;
                                              } else {
                                                qb.a(false, 224);
                                                break L52;
                                              }
                                            }
                                            L53: {
                                              if (!((al) this).field_b.b(-126)) {
                                                break L53;
                                              } else {
                                                L54: {
                                                  var6 = 137 + ff.field_b;
                                                  var7 = (((al) this).c(param1, 6) + (((al) this).a(true, param1) - var6) >> -1118510271) + (ff.field_b + 8);
                                                  var8 = ha.field_b - var7 << -1469811711;
                                                  var8 = var8 * 224 >> 815035624;
                                                  if (var8 > 0) {
                                                    break L54;
                                                  } else {
                                                    qb.a(false, 0);
                                                    if (var9 == 0) {
                                                      break L53;
                                                    } else {
                                                      break L54;
                                                    }
                                                  }
                                                }
                                                L55: {
                                                  if (224 > var8) {
                                                    break L55;
                                                  } else {
                                                    qb.a(false, 224);
                                                    if (var9 == 0) {
                                                      break L53;
                                                    } else {
                                                      break L55;
                                                    }
                                                  }
                                                }
                                                qb.a(false, var8);
                                                break L53;
                                              }
                                            }
                                            L56: {
                                              if (!((al) this).field_b.c(-97)) {
                                                break L56;
                                              } else {
                                                L57: {
                                                  if (ge.field_c > 28) {
                                                    break L57;
                                                  } else {
                                                    qb.a(false, 0);
                                                    if (var9 == 0) {
                                                      break L56;
                                                    } else {
                                                      break L57;
                                                    }
                                                  }
                                                }
                                                L58: {
                                                  var6 = ge.field_c % 28;
                                                  if (0 != var6) {
                                                    break L58;
                                                  } else {
                                                    var6 = 28;
                                                    break L58;
                                                  }
                                                }
                                                qb.a(false, -var6 + ge.field_c);
                                                break L56;
                                              }
                                            }
                                            L59: {
                                              if (((al) this).field_b.e(-98)) {
                                                L60: {
                                                  if (ge.field_c < 196) {
                                                    break L60;
                                                  } else {
                                                    qb.a(false, 224);
                                                    if (var9 == 0) {
                                                      break L59;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                var6 = ge.field_c % 28;
                                                qb.a(false, 28 + (ge.field_c + -var6));
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            }
                                            if (~ge.field_c == ~var5) {
                                              break L0;
                                            } else {
                                              L61: {
                                                if (null == wh.field_e) {
                                                  break L61;
                                                } else {
                                                  if (wh.field_e.l()) {
                                                    break L61;
                                                  } else {
                                                    break L0;
                                                  }
                                                }
                                              }
                                              wh.field_e = kh.a(47, false);
                                              if (var9 == 0) {
                                                break L0;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L62: {
                                            if (!((al) this).field_b.b(false)) {
                                              break L62;
                                            } else {
                                              ZombieDawn.b(127, 0);
                                              break L62;
                                            }
                                          }
                                          L63: {
                                            if (!((al) this).field_b.f(-104)) {
                                              break L63;
                                            } else {
                                              ZombieDawn.b(115, 288);
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (!((al) this).field_b.b(param2 ^ 8491)) {
                                              break L64;
                                            } else {
                                              L65: {
                                                var6 = ff.field_b + 137;
                                                var7 = 8 + ((((al) this).c(param1, 6) - -((al) this).a(true, param1) - var6 >> 1330627489) + ff.field_b);
                                                var8 = ha.field_b - var7 << 645275713;
                                                var8 = var8 * 288 >> 1004751816;
                                                if (var8 <= 0) {
                                                  break L65;
                                                } else {
                                                  L66: {
                                                    if (288 > var8) {
                                                      break L66;
                                                    } else {
                                                      ZombieDawn.b(param2 ^ -8521, 288);
                                                      if (var9 == 0) {
                                                        break L64;
                                                      } else {
                                                        break L66;
                                                      }
                                                    }
                                                  }
                                                  ZombieDawn.b(124, var8);
                                                  if (var9 == 0) {
                                                    break L64;
                                                  } else {
                                                    break L65;
                                                  }
                                                }
                                              }
                                              ZombieDawn.b(118, 0);
                                              break L64;
                                            }
                                          }
                                          L67: {
                                            if (((al) this).field_b.c(-97)) {
                                              L68: {
                                                var6 = ce.field_u;
                                                if (36 < var6) {
                                                  break L68;
                                                } else {
                                                  ZombieDawn.b(124, 0);
                                                  if (var9 == 0) {
                                                    break L67;
                                                  } else {
                                                    break L68;
                                                  }
                                                }
                                              }
                                              L69: {
                                                var7 = var6 % 36;
                                                if (var7 == 0) {
                                                  var7 = 36;
                                                  break L69;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                              ZombieDawn.b(param2 + 8635, var6 - var7);
                                              break L67;
                                            } else {
                                              break L67;
                                            }
                                          }
                                          if (((al) this).field_b.e(param2 ^ 8542)) {
                                            L70: {
                                              L71: {
                                                var6 = ce.field_u;
                                                if (252 > var6) {
                                                  break L71;
                                                } else {
                                                  ZombieDawn.b(119, 288);
                                                  if (var9 == 0) {
                                                    break L70;
                                                  } else {
                                                    break L71;
                                                  }
                                                }
                                              }
                                              var7 = var6 % 36;
                                              ZombieDawn.b(127, 36 + (var6 - var7));
                                              break L70;
                                            }
                                            if (var9 == 0) {
                                              break L0;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L0;
                                          }
                                        }
                                        if (((al) this).field_b.d(-123)) {
                                          ra.d((byte) 76);
                                          if (var9 == 0) {
                                            break L0;
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          break L0;
                                        }
                                      }
                                      if (!((al) this).field_b.d(-123)) {
                                        break L0;
                                      } else {
                                        L72: {
                                          if (2 == ((al) this).field_d) {
                                            tp.a(param2 ^ -8478, false, w.field_a[5]);
                                            break L72;
                                          } else {
                                            break L72;
                                          }
                                        }
                                        this.a(-10, param0);
                                        if (var9 == 0) {
                                          break L0;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (!((al) this).field_b.d(-122)) {
                                      break L0;
                                    } else {
                                      ((vj) (Object) jj.c(3, 115)).d((byte) 77);
                                      if (var9 == 0) {
                                        break L0;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (((al) this).field_b.d(param2 + 8389)) {
                                    ad.field_e = 0;
                                    if (var9 == 0) {
                                      break L0;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L0;
                                  }
                                }
                                if (((al) this).field_b.d(-128)) {
                                  ad.field_e = 1;
                                  if (var9 == 0) {
                                    break L0;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L0;
                                }
                              }
                              if (((al) this).field_b.d(-122)) {
                                ad.field_e = 2;
                                if (var9 == 0) {
                                  break L0;
                                } else {
                                  break L9;
                                }
                              } else {
                                break L0;
                              }
                            }
                            if (((al) this).field_b.d(-121)) {
                              L73: {
                                L74: {
                                  if (((al) this).field_d == 5) {
                                    break L74;
                                  } else {
                                    if (3 != ((al) this).field_d) {
                                      break L73;
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                                hd.a(((al) this).field_d, param2 ^ 8500, ((al) this).field_d);
                                if (var9 == 0) {
                                  break L0;
                                } else {
                                  break L73;
                                }
                              }
                              if (7 == ((al) this).field_d) {
                                L75: {
                                  if (nk.a(param2 + 8520, kg.field_g)) {
                                    stackOut_264_0 = 6;
                                    stackIn_265_0 = stackOut_264_0;
                                    break L75;
                                  } else {
                                    stackOut_263_0 = 3;
                                    stackIn_265_0 = stackOut_263_0;
                                    break L75;
                                  }
                                }
                                hd.a(stackIn_265_0, -126, 7);
                                if (var9 == 0) {
                                  break L0;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L0;
                              }
                            } else {
                              break L0;
                            }
                          }
                          if (!((al) this).field_b.d(-128)) {
                            break L0;
                          } else {
                            if (!((al) this).b(param1, param2 + 8511)) {
                              break L0;
                            } else {
                              ((fg) (Object) qk.field_Jb[4]).c(20921, param0);
                              if (var9 == 0) {
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (!((al) this).field_b.d(-124)) {
                          break L0;
                        } else {
                          if (!((al) this).b(param1, param2 + 8511)) {
                            break L0;
                          } else {
                            ((fg) (Object) qk.field_Jb[4]).b(param0, 126);
                            if (var9 == 0) {
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (((al) this).field_b.d(-126)) {
                        L76: {
                          if (null != cn.field_b) {
                            re.a((byte) -71);
                            break L76;
                          } else {
                            break L76;
                          }
                        }
                        bo.a(-99, hc.a(param2 + 8512));
                        if (var9 == 0) {
                          break L0;
                        } else {
                          break L5;
                        }
                      } else {
                        break L0;
                      }
                    }
                    if (!((al) this).field_b.d(-125)) {
                      break L0;
                    } else {
                      L77: {
                        if (vl.field_b.g(true)) {
                          break L77;
                        } else {
                          this.a(param2 ^ 8502, param0);
                          if (var9 == 0) {
                            break L0;
                          } else {
                            break L77;
                          }
                        }
                      }
                      ca.a(true, true, 0);
                      if (var9 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((al) this).field_b.d(-125)) {
                    break L0;
                  } else {
                    if (vl.field_b.b(-25983)) {
                      vl.field_b.a(param2 + 8398);
                      ca.a(true, true, 0);
                      if (var9 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                if (((al) this).field_b.d(param2 + 8388)) {
                  dc.a((byte) 124);
                  vk.field_b[34] = hc.a(true);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L0;
                }
              }
              if (!((al) this).field_b.d(-124)) {
                break L0;
              } else {
                L78: {
                  if (!vi.field_a) {
                    break L78;
                  } else {
                    vk.field_b[37] = wl.field_a[0];
                    vi.field_a = false;
                    if (var9 == 0) {
                      break L0;
                    } else {
                      break L78;
                    }
                  }
                }
                vk.field_b[37] = wl.field_a[1];
                vi.field_a = true;
                if (var9 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((al) this).field_b.d(param2 ^ 8520)) {
              this.a(-10, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (((al) this).field_h[param0] == 39) {
                break L1;
              } else {
                if (((al) this).field_h[param0] == 45) {
                  break L1;
                } else {
                  if (((al) this).field_h[param0] == 46) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 == -1) {
                        break L2;
                      } else {
                        int discarded$2 = ((al) this).a(71, -63);
                        break L2;
                      }
                    }
                    L3: {
                      if (((al) this).field_h[param0] != 21) {
                        break L3;
                      } else {
                        if (dj.field_e.j(-5402) == 0) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (((al) this).field_d != 0) {
              if (((al) this).field_d != 11) {
                L1: {
                  L2: {
                    if (((al) this).field_d == 7) {
                      break L2;
                    } else {
                      if (((al) this).field_d != 8) {
                        L3: {
                          if (2 != ((al) this).field_d) {
                            break L3;
                          } else {
                            li.a(false);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (10 != ((al) this).field_d) {
                          break L1;
                        } else {
                          li.a(false);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        jp.field_c.b((byte) 123);
                        return;
                      }
                    }
                  }
                  li.a(false);
                  var2_int = 100 - -sg.field_jb.field_I;
                  var3 = 4 + sg.field_jb.field_x + sg.field_jb.field_w;
                  var4 = 16777215;
                  bj.field_q.a(wi.field_d, 320, var2_int, var4, -1);
                  bj.field_q.a(ma.a(rf.field_d, 98, eh.field_z, false), 320, var3 + var2_int, var4, -1);
                  bj.field_q.a(fh.a(false, rf.field_d, 0, eh.field_z), 320, 42 + (var3 * 3 + var2_int), var4, -1);
                  bj.field_q.a(g.a(rf.field_d, -121, false, eh.field_z), 320, var2_int + var3 * 4 + 84, var4, -1);
                  break L1;
                }
                L4: {
                  if (param0 <= -35) {
                    break L4;
                  } else {
                    ((al) this).field_j = -46;
                    break L4;
                  }
                }
                var2_int = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (~((al) this).field_b.field_h >= ~var2_int) {
                        break L7;
                      } else {
                        if (var5 != 0) {
                          break L6;
                        } else {
                          L8: {
                            L9: {
                              if (((al) this).b(var2_int, -1)) {
                                break L9;
                              } else {
                                if (21 == ((al) this).field_h[var2_int]) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L10: {
                              stackOut_37_0 = this;
                              stackOut_37_1 = var2_int;
                              stackOut_37_2 = -128;
                              stackIn_40_0 = stackOut_37_0;
                              stackIn_40_1 = stackOut_37_1;
                              stackIn_40_2 = stackOut_37_2;
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              stackIn_38_2 = stackOut_37_2;
                              if (~((al) this).field_b.field_d != ~var2_int) {
                                stackOut_40_0 = this;
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = stackIn_40_2;
                                stackOut_40_3 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                stackIn_41_2 = stackOut_40_2;
                                stackIn_41_3 = stackOut_40_3;
                                break L10;
                              } else {
                                stackOut_38_0 = this;
                                stackOut_38_1 = stackIn_38_1;
                                stackOut_38_2 = stackIn_38_2;
                                stackOut_38_3 = 1;
                                stackIn_41_0 = stackOut_38_0;
                                stackIn_41_1 = stackOut_38_1;
                                stackIn_41_2 = stackOut_38_2;
                                stackIn_41_3 = stackOut_38_3;
                                break L10;
                              }
                            }
                            this.a(stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0);
                            break L8;
                          }
                          var2_int++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (ed.field_b[((al) this).field_d] == null) {
                      break L6;
                    } else {
                      ed.field_b[((al) this).field_d].b(vh.field_b, id.field_M / 2);
                      break L6;
                    }
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              vl.field_b.e(9844);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "al.B(" + param0 + ')');
        }
    }

    final static boolean a(dj param0, int param1, dj param2, dj param3) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              if (!param2.a((byte) 73)) {
                break L1;
              } else {
                if (param2.a(-1, "commonui")) {
                  L2: {
                    if (!param3.a((byte) 73)) {
                      break L2;
                    } else {
                      if (!param3.a(-1, "commonui")) {
                        break L2;
                      } else {
                        L3: {
                          if (!param0.a((byte) 73)) {
                            break L3;
                          } else {
                            if (!param0.a(param1 + 31525, "button.gif")) {
                              break L3;
                            } else {
                              if (param1 == -31526) {
                                stackOut_25_0 = 1;
                                stackIn_26_0 = stackOut_25_0;
                                break L0;
                              } else {
                                stackOut_23_0 = 0;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0 != 0;
                              }
                            }
                          }
                        }
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("al.WA(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L4;
            }
          }
          L5: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L5;
            }
          }
          L6: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    void a(al param0, int param1) {
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
              if (param1 >= 70) {
                break L1;
              } else {
                ((al) this).field_b = null;
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
            stackOut_3_1 = new StringBuilder().append("al.W(");
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    int b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((al) this).field_l = false;
                break L1;
              }
            }
            stackOut_3_0 = 42;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.UA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    void a(byte param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((al) this).field_b.field_d != -1) {
                param1 = ((al) this).field_b.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            ((al) this).field_b.a(param2, (byte) -107, ((al) this).b(true, ha.field_b, ei.field_K), param1);
            if (param0 > 65) {
              L2: {
                if (8 == ((al) this).field_d) {
                  jp.field_c.a(param2, 1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!(this instanceof pl)) {
                  break L3;
                } else {
                  ((pl) this).b((byte) 122, true);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "al.FA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              if (((al) this).field_l) {
                stackOut_6_0 = ((al) this).field_j + vh.field_b;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((al) this).c(param1, 6) + ((al) this).field_i;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -117;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "al.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    al(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
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
            ((al) this).field_i = param5;
            ((al) this).field_k = param4;
            ((al) this).field_j = param3;
            ((al) this).field_h = param6;
            ((al) this).field_g = param2;
            ((al) this).field_l = param1;
            ((al) this).field_d = param0;
            ((al) this).field_b = new jp(((al) this).field_h.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("al.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "Create";
    }
}
