/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends fw {
    static int[][] field_P;
    static String field_N;
    private n field_O;
    static String field_Q;
    private int field_L;
    static int[] field_M;
    static int field_R;

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("kw.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        kb var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_L = this.field_L + 1;
              super.a(param0 ^ 0, param1, param2, param3);
              if (param0 == 32722) {
                break L1;
              } else {
                var6 = (kb) null;
                discarded$2 = this.a(107, (kb) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("kw.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final String h(int param0) {
        if (param0 == 21384) {
          if (!this.field_t) {
            return null;
          } else {
            return this.field_O.a((byte) 55);
          }
        } else {
          kw.b(true);
          if (!this.field_t) {
            return null;
          } else {
            return this.field_O.a((byte) 55);
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        gu var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var14 = null;
        wk var15 = null;
        wk var16 = null;
        wk var17 = null;
        wk var18 = null;
        wk var19 = null;
        wk var20 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        super.a(param0, param1, (byte) -120, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = this.field_B + (param0 - -(this.field_l >> -1504947999));
          var6 = this.field_p + param1 - -(this.field_w >> 1785144961);
          if (param2 <= -82) {
            L0: {
              var8 = this.field_O.a(false);
              if (ad.field_K == var8) {
                break L0;
              } else {
                if (so.field_e == var8) {
                  break L0;
                } else {
                  L1: {
                    if (var8 != rn.field_e) {
                      break L1;
                    } else {
                      var18 = db.field_a[2];
                      var18.f(-(var18.field_y >> 2103304481) + var5, -(var18.field_v >> -354912063) + var6, 256);
                      if (var11 != 0) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (var8 == oo.field_g) {
                    var19 = db.field_a[1];
                    var19.f(-(var19.field_y >> 880011713) + var5, var6 + -(var19.field_v >> -1881675327), 256);
                    if (var11 != 0) {
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var20 = db.field_a[0];
            var9 = var20.field_A << -459839391;
            var10 = var20.field_x << 1068565025;
            if (null != bd.field_p) {
              if (var9 <= bd.field_p.field_y) {
                if (var10 <= bd.field_p.field_v) {
                  vn.a(bd.field_p, 3);
                  qn.b();
                  if (var11 == 0) {
                    var20.b(112, 144, var20.field_A << 2028169796, var20.field_x << -328565756, -this.field_L << 1885955178, 4096);
                    rf.b(-18862);
                    bd.field_p.f(-var20.field_A + var5, -var20.field_x + var6, 256);
                    return;
                  } else {
                    bd.field_p = new wk(var9, var10);
                    vn.a(bd.field_p, 3);
                    var20.b(112, 144, var20.field_A << 2028169796, var20.field_x << -328565756, -this.field_L << 1885955178, 4096);
                    rf.b(-18862);
                    bd.field_p.f(-var20.field_A + var5, -var20.field_x + var6, 256);
                    return;
                  }
                } else {
                  bd.field_p = new wk(var9, var10);
                  vn.a(bd.field_p, 3);
                  var20.b(112, 144, var20.field_A << 2028169796, var20.field_x << -328565756, -this.field_L << 1885955178, 4096);
                  rf.b(-18862);
                  bd.field_p.f(-var20.field_A + var5, -var20.field_x + var6, 256);
                  return;
                }
              } else {
                bd.field_p = new wk(var9, var10);
                vn.a(bd.field_p, 3);
                var20.b(112, 144, var20.field_A << 2028169796, var20.field_x << -328565756, -this.field_L << 1885955178, 4096);
                rf.b(-18862);
                bd.field_p.f(-var20.field_A + var5, -var20.field_x + var6, 256);
                return;
              }
            } else {
              bd.field_p = new wk(var9, var10);
              vn.a(bd.field_p, 3);
              var20.b(112, 144, var20.field_A << 2028169796, var20.field_x << -328565756, -this.field_L << 1885955178, 4096);
              rf.b(-18862);
              bd.field_p.f(-var20.field_A + var5, -var20.field_x + var6, 256);
              return;
            }
          } else {
            L2: {
              this.a(105, -107, (byte) -98, -86);
              var8 = this.field_O.a(false);
              if (ad.field_K == var8) {
                break L2;
              } else {
                if (so.field_e == var8) {
                  break L2;
                } else {
                  L3: {
                    if (var8 != rn.field_e) {
                      break L3;
                    } else {
                      var15 = db.field_a[2];
                      var15.f(-(var15.field_y >> 2103304481) + var5, -(var15.field_v >> -354912063) + var6, 256);
                      if (var11 != 0) {
                        break L3;
                      } else {
                        return;
                      }
                    }
                  }
                  if (var8 == oo.field_g) {
                    var16 = db.field_a[1];
                    var16.f(-(var16.field_y >> 880011713) + var5, var6 + -(var16.field_v >> -1881675327), 256);
                    if (var11 != 0) {
                      break L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var17 = db.field_a[0];
            var14 = var17;
            var9 = var17.field_A << -459839391;
            var10 = var17.field_x << 1068565025;
            if (null != bd.field_p) {
              if (var9 <= bd.field_p.field_y) {
                if (var10 <= bd.field_p.field_v) {
                  vn.a(bd.field_p, 3);
                  qn.b();
                  if (var11 != 0) {
                    bd.field_p = new wk(var9, var10);
                    vn.a(bd.field_p, 3);
                    var17.b(112, 144, var17.field_A << 2028169796, var17.field_x << -328565756, -this.field_L << 1885955178, 4096);
                    rf.b(-18862);
                    bd.field_p.f(-var17.field_A + var5, -var17.field_x + var6, 256);
                    return;
                  } else {
                    var17.b(112, 144, var17.field_A << 2028169796, var17.field_x << -328565756, -this.field_L << 1885955178, 4096);
                    rf.b(-18862);
                    bd.field_p.f(-var17.field_A + var5, -var17.field_x + var6, 256);
                    return;
                  }
                } else {
                  bd.field_p = new wk(var9, var10);
                  vn.a(bd.field_p, 3);
                  var17.b(112, 144, var17.field_A << 2028169796, var17.field_x << -328565756, -this.field_L << 1885955178, 4096);
                  rf.b(-18862);
                  bd.field_p.f(-var17.field_A + var5, -var17.field_x + var6, 256);
                  return;
                }
              } else {
                bd.field_p = new wk(var9, var10);
                vn.a(bd.field_p, 3);
                var17.b(112, 144, var17.field_A << 2028169796, var17.field_x << -328565756, -this.field_L << 1885955178, 4096);
                rf.b(-18862);
                bd.field_p.f(-var17.field_A + var5, -var17.field_x + var6, 256);
                return;
              }
            } else {
              bd.field_p = new wk(var9, var10);
              vn.a(bd.field_p, 3);
              var17.b(112, 144, var17.field_A << 2028169796, var17.field_x << -328565756, -this.field_L << 1885955178, 4096);
              rf.b(-18862);
              bd.field_p.f(-var17.field_A + var5, -var17.field_x + var6, 256);
              return;
            }
          }
        }
    }

    kw(n param0) {
        try {
            this.field_O = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -112 % ((param1 - -33) / 51);
        if (param0 <= 0) {
          if (160 <= param0) {
            if (param0 > 255) {
              L0: {
                L1: {
                  if (8364 != param0) {
                    break L1;
                  } else {
                    var2 = -128;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param0 == 8218) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == 402) {
                        break L3;
                      } else {
                        L4: {
                          if (8222 == param0) {
                            break L4;
                          } else {
                            L5: {
                              if (param0 == 8230) {
                                break L5;
                              } else {
                                L6: {
                                  if (param0 != 8224) {
                                    break L6;
                                  } else {
                                    var2 = -122;
                                    if (var4 == 0) {
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (param0 == 8225) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (param0 == 710) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (param0 != 8240) {
                                            break L9;
                                          } else {
                                            var2 = -119;
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L10: {
                                          if (param0 != 352) {
                                            break L10;
                                          } else {
                                            var2 = -118;
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (param0 != 8249) {
                                            break L11;
                                          } else {
                                            var2 = -117;
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (338 == param0) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (param0 == 381) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if (param0 == 8216) {
                                                    break L14;
                                                  } else {
                                                    L15: {
                                                      if (8217 != param0) {
                                                        break L15;
                                                      } else {
                                                        var2 = -110;
                                                        if (var4 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    L16: {
                                                      if (param0 == 8220) {
                                                        break L16;
                                                      } else {
                                                        L17: {
                                                          if (8221 == param0) {
                                                            break L17;
                                                          } else {
                                                            L18: {
                                                              if (param0 != 8226) {
                                                                break L18;
                                                              } else {
                                                                var2 = -107;
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L18;
                                                                }
                                                              }
                                                            }
                                                            L19: {
                                                              if (param0 != 8211) {
                                                                break L19;
                                                              } else {
                                                                var2 = -106;
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L19;
                                                                }
                                                              }
                                                            }
                                                            L20: {
                                                              if (param0 != 8212) {
                                                                break L20;
                                                              } else {
                                                                var2 = -105;
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L20;
                                                                }
                                                              }
                                                            }
                                                            L21: {
                                                              if (param0 != 732) {
                                                                break L21;
                                                              } else {
                                                                var2 = -104;
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                            L22: {
                                                              if (param0 == 8482) {
                                                                break L22;
                                                              } else {
                                                                L23: {
                                                                  if (353 != param0) {
                                                                    break L23;
                                                                  } else {
                                                                    var2 = -102;
                                                                    if (var4 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L23;
                                                                    }
                                                                  }
                                                                }
                                                                L24: {
                                                                  if (param0 == 8250) {
                                                                    break L24;
                                                                  } else {
                                                                    L25: {
                                                                      if (339 != param0) {
                                                                        break L25;
                                                                      } else {
                                                                        var2 = -100;
                                                                        if (var4 == 0) {
                                                                          break L0;
                                                                        } else {
                                                                          break L25;
                                                                        }
                                                                      }
                                                                    }
                                                                    L26: {
                                                                      if (param0 == 382) {
                                                                        break L26;
                                                                      } else {
                                                                        L27: {
                                                                          if (376 == param0) {
                                                                            break L27;
                                                                          } else {
                                                                            var2 = 63;
                                                                            if (var4 == 0) {
                                                                              break L0;
                                                                            } else {
                                                                              break L27;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = -97;
                                                                        if (var4 == 0) {
                                                                          break L0;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -98;
                                                                    if (var4 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L24;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -101;
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L22;
                                                                }
                                                              }
                                                            }
                                                            var2 = -103;
                                                            if (var4 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                        var2 = -108;
                                                        if (var4 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                    var2 = -109;
                                                    if (var4 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                var2 = -111;
                                                if (var4 == 0) {
                                                  break L0;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var2 = -114;
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var2 = -116;
                                        if (var4 == 0) {
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var2 = -120;
                                    if (var4 == 0) {
                                      break L0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var2 = -121;
                                if (var4 == 0) {
                                  break L0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var2 = -123;
                            if (var4 == 0) {
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2 = -124;
                        if (var4 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2 = -125;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = -126;
                break L0;
              }
              return (byte) var2;
            } else {
              L28: {
                var2 = (byte)param0;
                if (var4 == 0) {
                  break L28;
                } else {
                  L29: {
                    if (8364 != param0) {
                      break L29;
                    } else {
                      var2 = -128;
                      break L29;
                    }
                  }
                  L30: {
                    if (param0 == 8218) {
                      break L30;
                    } else {
                      L31: {
                        if (param0 == 402) {
                          break L31;
                        } else {
                          L32: {
                            if (8222 == param0) {
                              break L32;
                            } else {
                              L33: {
                                if (param0 == 8230) {
                                  break L33;
                                } else {
                                  L34: {
                                    if (param0 != 8224) {
                                      break L34;
                                    } else {
                                      var2 = -122;
                                      if (var4 == 0) {
                                        break L28;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                  L35: {
                                    if (param0 == 8225) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if (param0 == 710) {
                                          break L36;
                                        } else {
                                          L37: {
                                            if (param0 != 8240) {
                                              break L37;
                                            } else {
                                              var2 = -119;
                                              if (var4 == 0) {
                                                break L28;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                          L38: {
                                            if (param0 != 352) {
                                              break L38;
                                            } else {
                                              var2 = -118;
                                              if (var4 == 0) {
                                                break L28;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          L39: {
                                            if (param0 != 8249) {
                                              break L39;
                                            } else {
                                              var2 = -117;
                                              if (var4 == 0) {
                                                break L28;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          L40: {
                                            if (338 == param0) {
                                              break L40;
                                            } else {
                                              L41: {
                                                if (param0 == 381) {
                                                  break L41;
                                                } else {
                                                  L42: {
                                                    if (param0 == 8216) {
                                                      break L42;
                                                    } else {
                                                      L43: {
                                                        if (8217 != param0) {
                                                          break L43;
                                                        } else {
                                                          var2 = -110;
                                                          if (var4 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                      }
                                                      L44: {
                                                        if (param0 == 8220) {
                                                          break L44;
                                                        } else {
                                                          L45: {
                                                            if (8221 == param0) {
                                                              break L45;
                                                            } else {
                                                              L46: {
                                                                if (param0 != 8226) {
                                                                  break L46;
                                                                } else {
                                                                  var2 = -107;
                                                                  if (var4 == 0) {
                                                                    break L28;
                                                                  } else {
                                                                    break L46;
                                                                  }
                                                                }
                                                              }
                                                              L47: {
                                                                if (param0 != 8211) {
                                                                  break L47;
                                                                } else {
                                                                  var2 = -106;
                                                                  if (var4 == 0) {
                                                                    break L28;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                              }
                                                              L48: {
                                                                if (param0 != 8212) {
                                                                  break L48;
                                                                } else {
                                                                  var2 = -105;
                                                                  if (var4 == 0) {
                                                                    break L28;
                                                                  } else {
                                                                    break L48;
                                                                  }
                                                                }
                                                              }
                                                              L49: {
                                                                if (param0 != 732) {
                                                                  break L49;
                                                                } else {
                                                                  var2 = -104;
                                                                  if (var4 == 0) {
                                                                    break L28;
                                                                  } else {
                                                                    break L49;
                                                                  }
                                                                }
                                                              }
                                                              L50: {
                                                                if (param0 == 8482) {
                                                                  break L50;
                                                                } else {
                                                                  L51: {
                                                                    if (353 != param0) {
                                                                      break L51;
                                                                    } else {
                                                                      var2 = -102;
                                                                      if (var4 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L51;
                                                                      }
                                                                    }
                                                                  }
                                                                  L52: {
                                                                    if (param0 == 8250) {
                                                                      break L52;
                                                                    } else {
                                                                      L53: {
                                                                        if (339 != param0) {
                                                                          break L53;
                                                                        } else {
                                                                          var2 = -100;
                                                                          if (var4 == 0) {
                                                                            break L28;
                                                                          } else {
                                                                            break L53;
                                                                          }
                                                                        }
                                                                      }
                                                                      L54: {
                                                                        if (param0 == 382) {
                                                                          break L54;
                                                                        } else {
                                                                          L55: {
                                                                            if (376 == param0) {
                                                                              break L55;
                                                                            } else {
                                                                              var2 = 63;
                                                                              if (var4 == 0) {
                                                                                break L28;
                                                                              } else {
                                                                                break L55;
                                                                              }
                                                                            }
                                                                          }
                                                                          var2 = -97;
                                                                          if (var4 == 0) {
                                                                            break L28;
                                                                          } else {
                                                                            break L54;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -98;
                                                                      if (var4 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L52;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -101;
                                                                  if (var4 == 0) {
                                                                    break L28;
                                                                  } else {
                                                                    break L50;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -103;
                                                              if (var4 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L45;
                                                              }
                                                            }
                                                          }
                                                          var2 = -108;
                                                          if (var4 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L44;
                                                          }
                                                        }
                                                      }
                                                      var2 = -109;
                                                      if (var4 == 0) {
                                                        break L28;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                  var2 = -111;
                                                  if (var4 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              var2 = -114;
                                              if (var4 == 0) {
                                                break L28;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                          var2 = -116;
                                          if (var4 == 0) {
                                            break L28;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      var2 = -120;
                                      if (var4 == 0) {
                                        break L28;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  var2 = -121;
                                  if (var4 == 0) {
                                    break L28;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              var2 = -123;
                              if (var4 == 0) {
                                break L28;
                              } else {
                                break L32;
                              }
                            }
                          }
                          var2 = -124;
                          if (var4 == 0) {
                            break L28;
                          } else {
                            break L31;
                          }
                        }
                      }
                      var2 = -125;
                      if (var4 == 0) {
                        break L28;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var2 = -126;
                  break L28;
                }
              }
              return (byte) var2;
            }
          } else {
            L56: {
              L57: {
                if (8364 != param0) {
                  break L57;
                } else {
                  var2 = -128;
                  if (var4 == 0) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
              }
              L58: {
                if (param0 == 8218) {
                  break L58;
                } else {
                  L59: {
                    if (param0 == 402) {
                      break L59;
                    } else {
                      L60: {
                        if (8222 == param0) {
                          break L60;
                        } else {
                          L61: {
                            if (param0 == 8230) {
                              break L61;
                            } else {
                              L62: {
                                if (param0 != 8224) {
                                  break L62;
                                } else {
                                  var2 = -122;
                                  if (var4 == 0) {
                                    break L56;
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              L63: {
                                if (param0 == 8225) {
                                  break L63;
                                } else {
                                  L64: {
                                    if (param0 == 710) {
                                      break L64;
                                    } else {
                                      L65: {
                                        if (param0 != 8240) {
                                          break L65;
                                        } else {
                                          var2 = -119;
                                          if (var4 == 0) {
                                            break L56;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                      L66: {
                                        if (param0 != 352) {
                                          break L66;
                                        } else {
                                          var2 = -118;
                                          if (var4 == 0) {
                                            break L56;
                                          } else {
                                            break L66;
                                          }
                                        }
                                      }
                                      L67: {
                                        if (param0 != 8249) {
                                          break L67;
                                        } else {
                                          var2 = -117;
                                          if (var4 == 0) {
                                            break L56;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                      L68: {
                                        if (338 == param0) {
                                          break L68;
                                        } else {
                                          L69: {
                                            if (param0 == 381) {
                                              break L69;
                                            } else {
                                              L70: {
                                                if (param0 == 8216) {
                                                  break L70;
                                                } else {
                                                  L71: {
                                                    if (8217 != param0) {
                                                      break L71;
                                                    } else {
                                                      var2 = -110;
                                                      if (var4 == 0) {
                                                        break L56;
                                                      } else {
                                                        break L71;
                                                      }
                                                    }
                                                  }
                                                  L72: {
                                                    if (param0 == 8220) {
                                                      break L72;
                                                    } else {
                                                      L73: {
                                                        if (8221 == param0) {
                                                          break L73;
                                                        } else {
                                                          L74: {
                                                            if (param0 != 8226) {
                                                              break L74;
                                                            } else {
                                                              var2 = -107;
                                                              if (var4 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L74;
                                                              }
                                                            }
                                                          }
                                                          L75: {
                                                            if (param0 != 8211) {
                                                              break L75;
                                                            } else {
                                                              var2 = -106;
                                                              if (var4 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L75;
                                                              }
                                                            }
                                                          }
                                                          L76: {
                                                            if (param0 != 8212) {
                                                              break L76;
                                                            } else {
                                                              var2 = -105;
                                                              if (var4 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L76;
                                                              }
                                                            }
                                                          }
                                                          L77: {
                                                            if (param0 != 732) {
                                                              break L77;
                                                            } else {
                                                              var2 = -104;
                                                              if (var4 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                          }
                                                          L78: {
                                                            if (param0 == 8482) {
                                                              break L78;
                                                            } else {
                                                              L79: {
                                                                if (353 != param0) {
                                                                  break L79;
                                                                } else {
                                                                  var2 = -102;
                                                                  if (var4 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                              L80: {
                                                                if (param0 == 8250) {
                                                                  break L80;
                                                                } else {
                                                                  L81: {
                                                                    if (339 != param0) {
                                                                      break L81;
                                                                    } else {
                                                                      var2 = -100;
                                                                      if (var4 == 0) {
                                                                        break L56;
                                                                      } else {
                                                                        break L81;
                                                                      }
                                                                    }
                                                                  }
                                                                  L82: {
                                                                    if (param0 == 382) {
                                                                      break L82;
                                                                    } else {
                                                                      L83: {
                                                                        if (376 == param0) {
                                                                          break L83;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var4 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L83;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var4 == 0) {
                                                                        break L56;
                                                                      } else {
                                                                        break L82;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -98;
                                                                  if (var4 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L80;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -101;
                                                              if (var4 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L78;
                                                              }
                                                            }
                                                          }
                                                          var2 = -103;
                                                          if (var4 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L73;
                                                          }
                                                        }
                                                      }
                                                      var2 = -108;
                                                      if (var4 == 0) {
                                                        break L56;
                                                      } else {
                                                        break L72;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var4 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L70;
                                                  }
                                                }
                                              }
                                              var2 = -111;
                                              if (var4 == 0) {
                                                break L56;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                          var2 = -114;
                                          if (var4 == 0) {
                                            break L56;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      var2 = -116;
                                      if (var4 == 0) {
                                        break L56;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  var2 = -120;
                                  if (var4 == 0) {
                                    break L56;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var4 == 0) {
                                break L56;
                              } else {
                                break L61;
                              }
                            }
                          }
                          var2 = -123;
                          if (var4 == 0) {
                            break L56;
                          } else {
                            break L60;
                          }
                        }
                      }
                      var2 = -124;
                      if (var4 == 0) {
                        break L56;
                      } else {
                        break L59;
                      }
                    }
                  }
                  var2 = -125;
                  if (var4 == 0) {
                    break L56;
                  } else {
                    break L58;
                  }
                }
              }
              var2 = -126;
              break L56;
            }
            return (byte) var2;
          }
        } else {
          if (param0 >= 128) {
            L84: {
              L85: {
                if (160 > param0) {
                  break L85;
                } else {
                  if (param0 > 255) {
                    break L85;
                  } else {
                    var2 = (byte)param0;
                    if (var4 == 0) {
                      break L84;
                    } else {
                      break L85;
                    }
                  }
                }
              }
              L86: {
                if (8364 != param0) {
                  break L86;
                } else {
                  var2 = -128;
                  if (var4 == 0) {
                    break L84;
                  } else {
                    break L86;
                  }
                }
              }
              L87: {
                if (param0 == 8218) {
                  break L87;
                } else {
                  L88: {
                    if (param0 == 402) {
                      break L88;
                    } else {
                      L89: {
                        if (8222 == param0) {
                          break L89;
                        } else {
                          L90: {
                            if (param0 == 8230) {
                              break L90;
                            } else {
                              L91: {
                                if (param0 != 8224) {
                                  break L91;
                                } else {
                                  var2 = -122;
                                  if (var4 == 0) {
                                    break L84;
                                  } else {
                                    break L91;
                                  }
                                }
                              }
                              L92: {
                                if (param0 == 8225) {
                                  break L92;
                                } else {
                                  L93: {
                                    if (param0 == 710) {
                                      break L93;
                                    } else {
                                      L94: {
                                        if (param0 != 8240) {
                                          break L94;
                                        } else {
                                          var2 = -119;
                                          if (var4 == 0) {
                                            break L84;
                                          } else {
                                            break L94;
                                          }
                                        }
                                      }
                                      L95: {
                                        if (param0 != 352) {
                                          break L95;
                                        } else {
                                          var2 = -118;
                                          if (var4 == 0) {
                                            break L84;
                                          } else {
                                            break L95;
                                          }
                                        }
                                      }
                                      L96: {
                                        if (param0 != 8249) {
                                          break L96;
                                        } else {
                                          var2 = -117;
                                          if (var4 == 0) {
                                            break L84;
                                          } else {
                                            break L96;
                                          }
                                        }
                                      }
                                      L97: {
                                        if (338 == param0) {
                                          break L97;
                                        } else {
                                          L98: {
                                            if (param0 == 381) {
                                              break L98;
                                            } else {
                                              L99: {
                                                if (param0 == 8216) {
                                                  break L99;
                                                } else {
                                                  L100: {
                                                    if (8217 != param0) {
                                                      break L100;
                                                    } else {
                                                      var2 = -110;
                                                      if (var4 == 0) {
                                                        break L84;
                                                      } else {
                                                        break L100;
                                                      }
                                                    }
                                                  }
                                                  L101: {
                                                    if (param0 == 8220) {
                                                      break L101;
                                                    } else {
                                                      L102: {
                                                        if (8221 == param0) {
                                                          break L102;
                                                        } else {
                                                          L103: {
                                                            if (param0 != 8226) {
                                                              break L103;
                                                            } else {
                                                              var2 = -107;
                                                              if (var4 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L103;
                                                              }
                                                            }
                                                          }
                                                          L104: {
                                                            if (param0 != 8211) {
                                                              break L104;
                                                            } else {
                                                              var2 = -106;
                                                              if (var4 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L104;
                                                              }
                                                            }
                                                          }
                                                          L105: {
                                                            if (param0 != 8212) {
                                                              break L105;
                                                            } else {
                                                              var2 = -105;
                                                              if (var4 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L105;
                                                              }
                                                            }
                                                          }
                                                          L106: {
                                                            if (param0 != 732) {
                                                              break L106;
                                                            } else {
                                                              var2 = -104;
                                                              if (var4 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L106;
                                                              }
                                                            }
                                                          }
                                                          L107: {
                                                            if (param0 == 8482) {
                                                              break L107;
                                                            } else {
                                                              L108: {
                                                                if (353 != param0) {
                                                                  break L108;
                                                                } else {
                                                                  var2 = -102;
                                                                  if (var4 == 0) {
                                                                    break L84;
                                                                  } else {
                                                                    break L108;
                                                                  }
                                                                }
                                                              }
                                                              L109: {
                                                                if (param0 == 8250) {
                                                                  break L109;
                                                                } else {
                                                                  L110: {
                                                                    if (339 != param0) {
                                                                      break L110;
                                                                    } else {
                                                                      var2 = -100;
                                                                      if (var4 == 0) {
                                                                        break L84;
                                                                      } else {
                                                                        break L110;
                                                                      }
                                                                    }
                                                                  }
                                                                  L111: {
                                                                    if (param0 == 382) {
                                                                      break L111;
                                                                    } else {
                                                                      L112: {
                                                                        if (376 == param0) {
                                                                          break L112;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var4 == 0) {
                                                                            break L84;
                                                                          } else {
                                                                            break L112;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var4 == 0) {
                                                                        break L84;
                                                                      } else {
                                                                        break L111;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -98;
                                                                  if (var4 == 0) {
                                                                    break L84;
                                                                  } else {
                                                                    break L109;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -101;
                                                              if (var4 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L107;
                                                              }
                                                            }
                                                          }
                                                          var2 = -103;
                                                          if (var4 == 0) {
                                                            break L84;
                                                          } else {
                                                            break L102;
                                                          }
                                                        }
                                                      }
                                                      var2 = -108;
                                                      if (var4 == 0) {
                                                        break L84;
                                                      } else {
                                                        break L101;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var4 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L99;
                                                  }
                                                }
                                              }
                                              var2 = -111;
                                              if (var4 == 0) {
                                                break L84;
                                              } else {
                                                break L98;
                                              }
                                            }
                                          }
                                          var2 = -114;
                                          if (var4 == 0) {
                                            break L84;
                                          } else {
                                            break L97;
                                          }
                                        }
                                      }
                                      var2 = -116;
                                      if (var4 == 0) {
                                        break L84;
                                      } else {
                                        break L93;
                                      }
                                    }
                                  }
                                  var2 = -120;
                                  if (var4 == 0) {
                                    break L84;
                                  } else {
                                    break L92;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var4 == 0) {
                                break L84;
                              } else {
                                break L90;
                              }
                            }
                          }
                          var2 = -123;
                          if (var4 == 0) {
                            break L84;
                          } else {
                            break L89;
                          }
                        }
                      }
                      var2 = -124;
                      if (var4 == 0) {
                        break L84;
                      } else {
                        break L88;
                      }
                    }
                  }
                  var2 = -125;
                  if (var4 == 0) {
                    break L84;
                  } else {
                    break L87;
                  }
                }
              }
              var2 = -126;
              break L84;
            }
            return (byte) var2;
          } else {
            L113: {
              var2 = (byte)param0;
              if (var4 == 0) {
                break L113;
              } else {
                L114: {
                  if (8364 != param0) {
                    break L114;
                  } else {
                    var2 = -128;
                    break L114;
                  }
                }
                L115: {
                  if (param0 == 8218) {
                    break L115;
                  } else {
                    L116: {
                      if (param0 == 402) {
                        break L116;
                      } else {
                        L117: {
                          if (8222 == param0) {
                            break L117;
                          } else {
                            L118: {
                              if (param0 == 8230) {
                                break L118;
                              } else {
                                L119: {
                                  if (param0 != 8224) {
                                    break L119;
                                  } else {
                                    var2 = -122;
                                    if (var4 == 0) {
                                      break L113;
                                    } else {
                                      break L119;
                                    }
                                  }
                                }
                                L120: {
                                  if (param0 == 8225) {
                                    break L120;
                                  } else {
                                    L121: {
                                      if (param0 == 710) {
                                        break L121;
                                      } else {
                                        L122: {
                                          if (param0 != 8240) {
                                            break L122;
                                          } else {
                                            var2 = -119;
                                            if (var4 == 0) {
                                              break L113;
                                            } else {
                                              break L122;
                                            }
                                          }
                                        }
                                        L123: {
                                          if (param0 != 352) {
                                            break L123;
                                          } else {
                                            var2 = -118;
                                            if (var4 == 0) {
                                              break L113;
                                            } else {
                                              break L123;
                                            }
                                          }
                                        }
                                        L124: {
                                          if (param0 != 8249) {
                                            break L124;
                                          } else {
                                            var2 = -117;
                                            if (var4 == 0) {
                                              break L113;
                                            } else {
                                              break L124;
                                            }
                                          }
                                        }
                                        L125: {
                                          if (338 == param0) {
                                            break L125;
                                          } else {
                                            L126: {
                                              if (param0 == 381) {
                                                break L126;
                                              } else {
                                                L127: {
                                                  if (param0 == 8216) {
                                                    break L127;
                                                  } else {
                                                    L128: {
                                                      if (8217 != param0) {
                                                        break L128;
                                                      } else {
                                                        var2 = -110;
                                                        if (var4 == 0) {
                                                          break L113;
                                                        } else {
                                                          break L128;
                                                        }
                                                      }
                                                    }
                                                    L129: {
                                                      if (param0 == 8220) {
                                                        break L129;
                                                      } else {
                                                        L130: {
                                                          if (8221 == param0) {
                                                            break L130;
                                                          } else {
                                                            L131: {
                                                              if (param0 != 8226) {
                                                                break L131;
                                                              } else {
                                                                var2 = -107;
                                                                if (var4 == 0) {
                                                                  break L113;
                                                                } else {
                                                                  break L131;
                                                                }
                                                              }
                                                            }
                                                            L132: {
                                                              if (param0 != 8211) {
                                                                break L132;
                                                              } else {
                                                                var2 = -106;
                                                                if (var4 == 0) {
                                                                  break L113;
                                                                } else {
                                                                  break L132;
                                                                }
                                                              }
                                                            }
                                                            L133: {
                                                              if (param0 != 8212) {
                                                                break L133;
                                                              } else {
                                                                var2 = -105;
                                                                if (var4 == 0) {
                                                                  break L113;
                                                                } else {
                                                                  break L133;
                                                                }
                                                              }
                                                            }
                                                            L134: {
                                                              if (param0 != 732) {
                                                                break L134;
                                                              } else {
                                                                var2 = -104;
                                                                if (var4 == 0) {
                                                                  break L113;
                                                                } else {
                                                                  break L134;
                                                                }
                                                              }
                                                            }
                                                            L135: {
                                                              if (param0 == 8482) {
                                                                break L135;
                                                              } else {
                                                                L136: {
                                                                  if (353 != param0) {
                                                                    break L136;
                                                                  } else {
                                                                    var2 = -102;
                                                                    if (var4 == 0) {
                                                                      break L113;
                                                                    } else {
                                                                      break L136;
                                                                    }
                                                                  }
                                                                }
                                                                L137: {
                                                                  if (param0 == 8250) {
                                                                    break L137;
                                                                  } else {
                                                                    L138: {
                                                                      if (339 != param0) {
                                                                        break L138;
                                                                      } else {
                                                                        var2 = -100;
                                                                        if (var4 == 0) {
                                                                          break L113;
                                                                        } else {
                                                                          break L138;
                                                                        }
                                                                      }
                                                                    }
                                                                    L139: {
                                                                      if (param0 == 382) {
                                                                        break L139;
                                                                      } else {
                                                                        L140: {
                                                                          if (376 == param0) {
                                                                            break L140;
                                                                          } else {
                                                                            var2 = 63;
                                                                            if (var4 == 0) {
                                                                              break L113;
                                                                            } else {
                                                                              break L140;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = -97;
                                                                        if (var4 == 0) {
                                                                          break L113;
                                                                        } else {
                                                                          break L139;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -98;
                                                                    if (var4 == 0) {
                                                                      break L113;
                                                                    } else {
                                                                      break L137;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -101;
                                                                if (var4 == 0) {
                                                                  break L113;
                                                                } else {
                                                                  break L135;
                                                                }
                                                              }
                                                            }
                                                            var2 = -103;
                                                            if (var4 == 0) {
                                                              break L113;
                                                            } else {
                                                              break L130;
                                                            }
                                                          }
                                                        }
                                                        var2 = -108;
                                                        if (var4 == 0) {
                                                          break L113;
                                                        } else {
                                                          break L129;
                                                        }
                                                      }
                                                    }
                                                    var2 = -109;
                                                    if (var4 == 0) {
                                                      break L113;
                                                    } else {
                                                      break L127;
                                                    }
                                                  }
                                                }
                                                var2 = -111;
                                                if (var4 == 0) {
                                                  break L113;
                                                } else {
                                                  break L126;
                                                }
                                              }
                                            }
                                            var2 = -114;
                                            if (var4 == 0) {
                                              break L113;
                                            } else {
                                              break L125;
                                            }
                                          }
                                        }
                                        var2 = -116;
                                        if (var4 == 0) {
                                          break L113;
                                        } else {
                                          break L121;
                                        }
                                      }
                                    }
                                    var2 = -120;
                                    if (var4 == 0) {
                                      break L113;
                                    } else {
                                      break L120;
                                    }
                                  }
                                }
                                var2 = -121;
                                if (var4 == 0) {
                                  break L113;
                                } else {
                                  break L118;
                                }
                              }
                            }
                            var2 = -123;
                            if (var4 == 0) {
                              break L113;
                            } else {
                              break L117;
                            }
                          }
                        }
                        var2 = -124;
                        if (var4 == 0) {
                          break L113;
                        } else {
                          break L116;
                        }
                      }
                    }
                    var2 = -125;
                    if (var4 == 0) {
                      break L113;
                    } else {
                      break L115;
                    }
                  }
                }
                var2 = -126;
                break L113;
              }
            }
            return (byte) var2;
          }
        }
    }

    public static void b(boolean param0) {
        byte discarded$2 = 0;
        field_N = null;
        field_M = null;
        field_P = (int[][]) null;
        if (!param0) {
          discarded$2 = kw.a('￣', -69);
          field_Q = null;
          return;
        } else {
          field_Q = null;
          return;
        }
    }

    static {
        field_P = new int[][]{new int[]{1000, 1300, 700, 1150, 850}, new int[]{1200, 800, 1000}, new int[]{1000}};
        field_M = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_Q = "Concluded";
        field_N = "InstructionS";
    }
}
